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
import org.w3._2001.xml.schema.AnnotationType;
import org.w3._2001.xml.schema.NamedAttributeGroup;
import org.w3._2001.xml.schema.NamedGroup;
import org.w3._2001.xml.schema.NotationType;
import org.w3._2001.xml.schema.OverrideType;
import org.w3._2001.xml.schema.TopLevelAttribute;
import org.w3._2001.xml.schema.TopLevelComplexType;
import org.w3._2001.xml.schema.TopLevelElement;
import org.w3._2001.xml.schema.TopLevelSimpleType;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Override Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.OverrideTypeImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.OverrideTypeImpl#getSchemaTop <em>Schema Top</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.OverrideTypeImpl#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.OverrideTypeImpl#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.OverrideTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.OverrideTypeImpl#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.OverrideTypeImpl#getElement <em>Element</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.OverrideTypeImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.OverrideTypeImpl#getNotation <em>Notation</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.OverrideTypeImpl#getSchemaLocation <em>Schema Location</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.OverrideTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OverrideTypeImpl extends OpenAttrsImpl implements OverrideType {
    /**
     * The default value of the '{@link #getSchemaLocation() <em>Schema Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchemaLocation()
     * @generated
     * @ordered
     */
    protected static final String SCHEMA_LOCATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSchemaLocation() <em>Schema Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSchemaLocation()
     * @generated
     * @ordered
     */
    protected String schemaLocation = SCHEMA_LOCATION_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OverrideTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.OVERRIDE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnnotationType getAnnotation() {
        return (AnnotationType)getMixed().get(XMLSchema11Package.Literals.OVERRIDE_TYPE__ANNOTATION, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnnotation(AnnotationType newAnnotation) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.OVERRIDE_TYPE__ANNOTATION, newAnnotation);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FeatureMap getSchemaTop() {
        return (FeatureMap)getMixed().<FeatureMap.Entry>list(XMLSchema11Package.Literals.OVERRIDE_TYPE__SCHEMA_TOP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TopLevelSimpleType> getSimpleType() {
        return getSchemaTop().list(XMLSchema11Package.Literals.OVERRIDE_TYPE__SIMPLE_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TopLevelComplexType> getComplexType() {
        return getSchemaTop().list(XMLSchema11Package.Literals.OVERRIDE_TYPE__COMPLEX_TYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NamedGroup> getGroup() {
        return getSchemaTop().list(XMLSchema11Package.Literals.OVERRIDE_TYPE__GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NamedAttributeGroup> getAttributeGroup() {
        return getSchemaTop().list(XMLSchema11Package.Literals.OVERRIDE_TYPE__ATTRIBUTE_GROUP);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TopLevelElement> getElement() {
        return getSchemaTop().list(XMLSchema11Package.Literals.OVERRIDE_TYPE__ELEMENT);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TopLevelAttribute> getAttribute() {
        return getSchemaTop().list(XMLSchema11Package.Literals.OVERRIDE_TYPE__ATTRIBUTE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<NotationType> getNotation() {
        return getSchemaTop().list(XMLSchema11Package.Literals.OVERRIDE_TYPE__NOTATION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSchemaLocation() {
        return schemaLocation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSchemaLocation(String newSchemaLocation) {
        String oldSchemaLocation = schemaLocation;
        schemaLocation = newSchemaLocation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.OVERRIDE_TYPE__SCHEMA_LOCATION, oldSchemaLocation, schemaLocation));
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
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.OVERRIDE_TYPE__ID, oldId, id));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case XMLSchema11Package.OVERRIDE_TYPE__SCHEMA_TOP:
                return ((InternalEList<?>)getSchemaTop()).basicRemove(otherEnd, msgs);
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
            case XMLSchema11Package.OVERRIDE_TYPE__ANNOTATION:
                return getAnnotation();
            case XMLSchema11Package.OVERRIDE_TYPE__SCHEMA_TOP:
                if (coreType) return getSchemaTop();
                return ((FeatureMap.Internal)getSchemaTop()).getWrapper();
            case XMLSchema11Package.OVERRIDE_TYPE__SIMPLE_TYPE:
                return getSimpleType();
            case XMLSchema11Package.OVERRIDE_TYPE__COMPLEX_TYPE:
                return getComplexType();
            case XMLSchema11Package.OVERRIDE_TYPE__GROUP:
                return getGroup();
            case XMLSchema11Package.OVERRIDE_TYPE__ATTRIBUTE_GROUP:
                return getAttributeGroup();
            case XMLSchema11Package.OVERRIDE_TYPE__ELEMENT:
                return getElement();
            case XMLSchema11Package.OVERRIDE_TYPE__ATTRIBUTE:
                return getAttribute();
            case XMLSchema11Package.OVERRIDE_TYPE__NOTATION:
                return getNotation();
            case XMLSchema11Package.OVERRIDE_TYPE__SCHEMA_LOCATION:
                return getSchemaLocation();
            case XMLSchema11Package.OVERRIDE_TYPE__ID:
                return getId();
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
            case XMLSchema11Package.OVERRIDE_TYPE__ANNOTATION:
                setAnnotation((AnnotationType)newValue);
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__SCHEMA_TOP:
                ((FeatureMap.Internal)getSchemaTop()).set(newValue);
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__SIMPLE_TYPE:
                getSimpleType().clear();
                getSimpleType().addAll((Collection<? extends TopLevelSimpleType>)newValue);
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__COMPLEX_TYPE:
                getComplexType().clear();
                getComplexType().addAll((Collection<? extends TopLevelComplexType>)newValue);
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__GROUP:
                getGroup().clear();
                getGroup().addAll((Collection<? extends NamedGroup>)newValue);
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__ATTRIBUTE_GROUP:
                getAttributeGroup().clear();
                getAttributeGroup().addAll((Collection<? extends NamedAttributeGroup>)newValue);
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__ELEMENT:
                getElement().clear();
                getElement().addAll((Collection<? extends TopLevelElement>)newValue);
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__ATTRIBUTE:
                getAttribute().clear();
                getAttribute().addAll((Collection<? extends TopLevelAttribute>)newValue);
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__NOTATION:
                getNotation().clear();
                getNotation().addAll((Collection<? extends NotationType>)newValue);
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__SCHEMA_LOCATION:
                setSchemaLocation((String)newValue);
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__ID:
                setId((String)newValue);
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
            case XMLSchema11Package.OVERRIDE_TYPE__ANNOTATION:
                setAnnotation((AnnotationType)null);
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__SCHEMA_TOP:
                getSchemaTop().clear();
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__SIMPLE_TYPE:
                getSimpleType().clear();
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__COMPLEX_TYPE:
                getComplexType().clear();
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__GROUP:
                getGroup().clear();
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__ATTRIBUTE_GROUP:
                getAttributeGroup().clear();
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__ELEMENT:
                getElement().clear();
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__ATTRIBUTE:
                getAttribute().clear();
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__NOTATION:
                getNotation().clear();
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__SCHEMA_LOCATION:
                setSchemaLocation(SCHEMA_LOCATION_EDEFAULT);
                return;
            case XMLSchema11Package.OVERRIDE_TYPE__ID:
                setId(ID_EDEFAULT);
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
            case XMLSchema11Package.OVERRIDE_TYPE__ANNOTATION:
                return getAnnotation() != null;
            case XMLSchema11Package.OVERRIDE_TYPE__SCHEMA_TOP:
                return !getSchemaTop().isEmpty();
            case XMLSchema11Package.OVERRIDE_TYPE__SIMPLE_TYPE:
                return !getSimpleType().isEmpty();
            case XMLSchema11Package.OVERRIDE_TYPE__COMPLEX_TYPE:
                return !getComplexType().isEmpty();
            case XMLSchema11Package.OVERRIDE_TYPE__GROUP:
                return !getGroup().isEmpty();
            case XMLSchema11Package.OVERRIDE_TYPE__ATTRIBUTE_GROUP:
                return !getAttributeGroup().isEmpty();
            case XMLSchema11Package.OVERRIDE_TYPE__ELEMENT:
                return !getElement().isEmpty();
            case XMLSchema11Package.OVERRIDE_TYPE__ATTRIBUTE:
                return !getAttribute().isEmpty();
            case XMLSchema11Package.OVERRIDE_TYPE__NOTATION:
                return !getNotation().isEmpty();
            case XMLSchema11Package.OVERRIDE_TYPE__SCHEMA_LOCATION:
                return SCHEMA_LOCATION_EDEFAULT == null ? schemaLocation != null : !SCHEMA_LOCATION_EDEFAULT.equals(schemaLocation);
            case XMLSchema11Package.OVERRIDE_TYPE__ID:
                return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
        result.append(" (schemaLocation: ");
        result.append(schemaLocation);
        result.append(", id: ");
        result.append(id);
        result.append(')');
        return result.toString();
    }

} //OverrideTypeImpl
