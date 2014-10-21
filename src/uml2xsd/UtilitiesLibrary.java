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

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.ocl.examples.pivot.ExpressionInOCL;
import org.eclipse.ocl.examples.pivot.OCL;
import org.eclipse.ocl.examples.pivot.ParserException;
import org.eclipse.ocl.examples.pivot.helper.OCLHelper;
import org.eclipse.ocl.examples.pivot.manager.MetaModelManager;
import org.eclipse.ocl.examples.pivot.uml.UML2Pivot;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironment;
import org.eclipse.ocl.examples.pivot.utilities.PivotEnvironmentFactory;
import org.eclipse.ocl.examples.pivot.utilities.PivotUtil;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Property;
import org.emftext.language.xpath2.Expr;
import org.emftext.language.xpath2.resource.xpath2.IXpath2TextPrinter;
import org.emftext.language.xpath2.resource.xpath2.IXpath2TextResource;
import org.emftext.language.xpath2.resource.xpath2.mopp.Xpath2MetaInformation;
import org.emftext.language.xpath2.resource.xpath2.mopp.Xpath2ResourceFactory;

public class UtilitiesLibrary {

    public UtilitiesLibrary() {
        super();
    }

    final static PivotEnvironmentFactory envFactory = new PivotEnvironmentFactory();
    final static PivotEnvironment environment = envFactory.createEnvironment();
    final static OCL ocl = OCL.newInstance(environment);
    final static OCLHelper oclHelper = ocl.createOCLHelper();

    final static String DOCUMENT_ROOT = "DocumentRoot";

    @Operation(contextual=true)
    public static EList<Property> getAttributes(Classifier classifier)
    {
        return classifier.getAttributes();
    }

    @Operation(contextual=true)
    public static NamedElement getETarget(org.eclipse.ocl.examples.pivot.NamedElement el)
    {
        return (NamedElement)el.getETarget();
    }

    public static QName createQName(String localPart)
    {
        return new QName(localPart);
    }

    public static QName createQName(String namespaceURI, String localPart)
    {
        return new QName(namespaceURI, localPart);
    }

    public static QName createQName(String namespaceURI, String localPart, String prefix)
    {
        return new QName(namespaceURI, localPart, prefix);
    }

    @Operation(contextual=true)
    public static String getLocalPart(Object qname)
    {
        String localPart = ((QName)qname).getLocalPart();
        return localPart.isEmpty() ? null : localPart;
    }

    @Operation(contextual=true)
    public static String getNamespaceURI(Object qname)
    {
        String namespaceURI = ((QName)qname).getNamespaceURI();
        return namespaceURI.isEmpty() ? null : namespaceURI;
    }

    @Operation(contextual=true)
    public static String getPrefix(Object qname)
    {
        String prefix = ((QName)qname).getPrefix();
        return prefix.isEmpty() ? null : prefix;
    }

    public static FeatureMap.Entry createFeatureMapEntry(String nsURI, String eStructuralFeature, Object value)
    {
        EPackage pckg = EPackage.Registry.INSTANCE.getEPackage(nsURI);
        if (pckg == null) {
            throw new IllegalArgumentException("Package with ns URI '" + nsURI + "' not found");
        }
        EClass docRoot = findDocumentRoot(pckg);
        if (docRoot == null) {
            throw new IllegalArgumentException("DocumentRoot class not found in a package with ns URI '" + nsURI + "'");
        }
        EStructuralFeature feature = docRoot.getEStructuralFeature(eStructuralFeature);
        if (value instanceof String && feature.getEType() instanceof EDataType) {
            String string = (String)value;
            EDataType type = (EDataType)feature.getEType();
            value = EcoreUtil.createFromString(type, string);
        }
        return FeatureMapUtil.createEntry(feature, value);
    }

    private static EClass findDocumentRoot(EPackage pckg)
    {
        for (EObject obj : pckg.eContents()) {
            if (obj instanceof EClass && ((EClass)obj).getName().equals(DOCUMENT_ROOT)) {
                return (EClass)obj;
            }
        }
        for (EObject obj : pckg.eContents()) {
            if (obj instanceof EClass && ((EClass)obj).getName().endsWith(DOCUMENT_ROOT)) {
                return (EClass)obj;
            }
        }
        return null;
    }

    @Operation(contextual=true)
    public static ExpressionInOCL toExpressionInOCL(Constraint constraint) throws ParserException
    {
        Namespace context = constraint.getContext();
        MetaModelManager mm = PivotUtil.findMetaModelManager(context);
        org.eclipse.ocl.examples.pivot.Element type = UML2Pivot.importFromUML(mm, null, context);
        oclHelper.setInstanceContext(type);
        if (constraint.getSpecification() instanceof OpaqueExpression) {
            OpaqueExpression opaqueExpression = (OpaqueExpression)constraint.getSpecification();
            int indexOfOCLBody = opaqueExpression.getLanguages().indexOf("OCL");
            if (indexOfOCLBody != -1) {
                String body = opaqueExpression.getBodies().get(indexOfOCLBody);
                return oclHelper.createInvariant(body);
            }
        }
        return null;
    }

    @Operation(contextual=true)
    public static String toString(Expr expr) throws IOException
    {
        ResourceSetImpl rs = new ResourceSetImpl();
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new Xpath2ResourceFactory());
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        IXpath2TextResource res = (IXpath2TextResource)rs.createResource(URI.createURI(""));
        IXpath2TextPrinter printer = new Xpath2MetaInformation().createPrinter(buffer, res);
        printer.print(expr);
        return buffer.toString();
    }
}
