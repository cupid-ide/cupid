/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__GenericImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__Init;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ModelAdvance;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediatorImpl#getGenericImports <em>Generic Imports</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediatorImpl#getImplementsSetServices <em>Implements Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediatorImpl#getInitialize <em>Initialize</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediatorImpl#getImplementsModelAdvance <em>Implements Model Advance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCMediatorImpl extends EObjectImpl implements NUOPCMediator {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Model";

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
	protected NUOPCMediator__GenericImports genericImports;

	/**
	 * The cached value of the '{@link #getImplementsSetServices() <em>Implements Set Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsSetServices()
	 * @generated
	 * @ordered
	 */
	protected NUOPCMediator__ImplementsSetServices implementsSetServices;

	/**
	 * The cached value of the '{@link #getInitialize() <em>Initialize</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialize()
	 * @generated
	 * @ordered
	 */
	protected NUOPCMediator__Init initialize;

	/**
	 * The cached value of the '{@link #getImplementsModelAdvance() <em>Implements Model Advance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsModelAdvance()
	 * @generated
	 * @ordered
	 */
	protected EList<NUOPCMediator__ModelAdvance> implementsModelAdvance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCMediatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_MEDIATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MEDIATOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator__GenericImports getGenericImports() {
		return genericImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericImports(NUOPCMediator__GenericImports newGenericImports, NotificationChain msgs) {
		NUOPCMediator__GenericImports oldGenericImports = genericImports;
		genericImports = newGenericImports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MEDIATOR__GENERIC_IMPORTS, oldGenericImports, newGenericImports);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericImports(NUOPCMediator__GenericImports newGenericImports) {
		if (newGenericImports != genericImports) {
			NotificationChain msgs = null;
			if (genericImports != null)
				msgs = ((InternalEObject)genericImports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MEDIATOR__GENERIC_IMPORTS, null, msgs);
			if (newGenericImports != null)
				msgs = ((InternalEObject)newGenericImports).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MEDIATOR__GENERIC_IMPORTS, null, msgs);
			msgs = basicSetGenericImports(newGenericImports, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MEDIATOR__GENERIC_IMPORTS, newGenericImports, newGenericImports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator__ImplementsSetServices getImplementsSetServices() {
		return implementsSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementsSetServices(NUOPCMediator__ImplementsSetServices newImplementsSetServices, NotificationChain msgs) {
		NUOPCMediator__ImplementsSetServices oldImplementsSetServices = implementsSetServices;
		implementsSetServices = newImplementsSetServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MEDIATOR__IMPLEMENTS_SET_SERVICES, oldImplementsSetServices, newImplementsSetServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsSetServices(NUOPCMediator__ImplementsSetServices newImplementsSetServices) {
		if (newImplementsSetServices != implementsSetServices) {
			NotificationChain msgs = null;
			if (implementsSetServices != null)
				msgs = ((InternalEObject)implementsSetServices).eInverseRemove(this, NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__PARENT, NUOPCMediator__ImplementsSetServices.class, msgs);
			if (newImplementsSetServices != null)
				msgs = ((InternalEObject)newImplementsSetServices).eInverseAdd(this, NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_SET_SERVICES__PARENT, NUOPCMediator__ImplementsSetServices.class, msgs);
			msgs = basicSetImplementsSetServices(newImplementsSetServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MEDIATOR__IMPLEMENTS_SET_SERVICES, newImplementsSetServices, newImplementsSetServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator__Init getInitialize() {
		return initialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialize(NUOPCMediator__Init newInitialize, NotificationChain msgs) {
		NUOPCMediator__Init oldInitialize = initialize;
		initialize = newInitialize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MEDIATOR__INITIALIZE, oldInitialize, newInitialize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialize(NUOPCMediator__Init newInitialize) {
		if (newInitialize != initialize) {
			NotificationChain msgs = null;
			if (initialize != null)
				msgs = ((InternalEObject)initialize).eInverseRemove(this, NUOPCPackage.NUOPC_MEDIATOR_INIT__PARENT, NUOPCMediator__Init.class, msgs);
			if (newInitialize != null)
				msgs = ((InternalEObject)newInitialize).eInverseAdd(this, NUOPCPackage.NUOPC_MEDIATOR_INIT__PARENT, NUOPCMediator__Init.class, msgs);
			msgs = basicSetInitialize(newInitialize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MEDIATOR__INITIALIZE, newInitialize, newInitialize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NUOPCMediator__ModelAdvance> getImplementsModelAdvance() {
		if (implementsModelAdvance == null) {
			implementsModelAdvance = new EObjectContainmentWithInverseEList<NUOPCMediator__ModelAdvance>(NUOPCMediator__ModelAdvance.class, this, NUOPCPackage.NUOPC_MEDIATOR__IMPLEMENTS_MODEL_ADVANCE, NUOPCPackage.NUOPC_MEDIATOR_MODEL_ADVANCE__PARENT);
		}
		return implementsModelAdvance;
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
			case NUOPCPackage.NUOPC_MEDIATOR__IMPLEMENTS_SET_SERVICES:
				if (implementsSetServices != null)
					msgs = ((InternalEObject)implementsSetServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MEDIATOR__IMPLEMENTS_SET_SERVICES, null, msgs);
				return basicSetImplementsSetServices((NUOPCMediator__ImplementsSetServices)otherEnd, msgs);
			case NUOPCPackage.NUOPC_MEDIATOR__INITIALIZE:
				if (initialize != null)
					msgs = ((InternalEObject)initialize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MEDIATOR__INITIALIZE, null, msgs);
				return basicSetInitialize((NUOPCMediator__Init)otherEnd, msgs);
			case NUOPCPackage.NUOPC_MEDIATOR__IMPLEMENTS_MODEL_ADVANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementsModelAdvance()).basicAdd(otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_MEDIATOR__GENERIC_IMPORTS:
				return basicSetGenericImports(null, msgs);
			case NUOPCPackage.NUOPC_MEDIATOR__IMPLEMENTS_SET_SERVICES:
				return basicSetImplementsSetServices(null, msgs);
			case NUOPCPackage.NUOPC_MEDIATOR__INITIALIZE:
				return basicSetInitialize(null, msgs);
			case NUOPCPackage.NUOPC_MEDIATOR__IMPLEMENTS_MODEL_ADVANCE:
				return ((InternalEList<?>)getImplementsModelAdvance()).basicRemove(otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_MEDIATOR__NAME:
				return getName();
			case NUOPCPackage.NUOPC_MEDIATOR__GENERIC_IMPORTS:
				return getGenericImports();
			case NUOPCPackage.NUOPC_MEDIATOR__IMPLEMENTS_SET_SERVICES:
				return getImplementsSetServices();
			case NUOPCPackage.NUOPC_MEDIATOR__INITIALIZE:
				return getInitialize();
			case NUOPCPackage.NUOPC_MEDIATOR__IMPLEMENTS_MODEL_ADVANCE:
				return getImplementsModelAdvance();
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
			case NUOPCPackage.NUOPC_MEDIATOR__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR__GENERIC_IMPORTS:
				setGenericImports((NUOPCMediator__GenericImports)newValue);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR__IMPLEMENTS_SET_SERVICES:
				setImplementsSetServices((NUOPCMediator__ImplementsSetServices)newValue);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR__INITIALIZE:
				setInitialize((NUOPCMediator__Init)newValue);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR__IMPLEMENTS_MODEL_ADVANCE:
				getImplementsModelAdvance().clear();
				getImplementsModelAdvance().addAll((Collection<? extends NUOPCMediator__ModelAdvance>)newValue);
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
			case NUOPCPackage.NUOPC_MEDIATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR__GENERIC_IMPORTS:
				setGenericImports((NUOPCMediator__GenericImports)null);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR__IMPLEMENTS_SET_SERVICES:
				setImplementsSetServices((NUOPCMediator__ImplementsSetServices)null);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR__INITIALIZE:
				setInitialize((NUOPCMediator__Init)null);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR__IMPLEMENTS_MODEL_ADVANCE:
				getImplementsModelAdvance().clear();
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
			case NUOPCPackage.NUOPC_MEDIATOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.NUOPC_MEDIATOR__GENERIC_IMPORTS:
				return genericImports != null;
			case NUOPCPackage.NUOPC_MEDIATOR__IMPLEMENTS_SET_SERVICES:
				return implementsSetServices != null;
			case NUOPCPackage.NUOPC_MEDIATOR__INITIALIZE:
				return initialize != null;
			case NUOPCPackage.NUOPC_MEDIATOR__IMPLEMENTS_MODEL_ADVANCE:
				return implementsModelAdvance != null && !implementsModelAdvance.isEmpty();
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

} //NUOPCMediatorImpl
