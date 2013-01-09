/**
 */
package org.earthsystemcurator.cupid.esmf;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DE Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFDELayout#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFDELayout#getDecompositionElement <em>Decomposition Element</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.ESMFDELayout#getDeToPet <em>De To Pet</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFDELayout()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MappedDEsOwnedByThisDELayout'"
 * @generated
 */
public interface ESMFDELayout extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFDELayout_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFDELayout#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Decomposition Element</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.esmf.ESMFDecompositionElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposition Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposition Element</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFDELayout_DecompositionElement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ESMFDecompositionElement> getDecompositionElement();

	/**
	 * Returns the value of the '<em><b>De To Pet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>De To Pet</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>De To Pet</em>' attribute.
	 * @see #setDeToPet(Map)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getESMFDELayout_DeToPet()
	 * @model required="true" transient="true"
	 * @generated
	 */
	Map<ESMFDecompositionElement, ESMFPersistentExecutionThread> getDeToPet();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.ESMFDELayout#getDeToPet <em>De To Pet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>De To Pet</em>' attribute.
	 * @see #getDeToPet()
	 * @generated
	 */
	void setDeToPet(Map<ESMFDecompositionElement, ESMFPersistentExecutionThread> value);

} // ESMFDELayout
