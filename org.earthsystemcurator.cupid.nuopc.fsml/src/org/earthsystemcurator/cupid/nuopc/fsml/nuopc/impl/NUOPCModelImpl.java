/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices;
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
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModelImpl#getImplementsInitP1 <em>Implements Init P1</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModelImpl#getImplementsInitP2 <em>Implements Init P2</em>}</li>
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
	 * The cached value of the '{@link #getImplementsInitP1() <em>Implements Init P1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsInitP1()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelImplementsInitP1> implementsInitP1;

	/**
	 * The cached value of the '{@link #getImplementsInitP2() <em>Implements Init P2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsInitP2()
	 * @generated
	 * @ordered
	 */
	protected ModelImplementsInitP2 implementsInitP2;

	/**
	 * The cached value of the '{@link #getImplementsModelAdvance() <em>Implements Model Advance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsModelAdvance()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelAdvance> implementsModelAdvance;

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
	public EList<ModelImplementsInitP1> getImplementsInitP1() {
		if (implementsInitP1 == null) {
			implementsInitP1 = new EObjectContainmentEList<ModelImplementsInitP1>(ModelImplementsInitP1.class, this, NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_INIT_P1);
		}
		return implementsInitP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelImplementsInitP2 getImplementsInitP2() {
		return implementsInitP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementsInitP2(ModelImplementsInitP2 newImplementsInitP2, NotificationChain msgs) {
		ModelImplementsInitP2 oldImplementsInitP2 = implementsInitP2;
		implementsInitP2 = newImplementsInitP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_INIT_P2, oldImplementsInitP2, newImplementsInitP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsInitP2(ModelImplementsInitP2 newImplementsInitP2) {
		if (newImplementsInitP2 != implementsInitP2) {
			NotificationChain msgs = null;
			if (implementsInitP2 != null)
				msgs = ((InternalEObject)implementsInitP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_INIT_P2, null, msgs);
			if (newImplementsInitP2 != null)
				msgs = ((InternalEObject)newImplementsInitP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_INIT_P2, null, msgs);
			msgs = basicSetImplementsInitP2(newImplementsInitP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_INIT_P2, newImplementsInitP2, newImplementsInitP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelAdvance> getImplementsModelAdvance() {
		if (implementsModelAdvance == null) {
			implementsModelAdvance = new EObjectContainmentWithInverseEList<ModelAdvance>(ModelAdvance.class, this, NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE, NUOPCPackage.MODEL_ADVANCE__PARENT);
		}
		return implementsModelAdvance;
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
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementsModelAdvance()).basicAdd(otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_INIT_P1:
				return ((InternalEList<?>)getImplementsInitP1()).basicRemove(otherEnd, msgs);
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_INIT_P2:
				return basicSetImplementsInitP2(null, msgs);
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE:
				return ((InternalEList<?>)getImplementsModelAdvance()).basicRemove(otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_INIT_P1:
				return getImplementsInitP1();
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_INIT_P2:
				return getImplementsInitP2();
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
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_INIT_P1:
				getImplementsInitP1().clear();
				getImplementsInitP1().addAll((Collection<? extends ModelImplementsInitP1>)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_INIT_P2:
				setImplementsInitP2((ModelImplementsInitP2)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE:
				getImplementsModelAdvance().clear();
				getImplementsModelAdvance().addAll((Collection<? extends ModelAdvance>)newValue);
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
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_INIT_P1:
				getImplementsInitP1().clear();
				return;
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_INIT_P2:
				setImplementsInitP2((ModelImplementsInitP2)null);
				return;
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE:
				getImplementsModelAdvance().clear();
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
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_INIT_P1:
				return implementsInitP1 != null && !implementsInitP1.isEmpty();
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_INIT_P2:
				return implementsInitP2 != null;
			case NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE:
				return implementsModelAdvance != null && !implementsModelAdvance.isEmpty();
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
