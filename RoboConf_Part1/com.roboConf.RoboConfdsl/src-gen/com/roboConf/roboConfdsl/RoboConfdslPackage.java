/**
 */
package com.roboConf.roboConfdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.roboConf.roboConfdsl.RoboConfdslFactory
 * @model kind="package"
 * @generated
 */
public interface RoboConfdslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "roboConfdsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.roboConf.com/RoboConfdsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "roboConfdsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RoboConfdslPackage eINSTANCE = com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl.init();

  /**
   * The meta object id for the '{@link com.roboConf.roboConfdsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.roboConf.roboConfdsl.impl.ModelImpl
   * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FEATURES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.roboConf.roboConfdsl.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.roboConf.roboConfdsl.impl.FeatureImpl
   * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 1;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.roboConf.roboConfdsl.impl.ComponentImpl <em>Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.roboConf.roboConfdsl.impl.ComponentImpl
   * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getComponent()
   * @generated
   */
  int COMPONENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__PROPERTIES = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.roboConf.roboConfdsl.impl.PropertieImpl <em>Propertie</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.roboConf.roboConfdsl.impl.PropertieImpl
   * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getPropertie()
   * @generated
   */
  int PROPERTIE = 3;

  /**
   * The number of structural features of the '<em>Propertie</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTIE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.roboConf.roboConfdsl.impl.ExtendsImpl <em>Extends</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.roboConf.roboConfdsl.impl.ExtendsImpl
   * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getExtends()
   * @generated
   */
  int EXTENDS = 4;

  /**
   * The feature id for the '<em><b>Ext</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS__EXT = PROPERTIE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Propertie</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS__PROPERTIE = PROPERTIE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Extends</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENDS_FEATURE_COUNT = PROPERTIE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.roboConf.roboConfdsl.impl.ChildrenImpl <em>Children</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.roboConf.roboConfdsl.impl.ChildrenImpl
   * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getChildren()
   * @generated
   */
  int CHILDREN = 5;

  /**
   * The feature id for the '<em><b>Children</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILDREN__CHILDREN = PROPERTIE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Children</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILDREN_FEATURE_COUNT = PROPERTIE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.roboConf.roboConfdsl.impl.InstallerImpl <em>Installer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.roboConf.roboConfdsl.impl.InstallerImpl
   * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getInstaller()
   * @generated
   */
  int INSTALLER = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER__NAME = PROPERTIE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Installer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTALLER_FEATURE_COUNT = PROPERTIE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.roboConf.roboConfdsl.impl.FacetImpl <em>Facet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.roboConf.roboConfdsl.impl.FacetImpl
   * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getFacet()
   * @generated
   */
  int FACET = 7;

  /**
   * The feature id for the '<em><b>Namefacet</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET__NAMEFACET = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET__CHILDREN = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Exports</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET__EXPORTS = FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET__EXTENDS = FEATURE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Facet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.roboConf.roboConfdsl.impl.InstanceImpl <em>Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.roboConf.roboConfdsl.impl.InstanceImpl
   * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getInstance()
   * @generated
   */
  int INSTANCE = 8;

  /**
   * The feature id for the '<em><b>Nstance Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__NSTANCE_NAME = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instance Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__INSTANCE_PROPERTIES = FEATURE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.roboConf.roboConfdsl.impl.InstancePropertieImpl <em>Instance Propertie</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.roboConf.roboConfdsl.impl.InstancePropertieImpl
   * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getInstancePropertie()
   * @generated
   */
  int INSTANCE_PROPERTIE = 9;

  /**
   * The feature id for the '<em><b>Name Inst</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_PROPERTIE__NAME_INST = 0;

  /**
   * The feature id for the '<em><b>Count</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_PROPERTIE__COUNT = 1;

  /**
   * The feature id for the '<em><b>Instance</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_PROPERTIE__INSTANCE = 2;

  /**
   * The number of structural features of the '<em>Instance Propertie</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_PROPERTIE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.roboConf.roboConfdsl.impl.InstancesImpl <em>Instances</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.roboConf.roboConfdsl.impl.InstancesImpl
   * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getInstances()
   * @generated
   */
  int INSTANCES = 10;

  /**
   * The number of structural features of the '<em>Instances</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.roboConf.roboConfdsl.impl.CountImpl <em>Count</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.roboConf.roboConfdsl.impl.CountImpl
   * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getCount()
   * @generated
   */
  int COUNT = 11;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT__VAL = 0;

  /**
   * The number of structural features of the '<em>Count</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COUNT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.roboConf.roboConfdsl.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.roboConf.roboConfdsl.impl.NameImpl
   * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getName_()
   * @generated
   */
  int NAME = 12;

  /**
   * The feature id for the '<em><b>Name N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME__NAME_N = 0;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link com.roboConf.roboConfdsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see com.roboConf.roboConfdsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link com.roboConf.roboConfdsl.Model#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see com.roboConf.roboConfdsl.Model#getFeatures()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Features();

  /**
   * Returns the meta object for class '{@link com.roboConf.roboConfdsl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see com.roboConf.roboConfdsl.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for class '{@link com.roboConf.roboConfdsl.Component <em>Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Component</em>'.
   * @see com.roboConf.roboConfdsl.Component
   * @generated
   */
  EClass getComponent();

  /**
   * Returns the meta object for the attribute '{@link com.roboConf.roboConfdsl.Component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.roboConf.roboConfdsl.Component#getName()
   * @see #getComponent()
   * @generated
   */
  EAttribute getComponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.roboConf.roboConfdsl.Component#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see com.roboConf.roboConfdsl.Component#getProperties()
   * @see #getComponent()
   * @generated
   */
  EReference getComponent_Properties();

  /**
   * Returns the meta object for class '{@link com.roboConf.roboConfdsl.Propertie <em>Propertie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Propertie</em>'.
   * @see com.roboConf.roboConfdsl.Propertie
   * @generated
   */
  EClass getPropertie();

  /**
   * Returns the meta object for class '{@link com.roboConf.roboConfdsl.Extends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extends</em>'.
   * @see com.roboConf.roboConfdsl.Extends
   * @generated
   */
  EClass getExtends();

  /**
   * Returns the meta object for the attribute '{@link com.roboConf.roboConfdsl.Extends#getExt <em>Ext</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ext</em>'.
   * @see com.roboConf.roboConfdsl.Extends#getExt()
   * @see #getExtends()
   * @generated
   */
  EAttribute getExtends_Ext();

  /**
   * Returns the meta object for the reference '{@link com.roboConf.roboConfdsl.Extends#getPropertie <em>Propertie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Propertie</em>'.
   * @see com.roboConf.roboConfdsl.Extends#getPropertie()
   * @see #getExtends()
   * @generated
   */
  EReference getExtends_Propertie();

  /**
   * Returns the meta object for class '{@link com.roboConf.roboConfdsl.Children <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Children</em>'.
   * @see com.roboConf.roboConfdsl.Children
   * @generated
   */
  EClass getChildren();

  /**
   * Returns the meta object for the attribute '{@link com.roboConf.roboConfdsl.Children#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Children</em>'.
   * @see com.roboConf.roboConfdsl.Children#getChildren()
   * @see #getChildren()
   * @generated
   */
  EAttribute getChildren_Children();

  /**
   * Returns the meta object for class '{@link com.roboConf.roboConfdsl.Installer <em>Installer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Installer</em>'.
   * @see com.roboConf.roboConfdsl.Installer
   * @generated
   */
  EClass getInstaller();

  /**
   * Returns the meta object for the attribute '{@link com.roboConf.roboConfdsl.Installer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.roboConf.roboConfdsl.Installer#getName()
   * @see #getInstaller()
   * @generated
   */
  EAttribute getInstaller_Name();

  /**
   * Returns the meta object for class '{@link com.roboConf.roboConfdsl.Facet <em>Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facet</em>'.
   * @see com.roboConf.roboConfdsl.Facet
   * @generated
   */
  EClass getFacet();

  /**
   * Returns the meta object for the attribute '{@link com.roboConf.roboConfdsl.Facet#getNamefacet <em>Namefacet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namefacet</em>'.
   * @see com.roboConf.roboConfdsl.Facet#getNamefacet()
   * @see #getFacet()
   * @generated
   */
  EAttribute getFacet_Namefacet();

  /**
   * Returns the meta object for the containment reference '{@link com.roboConf.roboConfdsl.Facet#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Children</em>'.
   * @see com.roboConf.roboConfdsl.Facet#getChildren()
   * @see #getFacet()
   * @generated
   */
  EReference getFacet_Children();

  /**
   * Returns the meta object for the attribute '{@link com.roboConf.roboConfdsl.Facet#getExports <em>Exports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exports</em>'.
   * @see com.roboConf.roboConfdsl.Facet#getExports()
   * @see #getFacet()
   * @generated
   */
  EAttribute getFacet_Exports();

  /**
   * Returns the meta object for the containment reference '{@link com.roboConf.roboConfdsl.Facet#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extends</em>'.
   * @see com.roboConf.roboConfdsl.Facet#getExtends()
   * @see #getFacet()
   * @generated
   */
  EReference getFacet_Extends();

  /**
   * Returns the meta object for class '{@link com.roboConf.roboConfdsl.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance</em>'.
   * @see com.roboConf.roboConfdsl.Instance
   * @generated
   */
  EClass getInstance();

  /**
   * Returns the meta object for the reference '{@link com.roboConf.roboConfdsl.Instance#getNstanceName <em>Nstance Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Nstance Name</em>'.
   * @see com.roboConf.roboConfdsl.Instance#getNstanceName()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_NstanceName();

  /**
   * Returns the meta object for the containment reference list '{@link com.roboConf.roboConfdsl.Instance#getInstanceProperties <em>Instance Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instance Properties</em>'.
   * @see com.roboConf.roboConfdsl.Instance#getInstanceProperties()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_InstanceProperties();

  /**
   * Returns the meta object for class '{@link com.roboConf.roboConfdsl.InstancePropertie <em>Instance Propertie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Propertie</em>'.
   * @see com.roboConf.roboConfdsl.InstancePropertie
   * @generated
   */
  EClass getInstancePropertie();

  /**
   * Returns the meta object for the containment reference '{@link com.roboConf.roboConfdsl.InstancePropertie#getNameInst <em>Name Inst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Inst</em>'.
   * @see com.roboConf.roboConfdsl.InstancePropertie#getNameInst()
   * @see #getInstancePropertie()
   * @generated
   */
  EReference getInstancePropertie_NameInst();

  /**
   * Returns the meta object for the containment reference '{@link com.roboConf.roboConfdsl.InstancePropertie#getCount <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Count</em>'.
   * @see com.roboConf.roboConfdsl.InstancePropertie#getCount()
   * @see #getInstancePropertie()
   * @generated
   */
  EReference getInstancePropertie_Count();

  /**
   * Returns the meta object for the containment reference '{@link com.roboConf.roboConfdsl.InstancePropertie#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instance</em>'.
   * @see com.roboConf.roboConfdsl.InstancePropertie#getInstance()
   * @see #getInstancePropertie()
   * @generated
   */
  EReference getInstancePropertie_Instance();

  /**
   * Returns the meta object for class '{@link com.roboConf.roboConfdsl.Instances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instances</em>'.
   * @see com.roboConf.roboConfdsl.Instances
   * @generated
   */
  EClass getInstances();

  /**
   * Returns the meta object for class '{@link com.roboConf.roboConfdsl.Count <em>Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Count</em>'.
   * @see com.roboConf.roboConfdsl.Count
   * @generated
   */
  EClass getCount();

  /**
   * Returns the meta object for the attribute '{@link com.roboConf.roboConfdsl.Count#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see com.roboConf.roboConfdsl.Count#getVal()
   * @see #getCount()
   * @generated
   */
  EAttribute getCount_Val();

  /**
   * Returns the meta object for class '{@link com.roboConf.roboConfdsl.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see com.roboConf.roboConfdsl.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for the attribute '{@link com.roboConf.roboConfdsl.Name#getNameN <em>Name N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name N</em>'.
   * @see com.roboConf.roboConfdsl.Name#getNameN()
   * @see #getName_()
   * @generated
   */
  EAttribute getName_NameN();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RoboConfdslFactory getRoboConfdslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.roboConf.roboConfdsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.roboConf.roboConfdsl.impl.ModelImpl
     * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FEATURES = eINSTANCE.getModel_Features();

    /**
     * The meta object literal for the '{@link com.roboConf.roboConfdsl.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.roboConf.roboConfdsl.impl.FeatureImpl
     * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '{@link com.roboConf.roboConfdsl.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.roboConf.roboConfdsl.impl.ComponentImpl
     * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getComponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getComponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__PROPERTIES = eINSTANCE.getComponent_Properties();

    /**
     * The meta object literal for the '{@link com.roboConf.roboConfdsl.impl.PropertieImpl <em>Propertie</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.roboConf.roboConfdsl.impl.PropertieImpl
     * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getPropertie()
     * @generated
     */
    EClass PROPERTIE = eINSTANCE.getPropertie();

    /**
     * The meta object literal for the '{@link com.roboConf.roboConfdsl.impl.ExtendsImpl <em>Extends</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.roboConf.roboConfdsl.impl.ExtendsImpl
     * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getExtends()
     * @generated
     */
    EClass EXTENDS = eINSTANCE.getExtends();

    /**
     * The meta object literal for the '<em><b>Ext</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTENDS__EXT = eINSTANCE.getExtends_Ext();

    /**
     * The meta object literal for the '<em><b>Propertie</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTENDS__PROPERTIE = eINSTANCE.getExtends_Propertie();

    /**
     * The meta object literal for the '{@link com.roboConf.roboConfdsl.impl.ChildrenImpl <em>Children</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.roboConf.roboConfdsl.impl.ChildrenImpl
     * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getChildren()
     * @generated
     */
    EClass CHILDREN = eINSTANCE.getChildren();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHILDREN__CHILDREN = eINSTANCE.getChildren_Children();

    /**
     * The meta object literal for the '{@link com.roboConf.roboConfdsl.impl.InstallerImpl <em>Installer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.roboConf.roboConfdsl.impl.InstallerImpl
     * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getInstaller()
     * @generated
     */
    EClass INSTALLER = eINSTANCE.getInstaller();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSTALLER__NAME = eINSTANCE.getInstaller_Name();

    /**
     * The meta object literal for the '{@link com.roboConf.roboConfdsl.impl.FacetImpl <em>Facet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.roboConf.roboConfdsl.impl.FacetImpl
     * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getFacet()
     * @generated
     */
    EClass FACET = eINSTANCE.getFacet();

    /**
     * The meta object literal for the '<em><b>Namefacet</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACET__NAMEFACET = eINSTANCE.getFacet_Namefacet();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACET__CHILDREN = eINSTANCE.getFacet_Children();

    /**
     * The meta object literal for the '<em><b>Exports</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FACET__EXPORTS = eINSTANCE.getFacet_Exports();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACET__EXTENDS = eINSTANCE.getFacet_Extends();

    /**
     * The meta object literal for the '{@link com.roboConf.roboConfdsl.impl.InstanceImpl <em>Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.roboConf.roboConfdsl.impl.InstanceImpl
     * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getInstance()
     * @generated
     */
    EClass INSTANCE = eINSTANCE.getInstance();

    /**
     * The meta object literal for the '<em><b>Nstance Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__NSTANCE_NAME = eINSTANCE.getInstance_NstanceName();

    /**
     * The meta object literal for the '<em><b>Instance Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__INSTANCE_PROPERTIES = eINSTANCE.getInstance_InstanceProperties();

    /**
     * The meta object literal for the '{@link com.roboConf.roboConfdsl.impl.InstancePropertieImpl <em>Instance Propertie</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.roboConf.roboConfdsl.impl.InstancePropertieImpl
     * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getInstancePropertie()
     * @generated
     */
    EClass INSTANCE_PROPERTIE = eINSTANCE.getInstancePropertie();

    /**
     * The meta object literal for the '<em><b>Name Inst</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_PROPERTIE__NAME_INST = eINSTANCE.getInstancePropertie_NameInst();

    /**
     * The meta object literal for the '<em><b>Count</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_PROPERTIE__COUNT = eINSTANCE.getInstancePropertie_Count();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_PROPERTIE__INSTANCE = eINSTANCE.getInstancePropertie_Instance();

    /**
     * The meta object literal for the '{@link com.roboConf.roboConfdsl.impl.InstancesImpl <em>Instances</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.roboConf.roboConfdsl.impl.InstancesImpl
     * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getInstances()
     * @generated
     */
    EClass INSTANCES = eINSTANCE.getInstances();

    /**
     * The meta object literal for the '{@link com.roboConf.roboConfdsl.impl.CountImpl <em>Count</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.roboConf.roboConfdsl.impl.CountImpl
     * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getCount()
     * @generated
     */
    EClass COUNT = eINSTANCE.getCount();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COUNT__VAL = eINSTANCE.getCount_Val();

    /**
     * The meta object literal for the '{@link com.roboConf.roboConfdsl.impl.NameImpl <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.roboConf.roboConfdsl.impl.NameImpl
     * @see com.roboConf.roboConfdsl.impl.RoboConfdslPackageImpl#getName_()
     * @generated
     */
    EClass NAME = eINSTANCE.getName_();

    /**
     * The meta object literal for the '<em><b>Name N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME__NAME_N = eINSTANCE.getName_NameN();

  }

} //RoboConfdslPackage
