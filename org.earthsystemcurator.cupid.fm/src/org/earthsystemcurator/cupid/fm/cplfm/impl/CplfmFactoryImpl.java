/**
 */
package org.earthsystemcurator.cupid.fm.cplfm.impl;

import org.earthsystemcurator.cupid.fm.cplfm.*;

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
public class CplfmFactoryImpl extends EFactoryImpl implements CplfmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CplfmFactory init() {
		try {
			CplfmFactory theCplfmFactory = (CplfmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.earthsystemcurator.org/cplfm"); 
			if (theCplfmFactory != null) {
				return theCplfmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CplfmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CplfmFactoryImpl() {
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
			case CplfmPackage.CONSTITUENT_MODEL: return createConstituentModel();
			case CplfmPackage.PARALLEL: return createParallel();
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID: return createLogicallyRectangularGrid();
			case CplfmPackage.UNSTRUCTURED_GRID: return createUnstructuredGrid();
			case CplfmPackage.FIELD: return createField();
			case CplfmPackage.COORDINATES: return createCoordinates();
			case CplfmPackage.UNIFORM_COORDINATES: return createUniformCoordinates();
			case CplfmPackage.RECTILINEAR_COORDINATES: return createRectilinearCoordinates();
			case CplfmPackage.CURVILINEAR_COORDINATES: return createCurvilinearCoordinates();
			case CplfmPackage.SEGMENT_DECOMPOSITION: return createSegmentDecomposition();
			case CplfmPackage.BLOCK_DECOMPOSITION: return createBlockDecomposition();
			case CplfmPackage.COUPLER: return createCoupler();
			case CplfmPackage.MEMORY_TO_MEMORY_CONNECTOR: return createMemoryToMemoryConnector();
			case CplfmPackage.MEMORY_TO_FILE_CONNECTOR: return createMemoryToFileConnector();
			case CplfmPackage.MPI_CONNECTOR: return createMPIConnector();
			case CplfmPackage.COPY_TRANSFORMATION: return createCopyTransformation();
			case CplfmPackage.REDISTRIBUTE_TRANSFORMATION: return createRedistributeTransformation();
			case CplfmPackage.LINEAR_REGRID_TRANSFORMATION: return createLinearRegridTransformation();
			case CplfmPackage.CONSERVATIVE_REGRID_TRANSFORMATION: return createConservativeRegridTransformation();
			case CplfmPackage.TIME_INTEGRATION_TRANSFORMATION: return createTimeIntegrationTransformation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstituentModel createConstituentModel() {
		ConstituentModelImpl constituentModel = new ConstituentModelImpl();
		return constituentModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parallel createParallel() {
		ParallelImpl parallel = new ParallelImpl();
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicallyRectangularGrid createLogicallyRectangularGrid() {
		LogicallyRectangularGridImpl logicallyRectangularGrid = new LogicallyRectangularGridImpl();
		return logicallyRectangularGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnstructuredGrid createUnstructuredGrid() {
		UnstructuredGridImpl unstructuredGrid = new UnstructuredGridImpl();
		return unstructuredGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coordinates createCoordinates() {
		CoordinatesImpl coordinates = new CoordinatesImpl();
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniformCoordinates createUniformCoordinates() {
		UniformCoordinatesImpl uniformCoordinates = new UniformCoordinatesImpl();
		return uniformCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectilinearCoordinates createRectilinearCoordinates() {
		RectilinearCoordinatesImpl rectilinearCoordinates = new RectilinearCoordinatesImpl();
		return rectilinearCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurvilinearCoordinates createCurvilinearCoordinates() {
		CurvilinearCoordinatesImpl curvilinearCoordinates = new CurvilinearCoordinatesImpl();
		return curvilinearCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentDecomposition createSegmentDecomposition() {
		SegmentDecompositionImpl segmentDecomposition = new SegmentDecompositionImpl();
		return segmentDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockDecomposition createBlockDecomposition() {
		BlockDecompositionImpl blockDecomposition = new BlockDecompositionImpl();
		return blockDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coupler createCoupler() {
		CouplerImpl coupler = new CouplerImpl();
		return coupler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryToMemoryConnector createMemoryToMemoryConnector() {
		MemoryToMemoryConnectorImpl memoryToMemoryConnector = new MemoryToMemoryConnectorImpl();
		return memoryToMemoryConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryToFileConnector createMemoryToFileConnector() {
		MemoryToFileConnectorImpl memoryToFileConnector = new MemoryToFileConnectorImpl();
		return memoryToFileConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MPIConnector createMPIConnector() {
		MPIConnectorImpl mpiConnector = new MPIConnectorImpl();
		return mpiConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyTransformation createCopyTransformation() {
		CopyTransformationImpl copyTransformation = new CopyTransformationImpl();
		return copyTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RedistributeTransformation createRedistributeTransformation() {
		RedistributeTransformationImpl redistributeTransformation = new RedistributeTransformationImpl();
		return redistributeTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearRegridTransformation createLinearRegridTransformation() {
		LinearRegridTransformationImpl linearRegridTransformation = new LinearRegridTransformationImpl();
		return linearRegridTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConservativeRegridTransformation createConservativeRegridTransformation() {
		ConservativeRegridTransformationImpl conservativeRegridTransformation = new ConservativeRegridTransformationImpl();
		return conservativeRegridTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeIntegrationTransformation createTimeIntegrationTransformation() {
		TimeIntegrationTransformationImpl timeIntegrationTransformation = new TimeIntegrationTransformationImpl();
		return timeIntegrationTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CplfmPackage getCplfmPackage() {
		return (CplfmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CplfmPackage getPackage() {
		return CplfmPackage.eINSTANCE;
	}

} //CplfmFactoryImpl
