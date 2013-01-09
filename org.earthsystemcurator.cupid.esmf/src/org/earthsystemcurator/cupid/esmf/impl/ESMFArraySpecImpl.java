/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFArraySpec;
import org.earthsystemcurator.cupid.esmf.ESMFComponent;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFTypeKind;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFArraySpecImpl#getTypekind <em>Typekind</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFArraySpecImpl#getRank <em>Rank</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFArraySpecImpl#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFArraySpecImpl extends EObjectImpl implements ESMFArraySpec {
	/**
	 * The default value of the '{@link #getTypekind() <em>Typekind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypekind()
	 * @generated
	 * @ordered
	 */
	protected static final ESMFTypeKind TYPEKIND_EDEFAULT = ESMFTypeKind.ESMF_TYPEKIND_I1;

	/**
	 * The cached value of the '{@link #getTypekind() <em>Typekind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypekind()
	 * @generated
	 * @ordered
	 */
	protected ESMFTypeKind typekind = TYPEKIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected static final int RANK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRank() <em>Rank</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRank()
	 * @generated
	 * @ordered
	 */
	protected int rank = RANK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFArraySpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ARRAY_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFTypeKind getTypekind() {
		return typekind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypekind(ESMFTypeKind newTypekind) {
		ESMFTypeKind oldTypekind = typekind;
		typekind = newTypekind == null ? TYPEKIND_EDEFAULT : newTypekind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ARRAY_SPEC__TYPEKIND, oldTypekind, typekind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRank(int newRank) {
		int oldRank = rank;
		rank = newRank;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ARRAY_SPEC__RANK, oldRank, rank));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFComponent getComponent() {
		if (eContainerFeatureID() != ESMFPackage.ESMF_ARRAY_SPEC__COMPONENT) return null;
		return (ESMFComponent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(ESMFComponent newComponent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newComponent, ESMFPackage.ESMF_ARRAY_SPEC__COMPONENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(ESMFComponent newComponent) {
		if (newComponent != eInternalContainer() || (eContainerFeatureID() != ESMFPackage.ESMF_ARRAY_SPEC__COMPONENT && newComponent != null)) {
			if (EcoreUtil.isAncestor(this, newComponent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, ESMFPackage.ESMF_COMPONENT__ARRAY_SPEC, ESMFComponent.class, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ARRAY_SPEC__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ESMFPackage.ESMF_ARRAY_SPEC__COMPONENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetComponent((ESMFComponent)otherEnd, msgs);
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
			case ESMFPackage.ESMF_ARRAY_SPEC__COMPONENT:
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
			case ESMFPackage.ESMF_ARRAY_SPEC__COMPONENT:
				return eInternalContainer().eInverseRemove(this, ESMFPackage.ESMF_COMPONENT__ARRAY_SPEC, ESMFComponent.class, msgs);
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
			case ESMFPackage.ESMF_ARRAY_SPEC__TYPEKIND:
				return getTypekind();
			case ESMFPackage.ESMF_ARRAY_SPEC__RANK:
				return getRank();
			case ESMFPackage.ESMF_ARRAY_SPEC__COMPONENT:
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
			case ESMFPackage.ESMF_ARRAY_SPEC__TYPEKIND:
				setTypekind((ESMFTypeKind)newValue);
				return;
			case ESMFPackage.ESMF_ARRAY_SPEC__RANK:
				setRank((Integer)newValue);
				return;
			case ESMFPackage.ESMF_ARRAY_SPEC__COMPONENT:
				setComponent((ESMFComponent)newValue);
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
			case ESMFPackage.ESMF_ARRAY_SPEC__TYPEKIND:
				setTypekind(TYPEKIND_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ARRAY_SPEC__RANK:
				setRank(RANK_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ARRAY_SPEC__COMPONENT:
				setComponent((ESMFComponent)null);
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
			case ESMFPackage.ESMF_ARRAY_SPEC__TYPEKIND:
				return typekind != TYPEKIND_EDEFAULT;
			case ESMFPackage.ESMF_ARRAY_SPEC__RANK:
				return rank != RANK_EDEFAULT;
			case ESMFPackage.ESMF_ARRAY_SPEC__COMPONENT:
				return getComponent() != null;
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
		result.append(" (typekind: ");
		result.append(typekind);
		result.append(", rank: ");
		result.append(rank);
		result.append(')');
		return result.toString();
	}

} //ESMFArraySpecImpl
