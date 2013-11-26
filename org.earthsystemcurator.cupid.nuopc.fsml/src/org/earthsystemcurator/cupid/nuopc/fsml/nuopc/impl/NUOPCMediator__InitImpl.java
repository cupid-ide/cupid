/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP1;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__ImplementsInitP2;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__Init;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mediator Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__InitImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__InitImpl#getImplementsInitP1 <em>Implements Init P1</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCMediator__InitImpl#getImplementsInitP2 <em>Implements Init P2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCMediator__InitImpl extends EObjectImpl implements NUOPCMediator__Init {
	/**
	 * The cached value of the '{@link #getImplementsInitP1() <em>Implements Init P1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsInitP1()
	 * @generated
	 * @ordered
	 */
	protected NUOPCMediator__ImplementsInitP1 implementsInitP1;

	/**
	 * The cached value of the '{@link #getImplementsInitP2() <em>Implements Init P2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsInitP2()
	 * @generated
	 * @ordered
	 */
	protected NUOPCMediator__ImplementsInitP2 implementsInitP2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCMediator__InitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_MEDIATOR_INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator getParent() {
		if (eContainerFeatureID() != NUOPCPackage.NUOPC_MEDIATOR_INIT__PARENT) return null;
		return (NUOPCMediator)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(NUOPCMediator newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.NUOPC_MEDIATOR_INIT__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NUOPCMediator newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.NUOPC_MEDIATOR_INIT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.NUOPC_MEDIATOR__INITIALIZE, NUOPCMediator.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MEDIATOR_INIT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator__ImplementsInitP1 getImplementsInitP1() {
		return implementsInitP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementsInitP1(NUOPCMediator__ImplementsInitP1 newImplementsInitP1, NotificationChain msgs) {
		NUOPCMediator__ImplementsInitP1 oldImplementsInitP1 = implementsInitP1;
		implementsInitP1 = newImplementsInitP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P1, oldImplementsInitP1, newImplementsInitP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsInitP1(NUOPCMediator__ImplementsInitP1 newImplementsInitP1) {
		if (newImplementsInitP1 != implementsInitP1) {
			NotificationChain msgs = null;
			if (implementsInitP1 != null)
				msgs = ((InternalEObject)implementsInitP1).eInverseRemove(this, NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__PARENT, NUOPCMediator__ImplementsInitP1.class, msgs);
			if (newImplementsInitP1 != null)
				msgs = ((InternalEObject)newImplementsInitP1).eInverseAdd(this, NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P1__PARENT, NUOPCMediator__ImplementsInitP1.class, msgs);
			msgs = basicSetImplementsInitP1(newImplementsInitP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P1, newImplementsInitP1, newImplementsInitP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCMediator__ImplementsInitP2 getImplementsInitP2() {
		return implementsInitP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementsInitP2(NUOPCMediator__ImplementsInitP2 newImplementsInitP2, NotificationChain msgs) {
		NUOPCMediator__ImplementsInitP2 oldImplementsInitP2 = implementsInitP2;
		implementsInitP2 = newImplementsInitP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P2, oldImplementsInitP2, newImplementsInitP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsInitP2(NUOPCMediator__ImplementsInitP2 newImplementsInitP2) {
		if (newImplementsInitP2 != implementsInitP2) {
			NotificationChain msgs = null;
			if (implementsInitP2 != null)
				msgs = ((InternalEObject)implementsInitP2).eInverseRemove(this, NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__PARENT, NUOPCMediator__ImplementsInitP2.class, msgs);
			if (newImplementsInitP2 != null)
				msgs = ((InternalEObject)newImplementsInitP2).eInverseAdd(this, NUOPCPackage.NUOPC_MEDIATOR_IMPLEMENTS_INIT_P2__PARENT, NUOPCMediator__ImplementsInitP2.class, msgs);
			msgs = basicSetImplementsInitP2(newImplementsInitP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P2, newImplementsInitP2, newImplementsInitP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((NUOPCMediator)otherEnd, msgs);
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P1:
				if (implementsInitP1 != null)
					msgs = ((InternalEObject)implementsInitP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P1, null, msgs);
				return basicSetImplementsInitP1((NUOPCMediator__ImplementsInitP1)otherEnd, msgs);
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P2:
				if (implementsInitP2 != null)
					msgs = ((InternalEObject)implementsInitP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P2, null, msgs);
				return basicSetImplementsInitP2((NUOPCMediator__ImplementsInitP2)otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__PARENT:
				return basicSetParent(null, msgs);
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P1:
				return basicSetImplementsInitP1(null, msgs);
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P2:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.NUOPC_MEDIATOR__INITIALIZE, NUOPCMediator.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__PARENT:
				return getParent();
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P1:
				return getImplementsInitP1();
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P2:
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
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__PARENT:
				setParent((NUOPCMediator)newValue);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P1:
				setImplementsInitP1((NUOPCMediator__ImplementsInitP1)newValue);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P2:
				setImplementsInitP2((NUOPCMediator__ImplementsInitP2)newValue);
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
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__PARENT:
				setParent((NUOPCMediator)null);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P1:
				setImplementsInitP1((NUOPCMediator__ImplementsInitP1)null);
				return;
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P2:
				setImplementsInitP2((NUOPCMediator__ImplementsInitP2)null);
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
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__PARENT:
				return getParent() != null;
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P1:
				return implementsInitP1 != null;
			case NUOPCPackage.NUOPC_MEDIATOR_INIT__IMPLEMENTS_INIT_P2:
				return implementsInitP2 != null;
		}
		return super.eIsSet(featureID);
	}

} //NUOPCMediator__InitImpl
