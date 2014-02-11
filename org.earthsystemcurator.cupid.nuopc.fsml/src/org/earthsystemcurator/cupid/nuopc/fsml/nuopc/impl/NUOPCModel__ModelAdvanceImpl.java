/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance__Attached;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ModelAdvance__ImplementsSubroutine;
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
 * An implementation of the model object '<em><b>Model Model Advance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ModelAdvanceImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ModelAdvanceImpl#getImplementsSubroutine <em>Implements Subroutine</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.NUOPCModel__ModelAdvanceImpl#getAttached <em>Attached</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NUOPCModel__ModelAdvanceImpl extends EObjectImpl implements NUOPCModel__ModelAdvance {
	/**
	 * The cached value of the '{@link #getImplementsSubroutine() <em>Implements Subroutine</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementsSubroutine()
	 * @generated
	 * @ordered
	 */
	protected NUOPCModel__ModelAdvance__ImplementsSubroutine implementsSubroutine;

	/**
	 * The cached value of the '{@link #getAttached() <em>Attached</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttached()
	 * @generated
	 * @ordered
	 */
	protected NUOPCModel__ModelAdvance__Attached attached;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NUOPCModel__ModelAdvanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.NUOPC_MODEL_MODEL_ADVANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel getParent() {
		if (eContainerFeatureID() != NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__PARENT) return null;
		return (NUOPCModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(NUOPCModel newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NUOPCModel newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.NUOPC_MODEL__MODEL_ADVANCE, NUOPCModel.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel__ModelAdvance__ImplementsSubroutine getImplementsSubroutine() {
		return implementsSubroutine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementsSubroutine(NUOPCModel__ModelAdvance__ImplementsSubroutine newImplementsSubroutine, NotificationChain msgs) {
		NUOPCModel__ModelAdvance__ImplementsSubroutine oldImplementsSubroutine = implementsSubroutine;
		implementsSubroutine = newImplementsSubroutine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__IMPLEMENTS_SUBROUTINE, oldImplementsSubroutine, newImplementsSubroutine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementsSubroutine(NUOPCModel__ModelAdvance__ImplementsSubroutine newImplementsSubroutine) {
		if (newImplementsSubroutine != implementsSubroutine) {
			NotificationChain msgs = null;
			if (implementsSubroutine != null)
				msgs = ((InternalEObject)implementsSubroutine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__IMPLEMENTS_SUBROUTINE, null, msgs);
			if (newImplementsSubroutine != null)
				msgs = ((InternalEObject)newImplementsSubroutine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__IMPLEMENTS_SUBROUTINE, null, msgs);
			msgs = basicSetImplementsSubroutine(newImplementsSubroutine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__IMPLEMENTS_SUBROUTINE, newImplementsSubroutine, newImplementsSubroutine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel__ModelAdvance__Attached getAttached() {
		return attached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttached(NUOPCModel__ModelAdvance__Attached newAttached, NotificationChain msgs) {
		NUOPCModel__ModelAdvance__Attached oldAttached = attached;
		attached = newAttached;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__ATTACHED, oldAttached, newAttached);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttached(NUOPCModel__ModelAdvance__Attached newAttached) {
		if (newAttached != attached) {
			NotificationChain msgs = null;
			if (attached != null)
				msgs = ((InternalEObject)attached).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__ATTACHED, null, msgs);
			if (newAttached != null)
				msgs = ((InternalEObject)newAttached).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__ATTACHED, null, msgs);
			msgs = basicSetAttached(newAttached, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__ATTACHED, newAttached, newAttached));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((NUOPCModel)otherEnd, msgs);
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
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__PARENT:
				return basicSetParent(null, msgs);
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__IMPLEMENTS_SUBROUTINE:
				return basicSetImplementsSubroutine(null, msgs);
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__ATTACHED:
				return basicSetAttached(null, msgs);
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
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.NUOPC_MODEL__MODEL_ADVANCE, NUOPCModel.class, msgs);
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
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__PARENT:
				return getParent();
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__IMPLEMENTS_SUBROUTINE:
				return getImplementsSubroutine();
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__ATTACHED:
				return getAttached();
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
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__PARENT:
				setParent((NUOPCModel)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__IMPLEMENTS_SUBROUTINE:
				setImplementsSubroutine((NUOPCModel__ModelAdvance__ImplementsSubroutine)newValue);
				return;
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__ATTACHED:
				setAttached((NUOPCModel__ModelAdvance__Attached)newValue);
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
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__PARENT:
				setParent((NUOPCModel)null);
				return;
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__IMPLEMENTS_SUBROUTINE:
				setImplementsSubroutine((NUOPCModel__ModelAdvance__ImplementsSubroutine)null);
				return;
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__ATTACHED:
				setAttached((NUOPCModel__ModelAdvance__Attached)null);
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
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__PARENT:
				return getParent() != null;
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__IMPLEMENTS_SUBROUTINE:
				return implementsSubroutine != null;
			case NUOPCPackage.NUOPC_MODEL_MODEL_ADVANCE__ATTACHED:
				return attached != null;
		}
		return super.eIsSet(featureID);
	}

} //NUOPCModel__ModelAdvanceImpl
