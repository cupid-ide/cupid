/**
 */
package org.earthsystemcurator.cupidLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subconcept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Subconcept#isAttrib <em>Attrib</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Subconcept#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Subconcept#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Subconcept#isEssential <em>Essential</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Subconcept#isRef <em>Ref</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Subconcept#getConceptDef <em>Concept Def</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Subconcept#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Subconcept#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.Subconcept#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getSubconcept()
 * @model
 * @generated
 */
public interface Subconcept extends EObject
{
  /**
   * Returns the value of the '<em><b>Attrib</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attrib</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attrib</em>' attribute.
   * @see #setAttrib(boolean)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getSubconcept_Attrib()
   * @model
   * @generated
   */
  boolean isAttrib();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Subconcept#isAttrib <em>Attrib</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attrib</em>' attribute.
   * @see #isAttrib()
   * @generated
   */
  void setAttrib(boolean value);

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
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getSubconcept_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Subconcept#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' containment reference.
   * @see #setCardinality(Cardinality)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getSubconcept_Cardinality()
   * @model containment="true"
   * @generated
   */
  Cardinality getCardinality();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Subconcept#getCardinality <em>Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' containment reference.
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(Cardinality value);

  /**
   * Returns the value of the '<em><b>Essential</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Essential</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Essential</em>' attribute.
   * @see #setEssential(boolean)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getSubconcept_Essential()
   * @model
   * @generated
   */
  boolean isEssential();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Subconcept#isEssential <em>Essential</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Essential</em>' attribute.
   * @see #isEssential()
   * @generated
   */
  void setEssential(boolean value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' attribute.
   * @see #setRef(boolean)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getSubconcept_Ref()
   * @model
   * @generated
   */
  boolean isRef();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Subconcept#isRef <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' attribute.
   * @see #isRef()
   * @generated
   */
  void setRef(boolean value);

  /**
   * Returns the value of the '<em><b>Concept Def</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Concept Def</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Concept Def</em>' reference.
   * @see #setConceptDef(ConceptDef)
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getSubconcept_ConceptDef()
   * @model
   * @generated
   */
  ConceptDef getConceptDef();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Subconcept#getConceptDef <em>Concept Def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Concept Def</em>' reference.
   * @see #getConceptDef()
   * @generated
   */
  void setConceptDef(ConceptDef value);

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
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getSubconcept_Mapping()
   * @model containment="true"
   * @generated
   */
  Mapping getMapping();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Subconcept#getMapping <em>Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping</em>' containment reference.
   * @see #getMapping()
   * @generated
   */
  void setMapping(Mapping value);

  /**
   * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
   * The list contents are of type {@link org.earthsystemcurator.cupidLanguage.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotation</em>' containment reference list.
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getSubconcept_Annotation()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotation();

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
   * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage#getSubconcept_Body()
   * @model containment="true"
   * @generated
   */
  ConceptDefBody getBody();

  /**
   * Sets the value of the '{@link org.earthsystemcurator.cupidLanguage.Subconcept#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(ConceptDefBody value);

} // Subconcept
