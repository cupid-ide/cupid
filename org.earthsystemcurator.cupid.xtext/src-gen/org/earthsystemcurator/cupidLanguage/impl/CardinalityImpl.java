/**
 */
package org.earthsystemcurator.cupidLanguage.impl;

import org.earthsystemcurator.cupidLanguage.Cardinality;
import org.earthsystemcurator.cupidLanguage.CupidLanguagePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.CardinalityImpl#isZeroOrOne <em>Zero Or One</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.CardinalityImpl#isZeroOrMore <em>Zero Or More</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupidLanguage.impl.CardinalityImpl#isOneOrMore <em>One Or More</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardinalityImpl extends MinimalEObjectImpl.Container implements Cardinality
{
  /**
   * The default value of the '{@link #isZeroOrOne() <em>Zero Or One</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isZeroOrOne()
   * @generated
   * @ordered
   */
  protected static final boolean ZERO_OR_ONE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isZeroOrOne() <em>Zero Or One</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isZeroOrOne()
   * @generated
   * @ordered
   */
  protected boolean zeroOrOne = ZERO_OR_ONE_EDEFAULT;

  /**
   * The default value of the '{@link #isZeroOrMore() <em>Zero Or More</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isZeroOrMore()
   * @generated
   * @ordered
   */
  protected static final boolean ZERO_OR_MORE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isZeroOrMore() <em>Zero Or More</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isZeroOrMore()
   * @generated
   * @ordered
   */
  protected boolean zeroOrMore = ZERO_OR_MORE_EDEFAULT;

  /**
   * The default value of the '{@link #isOneOrMore() <em>One Or More</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOneOrMore()
   * @generated
   * @ordered
   */
  protected static final boolean ONE_OR_MORE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOneOrMore() <em>One Or More</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOneOrMore()
   * @generated
   * @ordered
   */
  protected boolean oneOrMore = ONE_OR_MORE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CardinalityImpl()
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
    return CupidLanguagePackage.Literals.CARDINALITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isZeroOrOne()
  {
    return zeroOrOne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZeroOrOne(boolean newZeroOrOne)
  {
    boolean oldZeroOrOne = zeroOrOne;
    zeroOrOne = newZeroOrOne;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.CARDINALITY__ZERO_OR_ONE, oldZeroOrOne, zeroOrOne));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isZeroOrMore()
  {
    return zeroOrMore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZeroOrMore(boolean newZeroOrMore)
  {
    boolean oldZeroOrMore = zeroOrMore;
    zeroOrMore = newZeroOrMore;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.CARDINALITY__ZERO_OR_MORE, oldZeroOrMore, zeroOrMore));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOneOrMore()
  {
    return oneOrMore;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOneOrMore(boolean newOneOrMore)
  {
    boolean oldOneOrMore = oneOrMore;
    oneOrMore = newOneOrMore;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CupidLanguagePackage.CARDINALITY__ONE_OR_MORE, oldOneOrMore, oneOrMore));
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
      case CupidLanguagePackage.CARDINALITY__ZERO_OR_ONE:
        return isZeroOrOne();
      case CupidLanguagePackage.CARDINALITY__ZERO_OR_MORE:
        return isZeroOrMore();
      case CupidLanguagePackage.CARDINALITY__ONE_OR_MORE:
        return isOneOrMore();
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
      case CupidLanguagePackage.CARDINALITY__ZERO_OR_ONE:
        setZeroOrOne((Boolean)newValue);
        return;
      case CupidLanguagePackage.CARDINALITY__ZERO_OR_MORE:
        setZeroOrMore((Boolean)newValue);
        return;
      case CupidLanguagePackage.CARDINALITY__ONE_OR_MORE:
        setOneOrMore((Boolean)newValue);
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
      case CupidLanguagePackage.CARDINALITY__ZERO_OR_ONE:
        setZeroOrOne(ZERO_OR_ONE_EDEFAULT);
        return;
      case CupidLanguagePackage.CARDINALITY__ZERO_OR_MORE:
        setZeroOrMore(ZERO_OR_MORE_EDEFAULT);
        return;
      case CupidLanguagePackage.CARDINALITY__ONE_OR_MORE:
        setOneOrMore(ONE_OR_MORE_EDEFAULT);
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
      case CupidLanguagePackage.CARDINALITY__ZERO_OR_ONE:
        return zeroOrOne != ZERO_OR_ONE_EDEFAULT;
      case CupidLanguagePackage.CARDINALITY__ZERO_OR_MORE:
        return zeroOrMore != ZERO_OR_MORE_EDEFAULT;
      case CupidLanguagePackage.CARDINALITY__ONE_OR_MORE:
        return oneOrMore != ONE_OR_MORE_EDEFAULT;
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
    result.append(" (zeroOrOne: ");
    result.append(zeroOrOne);
    result.append(", zeroOrMore: ");
    result.append(zeroOrMore);
    result.append(", oneOrMore: ");
    result.append(oneOrMore);
    result.append(')');
    return result.toString();
  }

} //CardinalityImpl
