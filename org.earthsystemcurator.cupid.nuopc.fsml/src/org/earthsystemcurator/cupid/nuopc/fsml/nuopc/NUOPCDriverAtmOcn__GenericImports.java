/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver Atm Ocn Generic Imports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsGenericSS <em>Imports Generic SS</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsTypeDriverIS <em>Imports Type Driver IS</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsLabelSetModelCount <em>Imports Label Set Model Count</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsLabelSetModelServices <em>Imports Label Set Model Services</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsLabelSetModelPetLists <em>Imports Label Set Model Pet Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriverAtmOcn__GenericImports()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc label='Imports from NUOPC Atm-Ocn Driver' doc='Subclasses of NUOPC Atm-Ocn Driver should import generic subroutines, types, and labels from NUOPC_DriverAtmOcn.' icon='import.png'"
 * @generated
 */
public interface NUOPCDriverAtmOcn__GenericImports extends EObject {
	/**
	 * Returns the value of the '<em><b>Imports Generic SS</b></em>' attribute.
	 * The default value is <code>"driver_routine_SS"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports Generic SS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports Generic SS</em>' attribute.
	 * @see #setImportsGenericSS(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriverAtmOcn__GenericImports_ImportsGenericSS()
	 * @model default="driver_routine_SS" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='uses: \"NUOPC_DriverAtmOcn\" entity: \"routine_SetServices\"' label='routine_SetServices' doc='Subclasses of NUOPC Atm-Ocn Driver should import the public generic Set Services subroutine \"routine_SetServices\"'"
	 * @generated
	 */
	String getImportsGenericSS();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsGenericSS <em>Imports Generic SS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports Generic SS</em>' attribute.
	 * @see #getImportsGenericSS()
	 * @generated
	 */
	void setImportsGenericSS(String value);

	/**
	 * Returns the value of the '<em><b>Imports Type Driver IS</b></em>' attribute.
	 * The default value is <code>"driver_type_IS"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports Type Driver IS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports Type Driver IS</em>' attribute.
	 * @see #setImportsTypeDriverIS(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriverAtmOcn__GenericImports_ImportsTypeDriverIS()
	 * @model default="driver_type_IS" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='uses: \"NUOPC_DriverAtmOcn\" entity: \"type_InternalState\"' label='type_InternalState'"
	 * @generated
	 */
	String getImportsTypeDriverIS();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsTypeDriverIS <em>Imports Type Driver IS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports Type Driver IS</em>' attribute.
	 * @see #getImportsTypeDriverIS()
	 * @generated
	 */
	void setImportsTypeDriverIS(String value);

	/**
	 * Returns the value of the '<em><b>Imports Label Set Model Count</b></em>' attribute.
	 * The default value is <code>"driver_label_SetModelCount"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports Label Set Model Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports Label Set Model Count</em>' attribute.
	 * @see #setImportsLabelSetModelCount(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriverAtmOcn__GenericImports_ImportsLabelSetModelCount()
	 * @model default="driver_label_SetModelCount"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='uses: \"NUOPC_DriverAtmOcn\" entity: \"label_SetModelCount\"' label='label_SetModelCount'"
	 * @generated
	 */
	String getImportsLabelSetModelCount();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsLabelSetModelCount <em>Imports Label Set Model Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports Label Set Model Count</em>' attribute.
	 * @see #getImportsLabelSetModelCount()
	 * @generated
	 */
	void setImportsLabelSetModelCount(String value);

	/**
	 * Returns the value of the '<em><b>Imports Label Set Model Services</b></em>' attribute.
	 * The default value is <code>"driver_label_SetModelServices"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports Label Set Model Services</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports Label Set Model Services</em>' attribute.
	 * @see #setImportsLabelSetModelServices(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriverAtmOcn__GenericImports_ImportsLabelSetModelServices()
	 * @model default="driver_label_SetModelServices"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='uses: \"NUOPC_DriverAtmOcn\" entity: \"label_SetModelServices\"' label='label_SetModelServices'"
	 * @generated
	 */
	String getImportsLabelSetModelServices();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsLabelSetModelServices <em>Imports Label Set Model Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports Label Set Model Services</em>' attribute.
	 * @see #getImportsLabelSetModelServices()
	 * @generated
	 */
	void setImportsLabelSetModelServices(String value);

	/**
	 * Returns the value of the '<em><b>Imports Label Set Model Pet Lists</b></em>' attribute.
	 * The default value is <code>"driver_label_SetModelPetLists"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports Label Set Model Pet Lists</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports Label Set Model Pet Lists</em>' attribute.
	 * @see #setImportsLabelSetModelPetLists(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriverAtmOcn__GenericImports_ImportsLabelSetModelPetLists()
	 * @model default="driver_label_SetModelPetLists"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='uses: \"NUOPC_DriverAtmOcn\" entity: \"label_SetModelPetLists\"' label='label_SetModelPetLists'"
	 * @generated
	 */
	String getImportsLabelSetModelPetLists();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriverAtmOcn__GenericImports#getImportsLabelSetModelPetLists <em>Imports Label Set Model Pet Lists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imports Label Set Model Pet Lists</em>' attribute.
	 * @see #getImportsLabelSetModelPetLists()
	 * @generated
	 */
	void setImportsLabelSetModelPetLists(String value);

} // NUOPCDriverAtmOcn__GenericImports
