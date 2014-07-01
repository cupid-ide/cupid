/**
 */
package org.earthsystemmodeling.psyche.impl;

import org.earthsystemmodeling.psyche.ImplicitContextMapping;
import org.earthsystemmodeling.psyche.Mapping;
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
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.MappingImpl#getContext <em>Context</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.MappingImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.MappingImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.MappingImpl#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping
{
  /**
   * The cached value of the '{@link #getContext() <em>Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContext()
   * @generated
   * @ordered
   */
  protected PathExpr context;

  /**
   * The cached value of the '{@link #getMapping() <em>Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMapping()
   * @generated
   * @ordered
   */
  protected ImplicitContextMapping mapping;

  /**
   * The cached value of the '{@link #getBefore() <em>Before</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBefore()
   * @generated
   * @ordered
   */
  protected PathExpr before;

  /**
   * The cached value of the '{@link #getAfter() <em>After</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAfter()
   * @generated
   * @ordered
   */
  protected PathExpr after;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingImpl()
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
    return PsychePackage.Literals.MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpr getContext()
  {
    return context;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContext(PathExpr newContext, NotificationChain msgs)
  {
    PathExpr oldContext = context;
    context = newContext;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsychePackage.MAPPING__CONTEXT, oldContext, newContext);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContext(PathExpr newContext)
  {
    if (newContext != context)
    {
      NotificationChain msgs = null;
      if (context != null)
        msgs = ((InternalEObject)context).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsychePackage.MAPPING__CONTEXT, null, msgs);
      if (newContext != null)
        msgs = ((InternalEObject)newContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsychePackage.MAPPING__CONTEXT, null, msgs);
      msgs = basicSetContext(newContext, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.MAPPING__CONTEXT, newContext, newContext));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplicitContextMapping getMapping()
  {
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMapping(ImplicitContextMapping newMapping, NotificationChain msgs)
  {
    ImplicitContextMapping oldMapping = mapping;
    mapping = newMapping;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsychePackage.MAPPING__MAPPING, oldMapping, newMapping);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMapping(ImplicitContextMapping newMapping)
  {
    if (newMapping != mapping)
    {
      NotificationChain msgs = null;
      if (mapping != null)
        msgs = ((InternalEObject)mapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsychePackage.MAPPING__MAPPING, null, msgs);
      if (newMapping != null)
        msgs = ((InternalEObject)newMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsychePackage.MAPPING__MAPPING, null, msgs);
      msgs = basicSetMapping(newMapping, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.MAPPING__MAPPING, newMapping, newMapping));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpr getBefore()
  {
    return before;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBefore(PathExpr newBefore, NotificationChain msgs)
  {
    PathExpr oldBefore = before;
    before = newBefore;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsychePackage.MAPPING__BEFORE, oldBefore, newBefore);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBefore(PathExpr newBefore)
  {
    if (newBefore != before)
    {
      NotificationChain msgs = null;
      if (before != null)
        msgs = ((InternalEObject)before).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsychePackage.MAPPING__BEFORE, null, msgs);
      if (newBefore != null)
        msgs = ((InternalEObject)newBefore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsychePackage.MAPPING__BEFORE, null, msgs);
      msgs = basicSetBefore(newBefore, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.MAPPING__BEFORE, newBefore, newBefore));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathExpr getAfter()
  {
    return after;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAfter(PathExpr newAfter, NotificationChain msgs)
  {
    PathExpr oldAfter = after;
    after = newAfter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsychePackage.MAPPING__AFTER, oldAfter, newAfter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAfter(PathExpr newAfter)
  {
    if (newAfter != after)
    {
      NotificationChain msgs = null;
      if (after != null)
        msgs = ((InternalEObject)after).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsychePackage.MAPPING__AFTER, null, msgs);
      if (newAfter != null)
        msgs = ((InternalEObject)newAfter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsychePackage.MAPPING__AFTER, null, msgs);
      msgs = basicSetAfter(newAfter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.MAPPING__AFTER, newAfter, newAfter));
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
      case PsychePackage.MAPPING__CONTEXT:
        return basicSetContext(null, msgs);
      case PsychePackage.MAPPING__MAPPING:
        return basicSetMapping(null, msgs);
      case PsychePackage.MAPPING__BEFORE:
        return basicSetBefore(null, msgs);
      case PsychePackage.MAPPING__AFTER:
        return basicSetAfter(null, msgs);
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
      case PsychePackage.MAPPING__CONTEXT:
        return getContext();
      case PsychePackage.MAPPING__MAPPING:
        return getMapping();
      case PsychePackage.MAPPING__BEFORE:
        return getBefore();
      case PsychePackage.MAPPING__AFTER:
        return getAfter();
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
      case PsychePackage.MAPPING__CONTEXT:
        setContext((PathExpr)newValue);
        return;
      case PsychePackage.MAPPING__MAPPING:
        setMapping((ImplicitContextMapping)newValue);
        return;
      case PsychePackage.MAPPING__BEFORE:
        setBefore((PathExpr)newValue);
        return;
      case PsychePackage.MAPPING__AFTER:
        setAfter((PathExpr)newValue);
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
      case PsychePackage.MAPPING__CONTEXT:
        setContext((PathExpr)null);
        return;
      case PsychePackage.MAPPING__MAPPING:
        setMapping((ImplicitContextMapping)null);
        return;
      case PsychePackage.MAPPING__BEFORE:
        setBefore((PathExpr)null);
        return;
      case PsychePackage.MAPPING__AFTER:
        setAfter((PathExpr)null);
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
      case PsychePackage.MAPPING__CONTEXT:
        return context != null;
      case PsychePackage.MAPPING__MAPPING:
        return mapping != null;
      case PsychePackage.MAPPING__BEFORE:
        return before != null;
      case PsychePackage.MAPPING__AFTER:
        return after != null;
    }
    return super.eIsSet(featureID);
  }

} //MappingImpl
