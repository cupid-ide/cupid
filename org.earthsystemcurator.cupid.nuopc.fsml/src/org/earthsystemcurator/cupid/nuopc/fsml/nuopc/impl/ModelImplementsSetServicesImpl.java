/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices;
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
 * An implementation of the model object '<em><b>Model Implements Set Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl#isParameters <em>Parameters</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl#getParamName_gcomp <em>Param Name gcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl#getParamName_rc <em>Param Name rc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl#isCallsGenericSetServices <em>Calls Generic Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl#isCallsSetEntryPointPhase1 <em>Calls Set Entry Point Phase1</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl#isCallsSetEntryPointPhase2 <em>Calls Set Entry Point Phase2</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImplementsSetServicesImpl#getAttachesModelAdvance <em>Attaches Model Advance</em>}</li>
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
	 * The cached value of the '{@link #getAttachesModelAdvance() <em>Attaches Model Advance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachesModelAdvance()
	 * @generated
	 * @ordered
	 */
	protected AttachesModelAdvance attachesModelAdvance;

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
	public Model getParent() {
		if (eContainerFeatureID() != NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT) return null;
		return (Model)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Model newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Model newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.MODEL__IMPLEMENTS_SET_SERVICES, Model.class, msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAMETERS, oldParameters, parameters));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_NAME_GCOMP, oldParamName_gcomp, paramName_gcomp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_NAME_RC, oldParamName_rc, paramName_rc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES, oldCallsGenericSetServices, callsGenericSetServices));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE1, oldCallsSetEntryPointPhase1, callsSetEntryPointPhase1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE2, oldCallsSetEntryPointPhase2, callsSetEntryPointPhase2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachesModelAdvance getAttachesModelAdvance() {
		return attachesModelAdvance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttachesModelAdvance(AttachesModelAdvance newAttachesModelAdvance, NotificationChain msgs) {
		AttachesModelAdvance oldAttachesModelAdvance = attachesModelAdvance;
		attachesModelAdvance = newAttachesModelAdvance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_MODEL_ADVANCE, oldAttachesModelAdvance, newAttachesModelAdvance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachesModelAdvance(AttachesModelAdvance newAttachesModelAdvance) {
		if (newAttachesModelAdvance != attachesModelAdvance) {
			NotificationChain msgs = null;
			if (attachesModelAdvance != null)
				msgs = ((InternalEObject)attachesModelAdvance).eInverseRemove(this, NUOPCPackage.ATTACHES_MODEL_ADVANCE__PARENT, AttachesModelAdvance.class, msgs);
			if (newAttachesModelAdvance != null)
				msgs = ((InternalEObject)newAttachesModelAdvance).eInverseAdd(this, NUOPCPackage.ATTACHES_MODEL_ADVANCE__PARENT, AttachesModelAdvance.class, msgs);
			msgs = basicSetAttachesModelAdvance(newAttachesModelAdvance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_MODEL_ADVANCE, newAttachesModelAdvance, newAttachesModelAdvance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((Model)otherEnd, msgs);
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_MODEL_ADVANCE:
				if (attachesModelAdvance != null)
					msgs = ((InternalEObject)attachesModelAdvance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_MODEL_ADVANCE, null, msgs);
				return basicSetAttachesModelAdvance((AttachesModelAdvance)otherEnd, msgs);
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
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_MODEL_ADVANCE:
				return basicSetAttachesModelAdvance(null, msgs);
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
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.MODEL__IMPLEMENTS_SET_SERVICES, Model.class, msgs);
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
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAMETERS:
				return isParameters();
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_NAME_GCOMP:
				return getParamName_gcomp();
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_NAME_RC:
				return getParamName_rc();
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				return isCallsGenericSetServices();
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE1:
				return isCallsSetEntryPointPhase1();
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE2:
				return isCallsSetEntryPointPhase2();
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_MODEL_ADVANCE:
				return getAttachesModelAdvance();
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
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT:
				setParent((Model)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAMETERS:
				setParameters((Boolean)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_NAME_GCOMP:
				setParamName_gcomp((String)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_NAME_RC:
				setParamName_rc((String)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				setCallsGenericSetServices((Boolean)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE1:
				setCallsSetEntryPointPhase1((Boolean)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE2:
				setCallsSetEntryPointPhase2((Boolean)newValue);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_MODEL_ADVANCE:
				setAttachesModelAdvance((AttachesModelAdvance)newValue);
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
				setParent((Model)null);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAMETERS:
				setParameters(PARAMETERS_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_NAME_GCOMP:
				setParamName_gcomp(PARAM_NAME_GCOMP_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_NAME_RC:
				setParamName_rc(PARAM_NAME_RC_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				setCallsGenericSetServices(CALLS_GENERIC_SET_SERVICES_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE1:
				setCallsSetEntryPointPhase1(CALLS_SET_ENTRY_POINT_PHASE1_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE2:
				setCallsSetEntryPointPhase2(CALLS_SET_ENTRY_POINT_PHASE2_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_MODEL_ADVANCE:
				setAttachesModelAdvance((AttachesModelAdvance)null);
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
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAMETERS:
				return parameters != PARAMETERS_EDEFAULT;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_NAME_GCOMP:
				return PARAM_NAME_GCOMP_EDEFAULT == null ? paramName_gcomp != null : !PARAM_NAME_GCOMP_EDEFAULT.equals(paramName_gcomp);
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARAM_NAME_RC:
				return PARAM_NAME_RC_EDEFAULT == null ? paramName_rc != null : !PARAM_NAME_RC_EDEFAULT.equals(paramName_rc);
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_GENERIC_SET_SERVICES:
				return callsGenericSetServices != CALLS_GENERIC_SET_SERVICES_EDEFAULT;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE1:
				return callsSetEntryPointPhase1 != CALLS_SET_ENTRY_POINT_PHASE1_EDEFAULT;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__CALLS_SET_ENTRY_POINT_PHASE2:
				return callsSetEntryPointPhase2 != CALLS_SET_ENTRY_POINT_PHASE2_EDEFAULT;
			case NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_MODEL_ADVANCE:
				return attachesModelAdvance != null;
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

} //ModelImplementsSetServicesImpl
