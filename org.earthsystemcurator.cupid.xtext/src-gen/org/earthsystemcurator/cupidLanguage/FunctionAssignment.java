/**
 */
package org.earthsystemcurator.cupidLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.FunctionAssignment#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.FunctionAssignment#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.FunctionAssignment#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getFunctionAssignment()
 * @model
 * @generated
 */
public interface FunctionAssignment extends ImplicitContextMapping
{
  /**
   * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhs</em>' containment reference.
   * @see #setLhs(Expr)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getFunctionAssignment_Lhs()
   * @model containment="true"
   * @generated
   */
  Expr getLhs();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.FunctionAssignment#getLhs <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhs</em>' containment reference.
   * @see #getLhs()
   * @generated
   */
  void setLhs(Expr value);

  /**
   * Returns the value of the '<em><b>Function Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Name</em>' containment reference.
   * @see #setFunctionName(Expr)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getFunctionAssignment_FunctionName()
   * @model containment="true"
   * @generated
   */
  Expr getFunctionName();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.FunctionAssignment#getFunctionName <em>Function Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Name</em>' containment reference.
   * @see #getFunctionName()
   * @generated
   */
  void setFunctionName(Expr value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.earthsystemcurator.cupidLanguage.ActualParam}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getFunctionAssignment_Params()
   * @model containment="true"
   * @generated
   */
  EList<ActualParam> getParams();

} // FunctionAssignment
