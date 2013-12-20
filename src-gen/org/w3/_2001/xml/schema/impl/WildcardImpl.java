/**
 */
package org.w3._2001.xml.schema.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._2001.xml.schema.ProcessContentsType;
import org.w3._2001.xml.schema.Wildcard;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wildcard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.WildcardImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.WildcardImpl#getNotNamespace <em>Not Namespace</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.WildcardImpl#getProcessContents <em>Process Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WildcardImpl extends AnnotatedImpl implements Wildcard {
    /**
     * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace()
     * @generated
     * @ordered
     */
    protected static final Object NAMESPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNamespace()
     * @generated
     * @ordered
     */
    protected Object namespace = NAMESPACE_EDEFAULT;

    /**
     * The default value of the '{@link #getNotNamespace() <em>Not Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNotNamespace()
     * @generated
     * @ordered
     */
    protected static final List<Object> NOT_NAMESPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNotNamespace() <em>Not Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNotNamespace()
     * @generated
     * @ordered
     */
    protected List<Object> notNamespace = NOT_NAMESPACE_EDEFAULT;

    /**
     * The default value of the '{@link #getProcessContents() <em>Process Contents</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessContents()
     * @generated
     * @ordered
     */
    protected static final ProcessContentsType PROCESS_CONTENTS_EDEFAULT = ProcessContentsType.STRICT;

    /**
     * The cached value of the '{@link #getProcessContents() <em>Process Contents</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcessContents()
     * @generated
     * @ordered
     */
    protected ProcessContentsType processContents = PROCESS_CONTENTS_EDEFAULT;

    /**
     * This is true if the Process Contents attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean processContentsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WildcardImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.WILDCARD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Object getNamespace() {
        return namespace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNamespace(Object newNamespace) {
        Object oldNamespace = namespace;
        namespace = newNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.WILDCARD__NAMESPACE, oldNamespace, namespace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public List<Object> getNotNamespace() {
        return notNamespace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNotNamespace(List<Object> newNotNamespace) {
        List<Object> oldNotNamespace = notNamespace;
        notNamespace = newNotNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.WILDCARD__NOT_NAMESPACE, oldNotNamespace, notNamespace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessContentsType getProcessContents() {
        return processContents;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProcessContents(ProcessContentsType newProcessContents) {
        ProcessContentsType oldProcessContents = processContents;
        processContents = newProcessContents == null ? PROCESS_CONTENTS_EDEFAULT : newProcessContents;
        boolean oldProcessContentsESet = processContentsESet;
        processContentsESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.WILDCARD__PROCESS_CONTENTS, oldProcessContents, processContents, !oldProcessContentsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetProcessContents() {
        ProcessContentsType oldProcessContents = processContents;
        boolean oldProcessContentsESet = processContentsESet;
        processContents = PROCESS_CONTENTS_EDEFAULT;
        processContentsESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XMLSchema11Package.WILDCARD__PROCESS_CONTENTS, oldProcessContents, PROCESS_CONTENTS_EDEFAULT, oldProcessContentsESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetProcessContents() {
        return processContentsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XMLSchema11Package.WILDCARD__NAMESPACE:
                return getNamespace();
            case XMLSchema11Package.WILDCARD__NOT_NAMESPACE:
                return getNotNamespace();
            case XMLSchema11Package.WILDCARD__PROCESS_CONTENTS:
                return getProcessContents();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case XMLSchema11Package.WILDCARD__NAMESPACE:
                setNamespace(newValue);
                return;
            case XMLSchema11Package.WILDCARD__NOT_NAMESPACE:
                setNotNamespace((List<Object>)newValue);
                return;
            case XMLSchema11Package.WILDCARD__PROCESS_CONTENTS:
                setProcessContents((ProcessContentsType)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case XMLSchema11Package.WILDCARD__NAMESPACE:
                setNamespace(NAMESPACE_EDEFAULT);
                return;
            case XMLSchema11Package.WILDCARD__NOT_NAMESPACE:
                setNotNamespace(NOT_NAMESPACE_EDEFAULT);
                return;
            case XMLSchema11Package.WILDCARD__PROCESS_CONTENTS:
                unsetProcessContents();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case XMLSchema11Package.WILDCARD__NAMESPACE:
                return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
            case XMLSchema11Package.WILDCARD__NOT_NAMESPACE:
                return NOT_NAMESPACE_EDEFAULT == null ? notNamespace != null : !NOT_NAMESPACE_EDEFAULT.equals(notNamespace);
            case XMLSchema11Package.WILDCARD__PROCESS_CONTENTS:
                return isSetProcessContents();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (namespace: ");
        result.append(namespace);
        result.append(", notNamespace: ");
        result.append(notNamespace);
        result.append(", processContents: ");
        if (processContentsESet) result.append(processContents); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //WildcardImpl
