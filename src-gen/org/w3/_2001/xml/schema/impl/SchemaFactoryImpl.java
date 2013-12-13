/**
 */
package org.w3._2001.xml.schema.impl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3._2001.xml.schema.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaFactoryImpl extends EFactoryImpl implements SchemaFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static SchemaFactory init() {
        try {
            SchemaFactory theSchemaFactory = (SchemaFactory)EPackage.Registry.INSTANCE.getEFactory(SchemaPackage.eNS_URI);
            if (theSchemaFactory != null) {
                return theSchemaFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new SchemaFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaFactoryImpl() {
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
            case SchemaPackage.ALL: return createAll();
            case SchemaPackage.ALT_TYPE: return createAltType();
            case SchemaPackage.ANNOTATED: return createAnnotated();
            case SchemaPackage.ANNOTATION_TYPE: return createAnnotationType();
            case SchemaPackage.ANY_ATTRIBUTE_TYPE: return createAnyAttributeType();
            case SchemaPackage.ANY_TYPE: return createAnyType();
            case SchemaPackage.APPINFO_TYPE: return createAppinfoType();
            case SchemaPackage.ASSERTION: return createAssertion();
            case SchemaPackage.ATTRIBUTE: return createAttribute();
            case SchemaPackage.ATTRIBUTE_GROUP_REF: return createAttributeGroupRef();
            case SchemaPackage.COMPLEX_CONTENT_TYPE: return createComplexContentType();
            case SchemaPackage.COMPLEX_RESTRICTION_TYPE: return createComplexRestrictionType();
            case SchemaPackage.DEFAULT_OPEN_CONTENT_TYPE: return createDefaultOpenContentType();
            case SchemaPackage.DOCUMENTATION_TYPE: return createDocumentationType();
            case SchemaPackage.DOCUMENT_ROOT: return createDocumentRoot();
            case SchemaPackage.EXPLICIT_GROUP: return createExplicitGroup();
            case SchemaPackage.EXPLICIT_TIMEZONE_TYPE: return createExplicitTimezoneType();
            case SchemaPackage.EXTENSION_TYPE: return createExtensionType();
            case SchemaPackage.FACET: return createFacet();
            case SchemaPackage.FIELD_TYPE: return createFieldType();
            case SchemaPackage.GROUP_REF: return createGroupRef();
            case SchemaPackage.IMPORT_TYPE: return createImportType();
            case SchemaPackage.INCLUDE_TYPE: return createIncludeType();
            case SchemaPackage.INT_FACET: return createIntFacet();
            case SchemaPackage.KEYBASE: return createKeybase();
            case SchemaPackage.KEYREF_TYPE: return createKeyrefType();
            case SchemaPackage.LIST_TYPE: return createListType();
            case SchemaPackage.LOCAL_COMPLEX_TYPE: return createLocalComplexType();
            case SchemaPackage.LOCAL_ELEMENT: return createLocalElement();
            case SchemaPackage.LOCAL_SIMPLE_TYPE: return createLocalSimpleType();
            case SchemaPackage.NAMED_ATTRIBUTE_GROUP: return createNamedAttributeGroup();
            case SchemaPackage.NAMED_GROUP: return createNamedGroup();
            case SchemaPackage.NO_FIXED_FACET: return createNoFixedFacet();
            case SchemaPackage.NOTATION_TYPE: return createNotationType();
            case SchemaPackage.NUM_FACET: return createNumFacet();
            case SchemaPackage.OPEN_ATTRS: return createOpenAttrs();
            case SchemaPackage.OPEN_CONTENT_TYPE: return createOpenContentType();
            case SchemaPackage.OVERRIDE_TYPE: return createOverrideType();
            case SchemaPackage.PATTERN_TYPE: return createPatternType();
            case SchemaPackage.REAL_GROUP: return createRealGroup();
            case SchemaPackage.REDEFINE_TYPE: return createRedefineType();
            case SchemaPackage.RESTRICTION_TYPE: return createRestrictionType();
            case SchemaPackage.RESTRICTION_TYPE1: return createRestrictionType1();
            case SchemaPackage.SCHEMA_TYPE: return createSchemaType();
            case SchemaPackage.SELECTOR_TYPE: return createSelectorType();
            case SchemaPackage.SIMPLE_CONTENT_TYPE: return createSimpleContentType();
            case SchemaPackage.SIMPLE_EXPLICIT_GROUP: return createSimpleExplicitGroup();
            case SchemaPackage.SIMPLE_EXTENSION_TYPE: return createSimpleExtensionType();
            case SchemaPackage.SIMPLE_RESTRICTION_TYPE: return createSimpleRestrictionType();
            case SchemaPackage.TOP_LEVEL_ATTRIBUTE: return createTopLevelAttribute();
            case SchemaPackage.TOP_LEVEL_COMPLEX_TYPE: return createTopLevelComplexType();
            case SchemaPackage.TOP_LEVEL_ELEMENT: return createTopLevelElement();
            case SchemaPackage.TOP_LEVEL_SIMPLE_TYPE: return createTopLevelSimpleType();
            case SchemaPackage.TOTAL_DIGITS_TYPE: return createTotalDigitsType();
            case SchemaPackage.UNION_TYPE: return createUnionType();
            case SchemaPackage.WHITE_SPACE_TYPE: return createWhiteSpaceType();
            case SchemaPackage.WILDCARD: return createWildcard();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case SchemaPackage.ALL_NNI_MEMBER1:
                return createAllNNIMember1FromString(eDataType, initialValue);
            case SchemaPackage.BASIC_NAMESPACE_LIST_ITEM_MEMBER1:
                return createBasicNamespaceListItemMember1FromString(eDataType, initialValue);
            case SchemaPackage.BLOCK_SET_MEMBER0:
                return createBlockSetMember0FromString(eDataType, initialValue);
            case SchemaPackage.BLOCK_SET_MEMBER1_ITEM:
                return createBlockSetMember1ItemFromString(eDataType, initialValue);
            case SchemaPackage.DERIVATION_CONTROL:
                return createDerivationControlFromString(eDataType, initialValue);
            case SchemaPackage.DERIVATION_SET_MEMBER0:
                return createDerivationSetMember0FromString(eDataType, initialValue);
            case SchemaPackage.FORM_CHOICE:
                return createFormChoiceFromString(eDataType, initialValue);
            case SchemaPackage.FULL_DERIVATION_SET_MEMBER0:
                return createFullDerivationSetMember0FromString(eDataType, initialValue);
            case SchemaPackage.MODE_TYPE:
                return createModeTypeFromString(eDataType, initialValue);
            case SchemaPackage.MODE_TYPE1:
                return createModeType1FromString(eDataType, initialValue);
            case SchemaPackage.PROCESS_CONTENTS_TYPE:
                return createProcessContentsTypeFromString(eDataType, initialValue);
            case SchemaPackage.QNAME_LIST_AITEM_MEMBER1:
                return createQnameListAItemMember1FromString(eDataType, initialValue);
            case SchemaPackage.QNAME_LIST_ITEM_MEMBER1:
                return createQnameListItemMember1FromString(eDataType, initialValue);
            case SchemaPackage.REDUCED_DERIVATION_CONTROL:
                return createReducedDerivationControlFromString(eDataType, initialValue);
            case SchemaPackage.SIMPLE_DERIVATION_SET_MEMBER0:
                return createSimpleDerivationSetMember0FromString(eDataType, initialValue);
            case SchemaPackage.SIMPLE_DERIVATION_SET_MEMBER1_ITEM:
                return createSimpleDerivationSetMember1ItemFromString(eDataType, initialValue);
            case SchemaPackage.SPECIAL_NAMESPACE_LIST:
                return createSpecialNamespaceListFromString(eDataType, initialValue);
            case SchemaPackage.TYPE_DERIVATION_CONTROL:
                return createTypeDerivationControlFromString(eDataType, initialValue);
            case SchemaPackage.USE_TYPE:
                return createUseTypeFromString(eDataType, initialValue);
            case SchemaPackage.XPATH_DEFAULT_NAMESPACE_MEMBER1:
                return createXpathDefaultNamespaceMember1FromString(eDataType, initialValue);
            case SchemaPackage.ALL_NNI:
                return createAllNNIFromString(eDataType, initialValue);
            case SchemaPackage.ALL_NNI_MEMBER1_OBJECT:
                return createAllNNIMember1ObjectFromString(eDataType, initialValue);
            case SchemaPackage.BASIC_NAMESPACE_LIST:
                return createBasicNamespaceListFromString(eDataType, initialValue);
            case SchemaPackage.BASIC_NAMESPACE_LIST_ITEM:
                return createBasicNamespaceListItemFromString(eDataType, initialValue);
            case SchemaPackage.BASIC_NAMESPACE_LIST_ITEM_MEMBER1_OBJECT:
                return createBasicNamespaceListItemMember1ObjectFromString(eDataType, initialValue);
            case SchemaPackage.BLOCK_SET:
                return createBlockSetFromString(eDataType, initialValue);
            case SchemaPackage.BLOCK_SET_MEMBER0_OBJECT:
                return createBlockSetMember0ObjectFromString(eDataType, initialValue);
            case SchemaPackage.BLOCK_SET_MEMBER1:
                return createBlockSetMember1FromString(eDataType, initialValue);
            case SchemaPackage.BLOCK_SET_MEMBER1_ITEM_OBJECT:
                return createBlockSetMember1ItemObjectFromString(eDataType, initialValue);
            case SchemaPackage.DERIVATION_CONTROL_OBJECT:
                return createDerivationControlObjectFromString(eDataType, initialValue);
            case SchemaPackage.DERIVATION_SET:
                return createDerivationSetFromString(eDataType, initialValue);
            case SchemaPackage.DERIVATION_SET_MEMBER0_OBJECT:
                return createDerivationSetMember0ObjectFromString(eDataType, initialValue);
            case SchemaPackage.DERIVATION_SET_MEMBER1:
                return createDerivationSetMember1FromString(eDataType, initialValue);
            case SchemaPackage.FORM_CHOICE_OBJECT:
                return createFormChoiceObjectFromString(eDataType, initialValue);
            case SchemaPackage.FULL_DERIVATION_SET:
                return createFullDerivationSetFromString(eDataType, initialValue);
            case SchemaPackage.FULL_DERIVATION_SET_MEMBER0_OBJECT:
                return createFullDerivationSetMember0ObjectFromString(eDataType, initialValue);
            case SchemaPackage.FULL_DERIVATION_SET_MEMBER1:
                return createFullDerivationSetMember1FromString(eDataType, initialValue);
            case SchemaPackage.MEMBER_TYPES_TYPE:
                return createMemberTypesTypeFromString(eDataType, initialValue);
            case SchemaPackage.MODE_TYPE_OBJECT:
                return createModeTypeObjectFromString(eDataType, initialValue);
            case SchemaPackage.MODE_TYPE_OBJECT1:
                return createModeTypeObject1FromString(eDataType, initialValue);
            case SchemaPackage.NAMESPACE_LIST:
                return createNamespaceListFromString(eDataType, initialValue);
            case SchemaPackage.NOT_NAMESPACE_TYPE:
                return createNotNamespaceTypeFromString(eDataType, initialValue);
            case SchemaPackage.PROCESS_CONTENTS_TYPE_OBJECT:
                return createProcessContentsTypeObjectFromString(eDataType, initialValue);
            case SchemaPackage.PUBLIC:
                return createPublicFromString(eDataType, initialValue);
            case SchemaPackage.QNAME_LIST:
                return createQnameListFromString(eDataType, initialValue);
            case SchemaPackage.QNAME_LIST_A:
                return createQnameListAFromString(eDataType, initialValue);
            case SchemaPackage.QNAME_LIST_AITEM:
                return createQnameListAItemFromString(eDataType, initialValue);
            case SchemaPackage.QNAME_LIST_AITEM_MEMBER1_OBJECT:
                return createQnameListAItemMember1ObjectFromString(eDataType, initialValue);
            case SchemaPackage.QNAME_LIST_ITEM:
                return createQnameListItemFromString(eDataType, initialValue);
            case SchemaPackage.QNAME_LIST_ITEM_MEMBER1_OBJECT:
                return createQnameListItemMember1ObjectFromString(eDataType, initialValue);
            case SchemaPackage.REDUCED_DERIVATION_CONTROL_OBJECT:
                return createReducedDerivationControlObjectFromString(eDataType, initialValue);
            case SchemaPackage.SIMPLE_DERIVATION_SET:
                return createSimpleDerivationSetFromString(eDataType, initialValue);
            case SchemaPackage.SIMPLE_DERIVATION_SET_MEMBER0_OBJECT:
                return createSimpleDerivationSetMember0ObjectFromString(eDataType, initialValue);
            case SchemaPackage.SIMPLE_DERIVATION_SET_MEMBER1:
                return createSimpleDerivationSetMember1FromString(eDataType, initialValue);
            case SchemaPackage.SIMPLE_DERIVATION_SET_MEMBER1_ITEM_OBJECT:
                return createSimpleDerivationSetMember1ItemObjectFromString(eDataType, initialValue);
            case SchemaPackage.SPECIAL_NAMESPACE_LIST_OBJECT:
                return createSpecialNamespaceListObjectFromString(eDataType, initialValue);
            case SchemaPackage.SUBSTITUTION_GROUP_TYPE:
                return createSubstitutionGroupTypeFromString(eDataType, initialValue);
            case SchemaPackage.TYPE_DERIVATION_CONTROL_OBJECT:
                return createTypeDerivationControlObjectFromString(eDataType, initialValue);
            case SchemaPackage.USE_TYPE_OBJECT:
                return createUseTypeObjectFromString(eDataType, initialValue);
            case SchemaPackage.XPATH_DEFAULT_NAMESPACE:
                return createXpathDefaultNamespaceFromString(eDataType, initialValue);
            case SchemaPackage.XPATH_DEFAULT_NAMESPACE_MEMBER1_OBJECT:
                return createXpathDefaultNamespaceMember1ObjectFromString(eDataType, initialValue);
            case SchemaPackage.XPATH_TYPE:
                return createXpathTypeFromString(eDataType, initialValue);
            case SchemaPackage.XPATH_TYPE1:
                return createXpathType1FromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case SchemaPackage.ALL_NNI_MEMBER1:
                return convertAllNNIMember1ToString(eDataType, instanceValue);
            case SchemaPackage.BASIC_NAMESPACE_LIST_ITEM_MEMBER1:
                return convertBasicNamespaceListItemMember1ToString(eDataType, instanceValue);
            case SchemaPackage.BLOCK_SET_MEMBER0:
                return convertBlockSetMember0ToString(eDataType, instanceValue);
            case SchemaPackage.BLOCK_SET_MEMBER1_ITEM:
                return convertBlockSetMember1ItemToString(eDataType, instanceValue);
            case SchemaPackage.DERIVATION_CONTROL:
                return convertDerivationControlToString(eDataType, instanceValue);
            case SchemaPackage.DERIVATION_SET_MEMBER0:
                return convertDerivationSetMember0ToString(eDataType, instanceValue);
            case SchemaPackage.FORM_CHOICE:
                return convertFormChoiceToString(eDataType, instanceValue);
            case SchemaPackage.FULL_DERIVATION_SET_MEMBER0:
                return convertFullDerivationSetMember0ToString(eDataType, instanceValue);
            case SchemaPackage.MODE_TYPE:
                return convertModeTypeToString(eDataType, instanceValue);
            case SchemaPackage.MODE_TYPE1:
                return convertModeType1ToString(eDataType, instanceValue);
            case SchemaPackage.PROCESS_CONTENTS_TYPE:
                return convertProcessContentsTypeToString(eDataType, instanceValue);
            case SchemaPackage.QNAME_LIST_AITEM_MEMBER1:
                return convertQnameListAItemMember1ToString(eDataType, instanceValue);
            case SchemaPackage.QNAME_LIST_ITEM_MEMBER1:
                return convertQnameListItemMember1ToString(eDataType, instanceValue);
            case SchemaPackage.REDUCED_DERIVATION_CONTROL:
                return convertReducedDerivationControlToString(eDataType, instanceValue);
            case SchemaPackage.SIMPLE_DERIVATION_SET_MEMBER0:
                return convertSimpleDerivationSetMember0ToString(eDataType, instanceValue);
            case SchemaPackage.SIMPLE_DERIVATION_SET_MEMBER1_ITEM:
                return convertSimpleDerivationSetMember1ItemToString(eDataType, instanceValue);
            case SchemaPackage.SPECIAL_NAMESPACE_LIST:
                return convertSpecialNamespaceListToString(eDataType, instanceValue);
            case SchemaPackage.TYPE_DERIVATION_CONTROL:
                return convertTypeDerivationControlToString(eDataType, instanceValue);
            case SchemaPackage.USE_TYPE:
                return convertUseTypeToString(eDataType, instanceValue);
            case SchemaPackage.XPATH_DEFAULT_NAMESPACE_MEMBER1:
                return convertXpathDefaultNamespaceMember1ToString(eDataType, instanceValue);
            case SchemaPackage.ALL_NNI:
                return convertAllNNIToString(eDataType, instanceValue);
            case SchemaPackage.ALL_NNI_MEMBER1_OBJECT:
                return convertAllNNIMember1ObjectToString(eDataType, instanceValue);
            case SchemaPackage.BASIC_NAMESPACE_LIST:
                return convertBasicNamespaceListToString(eDataType, instanceValue);
            case SchemaPackage.BASIC_NAMESPACE_LIST_ITEM:
                return convertBasicNamespaceListItemToString(eDataType, instanceValue);
            case SchemaPackage.BASIC_NAMESPACE_LIST_ITEM_MEMBER1_OBJECT:
                return convertBasicNamespaceListItemMember1ObjectToString(eDataType, instanceValue);
            case SchemaPackage.BLOCK_SET:
                return convertBlockSetToString(eDataType, instanceValue);
            case SchemaPackage.BLOCK_SET_MEMBER0_OBJECT:
                return convertBlockSetMember0ObjectToString(eDataType, instanceValue);
            case SchemaPackage.BLOCK_SET_MEMBER1:
                return convertBlockSetMember1ToString(eDataType, instanceValue);
            case SchemaPackage.BLOCK_SET_MEMBER1_ITEM_OBJECT:
                return convertBlockSetMember1ItemObjectToString(eDataType, instanceValue);
            case SchemaPackage.DERIVATION_CONTROL_OBJECT:
                return convertDerivationControlObjectToString(eDataType, instanceValue);
            case SchemaPackage.DERIVATION_SET:
                return convertDerivationSetToString(eDataType, instanceValue);
            case SchemaPackage.DERIVATION_SET_MEMBER0_OBJECT:
                return convertDerivationSetMember0ObjectToString(eDataType, instanceValue);
            case SchemaPackage.DERIVATION_SET_MEMBER1:
                return convertDerivationSetMember1ToString(eDataType, instanceValue);
            case SchemaPackage.FORM_CHOICE_OBJECT:
                return convertFormChoiceObjectToString(eDataType, instanceValue);
            case SchemaPackage.FULL_DERIVATION_SET:
                return convertFullDerivationSetToString(eDataType, instanceValue);
            case SchemaPackage.FULL_DERIVATION_SET_MEMBER0_OBJECT:
                return convertFullDerivationSetMember0ObjectToString(eDataType, instanceValue);
            case SchemaPackage.FULL_DERIVATION_SET_MEMBER1:
                return convertFullDerivationSetMember1ToString(eDataType, instanceValue);
            case SchemaPackage.MEMBER_TYPES_TYPE:
                return convertMemberTypesTypeToString(eDataType, instanceValue);
            case SchemaPackage.MODE_TYPE_OBJECT:
                return convertModeTypeObjectToString(eDataType, instanceValue);
            case SchemaPackage.MODE_TYPE_OBJECT1:
                return convertModeTypeObject1ToString(eDataType, instanceValue);
            case SchemaPackage.NAMESPACE_LIST:
                return convertNamespaceListToString(eDataType, instanceValue);
            case SchemaPackage.NOT_NAMESPACE_TYPE:
                return convertNotNamespaceTypeToString(eDataType, instanceValue);
            case SchemaPackage.PROCESS_CONTENTS_TYPE_OBJECT:
                return convertProcessContentsTypeObjectToString(eDataType, instanceValue);
            case SchemaPackage.PUBLIC:
                return convertPublicToString(eDataType, instanceValue);
            case SchemaPackage.QNAME_LIST:
                return convertQnameListToString(eDataType, instanceValue);
            case SchemaPackage.QNAME_LIST_A:
                return convertQnameListAToString(eDataType, instanceValue);
            case SchemaPackage.QNAME_LIST_AITEM:
                return convertQnameListAItemToString(eDataType, instanceValue);
            case SchemaPackage.QNAME_LIST_AITEM_MEMBER1_OBJECT:
                return convertQnameListAItemMember1ObjectToString(eDataType, instanceValue);
            case SchemaPackage.QNAME_LIST_ITEM:
                return convertQnameListItemToString(eDataType, instanceValue);
            case SchemaPackage.QNAME_LIST_ITEM_MEMBER1_OBJECT:
                return convertQnameListItemMember1ObjectToString(eDataType, instanceValue);
            case SchemaPackage.REDUCED_DERIVATION_CONTROL_OBJECT:
                return convertReducedDerivationControlObjectToString(eDataType, instanceValue);
            case SchemaPackage.SIMPLE_DERIVATION_SET:
                return convertSimpleDerivationSetToString(eDataType, instanceValue);
            case SchemaPackage.SIMPLE_DERIVATION_SET_MEMBER0_OBJECT:
                return convertSimpleDerivationSetMember0ObjectToString(eDataType, instanceValue);
            case SchemaPackage.SIMPLE_DERIVATION_SET_MEMBER1:
                return convertSimpleDerivationSetMember1ToString(eDataType, instanceValue);
            case SchemaPackage.SIMPLE_DERIVATION_SET_MEMBER1_ITEM_OBJECT:
                return convertSimpleDerivationSetMember1ItemObjectToString(eDataType, instanceValue);
            case SchemaPackage.SPECIAL_NAMESPACE_LIST_OBJECT:
                return convertSpecialNamespaceListObjectToString(eDataType, instanceValue);
            case SchemaPackage.SUBSTITUTION_GROUP_TYPE:
                return convertSubstitutionGroupTypeToString(eDataType, instanceValue);
            case SchemaPackage.TYPE_DERIVATION_CONTROL_OBJECT:
                return convertTypeDerivationControlObjectToString(eDataType, instanceValue);
            case SchemaPackage.USE_TYPE_OBJECT:
                return convertUseTypeObjectToString(eDataType, instanceValue);
            case SchemaPackage.XPATH_DEFAULT_NAMESPACE:
                return convertXpathDefaultNamespaceToString(eDataType, instanceValue);
            case SchemaPackage.XPATH_DEFAULT_NAMESPACE_MEMBER1_OBJECT:
                return convertXpathDefaultNamespaceMember1ObjectToString(eDataType, instanceValue);
            case SchemaPackage.XPATH_TYPE:
                return convertXpathTypeToString(eDataType, instanceValue);
            case SchemaPackage.XPATH_TYPE1:
                return convertXpathType1ToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public All createAll() {
        AllImpl all = new AllImpl();
        return all;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AltType createAltType() {
        AltTypeImpl altType = new AltTypeImpl();
        return altType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Annotated createAnnotated() {
        AnnotatedImpl annotated = new AnnotatedImpl();
        return annotated;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnnotationType createAnnotationType() {
        AnnotationTypeImpl annotationType = new AnnotationTypeImpl();
        return annotationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyAttributeType createAnyAttributeType() {
        AnyAttributeTypeImpl anyAttributeType = new AnyAttributeTypeImpl();
        return anyAttributeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyType createAnyType() {
        AnyTypeImpl anyType = new AnyTypeImpl();
        return anyType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AppinfoType createAppinfoType() {
        AppinfoTypeImpl appinfoType = new AppinfoTypeImpl();
        return appinfoType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Assertion createAssertion() {
        AssertionImpl assertion = new AssertionImpl();
        return assertion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Attribute createAttribute() {
        AttributeImpl attribute = new AttributeImpl();
        return attribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeGroupRef createAttributeGroupRef() {
        AttributeGroupRefImpl attributeGroupRef = new AttributeGroupRefImpl();
        return attributeGroupRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexContentType createComplexContentType() {
        ComplexContentTypeImpl complexContentType = new ComplexContentTypeImpl();
        return complexContentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexRestrictionType createComplexRestrictionType() {
        ComplexRestrictionTypeImpl complexRestrictionType = new ComplexRestrictionTypeImpl();
        return complexRestrictionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultOpenContentType createDefaultOpenContentType() {
        DefaultOpenContentTypeImpl defaultOpenContentType = new DefaultOpenContentTypeImpl();
        return defaultOpenContentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentationType createDocumentationType() {
        DocumentationTypeImpl documentationType = new DocumentationTypeImpl();
        return documentationType;
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
    public ExplicitGroup createExplicitGroup() {
        ExplicitGroupImpl explicitGroup = new ExplicitGroupImpl();
        return explicitGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExplicitTimezoneType createExplicitTimezoneType() {
        ExplicitTimezoneTypeImpl explicitTimezoneType = new ExplicitTimezoneTypeImpl();
        return explicitTimezoneType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtensionType createExtensionType() {
        ExtensionTypeImpl extensionType = new ExtensionTypeImpl();
        return extensionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Facet createFacet() {
        FacetImpl facet = new FacetImpl();
        return facet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FieldType createFieldType() {
        FieldTypeImpl fieldType = new FieldTypeImpl();
        return fieldType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GroupRef createGroupRef() {
        GroupRefImpl groupRef = new GroupRefImpl();
        return groupRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImportType createImportType() {
        ImportTypeImpl importType = new ImportTypeImpl();
        return importType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IncludeType createIncludeType() {
        IncludeTypeImpl includeType = new IncludeTypeImpl();
        return includeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntFacet createIntFacet() {
        IntFacetImpl intFacet = new IntFacetImpl();
        return intFacet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Keybase createKeybase() {
        KeybaseImpl keybase = new KeybaseImpl();
        return keybase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KeyrefType createKeyrefType() {
        KeyrefTypeImpl keyrefType = new KeyrefTypeImpl();
        return keyrefType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ListType createListType() {
        ListTypeImpl listType = new ListTypeImpl();
        return listType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalComplexType createLocalComplexType() {
        LocalComplexTypeImpl localComplexType = new LocalComplexTypeImpl();
        return localComplexType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalElement createLocalElement() {
        LocalElementImpl localElement = new LocalElementImpl();
        return localElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalSimpleType createLocalSimpleType() {
        LocalSimpleTypeImpl localSimpleType = new LocalSimpleTypeImpl();
        return localSimpleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedAttributeGroup createNamedAttributeGroup() {
        NamedAttributeGroupImpl namedAttributeGroup = new NamedAttributeGroupImpl();
        return namedAttributeGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedGroup createNamedGroup() {
        NamedGroupImpl namedGroup = new NamedGroupImpl();
        return namedGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NoFixedFacet createNoFixedFacet() {
        NoFixedFacetImpl noFixedFacet = new NoFixedFacetImpl();
        return noFixedFacet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotationType createNotationType() {
        NotationTypeImpl notationType = new NotationTypeImpl();
        return notationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumFacet createNumFacet() {
        NumFacetImpl numFacet = new NumFacetImpl();
        return numFacet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpenAttrs createOpenAttrs() {
        OpenAttrsImpl openAttrs = new OpenAttrsImpl();
        return openAttrs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpenContentType createOpenContentType() {
        OpenContentTypeImpl openContentType = new OpenContentTypeImpl();
        return openContentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OverrideType createOverrideType() {
        OverrideTypeImpl overrideType = new OverrideTypeImpl();
        return overrideType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternType createPatternType() {
        PatternTypeImpl patternType = new PatternTypeImpl();
        return patternType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RealGroup createRealGroup() {
        RealGroupImpl realGroup = new RealGroupImpl();
        return realGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RedefineType createRedefineType() {
        RedefineTypeImpl redefineType = new RedefineTypeImpl();
        return redefineType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RestrictionType createRestrictionType() {
        RestrictionTypeImpl restrictionType = new RestrictionTypeImpl();
        return restrictionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RestrictionType1 createRestrictionType1() {
        RestrictionType1Impl restrictionType1 = new RestrictionType1Impl();
        return restrictionType1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaType createSchemaType() {
        SchemaTypeImpl schemaType = new SchemaTypeImpl();
        return schemaType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SelectorType createSelectorType() {
        SelectorTypeImpl selectorType = new SelectorTypeImpl();
        return selectorType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleContentType createSimpleContentType() {
        SimpleContentTypeImpl simpleContentType = new SimpleContentTypeImpl();
        return simpleContentType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleExplicitGroup createSimpleExplicitGroup() {
        SimpleExplicitGroupImpl simpleExplicitGroup = new SimpleExplicitGroupImpl();
        return simpleExplicitGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleExtensionType createSimpleExtensionType() {
        SimpleExtensionTypeImpl simpleExtensionType = new SimpleExtensionTypeImpl();
        return simpleExtensionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleRestrictionType createSimpleRestrictionType() {
        SimpleRestrictionTypeImpl simpleRestrictionType = new SimpleRestrictionTypeImpl();
        return simpleRestrictionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TopLevelAttribute createTopLevelAttribute() {
        TopLevelAttributeImpl topLevelAttribute = new TopLevelAttributeImpl();
        return topLevelAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TopLevelComplexType createTopLevelComplexType() {
        TopLevelComplexTypeImpl topLevelComplexType = new TopLevelComplexTypeImpl();
        return topLevelComplexType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TopLevelElement createTopLevelElement() {
        TopLevelElementImpl topLevelElement = new TopLevelElementImpl();
        return topLevelElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TopLevelSimpleType createTopLevelSimpleType() {
        TopLevelSimpleTypeImpl topLevelSimpleType = new TopLevelSimpleTypeImpl();
        return topLevelSimpleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TotalDigitsType createTotalDigitsType() {
        TotalDigitsTypeImpl totalDigitsType = new TotalDigitsTypeImpl();
        return totalDigitsType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnionType createUnionType() {
        UnionTypeImpl unionType = new UnionTypeImpl();
        return unionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WhiteSpaceType createWhiteSpaceType() {
        WhiteSpaceTypeImpl whiteSpaceType = new WhiteSpaceTypeImpl();
        return whiteSpaceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Wildcard createWildcard() {
        WildcardImpl wildcard = new WildcardImpl();
        return wildcard;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AllNNIMember1 createAllNNIMember1FromString(EDataType eDataType, String initialValue) {
        AllNNIMember1 result = AllNNIMember1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAllNNIMember1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BasicNamespaceListItemMember1 createBasicNamespaceListItemMember1FromString(EDataType eDataType, String initialValue) {
        BasicNamespaceListItemMember1 result = BasicNamespaceListItemMember1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBasicNamespaceListItemMember1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BlockSetMember0 createBlockSetMember0FromString(EDataType eDataType, String initialValue) {
        BlockSetMember0 result = BlockSetMember0.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBlockSetMember0ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BlockSetMember1Item createBlockSetMember1ItemFromString(EDataType eDataType, String initialValue) {
        BlockSetMember1Item result = BlockSetMember1Item.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBlockSetMember1ItemToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DerivationControl createDerivationControlFromString(EDataType eDataType, String initialValue) {
        DerivationControl result = DerivationControl.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDerivationControlToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DerivationSetMember0 createDerivationSetMember0FromString(EDataType eDataType, String initialValue) {
        DerivationSetMember0 result = DerivationSetMember0.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDerivationSetMember0ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormChoice createFormChoiceFromString(EDataType eDataType, String initialValue) {
        FormChoice result = FormChoice.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFormChoiceToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FullDerivationSetMember0 createFullDerivationSetMember0FromString(EDataType eDataType, String initialValue) {
        FullDerivationSetMember0 result = FullDerivationSetMember0.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFullDerivationSetMember0ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModeType createModeTypeFromString(EDataType eDataType, String initialValue) {
        ModeType result = ModeType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModeTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModeType1 createModeType1FromString(EDataType eDataType, String initialValue) {
        ModeType1 result = ModeType1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModeType1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessContentsType createProcessContentsTypeFromString(EDataType eDataType, String initialValue) {
        ProcessContentsType result = ProcessContentsType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProcessContentsTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QnameListAItemMember1 createQnameListAItemMember1FromString(EDataType eDataType, String initialValue) {
        QnameListAItemMember1 result = QnameListAItemMember1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertQnameListAItemMember1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QnameListItemMember1 createQnameListItemMember1FromString(EDataType eDataType, String initialValue) {
        QnameListItemMember1 result = QnameListItemMember1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertQnameListItemMember1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReducedDerivationControl createReducedDerivationControlFromString(EDataType eDataType, String initialValue) {
        ReducedDerivationControl result = ReducedDerivationControl.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertReducedDerivationControlToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleDerivationSetMember0 createSimpleDerivationSetMember0FromString(EDataType eDataType, String initialValue) {
        SimpleDerivationSetMember0 result = SimpleDerivationSetMember0.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSimpleDerivationSetMember0ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleDerivationSetMember1Item createSimpleDerivationSetMember1ItemFromString(EDataType eDataType, String initialValue) {
        SimpleDerivationSetMember1Item result = SimpleDerivationSetMember1Item.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSimpleDerivationSetMember1ItemToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecialNamespaceList createSpecialNamespaceListFromString(EDataType eDataType, String initialValue) {
        SpecialNamespaceList result = SpecialNamespaceList.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSpecialNamespaceListToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeDerivationControl createTypeDerivationControlFromString(EDataType eDataType, String initialValue) {
        TypeDerivationControl result = TypeDerivationControl.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTypeDerivationControlToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseType createUseTypeFromString(EDataType eDataType, String initialValue) {
        UseType result = UseType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUseTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XpathDefaultNamespaceMember1 createXpathDefaultNamespaceMember1FromString(EDataType eDataType, String initialValue) {
        XpathDefaultNamespaceMember1 result = XpathDefaultNamespaceMember1.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertXpathDefaultNamespaceMember1ToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createAllNNIFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createAllNNIMember1FromString(SchemaPackage.Literals.ALL_NNI_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAllNNIToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XMLTypePackage.Literals.NON_NEGATIVE_INTEGER.isInstance(instanceValue)) {
            try {
                String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (SchemaPackage.Literals.ALL_NNI_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertAllNNIMember1ToString(SchemaPackage.Literals.ALL_NNI_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AllNNIMember1 createAllNNIMember1ObjectFromString(EDataType eDataType, String initialValue) {
        return createAllNNIMember1FromString(SchemaPackage.Literals.ALL_NNI_MEMBER1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAllNNIMember1ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertAllNNIMember1ToString(SchemaPackage.Literals.ALL_NNI_MEMBER1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Object> createBasicNamespaceListFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<Object> result = new ArrayList<Object>();
        for (String item : split(initialValue)) {
            result.add(createBasicNamespaceListItemFromString(SchemaPackage.Literals.BASIC_NAMESPACE_LIST_ITEM, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBasicNamespaceListToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(convertBasicNamespaceListItemToString(SchemaPackage.Literals.BASIC_NAMESPACE_LIST_ITEM, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createBasicNamespaceListItemFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createBasicNamespaceListItemMember1FromString(SchemaPackage.Literals.BASIC_NAMESPACE_LIST_ITEM_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBasicNamespaceListItemToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
            try {
                String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (SchemaPackage.Literals.BASIC_NAMESPACE_LIST_ITEM_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertBasicNamespaceListItemMember1ToString(SchemaPackage.Literals.BASIC_NAMESPACE_LIST_ITEM_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BasicNamespaceListItemMember1 createBasicNamespaceListItemMember1ObjectFromString(EDataType eDataType, String initialValue) {
        return createBasicNamespaceListItemMember1FromString(SchemaPackage.Literals.BASIC_NAMESPACE_LIST_ITEM_MEMBER1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBasicNamespaceListItemMember1ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertBasicNamespaceListItemMember1ToString(SchemaPackage.Literals.BASIC_NAMESPACE_LIST_ITEM_MEMBER1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createBlockSetFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = createBlockSetMember0FromString(SchemaPackage.Literals.BLOCK_SET_MEMBER0, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createBlockSetMember1FromString(SchemaPackage.Literals.BLOCK_SET_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBlockSetToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (SchemaPackage.Literals.BLOCK_SET_MEMBER0.isInstance(instanceValue)) {
            try {
                String value = convertBlockSetMember0ToString(SchemaPackage.Literals.BLOCK_SET_MEMBER0, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (SchemaPackage.Literals.BLOCK_SET_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertBlockSetMember1ToString(SchemaPackage.Literals.BLOCK_SET_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BlockSetMember0 createBlockSetMember0ObjectFromString(EDataType eDataType, String initialValue) {
        return createBlockSetMember0FromString(SchemaPackage.Literals.BLOCK_SET_MEMBER0, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBlockSetMember0ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertBlockSetMember0ToString(SchemaPackage.Literals.BLOCK_SET_MEMBER0, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<BlockSetMember1Item> createBlockSetMember1FromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<BlockSetMember1Item> result = new ArrayList<BlockSetMember1Item>();
        for (String item : split(initialValue)) {
            result.add(createBlockSetMember1ItemFromString(SchemaPackage.Literals.BLOCK_SET_MEMBER1_ITEM, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBlockSetMember1ToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(convertBlockSetMember1ItemToString(SchemaPackage.Literals.BLOCK_SET_MEMBER1_ITEM, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BlockSetMember1Item createBlockSetMember1ItemObjectFromString(EDataType eDataType, String initialValue) {
        return createBlockSetMember1ItemFromString(SchemaPackage.Literals.BLOCK_SET_MEMBER1_ITEM, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBlockSetMember1ItemObjectToString(EDataType eDataType, Object instanceValue) {
        return convertBlockSetMember1ItemToString(SchemaPackage.Literals.BLOCK_SET_MEMBER1_ITEM, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DerivationControl createDerivationControlObjectFromString(EDataType eDataType, String initialValue) {
        return createDerivationControlFromString(SchemaPackage.Literals.DERIVATION_CONTROL, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDerivationControlObjectToString(EDataType eDataType, Object instanceValue) {
        return convertDerivationControlToString(SchemaPackage.Literals.DERIVATION_CONTROL, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createDerivationSetFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = createDerivationSetMember0FromString(SchemaPackage.Literals.DERIVATION_SET_MEMBER0, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createDerivationSetMember1FromString(SchemaPackage.Literals.DERIVATION_SET_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDerivationSetToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (SchemaPackage.Literals.DERIVATION_SET_MEMBER0.isInstance(instanceValue)) {
            try {
                String value = convertDerivationSetMember0ToString(SchemaPackage.Literals.DERIVATION_SET_MEMBER0, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (SchemaPackage.Literals.DERIVATION_SET_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertDerivationSetMember1ToString(SchemaPackage.Literals.DERIVATION_SET_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DerivationSetMember0 createDerivationSetMember0ObjectFromString(EDataType eDataType, String initialValue) {
        return createDerivationSetMember0FromString(SchemaPackage.Literals.DERIVATION_SET_MEMBER0, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDerivationSetMember0ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertDerivationSetMember0ToString(SchemaPackage.Literals.DERIVATION_SET_MEMBER0, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<ReducedDerivationControl> createDerivationSetMember1FromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<ReducedDerivationControl> result = new ArrayList<ReducedDerivationControl>();
        for (String item : split(initialValue)) {
            result.add(createReducedDerivationControlFromString(SchemaPackage.Literals.REDUCED_DERIVATION_CONTROL, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDerivationSetMember1ToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(convertReducedDerivationControlToString(SchemaPackage.Literals.REDUCED_DERIVATION_CONTROL, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormChoice createFormChoiceObjectFromString(EDataType eDataType, String initialValue) {
        return createFormChoiceFromString(SchemaPackage.Literals.FORM_CHOICE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFormChoiceObjectToString(EDataType eDataType, Object instanceValue) {
        return convertFormChoiceToString(SchemaPackage.Literals.FORM_CHOICE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createFullDerivationSetFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = createFullDerivationSetMember0FromString(SchemaPackage.Literals.FULL_DERIVATION_SET_MEMBER0, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createFullDerivationSetMember1FromString(SchemaPackage.Literals.FULL_DERIVATION_SET_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFullDerivationSetToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (SchemaPackage.Literals.FULL_DERIVATION_SET_MEMBER0.isInstance(instanceValue)) {
            try {
                String value = convertFullDerivationSetMember0ToString(SchemaPackage.Literals.FULL_DERIVATION_SET_MEMBER0, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (SchemaPackage.Literals.FULL_DERIVATION_SET_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertFullDerivationSetMember1ToString(SchemaPackage.Literals.FULL_DERIVATION_SET_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FullDerivationSetMember0 createFullDerivationSetMember0ObjectFromString(EDataType eDataType, String initialValue) {
        return createFullDerivationSetMember0FromString(SchemaPackage.Literals.FULL_DERIVATION_SET_MEMBER0, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFullDerivationSetMember0ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertFullDerivationSetMember0ToString(SchemaPackage.Literals.FULL_DERIVATION_SET_MEMBER0, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<TypeDerivationControl> createFullDerivationSetMember1FromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<TypeDerivationControl> result = new ArrayList<TypeDerivationControl>();
        for (String item : split(initialValue)) {
            result.add(createTypeDerivationControlFromString(SchemaPackage.Literals.TYPE_DERIVATION_CONTROL, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertFullDerivationSetMember1ToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(convertTypeDerivationControlToString(SchemaPackage.Literals.TYPE_DERIVATION_CONTROL, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<QName> createMemberTypesTypeFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<QName> result = new ArrayList<QName>();
        for (String item : split(initialValue)) {
            result.add((QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMemberTypesTypeToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModeType createModeTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createModeTypeFromString(SchemaPackage.Literals.MODE_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertModeTypeToString(SchemaPackage.Literals.MODE_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModeType1 createModeTypeObject1FromString(EDataType eDataType, String initialValue) {
        return createModeType1FromString(SchemaPackage.Literals.MODE_TYPE1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertModeTypeObject1ToString(EDataType eDataType, Object instanceValue) {
        return convertModeType1ToString(SchemaPackage.Literals.MODE_TYPE1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createNamespaceListFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = createSpecialNamespaceListFromString(SchemaPackage.Literals.SPECIAL_NAMESPACE_LIST, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createBasicNamespaceListFromString(SchemaPackage.Literals.BASIC_NAMESPACE_LIST, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNamespaceListToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (SchemaPackage.Literals.SPECIAL_NAMESPACE_LIST.isInstance(instanceValue)) {
            try {
                String value = convertSpecialNamespaceListToString(SchemaPackage.Literals.SPECIAL_NAMESPACE_LIST, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (SchemaPackage.Literals.BASIC_NAMESPACE_LIST.isInstance(instanceValue)) {
            try {
                String value = convertBasicNamespaceListToString(SchemaPackage.Literals.BASIC_NAMESPACE_LIST, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Object> createNotNamespaceTypeFromString(EDataType eDataType, String initialValue) {
        return createBasicNamespaceListFromString(SchemaPackage.Literals.BASIC_NAMESPACE_LIST, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertNotNamespaceTypeToString(EDataType eDataType, Object instanceValue) {
        return convertBasicNamespaceListToString(SchemaPackage.Literals.BASIC_NAMESPACE_LIST, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessContentsType createProcessContentsTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createProcessContentsTypeFromString(SchemaPackage.Literals.PROCESS_CONTENTS_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProcessContentsTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertProcessContentsTypeToString(SchemaPackage.Literals.PROCESS_CONTENTS_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createPublicFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPublicToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Object> createQnameListFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<Object> result = new ArrayList<Object>();
        for (String item : split(initialValue)) {
            result.add(createQnameListItemFromString(SchemaPackage.Literals.QNAME_LIST_ITEM, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertQnameListToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(convertQnameListItemToString(SchemaPackage.Literals.QNAME_LIST_ITEM, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Object> createQnameListAFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<Object> result = new ArrayList<Object>();
        for (String item : split(initialValue)) {
            result.add(createQnameListAItemFromString(SchemaPackage.Literals.QNAME_LIST_AITEM, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertQnameListAToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(convertQnameListAItemToString(SchemaPackage.Literals.QNAME_LIST_AITEM, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createQnameListAItemFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createQnameListAItemMember1FromString(SchemaPackage.Literals.QNAME_LIST_AITEM_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertQnameListAItemToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XMLTypePackage.Literals.QNAME.isInstance(instanceValue)) {
            try {
                String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (SchemaPackage.Literals.QNAME_LIST_AITEM_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertQnameListAItemMember1ToString(SchemaPackage.Literals.QNAME_LIST_AITEM_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QnameListAItemMember1 createQnameListAItemMember1ObjectFromString(EDataType eDataType, String initialValue) {
        return createQnameListAItemMember1FromString(SchemaPackage.Literals.QNAME_LIST_AITEM_MEMBER1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertQnameListAItemMember1ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertQnameListAItemMember1ToString(SchemaPackage.Literals.QNAME_LIST_AITEM_MEMBER1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createQnameListItemFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createQnameListItemMember1FromString(SchemaPackage.Literals.QNAME_LIST_ITEM_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertQnameListItemToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XMLTypePackage.Literals.QNAME.isInstance(instanceValue)) {
            try {
                String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (SchemaPackage.Literals.QNAME_LIST_ITEM_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertQnameListItemMember1ToString(SchemaPackage.Literals.QNAME_LIST_ITEM_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QnameListItemMember1 createQnameListItemMember1ObjectFromString(EDataType eDataType, String initialValue) {
        return createQnameListItemMember1FromString(SchemaPackage.Literals.QNAME_LIST_ITEM_MEMBER1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertQnameListItemMember1ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertQnameListItemMember1ToString(SchemaPackage.Literals.QNAME_LIST_ITEM_MEMBER1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReducedDerivationControl createReducedDerivationControlObjectFromString(EDataType eDataType, String initialValue) {
        return createReducedDerivationControlFromString(SchemaPackage.Literals.REDUCED_DERIVATION_CONTROL, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertReducedDerivationControlObjectToString(EDataType eDataType, Object instanceValue) {
        return convertReducedDerivationControlToString(SchemaPackage.Literals.REDUCED_DERIVATION_CONTROL, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createSimpleDerivationSetFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = createSimpleDerivationSetMember0FromString(SchemaPackage.Literals.SIMPLE_DERIVATION_SET_MEMBER0, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createSimpleDerivationSetMember1FromString(SchemaPackage.Literals.SIMPLE_DERIVATION_SET_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSimpleDerivationSetToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (SchemaPackage.Literals.SIMPLE_DERIVATION_SET_MEMBER0.isInstance(instanceValue)) {
            try {
                String value = convertSimpleDerivationSetMember0ToString(SchemaPackage.Literals.SIMPLE_DERIVATION_SET_MEMBER0, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (SchemaPackage.Literals.SIMPLE_DERIVATION_SET_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertSimpleDerivationSetMember1ToString(SchemaPackage.Literals.SIMPLE_DERIVATION_SET_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleDerivationSetMember0 createSimpleDerivationSetMember0ObjectFromString(EDataType eDataType, String initialValue) {
        return createSimpleDerivationSetMember0FromString(SchemaPackage.Literals.SIMPLE_DERIVATION_SET_MEMBER0, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSimpleDerivationSetMember0ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertSimpleDerivationSetMember0ToString(SchemaPackage.Literals.SIMPLE_DERIVATION_SET_MEMBER0, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<SimpleDerivationSetMember1Item> createSimpleDerivationSetMember1FromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<SimpleDerivationSetMember1Item> result = new ArrayList<SimpleDerivationSetMember1Item>();
        for (String item : split(initialValue)) {
            result.add(createSimpleDerivationSetMember1ItemFromString(SchemaPackage.Literals.SIMPLE_DERIVATION_SET_MEMBER1_ITEM, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSimpleDerivationSetMember1ToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(convertSimpleDerivationSetMember1ItemToString(SchemaPackage.Literals.SIMPLE_DERIVATION_SET_MEMBER1_ITEM, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleDerivationSetMember1Item createSimpleDerivationSetMember1ItemObjectFromString(EDataType eDataType, String initialValue) {
        return createSimpleDerivationSetMember1ItemFromString(SchemaPackage.Literals.SIMPLE_DERIVATION_SET_MEMBER1_ITEM, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSimpleDerivationSetMember1ItemObjectToString(EDataType eDataType, Object instanceValue) {
        return convertSimpleDerivationSetMember1ItemToString(SchemaPackage.Literals.SIMPLE_DERIVATION_SET_MEMBER1_ITEM, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SpecialNamespaceList createSpecialNamespaceListObjectFromString(EDataType eDataType, String initialValue) {
        return createSpecialNamespaceListFromString(SchemaPackage.Literals.SPECIAL_NAMESPACE_LIST, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSpecialNamespaceListObjectToString(EDataType eDataType, Object instanceValue) {
        return convertSpecialNamespaceListToString(SchemaPackage.Literals.SPECIAL_NAMESPACE_LIST, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<QName> createSubstitutionGroupTypeFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        List<QName> result = new ArrayList<QName>();
        for (String item : split(initialValue)) {
            result.add((QName)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.QNAME, item));
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSubstitutionGroupTypeToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        List<?> list = (List<?>)instanceValue;
        if (list.isEmpty()) return "";
        StringBuffer result = new StringBuffer();
        for (Object item : list) {
            result.append(XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.QNAME, item));
            result.append(' ');
        }
        return result.substring(0, result.length() - 1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeDerivationControl createTypeDerivationControlObjectFromString(EDataType eDataType, String initialValue) {
        return createTypeDerivationControlFromString(SchemaPackage.Literals.TYPE_DERIVATION_CONTROL, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTypeDerivationControlObjectToString(EDataType eDataType, Object instanceValue) {
        return convertTypeDerivationControlToString(SchemaPackage.Literals.TYPE_DERIVATION_CONTROL, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseType createUseTypeObjectFromString(EDataType eDataType, String initialValue) {
        return createUseTypeFromString(SchemaPackage.Literals.USE_TYPE, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUseTypeObjectToString(EDataType eDataType, Object instanceValue) {
        return convertUseTypeToString(SchemaPackage.Literals.USE_TYPE, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object createXpathDefaultNamespaceFromString(EDataType eDataType, String initialValue) {
        if (initialValue == null) return null;
        Object result = null;
        RuntimeException exception = null;
        try {
            result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        try {
            result = createXpathDefaultNamespaceMember1FromString(SchemaPackage.Literals.XPATH_DEFAULT_NAMESPACE_MEMBER1, initialValue);
            if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
                return result;
            }
        }
        catch (RuntimeException e) {
            exception = e;
        }
        if (result != null || exception == null) return result;
    
        throw exception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertXpathDefaultNamespaceToString(EDataType eDataType, Object instanceValue) {
        if (instanceValue == null) return null;
        if (XMLTypePackage.Literals.ANY_URI.isInstance(instanceValue)) {
            try {
                String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        if (SchemaPackage.Literals.XPATH_DEFAULT_NAMESPACE_MEMBER1.isInstance(instanceValue)) {
            try {
                String value = convertXpathDefaultNamespaceMember1ToString(SchemaPackage.Literals.XPATH_DEFAULT_NAMESPACE_MEMBER1, instanceValue);
                if (value != null) return value;
            }
            catch (Exception e) {
                // Keep trying other member types until all have failed.
            }
        }
        throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public XpathDefaultNamespaceMember1 createXpathDefaultNamespaceMember1ObjectFromString(EDataType eDataType, String initialValue) {
        return createXpathDefaultNamespaceMember1FromString(SchemaPackage.Literals.XPATH_DEFAULT_NAMESPACE_MEMBER1, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertXpathDefaultNamespaceMember1ObjectToString(EDataType eDataType, Object instanceValue) {
        return convertXpathDefaultNamespaceMember1ToString(SchemaPackage.Literals.XPATH_DEFAULT_NAMESPACE_MEMBER1, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createXpathTypeFromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertXpathTypeToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createXpathType1FromString(EDataType eDataType, String initialValue) {
        return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertXpathType1ToString(EDataType eDataType, Object instanceValue) {
        return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaPackage getSchemaPackage() {
        return (SchemaPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static SchemaPackage getPackage() {
        return SchemaPackage.eINSTANCE;
    }

} //SchemaFactoryImpl
