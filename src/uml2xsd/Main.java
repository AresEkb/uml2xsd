/**
 * Copyright (c) 2013, 2014 Denis Nikiforov.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Denis Nikiforov - initial API and implementation
 */
package uml2xsd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.core.runtime.spi.RegistryContributor;
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
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.ParserException;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.Root;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.uml.UML2Pivot;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.emftext.language.xpath2.Xpath2Package;
import org.w3._2001.xml.schema.DocumentRoot;
import org.w3._2001.xml.schema.SchemaType;
import org.w3._2001.xml.schema.XMLSchema11Package;
import org.w3._2007.xml.schema.versioning.XMLSchemaVersioningPackage;

public class Main {

    public static void main(String[] args) {
//        final String input = "model/ReferenceModel.uml";
//        final String input = "model/SMDataModel.uml";
        final String input = "model/TTDataModel.uml";
        final String transform = "transforms/UMLtoXSD11.qvto";
//        final String transform = "transforms/GetXPath.qvto";
        final String output = "output/";

        System.out.println("Initialization");
        ResourceSet rs = new ResourceSetImpl();
        rs.setURIConverter(new CustomURIConverter());

        System.out.println("  OCL");
        org.eclipse.ocl.examples.pivot.OCL.initialize(rs);
        org.eclipse.ocl.examples.pivot.uml.UML2Pivot.initialize(rs);
        org.eclipse.ocl.examples.pivot.model.OCLstdlib.install();
        org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain.initialize(rs);
        org.eclipse.ocl.examples.xtext.completeocl.CompleteOCLStandaloneSetup.doSetup();
        org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup.doSetup();
        org.eclipse.ocl.examples.xtext.oclstdlib.OCLstdlibStandaloneSetup.doSetup();
        org.eclipse.ocl.examples.domain.utilities.StandaloneProjectMap.getAdapter(rs);

        System.out.println("  Ecore packages");
        Xpath2Package.eINSTANCE.getEFactoryInstance();
        XMLSchema11Package.eINSTANCE.getEFactoryInstance();
        XMLSchemaVersioningPackage.eINSTANCE.getEFactoryInstance();

        try {
            System.out.println("Registering blackbox units");
            registerBlackboxUnits();

            System.out.println("Loading UML model " + input);
            Resource resource = rs.getResource(createFileURI(input), true);
            EObject uml = resource.getContents().get(0);
            MetaModelManager mm = PivotUtil.getMetaModelManager(resource);

            System.out.println("Adding data type operations");
            addDataTypeOperations(rs, mm, uml);

            System.out.println("Transforming model by " + transform);
            List<EObject> schemas = transformModel(rs, createFileURI(transform), uml);

//            int i = 0;
            for (EObject obj : schemas) {
                if (obj instanceof DocumentRoot) {
                    DocumentRoot root = (DocumentRoot)obj;
                    SchemaType schema = root.getSchema();
                    if (schema != null) {
                        String schemaLocation = output + getSchemaLocation(schema.getTargetNamespace());
                        System.out.println("Saving XML Schema into " + schemaLocation);
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

            System.out.println("Done!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static URI createFileURI(String relativePath)
    {
        return URI.createURI(relativePath).resolve(URI.createFileURI(System.getProperty("user.dir") + "/"));
    }

    private static String getSchemaLocation(String targetNamespace)
    {
        return targetNamespace.replaceFirst("^urn:", "").replace(':', '_') + ".xsd";
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
        //        Resource res = rs.createResource(fileName);
        //        res.getContents().add(model);
        //        Map<Object, Object> options = new HashMap<Object, Object>();
        //        options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        //        options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
        //        res.save(options);
        //        res.unload();
    }

    private static void registerBlackboxUnits() throws FileNotFoundException,
    ClassNotFoundException, InstantiationException, IllegalArgumentException,
    IllegalAccessException, NoSuchMethodException, NoSuchFieldException,
    SecurityException, InvocationTargetException
    {
        IExtensionRegistry ecliseRegistry = RegistryFactory.createRegistry(null, null, null);
        FileInputStream is = new FileInputStream("plugin.xml");
        RegistryContributor contributor = new RegistryContributor("1", "test", null, null);
        ecliseRegistry.addContribution(is, contributor, false, null, null, null);

        for (IExtension ext : ecliseRegistry.getExtensions(contributor)) {
            if (ext.getExtensionPointUniqueIdentifier().equals("org.eclipse.m2m.qvt.oml.javaBlackboxUnits")) {
                for (IConfigurationElement config : ext.getConfigurationElements()) {
                    // JavaBlackboxProvider jbp = new JavaBlackboxProvider();
                    Class<?> providerClass = Class.forName("org.eclipse.m2m.internal.qvt.oml.blackbox.java.JavaBlackboxProvider");
                    Object jbp = providerClass.newInstance();

                    // JavaBlackboxProvider.Descriptor descriptor = jbp.createDescriptor(unit);
                    Method createDescriptor = providerClass.getDeclaredMethod("createDescriptor", IConfigurationElement.class);
                    createDescriptor.setAccessible(true);
                    Object descriptor = createDescriptor.invoke(jbp, config);

                    // String qualifiedName = descriptor.getQualifiedName();
                    Method getQualifiedNameMethod = descriptor.getClass().getMethod("getQualifiedName");
                    String qualifiedName = (String)getQualifiedNameMethod.invoke(descriptor);
                    System.out.println("  Found " + qualifiedName);

                    // jbp.fDescriptorMap = new HashMap<?,?>();
                    Field fDescriptorMapField = providerClass.getDeclaredField("fDescriptorMap");
                    fDescriptorMapField.setAccessible(true);
                    fDescriptorMapField.set(jbp, HashMap.class.newInstance());

                    // jbp.fDescriptorMap.put(id, descriptor);
                    Object fDescriptorMap = fDescriptorMapField.get(jbp);
                    Method putMethod = fDescriptorMapField.getType().getDeclaredMethod("put", Object.class, Object.class);
                    putMethod.invoke(fDescriptorMap, qualifiedName, descriptor);

                    // BlackboxRegistry.INSTANCE.fProviders = new LinkedList<?>()
                    Class<?> registryClass = Class.forName("org.eclipse.m2m.internal.qvt.oml.blackbox.BlackboxRegistry");
                    Field registryInstanceField = registryClass.getDeclaredField("INSTANCE");
                    Object registryInstance = registryInstanceField.get(null);
                    Field fProvidersField = registryClass.getDeclaredField("fProviders");
                    fProvidersField.setAccessible(true);
                    fProvidersField.set(registryInstance, LinkedList.class.newInstance());

                    // BlackboxRegistry.INSTANCE.fProviders.add(jbp);
                    Object fProviders = fProvidersField.get(registryInstance);
                    Method addMethod = fProvidersField.getType().getDeclaredMethod("add", Object.class);
                    addMethod.invoke(fProviders, jbp);
                }
            }
        }
    }

    private static void addDataTypeOperations(ResourceSet rs, MetaModelManager mm, EObject model)
            throws ParserException, IOException {
        // TODO: All needed DataType operations must be registered here
        Root bdt = UML2Pivot.importFromUML(mm, null, model.eResource());
        final TreeIterator<EObject> iterator = bdt.eAllContents();
        while (iterator.hasNext()) {
            EObject obj = iterator.next();
            //System.out.println("  >>>>>>>>>> " + obj);
            if (obj instanceof Type) {
                Type type = (Type)obj;
                //System.out.println("  >>>>>>>>>> " + type.getName());
                if (type.getName().equals("WeightMeasureType")) {
                    System.out.println("  >>>>>>>>>> " + type.getName());

                    System.out.println("  Found owned operations for " + type.getName() + ": " + type.getOwnedOperation().size());
                    System.out.println("  Found local operations for " + type.getName() + ": " + type.getLocalOperations().size());

                    createOperation(mm, type, "<", mm.getBooleanType(), type);
                    createOperation(mm, type, ">", mm.getBooleanType(), type);
                    createOperation(mm, type, "<", mm.getBooleanType(), mm.getRealType());
                    createOperation(mm, type, ">", mm.getBooleanType(), mm.getRealType());
                }
            }
        }
    }

    private static void createOperation(MetaModelManager metaModelManager, Type type,
            String name, Type returnType, Type param1Type) {
        Operation compareTo = PivotFactory.eINSTANCE.createOperation();
        compareTo.setName(name);
        compareTo.setType(returnType);
        Parameter param = PivotFactory.eINSTANCE.createParameter();
        param.setType(param1Type);
        compareTo.getOwnedParameter().add(param);
        type.getOwnedOperation().add(compareTo);
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

    //    private static String format(String xml)
    //    {
    //        try {
    //            final InputSource src = new InputSource(new StringReader(xml));
    //            final Element document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(src).getDocumentElement();
    //            final Boolean keepDeclaration = Boolean.valueOf(xml.startsWith("<?xml"));
    //
    //            //May need this: System.setProperty(DOMImplementationRegistry.PROPERTY,"com.sun.org.apache.xerces.internal.dom.DOMImplementationSourceImpl");
    //
    //            final DOMImplementationRegistry registry = DOMImplementationRegistry.newInstance();
    //            final DOMImplementationLS impl = (DOMImplementationLS) registry.getDOMImplementation("LS");
    //            final LSSerializer writer = impl.createLSSerializer();
    //
    //            writer.getDomConfig().setParameter("format-pretty-print", Boolean.TRUE);
    //            //writer.getDomConfig().setParameter("indent-number", 2);
    //            //writer.getDomConfig().setParameter("indent-amount", 2);
    //            writer.getDomConfig().setParameter("xml-declaration", keepDeclaration);
    //
    //            return writer.writeToString(document);
    //        } catch (Exception e) {
    //            throw new RuntimeException(e);
    //        }
    //    }

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
