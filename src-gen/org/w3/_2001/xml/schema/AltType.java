/**
 */
package org.w3._2001.xml.schema;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alt Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *         This type is used for 'alternative' elements.
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.AltType#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.AltType#getComplexType <em>Complex Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.AltType#getTest <em>Test</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.AltType#getType <em>Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.AltType#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2001.xml.schema.SchemaPackage#getAltType()
 * @model extendedMetaData="name='altType' kind='elementOnly'"
 * @generated
 */
public interface AltType extends Annotated {
    /**
     * Returns the value of the '<em><b>Simple Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Simple Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Simple Type</em>' containment reference.
     * @see #setSimpleType(LocalSimpleType)
     * @see org.w3._2001.xml.schema.SchemaPackage#getAltType_SimpleType()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='simpleType' namespace='##targetNamespace'"
     * @generated
     */
    LocalSimpleType getSimpleType();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.AltType#getSimpleType <em>Simple Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Simple Type</em>' containment reference.
     * @see #getSimpleType()
     * @generated
     */
    void setSimpleType(LocalSimpleType value);

    /**
     * Returns the value of the '<em><b>Complex Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Complex Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Complex Type</em>' containment reference.
     * @see #setComplexType(LocalComplexType)
     * @see org.w3._2001.xml.schema.SchemaPackage#getAltType_ComplexType()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='complexType' namespace='##targetNamespace'"
     * @generated
     */
    LocalComplexType getComplexType();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.AltType#getComplexType <em>Complex Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Complex Type</em>' containment reference.
     * @see #getComplexType()
     * @generated
     */
    void setComplexType(LocalComplexType value);

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
     * @see org.w3._2001.xml.schema.SchemaPackage#getAltType_Test()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     *        extendedMetaData="kind='attribute' name='test'"
     * @generated
     */
    String getTest();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.AltType#getTest <em>Test</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test</em>' attribute.
     * @see #getTest()
     * @generated
     */
    void setTest(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(QName)
     * @see org.w3._2001.xml.schema.SchemaPackage#getAltType_Type()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='type'"
     * @generated
     */
    QName getType();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.AltType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(QName value);

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
     * @see org.w3._2001.xml.schema.SchemaPackage#getAltType_XpathDefaultNamespace()
     * @model dataType="org.w3._2001.xml.schema.XpathDefaultNamespace"
     *        extendedMetaData="kind='attribute' name='xpathDefaultNamespace'"
     * @generated
     */
    Object getXpathDefaultNamespace();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.AltType#getXpathDefaultNamespace <em>Xpath Default Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xpath Default Namespace</em>' attribute.
     * @see #getXpathDefaultNamespace()
     * @generated
     */
    void setXpathDefaultNamespace(Object value);

} // AltType
