/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImpl#isUsesAllImports <em>Uses All Imports</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImpl#getDefinesSetServices <em>Defines Set Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends EObjectImpl implements Model {
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
	 * The default value of the '{@link #isUsesAllImports() <em>Uses All Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsesAllImports()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USES_ALL_IMPORTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsesAllImports() <em>Uses All Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsesAllImports()
	 * @generated
	 * @ordered
	 */
	protected boolean usesAllImports = USES_ALL_IMPORTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefinesSetServices() <em>Defines Set Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinesSetServices()
	 * @generated
	 * @ordered
	 */
	protected ModelDefinesSetServices definesSetServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsesAllImports() {
		return usesAllImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesAllImports(boolean newUsesAllImports) {
		boolean oldUsesAllImports = usesAllImports;
		usesAllImports = newUsesAllImports;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL__USES_ALL_IMPORTS, oldUsesAllImports, usesAllImports));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelDefinesSetServices getDefinesSetServices() {
		return definesSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinesSetServices(ModelDefinesSetServices newDefinesSetServices, NotificationChain msgs) {
		ModelDefinesSetServices oldDefinesSetServices = definesSetServices;
		definesSetServices = newDefinesSetServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL__DEFINES_SET_SERVICES, oldDefinesSetServices, newDefinesSetServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinesSetServices(ModelDefinesSetServices newDefinesSetServices) {
		if (newDefinesSetServices != definesSetServices) {
			NotificationChain msgs = null;
			if (definesSetServices != null)
				msgs = ((InternalEObject)definesSetServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.MODEL__DEFINES_SET_SERVICES, null, msgs);
			if (newDefinesSetServices != null)
				msgs = ((InternalEObject)newDefinesSetServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.MODEL__DEFINES_SET_SERVICES, null, msgs);
			msgs = basicSetDefinesSetServices(newDefinesSetServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL__DEFINES_SET_SERVICES, newDefinesSetServices, newDefinesSetServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.MODEL__DEFINES_SET_SERVICES:
				return basicSetDefinesSetServices(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NUOPCPackage.MODEL__NAME:
				return getName();
			case NUOPCPackage.MODEL__USES_ALL_IMPORTS:
				return isUsesAllImports();
			case NUOPCPackage.MODEL__DEFINES_SET_SERVICES:
				return getDefinesSetServices();
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
			case NUOPCPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.MODEL__USES_ALL_IMPORTS:
				setUsesAllImports((Boolean)newValue);
				return;
			case NUOPCPackage.MODEL__DEFINES_SET_SERVICES:
				setDefinesSetServices((ModelDefinesSetServices)newValue);
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
			case NUOPCPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.MODEL__USES_ALL_IMPORTS:
				setUsesAllImports(USES_ALL_IMPORTS_EDEFAULT);
				return;
			case NUOPCPackage.MODEL__DEFINES_SET_SERVICES:
				setDefinesSetServices((ModelDefinesSetServices)null);
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
			case NUOPCPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.MODEL__USES_ALL_IMPORTS:
				return usesAllImports != USES_ALL_IMPORTS_EDEFAULT;
			case NUOPCPackage.MODEL__DEFINES_SET_SERVICES:
				return definesSetServices != null;
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
		result.append(", usesAllImports: ");
		result.append(usesAllImports);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
