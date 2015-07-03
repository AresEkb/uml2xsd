/**
 */
package iso20022.validation.result.impl;

import iso20022.validation.result.ErrorType;
import iso20022.validation.result.ValidationResultPackage;
import iso20022.validation.result.ValidationResultType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iso20022.validation.result.impl.ValidationResultTypeImpl#getError <em>Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValidationResultTypeImpl extends MinimalEObjectImpl.Container implements ValidationResultType {
    /**
     * The cached value of the '{@link #getError() <em>Error</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getError()
     * @generated
     * @ordered
     */
    protected EList<ErrorType> error;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ValidationResultTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ValidationResultPackage.Literals.VALIDATION_RESULT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ErrorType> getError() {
        if (error == null) {
            error = new EObjectContainmentEList<ErrorType>(ErrorType.class, this, ValidationResultPackage.VALIDATION_RESULT_TYPE__ERROR);
        }
        return error;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ValidationResultPackage.VALIDATION_RESULT_TYPE__ERROR:
                return ((InternalEList<?>)getError()).basicRemove(otherEnd, msgs);
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
            case ValidationResultPackage.VALIDATION_RESULT_TYPE__ERROR:
                return getError();
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
            case ValidationResultPackage.VALIDATION_RESULT_TYPE__ERROR:
                getError().clear();
                getError().addAll((Collection<? extends ErrorType>)newValue);
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
            case ValidationResultPackage.VALIDATION_RESULT_TYPE__ERROR:
                getError().clear();
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
            case ValidationResultPackage.VALIDATION_RESULT_TYPE__ERROR:
                return error != null && !error.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ValidationResultTypeImpl
