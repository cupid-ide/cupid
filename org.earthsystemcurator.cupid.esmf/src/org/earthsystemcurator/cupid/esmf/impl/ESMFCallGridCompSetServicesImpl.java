/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFCallGridCompSetServices;
import org.earthsystemcurator.cupid.esmf.ESMFComponent;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Grid Comp Set Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallGridCompSetServicesImpl#getGridcomp <em>Gridcomp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFCallGridCompSetServicesImpl extends ESMFCallImpl implements ESMFCallGridCompSetServices {
	/**
	 * The cached value of the '{@link #getGridcomp() <em>Gridcomp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridcomp()
	 * @generated
	 * @ordered
	 */
	protected ESMFComponent gridcomp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFCallGridCompSetServicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_CALL_GRID_COMP_SET_SERVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFComponent getGridcomp() {
		if (gridcomp != null && gridcomp.eIsProxy()) {
			InternalEObject oldGridcomp = (InternalEObject)gridcomp;
			gridcomp = (ESMFComponent)eResolveProxy(oldGridcomp);
			if (gridcomp != oldGridcomp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_CALL_GRID_COMP_SET_SERVICES__GRIDCOMP, oldGridcomp, gridcomp));
			}
		}
		return gridcomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFComponent basicGetGridcomp() {
		return gridcomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridcomp(ESMFComponent newGridcomp) {
		ESMFComponent oldGridcomp = gridcomp;
		gridcomp = newGridcomp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_CALL_GRID_COMP_SET_SERVICES__GRIDCOMP, oldGridcomp, gridcomp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_CALL_GRID_COMP_SET_SERVICES__GRIDCOMP:
				if (resolve) return getGridcomp();
				return basicGetGridcomp();
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
			case ESMFPackage.ESMF_CALL_GRID_COMP_SET_SERVICES__GRIDCOMP:
				setGridcomp((ESMFComponent)newValue);
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
			case ESMFPackage.ESMF_CALL_GRID_COMP_SET_SERVICES__GRIDCOMP:
				setGridcomp((ESMFComponent)null);
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
			case ESMFPackage.ESMF_CALL_GRID_COMP_SET_SERVICES__GRIDCOMP:
				return gridcomp != null;
		}
		return super.eIsSet(featureID);
	}

} //ESMFCallGridCompSetServicesImpl
