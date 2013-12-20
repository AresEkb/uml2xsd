/**
 */
package org.w3._2001.xml.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.RealGroup#getAll1 <em>All1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.RealGroup#getChoice1 <em>Choice1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.RealGroup#getSequence1 <em>Sequence1</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2001.xml.schema.XMLSchema11Package#getRealGroup()
 * @model extendedMetaData="name='realGroup' kind='mixed'"
 * @generated
 */
public interface RealGroup extends Group {
    /**
     * Returns the value of the '<em><b>All1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>All1</em>' containment reference.
     * @see #setAll1(All)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getRealGroup_All1()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='all' namespace='##targetNamespace'"
     * @generated
     */
    All getAll1();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.RealGroup#getAll1 <em>All1</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>All1</em>' containment reference.
     * @see #getAll1()
     * @generated
     */
    void setAll1(All value);

    /**
     * Returns the value of the '<em><b>Choice1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Choice1</em>' containment reference.
     * @see #setChoice1(ExplicitGroup)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getRealGroup_Choice1()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='choice' namespace='##targetNamespace'"
     * @generated
     */
    ExplicitGroup getChoice1();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.RealGroup#getChoice1 <em>Choice1</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Choice1</em>' containment reference.
     * @see #getChoice1()
     * @generated
     */
    void setChoice1(ExplicitGroup value);

    /**
     * Returns the value of the '<em><b>Sequence1</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sequence1</em>' containment reference.
     * @see #setSequence1(ExplicitGroup)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getRealGroup_Sequence1()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='sequence' namespace='##targetNamespace'"
     * @generated
     */
    ExplicitGroup getSequence1();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.RealGroup#getSequence1 <em>Sequence1</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sequence1</em>' containment reference.
     * @see #getSequence1()
     * @generated
     */
    void setSequence1(ExplicitGroup value);

} // RealGroup
