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
   * Returns a new object of class '<em>Mappings</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mappings</em>'.
   * @generated
   */
  Mappings createMappings();

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
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CupidLanguagePackage getCupidLanguagePackage();

} //CupidLanguageFactory
