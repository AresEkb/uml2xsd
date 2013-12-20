/**
 */
package org.w3._2001.xml.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Open Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.DefaultOpenContentType#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.DefaultOpenContentType#isAppliesToEmpty <em>Applies To Empty</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.DefaultOpenContentType#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2001.xml.schema.XMLSchema11Package#getDefaultOpenContentType()
 * @model extendedMetaData="name='defaultOpenContent_._type' kind='mixed'"
 * @generated
 */
public interface DefaultOpenContentType extends Annotated {
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
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getDefaultOpenContentType_Any()
     * @model containment="true" required="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='any' namespace='##targetNamespace'"
     * @generated
     */
    Wildcard getAny();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.DefaultOpenContentType#getAny <em>Any</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Any</em>' containment reference.
     * @see #getAny()
     * @generated
     */
    void setAny(Wildcard value);

    /**
     * Returns the value of the '<em><b>Applies To Empty</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Applies To Empty</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Applies To Empty</em>' attribute.
     * @see #isSetAppliesToEmpty()
     * @see #unsetAppliesToEmpty()
     * @see #setAppliesToEmpty(boolean)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getDefaultOpenContentType_AppliesToEmpty()
     * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
     *        extendedMetaData="kind='attribute' name='appliesToEmpty'"
     * @generated
     */
    boolean isAppliesToEmpty();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.DefaultOpenContentType#isAppliesToEmpty <em>Applies To Empty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Applies To Empty</em>' attribute.
     * @see #isSetAppliesToEmpty()
     * @see #unsetAppliesToEmpty()
     * @see #isAppliesToEmpty()
     * @generated
     */
    void setAppliesToEmpty(boolean value);

    /**
     * Unsets the value of the '{@link org.w3._2001.xml.schema.DefaultOpenContentType#isAppliesToEmpty <em>Applies To Empty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAppliesToEmpty()
     * @see #isAppliesToEmpty()
     * @see #setAppliesToEmpty(boolean)
     * @generated
     */
    void unsetAppliesToEmpty();

    /**
     * Returns whether the value of the '{@link org.w3._2001.xml.schema.DefaultOpenContentType#isAppliesToEmpty <em>Applies To Empty</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Applies To Empty</em>' attribute is set.
     * @see #unsetAppliesToEmpty()
     * @see #isAppliesToEmpty()
     * @see #setAppliesToEmpty(boolean)
     * @generated
     */
    boolean isSetAppliesToEmpty();

    /**
     * Returns the value of the '<em><b>Mode</b></em>' attribute.
     * The default value is <code>"interleave"</code>.
     * The literals are from the enumeration {@link org.w3._2001.xml.schema.ModeType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mode</em>' attribute.
     * @see org.w3._2001.xml.schema.ModeType
     * @see #isSetMode()
     * @see #unsetMode()
     * @see #setMode(ModeType)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getDefaultOpenContentType_Mode()
     * @model default="interleave" unsettable="true"
     *        extendedMetaData="kind='attribute' name='mode'"
     * @generated
     */
    ModeType getMode();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.DefaultOpenContentType#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mode</em>' attribute.
     * @see org.w3._2001.xml.schema.ModeType
     * @see #isSetMode()
     * @see #unsetMode()
     * @see #getMode()
     * @generated
     */
    void setMode(ModeType value);

    /**
     * Unsets the value of the '{@link org.w3._2001.xml.schema.DefaultOpenContentType#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMode()
     * @see #getMode()
     * @see #setMode(ModeType)
     * @generated
     */
    void unsetMode();

    /**
     * Returns whether the value of the '{@link org.w3._2001.xml.schema.DefaultOpenContentType#getMode <em>Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mode</em>' attribute is set.
     * @see #unsetMode()
     * @see #getMode()
     * @see #setMode(ModeType)
     * @generated
     */
    boolean isSetMode();

} // DefaultOpenContentType
