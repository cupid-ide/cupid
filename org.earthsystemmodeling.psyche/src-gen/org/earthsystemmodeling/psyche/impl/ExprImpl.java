/**
 */
package org.earthsystemmodeling.psyche.impl;

import org.earthsystemmodeling.psyche.Expr;
import org.earthsystemmodeling.psyche.LocalExpression;
import org.earthsystemmodeling.psyche.PathExpr;
import org.earthsystemmodeling.psyche.PsychePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.ExprImpl#isWildcard <em>Wildcard</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.ExprImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.ExprImpl#getPathExpr <em>Path Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprImpl extends MinimalEObjectImpl.Container implements Expr
{
  /**
   * The default value of the '{@link #isWildcard() <em>Wildcard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWildcard()
   * @generated
   * @ordered
   */
  protected static final boolean WILDCARD_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWildcard() <em>Wildcard</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWildcard()
   * @generated
   * @ordered
   */
  protected boolean wildcard = WILDCARD_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected LocalExpression expr;

  /**
   * The cached value of the '{@link #getPathExpr() <em>Path Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPathExpr()
   * @generated
   * @ordered
   */
  protected PathExpr pathExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprImpl()
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
    return PsychePackage.Literals.EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWildcard()
  {
    return wildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWildcard(boolean newWildcard)
  {
    boolean oldWildcard = wildcard;
    wildcard = newWildcard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.EXPR__WILDCARD, oldWildcard, wildcard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalExpression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(LocalExpression newExpr, NotificationChain msgs)
  {
    LocalExpression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsychePackage.EXPR__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(LocalExpression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsychePackage.EXPR__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsychePackage.EXPR__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.EXPR__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpr getPathExpr()
  {
    return pathExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPathExpr(PathExpr newPathExpr, NotificationChain msgs)
  {
    PathExpr oldPathExpr = pathExpr;
    pathExpr = newPathExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsychePackage.EXPR__PATH_EXPR, oldPathExpr, newPathExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPathExpr(PathExpr newPathExpr)
  {
    if (newPathExpr != pathExpr)
    {
      NotificationChain msgs = null;
      if (pathExpr != null)
        msgs = ((InternalEObject)pathExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsychePackage.EXPR__PATH_EXPR, null, msgs);
      if (newPathExpr != null)
        msgs = ((InternalEObject)newPathExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsychePackage.EXPR__PATH_EXPR, null, msgs);
      msgs = basicSetPathExpr(newPathExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.EXPR__PATH_EXPR, newPathExpr, newPathExpr));
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
      case PsychePackage.EXPR__EXPR:
        return basicSetExpr(null, msgs);
      case PsychePackage.EXPR__PATH_EXPR:
        return basicSetPathExpr(null, msgs);
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
      case PsychePackage.EXPR__WILDCARD:
        return isWildcard();
      case PsychePackage.EXPR__EXPR:
        return getExpr();
      case PsychePackage.EXPR__PATH_EXPR:
        return getPathExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PsychePackage.EXPR__WILDCARD:
        setWildcard((Boolean)newValue);
        return;
      case PsychePackage.EXPR__EXPR:
        setExpr((LocalExpression)newValue);
        return;
      case PsychePackage.EXPR__PATH_EXPR:
        setPathExpr((PathExpr)newValue);
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
      case PsychePackage.EXPR__WILDCARD:
        setWildcard(WILDCARD_EDEFAULT);
        return;
      case PsychePackage.EXPR__EXPR:
        setExpr((LocalExpression)null);
        return;
      case PsychePackage.EXPR__PATH_EXPR:
        setPathExpr((PathExpr)null);
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
      case PsychePackage.EXPR__WILDCARD:
        return wildcard != WILDCARD_EDEFAULT;
      case PsychePackage.EXPR__EXPR:
        return expr != null;
      case PsychePackage.EXPR__PATH_EXPR:
        return pathExpr != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (wildcard: ");
    result.append(wildcard);
    result.append(')');
    return result.toString();
  }

} //ExprImpl
