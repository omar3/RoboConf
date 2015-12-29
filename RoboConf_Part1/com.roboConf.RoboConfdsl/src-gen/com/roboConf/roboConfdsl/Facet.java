/**
 */
package com.roboConf.roboConfdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.roboConf.roboConfdsl.Facet#getNamefacet <em>Namefacet</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.Facet#getChildren <em>Children</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.Facet#getExports <em>Exports</em>}</li>
 *   <li>{@link com.roboConf.roboConfdsl.Facet#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getFacet()
 * @model
 * @generated
 */
public interface Facet extends Feature, Propertie
{
  /**
   * Returns the value of the '<em><b>Namefacet</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namefacet</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namefacet</em>' attribute.
   * @see #setNamefacet(String)
   * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getFacet_Namefacet()
   * @model
   * @generated
   */
  String getNamefacet();

  /**
   * Sets the value of the '{@link com.roboConf.roboConfdsl.Facet#getNamefacet <em>Namefacet</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namefacet</em>' attribute.
   * @see #getNamefacet()
   * @generated
   */
  void setNamefacet(String value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference.
   * @see #setChildren(Children)
   * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getFacet_Children()
   * @model containment="true"
   * @generated
   */
  Children getChildren();

  /**
   * Sets the value of the '{@link com.roboConf.roboConfdsl.Facet#getChildren <em>Children</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Children</em>' containment reference.
   * @see #getChildren()
   * @generated
   */
  void setChildren(Children value);

  /**
   * Returns the value of the '<em><b>Exports</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exports</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exports</em>' attribute.
   * @see #setExports(String)
   * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getFacet_Exports()
   * @model
   * @generated
   */
  String getExports();

  /**
   * Sets the value of the '{@link com.roboConf.roboConfdsl.Facet#getExports <em>Exports</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exports</em>' attribute.
   * @see #getExports()
   * @generated
   */
  void setExports(String value);

  /**
   * Returns the value of the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' containment reference.
   * @see #setExtends(Extends)
   * @see com.roboConf.roboConfdsl.RoboConfdslPackage#getFacet_Extends()
   * @model containment="true"
   * @generated
   */
  Extends getExtends();

  /**
   * Sets the value of the '{@link com.roboConf.roboConfdsl.Facet#getExtends <em>Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' containment reference.
   * @see #getExtends()
   * @generated
   */
  void setExtends(Extends value);

} // Facet
