/**
 */
package org.w3._2001.xml.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.SelectorType#getXpath <em>Xpath</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.SelectorType#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2001.xml.schema.SchemaPackage#getSelectorType()
 * @model extendedMetaData="name='selector_._type' kind='elementOnly'"
 * @generated
 */
public interface SelectorType extends Annotated {
    /**
     * Returns the value of the '<em><b>Xpath</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xpath</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xpath</em>' attribute.
     * @see #setXpath(String)
     * @see org.w3._2001.xml.schema.SchemaPackage#getSelectorType_Xpath()
     * @model dataType="org.w3._2001.xml.schema.XpathType1" required="true"
     *        extendedMetaData="kind='attribute' name='xpath'"
     * @generated
     */
    String getXpath();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.SelectorType#getXpath <em>Xpath</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xpath</em>' attribute.
     * @see #getXpath()
     * @generated
     */
    void setXpath(String value);

    /**
     * Returns the value of the '<em><b>Xpath Default Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Xpath Default Namespace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Xpath Default Namespace</em>' attribute.
     * @see #setXpathDefaultNamespace(Object)
     * @see org.w3._2001.xml.schema.SchemaPackage#getSelectorType_XpathDefaultNamespace()
     * @model dataType="org.w3._2001.xml.schema.XpathDefaultNamespace"
     *        extendedMetaData="kind='attribute' name='xpathDefaultNamespace'"
     * @generated
     */
    Object getXpathDefaultNamespace();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.SelectorType#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xpath Default Namespace</em>' attribute.
     * @see #getXpathDefaultNamespace()
     * @generated
     */
    void setXpathDefaultNamespace(Object value);

} // SelectorType
