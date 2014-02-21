/**
 */
package org.earthsystemcurator.cupidLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.ConceptDef#isTop <em>Top</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.ConceptDef#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.ConceptDef#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.ConceptDef#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getConceptDef()
 * @model
 * @generated
 */
public interface ConceptDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Top</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Top</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Top</em>' attribute.
   * @see #setTop(boolean)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getConceptDef_Top()
   * @model
   * @generated
   */
  boolean isTop();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.ConceptDef#isTop <em>Top</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Top</em>' attribute.
   * @see #isTop()
   * @generated
   */
  void setTop(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getConceptDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.ConceptDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getConceptDef_Mapping()
   * @model containment="true"
   * @generated
   */
  Mapping getMapping();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.ConceptDef#getMapping <em>Mapping</em>}' containment reference.
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
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getConceptDef_Body()
   * @model containment="true"
   * @generated
   */
  ConceptDefBody getBody();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.ConceptDef#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ConceptDefBody value);

} // ConceptDef
