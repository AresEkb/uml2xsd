/**
 */
package org.w3._2001.xml.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.OpenContentType#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.OpenContentType#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2001.xml.schema.XMLSchema11Package#getOpenContentType()
 * @model extendedMetaData="name='openContent_._type' kind='mixed'"
 * @generated
 */
public interface OpenContentType extends Annotated {
    /**
     * Returns the value of the '<em><b>Any</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Any</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Any</em>' containment reference.
     * @see #setAny(Wildcard)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getOpenContentType_Any()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='any' namespace='##targetNamespace'"
     * @generated
     */
    Wildcard getAny();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.OpenContentType#getAny <em>Any</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Any</em>' containment reference.
     * @see #getAny()
     * @generated
     */
    void setAny(Wildcard value);

    /**
     * Returns the value of the '<em><b>Mode</b></em>' attribute.
     * The default value is <code>"interleave"</code>.
     * The literals are from the enumeration {@link org.w3._2001.xml.schema.ModeType1}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mode</em>' attribute.
     * @see org.w3._2001.xml.schema.ModeType1
     * @see #isSetMode()
     * @see #unsetMode()
     * @see #setMode(ModeType1)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getOpenContentType_Mode()
     * @model default="interleave" unsettable="true"
     *        extendedMetaData="kind='attribute' name='mode'"
     * @generated
     */
    ModeType1 getMode();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.OpenContentType#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mode</em>' attribute.
     * @see org.w3._2001.xml.schema.ModeType1
     * @see #isSetMode()
     * @see #unsetMode()
     * @see #getMode()
     * @generated
     */
    void setMode(ModeType1 value);

    /**
     * Unsets the value of the '{@link org.w3._2001.xml.schema.OpenContentType#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMode()
     * @see #getMode()
     * @see #setMode(ModeType1)
     * @generated
     */
    void unsetMode();

    /**
     * Returns whether the value of the '{@link org.w3._2001.xml.schema.OpenContentType#getMode <em>Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mode</em>' attribute is set.
     * @see #unsetMode()
     * @see #getMode()
     * @see #setMode(ModeType1)
     * @generated
     */
    boolean isSetMode();

} // OpenContentType
