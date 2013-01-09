/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFFieldConnection;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFSimpleCouplerComponent;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Coupler Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFSimpleCouplerComponentImpl#getFieldConnection <em>Field Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFSimpleCouplerComponentImpl extends ESMFCouplerComponentImpl implements ESMFSimpleCouplerComponent {
	/**
	 * The cached value of the '{@link #getFieldConnection() <em>Field Connection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldConnection()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFFieldConnection> fieldConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFSimpleCouplerComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_SIMPLE_COUPLER_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFFieldConnection> getFieldConnection() {
		if (fieldConnection == null) {
			fieldConnection = new EObjectContainmentWithInverseEList<ESMFFieldConnection>(ESMFFieldConnection.class, this, ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__FIELD_CONNECTION, ESMFPackage.ESMF_FIELD_CONNECTION__COMPONENT);
		}
		return fieldConnection;
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
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__FIELD_CONNECTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFieldConnection()).basicAdd(otherEnd, msgs);
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
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__FIELD_CONNECTION:
				return ((InternalEList<?>)getFieldConnection()).basicRemove(otherEnd, msgs);
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
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__FIELD_CONNECTION:
				return getFieldConnection();
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
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__FIELD_CONNECTION:
				getFieldConnection().clear();
				getFieldConnection().addAll((Collection<? extends ESMFFieldConnection>)newValue);
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
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__FIELD_CONNECTION:
				getFieldConnection().clear();
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
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__FIELD_CONNECTION:
				return fieldConnection != null && !fieldConnection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ESMFSimpleCouplerComponentImpl
