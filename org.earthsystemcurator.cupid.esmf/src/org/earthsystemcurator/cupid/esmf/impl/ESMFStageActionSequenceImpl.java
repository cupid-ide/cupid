/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFStage;
import org.earthsystemcurator.cupid.esmf.ESMFStageAction;
import org.earthsystemcurator.cupid.esmf.ESMFStageActionSequence;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stage Action Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFStageActionSequenceImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFStageActionSequenceImpl#getStage <em>Stage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFStageActionSequenceImpl extends ESMFStageActionImpl implements ESMFStageActionSequence {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFStageAction> action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFStageActionSequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_STAGE_ACTION_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFStageAction> getAction() {
		if (action == null) {
			action = new EObjectContainmentWithInverseEList<ESMFStageAction>(ESMFStageAction.class, this, ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__ACTION, ESMFPackage.ESMF_STAGE_ACTION__PARENT);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFStage getStage() {
		if (eContainerFeatureID() != ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__STAGE) return null;
		return (ESMFStage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStage(ESMFStage newStage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStage, ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__STAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(ESMFStage newStage) {
		if (newStage != eInternalContainer() || (eContainerFeatureID() != ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__STAGE && newStage != null)) {
			if (EcoreUtil.isAncestor(this, newStage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStage != null)
				msgs = ((InternalEObject)newStage).eInverseAdd(this, ESMFPackage.ESMF_STAGE__ACTIONS, ESMFStage.class, msgs);
			msgs = basicSetStage(newStage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__STAGE, newStage, newStage));
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
			case ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__ACTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAction()).basicAdd(otherEnd, msgs);
			case ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__STAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStage((ESMFStage)otherEnd, msgs);
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
			case ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__STAGE:
				return basicSetStage(null, msgs);
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
			case ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__STAGE:
				return eInternalContainer().eInverseRemove(this, ESMFPackage.ESMF_STAGE__ACTIONS, ESMFStage.class, msgs);
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
			case ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__ACTION:
				return getAction();
			case ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__STAGE:
				return getStage();
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
			case ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends ESMFStageAction>)newValue);
				return;
			case ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__STAGE:
				setStage((ESMFStage)newValue);
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
			case ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__ACTION:
				getAction().clear();
				return;
			case ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__STAGE:
				setStage((ESMFStage)null);
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
			case ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__ACTION:
				return action != null && !action.isEmpty();
			case ESMFPackage.ESMF_STAGE_ACTION_SEQUENCE__STAGE:
				return getStage() != null;
		}
		return super.eIsSet(featureID);
	}

} //ESMFStageActionSequenceImpl
