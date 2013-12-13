/**
 */
package org.w3._2001.xml.schema.impl;

import java.math.BigInteger;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._2001.xml.schema.AnyType;
import org.w3._2001.xml.schema.SchemaFactory;
import org.w3._2001.xml.schema.SchemaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Any Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.AnyTypeImpl#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AnyTypeImpl#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AnyTypeImpl#getNotQName <em>Not QName</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnyTypeImpl extends WildcardImpl implements AnyType {
    /**
     * The default value of the '{@link #getMaxOccurs() <em>Max Occurs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxOccurs()
     * @generated
     * @ordered
     */
    protected static final Object MAX_OCCURS_EDEFAULT = SchemaFactory.eINSTANCE.createFromString(SchemaPackage.eINSTANCE.getAllNNI(), "1");

    /**
     * The cached value of the '{@link #getMaxOccurs() <em>Max Occurs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxOccurs()
     * @generated
     * @ordered
     */
    protected Object maxOccurs = MAX_OCCURS_EDEFAULT;

    /**
     * This is true if the Max Occurs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxOccursESet;

    /**
     * The default value of the '{@link #getMinOccurs() <em>Min Occurs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinOccurs()
     * @generated
     * @ordered
     */
    protected static final BigInteger MIN_OCCURS_EDEFAULT = new BigInteger("1");

    /**
     * The cached value of the '{@link #getMinOccurs() <em>Min Occurs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinOccurs()
     * @generated
     * @ordered
     */
    protected BigInteger minOccurs = MIN_OCCURS_EDEFAULT;

    /**
     * This is true if the Min Occurs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minOccursESet;

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
    protected AnyTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.ANY_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getMaxOccurs() {
        return maxOccurs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxOccurs(Object newMaxOccurs) {
        Object oldMaxOccurs = maxOccurs;
        maxOccurs = newMaxOccurs;
        boolean oldMaxOccursESet = maxOccursESet;
        maxOccursESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.ANY_TYPE__MAX_OCCURS, oldMaxOccurs, maxOccurs, !oldMaxOccursESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMaxOccurs() {
        Object oldMaxOccurs = maxOccurs;
        boolean oldMaxOccursESet = maxOccursESet;
        maxOccurs = MAX_OCCURS_EDEFAULT;
        maxOccursESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.ANY_TYPE__MAX_OCCURS, oldMaxOccurs, MAX_OCCURS_EDEFAULT, oldMaxOccursESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMaxOccurs() {
        return maxOccursESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BigInteger getMinOccurs() {
        return minOccurs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinOccurs(BigInteger newMinOccurs) {
        BigInteger oldMinOccurs = minOccurs;
        minOccurs = newMinOccurs;
        boolean oldMinOccursESet = minOccursESet;
        minOccursESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.ANY_TYPE__MIN_OCCURS, oldMinOccurs, minOccurs, !oldMinOccursESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMinOccurs() {
        BigInteger oldMinOccurs = minOccurs;
        boolean oldMinOccursESet = minOccursESet;
        minOccurs = MIN_OCCURS_EDEFAULT;
        minOccursESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.ANY_TYPE__MIN_OCCURS, oldMinOccurs, MIN_OCCURS_EDEFAULT, oldMinOccursESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMinOccurs() {
        return minOccursESet;
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
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.ANY_TYPE__NOT_QNAME, oldNotQName, notQName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SchemaPackage.ANY_TYPE__MAX_OCCURS:
                return getMaxOccurs();
            case SchemaPackage.ANY_TYPE__MIN_OCCURS:
                return getMinOccurs();
            case SchemaPackage.ANY_TYPE__NOT_QNAME:
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
            case SchemaPackage.ANY_TYPE__MAX_OCCURS:
                setMaxOccurs(newValue);
                return;
            case SchemaPackage.ANY_TYPE__MIN_OCCURS:
                setMinOccurs((BigInteger)newValue);
                return;
            case SchemaPackage.ANY_TYPE__NOT_QNAME:
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
            case SchemaPackage.ANY_TYPE__MAX_OCCURS:
                unsetMaxOccurs();
                return;
            case SchemaPackage.ANY_TYPE__MIN_OCCURS:
                unsetMinOccurs();
                return;
            case SchemaPackage.ANY_TYPE__NOT_QNAME:
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
            case SchemaPackage.ANY_TYPE__MAX_OCCURS:
                return isSetMaxOccurs();
            case SchemaPackage.ANY_TYPE__MIN_OCCURS:
                return isSetMinOccurs();
            case SchemaPackage.ANY_TYPE__NOT_QNAME:
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
        result.append(" (maxOccurs: ");
        if (maxOccursESet) result.append(maxOccurs); else result.append("<unset>");
        result.append(", minOccurs: ");
        if (minOccursESet) result.append(minOccurs); else result.append("<unset>");
        result.append(", notQName: ");
        result.append(notQName);
        result.append(')');
        return result.toString();
    }

} //AnyTypeImpl
