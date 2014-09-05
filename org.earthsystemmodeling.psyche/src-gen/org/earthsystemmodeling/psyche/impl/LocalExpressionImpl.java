/**
 */
package org.earthsystemmodeling.psyche.impl;

import org.earthsystemmodeling.psyche.ArrayConstructor;
import org.earthsystemmodeling.psyche.LocalExpression;
import org.earthsystemmodeling.psyche.PsychePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.LocalExpressionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.LocalExpressionImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.LocalExpressionImpl#getArrayConstructor <em>Array Constructor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalExpressionImpl extends MinimalEObjectImpl.Container implements LocalExpression
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected static final String LITERAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected String literal = LITERAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getArrayConstructor() <em>Array Constructor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayConstructor()
   * @generated
   * @ordered
   */
  protected ArrayConstructor arrayConstructor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LocalExpressionImpl()
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
    return PsychePackage.Literals.LOCAL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.LOCAL_EXPRESSION__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLiteral(String newLiteral)
  {
    String oldLiteral = literal;
    literal = newLiteral;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.LOCAL_EXPRESSION__LITERAL, oldLiteral, literal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayConstructor getArrayConstructor()
  {
    return arrayConstructor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayConstructor(ArrayConstructor newArrayConstructor, NotificationChain msgs)
  {
    ArrayConstructor oldArrayConstructor = arrayConstructor;
    arrayConstructor = newArrayConstructor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsychePackage.LOCAL_EXPRESSION__ARRAY_CONSTRUCTOR, oldArrayConstructor, newArrayConstructor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayConstructor(ArrayConstructor newArrayConstructor)
  {
    if (newArrayConstructor != arrayConstructor)
    {
      NotificationChain msgs = null;
      if (arrayConstructor != null)
        msgs = ((InternalEObject)arrayConstructor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsychePackage.LOCAL_EXPRESSION__ARRAY_CONSTRUCTOR, null, msgs);
      if (newArrayConstructor != null)
        msgs = ((InternalEObject)newArrayConstructor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsychePackage.LOCAL_EXPRESSION__ARRAY_CONSTRUCTOR, null, msgs);
      msgs = basicSetArrayConstructor(newArrayConstructor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.LOCAL_EXPRESSION__ARRAY_CONSTRUCTOR, newArrayConstructor, newArrayConstructor));
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
      case PsychePackage.LOCAL_EXPRESSION__ARRAY_CONSTRUCTOR:
        return basicSetArrayConstructor(null, msgs);
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
      case PsychePackage.LOCAL_EXPRESSION__ID:
        return getId();
      case PsychePackage.LOCAL_EXPRESSION__LITERAL:
        return getLiteral();
      case PsychePackage.LOCAL_EXPRESSION__ARRAY_CONSTRUCTOR:
        return getArrayConstructor();
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
      case PsychePackage.LOCAL_EXPRESSION__ID:
        setId((String)newValue);
        return;
      case PsychePackage.LOCAL_EXPRESSION__LITERAL:
        setLiteral((String)newValue);
        return;
      case PsychePackage.LOCAL_EXPRESSION__ARRAY_CONSTRUCTOR:
        setArrayConstructor((ArrayConstructor)newValue);
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
      case PsychePackage.LOCAL_EXPRESSION__ID:
        setId(ID_EDEFAULT);
        return;
      case PsychePackage.LOCAL_EXPRESSION__LITERAL:
        setLiteral(LITERAL_EDEFAULT);
        return;
      case PsychePackage.LOCAL_EXPRESSION__ARRAY_CONSTRUCTOR:
        setArrayConstructor((ArrayConstructor)null);
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
      case PsychePackage.LOCAL_EXPRESSION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case PsychePackage.LOCAL_EXPRESSION__LITERAL:
        return LITERAL_EDEFAULT == null ? literal != null : !LITERAL_EDEFAULT.equals(literal);
      case PsychePackage.LOCAL_EXPRESSION__ARRAY_CONSTRUCTOR:
        return arrayConstructor != null;
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
    result.append(" (id: ");
    result.append(id);
    result.append(", literal: ");
    result.append(literal);
    result.append(')');
    return result.toString();
  }

} //LocalExpressionImpl
