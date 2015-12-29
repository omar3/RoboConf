/**
 */
package com.roboConf.roboConfdsl.impl;

import com.roboConf.roboConfdsl.Component;
import com.roboConf.roboConfdsl.ECAProperty;
import com.roboConf.roboConfdsl.ECARule;
import com.roboConf.roboConfdsl.RoboConfdslPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECA Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.roboConf.roboConfdsl.impl.ECARuleImpl#getEca_rule_name <em>Eca rule name</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.impl.ECARuleImpl#getEcaproperties <em>Ecaproperties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ECARuleImpl extends MinimalEObjectImpl.Container implements ECARule
{
  /**
   * The cached value of the '{@link #getEca_rule_name() <em>Eca rule name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEca_rule_name()
   * @generated
   * @ordered
   */
  protected Component eca_rule_name;

  /**
   * The cached value of the '{@link #getEcaproperties() <em>Ecaproperties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcaproperties()
   * @generated
   * @ordered
   */
  protected EList<ECAProperty> ecaproperties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ECARuleImpl()
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
    return RoboConfdslPackage.Literals.ECA_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component getEca_rule_name()
  {
    if (eca_rule_name != null && eca_rule_name.eIsProxy())
    {
      InternalEObject oldEca_rule_name = (InternalEObject)eca_rule_name;
      eca_rule_name = (Component)eResolveProxy(oldEca_rule_name);
      if (eca_rule_name != oldEca_rule_name)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RoboConfdslPackage.ECA_RULE__ECA_RULE_NAME, oldEca_rule_name, eca_rule_name));
      }
    }
    return eca_rule_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component basicGetEca_rule_name()
  {
    return eca_rule_name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEca_rule_name(Component newEca_rule_name)
  {
    Component oldEca_rule_name = eca_rule_name;
    eca_rule_name = newEca_rule_name;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.ECA_RULE__ECA_RULE_NAME, oldEca_rule_name, eca_rule_name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ECAProperty> getEcaproperties()
  {
    if (ecaproperties == null)
    {
      ecaproperties = new EObjectContainmentEList<ECAProperty>(ECAProperty.class, this, RoboConfdslPackage.ECA_RULE__ECAPROPERTIES);
    }
    return ecaproperties;
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
      case RoboConfdslPackage.ECA_RULE__ECAPROPERTIES:
        return ((InternalEList<?>)getEcaproperties()).basicRemove(otherEnd, msgs);
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
      case RoboConfdslPackage.ECA_RULE__ECA_RULE_NAME:
        if (resolve) return getEca_rule_name();
        return basicGetEca_rule_name();
      case RoboConfdslPackage.ECA_RULE__ECAPROPERTIES:
        return getEcaproperties();
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
      case RoboConfdslPackage.ECA_RULE__ECA_RULE_NAME:
        setEca_rule_name((Component)newValue);
        return;
      case RoboConfdslPackage.ECA_RULE__ECAPROPERTIES:
        getEcaproperties().clear();
        getEcaproperties().addAll((Collection<? extends ECAProperty>)newValue);
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
      case RoboConfdslPackage.ECA_RULE__ECA_RULE_NAME:
        setEca_rule_name((Component)null);
        return;
      case RoboConfdslPackage.ECA_RULE__ECAPROPERTIES:
        getEcaproperties().clear();
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
      case RoboConfdslPackage.ECA_RULE__ECA_RULE_NAME:
        return eca_rule_name != null;
      case RoboConfdslPackage.ECA_RULE__ECAPROPERTIES:
        return ecaproperties != null && !ecaproperties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ECARuleImpl
