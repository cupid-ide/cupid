/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionGridGetCoord;
import org.earthsystemcurator.cupid.esmf.ESMFGrid;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Grid Get Coord</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetCoordImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetCoordImpl#getCoordDim <em>Coord Dim</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetCoordImpl#getFarrayPtr <em>Farray Ptr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionGridGetCoordImpl extends ESMFActionAPIImpl implements ESMFActionGridGetCoord {
	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected ESMFGrid grid;

	/**
	 * The default value of the '{@link #getCoordDim() <em>Coord Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordDim()
	 * @generated
	 * @ordered
	 */
	protected static final String COORD_DIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoordDim() <em>Coord Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordDim()
	 * @generated
	 * @ordered
	 */
	protected String coordDim = COORD_DIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getFarrayPtr() <em>Farray Ptr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarrayPtr()
	 * @generated
	 * @ordered
	 */
	protected static final String FARRAY_PTR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFarrayPtr() <em>Farray Ptr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFarrayPtr()
	 * @generated
	 * @ordered
	 */
	protected String farrayPtr = FARRAY_PTR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionGridGetCoordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_GRID_GET_COORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFGrid getGrid() {
		if (grid != null && grid.eIsProxy()) {
			InternalEObject oldGrid = (InternalEObject)grid;
			grid = (ESMFGrid)eResolveProxy(oldGrid);
			if (grid != oldGrid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_GRID_GET_COORD__GRID, oldGrid, grid));
			}
		}
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFGrid basicGetGrid() {
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid(ESMFGrid newGrid) {
		ESMFGrid oldGrid = grid;
		grid = newGrid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_GRID_GET_COORD__GRID, oldGrid, grid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoordDim() {
		return coordDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordDim(String newCoordDim) {
		String oldCoordDim = coordDim;
		coordDim = newCoordDim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_GRID_GET_COORD__COORD_DIM, oldCoordDim, coordDim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFarrayPtr() {
		return farrayPtr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFarrayPtr(String newFarrayPtr) {
		String oldFarrayPtr = farrayPtr;
		farrayPtr = newFarrayPtr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_GRID_GET_COORD__FARRAY_PTR, oldFarrayPtr, farrayPtr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_GRID_GET_COORD__GRID:
				if (resolve) return getGrid();
				return basicGetGrid();
			case ESMFPackage.ESMF_ACTION_GRID_GET_COORD__COORD_DIM:
				return getCoordDim();
			case ESMFPackage.ESMF_ACTION_GRID_GET_COORD__FARRAY_PTR:
				return getFarrayPtr();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_GRID_GET_COORD__GRID:
				setGrid((ESMFGrid)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_GET_COORD__COORD_DIM:
				setCoordDim((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_GET_COORD__FARRAY_PTR:
				setFarrayPtr((String)newValue);
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
			case ESMFPackage.ESMF_ACTION_GRID_GET_COORD__GRID:
				setGrid((ESMFGrid)null);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_GET_COORD__COORD_DIM:
				setCoordDim(COORD_DIM_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_GET_COORD__FARRAY_PTR:
				setFarrayPtr(FARRAY_PTR_EDEFAULT);
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
			case ESMFPackage.ESMF_ACTION_GRID_GET_COORD__GRID:
				return grid != null;
			case ESMFPackage.ESMF_ACTION_GRID_GET_COORD__COORD_DIM:
				return COORD_DIM_EDEFAULT == null ? coordDim != null : !COORD_DIM_EDEFAULT.equals(coordDim);
			case ESMFPackage.ESMF_ACTION_GRID_GET_COORD__FARRAY_PTR:
				return FARRAY_PTR_EDEFAULT == null ? farrayPtr != null : !FARRAY_PTR_EDEFAULT.equals(farrayPtr);
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
		result.append(" (coordDim: ");
		result.append(coordDim);
		result.append(", farrayPtr: ");
		result.append(farrayPtr);
		result.append(')');
		return result.toString();
	}

} //ESMFActionGridGetCoordImpl
