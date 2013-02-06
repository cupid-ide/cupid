/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFAction;
import org.earthsystemcurator.cupid.esmf.ESMFActionAPI;
import org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreate;
import org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS;
import org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet;
import org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate;
import org.earthsystemcurator.cupid.esmf.ESMFActionClockGet;
import org.earthsystemcurator.cupid.esmf.ESMFActionClockGetTimestep;
import org.earthsystemcurator.cupid.esmf.ESMFActionCplCompCreate;
import org.earthsystemcurator.cupid.esmf.ESMFActionCplCompFinalize;
import org.earthsystemcurator.cupid.esmf.ESMFActionCplCompInitialize;
import org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun;
import org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices;
import org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate;
import org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreate;
import org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray;
import org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec;
import org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR;
import org.earthsystemcurator.cupid.esmf.ESMFActionFieldGet;
import org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds;
import org.earthsystemcurator.cupid.esmf.ESMFActionFieldHalo;
import org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloRelease;
import org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloStore;
import org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedist;
import org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistRelease;
import org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore;
import org.earthsystemcurator.cupid.esmf.ESMFActionFrameworkFinalize;
import org.earthsystemcurator.cupid.esmf.ESMFActionFrameworkInit;
import org.earthsystemcurator.cupid.esmf.ESMFActionGridCompCreate;
import org.earthsystemcurator.cupid.esmf.ESMFActionGridCompFinalize;
import org.earthsystemcurator.cupid.esmf.ESMFActionGridCompInitialize;
import org.earthsystemcurator.cupid.esmf.ESMFActionGridCompRun;
import org.earthsystemcurator.cupid.esmf.ESMFActionGridCompSetServices;
import org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate;
import org.earthsystemcurator.cupid.esmf.ESMFActionGridGet;
import org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord;
import org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe;
import org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc;
import org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvoke;
import org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokeIteration;
import org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokePattern;
import org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokeSequence;
import org.earthsystemcurator.cupid.esmf.ESMFActionStateAdd;
import org.earthsystemcurator.cupid.esmf.ESMFActionStateCreate;
import org.earthsystemcurator.cupid.esmf.ESMFActionStateGet;
import org.earthsystemcurator.cupid.esmf.ESMFActionStateReconcile;
import org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet;
import org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet;
import org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalSet;
import org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet;
import org.earthsystemcurator.cupid.esmf.ESMFActionUserServiceInvoke;
import org.earthsystemcurator.cupid.esmf.ESMFArray;
import org.earthsystemcurator.cupid.esmf.ESMFArraySpec;
import org.earthsystemcurator.cupid.esmf.ESMFCalKind;
import org.earthsystemcurator.cupid.esmf.ESMFCalendar;
import org.earthsystemcurator.cupid.esmf.ESMFCall;
import org.earthsystemcurator.cupid.esmf.ESMFCallCplCompCreate;
import org.earthsystemcurator.cupid.esmf.ESMFCallCplCompInitialize;
import org.earthsystemcurator.cupid.esmf.ESMFCallCplCompSetServices;
import org.earthsystemcurator.cupid.esmf.ESMFCallFieldCreateSIDL;
import org.earthsystemcurator.cupid.esmf.ESMFCallGridCompCreate;
import org.earthsystemcurator.cupid.esmf.ESMFCallGridCompInitialize;
import org.earthsystemcurator.cupid.esmf.ESMFCallGridCompSetServices;
import org.earthsystemcurator.cupid.esmf.ESMFCallSIDLMethod;
import org.earthsystemcurator.cupid.esmf.ESMFClock;
import org.earthsystemcurator.cupid.esmf.ESMFComponent;
import org.earthsystemcurator.cupid.esmf.ESMFCouplerComponent;
import org.earthsystemcurator.cupid.esmf.ESMFDELayout;
import org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement;
import org.earthsystemcurator.cupid.esmf.ESMFDistGrid;
import org.earthsystemcurator.cupid.esmf.ESMFDriver;
import org.earthsystemcurator.cupid.esmf.ESMFFactory;
import org.earthsystemcurator.cupid.esmf.ESMFField;
import org.earthsystemcurator.cupid.esmf.ESMFFieldConnection;
import org.earthsystemcurator.cupid.esmf.ESMFFinalizeMethod;
import org.earthsystemcurator.cupid.esmf.ESMFFinalizeMethodSIDL;
import org.earthsystemcurator.cupid.esmf.ESMFGrid;
import org.earthsystemcurator.cupid.esmf.ESMFGriddedComponent;
import org.earthsystemcurator.cupid.esmf.ESMFInitMethod;
import org.earthsystemcurator.cupid.esmf.ESMFMethod;
import org.earthsystemcurator.cupid.esmf.ESMFNamedEntity;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFPersistentExecutionThread;
import org.earthsystemcurator.cupid.esmf.ESMFPostInitMethodSIDL;
import org.earthsystemcurator.cupid.esmf.ESMFPreInitMethodSIDL;
import org.earthsystemcurator.cupid.esmf.ESMFRegisterMethod;
import org.earthsystemcurator.cupid.esmf.ESMFRouteHandle;
import org.earthsystemcurator.cupid.esmf.ESMFRunMethod;
import org.earthsystemcurator.cupid.esmf.ESMFScope;
import org.earthsystemcurator.cupid.esmf.ESMFScopedItem;
import org.earthsystemcurator.cupid.esmf.ESMFSimpleCouplerComponent;
import org.earthsystemcurator.cupid.esmf.ESMFStage;
import org.earthsystemcurator.cupid.esmf.ESMFStageAction;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionArraySpecCreate;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionComponentCreate;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionComponentDestroy;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionComponentSetGrid;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionExecuteStage;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionExportStateAdd;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionExportStateGet;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionFieldCreate;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionFieldDestroy;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionFieldRedist;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionFieldRedistRelease;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionFieldRedistStore;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionGridCreate;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionGridInherit;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionImportStateAdd;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionImportStateGet;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionIterate;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionIterateClock;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionSequence;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionStateCreate;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionStateDestroy;
import org.earthsystemcurator.cupid.esmf.ESMFStageFinalize;
import org.earthsystemcurator.cupid.esmf.ESMFStageInitialize;
import org.earthsystemcurator.cupid.esmf.ESMFStageRun;
import org.earthsystemcurator.cupid.esmf.ESMFStaggerLoc;
import org.earthsystemcurator.cupid.esmf.ESMFState;
import org.earthsystemcurator.cupid.esmf.ESMFStateItem;
import org.earthsystemcurator.cupid.esmf.ESMFTime;
import org.earthsystemcurator.cupid.esmf.ESMFTimeInterval;
import org.earthsystemcurator.cupid.esmf.ESMFTypeKind;
import org.earthsystemcurator.cupid.esmf.ESMFVirtualAddressSpace;
import org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine;
import org.earthsystemcurator.cupid.esmf.ESMFWorkspace;
import org.earthsystemcurator.cupid.esmf.Extent;

import org.earthsystemcurator.cupid.esmf.util.ESMFValidator;

import org.earthsystemcurator.cupid.sidl.SIDLPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ESMFPackageImpl extends EPackageImpl implements ESMFPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfGriddedComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfCouplerComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfSimpleCouplerComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfDriverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageInitializeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageRunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageFinalizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionIterateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionIterateClockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionFieldCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionFieldDestroyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionFieldRedistStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionFieldRedistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionFieldRedistReleaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionGridCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionGridInheritEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionImportStateAddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionExportStateAddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionImportStateGetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionExportStateGetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionStateCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionStateDestroyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionArraySpecCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionComponentCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionComponentDestroyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionComponentSetGridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStageActionExecuteStageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfInitMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfPreInitMethodSIDLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfPostInitMethodSIDLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfRunMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfFinalizeMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfFinalizeMethodSIDLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfRegisterMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfCalendarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfTimeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfClockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfStateItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfScopedItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfFieldConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfRouteHandleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfArraySpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfGridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfDistGridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfWorkspaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfVirtualMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfPersistentExecutionThreadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfdeLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfDecompositionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfVirtualAddressSpaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionAPIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionMethodInvokePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionMethodInvokeSequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionMethodInvokeIterationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionStateAddEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionStateCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionStateGetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionStateReconcileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionArrayCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionArrayCreateAllocateASEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionArraySpecSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionClockCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionClockGetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionClockGetTimestepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionCplCompCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionCplCompInitializeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionCplCompRunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionCplCompFinalizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionCplCompSetServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionDistGridCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionFieldCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionFieldCreateGridArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionFieldCreateGridArraySpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionFieldCreateTKREClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionFieldGetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionFieldGetBoundsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionFieldHaloStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionFieldHaloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionFieldHaloReleaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionFieldRedistStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionFieldRedistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionFieldRedistReleaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionFrameworkInitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionFrameworkFinalizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionGridCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionGridGetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionGridGetPLocalDeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionGridGetPLocalDePSlocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionGridGetCoordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionGridCompCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionGridCompInitializeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionGridCompRunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionGridCompFinalizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionGridCompSetServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionMethodInvokeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionTimeSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionTimeGetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionTimeIntervalSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionTimeIntervalGetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfActionUserServiceInvokeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfCallGridCompCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfCallGridCompInitializeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfCallGridCompSetServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfCallCplCompCreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfCallCplCompInitializeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfCallCplCompSetServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfCallFieldCreateSIDLEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfCallSIDLMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfNamedEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esmfScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum esmfCalKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum esmfStaggerLocEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum esmfTypeKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum esmF_INDEXEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eIntArrayEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType esmfUserTokenEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ESMFPackageImpl() {
		super(eNS_URI, ESMFFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ESMFPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ESMFPackage init() {
		if (isInited) return (ESMFPackage)EPackage.Registry.INSTANCE.getEPackage(ESMFPackage.eNS_URI);

		// Obtain or create and register package
		ESMFPackageImpl theESMFPackage = (ESMFPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ESMFPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ESMFPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SIDLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theESMFPackage.createPackageContents();

		// Initialize created meta-data
		theESMFPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theESMFPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ESMFValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theESMFPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ESMFPackage.eNS_URI, theESMFPackage);
		return theESMFPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFComponent() {
		return esmfComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFComponent_Method() {
		return (EReference)esmfComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFComponent_RegisterMethod() {
		return (EReference)esmfComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFComponent_ImportState() {
		return (EReference)esmfComponentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFComponent_ExportState() {
		return (EReference)esmfComponentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFComponent_Component() {
		return (EReference)esmfComponentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFComponent_Parent() {
		return (EReference)esmfComponentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFComponent_Clock() {
		return (EReference)esmfComponentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFComponent_ModelClock() {
		return (EReference)esmfComponentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFComponent_Time() {
		return (EReference)esmfComponentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFComponent_TimeInterval() {
		return (EReference)esmfComponentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFComponent_SIDLClass() {
		return (EReference)esmfComponentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFComponent_Stage() {
		return (EReference)esmfComponentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFGriddedComponent() {
		return esmfGriddedComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFCouplerComponent() {
		return esmfCouplerComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFSimpleCouplerComponent() {
		return esmfSimpleCouplerComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFSimpleCouplerComponent_FieldConnection() {
		return (EReference)esmfSimpleCouplerComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFDriver() {
		return esmfDriverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStage() {
		return esmfStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStage_Component() {
		return (EReference)esmfStageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFStage_Phase() {
		return (EAttribute)esmfStageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStage_Actions() {
		return (EReference)esmfStageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageInitialize() {
		return esmfStageInitializeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageRun() {
		return esmfStageRunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageFinalize() {
		return esmfStageFinalizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageAction() {
		return esmfStageActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageAction_Parent() {
		return (EReference)esmfStageActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionSequence() {
		return esmfStageActionSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionSequence_Action() {
		return (EReference)esmfStageActionSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionSequence_Stage() {
		return (EReference)esmfStageActionSequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionIterate() {
		return esmfStageActionIterateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionIterateClock() {
		return esmfStageActionIterateClockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionFieldCreate() {
		return esmfStageActionFieldCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionFieldCreate_Field() {
		return (EReference)esmfStageActionFieldCreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionFieldDestroy() {
		return esmfStageActionFieldDestroyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionFieldDestroy_Field() {
		return (EReference)esmfStageActionFieldDestroyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionFieldRedistStore() {
		return esmfStageActionFieldRedistStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionFieldRedistStore_SrcField() {
		return (EReference)esmfStageActionFieldRedistStoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionFieldRedistStore_DstField() {
		return (EReference)esmfStageActionFieldRedistStoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionFieldRedistStore_RouteHandle() {
		return (EReference)esmfStageActionFieldRedistStoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionFieldRedist() {
		return esmfStageActionFieldRedistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionFieldRedist_SrcField() {
		return (EReference)esmfStageActionFieldRedistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionFieldRedist_DstField() {
		return (EReference)esmfStageActionFieldRedistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionFieldRedist_RouteHandle() {
		return (EReference)esmfStageActionFieldRedistEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionFieldRedistRelease() {
		return esmfStageActionFieldRedistReleaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionFieldRedistRelease_RouteHandle() {
		return (EReference)esmfStageActionFieldRedistReleaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionGridCreate() {
		return esmfStageActionGridCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionGridCreate_Grid() {
		return (EReference)esmfStageActionGridCreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionGridInherit() {
		return esmfStageActionGridInheritEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionGridInherit_Grid() {
		return (EReference)esmfStageActionGridInheritEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionImportStateAdd() {
		return esmfStageActionImportStateAddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionImportStateAdd_Item() {
		return (EReference)esmfStageActionImportStateAddEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionExportStateAdd() {
		return esmfStageActionExportStateAddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionExportStateAdd_Item() {
		return (EReference)esmfStageActionExportStateAddEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionImportStateGet() {
		return esmfStageActionImportStateGetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFStageActionImportStateGet_ItemName() {
		return (EAttribute)esmfStageActionImportStateGetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionImportStateGet_Item() {
		return (EReference)esmfStageActionImportStateGetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionExportStateGet() {
		return esmfStageActionExportStateGetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFStageActionExportStateGet_ItemName() {
		return (EAttribute)esmfStageActionExportStateGetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionExportStateGet_Item() {
		return (EReference)esmfStageActionExportStateGetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionStateCreate() {
		return esmfStageActionStateCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionStateCreate_State() {
		return (EReference)esmfStageActionStateCreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionStateDestroy() {
		return esmfStageActionStateDestroyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionStateDestroy_State() {
		return (EReference)esmfStageActionStateDestroyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionArraySpecCreate() {
		return esmfStageActionArraySpecCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionArraySpecCreate_ArraySpec() {
		return (EReference)esmfStageActionArraySpecCreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionComponentCreate() {
		return esmfStageActionComponentCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionComponentCreate_Component() {
		return (EReference)esmfStageActionComponentCreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionComponentDestroy() {
		return esmfStageActionComponentDestroyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionComponentDestroy_Component() {
		return (EReference)esmfStageActionComponentDestroyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionComponentSetGrid() {
		return esmfStageActionComponentSetGridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionComponentSetGrid_Component() {
		return (EReference)esmfStageActionComponentSetGridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionComponentSetGrid_Grid() {
		return (EReference)esmfStageActionComponentSetGridEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStageActionExecuteStage() {
		return esmfStageActionExecuteStageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionExecuteStage_StageToExecute() {
		return (EReference)esmfStageActionExecuteStageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionExecuteStage_ImportState() {
		return (EReference)esmfStageActionExecuteStageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFStageActionExecuteStage_ExportState() {
		return (EReference)esmfStageActionExecuteStageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFMethod() {
		return esmfMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFMethod_Component() {
		return (EReference)esmfMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFMethod_Phase() {
		return (EAttribute)esmfMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFMethod_ImportState() {
		return (EReference)esmfMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFMethod_ExportState() {
		return (EReference)esmfMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFMethod_Clock() {
		return (EReference)esmfMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFMethod_Action() {
		return (EReference)esmfMethodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFMethod_SIDLMethod() {
		return (EReference)esmfMethodEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFInitMethod() {
		return esmfInitMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFPreInitMethodSIDL() {
		return esmfPreInitMethodSIDLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFPostInitMethodSIDL() {
		return esmfPostInitMethodSIDLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFRunMethod() {
		return esmfRunMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFFinalizeMethod() {
		return esmfFinalizeMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFFinalizeMethodSIDL() {
		return esmfFinalizeMethodSIDLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFRegisterMethod() {
		return esmfRegisterMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFRegisterMethod_Component() {
		return (EReference)esmfRegisterMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFCalendar() {
		return esmfCalendarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFTimeInterval() {
		return esmfTimeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFTimeInterval_Hours() {
		return (EAttribute)esmfTimeIntervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFTimeInterval_Minutes() {
		return (EAttribute)esmfTimeIntervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFTimeInterval_Seconds() {
		return (EAttribute)esmfTimeIntervalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFTime() {
		return esmfTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFTime_Year() {
		return (EAttribute)esmfTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFTime_Month() {
		return (EAttribute)esmfTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFTime_Day() {
		return (EAttribute)esmfTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFTime_Hour() {
		return (EAttribute)esmfTimeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFTime_Minute() {
		return (EAttribute)esmfTimeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFTime_Second() {
		return (EAttribute)esmfTimeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFTime_Calendar() {
		return (EReference)esmfTimeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFClock() {
		return esmfClockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFClock_StartTime() {
		return (EReference)esmfClockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFClock_StopTime() {
		return (EReference)esmfClockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFClock_TimeStep() {
		return (EReference)esmfClockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFClock_Component() {
		return (EReference)esmfClockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFState() {
		return esmfStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFState_Component() {
		return (EReference)esmfStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFStateItem() {
		return esmfStateItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFScopedItem() {
		return esmfScopedItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFScopedItem_Scope() {
		return (EReference)esmfScopedItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFField() {
		return esmfFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFField_Grid() {
		return (EReference)esmfFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFField_Array() {
		return (EReference)esmfFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFField_StaggerLoc() {
		return (EAttribute)esmfFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFField_ArraySpec() {
		return (EReference)esmfFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFField_SIDLArgument() {
		return (EReference)esmfFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFField_Index() {
		return (EAttribute)esmfFieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFField_TotalLWidth() {
		return (EAttribute)esmfFieldEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFField_TotalUWidth() {
		return (EAttribute)esmfFieldEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFField_Label() {
		return (EAttribute)esmfFieldEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFFieldConnection() {
		return esmfFieldConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFFieldConnection_SrcField() {
		return (EReference)esmfFieldConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFFieldConnection_DstField() {
		return (EReference)esmfFieldConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFFieldConnection_Component() {
		return (EReference)esmfFieldConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFArray() {
		return esmfArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFArray_Component() {
		return (EReference)esmfArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFArray_ArraySpec() {
		return (EReference)esmfArrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFArray_DistGrid() {
		return (EReference)esmfArrayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFArray_Farray() {
		return (EAttribute)esmfArrayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFArray_Indexflag() {
		return (EAttribute)esmfArrayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFArray_HaloLWidth() {
		return (EAttribute)esmfArrayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFArray_HaloUWidth() {
		return (EAttribute)esmfArrayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFRouteHandle() {
		return esmfRouteHandleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFArraySpec() {
		return esmfArraySpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFArraySpec_Typekind() {
		return (EAttribute)esmfArraySpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFArraySpec_Rank() {
		return (EAttribute)esmfArraySpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFGrid() {
		return esmfGridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFGrid_DistGrid() {
		return (EReference)esmfGridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtent() {
		return extentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtent_Min() {
		return (EAttribute)extentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtent_Max() {
		return (EAttribute)extentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFDistGrid() {
		return esmfDistGridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFDistGrid_Extent() {
		return (EReference)esmfDistGridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFDistGrid_De() {
		return (EReference)esmfDistGridEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFDistGrid_DeLayout() {
		return (EReference)esmfDistGridEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFDistGrid_RegularDecompositionSize() {
		return (EAttribute)esmfDistGridEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFWorkspace() {
		return esmfWorkspaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFWorkspace_Component() {
		return (EReference)esmfWorkspaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFWorkspace_Calendar() {
		return (EReference)esmfWorkspaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFWorkspace_StateItem() {
		return (EReference)esmfWorkspaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFWorkspace_DistGrid() {
		return (EReference)esmfWorkspaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFWorkspace_VirtualMachine() {
		return (EReference)esmfWorkspaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFWorkspace_PersistentExecutionThread() {
		return (EReference)esmfWorkspaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFWorkspace_DeLayout() {
		return (EReference)esmfWorkspaceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFWorkspace_Clock() {
		return (EReference)esmfWorkspaceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFVirtualMachine() {
		return esmfVirtualMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFVirtualMachine_Name() {
		return (EAttribute)esmfVirtualMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFVirtualMachine_ParentVM() {
		return (EReference)esmfVirtualMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFVirtualMachine_PetID() {
		return (EAttribute)esmfVirtualMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFPersistentExecutionThread() {
		return esmfPersistentExecutionThreadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFPersistentExecutionThread_Id() {
		return (EAttribute)esmfPersistentExecutionThreadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFDELayout() {
		return esmfdeLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFDELayout_Name() {
		return (EAttribute)esmfdeLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFDELayout_DecompositionElement() {
		return (EReference)esmfdeLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFDELayout_DeToPet() {
		return (EAttribute)esmfdeLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFDecompositionElement() {
		return esmfDecompositionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFDecompositionElement_Extent() {
		return (EReference)esmfDecompositionElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFDecompositionElement_ParentDistGrid() {
		return (EReference)esmfDecompositionElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFVirtualAddressSpace() {
		return esmfVirtualAddressSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFAction() {
		return esmfActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFAction_Context() {
		return (EReference)esmfActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionAPI() {
		return esmfActionAPIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionAPI_Rc() {
		return (EAttribute)esmfActionAPIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionMethodInvokePattern() {
		return esmfActionMethodInvokePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionMethodInvokeSequence() {
		return esmfActionMethodInvokeSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionMethodInvokeSequence_Pattern() {
		return (EReference)esmfActionMethodInvokeSequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionMethodInvokeIteration() {
		return esmfActionMethodInvokeIterationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionStateAdd() {
		return esmfActionStateAddEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionStateAdd_State() {
		return (EReference)esmfActionStateAddEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionStateAdd_ItemList() {
		return (EReference)esmfActionStateAddEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionStateCreate() {
		return esmfActionStateCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionStateCreate_State() {
		return (EReference)esmfActionStateCreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionStateCreate_Name() {
		return (EAttribute)esmfActionStateCreateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionStateGet() {
		return esmfActionStateGetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionStateGet_State() {
		return (EReference)esmfActionStateGetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionStateGet_ItemName() {
		return (EAttribute)esmfActionStateGetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionStateGet_Item() {
		return (EReference)esmfActionStateGetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionStateReconcile() {
		return esmfActionStateReconcileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionStateReconcile_State() {
		return (EReference)esmfActionStateReconcileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionArrayCreate() {
		return esmfActionArrayCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionArrayCreate_Array() {
		return (EReference)esmfActionArrayCreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionArrayCreateAllocateAS() {
		return esmfActionArrayCreateAllocateASEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionArrayCreateAllocateAS_Array() {
		return (EReference)esmfActionArrayCreateAllocateASEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionArrayCreateAllocateAS_DistGrid() {
		return (EReference)esmfActionArrayCreateAllocateASEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionArrayCreateAllocateAS_ArraySpec() {
		return (EReference)esmfActionArrayCreateAllocateASEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionArrayCreateAllocateAS_Indexflag() {
		return (EAttribute)esmfActionArrayCreateAllocateASEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionArrayCreateAllocateAS_TotalLWidth() {
		return (EAttribute)esmfActionArrayCreateAllocateASEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionArrayCreateAllocateAS_TotalUWidth() {
		return (EAttribute)esmfActionArrayCreateAllocateASEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionArraySpecSet() {
		return esmfActionArraySpecSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionArraySpecSet_ArraySpec() {
		return (EReference)esmfActionArraySpecSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionArraySpecSet_Typekind() {
		return (EAttribute)esmfActionArraySpecSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionArraySpecSet_Rank() {
		return (EAttribute)esmfActionArraySpecSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionClockCreate() {
		return esmfActionClockCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionClockCreate_Clock() {
		return (EReference)esmfActionClockCreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionClockCreate_TimeStep() {
		return (EReference)esmfActionClockCreateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionClockCreate_StartTime() {
		return (EReference)esmfActionClockCreateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionClockCreate_StopTime() {
		return (EReference)esmfActionClockCreateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionClockGet() {
		return esmfActionClockGetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionClockGet_Clock() {
		return (EReference)esmfActionClockGetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionClockGet_TimeStep() {
		return (EReference)esmfActionClockGetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionClockGet_CurrTime() {
		return (EReference)esmfActionClockGetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionClockGetTimestep() {
		return esmfActionClockGetTimestepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionClockGetTimestep_Clock() {
		return (EReference)esmfActionClockGetTimestepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionCplCompCreate() {
		return esmfActionCplCompCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionCplCompCreate_Cplcomp() {
		return (EReference)esmfActionCplCompCreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionCplCompCreate_Name() {
		return (EAttribute)esmfActionCplCompCreateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionCplCompInitialize() {
		return esmfActionCplCompInitializeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionCplCompInitialize_Cplcomp() {
		return (EReference)esmfActionCplCompInitializeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionCplCompInitialize_ImportState() {
		return (EReference)esmfActionCplCompInitializeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionCplCompInitialize_ExportState() {
		return (EReference)esmfActionCplCompInitializeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionCplCompInitialize_Clock() {
		return (EReference)esmfActionCplCompInitializeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionCplCompInitialize_Phase() {
		return (EAttribute)esmfActionCplCompInitializeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionCplCompRun() {
		return esmfActionCplCompRunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionCplCompRun_Cplcomp() {
		return (EReference)esmfActionCplCompRunEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionCplCompRun_ImportState() {
		return (EReference)esmfActionCplCompRunEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionCplCompRun_ExportState() {
		return (EReference)esmfActionCplCompRunEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionCplCompRun_Clock() {
		return (EReference)esmfActionCplCompRunEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionCplCompRun_Phase() {
		return (EAttribute)esmfActionCplCompRunEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionCplCompFinalize() {
		return esmfActionCplCompFinalizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionCplCompFinalize_Cplcomp() {
		return (EReference)esmfActionCplCompFinalizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionCplCompFinalize_ImportState() {
		return (EReference)esmfActionCplCompFinalizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionCplCompFinalize_ExportState() {
		return (EReference)esmfActionCplCompFinalizeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionCplCompFinalize_Clock() {
		return (EReference)esmfActionCplCompFinalizeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionCplCompFinalize_Phase() {
		return (EAttribute)esmfActionCplCompFinalizeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionCplCompSetServices() {
		return esmfActionCplCompSetServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionCplCompSetServices_Cplcomp() {
		return (EReference)esmfActionCplCompSetServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionCplCompSetServices_UserRoutine() {
		return (EAttribute)esmfActionCplCompSetServicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionCplCompSetServices_UserRC() {
		return (EAttribute)esmfActionCplCompSetServicesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionDistGridCreate() {
		return esmfActionDistGridCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionDistGridCreate_DistGrid() {
		return (EReference)esmfActionDistGridCreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionDistGridCreate_MinIndex() {
		return (EAttribute)esmfActionDistGridCreateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionDistGridCreate_MaxIndex() {
		return (EAttribute)esmfActionDistGridCreateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionDistGridCreate_RegDecomp() {
		return (EAttribute)esmfActionDistGridCreateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionFieldCreate() {
		return esmfActionFieldCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldCreate_Field() {
		return (EReference)esmfActionFieldCreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionFieldCreateGridArray() {
		return esmfActionFieldCreateGridArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldCreateGridArray_Field() {
		return (EReference)esmfActionFieldCreateGridArrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionFieldCreateGridArray_Name() {
		return (EAttribute)esmfActionFieldCreateGridArrayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldCreateGridArray_Grid() {
		return (EReference)esmfActionFieldCreateGridArrayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldCreateGridArray_Array() {
		return (EReference)esmfActionFieldCreateGridArrayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionFieldCreateGridArraySpec() {
		return esmfActionFieldCreateGridArraySpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldCreateGridArraySpec_Field() {
		return (EReference)esmfActionFieldCreateGridArraySpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldCreateGridArraySpec_Grid() {
		return (EReference)esmfActionFieldCreateGridArraySpecEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldCreateGridArraySpec_ArraySpec() {
		return (EReference)esmfActionFieldCreateGridArraySpecEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionFieldCreateGridArraySpec_Indexflag() {
		return (EAttribute)esmfActionFieldCreateGridArraySpecEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionFieldCreateGridArraySpec_TotalLWidth() {
		return (EAttribute)esmfActionFieldCreateGridArraySpecEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionFieldCreateGridArraySpec_TotalUWidth() {
		return (EAttribute)esmfActionFieldCreateGridArraySpecEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionFieldCreateGridArraySpec_Name() {
		return (EAttribute)esmfActionFieldCreateGridArraySpecEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionFieldCreateTKR() {
		return esmfActionFieldCreateTKREClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldCreateTKR_Field() {
		return (EReference)esmfActionFieldCreateTKREClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldCreateTKR_Grid() {
		return (EReference)esmfActionFieldCreateTKREClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionFieldCreateTKR_Typekind() {
		return (EAttribute)esmfActionFieldCreateTKREClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionFieldGet() {
		return esmfActionFieldGetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldGet_Field() {
		return (EReference)esmfActionFieldGetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionFieldGet_FarrayPtr() {
		return (EAttribute)esmfActionFieldGetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionFieldGetBounds() {
		return esmfActionFieldGetBoundsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldGetBounds_Field() {
		return (EReference)esmfActionFieldGetBoundsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionFieldGetBounds_ExclusiveLBound() {
		return (EAttribute)esmfActionFieldGetBoundsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionFieldGetBounds_ExclusiveUBound() {
		return (EAttribute)esmfActionFieldGetBoundsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionFieldGetBounds_ComputationalLBound() {
		return (EAttribute)esmfActionFieldGetBoundsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionFieldGetBounds_ComputationalUBound() {
		return (EAttribute)esmfActionFieldGetBoundsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionFieldGetBounds_TotalLBound() {
		return (EAttribute)esmfActionFieldGetBoundsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionFieldGetBounds_TotalUBound() {
		return (EAttribute)esmfActionFieldGetBoundsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionFieldHaloStore() {
		return esmfActionFieldHaloStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldHaloStore_Field() {
		return (EReference)esmfActionFieldHaloStoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldHaloStore_RouteHandle() {
		return (EReference)esmfActionFieldHaloStoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionFieldHalo() {
		return esmfActionFieldHaloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldHalo_Field() {
		return (EReference)esmfActionFieldHaloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldHalo_RouteHandle() {
		return (EReference)esmfActionFieldHaloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionFieldHaloRelease() {
		return esmfActionFieldHaloReleaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldHaloRelease_RouteHandle() {
		return (EReference)esmfActionFieldHaloReleaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionFieldRedistStore() {
		return esmfActionFieldRedistStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldRedistStore_SrcField() {
		return (EReference)esmfActionFieldRedistStoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldRedistStore_DstField() {
		return (EReference)esmfActionFieldRedistStoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldRedistStore_RouteHandle() {
		return (EReference)esmfActionFieldRedistStoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionFieldRedist() {
		return esmfActionFieldRedistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldRedist_SrcField() {
		return (EReference)esmfActionFieldRedistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldRedist_DstField() {
		return (EReference)esmfActionFieldRedistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldRedist_RouteHandle() {
		return (EReference)esmfActionFieldRedistEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionFieldRedistRelease() {
		return esmfActionFieldRedistReleaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionFieldRedistRelease_RouteHandle() {
		return (EReference)esmfActionFieldRedistReleaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionFrameworkInit() {
		return esmfActionFrameworkInitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionFrameworkInit_DefaultCalKind() {
		return (EAttribute)esmfActionFrameworkInitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionFrameworkFinalize() {
		return esmfActionFrameworkFinalizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionGridCreate() {
		return esmfActionGridCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridCreate_Grid() {
		return (EReference)esmfActionGridCreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridCreate_DistGrid() {
		return (EReference)esmfActionGridCreateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridCreate_Name() {
		return (EAttribute)esmfActionGridCreateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridCreate_Indexflag() {
		return (EAttribute)esmfActionGridCreateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionGridGet() {
		return esmfActionGridGetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridGet_Grid() {
		return (EReference)esmfActionGridGetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionGridGetPLocalDe() {
		return esmfActionGridGetPLocalDeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridGetPLocalDe_LocalDE() {
		return (EAttribute)esmfActionGridGetPLocalDeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridGetPLocalDe_IsLBound() {
		return (EAttribute)esmfActionGridGetPLocalDeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridGetPLocalDe_IsUBound() {
		return (EAttribute)esmfActionGridGetPLocalDeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionGridGetPLocalDePSloc() {
		return esmfActionGridGetPLocalDePSlocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridGetPLocalDePSloc_Staggerloc() {
		return (EAttribute)esmfActionGridGetPLocalDePSlocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridGetPLocalDePSloc_ExclusiveLBound() {
		return (EAttribute)esmfActionGridGetPLocalDePSlocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridGetPLocalDePSloc_ExclusiveUBound() {
		return (EAttribute)esmfActionGridGetPLocalDePSlocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridGetPLocalDePSloc_ComputationalLBound() {
		return (EAttribute)esmfActionGridGetPLocalDePSlocEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridGetPLocalDePSloc_ComputationalUBound() {
		return (EAttribute)esmfActionGridGetPLocalDePSlocEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionGridGetCoord() {
		return esmfActionGridGetCoordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridGetCoord_Grid() {
		return (EReference)esmfActionGridGetCoordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridGetCoord_CoordDim() {
		return (EAttribute)esmfActionGridGetCoordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridGetCoord_FarrayPtr() {
		return (EAttribute)esmfActionGridGetCoordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionGridCompCreate() {
		return esmfActionGridCompCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridCompCreate_Gridcomp() {
		return (EReference)esmfActionGridCompCreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridCompCreate_Name() {
		return (EAttribute)esmfActionGridCompCreateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionGridCompInitialize() {
		return esmfActionGridCompInitializeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridCompInitialize_Gridcomp() {
		return (EReference)esmfActionGridCompInitializeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridCompInitialize_ImportState() {
		return (EReference)esmfActionGridCompInitializeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridCompInitialize_ExportState() {
		return (EReference)esmfActionGridCompInitializeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridCompInitialize_Clock() {
		return (EReference)esmfActionGridCompInitializeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridCompInitialize_Phase() {
		return (EAttribute)esmfActionGridCompInitializeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionGridCompRun() {
		return esmfActionGridCompRunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridCompRun_Gridcomp() {
		return (EReference)esmfActionGridCompRunEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridCompRun_ImportState() {
		return (EReference)esmfActionGridCompRunEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridCompRun_ExportState() {
		return (EReference)esmfActionGridCompRunEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridCompRun_Clock() {
		return (EReference)esmfActionGridCompRunEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridCompRun_Phase() {
		return (EAttribute)esmfActionGridCompRunEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionGridCompFinalize() {
		return esmfActionGridCompFinalizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridCompFinalize_Gridcomp() {
		return (EReference)esmfActionGridCompFinalizeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridCompFinalize_ImportState() {
		return (EReference)esmfActionGridCompFinalizeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridCompFinalize_ExportState() {
		return (EReference)esmfActionGridCompFinalizeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridCompFinalize_Clock() {
		return (EReference)esmfActionGridCompFinalizeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridCompFinalize_Phase() {
		return (EAttribute)esmfActionGridCompFinalizeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionGridCompSetServices() {
		return esmfActionGridCompSetServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionGridCompSetServices_Gridcomp() {
		return (EReference)esmfActionGridCompSetServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridCompSetServices_UserRoutine() {
		return (EAttribute)esmfActionGridCompSetServicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionGridCompSetServices_UserRC() {
		return (EAttribute)esmfActionGridCompSetServicesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionMethodInvoke() {
		return esmfActionMethodInvokeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionMethodInvoke_Method() {
		return (EReference)esmfActionMethodInvokeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionMethodInvoke_ImportState() {
		return (EReference)esmfActionMethodInvokeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionMethodInvoke_ExportState() {
		return (EReference)esmfActionMethodInvokeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionTimeSet() {
		return esmfActionTimeSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionTimeSet_Time() {
		return (EReference)esmfActionTimeSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeSet_Yy() {
		return (EAttribute)esmfActionTimeSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeSet_Mm() {
		return (EAttribute)esmfActionTimeSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeSet_Dd() {
		return (EAttribute)esmfActionTimeSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeSet_H() {
		return (EAttribute)esmfActionTimeSetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeSet_M() {
		return (EAttribute)esmfActionTimeSetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeSet_S() {
		return (EAttribute)esmfActionTimeSetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionTimeGet() {
		return esmfActionTimeGetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionTimeGet_Time() {
		return (EReference)esmfActionTimeGetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeGet_Yy() {
		return (EAttribute)esmfActionTimeGetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeGet_Mm() {
		return (EAttribute)esmfActionTimeGetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeGet_Dd() {
		return (EAttribute)esmfActionTimeGetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeGet_H() {
		return (EAttribute)esmfActionTimeGetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeGet_M() {
		return (EAttribute)esmfActionTimeGetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeGet_S() {
		return (EAttribute)esmfActionTimeGetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionTimeIntervalSet() {
		return esmfActionTimeIntervalSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionTimeIntervalSet_TimeInterval() {
		return (EReference)esmfActionTimeIntervalSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeIntervalSet_H() {
		return (EAttribute)esmfActionTimeIntervalSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeIntervalSet_M() {
		return (EAttribute)esmfActionTimeIntervalSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeIntervalSet_S() {
		return (EAttribute)esmfActionTimeIntervalSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionTimeIntervalGet() {
		return esmfActionTimeIntervalGetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFActionTimeIntervalGet_TimeInterval() {
		return (EReference)esmfActionTimeIntervalGetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeIntervalGet_H() {
		return (EAttribute)esmfActionTimeIntervalGetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeIntervalGet_M() {
		return (EAttribute)esmfActionTimeIntervalGetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionTimeIntervalGet_S() {
		return (EAttribute)esmfActionTimeIntervalGetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFActionUserServiceInvoke() {
		return esmfActionUserServiceInvokeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionUserServiceInvoke_Declaration() {
		return (EAttribute)esmfActionUserServiceInvokeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFActionUserServiceInvoke_Execution() {
		return (EAttribute)esmfActionUserServiceInvokeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFCall() {
		return esmfCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFCallGridCompCreate() {
		return esmfCallGridCompCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFCallGridCompCreate_Gridcomp() {
		return (EReference)esmfCallGridCompCreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFCallGridCompInitialize() {
		return esmfCallGridCompInitializeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFCallGridCompInitialize_Gridcomp() {
		return (EReference)esmfCallGridCompInitializeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFCallGridCompSetServices() {
		return esmfCallGridCompSetServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFCallGridCompSetServices_Gridcomp() {
		return (EReference)esmfCallGridCompSetServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFCallCplCompCreate() {
		return esmfCallCplCompCreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFCallCplCompCreate_Cplcomp() {
		return (EReference)esmfCallCplCompCreateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFCallCplCompInitialize() {
		return esmfCallCplCompInitializeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFCallCplCompInitialize_Cplcomp() {
		return (EReference)esmfCallCplCompInitializeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFCallCplCompSetServices() {
		return esmfCallCplCompSetServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFCallCplCompSetServices_Cplcomp() {
		return (EReference)esmfCallCplCompSetServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFCallFieldCreateSIDL() {
		return esmfCallFieldCreateSIDLEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFCallFieldCreateSIDL_Argument() {
		return (EReference)esmfCallFieldCreateSIDLEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFCallSIDLMethod() {
		return esmfCallSIDLMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFCallSIDLMethod_SIDLMethod() {
		return (EReference)esmfCallSIDLMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFNamedEntity() {
		return esmfNamedEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getESMFNamedEntity_Name() {
		return (EAttribute)esmfNamedEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getESMFScope() {
		return esmfScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getESMFScope_Item() {
		return (EReference)esmfScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getESMFCalKind() {
		return esmfCalKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getESMFStaggerLoc() {
		return esmfStaggerLocEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getESMFTypeKind() {
		return esmfTypeKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getESMF_INDEX() {
		return esmF_INDEXEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEIntArray() {
		return eIntArrayEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getESMFUserToken() {
		return esmfUserTokenEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFFactory getESMFFactory() {
		return (ESMFFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		esmfNamedEntityEClass = createEClass(ESMF_NAMED_ENTITY);
		createEAttribute(esmfNamedEntityEClass, ESMF_NAMED_ENTITY__NAME);

		esmfScopeEClass = createEClass(ESMF_SCOPE);
		createEReference(esmfScopeEClass, ESMF_SCOPE__ITEM);

		esmfComponentEClass = createEClass(ESMF_COMPONENT);
		createEReference(esmfComponentEClass, ESMF_COMPONENT__METHOD);
		createEReference(esmfComponentEClass, ESMF_COMPONENT__REGISTER_METHOD);
		createEReference(esmfComponentEClass, ESMF_COMPONENT__IMPORT_STATE);
		createEReference(esmfComponentEClass, ESMF_COMPONENT__EXPORT_STATE);
		createEReference(esmfComponentEClass, ESMF_COMPONENT__COMPONENT);
		createEReference(esmfComponentEClass, ESMF_COMPONENT__PARENT);
		createEReference(esmfComponentEClass, ESMF_COMPONENT__CLOCK);
		createEReference(esmfComponentEClass, ESMF_COMPONENT__MODEL_CLOCK);
		createEReference(esmfComponentEClass, ESMF_COMPONENT__TIME);
		createEReference(esmfComponentEClass, ESMF_COMPONENT__TIME_INTERVAL);
		createEReference(esmfComponentEClass, ESMF_COMPONENT__SIDL_CLASS);
		createEReference(esmfComponentEClass, ESMF_COMPONENT__STAGE);

		esmfGriddedComponentEClass = createEClass(ESMF_GRIDDED_COMPONENT);

		esmfCouplerComponentEClass = createEClass(ESMF_COUPLER_COMPONENT);

		esmfSimpleCouplerComponentEClass = createEClass(ESMF_SIMPLE_COUPLER_COMPONENT);
		createEReference(esmfSimpleCouplerComponentEClass, ESMF_SIMPLE_COUPLER_COMPONENT__FIELD_CONNECTION);

		esmfDriverEClass = createEClass(ESMF_DRIVER);

		esmfStageEClass = createEClass(ESMF_STAGE);
		createEReference(esmfStageEClass, ESMF_STAGE__COMPONENT);
		createEAttribute(esmfStageEClass, ESMF_STAGE__PHASE);
		createEReference(esmfStageEClass, ESMF_STAGE__ACTIONS);

		esmfStageInitializeEClass = createEClass(ESMF_STAGE_INITIALIZE);

		esmfStageRunEClass = createEClass(ESMF_STAGE_RUN);

		esmfStageFinalizeEClass = createEClass(ESMF_STAGE_FINALIZE);

		esmfStageActionEClass = createEClass(ESMF_STAGE_ACTION);
		createEReference(esmfStageActionEClass, ESMF_STAGE_ACTION__PARENT);

		esmfStageActionSequenceEClass = createEClass(ESMF_STAGE_ACTION_SEQUENCE);
		createEReference(esmfStageActionSequenceEClass, ESMF_STAGE_ACTION_SEQUENCE__ACTION);
		createEReference(esmfStageActionSequenceEClass, ESMF_STAGE_ACTION_SEQUENCE__STAGE);

		esmfStageActionIterateEClass = createEClass(ESMF_STAGE_ACTION_ITERATE);

		esmfStageActionIterateClockEClass = createEClass(ESMF_STAGE_ACTION_ITERATE_CLOCK);

		esmfStageActionArraySpecCreateEClass = createEClass(ESMF_STAGE_ACTION_ARRAY_SPEC_CREATE);
		createEReference(esmfStageActionArraySpecCreateEClass, ESMF_STAGE_ACTION_ARRAY_SPEC_CREATE__ARRAY_SPEC);

		esmfStageActionComponentCreateEClass = createEClass(ESMF_STAGE_ACTION_COMPONENT_CREATE);
		createEReference(esmfStageActionComponentCreateEClass, ESMF_STAGE_ACTION_COMPONENT_CREATE__COMPONENT);

		esmfStageActionComponentDestroyEClass = createEClass(ESMF_STAGE_ACTION_COMPONENT_DESTROY);
		createEReference(esmfStageActionComponentDestroyEClass, ESMF_STAGE_ACTION_COMPONENT_DESTROY__COMPONENT);

		esmfStageActionComponentSetGridEClass = createEClass(ESMF_STAGE_ACTION_COMPONENT_SET_GRID);
		createEReference(esmfStageActionComponentSetGridEClass, ESMF_STAGE_ACTION_COMPONENT_SET_GRID__COMPONENT);
		createEReference(esmfStageActionComponentSetGridEClass, ESMF_STAGE_ACTION_COMPONENT_SET_GRID__GRID);

		esmfStageActionExecuteStageEClass = createEClass(ESMF_STAGE_ACTION_EXECUTE_STAGE);
		createEReference(esmfStageActionExecuteStageEClass, ESMF_STAGE_ACTION_EXECUTE_STAGE__STAGE_TO_EXECUTE);
		createEReference(esmfStageActionExecuteStageEClass, ESMF_STAGE_ACTION_EXECUTE_STAGE__IMPORT_STATE);
		createEReference(esmfStageActionExecuteStageEClass, ESMF_STAGE_ACTION_EXECUTE_STAGE__EXPORT_STATE);

		esmfStageActionFieldCreateEClass = createEClass(ESMF_STAGE_ACTION_FIELD_CREATE);
		createEReference(esmfStageActionFieldCreateEClass, ESMF_STAGE_ACTION_FIELD_CREATE__FIELD);

		esmfStageActionFieldDestroyEClass = createEClass(ESMF_STAGE_ACTION_FIELD_DESTROY);
		createEReference(esmfStageActionFieldDestroyEClass, ESMF_STAGE_ACTION_FIELD_DESTROY__FIELD);

		esmfStageActionFieldRedistStoreEClass = createEClass(ESMF_STAGE_ACTION_FIELD_REDIST_STORE);
		createEReference(esmfStageActionFieldRedistStoreEClass, ESMF_STAGE_ACTION_FIELD_REDIST_STORE__SRC_FIELD);
		createEReference(esmfStageActionFieldRedistStoreEClass, ESMF_STAGE_ACTION_FIELD_REDIST_STORE__DST_FIELD);
		createEReference(esmfStageActionFieldRedistStoreEClass, ESMF_STAGE_ACTION_FIELD_REDIST_STORE__ROUTE_HANDLE);

		esmfStageActionFieldRedistEClass = createEClass(ESMF_STAGE_ACTION_FIELD_REDIST);
		createEReference(esmfStageActionFieldRedistEClass, ESMF_STAGE_ACTION_FIELD_REDIST__SRC_FIELD);
		createEReference(esmfStageActionFieldRedistEClass, ESMF_STAGE_ACTION_FIELD_REDIST__DST_FIELD);
		createEReference(esmfStageActionFieldRedistEClass, ESMF_STAGE_ACTION_FIELD_REDIST__ROUTE_HANDLE);

		esmfStageActionFieldRedistReleaseEClass = createEClass(ESMF_STAGE_ACTION_FIELD_REDIST_RELEASE);
		createEReference(esmfStageActionFieldRedistReleaseEClass, ESMF_STAGE_ACTION_FIELD_REDIST_RELEASE__ROUTE_HANDLE);

		esmfStageActionGridCreateEClass = createEClass(ESMF_STAGE_ACTION_GRID_CREATE);
		createEReference(esmfStageActionGridCreateEClass, ESMF_STAGE_ACTION_GRID_CREATE__GRID);

		esmfStageActionGridInheritEClass = createEClass(ESMF_STAGE_ACTION_GRID_INHERIT);
		createEReference(esmfStageActionGridInheritEClass, ESMF_STAGE_ACTION_GRID_INHERIT__GRID);

		esmfStageActionImportStateAddEClass = createEClass(ESMF_STAGE_ACTION_IMPORT_STATE_ADD);
		createEReference(esmfStageActionImportStateAddEClass, ESMF_STAGE_ACTION_IMPORT_STATE_ADD__ITEM);

		esmfStageActionExportStateAddEClass = createEClass(ESMF_STAGE_ACTION_EXPORT_STATE_ADD);
		createEReference(esmfStageActionExportStateAddEClass, ESMF_STAGE_ACTION_EXPORT_STATE_ADD__ITEM);

		esmfStageActionImportStateGetEClass = createEClass(ESMF_STAGE_ACTION_IMPORT_STATE_GET);
		createEAttribute(esmfStageActionImportStateGetEClass, ESMF_STAGE_ACTION_IMPORT_STATE_GET__ITEM_NAME);
		createEReference(esmfStageActionImportStateGetEClass, ESMF_STAGE_ACTION_IMPORT_STATE_GET__ITEM);

		esmfStageActionExportStateGetEClass = createEClass(ESMF_STAGE_ACTION_EXPORT_STATE_GET);
		createEAttribute(esmfStageActionExportStateGetEClass, ESMF_STAGE_ACTION_EXPORT_STATE_GET__ITEM_NAME);
		createEReference(esmfStageActionExportStateGetEClass, ESMF_STAGE_ACTION_EXPORT_STATE_GET__ITEM);

		esmfStageActionStateCreateEClass = createEClass(ESMF_STAGE_ACTION_STATE_CREATE);
		createEReference(esmfStageActionStateCreateEClass, ESMF_STAGE_ACTION_STATE_CREATE__STATE);

		esmfStageActionStateDestroyEClass = createEClass(ESMF_STAGE_ACTION_STATE_DESTROY);
		createEReference(esmfStageActionStateDestroyEClass, ESMF_STAGE_ACTION_STATE_DESTROY__STATE);

		esmfMethodEClass = createEClass(ESMF_METHOD);
		createEReference(esmfMethodEClass, ESMF_METHOD__COMPONENT);
		createEAttribute(esmfMethodEClass, ESMF_METHOD__PHASE);
		createEReference(esmfMethodEClass, ESMF_METHOD__IMPORT_STATE);
		createEReference(esmfMethodEClass, ESMF_METHOD__EXPORT_STATE);
		createEReference(esmfMethodEClass, ESMF_METHOD__CLOCK);
		createEReference(esmfMethodEClass, ESMF_METHOD__ACTION);
		createEReference(esmfMethodEClass, ESMF_METHOD__SIDL_METHOD);

		esmfInitMethodEClass = createEClass(ESMF_INIT_METHOD);

		esmfPreInitMethodSIDLEClass = createEClass(ESMF_PRE_INIT_METHOD_SIDL);

		esmfPostInitMethodSIDLEClass = createEClass(ESMF_POST_INIT_METHOD_SIDL);

		esmfRunMethodEClass = createEClass(ESMF_RUN_METHOD);

		esmfFinalizeMethodEClass = createEClass(ESMF_FINALIZE_METHOD);

		esmfFinalizeMethodSIDLEClass = createEClass(ESMF_FINALIZE_METHOD_SIDL);

		esmfRegisterMethodEClass = createEClass(ESMF_REGISTER_METHOD);
		createEReference(esmfRegisterMethodEClass, ESMF_REGISTER_METHOD__COMPONENT);

		esmfCalendarEClass = createEClass(ESMF_CALENDAR);

		esmfTimeIntervalEClass = createEClass(ESMF_TIME_INTERVAL);
		createEAttribute(esmfTimeIntervalEClass, ESMF_TIME_INTERVAL__HOURS);
		createEAttribute(esmfTimeIntervalEClass, ESMF_TIME_INTERVAL__MINUTES);
		createEAttribute(esmfTimeIntervalEClass, ESMF_TIME_INTERVAL__SECONDS);

		esmfTimeEClass = createEClass(ESMF_TIME);
		createEAttribute(esmfTimeEClass, ESMF_TIME__YEAR);
		createEAttribute(esmfTimeEClass, ESMF_TIME__MONTH);
		createEAttribute(esmfTimeEClass, ESMF_TIME__DAY);
		createEAttribute(esmfTimeEClass, ESMF_TIME__HOUR);
		createEAttribute(esmfTimeEClass, ESMF_TIME__MINUTE);
		createEAttribute(esmfTimeEClass, ESMF_TIME__SECOND);
		createEReference(esmfTimeEClass, ESMF_TIME__CALENDAR);

		esmfClockEClass = createEClass(ESMF_CLOCK);
		createEReference(esmfClockEClass, ESMF_CLOCK__START_TIME);
		createEReference(esmfClockEClass, ESMF_CLOCK__STOP_TIME);
		createEReference(esmfClockEClass, ESMF_CLOCK__TIME_STEP);
		createEReference(esmfClockEClass, ESMF_CLOCK__COMPONENT);

		esmfStateEClass = createEClass(ESMF_STATE);
		createEReference(esmfStateEClass, ESMF_STATE__COMPONENT);

		esmfStateItemEClass = createEClass(ESMF_STATE_ITEM);

		esmfScopedItemEClass = createEClass(ESMF_SCOPED_ITEM);
		createEReference(esmfScopedItemEClass, ESMF_SCOPED_ITEM__SCOPE);

		esmfFieldEClass = createEClass(ESMF_FIELD);
		createEReference(esmfFieldEClass, ESMF_FIELD__GRID);
		createEReference(esmfFieldEClass, ESMF_FIELD__ARRAY);
		createEAttribute(esmfFieldEClass, ESMF_FIELD__STAGGER_LOC);
		createEReference(esmfFieldEClass, ESMF_FIELD__ARRAY_SPEC);
		createEReference(esmfFieldEClass, ESMF_FIELD__SIDL_ARGUMENT);
		createEAttribute(esmfFieldEClass, ESMF_FIELD__INDEX);
		createEAttribute(esmfFieldEClass, ESMF_FIELD__TOTAL_LWIDTH);
		createEAttribute(esmfFieldEClass, ESMF_FIELD__TOTAL_UWIDTH);
		createEAttribute(esmfFieldEClass, ESMF_FIELD__LABEL);

		esmfFieldConnectionEClass = createEClass(ESMF_FIELD_CONNECTION);
		createEReference(esmfFieldConnectionEClass, ESMF_FIELD_CONNECTION__SRC_FIELD);
		createEReference(esmfFieldConnectionEClass, ESMF_FIELD_CONNECTION__DST_FIELD);
		createEReference(esmfFieldConnectionEClass, ESMF_FIELD_CONNECTION__COMPONENT);

		esmfArrayEClass = createEClass(ESMF_ARRAY);
		createEReference(esmfArrayEClass, ESMF_ARRAY__COMPONENT);
		createEReference(esmfArrayEClass, ESMF_ARRAY__ARRAY_SPEC);
		createEReference(esmfArrayEClass, ESMF_ARRAY__DIST_GRID);
		createEAttribute(esmfArrayEClass, ESMF_ARRAY__FARRAY);
		createEAttribute(esmfArrayEClass, ESMF_ARRAY__INDEXFLAG);
		createEAttribute(esmfArrayEClass, ESMF_ARRAY__HALO_LWIDTH);
		createEAttribute(esmfArrayEClass, ESMF_ARRAY__HALO_UWIDTH);

		esmfRouteHandleEClass = createEClass(ESMF_ROUTE_HANDLE);

		esmfArraySpecEClass = createEClass(ESMF_ARRAY_SPEC);
		createEAttribute(esmfArraySpecEClass, ESMF_ARRAY_SPEC__TYPEKIND);
		createEAttribute(esmfArraySpecEClass, ESMF_ARRAY_SPEC__RANK);

		esmfGridEClass = createEClass(ESMF_GRID);
		createEReference(esmfGridEClass, ESMF_GRID__DIST_GRID);

		extentEClass = createEClass(EXTENT);
		createEAttribute(extentEClass, EXTENT__MIN);
		createEAttribute(extentEClass, EXTENT__MAX);

		esmfDistGridEClass = createEClass(ESMF_DIST_GRID);
		createEReference(esmfDistGridEClass, ESMF_DIST_GRID__EXTENT);
		createEReference(esmfDistGridEClass, ESMF_DIST_GRID__DE);
		createEReference(esmfDistGridEClass, ESMF_DIST_GRID__DE_LAYOUT);
		createEAttribute(esmfDistGridEClass, ESMF_DIST_GRID__REGULAR_DECOMPOSITION_SIZE);

		esmfWorkspaceEClass = createEClass(ESMF_WORKSPACE);
		createEReference(esmfWorkspaceEClass, ESMF_WORKSPACE__COMPONENT);
		createEReference(esmfWorkspaceEClass, ESMF_WORKSPACE__CALENDAR);
		createEReference(esmfWorkspaceEClass, ESMF_WORKSPACE__STATE_ITEM);
		createEReference(esmfWorkspaceEClass, ESMF_WORKSPACE__DIST_GRID);
		createEReference(esmfWorkspaceEClass, ESMF_WORKSPACE__VIRTUAL_MACHINE);
		createEReference(esmfWorkspaceEClass, ESMF_WORKSPACE__PERSISTENT_EXECUTION_THREAD);
		createEReference(esmfWorkspaceEClass, ESMF_WORKSPACE__DE_LAYOUT);
		createEReference(esmfWorkspaceEClass, ESMF_WORKSPACE__CLOCK);

		esmfVirtualMachineEClass = createEClass(ESMF_VIRTUAL_MACHINE);
		createEAttribute(esmfVirtualMachineEClass, ESMF_VIRTUAL_MACHINE__NAME);
		createEReference(esmfVirtualMachineEClass, ESMF_VIRTUAL_MACHINE__PARENT_VM);
		createEAttribute(esmfVirtualMachineEClass, ESMF_VIRTUAL_MACHINE__PET_ID);

		esmfPersistentExecutionThreadEClass = createEClass(ESMF_PERSISTENT_EXECUTION_THREAD);
		createEAttribute(esmfPersistentExecutionThreadEClass, ESMF_PERSISTENT_EXECUTION_THREAD__ID);

		esmfdeLayoutEClass = createEClass(ESMF_DE_LAYOUT);
		createEAttribute(esmfdeLayoutEClass, ESMF_DE_LAYOUT__NAME);
		createEReference(esmfdeLayoutEClass, ESMF_DE_LAYOUT__DECOMPOSITION_ELEMENT);
		createEAttribute(esmfdeLayoutEClass, ESMF_DE_LAYOUT__DE_TO_PET);

		esmfDecompositionElementEClass = createEClass(ESMF_DECOMPOSITION_ELEMENT);
		createEReference(esmfDecompositionElementEClass, ESMF_DECOMPOSITION_ELEMENT__EXTENT);
		createEReference(esmfDecompositionElementEClass, ESMF_DECOMPOSITION_ELEMENT__PARENT_DIST_GRID);

		esmfVirtualAddressSpaceEClass = createEClass(ESMF_VIRTUAL_ADDRESS_SPACE);

		esmfActionEClass = createEClass(ESMF_ACTION);
		createEReference(esmfActionEClass, ESMF_ACTION__CONTEXT);

		esmfActionAPIEClass = createEClass(ESMF_ACTION_API);
		createEAttribute(esmfActionAPIEClass, ESMF_ACTION_API__RC);

		esmfActionMethodInvokePatternEClass = createEClass(ESMF_ACTION_METHOD_INVOKE_PATTERN);

		esmfActionMethodInvokeSequenceEClass = createEClass(ESMF_ACTION_METHOD_INVOKE_SEQUENCE);
		createEReference(esmfActionMethodInvokeSequenceEClass, ESMF_ACTION_METHOD_INVOKE_SEQUENCE__PATTERN);

		esmfActionMethodInvokeIterationEClass = createEClass(ESMF_ACTION_METHOD_INVOKE_ITERATION);

		esmfActionStateAddEClass = createEClass(ESMF_ACTION_STATE_ADD);
		createEReference(esmfActionStateAddEClass, ESMF_ACTION_STATE_ADD__STATE);
		createEReference(esmfActionStateAddEClass, ESMF_ACTION_STATE_ADD__ITEM_LIST);

		esmfActionStateCreateEClass = createEClass(ESMF_ACTION_STATE_CREATE);
		createEReference(esmfActionStateCreateEClass, ESMF_ACTION_STATE_CREATE__STATE);
		createEAttribute(esmfActionStateCreateEClass, ESMF_ACTION_STATE_CREATE__NAME);

		esmfActionStateGetEClass = createEClass(ESMF_ACTION_STATE_GET);
		createEReference(esmfActionStateGetEClass, ESMF_ACTION_STATE_GET__STATE);
		createEAttribute(esmfActionStateGetEClass, ESMF_ACTION_STATE_GET__ITEM_NAME);
		createEReference(esmfActionStateGetEClass, ESMF_ACTION_STATE_GET__ITEM);

		esmfActionStateReconcileEClass = createEClass(ESMF_ACTION_STATE_RECONCILE);
		createEReference(esmfActionStateReconcileEClass, ESMF_ACTION_STATE_RECONCILE__STATE);

		esmfActionArrayCreateEClass = createEClass(ESMF_ACTION_ARRAY_CREATE);
		createEReference(esmfActionArrayCreateEClass, ESMF_ACTION_ARRAY_CREATE__ARRAY);

		esmfActionArrayCreateAllocateASEClass = createEClass(ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS);
		createEReference(esmfActionArrayCreateAllocateASEClass, ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY);
		createEReference(esmfActionArrayCreateAllocateASEClass, ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__DIST_GRID);
		createEReference(esmfActionArrayCreateAllocateASEClass, ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY_SPEC);
		createEAttribute(esmfActionArrayCreateAllocateASEClass, ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__INDEXFLAG);
		createEAttribute(esmfActionArrayCreateAllocateASEClass, ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_LWIDTH);
		createEAttribute(esmfActionArrayCreateAllocateASEClass, ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_UWIDTH);

		esmfActionArraySpecSetEClass = createEClass(ESMF_ACTION_ARRAY_SPEC_SET);
		createEReference(esmfActionArraySpecSetEClass, ESMF_ACTION_ARRAY_SPEC_SET__ARRAY_SPEC);
		createEAttribute(esmfActionArraySpecSetEClass, ESMF_ACTION_ARRAY_SPEC_SET__TYPEKIND);
		createEAttribute(esmfActionArraySpecSetEClass, ESMF_ACTION_ARRAY_SPEC_SET__RANK);

		esmfActionClockCreateEClass = createEClass(ESMF_ACTION_CLOCK_CREATE);
		createEReference(esmfActionClockCreateEClass, ESMF_ACTION_CLOCK_CREATE__CLOCK);
		createEReference(esmfActionClockCreateEClass, ESMF_ACTION_CLOCK_CREATE__TIME_STEP);
		createEReference(esmfActionClockCreateEClass, ESMF_ACTION_CLOCK_CREATE__START_TIME);
		createEReference(esmfActionClockCreateEClass, ESMF_ACTION_CLOCK_CREATE__STOP_TIME);

		esmfActionClockGetEClass = createEClass(ESMF_ACTION_CLOCK_GET);
		createEReference(esmfActionClockGetEClass, ESMF_ACTION_CLOCK_GET__CLOCK);
		createEReference(esmfActionClockGetEClass, ESMF_ACTION_CLOCK_GET__TIME_STEP);
		createEReference(esmfActionClockGetEClass, ESMF_ACTION_CLOCK_GET__CURR_TIME);

		esmfActionClockGetTimestepEClass = createEClass(ESMF_ACTION_CLOCK_GET_TIMESTEP);
		createEReference(esmfActionClockGetTimestepEClass, ESMF_ACTION_CLOCK_GET_TIMESTEP__CLOCK);

		esmfActionCplCompCreateEClass = createEClass(ESMF_ACTION_CPL_COMP_CREATE);
		createEReference(esmfActionCplCompCreateEClass, ESMF_ACTION_CPL_COMP_CREATE__CPLCOMP);
		createEAttribute(esmfActionCplCompCreateEClass, ESMF_ACTION_CPL_COMP_CREATE__NAME);

		esmfActionCplCompInitializeEClass = createEClass(ESMF_ACTION_CPL_COMP_INITIALIZE);
		createEReference(esmfActionCplCompInitializeEClass, ESMF_ACTION_CPL_COMP_INITIALIZE__CPLCOMP);
		createEReference(esmfActionCplCompInitializeEClass, ESMF_ACTION_CPL_COMP_INITIALIZE__IMPORT_STATE);
		createEReference(esmfActionCplCompInitializeEClass, ESMF_ACTION_CPL_COMP_INITIALIZE__EXPORT_STATE);
		createEReference(esmfActionCplCompInitializeEClass, ESMF_ACTION_CPL_COMP_INITIALIZE__CLOCK);
		createEAttribute(esmfActionCplCompInitializeEClass, ESMF_ACTION_CPL_COMP_INITIALIZE__PHASE);

		esmfActionCplCompRunEClass = createEClass(ESMF_ACTION_CPL_COMP_RUN);
		createEReference(esmfActionCplCompRunEClass, ESMF_ACTION_CPL_COMP_RUN__CPLCOMP);
		createEReference(esmfActionCplCompRunEClass, ESMF_ACTION_CPL_COMP_RUN__IMPORT_STATE);
		createEReference(esmfActionCplCompRunEClass, ESMF_ACTION_CPL_COMP_RUN__EXPORT_STATE);
		createEReference(esmfActionCplCompRunEClass, ESMF_ACTION_CPL_COMP_RUN__CLOCK);
		createEAttribute(esmfActionCplCompRunEClass, ESMF_ACTION_CPL_COMP_RUN__PHASE);

		esmfActionCplCompFinalizeEClass = createEClass(ESMF_ACTION_CPL_COMP_FINALIZE);
		createEReference(esmfActionCplCompFinalizeEClass, ESMF_ACTION_CPL_COMP_FINALIZE__CPLCOMP);
		createEReference(esmfActionCplCompFinalizeEClass, ESMF_ACTION_CPL_COMP_FINALIZE__IMPORT_STATE);
		createEReference(esmfActionCplCompFinalizeEClass, ESMF_ACTION_CPL_COMP_FINALIZE__EXPORT_STATE);
		createEReference(esmfActionCplCompFinalizeEClass, ESMF_ACTION_CPL_COMP_FINALIZE__CLOCK);
		createEAttribute(esmfActionCplCompFinalizeEClass, ESMF_ACTION_CPL_COMP_FINALIZE__PHASE);

		esmfActionCplCompSetServicesEClass = createEClass(ESMF_ACTION_CPL_COMP_SET_SERVICES);
		createEReference(esmfActionCplCompSetServicesEClass, ESMF_ACTION_CPL_COMP_SET_SERVICES__CPLCOMP);
		createEAttribute(esmfActionCplCompSetServicesEClass, ESMF_ACTION_CPL_COMP_SET_SERVICES__USER_ROUTINE);
		createEAttribute(esmfActionCplCompSetServicesEClass, ESMF_ACTION_CPL_COMP_SET_SERVICES__USER_RC);

		esmfActionDistGridCreateEClass = createEClass(ESMF_ACTION_DIST_GRID_CREATE);
		createEReference(esmfActionDistGridCreateEClass, ESMF_ACTION_DIST_GRID_CREATE__DIST_GRID);
		createEAttribute(esmfActionDistGridCreateEClass, ESMF_ACTION_DIST_GRID_CREATE__MIN_INDEX);
		createEAttribute(esmfActionDistGridCreateEClass, ESMF_ACTION_DIST_GRID_CREATE__MAX_INDEX);
		createEAttribute(esmfActionDistGridCreateEClass, ESMF_ACTION_DIST_GRID_CREATE__REG_DECOMP);

		esmfActionFieldCreateEClass = createEClass(ESMF_ACTION_FIELD_CREATE);
		createEReference(esmfActionFieldCreateEClass, ESMF_ACTION_FIELD_CREATE__FIELD);

		esmfActionFieldCreateGridArrayEClass = createEClass(ESMF_ACTION_FIELD_CREATE_GRID_ARRAY);
		createEReference(esmfActionFieldCreateGridArrayEClass, ESMF_ACTION_FIELD_CREATE_GRID_ARRAY__FIELD);
		createEAttribute(esmfActionFieldCreateGridArrayEClass, ESMF_ACTION_FIELD_CREATE_GRID_ARRAY__NAME);
		createEReference(esmfActionFieldCreateGridArrayEClass, ESMF_ACTION_FIELD_CREATE_GRID_ARRAY__GRID);
		createEReference(esmfActionFieldCreateGridArrayEClass, ESMF_ACTION_FIELD_CREATE_GRID_ARRAY__ARRAY);

		esmfActionFieldCreateGridArraySpecEClass = createEClass(ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC);
		createEReference(esmfActionFieldCreateGridArraySpecEClass, ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__FIELD);
		createEReference(esmfActionFieldCreateGridArraySpecEClass, ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__GRID);
		createEReference(esmfActionFieldCreateGridArraySpecEClass, ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__ARRAY_SPEC);
		createEAttribute(esmfActionFieldCreateGridArraySpecEClass, ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__INDEXFLAG);
		createEAttribute(esmfActionFieldCreateGridArraySpecEClass, ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__TOTAL_LWIDTH);
		createEAttribute(esmfActionFieldCreateGridArraySpecEClass, ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__TOTAL_UWIDTH);
		createEAttribute(esmfActionFieldCreateGridArraySpecEClass, ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__NAME);

		esmfActionFieldCreateTKREClass = createEClass(ESMF_ACTION_FIELD_CREATE_TKR);
		createEReference(esmfActionFieldCreateTKREClass, ESMF_ACTION_FIELD_CREATE_TKR__FIELD);
		createEReference(esmfActionFieldCreateTKREClass, ESMF_ACTION_FIELD_CREATE_TKR__GRID);
		createEAttribute(esmfActionFieldCreateTKREClass, ESMF_ACTION_FIELD_CREATE_TKR__TYPEKIND);

		esmfActionFieldGetEClass = createEClass(ESMF_ACTION_FIELD_GET);
		createEReference(esmfActionFieldGetEClass, ESMF_ACTION_FIELD_GET__FIELD);
		createEAttribute(esmfActionFieldGetEClass, ESMF_ACTION_FIELD_GET__FARRAY_PTR);

		esmfActionFieldGetBoundsEClass = createEClass(ESMF_ACTION_FIELD_GET_BOUNDS);
		createEReference(esmfActionFieldGetBoundsEClass, ESMF_ACTION_FIELD_GET_BOUNDS__FIELD);
		createEAttribute(esmfActionFieldGetBoundsEClass, ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_LBOUND);
		createEAttribute(esmfActionFieldGetBoundsEClass, ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_UBOUND);
		createEAttribute(esmfActionFieldGetBoundsEClass, ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_LBOUND);
		createEAttribute(esmfActionFieldGetBoundsEClass, ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_UBOUND);
		createEAttribute(esmfActionFieldGetBoundsEClass, ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_LBOUND);
		createEAttribute(esmfActionFieldGetBoundsEClass, ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_UBOUND);

		esmfActionFieldHaloStoreEClass = createEClass(ESMF_ACTION_FIELD_HALO_STORE);
		createEReference(esmfActionFieldHaloStoreEClass, ESMF_ACTION_FIELD_HALO_STORE__FIELD);
		createEReference(esmfActionFieldHaloStoreEClass, ESMF_ACTION_FIELD_HALO_STORE__ROUTE_HANDLE);

		esmfActionFieldHaloEClass = createEClass(ESMF_ACTION_FIELD_HALO);
		createEReference(esmfActionFieldHaloEClass, ESMF_ACTION_FIELD_HALO__FIELD);
		createEReference(esmfActionFieldHaloEClass, ESMF_ACTION_FIELD_HALO__ROUTE_HANDLE);

		esmfActionFieldHaloReleaseEClass = createEClass(ESMF_ACTION_FIELD_HALO_RELEASE);
		createEReference(esmfActionFieldHaloReleaseEClass, ESMF_ACTION_FIELD_HALO_RELEASE__ROUTE_HANDLE);

		esmfActionFieldRedistStoreEClass = createEClass(ESMF_ACTION_FIELD_REDIST_STORE);
		createEReference(esmfActionFieldRedistStoreEClass, ESMF_ACTION_FIELD_REDIST_STORE__SRC_FIELD);
		createEReference(esmfActionFieldRedistStoreEClass, ESMF_ACTION_FIELD_REDIST_STORE__DST_FIELD);
		createEReference(esmfActionFieldRedistStoreEClass, ESMF_ACTION_FIELD_REDIST_STORE__ROUTE_HANDLE);

		esmfActionFieldRedistEClass = createEClass(ESMF_ACTION_FIELD_REDIST);
		createEReference(esmfActionFieldRedistEClass, ESMF_ACTION_FIELD_REDIST__SRC_FIELD);
		createEReference(esmfActionFieldRedistEClass, ESMF_ACTION_FIELD_REDIST__DST_FIELD);
		createEReference(esmfActionFieldRedistEClass, ESMF_ACTION_FIELD_REDIST__ROUTE_HANDLE);

		esmfActionFieldRedistReleaseEClass = createEClass(ESMF_ACTION_FIELD_REDIST_RELEASE);
		createEReference(esmfActionFieldRedistReleaseEClass, ESMF_ACTION_FIELD_REDIST_RELEASE__ROUTE_HANDLE);

		esmfActionFrameworkInitEClass = createEClass(ESMF_ACTION_FRAMEWORK_INIT);
		createEAttribute(esmfActionFrameworkInitEClass, ESMF_ACTION_FRAMEWORK_INIT__DEFAULT_CAL_KIND);

		esmfActionFrameworkFinalizeEClass = createEClass(ESMF_ACTION_FRAMEWORK_FINALIZE);

		esmfActionGridCreateEClass = createEClass(ESMF_ACTION_GRID_CREATE);
		createEReference(esmfActionGridCreateEClass, ESMF_ACTION_GRID_CREATE__GRID);
		createEReference(esmfActionGridCreateEClass, ESMF_ACTION_GRID_CREATE__DIST_GRID);
		createEAttribute(esmfActionGridCreateEClass, ESMF_ACTION_GRID_CREATE__NAME);
		createEAttribute(esmfActionGridCreateEClass, ESMF_ACTION_GRID_CREATE__INDEXFLAG);

		esmfActionGridGetEClass = createEClass(ESMF_ACTION_GRID_GET);
		createEReference(esmfActionGridGetEClass, ESMF_ACTION_GRID_GET__GRID);

		esmfActionGridGetPLocalDeEClass = createEClass(ESMF_ACTION_GRID_GET_PLOCAL_DE);
		createEAttribute(esmfActionGridGetPLocalDeEClass, ESMF_ACTION_GRID_GET_PLOCAL_DE__LOCAL_DE);
		createEAttribute(esmfActionGridGetPLocalDeEClass, ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_LBOUND);
		createEAttribute(esmfActionGridGetPLocalDeEClass, ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_UBOUND);

		esmfActionGridGetPLocalDePSlocEClass = createEClass(ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC);
		createEAttribute(esmfActionGridGetPLocalDePSlocEClass, ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__STAGGERLOC);
		createEAttribute(esmfActionGridGetPLocalDePSlocEClass, ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_LBOUND);
		createEAttribute(esmfActionGridGetPLocalDePSlocEClass, ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_UBOUND);
		createEAttribute(esmfActionGridGetPLocalDePSlocEClass, ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_LBOUND);
		createEAttribute(esmfActionGridGetPLocalDePSlocEClass, ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_UBOUND);

		esmfActionGridGetCoordEClass = createEClass(ESMF_ACTION_GRID_GET_COORD);
		createEReference(esmfActionGridGetCoordEClass, ESMF_ACTION_GRID_GET_COORD__GRID);
		createEAttribute(esmfActionGridGetCoordEClass, ESMF_ACTION_GRID_GET_COORD__COORD_DIM);
		createEAttribute(esmfActionGridGetCoordEClass, ESMF_ACTION_GRID_GET_COORD__FARRAY_PTR);

		esmfActionGridCompCreateEClass = createEClass(ESMF_ACTION_GRID_COMP_CREATE);
		createEReference(esmfActionGridCompCreateEClass, ESMF_ACTION_GRID_COMP_CREATE__GRIDCOMP);
		createEAttribute(esmfActionGridCompCreateEClass, ESMF_ACTION_GRID_COMP_CREATE__NAME);

		esmfActionGridCompInitializeEClass = createEClass(ESMF_ACTION_GRID_COMP_INITIALIZE);
		createEReference(esmfActionGridCompInitializeEClass, ESMF_ACTION_GRID_COMP_INITIALIZE__GRIDCOMP);
		createEReference(esmfActionGridCompInitializeEClass, ESMF_ACTION_GRID_COMP_INITIALIZE__IMPORT_STATE);
		createEReference(esmfActionGridCompInitializeEClass, ESMF_ACTION_GRID_COMP_INITIALIZE__EXPORT_STATE);
		createEReference(esmfActionGridCompInitializeEClass, ESMF_ACTION_GRID_COMP_INITIALIZE__CLOCK);
		createEAttribute(esmfActionGridCompInitializeEClass, ESMF_ACTION_GRID_COMP_INITIALIZE__PHASE);

		esmfActionGridCompRunEClass = createEClass(ESMF_ACTION_GRID_COMP_RUN);
		createEReference(esmfActionGridCompRunEClass, ESMF_ACTION_GRID_COMP_RUN__GRIDCOMP);
		createEReference(esmfActionGridCompRunEClass, ESMF_ACTION_GRID_COMP_RUN__IMPORT_STATE);
		createEReference(esmfActionGridCompRunEClass, ESMF_ACTION_GRID_COMP_RUN__EXPORT_STATE);
		createEReference(esmfActionGridCompRunEClass, ESMF_ACTION_GRID_COMP_RUN__CLOCK);
		createEAttribute(esmfActionGridCompRunEClass, ESMF_ACTION_GRID_COMP_RUN__PHASE);

		esmfActionGridCompFinalizeEClass = createEClass(ESMF_ACTION_GRID_COMP_FINALIZE);
		createEReference(esmfActionGridCompFinalizeEClass, ESMF_ACTION_GRID_COMP_FINALIZE__GRIDCOMP);
		createEReference(esmfActionGridCompFinalizeEClass, ESMF_ACTION_GRID_COMP_FINALIZE__IMPORT_STATE);
		createEReference(esmfActionGridCompFinalizeEClass, ESMF_ACTION_GRID_COMP_FINALIZE__EXPORT_STATE);
		createEReference(esmfActionGridCompFinalizeEClass, ESMF_ACTION_GRID_COMP_FINALIZE__CLOCK);
		createEAttribute(esmfActionGridCompFinalizeEClass, ESMF_ACTION_GRID_COMP_FINALIZE__PHASE);

		esmfActionGridCompSetServicesEClass = createEClass(ESMF_ACTION_GRID_COMP_SET_SERVICES);
		createEReference(esmfActionGridCompSetServicesEClass, ESMF_ACTION_GRID_COMP_SET_SERVICES__GRIDCOMP);
		createEAttribute(esmfActionGridCompSetServicesEClass, ESMF_ACTION_GRID_COMP_SET_SERVICES__USER_ROUTINE);
		createEAttribute(esmfActionGridCompSetServicesEClass, ESMF_ACTION_GRID_COMP_SET_SERVICES__USER_RC);

		esmfActionMethodInvokeEClass = createEClass(ESMF_ACTION_METHOD_INVOKE);
		createEReference(esmfActionMethodInvokeEClass, ESMF_ACTION_METHOD_INVOKE__METHOD);
		createEReference(esmfActionMethodInvokeEClass, ESMF_ACTION_METHOD_INVOKE__IMPORT_STATE);
		createEReference(esmfActionMethodInvokeEClass, ESMF_ACTION_METHOD_INVOKE__EXPORT_STATE);

		esmfActionTimeSetEClass = createEClass(ESMF_ACTION_TIME_SET);
		createEReference(esmfActionTimeSetEClass, ESMF_ACTION_TIME_SET__TIME);
		createEAttribute(esmfActionTimeSetEClass, ESMF_ACTION_TIME_SET__YY);
		createEAttribute(esmfActionTimeSetEClass, ESMF_ACTION_TIME_SET__MM);
		createEAttribute(esmfActionTimeSetEClass, ESMF_ACTION_TIME_SET__DD);
		createEAttribute(esmfActionTimeSetEClass, ESMF_ACTION_TIME_SET__H);
		createEAttribute(esmfActionTimeSetEClass, ESMF_ACTION_TIME_SET__M);
		createEAttribute(esmfActionTimeSetEClass, ESMF_ACTION_TIME_SET__S);

		esmfActionTimeGetEClass = createEClass(ESMF_ACTION_TIME_GET);
		createEReference(esmfActionTimeGetEClass, ESMF_ACTION_TIME_GET__TIME);
		createEAttribute(esmfActionTimeGetEClass, ESMF_ACTION_TIME_GET__YY);
		createEAttribute(esmfActionTimeGetEClass, ESMF_ACTION_TIME_GET__MM);
		createEAttribute(esmfActionTimeGetEClass, ESMF_ACTION_TIME_GET__DD);
		createEAttribute(esmfActionTimeGetEClass, ESMF_ACTION_TIME_GET__H);
		createEAttribute(esmfActionTimeGetEClass, ESMF_ACTION_TIME_GET__M);
		createEAttribute(esmfActionTimeGetEClass, ESMF_ACTION_TIME_GET__S);

		esmfActionTimeIntervalSetEClass = createEClass(ESMF_ACTION_TIME_INTERVAL_SET);
		createEReference(esmfActionTimeIntervalSetEClass, ESMF_ACTION_TIME_INTERVAL_SET__TIME_INTERVAL);
		createEAttribute(esmfActionTimeIntervalSetEClass, ESMF_ACTION_TIME_INTERVAL_SET__H);
		createEAttribute(esmfActionTimeIntervalSetEClass, ESMF_ACTION_TIME_INTERVAL_SET__M);
		createEAttribute(esmfActionTimeIntervalSetEClass, ESMF_ACTION_TIME_INTERVAL_SET__S);

		esmfActionTimeIntervalGetEClass = createEClass(ESMF_ACTION_TIME_INTERVAL_GET);
		createEReference(esmfActionTimeIntervalGetEClass, ESMF_ACTION_TIME_INTERVAL_GET__TIME_INTERVAL);
		createEAttribute(esmfActionTimeIntervalGetEClass, ESMF_ACTION_TIME_INTERVAL_GET__H);
		createEAttribute(esmfActionTimeIntervalGetEClass, ESMF_ACTION_TIME_INTERVAL_GET__M);
		createEAttribute(esmfActionTimeIntervalGetEClass, ESMF_ACTION_TIME_INTERVAL_GET__S);

		esmfActionUserServiceInvokeEClass = createEClass(ESMF_ACTION_USER_SERVICE_INVOKE);
		createEAttribute(esmfActionUserServiceInvokeEClass, ESMF_ACTION_USER_SERVICE_INVOKE__DECLARATION);
		createEAttribute(esmfActionUserServiceInvokeEClass, ESMF_ACTION_USER_SERVICE_INVOKE__EXECUTION);

		esmfCallEClass = createEClass(ESMF_CALL);

		esmfCallGridCompCreateEClass = createEClass(ESMF_CALL_GRID_COMP_CREATE);
		createEReference(esmfCallGridCompCreateEClass, ESMF_CALL_GRID_COMP_CREATE__GRIDCOMP);

		esmfCallGridCompInitializeEClass = createEClass(ESMF_CALL_GRID_COMP_INITIALIZE);
		createEReference(esmfCallGridCompInitializeEClass, ESMF_CALL_GRID_COMP_INITIALIZE__GRIDCOMP);

		esmfCallGridCompSetServicesEClass = createEClass(ESMF_CALL_GRID_COMP_SET_SERVICES);
		createEReference(esmfCallGridCompSetServicesEClass, ESMF_CALL_GRID_COMP_SET_SERVICES__GRIDCOMP);

		esmfCallCplCompCreateEClass = createEClass(ESMF_CALL_CPL_COMP_CREATE);
		createEReference(esmfCallCplCompCreateEClass, ESMF_CALL_CPL_COMP_CREATE__CPLCOMP);

		esmfCallCplCompInitializeEClass = createEClass(ESMF_CALL_CPL_COMP_INITIALIZE);
		createEReference(esmfCallCplCompInitializeEClass, ESMF_CALL_CPL_COMP_INITIALIZE__CPLCOMP);

		esmfCallCplCompSetServicesEClass = createEClass(ESMF_CALL_CPL_COMP_SET_SERVICES);
		createEReference(esmfCallCplCompSetServicesEClass, ESMF_CALL_CPL_COMP_SET_SERVICES__CPLCOMP);

		esmfCallFieldCreateSIDLEClass = createEClass(ESMF_CALL_FIELD_CREATE_SIDL);
		createEReference(esmfCallFieldCreateSIDLEClass, ESMF_CALL_FIELD_CREATE_SIDL__ARGUMENT);

		esmfCallSIDLMethodEClass = createEClass(ESMF_CALL_SIDL_METHOD);
		createEReference(esmfCallSIDLMethodEClass, ESMF_CALL_SIDL_METHOD__SIDL_METHOD);

		// Create enums
		esmfCalKindEEnum = createEEnum(ESMF_CAL_KIND);
		esmfStaggerLocEEnum = createEEnum(ESMF_STAGGER_LOC);
		esmfTypeKindEEnum = createEEnum(ESMF_TYPE_KIND);
		esmF_INDEXEEnum = createEEnum(ESMF_INDEX);

		// Create data types
		eIntArrayEDataType = createEDataType(EINT_ARRAY);
		esmfUserTokenEDataType = createEDataType(ESMF_USER_TOKEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SIDLPackage theSIDLPackage = (SIDLPackage)EPackage.Registry.INSTANCE.getEPackage(SIDLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		esmfComponentEClass.getESuperTypes().add(this.getESMFNamedEntity());
		esmfComponentEClass.getESuperTypes().add(this.getESMFScope());
		esmfGriddedComponentEClass.getESuperTypes().add(this.getESMFComponent());
		esmfCouplerComponentEClass.getESuperTypes().add(this.getESMFComponent());
		esmfSimpleCouplerComponentEClass.getESuperTypes().add(this.getESMFCouplerComponent());
		esmfDriverEClass.getESuperTypes().add(this.getESMFComponent());
		esmfStageEClass.getESuperTypes().add(this.getESMFNamedEntity());
		esmfStageEClass.getESuperTypes().add(this.getESMFScope());
		esmfStageInitializeEClass.getESuperTypes().add(this.getESMFStage());
		esmfStageRunEClass.getESuperTypes().add(this.getESMFStage());
		esmfStageFinalizeEClass.getESuperTypes().add(this.getESMFStage());
		esmfStageActionSequenceEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionIterateEClass.getESuperTypes().add(this.getESMFStageActionSequence());
		esmfStageActionIterateClockEClass.getESuperTypes().add(this.getESMFStageActionIterate());
		esmfStageActionArraySpecCreateEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionComponentCreateEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionComponentDestroyEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionComponentSetGridEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionExecuteStageEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionFieldCreateEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionFieldDestroyEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionFieldRedistStoreEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionFieldRedistEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionFieldRedistReleaseEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionGridCreateEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionGridInheritEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionImportStateAddEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionExportStateAddEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionImportStateGetEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionExportStateGetEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionStateCreateEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfStageActionStateDestroyEClass.getESuperTypes().add(this.getESMFStageAction());
		esmfMethodEClass.getESuperTypes().add(this.getESMFNamedEntity());
		esmfInitMethodEClass.getESuperTypes().add(this.getESMFMethod());
		esmfPreInitMethodSIDLEClass.getESuperTypes().add(this.getESMFInitMethod());
		esmfPostInitMethodSIDLEClass.getESuperTypes().add(this.getESMFInitMethod());
		esmfRunMethodEClass.getESuperTypes().add(this.getESMFMethod());
		esmfFinalizeMethodEClass.getESuperTypes().add(this.getESMFMethod());
		esmfFinalizeMethodSIDLEClass.getESuperTypes().add(this.getESMFFinalizeMethod());
		esmfRegisterMethodEClass.getESuperTypes().add(this.getESMFNamedEntity());
		esmfTimeIntervalEClass.getESuperTypes().add(this.getESMFNamedEntity());
		esmfTimeEClass.getESuperTypes().add(this.getESMFNamedEntity());
		esmfClockEClass.getESuperTypes().add(this.getESMFNamedEntity());
		esmfStateEClass.getESuperTypes().add(this.getESMFStateItem());
		esmfStateEClass.getESuperTypes().add(this.getESMFScopedItem());
		esmfStateItemEClass.getESuperTypes().add(this.getESMFNamedEntity());
		esmfStateItemEClass.getESuperTypes().add(this.getESMFScopedItem());
		esmfFieldEClass.getESuperTypes().add(this.getESMFStateItem());
		esmfFieldEClass.getESuperTypes().add(this.getESMFScopedItem());
		esmfArrayEClass.getESuperTypes().add(this.getESMFStateItem());
		esmfArrayEClass.getESuperTypes().add(this.getESMFScopedItem());
		esmfRouteHandleEClass.getESuperTypes().add(this.getESMFNamedEntity());
		esmfRouteHandleEClass.getESuperTypes().add(this.getESMFScopedItem());
		esmfArraySpecEClass.getESuperTypes().add(this.getESMFNamedEntity());
		esmfArraySpecEClass.getESuperTypes().add(this.getESMFScopedItem());
		esmfGridEClass.getESuperTypes().add(this.getESMFNamedEntity());
		esmfGridEClass.getESuperTypes().add(this.getESMFScopedItem());
		esmfDistGridEClass.getESuperTypes().add(this.getESMFNamedEntity());
		esmfDistGridEClass.getESuperTypes().add(this.getESMFScopedItem());
		esmfActionAPIEClass.getESuperTypes().add(this.getESMFAction());
		esmfActionMethodInvokePatternEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionMethodInvokeSequenceEClass.getESuperTypes().add(this.getESMFActionMethodInvokePattern());
		esmfActionMethodInvokeIterationEClass.getESuperTypes().add(this.getESMFActionMethodInvokeSequence());
		esmfActionStateAddEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionStateCreateEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionStateGetEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionStateReconcileEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionArrayCreateEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionArrayCreateAllocateASEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionArraySpecSetEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionClockCreateEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionClockGetEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionClockGetTimestepEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionCplCompCreateEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionCplCompInitializeEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionCplCompRunEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionCplCompFinalizeEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionCplCompSetServicesEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionDistGridCreateEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionFieldCreateEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionFieldCreateGridArrayEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionFieldCreateGridArraySpecEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionFieldCreateTKREClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionFieldGetEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionFieldGetBoundsEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionFieldHaloStoreEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionFieldHaloEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionFieldHaloReleaseEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionFieldRedistStoreEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionFieldRedistEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionFieldRedistReleaseEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionFrameworkInitEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionFrameworkFinalizeEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionGridCreateEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionGridGetEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionGridGetPLocalDeEClass.getESuperTypes().add(this.getESMFActionGridGet());
		esmfActionGridGetPLocalDePSlocEClass.getESuperTypes().add(this.getESMFActionGridGetPLocalDe());
		esmfActionGridGetCoordEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionGridCompCreateEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionGridCompInitializeEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionGridCompRunEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionGridCompFinalizeEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionGridCompSetServicesEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionMethodInvokeEClass.getESuperTypes().add(this.getESMFActionMethodInvokePattern());
		esmfActionTimeSetEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionTimeGetEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionTimeIntervalSetEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionTimeIntervalGetEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfActionUserServiceInvokeEClass.getESuperTypes().add(this.getESMFActionAPI());
		esmfCallEClass.getESuperTypes().add(this.getESMFAction());
		esmfCallGridCompCreateEClass.getESuperTypes().add(this.getESMFCall());
		esmfCallGridCompInitializeEClass.getESuperTypes().add(this.getESMFCall());
		esmfCallGridCompSetServicesEClass.getESuperTypes().add(this.getESMFCall());
		esmfCallCplCompCreateEClass.getESuperTypes().add(this.getESMFCall());
		esmfCallCplCompInitializeEClass.getESuperTypes().add(this.getESMFCall());
		esmfCallCplCompSetServicesEClass.getESuperTypes().add(this.getESMFCall());
		esmfCallFieldCreateSIDLEClass.getESuperTypes().add(this.getESMFCall());
		esmfCallSIDLMethodEClass.getESuperTypes().add(this.getESMFCall());

		// Initialize classes and features; add operations and parameters
		initEClass(esmfNamedEntityEClass, ESMFNamedEntity.class, "ESMFNamedEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESMFNamedEntity_Name(), ecorePackage.getEString(), "name", null, 1, 1, ESMFNamedEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfScopeEClass, ESMFScope.class, "ESMFScope", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFScope_Item(), this.getESMFScopedItem(), this.getESMFScopedItem_Scope(), "item", null, 0, -1, ESMFScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfComponentEClass, ESMFComponent.class, "ESMFComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFComponent_Method(), this.getESMFMethod(), this.getESMFMethod_Component(), "method", null, 0, -1, ESMFComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFComponent_RegisterMethod(), this.getESMFRegisterMethod(), this.getESMFRegisterMethod_Component(), "registerMethod", null, 1, 1, ESMFComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFComponent_ImportState(), this.getESMFState(), null, "importState", null, 0, 1, ESMFComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFComponent_ExportState(), this.getESMFState(), null, "exportState", null, 0, 1, ESMFComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFComponent_Component(), this.getESMFComponent(), this.getESMFComponent_Parent(), "component", null, 0, -1, ESMFComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFComponent_Parent(), this.getESMFComponent(), this.getESMFComponent_Component(), "parent", null, 0, 1, ESMFComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFComponent_Clock(), this.getESMFClock(), this.getESMFClock_Component(), "clock", null, 0, -1, ESMFComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFComponent_ModelClock(), this.getESMFClock(), null, "modelClock", null, 0, 1, ESMFComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFComponent_Time(), this.getESMFTime(), null, "time", null, 0, -1, ESMFComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFComponent_TimeInterval(), this.getESMFTimeInterval(), null, "timeInterval", null, 0, -1, ESMFComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFComponent_SIDLClass(), theSIDLPackage.getClass_(), null, "SIDLClass", null, 0, 1, ESMFComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFComponent_Stage(), this.getESMFStage(), this.getESMFStage_Component(), "stage", null, 0, -1, ESMFComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfGriddedComponentEClass, ESMFGriddedComponent.class, "ESMFGriddedComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfCouplerComponentEClass, ESMFCouplerComponent.class, "ESMFCouplerComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfSimpleCouplerComponentEClass, ESMFSimpleCouplerComponent.class, "ESMFSimpleCouplerComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFSimpleCouplerComponent_FieldConnection(), this.getESMFFieldConnection(), this.getESMFFieldConnection_Component(), "fieldConnection", null, 0, -1, ESMFSimpleCouplerComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfDriverEClass, ESMFDriver.class, "ESMFDriver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfStageEClass, ESMFStage.class, "ESMFStage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStage_Component(), this.getESMFComponent(), this.getESMFComponent_Stage(), "component", null, 1, 1, ESMFStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFStage_Phase(), ecorePackage.getEInt(), "phase", "1", 1, 1, ESMFStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFStage_Actions(), this.getESMFStageActionSequence(), this.getESMFStageActionSequence_Stage(), "actions", null, 0, 1, ESMFStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageInitializeEClass, ESMFStageInitialize.class, "ESMFStageInitialize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfStageRunEClass, ESMFStageRun.class, "ESMFStageRun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfStageFinalizeEClass, ESMFStageFinalize.class, "ESMFStageFinalize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfStageActionEClass, ESMFStageAction.class, "ESMFStageAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageAction_Parent(), this.getESMFStageActionSequence(), this.getESMFStageActionSequence_Action(), "parent", null, 0, 1, ESMFStageAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionSequenceEClass, ESMFStageActionSequence.class, "ESMFStageActionSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionSequence_Action(), this.getESMFStageAction(), this.getESMFStageAction_Parent(), "action", null, 1, -1, ESMFStageActionSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFStageActionSequence_Stage(), this.getESMFStage(), this.getESMFStage_Actions(), "stage", null, 0, 1, ESMFStageActionSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionIterateEClass, ESMFStageActionIterate.class, "ESMFStageActionIterate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfStageActionIterateClockEClass, ESMFStageActionIterateClock.class, "ESMFStageActionIterateClock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfStageActionArraySpecCreateEClass, ESMFStageActionArraySpecCreate.class, "ESMFStageActionArraySpecCreate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionArraySpecCreate_ArraySpec(), this.getESMFArraySpec(), null, "arraySpec", null, 1, -1, ESMFStageActionArraySpecCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionComponentCreateEClass, ESMFStageActionComponentCreate.class, "ESMFStageActionComponentCreate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionComponentCreate_Component(), this.getESMFComponent(), null, "component", null, 1, -1, ESMFStageActionComponentCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionComponentDestroyEClass, ESMFStageActionComponentDestroy.class, "ESMFStageActionComponentDestroy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionComponentDestroy_Component(), this.getESMFComponent(), null, "component", null, 1, -1, ESMFStageActionComponentDestroy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionComponentSetGridEClass, ESMFStageActionComponentSetGrid.class, "ESMFStageActionComponentSetGrid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionComponentSetGrid_Component(), this.getESMFComponent(), null, "component", null, 1, 1, ESMFStageActionComponentSetGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFStageActionComponentSetGrid_Grid(), this.getESMFGrid(), null, "grid", null, 1, 1, ESMFStageActionComponentSetGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionExecuteStageEClass, ESMFStageActionExecuteStage.class, "ESMFStageActionExecuteStage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionExecuteStage_StageToExecute(), this.getESMFStage(), null, "stageToExecute", null, 1, 1, ESMFStageActionExecuteStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFStageActionExecuteStage_ImportState(), this.getESMFState(), null, "importState", null, 0, 1, ESMFStageActionExecuteStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFStageActionExecuteStage_ExportState(), this.getESMFState(), null, "exportState", null, 0, 1, ESMFStageActionExecuteStage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionFieldCreateEClass, ESMFStageActionFieldCreate.class, "ESMFStageActionFieldCreate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionFieldCreate_Field(), this.getESMFField(), null, "field", null, 1, -1, ESMFStageActionFieldCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionFieldDestroyEClass, ESMFStageActionFieldDestroy.class, "ESMFStageActionFieldDestroy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionFieldDestroy_Field(), this.getESMFField(), null, "field", null, 1, -1, ESMFStageActionFieldDestroy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionFieldRedistStoreEClass, ESMFStageActionFieldRedistStore.class, "ESMFStageActionFieldRedistStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionFieldRedistStore_SrcField(), this.getESMFField(), null, "srcField", null, 1, 1, ESMFStageActionFieldRedistStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFStageActionFieldRedistStore_DstField(), this.getESMFField(), null, "dstField", null, 1, 1, ESMFStageActionFieldRedistStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFStageActionFieldRedistStore_RouteHandle(), this.getESMFRouteHandle(), null, "routeHandle", null, 1, 1, ESMFStageActionFieldRedistStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionFieldRedistEClass, ESMFStageActionFieldRedist.class, "ESMFStageActionFieldRedist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionFieldRedist_SrcField(), this.getESMFField(), null, "srcField", null, 1, 1, ESMFStageActionFieldRedist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFStageActionFieldRedist_DstField(), this.getESMFField(), null, "dstField", null, 1, 1, ESMFStageActionFieldRedist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFStageActionFieldRedist_RouteHandle(), this.getESMFRouteHandle(), null, "routeHandle", null, 1, 1, ESMFStageActionFieldRedist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionFieldRedistReleaseEClass, ESMFStageActionFieldRedistRelease.class, "ESMFStageActionFieldRedistRelease", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionFieldRedistRelease_RouteHandle(), this.getESMFRouteHandle(), null, "routeHandle", null, 1, 1, ESMFStageActionFieldRedistRelease.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionGridCreateEClass, ESMFStageActionGridCreate.class, "ESMFStageActionGridCreate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionGridCreate_Grid(), this.getESMFGrid(), null, "grid", null, 1, -1, ESMFStageActionGridCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionGridInheritEClass, ESMFStageActionGridInherit.class, "ESMFStageActionGridInherit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionGridInherit_Grid(), this.getESMFGrid(), null, "grid", null, 1, -1, ESMFStageActionGridInherit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionImportStateAddEClass, ESMFStageActionImportStateAdd.class, "ESMFStageActionImportStateAdd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionImportStateAdd_Item(), this.getESMFStateItem(), null, "item", null, 1, -1, ESMFStageActionImportStateAdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionExportStateAddEClass, ESMFStageActionExportStateAdd.class, "ESMFStageActionExportStateAdd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionExportStateAdd_Item(), this.getESMFStateItem(), null, "item", null, 1, -1, ESMFStageActionExportStateAdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionImportStateGetEClass, ESMFStageActionImportStateGet.class, "ESMFStageActionImportStateGet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESMFStageActionImportStateGet_ItemName(), ecorePackage.getEString(), "itemName", null, 1, 1, ESMFStageActionImportStateGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFStageActionImportStateGet_Item(), this.getESMFStateItem(), null, "item", null, 1, 1, ESMFStageActionImportStateGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionExportStateGetEClass, ESMFStageActionExportStateGet.class, "ESMFStageActionExportStateGet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESMFStageActionExportStateGet_ItemName(), ecorePackage.getEString(), "itemName", null, 1, 1, ESMFStageActionExportStateGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFStageActionExportStateGet_Item(), this.getESMFStateItem(), null, "item", null, 1, 1, ESMFStageActionExportStateGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionStateCreateEClass, ESMFStageActionStateCreate.class, "ESMFStageActionStateCreate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionStateCreate_State(), this.getESMFState(), null, "state", null, 1, -1, ESMFStageActionStateCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStageActionStateDestroyEClass, ESMFStageActionStateDestroy.class, "ESMFStageActionStateDestroy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFStageActionStateDestroy_State(), this.getESMFState(), null, "state", null, 1, -1, ESMFStageActionStateDestroy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfMethodEClass, ESMFMethod.class, "ESMFMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFMethod_Component(), this.getESMFComponent(), this.getESMFComponent_Method(), "component", null, 1, 1, ESMFMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFMethod_Phase(), ecorePackage.getEInt(), "phase", "1", 1, 1, ESMFMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFMethod_ImportState(), this.getESMFState(), null, "importState", null, 0, 1, ESMFMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFMethod_ExportState(), this.getESMFState(), null, "exportState", null, 0, 1, ESMFMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFMethod_Clock(), this.getESMFClock(), null, "clock", null, 0, 1, ESMFMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFMethod_Action(), this.getESMFAction(), this.getESMFAction_Context(), "action", null, 0, -1, ESMFMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFMethod_SIDLMethod(), theSIDLPackage.getMethod(), null, "SIDLMethod", null, 0, 1, ESMFMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfInitMethodEClass, ESMFInitMethod.class, "ESMFInitMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfPreInitMethodSIDLEClass, ESMFPreInitMethodSIDL.class, "ESMFPreInitMethodSIDL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfPostInitMethodSIDLEClass, ESMFPostInitMethodSIDL.class, "ESMFPostInitMethodSIDL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfRunMethodEClass, ESMFRunMethod.class, "ESMFRunMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfFinalizeMethodEClass, ESMFFinalizeMethod.class, "ESMFFinalizeMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfFinalizeMethodSIDLEClass, ESMFFinalizeMethodSIDL.class, "ESMFFinalizeMethodSIDL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfRegisterMethodEClass, ESMFRegisterMethod.class, "ESMFRegisterMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFRegisterMethod_Component(), this.getESMFComponent(), this.getESMFComponent_RegisterMethod(), "component", null, 1, 1, ESMFRegisterMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfCalendarEClass, ESMFCalendar.class, "ESMFCalendar", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfTimeIntervalEClass, ESMFTimeInterval.class, "ESMFTimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESMFTimeInterval_Hours(), ecorePackage.getEInt(), "hours", "0", 1, 1, ESMFTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFTimeInterval_Minutes(), ecorePackage.getEInt(), "minutes", "0", 1, 1, ESMFTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFTimeInterval_Seconds(), ecorePackage.getEInt(), "seconds", "0", 1, 1, ESMFTimeInterval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfTimeEClass, ESMFTime.class, "ESMFTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESMFTime_Year(), ecorePackage.getEInt(), "year", null, 1, 1, ESMFTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFTime_Month(), ecorePackage.getEInt(), "month", null, 1, 1, ESMFTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFTime_Day(), ecorePackage.getEInt(), "day", null, 1, 1, ESMFTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFTime_Hour(), ecorePackage.getEInt(), "hour", null, 1, 1, ESMFTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFTime_Minute(), ecorePackage.getEInt(), "minute", null, 1, 1, ESMFTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFTime_Second(), ecorePackage.getEInt(), "second", null, 1, 1, ESMFTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFTime_Calendar(), this.getESMFCalendar(), null, "calendar", null, 1, 1, ESMFTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfClockEClass, ESMFClock.class, "ESMFClock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFClock_StartTime(), this.getESMFTime(), null, "startTime", null, 0, 1, ESMFClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFClock_StopTime(), this.getESMFTime(), null, "stopTime", null, 0, 1, ESMFClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFClock_TimeStep(), this.getESMFTimeInterval(), null, "timeStep", null, 0, 1, ESMFClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFClock_Component(), this.getESMFComponent(), this.getESMFComponent_Clock(), "component", null, 0, 1, ESMFClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfStateEClass, ESMFState.class, "ESMFState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFState_Component(), this.getESMFComponent(), null, "component", null, 0, 1, ESMFState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(esmfStateEClass, null, "add", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getESMFState(), "state", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getESMFStateItem(), "itemList", 1, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "rc", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(esmfStateItemEClass, ESMFStateItem.class, "ESMFStateItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfScopedItemEClass, ESMFScopedItem.class, "ESMFScopedItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFScopedItem_Scope(), this.getESMFScope(), this.getESMFScope_Item(), "scope", null, 1, 1, ESMFScopedItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfFieldEClass, ESMFField.class, "ESMFField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFField_Grid(), this.getESMFGrid(), null, "grid", null, 1, 1, ESMFField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFField_Array(), this.getESMFArray(), null, "array", null, 0, 1, ESMFField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFField_StaggerLoc(), this.getESMFStaggerLoc(), "staggerLoc", null, 0, 1, ESMFField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFField_ArraySpec(), this.getESMFArraySpec(), null, "arraySpec", null, 0, 1, ESMFField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFField_SIDLArgument(), theSIDLPackage.getArgument(), null, "SIDLArgument", null, 0, -1, ESMFField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFField_Index(), this.getESMF_INDEX(), "index", null, 0, 1, ESMFField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFField_TotalLWidth(), ecorePackage.getEInt(), "totalLWidth", null, 0, -1, ESMFField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFField_TotalUWidth(), ecorePackage.getEInt(), "totalUWidth", null, 0, -1, ESMFField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFField_Label(), ecorePackage.getEString(), "label", null, 1, 1, ESMFField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfFieldConnectionEClass, ESMFFieldConnection.class, "ESMFFieldConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFFieldConnection_SrcField(), this.getESMFField(), null, "srcField", null, 1, 1, ESMFFieldConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFFieldConnection_DstField(), this.getESMFField(), null, "dstField", null, 1, 1, ESMFFieldConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFFieldConnection_Component(), this.getESMFSimpleCouplerComponent(), this.getESMFSimpleCouplerComponent_FieldConnection(), "component", null, 1, 1, ESMFFieldConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfArrayEClass, ESMFArray.class, "ESMFArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFArray_Component(), this.getESMFComponent(), null, "component", null, 1, 1, ESMFArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFArray_ArraySpec(), this.getESMFArraySpec(), null, "arraySpec", null, 1, 1, ESMFArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFArray_DistGrid(), this.getESMFDistGrid(), null, "distGrid", null, 1, 1, ESMFArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFArray_Farray(), ecorePackage.getEString(), "farray", null, 0, 1, ESMFArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFArray_Indexflag(), this.getESMF_INDEX(), "indexflag", "0", 1, 1, ESMFArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFArray_HaloLWidth(), ecorePackage.getEInt(), "haloLWidth", null, 0, -1, ESMFArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFArray_HaloUWidth(), ecorePackage.getEInt(), "haloUWidth", null, 0, -1, ESMFArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfRouteHandleEClass, ESMFRouteHandle.class, "ESMFRouteHandle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfArraySpecEClass, ESMFArraySpec.class, "ESMFArraySpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESMFArraySpec_Typekind(), this.getESMFTypeKind(), "typekind", null, 1, 1, ESMFArraySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFArraySpec_Rank(), ecorePackage.getEInt(), "rank", null, 1, 1, ESMFArraySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfGridEClass, ESMFGrid.class, "ESMFGrid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFGrid_DistGrid(), this.getESMFDistGrid(), null, "distGrid", null, 0, 1, ESMFGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extentEClass, Extent.class, "Extent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtent_Min(), ecorePackage.getEInt(), "min", null, 1, 1, Extent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtent_Max(), ecorePackage.getEInt(), "max", null, 1, 1, Extent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfDistGridEClass, ESMFDistGrid.class, "ESMFDistGrid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFDistGrid_Extent(), this.getExtent(), null, "extent", null, 1, -1, ESMFDistGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFDistGrid_De(), this.getESMFDecompositionElement(), this.getESMFDecompositionElement_ParentDistGrid(), "de", null, 0, -1, ESMFDistGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFDistGrid_DeLayout(), this.getESMFDELayout(), null, "deLayout", null, 0, 1, ESMFDistGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFDistGrid_RegularDecompositionSize(), ecorePackage.getEInt(), "regularDecompositionSize", null, 0, -1, ESMFDistGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfWorkspaceEClass, ESMFWorkspace.class, "ESMFWorkspace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFWorkspace_Component(), this.getESMFComponent(), null, "component", null, 0, -1, ESMFWorkspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFWorkspace_Calendar(), this.getESMFCalendar(), null, "calendar", null, 0, -1, ESMFWorkspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFWorkspace_StateItem(), this.getESMFStateItem(), null, "stateItem", null, 0, -1, ESMFWorkspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFWorkspace_DistGrid(), this.getESMFDistGrid(), null, "distGrid", null, 0, -1, ESMFWorkspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFWorkspace_VirtualMachine(), this.getESMFVirtualMachine(), null, "virtualMachine", null, 0, -1, ESMFWorkspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFWorkspace_PersistentExecutionThread(), this.getESMFPersistentExecutionThread(), null, "persistentExecutionThread", null, 0, -1, ESMFWorkspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFWorkspace_DeLayout(), this.getESMFDELayout(), null, "deLayout", null, 0, -1, ESMFWorkspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFWorkspace_Clock(), this.getESMFClock(), null, "clock", null, 0, -1, ESMFWorkspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfVirtualMachineEClass, ESMFVirtualMachine.class, "ESMFVirtualMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESMFVirtualMachine_Name(), ecorePackage.getEString(), "name", null, 1, 1, ESMFVirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFVirtualMachine_ParentVM(), this.getESMFVirtualMachine(), null, "parentVM", null, 0, 1, ESMFVirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFVirtualMachine_PetID(), ecorePackage.getEInt(), "petID", null, 0, -1, ESMFVirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfPersistentExecutionThreadEClass, ESMFPersistentExecutionThread.class, "ESMFPersistentExecutionThread", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESMFPersistentExecutionThread_Id(), ecorePackage.getEInt(), "id", null, 1, 1, ESMFPersistentExecutionThread.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfdeLayoutEClass, ESMFDELayout.class, "ESMFDELayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESMFDELayout_Name(), ecorePackage.getEString(), "name", null, 1, 1, ESMFDELayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFDELayout_DecompositionElement(), this.getESMFDecompositionElement(), null, "decompositionElement", null, 1, -1, ESMFDELayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(this.getESMFDecompositionElement());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getESMFPersistentExecutionThread());
		g1.getETypeArguments().add(g2);
		initEAttribute(getESMFDELayout_DeToPet(), g1, "deToPet", null, 1, 1, ESMFDELayout.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfDecompositionElementEClass, ESMFDecompositionElement.class, "ESMFDecompositionElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFDecompositionElement_Extent(), this.getExtent(), null, "extent", null, 1, -1, ESMFDecompositionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFDecompositionElement_ParentDistGrid(), this.getESMFDistGrid(), this.getESMFDistGrid_De(), "parentDistGrid", null, 0, 1, ESMFDecompositionElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfVirtualAddressSpaceEClass, ESMFVirtualAddressSpace.class, "ESMFVirtualAddressSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfActionEClass, ESMFAction.class, "ESMFAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFAction_Context(), this.getESMFMethod(), this.getESMFMethod_Action(), "context", null, 0, 1, ESMFAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionAPIEClass, ESMFActionAPI.class, "ESMFActionAPI", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESMFActionAPI_Rc(), this.getESMFUserToken(), "rc", null, 0, 1, ESMFActionAPI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionMethodInvokePatternEClass, ESMFActionMethodInvokePattern.class, "ESMFActionMethodInvokePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfActionMethodInvokeSequenceEClass, ESMFActionMethodInvokeSequence.class, "ESMFActionMethodInvokeSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionMethodInvokeSequence_Pattern(), this.getESMFActionMethodInvokePattern(), null, "pattern", null, 1, -1, ESMFActionMethodInvokeSequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionMethodInvokeIterationEClass, ESMFActionMethodInvokeIteration.class, "ESMFActionMethodInvokeIteration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfActionStateAddEClass, ESMFActionStateAdd.class, "ESMFActionStateAdd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionStateAdd_State(), this.getESMFState(), null, "state", null, 1, 1, ESMFActionStateAdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionStateAdd_ItemList(), this.getESMFStateItem(), null, "itemList", null, 1, -1, ESMFActionStateAdd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionStateCreateEClass, ESMFActionStateCreate.class, "ESMFActionStateCreate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionStateCreate_State(), this.getESMFState(), null, "state", null, 1, 1, ESMFActionStateCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionStateCreate_Name(), this.getESMFUserToken(), "name", null, 0, 1, ESMFActionStateCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionStateGetEClass, ESMFActionStateGet.class, "ESMFActionStateGet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionStateGet_State(), this.getESMFState(), null, "state", null, 1, 1, ESMFActionStateGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionStateGet_ItemName(), this.getESMFUserToken(), "itemName", null, 1, 1, ESMFActionStateGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionStateGet_Item(), this.getESMFStateItem(), null, "item", null, 1, 1, ESMFActionStateGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionStateReconcileEClass, ESMFActionStateReconcile.class, "ESMFActionStateReconcile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionStateReconcile_State(), this.getESMFState(), null, "state", null, 1, 1, ESMFActionStateReconcile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionArrayCreateEClass, ESMFActionArrayCreate.class, "ESMFActionArrayCreate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionArrayCreate_Array(), this.getESMFArray(), null, "array", null, 1, 1, ESMFActionArrayCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionArrayCreateAllocateASEClass, ESMFActionArrayCreateAllocateAS.class, "ESMFActionArrayCreateAllocateAS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionArrayCreateAllocateAS_Array(), this.getESMFArray(), null, "array", null, 1, 1, ESMFActionArrayCreateAllocateAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionArrayCreateAllocateAS_DistGrid(), this.getESMFDistGrid(), null, "distGrid", null, 1, 1, ESMFActionArrayCreateAllocateAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionArrayCreateAllocateAS_ArraySpec(), this.getESMFArraySpec(), null, "arraySpec", null, 1, 1, ESMFActionArrayCreateAllocateAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionArrayCreateAllocateAS_Indexflag(), this.getESMF_INDEX(), "indexflag", null, 0, 1, ESMFActionArrayCreateAllocateAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionArrayCreateAllocateAS_TotalLWidth(), this.getESMFUserToken(), "totalLWidth", null, 0, -1, ESMFActionArrayCreateAllocateAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionArrayCreateAllocateAS_TotalUWidth(), this.getESMFUserToken(), "totalUWidth", null, 0, -1, ESMFActionArrayCreateAllocateAS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionArraySpecSetEClass, ESMFActionArraySpecSet.class, "ESMFActionArraySpecSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionArraySpecSet_ArraySpec(), this.getESMFArraySpec(), null, "arraySpec", null, 1, 1, ESMFActionArraySpecSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionArraySpecSet_Typekind(), this.getESMFTypeKind(), "typekind", null, 1, 1, ESMFActionArraySpecSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionArraySpecSet_Rank(), this.getESMFUserToken(), "rank", null, 1, 1, ESMFActionArraySpecSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionClockCreateEClass, ESMFActionClockCreate.class, "ESMFActionClockCreate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionClockCreate_Clock(), this.getESMFClock(), null, "clock", null, 1, 1, ESMFActionClockCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionClockCreate_TimeStep(), this.getESMFTimeInterval(), null, "timeStep", null, 1, 1, ESMFActionClockCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionClockCreate_StartTime(), this.getESMFTime(), null, "startTime", null, 0, 1, ESMFActionClockCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionClockCreate_StopTime(), this.getESMFTime(), null, "stopTime", null, 0, 1, ESMFActionClockCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionClockGetEClass, ESMFActionClockGet.class, "ESMFActionClockGet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionClockGet_Clock(), this.getESMFClock(), null, "clock", null, 1, 1, ESMFActionClockGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionClockGet_TimeStep(), this.getESMFTimeInterval(), null, "timeStep", null, 0, 1, ESMFActionClockGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionClockGet_CurrTime(), this.getESMFTime(), null, "currTime", null, 0, 1, ESMFActionClockGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionClockGetTimestepEClass, ESMFActionClockGetTimestep.class, "ESMFActionClockGetTimestep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionClockGetTimestep_Clock(), this.getESMFClock(), null, "clock", null, 1, 1, ESMFActionClockGetTimestep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionCplCompCreateEClass, ESMFActionCplCompCreate.class, "ESMFActionCplCompCreate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionCplCompCreate_Cplcomp(), this.getESMFCouplerComponent(), null, "cplcomp", null, 1, 1, ESMFActionCplCompCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionCplCompCreate_Name(), this.getESMFUserToken(), "name", null, 0, 1, ESMFActionCplCompCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionCplCompInitializeEClass, ESMFActionCplCompInitialize.class, "ESMFActionCplCompInitialize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionCplCompInitialize_Cplcomp(), this.getESMFCouplerComponent(), null, "cplcomp", null, 1, 1, ESMFActionCplCompInitialize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionCplCompInitialize_ImportState(), this.getESMFState(), null, "importState", null, 0, 1, ESMFActionCplCompInitialize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionCplCompInitialize_ExportState(), this.getESMFState(), null, "exportState", null, 0, 1, ESMFActionCplCompInitialize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionCplCompInitialize_Clock(), this.getESMFClock(), null, "clock", null, 0, 1, ESMFActionCplCompInitialize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionCplCompInitialize_Phase(), this.getESMFUserToken(), "phase", null, 0, 1, ESMFActionCplCompInitialize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionCplCompRunEClass, ESMFActionCplCompRun.class, "ESMFActionCplCompRun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionCplCompRun_Cplcomp(), this.getESMFCouplerComponent(), null, "cplcomp", null, 1, 1, ESMFActionCplCompRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionCplCompRun_ImportState(), this.getESMFState(), null, "importState", null, 0, 1, ESMFActionCplCompRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionCplCompRun_ExportState(), this.getESMFState(), null, "exportState", null, 0, 1, ESMFActionCplCompRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionCplCompRun_Clock(), this.getESMFClock(), null, "clock", null, 0, 1, ESMFActionCplCompRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionCplCompRun_Phase(), this.getESMFUserToken(), "phase", null, 0, 1, ESMFActionCplCompRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionCplCompFinalizeEClass, ESMFActionCplCompFinalize.class, "ESMFActionCplCompFinalize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionCplCompFinalize_Cplcomp(), this.getESMFCouplerComponent(), null, "cplcomp", null, 1, 1, ESMFActionCplCompFinalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionCplCompFinalize_ImportState(), this.getESMFState(), null, "importState", null, 0, 1, ESMFActionCplCompFinalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionCplCompFinalize_ExportState(), this.getESMFState(), null, "exportState", null, 0, 1, ESMFActionCplCompFinalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionCplCompFinalize_Clock(), this.getESMFClock(), null, "clock", null, 0, 1, ESMFActionCplCompFinalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionCplCompFinalize_Phase(), this.getESMFUserToken(), "phase", null, 0, 1, ESMFActionCplCompFinalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionCplCompSetServicesEClass, ESMFActionCplCompSetServices.class, "ESMFActionCplCompSetServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionCplCompSetServices_Cplcomp(), this.getESMFComponent(), null, "cplcomp", null, 1, 1, ESMFActionCplCompSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionCplCompSetServices_UserRoutine(), this.getESMFUserToken(), "userRoutine", null, 1, 1, ESMFActionCplCompSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionCplCompSetServices_UserRC(), this.getESMFUserToken(), "userRC", null, 0, 1, ESMFActionCplCompSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionDistGridCreateEClass, ESMFActionDistGridCreate.class, "ESMFActionDistGridCreate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionDistGridCreate_DistGrid(), this.getESMFDistGrid(), null, "distGrid", null, 1, 1, ESMFActionDistGridCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionDistGridCreate_MinIndex(), this.getESMFUserToken(), "minIndex", null, 1, -1, ESMFActionDistGridCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionDistGridCreate_MaxIndex(), this.getESMFUserToken(), "maxIndex", null, 1, -1, ESMFActionDistGridCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionDistGridCreate_RegDecomp(), this.getESMFUserToken(), "regDecomp", null, 1, -1, ESMFActionDistGridCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionFieldCreateEClass, ESMFActionFieldCreate.class, "ESMFActionFieldCreate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionFieldCreate_Field(), this.getESMFField(), null, "field", null, 1, 1, ESMFActionFieldCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionFieldCreateGridArrayEClass, ESMFActionFieldCreateGridArray.class, "ESMFActionFieldCreateGridArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionFieldCreateGridArray_Field(), this.getESMFField(), null, "field", null, 1, 1, ESMFActionFieldCreateGridArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionFieldCreateGridArray_Name(), this.getESMFUserToken(), "name", null, 0, 1, ESMFActionFieldCreateGridArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionFieldCreateGridArray_Grid(), this.getESMFGrid(), null, "grid", null, 1, 1, ESMFActionFieldCreateGridArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionFieldCreateGridArray_Array(), this.getESMFArray(), null, "array", null, 1, 1, ESMFActionFieldCreateGridArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionFieldCreateGridArraySpecEClass, ESMFActionFieldCreateGridArraySpec.class, "ESMFActionFieldCreateGridArraySpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionFieldCreateGridArraySpec_Field(), this.getESMFField(), null, "field", null, 1, 1, ESMFActionFieldCreateGridArraySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionFieldCreateGridArraySpec_Grid(), this.getESMFGrid(), null, "grid", null, 1, 1, ESMFActionFieldCreateGridArraySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionFieldCreateGridArraySpec_ArraySpec(), this.getESMFArraySpec(), null, "arraySpec", null, 1, 1, ESMFActionFieldCreateGridArraySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionFieldCreateGridArraySpec_Indexflag(), this.getESMF_INDEX(), "indexflag", null, 0, 1, ESMFActionFieldCreateGridArraySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionFieldCreateGridArraySpec_TotalLWidth(), this.getESMFUserToken(), "totalLWidth", null, 0, -1, ESMFActionFieldCreateGridArraySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionFieldCreateGridArraySpec_TotalUWidth(), this.getESMFUserToken(), "totalUWidth", null, 0, -1, ESMFActionFieldCreateGridArraySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionFieldCreateGridArraySpec_Name(), this.getESMFUserToken(), "name", null, 0, 1, ESMFActionFieldCreateGridArraySpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionFieldCreateTKREClass, ESMFActionFieldCreateTKR.class, "ESMFActionFieldCreateTKR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionFieldCreateTKR_Field(), this.getESMFField(), null, "field", null, 1, 1, ESMFActionFieldCreateTKR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionFieldCreateTKR_Grid(), this.getESMFGrid(), null, "grid", null, 1, 1, ESMFActionFieldCreateTKR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionFieldCreateTKR_Typekind(), this.getESMFTypeKind(), "typekind", null, 1, 1, ESMFActionFieldCreateTKR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionFieldGetEClass, ESMFActionFieldGet.class, "ESMFActionFieldGet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionFieldGet_Field(), this.getESMFField(), null, "field", null, 1, 1, ESMFActionFieldGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionFieldGet_FarrayPtr(), this.getESMFUserToken(), "farrayPtr", null, 1, 1, ESMFActionFieldGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionFieldGetBoundsEClass, ESMFActionFieldGetBounds.class, "ESMFActionFieldGetBounds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionFieldGetBounds_Field(), this.getESMFField(), null, "field", null, 1, 1, ESMFActionFieldGetBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionFieldGetBounds_ExclusiveLBound(), this.getESMFUserToken(), "exclusiveLBound", null, 0, 1, ESMFActionFieldGetBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionFieldGetBounds_ExclusiveUBound(), this.getESMFUserToken(), "exclusiveUBound", null, 0, 1, ESMFActionFieldGetBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionFieldGetBounds_ComputationalLBound(), this.getESMFUserToken(), "computationalLBound", null, 0, 1, ESMFActionFieldGetBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionFieldGetBounds_ComputationalUBound(), this.getESMFUserToken(), "computationalUBound", null, 0, 1, ESMFActionFieldGetBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionFieldGetBounds_TotalLBound(), this.getESMFUserToken(), "totalLBound", null, 0, 1, ESMFActionFieldGetBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionFieldGetBounds_TotalUBound(), this.getESMFUserToken(), "totalUBound", null, 0, 1, ESMFActionFieldGetBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionFieldHaloStoreEClass, ESMFActionFieldHaloStore.class, "ESMFActionFieldHaloStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionFieldHaloStore_Field(), this.getESMFField(), null, "field", null, 1, 1, ESMFActionFieldHaloStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionFieldHaloStore_RouteHandle(), this.getESMFRouteHandle(), null, "routeHandle", null, 1, 1, ESMFActionFieldHaloStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionFieldHaloEClass, ESMFActionFieldHalo.class, "ESMFActionFieldHalo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionFieldHalo_Field(), this.getESMFField(), null, "field", null, 1, 1, ESMFActionFieldHalo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionFieldHalo_RouteHandle(), this.getESMFRouteHandle(), null, "routeHandle", null, 1, 1, ESMFActionFieldHalo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionFieldHaloReleaseEClass, ESMFActionFieldHaloRelease.class, "ESMFActionFieldHaloRelease", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionFieldHaloRelease_RouteHandle(), this.getESMFRouteHandle(), null, "routeHandle", null, 1, 1, ESMFActionFieldHaloRelease.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionFieldRedistStoreEClass, ESMFActionFieldRedistStore.class, "ESMFActionFieldRedistStore", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionFieldRedistStore_SrcField(), this.getESMFField(), null, "srcField", null, 1, 1, ESMFActionFieldRedistStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionFieldRedistStore_DstField(), this.getESMFField(), null, "dstField", null, 1, 1, ESMFActionFieldRedistStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionFieldRedistStore_RouteHandle(), this.getESMFRouteHandle(), null, "routeHandle", null, 1, 1, ESMFActionFieldRedistStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionFieldRedistEClass, ESMFActionFieldRedist.class, "ESMFActionFieldRedist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionFieldRedist_SrcField(), this.getESMFField(), null, "srcField", null, 1, 1, ESMFActionFieldRedist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionFieldRedist_DstField(), this.getESMFField(), null, "dstField", null, 1, 1, ESMFActionFieldRedist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionFieldRedist_RouteHandle(), this.getESMFRouteHandle(), null, "routeHandle", null, 1, 1, ESMFActionFieldRedist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionFieldRedistReleaseEClass, ESMFActionFieldRedistRelease.class, "ESMFActionFieldRedistRelease", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionFieldRedistRelease_RouteHandle(), this.getESMFRouteHandle(), null, "routeHandle", null, 1, 1, ESMFActionFieldRedistRelease.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionFrameworkInitEClass, ESMFActionFrameworkInit.class, "ESMFActionFrameworkInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESMFActionFrameworkInit_DefaultCalKind(), this.getESMFCalKind(), "defaultCalKind", null, 0, 1, ESMFActionFrameworkInit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionFrameworkFinalizeEClass, ESMFActionFrameworkFinalize.class, "ESMFActionFrameworkFinalize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfActionGridCreateEClass, ESMFActionGridCreate.class, "ESMFActionGridCreate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionGridCreate_Grid(), this.getESMFGrid(), null, "grid", null, 1, 1, ESMFActionGridCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionGridCreate_DistGrid(), this.getESMFDistGrid(), null, "distGrid", null, 1, 1, ESMFActionGridCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionGridCreate_Name(), this.getESMFUserToken(), "name", null, 0, 1, ESMFActionGridCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionGridCreate_Indexflag(), this.getESMF_INDEX(), "indexflag", null, 0, 1, ESMFActionGridCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionGridGetEClass, ESMFActionGridGet.class, "ESMFActionGridGet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionGridGet_Grid(), this.getESMFGrid(), null, "grid", null, 1, 1, ESMFActionGridGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionGridGetPLocalDeEClass, ESMFActionGridGetPLocalDe.class, "ESMFActionGridGetPLocalDe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESMFActionGridGetPLocalDe_LocalDE(), this.getESMFUserToken(), "localDE", null, 1, 1, ESMFActionGridGetPLocalDe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionGridGetPLocalDe_IsLBound(), this.getESMFUserToken(), "isLBound", null, 0, 1, ESMFActionGridGetPLocalDe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionGridGetPLocalDe_IsUBound(), this.getESMFUserToken(), "isUBound", null, 0, 1, ESMFActionGridGetPLocalDe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionGridGetPLocalDePSlocEClass, ESMFActionGridGetPLocalDePSloc.class, "ESMFActionGridGetPLocalDePSloc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESMFActionGridGetPLocalDePSloc_Staggerloc(), this.getESMFStaggerLoc(), "staggerloc", "0", 1, 1, ESMFActionGridGetPLocalDePSloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionGridGetPLocalDePSloc_ExclusiveLBound(), this.getESMFUserToken(), "exclusiveLBound", null, 0, 1, ESMFActionGridGetPLocalDePSloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionGridGetPLocalDePSloc_ExclusiveUBound(), this.getESMFUserToken(), "exclusiveUBound", null, 0, 1, ESMFActionGridGetPLocalDePSloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionGridGetPLocalDePSloc_ComputationalLBound(), this.getESMFUserToken(), "computationalLBound", null, 0, 1, ESMFActionGridGetPLocalDePSloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionGridGetPLocalDePSloc_ComputationalUBound(), this.getESMFUserToken(), "computationalUBound", null, 0, 1, ESMFActionGridGetPLocalDePSloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionGridGetCoordEClass, ESMFActionGridGetCoord.class, "ESMFActionGridGetCoord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionGridGetCoord_Grid(), this.getESMFGrid(), null, "grid", null, 1, 1, ESMFActionGridGetCoord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionGridGetCoord_CoordDim(), this.getESMFUserToken(), "coordDim", null, 0, 1, ESMFActionGridGetCoord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionGridGetCoord_FarrayPtr(), this.getESMFUserToken(), "farrayPtr", null, 0, 1, ESMFActionGridGetCoord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionGridCompCreateEClass, ESMFActionGridCompCreate.class, "ESMFActionGridCompCreate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionGridCompCreate_Gridcomp(), this.getESMFGriddedComponent(), null, "gridcomp", null, 1, 1, ESMFActionGridCompCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionGridCompCreate_Name(), this.getESMFUserToken(), "name", null, 0, 1, ESMFActionGridCompCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionGridCompInitializeEClass, ESMFActionGridCompInitialize.class, "ESMFActionGridCompInitialize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionGridCompInitialize_Gridcomp(), this.getESMFGriddedComponent(), null, "gridcomp", null, 1, 1, ESMFActionGridCompInitialize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionGridCompInitialize_ImportState(), this.getESMFState(), null, "importState", null, 0, 1, ESMFActionGridCompInitialize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionGridCompInitialize_ExportState(), this.getESMFState(), null, "exportState", null, 0, 1, ESMFActionGridCompInitialize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionGridCompInitialize_Clock(), this.getESMFClock(), null, "clock", null, 0, 1, ESMFActionGridCompInitialize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionGridCompInitialize_Phase(), this.getESMFUserToken(), "phase", null, 0, 1, ESMFActionGridCompInitialize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionGridCompRunEClass, ESMFActionGridCompRun.class, "ESMFActionGridCompRun", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionGridCompRun_Gridcomp(), this.getESMFGriddedComponent(), null, "gridcomp", null, 1, 1, ESMFActionGridCompRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionGridCompRun_ImportState(), this.getESMFState(), null, "importState", null, 0, 1, ESMFActionGridCompRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionGridCompRun_ExportState(), this.getESMFState(), null, "exportState", null, 0, 1, ESMFActionGridCompRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionGridCompRun_Clock(), this.getESMFClock(), null, "clock", null, 0, 1, ESMFActionGridCompRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionGridCompRun_Phase(), this.getESMFUserToken(), "phase", null, 0, 1, ESMFActionGridCompRun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionGridCompFinalizeEClass, ESMFActionGridCompFinalize.class, "ESMFActionGridCompFinalize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionGridCompFinalize_Gridcomp(), this.getESMFGriddedComponent(), null, "gridcomp", null, 1, 1, ESMFActionGridCompFinalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionGridCompFinalize_ImportState(), this.getESMFState(), null, "importState", null, 0, 1, ESMFActionGridCompFinalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionGridCompFinalize_ExportState(), this.getESMFState(), null, "exportState", null, 0, 1, ESMFActionGridCompFinalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionGridCompFinalize_Clock(), this.getESMFClock(), null, "clock", null, 0, 1, ESMFActionGridCompFinalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionGridCompFinalize_Phase(), this.getESMFUserToken(), "phase", null, 0, 1, ESMFActionGridCompFinalize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionGridCompSetServicesEClass, ESMFActionGridCompSetServices.class, "ESMFActionGridCompSetServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionGridCompSetServices_Gridcomp(), this.getESMFComponent(), null, "gridcomp", null, 1, 1, ESMFActionGridCompSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionGridCompSetServices_UserRoutine(), this.getESMFUserToken(), "userRoutine", null, 1, 1, ESMFActionGridCompSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionGridCompSetServices_UserRC(), this.getESMFUserToken(), "userRC", null, 0, 1, ESMFActionGridCompSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionMethodInvokeEClass, ESMFActionMethodInvoke.class, "ESMFActionMethodInvoke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionMethodInvoke_Method(), this.getESMFMethod(), null, "method", null, 1, 1, ESMFActionMethodInvoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionMethodInvoke_ImportState(), this.getESMFState(), null, "importState", null, 0, 1, ESMFActionMethodInvoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getESMFActionMethodInvoke_ExportState(), this.getESMFState(), null, "exportState", null, 0, 1, ESMFActionMethodInvoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionTimeSetEClass, ESMFActionTimeSet.class, "ESMFActionTimeSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionTimeSet_Time(), this.getESMFTime(), null, "time", null, 1, 1, ESMFActionTimeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeSet_Yy(), this.getESMFUserToken(), "yy", null, 0, 1, ESMFActionTimeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeSet_Mm(), this.getESMFUserToken(), "mm", null, 0, 1, ESMFActionTimeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeSet_Dd(), this.getESMFUserToken(), "dd", null, 0, 1, ESMFActionTimeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeSet_H(), this.getESMFUserToken(), "h", null, 0, 1, ESMFActionTimeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeSet_M(), this.getESMFUserToken(), "m", null, 0, 1, ESMFActionTimeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeSet_S(), this.getESMFUserToken(), "s", null, 0, 1, ESMFActionTimeSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionTimeGetEClass, ESMFActionTimeGet.class, "ESMFActionTimeGet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionTimeGet_Time(), this.getESMFTime(), null, "time", null, 1, 1, ESMFActionTimeGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeGet_Yy(), this.getESMFUserToken(), "yy", null, 0, 1, ESMFActionTimeGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeGet_Mm(), this.getESMFUserToken(), "mm", null, 0, 1, ESMFActionTimeGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeGet_Dd(), this.getESMFUserToken(), "dd", null, 0, 1, ESMFActionTimeGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeGet_H(), this.getESMFUserToken(), "h", null, 0, 1, ESMFActionTimeGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeGet_M(), this.getESMFUserToken(), "m", null, 0, 1, ESMFActionTimeGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeGet_S(), this.getESMFUserToken(), "s", null, 0, 1, ESMFActionTimeGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionTimeIntervalSetEClass, ESMFActionTimeIntervalSet.class, "ESMFActionTimeIntervalSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionTimeIntervalSet_TimeInterval(), this.getESMFTimeInterval(), null, "timeInterval", null, 1, 1, ESMFActionTimeIntervalSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeIntervalSet_H(), this.getESMFUserToken(), "h", null, 0, 1, ESMFActionTimeIntervalSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeIntervalSet_M(), this.getESMFUserToken(), "m", null, 0, 1, ESMFActionTimeIntervalSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeIntervalSet_S(), this.getESMFUserToken(), "s", null, 0, 1, ESMFActionTimeIntervalSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionTimeIntervalGetEClass, ESMFActionTimeIntervalGet.class, "ESMFActionTimeIntervalGet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFActionTimeIntervalGet_TimeInterval(), this.getESMFTimeInterval(), null, "timeInterval", null, 1, 1, ESMFActionTimeIntervalGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeIntervalGet_H(), this.getESMFUserToken(), "h", null, 0, 1, ESMFActionTimeIntervalGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeIntervalGet_M(), this.getESMFUserToken(), "m", null, 0, 1, ESMFActionTimeIntervalGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionTimeIntervalGet_S(), this.getESMFUserToken(), "s", null, 0, 1, ESMFActionTimeIntervalGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfActionUserServiceInvokeEClass, ESMFActionUserServiceInvoke.class, "ESMFActionUserServiceInvoke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getESMFActionUserServiceInvoke_Declaration(), ecorePackage.getEString(), "declaration", null, 0, -1, ESMFActionUserServiceInvoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getESMFActionUserServiceInvoke_Execution(), ecorePackage.getEString(), "execution", null, 1, -1, ESMFActionUserServiceInvoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfCallEClass, ESMFCall.class, "ESMFCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(esmfCallGridCompCreateEClass, ESMFCallGridCompCreate.class, "ESMFCallGridCompCreate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFCallGridCompCreate_Gridcomp(), this.getESMFGriddedComponent(), null, "gridcomp", null, 1, 1, ESMFCallGridCompCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfCallGridCompInitializeEClass, ESMFCallGridCompInitialize.class, "ESMFCallGridCompInitialize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFCallGridCompInitialize_Gridcomp(), this.getESMFGriddedComponent(), null, "gridcomp", null, 1, 1, ESMFCallGridCompInitialize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfCallGridCompSetServicesEClass, ESMFCallGridCompSetServices.class, "ESMFCallGridCompSetServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFCallGridCompSetServices_Gridcomp(), this.getESMFComponent(), null, "gridcomp", null, 1, 1, ESMFCallGridCompSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfCallCplCompCreateEClass, ESMFCallCplCompCreate.class, "ESMFCallCplCompCreate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFCallCplCompCreate_Cplcomp(), this.getESMFCouplerComponent(), null, "cplcomp", null, 1, 1, ESMFCallCplCompCreate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfCallCplCompInitializeEClass, ESMFCallCplCompInitialize.class, "ESMFCallCplCompInitialize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFCallCplCompInitialize_Cplcomp(), this.getESMFCouplerComponent(), null, "cplcomp", null, 1, 1, ESMFCallCplCompInitialize.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfCallCplCompSetServicesEClass, ESMFCallCplCompSetServices.class, "ESMFCallCplCompSetServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFCallCplCompSetServices_Cplcomp(), this.getESMFComponent(), null, "cplcomp", null, 1, 1, ESMFCallCplCompSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfCallFieldCreateSIDLEClass, ESMFCallFieldCreateSIDL.class, "ESMFCallFieldCreateSIDL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFCallFieldCreateSIDL_Argument(), theSIDLPackage.getArgument(), null, "argument", null, 1, 1, ESMFCallFieldCreateSIDL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(esmfCallSIDLMethodEClass, ESMFCallSIDLMethod.class, "ESMFCallSIDLMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getESMFCallSIDLMethod_SIDLMethod(), theSIDLPackage.getMethod(), null, "SIDLMethod", null, 1, 1, ESMFCallSIDLMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(esmfCalKindEEnum, ESMFCalKind.class, "ESMFCalKind");
		addEEnumLiteral(esmfCalKindEEnum, ESMFCalKind.ESMF_CALKIND_GREGORIAN);

		initEEnum(esmfStaggerLocEEnum, ESMFStaggerLoc.class, "ESMFStaggerLoc");
		addEEnumLiteral(esmfStaggerLocEEnum, ESMFStaggerLoc.ESMF_STAGGERLOC_CENTER);
		addEEnumLiteral(esmfStaggerLocEEnum, ESMFStaggerLoc.ESMF_STAGGERLOC_CORNER);
		addEEnumLiteral(esmfStaggerLocEEnum, ESMFStaggerLoc.ESMF_STAGGERLOC_EDGE1);
		addEEnumLiteral(esmfStaggerLocEEnum, ESMFStaggerLoc.ESMF_STAGGERLOC_EDGE2);

		initEEnum(esmfTypeKindEEnum, ESMFTypeKind.class, "ESMFTypeKind");
		addEEnumLiteral(esmfTypeKindEEnum, ESMFTypeKind.ESMF_TYPEKIND_I1);
		addEEnumLiteral(esmfTypeKindEEnum, ESMFTypeKind.ESMF_TYPEKIND_I2);
		addEEnumLiteral(esmfTypeKindEEnum, ESMFTypeKind.ESMF_TYPEKIND_I4);
		addEEnumLiteral(esmfTypeKindEEnum, ESMFTypeKind.ESMF_TYPEKIND_I8);
		addEEnumLiteral(esmfTypeKindEEnum, ESMFTypeKind.ESMF_TYPEKIND_R4);
		addEEnumLiteral(esmfTypeKindEEnum, ESMFTypeKind.ESMF_TYPEKIND_R8);

		initEEnum(esmF_INDEXEEnum, org.earthsystemcurator.cupid.esmf.ESMF_INDEX.class, "ESMF_INDEX");
		addEEnumLiteral(esmF_INDEXEEnum, org.earthsystemcurator.cupid.esmf.ESMF_INDEX.ESMF_INDEX_DELOCAL);
		addEEnumLiteral(esmF_INDEXEEnum, org.earthsystemcurator.cupid.esmf.ESMF_INDEX.ESMF_INDEX_GLOBAL);
		addEEnumLiteral(esmF_INDEXEEnum, org.earthsystemcurator.cupid.esmf.ESMF_INDEX.ESMF_INDEX_USER);

		// Initialize data types
		initEDataType(eIntArrayEDataType, int[].class, "EIntArray", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(esmfUserTokenEDataType, String.class, "ESMFUserToken", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.earthsystemcurator.org/metapattern/apimethod
		createApimethodAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
		// http://www.eclipse.org/ocl/examples/OCL
		createOCL_1Annotations();
		// http://www.earthsystemcurator.org/metapattern/apiparam
		createApiparamAnnotations();
		// http://www.earthsystemcurator.org/metapattern/apireturn
		createApireturnAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.earthsystemcurator.org/metapattern/apimethod</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createApimethodAnnotations() {
		String source = "http://www.earthsystemcurator.org/metapattern/apimethod";			
		addAnnotation
		  (esmfStateEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "name", "ESMF_StateAdd"
		   });												
		addAnnotation
		  (esmfActionStateAddEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_StateAdd"
		   });				
		addAnnotation
		  (esmfActionStateCreateEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_StateCreate"
		   });				
		addAnnotation
		  (esmfActionStateGetEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_StateGet"
		   });					
		addAnnotation
		  (esmfActionStateReconcileEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_StateReconcile"
		   });			
		addAnnotation
		  (esmfActionArrayCreateAllocateASEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_ArrayCreate"
		   });								
		addAnnotation
		  (esmfActionArraySpecSetEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_ArraySpecSet"
		   });					
		addAnnotation
		  (esmfActionClockCreateEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_ClockCreate"
		   });						
		addAnnotation
		  (esmfActionClockGetEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_ClockGet"
		   });					
		addAnnotation
		  (esmfActionCplCompCreateEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_CplCompCreate"
		   });				
		addAnnotation
		  (esmfActionCplCompInitializeEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_CplCompInitialize"
		   });							
		addAnnotation
		  (esmfActionCplCompRunEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_CplCompRun"
		   });							
		addAnnotation
		  (esmfActionCplCompFinalizeEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_CplCompFinalize"
		   });							
		addAnnotation
		  (esmfActionCplCompSetServicesEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_CplCompSetServices"
		   });					
		addAnnotation
		  (esmfActionDistGridCreateEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_DistGridCreate"
		   });						
		addAnnotation
		  (esmfActionFieldCreateGridArrayEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_FieldCreate"
		   });						
		addAnnotation
		  (esmfActionFieldCreateGridArraySpecEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_FieldCreate"
		   });									
		addAnnotation
		  (esmfActionFieldCreateTKREClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_FieldCreate"
		   });					
		addAnnotation
		  (esmfActionFieldGetEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_FieldGet"
		   });				
		addAnnotation
		  (esmfActionFieldGetBoundsEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_FieldGetBounds"
		   });									
		addAnnotation
		  (esmfActionFieldHaloStoreEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_FieldHaloStore"
		   });				
		addAnnotation
		  (esmfActionFieldHaloEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_FieldHalo"
		   });				
		addAnnotation
		  (esmfActionFieldHaloReleaseEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_FieldHaloRelease"
		   });			
		addAnnotation
		  (esmfActionFieldRedistStoreEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_FieldRedistStore"
		   });					
		addAnnotation
		  (esmfActionFieldRedistEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_FieldRedist"
		   });					
		addAnnotation
		  (esmfActionFieldRedistReleaseEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_FieldRedistRelease"
		   });			
		addAnnotation
		  (esmfActionFrameworkInitEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_Initialize"
		   });			
		addAnnotation
		  (esmfActionFrameworkFinalizeEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_Finalize"
		   });		
		addAnnotation
		  (esmfActionGridCreateEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_GridCreate",
			 "post", "created(self.grid)"
		   });							
		addAnnotation
		  (esmfActionGridGetPLocalDeEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_GridGet"
		   });					
		addAnnotation
		  (esmfActionGridGetPLocalDePSlocEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_GridGet"
		   });							
		addAnnotation
		  (esmfActionGridGetCoordEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_GridGetCoord"
		   });					
		addAnnotation
		  (esmfActionGridCompCreateEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_GridCompCreate"
		   });				
		addAnnotation
		  (esmfActionGridCompInitializeEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_GridCompInitialize"
		   });							
		addAnnotation
		  (esmfActionGridCompRunEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_GridCompRun"
		   });							
		addAnnotation
		  (esmfActionGridCompFinalizeEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_GridCompFinalize"
		   });							
		addAnnotation
		  (esmfActionGridCompSetServicesEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_GridCompSetServices"
		   });					
		addAnnotation
		  (esmfActionTimeSetEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_TimeSet"
		   });									
		addAnnotation
		  (esmfActionTimeGetEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_TimeGet"
		   });			
		addAnnotation
		  (getESMFActionTimeGet_Yy(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "kind", "\"ESMF_KIND_I4\""
		   });							
		addAnnotation
		  (esmfActionTimeIntervalSetEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_TimeIntervalSet"
		   });						
		addAnnotation
		  (esmfActionTimeIntervalGetEClass, 
		   source, 
		   new String[] {
			 "name", "ESMF_TimeIntervalGet"
		   });				
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";				
		addAnnotation
		  (esmfStateEClass.getEOperations().get(0), 
		   source, 
		   new String[] {
			 "body", ""
		   });		
		addAnnotation
		  (getESMFField_Label(), 
		   source, 
		   new String[] {
			 "derivation", "self.name + \'(\' + self.index + \')\'"
		   });																																																																																																																																																																																														
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });					
		addAnnotation
		  (extentEClass, 
		   source, 
		   new String[] {
			 "constraints", "MinLessThanOrEqualToMax"
		   });			
		addAnnotation
		  (esmfVirtualMachineEClass, 
		   source, 
		   new String[] {
			 "constraints", "PETsAreSubsetOfParentVMPETs"
		   });			
		addAnnotation
		  (esmfdeLayoutEClass, 
		   source, 
		   new String[] {
			 "constraints", "MappedDEsOwnedByThisDELayout"
		   });		
		addAnnotation
		  (esmfDecompositionElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "ExtentSizeEqualsParentDistGridExtentSize"
		   });																																																																																																																																																																																								
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/ocl/examples/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCL_1Annotations() {
		String source = "http://www.eclipse.org/ocl/examples/OCL";							
		addAnnotation
		  (extentEClass, 
		   source, 
		   new String[] {
			 "MinLessThanOrEqualToMax", "min <= max"
		   });			
		addAnnotation
		  (esmfVirtualMachineEClass, 
		   source, 
		   new String[] {
			 "PETsAreSubsetOfParentVMPETs", "parentVM.oclIsUndefined() or parentVM.petID->includesAll(petID)"
		   });				
		addAnnotation
		  (esmfDecompositionElementEClass, 
		   source, 
		   new String[] {
			 "ExtentSizeEqualsParentDistGridExtentSize", "parentDistGrid.oclIsUndefined() or extent->size() = parentDistGrid.extent->size()"
		   });																																																																																																																																																																																							
	}

	/**
	 * Initializes the annotations for <b>http://www.earthsystemcurator.org/metapattern/apiparam</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createApiparamAnnotations() {
		String source = "http://www.earthsystemcurator.org/metapattern/apiparam";													
		addAnnotation
		  (getESMFActionAPI_Rc(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });			
		addAnnotation
		  (getESMFActionStateAdd_State(), 
		   source, 
		   new String[] {
			 "keyword", null
		   });		
		addAnnotation
		  (getESMFActionStateAdd_ItemList(), 
		   source, 
		   new String[] {
			 "keyword", null
		   });				
		addAnnotation
		  (getESMFActionStateCreate_Name(), 
		   source, 
		   new String[] {
			 "type", "character"
		   });			
		addAnnotation
		  (getESMFActionStateGet_State(), 
		   source, 
		   new String[] {
			 "keyword", null
		   });		
		addAnnotation
		  (getESMFActionStateGet_ItemName(), 
		   source, 
		   new String[] {
			 "type", "character",
			 "keyword", null
		   });		
		addAnnotation
		  (getESMFActionStateGet_Item(), 
		   source, 
		   new String[] {
			 "keyword", null
		   });			
		addAnnotation
		  (getESMFActionStateReconcile_State(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getESMFActionArrayCreateAllocateAS_DistGrid(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionArrayCreateAllocateAS_ArraySpec(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionArrayCreateAllocateAS_Indexflag(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionArrayCreateAllocateAS_TotalLWidth(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });		
		addAnnotation
		  (getESMFActionArrayCreateAllocateAS_TotalUWidth(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });			
		addAnnotation
		  (getESMFActionArraySpecSet_ArraySpec(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionArraySpecSet_Typekind(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionArraySpecSet_Rank(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });				
		addAnnotation
		  (getESMFActionClockCreate_TimeStep(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionClockCreate_StartTime(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionClockCreate_StopTime(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getESMFActionClockGet_Clock(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionClockGet_TimeStep(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionClockGet_CurrTime(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getESMFActionCplCompCreate_Name(), 
		   source, 
		   new String[] {
			 "type", "character"
		   });			
		addAnnotation
		  (getESMFActionCplCompInitialize_Cplcomp(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionCplCompInitialize_ImportState(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionCplCompInitialize_ExportState(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionCplCompInitialize_Clock(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionCplCompInitialize_Phase(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });			
		addAnnotation
		  (getESMFActionCplCompRun_Cplcomp(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionCplCompRun_ImportState(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionCplCompRun_ExportState(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionCplCompRun_Clock(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionCplCompRun_Phase(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });			
		addAnnotation
		  (getESMFActionCplCompFinalize_Cplcomp(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionCplCompFinalize_ImportState(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionCplCompFinalize_ExportState(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionCplCompFinalize_Clock(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionCplCompFinalize_Phase(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });			
		addAnnotation
		  (getESMFActionCplCompSetServices_Cplcomp(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionCplCompSetServices_UserRoutine(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionCplCompSetServices_UserRC(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });				
		addAnnotation
		  (getESMFActionDistGridCreate_MinIndex(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });		
		addAnnotation
		  (getESMFActionDistGridCreate_MaxIndex(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });		
		addAnnotation
		  (getESMFActionDistGridCreate_RegDecomp(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });				
		addAnnotation
		  (getESMFActionFieldCreateGridArray_Name(), 
		   source, 
		   new String[] {
			 "type", "character"
		   });		
		addAnnotation
		  (getESMFActionFieldCreateGridArray_Grid(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionFieldCreateGridArray_Array(), 
		   source, 
		   new String[] {
		   });				
		addAnnotation
		  (getESMFActionFieldCreateGridArraySpec_Grid(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionFieldCreateGridArraySpec_ArraySpec(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionFieldCreateGridArraySpec_Indexflag(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionFieldCreateGridArraySpec_TotalLWidth(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });		
		addAnnotation
		  (getESMFActionFieldCreateGridArraySpec_TotalUWidth(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });		
		addAnnotation
		  (getESMFActionFieldCreateGridArraySpec_Name(), 
		   source, 
		   new String[] {
			 "type", "character"
		   });				
		addAnnotation
		  (getESMFActionFieldCreateTKR_Grid(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionFieldCreateTKR_Typekind(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getESMFActionFieldGet_Field(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionFieldGet_FarrayPtr(), 
		   source, 
		   new String[] {
			 "type", "real",
			 "kind", "self.field.array.arraySpec.typekind.toFortranKind()",
			 "pointer", "true",
			 "dim", "self.field.grid.distGrid.extent->size()"
		   });			
		addAnnotation
		  (getESMFActionFieldGetBounds_Field(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionFieldGetBounds_ExclusiveLBound(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "arraySize", "self.field.grid.distGrid.extent->size().toString()"
		   });		
		addAnnotation
		  (getESMFActionFieldGetBounds_ExclusiveUBound(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "arraySize", "self.field.grid.distGrid.extent->size().toString()"
		   });		
		addAnnotation
		  (getESMFActionFieldGetBounds_ComputationalLBound(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "arraySize", "self.field.grid.distGrid.extent->size().toString()"
		   });		
		addAnnotation
		  (getESMFActionFieldGetBounds_ComputationalUBound(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "arraySize", "self.field.grid.distGrid.extent->size().toString()"
		   });		
		addAnnotation
		  (getESMFActionFieldGetBounds_TotalLBound(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "arraySize", "self.field.grid.distGrid.extent->size().toString()"
		   });		
		addAnnotation
		  (getESMFActionFieldGetBounds_TotalUBound(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "arraySize", "self.field.grid.distGrid.extent->size().toString()"
		   });			
		addAnnotation
		  (getESMFActionFieldHaloStore_Field(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionFieldHaloStore_RouteHandle(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getESMFActionFieldHalo_Field(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionFieldHalo_RouteHandle(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getESMFActionFieldHaloRelease_RouteHandle(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getESMFActionFieldRedistStore_SrcField(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionFieldRedistStore_DstField(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionFieldRedistStore_RouteHandle(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getESMFActionFieldRedist_SrcField(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionFieldRedist_DstField(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionFieldRedist_RouteHandle(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getESMFActionFieldRedistRelease_RouteHandle(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getESMFActionFrameworkInit_DefaultCalKind(), 
		   source, 
		   new String[] {
		   });					
		addAnnotation
		  (getESMFActionGridCreate_DistGrid(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridCreate_Name(), 
		   source, 
		   new String[] {
			 "type", "character"
		   });		
		addAnnotation
		  (getESMFActionGridCreate_Indexflag(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridGet_Grid(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getESMFActionGridGetPLocalDe_LocalDE(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });		
		addAnnotation
		  (getESMFActionGridGetPLocalDe_IsLBound(), 
		   source, 
		   new String[] {
			 "type", "logical",
			 "arraySize", "self.grid.distGrid.extent->size().toString()"
		   });		
		addAnnotation
		  (getESMFActionGridGetPLocalDe_IsUBound(), 
		   source, 
		   new String[] {
			 "type", "logical",
			 "arraySize", "self.grid.distGrid.extent->size().toString()"
		   });			
		addAnnotation
		  (getESMFActionGridGetPLocalDePSloc_Staggerloc(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridGetPLocalDePSloc_ExclusiveLBound(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "arraySize", "self.grid.distGrid.extent->size().toString()"
		   });		
		addAnnotation
		  (getESMFActionGridGetPLocalDePSloc_ExclusiveUBound(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "arraySize", "self.grid.distGrid.extent->size().toString()"
		   });		
		addAnnotation
		  (getESMFActionGridGetPLocalDePSloc_ComputationalLBound(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "arraySize", "self.grid.distGrid.extent->size().toString()"
		   });		
		addAnnotation
		  (getESMFActionGridGetPLocalDePSloc_ComputationalUBound(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "arraySize", "self.grid.distGrid.extent->size().toString()"
		   });			
		addAnnotation
		  (getESMFActionGridGetCoord_Grid(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridGetCoord_CoordDim(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });		
		addAnnotation
		  (getESMFActionGridGetCoord_FarrayPtr(), 
		   source, 
		   new String[] {
			 "type", "real",
			 "pointer", "true",
			 "dim", "1"
		   });				
		addAnnotation
		  (getESMFActionGridCompCreate_Name(), 
		   source, 
		   new String[] {
			 "type", "character"
		   });			
		addAnnotation
		  (getESMFActionGridCompInitialize_Gridcomp(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridCompInitialize_ImportState(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridCompInitialize_ExportState(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridCompInitialize_Clock(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridCompInitialize_Phase(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });			
		addAnnotation
		  (getESMFActionGridCompRun_Gridcomp(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridCompRun_ImportState(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridCompRun_ExportState(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridCompRun_Clock(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridCompRun_Phase(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });			
		addAnnotation
		  (getESMFActionGridCompFinalize_Gridcomp(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridCompFinalize_ImportState(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridCompFinalize_ExportState(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridCompFinalize_Clock(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridCompFinalize_Phase(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });			
		addAnnotation
		  (getESMFActionGridCompSetServices_Gridcomp(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridCompSetServices_UserRoutine(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionGridCompSetServices_UserRC(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });			
		addAnnotation
		  (getESMFActionTimeSet_Time(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionTimeSet_Yy(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "kind", "\"ESMF_KIND_I4\""
		   });		
		addAnnotation
		  (getESMFActionTimeSet_Mm(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });		
		addAnnotation
		  (getESMFActionTimeSet_Dd(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });		
		addAnnotation
		  (getESMFActionTimeSet_H(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "kind", "\"ESMF_KIND_I4\""
		   });		
		addAnnotation
		  (getESMFActionTimeSet_M(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "kind", "\"ESMF_KIND_I4\""
		   });		
		addAnnotation
		  (getESMFActionTimeSet_S(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "kind", "\"ESMF_KIND_I4\""
		   });			
		addAnnotation
		  (getESMFActionTimeGet_Time(), 
		   source, 
		   new String[] {
		   });			
		addAnnotation
		  (getESMFActionTimeGet_Mm(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });		
		addAnnotation
		  (getESMFActionTimeGet_Dd(), 
		   source, 
		   new String[] {
			 "type", "integer"
		   });		
		addAnnotation
		  (getESMFActionTimeGet_H(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "kind", "\"ESMF_KIND_I4\""
		   });		
		addAnnotation
		  (getESMFActionTimeGet_M(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "kind", "\"ESMF_KIND_I4\""
		   });		
		addAnnotation
		  (getESMFActionTimeGet_S(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "kind", "\"ESMF_KIND_I4\""
		   });			
		addAnnotation
		  (getESMFActionTimeIntervalSet_TimeInterval(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionTimeIntervalSet_H(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "kind", "\"ESMF_KIND_I4\""
		   });		
		addAnnotation
		  (getESMFActionTimeIntervalSet_M(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "kind", "\"ESMF_KIND_I4\""
		   });		
		addAnnotation
		  (getESMFActionTimeIntervalSet_S(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "kind", "\"ESMF_KIND_I4\""
		   });			
		addAnnotation
		  (getESMFActionTimeIntervalGet_TimeInterval(), 
		   source, 
		   new String[] {
		   });		
		addAnnotation
		  (getESMFActionTimeIntervalGet_H(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "kind", "\"ESMF_KIND_I4\""
		   });		
		addAnnotation
		  (getESMFActionTimeIntervalGet_M(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "kind", "\"ESMF_KIND_I4\""
		   });		
		addAnnotation
		  (getESMFActionTimeIntervalGet_S(), 
		   source, 
		   new String[] {
			 "type", "integer",
			 "kind", "\"ESMF_KIND_I4\""
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.earthsystemcurator.org/metapattern/apireturn</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createApireturnAnnotations() {
		String source = "http://www.earthsystemcurator.org/metapattern/apireturn";																		
		addAnnotation
		  (getESMFActionStateCreate_State(), 
		   source, 
		   new String[] {
		   });										
		addAnnotation
		  (getESMFActionArrayCreateAllocateAS_Array(), 
		   source, 
		   new String[] {
		   });												
		addAnnotation
		  (getESMFActionClockCreate_Clock(), 
		   source, 
		   new String[] {
		   });										
		addAnnotation
		  (getESMFActionCplCompCreate_Cplcomp(), 
		   source, 
		   new String[] {
		   });																										
		addAnnotation
		  (getESMFActionDistGridCreate_DistGrid(), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  (getESMFActionFieldCreateGridArray_Field(), 
		   source, 
		   new String[] {
		   });						
		addAnnotation
		  (getESMFActionFieldCreateGridArraySpec_Field(), 
		   source, 
		   new String[] {
		   });									
		addAnnotation
		  (getESMFActionFieldCreateTKR_Field(), 
		   source, 
		   new String[] {
		   });																																					
		addAnnotation
		  (getESMFActionGridCreate_Grid(), 
		   source, 
		   new String[] {
		   });																					
		addAnnotation
		  (getESMFActionGridCompCreate_Gridcomp(), 
		   source, 
		   new String[] {
		   });																																																	
	}

} //ESMFPackageImpl
