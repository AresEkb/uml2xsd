/**
 */
package org.w3._2007.xml.schema.versioning;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3._2007.xml.schema.versioning.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3._2007.xml.schema.versioning.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.w3._2007.xml.schema.versioning.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.w3._2007.xml.schema.versioning.DocumentRoot#getMaxVersion <em>Max Version</em>}</li>
 *   <li>{@link org.w3._2007.xml.schema.versioning.DocumentRoot#getMinVersion <em>Min Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3._2007.xml.schema.versioning.XMLSchemaVersioningPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
    /**
     * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
     * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mixed</em>' attribute list.
     * @see org.w3._2007.xml.schema.versioning.XMLSchemaVersioningPackage#getDocumentRoot_Mixed()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
     *        extendedMetaData="kind='elementWildcard' name=':mixed'"
     * @generated
     */
    FeatureMap getMixed();

    /**
     * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XMLNS Prefix Map</em>' map.
     * @see org.w3._2007.xml.schema.versioning.XMLSchemaVersioningPackage#getDocumentRoot_XMLNSPrefixMap()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
     * @generated
     */
    EMap<String, String> getXMLNSPrefixMap();

    /**
     * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.String},
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>XSI Schema Location</em>' map.
     * @see org.w3._2007.xml.schema.versioning.XMLSchemaVersioningPackage#getDocumentRoot_XSISchemaLocation()
     * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
     *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
     * @generated
     */
    EMap<String, String> getXSISchemaLocation();

    /**
     * Returns the value of the '<em><b>Max Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *     <div xmlns="http://www.w3.org/1999/xhtml">
     *      <p>The <code>maxVersion</code> attribute specifies that its parent
     *       element should be ignored by any processor supporting a version number
     *       higher than the <code>maxVersion</code> value.</p>
     *     </div>
     *    
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Version</em>' attribute.
     * @see #setMaxVersion(BigDecimal)
     * @see org.w3._2007.xml.schema.versioning.XMLSchemaVersioningPackage#getDocumentRoot_MaxVersion()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
     *        extendedMetaData="kind='attribute' name='maxVersion' namespace='##targetNamespace'"
     * @generated
     */
    BigDecimal getMaxVersion();

    /**
     * Sets the value of the '{@link org.w3._2007.xml.schema.versioning.DocumentRoot#getMaxVersion <em>Max Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Version</em>' attribute.
     * @see #getMaxVersion()
     * @generated
     */
    void setMaxVersion(BigDecimal value);

    /**
     * Returns the value of the '<em><b>Min Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * 
     *     <div xmlns="http://www.w3.org/1999/xhtml">
     *      <p>The <code>minVersion</code> attribute specifies that its parent
     *       element should be ignored by any processor supporting a version number
     *       lower than the <code>minVersion</code> value.</p>
     *     </div>
     *    
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min Version</em>' attribute.
     * @see #setMinVersion(BigDecimal)
     * @see org.w3._2007.xml.schema.versioning.XMLSchemaVersioningPackage#getDocumentRoot_MinVersion()
     * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal"
     *        extendedMetaData="kind='attribute' name='minVersion' namespace='##targetNamespace'"
     * @generated
     */
    BigDecimal getMinVersion();

    /**
     * Sets the value of the '{@link org.w3._2007.xml.schema.versioning.DocumentRoot#getMinVersion <em>Min Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Version</em>' attribute.
     * @see #getMinVersion()
     * @generated
     */
    void setMinVersion(BigDecimal value);

} // DocumentRoot
