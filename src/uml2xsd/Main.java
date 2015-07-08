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
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
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
import org.eclipse.ocl.pivot.PivotFactory;
import org.eclipse.ocl.pivot.uml.UMLStandaloneSetup;
import org.eclipse.ocl.pivot.utilities.MetamodelManager;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.XMI2UMLResource;
import org.eclipse.uml2.uml.resources.util.UMLResourcesUtil;
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

    public enum ModelKind { EAEU, ISO20022 };
    public enum OutputFormat { XSD11, XSLT20 };
    
    public static void main(String[] args) {
        //final String input = "model/TTDataModel.uml";
        final String input = "model/ISO20022_BusinessProcessCatalogue.uml";
        final String output = "output/";
        final OutputFormat outputFormat = OutputFormat.XSLT20;
        //final OutputFormat outputFormat = OutputFormat.XSD11;
        final String iso20022validationStylysheet = "iso20022-validation.xsl";
        final ModelKind modelKind;

        System.out.println("Initialization");
        ResourceSet rs = new ResourceSetImpl();
        rs.setURIConverter(new CustomURIConverter());

        System.out.println("  UML");
        UMLResourcesUtil.init(rs);
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", XMI2UMLResource.Factory.INSTANCE);
        
        System.out.println("  OCL");
        EssentialOCLStandaloneSetup.doSetup();
        UMLStandaloneSetup.init();
        
        System.out.println("  Ecore packages");
        XPath2Package.eINSTANCE.getEFactoryInstance();
        XMLSchema11Package.eINSTANCE.getEFactoryInstance();
        XMLSchemaVersioningPackage.eINSTANCE.getEFactoryInstance();
        XSLT20Package.eINSTANCE.getEFactoryInstance();
        ValidationResultPackage.eINSTANCE.getEFactoryInstance();
        //XHTML11Package.eINSTANCE.getEFactoryInstance();

        try {
            System.out.println("Registering blackbox units");
            TransformationExecutor.BlackboxRegistry.INSTANCE.registerModules(UtilitiesLibrary.class);

            System.out.println("Loading UML model " + input);
            
            Resource resource = rs.getResource(createFileURI(input), true);
            Model uml = (Model)EcoreUtil.getObjectByType(resource.getContents(), UMLPackage.eINSTANCE.getModel());
            
            if (uml.getAppliedProfile("EECProfile") != null) {
                System.out.println("EAEU model found");
                modelKind = ModelKind.EAEU;
            }
            else if (uml.getAppliedProfile("ISO20022Profile") != null) {
                System.out.println("ISO20022 model found");
                modelKind = ModelKind.ISO20022;
            }
            else {
                throw new IllegalArgumentException("Unknown model profile. Only EAEU and ISO20022 are supported");
            }

            System.out.println("Adding data type operations");
            addDataTypeOperations(rs, uml);

            final String transform = getTransformation(modelKind, outputFormat);
            System.out.println("Transforming model by " + transform);
            List<EObject> schemas = transformModel(rs, createFileURI(transform), uml);

            for (EObject obj : schemas) {
                if (obj instanceof DocumentRoot) {
                    DocumentRoot root = (DocumentRoot)obj;
                    SchemaType schema = root.getSchema();
                    if (schema != null) {
                        String schemaLocation = output + getSchemaLocation(schema.getTargetNamespace(), modelKind, outputFormat);
                        System.out.println("Saving XML Schema into " + schemaLocation);
                        saveModel(rs, root, createFileURI(schemaLocation));
                    }
                }
                else if (obj instanceof org.w3._1999.xsl.transform.DocumentRoot) {
                    org.w3._1999.xsl.transform.DocumentRoot root = (org.w3._1999.xsl.transform.DocumentRoot)obj;
                    TransformType schema = root.getStylesheet();
                    if (schema != null) {
                        String schemaLocation = output + getSchemaLocation(schema.getXpathDefaultNamespace(), modelKind, outputFormat);
                        System.out.println("Saving XSL Transformation into " + schemaLocation);
                        saveModel(rs, root, createFileURI(schemaLocation));
                    }
                }
                // For debug purposes
//                else {
//                    String schemaLocation = output + "result" + i + ".xmi";
//                    System.out.println("Saving result model into " + schemaLocation);
//                    saveModel(rs, obj, createFileURI(schemaLocation));
//                    i++;
//                }
            }
            
            if (modelKind == ModelKind.ISO20022 && outputFormat == OutputFormat.XSLT20) {
                Files.copy(new File("xslt/" + iso20022validationStylysheet), new File(output + '/' + iso20022validationStylysheet));
            }

            System.out.println("Done!");
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        case ISO20022:
            if (outputFormat == OutputFormat.XSD11) {
                return "transforms/ISO20022toXSD11.qvto";
            }
            else if (outputFormat == OutputFormat.XSLT20) {
                return "transforms/ISO20022toXSLT20.qvto";
            }
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
        case ISO20022:
            String name = targetNamespace.replaceFirst("^urn:iso:std:iso:20022:tech:xsd:", "");
            if (outputFormat == OutputFormat.XSD11) {
                return name + ".xsd";
            }
            else if (outputFormat == OutputFormat.XSLT20) {
                return name + ".xsl";
            }
        }
        throw new IllegalArgumentException();
    }

    private static void saveModel(ResourceSet rs, EObject model, URI fileName) throws IOException
    {
        StringWriter writer = new StringWriter();
        WriteableOutputStream stream = new WriteableOutputStream(writer, "UTF-8");
        Resource res = rs.createResource(fileName);
        res.getContents().add(model);
        Map<Object, Object> options = new HashMap<Object, Object>();
        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
        res.save(stream, options);
        res.unload();

        OutputStreamWriter osw = new OutputStreamWriter(
                new FileOutputStream(fileName.path()),
                Charset.forName("UTF-8").newEncoder());
        osw.write(prettyFormat(writer.toString()));
        osw.flush();
        osw.close();
    }

    private static void addDataTypeOperations(ResourceSet rs, Model model) throws ParserException
    {
        // TODO: Recursive search is needed
        Set<Model> models = new HashSet<Model>();
        models.add(model);
        final TreeIterator<EObject> modelIterator = model.eAllContents();
        while (modelIterator.hasNext()) {
            EObject obj = modelIterator.next();
            if (obj instanceof PackageImport) {
                PackageImport packageImport = (PackageImport)obj;
                models.add(packageImport.getImportedPackage().getModel());
            }
        }

        Set<DataType> dataTypes = new HashSet<DataType>();
        System.out.println("  Models:");
        for (Model m : models) {
            System.out.println("    " + m.getName());
            final TreeIterator<EObject> iterator = m.eAllContents();
            while (iterator.hasNext()) {
                EObject obj = iterator.next();
                if (obj instanceof DataType) {
                    DataType dataType = (DataType)obj;
                    dataTypes.add(dataType);
                    for (Classifier general : dataType.allParents()) {
                        dataTypes.add((DataType)general);
                    }
                }
            }
        }

        MetamodelManager mm = UtilitiesLibrary.ocl.getMetamodelManager();
        System.out.println("  Operations:");
        for (DataType dataType : dataTypes) {
            // DataTypes doesn't inherit operations. So we add operations to each inherited DataType
            for (Operation oper : dataType.getAllOperations()) {
                org.eclipse.ocl.pivot.Operation asOper = createOperation(mm, dataType, oper);
                System.out.println("    " + asOper);
            }
        }
    }

    private static org.eclipse.ocl.pivot.Operation createOperation(MetamodelManager mm, DataType dataType, Operation operation) throws ParserException
    {
        org.eclipse.ocl.pivot.DataType asDataType = mm.getASOf(org.eclipse.ocl.pivot.DataType.class, dataType);
        org.eclipse.ocl.pivot.Operation asOperation = PivotFactory.eINSTANCE.createOperation();
        asOperation.setName(operation.getName());
        org.eclipse.ocl.pivot.Type returnType = mm.getASOf(org.eclipse.ocl.pivot.Type.class, operation.getType());
        asOperation.setType(returnType);
        for (Parameter param : operation.getOwnedParameters()) {
            if (param.getDirection() == ParameterDirectionKind.RETURN_LITERAL) {
                continue;
            }
            org.eclipse.ocl.pivot.Parameter asParam = PivotFactory.eINSTANCE.createParameter();
            org.eclipse.ocl.pivot.Type asParamType = mm.getASOf(org.eclipse.ocl.pivot.Type.class, param.getType());
            asParam.setType(asParamType);
            asOperation.getOwnedParameters().add(asParam);
        }
        asDataType.getOwnedOperations().add(asOperation);
        return asOperation;
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
