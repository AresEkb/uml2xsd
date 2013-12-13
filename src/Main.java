import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.core.runtime.spi.RegistryContributor;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.WriterLog;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOCL;
import org.eclipse.ocl.examples.pivot.OCL;
import org.eclipse.ocl.examples.pivot.OpaqueExpression;
import org.eclipse.ocl.examples.pivot.Operation;
import org.eclipse.ocl.examples.pivot.Parameter;
import org.eclipse.ocl.examples.pivot.ParserException;
import org.eclipse.ocl.examples.pivot.PivotFactory;
import org.eclipse.ocl.examples.pivot.Root;
import org.eclipse.ocl.examples.pivot.Type;
import org.eclipse.ocl.examples.pivot.helper.OCLHelper;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.uml.UML2Pivot;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironment;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironmentFactory;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.emftext.language.xpath2.Xpath2Package;
import org.emftext.language.xpath2.resource.xpath2.mopp.Xpath2ResourceFactory;
import org.w3._2001.xml.schema.impl.SchemaPackageImpl;

public class Main {

    public static void main(String[] args) {
        //final String input = "model/OclTest.uml";
        final String input = "model2/SMDataModel.uml";
        final String oclAST = "output/parsedOcl.ecore.oclas";
        //final String transform = "transforms/OclToXpath.qvto";
        //final String transform = "transforms/Test.qvto";
        final String transform = "transforms/UmlToXsd11.qvto";
        final String xpathAST = "output/result.ecore";
        //final String output = "output/result.xpath2";
        final String output = "output/result.xsd";
        
        ResourceSet rs = new ResourceSetImpl();
        rs.setURIConverter(new CustomURIConverter());
        
        org.eclipse.ocl.examples.pivot.OCL.initialize(rs);
        org.eclipse.ocl.examples.pivot.uml.UML2Pivot.initialize(rs);
        org.eclipse.ocl.examples.pivot.model.OCLstdlib.install();
        org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain.initialize(rs);
        org.eclipse.ocl.examples.xtext.completeocl.CompleteOCLStandaloneSetup.doSetup();
        org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup.doSetup();
        org.eclipse.ocl.examples.xtext.oclstdlib.OCLstdlibStandaloneSetup.doSetup();
        org.eclipse.ocl.examples.domain.utilities.StandaloneProjectMap.getAdapter(rs);

        Xpath2Package.eINSTANCE.getEFactoryInstance();
        //Xpath2Package xpathPkg = Xpath2Package.eINSTANCE;
        //rs.getPackageRegistry().put(xpathPkg.getNsURI(), xpathPkg);

        //XSDPackage.eINSTANCE.getEFactoryInstance();
        //EPackage.Registry.INSTANCE.put("http://www.eclipse.org/xsd/2002/XSD", org.eclipse.xsd.XSDPackage.eINSTANCE);
        
        //EPackage.Registry.INSTANCE.put("http://www.eclipse.org/xsd/2002/XSD", org.eclipse.xsd.XSDPackage.eINSTANCE);
        //EPackage.Registry.INSTANCE.put("http://www.w3.org/XML/XMLSchema/v1.1", SchemaPackageImpl.eINSTANCE);
        EPackage.Registry.INSTANCE.put("http://www.eclipse.org/xsd/2002/XSD", SchemaPackageImpl.eINSTANCE);

        //BDTPackage bdtPkg = BDTPackage.eINSTANCE;
        //rs.getPackageRegistry().put(bdtPkg.getNsURI(), bdtPkg);
        //rs.getPackageRegistry().put("file:/C:/Work/workspace/OclToXPath/model2/ReferenceModel.uml", bdtPkg);

        rs.getPackageRegistry().put(GenModelPackage.eINSTANCE.getNsURI(), GenModelPackage.eINSTANCE);
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xpath2", new Xpath2ResourceFactory());
        //rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xsd", new XSDResourceFactoryImpl());
        //rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xsd", new EcoreResourceFactoryImpl());

        try {
            System.out.println("Parsing OCL rules from an input UML model " + input);
            EList<EObject> ocl = parseOcl(rs, createFileURI(input));
            System.out.println("Saving OCL AST into " + oclAST);
            saveModel(rs, ocl, createFileURI(oclAST));
            System.out.println("Transforming OCL rules by " + transform);
            List<EObject> xpath = transformModel(rs, createFileURI(transform), ocl);
            //System.out.println("Saving XPath AST into " + xpathAST);
            //saveModel(rs, xpath, createFileURI(xpathAST));
            System.out.println("Printing XPath expressions into " + output);
            saveModel(rs, xpath, createFileURI(output));
            System.out.println("Done!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static URI createFileURI(String relativePath)
    {
        return URI.createURI(relativePath).resolve(URI.createFileURI(System.getProperty("user.dir") + "/"));
    }
    
    private static void saveModel(ResourceSet rs, Collection<? extends EObject> model, URI fileName) throws IOException
    {
        //final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(rs.getPackageRegistry());
        //rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
        //rs. getSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);

        Resource res = rs.createResource(fileName);
        res.getContents().addAll(model);
        Map<Object, Object> options = new HashMap<Object, Object>();
        //options.put(XMLResource.OPTION_ENCODING, "UTF-8");
        options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
        res.save(options);
        res.unload();
    }

    private static EList<EObject> parseOcl(ResourceSet rs, URI source)
            throws ParserException, IOException {
        //String oclFile = "model2/NewOCLstdlibFile.oclstdlib";
//        String oclFile = "model2/ReferenceModel.ocl";
        Resource resource = rs.getResource(source, true);
        MetaModelManager metaModelManager = PivotUtil.getMetaModelManager(resource);
//        metaModelManager.setDefaultStandardLibraryURI(oclFile);
        PivotEnvironmentFactory envFactory = new PivotEnvironmentFactory(null, metaModelManager);
        PivotEnvironment environment = envFactory.createEnvironment();

        // ???????
        // metaModelManager.loadResource(resource, uri)

        OCL ocl = OCL.newInstance(environment);
        OCLHelper oclHelper = ocl.createOCLHelper();

//        Resource ast = ocl.parse(createFileURI(oclFile));
//        rs.getResources().add(ast);
//        //metaModelManager.getLibraries().add();
//        //ast.getAllContents().
//        Resource rules = ocl.load(createFileURI(oclFile));
//        rs.getResources().add(rules);
//
//        System.out.println(rules);
//        System.out.println(ast);
//        
//        System.out.println(metaModelManager.getLibraries().get(0));
//        Diagnostic result = ocl. getProblems();
//        if(result.getSeverity() == Diagnostic.OK) {
//            System.out.println(">>>>> Ok");
//            //return output.getContents();
//        } else {
//            IStatus status = BasicDiagnostic.toIStatus(result);
//            System.out.println(">>>>> " + status.getMessage());
//            //throw new Exception(status.getMessage());
//        }
        
//        final TreeIterator<EObject> iterator = rules.getAllContents();
//        //EList<Constraint> constraints = new BasicEList<Constraint>();
//        while (iterator.hasNext()) {
//            EObject obj = iterator.next();
//            System.out.println("  >> " + obj.getClass() + obj);
//            if (obj instanceof Type) {
//                Type type = (Type) obj;
//                Iterable<Constraint> invs = metaModelManager.getAllInvariants(type);
//                for (Constraint inv : invs) {
//                    //constraints.add(inv);
//                }
//            }
//        }
        
        //oclHelper.cre

//        EList<EObject> list = rules.getContents();
//        for (EObject item : list) {
//            System.out.println(item);
//        }
        
        EList<EObject> c = new BasicEList<EObject>();

        Root root = UML2Pivot.importFromUML(metaModelManager, null, resource);

        Resource rmRes = rs.getResource(createFileURI("model2/ReferenceModel.uml"), true);
        Root bdt = UML2Pivot.importFromUML(metaModelManager, null, rmRes);
        //System.out.println("  >>>>> " + bdt);

        final TreeIterator<EObject> iterator = bdt.eAllContents();
        while (iterator.hasNext()) {
            EObject obj = iterator.next();
            //System.out.println("  >>>>>>>>>> " + obj);
            if (obj instanceof Type) {
                Type type = (Type)obj;
                //System.out.println("  >>>>>>>>>> " + type.getName());
                if (type.getName().equals("MeasureType")) {
                    //System.out.println("  Found operations for " + type.getName() + ": " + type.getOwnedOperation().size());
                    createOperation(metaModelManager, type, "<", metaModelManager.getBooleanType(), type);
                    createOperation(metaModelManager, type, ">", metaModelManager.getBooleanType(), type);
                    createOperation(metaModelManager, type, "<", metaModelManager.getBooleanType(), metaModelManager.getRealType());
                    createOperation(metaModelManager, type, ">", metaModelManager.getBooleanType(), metaModelManager.getRealType());
//                    createOperation(metaModelManager, type, "<", metaModelManager.getBooleanType(), metaModelManager.getIntegerType());
//                    createOperation(metaModelManager, type, ">", metaModelManager.getBooleanType(), metaModelManager.getIntegerType());
//                    createOperation(metaModelManager, type, "<", metaModelManager.getBooleanType(), metaModelManager.getUnlimitedNaturalType());
//                    createOperation(metaModelManager, type, ">", metaModelManager.getBooleanType(), metaModelManager.getUnlimitedNaturalType());
                }
            }
        }
        
        //root.eResource().save(null);

        EList<Constraint> constraints = getAllConstraints(metaModelManager, root);
        for (Constraint constraint : constraints) {
            List<Element> elements = constraint.getConstrainedElement();
            for (Element element : elements) {
                if (element instanceof Type) {
                    Type type = (Type) element;
                    oclHelper.setInstanceContext(type);
                    String expression = getOCLExpressionFromConstraint(constraint);
                    System.out.println("  Found " + expression);
                    ExpressionInOCL expr = oclHelper.createInvariant(expression);
                    c.add(0, expr);
                }
            }
        }
        return c;
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

    private static EList<Constraint> getAllConstraints(MetaModelManager metaModelManager, Root root) {
        final TreeIterator<EObject> iterator = root.eAllContents();
        EList<Constraint> constraints = new BasicEList<Constraint>();
        while (iterator.hasNext()) {
            EObject obj = iterator.next();
            if (obj instanceof Type) {
                Type type = (Type) obj;
                Iterable<Constraint> invs = metaModelManager.getAllInvariants(type);
                for (Constraint inv : invs) {
                    constraints.add(inv);
                }
            }
        }
        return constraints;
    }

    private static String getOCLExpressionFromConstraint(Constraint constraint) {
        if (constraint.getSpecification() instanceof OpaqueExpression) {
            OpaqueExpression opaqueExpression = (OpaqueExpression)constraint.getSpecification();
            int indexOfOCLBody = -1;
            for (int i = 0; i < opaqueExpression.getLanguage().size()
                    && indexOfOCLBody == -1; i++) {
                if (opaqueExpression.getLanguage().get(i).equals("OCL")) {
                    indexOfOCLBody = i;
                }
            }
            if (indexOfOCLBody != -1) {
                return opaqueExpression.getBody().get(indexOfOCLBody);
            }
        }
        return null;
    }
    
    private static List<EObject> transformModel(ResourceSet rs, URI transformation, EList<EObject> source) throws Exception
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
                    
                    // jbp.fDescriptorMap = new HashMap<?,?>();
                    Field fDescriptorMapField = providerClass.getDeclaredField("fDescriptorMap");
                    fDescriptorMapField.setAccessible(true);
                    fDescriptorMapField.set(jbp, HashMap.class.newInstance());

                    // jbp.fDescriptorMap.put(id, descriptor);
                    Object fDescriptorMap = fDescriptorMapField.get(jbp);
                    Method putMethod = fDescriptorMapField.getType().getDeclaredMethod("put", Object.class, Object.class);
                    putMethod.invoke(fDescriptorMap, "id", descriptor);

                    // BlackboxRegistry.INSTANCE.fProviders.add(jbp);
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
        
        TransformationExecutor executor = new TransformationExecutor(transformation);

        ExecutionContextImpl context = new ExecutionContextImpl();
        context.setConfigProperty("keepModeling", true);
        context.setLog(new WriterLog(new OutputStreamWriter(System.out)));
        ModelExtent input = new BasicModelExtent(source);
        ModelExtent output = new BasicModelExtent();
        ExecutionDiagnostic result = executor.execute(context, input, output);
        if(result.getSeverity() == Diagnostic.OK) {
            return output.getContents();
        } else {
            IStatus status = BasicDiagnostic.toIStatus(result);
            throw new Exception(status.getMessage());
        }
    }
    
//    private static void printXpath(ResourceSet rs, List<EObject> xpath, URI output) throws IOException
//    {
//        final ExtendedMetaData extendedMetaData = new BasicExtendedMetaData(rs.getPackageRegistry());
//        rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, extendedMetaData);
//
//        Resource res = rs.createResource(output);
//
//        EObject eObject = xpath.get(0);
//        if (eObject instanceof EPackage) {
//            EPackage p = (EPackage)eObject;
//            rs.getPackageRegistry().put(p.getNsURI(), p);
//            System.out.println(p);
//            System.out.println(p.getNsURI());
//        }
//
//        res.getContents().addAll(xpath);
//        res.save(null);
//    }
}
