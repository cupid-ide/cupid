/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImport;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImportImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImportImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImportImpl#getSetServices <em>Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImportImpl#getModelRef <em>Model Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImportImpl extends EObjectImpl implements ModelImport {
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
	 * The default value of the '{@link #getSetServices() <em>Set Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetServices()
	 * @generated
	 * @ordered
	 */
	protected static final String SET_SERVICES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSetServices() <em>Set Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetServices()
	 * @generated
	 * @ordered
	 */
	protected String setServices = SET_SERVICES_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getModelRef() <em>Model Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelRef()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MODEL_REF__ESETTING_DELEGATE = ((EStructuralFeature.Internal)NUOPCPackage.Literals.MODEL_IMPORT__MODEL_REF).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.MODEL_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__ModelImports getParent() {
		if (eContainerFeatureID() != NUOPCPackage.MODEL_IMPORT__PARENT) return null;
		return (NUOPCDriver__ModelImports)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(NUOPCDriver__ModelImports newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.MODEL_IMPORT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NUOPCDriver__ModelImports newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.MODEL_IMPORT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.NUOPC_DRIVER_MODEL_IMPORTS__MODEL_IMPORT, NUOPCDriver__ModelImports.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPORT__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSetServices() {
		return setServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetServices(String newSetServices) {
		String oldSetServices = setServices;
		setServices = newSetServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPORT__SET_SERVICES, oldSetServices, setServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel getModelRef() {
		return (NUOPCModel)MODEL_REF__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel basicGetModelRef() {
		return (NUOPCModel)MODEL_REF__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelRef(NUOPCModel newModelRef) {
		MODEL_REF__ESETTING_DELEGATE.dynamicSet(this, null, 0, newModelRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.MODEL_IMPORT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((NUOPCDriver__ModelImports)otherEnd, msgs);
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
			case NUOPCPackage.MODEL_IMPORT__PARENT:
				return basicSetParent(null, msgs);
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
			case NUOPCPackage.MODEL_IMPORT__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.NUOPC_DRIVER_MODEL_IMPORTS__MODEL_IMPORT, NUOPCDriver__ModelImports.class, msgs);
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
			case NUOPCPackage.MODEL_IMPORT__PARENT:
				return getParent();
			case NUOPCPackage.MODEL_IMPORT__NAME:
				return getName();
			case NUOPCPackage.MODEL_IMPORT__SET_SERVICES:
				return getSetServices();
			case NUOPCPackage.MODEL_IMPORT__MODEL_REF:
				if (resolve) return getModelRef();
				return basicGetModelRef();
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
			case NUOPCPackage.MODEL_IMPORT__PARENT:
				setParent((NUOPCDriver__ModelImports)newValue);
				return;
			case NUOPCPackage.MODEL_IMPORT__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.MODEL_IMPORT__SET_SERVICES:
				setSetServices((String)newValue);
				return;
			case NUOPCPackage.MODEL_IMPORT__MODEL_REF:
				setModelRef((NUOPCModel)newValue);
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
			case NUOPCPackage.MODEL_IMPORT__PARENT:
				setParent((NUOPCDriver__ModelImports)null);
				return;
			case NUOPCPackage.MODEL_IMPORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPORT__SET_SERVICES:
				setSetServices(SET_SERVICES_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPORT__MODEL_REF:
				setModelRef((NUOPCModel)null);
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
			case NUOPCPackage.MODEL_IMPORT__PARENT:
				return getParent() != null;
			case NUOPCPackage.MODEL_IMPORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.MODEL_IMPORT__SET_SERVICES:
				return SET_SERVICES_EDEFAULT == null ? setServices != null : !SET_SERVICES_EDEFAULT.equals(setServices);
			case NUOPCPackage.MODEL_IMPORT__MODEL_REF:
				return MODEL_REF__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(", setServices: ");
		result.append(setServices);
		result.append(')');
		return result.toString();
	}

} //ModelImportImpl
