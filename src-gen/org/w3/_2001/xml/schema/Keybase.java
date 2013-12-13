/**
 */
package org.w3._2001.xml.schema;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keybase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.Keybase#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.Keybase#getField <em>Field</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.Keybase#getName <em>Name</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.Keybase#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2001.xml.schema.SchemaPackage#getKeybase()
 * @model extendedMetaData="name='keybase' kind='elementOnly'"
 * @generated
 */
public interface Keybase extends Annotated {
    /**
     * Returns the value of the '<em><b>Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Selector</em>' containment reference.
     * @see #setSelector(SelectorType)
     * @see org.w3._2001.xml.schema.SchemaPackage#getKeybase_Selector()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='selector' namespace='##targetNamespace'"
     * @generated
     */
    SelectorType getSelector();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.Keybase#getSelector <em>Selector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selector</em>' containment reference.
     * @see #getSelector()
     * @generated
     */
    void setSelector(SelectorType value);

    /**
     * Returns the value of the '<em><b>Field</b></em>' containment reference list.
     * The list contents are of type {@link org.w3._2001.xml.schema.FieldType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Field</em>' containment reference list.
     * @see org.w3._2001.xml.schema.SchemaPackage#getKeybase_Field()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='field' namespace='##targetNamespace'"
     * @generated
     */
    EList<FieldType> getField();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.w3._2001.xml.schema.SchemaPackage#getKeybase_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
     *        extendedMetaData="kind='attribute' name='name'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.Keybase#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Ref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ref</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ref</em>' attribute.
     * @see #setRef(QName)
     * @see org.w3._2001.xml.schema.SchemaPackage#getKeybase_Ref()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='ref'"
     * @generated
     */
    QName getRef();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.Keybase#getRef <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ref</em>' attribute.
     * @see #getRef()
     * @generated
     */
    void setRef(QName value);

} // Keybase
