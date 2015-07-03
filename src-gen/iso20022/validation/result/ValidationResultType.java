/**
 */
package iso20022.validation.result;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.validation.result.ValidationResultType#getError <em>Error</em>}</li>
 * </ul>
 *
 * @see iso20022.validation.result.ValidationResultPackage#getValidationResultType()
 * @model extendedMetaData="name='validationResultType' kind='elementOnly'"
 * @generated
 */
public interface ValidationResultType extends EObject {
    /**
     * Returns the value of the '<em><b>Error</b></em>' containment reference list.
     * The list contents are of type {@link iso20022.validation.result.ErrorType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Error</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Error</em>' containment reference list.
     * @see iso20022.validation.result.ValidationResultPackage#getValidationResultType_Error()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='error' namespace='##targetNamespace'"
     * @generated
     */
    EList<ErrorType> getError();

} // ValidationResultType
