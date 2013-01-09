/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFVirtualMachine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFVirtualMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFVirtualMachineImpl#getParentVM <em>Parent VM</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFVirtualMachineImpl#getPetID <em>Pet ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFVirtualMachineImpl extends EObjectImpl implements ESMFVirtualMachine {
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
	 * The cached value of the '{@link #getParentVM() <em>Parent VM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentVM()
	 * @generated
	 * @ordered
	 */
	protected ESMFVirtualMachine parentVM;

	/**
	 * The cached value of the '{@link #getPetID() <em>Pet ID</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetID()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> petID;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFVirtualMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_VIRTUAL_MACHINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_VIRTUAL_MACHINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFVirtualMachine getParentVM() {
		if (parentVM != null && parentVM.eIsProxy()) {
			InternalEObject oldParentVM = (InternalEObject)parentVM;
			parentVM = (ESMFVirtualMachine)eResolveProxy(oldParentVM);
			if (parentVM != oldParentVM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_VIRTUAL_MACHINE__PARENT_VM, oldParentVM, parentVM));
			}
		}
		return parentVM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFVirtualMachine basicGetParentVM() {
		return parentVM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentVM(ESMFVirtualMachine newParentVM) {
		ESMFVirtualMachine oldParentVM = parentVM;
		parentVM = newParentVM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_VIRTUAL_MACHINE__PARENT_VM, oldParentVM, parentVM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getPetID() {
		if (petID == null) {
			petID = new EDataTypeUniqueEList<Integer>(Integer.class, this, ESMFPackage.ESMF_VIRTUAL_MACHINE__PET_ID);
		}
		return petID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_VIRTUAL_MACHINE__NAME:
				return getName();
			case ESMFPackage.ESMF_VIRTUAL_MACHINE__PARENT_VM:
				if (resolve) return getParentVM();
				return basicGetParentVM();
			case ESMFPackage.ESMF_VIRTUAL_MACHINE__PET_ID:
				return getPetID();
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
			case ESMFPackage.ESMF_VIRTUAL_MACHINE__NAME:
				setName((String)newValue);
				return;
			case ESMFPackage.ESMF_VIRTUAL_MACHINE__PARENT_VM:
				setParentVM((ESMFVirtualMachine)newValue);
				return;
			case ESMFPackage.ESMF_VIRTUAL_MACHINE__PET_ID:
				getPetID().clear();
				getPetID().addAll((Collection<? extends Integer>)newValue);
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
			case ESMFPackage.ESMF_VIRTUAL_MACHINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ESMFPackage.ESMF_VIRTUAL_MACHINE__PARENT_VM:
				setParentVM((ESMFVirtualMachine)null);
				return;
			case ESMFPackage.ESMF_VIRTUAL_MACHINE__PET_ID:
				getPetID().clear();
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
			case ESMFPackage.ESMF_VIRTUAL_MACHINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ESMFPackage.ESMF_VIRTUAL_MACHINE__PARENT_VM:
				return parentVM != null;
			case ESMFPackage.ESMF_VIRTUAL_MACHINE__PET_ID:
				return petID != null && !petID.isEmpty();
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
		result.append(", petID: ");
		result.append(petID);
		result.append(')');
		return result.toString();
	}

} //ESMFVirtualMachineImpl
