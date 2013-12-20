/**
 */
package org.w3._2001.xml.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.SimpleType#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.SimpleType#getList <em>List</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.SimpleType#getUnion <em>Union</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.SimpleType#getFinal <em>Final</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.SimpleType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2001.xml.schema.XMLSchema11Package#getSimpleType()
 * @model abstract="true"
 *        extendedMetaData="name='simpleType' kind='mixed'"
 * @generated
 */
public interface SimpleType extends Annotated {
    /**
     * Returns the value of the '<em><b>Restriction</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Restriction</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Restriction</em>' containment reference.
     * @see #setRestriction(RestrictionType1)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getSimpleType_Restriction()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='restriction' namespace='##targetNamespace'"
     * @generated
     */
    RestrictionType1 getRestriction();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.SimpleType#getRestriction <em>Restriction</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Restriction</em>' containment reference.
     * @see #getRestriction()
     * @generated
     */
    void setRestriction(RestrictionType1 value);

    /**
     * Returns the value of the '<em><b>List</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>List</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>List</em>' containment reference.
     * @see #setList(ListType)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getSimpleType_List()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='list' namespace='##targetNamespace'"
     * @generated
     */
    ListType getList();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.SimpleType#getList <em>List</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>List</em>' containment reference.
     * @see #getList()
     * @generated
     */
    void setList(ListType value);

    /**
     * Returns the value of the '<em><b>Union</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Union</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Union</em>' containment reference.
     * @see #setUnion(UnionType)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getSimpleType_Union()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='union' namespace='##targetNamespace'"
     * @generated
     */
    UnionType getUnion();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.SimpleType#getUnion <em>Union</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Union</em>' containment reference.
     * @see #getUnion()
     * @generated
     */
    void setUnion(UnionType value);

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
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getSimpleType_Final()
     * @model dataType="org.w3._2001.xml.schema.SimpleDerivationSet"
     *        extendedMetaData="kind='attribute' name='final'"
     * @generated
     */
    Object getFinal();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.SimpleType#getFinal <em>Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Final</em>' attribute.
     * @see #getFinal()
     * @generated
     */
    void setFinal(Object value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *               Can be restricted to required or forbidden
     *             
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getSimpleType_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.SimpleType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // SimpleType
