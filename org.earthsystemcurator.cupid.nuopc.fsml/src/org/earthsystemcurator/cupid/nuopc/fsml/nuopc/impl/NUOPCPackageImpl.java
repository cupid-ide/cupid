/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsGenericSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsSetEntryPoint;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.GetsInternalState;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelPetLists;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports__ModelImport;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__GenericImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports__ModelImport;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesExportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__AdvertisesImportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__GenericImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__Init;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesExportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__RealizesImportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesExportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__AdvertisesImportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__GenericImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP1;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsInitP2;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsModelAdvance;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__Init;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance__Attached;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance__ImplementsSubroutine;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesExportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__RealizesImportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetCouplerServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetModelServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Top;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.util.NUOPCValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class NUOPCPackageImpl extends EPackageImpl implements NUOPCPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcModel__GenericImportsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcModel__InitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcModel__ImplementsSetServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcModel__ImplementsInitP1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcModel__ImplementsInitP2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcModel__AdvertisesImportFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcModel__AdvertisesExportFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcModel__RealizesImportFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcModel__RealizesExportFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcModel__ImplementsModelAdvanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcModel__ModelAdvanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcModel__ModelAdvance__ImplementsSubroutineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcModel__ModelAdvance__AttachedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriver__GenericImportsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriver__ModelImportsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriver__ModelImports__ModelImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriver__ConnectorImportsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriver__ConnectorImports__ConnectorImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriver__ImplementsSetServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriver__ImplementsSetModelCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriver__ImplementsSetModelServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriverAtmOcnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriverAtmOcn__GenericImportsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriverAtmOcn__ModelImportsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriverAtmOcn__ImplementsSetServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriverAtmOcn__ImplementsSetModelCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriverAtmOcn__ImplementsSetModelServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcDriverAtmOcn__ModelImports__ModelImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callsGenericSetServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callsSetEntryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attachesMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setModelServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setCouplerServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getsInternalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcMediatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcMediator__GenericImportsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcMediator__InitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcMediator__ImplementsSetServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcMediator__ImplementsInitP1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcMediator__ImplementsInitP2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcMediator__AdvertisesImportFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcMediator__AdvertisesExportFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcMediator__RealizesImportFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcMediator__RealizesExportFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcMediator__ModelAdvanceEClass = null;

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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NUOPCPackageImpl() {
		super(eNS_URI, NUOPCFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link NUOPCPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NUOPCPackage init() {
		if (isInited) return (NUOPCPackage)EPackage.Registry.INSTANCE.getEPackage(NUOPCPackage.eNS_URI);

		// Obtain or create and register package
		NUOPCPackageImpl theNUOPCPackage = (NUOPCPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NUOPCPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NUOPCPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theNUOPCPackage.createPackageContents();

		// Initialize created meta-data
		theNUOPCPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theNUOPCPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return NUOPCValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theNUOPCPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NUOPCPackage.eNS_URI, theNUOPCPackage);
		return theNUOPCPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTop() {
		return topEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTop_Apps() {
		return (EReference)topEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCApplication() {
		return nuopcApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCApplication_Name() {
		return (EAttribute)nuopcApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCApplication_NuopcModel() {
		return (EReference)nuopcApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCApplication_NuopcDriver() {
		return (EReference)nuopcApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCApplication_NuopcDriverAtmOcn() {
		return (EReference)nuopcApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCApplication_NuopcMediator() {
		return (EReference)nuopcApplicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCModel() {
		return nuopcModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel_Name() {
		return (EAttribute)nuopcModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel_GenericImports() {
		return (EReference)nuopcModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel_ImplementsSetServices() {
		return (EReference)nuopcModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel_Initialize() {
		return (EReference)nuopcModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel_ImplementsModelAdvance() {
		return (EReference)nuopcModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel_ModelAdvance() {
		return (EReference)nuopcModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCModel__GenericImports() {
		return nuopcModel__GenericImportsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__GenericImports_ImportsGenericSS() {
		return (EAttribute)nuopcModel__GenericImportsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__GenericImports_ImportsLabelModelAdvance() {
		return (EAttribute)nuopcModel__GenericImportsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCModel__Init() {
		return nuopcModel__InitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__Init_Parent() {
		return (EReference)nuopcModel__InitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__Init_ImplementsInitP1() {
		return (EReference)nuopcModel__InitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__Init_ImplementsInitP2() {
		return (EReference)nuopcModel__InitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCModel__ImplementsSetServices() {
		return nuopcModel__ImplementsSetServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__ImplementsSetServices_Parent() {
		return (EReference)nuopcModel__ImplementsSetServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsSetServices_Name() {
		return (EAttribute)nuopcModel__ImplementsSetServicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsSetServices_Gcomp() {
		return (EAttribute)nuopcModel__ImplementsSetServicesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsSetServices_Rc() {
		return (EAttribute)nuopcModel__ImplementsSetServicesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__ImplementsSetServices_CallsGenericSetServices() {
		return (EReference)nuopcModel__ImplementsSetServicesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__ImplementsSetServices_CallsSetEntryPoint() {
		return (EReference)nuopcModel__ImplementsSetServicesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__ImplementsSetServices_AttachesMethod() {
		return (EReference)nuopcModel__ImplementsSetServicesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCModel__ImplementsInitP1() {
		return nuopcModel__ImplementsInitP1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__ImplementsInitP1_Parent() {
		return (EReference)nuopcModel__ImplementsInitP1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsInitP1_Name() {
		return (EAttribute)nuopcModel__ImplementsInitP1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsInitP1_ImportParam() {
		return (EAttribute)nuopcModel__ImplementsInitP1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsInitP1_ExportParam() {
		return (EAttribute)nuopcModel__ImplementsInitP1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__ImplementsInitP1_AdvertisesImportField() {
		return (EReference)nuopcModel__ImplementsInitP1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__ImplementsInitP1_AdvertisesExportField() {
		return (EReference)nuopcModel__ImplementsInitP1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsInitP1_AdvertisesAtLeastOneField() {
		return (EAttribute)nuopcModel__ImplementsInitP1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsInitP1_RegisteredInSetServices() {
		return (EAttribute)nuopcModel__ImplementsInitP1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsInitP1_AdvertisesOrRegistered() {
		return (EAttribute)nuopcModel__ImplementsInitP1EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCModel__ImplementsInitP2() {
		return nuopcModel__ImplementsInitP2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__ImplementsInitP2_Parent() {
		return (EReference)nuopcModel__ImplementsInitP2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsInitP2_Name() {
		return (EAttribute)nuopcModel__ImplementsInitP2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsInitP2_ImportParam() {
		return (EAttribute)nuopcModel__ImplementsInitP2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsInitP2_ExportParam() {
		return (EAttribute)nuopcModel__ImplementsInitP2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__ImplementsInitP2_RealizesImportField() {
		return (EReference)nuopcModel__ImplementsInitP2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__ImplementsInitP2_RealizesExportField() {
		return (EReference)nuopcModel__ImplementsInitP2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsInitP2_RealizesAtLeastOneField() {
		return (EAttribute)nuopcModel__ImplementsInitP2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsInitP2_RegisteredInSetServices() {
		return (EAttribute)nuopcModel__ImplementsInitP2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsInitP2_RealizesOrRegistered() {
		return (EAttribute)nuopcModel__ImplementsInitP2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCModel__AdvertisesImportField() {
		return nuopcModel__AdvertisesImportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__AdvertisesImportField_Parent() {
		return (EReference)nuopcModel__AdvertisesImportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__AdvertisesImportField_AddsToState() {
		return (EAttribute)nuopcModel__AdvertisesImportFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__AdvertisesImportField_Rc() {
		return (EAttribute)nuopcModel__AdvertisesImportFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__AdvertisesImportField_AddsToImportState() {
		return (EAttribute)nuopcModel__AdvertisesImportFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__AdvertisesImportField_StandardName() {
		return (EAttribute)nuopcModel__AdvertisesImportFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCModel__AdvertisesExportField() {
		return nuopcModel__AdvertisesExportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__AdvertisesExportField_Parent() {
		return (EReference)nuopcModel__AdvertisesExportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__AdvertisesExportField_Rc() {
		return (EAttribute)nuopcModel__AdvertisesExportFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__AdvertisesExportField_AddsToState() {
		return (EAttribute)nuopcModel__AdvertisesExportFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__AdvertisesExportField_AddsToExportState() {
		return (EAttribute)nuopcModel__AdvertisesExportFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__AdvertisesExportField_StandardName() {
		return (EAttribute)nuopcModel__AdvertisesExportFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCModel__RealizesImportField() {
		return nuopcModel__RealizesImportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__RealizesImportField_Parent() {
		return (EReference)nuopcModel__RealizesImportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__RealizesImportField_RealizedInState() {
		return (EAttribute)nuopcModel__RealizesImportFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__RealizesImportField_Rc() {
		return (EAttribute)nuopcModel__RealizesImportFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__RealizesImportField_RealizedInImportState() {
		return (EAttribute)nuopcModel__RealizesImportFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__RealizesImportField_Field() {
		return (EAttribute)nuopcModel__RealizesImportFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCModel__RealizesExportField() {
		return nuopcModel__RealizesExportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__RealizesExportField_Parent() {
		return (EReference)nuopcModel__RealizesExportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__RealizesExportField_RealizedInState() {
		return (EAttribute)nuopcModel__RealizesExportFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__RealizesExportField_Rc() {
		return (EAttribute)nuopcModel__RealizesExportFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__RealizesExportField_RealizedInExportState() {
		return (EAttribute)nuopcModel__RealizesExportFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__RealizesExportField_Field() {
		return (EAttribute)nuopcModel__RealizesExportFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCModel__ImplementsModelAdvance() {
		return nuopcModel__ImplementsModelAdvanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__ImplementsModelAdvance_Parent() {
		return (EReference)nuopcModel__ImplementsModelAdvanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsModelAdvance_Name() {
		return (EAttribute)nuopcModel__ImplementsModelAdvanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ImplementsModelAdvance_AttachedModelAdvance() {
		return (EAttribute)nuopcModel__ImplementsModelAdvanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCModel__ModelAdvance() {
		return nuopcModel__ModelAdvanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__ModelAdvance_Parent() {
		return (EReference)nuopcModel__ModelAdvanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__ModelAdvance_ImplementsSubroutine() {
		return (EReference)nuopcModel__ModelAdvanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCModel__ModelAdvance_Attached() {
		return (EReference)nuopcModel__ModelAdvanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCModel__ModelAdvance__ImplementsSubroutine() {
		return nuopcModel__ModelAdvance__ImplementsSubroutineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ModelAdvance__ImplementsSubroutine_Name() {
		return (EAttribute)nuopcModel__ModelAdvance__ImplementsSubroutineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCModel__ModelAdvance__Attached() {
		return nuopcModel__ModelAdvance__AttachedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCModel__ModelAdvance__Attached_Name() {
		return (EAttribute)nuopcModel__ModelAdvance__AttachedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriver() {
		return nuopcDriverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver_Parent() {
		return (EReference)nuopcDriverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver_Name() {
		return (EAttribute)nuopcDriverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver_GenericImports() {
		return (EReference)nuopcDriverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver_ModelImports() {
		return (EReference)nuopcDriverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver_ConnectorImports() {
		return (EReference)nuopcDriverEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver_ImplementsSetServices() {
		return (EReference)nuopcDriverEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver_ImplementsSetModelCount() {
		return (EReference)nuopcDriverEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver_ImplementsSetModelServices() {
		return (EReference)nuopcDriverEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriver__GenericImports() {
		return nuopcDriver__GenericImportsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__GenericImports_ImportsGenericSS() {
		return (EAttribute)nuopcDriver__GenericImportsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__GenericImports_ImportsTypeDriverIS() {
		return (EAttribute)nuopcDriver__GenericImportsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__GenericImports_ImportsLabelSetModelCount() {
		return (EAttribute)nuopcDriver__GenericImportsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__GenericImports_ImportsLabelSetModelServices() {
		return (EAttribute)nuopcDriver__GenericImportsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriver__ModelImports() {
		return nuopcDriver__ModelImportsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver__ModelImports_Parent() {
		return (EReference)nuopcDriver__ModelImportsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver__ModelImports_ModelImport() {
		return (EReference)nuopcDriver__ModelImportsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriver__ModelImports__ModelImport() {
		return nuopcDriver__ModelImports__ModelImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver__ModelImports__ModelImport_Parent() {
		return (EReference)nuopcDriver__ModelImports__ModelImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ModelImports__ModelImport_Name() {
		return (EAttribute)nuopcDriver__ModelImports__ModelImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ModelImports__ModelImport_SetServices() {
		return (EAttribute)nuopcDriver__ModelImports__ModelImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver__ModelImports__ModelImport_ModelRef() {
		return (EReference)nuopcDriver__ModelImports__ModelImportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriver__ConnectorImports() {
		return nuopcDriver__ConnectorImportsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver__ConnectorImports_Parent() {
		return (EReference)nuopcDriver__ConnectorImportsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver__ConnectorImports_ConnectorImport() {
		return (EReference)nuopcDriver__ConnectorImportsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriver__ConnectorImports__ConnectorImport() {
		return nuopcDriver__ConnectorImports__ConnectorImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver__ConnectorImports__ConnectorImport_Parent() {
		return (EReference)nuopcDriver__ConnectorImports__ConnectorImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ConnectorImports__ConnectorImport_Name() {
		return (EAttribute)nuopcDriver__ConnectorImports__ConnectorImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ConnectorImports__ConnectorImport_SetServices() {
		return (EAttribute)nuopcDriver__ConnectorImports__ConnectorImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriver__ImplementsSetServices() {
		return nuopcDriver__ImplementsSetServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver__ImplementsSetServices_Parent() {
		return (EReference)nuopcDriver__ImplementsSetServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ImplementsSetServices_Name() {
		return (EAttribute)nuopcDriver__ImplementsSetServicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ImplementsSetServices_Param_gcomp() {
		return (EAttribute)nuopcDriver__ImplementsSetServicesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ImplementsSetServices_Param_rc() {
		return (EAttribute)nuopcDriver__ImplementsSetServicesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver__ImplementsSetServices_CallsGenericSetServices() {
		return (EReference)nuopcDriver__ImplementsSetServicesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver__ImplementsSetServices_AttachesMethod() {
		return (EReference)nuopcDriver__ImplementsSetServicesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriver__ImplementsSetModelCount() {
		return nuopcDriver__ImplementsSetModelCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver__ImplementsSetModelCount_Parent() {
		return (EReference)nuopcDriver__ImplementsSetModelCountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ImplementsSetModelCount_Gcomp() {
		return (EAttribute)nuopcDriver__ImplementsSetModelCountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ImplementsSetModelCount_Rc() {
		return (EAttribute)nuopcDriver__ImplementsSetModelCountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ImplementsSetModelCount_Name() {
		return (EAttribute)nuopcDriver__ImplementsSetModelCountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ImplementsSetModelCount_DriverInternalState() {
		return (EAttribute)nuopcDriver__ImplementsSetModelCountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver__ImplementsSetModelCount_GetsInternalState() {
		return (EReference)nuopcDriver__ImplementsSetModelCountEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ImplementsSetModelCount_AssignsValue() {
		return (EAttribute)nuopcDriver__ImplementsSetModelCountEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ImplementsSetModelCount_Attached() {
		return (EAttribute)nuopcDriver__ImplementsSetModelCountEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriver__ImplementsSetModelServices() {
		return nuopcDriver__ImplementsSetModelServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver__ImplementsSetModelServices_Parent() {
		return (EReference)nuopcDriver__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ImplementsSetModelServices_Gcomp() {
		return (EAttribute)nuopcDriver__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ImplementsSetModelServices_Rc() {
		return (EAttribute)nuopcDriver__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ImplementsSetModelServices_Name() {
		return (EAttribute)nuopcDriver__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ImplementsSetModelServices_DriverInternalState() {
		return (EAttribute)nuopcDriver__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver__ImplementsSetModelServices_GetsInternalState() {
		return (EReference)nuopcDriver__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ImplementsSetModelServices_AssignsValue() {
		return (EAttribute)nuopcDriver__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriver__ImplementsSetModelServices_Attached() {
		return (EAttribute)nuopcDriver__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver__ImplementsSetModelServices_SetModelServices() {
		return (EReference)nuopcDriver__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver__ImplementsSetModelServices_SetCouplerServices() {
		return (EReference)nuopcDriver__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriverAtmOcn() {
		return nuopcDriverAtmOcnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn_Parent() {
		return (EReference)nuopcDriverAtmOcnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn_Name() {
		return (EAttribute)nuopcDriverAtmOcnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn_GenericImports() {
		return (EReference)nuopcDriverAtmOcnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn_ModelImports() {
		return (EReference)nuopcDriverAtmOcnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn_ImplementsSetServices() {
		return (EReference)nuopcDriverAtmOcnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn_ImplementsSetModelCount() {
		return (EReference)nuopcDriverAtmOcnEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn_ImplementsSetModelServices() {
		return (EReference)nuopcDriverAtmOcnEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn_ImplementsSetModelPetLists() {
		return (EReference)nuopcDriverAtmOcnEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriverAtmOcn__GenericImports() {
		return nuopcDriverAtmOcn__GenericImportsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__GenericImports_ImportsGenericSS() {
		return (EAttribute)nuopcDriverAtmOcn__GenericImportsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__GenericImports_ImportsTypeDriverIS() {
		return (EAttribute)nuopcDriverAtmOcn__GenericImportsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__GenericImports_ImportsLabelSetModelCount() {
		return (EAttribute)nuopcDriverAtmOcn__GenericImportsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__GenericImports_ImportsLabelSetModelServices() {
		return (EAttribute)nuopcDriverAtmOcn__GenericImportsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__GenericImports_ImportsLabelSetModelPetLists() {
		return (EAttribute)nuopcDriverAtmOcn__GenericImportsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriverAtmOcn__ModelImports() {
		return nuopcDriverAtmOcn__ModelImportsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn__ModelImports_Parent() {
		return (EReference)nuopcDriverAtmOcn__ModelImportsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn__ModelImports_ModelImport() {
		return (EReference)nuopcDriverAtmOcn__ModelImportsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriverAtmOcn__ImplementsSetServices() {
		return nuopcDriverAtmOcn__ImplementsSetServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn__ImplementsSetServices_Parent() {
		return (EReference)nuopcDriverAtmOcn__ImplementsSetServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetServices_Name() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetServicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetServices_Param_gcomp() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetServicesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetServices_Param_rc() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetServicesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn__ImplementsSetServices_CallsGenericSetServices() {
		return (EReference)nuopcDriverAtmOcn__ImplementsSetServicesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn__ImplementsSetServices_AttachesMethod() {
		return (EReference)nuopcDriverAtmOcn__ImplementsSetServicesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriverAtmOcn__ImplementsSetModelCount() {
		return nuopcDriverAtmOcn__ImplementsSetModelCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn__ImplementsSetModelCount_Parent() {
		return (EReference)nuopcDriverAtmOcn__ImplementsSetModelCountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelCount_Gcomp() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelCountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelCount_Rc() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelCountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelCount_Name() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelCountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelCount_DriverInternalState() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelCountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn__ImplementsSetModelCount_GetsInternalState() {
		return (EReference)nuopcDriverAtmOcn__ImplementsSetModelCountEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelCount_AssignsValue() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelCountEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelCount_Attached() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelCountEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriverAtmOcn__ImplementsSetModelServices() {
		return nuopcDriverAtmOcn__ImplementsSetModelServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn__ImplementsSetModelServices_Parent() {
		return (EReference)nuopcDriverAtmOcn__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelServices_Gcomp() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelServices_Rc() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelServices_Name() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelServices_DriverInternalState() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn__ImplementsSetModelServices_GetsInternalState() {
		return (EReference)nuopcDriverAtmOcn__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelServices_AssignsValue() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelServices_Attached() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn__ImplementsSetModelServices_SetModelServices() {
		return (EReference)nuopcDriverAtmOcn__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn__ImplementsSetModelServices_SetCouplerServices() {
		return (EReference)nuopcDriverAtmOcn__ImplementsSetModelServicesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriverAtmOcn__ImplementsSetModelPetLists() {
		return nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_Parent() {
		return (EReference)nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_Gcomp() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_Rc() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_Name() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_DriverInternalState() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_GetsInternalState() {
		return (EReference)nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_AssignsValue() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_Attached() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCDriverAtmOcn__ModelImports__ModelImport() {
		return nuopcDriverAtmOcn__ModelImports__ModelImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn__ModelImports__ModelImport_Parent() {
		return (EReference)nuopcDriverAtmOcn__ModelImports__ModelImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ModelImports__ModelImport_Name() {
		return (EAttribute)nuopcDriverAtmOcn__ModelImports__ModelImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCDriverAtmOcn__ModelImports__ModelImport_SetServices() {
		return (EAttribute)nuopcDriverAtmOcn__ModelImports__ModelImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn__ModelImports__ModelImport_ModelRef() {
		return (EReference)nuopcDriverAtmOcn__ModelImports__ModelImportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallsGenericSetServices() {
		return callsGenericSetServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallsGenericSetServices_Gcomp() {
		return (EAttribute)callsGenericSetServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallsGenericSetServices_Rc() {
		return (EAttribute)callsGenericSetServicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallsSetEntryPoint() {
		return callsSetEntryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallsSetEntryPoint_Method() {
		return (EAttribute)callsSetEntryPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallsSetEntryPoint_UserRoutine() {
		return (EAttribute)callsSetEntryPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallsSetEntryPoint_Phase() {
		return (EAttribute)callsSetEntryPointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttachesMethod() {
		return attachesMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachesMethod_Name() {
		return (EAttribute)attachesMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachesMethod_UserRoutine() {
		return (EAttribute)attachesMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttachesMethod_Index() {
		return (EAttribute)attachesMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetModelServices() {
		return setModelServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetModelServices_ModelComp() {
		return (EAttribute)setModelServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetModelServices_SubroutineName() {
		return (EAttribute)setModelServicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetCouplerServices() {
		return setCouplerServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetCouplerServices_CplComp() {
		return (EAttribute)setCouplerServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetCouplerServices_SubroutineName() {
		return (EAttribute)setCouplerServicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetsInternalState() {
		return getsInternalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetsInternalState_Label() {
		return (EAttribute)getsInternalStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCMediator() {
		return nuopcMediatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator_Name() {
		return (EAttribute)nuopcMediatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator_GenericImports() {
		return (EReference)nuopcMediatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator_ImplementsSetServices() {
		return (EReference)nuopcMediatorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator_Initialize() {
		return (EReference)nuopcMediatorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator_ImplementsModelAdvance() {
		return (EReference)nuopcMediatorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCMediator__GenericImports() {
		return nuopcMediator__GenericImportsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__GenericImports_ImportsGenericSS() {
		return (EAttribute)nuopcMediator__GenericImportsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__GenericImports_ImportsLabelModelAdvance() {
		return (EAttribute)nuopcMediator__GenericImportsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCMediator__Init() {
		return nuopcMediator__InitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__Init_Parent() {
		return (EReference)nuopcMediator__InitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__Init_ImplementsInitP1() {
		return (EReference)nuopcMediator__InitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__Init_ImplementsInitP2() {
		return (EReference)nuopcMediator__InitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCMediator__ImplementsSetServices() {
		return nuopcMediator__ImplementsSetServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__ImplementsSetServices_Parent() {
		return (EReference)nuopcMediator__ImplementsSetServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ImplementsSetServices_Name() {
		return (EAttribute)nuopcMediator__ImplementsSetServicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ImplementsSetServices_Param_gcomp() {
		return (EAttribute)nuopcMediator__ImplementsSetServicesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ImplementsSetServices_Param_rc() {
		return (EAttribute)nuopcMediator__ImplementsSetServicesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__ImplementsSetServices_CallsGenericSetServices() {
		return (EReference)nuopcMediator__ImplementsSetServicesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__ImplementsSetServices_CallsSetEntryPoint() {
		return (EReference)nuopcMediator__ImplementsSetServicesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__ImplementsSetServices_AttachesMethod() {
		return (EReference)nuopcMediator__ImplementsSetServicesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCMediator__ImplementsInitP1() {
		return nuopcMediator__ImplementsInitP1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__ImplementsInitP1_Parent() {
		return (EReference)nuopcMediator__ImplementsInitP1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ImplementsInitP1_Name() {
		return (EAttribute)nuopcMediator__ImplementsInitP1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ImplementsInitP1_ImportParam() {
		return (EAttribute)nuopcMediator__ImplementsInitP1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ImplementsInitP1_ExportParam() {
		return (EAttribute)nuopcMediator__ImplementsInitP1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__ImplementsInitP1_AdvertisesImportField() {
		return (EReference)nuopcMediator__ImplementsInitP1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__ImplementsInitP1_AdvertisesExportField() {
		return (EReference)nuopcMediator__ImplementsInitP1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ImplementsInitP1_AdvertisesAtLeastOneField() {
		return (EAttribute)nuopcMediator__ImplementsInitP1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ImplementsInitP1_RegisteredInSetServices() {
		return (EAttribute)nuopcMediator__ImplementsInitP1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ImplementsInitP1_AdvertisesOrRegistered() {
		return (EAttribute)nuopcMediator__ImplementsInitP1EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCMediator__ImplementsInitP2() {
		return nuopcMediator__ImplementsInitP2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__ImplementsInitP2_Parent() {
		return (EReference)nuopcMediator__ImplementsInitP2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ImplementsInitP2_Name() {
		return (EAttribute)nuopcMediator__ImplementsInitP2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ImplementsInitP2_ImportParam() {
		return (EAttribute)nuopcMediator__ImplementsInitP2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ImplementsInitP2_ExportParam() {
		return (EAttribute)nuopcMediator__ImplementsInitP2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__ImplementsInitP2_RealizesImportField() {
		return (EReference)nuopcMediator__ImplementsInitP2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__ImplementsInitP2_RealizesExportField() {
		return (EReference)nuopcMediator__ImplementsInitP2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ImplementsInitP2_RealizesAtLeastOneField() {
		return (EAttribute)nuopcMediator__ImplementsInitP2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ImplementsInitP2_RegisteredInSetServices() {
		return (EAttribute)nuopcMediator__ImplementsInitP2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ImplementsInitP2_RealizesOrRegistered() {
		return (EAttribute)nuopcMediator__ImplementsInitP2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCMediator__AdvertisesImportField() {
		return nuopcMediator__AdvertisesImportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__AdvertisesImportField_Parent() {
		return (EReference)nuopcMediator__AdvertisesImportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__AdvertisesImportField_AddsToState() {
		return (EAttribute)nuopcMediator__AdvertisesImportFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__AdvertisesImportField_Rc() {
		return (EAttribute)nuopcMediator__AdvertisesImportFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__AdvertisesImportField_AddsToImportState() {
		return (EAttribute)nuopcMediator__AdvertisesImportFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__AdvertisesImportField_StandardName() {
		return (EAttribute)nuopcMediator__AdvertisesImportFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCMediator__AdvertisesExportField() {
		return nuopcMediator__AdvertisesExportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__AdvertisesExportField_Parent() {
		return (EReference)nuopcMediator__AdvertisesExportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__AdvertisesExportField_Rc() {
		return (EAttribute)nuopcMediator__AdvertisesExportFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__AdvertisesExportField_AddsToState() {
		return (EAttribute)nuopcMediator__AdvertisesExportFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__AdvertisesExportField_AddsToExportState() {
		return (EAttribute)nuopcMediator__AdvertisesExportFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__AdvertisesExportField_StandardName() {
		return (EAttribute)nuopcMediator__AdvertisesExportFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCMediator__RealizesImportField() {
		return nuopcMediator__RealizesImportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__RealizesImportField_Parent() {
		return (EReference)nuopcMediator__RealizesImportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__RealizesImportField_RealizedInState() {
		return (EAttribute)nuopcMediator__RealizesImportFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__RealizesImportField_Rc() {
		return (EAttribute)nuopcMediator__RealizesImportFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__RealizesImportField_RealizedInImportState() {
		return (EAttribute)nuopcMediator__RealizesImportFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__RealizesImportField_Field() {
		return (EAttribute)nuopcMediator__RealizesImportFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCMediator__RealizesExportField() {
		return nuopcMediator__RealizesExportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__RealizesExportField_Parent() {
		return (EReference)nuopcMediator__RealizesExportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__RealizesExportField_RealizedInState() {
		return (EAttribute)nuopcMediator__RealizesExportFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__RealizesExportField_Rc() {
		return (EAttribute)nuopcMediator__RealizesExportFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__RealizesExportField_RealizedInExportState() {
		return (EAttribute)nuopcMediator__RealizesExportFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__RealizesExportField_Field() {
		return (EAttribute)nuopcMediator__RealizesExportFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCMediator__ModelAdvance() {
		return nuopcMediator__ModelAdvanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCMediator__ModelAdvance_Parent() {
		return (EReference)nuopcMediator__ModelAdvanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ModelAdvance_Name() {
		return (EAttribute)nuopcMediator__ModelAdvanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCMediator__ModelAdvance_AttachedModelAdvance() {
		return (EAttribute)nuopcMediator__ModelAdvanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCFactory getNUOPCFactory() {
		return (NUOPCFactory)getEFactoryInstance();
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
		topEClass = createEClass(TOP);
		createEReference(topEClass, TOP__APPS);

		nuopcApplicationEClass = createEClass(NUOPC_APPLICATION);
		createEAttribute(nuopcApplicationEClass, NUOPC_APPLICATION__NAME);
		createEReference(nuopcApplicationEClass, NUOPC_APPLICATION__NUOPC_MODEL);
		createEReference(nuopcApplicationEClass, NUOPC_APPLICATION__NUOPC_DRIVER);
		createEReference(nuopcApplicationEClass, NUOPC_APPLICATION__NUOPC_DRIVER_ATM_OCN);
		createEReference(nuopcApplicationEClass, NUOPC_APPLICATION__NUOPC_MEDIATOR);

		nuopcModelEClass = createEClass(NUOPC_MODEL);
		createEAttribute(nuopcModelEClass, NUOPC_MODEL__NAME);
		createEReference(nuopcModelEClass, NUOPC_MODEL__GENERIC_IMPORTS);
		createEReference(nuopcModelEClass, NUOPC_MODEL__IMPLEMENTS_SET_SERVICES);
		createEReference(nuopcModelEClass, NUOPC_MODEL__INITIALIZE);
		createEReference(nuopcModelEClass, NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE);
		createEReference(nuopcModelEClass, NUOPC_MODEL__MODEL_ADVANCE);

		nuopcModel__GenericImportsEClass = createEClass(NUOPC_MODEL_GENERIC_IMPORTS);
		createEAttribute(nuopcModel__GenericImportsEClass, NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_GENERIC_SS);
		createEAttribute(nuopcModel__GenericImportsEClass, NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_LABEL_MODEL_ADVANCE);

		nuopcModel__InitEClass = createEClass(NUOPC_MODEL_INIT);
		createEReference(nuopcModel__InitEClass, NUOPC_MODEL_INIT__PARENT);
		createEReference(nuopcModel__InitEClass, NUOPC_MODEL_INIT__IMPLEMENTS_INIT_P1);
		createEReference(nuopcModel__InitEClass, NUOPC_MODEL_INIT__IMPLEMENTS_INIT_P2);

		nuopcModel__ImplementsSetServicesEClass = createEClass(NUOPC_MODEL_IMPLEMENTS_SET_SERVICES);
		createEReference(nuopcModel__ImplementsSetServicesEClass, NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARENT);
		createEAttribute(nuopcModel__ImplementsSetServicesEClass, NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__NAME);
		createEAttribute(nuopcModel__ImplementsSetServicesEClass, NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__GCOMP);
		createEAttribute(nuopcModel__ImplementsSetServicesEClass, NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__RC);
		createEReference(nuopcModel__ImplementsSetServicesEClass, NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES);
		createEReference(nuopcModel__ImplementsSetServicesEClass, NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT);
		createEReference(nuopcModel__ImplementsSetServicesEClass, NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD);

		nuopcModel__ImplementsInitP1EClass = createEClass(NUOPC_MODEL_IMPLEMENTS_INIT_P1);
		createEReference(nuopcModel__ImplementsInitP1EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P1__PARENT);
		createEAttribute(nuopcModel__ImplementsInitP1EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P1__NAME);
		createEAttribute(nuopcModel__ImplementsInitP1EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P1__IMPORT_PARAM);
		createEAttribute(nuopcModel__ImplementsInitP1EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P1__EXPORT_PARAM);
		createEReference(nuopcModel__ImplementsInitP1EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD);
		createEReference(nuopcModel__ImplementsInitP1EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD);
		createEAttribute(nuopcModel__ImplementsInitP1EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD);
		createEAttribute(nuopcModel__ImplementsInitP1EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES);
		createEAttribute(nuopcModel__ImplementsInitP1EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED);

		nuopcModel__ImplementsInitP2EClass = createEClass(NUOPC_MODEL_IMPLEMENTS_INIT_P2);
		createEReference(nuopcModel__ImplementsInitP2EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P2__PARENT);
		createEAttribute(nuopcModel__ImplementsInitP2EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P2__NAME);
		createEAttribute(nuopcModel__ImplementsInitP2EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P2__IMPORT_PARAM);
		createEAttribute(nuopcModel__ImplementsInitP2EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P2__EXPORT_PARAM);
		createEReference(nuopcModel__ImplementsInitP2EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD);
		createEReference(nuopcModel__ImplementsInitP2EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD);
		createEAttribute(nuopcModel__ImplementsInitP2EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P2__REALIZES_AT_LEAST_ONE_FIELD);
		createEAttribute(nuopcModel__ImplementsInitP2EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P2__REGISTERED_IN_SET_SERVICES);
		createEAttribute(nuopcModel__ImplementsInitP2EClass, NUOPC_MODEL_IMPLEMENTS_INIT_P2__REALIZES_OR_REGISTERED);

		nuopcModel__AdvertisesImportFieldEClass = createEClass(NUOPC_MODEL_ADVERTISES_IMPORT_FIELD);
		createEReference(nuopcModel__AdvertisesImportFieldEClass, NUOPC_MODEL_ADVERTISES_IMPORT_FIELD__PARENT);
		createEAttribute(nuopcModel__AdvertisesImportFieldEClass, NUOPC_MODEL_ADVERTISES_IMPORT_FIELD__ADDS_TO_STATE);
		createEAttribute(nuopcModel__AdvertisesImportFieldEClass, NUOPC_MODEL_ADVERTISES_IMPORT_FIELD__RC);
		createEAttribute(nuopcModel__AdvertisesImportFieldEClass, NUOPC_MODEL_ADVERTISES_IMPORT_FIELD__ADDS_TO_IMPORT_STATE);
		createEAttribute(nuopcModel__AdvertisesImportFieldEClass, NUOPC_MODEL_ADVERTISES_IMPORT_FIELD__STANDARD_NAME);

		nuopcModel__AdvertisesExportFieldEClass = createEClass(NUOPC_MODEL_ADVERTISES_EXPORT_FIELD);
		createEReference(nuopcModel__AdvertisesExportFieldEClass, NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__PARENT);
		createEAttribute(nuopcModel__AdvertisesExportFieldEClass, NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__RC);
		createEAttribute(nuopcModel__AdvertisesExportFieldEClass, NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__ADDS_TO_STATE);
		createEAttribute(nuopcModel__AdvertisesExportFieldEClass, NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__ADDS_TO_EXPORT_STATE);
		createEAttribute(nuopcModel__AdvertisesExportFieldEClass, NUOPC_MODEL_ADVERTISES_EXPORT_FIELD__STANDARD_NAME);

		nuopcModel__RealizesImportFieldEClass = createEClass(NUOPC_MODEL_REALIZES_IMPORT_FIELD);
		createEReference(nuopcModel__RealizesImportFieldEClass, NUOPC_MODEL_REALIZES_IMPORT_FIELD__PARENT);
		createEAttribute(nuopcModel__RealizesImportFieldEClass, NUOPC_MODEL_REALIZES_IMPORT_FIELD__REALIZED_IN_STATE);
		createEAttribute(nuopcModel__RealizesImportFieldEClass, NUOPC_MODEL_REALIZES_IMPORT_FIELD__RC);
		createEAttribute(nuopcModel__RealizesImportFieldEClass, NUOPC_MODEL_REALIZES_IMPORT_FIELD__REALIZED_IN_IMPORT_STATE);
		createEAttribute(nuopcModel__RealizesImportFieldEClass, NUOPC_MODEL_REALIZES_IMPORT_FIELD__FIELD);

		nuopcModel__RealizesExportFieldEClass = createEClass(NUOPC_MODEL_REALIZES_EXPORT_FIELD);
		createEReference(nuopcModel__RealizesExportFieldEClass, NUOPC_MODEL_REALIZES_EXPORT_FIELD__PARENT);
		createEAttribute(nuopcModel__RealizesExportFieldEClass, NUOPC_MODEL_REALIZES_EXPORT_FIELD__REALIZED_IN_STATE);
		createEAttribute(nuopcModel__RealizesExportFieldEClass, NUOPC_MODEL_REALIZES_EXPORT_FIELD__RC);
		createEAttribute(nuopcModel__RealizesExportFieldEClass, NUOPC_MODEL_REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE);
		createEAttribute(nuopcModel__RealizesExportFieldEClass, NUOPC_MODEL_REALIZES_EXPORT_FIELD__FIELD);

		nuopcModel__ImplementsModelAdvanceEClass = createEClass(NUOPC_MODEL_IMPLEMENTS_MODEL_ADVANCE);
		createEReference(nuopcModel__ImplementsModelAdvanceEClass, NUOPC_MODEL_IMPLEMENTS_MODEL_ADVANCE__PARENT);
		createEAttribute(nuopcModel__ImplementsModelAdvanceEClass, NUOPC_MODEL_IMPLEMENTS_MODEL_ADVANCE__NAME);
		createEAttribute(nuopcModel__ImplementsModelAdvanceEClass, NUOPC_MODEL_IMPLEMENTS_MODEL_ADVANCE__ATTACHED_MODEL_ADVANCE);

		nuopcModel__ModelAdvanceEClass = createEClass(NUOPC_MODEL_MODEL_ADVANCE);
		createEReference(nuopcModel__ModelAdvanceEClass, NUOPC_MODEL_MODEL_ADVANCE__PARENT);
		createEReference(nuopcModel__ModelAdvanceEClass, NUOPC_MODEL_MODEL_ADVANCE__IMPLEMENTS_SUBROUTINE);
		createEReference(nuopcModel__ModelAdvanceEClass, NUOPC_MODEL_MODEL_ADVANCE__ATTACHED);

		nuopcModel__ModelAdvance__ImplementsSubroutineEClass = createEClass(NUOPC_MODEL_MODEL_ADVANCE_IMPLEMENTS_SUBROUTINE);
		createEAttribute(nuopcModel__ModelAdvance__ImplementsSubroutineEClass, NUOPC_MODEL_MODEL_ADVANCE_IMPLEMENTS_SUBROUTINE__NAME);

		nuopcModel__ModelAdvance__AttachedEClass = createEClass(NUOPC_MODEL_MODEL_ADVANCE_ATTACHED);
		createEAttribute(nuopcModel__ModelAdvance__AttachedEClass, NUOPC_MODEL_MODEL_ADVANCE_ATTACHED__NAME);

		nuopcDriverEClass = createEClass(NUOPC_DRIVER);
		createEReference(nuopcDriverEClass, NUOPC_DRIVER__PARENT);
		createEAttribute(nuopcDriverEClass, NUOPC_DRIVER__NAME);
		createEReference(nuopcDriverEClass, NUOPC_DRIVER__GENERIC_IMPORTS);
		createEReference(nuopcDriverEClass, NUOPC_DRIVER__MODEL_IMPORTS);
		createEReference(nuopcDriverEClass, NUOPC_DRIVER__CONNECTOR_IMPORTS);
		createEReference(nuopcDriverEClass, NUOPC_DRIVER__IMPLEMENTS_SET_SERVICES);
		createEReference(nuopcDriverEClass, NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT);
		createEReference(nuopcDriverEClass, NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_SERVICES);

		nuopcDriver__GenericImportsEClass = createEClass(NUOPC_DRIVER_GENERIC_IMPORTS);
		createEAttribute(nuopcDriver__GenericImportsEClass, NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_GENERIC_SS);
		createEAttribute(nuopcDriver__GenericImportsEClass, NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_TYPE_DRIVER_IS);
		createEAttribute(nuopcDriver__GenericImportsEClass, NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_COUNT);
		createEAttribute(nuopcDriver__GenericImportsEClass, NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_SERVICES);

		nuopcDriver__ModelImportsEClass = createEClass(NUOPC_DRIVER_MODEL_IMPORTS);
		createEReference(nuopcDriver__ModelImportsEClass, NUOPC_DRIVER_MODEL_IMPORTS__PARENT);
		createEReference(nuopcDriver__ModelImportsEClass, NUOPC_DRIVER_MODEL_IMPORTS__MODEL_IMPORT);

		nuopcDriver__ModelImports__ModelImportEClass = createEClass(NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT);
		createEReference(nuopcDriver__ModelImports__ModelImportEClass, NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT__PARENT);
		createEAttribute(nuopcDriver__ModelImports__ModelImportEClass, NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT__NAME);
		createEAttribute(nuopcDriver__ModelImports__ModelImportEClass, NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT__SET_SERVICES);
		createEReference(nuopcDriver__ModelImports__ModelImportEClass, NUOPC_DRIVER_MODEL_IMPORTS_MODEL_IMPORT__MODEL_REF);

		nuopcDriver__ConnectorImportsEClass = createEClass(NUOPC_DRIVER_CONNECTOR_IMPORTS);
		createEReference(nuopcDriver__ConnectorImportsEClass, NUOPC_DRIVER_CONNECTOR_IMPORTS__PARENT);
		createEReference(nuopcDriver__ConnectorImportsEClass, NUOPC_DRIVER_CONNECTOR_IMPORTS__CONNECTOR_IMPORT);

		nuopcDriver__ConnectorImports__ConnectorImportEClass = createEClass(NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT);
		createEReference(nuopcDriver__ConnectorImports__ConnectorImportEClass, NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__PARENT);
		createEAttribute(nuopcDriver__ConnectorImports__ConnectorImportEClass, NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__NAME);
		createEAttribute(nuopcDriver__ConnectorImports__ConnectorImportEClass, NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__SET_SERVICES);

		nuopcDriver__ImplementsSetServicesEClass = createEClass(NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES);
		createEReference(nuopcDriver__ImplementsSetServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__PARENT);
		createEAttribute(nuopcDriver__ImplementsSetServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__NAME);
		createEAttribute(nuopcDriver__ImplementsSetServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP);
		createEAttribute(nuopcDriver__ImplementsSetServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__PARAM_RC);
		createEReference(nuopcDriver__ImplementsSetServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES);
		createEReference(nuopcDriver__ImplementsSetServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD);

		nuopcDriver__ImplementsSetModelCountEClass = createEClass(NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT);
		createEReference(nuopcDriver__ImplementsSetModelCountEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT);
		createEAttribute(nuopcDriver__ImplementsSetModelCountEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__GCOMP);
		createEAttribute(nuopcDriver__ImplementsSetModelCountEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__RC);
		createEAttribute(nuopcDriver__ImplementsSetModelCountEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__NAME);
		createEAttribute(nuopcDriver__ImplementsSetModelCountEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__DRIVER_INTERNAL_STATE);
		createEReference(nuopcDriver__ImplementsSetModelCountEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__GETS_INTERNAL_STATE);
		createEAttribute(nuopcDriver__ImplementsSetModelCountEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__ASSIGNS_VALUE);
		createEAttribute(nuopcDriver__ImplementsSetModelCountEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__ATTACHED);

		nuopcDriver__ImplementsSetModelServicesEClass = createEClass(NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES);
		createEReference(nuopcDriver__ImplementsSetModelServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__PARENT);
		createEAttribute(nuopcDriver__ImplementsSetModelServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__GCOMP);
		createEAttribute(nuopcDriver__ImplementsSetModelServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__RC);
		createEAttribute(nuopcDriver__ImplementsSetModelServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__NAME);
		createEAttribute(nuopcDriver__ImplementsSetModelServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__DRIVER_INTERNAL_STATE);
		createEReference(nuopcDriver__ImplementsSetModelServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__GETS_INTERNAL_STATE);
		createEAttribute(nuopcDriver__ImplementsSetModelServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__ASSIGNS_VALUE);
		createEAttribute(nuopcDriver__ImplementsSetModelServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__ATTACHED);
		createEReference(nuopcDriver__ImplementsSetModelServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__SET_MODEL_SERVICES);
		createEReference(nuopcDriver__ImplementsSetModelServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__SET_COUPLER_SERVICES);

		nuopcDriverAtmOcnEClass = createEClass(NUOPC_DRIVER_ATM_OCN);
		createEReference(nuopcDriverAtmOcnEClass, NUOPC_DRIVER_ATM_OCN__PARENT);
		createEAttribute(nuopcDriverAtmOcnEClass, NUOPC_DRIVER_ATM_OCN__NAME);
		createEReference(nuopcDriverAtmOcnEClass, NUOPC_DRIVER_ATM_OCN__GENERIC_IMPORTS);
		createEReference(nuopcDriverAtmOcnEClass, NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS);
		createEReference(nuopcDriverAtmOcnEClass, NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES);
		createEReference(nuopcDriverAtmOcnEClass, NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_COUNT);
		createEReference(nuopcDriverAtmOcnEClass, NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_SERVICES);
		createEReference(nuopcDriverAtmOcnEClass, NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_PET_LISTS);

		nuopcDriverAtmOcn__GenericImportsEClass = createEClass(NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS);
		createEAttribute(nuopcDriverAtmOcn__GenericImportsEClass, NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_GENERIC_SS);
		createEAttribute(nuopcDriverAtmOcn__GenericImportsEClass, NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_TYPE_DRIVER_IS);
		createEAttribute(nuopcDriverAtmOcn__GenericImportsEClass, NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_COUNT);
		createEAttribute(nuopcDriverAtmOcn__GenericImportsEClass, NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_SERVICES);
		createEAttribute(nuopcDriverAtmOcn__GenericImportsEClass, NUOPC_DRIVER_ATM_OCN_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_PET_LISTS);

		nuopcDriverAtmOcn__ModelImportsEClass = createEClass(NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS);
		createEReference(nuopcDriverAtmOcn__ModelImportsEClass, NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__PARENT);
		createEReference(nuopcDriverAtmOcn__ModelImportsEClass, NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__MODEL_IMPORT);

		nuopcDriverAtmOcn__ImplementsSetServicesEClass = createEClass(NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES);
		createEReference(nuopcDriverAtmOcn__ImplementsSetServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__NAME);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_RC);
		createEReference(nuopcDriverAtmOcn__ImplementsSetServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES);
		createEReference(nuopcDriverAtmOcn__ImplementsSetServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD);

		nuopcDriverAtmOcn__ImplementsSetModelCountEClass = createEClass(NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT);
		createEReference(nuopcDriverAtmOcn__ImplementsSetModelCountEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__PARENT);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelCountEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__GCOMP);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelCountEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__RC);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelCountEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__NAME);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelCountEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__DRIVER_INTERNAL_STATE);
		createEReference(nuopcDriverAtmOcn__ImplementsSetModelCountEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__GETS_INTERNAL_STATE);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelCountEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__ASSIGNS_VALUE);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelCountEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__ATTACHED);

		nuopcDriverAtmOcn__ImplementsSetModelServicesEClass = createEClass(NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES);
		createEReference(nuopcDriverAtmOcn__ImplementsSetModelServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__PARENT);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__GCOMP);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__RC);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__NAME);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__DRIVER_INTERNAL_STATE);
		createEReference(nuopcDriverAtmOcn__ImplementsSetModelServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__GETS_INTERNAL_STATE);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__ASSIGNS_VALUE);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__ATTACHED);
		createEReference(nuopcDriverAtmOcn__ImplementsSetModelServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__SET_MODEL_SERVICES);
		createEReference(nuopcDriverAtmOcn__ImplementsSetModelServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__SET_COUPLER_SERVICES);

		nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass = createEClass(NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_PET_LISTS);
		createEReference(nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_PET_LISTS__PARENT);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_PET_LISTS__GCOMP);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_PET_LISTS__RC);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_PET_LISTS__NAME);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_PET_LISTS__DRIVER_INTERNAL_STATE);
		createEReference(nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_PET_LISTS__GETS_INTERNAL_STATE);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_PET_LISTS__ASSIGNS_VALUE);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_PET_LISTS__ATTACHED);

		nuopcDriverAtmOcn__ModelImports__ModelImportEClass = createEClass(NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT);
		createEReference(nuopcDriverAtmOcn__ModelImports__ModelImportEClass, NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT__PARENT);
		createEAttribute(nuopcDriverAtmOcn__ModelImports__ModelImportEClass, NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT__NAME);
		createEAttribute(nuopcDriverAtmOcn__ModelImports__ModelImportEClass, NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT__SET_SERVICES);
		createEReference(nuopcDriverAtmOcn__ModelImports__ModelImportEClass, NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT__MODEL_REF);

		callsGenericSetServicesEClass = createEClass(CALLS_GENERIC_SET_SERVICES);
		createEAttribute(callsGenericSetServicesEClass, CALLS_GENERIC_SET_SERVICES__GCOMP);
		createEAttribute(callsGenericSetServicesEClass, CALLS_GENERIC_SET_SERVICES__RC);

		callsSetEntryPointEClass = createEClass(CALLS_SET_ENTRY_POINT);
		createEAttribute(callsSetEntryPointEClass, CALLS_SET_ENTRY_POINT__METHOD);
		createEAttribute(callsSetEntryPointEClass, CALLS_SET_ENTRY_POINT__USER_ROUTINE);
		createEAttribute(callsSetEntryPointEClass, CALLS_SET_ENTRY_POINT__PHASE);

		attachesMethodEClass = createEClass(ATTACHES_METHOD);
		createEAttribute(attachesMethodEClass, ATTACHES_METHOD__NAME);
		createEAttribute(attachesMethodEClass, ATTACHES_METHOD__USER_ROUTINE);
		createEAttribute(attachesMethodEClass, ATTACHES_METHOD__INDEX);

		setModelServicesEClass = createEClass(SET_MODEL_SERVICES);
		createEAttribute(setModelServicesEClass, SET_MODEL_SERVICES__MODEL_COMP);
		createEAttribute(setModelServicesEClass, SET_MODEL_SERVICES__SUBROUTINE_NAME);

		setCouplerServicesEClass = createEClass(SET_COUPLER_SERVICES);
		createEAttribute(setCouplerServicesEClass, SET_COUPLER_SERVICES__CPL_COMP);
		createEAttribute(setCouplerServicesEClass, SET_COUPLER_SERVICES__SUBROUTINE_NAME);

		getsInternalStateEClass = createEClass(GETS_INTERNAL_STATE);
		createEAttribute(getsInternalStateEClass, GETS_INTERNAL_STATE__LABEL);

		nuopcMediatorEClass = createEClass(NUOPC_MEDIATOR);
		createEAttribute(nuopcMediatorEClass, NUOPC_MEDIATOR__NAME);
		createEReference(nuopcMediatorEClass, NUOPC_MEDIATOR__GENERIC_IMPORTS);
		createEReference(nuopcMediatorEClass, NUOPC_MEDIATOR__IMPLEMENTS_SET_SERVICES);
		createEReference(nuopcMediatorEClass, NUOPC_MEDIATOR__INITIALIZE);
		createEReference(nuopcMediatorEClass, NUOPC_MEDIATOR__IMPLEMENTS_MODEL_ADVANCE);

		nuopcMediator__GenericImportsEClass = createEClass(NUOPC_MEDIATOR_GENERIC_IMPORTS);
		createEAttribute(nuopcMediator__GenericImportsEClass, NUOPC_MEDIATOR_GENERIC_IMPORTS__IMPORTS_GENERIC_SS);
		createEAttribute(nuopcMediator__GenericImportsEClass, NUOPC_MEDIATOR_GENERIC_IMPORTS__IMPORTS_LABEL_MODEL_ADVANCE);

		nuopcMediator__InitEClass = createEClass(NUOPC_MEDIATOR_INIT);
		createEReference(nuopcMediator__InitEClass, NUOPC_MEDIATOR_INIT__PARENT);
		createEReference(nuopcMediator__InitEClass, NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P1);
		createEReference(nuopcMediator__InitEClass, NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P2);

		nuopcMediator__ImplementsSetServicesEClass = createEClass(NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES);
		createEReference(nuopcMediator__ImplementsSetServicesEClass, NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__PARENT);
		createEAttribute(nuopcMediator__ImplementsSetServicesEClass, NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__NAME);
		createEAttribute(nuopcMediator__ImplementsSetServicesEClass, NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP);
		createEAttribute(nuopcMediator__ImplementsSetServicesEClass, NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__PARAM_RC);
		createEReference(nuopcMediator__ImplementsSetServicesEClass, NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES);
		createEReference(nuopcMediator__ImplementsSetServicesEClass, NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT);
		createEReference(nuopcMediator__ImplementsSetServicesEClass, NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD);

		nuopcMediator__ImplementsInitP1EClass = createEClass(NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1);
		createEReference(nuopcMediator__ImplementsInitP1EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__PARENT);
		createEAttribute(nuopcMediator__ImplementsInitP1EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__NAME);
		createEAttribute(nuopcMediator__ImplementsInitP1EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__IMPORT_PARAM);
		createEAttribute(nuopcMediator__ImplementsInitP1EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__EXPORT_PARAM);
		createEReference(nuopcMediator__ImplementsInitP1EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD);
		createEReference(nuopcMediator__ImplementsInitP1EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD);
		createEAttribute(nuopcMediator__ImplementsInitP1EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD);
		createEAttribute(nuopcMediator__ImplementsInitP1EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES);
		createEAttribute(nuopcMediator__ImplementsInitP1EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED);

		nuopcMediator__ImplementsInitP2EClass = createEClass(NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2);
		createEReference(nuopcMediator__ImplementsInitP2EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__PARENT);
		createEAttribute(nuopcMediator__ImplementsInitP2EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__NAME);
		createEAttribute(nuopcMediator__ImplementsInitP2EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__IMPORT_PARAM);
		createEAttribute(nuopcMediator__ImplementsInitP2EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__EXPORT_PARAM);
		createEReference(nuopcMediator__ImplementsInitP2EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD);
		createEReference(nuopcMediator__ImplementsInitP2EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD);
		createEAttribute(nuopcMediator__ImplementsInitP2EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__REALIZES_AT_LEAST_ONE_FIELD);
		createEAttribute(nuopcMediator__ImplementsInitP2EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__REGISTERED_IN_SET_SERVICES);
		createEAttribute(nuopcMediator__ImplementsInitP2EClass, NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__REALIZES_OR_REGISTERED);

		nuopcMediator__AdvertisesImportFieldEClass = createEClass(NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD);
		createEReference(nuopcMediator__AdvertisesImportFieldEClass, NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD__PARENT);
		createEAttribute(nuopcMediator__AdvertisesImportFieldEClass, NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD__ADDS_TO_STATE);
		createEAttribute(nuopcMediator__AdvertisesImportFieldEClass, NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD__RC);
		createEAttribute(nuopcMediator__AdvertisesImportFieldEClass, NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD__ADDS_TO_IMPORT_STATE);
		createEAttribute(nuopcMediator__AdvertisesImportFieldEClass, NUOPC_MEDIATOR_ADVERTISES_IMPORT_FIELD__STANDARD_NAME);

		nuopcMediator__AdvertisesExportFieldEClass = createEClass(NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD);
		createEReference(nuopcMediator__AdvertisesExportFieldEClass, NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD__PARENT);
		createEAttribute(nuopcMediator__AdvertisesExportFieldEClass, NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD__RC);
		createEAttribute(nuopcMediator__AdvertisesExportFieldEClass, NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD__ADDS_TO_STATE);
		createEAttribute(nuopcMediator__AdvertisesExportFieldEClass, NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD__ADDS_TO_EXPORT_STATE);
		createEAttribute(nuopcMediator__AdvertisesExportFieldEClass, NUOPC_MEDIATOR_ADVERTISES_EXPORT_FIELD__STANDARD_NAME);

		nuopcMediator__RealizesImportFieldEClass = createEClass(NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD);
		createEReference(nuopcMediator__RealizesImportFieldEClass, NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD__PARENT);
		createEAttribute(nuopcMediator__RealizesImportFieldEClass, NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD__REALIZED_IN_STATE);
		createEAttribute(nuopcMediator__RealizesImportFieldEClass, NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD__RC);
		createEAttribute(nuopcMediator__RealizesImportFieldEClass, NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD__REALIZED_IN_IMPORT_STATE);
		createEAttribute(nuopcMediator__RealizesImportFieldEClass, NUOPC_MEDIATOR_REALIZES_IMPORT_FIELD__FIELD);

		nuopcMediator__RealizesExportFieldEClass = createEClass(NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD);
		createEReference(nuopcMediator__RealizesExportFieldEClass, NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD__PARENT);
		createEAttribute(nuopcMediator__RealizesExportFieldEClass, NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD__REALIZED_IN_STATE);
		createEAttribute(nuopcMediator__RealizesExportFieldEClass, NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD__RC);
		createEAttribute(nuopcMediator__RealizesExportFieldEClass, NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE);
		createEAttribute(nuopcMediator__RealizesExportFieldEClass, NUOPC_MEDIATOR_REALIZES_EXPORT_FIELD__FIELD);

		nuopcMediator__ModelAdvanceEClass = createEClass(NUOPC_MEDIATOR_MODEL_ADVANCE);
		createEReference(nuopcMediator__ModelAdvanceEClass, NUOPC_MEDIATOR_MODEL_ADVANCE__PARENT);
		createEAttribute(nuopcMediator__ModelAdvanceEClass, NUOPC_MEDIATOR_MODEL_ADVANCE__NAME);
		createEAttribute(nuopcMediator__ModelAdvanceEClass, NUOPC_MEDIATOR_MODEL_ADVANCE__ATTACHED_MODEL_ADVANCE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(topEClass, Top.class, "Top", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTop_Apps(), this.getNUOPCApplication(), null, "apps", null, 1, 1, Top.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcApplicationEClass, NUOPCApplication.class, "NUOPCApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCApplication_Name(), ecorePackage.getEString(), "name", null, 1, 1, NUOPCApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCApplication_NuopcModel(), this.getNUOPCModel(), null, "nuopcModel", null, 0, -1, NUOPCApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNUOPCApplication_NuopcDriver(), this.getNUOPCDriver(), this.getNUOPCDriver_Parent(), "nuopcDriver", null, 0, -1, NUOPCApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNUOPCApplication_NuopcDriverAtmOcn(), this.getNUOPCDriverAtmOcn(), this.getNUOPCDriverAtmOcn_Parent(), "nuopcDriverAtmOcn", null, 0, -1, NUOPCApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNUOPCApplication_NuopcMediator(), this.getNUOPCMediator(), null, "nuopcMediator", null, 0, -1, NUOPCApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nuopcModelEClass, NUOPCModel.class, "NUOPCModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCModel_Name(), ecorePackage.getEString(), "name", "ModelDefault", 1, 1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel_GenericImports(), this.getNUOPCModel__GenericImports(), null, "genericImports", null, 1, 1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel_ImplementsSetServices(), this.getNUOPCModel__ImplementsSetServices(), this.getNUOPCModel__ImplementsSetServices_Parent(), "implementsSetServices", null, 1, 1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNUOPCModel_ImplementsSetServices().getEKeys().add(this.getNUOPCModel__ImplementsSetServices_Name());
		initEReference(getNUOPCModel_Initialize(), this.getNUOPCModel__Init(), this.getNUOPCModel__Init_Parent(), "initialize", null, 1, 1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel_ImplementsModelAdvance(), this.getNUOPCModel__ImplementsModelAdvance(), this.getNUOPCModel__ImplementsModelAdvance_Parent(), "implementsModelAdvance", null, 0, -1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel_ModelAdvance(), this.getNUOPCModel__ModelAdvance(), this.getNUOPCModel__ModelAdvance_Parent(), "modelAdvance", null, 0, -1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcModel__GenericImportsEClass, NUOPCModel__GenericImports.class, "NUOPCModel__GenericImports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCModel__GenericImports_ImportsGenericSS(), ecorePackage.getEString(), "importsGenericSS", "model_routine_SS", 1, 1, NUOPCModel__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__GenericImports_ImportsLabelModelAdvance(), ecorePackage.getEString(), "importsLabelModelAdvance", "model_label_Advance", 0, 1, NUOPCModel__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcModel__InitEClass, NUOPCModel__Init.class, "NUOPCModel__Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCModel__Init_Parent(), this.getNUOPCModel(), this.getNUOPCModel_Initialize(), "parent", null, 1, 1, NUOPCModel__Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel__Init_ImplementsInitP1(), this.getNUOPCModel__ImplementsInitP1(), this.getNUOPCModel__ImplementsInitP1_Parent(), "implementsInitP1", null, 1, 1, NUOPCModel__Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNUOPCModel__Init_ImplementsInitP1().getEKeys().add(this.getNUOPCModel__ImplementsInitP1_Name());
		initEReference(getNUOPCModel__Init_ImplementsInitP2(), this.getNUOPCModel__ImplementsInitP2(), this.getNUOPCModel__ImplementsInitP2_Parent(), "implementsInitP2", null, 1, 1, NUOPCModel__Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNUOPCModel__Init_ImplementsInitP2().getEKeys().add(this.getNUOPCModel__ImplementsInitP2_Name());

		initEClass(nuopcModel__ImplementsSetServicesEClass, NUOPCModel__ImplementsSetServices.class, "NUOPCModel__ImplementsSetServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCModel__ImplementsSetServices_Parent(), this.getNUOPCModel(), this.getNUOPCModel_ImplementsSetServices(), "parent", null, 1, 1, NUOPCModel__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsSetServices_Name(), ecorePackage.getEString(), "name", "SetServices", 1, 1, NUOPCModel__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsSetServices_Gcomp(), ecorePackage.getEString(), "gcomp", "gcomp", 1, 1, NUOPCModel__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsSetServices_Rc(), ecorePackage.getEString(), "rc", "rc", 1, 1, NUOPCModel__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel__ImplementsSetServices_CallsGenericSetServices(), this.getCallsGenericSetServices(), null, "callsGenericSetServices", null, 1, 1, NUOPCModel__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel__ImplementsSetServices_CallsSetEntryPoint(), this.getCallsSetEntryPoint(), null, "callsSetEntryPoint", null, 0, -1, NUOPCModel__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel__ImplementsSetServices_AttachesMethod(), this.getAttachesMethod(), null, "attachesMethod", null, 0, -1, NUOPCModel__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nuopcModel__ImplementsInitP1EClass, NUOPCModel__ImplementsInitP1.class, "NUOPCModel__ImplementsInitP1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCModel__ImplementsInitP1_Parent(), this.getNUOPCModel__Init(), this.getNUOPCModel__Init_ImplementsInitP1(), "parent", null, 1, 1, NUOPCModel__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsInitP1_Name(), ecorePackage.getEString(), "name", "InitP1", 1, 1, NUOPCModel__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsInitP1_ImportParam(), ecorePackage.getEString(), "importParam", "importState", 1, 1, NUOPCModel__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsInitP1_ExportParam(), ecorePackage.getEString(), "exportParam", "exportState", 1, 1, NUOPCModel__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel__ImplementsInitP1_AdvertisesImportField(), this.getNUOPCModel__AdvertisesImportField(), this.getNUOPCModel__AdvertisesImportField_Parent(), "advertisesImportField", null, 0, -1, NUOPCModel__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel__ImplementsInitP1_AdvertisesExportField(), this.getNUOPCModel__AdvertisesExportField(), this.getNUOPCModel__AdvertisesExportField_Parent(), "advertisesExportField", null, 0, -1, NUOPCModel__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsInitP1_AdvertisesAtLeastOneField(), ecorePackage.getEBoolean(), "advertisesAtLeastOneField", null, 1, 1, NUOPCModel__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsInitP1_RegisteredInSetServices(), ecorePackage.getEBoolean(), "registeredInSetServices", null, 1, 1, NUOPCModel__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsInitP1_AdvertisesOrRegistered(), ecorePackage.getEBoolean(), "advertisesOrRegistered", null, 1, 1, NUOPCModel__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcModel__ImplementsInitP2EClass, NUOPCModel__ImplementsInitP2.class, "NUOPCModel__ImplementsInitP2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCModel__ImplementsInitP2_Parent(), this.getNUOPCModel__Init(), this.getNUOPCModel__Init_ImplementsInitP2(), "parent", null, 1, 1, NUOPCModel__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsInitP2_Name(), ecorePackage.getEString(), "name", "InitP2", 1, 1, NUOPCModel__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsInitP2_ImportParam(), ecorePackage.getEString(), "importParam", "importState", 1, 1, NUOPCModel__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsInitP2_ExportParam(), ecorePackage.getEString(), "exportParam", "exportState", 1, 1, NUOPCModel__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel__ImplementsInitP2_RealizesImportField(), this.getNUOPCModel__RealizesImportField(), this.getNUOPCModel__RealizesImportField_Parent(), "realizesImportField", null, 0, -1, NUOPCModel__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel__ImplementsInitP2_RealizesExportField(), this.getNUOPCModel__RealizesExportField(), this.getNUOPCModel__RealizesExportField_Parent(), "realizesExportField", null, 0, -1, NUOPCModel__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsInitP2_RealizesAtLeastOneField(), ecorePackage.getEBoolean(), "realizesAtLeastOneField", null, 1, 1, NUOPCModel__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsInitP2_RegisteredInSetServices(), ecorePackage.getEBoolean(), "registeredInSetServices", null, 1, 1, NUOPCModel__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsInitP2_RealizesOrRegistered(), ecorePackage.getEBoolean(), "realizesOrRegistered", null, 1, 1, NUOPCModel__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcModel__AdvertisesImportFieldEClass, NUOPCModel__AdvertisesImportField.class, "NUOPCModel__AdvertisesImportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCModel__AdvertisesImportField_Parent(), this.getNUOPCModel__ImplementsInitP1(), this.getNUOPCModel__ImplementsInitP1_AdvertisesImportField(), "parent", null, 1, 1, NUOPCModel__AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__AdvertisesImportField_AddsToState(), ecorePackage.getEString(), "addsToState", "importState", 1, 1, NUOPCModel__AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__AdvertisesImportField_Rc(), ecorePackage.getEString(), "rc", "rc", 1, 1, NUOPCModel__AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__AdvertisesImportField_AddsToImportState(), ecorePackage.getEBoolean(), "addsToImportState", null, 1, 1, NUOPCModel__AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__AdvertisesImportField_StandardName(), ecorePackage.getEString(), "standardName", "\"Standard_Name\"", 1, 1, NUOPCModel__AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcModel__AdvertisesExportFieldEClass, NUOPCModel__AdvertisesExportField.class, "NUOPCModel__AdvertisesExportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCModel__AdvertisesExportField_Parent(), this.getNUOPCModel__ImplementsInitP1(), this.getNUOPCModel__ImplementsInitP1_AdvertisesExportField(), "parent", null, 1, 1, NUOPCModel__AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__AdvertisesExportField_Rc(), ecorePackage.getEString(), "rc", "rc", 1, 1, NUOPCModel__AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__AdvertisesExportField_AddsToState(), ecorePackage.getEString(), "addsToState", "exportState", 1, 1, NUOPCModel__AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__AdvertisesExportField_AddsToExportState(), ecorePackage.getEBoolean(), "addsToExportState", null, 1, 1, NUOPCModel__AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__AdvertisesExportField_StandardName(), ecorePackage.getEString(), "standardName", "\"Standard_Name\"", 1, 1, NUOPCModel__AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcModel__RealizesImportFieldEClass, NUOPCModel__RealizesImportField.class, "NUOPCModel__RealizesImportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCModel__RealizesImportField_Parent(), this.getNUOPCModel__ImplementsInitP2(), this.getNUOPCModel__ImplementsInitP2_RealizesImportField(), "parent", null, 1, 1, NUOPCModel__RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__RealizesImportField_RealizedInState(), ecorePackage.getEString(), "realizedInState", "importState", 1, 1, NUOPCModel__RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__RealizesImportField_Rc(), ecorePackage.getEString(), "rc", "rc", 1, 1, NUOPCModel__RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__RealizesImportField_RealizedInImportState(), ecorePackage.getEBoolean(), "realizedInImportState", null, 1, 1, NUOPCModel__RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__RealizesImportField_Field(), ecorePackage.getEString(), "field", null, 1, 1, NUOPCModel__RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcModel__RealizesExportFieldEClass, NUOPCModel__RealizesExportField.class, "NUOPCModel__RealizesExportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCModel__RealizesExportField_Parent(), this.getNUOPCModel__ImplementsInitP2(), this.getNUOPCModel__ImplementsInitP2_RealizesExportField(), "parent", null, 1, 1, NUOPCModel__RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__RealizesExportField_RealizedInState(), ecorePackage.getEString(), "realizedInState", "exportState", 1, 1, NUOPCModel__RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__RealizesExportField_Rc(), ecorePackage.getEString(), "rc", "rc", 1, 1, NUOPCModel__RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__RealizesExportField_RealizedInExportState(), ecorePackage.getEBoolean(), "realizedInExportState", null, 1, 1, NUOPCModel__RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__RealizesExportField_Field(), ecorePackage.getEString(), "field", null, 1, 1, NUOPCModel__RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcModel__ImplementsModelAdvanceEClass, NUOPCModel__ImplementsModelAdvance.class, "NUOPCModel__ImplementsModelAdvance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCModel__ImplementsModelAdvance_Parent(), this.getNUOPCModel(), this.getNUOPCModel_ImplementsModelAdvance(), "parent", null, 1, 1, NUOPCModel__ImplementsModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsModelAdvance_Name(), ecorePackage.getEString(), "name", "ModelAdvance", 1, 1, NUOPCModel__ImplementsModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__ImplementsModelAdvance_AttachedModelAdvance(), ecorePackage.getEBoolean(), "attachedModelAdvance", null, 1, 1, NUOPCModel__ImplementsModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(nuopcModel__ModelAdvanceEClass, NUOPCModel__ModelAdvance.class, "NUOPCModel__ModelAdvance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCModel__ModelAdvance_Parent(), this.getNUOPCModel(), this.getNUOPCModel_ModelAdvance(), "parent", null, 1, 1, NUOPCModel__ModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel__ModelAdvance_ImplementsSubroutine(), this.getNUOPCModel__ModelAdvance__ImplementsSubroutine(), null, "implementsSubroutine", null, 1, 1, NUOPCModel__ModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel__ModelAdvance_Attached(), this.getNUOPCModel__ModelAdvance__Attached(), null, "attached", null, 1, 1, NUOPCModel__ModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcModel__ModelAdvance__ImplementsSubroutineEClass, NUOPCModel__ModelAdvance__ImplementsSubroutine.class, "NUOPCModel__ModelAdvance__ImplementsSubroutine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCModel__ModelAdvance__ImplementsSubroutine_Name(), ecorePackage.getEString(), "name", null, 1, 1, NUOPCModel__ModelAdvance__ImplementsSubroutine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcModel__ModelAdvance__AttachedEClass, NUOPCModel__ModelAdvance__Attached.class, "NUOPCModel__ModelAdvance__Attached", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCModel__ModelAdvance__Attached_Name(), ecorePackage.getEString(), "name", null, 1, 1, NUOPCModel__ModelAdvance__Attached.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriverEClass, NUOPCDriver.class, "NUOPCDriver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriver_Parent(), this.getNUOPCApplication(), this.getNUOPCApplication_NuopcDriver(), "parent", null, 1, 1, NUOPCDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver_Name(), ecorePackage.getEString(), "name", "DriverDefault", 1, 1, NUOPCDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver_GenericImports(), this.getNUOPCDriver__GenericImports(), null, "genericImports", null, 1, 1, NUOPCDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver_ModelImports(), this.getNUOPCDriver__ModelImports(), this.getNUOPCDriver__ModelImports_Parent(), "modelImports", null, 1, 1, NUOPCDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver_ConnectorImports(), this.getNUOPCDriver__ConnectorImports(), this.getNUOPCDriver__ConnectorImports_Parent(), "connectorImports", null, 0, 1, NUOPCDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver_ImplementsSetServices(), this.getNUOPCDriver__ImplementsSetServices(), this.getNUOPCDriver__ImplementsSetServices_Parent(), "implementsSetServices", null, 1, 1, NUOPCDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver_ImplementsSetModelCount(), this.getNUOPCDriver__ImplementsSetModelCount(), this.getNUOPCDriver__ImplementsSetModelCount_Parent(), "implementsSetModelCount", null, 0, 1, NUOPCDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver_ImplementsSetModelServices(), this.getNUOPCDriver__ImplementsSetModelServices(), this.getNUOPCDriver__ImplementsSetModelServices_Parent(), "implementsSetModelServices", null, 0, 1, NUOPCDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriver__GenericImportsEClass, NUOPCDriver__GenericImports.class, "NUOPCDriver__GenericImports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCDriver__GenericImports_ImportsGenericSS(), ecorePackage.getEString(), "importsGenericSS", "driver_routine_SS", 1, 1, NUOPCDriver__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__GenericImports_ImportsTypeDriverIS(), ecorePackage.getEString(), "importsTypeDriverIS", "driver_type_IS", 1, 1, NUOPCDriver__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__GenericImports_ImportsLabelSetModelCount(), ecorePackage.getEString(), "importsLabelSetModelCount", "driver_label_SetModelCount", 0, 1, NUOPCDriver__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__GenericImports_ImportsLabelSetModelServices(), ecorePackage.getEString(), "importsLabelSetModelServices", "driver_label_SetModelServices", 0, 1, NUOPCDriver__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriver__ModelImportsEClass, NUOPCDriver__ModelImports.class, "NUOPCDriver__ModelImports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriver__ModelImports_Parent(), this.getNUOPCDriver(), this.getNUOPCDriver_ModelImports(), "parent", null, 1, 1, NUOPCDriver__ModelImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver__ModelImports_ModelImport(), this.getNUOPCDriver__ModelImports__ModelImport(), this.getNUOPCDriver__ModelImports__ModelImport_Parent(), "modelImport", null, 0, -1, NUOPCDriver__ModelImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriver__ModelImports__ModelImportEClass, NUOPCDriver__ModelImports__ModelImport.class, "NUOPCDriver__ModelImports__ModelImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriver__ModelImports__ModelImport_Parent(), this.getNUOPCDriver__ModelImports(), this.getNUOPCDriver__ModelImports_ModelImport(), "parent", null, 1, 1, NUOPCDriver__ModelImports__ModelImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ModelImports__ModelImport_Name(), ecorePackage.getEString(), "name", null, 1, 1, NUOPCDriver__ModelImports__ModelImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ModelImports__ModelImport_SetServices(), ecorePackage.getEString(), "setServices", null, 1, 1, NUOPCDriver__ModelImports__ModelImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver__ModelImports__ModelImport_ModelRef(), this.getNUOPCModel(), null, "modelRef", null, 1, 1, NUOPCDriver__ModelImports__ModelImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriver__ConnectorImportsEClass, NUOPCDriver__ConnectorImports.class, "NUOPCDriver__ConnectorImports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriver__ConnectorImports_Parent(), this.getNUOPCDriver(), this.getNUOPCDriver_ConnectorImports(), "parent", null, 1, 1, NUOPCDriver__ConnectorImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver__ConnectorImports_ConnectorImport(), this.getNUOPCDriver__ConnectorImports__ConnectorImport(), this.getNUOPCDriver__ConnectorImports__ConnectorImport_Parent(), "connectorImport", null, 0, -1, NUOPCDriver__ConnectorImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriver__ConnectorImports__ConnectorImportEClass, NUOPCDriver__ConnectorImports__ConnectorImport.class, "NUOPCDriver__ConnectorImports__ConnectorImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriver__ConnectorImports__ConnectorImport_Parent(), this.getNUOPCDriver__ConnectorImports(), this.getNUOPCDriver__ConnectorImports_ConnectorImport(), "parent", null, 1, 1, NUOPCDriver__ConnectorImports__ConnectorImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ConnectorImports__ConnectorImport_Name(), ecorePackage.getEString(), "name", null, 1, 1, NUOPCDriver__ConnectorImports__ConnectorImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ConnectorImports__ConnectorImport_SetServices(), ecorePackage.getEString(), "setServices", "connector_SetServices", 1, 1, NUOPCDriver__ConnectorImports__ConnectorImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriver__ImplementsSetServicesEClass, NUOPCDriver__ImplementsSetServices.class, "NUOPCDriver__ImplementsSetServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriver__ImplementsSetServices_Parent(), this.getNUOPCDriver(), this.getNUOPCDriver_ImplementsSetServices(), "parent", null, 1, 1, NUOPCDriver__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetServices_Name(), ecorePackage.getEString(), "name", "SetServices", 1, 1, NUOPCDriver__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetServices_Param_gcomp(), ecorePackage.getEString(), "param_gcomp", "gcomp", 1, 1, NUOPCDriver__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetServices_Param_rc(), ecorePackage.getEString(), "param_rc", "rc", 1, 1, NUOPCDriver__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver__ImplementsSetServices_CallsGenericSetServices(), this.getCallsGenericSetServices(), null, "callsGenericSetServices", null, 1, 1, NUOPCDriver__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver__ImplementsSetServices_AttachesMethod(), this.getAttachesMethod(), null, "attachesMethod", null, 0, -1, NUOPCDriver__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriver__ImplementsSetModelCountEClass, NUOPCDriver__ImplementsSetModelCount.class, "NUOPCDriver__ImplementsSetModelCount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriver__ImplementsSetModelCount_Parent(), this.getNUOPCDriver(), this.getNUOPCDriver_ImplementsSetModelCount(), "parent", null, 1, 1, NUOPCDriver__ImplementsSetModelCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetModelCount_Gcomp(), ecorePackage.getEString(), "gcomp", "gcomp", 0, 1, NUOPCDriver__ImplementsSetModelCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetModelCount_Rc(), ecorePackage.getEString(), "rc", "rc", 0, 1, NUOPCDriver__ImplementsSetModelCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetModelCount_Name(), ecorePackage.getEString(), "name", "SetModelCount", 1, 1, NUOPCDriver__ImplementsSetModelCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetModelCount_DriverInternalState(), ecorePackage.getEString(), "driverInternalState", null, 0, 1, NUOPCDriver__ImplementsSetModelCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver__ImplementsSetModelCount_GetsInternalState(), this.getGetsInternalState(), null, "getsInternalState", null, 0, 1, NUOPCDriver__ImplementsSetModelCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetModelCount_AssignsValue(), ecorePackage.getEBoolean(), "assignsValue", null, 0, 1, NUOPCDriver__ImplementsSetModelCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetModelCount_Attached(), ecorePackage.getEBoolean(), "attached", null, 1, 1, NUOPCDriver__ImplementsSetModelCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriver__ImplementsSetModelServicesEClass, NUOPCDriver__ImplementsSetModelServices.class, "NUOPCDriver__ImplementsSetModelServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriver__ImplementsSetModelServices_Parent(), this.getNUOPCDriver(), this.getNUOPCDriver_ImplementsSetModelServices(), "parent", null, 1, 1, NUOPCDriver__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetModelServices_Gcomp(), ecorePackage.getEString(), "gcomp", "gcomp", 0, 1, NUOPCDriver__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetModelServices_Rc(), ecorePackage.getEString(), "rc", "rc", 0, 1, NUOPCDriver__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetModelServices_Name(), ecorePackage.getEString(), "name", "SetModelServices", 1, 1, NUOPCDriver__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetModelServices_DriverInternalState(), ecorePackage.getEString(), "driverInternalState", null, 0, 1, NUOPCDriver__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver__ImplementsSetModelServices_GetsInternalState(), this.getGetsInternalState(), null, "getsInternalState", null, 0, 1, NUOPCDriver__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetModelServices_AssignsValue(), ecorePackage.getEBoolean(), "assignsValue", null, 0, 1, NUOPCDriver__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetModelServices_Attached(), ecorePackage.getEBoolean(), "attached", null, 1, 1, NUOPCDriver__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver__ImplementsSetModelServices_SetModelServices(), this.getSetModelServices(), null, "setModelServices", null, 0, -1, NUOPCDriver__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver__ImplementsSetModelServices_SetCouplerServices(), this.getSetCouplerServices(), null, "setCouplerServices", null, 0, -1, NUOPCDriver__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriverAtmOcnEClass, NUOPCDriverAtmOcn.class, "NUOPCDriverAtmOcn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriverAtmOcn_Parent(), this.getNUOPCApplication(), this.getNUOPCApplication_NuopcDriverAtmOcn(), "parent", null, 1, 1, NUOPCDriverAtmOcn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn_Name(), ecorePackage.getEString(), "name", "DriverAtmOcnDefault", 1, 1, NUOPCDriverAtmOcn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriverAtmOcn_GenericImports(), this.getNUOPCDriverAtmOcn__GenericImports(), null, "genericImports", null, 1, 1, NUOPCDriverAtmOcn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriverAtmOcn_ModelImports(), this.getNUOPCDriverAtmOcn__ModelImports(), this.getNUOPCDriverAtmOcn__ModelImports_Parent(), "modelImports", null, 1, 1, NUOPCDriverAtmOcn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriverAtmOcn_ImplementsSetServices(), this.getNUOPCDriverAtmOcn__ImplementsSetServices(), this.getNUOPCDriverAtmOcn__ImplementsSetServices_Parent(), "implementsSetServices", null, 1, 1, NUOPCDriverAtmOcn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriverAtmOcn_ImplementsSetModelCount(), this.getNUOPCDriverAtmOcn__ImplementsSetModelCount(), this.getNUOPCDriverAtmOcn__ImplementsSetModelCount_Parent(), "implementsSetModelCount", null, 0, 1, NUOPCDriverAtmOcn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriverAtmOcn_ImplementsSetModelServices(), this.getNUOPCDriverAtmOcn__ImplementsSetModelServices(), this.getNUOPCDriverAtmOcn__ImplementsSetModelServices_Parent(), "implementsSetModelServices", null, 0, 1, NUOPCDriverAtmOcn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriverAtmOcn_ImplementsSetModelPetLists(), this.getNUOPCDriverAtmOcn__ImplementsSetModelPetLists(), this.getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_Parent(), "implementsSetModelPetLists", null, 0, 1, NUOPCDriverAtmOcn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriverAtmOcn__GenericImportsEClass, NUOPCDriverAtmOcn__GenericImports.class, "NUOPCDriverAtmOcn__GenericImports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCDriverAtmOcn__GenericImports_ImportsGenericSS(), ecorePackage.getEString(), "importsGenericSS", "driver_routine_SS", 1, 1, NUOPCDriverAtmOcn__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__GenericImports_ImportsTypeDriverIS(), ecorePackage.getEString(), "importsTypeDriverIS", "driver_type_IS", 1, 1, NUOPCDriverAtmOcn__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__GenericImports_ImportsLabelSetModelCount(), ecorePackage.getEString(), "importsLabelSetModelCount", "driver_label_SetModelCount", 0, 1, NUOPCDriverAtmOcn__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__GenericImports_ImportsLabelSetModelServices(), ecorePackage.getEString(), "importsLabelSetModelServices", "driver_label_SetModelServices", 0, 1, NUOPCDriverAtmOcn__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__GenericImports_ImportsLabelSetModelPetLists(), ecorePackage.getEString(), "importsLabelSetModelPetLists", "driver_label_SetModelPetLists", 0, 1, NUOPCDriverAtmOcn__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriverAtmOcn__ModelImportsEClass, NUOPCDriverAtmOcn__ModelImports.class, "NUOPCDriverAtmOcn__ModelImports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriverAtmOcn__ModelImports_Parent(), this.getNUOPCDriverAtmOcn(), this.getNUOPCDriverAtmOcn_ModelImports(), "parent", null, 1, 1, NUOPCDriverAtmOcn__ModelImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriverAtmOcn__ModelImports_ModelImport(), this.getNUOPCDriverAtmOcn__ModelImports__ModelImport(), this.getNUOPCDriverAtmOcn__ModelImports__ModelImport_Parent(), "modelImport", null, 0, -1, NUOPCDriverAtmOcn__ModelImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriverAtmOcn__ImplementsSetServicesEClass, NUOPCDriverAtmOcn__ImplementsSetServices.class, "NUOPCDriverAtmOcn__ImplementsSetServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriverAtmOcn__ImplementsSetServices_Parent(), this.getNUOPCDriverAtmOcn(), this.getNUOPCDriverAtmOcn_ImplementsSetServices(), "parent", null, 1, 1, NUOPCDriverAtmOcn__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetServices_Name(), ecorePackage.getEString(), "name", "SetServices", 1, 1, NUOPCDriverAtmOcn__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetServices_Param_gcomp(), ecorePackage.getEString(), "param_gcomp", "gcomp", 1, 1, NUOPCDriverAtmOcn__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetServices_Param_rc(), ecorePackage.getEString(), "param_rc", "rc", 1, 1, NUOPCDriverAtmOcn__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriverAtmOcn__ImplementsSetServices_CallsGenericSetServices(), this.getCallsGenericSetServices(), null, "callsGenericSetServices", null, 1, 1, NUOPCDriverAtmOcn__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriverAtmOcn__ImplementsSetServices_AttachesMethod(), this.getAttachesMethod(), null, "attachesMethod", null, 0, -1, NUOPCDriverAtmOcn__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriverAtmOcn__ImplementsSetModelCountEClass, NUOPCDriverAtmOcn__ImplementsSetModelCount.class, "NUOPCDriverAtmOcn__ImplementsSetModelCount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriverAtmOcn__ImplementsSetModelCount_Parent(), this.getNUOPCDriverAtmOcn(), this.getNUOPCDriverAtmOcn_ImplementsSetModelCount(), "parent", null, 1, 1, NUOPCDriverAtmOcn__ImplementsSetModelCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelCount_Gcomp(), ecorePackage.getEString(), "gcomp", "gcomp", 0, 1, NUOPCDriverAtmOcn__ImplementsSetModelCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelCount_Rc(), ecorePackage.getEString(), "rc", "rc", 0, 1, NUOPCDriverAtmOcn__ImplementsSetModelCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelCount_Name(), ecorePackage.getEString(), "name", "SetModelCount", 1, 1, NUOPCDriverAtmOcn__ImplementsSetModelCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelCount_DriverInternalState(), ecorePackage.getEString(), "driverInternalState", null, 0, 1, NUOPCDriverAtmOcn__ImplementsSetModelCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriverAtmOcn__ImplementsSetModelCount_GetsInternalState(), this.getGetsInternalState(), null, "getsInternalState", null, 0, 1, NUOPCDriverAtmOcn__ImplementsSetModelCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelCount_AssignsValue(), ecorePackage.getEBoolean(), "assignsValue", null, 0, 1, NUOPCDriverAtmOcn__ImplementsSetModelCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelCount_Attached(), ecorePackage.getEBoolean(), "attached", null, 1, 1, NUOPCDriverAtmOcn__ImplementsSetModelCount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriverAtmOcn__ImplementsSetModelServicesEClass, NUOPCDriverAtmOcn__ImplementsSetModelServices.class, "NUOPCDriverAtmOcn__ImplementsSetModelServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriverAtmOcn__ImplementsSetModelServices_Parent(), this.getNUOPCDriverAtmOcn(), this.getNUOPCDriverAtmOcn_ImplementsSetModelServices(), "parent", null, 1, 1, NUOPCDriverAtmOcn__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelServices_Gcomp(), ecorePackage.getEString(), "gcomp", "gcomp", 0, 1, NUOPCDriverAtmOcn__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelServices_Rc(), ecorePackage.getEString(), "rc", "rc", 0, 1, NUOPCDriverAtmOcn__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelServices_Name(), ecorePackage.getEString(), "name", "SetModelServices", 1, 1, NUOPCDriverAtmOcn__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelServices_DriverInternalState(), ecorePackage.getEString(), "driverInternalState", null, 0, 1, NUOPCDriverAtmOcn__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriverAtmOcn__ImplementsSetModelServices_GetsInternalState(), this.getGetsInternalState(), null, "getsInternalState", null, 0, 1, NUOPCDriverAtmOcn__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelServices_AssignsValue(), ecorePackage.getEBoolean(), "assignsValue", null, 0, 1, NUOPCDriverAtmOcn__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelServices_Attached(), ecorePackage.getEBoolean(), "attached", null, 1, 1, NUOPCDriverAtmOcn__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriverAtmOcn__ImplementsSetModelServices_SetModelServices(), this.getSetModelServices(), null, "setModelServices", null, 0, -1, NUOPCDriverAtmOcn__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriverAtmOcn__ImplementsSetModelServices_SetCouplerServices(), this.getSetCouplerServices(), null, "setCouplerServices", null, 0, -1, NUOPCDriverAtmOcn__ImplementsSetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass, NUOPCDriverAtmOcn__ImplementsSetModelPetLists.class, "NUOPCDriverAtmOcn__ImplementsSetModelPetLists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_Parent(), this.getNUOPCDriverAtmOcn(), this.getNUOPCDriverAtmOcn_ImplementsSetModelPetLists(), "parent", null, 1, 1, NUOPCDriverAtmOcn__ImplementsSetModelPetLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_Gcomp(), ecorePackage.getEString(), "gcomp", "gcomp", 0, 1, NUOPCDriverAtmOcn__ImplementsSetModelPetLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_Rc(), ecorePackage.getEString(), "rc", "rc", 0, 1, NUOPCDriverAtmOcn__ImplementsSetModelPetLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_Name(), ecorePackage.getEString(), "name", "SetModelServices", 1, 1, NUOPCDriverAtmOcn__ImplementsSetModelPetLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_DriverInternalState(), ecorePackage.getEString(), "driverInternalState", null, 0, 1, NUOPCDriverAtmOcn__ImplementsSetModelPetLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_GetsInternalState(), this.getGetsInternalState(), null, "getsInternalState", null, 0, 1, NUOPCDriverAtmOcn__ImplementsSetModelPetLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_AssignsValue(), ecorePackage.getEBoolean(), "assignsValue", null, 0, 1, NUOPCDriverAtmOcn__ImplementsSetModelPetLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_Attached(), ecorePackage.getEBoolean(), "attached", null, 1, 1, NUOPCDriverAtmOcn__ImplementsSetModelPetLists.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriverAtmOcn__ModelImports__ModelImportEClass, NUOPCDriverAtmOcn__ModelImports__ModelImport.class, "NUOPCDriverAtmOcn__ModelImports__ModelImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriverAtmOcn__ModelImports__ModelImport_Parent(), this.getNUOPCDriverAtmOcn__ModelImports(), this.getNUOPCDriverAtmOcn__ModelImports_ModelImport(), "parent", null, 1, 1, NUOPCDriverAtmOcn__ModelImports__ModelImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ModelImports__ModelImport_Name(), ecorePackage.getEString(), "name", null, 1, 1, NUOPCDriverAtmOcn__ModelImports__ModelImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ModelImports__ModelImport_SetServices(), ecorePackage.getEString(), "setServices", null, 1, 1, NUOPCDriverAtmOcn__ModelImports__ModelImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriverAtmOcn__ModelImports__ModelImport_ModelRef(), this.getNUOPCModel(), null, "modelRef", null, 1, 1, NUOPCDriverAtmOcn__ModelImports__ModelImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callsGenericSetServicesEClass, CallsGenericSetServices.class, "CallsGenericSetServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallsGenericSetServices_Gcomp(), ecorePackage.getEString(), "gcomp", "gcomp", 1, 1, CallsGenericSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallsGenericSetServices_Rc(), ecorePackage.getEString(), "rc", "rc", 1, 1, CallsGenericSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callsSetEntryPointEClass, CallsSetEntryPoint.class, "CallsSetEntryPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallsSetEntryPoint_Method(), ecorePackage.getEString(), "method", null, 1, 1, CallsSetEntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallsSetEntryPoint_UserRoutine(), ecorePackage.getEString(), "userRoutine", null, 1, 1, CallsSetEntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallsSetEntryPoint_Phase(), ecorePackage.getEString(), "phase", null, 0, 1, CallsSetEntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachesMethodEClass, AttachesMethod.class, "AttachesMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttachesMethod_Name(), ecorePackage.getEString(), "name", null, 1, 1, AttachesMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachesMethod_UserRoutine(), ecorePackage.getEString(), "userRoutine", null, 1, 1, AttachesMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachesMethod_Index(), ecorePackage.getEString(), "index", null, 0, 1, AttachesMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setModelServicesEClass, SetModelServices.class, "SetModelServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetModelServices_ModelComp(), ecorePackage.getEString(), "modelComp", null, 1, 1, SetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetModelServices_SubroutineName(), ecorePackage.getEString(), "subroutineName", null, 1, 1, SetModelServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setCouplerServicesEClass, SetCouplerServices.class, "SetCouplerServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetCouplerServices_CplComp(), ecorePackage.getEString(), "cplComp", null, 1, 1, SetCouplerServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetCouplerServices_SubroutineName(), ecorePackage.getEString(), "subroutineName", null, 1, 1, SetCouplerServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getsInternalStateEClass, GetsInternalState.class, "GetsInternalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetsInternalState_Label(), ecorePackage.getEString(), "label", null, 0, 1, GetsInternalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcMediatorEClass, NUOPCMediator.class, "NUOPCMediator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCMediator_Name(), ecorePackage.getEString(), "name", "Model", 1, 1, NUOPCMediator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCMediator_GenericImports(), this.getNUOPCMediator__GenericImports(), null, "genericImports", null, 1, 1, NUOPCMediator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCMediator_ImplementsSetServices(), this.getNUOPCMediator__ImplementsSetServices(), this.getNUOPCMediator__ImplementsSetServices_Parent(), "implementsSetServices", null, 1, 1, NUOPCMediator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNUOPCMediator_ImplementsSetServices().getEKeys().add(this.getNUOPCMediator__ImplementsSetServices_Name());
		initEReference(getNUOPCMediator_Initialize(), this.getNUOPCMediator__Init(), this.getNUOPCMediator__Init_Parent(), "initialize", null, 1, 1, NUOPCMediator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCMediator_ImplementsModelAdvance(), this.getNUOPCMediator__ModelAdvance(), this.getNUOPCMediator__ModelAdvance_Parent(), "implementsModelAdvance", null, 0, -1, NUOPCMediator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcMediator__GenericImportsEClass, NUOPCMediator__GenericImports.class, "NUOPCMediator__GenericImports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCMediator__GenericImports_ImportsGenericSS(), ecorePackage.getEString(), "importsGenericSS", "model_routine_SS", 1, 1, NUOPCMediator__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__GenericImports_ImportsLabelModelAdvance(), ecorePackage.getEString(), "importsLabelModelAdvance", "model_label_Advance", 0, 1, NUOPCMediator__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcMediator__InitEClass, NUOPCMediator__Init.class, "NUOPCMediator__Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCMediator__Init_Parent(), this.getNUOPCMediator(), this.getNUOPCMediator_Initialize(), "parent", null, 1, 1, NUOPCMediator__Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCMediator__Init_ImplementsInitP1(), this.getNUOPCMediator__ImplementsInitP1(), this.getNUOPCMediator__ImplementsInitP1_Parent(), "implementsInitP1", null, 1, 1, NUOPCMediator__Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNUOPCMediator__Init_ImplementsInitP1().getEKeys().add(this.getNUOPCMediator__ImplementsInitP1_Name());
		initEReference(getNUOPCMediator__Init_ImplementsInitP2(), this.getNUOPCMediator__ImplementsInitP2(), this.getNUOPCMediator__ImplementsInitP2_Parent(), "implementsInitP2", null, 1, 1, NUOPCMediator__Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNUOPCMediator__Init_ImplementsInitP2().getEKeys().add(this.getNUOPCMediator__ImplementsInitP2_Name());

		initEClass(nuopcMediator__ImplementsSetServicesEClass, NUOPCMediator__ImplementsSetServices.class, "NUOPCMediator__ImplementsSetServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCMediator__ImplementsSetServices_Parent(), this.getNUOPCMediator(), this.getNUOPCMediator_ImplementsSetServices(), "parent", null, 1, 1, NUOPCMediator__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ImplementsSetServices_Name(), ecorePackage.getEString(), "name", "SetServices", 1, 1, NUOPCMediator__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ImplementsSetServices_Param_gcomp(), ecorePackage.getEString(), "param_gcomp", "gcomp", 1, 1, NUOPCMediator__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ImplementsSetServices_Param_rc(), ecorePackage.getEString(), "param_rc", "rc", 1, 1, NUOPCMediator__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCMediator__ImplementsSetServices_CallsGenericSetServices(), this.getCallsGenericSetServices(), null, "callsGenericSetServices", null, 1, 1, NUOPCMediator__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCMediator__ImplementsSetServices_CallsSetEntryPoint(), this.getCallsSetEntryPoint(), null, "callsSetEntryPoint", null, 0, -1, NUOPCMediator__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCMediator__ImplementsSetServices_AttachesMethod(), this.getAttachesMethod(), null, "attachesMethod", null, 0, -1, NUOPCMediator__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(nuopcMediator__ImplementsInitP1EClass, NUOPCMediator__ImplementsInitP1.class, "NUOPCMediator__ImplementsInitP1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCMediator__ImplementsInitP1_Parent(), this.getNUOPCMediator__Init(), this.getNUOPCMediator__Init_ImplementsInitP1(), "parent", null, 1, 1, NUOPCMediator__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ImplementsInitP1_Name(), ecorePackage.getEString(), "name", "InitP1", 1, 1, NUOPCMediator__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ImplementsInitP1_ImportParam(), ecorePackage.getEString(), "importParam", "importState", 1, 1, NUOPCMediator__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ImplementsInitP1_ExportParam(), ecorePackage.getEString(), "exportParam", "exportState", 1, 1, NUOPCMediator__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCMediator__ImplementsInitP1_AdvertisesImportField(), this.getNUOPCMediator__AdvertisesImportField(), this.getNUOPCMediator__AdvertisesImportField_Parent(), "advertisesImportField", null, 0, -1, NUOPCMediator__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCMediator__ImplementsInitP1_AdvertisesExportField(), this.getNUOPCMediator__AdvertisesExportField(), this.getNUOPCMediator__AdvertisesExportField_Parent(), "advertisesExportField", null, 0, -1, NUOPCMediator__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ImplementsInitP1_AdvertisesAtLeastOneField(), ecorePackage.getEBoolean(), "advertisesAtLeastOneField", null, 1, 1, NUOPCMediator__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ImplementsInitP1_RegisteredInSetServices(), ecorePackage.getEBoolean(), "registeredInSetServices", null, 1, 1, NUOPCMediator__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ImplementsInitP1_AdvertisesOrRegistered(), ecorePackage.getEBoolean(), "advertisesOrRegistered", null, 1, 1, NUOPCMediator__ImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcMediator__ImplementsInitP2EClass, NUOPCMediator__ImplementsInitP2.class, "NUOPCMediator__ImplementsInitP2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCMediator__ImplementsInitP2_Parent(), this.getNUOPCMediator__Init(), this.getNUOPCMediator__Init_ImplementsInitP2(), "parent", null, 1, 1, NUOPCMediator__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ImplementsInitP2_Name(), ecorePackage.getEString(), "name", "InitP2", 1, 1, NUOPCMediator__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ImplementsInitP2_ImportParam(), ecorePackage.getEString(), "importParam", "importState", 1, 1, NUOPCMediator__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ImplementsInitP2_ExportParam(), ecorePackage.getEString(), "exportParam", "exportState", 1, 1, NUOPCMediator__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCMediator__ImplementsInitP2_RealizesImportField(), this.getNUOPCMediator__RealizesImportField(), this.getNUOPCMediator__RealizesImportField_Parent(), "realizesImportField", null, 0, -1, NUOPCMediator__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCMediator__ImplementsInitP2_RealizesExportField(), this.getNUOPCMediator__RealizesExportField(), this.getNUOPCMediator__RealizesExportField_Parent(), "realizesExportField", null, 0, -1, NUOPCMediator__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ImplementsInitP2_RealizesAtLeastOneField(), ecorePackage.getEBoolean(), "realizesAtLeastOneField", null, 1, 1, NUOPCMediator__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ImplementsInitP2_RegisteredInSetServices(), ecorePackage.getEBoolean(), "registeredInSetServices", null, 1, 1, NUOPCMediator__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ImplementsInitP2_RealizesOrRegistered(), ecorePackage.getEBoolean(), "realizesOrRegistered", null, 1, 1, NUOPCMediator__ImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcMediator__AdvertisesImportFieldEClass, NUOPCMediator__AdvertisesImportField.class, "NUOPCMediator__AdvertisesImportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCMediator__AdvertisesImportField_Parent(), this.getNUOPCMediator__ImplementsInitP1(), this.getNUOPCMediator__ImplementsInitP1_AdvertisesImportField(), "parent", null, 1, 1, NUOPCMediator__AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__AdvertisesImportField_AddsToState(), ecorePackage.getEString(), "addsToState", "importState", 1, 1, NUOPCMediator__AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__AdvertisesImportField_Rc(), ecorePackage.getEString(), "rc", "rc", 1, 1, NUOPCMediator__AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__AdvertisesImportField_AddsToImportState(), ecorePackage.getEBoolean(), "addsToImportState", null, 1, 1, NUOPCMediator__AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__AdvertisesImportField_StandardName(), ecorePackage.getEString(), "standardName", "\"Standard_Name\"", 1, 1, NUOPCMediator__AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcMediator__AdvertisesExportFieldEClass, NUOPCMediator__AdvertisesExportField.class, "NUOPCMediator__AdvertisesExportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCMediator__AdvertisesExportField_Parent(), this.getNUOPCMediator__ImplementsInitP1(), this.getNUOPCMediator__ImplementsInitP1_AdvertisesExportField(), "parent", null, 1, 1, NUOPCMediator__AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__AdvertisesExportField_Rc(), ecorePackage.getEString(), "rc", "rc", 1, 1, NUOPCMediator__AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__AdvertisesExportField_AddsToState(), ecorePackage.getEString(), "addsToState", "exportState", 1, 1, NUOPCMediator__AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__AdvertisesExportField_AddsToExportState(), ecorePackage.getEBoolean(), "addsToExportState", null, 1, 1, NUOPCMediator__AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__AdvertisesExportField_StandardName(), ecorePackage.getEString(), "standardName", "\"Standard_Name\"", 1, 1, NUOPCMediator__AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcMediator__RealizesImportFieldEClass, NUOPCMediator__RealizesImportField.class, "NUOPCMediator__RealizesImportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCMediator__RealizesImportField_Parent(), this.getNUOPCMediator__ImplementsInitP2(), this.getNUOPCMediator__ImplementsInitP2_RealizesImportField(), "parent", null, 1, 1, NUOPCMediator__RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__RealizesImportField_RealizedInState(), ecorePackage.getEString(), "realizedInState", "importState", 1, 1, NUOPCMediator__RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__RealizesImportField_Rc(), ecorePackage.getEString(), "rc", "rc", 1, 1, NUOPCMediator__RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__RealizesImportField_RealizedInImportState(), ecorePackage.getEBoolean(), "realizedInImportState", null, 1, 1, NUOPCMediator__RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__RealizesImportField_Field(), ecorePackage.getEString(), "field", null, 1, 1, NUOPCMediator__RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcMediator__RealizesExportFieldEClass, NUOPCMediator__RealizesExportField.class, "NUOPCMediator__RealizesExportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCMediator__RealizesExportField_Parent(), this.getNUOPCMediator__ImplementsInitP2(), this.getNUOPCMediator__ImplementsInitP2_RealizesExportField(), "parent", null, 1, 1, NUOPCMediator__RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__RealizesExportField_RealizedInState(), ecorePackage.getEString(), "realizedInState", "exportState", 1, 1, NUOPCMediator__RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__RealizesExportField_Rc(), ecorePackage.getEString(), "rc", "rc", 1, 1, NUOPCMediator__RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__RealizesExportField_RealizedInExportState(), ecorePackage.getEBoolean(), "realizedInExportState", null, 1, 1, NUOPCMediator__RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__RealizesExportField_Field(), ecorePackage.getEString(), "field", null, 1, 1, NUOPCMediator__RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcMediator__ModelAdvanceEClass, NUOPCMediator__ModelAdvance.class, "NUOPCMediator__ModelAdvance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCMediator__ModelAdvance_Parent(), this.getNUOPCMediator(), this.getNUOPCMediator_ImplementsModelAdvance(), "parent", null, 1, 1, NUOPCMediator__ModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ModelAdvance_Name(), ecorePackage.getEString(), "name", "ModelAdvance", 1, 1, NUOPCMediator__ModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCMediator__ModelAdvance_AttachedModelAdvance(), ecorePackage.getEBoolean(), "attachedModelAdvance", null, 1, 1, NUOPCMediator__ModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.earthsystemcog.org/projects/nuopc
		createNuopcAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
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
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });																			
		addAnnotation
		  (nuopcModel__ImplementsSetServicesEClass, 
		   source, 
		   new String[] {
			 "constraints", "registersInitP1 registersInitP2"
		   });																																																																																																																																														
		addAnnotation
		  (nuopcMediator__ImplementsSetServicesEClass, 
		   source, 
		   new String[] {
			 "constraints", "registersInitP1 registersInitP2"
		   });																																			
	}

	/**
	 * Initializes the annotations for <b>http://www.earthsystemcog.org/projects/nuopc</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNuopcAnnotations() {
		String source = "http://www.earthsystemcog.org/projects/nuopc";			
		addAnnotation
		  (nuopcApplicationEClass, 
		   source, 
		   new String[] {
			 "label", "NUOPC Application",
			 "icon", "application_cascade.png"
		   });		
		addAnnotation
		  (getNUOPCApplication_NuopcModel(), 
		   source, 
		   new String[] {
			 "mapping", "module"
		   });		
		addAnnotation
		  (getNUOPCApplication_NuopcDriver(), 
		   source, 
		   new String[] {
			 "mapping", "module"
		   });		
		addAnnotation
		  (getNUOPCApplication_NuopcDriverAtmOcn(), 
		   source, 
		   new String[] {
			 "mapping", "module"
		   });		
		addAnnotation
		  (getNUOPCApplication_NuopcMediator(), 
		   source, 
		   new String[] {
			 "mapping", "module"
		   });			
		addAnnotation
		  (nuopcModelEClass, 
		   source, 
		   new String[] {
			 "label", "NUOPC Model",
			 "doc", "NUOPC Model is a generic model component that wraps a model code so it is suitable to be plugged into a generic Driver component."
		   });		
		addAnnotation
		  (getNUOPCModel_Name(), 
		   source, 
		   new String[] {
			 "mapping", "moduleName"
		   });		
		addAnnotation
		  (getNUOPCModel_GenericImports(), 
		   source, 
		   new String[] {
			 "mapping", "usesModule: \"NUOPC_Model\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (getNUOPCModel_ImplementsSetServices(), 
		   source, 
		   new String[] {
			 "mapping", "#.. subroutine: \"#name(inout type(ESMF_GridComp) #gcomp, out integer #rc)\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (getNUOPCModel_ImplementsModelAdvance(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(type(ESMF_GridComp), integer)\""
		   });		
		addAnnotation
		  (nuopcModel__GenericImportsEClass, 
		   source, 
		   new String[] {
			 "label", "Imports from NUOPC Model",
			 "doc", "Subclasses of NUOPC Model should import generic subroutines, types, and labels from NUOPC_Model.",
			 "icon", "import.png"
		   });		
		addAnnotation
		  (getNUOPCModel__GenericImports_ImportsGenericSS(), 
		   source, 
		   new String[] {
			 "mapping", "usesEntity: \"routine_SetServices\"",
			 "label", "routine_SetServices",
			 "doc", "Subclasses of NUOPC Model should import the public generic Set Services subroutine \"routine_SetServices\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (getNUOPCModel__GenericImports_ImportsLabelModelAdvance(), 
		   source, 
		   new String[] {
			 "mapping", "usesEntity: \"label_Advance\"",
			 "label", "label_Advance"
		   });		
		addAnnotation
		  (nuopcModel__InitEClass, 
		   source, 
		   new String[] {
			 "label", "Model Initialization",
			 "doc", "Framework concepts related to initializing this NUOPC Model"
		   });		
		addAnnotation
		  (getNUOPCModel__Init_ImplementsInitP1(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\""
		   });		
		addAnnotation
		  (getNUOPCModel__Init_ImplementsInitP2(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) #ignore, out integer #ignore)\""
		   });			
		addAnnotation
		  (nuopcModel__ImplementsSetServicesEClass, 
		   source, 
		   new String[] {
			 "label", "Set Services",
			 "doc", "In general, a Set Services method is a public subroutine that sets entry points for the component. This subroutine should call the Set Services subroutine in the generic NUOPC Model component."
		   });			
		addAnnotation
		  (getNUOPCModel__ImplementsSetServices_CallsGenericSetServices(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"#../../genericImports/importsGenericSS(#gcomp, rc=#rc)\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (getNUOPCModel__ImplementsSetServices_CallsSetEntryPoint(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_GridCompSetEntryPoint(#ignore, #method, userRoutine=#userRoutine, phase?=#phase, rc=#ignore)\""
		   });		
		addAnnotation
		  (getNUOPCModel__ImplementsSetServices_AttachesMethod(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_MethodAdd(#ignore, index?=#index, label=#name, userRoutine=#userRoutine, rc=#ignore)\""
		   });		
		addAnnotation
		  (nuopcModel__ImplementsInitP1EClass, 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\"",
			 "doc", "Initialize Phase Definition: IPDv01p1\r\n\r\nIn this phase, models should advertise the set of import and export fields. This is the list of fields that may potentially be exchanged during coupling, although some fields may not be connected for a particular configuration.",
			 "label", "Initialize Phase Definition - IPDv01p1",
			 "task", "Implement Init Phase Definition (IPDv01p1)"
		   });		
		addAnnotation
		  (getNUOPCModel__ImplementsInitP1_Name(), 
		   source, 
		   new String[] {
			 "mappingX", "subroutineName"
		   });		
		addAnnotation
		  (getNUOPCModel__ImplementsInitP1_AdvertisesImportField(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"NUOPC_StateAdvertiseField(#addsToState, StandardName=#standardName, #rc)\""
		   });		
		addAnnotation
		  (getNUOPCModel__ImplementsInitP1_AdvertisesExportField(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"NUOPC_StateAdvertiseField(#addsToState, StandardName=#standardName, #rc)\""
		   });				
		addAnnotation
		  (getNUOPCModel__ImplementsInitP1_AdvertisesOrRegistered(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (nuopcModel__ImplementsInitP2EClass, 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\"",
			 "doc", "Initialize Phase Definition: IPDv01p2\r\n\r\nIn this phase, models should realize the set of import and export fields. ",
			 "label", "Initialize Phase Definition - IPDv01p2",
			 "iconAdd", "cog_add.png",
			 "task", "Implement Init Phase Definition (IPDv01p2)"
		   });		
		addAnnotation
		  (getNUOPCModel__ImplementsInitP2_RealizesImportField(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"NUOPC_StateRealizeField(#realizedInState, field=#field, rc=#rc)\""
		   });		
		addAnnotation
		  (getNUOPCModel__ImplementsInitP2_RealizesExportField(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"NUOPC_StateRealizeField(#realizedInState, field=#field, rc=#rc)\""
		   });				
		addAnnotation
		  (getNUOPCModel__ImplementsInitP2_RealizesOrRegistered(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (nuopcModel__AdvertisesImportFieldEClass, 
		   source, 
		   new String[] {
			 "label", "Advertise Import Field",
			 "task", "Advertise Import Field"
		   });		
		addAnnotation
		  (getNUOPCModel__AdvertisesImportField_AddsToImportState(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (nuopcModel__AdvertisesExportFieldEClass, 
		   source, 
		   new String[] {
			 "label", "Advertise Export Field",
			 "task", "Advertise Export Field"
		   });		
		addAnnotation
		  (getNUOPCModel__AdvertisesExportField_AddsToExportState(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (nuopcModel__RealizesImportFieldEClass, 
		   source, 
		   new String[] {
			 "mapping", "call: NUOPC_StateRealizeField",
			 "label", "Realize Import Field",
			 "task", "Realize Import Field"
		   });		
		addAnnotation
		  (getNUOPCModel__RealizesImportField_RealizedInImportState(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (getNUOPCModel__RealizesImportField_Field(), 
		   source, 
		   new String[] {
			 "mappingX", "argByIndex: 2"
		   });		
		addAnnotation
		  (nuopcModel__RealizesExportFieldEClass, 
		   source, 
		   new String[] {
			 "label", "Realize Export Field",
			 "task", "Realize Export Field"
		   });		
		addAnnotation
		  (getNUOPCModel__RealizesExportField_RealizedInExportState(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (getNUOPCModel__RealizesExportField_Field(), 
		   source, 
		   new String[] {
			 "mappingX", "argByIndex: 2"
		   });		
		addAnnotation
		  (nuopcModel__ImplementsModelAdvanceEClass, 
		   source, 
		   new String[] {
			 "label", "Model Advance",
			 "doc", "A subroutine called to advance the model ahead by the timestep interval."
		   });		
		addAnnotation
		  (getNUOPCModel__ImplementsModelAdvance_AttachedModelAdvance(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (getNUOPCModel__ModelAdvance_ImplementsSubroutine(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(type(ESMF_GridComp), integer)\""
		   });		
		addAnnotation
		  (getNUOPCModel__ModelAdvance_Attached(), 
		   source, 
		   new String[] {
			 "mapping", "#../../implementsSetServices call: \"ESMF_MethodAdd(#ignore, index?=#index, label=#name, userRoutine=#userRoutine, rc=#ignore)\""
		   });		
		addAnnotation
		  (nuopcDriverEClass, 
		   source, 
		   new String[] {
			 "mapping", "module",
			 "label", "NUOPC Driver",
			 "doc", "NUOPC Driver is the generic driver component. It implements a child component harness, made of State and Component objects, that follows the NUOPC Common Model Architecture. It is specialized by plugging Model, Mediator, and Connector components into the harness. Driver components can be plugged into the harness to construct component hierarchies. The generic Driver initializes its child components according to a standard Initialization Phase Definition, and drives their Run() methods according a customizable run sequence."
		   });		
		addAnnotation
		  (getNUOPCDriver_Name(), 
		   source, 
		   new String[] {
			 "mapping", "moduleName"
		   });		
		addAnnotation
		  (getNUOPCDriver_GenericImports(), 
		   source, 
		   new String[] {
			 "mapping", "usesModule: \"NUOPC_Driver\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (getNUOPCDriver_ImplementsSetServices(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(type(ESMF_GridComp) #param_gcomp, integer #param_rc)\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (getNUOPCDriver_ImplementsSetModelCount(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(type(ESMF_GridComp) #gcomp, integer #rc)\""
		   });		
		addAnnotation
		  (getNUOPCDriver_ImplementsSetModelServices(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(type(ESMF_GridComp) #gcomp, integer #rc)\""
		   });		
		addAnnotation
		  (nuopcDriver__GenericImportsEClass, 
		   source, 
		   new String[] {
			 "label", "Imports from NUOPC Driver",
			 "doc", "Subclasses of NUOPC Driver should import generic subroutines, types, and labels from NUOPC_Driver.",
			 "icon", "import.png"
		   });		
		addAnnotation
		  (getNUOPCDriver__GenericImports_ImportsGenericSS(), 
		   source, 
		   new String[] {
			 "mapping", "usesEntity: \"routine_SetServices\"",
			 "label", "routine_SetServices",
			 "doc", "Subclasses of NUOPC Driver should import the public generic Set Services subroutine \"routine_SetServices\""
		   });		
		addAnnotation
		  (getNUOPCDriver__GenericImports_ImportsTypeDriverIS(), 
		   source, 
		   new String[] {
			 "mapping", "usesEntity: \"type_InternalState\"",
			 "label", "type_InternalState"
		   });		
		addAnnotation
		  (getNUOPCDriver__GenericImports_ImportsLabelSetModelCount(), 
		   source, 
		   new String[] {
			 "mapping", "usesEntity: \"label_SetModelCount\"",
			 "label", "label_SetModelCount"
		   });		
		addAnnotation
		  (getNUOPCDriver__GenericImports_ImportsLabelSetModelServices(), 
		   source, 
		   new String[] {
			 "mapping", "usesEntity: \"label_SetModelServices\"",
			 "label", "label_SetModelServices"
		   });		
		addAnnotation
		  (nuopcDriver__ModelImportsEClass, 
		   source, 
		   new String[] {
			 "label", "Child Model Imports",
			 "icon", "import.png"
		   });		
		addAnnotation
		  (getNUOPCDriver__ModelImports_ModelImport(), 
		   source, 
		   new String[] {
			 "mapping", "usesModule: \"#name\""
		   });		
		addAnnotation
		  (nuopcDriver__ModelImports__ModelImportEClass, 
		   source, 
		   new String[] {
			 "label", "Model Import"
		   });		
		addAnnotation
		  (getNUOPCDriver__ModelImports__ModelImport_SetServices(), 
		   source, 
		   new String[] {
			 "mapping", "usesEntity"
		   });		
		addAnnotation
		  (getNUOPCDriver__ModelImports__ModelImport_ModelRef(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (nuopcDriver__ConnectorImportsEClass, 
		   source, 
		   new String[] {
			 "label", "Child Connector Imports",
			 "icon", "import.png"
		   });		
		addAnnotation
		  (getNUOPCDriver__ConnectorImports_ConnectorImport(), 
		   source, 
		   new String[] {
			 "mapping", "usesModule: \"NUOPC_Connector\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (nuopcDriver__ConnectorImports__ConnectorImportEClass, 
		   source, 
		   new String[] {
			 "label", "Connector Import"
		   });		
		addAnnotation
		  (getNUOPCDriver__ConnectorImports__ConnectorImport_Name(), 
		   source, 
		   new String[] {
			 "mapping", "moduleName"
		   });		
		addAnnotation
		  (getNUOPCDriver__ConnectorImports__ConnectorImport_SetServices(), 
		   source, 
		   new String[] {
			 "mapping", "usesEntity: \"routine_SetServices\""
		   });		
		addAnnotation
		  (nuopcDriver__ImplementsSetServicesEClass, 
		   source, 
		   new String[] {
			 "label", "Set Services",
			 "doc", "In general, a Set Services method is a public subroutine that sets entry points for the component. This subroutine should call the Set Services subroutine in the generic NUOPC Driver component."
		   });		
		addAnnotation
		  (getNUOPCDriver__ImplementsSetServices_Name(), 
		   source, 
		   new String[] {
			 "mappingX", "subroutineName"
		   });		
		addAnnotation
		  (getNUOPCDriver__ImplementsSetServices_Param_gcomp(), 
		   source, 
		   new String[] {
			 "mappingX", "formalParam: 1"
		   });		
		addAnnotation
		  (getNUOPCDriver__ImplementsSetServices_Param_rc(), 
		   source, 
		   new String[] {
			 "mappingX", "formalParam: 2"
		   });		
		addAnnotation
		  (getNUOPCDriver__ImplementsSetServices_CallsGenericSetServices(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"#../../genericImports/importsGenericSS(#gcomp, rc=#rc)\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (getNUOPCDriver__ImplementsSetServices_AttachesMethod(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_MethodAdd(#../param_gcomp, #name, #userRoutine, #ignore)\""
		   });		
		addAnnotation
		  (nuopcDriver__ImplementsSetModelCountEClass, 
		   source, 
		   new String[] {
			 "label", "Set Model Count",
			 "doc", "A subroutine that sets the number of model managed by this driver."
		   });		
		addAnnotation
		  (getNUOPCDriver__ImplementsSetModelCount_DriverInternalState(), 
		   source, 
		   new String[] {
			 "mapping", "localVariable: \"type(type_InternalState)\" definedInModule: \"NUOPC_Driver\""
		   });		
		addAnnotation
		  (getNUOPCDriver__ImplementsSetModelCount_GetsInternalState(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_UserCompGetInternalState(#ignore, #label, #../driverInternalState, #ignore)\""
		   });		
		addAnnotation
		  (getNUOPCDriver__ImplementsSetModelCount_AssignsValue(), 
		   source, 
		   new String[] {
			 "mapping", "assigns: #driverInternalState"
		   });		
		addAnnotation
		  (getNUOPCDriver__ImplementsSetModelCount_Attached(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (nuopcDriver__ImplementsSetModelServicesEClass, 
		   source, 
		   new String[] {
			 "label", "Set Model Services",
			 "doc", "A subroutine that sets services for child models."
		   });		
		addAnnotation
		  (getNUOPCDriver__ImplementsSetModelServices_DriverInternalState(), 
		   source, 
		   new String[] {
			 "mapping", "localVariable: \"type(type_InternalState)\" definedInModule: \"NUOPC_Driver\""
		   });		
		addAnnotation
		  (getNUOPCDriver__ImplementsSetModelServices_GetsInternalState(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_UserCompGetInternalState(#ignore, #label, #../driverInternalState, #ignore)\""
		   });		
		addAnnotation
		  (getNUOPCDriver__ImplementsSetModelServices_AssignsValue(), 
		   source, 
		   new String[] {
			 "mapping", "assigns: #driverInternalState"
		   });		
		addAnnotation
		  (getNUOPCDriver__ImplementsSetModelServices_Attached(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (getNUOPCDriver__ImplementsSetModelServices_SetModelServices(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_GridCompSetServices(#modelComp, #subroutineName, userRc?=#ignore, rc?=#ignore)\""
		   });		
		addAnnotation
		  (getNUOPCDriver__ImplementsSetModelServices_SetCouplerServices(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_CplCompSetServices(#cplComp, #subroutineName, userRc?=#ignore, rc?=#ignore)\""
		   });		
		addAnnotation
		  (nuopcDriverAtmOcnEClass, 
		   source, 
		   new String[] {
			 "mapping", "module",
			 "label", "NUOPC Atm-Ocn Driver"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn_Name(), 
		   source, 
		   new String[] {
			 "mapping", "moduleName"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn_GenericImports(), 
		   source, 
		   new String[] {
			 "mapping", "usesModule: \"NUOPC_DriverAtmOcn\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn_ImplementsSetServices(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(type(ESMF_GridComp) #param_gcomp, integer #param_rc)\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn_ImplementsSetModelCount(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(type(ESMF_GridComp) #gcomp, integer #rc)\""
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn_ImplementsSetModelServices(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(type(ESMF_GridComp) #gcomp, integer #rc)\""
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn_ImplementsSetModelPetLists(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(type(ESMF_GridComp) #gcomp, integer #rc)\""
		   });		
		addAnnotation
		  (nuopcDriverAtmOcn__GenericImportsEClass, 
		   source, 
		   new String[] {
			 "label", "Imports from NUOPC Atm-Ocn Driver",
			 "doc", "Subclasses of NUOPC Atm-Ocn Driver should import generic subroutines, types, and labels from NUOPC_DriverAtmOcn.",
			 "icon", "import.png"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__GenericImports_ImportsGenericSS(), 
		   source, 
		   new String[] {
			 "mapping", "usesEntity: \"routine_SetServices\"",
			 "label", "routine_SetServices",
			 "doc", "Subclasses of NUOPC Atm-Ocn Driver should import the public generic Set Services subroutine \"routine_SetServices\""
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__GenericImports_ImportsTypeDriverIS(), 
		   source, 
		   new String[] {
			 "mapping", "usesEntity: \"type_InternalState\"",
			 "label", "type_InternalState"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__GenericImports_ImportsLabelSetModelCount(), 
		   source, 
		   new String[] {
			 "mapping", "usesEntity: \"label_SetModelCount\"",
			 "label", "label_SetModelCount"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__GenericImports_ImportsLabelSetModelServices(), 
		   source, 
		   new String[] {
			 "mapping", "usesEntity: \"label_SetModelServices\"",
			 "label", "label_SetModelServices"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__GenericImports_ImportsLabelSetModelPetLists(), 
		   source, 
		   new String[] {
			 "mapping", "usesEntity: \"label_SetModelPetLists\"",
			 "label", "label_SetModelPetLists"
		   });		
		addAnnotation
		  (nuopcDriverAtmOcn__ModelImportsEClass, 
		   source, 
		   new String[] {
			 "label", "Child Model Imports",
			 "icon", "import.png"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ModelImports_ModelImport(), 
		   source, 
		   new String[] {
			 "mapping", "usesModule: \"#name\""
		   });		
		addAnnotation
		  (nuopcDriverAtmOcn__ImplementsSetServicesEClass, 
		   source, 
		   new String[] {
			 "label", "Set Services",
			 "doc", "In general, a Set Services method is a public subroutine that sets entry points for the component. This subroutine should call the Set Services subroutine in the generic NUOPC Driver component."
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetServices_CallsGenericSetServices(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"#../../genericImports/importsGenericSS(#gcomp, rc=#rc)\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetServices_AttachesMethod(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_MethodAdd(#../param_gcomp, #name, #userRoutine, #ignore)\""
		   });		
		addAnnotation
		  (nuopcDriverAtmOcn__ImplementsSetModelCountEClass, 
		   source, 
		   new String[] {
			 "label", "Set Model Count",
			 "doc", "A subroutine that sets the number of model managed by this driver."
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelCount_DriverInternalState(), 
		   source, 
		   new String[] {
			 "mapping", "localVariable: \"type(type_InternalState)\" definedInModule: \"NUOPC_DriverAtmOcn\""
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelCount_GetsInternalState(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_UserCompGetInternalState(#ignore, #label, #../driverInternalState, #ignore)\""
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelCount_AssignsValue(), 
		   source, 
		   new String[] {
			 "mapping", "assigns: #driverInternalState"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelCount_Attached(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (nuopcDriverAtmOcn__ImplementsSetModelServicesEClass, 
		   source, 
		   new String[] {
			 "label", "Set Model Services",
			 "doc", "A subroutine that sets services for child models."
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelServices_DriverInternalState(), 
		   source, 
		   new String[] {
			 "mapping", "localVariable: \"type(type_InternalState)\" definedInModule: \"NUOPC_DriverAtmOcn\""
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelServices_GetsInternalState(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_UserCompGetInternalState(#ignore, #label, #../driverInternalState, #ignore)\""
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelServices_AssignsValue(), 
		   source, 
		   new String[] {
			 "mapping", "assigns: #driverInternalState"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelServices_Attached(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelServices_SetModelServices(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_GridCompSetServices(#modelComp, #subroutineName, userRc?=#ignore, rc?=#ignore)\""
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelServices_SetCouplerServices(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_CplCompSetServices(#cplComp, #subroutineName, userRc?=#ignore, rc?=#ignore)\""
		   });		
		addAnnotation
		  (nuopcDriverAtmOcn__ImplementsSetModelPetListsEClass, 
		   source, 
		   new String[] {
			 "label", "Set Model PET Lists"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_DriverInternalState(), 
		   source, 
		   new String[] {
			 "mapping", "localVariable: \"type(#../../genericImports/importsTypeDriverIS)\""
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_GetsInternalState(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_UserCompGetInternalState(#ignore, #label, #../driverInternalState, #ignore)\""
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_AssignsValue(), 
		   source, 
		   new String[] {
			 "mapping", "assigns: #driverInternalState"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_Attached(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (nuopcDriverAtmOcn__ModelImports__ModelImportEClass, 
		   source, 
		   new String[] {
			 "label", "Model Import"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ModelImports__ModelImport_SetServices(), 
		   source, 
		   new String[] {
			 "mapping", "usesEntity"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ModelImports__ModelImport_ModelRef(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (callsGenericSetServicesEClass, 
		   source, 
		   new String[] {
			 "label", "Calls Generic Set Services"
		   });		
		addAnnotation
		  (callsSetEntryPointEClass, 
		   source, 
		   new String[] {
			 "label", "Calls ESMF_GridCompSetEntryPoint"
		   });		
		addAnnotation
		  (attachesMethodEClass, 
		   source, 
		   new String[] {
			 "label", "Attaches Method"
		   });		
		addAnnotation
		  (setModelServicesEClass, 
		   source, 
		   new String[] {
			 "label", "Set Model Services"
		   });		
		addAnnotation
		  (setCouplerServicesEClass, 
		   source, 
		   new String[] {
			 "label", "Set Coupler Services"
		   });		
		addAnnotation
		  (getGetsInternalState_Label(), 
		   source, 
		   new String[] {
			 "mappingX", "argByIndex: 2"
		   });			
		addAnnotation
		  (nuopcMediatorEClass, 
		   source, 
		   new String[] {
			 "mapping", "module",
			 "label", "NUOPC Mediator"
		   });		
		addAnnotation
		  (getNUOPCMediator_Name(), 
		   source, 
		   new String[] {
			 "mapping", "moduleName"
		   });		
		addAnnotation
		  (getNUOPCMediator_ImplementsSetServices(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(inout type(ESMF_GridComp) #param_gcomp, out integer #param_rc)\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (getNUOPCMediator_ImplementsModelAdvance(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(type(ESMF_GridComp), integer)\""
		   });		
		addAnnotation
		  (nuopcMediator__GenericImportsEClass, 
		   source, 
		   new String[] {
			 "label", "Imports from NUOPC Mediator",
			 "icon", "import.png"
		   });		
		addAnnotation
		  (getNUOPCMediator__GenericImports_ImportsGenericSS(), 
		   source, 
		   new String[] {
			 "mapping", "uses: \"NUOPC_Mediator\" entity: \"routine_SetServices\"",
			 "label", "routine_SetServices",
			 "doc", "Subclasses of NUOPC Mediator should import the public generic Set Services subroutine \"routine_SetServices\""
		   });		
		addAnnotation
		  (getNUOPCMediator__GenericImports_ImportsLabelModelAdvance(), 
		   source, 
		   new String[] {
			 "mapping", "uses: \"NUOPC_Mediator\" entity: \"label_Advance\"",
			 "label", "label_Advance"
		   });		
		addAnnotation
		  (nuopcMediator__InitEClass, 
		   source, 
		   new String[] {
			 "label", "Mediator Initialization"
		   });		
		addAnnotation
		  (getNUOPCMediator__Init_ImplementsInitP1(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\""
		   });		
		addAnnotation
		  (getNUOPCMediator__Init_ImplementsInitP2(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\""
		   });			
		addAnnotation
		  (nuopcMediator__ImplementsSetServicesEClass, 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(inout type(ESMF_GridComp) #param_gcomp, out integer #param_rc)\"",
			 "label", "Set Services",
			 "doc", "In general, a Set Services method is a public subroutine that sets entry points for the component. This subroutine should call the Set Services subroutine in the \r\ngeneric NUOPC Model component."
		   });			
		addAnnotation
		  (getNUOPCMediator__ImplementsSetServices_CallsGenericSetServices(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"#../../genericImports/importsGenericSS(#gcomp, rc=#rc)\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (getNUOPCMediator__ImplementsSetServices_CallsSetEntryPoint(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_GridCompSetEntryPoint(#ignore, #method, userRoutine=#userRoutine, phase?=#phase, rc=#ignore)\""
		   });		
		addAnnotation
		  (getNUOPCMediator__ImplementsSetServices_AttachesMethod(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_MethodAdd(#ignore, index?=#index, label=#name, userRoutine=#userRoutine, rc=#ignore)\""
		   });		
		addAnnotation
		  (nuopcMediator__ImplementsInitP1EClass, 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\"",
			 "doc", "Initialize Phase Definition: IPDv01p1\r\n\r\nIn this phase, models should advertise the set of import and export fields. This is the list of fields that may potentially be exchanged during coupling, although some fields may not be connected for a particular configuration.",
			 "label", "Initialize Phase Definition - IPDv01p1",
			 "task", "Implement Init Phase Definition (IPDv01p1)"
		   });		
		addAnnotation
		  (getNUOPCMediator__ImplementsInitP1_AdvertisesImportField(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"NUOPC_StateAdvertiseField(#addsToState, StandardName=#standardName, #rc)\""
		   });		
		addAnnotation
		  (getNUOPCMediator__ImplementsInitP1_AdvertisesExportField(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"NUOPC_StateAdvertiseField(#addsToState, StandardName=#standardName, #rc)\""
		   });				
		addAnnotation
		  (getNUOPCMediator__ImplementsInitP1_AdvertisesOrRegistered(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (nuopcMediator__ImplementsInitP2EClass, 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\"",
			 "doc", "Initialize Phase Definition: IPDv01p2\r\n\r\nIn this phase, models should realize the set of import and export fields. ",
			 "label", "Initialize Phase Definition - IPDv01p2",
			 "iconAdd", "cog_add.png",
			 "task", "Implement Init Phase Definition (IPDv01p2)"
		   });		
		addAnnotation
		  (getNUOPCMediator__ImplementsInitP2_RealizesImportField(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"NUOPC_StateRealizeField(#realizedInState, field=#field, rc=#rc)\""
		   });		
		addAnnotation
		  (getNUOPCMediator__ImplementsInitP2_RealizesExportField(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"NUOPC_StateRealizeField(#realizedInState, field=#field, rc=#rc)\""
		   });				
		addAnnotation
		  (getNUOPCMediator__ImplementsInitP2_RealizesOrRegistered(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (nuopcMediator__AdvertisesImportFieldEClass, 
		   source, 
		   new String[] {
			 "label", "Advertise Import Field",
			 "task", "Advertise Import Field"
		   });		
		addAnnotation
		  (getNUOPCMediator__AdvertisesImportField_AddsToImportState(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (nuopcMediator__AdvertisesExportFieldEClass, 
		   source, 
		   new String[] {
			 "label", "Advertise Export Field",
			 "task", "Advertise Export Field"
		   });		
		addAnnotation
		  (getNUOPCMediator__AdvertisesExportField_AddsToExportState(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (nuopcMediator__RealizesImportFieldEClass, 
		   source, 
		   new String[] {
			 "mapping", "call: NUOPC_StateRealizeField",
			 "label", "Realize Import Field",
			 "task", "Realize Import Field"
		   });		
		addAnnotation
		  (getNUOPCMediator__RealizesImportField_RealizedInImportState(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (nuopcMediator__RealizesExportFieldEClass, 
		   source, 
		   new String[] {
			 "label", "Realize Export Field",
			 "task", "Realize Export Field"
		   });		
		addAnnotation
		  (getNUOPCMediator__RealizesExportField_RealizedInExportState(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (nuopcMediator__ModelAdvanceEClass, 
		   source, 
		   new String[] {
			 "label", "Model Advance",
			 "doc", "A subroutine called to advance the model ahead by the timestep interval."
		   });		
		addAnnotation
		  (getNUOPCMediator__ModelAdvance_Name(), 
		   source, 
		   new String[] {
			 "mapping", "subroutineName",
			 "essential", "true"
		   });		
		addAnnotation
		  (getNUOPCMediator__ModelAdvance_AttachedModelAdvance(), 
		   source, 
		   new String[] {
			 "essential", "true",
			 "derivation_real", "self.name = \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.parent.implementsSetServices.attachesMethod->select(m|m.name=self.parent.genericImports.importsLabelModelAdvance).userRoutine->asSequence()->first()"
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
		  (nuopcModel__ImplementsSetServicesEClass, 
		   source, 
		   new String[] {
			 "registersInitP1", "self.parent.initialize.implementsInitP1=null or self.callsSetEntryPoint->select(c|c.userRoutine=self.parent.initialize.implementsInitP1.name)->notEmpty()",
			 "registersInitP1$message", "\'A call is required in the Set Services method to ESMF_GridCompSetEntryPoint in order to register the initialize phase 1 method.\'",
			 "registersInitP2", "self.parent.initialize.implementsInitP2=null or self.callsSetEntryPoint->select(c|c.userRoutine=self.parent.initialize.implementsInitP2.name)->notEmpty()",
			 "registersInitP2$message", "\'A call is required in the Set Services method to ESMF_GridCompSetEntryPoint in order to register the initialize phase 2 method.\'"
		   });									
		addAnnotation
		  (getNUOPCModel__ImplementsInitP1_AdvertisesAtLeastOneField(), 
		   source, 
		   new String[] {
			 "derivation", "self.advertisesExportField->size() > 0 or self.advertisesImportField->size() > 0"
		   });		
		addAnnotation
		  (getNUOPCModel__ImplementsInitP1_RegisteredInSetServices(), 
		   source, 
		   new String[] {
			 "derivation", "self.parent.parent.implementsSetServices.callsSetEntryPoint->select(c|c.userRoutine=self.name and c.phase=\'1\')->notEmpty()"
		   });			
		addAnnotation
		  (getNUOPCModel__ImplementsInitP1_AdvertisesOrRegistered(), 
		   source, 
		   new String[] {
			 "derivation", "self.registeredInSetServices or self.advertisesAtLeastOneField"
		   });					
		addAnnotation
		  (getNUOPCModel__ImplementsInitP2_RealizesAtLeastOneField(), 
		   source, 
		   new String[] {
			 "derivation", "self.realizesImportField->size() > 0 or self.realizesExportField->size() > 0"
		   });		
		addAnnotation
		  (getNUOPCModel__ImplementsInitP2_RegisteredInSetServices(), 
		   source, 
		   new String[] {
			 "derivation", "self.parent.parent.implementsSetServices.callsSetEntryPoint->select(c|c.userRoutine=self.name and c.phase=\'2\')->notEmpty()"
		   });			
		addAnnotation
		  (getNUOPCModel__ImplementsInitP2_RealizesOrRegistered(), 
		   source, 
		   new String[] {
			 "derivation", "self.registeredInSetServices or self.realizesAtLeastOneField"
		   });				
		addAnnotation
		  (getNUOPCModel__AdvertisesImportField_AddsToImportState(), 
		   source, 
		   new String[] {
			 "derivation", "self.addsToState = self.parent.importParam"
		   });				
		addAnnotation
		  (getNUOPCModel__AdvertisesExportField_AddsToExportState(), 
		   source, 
		   new String[] {
			 "derivation", "self.addsToState = self.parent.exportParam"
		   });				
		addAnnotation
		  (getNUOPCModel__RealizesImportField_RealizedInImportState(), 
		   source, 
		   new String[] {
			 "derivation", "self.realizedInState = self.parent.importParam"
		   });					
		addAnnotation
		  (getNUOPCModel__RealizesExportField_RealizedInExportState(), 
		   source, 
		   new String[] {
			 "derivation", "self.realizedInState = self.parent.exportParam"
		   });					
		addAnnotation
		  (getNUOPCModel__ImplementsModelAdvance_AttachedModelAdvance(), 
		   source, 
		   new String[] {
			 "derivation", "self.parent <> null and self.parent.implementsSetServices <> null and \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.parent.implementsSetServices.attachesMethod->size() > 0 and\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.parent.genericImports <> null and self.parent.genericImports.importsLabelModelAdvance <> null and\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.parent.implementsSetServices.attachesMethod->select(m|m.name=self.parent.genericImports.importsLabelModelAdvance).userRoutine->includes(self.name)"
		   });																				
		addAnnotation
		  (getNUOPCDriver__ModelImports__ModelImport_ModelRef(), 
		   source, 
		   new String[] {
			 "derivation", "let models : Set(NUOPCModel) = self.parent.parent.parent.nuopcModel->select(m|m.name=self.name)\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tin\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tif models <> null and models->notEmpty() then\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmodels->asSequence()->first()\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\telse \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tnull \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tendif"
		   });																		
		addAnnotation
		  (getNUOPCDriver__ImplementsSetModelCount_Attached(), 
		   source, 
		   new String[] {
			 "derivation", "self.parent.genericImports.importsLabelSetModelCount <> null and self.name = self.parent.implementsSetServices.attachesMethod->select(m|m.name=self.parent.genericImports.importsLabelSetModelCount).userRoutine->asSequence()->first()"
		   });							
		addAnnotation
		  (getNUOPCDriver__ImplementsSetModelServices_Attached(), 
		   source, 
		   new String[] {
			 "derivation", "self.name = self.parent.implementsSetServices.attachesMethod->select(m|m.name=self.parent.genericImports.importsLabelSetModelServices).userRoutine->asSequence()->first()"
		   });																											
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelCount_Attached(), 
		   source, 
		   new String[] {
			 "derivation", "self.parent.genericImports.importsLabelSetModelCount <> null \r\nand self.parent.implementsSetServices.attachesMethod->size() > 0 \r\nand self.name = self.parent.implementsSetServices.attachesMethod->select(m|m.name=self.parent.genericImports.importsLabelSetModelCount).userRoutine->asSequence()->first()"
		   });							
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelServices_Attached(), 
		   source, 
		   new String[] {
			 "derivation", "self.parent.genericImports.importsLabelSetModelServices <> null \r\nand self.parent.implementsSetServices.attachesMethod->size() > 0 \r\nand self.name = self.parent.implementsSetServices.attachesMethod->select(m|m.name=self.parent.genericImports.importsLabelSetModelServices).userRoutine->asSequence()->first()"
		   });									
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetModelPetLists_Attached(), 
		   source, 
		   new String[] {
			 "derivation", "self.parent.genericImports.importsLabelSetModelPetLists <> null \r\nand self.parent.implementsSetServices.attachesMethod->size() > 0 \r\nand self.name = self.parent.implementsSetServices.attachesMethod->select(m|m.name=self.parent.genericImports.importsLabelSetModelPetLists).userRoutine->asSequence()->first()"
		   });					
		addAnnotation
		  (getNUOPCDriverAtmOcn__ModelImports__ModelImport_ModelRef(), 
		   source, 
		   new String[] {
			 "derivation", "let models : Set(NUOPCModel) = self.parent.parent.parent.nuopcModel->select(m|m.name=self.name)\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tin\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tif models <> null and models->notEmpty() then\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tmodels->asSequence()->first()\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\telse \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tnull \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tendif"
		   });																					
		addAnnotation
		  (nuopcMediator__ImplementsSetServicesEClass, 
		   source, 
		   new String[] {
			 "registersInitP1", "self.parent.initialize.implementsInitP1=null or self.callsSetEntryPoint->select(c|c.userRoutine=self.parent.initialize.implementsInitP1.name)->notEmpty()",
			 "registersInitP1$message", "\'A call is required in the Set Services method to ESMF_GridCompSetEntryPoint in order to register the initialize phase 1 method.\'",
			 "registersInitP2", "self.parent.initialize.implementsInitP2=null or self.callsSetEntryPoint->select(c|c.userRoutine=self.parent.initialize.implementsInitP2.name)->notEmpty()",
			 "registersInitP2$message", "\'A call is required in the Set Services method to ESMF_GridCompSetEntryPoint in order to register the initialize phase 2 method.\'"
		   });								
		addAnnotation
		  (getNUOPCMediator__ImplementsInitP1_AdvertisesAtLeastOneField(), 
		   source, 
		   new String[] {
			 "derivation", "self.advertisesExportField->size() > 0 or self.advertisesImportField->size() > 0"
		   });		
		addAnnotation
		  (getNUOPCMediator__ImplementsInitP1_RegisteredInSetServices(), 
		   source, 
		   new String[] {
			 "derivation", "self.parent.parent.implementsSetServices.callsSetEntryPoint->select(c|c.userRoutine=self.name and c.phase=\'1\')->notEmpty()"
		   });			
		addAnnotation
		  (getNUOPCMediator__ImplementsInitP1_AdvertisesOrRegistered(), 
		   source, 
		   new String[] {
			 "derivation", "self.registeredInSetServices or self.advertisesAtLeastOneField"
		   });					
		addAnnotation
		  (getNUOPCMediator__ImplementsInitP2_RealizesAtLeastOneField(), 
		   source, 
		   new String[] {
			 "derivation", "self.realizesImportField->size() > 0 or self.realizesExportField->size() > 0"
		   });		
		addAnnotation
		  (getNUOPCMediator__ImplementsInitP2_RegisteredInSetServices(), 
		   source, 
		   new String[] {
			 "derivation", "self.parent.parent.implementsSetServices.callsSetEntryPoint->select(c|c.userRoutine=self.name and c.phase=\'2\')->notEmpty()"
		   });			
		addAnnotation
		  (getNUOPCMediator__ImplementsInitP2_RealizesOrRegistered(), 
		   source, 
		   new String[] {
			 "derivation", "self.registeredInSetServices or self.realizesAtLeastOneField"
		   });				
		addAnnotation
		  (getNUOPCMediator__AdvertisesImportField_AddsToImportState(), 
		   source, 
		   new String[] {
			 "derivation", "self.addsToState = self.parent.importParam"
		   });				
		addAnnotation
		  (getNUOPCMediator__AdvertisesExportField_AddsToExportState(), 
		   source, 
		   new String[] {
			 "derivation", "self.addsToState = self.parent.exportParam"
		   });				
		addAnnotation
		  (getNUOPCMediator__RealizesImportField_RealizedInImportState(), 
		   source, 
		   new String[] {
			 "derivation", "self.realizedInState = self.parent.importParam"
		   });				
		addAnnotation
		  (getNUOPCMediator__RealizesExportField_RealizedInExportState(), 
		   source, 
		   new String[] {
			 "derivation", "self.realizedInState = self.parent.exportParam"
		   });					
		addAnnotation
		  (getNUOPCMediator__ModelAdvance_AttachedModelAdvance(), 
		   source, 
		   new String[] {
			 "derivation", "self.parent <> null and self.parent.implementsSetServices <> null and \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.parent.implementsSetServices.attachesMethod->size() > 0 \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tand\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.parent.genericImports <> null and self.parent.genericImports.importsLabelModelAdvance <> null and\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.parent.implementsSetServices.attachesMethod->select(m|m.name=self.parent.genericImports.importsLabelModelAdvance).userRoutine->includes(self.name)"
		   });
	}

} //NUOPCPackageImpl
