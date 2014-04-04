/**
 */
package org.earthsystemcurator.cupidLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Mapping#getContext <em>Context</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Mapping#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Mapping#getBefore <em>Before</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Mapping#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Context</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Context</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Context</em>' containment reference.
   * @see #setContext(PathExpr)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getMapping_Context()
   * @model containment="true"
   * @generated
   */
  PathExpr getContext();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Mapping#getContext <em>Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Context</em>' containment reference.
   * @see #getContext()
   * @generated
   */
  void setContext(PathExpr value);

  /**
   * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping</em>' containment reference.
   * @see #setMapping(ImplicitContextMapping)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getMapping_Mapping()
   * @model containment="true"
   * @generated
   */
  ImplicitContextMapping getMapping();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Mapping#getMapping <em>Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping</em>' containment reference.
   * @see #getMapping()
   * @generated
   */
  void setMapping(ImplicitContextMapping value);

  /**
   * Returns the value of the '<em><b>Before</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Before</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Before</em>' containment reference.
   * @see #setBefore(PathExpr)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getMapping_Before()
   * @model containment="true"
   * @generated
   */
  PathExpr getBefore();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Mapping#getBefore <em>Before</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Before</em>' containment reference.
   * @see #getBefore()
   * @generated
   */
  void setBefore(PathExpr value);

  /**
   * Returns the value of the '<em><b>After</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>After</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>After</em>' containment reference.
   * @see #setAfter(PathExpr)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getMapping_After()
   * @model containment="true"
   * @generated
   */
  PathExpr getAfter();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Mapping#getAfter <em>After</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>After</em>' containment reference.
   * @see #getAfter()
   * @generated
   */
  void setAfter(PathExpr value);

} // Mapping
