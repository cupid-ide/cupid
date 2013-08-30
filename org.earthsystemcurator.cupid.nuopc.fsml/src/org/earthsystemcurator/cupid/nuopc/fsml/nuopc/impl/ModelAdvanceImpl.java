/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Advance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelAdvanceImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelAdvanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.ModelAdvanceImpl#isAttachedInSetServices <em>Attached In Set Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelAdvanceImpl extends EObjectImpl implements ModelAdvance {
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
	 * The cached setting delegate for the '{@link #isAttachedInSetServices() <em>Attached In Set Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttachedInSetServices()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ATTACHED_IN_SET_SERVICES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)NUOPCPackage.Literals.MODEL_ADVANCE__ATTACHED_IN_SET_SERVICES).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelAdvanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.MODEL_ADVANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NUOPCModel getParent() {
		if (eContainerFeatureID() != NUOPCPackage.MODEL_ADVANCE__PARENT) return null;
		return (NUOPCModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(NUOPCModel newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.MODEL_ADVANCE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(NUOPCModel newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.MODEL_ADVANCE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE, NUOPCModel.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_ADVANCE__PARENT, newParent, newParent));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.MODEL_ADVANCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttachedInSetServices() {
		return (Boolean)ATTACHED_IN_SET_SERVICES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachedInSetServices(boolean newAttachedInSetServices) {
		ATTACHED_IN_SET_SERVICES__ESETTING_DELEGATE.dynamicSet(this, null, 0, newAttachedInSetServices);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.MODEL_ADVANCE__PARENT:
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
			case NUOPCPackage.MODEL_ADVANCE__PARENT:
				return basicSetParent(null, msgs);
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
			case NUOPCPackage.MODEL_ADVANCE__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.NUOPC_MODEL__IMPLEMENTS_MODEL_ADVANCE, NUOPCModel.class, msgs);
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
			case NUOPCPackage.MODEL_ADVANCE__PARENT:
				return getParent();
			case NUOPCPackage.MODEL_ADVANCE__NAME:
				return getName();
			case NUOPCPackage.MODEL_ADVANCE__ATTACHED_IN_SET_SERVICES:
				return isAttachedInSetServices();
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
			case NUOPCPackage.MODEL_ADVANCE__PARENT:
				setParent((NUOPCModel)newValue);
				return;
			case NUOPCPackage.MODEL_ADVANCE__NAME:
				setName((String)newValue);
				return;
			case NUOPCPackage.MODEL_ADVANCE__ATTACHED_IN_SET_SERVICES:
				setAttachedInSetServices((Boolean)newValue);
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
			case NUOPCPackage.MODEL_ADVANCE__PARENT:
				setParent((NUOPCModel)null);
				return;
			case NUOPCPackage.MODEL_ADVANCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case NUOPCPackage.MODEL_ADVANCE__ATTACHED_IN_SET_SERVICES:
				ATTACHED_IN_SET_SERVICES__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
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
			case NUOPCPackage.MODEL_ADVANCE__PARENT:
				return getParent() != null;
			case NUOPCPackage.MODEL_ADVANCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case NUOPCPackage.MODEL_ADVANCE__ATTACHED_IN_SET_SERVICES:
				return ATTACHED_IN_SET_SERVICES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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

} //ModelAdvanceImpl
