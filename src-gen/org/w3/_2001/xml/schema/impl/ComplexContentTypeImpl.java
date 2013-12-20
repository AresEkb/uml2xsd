/**
 */
package org.w3._2001.xml.schema.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.w3._2001.xml.schema.ComplexContentType;
import org.w3._2001.xml.schema.ComplexRestrictionType;
import org.w3._2001.xml.schema.ExtensionType;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexContentTypeImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexContentTypeImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexContentTypeImpl#isMixed1 <em>Mixed1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexContentTypeImpl extends AnnotatedImpl implements ComplexContentType {
    /**
     * The default value of the '{@link #isMixed1() <em>Mixed1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMixed1()
     * @generated
     * @ordered
     */
    protected static final boolean MIXED1_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isMixed1() <em>Mixed1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMixed1()
     * @generated
     * @ordered
     */
    protected boolean mixed1 = MIXED1_EDEFAULT;

    /**
     * This is true if the Mixed1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mixed1ESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComplexContentTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.COMPLEX_CONTENT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexRestrictionType getRestriction() {
        return (ComplexRestrictionType)getMixed().get(XMLSchema11Package.Literals.COMPLEX_CONTENT_TYPE__RESTRICTION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRestriction(ComplexRestrictionType newRestriction) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.COMPLEX_CONTENT_TYPE__RESTRICTION, newRestriction);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtensionType getExtension() {
        return (ExtensionType)getMixed().get(XMLSchema11Package.Literals.COMPLEX_CONTENT_TYPE__EXTENSION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtension(ExtensionType newExtension) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.COMPLEX_CONTENT_TYPE__EXTENSION, newExtension);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isMixed1() {
        return mixed1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMixed1(boolean newMixed1) {
        boolean oldMixed1 = mixed1;
        mixed1 = newMixed1;
        boolean oldMixed1ESet = mixed1ESet;
        mixed1ESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.COMPLEX_CONTENT_TYPE__MIXED1, oldMixed1, mixed1, !oldMixed1ESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMixed1() {
        boolean oldMixed1 = mixed1;
        boolean oldMixed1ESet = mixed1ESet;
        mixed1 = MIXED1_EDEFAULT;
        mixed1ESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XMLSchema11Package.COMPLEX_CONTENT_TYPE__MIXED1, oldMixed1, MIXED1_EDEFAULT, oldMixed1ESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMixed1() {
        return mixed1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XMLSchema11Package.COMPLEX_CONTENT_TYPE__RESTRICTION:
                return getRestriction();
            case XMLSchema11Package.COMPLEX_CONTENT_TYPE__EXTENSION:
                return getExtension();
            case XMLSchema11Package.COMPLEX_CONTENT_TYPE__MIXED1:
                return isMixed1();
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
            case XMLSchema11Package.COMPLEX_CONTENT_TYPE__RESTRICTION:
                setRestriction((ComplexRestrictionType)newValue);
                return;
            case XMLSchema11Package.COMPLEX_CONTENT_TYPE__EXTENSION:
                setExtension((ExtensionType)newValue);
                return;
            case XMLSchema11Package.COMPLEX_CONTENT_TYPE__MIXED1:
                setMixed1((Boolean)newValue);
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
            case XMLSchema11Package.COMPLEX_CONTENT_TYPE__RESTRICTION:
                setRestriction((ComplexRestrictionType)null);
                return;
            case XMLSchema11Package.COMPLEX_CONTENT_TYPE__EXTENSION:
                setExtension((ExtensionType)null);
                return;
            case XMLSchema11Package.COMPLEX_CONTENT_TYPE__MIXED1:
                unsetMixed1();
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
            case XMLSchema11Package.COMPLEX_CONTENT_TYPE__RESTRICTION:
                return getRestriction() != null;
            case XMLSchema11Package.COMPLEX_CONTENT_TYPE__EXTENSION:
                return getExtension() != null;
            case XMLSchema11Package.COMPLEX_CONTENT_TYPE__MIXED1:
                return isSetMixed1();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (mixed1: ");
        if (mixed1ESet) result.append(mixed1); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ComplexContentTypeImpl
