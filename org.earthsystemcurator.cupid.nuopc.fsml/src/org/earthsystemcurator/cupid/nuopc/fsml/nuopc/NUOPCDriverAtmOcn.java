/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver Atm Ocn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getGenericImports <em>Generic Imports</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getModelImports <em>Model Imports</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getImplementsSetServices <em>Implements Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getImplementsSetModelCount <em>Implements Set Model Count</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getImplementsSetModelServices <em>Implements Set Model Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getImplementsSetModelPetLists <em>Implements Set Model Pet Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriverAtmOcn()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc mapping='module' label='NUOPC Atm-Ocn Driver'"
 * @generated
 */
public interface NUOPCDriverAtmOcn extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication#getNuopcDriverAtmOcn <em>Nuopc Driver Atm Ocn</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(NUOPCApplication)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriverAtmOcn_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication#getNuopcDriverAtmOcn
	 * @model opposite="nuopcDriverAtmOcn" required="true" transient="false"
	 * @generated
	 */
	NUOPCApplication getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(NUOPCApplication value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"ModelDefault"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriverAtmOcn_Name()
	 * @model default="ModelDefault" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='moduleName'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getName <em>Name</em>}' attribute.
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
	 * @see #setGenericImports(NUOPCDriverAtmOcn__GenericImports)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriverAtmOcn_GenericImports()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NUOPCDriverAtmOcn__GenericImports getGenericImports();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getGenericImports <em>Generic Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Imports</em>' containment reference.
	 * @see #getGenericImports()
	 * @generated
	 */
	void setGenericImports(NUOPCDriverAtmOcn__GenericImports value);

	/**
	 * Returns the value of the '<em><b>Model Imports</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Imports</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Imports</em>' containment reference.
	 * @see #setModelImports(NUOPCDriverAtmOcn__ModelImports)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriverAtmOcn_ModelImports()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ModelImports#getParent
	 * @model opposite="parent" containment="true" required="true"
	 * @generated
	 */
	NUOPCDriverAtmOcn__ModelImports getModelImports();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getModelImports <em>Model Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Imports</em>' containment reference.
	 * @see #getModelImports()
	 * @generated
	 */
	void setModelImports(NUOPCDriverAtmOcn__ModelImports value);

	/**
	 * Returns the value of the '<em><b>Implements Set Services</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Set Services</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Set Services</em>' containment reference.
	 * @see #setImplementsSetServices(NUOPCDriverAtmOcn__ImplementsSetServices)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriverAtmOcn_ImplementsSetServices()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetServices#getParent
	 * @model opposite="parent" containment="true" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(type(ESMF_GridComp) #param_gcomp, integer #param_rc)\"' essential='true'"
	 * @generated
	 */
	NUOPCDriverAtmOcn__ImplementsSetServices getImplementsSetServices();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getImplementsSetServices <em>Implements Set Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Set Services</em>' containment reference.
	 * @see #getImplementsSetServices()
	 * @generated
	 */
	void setImplementsSetServices(NUOPCDriverAtmOcn__ImplementsSetServices value);

	/**
	 * Returns the value of the '<em><b>Implements Set Model Count</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Set Model Count</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Set Model Count</em>' containment reference.
	 * @see #setImplementsSetModelCount(NUOPCDriverAtmOcn__ImplementsSetModelCount)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriverAtmOcn_ImplementsSetModelCount()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelCount#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(type(ESMF_GridComp) #gcomp, integer #rc)\"'"
	 * @generated
	 */
	NUOPCDriverAtmOcn__ImplementsSetModelCount getImplementsSetModelCount();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getImplementsSetModelCount <em>Implements Set Model Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Set Model Count</em>' containment reference.
	 * @see #getImplementsSetModelCount()
	 * @generated
	 */
	void setImplementsSetModelCount(NUOPCDriverAtmOcn__ImplementsSetModelCount value);

	/**
	 * Returns the value of the '<em><b>Implements Set Model Services</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Set Model Services</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Set Model Services</em>' containment reference.
	 * @see #setImplementsSetModelServices(NUOPCDriverAtmOcn__ImplementsSetModelServices)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriverAtmOcn_ImplementsSetModelServices()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelServices#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(type(ESMF_GridComp) #gcomp, integer #rc)\"'"
	 * @generated
	 */
	NUOPCDriverAtmOcn__ImplementsSetModelServices getImplementsSetModelServices();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getImplementsSetModelServices <em>Implements Set Model Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Set Model Services</em>' containment reference.
	 * @see #getImplementsSetModelServices()
	 * @generated
	 */
	void setImplementsSetModelServices(NUOPCDriverAtmOcn__ImplementsSetModelServices value);

	/**
	 * Returns the value of the '<em><b>Implements Set Model Pet Lists</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelPetLists#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Set Model Pet Lists</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Set Model Pet Lists</em>' containment reference.
	 * @see #setImplementsSetModelPetLists(NUOPCDriverAtmOcn__ImplementsSetModelPetLists)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriverAtmOcn_ImplementsSetModelPetLists()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__ImplementsSetModelPetLists#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='subroutine: \"#name(type(ESMF_GridComp) #gcomp, integer #rc)\"'"
	 * @generated
	 */
	NUOPCDriverAtmOcn__ImplementsSetModelPetLists getImplementsSetModelPetLists();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn#getImplementsSetModelPetLists <em>Implements Set Model Pet Lists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Set Model Pet Lists</em>' containment reference.
	 * @see #getImplementsSetModelPetLists()
	 * @generated
	 */
	void setImplementsSetModelPetLists(NUOPCDriverAtmOcn__ImplementsSetModelPetLists value);

} // NUOPCDriverAtmOcn
