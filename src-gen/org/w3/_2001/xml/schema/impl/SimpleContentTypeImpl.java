/**
 */
package org.w3._2001.xml.schema.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.w3._2001.xml.schema.SimpleContentType;
import org.w3._2001.xml.schema.SimpleExtensionType;
import org.w3._2001.xml.schema.SimpleRestrictionType;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.SimpleContentTypeImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SimpleContentTypeImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleContentTypeImpl extends AnnotatedImpl implements SimpleContentType {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SimpleContentTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.SIMPLE_CONTENT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleRestrictionType getRestriction() {
        return (SimpleRestrictionType)getMixed().get(XMLSchema11Package.Literals.SIMPLE_CONTENT_TYPE__RESTRICTION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRestriction(SimpleRestrictionType newRestriction) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.SIMPLE_CONTENT_TYPE__RESTRICTION, newRestriction);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleExtensionType getExtension() {
        return (SimpleExtensionType)getMixed().get(XMLSchema11Package.Literals.SIMPLE_CONTENT_TYPE__EXTENSION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtension(SimpleExtensionType newExtension) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.SIMPLE_CONTENT_TYPE__EXTENSION, newExtension);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XMLSchema11Package.SIMPLE_CONTENT_TYPE__RESTRICTION:
                return getRestriction();
            case XMLSchema11Package.SIMPLE_CONTENT_TYPE__EXTENSION:
                return getExtension();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XMLSchema11Package.SIMPLE_CONTENT_TYPE__RESTRICTION:
                setRestriction((SimpleRestrictionType)newValue);
                return;
            case XMLSchema11Package.SIMPLE_CONTENT_TYPE__EXTENSION:
                setExtension((SimpleExtensionType)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case XMLSchema11Package.SIMPLE_CONTENT_TYPE__RESTRICTION:
                setRestriction((SimpleRestrictionType)null);
                return;
            case XMLSchema11Package.SIMPLE_CONTENT_TYPE__EXTENSION:
                setExtension((SimpleExtensionType)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case XMLSchema11Package.SIMPLE_CONTENT_TYPE__RESTRICTION:
                return getRestriction() != null;
            case XMLSchema11Package.SIMPLE_CONTENT_TYPE__EXTENSION:
                return getExtension() != null;
        }
        return super.eIsSet(featureID);
    }

} //SimpleContentTypeImpl
