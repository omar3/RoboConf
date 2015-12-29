/**
 */
package com.roboConf.roboConfdsl.impl;

import com.roboConf.roboConfdsl.Children;
import com.roboConf.roboConfdsl.Extends;
import com.roboConf.roboConfdsl.Facet;
import com.roboConf.roboConfdsl.RoboConfdslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.roboConf.roboConfdsl.impl.FacetImpl#getNamefacet <em>Namefacet</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.impl.FacetImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.impl.FacetImpl#getExports <em>Exports</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.impl.FacetImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacetImpl extends FeatureImpl implements Facet
{
  /**
   * The default value of the '{@link #getNamefacet() <em>Namefacet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamefacet()
   * @generated
   * @ordered
   */
  protected static final String NAMEFACET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNamefacet() <em>Namefacet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamefacet()
   * @generated
   * @ordered
   */
  protected String namefacet = NAMEFACET_EDEFAULT;

  /**
   * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChildren()
   * @generated
   * @ordered
   */
  protected Children children;

  /**
   * The default value of the '{@link #getExports() <em>Exports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExports()
   * @generated
   * @ordered
   */
  protected static final String EXPORTS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExports() <em>Exports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExports()
   * @generated
   * @ordered
   */
  protected String exports = EXPORTS_EDEFAULT;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected Extends extends_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FacetImpl()
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
    return RoboConfdslPackage.Literals.FACET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNamefacet()
  {
    return namefacet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamefacet(String newNamefacet)
  {
    String oldNamefacet = namefacet;
    namefacet = newNamefacet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.FACET__NAMEFACET, oldNamefacet, namefacet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Children getChildren()
  {
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChildren(Children newChildren, NotificationChain msgs)
  {
    Children oldChildren = children;
    children = newChildren;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.FACET__CHILDREN, oldChildren, newChildren);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChildren(Children newChildren)
  {
    if (newChildren != children)
    {
      NotificationChain msgs = null;
      if (children != null)
        msgs = ((InternalEObject)children).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoboConfdslPackage.FACET__CHILDREN, null, msgs);
      if (newChildren != null)
        msgs = ((InternalEObject)newChildren).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoboConfdslPackage.FACET__CHILDREN, null, msgs);
      msgs = basicSetChildren(newChildren, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.FACET__CHILDREN, newChildren, newChildren));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExports()
  {
    return exports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExports(String newExports)
  {
    String oldExports = exports;
    exports = newExports;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.FACET__EXPORTS, oldExports, exports));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Extends getExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExtends(Extends newExtends, NotificationChain msgs)
  {
    Extends oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.FACET__EXTENDS, oldExtends, newExtends);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(Extends newExtends)
  {
    if (newExtends != extends_)
    {
      NotificationChain msgs = null;
      if (extends_ != null)
        msgs = ((InternalEObject)extends_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoboConfdslPackage.FACET__EXTENDS, null, msgs);
      if (newExtends != null)
        msgs = ((InternalEObject)newExtends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoboConfdslPackage.FACET__EXTENDS, null, msgs);
      msgs = basicSetExtends(newExtends, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RoboConfdslPackage.FACET__EXTENDS, newExtends, newExtends));
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
      case RoboConfdslPackage.FACET__CHILDREN:
        return basicSetChildren(null, msgs);
      case RoboConfdslPackage.FACET__EXTENDS:
        return basicSetExtends(null, msgs);
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
      case RoboConfdslPackage.FACET__NAMEFACET:
        return getNamefacet();
      case RoboConfdslPackage.FACET__CHILDREN:
        return getChildren();
      case RoboConfdslPackage.FACET__EXPORTS:
        return getExports();
      case RoboConfdslPackage.FACET__EXTENDS:
        return getExtends();
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
      case RoboConfdslPackage.FACET__NAMEFACET:
        setNamefacet((String)newValue);
        return;
      case RoboConfdslPackage.FACET__CHILDREN:
        setChildren((Children)newValue);
        return;
      case RoboConfdslPackage.FACET__EXPORTS:
        setExports((String)newValue);
        return;
      case RoboConfdslPackage.FACET__EXTENDS:
        setExtends((Extends)newValue);
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
      case RoboConfdslPackage.FACET__NAMEFACET:
        setNamefacet(NAMEFACET_EDEFAULT);
        return;
      case RoboConfdslPackage.FACET__CHILDREN:
        setChildren((Children)null);
        return;
      case RoboConfdslPackage.FACET__EXPORTS:
        setExports(EXPORTS_EDEFAULT);
        return;
      case RoboConfdslPackage.FACET__EXTENDS:
        setExtends((Extends)null);
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
      case RoboConfdslPackage.FACET__NAMEFACET:
        return NAMEFACET_EDEFAULT == null ? namefacet != null : !NAMEFACET_EDEFAULT.equals(namefacet);
      case RoboConfdslPackage.FACET__CHILDREN:
        return children != null;
      case RoboConfdslPackage.FACET__EXPORTS:
        return EXPORTS_EDEFAULT == null ? exports != null : !EXPORTS_EDEFAULT.equals(exports);
      case RoboConfdslPackage.FACET__EXTENDS:
        return extends_ != null;
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
    result.append(" (namefacet: ");
    result.append(namefacet);
    result.append(", exports: ");
    result.append(exports);
    result.append(')');
    return result.toString();
  }

} //FacetImpl
