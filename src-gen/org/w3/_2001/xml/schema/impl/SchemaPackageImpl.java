/**
 */
package org.w3._2001.xml.schema.impl;

import java.util.List;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.w3._2001.xml.schema.All;
import org.w3._2001.xml.schema.AllNNIMember1;
import org.w3._2001.xml.schema.AltType;
import org.w3._2001.xml.schema.Annotated;
import org.w3._2001.xml.schema.AnnotationType;
import org.w3._2001.xml.schema.AnyAttributeType;
import org.w3._2001.xml.schema.AnyType;
import org.w3._2001.xml.schema.AppinfoType;
import org.w3._2001.xml.schema.Assertion;
import org.w3._2001.xml.schema.Attribute;
import org.w3._2001.xml.schema.AttributeGroup;
import org.w3._2001.xml.schema.AttributeGroupRef;
import org.w3._2001.xml.schema.BasicNamespaceListItemMember1;
import org.w3._2001.xml.schema.BlockSetMember0;
import org.w3._2001.xml.schema.BlockSetMember1Item;
import org.w3._2001.xml.schema.ComplexContentType;
import org.w3._2001.xml.schema.ComplexRestrictionType;
import org.w3._2001.xml.schema.ComplexType;
import org.w3._2001.xml.schema.DefaultOpenContentType;
import org.w3._2001.xml.schema.DerivationControl;
import org.w3._2001.xml.schema.DerivationSetMember0;
import org.w3._2001.xml.schema.DocumentRoot;
import org.w3._2001.xml.schema.DocumentationType;
import org.w3._2001.xml.schema.Element;
import org.w3._2001.xml.schema.ExplicitGroup;
import org.w3._2001.xml.schema.ExplicitTimezoneType;
import org.w3._2001.xml.schema.ExtensionType;
import org.w3._2001.xml.schema.Facet;
import org.w3._2001.xml.schema.FieldType;
import org.w3._2001.xml.schema.FormChoice;
import org.w3._2001.xml.schema.FullDerivationSetMember0;
import org.w3._2001.xml.schema.Group;
import org.w3._2001.xml.schema.GroupRef;
import org.w3._2001.xml.schema.ImportType;
import org.w3._2001.xml.schema.IncludeType;
import org.w3._2001.xml.schema.IntFacet;
import org.w3._2001.xml.schema.Keybase;
import org.w3._2001.xml.schema.KeyrefType;
import org.w3._2001.xml.schema.ListType;
import org.w3._2001.xml.schema.LocalComplexType;
import org.w3._2001.xml.schema.LocalElement;
import org.w3._2001.xml.schema.LocalSimpleType;
import org.w3._2001.xml.schema.ModeType;
import org.w3._2001.xml.schema.ModeType1;
import org.w3._2001.xml.schema.NamedAttributeGroup;
import org.w3._2001.xml.schema.NamedGroup;
import org.w3._2001.xml.schema.NoFixedFacet;
import org.w3._2001.xml.schema.NotationType;
import org.w3._2001.xml.schema.NumFacet;
import org.w3._2001.xml.schema.OpenAttrs;
import org.w3._2001.xml.schema.OpenContentType;
import org.w3._2001.xml.schema.OverrideType;
import org.w3._2001.xml.schema.PatternType;
import org.w3._2001.xml.schema.ProcessContentsType;
import org.w3._2001.xml.schema.QnameListAItemMember1;
import org.w3._2001.xml.schema.QnameListItemMember1;
import org.w3._2001.xml.schema.RealGroup;
import org.w3._2001.xml.schema.RedefineType;
import org.w3._2001.xml.schema.ReducedDerivationControl;
import org.w3._2001.xml.schema.RestrictionType;
import org.w3._2001.xml.schema.RestrictionType1;
import org.w3._2001.xml.schema.SchemaFactory;
import org.w3._2001.xml.schema.SchemaPackage;
import org.w3._2001.xml.schema.SchemaType;
import org.w3._2001.xml.schema.SelectorType;
import org.w3._2001.xml.schema.SimpleContentType;
import org.w3._2001.xml.schema.SimpleDerivationSetMember0;
import org.w3._2001.xml.schema.SimpleDerivationSetMember1Item;
import org.w3._2001.xml.schema.SimpleExplicitGroup;
import org.w3._2001.xml.schema.SimpleExtensionType;
import org.w3._2001.xml.schema.SimpleRestrictionType;
import org.w3._2001.xml.schema.SimpleType;
import org.w3._2001.xml.schema.SpecialNamespaceList;
import org.w3._2001.xml.schema.TopLevelAttribute;
import org.w3._2001.xml.schema.TopLevelComplexType;
import org.w3._2001.xml.schema.TopLevelElement;
import org.w3._2001.xml.schema.TopLevelSimpleType;
import org.w3._2001.xml.schema.TotalDigitsType;
import org.w3._2001.xml.schema.TypeDerivationControl;
import org.w3._2001.xml.schema.UnionType;
import org.w3._2001.xml.schema.UseType;
import org.w3._2001.xml.schema.WhiteSpaceType;
import org.w3._2001.xml.schema.Wildcard;
import org.w3._2001.xml.schema.XpathDefaultNamespaceMember1;
import org.w3._2001.xml.schema.util.SchemaValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaPackageImpl extends EPackageImpl implements SchemaPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass allEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass altTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotatedEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass annotationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass anyAttributeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass anyTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass appinfoTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assertionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeGroupRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass complexContentTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass complexRestrictionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass complexTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass defaultOpenContentTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentRootEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass elementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass explicitGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass explicitTimezoneTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extensionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass facetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass fieldTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass groupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass groupRefEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass importTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass includeTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intFacetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass keybaseEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass keyrefTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass listTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass localComplexTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass localElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass localSimpleTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass namedAttributeGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass namedGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass noFixedFacetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass notationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass numFacetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass openAttrsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass openContentTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass overrideTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass patternTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass realGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass redefineTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass restrictionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass restrictionType1EClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass schemaTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass selectorTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simpleContentTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simpleExplicitGroupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simpleExtensionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simpleRestrictionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass simpleTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass topLevelAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass topLevelComplexTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass topLevelElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass topLevelSimpleTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass totalDigitsTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass unionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass whiteSpaceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass wildcardEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum allNNIMember1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum basicNamespaceListItemMember1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum blockSetMember0EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum blockSetMember1ItemEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum derivationControlEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum derivationSetMember0EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum formChoiceEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum fullDerivationSetMember0EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum modeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum modeType1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum processContentsTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum qnameListAItemMember1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum qnameListItemMember1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum reducedDerivationControlEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum simpleDerivationSetMember0EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum simpleDerivationSetMember1ItemEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum specialNamespaceListEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum typeDerivationControlEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum useTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum xpathDefaultNamespaceMember1EEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType allNNIEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType allNNIMember1ObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType basicNamespaceListEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType basicNamespaceListItemEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType basicNamespaceListItemMember1ObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType blockSetEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType blockSetMember0ObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType blockSetMember1EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType blockSetMember1ItemObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType derivationControlObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType derivationSetEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType derivationSetMember0ObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType derivationSetMember1EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType formChoiceObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType fullDerivationSetEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType fullDerivationSetMember0ObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType fullDerivationSetMember1EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType memberTypesTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType modeTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType modeTypeObject1EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType namespaceListEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType notNamespaceTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType processContentsTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType publicEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType qnameListEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType qnameListAEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType qnameListAItemEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType qnameListAItemMember1ObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType qnameListItemEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType qnameListItemMember1ObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType reducedDerivationControlObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType simpleDerivationSetEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType simpleDerivationSetMember0ObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType simpleDerivationSetMember1EDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType simpleDerivationSetMember1ItemObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType specialNamespaceListObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType substitutionGroupTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType typeDerivationControlObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType useTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType xpathDefaultNamespaceEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType xpathDefaultNamespaceMember1ObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType xpathTypeEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType xpathType1EDataType = null;

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
     * @see org.w3._2001.xml.schema.SchemaPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private SchemaPackageImpl() {
        super(eNS_URI, SchemaFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link SchemaPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static SchemaPackage init() {
        if (isInited) return (SchemaPackage)EPackage.Registry.INSTANCE.getEPackage(SchemaPackage.eNS_URI);

        // Obtain or create and register package
        SchemaPackageImpl theSchemaPackage = (SchemaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SchemaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SchemaPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLNamespacePackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theSchemaPackage.createPackageContents();

        // Initialize created meta-data
        theSchemaPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theSchemaPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return SchemaValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theSchemaPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(SchemaPackage.eNS_URI, theSchemaPackage);
        return theSchemaPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAll() {
        return allEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAltType() {
        return altTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAltType_SimpleType() {
        return (EReference)altTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAltType_ComplexType() {
        return (EReference)altTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAltType_Test() {
        return (EAttribute)altTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAltType_Type() {
        return (EAttribute)altTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAltType_XpathDefaultNamespace() {
        return (EAttribute)altTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAnnotated() {
        return annotatedEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnnotated_Annotation() {
        return (EReference)annotatedEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnnotated_Id() {
        return (EAttribute)annotatedEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAnnotationType() {
        return annotationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnnotationType_Group() {
        return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnnotationType_Appinfo() {
        return (EReference)annotationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAnnotationType_Documentation() {
        return (EReference)annotationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnnotationType_Id() {
        return (EAttribute)annotationTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAnyAttributeType() {
        return anyAttributeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnyAttributeType_NotQName() {
        return (EAttribute)anyAttributeTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAnyType() {
        return anyTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnyType_MaxOccurs() {
        return (EAttribute)anyTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnyType_MinOccurs() {
        return (EAttribute)anyTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAnyType_NotQName() {
        return (EAttribute)anyTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAppinfoType() {
        return appinfoTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAppinfoType_Mixed() {
        return (EAttribute)appinfoTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAppinfoType_Group() {
        return (EAttribute)appinfoTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAppinfoType_Any() {
        return (EAttribute)appinfoTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAppinfoType_Source() {
        return (EAttribute)appinfoTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAppinfoType_AnyAttribute() {
        return (EAttribute)appinfoTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssertion() {
        return assertionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAssertion_Test() {
        return (EAttribute)assertionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAssertion_XpathDefaultNamespace() {
        return (EAttribute)assertionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttribute() {
        return attributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttribute_SimpleType() {
        return (EReference)attributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_Name() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_Ref() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_Type() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_Use() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_Default() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_Fixed() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_Form() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_TargetNamespace() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_Inheritable() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeGroup() {
        return attributeGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeGroup_Group() {
        return (EAttribute)attributeGroupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeGroup_Attribute() {
        return (EReference)attributeGroupEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeGroup_AttributeGroup() {
        return (EReference)attributeGroupEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttributeGroup_AnyAttribute1() {
        return (EReference)attributeGroupEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeGroup_Name() {
        return (EAttribute)attributeGroupEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttributeGroup_Ref() {
        return (EAttribute)attributeGroupEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeGroupRef() {
        return attributeGroupRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComplexContentType() {
        return complexContentTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexContentType_Restriction() {
        return (EReference)complexContentTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexContentType_Extension() {
        return (EReference)complexContentTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getComplexContentType_Mixed() {
        return (EAttribute)complexContentTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComplexRestrictionType() {
        return complexRestrictionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComplexType() {
        return complexTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexType_SimpleContent() {
        return (EReference)complexTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexType_ComplexContent() {
        return (EReference)complexTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexType_OpenContent() {
        return (EReference)complexTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexType_Group() {
        return (EReference)complexTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexType_All() {
        return (EReference)complexTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexType_Choice() {
        return (EReference)complexTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexType_Sequence() {
        return (EReference)complexTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getComplexType_Group1() {
        return (EAttribute)complexTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexType_Attribute() {
        return (EReference)complexTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexType_AttributeGroup() {
        return (EReference)complexTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexType_AnyAttribute1() {
        return (EReference)complexTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexType_Assert() {
        return (EReference)complexTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getComplexType_Name() {
        return (EAttribute)complexTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getComplexType_Mixed() {
        return (EAttribute)complexTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getComplexType_Abstract() {
        return (EAttribute)complexTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getComplexType_Final() {
        return (EAttribute)complexTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getComplexType_Block() {
        return (EAttribute)complexTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getComplexType_DefaultAttributesApply() {
        return (EAttribute)complexTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDefaultOpenContentType() {
        return defaultOpenContentTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefaultOpenContentType_Any() {
        return (EReference)defaultOpenContentTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefaultOpenContentType_AppliesToEmpty() {
        return (EAttribute)defaultOpenContentTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefaultOpenContentType_Mode() {
        return (EAttribute)defaultOpenContentTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentationType() {
        return documentationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentationType_Mixed() {
        return (EAttribute)documentationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentationType_Group() {
        return (EAttribute)documentationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentationType_Any() {
        return (EAttribute)documentationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentationType_Source() {
        return (EAttribute)documentationTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentationType_Lang() {
        return (EAttribute)documentationTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentationType_AnyAttribute() {
        return (EAttribute)documentationTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentRoot() {
        return documentRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_All() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Annotation() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Any() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_AnyAttribute() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Appinfo() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Assertion() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Facet() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Attribute() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_AttributeGroup() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Choice() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ComplexContent() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ComplexType() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DefaultOpenContent() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Documentation() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Element() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Enumeration() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ExplicitTimezone() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Field() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_FractionDigits() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Group() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Import() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Include() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Key() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Keyref() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Length() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_List() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MaxExclusive() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MaxInclusive() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MaxLength() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MinExclusive() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MinInclusive() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MinLength() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Notation() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_OpenContent() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Override() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Pattern() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Redefine() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Restriction() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(40);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Schema() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Selector() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(42);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Sequence() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SimpleContent() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SimpleType() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(45);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TotalDigits() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(46);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Union() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(47);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Unique() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_WhiteSpace() {
        return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getElement() {
        return elementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElement_SimpleType() {
        return (EReference)elementEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElement_ComplexType() {
        return (EReference)elementEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElement_Alternative() {
        return (EReference)elementEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_IdentityConstraint() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElement_Unique() {
        return (EReference)elementEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElement_Key() {
        return (EReference)elementEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getElement_Keyref() {
        return (EReference)elementEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_MaxOccurs() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_MinOccurs() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_Name() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_Ref() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_Type() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_SubstitutionGroup() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_Default() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_Fixed() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_Nillable() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_Abstract() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_Final() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_Block() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_Form() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getElement_TargetNamespace() {
        return (EAttribute)elementEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExplicitGroup() {
        return explicitGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExplicitTimezoneType() {
        return explicitTimezoneTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExtensionType() {
        return extensionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtensionType_OpenContent() {
        return (EReference)extensionTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtensionType_Group() {
        return (EReference)extensionTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtensionType_All() {
        return (EReference)extensionTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtensionType_Choice() {
        return (EReference)extensionTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtensionType_Sequence() {
        return (EReference)extensionTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtensionType_Group1() {
        return (EAttribute)extensionTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtensionType_Attribute() {
        return (EReference)extensionTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtensionType_AttributeGroup() {
        return (EReference)extensionTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtensionType_AnyAttribute1() {
        return (EReference)extensionTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtensionType_Assert() {
        return (EReference)extensionTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtensionType_Base() {
        return (EAttribute)extensionTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFacet() {
        return facetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFacet_Value() {
        return (EAttribute)facetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFacet_Fixed() {
        return (EAttribute)facetEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFieldType() {
        return fieldTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFieldType_Xpath() {
        return (EAttribute)fieldTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFieldType_XpathDefaultNamespace() {
        return (EAttribute)fieldTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGroup() {
        return groupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGroup_Particle() {
        return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGroup_Element() {
        return (EReference)groupEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGroup_Group() {
        return (EReference)groupEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGroup_All() {
        return (EReference)groupEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGroup_Choice() {
        return (EReference)groupEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGroup_Sequence() {
        return (EReference)groupEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGroup_Any() {
        return (EReference)groupEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGroup_MaxOccurs() {
        return (EAttribute)groupEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGroup_MinOccurs() {
        return (EAttribute)groupEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGroup_Name() {
        return (EAttribute)groupEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGroup_Ref() {
        return (EAttribute)groupEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGroupRef() {
        return groupRefEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getImportType() {
        return importTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImportType_Namespace() {
        return (EAttribute)importTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImportType_SchemaLocation() {
        return (EAttribute)importTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIncludeType() {
        return includeTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getIncludeType_SchemaLocation() {
        return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntFacet() {
        return intFacetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKeybase() {
        return keybaseEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKeybase_Selector() {
        return (EReference)keybaseEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKeybase_Field() {
        return (EReference)keybaseEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKeybase_Name() {
        return (EAttribute)keybaseEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKeybase_Ref() {
        return (EAttribute)keybaseEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKeyrefType() {
        return keyrefTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKeyrefType_Refer() {
        return (EAttribute)keyrefTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getListType() {
        return listTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getListType_SimpleType() {
        return (EReference)listTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getListType_ItemType() {
        return (EAttribute)listTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLocalComplexType() {
        return localComplexTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLocalElement() {
        return localElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLocalSimpleType() {
        return localSimpleTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNamedAttributeGroup() {
        return namedAttributeGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNamedGroup() {
        return namedGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNoFixedFacet() {
        return noFixedFacetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNotationType() {
        return notationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNotationType_Name() {
        return (EAttribute)notationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNotationType_Public() {
        return (EAttribute)notationTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getNotationType_System() {
        return (EAttribute)notationTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNumFacet() {
        return numFacetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOpenAttrs() {
        return openAttrsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpenAttrs_AnyAttribute() {
        return (EAttribute)openAttrsEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOpenContentType() {
        return openContentTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOpenContentType_Any() {
        return (EReference)openContentTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOpenContentType_Mode() {
        return (EAttribute)openContentTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOverrideType() {
        return overrideTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOverrideType_Annotation() {
        return (EReference)overrideTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOverrideType_SchemaTop() {
        return (EAttribute)overrideTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOverrideType_SimpleType() {
        return (EReference)overrideTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOverrideType_ComplexType() {
        return (EReference)overrideTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOverrideType_Group() {
        return (EReference)overrideTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOverrideType_AttributeGroup() {
        return (EReference)overrideTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOverrideType_Element() {
        return (EReference)overrideTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOverrideType_Attribute() {
        return (EReference)overrideTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOverrideType_Notation() {
        return (EReference)overrideTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOverrideType_SchemaLocation() {
        return (EAttribute)overrideTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOverrideType_Id() {
        return (EAttribute)overrideTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPatternType() {
        return patternTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRealGroup() {
        return realGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRealGroup_All1() {
        return (EReference)realGroupEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRealGroup_Choice1() {
        return (EReference)realGroupEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRealGroup_Sequence1() {
        return (EReference)realGroupEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRedefineType() {
        return redefineTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRedefineType_Group() {
        return (EAttribute)redefineTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRedefineType_Annotation() {
        return (EReference)redefineTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRedefineType_SimpleType() {
        return (EReference)redefineTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRedefineType_ComplexType() {
        return (EReference)redefineTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRedefineType_Group1() {
        return (EReference)redefineTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRedefineType_AttributeGroup() {
        return (EReference)redefineTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRedefineType_SchemaLocation() {
        return (EAttribute)redefineTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRedefineType_Id() {
        return (EAttribute)redefineTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRestrictionType() {
        return restrictionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionType_OpenContent() {
        return (EReference)restrictionTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionType_Group() {
        return (EReference)restrictionTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionType_All() {
        return (EReference)restrictionTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionType_Choice() {
        return (EReference)restrictionTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionType_Sequence() {
        return (EReference)restrictionTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionType_SimpleType() {
        return (EReference)restrictionTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRestrictionType_Group1() {
        return (EAttribute)restrictionTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRestrictionType_FacetGroup() {
        return (EAttribute)restrictionTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionType_Facet() {
        return (EReference)restrictionTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRestrictionType_Any() {
        return (EAttribute)restrictionTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRestrictionType_Group2() {
        return (EAttribute)restrictionTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionType_Attribute() {
        return (EReference)restrictionTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionType_AttributeGroup() {
        return (EReference)restrictionTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionType_AnyAttribute1() {
        return (EReference)restrictionTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionType_Assert() {
        return (EReference)restrictionTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRestrictionType_Base() {
        return (EAttribute)restrictionTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRestrictionType1() {
        return restrictionType1EClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionType1_SimpleType() {
        return (EReference)restrictionType1EClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRestrictionType1_Group() {
        return (EAttribute)restrictionType1EClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRestrictionType1_FacetGroup() {
        return (EAttribute)restrictionType1EClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getRestrictionType1_Facet() {
        return (EReference)restrictionType1EClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRestrictionType1_Any() {
        return (EAttribute)restrictionType1EClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRestrictionType1_Base() {
        return (EAttribute)restrictionType1EClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSchemaType() {
        return schemaTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaType_Composition() {
        return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchemaType_Include() {
        return (EReference)schemaTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchemaType_Import() {
        return (EReference)schemaTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchemaType_Redefine() {
        return (EReference)schemaTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchemaType_Override() {
        return (EReference)schemaTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchemaType_Annotation() {
        return (EReference)schemaTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchemaType_DefaultOpenContent() {
        return (EReference)schemaTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchemaType_Annotation1() {
        return (EReference)schemaTypeEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaType_Group() {
        return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchemaType_SimpleType() {
        return (EReference)schemaTypeEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchemaType_ComplexType() {
        return (EReference)schemaTypeEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchemaType_Group1() {
        return (EReference)schemaTypeEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchemaType_AttributeGroup() {
        return (EReference)schemaTypeEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchemaType_Element() {
        return (EReference)schemaTypeEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchemaType_Attribute() {
        return (EReference)schemaTypeEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchemaType_Notation() {
        return (EReference)schemaTypeEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSchemaType_Annotation2() {
        return (EReference)schemaTypeEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaType_TargetNamespace() {
        return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaType_Version() {
        return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaType_FinalDefault() {
        return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaType_BlockDefault() {
        return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaType_AttributeFormDefault() {
        return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaType_ElementFormDefault() {
        return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaType_DefaultAttributes() {
        return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaType_XpathDefaultNamespace() {
        return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaType_Id() {
        return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSchemaType_Lang() {
        return (EAttribute)schemaTypeEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSelectorType() {
        return selectorTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSelectorType_Xpath() {
        return (EAttribute)selectorTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSelectorType_XpathDefaultNamespace() {
        return (EAttribute)selectorTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSimpleContentType() {
        return simpleContentTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSimpleContentType_Restriction() {
        return (EReference)simpleContentTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSimpleContentType_Extension() {
        return (EReference)simpleContentTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSimpleExplicitGroup() {
        return simpleExplicitGroupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSimpleExtensionType() {
        return simpleExtensionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSimpleRestrictionType() {
        return simpleRestrictionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSimpleType() {
        return simpleTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSimpleType_Restriction() {
        return (EReference)simpleTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSimpleType_List() {
        return (EReference)simpleTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSimpleType_Union() {
        return (EReference)simpleTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSimpleType_Final() {
        return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSimpleType_Name() {
        return (EAttribute)simpleTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTopLevelAttribute() {
        return topLevelAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTopLevelComplexType() {
        return topLevelComplexTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTopLevelElement() {
        return topLevelElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTopLevelSimpleType() {
        return topLevelSimpleTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTotalDigitsType() {
        return totalDigitsTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUnionType() {
        return unionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUnionType_SimpleType() {
        return (EReference)unionTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUnionType_MemberTypes() {
        return (EAttribute)unionTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWhiteSpaceType() {
        return whiteSpaceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWildcard() {
        return wildcardEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWildcard_Namespace() {
        return (EAttribute)wildcardEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWildcard_NotNamespace() {
        return (EAttribute)wildcardEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWildcard_ProcessContents() {
        return (EAttribute)wildcardEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAllNNIMember1() {
        return allNNIMember1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getBasicNamespaceListItemMember1() {
        return basicNamespaceListItemMember1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getBlockSetMember0() {
        return blockSetMember0EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getBlockSetMember1Item() {
        return blockSetMember1ItemEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDerivationControl() {
        return derivationControlEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDerivationSetMember0() {
        return derivationSetMember0EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getFormChoice() {
        return formChoiceEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getFullDerivationSetMember0() {
        return fullDerivationSetMember0EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getModeType() {
        return modeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getModeType1() {
        return modeType1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getProcessContentsType() {
        return processContentsTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getQnameListAItemMember1() {
        return qnameListAItemMember1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getQnameListItemMember1() {
        return qnameListItemMember1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getReducedDerivationControl() {
        return reducedDerivationControlEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSimpleDerivationSetMember0() {
        return simpleDerivationSetMember0EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSimpleDerivationSetMember1Item() {
        return simpleDerivationSetMember1ItemEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getSpecialNamespaceList() {
        return specialNamespaceListEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTypeDerivationControl() {
        return typeDerivationControlEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getUseType() {
        return useTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getXpathDefaultNamespaceMember1() {
        return xpathDefaultNamespaceMember1EEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getAllNNI() {
        return allNNIEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getAllNNIMember1Object() {
        return allNNIMember1ObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getBasicNamespaceList() {
        return basicNamespaceListEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getBasicNamespaceListItem() {
        return basicNamespaceListItemEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getBasicNamespaceListItemMember1Object() {
        return basicNamespaceListItemMember1ObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getBlockSet() {
        return blockSetEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getBlockSetMember0Object() {
        return blockSetMember0ObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getBlockSetMember1() {
        return blockSetMember1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getBlockSetMember1ItemObject() {
        return blockSetMember1ItemObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDerivationControlObject() {
        return derivationControlObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDerivationSet() {
        return derivationSetEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDerivationSetMember0Object() {
        return derivationSetMember0ObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getDerivationSetMember1() {
        return derivationSetMember1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getFormChoiceObject() {
        return formChoiceObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getFullDerivationSet() {
        return fullDerivationSetEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getFullDerivationSetMember0Object() {
        return fullDerivationSetMember0ObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getFullDerivationSetMember1() {
        return fullDerivationSetMember1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMemberTypesType() {
        return memberTypesTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getModeTypeObject() {
        return modeTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getModeTypeObject1() {
        return modeTypeObject1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getNamespaceList() {
        return namespaceListEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getNotNamespaceType() {
        return notNamespaceTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getProcessContentsTypeObject() {
        return processContentsTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getPublic() {
        return publicEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getQnameList() {
        return qnameListEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getQnameListA() {
        return qnameListAEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getQnameListAItem() {
        return qnameListAItemEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getQnameListAItemMember1Object() {
        return qnameListAItemMember1ObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getQnameListItem() {
        return qnameListItemEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getQnameListItemMember1Object() {
        return qnameListItemMember1ObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getReducedDerivationControlObject() {
        return reducedDerivationControlObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSimpleDerivationSet() {
        return simpleDerivationSetEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSimpleDerivationSetMember0Object() {
        return simpleDerivationSetMember0ObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSimpleDerivationSetMember1() {
        return simpleDerivationSetMember1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSimpleDerivationSetMember1ItemObject() {
        return simpleDerivationSetMember1ItemObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSpecialNamespaceListObject() {
        return specialNamespaceListObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSubstitutionGroupType() {
        return substitutionGroupTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTypeDerivationControlObject() {
        return typeDerivationControlObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getUseTypeObject() {
        return useTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getXpathDefaultNamespace() {
        return xpathDefaultNamespaceEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getXpathDefaultNamespaceMember1Object() {
        return xpathDefaultNamespaceMember1ObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getXpathType() {
        return xpathTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getXpathType1() {
        return xpathType1EDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaFactory getSchemaFactory() {
        return (SchemaFactory)getEFactoryInstance();
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
        allEClass = createEClass(ALL);

        altTypeEClass = createEClass(ALT_TYPE);
        createEReference(altTypeEClass, ALT_TYPE__SIMPLE_TYPE);
        createEReference(altTypeEClass, ALT_TYPE__COMPLEX_TYPE);
        createEAttribute(altTypeEClass, ALT_TYPE__TEST);
        createEAttribute(altTypeEClass, ALT_TYPE__TYPE);
        createEAttribute(altTypeEClass, ALT_TYPE__XPATH_DEFAULT_NAMESPACE);

        annotatedEClass = createEClass(ANNOTATED);
        createEReference(annotatedEClass, ANNOTATED__ANNOTATION);
        createEAttribute(annotatedEClass, ANNOTATED__ID);

        annotationTypeEClass = createEClass(ANNOTATION_TYPE);
        createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__GROUP);
        createEReference(annotationTypeEClass, ANNOTATION_TYPE__APPINFO);
        createEReference(annotationTypeEClass, ANNOTATION_TYPE__DOCUMENTATION);
        createEAttribute(annotationTypeEClass, ANNOTATION_TYPE__ID);

        anyAttributeTypeEClass = createEClass(ANY_ATTRIBUTE_TYPE);
        createEAttribute(anyAttributeTypeEClass, ANY_ATTRIBUTE_TYPE__NOT_QNAME);

        anyTypeEClass = createEClass(ANY_TYPE);
        createEAttribute(anyTypeEClass, ANY_TYPE__MAX_OCCURS);
        createEAttribute(anyTypeEClass, ANY_TYPE__MIN_OCCURS);
        createEAttribute(anyTypeEClass, ANY_TYPE__NOT_QNAME);

        appinfoTypeEClass = createEClass(APPINFO_TYPE);
        createEAttribute(appinfoTypeEClass, APPINFO_TYPE__MIXED);
        createEAttribute(appinfoTypeEClass, APPINFO_TYPE__GROUP);
        createEAttribute(appinfoTypeEClass, APPINFO_TYPE__ANY);
        createEAttribute(appinfoTypeEClass, APPINFO_TYPE__SOURCE);
        createEAttribute(appinfoTypeEClass, APPINFO_TYPE__ANY_ATTRIBUTE);

        assertionEClass = createEClass(ASSERTION);
        createEAttribute(assertionEClass, ASSERTION__TEST);
        createEAttribute(assertionEClass, ASSERTION__XPATH_DEFAULT_NAMESPACE);

        attributeEClass = createEClass(ATTRIBUTE);
        createEReference(attributeEClass, ATTRIBUTE__SIMPLE_TYPE);
        createEAttribute(attributeEClass, ATTRIBUTE__NAME);
        createEAttribute(attributeEClass, ATTRIBUTE__REF);
        createEAttribute(attributeEClass, ATTRIBUTE__TYPE);
        createEAttribute(attributeEClass, ATTRIBUTE__USE);
        createEAttribute(attributeEClass, ATTRIBUTE__DEFAULT);
        createEAttribute(attributeEClass, ATTRIBUTE__FIXED);
        createEAttribute(attributeEClass, ATTRIBUTE__FORM);
        createEAttribute(attributeEClass, ATTRIBUTE__TARGET_NAMESPACE);
        createEAttribute(attributeEClass, ATTRIBUTE__INHERITABLE);

        attributeGroupEClass = createEClass(ATTRIBUTE_GROUP);
        createEAttribute(attributeGroupEClass, ATTRIBUTE_GROUP__GROUP);
        createEReference(attributeGroupEClass, ATTRIBUTE_GROUP__ATTRIBUTE);
        createEReference(attributeGroupEClass, ATTRIBUTE_GROUP__ATTRIBUTE_GROUP);
        createEReference(attributeGroupEClass, ATTRIBUTE_GROUP__ANY_ATTRIBUTE1);
        createEAttribute(attributeGroupEClass, ATTRIBUTE_GROUP__NAME);
        createEAttribute(attributeGroupEClass, ATTRIBUTE_GROUP__REF);

        attributeGroupRefEClass = createEClass(ATTRIBUTE_GROUP_REF);

        complexContentTypeEClass = createEClass(COMPLEX_CONTENT_TYPE);
        createEReference(complexContentTypeEClass, COMPLEX_CONTENT_TYPE__RESTRICTION);
        createEReference(complexContentTypeEClass, COMPLEX_CONTENT_TYPE__EXTENSION);
        createEAttribute(complexContentTypeEClass, COMPLEX_CONTENT_TYPE__MIXED);

        complexRestrictionTypeEClass = createEClass(COMPLEX_RESTRICTION_TYPE);

        complexTypeEClass = createEClass(COMPLEX_TYPE);
        createEReference(complexTypeEClass, COMPLEX_TYPE__SIMPLE_CONTENT);
        createEReference(complexTypeEClass, COMPLEX_TYPE__COMPLEX_CONTENT);
        createEReference(complexTypeEClass, COMPLEX_TYPE__OPEN_CONTENT);
        createEReference(complexTypeEClass, COMPLEX_TYPE__GROUP);
        createEReference(complexTypeEClass, COMPLEX_TYPE__ALL);
        createEReference(complexTypeEClass, COMPLEX_TYPE__CHOICE);
        createEReference(complexTypeEClass, COMPLEX_TYPE__SEQUENCE);
        createEAttribute(complexTypeEClass, COMPLEX_TYPE__GROUP1);
        createEReference(complexTypeEClass, COMPLEX_TYPE__ATTRIBUTE);
        createEReference(complexTypeEClass, COMPLEX_TYPE__ATTRIBUTE_GROUP);
        createEReference(complexTypeEClass, COMPLEX_TYPE__ANY_ATTRIBUTE1);
        createEReference(complexTypeEClass, COMPLEX_TYPE__ASSERT);
        createEAttribute(complexTypeEClass, COMPLEX_TYPE__NAME);
        createEAttribute(complexTypeEClass, COMPLEX_TYPE__MIXED);
        createEAttribute(complexTypeEClass, COMPLEX_TYPE__ABSTRACT);
        createEAttribute(complexTypeEClass, COMPLEX_TYPE__FINAL);
        createEAttribute(complexTypeEClass, COMPLEX_TYPE__BLOCK);
        createEAttribute(complexTypeEClass, COMPLEX_TYPE__DEFAULT_ATTRIBUTES_APPLY);

        defaultOpenContentTypeEClass = createEClass(DEFAULT_OPEN_CONTENT_TYPE);
        createEReference(defaultOpenContentTypeEClass, DEFAULT_OPEN_CONTENT_TYPE__ANY);
        createEAttribute(defaultOpenContentTypeEClass, DEFAULT_OPEN_CONTENT_TYPE__APPLIES_TO_EMPTY);
        createEAttribute(defaultOpenContentTypeEClass, DEFAULT_OPEN_CONTENT_TYPE__MODE);

        documentationTypeEClass = createEClass(DOCUMENTATION_TYPE);
        createEAttribute(documentationTypeEClass, DOCUMENTATION_TYPE__MIXED);
        createEAttribute(documentationTypeEClass, DOCUMENTATION_TYPE__GROUP);
        createEAttribute(documentationTypeEClass, DOCUMENTATION_TYPE__ANY);
        createEAttribute(documentationTypeEClass, DOCUMENTATION_TYPE__SOURCE);
        createEAttribute(documentationTypeEClass, DOCUMENTATION_TYPE__LANG);
        createEAttribute(documentationTypeEClass, DOCUMENTATION_TYPE__ANY_ATTRIBUTE);

        documentRootEClass = createEClass(DOCUMENT_ROOT);
        createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ALL);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ANNOTATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ANY);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ANY_ATTRIBUTE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__APPINFO);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ASSERTION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__FACET);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ATTRIBUTE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ATTRIBUTE_GROUP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__CHOICE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__COMPLEX_CONTENT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__COMPLEX_TYPE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__DEFAULT_OPEN_CONTENT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__DOCUMENTATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ELEMENT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__ENUMERATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__EXPLICIT_TIMEZONE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__FIELD);
        createEReference(documentRootEClass, DOCUMENT_ROOT__FRACTION_DIGITS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__GROUP);
        createEReference(documentRootEClass, DOCUMENT_ROOT__IMPORT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__INCLUDE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__KEY);
        createEReference(documentRootEClass, DOCUMENT_ROOT__KEYREF);
        createEReference(documentRootEClass, DOCUMENT_ROOT__LENGTH);
        createEReference(documentRootEClass, DOCUMENT_ROOT__LIST);
        createEReference(documentRootEClass, DOCUMENT_ROOT__MAX_EXCLUSIVE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__MAX_INCLUSIVE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__MAX_LENGTH);
        createEReference(documentRootEClass, DOCUMENT_ROOT__MIN_EXCLUSIVE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__MIN_INCLUSIVE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__MIN_LENGTH);
        createEReference(documentRootEClass, DOCUMENT_ROOT__NOTATION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__OPEN_CONTENT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__OVERRIDE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__PATTERN);
        createEReference(documentRootEClass, DOCUMENT_ROOT__REDEFINE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__RESTRICTION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__SCHEMA);
        createEReference(documentRootEClass, DOCUMENT_ROOT__SELECTOR);
        createEReference(documentRootEClass, DOCUMENT_ROOT__SEQUENCE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__SIMPLE_CONTENT);
        createEReference(documentRootEClass, DOCUMENT_ROOT__SIMPLE_TYPE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__TOTAL_DIGITS);
        createEReference(documentRootEClass, DOCUMENT_ROOT__UNION);
        createEReference(documentRootEClass, DOCUMENT_ROOT__UNIQUE);
        createEReference(documentRootEClass, DOCUMENT_ROOT__WHITE_SPACE);

        elementEClass = createEClass(ELEMENT);
        createEReference(elementEClass, ELEMENT__SIMPLE_TYPE);
        createEReference(elementEClass, ELEMENT__COMPLEX_TYPE);
        createEReference(elementEClass, ELEMENT__ALTERNATIVE);
        createEAttribute(elementEClass, ELEMENT__IDENTITY_CONSTRAINT);
        createEReference(elementEClass, ELEMENT__UNIQUE);
        createEReference(elementEClass, ELEMENT__KEY);
        createEReference(elementEClass, ELEMENT__KEYREF);
        createEAttribute(elementEClass, ELEMENT__MAX_OCCURS);
        createEAttribute(elementEClass, ELEMENT__MIN_OCCURS);
        createEAttribute(elementEClass, ELEMENT__NAME);
        createEAttribute(elementEClass, ELEMENT__REF);
        createEAttribute(elementEClass, ELEMENT__TYPE);
        createEAttribute(elementEClass, ELEMENT__SUBSTITUTION_GROUP);
        createEAttribute(elementEClass, ELEMENT__DEFAULT);
        createEAttribute(elementEClass, ELEMENT__FIXED);
        createEAttribute(elementEClass, ELEMENT__NILLABLE);
        createEAttribute(elementEClass, ELEMENT__ABSTRACT);
        createEAttribute(elementEClass, ELEMENT__FINAL);
        createEAttribute(elementEClass, ELEMENT__BLOCK);
        createEAttribute(elementEClass, ELEMENT__FORM);
        createEAttribute(elementEClass, ELEMENT__TARGET_NAMESPACE);

        explicitGroupEClass = createEClass(EXPLICIT_GROUP);

        explicitTimezoneTypeEClass = createEClass(EXPLICIT_TIMEZONE_TYPE);

        extensionTypeEClass = createEClass(EXTENSION_TYPE);
        createEReference(extensionTypeEClass, EXTENSION_TYPE__OPEN_CONTENT);
        createEReference(extensionTypeEClass, EXTENSION_TYPE__GROUP);
        createEReference(extensionTypeEClass, EXTENSION_TYPE__ALL);
        createEReference(extensionTypeEClass, EXTENSION_TYPE__CHOICE);
        createEReference(extensionTypeEClass, EXTENSION_TYPE__SEQUENCE);
        createEAttribute(extensionTypeEClass, EXTENSION_TYPE__GROUP1);
        createEReference(extensionTypeEClass, EXTENSION_TYPE__ATTRIBUTE);
        createEReference(extensionTypeEClass, EXTENSION_TYPE__ATTRIBUTE_GROUP);
        createEReference(extensionTypeEClass, EXTENSION_TYPE__ANY_ATTRIBUTE1);
        createEReference(extensionTypeEClass, EXTENSION_TYPE__ASSERT);
        createEAttribute(extensionTypeEClass, EXTENSION_TYPE__BASE);

        facetEClass = createEClass(FACET);
        createEAttribute(facetEClass, FACET__VALUE);
        createEAttribute(facetEClass, FACET__FIXED);

        fieldTypeEClass = createEClass(FIELD_TYPE);
        createEAttribute(fieldTypeEClass, FIELD_TYPE__XPATH);
        createEAttribute(fieldTypeEClass, FIELD_TYPE__XPATH_DEFAULT_NAMESPACE);

        groupEClass = createEClass(GROUP);
        createEAttribute(groupEClass, GROUP__PARTICLE);
        createEReference(groupEClass, GROUP__ELEMENT);
        createEReference(groupEClass, GROUP__GROUP);
        createEReference(groupEClass, GROUP__ALL);
        createEReference(groupEClass, GROUP__CHOICE);
        createEReference(groupEClass, GROUP__SEQUENCE);
        createEReference(groupEClass, GROUP__ANY);
        createEAttribute(groupEClass, GROUP__MAX_OCCURS);
        createEAttribute(groupEClass, GROUP__MIN_OCCURS);
        createEAttribute(groupEClass, GROUP__NAME);
        createEAttribute(groupEClass, GROUP__REF);

        groupRefEClass = createEClass(GROUP_REF);

        importTypeEClass = createEClass(IMPORT_TYPE);
        createEAttribute(importTypeEClass, IMPORT_TYPE__NAMESPACE);
        createEAttribute(importTypeEClass, IMPORT_TYPE__SCHEMA_LOCATION);

        includeTypeEClass = createEClass(INCLUDE_TYPE);
        createEAttribute(includeTypeEClass, INCLUDE_TYPE__SCHEMA_LOCATION);

        intFacetEClass = createEClass(INT_FACET);

        keybaseEClass = createEClass(KEYBASE);
        createEReference(keybaseEClass, KEYBASE__SELECTOR);
        createEReference(keybaseEClass, KEYBASE__FIELD);
        createEAttribute(keybaseEClass, KEYBASE__NAME);
        createEAttribute(keybaseEClass, KEYBASE__REF);

        keyrefTypeEClass = createEClass(KEYREF_TYPE);
        createEAttribute(keyrefTypeEClass, KEYREF_TYPE__REFER);

        listTypeEClass = createEClass(LIST_TYPE);
        createEReference(listTypeEClass, LIST_TYPE__SIMPLE_TYPE);
        createEAttribute(listTypeEClass, LIST_TYPE__ITEM_TYPE);

        localComplexTypeEClass = createEClass(LOCAL_COMPLEX_TYPE);

        localElementEClass = createEClass(LOCAL_ELEMENT);

        localSimpleTypeEClass = createEClass(LOCAL_SIMPLE_TYPE);

        namedAttributeGroupEClass = createEClass(NAMED_ATTRIBUTE_GROUP);

        namedGroupEClass = createEClass(NAMED_GROUP);

        noFixedFacetEClass = createEClass(NO_FIXED_FACET);

        notationTypeEClass = createEClass(NOTATION_TYPE);
        createEAttribute(notationTypeEClass, NOTATION_TYPE__NAME);
        createEAttribute(notationTypeEClass, NOTATION_TYPE__PUBLIC);
        createEAttribute(notationTypeEClass, NOTATION_TYPE__SYSTEM);

        numFacetEClass = createEClass(NUM_FACET);

        openAttrsEClass = createEClass(OPEN_ATTRS);
        createEAttribute(openAttrsEClass, OPEN_ATTRS__ANY_ATTRIBUTE);

        openContentTypeEClass = createEClass(OPEN_CONTENT_TYPE);
        createEReference(openContentTypeEClass, OPEN_CONTENT_TYPE__ANY);
        createEAttribute(openContentTypeEClass, OPEN_CONTENT_TYPE__MODE);

        overrideTypeEClass = createEClass(OVERRIDE_TYPE);
        createEReference(overrideTypeEClass, OVERRIDE_TYPE__ANNOTATION);
        createEAttribute(overrideTypeEClass, OVERRIDE_TYPE__SCHEMA_TOP);
        createEReference(overrideTypeEClass, OVERRIDE_TYPE__SIMPLE_TYPE);
        createEReference(overrideTypeEClass, OVERRIDE_TYPE__COMPLEX_TYPE);
        createEReference(overrideTypeEClass, OVERRIDE_TYPE__GROUP);
        createEReference(overrideTypeEClass, OVERRIDE_TYPE__ATTRIBUTE_GROUP);
        createEReference(overrideTypeEClass, OVERRIDE_TYPE__ELEMENT);
        createEReference(overrideTypeEClass, OVERRIDE_TYPE__ATTRIBUTE);
        createEReference(overrideTypeEClass, OVERRIDE_TYPE__NOTATION);
        createEAttribute(overrideTypeEClass, OVERRIDE_TYPE__SCHEMA_LOCATION);
        createEAttribute(overrideTypeEClass, OVERRIDE_TYPE__ID);

        patternTypeEClass = createEClass(PATTERN_TYPE);

        realGroupEClass = createEClass(REAL_GROUP);
        createEReference(realGroupEClass, REAL_GROUP__ALL1);
        createEReference(realGroupEClass, REAL_GROUP__CHOICE1);
        createEReference(realGroupEClass, REAL_GROUP__SEQUENCE1);

        redefineTypeEClass = createEClass(REDEFINE_TYPE);
        createEAttribute(redefineTypeEClass, REDEFINE_TYPE__GROUP);
        createEReference(redefineTypeEClass, REDEFINE_TYPE__ANNOTATION);
        createEReference(redefineTypeEClass, REDEFINE_TYPE__SIMPLE_TYPE);
        createEReference(redefineTypeEClass, REDEFINE_TYPE__COMPLEX_TYPE);
        createEReference(redefineTypeEClass, REDEFINE_TYPE__GROUP1);
        createEReference(redefineTypeEClass, REDEFINE_TYPE__ATTRIBUTE_GROUP);
        createEAttribute(redefineTypeEClass, REDEFINE_TYPE__SCHEMA_LOCATION);
        createEAttribute(redefineTypeEClass, REDEFINE_TYPE__ID);

        restrictionTypeEClass = createEClass(RESTRICTION_TYPE);
        createEReference(restrictionTypeEClass, RESTRICTION_TYPE__OPEN_CONTENT);
        createEReference(restrictionTypeEClass, RESTRICTION_TYPE__GROUP);
        createEReference(restrictionTypeEClass, RESTRICTION_TYPE__ALL);
        createEReference(restrictionTypeEClass, RESTRICTION_TYPE__CHOICE);
        createEReference(restrictionTypeEClass, RESTRICTION_TYPE__SEQUENCE);
        createEReference(restrictionTypeEClass, RESTRICTION_TYPE__SIMPLE_TYPE);
        createEAttribute(restrictionTypeEClass, RESTRICTION_TYPE__GROUP1);
        createEAttribute(restrictionTypeEClass, RESTRICTION_TYPE__FACET_GROUP);
        createEReference(restrictionTypeEClass, RESTRICTION_TYPE__FACET);
        createEAttribute(restrictionTypeEClass, RESTRICTION_TYPE__ANY);
        createEAttribute(restrictionTypeEClass, RESTRICTION_TYPE__GROUP2);
        createEReference(restrictionTypeEClass, RESTRICTION_TYPE__ATTRIBUTE);
        createEReference(restrictionTypeEClass, RESTRICTION_TYPE__ATTRIBUTE_GROUP);
        createEReference(restrictionTypeEClass, RESTRICTION_TYPE__ANY_ATTRIBUTE1);
        createEReference(restrictionTypeEClass, RESTRICTION_TYPE__ASSERT);
        createEAttribute(restrictionTypeEClass, RESTRICTION_TYPE__BASE);

        restrictionType1EClass = createEClass(RESTRICTION_TYPE1);
        createEReference(restrictionType1EClass, RESTRICTION_TYPE1__SIMPLE_TYPE);
        createEAttribute(restrictionType1EClass, RESTRICTION_TYPE1__GROUP);
        createEAttribute(restrictionType1EClass, RESTRICTION_TYPE1__FACET_GROUP);
        createEReference(restrictionType1EClass, RESTRICTION_TYPE1__FACET);
        createEAttribute(restrictionType1EClass, RESTRICTION_TYPE1__ANY);
        createEAttribute(restrictionType1EClass, RESTRICTION_TYPE1__BASE);

        schemaTypeEClass = createEClass(SCHEMA_TYPE);
        createEAttribute(schemaTypeEClass, SCHEMA_TYPE__COMPOSITION);
        createEReference(schemaTypeEClass, SCHEMA_TYPE__INCLUDE);
        createEReference(schemaTypeEClass, SCHEMA_TYPE__IMPORT);
        createEReference(schemaTypeEClass, SCHEMA_TYPE__REDEFINE);
        createEReference(schemaTypeEClass, SCHEMA_TYPE__OVERRIDE);
        createEReference(schemaTypeEClass, SCHEMA_TYPE__ANNOTATION);
        createEReference(schemaTypeEClass, SCHEMA_TYPE__DEFAULT_OPEN_CONTENT);
        createEReference(schemaTypeEClass, SCHEMA_TYPE__ANNOTATION1);
        createEAttribute(schemaTypeEClass, SCHEMA_TYPE__GROUP);
        createEReference(schemaTypeEClass, SCHEMA_TYPE__SIMPLE_TYPE);
        createEReference(schemaTypeEClass, SCHEMA_TYPE__COMPLEX_TYPE);
        createEReference(schemaTypeEClass, SCHEMA_TYPE__GROUP1);
        createEReference(schemaTypeEClass, SCHEMA_TYPE__ATTRIBUTE_GROUP);
        createEReference(schemaTypeEClass, SCHEMA_TYPE__ELEMENT);
        createEReference(schemaTypeEClass, SCHEMA_TYPE__ATTRIBUTE);
        createEReference(schemaTypeEClass, SCHEMA_TYPE__NOTATION);
        createEReference(schemaTypeEClass, SCHEMA_TYPE__ANNOTATION2);
        createEAttribute(schemaTypeEClass, SCHEMA_TYPE__TARGET_NAMESPACE);
        createEAttribute(schemaTypeEClass, SCHEMA_TYPE__VERSION);
        createEAttribute(schemaTypeEClass, SCHEMA_TYPE__FINAL_DEFAULT);
        createEAttribute(schemaTypeEClass, SCHEMA_TYPE__BLOCK_DEFAULT);
        createEAttribute(schemaTypeEClass, SCHEMA_TYPE__ATTRIBUTE_FORM_DEFAULT);
        createEAttribute(schemaTypeEClass, SCHEMA_TYPE__ELEMENT_FORM_DEFAULT);
        createEAttribute(schemaTypeEClass, SCHEMA_TYPE__DEFAULT_ATTRIBUTES);
        createEAttribute(schemaTypeEClass, SCHEMA_TYPE__XPATH_DEFAULT_NAMESPACE);
        createEAttribute(schemaTypeEClass, SCHEMA_TYPE__ID);
        createEAttribute(schemaTypeEClass, SCHEMA_TYPE__LANG);

        selectorTypeEClass = createEClass(SELECTOR_TYPE);
        createEAttribute(selectorTypeEClass, SELECTOR_TYPE__XPATH);
        createEAttribute(selectorTypeEClass, SELECTOR_TYPE__XPATH_DEFAULT_NAMESPACE);

        simpleContentTypeEClass = createEClass(SIMPLE_CONTENT_TYPE);
        createEReference(simpleContentTypeEClass, SIMPLE_CONTENT_TYPE__RESTRICTION);
        createEReference(simpleContentTypeEClass, SIMPLE_CONTENT_TYPE__EXTENSION);

        simpleExplicitGroupEClass = createEClass(SIMPLE_EXPLICIT_GROUP);

        simpleExtensionTypeEClass = createEClass(SIMPLE_EXTENSION_TYPE);

        simpleRestrictionTypeEClass = createEClass(SIMPLE_RESTRICTION_TYPE);

        simpleTypeEClass = createEClass(SIMPLE_TYPE);
        createEReference(simpleTypeEClass, SIMPLE_TYPE__RESTRICTION);
        createEReference(simpleTypeEClass, SIMPLE_TYPE__LIST);
        createEReference(simpleTypeEClass, SIMPLE_TYPE__UNION);
        createEAttribute(simpleTypeEClass, SIMPLE_TYPE__FINAL);
        createEAttribute(simpleTypeEClass, SIMPLE_TYPE__NAME);

        topLevelAttributeEClass = createEClass(TOP_LEVEL_ATTRIBUTE);

        topLevelComplexTypeEClass = createEClass(TOP_LEVEL_COMPLEX_TYPE);

        topLevelElementEClass = createEClass(TOP_LEVEL_ELEMENT);

        topLevelSimpleTypeEClass = createEClass(TOP_LEVEL_SIMPLE_TYPE);

        totalDigitsTypeEClass = createEClass(TOTAL_DIGITS_TYPE);

        unionTypeEClass = createEClass(UNION_TYPE);
        createEReference(unionTypeEClass, UNION_TYPE__SIMPLE_TYPE);
        createEAttribute(unionTypeEClass, UNION_TYPE__MEMBER_TYPES);

        whiteSpaceTypeEClass = createEClass(WHITE_SPACE_TYPE);

        wildcardEClass = createEClass(WILDCARD);
        createEAttribute(wildcardEClass, WILDCARD__NAMESPACE);
        createEAttribute(wildcardEClass, WILDCARD__NOT_NAMESPACE);
        createEAttribute(wildcardEClass, WILDCARD__PROCESS_CONTENTS);

        // Create enums
        allNNIMember1EEnum = createEEnum(ALL_NNI_MEMBER1);
        basicNamespaceListItemMember1EEnum = createEEnum(BASIC_NAMESPACE_LIST_ITEM_MEMBER1);
        blockSetMember0EEnum = createEEnum(BLOCK_SET_MEMBER0);
        blockSetMember1ItemEEnum = createEEnum(BLOCK_SET_MEMBER1_ITEM);
        derivationControlEEnum = createEEnum(DERIVATION_CONTROL);
        derivationSetMember0EEnum = createEEnum(DERIVATION_SET_MEMBER0);
        formChoiceEEnum = createEEnum(FORM_CHOICE);
        fullDerivationSetMember0EEnum = createEEnum(FULL_DERIVATION_SET_MEMBER0);
        modeTypeEEnum = createEEnum(MODE_TYPE);
        modeType1EEnum = createEEnum(MODE_TYPE1);
        processContentsTypeEEnum = createEEnum(PROCESS_CONTENTS_TYPE);
        qnameListAItemMember1EEnum = createEEnum(QNAME_LIST_AITEM_MEMBER1);
        qnameListItemMember1EEnum = createEEnum(QNAME_LIST_ITEM_MEMBER1);
        reducedDerivationControlEEnum = createEEnum(REDUCED_DERIVATION_CONTROL);
        simpleDerivationSetMember0EEnum = createEEnum(SIMPLE_DERIVATION_SET_MEMBER0);
        simpleDerivationSetMember1ItemEEnum = createEEnum(SIMPLE_DERIVATION_SET_MEMBER1_ITEM);
        specialNamespaceListEEnum = createEEnum(SPECIAL_NAMESPACE_LIST);
        typeDerivationControlEEnum = createEEnum(TYPE_DERIVATION_CONTROL);
        useTypeEEnum = createEEnum(USE_TYPE);
        xpathDefaultNamespaceMember1EEnum = createEEnum(XPATH_DEFAULT_NAMESPACE_MEMBER1);

        // Create data types
        allNNIEDataType = createEDataType(ALL_NNI);
        allNNIMember1ObjectEDataType = createEDataType(ALL_NNI_MEMBER1_OBJECT);
        basicNamespaceListEDataType = createEDataType(BASIC_NAMESPACE_LIST);
        basicNamespaceListItemEDataType = createEDataType(BASIC_NAMESPACE_LIST_ITEM);
        basicNamespaceListItemMember1ObjectEDataType = createEDataType(BASIC_NAMESPACE_LIST_ITEM_MEMBER1_OBJECT);
        blockSetEDataType = createEDataType(BLOCK_SET);
        blockSetMember0ObjectEDataType = createEDataType(BLOCK_SET_MEMBER0_OBJECT);
        blockSetMember1EDataType = createEDataType(BLOCK_SET_MEMBER1);
        blockSetMember1ItemObjectEDataType = createEDataType(BLOCK_SET_MEMBER1_ITEM_OBJECT);
        derivationControlObjectEDataType = createEDataType(DERIVATION_CONTROL_OBJECT);
        derivationSetEDataType = createEDataType(DERIVATION_SET);
        derivationSetMember0ObjectEDataType = createEDataType(DERIVATION_SET_MEMBER0_OBJECT);
        derivationSetMember1EDataType = createEDataType(DERIVATION_SET_MEMBER1);
        formChoiceObjectEDataType = createEDataType(FORM_CHOICE_OBJECT);
        fullDerivationSetEDataType = createEDataType(FULL_DERIVATION_SET);
        fullDerivationSetMember0ObjectEDataType = createEDataType(FULL_DERIVATION_SET_MEMBER0_OBJECT);
        fullDerivationSetMember1EDataType = createEDataType(FULL_DERIVATION_SET_MEMBER1);
        memberTypesTypeEDataType = createEDataType(MEMBER_TYPES_TYPE);
        modeTypeObjectEDataType = createEDataType(MODE_TYPE_OBJECT);
        modeTypeObject1EDataType = createEDataType(MODE_TYPE_OBJECT1);
        namespaceListEDataType = createEDataType(NAMESPACE_LIST);
        notNamespaceTypeEDataType = createEDataType(NOT_NAMESPACE_TYPE);
        processContentsTypeObjectEDataType = createEDataType(PROCESS_CONTENTS_TYPE_OBJECT);
        publicEDataType = createEDataType(PUBLIC);
        qnameListEDataType = createEDataType(QNAME_LIST);
        qnameListAEDataType = createEDataType(QNAME_LIST_A);
        qnameListAItemEDataType = createEDataType(QNAME_LIST_AITEM);
        qnameListAItemMember1ObjectEDataType = createEDataType(QNAME_LIST_AITEM_MEMBER1_OBJECT);
        qnameListItemEDataType = createEDataType(QNAME_LIST_ITEM);
        qnameListItemMember1ObjectEDataType = createEDataType(QNAME_LIST_ITEM_MEMBER1_OBJECT);
        reducedDerivationControlObjectEDataType = createEDataType(REDUCED_DERIVATION_CONTROL_OBJECT);
        simpleDerivationSetEDataType = createEDataType(SIMPLE_DERIVATION_SET);
        simpleDerivationSetMember0ObjectEDataType = createEDataType(SIMPLE_DERIVATION_SET_MEMBER0_OBJECT);
        simpleDerivationSetMember1EDataType = createEDataType(SIMPLE_DERIVATION_SET_MEMBER1);
        simpleDerivationSetMember1ItemObjectEDataType = createEDataType(SIMPLE_DERIVATION_SET_MEMBER1_ITEM_OBJECT);
        specialNamespaceListObjectEDataType = createEDataType(SPECIAL_NAMESPACE_LIST_OBJECT);
        substitutionGroupTypeEDataType = createEDataType(SUBSTITUTION_GROUP_TYPE);
        typeDerivationControlObjectEDataType = createEDataType(TYPE_DERIVATION_CONTROL_OBJECT);
        useTypeObjectEDataType = createEDataType(USE_TYPE_OBJECT);
        xpathDefaultNamespaceEDataType = createEDataType(XPATH_DEFAULT_NAMESPACE);
        xpathDefaultNamespaceMember1ObjectEDataType = createEDataType(XPATH_DEFAULT_NAMESPACE_MEMBER1_OBJECT);
        xpathTypeEDataType = createEDataType(XPATH_TYPE);
        xpathType1EDataType = createEDataType(XPATH_TYPE1);
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

        // Obtain other dependent packages
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
        XMLNamespacePackage theXMLNamespacePackage = (XMLNamespacePackage)EPackage.Registry.INSTANCE.getEPackage(XMLNamespacePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        allEClass.getESuperTypes().add(this.getExplicitGroup());
        altTypeEClass.getESuperTypes().add(this.getAnnotated());
        annotatedEClass.getESuperTypes().add(this.getOpenAttrs());
        annotationTypeEClass.getESuperTypes().add(this.getOpenAttrs());
        anyAttributeTypeEClass.getESuperTypes().add(this.getWildcard());
        anyTypeEClass.getESuperTypes().add(this.getWildcard());
        assertionEClass.getESuperTypes().add(this.getAnnotated());
        attributeEClass.getESuperTypes().add(this.getAnnotated());
        attributeGroupEClass.getESuperTypes().add(this.getAnnotated());
        attributeGroupRefEClass.getESuperTypes().add(this.getAttributeGroup());
        complexContentTypeEClass.getESuperTypes().add(this.getAnnotated());
        complexRestrictionTypeEClass.getESuperTypes().add(this.getRestrictionType());
        complexTypeEClass.getESuperTypes().add(this.getAnnotated());
        defaultOpenContentTypeEClass.getESuperTypes().add(this.getAnnotated());
        elementEClass.getESuperTypes().add(this.getAnnotated());
        explicitGroupEClass.getESuperTypes().add(this.getGroup());
        explicitTimezoneTypeEClass.getESuperTypes().add(this.getFacet());
        extensionTypeEClass.getESuperTypes().add(this.getAnnotated());
        facetEClass.getESuperTypes().add(this.getAnnotated());
        fieldTypeEClass.getESuperTypes().add(this.getAnnotated());
        groupEClass.getESuperTypes().add(this.getAnnotated());
        groupRefEClass.getESuperTypes().add(this.getRealGroup());
        importTypeEClass.getESuperTypes().add(this.getAnnotated());
        includeTypeEClass.getESuperTypes().add(this.getAnnotated());
        intFacetEClass.getESuperTypes().add(this.getFacet());
        keybaseEClass.getESuperTypes().add(this.getAnnotated());
        keyrefTypeEClass.getESuperTypes().add(this.getKeybase());
        listTypeEClass.getESuperTypes().add(this.getAnnotated());
        localComplexTypeEClass.getESuperTypes().add(this.getComplexType());
        localElementEClass.getESuperTypes().add(this.getElement());
        localSimpleTypeEClass.getESuperTypes().add(this.getSimpleType());
        namedAttributeGroupEClass.getESuperTypes().add(this.getAttributeGroup());
        namedGroupEClass.getESuperTypes().add(this.getRealGroup());
        noFixedFacetEClass.getESuperTypes().add(this.getFacet());
        notationTypeEClass.getESuperTypes().add(this.getAnnotated());
        numFacetEClass.getESuperTypes().add(this.getFacet());
        openContentTypeEClass.getESuperTypes().add(this.getAnnotated());
        overrideTypeEClass.getESuperTypes().add(this.getOpenAttrs());
        patternTypeEClass.getESuperTypes().add(this.getNoFixedFacet());
        realGroupEClass.getESuperTypes().add(this.getGroup());
        redefineTypeEClass.getESuperTypes().add(this.getOpenAttrs());
        restrictionTypeEClass.getESuperTypes().add(this.getAnnotated());
        restrictionType1EClass.getESuperTypes().add(this.getAnnotated());
        schemaTypeEClass.getESuperTypes().add(this.getOpenAttrs());
        selectorTypeEClass.getESuperTypes().add(this.getAnnotated());
        simpleContentTypeEClass.getESuperTypes().add(this.getAnnotated());
        simpleExplicitGroupEClass.getESuperTypes().add(this.getExplicitGroup());
        simpleExtensionTypeEClass.getESuperTypes().add(this.getExtensionType());
        simpleRestrictionTypeEClass.getESuperTypes().add(this.getRestrictionType());
        simpleTypeEClass.getESuperTypes().add(this.getAnnotated());
        topLevelAttributeEClass.getESuperTypes().add(this.getAttribute());
        topLevelComplexTypeEClass.getESuperTypes().add(this.getComplexType());
        topLevelElementEClass.getESuperTypes().add(this.getElement());
        topLevelSimpleTypeEClass.getESuperTypes().add(this.getSimpleType());
        totalDigitsTypeEClass.getESuperTypes().add(this.getNumFacet());
        unionTypeEClass.getESuperTypes().add(this.getAnnotated());
        whiteSpaceTypeEClass.getESuperTypes().add(this.getFacet());
        wildcardEClass.getESuperTypes().add(this.getAnnotated());

        // Initialize classes, features, and operations; add parameters
        initEClass(allEClass, All.class, "All", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(altTypeEClass, AltType.class, "AltType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAltType_SimpleType(), this.getLocalSimpleType(), null, "simpleType", null, 0, 1, AltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAltType_ComplexType(), this.getLocalComplexType(), null, "complexType", null, 0, 1, AltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAltType_Test(), theXMLTypePackage.getString(), "test", null, 0, 1, AltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAltType_Type(), theXMLTypePackage.getQName(), "type", null, 0, 1, AltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAltType_XpathDefaultNamespace(), this.getXpathDefaultNamespace(), "xpathDefaultNamespace", null, 0, 1, AltType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(annotatedEClass, Annotated.class, "Annotated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAnnotated_Annotation(), this.getAnnotationType(), null, "annotation", null, 0, 1, Annotated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAnnotated_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Annotated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(annotationTypeEClass, AnnotationType.class, "AnnotationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAnnotationType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAnnotationType_Appinfo(), this.getAppinfoType(), null, "appinfo", null, 0, -1, AnnotationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getAnnotationType_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -1, AnnotationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getAnnotationType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, AnnotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(anyAttributeTypeEClass, AnyAttributeType.class, "AnyAttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAnyAttributeType_NotQName(), this.getQnameListA(), "notQName", null, 0, 1, AnyAttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(anyTypeEClass, AnyType.class, "AnyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAnyType_MaxOccurs(), this.getAllNNI(), "maxOccurs", "1", 0, 1, AnyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAnyType_MinOccurs(), theXMLTypePackage.getNonNegativeInteger(), "minOccurs", "1", 0, 1, AnyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAnyType_NotQName(), this.getQnameList(), "notQName", null, 0, 1, AnyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(appinfoTypeEClass, AppinfoType.class, "AppinfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAppinfoType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, AppinfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAppinfoType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, AppinfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getAppinfoType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, AppinfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getAppinfoType_Source(), theXMLTypePackage.getAnyURI(), "source", null, 0, 1, AppinfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAppinfoType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, AppinfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAssertion_Test(), theXMLTypePackage.getString(), "test", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAssertion_XpathDefaultNamespace(), this.getXpathDefaultNamespace(), "xpathDefaultNamespace", null, 0, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAttribute_SimpleType(), this.getLocalSimpleType(), null, "simpleType", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_Name(), theXMLTypePackage.getNCName(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_Ref(), theXMLTypePackage.getQName(), "ref", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_Type(), theXMLTypePackage.getQName(), "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_Use(), this.getUseType(), "use", "optional", 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_Default(), theXMLTypePackage.getString(), "default", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_Fixed(), theXMLTypePackage.getString(), "fixed", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_Form(), this.getFormChoice(), "form", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_TargetNamespace(), theXMLTypePackage.getAnyURI(), "targetNamespace", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_Inheritable(), theXMLTypePackage.getBoolean(), "inheritable", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeGroupEClass, AttributeGroup.class, "AttributeGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAttributeGroup_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttributeGroup_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, AttributeGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getAttributeGroup_AttributeGroup(), this.getAttributeGroupRef(), null, "attributeGroup", null, 0, -1, AttributeGroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getAttributeGroup_AnyAttribute1(), this.getAnyAttributeType(), null, "anyAttribute1", null, 0, 1, AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttributeGroup_Name(), theXMLTypePackage.getNCName(), "name", null, 0, 1, AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttributeGroup_Ref(), theXMLTypePackage.getQName(), "ref", null, 0, 1, AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeGroupRefEClass, AttributeGroupRef.class, "AttributeGroupRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(complexContentTypeEClass, ComplexContentType.class, "ComplexContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getComplexContentType_Restriction(), this.getComplexRestrictionType(), null, "restriction", null, 0, 1, ComplexContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComplexContentType_Extension(), this.getExtensionType(), null, "extension", null, 0, 1, ComplexContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getComplexContentType_Mixed(), theXMLTypePackage.getBoolean(), "mixed", null, 0, 1, ComplexContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(complexRestrictionTypeEClass, ComplexRestrictionType.class, "ComplexRestrictionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(complexTypeEClass, ComplexType.class, "ComplexType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getComplexType_SimpleContent(), this.getSimpleContentType(), null, "simpleContent", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComplexType_ComplexContent(), this.getComplexContentType(), null, "complexContent", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComplexType_OpenContent(), this.getOpenContentType(), null, "openContent", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComplexType_Group(), this.getGroupRef(), null, "group", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComplexType_All(), this.getAll(), null, "all", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComplexType_Choice(), this.getExplicitGroup(), null, "choice", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComplexType_Sequence(), this.getExplicitGroup(), null, "sequence", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getComplexType_Group1(), ecorePackage.getEFeatureMapEntry(), "group1", null, 0, -1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComplexType_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, ComplexType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getComplexType_AttributeGroup(), this.getAttributeGroupRef(), null, "attributeGroup", null, 0, -1, ComplexType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getComplexType_AnyAttribute1(), this.getAnyAttributeType(), null, "anyAttribute1", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getComplexType_Assert(), this.getAssertion(), null, "assert", null, 0, -1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getComplexType_Name(), theXMLTypePackage.getNCName(), "name", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getComplexType_Mixed(), theXMLTypePackage.getBoolean(), "mixed", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getComplexType_Abstract(), theXMLTypePackage.getBoolean(), "abstract", "false", 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getComplexType_Final(), this.getDerivationSet(), "final", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getComplexType_Block(), this.getDerivationSet(), "block", null, 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getComplexType_DefaultAttributesApply(), theXMLTypePackage.getBoolean(), "defaultAttributesApply", "true", 0, 1, ComplexType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(defaultOpenContentTypeEClass, DefaultOpenContentType.class, "DefaultOpenContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDefaultOpenContentType_Any(), this.getWildcard(), null, "any", null, 1, 1, DefaultOpenContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDefaultOpenContentType_AppliesToEmpty(), theXMLTypePackage.getBoolean(), "appliesToEmpty", "false", 0, 1, DefaultOpenContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDefaultOpenContentType_Mode(), this.getModeType(), "mode", "interleave", 0, 1, DefaultOpenContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentationTypeEClass, DocumentationType.class, "DocumentationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentationType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DocumentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentationType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, DocumentationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentationType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, DocumentationType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentationType_Source(), theXMLTypePackage.getAnyURI(), "source", null, 0, 1, DocumentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentationType_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, DocumentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDocumentationType_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, DocumentationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_All(), this.getAll(), null, "all", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Annotation(), this.getAnnotationType(), null, "annotation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Any(), this.getAnyType(), null, "any", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_AnyAttribute(), this.getAnyAttributeType(), null, "anyAttribute", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Appinfo(), this.getAppinfoType(), null, "appinfo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Assertion(), this.getAssertion(), null, "assertion", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Facet(), ecorePackage.getEObject(), null, "facet", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Attribute(), this.getTopLevelAttribute(), null, "attribute", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_AttributeGroup(), this.getNamedAttributeGroup(), null, "attributeGroup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Choice(), this.getExplicitGroup(), null, "choice", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_ComplexContent(), this.getComplexContentType(), null, "complexContent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_ComplexType(), this.getTopLevelComplexType(), null, "complexType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_DefaultOpenContent(), this.getDefaultOpenContentType(), null, "defaultOpenContent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Documentation(), this.getDocumentationType(), null, "documentation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Element(), this.getTopLevelElement(), null, "element", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Enumeration(), this.getNoFixedFacet(), null, "enumeration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_ExplicitTimezone(), this.getExplicitTimezoneType(), null, "explicitTimezone", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Field(), this.getFieldType(), null, "field", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_FractionDigits(), this.getNumFacet(), null, "fractionDigits", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Group(), this.getNamedGroup(), null, "group", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Import(), this.getImportType(), null, "import", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Include(), this.getIncludeType(), null, "include", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Key(), this.getKeybase(), null, "key", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Keyref(), this.getKeyrefType(), null, "keyref", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Length(), this.getNumFacet(), null, "length", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_List(), this.getListType(), null, "list", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_MaxExclusive(), this.getFacet(), null, "maxExclusive", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_MaxInclusive(), this.getFacet(), null, "maxInclusive", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_MaxLength(), this.getNumFacet(), null, "maxLength", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_MinExclusive(), this.getFacet(), null, "minExclusive", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_MinInclusive(), this.getFacet(), null, "minInclusive", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_MinLength(), this.getNumFacet(), null, "minLength", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Notation(), this.getNotationType(), null, "notation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_OpenContent(), this.getOpenContentType(), null, "openContent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Override(), this.getOverrideType(), null, "override", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Pattern(), this.getPatternType(), null, "pattern", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Redefine(), this.getRedefineType(), null, "redefine", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Restriction(), this.getRestrictionType1(), null, "restriction", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Schema(), this.getSchemaType(), null, "schema", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Selector(), this.getSelectorType(), null, "selector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Sequence(), this.getExplicitGroup(), null, "sequence", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_SimpleContent(), this.getSimpleContentType(), null, "simpleContent", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_SimpleType(), this.getTopLevelSimpleType(), null, "simpleType", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_TotalDigits(), this.getTotalDigitsType(), null, "totalDigits", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Union(), this.getUnionType(), null, "union", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_Unique(), this.getKeybase(), null, "unique", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getDocumentRoot_WhiteSpace(), this.getWhiteSpaceType(), null, "whiteSpace", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getElement_SimpleType(), this.getLocalSimpleType(), null, "simpleType", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getElement_ComplexType(), this.getLocalComplexType(), null, "complexType", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getElement_Alternative(), this.getAltType(), null, "alternative", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElement_IdentityConstraint(), ecorePackage.getEFeatureMapEntry(), "identityConstraint", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getElement_Unique(), this.getKeybase(), null, "unique", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getElement_Key(), this.getKeybase(), null, "key", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getElement_Keyref(), this.getKeyrefType(), null, "keyref", null, 0, -1, Element.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getElement_MaxOccurs(), this.getAllNNI(), "maxOccurs", "1", 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElement_MinOccurs(), theXMLTypePackage.getNonNegativeInteger(), "minOccurs", "1", 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElement_Name(), theXMLTypePackage.getNCName(), "name", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElement_Ref(), theXMLTypePackage.getQName(), "ref", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElement_Type(), theXMLTypePackage.getQName(), "type", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElement_SubstitutionGroup(), this.getSubstitutionGroupType(), "substitutionGroup", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElement_Default(), theXMLTypePackage.getString(), "default", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElement_Fixed(), theXMLTypePackage.getString(), "fixed", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElement_Nillable(), theXMLTypePackage.getBoolean(), "nillable", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElement_Abstract(), theXMLTypePackage.getBoolean(), "abstract", "false", 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElement_Final(), this.getDerivationSet(), "final", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElement_Block(), this.getBlockSet(), "block", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElement_Form(), this.getFormChoice(), "form", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getElement_TargetNamespace(), theXMLTypePackage.getAnyURI(), "targetNamespace", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(explicitGroupEClass, ExplicitGroup.class, "ExplicitGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(explicitTimezoneTypeEClass, ExplicitTimezoneType.class, "ExplicitTimezoneType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(extensionTypeEClass, ExtensionType.class, "ExtensionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getExtensionType_OpenContent(), this.getOpenContentType(), null, "openContent", null, 0, 1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtensionType_Group(), this.getGroupRef(), null, "group", null, 0, 1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtensionType_All(), this.getAll(), null, "all", null, 0, 1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtensionType_Choice(), this.getExplicitGroup(), null, "choice", null, 0, 1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtensionType_Sequence(), this.getExplicitGroup(), null, "sequence", null, 0, 1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtensionType_Group1(), ecorePackage.getEFeatureMapEntry(), "group1", null, 0, -1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtensionType_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, ExtensionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getExtensionType_AttributeGroup(), this.getAttributeGroupRef(), null, "attributeGroup", null, 0, -1, ExtensionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getExtensionType_AnyAttribute1(), this.getAnyAttributeType(), null, "anyAttribute1", null, 0, 1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getExtensionType_Assert(), this.getAssertion(), null, "assert", null, 0, -1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getExtensionType_Base(), theXMLTypePackage.getQName(), "base", null, 1, 1, ExtensionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(facetEClass, Facet.class, "Facet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFacet_Value(), theXMLTypePackage.getAnySimpleType(), "value", null, 1, 1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFacet_Fixed(), theXMLTypePackage.getBoolean(), "fixed", "false", 0, 1, Facet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(fieldTypeEClass, FieldType.class, "FieldType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getFieldType_Xpath(), this.getXpathType(), "xpath", null, 1, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFieldType_XpathDefaultNamespace(), this.getXpathDefaultNamespace(), "xpathDefaultNamespace", null, 0, 1, FieldType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(groupEClass, Group.class, "Group", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getGroup_Particle(), ecorePackage.getEFeatureMapEntry(), "particle", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getGroup_Element(), this.getLocalElement(), null, "element", null, 0, -1, Group.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getGroup_Group(), this.getGroupRef(), null, "group", null, 0, -1, Group.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getGroup_All(), this.getAll(), null, "all", null, 0, -1, Group.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getGroup_Choice(), this.getExplicitGroup(), null, "choice", null, 0, -1, Group.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getGroup_Sequence(), this.getExplicitGroup(), null, "sequence", null, 0, -1, Group.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getGroup_Any(), this.getAnyType(), null, "any", null, 0, -1, Group.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getGroup_MaxOccurs(), this.getAllNNI(), "maxOccurs", "1", 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGroup_MinOccurs(), theXMLTypePackage.getNonNegativeInteger(), "minOccurs", "1", 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGroup_Name(), theXMLTypePackage.getNCName(), "name", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getGroup_Ref(), theXMLTypePackage.getQName(), "ref", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(groupRefEClass, GroupRef.class, "GroupRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(importTypeEClass, ImportType.class, "ImportType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getImportType_Namespace(), theXMLTypePackage.getAnyURI(), "namespace", null, 0, 1, ImportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getImportType_SchemaLocation(), theXMLTypePackage.getAnyURI(), "schemaLocation", null, 0, 1, ImportType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(includeTypeEClass, IncludeType.class, "IncludeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getIncludeType_SchemaLocation(), theXMLTypePackage.getAnyURI(), "schemaLocation", null, 1, 1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(intFacetEClass, IntFacet.class, "IntFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(keybaseEClass, Keybase.class, "Keybase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getKeybase_Selector(), this.getSelectorType(), null, "selector", null, 0, 1, Keybase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getKeybase_Field(), this.getFieldType(), null, "field", null, 0, -1, Keybase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKeybase_Name(), theXMLTypePackage.getNCName(), "name", null, 0, 1, Keybase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKeybase_Ref(), theXMLTypePackage.getQName(), "ref", null, 0, 1, Keybase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(keyrefTypeEClass, KeyrefType.class, "KeyrefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getKeyrefType_Refer(), theXMLTypePackage.getQName(), "refer", null, 0, 1, KeyrefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(listTypeEClass, ListType.class, "ListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getListType_SimpleType(), this.getLocalSimpleType(), null, "simpleType", null, 0, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getListType_ItemType(), theXMLTypePackage.getQName(), "itemType", null, 0, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(localComplexTypeEClass, LocalComplexType.class, "LocalComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(localElementEClass, LocalElement.class, "LocalElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(localSimpleTypeEClass, LocalSimpleType.class, "LocalSimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(namedAttributeGroupEClass, NamedAttributeGroup.class, "NamedAttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(namedGroupEClass, NamedGroup.class, "NamedGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(noFixedFacetEClass, NoFixedFacet.class, "NoFixedFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(notationTypeEClass, NotationType.class, "NotationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNotationType_Name(), theXMLTypePackage.getNCName(), "name", null, 1, 1, NotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNotationType_Public(), this.getPublic(), "public", null, 0, 1, NotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNotationType_System(), theXMLTypePackage.getAnyURI(), "system", null, 0, 1, NotationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(numFacetEClass, NumFacet.class, "NumFacet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(openAttrsEClass, OpenAttrs.class, "OpenAttrs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getOpenAttrs_AnyAttribute(), ecorePackage.getEFeatureMapEntry(), "anyAttribute", null, 0, -1, OpenAttrs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(openContentTypeEClass, OpenContentType.class, "OpenContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOpenContentType_Any(), this.getWildcard(), null, "any", null, 0, 1, OpenContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOpenContentType_Mode(), this.getModeType1(), "mode", "interleave", 0, 1, OpenContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(overrideTypeEClass, OverrideType.class, "OverrideType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOverrideType_Annotation(), this.getAnnotationType(), null, "annotation", null, 0, 1, OverrideType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOverrideType_SchemaTop(), ecorePackage.getEFeatureMapEntry(), "schemaTop", null, 0, -1, OverrideType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOverrideType_SimpleType(), this.getTopLevelSimpleType(), null, "simpleType", null, 0, -1, OverrideType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getOverrideType_ComplexType(), this.getTopLevelComplexType(), null, "complexType", null, 0, -1, OverrideType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getOverrideType_Group(), this.getNamedGroup(), null, "group", null, 0, -1, OverrideType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getOverrideType_AttributeGroup(), this.getNamedAttributeGroup(), null, "attributeGroup", null, 0, -1, OverrideType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getOverrideType_Element(), this.getTopLevelElement(), null, "element", null, 0, -1, OverrideType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getOverrideType_Attribute(), this.getTopLevelAttribute(), null, "attribute", null, 0, -1, OverrideType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getOverrideType_Notation(), this.getNotationType(), null, "notation", null, 0, -1, OverrideType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getOverrideType_SchemaLocation(), theXMLTypePackage.getAnyURI(), "schemaLocation", null, 1, 1, OverrideType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getOverrideType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, OverrideType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(patternTypeEClass, PatternType.class, "PatternType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(realGroupEClass, RealGroup.class, "RealGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRealGroup_All1(), this.getAll(), null, "all1", null, 0, 1, RealGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRealGroup_Choice1(), this.getExplicitGroup(), null, "choice1", null, 0, 1, RealGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRealGroup_Sequence1(), this.getExplicitGroup(), null, "sequence1", null, 0, 1, RealGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(redefineTypeEClass, RedefineType.class, "RedefineType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRedefineType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RedefineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRedefineType_Annotation(), this.getAnnotationType(), null, "annotation", null, 0, -1, RedefineType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getRedefineType_SimpleType(), this.getTopLevelSimpleType(), null, "simpleType", null, 0, -1, RedefineType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getRedefineType_ComplexType(), this.getTopLevelComplexType(), null, "complexType", null, 0, -1, RedefineType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getRedefineType_Group1(), this.getNamedGroup(), null, "group1", null, 0, -1, RedefineType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getRedefineType_AttributeGroup(), this.getNamedAttributeGroup(), null, "attributeGroup", null, 0, -1, RedefineType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getRedefineType_SchemaLocation(), theXMLTypePackage.getAnyURI(), "schemaLocation", null, 1, 1, RedefineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRedefineType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, RedefineType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(restrictionTypeEClass, RestrictionType.class, "RestrictionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRestrictionType_OpenContent(), this.getOpenContentType(), null, "openContent", null, 0, 1, RestrictionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionType_Group(), this.getGroupRef(), null, "group", null, 0, 1, RestrictionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionType_All(), this.getAll(), null, "all", null, 0, 1, RestrictionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionType_Choice(), this.getExplicitGroup(), null, "choice", null, 0, 1, RestrictionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionType_Sequence(), this.getExplicitGroup(), null, "sequence", null, 0, 1, RestrictionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionType_SimpleType(), this.getLocalSimpleType(), null, "simpleType", null, 0, 1, RestrictionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRestrictionType_Group1(), ecorePackage.getEFeatureMapEntry(), "group1", null, 0, -1, RestrictionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRestrictionType_FacetGroup(), ecorePackage.getEFeatureMapEntry(), "facetGroup", null, 0, -1, RestrictionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionType_Facet(), ecorePackage.getEObject(), null, "facet", null, 0, -1, RestrictionType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getRestrictionType_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, RestrictionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getRestrictionType_Group2(), ecorePackage.getEFeatureMapEntry(), "group2", null, 0, -1, RestrictionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionType_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, RestrictionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionType_AttributeGroup(), this.getAttributeGroupRef(), null, "attributeGroup", null, 0, -1, RestrictionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionType_AnyAttribute1(), this.getAnyAttributeType(), null, "anyAttribute1", null, 0, 1, RestrictionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionType_Assert(), this.getAssertion(), null, "assert", null, 0, -1, RestrictionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRestrictionType_Base(), theXMLTypePackage.getQName(), "base", null, 1, 1, RestrictionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(restrictionType1EClass, RestrictionType1.class, "RestrictionType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRestrictionType1_SimpleType(), this.getLocalSimpleType(), null, "simpleType", null, 0, 1, RestrictionType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRestrictionType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RestrictionType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRestrictionType1_FacetGroup(), ecorePackage.getEFeatureMapEntry(), "facetGroup", null, 0, -1, RestrictionType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getRestrictionType1_Facet(), ecorePackage.getEObject(), null, "facet", null, 0, -1, RestrictionType1.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getRestrictionType1_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, RestrictionType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getRestrictionType1_Base(), theXMLTypePackage.getQName(), "base", null, 0, 1, RestrictionType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(schemaTypeEClass, SchemaType.class, "SchemaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSchemaType_Composition(), ecorePackage.getEFeatureMapEntry(), "composition", null, 0, -1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSchemaType_Include(), this.getIncludeType(), null, "include", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getSchemaType_Import(), this.getImportType(), null, "import", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getSchemaType_Redefine(), this.getRedefineType(), null, "redefine", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getSchemaType_Override(), this.getOverrideType(), null, "override", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getSchemaType_Annotation(), this.getAnnotationType(), null, "annotation", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getSchemaType_DefaultOpenContent(), this.getDefaultOpenContentType(), null, "defaultOpenContent", null, 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSchemaType_Annotation1(), this.getAnnotationType(), null, "annotation1", null, 0, -1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchemaType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSchemaType_SimpleType(), this.getTopLevelSimpleType(), null, "simpleType", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getSchemaType_ComplexType(), this.getTopLevelComplexType(), null, "complexType", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getSchemaType_Group1(), this.getNamedGroup(), null, "group1", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getSchemaType_AttributeGroup(), this.getNamedAttributeGroup(), null, "attributeGroup", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getSchemaType_Element(), this.getTopLevelElement(), null, "element", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getSchemaType_Attribute(), this.getTopLevelAttribute(), null, "attribute", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getSchemaType_Notation(), this.getNotationType(), null, "notation", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getSchemaType_Annotation2(), this.getAnnotationType(), null, "annotation2", null, 0, -1, SchemaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchemaType_TargetNamespace(), theXMLTypePackage.getAnyURI(), "targetNamespace", null, 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchemaType_Version(), theXMLTypePackage.getToken(), "version", null, 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchemaType_FinalDefault(), this.getFullDerivationSet(), "finalDefault", "", 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchemaType_BlockDefault(), this.getBlockSet(), "blockDefault", "", 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchemaType_AttributeFormDefault(), this.getFormChoice(), "attributeFormDefault", "unqualified", 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchemaType_ElementFormDefault(), this.getFormChoice(), "elementFormDefault", "unqualified", 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchemaType_DefaultAttributes(), theXMLTypePackage.getQName(), "defaultAttributes", null, 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchemaType_XpathDefaultNamespace(), this.getXpathDefaultNamespace(), "xpathDefaultNamespace", "##local", 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchemaType_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSchemaType_Lang(), theXMLNamespacePackage.getLangType(), "lang", null, 0, 1, SchemaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(selectorTypeEClass, SelectorType.class, "SelectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSelectorType_Xpath(), this.getXpathType1(), "xpath", null, 1, 1, SelectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSelectorType_XpathDefaultNamespace(), this.getXpathDefaultNamespace(), "xpathDefaultNamespace", null, 0, 1, SelectorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(simpleContentTypeEClass, SimpleContentType.class, "SimpleContentType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSimpleContentType_Restriction(), this.getSimpleRestrictionType(), null, "restriction", null, 0, 1, SimpleContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSimpleContentType_Extension(), this.getSimpleExtensionType(), null, "extension", null, 0, 1, SimpleContentType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(simpleExplicitGroupEClass, SimpleExplicitGroup.class, "SimpleExplicitGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(simpleExtensionTypeEClass, SimpleExtensionType.class, "SimpleExtensionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(simpleRestrictionTypeEClass, SimpleRestrictionType.class, "SimpleRestrictionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(simpleTypeEClass, SimpleType.class, "SimpleType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSimpleType_Restriction(), this.getRestrictionType1(), null, "restriction", null, 0, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSimpleType_List(), this.getListType(), null, "list", null, 0, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSimpleType_Union(), this.getUnionType(), null, "union", null, 0, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSimpleType_Final(), this.getSimpleDerivationSet(), "final", null, 0, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getSimpleType_Name(), theXMLTypePackage.getNCName(), "name", null, 0, 1, SimpleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(topLevelAttributeEClass, TopLevelAttribute.class, "TopLevelAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(topLevelComplexTypeEClass, TopLevelComplexType.class, "TopLevelComplexType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(topLevelElementEClass, TopLevelElement.class, "TopLevelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(topLevelSimpleTypeEClass, TopLevelSimpleType.class, "TopLevelSimpleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(totalDigitsTypeEClass, TotalDigitsType.class, "TotalDigitsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(unionTypeEClass, UnionType.class, "UnionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getUnionType_SimpleType(), this.getLocalSimpleType(), null, "simpleType", null, 0, -1, UnionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getUnionType_MemberTypes(), this.getMemberTypesType(), "memberTypes", null, 0, 1, UnionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(whiteSpaceTypeEClass, WhiteSpaceType.class, "WhiteSpaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(wildcardEClass, Wildcard.class, "Wildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getWildcard_Namespace(), this.getNamespaceList(), "namespace", null, 0, 1, Wildcard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getWildcard_NotNamespace(), this.getNotNamespaceType(), "notNamespace", null, 0, 1, Wildcard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getWildcard_ProcessContents(), this.getProcessContentsType(), "processContents", "strict", 0, 1, Wildcard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(allNNIMember1EEnum, AllNNIMember1.class, "AllNNIMember1");
        addEEnumLiteral(allNNIMember1EEnum, AllNNIMember1.UNBOUNDED);

        initEEnum(basicNamespaceListItemMember1EEnum, BasicNamespaceListItemMember1.class, "BasicNamespaceListItemMember1");
        addEEnumLiteral(basicNamespaceListItemMember1EEnum, BasicNamespaceListItemMember1.TARGET_NAMESPACE);
        addEEnumLiteral(basicNamespaceListItemMember1EEnum, BasicNamespaceListItemMember1.LOCAL);

        initEEnum(blockSetMember0EEnum, BlockSetMember0.class, "BlockSetMember0");
        addEEnumLiteral(blockSetMember0EEnum, BlockSetMember0.ALL);

        initEEnum(blockSetMember1ItemEEnum, BlockSetMember1Item.class, "BlockSetMember1Item");
        addEEnumLiteral(blockSetMember1ItemEEnum, BlockSetMember1Item.EXTENSION);
        addEEnumLiteral(blockSetMember1ItemEEnum, BlockSetMember1Item.RESTRICTION);
        addEEnumLiteral(blockSetMember1ItemEEnum, BlockSetMember1Item.SUBSTITUTION);

        initEEnum(derivationControlEEnum, DerivationControl.class, "DerivationControl");
        addEEnumLiteral(derivationControlEEnum, DerivationControl.SUBSTITUTION);
        addEEnumLiteral(derivationControlEEnum, DerivationControl.EXTENSION);
        addEEnumLiteral(derivationControlEEnum, DerivationControl.RESTRICTION);
        addEEnumLiteral(derivationControlEEnum, DerivationControl.LIST);
        addEEnumLiteral(derivationControlEEnum, DerivationControl.UNION);

        initEEnum(derivationSetMember0EEnum, DerivationSetMember0.class, "DerivationSetMember0");
        addEEnumLiteral(derivationSetMember0EEnum, DerivationSetMember0.ALL);

        initEEnum(formChoiceEEnum, FormChoice.class, "FormChoice");
        addEEnumLiteral(formChoiceEEnum, FormChoice.QUALIFIED);
        addEEnumLiteral(formChoiceEEnum, FormChoice.UNQUALIFIED);

        initEEnum(fullDerivationSetMember0EEnum, FullDerivationSetMember0.class, "FullDerivationSetMember0");
        addEEnumLiteral(fullDerivationSetMember0EEnum, FullDerivationSetMember0.ALL);

        initEEnum(modeTypeEEnum, ModeType.class, "ModeType");
        addEEnumLiteral(modeTypeEEnum, ModeType.INTERLEAVE);
        addEEnumLiteral(modeTypeEEnum, ModeType.SUFFIX);

        initEEnum(modeType1EEnum, ModeType1.class, "ModeType1");
        addEEnumLiteral(modeType1EEnum, ModeType1.NONE);
        addEEnumLiteral(modeType1EEnum, ModeType1.INTERLEAVE);
        addEEnumLiteral(modeType1EEnum, ModeType1.SUFFIX);

        initEEnum(processContentsTypeEEnum, ProcessContentsType.class, "ProcessContentsType");
        addEEnumLiteral(processContentsTypeEEnum, ProcessContentsType.SKIP);
        addEEnumLiteral(processContentsTypeEEnum, ProcessContentsType.LAX);
        addEEnumLiteral(processContentsTypeEEnum, ProcessContentsType.STRICT);

        initEEnum(qnameListAItemMember1EEnum, QnameListAItemMember1.class, "QnameListAItemMember1");
        addEEnumLiteral(qnameListAItemMember1EEnum, QnameListAItemMember1.DEFINED);

        initEEnum(qnameListItemMember1EEnum, QnameListItemMember1.class, "QnameListItemMember1");
        addEEnumLiteral(qnameListItemMember1EEnum, QnameListItemMember1.DEFINED);
        addEEnumLiteral(qnameListItemMember1EEnum, QnameListItemMember1.DEFINED_SIBLING);

        initEEnum(reducedDerivationControlEEnum, ReducedDerivationControl.class, "ReducedDerivationControl");
        addEEnumLiteral(reducedDerivationControlEEnum, ReducedDerivationControl.EXTENSION);
        addEEnumLiteral(reducedDerivationControlEEnum, ReducedDerivationControl.RESTRICTION);

        initEEnum(simpleDerivationSetMember0EEnum, SimpleDerivationSetMember0.class, "SimpleDerivationSetMember0");
        addEEnumLiteral(simpleDerivationSetMember0EEnum, SimpleDerivationSetMember0.ALL);

        initEEnum(simpleDerivationSetMember1ItemEEnum, SimpleDerivationSetMember1Item.class, "SimpleDerivationSetMember1Item");
        addEEnumLiteral(simpleDerivationSetMember1ItemEEnum, SimpleDerivationSetMember1Item.LIST);
        addEEnumLiteral(simpleDerivationSetMember1ItemEEnum, SimpleDerivationSetMember1Item.UNION);
        addEEnumLiteral(simpleDerivationSetMember1ItemEEnum, SimpleDerivationSetMember1Item.RESTRICTION);
        addEEnumLiteral(simpleDerivationSetMember1ItemEEnum, SimpleDerivationSetMember1Item.EXTENSION);

        initEEnum(specialNamespaceListEEnum, SpecialNamespaceList.class, "SpecialNamespaceList");
        addEEnumLiteral(specialNamespaceListEEnum, SpecialNamespaceList.ANY);
        addEEnumLiteral(specialNamespaceListEEnum, SpecialNamespaceList.OTHER);

        initEEnum(typeDerivationControlEEnum, TypeDerivationControl.class, "TypeDerivationControl");
        addEEnumLiteral(typeDerivationControlEEnum, TypeDerivationControl.EXTENSION);
        addEEnumLiteral(typeDerivationControlEEnum, TypeDerivationControl.RESTRICTION);
        addEEnumLiteral(typeDerivationControlEEnum, TypeDerivationControl.LIST);
        addEEnumLiteral(typeDerivationControlEEnum, TypeDerivationControl.UNION);

        initEEnum(useTypeEEnum, UseType.class, "UseType");
        addEEnumLiteral(useTypeEEnum, UseType.PROHIBITED);
        addEEnumLiteral(useTypeEEnum, UseType.OPTIONAL);
        addEEnumLiteral(useTypeEEnum, UseType.REQUIRED);

        initEEnum(xpathDefaultNamespaceMember1EEnum, XpathDefaultNamespaceMember1.class, "XpathDefaultNamespaceMember1");
        addEEnumLiteral(xpathDefaultNamespaceMember1EEnum, XpathDefaultNamespaceMember1.DEFAULT_NAMESPACE);
        addEEnumLiteral(xpathDefaultNamespaceMember1EEnum, XpathDefaultNamespaceMember1.TARGET_NAMESPACE);
        addEEnumLiteral(xpathDefaultNamespaceMember1EEnum, XpathDefaultNamespaceMember1.LOCAL);

        // Initialize data types
        initEDataType(allNNIEDataType, Object.class, "AllNNI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(allNNIMember1ObjectEDataType, AllNNIMember1.class, "AllNNIMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(basicNamespaceListEDataType, List.class, "BasicNamespaceList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(basicNamespaceListItemEDataType, Object.class, "BasicNamespaceListItem", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(basicNamespaceListItemMember1ObjectEDataType, BasicNamespaceListItemMember1.class, "BasicNamespaceListItemMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(blockSetEDataType, Object.class, "BlockSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(blockSetMember0ObjectEDataType, BlockSetMember0.class, "BlockSetMember0Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(blockSetMember1EDataType, List.class, "BlockSetMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(blockSetMember1ItemObjectEDataType, BlockSetMember1Item.class, "BlockSetMember1ItemObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(derivationControlObjectEDataType, DerivationControl.class, "DerivationControlObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(derivationSetEDataType, Object.class, "DerivationSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(derivationSetMember0ObjectEDataType, DerivationSetMember0.class, "DerivationSetMember0Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(derivationSetMember1EDataType, List.class, "DerivationSetMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(formChoiceObjectEDataType, FormChoice.class, "FormChoiceObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(fullDerivationSetEDataType, Object.class, "FullDerivationSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(fullDerivationSetMember0ObjectEDataType, FullDerivationSetMember0.class, "FullDerivationSetMember0Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(fullDerivationSetMember1EDataType, List.class, "FullDerivationSetMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(memberTypesTypeEDataType, List.class, "MemberTypesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(modeTypeObjectEDataType, ModeType.class, "ModeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(modeTypeObject1EDataType, ModeType1.class, "ModeTypeObject1", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(namespaceListEDataType, Object.class, "NamespaceList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(notNamespaceTypeEDataType, List.class, "NotNamespaceType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(processContentsTypeObjectEDataType, ProcessContentsType.class, "ProcessContentsTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(publicEDataType, String.class, "Public", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(qnameListEDataType, List.class, "QnameList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(qnameListAEDataType, List.class, "QnameListA", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(qnameListAItemEDataType, Object.class, "QnameListAItem", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(qnameListAItemMember1ObjectEDataType, QnameListAItemMember1.class, "QnameListAItemMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(qnameListItemEDataType, Object.class, "QnameListItem", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(qnameListItemMember1ObjectEDataType, QnameListItemMember1.class, "QnameListItemMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(reducedDerivationControlObjectEDataType, ReducedDerivationControl.class, "ReducedDerivationControlObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(simpleDerivationSetEDataType, Object.class, "SimpleDerivationSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(simpleDerivationSetMember0ObjectEDataType, SimpleDerivationSetMember0.class, "SimpleDerivationSetMember0Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(simpleDerivationSetMember1EDataType, List.class, "SimpleDerivationSetMember1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(simpleDerivationSetMember1ItemObjectEDataType, SimpleDerivationSetMember1Item.class, "SimpleDerivationSetMember1ItemObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(specialNamespaceListObjectEDataType, SpecialNamespaceList.class, "SpecialNamespaceListObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(substitutionGroupTypeEDataType, List.class, "SubstitutionGroupType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(typeDerivationControlObjectEDataType, TypeDerivationControl.class, "TypeDerivationControlObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(useTypeObjectEDataType, UseType.class, "UseTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(xpathDefaultNamespaceEDataType, Object.class, "XpathDefaultNamespace", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(xpathDefaultNamespaceMember1ObjectEDataType, XpathDefaultNamespaceMember1.class, "XpathDefaultNamespaceMember1Object", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
        initEDataType(xpathTypeEDataType, String.class, "XpathType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(xpathType1EDataType, String.class, "XpathType1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.w3.org/XML/1998/namespace
        createNamespaceAnnotations();
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.w3.org/XML/1998/namespace</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createNamespaceAnnotations() {
        String source = "http://www.w3.org/XML/1998/namespace";	
        addAnnotation
          (this, 
           source, 
           new String[] {
             "lang", "EN"
           });
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createExtendedMetaDataAnnotations() {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
        addAnnotation
          (allEClass, 
           source, 
           new String[] {
             "name", "all",
             "kind", "elementOnly"
           });	
        addAnnotation
          (allNNIEDataType, 
           source, 
           new String[] {
             "name", "allNNI",
             "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger allNNI_._member_._1"
           });	
        addAnnotation
          (allNNIMember1EEnum, 
           source, 
           new String[] {
             "name", "allNNI_._member_._1"
           });	
        addAnnotation
          (allNNIMember1ObjectEDataType, 
           source, 
           new String[] {
             "name", "allNNI_._member_._1:Object",
             "baseType", "allNNI_._member_._1"
           });	
        addAnnotation
          (altTypeEClass, 
           source, 
           new String[] {
             "name", "altType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getAltType_SimpleType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "simpleType",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getAltType_ComplexType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "complexType",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getAltType_Test(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "test"
           });	
        addAnnotation
          (getAltType_Type(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "type"
           });	
        addAnnotation
          (getAltType_XpathDefaultNamespace(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xpathDefaultNamespace"
           });	
        addAnnotation
          (annotatedEClass, 
           source, 
           new String[] {
             "name", "annotated",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getAnnotated_Annotation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "annotation",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getAnnotated_Id(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "id"
           });	
        addAnnotation
          (annotationTypeEClass, 
           source, 
           new String[] {
             "name", "annotation_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getAnnotationType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:1"
           });	
        addAnnotation
          (getAnnotationType_Appinfo(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "appinfo",
             "namespace", "##targetNamespace",
             "group", "#group:1"
           });	
        addAnnotation
          (getAnnotationType_Documentation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "documentation",
             "namespace", "##targetNamespace",
             "group", "#group:1"
           });	
        addAnnotation
          (getAnnotationType_Id(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "id"
           });	
        addAnnotation
          (anyAttributeTypeEClass, 
           source, 
           new String[] {
             "name", "anyAttribute_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getAnyAttributeType_NotQName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "notQName"
           });	
        addAnnotation
          (anyTypeEClass, 
           source, 
           new String[] {
             "name", "any_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getAnyType_MaxOccurs(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "maxOccurs"
           });	
        addAnnotation
          (getAnyType_MinOccurs(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "minOccurs"
           });	
        addAnnotation
          (getAnyType_NotQName(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "notQName"
           });	
        addAnnotation
          (appinfoTypeEClass, 
           source, 
           new String[] {
             "name", "appinfo_._type",
             "kind", "mixed"
           });	
        addAnnotation
          (getAppinfoType_Mixed(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "name", ":mixed"
           });	
        addAnnotation
          (getAppinfoType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:1"
           });	
        addAnnotation
          (getAppinfoType_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##any",
             "name", ":2",
             "processing", "lax",
             "group", "#group:1"
           });	
        addAnnotation
          (getAppinfoType_Source(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "source"
           });	
        addAnnotation
          (getAppinfoType_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":4",
             "processing", "lax"
           });	
        addAnnotation
          (assertionEClass, 
           source, 
           new String[] {
             "name", "assertion",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getAssertion_Test(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "test"
           });	
        addAnnotation
          (getAssertion_XpathDefaultNamespace(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xpathDefaultNamespace"
           });	
        addAnnotation
          (attributeEClass, 
           source, 
           new String[] {
             "name", "attribute",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getAttribute_SimpleType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "simpleType",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getAttribute_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });	
        addAnnotation
          (getAttribute_Ref(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "ref"
           });	
        addAnnotation
          (getAttribute_Type(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "type"
           });	
        addAnnotation
          (getAttribute_Use(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "use"
           });	
        addAnnotation
          (getAttribute_Default(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "default"
           });	
        addAnnotation
          (getAttribute_Fixed(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "fixed"
           });	
        addAnnotation
          (getAttribute_Form(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "form"
           });	
        addAnnotation
          (getAttribute_TargetNamespace(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "targetNamespace"
           });	
        addAnnotation
          (getAttribute_Inheritable(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "inheritable"
           });	
        addAnnotation
          (attributeGroupEClass, 
           source, 
           new String[] {
             "name", "attributeGroup",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getAttributeGroup_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:3"
           });	
        addAnnotation
          (getAttributeGroup_Attribute(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "attribute",
             "namespace", "##targetNamespace",
             "group", "#group:3"
           });	
        addAnnotation
          (getAttributeGroup_AttributeGroup(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "attributeGroup",
             "namespace", "##targetNamespace",
             "group", "#group:3"
           });	
        addAnnotation
          (getAttributeGroup_AnyAttribute1(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "anyAttribute",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getAttributeGroup_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });	
        addAnnotation
          (getAttributeGroup_Ref(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "ref"
           });	
        addAnnotation
          (attributeGroupRefEClass, 
           source, 
           new String[] {
             "name", "attributeGroupRef",
             "kind", "elementOnly"
           });	
        addAnnotation
          (basicNamespaceListEDataType, 
           source, 
           new String[] {
             "name", "basicNamespaceList",
             "itemType", "basicNamespaceList_._item"
           });	
        addAnnotation
          (basicNamespaceListItemEDataType, 
           source, 
           new String[] {
             "name", "basicNamespaceList_._item",
             "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#anyURI basicNamespaceList_._item_._member_._1"
           });	
        addAnnotation
          (basicNamespaceListItemMember1EEnum, 
           source, 
           new String[] {
             "name", "basicNamespaceList_._item_._member_._1"
           });	
        addAnnotation
          (basicNamespaceListItemMember1ObjectEDataType, 
           source, 
           new String[] {
             "name", "basicNamespaceList_._item_._member_._1:Object",
             "baseType", "basicNamespaceList_._item_._member_._1"
           });	
        addAnnotation
          (blockSetEDataType, 
           source, 
           new String[] {
             "name", "blockSet",
             "memberTypes", "blockSet_._member_._0 blockSet_._member_._1"
           });	
        addAnnotation
          (blockSetMember0EEnum, 
           source, 
           new String[] {
             "name", "blockSet_._member_._0"
           });	
        addAnnotation
          (blockSetMember0ObjectEDataType, 
           source, 
           new String[] {
             "name", "blockSet_._member_._0:Object",
             "baseType", "blockSet_._member_._0"
           });	
        addAnnotation
          (blockSetMember1EDataType, 
           source, 
           new String[] {
             "name", "blockSet_._member_._1",
             "itemType", "blockSet_._member_._1_._item"
           });	
        addAnnotation
          (blockSetMember1ItemEEnum, 
           source, 
           new String[] {
             "name", "blockSet_._member_._1_._item"
           });	
        addAnnotation
          (blockSetMember1ItemObjectEDataType, 
           source, 
           new String[] {
             "name", "blockSet_._member_._1_._item:Object",
             "baseType", "blockSet_._member_._1_._item"
           });	
        addAnnotation
          (complexContentTypeEClass, 
           source, 
           new String[] {
             "name", "complexContent_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getComplexContentType_Restriction(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "restriction",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getComplexContentType_Extension(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "extension",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getComplexContentType_Mixed(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "mixed"
           });	
        addAnnotation
          (complexRestrictionTypeEClass, 
           source, 
           new String[] {
             "name", "complexRestrictionType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (complexTypeEClass, 
           source, 
           new String[] {
             "name", "complexType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getComplexType_SimpleContent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "simpleContent",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getComplexType_ComplexContent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "complexContent",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getComplexType_OpenContent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "openContent",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getComplexType_Group(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "group",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getComplexType_All(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "all",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getComplexType_Choice(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "choice",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getComplexType_Sequence(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sequence",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getComplexType_Group1(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:10"
           });	
        addAnnotation
          (getComplexType_Attribute(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "attribute",
             "namespace", "##targetNamespace",
             "group", "#group:10"
           });	
        addAnnotation
          (getComplexType_AttributeGroup(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "attributeGroup",
             "namespace", "##targetNamespace",
             "group", "#group:10"
           });	
        addAnnotation
          (getComplexType_AnyAttribute1(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "anyAttribute",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getComplexType_Assert(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "assert",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getComplexType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });	
        addAnnotation
          (getComplexType_Mixed(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "mixed"
           });	
        addAnnotation
          (getComplexType_Abstract(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "abstract"
           });	
        addAnnotation
          (getComplexType_Final(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "final"
           });	
        addAnnotation
          (getComplexType_Block(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "block"
           });	
        addAnnotation
          (getComplexType_DefaultAttributesApply(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "defaultAttributesApply"
           });	
        addAnnotation
          (defaultOpenContentTypeEClass, 
           source, 
           new String[] {
             "name", "defaultOpenContent_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getDefaultOpenContentType_Any(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "any",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDefaultOpenContentType_AppliesToEmpty(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "appliesToEmpty"
           });	
        addAnnotation
          (getDefaultOpenContentType_Mode(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "mode"
           });	
        addAnnotation
          (derivationControlEEnum, 
           source, 
           new String[] {
             "name", "derivationControl"
           });	
        addAnnotation
          (derivationControlObjectEDataType, 
           source, 
           new String[] {
             "name", "derivationControl:Object",
             "baseType", "derivationControl"
           });	
        addAnnotation
          (derivationSetEDataType, 
           source, 
           new String[] {
             "name", "derivationSet",
             "memberTypes", "derivationSet_._member_._0 derivationSet_._member_._1"
           });	
        addAnnotation
          (derivationSetMember0EEnum, 
           source, 
           new String[] {
             "name", "derivationSet_._member_._0"
           });	
        addAnnotation
          (derivationSetMember0ObjectEDataType, 
           source, 
           new String[] {
             "name", "derivationSet_._member_._0:Object",
             "baseType", "derivationSet_._member_._0"
           });	
        addAnnotation
          (derivationSetMember1EDataType, 
           source, 
           new String[] {
             "name", "derivationSet_._member_._1",
             "itemType", "reducedDerivationControl"
           });	
        addAnnotation
          (documentationTypeEClass, 
           source, 
           new String[] {
             "name", "documentation_._type",
             "kind", "mixed"
           });	
        addAnnotation
          (getDocumentationType_Mixed(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "name", ":mixed"
           });	
        addAnnotation
          (getDocumentationType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:1"
           });	
        addAnnotation
          (getDocumentationType_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##any",
             "name", ":2",
             "processing", "lax",
             "group", "#group:1"
           });	
        addAnnotation
          (getDocumentationType_Source(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "source"
           });	
        addAnnotation
          (getDocumentationType_Lang(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "lang",
             "namespace", "http://www.w3.org/XML/1998/namespace"
           });	
        addAnnotation
          (getDocumentationType_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":5",
             "processing", "lax"
           });	
        addAnnotation
          (documentRootEClass, 
           source, 
           new String[] {
             "name", "",
             "kind", "mixed"
           });	
        addAnnotation
          (getDocumentRoot_Mixed(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "name", ":mixed"
           });	
        addAnnotation
          (getDocumentRoot_XMLNSPrefixMap(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xmlns:prefix"
           });	
        addAnnotation
          (getDocumentRoot_XSISchemaLocation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xsi:schemaLocation"
           });	
        addAnnotation
          (getDocumentRoot_All(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "all",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Annotation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "annotation",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Any(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "any",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "anyAttribute",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Appinfo(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "appinfo",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Assertion(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "assertion",
             "namespace", "##targetNamespace",
             "affiliation", "facet"
           });	
        addAnnotation
          (getDocumentRoot_Facet(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "facet",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Attribute(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "attribute",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_AttributeGroup(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "attributeGroup",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Choice(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "choice",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_ComplexContent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "complexContent",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_ComplexType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "complexType",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_DefaultOpenContent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "defaultOpenContent",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Documentation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "documentation",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Element(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "element",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Enumeration(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "enumeration",
             "namespace", "##targetNamespace",
             "affiliation", "facet"
           });	
        addAnnotation
          (getDocumentRoot_ExplicitTimezone(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "explicitTimezone",
             "namespace", "##targetNamespace",
             "affiliation", "facet"
           });	
        addAnnotation
          (getDocumentRoot_Field(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "field",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_FractionDigits(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "fractionDigits",
             "namespace", "##targetNamespace",
             "affiliation", "facet"
           });	
        addAnnotation
          (getDocumentRoot_Group(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "group",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Import(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "import",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Include(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "include",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Keyref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "keyref",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Length(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "length",
             "namespace", "##targetNamespace",
             "affiliation", "facet"
           });	
        addAnnotation
          (getDocumentRoot_List(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "list",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_MaxExclusive(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maxExclusive",
             "namespace", "##targetNamespace",
             "affiliation", "facet"
           });	
        addAnnotation
          (getDocumentRoot_MaxInclusive(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maxInclusive",
             "namespace", "##targetNamespace",
             "affiliation", "facet"
           });	
        addAnnotation
          (getDocumentRoot_MaxLength(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "maxLength",
             "namespace", "##targetNamespace",
             "affiliation", "facet"
           });	
        addAnnotation
          (getDocumentRoot_MinExclusive(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "minExclusive",
             "namespace", "##targetNamespace",
             "affiliation", "facet"
           });	
        addAnnotation
          (getDocumentRoot_MinInclusive(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "minInclusive",
             "namespace", "##targetNamespace",
             "affiliation", "facet"
           });	
        addAnnotation
          (getDocumentRoot_MinLength(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "minLength",
             "namespace", "##targetNamespace",
             "affiliation", "facet"
           });	
        addAnnotation
          (getDocumentRoot_Notation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "notation",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_OpenContent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "openContent",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Override(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "override",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Pattern(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "pattern",
             "namespace", "##targetNamespace",
             "affiliation", "facet"
           });	
        addAnnotation
          (getDocumentRoot_Redefine(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "redefine",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Restriction(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "restriction",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Schema(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "schema",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Selector(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "selector",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Sequence(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sequence",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_SimpleContent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "simpleContent",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_SimpleType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "simpleType",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_TotalDigits(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "totalDigits",
             "namespace", "##targetNamespace",
             "affiliation", "facet"
           });	
        addAnnotation
          (getDocumentRoot_Union(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "union",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_Unique(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "unique",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getDocumentRoot_WhiteSpace(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "whiteSpace",
             "namespace", "##targetNamespace",
             "affiliation", "facet"
           });	
        addAnnotation
          (elementEClass, 
           source, 
           new String[] {
             "name", "element",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getElement_SimpleType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "simpleType",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getElement_ComplexType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "complexType",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getElement_Alternative(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "alternative",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getElement_IdentityConstraint(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "IdentityConstraint:6"
           });	
        addAnnotation
          (getElement_Unique(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "unique",
             "namespace", "##targetNamespace",
             "group", "#IdentityConstraint:6"
           });	
        addAnnotation
          (getElement_Key(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "key",
             "namespace", "##targetNamespace",
             "group", "#IdentityConstraint:6"
           });	
        addAnnotation
          (getElement_Keyref(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "keyref",
             "namespace", "##targetNamespace",
             "group", "#IdentityConstraint:6"
           });	
        addAnnotation
          (getElement_MaxOccurs(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "maxOccurs"
           });	
        addAnnotation
          (getElement_MinOccurs(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "minOccurs"
           });	
        addAnnotation
          (getElement_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });	
        addAnnotation
          (getElement_Ref(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "ref"
           });	
        addAnnotation
          (getElement_Type(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "type"
           });	
        addAnnotation
          (getElement_SubstitutionGroup(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "substitutionGroup"
           });	
        addAnnotation
          (getElement_Default(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "default"
           });	
        addAnnotation
          (getElement_Fixed(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "fixed"
           });	
        addAnnotation
          (getElement_Nillable(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "nillable"
           });	
        addAnnotation
          (getElement_Abstract(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "abstract"
           });	
        addAnnotation
          (getElement_Final(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "final"
           });	
        addAnnotation
          (getElement_Block(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "block"
           });	
        addAnnotation
          (getElement_Form(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "form"
           });	
        addAnnotation
          (getElement_TargetNamespace(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "targetNamespace"
           });	
        addAnnotation
          (explicitGroupEClass, 
           source, 
           new String[] {
             "name", "explicitGroup",
             "kind", "elementOnly"
           });	
        addAnnotation
          (explicitTimezoneTypeEClass, 
           source, 
           new String[] {
             "name", "explicitTimezone_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (extensionTypeEClass, 
           source, 
           new String[] {
             "name", "extensionType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getExtensionType_OpenContent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "openContent",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getExtensionType_Group(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "group",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getExtensionType_All(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "all",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getExtensionType_Choice(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "choice",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getExtensionType_Sequence(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sequence",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getExtensionType_Group1(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:8"
           });	
        addAnnotation
          (getExtensionType_Attribute(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "attribute",
             "namespace", "##targetNamespace",
             "group", "#group:8"
           });	
        addAnnotation
          (getExtensionType_AttributeGroup(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "attributeGroup",
             "namespace", "##targetNamespace",
             "group", "#group:8"
           });	
        addAnnotation
          (getExtensionType_AnyAttribute1(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "anyAttribute",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getExtensionType_Assert(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "assert",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getExtensionType_Base(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "base"
           });	
        addAnnotation
          (facetEClass, 
           source, 
           new String[] {
             "name", "facet",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getFacet_Value(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "value"
           });	
        addAnnotation
          (getFacet_Fixed(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "fixed"
           });	
        addAnnotation
          (fieldTypeEClass, 
           source, 
           new String[] {
             "name", "field_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getFieldType_Xpath(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xpath"
           });	
        addAnnotation
          (getFieldType_XpathDefaultNamespace(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xpathDefaultNamespace"
           });	
        addAnnotation
          (formChoiceEEnum, 
           source, 
           new String[] {
             "name", "formChoice"
           });	
        addAnnotation
          (formChoiceObjectEDataType, 
           source, 
           new String[] {
             "name", "formChoice:Object",
             "baseType", "formChoice"
           });	
        addAnnotation
          (fullDerivationSetEDataType, 
           source, 
           new String[] {
             "name", "fullDerivationSet",
             "memberTypes", "fullDerivationSet_._member_._0 fullDerivationSet_._member_._1"
           });	
        addAnnotation
          (fullDerivationSetMember0EEnum, 
           source, 
           new String[] {
             "name", "fullDerivationSet_._member_._0"
           });	
        addAnnotation
          (fullDerivationSetMember0ObjectEDataType, 
           source, 
           new String[] {
             "name", "fullDerivationSet_._member_._0:Object",
             "baseType", "fullDerivationSet_._member_._0"
           });	
        addAnnotation
          (fullDerivationSetMember1EDataType, 
           source, 
           new String[] {
             "name", "fullDerivationSet_._member_._1",
             "itemType", "typeDerivationControl"
           });	
        addAnnotation
          (groupEClass, 
           source, 
           new String[] {
             "name", "group",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getGroup_Particle(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "Particle:3"
           });	
        addAnnotation
          (getGroup_Element(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "element",
             "namespace", "##targetNamespace",
             "group", "#Particle:3"
           });	
        addAnnotation
          (getGroup_Group(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "group",
             "namespace", "##targetNamespace",
             "group", "#Particle:3"
           });	
        addAnnotation
          (getGroup_All(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "all",
             "namespace", "##targetNamespace",
             "group", "#Particle:3"
           });	
        addAnnotation
          (getGroup_Choice(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "choice",
             "namespace", "##targetNamespace",
             "group", "#Particle:3"
           });	
        addAnnotation
          (getGroup_Sequence(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sequence",
             "namespace", "##targetNamespace",
             "group", "#Particle:3"
           });	
        addAnnotation
          (getGroup_Any(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "any",
             "namespace", "##targetNamespace",
             "group", "#Particle:3"
           });	
        addAnnotation
          (getGroup_MaxOccurs(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "maxOccurs"
           });	
        addAnnotation
          (getGroup_MinOccurs(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "minOccurs"
           });	
        addAnnotation
          (getGroup_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });	
        addAnnotation
          (getGroup_Ref(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "ref"
           });	
        addAnnotation
          (groupRefEClass, 
           source, 
           new String[] {
             "name", "groupRef",
             "kind", "elementOnly"
           });	
        addAnnotation
          (importTypeEClass, 
           source, 
           new String[] {
             "name", "import_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getImportType_Namespace(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "namespace"
           });	
        addAnnotation
          (getImportType_SchemaLocation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "schemaLocation"
           });	
        addAnnotation
          (includeTypeEClass, 
           source, 
           new String[] {
             "name", "include_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getIncludeType_SchemaLocation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "schemaLocation"
           });	
        addAnnotation
          (intFacetEClass, 
           source, 
           new String[] {
             "name", "intFacet",
             "kind", "elementOnly"
           });	
        addAnnotation
          (keybaseEClass, 
           source, 
           new String[] {
             "name", "keybase",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getKeybase_Selector(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "selector",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getKeybase_Field(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "field",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getKeybase_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });	
        addAnnotation
          (getKeybase_Ref(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "ref"
           });	
        addAnnotation
          (keyrefTypeEClass, 
           source, 
           new String[] {
             "name", "keyref_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getKeyrefType_Refer(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "refer"
           });	
        addAnnotation
          (listTypeEClass, 
           source, 
           new String[] {
             "name", "list_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getListType_SimpleType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "simpleType",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getListType_ItemType(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "itemType"
           });	
        addAnnotation
          (localComplexTypeEClass, 
           source, 
           new String[] {
             "name", "localComplexType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (localElementEClass, 
           source, 
           new String[] {
             "name", "localElement",
             "kind", "elementOnly"
           });	
        addAnnotation
          (localSimpleTypeEClass, 
           source, 
           new String[] {
             "name", "localSimpleType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (memberTypesTypeEDataType, 
           source, 
           new String[] {
             "name", "memberTypes_._type",
             "itemType", "http://www.eclipse.org/emf/2003/XMLType#QName"
           });	
        addAnnotation
          (modeTypeEEnum, 
           source, 
           new String[] {
             "name", "mode_._1_._type"
           });	
        addAnnotation
          (modeType1EEnum, 
           source, 
           new String[] {
             "name", "mode_._type"
           });	
        addAnnotation
          (modeTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "mode_._1_._type:Object",
             "baseType", "mode_._1_._type"
           });	
        addAnnotation
          (modeTypeObject1EDataType, 
           source, 
           new String[] {
             "name", "mode_._type:Object",
             "baseType", "mode_._type"
           });	
        addAnnotation
          (namedAttributeGroupEClass, 
           source, 
           new String[] {
             "name", "namedAttributeGroup",
             "kind", "elementOnly"
           });	
        addAnnotation
          (namedGroupEClass, 
           source, 
           new String[] {
             "name", "namedGroup",
             "kind", "elementOnly"
           });	
        addAnnotation
          (namespaceListEDataType, 
           source, 
           new String[] {
             "name", "namespaceList",
             "memberTypes", "specialNamespaceList basicNamespaceList"
           });	
        addAnnotation
          (noFixedFacetEClass, 
           source, 
           new String[] {
             "name", "noFixedFacet",
             "kind", "elementOnly"
           });	
        addAnnotation
          (notationTypeEClass, 
           source, 
           new String[] {
             "name", "notation_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getNotationType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });	
        addAnnotation
          (getNotationType_Public(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "public"
           });	
        addAnnotation
          (getNotationType_System(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "system"
           });	
        addAnnotation
          (notNamespaceTypeEDataType, 
           source, 
           new String[] {
             "name", "notNamespace_._type",
             "baseType", "basicNamespaceList",
             "minLength", "1"
           });	
        addAnnotation
          (numFacetEClass, 
           source, 
           new String[] {
             "name", "numFacet",
             "kind", "elementOnly"
           });	
        addAnnotation
          (openAttrsEClass, 
           source, 
           new String[] {
             "name", "openAttrs",
             "kind", "empty"
           });	
        addAnnotation
          (getOpenAttrs_AnyAttribute(), 
           source, 
           new String[] {
             "kind", "attributeWildcard",
             "wildcards", "##other",
             "name", ":0",
             "processing", "lax"
           });	
        addAnnotation
          (openContentTypeEClass, 
           source, 
           new String[] {
             "name", "openContent_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getOpenContentType_Any(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "any",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getOpenContentType_Mode(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "mode"
           });	
        addAnnotation
          (overrideTypeEClass, 
           source, 
           new String[] {
             "name", "override_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getOverrideType_Annotation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "annotation",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getOverrideType_SchemaTop(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "SchemaTop:2"
           });	
        addAnnotation
          (getOverrideType_SimpleType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "simpleType",
             "namespace", "##targetNamespace",
             "group", "#SchemaTop:2"
           });	
        addAnnotation
          (getOverrideType_ComplexType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "complexType",
             "namespace", "##targetNamespace",
             "group", "#SchemaTop:2"
           });	
        addAnnotation
          (getOverrideType_Group(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "group",
             "namespace", "##targetNamespace",
             "group", "#SchemaTop:2"
           });	
        addAnnotation
          (getOverrideType_AttributeGroup(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "attributeGroup",
             "namespace", "##targetNamespace",
             "group", "#SchemaTop:2"
           });	
        addAnnotation
          (getOverrideType_Element(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "element",
             "namespace", "##targetNamespace",
             "group", "#SchemaTop:2"
           });	
        addAnnotation
          (getOverrideType_Attribute(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "attribute",
             "namespace", "##targetNamespace",
             "group", "#SchemaTop:2"
           });	
        addAnnotation
          (getOverrideType_Notation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "notation",
             "namespace", "##targetNamespace",
             "group", "#SchemaTop:2"
           });	
        addAnnotation
          (getOverrideType_SchemaLocation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "schemaLocation"
           });	
        addAnnotation
          (getOverrideType_Id(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "id"
           });	
        addAnnotation
          (patternTypeEClass, 
           source, 
           new String[] {
             "name", "pattern_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (processContentsTypeEEnum, 
           source, 
           new String[] {
             "name", "processContents_._type"
           });	
        addAnnotation
          (processContentsTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "processContents_._type:Object",
             "baseType", "processContents_._type"
           });	
        addAnnotation
          (publicEDataType, 
           source, 
           new String[] {
             "name", "public",
             "baseType", "http://www.eclipse.org/emf/2003/XMLType#token"
           });	
        addAnnotation
          (qnameListEDataType, 
           source, 
           new String[] {
             "name", "qnameList",
             "itemType", "qnameList_._item"
           });	
        addAnnotation
          (qnameListAEDataType, 
           source, 
           new String[] {
             "name", "qnameListA",
             "itemType", "qnameListA_._item"
           });	
        addAnnotation
          (qnameListAItemEDataType, 
           source, 
           new String[] {
             "name", "qnameListA_._item",
             "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#QName qnameListA_._item_._member_._1"
           });	
        addAnnotation
          (qnameListAItemMember1EEnum, 
           source, 
           new String[] {
             "name", "qnameListA_._item_._member_._1"
           });	
        addAnnotation
          (qnameListAItemMember1ObjectEDataType, 
           source, 
           new String[] {
             "name", "qnameListA_._item_._member_._1:Object",
             "baseType", "qnameListA_._item_._member_._1"
           });	
        addAnnotation
          (qnameListItemEDataType, 
           source, 
           new String[] {
             "name", "qnameList_._item",
             "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#QName qnameList_._item_._member_._1"
           });	
        addAnnotation
          (qnameListItemMember1EEnum, 
           source, 
           new String[] {
             "name", "qnameList_._item_._member_._1"
           });	
        addAnnotation
          (qnameListItemMember1ObjectEDataType, 
           source, 
           new String[] {
             "name", "qnameList_._item_._member_._1:Object",
             "baseType", "qnameList_._item_._member_._1"
           });	
        addAnnotation
          (realGroupEClass, 
           source, 
           new String[] {
             "name", "realGroup",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getRealGroup_All1(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "all",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getRealGroup_Choice1(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "choice",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getRealGroup_Sequence1(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sequence",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (redefineTypeEClass, 
           source, 
           new String[] {
             "name", "redefine_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getRedefineType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:1"
           });	
        addAnnotation
          (getRedefineType_Annotation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "annotation",
             "namespace", "##targetNamespace",
             "group", "#group:1"
           });	
        addAnnotation
          (getRedefineType_SimpleType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "simpleType",
             "namespace", "##targetNamespace",
             "group", "#group:1"
           });	
        addAnnotation
          (getRedefineType_ComplexType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "complexType",
             "namespace", "##targetNamespace",
             "group", "#group:1"
           });	
        addAnnotation
          (getRedefineType_Group1(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "group",
             "namespace", "##targetNamespace",
             "group", "#group:1"
           });	
        addAnnotation
          (getRedefineType_AttributeGroup(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "attributeGroup",
             "namespace", "##targetNamespace",
             "group", "#group:1"
           });	
        addAnnotation
          (getRedefineType_SchemaLocation(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "schemaLocation"
           });	
        addAnnotation
          (getRedefineType_Id(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "id"
           });	
        addAnnotation
          (reducedDerivationControlEEnum, 
           source, 
           new String[] {
             "name", "reducedDerivationControl"
           });	
        addAnnotation
          (reducedDerivationControlObjectEDataType, 
           source, 
           new String[] {
             "name", "reducedDerivationControl:Object",
             "baseType", "reducedDerivationControl"
           });	
        addAnnotation
          (restrictionTypeEClass, 
           source, 
           new String[] {
             "name", "restrictionType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getRestrictionType_OpenContent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "openContent",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getRestrictionType_Group(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "group",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getRestrictionType_All(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "all",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getRestrictionType_Choice(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "choice",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getRestrictionType_Sequence(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "sequence",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getRestrictionType_SimpleType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "simpleType",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getRestrictionType_Group1(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:9"
           });	
        addAnnotation
          (getRestrictionType_FacetGroup(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "facet:group",
             "namespace", "##targetNamespace",
             "group", "#group:9"
           });	
        addAnnotation
          (getRestrictionType_Facet(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "facet",
             "namespace", "##targetNamespace",
             "group", "facet:group"
           });	
        addAnnotation
          (getRestrictionType_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":12",
             "processing", "lax",
             "group", "#group:9"
           });	
        addAnnotation
          (getRestrictionType_Group2(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:13"
           });	
        addAnnotation
          (getRestrictionType_Attribute(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "attribute",
             "namespace", "##targetNamespace",
             "group", "#group:13"
           });	
        addAnnotation
          (getRestrictionType_AttributeGroup(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "attributeGroup",
             "namespace", "##targetNamespace",
             "group", "#group:13"
           });	
        addAnnotation
          (getRestrictionType_AnyAttribute1(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "anyAttribute",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getRestrictionType_Assert(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "assert",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getRestrictionType_Base(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "base"
           });	
        addAnnotation
          (restrictionType1EClass, 
           source, 
           new String[] {
             "name", "restriction_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getRestrictionType1_SimpleType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "simpleType",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getRestrictionType1_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:4"
           });	
        addAnnotation
          (getRestrictionType1_FacetGroup(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "facet:group",
             "namespace", "##targetNamespace",
             "group", "#group:4"
           });	
        addAnnotation
          (getRestrictionType1_Facet(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "facet",
             "namespace", "##targetNamespace",
             "group", "facet:group"
           });	
        addAnnotation
          (getRestrictionType1_Any(), 
           source, 
           new String[] {
             "kind", "elementWildcard",
             "wildcards", "##other",
             "name", ":7",
             "processing", "lax",
             "group", "#group:4"
           });	
        addAnnotation
          (getRestrictionType1_Base(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "base"
           });	
        addAnnotation
          (schemaTypeEClass, 
           source, 
           new String[] {
             "name", "schema_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getSchemaType_Composition(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "Composition:1"
           });	
        addAnnotation
          (getSchemaType_Include(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "include",
             "namespace", "##targetNamespace",
             "group", "#Composition:1"
           });	
        addAnnotation
          (getSchemaType_Import(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "import",
             "namespace", "##targetNamespace",
             "group", "#Composition:1"
           });	
        addAnnotation
          (getSchemaType_Redefine(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "redefine",
             "namespace", "##targetNamespace",
             "group", "#Composition:1"
           });	
        addAnnotation
          (getSchemaType_Override(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "override",
             "namespace", "##targetNamespace",
             "group", "#Composition:1"
           });	
        addAnnotation
          (getSchemaType_Annotation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "annotation",
             "namespace", "##targetNamespace",
             "group", "#Composition:1"
           });	
        addAnnotation
          (getSchemaType_DefaultOpenContent(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "defaultOpenContent",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getSchemaType_Annotation1(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "annotation",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getSchemaType_Group(), 
           source, 
           new String[] {
             "kind", "group",
             "name", "group:9"
           });	
        addAnnotation
          (getSchemaType_SimpleType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "simpleType",
             "namespace", "##targetNamespace",
             "group", "#group:9"
           });	
        addAnnotation
          (getSchemaType_ComplexType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "complexType",
             "namespace", "##targetNamespace",
             "group", "#group:9"
           });	
        addAnnotation
          (getSchemaType_Group1(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "group",
             "namespace", "##targetNamespace",
             "group", "#group:9"
           });	
        addAnnotation
          (getSchemaType_AttributeGroup(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "attributeGroup",
             "namespace", "##targetNamespace",
             "group", "#group:9"
           });	
        addAnnotation
          (getSchemaType_Element(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "element",
             "namespace", "##targetNamespace",
             "group", "#group:9"
           });	
        addAnnotation
          (getSchemaType_Attribute(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "attribute",
             "namespace", "##targetNamespace",
             "group", "#group:9"
           });	
        addAnnotation
          (getSchemaType_Notation(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "notation",
             "namespace", "##targetNamespace",
             "group", "#group:9"
           });	
        addAnnotation
          (getSchemaType_Annotation2(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "annotation",
             "namespace", "##targetNamespace",
             "group", "#group:9"
           });	
        addAnnotation
          (getSchemaType_TargetNamespace(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "targetNamespace"
           });	
        addAnnotation
          (getSchemaType_Version(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "version"
           });	
        addAnnotation
          (getSchemaType_FinalDefault(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "finalDefault"
           });	
        addAnnotation
          (getSchemaType_BlockDefault(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "blockDefault"
           });	
        addAnnotation
          (getSchemaType_AttributeFormDefault(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "attributeFormDefault"
           });	
        addAnnotation
          (getSchemaType_ElementFormDefault(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "elementFormDefault"
           });	
        addAnnotation
          (getSchemaType_DefaultAttributes(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "defaultAttributes"
           });	
        addAnnotation
          (getSchemaType_XpathDefaultNamespace(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xpathDefaultNamespace"
           });	
        addAnnotation
          (getSchemaType_Id(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "id"
           });	
        addAnnotation
          (getSchemaType_Lang(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "lang",
             "namespace", "http://www.w3.org/XML/1998/namespace"
           });	
        addAnnotation
          (selectorTypeEClass, 
           source, 
           new String[] {
             "name", "selector_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getSelectorType_Xpath(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xpath"
           });	
        addAnnotation
          (getSelectorType_XpathDefaultNamespace(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "xpathDefaultNamespace"
           });	
        addAnnotation
          (simpleContentTypeEClass, 
           source, 
           new String[] {
             "name", "simpleContent_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getSimpleContentType_Restriction(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "restriction",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getSimpleContentType_Extension(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "extension",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (simpleDerivationSetEDataType, 
           source, 
           new String[] {
             "name", "simpleDerivationSet",
             "memberTypes", "simpleDerivationSet_._member_._0 simpleDerivationSet_._member_._1"
           });	
        addAnnotation
          (simpleDerivationSetMember0EEnum, 
           source, 
           new String[] {
             "name", "simpleDerivationSet_._member_._0"
           });	
        addAnnotation
          (simpleDerivationSetMember0ObjectEDataType, 
           source, 
           new String[] {
             "name", "simpleDerivationSet_._member_._0:Object",
             "baseType", "simpleDerivationSet_._member_._0"
           });	
        addAnnotation
          (simpleDerivationSetMember1EDataType, 
           source, 
           new String[] {
             "name", "simpleDerivationSet_._member_._1",
             "itemType", "simpleDerivationSet_._member_._1_._item"
           });	
        addAnnotation
          (simpleDerivationSetMember1ItemEEnum, 
           source, 
           new String[] {
             "name", "simpleDerivationSet_._member_._1_._item"
           });	
        addAnnotation
          (simpleDerivationSetMember1ItemObjectEDataType, 
           source, 
           new String[] {
             "name", "simpleDerivationSet_._member_._1_._item:Object",
             "baseType", "simpleDerivationSet_._member_._1_._item"
           });	
        addAnnotation
          (simpleExplicitGroupEClass, 
           source, 
           new String[] {
             "name", "simpleExplicitGroup",
             "kind", "elementOnly"
           });	
        addAnnotation
          (simpleExtensionTypeEClass, 
           source, 
           new String[] {
             "name", "simpleExtensionType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (simpleRestrictionTypeEClass, 
           source, 
           new String[] {
             "name", "simpleRestrictionType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (simpleTypeEClass, 
           source, 
           new String[] {
             "name", "simpleType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getSimpleType_Restriction(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "restriction",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getSimpleType_List(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "list",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getSimpleType_Union(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "union",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getSimpleType_Final(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "final"
           });	
        addAnnotation
          (getSimpleType_Name(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "name"
           });	
        addAnnotation
          (specialNamespaceListEEnum, 
           source, 
           new String[] {
             "name", "specialNamespaceList"
           });	
        addAnnotation
          (specialNamespaceListObjectEDataType, 
           source, 
           new String[] {
             "name", "specialNamespaceList:Object",
             "baseType", "specialNamespaceList"
           });	
        addAnnotation
          (substitutionGroupTypeEDataType, 
           source, 
           new String[] {
             "name", "substitutionGroup_._type",
             "itemType", "http://www.eclipse.org/emf/2003/XMLType#QName"
           });	
        addAnnotation
          (topLevelAttributeEClass, 
           source, 
           new String[] {
             "name", "topLevelAttribute",
             "kind", "elementOnly"
           });	
        addAnnotation
          (topLevelComplexTypeEClass, 
           source, 
           new String[] {
             "name", "topLevelComplexType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (topLevelElementEClass, 
           source, 
           new String[] {
             "name", "topLevelElement",
             "kind", "elementOnly"
           });	
        addAnnotation
          (topLevelSimpleTypeEClass, 
           source, 
           new String[] {
             "name", "topLevelSimpleType",
             "kind", "elementOnly"
           });	
        addAnnotation
          (totalDigitsTypeEClass, 
           source, 
           new String[] {
             "name", "totalDigits_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (typeDerivationControlEEnum, 
           source, 
           new String[] {
             "name", "typeDerivationControl"
           });	
        addAnnotation
          (typeDerivationControlObjectEDataType, 
           source, 
           new String[] {
             "name", "typeDerivationControl:Object",
             "baseType", "typeDerivationControl"
           });	
        addAnnotation
          (unionTypeEClass, 
           source, 
           new String[] {
             "name", "union_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getUnionType_SimpleType(), 
           source, 
           new String[] {
             "kind", "element",
             "name", "simpleType",
             "namespace", "##targetNamespace"
           });	
        addAnnotation
          (getUnionType_MemberTypes(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "memberTypes"
           });	
        addAnnotation
          (useTypeEEnum, 
           source, 
           new String[] {
             "name", "use_._type"
           });	
        addAnnotation
          (useTypeObjectEDataType, 
           source, 
           new String[] {
             "name", "use_._type:Object",
             "baseType", "use_._type"
           });	
        addAnnotation
          (whiteSpaceTypeEClass, 
           source, 
           new String[] {
             "name", "whiteSpace_._type",
             "kind", "elementOnly"
           });	
        addAnnotation
          (wildcardEClass, 
           source, 
           new String[] {
             "name", "wildcard",
             "kind", "elementOnly"
           });	
        addAnnotation
          (getWildcard_Namespace(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "namespace"
           });	
        addAnnotation
          (getWildcard_NotNamespace(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "notNamespace"
           });	
        addAnnotation
          (getWildcard_ProcessContents(), 
           source, 
           new String[] {
             "kind", "attribute",
             "name", "processContents"
           });	
        addAnnotation
          (xpathDefaultNamespaceEDataType, 
           source, 
           new String[] {
             "name", "xpathDefaultNamespace",
             "memberTypes", "http://www.eclipse.org/emf/2003/XMLType#anyURI xpathDefaultNamespace_._member_._1"
           });	
        addAnnotation
          (xpathDefaultNamespaceMember1EEnum, 
           source, 
           new String[] {
             "name", "xpathDefaultNamespace_._member_._1"
           });	
        addAnnotation
          (xpathDefaultNamespaceMember1ObjectEDataType, 
           source, 
           new String[] {
             "name", "xpathDefaultNamespace_._member_._1:Object",
             "baseType", "xpathDefaultNamespace_._member_._1"
           });	
        addAnnotation
          (xpathTypeEDataType, 
           source, 
           new String[] {
             "name", "xpath_._type",
             "baseType", "http://www.eclipse.org/emf/2003/XMLType#token"
           });	
        addAnnotation
          (xpathType1EDataType, 
           source, 
           new String[] {
             "name", "xpath_._1_._type",
             "baseType", "http://www.eclipse.org/emf/2003/XMLType#token"
           });
    }

} //SchemaPackageImpl
