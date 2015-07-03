/**
 */
package iso20022.validation.result;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iso20022.validation.result.ValidationResultFactory
 * @model kind="package"
 * @generated
 */
public interface ValidationResultPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "result";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "urn:iso20022:validation:result";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "result";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ValidationResultPackage eINSTANCE = iso20022.validation.result.impl.ValidationResultPackageImpl.init();

    /**
     * The meta object id for the '{@link iso20022.validation.result.impl.AnyContentTypeImpl <em>Any Content Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iso20022.validation.result.impl.AnyContentTypeImpl
     * @see iso20022.validation.result.impl.ValidationResultPackageImpl#getAnyContentType()
     * @generated
     */
    int ANY_CONTENT_TYPE = 0;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_CONTENT_TYPE__MIXED = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT__MIXED;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_CONTENT_TYPE__XMLNS_PREFIX_MAP = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT__XMLNS_PREFIX_MAP;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_CONTENT_TYPE__XSI_SCHEMA_LOCATION = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT__XSI_SCHEMA_LOCATION;

    /**
     * The feature id for the '<em><b>CDATA</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_CONTENT_TYPE__CDATA = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT__CDATA;

    /**
     * The feature id for the '<em><b>Comment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_CONTENT_TYPE__COMMENT = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT__COMMENT;

    /**
     * The feature id for the '<em><b>Processing Instruction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_CONTENT_TYPE__PROCESSING_INSTRUCTION = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT__PROCESSING_INSTRUCTION;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_CONTENT_TYPE__TEXT = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT__TEXT;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_CONTENT_TYPE__ANY = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Any Content Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ANY_CONTENT_TYPE_FEATURE_COUNT = XMLTypePackage.XML_TYPE_DOCUMENT_ROOT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Any Content Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     * @ordered
     */
    int ANY_CONTENT_TYPE_OPERATION_COUNT = /*XMLTypePackage.XML_TYPE_DOCUMENT_ROOT_OPERATION_COUNT +*/ 0;

    /**
     * The meta object id for the '{@link iso20022.validation.result.impl.DocumentRootImpl <em>Document Root</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iso20022.validation.result.impl.DocumentRootImpl
     * @see iso20022.validation.result.impl.ValidationResultPackageImpl#getDocumentRoot()
     * @generated
     */
    int DOCUMENT_ROOT = 1;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__MIXED = 0;

    /**
     * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

    /**
     * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

    /**
     * The feature id for the '<em><b>Error</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__ERROR = 3;

    /**
     * The feature id for the '<em><b>Validation Result</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT__VALIDATION_RESULT = 4;

    /**
     * The number of structural features of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>Document Root</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DOCUMENT_ROOT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link iso20022.validation.result.impl.ErrorTypeImpl <em>Error Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iso20022.validation.result.impl.ErrorTypeImpl
     * @see iso20022.validation.result.impl.ValidationResultPackageImpl#getErrorType()
     * @generated
     */
    int ERROR_TYPE = 2;

    /**
     * The feature id for the '<em><b>Rule Name</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR_TYPE__RULE_NAME = 0;

    /**
     * The feature id for the '<em><b>Element</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR_TYPE__ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Message</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR_TYPE__MESSAGE = 2;

    /**
     * The number of structural features of the '<em>Error Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR_TYPE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Error Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ERROR_TYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link iso20022.validation.result.impl.ValidationResultTypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see iso20022.validation.result.impl.ValidationResultTypeImpl
     * @see iso20022.validation.result.impl.ValidationResultPackageImpl#getValidationResultType()
     * @generated
     */
    int VALIDATION_RESULT_TYPE = 3;

    /**
     * The feature id for the '<em><b>Error</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RESULT_TYPE__ERROR = 0;

    /**
     * The number of structural features of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RESULT_TYPE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VALIDATION_RESULT_TYPE_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link iso20022.validation.result.AnyContentType <em>Any Content Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Any Content Type</em>'.
     * @see iso20022.validation.result.AnyContentType
     * @generated
     */
    EClass getAnyContentType();

    /**
     * Returns the meta object for the attribute list '{@link iso20022.validation.result.AnyContentType#getAny <em>Any</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Any</em>'.
     * @see iso20022.validation.result.AnyContentType#getAny()
     * @see #getAnyContentType()
     * @generated
     */
    EAttribute getAnyContentType_Any();

    /**
     * Returns the meta object for class '{@link iso20022.validation.result.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Document Root</em>'.
     * @see iso20022.validation.result.DocumentRoot
     * @generated
     */
    EClass getDocumentRoot();

    /**
     * Returns the meta object for the attribute list '{@link iso20022.validation.result.DocumentRoot#getMixed <em>Mixed</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Mixed</em>'.
     * @see iso20022.validation.result.DocumentRoot#getMixed()
     * @see #getDocumentRoot()
     * @generated
     */
    EAttribute getDocumentRoot_Mixed();

    /**
     * Returns the meta object for the map '{@link iso20022.validation.result.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
     * @see iso20022.validation.result.DocumentRoot#getXMLNSPrefixMap()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XMLNSPrefixMap();

    /**
     * Returns the meta object for the map '{@link iso20022.validation.result.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the map '<em>XSI Schema Location</em>'.
     * @see iso20022.validation.result.DocumentRoot#getXSISchemaLocation()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_XSISchemaLocation();

    /**
     * Returns the meta object for the containment reference '{@link iso20022.validation.result.DocumentRoot#getError <em>Error</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Error</em>'.
     * @see iso20022.validation.result.DocumentRoot#getError()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_Error();

    /**
     * Returns the meta object for the containment reference '{@link iso20022.validation.result.DocumentRoot#getValidationResult <em>Validation Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Validation Result</em>'.
     * @see iso20022.validation.result.DocumentRoot#getValidationResult()
     * @see #getDocumentRoot()
     * @generated
     */
    EReference getDocumentRoot_ValidationResult();

    /**
     * Returns the meta object for class '{@link iso20022.validation.result.ErrorType <em>Error Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Error Type</em>'.
     * @see iso20022.validation.result.ErrorType
     * @generated
     */
    EClass getErrorType();

    /**
     * Returns the meta object for the containment reference '{@link iso20022.validation.result.ErrorType#getRuleName <em>Rule Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Rule Name</em>'.
     * @see iso20022.validation.result.ErrorType#getRuleName()
     * @see #getErrorType()
     * @generated
     */
    EReference getErrorType_RuleName();

    /**
     * Returns the meta object for the containment reference '{@link iso20022.validation.result.ErrorType#getElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Element</em>'.
     * @see iso20022.validation.result.ErrorType#getElement()
     * @see #getErrorType()
     * @generated
     */
    EReference getErrorType_Element();

    /**
     * Returns the meta object for the containment reference '{@link iso20022.validation.result.ErrorType#getMessage <em>Message</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Message</em>'.
     * @see iso20022.validation.result.ErrorType#getMessage()
     * @see #getErrorType()
     * @generated
     */
    EReference getErrorType_Message();

    /**
     * Returns the meta object for class '{@link iso20022.validation.result.ValidationResultType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type</em>'.
     * @see iso20022.validation.result.ValidationResultType
     * @generated
     */
    EClass getValidationResultType();

    /**
     * Returns the meta object for the containment reference list '{@link iso20022.validation.result.ValidationResultType#getError <em>Error</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Error</em>'.
     * @see iso20022.validation.result.ValidationResultType#getError()
     * @see #getValidationResultType()
     * @generated
     */
    EReference getValidationResultType_Error();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ValidationResultFactory getValidationResultFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link iso20022.validation.result.impl.AnyContentTypeImpl <em>Any Content Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see iso20022.validation.result.impl.AnyContentTypeImpl
         * @see iso20022.validation.result.impl.ValidationResultPackageImpl#getAnyContentType()
         * @generated
         */
        EClass ANY_CONTENT_TYPE = eINSTANCE.getAnyContentType();

        /**
         * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ANY_CONTENT_TYPE__ANY = eINSTANCE.getAnyContentType_Any();

        /**
         * The meta object literal for the '{@link iso20022.validation.result.impl.DocumentRootImpl <em>Document Root</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see iso20022.validation.result.impl.DocumentRootImpl
         * @see iso20022.validation.result.impl.ValidationResultPackageImpl#getDocumentRoot()
         * @generated
         */
        EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

        /**
         * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

        /**
         * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

        /**
         * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

        /**
         * The meta object literal for the '<em><b>Error</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__ERROR = eINSTANCE.getDocumentRoot_Error();

        /**
         * The meta object literal for the '<em><b>Validation Result</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DOCUMENT_ROOT__VALIDATION_RESULT = eINSTANCE.getDocumentRoot_ValidationResult();

        /**
         * The meta object literal for the '{@link iso20022.validation.result.impl.ErrorTypeImpl <em>Error Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see iso20022.validation.result.impl.ErrorTypeImpl
         * @see iso20022.validation.result.impl.ValidationResultPackageImpl#getErrorType()
         * @generated
         */
        EClass ERROR_TYPE = eINSTANCE.getErrorType();

        /**
         * The meta object literal for the '<em><b>Rule Name</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ERROR_TYPE__RULE_NAME = eINSTANCE.getErrorType_RuleName();

        /**
         * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ERROR_TYPE__ELEMENT = eINSTANCE.getErrorType_Element();

        /**
         * The meta object literal for the '<em><b>Message</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ERROR_TYPE__MESSAGE = eINSTANCE.getErrorType_Message();

        /**
         * The meta object literal for the '{@link iso20022.validation.result.impl.ValidationResultTypeImpl <em>Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see iso20022.validation.result.impl.ValidationResultTypeImpl
         * @see iso20022.validation.result.impl.ValidationResultPackageImpl#getValidationResultType()
         * @generated
         */
        EClass VALIDATION_RESULT_TYPE = eINSTANCE.getValidationResultType();

        /**
         * The meta object literal for the '<em><b>Error</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference VALIDATION_RESULT_TYPE__ERROR = eINSTANCE.getValidationResultType_Error();

    }

} //ValidationResultPackage
