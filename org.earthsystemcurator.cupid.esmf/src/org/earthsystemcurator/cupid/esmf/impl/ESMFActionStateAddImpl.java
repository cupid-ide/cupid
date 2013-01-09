/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFActionStateAdd;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFState;
import org.earthsystemcurator.cupid.esmf.ESMFStateItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action State Add</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateAddImpl#getState <em>State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionStateAddImpl#getItemList <em>Item List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionStateAddImpl extends ESMFActionAPIImpl implements ESMFActionStateAdd {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected ESMFState state;

	/**
	 * The cached value of the '{@link #getItemList() <em>Item List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemList()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFStateItem> itemList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionStateAddImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_STATE_ADD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState getState() {
		if (state != null && state.eIsProxy()) {
			InternalEObject oldState = (InternalEObject)state;
			state = (ESMFState)eResolveProxy(oldState);
			if (state != oldState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_STATE_ADD__STATE, oldState, state));
			}
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState basicGetState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ESMFState newState) {
		ESMFState oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_STATE_ADD__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFStateItem> getItemList() {
		if (itemList == null) {
			itemList = new EObjectResolvingEList<ESMFStateItem>(ESMFStateItem.class, this, ESMFPackage.ESMF_ACTION_STATE_ADD__ITEM_LIST);
		}
		return itemList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_STATE_ADD__STATE:
				if (resolve) return getState();
				return basicGetState();
			case ESMFPackage.ESMF_ACTION_STATE_ADD__ITEM_LIST:
				return getItemList();
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
			case ESMFPackage.ESMF_ACTION_STATE_ADD__STATE:
				setState((ESMFState)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_STATE_ADD__ITEM_LIST:
				getItemList().clear();
				getItemList().addAll((Collection<? extends ESMFStateItem>)newValue);
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
			case ESMFPackage.ESMF_ACTION_STATE_ADD__STATE:
				setState((ESMFState)null);
				return;
			case ESMFPackage.ESMF_ACTION_STATE_ADD__ITEM_LIST:
				getItemList().clear();
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
			case ESMFPackage.ESMF_ACTION_STATE_ADD__STATE:
				return state != null;
			case ESMFPackage.ESMF_ACTION_STATE_ADD__ITEM_LIST:
				return itemList != null && !itemList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ESMFActionStateAddImpl
