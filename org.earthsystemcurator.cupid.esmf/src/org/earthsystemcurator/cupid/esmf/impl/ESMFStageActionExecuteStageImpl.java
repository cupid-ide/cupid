/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFStage;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionExecuteStage;
import org.earthsystemcurator.cupid.esmf.ESMFState;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stage Action Execute Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFStageActionExecuteStageImpl#getStageToExecute <em>Stage To Execute</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFStageActionExecuteStageImpl#getImportState <em>Import State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFStageActionExecuteStageImpl#getExportState <em>Export State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFStageActionExecuteStageImpl extends ESMFStageActionImpl implements ESMFStageActionExecuteStage {
	/**
	 * The cached value of the '{@link #getStageToExecute() <em>Stage To Execute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStageToExecute()
	 * @generated
	 * @ordered
	 */
	protected ESMFStage stageToExecute;

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
	protected ESMFStageActionExecuteStageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_STAGE_ACTION_EXECUTE_STAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFStage getStageToExecute() {
		if (stageToExecute != null && stageToExecute.eIsProxy()) {
			InternalEObject oldStageToExecute = (InternalEObject)stageToExecute;
			stageToExecute = (ESMFStage)eResolveProxy(oldStageToExecute);
			if (stageToExecute != oldStageToExecute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__STAGE_TO_EXECUTE, oldStageToExecute, stageToExecute));
			}
		}
		return stageToExecute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFStage basicGetStageToExecute() {
		return stageToExecute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStageToExecute(ESMFStage newStageToExecute) {
		ESMFStage oldStageToExecute = stageToExecute;
		stageToExecute = newStageToExecute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__STAGE_TO_EXECUTE, oldStageToExecute, stageToExecute));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__IMPORT_STATE, oldImportState, importState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__IMPORT_STATE, oldImportState, importState));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__EXPORT_STATE, oldExportState, exportState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__EXPORT_STATE, oldExportState, exportState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__STAGE_TO_EXECUTE:
				if (resolve) return getStageToExecute();
				return basicGetStageToExecute();
			case ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__IMPORT_STATE:
				if (resolve) return getImportState();
				return basicGetImportState();
			case ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__EXPORT_STATE:
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
			case ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__STAGE_TO_EXECUTE:
				setStageToExecute((ESMFStage)newValue);
				return;
			case ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__IMPORT_STATE:
				setImportState((ESMFState)newValue);
				return;
			case ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__EXPORT_STATE:
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
			case ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__STAGE_TO_EXECUTE:
				setStageToExecute((ESMFStage)null);
				return;
			case ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__IMPORT_STATE:
				setImportState((ESMFState)null);
				return;
			case ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__EXPORT_STATE:
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
			case ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__STAGE_TO_EXECUTE:
				return stageToExecute != null;
			case ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__IMPORT_STATE:
				return importState != null;
			case ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE__EXPORT_STATE:
				return exportState != null;
		}
		return super.eIsSet(featureID);
	}

} //ESMFStageActionExecuteStageImpl
