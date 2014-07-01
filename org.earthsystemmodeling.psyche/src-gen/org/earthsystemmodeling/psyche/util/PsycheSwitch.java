/**
 */
package org.earthsystemmodeling.psyche.util;

import org.earthsystemmodeling.psyche.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.earthsystemmodeling.psyche.PsychePackage
 * @generated
 */
public class PsycheSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PsychePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PsycheSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PsychePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PsychePackage.LANGUAGE:
      {
        Language language = (Language)theEObject;
        T result = caseLanguage(language);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.ANNOTATION:
      {
        Annotation annotation = (Annotation)theEObject;
        T result = caseAnnotation(annotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.CONCEPT_DEF:
      {
        ConceptDef conceptDef = (ConceptDef)theEObject;
        T result = caseConceptDef(conceptDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.SUBCONCEPT_OR_ATTRIBUTE:
      {
        SubconceptOrAttribute subconceptOrAttribute = (SubconceptOrAttribute)theEObject;
        T result = caseSubconceptOrAttribute(subconceptOrAttribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.CARDINALITY:
      {
        Cardinality cardinality = (Cardinality)theEObject;
        T result = caseCardinality(cardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.MAPPING:
      {
        Mapping mapping = (Mapping)theEObject;
        T result = caseMapping(mapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.IMPLICIT_CONTEXT_MAPPING:
      {
        ImplicitContextMapping implicitContextMapping = (ImplicitContextMapping)theEObject;
        T result = caseImplicitContextMapping(implicitContextMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.MODULE:
      {
        Module module = (Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = caseImplicitContextMapping(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.MODULE_NAME:
      {
        ModuleName moduleName = (ModuleName)theEObject;
        T result = caseModuleName(moduleName);
        if (result == null) result = caseImplicitContextMapping(moduleName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.USES_MODULE:
      {
        UsesModule usesModule = (UsesModule)theEObject;
        T result = caseUsesModule(usesModule);
        if (result == null) result = caseImplicitContextMapping(usesModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.USES_ENTITY:
      {
        UsesEntity usesEntity = (UsesEntity)theEObject;
        T result = caseUsesEntity(usesEntity);
        if (result == null) result = caseImplicitContextMapping(usesEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.SUBROUTINE:
      {
        Subroutine subroutine = (Subroutine)theEObject;
        T result = caseSubroutine(subroutine);
        if (result == null) result = caseImplicitContextMapping(subroutine);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.FORMAL_PARAM:
      {
        FormalParam formalParam = (FormalParam)theEObject;
        T result = caseFormalParam(formalParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.INTENT:
      {
        Intent intent = (Intent)theEObject;
        T result = caseIntent(intent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.SUBROUTINE_NAME:
      {
        SubroutineName subroutineName = (SubroutineName)theEObject;
        T result = caseSubroutineName(subroutineName);
        if (result == null) result = caseImplicitContextMapping(subroutineName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.CALL:
      {
        Call call = (Call)theEObject;
        T result = caseCall(call);
        if (result == null) result = caseImplicitContextMapping(call);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.ACTUAL_PARAM:
      {
        ActualParam actualParam = (ActualParam)theEObject;
        T result = caseActualParam(actualParam);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.ACTUAL_PARAM_BY_KEYWORD:
      {
        ActualParamByKeyword actualParamByKeyword = (ActualParamByKeyword)theEObject;
        T result = caseActualParamByKeyword(actualParamByKeyword);
        if (result == null) result = caseImplicitContextMapping(actualParamByKeyword);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = caseImplicitContextMapping(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.FUNCTION_ASSIGNMENT:
      {
        FunctionAssignment functionAssignment = (FunctionAssignment)theEObject;
        T result = caseFunctionAssignment(functionAssignment);
        if (result == null) result = caseImplicitContextMapping(functionAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.LOCAL_EXPRESSION:
      {
        LocalExpression localExpression = (LocalExpression)theEObject;
        T result = caseLocalExpression(localExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.PATH_EXPR:
      {
        PathExpr pathExpr = (PathExpr)theEObject;
        T result = casePathExpr(pathExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.AXIS:
      {
        Axis axis = (Axis)theEObject;
        T result = caseAxis(axis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.DECLARED_ENTITY:
      {
        DeclaredEntity declaredEntity = (DeclaredEntity)theEObject;
        T result = caseDeclaredEntity(declaredEntity);
        if (result == null) result = caseImplicitContextMapping(declaredEntity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PsychePackage.PATH_EXPR_TERM:
      {
        PathExprTerm pathExprTerm = (PathExprTerm)theEObject;
        T result = casePathExprTerm(pathExprTerm);
        if (result == null) result = casePathExpr(pathExprTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Language</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Language</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLanguage(Language object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotation(Annotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concept Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concept Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConceptDef(ConceptDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subconcept Or Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subconcept Or Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubconceptOrAttribute(SubconceptOrAttribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cardinality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cardinality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCardinality(Cardinality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapping(Mapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implicit Context Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implicit Context Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplicitContextMapping(ImplicitContextMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(Module object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModuleName(ModuleName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uses Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uses Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsesModule(UsesModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uses Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uses Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsesEntity(UsesEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subroutine</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subroutine</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubroutine(Subroutine object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalParam(FormalParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntent(Intent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Subroutine Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Subroutine Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubroutineName(SubroutineName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCall(Call object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actual Param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actual Param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActualParam(ActualParam object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Actual Param By Keyword</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Actual Param By Keyword</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActualParamByKeyword(ActualParamByKeyword object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionAssignment(FunctionAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalExpression(LocalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpr(Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathExpr(PathExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Axis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Axis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAxis(Axis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declared Entity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declared Entity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaredEntity(DeclaredEntity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Expr Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Expr Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathExprTerm(PathExprTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PsycheSwitch
