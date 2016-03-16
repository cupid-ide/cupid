/**
 */
package org.earthsystemmodeling.cupid.NUOPC.impl;

import java.util.Collection;

import org.earthsystemmodeling.cupid.NUOPC.Grid;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.GridImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.GridImpl#getMinIndex <em>Min Index</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.GridImpl#getMaxIndex <em>Max Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GridImpl extends MinimalEObjectImpl.Container implements Grid {
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
	 * The cached value of the '{@link #getMinIndex() <em>Min Index</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> minIndex;

	/**
	 * The cached value of the '{@link #getMaxIndex() <em>Max Index</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> maxIndex;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.GRID;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.GRID__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getMinIndex() {
		if (minIndex == null) {
			minIndex = new EDataTypeEList<Integer>(Integer.class, this, NUOPCPackage.GRID__MIN_INDEX);
		}
		return minIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getMaxIndex() {
		if (maxIndex == null) {
			maxIndex = new EDataTypeEList<Integer>(Integer.class, this, NUOPCPackage.GRID__MAX_INDEX);
		}
		return maxIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NUOPCPackage.GRID__NAME:
				return getName();
			case NUOPCPackage.GRID__MIN_INDEX:
				return getMinIndex();
			case NUOPCPackage.GRID__MAX_INDEX:
				return getMaxIndex();
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
			case NUOPCPackage.GRID__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.GRID__MIN_INDEX:
				getMinIndex().clear();
				getMinIndex().addAll((Collection<? extends Integer>)newValue);
				return;
			case NUOPCPackage.GRID__MAX_INDEX:
				getMaxIndex().clear();
				getMaxIndex().addAll((Collection<? extends Integer>)newValue);
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
			case NUOPCPackage.GRID__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.GRID__MIN_INDEX:
				getMinIndex().clear();
				return;
			case NUOPCPackage.GRID__MAX_INDEX:
				getMaxIndex().clear();
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
			case NUOPCPackage.GRID__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.GRID__MIN_INDEX:
				return minIndex != null && !minIndex.isEmpty();
			case NUOPCPackage.GRID__MAX_INDEX:
				return maxIndex != null && !maxIndex.isEmpty();
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
		result.append(", minIndex: ");
		result.append(minIndex);
		result.append(", maxIndex: ");
		result.append(maxIndex);
		result.append(')');
		return result.toString();
	}

} //GridImpl
