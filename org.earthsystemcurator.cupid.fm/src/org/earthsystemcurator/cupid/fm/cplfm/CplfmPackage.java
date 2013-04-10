/**
 */
package org.earthsystemcurator.cupid.fm.cplfm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmFactory
 * @model kind="package"
 * @generated
 */
public interface CplfmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cplfm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.earthsystemcurator.org/cplfm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cplfm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CplfmPackage eINSTANCE = org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.ConstituentModelImpl <em>Constituent Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.ConstituentModelImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getConstituentModel()
	 * @generated
	 */
	int CONSTITUENT_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_MODEL__GRID = 0;

	/**
	 * The feature id for the '<em><b>Parallel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_MODEL__PARALLEL = 1;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_MODEL__FIELD = 2;

	/**
	 * The number of structural features of the '<em>Constituent Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTITUENT_MODEL_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.ParallelImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getParallel()
	 * @generated
	 */
	int PARALLEL = 1;

	/**
	 * The feature id for the '<em><b>Domain Decomposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__DOMAIN_DECOMPOSITION = 0;

	/**
	 * The feature id for the '<em><b>Process List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__PROCESS_LIST = 1;

	/**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.GridImpl <em>Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.GridImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getGrid()
	 * @generated
	 */
	int GRID = 2;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.StructuredGridImpl <em>Structured Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.StructuredGridImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getStructuredGrid()
	 * @generated
	 */
	int STRUCTURED_GRID = 3;

	/**
	 * The number of structural features of the '<em>Structured Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_GRID_FEATURE_COUNT = GRID_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.LogicallyRectangularGridImpl <em>Logically Rectangular Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.LogicallyRectangularGridImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getLogicallyRectangularGrid()
	 * @generated
	 */
	int LOGICALLY_RECTANGULAR_GRID = 4;

	/**
	 * The feature id for the '<em><b>Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICALLY_RECTANGULAR_GRID__COORDINATES = STRUCTURED_GRID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICALLY_RECTANGULAR_GRID__MIN_X = STRUCTURED_GRID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICALLY_RECTANGULAR_GRID__MAX_X = STRUCTURED_GRID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICALLY_RECTANGULAR_GRID__MIN_Y = STRUCTURED_GRID_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICALLY_RECTANGULAR_GRID__MAX_Y = STRUCTURED_GRID_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Logically Rectangular Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICALLY_RECTANGULAR_GRID_FEATURE_COUNT = STRUCTURED_GRID_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.UnstructuredGridImpl <em>Unstructured Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.UnstructuredGridImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getUnstructuredGrid()
	 * @generated
	 */
	int UNSTRUCTURED_GRID = 5;

	/**
	 * The number of structural features of the '<em>Unstructured Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRUCTURED_GRID_FEATURE_COUNT = GRID_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.FieldImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.CoordinatesImpl <em>Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CoordinatesImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getCoordinates()
	 * @generated
	 */
	int COORDINATES = 7;

	/**
	 * The number of structural features of the '<em>Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATES_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.UniformCoordinatesImpl <em>Uniform Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.UniformCoordinatesImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getUniformCoordinates()
	 * @generated
	 */
	int UNIFORM_COORDINATES = 8;

	/**
	 * The number of structural features of the '<em>Uniform Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFORM_COORDINATES_FEATURE_COUNT = COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.RectilinearCoordinatesImpl <em>Rectilinear Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.RectilinearCoordinatesImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getRectilinearCoordinates()
	 * @generated
	 */
	int RECTILINEAR_COORDINATES = 9;

	/**
	 * The number of structural features of the '<em>Rectilinear Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTILINEAR_COORDINATES_FEATURE_COUNT = COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.CurvilinearCoordinatesImpl <em>Curvilinear Coordinates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CurvilinearCoordinatesImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getCurvilinearCoordinates()
	 * @generated
	 */
	int CURVILINEAR_COORDINATES = 10;

	/**
	 * The number of structural features of the '<em>Curvilinear Coordinates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURVILINEAR_COORDINATES_FEATURE_COUNT = COORDINATES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.DomainDecompositionImpl <em>Domain Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.DomainDecompositionImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getDomainDecomposition()
	 * @generated
	 */
	int DOMAIN_DECOMPOSITION = 11;

	/**
	 * The number of structural features of the '<em>Domain Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_DECOMPOSITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.SegmentDecompositionImpl <em>Segment Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.SegmentDecompositionImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getSegmentDecomposition()
	 * @generated
	 */
	int SEGMENT_DECOMPOSITION = 12;

	/**
	 * The number of structural features of the '<em>Segment Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_DECOMPOSITION_FEATURE_COUNT = DOMAIN_DECOMPOSITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.BlockDecompositionImpl <em>Block Decomposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.BlockDecompositionImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getBlockDecomposition()
	 * @generated
	 */
	int BLOCK_DECOMPOSITION = 13;

	/**
	 * The number of structural features of the '<em>Block Decomposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_DECOMPOSITION_FEATURE_COUNT = DOMAIN_DECOMPOSITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.CouplerImpl <em>Coupler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CouplerImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getCoupler()
	 * @generated
	 */
	int COUPLER = 14;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLER__CONNECTOR = 0;

	/**
	 * The number of structural features of the '<em>Coupler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.ConnectorImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 15;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.MemoryToMemoryConnectorImpl <em>Memory To Memory Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.MemoryToMemoryConnectorImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getMemoryToMemoryConnector()
	 * @generated
	 */
	int MEMORY_TO_MEMORY_CONNECTOR = 16;

	/**
	 * The number of structural features of the '<em>Memory To Memory Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TO_MEMORY_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.MemoryToFileConnectorImpl <em>Memory To File Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.MemoryToFileConnectorImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getMemoryToFileConnector()
	 * @generated
	 */
	int MEMORY_TO_FILE_CONNECTOR = 17;

	/**
	 * The number of structural features of the '<em>Memory To File Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_TO_FILE_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.MPIConnectorImpl <em>MPI Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.MPIConnectorImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getMPIConnector()
	 * @generated
	 */
	int MPI_CONNECTOR = 18;

	/**
	 * The number of structural features of the '<em>MPI Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MPI_CONNECTOR_FEATURE_COUNT = CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.TransformationImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 19;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.InterconstituentTransformationImpl <em>Interconstituent Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.InterconstituentTransformationImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getInterconstituentTransformation()
	 * @generated
	 */
	int INTERCONSTITUENT_TRANSFORMATION = 20;

	/**
	 * The number of structural features of the '<em>Interconstituent Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERCONSTITUENT_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.CopyTransformationImpl <em>Copy Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CopyTransformationImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getCopyTransformation()
	 * @generated
	 */
	int COPY_TRANSFORMATION = 21;

	/**
	 * The number of structural features of the '<em>Copy Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_TRANSFORMATION_FEATURE_COUNT = INTERCONSTITUENT_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.RedistributeTransformationImpl <em>Redistribute Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.RedistributeTransformationImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getRedistributeTransformation()
	 * @generated
	 */
	int REDISTRIBUTE_TRANSFORMATION = 22;

	/**
	 * The number of structural features of the '<em>Redistribute Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDISTRIBUTE_TRANSFORMATION_FEATURE_COUNT = INTERCONSTITUENT_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.RegridTransformationImpl <em>Regrid Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.RegridTransformationImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getRegridTransformation()
	 * @generated
	 */
	int REGRID_TRANSFORMATION = 23;

	/**
	 * The number of structural features of the '<em>Regrid Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGRID_TRANSFORMATION_FEATURE_COUNT = INTERCONSTITUENT_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.LinearRegridTransformationImpl <em>Linear Regrid Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.LinearRegridTransformationImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getLinearRegridTransformation()
	 * @generated
	 */
	int LINEAR_REGRID_TRANSFORMATION = 24;

	/**
	 * The number of structural features of the '<em>Linear Regrid Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINEAR_REGRID_TRANSFORMATION_FEATURE_COUNT = REGRID_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.ConservativeRegridTransformationImpl <em>Conservative Regrid Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.ConservativeRegridTransformationImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getConservativeRegridTransformation()
	 * @generated
	 */
	int CONSERVATIVE_REGRID_TRANSFORMATION = 25;

	/**
	 * The number of structural features of the '<em>Conservative Regrid Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSERVATIVE_REGRID_TRANSFORMATION_FEATURE_COUNT = REGRID_TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.IntraconstituentTransformationImpl <em>Intraconstituent Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.IntraconstituentTransformationImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getIntraconstituentTransformation()
	 * @generated
	 */
	int INTRACONSTITUENT_TRANSFORMATION = 26;

	/**
	 * The number of structural features of the '<em>Intraconstituent Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRACONSTITUENT_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.TimeIntegrationTransformationImpl <em>Time Integration Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.TimeIntegrationTransformationImpl
	 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getTimeIntegrationTransformation()
	 * @generated
	 */
	int TIME_INTEGRATION_TRANSFORMATION = 27;

	/**
	 * The number of structural features of the '<em>Time Integration Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTEGRATION_TRANSFORMATION_FEATURE_COUNT = INTRACONSTITUENT_TRANSFORMATION_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel <em>Constituent Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constituent Model</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel
	 * @generated
	 */
	EClass getConstituentModel();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grid</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel#getGrid()
	 * @see #getConstituentModel()
	 * @generated
	 */
	EReference getConstituentModel_Grid();

	/**
	 * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel#getParallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parallel</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel#getParallel()
	 * @see #getConstituentModel()
	 * @generated
	 */
	EReference getConstituentModel_Parallel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel#getField()
	 * @see #getConstituentModel()
	 * @generated
	 */
	EReference getConstituentModel_Field();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.Parallel
	 * @generated
	 */
	EClass getParallel();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.fm.cplfm.Parallel#getDomainDecomposition <em>Domain Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Decomposition</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.Parallel#getDomainDecomposition()
	 * @see #getParallel()
	 * @generated
	 */
	EReference getParallel_DomainDecomposition();

	/**
	 * Returns the meta object for the attribute list '{@link org.earthsystemcurator.cupid.fm.cplfm.Parallel#getProcessList <em>Process List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Process List</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.Parallel#getProcessList()
	 * @see #getParallel()
	 * @generated
	 */
	EAttribute getParallel_ProcessList();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.Grid
	 * @generated
	 */
	EClass getGrid();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.StructuredGrid <em>Structured Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Grid</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.StructuredGrid
	 * @generated
	 */
	EClass getStructuredGrid();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid <em>Logically Rectangular Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logically Rectangular Grid</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid
	 * @generated
	 */
	EClass getLogicallyRectangularGrid();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getCoordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordinates</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getCoordinates()
	 * @see #getLogicallyRectangularGrid()
	 * @generated
	 */
	EReference getLogicallyRectangularGrid_Coordinates();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getMinX <em>Min X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min X</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getMinX()
	 * @see #getLogicallyRectangularGrid()
	 * @generated
	 */
	EAttribute getLogicallyRectangularGrid_MinX();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getMaxX <em>Max X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max X</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getMaxX()
	 * @see #getLogicallyRectangularGrid()
	 * @generated
	 */
	EAttribute getLogicallyRectangularGrid_MaxX();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getMinY <em>Min Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Y</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getMinY()
	 * @see #getLogicallyRectangularGrid()
	 * @generated
	 */
	EAttribute getLogicallyRectangularGrid_MinY();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getMaxY <em>Max Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Y</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getMaxY()
	 * @see #getLogicallyRectangularGrid()
	 * @generated
	 */
	EAttribute getLogicallyRectangularGrid_MaxY();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.UnstructuredGrid <em>Unstructured Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unstructured Grid</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.UnstructuredGrid
	 * @generated
	 */
	EClass getUnstructuredGrid();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupid.fm.cplfm.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.Coordinates <em>Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinates</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.Coordinates
	 * @generated
	 */
	EClass getCoordinates();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.UniformCoordinates <em>Uniform Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uniform Coordinates</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.UniformCoordinates
	 * @generated
	 */
	EClass getUniformCoordinates();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.RectilinearCoordinates <em>Rectilinear Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectilinear Coordinates</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.RectilinearCoordinates
	 * @generated
	 */
	EClass getRectilinearCoordinates();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.CurvilinearCoordinates <em>Curvilinear Coordinates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Curvilinear Coordinates</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CurvilinearCoordinates
	 * @generated
	 */
	EClass getCurvilinearCoordinates();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.DomainDecomposition <em>Domain Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Decomposition</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.DomainDecomposition
	 * @generated
	 */
	EClass getDomainDecomposition();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.SegmentDecomposition <em>Segment Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment Decomposition</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.SegmentDecomposition
	 * @generated
	 */
	EClass getSegmentDecomposition();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.BlockDecomposition <em>Block Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Decomposition</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.BlockDecomposition
	 * @generated
	 */
	EClass getBlockDecomposition();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.Coupler <em>Coupler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupler</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.Coupler
	 * @generated
	 */
	EClass getCoupler();

	/**
	 * Returns the meta object for the reference '{@link org.earthsystemcurator.cupid.fm.cplfm.Coupler#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.Coupler#getConnector()
	 * @see #getCoupler()
	 * @generated
	 */
	EReference getCoupler_Connector();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.MemoryToMemoryConnector <em>Memory To Memory Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory To Memory Connector</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.MemoryToMemoryConnector
	 * @generated
	 */
	EClass getMemoryToMemoryConnector();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.MemoryToFileConnector <em>Memory To File Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory To File Connector</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.MemoryToFileConnector
	 * @generated
	 */
	EClass getMemoryToFileConnector();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.MPIConnector <em>MPI Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MPI Connector</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.MPIConnector
	 * @generated
	 */
	EClass getMPIConnector();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.InterconstituentTransformation <em>Interconstituent Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interconstituent Transformation</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.InterconstituentTransformation
	 * @generated
	 */
	EClass getInterconstituentTransformation();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.CopyTransformation <em>Copy Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy Transformation</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CopyTransformation
	 * @generated
	 */
	EClass getCopyTransformation();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.RedistributeTransformation <em>Redistribute Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redistribute Transformation</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.RedistributeTransformation
	 * @generated
	 */
	EClass getRedistributeTransformation();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.RegridTransformation <em>Regrid Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regrid Transformation</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.RegridTransformation
	 * @generated
	 */
	EClass getRegridTransformation();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.LinearRegridTransformation <em>Linear Regrid Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linear Regrid Transformation</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.LinearRegridTransformation
	 * @generated
	 */
	EClass getLinearRegridTransformation();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.ConservativeRegridTransformation <em>Conservative Regrid Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conservative Regrid Transformation</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.ConservativeRegridTransformation
	 * @generated
	 */
	EClass getConservativeRegridTransformation();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.IntraconstituentTransformation <em>Intraconstituent Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intraconstituent Transformation</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.IntraconstituentTransformation
	 * @generated
	 */
	EClass getIntraconstituentTransformation();

	/**
	 * Returns the meta object for class '{@link org.earthsystemcurator.cupid.fm.cplfm.TimeIntegrationTransformation <em>Time Integration Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Integration Transformation</em>'.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.TimeIntegrationTransformation
	 * @generated
	 */
	EClass getTimeIntegrationTransformation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CplfmFactory getCplfmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.ConstituentModelImpl <em>Constituent Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.ConstituentModelImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getConstituentModel()
		 * @generated
		 */
		EClass CONSTITUENT_MODEL = eINSTANCE.getConstituentModel();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTITUENT_MODEL__GRID = eINSTANCE.getConstituentModel_Grid();

		/**
		 * The meta object literal for the '<em><b>Parallel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTITUENT_MODEL__PARALLEL = eINSTANCE.getConstituentModel_Parallel();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTITUENT_MODEL__FIELD = eINSTANCE.getConstituentModel_Field();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.ParallelImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getParallel()
		 * @generated
		 */
		EClass PARALLEL = eINSTANCE.getParallel();

		/**
		 * The meta object literal for the '<em><b>Domain Decomposition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL__DOMAIN_DECOMPOSITION = eINSTANCE.getParallel_DomainDecomposition();

		/**
		 * The meta object literal for the '<em><b>Process List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARALLEL__PROCESS_LIST = eINSTANCE.getParallel_ProcessList();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.GridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.GridImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getGrid()
		 * @generated
		 */
		EClass GRID = eINSTANCE.getGrid();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.StructuredGridImpl <em>Structured Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.StructuredGridImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getStructuredGrid()
		 * @generated
		 */
		EClass STRUCTURED_GRID = eINSTANCE.getStructuredGrid();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.LogicallyRectangularGridImpl <em>Logically Rectangular Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.LogicallyRectangularGridImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getLogicallyRectangularGrid()
		 * @generated
		 */
		EClass LOGICALLY_RECTANGULAR_GRID = eINSTANCE.getLogicallyRectangularGrid();

		/**
		 * The meta object literal for the '<em><b>Coordinates</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICALLY_RECTANGULAR_GRID__COORDINATES = eINSTANCE.getLogicallyRectangularGrid_Coordinates();

		/**
		 * The meta object literal for the '<em><b>Min X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICALLY_RECTANGULAR_GRID__MIN_X = eINSTANCE.getLogicallyRectangularGrid_MinX();

		/**
		 * The meta object literal for the '<em><b>Max X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICALLY_RECTANGULAR_GRID__MAX_X = eINSTANCE.getLogicallyRectangularGrid_MaxX();

		/**
		 * The meta object literal for the '<em><b>Min Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICALLY_RECTANGULAR_GRID__MIN_Y = eINSTANCE.getLogicallyRectangularGrid_MinY();

		/**
		 * The meta object literal for the '<em><b>Max Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICALLY_RECTANGULAR_GRID__MAX_Y = eINSTANCE.getLogicallyRectangularGrid_MaxY();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.UnstructuredGridImpl <em>Unstructured Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.UnstructuredGridImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getUnstructuredGrid()
		 * @generated
		 */
		EClass UNSTRUCTURED_GRID = eINSTANCE.getUnstructuredGrid();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.FieldImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.CoordinatesImpl <em>Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CoordinatesImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getCoordinates()
		 * @generated
		 */
		EClass COORDINATES = eINSTANCE.getCoordinates();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.UniformCoordinatesImpl <em>Uniform Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.UniformCoordinatesImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getUniformCoordinates()
		 * @generated
		 */
		EClass UNIFORM_COORDINATES = eINSTANCE.getUniformCoordinates();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.RectilinearCoordinatesImpl <em>Rectilinear Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.RectilinearCoordinatesImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getRectilinearCoordinates()
		 * @generated
		 */
		EClass RECTILINEAR_COORDINATES = eINSTANCE.getRectilinearCoordinates();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.CurvilinearCoordinatesImpl <em>Curvilinear Coordinates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CurvilinearCoordinatesImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getCurvilinearCoordinates()
		 * @generated
		 */
		EClass CURVILINEAR_COORDINATES = eINSTANCE.getCurvilinearCoordinates();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.DomainDecompositionImpl <em>Domain Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.DomainDecompositionImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getDomainDecomposition()
		 * @generated
		 */
		EClass DOMAIN_DECOMPOSITION = eINSTANCE.getDomainDecomposition();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.SegmentDecompositionImpl <em>Segment Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.SegmentDecompositionImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getSegmentDecomposition()
		 * @generated
		 */
		EClass SEGMENT_DECOMPOSITION = eINSTANCE.getSegmentDecomposition();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.BlockDecompositionImpl <em>Block Decomposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.BlockDecompositionImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getBlockDecomposition()
		 * @generated
		 */
		EClass BLOCK_DECOMPOSITION = eINSTANCE.getBlockDecomposition();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.CouplerImpl <em>Coupler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CouplerImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getCoupler()
		 * @generated
		 */
		EClass COUPLER = eINSTANCE.getCoupler();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUPLER__CONNECTOR = eINSTANCE.getCoupler_Connector();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.ConnectorImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.MemoryToMemoryConnectorImpl <em>Memory To Memory Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.MemoryToMemoryConnectorImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getMemoryToMemoryConnector()
		 * @generated
		 */
		EClass MEMORY_TO_MEMORY_CONNECTOR = eINSTANCE.getMemoryToMemoryConnector();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.MemoryToFileConnectorImpl <em>Memory To File Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.MemoryToFileConnectorImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getMemoryToFileConnector()
		 * @generated
		 */
		EClass MEMORY_TO_FILE_CONNECTOR = eINSTANCE.getMemoryToFileConnector();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.MPIConnectorImpl <em>MPI Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.MPIConnectorImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getMPIConnector()
		 * @generated
		 */
		EClass MPI_CONNECTOR = eINSTANCE.getMPIConnector();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.TransformationImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.InterconstituentTransformationImpl <em>Interconstituent Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.InterconstituentTransformationImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getInterconstituentTransformation()
		 * @generated
		 */
		EClass INTERCONSTITUENT_TRANSFORMATION = eINSTANCE.getInterconstituentTransformation();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.CopyTransformationImpl <em>Copy Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CopyTransformationImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getCopyTransformation()
		 * @generated
		 */
		EClass COPY_TRANSFORMATION = eINSTANCE.getCopyTransformation();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.RedistributeTransformationImpl <em>Redistribute Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.RedistributeTransformationImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getRedistributeTransformation()
		 * @generated
		 */
		EClass REDISTRIBUTE_TRANSFORMATION = eINSTANCE.getRedistributeTransformation();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.RegridTransformationImpl <em>Regrid Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.RegridTransformationImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getRegridTransformation()
		 * @generated
		 */
		EClass REGRID_TRANSFORMATION = eINSTANCE.getRegridTransformation();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.LinearRegridTransformationImpl <em>Linear Regrid Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.LinearRegridTransformationImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getLinearRegridTransformation()
		 * @generated
		 */
		EClass LINEAR_REGRID_TRANSFORMATION = eINSTANCE.getLinearRegridTransformation();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.ConservativeRegridTransformationImpl <em>Conservative Regrid Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.ConservativeRegridTransformationImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getConservativeRegridTransformation()
		 * @generated
		 */
		EClass CONSERVATIVE_REGRID_TRANSFORMATION = eINSTANCE.getConservativeRegridTransformation();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.IntraconstituentTransformationImpl <em>Intraconstituent Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.IntraconstituentTransformationImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getIntraconstituentTransformation()
		 * @generated
		 */
		EClass INTRACONSTITUENT_TRANSFORMATION = eINSTANCE.getIntraconstituentTransformation();

		/**
		 * The meta object literal for the '{@link org.earthsystemcurator.cupid.fm.cplfm.impl.TimeIntegrationTransformationImpl <em>Time Integration Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.TimeIntegrationTransformationImpl
		 * @see org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmPackageImpl#getTimeIntegrationTransformation()
		 * @generated
		 */
		EClass TIME_INTEGRATION_TRANSFORMATION = eINSTANCE.getTimeIntegrationTransformation();

	}

} //CplfmPackage
