/**
 */
package org.earthsystemcurator.cupid.esmf.util;

import org.earthsystemcurator.cupid.esmf.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage
 * @generated
 */
public class ESMFSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ESMFPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFSwitch() {
		if (modelPackage == null) {
			modelPackage = ESMFPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ESMFPackage.ESMF_NAMED_ENTITY: {
				ESMFNamedEntity esmfNamedEntity = (ESMFNamedEntity)theEObject;
				T result = caseESMFNamedEntity(esmfNamedEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_SCOPE: {
				ESMFScope esmfScope = (ESMFScope)theEObject;
				T result = caseESMFScope(esmfScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_SCOPED_ITEM: {
				ESMFScopedItem esmfScopedItem = (ESMFScopedItem)theEObject;
				T result = caseESMFScopedItem(esmfScopedItem);
				if (result == null) result = caseESMFNamedEntity(esmfScopedItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_WORKSPACE: {
				ESMFWorkspace esmfWorkspace = (ESMFWorkspace)theEObject;
				T result = caseESMFWorkspace(esmfWorkspace);
				if (result == null) result = caseESMFNamedEntity(esmfWorkspace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_COMPONENT: {
				ESMFComponent esmfComponent = (ESMFComponent)theEObject;
				T result = caseESMFComponent(esmfComponent);
				if (result == null) result = caseESMFNamedEntity(esmfComponent);
				if (result == null) result = caseESMFScope(esmfComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_GRIDDED_COMPONENT: {
				ESMFGriddedComponent esmfGriddedComponent = (ESMFGriddedComponent)theEObject;
				T result = caseESMFGriddedComponent(esmfGriddedComponent);
				if (result == null) result = caseESMFComponent(esmfGriddedComponent);
				if (result == null) result = caseESMFNamedEntity(esmfGriddedComponent);
				if (result == null) result = caseESMFScope(esmfGriddedComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_COUPLER_COMPONENT: {
				ESMFCouplerComponent esmfCouplerComponent = (ESMFCouplerComponent)theEObject;
				T result = caseESMFCouplerComponent(esmfCouplerComponent);
				if (result == null) result = caseESMFComponent(esmfCouplerComponent);
				if (result == null) result = caseESMFNamedEntity(esmfCouplerComponent);
				if (result == null) result = caseESMFScope(esmfCouplerComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT: {
				ESMFSimpleCouplerComponent esmfSimpleCouplerComponent = (ESMFSimpleCouplerComponent)theEObject;
				T result = caseESMFSimpleCouplerComponent(esmfSimpleCouplerComponent);
				if (result == null) result = caseESMFCouplerComponent(esmfSimpleCouplerComponent);
				if (result == null) result = caseESMFComponent(esmfSimpleCouplerComponent);
				if (result == null) result = caseESMFNamedEntity(esmfSimpleCouplerComponent);
				if (result == null) result = caseESMFScope(esmfSimpleCouplerComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_DRIVER: {
				ESMFDriver esmfDriver = (ESMFDriver)theEObject;
				T result = caseESMFDriver(esmfDriver);
				if (result == null) result = caseESMFComponent(esmfDriver);
				if (result == null) result = caseESMFNamedEntity(esmfDriver);
				if (result == null) result = caseESMFScope(esmfDriver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE: {
				ESMFStage esmfStage = (ESMFStage)theEObject;
				T result = caseESMFStage(esmfStage);
				if (result == null) result = caseESMFNamedEntity(esmfStage);
				if (result == null) result = caseESMFScope(esmfStage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_INITIALIZE: {
				ESMFStageInitialize esmfStageInitialize = (ESMFStageInitialize)theEObject;
				T result = caseESMFStageInitialize(esmfStageInitialize);
				if (result == null) result = caseESMFStage(esmfStageInitialize);
				if (result == null) result = caseESMFNamedEntity(esmfStageInitialize);
				if (result == null) result = caseESMFScope(esmfStageInitialize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_RUN: {
				ESMFStageRun esmfStageRun = (ESMFStageRun)theEObject;
				T result = caseESMFStageRun(esmfStageRun);
				if (result == null) result = caseESMFStage(esmfStageRun);
				if (result == null) result = caseESMFNamedEntity(esmfStageRun);
				if (result == null) result = caseESMFScope(esmfStageRun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_FINALIZE: {
				ESMFStageFinalize esmfStageFinalize = (ESMFStageFinalize)theEObject;
				T result = caseESMFStageFinalize(esmfStageFinalize);
				if (result == null) result = caseESMFStage(esmfStageFinalize);
				if (result == null) result = caseESMFNamedEntity(esmfStageFinalize);
				if (result == null) result = caseESMFScope(esmfStageFinalize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION: {
				ESMFStageAction esmfStageAction = (ESMFStageAction)theEObject;
				T result = caseESMFStageAction(esmfStageAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE: {
				ESMFStageActionSequence esmfStageActionSequence = (ESMFStageActionSequence)theEObject;
				T result = caseESMFStageActionSequence(esmfStageActionSequence);
				if (result == null) result = caseESMFStageAction(esmfStageActionSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_ITERATE: {
				ESMFStageActionIterate esmfStageActionIterate = (ESMFStageActionIterate)theEObject;
				T result = caseESMFStageActionIterate(esmfStageActionIterate);
				if (result == null) result = caseESMFStageActionSequence(esmfStageActionIterate);
				if (result == null) result = caseESMFStageAction(esmfStageActionIterate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_ITERATE_CLOCK: {
				ESMFStageActionIterateClock esmfStageActionIterateClock = (ESMFStageActionIterateClock)theEObject;
				T result = caseESMFStageActionIterateClock(esmfStageActionIterateClock);
				if (result == null) result = caseESMFStageActionIterate(esmfStageActionIterateClock);
				if (result == null) result = caseESMFStageActionSequence(esmfStageActionIterateClock);
				if (result == null) result = caseESMFStageAction(esmfStageActionIterateClock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_ARRAY_SPEC_CREATE: {
				ESMFStageActionArraySpecCreate esmfStageActionArraySpecCreate = (ESMFStageActionArraySpecCreate)theEObject;
				T result = caseESMFStageActionArraySpecCreate(esmfStageActionArraySpecCreate);
				if (result == null) result = caseESMFStageAction(esmfStageActionArraySpecCreate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_COMPONENT_CREATE: {
				ESMFStageActionComponentCreate esmfStageActionComponentCreate = (ESMFStageActionComponentCreate)theEObject;
				T result = caseESMFStageActionComponentCreate(esmfStageActionComponentCreate);
				if (result == null) result = caseESMFStageAction(esmfStageActionComponentCreate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_COMPONENT_DESTROY: {
				ESMFStageActionComponentDestroy esmfStageActionComponentDestroy = (ESMFStageActionComponentDestroy)theEObject;
				T result = caseESMFStageActionComponentDestroy(esmfStageActionComponentDestroy);
				if (result == null) result = caseESMFStageAction(esmfStageActionComponentDestroy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_COMPONENT_SET_GRID: {
				ESMFStageActionComponentSetGrid esmfStageActionComponentSetGrid = (ESMFStageActionComponentSetGrid)theEObject;
				T result = caseESMFStageActionComponentSetGrid(esmfStageActionComponentSetGrid);
				if (result == null) result = caseESMFStageAction(esmfStageActionComponentSetGrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE: {
				ESMFStageActionExecuteStage esmfStageActionExecuteStage = (ESMFStageActionExecuteStage)theEObject;
				T result = caseESMFStageActionExecuteStage(esmfStageActionExecuteStage);
				if (result == null) result = caseESMFStageAction(esmfStageActionExecuteStage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_FIELD_CREATE: {
				ESMFStageActionFieldCreate esmfStageActionFieldCreate = (ESMFStageActionFieldCreate)theEObject;
				T result = caseESMFStageActionFieldCreate(esmfStageActionFieldCreate);
				if (result == null) result = caseESMFStageAction(esmfStageActionFieldCreate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_FIELD_DESTROY: {
				ESMFStageActionFieldDestroy esmfStageActionFieldDestroy = (ESMFStageActionFieldDestroy)theEObject;
				T result = caseESMFStageActionFieldDestroy(esmfStageActionFieldDestroy);
				if (result == null) result = caseESMFStageAction(esmfStageActionFieldDestroy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_FIELD_REDIST_STORE: {
				ESMFStageActionFieldRedistStore esmfStageActionFieldRedistStore = (ESMFStageActionFieldRedistStore)theEObject;
				T result = caseESMFStageActionFieldRedistStore(esmfStageActionFieldRedistStore);
				if (result == null) result = caseESMFStageAction(esmfStageActionFieldRedistStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_FIELD_REDIST: {
				ESMFStageActionFieldRedist esmfStageActionFieldRedist = (ESMFStageActionFieldRedist)theEObject;
				T result = caseESMFStageActionFieldRedist(esmfStageActionFieldRedist);
				if (result == null) result = caseESMFStageAction(esmfStageActionFieldRedist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_FIELD_REDIST_RELEASE: {
				ESMFStageActionFieldRedistRelease esmfStageActionFieldRedistRelease = (ESMFStageActionFieldRedistRelease)theEObject;
				T result = caseESMFStageActionFieldRedistRelease(esmfStageActionFieldRedistRelease);
				if (result == null) result = caseESMFStageAction(esmfStageActionFieldRedistRelease);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_GRID_CREATE: {
				ESMFStageActionGridCreate esmfStageActionGridCreate = (ESMFStageActionGridCreate)theEObject;
				T result = caseESMFStageActionGridCreate(esmfStageActionGridCreate);
				if (result == null) result = caseESMFStageAction(esmfStageActionGridCreate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_GRID_INHERIT: {
				ESMFStageActionGridInherit esmfStageActionGridInherit = (ESMFStageActionGridInherit)theEObject;
				T result = caseESMFStageActionGridInherit(esmfStageActionGridInherit);
				if (result == null) result = caseESMFStageAction(esmfStageActionGridInherit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_IMPORT_STATE_ADD: {
				ESMFStageActionImportStateAdd esmfStageActionImportStateAdd = (ESMFStageActionImportStateAdd)theEObject;
				T result = caseESMFStageActionImportStateAdd(esmfStageActionImportStateAdd);
				if (result == null) result = caseESMFStageAction(esmfStageActionImportStateAdd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_EXPORT_STATE_ADD: {
				ESMFStageActionExportStateAdd esmfStageActionExportStateAdd = (ESMFStageActionExportStateAdd)theEObject;
				T result = caseESMFStageActionExportStateAdd(esmfStageActionExportStateAdd);
				if (result == null) result = caseESMFStageAction(esmfStageActionExportStateAdd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_IMPORT_STATE_GET: {
				ESMFStageActionImportStateGet esmfStageActionImportStateGet = (ESMFStageActionImportStateGet)theEObject;
				T result = caseESMFStageActionImportStateGet(esmfStageActionImportStateGet);
				if (result == null) result = caseESMFStageAction(esmfStageActionImportStateGet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_EXPORT_STATE_GET: {
				ESMFStageActionExportStateGet esmfStageActionExportStateGet = (ESMFStageActionExportStateGet)theEObject;
				T result = caseESMFStageActionExportStateGet(esmfStageActionExportStateGet);
				if (result == null) result = caseESMFStageAction(esmfStageActionExportStateGet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_STATE_CREATE: {
				ESMFStageActionStateCreate esmfStageActionStateCreate = (ESMFStageActionStateCreate)theEObject;
				T result = caseESMFStageActionStateCreate(esmfStageActionStateCreate);
				if (result == null) result = caseESMFStageAction(esmfStageActionStateCreate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STAGE_ACTION_STATE_DESTROY: {
				ESMFStageActionStateDestroy esmfStageActionStateDestroy = (ESMFStageActionStateDestroy)theEObject;
				T result = caseESMFStageActionStateDestroy(esmfStageActionStateDestroy);
				if (result == null) result = caseESMFStageAction(esmfStageActionStateDestroy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_METHOD: {
				ESMFMethod esmfMethod = (ESMFMethod)theEObject;
				T result = caseESMFMethod(esmfMethod);
				if (result == null) result = caseESMFNamedEntity(esmfMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_INIT_METHOD: {
				ESMFInitMethod esmfInitMethod = (ESMFInitMethod)theEObject;
				T result = caseESMFInitMethod(esmfInitMethod);
				if (result == null) result = caseESMFMethod(esmfInitMethod);
				if (result == null) result = caseESMFNamedEntity(esmfInitMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_PRE_INIT_METHOD_SIDL: {
				ESMFPreInitMethodSIDL esmfPreInitMethodSIDL = (ESMFPreInitMethodSIDL)theEObject;
				T result = caseESMFPreInitMethodSIDL(esmfPreInitMethodSIDL);
				if (result == null) result = caseESMFInitMethod(esmfPreInitMethodSIDL);
				if (result == null) result = caseESMFMethod(esmfPreInitMethodSIDL);
				if (result == null) result = caseESMFNamedEntity(esmfPreInitMethodSIDL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_POST_INIT_METHOD_SIDL: {
				ESMFPostInitMethodSIDL esmfPostInitMethodSIDL = (ESMFPostInitMethodSIDL)theEObject;
				T result = caseESMFPostInitMethodSIDL(esmfPostInitMethodSIDL);
				if (result == null) result = caseESMFInitMethod(esmfPostInitMethodSIDL);
				if (result == null) result = caseESMFMethod(esmfPostInitMethodSIDL);
				if (result == null) result = caseESMFNamedEntity(esmfPostInitMethodSIDL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_RUN_METHOD: {
				ESMFRunMethod esmfRunMethod = (ESMFRunMethod)theEObject;
				T result = caseESMFRunMethod(esmfRunMethod);
				if (result == null) result = caseESMFMethod(esmfRunMethod);
				if (result == null) result = caseESMFNamedEntity(esmfRunMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_FINALIZE_METHOD: {
				ESMFFinalizeMethod esmfFinalizeMethod = (ESMFFinalizeMethod)theEObject;
				T result = caseESMFFinalizeMethod(esmfFinalizeMethod);
				if (result == null) result = caseESMFMethod(esmfFinalizeMethod);
				if (result == null) result = caseESMFNamedEntity(esmfFinalizeMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_FINALIZE_METHOD_SIDL: {
				ESMFFinalizeMethodSIDL esmfFinalizeMethodSIDL = (ESMFFinalizeMethodSIDL)theEObject;
				T result = caseESMFFinalizeMethodSIDL(esmfFinalizeMethodSIDL);
				if (result == null) result = caseESMFFinalizeMethod(esmfFinalizeMethodSIDL);
				if (result == null) result = caseESMFMethod(esmfFinalizeMethodSIDL);
				if (result == null) result = caseESMFNamedEntity(esmfFinalizeMethodSIDL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_REGISTER_METHOD: {
				ESMFRegisterMethod esmfRegisterMethod = (ESMFRegisterMethod)theEObject;
				T result = caseESMFRegisterMethod(esmfRegisterMethod);
				if (result == null) result = caseESMFNamedEntity(esmfRegisterMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_CALENDAR: {
				ESMFCalendar esmfCalendar = (ESMFCalendar)theEObject;
				T result = caseESMFCalendar(esmfCalendar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_TIME_INTERVAL: {
				ESMFTimeInterval esmfTimeInterval = (ESMFTimeInterval)theEObject;
				T result = caseESMFTimeInterval(esmfTimeInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_TIME: {
				ESMFTime esmfTime = (ESMFTime)theEObject;
				T result = caseESMFTime(esmfTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_CLOCK: {
				ESMFClock esmfClock = (ESMFClock)theEObject;
				T result = caseESMFClock(esmfClock);
				if (result == null) result = caseESMFScopedItem(esmfClock);
				if (result == null) result = caseESMFNamedEntity(esmfClock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STATE: {
				ESMFState esmfState = (ESMFState)theEObject;
				T result = caseESMFState(esmfState);
				if (result == null) result = caseESMFStateItem(esmfState);
				if (result == null) result = caseESMFScopedItem(esmfState);
				if (result == null) result = caseESMFNamedEntity(esmfState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_STATE_ITEM: {
				ESMFStateItem esmfStateItem = (ESMFStateItem)theEObject;
				T result = caseESMFStateItem(esmfStateItem);
				if (result == null) result = caseESMFScopedItem(esmfStateItem);
				if (result == null) result = caseESMFNamedEntity(esmfStateItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_FIELD: {
				ESMFField esmfField = (ESMFField)theEObject;
				T result = caseESMFField(esmfField);
				if (result == null) result = caseESMFStateItem(esmfField);
				if (result == null) result = caseESMFScopedItem(esmfField);
				if (result == null) result = caseESMFNamedEntity(esmfField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_FIELD_CONNECTION: {
				ESMFFieldConnection esmfFieldConnection = (ESMFFieldConnection)theEObject;
				T result = caseESMFFieldConnection(esmfFieldConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ARRAY: {
				ESMFArray esmfArray = (ESMFArray)theEObject;
				T result = caseESMFArray(esmfArray);
				if (result == null) result = caseESMFStateItem(esmfArray);
				if (result == null) result = caseESMFScopedItem(esmfArray);
				if (result == null) result = caseESMFNamedEntity(esmfArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ROUTE_HANDLE: {
				ESMFRouteHandle esmfRouteHandle = (ESMFRouteHandle)theEObject;
				T result = caseESMFRouteHandle(esmfRouteHandle);
				if (result == null) result = caseESMFScopedItem(esmfRouteHandle);
				if (result == null) result = caseESMFNamedEntity(esmfRouteHandle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ARRAY_SPEC: {
				ESMFArraySpec esmfArraySpec = (ESMFArraySpec)theEObject;
				T result = caseESMFArraySpec(esmfArraySpec);
				if (result == null) result = caseESMFScopedItem(esmfArraySpec);
				if (result == null) result = caseESMFNamedEntity(esmfArraySpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_GRID: {
				ESMFGrid esmfGrid = (ESMFGrid)theEObject;
				T result = caseESMFGrid(esmfGrid);
				if (result == null) result = caseESMFScopedItem(esmfGrid);
				if (result == null) result = caseESMFNamedEntity(esmfGrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.EXTENT: {
				Extent extent = (Extent)theEObject;
				T result = caseExtent(extent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_DIST_GRID: {
				ESMFDistGrid esmfDistGrid = (ESMFDistGrid)theEObject;
				T result = caseESMFDistGrid(esmfDistGrid);
				if (result == null) result = caseESMFScopedItem(esmfDistGrid);
				if (result == null) result = caseESMFNamedEntity(esmfDistGrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_VIRTUAL_MACHINE: {
				ESMFVirtualMachine esmfVirtualMachine = (ESMFVirtualMachine)theEObject;
				T result = caseESMFVirtualMachine(esmfVirtualMachine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_PERSISTENT_EXECUTION_THREAD: {
				ESMFPersistentExecutionThread esmfPersistentExecutionThread = (ESMFPersistentExecutionThread)theEObject;
				T result = caseESMFPersistentExecutionThread(esmfPersistentExecutionThread);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_DE_LAYOUT: {
				ESMFDELayout esmfdeLayout = (ESMFDELayout)theEObject;
				T result = caseESMFDELayout(esmfdeLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_DECOMPOSITION_ELEMENT: {
				ESMFDecompositionElement esmfDecompositionElement = (ESMFDecompositionElement)theEObject;
				T result = caseESMFDecompositionElement(esmfDecompositionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_VIRTUAL_ADDRESS_SPACE: {
				ESMFVirtualAddressSpace esmfVirtualAddressSpace = (ESMFVirtualAddressSpace)theEObject;
				T result = caseESMFVirtualAddressSpace(esmfVirtualAddressSpace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION: {
				ESMFAction esmfAction = (ESMFAction)theEObject;
				T result = caseESMFAction(esmfAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_API: {
				ESMFActionAPI esmfActionAPI = (ESMFActionAPI)theEObject;
				T result = caseESMFActionAPI(esmfActionAPI);
				if (result == null) result = caseESMFAction(esmfActionAPI);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE_PATTERN: {
				ESMFActionMethodInvokePattern esmfActionMethodInvokePattern = (ESMFActionMethodInvokePattern)theEObject;
				T result = caseESMFActionMethodInvokePattern(esmfActionMethodInvokePattern);
				if (result == null) result = caseESMFActionAPI(esmfActionMethodInvokePattern);
				if (result == null) result = caseESMFAction(esmfActionMethodInvokePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE_SEQUENCE: {
				ESMFActionMethodInvokeSequence esmfActionMethodInvokeSequence = (ESMFActionMethodInvokeSequence)theEObject;
				T result = caseESMFActionMethodInvokeSequence(esmfActionMethodInvokeSequence);
				if (result == null) result = caseESMFActionMethodInvokePattern(esmfActionMethodInvokeSequence);
				if (result == null) result = caseESMFActionAPI(esmfActionMethodInvokeSequence);
				if (result == null) result = caseESMFAction(esmfActionMethodInvokeSequence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE_ITERATION: {
				ESMFActionMethodInvokeIteration esmfActionMethodInvokeIteration = (ESMFActionMethodInvokeIteration)theEObject;
				T result = caseESMFActionMethodInvokeIteration(esmfActionMethodInvokeIteration);
				if (result == null) result = caseESMFActionMethodInvokeSequence(esmfActionMethodInvokeIteration);
				if (result == null) result = caseESMFActionMethodInvokePattern(esmfActionMethodInvokeIteration);
				if (result == null) result = caseESMFActionAPI(esmfActionMethodInvokeIteration);
				if (result == null) result = caseESMFAction(esmfActionMethodInvokeIteration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_STATE_ADD: {
				ESMFActionStateAdd esmfActionStateAdd = (ESMFActionStateAdd)theEObject;
				T result = caseESMFActionStateAdd(esmfActionStateAdd);
				if (result == null) result = caseESMFActionAPI(esmfActionStateAdd);
				if (result == null) result = caseESMFAction(esmfActionStateAdd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_STATE_CREATE: {
				ESMFActionStateCreate esmfActionStateCreate = (ESMFActionStateCreate)theEObject;
				T result = caseESMFActionStateCreate(esmfActionStateCreate);
				if (result == null) result = caseESMFActionAPI(esmfActionStateCreate);
				if (result == null) result = caseESMFAction(esmfActionStateCreate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_STATE_GET: {
				ESMFActionStateGet esmfActionStateGet = (ESMFActionStateGet)theEObject;
				T result = caseESMFActionStateGet(esmfActionStateGet);
				if (result == null) result = caseESMFActionAPI(esmfActionStateGet);
				if (result == null) result = caseESMFAction(esmfActionStateGet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_STATE_RECONCILE: {
				ESMFActionStateReconcile esmfActionStateReconcile = (ESMFActionStateReconcile)theEObject;
				T result = caseESMFActionStateReconcile(esmfActionStateReconcile);
				if (result == null) result = caseESMFActionAPI(esmfActionStateReconcile);
				if (result == null) result = caseESMFAction(esmfActionStateReconcile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE: {
				ESMFActionArrayCreate esmfActionArrayCreate = (ESMFActionArrayCreate)theEObject;
				T result = caseESMFActionArrayCreate(esmfActionArrayCreate);
				if (result == null) result = caseESMFActionAPI(esmfActionArrayCreate);
				if (result == null) result = caseESMFAction(esmfActionArrayCreate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS: {
				ESMFActionArrayCreateAllocateAS esmfActionArrayCreateAllocateAS = (ESMFActionArrayCreateAllocateAS)theEObject;
				T result = caseESMFActionArrayCreateAllocateAS(esmfActionArrayCreateAllocateAS);
				if (result == null) result = caseESMFActionAPI(esmfActionArrayCreateAllocateAS);
				if (result == null) result = caseESMFAction(esmfActionArrayCreateAllocateAS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET: {
				ESMFActionArraySpecSet esmfActionArraySpecSet = (ESMFActionArraySpecSet)theEObject;
				T result = caseESMFActionArraySpecSet(esmfActionArraySpecSet);
				if (result == null) result = caseESMFActionAPI(esmfActionArraySpecSet);
				if (result == null) result = caseESMFAction(esmfActionArraySpecSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE: {
				ESMFActionClockCreate esmfActionClockCreate = (ESMFActionClockCreate)theEObject;
				T result = caseESMFActionClockCreate(esmfActionClockCreate);
				if (result == null) result = caseESMFActionAPI(esmfActionClockCreate);
				if (result == null) result = caseESMFAction(esmfActionClockCreate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_CLOCK_GET: {
				ESMFActionClockGet esmfActionClockGet = (ESMFActionClockGet)theEObject;
				T result = caseESMFActionClockGet(esmfActionClockGet);
				if (result == null) result = caseESMFActionAPI(esmfActionClockGet);
				if (result == null) result = caseESMFAction(esmfActionClockGet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_CLOCK_GET_TIMESTEP: {
				ESMFActionClockGetTimestep esmfActionClockGetTimestep = (ESMFActionClockGetTimestep)theEObject;
				T result = caseESMFActionClockGetTimestep(esmfActionClockGetTimestep);
				if (result == null) result = caseESMFActionAPI(esmfActionClockGetTimestep);
				if (result == null) result = caseESMFAction(esmfActionClockGetTimestep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_CPL_COMP_CREATE: {
				ESMFActionCplCompCreate esmfActionCplCompCreate = (ESMFActionCplCompCreate)theEObject;
				T result = caseESMFActionCplCompCreate(esmfActionCplCompCreate);
				if (result == null) result = caseESMFActionAPI(esmfActionCplCompCreate);
				if (result == null) result = caseESMFAction(esmfActionCplCompCreate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE: {
				ESMFActionCplCompInitialize esmfActionCplCompInitialize = (ESMFActionCplCompInitialize)theEObject;
				T result = caseESMFActionCplCompInitialize(esmfActionCplCompInitialize);
				if (result == null) result = caseESMFActionAPI(esmfActionCplCompInitialize);
				if (result == null) result = caseESMFAction(esmfActionCplCompInitialize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_CPL_COMP_RUN: {
				ESMFActionCplCompRun esmfActionCplCompRun = (ESMFActionCplCompRun)theEObject;
				T result = caseESMFActionCplCompRun(esmfActionCplCompRun);
				if (result == null) result = caseESMFActionAPI(esmfActionCplCompRun);
				if (result == null) result = caseESMFAction(esmfActionCplCompRun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_CPL_COMP_FINALIZE: {
				ESMFActionCplCompFinalize esmfActionCplCompFinalize = (ESMFActionCplCompFinalize)theEObject;
				T result = caseESMFActionCplCompFinalize(esmfActionCplCompFinalize);
				if (result == null) result = caseESMFActionAPI(esmfActionCplCompFinalize);
				if (result == null) result = caseESMFAction(esmfActionCplCompFinalize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES: {
				ESMFActionCplCompSetServices esmfActionCplCompSetServices = (ESMFActionCplCompSetServices)theEObject;
				T result = caseESMFActionCplCompSetServices(esmfActionCplCompSetServices);
				if (result == null) result = caseESMFActionAPI(esmfActionCplCompSetServices);
				if (result == null) result = caseESMFAction(esmfActionCplCompSetServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE: {
				ESMFActionDistGridCreate esmfActionDistGridCreate = (ESMFActionDistGridCreate)theEObject;
				T result = caseESMFActionDistGridCreate(esmfActionDistGridCreate);
				if (result == null) result = caseESMFActionAPI(esmfActionDistGridCreate);
				if (result == null) result = caseESMFAction(esmfActionDistGridCreate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE: {
				ESMFActionFieldCreate esmfActionFieldCreate = (ESMFActionFieldCreate)theEObject;
				T result = caseESMFActionFieldCreate(esmfActionFieldCreate);
				if (result == null) result = caseESMFActionAPI(esmfActionFieldCreate);
				if (result == null) result = caseESMFAction(esmfActionFieldCreate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY: {
				ESMFActionFieldCreateGridArray esmfActionFieldCreateGridArray = (ESMFActionFieldCreateGridArray)theEObject;
				T result = caseESMFActionFieldCreateGridArray(esmfActionFieldCreateGridArray);
				if (result == null) result = caseESMFActionAPI(esmfActionFieldCreateGridArray);
				if (result == null) result = caseESMFAction(esmfActionFieldCreateGridArray);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC: {
				ESMFActionFieldCreateGridArraySpec esmfActionFieldCreateGridArraySpec = (ESMFActionFieldCreateGridArraySpec)theEObject;
				T result = caseESMFActionFieldCreateGridArraySpec(esmfActionFieldCreateGridArraySpec);
				if (result == null) result = caseESMFActionAPI(esmfActionFieldCreateGridArraySpec);
				if (result == null) result = caseESMFAction(esmfActionFieldCreateGridArraySpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR: {
				ESMFActionFieldCreateTKR esmfActionFieldCreateTKR = (ESMFActionFieldCreateTKR)theEObject;
				T result = caseESMFActionFieldCreateTKR(esmfActionFieldCreateTKR);
				if (result == null) result = caseESMFActionAPI(esmfActionFieldCreateTKR);
				if (result == null) result = caseESMFAction(esmfActionFieldCreateTKR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_FIELD_GET: {
				ESMFActionFieldGet esmfActionFieldGet = (ESMFActionFieldGet)theEObject;
				T result = caseESMFActionFieldGet(esmfActionFieldGet);
				if (result == null) result = caseESMFActionAPI(esmfActionFieldGet);
				if (result == null) result = caseESMFAction(esmfActionFieldGet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS: {
				ESMFActionFieldGetBounds esmfActionFieldGetBounds = (ESMFActionFieldGetBounds)theEObject;
				T result = caseESMFActionFieldGetBounds(esmfActionFieldGetBounds);
				if (result == null) result = caseESMFActionAPI(esmfActionFieldGetBounds);
				if (result == null) result = caseESMFAction(esmfActionFieldGetBounds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_FIELD_HALO_STORE: {
				ESMFActionFieldHaloStore esmfActionFieldHaloStore = (ESMFActionFieldHaloStore)theEObject;
				T result = caseESMFActionFieldHaloStore(esmfActionFieldHaloStore);
				if (result == null) result = caseESMFActionAPI(esmfActionFieldHaloStore);
				if (result == null) result = caseESMFAction(esmfActionFieldHaloStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_FIELD_HALO: {
				ESMFActionFieldHalo esmfActionFieldHalo = (ESMFActionFieldHalo)theEObject;
				T result = caseESMFActionFieldHalo(esmfActionFieldHalo);
				if (result == null) result = caseESMFActionAPI(esmfActionFieldHalo);
				if (result == null) result = caseESMFAction(esmfActionFieldHalo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_FIELD_HALO_RELEASE: {
				ESMFActionFieldHaloRelease esmfActionFieldHaloRelease = (ESMFActionFieldHaloRelease)theEObject;
				T result = caseESMFActionFieldHaloRelease(esmfActionFieldHaloRelease);
				if (result == null) result = caseESMFActionAPI(esmfActionFieldHaloRelease);
				if (result == null) result = caseESMFAction(esmfActionFieldHaloRelease);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST_STORE: {
				ESMFActionFieldRedistStore esmfActionFieldRedistStore = (ESMFActionFieldRedistStore)theEObject;
				T result = caseESMFActionFieldRedistStore(esmfActionFieldRedistStore);
				if (result == null) result = caseESMFActionAPI(esmfActionFieldRedistStore);
				if (result == null) result = caseESMFAction(esmfActionFieldRedistStore);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST: {
				ESMFActionFieldRedist esmfActionFieldRedist = (ESMFActionFieldRedist)theEObject;
				T result = caseESMFActionFieldRedist(esmfActionFieldRedist);
				if (result == null) result = caseESMFActionAPI(esmfActionFieldRedist);
				if (result == null) result = caseESMFAction(esmfActionFieldRedist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST_RELEASE: {
				ESMFActionFieldRedistRelease esmfActionFieldRedistRelease = (ESMFActionFieldRedistRelease)theEObject;
				T result = caseESMFActionFieldRedistRelease(esmfActionFieldRedistRelease);
				if (result == null) result = caseESMFActionAPI(esmfActionFieldRedistRelease);
				if (result == null) result = caseESMFAction(esmfActionFieldRedistRelease);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_FRAMEWORK_INIT: {
				ESMFActionFrameworkInit esmfActionFrameworkInit = (ESMFActionFrameworkInit)theEObject;
				T result = caseESMFActionFrameworkInit(esmfActionFrameworkInit);
				if (result == null) result = caseESMFActionAPI(esmfActionFrameworkInit);
				if (result == null) result = caseESMFAction(esmfActionFrameworkInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_FRAMEWORK_FINALIZE: {
				ESMFActionFrameworkFinalize esmfActionFrameworkFinalize = (ESMFActionFrameworkFinalize)theEObject;
				T result = caseESMFActionFrameworkFinalize(esmfActionFrameworkFinalize);
				if (result == null) result = caseESMFActionAPI(esmfActionFrameworkFinalize);
				if (result == null) result = caseESMFAction(esmfActionFrameworkFinalize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_GRID_CREATE: {
				ESMFActionGridCreate esmfActionGridCreate = (ESMFActionGridCreate)theEObject;
				T result = caseESMFActionGridCreate(esmfActionGridCreate);
				if (result == null) result = caseESMFActionAPI(esmfActionGridCreate);
				if (result == null) result = caseESMFAction(esmfActionGridCreate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_GRID_GET: {
				ESMFActionGridGet esmfActionGridGet = (ESMFActionGridGet)theEObject;
				T result = caseESMFActionGridGet(esmfActionGridGet);
				if (result == null) result = caseESMFActionAPI(esmfActionGridGet);
				if (result == null) result = caseESMFAction(esmfActionGridGet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE: {
				ESMFActionGridGetPLocalDe esmfActionGridGetPLocalDe = (ESMFActionGridGetPLocalDe)theEObject;
				T result = caseESMFActionGridGetPLocalDe(esmfActionGridGetPLocalDe);
				if (result == null) result = caseESMFActionGridGet(esmfActionGridGetPLocalDe);
				if (result == null) result = caseESMFActionAPI(esmfActionGridGetPLocalDe);
				if (result == null) result = caseESMFAction(esmfActionGridGetPLocalDe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC: {
				ESMFActionGridGetPLocalDePSloc esmfActionGridGetPLocalDePSloc = (ESMFActionGridGetPLocalDePSloc)theEObject;
				T result = caseESMFActionGridGetPLocalDePSloc(esmfActionGridGetPLocalDePSloc);
				if (result == null) result = caseESMFActionGridGetPLocalDe(esmfActionGridGetPLocalDePSloc);
				if (result == null) result = caseESMFActionGridGet(esmfActionGridGetPLocalDePSloc);
				if (result == null) result = caseESMFActionAPI(esmfActionGridGetPLocalDePSloc);
				if (result == null) result = caseESMFAction(esmfActionGridGetPLocalDePSloc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_GRID_GET_COORD: {
				ESMFActionGridGetCoord esmfActionGridGetCoord = (ESMFActionGridGetCoord)theEObject;
				T result = caseESMFActionGridGetCoord(esmfActionGridGetCoord);
				if (result == null) result = caseESMFActionAPI(esmfActionGridGetCoord);
				if (result == null) result = caseESMFAction(esmfActionGridGetCoord);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_GRID_COMP_CREATE: {
				ESMFActionGridCompCreate esmfActionGridCompCreate = (ESMFActionGridCompCreate)theEObject;
				T result = caseESMFActionGridCompCreate(esmfActionGridCompCreate);
				if (result == null) result = caseESMFActionAPI(esmfActionGridCompCreate);
				if (result == null) result = caseESMFAction(esmfActionGridCompCreate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_GRID_COMP_INITIALIZE: {
				ESMFActionGridCompInitialize esmfActionGridCompInitialize = (ESMFActionGridCompInitialize)theEObject;
				T result = caseESMFActionGridCompInitialize(esmfActionGridCompInitialize);
				if (result == null) result = caseESMFActionAPI(esmfActionGridCompInitialize);
				if (result == null) result = caseESMFAction(esmfActionGridCompInitialize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_GRID_COMP_RUN: {
				ESMFActionGridCompRun esmfActionGridCompRun = (ESMFActionGridCompRun)theEObject;
				T result = caseESMFActionGridCompRun(esmfActionGridCompRun);
				if (result == null) result = caseESMFActionAPI(esmfActionGridCompRun);
				if (result == null) result = caseESMFAction(esmfActionGridCompRun);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_GRID_COMP_FINALIZE: {
				ESMFActionGridCompFinalize esmfActionGridCompFinalize = (ESMFActionGridCompFinalize)theEObject;
				T result = caseESMFActionGridCompFinalize(esmfActionGridCompFinalize);
				if (result == null) result = caseESMFActionAPI(esmfActionGridCompFinalize);
				if (result == null) result = caseESMFAction(esmfActionGridCompFinalize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_GRID_COMP_SET_SERVICES: {
				ESMFActionGridCompSetServices esmfActionGridCompSetServices = (ESMFActionGridCompSetServices)theEObject;
				T result = caseESMFActionGridCompSetServices(esmfActionGridCompSetServices);
				if (result == null) result = caseESMFActionAPI(esmfActionGridCompSetServices);
				if (result == null) result = caseESMFAction(esmfActionGridCompSetServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE: {
				ESMFActionMethodInvoke esmfActionMethodInvoke = (ESMFActionMethodInvoke)theEObject;
				T result = caseESMFActionMethodInvoke(esmfActionMethodInvoke);
				if (result == null) result = caseESMFActionMethodInvokePattern(esmfActionMethodInvoke);
				if (result == null) result = caseESMFActionAPI(esmfActionMethodInvoke);
				if (result == null) result = caseESMFAction(esmfActionMethodInvoke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_TIME_SET: {
				ESMFActionTimeSet esmfActionTimeSet = (ESMFActionTimeSet)theEObject;
				T result = caseESMFActionTimeSet(esmfActionTimeSet);
				if (result == null) result = caseESMFActionAPI(esmfActionTimeSet);
				if (result == null) result = caseESMFAction(esmfActionTimeSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_TIME_GET: {
				ESMFActionTimeGet esmfActionTimeGet = (ESMFActionTimeGet)theEObject;
				T result = caseESMFActionTimeGet(esmfActionTimeGet);
				if (result == null) result = caseESMFActionAPI(esmfActionTimeGet);
				if (result == null) result = caseESMFAction(esmfActionTimeGet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_SET: {
				ESMFActionTimeIntervalSet esmfActionTimeIntervalSet = (ESMFActionTimeIntervalSet)theEObject;
				T result = caseESMFActionTimeIntervalSet(esmfActionTimeIntervalSet);
				if (result == null) result = caseESMFActionAPI(esmfActionTimeIntervalSet);
				if (result == null) result = caseESMFAction(esmfActionTimeIntervalSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET: {
				ESMFActionTimeIntervalGet esmfActionTimeIntervalGet = (ESMFActionTimeIntervalGet)theEObject;
				T result = caseESMFActionTimeIntervalGet(esmfActionTimeIntervalGet);
				if (result == null) result = caseESMFActionAPI(esmfActionTimeIntervalGet);
				if (result == null) result = caseESMFAction(esmfActionTimeIntervalGet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_ACTION_USER_SERVICE_INVOKE: {
				ESMFActionUserServiceInvoke esmfActionUserServiceInvoke = (ESMFActionUserServiceInvoke)theEObject;
				T result = caseESMFActionUserServiceInvoke(esmfActionUserServiceInvoke);
				if (result == null) result = caseESMFActionAPI(esmfActionUserServiceInvoke);
				if (result == null) result = caseESMFAction(esmfActionUserServiceInvoke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_CALL: {
				ESMFCall esmfCall = (ESMFCall)theEObject;
				T result = caseESMFCall(esmfCall);
				if (result == null) result = caseESMFAction(esmfCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_CALL_GRID_COMP_CREATE: {
				ESMFCallGridCompCreate esmfCallGridCompCreate = (ESMFCallGridCompCreate)theEObject;
				T result = caseESMFCallGridCompCreate(esmfCallGridCompCreate);
				if (result == null) result = caseESMFCall(esmfCallGridCompCreate);
				if (result == null) result = caseESMFAction(esmfCallGridCompCreate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_CALL_GRID_COMP_INITIALIZE: {
				ESMFCallGridCompInitialize esmfCallGridCompInitialize = (ESMFCallGridCompInitialize)theEObject;
				T result = caseESMFCallGridCompInitialize(esmfCallGridCompInitialize);
				if (result == null) result = caseESMFCall(esmfCallGridCompInitialize);
				if (result == null) result = caseESMFAction(esmfCallGridCompInitialize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_CALL_GRID_COMP_SET_SERVICES: {
				ESMFCallGridCompSetServices esmfCallGridCompSetServices = (ESMFCallGridCompSetServices)theEObject;
				T result = caseESMFCallGridCompSetServices(esmfCallGridCompSetServices);
				if (result == null) result = caseESMFCall(esmfCallGridCompSetServices);
				if (result == null) result = caseESMFAction(esmfCallGridCompSetServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_CALL_CPL_COMP_CREATE: {
				ESMFCallCplCompCreate esmfCallCplCompCreate = (ESMFCallCplCompCreate)theEObject;
				T result = caseESMFCallCplCompCreate(esmfCallCplCompCreate);
				if (result == null) result = caseESMFCall(esmfCallCplCompCreate);
				if (result == null) result = caseESMFAction(esmfCallCplCompCreate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_CALL_CPL_COMP_INITIALIZE: {
				ESMFCallCplCompInitialize esmfCallCplCompInitialize = (ESMFCallCplCompInitialize)theEObject;
				T result = caseESMFCallCplCompInitialize(esmfCallCplCompInitialize);
				if (result == null) result = caseESMFCall(esmfCallCplCompInitialize);
				if (result == null) result = caseESMFAction(esmfCallCplCompInitialize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_CALL_CPL_COMP_SET_SERVICES: {
				ESMFCallCplCompSetServices esmfCallCplCompSetServices = (ESMFCallCplCompSetServices)theEObject;
				T result = caseESMFCallCplCompSetServices(esmfCallCplCompSetServices);
				if (result == null) result = caseESMFCall(esmfCallCplCompSetServices);
				if (result == null) result = caseESMFAction(esmfCallCplCompSetServices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_CALL_FIELD_CREATE_SIDL: {
				ESMFCallFieldCreateSIDL esmfCallFieldCreateSIDL = (ESMFCallFieldCreateSIDL)theEObject;
				T result = caseESMFCallFieldCreateSIDL(esmfCallFieldCreateSIDL);
				if (result == null) result = caseESMFCall(esmfCallFieldCreateSIDL);
				if (result == null) result = caseESMFAction(esmfCallFieldCreateSIDL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ESMFPackage.ESMF_CALL_SIDL_METHOD: {
				ESMFCallSIDLMethod esmfCallSIDLMethod = (ESMFCallSIDLMethod)theEObject;
				T result = caseESMFCallSIDLMethod(esmfCallSIDLMethod);
				if (result == null) result = caseESMFCall(esmfCallSIDLMethod);
				if (result == null) result = caseESMFAction(esmfCallSIDLMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFComponent(ESMFComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gridded Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gridded Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFGriddedComponent(ESMFGriddedComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupler Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupler Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFCouplerComponent(ESMFCouplerComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Coupler Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Coupler Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFSimpleCouplerComponent(ESMFSimpleCouplerComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Driver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Driver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFDriver(ESMFDriver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStage(ESMFStage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Initialize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageInitialize(ESMFStageInitialize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Run</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageRun(ESMFStageRun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Finalize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Finalize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageFinalize(ESMFStageFinalize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageAction(ESMFStageAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionSequence(ESMFStageActionSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Iterate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Iterate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionIterate(ESMFStageActionIterate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Iterate Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Iterate Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionIterateClock(ESMFStageActionIterateClock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Field Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Field Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionFieldCreate(ESMFStageActionFieldCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Field Destroy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Field Destroy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionFieldDestroy(ESMFStageActionFieldDestroy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Field Redist Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Field Redist Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionFieldRedistStore(ESMFStageActionFieldRedistStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Field Redist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Field Redist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionFieldRedist(ESMFStageActionFieldRedist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Field Redist Release</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Field Redist Release</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionFieldRedistRelease(ESMFStageActionFieldRedistRelease object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Grid Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Grid Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionGridCreate(ESMFStageActionGridCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Grid Inherit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Grid Inherit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionGridInherit(ESMFStageActionGridInherit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Import State Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Import State Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionImportStateAdd(ESMFStageActionImportStateAdd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Export State Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Export State Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionExportStateAdd(ESMFStageActionExportStateAdd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Import State Get</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Import State Get</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionImportStateGet(ESMFStageActionImportStateGet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Export State Get</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Export State Get</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionExportStateGet(ESMFStageActionExportStateGet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action State Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action State Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionStateCreate(ESMFStageActionStateCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action State Destroy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action State Destroy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionStateDestroy(ESMFStageActionStateDestroy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Array Spec Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Array Spec Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionArraySpecCreate(ESMFStageActionArraySpecCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Component Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Component Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionComponentCreate(ESMFStageActionComponentCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Component Destroy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Component Destroy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionComponentDestroy(ESMFStageActionComponentDestroy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Component Set Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Component Set Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionComponentSetGrid(ESMFStageActionComponentSetGrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stage Action Execute Stage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stage Action Execute Stage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStageActionExecuteStage(ESMFStageActionExecuteStage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFMethod(ESMFMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Init Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Init Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFInitMethod(ESMFInitMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Init Method SIDL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Init Method SIDL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFPreInitMethodSIDL(ESMFPreInitMethodSIDL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Post Init Method SIDL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Post Init Method SIDL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFPostInitMethodSIDL(ESMFPostInitMethodSIDL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFRunMethod(ESMFRunMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finalize Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finalize Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFFinalizeMethod(ESMFFinalizeMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finalize Method SIDL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finalize Method SIDL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFFinalizeMethodSIDL(ESMFFinalizeMethodSIDL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFRegisterMethod(ESMFRegisterMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calendar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFCalendar(ESMFCalendar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFTimeInterval(ESMFTimeInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFTime(ESMFTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFClock(ESMFClock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFState(ESMFState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFStateItem(ESMFStateItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scoped Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scoped Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFScopedItem(ESMFScopedItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFField(ESMFField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFFieldConnection(ESMFFieldConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFArray(ESMFArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Handle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Handle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFRouteHandle(ESMFRouteHandle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFArraySpec(ESMFArraySpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFGrid(ESMFGrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtent(Extent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dist Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dist Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFDistGrid(ESMFDistGrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workspace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workspace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFWorkspace(ESMFWorkspace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFVirtualMachine(ESMFVirtualMachine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistent Execution Thread</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistent Execution Thread</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFPersistentExecutionThread(ESMFPersistentExecutionThread object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DE Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DE Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFDELayout(ESMFDELayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decomposition Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decomposition Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFDecompositionElement(ESMFDecompositionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Address Space</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Address Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFVirtualAddressSpace(ESMFVirtualAddressSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFAction(ESMFAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action API</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action API</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionAPI(ESMFActionAPI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Method Invoke Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Method Invoke Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionMethodInvokePattern(ESMFActionMethodInvokePattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Method Invoke Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Method Invoke Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionMethodInvokeSequence(ESMFActionMethodInvokeSequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Method Invoke Iteration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Method Invoke Iteration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionMethodInvokeIteration(ESMFActionMethodInvokeIteration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action State Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action State Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionStateAdd(ESMFActionStateAdd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action State Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action State Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionStateCreate(ESMFActionStateCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action State Get</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action State Get</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionStateGet(ESMFActionStateGet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action State Reconcile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action State Reconcile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionStateReconcile(ESMFActionStateReconcile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Array Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Array Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionArrayCreate(ESMFActionArrayCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Array Create Allocate AS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Array Create Allocate AS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionArrayCreateAllocateAS(ESMFActionArrayCreateAllocateAS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Array Spec Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Array Spec Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionArraySpecSet(ESMFActionArraySpecSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Clock Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Clock Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionClockCreate(ESMFActionClockCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Clock Get</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Clock Get</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionClockGet(ESMFActionClockGet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Clock Get Timestep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Clock Get Timestep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionClockGetTimestep(ESMFActionClockGetTimestep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Cpl Comp Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Cpl Comp Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionCplCompCreate(ESMFActionCplCompCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Cpl Comp Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Cpl Comp Initialize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionCplCompInitialize(ESMFActionCplCompInitialize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Cpl Comp Run</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Cpl Comp Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionCplCompRun(ESMFActionCplCompRun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Cpl Comp Finalize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Cpl Comp Finalize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionCplCompFinalize(ESMFActionCplCompFinalize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Cpl Comp Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Cpl Comp Set Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionCplCompSetServices(ESMFActionCplCompSetServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Dist Grid Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Dist Grid Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionDistGridCreate(ESMFActionDistGridCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Field Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Field Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionFieldCreate(ESMFActionFieldCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Field Create Grid Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Field Create Grid Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionFieldCreateGridArray(ESMFActionFieldCreateGridArray object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Field Create Grid Array Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Field Create Grid Array Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionFieldCreateGridArraySpec(ESMFActionFieldCreateGridArraySpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Field Create TKR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Field Create TKR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionFieldCreateTKR(ESMFActionFieldCreateTKR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Field Get</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Field Get</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionFieldGet(ESMFActionFieldGet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Field Get Bounds</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Field Get Bounds</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionFieldGetBounds(ESMFActionFieldGetBounds object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Field Halo Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Field Halo Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionFieldHaloStore(ESMFActionFieldHaloStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Field Halo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Field Halo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionFieldHalo(ESMFActionFieldHalo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Field Halo Release</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Field Halo Release</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionFieldHaloRelease(ESMFActionFieldHaloRelease object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Field Redist Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Field Redist Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionFieldRedistStore(ESMFActionFieldRedistStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Field Redist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Field Redist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionFieldRedist(ESMFActionFieldRedist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Field Redist Release</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Field Redist Release</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionFieldRedistRelease(ESMFActionFieldRedistRelease object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Framework Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Framework Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionFrameworkInit(ESMFActionFrameworkInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Framework Finalize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Framework Finalize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionFrameworkFinalize(ESMFActionFrameworkFinalize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Grid Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Grid Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionGridCreate(ESMFActionGridCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Grid Get</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Grid Get</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionGridGet(ESMFActionGridGet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Grid Get PLocal De</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Grid Get PLocal De</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionGridGetPLocalDe(ESMFActionGridGetPLocalDe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Grid Get PLocal De PSloc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Grid Get PLocal De PSloc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionGridGetPLocalDePSloc(ESMFActionGridGetPLocalDePSloc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Grid Get Coord</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Grid Get Coord</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionGridGetCoord(ESMFActionGridGetCoord object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Grid Comp Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Grid Comp Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionGridCompCreate(ESMFActionGridCompCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Grid Comp Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Grid Comp Initialize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionGridCompInitialize(ESMFActionGridCompInitialize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Grid Comp Run</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Grid Comp Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionGridCompRun(ESMFActionGridCompRun object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Grid Comp Finalize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Grid Comp Finalize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionGridCompFinalize(ESMFActionGridCompFinalize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Grid Comp Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Grid Comp Set Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionGridCompSetServices(ESMFActionGridCompSetServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Method Invoke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Method Invoke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionMethodInvoke(ESMFActionMethodInvoke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Time Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Time Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionTimeSet(ESMFActionTimeSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Time Get</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Time Get</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionTimeGet(ESMFActionTimeGet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Time Interval Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Time Interval Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionTimeIntervalSet(ESMFActionTimeIntervalSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Time Interval Get</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Time Interval Get</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionTimeIntervalGet(ESMFActionTimeIntervalGet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action User Service Invoke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action User Service Invoke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFActionUserServiceInvoke(ESMFActionUserServiceInvoke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFCall(ESMFCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Grid Comp Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Grid Comp Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFCallGridCompCreate(ESMFCallGridCompCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Grid Comp Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Grid Comp Initialize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFCallGridCompInitialize(ESMFCallGridCompInitialize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Grid Comp Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Grid Comp Set Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFCallGridCompSetServices(ESMFCallGridCompSetServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Cpl Comp Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Cpl Comp Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFCallCplCompCreate(ESMFCallCplCompCreate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Cpl Comp Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Cpl Comp Initialize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFCallCplCompInitialize(ESMFCallCplCompInitialize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Cpl Comp Set Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Cpl Comp Set Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFCallCplCompSetServices(ESMFCallCplCompSetServices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Field Create SIDL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Field Create SIDL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFCallFieldCreateSIDL(ESMFCallFieldCreateSIDL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call SIDL Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call SIDL Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFCallSIDLMethod(ESMFCallSIDLMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFNamedEntity(ESMFNamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseESMFScope(ESMFScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ESMFSwitch
