/**
 */
package org.earthsystemmodeling.psyche.impl;

import org.earthsystemmodeling.psyche.Expr;
import org.earthsystemmodeling.psyche.PsychePackage;
import org.earthsystemmodeling.psyche.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.TypeImpl#isInteger <em>Integer</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.TypeImpl#isCharacter <em>Character</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.TypeImpl#isLogical <em>Logical</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.TypeImpl#isReal <em>Real</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.TypeImpl#isDouble <em>Double</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.TypeImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.TypeImpl#getDerivedType <em>Derived Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
  /**
   * The default value of the '{@link #isInteger() <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInteger()
   * @generated
   * @ordered
   */
  protected static final boolean INTEGER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInteger() <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInteger()
   * @generated
   * @ordered
   */
  protected boolean integer = INTEGER_EDEFAULT;

  /**
   * The default value of the '{@link #isCharacter() <em>Character</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCharacter()
   * @generated
   * @ordered
   */
  protected static final boolean CHARACTER_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCharacter() <em>Character</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCharacter()
   * @generated
   * @ordered
   */
  protected boolean character = CHARACTER_EDEFAULT;

  /**
   * The default value of the '{@link #isLogical() <em>Logical</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLogical()
   * @generated
   * @ordered
   */
  protected static final boolean LOGICAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLogical() <em>Logical</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLogical()
   * @generated
   * @ordered
   */
  protected boolean logical = LOGICAL_EDEFAULT;

  /**
   * The default value of the '{@link #isReal() <em>Real</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReal()
   * @generated
   * @ordered
   */
  protected static final boolean REAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReal() <em>Real</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReal()
   * @generated
   * @ordered
   */
  protected boolean real = REAL_EDEFAULT;

  /**
   * The default value of the '{@link #isDouble() <em>Double</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDouble()
   * @generated
   * @ordered
   */
  protected static final boolean DOUBLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDouble() <em>Double</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDouble()
   * @generated
   * @ordered
   */
  protected boolean double_ = DOUBLE_EDEFAULT;

  /**
   * The default value of the '{@link #isDerived() <em>Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDerived()
   * @generated
   * @ordered
   */
  protected static final boolean DERIVED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDerived() <em>Derived</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDerived()
   * @generated
   * @ordered
   */
  protected boolean derived = DERIVED_EDEFAULT;

  /**
   * The cached value of the '{@link #getDerivedType() <em>Derived Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDerivedType()
   * @generated
   * @ordered
   */
  protected Expr derivedType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return PsychePackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInteger()
  {
    return integer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteger(boolean newInteger)
  {
    boolean oldInteger = integer;
    integer = newInteger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.TYPE__INTEGER, oldInteger, integer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCharacter()
  {
    return character;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCharacter(boolean newCharacter)
  {
    boolean oldCharacter = character;
    character = newCharacter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.TYPE__CHARACTER, oldCharacter, character));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLogical()
  {
    return logical;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogical(boolean newLogical)
  {
    boolean oldLogical = logical;
    logical = newLogical;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.TYPE__LOGICAL, oldLogical, logical));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReal()
  {
    return real;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReal(boolean newReal)
  {
    boolean oldReal = real;
    real = newReal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.TYPE__REAL, oldReal, real));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDouble()
  {
    return double_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDouble(boolean newDouble)
  {
    boolean oldDouble = double_;
    double_ = newDouble;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.TYPE__DOUBLE, oldDouble, double_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDerived()
  {
    return derived;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDerived(boolean newDerived)
  {
    boolean oldDerived = derived;
    derived = newDerived;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.TYPE__DERIVED, oldDerived, derived));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr getDerivedType()
  {
    return derivedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDerivedType(Expr newDerivedType, NotificationChain msgs)
  {
    Expr oldDerivedType = derivedType;
    derivedType = newDerivedType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PsychePackage.TYPE__DERIVED_TYPE, oldDerivedType, newDerivedType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDerivedType(Expr newDerivedType)
  {
    if (newDerivedType != derivedType)
    {
      NotificationChain msgs = null;
      if (derivedType != null)
        msgs = ((InternalEObject)derivedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PsychePackage.TYPE__DERIVED_TYPE, null, msgs);
      if (newDerivedType != null)
        msgs = ((InternalEObject)newDerivedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PsychePackage.TYPE__DERIVED_TYPE, null, msgs);
      msgs = basicSetDerivedType(newDerivedType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.TYPE__DERIVED_TYPE, newDerivedType, newDerivedType));
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
      case PsychePackage.TYPE__DERIVED_TYPE:
        return basicSetDerivedType(null, msgs);
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
      case PsychePackage.TYPE__INTEGER:
        return isInteger();
      case PsychePackage.TYPE__CHARACTER:
        return isCharacter();
      case PsychePackage.TYPE__LOGICAL:
        return isLogical();
      case PsychePackage.TYPE__REAL:
        return isReal();
      case PsychePackage.TYPE__DOUBLE:
        return isDouble();
      case PsychePackage.TYPE__DERIVED:
        return isDerived();
      case PsychePackage.TYPE__DERIVED_TYPE:
        return getDerivedType();
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
      case PsychePackage.TYPE__INTEGER:
        setInteger((Boolean)newValue);
        return;
      case PsychePackage.TYPE__CHARACTER:
        setCharacter((Boolean)newValue);
        return;
      case PsychePackage.TYPE__LOGICAL:
        setLogical((Boolean)newValue);
        return;
      case PsychePackage.TYPE__REAL:
        setReal((Boolean)newValue);
        return;
      case PsychePackage.TYPE__DOUBLE:
        setDouble((Boolean)newValue);
        return;
      case PsychePackage.TYPE__DERIVED:
        setDerived((Boolean)newValue);
        return;
      case PsychePackage.TYPE__DERIVED_TYPE:
        setDerivedType((Expr)newValue);
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
      case PsychePackage.TYPE__INTEGER:
        setInteger(INTEGER_EDEFAULT);
        return;
      case PsychePackage.TYPE__CHARACTER:
        setCharacter(CHARACTER_EDEFAULT);
        return;
      case PsychePackage.TYPE__LOGICAL:
        setLogical(LOGICAL_EDEFAULT);
        return;
      case PsychePackage.TYPE__REAL:
        setReal(REAL_EDEFAULT);
        return;
      case PsychePackage.TYPE__DOUBLE:
        setDouble(DOUBLE_EDEFAULT);
        return;
      case PsychePackage.TYPE__DERIVED:
        setDerived(DERIVED_EDEFAULT);
        return;
      case PsychePackage.TYPE__DERIVED_TYPE:
        setDerivedType((Expr)null);
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
      case PsychePackage.TYPE__INTEGER:
        return integer != INTEGER_EDEFAULT;
      case PsychePackage.TYPE__CHARACTER:
        return character != CHARACTER_EDEFAULT;
      case PsychePackage.TYPE__LOGICAL:
        return logical != LOGICAL_EDEFAULT;
      case PsychePackage.TYPE__REAL:
        return real != REAL_EDEFAULT;
      case PsychePackage.TYPE__DOUBLE:
        return double_ != DOUBLE_EDEFAULT;
      case PsychePackage.TYPE__DERIVED:
        return derived != DERIVED_EDEFAULT;
      case PsychePackage.TYPE__DERIVED_TYPE:
        return derivedType != null;
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
    result.append(" (integer: ");
    result.append(integer);
    result.append(", character: ");
    result.append(character);
    result.append(", logical: ");
    result.append(logical);
    result.append(", real: ");
    result.append(real);
    result.append(", double: ");
    result.append(double_);
    result.append(", derived: ");
    result.append(derived);
    result.append(')');
    return result.toString();
  }

} //TypeImpl
