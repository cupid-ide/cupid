/**
 */
package org.earthsystemcurator.cupid.fm.cplfm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constituent Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel#getGrid <em>Grid</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel#getParallel <em>Parallel</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getConstituentModel()
 * @model
 * @generated
 */
public interface ConstituentModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' containment reference.
	 * @see #setGrid(Grid)
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getConstituentModel_Grid()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Grid getGrid();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel#getGrid <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid</em>' containment reference.
	 * @see #getGrid()
	 * @generated
	 */
	void setGrid(Grid value);

	/**
	 * Returns the value of the '<em><b>Parallel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel</em>' containment reference.
	 * @see #setParallel(Parallel)
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getConstituentModel_Parallel()
	 * @model containment="true"
	 * @generated
	 */
	Parallel getParallel();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.fm.cplfm.ConstituentModel#getParallel <em>Parallel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel</em>' containment reference.
	 * @see #getParallel()
	 * @generated
	 */
	void setParallel(Parallel value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.fm.cplfm.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getConstituentModel_Field()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getField();

} // ConstituentModel
