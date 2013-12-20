/**
 */
package org.w3._2001.xml.schema.impl;

import java.util.Collection;
import javax.xml.namespace.QName;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3._2001.xml.schema.AnnotationType;
import org.w3._2001.xml.schema.DefaultOpenContentType;
import org.w3._2001.xml.schema.FormChoice;
import org.w3._2001.xml.schema.ImportType;
import org.w3._2001.xml.schema.IncludeType;
import org.w3._2001.xml.schema.NamedAttributeGroup;
import org.w3._2001.xml.schema.NamedGroup;
import org.w3._2001.xml.schema.NotationType;
import org.w3._2001.xml.schema.OverrideType;
import org.w3._2001.xml.schema.RedefineType;
import org.w3._2001.xml.schema.SchemaType;
import org.w3._2001.xml.schema.TopLevelAttribute;
import org.w3._2001.xml.schema.TopLevelComplexType;
import org.w3._2001.xml.schema.TopLevelElement;
import org.w3._2001.xml.schema.TopLevelSimpleType;
import org.w3._2001.xml.schema.XMLSchema11Factory;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getRedefine <em>Redefine</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getOverride <em>Override</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getDefaultOpenContent <em>Default Open Content</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getAnnotation1 <em>Annotation1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getNotation <em>Notation</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getAnnotation2 <em>Annotation2</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getFinalDefault <em>Final Default</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getBlockDefault <em>Block Default</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getAttributeFormDefault <em>Attribute Form Default</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getElementFormDefault <em>Element Form Default</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getDefaultAttributes <em>Default Attributes</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.SchemaTypeImpl#getLang <em>Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchemaTypeImpl extends OpenAttrsImpl implements SchemaType {
    /**
     * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetNamespace()
     * @generated
     * @ordered
     */
    protected static final String TARGET_NAMESPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetNamespace()
     * @generated
     * @ordered
     */
    protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

    /**
     * The default value of the '{@link #getFinalDefault() <em>Final Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinalDefault()
     * @generated NOT
     * @ordered
     */
    protected static final Object FINAL_DEFAULT_EDEFAULT = null;//XMLSchema11Factory.eINSTANCE.createFromString(XMLSchema11Package.eINSTANCE.getFullDerivationSet(), "");

    /**
     * The cached value of the '{@link #getFinalDefault() <em>Final Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinalDefault()
     * @generated
     * @ordered
     */
    protected Object finalDefault = FINAL_DEFAULT_EDEFAULT;

    /**
     * This is true if the Final Default attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean finalDefaultESet;

    /**
     * The default value of the '{@link #getBlockDefault() <em>Block Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBlockDefault()
     * @generated NOT
     * @ordered
     */
    protected static final Object BLOCK_DEFAULT_EDEFAULT = null;//XMLSchema11Factory.eINSTANCE.createFromString(XMLSchema11Package.eINSTANCE.getBlockSet(), "");

    /**
     * The cached value of the '{@link #getBlockDefault() <em>Block Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBlockDefault()
     * @generated
     * @ordered
     */
    protected Object blockDefault = BLOCK_DEFAULT_EDEFAULT;

    /**
     * This is true if the Block Default attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean blockDefaultESet;

    /**
     * The default value of the '{@link #getAttributeFormDefault() <em>Attribute Form Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeFormDefault()
     * @generated
     * @ordered
     */
    protected static final FormChoice ATTRIBUTE_FORM_DEFAULT_EDEFAULT = FormChoice.UNQUALIFIED;

    /**
     * The cached value of the '{@link #getAttributeFormDefault() <em>Attribute Form Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttributeFormDefault()
     * @generated
     * @ordered
     */
    protected FormChoice attributeFormDefault = ATTRIBUTE_FORM_DEFAULT_EDEFAULT;

    /**
     * This is true if the Attribute Form Default attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean attributeFormDefaultESet;

    /**
     * The default value of the '{@link #getElementFormDefault() <em>Element Form Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementFormDefault()
     * @generated
     * @ordered
     */
    protected static final FormChoice ELEMENT_FORM_DEFAULT_EDEFAULT = FormChoice.UNQUALIFIED;

    /**
     * The cached value of the '{@link #getElementFormDefault() <em>Element Form Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElementFormDefault()
     * @generated
     * @ordered
     */
    protected FormChoice elementFormDefault = ELEMENT_FORM_DEFAULT_EDEFAULT;

    /**
     * This is true if the Element Form Default attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean elementFormDefaultESet;

    /**
     * The default value of the '{@link #getDefaultAttributes() <em>Default Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultAttributes()
     * @generated
     * @ordered
     */
    protected static final QName DEFAULT_ATTRIBUTES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDefaultAttributes() <em>Default Attributes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultAttributes()
     * @generated
     * @ordered
     */
    protected QName defaultAttributes = DEFAULT_ATTRIBUTES_EDEFAULT;

    /**
     * The default value of the '{@link #getXpathDefaultNamespace() <em>Xpath Default Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXpathDefaultNamespace()
     * @generated
     * @ordered
     */
    protected static final Object XPATH_DEFAULT_NAMESPACE_EDEFAULT = XMLSchema11Factory.eINSTANCE.createFromString(XMLSchema11Package.eINSTANCE.getXpathDefaultNamespace(), "##local");

    /**
     * The cached value of the '{@link #getXpathDefaultNamespace() <em>Xpath Default Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXpathDefaultNamespace()
     * @generated
     * @ordered
     */
    protected Object xpathDefaultNamespace = XPATH_DEFAULT_NAMESPACE_EDEFAULT;

    /**
     * This is true if the Xpath Default Namespace attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xpathDefaultNamespaceESet;

    /**
     * The default value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected static final String ID_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getId()
     * @generated
     * @ordered
     */
    protected String id = ID_EDEFAULT;

    /**
     * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang()
     * @generated
     * @ordered
     */
    protected static final String LANG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLang()
     * @generated
     * @ordered
     */
    protected String lang = LANG_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SchemaTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.SCHEMA_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getComposition() {
        return (FeatureMap)getMixed().<FeatureMap.Entry>list(XMLSchema11Package.Literals.SCHEMA_TYPE__COMPOSITION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<IncludeType> getInclude() {
        return getComposition().list(XMLSchema11Package.Literals.SCHEMA_TYPE__INCLUDE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ImportType> getImport() {
        return getComposition().list(XMLSchema11Package.Literals.SCHEMA_TYPE__IMPORT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<RedefineType> getRedefine() {
        return getComposition().list(XMLSchema11Package.Literals.SCHEMA_TYPE__REDEFINE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OverrideType> getOverride() {
        return getComposition().list(XMLSchema11Package.Literals.SCHEMA_TYPE__OVERRIDE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AnnotationType> getAnnotation() {
        return getComposition().list(XMLSchema11Package.Literals.SCHEMA_TYPE__ANNOTATION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultOpenContentType getDefaultOpenContent() {
        return (DefaultOpenContentType)getMixed().get(XMLSchema11Package.Literals.SCHEMA_TYPE__DEFAULT_OPEN_CONTENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultOpenContent(DefaultOpenContentType newDefaultOpenContent) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.SCHEMA_TYPE__DEFAULT_OPEN_CONTENT, newDefaultOpenContent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AnnotationType> getAnnotation1() {
        return getMixed().list(XMLSchema11Package.Literals.SCHEMA_TYPE__ANNOTATION1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup() {
        return (FeatureMap)getMixed().<FeatureMap.Entry>list(XMLSchema11Package.Literals.SCHEMA_TYPE__GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TopLevelSimpleType> getSimpleType() {
        return getGroup().list(XMLSchema11Package.Literals.SCHEMA_TYPE__SIMPLE_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TopLevelComplexType> getComplexType() {
        return getGroup().list(XMLSchema11Package.Literals.SCHEMA_TYPE__COMPLEX_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NamedGroup> getGroup1() {
        return getGroup().list(XMLSchema11Package.Literals.SCHEMA_TYPE__GROUP1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NamedAttributeGroup> getAttributeGroup() {
        return getGroup().list(XMLSchema11Package.Literals.SCHEMA_TYPE__ATTRIBUTE_GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TopLevelElement> getElement() {
        return getGroup().list(XMLSchema11Package.Literals.SCHEMA_TYPE__ELEMENT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TopLevelAttribute> getAttribute() {
        return getGroup().list(XMLSchema11Package.Literals.SCHEMA_TYPE__ATTRIBUTE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NotationType> getNotation() {
        return getGroup().list(XMLSchema11Package.Literals.SCHEMA_TYPE__NOTATION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AnnotationType> getAnnotation2() {
        return getGroup().list(XMLSchema11Package.Literals.SCHEMA_TYPE__ANNOTATION2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTargetNamespace() {
        return targetNamespace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetNamespace(String newTargetNamespace) {
        String oldTargetNamespace = targetNamespace;
        targetNamespace = newTargetNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.SCHEMA_TYPE__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVersion() {
        return version;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(String newVersion) {
        String oldVersion = version;
        version = newVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.SCHEMA_TYPE__VERSION, oldVersion, version));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFinalDefault() {
        return finalDefault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFinalDefault(Object newFinalDefault) {
        Object oldFinalDefault = finalDefault;
        finalDefault = newFinalDefault;
        boolean oldFinalDefaultESet = finalDefaultESet;
        finalDefaultESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.SCHEMA_TYPE__FINAL_DEFAULT, oldFinalDefault, finalDefault, !oldFinalDefaultESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetFinalDefault() {
        Object oldFinalDefault = finalDefault;
        boolean oldFinalDefaultESet = finalDefaultESet;
        finalDefault = FINAL_DEFAULT_EDEFAULT;
        finalDefaultESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XMLSchema11Package.SCHEMA_TYPE__FINAL_DEFAULT, oldFinalDefault, FINAL_DEFAULT_EDEFAULT, oldFinalDefaultESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetFinalDefault() {
        return finalDefaultESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getBlockDefault() {
        return blockDefault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBlockDefault(Object newBlockDefault) {
        Object oldBlockDefault = blockDefault;
        blockDefault = newBlockDefault;
        boolean oldBlockDefaultESet = blockDefaultESet;
        blockDefaultESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.SCHEMA_TYPE__BLOCK_DEFAULT, oldBlockDefault, blockDefault, !oldBlockDefaultESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetBlockDefault() {
        Object oldBlockDefault = blockDefault;
        boolean oldBlockDefaultESet = blockDefaultESet;
        blockDefault = BLOCK_DEFAULT_EDEFAULT;
        blockDefaultESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XMLSchema11Package.SCHEMA_TYPE__BLOCK_DEFAULT, oldBlockDefault, BLOCK_DEFAULT_EDEFAULT, oldBlockDefaultESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetBlockDefault() {
        return blockDefaultESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormChoice getAttributeFormDefault() {
        return attributeFormDefault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttributeFormDefault(FormChoice newAttributeFormDefault) {
        FormChoice oldAttributeFormDefault = attributeFormDefault;
        attributeFormDefault = newAttributeFormDefault == null ? ATTRIBUTE_FORM_DEFAULT_EDEFAULT : newAttributeFormDefault;
        boolean oldAttributeFormDefaultESet = attributeFormDefaultESet;
        attributeFormDefaultESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.SCHEMA_TYPE__ATTRIBUTE_FORM_DEFAULT, oldAttributeFormDefault, attributeFormDefault, !oldAttributeFormDefaultESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAttributeFormDefault() {
        FormChoice oldAttributeFormDefault = attributeFormDefault;
        boolean oldAttributeFormDefaultESet = attributeFormDefaultESet;
        attributeFormDefault = ATTRIBUTE_FORM_DEFAULT_EDEFAULT;
        attributeFormDefaultESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XMLSchema11Package.SCHEMA_TYPE__ATTRIBUTE_FORM_DEFAULT, oldAttributeFormDefault, ATTRIBUTE_FORM_DEFAULT_EDEFAULT, oldAttributeFormDefaultESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAttributeFormDefault() {
        return attributeFormDefaultESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FormChoice getElementFormDefault() {
        return elementFormDefault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setElementFormDefault(FormChoice newElementFormDefault) {
        FormChoice oldElementFormDefault = elementFormDefault;
        elementFormDefault = newElementFormDefault == null ? ELEMENT_FORM_DEFAULT_EDEFAULT : newElementFormDefault;
        boolean oldElementFormDefaultESet = elementFormDefaultESet;
        elementFormDefaultESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.SCHEMA_TYPE__ELEMENT_FORM_DEFAULT, oldElementFormDefault, elementFormDefault, !oldElementFormDefaultESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetElementFormDefault() {
        FormChoice oldElementFormDefault = elementFormDefault;
        boolean oldElementFormDefaultESet = elementFormDefaultESet;
        elementFormDefault = ELEMENT_FORM_DEFAULT_EDEFAULT;
        elementFormDefaultESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XMLSchema11Package.SCHEMA_TYPE__ELEMENT_FORM_DEFAULT, oldElementFormDefault, ELEMENT_FORM_DEFAULT_EDEFAULT, oldElementFormDefaultESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetElementFormDefault() {
        return elementFormDefaultESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getDefaultAttributes() {
        return defaultAttributes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultAttributes(QName newDefaultAttributes) {
        QName oldDefaultAttributes = defaultAttributes;
        defaultAttributes = newDefaultAttributes;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.SCHEMA_TYPE__DEFAULT_ATTRIBUTES, oldDefaultAttributes, defaultAttributes));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getXpathDefaultNamespace() {
        return xpathDefaultNamespace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXpathDefaultNamespace(Object newXpathDefaultNamespace) {
        Object oldXpathDefaultNamespace = xpathDefaultNamespace;
        xpathDefaultNamespace = newXpathDefaultNamespace;
        boolean oldXpathDefaultNamespaceESet = xpathDefaultNamespaceESet;
        xpathDefaultNamespaceESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.SCHEMA_TYPE__XPATH_DEFAULT_NAMESPACE, oldXpathDefaultNamespace, xpathDefaultNamespace, !oldXpathDefaultNamespaceESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetXpathDefaultNamespace() {
        Object oldXpathDefaultNamespace = xpathDefaultNamespace;
        boolean oldXpathDefaultNamespaceESet = xpathDefaultNamespaceESet;
        xpathDefaultNamespace = XPATH_DEFAULT_NAMESPACE_EDEFAULT;
        xpathDefaultNamespaceESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XMLSchema11Package.SCHEMA_TYPE__XPATH_DEFAULT_NAMESPACE, oldXpathDefaultNamespace, XPATH_DEFAULT_NAMESPACE_EDEFAULT, oldXpathDefaultNamespaceESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetXpathDefaultNamespace() {
        return xpathDefaultNamespaceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getId() {
        return id;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setId(String newId) {
        String oldId = id;
        id = newId;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.SCHEMA_TYPE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLang() {
        return lang;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLang(String newLang) {
        String oldLang = lang;
        lang = newLang;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.SCHEMA_TYPE__LANG, oldLang, lang));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XMLSchema11Package.SCHEMA_TYPE__COMPOSITION:
                return ((InternalEList<?>)getComposition()).basicRemove(otherEnd, msgs);
            case XMLSchema11Package.SCHEMA_TYPE__GROUP:
                return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
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
            case XMLSchema11Package.SCHEMA_TYPE__COMPOSITION:
                if (coreType) return getComposition();
                return ((FeatureMap.Internal)getComposition()).getWrapper();
            case XMLSchema11Package.SCHEMA_TYPE__INCLUDE:
                return getInclude();
            case XMLSchema11Package.SCHEMA_TYPE__IMPORT:
                return getImport();
            case XMLSchema11Package.SCHEMA_TYPE__REDEFINE:
                return getRedefine();
            case XMLSchema11Package.SCHEMA_TYPE__OVERRIDE:
                return getOverride();
            case XMLSchema11Package.SCHEMA_TYPE__ANNOTATION:
                return getAnnotation();
            case XMLSchema11Package.SCHEMA_TYPE__DEFAULT_OPEN_CONTENT:
                return getDefaultOpenContent();
            case XMLSchema11Package.SCHEMA_TYPE__ANNOTATION1:
                return getAnnotation1();
            case XMLSchema11Package.SCHEMA_TYPE__GROUP:
                if (coreType) return getGroup();
                return ((FeatureMap.Internal)getGroup()).getWrapper();
            case XMLSchema11Package.SCHEMA_TYPE__SIMPLE_TYPE:
                return getSimpleType();
            case XMLSchema11Package.SCHEMA_TYPE__COMPLEX_TYPE:
                return getComplexType();
            case XMLSchema11Package.SCHEMA_TYPE__GROUP1:
                return getGroup1();
            case XMLSchema11Package.SCHEMA_TYPE__ATTRIBUTE_GROUP:
                return getAttributeGroup();
            case XMLSchema11Package.SCHEMA_TYPE__ELEMENT:
                return getElement();
            case XMLSchema11Package.SCHEMA_TYPE__ATTRIBUTE:
                return getAttribute();
            case XMLSchema11Package.SCHEMA_TYPE__NOTATION:
                return getNotation();
            case XMLSchema11Package.SCHEMA_TYPE__ANNOTATION2:
                return getAnnotation2();
            case XMLSchema11Package.SCHEMA_TYPE__TARGET_NAMESPACE:
                return getTargetNamespace();
            case XMLSchema11Package.SCHEMA_TYPE__VERSION:
                return getVersion();
            case XMLSchema11Package.SCHEMA_TYPE__FINAL_DEFAULT:
                return getFinalDefault();
            case XMLSchema11Package.SCHEMA_TYPE__BLOCK_DEFAULT:
                return getBlockDefault();
            case XMLSchema11Package.SCHEMA_TYPE__ATTRIBUTE_FORM_DEFAULT:
                return getAttributeFormDefault();
            case XMLSchema11Package.SCHEMA_TYPE__ELEMENT_FORM_DEFAULT:
                return getElementFormDefault();
            case XMLSchema11Package.SCHEMA_TYPE__DEFAULT_ATTRIBUTES:
                return getDefaultAttributes();
            case XMLSchema11Package.SCHEMA_TYPE__XPATH_DEFAULT_NAMESPACE:
                return getXpathDefaultNamespace();
            case XMLSchema11Package.SCHEMA_TYPE__ID:
                return getId();
            case XMLSchema11Package.SCHEMA_TYPE__LANG:
                return getLang();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XMLSchema11Package.SCHEMA_TYPE__COMPOSITION:
                ((FeatureMap.Internal)getComposition()).set(newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__INCLUDE:
                getInclude().clear();
                getInclude().addAll((Collection<? extends IncludeType>)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__IMPORT:
                getImport().clear();
                getImport().addAll((Collection<? extends ImportType>)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__REDEFINE:
                getRedefine().clear();
                getRedefine().addAll((Collection<? extends RedefineType>)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__OVERRIDE:
                getOverride().clear();
                getOverride().addAll((Collection<? extends OverrideType>)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ANNOTATION:
                getAnnotation().clear();
                getAnnotation().addAll((Collection<? extends AnnotationType>)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__DEFAULT_OPEN_CONTENT:
                setDefaultOpenContent((DefaultOpenContentType)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ANNOTATION1:
                getAnnotation1().clear();
                getAnnotation1().addAll((Collection<? extends AnnotationType>)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__GROUP:
                ((FeatureMap.Internal)getGroup()).set(newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__SIMPLE_TYPE:
                getSimpleType().clear();
                getSimpleType().addAll((Collection<? extends TopLevelSimpleType>)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__COMPLEX_TYPE:
                getComplexType().clear();
                getComplexType().addAll((Collection<? extends TopLevelComplexType>)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__GROUP1:
                getGroup1().clear();
                getGroup1().addAll((Collection<? extends NamedGroup>)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ATTRIBUTE_GROUP:
                getAttributeGroup().clear();
                getAttributeGroup().addAll((Collection<? extends NamedAttributeGroup>)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ELEMENT:
                getElement().clear();
                getElement().addAll((Collection<? extends TopLevelElement>)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ATTRIBUTE:
                getAttribute().clear();
                getAttribute().addAll((Collection<? extends TopLevelAttribute>)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__NOTATION:
                getNotation().clear();
                getNotation().addAll((Collection<? extends NotationType>)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ANNOTATION2:
                getAnnotation2().clear();
                getAnnotation2().addAll((Collection<? extends AnnotationType>)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__TARGET_NAMESPACE:
                setTargetNamespace((String)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__VERSION:
                setVersion((String)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__FINAL_DEFAULT:
                setFinalDefault(newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__BLOCK_DEFAULT:
                setBlockDefault(newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ATTRIBUTE_FORM_DEFAULT:
                setAttributeFormDefault((FormChoice)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ELEMENT_FORM_DEFAULT:
                setElementFormDefault((FormChoice)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__DEFAULT_ATTRIBUTES:
                setDefaultAttributes((QName)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__XPATH_DEFAULT_NAMESPACE:
                setXpathDefaultNamespace(newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ID:
                setId((String)newValue);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__LANG:
                setLang((String)newValue);
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
            case XMLSchema11Package.SCHEMA_TYPE__COMPOSITION:
                getComposition().clear();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__INCLUDE:
                getInclude().clear();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__IMPORT:
                getImport().clear();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__REDEFINE:
                getRedefine().clear();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__OVERRIDE:
                getOverride().clear();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ANNOTATION:
                getAnnotation().clear();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__DEFAULT_OPEN_CONTENT:
                setDefaultOpenContent((DefaultOpenContentType)null);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ANNOTATION1:
                getAnnotation1().clear();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__GROUP:
                getGroup().clear();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__SIMPLE_TYPE:
                getSimpleType().clear();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__COMPLEX_TYPE:
                getComplexType().clear();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__GROUP1:
                getGroup1().clear();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ATTRIBUTE_GROUP:
                getAttributeGroup().clear();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ELEMENT:
                getElement().clear();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ATTRIBUTE:
                getAttribute().clear();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__NOTATION:
                getNotation().clear();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ANNOTATION2:
                getAnnotation2().clear();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__TARGET_NAMESPACE:
                setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__VERSION:
                setVersion(VERSION_EDEFAULT);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__FINAL_DEFAULT:
                unsetFinalDefault();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__BLOCK_DEFAULT:
                unsetBlockDefault();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ATTRIBUTE_FORM_DEFAULT:
                unsetAttributeFormDefault();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ELEMENT_FORM_DEFAULT:
                unsetElementFormDefault();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__DEFAULT_ATTRIBUTES:
                setDefaultAttributes(DEFAULT_ATTRIBUTES_EDEFAULT);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__XPATH_DEFAULT_NAMESPACE:
                unsetXpathDefaultNamespace();
                return;
            case XMLSchema11Package.SCHEMA_TYPE__ID:
                setId(ID_EDEFAULT);
                return;
            case XMLSchema11Package.SCHEMA_TYPE__LANG:
                setLang(LANG_EDEFAULT);
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
            case XMLSchema11Package.SCHEMA_TYPE__COMPOSITION:
                return !getComposition().isEmpty();
            case XMLSchema11Package.SCHEMA_TYPE__INCLUDE:
                return !getInclude().isEmpty();
            case XMLSchema11Package.SCHEMA_TYPE__IMPORT:
                return !getImport().isEmpty();
            case XMLSchema11Package.SCHEMA_TYPE__REDEFINE:
                return !getRedefine().isEmpty();
            case XMLSchema11Package.SCHEMA_TYPE__OVERRIDE:
                return !getOverride().isEmpty();
            case XMLSchema11Package.SCHEMA_TYPE__ANNOTATION:
                return !getAnnotation().isEmpty();
            case XMLSchema11Package.SCHEMA_TYPE__DEFAULT_OPEN_CONTENT:
                return getDefaultOpenContent() != null;
            case XMLSchema11Package.SCHEMA_TYPE__ANNOTATION1:
                return !getAnnotation1().isEmpty();
            case XMLSchema11Package.SCHEMA_TYPE__GROUP:
                return !getGroup().isEmpty();
            case XMLSchema11Package.SCHEMA_TYPE__SIMPLE_TYPE:
                return !getSimpleType().isEmpty();
            case XMLSchema11Package.SCHEMA_TYPE__COMPLEX_TYPE:
                return !getComplexType().isEmpty();
            case XMLSchema11Package.SCHEMA_TYPE__GROUP1:
                return !getGroup1().isEmpty();
            case XMLSchema11Package.SCHEMA_TYPE__ATTRIBUTE_GROUP:
                return !getAttributeGroup().isEmpty();
            case XMLSchema11Package.SCHEMA_TYPE__ELEMENT:
                return !getElement().isEmpty();
            case XMLSchema11Package.SCHEMA_TYPE__ATTRIBUTE:
                return !getAttribute().isEmpty();
            case XMLSchema11Package.SCHEMA_TYPE__NOTATION:
                return !getNotation().isEmpty();
            case XMLSchema11Package.SCHEMA_TYPE__ANNOTATION2:
                return !getAnnotation2().isEmpty();
            case XMLSchema11Package.SCHEMA_TYPE__TARGET_NAMESPACE:
                return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
            case XMLSchema11Package.SCHEMA_TYPE__VERSION:
                return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
            case XMLSchema11Package.SCHEMA_TYPE__FINAL_DEFAULT:
                return isSetFinalDefault();
            case XMLSchema11Package.SCHEMA_TYPE__BLOCK_DEFAULT:
                return isSetBlockDefault();
            case XMLSchema11Package.SCHEMA_TYPE__ATTRIBUTE_FORM_DEFAULT:
                return isSetAttributeFormDefault();
            case XMLSchema11Package.SCHEMA_TYPE__ELEMENT_FORM_DEFAULT:
                return isSetElementFormDefault();
            case XMLSchema11Package.SCHEMA_TYPE__DEFAULT_ATTRIBUTES:
                return DEFAULT_ATTRIBUTES_EDEFAULT == null ? defaultAttributes != null : !DEFAULT_ATTRIBUTES_EDEFAULT.equals(defaultAttributes);
            case XMLSchema11Package.SCHEMA_TYPE__XPATH_DEFAULT_NAMESPACE:
                return isSetXpathDefaultNamespace();
            case XMLSchema11Package.SCHEMA_TYPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
            case XMLSchema11Package.SCHEMA_TYPE__LANG:
                return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
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
        result.append(" (targetNamespace: ");
        result.append(targetNamespace);
        result.append(", version: ");
        result.append(version);
        result.append(", finalDefault: ");
        if (finalDefaultESet) result.append(finalDefault); else result.append("<unset>");
        result.append(", blockDefault: ");
        if (blockDefaultESet) result.append(blockDefault); else result.append("<unset>");
        result.append(", attributeFormDefault: ");
        if (attributeFormDefaultESet) result.append(attributeFormDefault); else result.append("<unset>");
        result.append(", elementFormDefault: ");
        if (elementFormDefaultESet) result.append(elementFormDefault); else result.append("<unset>");
        result.append(", defaultAttributes: ");
        result.append(defaultAttributes);
        result.append(", xpathDefaultNamespace: ");
        if (xpathDefaultNamespaceESet) result.append(xpathDefaultNamespace); else result.append("<unset>");
        result.append(", id: ");
        result.append(id);
        result.append(", lang: ");
        result.append(lang);
        result.append(')');
        return result.toString();
    }

} //SchemaTypeImpl
