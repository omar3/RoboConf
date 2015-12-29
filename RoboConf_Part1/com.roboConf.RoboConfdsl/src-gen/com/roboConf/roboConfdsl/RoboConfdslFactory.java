/**
 */
package com.roboConf.roboConfdsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.roboConf.roboConfdsl.RoboConfdslPackage
 * @generated
 */
public interface RoboConfdslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RoboConfdslFactory eINSTANCE = com.roboConf.roboConfdsl.impl.RoboConfdslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature</em>'.
   * @generated
   */
  Feature createFeature();

  /**
   * Returns a new object of class '<em>Component</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Component</em>'.
   * @generated
   */
  Component createComponent();

  /**
   * Returns a new object of class '<em>Propertie</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Propertie</em>'.
   * @generated
   */
  Propertie createPropertie();

  /**
   * Returns a new object of class '<em>Extends</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extends</em>'.
   * @generated
   */
  Extends createExtends();

  /**
   * Returns a new object of class '<em>Children</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Children</em>'.
   * @generated
   */
  Children createChildren();

  /**
   * Returns a new object of class '<em>Installer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Installer</em>'.
   * @generated
   */
  Installer createInstaller();

  /**
   * Returns a new object of class '<em>Facet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Facet</em>'.
   * @generated
   */
  Facet createFacet();

  /**
   * Returns a new object of class '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance</em>'.
   * @generated
   */
  Instance createInstance();

  /**
   * Returns a new object of class '<em>Instance Propertie</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Propertie</em>'.
   * @generated
   */
  InstancePropertie createInstancePropertie();

  /**
   * Returns a new object of class '<em>Instances</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instances</em>'.
   * @generated
   */
  Instances createInstances();

  /**
   * Returns a new object of class '<em>Count</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Count</em>'.
   * @generated
   */
  Count createCount();

  /**
   * Returns a new object of class '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name</em>'.
   * @generated
   */
  Name createName();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RoboConfdslPackage getRoboConfdslPackage();

} //RoboConfdslFactory
