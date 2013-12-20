/**
 */
package org.w3._2001.xml.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Override Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.OverrideType#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.OverrideType#getSchemaTop <em>Schema Top</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.OverrideType#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.OverrideType#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.OverrideType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.OverrideType#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.OverrideType#getElement <em>Element</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.OverrideType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.OverrideType#getNotation <em>Notation</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.OverrideType#getSchemaLocation <em>Schema Location</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.OverrideType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2001.xml.schema.XMLSchema11Package#getOverrideType()
 * @model extendedMetaData="name='override_._type' kind='mixed'"
 * @generated
 */
public interface OverrideType extends OpenAttrs {
    /**
     * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Annotation</em>' containment reference.
     * @see #setAnnotation(AnnotationType)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getOverrideType_Annotation()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
     * @generated
     */
    AnnotationType getAnnotation();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.OverrideType#getAnnotation <em>Annotation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Annotation</em>' containment reference.
     * @see #getAnnotation()
     * @generated
     */
    void setAnnotation(AnnotationType value);

    /**
     * Returns the value of the '<em><b>Schema Top</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schema Top</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schema Top</em>' attribute list.
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getOverrideType_SchemaTop()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='group' name='SchemaTop:3'"
     * @generated
     */
    FeatureMap getSchemaTop();

    /**
     * Returns the value of the '<em><b>Simple Type</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._2001.xml.schema.TopLevelSimpleType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Simple Type</em>' containment reference list.
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getOverrideType_SimpleType()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='simpleType' namespace='##targetNamespace' group='#SchemaTop:3'"
     * @generated
     */
    EList<TopLevelSimpleType> getSimpleType();

    /**
     * Returns the value of the '<em><b>Complex Type</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._2001.xml.schema.TopLevelComplexType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Complex Type</em>' containment reference list.
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getOverrideType_ComplexType()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='complexType' namespace='##targetNamespace' group='#SchemaTop:3'"
     * @generated
     */
    EList<TopLevelComplexType> getComplexType();

    /**
     * Returns the value of the '<em><b>Group</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._2001.xml.schema.NamedGroup}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Group</em>' containment reference list.
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getOverrideType_Group()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace' group='#SchemaTop:3'"
     * @generated
     */
    EList<NamedGroup> getGroup();

    /**
     * Returns the value of the '<em><b>Attribute Group</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._2001.xml.schema.NamedAttributeGroup}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Attribute Group</em>' containment reference list.
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getOverrideType_AttributeGroup()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='attributeGroup' namespace='##targetNamespace' group='#SchemaTop:3'"
     * @generated
     */
    EList<NamedAttributeGroup> getAttributeGroup();

    /**
     * Returns the value of the '<em><b>Element</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._2001.xml.schema.TopLevelElement}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Element</em>' containment reference list.
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getOverrideType_Element()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='element' namespace='##targetNamespace' group='#SchemaTop:3'"
     * @generated
     */
    EList<TopLevelElement> getElement();

    /**
     * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._2001.xml.schema.TopLevelAttribute}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Attribute</em>' containment reference list.
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getOverrideType_Attribute()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='attribute' namespace='##targetNamespace' group='#SchemaTop:3'"
     * @generated
     */
    EList<TopLevelAttribute> getAttribute();

    /**
     * Returns the value of the '<em><b>Notation</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._2001.xml.schema.NotationType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Notation</em>' containment reference list.
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getOverrideType_Notation()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='notation' namespace='##targetNamespace' group='#SchemaTop:3'"
     * @generated
     */
    EList<NotationType> getNotation();

    /**
     * Returns the value of the '<em><b>Schema Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schema Location</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schema Location</em>' attribute.
     * @see #setSchemaLocation(String)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getOverrideType_SchemaLocation()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
     *        extendedMetaData="kind='attribute' name='schemaLocation'"
     * @generated
     */
    String getSchemaLocation();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.OverrideType#getSchemaLocation <em>Schema Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schema Location</em>' attribute.
     * @see #getSchemaLocation()
     * @generated
     */
    void setSchemaLocation(String value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getOverrideType_Id()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.OverrideType#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

} // OverrideType
