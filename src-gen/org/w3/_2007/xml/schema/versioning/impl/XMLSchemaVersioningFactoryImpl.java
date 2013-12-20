/**
 */
package org.w3._2007.xml.schema.versioning.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.w3._2007.xml.schema.versioning.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLSchemaVersioningFactoryImpl extends EFactoryImpl implements XMLSchemaVersioningFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static XMLSchemaVersioningFactory init() {
        try {
            XMLSchemaVersioningFactory theXMLSchemaVersioningFactory = (XMLSchemaVersioningFactory)EPackage.Registry.INSTANCE.getEFactory(XMLSchemaVersioningPackage.eNS_URI);
            if (theXMLSchemaVersioningFactory != null) {
                return theXMLSchemaVersioningFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new XMLSchemaVersioningFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLSchemaVersioningFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case XMLSchemaVersioningPackage.DOCUMENT_ROOT: return createDocumentRoot();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLSchemaVersioningPackage getXMLSchemaVersioningPackage() {
        return (XMLSchemaVersioningPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static XMLSchemaVersioningPackage getPackage() {
        return XMLSchemaVersioningPackage.eINSTANCE;
    }

} //XMLSchemaVersioningFactoryImpl
