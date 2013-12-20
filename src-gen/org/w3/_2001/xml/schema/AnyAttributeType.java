/**
 */
package org.w3._2001.xml.schema;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.AnyAttributeType#getNotQName <em>Not QName</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2001.xml.schema.XMLSchema11Package#getAnyAttributeType()
 * @model extendedMetaData="name='anyAttribute_._type' kind='mixed'"
 * @generated
 */
public interface AnyAttributeType extends Wildcard {
    /**
     * Returns the value of the '<em><b>Not QName</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Not QName</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Not QName</em>' attribute.
     * @see #setNotQName(List)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getAnyAttributeType_NotQName()
     * @model dataType="org.w3._2001.xml.schema.QnameListA" many="false"
     *        extendedMetaData="kind='attribute' name='notQName'"
     * @generated
     */
    List<Object> getNotQName();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.AnyAttributeType#getNotQName <em>Not QName</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Not QName</em>' attribute.
     * @see #getNotQName()
     * @generated
     */
    void setNotQName(List<Object> value);

} // AnyAttributeType
