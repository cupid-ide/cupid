/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFActionUserServiceInvoke;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action User Service Invoke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionUserServiceInvokeImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionUserServiceInvokeImpl#getExecution <em>Execution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionUserServiceInvokeImpl extends ESMFActionAPIImpl implements ESMFActionUserServiceInvoke {
	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<String> declaration;

	/**
	 * The cached value of the '{@link #getExecution() <em>Execution</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecution()
	 * @generated
	 * @ordered
	 */
	protected EList<String> execution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionUserServiceInvokeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_USER_SERVICE_INVOKE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDeclaration() {
		if (declaration == null) {
			declaration = new EDataTypeUniqueEList<String>(String.class, this, ESMFPackage.ESMF_ACTION_USER_SERVICE_INVOKE__DECLARATION);
		}
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExecution() {
		if (execution == null) {
			execution = new EDataTypeUniqueEList<String>(String.class, this, ESMFPackage.ESMF_ACTION_USER_SERVICE_INVOKE__EXECUTION);
		}
		return execution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_USER_SERVICE_INVOKE__DECLARATION:
				return getDeclaration();
			case ESMFPackage.ESMF_ACTION_USER_SERVICE_INVOKE__EXECUTION:
				return getExecution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_USER_SERVICE_INVOKE__DECLARATION:
				getDeclaration().clear();
				getDeclaration().addAll((Collection<? extends String>)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_USER_SERVICE_INVOKE__EXECUTION:
				getExecution().clear();
				getExecution().addAll((Collection<? extends String>)newValue);
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
			case ESMFPackage.ESMF_ACTION_USER_SERVICE_INVOKE__DECLARATION:
				getDeclaration().clear();
				return;
			case ESMFPackage.ESMF_ACTION_USER_SERVICE_INVOKE__EXECUTION:
				getExecution().clear();
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
			case ESMFPackage.ESMF_ACTION_USER_SERVICE_INVOKE__DECLARATION:
				return declaration != null && !declaration.isEmpty();
			case ESMFPackage.ESMF_ACTION_USER_SERVICE_INVOKE__EXECUTION:
				return execution != null && !execution.isEmpty();
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
		result.append(" (declaration: ");
		result.append(declaration);
		result.append(", execution: ");
		result.append(execution);
		result.append(')');
		return result.toString();
	}

} //ESMFActionUserServiceInvokeImpl
