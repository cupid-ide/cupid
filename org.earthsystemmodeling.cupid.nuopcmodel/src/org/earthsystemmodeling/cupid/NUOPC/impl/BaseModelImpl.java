/**
 */
package org.earthsystemmodeling.cupid.NUOPC.impl;

import java.util.Collection;
import org.earthsystemmodeling.cupid.NUOPC.BaseModel;
import org.earthsystemmodeling.cupid.NUOPC.Field;
import org.earthsystemmodeling.cupid.NUOPC.Grid;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.BaseModelImpl#getGrids <em>Grids</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.BaseModelImpl#getImportFields <em>Import Fields</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.BaseModelImpl#getExportFields <em>Export Fields</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BaseModelImpl extends ComponentImpl implements BaseModel {
	/**
	 * The cached value of the '{@link #getGrids() <em>Grids</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrids()
	 * @generated
	 * @ordered
	 */
	protected EList<Grid> grids;
	/**
	 * The cached value of the '{@link #getImportFields() <em>Import Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> importFields;
	/**
	 * The cached value of the '{@link #getExportFields() <em>Export Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> exportFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.BASE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Grid> getGrids() {
		if (grids == null) {
			grids = new EObjectContainmentEList<Grid>(Grid.class, this, NUOPCPackage.BASE_MODEL__GRIDS);
		}
		return grids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getImportFields() {
		if (importFields == null) {
			importFields = new EObjectContainmentEList<Field>(Field.class, this, NUOPCPackage.BASE_MODEL__IMPORT_FIELDS);
		}
		return importFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getExportFields() {
		if (exportFields == null) {
			exportFields = new EObjectContainmentEList<Field>(Field.class, this, NUOPCPackage.BASE_MODEL__EXPORT_FIELDS);
		}
		return exportFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.BASE_MODEL__GRIDS:
				return ((InternalEList<?>)getGrids()).basicRemove(otherEnd, msgs);
			case NUOPCPackage.BASE_MODEL__IMPORT_FIELDS:
				return ((InternalEList<?>)getImportFields()).basicRemove(otherEnd, msgs);
			case NUOPCPackage.BASE_MODEL__EXPORT_FIELDS:
				return ((InternalEList<?>)getExportFields()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NUOPCPackage.BASE_MODEL__GRIDS:
				return getGrids();
			case NUOPCPackage.BASE_MODEL__IMPORT_FIELDS:
				return getImportFields();
			case NUOPCPackage.BASE_MODEL__EXPORT_FIELDS:
				return getExportFields();
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
			case NUOPCPackage.BASE_MODEL__GRIDS:
				getGrids().clear();
				getGrids().addAll((Collection<? extends Grid>)newValue);
				return;
			case NUOPCPackage.BASE_MODEL__IMPORT_FIELDS:
				getImportFields().clear();
				getImportFields().addAll((Collection<? extends Field>)newValue);
				return;
			case NUOPCPackage.BASE_MODEL__EXPORT_FIELDS:
				getExportFields().clear();
				getExportFields().addAll((Collection<? extends Field>)newValue);
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
			case NUOPCPackage.BASE_MODEL__GRIDS:
				getGrids().clear();
				return;
			case NUOPCPackage.BASE_MODEL__IMPORT_FIELDS:
				getImportFields().clear();
				return;
			case NUOPCPackage.BASE_MODEL__EXPORT_FIELDS:
				getExportFields().clear();
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
			case NUOPCPackage.BASE_MODEL__GRIDS:
				return grids != null && !grids.isEmpty();
			case NUOPCPackage.BASE_MODEL__IMPORT_FIELDS:
				return importFields != null && !importFields.isEmpty();
			case NUOPCPackage.BASE_MODEL__EXPORT_FIELDS:
				return exportFields != null && !exportFields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BaseModelImpl
