/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver Connector Imports Connector Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ConnectorImports__ConnectorImportImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ConnectorImports__ConnectorImportImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ConnectorImports__ConnectorImportImpl#getSetServices <em>Set Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCDriver__ConnectorImports__ConnectorImportImpl extends EObjectImpl implements NUOPCDriver__ConnectorImports__ConnectorImport {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCDriver__ConnectorImports__ConnectorImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__ConnectorImports getParent() {
		if (eContainerFeatureID() != NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__PARENT) return null;
		return (NUOPCDriver__ConnectorImports)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(NUOPCDriver__ConnectorImports newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NUOPCDriver__ConnectorImports newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__CONNECTOR_IMPORT, NUOPCDriver__ConnectorImports.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__SET_SERVICES, oldSetServices, setServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((NUOPCDriver__ConnectorImports)otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__PARENT:
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
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__CONNECTOR_IMPORT, NUOPCDriver__ConnectorImports.class, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__PARENT:
				return getParent();
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__NAME:
				return getName();
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__SET_SERVICES:
				return getSetServices();
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
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__PARENT:
				setParent((NUOPCDriver__ConnectorImports)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__SET_SERVICES:
				setSetServices((String)newValue);
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
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__PARENT:
				setParent((NUOPCDriver__ConnectorImports)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__SET_SERVICES:
				setSetServices(SET_SERVICES_EDEFAULT);
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
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__PARENT:
				return getParent() != null;
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__SET_SERVICES:
				return SET_SERVICES_EDEFAULT == null ? setServices != null : !SET_SERVICES_EDEFAULT.equals(setServices);
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

} //NUOPCDriver__ConnectorImports__ConnectorImportImpl
