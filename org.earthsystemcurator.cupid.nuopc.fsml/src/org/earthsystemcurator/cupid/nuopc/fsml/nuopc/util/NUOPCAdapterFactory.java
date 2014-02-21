/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.util;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage
 * @generated
 */
public class NUOPCAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NUOPCPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NUOPCPackage.eINSTANCE;
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
	protected NUOPCSwitch<Adapter> modelSwitch =
		new NUOPCSwitch<Adapter>() {
			@Override
			public Adapter caseTop(Top object) {
				return createTopAdapter();
			}
			@Override
			public Adapter caseNUOPCApplication(NUOPCApplication object) {
				return createNUOPCApplicationAdapter();
			}
			@Override
			public Adapter caseNUOPCModel(NUOPCModel object) {
				return createNUOPCModelAdapter();
			}
			@Override
			public Adapter caseNUOPCModel__GenericImports(NUOPCModel__GenericImports object) {
				return createNUOPCModel__GenericImportsAdapter();
			}
			@Override
			public Adapter caseNUOPCModel__Init(NUOPCModel__Init object) {
				return createNUOPCModel__InitAdapter();
			}
			@Override
			public Adapter caseNUOPCModel__ImplementsSetServices(NUOPCModel__ImplementsSetServices object) {
				return createNUOPCModel__ImplementsSetServicesAdapter();
			}
			@Override
			public Adapter caseNUOPCModel__ImplementsInitP1(NUOPCModel__ImplementsInitP1 object) {
				return createNUOPCModel__ImplementsInitP1Adapter();
			}
			@Override
			public Adapter caseNUOPCModel__ImplementsInitP2(NUOPCModel__ImplementsInitP2 object) {
				return createNUOPCModel__ImplementsInitP2Adapter();
			}
			@Override
			public Adapter caseNUOPCModel__AdvertisesImportField(NUOPCModel__AdvertisesImportField object) {
				return createNUOPCModel__AdvertisesImportFieldAdapter();
			}
			@Override
			public Adapter caseNUOPCModel__AdvertisesExportField(NUOPCModel__AdvertisesExportField object) {
				return createNUOPCModel__AdvertisesExportFieldAdapter();
			}
			@Override
			public Adapter caseNUOPCModel__RealizesImportField(NUOPCModel__RealizesImportField object) {
				return createNUOPCModel__RealizesImportFieldAdapter();
			}
			@Override
			public Adapter caseNUOPCModel__RealizesExportField(NUOPCModel__RealizesExportField object) {
				return createNUOPCModel__RealizesExportFieldAdapter();
			}
			@Override
			public Adapter caseNUOPCModel__ModelAdvance(NUOPCModel__ModelAdvance object) {
				return createNUOPCModel__ModelAdvanceAdapter();
			}
			@Override
			public Adapter caseNUOPCModel__ModelAdvance__ImplementsSubroutine(NUOPCModel__ModelAdvance__ImplementsSubroutine object) {
				return createNUOPCModel__ModelAdvance__ImplementsSubroutineAdapter();
			}
			@Override
			public Adapter caseNUOPCModel__ModelAdvance__Attached(NUOPCModel__ModelAdvance__Attached object) {
				return createNUOPCModel__ModelAdvance__AttachedAdapter();
			}
			@Override
			public Adapter caseNUOPCDriver(NUOPCDriver object) {
				return createNUOPCDriverAdapter();
			}
			@Override
			public Adapter caseNUOPCDriver__GenericImports(NUOPCDriver__GenericImports object) {
				return createNUOPCDriver__GenericImportsAdapter();
			}
			@Override
			public Adapter caseNUOPCDriver__ModelImports(NUOPCDriver__ModelImports object) {
				return createNUOPCDriver__ModelImportsAdapter();
			}
			@Override
			public Adapter caseNUOPCDriver__ModelImports__ModelImport(NUOPCDriver__ModelImports__ModelImport object) {
				return createNUOPCDriver__ModelImports__ModelImportAdapter();
			}
			@Override
			public Adapter caseNUOPCDriver__ConnectorImports(NUOPCDriver__ConnectorImports object) {
				return createNUOPCDriver__ConnectorImportsAdapter();
			}
			@Override
			public Adapter caseNUOPCDriver__ConnectorImports__ConnectorImport(NUOPCDriver__ConnectorImports__ConnectorImport object) {
				return createNUOPCDriver__ConnectorImports__ConnectorImportAdapter();
			}
			@Override
			public Adapter caseNUOPCDriver__ImplementsSetServices(NUOPCDriver__ImplementsSetServices object) {
				return createNUOPCDriver__ImplementsSetServicesAdapter();
			}
			@Override
			public Adapter caseNUOPCDriver__ImplementsSetModelCount(NUOPCDriver__ImplementsSetModelCount object) {
				return createNUOPCDriver__ImplementsSetModelCountAdapter();
			}
			@Override
			public Adapter caseNUOPCDriver__ImplementsSetModelServices(NUOPCDriver__ImplementsSetModelServices object) {
				return createNUOPCDriver__ImplementsSetModelServicesAdapter();
			}
			@Override
			public Adapter caseNUOPCDriverAtmOcn(NUOPCDriverAtmOcn object) {
				return createNUOPCDriverAtmOcnAdapter();
			}
			@Override
			public Adapter caseNUOPCDriverAtmOcn__GenericImports(NUOPCDriverAtmOcn__GenericImports object) {
				return createNUOPCDriverAtmOcn__GenericImportsAdapter();
			}
			@Override
			public Adapter caseNUOPCDriverAtmOcn__ModelImports(NUOPCDriverAtmOcn__ModelImports object) {
				return createNUOPCDriverAtmOcn__ModelImportsAdapter();
			}
			@Override
			public Adapter caseNUOPCDriverAtmOcn__ImplementsSetServices(NUOPCDriverAtmOcn__ImplementsSetServices object) {
				return createNUOPCDriverAtmOcn__ImplementsSetServicesAdapter();
			}
			@Override
			public Adapter caseNUOPCDriverAtmOcn__ImplementsSetModelCount(NUOPCDriverAtmOcn__ImplementsSetModelCount object) {
				return createNUOPCDriverAtmOcn__ImplementsSetModelCountAdapter();
			}
			@Override
			public Adapter caseNUOPCDriverAtmOcn__ImplementsSetModelServices(NUOPCDriverAtmOcn__ImplementsSetModelServices object) {
				return createNUOPCDriverAtmOcn__ImplementsSetModelServicesAdapter();
			}
			@Override
			public Adapter caseNUOPCDriverAtmOcn__ImplementsSetModelPetLists(NUOPCDriverAtmOcn__ImplementsSetModelPetLists object) {
				return createNUOPCDriverAtmOcn__ImplementsSetModelPetListsAdapter();
			}
			@Override
			public Adapter caseNUOPCDriverAtmOcn__ModelImports__ModelImport(NUOPCDriverAtmOcn__ModelImports__ModelImport object) {
				return createNUOPCDriverAtmOcn__ModelImports__ModelImportAdapter();
			}
			@Override
			public Adapter caseCallsGenericSetServices(CallsGenericSetServices object) {
				return createCallsGenericSetServicesAdapter();
			}
			@Override
			public Adapter caseCallsSetEntryPoint(CallsSetEntryPoint object) {
				return createCallsSetEntryPointAdapter();
			}
			@Override
			public Adapter caseAttachesMethod(AttachesMethod object) {
				return createAttachesMethodAdapter();
			}
			@Override
			public Adapter caseSetModelServices(SetModelServices object) {
				return createSetModelServicesAdapter();
			}
			@Override
			public Adapter caseSetCouplerServices(SetCouplerServices object) {
				return createSetCouplerServicesAdapter();
			}
			@Override
			public Adapter caseGetsInternalState(GetsInternalState object) {
				return createGetsInternalStateAdapter();
			}
			@Override
			public Adapter caseNUOPCMediator(NUOPCMediator object) {
				return createNUOPCMediatorAdapter();
			}
			@Override
			public Adapter caseNUOPCMediator__GenericImports(NUOPCMediator__GenericImports object) {
				return createNUOPCMediator__GenericImportsAdapter();
			}
			@Override
			public Adapter caseNUOPCMediator__Init(NUOPCMediator__Init object) {
				return createNUOPCMediator__InitAdapter();
			}
			@Override
			public Adapter caseNUOPCMediator__ImplementsSetServices(NUOPCMediator__ImplementsSetServices object) {
				return createNUOPCMediator__ImplementsSetServicesAdapter();
			}
			@Override
			public Adapter caseNUOPCMediator__ImplementsInitP1(NUOPCMediator__ImplementsInitP1 object) {
				return createNUOPCMediator__ImplementsInitP1Adapter();
			}
			@Override
			public Adapter caseNUOPCMediator__ImplementsInitP2(NUOPCMediator__ImplementsInitP2 object) {
				return createNUOPCMediator__ImplementsInitP2Adapter();
			}
			@Override
			public Adapter caseNUOPCMediator__AdvertisesImportField(NUOPCMediator__AdvertisesImportField object) {
				return createNUOPCMediator__AdvertisesImportFieldAdapter();
			}
			@Override
			public Adapter caseNUOPCMediator__AdvertisesExportField(NUOPCMediator__AdvertisesExportField object) {
				return createNUOPCMediator__AdvertisesExportFieldAdapter();
			}
			@Override
			public Adapter caseNUOPCMediator__RealizesImportField(NUOPCMediator__RealizesImportField object) {
				return createNUOPCMediator__RealizesImportFieldAdapter();
			}
			@Override
			public Adapter caseNUOPCMediator__RealizesExportField(NUOPCMediator__RealizesExportField object) {
				return createNUOPCMediator__RealizesExportFieldAdapter();
			}
			@Override
			public Adapter caseNUOPCMediator__ModelAdvance(NUOPCMediator__ModelAdvance object) {
				return createNUOPCMediator__ModelAdvanceAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Top <em>Top</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Top
	 * @generated
	 */
	public Adapter createTopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication
	 * @generated
	 */
	public Adapter createNUOPCApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel
	 * @generated
	 */
	public Adapter createNUOPCModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__GenericImports <em>Model Generic Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__GenericImports
	 * @generated
	 */
	public Adapter createNUOPCModel__GenericImportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init <em>Model Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init
	 * @generated
	 */
	public Adapter createNUOPCModel__InitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices <em>Model Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices
	 * @generated
	 */
	public Adapter createNUOPCModel__ImplementsSetServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1 <em>Model Implements Init P1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1
	 * @generated
	 */
	public Adapter createNUOPCModel__ImplementsInitP1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2 <em>Model Implements Init P2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2
	 * @generated
	 */
	public Adapter createNUOPCModel__ImplementsInitP2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField <em>Model Advertises Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField
	 * @generated
	 */
	public Adapter createNUOPCModel__AdvertisesImportFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField <em>Model Advertises Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField
	 * @generated
	 */
	public Adapter createNUOPCModel__AdvertisesExportFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesImportField <em>Model Realizes Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesImportField
	 * @generated
	 */
	public Adapter createNUOPCModel__RealizesImportFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesExportField <em>Model Realizes Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesExportField
	 * @generated
	 */
	public Adapter createNUOPCModel__RealizesExportFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance <em>Model Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance
	 * @generated
	 */
	public Adapter createNUOPCModel__ModelAdvanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance__ImplementsSubroutine <em>Model Model Advance Implements Subroutine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance__ImplementsSubroutine
	 * @generated
	 */
	public Adapter createNUOPCModel__ModelAdvance__ImplementsSubroutineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance__Attached <em>Model Model Advance Attached</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance__Attached
	 * @generated
	 */
	public Adapter createNUOPCModel__ModelAdvance__AttachedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver
	 * @generated
	 */
	public Adapter createNUOPCDriverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__GenericImports <em>Driver Generic Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__GenericImports
	 * @generated
	 */
	public Adapter createNUOPCDriver__GenericImportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports <em>Driver Model Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports
	 * @generated
	 */
	public Adapter createNUOPCDriver__ModelImportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports__ModelImport <em>Driver Model Imports Model Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports__ModelImport
	 * @generated
	 */
	public Adapter createNUOPCDriver__ModelImports__ModelImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports <em>Driver Connector Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports
	 * @generated
	 */
	public Adapter createNUOPCDriver__ConnectorImportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport <em>Driver Connector Imports Connector Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport
	 * @generated
	 */
	public Adapter createNUOPCDriver__ConnectorImports__ConnectorImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices <em>Driver Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices
	 * @generated
	 */
	public Adapter createNUOPCDriver__ImplementsSetServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount <em>Driver Implements Set Model Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount
	 * @generated
	 */
	public Adapter createNUOPCDriver__ImplementsSetModelCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices <em>Driver Implements Set Model Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices
	 * @generated
	 */
	public Adapter createNUOPCDriver__ImplementsSetModelServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn <em>Driver Atm Ocn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn
	 * @generated
	 */
	public Adapter createNUOPCDriverAtmOcnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports <em>Driver Atm Ocn Generic Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports
	 * @generated
	 */
	public Adapter createNUOPCDriverAtmOcn__GenericImportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports <em>Driver Atm Ocn Model Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports
	 * @generated
	 */
	public Adapter createNUOPCDriverAtmOcn__ModelImportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices <em>Driver Atm Ocn Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices
	 * @generated
	 */
	public Adapter createNUOPCDriverAtmOcn__ImplementsSetServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount <em>Driver Atm Ocn Implements Set Model Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount
	 * @generated
	 */
	public Adapter createNUOPCDriverAtmOcn__ImplementsSetModelCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices <em>Driver Atm Ocn Implements Set Model Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices
	 * @generated
	 */
	public Adapter createNUOPCDriverAtmOcn__ImplementsSetModelServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelPetLists <em>Driver Atm Ocn Implements Set Model Pet Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelPetLists
	 * @generated
	 */
	public Adapter createNUOPCDriverAtmOcn__ImplementsSetModelPetListsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports__ModelImport <em>Driver Atm Ocn Model Imports Model Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports__ModelImport
	 * @generated
	 */
	public Adapter createNUOPCDriverAtmOcn__ModelImports__ModelImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsGenericSetServices <em>Calls Generic Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsGenericSetServices
	 * @generated
	 */
	public Adapter createCallsGenericSetServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsSetEntryPoint <em>Calls Set Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsSetEntryPoint
	 * @generated
	 */
	public Adapter createCallsSetEntryPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod <em>Attaches Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod
	 * @generated
	 */
	public Adapter createAttachesMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetModelServices <em>Set Model Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetModelServices
	 * @generated
	 */
	public Adapter createSetModelServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetCouplerServices <em>Set Coupler Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetCouplerServices
	 * @generated
	 */
	public Adapter createSetCouplerServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.GetsInternalState <em>Gets Internal State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.GetsInternalState
	 * @generated
	 */
	public Adapter createGetsInternalStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator <em>Mediator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator
	 * @generated
	 */
	public Adapter createNUOPCMediatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__GenericImports <em>Mediator Generic Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__GenericImports
	 * @generated
	 */
	public Adapter createNUOPCMediator__GenericImportsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__Init <em>Mediator Init</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__Init
	 * @generated
	 */
	public Adapter createNUOPCMediator__InitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices <em>Mediator Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices
	 * @generated
	 */
	public Adapter createNUOPCMediator__ImplementsSetServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1 <em>Mediator Implements Init P1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1
	 * @generated
	 */
	public Adapter createNUOPCMediator__ImplementsInitP1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2 <em>Mediator Implements Init P2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2
	 * @generated
	 */
	public Adapter createNUOPCMediator__ImplementsInitP2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesImportField <em>Mediator Advertises Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesImportField
	 * @generated
	 */
	public Adapter createNUOPCMediator__AdvertisesImportFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField <em>Mediator Advertises Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField
	 * @generated
	 */
	public Adapter createNUOPCMediator__AdvertisesExportFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesImportField <em>Mediator Realizes Import Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesImportField
	 * @generated
	 */
	public Adapter createNUOPCMediator__RealizesImportFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesExportField <em>Mediator Realizes Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesExportField
	 * @generated
	 */
	public Adapter createNUOPCMediator__RealizesExportFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance <em>Mediator Model Advance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance
	 * @generated
	 */
	public Adapter createNUOPCMediator__ModelAdvanceAdapter() {
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

} //NUOPCAdapterFactory
