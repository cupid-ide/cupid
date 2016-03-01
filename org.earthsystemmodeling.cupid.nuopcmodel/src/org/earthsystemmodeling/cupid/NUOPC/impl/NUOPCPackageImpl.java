/**
 */
package org.earthsystemmodeling.cupid.NUOPC.impl;

import org.earthsystemmodeling.cupid.NUOPC.NUOPCApplication;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCBaseModel;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCComponent;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCConnector;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCDriver;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCFactory;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCMediator;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCModel;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
	private EClass nuopcComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcBaseModelEClass = null;

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
	private EClass nuopcModelEClass = null;

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
	private EClass nuopcConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nuopcApplicationEClass = null;

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
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#eNS_URI
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
	public EClass getNUOPCComponent() {
		return nuopcComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNUOPCComponent_Name() {
		return (EAttribute)nuopcComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCBaseModel() {
		return nuopcBaseModelEClass;
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
	public EReference getNUOPCDriver_Children() {
		return (EReference)nuopcDriverEClass.getEStructuralFeatures().get(0);
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
	public EClass getNUOPCMediator() {
		return nuopcMediatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNUOPCConnector() {
		return nuopcConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCConnector_Source() {
		return (EReference)nuopcConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNUOPCConnector_Target() {
		return (EReference)nuopcConnectorEClass.getEStructuralFeatures().get(1);
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
	public EReference getNUOPCApplication_Children() {
		return (EReference)nuopcApplicationEClass.getEStructuralFeatures().get(0);
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
		nuopcComponentEClass = createEClass(NUOPC_COMPONENT);
		createEAttribute(nuopcComponentEClass, NUOPC_COMPONENT__NAME);

		nuopcBaseModelEClass = createEClass(NUOPC_BASE_MODEL);

		nuopcDriverEClass = createEClass(NUOPC_DRIVER);
		createEReference(nuopcDriverEClass, NUOPC_DRIVER__CHILDREN);

		nuopcModelEClass = createEClass(NUOPC_MODEL);

		nuopcMediatorEClass = createEClass(NUOPC_MEDIATOR);

		nuopcConnectorEClass = createEClass(NUOPC_CONNECTOR);
		createEReference(nuopcConnectorEClass, NUOPC_CONNECTOR__SOURCE);
		createEReference(nuopcConnectorEClass, NUOPC_CONNECTOR__TARGET);

		nuopcApplicationEClass = createEClass(NUOPC_APPLICATION);
		createEReference(nuopcApplicationEClass, NUOPC_APPLICATION__CHILDREN);
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
		nuopcBaseModelEClass.getESuperTypes().add(this.getNUOPCComponent());
		nuopcDriverEClass.getESuperTypes().add(this.getNUOPCComponent());
		nuopcModelEClass.getESuperTypes().add(this.getNUOPCBaseModel());
		nuopcMediatorEClass.getESuperTypes().add(this.getNUOPCBaseModel());
		nuopcConnectorEClass.getESuperTypes().add(this.getNUOPCComponent());

		// Initialize classes, features, and operations; add parameters
		initEClass(nuopcComponentEClass, NUOPCComponent.class, "NUOPCComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNUOPCComponent_Name(), ecorePackage.getEString(), "name", null, 1, 1, NUOPCComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcBaseModelEClass, NUOPCBaseModel.class, "NUOPCBaseModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nuopcDriverEClass, NUOPCDriver.class, "NUOPCDriver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCDriver_Children(), this.getNUOPCComponent(), null, "children", null, 0, -1, NUOPCDriver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcModelEClass, NUOPCModel.class, "NUOPCModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nuopcMediatorEClass, NUOPCMediator.class, "NUOPCMediator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nuopcConnectorEClass, NUOPCConnector.class, "NUOPCConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCConnector_Source(), this.getNUOPCBaseModel(), null, "source", null, 1, 1, NUOPCConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNUOPCConnector_Target(), this.getNUOPCBaseModel(), null, "target", null, 1, 1, NUOPCConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nuopcApplicationEClass, NUOPCApplication.class, "NUOPCApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNUOPCApplication_Children(), this.getNUOPCComponent(), null, "children", null, 0, -1, NUOPCApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //NUOPCPackageImpl
