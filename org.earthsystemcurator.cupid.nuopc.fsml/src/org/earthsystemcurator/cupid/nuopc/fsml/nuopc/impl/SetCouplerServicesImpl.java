/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetCouplerServices;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Coupler Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.SetCouplerServicesImpl#getCplComp <em>Cpl Comp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.SetCouplerServicesImpl#getSubroutineName <em>Subroutine Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetCouplerServicesImpl extends EObjectImpl implements SetCouplerServices {
	/**
	 * The default value of the '{@link #getCplComp() <em>Cpl Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCplComp()
	 * @generated
	 * @ordered
	 */
	protected static final String CPL_COMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCplComp() <em>Cpl Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCplComp()
	 * @generated
	 * @ordered
	 */
	protected String cplComp = CPL_COMP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubroutineName() <em>Subroutine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubroutineName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBROUTINE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubroutineName() <em>Subroutine Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubroutineName()
	 * @generated
	 * @ordered
	 */
	protected String subroutineName = SUBROUTINE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetCouplerServicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.SET_COUPLER_SERVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCplComp() {
		return cplComp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCplComp(String newCplComp) {
		String oldCplComp = cplComp;
		cplComp = newCplComp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.SET_COUPLER_SERVICES__CPL_COMP, oldCplComp, cplComp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubroutineName() {
		return subroutineName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubroutineName(String newSubroutineName) {
		String oldSubroutineName = subroutineName;
		subroutineName = newSubroutineName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.SET_COUPLER_SERVICES__SUBROUTINE_NAME, oldSubroutineName, subroutineName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NUOPCPackage.SET_COUPLER_SERVICES__CPL_COMP:
				return getCplComp();
			case NUOPCPackage.SET_COUPLER_SERVICES__SUBROUTINE_NAME:
				return getSubroutineName();
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
			case NUOPCPackage.SET_COUPLER_SERVICES__CPL_COMP:
				setCplComp((String)newValue);
				return;
			case NUOPCPackage.SET_COUPLER_SERVICES__SUBROUTINE_NAME:
				setSubroutineName((String)newValue);
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
			case NUOPCPackage.SET_COUPLER_SERVICES__CPL_COMP:
				setCplComp(CPL_COMP_EDEFAULT);
				return;
			case NUOPCPackage.SET_COUPLER_SERVICES__SUBROUTINE_NAME:
				setSubroutineName(SUBROUTINE_NAME_EDEFAULT);
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
			case NUOPCPackage.SET_COUPLER_SERVICES__CPL_COMP:
				return CPL_COMP_EDEFAULT == null ? cplComp != null : !CPL_COMP_EDEFAULT.equals(cplComp);
			case NUOPCPackage.SET_COUPLER_SERVICES__SUBROUTINE_NAME:
				return SUBROUTINE_NAME_EDEFAULT == null ? subroutineName != null : !SUBROUTINE_NAME_EDEFAULT.equals(subroutineName);
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
		result.append(" (cplComp: ");
		result.append(cplComp);
		result.append(", subroutineName: ");
		result.append(subroutineName);
		result.append(')');
		return result.toString();
	}

} //SetCouplerServicesImpl
