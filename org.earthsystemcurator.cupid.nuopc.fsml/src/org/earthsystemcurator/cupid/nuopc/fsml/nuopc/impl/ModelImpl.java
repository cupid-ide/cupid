/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import java.util.Collection;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
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
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImpl#getSinglePublicSubroutine <em>Single Public Subroutine</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImpl#getImplementsSetServices <em>Implements Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImpl#getImplementsInitP1 <em>Implements Init P1</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImpl#getImplementsInitP2 <em>Implements Init P2</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelImpl#getImplementsModelAdvance <em>Implements Model Advance</em>}</li>
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
	 * The default value of the '{@link #getSinglePublicSubroutine() <em>Single Public Subroutine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinglePublicSubroutine()
	 * @generated
	 * @ordered
	 */
	protected static final String SINGLE_PUBLIC_SUBROUTINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSinglePublicSubroutine() <em>Single Public Subroutine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSinglePublicSubroutine()
	 * @generated
	 * @ordered
	 */
	protected String singlePublicSubroutine = SINGLE_PUBLIC_SUBROUTINE_EDEFAULT;

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
	 * The cached value of the '{@link #getImplementsInitP1() <em>Implements Init P1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsInitP1()
	 * @generated
	 * @ordered
	 */
	protected ModelImplementsInitP1 implementsInitP1;

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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL__IMPLEMENTS_SET_SERVICES, oldImplementsSetServices, newImplementsSetServices);
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL__IMPLEMENTS_SET_SERVICES, newImplementsSetServices, newImplementsSetServices));
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
			case NUOPCPackage.MODEL__IMPLEMENTS_SET_SERVICES:
				if (implementsSetServices != null)
					msgs = ((InternalEObject)implementsSetServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.MODEL__IMPLEMENTS_SET_SERVICES, null, msgs);
				return basicSetImplementsSetServices((ModelImplementsSetServices)otherEnd, msgs);
			case NUOPCPackage.MODEL__IMPLEMENTS_MODEL_ADVANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImplementsModelAdvance()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSinglePublicSubroutine() {
		return singlePublicSubroutine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSinglePublicSubroutine(String newSinglePublicSubroutine) {
		String oldSinglePublicSubroutine = singlePublicSubroutine;
		singlePublicSubroutine = newSinglePublicSubroutine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL__SINGLE_PUBLIC_SUBROUTINE, oldSinglePublicSubroutine, singlePublicSubroutine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelImplementsInitP1 getImplementsInitP1() {
		return implementsInitP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementsInitP1(ModelImplementsInitP1 newImplementsInitP1, NotificationChain msgs) {
		ModelImplementsInitP1 oldImplementsInitP1 = implementsInitP1;
		implementsInitP1 = newImplementsInitP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL__IMPLEMENTS_INIT_P1, oldImplementsInitP1, newImplementsInitP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsInitP1(ModelImplementsInitP1 newImplementsInitP1) {
		if (newImplementsInitP1 != implementsInitP1) {
			NotificationChain msgs = null;
			if (implementsInitP1 != null)
				msgs = ((InternalEObject)implementsInitP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.MODEL__IMPLEMENTS_INIT_P1, null, msgs);
			if (newImplementsInitP1 != null)
				msgs = ((InternalEObject)newImplementsInitP1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.MODEL__IMPLEMENTS_INIT_P1, null, msgs);
			msgs = basicSetImplementsInitP1(newImplementsInitP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL__IMPLEMENTS_INIT_P1, newImplementsInitP1, newImplementsInitP1));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL__IMPLEMENTS_INIT_P2, oldImplementsInitP2, newImplementsInitP2);
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
				msgs = ((InternalEObject)implementsInitP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.MODEL__IMPLEMENTS_INIT_P2, null, msgs);
			if (newImplementsInitP2 != null)
				msgs = ((InternalEObject)newImplementsInitP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.MODEL__IMPLEMENTS_INIT_P2, null, msgs);
			msgs = basicSetImplementsInitP2(newImplementsInitP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL__IMPLEMENTS_INIT_P2, newImplementsInitP2, newImplementsInitP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelAdvance> getImplementsModelAdvance() {
		if (implementsModelAdvance == null) {
			implementsModelAdvance = new EObjectContainmentWithInverseEList<ModelAdvance>(ModelAdvance.class, this, NUOPCPackage.MODEL__IMPLEMENTS_MODEL_ADVANCE, NUOPCPackage.MODEL_ADVANCE__PARENT);
		}
		return implementsModelAdvance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.MODEL__IMPLEMENTS_SET_SERVICES:
				return basicSetImplementsSetServices(null, msgs);
			case NUOPCPackage.MODEL__IMPLEMENTS_INIT_P1:
				return basicSetImplementsInitP1(null, msgs);
			case NUOPCPackage.MODEL__IMPLEMENTS_INIT_P2:
				return basicSetImplementsInitP2(null, msgs);
			case NUOPCPackage.MODEL__IMPLEMENTS_MODEL_ADVANCE:
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
			case NUOPCPackage.MODEL__NAME:
				return getName();
			case NUOPCPackage.MODEL__USES_ALL_IMPORTS:
				return isUsesAllImports();
			case NUOPCPackage.MODEL__SINGLE_PUBLIC_SUBROUTINE:
				return getSinglePublicSubroutine();
			case NUOPCPackage.MODEL__IMPLEMENTS_SET_SERVICES:
				return getImplementsSetServices();
			case NUOPCPackage.MODEL__IMPLEMENTS_INIT_P1:
				return getImplementsInitP1();
			case NUOPCPackage.MODEL__IMPLEMENTS_INIT_P2:
				return getImplementsInitP2();
			case NUOPCPackage.MODEL__IMPLEMENTS_MODEL_ADVANCE:
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
			case NUOPCPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.MODEL__USES_ALL_IMPORTS:
				setUsesAllImports((Boolean)newValue);
				return;
			case NUOPCPackage.MODEL__SINGLE_PUBLIC_SUBROUTINE:
				setSinglePublicSubroutine((String)newValue);
				return;
			case NUOPCPackage.MODEL__IMPLEMENTS_SET_SERVICES:
				setImplementsSetServices((ModelImplementsSetServices)newValue);
				return;
			case NUOPCPackage.MODEL__IMPLEMENTS_INIT_P1:
				setImplementsInitP1((ModelImplementsInitP1)newValue);
				return;
			case NUOPCPackage.MODEL__IMPLEMENTS_INIT_P2:
				setImplementsInitP2((ModelImplementsInitP2)newValue);
				return;
			case NUOPCPackage.MODEL__IMPLEMENTS_MODEL_ADVANCE:
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
			case NUOPCPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.MODEL__USES_ALL_IMPORTS:
				setUsesAllImports(USES_ALL_IMPORTS_EDEFAULT);
				return;
			case NUOPCPackage.MODEL__SINGLE_PUBLIC_SUBROUTINE:
				setSinglePublicSubroutine(SINGLE_PUBLIC_SUBROUTINE_EDEFAULT);
				return;
			case NUOPCPackage.MODEL__IMPLEMENTS_SET_SERVICES:
				setImplementsSetServices((ModelImplementsSetServices)null);
				return;
			case NUOPCPackage.MODEL__IMPLEMENTS_INIT_P1:
				setImplementsInitP1((ModelImplementsInitP1)null);
				return;
			case NUOPCPackage.MODEL__IMPLEMENTS_INIT_P2:
				setImplementsInitP2((ModelImplementsInitP2)null);
				return;
			case NUOPCPackage.MODEL__IMPLEMENTS_MODEL_ADVANCE:
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
			case NUOPCPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.MODEL__USES_ALL_IMPORTS:
				return usesAllImports != USES_ALL_IMPORTS_EDEFAULT;
			case NUOPCPackage.MODEL__SINGLE_PUBLIC_SUBROUTINE:
				return SINGLE_PUBLIC_SUBROUTINE_EDEFAULT == null ? singlePublicSubroutine != null : !SINGLE_PUBLIC_SUBROUTINE_EDEFAULT.equals(singlePublicSubroutine);
			case NUOPCPackage.MODEL__IMPLEMENTS_SET_SERVICES:
				return implementsSetServices != null;
			case NUOPCPackage.MODEL__IMPLEMENTS_INIT_P1:
				return implementsInitP1 != null;
			case NUOPCPackage.MODEL__IMPLEMENTS_INIT_P2:
				return implementsInitP2 != null;
			case NUOPCPackage.MODEL__IMPLEMENTS_MODEL_ADVANCE:
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
		result.append(", usesAllImports: ");
		result.append(usesAllImports);
		result.append(", singlePublicSubroutine: ");
		result.append(singlePublicSubroutine);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
