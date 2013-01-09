/**
 */
package org.earthsystemcurator.cupid.sidl.impl;

import org.earthsystemcurator.cupid.sidl.SIDLPackage;
import org.earthsystemcurator.cupid.sidl.SimpleType;
import org.earthsystemcurator.cupid.sidl.SimpleTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.sidl.impl.SimpleTypeImpl#getSimpleType <em>Simple Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleTypeImpl extends SIDLTypeImpl implements SimpleType {
	/**
	 * The default value of the '{@link #getSimpleType() <em>Simple Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleType()
	 * @generated
	 * @ordered
	 */
	protected static final SimpleTypeEnum SIMPLE_TYPE_EDEFAULT = SimpleTypeEnum.DOUBLE;

	/**
	 * The cached value of the '{@link #getSimpleType() <em>Simple Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleType()
	 * @generated
	 * @ordered
	 */
	protected SimpleTypeEnum simpleType = SIMPLE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SIDLPackage.Literals.SIMPLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTypeEnum getSimpleType() {
		return simpleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleType(SimpleTypeEnum newSimpleType) {
		SimpleTypeEnum oldSimpleType = simpleType;
		simpleType = newSimpleType == null ? SIMPLE_TYPE_EDEFAULT : newSimpleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SIDLPackage.SIMPLE_TYPE__SIMPLE_TYPE, oldSimpleType, simpleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SIDLPackage.SIMPLE_TYPE__SIMPLE_TYPE:
				return getSimpleType();
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
			case SIDLPackage.SIMPLE_TYPE__SIMPLE_TYPE:
				setSimpleType((SimpleTypeEnum)newValue);
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
			case SIDLPackage.SIMPLE_TYPE__SIMPLE_TYPE:
				setSimpleType(SIMPLE_TYPE_EDEFAULT);
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
			case SIDLPackage.SIMPLE_TYPE__SIMPLE_TYPE:
				return simpleType != SIMPLE_TYPE_EDEFAULT;
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
		result.append(" (simpleType: ");
		result.append(simpleType);
		result.append(')');
		return result.toString();
	}

} //SimpleTypeImpl
