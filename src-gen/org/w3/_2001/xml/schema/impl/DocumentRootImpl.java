/**
 */
package org.w3._2001.xml.schema.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2001.xml.schema.All;
import org.w3._2001.xml.schema.AnnotationType;
import org.w3._2001.xml.schema.AnyAttributeType;
import org.w3._2001.xml.schema.AnyType;
import org.w3._2001.xml.schema.AppinfoType;
import org.w3._2001.xml.schema.Assertion;
import org.w3._2001.xml.schema.ComplexContentType;
import org.w3._2001.xml.schema.DefaultOpenContentType;
import org.w3._2001.xml.schema.DocumentRoot;
import org.w3._2001.xml.schema.DocumentationType;
import org.w3._2001.xml.schema.ExplicitGroup;
import org.w3._2001.xml.schema.ExplicitTimezoneType;
import org.w3._2001.xml.schema.Facet;
import org.w3._2001.xml.schema.FieldType;
import org.w3._2001.xml.schema.ImportType;
import org.w3._2001.xml.schema.IncludeType;
import org.w3._2001.xml.schema.Keybase;
import org.w3._2001.xml.schema.KeyrefType;
import org.w3._2001.xml.schema.ListType;
import org.w3._2001.xml.schema.NamedAttributeGroup;
import org.w3._2001.xml.schema.NamedGroup;
import org.w3._2001.xml.schema.NoFixedFacet;
import org.w3._2001.xml.schema.NotationType;
import org.w3._2001.xml.schema.NumFacet;
import org.w3._2001.xml.schema.OpenContentType;
import org.w3._2001.xml.schema.OverrideType;
import org.w3._2001.xml.schema.PatternType;
import org.w3._2001.xml.schema.RedefineType;
import org.w3._2001.xml.schema.RestrictionType1;
import org.w3._2001.xml.schema.SchemaType;
import org.w3._2001.xml.schema.SelectorType;
import org.w3._2001.xml.schema.SimpleContentType;
import org.w3._2001.xml.schema.TopLevelAttribute;
import org.w3._2001.xml.schema.TopLevelComplexType;
import org.w3._2001.xml.schema.TopLevelElement;
import org.w3._2001.xml.schema.TopLevelSimpleType;
import org.w3._2001.xml.schema.TotalDigitsType;
import org.w3._2001.xml.schema.UnionType;
import org.w3._2001.xml.schema.WhiteSpaceType;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getAll <em>All</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getAppinfo <em>Appinfo</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getAssertion <em>Assertion</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getFacet <em>Facet</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getComplexContent <em>Complex Content</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getDefaultOpenContent <em>Default Open Content</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getEnumeration <em>Enumeration</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getExplicitTimezone <em>Explicit Timezone</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getFractionDigits <em>Fraction Digits</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getKeyref <em>Keyref</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getList <em>List</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getMaxExclusive <em>Max Exclusive</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getMaxInclusive <em>Max Inclusive</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getMinExclusive <em>Min Exclusive</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getMinInclusive <em>Min Inclusive</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getNotation <em>Notation</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getOpenContent <em>Open Content</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getOverride <em>Override</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getRedefine <em>Redefine</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getSimpleContent <em>Simple Content</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getTotalDigits <em>Total Digits</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getUnion <em>Union</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getUnique <em>Unique</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DocumentRootImpl#getWhiteSpace <em>White Space</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
    /**
     * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMixed()
     * @generated
     * @ordered
     */
    protected FeatureMap mixed;

    /**
     * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXMLNSPrefixMap()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xMLNSPrefixMap;

    /**
     * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXSISchemaLocation()
     * @generated
     * @ordered
     */
    protected EMap<String, String> xSISchemaLocation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DocumentRootImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.DOCUMENT_ROOT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getMixed() {
        if (mixed == null) {
            mixed = new BasicFeatureMap(this, XMLSchema11Package.DOCUMENT_ROOT__MIXED);
        }
        return mixed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXMLNSPrefixMap() {
        if (xMLNSPrefixMap == null) {
            xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XMLSchema11Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
        }
        return xMLNSPrefixMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMap<String, String> getXSISchemaLocation() {
        if (xSISchemaLocation == null) {
            xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, XMLSchema11Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
        }
        return xSISchemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public All getAll() {
        return (All)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__ALL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAll(All newAll) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__ALL, newAll);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnnotationType getAnnotation() {
        return (AnnotationType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__ANNOTATION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnnotation(AnnotationType newAnnotation) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__ANNOTATION, newAnnotation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyType getAny() {
        return (AnyType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__ANY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAny(AnyType newAny) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__ANY, newAny);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyAttributeType getAnyAttribute() {
        return (AnyAttributeType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__ANY_ATTRIBUTE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnyAttribute(AnyAttributeType newAnyAttribute) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__ANY_ATTRIBUTE, newAnyAttribute);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AppinfoType getAppinfo() {
        return (AppinfoType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__APPINFO, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAppinfo(AppinfoType newAppinfo) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__APPINFO, newAppinfo);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Assertion getAssertion() {
        return (Assertion)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__ASSERTION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAssertion(Assertion newAssertion) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__ASSERTION, newAssertion);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EObject getFacet() {
        return (EObject)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__FACET, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TopLevelAttribute getAttribute() {
        return (TopLevelAttribute)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__ATTRIBUTE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttribute(TopLevelAttribute newAttribute) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__ATTRIBUTE, newAttribute);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedAttributeGroup getAttributeGroup() {
        return (NamedAttributeGroup)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__ATTRIBUTE_GROUP, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttributeGroup(NamedAttributeGroup newAttributeGroup) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__ATTRIBUTE_GROUP, newAttributeGroup);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExplicitGroup getChoice() {
        return (ExplicitGroup)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__CHOICE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChoice(ExplicitGroup newChoice) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__CHOICE, newChoice);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexContentType getComplexContent() {
        return (ComplexContentType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__COMPLEX_CONTENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComplexContent(ComplexContentType newComplexContent) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__COMPLEX_CONTENT, newComplexContent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TopLevelComplexType getComplexType() {
        return (TopLevelComplexType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__COMPLEX_TYPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComplexType(TopLevelComplexType newComplexType) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__COMPLEX_TYPE, newComplexType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultOpenContentType getDefaultOpenContent() {
        return (DefaultOpenContentType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__DEFAULT_OPEN_CONTENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultOpenContent(DefaultOpenContentType newDefaultOpenContent) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__DEFAULT_OPEN_CONTENT, newDefaultOpenContent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DocumentationType getDocumentation() {
        return (DocumentationType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__DOCUMENTATION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDocumentation(DocumentationType newDocumentation) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__DOCUMENTATION, newDocumentation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TopLevelElement getElement() {
        return (TopLevelElement)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__ELEMENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setElement(TopLevelElement newElement) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__ELEMENT, newElement);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NoFixedFacet getEnumeration() {
        return (NoFixedFacet)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__ENUMERATION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEnumeration(NoFixedFacet newEnumeration) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__ENUMERATION, newEnumeration);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExplicitTimezoneType getExplicitTimezone() {
        return (ExplicitTimezoneType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__EXPLICIT_TIMEZONE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExplicitTimezone(ExplicitTimezoneType newExplicitTimezone) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__EXPLICIT_TIMEZONE, newExplicitTimezone);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FieldType getField() {
        return (FieldType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__FIELD, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setField(FieldType newField) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__FIELD, newField);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumFacet getFractionDigits() {
        return (NumFacet)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__FRACTION_DIGITS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFractionDigits(NumFacet newFractionDigits) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__FRACTION_DIGITS, newFractionDigits);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamedGroup getGroup() {
        return (NamedGroup)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__GROUP, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGroup(NamedGroup newGroup) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__GROUP, newGroup);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImportType getImport() {
        return (ImportType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__IMPORT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImport(ImportType newImport) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__IMPORT, newImport);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IncludeType getInclude() {
        return (IncludeType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__INCLUDE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInclude(IncludeType newInclude) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__INCLUDE, newInclude);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Keybase getKey() {
        return (Keybase)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__KEY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKey(Keybase newKey) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__KEY, newKey);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KeyrefType getKeyref() {
        return (KeyrefType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__KEYREF, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKeyref(KeyrefType newKeyref) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__KEYREF, newKeyref);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumFacet getLength() {
        return (NumFacet)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__LENGTH, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLength(NumFacet newLength) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__LENGTH, newLength);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ListType getList() {
        return (ListType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__LIST, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setList(ListType newList) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__LIST, newList);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Facet getMaxExclusive() {
        return (Facet)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__MAX_EXCLUSIVE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxExclusive(Facet newMaxExclusive) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__MAX_EXCLUSIVE, newMaxExclusive);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Facet getMaxInclusive() {
        return (Facet)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__MAX_INCLUSIVE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxInclusive(Facet newMaxInclusive) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__MAX_INCLUSIVE, newMaxInclusive);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumFacet getMaxLength() {
        return (NumFacet)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__MAX_LENGTH, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxLength(NumFacet newMaxLength) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__MAX_LENGTH, newMaxLength);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Facet getMinExclusive() {
        return (Facet)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__MIN_EXCLUSIVE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinExclusive(Facet newMinExclusive) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__MIN_EXCLUSIVE, newMinExclusive);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Facet getMinInclusive() {
        return (Facet)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__MIN_INCLUSIVE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinInclusive(Facet newMinInclusive) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__MIN_INCLUSIVE, newMinInclusive);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumFacet getMinLength() {
        return (NumFacet)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__MIN_LENGTH, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMinLength(NumFacet newMinLength) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__MIN_LENGTH, newMinLength);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotationType getNotation() {
        return (NotationType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__NOTATION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNotation(NotationType newNotation) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__NOTATION, newNotation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpenContentType getOpenContent() {
        return (OpenContentType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__OPEN_CONTENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOpenContent(OpenContentType newOpenContent) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__OPEN_CONTENT, newOpenContent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OverrideType getOverride() {
        return (OverrideType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__OVERRIDE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOverride(OverrideType newOverride) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__OVERRIDE, newOverride);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PatternType getPattern() {
        return (PatternType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__PATTERN, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPattern(PatternType newPattern) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__PATTERN, newPattern);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RedefineType getRedefine() {
        return (RedefineType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__REDEFINE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRedefine(RedefineType newRedefine) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__REDEFINE, newRedefine);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RestrictionType1 getRestriction() {
        return (RestrictionType1)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__RESTRICTION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRestriction(RestrictionType1 newRestriction) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__RESTRICTION, newRestriction);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SchemaType getSchema() {
        return (SchemaType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__SCHEMA, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSchema(SchemaType newSchema) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__SCHEMA, newSchema);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SelectorType getSelector() {
        return (SelectorType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__SELECTOR, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSelector(SelectorType newSelector) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__SELECTOR, newSelector);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExplicitGroup getSequence() {
        return (ExplicitGroup)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__SEQUENCE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSequence(ExplicitGroup newSequence) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__SEQUENCE, newSequence);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleContentType getSimpleContent() {
        return (SimpleContentType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__SIMPLE_CONTENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSimpleContent(SimpleContentType newSimpleContent) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__SIMPLE_CONTENT, newSimpleContent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TopLevelSimpleType getSimpleType() {
        return (TopLevelSimpleType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__SIMPLE_TYPE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSimpleType(TopLevelSimpleType newSimpleType) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__SIMPLE_TYPE, newSimpleType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TotalDigitsType getTotalDigits() {
        return (TotalDigitsType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__TOTAL_DIGITS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTotalDigits(TotalDigitsType newTotalDigits) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__TOTAL_DIGITS, newTotalDigits);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnionType getUnion() {
        return (UnionType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__UNION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnion(UnionType newUnion) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__UNION, newUnion);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Keybase getUnique() {
        return (Keybase)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__UNIQUE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUnique(Keybase newUnique) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__UNIQUE, newUnique);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WhiteSpaceType getWhiteSpace() {
        return (WhiteSpaceType)getMixed().get(XMLSchema11Package.Literals.DOCUMENT_ROOT__WHITE_SPACE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWhiteSpace(WhiteSpaceType newWhiteSpace) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DOCUMENT_ROOT__WHITE_SPACE, newWhiteSpace);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XMLSchema11Package.DOCUMENT_ROOT__MIXED:
                return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XMLSchema11Package.DOCUMENT_ROOT__MIXED:
                if (coreType) return getMixed();
                return ((FeatureMap.Internal)getMixed()).getWrapper();
            case XMLSchema11Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                if (coreType) return getXMLNSPrefixMap();
                else return getXMLNSPrefixMap().map();
            case XMLSchema11Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                if (coreType) return getXSISchemaLocation();
                else return getXSISchemaLocation().map();
            case XMLSchema11Package.DOCUMENT_ROOT__ALL:
                return getAll();
            case XMLSchema11Package.DOCUMENT_ROOT__ANNOTATION:
                return getAnnotation();
            case XMLSchema11Package.DOCUMENT_ROOT__ANY:
                return getAny();
            case XMLSchema11Package.DOCUMENT_ROOT__ANY_ATTRIBUTE:
                return getAnyAttribute();
            case XMLSchema11Package.DOCUMENT_ROOT__APPINFO:
                return getAppinfo();
            case XMLSchema11Package.DOCUMENT_ROOT__ASSERTION:
                return getAssertion();
            case XMLSchema11Package.DOCUMENT_ROOT__FACET:
                return getFacet();
            case XMLSchema11Package.DOCUMENT_ROOT__ATTRIBUTE:
                return getAttribute();
            case XMLSchema11Package.DOCUMENT_ROOT__ATTRIBUTE_GROUP:
                return getAttributeGroup();
            case XMLSchema11Package.DOCUMENT_ROOT__CHOICE:
                return getChoice();
            case XMLSchema11Package.DOCUMENT_ROOT__COMPLEX_CONTENT:
                return getComplexContent();
            case XMLSchema11Package.DOCUMENT_ROOT__COMPLEX_TYPE:
                return getComplexType();
            case XMLSchema11Package.DOCUMENT_ROOT__DEFAULT_OPEN_CONTENT:
                return getDefaultOpenContent();
            case XMLSchema11Package.DOCUMENT_ROOT__DOCUMENTATION:
                return getDocumentation();
            case XMLSchema11Package.DOCUMENT_ROOT__ELEMENT:
                return getElement();
            case XMLSchema11Package.DOCUMENT_ROOT__ENUMERATION:
                return getEnumeration();
            case XMLSchema11Package.DOCUMENT_ROOT__EXPLICIT_TIMEZONE:
                return getExplicitTimezone();
            case XMLSchema11Package.DOCUMENT_ROOT__FIELD:
                return getField();
            case XMLSchema11Package.DOCUMENT_ROOT__FRACTION_DIGITS:
                return getFractionDigits();
            case XMLSchema11Package.DOCUMENT_ROOT__GROUP:
                return getGroup();
            case XMLSchema11Package.DOCUMENT_ROOT__IMPORT:
                return getImport();
            case XMLSchema11Package.DOCUMENT_ROOT__INCLUDE:
                return getInclude();
            case XMLSchema11Package.DOCUMENT_ROOT__KEY:
                return getKey();
            case XMLSchema11Package.DOCUMENT_ROOT__KEYREF:
                return getKeyref();
            case XMLSchema11Package.DOCUMENT_ROOT__LENGTH:
                return getLength();
            case XMLSchema11Package.DOCUMENT_ROOT__LIST:
                return getList();
            case XMLSchema11Package.DOCUMENT_ROOT__MAX_EXCLUSIVE:
                return getMaxExclusive();
            case XMLSchema11Package.DOCUMENT_ROOT__MAX_INCLUSIVE:
                return getMaxInclusive();
            case XMLSchema11Package.DOCUMENT_ROOT__MAX_LENGTH:
                return getMaxLength();
            case XMLSchema11Package.DOCUMENT_ROOT__MIN_EXCLUSIVE:
                return getMinExclusive();
            case XMLSchema11Package.DOCUMENT_ROOT__MIN_INCLUSIVE:
                return getMinInclusive();
            case XMLSchema11Package.DOCUMENT_ROOT__MIN_LENGTH:
                return getMinLength();
            case XMLSchema11Package.DOCUMENT_ROOT__NOTATION:
                return getNotation();
            case XMLSchema11Package.DOCUMENT_ROOT__OPEN_CONTENT:
                return getOpenContent();
            case XMLSchema11Package.DOCUMENT_ROOT__OVERRIDE:
                return getOverride();
            case XMLSchema11Package.DOCUMENT_ROOT__PATTERN:
                return getPattern();
            case XMLSchema11Package.DOCUMENT_ROOT__REDEFINE:
                return getRedefine();
            case XMLSchema11Package.DOCUMENT_ROOT__RESTRICTION:
                return getRestriction();
            case XMLSchema11Package.DOCUMENT_ROOT__SCHEMA:
                return getSchema();
            case XMLSchema11Package.DOCUMENT_ROOT__SELECTOR:
                return getSelector();
            case XMLSchema11Package.DOCUMENT_ROOT__SEQUENCE:
                return getSequence();
            case XMLSchema11Package.DOCUMENT_ROOT__SIMPLE_CONTENT:
                return getSimpleContent();
            case XMLSchema11Package.DOCUMENT_ROOT__SIMPLE_TYPE:
                return getSimpleType();
            case XMLSchema11Package.DOCUMENT_ROOT__TOTAL_DIGITS:
                return getTotalDigits();
            case XMLSchema11Package.DOCUMENT_ROOT__UNION:
                return getUnion();
            case XMLSchema11Package.DOCUMENT_ROOT__UNIQUE:
                return getUnique();
            case XMLSchema11Package.DOCUMENT_ROOT__WHITE_SPACE:
                return getWhiteSpace();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XMLSchema11Package.DOCUMENT_ROOT__MIXED:
                ((FeatureMap.Internal)getMixed()).set(newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                ((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                ((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ALL:
                setAll((All)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ANNOTATION:
                setAnnotation((AnnotationType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ANY:
                setAny((AnyType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ANY_ATTRIBUTE:
                setAnyAttribute((AnyAttributeType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__APPINFO:
                setAppinfo((AppinfoType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ASSERTION:
                setAssertion((Assertion)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ATTRIBUTE:
                setAttribute((TopLevelAttribute)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ATTRIBUTE_GROUP:
                setAttributeGroup((NamedAttributeGroup)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__CHOICE:
                setChoice((ExplicitGroup)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__COMPLEX_CONTENT:
                setComplexContent((ComplexContentType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__COMPLEX_TYPE:
                setComplexType((TopLevelComplexType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__DEFAULT_OPEN_CONTENT:
                setDefaultOpenContent((DefaultOpenContentType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__DOCUMENTATION:
                setDocumentation((DocumentationType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ELEMENT:
                setElement((TopLevelElement)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ENUMERATION:
                setEnumeration((NoFixedFacet)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__EXPLICIT_TIMEZONE:
                setExplicitTimezone((ExplicitTimezoneType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__FIELD:
                setField((FieldType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__FRACTION_DIGITS:
                setFractionDigits((NumFacet)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__GROUP:
                setGroup((NamedGroup)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__IMPORT:
                setImport((ImportType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__INCLUDE:
                setInclude((IncludeType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__KEY:
                setKey((Keybase)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__KEYREF:
                setKeyref((KeyrefType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__LENGTH:
                setLength((NumFacet)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__LIST:
                setList((ListType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__MAX_EXCLUSIVE:
                setMaxExclusive((Facet)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__MAX_INCLUSIVE:
                setMaxInclusive((Facet)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__MAX_LENGTH:
                setMaxLength((NumFacet)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__MIN_EXCLUSIVE:
                setMinExclusive((Facet)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__MIN_INCLUSIVE:
                setMinInclusive((Facet)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__MIN_LENGTH:
                setMinLength((NumFacet)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__NOTATION:
                setNotation((NotationType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__OPEN_CONTENT:
                setOpenContent((OpenContentType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__OVERRIDE:
                setOverride((OverrideType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__PATTERN:
                setPattern((PatternType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__REDEFINE:
                setRedefine((RedefineType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__RESTRICTION:
                setRestriction((RestrictionType1)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__SCHEMA:
                setSchema((SchemaType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__SELECTOR:
                setSelector((SelectorType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__SEQUENCE:
                setSequence((ExplicitGroup)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__SIMPLE_CONTENT:
                setSimpleContent((SimpleContentType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__SIMPLE_TYPE:
                setSimpleType((TopLevelSimpleType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__TOTAL_DIGITS:
                setTotalDigits((TotalDigitsType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__UNION:
                setUnion((UnionType)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__UNIQUE:
                setUnique((Keybase)newValue);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__WHITE_SPACE:
                setWhiteSpace((WhiteSpaceType)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case XMLSchema11Package.DOCUMENT_ROOT__MIXED:
                getMixed().clear();
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                getXMLNSPrefixMap().clear();
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                getXSISchemaLocation().clear();
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ALL:
                setAll((All)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ANNOTATION:
                setAnnotation((AnnotationType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ANY:
                setAny((AnyType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ANY_ATTRIBUTE:
                setAnyAttribute((AnyAttributeType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__APPINFO:
                setAppinfo((AppinfoType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ASSERTION:
                setAssertion((Assertion)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ATTRIBUTE:
                setAttribute((TopLevelAttribute)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ATTRIBUTE_GROUP:
                setAttributeGroup((NamedAttributeGroup)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__CHOICE:
                setChoice((ExplicitGroup)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__COMPLEX_CONTENT:
                setComplexContent((ComplexContentType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__COMPLEX_TYPE:
                setComplexType((TopLevelComplexType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__DEFAULT_OPEN_CONTENT:
                setDefaultOpenContent((DefaultOpenContentType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__DOCUMENTATION:
                setDocumentation((DocumentationType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ELEMENT:
                setElement((TopLevelElement)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__ENUMERATION:
                setEnumeration((NoFixedFacet)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__EXPLICIT_TIMEZONE:
                setExplicitTimezone((ExplicitTimezoneType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__FIELD:
                setField((FieldType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__FRACTION_DIGITS:
                setFractionDigits((NumFacet)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__GROUP:
                setGroup((NamedGroup)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__IMPORT:
                setImport((ImportType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__INCLUDE:
                setInclude((IncludeType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__KEY:
                setKey((Keybase)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__KEYREF:
                setKeyref((KeyrefType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__LENGTH:
                setLength((NumFacet)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__LIST:
                setList((ListType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__MAX_EXCLUSIVE:
                setMaxExclusive((Facet)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__MAX_INCLUSIVE:
                setMaxInclusive((Facet)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__MAX_LENGTH:
                setMaxLength((NumFacet)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__MIN_EXCLUSIVE:
                setMinExclusive((Facet)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__MIN_INCLUSIVE:
                setMinInclusive((Facet)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__MIN_LENGTH:
                setMinLength((NumFacet)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__NOTATION:
                setNotation((NotationType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__OPEN_CONTENT:
                setOpenContent((OpenContentType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__OVERRIDE:
                setOverride((OverrideType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__PATTERN:
                setPattern((PatternType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__REDEFINE:
                setRedefine((RedefineType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__RESTRICTION:
                setRestriction((RestrictionType1)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__SCHEMA:
                setSchema((SchemaType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__SELECTOR:
                setSelector((SelectorType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__SEQUENCE:
                setSequence((ExplicitGroup)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__SIMPLE_CONTENT:
                setSimpleContent((SimpleContentType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__SIMPLE_TYPE:
                setSimpleType((TopLevelSimpleType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__TOTAL_DIGITS:
                setTotalDigits((TotalDigitsType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__UNION:
                setUnion((UnionType)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__UNIQUE:
                setUnique((Keybase)null);
                return;
            case XMLSchema11Package.DOCUMENT_ROOT__WHITE_SPACE:
                setWhiteSpace((WhiteSpaceType)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case XMLSchema11Package.DOCUMENT_ROOT__MIXED:
                return mixed != null && !mixed.isEmpty();
            case XMLSchema11Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
                return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
            case XMLSchema11Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
                return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
            case XMLSchema11Package.DOCUMENT_ROOT__ALL:
                return getAll() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__ANNOTATION:
                return getAnnotation() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__ANY:
                return getAny() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__ANY_ATTRIBUTE:
                return getAnyAttribute() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__APPINFO:
                return getAppinfo() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__ASSERTION:
                return getAssertion() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__FACET:
                return getFacet() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__ATTRIBUTE:
                return getAttribute() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__ATTRIBUTE_GROUP:
                return getAttributeGroup() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__CHOICE:
                return getChoice() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__COMPLEX_CONTENT:
                return getComplexContent() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__COMPLEX_TYPE:
                return getComplexType() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__DEFAULT_OPEN_CONTENT:
                return getDefaultOpenContent() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__DOCUMENTATION:
                return getDocumentation() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__ELEMENT:
                return getElement() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__ENUMERATION:
                return getEnumeration() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__EXPLICIT_TIMEZONE:
                return getExplicitTimezone() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__FIELD:
                return getField() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__FRACTION_DIGITS:
                return getFractionDigits() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__GROUP:
                return getGroup() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__IMPORT:
                return getImport() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__INCLUDE:
                return getInclude() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__KEY:
                return getKey() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__KEYREF:
                return getKeyref() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__LENGTH:
                return getLength() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__LIST:
                return getList() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__MAX_EXCLUSIVE:
                return getMaxExclusive() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__MAX_INCLUSIVE:
                return getMaxInclusive() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__MAX_LENGTH:
                return getMaxLength() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__MIN_EXCLUSIVE:
                return getMinExclusive() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__MIN_INCLUSIVE:
                return getMinInclusive() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__MIN_LENGTH:
                return getMinLength() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__NOTATION:
                return getNotation() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__OPEN_CONTENT:
                return getOpenContent() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__OVERRIDE:
                return getOverride() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__PATTERN:
                return getPattern() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__REDEFINE:
                return getRedefine() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__RESTRICTION:
                return getRestriction() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__SCHEMA:
                return getSchema() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__SELECTOR:
                return getSelector() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__SEQUENCE:
                return getSequence() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__SIMPLE_CONTENT:
                return getSimpleContent() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__SIMPLE_TYPE:
                return getSimpleType() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__TOTAL_DIGITS:
                return getTotalDigits() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__UNION:
                return getUnion() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__UNIQUE:
                return getUnique() != null;
            case XMLSchema11Package.DOCUMENT_ROOT__WHITE_SPACE:
                return getWhiteSpace() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (mixed: ");
        result.append(mixed);
        result.append(')');
        return result.toString();
    }

} //DocumentRootImpl
