/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesExportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AdvertisesImportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsGenericSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsSetEntryPoint;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.GetsInternalState;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model_Init;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__GenericImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__GenericImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField;

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
	private EClass modelImplementsSetServicesEClass = null;

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
	private EClass model_InitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelImplementsInitP1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelImplementsInitP2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advertisesImportFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass advertisesExportFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizesImportFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizesExportFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelAdvanceEClass = null;

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
	private EClass nuopcDriver__ImplementsSetServicesEClass = null;

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
	private EClass getsInternalStateEClass = null;

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
	private EClass topEClass = null;

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
	private EClass nuopcDriverAtmOcn__ImplementsSetServicesEClass = null;

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
	public EReference getNUOPCModel_ImplementsModelAdvance() {
		return (EReference)nuopcModelEClass.getEStructuralFeatures().get(4);
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
	public EReference getNUOPCModel_Initialize() {
		return (EReference)nuopcModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelImplementsSetServices() {
		return modelImplementsSetServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsSetServices_Parent() {
		return (EReference)modelImplementsSetServicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsSetServices_Name() {
		return (EAttribute)modelImplementsSetServicesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsSetServices_Param_gcomp() {
		return (EAttribute)modelImplementsSetServicesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsSetServices_Param_rc() {
		return (EAttribute)modelImplementsSetServicesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsSetServices_CallsGenericSetServices() {
		return (EReference)modelImplementsSetServicesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsSetServices_CallsSetEntryPoint() {
		return (EReference)modelImplementsSetServicesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsSetServices_AttachesMethod() {
		return (EReference)modelImplementsSetServicesEClass.getEStructuralFeatures().get(6);
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
	public EClass getModel_Init() {
		return model_InitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Init_Parent() {
		return (EReference)model_InitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Init_ImplementsInitP1() {
		return (EReference)model_InitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Init_ImplementsInitP2() {
		return (EReference)model_InitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelImplementsInitP1() {
		return modelImplementsInitP1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsInitP1_Parent() {
		return (EReference)modelImplementsInitP1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP1_Name() {
		return (EAttribute)modelImplementsInitP1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP1_ImportParam() {
		return (EAttribute)modelImplementsInitP1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP1_ExportParam() {
		return (EAttribute)modelImplementsInitP1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsInitP1_AdvertisesImportField() {
		return (EReference)modelImplementsInitP1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsInitP1_AdvertisesExportField() {
		return (EReference)modelImplementsInitP1EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP1_AdvertisesAtLeastOneField() {
		return (EAttribute)modelImplementsInitP1EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP1_RegisteredInSetServices() {
		return (EAttribute)modelImplementsInitP1EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP1_AdvertisesOrRegistered() {
		return (EAttribute)modelImplementsInitP1EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelImplementsInitP2() {
		return modelImplementsInitP2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsInitP2_Parent() {
		return (EReference)modelImplementsInitP2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP2_Name() {
		return (EAttribute)modelImplementsInitP2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP2_ImportParam() {
		return (EAttribute)modelImplementsInitP2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP2_ExportParam() {
		return (EAttribute)modelImplementsInitP2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsInitP2_RealizesImportField() {
		return (EReference)modelImplementsInitP2EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelImplementsInitP2_RealizesExportField() {
		return (EReference)modelImplementsInitP2EClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP2_RealizesAtLeastOneField() {
		return (EAttribute)modelImplementsInitP2EClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP2_RegisteredInSetServices() {
		return (EAttribute)modelImplementsInitP2EClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelImplementsInitP2_RealizesOrRegistered() {
		return (EAttribute)modelImplementsInitP2EClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvertisesImportField() {
		return advertisesImportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvertisesImportField_Parent() {
		return (EReference)advertisesImportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisesImportField_AddsToState() {
		return (EAttribute)advertisesImportFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisesImportField_Rc() {
		return (EAttribute)advertisesImportFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisesImportField_AddsToImportState() {
		return (EAttribute)advertisesImportFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisesImportField_StandardName() {
		return (EAttribute)advertisesImportFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdvertisesExportField() {
		return advertisesExportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdvertisesExportField_Parent() {
		return (EReference)advertisesExportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisesExportField_Rc() {
		return (EAttribute)advertisesExportFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisesExportField_AddsToState() {
		return (EAttribute)advertisesExportFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisesExportField_AddsToExportState() {
		return (EAttribute)advertisesExportFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdvertisesExportField_StandardName() {
		return (EAttribute)advertisesExportFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealizesImportField() {
		return realizesImportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizesImportField_Parent() {
		return (EReference)realizesImportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealizesImportField_RealizedInState() {
		return (EAttribute)realizesImportFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealizesImportField_Rc() {
		return (EAttribute)realizesImportFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealizesImportField_RealizedInImportState() {
		return (EAttribute)realizesImportFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealizesImportField_Field() {
		return (EAttribute)realizesImportFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealizesExportField() {
		return realizesExportFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRealizesExportField_Parent() {
		return (EReference)realizesExportFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealizesExportField_RealizedInState() {
		return (EAttribute)realizesExportFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealizesExportField_Rc() {
		return (EAttribute)realizesExportFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealizesExportField_RealizedInExportState() {
		return (EAttribute)realizesExportFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealizesExportField_Field() {
		return (EAttribute)realizesExportFieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelAdvance() {
		return modelAdvanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelAdvance_Parent() {
		return (EReference)modelAdvanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelAdvance_AttachedModelAdvance() {
		return (EAttribute)modelAdvanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelAdvance_Name() {
		return (EAttribute)modelAdvanceEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getNUOPCDriver_Name() {
		return (EAttribute)nuopcDriverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver_GenericImports() {
		return (EReference)nuopcDriverEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver_ImplementsSetServices() {
		return (EReference)nuopcDriverEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver_ImplementsSetModelCount() {
		return (EReference)nuopcDriverEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriver_ImplementsSetModelServices() {
		return (EReference)nuopcDriverEClass.getEStructuralFeatures().get(4);
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
	public EReference getNUOPCApplication_NuopcDriver() {
		return (EReference)nuopcApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCApplication_NuopcModel() {
		return (EReference)nuopcApplicationEClass.getEStructuralFeatures().get(3);
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
	public EReference getNUOPCApplication_NuopcDriverAtmOcn() {
		return (EReference)nuopcApplicationEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getNUOPCDriverAtmOcn_Name() {
		return (EAttribute)nuopcDriverAtmOcnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCDriverAtmOcn_ImplementsSetServices() {
		return (EReference)nuopcDriverAtmOcnEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getNUOPCDriverAtmOcn__ImplementsSetServices_CallsGenericSetServices() {
		return (EAttribute)nuopcDriverAtmOcn__ImplementsSetServicesEClass.getEStructuralFeatures().get(4);
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
		nuopcModelEClass = createEClass(NUOPC_MODEL);
		createEAttribute(nuopcModelEClass, NUOPC_MODEL__NAME);
		createEReference(nuopcModelEClass, NUOPC_MODEL__GENERIC_IMPORTS);
		createEReference(nuopcModelEClass, NUOPC_MODEL__IMPLEMENTS_SET_SERVICES);
		createEReference(nuopcModelEClass, NUOPC_MODEL__INITIALIZE);
		createEReference(nuopcModelEClass, NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE);

		nuopcModel__GenericImportsEClass = createEClass(NUOPC_MODEL_GENERIC_IMPORTS);
		createEAttribute(nuopcModel__GenericImportsEClass, NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_GENERIC_SS);
		createEAttribute(nuopcModel__GenericImportsEClass, NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_LABEL_MODEL_ADVANCE);

		model_InitEClass = createEClass(MODEL_INIT);
		createEReference(model_InitEClass, MODEL_INIT__PARENT);
		createEReference(model_InitEClass, MODEL_INIT__IMPLEMENTS_INIT_P1);
		createEReference(model_InitEClass, MODEL_INIT__IMPLEMENTS_INIT_P2);

		modelImplementsSetServicesEClass = createEClass(MODEL_IMPLEMENTS_SET_SERVICES);
		createEReference(modelImplementsSetServicesEClass, MODEL_IMPLEMENTS_SET_SERVICES__PARENT);
		createEAttribute(modelImplementsSetServicesEClass, MODEL_IMPLEMENTS_SET_SERVICES__NAME);
		createEAttribute(modelImplementsSetServicesEClass, MODEL_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP);
		createEAttribute(modelImplementsSetServicesEClass, MODEL_IMPLEMENTS_SET_SERVICES__PARAM_RC);
		createEReference(modelImplementsSetServicesEClass, MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES);
		createEReference(modelImplementsSetServicesEClass, MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT);
		createEReference(modelImplementsSetServicesEClass, MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD);

		callsGenericSetServicesEClass = createEClass(CALLS_GENERIC_SET_SERVICES);
		createEAttribute(callsGenericSetServicesEClass, CALLS_GENERIC_SET_SERVICES__GCOMP);
		createEAttribute(callsGenericSetServicesEClass, CALLS_GENERIC_SET_SERVICES__RC);

		callsSetEntryPointEClass = createEClass(CALLS_SET_ENTRY_POINT);
		createEAttribute(callsSetEntryPointEClass, CALLS_SET_ENTRY_POINT__METHOD);
		createEAttribute(callsSetEntryPointEClass, CALLS_SET_ENTRY_POINT__USER_ROUTINE);
		createEAttribute(callsSetEntryPointEClass, CALLS_SET_ENTRY_POINT__PHASE);

		modelImplementsInitP1EClass = createEClass(MODEL_IMPLEMENTS_INIT_P1);
		createEReference(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__PARENT);
		createEAttribute(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__NAME);
		createEAttribute(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__IMPORT_PARAM);
		createEAttribute(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__EXPORT_PARAM);
		createEReference(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_IMPORT_FIELD);
		createEReference(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_EXPORT_FIELD);
		createEAttribute(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_AT_LEAST_ONE_FIELD);
		createEAttribute(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__REGISTERED_IN_SET_SERVICES);
		createEAttribute(modelImplementsInitP1EClass, MODEL_IMPLEMENTS_INIT_P1__ADVERTISES_OR_REGISTERED);

		modelImplementsInitP2EClass = createEClass(MODEL_IMPLEMENTS_INIT_P2);
		createEReference(modelImplementsInitP2EClass, MODEL_IMPLEMENTS_INIT_P2__PARENT);
		createEAttribute(modelImplementsInitP2EClass, MODEL_IMPLEMENTS_INIT_P2__NAME);
		createEAttribute(modelImplementsInitP2EClass, MODEL_IMPLEMENTS_INIT_P2__IMPORT_PARAM);
		createEAttribute(modelImplementsInitP2EClass, MODEL_IMPLEMENTS_INIT_P2__EXPORT_PARAM);
		createEReference(modelImplementsInitP2EClass, MODEL_IMPLEMENTS_INIT_P2__REALIZES_IMPORT_FIELD);
		createEReference(modelImplementsInitP2EClass, MODEL_IMPLEMENTS_INIT_P2__REALIZES_EXPORT_FIELD);
		createEAttribute(modelImplementsInitP2EClass, MODEL_IMPLEMENTS_INIT_P2__REALIZES_AT_LEAST_ONE_FIELD);
		createEAttribute(modelImplementsInitP2EClass, MODEL_IMPLEMENTS_INIT_P2__REGISTERED_IN_SET_SERVICES);
		createEAttribute(modelImplementsInitP2EClass, MODEL_IMPLEMENTS_INIT_P2__REALIZES_OR_REGISTERED);

		advertisesImportFieldEClass = createEClass(ADVERTISES_IMPORT_FIELD);
		createEReference(advertisesImportFieldEClass, ADVERTISES_IMPORT_FIELD__PARENT);
		createEAttribute(advertisesImportFieldEClass, ADVERTISES_IMPORT_FIELD__ADDS_TO_STATE);
		createEAttribute(advertisesImportFieldEClass, ADVERTISES_IMPORT_FIELD__RC);
		createEAttribute(advertisesImportFieldEClass, ADVERTISES_IMPORT_FIELD__ADDS_TO_IMPORT_STATE);
		createEAttribute(advertisesImportFieldEClass, ADVERTISES_IMPORT_FIELD__STANDARD_NAME);

		advertisesExportFieldEClass = createEClass(ADVERTISES_EXPORT_FIELD);
		createEReference(advertisesExportFieldEClass, ADVERTISES_EXPORT_FIELD__PARENT);
		createEAttribute(advertisesExportFieldEClass, ADVERTISES_EXPORT_FIELD__RC);
		createEAttribute(advertisesExportFieldEClass, ADVERTISES_EXPORT_FIELD__ADDS_TO_STATE);
		createEAttribute(advertisesExportFieldEClass, ADVERTISES_EXPORT_FIELD__ADDS_TO_EXPORT_STATE);
		createEAttribute(advertisesExportFieldEClass, ADVERTISES_EXPORT_FIELD__STANDARD_NAME);

		realizesImportFieldEClass = createEClass(REALIZES_IMPORT_FIELD);
		createEReference(realizesImportFieldEClass, REALIZES_IMPORT_FIELD__PARENT);
		createEAttribute(realizesImportFieldEClass, REALIZES_IMPORT_FIELD__REALIZED_IN_STATE);
		createEAttribute(realizesImportFieldEClass, REALIZES_IMPORT_FIELD__RC);
		createEAttribute(realizesImportFieldEClass, REALIZES_IMPORT_FIELD__REALIZED_IN_IMPORT_STATE);
		createEAttribute(realizesImportFieldEClass, REALIZES_IMPORT_FIELD__FIELD);

		realizesExportFieldEClass = createEClass(REALIZES_EXPORT_FIELD);
		createEReference(realizesExportFieldEClass, REALIZES_EXPORT_FIELD__PARENT);
		createEAttribute(realizesExportFieldEClass, REALIZES_EXPORT_FIELD__REALIZED_IN_STATE);
		createEAttribute(realizesExportFieldEClass, REALIZES_EXPORT_FIELD__RC);
		createEAttribute(realizesExportFieldEClass, REALIZES_EXPORT_FIELD__REALIZED_IN_EXPORT_STATE);
		createEAttribute(realizesExportFieldEClass, REALIZES_EXPORT_FIELD__FIELD);

		modelAdvanceEClass = createEClass(MODEL_ADVANCE);
		createEReference(modelAdvanceEClass, MODEL_ADVANCE__PARENT);
		createEAttribute(modelAdvanceEClass, MODEL_ADVANCE__NAME);
		createEAttribute(modelAdvanceEClass, MODEL_ADVANCE__ATTACHED_MODEL_ADVANCE);

		nuopcDriverEClass = createEClass(NUOPC_DRIVER);
		createEAttribute(nuopcDriverEClass, NUOPC_DRIVER__NAME);
		createEReference(nuopcDriverEClass, NUOPC_DRIVER__GENERIC_IMPORTS);
		createEReference(nuopcDriverEClass, NUOPC_DRIVER__IMPLEMENTS_SET_SERVICES);
		createEReference(nuopcDriverEClass, NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT);
		createEReference(nuopcDriverEClass, NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_SERVICES);

		nuopcDriver__GenericImportsEClass = createEClass(NUOPC_DRIVER_GENERIC_IMPORTS);
		createEAttribute(nuopcDriver__GenericImportsEClass, NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_GENERIC_SS);
		createEAttribute(nuopcDriver__GenericImportsEClass, NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_TYPE_DRIVER_IS);
		createEAttribute(nuopcDriver__GenericImportsEClass, NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_COUNT);
		createEAttribute(nuopcDriver__GenericImportsEClass, NUOPC_DRIVER_GENERIC_IMPORTS__IMPORTS_LABEL_SET_MODEL_SERVICES);

		nuopcDriver__ImplementsSetServicesEClass = createEClass(NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES);
		createEReference(nuopcDriver__ImplementsSetServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__PARENT);
		createEAttribute(nuopcDriver__ImplementsSetServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__NAME);
		createEAttribute(nuopcDriver__ImplementsSetServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP);
		createEAttribute(nuopcDriver__ImplementsSetServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__PARAM_RC);
		createEReference(nuopcDriver__ImplementsSetServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES);
		createEReference(nuopcDriver__ImplementsSetServicesEClass, NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD);

		attachesMethodEClass = createEClass(ATTACHES_METHOD);
		createEAttribute(attachesMethodEClass, ATTACHES_METHOD__NAME);
		createEAttribute(attachesMethodEClass, ATTACHES_METHOD__USER_ROUTINE);
		createEAttribute(attachesMethodEClass, ATTACHES_METHOD__INDEX);

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

		getsInternalStateEClass = createEClass(GETS_INTERNAL_STATE);
		createEAttribute(getsInternalStateEClass, GETS_INTERNAL_STATE__LABEL);

		nuopcApplicationEClass = createEClass(NUOPC_APPLICATION);
		createEAttribute(nuopcApplicationEClass, NUOPC_APPLICATION__NAME);
		createEReference(nuopcApplicationEClass, NUOPC_APPLICATION__NUOPC_DRIVER);
		createEReference(nuopcApplicationEClass, NUOPC_APPLICATION__NUOPC_DRIVER_ATM_OCN);
		createEReference(nuopcApplicationEClass, NUOPC_APPLICATION__NUOPC_MODEL);

		topEClass = createEClass(TOP);
		createEReference(topEClass, TOP__APPS);

		nuopcDriverAtmOcnEClass = createEClass(NUOPC_DRIVER_ATM_OCN);
		createEAttribute(nuopcDriverAtmOcnEClass, NUOPC_DRIVER_ATM_OCN__NAME);
		createEReference(nuopcDriverAtmOcnEClass, NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES);

		nuopcDriverAtmOcn__ImplementsSetServicesEClass = createEClass(NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES);
		createEReference(nuopcDriverAtmOcn__ImplementsSetServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__NAME);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_RC);
		createEAttribute(nuopcDriverAtmOcn__ImplementsSetServicesEClass, NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES);
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
		initEClass(nuopcModelEClass, NUOPCModel.class, "NUOPCModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCModel_Name(), ecorePackage.getEString(), "name", "Model", 1, 1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel_GenericImports(), this.getNUOPCModel__GenericImports(), null, "genericImports", null, 1, 1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel_ImplementsSetServices(), this.getModelImplementsSetServices(), this.getModelImplementsSetServices_Parent(), "implementsSetServices", null, 1, 1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getNUOPCModel_ImplementsSetServices().getEKeys().add(this.getModelImplementsSetServices_Name());
		initEReference(getNUOPCModel_Initialize(), this.getModel_Init(), this.getModel_Init_Parent(), "initialize", null, 1, 1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCModel_ImplementsModelAdvance(), this.getModelAdvance(), this.getModelAdvance_Parent(), "implementsModelAdvance", null, 0, -1, NUOPCModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcModel__GenericImportsEClass, NUOPCModel__GenericImports.class, "NUOPCModel__GenericImports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCModel__GenericImports_ImportsGenericSS(), ecorePackage.getEString(), "importsGenericSS", "model_routine_SS", 1, 1, NUOPCModel__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCModel__GenericImports_ImportsLabelModelAdvance(), ecorePackage.getEString(), "importsLabelModelAdvance", "model_label_Advance", 0, 1, NUOPCModel__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(model_InitEClass, Model_Init.class, "Model_Init", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Init_Parent(), this.getNUOPCModel(), this.getNUOPCModel_Initialize(), "parent", null, 1, 1, Model_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Init_ImplementsInitP1(), this.getModelImplementsInitP1(), this.getModelImplementsInitP1_Parent(), "implementsInitP1", null, 1, 1, Model_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getModel_Init_ImplementsInitP1().getEKeys().add(this.getModelImplementsInitP1_Name());
		initEReference(getModel_Init_ImplementsInitP2(), this.getModelImplementsInitP2(), this.getModelImplementsInitP2_Parent(), "implementsInitP2", null, 1, 1, Model_Init.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getModel_Init_ImplementsInitP2().getEKeys().add(this.getModelImplementsInitP2_Name());

		initEClass(modelImplementsSetServicesEClass, ModelImplementsSetServices.class, "ModelImplementsSetServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelImplementsSetServices_Parent(), this.getNUOPCModel(), this.getNUOPCModel_ImplementsSetServices(), "parent", null, 1, 1, ModelImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsSetServices_Name(), ecorePackage.getEString(), "name", "SetServices", 1, 1, ModelImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsSetServices_Param_gcomp(), ecorePackage.getEString(), "param_gcomp", "gcomp", 1, 1, ModelImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsSetServices_Param_rc(), ecorePackage.getEString(), "param_rc", "rc", 1, 1, ModelImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelImplementsSetServices_CallsGenericSetServices(), this.getCallsGenericSetServices(), null, "callsGenericSetServices", null, 1, 1, ModelImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelImplementsSetServices_CallsSetEntryPoint(), this.getCallsSetEntryPoint(), null, "callsSetEntryPoint", null, 0, -1, ModelImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelImplementsSetServices_AttachesMethod(), this.getAttachesMethod(), null, "attachesMethod", null, 0, -1, ModelImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(callsGenericSetServicesEClass, CallsGenericSetServices.class, "CallsGenericSetServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallsGenericSetServices_Gcomp(), ecorePackage.getEString(), "gcomp", "gcomp", 1, 1, CallsGenericSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallsGenericSetServices_Rc(), ecorePackage.getEString(), "rc", "rc", 1, 1, CallsGenericSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callsSetEntryPointEClass, CallsSetEntryPoint.class, "CallsSetEntryPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallsSetEntryPoint_Method(), ecorePackage.getEString(), "method", null, 1, 1, CallsSetEntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallsSetEntryPoint_UserRoutine(), ecorePackage.getEString(), "userRoutine", null, 1, 1, CallsSetEntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallsSetEntryPoint_Phase(), ecorePackage.getEString(), "phase", null, 0, 1, CallsSetEntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelImplementsInitP1EClass, ModelImplementsInitP1.class, "ModelImplementsInitP1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelImplementsInitP1_Parent(), this.getModel_Init(), this.getModel_Init_ImplementsInitP1(), "parent", null, 1, 1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP1_Name(), ecorePackage.getEString(), "name", "InitP1", 1, 1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP1_ImportParam(), ecorePackage.getEString(), "importParam", "importState", 1, 1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP1_ExportParam(), ecorePackage.getEString(), "exportParam", "exportState", 1, 1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelImplementsInitP1_AdvertisesImportField(), this.getAdvertisesImportField(), this.getAdvertisesImportField_Parent(), "advertisesImportField", null, 0, -1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelImplementsInitP1_AdvertisesExportField(), this.getAdvertisesExportField(), this.getAdvertisesExportField_Parent(), "advertisesExportField", null, 0, -1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP1_AdvertisesAtLeastOneField(), ecorePackage.getEBoolean(), "advertisesAtLeastOneField", null, 1, 1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP1_RegisteredInSetServices(), ecorePackage.getEBoolean(), "registeredInSetServices", null, 1, 1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP1_AdvertisesOrRegistered(), ecorePackage.getEBoolean(), "advertisesOrRegistered", null, 1, 1, ModelImplementsInitP1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelImplementsInitP2EClass, ModelImplementsInitP2.class, "ModelImplementsInitP2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelImplementsInitP2_Parent(), this.getModel_Init(), this.getModel_Init_ImplementsInitP2(), "parent", null, 1, 1, ModelImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP2_Name(), ecorePackage.getEString(), "name", "InitP2", 1, 1, ModelImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP2_ImportParam(), ecorePackage.getEString(), "importParam", "importState", 1, 1, ModelImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP2_ExportParam(), ecorePackage.getEString(), "exportParam", "exportState", 1, 1, ModelImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelImplementsInitP2_RealizesImportField(), this.getRealizesImportField(), this.getRealizesImportField_Parent(), "realizesImportField", null, 0, -1, ModelImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelImplementsInitP2_RealizesExportField(), this.getRealizesExportField(), this.getRealizesExportField_Parent(), "realizesExportField", null, 0, -1, ModelImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP2_RealizesAtLeastOneField(), ecorePackage.getEBoolean(), "realizesAtLeastOneField", null, 1, 1, ModelImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP2_RegisteredInSetServices(), ecorePackage.getEBoolean(), "registeredInSetServices", null, 1, 1, ModelImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelImplementsInitP2_RealizesOrRegistered(), ecorePackage.getEBoolean(), "realizesOrRegistered", null, 1, 1, ModelImplementsInitP2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(advertisesImportFieldEClass, AdvertisesImportField.class, "AdvertisesImportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdvertisesImportField_Parent(), this.getModelImplementsInitP1(), this.getModelImplementsInitP1_AdvertisesImportField(), "parent", null, 1, 1, AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvertisesImportField_AddsToState(), ecorePackage.getEString(), "addsToState", "importState", 1, 1, AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvertisesImportField_Rc(), ecorePackage.getEString(), "rc", "rc", 1, 1, AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvertisesImportField_AddsToImportState(), ecorePackage.getEBoolean(), "addsToImportState", null, 1, 1, AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvertisesImportField_StandardName(), ecorePackage.getEString(), "standardName", "\"Standard_Name\"", 1, 1, AdvertisesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(advertisesExportFieldEClass, AdvertisesExportField.class, "AdvertisesExportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdvertisesExportField_Parent(), this.getModelImplementsInitP1(), this.getModelImplementsInitP1_AdvertisesExportField(), "parent", null, 1, 1, AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvertisesExportField_Rc(), ecorePackage.getEString(), "rc", "rc", 1, 1, AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvertisesExportField_AddsToState(), ecorePackage.getEString(), "addsToState", "exportState", 1, 1, AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvertisesExportField_AddsToExportState(), ecorePackage.getEBoolean(), "addsToExportState", null, 1, 1, AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdvertisesExportField_StandardName(), ecorePackage.getEString(), "standardName", "\"Standard_Name\"", 1, 1, AdvertisesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realizesImportFieldEClass, RealizesImportField.class, "RealizesImportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealizesImportField_Parent(), this.getModelImplementsInitP2(), this.getModelImplementsInitP2_RealizesImportField(), "parent", null, 1, 1, RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealizesImportField_RealizedInState(), ecorePackage.getEString(), "realizedInState", "importState", 1, 1, RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealizesImportField_Rc(), ecorePackage.getEString(), "rc", "rc", 1, 1, RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealizesImportField_RealizedInImportState(), ecorePackage.getEBoolean(), "realizedInImportState", null, 1, 1, RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealizesImportField_Field(), ecorePackage.getEString(), "field", null, 1, 1, RealizesImportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realizesExportFieldEClass, RealizesExportField.class, "RealizesExportField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRealizesExportField_Parent(), this.getModelImplementsInitP2(), this.getModelImplementsInitP2_RealizesExportField(), "parent", null, 1, 1, RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealizesExportField_RealizedInState(), ecorePackage.getEString(), "realizedInState", "exportState", 1, 1, RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealizesExportField_Rc(), ecorePackage.getEString(), "rc", "rc", 1, 1, RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealizesExportField_RealizedInExportState(), ecorePackage.getEBoolean(), "realizedInExportState", null, 1, 1, RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRealizesExportField_Field(), ecorePackage.getEString(), "field", null, 1, 1, RealizesExportField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelAdvanceEClass, ModelAdvance.class, "ModelAdvance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelAdvance_Parent(), this.getNUOPCModel(), this.getNUOPCModel_ImplementsModelAdvance(), "parent", null, 1, 1, ModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelAdvance_Name(), ecorePackage.getEString(), "name", "ModelAdvance", 1, 1, ModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelAdvance_AttachedModelAdvance(), ecorePackage.getEBoolean(), "attachedModelAdvance", null, 1, 1, ModelAdvance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriverEClass, NUOPCDriver.class, "NUOPCDriver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCDriver_Name(), ecorePackage.getEString(), "name", "ModelDefault", 1, 1, NUOPCDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver_GenericImports(), this.getNUOPCDriver__GenericImports(), null, "genericImports", null, 1, 1, NUOPCDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver_ImplementsSetServices(), this.getNUOPCDriver__ImplementsSetServices(), this.getNUOPCDriver__ImplementsSetServices_Parent(), "implementsSetServices", null, 1, 1, NUOPCDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver_ImplementsSetModelCount(), this.getNUOPCDriver__ImplementsSetModelCount(), this.getNUOPCDriver__ImplementsSetModelCount_Parent(), "implementsSetModelCount", null, 0, 1, NUOPCDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver_ImplementsSetModelServices(), this.getNUOPCDriver__ImplementsSetModelServices(), this.getNUOPCDriver__ImplementsSetModelServices_Parent(), "implementsSetModelServices", null, 0, 1, NUOPCDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriver__GenericImportsEClass, NUOPCDriver__GenericImports.class, "NUOPCDriver__GenericImports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCDriver__GenericImports_ImportsGenericSS(), ecorePackage.getEString(), "importsGenericSS", "driver_routine_SS", 1, 1, NUOPCDriver__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__GenericImports_ImportsTypeDriverIS(), ecorePackage.getEString(), "importsTypeDriverIS", "driver_type_IS", 1, 1, NUOPCDriver__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__GenericImports_ImportsLabelSetModelCount(), ecorePackage.getEString(), "importsLabelSetModelCount", "driver_label_SetModelCount", 0, 1, NUOPCDriver__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__GenericImports_ImportsLabelSetModelServices(), ecorePackage.getEString(), "importsLabelSetModelServices", "driver_label_SetModelServices", 0, 1, NUOPCDriver__GenericImports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriver__ImplementsSetServicesEClass, NUOPCDriver__ImplementsSetServices.class, "NUOPCDriver__ImplementsSetServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriver__ImplementsSetServices_Parent(), this.getNUOPCDriver(), this.getNUOPCDriver_ImplementsSetServices(), "parent", null, 1, 1, NUOPCDriver__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetServices_Name(), ecorePackage.getEString(), "name", "SetServices", 1, 1, NUOPCDriver__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetServices_Param_gcomp(), ecorePackage.getEString(), "param_gcomp", "gcomp", 1, 1, NUOPCDriver__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriver__ImplementsSetServices_Param_rc(), ecorePackage.getEString(), "param_rc", "rc", 1, 1, NUOPCDriver__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver__ImplementsSetServices_CallsGenericSetServices(), this.getCallsGenericSetServices(), null, "callsGenericSetServices", null, 1, 1, NUOPCDriver__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriver__ImplementsSetServices_AttachesMethod(), this.getAttachesMethod(), null, "attachesMethod", null, 0, -1, NUOPCDriver__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attachesMethodEClass, AttachesMethod.class, "AttachesMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttachesMethod_Name(), ecorePackage.getEString(), "name", null, 1, 1, AttachesMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachesMethod_UserRoutine(), ecorePackage.getEString(), "userRoutine", null, 1, 1, AttachesMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttachesMethod_Index(), ecorePackage.getEString(), "index", null, 0, 1, AttachesMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		initEClass(getsInternalStateEClass, GetsInternalState.class, "GetsInternalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetsInternalState_Label(), ecorePackage.getEString(), "label", null, 0, 1, GetsInternalState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcApplicationEClass, NUOPCApplication.class, "NUOPCApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCApplication_Name(), ecorePackage.getEString(), "name", null, 1, 1, NUOPCApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCApplication_NuopcDriver(), this.getNUOPCDriver(), null, "nuopcDriver", null, 0, -1, NUOPCApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNUOPCApplication_NuopcDriverAtmOcn(), this.getNUOPCDriverAtmOcn(), null, "nuopcDriverAtmOcn", null, 0, -1, NUOPCApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNUOPCApplication_NuopcModel(), this.getNUOPCModel(), null, "nuopcModel", null, 0, -1, NUOPCApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(topEClass, Top.class, "Top", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTop_Apps(), this.getNUOPCApplication(), null, "apps", null, 1, 1, Top.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriverAtmOcnEClass, NUOPCDriverAtmOcn.class, "NUOPCDriverAtmOcn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCDriverAtmOcn_Name(), ecorePackage.getEString(), "name", "ModelDefault", 1, 1, NUOPCDriverAtmOcn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCDriverAtmOcn_ImplementsSetServices(), this.getNUOPCDriverAtmOcn__ImplementsSetServices(), this.getNUOPCDriverAtmOcn__ImplementsSetServices_Parent(), "implementsSetServices", null, 0, 1, NUOPCDriverAtmOcn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcDriverAtmOcn__ImplementsSetServicesEClass, NUOPCDriverAtmOcn__ImplementsSetServices.class, "NUOPCDriverAtmOcn__ImplementsSetServices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriverAtmOcn__ImplementsSetServices_Parent(), this.getNUOPCDriverAtmOcn(), this.getNUOPCDriverAtmOcn_ImplementsSetServices(), "parent", null, 1, 1, NUOPCDriverAtmOcn__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetServices_Name(), ecorePackage.getEString(), "name", "SetServicesDefault", 1, 1, NUOPCDriverAtmOcn__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetServices_Param_gcomp(), ecorePackage.getEString(), "param_gcomp", "gcompDefault", 0, 1, NUOPCDriverAtmOcn__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetServices_Param_rc(), ecorePackage.getEString(), "param_rc", "rcDefault", 0, 1, NUOPCDriverAtmOcn__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNUOPCDriverAtmOcn__ImplementsSetServices_CallsGenericSetServices(), ecorePackage.getEBoolean(), "callsGenericSetServices", null, 1, 1, NUOPCDriverAtmOcn__ImplementsSetServices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (modelImplementsSetServicesEClass, 
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
		  (nuopcModelEClass, 
		   source, 
		   new String[] {
			 "mapping", "module",
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
		  (getNUOPCModel_ImplementsSetServices(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(inout type(ESMF_GridComp) #param_gcomp, out integer #param_rc)\"",
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
			 "mapping", "uses: \"NUOPC_Model\" entity: \"routine_SetServices\"",
			 "label", "routine_SetServices",
			 "doc", "Subclasses of NUOPC Model should import the public generic Set Services subroutine \"routine_SetServices\""
		   });		
		addAnnotation
		  (getNUOPCModel__GenericImports_ImportsLabelModelAdvance(), 
		   source, 
		   new String[] {
			 "mapping", "uses: \"NUOPC_Model\" entity: \"label_Advance\"",
			 "label", "label_Advance"
		   });		
		addAnnotation
		  (model_InitEClass, 
		   source, 
		   new String[] {
			 "label", "Model Initialization",
			 "doc", "Framework concepts related to initializing this NUOPC Model"
		   });		
		addAnnotation
		  (getModel_Init_ImplementsInitP1(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\""
		   });		
		addAnnotation
		  (getModel_Init_ImplementsInitP2(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\""
		   });			
		addAnnotation
		  (modelImplementsSetServicesEClass, 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(inout type(ESMF_GridComp) #param_gcomp, out integer #param_rc)\"",
			 "label", "Set Services",
			 "doc", "In general, a Set Services method is a public subroutine that sets entry points for the component. This subroutine should call the Set Services subroutine in the generic NUOPC Model component."
		   });			
		addAnnotation
		  (getModelImplementsSetServices_Name(), 
		   source, 
		   new String[] {
			 "mappingX", "subroutineName"
		   });		
		addAnnotation
		  (getModelImplementsSetServices_Param_gcomp(), 
		   source, 
		   new String[] {
			 "mappingX", "formalParam: 1"
		   });		
		addAnnotation
		  (getModelImplementsSetServices_Param_rc(), 
		   source, 
		   new String[] {
			 "mappingX", "formalParam: 2"
		   });		
		addAnnotation
		  (getModelImplementsSetServices_CallsGenericSetServices(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"#../../genericImports/importsGenericSS(#gcomp, rc=#rc)\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (getModelImplementsSetServices_CallsSetEntryPoint(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_GridCompSetEntryPoint(#ignore, #method, userRoutine=#userRoutine, phase?=#phase, rc=#ignore)\""
		   });		
		addAnnotation
		  (getModelImplementsSetServices_AttachesMethod(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_MethodAdd(#ignore, index=#index, label=#name, userRoutine=#userRoutine, rc=#ignore)\""
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
		  (modelImplementsInitP1EClass, 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\"",
			 "doc", "Initialize Phase Definition: IPDv01p1\r\n\r\nIn this phase, models should advertise the set of import and export fields. This is the list of fields that may potentially be exchanged during coupling, although some fields may not be connected for a particular configuration.",
			 "label", "Initialize Phase Definition - IPDv01p1",
			 "task", "Implement Init Phase Definition (IPDv01p1)"
		   });		
		addAnnotation
		  (getModelImplementsInitP1_Name(), 
		   source, 
		   new String[] {
			 "mappingX", "subroutineName"
		   });		
		addAnnotation
		  (getModelImplementsInitP1_AdvertisesImportField(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"NUOPC_StateAdvertiseField(#addsToState, StandardName=#standardName, #rc)\""
		   });		
		addAnnotation
		  (getModelImplementsInitP1_AdvertisesExportField(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"NUOPC_StateAdvertiseField(#addsToState, StandardName=#standardName, #rc)\""
		   });				
		addAnnotation
		  (getModelImplementsInitP1_AdvertisesOrRegistered(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (modelImplementsInitP2EClass, 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"#name(inout type(ESMF_GridComp) gcomp, inout type(ESMF_State) #importParam, inout type(ESMF_State) #exportParam, inout type(ESMF_Clock) clock, out integer rc)\"",
			 "doc", "Initialize Phase Definition: IPDv01p2\r\n\r\nIn this phase, models should realize the set of import and export fields. ",
			 "label", "Initialize Phase Definition - IPDv01p2",
			 "iconAdd", "cog_add.png",
			 "task", "Implement Init Phase Definition (IPDv01p2)"
		   });		
		addAnnotation
		  (getModelImplementsInitP2_Name(), 
		   source, 
		   new String[] {
			 "mappingX", "subroutineName"
		   });		
		addAnnotation
		  (getModelImplementsInitP2_ImportParam(), 
		   source, 
		   new String[] {
			 "mappingX", "formalParam: 2"
		   });		
		addAnnotation
		  (getModelImplementsInitP2_ExportParam(), 
		   source, 
		   new String[] {
			 "mappingX", "formalParam: 3"
		   });		
		addAnnotation
		  (getModelImplementsInitP2_RealizesImportField(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"NUOPC_StateRealizeField(#realizedInState, field=#field, rc=#rc)\""
		   });		
		addAnnotation
		  (getModelImplementsInitP2_RealizesExportField(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"NUOPC_StateRealizeField(#realizedInState, field=#field, rc=#rc)\""
		   });				
		addAnnotation
		  (getModelImplementsInitP2_RealizesOrRegistered(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (advertisesImportFieldEClass, 
		   source, 
		   new String[] {
			 "label", "Advertise Import Field",
			 "task", "Advertise Import Field"
		   });		
		addAnnotation
		  (getAdvertisesImportField_AddsToImportState(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (advertisesExportFieldEClass, 
		   source, 
		   new String[] {
			 "label", "Advertise Export Field",
			 "task", "Advertise Export Field"
		   });		
		addAnnotation
		  (getAdvertisesExportField_AddsToExportState(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (realizesImportFieldEClass, 
		   source, 
		   new String[] {
			 "mapping", "call: NUOPC_StateRealizeField",
			 "label", "Realize Import Field",
			 "task", "Realize Import Field"
		   });		
		addAnnotation
		  (getRealizesImportField_RealizedInImportState(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (getRealizesImportField_Field(), 
		   source, 
		   new String[] {
			 "mappingX", "argByIndex: 2"
		   });		
		addAnnotation
		  (realizesExportFieldEClass, 
		   source, 
		   new String[] {
			 "label", "Realize Export Field",
			 "task", "Realize Export Field"
		   });		
		addAnnotation
		  (getRealizesExportField_RealizedInExportState(), 
		   source, 
		   new String[] {
			 "essential", "true"
		   });			
		addAnnotation
		  (getRealizesExportField_Field(), 
		   source, 
		   new String[] {
			 "mappingX", "argByIndex: 2"
		   });		
		addAnnotation
		  (modelAdvanceEClass, 
		   source, 
		   new String[] {
			 "label", "Model Advance",
			 "doc", "A subroutine called to advance the model ahead by the timestep interval."
		   });		
		addAnnotation
		  (getModelAdvance_Name(), 
		   source, 
		   new String[] {
			 "mapping", "subroutineName",
			 "essential", "true"
		   });		
		addAnnotation
		  (getModelAdvance_AttachedModelAdvance(), 
		   source, 
		   new String[] {
			 "essential", "true",
			 "derivation_real", "self.name = self.parent.implementsSetServices.attachesMethod->select(m|m.name=self.parent.genericImports.importsLabelModelAdvance).userRoutine->asSequence()->first()"
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
			 "mapping", "uses: \"NUOPC_Driver\" entity: \"routine_SetServices\"",
			 "label", "routine_SetServices",
			 "doc", "Subclasses of NUOPC Driver should import the public generic Set Services subroutine \"routine_SetServices\""
		   });		
		addAnnotation
		  (getNUOPCDriver__GenericImports_ImportsTypeDriverIS(), 
		   source, 
		   new String[] {
			 "mapping", "uses: \"NUOPC_Driver\" entity: \"type_InternalState\"",
			 "label", "type_InternalState"
		   });		
		addAnnotation
		  (getNUOPCDriver__GenericImports_ImportsLabelSetModelCount(), 
		   source, 
		   new String[] {
			 "mapping", "uses: \"NUOPC_Driver\" entity: \"label_SetModelCount\"",
			 "label", "label_SetModelCount"
		   });		
		addAnnotation
		  (getNUOPCDriver__GenericImports_ImportsLabelSetModelServices(), 
		   source, 
		   new String[] {
			 "mapping", "uses: \"NUOPC_Driver\" entity: \"label_SetModelServices\"",
			 "label", "label_SetModelServices"
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
			 "mapping", "call: \"#../../genericImports/importsGenericSS(#param_gcomp, rc=#param_rc)\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (getNUOPCDriver__ImplementsSetServices_AttachesMethod(), 
		   source, 
		   new String[] {
			 "mapping", "call: \"ESMF_MethodAdd(#../param_gcomp, #name, #userRoutine, #ignore)\""
		   });		
		addAnnotation
		  (attachesMethodEClass, 
		   source, 
		   new String[] {
			 "label", "Attaches Method"
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
		  (getGetsInternalState_Label(), 
		   source, 
		   new String[] {
			 "mappingX", "argByIndex: 2"
		   });		
		addAnnotation
		  (nuopcApplicationEClass, 
		   source, 
		   new String[] {
			 "label", "NUOPC Application",
			 "icon", "application_cascade.png"
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
		  (getNUOPCApplication_NuopcModel(), 
		   source, 
		   new String[] {
			 "mapping", "module"
		   });		
		addAnnotation
		  (nuopcDriverAtmOcnEClass, 
		   source, 
		   new String[] {
			 "mapping", "module",
			 "labelPlural", "Atmosphere-Ocean Drivers",
			 "label", "NUOPC  Atmosphere-Ocean Driver",
			 "iconAdd", "script_add.png"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn_Name(), 
		   source, 
		   new String[] {
			 "mapping", "moduleName"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn_ImplementsSetServices(), 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"*(type(ESMF_GridComp), integer)\"",
			 "essential", "true"
		   });		
		addAnnotation
		  (nuopcDriverAtmOcn__ImplementsSetServicesEClass, 
		   source, 
		   new String[] {
			 "mapping", "subroutine: \"*(type(ESMF_GridComp), integer)\""
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetServices_Name(), 
		   source, 
		   new String[] {
			 "mapping", "subroutineName"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetServices_Param_gcomp(), 
		   source, 
		   new String[] {
			 "mapping", "formalParam: 1"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetServices_Param_rc(), 
		   source, 
		   new String[] {
			 "mapping", "formalParam: 2"
		   });		
		addAnnotation
		  (getNUOPCDriverAtmOcn__ImplementsSetServices_CallsGenericSetServices(), 
		   source, 
		   new String[] {
			 "mapping", "calls: \"routine_SetServices\" definedInModule: \"NUOPC_DriverAtmOcn\"",
			 "essential", "true"
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
		  (modelImplementsSetServicesEClass, 
		   source, 
		   new String[] {
			 "registersInitP1", "self.parent.initialize.implementsInitP1=null or self.callsSetEntryPoint->select(c|c.userRoutine=self.parent.initialize.implementsInitP1.name)->notEmpty()",
			 "registersInitP1$message", "\'A call is required in the Set Services method to ESMF_GridCompSetEntryPoint in order to register the initialize phase 1 method.\'",
			 "registersInitP2", "self.parent.initialize.implementsInitP2=null or self.callsSetEntryPoint->select(c|c.userRoutine=self.parent.initialize.implementsInitP2.name)->notEmpty()",
			 "registersInitP2$message", "\'A call is required in the Set Services method to ESMF_GridCompSetEntryPoint in order to register the initialize phase 2 method.\'"
		   });														
		addAnnotation
		  (getModelImplementsInitP1_AdvertisesAtLeastOneField(), 
		   source, 
		   new String[] {
			 "derivation", "self.advertisesExportField->size() > 0 or self.advertisesImportField->size() > 0"
		   });		
		addAnnotation
		  (getModelImplementsInitP1_RegisteredInSetServices(), 
		   source, 
		   new String[] {
			 "derivation", "self.parent.parent.implementsSetServices.callsSetEntryPoint->select(c|c.userRoutine=self.name and c.phase=\'1\')->notEmpty()"
		   });			
		addAnnotation
		  (getModelImplementsInitP1_AdvertisesOrRegistered(), 
		   source, 
		   new String[] {
			 "derivation", "self.registeredInSetServices or self.advertisesAtLeastOneField"
		   });								
		addAnnotation
		  (getModelImplementsInitP2_RealizesAtLeastOneField(), 
		   source, 
		   new String[] {
			 "derivation", "self.realizesImportField->size() > 0 or self.realizesExportField->size() > 0"
		   });		
		addAnnotation
		  (getModelImplementsInitP2_RegisteredInSetServices(), 
		   source, 
		   new String[] {
			 "derivation", "self.parent.parent.implementsSetServices.callsSetEntryPoint->select(c|c.userRoutine=self.name and c.phase=\'2\')->notEmpty()"
		   });			
		addAnnotation
		  (getModelImplementsInitP2_RealizesOrRegistered(), 
		   source, 
		   new String[] {
			 "derivation", "self.registeredInSetServices or self.realizesAtLeastOneField"
		   });				
		addAnnotation
		  (getAdvertisesImportField_AddsToImportState(), 
		   source, 
		   new String[] {
			 "derivation", "self.addsToState = self.parent.importParam"
		   });				
		addAnnotation
		  (getAdvertisesExportField_AddsToExportState(), 
		   source, 
		   new String[] {
			 "derivation", "self.addsToState = self.parent.exportParam"
		   });				
		addAnnotation
		  (getRealizesImportField_RealizedInImportState(), 
		   source, 
		   new String[] {
			 "derivation", "self.realizedInState = self.parent.importParam"
		   });					
		addAnnotation
		  (getRealizesExportField_RealizedInExportState(), 
		   source, 
		   new String[] {
			 "derivation", "self.realizedInState = self.parent.exportParam"
		   });						
		addAnnotation
		  (getModelAdvance_AttachedModelAdvance(), 
		   source, 
		   new String[] {
			 "derivation", "self.parent <> null and self.parent.implementsSetServices <> null and \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.parent.implementsSetServices.attachesMethod->size() > 0 and\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.parent.genericImports <> null and self.parent.genericImports.importsLabelModelAdvance <> null and\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tself.parent.implementsSetServices.attachesMethod->select(m|m.name=self.parent.genericImports.importsLabelModelAdvance).userRoutine->includes(self.name)"
		   });																								
		addAnnotation
		  (getNUOPCDriver__ImplementsSetModelCount_Attached(), 
		   source, 
		   new String[] {
			 "derivation", "self.name = self.parent.implementsSetServices.attachesMethod->select(m|m.name=self.parent.genericImports.importsLabelSetModelCount).userRoutine->asSequence()->first()"
		   });							
		addAnnotation
		  (getNUOPCDriver__ImplementsSetModelServices_Attached(), 
		   source, 
		   new String[] {
			 "derivation", "self.name = self.parent.implementsSetServices.attachesMethod->select(m|m.name=self.parent.genericImports.importsLabelSetModelServices).userRoutine->asSequence()->first()"
		   });													
	}

} //NUOPCPackageImpl
