/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFActionDistGridCreate;
import org.earthsystemcurator.cupid.esmf.ESMFDistGrid;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Dist Grid Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionDistGridCreateImpl#getDistGrid <em>Dist Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionDistGridCreateImpl#getMinIndex <em>Min Index</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionDistGridCreateImpl#getMaxIndex <em>Max Index</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionDistGridCreateImpl#getRegDecomp <em>Reg Decomp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionDistGridCreateImpl extends ESMFActionAPIImpl implements ESMFActionDistGridCreate {
	/**
	 * The cached value of the '{@link #getDistGrid() <em>Dist Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistGrid()
	 * @generated
	 * @ordered
	 */
	protected ESMFDistGrid distGrid;

	/**
	 * The cached value of the '{@link #getMinIndex() <em>Min Index</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<String> minIndex;

	/**
	 * The cached value of the '{@link #getMaxIndex() <em>Max Index</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<String> maxIndex;

	/**
	 * The cached value of the '{@link #getRegDecomp() <em>Reg Decomp</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegDecomp()
	 * @generated
	 * @ordered
	 */
	protected EList<String> regDecomp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionDistGridCreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_DIST_GRID_CREATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFDistGrid getDistGrid() {
		if (distGrid != null && distGrid.eIsProxy()) {
			InternalEObject oldDistGrid = (InternalEObject)distGrid;
			distGrid = (ESMFDistGrid)eResolveProxy(oldDistGrid);
			if (distGrid != oldDistGrid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__DIST_GRID, oldDistGrid, distGrid));
			}
		}
		return distGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFDistGrid basicGetDistGrid() {
		return distGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistGrid(ESMFDistGrid newDistGrid) {
		ESMFDistGrid oldDistGrid = distGrid;
		distGrid = newDistGrid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__DIST_GRID, oldDistGrid, distGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMinIndex() {
		if (minIndex == null) {
			minIndex = new EDataTypeEList<String>(String.class, this, ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__MIN_INDEX);
		}
		return minIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMaxIndex() {
		if (maxIndex == null) {
			maxIndex = new EDataTypeEList<String>(String.class, this, ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__MAX_INDEX);
		}
		return maxIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRegDecomp() {
		if (regDecomp == null) {
			regDecomp = new EDataTypeEList<String>(String.class, this, ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__REG_DECOMP);
		}
		return regDecomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__DIST_GRID:
				if (resolve) return getDistGrid();
				return basicGetDistGrid();
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__MIN_INDEX:
				return getMinIndex();
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__MAX_INDEX:
				return getMaxIndex();
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__REG_DECOMP:
				return getRegDecomp();
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
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__DIST_GRID:
				setDistGrid((ESMFDistGrid)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__MIN_INDEX:
				getMinIndex().clear();
				getMinIndex().addAll((Collection<? extends String>)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__MAX_INDEX:
				getMaxIndex().clear();
				getMaxIndex().addAll((Collection<? extends String>)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__REG_DECOMP:
				getRegDecomp().clear();
				getRegDecomp().addAll((Collection<? extends String>)newValue);
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
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__DIST_GRID:
				setDistGrid((ESMFDistGrid)null);
				return;
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__MIN_INDEX:
				getMinIndex().clear();
				return;
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__MAX_INDEX:
				getMaxIndex().clear();
				return;
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__REG_DECOMP:
				getRegDecomp().clear();
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
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__DIST_GRID:
				return distGrid != null;
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__MIN_INDEX:
				return minIndex != null && !minIndex.isEmpty();
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__MAX_INDEX:
				return maxIndex != null && !maxIndex.isEmpty();
			case ESMFPackage.ESMF_ACTION_DIST_GRID_CREATE__REG_DECOMP:
				return regDecomp != null && !regDecomp.isEmpty();
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
		result.append(" (minIndex: ");
		result.append(minIndex);
		result.append(", maxIndex: ");
		result.append(maxIndex);
		result.append(", regDecomp: ");
		result.append(regDecomp);
		result.append(')');
		return result.toString();
	}

} //ESMFActionDistGridCreateImpl
