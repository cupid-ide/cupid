/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication#getNuopcDriver <em>Nuopc Driver</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication#getNuopcModel <em>Nuopc Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCApplication()
 * @model
 * @generated
 */
public interface NUOPCApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Nuopc Driver</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nuopc Driver</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nuopc Driver</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCApplication_NuopcDriver()
	 * @model containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='module'"
	 * @generated
	 */
	EList<NUOPCDriver> getNuopcDriver();

	/**
	 * Returns the value of the '<em><b>Nuopc Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nuopc Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nuopc Model</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCApplication_NuopcModel()
	 * @model containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='module'"
	 * @generated
	 */
	EList<NUOPCModel> getNuopcModel();

} // NUOPCApplication
