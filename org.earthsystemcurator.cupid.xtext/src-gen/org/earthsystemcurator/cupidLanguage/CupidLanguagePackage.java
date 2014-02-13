/**
 */
package org.earthsystemcurator.cupidLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.earthsystemcurator.cupidLanguage.CupidLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface CupidLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cupidLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.earthsystemcurator.org/CupidLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cupidLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CupidLanguagePackage eINSTANCE = org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.MappingsImpl <em>Mappings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.MappingsImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getMappings()
   * @generated
   */
  int MAPPINGS = 0;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPINGS__MAPPINGS = 0;

  /**
   * The number of structural features of the '<em>Mappings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPINGS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.MappingImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 1;

  /**
   * The feature id for the '<em><b>Context</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__CONTEXT = 0;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__MAPPING = 1;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.ImplicitContextMappingImpl <em>Implicit Context Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.ImplicitContextMappingImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getImplicitContextMapping()
   * @generated
   */
  int IMPLICIT_CONTEXT_MAPPING = 2;

  /**
   * The number of structural features of the '<em>Implicit Context Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.CallImpl <em>Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.CallImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getCall()
   * @generated
   */
  int CALL = 3;

  /**
   * The feature id for the '<em><b>Subroutine Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__SUBROUTINE_NAME = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__PARAMS = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FEATURE_COUNT = IMPLICIT_CONTEXT_MAPPING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.ActualParamImpl <em>Actual Param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.ActualParamImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getActualParam()
   * @generated
   */
  int ACTUAL_PARAM = 4;

  /**
   * The feature id for the '<em><b>Keyword</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_PARAM__KEYWORD = 0;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_PARAM__OPTIONAL = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_PARAM__VALUE = 2;

  /**
   * The number of structural features of the '<em>Actual Param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTUAL_PARAM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.IDOrPathExprImpl <em>ID Or Path Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.IDOrPathExprImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getIDOrPathExpr()
   * @generated
   */
  int ID_OR_PATH_EXPR = 6;

  /**
   * The number of structural features of the '<em>ID Or Path Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_OR_PATH_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.IDOrWildcardImpl <em>ID Or Wildcard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.IDOrWildcardImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getIDOrWildcard()
   * @generated
   */
  int ID_OR_WILDCARD = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_OR_WILDCARD__ID = ID_OR_PATH_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Wildcard</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_OR_WILDCARD__WILDCARD = ID_OR_PATH_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ID Or Wildcard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_OR_WILDCARD_FEATURE_COUNT = ID_OR_PATH_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.earthsystemcurator.cupidLanguage.impl.PathExprImpl <em>Path Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.earthsystemcurator.cupidLanguage.impl.PathExprImpl
   * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getPathExpr()
   * @generated
   */
  int PATH_EXPR = 7;

  /**
   * The feature id for the '<em><b>Segments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR__SEGMENTS = ID_OR_PATH_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Path Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_EXPR_FEATURE_COUNT = ID_OR_PATH_EXPR_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.Mappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mappings</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Mappings
   * @generated
   */
  EClass getMappings();

  /**
   * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupidLanguage.Mappings#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Mappings#getMappings()
   * @see #getMappings()
   * @generated
   */
  EReference getMappings_Mappings();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.Mapping#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Context</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Mapping#getContext()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Context();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.Mapping#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Mapping#getMapping()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Mapping();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.ImplicitContextMapping <em>Implicit Context Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implicit Context Mapping</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ImplicitContextMapping
   * @generated
   */
  EClass getImplicitContextMapping();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Call
   * @generated
   */
  EClass getCall();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.Call#getSubroutineName <em>Subroutine Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subroutine Name</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Call#getSubroutineName()
   * @see #getCall()
   * @generated
   */
  EReference getCall_SubroutineName();

  /**
   * Returns the meta object for the containment reference list '{@link org.earthsystemcurator.cupidLanguage.Call#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.earthsystemcurator.cupidLanguage.Call#getParams()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Params();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.ActualParam <em>Actual Param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actual Param</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ActualParam
   * @generated
   */
  EClass getActualParam();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.ActualParam#getKeyword <em>Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Keyword</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ActualParam#getKeyword()
   * @see #getActualParam()
   * @generated
   */
  EAttribute getActualParam_Keyword();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.ActualParam#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ActualParam#isOptional()
   * @see #getActualParam()
   * @generated
   */
  EAttribute getActualParam_Optional();

  /**
   * Returns the meta object for the containment reference '{@link org.earthsystemcurator.cupidLanguage.ActualParam#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.earthsystemcurator.cupidLanguage.ActualParam#getValue()
   * @see #getActualParam()
   * @generated
   */
  EReference getActualParam_Value();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.IDOrWildcard <em>ID Or Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ID Or Wildcard</em>'.
   * @see org.earthsystemcurator.cupidLanguage.IDOrWildcard
   * @generated
   */
  EClass getIDOrWildcard();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.IDOrWildcard#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.earthsystemcurator.cupidLanguage.IDOrWildcard#getId()
   * @see #getIDOrWildcard()
   * @generated
   */
  EAttribute getIDOrWildcard_Id();

  /**
   * Returns the meta object for the attribute '{@link org.earthsystemcurator.cupidLanguage.IDOrWildcard#isWildcard <em>Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wildcard</em>'.
   * @see org.earthsystemcurator.cupidLanguage.IDOrWildcard#isWildcard()
   * @see #getIDOrWildcard()
   * @generated
   */
  EAttribute getIDOrWildcard_Wildcard();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.IDOrPathExpr <em>ID Or Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ID Or Path Expr</em>'.
   * @see org.earthsystemcurator.cupidLanguage.IDOrPathExpr
   * @generated
   */
  EClass getIDOrPathExpr();

  /**
   * Returns the meta object for class '{@link org.earthsystemcurator.cupidLanguage.PathExpr <em>Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Expr</em>'.
   * @see org.earthsystemcurator.cupidLanguage.PathExpr
   * @generated
   */
  EClass getPathExpr();

  /**
   * Returns the meta object for the attribute list '{@link org.earthsystemcurator.cupidLanguage.PathExpr#getSegments <em>Segments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Segments</em>'.
   * @see org.earthsystemcurator.cupidLanguage.PathExpr#getSegments()
   * @see #getPathExpr()
   * @generated
   */
  EAttribute getPathExpr_Segments();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CupidLanguageFactory getCupidLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.MappingsImpl <em>Mappings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.MappingsImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getMappings()
     * @generated
     */
    EClass MAPPINGS = eINSTANCE.getMappings();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPINGS__MAPPINGS = eINSTANCE.getMappings_Mappings();

    /**
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.MappingImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getMapping()
     * @generated
     */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
     * The meta object literal for the '<em><b>Context</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__CONTEXT = eINSTANCE.getMapping_Context();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__MAPPING = eINSTANCE.getMapping_Mapping();

    /**
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.ImplicitContextMappingImpl <em>Implicit Context Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.ImplicitContextMappingImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getImplicitContextMapping()
     * @generated
     */
    EClass IMPLICIT_CONTEXT_MAPPING = eINSTANCE.getImplicitContextMapping();

    /**
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.CallImpl <em>Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.CallImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getCall()
     * @generated
     */
    EClass CALL = eINSTANCE.getCall();

    /**
     * The meta object literal for the '<em><b>Subroutine Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__SUBROUTINE_NAME = eINSTANCE.getCall_SubroutineName();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__PARAMS = eINSTANCE.getCall_Params();

    /**
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.ActualParamImpl <em>Actual Param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.ActualParamImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getActualParam()
     * @generated
     */
    EClass ACTUAL_PARAM = eINSTANCE.getActualParam();

    /**
     * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTUAL_PARAM__KEYWORD = eINSTANCE.getActualParam_Keyword();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTUAL_PARAM__OPTIONAL = eINSTANCE.getActualParam_Optional();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTUAL_PARAM__VALUE = eINSTANCE.getActualParam_Value();

    /**
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.IDOrWildcardImpl <em>ID Or Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.IDOrWildcardImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getIDOrWildcard()
     * @generated
     */
    EClass ID_OR_WILDCARD = eINSTANCE.getIDOrWildcard();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_OR_WILDCARD__ID = eINSTANCE.getIDOrWildcard_Id();

    /**
     * The meta object literal for the '<em><b>Wildcard</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ID_OR_WILDCARD__WILDCARD = eINSTANCE.getIDOrWildcard_Wildcard();

    /**
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.IDOrPathExprImpl <em>ID Or Path Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.IDOrPathExprImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getIDOrPathExpr()
     * @generated
     */
    EClass ID_OR_PATH_EXPR = eINSTANCE.getIDOrPathExpr();

    /**
     * The meta object literal for the '{@link org.earthsystemcurator.cupidLanguage.impl.PathExprImpl <em>Path Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.earthsystemcurator.cupidLanguage.impl.PathExprImpl
     * @see org.earthsystemcurator.cupidLanguage.impl.CupidLanguagePackageImpl#getPathExpr()
     * @generated
     */
    EClass PATH_EXPR = eINSTANCE.getPathExpr();

    /**
     * The meta object literal for the '<em><b>Segments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATH_EXPR__SEGMENTS = eINSTANCE.getPathExpr_Segments();

  }

} //CupidLanguagePackage
