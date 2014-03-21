/**
 */
package org.earthsystemcurator.cupidLanguage.impl;

import org.earthsystemcurator.cupidLanguage.Axis;
import org.earthsystemcurator.cupidLanguage.CupidLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.AxisImpl#isAncestor <em>Ancestor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AxisImpl extends MinimalEObjectImpl.Container implements Axis
{
  /**
   * The default value of the '{@link #isAncestor() <em>Ancestor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAncestor()
   * @generated
   * @ordered
   */
  protected static final boolean ANCESTOR_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAncestor() <em>Ancestor</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAncestor()
   * @generated
   * @ordered
   */
  protected boolean ancestor = ANCESTOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AxisImpl()
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
    return CupidLanguagePackage.Literals.AXIS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAncestor()
  {
    return ancestor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAncestor(boolean newAncestor)
  {
    boolean oldAncestor = ancestor;
    ancestor = newAncestor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.AXIS__ANCESTOR, oldAncestor, ancestor));
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
      case CupidLanguagePackage.AXIS__ANCESTOR:
        return isAncestor();
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
      case CupidLanguagePackage.AXIS__ANCESTOR:
        setAncestor((Boolean)newValue);
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
      case CupidLanguagePackage.AXIS__ANCESTOR:
        setAncestor(ANCESTOR_EDEFAULT);
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
      case CupidLanguagePackage.AXIS__ANCESTOR:
        return ancestor != ANCESTOR_EDEFAULT;
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
    result.append(" (ancestor: ");
    result.append(ancestor);
    result.append(')');
    return result.toString();
  }

} //AxisImpl
