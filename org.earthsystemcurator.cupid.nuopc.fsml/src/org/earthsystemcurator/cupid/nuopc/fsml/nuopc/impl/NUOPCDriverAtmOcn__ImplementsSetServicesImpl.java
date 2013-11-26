/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsGenericSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Driver Atm Ocn Implements Set Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetServicesImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetServicesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetServicesImpl#getParam_gcomp <em>Param gcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetServicesImpl#getParam_rc <em>Param rc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetServicesImpl#getCallsGenericSetServices <em>Calls Generic Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCDriverAtmOcn__ImplementsSetServicesImpl#getAttachesMethod <em>Attaches Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCDriverAtmOcn__ImplementsSetServicesImpl extends EObjectImpl implements NUOPCDriverAtmOcn__ImplementsSetServices {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "SetServices";

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
	 * The default value of the '{@link #getParam_gcomp() <em>Param gcomp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam_gcomp()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_GCOMP_EDEFAULT = "gcomp";

	/**
	 * The cached value of the '{@link #getParam_gcomp() <em>Param gcomp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam_gcomp()
	 * @generated
	 * @ordered
	 */
	protected String param_gcomp = PARAM_GCOMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getParam_rc() <em>Param rc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam_rc()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_RC_EDEFAULT = "rc";

	/**
	 * The cached value of the '{@link #getParam_rc() <em>Param rc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam_rc()
	 * @generated
	 * @ordered
	 */
	protected String param_rc = PARAM_RC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCallsGenericSetServices() <em>Calls Generic Set Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsGenericSetServices()
	 * @generated
	 * @ordered
	 */
	protected CallsGenericSetServices callsGenericSetServices;

	/**
	 * The cached value of the '{@link #getAttachesMethod() <em>Attaches Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachesMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<AttachesMethod> attachesMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCDriverAtmOcn__ImplementsSetServicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCDriverAtmOcn getParent() {
		if (eContainerFeatureID() != NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT) return null;
		return (NUOPCDriverAtmOcn)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(NUOPCDriverAtmOcn newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NUOPCDriverAtmOcn newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES, NUOPCDriverAtmOcn.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParam_gcomp() {
		return param_gcomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam_gcomp(String newParam_gcomp) {
		String oldParam_gcomp = param_gcomp;
		param_gcomp = newParam_gcomp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP, oldParam_gcomp, param_gcomp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParam_rc() {
		return param_rc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam_rc(String newParam_rc) {
		String oldParam_rc = param_rc;
		param_rc = newParam_rc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_RC, oldParam_rc, param_rc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallsGenericSetServices getCallsGenericSetServices() {
		return callsGenericSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallsGenericSetServices(CallsGenericSetServices newCallsGenericSetServices, NotificationChain msgs) {
		CallsGenericSetServices oldCallsGenericSetServices = callsGenericSetServices;
		callsGenericSetServices = newCallsGenericSetServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES, oldCallsGenericSetServices, newCallsGenericSetServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallsGenericSetServices(CallsGenericSetServices newCallsGenericSetServices) {
		if (newCallsGenericSetServices != callsGenericSetServices) {
			NotificationChain msgs = null;
			if (callsGenericSetServices != null)
				msgs = ((InternalEObject)callsGenericSetServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES, null, msgs);
			if (newCallsGenericSetServices != null)
				msgs = ((InternalEObject)newCallsGenericSetServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES, null, msgs);
			msgs = basicSetCallsGenericSetServices(newCallsGenericSetServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES, newCallsGenericSetServices, newCallsGenericSetServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttachesMethod> getAttachesMethod() {
		if (attachesMethod == null) {
			attachesMethod = new EObjectContainmentEList<AttachesMethod>(AttachesMethod.class, this, NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD);
		}
		return attachesMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((NUOPCDriverAtmOcn)otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT:
				return basicSetParent(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				return basicSetCallsGenericSetServices(null, msgs);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD:
				return ((InternalEList<?>)getAttachesMethod()).basicRemove(otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.NUOPC_DRIVER_ATM_OCN__IMPLEMENTS_SET_SERVICES, NUOPCDriverAtmOcn.class, msgs);
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT:
				return getParent();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__NAME:
				return getName();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP:
				return getParam_gcomp();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_RC:
				return getParam_rc();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				return getCallsGenericSetServices();
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD:
				return getAttachesMethod();
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT:
				setParent((NUOPCDriverAtmOcn)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP:
				setParam_gcomp((String)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_RC:
				setParam_rc((String)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				setCallsGenericSetServices((CallsGenericSetServices)newValue);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD:
				getAttachesMethod().clear();
				getAttachesMethod().addAll((Collection<? extends AttachesMethod>)newValue);
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT:
				setParent((NUOPCDriverAtmOcn)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP:
				setParam_gcomp(PARAM_GCOMP_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_RC:
				setParam_rc(PARAM_RC_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				setCallsGenericSetServices((CallsGenericSetServices)null);
				return;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD:
				getAttachesMethod().clear();
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
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARENT:
				return getParent() != null;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP:
				return PARAM_GCOMP_EDEFAULT == null ? param_gcomp != null : !PARAM_GCOMP_EDEFAULT.equals(param_gcomp);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__PARAM_RC:
				return PARAM_RC_EDEFAULT == null ? param_rc != null : !PARAM_RC_EDEFAULT.equals(param_rc);
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				return callsGenericSetServices != null;
			case NUOPCPackage.NUOPC_DRIVER_ATM_OCN_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD:
				return attachesMethod != null && !attachesMethod.isEmpty();
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
		result.append(", param_gcomp: ");
		result.append(param_gcomp);
		result.append(", param_rc: ");
		result.append(param_rc);
		result.append(')');
		return result.toString();
	}

} //NUOPCDriverAtmOcn__ImplementsSetServicesImpl
