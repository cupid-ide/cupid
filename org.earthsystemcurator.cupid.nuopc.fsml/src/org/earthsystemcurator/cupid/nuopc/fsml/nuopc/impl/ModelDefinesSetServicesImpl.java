/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Defines Set Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelDefinesSetServicesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelDefinesSetServicesImpl#isParameters <em>Parameters</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelDefinesSetServicesImpl#getParamName_gcomp <em>Param Name gcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelDefinesSetServicesImpl#getParamName_rc <em>Param Name rc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelDefinesSetServicesImpl#isCallsGenericSetServices <em>Calls Generic Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelDefinesSetServicesImpl#isCallsSetEntryPointPhase1 <em>Calls Set Entry Point Phase1</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelDefinesSetServicesImpl#isCallsSetEntryPointPhase2 <em>Calls Set Entry Point Phase2</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelDefinesSetServicesImpl#getAttachesMethod <em>Attaches Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelDefinesSetServicesImpl extends EObjectImpl implements ModelDefinesSetServices {
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
	 * The default value of the '{@link #isParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParameters()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PARAMETERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isParameters() <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isParameters()
	 * @generated
	 * @ordered
	 */
	protected boolean parameters = PARAMETERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getParamName_gcomp() <em>Param Name gcomp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamName_gcomp()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_NAME_GCOMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParamName_gcomp() <em>Param Name gcomp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamName_gcomp()
	 * @generated
	 * @ordered
	 */
	protected String paramName_gcomp = PARAM_NAME_GCOMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getParamName_rc() <em>Param Name rc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamName_rc()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_NAME_RC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParamName_rc() <em>Param Name rc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamName_rc()
	 * @generated
	 * @ordered
	 */
	protected String paramName_rc = PARAM_NAME_RC_EDEFAULT;

	/**
	 * The default value of the '{@link #isCallsGenericSetServices() <em>Calls Generic Set Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallsGenericSetServices()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALLS_GENERIC_SET_SERVICES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCallsGenericSetServices() <em>Calls Generic Set Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallsGenericSetServices()
	 * @generated
	 * @ordered
	 */
	protected boolean callsGenericSetServices = CALLS_GENERIC_SET_SERVICES_EDEFAULT;

	/**
	 * The default value of the '{@link #isCallsSetEntryPointPhase1() <em>Calls Set Entry Point Phase1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallsSetEntryPointPhase1()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALLS_SET_ENTRY_POINT_PHASE1_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCallsSetEntryPointPhase1() <em>Calls Set Entry Point Phase1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallsSetEntryPointPhase1()
	 * @generated
	 * @ordered
	 */
	protected boolean callsSetEntryPointPhase1 = CALLS_SET_ENTRY_POINT_PHASE1_EDEFAULT;

	/**
	 * The default value of the '{@link #isCallsSetEntryPointPhase2() <em>Calls Set Entry Point Phase2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallsSetEntryPointPhase2()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CALLS_SET_ENTRY_POINT_PHASE2_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCallsSetEntryPointPhase2() <em>Calls Set Entry Point Phase2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCallsSetEntryPointPhase2()
	 * @generated
	 * @ordered
	 */
	protected boolean callsSetEntryPointPhase2 = CALLS_SET_ENTRY_POINT_PHASE2_EDEFAULT;

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
	protected ModelDefinesSetServicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.MODEL_DEFINES_SET_SERVICES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_DEFINES_SET_SERVICES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(boolean newParameters) {
		boolean oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_DEFINES_SET_SERVICES__PARAMETERS, oldParameters, parameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParamName_gcomp() {
		return paramName_gcomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamName_gcomp(String newParamName_gcomp) {
		String oldParamName_gcomp = paramName_gcomp;
		paramName_gcomp = newParamName_gcomp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_DEFINES_SET_SERVICES__PARAM_NAME_GCOMP, oldParamName_gcomp, paramName_gcomp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParamName_rc() {
		return paramName_rc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParamName_rc(String newParamName_rc) {
		String oldParamName_rc = paramName_rc;
		paramName_rc = newParamName_rc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_DEFINES_SET_SERVICES__PARAM_NAME_RC, oldParamName_rc, paramName_rc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCallsGenericSetServices() {
		return callsGenericSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallsGenericSetServices(boolean newCallsGenericSetServices) {
		boolean oldCallsGenericSetServices = callsGenericSetServices;
		callsGenericSetServices = newCallsGenericSetServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_DEFINES_SET_SERVICES__CALLS_GENERIC_SET_SERVICES, oldCallsGenericSetServices, callsGenericSetServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCallsSetEntryPointPhase1() {
		return callsSetEntryPointPhase1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallsSetEntryPointPhase1(boolean newCallsSetEntryPointPhase1) {
		boolean oldCallsSetEntryPointPhase1 = callsSetEntryPointPhase1;
		callsSetEntryPointPhase1 = newCallsSetEntryPointPhase1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_DEFINES_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE1, oldCallsSetEntryPointPhase1, callsSetEntryPointPhase1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCallsSetEntryPointPhase2() {
		return callsSetEntryPointPhase2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallsSetEntryPointPhase2(boolean newCallsSetEntryPointPhase2) {
		boolean oldCallsSetEntryPointPhase2 = callsSetEntryPointPhase2;
		callsSetEntryPointPhase2 = newCallsSetEntryPointPhase2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_DEFINES_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE2, oldCallsSetEntryPointPhase2, callsSetEntryPointPhase2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttachesMethod> getAttachesMethod() {
		if (attachesMethod == null) {
			attachesMethod = new EObjectContainmentEList<AttachesMethod>(AttachesMethod.class, this, NUOPCPackage.MODEL_DEFINES_SET_SERVICES__ATTACHES_METHOD);
		}
		return attachesMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int score() {
		int s = 0;
		if (isCallsGenericSetServices()) s += 3;
		if (isParameters()) s += 2;
		if (isCallsSetEntryPointPhase1()) s += 1;
		if (isCallsSetEntryPointPhase2()) s += 1;
		if (getName().toLowerCase().contains("setservices")) s += 3;		
		return s;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__ATTACHES_METHOD:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__NAME:
				return getName();
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__PARAMETERS:
				return isParameters();
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__PARAM_NAME_GCOMP:
				return getParamName_gcomp();
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__PARAM_NAME_RC:
				return getParamName_rc();
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				return isCallsGenericSetServices();
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE1:
				return isCallsSetEntryPointPhase1();
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE2:
				return isCallsSetEntryPointPhase2();
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__ATTACHES_METHOD:
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
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__PARAMETERS:
				setParameters((Boolean)newValue);
				return;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__PARAM_NAME_GCOMP:
				setParamName_gcomp((String)newValue);
				return;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__PARAM_NAME_RC:
				setParamName_rc((String)newValue);
				return;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				setCallsGenericSetServices((Boolean)newValue);
				return;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE1:
				setCallsSetEntryPointPhase1((Boolean)newValue);
				return;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE2:
				setCallsSetEntryPointPhase2((Boolean)newValue);
				return;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__ATTACHES_METHOD:
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
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__PARAMETERS:
				setParameters(PARAMETERS_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__PARAM_NAME_GCOMP:
				setParamName_gcomp(PARAM_NAME_GCOMP_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__PARAM_NAME_RC:
				setParamName_rc(PARAM_NAME_RC_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				setCallsGenericSetServices(CALLS_GENERIC_SET_SERVICES_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE1:
				setCallsSetEntryPointPhase1(CALLS_SET_ENTRY_POINT_PHASE1_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE2:
				setCallsSetEntryPointPhase2(CALLS_SET_ENTRY_POINT_PHASE2_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__ATTACHES_METHOD:
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
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__PARAMETERS:
				return parameters != PARAMETERS_EDEFAULT;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__PARAM_NAME_GCOMP:
				return PARAM_NAME_GCOMP_EDEFAULT == null ? paramName_gcomp != null : !PARAM_NAME_GCOMP_EDEFAULT.equals(paramName_gcomp);
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__PARAM_NAME_RC:
				return PARAM_NAME_RC_EDEFAULT == null ? paramName_rc != null : !PARAM_NAME_RC_EDEFAULT.equals(paramName_rc);
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				return callsGenericSetServices != CALLS_GENERIC_SET_SERVICES_EDEFAULT;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE1:
				return callsSetEntryPointPhase1 != CALLS_SET_ENTRY_POINT_PHASE1_EDEFAULT;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE2:
				return callsSetEntryPointPhase2 != CALLS_SET_ENTRY_POINT_PHASE2_EDEFAULT;
			case NUOPCPackage.MODEL_DEFINES_SET_SERVICES__ATTACHES_METHOD:
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
		result.append(", parameters: ");
		result.append(parameters);
		result.append(", paramName_gcomp: ");
		result.append(paramName_gcomp);
		result.append(", paramName_rc: ");
		result.append(paramName_rc);
		result.append(", callsGenericSetServices: ");
		result.append(callsGenericSetServices);
		result.append(", callsSetEntryPointPhase1: ");
		result.append(callsSetEntryPointPhase1);
		result.append(", callsSetEntryPointPhase2: ");
		result.append(callsSetEntryPointPhase2);
		result.append(')');
		return result.toString();
	}

} //ModelDefinesSetServicesImpl
