/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionGridGetPLocalDePSloc;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFStaggerLoc;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Grid Get PLocal De PSloc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetPLocalDePSlocImpl#getStaggerloc <em>Staggerloc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetPLocalDePSlocImpl#getExclusiveLBound <em>Exclusive LBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetPLocalDePSlocImpl#getExclusiveUBound <em>Exclusive UBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetPLocalDePSlocImpl#getComputationalLBound <em>Computational LBound</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionGridGetPLocalDePSlocImpl#getComputationalUBound <em>Computational UBound</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionGridGetPLocalDePSlocImpl extends ESMFActionGridGetPLocalDeImpl implements ESMFActionGridGetPLocalDePSloc {
	/**
	 * The default value of the '{@link #getStaggerloc() <em>Staggerloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaggerloc()
	 * @generated
	 * @ordered
	 */
	protected static final ESMFStaggerLoc STAGGERLOC_EDEFAULT = ESMFStaggerLoc.ESMF_STAGGERLOC_CENTER;

	/**
	 * The cached value of the '{@link #getStaggerloc() <em>Staggerloc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaggerloc()
	 * @generated
	 * @ordered
	 */
	protected ESMFStaggerLoc staggerloc = STAGGERLOC_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionGridGetPLocalDePSlocImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFStaggerLoc getStaggerloc() {
		return staggerloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaggerloc(ESMFStaggerLoc newStaggerloc) {
		ESMFStaggerLoc oldStaggerloc = staggerloc;
		staggerloc = newStaggerloc == null ? STAGGERLOC_EDEFAULT : newStaggerloc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__STAGGERLOC, oldStaggerloc, staggerloc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_LBOUND, oldExclusiveLBound, exclusiveLBound));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_UBOUND, oldExclusiveUBound, exclusiveUBound));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_LBOUND, oldComputationalLBound, computationalLBound));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_UBOUND, oldComputationalUBound, computationalUBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__STAGGERLOC:
				return getStaggerloc();
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_LBOUND:
				return getExclusiveLBound();
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_UBOUND:
				return getExclusiveUBound();
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_LBOUND:
				return getComputationalLBound();
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_UBOUND:
				return getComputationalUBound();
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
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__STAGGERLOC:
				setStaggerloc((ESMFStaggerLoc)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_LBOUND:
				setExclusiveLBound((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_UBOUND:
				setExclusiveUBound((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_LBOUND:
				setComputationalLBound((String)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_UBOUND:
				setComputationalUBound((String)newValue);
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
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__STAGGERLOC:
				setStaggerloc(STAGGERLOC_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_LBOUND:
				setExclusiveLBound(EXCLUSIVE_LBOUND_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_UBOUND:
				setExclusiveUBound(EXCLUSIVE_UBOUND_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_LBOUND:
				setComputationalLBound(COMPUTATIONAL_LBOUND_EDEFAULT);
				return;
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_UBOUND:
				setComputationalUBound(COMPUTATIONAL_UBOUND_EDEFAULT);
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
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__STAGGERLOC:
				return staggerloc != STAGGERLOC_EDEFAULT;
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_LBOUND:
				return EXCLUSIVE_LBOUND_EDEFAULT == null ? exclusiveLBound != null : !EXCLUSIVE_LBOUND_EDEFAULT.equals(exclusiveLBound);
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__EXCLUSIVE_UBOUND:
				return EXCLUSIVE_UBOUND_EDEFAULT == null ? exclusiveUBound != null : !EXCLUSIVE_UBOUND_EDEFAULT.equals(exclusiveUBound);
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_LBOUND:
				return COMPUTATIONAL_LBOUND_EDEFAULT == null ? computationalLBound != null : !COMPUTATIONAL_LBOUND_EDEFAULT.equals(computationalLBound);
			case ESMFPackage.ESMF_ACTION_GRID_GET_PLOCAL_DE_PSLOC__COMPUTATIONAL_UBOUND:
				return COMPUTATIONAL_UBOUND_EDEFAULT == null ? computationalUBound != null : !COMPUTATIONAL_UBOUND_EDEFAULT.equals(computationalUBound);
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
		result.append(" (staggerloc: ");
		result.append(staggerloc);
		result.append(", exclusiveLBound: ");
		result.append(exclusiveLBound);
		result.append(", exclusiveUBound: ");
		result.append(exclusiveUBound);
		result.append(", computationalLBound: ");
		result.append(computationalLBound);
		result.append(", computationalUBound: ");
		result.append(computationalUBound);
		result.append(')');
		return result.toString();
	}

} //ESMFActionGridGetPLocalDePSlocImpl
