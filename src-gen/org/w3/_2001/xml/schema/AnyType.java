/**
 */
package org.w3._2001.xml.schema;

import java.math.BigInteger;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.AnyType#getMaxOccurs <em>Max Occurs</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.AnyType#getMinOccurs <em>Min Occurs</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.AnyType#getNotQName <em>Not QName</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2001.xml.schema.XMLSchema11Package#getAnyType()
 * @model extendedMetaData="name='any_._type' kind='mixed'"
 * @generated
 */
public interface AnyType extends Wildcard {
    /**
     * Returns the value of the '<em><b>Max Occurs</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Occurs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Occurs</em>' attribute.
     * @see #isSetMaxOccurs()
     * @see #unsetMaxOccurs()
     * @see #setMaxOccurs(Object)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getAnyType_MaxOccurs()
     * @model default="1" unsettable="true" dataType="org.w3._2001.xml.schema.AllNNI"
     *        extendedMetaData="kind='attribute' name='maxOccurs'"
     * @generated
     */
    Object getMaxOccurs();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.AnyType#getMaxOccurs <em>Max Occurs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Occurs</em>' attribute.
     * @see #isSetMaxOccurs()
     * @see #unsetMaxOccurs()
     * @see #getMaxOccurs()
     * @generated
     */
    void setMaxOccurs(Object value);

    /**
     * Unsets the value of the '{@link org.w3._2001.xml.schema.AnyType#getMaxOccurs <em>Max Occurs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxOccurs()
     * @see #getMaxOccurs()
     * @see #setMaxOccurs(Object)
     * @generated
     */
    void unsetMaxOccurs();

    /**
     * Returns whether the value of the '{@link org.w3._2001.xml.schema.AnyType#getMaxOccurs <em>Max Occurs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Occurs</em>' attribute is set.
     * @see #unsetMaxOccurs()
     * @see #getMaxOccurs()
     * @see #setMaxOccurs(Object)
     * @generated
     */
    boolean isSetMaxOccurs();

    /**
     * Returns the value of the '<em><b>Min Occurs</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Occurs</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Occurs</em>' attribute.
     * @see #isSetMinOccurs()
     * @see #unsetMinOccurs()
     * @see #setMinOccurs(BigInteger)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getAnyType_MinOccurs()
     * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
     *        extendedMetaData="kind='attribute' name='minOccurs'"
     * @generated
     */
    BigInteger getMinOccurs();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.AnyType#getMinOccurs <em>Min Occurs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Occurs</em>' attribute.
     * @see #isSetMinOccurs()
     * @see #unsetMinOccurs()
     * @see #getMinOccurs()
     * @generated
     */
    void setMinOccurs(BigInteger value);

    /**
     * Unsets the value of the '{@link org.w3._2001.xml.schema.AnyType#getMinOccurs <em>Min Occurs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinOccurs()
     * @see #getMinOccurs()
     * @see #setMinOccurs(BigInteger)
     * @generated
     */
    void unsetMinOccurs();

    /**
     * Returns whether the value of the '{@link org.w3._2001.xml.schema.AnyType#getMinOccurs <em>Min Occurs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Occurs</em>' attribute is set.
     * @see #unsetMinOccurs()
     * @see #getMinOccurs()
     * @see #setMinOccurs(BigInteger)
     * @generated
     */
    boolean isSetMinOccurs();

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
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getAnyType_NotQName()
     * @model dataType="org.w3._2001.xml.schema.QnameList" many="false"
     *        extendedMetaData="kind='attribute' name='notQName'"
     * @generated
     */
    List<Object> getNotQName();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.AnyType#getNotQName <em>Not QName</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Not QName</em>' attribute.
     * @see #getNotQName()
     * @generated
     */
    void setNotQName(List<Object> value);

} // AnyType
