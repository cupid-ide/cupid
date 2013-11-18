/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.SetModelServices;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Model Services</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.SetModelServicesImpl#getModelComp <em>Model Comp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.SetModelServicesImpl#getSubroutineName <em>Subroutine Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetModelServicesImpl extends EObjectImpl implements SetModelServices {
	/**
	 * The default value of the '{@link #getModelComp() <em>Model Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelComp()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_COMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelComp() <em>Model Comp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelComp()
	 * @generated
	 * @ordered
	 */
	protected String modelComp = MODEL_COMP_EDEFAULT;

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
	protected SetModelServicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.SET_MODEL_SERVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModelComp() {
		return modelComp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelComp(String newModelComp) {
		String oldModelComp = modelComp;
		modelComp = newModelComp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.SET_MODEL_SERVICES__MODEL_COMP, oldModelComp, modelComp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.SET_MODEL_SERVICES__SUBROUTINE_NAME, oldSubroutineName, subroutineName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NUOPCPackage.SET_MODEL_SERVICES__MODEL_COMP:
				return getModelComp();
			case NUOPCPackage.SET_MODEL_SERVICES__SUBROUTINE_NAME:
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
			case NUOPCPackage.SET_MODEL_SERVICES__MODEL_COMP:
				setModelComp((String)newValue);
				return;
			case NUOPCPackage.SET_MODEL_SERVICES__SUBROUTINE_NAME:
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
			case NUOPCPackage.SET_MODEL_SERVICES__MODEL_COMP:
				setModelComp(MODEL_COMP_EDEFAULT);
				return;
			case NUOPCPackage.SET_MODEL_SERVICES__SUBROUTINE_NAME:
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
			case NUOPCPackage.SET_MODEL_SERVICES__MODEL_COMP:
				return MODEL_COMP_EDEFAULT == null ? modelComp != null : !MODEL_COMP_EDEFAULT.equals(modelComp);
			case NUOPCPackage.SET_MODEL_SERVICES__SUBROUTINE_NAME:
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
		result.append(" (modelComp: ");
		result.append(modelComp);
		result.append(", subroutineName: ");
		result.append(subroutineName);
		result.append(')');
		return result.toString();
	}

} //SetModelServicesImpl
