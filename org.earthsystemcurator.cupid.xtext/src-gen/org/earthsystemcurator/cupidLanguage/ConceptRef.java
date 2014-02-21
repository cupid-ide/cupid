/**
 */
package org.earthsystemcurator.cupidLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.ConceptRef#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getConceptRef()
 * @model
 * @generated
 */
public interface ConceptRef extends ConceptDefOrRef
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(ConceptDef)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getConceptRef_Name()
   * @model
   * @generated
   */
  ConceptDef getName();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.ConceptRef#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(ConceptDef value);

} // ConceptRef
