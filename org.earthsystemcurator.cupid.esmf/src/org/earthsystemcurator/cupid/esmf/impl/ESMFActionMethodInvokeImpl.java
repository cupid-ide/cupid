/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvoke;
import org.earthsystemcurator.cupid.esmf.ESMFMethod;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFState;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Method Invoke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokeImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokeImpl#getImportState <em>Import State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionMethodInvokeImpl#getExportState <em>Export State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionMethodInvokeImpl extends ESMFActionMethodInvokePatternImpl implements ESMFActionMethodInvoke {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected ESMFMethod method;

	/**
	 * The cached value of the '{@link #getImportState() <em>Import State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportState()
	 * @generated
	 * @ordered
	 */
	protected ESMFState importState;

	/**
	 * The cached value of the '{@link #getExportState() <em>Export State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportState()
	 * @generated
	 * @ordered
	 */
	protected ESMFState exportState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionMethodInvokeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_METHOD_INVOKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFMethod getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject)method;
			method = (ESMFMethod)eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_METHOD_INVOKE__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFMethod basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(ESMFMethod newMethod) {
		ESMFMethod oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_METHOD_INVOKE__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState getImportState() {
		if (importState != null && importState.eIsProxy()) {
			InternalEObject oldImportState = (InternalEObject)importState;
			importState = (ESMFState)eResolveProxy(oldImportState);
			if (importState != oldImportState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_METHOD_INVOKE__IMPORT_STATE, oldImportState, importState));
			}
		}
		return importState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState basicGetImportState() {
		return importState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportState(ESMFState newImportState) {
		ESMFState oldImportState = importState;
		importState = newImportState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_METHOD_INVOKE__IMPORT_STATE, oldImportState, importState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState getExportState() {
		if (exportState != null && exportState.eIsProxy()) {
			InternalEObject oldExportState = (InternalEObject)exportState;
			exportState = (ESMFState)eResolveProxy(oldExportState);
			if (exportState != oldExportState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_METHOD_INVOKE__EXPORT_STATE, oldExportState, exportState));
			}
		}
		return exportState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState basicGetExportState() {
		return exportState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportState(ESMFState newExportState) {
		ESMFState oldExportState = exportState;
		exportState = newExportState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_METHOD_INVOKE__EXPORT_STATE, oldExportState, exportState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE__IMPORT_STATE:
				if (resolve) return getImportState();
				return basicGetImportState();
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE__EXPORT_STATE:
				if (resolve) return getExportState();
				return basicGetExportState();
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
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE__METHOD:
				setMethod((ESMFMethod)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE__IMPORT_STATE:
				setImportState((ESMFState)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE__EXPORT_STATE:
				setExportState((ESMFState)newValue);
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
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE__METHOD:
				setMethod((ESMFMethod)null);
				return;
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE__IMPORT_STATE:
				setImportState((ESMFState)null);
				return;
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE__EXPORT_STATE:
				setExportState((ESMFState)null);
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
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE__METHOD:
				return method != null;
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE__IMPORT_STATE:
				return importState != null;
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE__EXPORT_STATE:
				return exportState != null;
		}
		return super.eIsSet(featureID);
	}

} //ESMFActionMethodInvokeImpl
