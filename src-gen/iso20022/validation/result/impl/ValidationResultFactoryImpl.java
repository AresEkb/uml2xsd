/**
 */
package iso20022.validation.result.impl;

import iso20022.validation.result.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ValidationResultFactoryImpl extends EFactoryImpl implements ValidationResultFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ValidationResultFactory init() {
        try {
            ValidationResultFactory theValidationResultFactory = (ValidationResultFactory)EPackage.Registry.INSTANCE.getEFactory(ValidationResultPackage.eNS_URI);
            if (theValidationResultFactory != null) {
                return theValidationResultFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ValidationResultFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValidationResultFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ValidationResultPackage.ANY_CONTENT_TYPE: return createAnyContentType();
            case ValidationResultPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case ValidationResultPackage.ERROR_TYPE: return createErrorType();
            case ValidationResultPackage.VALIDATION_RESULT_TYPE: return createValidationResultType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyContentType createAnyContentType() {
        AnyContentTypeImpl anyContentType = new AnyContentTypeImpl();
        return anyContentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentRoot createDocumentRoot() {
        DocumentRootImpl documentRoot = new DocumentRootImpl();
        return documentRoot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ErrorType createErrorType() {
        ErrorTypeImpl errorType = new ErrorTypeImpl();
        return errorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValidationResultType createValidationResultType() {
        ValidationResultTypeImpl validationResultType = new ValidationResultTypeImpl();
        return validationResultType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValidationResultPackage getValidationResultPackage() {
        return (ValidationResultPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ValidationResultPackage getPackage() {
        return ValidationResultPackage.eINSTANCE;
    }

} //ValidationResultFactoryImpl
