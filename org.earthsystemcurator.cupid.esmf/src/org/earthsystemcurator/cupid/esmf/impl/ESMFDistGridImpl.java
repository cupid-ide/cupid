/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.esmf.ESMFDELayout;
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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dist Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFDistGridImpl#getExtent <em>Extent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFDistGridImpl#getDe <em>De</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFDistGridImpl#getDeLayout <em>De Layout</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFDistGridImpl#getRegularDecompositionSize <em>Regular Decomposition Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFDistGridImpl extends ESMFNamedEntityImpl implements ESMFDistGrid {
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
	 * The cached value of the '{@link #getDe() <em>De</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDe()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFDecompositionElement> de;

	/**
	 * The cached value of the '{@link #getDeLayout() <em>De Layout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeLayout()
	 * @generated
	 * @ordered
	 */
	protected ESMFDELayout deLayout;

	/**
	 * The cached value of the '{@link #getRegularDecompositionSize() <em>Regular Decomposition Size</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegularDecompositionSize()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> regularDecompositionSize;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFDistGridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_DIST_GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extent> getExtent() {
		if (extent == null) {
			extent = new EObjectContainmentEList<Extent>(Extent.class, this, ESMFPackage.ESMF_DIST_GRID__EXTENT);
		}
		return extent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFDecompositionElement> getDe() {
		if (de == null) {
			de = new EObjectContainmentWithInverseEList<ESMFDecompositionElement>(ESMFDecompositionElement.class, this, ESMFPackage.ESMF_DIST_GRID__DE, ESMFPackage.ESMF_DECOMPOSITION_ELEMENT__PARENT_DIST_GRID);
		}
		return de;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFDELayout getDeLayout() {
		if (deLayout != null && deLayout.eIsProxy()) {
			InternalEObject oldDeLayout = (InternalEObject)deLayout;
			deLayout = (ESMFDELayout)eResolveProxy(oldDeLayout);
			if (deLayout != oldDeLayout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_DIST_GRID__DE_LAYOUT, oldDeLayout, deLayout));
			}
		}
		return deLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFDELayout basicGetDeLayout() {
		return deLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeLayout(ESMFDELayout newDeLayout) {
		ESMFDELayout oldDeLayout = deLayout;
		deLayout = newDeLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_DIST_GRID__DE_LAYOUT, oldDeLayout, deLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getRegularDecompositionSize() {
		if (regularDecompositionSize == null) {
			regularDecompositionSize = new EDataTypeEList<Integer>(Integer.class, this, ESMFPackage.ESMF_DIST_GRID__REGULAR_DECOMPOSITION_SIZE);
		}
		return regularDecompositionSize;
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
			case ESMFPackage.ESMF_DIST_GRID__DE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDe()).basicAdd(otherEnd, msgs);
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
			case ESMFPackage.ESMF_DIST_GRID__EXTENT:
				return ((InternalEList<?>)getExtent()).basicRemove(otherEnd, msgs);
			case ESMFPackage.ESMF_DIST_GRID__DE:
				return ((InternalEList<?>)getDe()).basicRemove(otherEnd, msgs);
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
			case ESMFPackage.ESMF_DIST_GRID__EXTENT:
				return getExtent();
			case ESMFPackage.ESMF_DIST_GRID__DE:
				return getDe();
			case ESMFPackage.ESMF_DIST_GRID__DE_LAYOUT:
				if (resolve) return getDeLayout();
				return basicGetDeLayout();
			case ESMFPackage.ESMF_DIST_GRID__REGULAR_DECOMPOSITION_SIZE:
				return getRegularDecompositionSize();
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
			case ESMFPackage.ESMF_DIST_GRID__EXTENT:
				getExtent().clear();
				getExtent().addAll((Collection<? extends Extent>)newValue);
				return;
			case ESMFPackage.ESMF_DIST_GRID__DE:
				getDe().clear();
				getDe().addAll((Collection<? extends ESMFDecompositionElement>)newValue);
				return;
			case ESMFPackage.ESMF_DIST_GRID__DE_LAYOUT:
				setDeLayout((ESMFDELayout)newValue);
				return;
			case ESMFPackage.ESMF_DIST_GRID__REGULAR_DECOMPOSITION_SIZE:
				getRegularDecompositionSize().clear();
				getRegularDecompositionSize().addAll((Collection<? extends Integer>)newValue);
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
			case ESMFPackage.ESMF_DIST_GRID__EXTENT:
				getExtent().clear();
				return;
			case ESMFPackage.ESMF_DIST_GRID__DE:
				getDe().clear();
				return;
			case ESMFPackage.ESMF_DIST_GRID__DE_LAYOUT:
				setDeLayout((ESMFDELayout)null);
				return;
			case ESMFPackage.ESMF_DIST_GRID__REGULAR_DECOMPOSITION_SIZE:
				getRegularDecompositionSize().clear();
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
			case ESMFPackage.ESMF_DIST_GRID__EXTENT:
				return extent != null && !extent.isEmpty();
			case ESMFPackage.ESMF_DIST_GRID__DE:
				return de != null && !de.isEmpty();
			case ESMFPackage.ESMF_DIST_GRID__DE_LAYOUT:
				return deLayout != null;
			case ESMFPackage.ESMF_DIST_GRID__REGULAR_DECOMPOSITION_SIZE:
				return regularDecompositionSize != null && !regularDecompositionSize.isEmpty();
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
		result.append(" (regularDecompositionSize: ");
		result.append(regularDecompositionSize);
		result.append(')');
		return result.toString();
	}

} //ESMFDistGridImpl
