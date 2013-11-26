/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__GenericImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports;
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
 * An implementation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverImpl#getGenericImports <em>Generic Imports</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverImpl#getModelImports <em>Model Imports</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverImpl#getConnectorImports <em>Connector Imports</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverImpl#getImplementsSetServices <em>Implements Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverImpl#getImplementsSetModelCount <em>Implements Set Model Count</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverImpl#getImplementsSetModelServices <em>Implements Set Model Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCDriverImpl extends EObjectImpl implements NUOPCDriver {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "ModelDefault";

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
	 * The cached value of the '{@link #getGenericImports() <em>Generic Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericImports()
	 * @generated
	 * @ordered
	 */
	protected NUOPCDriver__GenericImports genericImports;

	/**
	 * The cached value of the '{@link #getModelImports() <em>Model Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelImports()
	 * @generated
	 * @ordered
	 */
	protected NUOPCDriver__ModelImports modelImports;

	/**
	 * The cached value of the '{@link #getConnectorImports() <em>Connector Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorImports()
	 * @generated
	 * @ordered
	 */
	protected NUOPCDriver__ConnectorImports connectorImports;

	/**
	 * The cached value of the '{@link #getImplementsSetServices() <em>Implements Set Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsSetServices()
	 * @generated
	 * @ordered
	 */
	protected NUOPCDriver__ImplementsSetServices implementsSetServices;

	/**
	 * The cached value of the '{@link #getImplementsSetModelCount() <em>Implements Set Model Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsSetModelCount()
	 * @generated
	 * @ordered
	 */
	protected NUOPCDriver__ImplementsSetModelCount implementsSetModelCount;

	/**
	 * The cached value of the '{@link #getImplementsSetModelServices() <em>Implements Set Model Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsSetModelServices()
	 * @generated
	 * @ordered
	 */
	protected NUOPCDriver__ImplementsSetModelServices implementsSetModelServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCDriverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_DRIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCApplication getParent() {
		if (eContainerFeatureID() != NUOPCPackage.NUOPC_DRIVER__PARENT) return null;
		return (NUOPCApplication)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(NUOPCApplication newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.NUOPC_DRIVER__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NUOPCApplication newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.NUOPC_DRIVER__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.NUOPC_APPLICATION__NUOPC_DRIVER, NUOPCApplication.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__GenericImports getGenericImports() {
		return genericImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericImports(NUOPCDriver__GenericImports newGenericImports, NotificationChain msgs) {
		NUOPCDriver__GenericImports oldGenericImports = genericImports;
		genericImports = newGenericImports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER__GENERIC_IMPORTS, oldGenericImports, newGenericImports);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericImports(NUOPCDriver__GenericImports newGenericImports) {
		if (newGenericImports != genericImports) {
			NotificationChain msgs = null;
			if (genericImports != null)
				msgs = ((InternalEObject)genericImports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER__GENERIC_IMPORTS, null, msgs);
			if (newGenericImports != null)
				msgs = ((InternalEObject)newGenericImports).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER__GENERIC_IMPORTS, null, msgs);
			msgs = basicSetGenericImports(newGenericImports, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER__GENERIC_IMPORTS, newGenericImports, newGenericImports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__ModelImports getModelImports() {
		return modelImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelImports(NUOPCDriver__ModelImports newModelImports, NotificationChain msgs) {
		NUOPCDriver__ModelImports oldModelImports = modelImports;
		modelImports = newModelImports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER__MODEL_IMPORTS, oldModelImports, newModelImports);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelImports(NUOPCDriver__ModelImports newModelImports) {
		if (newModelImports != modelImports) {
			NotificationChain msgs = null;
			if (modelImports != null)
				msgs = ((InternalEObject)modelImports).eInverseRemove(this, NUOPCPackage.NUOPC_DRIVER_MODEL_IMPORTS__PARENT, NUOPCDriver__ModelImports.class, msgs);
			if (newModelImports != null)
				msgs = ((InternalEObject)newModelImports).eInverseAdd(this, NUOPCPackage.NUOPC_DRIVER_MODEL_IMPORTS__PARENT, NUOPCDriver__ModelImports.class, msgs);
			msgs = basicSetModelImports(newModelImports, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER__MODEL_IMPORTS, newModelImports, newModelImports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__ConnectorImports getConnectorImports() {
		return connectorImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectorImports(NUOPCDriver__ConnectorImports newConnectorImports, NotificationChain msgs) {
		NUOPCDriver__ConnectorImports oldConnectorImports = connectorImports;
		connectorImports = newConnectorImports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER__CONNECTOR_IMPORTS, oldConnectorImports, newConnectorImports);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectorImports(NUOPCDriver__ConnectorImports newConnectorImports) {
		if (newConnectorImports != connectorImports) {
			NotificationChain msgs = null;
			if (connectorImports != null)
				msgs = ((InternalEObject)connectorImports).eInverseRemove(this, NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__PARENT, NUOPCDriver__ConnectorImports.class, msgs);
			if (newConnectorImports != null)
				msgs = ((InternalEObject)newConnectorImports).eInverseAdd(this, NUOPCPackage.NUOPC_DRIVER_CONNECTOR_IMPORTS__PARENT, NUOPCDriver__ConnectorImports.class, msgs);
			msgs = basicSetConnectorImports(newConnectorImports, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER__CONNECTOR_IMPORTS, newConnectorImports, newConnectorImports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__ImplementsSetServices getImplementsSetServices() {
		return implementsSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementsSetServices(NUOPCDriver__ImplementsSetServices newImplementsSetServices, NotificationChain msgs) {
		NUOPCDriver__ImplementsSetServices oldImplementsSetServices = implementsSetServices;
		implementsSetServices = newImplementsSetServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_SERVICES, oldImplementsSetServices, newImplementsSetServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsSetServices(NUOPCDriver__ImplementsSetServices newImplementsSetServices) {
		if (newImplementsSetServices != implementsSetServices) {
			NotificationChain msgs = null;
			if (implementsSetServices != null)
				msgs = ((InternalEObject)implementsSetServices).eInverseRemove(this, NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__PARENT, NUOPCDriver__ImplementsSetServices.class, msgs);
			if (newImplementsSetServices != null)
				msgs = ((InternalEObject)newImplementsSetServices).eInverseAdd(this, NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_SERVICES__PARENT, NUOPCDriver__ImplementsSetServices.class, msgs);
			msgs = basicSetImplementsSetServices(newImplementsSetServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_SERVICES, newImplementsSetServices, newImplementsSetServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__ImplementsSetModelCount getImplementsSetModelCount() {
		return implementsSetModelCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementsSetModelCount(NUOPCDriver__ImplementsSetModelCount newImplementsSetModelCount, NotificationChain msgs) {
		NUOPCDriver__ImplementsSetModelCount oldImplementsSetModelCount = implementsSetModelCount;
		implementsSetModelCount = newImplementsSetModelCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT, oldImplementsSetModelCount, newImplementsSetModelCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsSetModelCount(NUOPCDriver__ImplementsSetModelCount newImplementsSetModelCount) {
		if (newImplementsSetModelCount != implementsSetModelCount) {
			NotificationChain msgs = null;
			if (implementsSetModelCount != null)
				msgs = ((InternalEObject)implementsSetModelCount).eInverseRemove(this, NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT, NUOPCDriver__ImplementsSetModelCount.class, msgs);
			if (newImplementsSetModelCount != null)
				msgs = ((InternalEObject)newImplementsSetModelCount).eInverseAdd(this, NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_COUNT__PARENT, NUOPCDriver__ImplementsSetModelCount.class, msgs);
			msgs = basicSetImplementsSetModelCount(newImplementsSetModelCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT, newImplementsSetModelCount, newImplementsSetModelCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriver__ImplementsSetModelServices getImplementsSetModelServices() {
		return implementsSetModelServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementsSetModelServices(NUOPCDriver__ImplementsSetModelServices newImplementsSetModelServices, NotificationChain msgs) {
		NUOPCDriver__ImplementsSetModelServices oldImplementsSetModelServices = implementsSetModelServices;
		implementsSetModelServices = newImplementsSetModelServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_SERVICES, oldImplementsSetModelServices, newImplementsSetModelServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsSetModelServices(NUOPCDriver__ImplementsSetModelServices newImplementsSetModelServices) {
		if (newImplementsSetModelServices != implementsSetModelServices) {
			NotificationChain msgs = null;
			if (implementsSetModelServices != null)
				msgs = ((InternalEObject)implementsSetModelServices).eInverseRemove(this, NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__PARENT, NUOPCDriver__ImplementsSetModelServices.class, msgs);
			if (newImplementsSetModelServices != null)
				msgs = ((InternalEObject)newImplementsSetModelServices).eInverseAdd(this, NUOPCPackage.NUOPC_DRIVER_IMPLEMENTS_SET_MODEL_SERVICES__PARENT, NUOPCDriver__ImplementsSetModelServices.class, msgs);
			msgs = basicSetImplementsSetModelServices(newImplementsSetModelServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_SERVICES, newImplementsSetModelServices, newImplementsSetModelServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_DRIVER__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((NUOPCApplication)otherEnd, msgs);
			case NUOPCPackage.NUOPC_DRIVER__MODEL_IMPORTS:
				if (modelImports != null)
					msgs = ((InternalEObject)modelImports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER__MODEL_IMPORTS, null, msgs);
				return basicSetModelImports((NUOPCDriver__ModelImports)otherEnd, msgs);
			case NUOPCPackage.NUOPC_DRIVER__CONNECTOR_IMPORTS:
				if (connectorImports != null)
					msgs = ((InternalEObject)connectorImports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER__CONNECTOR_IMPORTS, null, msgs);
				return basicSetConnectorImports((NUOPCDriver__ConnectorImports)otherEnd, msgs);
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_SERVICES:
				if (implementsSetServices != null)
					msgs = ((InternalEObject)implementsSetServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_SERVICES, null, msgs);
				return basicSetImplementsSetServices((NUOPCDriver__ImplementsSetServices)otherEnd, msgs);
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT:
				if (implementsSetModelCount != null)
					msgs = ((InternalEObject)implementsSetModelCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT, null, msgs);
				return basicSetImplementsSetModelCount((NUOPCDriver__ImplementsSetModelCount)otherEnd, msgs);
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_SERVICES:
				if (implementsSetModelServices != null)
					msgs = ((InternalEObject)implementsSetModelServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_SERVICES, null, msgs);
				return basicSetImplementsSetModelServices((NUOPCDriver__ImplementsSetModelServices)otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER__PARENT:
				return basicSetParent(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER__GENERIC_IMPORTS:
				return basicSetGenericImports(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER__MODEL_IMPORTS:
				return basicSetModelImports(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER__CONNECTOR_IMPORTS:
				return basicSetConnectorImports(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_SERVICES:
				return basicSetImplementsSetServices(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT:
				return basicSetImplementsSetModelCount(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_SERVICES:
				return basicSetImplementsSetModelServices(null, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.NUOPC_APPLICATION__NUOPC_DRIVER, NUOPCApplication.class, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER__PARENT:
				return getParent();
			case NUOPCPackage.NUOPC_DRIVER__NAME:
				return getName();
			case NUOPCPackage.NUOPC_DRIVER__GENERIC_IMPORTS:
				return getGenericImports();
			case NUOPCPackage.NUOPC_DRIVER__MODEL_IMPORTS:
				return getModelImports();
			case NUOPCPackage.NUOPC_DRIVER__CONNECTOR_IMPORTS:
				return getConnectorImports();
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_SERVICES:
				return getImplementsSetServices();
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT:
				return getImplementsSetModelCount();
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_SERVICES:
				return getImplementsSetModelServices();
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
			case NUOPCPackage.NUOPC_DRIVER__PARENT:
				setParent((NUOPCApplication)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER__GENERIC_IMPORTS:
				setGenericImports((NUOPCDriver__GenericImports)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER__MODEL_IMPORTS:
				setModelImports((NUOPCDriver__ModelImports)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER__CONNECTOR_IMPORTS:
				setConnectorImports((NUOPCDriver__ConnectorImports)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_SERVICES:
				setImplementsSetServices((NUOPCDriver__ImplementsSetServices)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT:
				setImplementsSetModelCount((NUOPCDriver__ImplementsSetModelCount)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_SERVICES:
				setImplementsSetModelServices((NUOPCDriver__ImplementsSetModelServices)newValue);
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
			case NUOPCPackage.NUOPC_DRIVER__PARENT:
				setParent((NUOPCApplication)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_DRIVER__GENERIC_IMPORTS:
				setGenericImports((NUOPCDriver__GenericImports)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER__MODEL_IMPORTS:
				setModelImports((NUOPCDriver__ModelImports)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER__CONNECTOR_IMPORTS:
				setConnectorImports((NUOPCDriver__ConnectorImports)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_SERVICES:
				setImplementsSetServices((NUOPCDriver__ImplementsSetServices)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT:
				setImplementsSetModelCount((NUOPCDriver__ImplementsSetModelCount)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_SERVICES:
				setImplementsSetModelServices((NUOPCDriver__ImplementsSetModelServices)null);
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
			case NUOPCPackage.NUOPC_DRIVER__PARENT:
				return getParent() != null;
			case NUOPCPackage.NUOPC_DRIVER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.NUOPC_DRIVER__GENERIC_IMPORTS:
				return genericImports != null;
			case NUOPCPackage.NUOPC_DRIVER__MODEL_IMPORTS:
				return modelImports != null;
			case NUOPCPackage.NUOPC_DRIVER__CONNECTOR_IMPORTS:
				return connectorImports != null;
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_SERVICES:
				return implementsSetServices != null;
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_COUNT:
				return implementsSetModelCount != null;
			case NUOPCPackage.NUOPC_DRIVER__IMPLEMENTS_SET_MODEL_SERVICES:
				return implementsSetModelServices != null;
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
		result.append(')');
		return result.toString();
	}

} //NUOPCDriverImpl
