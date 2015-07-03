/**
 */
package iso20022.validation.result;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.validation.result.ErrorType#getRuleName <em>Rule Name</em>}</li>
 *   <li>{@link iso20022.validation.result.ErrorType#getElement <em>Element</em>}</li>
 *   <li>{@link iso20022.validation.result.ErrorType#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see iso20022.validation.result.ValidationResultPackage#getErrorType()
 * @model extendedMetaData="name='errorType' kind='elementOnly'"
 * @generated
 */
public interface ErrorType extends EObject {
    /**
     * Returns the value of the '<em><b>Rule Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rule Name</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rule Name</em>' containment reference.
     * @see #setRuleName(AnyContentType)
     * @see iso20022.validation.result.ValidationResultPackage#getErrorType_RuleName()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='ruleName' namespace='##targetNamespace'"
     * @generated
     */
    AnyContentType getRuleName();

    /**
     * Sets the value of the '{@link iso20022.validation.result.ErrorType#getRuleName <em>Rule Name</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rule Name</em>' containment reference.
     * @see #getRuleName()
     * @generated
     */
    void setRuleName(AnyContentType value);

    /**
     * Returns the value of the '<em><b>Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element</em>' containment reference.
     * @see #setElement(AnyContentType)
     * @see iso20022.validation.result.ValidationResultPackage#getErrorType_Element()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace'"
     * @generated
     */
    AnyContentType getElement();

    /**
     * Sets the value of the '{@link iso20022.validation.result.ErrorType#getElement <em>Element</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element</em>' containment reference.
     * @see #getElement()
     * @generated
     */
    void setElement(AnyContentType value);

    /**
     * Returns the value of the '<em><b>Message</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Message</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Message</em>' containment reference.
     * @see #setMessage(AnyContentType)
     * @see iso20022.validation.result.ValidationResultPackage#getErrorType_Message()
     * @model containment="true" required="true"
     *        extendedMetaData="kind='element' name='message' namespace='##targetNamespace'"
     * @generated
     */
    AnyContentType getMessage();

    /**
     * Sets the value of the '{@link iso20022.validation.result.ErrorType#getMessage <em>Message</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Message</em>' containment reference.
     * @see #getMessage()
     * @generated
     */
    void setMessage(AnyContentType value);

} // ErrorType
