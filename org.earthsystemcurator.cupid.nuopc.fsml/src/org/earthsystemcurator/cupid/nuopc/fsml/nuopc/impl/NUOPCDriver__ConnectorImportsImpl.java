/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver Connector Imports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ConnectorImportsImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriver__ConnectorImportsImpl#getConnectorImport <em>Connector Import</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCDriver__ConnectorImportsImpl extends EObjectImpl implements NUOPCDriver__ConnectorImports {
	/**
	 * The cached value of the '{@link #getConnectorImport() <em>Connector Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorImport()
	 * @generated
	 * @ordered
	 */
	protected EList<NUOPCDriver__ConnectorImports__ConnectorImport> connectorImport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCDriver__ConnectorImportsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_DRIVER_CONNECTOR_IMPORTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver getParent() {
		if (eContainerFeatureID() != NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__PARENT) return null;
		return (NUOPCDriver)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(NUOPCDriver newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NUOPCDriver newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.NUOPC_DRIVER__CONNECTOR_IMPORTS, NUOPCDriver.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NUOPCDriver__ConnectorImports__ConnectorImport> getConnectorImport() {
		if (connectorImport == null) {
			connectorImport = new EObjectContainmentWithInverseEList<NUOPCDriver__ConnectorImports__ConnectorImport>(NUOPCDriver__ConnectorImports__ConnectorImport.class, this, NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__CONNECTOR_IMPORT, NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS_CONNECTOR_IMPORT__PARENT);
		}
		return connectorImport;
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
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((NUOPCDriver)otherEnd, msgs);
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__CONNECTOR_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnectorImport()).basicAdd(otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__PARENT:
				return basicSetParent(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__CONNECTOR_IMPORT:
				return ((InternalEList<?>)getConnectorImport()).basicRemove(otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.NUOPC_DRIVER__CONNECTOR_IMPORTS, NUOPCDriver.class, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__PARENT:
				return getParent();
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__CONNECTOR_IMPORT:
				return getConnectorImport();
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
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__PARENT:
				setParent((NUOPCDriver)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__CONNECTOR_IMPORT:
				getConnectorImport().clear();
				getConnectorImport().addAll((Collection<? extends NUOPCDriver__ConnectorImports__ConnectorImport>)newValue);
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
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__PARENT:
				setParent((NUOPCDriver)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__CONNECTOR_IMPORT:
				getConnectorImport().clear();
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
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__PARENT:
				return getParent() != null;
			case NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__CONNECTOR_IMPORT:
				return connectorImport != null && !connectorImport.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NUOPCDriver__ConnectorImportsImpl
