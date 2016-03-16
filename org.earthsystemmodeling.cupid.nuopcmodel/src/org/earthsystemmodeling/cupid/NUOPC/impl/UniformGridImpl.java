/**
 */
package org.earthsystemmodeling.cupid.NUOPC.impl;

import java.util.Collection;

import org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage;
import org.earthsystemmodeling.cupid.NUOPC.UniformGrid;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uniform Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.UniformGridImpl#getMinCornerCoord <em>Min Corner Coord</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.UniformGridImpl#getMaxCornerCoord <em>Max Corner Coord</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniformGridImpl extends GridImpl implements UniformGrid {
	/**
	 * The cached value of the '{@link #getMinCornerCoord() <em>Min Corner Coord</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCornerCoord()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> minCornerCoord;

	/**
	 * The cached value of the '{@link #getMaxCornerCoord() <em>Max Corner Coord</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCornerCoord()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> maxCornerCoord;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniformGridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.UNIFORM_GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getMinCornerCoord() {
		if (minCornerCoord == null) {
			minCornerCoord = new EDataTypeEList<Double>(Double.class, this, NUOPCPackage.UNIFORM_GRID__MIN_CORNER_COORD);
		}
		return minCornerCoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getMaxCornerCoord() {
		if (maxCornerCoord == null) {
			maxCornerCoord = new EDataTypeEList<Double>(Double.class, this, NUOPCPackage.UNIFORM_GRID__MAX_CORNER_COORD);
		}
		return maxCornerCoord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NUOPCPackage.UNIFORM_GRID__MIN_CORNER_COORD:
				return getMinCornerCoord();
			case NUOPCPackage.UNIFORM_GRID__MAX_CORNER_COORD:
				return getMaxCornerCoord();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NUOPCPackage.UNIFORM_GRID__MIN_CORNER_COORD:
				getMinCornerCoord().clear();
				getMinCornerCoord().addAll((Collection<? extends Double>)newValue);
				return;
			case NUOPCPackage.UNIFORM_GRID__MAX_CORNER_COORD:
				getMaxCornerCoord().clear();
				getMaxCornerCoord().addAll((Collection<? extends Double>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NUOPCPackage.UNIFORM_GRID__MIN_CORNER_COORD:
				getMinCornerCoord().clear();
				return;
			case NUOPCPackage.UNIFORM_GRID__MAX_CORNER_COORD:
				getMaxCornerCoord().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NUOPCPackage.UNIFORM_GRID__MIN_CORNER_COORD:
				return minCornerCoord != null && !minCornerCoord.isEmpty();
			case NUOPCPackage.UNIFORM_GRID__MAX_CORNER_COORD:
				return maxCornerCoord != null && !maxCornerCoord.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (minCornerCoord: ");
		result.append(minCornerCoord);
		result.append(", maxCornerCoord: ");
		result.append(maxCornerCoord);
		result.append(')');
		return result.toString();
	}

} //UniformGridImpl
