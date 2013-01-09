/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFCallSIDLMethod;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;

import org.earthsystemcurator.cupid.sidl.Method;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call SIDL Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFCallSIDLMethodImpl#getSIDLMethod <em>SIDL Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFCallSIDLMethodImpl extends ESMFCallImpl implements ESMFCallSIDLMethod {
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
	protected ESMFCallSIDLMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_CALL_SIDL_METHOD;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_CALL_SIDL_METHOD__SIDL_METHOD, oldSIDLMethod, sidlMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_CALL_SIDL_METHOD__SIDL_METHOD, oldSIDLMethod, sidlMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_CALL_SIDL_METHOD__SIDL_METHOD:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ESMFPackage.ESMF_CALL_SIDL_METHOD__SIDL_METHOD:
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
			case ESMFPackage.ESMF_CALL_SIDL_METHOD__SIDL_METHOD:
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
			case ESMFPackage.ESMF_CALL_SIDL_METHOD__SIDL_METHOD:
				return sidlMethod != null;
		}
		return super.eIsSet(featureID);
	}

} //ESMFCallSIDLMethodImpl
