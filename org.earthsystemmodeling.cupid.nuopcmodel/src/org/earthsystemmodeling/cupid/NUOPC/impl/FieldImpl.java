/**
 */
package org.earthsystemmodeling.cupid.NUOPC.impl;

import org.earthsystemmodeling.cupid.NUOPC.BaseModel;
import org.earthsystemmodeling.cupid.NUOPC.Field;
import org.earthsystemmodeling.cupid.NUOPC.Grid;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.FieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.FieldImpl#getImportedBy <em>Imported By</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.FieldImpl#getExportedBy <em>Exported By</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.FieldImpl#isImport <em>Import</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.FieldImpl#isExport <em>Export</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.FieldImpl#getStandardName <em>Standard Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.FieldImpl#getGrid <em>Grid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldImpl extends MinimalEObjectImpl.Container implements Field {
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
	 * The default value of the '{@link #isImport() <em>Import</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImport() <em>Import</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImport()
	 * @generated
	 * @ordered
	 */
	protected boolean import_ = IMPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isExport() <em>Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExport()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExport() <em>Export</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExport()
	 * @generated
	 * @ordered
	 */
	protected boolean export = EXPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStandardName() <em>Standard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardName()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDARD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandardName() <em>Standard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandardName()
	 * @generated
	 * @ordered
	 */
	protected String standardName = STANDARD_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected Grid grid;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.FIELD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseModel getImportedBy() {
		if (eContainerFeatureID() != NUOPCPackage.FIELD__IMPORTED_BY) return null;
		return (BaseModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportedBy(BaseModel newImportedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newImportedBy, NUOPCPackage.FIELD__IMPORTED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedBy(BaseModel newImportedBy) {
		if (newImportedBy != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.FIELD__IMPORTED_BY && newImportedBy != null)) {
			if (EcoreUtil.isAncestor(this, newImportedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImportedBy != null)
				msgs = ((InternalEObject)newImportedBy).eInverseAdd(this, NUOPCPackage.BASE_MODEL__IMPORT_FIELDS, BaseModel.class, msgs);
			msgs = basicSetImportedBy(newImportedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.FIELD__IMPORTED_BY, newImportedBy, newImportedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseModel getExportedBy() {
		if (eContainerFeatureID() != NUOPCPackage.FIELD__EXPORTED_BY) return null;
		return (BaseModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExportedBy(BaseModel newExportedBy, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExportedBy, NUOPCPackage.FIELD__EXPORTED_BY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportedBy(BaseModel newExportedBy) {
		if (newExportedBy != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.FIELD__EXPORTED_BY && newExportedBy != null)) {
			if (EcoreUtil.isAncestor(this, newExportedBy))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExportedBy != null)
				msgs = ((InternalEObject)newExportedBy).eInverseAdd(this, NUOPCPackage.BASE_MODEL__EXPORT_FIELDS, BaseModel.class, msgs);
			msgs = basicSetExportedBy(newExportedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.FIELD__EXPORTED_BY, newExportedBy, newExportedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isImport() {
		//return import_;
		return getImportedBy() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isExport() {
		//return export;
		return getExportedBy() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStandardName() {
		return standardName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandardName(String newStandardName) {
		String oldStandardName = standardName;
		standardName = newStandardName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.FIELD__STANDARD_NAME, oldStandardName, standardName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid getGrid() {
		if (grid != null && grid.eIsProxy()) {
			InternalEObject oldGrid = (InternalEObject)grid;
			grid = (Grid)eResolveProxy(oldGrid);
			if (grid != oldGrid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NUOPCPackage.FIELD__GRID, oldGrid, grid));
			}
		}
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid basicGetGrid() {
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid(Grid newGrid) {
		Grid oldGrid = grid;
		grid = newGrid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.FIELD__GRID, oldGrid, grid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.FIELD__IMPORTED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetImportedBy((BaseModel)otherEnd, msgs);
			case NUOPCPackage.FIELD__EXPORTED_BY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExportedBy((BaseModel)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.FIELD__IMPORTED_BY:
				return basicSetImportedBy(null, msgs);
			case NUOPCPackage.FIELD__EXPORTED_BY:
				return basicSetExportedBy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case NUOPCPackage.FIELD__IMPORTED_BY:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.BASE_MODEL__IMPORT_FIELDS, BaseModel.class, msgs);
			case NUOPCPackage.FIELD__EXPORTED_BY:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.BASE_MODEL__EXPORT_FIELDS, BaseModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NUOPCPackage.FIELD__NAME:
				return getName();
			case NUOPCPackage.FIELD__IMPORTED_BY:
				return getImportedBy();
			case NUOPCPackage.FIELD__EXPORTED_BY:
				return getExportedBy();
			case NUOPCPackage.FIELD__IMPORT:
				return isImport();
			case NUOPCPackage.FIELD__EXPORT:
				return isExport();
			case NUOPCPackage.FIELD__STANDARD_NAME:
				return getStandardName();
			case NUOPCPackage.FIELD__GRID:
				if (resolve) return getGrid();
				return basicGetGrid();
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
			case NUOPCPackage.FIELD__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.FIELD__IMPORTED_BY:
				setImportedBy((BaseModel)newValue);
				return;
			case NUOPCPackage.FIELD__EXPORTED_BY:
				setExportedBy((BaseModel)newValue);
				return;
			case NUOPCPackage.FIELD__STANDARD_NAME:
				setStandardName((String)newValue);
				return;
			case NUOPCPackage.FIELD__GRID:
				setGrid((Grid)newValue);
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
			case NUOPCPackage.FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.FIELD__IMPORTED_BY:
				setImportedBy((BaseModel)null);
				return;
			case NUOPCPackage.FIELD__EXPORTED_BY:
				setExportedBy((BaseModel)null);
				return;
			case NUOPCPackage.FIELD__STANDARD_NAME:
				setStandardName(STANDARD_NAME_EDEFAULT);
				return;
			case NUOPCPackage.FIELD__GRID:
				setGrid((Grid)null);
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
			case NUOPCPackage.FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.FIELD__IMPORTED_BY:
				return getImportedBy() != null;
			case NUOPCPackage.FIELD__EXPORTED_BY:
				return getExportedBy() != null;
			case NUOPCPackage.FIELD__IMPORT:
				return import_ != IMPORT_EDEFAULT;
			case NUOPCPackage.FIELD__EXPORT:
				return export != EXPORT_EDEFAULT;
			case NUOPCPackage.FIELD__STANDARD_NAME:
				return STANDARD_NAME_EDEFAULT == null ? standardName != null : !STANDARD_NAME_EDEFAULT.equals(standardName);
			case NUOPCPackage.FIELD__GRID:
				return grid != null;
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
		result.append(", import: ");
		result.append(import_);
		result.append(", export: ");
		result.append(export);
		result.append(", standardName: ");
		result.append(standardName);
		result.append(')');
		return result.toString();
	}

} //FieldImpl
