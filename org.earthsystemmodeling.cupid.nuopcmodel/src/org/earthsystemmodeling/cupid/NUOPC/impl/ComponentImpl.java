/**
 */
package org.earthsystemmodeling.cupid.NUOPC.impl;

import org.earthsystemmodeling.cupid.NUOPC.Component;
import org.earthsystemmodeling.cupid.NUOPC.IPDVersion;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.impl.ComponentImpl#getIPDVersion <em>IPD Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIPDVersion() <em>IPD Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPDVersion()
	 * @generated
	 * @ordered
	 */
	protected static final IPDVersion IPD_VERSION_EDEFAULT = IPDVersion.IP_DV01;

	/**
	 * The cached value of the '{@link #getIPDVersion() <em>IPD Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPDVersion()
	 * @generated
	 * @ordered
	 */
	protected IPDVersion ipdVersion = IPD_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPDVersion getIPDVersion() {
		return ipdVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPDVersion(IPDVersion newIPDVersion) {
		IPDVersion oldIPDVersion = ipdVersion;
		ipdVersion = newIPDVersion == null ? IPD_VERSION_EDEFAULT : newIPDVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.COMPONENT__IPD_VERSION, oldIPDVersion, ipdVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NUOPCPackage.COMPONENT__NAME:
				return getName();
			case NUOPCPackage.COMPONENT__IPD_VERSION:
				return getIPDVersion();
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
			case NUOPCPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.COMPONENT__IPD_VERSION:
				setIPDVersion((IPDVersion)newValue);
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
			case NUOPCPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.COMPONENT__IPD_VERSION:
				setIPDVersion(IPD_VERSION_EDEFAULT);
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
			case NUOPCPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.COMPONENT__IPD_VERSION:
				return ipdVersion != IPD_VERSION_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", IPDVersion: ");
		result.append(ipdVersion);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
