/**
 */
package org.w3._2001.xml.schema.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.w3._2001.xml.schema.DefaultOpenContentType;
import org.w3._2001.xml.schema.ModeType;
import org.w3._2001.xml.schema.Wildcard;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Open Content Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.DefaultOpenContentTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DefaultOpenContentTypeImpl#isAppliesToEmpty <em>Applies To Empty</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.DefaultOpenContentTypeImpl#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultOpenContentTypeImpl extends AnnotatedImpl implements DefaultOpenContentType {
    /**
     * The default value of the '{@link #isAppliesToEmpty() <em>Applies To Empty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAppliesToEmpty()
     * @generated
     * @ordered
     */
    protected static final boolean APPLIES_TO_EMPTY_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAppliesToEmpty() <em>Applies To Empty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAppliesToEmpty()
     * @generated
     * @ordered
     */
    protected boolean appliesToEmpty = APPLIES_TO_EMPTY_EDEFAULT;

    /**
     * This is true if the Applies To Empty attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean appliesToEmptyESet;

    /**
     * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMode()
     * @generated
     * @ordered
     */
    protected static final ModeType MODE_EDEFAULT = ModeType.INTERLEAVE;

    /**
     * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMode()
     * @generated
     * @ordered
     */
    protected ModeType mode = MODE_EDEFAULT;

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
    protected DefaultOpenContentTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.DEFAULT_OPEN_CONTENT_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Wildcard getAny() {
        return (Wildcard)getMixed().get(XMLSchema11Package.Literals.DEFAULT_OPEN_CONTENT_TYPE__ANY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAny(Wildcard newAny) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.DEFAULT_OPEN_CONTENT_TYPE__ANY, newAny);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAppliesToEmpty() {
        return appliesToEmpty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAppliesToEmpty(boolean newAppliesToEmpty) {
        boolean oldAppliesToEmpty = appliesToEmpty;
        appliesToEmpty = newAppliesToEmpty;
        boolean oldAppliesToEmptyESet = appliesToEmptyESet;
        appliesToEmptyESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.DEFAULT_OPEN_CONTENT_TYPE__APPLIES_TO_EMPTY, oldAppliesToEmpty, appliesToEmpty, !oldAppliesToEmptyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetAppliesToEmpty() {
        boolean oldAppliesToEmpty = appliesToEmpty;
        boolean oldAppliesToEmptyESet = appliesToEmptyESet;
        appliesToEmpty = APPLIES_TO_EMPTY_EDEFAULT;
        appliesToEmptyESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XMLSchema11Package.DEFAULT_OPEN_CONTENT_TYPE__APPLIES_TO_EMPTY, oldAppliesToEmpty, APPLIES_TO_EMPTY_EDEFAULT, oldAppliesToEmptyESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetAppliesToEmpty() {
        return appliesToEmptyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ModeType getMode() {
        return mode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMode(ModeType newMode) {
        ModeType oldMode = mode;
        mode = newMode == null ? MODE_EDEFAULT : newMode;
        boolean oldModeESet = modeESet;
        modeESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, XMLSchema11Package.DEFAULT_OPEN_CONTENT_TYPE__MODE, oldMode, mode, !oldModeESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetMode() {
        ModeType oldMode = mode;
        boolean oldModeESet = modeESet;
        mode = MODE_EDEFAULT;
        modeESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET, XMLSchema11Package.DEFAULT_OPEN_CONTENT_TYPE__MODE, oldMode, MODE_EDEFAULT, oldModeESet));
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
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XMLSchema11Package.DEFAULT_OPEN_CONTENT_TYPE__ANY:
                return getAny();
            case XMLSchema11Package.DEFAULT_OPEN_CONTENT_TYPE__APPLIES_TO_EMPTY:
                return isAppliesToEmpty();
            case XMLSchema11Package.DEFAULT_OPEN_CONTENT_TYPE__MODE:
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
            case XMLSchema11Package.DEFAULT_OPEN_CONTENT_TYPE__ANY:
                setAny((Wildcard)newValue);
                return;
            case XMLSchema11Package.DEFAULT_OPEN_CONTENT_TYPE__APPLIES_TO_EMPTY:
                setAppliesToEmpty((Boolean)newValue);
                return;
            case XMLSchema11Package.DEFAULT_OPEN_CONTENT_TYPE__MODE:
                setMode((ModeType)newValue);
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
            case XMLSchema11Package.DEFAULT_OPEN_CONTENT_TYPE__ANY:
                setAny((Wildcard)null);
                return;
            case XMLSchema11Package.DEFAULT_OPEN_CONTENT_TYPE__APPLIES_TO_EMPTY:
                unsetAppliesToEmpty();
                return;
            case XMLSchema11Package.DEFAULT_OPEN_CONTENT_TYPE__MODE:
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
            case XMLSchema11Package.DEFAULT_OPEN_CONTENT_TYPE__ANY:
                return getAny() != null;
            case XMLSchema11Package.DEFAULT_OPEN_CONTENT_TYPE__APPLIES_TO_EMPTY:
                return isSetAppliesToEmpty();
            case XMLSchema11Package.DEFAULT_OPEN_CONTENT_TYPE__MODE:
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
        result.append(" (appliesToEmpty: ");
        if (appliesToEmptyESet) result.append(appliesToEmpty); else result.append("<unset>");
        result.append(", mode: ");
        if (modeESet) result.append(mode); else result.append("<unset>");
        result.append(')');
        return result.toString();
    }

} //DefaultOpenContentTypeImpl
