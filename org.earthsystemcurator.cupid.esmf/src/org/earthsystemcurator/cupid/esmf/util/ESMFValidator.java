/**
 */
package org.earthsystemcurator.cupid.esmf.util;

import java.util.Map;

import org.earthsystemcurator.cupid.esmf.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage
 * @generated
 */
public class ESMFValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ESMFValidator INSTANCE = new ESMFValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.earthsystemcurator.cupid.esmf";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ESMFPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ESMFPackage.ESMF_NAMED_ENTITY:
				return validateESMFNamedEntity((ESMFNamedEntity)value, diagnostics, context);
			case ESMFPackage.ESMF_SCOPE:
				return validateESMFScope((ESMFScope)value, diagnostics, context);
			case ESMFPackage.ESMF_COMPONENT:
				return validateESMFComponent((ESMFComponent)value, diagnostics, context);
			case ESMFPackage.ESMF_GRIDDED_COMPONENT:
				return validateESMFGriddedComponent((ESMFGriddedComponent)value, diagnostics, context);
			case ESMFPackage.ESMF_COUPLER_COMPONENT:
				return validateESMFCouplerComponent((ESMFCouplerComponent)value, diagnostics, context);
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT:
				return validateESMFSimpleCouplerComponent((ESMFSimpleCouplerComponent)value, diagnostics, context);
			case ESMFPackage.ESMF_DRIVER:
				return validateESMFDriver((ESMFDriver)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE:
				return validateESMFStage((ESMFStage)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_INITIALIZE:
				return validateESMFStageInitialize((ESMFStageInitialize)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_RUN:
				return validateESMFStageRun((ESMFStageRun)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_FINALIZE:
				return validateESMFStageFinalize((ESMFStageFinalize)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION:
				return validateESMFStageAction((ESMFStageAction)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE:
				return validateESMFStageActionSequence((ESMFStageActionSequence)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_ITERATE:
				return validateESMFStageActionIterate((ESMFStageActionIterate)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_ITERATE_CLOCK:
				return validateESMFStageActionIterateClock((ESMFStageActionIterateClock)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_ARRAY_SPEC_CREATE:
				return validateESMFStageActionArraySpecCreate((ESMFStageActionArraySpecCreate)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_COMPONENT_CREATE:
				return validateESMFStageActionComponentCreate((ESMFStageActionComponentCreate)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_COMPONENT_DESTROY:
				return validateESMFStageActionComponentDestroy((ESMFStageActionComponentDestroy)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_COMPONENT_SET_GRID:
				return validateESMFStageActionComponentSetGrid((ESMFStageActionComponentSetGrid)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_EXECUTE_STAGE:
				return validateESMFStageActionExecuteStage((ESMFStageActionExecuteStage)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_FIELD_CREATE:
				return validateESMFStageActionFieldCreate((ESMFStageActionFieldCreate)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_FIELD_DESTROY:
				return validateESMFStageActionFieldDestroy((ESMFStageActionFieldDestroy)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_FIELD_REDIST_STORE:
				return validateESMFStageActionFieldRedistStore((ESMFStageActionFieldRedistStore)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_FIELD_REDIST:
				return validateESMFStageActionFieldRedist((ESMFStageActionFieldRedist)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_FIELD_REDIST_RELEASE:
				return validateESMFStageActionFieldRedistRelease((ESMFStageActionFieldRedistRelease)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_GRID_CREATE:
				return validateESMFStageActionGridCreate((ESMFStageActionGridCreate)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_GRID_INHERIT:
				return validateESMFStageActionGridInherit((ESMFStageActionGridInherit)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_IMPORT_STATE_ADD:
				return validateESMFStageActionImportStateAdd((ESMFStageActionImportStateAdd)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_EXPORT_STATE_ADD:
				return validateESMFStageActionExportStateAdd((ESMFStageActionExportStateAdd)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_IMPORT_STATE_GET:
				return validateESMFStageActionImportStateGet((ESMFStageActionImportStateGet)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_EXPORT_STATE_GET:
				return validateESMFStageActionExportStateGet((ESMFStageActionExportStateGet)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_STATE_CREATE:
				return validateESMFStageActionStateCreate((ESMFStageActionStateCreate)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGE_ACTION_STATE_DESTROY:
				return validateESMFStageActionStateDestroy((ESMFStageActionStateDestroy)value, diagnostics, context);
			case ESMFPackage.ESMF_METHOD:
				return validateESMFMethod((ESMFMethod)value, diagnostics, context);
			case ESMFPackage.ESMF_INIT_METHOD:
				return validateESMFInitMethod((ESMFInitMethod)value, diagnostics, context);
			case ESMFPackage.ESMF_PRE_INIT_METHOD_SIDL:
				return validateESMFPreInitMethodSIDL((ESMFPreInitMethodSIDL)value, diagnostics, context);
			case ESMFPackage.ESMF_POST_INIT_METHOD_SIDL:
				return validateESMFPostInitMethodSIDL((ESMFPostInitMethodSIDL)value, diagnostics, context);
			case ESMFPackage.ESMF_RUN_METHOD:
				return validateESMFRunMethod((ESMFRunMethod)value, diagnostics, context);
			case ESMFPackage.ESMF_FINALIZE_METHOD:
				return validateESMFFinalizeMethod((ESMFFinalizeMethod)value, diagnostics, context);
			case ESMFPackage.ESMF_FINALIZE_METHOD_SIDL:
				return validateESMFFinalizeMethodSIDL((ESMFFinalizeMethodSIDL)value, diagnostics, context);
			case ESMFPackage.ESMF_REGISTER_METHOD:
				return validateESMFRegisterMethod((ESMFRegisterMethod)value, diagnostics, context);
			case ESMFPackage.ESMF_CALENDAR:
				return validateESMFCalendar((ESMFCalendar)value, diagnostics, context);
			case ESMFPackage.ESMF_TIME_INTERVAL:
				return validateESMFTimeInterval((ESMFTimeInterval)value, diagnostics, context);
			case ESMFPackage.ESMF_TIME:
				return validateESMFTime((ESMFTime)value, diagnostics, context);
			case ESMFPackage.ESMF_CLOCK:
				return validateESMFClock((ESMFClock)value, diagnostics, context);
			case ESMFPackage.ESMF_STATE:
				return validateESMFState((ESMFState)value, diagnostics, context);
			case ESMFPackage.ESMF_STATE_ITEM:
				return validateESMFStateItem((ESMFStateItem)value, diagnostics, context);
			case ESMFPackage.ESMF_SCOPED_ITEM:
				return validateESMFScopedItem((ESMFScopedItem)value, diagnostics, context);
			case ESMFPackage.ESMF_FIELD:
				return validateESMFField((ESMFField)value, diagnostics, context);
			case ESMFPackage.ESMF_FIELD_CONNECTION:
				return validateESMFFieldConnection((ESMFFieldConnection)value, diagnostics, context);
			case ESMFPackage.ESMF_ARRAY:
				return validateESMFArray((ESMFArray)value, diagnostics, context);
			case ESMFPackage.ESMF_ROUTE_HANDLE:
				return validateESMFRouteHandle((ESMFRouteHandle)value, diagnostics, context);
			case ESMFPackage.ESMF_ARRAY_SPEC:
				return validateESMFArraySpec((ESMFArraySpec)value, diagnostics, context);
			case ESMFPackage.ESMF_GRID:
				return validateESMFGrid((ESMFGrid)value, diagnostics, context);
			case ESMFPackage.EXTENT:
				return validateExtent((Extent)value, diagnostics, context);
			case ESMFPackage.ESMF_DIST_GRID:
				return validateESMFDistGrid((ESMFDistGrid)value, diagnostics, context);
			case ESMFPackage.ESMF_WORKSPACE:
				return validateESMFWorkspace((ESMFWorkspace)value, diagnostics, context);
			case ESMFPackage.ESMF_VIRTUAL_MACHINE:
				return validateESMFVirtualMachine((ESMFVirtualMachine)value, diagnostics, context);
			case ESMFPackage.ESMF_PERSISTENT_EXECUTION_THREAD:
				return validateESMFPersistentExecutionThread((ESMFPersistentExecutionThread)value, diagnostics, context);
			case ESMFPackage.ESMF_DE_LAYOUT:
				return validateESMFDELayout((ESMFDELayout)value, diagnostics, context);
			case ESMFPackage.ESMF_DECOMPOSITION_ELEMENT:
				return validateESMFDecompositionElement((ESMFDecompositionElement)value, diagnostics, context);
			case ESMFPackage.ESMF_VIRTUAL_ADDRESS_SPACE:
				return validateESMFVirtualAddressSpace((ESMFVirtualAddressSpace)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION:
				return validateESMFAction((ESMFAction)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_API:
				return validateESMFActionAPI((ESMFActionAPI)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE_PATTERN:
				return validateESMFActionMethodInvokePattern((ESMFActionMethodInvokePattern)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE_SEQUENCE:
				return validateESMFActionMethodInvokeSequence((ESMFActionMethodInvokeSequence)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE_ITERATION:
				return validateESMFActionMethodInvokeIteration((ESMFActionMethodInvokeIteration)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_STATE_ADD:
				return validateESMFActionStateAdd((ESMFActionStateAdd)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_STATE_CREATE:
				return validateESMFActionStateCreate((ESMFActionStateCreate)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_STATE_GET:
				return validateESMFActionStateGet((ESMFActionStateGet)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_STATE_RECONCILE:
				return validateESMFActionStateReconcile((ESMFActionStateReconcile)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE:
				return validateESMFActionArrayCreate((ESMFActionArrayCreate)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS:
				return validateESMFActionArrayCreateAllocateAS((ESMFActionArrayCreateAllocateAS)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET:
				return validateESMFActionArraySpecSet((ESMFActionArraySpecSet)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE:
				return validateESMFActionClockCreate((ESMFActionClockCreate)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_CLOCK_GET:
				return validateESMFActionClockGet((ESMFActionClockGet)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_CLOCK_GET_TIMESTEP:
				return validateESMFActionClockGetTimestep((ESMFActionClockGetTimestep)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_CPL_COMP_CREATE:
				return validateESMFActionCplCompCreate((ESMFActionCplCompCreate)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE:
				return validateESMFActionCplCompInitialize((ESMFActionCplCompInitialize)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_CPL_COMP_RUN:
				return validateESMFActionCplCompRun((ESMFActionCplCompRun)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_CPL_COMP_FINALIZE:
				return validateESMFActionCplCompFinalize((ESMFActionCplCompFinalize)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES:
				return validateESMFActionCplCompSetServices((ESMFActionCplCompSetServices)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE:
				return validateESMFActionDistGridCreate((ESMFActionDistGridCreate)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE:
				return validateESMFActionFieldCreate((ESMFActionFieldCreate)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY:
				return validateESMFActionFieldCreateGridArray((ESMFActionFieldCreateGridArray)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC:
				return validateESMFActionFieldCreateGridArraySpec((ESMFActionFieldCreateGridArraySpec)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR:
				return validateESMFActionFieldCreateTKR((ESMFActionFieldCreateTKR)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_FIELD_GET:
				return validateESMFActionFieldGet((ESMFActionFieldGet)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS:
				return validateESMFActionFieldGetBounds((ESMFActionFieldGetBounds)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_FIELD_HALO_STORE:
				return validateESMFActionFieldHaloStore((ESMFActionFieldHaloStore)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_FIELD_HALO:
				return validateESMFActionFieldHalo((ESMFActionFieldHalo)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_FIELD_HALO_RELEASE:
				return validateESMFActionFieldHaloRelease((ESMFActionFieldHaloRelease)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST_STORE:
				return validateESMFActionFieldRedistStore((ESMFActionFieldRedistStore)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST:
				return validateESMFActionFieldRedist((ESMFActionFieldRedist)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST_RELEASE:
				return validateESMFActionFieldRedistRelease((ESMFActionFieldRedistRelease)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_FRAMEWORK_INIT:
				return validateESMFActionFrameworkInit((ESMFActionFrameworkInit)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_FRAMEWORK_FINALIZE:
				return validateESMFActionFrameworkFinalize((ESMFActionFrameworkFinalize)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_GRID_CREATE:
				return validateESMFActionGridCreate((ESMFActionGridCreate)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_GRID_GET:
				return validateESMFActionGridGet((ESMFActionGridGet)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE:
				return validateESMFActionGridGetPLocalDe((ESMFActionGridGetPLocalDe)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC:
				return validateESMFActionGridGetPLocalDePSloc((ESMFActionGridGetPLocalDePSloc)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_GRID_GET_COORD:
				return validateESMFActionGridGetCoord((ESMFActionGridGetCoord)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_GRID_COMP_CREATE:
				return validateESMFActionGridCompCreate((ESMFActionGridCompCreate)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_GRID_COMP_INITIALIZE:
				return validateESMFActionGridCompInitialize((ESMFActionGridCompInitialize)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_GRID_COMP_RUN:
				return validateESMFActionGridCompRun((ESMFActionGridCompRun)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_GRID_COMP_FINALIZE:
				return validateESMFActionGridCompFinalize((ESMFActionGridCompFinalize)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_GRID_COMP_SET_SERVICES:
				return validateESMFActionGridCompSetServices((ESMFActionGridCompSetServices)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE:
				return validateESMFActionMethodInvoke((ESMFActionMethodInvoke)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_TIME_SET:
				return validateESMFActionTimeSet((ESMFActionTimeSet)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_TIME_GET:
				return validateESMFActionTimeGet((ESMFActionTimeGet)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_SET:
				return validateESMFActionTimeIntervalSet((ESMFActionTimeIntervalSet)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET:
				return validateESMFActionTimeIntervalGet((ESMFActionTimeIntervalGet)value, diagnostics, context);
			case ESMFPackage.ESMF_ACTION_USER_SERVICE_INVOKE:
				return validateESMFActionUserServiceInvoke((ESMFActionUserServiceInvoke)value, diagnostics, context);
			case ESMFPackage.ESMF_CALL:
				return validateESMFCall((ESMFCall)value, diagnostics, context);
			case ESMFPackage.ESMF_CALL_GRID_COMP_CREATE:
				return validateESMFCallGridCompCreate((ESMFCallGridCompCreate)value, diagnostics, context);
			case ESMFPackage.ESMF_CALL_GRID_COMP_INITIALIZE:
				return validateESMFCallGridCompInitialize((ESMFCallGridCompInitialize)value, diagnostics, context);
			case ESMFPackage.ESMF_CALL_GRID_COMP_SET_SERVICES:
				return validateESMFCallGridCompSetServices((ESMFCallGridCompSetServices)value, diagnostics, context);
			case ESMFPackage.ESMF_CALL_CPL_COMP_CREATE:
				return validateESMFCallCplCompCreate((ESMFCallCplCompCreate)value, diagnostics, context);
			case ESMFPackage.ESMF_CALL_CPL_COMP_INITIALIZE:
				return validateESMFCallCplCompInitialize((ESMFCallCplCompInitialize)value, diagnostics, context);
			case ESMFPackage.ESMF_CALL_CPL_COMP_SET_SERVICES:
				return validateESMFCallCplCompSetServices((ESMFCallCplCompSetServices)value, diagnostics, context);
			case ESMFPackage.ESMF_CALL_FIELD_CREATE_SIDL:
				return validateESMFCallFieldCreateSIDL((ESMFCallFieldCreateSIDL)value, diagnostics, context);
			case ESMFPackage.ESMF_CALL_SIDL_METHOD:
				return validateESMFCallSIDLMethod((ESMFCallSIDLMethod)value, diagnostics, context);
			case ESMFPackage.ESMF_CAL_KIND:
				return validateESMFCalKind((ESMFCalKind)value, diagnostics, context);
			case ESMFPackage.ESMF_STAGGER_LOC:
				return validateESMFStaggerLoc((ESMFStaggerLoc)value, diagnostics, context);
			case ESMFPackage.ESMF_TYPE_KIND:
				return validateESMFTypeKind((ESMFTypeKind)value, diagnostics, context);
			case ESMFPackage.ESMF_INDEX:
				return validateESMF_INDEX((ESMF_INDEX)value, diagnostics, context);
			case ESMFPackage.EINT_ARRAY:
				return validateEIntArray((int[])value, diagnostics, context);
			case ESMFPackage.ESMF_USER_TOKEN:
				return validateESMFUserToken((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFComponent(ESMFComponent esmfComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFGriddedComponent(ESMFGriddedComponent esmfGriddedComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfGriddedComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFCouplerComponent(ESMFCouplerComponent esmfCouplerComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfCouplerComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFSimpleCouplerComponent(ESMFSimpleCouplerComponent esmfSimpleCouplerComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfSimpleCouplerComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFDriver(ESMFDriver esmfDriver, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfDriver, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStage(ESMFStage esmfStage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageInitialize(ESMFStageInitialize esmfStageInitialize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageInitialize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageRun(ESMFStageRun esmfStageRun, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageRun, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageFinalize(ESMFStageFinalize esmfStageFinalize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageFinalize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageAction(ESMFStageAction esmfStageAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionSequence(ESMFStageActionSequence esmfStageActionSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionSequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionIterate(ESMFStageActionIterate esmfStageActionIterate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionIterate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionIterateClock(ESMFStageActionIterateClock esmfStageActionIterateClock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionIterateClock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionFieldCreate(ESMFStageActionFieldCreate esmfStageActionFieldCreate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionFieldCreate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionFieldDestroy(ESMFStageActionFieldDestroy esmfStageActionFieldDestroy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionFieldDestroy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionFieldRedistStore(ESMFStageActionFieldRedistStore esmfStageActionFieldRedistStore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionFieldRedistStore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionFieldRedist(ESMFStageActionFieldRedist esmfStageActionFieldRedist, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionFieldRedist, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionFieldRedistRelease(ESMFStageActionFieldRedistRelease esmfStageActionFieldRedistRelease, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionFieldRedistRelease, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionGridCreate(ESMFStageActionGridCreate esmfStageActionGridCreate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionGridCreate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionGridInherit(ESMFStageActionGridInherit esmfStageActionGridInherit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionGridInherit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionImportStateAdd(ESMFStageActionImportStateAdd esmfStageActionImportStateAdd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionImportStateAdd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionExportStateAdd(ESMFStageActionExportStateAdd esmfStageActionExportStateAdd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionExportStateAdd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionImportStateGet(ESMFStageActionImportStateGet esmfStageActionImportStateGet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionImportStateGet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionExportStateGet(ESMFStageActionExportStateGet esmfStageActionExportStateGet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionExportStateGet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionStateCreate(ESMFStageActionStateCreate esmfStageActionStateCreate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionStateCreate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionStateDestroy(ESMFStageActionStateDestroy esmfStageActionStateDestroy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionStateDestroy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionArraySpecCreate(ESMFStageActionArraySpecCreate esmfStageActionArraySpecCreate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionArraySpecCreate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionComponentCreate(ESMFStageActionComponentCreate esmfStageActionComponentCreate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionComponentCreate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionComponentDestroy(ESMFStageActionComponentDestroy esmfStageActionComponentDestroy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionComponentDestroy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionComponentSetGrid(ESMFStageActionComponentSetGrid esmfStageActionComponentSetGrid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionComponentSetGrid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStageActionExecuteStage(ESMFStageActionExecuteStage esmfStageActionExecuteStage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStageActionExecuteStage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFMethod(ESMFMethod esmfMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfMethod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFInitMethod(ESMFInitMethod esmfInitMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfInitMethod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFPreInitMethodSIDL(ESMFPreInitMethodSIDL esmfPreInitMethodSIDL, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfPreInitMethodSIDL, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFPostInitMethodSIDL(ESMFPostInitMethodSIDL esmfPostInitMethodSIDL, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfPostInitMethodSIDL, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFRunMethod(ESMFRunMethod esmfRunMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfRunMethod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFFinalizeMethod(ESMFFinalizeMethod esmfFinalizeMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfFinalizeMethod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFFinalizeMethodSIDL(ESMFFinalizeMethodSIDL esmfFinalizeMethodSIDL, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfFinalizeMethodSIDL, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFRegisterMethod(ESMFRegisterMethod esmfRegisterMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfRegisterMethod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFCalendar(ESMFCalendar esmfCalendar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfCalendar, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFTimeInterval(ESMFTimeInterval esmfTimeInterval, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfTimeInterval, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFTime(ESMFTime esmfTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfTime, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFClock(ESMFClock esmfClock, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfClock, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFState(ESMFState esmfState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStateItem(ESMFStateItem esmfStateItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfStateItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFScopedItem(ESMFScopedItem esmfScopedItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfScopedItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFField(ESMFField esmfField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFFieldConnection(ESMFFieldConnection esmfFieldConnection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfFieldConnection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFArray(ESMFArray esmfArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfArray, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFRouteHandle(ESMFRouteHandle esmfRouteHandle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfRouteHandle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFArraySpec(ESMFArraySpec esmfArraySpec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfArraySpec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFGrid(ESMFGrid esmfGrid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfGrid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtent(Extent extent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(extent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(extent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(extent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(extent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(extent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(extent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(extent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(extent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(extent, diagnostics, context);
		if (result || diagnostics != null) result &= validateExtent_MinLessThanOrEqualToMax(extent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLessThanOrEqualToMax constraint of '<em>Extent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtent_MinLessThanOrEqualToMax(Extent extent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "MinLessThanOrEqualToMax", getObjectLabel(extent, context) },
						 new Object[] { extent },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFDistGrid(ESMFDistGrid esmfDistGrid, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfDistGrid, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFWorkspace(ESMFWorkspace esmfWorkspace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfWorkspace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFVirtualMachine(ESMFVirtualMachine esmfVirtualMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(esmfVirtualMachine, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(esmfVirtualMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(esmfVirtualMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(esmfVirtualMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(esmfVirtualMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(esmfVirtualMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(esmfVirtualMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(esmfVirtualMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(esmfVirtualMachine, diagnostics, context);
		if (result || diagnostics != null) result &= validateESMFVirtualMachine_PETsAreSubsetOfParentVMPETs(esmfVirtualMachine, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PETsAreSubsetOfParentVMPETs constraint of '<em>Virtual Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFVirtualMachine_PETsAreSubsetOfParentVMPETs(ESMFVirtualMachine esmfVirtualMachine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "PETsAreSubsetOfParentVMPETs", getObjectLabel(esmfVirtualMachine, context) },
						 new Object[] { esmfVirtualMachine },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFPersistentExecutionThread(ESMFPersistentExecutionThread esmfPersistentExecutionThread, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfPersistentExecutionThread, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFDELayout(ESMFDELayout esmfdeLayout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(esmfdeLayout, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(esmfdeLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(esmfdeLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(esmfdeLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(esmfdeLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(esmfdeLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(esmfdeLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(esmfdeLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(esmfdeLayout, diagnostics, context);
		if (result || diagnostics != null) result &= validateESMFDELayout_MappedDEsOwnedByThisDELayout(esmfdeLayout, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MappedDEsOwnedByThisDELayout constraint of '<em>DE Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFDELayout_MappedDEsOwnedByThisDELayout(ESMFDELayout esmfdeLayout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "MappedDEsOwnedByThisDELayout", getObjectLabel(esmfdeLayout, context) },
						 new Object[] { esmfdeLayout },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFDecompositionElement(ESMFDecompositionElement esmfDecompositionElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(esmfDecompositionElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(esmfDecompositionElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(esmfDecompositionElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(esmfDecompositionElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(esmfDecompositionElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(esmfDecompositionElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(esmfDecompositionElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(esmfDecompositionElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(esmfDecompositionElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateESMFDecompositionElement_ExtentSizeEqualsParentDistGridExtentSize(esmfDecompositionElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ExtentSizeEqualsParentDistGridExtentSize constraint of '<em>Decomposition Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFDecompositionElement_ExtentSizeEqualsParentDistGridExtentSize(ESMFDecompositionElement esmfDecompositionElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ExtentSizeEqualsParentDistGridExtentSize", getObjectLabel(esmfDecompositionElement, context) },
						 new Object[] { esmfDecompositionElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFVirtualAddressSpace(ESMFVirtualAddressSpace esmfVirtualAddressSpace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfVirtualAddressSpace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFAction(ESMFAction esmfAction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfAction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionAPI(ESMFActionAPI esmfActionAPI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionAPI, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionMethodInvokePattern(ESMFActionMethodInvokePattern esmfActionMethodInvokePattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionMethodInvokePattern, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionMethodInvokeSequence(ESMFActionMethodInvokeSequence esmfActionMethodInvokeSequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionMethodInvokeSequence, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionMethodInvokeIteration(ESMFActionMethodInvokeIteration esmfActionMethodInvokeIteration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionMethodInvokeIteration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionStateAdd(ESMFActionStateAdd esmfActionStateAdd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionStateAdd, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionStateCreate(ESMFActionStateCreate esmfActionStateCreate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionStateCreate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionStateGet(ESMFActionStateGet esmfActionStateGet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionStateGet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionStateReconcile(ESMFActionStateReconcile esmfActionStateReconcile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionStateReconcile, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionArrayCreate(ESMFActionArrayCreate esmfActionArrayCreate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionArrayCreate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionArrayCreateAllocateAS(ESMFActionArrayCreateAllocateAS esmfActionArrayCreateAllocateAS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionArrayCreateAllocateAS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionArraySpecSet(ESMFActionArraySpecSet esmfActionArraySpecSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionArraySpecSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionClockCreate(ESMFActionClockCreate esmfActionClockCreate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionClockCreate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionClockGet(ESMFActionClockGet esmfActionClockGet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionClockGet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionClockGetTimestep(ESMFActionClockGetTimestep esmfActionClockGetTimestep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionClockGetTimestep, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionCplCompCreate(ESMFActionCplCompCreate esmfActionCplCompCreate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionCplCompCreate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionCplCompInitialize(ESMFActionCplCompInitialize esmfActionCplCompInitialize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionCplCompInitialize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionCplCompRun(ESMFActionCplCompRun esmfActionCplCompRun, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionCplCompRun, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionCplCompFinalize(ESMFActionCplCompFinalize esmfActionCplCompFinalize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionCplCompFinalize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionCplCompSetServices(ESMFActionCplCompSetServices esmfActionCplCompSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionCplCompSetServices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionDistGridCreate(ESMFActionDistGridCreate esmfActionDistGridCreate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionDistGridCreate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionFieldCreate(ESMFActionFieldCreate esmfActionFieldCreate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionFieldCreate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionFieldCreateGridArray(ESMFActionFieldCreateGridArray esmfActionFieldCreateGridArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionFieldCreateGridArray, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionFieldCreateGridArraySpec(ESMFActionFieldCreateGridArraySpec esmfActionFieldCreateGridArraySpec, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionFieldCreateGridArraySpec, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionFieldCreateTKR(ESMFActionFieldCreateTKR esmfActionFieldCreateTKR, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionFieldCreateTKR, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionFieldGet(ESMFActionFieldGet esmfActionFieldGet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionFieldGet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionFieldGetBounds(ESMFActionFieldGetBounds esmfActionFieldGetBounds, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionFieldGetBounds, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionFieldHaloStore(ESMFActionFieldHaloStore esmfActionFieldHaloStore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionFieldHaloStore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionFieldHalo(ESMFActionFieldHalo esmfActionFieldHalo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionFieldHalo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionFieldHaloRelease(ESMFActionFieldHaloRelease esmfActionFieldHaloRelease, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionFieldHaloRelease, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionFieldRedistStore(ESMFActionFieldRedistStore esmfActionFieldRedistStore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionFieldRedistStore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionFieldRedist(ESMFActionFieldRedist esmfActionFieldRedist, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionFieldRedist, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionFieldRedistRelease(ESMFActionFieldRedistRelease esmfActionFieldRedistRelease, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionFieldRedistRelease, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionFrameworkInit(ESMFActionFrameworkInit esmfActionFrameworkInit, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionFrameworkInit, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionFrameworkFinalize(ESMFActionFrameworkFinalize esmfActionFrameworkFinalize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionFrameworkFinalize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionGridCreate(ESMFActionGridCreate esmfActionGridCreate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionGridCreate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionGridGet(ESMFActionGridGet esmfActionGridGet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionGridGet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionGridGetPLocalDe(ESMFActionGridGetPLocalDe esmfActionGridGetPLocalDe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionGridGetPLocalDe, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionGridGetPLocalDePSloc(ESMFActionGridGetPLocalDePSloc esmfActionGridGetPLocalDePSloc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionGridGetPLocalDePSloc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionGridGetCoord(ESMFActionGridGetCoord esmfActionGridGetCoord, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionGridGetCoord, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionGridCompCreate(ESMFActionGridCompCreate esmfActionGridCompCreate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionGridCompCreate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionGridCompInitialize(ESMFActionGridCompInitialize esmfActionGridCompInitialize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionGridCompInitialize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionGridCompRun(ESMFActionGridCompRun esmfActionGridCompRun, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionGridCompRun, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionGridCompFinalize(ESMFActionGridCompFinalize esmfActionGridCompFinalize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionGridCompFinalize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionGridCompSetServices(ESMFActionGridCompSetServices esmfActionGridCompSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionGridCompSetServices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionMethodInvoke(ESMFActionMethodInvoke esmfActionMethodInvoke, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionMethodInvoke, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionTimeSet(ESMFActionTimeSet esmfActionTimeSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionTimeSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionTimeGet(ESMFActionTimeGet esmfActionTimeGet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionTimeGet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionTimeIntervalSet(ESMFActionTimeIntervalSet esmfActionTimeIntervalSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionTimeIntervalSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionTimeIntervalGet(ESMFActionTimeIntervalGet esmfActionTimeIntervalGet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionTimeIntervalGet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFActionUserServiceInvoke(ESMFActionUserServiceInvoke esmfActionUserServiceInvoke, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfActionUserServiceInvoke, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFCall(ESMFCall esmfCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFCallGridCompCreate(ESMFCallGridCompCreate esmfCallGridCompCreate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfCallGridCompCreate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFCallGridCompInitialize(ESMFCallGridCompInitialize esmfCallGridCompInitialize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfCallGridCompInitialize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFCallGridCompSetServices(ESMFCallGridCompSetServices esmfCallGridCompSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfCallGridCompSetServices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFCallCplCompCreate(ESMFCallCplCompCreate esmfCallCplCompCreate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfCallCplCompCreate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFCallCplCompInitialize(ESMFCallCplCompInitialize esmfCallCplCompInitialize, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfCallCplCompInitialize, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFCallCplCompSetServices(ESMFCallCplCompSetServices esmfCallCplCompSetServices, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfCallCplCompSetServices, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFCallFieldCreateSIDL(ESMFCallFieldCreateSIDL esmfCallFieldCreateSIDL, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfCallFieldCreateSIDL, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFCallSIDLMethod(ESMFCallSIDLMethod esmfCallSIDLMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfCallSIDLMethod, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFNamedEntity(ESMFNamedEntity esmfNamedEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfNamedEntity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFScope(ESMFScope esmfScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(esmfScope, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFCalKind(ESMFCalKind esmfCalKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFStaggerLoc(ESMFStaggerLoc esmfStaggerLoc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFTypeKind(ESMFTypeKind esmfTypeKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMF_INDEX(ESMF_INDEX esmF_INDEX, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEIntArray(int[] eIntArray, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateESMFUserToken(String esmfUserToken, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //ESMFValidator
