/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import java.lang.Comparable;
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
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#isUsesAllImports <em>Uses All Imports</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getSinglePublicSubroutine <em>Single Public Subroutine</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getImplementsSetServices <em>Implements Set Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getImplementsInitP1 <em>Implements Init P1</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getImplementsInitP2 <em>Implements Init P2</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getImplementsModelAdvance <em>Implements Model Advance</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModel()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc query='module'"
 * @generated
 */
public interface Model extends EObject {
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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModel_Name()
	 * @model id="true" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc query='moduleName'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uses All Imports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses All Imports</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses All Imports</em>' attribute.
	 * @see #setUsesAllImports(boolean)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModel_UsesAllImports()
	 * @model required="true"
	 * @generated
	 */
	boolean isUsesAllImports();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#isUsesAllImports <em>Uses All Imports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses All Imports</em>' attribute.
	 * @see #isUsesAllImports()
	 * @generated
	 */
	void setUsesAllImports(boolean value);

	/**
	 * Returns the value of the '<em><b>Implements Set Services</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Set Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Set Services</em>' containment reference.
	 * @see #setImplementsSetServices(ModelImplementsSetServices)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModel_ImplementsSetServices()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsSetServices#getParent
	 * @model opposite="parent" containment="true" keys="name"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc query='subroutine: *(type(ESMF_GridComp), integer)'"
	 * @generated
	 */
	ModelImplementsSetServices getImplementsSetServices();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getImplementsSetServices <em>Implements Set Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Set Services</em>' containment reference.
	 * @see #getImplementsSetServices()
	 * @generated
	 */
	void setImplementsSetServices(ModelImplementsSetServices value);

	/**
	 * Returns the value of the '<em><b>Single Public Subroutine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Public Subroutine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Public Subroutine</em>' attribute.
	 * @see #setSinglePublicSubroutine(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModel_SinglePublicSubroutine()
	 * @model annotation="http://www.earthsystemcog.org/projects/nuopc query='hasSinglePublicMember' transform='addPublicMember'"
	 * @generated
	 */
	String getSinglePublicSubroutine();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getSinglePublicSubroutine <em>Single Public Subroutine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Public Subroutine</em>' attribute.
	 * @see #getSinglePublicSubroutine()
	 * @generated
	 */
	void setSinglePublicSubroutine(String value);

	/**
	 * Returns the value of the '<em><b>Implements Init P1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Init P1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Init P1</em>' containment reference.
	 * @see #setImplementsInitP1(ModelImplementsInitP1)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModel_ImplementsInitP1()
	 * @model containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc query='subroutine: *(type(ESMF_GridComp), type(ESMF_State), type(ESMF_State), type(ESMF_Clock), integer)'"
	 * @generated
	 */
	ModelImplementsInitP1 getImplementsInitP1();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getImplementsInitP1 <em>Implements Init P1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements Init P1</em>' containment reference.
	 * @see #getImplementsInitP1()
	 * @generated
	 */
	void setImplementsInitP1(ModelImplementsInitP1 value);

	/**
	 * Returns the value of the '<em><b>Implements Init P2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implements Init P2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Init P2</em>' containment reference.
	 * @see #setImplementsInitP2(ModelImplementsInitP2)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModel_ImplementsInitP2()
	 * @model containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc query='subroutine: *(type(ESMF_GridComp), type(ESMF_State), type(ESMF_State), type(ESMF_Clock), integer)'"
	 * @generated
	 */
	ModelImplementsInitP2 getImplementsInitP2();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model#getImplementsInitP2 <em>Implements Init P2</em>}' containment reference.
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
	 * If the meaning of the '<em>Implements Model Advance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements Model Advance</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModel_ImplementsModelAdvance()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelAdvance#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc query='subroutine: *(type(ESMF_GridComp), integer)'"
	 * @generated
	 */
	EList<ModelAdvance> getImplementsModelAdvance();

} // Model
