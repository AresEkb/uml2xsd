import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.ocl.examples.pivot.Constraint;
import org.eclipse.ocl.examples.pivot.Element;
import org.eclipse.ocl.examples.pivot.ExpressionInOCL;
import org.eclipse.ocl.examples.pivot.OCL;
import org.eclipse.ocl.examples.pivot.OpaqueExpression;
import org.eclipse.ocl.examples.pivot.ParserException;
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

import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.BDTPackage;

public class Main {

    public static void main(String[] args) {
        //final String input = "model/OclTest.uml";
        final String input = "model2/SMDataModel.uml";
        final String oclAST = "output/parsedOcl.ecore.oclas";
        final String transform = "transforms/OclToXpath.qvto";
        final String xpathAST = "output/result.ecore";
        final String output = "output/result.xpath2";
        
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

        Xpath2Package xpathPkg = Xpath2Package.eINSTANCE;
        rs.getPackageRegistry().put(xpathPkg.getNsURI(), xpathPkg);

        BDTPackage bdtPkg = BDTPackage.eINSTANCE;
        rs.getPackageRegistry().put(bdtPkg.getNsURI(), bdtPkg);
        //rs.getPackageRegistry().put("file:/C:/Work/workspace/OclToXPath/model2/ReferenceModel.uml", bdtPkg);

        rs.getPackageRegistry().put(GenModelPackage.eINSTANCE.getNsURI(), GenModelPackage.eINSTANCE);
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xpath2", new Xpath2ResourceFactory());

        try {
            System.out.println("Parsing OCL rules from an input UML model " + input);
            EList<EObject> ocl = parseOcl(rs, createFileURI(input));
            System.out.println("Saving OCL AST into " + oclAST);
            saveModel(rs, ocl, createFileURI(oclAST));
            System.out.println("Transforming OCL rules by " + transform);
            List<EObject> xpath = transformModel(rs, createFileURI(transform), ocl);
            System.out.println("Saving XPath AST into " + xpathAST);
            saveModel(rs, xpath, createFileURI(xpathAST));
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
        Resource res = rs.createResource(fileName);
        res.getContents().addAll(model);
        res.save(null);
        res.unload();
    }

    private static EList<EObject> parseOcl(ResourceSet rs, URI source)
            throws ParserException, IOException {
        //String oclFile = "model2/NewOCLstdlibFile.oclstdlib";
        //String oclFile = "model2/ReferenceModel.ocl";
        Resource resource = rs.getResource(source, true);
        MetaModelManager metaModelManager = PivotUtil.getMetaModelManager(resource);
        //metaModelManager.setDefaultStandardLibraryURI(oclFile);
        PivotEnvironmentFactory envFactory = new PivotEnvironmentFactory(null, metaModelManager);
        PivotEnvironment environment = envFactory.createEnvironment();
        OCL ocl = OCL.newInstance(environment);
        OCLHelper oclHelper = ocl.createOCLHelper();

        //Resource rules = ocl.load(createFileURI(oclFile));
        //System.out.println(rules);

//        EList<EObject> list = rules.getContents();
//        for (EObject item : list) {
//            System.out.println(item);
//        }
        
        EList<EObject> c = new BasicEList<EObject>();

        Root root = UML2Pivot.importFromUML(metaModelManager, null, resource);

        //root.eResource().save(null);

        EList<Constraint> constraints = getAllConstraints(metaModelManager, root);
        for (Constraint constraint : constraints) {
            List<Element> elements = constraint.getConstrainedElement();
            for (Element element : elements) {
                if (element instanceof Type) {
                    Type type = (Type) element;
                    oclHelper.setInstanceContext(type);
                    String expression = getOCLExpressionFromConstraint(constraint);
                    System.out.println("Expression found: " + expression);
                    ExpressionInOCL expr = oclHelper.createInvariant(expression);
                    c.add(0, expr);
                }
            }
        }
        return c;
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
        TransformationExecutor executor = new TransformationExecutor(transformation);
        ExecutionContextImpl context = new ExecutionContextImpl();
        context.setConfigProperty("keepModeling", true);
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
