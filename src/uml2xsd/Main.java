/**
 * Copyright (c) 2013, 2015 Denis Nikiforov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Denis Nikiforov - initial API and implementation
 */
package uml2xsd;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter.WriteableOutputStream;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.eclipse.ocl.pivot.uml.UMLStandaloneSetup;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
import org.emftext.language.java.JavaPackage;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.resource.JaMoPPUtil;
import org.emftext.language.xpath2.XPath2Package;
import org.w3._1999.xsl.transform.TransformType;
import org.w3._1999.xsl.transform.XSLT20Package;
import org.w3._2001.xml.schema.DocumentRoot;
import org.w3._2001.xml.schema.SchemaType;
import org.w3._2001.xml.schema.XMLSchema11Package;
import org.w3._2007.xml.schema.versioning.XMLSchemaVersioningPackage;

import com.google.common.io.Files;

import iso20022.validation.result.ValidationResultPackage;

public class Main {

    public enum ModelKind { EAEU, ISO20022_ECORE, ISO20022_UML };
    public enum OutputFormat { XSD11, XSLT20, ISO20022_UML, JAVA };
    
    private static String input;
    private static String output;
    private static OutputFormat outputFormat;

    public static void main(String[] args) {
        final String iso20022validationStylysheet = "iso20022-validation.xsl";
        final String iso20022validationStylysheetForHTML = "iso20022-validation-html.xsl";
        final ModelKind modelKind;
        
        parseCommandLineArgs(args);

        File outputFolder = new File(output);
        if (outputFolder.exists()) {
            if (!outputFolder.isDirectory()) {
                throw new IllegalArgumentException("Output must be a folder");
            }
        }
        else {
            outputFolder.mkdirs();
        }

        ResourceSet rs = new ResourceSetImpl();
        init(rs);

        try {
            System.out.println("Loading UML model " + input);
            Resource resource = rs.getResource(createFileURI(input), true);
            Model uml = (Model)EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.eINSTANCE.getModel());

            if (uml.getAppliedProfile("EECProfile") != null) {
                System.out.println("EAEU model found");
                modelKind = ModelKind.EAEU;
            }
            else if (uml.getAppliedProfile("ISO20022Profile") != null) {
                System.out.println("ISO20022 model found");
                modelKind = ModelKind.ISO20022_UML;
            }
            else {
                throw new IllegalArgumentException("Unknown model profile. Only EAEU and ISO20022 are supported");
            }

            // TODO: There is a very strange bug. If one will remove the following lines,
            // OCL will not resolve some properties during transformation.
            try {
                for (PackageableElement el : uml.getPackagedElements()) {
                    if (el instanceof Classifier) {
                        for (Constraint rule : ((Classifier)el).getOwnedRules()) {
                            UtilitiesLibrary.toExpressionInOCL(rule);
                        }
                    }
                }
            }
            catch (Exception e) {
                e.printStackTrace();
                return;
            }

            final String transform = getTransformation(modelKind, outputFormat);
            System.out.println("Transforming model by " + transform);
            List<EObject> schemas = transformModel(rs, createFileURI(transform), uml);

//            int i = 1;
            for (EObject obj : schemas) {
                if (obj instanceof DocumentRoot) {
                    DocumentRoot root = (DocumentRoot)obj;
                    SchemaType schema = root.getSchema();
                    if (schema != null) {
                        String schemaLocation = output + File.separator + getSchemaLocation(schema.getTargetNamespace(), modelKind, outputFormat);
                        System.out.println("Saving XML Schema into " + schemaLocation);
                        saveModel(rs, root, createFileURI(schemaLocation));
                    }
                }
                else if (obj instanceof org.w3._1999.xsl.transform.DocumentRoot) {
                    org.w3._1999.xsl.transform.DocumentRoot root = (org.w3._1999.xsl.transform.DocumentRoot)obj;
                    TransformType schema = root.getStylesheet();
                    if (schema != null) {
                        String schemaLocation = output + File.separator + schema.getId() + ".xsl";
                        System.out.println("Saving XSL Transformation into " + schemaLocation);
                        saveModel(rs, root, createFileURI(schemaLocation));
                    }
                }
                else if (obj instanceof CompilationUnit) {
                    CompilationUnit root = (CompilationUnit)obj;
                    String schemaLocation = output + File.separator + root.getName() + ".java";
                    System.out.println("Saving Java-file into " + schemaLocation);
                    saveModel(rs, root, createFileURI(schemaLocation), false);
                }
                // For debug purposes
//                else {
//                    String schemaLocation = output + File.separator + "result" + i + ".xmi";
//                    System.out.println("Saving result model into " + schemaLocation + " (root: " + obj + ")");
//                    saveModel(rs, obj, createFileURI(schemaLocation));
//                    i++;
//                }
            }

            if (modelKind == ModelKind.ISO20022_UML && outputFormat == OutputFormat.XSLT20) {
                Files.copy(new File("xslt/" + iso20022validationStylysheet), new File(output + '/' + iso20022validationStylysheet));
                Files.copy(new File("xslt/" + iso20022validationStylysheetForHTML), new File(output + '/' + iso20022validationStylysheetForHTML));
            }

            System.out.println("Done!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void parseCommandLineArgs(String[] args) {
        Option in = OptionBuilder.withArgName("file")
                .hasArg()
                .isRequired()
                .create("input");
        Option out = OptionBuilder.withArgName("folder")
                .hasArg()
                .isRequired()
                .create("output");
        Option formatOpt = OptionBuilder.withArgName("outputFormat")
                .hasArg()
                .isRequired()
                .create("format");

        Options options = new Options();
        options.addOption(in);
        options.addOption(out);
        options.addOption(formatOpt);
        
        try {
            parseCommandLineArgsImpl(options, args);
        }
        catch (IllegalArgumentException e) {
            HelpFormatter formatter = new HelpFormatter();
            formatter.printHelp("uml2xsd", options);
        }
    }
    
    private static void parseCommandLineArgsImpl(Options options, String[] args) {
        CommandLineParser parser = new GnuParser();
        try {
            CommandLine line = parser.parse(options, args);
            input = line.getOptionValue("input");
            output = line.getOptionValue("output");
            String format = line.getOptionValue("format");
            switch (format) {
            case "xsd":
                outputFormat = OutputFormat.XSD11;
                break;
            case "xslt":
                outputFormat = OutputFormat.XSLT20;
                break;
            case "uml":
                outputFormat = OutputFormat.ISO20022_UML;
                break;
            case "java":
                outputFormat = OutputFormat.JAVA;
                break;
            default:
                throw new IllegalArgumentException("Wrong command-line arguments: format must have one of the following values: xsd, xslt, uml, java. Specified value is " + format);
            }
        }
        catch(ParseException e) {
            throw new IllegalArgumentException("Wrong command-line arguments: " + e.getMessage());
        }
    }
    
    private static void init(ResourceSet rs) {
        System.out.println("Initialization");
        rs.setURIConverter(new CustomURIConverter());

        System.out.println("  UML");
        UMLResourcesUtil.init(rs);
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", XMI2UMLResource.Factory.INSTANCE);
        JaMoPPUtil.initialize();
        
        System.out.println("  OCL");
        EssentialOCLStandaloneSetup.doSetup();
        UMLStandaloneSetup.init();
        
        System.out.println("  Ecore packages");
        XPath2Package.eINSTANCE.getEFactoryInstance();
        XMLSchema11Package.eINSTANCE.getEFactoryInstance();
        XMLSchemaVersioningPackage.eINSTANCE.getEFactoryInstance();
        XSLT20Package.eINSTANCE.getEFactoryInstance();
        ValidationResultPackage.eINSTANCE.getEFactoryInstance();
        JavaPackage.eINSTANCE.getEFactoryInstance();
        //XHTML11Package.eINSTANCE.getEFactoryInstance();

        System.out.println("  Blackbox units");
        TransformationExecutor.BlackboxRegistry.INSTANCE.registerModules(UtilitiesLibrary.class);
    }
    
    /*
    private static boolean validateModel(EObject uml) throws ParserException {
        PivotEnvironmentFactory envFactory = new PivotEnvironmentFactory();
        PivotEnvironment environment = envFactory.createEnvironment();
        OCL ocl = OCL.newInstance(environment);
        OCLHelper oclHelper = ocl.createOCLHelper();
        
        boolean noErrorsFound = true;

        final TreeIterator<EObject> iterator = uml.eAllContents();
        DoubleHashMap<Stereotype, EClass, List<ExpressionInOCL>> rulesCache = new DoubleHashMap<Stereotype, EClass, List<ExpressionInOCL>>();
        while (iterator.hasNext()) {
            EObject obj = iterator.next();
            if (obj instanceof org.eclipse.uml2.uml.NamedElement) {
                org.eclipse.uml2.uml.NamedElement element = (org.eclipse.uml2.uml.NamedElement)obj;
                EClass eClass = element.eClass();
                for (Stereotype stereotype : element.getAppliedStereotypes()) {
                    List<ExpressionInOCL> rules = rulesCache.get(stereotype, eClass);
                    if (rules == null) {
                        rules = new ArrayList<ExpressionInOCL>();
                        for (org.eclipse.uml2.uml.Constraint constraint : stereotype.getOwnedRules()) {
                            oclHelper.setContext(eClass);
                            ExpressionInOCL expr = oclHelper.createQuery(
                                    getOCLExpressionFromConstraint(constraint));
                            expr.setName(constraint.getName());
                            for (org.eclipse.uml2.uml.Comment comment : constraint.getOwnedComments()) {
                                Comment pivotComment = PivotFactory.eINSTANCE.createComment();
                                pivotComment.setBody(comment.getBody());
                                expr.getOwnedComments().add(pivotComment);
                            }
                            rules.add(expr);
                        }
                        rulesCache.put(stereotype, eClass, rules);
                    }
                    for (ExpressionInOCL rule : rules) {
                        if (!ocl.check(element, rule)) {
                            noErrorsFound = false;
                            System.out.println("  Error " + rule.getName() + " at " + element.getQualifiedName());
                            if (!rule.getOwnedComments().isEmpty()) {
                                System.out.println("  " + rule.getOwnedComments().get(0).getBody());
                            }
                            System.out.println();
                        }
//                        Object q = ocl.evaluate(element, rule);
//                        if (!(q instanceof Boolean) || !(Boolean)q) {
//                            System.out.println("  Error " + rule.getName() + " at " + element.getQualifiedName());
//                            System.out.println(q);
//                            System.out.println();
//                        }
                    }
                }
            }
        }
        return noErrorsFound;
    }
*/
    private static URI createFileURI(String relativePath)
    {
        return URI.createFileURI(new File(relativePath).getAbsolutePath());
    }

    private static String getTransformation(ModelKind modelKind, OutputFormat outputFormat)
    {
        switch (modelKind) {
        case EAEU:
            if (outputFormat == OutputFormat.XSD11) {
                return "transforms/EAEUtoXSD11.qvto";
            }
            break;
        case ISO20022_UML:
            if (outputFormat == OutputFormat.XSD11) {
                return "transforms/ISO20022toXSD11.qvto";
            }
            else if (outputFormat == OutputFormat.XSLT20) {
                return "transforms/ISO20022toXSLT20.qvto";
            }
            else if (outputFormat == OutputFormat.JAVA) {
                return "transforms/ISO20022toJava.qvto";
            }
        case ISO20022_ECORE:
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    private static String getSchemaLocation(String targetNamespace, ModelKind modelKind, OutputFormat outputFormat)
    {
        switch (modelKind) {
        case EAEU:
            if (outputFormat == OutputFormat.XSD11) {
                return targetNamespace.replaceFirst("^urn:", "").replace(':', '_') + ".xsd";
            }
        case ISO20022_UML:
            if (outputFormat == OutputFormat.XSD11) {
                return targetNamespace.replaceFirst("^urn:iso:std:iso:20022:tech:xsd:", "") + ".xsd";
            }
        case ISO20022_ECORE:
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    private static void saveModel(ResourceSet rs, EObject model, URI fileName) throws IOException
    {
        saveModel(rs, model, fileName, true);
    }

    private static void saveModel(ResourceSet rs, EObject model, URI fileName, boolean isXML) throws IOException
    {
        StringWriter writer = new StringWriter();
        WriteableOutputStream stream = new WriteableOutputStream(writer, "UTF-8");
        Resource res = rs.createResource(fileName);
        res.getContents().add(model);
        Map<Object, Object> options = new HashMap<Object, Object>();
        if (isXML) {
            options.put(XMLResource.OPTION_ENCODING, "UTF-8");
            options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
        }
        res.save(stream, options);
        res.unload();

        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream(fileName.path()),
                Charset.forName("UTF-8").newEncoder());
        if (isXML) {
            osw.write(prettyFormat(writer.toString()));
        }
        else {
            osw.write(writer.toString());
        }
        osw.flush();
        osw.close();
    }

    private static List<EObject> transformModel(ResourceSet rs, URI transformation, EObject model) throws Exception
    {
        TransformationExecutor executor = new TransformationExecutor(transformation);
        ExecutionContextImpl context = new ExecutionContextImpl();
        context.setConfigProperty("keepModeling", true);
        context.setLog(new WriterLog(new OutputStreamWriter(System.out)));
        EList<EObject> uml = new BasicEList<EObject>();
        uml.add(model);
        ModelExtent input = new BasicModelExtent(uml);
        ModelExtent output = new BasicModelExtent();
        ExecutionDiagnostic result = executor.execute(context, input, output);
        if(result.getSeverity() == Diagnostic.OK) {
            return output.getContents();
        } else {
            IStatus status = BasicDiagnostic.toIStatus(result);
            for (IStatus error : status.getChildren()) {
                System.out.println("  " + error);
            }
            throw new Exception(status.getMessage());
        }
    }

    // TODO: xmi namespace must be removed from the document
    private static String prettyFormat(String input, int indent) {
        try {
            Source xmlInput = new StreamSource(new StringReader(input));
            StringWriter stringWriter = new StringWriter();
            StreamResult xmlOutput = new StreamResult(stringWriter);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            transformerFactory.setAttribute("indent-number", indent);
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(xmlInput, xmlOutput);
            return xmlOutput.getWriter().toString();
        } catch (Exception e) {
            throw new RuntimeException(e); // simple exception handling, please review it
        }
    }

    private static String prettyFormat(String input) {
        return prettyFormat(input, 2);
    }
}
