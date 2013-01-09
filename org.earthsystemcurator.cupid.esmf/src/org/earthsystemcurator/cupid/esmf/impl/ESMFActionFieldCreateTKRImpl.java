/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionFieldCreateTKR;
import org.earthsystemcurator.cupid.esmf.ESMFField;
import org.earthsystemcurator.cupid.esmf.ESMFGrid;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFTypeKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Field Create TKR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateTKRImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateTKRImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldCreateTKRImpl#getTypekind <em>Typekind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionFieldCreateTKRImpl extends ESMFActionAPIImpl implements ESMFActionFieldCreateTKR {
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
	 * The default value of the '{@link #getTypekind() <em>Typekind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypekind()
	 * @generated
	 * @ordered
	 */
	protected static final ESMFTypeKind TYPEKIND_EDEFAULT = ESMFTypeKind.ESMF_TYPEKIND_I1;

	/**
	 * The cached value of the '{@link #getTypekind() <em>Typekind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypekind()
	 * @generated
	 * @ordered
	 */
	protected ESMFTypeKind typekind = TYPEKIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionFieldCreateTKRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_FIELD_CREATE_TKR;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__FIELD, oldField, field));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__FIELD, oldField, field));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__GRID, oldGrid, grid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__GRID, oldGrid, grid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTypeKind getTypekind() {
		return typekind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypekind(ESMFTypeKind newTypekind) {
		ESMFTypeKind oldTypekind = typekind;
		typekind = newTypekind == null ? TYPEKIND_EDEFAULT : newTypekind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__TYPEKIND, oldTypekind, typekind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__FIELD:
				if (resolve) return getField();
				return basicGetField();
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__GRID:
				if (resolve) return getGrid();
				return basicGetGrid();
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__TYPEKIND:
				return getTypekind();
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
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__FIELD:
				setField((ESMFField)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__GRID:
				setGrid((ESMFGrid)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__TYPEKIND:
				setTypekind((ESMFTypeKind)newValue);
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
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__FIELD:
				setField((ESMFField)null);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__GRID:
				setGrid((ESMFGrid)null);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__TYPEKIND:
				setTypekind(TYPEKIND_EDEFAULT);
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
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__FIELD:
				return field != null;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__GRID:
				return grid != null;
			case ESMFPackage.ESMF_ACTION_FIELD_CREATE_TKR__TYPEKIND:
				return typekind != TYPEKIND_EDEFAULT;
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
		result.append(" (typekind: ");
		result.append(typekind);
		result.append(')');
		return result.toString();
	}

} //ESMFActionFieldCreateTKRImpl
