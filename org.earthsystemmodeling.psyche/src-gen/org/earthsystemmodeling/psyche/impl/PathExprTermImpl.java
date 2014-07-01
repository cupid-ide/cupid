/**
 */
package org.earthsystemmodeling.psyche.impl;

import org.earthsystemmodeling.psyche.Axis;
import org.earthsystemmodeling.psyche.PathExprTerm;
import org.earthsystemmodeling.psyche.PsychePackage;
import org.earthsystemmodeling.psyche.SubconceptOrAttribute;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Expr Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.PathExprTermImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.PathExprTermImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PathExprTermImpl extends PathExprImpl implements PathExprTerm
{
  /**
   * The cached value of the '{@link #getAxis() <em>Axis</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxis()
   * @generated
   * @ordered
   */
  protected Axis axis;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected SubconceptOrAttribute ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathExprTermImpl()
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
    return PsychePackage.Literals.PATH_EXPR_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Axis getAxis()
  {
    return axis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAxis(Axis newAxis, NotificationChain msgs)
  {
    Axis oldAxis = axis;
    axis = newAxis;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsychePackage.PATH_EXPR_TERM__AXIS, oldAxis, newAxis);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAxis(Axis newAxis)
  {
    if (newAxis != axis)
    {
      NotificationChain msgs = null;
      if (axis != null)
        msgs = ((InternalEObject)axis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsychePackage.PATH_EXPR_TERM__AXIS, null, msgs);
      if (newAxis != null)
        msgs = ((InternalEObject)newAxis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsychePackage.PATH_EXPR_TERM__AXIS, null, msgs);
      msgs = basicSetAxis(newAxis, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.PATH_EXPR_TERM__AXIS, newAxis, newAxis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubconceptOrAttribute getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (SubconceptOrAttribute)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PsychePackage.PATH_EXPR_TERM__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubconceptOrAttribute basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(SubconceptOrAttribute newRef)
  {
    SubconceptOrAttribute oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.PATH_EXPR_TERM__REF, oldRef, ref));
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
      case PsychePackage.PATH_EXPR_TERM__AXIS:
        return basicSetAxis(null, msgs);
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
      case PsychePackage.PATH_EXPR_TERM__AXIS:
        return getAxis();
      case PsychePackage.PATH_EXPR_TERM__REF:
        if (resolve) return getRef();
        return basicGetRef();
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
      case PsychePackage.PATH_EXPR_TERM__AXIS:
        setAxis((Axis)newValue);
        return;
      case PsychePackage.PATH_EXPR_TERM__REF:
        setRef((SubconceptOrAttribute)newValue);
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
      case PsychePackage.PATH_EXPR_TERM__AXIS:
        setAxis((Axis)null);
        return;
      case PsychePackage.PATH_EXPR_TERM__REF:
        setRef((SubconceptOrAttribute)null);
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
      case PsychePackage.PATH_EXPR_TERM__AXIS:
        return axis != null;
      case PsychePackage.PATH_EXPR_TERM__REF:
        return ref != null;
    }
    return super.eIsSet(featureID);
  }

} //PathExprTermImpl
