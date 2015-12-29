/**
 */
package com.roboConf.roboConfdsl.impl;

import com.roboConf.roboConfdsl.ECAProperty;
import com.roboConf.roboConfdsl.RoboConfdslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECA Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.roboConf.roboConfdsl.impl.ECAPropertyImpl#getElastic <em>Elastic</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.impl.ECAPropertyImpl#getNumInstances <em>Num Instances</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.impl.ECAPropertyImpl#getMinallowedinstances <em>Minallowedinstances</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.impl.ECAPropertyImpl#getMaxallowedinstances <em>Maxallowedinstances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ECAPropertyImpl extends MinimalEObjectImpl.Container implements ECAProperty
{
  /**
   * The default value of the '{@link #getElastic() <em>Elastic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElastic()
   * @generated
   * @ordered
   */
  protected static final String ELASTIC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElastic() <em>Elastic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElastic()
   * @generated
   * @ordered
   */
  protected String elastic = ELASTIC_EDEFAULT;

  /**
   * The default value of the '{@link #getNumInstances() <em>Num Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumInstances()
   * @generated
   * @ordered
   */
  protected static final String NUM_INSTANCES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumInstances() <em>Num Instances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumInstances()
   * @generated
   * @ordered
   */
  protected String numInstances = NUM_INSTANCES_EDEFAULT;

  /**
   * The default value of the '{@link #getMinallowedinstances() <em>Minallowedinstances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinallowedinstances()
   * @generated
   * @ordered
   */
  protected static final String MINALLOWEDINSTANCES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMinallowedinstances() <em>Minallowedinstances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinallowedinstances()
   * @generated
   * @ordered
   */
  protected String minallowedinstances = MINALLOWEDINSTANCES_EDEFAULT;

  /**
   * The default value of the '{@link #getMaxallowedinstances() <em>Maxallowedinstances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxallowedinstances()
   * @generated
   * @ordered
   */
  protected static final String MAXALLOWEDINSTANCES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMaxallowedinstances() <em>Maxallowedinstances</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaxallowedinstances()
   * @generated
   * @ordered
   */
  protected String maxallowedinstances = MAXALLOWEDINSTANCES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ECAPropertyImpl()
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
    return RoboConfdslPackage.Literals.ECA_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElastic()
  {
    return elastic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElastic(String newElastic)
  {
    String oldElastic = elastic;
    elastic = newElastic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.ECA_PROPERTY__ELASTIC, oldElastic, elastic));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNumInstances()
  {
    return numInstances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumInstances(String newNumInstances)
  {
    String oldNumInstances = numInstances;
    numInstances = newNumInstances;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.ECA_PROPERTY__NUM_INSTANCES, oldNumInstances, numInstances));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMinallowedinstances()
  {
    return minallowedinstances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinallowedinstances(String newMinallowedinstances)
  {
    String oldMinallowedinstances = minallowedinstances;
    minallowedinstances = newMinallowedinstances;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.ECA_PROPERTY__MINALLOWEDINSTANCES, oldMinallowedinstances, minallowedinstances));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMaxallowedinstances()
  {
    return maxallowedinstances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMaxallowedinstances(String newMaxallowedinstances)
  {
    String oldMaxallowedinstances = maxallowedinstances;
    maxallowedinstances = newMaxallowedinstances;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.ECA_PROPERTY__MAXALLOWEDINSTANCES, oldMaxallowedinstances, maxallowedinstances));
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
      case RoboConfdslPackage.ECA_PROPERTY__ELASTIC:
        return getElastic();
      case RoboConfdslPackage.ECA_PROPERTY__NUM_INSTANCES:
        return getNumInstances();
      case RoboConfdslPackage.ECA_PROPERTY__MINALLOWEDINSTANCES:
        return getMinallowedinstances();
      case RoboConfdslPackage.ECA_PROPERTY__MAXALLOWEDINSTANCES:
        return getMaxallowedinstances();
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
      case RoboConfdslPackage.ECA_PROPERTY__ELASTIC:
        setElastic((String)newValue);
        return;
      case RoboConfdslPackage.ECA_PROPERTY__NUM_INSTANCES:
        setNumInstances((String)newValue);
        return;
      case RoboConfdslPackage.ECA_PROPERTY__MINALLOWEDINSTANCES:
        setMinallowedinstances((String)newValue);
        return;
      case RoboConfdslPackage.ECA_PROPERTY__MAXALLOWEDINSTANCES:
        setMaxallowedinstances((String)newValue);
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
      case RoboConfdslPackage.ECA_PROPERTY__ELASTIC:
        setElastic(ELASTIC_EDEFAULT);
        return;
      case RoboConfdslPackage.ECA_PROPERTY__NUM_INSTANCES:
        setNumInstances(NUM_INSTANCES_EDEFAULT);
        return;
      case RoboConfdslPackage.ECA_PROPERTY__MINALLOWEDINSTANCES:
        setMinallowedinstances(MINALLOWEDINSTANCES_EDEFAULT);
        return;
      case RoboConfdslPackage.ECA_PROPERTY__MAXALLOWEDINSTANCES:
        setMaxallowedinstances(MAXALLOWEDINSTANCES_EDEFAULT);
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
      case RoboConfdslPackage.ECA_PROPERTY__ELASTIC:
        return ELASTIC_EDEFAULT == null ? elastic != null : !ELASTIC_EDEFAULT.equals(elastic);
      case RoboConfdslPackage.ECA_PROPERTY__NUM_INSTANCES:
        return NUM_INSTANCES_EDEFAULT == null ? numInstances != null : !NUM_INSTANCES_EDEFAULT.equals(numInstances);
      case RoboConfdslPackage.ECA_PROPERTY__MINALLOWEDINSTANCES:
        return MINALLOWEDINSTANCES_EDEFAULT == null ? minallowedinstances != null : !MINALLOWEDINSTANCES_EDEFAULT.equals(minallowedinstances);
      case RoboConfdslPackage.ECA_PROPERTY__MAXALLOWEDINSTANCES:
        return MAXALLOWEDINSTANCES_EDEFAULT == null ? maxallowedinstances != null : !MAXALLOWEDINSTANCES_EDEFAULT.equals(maxallowedinstances);
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
    result.append(" (elastic: ");
    result.append(elastic);
    result.append(", numInstances: ");
    result.append(numInstances);
    result.append(", minallowedinstances: ");
    result.append(minallowedinstances);
    result.append(", maxallowedinstances: ");
    result.append(maxallowedinstances);
    result.append(')');
    return result.toString();
  }

} //ECAPropertyImpl
