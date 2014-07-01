/**
 */
package org.earthsystemmodeling.psyche.impl;

import org.earthsystemmodeling.psyche.Intent;
import org.earthsystemmodeling.psyche.PsychePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.IntentImpl#isIn <em>In</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.IntentImpl#isOut <em>Out</em>}</li>
 *   <li>{@link org.earthsystemmodeling.psyche.impl.IntentImpl#isInout <em>Inout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentImpl extends MinimalEObjectImpl.Container implements Intent
{
  /**
   * The default value of the '{@link #isIn() <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIn()
   * @generated
   * @ordered
   */
  protected static final boolean IN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIn() <em>In</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIn()
   * @generated
   * @ordered
   */
  protected boolean in = IN_EDEFAULT;

  /**
   * The default value of the '{@link #isOut() <em>Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOut()
   * @generated
   * @ordered
   */
  protected static final boolean OUT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOut() <em>Out</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOut()
   * @generated
   * @ordered
   */
  protected boolean out = OUT_EDEFAULT;

  /**
   * The default value of the '{@link #isInout() <em>Inout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInout()
   * @generated
   * @ordered
   */
  protected static final boolean INOUT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isInout() <em>Inout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isInout()
   * @generated
   * @ordered
   */
  protected boolean inout = INOUT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntentImpl()
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
    return PsychePackage.Literals.INTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIn()
  {
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIn(boolean newIn)
  {
    boolean oldIn = in;
    in = newIn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.INTENT__IN, oldIn, in));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOut()
  {
    return out;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOut(boolean newOut)
  {
    boolean oldOut = out;
    out = newOut;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.INTENT__OUT, oldOut, out));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isInout()
  {
    return inout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInout(boolean newInout)
  {
    boolean oldInout = inout;
    inout = newInout;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PsychePackage.INTENT__INOUT, oldInout, inout));
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
      case PsychePackage.INTENT__IN:
        return isIn();
      case PsychePackage.INTENT__OUT:
        return isOut();
      case PsychePackage.INTENT__INOUT:
        return isInout();
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
      case PsychePackage.INTENT__IN:
        setIn((Boolean)newValue);
        return;
      case PsychePackage.INTENT__OUT:
        setOut((Boolean)newValue);
        return;
      case PsychePackage.INTENT__INOUT:
        setInout((Boolean)newValue);
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
      case PsychePackage.INTENT__IN:
        setIn(IN_EDEFAULT);
        return;
      case PsychePackage.INTENT__OUT:
        setOut(OUT_EDEFAULT);
        return;
      case PsychePackage.INTENT__INOUT:
        setInout(INOUT_EDEFAULT);
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
      case PsychePackage.INTENT__IN:
        return in != IN_EDEFAULT;
      case PsychePackage.INTENT__OUT:
        return out != OUT_EDEFAULT;
      case PsychePackage.INTENT__INOUT:
        return inout != INOUT_EDEFAULT;
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
    result.append(" (in: ");
    result.append(in);
    result.append(", out: ");
    result.append(out);
    result.append(", inout: ");
    result.append(inout);
    result.append(')');
    return result.toString();
  }

} //IntentImpl
