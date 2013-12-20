/**
 */
package org.w3._2001.xml.schema;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *        This type is extended by all types which allow annotation
 *        other than <schema> itself
 *      
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.Annotated#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.Annotated#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2001.xml.schema.XMLSchema11Package#getAnnotated()
 * @model extendedMetaData="name='annotated' kind='mixed'"
 * @generated
 */
public interface Annotated extends OpenAttrs {
    /**
     * Returns the value of the '<em><b>Annotation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     * <!-- end-model-doc -->
     * @return the value of the '<em>Annotation</em>' containment reference.
     * @see #setAnnotation(AnnotationType)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getAnnotated_Annotation()
     * @model containment="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace'"
     * @generated
     */
    AnnotationType getAnnotation();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.Annotated#getAnnotation <em>Annotation</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Annotation</em>' containment reference.
     * @see #getAnnotation()
     * @generated
     */
    void setAnnotation(AnnotationType value);

    /**
     * Returns the value of the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Id</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Id</em>' attribute.
     * @see #setId(String)
     * @see org.w3._2001.xml.schema.XMLSchema11Package#getAnnotated_Id()
     * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
     *        extendedMetaData="kind='attribute' name='id'"
     * @generated
     */
    String getId();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.Annotated#getId <em>Id</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Id</em>' attribute.
     * @see #getId()
     * @generated
     */
    void setId(String value);

} // Annotated
