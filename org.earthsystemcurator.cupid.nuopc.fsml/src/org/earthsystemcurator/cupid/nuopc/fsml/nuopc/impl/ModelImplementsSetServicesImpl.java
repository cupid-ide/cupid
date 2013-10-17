/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsGenericSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsSetEntryPoint;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel;
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
 * An implementation of the model object '<em><b>Model Implements Set Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl#getParam_gcomp <em>Param gcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl#getParam_rc <em>Param rc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl#getCallsGenericSetServices <em>Calls Generic Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl#getCallsSetEntryPoint <em>Calls Set Entry Point</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl#getAttachesMethod <em>Attaches Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImplementsSetServicesImpl extends EObjectImpl implements ModelImplementsSetServices {
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
	 * The cached value of the '{@link #getCallsSetEntryPoint() <em>Calls Set Entry Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallsSetEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<CallsSetEntryPoint> callsSetEntryPoint;

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
	protected ModelImplementsSetServicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.MODEL_IMPLEMENTS_SET_SERVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel getParent() {
		if (eContainerFeatureID() != NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT) return null;
		return (NUOPCModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(NUOPCModel newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NUOPCModel newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_SET_SERVICES, NUOPCModel.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP, oldParam_gcomp, param_gcomp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_RC, oldParam_rc, param_rc));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES, oldCallsGenericSetServices, newCallsGenericSetServices);
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
				msgs = ((InternalEObject)callsGenericSetServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES, null, msgs);
			if (newCallsGenericSetServices != null)
				msgs = ((InternalEObject)newCallsGenericSetServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES, null, msgs);
			msgs = basicSetCallsGenericSetServices(newCallsGenericSetServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES, newCallsGenericSetServices, newCallsGenericSetServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallsSetEntryPoint> getCallsSetEntryPoint() {
		if (callsSetEntryPoint == null) {
			callsSetEntryPoint = new EObjectContainmentEList<CallsSetEntryPoint>(CallsSetEntryPoint.class, this, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT);
		}
		return callsSetEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttachesMethod> getAttachesMethod() {
		if (attachesMethod == null) {
			attachesMethod = new EObjectContainmentEList<AttachesMethod>(AttachesMethod.class, this, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD);
		}
		return attachesMethod;
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
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((NUOPCModel)otherEnd, msgs);
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
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT:
				return basicSetParent(null, msgs);
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				return basicSetCallsGenericSetServices(null, msgs);
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT:
				return ((InternalEList<?>)getCallsSetEntryPoint()).basicRemove(otherEnd, msgs);
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD:
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
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_SET_SERVICES, NUOPCModel.class, msgs);
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
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT:
				return getParent();
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__NAME:
				return getName();
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP:
				return getParam_gcomp();
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_RC:
				return getParam_rc();
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				return getCallsGenericSetServices();
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT:
				return getCallsSetEntryPoint();
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD:
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
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT:
				setParent((NUOPCModel)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP:
				setParam_gcomp((String)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_RC:
				setParam_rc((String)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				setCallsGenericSetServices((CallsGenericSetServices)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT:
				getCallsSetEntryPoint().clear();
				getCallsSetEntryPoint().addAll((Collection<? extends CallsSetEntryPoint>)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD:
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
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT:
				setParent((NUOPCModel)null);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP:
				setParam_gcomp(PARAM_GCOMP_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_RC:
				setParam_rc(PARAM_RC_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				setCallsGenericSetServices((CallsGenericSetServices)null);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT:
				getCallsSetEntryPoint().clear();
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD:
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
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT:
				return getParent() != null;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_GCOMP:
				return PARAM_GCOMP_EDEFAULT == null ? param_gcomp != null : !PARAM_GCOMP_EDEFAULT.equals(param_gcomp);
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_RC:
				return PARAM_RC_EDEFAULT == null ? param_rc != null : !PARAM_RC_EDEFAULT.equals(param_rc);
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				return callsGenericSetServices != null;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT:
				return callsSetEntryPoint != null && !callsSetEntryPoint.isEmpty();
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD:
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

} //ModelImplementsSetServicesImpl
