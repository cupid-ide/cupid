/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement;
import org.earthsystemcurator.cupid.esmf.ESMFDistGrid;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.Extent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decomposition Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFDecompositionElementImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFDecompositionElementImpl#getParentDistGrid <em>Parent Dist Grid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFDecompositionElementImpl extends EObjectImpl implements ESMFDecompositionElement {
	/**
	 * The cached value of the '{@link #getExtent() <em>Extent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtent()
	 * @generated
	 * @ordered
	 */
	protected EList<Extent> extent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFDecompositionElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_DECOMPOSITION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extent> getExtent() {
		if (extent == null) {
			extent = new EObjectContainmentEList<Extent>(Extent.class, this, ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__EXTENT);
		}
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFDistGrid getParentDistGrid() {
		if (eContainerFeatureID() != ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__PARENT_DIST_GRID) return null;
		return (ESMFDistGrid)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentDistGrid(ESMFDistGrid newParentDistGrid, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentDistGrid, ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__PARENT_DIST_GRID, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentDistGrid(ESMFDistGrid newParentDistGrid) {
		if (newParentDistGrid != eInternalContainer() || (eContainerFeatureID() != ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__PARENT_DIST_GRID && newParentDistGrid != null)) {
			if (EcoreUtil.isAncestor(this, newParentDistGrid))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentDistGrid != null)
				msgs = ((InternalEObject)newParentDistGrid).eInverseAdd(this, ESMFPackage.ESMF_DIST_GRID__DE, ESMFDistGrid.class, msgs);
			msgs = basicSetParentDistGrid(newParentDistGrid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__PARENT_DIST_GRID, newParentDistGrid, newParentDistGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__PARENT_DIST_GRID:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentDistGrid((ESMFDistGrid)otherEnd, msgs);
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
			case ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__EXTENT:
				return ((InternalEList<?>)getExtent()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__PARENT_DIST_GRID:
				return basicSetParentDistGrid(null, msgs);
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
			case ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__PARENT_DIST_GRID:
				return eInternalContainer().eInverseRemove(this, ESMFPackage.ESMF_DIST_GRID__DE, ESMFDistGrid.class, msgs);
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
			case ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__EXTENT:
				return getExtent();
			case ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__PARENT_DIST_GRID:
				return getParentDistGrid();
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
			case ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__EXTENT:
				getExtent().clear();
				getExtent().addAll((Collection<? extends Extent>)newValue);
				return;
			case ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__PARENT_DIST_GRID:
				setParentDistGrid((ESMFDistGrid)newValue);
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
			case ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__EXTENT:
				getExtent().clear();
				return;
			case ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__PARENT_DIST_GRID:
				setParentDistGrid((ESMFDistGrid)null);
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
			case ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__EXTENT:
				return extent != null && !extent.isEmpty();
			case ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__PARENT_DIST_GRID:
				return getParentDistGrid() != null;
		}
		return super.eIsSet(featureID);
	}

} //ESMFDecompositionElementImpl
