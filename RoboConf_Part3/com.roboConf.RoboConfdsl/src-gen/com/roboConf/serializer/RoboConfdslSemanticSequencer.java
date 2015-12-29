package com.roboConf.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.roboConf.roboConfdsl.Children;
import com.roboConf.roboConfdsl.Component;
import com.roboConf.roboConfdsl.Count;
import com.roboConf.roboConfdsl.ECAProperty;
import com.roboConf.roboConfdsl.ECARule;
import com.roboConf.roboConfdsl.Extends;
import com.roboConf.roboConfdsl.Facet;
import com.roboConf.roboConfdsl.Installer;
import com.roboConf.roboConfdsl.Instance;
import com.roboConf.roboConfdsl.InstancePropertie;
import com.roboConf.roboConfdsl.Model;
import com.roboConf.roboConfdsl.Name;
import com.roboConf.roboConfdsl.RoboConfdslPackage;
import com.roboConf.services.RoboConfdslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RoboConfdslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RoboConfdslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RoboConfdslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RoboConfdslPackage.CHILDREN:
				if(context == grammarAccess.getChildrenRule() ||
				   context == grammarAccess.getPropertieRule()) {
					sequence_Children(context, (Children) semanticObject); 
					return; 
				}
				else break;
			case RoboConfdslPackage.COMPONENT:
				if(context == grammarAccess.getComponentRule() ||
				   context == grammarAccess.getFeatureRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case RoboConfdslPackage.COUNT:
				if(context == grammarAccess.getCountRule()) {
					sequence_Count(context, (Count) semanticObject); 
					return; 
				}
				else break;
			case RoboConfdslPackage.ECA_PROPERTY:
				if(context == grammarAccess.getECAPropertyRule()) {
					sequence_ECAProperty(context, (ECAProperty) semanticObject); 
					return; 
				}
				else break;
			case RoboConfdslPackage.ECA_RULE:
				if(context == grammarAccess.getECARuleRule()) {
					sequence_ECARule(context, (ECARule) semanticObject); 
					return; 
				}
				else break;
			case RoboConfdslPackage.EXTENDS:
				if(context == grammarAccess.getExtendsRule() ||
				   context == grammarAccess.getPropertieRule()) {
					sequence_Extends(context, (Extends) semanticObject); 
					return; 
				}
				else break;
			case RoboConfdslPackage.FACET:
				if(context == grammarAccess.getFacetRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getPropertieRule()) {
					sequence_Facet(context, (Facet) semanticObject); 
					return; 
				}
				else break;
			case RoboConfdslPackage.INSTALLER:
				if(context == grammarAccess.getInstallerRule() ||
				   context == grammarAccess.getPropertieRule()) {
					sequence_Installer(context, (Installer) semanticObject); 
					return; 
				}
				else break;
			case RoboConfdslPackage.INSTANCE:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getInstanceRule() ||
				   context == grammarAccess.getInstancesRule()) {
					sequence_Instance(context, (Instance) semanticObject); 
					return; 
				}
				else break;
			case RoboConfdslPackage.INSTANCE_PROPERTIE:
				if(context == grammarAccess.getInstancePropertieRule()) {
					sequence_InstancePropertie(context, (InstancePropertie) semanticObject); 
					return; 
				}
				else break;
			case RoboConfdslPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case RoboConfdslPackage.NAME:
				if(context == grammarAccess.getNameRule()) {
					sequence_Name(context, (Name) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     children=child
	 */
	protected void sequence_Children(EObject context, Children semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RoboConfdslPackage.Literals.CHILDREN__CHILDREN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboConfdslPackage.Literals.CHILDREN__CHILDREN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getChildrenAccess().getChildrenChildParserRuleCall_1_0(), semanticObject.getChildren());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID Properties+=Propertie*)
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     val=INT
	 */
	protected void sequence_Count(EObject context, Count semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RoboConfdslPackage.Literals.COUNT__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboConfdslPackage.Literals.COUNT__VAL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCountAccess().getValINTTerminalRuleCall_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elastic=Elastic numInstances=NumInstances? minallowedinstances=MinAllowedInstances? maxallowedinstances=MaxAllowedInstances?)
	 */
	protected void sequence_ECAProperty(EObject context, ECAProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (eca_rule_name=[Component|ID] ecaproperties+=ECAProperty*)
	 */
	protected void sequence_ECARule(EObject context, ECARule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ext=ID propertie=[Propertie|ID])
	 */
	protected void sequence_Extends(EObject context, Extends semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RoboConfdslPackage.Literals.EXTENDS__EXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboConfdslPackage.Literals.EXTENDS__EXT));
			if(transientValues.isValueTransient(semanticObject, RoboConfdslPackage.Literals.EXTENDS__PROPERTIE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboConfdslPackage.Literals.EXTENDS__PROPERTIE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExtendsAccess().getExtIDTerminalRuleCall_1_0(), semanticObject.getExt());
		feeder.accept(grammarAccess.getExtendsAccess().getPropertiePropertieIDTerminalRuleCall_3_0_1(), semanticObject.getPropertie());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (namefacet=ID children=Children? exports=Exports? extends=Extends?)
	 */
	protected void sequence_Facet(EObject context, Facet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Installer(EObject context, Installer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RoboConfdslPackage.Literals.INSTALLER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboConfdslPackage.Literals.INSTALLER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstallerAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (nameInst=Name count=Count? instance=Instances?)
	 */
	protected void sequence_InstancePropertie(EObject context, InstancePropertie semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nstanceName=[Component|ID] InstanceProperties+=InstancePropertie*)
	 */
	protected void sequence_Instance(EObject context, Instance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     Features+=Feature*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     nameN=ID
	 */
	protected void sequence_Name(EObject context, Name semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RoboConfdslPackage.Literals.NAME__NAME_N) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RoboConfdslPackage.Literals.NAME__NAME_N));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNameAccess().getNameNIDTerminalRuleCall_1_0(), semanticObject.getNameN());
		feeder.finish();
	}
}
