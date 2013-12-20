/**
 */
package org.w3._2001.xml.schema;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wildcard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.Wildcard#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.Wildcard#getNotNamespace <em>Not Namespace</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.Wildcard#getProcessContents <em>Process Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2001.xml.schema.XMLSchema11Package#getWildcard()
 * @model extendedMetaData="name='wildcard' kind='mixed'"
 * @generated
 */
public interface Wildcard extends Annotated {
    /**
     * Returns the value of the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Namespace</em>' attribute.
     * @see #setNamespace(Object)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getWildcard_Namespace()
     * @model dataType="org.w3._2001.xml.schema.NamespaceList"
     *        extendedMetaData="kind='attribute' name='namespace'"
     * @generated
     */
    Object getNamespace();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.Wildcard#getNamespace <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Namespace</em>' attribute.
     * @see #getNamespace()
     * @generated
     */
    void setNamespace(Object value);

    /**
     * Returns the value of the '<em><b>Not Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Not Namespace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Not Namespace</em>' attribute.
     * @see #setNotNamespace(List)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getWildcard_NotNamespace()
     * @model dataType="org.w3._2001.xml.schema.NotNamespaceType" many="false"
     *        extendedMetaData="kind='attribute' name='notNamespace'"
     * @generated
     */
    List<Object> getNotNamespace();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.Wildcard#getNotNamespace <em>Not Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Not Namespace</em>' attribute.
     * @see #getNotNamespace()
     * @generated
     */
    void setNotNamespace(List<Object> value);

    /**
     * Returns the value of the '<em><b>Process Contents</b></em>' attribute.
     * The default value is <code>"strict"</code>.
     * The literals are from the enumeration {@link org.w3._2001.xml.schema.ProcessContentsType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Process Contents</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Process Contents</em>' attribute.
     * @see org.w3._2001.xml.schema.ProcessContentsType
     * @see #isSetProcessContents()
     * @see #unsetProcessContents()
     * @see #setProcessContents(ProcessContentsType)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getWildcard_ProcessContents()
     * @model default="strict" unsettable="true"
     *        extendedMetaData="kind='attribute' name='processContents'"
     * @generated
     */
    ProcessContentsType getProcessContents();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.Wildcard#getProcessContents <em>Process Contents</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Process Contents</em>' attribute.
     * @see org.w3._2001.xml.schema.ProcessContentsType
     * @see #isSetProcessContents()
     * @see #unsetProcessContents()
     * @see #getProcessContents()
     * @generated
     */
    void setProcessContents(ProcessContentsType value);

    /**
     * Unsets the value of the '{@link org.w3._2001.xml.schema.Wildcard#getProcessContents <em>Process Contents</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProcessContents()
     * @see #getProcessContents()
     * @see #setProcessContents(ProcessContentsType)
     * @generated
     */
    void unsetProcessContents();

    /**
     * Returns whether the value of the '{@link org.w3._2001.xml.schema.Wildcard#getProcessContents <em>Process Contents</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Process Contents</em>' attribute is set.
     * @see #unsetProcessContents()
     * @see #getProcessContents()
     * @see #setProcessContents(ProcessContentsType)
     * @generated
     */
    boolean isSetProcessContents();

} // Wildcard
