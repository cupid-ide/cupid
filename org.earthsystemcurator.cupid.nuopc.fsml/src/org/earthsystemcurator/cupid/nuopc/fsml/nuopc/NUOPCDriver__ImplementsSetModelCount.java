/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver Implements Set Model Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getGcomp <em>Gcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getRc <em>Rc</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getDriverInternalState <em>Driver Internal State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getGetsInternalState <em>Gets Internal State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#isAssignsValue <em>Assigns Value</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#isAttached <em>Attached</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ImplementsSetModelCount()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc label='Set Model Count' doc='A subroutine that sets the number of model managed by this driver.'"
 * @generated
 */
public interface NUOPCDriver__ImplementsSetModelCount extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetModelCount <em>Implements Set Model Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(NUOPCDriver)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ImplementsSetModelCount_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetModelCount
	 * @model opposite="implementsSetModelCount" required="true" transient="false"
	 * @generated
	 */
	NUOPCDriver getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(NUOPCDriver value);

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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ImplementsSetModelCount_Gcomp()
	 * @model default="gcomp"
	 * @generated
	 */
	String getGcomp();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getGcomp <em>Gcomp</em>}' attribute.
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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ImplementsSetModelCount_Rc()
	 * @model default="rc"
	 * @generated
	 */
	String getRc();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getRc <em>Rc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rc</em>' attribute.
	 * @see #getRc()
	 * @generated
	 */
	void setRc(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"SetModelCount"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ImplementsSetModelCount_Name()
	 * @model default="SetModelCount" id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Driver Internal State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver Internal State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver Internal State</em>' attribute.
	 * @see #setDriverInternalState(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ImplementsSetModelCount_DriverInternalState()
	 * @model annotation="http://www.earthsystemcog.org/projects/nuopc mapping='localVariable: \"type(type_InternalState)\" definedInModule: \"NUOPC_Driver\"'"
	 * @generated
	 */
	String getDriverInternalState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getDriverInternalState <em>Driver Internal State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver Internal State</em>' attribute.
	 * @see #getDriverInternalState()
	 * @generated
	 */
	void setDriverInternalState(String value);

	/**
	 * Returns the value of the '<em><b>Gets Internal State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gets Internal State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gets Internal State</em>' containment reference.
	 * @see #setGetsInternalState(GetsInternalState)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ImplementsSetModelCount_GetsInternalState()
	 * @model containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='call: \"ESMF_UserCompGetInternalState(#ignore, #label, #../driverInternalState, #ignore)\"'"
	 * @generated
	 */
	GetsInternalState getGetsInternalState();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getGetsInternalState <em>Gets Internal State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gets Internal State</em>' containment reference.
	 * @see #getGetsInternalState()
	 * @generated
	 */
	void setGetsInternalState(GetsInternalState value);

	/**
	 * Returns the value of the '<em><b>Assigns Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigns Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigns Value</em>' attribute.
	 * @see #setAssignsValue(boolean)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ImplementsSetModelCount_AssignsValue()
	 * @model annotation="http://www.earthsystemcog.org/projects/nuopc mapping='assigns: #driverInternalState'"
	 * @generated
	 */
	boolean isAssignsValue();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#isAssignsValue <em>Assigns Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigns Value</em>' attribute.
	 * @see #isAssignsValue()
	 * @generated
	 */
	void setAssignsValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Attached</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attached</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attached</em>' attribute.
	 * @see #setAttached(boolean)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ImplementsSetModelCount_Attached()
	 * @model required="true" derived="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc essential='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.parent.genericImports.importsLabelSetModelCount <> null and self.name = self.parent.implementsSetServices.attachesMethod->select(m|m.name=self.parent.genericImports.importsLabelSetModelCount).userRoutine->asSequence()->first()'"
	 * @generated
	 */
	boolean isAttached();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#isAttached <em>Attached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attached</em>' attribute.
	 * @see #isAttached()
	 * @generated
	 */
	void setAttached(boolean value);

} // NUOPCDriver__ImplementsSetModelCount
