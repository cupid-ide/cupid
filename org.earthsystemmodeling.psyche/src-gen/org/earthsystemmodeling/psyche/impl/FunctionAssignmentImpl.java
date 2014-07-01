/**
 */
package org.earthsystemmodeling.psyche.impl;

import java.util.Collection;

import org.earthsystemmodeling.psyche.ActualParam;
import org.earthsystemmodeling.psyche.Expr;
import org.earthsystemmodeling.psyche.FunctionAssignment;
import org.earthsystemmodeling.psyche.PsychePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.FunctionAssignmentImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.FunctionAssignmentImpl#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.FunctionAssignmentImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionAssignmentImpl extends ImplicitContextMappingImpl implements FunctionAssignment
{
  /**
   * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLhs()
   * @generated
   * @ordered
   */
  protected Expr lhs;

  /**
   * The cached value of the '{@link #getFunctionName() <em>Function Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionName()
   * @generated
   * @ordered
   */
  protected Expr functionName;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<ActualParam> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionAssignmentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PsychePackage.Literals.FUNCTION_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getLhs()
  {
    return lhs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLhs(Expr newLhs, NotificationChain msgs)
  {
    Expr oldLhs = lhs;
    lhs = newLhs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsychePackage.FUNCTION_ASSIGNMENT__LHS, oldLhs, newLhs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLhs(Expr newLhs)
  {
    if (newLhs != lhs)
    {
      NotificationChain msgs = null;
      if (lhs != null)
        msgs = ((InternalEObject)lhs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsychePackage.FUNCTION_ASSIGNMENT__LHS, null, msgs);
      if (newLhs != null)
        msgs = ((InternalEObject)newLhs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsychePackage.FUNCTION_ASSIGNMENT__LHS, null, msgs);
      msgs = basicSetLhs(newLhs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.FUNCTION_ASSIGNMENT__LHS, newLhs, newLhs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getFunctionName()
  {
    return functionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunctionName(Expr newFunctionName, NotificationChain msgs)
  {
    Expr oldFunctionName = functionName;
    functionName = newFunctionName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsychePackage.FUNCTION_ASSIGNMENT__FUNCTION_NAME, oldFunctionName, newFunctionName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionName(Expr newFunctionName)
  {
    if (newFunctionName != functionName)
    {
      NotificationChain msgs = null;
      if (functionName != null)
        msgs = ((InternalEObject)functionName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsychePackage.FUNCTION_ASSIGNMENT__FUNCTION_NAME, null, msgs);
      if (newFunctionName != null)
        msgs = ((InternalEObject)newFunctionName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsychePackage.FUNCTION_ASSIGNMENT__FUNCTION_NAME, null, msgs);
      msgs = basicSetFunctionName(newFunctionName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.FUNCTION_ASSIGNMENT__FUNCTION_NAME, newFunctionName, newFunctionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActualParam> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<ActualParam>(ActualParam.class, this, PsychePackage.FUNCTION_ASSIGNMENT__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PsychePackage.FUNCTION_ASSIGNMENT__LHS:
        return basicSetLhs(null, msgs);
      case PsychePackage.FUNCTION_ASSIGNMENT__FUNCTION_NAME:
        return basicSetFunctionName(null, msgs);
      case PsychePackage.FUNCTION_ASSIGNMENT__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PsychePackage.FUNCTION_ASSIGNMENT__LHS:
        return getLhs();
      case PsychePackage.FUNCTION_ASSIGNMENT__FUNCTION_NAME:
        return getFunctionName();
      case PsychePackage.FUNCTION_ASSIGNMENT__PARAMS:
        return getParams();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PsychePackage.FUNCTION_ASSIGNMENT__LHS:
        setLhs((Expr)newValue);
        return;
      case PsychePackage.FUNCTION_ASSIGNMENT__FUNCTION_NAME:
        setFunctionName((Expr)newValue);
        return;
      case PsychePackage.FUNCTION_ASSIGNMENT__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends ActualParam>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PsychePackage.FUNCTION_ASSIGNMENT__LHS:
        setLhs((Expr)null);
        return;
      case PsychePackage.FUNCTION_ASSIGNMENT__FUNCTION_NAME:
        setFunctionName((Expr)null);
        return;
      case PsychePackage.FUNCTION_ASSIGNMENT__PARAMS:
        getParams().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PsychePackage.FUNCTION_ASSIGNMENT__LHS:
        return lhs != null;
      case PsychePackage.FUNCTION_ASSIGNMENT__FUNCTION_NAME:
        return functionName != null;
      case PsychePackage.FUNCTION_ASSIGNMENT__PARAMS:
        return params != null && !params.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FunctionAssignmentImpl
