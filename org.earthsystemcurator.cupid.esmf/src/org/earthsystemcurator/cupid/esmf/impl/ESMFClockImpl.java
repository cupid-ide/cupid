/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFClock;
import org.earthsystemcurator.cupid.esmf.ESMFComponent;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFTime;
import org.earthsystemcurator.cupid.esmf.ESMFTimeInterval;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFClockImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFClockImpl#getStopTime <em>Stop Time</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFClockImpl#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFClockImpl#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFClockImpl extends ESMFNamedEntityImpl implements ESMFClock {
	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected ESMFTime startTime;

	/**
	 * The cached value of the '{@link #getStopTime() <em>Stop Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopTime()
	 * @generated
	 * @ordered
	 */
	protected ESMFTime stopTime;

	/**
	 * The cached value of the '{@link #getTimeStep() <em>Time Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStep()
	 * @generated
	 * @ordered
	 */
	protected ESMFTimeInterval timeStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFClockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_CLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTime getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartTime(ESMFTime newStartTime, NotificationChain msgs) {
		ESMFTime oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_CLOCK__START_TIME, oldStartTime, newStartTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(ESMFTime newStartTime) {
		if (newStartTime != startTime) {
			NotificationChain msgs = null;
			if (startTime != null)
				msgs = ((InternalEObject)startTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESMFPackage.ESMF_CLOCK__START_TIME, null, msgs);
			if (newStartTime != null)
				msgs = ((InternalEObject)newStartTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESMFPackage.ESMF_CLOCK__START_TIME, null, msgs);
			msgs = basicSetStartTime(newStartTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_CLOCK__START_TIME, newStartTime, newStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTime getStopTime() {
		return stopTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopTime(ESMFTime newStopTime, NotificationChain msgs) {
		ESMFTime oldStopTime = stopTime;
		stopTime = newStopTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_CLOCK__STOP_TIME, oldStopTime, newStopTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopTime(ESMFTime newStopTime) {
		if (newStopTime != stopTime) {
			NotificationChain msgs = null;
			if (stopTime != null)
				msgs = ((InternalEObject)stopTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESMFPackage.ESMF_CLOCK__STOP_TIME, null, msgs);
			if (newStopTime != null)
				msgs = ((InternalEObject)newStopTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESMFPackage.ESMF_CLOCK__STOP_TIME, null, msgs);
			msgs = basicSetStopTime(newStopTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_CLOCK__STOP_TIME, newStopTime, newStopTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTimeInterval getTimeStep() {
		return timeStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeStep(ESMFTimeInterval newTimeStep, NotificationChain msgs) {
		ESMFTimeInterval oldTimeStep = timeStep;
		timeStep = newTimeStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_CLOCK__TIME_STEP, oldTimeStep, newTimeStep);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStep(ESMFTimeInterval newTimeStep) {
		if (newTimeStep != timeStep) {
			NotificationChain msgs = null;
			if (timeStep != null)
				msgs = ((InternalEObject)timeStep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESMFPackage.ESMF_CLOCK__TIME_STEP, null, msgs);
			if (newTimeStep != null)
				msgs = ((InternalEObject)newTimeStep).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESMFPackage.ESMF_CLOCK__TIME_STEP, null, msgs);
			msgs = basicSetTimeStep(newTimeStep, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_CLOCK__TIME_STEP, newTimeStep, newTimeStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFComponent getComponent() {
		if (eContainerFeatureID() != ESMFPackage.ESMF_CLOCK__COMPONENT) return null;
		return (ESMFComponent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(ESMFComponent newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponent, ESMFPackage.ESMF_CLOCK__COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(ESMFComponent newComponent) {
		if (newComponent != eInternalContainer() || (eContainerFeatureID() != ESMFPackage.ESMF_CLOCK__COMPONENT && newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, ESMFPackage.ESMF_COMPONENT__CLOCK, ESMFComponent.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_CLOCK__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ESMFPackage.ESMF_CLOCK__COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponent((ESMFComponent)otherEnd, msgs);
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
			case ESMFPackage.ESMF_CLOCK__START_TIME:
				return basicSetStartTime(null, msgs);
			case ESMFPackage.ESMF_CLOCK__STOP_TIME:
				return basicSetStopTime(null, msgs);
			case ESMFPackage.ESMF_CLOCK__TIME_STEP:
				return basicSetTimeStep(null, msgs);
			case ESMFPackage.ESMF_CLOCK__COMPONENT:
				return basicSetComponent(null, msgs);
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
			case ESMFPackage.ESMF_CLOCK__COMPONENT:
				return eInternalContainer().eInverseRemove(this, ESMFPackage.ESMF_COMPONENT__CLOCK, ESMFComponent.class, msgs);
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
			case ESMFPackage.ESMF_CLOCK__START_TIME:
				return getStartTime();
			case ESMFPackage.ESMF_CLOCK__STOP_TIME:
				return getStopTime();
			case ESMFPackage.ESMF_CLOCK__TIME_STEP:
				return getTimeStep();
			case ESMFPackage.ESMF_CLOCK__COMPONENT:
				return getComponent();
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
			case ESMFPackage.ESMF_CLOCK__START_TIME:
				setStartTime((ESMFTime)newValue);
				return;
			case ESMFPackage.ESMF_CLOCK__STOP_TIME:
				setStopTime((ESMFTime)newValue);
				return;
			case ESMFPackage.ESMF_CLOCK__TIME_STEP:
				setTimeStep((ESMFTimeInterval)newValue);
				return;
			case ESMFPackage.ESMF_CLOCK__COMPONENT:
				setComponent((ESMFComponent)newValue);
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
			case ESMFPackage.ESMF_CLOCK__START_TIME:
				setStartTime((ESMFTime)null);
				return;
			case ESMFPackage.ESMF_CLOCK__STOP_TIME:
				setStopTime((ESMFTime)null);
				return;
			case ESMFPackage.ESMF_CLOCK__TIME_STEP:
				setTimeStep((ESMFTimeInterval)null);
				return;
			case ESMFPackage.ESMF_CLOCK__COMPONENT:
				setComponent((ESMFComponent)null);
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
			case ESMFPackage.ESMF_CLOCK__START_TIME:
				return startTime != null;
			case ESMFPackage.ESMF_CLOCK__STOP_TIME:
				return stopTime != null;
			case ESMFPackage.ESMF_CLOCK__TIME_STEP:
				return timeStep != null;
			case ESMFPackage.ESMF_CLOCK__COMPONENT:
				return getComponent() != null;
		}
		return super.eIsSet(featureID);
	}

} //ESMFClockImpl
