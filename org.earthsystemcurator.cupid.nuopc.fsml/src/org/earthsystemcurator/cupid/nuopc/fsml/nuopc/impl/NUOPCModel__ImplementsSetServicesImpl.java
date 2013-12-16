/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsGenericSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsSetEntryPoint;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices;
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
 * An implementation of the model object '<em><b>Model Implements Set Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsSetServicesImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsSetServicesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsSetServicesImpl#getGcomp <em>Gcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsSetServicesImpl#getRc <em>Rc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsSetServicesImpl#getCallsGenericSetServices <em>Calls Generic Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsSetServicesImpl#getCallsSetEntryPoint <em>Calls Set Entry Point</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ImplementsSetServicesImpl#getAttachesMethod <em>Attaches Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCModel__ImplementsSetServicesImpl extends EObjectImpl implements NUOPCModel__ImplementsSetServices {
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
	 * The default value of the '{@link #getGcomp() <em>Gcomp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGcomp()
	 * @generated
	 * @ordered
	 */
	protected static final String GCOMP_EDEFAULT = "gcomp";

	/**
	 * The cached value of the '{@link #getGcomp() <em>Gcomp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGcomp()
	 * @generated
	 * @ordered
	 */
	protected String gcomp = GCOMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRc() <em>Rc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRc()
	 * @generated
	 * @ordered
	 */
	protected static final String RC_EDEFAULT = "rc";

	/**
	 * The cached value of the '{@link #getRc() <em>Rc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRc()
	 * @generated
	 * @ordered
	 */
	protected String rc = RC_EDEFAULT;

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
	protected NUOPCModel__ImplementsSetServicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel getParent() {
		if (eContainerFeatureID() != NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARENT) return null;
		return (NUOPCModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(NUOPCModel newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NUOPCModel newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARENT && newParent != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGcomp() {
		return gcomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGcomp(String newGcomp) {
		String oldGcomp = gcomp;
		gcomp = newGcomp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__GCOMP, oldGcomp, gcomp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRc() {
		return rc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRc(String newRc) {
		String oldRc = rc;
		rc = newRc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__RC, oldRc, rc));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES, oldCallsGenericSetServices, newCallsGenericSetServices);
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
				msgs = ((InternalEObject)callsGenericSetServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES, null, msgs);
			if (newCallsGenericSetServices != null)
				msgs = ((InternalEObject)newCallsGenericSetServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES, null, msgs);
			msgs = basicSetCallsGenericSetServices(newCallsGenericSetServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES, newCallsGenericSetServices, newCallsGenericSetServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallsSetEntryPoint> getCallsSetEntryPoint() {
		if (callsSetEntryPoint == null) {
			callsSetEntryPoint = new EObjectContainmentEList<CallsSetEntryPoint>(CallsSetEntryPoint.class, this, NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT);
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
			attachesMethod = new EObjectContainmentEList<AttachesMethod>(AttachesMethod.class, this, NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD);
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
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARENT:
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
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARENT:
				return basicSetParent(null, msgs);
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				return basicSetCallsGenericSetServices(null, msgs);
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT:
				return ((InternalEList<?>)getCallsSetEntryPoint()).basicRemove(otherEnd, msgs);
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD:
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
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARENT:
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
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARENT:
				return getParent();
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__NAME:
				return getName();
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__GCOMP:
				return getGcomp();
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__RC:
				return getRc();
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				return getCallsGenericSetServices();
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT:
				return getCallsSetEntryPoint();
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD:
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
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARENT:
				setParent((NUOPCModel)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__GCOMP:
				setGcomp((String)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__RC:
				setRc((String)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				setCallsGenericSetServices((CallsGenericSetServices)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT:
				getCallsSetEntryPoint().clear();
				getCallsSetEntryPoint().addAll((Collection<? extends CallsSetEntryPoint>)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD:
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
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARENT:
				setParent((NUOPCModel)null);
				return;
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__GCOMP:
				setGcomp(GCOMP_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__RC:
				setRc(RC_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				setCallsGenericSetServices((CallsGenericSetServices)null);
				return;
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT:
				getCallsSetEntryPoint().clear();
				return;
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD:
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
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__PARENT:
				return getParent() != null;
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__GCOMP:
				return GCOMP_EDEFAULT == null ? gcomp != null : !GCOMP_EDEFAULT.equals(gcomp);
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__RC:
				return RC_EDEFAULT == null ? rc != null : !RC_EDEFAULT.equals(rc);
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				return callsGenericSetServices != null;
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT:
				return callsSetEntryPoint != null && !callsSetEntryPoint.isEmpty();
			case NUOPCPackage.NUOPC_MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_METHOD:
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
		result.append(", gcomp: ");
		result.append(gcomp);
		result.append(", rc: ");
		result.append(rc);
		result.append(')');
		return result.toString();
	}

} //NUOPCModel__ImplementsSetServicesImpl
