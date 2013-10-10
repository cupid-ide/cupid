/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model_Init;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.Model_InitImpl#getImplementsInitP1 <em>Implements Init P1</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.Model_InitImpl#getImplementsInitP2 <em>Implements Init P2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Model_InitImpl extends EObjectImpl implements Model_Init {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Model_InitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.MODEL_INIT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P1, oldImplementsInitP1, newImplementsInitP1);
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
				msgs = ((InternalEObject)implementsInitP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P1, null, msgs);
			if (newImplementsInitP1 != null)
				msgs = ((InternalEObject)newImplementsInitP1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P1, null, msgs);
			msgs = basicSetImplementsInitP1(newImplementsInitP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P1, newImplementsInitP1, newImplementsInitP1));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P2, oldImplementsInitP2, newImplementsInitP2);
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
				msgs = ((InternalEObject)implementsInitP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P2, null, msgs);
			if (newImplementsInitP2 != null)
				msgs = ((InternalEObject)newImplementsInitP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P2, null, msgs);
			msgs = basicSetImplementsInitP2(newImplementsInitP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P2, newImplementsInitP2, newImplementsInitP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P1:
				return basicSetImplementsInitP1(null, msgs);
			case NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P2:
				return basicSetImplementsInitP2(null, msgs);
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
			case NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P1:
				return getImplementsInitP1();
			case NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P2:
				return getImplementsInitP2();
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
			case NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P1:
				setImplementsInitP1((ModelImplementsInitP1)newValue);
				return;
			case NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P2:
				setImplementsInitP2((ModelImplementsInitP2)newValue);
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
			case NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P1:
				setImplementsInitP1((ModelImplementsInitP1)null);
				return;
			case NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P2:
				setImplementsInitP2((ModelImplementsInitP2)null);
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
			case NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P1:
				return implementsInitP1 != null;
			case NUOPCPackage.MODEL_INIT__IMPLEMENTS_INIT_P2:
				return implementsInitP2 != null;
		}
		return super.eIsSet(featureID);
	}

} //Model_InitImpl
