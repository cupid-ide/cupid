/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFArray;
import org.earthsystemcurator.cupid.esmf.ESMFArraySpec;
import org.earthsystemcurator.cupid.esmf.ESMFComponent;
import org.earthsystemcurator.cupid.esmf.ESMFField;
import org.earthsystemcurator.cupid.esmf.ESMFGrid;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFScope;
import org.earthsystemcurator.cupid.esmf.ESMFScopedItem;
import org.earthsystemcurator.cupid.esmf.ESMFStaggerLoc;
import org.earthsystemcurator.cupid.esmf.ESMFWorkspace;

import org.earthsystemcurator.cupid.esmf.ESMF_INDEX;
import org.earthsystemcurator.cupid.sidl.Argument;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFieldImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFieldImpl#getArray <em>Array</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFieldImpl#getStaggerLoc <em>Stagger Loc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFieldImpl#getArraySpec <em>Array Spec</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFieldImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFieldImpl#getTotalLWidth <em>Total LWidth</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFieldImpl#getTotalUWidth <em>Total UWidth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFFieldImpl extends ESMFScopedItemImpl implements ESMFField {
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
	 * The cached value of the '{@link #getArray() <em>Array</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArray()
	 * @generated
	 * @ordered
	 */
	protected ESMFArray array;

	/**
	 * The default value of the '{@link #getStaggerLoc() <em>Stagger Loc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaggerLoc()
	 * @generated
	 * @ordered
	 */
	protected static final ESMFStaggerLoc STAGGER_LOC_EDEFAULT = ESMFStaggerLoc.ESMF_STAGGERLOC_CENTER;

	/**
	 * The cached value of the '{@link #getStaggerLoc() <em>Stagger Loc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaggerLoc()
	 * @generated
	 * @ordered
	 */
	protected ESMFStaggerLoc staggerLoc = STAGGER_LOC_EDEFAULT;

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
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final ESMF_INDEX INDEX_EDEFAULT = ESMF_INDEX.ESMF_INDEX_DELOCAL;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected ESMF_INDEX index = INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTotalLWidth() <em>Total LWidth</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLWidth()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> totalLWidth;

	/**
	 * The cached value of the '{@link #getTotalUWidth() <em>Total UWidth</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalUWidth()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> totalUWidth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_FIELD;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_FIELD__GRID, oldGrid, grid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_FIELD__GRID, oldGrid, grid));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_FIELD__ARRAY, oldArray, array));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_FIELD__ARRAY, oldArray, array));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFStaggerLoc getStaggerLoc() {
		return staggerLoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaggerLoc(ESMFStaggerLoc newStaggerLoc) {
		ESMFStaggerLoc oldStaggerLoc = staggerLoc;
		staggerLoc = newStaggerLoc == null ? STAGGER_LOC_EDEFAULT : newStaggerLoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_FIELD__STAGGER_LOC, oldStaggerLoc, staggerLoc));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_FIELD__ARRAY_SPEC, oldArraySpec, arraySpec));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_FIELD__ARRAY_SPEC, oldArraySpec, arraySpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMF_INDEX getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(ESMF_INDEX newIndex) {
		ESMF_INDEX oldIndex = index;
		index = newIndex == null ? INDEX_EDEFAULT : newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_FIELD__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getTotalLWidth() {
		if (totalLWidth == null) {
			totalLWidth = new EDataTypeEList<Integer>(Integer.class, this, ESMFPackage.ESMF_FIELD__TOTAL_LWIDTH);
		}
		return totalLWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getTotalUWidth() {
		if (totalUWidth == null) {
			totalUWidth = new EDataTypeEList<Integer>(Integer.class, this, ESMFPackage.ESMF_FIELD__TOTAL_UWIDTH);
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
			case ESMFPackage.ESMF_FIELD__GRID:
				if (resolve) return getGrid();
				return basicGetGrid();
			case ESMFPackage.ESMF_FIELD__ARRAY:
				if (resolve) return getArray();
				return basicGetArray();
			case ESMFPackage.ESMF_FIELD__STAGGER_LOC:
				return getStaggerLoc();
			case ESMFPackage.ESMF_FIELD__ARRAY_SPEC:
				if (resolve) return getArraySpec();
				return basicGetArraySpec();
			case ESMFPackage.ESMF_FIELD__INDEX:
				return getIndex();
			case ESMFPackage.ESMF_FIELD__TOTAL_LWIDTH:
				return getTotalLWidth();
			case ESMFPackage.ESMF_FIELD__TOTAL_UWIDTH:
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
			case ESMFPackage.ESMF_FIELD__GRID:
				setGrid((ESMFGrid)newValue);
				return;
			case ESMFPackage.ESMF_FIELD__ARRAY:
				setArray((ESMFArray)newValue);
				return;
			case ESMFPackage.ESMF_FIELD__STAGGER_LOC:
				setStaggerLoc((ESMFStaggerLoc)newValue);
				return;
			case ESMFPackage.ESMF_FIELD__ARRAY_SPEC:
				setArraySpec((ESMFArraySpec)newValue);
				return;
			case ESMFPackage.ESMF_FIELD__INDEX:
				setIndex((ESMF_INDEX)newValue);
				return;
			case ESMFPackage.ESMF_FIELD__TOTAL_LWIDTH:
				getTotalLWidth().clear();
				getTotalLWidth().addAll((Collection<? extends Integer>)newValue);
				return;
			case ESMFPackage.ESMF_FIELD__TOTAL_UWIDTH:
				getTotalUWidth().clear();
				getTotalUWidth().addAll((Collection<? extends Integer>)newValue);
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
			case ESMFPackage.ESMF_FIELD__GRID:
				setGrid((ESMFGrid)null);
				return;
			case ESMFPackage.ESMF_FIELD__ARRAY:
				setArray((ESMFArray)null);
				return;
			case ESMFPackage.ESMF_FIELD__STAGGER_LOC:
				setStaggerLoc(STAGGER_LOC_EDEFAULT);
				return;
			case ESMFPackage.ESMF_FIELD__ARRAY_SPEC:
				setArraySpec((ESMFArraySpec)null);
				return;
			case ESMFPackage.ESMF_FIELD__INDEX:
				setIndex(INDEX_EDEFAULT);
				return;
			case ESMFPackage.ESMF_FIELD__TOTAL_LWIDTH:
				getTotalLWidth().clear();
				return;
			case ESMFPackage.ESMF_FIELD__TOTAL_UWIDTH:
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
			case ESMFPackage.ESMF_FIELD__GRID:
				return grid != null;
			case ESMFPackage.ESMF_FIELD__ARRAY:
				return array != null;
			case ESMFPackage.ESMF_FIELD__STAGGER_LOC:
				return staggerLoc != STAGGER_LOC_EDEFAULT;
			case ESMFPackage.ESMF_FIELD__ARRAY_SPEC:
				return arraySpec != null;
			case ESMFPackage.ESMF_FIELD__INDEX:
				return index != INDEX_EDEFAULT;
			case ESMFPackage.ESMF_FIELD__TOTAL_LWIDTH:
				return totalLWidth != null && !totalLWidth.isEmpty();
			case ESMFPackage.ESMF_FIELD__TOTAL_UWIDTH:
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
		result.append(" (staggerLoc: ");
		result.append(staggerLoc);
		result.append(", index: ");
		result.append(index);
		result.append(", totalLWidth: ");
		result.append(totalLWidth);
		result.append(", totalUWidth: ");
		result.append(totalUWidth);
		result.append(')');
		return result.toString();
	}

} //ESMFFieldImpl
