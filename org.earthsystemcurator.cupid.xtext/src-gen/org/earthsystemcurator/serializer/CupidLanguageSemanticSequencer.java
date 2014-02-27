package org.earthsystemcurator.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.earthsystemcurator.cupidLanguage.ActualParam;
import org.earthsystemcurator.cupidLanguage.Annotation;
import org.earthsystemcurator.cupidLanguage.Call;
import org.earthsystemcurator.cupidLanguage.Cardinality;
import org.earthsystemcurator.cupidLanguage.ConceptDef;
import org.earthsystemcurator.cupidLanguage.ConceptDefBody;
import org.earthsystemcurator.cupidLanguage.CupidLanguagePackage;
import org.earthsystemcurator.cupidLanguage.FormalParam;
import org.earthsystemcurator.cupidLanguage.IDOrWildcard;
import org.earthsystemcurator.cupidLanguage.Intent;
import org.earthsystemcurator.cupidLanguage.Language;
import org.earthsystemcurator.cupidLanguage.Mapping;
import org.earthsystemcurator.cupidLanguage.Module;
import org.earthsystemcurator.cupidLanguage.ModuleName;
import org.earthsystemcurator.cupidLanguage.PathExpr;
import org.earthsystemcurator.cupidLanguage.Subconcept;
import org.earthsystemcurator.cupidLanguage.Subroutine;
import org.earthsystemcurator.cupidLanguage.SubroutineName;
import org.earthsystemcurator.cupidLanguage.Type;
import org.earthsystemcurator.cupidLanguage.UsesEntity;
import org.earthsystemcurator.cupidLanguage.UsesModule;
import org.earthsystemcurator.services.CupidLanguageGrammarAccess;
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
public class CupidLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CupidLanguageGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CupidLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CupidLanguagePackage.ACTUAL_PARAM:
				if(context == grammarAccess.getActualParamRule()) {
					sequence_ActualParam(context, (ActualParam) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.CALL:
				if(context == grammarAccess.getCallRule() ||
				   context == grammarAccess.getImplicitContextMappingRule()) {
					sequence_Call(context, (Call) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.CARDINALITY:
				if(context == grammarAccess.getCardinalityRule()) {
					sequence_Cardinality(context, (Cardinality) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.CONCEPT_DEF:
				if(context == grammarAccess.getConceptDefRule()) {
					sequence_ConceptDef(context, (ConceptDef) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.CONCEPT_DEF_BODY:
				if(context == grammarAccess.getConceptDefBodyRule()) {
					sequence_ConceptDefBody(context, (ConceptDefBody) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.FORMAL_PARAM:
				if(context == grammarAccess.getFormalParamRule()) {
					sequence_FormalParam(context, (FormalParam) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.ID_OR_WILDCARD:
				if(context == grammarAccess.getIDOrPathExprRule() ||
				   context == grammarAccess.getIDOrWildcardRule()) {
					sequence_IDOrWildcard(context, (IDOrWildcard) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.INTENT:
				if(context == grammarAccess.getIntentRule()) {
					sequence_Intent(context, (Intent) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.LANGUAGE:
				if(context == grammarAccess.getLanguageRule()) {
					sequence_Language(context, (Language) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.MAPPING:
				if(context == grammarAccess.getMappingRule()) {
					sequence_Mapping(context, (Mapping) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.MODULE:
				if(context == grammarAccess.getImplicitContextMappingRule() ||
				   context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.MODULE_NAME:
				if(context == grammarAccess.getImplicitContextMappingRule() ||
				   context == grammarAccess.getModuleNameRule()) {
					sequence_ModuleName(context, (ModuleName) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.PATH_EXPR:
				if(context == grammarAccess.getIDOrPathExprRule() ||
				   context == grammarAccess.getPathExprRule()) {
					sequence_PathExpr(context, (PathExpr) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.SUBCONCEPT:
				if(context == grammarAccess.getSubconceptRule()) {
					sequence_Subconcept(context, (Subconcept) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.SUBROUTINE:
				if(context == grammarAccess.getImplicitContextMappingRule() ||
				   context == grammarAccess.getSubroutineRule()) {
					sequence_Subroutine(context, (Subroutine) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.SUBROUTINE_NAME:
				if(context == grammarAccess.getImplicitContextMappingRule() ||
				   context == grammarAccess.getSubroutineNameRule()) {
					sequence_SubroutineName(context, (SubroutineName) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.USES_ENTITY:
				if(context == grammarAccess.getImplicitContextMappingRule() ||
				   context == grammarAccess.getUsesEntityRule()) {
					sequence_UsesEntity(context, (UsesEntity) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.USES_MODULE:
				if(context == grammarAccess.getImplicitContextMappingRule() ||
				   context == grammarAccess.getUsesModuleRule()) {
					sequence_UsesModule(context, (UsesModule) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((keyword=ID optional?='?'?)? value=IDOrPathExpr)
	 */
	protected void sequence_ActualParam(EObject context, ActualParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=ID value=STRING)
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CupidLanguagePackage.Literals.ANNOTATION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CupidLanguagePackage.Literals.ANNOTATION__KEY));
			if(transientValues.isValueTransient(semanticObject, CupidLanguagePackage.Literals.ANNOTATION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CupidLanguagePackage.Literals.ANNOTATION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnnotationAccess().getKeyIDTerminalRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (subroutineName=IDOrPathExpr (params+=ActualParam params+=ActualParam*)?)
	 */
	protected void sequence_Call(EObject context, Call semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (zeroOrMore?='*' | oneOrMore?='+')
	 */
	protected void sequence_Cardinality(EObject context, Cardinality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (subconcept+=Subconcept subconcept+=Subconcept*)
	 */
	protected void sequence_ConceptDefBody(EObject context, ConceptDefBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (top?='top'? name=ID mapping=Mapping? (annotation+=Annotation annotation+=Annotation*)? body=ConceptDefBody?)
	 */
	protected void sequence_ConceptDef(EObject context, ConceptDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (intent=Intent? type=Type name=IDOrPathExpr)
	 */
	protected void sequence_FormalParam(EObject context, FormalParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID | wildcard?='*')
	 */
	protected void sequence_IDOrWildcard(EObject context, IDOrWildcard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (in?='in' | out?='out' | inout?='inout')
	 */
	protected void sequence_Intent(EObject context, Intent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID uri=STRING conceptDef+=ConceptDef+)
	 */
	protected void sequence_Language(EObject context, Language semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (context=PathExpr? mapping=ImplicitContextMapping)
	 */
	protected void sequence_Mapping(EObject context, Mapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ModuleName}
	 */
	protected void sequence_ModuleName(EObject context, ModuleName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDOrPathExpr?)
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (segments+=PathSegment segments+=PathSegment*)
	 */
	protected void sequence_PathExpr(EObject context, PathExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         attrib?='attrib'? 
	 *         name=ID 
	 *         cardinality=Cardinality? 
	 *         essential?='!'? 
	 *         ((ref?=':' conceptDef=[ConceptDef|ID]) | (mapping=Mapping? (annotation+=Annotation annotation+=Annotation*)? body=ConceptDefBody?))
	 *     )
	 */
	protected void sequence_Subconcept(EObject context, Subconcept semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDOrPathExpr?)
	 */
	protected void sequence_SubroutineName(EObject context, SubroutineName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IDOrPathExpr (params+=FormalParam params+=FormalParam*)?)
	 */
	protected void sequence_Subroutine(EObject context, Subroutine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         integer?='integer' | 
	 *         character?='character' | 
	 *         logical?='logical' | 
	 *         real?='real' | 
	 *         double?='double' | 
	 *         (derived?='type' derivedType=IDOrPathExpr)
	 *     )
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=IDOrPathExpr
	 */
	protected void sequence_UsesEntity(EObject context, UsesEntity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CupidLanguagePackage.Literals.USES_ENTITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CupidLanguagePackage.Literals.USES_ENTITY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUsesEntityAccess().getNameIDOrPathExprParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=IDOrPathExpr
	 */
	protected void sequence_UsesModule(EObject context, UsesModule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CupidLanguagePackage.Literals.USES_MODULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CupidLanguagePackage.Literals.USES_MODULE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUsesModuleAccess().getNameIDOrPathExprParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
}
