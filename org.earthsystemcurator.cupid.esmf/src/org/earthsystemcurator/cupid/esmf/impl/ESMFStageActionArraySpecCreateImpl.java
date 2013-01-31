/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFArraySpec;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionArraySpecCreate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stage Action Array Spec Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFStageActionArraySpecCreateImpl#getArraySpec <em>Array Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFStageActionArraySpecCreateImpl extends ESMFStageActionImpl implements ESMFStageActionArraySpecCreate {
	/**
	 * The cached value of the '{@link #getArraySpec() <em>Array Spec</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySpec()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFArraySpec> arraySpec;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFStageActionArraySpecCreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_STAGE_ACTION_ARRAY_SPEC_CREATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFArraySpec> getArraySpec() {
		if (arraySpec == null) {
			arraySpec = new EObjectResolvingEList<ESMFArraySpec>(ESMFArraySpec.class, this, ESMFPackage.ESMF_STAGE_ACTION_ARRAY_SPEC_CREATE__ARRAY_SPEC);
		}
		return arraySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_STAGE_ACTION_ARRAY_SPEC_CREATE__ARRAY_SPEC:
				return getArraySpec();
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
			case ESMFPackage.ESMF_STAGE_ACTION_ARRAY_SPEC_CREATE__ARRAY_SPEC:
				getArraySpec().clear();
				getArraySpec().addAll((Collection<? extends ESMFArraySpec>)newValue);
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
			case ESMFPackage.ESMF_STAGE_ACTION_ARRAY_SPEC_CREATE__ARRAY_SPEC:
				getArraySpec().clear();
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
			case ESMFPackage.ESMF_STAGE_ACTION_ARRAY_SPEC_CREATE__ARRAY_SPEC:
				return arraySpec != null && !arraySpec.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ESMFStageActionArraySpecCreateImpl
