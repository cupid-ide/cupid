/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realizes Export Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#getRealizedInState <em>Realized In State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#isRealizedInExportState <em>Realized In Export State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getRealizesExportField()
 * @model
 * @generated
 */
public interface RealizesExportField extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getRealizesExportField <em>Realizes Export Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(ModelImplementsInitP2)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getRealizesExportField_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getRealizesExportField
	 * @model opposite="realizesExportField" required="true" transient="false"
	 * @generated
	 */
	ModelImplementsInitP2 getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(ModelImplementsInitP2 value);

	/**
	 * Returns the value of the '<em><b>Realized In State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized In State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized In State</em>' attribute.
	 * @see #setRealizedInState(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getRealizesExportField_RealizedInState()
	 * @model required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc query='argByIndex: 1'"
	 * @generated
	 */
	String getRealizedInState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#getRealizedInState <em>Realized In State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realized In State</em>' attribute.
	 * @see #getRealizedInState()
	 * @generated
	 */
	void setRealizedInState(String value);

	/**
	 * Returns the value of the '<em><b>Realized In Export State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realized In Export State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realized In Export State</em>' attribute.
	 * @see #setRealizedInExportState(boolean)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getRealizesExportField_RealizedInExportState()
	 * @model derived="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc essential='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.realizedInState = self.parent.exportParam'"
	 * @generated
	 */
	boolean isRealizedInExportState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#isRealizedInExportState <em>Realized In Export State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realized In Export State</em>' attribute.
	 * @see #isRealizedInExportState()
	 * @generated
	 */
	void setRealizedInExportState(boolean value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' attribute.
	 * @see #setField(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getRealizesExportField_Field()
	 * @model annotation="http://www.earthsystemcog.org/projects/nuopc query='argByIndex: 2'"
	 * @generated
	 */
	String getField();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#getField <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field</em>' attribute.
	 * @see #getField()
	 * @generated
	 */
	void setField(String value);

} // RealizesExportField
