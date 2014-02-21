/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.*;

import org.eclipse.emf.ecore.EClass;
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
public class NUOPCFactoryImpl extends EFactoryImpl implements NUOPCFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NUOPCFactory init() {
		try {
			NUOPCFactory theNUOPCFactory = (NUOPCFactory)EPackage.Registry.INSTANCE.getEFactory(NUOPCPackage.eNS_URI);
			if (theNUOPCFactory != null) {
				return theNUOPCFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NUOPCFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCFactoryImpl() {
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
			case NUOPCPackage.TOP: return createTop();
			case NUOPCPackage.NUOPC_APPLICATION: return createNUOPCApplication();
			case NUOPCPackage.NUOPC_MODEL: return createNUOPCModel();
			case NUOPCPackage.NUOPC_MODEL_GENERIC_IMPORTS: return createNUOPCModel__GenericImports();
			case NUOPCPackage.NUOPC_MODEL_INIT: return createNUOPCModel__Init();
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES: return createNUOPCModel__ImplementsSetServices();
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_INIT_P1: return createNUOPCModel__ImplementsInitP1();
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_INIT_P2: return createNUOPCModel__ImplementsInitP2();
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_IMPORT_FIELD: return createNUOPCModel__AdvertisesImportField();
			case NUOPCPackage.NUOPC_MODEL_ADVERTISES_EXPORT_FIELD: return createNUOPCModel__AdvertisesExportField();
			case NUOPCPackage.NUOPC_MODEL_REALIZES_IMPORT_FIELD: return createNUOPCModel__RealizesImportField();
			case NUOPCPackage.NUOPC_MODEL_REALIZES_EXPORT_FIELD: return createNUOPCModel__RealizesExportField();
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE: return createNUOPCModel__ModelAdvance();
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE_IMPLEMENTS_SUBROUTINE: return createNUOPCModel__ModelAdvance__ImplementsSubroutine();
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE_ATTACHED: return createNUOPCModel__ModelAdvance__Attached();
			case NUOPCPackage.NUOPC_DRIVER: return createNUOPCDriver();
			case NUOPCPackage.NUOPC_DRIVER_GENERIC_IMPORTS: return createNUOPCDriver__GenericImports();
			case NUOPCPackage.NUOPC_DRIVER_MODEL_IMPORTS: return createNUOPCDriver__ModelImports();
			case NUOPCPackage.NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT: return createNUOPCDriver__ModelImports__ModelImport();
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS: return createNUOPCDriver__ConnectorImports();
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT: return createNUOPCDriver__ConnectorImports__ConnectorImport();
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES: return createNUOPCDriver__ImplementsSetServices();
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT: return createNUOPCDriver__ImplementsSetModelCount();
			case NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES: return createNUOPCDriver__ImplementsSetModelServices();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN: return createNUOPCDriverAtmOcn();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS: return createNUOPCDriverAtmOcn__GenericImports();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS: return createNUOPCDriverAtmOcn__ModelImports();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES: return createNUOPCDriverAtmOcn__ImplementsSetServices();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT: return createNUOPCDriverAtmOcn__ImplementsSetModelCount();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES: return createNUOPCDriverAtmOcn__ImplementsSetModelServices();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_PET_LISTS: return createNUOPCDriverAtmOcn__ImplementsSetModelPetLists();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT: return createNUOPCDriverAtmOcn__ModelImports__ModelImport();
			case NUOPCPackage.CALLS_GENERIC_SET_SERVICES: return createCallsGenericSetServices();
			case NUOPCPackage.CALLS_SET_ENTRY_POINT: return createCallsSetEntryPoint();
			case NUOPCPackage.ATTACHES_METHOD: return createAttachesMethod();
			case NUOPCPackage.SET_MODEL_SERVICES: return createSetModelServices();
			case NUOPCPackage.SET_COUPLER_SERVICES: return createSetCouplerServices();
			case NUOPCPackage.GETS_INTERNAL_STATE: return createGetsInternalState();
			case NUOPCPackage.NUOPC_MEDIATOR: return createNUOPCMediator();
			case NUOPCPackage.NUOPC_MEDIATOR_GENERIC_IMPORTS: return createNUOPCMediator__GenericImports();
			case NUOPCPackage.NUOPC_MEDIATOR_INIT: return createNUOPCMediator__Init();
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES: return createNUOPCMediator__ImplementsSetServices();
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1: return createNUOPCMediator__ImplementsInitP1();
			case NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2: return createNUOPCMediator__ImplementsInitP2();
			case NUOPCPackage.NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD: return createNUOPCMediator__AdvertisesImportField();
			case NUOPCPackage.NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD: return createNUOPCMediator__AdvertisesExportField();
			case NUOPCPackage.NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD: return createNUOPCMediator__RealizesImportField();
			case NUOPCPackage.NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD: return createNUOPCMediator__RealizesExportField();
			case NUOPCPackage.NUOPC_MEDIATOR_MODEL_ADVANCE: return createNUOPCMediator__ModelAdvance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Top createTop() {
		TopImpl top = new TopImpl();
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCApplication createNUOPCApplication() {
		NUOPCApplicationImpl nuopcApplication = new NUOPCApplicationImpl();
		return nuopcApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel createNUOPCModel() {
		NUOPCModelImpl nuopcModel = new NUOPCModelImpl();
		return nuopcModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel__GenericImports createNUOPCModel__GenericImports() {
		NUOPCModel__GenericImportsImpl nuopcModel__GenericImports = new NUOPCModel__GenericImportsImpl();
		return nuopcModel__GenericImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel__Init createNUOPCModel__Init() {
		NUOPCModel__InitImpl nuopcModel__Init = new NUOPCModel__InitImpl();
		return nuopcModel__Init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel__ImplementsSetServices createNUOPCModel__ImplementsSetServices() {
		NUOPCModel__ImplementsSetServicesImpl nuopcModel__ImplementsSetServices = new NUOPCModel__ImplementsSetServicesImpl();
		return nuopcModel__ImplementsSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel__ImplementsInitP1 createNUOPCModel__ImplementsInitP1() {
		NUOPCModel__ImplementsInitP1Impl nuopcModel__ImplementsInitP1 = new NUOPCModel__ImplementsInitP1Impl();
		return nuopcModel__ImplementsInitP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel__ImplementsInitP2 createNUOPCModel__ImplementsInitP2() {
		NUOPCModel__ImplementsInitP2Impl nuopcModel__ImplementsInitP2 = new NUOPCModel__ImplementsInitP2Impl();
		return nuopcModel__ImplementsInitP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel__AdvertisesImportField createNUOPCModel__AdvertisesImportField() {
		NUOPCModel__AdvertisesImportFieldImpl nuopcModel__AdvertisesImportField = new NUOPCModel__AdvertisesImportFieldImpl();
		return nuopcModel__AdvertisesImportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel__AdvertisesExportField createNUOPCModel__AdvertisesExportField() {
		NUOPCModel__AdvertisesExportFieldImpl nuopcModel__AdvertisesExportField = new NUOPCModel__AdvertisesExportFieldImpl();
		return nuopcModel__AdvertisesExportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel__RealizesImportField createNUOPCModel__RealizesImportField() {
		NUOPCModel__RealizesImportFieldImpl nuopcModel__RealizesImportField = new NUOPCModel__RealizesImportFieldImpl();
		return nuopcModel__RealizesImportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel__RealizesExportField createNUOPCModel__RealizesExportField() {
		NUOPCModel__RealizesExportFieldImpl nuopcModel__RealizesExportField = new NUOPCModel__RealizesExportFieldImpl();
		return nuopcModel__RealizesExportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel__ModelAdvance createNUOPCModel__ModelAdvance() {
		NUOPCModel__ModelAdvanceImpl nuopcModel__ModelAdvance = new NUOPCModel__ModelAdvanceImpl();
		return nuopcModel__ModelAdvance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel__ModelAdvance__ImplementsSubroutine createNUOPCModel__ModelAdvance__ImplementsSubroutine() {
		NUOPCModel__ModelAdvance__ImplementsSubroutineImpl nuopcModel__ModelAdvance__ImplementsSubroutine = new NUOPCModel__ModelAdvance__ImplementsSubroutineImpl();
		return nuopcModel__ModelAdvance__ImplementsSubroutine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel__ModelAdvance__Attached createNUOPCModel__ModelAdvance__Attached() {
		NUOPCModel__ModelAdvance__AttachedImpl nuopcModel__ModelAdvance__Attached = new NUOPCModel__ModelAdvance__AttachedImpl();
		return nuopcModel__ModelAdvance__Attached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver createNUOPCDriver() {
		NUOPCDriverImpl nuopcDriver = new NUOPCDriverImpl();
		return nuopcDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__GenericImports createNUOPCDriver__GenericImports() {
		NUOPCDriver__GenericImportsImpl nuopcDriver__GenericImports = new NUOPCDriver__GenericImportsImpl();
		return nuopcDriver__GenericImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__ModelImports createNUOPCDriver__ModelImports() {
		NUOPCDriver__ModelImportsImpl nuopcDriver__ModelImports = new NUOPCDriver__ModelImportsImpl();
		return nuopcDriver__ModelImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__ModelImports__ModelImport createNUOPCDriver__ModelImports__ModelImport() {
		NUOPCDriver__ModelImports__ModelImportImpl nuopcDriver__ModelImports__ModelImport = new NUOPCDriver__ModelImports__ModelImportImpl();
		return nuopcDriver__ModelImports__ModelImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__ConnectorImports createNUOPCDriver__ConnectorImports() {
		NUOPCDriver__ConnectorImportsImpl nuopcDriver__ConnectorImports = new NUOPCDriver__ConnectorImportsImpl();
		return nuopcDriver__ConnectorImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__ConnectorImports__ConnectorImport createNUOPCDriver__ConnectorImports__ConnectorImport() {
		NUOPCDriver__ConnectorImports__ConnectorImportImpl nuopcDriver__ConnectorImports__ConnectorImport = new NUOPCDriver__ConnectorImports__ConnectorImportImpl();
		return nuopcDriver__ConnectorImports__ConnectorImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__ImplementsSetServices createNUOPCDriver__ImplementsSetServices() {
		NUOPCDriver__ImplementsSetServicesImpl nuopcDriver__ImplementsSetServices = new NUOPCDriver__ImplementsSetServicesImpl();
		return nuopcDriver__ImplementsSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__ImplementsSetModelCount createNUOPCDriver__ImplementsSetModelCount() {
		NUOPCDriver__ImplementsSetModelCountImpl nuopcDriver__ImplementsSetModelCount = new NUOPCDriver__ImplementsSetModelCountImpl();
		return nuopcDriver__ImplementsSetModelCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__ImplementsSetModelServices createNUOPCDriver__ImplementsSetModelServices() {
		NUOPCDriver__ImplementsSetModelServicesImpl nuopcDriver__ImplementsSetModelServices = new NUOPCDriver__ImplementsSetModelServicesImpl();
		return nuopcDriver__ImplementsSetModelServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn createNUOPCDriverAtmOcn() {
		NUOPCDriverAtmOcnImpl nuopcDriverAtmOcn = new NUOPCDriverAtmOcnImpl();
		return nuopcDriverAtmOcn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn__GenericImports createNUOPCDriverAtmOcn__GenericImports() {
		NUOPCDriverAtmOcn__GenericImportsImpl nuopcDriverAtmOcn__GenericImports = new NUOPCDriverAtmOcn__GenericImportsImpl();
		return nuopcDriverAtmOcn__GenericImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn__ModelImports createNUOPCDriverAtmOcn__ModelImports() {
		NUOPCDriverAtmOcn__ModelImportsImpl nuopcDriverAtmOcn__ModelImports = new NUOPCDriverAtmOcn__ModelImportsImpl();
		return nuopcDriverAtmOcn__ModelImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn__ImplementsSetServices createNUOPCDriverAtmOcn__ImplementsSetServices() {
		NUOPCDriverAtmOcn__ImplementsSetServicesImpl nuopcDriverAtmOcn__ImplementsSetServices = new NUOPCDriverAtmOcn__ImplementsSetServicesImpl();
		return nuopcDriverAtmOcn__ImplementsSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn__ImplementsSetModelCount createNUOPCDriverAtmOcn__ImplementsSetModelCount() {
		NUOPCDriverAtmOcn__ImplementsSetModelCountImpl nuopcDriverAtmOcn__ImplementsSetModelCount = new NUOPCDriverAtmOcn__ImplementsSetModelCountImpl();
		return nuopcDriverAtmOcn__ImplementsSetModelCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn__ImplementsSetModelServices createNUOPCDriverAtmOcn__ImplementsSetModelServices() {
		NUOPCDriverAtmOcn__ImplementsSetModelServicesImpl nuopcDriverAtmOcn__ImplementsSetModelServices = new NUOPCDriverAtmOcn__ImplementsSetModelServicesImpl();
		return nuopcDriverAtmOcn__ImplementsSetModelServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn__ImplementsSetModelPetLists createNUOPCDriverAtmOcn__ImplementsSetModelPetLists() {
		NUOPCDriverAtmOcn__ImplementsSetModelPetListsImpl nuopcDriverAtmOcn__ImplementsSetModelPetLists = new NUOPCDriverAtmOcn__ImplementsSetModelPetListsImpl();
		return nuopcDriverAtmOcn__ImplementsSetModelPetLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn__ModelImports__ModelImport createNUOPCDriverAtmOcn__ModelImports__ModelImport() {
		NUOPCDriverAtmOcn__ModelImports__ModelImportImpl nuopcDriverAtmOcn__ModelImports__ModelImport = new NUOPCDriverAtmOcn__ModelImports__ModelImportImpl();
		return nuopcDriverAtmOcn__ModelImports__ModelImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallsGenericSetServices createCallsGenericSetServices() {
		CallsGenericSetServicesImpl callsGenericSetServices = new CallsGenericSetServicesImpl();
		return callsGenericSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallsSetEntryPoint createCallsSetEntryPoint() {
		CallsSetEntryPointImpl callsSetEntryPoint = new CallsSetEntryPointImpl();
		return callsSetEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachesMethod createAttachesMethod() {
		AttachesMethodImpl attachesMethod = new AttachesMethodImpl();
		return attachesMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetModelServices createSetModelServices() {
		SetModelServicesImpl setModelServices = new SetModelServicesImpl();
		return setModelServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetCouplerServices createSetCouplerServices() {
		SetCouplerServicesImpl setCouplerServices = new SetCouplerServicesImpl();
		return setCouplerServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetsInternalState createGetsInternalState() {
		GetsInternalStateImpl getsInternalState = new GetsInternalStateImpl();
		return getsInternalState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator createNUOPCMediator() {
		NUOPCMediatorImpl nuopcMediator = new NUOPCMediatorImpl();
		return nuopcMediator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator__GenericImports createNUOPCMediator__GenericImports() {
		NUOPCMediator__GenericImportsImpl nuopcMediator__GenericImports = new NUOPCMediator__GenericImportsImpl();
		return nuopcMediator__GenericImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator__Init createNUOPCMediator__Init() {
		NUOPCMediator__InitImpl nuopcMediator__Init = new NUOPCMediator__InitImpl();
		return nuopcMediator__Init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator__ImplementsSetServices createNUOPCMediator__ImplementsSetServices() {
		NUOPCMediator__ImplementsSetServicesImpl nuopcMediator__ImplementsSetServices = new NUOPCMediator__ImplementsSetServicesImpl();
		return nuopcMediator__ImplementsSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator__ImplementsInitP1 createNUOPCMediator__ImplementsInitP1() {
		NUOPCMediator__ImplementsInitP1Impl nuopcMediator__ImplementsInitP1 = new NUOPCMediator__ImplementsInitP1Impl();
		return nuopcMediator__ImplementsInitP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator__ImplementsInitP2 createNUOPCMediator__ImplementsInitP2() {
		NUOPCMediator__ImplementsInitP2Impl nuopcMediator__ImplementsInitP2 = new NUOPCMediator__ImplementsInitP2Impl();
		return nuopcMediator__ImplementsInitP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator__AdvertisesImportField createNUOPCMediator__AdvertisesImportField() {
		NUOPCMediator__AdvertisesImportFieldImpl nuopcMediator__AdvertisesImportField = new NUOPCMediator__AdvertisesImportFieldImpl();
		return nuopcMediator__AdvertisesImportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator__AdvertisesExportField createNUOPCMediator__AdvertisesExportField() {
		NUOPCMediator__AdvertisesExportFieldImpl nuopcMediator__AdvertisesExportField = new NUOPCMediator__AdvertisesExportFieldImpl();
		return nuopcMediator__AdvertisesExportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator__RealizesImportField createNUOPCMediator__RealizesImportField() {
		NUOPCMediator__RealizesImportFieldImpl nuopcMediator__RealizesImportField = new NUOPCMediator__RealizesImportFieldImpl();
		return nuopcMediator__RealizesImportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator__RealizesExportField createNUOPCMediator__RealizesExportField() {
		NUOPCMediator__RealizesExportFieldImpl nuopcMediator__RealizesExportField = new NUOPCMediator__RealizesExportFieldImpl();
		return nuopcMediator__RealizesExportField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator__ModelAdvance createNUOPCMediator__ModelAdvance() {
		NUOPCMediator__ModelAdvanceImpl nuopcMediator__ModelAdvance = new NUOPCMediator__ModelAdvanceImpl();
		return nuopcMediator__ModelAdvance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCPackage getNUOPCPackage() {
		return (NUOPCPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NUOPCPackage getPackage() {
		return NUOPCPackage.eINSTANCE;
	}

} //NUOPCFactoryImpl
