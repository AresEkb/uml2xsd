/**
 */
package org.w3._2001.xml.schema.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._2001.xml.schema.FieldType;
import org.w3._2001.xml.schema.SchemaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.FieldTypeImpl#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.FieldTypeImpl#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldTypeImpl extends AnnotatedImpl implements FieldType {
    /**
     * The default value of the '{@link #getXpath() <em>Xpath</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXpath()
     * @generated
     * @ordered
     */
    protected static final String XPATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXpath() <em>Xpath</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXpath()
     * @generated
     * @ordered
     */
    protected String xpath = XPATH_EDEFAULT;

    /**
     * The default value of the '{@link #getXpathDefaultNamespace() <em>Xpath Default Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXpathDefaultNamespace()
     * @generated
     * @ordered
     */
    protected static final Object XPATH_DEFAULT_NAMESPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXpathDefaultNamespace() <em>Xpath Default Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXpathDefaultNamespace()
     * @generated
     * @ordered
     */
    protected Object xpathDefaultNamespace = XPATH_DEFAULT_NAMESPACE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FieldTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.FIELD_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getXpath() {
        return xpath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXpath(String newXpath) {
        String oldXpath = xpath;
        xpath = newXpath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.FIELD_TYPE__XPATH, oldXpath, xpath));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getXpathDefaultNamespace() {
        return xpathDefaultNamespace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXpathDefaultNamespace(Object newXpathDefaultNamespace) {
        Object oldXpathDefaultNamespace = xpathDefaultNamespace;
        xpathDefaultNamespace = newXpathDefaultNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.FIELD_TYPE__XPATH_DEFAULT_NAMESPACE, oldXpathDefaultNamespace, xpathDefaultNamespace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SchemaPackage.FIELD_TYPE__XPATH:
                return getXpath();
            case SchemaPackage.FIELD_TYPE__XPATH_DEFAULT_NAMESPACE:
                return getXpathDefaultNamespace();
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
            case SchemaPackage.FIELD_TYPE__XPATH:
                setXpath((String)newValue);
                return;
            case SchemaPackage.FIELD_TYPE__XPATH_DEFAULT_NAMESPACE:
                setXpathDefaultNamespace(newValue);
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
            case SchemaPackage.FIELD_TYPE__XPATH:
                setXpath(XPATH_EDEFAULT);
                return;
            case SchemaPackage.FIELD_TYPE__XPATH_DEFAULT_NAMESPACE:
                setXpathDefaultNamespace(XPATH_DEFAULT_NAMESPACE_EDEFAULT);
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
            case SchemaPackage.FIELD_TYPE__XPATH:
                return XPATH_EDEFAULT == null ? xpath != null : !XPATH_EDEFAULT.equals(xpath);
            case SchemaPackage.FIELD_TYPE__XPATH_DEFAULT_NAMESPACE:
                return XPATH_DEFAULT_NAMESPACE_EDEFAULT == null ? xpathDefaultNamespace != null : !XPATH_DEFAULT_NAMESPACE_EDEFAULT.equals(xpathDefaultNamespace);
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
        result.append(" (xpath: ");
        result.append(xpath);
        result.append(", xpathDefaultNamespace: ");
        result.append(xpathDefaultNamespace);
        result.append(')');
        return result.toString();
    }

} //FieldTypeImpl
