/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Driver Connector Imports Connector Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport#getParent <em>Parent</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport#getSetServices <em>Set Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ConnectorImports__ConnectorImport()
 * @model annotation="http://www.earthsystemcog.org/projects/nuopc label='Connector Import'"
 * @generated
 */
public interface NUOPCDriver__ConnectorImports__ConnectorImport extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports#getConnectorImport <em>Connector Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(NUOPCDriver__ConnectorImports)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ConnectorImports__ConnectorImport_Parent()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports#getConnectorImport
	 * @model opposite="connectorImport" required="true" transient="false"
	 * @generated
	 */
	NUOPCDriver__ConnectorImports getParent();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(NUOPCDriver__ConnectorImports value);

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
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ConnectorImports__ConnectorImport_Name()
	 * @model required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='moduleName'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Set Services</b></em>' attribute.
	 * The default value is <code>"connector_SetServices"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Services</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Services</em>' attribute.
	 * @see #setSetServices(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getNUOPCDriver__ConnectorImports__ConnectorImport_SetServices()
	 * @model default="connector_SetServices" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='usesEntity: \"routine_SetServices\"'"
	 * @generated
	 */
	String getSetServices();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCDriver__ConnectorImports__ConnectorImport#getSetServices <em>Set Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Services</em>' attribute.
	 * @see #getSetServices()
	 * @generated
	 */
	void setSetServices(String value);

} // NUOPCDriver__ConnectorImports__ConnectorImport
