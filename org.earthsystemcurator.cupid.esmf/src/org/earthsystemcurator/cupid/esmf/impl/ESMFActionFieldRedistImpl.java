/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedist;
import org.earthsystemcurator.cupid.esmf.ESMFField;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFRouteHandle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Field Redist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldRedistImpl#getSrcField <em>Src Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldRedistImpl#getDstField <em>Dst Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldRedistImpl#getRouteHandle <em>Route Handle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionFieldRedistImpl extends ESMFActionAPIImpl implements ESMFActionFieldRedist {
	/**
	 * The cached value of the '{@link #getSrcField() <em>Src Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcField()
	 * @generated
	 * @ordered
	 */
	protected ESMFField srcField;

	/**
	 * The cached value of the '{@link #getDstField() <em>Dst Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDstField()
	 * @generated
	 * @ordered
	 */
	protected ESMFField dstField;

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
	protected ESMFActionFieldRedistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_FIELD_REDIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFField getSrcField() {
		if (srcField != null && srcField.eIsProxy()) {
			InternalEObject oldSrcField = (InternalEObject)srcField;
			srcField = (ESMFField)eResolveProxy(oldSrcField);
			if (srcField != oldSrcField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_FIELD_REDIST__SRC_FIELD, oldSrcField, srcField));
			}
		}
		return srcField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFField basicGetSrcField() {
		return srcField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcField(ESMFField newSrcField) {
		ESMFField oldSrcField = srcField;
		srcField = newSrcField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_REDIST__SRC_FIELD, oldSrcField, srcField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFField getDstField() {
		if (dstField != null && dstField.eIsProxy()) {
			InternalEObject oldDstField = (InternalEObject)dstField;
			dstField = (ESMFField)eResolveProxy(oldDstField);
			if (dstField != oldDstField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_FIELD_REDIST__DST_FIELD, oldDstField, dstField));
			}
		}
		return dstField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFField basicGetDstField() {
		return dstField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDstField(ESMFField newDstField) {
		ESMFField oldDstField = dstField;
		dstField = newDstField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_REDIST__DST_FIELD, oldDstField, dstField));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_FIELD_REDIST__ROUTE_HANDLE, oldRouteHandle, routeHandle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_REDIST__ROUTE_HANDLE, oldRouteHandle, routeHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST__SRC_FIELD:
				if (resolve) return getSrcField();
				return basicGetSrcField();
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST__DST_FIELD:
				if (resolve) return getDstField();
				return basicGetDstField();
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST__ROUTE_HANDLE:
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
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST__SRC_FIELD:
				setSrcField((ESMFField)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST__DST_FIELD:
				setDstField((ESMFField)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST__ROUTE_HANDLE:
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
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST__SRC_FIELD:
				setSrcField((ESMFField)null);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST__DST_FIELD:
				setDstField((ESMFField)null);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST__ROUTE_HANDLE:
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
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST__SRC_FIELD:
				return srcField != null;
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST__DST_FIELD:
				return dstField != null;
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST__ROUTE_HANDLE:
				return routeHandle != null;
		}
		return super.eIsSet(featureID);
	}

} //ESMFActionFieldRedistImpl
