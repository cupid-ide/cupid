/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mediator Generic Imports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__GenericImports#getImportsGenericSS <em>Imports Generic SS</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__GenericImports#getImportsLabelModelAdvance <em>Imports Label Model Advance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator__GenericImports()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc label='Imports from NUOPC Mediator' icon='import.png'"
 * @generated
 */
public interface NUOPCMediator__GenericImports extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports Generic SS</b></em>' attribute.
	 * The default value is <code>"model_routine_SS"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports Generic SS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports Generic SS</em>' attribute.
	 * @see #setImportsGenericSS(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator__GenericImports_ImportsGenericSS()
	 * @model default="model_routine_SS" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='uses: \"NUOPC_Mediator\" entity: \"routine_SetServices\"' label='routine_SetServices' doc='Subclasses of NUOPC Mediator should import the public generic Set Services subroutine \"routine_SetServices\"'"
	 * @generated
	 */
	String getImportsGenericSS();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__GenericImports#getImportsGenericSS <em>Imports Generic SS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports Generic SS</em>' attribute.
	 * @see #getImportsGenericSS()
	 * @generated
	 */
	void setImportsGenericSS(String value);

	/**
	 * Returns the value of the '<em><b>Imports Label Model Advance</b></em>' attribute.
	 * The default value is <code>"model_label_Advance"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports Label Model Advance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports Label Model Advance</em>' attribute.
	 * @see #setImportsLabelModelAdvance(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCMediator__GenericImports_ImportsLabelModelAdvance()
	 * @model default="model_label_Advance"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='uses: \"NUOPC_Mediator\" entity: \"label_Advance\"' label='label_Advance'"
	 * @generated
	 */
	String getImportsLabelModelAdvance();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCMediator__GenericImports#getImportsLabelModelAdvance <em>Imports Label Model Advance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports Label Model Advance</em>' attribute.
	 * @see #getImportsLabelModelAdvance()
	 * @generated
	 */
	void setImportsLabelModelAdvance(String value);

} // NUOPCMediator__GenericImports
