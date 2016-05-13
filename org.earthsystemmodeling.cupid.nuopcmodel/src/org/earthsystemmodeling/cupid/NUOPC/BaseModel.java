/**
 */
package org.earthsystemmodeling.cupid.NUOPC;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.BaseModel#getGrids <em>Grids</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.BaseModel#getImportFields <em>Import Fields</em>}</li>
 *   <li>{@link org.earthsystemmodeling.cupid.NUOPC.BaseModel#getExportFields <em>Export Fields</em>}</li>
 * </ul>
 *
 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getBaseModel()
 * @model abstract="true"
 * @generated
 */
public interface BaseModel extends Component {

	/**
	 * Returns the value of the '<em><b>Grids</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemmodeling.cupid.NUOPC.Grid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grids</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grids</em>' containment reference list.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getBaseModel_Grids()
	 * @model containment="true"
	 * @generated
	 */
	EList<Grid> getGrids();

	/**
	 * Returns the value of the '<em><b>Import Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemmodeling.cupid.NUOPC.Field}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemmodeling.cupid.NUOPC.Field#getImportedBy <em>Imported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Fields</em>' containment reference list.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getBaseModel_ImportFields()
	 * @see org.earthsystemmodeling.cupid.NUOPC.Field#getImportedBy
	 * @model opposite="importedBy" containment="true"
	 * @generated
	 */
	EList<Field> getImportFields();

	/**
	 * Returns the value of the '<em><b>Export Fields</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemmodeling.cupid.NUOPC.Field}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemmodeling.cupid.NUOPC.Field#getExportedBy <em>Exported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export Fields</em>' containment reference list.
	 * @see org.earthsystemmodeling.cupid.NUOPC.NUOPCPackage#getBaseModel_ExportFields()
	 * @see org.earthsystemmodeling.cupid.NUOPC.Field#getExportedBy
	 * @model opposite="exportedBy" containment="true"
	 * @generated
	 */
	EList<Field> getExportFields();
} // BaseModel
