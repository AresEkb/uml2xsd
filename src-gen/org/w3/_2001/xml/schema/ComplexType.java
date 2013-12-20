/**
 */
package org.w3._2001.xml.schema;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#getSimpleContent <em>Simple Content</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#getComplexContent <em>Complex Content</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#getOpenContent <em>Open Content</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#getAll <em>All</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#getSequence <em>Sequence</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#getGroup1 <em>Group1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#getAttributeGroup <em>Attribute Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#getAnyAttribute1 <em>Any Attribute1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#getAssert <em>Assert</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#isMixed1 <em>Mixed1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#getFinal <em>Final</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#getBlock <em>Block</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ComplexType#isDefaultAttributesApply <em>Default Attributes Apply</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType()
 * @model abstract="true"
 *        extendedMetaData="name='complexType' kind='mixed'"
 * @generated
 */
public interface ComplexType extends Annotated {
    /**
     * Returns the value of the '<em><b>Simple Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Simple Content</em>' containment reference.
     * @see #setSimpleContent(SimpleContentType)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_SimpleContent()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='simpleContent' namespace='##targetNamespace'"
     * @generated
     */
    SimpleContentType getSimpleContent();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.ComplexType#getSimpleContent <em>Simple Content</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Simple Content</em>' containment reference.
     * @see #getSimpleContent()
     * @generated
     */
    void setSimpleContent(SimpleContentType value);

    /**
     * Returns the value of the '<em><b>Complex Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Complex Content</em>' containment reference.
     * @see #setComplexContent(ComplexContentType)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_ComplexContent()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='complexContent' namespace='##targetNamespace'"
     * @generated
     */
    ComplexContentType getComplexContent();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.ComplexType#getComplexContent <em>Complex Content</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Complex Content</em>' containment reference.
     * @see #getComplexContent()
     * @generated
     */
    void setComplexContent(ComplexContentType value);

    /**
     * Returns the value of the '<em><b>Open Content</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Open Content</em>' containment reference.
     * @see #setOpenContent(OpenContentType)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_OpenContent()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='openContent' namespace='##targetNamespace'"
     * @generated
     */
    OpenContentType getOpenContent();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.ComplexType#getOpenContent <em>Open Content</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Open Content</em>' containment reference.
     * @see #getOpenContent()
     * @generated
     */
    void setOpenContent(OpenContentType value);

    /**
     * Returns the value of the '<em><b>Group</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' containment reference.
     * @see #setGroup(GroupRef)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_Group()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='group' namespace='##targetNamespace'"
     * @generated
     */
    GroupRef getGroup();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.ComplexType#getGroup <em>Group</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Group</em>' containment reference.
     * @see #getGroup()
     * @generated
     */
    void setGroup(GroupRef value);

    /**
     * Returns the value of the '<em><b>All</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>All</em>' containment reference.
     * @see #setAll(All)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_All()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='all' namespace='##targetNamespace'"
     * @generated
     */
    All getAll();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.ComplexType#getAll <em>All</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>All</em>' containment reference.
     * @see #getAll()
     * @generated
     */
    void setAll(All value);

    /**
     * Returns the value of the '<em><b>Choice</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Choice</em>' containment reference.
     * @see #setChoice(ExplicitGroup)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_Choice()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='choice' namespace='##targetNamespace'"
     * @generated
     */
    ExplicitGroup getChoice();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.ComplexType#getChoice <em>Choice</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Choice</em>' containment reference.
     * @see #getChoice()
     * @generated
     */
    void setChoice(ExplicitGroup value);

    /**
     * Returns the value of the '<em><b>Sequence</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sequence</em>' containment reference.
     * @see #setSequence(ExplicitGroup)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_Sequence()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
     * @generated
     */
    ExplicitGroup getSequence();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.ComplexType#getSequence <em>Sequence</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sequence</em>' containment reference.
     * @see #getSequence()
     * @generated
     */
    void setSequence(ExplicitGroup value);

    /**
     * Returns the value of the '<em><b>Group1</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group1</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group1</em>' attribute list.
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_Group1()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='group' name='group:11'"
     * @generated
     */
    FeatureMap getGroup1();

    /**
     * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._2001.xml.schema.Attribute}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute</em>' containment reference list.
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_Attribute()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='attribute' namespace='##targetNamespace' group='#group:11'"
     * @generated
     */
    EList<Attribute> getAttribute();

    /**
     * Returns the value of the '<em><b>Attribute Group</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._2001.xml.schema.AttributeGroupRef}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute Group</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute Group</em>' containment reference list.
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_AttributeGroup()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='attributeGroup' namespace='##targetNamespace' group='#group:11'"
     * @generated
     */
    EList<AttributeGroupRef> getAttributeGroup();

    /**
     * Returns the value of the '<em><b>Any Attribute1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Any Attribute1</em>' containment reference.
     * @see #setAnyAttribute1(AnyAttributeType)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_AnyAttribute1()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='anyAttribute' namespace='##targetNamespace'"
     * @generated
     */
    AnyAttributeType getAnyAttribute1();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.ComplexType#getAnyAttribute1 <em>Any Attribute1</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Any Attribute1</em>' containment reference.
     * @see #getAnyAttribute1()
     * @generated
     */
    void setAnyAttribute1(AnyAttributeType value);

    /**
     * Returns the value of the '<em><b>Assert</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._2001.xml.schema.Assertion}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assert</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assert</em>' containment reference list.
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_Assert()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='assert' namespace='##targetNamespace'"
     * @generated
     */
    EList<Assertion> getAssert();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       Will be restricted to required or prohibited
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.ComplexType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Mixed1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *       Not allowed if simpleContent child is chosen.
     *       May be overridden by setting on complexContent child.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mixed1</em>' attribute.
     * @see #isSetMixed1()
     * @see #unsetMixed1()
     * @see #setMixed1(boolean)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_Mixed1()
     * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='mixed'"
     * @generated
     */
    boolean isMixed1();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.ComplexType#isMixed1 <em>Mixed1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mixed1</em>' attribute.
     * @see #isSetMixed1()
     * @see #unsetMixed1()
     * @see #isMixed1()
     * @generated
     */
    void setMixed1(boolean value);

    /**
     * Unsets the value of the '{@link org.w3._2001.xml.schema.ComplexType#isMixed1 <em>Mixed1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMixed1()
     * @see #isMixed1()
     * @see #setMixed1(boolean)
     * @generated
     */
    void unsetMixed1();

    /**
     * Returns whether the value of the '{@link org.w3._2001.xml.schema.ComplexType#isMixed1 <em>Mixed1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mixed1</em>' attribute is set.
     * @see #unsetMixed1()
     * @see #isMixed1()
     * @see #setMixed1(boolean)
     * @generated
     */
    boolean isSetMixed1();

    /**
     * Returns the value of the '<em><b>Abstract</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract</em>' attribute.
     * @see #isSetAbstract()
     * @see #unsetAbstract()
     * @see #setAbstract(boolean)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_Abstract()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='abstract'"
     * @generated
     */
    boolean isAbstract();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.ComplexType#isAbstract <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abstract</em>' attribute.
     * @see #isSetAbstract()
     * @see #unsetAbstract()
     * @see #isAbstract()
     * @generated
     */
    void setAbstract(boolean value);

    /**
     * Unsets the value of the '{@link org.w3._2001.xml.schema.ComplexType#isAbstract <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAbstract()
     * @see #isAbstract()
     * @see #setAbstract(boolean)
     * @generated
     */
    void unsetAbstract();

    /**
     * Returns whether the value of the '{@link org.w3._2001.xml.schema.ComplexType#isAbstract <em>Abstract</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Abstract</em>' attribute is set.
     * @see #unsetAbstract()
     * @see #isAbstract()
     * @see #setAbstract(boolean)
     * @generated
     */
    boolean isSetAbstract();

    /**
     * Returns the value of the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Final</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Final</em>' attribute.
     * @see #setFinal(Object)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_Final()
     * @model dataType="org.w3._2001.xml.schema.DerivationSet"
     *        extendedMetaData="kind='attribute' name='final'"
     * @generated
     */
    Object getFinal();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.ComplexType#getFinal <em>Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Final</em>' attribute.
     * @see #getFinal()
     * @generated
     */
    void setFinal(Object value);

    /**
     * Returns the value of the '<em><b>Block</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Block</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Block</em>' attribute.
     * @see #setBlock(Object)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_Block()
     * @model dataType="org.w3._2001.xml.schema.DerivationSet"
     *        extendedMetaData="kind='attribute' name='block'"
     * @generated
     */
    Object getBlock();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.ComplexType#getBlock <em>Block</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Block</em>' attribute.
     * @see #getBlock()
     * @generated
     */
    void setBlock(Object value);

    /**
     * Returns the value of the '<em><b>Default Attributes Apply</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Attributes Apply</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Attributes Apply</em>' attribute.
     * @see #isSetDefaultAttributesApply()
     * @see #unsetDefaultAttributesApply()
     * @see #setDefaultAttributesApply(boolean)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getComplexType_DefaultAttributesApply()
     * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='defaultAttributesApply'"
     * @generated
     */
    boolean isDefaultAttributesApply();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.ComplexType#isDefaultAttributesApply <em>Default Attributes Apply</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Attributes Apply</em>' attribute.
     * @see #isSetDefaultAttributesApply()
     * @see #unsetDefaultAttributesApply()
     * @see #isDefaultAttributesApply()
     * @generated
     */
    void setDefaultAttributesApply(boolean value);

    /**
     * Unsets the value of the '{@link org.w3._2001.xml.schema.ComplexType#isDefaultAttributesApply <em>Default Attributes Apply</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDefaultAttributesApply()
     * @see #isDefaultAttributesApply()
     * @see #setDefaultAttributesApply(boolean)
     * @generated
     */
    void unsetDefaultAttributesApply();

    /**
     * Returns whether the value of the '{@link org.w3._2001.xml.schema.ComplexType#isDefaultAttributesApply <em>Default Attributes Apply</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Default Attributes Apply</em>' attribute is set.
     * @see #unsetDefaultAttributesApply()
     * @see #isDefaultAttributesApply()
     * @see #setDefaultAttributesApply(boolean)
     * @generated
     */
    boolean isSetDefaultAttributesApply();

} // ComplexType
