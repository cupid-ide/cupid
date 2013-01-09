/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionGridCreate;
import org.earthsystemcurator.cupid.esmf.ESMFDistGrid;
import org.earthsystemcurator.cupid.esmf.ESMFGrid;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMF_INDEX;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Grid Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCreateImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCreateImpl#getDistGrid <em>Dist Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCreateImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridCreateImpl#getIndexflag <em>Indexflag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionGridCreateImpl extends ESMFActionAPIImpl implements ESMFActionGridCreate {
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
	 * The cached value of the '{@link #getDistGrid() <em>Dist Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistGrid()
	 * @generated
	 * @ordered
	 */
	protected ESMFDistGrid distGrid;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndexflag() <em>Indexflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexflag()
	 * @generated
	 * @ordered
	 */
	protected static final ESMF_INDEX INDEXFLAG_EDEFAULT = ESMF_INDEX.ESMF_INDEX_DELOCAL;

	/**
	 * The cached value of the '{@link #getIndexflag() <em>Indexflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexflag()
	 * @generated
	 * @ordered
	 */
	protected ESMF_INDEX indexflag = INDEXFLAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionGridCreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_GRID_CREATE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_GRID_CREATE__GRID, oldGrid, grid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_GRID_CREATE__GRID, oldGrid, grid));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_GRID_CREATE__DIST_GRID, oldDistGrid, distGrid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_GRID_CREATE__DIST_GRID, oldDistGrid, distGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_GRID_CREATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMF_INDEX getIndexflag() {
		return indexflag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexflag(ESMF_INDEX newIndexflag) {
		ESMF_INDEX oldIndexflag = indexflag;
		indexflag = newIndexflag == null ? INDEXFLAG_EDEFAULT : newIndexflag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_GRID_CREATE__INDEXFLAG, oldIndexflag, indexflag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_GRID_CREATE__GRID:
				if (resolve) return getGrid();
				return basicGetGrid();
			case ESMFPackage.ESMF_ACTION_GRID_CREATE__DIST_GRID:
				if (resolve) return getDistGrid();
				return basicGetDistGrid();
			case ESMFPackage.ESMF_ACTION_GRID_CREATE__NAME:
				return getName();
			case ESMFPackage.ESMF_ACTION_GRID_CREATE__INDEXFLAG:
				return getIndexflag();
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
			case ESMFPackage.ESMF_ACTION_GRID_CREATE__GRID:
				setGrid((ESMFGrid)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_CREATE__DIST_GRID:
				setDistGrid((ESMFDistGrid)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_CREATE__NAME:
				setName((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_CREATE__INDEXFLAG:
				setIndexflag((ESMF_INDEX)newValue);
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
			case ESMFPackage.ESMF_ACTION_GRID_CREATE__GRID:
				setGrid((ESMFGrid)null);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_CREATE__DIST_GRID:
				setDistGrid((ESMFDistGrid)null);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_CREATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_CREATE__INDEXFLAG:
				setIndexflag(INDEXFLAG_EDEFAULT);
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
			case ESMFPackage.ESMF_ACTION_GRID_CREATE__GRID:
				return grid != null;
			case ESMFPackage.ESMF_ACTION_GRID_CREATE__DIST_GRID:
				return distGrid != null;
			case ESMFPackage.ESMF_ACTION_GRID_CREATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ESMFPackage.ESMF_ACTION_GRID_CREATE__INDEXFLAG:
				return indexflag != INDEXFLAG_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", indexflag: ");
		result.append(indexflag);
		result.append(')');
		return result.toString();
	}

} //ESMFActionGridCreateImpl
