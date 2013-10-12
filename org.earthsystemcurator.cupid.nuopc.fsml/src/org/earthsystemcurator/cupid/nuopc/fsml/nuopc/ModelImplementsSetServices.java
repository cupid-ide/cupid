/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getCallsGenericSetServices <em>Calls Generic Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsSetEntryPointPhase1 <em>Calls Set Entry Point Phase1</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsSetEntryPointPhase2 <em>Calls Set Entry Point Phase2</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getAttachesModelAdvance <em>Attaches Model Advance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(inout type(ESMF_GridComp) #param_gcomp, out integer #param_rc)\"' label='Set Services' doc='In general, a Set Services method is a public subroutine that sets entry points for the component. This subroutine should call the Set Services subroutine in the generic NUOPC Model component.'"
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
	 * The default value is <code>"SetServices"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_Name()
	 * @model default="SetServices" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingX='subroutineName'"
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
	 * The default value is <code>"gcomp"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param gcomp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param gcomp</em>' attribute.
	 * @see #setParam_gcomp(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_Param_gcomp()
	 * @model default="gcomp"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingX='formalParam: 1'"
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
	 * The default value is <code>"rc"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param rc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param rc</em>' attribute.
	 * @see #setParam_rc(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_Param_rc()
	 * @model default="rc"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingX='formalParam: 2'"
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
	 * Returns the value of the '<em><b>Calls Generic Set Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls Generic Set Services</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls Generic Set Services</em>' containment reference.
	 * @see #setCallsGenericSetServices(CallsGenericSetServices)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_CallsGenericSetServices()
	 * @model containment="true" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='call: \"#../../importsGenericSS(#gcomp, rc=#rc)\"' essential='true'"
	 * @generated
	 */
	CallsGenericSetServices getCallsGenericSetServices();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getCallsGenericSetServices <em>Calls Generic Set Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calls Generic Set Services</em>' containment reference.
	 * @see #getCallsGenericSetServices()
	 * @generated
	 */
	void setCallsGenericSetServices(CallsGenericSetServices value);

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
	 * Returns the value of the '<em><b>Attaches Model Advance</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attaches Model Advance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attaches Model Advance</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_AttachesModelAdvance()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesModelAdvance#getParent
	 * @model opposite="parent" containment="true" ordered="false"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingX='call: \"ESMF_MethodAdd(#gcomp, #label, #userRoutine, #rc)\"'"
	 * @generated
	 */
	EList<AttachesModelAdvance> getAttachesModelAdvance();

} // ModelImplementsSetServices
