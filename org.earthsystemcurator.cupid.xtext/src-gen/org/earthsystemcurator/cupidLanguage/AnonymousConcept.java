/**
 */
package org.earthsystemcurator.cupidLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.AnonymousConcept#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.AnonymousConcept#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getAnonymousConcept()
 * @model
 * @generated
 */
public interface AnonymousConcept extends ConceptDefOrRef
{
  /**
   * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping</em>' containment reference.
   * @see #setMapping(Mapping)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getAnonymousConcept_Mapping()
   * @model containment="true"
   * @generated
   */
  Mapping getMapping();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.AnonymousConcept#getMapping <em>Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping</em>' containment reference.
   * @see #getMapping()
   * @generated
   */
  void setMapping(Mapping value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(ConceptDefBody)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getAnonymousConcept_Body()
   * @model containment="true"
   * @generated
   */
  ConceptDefBody getBody();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.AnonymousConcept#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ConceptDefBody value);

} // AnonymousConcept
