/**
 */
package org.w3._2001.xml.schema.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLSchema11XMLProcessor extends XMLProcessor {

    /**
     * Public constructor to instantiate the helper.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XMLSchema11XMLProcessor() {
        super((EPackage.Registry.INSTANCE));
        XMLSchema11Package.eINSTANCE.eClass();
    }
    
    /**
     * Register for "*" and "xml" file extensions the XMLSchema11ResourceFactoryImpl factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected Map<String, Resource.Factory> getRegistrations() {
        if (registrations == null) {
            super.getRegistrations();
            registrations.put(XML_EXTENSION, new XMLSchema11ResourceFactoryImpl());
            registrations.put(STAR_EXTENSION, new XMLSchema11ResourceFactoryImpl());
        }
        return registrations;
    }

} //XMLSchema11XMLProcessor
