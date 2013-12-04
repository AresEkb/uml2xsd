/**
 */
package ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.impl;

import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.*;

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
public class BDTFactoryImpl extends EFactoryImpl implements BDTFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static BDTFactory init() {
        try {
            BDTFactory theBDTFactory = (BDTFactory)EPackage.Registry.INSTANCE.getEFactory(BDTPackage.eNS_URI);
            if (theBDTFactory != null) {
                return theBDTFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new BDTFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BDTFactoryImpl() {
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
            case BDTPackage.AMOUNT_TYPE: return createAmountType();
            case BDTPackage.CODE_TYPE: return createCodeType();
            case BDTPackage.DATE_TIME_TYPE: return createDateTimeType();
            case BDTPackage.DATE_TYPE: return createDateType();
            case BDTPackage.GRAPHIC_TYPE: return createGraphicType();
            case BDTPackage.IDENTIFIER_TYPE: return createIdentifierType();
            case BDTPackage.INDICATOR_TYPE: return createIndicatorType();
            case BDTPackage.MEASURE_TYPE: return createMeasureType();
            case BDTPackage.NAME_TYPE: return createNameType();
            case BDTPackage.NUMBER_TYPE: return createNumberType();
            case BDTPackage.PERCENT_TYPE: return createPercentType();
            case BDTPackage.PICTURE_TYPE: return createPictureType();
            case BDTPackage.QUANTITY_TYPE: return createQuantityType();
            case BDTPackage.RATE_TYPE: return createRateType();
            case BDTPackage.SOUND_TYPE: return createSoundType();
            case BDTPackage.TEXT_TYPE: return createTextType();
            case BDTPackage.TIME_TYPE: return createTimeType();
            case BDTPackage.VALUE_TYPE: return createValueType();
            case BDTPackage.VIDEO_TYPE: return createVideoType();
            case BDTPackage.BINARY_TEXT_TYPE: return createBinaryTextType();
            case BDTPackage.DURATION_TYPE: return createDurationType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AmountType createAmountType() {
        AmountTypeImpl amountType = new AmountTypeImpl();
        return amountType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CodeType createCodeType() {
        CodeTypeImpl codeType = new CodeTypeImpl();
        return codeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DateTimeType createDateTimeType() {
        DateTimeTypeImpl dateTimeType = new DateTimeTypeImpl();
        return dateTimeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DateType createDateType() {
        DateTypeImpl dateType = new DateTypeImpl();
        return dateType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GraphicType createGraphicType() {
        GraphicTypeImpl graphicType = new GraphicTypeImpl();
        return graphicType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentifierType createIdentifierType() {
        IdentifierTypeImpl identifierType = new IdentifierTypeImpl();
        return identifierType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IndicatorType createIndicatorType() {
        IndicatorTypeImpl indicatorType = new IndicatorTypeImpl();
        return indicatorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MeasureType createMeasureType() {
        MeasureTypeImpl measureType = new MeasureTypeImpl();
        return measureType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NameType createNameType() {
        NameTypeImpl nameType = new NameTypeImpl();
        return nameType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumberType createNumberType() {
        NumberTypeImpl numberType = new NumberTypeImpl();
        return numberType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PercentType createPercentType() {
        PercentTypeImpl percentType = new PercentTypeImpl();
        return percentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PictureType createPictureType() {
        PictureTypeImpl pictureType = new PictureTypeImpl();
        return pictureType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuantityType createQuantityType() {
        QuantityTypeImpl quantityType = new QuantityTypeImpl();
        return quantityType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RateType createRateType() {
        RateTypeImpl rateType = new RateTypeImpl();
        return rateType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SoundType createSoundType() {
        SoundTypeImpl soundType = new SoundTypeImpl();
        return soundType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TextType createTextType() {
        TextTypeImpl textType = new TextTypeImpl();
        return textType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeType createTimeType() {
        TimeTypeImpl timeType = new TimeTypeImpl();
        return timeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueType createValueType() {
        ValueTypeImpl valueType = new ValueTypeImpl();
        return valueType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VideoType createVideoType() {
        VideoTypeImpl videoType = new VideoTypeImpl();
        return videoType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BinaryTextType createBinaryTextType() {
        BinaryTextTypeImpl binaryTextType = new BinaryTextTypeImpl();
        return binaryTextType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DurationType createDurationType() {
        DurationTypeImpl durationType = new DurationTypeImpl();
        return durationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BDTPackage getBDTPackage() {
        return (BDTPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static BDTPackage getPackage() {
        return BDTPackage.eINSTANCE;
    }

} //BDTFactoryImpl
