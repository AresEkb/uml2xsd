/**
 */
package org.w3._2001.xml.schema.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.w3._2001.xml.schema.AltType;
import org.w3._2001.xml.schema.LocalComplexType;
import org.w3._2001.xml.schema.LocalSimpleType;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alt Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.AltTypeImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AltTypeImpl#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AltTypeImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AltTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.AltTypeImpl#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AltTypeImpl extends AnnotatedImpl implements AltType {
    /**
     * The default value of the '{@link #getTest() <em>Test</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTest()
     * @generated
     * @ordered
     */
    protected static final String TEST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTest() <em>Test</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTest()
     * @generated
     * @ordered
     */
    protected String test = TEST_EDEFAULT;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final QName TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected QName type = TYPE_EDEFAULT;

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
    protected AltTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.ALT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalSimpleType getSimpleType() {
        return (LocalSimpleType)getMixed().get(XMLSchema11Package.Literals.ALT_TYPE__SIMPLE_TYPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSimpleType(LocalSimpleType newSimpleType) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.ALT_TYPE__SIMPLE_TYPE, newSimpleType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalComplexType getComplexType() {
        return (LocalComplexType)getMixed().get(XMLSchema11Package.Literals.ALT_TYPE__COMPLEX_TYPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComplexType(LocalComplexType newComplexType) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.ALT_TYPE__COMPLEX_TYPE, newComplexType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTest() {
        return test;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTest(String newTest) {
        String oldTest = test;
        test = newTest;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.ALT_TYPE__TEST, oldTest, test));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(QName newType) {
        QName oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.ALT_TYPE__TYPE, oldType, type));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.ALT_TYPE__XPATH_DEFAULT_NAMESPACE, oldXpathDefaultNamespace, xpathDefaultNamespace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XMLSchema11Package.ALT_TYPE__SIMPLE_TYPE:
                return getSimpleType();
            case XMLSchema11Package.ALT_TYPE__COMPLEX_TYPE:
                return getComplexType();
            case XMLSchema11Package.ALT_TYPE__TEST:
                return getTest();
            case XMLSchema11Package.ALT_TYPE__TYPE:
                return getType();
            case XMLSchema11Package.ALT_TYPE__XPATH_DEFAULT_NAMESPACE:
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
            case XMLSchema11Package.ALT_TYPE__SIMPLE_TYPE:
                setSimpleType((LocalSimpleType)newValue);
                return;
            case XMLSchema11Package.ALT_TYPE__COMPLEX_TYPE:
                setComplexType((LocalComplexType)newValue);
                return;
            case XMLSchema11Package.ALT_TYPE__TEST:
                setTest((String)newValue);
                return;
            case XMLSchema11Package.ALT_TYPE__TYPE:
                setType((QName)newValue);
                return;
            case XMLSchema11Package.ALT_TYPE__XPATH_DEFAULT_NAMESPACE:
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
            case XMLSchema11Package.ALT_TYPE__SIMPLE_TYPE:
                setSimpleType((LocalSimpleType)null);
                return;
            case XMLSchema11Package.ALT_TYPE__COMPLEX_TYPE:
                setComplexType((LocalComplexType)null);
                return;
            case XMLSchema11Package.ALT_TYPE__TEST:
                setTest(TEST_EDEFAULT);
                return;
            case XMLSchema11Package.ALT_TYPE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case XMLSchema11Package.ALT_TYPE__XPATH_DEFAULT_NAMESPACE:
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
            case XMLSchema11Package.ALT_TYPE__SIMPLE_TYPE:
                return getSimpleType() != null;
            case XMLSchema11Package.ALT_TYPE__COMPLEX_TYPE:
                return getComplexType() != null;
            case XMLSchema11Package.ALT_TYPE__TEST:
                return TEST_EDEFAULT == null ? test != null : !TEST_EDEFAULT.equals(test);
            case XMLSchema11Package.ALT_TYPE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case XMLSchema11Package.ALT_TYPE__XPATH_DEFAULT_NAMESPACE:
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
        result.append(" (test: ");
        result.append(test);
        result.append(", type: ");
        result.append(type);
        result.append(", xpathDefaultNamespace: ");
        result.append(xpathDefaultNamespace);
        result.append(')');
        return result.toString();
    }

} //AltTypeImpl
