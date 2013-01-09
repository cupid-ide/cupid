/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionFrameworkInit;
import org.earthsystemcurator.cupid.esmf.ESMFCalKind;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Framework Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFrameworkInitImpl#getDefaultCalKind <em>Default Cal Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionFrameworkInitImpl extends ESMFActionAPIImpl implements ESMFActionFrameworkInit {
	/**
	 * The default value of the '{@link #getDefaultCalKind() <em>Default Cal Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCalKind()
	 * @generated
	 * @ordered
	 */
	protected static final ESMFCalKind DEFAULT_CAL_KIND_EDEFAULT = ESMFCalKind.ESMF_CALKIND_GREGORIAN;

	/**
	 * The cached value of the '{@link #getDefaultCalKind() <em>Default Cal Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCalKind()
	 * @generated
	 * @ordered
	 */
	protected ESMFCalKind defaultCalKind = DEFAULT_CAL_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionFrameworkInitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_FRAMEWORK_INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFCalKind getDefaultCalKind() {
		return defaultCalKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCalKind(ESMFCalKind newDefaultCalKind) {
		ESMFCalKind oldDefaultCalKind = defaultCalKind;
		defaultCalKind = newDefaultCalKind == null ? DEFAULT_CAL_KIND_EDEFAULT : newDefaultCalKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FRAMEWORK_INIT__DEFAULT_CAL_KIND, oldDefaultCalKind, defaultCalKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_FRAMEWORK_INIT__DEFAULT_CAL_KIND:
				return getDefaultCalKind();
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
			case ESMFPackage.ESMF_ACTION_FRAMEWORK_INIT__DEFAULT_CAL_KIND:
				setDefaultCalKind((ESMFCalKind)newValue);
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
			case ESMFPackage.ESMF_ACTION_FRAMEWORK_INIT__DEFAULT_CAL_KIND:
				setDefaultCalKind(DEFAULT_CAL_KIND_EDEFAULT);
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
			case ESMFPackage.ESMF_ACTION_FRAMEWORK_INIT__DEFAULT_CAL_KIND:
				return defaultCalKind != DEFAULT_CAL_KIND_EDEFAULT;
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
		result.append(" (defaultCalKind: ");
		result.append(defaultCalKind);
		result.append(')');
		return result.toString();
	}

} //ESMFActionFrameworkInitImpl
