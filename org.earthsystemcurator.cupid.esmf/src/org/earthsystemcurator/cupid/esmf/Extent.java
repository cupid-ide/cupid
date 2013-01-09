/**
 */
package org.earthsystemcurator.cupid.esmf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.Extent#getMin <em>Min</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.Extent#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getExtent()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MinLessThanOrEqualToMax'"
 *        annotation="http://www.eclipse.org/ocl/examples/OCL MinLessThanOrEqualToMax='min <= max'"
 * @generated
 */
public interface Extent extends EObject {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getExtent_Min()
	 * @model required="true"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.Extent#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see org.earthsystemcurator.cupid.esmf.ESMFPackage#getExtent_Max()
	 * @model required="true"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.esmf.Extent#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

} // Extent
