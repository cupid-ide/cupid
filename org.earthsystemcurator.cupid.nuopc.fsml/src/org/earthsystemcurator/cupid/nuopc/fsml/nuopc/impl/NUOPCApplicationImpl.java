/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCApplicationImpl#getNuopcModel <em>Nuopc Model</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCApplicationImpl#getNuopcDriver <em>Nuopc Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCApplicationImpl extends EObjectImpl implements NUOPCApplication {
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
	 * The cached value of the '{@link #getNuopcModel() <em>Nuopc Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNuopcModel()
	 * @generated
	 * @ordered
	 */
	protected EList<NUOPCModel> nuopcModel;

	/**
	 * The cached value of the '{@link #getNuopcDriver() <em>Nuopc Driver</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNuopcDriver()
	 * @generated
	 * @ordered
	 */
	protected EList<NUOPCDriver> nuopcDriver;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_APPLICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NUOPCModel> getNuopcModel() {
		if (nuopcModel == null) {
			nuopcModel = new EObjectContainmentEList<NUOPCModel>(NUOPCModel.class, this, NUOPCPackage.NUOPC_APPLICATION__NUOPC_MODEL);
		}
		return nuopcModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NUOPCDriver> getNuopcDriver() {
		if (nuopcDriver == null) {
			nuopcDriver = new EObjectContainmentWithInverseEList<NUOPCDriver>(NUOPCDriver.class, this, NUOPCPackage.NUOPC_APPLICATION__NUOPC_DRIVER, NUOPCPackage.NUOPC_DRIVER__PARENT);
		}
		return nuopcDriver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_APPLICATION__NUOPC_DRIVER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNuopcDriver()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_APPLICATION__NUOPC_MODEL:
				return ((InternalEList<?>)getNuopcModel()).basicRemove(otherEnd, msgs);
			case NUOPCPackage.NUOPC_APPLICATION__NUOPC_DRIVER:
				return ((InternalEList<?>)getNuopcDriver()).basicRemove(otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_APPLICATION__NAME:
				return getName();
			case NUOPCPackage.NUOPC_APPLICATION__NUOPC_MODEL:
				return getNuopcModel();
			case NUOPCPackage.NUOPC_APPLICATION__NUOPC_DRIVER:
				return getNuopcDriver();
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
			case NUOPCPackage.NUOPC_APPLICATION__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.NUOPC_APPLICATION__NUOPC_MODEL:
				getNuopcModel().clear();
				getNuopcModel().addAll((Collection<? extends NUOPCModel>)newValue);
				return;
			case NUOPCPackage.NUOPC_APPLICATION__NUOPC_DRIVER:
				getNuopcDriver().clear();
				getNuopcDriver().addAll((Collection<? extends NUOPCDriver>)newValue);
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
			case NUOPCPackage.NUOPC_APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_APPLICATION__NUOPC_MODEL:
				getNuopcModel().clear();
				return;
			case NUOPCPackage.NUOPC_APPLICATION__NUOPC_DRIVER:
				getNuopcDriver().clear();
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
			case NUOPCPackage.NUOPC_APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.NUOPC_APPLICATION__NUOPC_MODEL:
				return nuopcModel != null && !nuopcModel.isEmpty();
			case NUOPCPackage.NUOPC_APPLICATION__NUOPC_DRIVER:
				return nuopcDriver != null && !nuopcDriver.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //NUOPCApplicationImpl
