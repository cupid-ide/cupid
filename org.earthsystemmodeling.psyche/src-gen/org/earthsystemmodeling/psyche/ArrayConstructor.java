/**
 */
package org.earthsystemmodeling.psyche;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Constructor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.ArrayConstructor#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemmodeling.psyche.PsychePackage#getArrayConstructor()
 * @model
 * @generated
 */
public interface ArrayConstructor extends EObject
{
  /**
   * Returns the value of the '<em><b>Item</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' attribute list.
   * @see org.earthsystemmodeling.psyche.PsychePackage#getArrayConstructor_Item()
   * @model unique="false"
   * @generated
   */
  EList<String> getItem();

} // ArrayConstructor
