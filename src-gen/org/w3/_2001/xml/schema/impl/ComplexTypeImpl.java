/**
 */
package org.w3._2001.xml.schema.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3._2001.xml.schema.All;
import org.w3._2001.xml.schema.AnyAttributeType;
import org.w3._2001.xml.schema.Assertion;
import org.w3._2001.xml.schema.Attribute;
import org.w3._2001.xml.schema.AttributeGroupRef;
import org.w3._2001.xml.schema.ComplexContentType;
import org.w3._2001.xml.schema.ComplexType;
import org.w3._2001.xml.schema.ExplicitGroup;
import org.w3._2001.xml.schema.GroupRef;
import org.w3._2001.xml.schema.OpenContentType;
import org.w3._2001.xml.schema.SimpleContentType;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#getSimpleContent <em>Simple Content</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#getComplexContent <em>Complex Content</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#getOpenContent <em>Open Content</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#getAll <em>All</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#getAssert <em>Assert</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#isMixed1 <em>Mixed1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.ComplexTypeImpl#isDefaultAttributesApply <em>Default Attributes Apply</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComplexTypeImpl extends AnnotatedImpl implements ComplexType {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #isMixed1() <em>Mixed1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMixed1()
     * @generated
     * @ordered
     */
    protected static final boolean MIXED1_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isMixed1() <em>Mixed1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isMixed1()
     * @generated
     * @ordered
     */
    protected boolean mixed1 = MIXED1_EDEFAULT;

    /**
     * This is true if the Mixed1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mixed1ESet;

    /**
     * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAbstract()
     * @generated
     * @ordered
     */
    protected static final boolean ABSTRACT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAbstract()
     * @generated
     * @ordered
     */
    protected boolean abstract_ = ABSTRACT_EDEFAULT;

    /**
     * This is true if the Abstract attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean abstractESet;

    /**
     * The default value of the '{@link #getFinal() <em>Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinal()
     * @generated
     * @ordered
     */
    protected static final Object FINAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFinal() <em>Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFinal()
     * @generated
     * @ordered
     */
    protected Object final_ = FINAL_EDEFAULT;

    /**
     * The default value of the '{@link #getBlock() <em>Block</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBlock()
     * @generated
     * @ordered
     */
    protected static final Object BLOCK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBlock() <em>Block</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBlock()
     * @generated
     * @ordered
     */
    protected Object block = BLOCK_EDEFAULT;

    /**
     * The default value of the '{@link #isDefaultAttributesApply() <em>Default Attributes Apply</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDefaultAttributesApply()
     * @generated
     * @ordered
     */
    protected static final boolean DEFAULT_ATTRIBUTES_APPLY_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isDefaultAttributesApply() <em>Default Attributes Apply</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isDefaultAttributesApply()
     * @generated
     * @ordered
     */
    protected boolean defaultAttributesApply = DEFAULT_ATTRIBUTES_APPLY_EDEFAULT;

    /**
     * This is true if the Default Attributes Apply attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean defaultAttributesApplyESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComplexTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.COMPLEX_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleContentType getSimpleContent() {
        return (SimpleContentType)getMixed().get(XMLSchema11Package.Literals.COMPLEX_TYPE__SIMPLE_CONTENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSimpleContent(SimpleContentType newSimpleContent) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.COMPLEX_TYPE__SIMPLE_CONTENT, newSimpleContent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComplexContentType getComplexContent() {
        return (ComplexContentType)getMixed().get(XMLSchema11Package.Literals.COMPLEX_TYPE__COMPLEX_CONTENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComplexContent(ComplexContentType newComplexContent) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.COMPLEX_TYPE__COMPLEX_CONTENT, newComplexContent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpenContentType getOpenContent() {
        return (OpenContentType)getMixed().get(XMLSchema11Package.Literals.COMPLEX_TYPE__OPEN_CONTENT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOpenContent(OpenContentType newOpenContent) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.COMPLEX_TYPE__OPEN_CONTENT, newOpenContent);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GroupRef getGroup() {
        return (GroupRef)getMixed().get(XMLSchema11Package.Literals.COMPLEX_TYPE__GROUP, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGroup(GroupRef newGroup) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.COMPLEX_TYPE__GROUP, newGroup);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public All getAll() {
        return (All)getMixed().get(XMLSchema11Package.Literals.COMPLEX_TYPE__ALL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAll(All newAll) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.COMPLEX_TYPE__ALL, newAll);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExplicitGroup getChoice() {
        return (ExplicitGroup)getMixed().get(XMLSchema11Package.Literals.COMPLEX_TYPE__CHOICE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChoice(ExplicitGroup newChoice) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.COMPLEX_TYPE__CHOICE, newChoice);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExplicitGroup getSequence() {
        return (ExplicitGroup)getMixed().get(XMLSchema11Package.Literals.COMPLEX_TYPE__SEQUENCE, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSequence(ExplicitGroup newSequence) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.COMPLEX_TYPE__SEQUENCE, newSequence);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup1() {
        return (FeatureMap)getMixed().<FeatureMap.Entry>list(XMLSchema11Package.Literals.COMPLEX_TYPE__GROUP1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Attribute> getAttribute() {
        return getGroup1().list(XMLSchema11Package.Literals.COMPLEX_TYPE__ATTRIBUTE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AttributeGroupRef> getAttributeGroup() {
        return getGroup1().list(XMLSchema11Package.Literals.COMPLEX_TYPE__ATTRIBUTE_GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyAttributeType getAnyAttribute1() {
        return (AnyAttributeType)getMixed().get(XMLSchema11Package.Literals.COMPLEX_TYPE__ANY_ATTRIBUTE1, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnyAttribute1(AnyAttributeType newAnyAttribute1) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.COMPLEX_TYPE__ANY_ATTRIBUTE1, newAnyAttribute1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Assertion> getAssert() {
        return getMixed().list(XMLSchema11Package.Literals.COMPLEX_TYPE__ASSERT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.COMPLEX_TYPE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isMixed1() {
        return mixed1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMixed1(boolean newMixed1) {
        boolean oldMixed1 = mixed1;
        mixed1 = newMixed1;
        boolean oldMixed1ESet = mixed1ESet;
        mixed1ESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.COMPLEX_TYPE__MIXED1, oldMixed1, mixed1, !oldMixed1ESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMixed1() {
        boolean oldMixed1 = mixed1;
        boolean oldMixed1ESet = mixed1ESet;
        mixed1 = MIXED1_EDEFAULT;
        mixed1ESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XMLSchema11Package.COMPLEX_TYPE__MIXED1, oldMixed1, MIXED1_EDEFAULT, oldMixed1ESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMixed1() {
        return mixed1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAbstract() {
        return abstract_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAbstract(boolean newAbstract) {
        boolean oldAbstract = abstract_;
        abstract_ = newAbstract;
        boolean oldAbstractESet = abstractESet;
        abstractESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.COMPLEX_TYPE__ABSTRACT, oldAbstract, abstract_, !oldAbstractESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAbstract() {
        boolean oldAbstract = abstract_;
        boolean oldAbstractESet = abstractESet;
        abstract_ = ABSTRACT_EDEFAULT;
        abstractESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XMLSchema11Package.COMPLEX_TYPE__ABSTRACT, oldAbstract, ABSTRACT_EDEFAULT, oldAbstractESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAbstract() {
        return abstractESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getFinal() {
        return final_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFinal(Object newFinal) {
        Object oldFinal = final_;
        final_ = newFinal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.COMPLEX_TYPE__FINAL, oldFinal, final_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getBlock() {
        return block;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBlock(Object newBlock) {
        Object oldBlock = block;
        block = newBlock;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.COMPLEX_TYPE__BLOCK, oldBlock, block));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isDefaultAttributesApply() {
        return defaultAttributesApply;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultAttributesApply(boolean newDefaultAttributesApply) {
        boolean oldDefaultAttributesApply = defaultAttributesApply;
        defaultAttributesApply = newDefaultAttributesApply;
        boolean oldDefaultAttributesApplyESet = defaultAttributesApplyESet;
        defaultAttributesApplyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.COMPLEX_TYPE__DEFAULT_ATTRIBUTES_APPLY, oldDefaultAttributesApply, defaultAttributesApply, !oldDefaultAttributesApplyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDefaultAttributesApply() {
        boolean oldDefaultAttributesApply = defaultAttributesApply;
        boolean oldDefaultAttributesApplyESet = defaultAttributesApplyESet;
        defaultAttributesApply = DEFAULT_ATTRIBUTES_APPLY_EDEFAULT;
        defaultAttributesApplyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XMLSchema11Package.COMPLEX_TYPE__DEFAULT_ATTRIBUTES_APPLY, oldDefaultAttributesApply, DEFAULT_ATTRIBUTES_APPLY_EDEFAULT, oldDefaultAttributesApplyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDefaultAttributesApply() {
        return defaultAttributesApplyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XMLSchema11Package.COMPLEX_TYPE__GROUP1:
                return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
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
            case XMLSchema11Package.COMPLEX_TYPE__SIMPLE_CONTENT:
                return getSimpleContent();
            case XMLSchema11Package.COMPLEX_TYPE__COMPLEX_CONTENT:
                return getComplexContent();
            case XMLSchema11Package.COMPLEX_TYPE__OPEN_CONTENT:
                return getOpenContent();
            case XMLSchema11Package.COMPLEX_TYPE__GROUP:
                return getGroup();
            case XMLSchema11Package.COMPLEX_TYPE__ALL:
                return getAll();
            case XMLSchema11Package.COMPLEX_TYPE__CHOICE:
                return getChoice();
            case XMLSchema11Package.COMPLEX_TYPE__SEQUENCE:
                return getSequence();
            case XMLSchema11Package.COMPLEX_TYPE__GROUP1:
                if (coreType) return getGroup1();
                return ((FeatureMap.Internal)getGroup1()).getWrapper();
            case XMLSchema11Package.COMPLEX_TYPE__ATTRIBUTE:
                return getAttribute();
            case XMLSchema11Package.COMPLEX_TYPE__ATTRIBUTE_GROUP:
                return getAttributeGroup();
            case XMLSchema11Package.COMPLEX_TYPE__ANY_ATTRIBUTE1:
                return getAnyAttribute1();
            case XMLSchema11Package.COMPLEX_TYPE__ASSERT:
                return getAssert();
            case XMLSchema11Package.COMPLEX_TYPE__NAME:
                return getName();
            case XMLSchema11Package.COMPLEX_TYPE__MIXED1:
                return isMixed1();
            case XMLSchema11Package.COMPLEX_TYPE__ABSTRACT:
                return isAbstract();
            case XMLSchema11Package.COMPLEX_TYPE__FINAL:
                return getFinal();
            case XMLSchema11Package.COMPLEX_TYPE__BLOCK:
                return getBlock();
            case XMLSchema11Package.COMPLEX_TYPE__DEFAULT_ATTRIBUTES_APPLY:
                return isDefaultAttributesApply();
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
            case XMLSchema11Package.COMPLEX_TYPE__SIMPLE_CONTENT:
                setSimpleContent((SimpleContentType)newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__COMPLEX_CONTENT:
                setComplexContent((ComplexContentType)newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__OPEN_CONTENT:
                setOpenContent((OpenContentType)newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__GROUP:
                setGroup((GroupRef)newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__ALL:
                setAll((All)newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__CHOICE:
                setChoice((ExplicitGroup)newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__SEQUENCE:
                setSequence((ExplicitGroup)newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__GROUP1:
                ((FeatureMap.Internal)getGroup1()).set(newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__ATTRIBUTE:
                getAttribute().clear();
                getAttribute().addAll((Collection<? extends Attribute>)newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__ATTRIBUTE_GROUP:
                getAttributeGroup().clear();
                getAttributeGroup().addAll((Collection<? extends AttributeGroupRef>)newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__ANY_ATTRIBUTE1:
                setAnyAttribute1((AnyAttributeType)newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__ASSERT:
                getAssert().clear();
                getAssert().addAll((Collection<? extends Assertion>)newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__NAME:
                setName((String)newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__MIXED1:
                setMixed1((Boolean)newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__ABSTRACT:
                setAbstract((Boolean)newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__FINAL:
                setFinal(newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__BLOCK:
                setBlock(newValue);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__DEFAULT_ATTRIBUTES_APPLY:
                setDefaultAttributesApply((Boolean)newValue);
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
            case XMLSchema11Package.COMPLEX_TYPE__SIMPLE_CONTENT:
                setSimpleContent((SimpleContentType)null);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__COMPLEX_CONTENT:
                setComplexContent((ComplexContentType)null);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__OPEN_CONTENT:
                setOpenContent((OpenContentType)null);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__GROUP:
                setGroup((GroupRef)null);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__ALL:
                setAll((All)null);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__CHOICE:
                setChoice((ExplicitGroup)null);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__SEQUENCE:
                setSequence((ExplicitGroup)null);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__GROUP1:
                getGroup1().clear();
                return;
            case XMLSchema11Package.COMPLEX_TYPE__ATTRIBUTE:
                getAttribute().clear();
                return;
            case XMLSchema11Package.COMPLEX_TYPE__ATTRIBUTE_GROUP:
                getAttributeGroup().clear();
                return;
            case XMLSchema11Package.COMPLEX_TYPE__ANY_ATTRIBUTE1:
                setAnyAttribute1((AnyAttributeType)null);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__ASSERT:
                getAssert().clear();
                return;
            case XMLSchema11Package.COMPLEX_TYPE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__MIXED1:
                unsetMixed1();
                return;
            case XMLSchema11Package.COMPLEX_TYPE__ABSTRACT:
                unsetAbstract();
                return;
            case XMLSchema11Package.COMPLEX_TYPE__FINAL:
                setFinal(FINAL_EDEFAULT);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__BLOCK:
                setBlock(BLOCK_EDEFAULT);
                return;
            case XMLSchema11Package.COMPLEX_TYPE__DEFAULT_ATTRIBUTES_APPLY:
                unsetDefaultAttributesApply();
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
            case XMLSchema11Package.COMPLEX_TYPE__SIMPLE_CONTENT:
                return getSimpleContent() != null;
            case XMLSchema11Package.COMPLEX_TYPE__COMPLEX_CONTENT:
                return getComplexContent() != null;
            case XMLSchema11Package.COMPLEX_TYPE__OPEN_CONTENT:
                return getOpenContent() != null;
            case XMLSchema11Package.COMPLEX_TYPE__GROUP:
                return getGroup() != null;
            case XMLSchema11Package.COMPLEX_TYPE__ALL:
                return getAll() != null;
            case XMLSchema11Package.COMPLEX_TYPE__CHOICE:
                return getChoice() != null;
            case XMLSchema11Package.COMPLEX_TYPE__SEQUENCE:
                return getSequence() != null;
            case XMLSchema11Package.COMPLEX_TYPE__GROUP1:
                return !getGroup1().isEmpty();
            case XMLSchema11Package.COMPLEX_TYPE__ATTRIBUTE:
                return !getAttribute().isEmpty();
            case XMLSchema11Package.COMPLEX_TYPE__ATTRIBUTE_GROUP:
                return !getAttributeGroup().isEmpty();
            case XMLSchema11Package.COMPLEX_TYPE__ANY_ATTRIBUTE1:
                return getAnyAttribute1() != null;
            case XMLSchema11Package.COMPLEX_TYPE__ASSERT:
                return !getAssert().isEmpty();
            case XMLSchema11Package.COMPLEX_TYPE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case XMLSchema11Package.COMPLEX_TYPE__MIXED1:
                return isSetMixed1();
            case XMLSchema11Package.COMPLEX_TYPE__ABSTRACT:
                return isSetAbstract();
            case XMLSchema11Package.COMPLEX_TYPE__FINAL:
                return FINAL_EDEFAULT == null ? final_ != null : !FINAL_EDEFAULT.equals(final_);
            case XMLSchema11Package.COMPLEX_TYPE__BLOCK:
                return BLOCK_EDEFAULT == null ? block != null : !BLOCK_EDEFAULT.equals(block);
            case XMLSchema11Package.COMPLEX_TYPE__DEFAULT_ATTRIBUTES_APPLY:
                return isSetDefaultAttributesApply();
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
        result.append(" (name: ");
        result.append(name);
        result.append(", mixed1: ");
        if (mixed1ESet) result.append(mixed1); else result.append("<unset>");
        result.append(", abstract: ");
        if (abstractESet) result.append(abstract_); else result.append("<unset>");
        result.append(", final: ");
        result.append(final_);
        result.append(", block: ");
        result.append(block);
        result.append(", defaultAttributesApply: ");
        if (defaultAttributesApplyESet) result.append(defaultAttributesApply); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //ComplexTypeImpl
