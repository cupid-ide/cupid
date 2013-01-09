/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices;
import org.earthsystemcurator.cupid.esmf.ESMFComponent;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Cpl Comp Set Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompSetServicesImpl#getCplcomp <em>Cplcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompSetServicesImpl#getUserRoutine <em>User Routine</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompSetServicesImpl#getUserRC <em>User RC</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionCplCompSetServicesImpl extends ESMFActionAPIImpl implements ESMFActionCplCompSetServices {
	/**
	 * The cached value of the '{@link #getCplcomp() <em>Cplcomp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCplcomp()
	 * @generated
	 * @ordered
	 */
	protected ESMFComponent cplcomp;

	/**
	 * The default value of the '{@link #getUserRoutine() <em>User Routine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRoutine()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ROUTINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserRoutine() <em>User Routine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRoutine()
	 * @generated
	 * @ordered
	 */
	protected String userRoutine = USER_ROUTINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserRC() <em>User RC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRC()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_RC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserRC() <em>User RC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRC()
	 * @generated
	 * @ordered
	 */
	protected String userRC = USER_RC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionCplCompSetServicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_CPL_COMP_SET_SERVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFComponent getCplcomp() {
		if (cplcomp != null && cplcomp.eIsProxy()) {
			InternalEObject oldCplcomp = (InternalEObject)cplcomp;
			cplcomp = (ESMFComponent)eResolveProxy(oldCplcomp);
			if (cplcomp != oldCplcomp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES__CPLCOMP, oldCplcomp, cplcomp));
			}
		}
		return cplcomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFComponent basicGetCplcomp() {
		return cplcomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCplcomp(ESMFComponent newCplcomp) {
		ESMFComponent oldCplcomp = cplcomp;
		cplcomp = newCplcomp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES__CPLCOMP, oldCplcomp, cplcomp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserRoutine() {
		return userRoutine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserRoutine(String newUserRoutine) {
		String oldUserRoutine = userRoutine;
		userRoutine = newUserRoutine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES__USER_ROUTINE, oldUserRoutine, userRoutine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserRC() {
		return userRC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserRC(String newUserRC) {
		String oldUserRC = userRC;
		userRC = newUserRC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES__USER_RC, oldUserRC, userRC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES__CPLCOMP:
				if (resolve) return getCplcomp();
				return basicGetCplcomp();
			case ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES__USER_ROUTINE:
				return getUserRoutine();
			case ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES__USER_RC:
				return getUserRC();
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
			case ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES__CPLCOMP:
				setCplcomp((ESMFComponent)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES__USER_ROUTINE:
				setUserRoutine((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES__USER_RC:
				setUserRC((String)newValue);
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
			case ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES__CPLCOMP:
				setCplcomp((ESMFComponent)null);
				return;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES__USER_ROUTINE:
				setUserRoutine(USER_ROUTINE_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES__USER_RC:
				setUserRC(USER_RC_EDEFAULT);
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
			case ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES__CPLCOMP:
				return cplcomp != null;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES__USER_ROUTINE:
				return USER_ROUTINE_EDEFAULT == null ? userRoutine != null : !USER_ROUTINE_EDEFAULT.equals(userRoutine);
			case ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES__USER_RC:
				return USER_RC_EDEFAULT == null ? userRC != null : !USER_RC_EDEFAULT.equals(userRC);
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
		result.append(" (userRoutine: ");
		result.append(userRoutine);
		result.append(", userRC: ");
		result.append(userRC);
		result.append(')');
		return result.toString();
	}

} //ESMFActionCplCompSetServicesImpl
