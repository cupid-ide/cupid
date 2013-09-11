/**
 */
package org.earthsystemcurator.cupid.fm.cplfm.impl;

import org.earthsystemcurator.cupid.fm.cplfm.BlockDecomposition;
import org.earthsystemcurator.cupid.fm.cplfm.Connector;
import org.earthsystemcurator.cupid.fm.cplfm.ConservativeRegridTransformation;
import org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel;
import org.earthsystemcurator.cupid.fm.cplfm.Coordinates;
import org.earthsystemcurator.cupid.fm.cplfm.CopyTransformation;
import org.earthsystemcurator.cupid.fm.cplfm.Coupler;
import org.earthsystemcurator.cupid.fm.cplfm.CplfmFactory;
import org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage;
import org.earthsystemcurator.cupid.fm.cplfm.CurvilinearCoordinates;
import org.earthsystemcurator.cupid.fm.cplfm.DomainDecomposition;
import org.earthsystemcurator.cupid.fm.cplfm.Field;
import org.earthsystemcurator.cupid.fm.cplfm.Grid;
import org.earthsystemcurator.cupid.fm.cplfm.InterconstituentTransformation;
import org.earthsystemcurator.cupid.fm.cplfm.IntraconstituentTransformation;
import org.earthsystemcurator.cupid.fm.cplfm.LinearRegridTransformation;
import org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid;
import org.earthsystemcurator.cupid.fm.cplfm.MPIConnector;
import org.earthsystemcurator.cupid.fm.cplfm.MemoryToFileConnector;
import org.earthsystemcurator.cupid.fm.cplfm.MemoryToMemoryConnector;
import org.earthsystemcurator.cupid.fm.cplfm.Parallel;
import org.earthsystemcurator.cupid.fm.cplfm.RectilinearCoordinates;
import org.earthsystemcurator.cupid.fm.cplfm.RedistributeTransformation;
import org.earthsystemcurator.cupid.fm.cplfm.RegridTransformation;
import org.earthsystemcurator.cupid.fm.cplfm.SegmentDecomposition;
import org.earthsystemcurator.cupid.fm.cplfm.StructuredGrid;
import org.earthsystemcurator.cupid.fm.cplfm.TimeIntegrationTransformation;
import org.earthsystemcurator.cupid.fm.cplfm.Transformation;
import org.earthsystemcurator.cupid.fm.cplfm.UniformCoordinates;
import org.earthsystemcurator.cupid.fm.cplfm.UnstructuredGrid;

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
public class CplfmPackageImpl extends EPackageImpl implements CplfmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constituentModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredGridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicallyRectangularGridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unstructuredGridEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniformCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectilinearCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass curvilinearCoordinatesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass couplerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryToMemoryConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryToFileConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mpiConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interconstituentTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redistributeTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regridTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearRegridTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conservativeRegridTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intraconstituentTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntegrationTransformationEClass = null;

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
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CplfmPackageImpl() {
		super(eNS_URI, CplfmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CplfmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CplfmPackage init() {
		if (isInited) return (CplfmPackage)EPackage.Registry.INSTANCE.getEPackage(CplfmPackage.eNS_URI);

		// Obtain or create and register package
		CplfmPackageImpl theCplfmPackage = (CplfmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CplfmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CplfmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCplfmPackage.createPackageContents();

		// Initialize created meta-data
		theCplfmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCplfmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CplfmPackage.eNS_URI, theCplfmPackage);
		return theCplfmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstituentModel() {
		return constituentModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstituentModel_Name() {
		return (EAttribute)constituentModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstituentModel_Grid() {
		return (EReference)constituentModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstituentModel_Parallel() {
		return (EReference)constituentModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstituentModel_Field() {
		return (EReference)constituentModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallel() {
		return parallelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParallel_DomainDecomposition() {
		return (EReference)parallelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParallel_ProcessList() {
		return (EAttribute)parallelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrid() {
		return gridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredGrid() {
		return structuredGridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicallyRectangularGrid() {
		return logicallyRectangularGridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicallyRectangularGrid_Coordinates() {
		return (EReference)logicallyRectangularGridEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicallyRectangularGrid_MinX() {
		return (EAttribute)logicallyRectangularGridEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicallyRectangularGrid_MaxX() {
		return (EAttribute)logicallyRectangularGridEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicallyRectangularGrid_MinY() {
		return (EAttribute)logicallyRectangularGridEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicallyRectangularGrid_MaxY() {
		return (EAttribute)logicallyRectangularGridEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnstructuredGrid() {
		return unstructuredGridEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Name() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinates() {
		return coordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniformCoordinates() {
		return uniformCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRectilinearCoordinates() {
		return rectilinearCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCurvilinearCoordinates() {
		return curvilinearCoordinatesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainDecomposition() {
		return domainDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSegmentDecomposition() {
		return segmentDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockDecomposition() {
		return blockDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoupler() {
		return couplerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoupler_Name() {
		return (EAttribute)couplerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoupler_Connector() {
		return (EReference)couplerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoupler_Transformation() {
		return (EReference)couplerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoupler_ConstituentModel() {
		return (EReference)couplerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryToMemoryConnector() {
		return memoryToMemoryConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryToFileConnector() {
		return memoryToFileConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMPIConnector() {
		return mpiConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterconstituentTransformation() {
		return interconstituentTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyTransformation() {
		return copyTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedistributeTransformation() {
		return redistributeTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegridTransformation() {
		return regridTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearRegridTransformation() {
		return linearRegridTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConservativeRegridTransformation() {
		return conservativeRegridTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntraconstituentTransformation() {
		return intraconstituentTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeIntegrationTransformation() {
		return timeIntegrationTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CplfmFactory getCplfmFactory() {
		return (CplfmFactory)getEFactoryInstance();
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
		constituentModelEClass = createEClass(CONSTITUENT_MODEL);
		createEAttribute(constituentModelEClass, CONSTITUENT_MODEL__NAME);
		createEReference(constituentModelEClass, CONSTITUENT_MODEL__GRID);
		createEReference(constituentModelEClass, CONSTITUENT_MODEL__PARALLEL);
		createEReference(constituentModelEClass, CONSTITUENT_MODEL__FIELD);

		parallelEClass = createEClass(PARALLEL);
		createEReference(parallelEClass, PARALLEL__DOMAIN_DECOMPOSITION);
		createEAttribute(parallelEClass, PARALLEL__PROCESS_LIST);

		gridEClass = createEClass(GRID);

		structuredGridEClass = createEClass(STRUCTURED_GRID);

		logicallyRectangularGridEClass = createEClass(LOGICALLY_RECTANGULAR_GRID);
		createEReference(logicallyRectangularGridEClass, LOGICALLY_RECTANGULAR_GRID__COORDINATES);
		createEAttribute(logicallyRectangularGridEClass, LOGICALLY_RECTANGULAR_GRID__MIN_X);
		createEAttribute(logicallyRectangularGridEClass, LOGICALLY_RECTANGULAR_GRID__MAX_X);
		createEAttribute(logicallyRectangularGridEClass, LOGICALLY_RECTANGULAR_GRID__MIN_Y);
		createEAttribute(logicallyRectangularGridEClass, LOGICALLY_RECTANGULAR_GRID__MAX_Y);

		unstructuredGridEClass = createEClass(UNSTRUCTURED_GRID);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);

		coordinatesEClass = createEClass(COORDINATES);

		uniformCoordinatesEClass = createEClass(UNIFORM_COORDINATES);

		rectilinearCoordinatesEClass = createEClass(RECTILINEAR_COORDINATES);

		curvilinearCoordinatesEClass = createEClass(CURVILINEAR_COORDINATES);

		domainDecompositionEClass = createEClass(DOMAIN_DECOMPOSITION);

		segmentDecompositionEClass = createEClass(SEGMENT_DECOMPOSITION);

		blockDecompositionEClass = createEClass(BLOCK_DECOMPOSITION);

		couplerEClass = createEClass(COUPLER);
		createEAttribute(couplerEClass, COUPLER__NAME);
		createEReference(couplerEClass, COUPLER__CONNECTOR);
		createEReference(couplerEClass, COUPLER__TRANSFORMATION);
		createEReference(couplerEClass, COUPLER__CONSTITUENT_MODEL);

		connectorEClass = createEClass(CONNECTOR);

		memoryToMemoryConnectorEClass = createEClass(MEMORY_TO_MEMORY_CONNECTOR);

		memoryToFileConnectorEClass = createEClass(MEMORY_TO_FILE_CONNECTOR);

		mpiConnectorEClass = createEClass(MPI_CONNECTOR);

		transformationEClass = createEClass(TRANSFORMATION);

		interconstituentTransformationEClass = createEClass(INTERCONSTITUENT_TRANSFORMATION);

		copyTransformationEClass = createEClass(COPY_TRANSFORMATION);

		redistributeTransformationEClass = createEClass(REDISTRIBUTE_TRANSFORMATION);

		regridTransformationEClass = createEClass(REGRID_TRANSFORMATION);

		linearRegridTransformationEClass = createEClass(LINEAR_REGRID_TRANSFORMATION);

		conservativeRegridTransformationEClass = createEClass(CONSERVATIVE_REGRID_TRANSFORMATION);

		intraconstituentTransformationEClass = createEClass(INTRACONSTITUENT_TRANSFORMATION);

		timeIntegrationTransformationEClass = createEClass(TIME_INTEGRATION_TRANSFORMATION);
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
		structuredGridEClass.getESuperTypes().add(this.getGrid());
		logicallyRectangularGridEClass.getESuperTypes().add(this.getStructuredGrid());
		unstructuredGridEClass.getESuperTypes().add(this.getGrid());
		uniformCoordinatesEClass.getESuperTypes().add(this.getCoordinates());
		rectilinearCoordinatesEClass.getESuperTypes().add(this.getCoordinates());
		curvilinearCoordinatesEClass.getESuperTypes().add(this.getCoordinates());
		segmentDecompositionEClass.getESuperTypes().add(this.getDomainDecomposition());
		blockDecompositionEClass.getESuperTypes().add(this.getDomainDecomposition());
		memoryToMemoryConnectorEClass.getESuperTypes().add(this.getConnector());
		memoryToFileConnectorEClass.getESuperTypes().add(this.getConnector());
		mpiConnectorEClass.getESuperTypes().add(this.getConnector());
		interconstituentTransformationEClass.getESuperTypes().add(this.getTransformation());
		copyTransformationEClass.getESuperTypes().add(this.getInterconstituentTransformation());
		redistributeTransformationEClass.getESuperTypes().add(this.getInterconstituentTransformation());
		regridTransformationEClass.getESuperTypes().add(this.getInterconstituentTransformation());
		linearRegridTransformationEClass.getESuperTypes().add(this.getRegridTransformation());
		conservativeRegridTransformationEClass.getESuperTypes().add(this.getRegridTransformation());
		intraconstituentTransformationEClass.getESuperTypes().add(this.getTransformation());
		timeIntegrationTransformationEClass.getESuperTypes().add(this.getIntraconstituentTransformation());

		// Initialize classes and features; add operations and parameters
		initEClass(constituentModelEClass, ConstituentModel.class, "ConstituentModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstituentModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, ConstituentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstituentModel_Grid(), this.getGrid(), null, "grid", null, 1, 1, ConstituentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstituentModel_Parallel(), this.getParallel(), null, "parallel", null, 0, 1, ConstituentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstituentModel_Field(), this.getField(), null, "field", null, 0, -1, ConstituentModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParallel_DomainDecomposition(), this.getDomainDecomposition(), null, "domainDecomposition", null, 1, 1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParallel_ProcessList(), ecorePackage.getEInt(), "processList", null, 1, -1, Parallel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gridEClass, Grid.class, "Grid", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuredGridEClass, StructuredGrid.class, "StructuredGrid", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicallyRectangularGridEClass, LogicallyRectangularGrid.class, "LogicallyRectangularGrid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicallyRectangularGrid_Coordinates(), this.getCoordinates(), null, "coordinates", null, 0, 1, LogicallyRectangularGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicallyRectangularGrid_MinX(), ecorePackage.getEInt(), "minX", null, 1, 1, LogicallyRectangularGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicallyRectangularGrid_MaxX(), ecorePackage.getEInt(), "maxX", null, 1, 1, LogicallyRectangularGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicallyRectangularGrid_MinY(), ecorePackage.getEInt(), "minY", null, 1, 1, LogicallyRectangularGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLogicallyRectangularGrid_MaxY(), ecorePackage.getEInt(), "maxY", null, 1, 1, LogicallyRectangularGrid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unstructuredGridEClass, UnstructuredGrid.class, "UnstructuredGrid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coordinatesEClass, Coordinates.class, "Coordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uniformCoordinatesEClass, UniformCoordinates.class, "UniformCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rectilinearCoordinatesEClass, RectilinearCoordinates.class, "RectilinearCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(curvilinearCoordinatesEClass, CurvilinearCoordinates.class, "CurvilinearCoordinates", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainDecompositionEClass, DomainDecomposition.class, "DomainDecomposition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(segmentDecompositionEClass, SegmentDecomposition.class, "SegmentDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockDecompositionEClass, BlockDecomposition.class, "BlockDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(couplerEClass, Coupler.class, "Coupler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoupler_Name(), ecorePackage.getEString(), "name", null, 1, 1, Coupler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoupler_Connector(), this.getConnector(), null, "connector", null, 1, 1, Coupler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoupler_Transformation(), this.getTransformation(), null, "transformation", null, 1, 1, Coupler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoupler_ConstituentModel(), this.getConstituentModel(), null, "constituentModel", null, 0, -1, Coupler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryToMemoryConnectorEClass, MemoryToMemoryConnector.class, "MemoryToMemoryConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(memoryToFileConnectorEClass, MemoryToFileConnector.class, "MemoryToFileConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mpiConnectorEClass, MPIConnector.class, "MPIConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transformationEClass, Transformation.class, "Transformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interconstituentTransformationEClass, InterconstituentTransformation.class, "InterconstituentTransformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(copyTransformationEClass, CopyTransformation.class, "CopyTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(redistributeTransformationEClass, RedistributeTransformation.class, "RedistributeTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(regridTransformationEClass, RegridTransformation.class, "RegridTransformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linearRegridTransformationEClass, LinearRegridTransformation.class, "LinearRegridTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conservativeRegridTransformationEClass, ConservativeRegridTransformation.class, "ConservativeRegridTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intraconstituentTransformationEClass, IntraconstituentTransformation.class, "IntraconstituentTransformation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeIntegrationTransformationEClass, TimeIntegrationTransformation.class, "TimeIntegrationTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //CplfmPackageImpl
