/**
 */
package org.earthsystemcurator.cupid.esmf.util;

import org.earthsystemcurator.cupid.esmf.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage
 * @generated
 */
public class ESMFAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ESMFPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ESMFPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFSwitch<Adapter> modelSwitch =
		new ESMFSwitch<Adapter>() {
			@Override
			public Adapter caseESMFNamedEntity(ESMFNamedEntity object) {
				return createESMFNamedEntityAdapter();
			}
			@Override
			public Adapter caseESMFScope(ESMFScope object) {
				return createESMFScopeAdapter();
			}
			@Override
			public Adapter caseESMFComponent(ESMFComponent object) {
				return createESMFComponentAdapter();
			}
			@Override
			public Adapter caseESMFGriddedComponent(ESMFGriddedComponent object) {
				return createESMFGriddedComponentAdapter();
			}
			@Override
			public Adapter caseESMFCouplerComponent(ESMFCouplerComponent object) {
				return createESMFCouplerComponentAdapter();
			}
			@Override
			public Adapter caseESMFSimpleCouplerComponent(ESMFSimpleCouplerComponent object) {
				return createESMFSimpleCouplerComponentAdapter();
			}
			@Override
			public Adapter caseESMFDriver(ESMFDriver object) {
				return createESMFDriverAdapter();
			}
			@Override
			public Adapter caseESMFStage(ESMFStage object) {
				return createESMFStageAdapter();
			}
			@Override
			public Adapter caseESMFStageInitialize(ESMFStageInitialize object) {
				return createESMFStageInitializeAdapter();
			}
			@Override
			public Adapter caseESMFStageRun(ESMFStageRun object) {
				return createESMFStageRunAdapter();
			}
			@Override
			public Adapter caseESMFStageFinalize(ESMFStageFinalize object) {
				return createESMFStageFinalizeAdapter();
			}
			@Override
			public Adapter caseESMFStageAction(ESMFStageAction object) {
				return createESMFStageActionAdapter();
			}
			@Override
			public Adapter caseESMFStageActionSequence(ESMFStageActionSequence object) {
				return createESMFStageActionSequenceAdapter();
			}
			@Override
			public Adapter caseESMFStageActionIterate(ESMFStageActionIterate object) {
				return createESMFStageActionIterateAdapter();
			}
			@Override
			public Adapter caseESMFStageActionIterateClock(ESMFStageActionIterateClock object) {
				return createESMFStageActionIterateClockAdapter();
			}
			@Override
			public Adapter caseESMFStageActionArraySpecCreate(ESMFStageActionArraySpecCreate object) {
				return createESMFStageActionArraySpecCreateAdapter();
			}
			@Override
			public Adapter caseESMFStageActionComponentCreate(ESMFStageActionComponentCreate object) {
				return createESMFStageActionComponentCreateAdapter();
			}
			@Override
			public Adapter caseESMFStageActionComponentDestroy(ESMFStageActionComponentDestroy object) {
				return createESMFStageActionComponentDestroyAdapter();
			}
			@Override
			public Adapter caseESMFStageActionComponentSetGrid(ESMFStageActionComponentSetGrid object) {
				return createESMFStageActionComponentSetGridAdapter();
			}
			@Override
			public Adapter caseESMFStageActionExecuteStage(ESMFStageActionExecuteStage object) {
				return createESMFStageActionExecuteStageAdapter();
			}
			@Override
			public Adapter caseESMFStageActionFieldCreate(ESMFStageActionFieldCreate object) {
				return createESMFStageActionFieldCreateAdapter();
			}
			@Override
			public Adapter caseESMFStageActionFieldDestroy(ESMFStageActionFieldDestroy object) {
				return createESMFStageActionFieldDestroyAdapter();
			}
			@Override
			public Adapter caseESMFStageActionFieldRedistStore(ESMFStageActionFieldRedistStore object) {
				return createESMFStageActionFieldRedistStoreAdapter();
			}
			@Override
			public Adapter caseESMFStageActionFieldRedist(ESMFStageActionFieldRedist object) {
				return createESMFStageActionFieldRedistAdapter();
			}
			@Override
			public Adapter caseESMFStageActionFieldRedistRelease(ESMFStageActionFieldRedistRelease object) {
				return createESMFStageActionFieldRedistReleaseAdapter();
			}
			@Override
			public Adapter caseESMFStageActionGridCreate(ESMFStageActionGridCreate object) {
				return createESMFStageActionGridCreateAdapter();
			}
			@Override
			public Adapter caseESMFStageActionGridInherit(ESMFStageActionGridInherit object) {
				return createESMFStageActionGridInheritAdapter();
			}
			@Override
			public Adapter caseESMFStageActionImportStateAdd(ESMFStageActionImportStateAdd object) {
				return createESMFStageActionImportStateAddAdapter();
			}
			@Override
			public Adapter caseESMFStageActionExportStateAdd(ESMFStageActionExportStateAdd object) {
				return createESMFStageActionExportStateAddAdapter();
			}
			@Override
			public Adapter caseESMFStageActionImportStateGet(ESMFStageActionImportStateGet object) {
				return createESMFStageActionImportStateGetAdapter();
			}
			@Override
			public Adapter caseESMFStageActionExportStateGet(ESMFStageActionExportStateGet object) {
				return createESMFStageActionExportStateGetAdapter();
			}
			@Override
			public Adapter caseESMFStageActionStateCreate(ESMFStageActionStateCreate object) {
				return createESMFStageActionStateCreateAdapter();
			}
			@Override
			public Adapter caseESMFStageActionStateDestroy(ESMFStageActionStateDestroy object) {
				return createESMFStageActionStateDestroyAdapter();
			}
			@Override
			public Adapter caseESMFMethod(ESMFMethod object) {
				return createESMFMethodAdapter();
			}
			@Override
			public Adapter caseESMFInitMethod(ESMFInitMethod object) {
				return createESMFInitMethodAdapter();
			}
			@Override
			public Adapter caseESMFPreInitMethodSIDL(ESMFPreInitMethodSIDL object) {
				return createESMFPreInitMethodSIDLAdapter();
			}
			@Override
			public Adapter caseESMFPostInitMethodSIDL(ESMFPostInitMethodSIDL object) {
				return createESMFPostInitMethodSIDLAdapter();
			}
			@Override
			public Adapter caseESMFRunMethod(ESMFRunMethod object) {
				return createESMFRunMethodAdapter();
			}
			@Override
			public Adapter caseESMFFinalizeMethod(ESMFFinalizeMethod object) {
				return createESMFFinalizeMethodAdapter();
			}
			@Override
			public Adapter caseESMFFinalizeMethodSIDL(ESMFFinalizeMethodSIDL object) {
				return createESMFFinalizeMethodSIDLAdapter();
			}
			@Override
			public Adapter caseESMFRegisterMethod(ESMFRegisterMethod object) {
				return createESMFRegisterMethodAdapter();
			}
			@Override
			public Adapter caseESMFCalendar(ESMFCalendar object) {
				return createESMFCalendarAdapter();
			}
			@Override
			public Adapter caseESMFTimeInterval(ESMFTimeInterval object) {
				return createESMFTimeIntervalAdapter();
			}
			@Override
			public Adapter caseESMFTime(ESMFTime object) {
				return createESMFTimeAdapter();
			}
			@Override
			public Adapter caseESMFClock(ESMFClock object) {
				return createESMFClockAdapter();
			}
			@Override
			public Adapter caseESMFState(ESMFState object) {
				return createESMFStateAdapter();
			}
			@Override
			public Adapter caseESMFStateItem(ESMFStateItem object) {
				return createESMFStateItemAdapter();
			}
			@Override
			public Adapter caseESMFScopedItem(ESMFScopedItem object) {
				return createESMFScopedItemAdapter();
			}
			@Override
			public Adapter caseESMFField(ESMFField object) {
				return createESMFFieldAdapter();
			}
			@Override
			public Adapter caseESMFFieldConnection(ESMFFieldConnection object) {
				return createESMFFieldConnectionAdapter();
			}
			@Override
			public Adapter caseESMFArray(ESMFArray object) {
				return createESMFArrayAdapter();
			}
			@Override
			public Adapter caseESMFRouteHandle(ESMFRouteHandle object) {
				return createESMFRouteHandleAdapter();
			}
			@Override
			public Adapter caseESMFArraySpec(ESMFArraySpec object) {
				return createESMFArraySpecAdapter();
			}
			@Override
			public Adapter caseESMFGrid(ESMFGrid object) {
				return createESMFGridAdapter();
			}
			@Override
			public Adapter caseExtent(Extent object) {
				return createExtentAdapter();
			}
			@Override
			public Adapter caseESMFDistGrid(ESMFDistGrid object) {
				return createESMFDistGridAdapter();
			}
			@Override
			public Adapter caseESMFWorkspace(ESMFWorkspace object) {
				return createESMFWorkspaceAdapter();
			}
			@Override
			public Adapter caseESMFVirtualMachine(ESMFVirtualMachine object) {
				return createESMFVirtualMachineAdapter();
			}
			@Override
			public Adapter caseESMFPersistentExecutionThread(ESMFPersistentExecutionThread object) {
				return createESMFPersistentExecutionThreadAdapter();
			}
			@Override
			public Adapter caseESMFDELayout(ESMFDELayout object) {
				return createESMFDELayoutAdapter();
			}
			@Override
			public Adapter caseESMFDecompositionElement(ESMFDecompositionElement object) {
				return createESMFDecompositionElementAdapter();
			}
			@Override
			public Adapter caseESMFVirtualAddressSpace(ESMFVirtualAddressSpace object) {
				return createESMFVirtualAddressSpaceAdapter();
			}
			@Override
			public Adapter caseESMFAction(ESMFAction object) {
				return createESMFActionAdapter();
			}
			@Override
			public Adapter caseESMFActionAPI(ESMFActionAPI object) {
				return createESMFActionAPIAdapter();
			}
			@Override
			public Adapter caseESMFActionMethodInvokePattern(ESMFActionMethodInvokePattern object) {
				return createESMFActionMethodInvokePatternAdapter();
			}
			@Override
			public Adapter caseESMFActionMethodInvokeSequence(ESMFActionMethodInvokeSequence object) {
				return createESMFActionMethodInvokeSequenceAdapter();
			}
			@Override
			public Adapter caseESMFActionMethodInvokeIteration(ESMFActionMethodInvokeIteration object) {
				return createESMFActionMethodInvokeIterationAdapter();
			}
			@Override
			public Adapter caseESMFActionStateAdd(ESMFActionStateAdd object) {
				return createESMFActionStateAddAdapter();
			}
			@Override
			public Adapter caseESMFActionStateCreate(ESMFActionStateCreate object) {
				return createESMFActionStateCreateAdapter();
			}
			@Override
			public Adapter caseESMFActionStateGet(ESMFActionStateGet object) {
				return createESMFActionStateGetAdapter();
			}
			@Override
			public Adapter caseESMFActionStateReconcile(ESMFActionStateReconcile object) {
				return createESMFActionStateReconcileAdapter();
			}
			@Override
			public Adapter caseESMFActionArrayCreate(ESMFActionArrayCreate object) {
				return createESMFActionArrayCreateAdapter();
			}
			@Override
			public Adapter caseESMFActionArrayCreateAllocateAS(ESMFActionArrayCreateAllocateAS object) {
				return createESMFActionArrayCreateAllocateASAdapter();
			}
			@Override
			public Adapter caseESMFActionArraySpecSet(ESMFActionArraySpecSet object) {
				return createESMFActionArraySpecSetAdapter();
			}
			@Override
			public Adapter caseESMFActionClockCreate(ESMFActionClockCreate object) {
				return createESMFActionClockCreateAdapter();
			}
			@Override
			public Adapter caseESMFActionClockGet(ESMFActionClockGet object) {
				return createESMFActionClockGetAdapter();
			}
			@Override
			public Adapter caseESMFActionClockGetTimestep(ESMFActionClockGetTimestep object) {
				return createESMFActionClockGetTimestepAdapter();
			}
			@Override
			public Adapter caseESMFActionCplCompCreate(ESMFActionCplCompCreate object) {
				return createESMFActionCplCompCreateAdapter();
			}
			@Override
			public Adapter caseESMFActionCplCompInitialize(ESMFActionCplCompInitialize object) {
				return createESMFActionCplCompInitializeAdapter();
			}
			@Override
			public Adapter caseESMFActionCplCompRun(ESMFActionCplCompRun object) {
				return createESMFActionCplCompRunAdapter();
			}
			@Override
			public Adapter caseESMFActionCplCompFinalize(ESMFActionCplCompFinalize object) {
				return createESMFActionCplCompFinalizeAdapter();
			}
			@Override
			public Adapter caseESMFActionCplCompSetServices(ESMFActionCplCompSetServices object) {
				return createESMFActionCplCompSetServicesAdapter();
			}
			@Override
			public Adapter caseESMFActionDistGridCreate(ESMFActionDistGridCreate object) {
				return createESMFActionDistGridCreateAdapter();
			}
			@Override
			public Adapter caseESMFActionFieldCreate(ESMFActionFieldCreate object) {
				return createESMFActionFieldCreateAdapter();
			}
			@Override
			public Adapter caseESMFActionFieldCreateGridArray(ESMFActionFieldCreateGridArray object) {
				return createESMFActionFieldCreateGridArrayAdapter();
			}
			@Override
			public Adapter caseESMFActionFieldCreateGridArraySpec(ESMFActionFieldCreateGridArraySpec object) {
				return createESMFActionFieldCreateGridArraySpecAdapter();
			}
			@Override
			public Adapter caseESMFActionFieldCreateTKR(ESMFActionFieldCreateTKR object) {
				return createESMFActionFieldCreateTKRAdapter();
			}
			@Override
			public Adapter caseESMFActionFieldGet(ESMFActionFieldGet object) {
				return createESMFActionFieldGetAdapter();
			}
			@Override
			public Adapter caseESMFActionFieldGetBounds(ESMFActionFieldGetBounds object) {
				return createESMFActionFieldGetBoundsAdapter();
			}
			@Override
			public Adapter caseESMFActionFieldHaloStore(ESMFActionFieldHaloStore object) {
				return createESMFActionFieldHaloStoreAdapter();
			}
			@Override
			public Adapter caseESMFActionFieldHalo(ESMFActionFieldHalo object) {
				return createESMFActionFieldHaloAdapter();
			}
			@Override
			public Adapter caseESMFActionFieldHaloRelease(ESMFActionFieldHaloRelease object) {
				return createESMFActionFieldHaloReleaseAdapter();
			}
			@Override
			public Adapter caseESMFActionFieldRedistStore(ESMFActionFieldRedistStore object) {
				return createESMFActionFieldRedistStoreAdapter();
			}
			@Override
			public Adapter caseESMFActionFieldRedist(ESMFActionFieldRedist object) {
				return createESMFActionFieldRedistAdapter();
			}
			@Override
			public Adapter caseESMFActionFieldRedistRelease(ESMFActionFieldRedistRelease object) {
				return createESMFActionFieldRedistReleaseAdapter();
			}
			@Override
			public Adapter caseESMFActionFrameworkInit(ESMFActionFrameworkInit object) {
				return createESMFActionFrameworkInitAdapter();
			}
			@Override
			public Adapter caseESMFActionFrameworkFinalize(ESMFActionFrameworkFinalize object) {
				return createESMFActionFrameworkFinalizeAdapter();
			}
			@Override
			public Adapter caseESMFActionGridCreate(ESMFActionGridCreate object) {
				return createESMFActionGridCreateAdapter();
			}
			@Override
			public Adapter caseESMFActionGridGet(ESMFActionGridGet object) {
				return createESMFActionGridGetAdapter();
			}
			@Override
			public Adapter caseESMFActionGridGetPLocalDe(ESMFActionGridGetPLocalDe object) {
				return createESMFActionGridGetPLocalDeAdapter();
			}
			@Override
			public Adapter caseESMFActionGridGetPLocalDePSloc(ESMFActionGridGetPLocalDePSloc object) {
				return createESMFActionGridGetPLocalDePSlocAdapter();
			}
			@Override
			public Adapter caseESMFActionGridGetCoord(ESMFActionGridGetCoord object) {
				return createESMFActionGridGetCoordAdapter();
			}
			@Override
			public Adapter caseESMFActionGridCompCreate(ESMFActionGridCompCreate object) {
				return createESMFActionGridCompCreateAdapter();
			}
			@Override
			public Adapter caseESMFActionGridCompInitialize(ESMFActionGridCompInitialize object) {
				return createESMFActionGridCompInitializeAdapter();
			}
			@Override
			public Adapter caseESMFActionGridCompRun(ESMFActionGridCompRun object) {
				return createESMFActionGridCompRunAdapter();
			}
			@Override
			public Adapter caseESMFActionGridCompFinalize(ESMFActionGridCompFinalize object) {
				return createESMFActionGridCompFinalizeAdapter();
			}
			@Override
			public Adapter caseESMFActionGridCompSetServices(ESMFActionGridCompSetServices object) {
				return createESMFActionGridCompSetServicesAdapter();
			}
			@Override
			public Adapter caseESMFActionMethodInvoke(ESMFActionMethodInvoke object) {
				return createESMFActionMethodInvokeAdapter();
			}
			@Override
			public Adapter caseESMFActionTimeSet(ESMFActionTimeSet object) {
				return createESMFActionTimeSetAdapter();
			}
			@Override
			public Adapter caseESMFActionTimeGet(ESMFActionTimeGet object) {
				return createESMFActionTimeGetAdapter();
			}
			@Override
			public Adapter caseESMFActionTimeIntervalSet(ESMFActionTimeIntervalSet object) {
				return createESMFActionTimeIntervalSetAdapter();
			}
			@Override
			public Adapter caseESMFActionTimeIntervalGet(ESMFActionTimeIntervalGet object) {
				return createESMFActionTimeIntervalGetAdapter();
			}
			@Override
			public Adapter caseESMFActionUserServiceInvoke(ESMFActionUserServiceInvoke object) {
				return createESMFActionUserServiceInvokeAdapter();
			}
			@Override
			public Adapter caseESMFCall(ESMFCall object) {
				return createESMFCallAdapter();
			}
			@Override
			public Adapter caseESMFCallGridCompCreate(ESMFCallGridCompCreate object) {
				return createESMFCallGridCompCreateAdapter();
			}
			@Override
			public Adapter caseESMFCallGridCompInitialize(ESMFCallGridCompInitialize object) {
				return createESMFCallGridCompInitializeAdapter();
			}
			@Override
			public Adapter caseESMFCallGridCompSetServices(ESMFCallGridCompSetServices object) {
				return createESMFCallGridCompSetServicesAdapter();
			}
			@Override
			public Adapter caseESMFCallCplCompCreate(ESMFCallCplCompCreate object) {
				return createESMFCallCplCompCreateAdapter();
			}
			@Override
			public Adapter caseESMFCallCplCompInitialize(ESMFCallCplCompInitialize object) {
				return createESMFCallCplCompInitializeAdapter();
			}
			@Override
			public Adapter caseESMFCallCplCompSetServices(ESMFCallCplCompSetServices object) {
				return createESMFCallCplCompSetServicesAdapter();
			}
			@Override
			public Adapter caseESMFCallFieldCreateSIDL(ESMFCallFieldCreateSIDL object) {
				return createESMFCallFieldCreateSIDLAdapter();
			}
			@Override
			public Adapter caseESMFCallSIDLMethod(ESMFCallSIDLMethod object) {
				return createESMFCallSIDLMethodAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFComponent
	 * @generated
	 */
	public Adapter createESMFComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFGriddedComponent <em>Gridded Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFGriddedComponent
	 * @generated
	 */
	public Adapter createESMFGriddedComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFCouplerComponent <em>Coupler Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCouplerComponent
	 * @generated
	 */
	public Adapter createESMFCouplerComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFSimpleCouplerComponent <em>Simple Coupler Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFSimpleCouplerComponent
	 * @generated
	 */
	public Adapter createESMFSimpleCouplerComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDriver
	 * @generated
	 */
	public Adapter createESMFDriverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStage
	 * @generated
	 */
	public Adapter createESMFStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageInitialize <em>Stage Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageInitialize
	 * @generated
	 */
	public Adapter createESMFStageInitializeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageRun <em>Stage Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageRun
	 * @generated
	 */
	public Adapter createESMFStageRunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageFinalize <em>Stage Finalize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageFinalize
	 * @generated
	 */
	public Adapter createESMFStageFinalizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageAction <em>Stage Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageAction
	 * @generated
	 */
	public Adapter createESMFStageActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionSequence <em>Stage Action Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionSequence
	 * @generated
	 */
	public Adapter createESMFStageActionSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionIterate <em>Stage Action Iterate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionIterate
	 * @generated
	 */
	public Adapter createESMFStageActionIterateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionIterateClock <em>Stage Action Iterate Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionIterateClock
	 * @generated
	 */
	public Adapter createESMFStageActionIterateClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionFieldCreate <em>Stage Action Field Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionFieldCreate
	 * @generated
	 */
	public Adapter createESMFStageActionFieldCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionFieldDestroy <em>Stage Action Field Destroy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionFieldDestroy
	 * @generated
	 */
	public Adapter createESMFStageActionFieldDestroyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionFieldRedistStore <em>Stage Action Field Redist Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionFieldRedistStore
	 * @generated
	 */
	public Adapter createESMFStageActionFieldRedistStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionFieldRedist <em>Stage Action Field Redist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionFieldRedist
	 * @generated
	 */
	public Adapter createESMFStageActionFieldRedistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionFieldRedistRelease <em>Stage Action Field Redist Release</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionFieldRedistRelease
	 * @generated
	 */
	public Adapter createESMFStageActionFieldRedistReleaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionGridCreate <em>Stage Action Grid Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionGridCreate
	 * @generated
	 */
	public Adapter createESMFStageActionGridCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionGridInherit <em>Stage Action Grid Inherit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionGridInherit
	 * @generated
	 */
	public Adapter createESMFStageActionGridInheritAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionImportStateAdd <em>Stage Action Import State Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionImportStateAdd
	 * @generated
	 */
	public Adapter createESMFStageActionImportStateAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionExportStateAdd <em>Stage Action Export State Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionExportStateAdd
	 * @generated
	 */
	public Adapter createESMFStageActionExportStateAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionImportStateGet <em>Stage Action Import State Get</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionImportStateGet
	 * @generated
	 */
	public Adapter createESMFStageActionImportStateGetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionExportStateGet <em>Stage Action Export State Get</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionExportStateGet
	 * @generated
	 */
	public Adapter createESMFStageActionExportStateGetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionStateCreate <em>Stage Action State Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionStateCreate
	 * @generated
	 */
	public Adapter createESMFStageActionStateCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionStateDestroy <em>Stage Action State Destroy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionStateDestroy
	 * @generated
	 */
	public Adapter createESMFStageActionStateDestroyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionArraySpecCreate <em>Stage Action Array Spec Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionArraySpecCreate
	 * @generated
	 */
	public Adapter createESMFStageActionArraySpecCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionComponentCreate <em>Stage Action Component Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionComponentCreate
	 * @generated
	 */
	public Adapter createESMFStageActionComponentCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionComponentDestroy <em>Stage Action Component Destroy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionComponentDestroy
	 * @generated
	 */
	public Adapter createESMFStageActionComponentDestroyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionComponentSetGrid <em>Stage Action Component Set Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionComponentSetGrid
	 * @generated
	 */
	public Adapter createESMFStageActionComponentSetGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStageActionExecuteStage <em>Stage Action Execute Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStageActionExecuteStage
	 * @generated
	 */
	public Adapter createESMFStageActionExecuteStageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFMethod
	 * @generated
	 */
	public Adapter createESMFMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFInitMethod <em>Init Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFInitMethod
	 * @generated
	 */
	public Adapter createESMFInitMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFPreInitMethodSIDL <em>Pre Init Method SIDL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPreInitMethodSIDL
	 * @generated
	 */
	public Adapter createESMFPreInitMethodSIDLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFPostInitMethodSIDL <em>Post Init Method SIDL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPostInitMethodSIDL
	 * @generated
	 */
	public Adapter createESMFPostInitMethodSIDLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFRunMethod <em>Run Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFRunMethod
	 * @generated
	 */
	public Adapter createESMFRunMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFFinalizeMethod <em>Finalize Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFFinalizeMethod
	 * @generated
	 */
	public Adapter createESMFFinalizeMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFFinalizeMethodSIDL <em>Finalize Method SIDL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFFinalizeMethodSIDL
	 * @generated
	 */
	public Adapter createESMFFinalizeMethodSIDLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFRegisterMethod <em>Register Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFRegisterMethod
	 * @generated
	 */
	public Adapter createESMFRegisterMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFCalendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCalendar
	 * @generated
	 */
	public Adapter createESMFCalendarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFTimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTimeInterval
	 * @generated
	 */
	public Adapter createESMFTimeIntervalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFTime
	 * @generated
	 */
	public Adapter createESMFTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFClock <em>Clock</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFClock
	 * @generated
	 */
	public Adapter createESMFClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFState
	 * @generated
	 */
	public Adapter createESMFStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFStateItem <em>State Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFStateItem
	 * @generated
	 */
	public Adapter createESMFStateItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFScopedItem <em>Scoped Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFScopedItem
	 * @generated
	 */
	public Adapter createESMFScopedItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFField
	 * @generated
	 */
	public Adapter createESMFFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFFieldConnection <em>Field Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFFieldConnection
	 * @generated
	 */
	public Adapter createESMFFieldConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFArray
	 * @generated
	 */
	public Adapter createESMFArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFRouteHandle <em>Route Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFRouteHandle
	 * @generated
	 */
	public Adapter createESMFRouteHandleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFArraySpec <em>Array Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFArraySpec
	 * @generated
	 */
	public Adapter createESMFArraySpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFGrid
	 * @generated
	 */
	public Adapter createESMFGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.Extent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.Extent
	 * @generated
	 */
	public Adapter createExtentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFDistGrid <em>Dist Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDistGrid
	 * @generated
	 */
	public Adapter createESMFDistGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFWorkspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFWorkspace
	 * @generated
	 */
	public Adapter createESMFWorkspaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine
	 * @generated
	 */
	public Adapter createESMFVirtualMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFPersistentExecutionThread <em>Persistent Execution Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPersistentExecutionThread
	 * @generated
	 */
	public Adapter createESMFPersistentExecutionThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFDELayout <em>DE Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDELayout
	 * @generated
	 */
	public Adapter createESMFDELayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement <em>Decomposition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement
	 * @generated
	 */
	public Adapter createESMFDecompositionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFVirtualAddressSpace <em>Virtual Address Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFVirtualAddressSpace
	 * @generated
	 */
	public Adapter createESMFVirtualAddressSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFAction
	 * @generated
	 */
	public Adapter createESMFActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionAPI <em>Action API</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionAPI
	 * @generated
	 */
	public Adapter createESMFActionAPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokePattern <em>Action Method Invoke Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokePattern
	 * @generated
	 */
	public Adapter createESMFActionMethodInvokePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokeSequence <em>Action Method Invoke Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokeSequence
	 * @generated
	 */
	public Adapter createESMFActionMethodInvokeSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokeIteration <em>Action Method Invoke Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvokeIteration
	 * @generated
	 */
	public Adapter createESMFActionMethodInvokeIterationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateAdd <em>Action State Add</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionStateAdd
	 * @generated
	 */
	public Adapter createESMFActionStateAddAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateCreate <em>Action State Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionStateCreate
	 * @generated
	 */
	public Adapter createESMFActionStateCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateGet <em>Action State Get</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionStateGet
	 * @generated
	 */
	public Adapter createESMFActionStateGetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionStateReconcile <em>Action State Reconcile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionStateReconcile
	 * @generated
	 */
	public Adapter createESMFActionStateReconcileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreate <em>Action Array Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreate
	 * @generated
	 */
	public Adapter createESMFActionArrayCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS <em>Action Array Create Allocate AS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS
	 * @generated
	 */
	public Adapter createESMFActionArrayCreateAllocateASAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet <em>Action Array Spec Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionArraySpecSet
	 * @generated
	 */
	public Adapter createESMFActionArraySpecSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate <em>Action Clock Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate
	 * @generated
	 */
	public Adapter createESMFActionClockCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockGet <em>Action Clock Get</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionClockGet
	 * @generated
	 */
	public Adapter createESMFActionClockGetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionClockGetTimestep <em>Action Clock Get Timestep</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionClockGetTimestep
	 * @generated
	 */
	public Adapter createESMFActionClockGetTimestepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompCreate <em>Action Cpl Comp Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompCreate
	 * @generated
	 */
	public Adapter createESMFActionCplCompCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompInitialize <em>Action Cpl Comp Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompInitialize
	 * @generated
	 */
	public Adapter createESMFActionCplCompInitializeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun <em>Action Cpl Comp Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompRun
	 * @generated
	 */
	public Adapter createESMFActionCplCompRunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompFinalize <em>Action Cpl Comp Finalize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompFinalize
	 * @generated
	 */
	public Adapter createESMFActionCplCompFinalizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices <em>Action Cpl Comp Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionCplCompSetServices
	 * @generated
	 */
	public Adapter createESMFActionCplCompSetServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate <em>Action Dist Grid Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate
	 * @generated
	 */
	public Adapter createESMFActionDistGridCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreate <em>Action Field Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreate
	 * @generated
	 */
	public Adapter createESMFActionFieldCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray <em>Action Field Create Grid Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArray
	 * @generated
	 */
	public Adapter createESMFActionFieldCreateGridArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec <em>Action Field Create Grid Array Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec
	 * @generated
	 */
	public Adapter createESMFActionFieldCreateGridArraySpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR <em>Action Field Create TKR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR
	 * @generated
	 */
	public Adapter createESMFActionFieldCreateTKRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGet <em>Action Field Get</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldGet
	 * @generated
	 */
	public Adapter createESMFActionFieldGetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds <em>Action Field Get Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds
	 * @generated
	 */
	public Adapter createESMFActionFieldGetBoundsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloStore <em>Action Field Halo Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloStore
	 * @generated
	 */
	public Adapter createESMFActionFieldHaloStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldHalo <em>Action Field Halo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldHalo
	 * @generated
	 */
	public Adapter createESMFActionFieldHaloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloRelease <em>Action Field Halo Release</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldHaloRelease
	 * @generated
	 */
	public Adapter createESMFActionFieldHaloReleaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore <em>Action Field Redist Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistStore
	 * @generated
	 */
	public Adapter createESMFActionFieldRedistStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedist <em>Action Field Redist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedist
	 * @generated
	 */
	public Adapter createESMFActionFieldRedistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistRelease <em>Action Field Redist Release</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFieldRedistRelease
	 * @generated
	 */
	public Adapter createESMFActionFieldRedistReleaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFrameworkInit <em>Action Framework Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFrameworkInit
	 * @generated
	 */
	public Adapter createESMFActionFrameworkInitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionFrameworkFinalize <em>Action Framework Finalize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionFrameworkFinalize
	 * @generated
	 */
	public Adapter createESMFActionFrameworkFinalizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate <em>Action Grid Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate
	 * @generated
	 */
	public Adapter createESMFActionGridCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGet <em>Action Grid Get</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGet
	 * @generated
	 */
	public Adapter createESMFActionGridGetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe <em>Action Grid Get PLocal De</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe
	 * @generated
	 */
	public Adapter createESMFActionGridGetPLocalDeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc <em>Action Grid Get PLocal De PSloc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc
	 * @generated
	 */
	public Adapter createESMFActionGridGetPLocalDePSlocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord <em>Action Grid Get Coord</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord
	 * @generated
	 */
	public Adapter createESMFActionGridGetCoordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompCreate <em>Action Grid Comp Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompCreate
	 * @generated
	 */
	public Adapter createESMFActionGridCompCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompInitialize <em>Action Grid Comp Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompInitialize
	 * @generated
	 */
	public Adapter createESMFActionGridCompInitializeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompRun <em>Action Grid Comp Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompRun
	 * @generated
	 */
	public Adapter createESMFActionGridCompRunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompFinalize <em>Action Grid Comp Finalize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompFinalize
	 * @generated
	 */
	public Adapter createESMFActionGridCompFinalizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionGridCompSetServices <em>Action Grid Comp Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionGridCompSetServices
	 * @generated
	 */
	public Adapter createESMFActionGridCompSetServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvoke <em>Action Method Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionMethodInvoke
	 * @generated
	 */
	public Adapter createESMFActionMethodInvokeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet <em>Action Time Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeSet
	 * @generated
	 */
	public Adapter createESMFActionTimeSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet <em>Action Time Get</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet
	 * @generated
	 */
	public Adapter createESMFActionTimeGetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalSet <em>Action Time Interval Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalSet
	 * @generated
	 */
	public Adapter createESMFActionTimeIntervalSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet <em>Action Time Interval Get</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet
	 * @generated
	 */
	public Adapter createESMFActionTimeIntervalGetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFActionUserServiceInvoke <em>Action User Service Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFActionUserServiceInvoke
	 * @generated
	 */
	public Adapter createESMFActionUserServiceInvokeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFCall <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCall
	 * @generated
	 */
	public Adapter createESMFCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFCallGridCompCreate <em>Call Grid Comp Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallGridCompCreate
	 * @generated
	 */
	public Adapter createESMFCallGridCompCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFCallGridCompInitialize <em>Call Grid Comp Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallGridCompInitialize
	 * @generated
	 */
	public Adapter createESMFCallGridCompInitializeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFCallGridCompSetServices <em>Call Grid Comp Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallGridCompSetServices
	 * @generated
	 */
	public Adapter createESMFCallGridCompSetServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFCallCplCompCreate <em>Call Cpl Comp Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallCplCompCreate
	 * @generated
	 */
	public Adapter createESMFCallCplCompCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFCallCplCompInitialize <em>Call Cpl Comp Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallCplCompInitialize
	 * @generated
	 */
	public Adapter createESMFCallCplCompInitializeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFCallCplCompSetServices <em>Call Cpl Comp Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallCplCompSetServices
	 * @generated
	 */
	public Adapter createESMFCallCplCompSetServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFCallFieldCreateSIDL <em>Call Field Create SIDL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallFieldCreateSIDL
	 * @generated
	 */
	public Adapter createESMFCallFieldCreateSIDLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFCallSIDLMethod <em>Call SIDL Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFCallSIDLMethod
	 * @generated
	 */
	public Adapter createESMFCallSIDLMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFNamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFNamedEntity
	 * @generated
	 */
	public Adapter createESMFNamedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.esmf.ESMFScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFScope
	 * @generated
	 */
	public Adapter createESMFScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ESMFAdapterFactory
