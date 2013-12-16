/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelPetLists;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports;
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
 * An implementation of the model object '<em><b>Driver Atm Ocn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcnImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcnImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcnImpl#getGenericImports <em>Generic Imports</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcnImpl#getModelImports <em>Model Imports</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcnImpl#getImplementsSetServices <em>Implements Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcnImpl#getImplementsSetModelCount <em>Implements Set Model Count</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcnImpl#getImplementsSetModelServices <em>Implements Set Model Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcnImpl#getImplementsSetModelPetLists <em>Implements Set Model Pet Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCDriverAtmOcnImpl extends EObjectImpl implements NUOPCDriverAtmOcn {
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
	protected NUOPCDriverAtmOcn__GenericImports genericImports;

	/**
	 * The cached value of the '{@link #getModelImports() <em>Model Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelImports()
	 * @generated
	 * @ordered
	 */
	protected NUOPCDriverAtmOcn__ModelImports modelImports;

	/**
	 * The cached value of the '{@link #getImplementsSetServices() <em>Implements Set Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsSetServices()
	 * @generated
	 * @ordered
	 */
	protected NUOPCDriverAtmOcn__ImplementsSetServices implementsSetServices;

	/**
	 * The cached value of the '{@link #getImplementsSetModelCount() <em>Implements Set Model Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsSetModelCount()
	 * @generated
	 * @ordered
	 */
	protected NUOPCDriverAtmOcn__ImplementsSetModelCount implementsSetModelCount;

	/**
	 * The cached value of the '{@link #getImplementsSetModelServices() <em>Implements Set Model Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsSetModelServices()
	 * @generated
	 * @ordered
	 */
	protected NUOPCDriverAtmOcn__ImplementsSetModelServices implementsSetModelServices;

	/**
	 * The cached value of the '{@link #getImplementsSetModelPetLists() <em>Implements Set Model Pet Lists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsSetModelPetLists()
	 * @generated
	 * @ordered
	 */
	protected NUOPCDriverAtmOcn__ImplementsSetModelPetLists implementsSetModelPetLists;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCDriverAtmOcnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCApplication getParent() {
		if (eContainerFeatureID() != NUOPCPackage.NUOPC_DRIVER_ATM_OCN__PARENT) return null;
		return (NUOPCApplication)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(NUOPCApplication newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NUOPCApplication newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.NUOPC_DRIVER_ATM_OCN__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.NUOPC_APPLICATION__NUOPC_DRIVER_ATM_OCN, NUOPCApplication.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn__GenericImports getGenericImports() {
		return genericImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericImports(NUOPCDriverAtmOcn__GenericImports newGenericImports, NotificationChain msgs) {
		NUOPCDriverAtmOcn__GenericImports oldGenericImports = genericImports;
		genericImports = newGenericImports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__GENERIC_IMPORTS, oldGenericImports, newGenericImports);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericImports(NUOPCDriverAtmOcn__GenericImports newGenericImports) {
		if (newGenericImports != genericImports) {
			NotificationChain msgs = null;
			if (genericImports != null)
				msgs = ((InternalEObject)genericImports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER_ATM_OCN__GENERIC_IMPORTS, null, msgs);
			if (newGenericImports != null)
				msgs = ((InternalEObject)newGenericImports).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER_ATM_OCN__GENERIC_IMPORTS, null, msgs);
			msgs = basicSetGenericImports(newGenericImports, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__GENERIC_IMPORTS, newGenericImports, newGenericImports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn__ModelImports getModelImports() {
		return modelImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelImports(NUOPCDriverAtmOcn__ModelImports newModelImports, NotificationChain msgs) {
		NUOPCDriverAtmOcn__ModelImports oldModelImports = modelImports;
		modelImports = newModelImports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS, oldModelImports, newModelImports);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelImports(NUOPCDriverAtmOcn__ModelImports newModelImports) {
		if (newModelImports != modelImports) {
			NotificationChain msgs = null;
			if (modelImports != null)
				msgs = ((InternalEObject)modelImports).eInverseRemove(this, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__PARENT, NUOPCDriverAtmOcn__ModelImports.class, msgs);
			if (newModelImports != null)
				msgs = ((InternalEObject)newModelImports).eInverseAdd(this, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_MODEL_IMPORTS__PARENT, NUOPCDriverAtmOcn__ModelImports.class, msgs);
			msgs = basicSetModelImports(newModelImports, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS, newModelImports, newModelImports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn__ImplementsSetServices getImplementsSetServices() {
		return implementsSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementsSetServices(NUOPCDriverAtmOcn__ImplementsSetServices newImplementsSetServices, NotificationChain msgs) {
		NUOPCDriverAtmOcn__ImplementsSetServices oldImplementsSetServices = implementsSetServices;
		implementsSetServices = newImplementsSetServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES, oldImplementsSetServices, newImplementsSetServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsSetServices(NUOPCDriverAtmOcn__ImplementsSetServices newImplementsSetServices) {
		if (newImplementsSetServices != implementsSetServices) {
			NotificationChain msgs = null;
			if (implementsSetServices != null)
				msgs = ((InternalEObject)implementsSetServices).eInverseRemove(this, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT, NUOPCDriverAtmOcn__ImplementsSetServices.class, msgs);
			if (newImplementsSetServices != null)
				msgs = ((InternalEObject)newImplementsSetServices).eInverseAdd(this, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT, NUOPCDriverAtmOcn__ImplementsSetServices.class, msgs);
			msgs = basicSetImplementsSetServices(newImplementsSetServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES, newImplementsSetServices, newImplementsSetServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn__ImplementsSetModelCount getImplementsSetModelCount() {
		return implementsSetModelCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementsSetModelCount(NUOPCDriverAtmOcn__ImplementsSetModelCount newImplementsSetModelCount, NotificationChain msgs) {
		NUOPCDriverAtmOcn__ImplementsSetModelCount oldImplementsSetModelCount = implementsSetModelCount;
		implementsSetModelCount = newImplementsSetModelCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_COUNT, oldImplementsSetModelCount, newImplementsSetModelCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsSetModelCount(NUOPCDriverAtmOcn__ImplementsSetModelCount newImplementsSetModelCount) {
		if (newImplementsSetModelCount != implementsSetModelCount) {
			NotificationChain msgs = null;
			if (implementsSetModelCount != null)
				msgs = ((InternalEObject)implementsSetModelCount).eInverseRemove(this, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__PARENT, NUOPCDriverAtmOcn__ImplementsSetModelCount.class, msgs);
			if (newImplementsSetModelCount != null)
				msgs = ((InternalEObject)newImplementsSetModelCount).eInverseAdd(this, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_COUNT__PARENT, NUOPCDriverAtmOcn__ImplementsSetModelCount.class, msgs);
			msgs = basicSetImplementsSetModelCount(newImplementsSetModelCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_COUNT, newImplementsSetModelCount, newImplementsSetModelCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn__ImplementsSetModelServices getImplementsSetModelServices() {
		return implementsSetModelServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementsSetModelServices(NUOPCDriverAtmOcn__ImplementsSetModelServices newImplementsSetModelServices, NotificationChain msgs) {
		NUOPCDriverAtmOcn__ImplementsSetModelServices oldImplementsSetModelServices = implementsSetModelServices;
		implementsSetModelServices = newImplementsSetModelServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_SERVICES, oldImplementsSetModelServices, newImplementsSetModelServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsSetModelServices(NUOPCDriverAtmOcn__ImplementsSetModelServices newImplementsSetModelServices) {
		if (newImplementsSetModelServices != implementsSetModelServices) {
			NotificationChain msgs = null;
			if (implementsSetModelServices != null)
				msgs = ((InternalEObject)implementsSetModelServices).eInverseRemove(this, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__PARENT, NUOPCDriverAtmOcn__ImplementsSetModelServices.class, msgs);
			if (newImplementsSetModelServices != null)
				msgs = ((InternalEObject)newImplementsSetModelServices).eInverseAdd(this, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_SERVICES__PARENT, NUOPCDriverAtmOcn__ImplementsSetModelServices.class, msgs);
			msgs = basicSetImplementsSetModelServices(newImplementsSetModelServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_SERVICES, newImplementsSetModelServices, newImplementsSetModelServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn__ImplementsSetModelPetLists getImplementsSetModelPetLists() {
		return implementsSetModelPetLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementsSetModelPetLists(NUOPCDriverAtmOcn__ImplementsSetModelPetLists newImplementsSetModelPetLists, NotificationChain msgs) {
		NUOPCDriverAtmOcn__ImplementsSetModelPetLists oldImplementsSetModelPetLists = implementsSetModelPetLists;
		implementsSetModelPetLists = newImplementsSetModelPetLists;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_PET_LISTS, oldImplementsSetModelPetLists, newImplementsSetModelPetLists);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsSetModelPetLists(NUOPCDriverAtmOcn__ImplementsSetModelPetLists newImplementsSetModelPetLists) {
		if (newImplementsSetModelPetLists != implementsSetModelPetLists) {
			NotificationChain msgs = null;
			if (implementsSetModelPetLists != null)
				msgs = ((InternalEObject)implementsSetModelPetLists).eInverseRemove(this, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_PET_LISTS__PARENT, NUOPCDriverAtmOcn__ImplementsSetModelPetLists.class, msgs);
			if (newImplementsSetModelPetLists != null)
				msgs = ((InternalEObject)newImplementsSetModelPetLists).eInverseAdd(this, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_MODEL_PET_LISTS__PARENT, NUOPCDriverAtmOcn__ImplementsSetModelPetLists.class, msgs);
			msgs = basicSetImplementsSetModelPetLists(newImplementsSetModelPetLists, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_PET_LISTS, newImplementsSetModelPetLists, newImplementsSetModelPetLists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((NUOPCApplication)otherEnd, msgs);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS:
				if (modelImports != null)
					msgs = ((InternalEObject)modelImports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS, null, msgs);
				return basicSetModelImports((NUOPCDriverAtmOcn__ModelImports)otherEnd, msgs);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES:
				if (implementsSetServices != null)
					msgs = ((InternalEObject)implementsSetServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES, null, msgs);
				return basicSetImplementsSetServices((NUOPCDriverAtmOcn__ImplementsSetServices)otherEnd, msgs);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_COUNT:
				if (implementsSetModelCount != null)
					msgs = ((InternalEObject)implementsSetModelCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_COUNT, null, msgs);
				return basicSetImplementsSetModelCount((NUOPCDriverAtmOcn__ImplementsSetModelCount)otherEnd, msgs);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_SERVICES:
				if (implementsSetModelServices != null)
					msgs = ((InternalEObject)implementsSetModelServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_SERVICES, null, msgs);
				return basicSetImplementsSetModelServices((NUOPCDriverAtmOcn__ImplementsSetModelServices)otherEnd, msgs);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_PET_LISTS:
				if (implementsSetModelPetLists != null)
					msgs = ((InternalEObject)implementsSetModelPetLists).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_PET_LISTS, null, msgs);
				return basicSetImplementsSetModelPetLists((NUOPCDriverAtmOcn__ImplementsSetModelPetLists)otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__PARENT:
				return basicSetParent(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__GENERIC_IMPORTS:
				return basicSetGenericImports(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS:
				return basicSetModelImports(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES:
				return basicSetImplementsSetServices(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_COUNT:
				return basicSetImplementsSetModelCount(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_SERVICES:
				return basicSetImplementsSetModelServices(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_PET_LISTS:
				return basicSetImplementsSetModelPetLists(null, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.NUOPC_APPLICATION__NUOPC_DRIVER_ATM_OCN, NUOPCApplication.class, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__PARENT:
				return getParent();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__NAME:
				return getName();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__GENERIC_IMPORTS:
				return getGenericImports();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS:
				return getModelImports();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES:
				return getImplementsSetServices();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_COUNT:
				return getImplementsSetModelCount();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_SERVICES:
				return getImplementsSetModelServices();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_PET_LISTS:
				return getImplementsSetModelPetLists();
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__PARENT:
				setParent((NUOPCApplication)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__GENERIC_IMPORTS:
				setGenericImports((NUOPCDriverAtmOcn__GenericImports)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS:
				setModelImports((NUOPCDriverAtmOcn__ModelImports)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES:
				setImplementsSetServices((NUOPCDriverAtmOcn__ImplementsSetServices)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_COUNT:
				setImplementsSetModelCount((NUOPCDriverAtmOcn__ImplementsSetModelCount)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_SERVICES:
				setImplementsSetModelServices((NUOPCDriverAtmOcn__ImplementsSetModelServices)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_PET_LISTS:
				setImplementsSetModelPetLists((NUOPCDriverAtmOcn__ImplementsSetModelPetLists)newValue);
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__PARENT:
				setParent((NUOPCApplication)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__GENERIC_IMPORTS:
				setGenericImports((NUOPCDriverAtmOcn__GenericImports)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS:
				setModelImports((NUOPCDriverAtmOcn__ModelImports)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES:
				setImplementsSetServices((NUOPCDriverAtmOcn__ImplementsSetServices)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_COUNT:
				setImplementsSetModelCount((NUOPCDriverAtmOcn__ImplementsSetModelCount)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_SERVICES:
				setImplementsSetModelServices((NUOPCDriverAtmOcn__ImplementsSetModelServices)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_PET_LISTS:
				setImplementsSetModelPetLists((NUOPCDriverAtmOcn__ImplementsSetModelPetLists)null);
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__PARENT:
				return getParent() != null;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__GENERIC_IMPORTS:
				return genericImports != null;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__MODEL_IMPORTS:
				return modelImports != null;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES:
				return implementsSetServices != null;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_COUNT:
				return implementsSetModelCount != null;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_SERVICES:
				return implementsSetModelServices != null;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_MODEL_PET_LISTS:
				return implementsSetModelPetLists != null;
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

} //NUOPCDriverAtmOcnImpl
