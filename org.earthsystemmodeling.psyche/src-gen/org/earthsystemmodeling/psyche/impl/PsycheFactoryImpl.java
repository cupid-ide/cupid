/**
 */
package org.earthsystemmodeling.psyche.impl;

import org.earthsystemmodeling.psyche.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PsycheFactoryImpl extends EFactoryImpl implements PsycheFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PsycheFactory init()
  {
    try
    {
      PsycheFactory thePsycheFactory = (PsycheFactory)EPackage.Registry.INSTANCE.getEFactory(PsychePackage.eNS_URI);
      if (thePsycheFactory != null)
      {
        return thePsycheFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PsycheFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PsycheFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PsychePackage.LANGUAGE: return createLanguage();
      case PsychePackage.ANNOTATION: return createAnnotation();
      case PsychePackage.CONCEPT_DEF: return createConceptDef();
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE: return createSubconceptOrAttribute();
      case PsychePackage.CARDINALITY: return createCardinality();
      case PsychePackage.MAPPING: return createMapping();
      case PsychePackage.IMPLICIT_CONTEXT_MAPPING: return createImplicitContextMapping();
      case PsychePackage.MODULE: return createModule();
      case PsychePackage.MODULE_NAME: return createModuleName();
      case PsychePackage.USES_MODULE: return createUsesModule();
      case PsychePackage.USES_ENTITY: return createUsesEntity();
      case PsychePackage.SUBROUTINE: return createSubroutine();
      case PsychePackage.FORMAL_PARAM: return createFormalParam();
      case PsychePackage.INTENT: return createIntent();
      case PsychePackage.TYPE: return createType();
      case PsychePackage.SUBROUTINE_NAME: return createSubroutineName();
      case PsychePackage.CALL: return createCall();
      case PsychePackage.ACTUAL_PARAM: return createActualParam();
      case PsychePackage.ACTUAL_PARAM_BY_KEYWORD: return createActualParamByKeyword();
      case PsychePackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case PsychePackage.FUNCTION_ASSIGNMENT: return createFunctionAssignment();
      case PsychePackage.LOCAL_EXPRESSION: return createLocalExpression();
      case PsychePackage.EXPR: return createExpr();
      case PsychePackage.PATH_EXPR: return createPathExpr();
      case PsychePackage.AXIS: return createAxis();
      case PsychePackage.DECLARED_ENTITY: return createDeclaredEntity();
      case PsychePackage.PATH_EXPR_TERM: return createPathExprTerm();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Language createLanguage()
  {
    LanguageImpl language = new LanguageImpl();
    return language;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConceptDef createConceptDef()
  {
    ConceptDefImpl conceptDef = new ConceptDefImpl();
    return conceptDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubconceptOrAttribute createSubconceptOrAttribute()
  {
    SubconceptOrAttributeImpl subconceptOrAttribute = new SubconceptOrAttributeImpl();
    return subconceptOrAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cardinality createCardinality()
  {
    CardinalityImpl cardinality = new CardinalityImpl();
    return cardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplicitContextMapping createImplicitContextMapping()
  {
    ImplicitContextMappingImpl implicitContextMapping = new ImplicitContextMappingImpl();
    return implicitContextMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleName createModuleName()
  {
    ModuleNameImpl moduleName = new ModuleNameImpl();
    return moduleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsesModule createUsesModule()
  {
    UsesModuleImpl usesModule = new UsesModuleImpl();
    return usesModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsesEntity createUsesEntity()
  {
    UsesEntityImpl usesEntity = new UsesEntityImpl();
    return usesEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Subroutine createSubroutine()
  {
    SubroutineImpl subroutine = new SubroutineImpl();
    return subroutine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalParam createFormalParam()
  {
    FormalParamImpl formalParam = new FormalParamImpl();
    return formalParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Intent createIntent()
  {
    IntentImpl intent = new IntentImpl();
    return intent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubroutineName createSubroutineName()
  {
    SubroutineNameImpl subroutineName = new SubroutineNameImpl();
    return subroutineName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Call createCall()
  {
    CallImpl call = new CallImpl();
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualParam createActualParam()
  {
    ActualParamImpl actualParam = new ActualParamImpl();
    return actualParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActualParamByKeyword createActualParamByKeyword()
  {
    ActualParamByKeywordImpl actualParamByKeyword = new ActualParamByKeywordImpl();
    return actualParamByKeyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionAssignment createFunctionAssignment()
  {
    FunctionAssignmentImpl functionAssignment = new FunctionAssignmentImpl();
    return functionAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalExpression createLocalExpression()
  {
    LocalExpressionImpl localExpression = new LocalExpressionImpl();
    return localExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpr createPathExpr()
  {
    PathExprImpl pathExpr = new PathExprImpl();
    return pathExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Axis createAxis()
  {
    AxisImpl axis = new AxisImpl();
    return axis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeclaredEntity createDeclaredEntity()
  {
    DeclaredEntityImpl declaredEntity = new DeclaredEntityImpl();
    return declaredEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExprTerm createPathExprTerm()
  {
    PathExprTermImpl pathExprTerm = new PathExprTermImpl();
    return pathExprTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PsychePackage getPsychePackage()
  {
    return (PsychePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PsychePackage getPackage()
  {
    return PsychePackage.eINSTANCE;
  }

} //PsycheFactoryImpl
