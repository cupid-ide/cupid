/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__GenericImports;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Generic Imports</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__GenericImportsImpl#getImportsGenericSS <em>Imports Generic SS</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__GenericImportsImpl#getImportsLabelModelAdvance <em>Imports Label Model Advance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCModel__GenericImportsImpl extends EObjectImpl implements NUOPCModel__GenericImports {
	/**
	 * The default value of the '{@link #getImportsGenericSS() <em>Imports Generic SS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportsGenericSS()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTS_GENERIC_SS_EDEFAULT = "model_routine_SS";

	/**
	 * The cached value of the '{@link #getImportsGenericSS() <em>Imports Generic SS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportsGenericSS()
	 * @generated
	 * @ordered
	 */
	protected String importsGenericSS = IMPORTS_GENERIC_SS_EDEFAULT;

	/**
	 * The default value of the '{@link #getImportsLabelModelAdvance() <em>Imports Label Model Advance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportsLabelModelAdvance()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTS_LABEL_MODEL_ADVANCE_EDEFAULT = "model_label_Advance";

	/**
	 * The cached value of the '{@link #getImportsLabelModelAdvance() <em>Imports Label Model Advance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportsLabelModelAdvance()
	 * @generated
	 * @ordered
	 */
	protected String importsLabelModelAdvance = IMPORTS_LABEL_MODEL_ADVANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCModel__GenericImportsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_MODEL_GENERIC_IMPORTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportsGenericSS() {
		return importsGenericSS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportsGenericSS(String newImportsGenericSS) {
		String oldImportsGenericSS = importsGenericSS;
		importsGenericSS = newImportsGenericSS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_GENERIC_SS, oldImportsGenericSS, importsGenericSS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportsLabelModelAdvance() {
		return importsLabelModelAdvance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportsLabelModelAdvance(String newImportsLabelModelAdvance) {
		String oldImportsLabelModelAdvance = importsLabelModelAdvance;
		importsLabelModelAdvance = newImportsLabelModelAdvance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_LABEL_MODEL_ADVANCE, oldImportsLabelModelAdvance, importsLabelModelAdvance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_GENERIC_SS:
				return getImportsGenericSS();
			case NUOPCPackage.NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_LABEL_MODEL_ADVANCE:
				return getImportsLabelModelAdvance();
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
			case NUOPCPackage.NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_GENERIC_SS:
				setImportsGenericSS((String)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_LABEL_MODEL_ADVANCE:
				setImportsLabelModelAdvance((String)newValue);
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
			case NUOPCPackage.NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_GENERIC_SS:
				setImportsGenericSS(IMPORTS_GENERIC_SS_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_LABEL_MODEL_ADVANCE:
				setImportsLabelModelAdvance(IMPORTS_LABEL_MODEL_ADVANCE_EDEFAULT);
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
			case NUOPCPackage.NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_GENERIC_SS:
				return IMPORTS_GENERIC_SS_EDEFAULT == null ? importsGenericSS != null : !IMPORTS_GENERIC_SS_EDEFAULT.equals(importsGenericSS);
			case NUOPCPackage.NUOPC_MODEL_GENERIC_IMPORTS__IMPORTS_LABEL_MODEL_ADVANCE:
				return IMPORTS_LABEL_MODEL_ADVANCE_EDEFAULT == null ? importsLabelModelAdvance != null : !IMPORTS_LABEL_MODEL_ADVANCE_EDEFAULT.equals(importsLabelModelAdvance);
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
		result.append(" (importsGenericSS: ");
		result.append(importsGenericSS);
		result.append(", importsLabelModelAdvance: ");
		result.append(importsLabelModelAdvance);
		result.append(')');
		return result.toString();
	}

} //NUOPCModel__GenericImportsImpl
