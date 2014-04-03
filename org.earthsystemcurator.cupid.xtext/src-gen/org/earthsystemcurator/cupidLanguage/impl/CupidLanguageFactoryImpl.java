/**
 */
package org.earthsystemcurator.cupidLanguage.impl;

import org.earthsystemcurator.cupidLanguage.*;

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
public class CupidLanguageFactoryImpl extends EFactoryImpl implements CupidLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CupidLanguageFactory init()
  {
    try
    {
      CupidLanguageFactory theCupidLanguageFactory = (CupidLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(CupidLanguagePackage.eNS_URI);
      if (theCupidLanguageFactory != null)
      {
        return theCupidLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CupidLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CupidLanguageFactoryImpl()
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
      case CupidLanguagePackage.LANGUAGE: return createLanguage();
      case CupidLanguagePackage.ANNOTATION: return createAnnotation();
      case CupidLanguagePackage.CONCEPT_DEF: return createConceptDef();
      case CupidLanguagePackage.SUBCONCEPT_OR_ATTRIBUTE: return createSubconceptOrAttribute();
      case CupidLanguagePackage.CARDINALITY: return createCardinality();
      case CupidLanguagePackage.MAPPING: return createMapping();
      case CupidLanguagePackage.IMPLICIT_CONTEXT_MAPPING: return createImplicitContextMapping();
      case CupidLanguagePackage.MODULE: return createModule();
      case CupidLanguagePackage.MODULE_NAME: return createModuleName();
      case CupidLanguagePackage.USES_MODULE: return createUsesModule();
      case CupidLanguagePackage.USES_ENTITY: return createUsesEntity();
      case CupidLanguagePackage.SUBROUTINE: return createSubroutine();
      case CupidLanguagePackage.FORMAL_PARAM: return createFormalParam();
      case CupidLanguagePackage.INTENT: return createIntent();
      case CupidLanguagePackage.TYPE: return createType();
      case CupidLanguagePackage.SUBROUTINE_NAME: return createSubroutineName();
      case CupidLanguagePackage.CALL: return createCall();
      case CupidLanguagePackage.ACTUAL_PARAM: return createActualParam();
      case CupidLanguagePackage.ACTUAL_PARAM_BY_KEYWORD: return createActualParamByKeyword();
      case CupidLanguagePackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      case CupidLanguagePackage.LOCAL_EXPRESSION: return createLocalExpression();
      case CupidLanguagePackage.EXPR: return createExpr();
      case CupidLanguagePackage.PATH_EXPR: return createPathExpr();
      case CupidLanguagePackage.AXIS: return createAxis();
      case CupidLanguagePackage.DECLARED_ENTITY: return createDeclaredEntity();
      case CupidLanguagePackage.PATH_EXPR_TERM: return createPathExprTerm();
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
  public CupidLanguagePackage getCupidLanguagePackage()
  {
    return (CupidLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CupidLanguagePackage getPackage()
  {
    return CupidLanguagePackage.eINSTANCE;
  }

} //CupidLanguageFactoryImpl
