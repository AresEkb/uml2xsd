/**
 */
package org.w3._2001.xml.schema.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._2001.xml.schema.AnyAttributeType;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.AnyAttributeTypeImpl#getNotQName <em>Not QName</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnyAttributeTypeImpl extends WildcardImpl implements AnyAttributeType {
    /**
     * The default value of the '{@link #getNotQName() <em>Not QName</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNotQName()
     * @generated
     * @ordered
     */
    protected static final List<Object> NOT_QNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNotQName() <em>Not QName</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNotQName()
     * @generated
     * @ordered
     */
    protected List<Object> notQName = NOT_QNAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnyAttributeTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.ANY_ATTRIBUTE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Object> getNotQName() {
        return notQName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNotQName(List<Object> newNotQName) {
        List<Object> oldNotQName = notQName;
        notQName = newNotQName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.ANY_ATTRIBUTE_TYPE__NOT_QNAME, oldNotQName, notQName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XMLSchema11Package.ANY_ATTRIBUTE_TYPE__NOT_QNAME:
                return getNotQName();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XMLSchema11Package.ANY_ATTRIBUTE_TYPE__NOT_QNAME:
                setNotQName((List<Object>)newValue);
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
            case XMLSchema11Package.ANY_ATTRIBUTE_TYPE__NOT_QNAME:
                setNotQName(NOT_QNAME_EDEFAULT);
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
            case XMLSchema11Package.ANY_ATTRIBUTE_TYPE__NOT_QNAME:
                return NOT_QNAME_EDEFAULT == null ? notQName != null : !NOT_QNAME_EDEFAULT.equals(notQName);
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
        result.append(" (notQName: ");
        result.append(notQName);
        result.append(')');
        return result.toString();
    }

} //AnyAttributeTypeImpl
