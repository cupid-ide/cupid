/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistRelease;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFRouteHandle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Field Redist Release</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldRedistReleaseImpl#getRouteHandle <em>Route Handle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionFieldRedistReleaseImpl extends ESMFActionAPIImpl implements ESMFActionFieldRedistRelease {
	/**
	 * The cached value of the '{@link #getRouteHandle() <em>Route Handle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteHandle()
	 * @generated
	 * @ordered
	 */
	protected ESMFRouteHandle routeHandle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionFieldRedistReleaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_FIELD_REDIST_RELEASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFRouteHandle getRouteHandle() {
		if (routeHandle != null && routeHandle.eIsProxy()) {
			InternalEObject oldRouteHandle = (InternalEObject)routeHandle;
			routeHandle = (ESMFRouteHandle)eResolveProxy(oldRouteHandle);
			if (routeHandle != oldRouteHandle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_FIELD_REDIST_RELEASE__ROUTE_HANDLE, oldRouteHandle, routeHandle));
			}
		}
		return routeHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFRouteHandle basicGetRouteHandle() {
		return routeHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouteHandle(ESMFRouteHandle newRouteHandle) {
		ESMFRouteHandle oldRouteHandle = routeHandle;
		routeHandle = newRouteHandle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_REDIST_RELEASE__ROUTE_HANDLE, oldRouteHandle, routeHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST_RELEASE__ROUTE_HANDLE:
				if (resolve) return getRouteHandle();
				return basicGetRouteHandle();
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
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST_RELEASE__ROUTE_HANDLE:
				setRouteHandle((ESMFRouteHandle)newValue);
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
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST_RELEASE__ROUTE_HANDLE:
				setRouteHandle((ESMFRouteHandle)null);
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
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST_RELEASE__ROUTE_HANDLE:
				return routeHandle != null;
		}
		return super.eIsSet(featureID);
	}

} //ESMFActionFieldRedistReleaseImpl
