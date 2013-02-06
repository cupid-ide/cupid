/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFFieldConnection;
import org.earthsystemcurator.cupid.esmf.ESMFGriddedComponent;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFSimpleCouplerComponent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFSimpleCouplerComponentImpl#getSrcComponent <em>Src Component</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFSimpleCouplerComponentImpl#getDstComponent <em>Dst Component</em>}</li>
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
	 * The cached value of the '{@link #getSrcComponent() <em>Src Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcComponent()
	 * @generated
	 * @ordered
	 */
	protected ESMFGriddedComponent srcComponent;
	/**
	 * The cached value of the '{@link #getDstComponent() <em>Dst Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDstComponent()
	 * @generated
	 * @ordered
	 */
	protected ESMFGriddedComponent dstComponent;

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
	public ESMFGriddedComponent getSrcComponent() {
		if (srcComponent != null && srcComponent.eIsProxy()) {
			InternalEObject oldSrcComponent = (InternalEObject)srcComponent;
			srcComponent = (ESMFGriddedComponent)eResolveProxy(oldSrcComponent);
			if (srcComponent != oldSrcComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__SRC_COMPONENT, oldSrcComponent, srcComponent));
			}
		}
		return srcComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFGriddedComponent basicGetSrcComponent() {
		return srcComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcComponent(ESMFGriddedComponent newSrcComponent) {
		ESMFGriddedComponent oldSrcComponent = srcComponent;
		srcComponent = newSrcComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__SRC_COMPONENT, oldSrcComponent, srcComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFGriddedComponent getDstComponent() {
		if (dstComponent != null && dstComponent.eIsProxy()) {
			InternalEObject oldDstComponent = (InternalEObject)dstComponent;
			dstComponent = (ESMFGriddedComponent)eResolveProxy(oldDstComponent);
			if (dstComponent != oldDstComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__DST_COMPONENT, oldDstComponent, dstComponent));
			}
		}
		return dstComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFGriddedComponent basicGetDstComponent() {
		return dstComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDstComponent(ESMFGriddedComponent newDstComponent) {
		ESMFGriddedComponent oldDstComponent = dstComponent;
		dstComponent = newDstComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__DST_COMPONENT, oldDstComponent, dstComponent));
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
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__SRC_COMPONENT:
				if (resolve) return getSrcComponent();
				return basicGetSrcComponent();
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__DST_COMPONENT:
				if (resolve) return getDstComponent();
				return basicGetDstComponent();
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
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__SRC_COMPONENT:
				setSrcComponent((ESMFGriddedComponent)newValue);
				return;
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__DST_COMPONENT:
				setDstComponent((ESMFGriddedComponent)newValue);
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
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__SRC_COMPONENT:
				setSrcComponent((ESMFGriddedComponent)null);
				return;
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__DST_COMPONENT:
				setDstComponent((ESMFGriddedComponent)null);
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
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__SRC_COMPONENT:
				return srcComponent != null;
			case ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__DST_COMPONENT:
				return dstComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //ESMFSimpleCouplerComponentImpl
