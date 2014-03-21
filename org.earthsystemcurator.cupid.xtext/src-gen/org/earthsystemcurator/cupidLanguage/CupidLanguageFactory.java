/**
 */
package org.earthsystemcurator.cupidLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguagePackage
 * @generated
 */
public interface CupidLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CupidLanguageFactory eINSTANCE = org.earthsystemcurator.cupidLanguage.impl.CupidLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Language</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Language</em>'.
   * @generated
   */
  Language createLanguage();

  /**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
  Annotation createAnnotation();

  /**
   * Returns a new object of class '<em>Concept Def</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concept Def</em>'.
   * @generated
   */
  ConceptDef createConceptDef();

  /**
   * Returns a new object of class '<em>Subconcept Or Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subconcept Or Attribute</em>'.
   * @generated
   */
  SubconceptOrAttribute createSubconceptOrAttribute();

  /**
   * Returns a new object of class '<em>Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cardinality</em>'.
   * @generated
   */
  Cardinality createCardinality();

  /**
   * Returns a new object of class '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping</em>'.
   * @generated
   */
  Mapping createMapping();

  /**
   * Returns a new object of class '<em>Implicit Context Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implicit Context Mapping</em>'.
   * @generated
   */
  ImplicitContextMapping createImplicitContextMapping();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Module Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module Name</em>'.
   * @generated
   */
  ModuleName createModuleName();

  /**
   * Returns a new object of class '<em>Uses Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uses Module</em>'.
   * @generated
   */
  UsesModule createUsesModule();

  /**
   * Returns a new object of class '<em>Uses Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uses Entity</em>'.
   * @generated
   */
  UsesEntity createUsesEntity();

  /**
   * Returns a new object of class '<em>Subroutine</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subroutine</em>'.
   * @generated
   */
  Subroutine createSubroutine();

  /**
   * Returns a new object of class '<em>Formal Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formal Param</em>'.
   * @generated
   */
  FormalParam createFormalParam();

  /**
   * Returns a new object of class '<em>Intent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Intent</em>'.
   * @generated
   */
  Intent createIntent();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Subroutine Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Subroutine Name</em>'.
   * @generated
   */
  SubroutineName createSubroutineName();

  /**
   * Returns a new object of class '<em>Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call</em>'.
   * @generated
   */
  Call createCall();

  /**
   * Returns a new object of class '<em>Actual Param</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actual Param</em>'.
   * @generated
   */
  ActualParam createActualParam();

  /**
   * Returns a new object of class '<em>Actual Param By Keyword</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Actual Param By Keyword</em>'.
   * @generated
   */
  ActualParamByKeyword createActualParamByKeyword();

  /**
   * Returns a new object of class '<em>ID Or Wildcard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ID Or Wildcard</em>'.
   * @generated
   */
  IDOrWildcard createIDOrWildcard();

  /**
   * Returns a new object of class '<em>ID Or Path Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ID Or Path Expr</em>'.
   * @generated
   */
  IDOrPathExpr createIDOrPathExpr();

  /**
   * Returns a new object of class '<em>Path Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Expr</em>'.
   * @generated
   */
  PathExpr createPathExpr();

  /**
   * Returns a new object of class '<em>Axis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Axis</em>'.
   * @generated
   */
  Axis createAxis();

  /**
   * Returns a new object of class '<em>Path Expr Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Expr Term</em>'.
   * @generated
   */
  PathExprTerm createPathExprTerm();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CupidLanguagePackage getCupidLanguagePackage();

} //CupidLanguageFactory
