/**
 */
package com.roboConf.roboConfdsl.impl;

import com.roboConf.roboConfdsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoboConfdslFactoryImpl extends EFactoryImpl implements RoboConfdslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RoboConfdslFactory init()
  {
    try
    {
      RoboConfdslFactory theRoboConfdslFactory = (RoboConfdslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.roboConf.com/RoboConfdsl"); 
      if (theRoboConfdslFactory != null)
      {
        return theRoboConfdslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RoboConfdslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoboConfdslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RoboConfdslPackage.MODEL: return createModel();
      case RoboConfdslPackage.FEATURE: return createFeature();
      case RoboConfdslPackage.COMPONENT: return createComponent();
      case RoboConfdslPackage.PROPERTIE: return createPropertie();
      case RoboConfdslPackage.EXTENDS: return createExtends();
      case RoboConfdslPackage.CHILDREN: return createChildren();
      case RoboConfdslPackage.INSTALLER: return createInstaller();
      case RoboConfdslPackage.FACET: return createFacet();
      case RoboConfdslPackage.INSTANCE: return createInstance();
      case RoboConfdslPackage.INSTANCE_PROPERTIE: return createInstancePropertie();
      case RoboConfdslPackage.INSTANCES: return createInstances();
      case RoboConfdslPackage.COUNT: return createCount();
      case RoboConfdslPackage.NAME: return createName();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Component createComponent()
  {
    ComponentImpl component = new ComponentImpl();
    return component;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Propertie createPropertie()
  {
    PropertieImpl propertie = new PropertieImpl();
    return propertie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Extends createExtends()
  {
    ExtendsImpl extends_ = new ExtendsImpl();
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Children createChildren()
  {
    ChildrenImpl children = new ChildrenImpl();
    return children;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Installer createInstaller()
  {
    InstallerImpl installer = new InstallerImpl();
    return installer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Facet createFacet()
  {
    FacetImpl facet = new FacetImpl();
    return facet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instance createInstance()
  {
    InstanceImpl instance = new InstanceImpl();
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstancePropertie createInstancePropertie()
  {
    InstancePropertieImpl instancePropertie = new InstancePropertieImpl();
    return instancePropertie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instances createInstances()
  {
    InstancesImpl instances = new InstancesImpl();
    return instances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Count createCount()
  {
    CountImpl count = new CountImpl();
    return count;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name createName()
  {
    NameImpl name = new NameImpl();
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RoboConfdslPackage getRoboConfdslPackage()
  {
    return (RoboConfdslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RoboConfdslPackage getPackage()
  {
    return RoboConfdslPackage.eINSTANCE;
  }

} //RoboConfdslFactoryImpl
