/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports__ModelImport;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver Atm Ocn Model Imports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ModelImportsImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ModelImportsImpl#getModelImport <em>Model Import</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCDriverAtmOcn__ModelImportsImpl extends EObjectImpl implements NUOPCDriverAtmOcn__ModelImports {
	/**
	 * The cached value of the '{@link #getModelImport() <em>Model Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelImport()
	 * @generated
	 * @ordered
	 */
	protected EList<NUOPCDriverAtmOcn__ModelImports__ModelImport> modelImport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCDriverAtmOcn__ModelImportsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn getParent() {
		if (eContainerFeatureID() != NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__PARENT) return null;
		return (NUOPCDriverAtmOcn)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(NUOPCDriverAtmOcn newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NUOPCDriverAtmOcn newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS, NUOPCDriverAtmOcn.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NUOPCDriverAtmOcn__ModelImports__ModelImport> getModelImport() {
		if (modelImport == null) {
			modelImport = new EObjectContainmentWithInverseEList<NUOPCDriverAtmOcn__ModelImports__ModelImport>(NUOPCDriverAtmOcn__ModelImports__ModelImport.class, this, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__MODEL_IMPORT, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS_MODEL_IMPORT__PARENT);
		}
		return modelImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((NUOPCDriverAtmOcn)otherEnd, msgs);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__MODEL_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModelImport()).basicAdd(otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__PARENT:
				return basicSetParent(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__MODEL_IMPORT:
				return ((InternalEList<?>)getModelImport()).basicRemove(otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS, NUOPCDriverAtmOcn.class, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__PARENT:
				return getParent();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__MODEL_IMPORT:
				return getModelImport();
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__PARENT:
				setParent((NUOPCDriverAtmOcn)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__MODEL_IMPORT:
				getModelImport().clear();
				getModelImport().addAll((Collection<? extends NUOPCDriverAtmOcn__ModelImports__ModelImport>)newValue);
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__PARENT:
				setParent((NUOPCDriverAtmOcn)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__MODEL_IMPORT:
				getModelImport().clear();
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__PARENT:
				return getParent() != null;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__MODEL_IMPORT:
				return modelImport != null && !modelImport.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NUOPCDriverAtmOcn__ModelImportsImpl
