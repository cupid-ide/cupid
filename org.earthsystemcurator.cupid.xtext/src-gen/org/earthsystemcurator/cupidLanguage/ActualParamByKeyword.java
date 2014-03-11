/**
 */
package org.earthsystemcurator.cupidLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actual Param By Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.ActualParamByKeyword#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.ActualParamByKeyword#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getActualParamByKeyword()
 * @model
 * @generated
 */
public interface ActualParamByKeyword extends ImplicitContextMapping
{
  /**
   * Returns the value of the '<em><b>Keyword</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keyword</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keyword</em>' containment reference.
   * @see #setKeyword(IDOrPathExpr)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getActualParamByKeyword_Keyword()
   * @model containment="true"
   * @generated
   */
  IDOrPathExpr getKeyword();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.ActualParamByKeyword#getKeyword <em>Keyword</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Keyword</em>' containment reference.
   * @see #getKeyword()
   * @generated
   */
  void setKeyword(IDOrPathExpr value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(IDOrPathExpr)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getActualParamByKeyword_Value()
   * @model containment="true"
   * @generated
   */
  IDOrPathExpr getValue();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.ActualParamByKeyword#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(IDOrPathExpr value);

} // ActualParamByKeyword
