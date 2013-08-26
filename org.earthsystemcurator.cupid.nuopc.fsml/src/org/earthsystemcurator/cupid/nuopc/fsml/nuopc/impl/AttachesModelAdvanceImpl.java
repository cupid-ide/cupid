/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices;
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
 * An implementation of the model object '<em><b>Attaches Model Advance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesModelAdvanceImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesModelAdvanceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.impl.AttachesModelAdvanceImpl#getUserRoutine <em>User Routine</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttachesModelAdvanceImpl extends EObjectImpl implements AttachesModelAdvance {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserRoutine() <em>User Routine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRoutine()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ROUTINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserRoutine() <em>User Routine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserRoutine()
	 * @generated
	 * @ordered
	 */
	protected String userRoutine = USER_ROUTINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachesModelAdvanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NUOPCPackage.Literals.ATTACHES_MODEL_ADVANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelImplementsSetServices getParent() {
		if (eContainerFeatureID() != NUOPCPackage.ATTACHES_MODEL_ADVANCE__PARENT) return null;
		return (ModelImplementsSetServices)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(ModelImplementsSetServices newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, NUOPCPackage.ATTACHES_MODEL_ADVANCE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(ModelImplementsSetServices newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != NUOPCPackage.ATTACHES_MODEL_ADVANCE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_MODEL_ADVANCE, ModelImplementsSetServices.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.ATTACHES_MODEL_ADVANCE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.ATTACHES_MODEL_ADVANCE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserRoutine() {
		return userRoutine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserRoutine(String newUserRoutine) {
		String oldUserRoutine = userRoutine;
		userRoutine = newUserRoutine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NUOPCPackage.ATTACHES_MODEL_ADVANCE__USER_ROUTINE, oldUserRoutine, userRoutine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((ModelImplementsSetServices)otherEnd, msgs);
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
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE__PARENT:
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
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE__PARENT:
				return eInternalContainer().eInverseRemove(this, NUOPCPackage.MODEL_IMPLEMENTS_SET_SERVICES__ATTACHES_MODEL_ADVANCE, ModelImplementsSetServices.class, msgs);
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
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE__PARENT:
				return getParent();
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE__LABEL:
				return getLabel();
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE__USER_ROUTINE:
				return getUserRoutine();
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
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE__PARENT:
				setParent((ModelImplementsSetServices)newValue);
				return;
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE__LABEL:
				setLabel((String)newValue);
				return;
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE__USER_ROUTINE:
				setUserRoutine((String)newValue);
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
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE__PARENT:
				setParent((ModelImplementsSetServices)null);
				return;
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE__USER_ROUTINE:
				setUserRoutine(USER_ROUTINE_EDEFAULT);
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
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE__PARENT:
				return getParent() != null;
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case NUOPCPackage.ATTACHES_MODEL_ADVANCE__USER_ROUTINE:
				return USER_ROUTINE_EDEFAULT == null ? userRoutine != null : !USER_ROUTINE_EDEFAULT.equals(userRoutine);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", userRoutine: ");
		result.append(userRoutine);
		result.append(')');
		return result.toString();
	}

} //AttachesModelAdvanceImpl
