/**
 */
package ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.impl;

import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.AmountType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.BDTFactory;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.BDTPackage;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.BinaryTextType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.CodeType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.DateTimeType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.DateType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.DurationType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.GraphicType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.IdentifierType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.IndicatorType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.MeasureType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.NameType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.NumberType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.PercentType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.PictureType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.QuantityType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.RateType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.SoundType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.TextType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.TimeType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.ValueType;
import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.VideoType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BDTPackageImpl extends EPackageImpl implements BDTPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass amountTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass codeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dateTimeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dateTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass graphicTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass identifierTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass indicatorTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass measureTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nameTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass numberTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass percentTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass pictureTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass quantityTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rateTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass soundTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass textTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass valueTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass videoTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass binaryTextTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass durationTypeEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.BDTPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private BDTPackageImpl() {
        super(eNS_URI, BDTFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link BDTPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static BDTPackage init() {
        if (isInited) return (BDTPackage)EPackage.Registry.INSTANCE.getEPackage(BDTPackage.eNS_URI);

        // Obtain or create and register package
        BDTPackageImpl theBDTPackage = (BDTPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BDTPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BDTPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theBDTPackage.createPackageContents();

        // Initialize created meta-data
        theBDTPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theBDTPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(BDTPackage.eNS_URI, theBDTPackage);
        return theBDTPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAmountType() {
        return amountTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCodeType() {
        return codeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDateTimeType() {
        return dateTimeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDateType() {
        return dateTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGraphicType() {
        return graphicTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIdentifierType() {
        return identifierTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIndicatorType() {
        return indicatorTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMeasureType() {
        return measureTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNameType() {
        return nameTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNumberType() {
        return numberTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPercentType() {
        return percentTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPictureType() {
        return pictureTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQuantityType() {
        return quantityTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRateType() {
        return rateTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSoundType() {
        return soundTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTextType() {
        return textTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimeType() {
        return timeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getValueType() {
        return valueTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVideoType() {
        return videoTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBinaryTextType() {
        return binaryTextTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDurationType() {
        return durationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BDTFactory getBDTFactory() {
        return (BDTFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        amountTypeEClass = createEClass(AMOUNT_TYPE);

        codeTypeEClass = createEClass(CODE_TYPE);

        dateTimeTypeEClass = createEClass(DATE_TIME_TYPE);

        dateTypeEClass = createEClass(DATE_TYPE);

        graphicTypeEClass = createEClass(GRAPHIC_TYPE);

        identifierTypeEClass = createEClass(IDENTIFIER_TYPE);

        indicatorTypeEClass = createEClass(INDICATOR_TYPE);

        measureTypeEClass = createEClass(MEASURE_TYPE);

        nameTypeEClass = createEClass(NAME_TYPE);

        numberTypeEClass = createEClass(NUMBER_TYPE);

        percentTypeEClass = createEClass(PERCENT_TYPE);

        pictureTypeEClass = createEClass(PICTURE_TYPE);

        quantityTypeEClass = createEClass(QUANTITY_TYPE);

        rateTypeEClass = createEClass(RATE_TYPE);

        soundTypeEClass = createEClass(SOUND_TYPE);

        textTypeEClass = createEClass(TEXT_TYPE);

        timeTypeEClass = createEClass(TIME_TYPE);

        valueTypeEClass = createEClass(VALUE_TYPE);

        videoTypeEClass = createEClass(VIDEO_TYPE);

        binaryTextTypeEClass = createEClass(BINARY_TEXT_TYPE);

        durationTypeEClass = createEClass(DURATION_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(amountTypeEClass, AmountType.class, "AmountType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(codeTypeEClass, CodeType.class, "CodeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dateTimeTypeEClass, DateTimeType.class, "DateTimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(dateTypeEClass, DateType.class, "DateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(graphicTypeEClass, GraphicType.class, "GraphicType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(identifierTypeEClass, IdentifierType.class, "IdentifierType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(indicatorTypeEClass, IndicatorType.class, "IndicatorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(measureTypeEClass, MeasureType.class, "MeasureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(nameTypeEClass, NameType.class, "NameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(numberTypeEClass, NumberType.class, "NumberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(percentTypeEClass, PercentType.class, "PercentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(pictureTypeEClass, PictureType.class, "PictureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(quantityTypeEClass, QuantityType.class, "QuantityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(rateTypeEClass, RateType.class, "RateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(soundTypeEClass, SoundType.class, "SoundType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(textTypeEClass, TextType.class, "TextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(timeTypeEClass, TimeType.class, "TimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(valueTypeEClass, ValueType.class, "ValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(videoTypeEClass, VideoType.class, "VideoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(binaryTextTypeEClass, BinaryTextType.class, "BinaryTextType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(durationTypeEClass, DurationType.class, "DurationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //BDTPackageImpl
