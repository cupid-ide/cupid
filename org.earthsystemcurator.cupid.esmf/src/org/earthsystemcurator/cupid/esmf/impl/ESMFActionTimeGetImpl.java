/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionTimeGet;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Time Get</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeGetImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeGetImpl#getYy <em>Yy</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeGetImpl#getMm <em>Mm</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeGetImpl#getDd <em>Dd</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeGetImpl#getH <em>H</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeGetImpl#getM <em>M</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionTimeGetImpl#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionTimeGetImpl extends ESMFActionAPIImpl implements ESMFActionTimeGet {
	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected ESMFTime time;

	/**
	 * The default value of the '{@link #getYy() <em>Yy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYy()
	 * @generated
	 * @ordered
	 */
	protected static final String YY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYy() <em>Yy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYy()
	 * @generated
	 * @ordered
	 */
	protected String yy = YY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMm() <em>Mm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMm()
	 * @generated
	 * @ordered
	 */
	protected static final String MM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMm() <em>Mm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMm()
	 * @generated
	 * @ordered
	 */
	protected String mm = MM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDd() <em>Dd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDd()
	 * @generated
	 * @ordered
	 */
	protected static final String DD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDd() <em>Dd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDd()
	 * @generated
	 * @ordered
	 */
	protected String dd = DD_EDEFAULT;

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
	protected ESMFActionTimeGetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_TIME_GET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTime getTime() {
		if (time != null && time.eIsProxy()) {
			InternalEObject oldTime = (InternalEObject)time;
			time = (ESMFTime)eResolveProxy(oldTime);
			if (time != oldTime) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_TIME_GET__TIME, oldTime, time));
			}
		}
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTime basicGetTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(ESMFTime newTime) {
		ESMFTime oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_TIME_GET__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getYy() {
		return yy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYy(String newYy) {
		String oldYy = yy;
		yy = newYy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_TIME_GET__YY, oldYy, yy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMm() {
		return mm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMm(String newMm) {
		String oldMm = mm;
		mm = newMm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_TIME_GET__MM, oldMm, mm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDd() {
		return dd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDd(String newDd) {
		String oldDd = dd;
		dd = newDd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_TIME_GET__DD, oldDd, dd));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_TIME_GET__H, oldH, h));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_TIME_GET__M, oldM, m));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_TIME_GET__S, oldS, s));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_TIME_GET__TIME:
				if (resolve) return getTime();
				return basicGetTime();
			case ESMFPackage.ESMF_ACTION_TIME_GET__YY:
				return getYy();
			case ESMFPackage.ESMF_ACTION_TIME_GET__MM:
				return getMm();
			case ESMFPackage.ESMF_ACTION_TIME_GET__DD:
				return getDd();
			case ESMFPackage.ESMF_ACTION_TIME_GET__H:
				return getH();
			case ESMFPackage.ESMF_ACTION_TIME_GET__M:
				return getM();
			case ESMFPackage.ESMF_ACTION_TIME_GET__S:
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
			case ESMFPackage.ESMF_ACTION_TIME_GET__TIME:
				setTime((ESMFTime)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_GET__YY:
				setYy((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_GET__MM:
				setMm((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_GET__DD:
				setDd((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_GET__H:
				setH((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_GET__M:
				setM((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_GET__S:
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
			case ESMFPackage.ESMF_ACTION_TIME_GET__TIME:
				setTime((ESMFTime)null);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_GET__YY:
				setYy(YY_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_GET__MM:
				setMm(MM_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_GET__DD:
				setDd(DD_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_GET__H:
				setH(H_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_GET__M:
				setM(M_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_TIME_GET__S:
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
			case ESMFPackage.ESMF_ACTION_TIME_GET__TIME:
				return time != null;
			case ESMFPackage.ESMF_ACTION_TIME_GET__YY:
				return YY_EDEFAULT == null ? yy != null : !YY_EDEFAULT.equals(yy);
			case ESMFPackage.ESMF_ACTION_TIME_GET__MM:
				return MM_EDEFAULT == null ? mm != null : !MM_EDEFAULT.equals(mm);
			case ESMFPackage.ESMF_ACTION_TIME_GET__DD:
				return DD_EDEFAULT == null ? dd != null : !DD_EDEFAULT.equals(dd);
			case ESMFPackage.ESMF_ACTION_TIME_GET__H:
				return H_EDEFAULT == null ? h != null : !H_EDEFAULT.equals(h);
			case ESMFPackage.ESMF_ACTION_TIME_GET__M:
				return M_EDEFAULT == null ? m != null : !M_EDEFAULT.equals(m);
			case ESMFPackage.ESMF_ACTION_TIME_GET__S:
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
		result.append(" (yy: ");
		result.append(yy);
		result.append(", mm: ");
		result.append(mm);
		result.append(", dd: ");
		result.append(dd);
		result.append(", h: ");
		result.append(h);
		result.append(", m: ");
		result.append(m);
		result.append(", s: ");
		result.append(s);
		result.append(')');
		return result.toString();
	}

} //ESMFActionTimeGetImpl
