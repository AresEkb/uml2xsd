/**
 */
package org.w3._2001.xml.schema;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restriction Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *           base attribute and simpleType child are mutually
 *           exclusive, but one or other is required
 *         
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.RestrictionType1#getSimpleType <em>Simple Type</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.RestrictionType1#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.RestrictionType1#getFacetGroup <em>Facet Group</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.RestrictionType1#getFacet <em>Facet</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.RestrictionType1#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.RestrictionType1#getBase <em>Base</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2001.xml.schema.SchemaPackage#getRestrictionType1()
 * @model extendedMetaData="name='restriction_._type' kind='elementOnly'"
 * @generated
 */
public interface RestrictionType1 extends Annotated {
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
     * @see org.w3._2001.xml.schema.SchemaPackage#getRestrictionType1_SimpleType()
     * @model containment="true"
     *        extendedMetaData="kind='element' name='simpleType' namespace='##targetNamespace'"
     * @generated
     */
    LocalSimpleType getSimpleType();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.RestrictionType1#getSimpleType <em>Simple Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Simple Type</em>' containment reference.
     * @see #getSimpleType()
     * @generated
     */
    void setSimpleType(LocalSimpleType value);

    /**
     * Returns the value of the '<em><b>Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Group</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Group</em>' attribute list.
     * @see org.w3._2001.xml.schema.SchemaPackage#getRestrictionType1_Group()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='group' name='group:4'"
     * @generated
     */
    FeatureMap getGroup();

    /**
     * Returns the value of the '<em><b>Facet Group</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         An abstract element, representing facets in general.
     *         The facets defined by this spec are substitutable for
     *         this element, and implementation-defined facets should
     *         also name this as a substitution-group head.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Facet Group</em>' attribute list.
     * @see org.w3._2001.xml.schema.SchemaPackage#getRestrictionType1_FacetGroup()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='group' name='facet:group' namespace='##targetNamespace' group='#group:4'"
     * @generated
     */
    FeatureMap getFacetGroup();

    /**
     * Returns the value of the '<em><b>Facet</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *         An abstract element, representing facets in general.
     *         The facets defined by this spec are substitutable for
     *         this element, and implementation-defined facets should
     *         also name this as a substitution-group head.
     *       
     * <!-- end-model-doc -->
     * @return the value of the '<em>Facet</em>' containment reference list.
     * @see org.w3._2001.xml.schema.SchemaPackage#getRestrictionType1_Facet()
     * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
     *        extendedMetaData="kind='element' name='facet' namespace='##targetNamespace' group='facet:group'"
     * @generated
     */
    EList<EObject> getFacet();

    /**
     * Returns the value of the '<em><b>Any</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Any</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Any</em>' attribute list.
     * @see org.w3._2001.xml.schema.SchemaPackage#getRestrictionType1_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':7' processing='lax' group='#group:4'"
     * @generated
     */
    FeatureMap getAny();

    /**
     * Returns the value of the '<em><b>Base</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base</em>' attribute.
     * @see #setBase(QName)
     * @see org.w3._2001.xml.schema.SchemaPackage#getRestrictionType1_Base()
     * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
     *        extendedMetaData="kind='attribute' name='base'"
     * @generated
     */
    QName getBase();

    /**
     * Sets the value of the '{@link org.w3._2001.xml.schema.RestrictionType1#getBase <em>Base</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base</em>' attribute.
     * @see #getBase()
     * @generated
     */
    void setBase(QName value);

} // RestrictionType1
