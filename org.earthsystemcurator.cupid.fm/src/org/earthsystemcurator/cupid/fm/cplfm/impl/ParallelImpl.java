/**
 */
package org.earthsystemcurator.cupid.fm.cplfm.impl;

import java.util.Collection;

import org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage;
import org.earthsystemcurator.cupid.fm.cplfm.DomainDecomposition;
import org.earthsystemcurator.cupid.fm.cplfm.Parallel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.impl.ParallelImpl#getDomainDecomposition <em>Domain Decomposition</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.impl.ParallelImpl#getProcessList <em>Process List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParallelImpl extends EObjectImpl implements Parallel {
	/**
	 * The cached value of the '{@link #getDomainDecomposition() <em>Domain Decomposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainDecomposition()
	 * @generated
	 * @ordered
	 */
	protected DomainDecomposition domainDecomposition;

	/**
	 * The cached value of the '{@link #getProcessList() <em>Process List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessList()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> processList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CplfmPackage.Literals.PARALLEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainDecomposition getDomainDecomposition() {
		if (domainDecomposition != null && domainDecomposition.eIsProxy()) {
			InternalEObject oldDomainDecomposition = (InternalEObject)domainDecomposition;
			domainDecomposition = (DomainDecomposition)eResolveProxy(oldDomainDecomposition);
			if (domainDecomposition != oldDomainDecomposition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CplfmPackage.PARALLEL__DOMAIN_DECOMPOSITION, oldDomainDecomposition, domainDecomposition));
			}
		}
		return domainDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainDecomposition basicGetDomainDecomposition() {
		return domainDecomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainDecomposition(DomainDecomposition newDomainDecomposition) {
		DomainDecomposition oldDomainDecomposition = domainDecomposition;
		domainDecomposition = newDomainDecomposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CplfmPackage.PARALLEL__DOMAIN_DECOMPOSITION, oldDomainDecomposition, domainDecomposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getProcessList() {
		if (processList == null) {
			processList = new EDataTypeUniqueEList<Integer>(Integer.class, this, CplfmPackage.PARALLEL__PROCESS_LIST);
		}
		return processList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CplfmPackage.PARALLEL__DOMAIN_DECOMPOSITION:
				if (resolve) return getDomainDecomposition();
				return basicGetDomainDecomposition();
			case CplfmPackage.PARALLEL__PROCESS_LIST:
				return getProcessList();
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
			case CplfmPackage.PARALLEL__DOMAIN_DECOMPOSITION:
				setDomainDecomposition((DomainDecomposition)newValue);
				return;
			case CplfmPackage.PARALLEL__PROCESS_LIST:
				getProcessList().clear();
				getProcessList().addAll((Collection<? extends Integer>)newValue);
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
			case CplfmPackage.PARALLEL__DOMAIN_DECOMPOSITION:
				setDomainDecomposition((DomainDecomposition)null);
				return;
			case CplfmPackage.PARALLEL__PROCESS_LIST:
				getProcessList().clear();
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
			case CplfmPackage.PARALLEL__DOMAIN_DECOMPOSITION:
				return domainDecomposition != null;
			case CplfmPackage.PARALLEL__PROCESS_LIST:
				return processList != null && !processList.isEmpty();
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
		result.append(" (processList: ");
		result.append(processList);
		result.append(')');
		return result.toString();
	}

} //ParallelImpl
