/**
 */
package org.earthsystemmodeling.psyche;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.Axis#isAncestor <em>Ancestor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemmodeling.psyche.PsychePackage#getAxis()
 * @model
 * @generated
 */
public interface Axis extends EObject
{
  /**
   * Returns the value of the '<em><b>Ancestor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ancestor</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ancestor</em>' attribute.
   * @see #setAncestor(boolean)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getAxis_Ancestor()
   * @model
   * @generated
   */
  boolean isAncestor();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.Axis#isAncestor <em>Ancestor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ancestor</em>' attribute.
   * @see #isAncestor()
   * @generated
   */
  void setAncestor(boolean value);

} // Axis
