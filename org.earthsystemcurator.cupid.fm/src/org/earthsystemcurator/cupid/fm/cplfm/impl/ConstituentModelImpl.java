/**
 */
package org.earthsystemcurator.cupid.fm.cplfm.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel;
import org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage;
import org.earthsystemcurator.cupid.fm.cplfm.Field;
import org.earthsystemcurator.cupid.fm.cplfm.Grid;
import org.earthsystemcurator.cupid.fm.cplfm.Parallel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constituent Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.impl.ConstituentModelImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.impl.ConstituentModelImpl#getParallel <em>Parallel</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.impl.ConstituentModelImpl#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstituentModelImpl extends EObjectImpl implements ConstituentModel {
	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected Grid grid;

	/**
	 * The cached value of the '{@link #getParallel() <em>Parallel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallel()
	 * @generated
	 * @ordered
	 */
	protected Parallel parallel;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> field;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstituentModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CplfmPackage.Literals.CONSTITUENT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grid getGrid() {
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrid(Grid newGrid, NotificationChain msgs) {
		Grid oldGrid = grid;
		grid = newGrid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CplfmPackage.CONSTITUENT_MODEL__GRID, oldGrid, newGrid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid(Grid newGrid) {
		if (newGrid != grid) {
			NotificationChain msgs = null;
			if (grid != null)
				msgs = ((InternalEObject)grid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CplfmPackage.CONSTITUENT_MODEL__GRID, null, msgs);
			if (newGrid != null)
				msgs = ((InternalEObject)newGrid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CplfmPackage.CONSTITUENT_MODEL__GRID, null, msgs);
			msgs = basicSetGrid(newGrid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CplfmPackage.CONSTITUENT_MODEL__GRID, newGrid, newGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parallel getParallel() {
		return parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParallel(Parallel newParallel, NotificationChain msgs) {
		Parallel oldParallel = parallel;
		parallel = newParallel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CplfmPackage.CONSTITUENT_MODEL__PARALLEL, oldParallel, newParallel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallel(Parallel newParallel) {
		if (newParallel != parallel) {
			NotificationChain msgs = null;
			if (parallel != null)
				msgs = ((InternalEObject)parallel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CplfmPackage.CONSTITUENT_MODEL__PARALLEL, null, msgs);
			if (newParallel != null)
				msgs = ((InternalEObject)newParallel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CplfmPackage.CONSTITUENT_MODEL__PARALLEL, null, msgs);
			msgs = basicSetParallel(newParallel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CplfmPackage.CONSTITUENT_MODEL__PARALLEL, newParallel, newParallel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getField() {
		if (field == null) {
			field = new EObjectContainmentEList<Field>(Field.class, this, CplfmPackage.CONSTITUENT_MODEL__FIELD);
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CplfmPackage.CONSTITUENT_MODEL__GRID:
				return basicSetGrid(null, msgs);
			case CplfmPackage.CONSTITUENT_MODEL__PARALLEL:
				return basicSetParallel(null, msgs);
			case CplfmPackage.CONSTITUENT_MODEL__FIELD:
				return ((InternalEList<?>)getField()).basicRemove(otherEnd, msgs);
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
			case CplfmPackage.CONSTITUENT_MODEL__GRID:
				return getGrid();
			case CplfmPackage.CONSTITUENT_MODEL__PARALLEL:
				return getParallel();
			case CplfmPackage.CONSTITUENT_MODEL__FIELD:
				return getField();
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
			case CplfmPackage.CONSTITUENT_MODEL__GRID:
				setGrid((Grid)newValue);
				return;
			case CplfmPackage.CONSTITUENT_MODEL__PARALLEL:
				setParallel((Parallel)newValue);
				return;
			case CplfmPackage.CONSTITUENT_MODEL__FIELD:
				getField().clear();
				getField().addAll((Collection<? extends Field>)newValue);
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
			case CplfmPackage.CONSTITUENT_MODEL__GRID:
				setGrid((Grid)null);
				return;
			case CplfmPackage.CONSTITUENT_MODEL__PARALLEL:
				setParallel((Parallel)null);
				return;
			case CplfmPackage.CONSTITUENT_MODEL__FIELD:
				getField().clear();
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
			case CplfmPackage.CONSTITUENT_MODEL__GRID:
				return grid != null;
			case CplfmPackage.CONSTITUENT_MODEL__PARALLEL:
				return parallel != null;
			case CplfmPackage.CONSTITUENT_MODEL__FIELD:
				return field != null && !field.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstituentModelImpl
