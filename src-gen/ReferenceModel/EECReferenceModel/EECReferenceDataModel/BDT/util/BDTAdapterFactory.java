/**
 */
package ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.util;

import ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.BDTPackage
 * @generated
 */
public class BDTAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static BDTPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BDTAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = BDTPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BDTSwitch<Adapter> modelSwitch =
        new BDTSwitch<Adapter>() {
            @Override
            public Adapter caseAmountType(AmountType object) {
                return createAmountTypeAdapter();
            }
            @Override
            public Adapter caseCodeType(CodeType object) {
                return createCodeTypeAdapter();
            }
            @Override
            public Adapter caseDateTimeType(DateTimeType object) {
                return createDateTimeTypeAdapter();
            }
            @Override
            public Adapter caseDateType(DateType object) {
                return createDateTypeAdapter();
            }
            @Override
            public Adapter caseGraphicType(GraphicType object) {
                return createGraphicTypeAdapter();
            }
            @Override
            public Adapter caseIdentifierType(IdentifierType object) {
                return createIdentifierTypeAdapter();
            }
            @Override
            public Adapter caseIndicatorType(IndicatorType object) {
                return createIndicatorTypeAdapter();
            }
            @Override
            public Adapter caseMeasureType(MeasureType object) {
                return createMeasureTypeAdapter();
            }
            @Override
            public Adapter caseNameType(NameType object) {
                return createNameTypeAdapter();
            }
            @Override
            public Adapter caseNumberType(NumberType object) {
                return createNumberTypeAdapter();
            }
            @Override
            public Adapter casePercentType(PercentType object) {
                return createPercentTypeAdapter();
            }
            @Override
            public Adapter casePictureType(PictureType object) {
                return createPictureTypeAdapter();
            }
            @Override
            public Adapter caseQuantityType(QuantityType object) {
                return createQuantityTypeAdapter();
            }
            @Override
            public Adapter caseRateType(RateType object) {
                return createRateTypeAdapter();
            }
            @Override
            public Adapter caseSoundType(SoundType object) {
                return createSoundTypeAdapter();
            }
            @Override
            public Adapter caseTextType(TextType object) {
                return createTextTypeAdapter();
            }
            @Override
            public Adapter caseTimeType(TimeType object) {
                return createTimeTypeAdapter();
            }
            @Override
            public Adapter caseValueType(ValueType object) {
                return createValueTypeAdapter();
            }
            @Override
            public Adapter caseVideoType(VideoType object) {
                return createVideoTypeAdapter();
            }
            @Override
            public Adapter caseBinaryTextType(BinaryTextType object) {
                return createBinaryTextTypeAdapter();
            }
            @Override
            public Adapter caseDurationType(DurationType object) {
                return createDurationTypeAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.AmountType <em>Amount Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.AmountType
     * @generated
     */
    public Adapter createAmountTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.CodeType <em>Code Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.CodeType
     * @generated
     */
    public Adapter createCodeTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.DateTimeType <em>Date Time Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.DateTimeType
     * @generated
     */
    public Adapter createDateTimeTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.DateType <em>Date Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.DateType
     * @generated
     */
    public Adapter createDateTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.GraphicType <em>Graphic Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.GraphicType
     * @generated
     */
    public Adapter createGraphicTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.IdentifierType <em>Identifier Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.IdentifierType
     * @generated
     */
    public Adapter createIdentifierTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.IndicatorType <em>Indicator Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.IndicatorType
     * @generated
     */
    public Adapter createIndicatorTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.MeasureType <em>Measure Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.MeasureType
     * @generated
     */
    public Adapter createMeasureTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.NameType <em>Name Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.NameType
     * @generated
     */
    public Adapter createNameTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.NumberType <em>Number Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.NumberType
     * @generated
     */
    public Adapter createNumberTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.PercentType <em>Percent Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.PercentType
     * @generated
     */
    public Adapter createPercentTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.PictureType <em>Picture Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.PictureType
     * @generated
     */
    public Adapter createPictureTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.QuantityType <em>Quantity Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.QuantityType
     * @generated
     */
    public Adapter createQuantityTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.RateType <em>Rate Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.RateType
     * @generated
     */
    public Adapter createRateTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.SoundType <em>Sound Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.SoundType
     * @generated
     */
    public Adapter createSoundTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.TextType <em>Text Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.TextType
     * @generated
     */
    public Adapter createTextTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.TimeType <em>Time Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.TimeType
     * @generated
     */
    public Adapter createTimeTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.ValueType <em>Value Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.ValueType
     * @generated
     */
    public Adapter createValueTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.VideoType <em>Video Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.VideoType
     * @generated
     */
    public Adapter createVideoTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.BinaryTextType <em>Binary Text Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.BinaryTextType
     * @generated
     */
    public Adapter createBinaryTextTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.DurationType <em>Duration Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see ReferenceModel.EECReferenceModel.EECReferenceDataModel.BDT.DurationType
     * @generated
     */
    public Adapter createDurationTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //BDTAdapterFactory
