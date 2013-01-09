/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFCallCplCompCreate;
import org.earthsystemcurator.cupid.esmf.ESMFCouplerComponent;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Cpl Comp Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallCplCompCreateImpl#getCplcomp <em>Cplcomp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFCallCplCompCreateImpl extends ESMFCallImpl implements ESMFCallCplCompCreate {
	/**
	 * The cached value of the '{@link #getCplcomp() <em>Cplcomp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCplcomp()
	 * @generated
	 * @ordered
	 */
	protected ESMFCouplerComponent cplcomp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFCallCplCompCreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_CALL_CPL_COMP_CREATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFCouplerComponent getCplcomp() {
		if (cplcomp != null && cplcomp.eIsProxy()) {
			InternalEObject oldCplcomp = (InternalEObject)cplcomp;
			cplcomp = (ESMFCouplerComponent)eResolveProxy(oldCplcomp);
			if (cplcomp != oldCplcomp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_CALL_CPL_COMP_CREATE__CPLCOMP, oldCplcomp, cplcomp));
			}
		}
		return cplcomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFCouplerComponent basicGetCplcomp() {
		return cplcomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCplcomp(ESMFCouplerComponent newCplcomp) {
		ESMFCouplerComponent oldCplcomp = cplcomp;
		cplcomp = newCplcomp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_CALL_CPL_COMP_CREATE__CPLCOMP, oldCplcomp, cplcomp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_CALL_CPL_COMP_CREATE__CPLCOMP:
				if (resolve) return getCplcomp();
				return basicGetCplcomp();
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
			case ESMFPackage.ESMF_CALL_CPL_COMP_CREATE__CPLCOMP:
				setCplcomp((ESMFCouplerComponent)newValue);
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
			case ESMFPackage.ESMF_CALL_CPL_COMP_CREATE__CPLCOMP:
				setCplcomp((ESMFCouplerComponent)null);
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
			case ESMFPackage.ESMF_CALL_CPL_COMP_CREATE__CPLCOMP:
				return cplcomp != null;
		}
		return super.eIsSet(featureID);
	}

} //ESMFCallCplCompCreateImpl
