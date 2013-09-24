/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImportsGenericSS <em>Imports Generic SS</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsSetServices <em>Implements Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsInitP1 <em>Implements Init P1</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsInitP2 <em>Implements Init P2</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsModelAdvance <em>Implements Model Advance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc mapping='module'"
 * @generated
 */
public interface NUOPCModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Model"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel_Name()
	 * @model default="Model" id="true" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='moduleName'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Imports Generic SS</b></em>' attribute.
	 * The default value is <code>"nuopcmodel_ss"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports Generic SS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports Generic SS</em>' attribute.
	 * @see #setImportsGenericSS(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel_ImportsGenericSS()
	 * @model default="nuopcmodel_ss"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='uses: \"NUOPC_Model\" entity: \"routine_SetServices\"'"
	 * @generated
	 */
	String getImportsGenericSS();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImportsGenericSS <em>Imports Generic SS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports Generic SS</em>' attribute.
	 * @see #getImportsGenericSS()
	 * @generated
	 */
	void setImportsGenericSS(String value);

	/**
	 * Returns the value of the '<em><b>Implements Set Services</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Set Services</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Set Services</em>' containment reference.
	 * @see #setImplementsSetServices(ModelImplementsSetServices)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel_ImplementsSetServices()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParent
	 * @model opposite="parent" containment="true" keys="name"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(inout type(ESMF_GridComp) #param_gcomp, out integer #param_rc)\"' essential='true'"
	 * @generated
	 */
	ModelImplementsSetServices getImplementsSetServices();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsSetServices <em>Implements Set Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Set Services</em>' containment reference.
	 * @see #getImplementsSetServices()
	 * @generated
	 */
	void setImplementsSetServices(ModelImplementsSetServices value);

	/**
	 * Returns the value of the '<em><b>Implements Init P1</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Init P1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Init P1</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel_ImplementsInitP1()
	 * @model containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(type(ESMF_GridComp), type(ESMF_State) #importParam, type(ESMF_State) #exportParam, \ttype(ESMF_Clock), integer)\"'"
	 * @generated
	 */
	EList<ModelImplementsInitP1> getImplementsInitP1();

	/**
	 * Returns the value of the '<em><b>Implements Init P2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Init P2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Init P2</em>' containment reference.
	 * @see #setImplementsInitP2(ModelImplementsInitP2)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel_ImplementsInitP2()
	 * @model containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(type(ESMF_GridComp), type(ESMF_State) #importParam, type(ESMF_State) #exportParam, type(ESMF_Clock), integer)\"'"
	 * @generated
	 */
	ModelImplementsInitP2 getImplementsInitP2();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel#getImplementsInitP2 <em>Implements Init P2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Init P2</em>' containment reference.
	 * @see #getImplementsInitP2()
	 * @generated
	 */
	void setImplementsInitP2(ModelImplementsInitP2 value);

	/**
	 * Returns the value of the '<em><b>Implements Model Advance</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Model Advance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Model Advance</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCModel_ImplementsModelAdvance()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance#getParent
	 * @model opposite="parent" containment="true" ordered="false"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingX='subroutine: \"*(type(ESMF_GridComp), integer)\"'"
	 * @generated
	 */
	EList<ModelAdvance> getImplementsModelAdvance();

} // NUOPCModel
