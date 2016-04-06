/**
 */
package org.earthsystemmodeling.cupid.NUOPC;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uniform Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.UniformGrid#getMinCornerCoord <em>Min Corner Coord</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.UniformGrid#getMaxCornerCoord <em>Max Corner Coord</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.UniformGrid#getStaggerLocToFillCoords <em>Stagger Loc To Fill Coords</em>}</li>
 * </ul>
 *
 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getUniformGrid()
 * @model
 * @generated
 */
public interface UniformGrid extends Grid {
	/**
	 * Returns the value of the '<em><b>Min Corner Coord</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Corner Coord</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Corner Coord</em>' attribute list.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getUniformGrid_MinCornerCoord()
	 * @model unique="false" required="true" upper="3"
	 * @generated
	 */
	EList<Double> getMinCornerCoord();

	/**
	 * Returns the value of the '<em><b>Max Corner Coord</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Corner Coord</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Corner Coord</em>' attribute list.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getUniformGrid_MaxCornerCoord()
	 * @model unique="false" required="true" upper="3"
	 * @generated
	 */
	EList<Double> getMaxCornerCoord();

	/**
	 * Returns the value of the '<em><b>Stagger Loc To Fill Coords</b></em>' attribute list.
	 * The list contents are of type {@link org.earthsystemmodeling.cupid.NUOPC.ESMF_STAGGERLOC}.
	 * The literals are from the enumeration {@link org.earthsystemmodeling.cupid.NUOPC.ESMF_STAGGERLOC}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stagger Loc To Fill Coords</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stagger Loc To Fill Coords</em>' attribute list.
	 * @see org.earthsystemmodeling.cupid.NUOPC.ESMF_STAGGERLOC
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getUniformGrid_StaggerLocToFillCoords()
	 * @model
	 * @generated
	 */
	EList<ESMF_STAGGERLOC> getStaggerLocToFillCoords();

} // UniformGrid
