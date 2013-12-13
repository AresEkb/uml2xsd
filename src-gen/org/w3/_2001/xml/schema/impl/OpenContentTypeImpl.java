/**
 */
package org.w3._2001.xml.schema.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3._2001.xml.schema.ModeType1;
import org.w3._2001.xml.schema.OpenContentType;
import org.w3._2001.xml.schema.SchemaPackage;
import org.w3._2001.xml.schema.Wildcard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.OpenContentTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.OpenContentTypeImpl#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpenContentTypeImpl extends AnnotatedImpl implements OpenContentType {
    /**
     * The cached value of the '{@link #getAny() <em>Any</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAny()
     * @generated
     * @ordered
     */
    protected Wildcard any;

    /**
     * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMode()
     * @generated
     * @ordered
     */
    protected static final ModeType1 MODE_EDEFAULT = ModeType1.INTERLEAVE;

    /**
     * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMode()
     * @generated
     * @ordered
     */
    protected ModeType1 mode = MODE_EDEFAULT;

    /**
     * This is true if the Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean modeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OpenContentTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SchemaPackage.Literals.OPEN_CONTENT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Wildcard getAny() {
        return any;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAny(Wildcard newAny, NotificationChain msgs) {
        Wildcard oldAny = any;
        any = newAny;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.OPEN_CONTENT_TYPE__ANY, oldAny, newAny);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAny(Wildcard newAny) {
        if (newAny != any) {
            NotificationChain msgs = null;
            if (any != null)
                msgs = ((InternalEObject)any).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.OPEN_CONTENT_TYPE__ANY, null, msgs);
            if (newAny != null)
                msgs = ((InternalEObject)newAny).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.OPEN_CONTENT_TYPE__ANY, null, msgs);
            msgs = basicSetAny(newAny, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.OPEN_CONTENT_TYPE__ANY, newAny, newAny));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModeType1 getMode() {
        return mode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMode(ModeType1 newMode) {
        ModeType1 oldMode = mode;
        mode = newMode == null ? MODE_EDEFAULT : newMode;
        boolean oldModeESet = modeESet;
        modeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.OPEN_CONTENT_TYPE__MODE, oldMode, mode, !oldModeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMode() {
        ModeType1 oldMode = mode;
        boolean oldModeESet = modeESet;
        mode = MODE_EDEFAULT;
        modeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.OPEN_CONTENT_TYPE__MODE, oldMode, MODE_EDEFAULT, oldModeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetMode() {
        return modeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SchemaPackage.OPEN_CONTENT_TYPE__ANY:
                return basicSetAny(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case SchemaPackage.OPEN_CONTENT_TYPE__ANY:
                return getAny();
            case SchemaPackage.OPEN_CONTENT_TYPE__MODE:
                return getMode();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case SchemaPackage.OPEN_CONTENT_TYPE__ANY:
                setAny((Wildcard)newValue);
                return;
            case SchemaPackage.OPEN_CONTENT_TYPE__MODE:
                setMode((ModeType1)newValue);
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
            case SchemaPackage.OPEN_CONTENT_TYPE__ANY:
                setAny((Wildcard)null);
                return;
            case SchemaPackage.OPEN_CONTENT_TYPE__MODE:
                unsetMode();
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
            case SchemaPackage.OPEN_CONTENT_TYPE__ANY:
                return any != null;
            case SchemaPackage.OPEN_CONTENT_TYPE__MODE:
                return isSetMode();
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
        result.append(" (mode: ");
        if (modeESet) result.append(mode); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //OpenContentTypeImpl
