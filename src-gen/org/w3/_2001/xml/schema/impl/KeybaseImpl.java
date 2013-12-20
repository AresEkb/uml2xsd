/**
 */
package org.w3._2001.xml.schema.impl;

import java.util.Collection;
import javax.xml.namespace.QName;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.w3._2001.xml.schema.FieldType;
import org.w3._2001.xml.schema.Keybase;
import org.w3._2001.xml.schema.SelectorType;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keybase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.KeybaseImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.KeybaseImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.KeybaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.KeybaseImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KeybaseImpl extends AnnotatedImpl implements Keybase {
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
    protected KeybaseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.KEYBASE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SelectorType getSelector() {
        return (SelectorType)getMixed().get(XMLSchema11Package.Literals.KEYBASE__SELECTOR, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSelector(SelectorType newSelector) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.KEYBASE__SELECTOR, newSelector);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<FieldType> getField() {
        return getMixed().list(XMLSchema11Package.Literals.KEYBASE__FIELD);
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
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.KEYBASE__NAME, oldName, name));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.KEYBASE__REF, oldRef, ref));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XMLSchema11Package.KEYBASE__SELECTOR:
                return getSelector();
            case XMLSchema11Package.KEYBASE__FIELD:
                return getField();
            case XMLSchema11Package.KEYBASE__NAME:
                return getName();
            case XMLSchema11Package.KEYBASE__REF:
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
            case XMLSchema11Package.KEYBASE__SELECTOR:
                setSelector((SelectorType)newValue);
                return;
            case XMLSchema11Package.KEYBASE__FIELD:
                getField().clear();
                getField().addAll((Collection<? extends FieldType>)newValue);
                return;
            case XMLSchema11Package.KEYBASE__NAME:
                setName((String)newValue);
                return;
            case XMLSchema11Package.KEYBASE__REF:
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
            case XMLSchema11Package.KEYBASE__SELECTOR:
                setSelector((SelectorType)null);
                return;
            case XMLSchema11Package.KEYBASE__FIELD:
                getField().clear();
                return;
            case XMLSchema11Package.KEYBASE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XMLSchema11Package.KEYBASE__REF:
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
            case XMLSchema11Package.KEYBASE__SELECTOR:
                return getSelector() != null;
            case XMLSchema11Package.KEYBASE__FIELD:
                return !getField().isEmpty();
            case XMLSchema11Package.KEYBASE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XMLSchema11Package.KEYBASE__REF:
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

} //KeybaseImpl
