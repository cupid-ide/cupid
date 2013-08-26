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
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isParameters <em>Parameters</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParamName_gcomp <em>Param Name gcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParamName_rc <em>Param Name rc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsGenericSetServices <em>Calls Generic Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsSetEntryPointPhase1 <em>Calls Set Entry Point Phase1</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isCallsSetEntryPointPhase2 <em>Calls Set Entry Point Phase2</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getAttachesModelAdvance <em>Attaches Model Advance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices()
 * @model
 * @generated
 */
public interface ModelImplementsSetServices extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getImplementsSetServices <em>Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Model)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getImplementsSetServices
	 * @model opposite="implementsSetServices" required="true" transient="false"
	 * @generated
	 */
	Model getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Model value);

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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_Name()
	 * @model id="true" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc query='subroutineName'"
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
	 * Returns the value of the '<em><b>Parameters</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' attribute.
	 * @see #setParameters(boolean)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_Parameters()
	 * @model required="true"
	 * @generated
	 */
	boolean isParameters();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#isParameters <em>Parameters</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' attribute.
	 * @see #isParameters()
	 * @generated
	 */
	void setParameters(boolean value);

	/**
	 * Returns the value of the '<em><b>Param Name gcomp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Name gcomp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Name gcomp</em>' attribute.
	 * @see #setParamName_gcomp(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_ParamName_gcomp()
	 * @model
	 * @generated
	 */
	String getParamName_gcomp();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParamName_gcomp <em>Param Name gcomp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Name gcomp</em>' attribute.
	 * @see #getParamName_gcomp()
	 * @generated
	 */
	void setParamName_gcomp(String value);

	/**
	 * Returns the value of the '<em><b>Param Name rc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param Name rc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Name rc</em>' attribute.
	 * @see #setParamName_rc(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsSetServices_ParamName_rc()
	 * @model
	 * @generated
	 */
	String getParamName_rc();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParamName_rc <em>Param Name rc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Name rc</em>' attribute.
	 * @see #getParamName_rc()
	 * @generated
	 */
	void setParamName_rc(String value);

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
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc query='calls: routine_SetServices' essential='true'"
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
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc query='calls: ESMF_GridCompSetEntryPoint'"
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
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc query='calls: ESMF_GridCompSetEntryPoint'"
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
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc query='call: ESMF_MethodAdd'"
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
