/**
 */
package com.roboConf.roboConfdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.roboConf.roboConfdsl.Model#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link com.roboConf.roboConfdsl.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getModel_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // Model
