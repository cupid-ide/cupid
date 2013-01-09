/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionClockCreate;
import org.earthsystemcurator.cupid.esmf.ESMFClock;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFTime;
import org.earthsystemcurator.cupid.esmf.ESMFTimeInterval;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Clock Create</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockCreateImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockCreateImpl#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockCreateImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockCreateImpl#getStopTime <em>Stop Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionClockCreateImpl extends ESMFActionAPIImpl implements ESMFActionClockCreate {
	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected ESMFClock clock;

	/**
	 * The cached value of the '{@link #getTimeStep() <em>Time Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeStep()
	 * @generated
	 * @ordered
	 */
	protected ESMFTimeInterval timeStep;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected ESMFTime startTime;

	/**
	 * The cached value of the '{@link #getStopTime() <em>Stop Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopTime()
	 * @generated
	 * @ordered
	 */
	protected ESMFTime stopTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionClockCreateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_CLOCK_CREATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFClock getClock() {
		if (clock != null && clock.eIsProxy()) {
			InternalEObject oldClock = (InternalEObject)clock;
			clock = (ESMFClock)eResolveProxy(oldClock);
			if (clock != oldClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_CLOCK_CREATE__CLOCK, oldClock, clock));
			}
		}
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFClock basicGetClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(ESMFClock newClock) {
		ESMFClock oldClock = clock;
		clock = newClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_CLOCK_CREATE__CLOCK, oldClock, clock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTimeInterval getTimeStep() {
		if (timeStep != null && timeStep.eIsProxy()) {
			InternalEObject oldTimeStep = (InternalEObject)timeStep;
			timeStep = (ESMFTimeInterval)eResolveProxy(oldTimeStep);
			if (timeStep != oldTimeStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_CLOCK_CREATE__TIME_STEP, oldTimeStep, timeStep));
			}
		}
		return timeStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTimeInterval basicGetTimeStep() {
		return timeStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeStep(ESMFTimeInterval newTimeStep) {
		ESMFTimeInterval oldTimeStep = timeStep;
		timeStep = newTimeStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_CLOCK_CREATE__TIME_STEP, oldTimeStep, timeStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTime getStartTime() {
		if (startTime != null && startTime.eIsProxy()) {
			InternalEObject oldStartTime = (InternalEObject)startTime;
			startTime = (ESMFTime)eResolveProxy(oldStartTime);
			if (startTime != oldStartTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_CLOCK_CREATE__START_TIME, oldStartTime, startTime));
			}
		}
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTime basicGetStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(ESMFTime newStartTime) {
		ESMFTime oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_CLOCK_CREATE__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTime getStopTime() {
		if (stopTime != null && stopTime.eIsProxy()) {
			InternalEObject oldStopTime = (InternalEObject)stopTime;
			stopTime = (ESMFTime)eResolveProxy(oldStopTime);
			if (stopTime != oldStopTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_CLOCK_CREATE__STOP_TIME, oldStopTime, stopTime));
			}
		}
		return stopTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTime basicGetStopTime() {
		return stopTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopTime(ESMFTime newStopTime) {
		ESMFTime oldStopTime = stopTime;
		stopTime = newStopTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_CLOCK_CREATE__STOP_TIME, oldStopTime, stopTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE__CLOCK:
				if (resolve) return getClock();
				return basicGetClock();
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE__TIME_STEP:
				if (resolve) return getTimeStep();
				return basicGetTimeStep();
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE__START_TIME:
				if (resolve) return getStartTime();
				return basicGetStartTime();
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE__STOP_TIME:
				if (resolve) return getStopTime();
				return basicGetStopTime();
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
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE__CLOCK:
				setClock((ESMFClock)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE__TIME_STEP:
				setTimeStep((ESMFTimeInterval)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE__START_TIME:
				setStartTime((ESMFTime)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE__STOP_TIME:
				setStopTime((ESMFTime)newValue);
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
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE__CLOCK:
				setClock((ESMFClock)null);
				return;
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE__TIME_STEP:
				setTimeStep((ESMFTimeInterval)null);
				return;
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE__START_TIME:
				setStartTime((ESMFTime)null);
				return;
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE__STOP_TIME:
				setStopTime((ESMFTime)null);
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
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE__CLOCK:
				return clock != null;
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE__TIME_STEP:
				return timeStep != null;
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE__START_TIME:
				return startTime != null;
			case ESMFPackage.ESMF_ACTION_CLOCK_CREATE__STOP_TIME:
				return stopTime != null;
		}
		return super.eIsSet(featureID);
	}

} //ESMFActionClockCreateImpl
