/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model_Init;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModelImpl#getImportsGenericSS <em>Imports Generic SS</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModelImpl#getImplementsSetServices <em>Implements Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModelImpl#getInitialize <em>Initialize</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModelImpl#getImplementsModelAdvance <em>Implements Model Advance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCModelImpl extends EObjectImpl implements NUOPCModel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Model";

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
	 * The default value of the '{@link #getImportsGenericSS() <em>Imports Generic SS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportsGenericSS()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTS_GENERIC_SS_EDEFAULT = "nuopcmodel_ss";

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
	 * The cached value of the '{@link #getImplementsSetServices() <em>Implements Set Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsSetServices()
	 * @generated
	 * @ordered
	 */
	protected ModelImplementsSetServices implementsSetServices;

	/**
	 * The cached value of the '{@link #getInitialize() <em>Initialize</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialize()
	 * @generated
	 * @ordered
	 */
	protected Model_Init initialize;

	/**
	 * The cached value of the '{@link #getImplementsModelAdvance() <em>Implements Model Advance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsModelAdvance()
	 * @generated
	 * @ordered
	 */
	protected ModelAdvance implementsModelAdvance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL__IMPORTS_GENERIC_SS, oldImportsGenericSS, importsGenericSS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelImplementsSetServices getImplementsSetServices() {
		return implementsSetServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementsSetServices(ModelImplementsSetServices newImplementsSetServices, NotificationChain msgs) {
		ModelImplementsSetServices oldImplementsSetServices = implementsSetServices;
		implementsSetServices = newImplementsSetServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_SET_SERVICES, oldImplementsSetServices, newImplementsSetServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsSetServices(ModelImplementsSetServices newImplementsSetServices) {
		if (newImplementsSetServices != implementsSetServices) {
			NotificationChain msgs = null;
			if (implementsSetServices != null)
				msgs = ((InternalEObject)implementsSetServices).eInverseRemove(this, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT, ModelImplementsSetServices.class, msgs);
			if (newImplementsSetServices != null)
				msgs = ((InternalEObject)newImplementsSetServices).eInverseAdd(this, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__PARENT, ModelImplementsSetServices.class, msgs);
			msgs = basicSetImplementsSetServices(newImplementsSetServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_SET_SERVICES, newImplementsSetServices, newImplementsSetServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdvance getImplementsModelAdvance() {
		return implementsModelAdvance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementsModelAdvance(ModelAdvance newImplementsModelAdvance, NotificationChain msgs) {
		ModelAdvance oldImplementsModelAdvance = implementsModelAdvance;
		implementsModelAdvance = newImplementsModelAdvance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE, oldImplementsModelAdvance, newImplementsModelAdvance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsModelAdvance(ModelAdvance newImplementsModelAdvance) {
		if (newImplementsModelAdvance != implementsModelAdvance) {
			NotificationChain msgs = null;
			if (implementsModelAdvance != null)
				msgs = ((InternalEObject)implementsModelAdvance).eInverseRemove(this, NUOPCPackage.MODEL_ADVANCE__PARENT, ModelAdvance.class, msgs);
			if (newImplementsModelAdvance != null)
				msgs = ((InternalEObject)newImplementsModelAdvance).eInverseAdd(this, NUOPCPackage.MODEL_ADVANCE__PARENT, ModelAdvance.class, msgs);
			msgs = basicSetImplementsModelAdvance(newImplementsModelAdvance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE, newImplementsModelAdvance, newImplementsModelAdvance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model_Init getInitialize() {
		return initialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialize(Model_Init newInitialize, NotificationChain msgs) {
		Model_Init oldInitialize = initialize;
		initialize = newInitialize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL__INITIALIZE, oldInitialize, newInitialize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialize(Model_Init newInitialize) {
		if (newInitialize != initialize) {
			NotificationChain msgs = null;
			if (initialize != null)
				msgs = ((InternalEObject)initialize).eInverseRemove(this, NUOPCPackage.MODEL_INIT__PARENT, Model_Init.class, msgs);
			if (newInitialize != null)
				msgs = ((InternalEObject)newInitialize).eInverseAdd(this, NUOPCPackage.MODEL_INIT__PARENT, Model_Init.class, msgs);
			msgs = basicSetInitialize(newInitialize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL__INITIALIZE, newInitialize, newInitialize));
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
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_SET_SERVICES:
				if (implementsSetServices != null)
					msgs = ((InternalEObject)implementsSetServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_SET_SERVICES, null, msgs);
				return basicSetImplementsSetServices((ModelImplementsSetServices)otherEnd, msgs);
			case NUOPCPackage.NUOPC_MODEL__INITIALIZE:
				if (initialize != null)
					msgs = ((InternalEObject)initialize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MODEL__INITIALIZE, null, msgs);
				return basicSetInitialize((Model_Init)otherEnd, msgs);
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE:
				if (implementsModelAdvance != null)
					msgs = ((InternalEObject)implementsModelAdvance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE, null, msgs);
				return basicSetImplementsModelAdvance((ModelAdvance)otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_SET_SERVICES:
				return basicSetImplementsSetServices(null, msgs);
			case NUOPCPackage.NUOPC_MODEL__INITIALIZE:
				return basicSetInitialize(null, msgs);
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE:
				return basicSetImplementsModelAdvance(null, msgs);
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
			case NUOPCPackage.NUOPC_MODEL__NAME:
				return getName();
			case NUOPCPackage.NUOPC_MODEL__IMPORTS_GENERIC_SS:
				return getImportsGenericSS();
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_SET_SERVICES:
				return getImplementsSetServices();
			case NUOPCPackage.NUOPC_MODEL__INITIALIZE:
				return getInitialize();
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE:
				return getImplementsModelAdvance();
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
			case NUOPCPackage.NUOPC_MODEL__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL__IMPORTS_GENERIC_SS:
				setImportsGenericSS((String)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_SET_SERVICES:
				setImplementsSetServices((ModelImplementsSetServices)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL__INITIALIZE:
				setInitialize((Model_Init)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE:
				setImplementsModelAdvance((ModelAdvance)newValue);
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
			case NUOPCPackage.NUOPC_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_MODEL__IMPORTS_GENERIC_SS:
				setImportsGenericSS(IMPORTS_GENERIC_SS_EDEFAULT);
				return;
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_SET_SERVICES:
				setImplementsSetServices((ModelImplementsSetServices)null);
				return;
			case NUOPCPackage.NUOPC_MODEL__INITIALIZE:
				setInitialize((Model_Init)null);
				return;
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE:
				setImplementsModelAdvance((ModelAdvance)null);
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
			case NUOPCPackage.NUOPC_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.NUOPC_MODEL__IMPORTS_GENERIC_SS:
				return IMPORTS_GENERIC_SS_EDEFAULT == null ? importsGenericSS != null : !IMPORTS_GENERIC_SS_EDEFAULT.equals(importsGenericSS);
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_SET_SERVICES:
				return implementsSetServices != null;
			case NUOPCPackage.NUOPC_MODEL__INITIALIZE:
				return initialize != null;
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE:
				return implementsModelAdvance != null;
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
		result.append(", importsGenericSS: ");
		result.append(importsGenericSS);
		result.append(')');
		return result.toString();
	}

} //NUOPCModelImpl
