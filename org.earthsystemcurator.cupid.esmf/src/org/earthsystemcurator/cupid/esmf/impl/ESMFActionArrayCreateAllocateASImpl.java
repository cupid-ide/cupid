/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFActionArrayCreateAllocateAS;
import org.earthsystemcurator.cupid.esmf.ESMFArray;
import org.earthsystemcurator.cupid.esmf.ESMFArraySpec;
import org.earthsystemcurator.cupid.esmf.ESMFDistGrid;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMF_INDEX;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Array Create Allocate AS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionArrayCreateAllocateASImpl#getArray <em>Array</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionArrayCreateAllocateASImpl#getDistGrid <em>Dist Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionArrayCreateAllocateASImpl#getArraySpec <em>Array Spec</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionArrayCreateAllocateASImpl#getIndexflag <em>Indexflag</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionArrayCreateAllocateASImpl#getTotalLWidth <em>Total LWidth</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionArrayCreateAllocateASImpl#getTotalUWidth <em>Total UWidth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionArrayCreateAllocateASImpl extends ESMFActionAPIImpl implements ESMFActionArrayCreateAllocateAS {
	/**
	 * The cached value of the '{@link #getArray() <em>Array</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArray()
	 * @generated
	 * @ordered
	 */
	protected ESMFArray array;

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
	 * The cached value of the '{@link #getArraySpec() <em>Array Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArraySpec()
	 * @generated
	 * @ordered
	 */
	protected ESMFArraySpec arraySpec;

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
	 * The cached value of the '{@link #getTotalLWidth() <em>Total LWidth</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLWidth()
	 * @generated
	 * @ordered
	 */
	protected EList<String> totalLWidth;

	/**
	 * The cached value of the '{@link #getTotalUWidth() <em>Total UWidth</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalUWidth()
	 * @generated
	 * @ordered
	 */
	protected EList<String> totalUWidth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionArrayCreateAllocateASImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFArray getArray() {
		if (array != null && array.eIsProxy()) {
			InternalEObject oldArray = (InternalEObject)array;
			array = (ESMFArray)eResolveProxy(oldArray);
			if (array != oldArray) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY, oldArray, array));
			}
		}
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFArray basicGetArray() {
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArray(ESMFArray newArray) {
		ESMFArray oldArray = array;
		array = newArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY, oldArray, array));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__DIST_GRID, oldDistGrid, distGrid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__DIST_GRID, oldDistGrid, distGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFArraySpec getArraySpec() {
		if (arraySpec != null && arraySpec.eIsProxy()) {
			InternalEObject oldArraySpec = (InternalEObject)arraySpec;
			arraySpec = (ESMFArraySpec)eResolveProxy(oldArraySpec);
			if (arraySpec != oldArraySpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY_SPEC, oldArraySpec, arraySpec));
			}
		}
		return arraySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFArraySpec basicGetArraySpec() {
		return arraySpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArraySpec(ESMFArraySpec newArraySpec) {
		ESMFArraySpec oldArraySpec = arraySpec;
		arraySpec = newArraySpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY_SPEC, oldArraySpec, arraySpec));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__INDEXFLAG, oldIndexflag, indexflag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTotalLWidth() {
		if (totalLWidth == null) {
			totalLWidth = new EDataTypeEList<String>(String.class, this, ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_LWIDTH);
		}
		return totalLWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTotalUWidth() {
		if (totalUWidth == null) {
			totalUWidth = new EDataTypeEList<String>(String.class, this, ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_UWIDTH);
		}
		return totalUWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY:
				if (resolve) return getArray();
				return basicGetArray();
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__DIST_GRID:
				if (resolve) return getDistGrid();
				return basicGetDistGrid();
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY_SPEC:
				if (resolve) return getArraySpec();
				return basicGetArraySpec();
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__INDEXFLAG:
				return getIndexflag();
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_LWIDTH:
				return getTotalLWidth();
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_UWIDTH:
				return getTotalUWidth();
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
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY:
				setArray((ESMFArray)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__DIST_GRID:
				setDistGrid((ESMFDistGrid)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY_SPEC:
				setArraySpec((ESMFArraySpec)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__INDEXFLAG:
				setIndexflag((ESMF_INDEX)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_LWIDTH:
				getTotalLWidth().clear();
				getTotalLWidth().addAll((Collection<? extends String>)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_UWIDTH:
				getTotalUWidth().clear();
				getTotalUWidth().addAll((Collection<? extends String>)newValue);
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
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY:
				setArray((ESMFArray)null);
				return;
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__DIST_GRID:
				setDistGrid((ESMFDistGrid)null);
				return;
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY_SPEC:
				setArraySpec((ESMFArraySpec)null);
				return;
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__INDEXFLAG:
				setIndexflag(INDEXFLAG_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_LWIDTH:
				getTotalLWidth().clear();
				return;
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_UWIDTH:
				getTotalUWidth().clear();
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
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY:
				return array != null;
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__DIST_GRID:
				return distGrid != null;
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__ARRAY_SPEC:
				return arraySpec != null;
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__INDEXFLAG:
				return indexflag != INDEXFLAG_EDEFAULT;
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_LWIDTH:
				return totalLWidth != null && !totalLWidth.isEmpty();
			case ESMFPackage.ESMF_ACTION_ARRAY_CREATE_ALLOCATE_AS__TOTAL_UWIDTH:
				return totalUWidth != null && !totalUWidth.isEmpty();
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
		result.append(" (indexflag: ");
		result.append(indexflag);
		result.append(", totalLWidth: ");
		result.append(totalLWidth);
		result.append(", totalUWidth: ");
		result.append(totalUWidth);
		result.append(')');
		return result.toString();
	}

} //ESMFActionArrayCreateAllocateASImpl
