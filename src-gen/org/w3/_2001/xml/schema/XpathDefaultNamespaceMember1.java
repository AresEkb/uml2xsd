/**
 */
package org.w3._2001.xml.schema;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Xpath Default Namespace Member1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3._2001.xml.schema.SchemaPackage#getXpathDefaultNamespaceMember1()
 * @model extendedMetaData="name='xpathDefaultNamespace_._member_._1'"
 * @generated
 */
public enum XpathDefaultNamespaceMember1 implements Enumerator {
    /**
     * The '<em><b>Default Namespace</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #DEFAULT_NAMESPACE_VALUE
     * @generated
     * @ordered
     */
    DEFAULT_NAMESPACE(0, "defaultNamespace", "##defaultNamespace"),

    /**
     * The '<em><b>Target Namespace</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #TARGET_NAMESPACE_VALUE
     * @generated
     * @ordered
     */
    TARGET_NAMESPACE(1, "targetNamespace", "##targetNamespace"),

    /**
     * The '<em><b>Local</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LOCAL_VALUE
     * @generated
     * @ordered
     */
    LOCAL(2, "local", "##local");

    /**
     * The '<em><b>Default Namespace</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Default Namespace</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #DEFAULT_NAMESPACE
     * @model name="defaultNamespace" literal="##defaultNamespace"
     * @generated
     * @ordered
     */
    public static final int DEFAULT_NAMESPACE_VALUE = 0;

    /**
     * The '<em><b>Target Namespace</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Target Namespace</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #TARGET_NAMESPACE
     * @model name="targetNamespace" literal="##targetNamespace"
     * @generated
     * @ordered
     */
    public static final int TARGET_NAMESPACE_VALUE = 1;

    /**
     * The '<em><b>Local</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Local</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #LOCAL
     * @model name="local" literal="##local"
     * @generated
     * @ordered
     */
    public static final int LOCAL_VALUE = 2;

    /**
     * An array of all the '<em><b>Xpath Default Namespace Member1</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final XpathDefaultNamespaceMember1[] VALUES_ARRAY =
        new XpathDefaultNamespaceMember1[] {
            DEFAULT_NAMESPACE,
            TARGET_NAMESPACE,
            LOCAL,
        };

    /**
     * A public read-only list of all the '<em><b>Xpath Default Namespace Member1</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<XpathDefaultNamespaceMember1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Xpath Default Namespace Member1</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static XpathDefaultNamespaceMember1 get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            XpathDefaultNamespaceMember1 result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Xpath Default Namespace Member1</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static XpathDefaultNamespaceMember1 getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            XpathDefaultNamespaceMember1 result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Xpath Default Namespace Member1</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static XpathDefaultNamespaceMember1 get(int value) {
        switch (value) {
            case DEFAULT_NAMESPACE_VALUE: return DEFAULT_NAMESPACE;
            case TARGET_NAMESPACE_VALUE: return TARGET_NAMESPACE;
            case LOCAL_VALUE: return LOCAL;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private XpathDefaultNamespaceMember1(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //XpathDefaultNamespaceMember1
