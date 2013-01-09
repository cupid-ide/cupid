/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ESMFFactoryImpl extends EFactoryImpl implements ESMFFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESMFFactory init() {
		try {
			ESMFFactory theESMFFactory = (ESMFFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.earthsystemcurator.org/cupid/esmf"); 
			if (theESMFFactory != null) {
				return theESMFFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ESMFFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ESMFPackage.ESMF_GRIDDED_COMPONENT: return createESMFGriddedComponent();
			case ESMFPackage.ESMF_COUPLER_COMPONENT: return createESMFCouplerComponent();
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT: return createESMFSimpleCouplerComponent();
			case ESMFPackage.ESMF_METHOD: return createESMFMethod();
			case ESMFPackage.ESMF_INIT_METHOD: return createESMFInitMethod();
			case ESMFPackage.ESMF_PRE_INIT_METHOD_SIDL: return createESMFPreInitMethodSIDL();
			case ESMFPackage.ESMF_POST_INIT_METHOD_SIDL: return createESMFPostInitMethodSIDL();
			case ESMFPackage.ESMF_RUN_METHOD: return createESMFRunMethod();
			case ESMFPackage.ESMF_FINALIZE_METHOD: return createESMFFinalizeMethod();
			case ESMFPackage.ESMF_FINALIZE_METHOD_SIDL: return createESMFFinalizeMethodSIDL();
			case ESMFPackage.ESMF_REGISTER_METHOD: return createESMFRegisterMethod();
			case ESMFPackage.ESMF_TIME_INTERVAL: return createESMFTimeInterval();
			case ESMFPackage.ESMF_TIME: return createESMFTime();
			case ESMFPackage.ESMF_CLOCK: return createESMFClock();
			case ESMFPackage.ESMF_STATE: return createESMFState();
			case ESMFPackage.ESMF_FIELD: return createESMFField();
			case ESMFPackage.ESMF_FIELD_CONNECTION: return createESMFFieldConnection();
			case ESMFPackage.ESMF_ARRAY: return createESMFArray();
			case ESMFPackage.ESMF_ROUTE_HANDLE: return createESMFRouteHandle();
			case ESMFPackage.ESMF_ARRAY_SPEC: return createESMFArraySpec();
			case ESMFPackage.ESMF_GRID: return createESMFGrid();
			case ESMFPackage.EXTENT: return createExtent();
			case ESMFPackage.ESMF_DIST_GRID: return createESMFDistGrid();
			case ESMFPackage.ESMF_WORKSPACE: return createESMFWorkspace();
			case ESMFPackage.ESMF_VIRTUAL_MACHINE: return createESMFVirtualMachine();
			case ESMFPackage.ESMF_PERSISTENT_EXECUTION_THREAD: return createESMFPersistentExecutionThread();
			case ESMFPackage.ESMF_DE_LAYOUT: return createESMFDELayout();
			case ESMFPackage.ESMF_DECOMPOSITION_ELEMENT: return createESMFDecompositionElement();
			case ESMFPackage.ESMF_VIRTUAL_ADDRESS_SPACE: return createESMFVirtualAddressSpace();
			case ESMFPackage.ESMF_ACTION: return createESMFAction();
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE_PATTERN: return createESMFActionMethodInvokePattern();
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE_SEQUENCE: return createESMFActionMethodInvokeSequence();
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE_ITERATION: return createESMFActionMethodInvokeIteration();
			case ESMFPackage.ESMF_ACTION_STATE_ADD: return createESMFActionStateAdd();
			case ESMFPackage.ESMF_ACTION_STATE_CREATE: return createESMFActionStateCreate();
			case ESMFPackage.ESMF_ACTION_STATE_GET: return createESMFActionStateGet();
			case ESMFPackage.ESMF_ACTION_STATE_RECONCILE: return createESMFActionStateReconcile();
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE: return createESMFActionArrayCreate();
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS: return createESMFActionArrayCreateAllocateAS();
			case ESMFPackage.ESMF_ACTION_ARRAY_SPEC_SET: return createESMFActionArraySpecSet();
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE: return createESMFActionClockCreate();
			case ESMFPackage.ESMF_ACTION_CLOCK_GET: return createESMFActionClockGet();
			case ESMFPackage.ESMF_ACTION_CLOCK_GET_TIMESTEP: return createESMFActionClockGetTimestep();
			case ESMFPackage.ESMF_ACTION_CPL_COMP_CREATE: return createESMFActionCplCompCreate();
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE: return createESMFActionCplCompInitialize();
			case ESMFPackage.ESMF_ACTION_CPL_COMP_RUN: return createESMFActionCplCompRun();
			case ESMFPackage.ESMF_ACTION_CPL_COMP_FINALIZE: return createESMFActionCplCompFinalize();
			case ESMFPackage.ESMF_ACTION_CPL_COMP_SET_SERVICES: return createESMFActionCplCompSetServices();
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE: return createESMFActionDistGridCreate();
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE: return createESMFActionFieldCreate();
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY: return createESMFActionFieldCreateGridArray();
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC: return createESMFActionFieldCreateGridArraySpec();
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR: return createESMFActionFieldCreateTKR();
			case ESMFPackage.ESMF_ACTION_FIELD_GET: return createESMFActionFieldGet();
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS: return createESMFActionFieldGetBounds();
			case ESMFPackage.ESMF_ACTION_FIELD_HALO_STORE: return createESMFActionFieldHaloStore();
			case ESMFPackage.ESMF_ACTION_FIELD_HALO: return createESMFActionFieldHalo();
			case ESMFPackage.ESMF_ACTION_FIELD_HALO_RELEASE: return createESMFActionFieldHaloRelease();
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST_STORE: return createESMFActionFieldRedistStore();
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST: return createESMFActionFieldRedist();
			case ESMFPackage.ESMF_ACTION_FIELD_REDIST_RELEASE: return createESMFActionFieldRedistRelease();
			case ESMFPackage.ESMF_ACTION_FRAMEWORK_INIT: return createESMFActionFrameworkInit();
			case ESMFPackage.ESMF_ACTION_FRAMEWORK_FINALIZE: return createESMFActionFrameworkFinalize();
			case ESMFPackage.ESMF_ACTION_GRID_CREATE: return createESMFActionGridCreate();
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE: return createESMFActionGridGetPLocalDe();
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC: return createESMFActionGridGetPLocalDePSloc();
			case ESMFPackage.ESMF_ACTION_GRID_GET_COORD: return createESMFActionGridGetCoord();
			case ESMFPackage.ESMF_ACTION_GRID_COMP_CREATE: return createESMFActionGridCompCreate();
			case ESMFPackage.ESMF_ACTION_GRID_COMP_INITIALIZE: return createESMFActionGridCompInitialize();
			case ESMFPackage.ESMF_ACTION_GRID_COMP_RUN: return createESMFActionGridCompRun();
			case ESMFPackage.ESMF_ACTION_GRID_COMP_FINALIZE: return createESMFActionGridCompFinalize();
			case ESMFPackage.ESMF_ACTION_GRID_COMP_SET_SERVICES: return createESMFActionGridCompSetServices();
			case ESMFPackage.ESMF_ACTION_METHOD_INVOKE: return createESMFActionMethodInvoke();
			case ESMFPackage.ESMF_ACTION_TIME_SET: return createESMFActionTimeSet();
			case ESMFPackage.ESMF_ACTION_TIME_GET: return createESMFActionTimeGet();
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_SET: return createESMFActionTimeIntervalSet();
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET: return createESMFActionTimeIntervalGet();
			case ESMFPackage.ESMF_ACTION_USER_SERVICE_INVOKE: return createESMFActionUserServiceInvoke();
			case ESMFPackage.ESMF_CALL: return createESMFCall();
			case ESMFPackage.ESMF_CALL_GRID_COMP_CREATE: return createESMFCallGridCompCreate();
			case ESMFPackage.ESMF_CALL_GRID_COMP_INITIALIZE: return createESMFCallGridCompInitialize();
			case ESMFPackage.ESMF_CALL_GRID_COMP_SET_SERVICES: return createESMFCallGridCompSetServices();
			case ESMFPackage.ESMF_CALL_CPL_COMP_CREATE: return createESMFCallCplCompCreate();
			case ESMFPackage.ESMF_CALL_CPL_COMP_INITIALIZE: return createESMFCallCplCompInitialize();
			case ESMFPackage.ESMF_CALL_CPL_COMP_SET_SERVICES: return createESMFCallCplCompSetServices();
			case ESMFPackage.ESMF_CALL_FIELD_CREATE_SIDL: return createESMFCallFieldCreateSIDL();
			case ESMFPackage.ESMF_CALL_SIDL_METHOD: return createESMFCallSIDLMethod();
			case ESMFPackage.ESMF_NAMED_ENTITY: return createESMFNamedEntity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ESMFPackage.ESMF_CAL_KIND:
				return createESMFCalKindFromString(eDataType, initialValue);
			case ESMFPackage.ESMF_STAGGER_LOC:
				return createESMFStaggerLocFromString(eDataType, initialValue);
			case ESMFPackage.ESMF_TYPE_KIND:
				return createESMFTypeKindFromString(eDataType, initialValue);
			case ESMFPackage.ESMF_INDEX:
				return createESMF_INDEXFromString(eDataType, initialValue);
			case ESMFPackage.EINT_ARRAY:
				return createEIntArrayFromString(eDataType, initialValue);
			case ESMFPackage.ESMF_USER_TOKEN:
				return createESMFUserTokenFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ESMFPackage.ESMF_CAL_KIND:
				return convertESMFCalKindToString(eDataType, instanceValue);
			case ESMFPackage.ESMF_STAGGER_LOC:
				return convertESMFStaggerLocToString(eDataType, instanceValue);
			case ESMFPackage.ESMF_TYPE_KIND:
				return convertESMFTypeKindToString(eDataType, instanceValue);
			case ESMFPackage.ESMF_INDEX:
				return convertESMF_INDEXToString(eDataType, instanceValue);
			case ESMFPackage.EINT_ARRAY:
				return convertEIntArrayToString(eDataType, instanceValue);
			case ESMFPackage.ESMF_USER_TOKEN:
				return convertESMFUserTokenToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFGriddedComponent createESMFGriddedComponent() {
		ESMFGriddedComponentImpl esmfGriddedComponent = new ESMFGriddedComponentImpl();
		return esmfGriddedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFCouplerComponent createESMFCouplerComponent() {
		ESMFCouplerComponentImpl esmfCouplerComponent = new ESMFCouplerComponentImpl();
		return esmfCouplerComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFSimpleCouplerComponent createESMFSimpleCouplerComponent() {
		ESMFSimpleCouplerComponentImpl esmfSimpleCouplerComponent = new ESMFSimpleCouplerComponentImpl();
		return esmfSimpleCouplerComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFMethod createESMFMethod() {
		ESMFMethodImpl esmfMethod = new ESMFMethodImpl();
		return esmfMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFInitMethod createESMFInitMethod() {
		ESMFInitMethodImpl esmfInitMethod = new ESMFInitMethodImpl();
		return esmfInitMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFPreInitMethodSIDL createESMFPreInitMethodSIDL() {
		ESMFPreInitMethodSIDLImpl esmfPreInitMethodSIDL = new ESMFPreInitMethodSIDLImpl();
		return esmfPreInitMethodSIDL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFPostInitMethodSIDL createESMFPostInitMethodSIDL() {
		ESMFPostInitMethodSIDLImpl esmfPostInitMethodSIDL = new ESMFPostInitMethodSIDLImpl();
		return esmfPostInitMethodSIDL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFRunMethod createESMFRunMethod() {
		ESMFRunMethodImpl esmfRunMethod = new ESMFRunMethodImpl();
		return esmfRunMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFFinalizeMethod createESMFFinalizeMethod() {
		ESMFFinalizeMethodImpl esmfFinalizeMethod = new ESMFFinalizeMethodImpl();
		return esmfFinalizeMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFFinalizeMethodSIDL createESMFFinalizeMethodSIDL() {
		ESMFFinalizeMethodSIDLImpl esmfFinalizeMethodSIDL = new ESMFFinalizeMethodSIDLImpl();
		return esmfFinalizeMethodSIDL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFRegisterMethod createESMFRegisterMethod() {
		ESMFRegisterMethodImpl esmfRegisterMethod = new ESMFRegisterMethodImpl();
		return esmfRegisterMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTimeInterval createESMFTimeInterval() {
		ESMFTimeIntervalImpl esmfTimeInterval = new ESMFTimeIntervalImpl();
		return esmfTimeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTime createESMFTime() {
		ESMFTimeImpl esmfTime = new ESMFTimeImpl();
		return esmfTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFClock createESMFClock() {
		ESMFClockImpl esmfClock = new ESMFClockImpl();
		return esmfClock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState createESMFState() {
		ESMFStateImpl esmfState = new ESMFStateImpl();
		return esmfState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFField createESMFField() {
		ESMFFieldImpl esmfField = new ESMFFieldImpl();
		return esmfField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFFieldConnection createESMFFieldConnection() {
		ESMFFieldConnectionImpl esmfFieldConnection = new ESMFFieldConnectionImpl();
		return esmfFieldConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFArray createESMFArray() {
		ESMFArrayImpl esmfArray = new ESMFArrayImpl();
		return esmfArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFRouteHandle createESMFRouteHandle() {
		ESMFRouteHandleImpl esmfRouteHandle = new ESMFRouteHandleImpl();
		return esmfRouteHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFArraySpec createESMFArraySpec() {
		ESMFArraySpecImpl esmfArraySpec = new ESMFArraySpecImpl();
		return esmfArraySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFGrid createESMFGrid() {
		ESMFGridImpl esmfGrid = new ESMFGridImpl();
		return esmfGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Extent createExtent() {
		ExtentImpl extent = new ExtentImpl();
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFDistGrid createESMFDistGrid() {
		ESMFDistGridImpl esmfDistGrid = new ESMFDistGridImpl();
		return esmfDistGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFWorkspace createESMFWorkspace() {
		ESMFWorkspaceImpl esmfWorkspace = new ESMFWorkspaceImpl();
		return esmfWorkspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFVirtualMachine createESMFVirtualMachine() {
		ESMFVirtualMachineImpl esmfVirtualMachine = new ESMFVirtualMachineImpl();
		return esmfVirtualMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFPersistentExecutionThread createESMFPersistentExecutionThread() {
		ESMFPersistentExecutionThreadImpl esmfPersistentExecutionThread = new ESMFPersistentExecutionThreadImpl();
		return esmfPersistentExecutionThread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFDELayout createESMFDELayout() {
		ESMFDELayoutImpl esmfdeLayout = new ESMFDELayoutImpl();
		return esmfdeLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFDecompositionElement createESMFDecompositionElement() {
		ESMFDecompositionElementImpl esmfDecompositionElement = new ESMFDecompositionElementImpl();
		return esmfDecompositionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFVirtualAddressSpace createESMFVirtualAddressSpace() {
		ESMFVirtualAddressSpaceImpl esmfVirtualAddressSpace = new ESMFVirtualAddressSpaceImpl();
		return esmfVirtualAddressSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFAction createESMFAction() {
		ESMFActionImpl esmfAction = new ESMFActionImpl();
		return esmfAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionMethodInvokePattern createESMFActionMethodInvokePattern() {
		ESMFActionMethodInvokePatternImpl esmfActionMethodInvokePattern = new ESMFActionMethodInvokePatternImpl();
		return esmfActionMethodInvokePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionMethodInvokeSequence createESMFActionMethodInvokeSequence() {
		ESMFActionMethodInvokeSequenceImpl esmfActionMethodInvokeSequence = new ESMFActionMethodInvokeSequenceImpl();
		return esmfActionMethodInvokeSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionMethodInvokeIteration createESMFActionMethodInvokeIteration() {
		ESMFActionMethodInvokeIterationImpl esmfActionMethodInvokeIteration = new ESMFActionMethodInvokeIterationImpl();
		return esmfActionMethodInvokeIteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionStateAdd createESMFActionStateAdd() {
		ESMFActionStateAddImpl esmfActionStateAdd = new ESMFActionStateAddImpl();
		return esmfActionStateAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionStateCreate createESMFActionStateCreate() {
		ESMFActionStateCreateImpl esmfActionStateCreate = new ESMFActionStateCreateImpl();
		return esmfActionStateCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionStateGet createESMFActionStateGet() {
		ESMFActionStateGetImpl esmfActionStateGet = new ESMFActionStateGetImpl();
		return esmfActionStateGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionStateReconcile createESMFActionStateReconcile() {
		ESMFActionStateReconcileImpl esmfActionStateReconcile = new ESMFActionStateReconcileImpl();
		return esmfActionStateReconcile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionArrayCreate createESMFActionArrayCreate() {
		ESMFActionArrayCreateImpl esmfActionArrayCreate = new ESMFActionArrayCreateImpl();
		return esmfActionArrayCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionArrayCreateAllocateAS createESMFActionArrayCreateAllocateAS() {
		ESMFActionArrayCreateAllocateASImpl esmfActionArrayCreateAllocateAS = new ESMFActionArrayCreateAllocateASImpl();
		return esmfActionArrayCreateAllocateAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionArraySpecSet createESMFActionArraySpecSet() {
		ESMFActionArraySpecSetImpl esmfActionArraySpecSet = new ESMFActionArraySpecSetImpl();
		return esmfActionArraySpecSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionClockCreate createESMFActionClockCreate() {
		ESMFActionClockCreateImpl esmfActionClockCreate = new ESMFActionClockCreateImpl();
		return esmfActionClockCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionClockGet createESMFActionClockGet() {
		ESMFActionClockGetImpl esmfActionClockGet = new ESMFActionClockGetImpl();
		return esmfActionClockGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionClockGetTimestep createESMFActionClockGetTimestep() {
		ESMFActionClockGetTimestepImpl esmfActionClockGetTimestep = new ESMFActionClockGetTimestepImpl();
		return esmfActionClockGetTimestep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionCplCompCreate createESMFActionCplCompCreate() {
		ESMFActionCplCompCreateImpl esmfActionCplCompCreate = new ESMFActionCplCompCreateImpl();
		return esmfActionCplCompCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionCplCompInitialize createESMFActionCplCompInitialize() {
		ESMFActionCplCompInitializeImpl esmfActionCplCompInitialize = new ESMFActionCplCompInitializeImpl();
		return esmfActionCplCompInitialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionCplCompRun createESMFActionCplCompRun() {
		ESMFActionCplCompRunImpl esmfActionCplCompRun = new ESMFActionCplCompRunImpl();
		return esmfActionCplCompRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionCplCompFinalize createESMFActionCplCompFinalize() {
		ESMFActionCplCompFinalizeImpl esmfActionCplCompFinalize = new ESMFActionCplCompFinalizeImpl();
		return esmfActionCplCompFinalize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionCplCompSetServices createESMFActionCplCompSetServices() {
		ESMFActionCplCompSetServicesImpl esmfActionCplCompSetServices = new ESMFActionCplCompSetServicesImpl();
		return esmfActionCplCompSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionDistGridCreate createESMFActionDistGridCreate() {
		ESMFActionDistGridCreateImpl esmfActionDistGridCreate = new ESMFActionDistGridCreateImpl();
		return esmfActionDistGridCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionFieldCreate createESMFActionFieldCreate() {
		ESMFActionFieldCreateImpl esmfActionFieldCreate = new ESMFActionFieldCreateImpl();
		return esmfActionFieldCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionFieldCreateGridArray createESMFActionFieldCreateGridArray() {
		ESMFActionFieldCreateGridArrayImpl esmfActionFieldCreateGridArray = new ESMFActionFieldCreateGridArrayImpl();
		return esmfActionFieldCreateGridArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionFieldCreateGridArraySpec createESMFActionFieldCreateGridArraySpec() {
		ESMFActionFieldCreateGridArraySpecImpl esmfActionFieldCreateGridArraySpec = new ESMFActionFieldCreateGridArraySpecImpl();
		return esmfActionFieldCreateGridArraySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionFieldCreateTKR createESMFActionFieldCreateTKR() {
		ESMFActionFieldCreateTKRImpl esmfActionFieldCreateTKR = new ESMFActionFieldCreateTKRImpl();
		return esmfActionFieldCreateTKR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionFieldGet createESMFActionFieldGet() {
		ESMFActionFieldGetImpl esmfActionFieldGet = new ESMFActionFieldGetImpl();
		return esmfActionFieldGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionFieldGetBounds createESMFActionFieldGetBounds() {
		ESMFActionFieldGetBoundsImpl esmfActionFieldGetBounds = new ESMFActionFieldGetBoundsImpl();
		return esmfActionFieldGetBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionFieldHaloStore createESMFActionFieldHaloStore() {
		ESMFActionFieldHaloStoreImpl esmfActionFieldHaloStore = new ESMFActionFieldHaloStoreImpl();
		return esmfActionFieldHaloStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionFieldHalo createESMFActionFieldHalo() {
		ESMFActionFieldHaloImpl esmfActionFieldHalo = new ESMFActionFieldHaloImpl();
		return esmfActionFieldHalo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionFieldHaloRelease createESMFActionFieldHaloRelease() {
		ESMFActionFieldHaloReleaseImpl esmfActionFieldHaloRelease = new ESMFActionFieldHaloReleaseImpl();
		return esmfActionFieldHaloRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionFieldRedistStore createESMFActionFieldRedistStore() {
		ESMFActionFieldRedistStoreImpl esmfActionFieldRedistStore = new ESMFActionFieldRedistStoreImpl();
		return esmfActionFieldRedistStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionFieldRedist createESMFActionFieldRedist() {
		ESMFActionFieldRedistImpl esmfActionFieldRedist = new ESMFActionFieldRedistImpl();
		return esmfActionFieldRedist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionFieldRedistRelease createESMFActionFieldRedistRelease() {
		ESMFActionFieldRedistReleaseImpl esmfActionFieldRedistRelease = new ESMFActionFieldRedistReleaseImpl();
		return esmfActionFieldRedistRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionFrameworkInit createESMFActionFrameworkInit() {
		ESMFActionFrameworkInitImpl esmfActionFrameworkInit = new ESMFActionFrameworkInitImpl();
		return esmfActionFrameworkInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionFrameworkFinalize createESMFActionFrameworkFinalize() {
		ESMFActionFrameworkFinalizeImpl esmfActionFrameworkFinalize = new ESMFActionFrameworkFinalizeImpl();
		return esmfActionFrameworkFinalize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionGridCreate createESMFActionGridCreate() {
		ESMFActionGridCreateImpl esmfActionGridCreate = new ESMFActionGridCreateImpl();
		return esmfActionGridCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionGridGetPLocalDe createESMFActionGridGetPLocalDe() {
		ESMFActionGridGetPLocalDeImpl esmfActionGridGetPLocalDe = new ESMFActionGridGetPLocalDeImpl();
		return esmfActionGridGetPLocalDe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionGridGetPLocalDePSloc createESMFActionGridGetPLocalDePSloc() {
		ESMFActionGridGetPLocalDePSlocImpl esmfActionGridGetPLocalDePSloc = new ESMFActionGridGetPLocalDePSlocImpl();
		return esmfActionGridGetPLocalDePSloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionGridGetCoord createESMFActionGridGetCoord() {
		ESMFActionGridGetCoordImpl esmfActionGridGetCoord = new ESMFActionGridGetCoordImpl();
		return esmfActionGridGetCoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionGridCompCreate createESMFActionGridCompCreate() {
		ESMFActionGridCompCreateImpl esmfActionGridCompCreate = new ESMFActionGridCompCreateImpl();
		return esmfActionGridCompCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionGridCompInitialize createESMFActionGridCompInitialize() {
		ESMFActionGridCompInitializeImpl esmfActionGridCompInitialize = new ESMFActionGridCompInitializeImpl();
		return esmfActionGridCompInitialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionGridCompRun createESMFActionGridCompRun() {
		ESMFActionGridCompRunImpl esmfActionGridCompRun = new ESMFActionGridCompRunImpl();
		return esmfActionGridCompRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionGridCompFinalize createESMFActionGridCompFinalize() {
		ESMFActionGridCompFinalizeImpl esmfActionGridCompFinalize = new ESMFActionGridCompFinalizeImpl();
		return esmfActionGridCompFinalize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionGridCompSetServices createESMFActionGridCompSetServices() {
		ESMFActionGridCompSetServicesImpl esmfActionGridCompSetServices = new ESMFActionGridCompSetServicesImpl();
		return esmfActionGridCompSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionMethodInvoke createESMFActionMethodInvoke() {
		ESMFActionMethodInvokeImpl esmfActionMethodInvoke = new ESMFActionMethodInvokeImpl();
		return esmfActionMethodInvoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionTimeSet createESMFActionTimeSet() {
		ESMFActionTimeSetImpl esmfActionTimeSet = new ESMFActionTimeSetImpl();
		return esmfActionTimeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionTimeGet createESMFActionTimeGet() {
		ESMFActionTimeGetImpl esmfActionTimeGet = new ESMFActionTimeGetImpl();
		return esmfActionTimeGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionTimeIntervalSet createESMFActionTimeIntervalSet() {
		ESMFActionTimeIntervalSetImpl esmfActionTimeIntervalSet = new ESMFActionTimeIntervalSetImpl();
		return esmfActionTimeIntervalSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionTimeIntervalGet createESMFActionTimeIntervalGet() {
		ESMFActionTimeIntervalGetImpl esmfActionTimeIntervalGet = new ESMFActionTimeIntervalGetImpl();
		return esmfActionTimeIntervalGet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFActionUserServiceInvoke createESMFActionUserServiceInvoke() {
		ESMFActionUserServiceInvokeImpl esmfActionUserServiceInvoke = new ESMFActionUserServiceInvokeImpl();
		return esmfActionUserServiceInvoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFCall createESMFCall() {
		ESMFCallImpl esmfCall = new ESMFCallImpl();
		return esmfCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFCallGridCompCreate createESMFCallGridCompCreate() {
		ESMFCallGridCompCreateImpl esmfCallGridCompCreate = new ESMFCallGridCompCreateImpl();
		return esmfCallGridCompCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFCallGridCompInitialize createESMFCallGridCompInitialize() {
		ESMFCallGridCompInitializeImpl esmfCallGridCompInitialize = new ESMFCallGridCompInitializeImpl();
		return esmfCallGridCompInitialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFCallGridCompSetServices createESMFCallGridCompSetServices() {
		ESMFCallGridCompSetServicesImpl esmfCallGridCompSetServices = new ESMFCallGridCompSetServicesImpl();
		return esmfCallGridCompSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFCallCplCompCreate createESMFCallCplCompCreate() {
		ESMFCallCplCompCreateImpl esmfCallCplCompCreate = new ESMFCallCplCompCreateImpl();
		return esmfCallCplCompCreate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFCallCplCompInitialize createESMFCallCplCompInitialize() {
		ESMFCallCplCompInitializeImpl esmfCallCplCompInitialize = new ESMFCallCplCompInitializeImpl();
		return esmfCallCplCompInitialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFCallCplCompSetServices createESMFCallCplCompSetServices() {
		ESMFCallCplCompSetServicesImpl esmfCallCplCompSetServices = new ESMFCallCplCompSetServicesImpl();
		return esmfCallCplCompSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFCallFieldCreateSIDL createESMFCallFieldCreateSIDL() {
		ESMFCallFieldCreateSIDLImpl esmfCallFieldCreateSIDL = new ESMFCallFieldCreateSIDLImpl();
		return esmfCallFieldCreateSIDL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFCallSIDLMethod createESMFCallSIDLMethod() {
		ESMFCallSIDLMethodImpl esmfCallSIDLMethod = new ESMFCallSIDLMethodImpl();
		return esmfCallSIDLMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFNamedEntity createESMFNamedEntity() {
		ESMFNamedEntityImpl esmfNamedEntity = new ESMFNamedEntityImpl();
		return esmfNamedEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFCalKind createESMFCalKindFromString(EDataType eDataType, String initialValue) {
		ESMFCalKind result = ESMFCalKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertESMFCalKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFStaggerLoc createESMFStaggerLocFromString(EDataType eDataType, String initialValue) {
		ESMFStaggerLoc result = ESMFStaggerLoc.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertESMFStaggerLocToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTypeKind createESMFTypeKindFromString(EDataType eDataType, String initialValue) {
		ESMFTypeKind result = ESMFTypeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertESMFTypeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMF_INDEX createESMF_INDEXFromString(EDataType eDataType, String initialValue) {
		ESMF_INDEX result = ESMF_INDEX.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertESMF_INDEXToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int[] createEIntArrayFromString(EDataType eDataType, String initialValue) {
		return (int[])super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEIntArrayToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createESMFUserTokenFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertESMFUserTokenToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFPackage getESMFPackage() {
		return (ESMFPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ESMFPackage getPackage() {
		return ESMFPackage.eINSTANCE;
	}

} //ESMFFactoryImpl
