/**
 */
package org.earthsystemmodeling.cupid.NUOPC;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.Field#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.Field#getImportedBy <em>Imported By</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.Field#getExportedBy <em>Exported By</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.Field#isImport <em>Import</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.Field#isExport <em>Export</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.Field#getStandardName <em>Standard Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.Field#getGrid <em>Grid</em>}</li>
 * </ul>
 *
 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getField()
 * @model
 * @generated
 */
public interface Field extends EObject {
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
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getField_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemmodeling.cupid.NUOPC.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Imported By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemmodeling.cupid.NUOPC.BaseModel#getImportFields <em>Import Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported By</em>' container reference.
	 * @see #setImportedBy(BaseModel)
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getField_ImportedBy()
	 * @see org.earthsystemmodeling.cupid.NUOPC.BaseModel#getImportFields
	 * @model opposite="importFields" transient="false"
	 * @generated
	 */
	BaseModel getImportedBy();

	/**
	 * Sets the value of the '{@link org.earthsystemmodeling.cupid.NUOPC.Field#getImportedBy <em>Imported By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imported By</em>' container reference.
	 * @see #getImportedBy()
	 * @generated
	 */
	void setImportedBy(BaseModel value);

	/**
	 * Returns the value of the '<em><b>Exported By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.earthsystemmodeling.cupid.NUOPC.BaseModel#getExportFields <em>Export Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exported By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported By</em>' container reference.
	 * @see #setExportedBy(BaseModel)
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getField_ExportedBy()
	 * @see org.earthsystemmodeling.cupid.NUOPC.BaseModel#getExportFields
	 * @model opposite="exportFields" transient="false"
	 * @generated
	 */
	BaseModel getExportedBy();

	/**
	 * Sets the value of the '{@link org.earthsystemmodeling.cupid.NUOPC.Field#getExportedBy <em>Exported By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exported By</em>' container reference.
	 * @see #getExportedBy()
	 * @generated
	 */
	void setExportedBy(BaseModel value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' attribute.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getField_Import()
	 * @model required="true" changeable="false" derived="true"
	 * @generated
	 */
	boolean isImport();

	/**
	 * Returns the value of the '<em><b>Export</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export</em>' attribute.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getField_Export()
	 * @model required="true" changeable="false" derived="true"
	 * @generated
	 */
	boolean isExport();

	/**
	 * Returns the value of the '<em><b>Standard Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Standard Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Standard Name</em>' attribute.
	 * @see #setStandardName(String)
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getField_StandardName()
	 * @model required="true"
	 * @generated
	 */
	String getStandardName();

	/**
	 * Sets the value of the '{@link org.earthsystemmodeling.cupid.NUOPC.Field#getStandardName <em>Standard Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standard Name</em>' attribute.
	 * @see #getStandardName()
	 * @generated
	 */
	void setStandardName(String value);

	/**
	 * Returns the value of the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' reference.
	 * @see #setGrid(Grid)
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getField_Grid()
	 * @model required="true"
	 * @generated
	 */
	Grid getGrid();

	/**
	 * Sets the value of the '{@link org.earthsystemmodeling.cupid.NUOPC.Field#getGrid <em>Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(Grid value);

} // Field
