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
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getGcomp <em>Gcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getRc <em>Rc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getCallsGenericSetServices <em>Calls Generic Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getCallsSetEntryPoint <em>Calls Set Entry Point</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getAttachesMethod <em>Attaches Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsSetServices()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='registersInitP1 registersInitP2'"
 *        annotation="http://www.earthsystemcog.org/projects/nuopc label='Set Services' doc='In general, a Set Services method is a public subroutine that sets entry points for the component. This subroutine should call the Set Services subroutine in the generic NUOPC Model component.'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL registersInitP1='self.parent.initialize.implementsInitP1=null or self.callsSetEntryPoint->select(c|c.userRoutine=self.parent.initialize.implementsInitP1.name)->notEmpty()' registersInitP1$message='\'A call is required in the Set Services method to ESMF_GridCompSetEntryPoint in order to register the initialize phase 1 method.\'' registersInitP2='self.parent.initialize.implementsInitP2=null or self.callsSetEntryPoint->select(c|c.userRoutine=self.parent.initialize.implementsInitP2.name)->notEmpty()' registersInitP2$message='\'A call is required in the Set Services method to ESMF_GridCompSetEntryPoint in order to register the initialize phase 2 method.\''"
 * @generated
 */
public interface NUOPCModel__ImplementsSetServices extends EObject {
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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsSetServices_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsSetServices
	 * @model opposite="implementsSetServices" required="true" transient="false"
	 * @generated
	 */
	NUOPCModel getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getParent <em>Parent</em>}' container reference.
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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsSetServices_Name()
	 * @model default="SetServices" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Gcomp</b></em>' attribute.
	 * The default value is <code>"gcomp"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gcomp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gcomp</em>' attribute.
	 * @see #setGcomp(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsSetServices_Gcomp()
	 * @model default="gcomp" required="true"
	 * @generated
	 */
	String getGcomp();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getGcomp <em>Gcomp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gcomp</em>' attribute.
	 * @see #getGcomp()
	 * @generated
	 */
	void setGcomp(String value);

	/**
	 * Returns the value of the '<em><b>Rc</b></em>' attribute.
	 * The default value is <code>"rc"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rc</em>' attribute.
	 * @see #setRc(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsSetServices_Rc()
	 * @model default="rc" required="true"
	 * @generated
	 */
	String getRc();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getRc <em>Rc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rc</em>' attribute.
	 * @see #getRc()
	 * @generated
	 */
	void setRc(String value);

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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsSetServices_CallsGenericSetServices()
	 * @model containment="true" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='call: \"#../../genericImports/importsGenericSS(#gcomp, rc=#rc)\"' essential='true'"
	 * @generated
	 */
	CallsGenericSetServices getCallsGenericSetServices();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel__ImplementsSetServices#getCallsGenericSetServices <em>Calls Generic Set Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calls Generic Set Services</em>' containment reference.
	 * @see #getCallsGenericSetServices()
	 * @generated
	 */
	void setCallsGenericSetServices(CallsGenericSetServices value);

	/**
	 * Returns the value of the '<em><b>Calls Set Entry Point</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.CallsSetEntryPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls Set Entry Point</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls Set Entry Point</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsSetServices_CallsSetEntryPoint()
	 * @model containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='call: \"ESMF_GridCompSetEntryPoint(#ignore, #method, userRoutine=#userRoutine, phase?=#phase, rc=#ignore)\"'"
	 * @generated
	 */
	EList<CallsSetEntryPoint> getCallsSetEntryPoint();

	/**
	 * Returns the value of the '<em><b>Attaches Method</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.AttachesMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attaches Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attaches Method</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel__ImplementsSetServices_AttachesMethod()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='call: \"ESMF_MethodAdd(#ignore, index?=#index, label=#name, userRoutine=#userRoutine, rc=#ignore)\"'"
	 * @generated
	 */
	EList<AttachesMethod> getAttachesMethod();

} // NUOPCModel__ImplementsSetServices
