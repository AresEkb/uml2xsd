/**
 */
package org.w3._2001.xml.schema.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.w3._2001.xml.schema.All;
import org.w3._2001.xml.schema.AnyAttributeType;
import org.w3._2001.xml.schema.Assertion;
import org.w3._2001.xml.schema.Attribute;
import org.w3._2001.xml.schema.AttributeGroupRef;
import org.w3._2001.xml.schema.ExplicitGroup;
import org.w3._2001.xml.schema.GroupRef;
import org.w3._2001.xml.schema.LocalSimpleType;
import org.w3._2001.xml.schema.OpenContentType;
import org.w3._2001.xml.schema.RestrictionType;
import org.w3._2001.xml.schema.SchemaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restriction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getOpenContent <em>Open Content</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getAll <em>All</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getFacetGroup <em>Facet Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getFacet <em>Facet</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getGroup2 <em>Group2</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getAssert <em>Assert</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RestrictionTypeImpl#getBase <em>Base</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RestrictionTypeImpl extends AnnotatedImpl implements RestrictionType {
    /**
     * The cached value of the '{@link #getOpenContent() <em>Open Content</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpenContent()
     * @generated
     * @ordered
     */
    protected OpenContentType openContent;

    /**
     * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup()
     * @generated
     * @ordered
     */
    protected GroupRef group;

    /**
     * The cached value of the '{@link #getAll() <em>All</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAll()
     * @generated
     * @ordered
     */
    protected All all;

    /**
     * The cached value of the '{@link #getChoice() <em>Choice</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getChoice()
     * @generated
     * @ordered
     */
    protected ExplicitGroup choice;

    /**
     * The cached value of the '{@link #getSequence() <em>Sequence</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequence()
     * @generated
     * @ordered
     */
    protected ExplicitGroup sequence;

    /**
     * The cached value of the '{@link #getSimpleType() <em>Simple Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSimpleType()
     * @generated
     * @ordered
     */
    protected LocalSimpleType simpleType;

    /**
     * The cached value of the '{@link #getGroup1() <em>Group1</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup1()
     * @generated
     * @ordered
     */
    protected FeatureMap group1;

    /**
     * The cached value of the '{@link #getGroup2() <em>Group2</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroup2()
     * @generated
     * @ordered
     */
    protected FeatureMap group2;

    /**
     * The cached value of the '{@link #getAnyAttribute1() <em>Any Attribute1</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnyAttribute1()
     * @generated
     * @ordered
     */
    protected AnyAttributeType anyAttribute1;

    /**
     * The cached value of the '{@link #getAssert() <em>Assert</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAssert()
     * @generated
     * @ordered
     */
    protected EList<Assertion> assert_;

    /**
     * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase()
     * @generated
     * @ordered
     */
    protected static final QName BASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBase()
     * @generated
     * @ordered
     */
    protected QName base = BASE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RestrictionTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.RESTRICTION_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpenContentType getOpenContent() {
        return openContent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOpenContent(OpenContentType newOpenContent, NotificationChain msgs) {
        OpenContentType oldOpenContent = openContent;
        openContent = newOpenContent;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.RESTRICTION_TYPE__OPEN_CONTENT, oldOpenContent, newOpenContent);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOpenContent(OpenContentType newOpenContent) {
        if (newOpenContent != openContent) {
            NotificationChain msgs = null;
            if (openContent != null)
                msgs = ((InternalEObject)openContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.RESTRICTION_TYPE__OPEN_CONTENT, null, msgs);
            if (newOpenContent != null)
                msgs = ((InternalEObject)newOpenContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.RESTRICTION_TYPE__OPEN_CONTENT, null, msgs);
            msgs = basicSetOpenContent(newOpenContent, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.RESTRICTION_TYPE__OPEN_CONTENT, newOpenContent, newOpenContent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GroupRef getGroup() {
        return group;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGroup(GroupRef newGroup, NotificationChain msgs) {
        GroupRef oldGroup = group;
        group = newGroup;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.RESTRICTION_TYPE__GROUP, oldGroup, newGroup);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGroup(GroupRef newGroup) {
        if (newGroup != group) {
            NotificationChain msgs = null;
            if (group != null)
                msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.RESTRICTION_TYPE__GROUP, null, msgs);
            if (newGroup != null)
                msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.RESTRICTION_TYPE__GROUP, null, msgs);
            msgs = basicSetGroup(newGroup, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.RESTRICTION_TYPE__GROUP, newGroup, newGroup));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public All getAll() {
        return all;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAll(All newAll, NotificationChain msgs) {
        All oldAll = all;
        all = newAll;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.RESTRICTION_TYPE__ALL, oldAll, newAll);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAll(All newAll) {
        if (newAll != all) {
            NotificationChain msgs = null;
            if (all != null)
                msgs = ((InternalEObject)all).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.RESTRICTION_TYPE__ALL, null, msgs);
            if (newAll != null)
                msgs = ((InternalEObject)newAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.RESTRICTION_TYPE__ALL, null, msgs);
            msgs = basicSetAll(newAll, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.RESTRICTION_TYPE__ALL, newAll, newAll));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExplicitGroup getChoice() {
        return choice;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetChoice(ExplicitGroup newChoice, NotificationChain msgs) {
        ExplicitGroup oldChoice = choice;
        choice = newChoice;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.RESTRICTION_TYPE__CHOICE, oldChoice, newChoice);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChoice(ExplicitGroup newChoice) {
        if (newChoice != choice) {
            NotificationChain msgs = null;
            if (choice != null)
                msgs = ((InternalEObject)choice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.RESTRICTION_TYPE__CHOICE, null, msgs);
            if (newChoice != null)
                msgs = ((InternalEObject)newChoice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.RESTRICTION_TYPE__CHOICE, null, msgs);
            msgs = basicSetChoice(newChoice, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.RESTRICTION_TYPE__CHOICE, newChoice, newChoice));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExplicitGroup getSequence() {
        return sequence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSequence(ExplicitGroup newSequence, NotificationChain msgs) {
        ExplicitGroup oldSequence = sequence;
        sequence = newSequence;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.RESTRICTION_TYPE__SEQUENCE, oldSequence, newSequence);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSequence(ExplicitGroup newSequence) {
        if (newSequence != sequence) {
            NotificationChain msgs = null;
            if (sequence != null)
                msgs = ((InternalEObject)sequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.RESTRICTION_TYPE__SEQUENCE, null, msgs);
            if (newSequence != null)
                msgs = ((InternalEObject)newSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.RESTRICTION_TYPE__SEQUENCE, null, msgs);
            msgs = basicSetSequence(newSequence, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.RESTRICTION_TYPE__SEQUENCE, newSequence, newSequence));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LocalSimpleType getSimpleType() {
        return simpleType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSimpleType(LocalSimpleType newSimpleType, NotificationChain msgs) {
        LocalSimpleType oldSimpleType = simpleType;
        simpleType = newSimpleType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.RESTRICTION_TYPE__SIMPLE_TYPE, oldSimpleType, newSimpleType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSimpleType(LocalSimpleType newSimpleType) {
        if (newSimpleType != simpleType) {
            NotificationChain msgs = null;
            if (simpleType != null)
                msgs = ((InternalEObject)simpleType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.RESTRICTION_TYPE__SIMPLE_TYPE, null, msgs);
            if (newSimpleType != null)
                msgs = ((InternalEObject)newSimpleType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.RESTRICTION_TYPE__SIMPLE_TYPE, null, msgs);
            msgs = basicSetSimpleType(newSimpleType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.RESTRICTION_TYPE__SIMPLE_TYPE, newSimpleType, newSimpleType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup1() {
        if (group1 == null) {
            group1 = new BasicFeatureMap(this, SchemaPackage.RESTRICTION_TYPE__GROUP1);
        }
        return group1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getFacetGroup() {
        return (FeatureMap)getGroup1().<FeatureMap.Entry>list(SchemaPackage.Literals.RESTRICTION_TYPE__FACET_GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EObject> getFacet() {
        return getFacetGroup().list(SchemaPackage.Literals.RESTRICTION_TYPE__FACET);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getAny() {
        return (FeatureMap)getGroup1().<FeatureMap.Entry>list(SchemaPackage.Literals.RESTRICTION_TYPE__ANY);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getGroup2() {
        if (group2 == null) {
            group2 = new BasicFeatureMap(this, SchemaPackage.RESTRICTION_TYPE__GROUP2);
        }
        return group2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Attribute> getAttribute() {
        return getGroup2().list(SchemaPackage.Literals.RESTRICTION_TYPE__ATTRIBUTE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AttributeGroupRef> getAttributeGroup() {
        return getGroup2().list(SchemaPackage.Literals.RESTRICTION_TYPE__ATTRIBUTE_GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyAttributeType getAnyAttribute1() {
        return anyAttribute1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAnyAttribute1(AnyAttributeType newAnyAttribute1, NotificationChain msgs) {
        AnyAttributeType oldAnyAttribute1 = anyAttribute1;
        anyAttribute1 = newAnyAttribute1;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.RESTRICTION_TYPE__ANY_ATTRIBUTE1, oldAnyAttribute1, newAnyAttribute1);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnyAttribute1(AnyAttributeType newAnyAttribute1) {
        if (newAnyAttribute1 != anyAttribute1) {
            NotificationChain msgs = null;
            if (anyAttribute1 != null)
                msgs = ((InternalEObject)anyAttribute1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.RESTRICTION_TYPE__ANY_ATTRIBUTE1, null, msgs);
            if (newAnyAttribute1 != null)
                msgs = ((InternalEObject)newAnyAttribute1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.RESTRICTION_TYPE__ANY_ATTRIBUTE1, null, msgs);
            msgs = basicSetAnyAttribute1(newAnyAttribute1, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.RESTRICTION_TYPE__ANY_ATTRIBUTE1, newAnyAttribute1, newAnyAttribute1));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Assertion> getAssert() {
        if (assert_ == null) {
            assert_ = new EObjectContainmentEList<Assertion>(Assertion.class, this, SchemaPackage.RESTRICTION_TYPE__ASSERT);
        }
        return assert_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QName getBase() {
        return base;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBase(QName newBase) {
        QName oldBase = base;
        base = newBase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.RESTRICTION_TYPE__BASE, oldBase, base));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SchemaPackage.RESTRICTION_TYPE__OPEN_CONTENT:
                return basicSetOpenContent(null, msgs);
            case SchemaPackage.RESTRICTION_TYPE__GROUP:
                return basicSetGroup(null, msgs);
            case SchemaPackage.RESTRICTION_TYPE__ALL:
                return basicSetAll(null, msgs);
            case SchemaPackage.RESTRICTION_TYPE__CHOICE:
                return basicSetChoice(null, msgs);
            case SchemaPackage.RESTRICTION_TYPE__SEQUENCE:
                return basicSetSequence(null, msgs);
            case SchemaPackage.RESTRICTION_TYPE__SIMPLE_TYPE:
                return basicSetSimpleType(null, msgs);
            case SchemaPackage.RESTRICTION_TYPE__GROUP1:
                return ((InternalEList<?>)getGroup1()).basicRemove(otherEnd, msgs);
            case SchemaPackage.RESTRICTION_TYPE__FACET_GROUP:
                return ((InternalEList<?>)getFacetGroup()).basicRemove(otherEnd, msgs);
            case SchemaPackage.RESTRICTION_TYPE__FACET:
                return ((InternalEList<?>)getFacet()).basicRemove(otherEnd, msgs);
            case SchemaPackage.RESTRICTION_TYPE__ANY:
                return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
            case SchemaPackage.RESTRICTION_TYPE__GROUP2:
                return ((InternalEList<?>)getGroup2()).basicRemove(otherEnd, msgs);
            case SchemaPackage.RESTRICTION_TYPE__ATTRIBUTE:
                return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
            case SchemaPackage.RESTRICTION_TYPE__ATTRIBUTE_GROUP:
                return ((InternalEList<?>)getAttributeGroup()).basicRemove(otherEnd, msgs);
            case SchemaPackage.RESTRICTION_TYPE__ANY_ATTRIBUTE1:
                return basicSetAnyAttribute1(null, msgs);
            case SchemaPackage.RESTRICTION_TYPE__ASSERT:
                return ((InternalEList<?>)getAssert()).basicRemove(otherEnd, msgs);
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
            case SchemaPackage.RESTRICTION_TYPE__OPEN_CONTENT:
                return getOpenContent();
            case SchemaPackage.RESTRICTION_TYPE__GROUP:
                return getGroup();
            case SchemaPackage.RESTRICTION_TYPE__ALL:
                return getAll();
            case SchemaPackage.RESTRICTION_TYPE__CHOICE:
                return getChoice();
            case SchemaPackage.RESTRICTION_TYPE__SEQUENCE:
                return getSequence();
            case SchemaPackage.RESTRICTION_TYPE__SIMPLE_TYPE:
                return getSimpleType();
            case SchemaPackage.RESTRICTION_TYPE__GROUP1:
                if (coreType) return getGroup1();
                return ((FeatureMap.Internal)getGroup1()).getWrapper();
            case SchemaPackage.RESTRICTION_TYPE__FACET_GROUP:
                if (coreType) return getFacetGroup();
                return ((FeatureMap.Internal)getFacetGroup()).getWrapper();
            case SchemaPackage.RESTRICTION_TYPE__FACET:
                return getFacet();
            case SchemaPackage.RESTRICTION_TYPE__ANY:
                if (coreType) return getAny();
                return ((FeatureMap.Internal)getAny()).getWrapper();
            case SchemaPackage.RESTRICTION_TYPE__GROUP2:
                if (coreType) return getGroup2();
                return ((FeatureMap.Internal)getGroup2()).getWrapper();
            case SchemaPackage.RESTRICTION_TYPE__ATTRIBUTE:
                return getAttribute();
            case SchemaPackage.RESTRICTION_TYPE__ATTRIBUTE_GROUP:
                return getAttributeGroup();
            case SchemaPackage.RESTRICTION_TYPE__ANY_ATTRIBUTE1:
                return getAnyAttribute1();
            case SchemaPackage.RESTRICTION_TYPE__ASSERT:
                return getAssert();
            case SchemaPackage.RESTRICTION_TYPE__BASE:
                return getBase();
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
            case SchemaPackage.RESTRICTION_TYPE__OPEN_CONTENT:
                setOpenContent((OpenContentType)newValue);
                return;
            case SchemaPackage.RESTRICTION_TYPE__GROUP:
                setGroup((GroupRef)newValue);
                return;
            case SchemaPackage.RESTRICTION_TYPE__ALL:
                setAll((All)newValue);
                return;
            case SchemaPackage.RESTRICTION_TYPE__CHOICE:
                setChoice((ExplicitGroup)newValue);
                return;
            case SchemaPackage.RESTRICTION_TYPE__SEQUENCE:
                setSequence((ExplicitGroup)newValue);
                return;
            case SchemaPackage.RESTRICTION_TYPE__SIMPLE_TYPE:
                setSimpleType((LocalSimpleType)newValue);
                return;
            case SchemaPackage.RESTRICTION_TYPE__GROUP1:
                ((FeatureMap.Internal)getGroup1()).set(newValue);
                return;
            case SchemaPackage.RESTRICTION_TYPE__FACET_GROUP:
                ((FeatureMap.Internal)getFacetGroup()).set(newValue);
                return;
            case SchemaPackage.RESTRICTION_TYPE__ANY:
                ((FeatureMap.Internal)getAny()).set(newValue);
                return;
            case SchemaPackage.RESTRICTION_TYPE__GROUP2:
                ((FeatureMap.Internal)getGroup2()).set(newValue);
                return;
            case SchemaPackage.RESTRICTION_TYPE__ATTRIBUTE:
                getAttribute().clear();
                getAttribute().addAll((Collection<? extends Attribute>)newValue);
                return;
            case SchemaPackage.RESTRICTION_TYPE__ATTRIBUTE_GROUP:
                getAttributeGroup().clear();
                getAttributeGroup().addAll((Collection<? extends AttributeGroupRef>)newValue);
                return;
            case SchemaPackage.RESTRICTION_TYPE__ANY_ATTRIBUTE1:
                setAnyAttribute1((AnyAttributeType)newValue);
                return;
            case SchemaPackage.RESTRICTION_TYPE__ASSERT:
                getAssert().clear();
                getAssert().addAll((Collection<? extends Assertion>)newValue);
                return;
            case SchemaPackage.RESTRICTION_TYPE__BASE:
                setBase((QName)newValue);
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
            case SchemaPackage.RESTRICTION_TYPE__OPEN_CONTENT:
                setOpenContent((OpenContentType)null);
                return;
            case SchemaPackage.RESTRICTION_TYPE__GROUP:
                setGroup((GroupRef)null);
                return;
            case SchemaPackage.RESTRICTION_TYPE__ALL:
                setAll((All)null);
                return;
            case SchemaPackage.RESTRICTION_TYPE__CHOICE:
                setChoice((ExplicitGroup)null);
                return;
            case SchemaPackage.RESTRICTION_TYPE__SEQUENCE:
                setSequence((ExplicitGroup)null);
                return;
            case SchemaPackage.RESTRICTION_TYPE__SIMPLE_TYPE:
                setSimpleType((LocalSimpleType)null);
                return;
            case SchemaPackage.RESTRICTION_TYPE__GROUP1:
                getGroup1().clear();
                return;
            case SchemaPackage.RESTRICTION_TYPE__FACET_GROUP:
                getFacetGroup().clear();
                return;
            case SchemaPackage.RESTRICTION_TYPE__ANY:
                getAny().clear();
                return;
            case SchemaPackage.RESTRICTION_TYPE__GROUP2:
                getGroup2().clear();
                return;
            case SchemaPackage.RESTRICTION_TYPE__ATTRIBUTE:
                getAttribute().clear();
                return;
            case SchemaPackage.RESTRICTION_TYPE__ATTRIBUTE_GROUP:
                getAttributeGroup().clear();
                return;
            case SchemaPackage.RESTRICTION_TYPE__ANY_ATTRIBUTE1:
                setAnyAttribute1((AnyAttributeType)null);
                return;
            case SchemaPackage.RESTRICTION_TYPE__ASSERT:
                getAssert().clear();
                return;
            case SchemaPackage.RESTRICTION_TYPE__BASE:
                setBase(BASE_EDEFAULT);
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
            case SchemaPackage.RESTRICTION_TYPE__OPEN_CONTENT:
                return openContent != null;
            case SchemaPackage.RESTRICTION_TYPE__GROUP:
                return group != null;
            case SchemaPackage.RESTRICTION_TYPE__ALL:
                return all != null;
            case SchemaPackage.RESTRICTION_TYPE__CHOICE:
                return choice != null;
            case SchemaPackage.RESTRICTION_TYPE__SEQUENCE:
                return sequence != null;
            case SchemaPackage.RESTRICTION_TYPE__SIMPLE_TYPE:
                return simpleType != null;
            case SchemaPackage.RESTRICTION_TYPE__GROUP1:
                return group1 != null && !group1.isEmpty();
            case SchemaPackage.RESTRICTION_TYPE__FACET_GROUP:
                return !getFacetGroup().isEmpty();
            case SchemaPackage.RESTRICTION_TYPE__FACET:
                return !getFacet().isEmpty();
            case SchemaPackage.RESTRICTION_TYPE__ANY:
                return !getAny().isEmpty();
            case SchemaPackage.RESTRICTION_TYPE__GROUP2:
                return group2 != null && !group2.isEmpty();
            case SchemaPackage.RESTRICTION_TYPE__ATTRIBUTE:
                return !getAttribute().isEmpty();
            case SchemaPackage.RESTRICTION_TYPE__ATTRIBUTE_GROUP:
                return !getAttributeGroup().isEmpty();
            case SchemaPackage.RESTRICTION_TYPE__ANY_ATTRIBUTE1:
                return anyAttribute1 != null;
            case SchemaPackage.RESTRICTION_TYPE__ASSERT:
                return assert_ != null && !assert_.isEmpty();
            case SchemaPackage.RESTRICTION_TYPE__BASE:
                return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
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
        result.append(" (group1: ");
        result.append(group1);
        result.append(", group2: ");
        result.append(group2);
        result.append(", base: ");
        result.append(base);
        result.append(')');
        return result.toString();
    }

} //RestrictionTypeImpl
