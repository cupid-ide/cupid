/**
 */
package org.earthsystemmodeling.psyche.util;

import org.earthsystemmodeling.psyche.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.earthsystemmodeling.psyche.PsychePackage
 * @generated
 */
public class PsycheAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PsychePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PsycheAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PsychePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PsycheSwitch<Adapter> modelSwitch =
    new PsycheSwitch<Adapter>()
    {
      @Override
      public Adapter caseLanguage(Language object)
      {
        return createLanguageAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseConceptDef(ConceptDef object)
      {
        return createConceptDefAdapter();
      }
      @Override
      public Adapter caseSubconceptOrAttribute(SubconceptOrAttribute object)
      {
        return createSubconceptOrAttributeAdapter();
      }
      @Override
      public Adapter caseCardinality(Cardinality object)
      {
        return createCardinalityAdapter();
      }
      @Override
      public Adapter caseMapping(Mapping object)
      {
        return createMappingAdapter();
      }
      @Override
      public Adapter caseImplicitContextMapping(ImplicitContextMapping object)
      {
        return createImplicitContextMappingAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseModuleName(ModuleName object)
      {
        return createModuleNameAdapter();
      }
      @Override
      public Adapter caseUsesModule(UsesModule object)
      {
        return createUsesModuleAdapter();
      }
      @Override
      public Adapter caseUsesEntity(UsesEntity object)
      {
        return createUsesEntityAdapter();
      }
      @Override
      public Adapter caseSubroutine(Subroutine object)
      {
        return createSubroutineAdapter();
      }
      @Override
      public Adapter caseFormalParam(FormalParam object)
      {
        return createFormalParamAdapter();
      }
      @Override
      public Adapter caseIntent(Intent object)
      {
        return createIntentAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseSubroutineName(SubroutineName object)
      {
        return createSubroutineNameAdapter();
      }
      @Override
      public Adapter caseCall(Call object)
      {
        return createCallAdapter();
      }
      @Override
      public Adapter caseActualParam(ActualParam object)
      {
        return createActualParamAdapter();
      }
      @Override
      public Adapter caseActualParamByKeyword(ActualParamByKeyword object)
      {
        return createActualParamByKeywordAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseFunctionAssignment(FunctionAssignment object)
      {
        return createFunctionAssignmentAdapter();
      }
      @Override
      public Adapter caseLocalExpression(LocalExpression object)
      {
        return createLocalExpressionAdapter();
      }
      @Override
      public Adapter caseArrayConstructor(ArrayConstructor object)
      {
        return createArrayConstructorAdapter();
      }
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter casePathExpr(PathExpr object)
      {
        return createPathExprAdapter();
      }
      @Override
      public Adapter caseAxis(Axis object)
      {
        return createAxisAdapter();
      }
      @Override
      public Adapter caseDeclaredEntity(DeclaredEntity object)
      {
        return createDeclaredEntityAdapter();
      }
      @Override
      public Adapter casePathExprTerm(PathExprTerm object)
      {
        return createPathExprTermAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.Language <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.Language
   * @generated
   */
  public Adapter createLanguageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.ConceptDef <em>Concept Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.ConceptDef
   * @generated
   */
  public Adapter createConceptDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.SubconceptOrAttribute <em>Subconcept Or Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.SubconceptOrAttribute
   * @generated
   */
  public Adapter createSubconceptOrAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.Cardinality
   * @generated
   */
  public Adapter createCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.Mapping
   * @generated
   */
  public Adapter createMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.ImplicitContextMapping <em>Implicit Context Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.ImplicitContextMapping
   * @generated
   */
  public Adapter createImplicitContextMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.ModuleName <em>Module Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.ModuleName
   * @generated
   */
  public Adapter createModuleNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.UsesModule <em>Uses Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.UsesModule
   * @generated
   */
  public Adapter createUsesModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.UsesEntity <em>Uses Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.UsesEntity
   * @generated
   */
  public Adapter createUsesEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.Subroutine <em>Subroutine</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.Subroutine
   * @generated
   */
  public Adapter createSubroutineAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.FormalParam <em>Formal Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.FormalParam
   * @generated
   */
  public Adapter createFormalParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.Intent <em>Intent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.Intent
   * @generated
   */
  public Adapter createIntentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.SubroutineName <em>Subroutine Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.SubroutineName
   * @generated
   */
  public Adapter createSubroutineNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.Call
   * @generated
   */
  public Adapter createCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.ActualParam <em>Actual Param</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.ActualParam
   * @generated
   */
  public Adapter createActualParamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.ActualParamByKeyword <em>Actual Param By Keyword</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.ActualParamByKeyword
   * @generated
   */
  public Adapter createActualParamByKeywordAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.FunctionAssignment <em>Function Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.FunctionAssignment
   * @generated
   */
  public Adapter createFunctionAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.LocalExpression <em>Local Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.LocalExpression
   * @generated
   */
  public Adapter createLocalExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.ArrayConstructor <em>Array Constructor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.ArrayConstructor
   * @generated
   */
  public Adapter createArrayConstructorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.PathExpr <em>Path Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.PathExpr
   * @generated
   */
  public Adapter createPathExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.Axis <em>Axis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.Axis
   * @generated
   */
  public Adapter createAxisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.DeclaredEntity <em>Declared Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.DeclaredEntity
   * @generated
   */
  public Adapter createDeclaredEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.earthsystemmodeling.psyche.PathExprTerm <em>Path Expr Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.earthsystemmodeling.psyche.PathExprTerm
   * @generated
   */
  public Adapter createPathExprTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PsycheAdapterFactory
