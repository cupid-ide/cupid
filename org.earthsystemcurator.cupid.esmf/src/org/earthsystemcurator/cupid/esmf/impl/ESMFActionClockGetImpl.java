/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionClockGet;
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
 * An implementation of the model object '<em><b>Action Clock Get</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockGetImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockGetImpl#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionClockGetImpl#getCurrTime <em>Curr Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionClockGetImpl extends ESMFActionAPIImpl implements ESMFActionClockGet {
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
	 * The cached value of the '{@link #getCurrTime() <em>Curr Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrTime()
	 * @generated
	 * @ordered
	 */
	protected ESMFTime currTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionClockGetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_CLOCK_GET;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_CLOCK_GET__CLOCK, oldClock, clock));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_CLOCK_GET__CLOCK, oldClock, clock));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_CLOCK_GET__TIME_STEP, oldTimeStep, timeStep));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_CLOCK_GET__TIME_STEP, oldTimeStep, timeStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTime getCurrTime() {
		if (currTime != null && currTime.eIsProxy()) {
			InternalEObject oldCurrTime = (InternalEObject)currTime;
			currTime = (ESMFTime)eResolveProxy(oldCurrTime);
			if (currTime != oldCurrTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_CLOCK_GET__CURR_TIME, oldCurrTime, currTime));
			}
		}
		return currTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTime basicGetCurrTime() {
		return currTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrTime(ESMFTime newCurrTime) {
		ESMFTime oldCurrTime = currTime;
		currTime = newCurrTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_CLOCK_GET__CURR_TIME, oldCurrTime, currTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_CLOCK_GET__CLOCK:
				if (resolve) return getClock();
				return basicGetClock();
			case ESMFPackage.ESMF_ACTION_CLOCK_GET__TIME_STEP:
				if (resolve) return getTimeStep();
				return basicGetTimeStep();
			case ESMFPackage.ESMF_ACTION_CLOCK_GET__CURR_TIME:
				if (resolve) return getCurrTime();
				return basicGetCurrTime();
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
			case ESMFPackage.ESMF_ACTION_CLOCK_GET__CLOCK:
				setClock((ESMFClock)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_CLOCK_GET__TIME_STEP:
				setTimeStep((ESMFTimeInterval)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_CLOCK_GET__CURR_TIME:
				setCurrTime((ESMFTime)newValue);
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
			case ESMFPackage.ESMF_ACTION_CLOCK_GET__CLOCK:
				setClock((ESMFClock)null);
				return;
			case ESMFPackage.ESMF_ACTION_CLOCK_GET__TIME_STEP:
				setTimeStep((ESMFTimeInterval)null);
				return;
			case ESMFPackage.ESMF_ACTION_CLOCK_GET__CURR_TIME:
				setCurrTime((ESMFTime)null);
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
			case ESMFPackage.ESMF_ACTION_CLOCK_GET__CLOCK:
				return clock != null;
			case ESMFPackage.ESMF_ACTION_CLOCK_GET__TIME_STEP:
				return timeStep != null;
			case ESMFPackage.ESMF_ACTION_CLOCK_GET__CURR_TIME:
				return currTime != null;
		}
		return super.eIsSet(featureID);
	}

} //ESMFActionClockGetImpl
