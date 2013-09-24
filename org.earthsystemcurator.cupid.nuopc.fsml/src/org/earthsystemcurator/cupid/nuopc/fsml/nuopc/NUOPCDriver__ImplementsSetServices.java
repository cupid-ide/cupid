/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver Implements Set Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getParam_gcomp <em>Param gcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getParam_rc <em>Param rc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#isCallsGenericSetServices <em>Calls Generic Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getAttachesMethod <em>Attaches Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ImplementsSetServices()
 * @model
 * @generated
 */
public interface NUOPCDriver__ImplementsSetServices extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetServices <em>Implements Set Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(NUOPCDriver)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ImplementsSetServices_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetServices
	 * @model opposite="implementsSetServices" required="true" transient="false"
	 * @generated
	 */
	NUOPCDriver getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(NUOPCDriver value);

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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ImplementsSetServices_Name()
	 * @model default="SetServices" id="true" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingX='subroutineName'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getName <em>Name</em>}' attribute.
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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ImplementsSetServices_Param_gcomp()
	 * @model default="gcomp"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingX='formalParam: 1'"
	 * @generated
	 */
	String getParam_gcomp();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getParam_gcomp <em>Param gcomp</em>}' attribute.
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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ImplementsSetServices_Param_rc()
	 * @model default="rc"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingX='formalParam: 2'"
	 * @generated
	 */
	String getParam_rc();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getParam_rc <em>Param rc</em>}' attribute.
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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ImplementsSetServices_CallsGenericSetServices()
	 * @model required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='calls: \"routine_SetServices\" definedInModule: \"NUOPC_Driver\"' essential='true'"
	 * @generated
	 */
	boolean isCallsGenericSetServices();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#isCallsGenericSetServices <em>Calls Generic Set Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calls Generic Set Services</em>' attribute.
	 * @see #isCallsGenericSetServices()
	 * @generated
	 */
	void setCallsGenericSetServices(boolean value);

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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ImplementsSetServices_AttachesMethod()
	 * @model containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='call: \"ESMF_MethodAdd\"'"
	 * @generated
	 */
	EList<AttachesMethod> getAttachesMethod();

} // NUOPCDriver__ImplementsSetServices
