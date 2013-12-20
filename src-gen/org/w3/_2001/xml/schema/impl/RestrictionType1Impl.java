/**
 */
package org.w3._2001.xml.schema.impl;

import javax.xml.namespace.QName;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3._2001.xml.schema.LocalSimpleType;
import org.w3._2001.xml.schema.RestrictionType1;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restriction Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionType1Impl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionType1Impl#getFacetGroup <em>Facet Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionType1Impl#getFacet <em>Facet</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionType1Impl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionType1Impl#getBase <em>Base</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestrictionType1Impl extends AnnotatedImpl implements RestrictionType1 {
    /**
     * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase()
     * @generated
     * @ordered
     */
    protected static final QName BASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase()
     * @generated
     * @ordered
     */
    protected QName base = BASE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RestrictionType1Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.RESTRICTION_TYPE1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalSimpleType getSimpleType() {
        return (LocalSimpleType)getMixed().get(XMLSchema11Package.Literals.RESTRICTION_TYPE1__SIMPLE_TYPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSimpleType(LocalSimpleType newSimpleType) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.RESTRICTION_TYPE1__SIMPLE_TYPE, newSimpleType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
        return (FeatureMap)getMixed().<FeatureMap.Entry>list(XMLSchema11Package.Literals.RESTRICTION_TYPE1__GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getFacetGroup() {
        return (FeatureMap)getGroup().<FeatureMap.Entry>list(XMLSchema11Package.Literals.RESTRICTION_TYPE1__FACET_GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EObject> getFacet() {
        return getFacetGroup().list(XMLSchema11Package.Literals.RESTRICTION_TYPE1__FACET);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAny() {
        return (FeatureMap)getGroup().<FeatureMap.Entry>list(XMLSchema11Package.Literals.RESTRICTION_TYPE1__ANY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getBase() {
        return base;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBase(QName newBase) {
        QName oldBase = base;
        base = newBase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.RESTRICTION_TYPE1__BASE, oldBase, base));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XMLSchema11Package.RESTRICTION_TYPE1__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
            case XMLSchema11Package.RESTRICTION_TYPE1__FACET_GROUP:
                return ((InternalEList<?>)getFacetGroup()).basicRemove(otherEnd, msgs);
            case XMLSchema11Package.RESTRICTION_TYPE1__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XMLSchema11Package.RESTRICTION_TYPE1__SIMPLE_TYPE:
                return getSimpleType();
            case XMLSchema11Package.RESTRICTION_TYPE1__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case XMLSchema11Package.RESTRICTION_TYPE1__FACET_GROUP:
                if (coreType) return getFacetGroup();
                return ((FeatureMap.Internal)getFacetGroup()).getWrapper();
            case XMLSchema11Package.RESTRICTION_TYPE1__FACET:
                return getFacet();
            case XMLSchema11Package.RESTRICTION_TYPE1__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case XMLSchema11Package.RESTRICTION_TYPE1__BASE:
                return getBase();
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
            case XMLSchema11Package.RESTRICTION_TYPE1__SIMPLE_TYPE:
                setSimpleType((LocalSimpleType)newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE1__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE1__FACET_GROUP:
                ((FeatureMap.Internal)getFacetGroup()).set(newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE1__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE1__BASE:
                setBase((QName)newValue);
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
            case XMLSchema11Package.RESTRICTION_TYPE1__SIMPLE_TYPE:
                setSimpleType((LocalSimpleType)null);
                return;
            case XMLSchema11Package.RESTRICTION_TYPE1__GROUP:
                getGroup().clear();
                return;
            case XMLSchema11Package.RESTRICTION_TYPE1__FACET_GROUP:
                getFacetGroup().clear();
                return;
            case XMLSchema11Package.RESTRICTION_TYPE1__ANY:
                getAny().clear();
                return;
            case XMLSchema11Package.RESTRICTION_TYPE1__BASE:
                setBase(BASE_EDEFAULT);
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
            case XMLSchema11Package.RESTRICTION_TYPE1__SIMPLE_TYPE:
                return getSimpleType() != null;
            case XMLSchema11Package.RESTRICTION_TYPE1__GROUP:
                return !getGroup().isEmpty();
            case XMLSchema11Package.RESTRICTION_TYPE1__FACET_GROUP:
                return !getFacetGroup().isEmpty();
            case XMLSchema11Package.RESTRICTION_TYPE1__FACET:
                return !getFacet().isEmpty();
            case XMLSchema11Package.RESTRICTION_TYPE1__ANY:
                return !getAny().isEmpty();
            case XMLSchema11Package.RESTRICTION_TYPE1__BASE:
                return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
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
        result.append(" (base: ");
        result.append(base);
        result.append(')');
        return result.toString();
    }

} //RestrictionType1Impl
