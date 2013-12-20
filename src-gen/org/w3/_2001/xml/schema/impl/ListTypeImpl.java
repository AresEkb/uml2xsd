/**
 */
package org.w3._2001.xml.schema.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.w3._2001.xml.schema.ListType;
import org.w3._2001.xml.schema.LocalSimpleType;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.ListTypeImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ListTypeImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListTypeImpl extends AnnotatedImpl implements ListType {
    /**
     * The default value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItemType()
     * @generated
     * @ordered
     */
    protected static final QName ITEM_TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getItemType() <em>Item Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItemType()
     * @generated
     * @ordered
     */
    protected QName itemType = ITEM_TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ListTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.LIST_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalSimpleType getSimpleType() {
        return (LocalSimpleType)getMixed().get(XMLSchema11Package.Literals.LIST_TYPE__SIMPLE_TYPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSimpleType(LocalSimpleType newSimpleType) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.LIST_TYPE__SIMPLE_TYPE, newSimpleType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getItemType() {
        return itemType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setItemType(QName newItemType) {
        QName oldItemType = itemType;
        itemType = newItemType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.LIST_TYPE__ITEM_TYPE, oldItemType, itemType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XMLSchema11Package.LIST_TYPE__SIMPLE_TYPE:
                return getSimpleType();
            case XMLSchema11Package.LIST_TYPE__ITEM_TYPE:
                return getItemType();
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
            case XMLSchema11Package.LIST_TYPE__SIMPLE_TYPE:
                setSimpleType((LocalSimpleType)newValue);
                return;
            case XMLSchema11Package.LIST_TYPE__ITEM_TYPE:
                setItemType((QName)newValue);
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
            case XMLSchema11Package.LIST_TYPE__SIMPLE_TYPE:
                setSimpleType((LocalSimpleType)null);
                return;
            case XMLSchema11Package.LIST_TYPE__ITEM_TYPE:
                setItemType(ITEM_TYPE_EDEFAULT);
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
            case XMLSchema11Package.LIST_TYPE__SIMPLE_TYPE:
                return getSimpleType() != null;
            case XMLSchema11Package.LIST_TYPE__ITEM_TYPE:
                return ITEM_TYPE_EDEFAULT == null ? itemType != null : !ITEM_TYPE_EDEFAULT.equals(itemType);
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
        result.append(" (itemType: ");
        result.append(itemType);
        result.append(')');
        return result.toString();
    }

} //ListTypeImpl
