/**
 */
package com.roboConf.roboConfdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Count</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.roboConf.roboConfdsl.Count#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getCount()
 * @model
 * @generated
 */
public interface Count extends EObject
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(int)
   * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getCount_Val()
   * @model
   * @generated
   */
  int getVal();

  /**
   * Sets the value of the '{@link com.roboConf.roboConfdsl.Count#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(int value);

} // Count
