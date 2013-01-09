/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet;
import org.earthsystemcurator.cupid.esmf.ESMFArraySpec;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFTypeKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Array Spec Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionArraySpecSetImpl#getArraySpec <em>Array Spec</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionArraySpecSetImpl#getTypekind <em>Typekind</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionArraySpecSetImpl#getRank <em>Rank</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionArraySpecSetImpl extends ESMFActionAPIImpl implements ESMFActionArraySpecSet {
	/**
	 * The cached value of the '{@link #getArraySpec() <em>Array Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySpec()
	 * @generated
	 * @ordered
	 */
	protected ESMFArraySpec arraySpec;

	/**
	 * The default value of the '{@link #getTypekind() <em>Typekind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypekind()
	 * @generated
	 * @ordered
	 */
	protected static final ESMFTypeKind TYPEKIND_EDEFAULT = ESMFTypeKind.ESMF_TYPEKIND_I1;

	/**
	 * The cached value of the '{@link #getTypekind() <em>Typekind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypekind()
	 * @generated
	 * @ordered
	 */
	protected ESMFTypeKind typekind = TYPEKIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final String RANK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected String rank = RANK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionArraySpecSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_ARRAY_SPEC_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFArraySpec getArraySpec() {
		if (arraySpec != null && arraySpec.eIsProxy()) {
			InternalEObject oldArraySpec = (InternalEObject)arraySpec;
			arraySpec = (ESMFArraySpec)eResolveProxy(oldArraySpec);
			if (arraySpec != oldArraySpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET__ARRAY_SPEC, oldArraySpec, arraySpec));
			}
		}
		return arraySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFArraySpec basicGetArraySpec() {
		return arraySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArraySpec(ESMFArraySpec newArraySpec) {
		ESMFArraySpec oldArraySpec = arraySpec;
		arraySpec = newArraySpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET__ARRAY_SPEC, oldArraySpec, arraySpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTypeKind getTypekind() {
		return typekind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypekind(ESMFTypeKind newTypekind) {
		ESMFTypeKind oldTypekind = typekind;
		typekind = newTypekind == null ? TYPEKIND_EDEFAULT : newTypekind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET__TYPEKIND, oldTypekind, typekind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(String newRank) {
		String oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET__ARRAY_SPEC:
				if (resolve) return getArraySpec();
				return basicGetArraySpec();
			case ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET__TYPEKIND:
				return getTypekind();
			case ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET__RANK:
				return getRank();
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
			case ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET__ARRAY_SPEC:
				setArraySpec((ESMFArraySpec)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET__TYPEKIND:
				setTypekind((ESMFTypeKind)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET__RANK:
				setRank((String)newValue);
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
			case ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET__ARRAY_SPEC:
				setArraySpec((ESMFArraySpec)null);
				return;
			case ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET__TYPEKIND:
				setTypekind(TYPEKIND_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET__RANK:
				setRank(RANK_EDEFAULT);
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
			case ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET__ARRAY_SPEC:
				return arraySpec != null;
			case ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET__TYPEKIND:
				return typekind != TYPEKIND_EDEFAULT;
			case ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET__RANK:
				return RANK_EDEFAULT == null ? rank != null : !RANK_EDEFAULT.equals(rank);
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
		result.append(" (typekind: ");
		result.append(typekind);
		result.append(", rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}

} //ESMFActionArraySpecSetImpl
