/**
 */
package org.earthsystemcurator.cupid.fm.cplfm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logically Rectangular Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getMinX <em>Min X</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getMaxX <em>Max X</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getMinY <em>Min Y</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getMaxY <em>Max Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getLogicallyRectangularGrid()
 * @model
 * @generated
 */
public interface LogicallyRectangularGrid extends StructuredGrid {
	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' reference.
	 * @see #setCoordinates(Coordinates)
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getLogicallyRectangularGrid_Coordinates()
	 * @model
	 * @generated
	 */
	Coordinates getCoordinates();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getCoordinates <em>Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(Coordinates value);

	/**
	 * Returns the value of the '<em><b>Min X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min X</em>' attribute.
	 * @see #setMinX(int)
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getLogicallyRectangularGrid_MinX()
	 * @model required="true"
	 * @generated
	 */
	int getMinX();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getMinX <em>Min X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min X</em>' attribute.
	 * @see #getMinX()
	 * @generated
	 */
	void setMinX(int value);

	/**
	 * Returns the value of the '<em><b>Max X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max X</em>' attribute.
	 * @see #setMaxX(int)
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getLogicallyRectangularGrid_MaxX()
	 * @model required="true"
	 * @generated
	 */
	int getMaxX();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getMaxX <em>Max X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max X</em>' attribute.
	 * @see #getMaxX()
	 * @generated
	 */
	void setMaxX(int value);

	/**
	 * Returns the value of the '<em><b>Min Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Y</em>' attribute.
	 * @see #setMinY(int)
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getLogicallyRectangularGrid_MinY()
	 * @model required="true"
	 * @generated
	 */
	int getMinY();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getMinY <em>Min Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Y</em>' attribute.
	 * @see #getMinY()
	 * @generated
	 */
	void setMinY(int value);

	/**
	 * Returns the value of the '<em><b>Max Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Y</em>' attribute.
	 * @see #setMaxY(int)
	 * @see org.earthsystemcurator.cupid.fm.cplfm.CplfmPackage#getLogicallyRectangularGrid_MaxY()
	 * @model required="true"
	 * @generated
	 */
	int getMaxY();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.fm.cplfm.LogicallyRectangularGrid#getMaxY <em>Max Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Y</em>' attribute.
	 * @see #getMaxY()
	 * @generated
	 */
	void setMaxY(int value);

} // LogicallyRectangularGrid
