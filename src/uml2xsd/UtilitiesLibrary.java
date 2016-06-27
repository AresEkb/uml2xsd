/**
 * Copyright (c) 2013, 2016 Denis Nikiforov.
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
import java.math.BigInteger;

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
import org.eclipse.m2m.qvt.oml.blackbox.java.Module;
import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.ocl.pivot.ExpressionInOCL;
import org.eclipse.ocl.pivot.utilities.OCL;
import org.eclipse.ocl.pivot.utilities.ParserException;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.emftext.language.java.JavaClasspath;
import org.emftext.language.xpath2.AnyExpr;
import org.emftext.language.xpath2.resource.xpath2.IXpath2TextPrinter;
import org.emftext.language.xpath2.resource.xpath2.IXpath2TextResource;
import org.emftext.language.xpath2.resource.xpath2.mopp.Xpath2MetaInformation;
import org.emftext.language.xpath2.resource.xpath2.mopp.Xpath2ResourceFactory;

@Module(packageURIs={
        "http://www.eclipse.org/emf/2002/Ecore",
        "http://www.eclipse.org/emf/2003/XMLType",
        "http://www.w3.org/2001/XMLSchema",
        "http://www.eclipse.org/ocl/2015/Pivot",
        "http://www.emftext.org/language/xpath2",
        "http://www.eclipse.org/uml2/2.1.0/UML",
        "http://www.emftext.org/java/classifiers"})
public final class UtilitiesLibrary {

    public UtilitiesLibrary() {
        super();
    }

    private final OCL ocl = OCL.newInstance();

    private final static String DOCUMENT_ROOT = "DocumentRoot";

    private static int seq = 0;

    public static int getSeqNumber()
    {
        return ++seq;
    }

    @Operation(contextual=true)
    public static EList<Property> getAttributes(Classifier classifier)
    {
        return classifier.getAttributes();
    }

    @Operation(contextual=true)
    public static NamedElement getETarget(org.eclipse.ocl.pivot.NamedElement el)
    {
        return (NamedElement)el.getESObject();
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
    public static BigInteger toBigInteger(Integer value)
    {
        return BigInteger.valueOf(value);
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
        if (feature == null) {
            throw new IllegalArgumentException("Feature " + eStructuralFeature + " not found in a package with ns URI '" + nsURI + "'");
        }
        if (value instanceof String && feature.getEType() instanceof EDataType) {
            String string = (String)value;
            EDataType type = (EDataType)feature.getEType();
            value = EcoreUtil.createFromString(type, string);
        }
        return FeatureMapUtil.createEntry(feature, value);
    }

    public static FeatureMap.Entry createFeatureMapEntry(EStructuralFeature feature, Object value)
    {
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
    public ExpressionInOCL toExpressionInOCL(Constraint constraint)
    {
        ExpressionInOCL expr = null;
        try {
            org.eclipse.ocl.pivot.Constraint asConstraint = ocl.getMetamodelManager().getASOf(org.eclipse.ocl.pivot.Constraint.class, constraint);
            expr = ocl.getSpecification(asConstraint);
        }
        catch (ParserException e) {
            System.err.println(e.getMessage());
        }
        return expr;
    }

    @Operation(contextual=true)
    public ExpressionInOCL toExpressionInOCL(String expression, org.eclipse.ocl.pivot.Type context)
    {
        ExpressionInOCL expr = null;
        try {
            expr = ocl.createQuery(context, expression);
        }
        catch (ParserException e) {
            System.err.println(e.getMessage());
        }
        return expr;
    }

    @Operation(contextual=true)
    public static String toString(AnyExpr expr) throws IOException
    {
        ResourceSetImpl rs = new ResourceSetImpl();
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new Xpath2ResourceFactory());
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        IXpath2TextResource res = (IXpath2TextResource)rs.createResource(URI.createURI(""));
        IXpath2TextPrinter printer = new Xpath2MetaInformation().createPrinter(buffer, res);
        printer.print(expr);
        return buffer.toString();
    }

    public static org.emftext.language.java.classifiers.ConcreteClassifier createJavaClassifier(String fullQualifiedName) {
        return (org.emftext.language.java.classifiers.ConcreteClassifier)JavaClasspath.get().getClassifier(fullQualifiedName);
    }
}
