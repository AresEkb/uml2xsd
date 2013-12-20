/**
 */
package org.w3._2001.xml.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.Assertion#getTest <em>Test</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.Assertion#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2001.xml.schema.XMLSchema11Package#getAssertion()
 * @model extendedMetaData="name='assertion' kind='mixed'"
 * @generated
 */
public interface Assertion extends Annotated {
    /**
     * Returns the value of the '<em><b>Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test</em>' attribute.
     * @see #setTest(String)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getAssertion_Test()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='test'"
     * @generated
     */
    String getTest();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.Assertion#getTest <em>Test</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test</em>' attribute.
     * @see #getTest()
     * @generated
     */
    void setTest(String value);

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
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getAssertion_XpathDefaultNamespace()
     * @model dataType="org.w3._2001.xml.schema.XpathDefaultNamespace"
     *        extendedMetaData="kind='attribute' name='xpathDefaultNamespace'"
     * @generated
     */
    Object getXpathDefaultNamespace();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.Assertion#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xpath Default Namespace</em>' attribute.
     * @see #getXpathDefaultNamespace()
     * @generated
     */
    void setXpathDefaultNamespace(Object value);

} // Assertion
