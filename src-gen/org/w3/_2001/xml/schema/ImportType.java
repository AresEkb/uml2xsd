/**
 */
package org.w3._2001.xml.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.ImportType#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.ImportType#getSchemaLocation <em>Schema Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2001.xml.schema.XMLSchema11Package#getImportType()
 * @model extendedMetaData="name='import_._type' kind='mixed'"
 * @generated
 */
public interface ImportType extends Annotated {
    /**
     * Returns the value of the '<em><b>Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Namespace</em>' attribute.
     * @see #setNamespace(String)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getImportType_Namespace()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='namespace'"
     * @generated
     */
    String getNamespace();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.ImportType#getNamespace <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Namespace</em>' attribute.
     * @see #getNamespace()
     * @generated
     */
    void setNamespace(String value);

    /**
     * Returns the value of the '<em><b>Schema Location</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Schema Location</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Schema Location</em>' attribute.
     * @see #setSchemaLocation(String)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getImportType_SchemaLocation()
     * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
     *        extendedMetaData="kind='attribute' name='schemaLocation'"
     * @generated
     */
    String getSchemaLocation();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.ImportType#getSchemaLocation <em>Schema Location</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Schema Location</em>' attribute.
     * @see #getSchemaLocation()
     * @generated
     */
    void setSchemaLocation(String value);

} // ImportType
