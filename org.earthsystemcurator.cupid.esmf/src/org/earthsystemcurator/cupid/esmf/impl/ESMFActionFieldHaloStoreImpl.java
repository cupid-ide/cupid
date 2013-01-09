/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloStore;
import org.earthsystemcurator.cupid.esmf.ESMFField;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFRouteHandle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Field Halo Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldHaloStoreImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldHaloStoreImpl#getRouteHandle <em>Route Handle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionFieldHaloStoreImpl extends ESMFActionAPIImpl implements ESMFActionFieldHaloStore {
	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected ESMFField field;

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
	protected ESMFActionFieldHaloStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_FIELD_HALO_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFField getField() {
		if (field != null && field.eIsProxy()) {
			InternalEObject oldField = (InternalEObject)field;
			field = (ESMFField)eResolveProxy(oldField);
			if (field != oldField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_FIELD_HALO_STORE__FIELD, oldField, field));
			}
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFField basicGetField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(ESMFField newField) {
		ESMFField oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_HALO_STORE__FIELD, oldField, field));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_FIELD_HALO_STORE__ROUTE_HANDLE, oldRouteHandle, routeHandle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_HALO_STORE__ROUTE_HANDLE, oldRouteHandle, routeHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_FIELD_HALO_STORE__FIELD:
				if (resolve) return getField();
				return basicGetField();
			case ESMFPackage.ESMF_ACTION_FIELD_HALO_STORE__ROUTE_HANDLE:
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
			case ESMFPackage.ESMF_ACTION_FIELD_HALO_STORE__FIELD:
				setField((ESMFField)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_HALO_STORE__ROUTE_HANDLE:
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
			case ESMFPackage.ESMF_ACTION_FIELD_HALO_STORE__FIELD:
				setField((ESMFField)null);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_HALO_STORE__ROUTE_HANDLE:
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
			case ESMFPackage.ESMF_ACTION_FIELD_HALO_STORE__FIELD:
				return field != null;
			case ESMFPackage.ESMF_ACTION_FIELD_HALO_STORE__ROUTE_HANDLE:
				return routeHandle != null;
		}
		return super.eIsSet(featureID);
	}

} //ESMFActionFieldHaloStoreImpl
