/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFAction;
import org.earthsystemcurator.cupid.esmf.ESMFClock;
import org.earthsystemcurator.cupid.esmf.ESMFComponent;
import org.earthsystemcurator.cupid.esmf.ESMFMethod;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFState;

import org.earthsystemcurator.cupid.sidl.Method;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl#getImportState <em>Import State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl#getExportState <em>Export State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFMethodImpl#getSIDLMethod <em>SIDL Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFMethodImpl extends ESMFNamedEntityImpl implements ESMFMethod {
	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final int PHASE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected int phase = PHASE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImportState() <em>Import State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportState()
	 * @generated
	 * @ordered
	 */
	protected ESMFState importState;

	/**
	 * The cached value of the '{@link #getExportState() <em>Export State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportState()
	 * @generated
	 * @ordered
	 */
	protected ESMFState exportState;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected ESMFClock clock;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFAction> action;

	/**
	 * The cached value of the '{@link #getSIDLMethod() <em>SIDL Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIDLMethod()
	 * @generated
	 * @ordered
	 */
	protected Method sidlMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFComponent getComponent() {
		if (eContainerFeatureID() != ESMFPackage.ESMF_METHOD__COMPONENT) return null;
		return (ESMFComponent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(ESMFComponent newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponent, ESMFPackage.ESMF_METHOD__COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(ESMFComponent newComponent) {
		if (newComponent != eInternalContainer() || (eContainerFeatureID() != ESMFPackage.ESMF_METHOD__COMPONENT && newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, ESMFPackage.ESMF_COMPONENT__METHOD, ESMFComponent.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_METHOD__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(int newPhase) {
		int oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_METHOD__PHASE, oldPhase, phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState getImportState() {
		return importState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportState(ESMFState newImportState, NotificationChain msgs) {
		ESMFState oldImportState = importState;
		importState = newImportState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_METHOD__IMPORT_STATE, oldImportState, newImportState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportState(ESMFState newImportState) {
		if (newImportState != importState) {
			NotificationChain msgs = null;
			if (importState != null)
				msgs = ((InternalEObject)importState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESMFPackage.ESMF_METHOD__IMPORT_STATE, null, msgs);
			if (newImportState != null)
				msgs = ((InternalEObject)newImportState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESMFPackage.ESMF_METHOD__IMPORT_STATE, null, msgs);
			msgs = basicSetImportState(newImportState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_METHOD__IMPORT_STATE, newImportState, newImportState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState getExportState() {
		return exportState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExportState(ESMFState newExportState, NotificationChain msgs) {
		ESMFState oldExportState = exportState;
		exportState = newExportState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_METHOD__EXPORT_STATE, oldExportState, newExportState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportState(ESMFState newExportState) {
		if (newExportState != exportState) {
			NotificationChain msgs = null;
			if (exportState != null)
				msgs = ((InternalEObject)exportState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESMFPackage.ESMF_METHOD__EXPORT_STATE, null, msgs);
			if (newExportState != null)
				msgs = ((InternalEObject)newExportState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESMFPackage.ESMF_METHOD__EXPORT_STATE, null, msgs);
			msgs = basicSetExportState(newExportState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_METHOD__EXPORT_STATE, newExportState, newExportState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFClock getClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClock(ESMFClock newClock, NotificationChain msgs) {
		ESMFClock oldClock = clock;
		clock = newClock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_METHOD__CLOCK, oldClock, newClock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(ESMFClock newClock) {
		if (newClock != clock) {
			NotificationChain msgs = null;
			if (clock != null)
				msgs = ((InternalEObject)clock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESMFPackage.ESMF_METHOD__CLOCK, null, msgs);
			if (newClock != null)
				msgs = ((InternalEObject)newClock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESMFPackage.ESMF_METHOD__CLOCK, null, msgs);
			msgs = basicSetClock(newClock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_METHOD__CLOCK, newClock, newClock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFAction> getAction() {
		if (action == null) {
			action = new EObjectContainmentWithInverseEList<ESMFAction>(ESMFAction.class, this, ESMFPackage.ESMF_METHOD__ACTION, ESMFPackage.ESMF_ACTION__CONTEXT);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getSIDLMethod() {
		if (sidlMethod != null && sidlMethod.eIsProxy()) {
			InternalEObject oldSIDLMethod = (InternalEObject)sidlMethod;
			sidlMethod = (Method)eResolveProxy(oldSIDLMethod);
			if (sidlMethod != oldSIDLMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_METHOD__SIDL_METHOD, oldSIDLMethod, sidlMethod));
			}
		}
		return sidlMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetSIDLMethod() {
		return sidlMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSIDLMethod(Method newSIDLMethod) {
		Method oldSIDLMethod = sidlMethod;
		sidlMethod = newSIDLMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_METHOD__SIDL_METHOD, oldSIDLMethod, sidlMethod));
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
			case ESMFPackage.ESMF_METHOD__COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponent((ESMFComponent)otherEnd, msgs);
			case ESMFPackage.ESMF_METHOD__ACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAction()).basicAdd(otherEnd, msgs);
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
			case ESMFPackage.ESMF_METHOD__COMPONENT:
				return basicSetComponent(null, msgs);
			case ESMFPackage.ESMF_METHOD__IMPORT_STATE:
				return basicSetImportState(null, msgs);
			case ESMFPackage.ESMF_METHOD__EXPORT_STATE:
				return basicSetExportState(null, msgs);
			case ESMFPackage.ESMF_METHOD__CLOCK:
				return basicSetClock(null, msgs);
			case ESMFPackage.ESMF_METHOD__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
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
			case ESMFPackage.ESMF_METHOD__COMPONENT:
				return eInternalContainer().eInverseRemove(this, ESMFPackage.ESMF_COMPONENT__METHOD, ESMFComponent.class, msgs);
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
			case ESMFPackage.ESMF_METHOD__COMPONENT:
				return getComponent();
			case ESMFPackage.ESMF_METHOD__PHASE:
				return getPhase();
			case ESMFPackage.ESMF_METHOD__IMPORT_STATE:
				return getImportState();
			case ESMFPackage.ESMF_METHOD__EXPORT_STATE:
				return getExportState();
			case ESMFPackage.ESMF_METHOD__CLOCK:
				return getClock();
			case ESMFPackage.ESMF_METHOD__ACTION:
				return getAction();
			case ESMFPackage.ESMF_METHOD__SIDL_METHOD:
				if (resolve) return getSIDLMethod();
				return basicGetSIDLMethod();
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
			case ESMFPackage.ESMF_METHOD__COMPONENT:
				setComponent((ESMFComponent)newValue);
				return;
			case ESMFPackage.ESMF_METHOD__PHASE:
				setPhase((Integer)newValue);
				return;
			case ESMFPackage.ESMF_METHOD__IMPORT_STATE:
				setImportState((ESMFState)newValue);
				return;
			case ESMFPackage.ESMF_METHOD__EXPORT_STATE:
				setExportState((ESMFState)newValue);
				return;
			case ESMFPackage.ESMF_METHOD__CLOCK:
				setClock((ESMFClock)newValue);
				return;
			case ESMFPackage.ESMF_METHOD__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends ESMFAction>)newValue);
				return;
			case ESMFPackage.ESMF_METHOD__SIDL_METHOD:
				setSIDLMethod((Method)newValue);
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
			case ESMFPackage.ESMF_METHOD__COMPONENT:
				setComponent((ESMFComponent)null);
				return;
			case ESMFPackage.ESMF_METHOD__PHASE:
				setPhase(PHASE_EDEFAULT);
				return;
			case ESMFPackage.ESMF_METHOD__IMPORT_STATE:
				setImportState((ESMFState)null);
				return;
			case ESMFPackage.ESMF_METHOD__EXPORT_STATE:
				setExportState((ESMFState)null);
				return;
			case ESMFPackage.ESMF_METHOD__CLOCK:
				setClock((ESMFClock)null);
				return;
			case ESMFPackage.ESMF_METHOD__ACTION:
				getAction().clear();
				return;
			case ESMFPackage.ESMF_METHOD__SIDL_METHOD:
				setSIDLMethod((Method)null);
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
			case ESMFPackage.ESMF_METHOD__COMPONENT:
				return getComponent() != null;
			case ESMFPackage.ESMF_METHOD__PHASE:
				return phase != PHASE_EDEFAULT;
			case ESMFPackage.ESMF_METHOD__IMPORT_STATE:
				return importState != null;
			case ESMFPackage.ESMF_METHOD__EXPORT_STATE:
				return exportState != null;
			case ESMFPackage.ESMF_METHOD__CLOCK:
				return clock != null;
			case ESMFPackage.ESMF_METHOD__ACTION:
				return action != null && !action.isEmpty();
			case ESMFPackage.ESMF_METHOD__SIDL_METHOD:
				return sidlMethod != null;
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
		result.append(" (phase: ");
		result.append(phase);
		result.append(')');
		return result.toString();
	}

} //ESMFMethodImpl
