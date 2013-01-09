/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionFieldGetBounds;
import org.earthsystemcurator.cupid.esmf.ESMFField;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Field Get Bounds</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldGetBoundsImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldGetBoundsImpl#getExclusiveLBound <em>Exclusive LBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldGetBoundsImpl#getExclusiveUBound <em>Exclusive UBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldGetBoundsImpl#getComputationalLBound <em>Computational LBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldGetBoundsImpl#getComputationalUBound <em>Computational UBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldGetBoundsImpl#getTotalLBound <em>Total LBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionFieldGetBoundsImpl#getTotalUBound <em>Total UBound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionFieldGetBoundsImpl extends ESMFActionAPIImpl implements ESMFActionFieldGetBounds {
	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected ESMFField field;

	/**
	 * The default value of the '{@link #getExclusiveLBound() <em>Exclusive LBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveLBound()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUSIVE_LBOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclusiveLBound() <em>Exclusive LBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveLBound()
	 * @generated
	 * @ordered
	 */
	protected String exclusiveLBound = EXCLUSIVE_LBOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getExclusiveUBound() <em>Exclusive UBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveUBound()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUSIVE_UBOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclusiveUBound() <em>Exclusive UBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveUBound()
	 * @generated
	 * @ordered
	 */
	protected String exclusiveUBound = EXCLUSIVE_UBOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getComputationalLBound() <em>Computational LBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputationalLBound()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPUTATIONAL_LBOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComputationalLBound() <em>Computational LBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputationalLBound()
	 * @generated
	 * @ordered
	 */
	protected String computationalLBound = COMPUTATIONAL_LBOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getComputationalUBound() <em>Computational UBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputationalUBound()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPUTATIONAL_UBOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComputationalUBound() <em>Computational UBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputationalUBound()
	 * @generated
	 * @ordered
	 */
	protected String computationalUBound = COMPUTATIONAL_UBOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalLBound() <em>Total LBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLBound()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_LBOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalLBound() <em>Total LBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalLBound()
	 * @generated
	 * @ordered
	 */
	protected String totalLBound = TOTAL_LBOUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalUBound() <em>Total UBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalUBound()
	 * @generated
	 * @ordered
	 */
	protected static final String TOTAL_UBOUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTotalUBound() <em>Total UBound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalUBound()
	 * @generated
	 * @ordered
	 */
	protected String totalUBound = TOTAL_UBOUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionFieldGetBoundsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_FIELD_GET_BOUNDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFField getField() {
		if (field != null && field.eIsProxy()) {
			InternalEObject oldField = (InternalEObject)field;
			field = (ESMFField)eResolveProxy(oldField);
			if (field != oldField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__FIELD, oldField, field));
			}
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFField basicGetField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setField(ESMFField newField) {
		ESMFField oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExclusiveLBound() {
		return exclusiveLBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveLBound(String newExclusiveLBound) {
		String oldExclusiveLBound = exclusiveLBound;
		exclusiveLBound = newExclusiveLBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_LBOUND, oldExclusiveLBound, exclusiveLBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExclusiveUBound() {
		return exclusiveUBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveUBound(String newExclusiveUBound) {
		String oldExclusiveUBound = exclusiveUBound;
		exclusiveUBound = newExclusiveUBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_UBOUND, oldExclusiveUBound, exclusiveUBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComputationalLBound() {
		return computationalLBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputationalLBound(String newComputationalLBound) {
		String oldComputationalLBound = computationalLBound;
		computationalLBound = newComputationalLBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_LBOUND, oldComputationalLBound, computationalLBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComputationalUBound() {
		return computationalUBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputationalUBound(String newComputationalUBound) {
		String oldComputationalUBound = computationalUBound;
		computationalUBound = newComputationalUBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_UBOUND, oldComputationalUBound, computationalUBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotalLBound() {
		return totalLBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalLBound(String newTotalLBound) {
		String oldTotalLBound = totalLBound;
		totalLBound = newTotalLBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_LBOUND, oldTotalLBound, totalLBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTotalUBound() {
		return totalUBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalUBound(String newTotalUBound) {
		String oldTotalUBound = totalUBound;
		totalUBound = newTotalUBound;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_UBOUND, oldTotalUBound, totalUBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__FIELD:
				if (resolve) return getField();
				return basicGetField();
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_LBOUND:
				return getExclusiveLBound();
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_UBOUND:
				return getExclusiveUBound();
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_LBOUND:
				return getComputationalLBound();
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_UBOUND:
				return getComputationalUBound();
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_LBOUND:
				return getTotalLBound();
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_UBOUND:
				return getTotalUBound();
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
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__FIELD:
				setField((ESMFField)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_LBOUND:
				setExclusiveLBound((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_UBOUND:
				setExclusiveUBound((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_LBOUND:
				setComputationalLBound((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_UBOUND:
				setComputationalUBound((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_LBOUND:
				setTotalLBound((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_UBOUND:
				setTotalUBound((String)newValue);
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
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__FIELD:
				setField((ESMFField)null);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_LBOUND:
				setExclusiveLBound(EXCLUSIVE_LBOUND_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_UBOUND:
				setExclusiveUBound(EXCLUSIVE_UBOUND_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_LBOUND:
				setComputationalLBound(COMPUTATIONAL_LBOUND_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_UBOUND:
				setComputationalUBound(COMPUTATIONAL_UBOUND_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_LBOUND:
				setTotalLBound(TOTAL_LBOUND_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_UBOUND:
				setTotalUBound(TOTAL_UBOUND_EDEFAULT);
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
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__FIELD:
				return field != null;
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_LBOUND:
				return EXCLUSIVE_LBOUND_EDEFAULT == null ? exclusiveLBound != null : !EXCLUSIVE_LBOUND_EDEFAULT.equals(exclusiveLBound);
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__EXCLUSIVE_UBOUND:
				return EXCLUSIVE_UBOUND_EDEFAULT == null ? exclusiveUBound != null : !EXCLUSIVE_UBOUND_EDEFAULT.equals(exclusiveUBound);
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_LBOUND:
				return COMPUTATIONAL_LBOUND_EDEFAULT == null ? computationalLBound != null : !COMPUTATIONAL_LBOUND_EDEFAULT.equals(computationalLBound);
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__COMPUTATIONAL_UBOUND:
				return COMPUTATIONAL_UBOUND_EDEFAULT == null ? computationalUBound != null : !COMPUTATIONAL_UBOUND_EDEFAULT.equals(computationalUBound);
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_LBOUND:
				return TOTAL_LBOUND_EDEFAULT == null ? totalLBound != null : !TOTAL_LBOUND_EDEFAULT.equals(totalLBound);
			case ESMFPackage.ESMF_ACTION_FIELD_GET_BOUNDS__TOTAL_UBOUND:
				return TOTAL_UBOUND_EDEFAULT == null ? totalUBound != null : !TOTAL_UBOUND_EDEFAULT.equals(totalUBound);
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
		result.append(" (exclusiveLBound: ");
		result.append(exclusiveLBound);
		result.append(", exclusiveUBound: ");
		result.append(exclusiveUBound);
		result.append(", computationalLBound: ");
		result.append(computationalLBound);
		result.append(", computationalUBound: ");
		result.append(computationalUBound);
		result.append(", totalLBound: ");
		result.append(totalLBound);
		result.append(", totalUBound: ");
		result.append(totalUBound);
		result.append(')');
		return result.toString();
	}

} //ESMFActionFieldGetBoundsImpl
