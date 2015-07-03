/**
 */
package iso20022.validation.result.impl;

import iso20022.validation.result.AnyContentType;
import iso20022.validation.result.ErrorType;
import iso20022.validation.result.ValidationResultPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.validation.result.impl.ErrorTypeImpl#getRuleName <em>Rule Name</em>}</li>
 *   <li>{@link iso20022.validation.result.impl.ErrorTypeImpl#getElement <em>Element</em>}</li>
 *   <li>{@link iso20022.validation.result.impl.ErrorTypeImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErrorTypeImpl extends MinimalEObjectImpl.Container implements ErrorType {
    /**
     * The cached value of the '{@link #getRuleName() <em>Rule Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRuleName()
     * @generated
     * @ordered
     */
    protected AnyContentType ruleName;

    /**
     * The cached value of the '{@link #getElement() <em>Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElement()
     * @generated
     * @ordered
     */
    protected AnyContentType element;

    /**
     * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessage()
     * @generated
     * @ordered
     */
    protected AnyContentType message;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ErrorTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ValidationResultPackage.Literals.ERROR_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyContentType getRuleName() {
        return ruleName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRuleName(AnyContentType newRuleName, NotificationChain msgs) {
        AnyContentType oldRuleName = ruleName;
        ruleName = newRuleName;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValidationResultPackage.ERROR_TYPE__RULE_NAME, oldRuleName, newRuleName);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRuleName(AnyContentType newRuleName) {
        if (newRuleName != ruleName) {
            NotificationChain msgs = null;
            if (ruleName != null)
                msgs = ((InternalEObject)ruleName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValidationResultPackage.ERROR_TYPE__RULE_NAME, null, msgs);
            if (newRuleName != null)
                msgs = ((InternalEObject)newRuleName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValidationResultPackage.ERROR_TYPE__RULE_NAME, null, msgs);
            msgs = basicSetRuleName(newRuleName, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ValidationResultPackage.ERROR_TYPE__RULE_NAME, newRuleName, newRuleName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyContentType getElement() {
        return element;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetElement(AnyContentType newElement, NotificationChain msgs) {
        AnyContentType oldElement = element;
        element = newElement;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValidationResultPackage.ERROR_TYPE__ELEMENT, oldElement, newElement);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setElement(AnyContentType newElement) {
        if (newElement != element) {
            NotificationChain msgs = null;
            if (element != null)
                msgs = ((InternalEObject)element).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValidationResultPackage.ERROR_TYPE__ELEMENT, null, msgs);
            if (newElement != null)
                msgs = ((InternalEObject)newElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValidationResultPackage.ERROR_TYPE__ELEMENT, null, msgs);
            msgs = basicSetElement(newElement, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ValidationResultPackage.ERROR_TYPE__ELEMENT, newElement, newElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyContentType getMessage() {
        return message;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMessage(AnyContentType newMessage, NotificationChain msgs) {
        AnyContentType oldMessage = message;
        message = newMessage;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ValidationResultPackage.ERROR_TYPE__MESSAGE, oldMessage, newMessage);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessage(AnyContentType newMessage) {
        if (newMessage != message) {
            NotificationChain msgs = null;
            if (message != null)
                msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ValidationResultPackage.ERROR_TYPE__MESSAGE, null, msgs);
            if (newMessage != null)
                msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ValidationResultPackage.ERROR_TYPE__MESSAGE, null, msgs);
            msgs = basicSetMessage(newMessage, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ValidationResultPackage.ERROR_TYPE__MESSAGE, newMessage, newMessage));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ValidationResultPackage.ERROR_TYPE__RULE_NAME:
                return basicSetRuleName(null, msgs);
            case ValidationResultPackage.ERROR_TYPE__ELEMENT:
                return basicSetElement(null, msgs);
            case ValidationResultPackage.ERROR_TYPE__MESSAGE:
                return basicSetMessage(null, msgs);
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
            case ValidationResultPackage.ERROR_TYPE__RULE_NAME:
                return getRuleName();
            case ValidationResultPackage.ERROR_TYPE__ELEMENT:
                return getElement();
            case ValidationResultPackage.ERROR_TYPE__MESSAGE:
                return getMessage();
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
            case ValidationResultPackage.ERROR_TYPE__RULE_NAME:
                setRuleName((AnyContentType)newValue);
                return;
            case ValidationResultPackage.ERROR_TYPE__ELEMENT:
                setElement((AnyContentType)newValue);
                return;
            case ValidationResultPackage.ERROR_TYPE__MESSAGE:
                setMessage((AnyContentType)newValue);
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
            case ValidationResultPackage.ERROR_TYPE__RULE_NAME:
                setRuleName((AnyContentType)null);
                return;
            case ValidationResultPackage.ERROR_TYPE__ELEMENT:
                setElement((AnyContentType)null);
                return;
            case ValidationResultPackage.ERROR_TYPE__MESSAGE:
                setMessage((AnyContentType)null);
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
            case ValidationResultPackage.ERROR_TYPE__RULE_NAME:
                return ruleName != null;
            case ValidationResultPackage.ERROR_TYPE__ELEMENT:
                return element != null;
            case ValidationResultPackage.ERROR_TYPE__MESSAGE:
                return message != null;
        }
        return super.eIsSet(featureID);
    }

} //ErrorTypeImpl
