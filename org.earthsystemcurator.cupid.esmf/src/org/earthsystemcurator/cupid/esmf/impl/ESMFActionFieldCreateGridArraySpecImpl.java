/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateGridArraySpec;
import org.earthsystemcurator.cupid.esmf.ESMFArraySpec;
import org.earthsystemcurator.cupid.esmf.ESMFField;
import org.earthsystemcurator.cupid.esmf.ESMFGrid;
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
 * An implementation of the model object '<em><b>Action Field Create Grid Array Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateGridArraySpecImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateGridArraySpecImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateGridArraySpecImpl#getArraySpec <em>Array Spec</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateGridArraySpecImpl#getIndexflag <em>Indexflag</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateGridArraySpecImpl#getTotalLWidth <em>Total LWidth</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateGridArraySpecImpl#getTotalUWidth <em>Total UWidth</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateGridArraySpecImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionFieldCreateGridArraySpecImpl extends ESMFActionAPIImpl implements ESMFActionFieldCreateGridArraySpec {
	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected ESMFField field;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionFieldCreateGridArraySpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFField getField() {
		if (field != null && field.eIsProxy()) {
			InternalEObject oldField = (InternalEObject)field;
			field = (ESMFField)eResolveProxy(oldField);
			if (field != oldField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__FIELD, oldField, field));
			}
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFField basicGetField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(ESMFField newField) {
		ESMFField oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__FIELD, oldField, field));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__GRID, oldGrid, grid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__GRID, oldGrid, grid));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__ARRAY_SPEC, oldArraySpec, arraySpec));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__ARRAY_SPEC, oldArraySpec, arraySpec));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__INDEXFLAG, oldIndexflag, indexflag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTotalLWidth() {
		if (totalLWidth == null) {
			totalLWidth = new EDataTypeEList<String>(String.class, this, ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__TOTAL_LWIDTH);
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
			totalUWidth = new EDataTypeEList<String>(String.class, this, ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__TOTAL_UWIDTH);
		}
		return totalUWidth;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__FIELD:
				if (resolve) return getField();
				return basicGetField();
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__GRID:
				if (resolve) return getGrid();
				return basicGetGrid();
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__ARRAY_SPEC:
				if (resolve) return getArraySpec();
				return basicGetArraySpec();
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__INDEXFLAG:
				return getIndexflag();
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__TOTAL_LWIDTH:
				return getTotalLWidth();
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__TOTAL_UWIDTH:
				return getTotalUWidth();
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__NAME:
				return getName();
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
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__FIELD:
				setField((ESMFField)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__GRID:
				setGrid((ESMFGrid)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__ARRAY_SPEC:
				setArraySpec((ESMFArraySpec)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__INDEXFLAG:
				setIndexflag((ESMF_INDEX)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__TOTAL_LWIDTH:
				getTotalLWidth().clear();
				getTotalLWidth().addAll((Collection<? extends String>)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__TOTAL_UWIDTH:
				getTotalUWidth().clear();
				getTotalUWidth().addAll((Collection<? extends String>)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__NAME:
				setName((String)newValue);
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
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__FIELD:
				setField((ESMFField)null);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__GRID:
				setGrid((ESMFGrid)null);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__ARRAY_SPEC:
				setArraySpec((ESMFArraySpec)null);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__INDEXFLAG:
				setIndexflag(INDEXFLAG_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__TOTAL_LWIDTH:
				getTotalLWidth().clear();
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__TOTAL_UWIDTH:
				getTotalUWidth().clear();
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__NAME:
				setName(NAME_EDEFAULT);
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
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__FIELD:
				return field != null;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__GRID:
				return grid != null;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__ARRAY_SPEC:
				return arraySpec != null;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__INDEXFLAG:
				return indexflag != INDEXFLAG_EDEFAULT;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__TOTAL_LWIDTH:
				return totalLWidth != null && !totalLWidth.isEmpty();
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__TOTAL_UWIDTH:
				return totalUWidth != null && !totalUWidth.isEmpty();
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_GRID_ARRAY_SPEC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ESMFActionFieldCreateGridArraySpecImpl
