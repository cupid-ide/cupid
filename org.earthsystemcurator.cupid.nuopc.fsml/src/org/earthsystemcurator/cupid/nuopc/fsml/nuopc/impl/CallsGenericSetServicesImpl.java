/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsGenericSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calls Generic Set Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.CallsGenericSetServicesImpl#getGcomp <em>Gcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.CallsGenericSetServicesImpl#getRc <em>Rc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallsGenericSetServicesImpl extends EObjectImpl implements CallsGenericSetServices {
	/**
	 * The default value of the '{@link #getGcomp() <em>Gcomp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGcomp()
	 * @generated
	 * @ordered
	 */
	protected static final String GCOMP_EDEFAULT = null;

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
	protected static final String RC_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallsGenericSetServicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.CALLS_GENERIC_SET_SERVICES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.CALLS_GENERIC_SET_SERVICES__GCOMP, oldGcomp, gcomp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.CALLS_GENERIC_SET_SERVICES__RC, oldRc, rc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NUOPCPackage.CALLS_GENERIC_SET_SERVICES__GCOMP:
				return getGcomp();
			case NUOPCPackage.CALLS_GENERIC_SET_SERVICES__RC:
				return getRc();
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
			case NUOPCPackage.CALLS_GENERIC_SET_SERVICES__GCOMP:
				setGcomp((String)newValue);
				return;
			case NUOPCPackage.CALLS_GENERIC_SET_SERVICES__RC:
				setRc((String)newValue);
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
			case NUOPCPackage.CALLS_GENERIC_SET_SERVICES__GCOMP:
				setGcomp(GCOMP_EDEFAULT);
				return;
			case NUOPCPackage.CALLS_GENERIC_SET_SERVICES__RC:
				setRc(RC_EDEFAULT);
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
			case NUOPCPackage.CALLS_GENERIC_SET_SERVICES__GCOMP:
				return GCOMP_EDEFAULT == null ? gcomp != null : !GCOMP_EDEFAULT.equals(gcomp);
			case NUOPCPackage.CALLS_GENERIC_SET_SERVICES__RC:
				return RC_EDEFAULT == null ? rc != null : !RC_EDEFAULT.equals(rc);
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
		result.append(" (gcomp: ");
		result.append(gcomp);
		result.append(", rc: ");
		result.append(rc);
		result.append(')');
		return result.toString();
	}

} //CallsGenericSetServicesImpl
