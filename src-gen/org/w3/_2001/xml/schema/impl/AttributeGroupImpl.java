/**
 */
package org.w3._2001.xml.schema.impl;

import java.util.Collection;
import javax.xml.namespace.QName;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3._2001.xml.schema.AnyAttributeType;
import org.w3._2001.xml.schema.Attribute;
import org.w3._2001.xml.schema.AttributeGroup;
import org.w3._2001.xml.schema.AttributeGroupRef;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.AttributeGroupImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AttributeGroupImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AttributeGroupImpl#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AttributeGroupImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AttributeGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AttributeGroupImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AttributeGroupImpl extends AnnotatedImpl implements AttributeGroup {
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
     * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRef()
     * @generated
     * @ordered
     */
    protected static final QName REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRef()
     * @generated
     * @ordered
     */
    protected QName ref = REF_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttributeGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.ATTRIBUTE_GROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
        return (FeatureMap)getMixed().<FeatureMap.Entry>list(XMLSchema11Package.Literals.ATTRIBUTE_GROUP__GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Attribute> getAttribute() {
        return getGroup().list(XMLSchema11Package.Literals.ATTRIBUTE_GROUP__ATTRIBUTE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AttributeGroupRef> getAttributeGroup() {
        return getGroup().list(XMLSchema11Package.Literals.ATTRIBUTE_GROUP__ATTRIBUTE_GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyAttributeType getAnyAttribute1() {
        return (AnyAttributeType)getMixed().get(XMLSchema11Package.Literals.ATTRIBUTE_GROUP__ANY_ATTRIBUTE1, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnyAttribute1(AnyAttributeType newAnyAttribute1) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.ATTRIBUTE_GROUP__ANY_ATTRIBUTE1, newAnyAttribute1);
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
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.ATTRIBUTE_GROUP__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getRef() {
        return ref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRef(QName newRef) {
        QName oldRef = ref;
        ref = newRef;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.ATTRIBUTE_GROUP__REF, oldRef, ref));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XMLSchema11Package.ATTRIBUTE_GROUP__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
            case XMLSchema11Package.ATTRIBUTE_GROUP__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case XMLSchema11Package.ATTRIBUTE_GROUP__ATTRIBUTE:
                return getAttribute();
            case XMLSchema11Package.ATTRIBUTE_GROUP__ATTRIBUTE_GROUP:
                return getAttributeGroup();
            case XMLSchema11Package.ATTRIBUTE_GROUP__ANY_ATTRIBUTE1:
                return getAnyAttribute1();
            case XMLSchema11Package.ATTRIBUTE_GROUP__NAME:
                return getName();
            case XMLSchema11Package.ATTRIBUTE_GROUP__REF:
                return getRef();
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
            case XMLSchema11Package.ATTRIBUTE_GROUP__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case XMLSchema11Package.ATTRIBUTE_GROUP__ATTRIBUTE:
                getAttribute().clear();
                getAttribute().addAll((Collection<? extends Attribute>)newValue);
                return;
            case XMLSchema11Package.ATTRIBUTE_GROUP__ATTRIBUTE_GROUP:
                getAttributeGroup().clear();
                getAttributeGroup().addAll((Collection<? extends AttributeGroupRef>)newValue);
                return;
            case XMLSchema11Package.ATTRIBUTE_GROUP__ANY_ATTRIBUTE1:
                setAnyAttribute1((AnyAttributeType)newValue);
                return;
            case XMLSchema11Package.ATTRIBUTE_GROUP__NAME:
                setName((String)newValue);
                return;
            case XMLSchema11Package.ATTRIBUTE_GROUP__REF:
                setRef((QName)newValue);
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
            case XMLSchema11Package.ATTRIBUTE_GROUP__GROUP:
                getGroup().clear();
                return;
            case XMLSchema11Package.ATTRIBUTE_GROUP__ATTRIBUTE:
                getAttribute().clear();
                return;
            case XMLSchema11Package.ATTRIBUTE_GROUP__ATTRIBUTE_GROUP:
                getAttributeGroup().clear();
                return;
            case XMLSchema11Package.ATTRIBUTE_GROUP__ANY_ATTRIBUTE1:
                setAnyAttribute1((AnyAttributeType)null);
                return;
            case XMLSchema11Package.ATTRIBUTE_GROUP__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XMLSchema11Package.ATTRIBUTE_GROUP__REF:
                setRef(REF_EDEFAULT);
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
            case XMLSchema11Package.ATTRIBUTE_GROUP__GROUP:
                return !getGroup().isEmpty();
            case XMLSchema11Package.ATTRIBUTE_GROUP__ATTRIBUTE:
                return !getAttribute().isEmpty();
            case XMLSchema11Package.ATTRIBUTE_GROUP__ATTRIBUTE_GROUP:
                return !getAttributeGroup().isEmpty();
            case XMLSchema11Package.ATTRIBUTE_GROUP__ANY_ATTRIBUTE1:
                return getAnyAttribute1() != null;
            case XMLSchema11Package.ATTRIBUTE_GROUP__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XMLSchema11Package.ATTRIBUTE_GROUP__REF:
                return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
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
        result.append(" (name: ");
        result.append(name);
        result.append(", ref: ");
        result.append(ref);
        result.append(')');
        return result.toString();
    }

} //AttributeGroupImpl
