/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import java.lang.Comparable;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Candidate</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getCandidate()
 * @model interface="true" abstract="true" superTypes="org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Comparable<c>"
 * @generated
 */
public interface Candidate<c> extends EObject, Comparable<c> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	int score();

} // Candidate
