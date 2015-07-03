/**
 */
package iso20022.validation.result;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Any Content Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iso20022.validation.result.AnyContentType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see iso20022.validation.result.ValidationResultPackage#getAnyContentType()
 * @model extendedMetaData="name='anyContentType' kind='mixed'"
 * @generated
 */
public interface AnyContentType extends EObject, XMLTypeDocumentRoot {
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
     * @see iso20022.validation.result.ValidationResultPackage#getAnyContentType_Any()
     * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
     *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':1' processing='lax'"
     * @generated
     */
    FeatureMap getAny();

} // AnyContentType
