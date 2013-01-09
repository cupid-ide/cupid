/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import java.util.Collection;
import java.util.Map;

import org.earthsystemcurator.cupid.esmf.ESMFDELayout;
import org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFPersistentExecutionThread;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DE Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFDELayoutImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFDELayoutImpl#getDecompositionElement <em>Decomposition Element</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFDELayoutImpl#getDeToPet <em>De To Pet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFDELayoutImpl extends EObjectImpl implements ESMFDELayout {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDecompositionElement() <em>Decomposition Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecompositionElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ESMFDecompositionElement> decompositionElement;

	/**
	 * The cached value of the '{@link #getDeToPet() <em>De To Pet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeToPet()
	 * @generated
	 * @ordered
	 */
	protected Map<ESMFDecompositionElement, ESMFPersistentExecutionThread> deToPet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFDELayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_DE_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_DE_LAYOUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ESMFDecompositionElement> getDecompositionElement() {
		if (decompositionElement == null) {
			decompositionElement = new EObjectContainmentEList<ESMFDecompositionElement>(ESMFDecompositionElement.class, this, ESMFPackage.ESMF_DE_LAYOUT__DECOMPOSITION_ELEMENT);
		}
		return decompositionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<ESMFDecompositionElement, ESMFPersistentExecutionThread> getDeToPet() {
		return deToPet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeToPet(Map<ESMFDecompositionElement, ESMFPersistentExecutionThread> newDeToPet) {
		Map<ESMFDecompositionElement, ESMFPersistentExecutionThread> oldDeToPet = deToPet;
		deToPet = newDeToPet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_DE_LAYOUT__DE_TO_PET, oldDeToPet, deToPet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ESMFPackage.ESMF_DE_LAYOUT__DECOMPOSITION_ELEMENT:
				return ((InternalEList<?>)getDecompositionElement()).basicRemove(otherEnd, msgs);
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
			case ESMFPackage.ESMF_DE_LAYOUT__NAME:
				return getName();
			case ESMFPackage.ESMF_DE_LAYOUT__DECOMPOSITION_ELEMENT:
				return getDecompositionElement();
			case ESMFPackage.ESMF_DE_LAYOUT__DE_TO_PET:
				return getDeToPet();
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
			case ESMFPackage.ESMF_DE_LAYOUT__NAME:
				setName((String)newValue);
				return;
			case ESMFPackage.ESMF_DE_LAYOUT__DECOMPOSITION_ELEMENT:
				getDecompositionElement().clear();
				getDecompositionElement().addAll((Collection<? extends ESMFDecompositionElement>)newValue);
				return;
			case ESMFPackage.ESMF_DE_LAYOUT__DE_TO_PET:
				setDeToPet((Map<ESMFDecompositionElement, ESMFPersistentExecutionThread>)newValue);
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
			case ESMFPackage.ESMF_DE_LAYOUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ESMFPackage.ESMF_DE_LAYOUT__DECOMPOSITION_ELEMENT:
				getDecompositionElement().clear();
				return;
			case ESMFPackage.ESMF_DE_LAYOUT__DE_TO_PET:
				setDeToPet((Map<ESMFDecompositionElement, ESMFPersistentExecutionThread>)null);
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
			case ESMFPackage.ESMF_DE_LAYOUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ESMFPackage.ESMF_DE_LAYOUT__DECOMPOSITION_ELEMENT:
				return decompositionElement != null && !decompositionElement.isEmpty();
			case ESMFPackage.ESMF_DE_LAYOUT__DE_TO_PET:
				return deToPet != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", deToPet: ");
		result.append(deToPet);
		result.append(')');
		return result.toString();
	}

} //ESMFDELayoutImpl
