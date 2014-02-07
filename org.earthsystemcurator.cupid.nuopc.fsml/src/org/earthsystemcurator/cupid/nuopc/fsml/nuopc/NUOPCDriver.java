/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getGenericImports <em>Generic Imports</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getModelImports <em>Model Imports</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getConnectorImports <em>Connector Imports</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetServices <em>Implements Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetModelCount <em>Implements Set Model Count</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetModelServices <em>Implements Set Model Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc mapping='module' label='NUOPC Driver' doc='NUOPC Driver is the generic driver component. It implements a child component harness, made of State and Component objects, that follows the NUOPC Common Model Architecture. It is specialized by plugging Model, Mediator, and Connector components into the harness. Driver components can be plugged into the harness to construct component hierarchies. The generic Driver initializes its child components according to a standard Initialization Phase Definition, and drives their Run() methods according a customizable run sequence.'"
 * @generated
 */
public interface NUOPCDriver extends EObject {

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication#getNuopcDriver <em>Nuopc Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(NUOPCApplication)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication#getNuopcDriver
	 * @model opposite="nuopcDriver" required="true" transient="false"
	 * @generated
	 */
	NUOPCApplication getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(NUOPCApplication value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"DriverDefault"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver_Name()
	 * @model default="DriverDefault" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='moduleName'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Generic Imports</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Imports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Imports</em>' containment reference.
	 * @see #setGenericImports(NUOPCDriver__GenericImports)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver_GenericImports()
	 * @model containment="true" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='usesModule: \"NUOPC_Driver\"' essential='true'"
	 * @generated
	 */
	NUOPCDriver__GenericImports getGenericImports();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getGenericImports <em>Generic Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Imports</em>' containment reference.
	 * @see #getGenericImports()
	 * @generated
	 */
	void setGenericImports(NUOPCDriver__GenericImports value);

	/**
	 * Returns the value of the '<em><b>Model Imports</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Imports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Imports</em>' containment reference.
	 * @see #setModelImports(NUOPCDriver__ModelImports)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver_ModelImports()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ModelImports#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	NUOPCDriver__ModelImports getModelImports();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getModelImports <em>Model Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Imports</em>' containment reference.
	 * @see #getModelImports()
	 * @generated
	 */
	void setModelImports(NUOPCDriver__ModelImports value);

	/**
	 * Returns the value of the '<em><b>Connector Imports</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Imports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Imports</em>' containment reference.
	 * @see #setConnectorImports(NUOPCDriver__ConnectorImports)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver_ConnectorImports()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	NUOPCDriver__ConnectorImports getConnectorImports();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getConnectorImports <em>Connector Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Imports</em>' containment reference.
	 * @see #getConnectorImports()
	 * @generated
	 */
	void setConnectorImports(NUOPCDriver__ConnectorImports value);

	/**
	 * Returns the value of the '<em><b>Implements Set Services</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Set Services</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Set Services</em>' containment reference.
	 * @see #setImplementsSetServices(NUOPCDriver__ImplementsSetServices)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver_ImplementsSetServices()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetServices#getParent
	 * @model opposite="parent" containment="true" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(type(ESMF_GridComp) #param_gcomp, integer #param_rc)\"' essential='true'"
	 * @generated
	 */
	NUOPCDriver__ImplementsSetServices getImplementsSetServices();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetServices <em>Implements Set Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Set Services</em>' containment reference.
	 * @see #getImplementsSetServices()
	 * @generated
	 */
	void setImplementsSetServices(NUOPCDriver__ImplementsSetServices value);

	/**
	 * Returns the value of the '<em><b>Implements Set Model Count</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Set Model Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Set Model Count</em>' containment reference.
	 * @see #setImplementsSetModelCount(NUOPCDriver__ImplementsSetModelCount)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver_ImplementsSetModelCount()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelCount#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(type(ESMF_GridComp) #gcomp, integer #rc)\"'"
	 * @generated
	 */
	NUOPCDriver__ImplementsSetModelCount getImplementsSetModelCount();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetModelCount <em>Implements Set Model Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Set Model Count</em>' containment reference.
	 * @see #getImplementsSetModelCount()
	 * @generated
	 */
	void setImplementsSetModelCount(NUOPCDriver__ImplementsSetModelCount value);

	/**
	 * Returns the value of the '<em><b>Implements Set Model Services</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Set Model Services</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Set Model Services</em>' containment reference.
	 * @see #setImplementsSetModelServices(NUOPCDriver__ImplementsSetModelServices)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver_ImplementsSetModelServices()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ImplementsSetModelServices#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(type(ESMF_GridComp) #gcomp, integer #rc)\"'"
	 * @generated
	 */
	NUOPCDriver__ImplementsSetModelServices getImplementsSetModelServices();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver#getImplementsSetModelServices <em>Implements Set Model Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Set Model Services</em>' containment reference.
	 * @see #getImplementsSetModelServices()
	 * @generated
	 */
	void setImplementsSetModelServices(NUOPCDriver__ImplementsSetModelServices value);
} // NUOPCDriver
