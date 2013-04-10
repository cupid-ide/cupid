/**
 */
package org.earthsystemcurator.cupid.fm.cplfm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parallel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.Parallel#getDomainDecomposition <em>Domain Decomposition</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.Parallel#getProcessList <em>Process List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getParallel()
 * @model
 * @generated
 */
public interface Parallel extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Decomposition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Decomposition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Decomposition</em>' reference.
	 * @see #setDomainDecomposition(DomainDecomposition)
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getParallel_DomainDecomposition()
	 * @model required="true"
	 * @generated
	 */
	DomainDecomposition getDomainDecomposition();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.fm.cplfm.Parallel#getDomainDecomposition <em>Domain Decomposition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Decomposition</em>' reference.
	 * @see #getDomainDecomposition()
	 * @generated
	 */
	void setDomainDecomposition(DomainDecomposition value);

	/**
	 * Returns the value of the '<em><b>Process List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process List</em>' attribute list.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getParallel_ProcessList()
	 * @model required="true"
	 * @generated
	 */
	EList<Integer> getProcessList();

} // Parallel
