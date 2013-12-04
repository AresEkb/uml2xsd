/**
 */
package ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.util;

import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.BDTPackage
 * @generated
 */
public class BDTSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static BDTPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BDTSwitch() {
        if (modelPackage == null) {
            modelPackage = BDTPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case BDTPackage.AMOUNT_TYPE: {
                AmountType amountType = (AmountType)theEObject;
                T result = caseAmountType(amountType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.CODE_TYPE: {
                CodeType codeType = (CodeType)theEObject;
                T result = caseCodeType(codeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.DATE_TIME_TYPE: {
                DateTimeType dateTimeType = (DateTimeType)theEObject;
                T result = caseDateTimeType(dateTimeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.DATE_TYPE: {
                DateType dateType = (DateType)theEObject;
                T result = caseDateType(dateType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.GRAPHIC_TYPE: {
                GraphicType graphicType = (GraphicType)theEObject;
                T result = caseGraphicType(graphicType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.IDENTIFIER_TYPE: {
                IdentifierType identifierType = (IdentifierType)theEObject;
                T result = caseIdentifierType(identifierType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.INDICATOR_TYPE: {
                IndicatorType indicatorType = (IndicatorType)theEObject;
                T result = caseIndicatorType(indicatorType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.MEASURE_TYPE: {
                MeasureType measureType = (MeasureType)theEObject;
                T result = caseMeasureType(measureType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.NAME_TYPE: {
                NameType nameType = (NameType)theEObject;
                T result = caseNameType(nameType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.NUMBER_TYPE: {
                NumberType numberType = (NumberType)theEObject;
                T result = caseNumberType(numberType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.PERCENT_TYPE: {
                PercentType percentType = (PercentType)theEObject;
                T result = casePercentType(percentType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.PICTURE_TYPE: {
                PictureType pictureType = (PictureType)theEObject;
                T result = casePictureType(pictureType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.QUANTITY_TYPE: {
                QuantityType quantityType = (QuantityType)theEObject;
                T result = caseQuantityType(quantityType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.RATE_TYPE: {
                RateType rateType = (RateType)theEObject;
                T result = caseRateType(rateType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.SOUND_TYPE: {
                SoundType soundType = (SoundType)theEObject;
                T result = caseSoundType(soundType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.TEXT_TYPE: {
                TextType textType = (TextType)theEObject;
                T result = caseTextType(textType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.TIME_TYPE: {
                TimeType timeType = (TimeType)theEObject;
                T result = caseTimeType(timeType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.VALUE_TYPE: {
                ValueType valueType = (ValueType)theEObject;
                T result = caseValueType(valueType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.VIDEO_TYPE: {
                VideoType videoType = (VideoType)theEObject;
                T result = caseVideoType(videoType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.BINARY_TEXT_TYPE: {
                BinaryTextType binaryTextType = (BinaryTextType)theEObject;
                T result = caseBinaryTextType(binaryTextType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case BDTPackage.DURATION_TYPE: {
                DurationType durationType = (DurationType)theEObject;
                T result = caseDurationType(durationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Amount Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Amount Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAmountType(AmountType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Code Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Code Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCodeType(CodeType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Date Time Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDateTimeType(DateTimeType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDateType(DateType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Graphic Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Graphic Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGraphicType(GraphicType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identifier Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identifier Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifierType(IdentifierType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Indicator Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Indicator Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIndicatorType(IndicatorType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Measure Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Measure Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMeasureType(MeasureType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Name Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Name Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNameType(NameType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Number Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Number Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumberType(NumberType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Percent Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Percent Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePercentType(PercentType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Picture Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Picture Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePictureType(PictureType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Quantity Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Quantity Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQuantityType(QuantityType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Rate Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Rate Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRateType(RateType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Sound Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Sound Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSoundType(SoundType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Text Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Text Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTextType(TextType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Time Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Time Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimeType(TimeType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseValueType(ValueType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Video Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Video Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVideoType(VideoType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Binary Text Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Binary Text Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBinaryTextType(BinaryTextType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Duration Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Duration Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDurationType(DurationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //BDTSwitch
