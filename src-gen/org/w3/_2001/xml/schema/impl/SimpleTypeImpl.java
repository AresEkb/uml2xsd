/**
 */
package org.w3._2001.xml.schema.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.w3._2001.xml.schema.ListType;
import org.w3._2001.xml.schema.RestrictionType1;
import org.w3._2001.xml.schema.SimpleType;
import org.w3._2001.xml.schema.UnionType;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.SimpleTypeImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SimpleTypeImpl#getList <em>List</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SimpleTypeImpl#getUnion <em>Union</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SimpleTypeImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SimpleTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SimpleTypeImpl extends AnnotatedImpl implements SimpleType {
    /**
     * The default value of the '{@link #getFinal() <em>Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinal()
     * @generated
     * @ordered
     */
    protected static final Object FINAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFinal() <em>Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinal()
     * @generated
     * @ordered
     */
    protected Object final_ = FINAL_EDEFAULT;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SimpleTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.SIMPLE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RestrictionType1 getRestriction() {
        return (RestrictionType1)getMixed().get(XMLSchema11Package.Literals.SIMPLE_TYPE__RESTRICTION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRestriction(RestrictionType1 newRestriction) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.SIMPLE_TYPE__RESTRICTION, newRestriction);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ListType getList() {
        return (ListType)getMixed().get(XMLSchema11Package.Literals.SIMPLE_TYPE__LIST, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setList(ListType newList) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.SIMPLE_TYPE__LIST, newList);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnionType getUnion() {
        return (UnionType)getMixed().get(XMLSchema11Package.Literals.SIMPLE_TYPE__UNION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnion(UnionType newUnion) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.SIMPLE_TYPE__UNION, newUnion);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFinal() {
        return final_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFinal(Object newFinal) {
        Object oldFinal = final_;
        final_ = newFinal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.SIMPLE_TYPE__FINAL, oldFinal, final_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.SIMPLE_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XMLSchema11Package.SIMPLE_TYPE__RESTRICTION:
                return getRestriction();
            case XMLSchema11Package.SIMPLE_TYPE__LIST:
                return getList();
            case XMLSchema11Package.SIMPLE_TYPE__UNION:
                return getUnion();
            case XMLSchema11Package.SIMPLE_TYPE__FINAL:
                return getFinal();
            case XMLSchema11Package.SIMPLE_TYPE__NAME:
                return getName();
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
            case XMLSchema11Package.SIMPLE_TYPE__RESTRICTION:
                setRestriction((RestrictionType1)newValue);
                return;
            case XMLSchema11Package.SIMPLE_TYPE__LIST:
                setList((ListType)newValue);
                return;
            case XMLSchema11Package.SIMPLE_TYPE__UNION:
                setUnion((UnionType)newValue);
                return;
            case XMLSchema11Package.SIMPLE_TYPE__FINAL:
                setFinal(newValue);
                return;
            case XMLSchema11Package.SIMPLE_TYPE__NAME:
                setName((String)newValue);
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
            case XMLSchema11Package.SIMPLE_TYPE__RESTRICTION:
                setRestriction((RestrictionType1)null);
                return;
            case XMLSchema11Package.SIMPLE_TYPE__LIST:
                setList((ListType)null);
                return;
            case XMLSchema11Package.SIMPLE_TYPE__UNION:
                setUnion((UnionType)null);
                return;
            case XMLSchema11Package.SIMPLE_TYPE__FINAL:
                setFinal(FINAL_EDEFAULT);
                return;
            case XMLSchema11Package.SIMPLE_TYPE__NAME:
                setName(NAME_EDEFAULT);
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
            case XMLSchema11Package.SIMPLE_TYPE__RESTRICTION:
                return getRestriction() != null;
            case XMLSchema11Package.SIMPLE_TYPE__LIST:
                return getList() != null;
            case XMLSchema11Package.SIMPLE_TYPE__UNION:
                return getUnion() != null;
            case XMLSchema11Package.SIMPLE_TYPE__FINAL:
                return FINAL_EDEFAULT == null ? final_ != null : !FINAL_EDEFAULT.equals(final_);
            case XMLSchema11Package.SIMPLE_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
        result.append(" (final: ");
        result.append(final_);
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //SimpleTypeImpl
