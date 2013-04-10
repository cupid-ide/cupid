/**
 */
package org.earthsystemcurator.cupid.fm.cplfm.util;

import org.earthsystemcurator.cupid.fm.cplfm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage
 * @generated
 */
public class CplfmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CplfmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CplfmSwitch() {
		if (modelPackage == null) {
			modelPackage = CplfmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CplfmPackage.CONSTITUENT_MODEL: {
				ConstituentModel constituentModel = (ConstituentModel)theEObject;
				T result = caseConstituentModel(constituentModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.PARALLEL: {
				Parallel parallel = (Parallel)theEObject;
				T result = caseParallel(parallel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.GRID: {
				Grid grid = (Grid)theEObject;
				T result = caseGrid(grid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.STRUCTURED_GRID: {
				StructuredGrid structuredGrid = (StructuredGrid)theEObject;
				T result = caseStructuredGrid(structuredGrid);
				if (result == null) result = caseGrid(structuredGrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.LOGICALLY_RECTANGULAR_GRID: {
				LogicallyRectangularGrid logicallyRectangularGrid = (LogicallyRectangularGrid)theEObject;
				T result = caseLogicallyRectangularGrid(logicallyRectangularGrid);
				if (result == null) result = caseStructuredGrid(logicallyRectangularGrid);
				if (result == null) result = caseGrid(logicallyRectangularGrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.UNSTRUCTURED_GRID: {
				UnstructuredGrid unstructuredGrid = (UnstructuredGrid)theEObject;
				T result = caseUnstructuredGrid(unstructuredGrid);
				if (result == null) result = caseGrid(unstructuredGrid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.COORDINATES: {
				Coordinates coordinates = (Coordinates)theEObject;
				T result = caseCoordinates(coordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.UNIFORM_COORDINATES: {
				UniformCoordinates uniformCoordinates = (UniformCoordinates)theEObject;
				T result = caseUniformCoordinates(uniformCoordinates);
				if (result == null) result = caseCoordinates(uniformCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.RECTILINEAR_COORDINATES: {
				RectilinearCoordinates rectilinearCoordinates = (RectilinearCoordinates)theEObject;
				T result = caseRectilinearCoordinates(rectilinearCoordinates);
				if (result == null) result = caseCoordinates(rectilinearCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.CURVILINEAR_COORDINATES: {
				CurvilinearCoordinates curvilinearCoordinates = (CurvilinearCoordinates)theEObject;
				T result = caseCurvilinearCoordinates(curvilinearCoordinates);
				if (result == null) result = caseCoordinates(curvilinearCoordinates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.DOMAIN_DECOMPOSITION: {
				DomainDecomposition domainDecomposition = (DomainDecomposition)theEObject;
				T result = caseDomainDecomposition(domainDecomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.SEGMENT_DECOMPOSITION: {
				SegmentDecomposition segmentDecomposition = (SegmentDecomposition)theEObject;
				T result = caseSegmentDecomposition(segmentDecomposition);
				if (result == null) result = caseDomainDecomposition(segmentDecomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.BLOCK_DECOMPOSITION: {
				BlockDecomposition blockDecomposition = (BlockDecomposition)theEObject;
				T result = caseBlockDecomposition(blockDecomposition);
				if (result == null) result = caseDomainDecomposition(blockDecomposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.COUPLER: {
				Coupler coupler = (Coupler)theEObject;
				T result = caseCoupler(coupler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.CONNECTOR: {
				Connector connector = (Connector)theEObject;
				T result = caseConnector(connector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.MEMORY_TO_MEMORY_CONNECTOR: {
				MemoryToMemoryConnector memoryToMemoryConnector = (MemoryToMemoryConnector)theEObject;
				T result = caseMemoryToMemoryConnector(memoryToMemoryConnector);
				if (result == null) result = caseConnector(memoryToMemoryConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.MEMORY_TO_FILE_CONNECTOR: {
				MemoryToFileConnector memoryToFileConnector = (MemoryToFileConnector)theEObject;
				T result = caseMemoryToFileConnector(memoryToFileConnector);
				if (result == null) result = caseConnector(memoryToFileConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.MPI_CONNECTOR: {
				MPIConnector mpiConnector = (MPIConnector)theEObject;
				T result = caseMPIConnector(mpiConnector);
				if (result == null) result = caseConnector(mpiConnector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				T result = caseTransformation(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.INTERCONSTITUENT_TRANSFORMATION: {
				InterconstituentTransformation interconstituentTransformation = (InterconstituentTransformation)theEObject;
				T result = caseInterconstituentTransformation(interconstituentTransformation);
				if (result == null) result = caseTransformation(interconstituentTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.COPY_TRANSFORMATION: {
				CopyTransformation copyTransformation = (CopyTransformation)theEObject;
				T result = caseCopyTransformation(copyTransformation);
				if (result == null) result = caseInterconstituentTransformation(copyTransformation);
				if (result == null) result = caseTransformation(copyTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.REDISTRIBUTE_TRANSFORMATION: {
				RedistributeTransformation redistributeTransformation = (RedistributeTransformation)theEObject;
				T result = caseRedistributeTransformation(redistributeTransformation);
				if (result == null) result = caseInterconstituentTransformation(redistributeTransformation);
				if (result == null) result = caseTransformation(redistributeTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.REGRID_TRANSFORMATION: {
				RegridTransformation regridTransformation = (RegridTransformation)theEObject;
				T result = caseRegridTransformation(regridTransformation);
				if (result == null) result = caseInterconstituentTransformation(regridTransformation);
				if (result == null) result = caseTransformation(regridTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.LINEAR_REGRID_TRANSFORMATION: {
				LinearRegridTransformation linearRegridTransformation = (LinearRegridTransformation)theEObject;
				T result = caseLinearRegridTransformation(linearRegridTransformation);
				if (result == null) result = caseRegridTransformation(linearRegridTransformation);
				if (result == null) result = caseInterconstituentTransformation(linearRegridTransformation);
				if (result == null) result = caseTransformation(linearRegridTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.CONSERVATIVE_REGRID_TRANSFORMATION: {
				ConservativeRegridTransformation conservativeRegridTransformation = (ConservativeRegridTransformation)theEObject;
				T result = caseConservativeRegridTransformation(conservativeRegridTransformation);
				if (result == null) result = caseRegridTransformation(conservativeRegridTransformation);
				if (result == null) result = caseInterconstituentTransformation(conservativeRegridTransformation);
				if (result == null) result = caseTransformation(conservativeRegridTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.INTRACONSTITUENT_TRANSFORMATION: {
				IntraconstituentTransformation intraconstituentTransformation = (IntraconstituentTransformation)theEObject;
				T result = caseIntraconstituentTransformation(intraconstituentTransformation);
				if (result == null) result = caseTransformation(intraconstituentTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CplfmPackage.TIME_INTEGRATION_TRANSFORMATION: {
				TimeIntegrationTransformation timeIntegrationTransformation = (TimeIntegrationTransformation)theEObject;
				T result = caseTimeIntegrationTransformation(timeIntegrationTransformation);
				if (result == null) result = caseIntraconstituentTransformation(timeIntegrationTransformation);
				if (result == null) result = caseTransformation(timeIntegrationTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constituent Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constituent Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstituentModel(ConstituentModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallel(Parallel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrid(Grid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredGrid(StructuredGrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logically Rectangular Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logically Rectangular Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicallyRectangularGrid(LogicallyRectangularGrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Grid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Grid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredGrid(UnstructuredGrid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinates(Coordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uniform Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uniform Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniformCoordinates(UniformCoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectilinear Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectilinear Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectilinearCoordinates(RectilinearCoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curvilinear Coordinates</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curvilinear Coordinates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurvilinearCoordinates(CurvilinearCoordinates object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainDecomposition(DomainDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segment Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segment Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegmentDecomposition(SegmentDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Decomposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Decomposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockDecomposition(BlockDecomposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoupler(Coupler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnector(Connector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory To Memory Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory To Memory Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryToMemoryConnector(MemoryToMemoryConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory To File Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory To File Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryToFileConnector(MemoryToFileConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MPI Connector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MPI Connector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMPIConnector(MPIConnector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interconstituent Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interconstituent Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterconstituentTransformation(InterconstituentTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyTransformation(CopyTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redistribute Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redistribute Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedistributeTransformation(RedistributeTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regrid Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regrid Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegridTransformation(RegridTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Regrid Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Regrid Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearRegridTransformation(LinearRegridTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conservative Regrid Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conservative Regrid Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConservativeRegridTransformation(ConservativeRegridTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Intraconstituent Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Intraconstituent Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntraconstituentTransformation(IntraconstituentTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Integration Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Integration Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeIntegrationTransformation(TimeIntegrationTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CplfmSwitch
