/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDe;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Grid Get PLocal De</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetPLocalDeImpl#getLocalDE <em>Local DE</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetPLocalDeImpl#getIsLBound <em>Is LBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetPLocalDeImpl#getIsUBound <em>Is UBound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionGridGetPLocalDeImpl extends ESMFActionGridGetImpl implements ESMFActionGridGetPLocalDe {
	/**
	 * The default value of the '{@link #getLocalDE() <em>Local DE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDE()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_DE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalDE() <em>Local DE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDE()
	 * @generated
	 * @ordered
	 */
	protected String localDE = LOCAL_DE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsLBound() <em>Is LBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLBound()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_LBOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsLBound() <em>Is LBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLBound()
	 * @generated
	 * @ordered
	 */
	protected String isLBound = IS_LBOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsUBound() <em>Is UBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUBound()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_UBOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsUBound() <em>Is UBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUBound()
	 * @generated
	 * @ordered
	 */
	protected String isUBound = IS_UBOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionGridGetPLocalDeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_GRID_GET_PLOCAL_DE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalDE() {
		return localDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalDE(String newLocalDE) {
		String oldLocalDE = localDE;
		localDE = newLocalDE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE__LOCAL_DE, oldLocalDE, localDE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsLBound() {
		return isLBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLBound(String newIsLBound) {
		String oldIsLBound = isLBound;
		isLBound = newIsLBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_LBOUND, oldIsLBound, isLBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsUBound() {
		return isUBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUBound(String newIsUBound) {
		String oldIsUBound = isUBound;
		isUBound = newIsUBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_UBOUND, oldIsUBound, isUBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE__LOCAL_DE:
				return getLocalDE();
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_LBOUND:
				return getIsLBound();
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_UBOUND:
				return getIsUBound();
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
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE__LOCAL_DE:
				setLocalDE((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_LBOUND:
				setIsLBound((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_UBOUND:
				setIsUBound((String)newValue);
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
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE__LOCAL_DE:
				setLocalDE(LOCAL_DE_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_LBOUND:
				setIsLBound(IS_LBOUND_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_UBOUND:
				setIsUBound(IS_UBOUND_EDEFAULT);
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
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE__LOCAL_DE:
				return LOCAL_DE_EDEFAULT == null ? localDE != null : !LOCAL_DE_EDEFAULT.equals(localDE);
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_LBOUND:
				return IS_LBOUND_EDEFAULT == null ? isLBound != null : !IS_LBOUND_EDEFAULT.equals(isLBound);
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE__IS_UBOUND:
				return IS_UBOUND_EDEFAULT == null ? isUBound != null : !IS_UBOUND_EDEFAULT.equals(isUBound);
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
		result.append(" (localDE: ");
		result.append(localDE);
		result.append(", isLBound: ");
		result.append(isLBound);
		result.append(", isUBound: ");
		result.append(isUBound);
		result.append(')');
		return result.toString();
	}

} //ESMFActionGridGetPLocalDeImpl
