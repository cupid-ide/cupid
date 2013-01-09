/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionTimeIntervalGet;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFTimeInterval;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Time Interval Get</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeIntervalGetImpl#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeIntervalGetImpl#getH <em>H</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeIntervalGetImpl#getM <em>M</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeIntervalGetImpl#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionTimeIntervalGetImpl extends ESMFActionAPIImpl implements ESMFActionTimeIntervalGet {
	/**
	 * The cached value of the '{@link #getTimeInterval() <em>Time Interval</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeInterval()
	 * @generated
	 * @ordered
	 */
	protected ESMFTimeInterval timeInterval;

	/**
	 * The default value of the '{@link #getH() <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected static final String H_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getH() <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected String h = H_EDEFAULT;

	/**
	 * The default value of the '{@link #getM() <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM()
	 * @generated
	 * @ordered
	 */
	protected static final String M_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getM() <em>M</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getM()
	 * @generated
	 * @ordered
	 */
	protected String m = M_EDEFAULT;

	/**
	 * The default value of the '{@link #getS() <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected static final String S_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getS() <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected String s = S_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionTimeIntervalGetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_TIME_INTERVAL_GET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTimeInterval getTimeInterval() {
		if (timeInterval != null && timeInterval.eIsProxy()) {
			InternalEObject oldTimeInterval = (InternalEObject)timeInterval;
			timeInterval = (ESMFTimeInterval)eResolveProxy(oldTimeInterval);
			if (timeInterval != oldTimeInterval) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__TIME_INTERVAL, oldTimeInterval, timeInterval));
			}
		}
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTimeInterval basicGetTimeInterval() {
		return timeInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeInterval(ESMFTimeInterval newTimeInterval) {
		ESMFTimeInterval oldTimeInterval = timeInterval;
		timeInterval = newTimeInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__TIME_INTERVAL, oldTimeInterval, timeInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getH() {
		return h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setH(String newH) {
		String oldH = h;
		h = newH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__H, oldH, h));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getM() {
		return m;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setM(String newM) {
		String oldM = m;
		m = newM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__M, oldM, m));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getS() {
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS(String newS) {
		String oldS = s;
		s = newS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__S, oldS, s));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__TIME_INTERVAL:
				if (resolve) return getTimeInterval();
				return basicGetTimeInterval();
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__H:
				return getH();
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__M:
				return getM();
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__S:
				return getS();
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
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__TIME_INTERVAL:
				setTimeInterval((ESMFTimeInterval)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__H:
				setH((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__M:
				setM((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__S:
				setS((String)newValue);
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
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__TIME_INTERVAL:
				setTimeInterval((ESMFTimeInterval)null);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__H:
				setH(H_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__M:
				setM(M_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__S:
				setS(S_EDEFAULT);
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
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__TIME_INTERVAL:
				return timeInterval != null;
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__H:
				return H_EDEFAULT == null ? h != null : !H_EDEFAULT.equals(h);
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__M:
				return M_EDEFAULT == null ? m != null : !M_EDEFAULT.equals(m);
			case ESMFPackage.ESMF_ACTION_TIME_INTERVAL_GET__S:
				return S_EDEFAULT == null ? s != null : !S_EDEFAULT.equals(s);
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
		result.append(" (h: ");
		result.append(h);
		result.append(", m: ");
		result.append(m);
		result.append(", s: ");
		result.append(s);
		result.append(')');
		return result.toString();
	}

} //ESMFActionTimeIntervalGetImpl
