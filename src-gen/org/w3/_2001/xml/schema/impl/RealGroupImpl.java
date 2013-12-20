/**
 */
package org.w3._2001.xml.schema.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.w3._2001.xml.schema.All;
import org.w3._2001.xml.schema.ExplicitGroup;
import org.w3._2001.xml.schema.RealGroup;
import org.w3._2001.xml.schema.XMLSchema11Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Real Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3._2001.xml.schema.impl.RealGroupImpl#getAll1 <em>All1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RealGroupImpl#getChoice1 <em>Choice1</em>}</li>
 *   <li>{@link org.w3._2001.xml.schema.impl.RealGroupImpl#getSequence1 <em>Sequence1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RealGroupImpl extends GroupImpl implements RealGroup {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RealGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return XMLSchema11Package.Literals.REAL_GROUP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public All getAll1() {
        return (All)getMixed().get(XMLSchema11Package.Literals.REAL_GROUP__ALL1, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAll1(All newAll1) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.REAL_GROUP__ALL1, newAll1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExplicitGroup getChoice1() {
        return (ExplicitGroup)getMixed().get(XMLSchema11Package.Literals.REAL_GROUP__CHOICE1, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setChoice1(ExplicitGroup newChoice1) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.REAL_GROUP__CHOICE1, newChoice1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExplicitGroup getSequence1() {
        return (ExplicitGroup)getMixed().get(XMLSchema11Package.Literals.REAL_GROUP__SEQUENCE1, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSequence1(ExplicitGroup newSequence1) {
        ((FeatureMap.Internal)getMixed()).set(XMLSchema11Package.Literals.REAL_GROUP__SEQUENCE1, newSequence1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case XMLSchema11Package.REAL_GROUP__ALL1:
                return getAll1();
            case XMLSchema11Package.REAL_GROUP__CHOICE1:
                return getChoice1();
            case XMLSchema11Package.REAL_GROUP__SEQUENCE1:
                return getSequence1();
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
            case XMLSchema11Package.REAL_GROUP__ALL1:
                setAll1((All)newValue);
                return;
            case XMLSchema11Package.REAL_GROUP__CHOICE1:
                setChoice1((ExplicitGroup)newValue);
                return;
            case XMLSchema11Package.REAL_GROUP__SEQUENCE1:
                setSequence1((ExplicitGroup)newValue);
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
            case XMLSchema11Package.REAL_GROUP__ALL1:
                setAll1((All)null);
                return;
            case XMLSchema11Package.REAL_GROUP__CHOICE1:
                setChoice1((ExplicitGroup)null);
                return;
            case XMLSchema11Package.REAL_GROUP__SEQUENCE1:
                setSequence1((ExplicitGroup)null);
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
            case XMLSchema11Package.REAL_GROUP__ALL1:
                return getAll1() != null;
            case XMLSchema11Package.REAL_GROUP__CHOICE1:
                return getChoice1() != null;
            case XMLSchema11Package.REAL_GROUP__SEQUENCE1:
                return getSequence1() != null;
        }
        return super.eIsSet(featureID);
    }

} //RealGroupImpl
