/**
 */
package org.earthsystemmodeling.psyche;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.LocalExpression#getId <em>Id</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.LocalExpression#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.LocalExpression#getArrayConstructor <em>Array Constructor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemmodeling.psyche.PsychePackage#getLocalExpression()
 * @model
 * @generated
 */
public interface LocalExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getLocalExpression_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.LocalExpression#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Literal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' attribute.
   * @see #setLiteral(String)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getLocalExpression_Literal()
   * @model
   * @generated
   */
  String getLiteral();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.LocalExpression#getLiteral <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal</em>' attribute.
   * @see #getLiteral()
   * @generated
   */
  void setLiteral(String value);

  /**
   * Returns the value of the '<em><b>Array Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Constructor</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Constructor</em>' containment reference.
   * @see #setArrayConstructor(ArrayConstructor)
   * @see org.earthsystemmodeling.psyche.PsychePackage#getLocalExpression_ArrayConstructor()
   * @model containment="true"
   * @generated
   */
  ArrayConstructor getArrayConstructor();

  /**
   * Sets the value of the '{@link org.earthsystemmodeling.psyche.LocalExpression#getArrayConstructor <em>Array Constructor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Constructor</em>' containment reference.
   * @see #getArrayConstructor()
   * @generated
   */
  void setArrayConstructor(ArrayConstructor value);

} // LocalExpression
