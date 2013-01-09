/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFField;
import org.earthsystemcurator.cupid.esmf.ESMFFieldConnection;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFSimpleCouplerComponent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFieldConnectionImpl#getSrcField <em>Src Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFieldConnectionImpl#getDstField <em>Dst Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFFieldConnectionImpl#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFFieldConnectionImpl extends EObjectImpl implements ESMFFieldConnection {
	/**
	 * The cached value of the '{@link #getSrcField() <em>Src Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcField()
	 * @generated
	 * @ordered
	 */
	protected ESMFField srcField;

	/**
	 * The cached value of the '{@link #getDstField() <em>Dst Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDstField()
	 * @generated
	 * @ordered
	 */
	protected ESMFField dstField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFFieldConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_FIELD_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFField getSrcField() {
		if (srcField != null && srcField.eIsProxy()) {
			InternalEObject oldSrcField = (InternalEObject)srcField;
			srcField = (ESMFField)eResolveProxy(oldSrcField);
			if (srcField != oldSrcField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_FIELD_CONNECTION__SRC_FIELD, oldSrcField, srcField));
			}
		}
		return srcField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFField basicGetSrcField() {
		return srcField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcField(ESMFField newSrcField) {
		ESMFField oldSrcField = srcField;
		srcField = newSrcField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_FIELD_CONNECTION__SRC_FIELD, oldSrcField, srcField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFField getDstField() {
		if (dstField != null && dstField.eIsProxy()) {
			InternalEObject oldDstField = (InternalEObject)dstField;
			dstField = (ESMFField)eResolveProxy(oldDstField);
			if (dstField != oldDstField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_FIELD_CONNECTION__DST_FIELD, oldDstField, dstField));
			}
		}
		return dstField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFField basicGetDstField() {
		return dstField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDstField(ESMFField newDstField) {
		ESMFField oldDstField = dstField;
		dstField = newDstField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_FIELD_CONNECTION__DST_FIELD, oldDstField, dstField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFSimpleCouplerComponent getComponent() {
		if (eContainerFeatureID() != ESMFPackage.ESMF_FIELD_CONNECTION__COMPONENT) return null;
		return (ESMFSimpleCouplerComponent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(ESMFSimpleCouplerComponent newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponent, ESMFPackage.ESMF_FIELD_CONNECTION__COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(ESMFSimpleCouplerComponent newComponent) {
		if (newComponent != eInternalContainer() || (eContainerFeatureID() != ESMFPackage.ESMF_FIELD_CONNECTION__COMPONENT && newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__FIELD_CONNECTION, ESMFSimpleCouplerComponent.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_FIELD_CONNECTION__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ESMFPackage.ESMF_FIELD_CONNECTION__COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponent((ESMFSimpleCouplerComponent)otherEnd, msgs);
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
			case ESMFPackage.ESMF_FIELD_CONNECTION__COMPONENT:
				return basicSetComponent(null, msgs);
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
			case ESMFPackage.ESMF_FIELD_CONNECTION__COMPONENT:
				return eInternalContainer().eInverseRemove(this, ESMFPackage.ESMF_SIMPLE_COUPLER_COMPONENT__FIELD_CONNECTION, ESMFSimpleCouplerComponent.class, msgs);
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
			case ESMFPackage.ESMF_FIELD_CONNECTION__SRC_FIELD:
				if (resolve) return getSrcField();
				return basicGetSrcField();
			case ESMFPackage.ESMF_FIELD_CONNECTION__DST_FIELD:
				if (resolve) return getDstField();
				return basicGetDstField();
			case ESMFPackage.ESMF_FIELD_CONNECTION__COMPONENT:
				return getComponent();
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
			case ESMFPackage.ESMF_FIELD_CONNECTION__SRC_FIELD:
				setSrcField((ESMFField)newValue);
				return;
			case ESMFPackage.ESMF_FIELD_CONNECTION__DST_FIELD:
				setDstField((ESMFField)newValue);
				return;
			case ESMFPackage.ESMF_FIELD_CONNECTION__COMPONENT:
				setComponent((ESMFSimpleCouplerComponent)newValue);
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
			case ESMFPackage.ESMF_FIELD_CONNECTION__SRC_FIELD:
				setSrcField((ESMFField)null);
				return;
			case ESMFPackage.ESMF_FIELD_CONNECTION__DST_FIELD:
				setDstField((ESMFField)null);
				return;
			case ESMFPackage.ESMF_FIELD_CONNECTION__COMPONENT:
				setComponent((ESMFSimpleCouplerComponent)null);
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
			case ESMFPackage.ESMF_FIELD_CONNECTION__SRC_FIELD:
				return srcField != null;
			case ESMFPackage.ESMF_FIELD_CONNECTION__DST_FIELD:
				return dstField != null;
			case ESMFPackage.ESMF_FIELD_CONNECTION__COMPONENT:
				return getComponent() != null;
		}
		return super.eIsSet(featureID);
	}

} //ESMFFieldConnectionImpl
