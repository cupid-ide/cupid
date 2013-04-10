/**
 */
package org.earthsystemcurator.cupid.fm.cplfm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage
 * @generated
 */
public interface CplfmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CplfmFactory eINSTANCE = org.earthsystemcurator.cupid.fm.cplfm.impl.CplfmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Constituent Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constituent Model</em>'.
	 * @generated
	 */
	ConstituentModel createConstituentModel();

	/**
	 * Returns a new object of class '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel</em>'.
	 * @generated
	 */
	Parallel createParallel();

	/**
	 * Returns a new object of class '<em>Logically Rectangular Grid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logically Rectangular Grid</em>'.
	 * @generated
	 */
	LogicallyRectangularGrid createLogicallyRectangularGrid();

	/**
	 * Returns a new object of class '<em>Unstructured Grid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unstructured Grid</em>'.
	 * @generated
	 */
	UnstructuredGrid createUnstructuredGrid();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinates</em>'.
	 * @generated
	 */
	Coordinates createCoordinates();

	/**
	 * Returns a new object of class '<em>Uniform Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uniform Coordinates</em>'.
	 * @generated
	 */
	UniformCoordinates createUniformCoordinates();

	/**
	 * Returns a new object of class '<em>Rectilinear Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectilinear Coordinates</em>'.
	 * @generated
	 */
	RectilinearCoordinates createRectilinearCoordinates();

	/**
	 * Returns a new object of class '<em>Curvilinear Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Curvilinear Coordinates</em>'.
	 * @generated
	 */
	CurvilinearCoordinates createCurvilinearCoordinates();

	/**
	 * Returns a new object of class '<em>Segment Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segment Decomposition</em>'.
	 * @generated
	 */
	SegmentDecomposition createSegmentDecomposition();

	/**
	 * Returns a new object of class '<em>Block Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Block Decomposition</em>'.
	 * @generated
	 */
	BlockDecomposition createBlockDecomposition();

	/**
	 * Returns a new object of class '<em>Coupler</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupler</em>'.
	 * @generated
	 */
	Coupler createCoupler();

	/**
	 * Returns a new object of class '<em>Memory To Memory Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory To Memory Connector</em>'.
	 * @generated
	 */
	MemoryToMemoryConnector createMemoryToMemoryConnector();

	/**
	 * Returns a new object of class '<em>Memory To File Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memory To File Connector</em>'.
	 * @generated
	 */
	MemoryToFileConnector createMemoryToFileConnector();

	/**
	 * Returns a new object of class '<em>MPI Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MPI Connector</em>'.
	 * @generated
	 */
	MPIConnector createMPIConnector();

	/**
	 * Returns a new object of class '<em>Copy Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copy Transformation</em>'.
	 * @generated
	 */
	CopyTransformation createCopyTransformation();

	/**
	 * Returns a new object of class '<em>Redistribute Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redistribute Transformation</em>'.
	 * @generated
	 */
	RedistributeTransformation createRedistributeTransformation();

	/**
	 * Returns a new object of class '<em>Linear Regrid Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linear Regrid Transformation</em>'.
	 * @generated
	 */
	LinearRegridTransformation createLinearRegridTransformation();

	/**
	 * Returns a new object of class '<em>Conservative Regrid Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conservative Regrid Transformation</em>'.
	 * @generated
	 */
	ConservativeRegridTransformation createConservativeRegridTransformation();

	/**
	 * Returns a new object of class '<em>Time Integration Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Integration Transformation</em>'.
	 * @generated
	 */
	TimeIntegrationTransformation createTimeIntegrationTransformation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CplfmPackage getCplfmPackage();

} //CplfmFactory
