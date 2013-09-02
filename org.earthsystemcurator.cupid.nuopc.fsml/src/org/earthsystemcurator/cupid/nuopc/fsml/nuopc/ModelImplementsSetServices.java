/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Implements Set Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParam_gcomp <em>Param gcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParam_rc <em>Param rc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsGenericSetServices <em>Calls Generic Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsSetEntryPointPhase1 <em>Calls Set Entry Point Phase1</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsSetEntryPointPhase2 <em>Calls Set Entry Point Phase2</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getAttachesModelAdvance <em>Attaches Model Advance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"*(type(ESMF_GridComp), integer)\"'"
 * @generated
 */
public interface ModelImplementsSetServices extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsSetServices <em>Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(NUOPCModel)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsSetServices
	 * @model opposite="implementsSetServices" required="true" transient="false"
	 * @generated
	 */
	NUOPCModel getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(NUOPCModel value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"SetServicesDefault"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_Name()
	 * @model default="SetServicesDefault" id="true" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutineName'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Param gcomp</b></em>' attribute.
	 * The default value is <code>"gcompDefault"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param gcomp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param gcomp</em>' attribute.
	 * @see #setParam_gcomp(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_Param_gcomp()
	 * @model default="gcompDefault"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='formalParam: 1'"
	 * @generated
	 */
	String getParam_gcomp();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParam_gcomp <em>Param gcomp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param gcomp</em>' attribute.
	 * @see #getParam_gcomp()
	 * @generated
	 */
	void setParam_gcomp(String value);

	/**
	 * Returns the value of the '<em><b>Param rc</b></em>' attribute.
	 * The default value is <code>"rcDefault"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param rc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param rc</em>' attribute.
	 * @see #setParam_rc(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_Param_rc()
	 * @model default="rcDefault"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='formalParam: 2'"
	 * @generated
	 */
	String getParam_rc();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParam_rc <em>Param rc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param rc</em>' attribute.
	 * @see #getParam_rc()
	 * @generated
	 */
	void setParam_rc(String value);

	/**
	 * Returns the value of the '<em><b>Calls Generic Set Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls Generic Set Services</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls Generic Set Services</em>' attribute.
	 * @see #setCallsGenericSetServices(boolean)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_CallsGenericSetServices()
	 * @model required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='calls: \"routine_SetServices\" definedInModule: \"NUOPC_Model\"' essential='true'"
	 * @generated
	 */
	boolean isCallsGenericSetServices();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsGenericSetServices <em>Calls Generic Set Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calls Generic Set Services</em>' attribute.
	 * @see #isCallsGenericSetServices()
	 * @generated
	 */
	void setCallsGenericSetServices(boolean value);

	/**
	 * Returns the value of the '<em><b>Calls Set Entry Point Phase1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls Set Entry Point Phase1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls Set Entry Point Phase1</em>' attribute.
	 * @see #setCallsSetEntryPointPhase1(boolean)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_CallsSetEntryPointPhase1()
	 * @model required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='calls: \"ESMF_GridCompSetEntryPoint\"'"
	 * @generated
	 */
	boolean isCallsSetEntryPointPhase1();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsSetEntryPointPhase1 <em>Calls Set Entry Point Phase1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calls Set Entry Point Phase1</em>' attribute.
	 * @see #isCallsSetEntryPointPhase1()
	 * @generated
	 */
	void setCallsSetEntryPointPhase1(boolean value);

	/**
	 * Returns the value of the '<em><b>Calls Set Entry Point Phase2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls Set Entry Point Phase2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls Set Entry Point Phase2</em>' attribute.
	 * @see #setCallsSetEntryPointPhase2(boolean)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_CallsSetEntryPointPhase2()
	 * @model required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='calls: \"ESMF_GridCompSetEntryPoint\"'"
	 * @generated
	 */
	boolean isCallsSetEntryPointPhase2();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsSetEntryPointPhase2 <em>Calls Set Entry Point Phase2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calls Set Entry Point Phase2</em>' attribute.
	 * @see #isCallsSetEntryPointPhase2()
	 * @generated
	 */
	void setCallsSetEntryPointPhase2(boolean value);

	/**
	 * Returns the value of the '<em><b>Attaches Model Advance</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attaches Model Advance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attaches Model Advance</em>' containment reference.
	 * @see #setAttachesModelAdvance(AttachesModelAdvance)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_AttachesModelAdvance()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='call: \"ESMF_MethodAdd\"'"
	 * @generated
	 */
	AttachesModelAdvance getAttachesModelAdvance();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getAttachesModelAdvance <em>Attaches Model Advance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attaches Model Advance</em>' containment reference.
	 * @see #getAttachesModelAdvance()
	 * @generated
	 */
	void setAttachesModelAdvance(AttachesModelAdvance value);

} // ModelImplementsSetServices
