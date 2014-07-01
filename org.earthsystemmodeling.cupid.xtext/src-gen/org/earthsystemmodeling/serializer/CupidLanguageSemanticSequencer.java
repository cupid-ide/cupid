package org.earthsystemmodeling.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.earthsystemmodeling.cupid.ActualParam;
import org.earthsystemmodeling.cupid.ActualParamByKeyword;
import org.earthsystemmodeling.cupid.Annotation;
import org.earthsystemmodeling.cupid.Axis;
import org.earthsystemmodeling.cupid.Call;
import org.earthsystemmodeling.cupid.Cardinality;
import org.earthsystemmodeling.cupid.ConceptDef;
import org.earthsystemmodeling.cupid.CupidPackage;
import org.earthsystemmodeling.cupid.DeclaredEntity;
import org.earthsystemmodeling.cupid.Expr;
import org.earthsystemmodeling.cupid.FormalParam;
import org.earthsystemmodeling.cupid.FunctionAssignment;
import org.earthsystemmodeling.cupid.Intent;
import org.earthsystemmodeling.cupid.Language;
import org.earthsystemmodeling.cupid.LocalExpression;
import org.earthsystemmodeling.cupid.Mapping;
import org.earthsystemmodeling.cupid.Module;
import org.earthsystemmodeling.cupid.ModuleName;
import org.earthsystemmodeling.cupid.PathExpr;
import org.earthsystemmodeling.cupid.PathExprTerm;
import org.earthsystemmodeling.cupid.SubconceptOrAttribute;
import org.earthsystemmodeling.cupid.Subroutine;
import org.earthsystemmodeling.cupid.SubroutineName;
import org.earthsystemmodeling.cupid.Type;
import org.earthsystemmodeling.cupid.UsesEntity;
import org.earthsystemmodeling.cupid.UsesModule;
import org.earthsystemmodeling.cupid.VariableDeclaration;
import org.earthsystemmodeling.services.CupidLanguageGrammarAccess;
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
		if(semanticObject.eClass().getEPackage() == CupidPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CupidPackage.ACTUAL_PARAM:
				if(context == grammarAccess.getActualParamRule()) {
					sequence_ActualParam(context, (ActualParam) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.ACTUAL_PARAM_BY_KEYWORD:
				if(context == grammarAccess.getActualParamByKeywordRule() ||
				   context == grammarAccess.getImplicitContextMappingRule()) {
					sequence_ActualParamByKeyword(context, (ActualParamByKeyword) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.AXIS:
				if(context == grammarAccess.getAxisRule()) {
					sequence_Axis(context, (Axis) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.CALL:
				if(context == grammarAccess.getCallRule() ||
				   context == grammarAccess.getImplicitContextMappingRule()) {
					sequence_Call(context, (Call) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.CARDINALITY:
				if(context == grammarAccess.getCardinalityRule()) {
					sequence_Cardinality(context, (Cardinality) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.CONCEPT_DEF:
				if(context == grammarAccess.getAnonymousConceptDefRule()) {
					sequence_AnonymousConceptDef(context, (ConceptDef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNamedConceptDefRule()) {
					sequence_NamedConceptDef(context, (ConceptDef) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTopConceptDefRule()) {
					sequence_TopConceptDef(context, (ConceptDef) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.DECLARED_ENTITY:
				if(context == grammarAccess.getImplicitContextMappingRule()) {
					sequence_ImplicitContextMapping(context, (DeclaredEntity) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.EXPR:
				if(context == grammarAccess.getExprRule()) {
					sequence_Expr(context, (Expr) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.FORMAL_PARAM:
				if(context == grammarAccess.getFormalParamRule()) {
					sequence_FormalParam(context, (FormalParam) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.FUNCTION_ASSIGNMENT:
				if(context == grammarAccess.getFunctionAssignmentRule() ||
				   context == grammarAccess.getImplicitContextMappingRule()) {
					sequence_FunctionAssignment(context, (FunctionAssignment) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.INTENT:
				if(context == grammarAccess.getIntentRule()) {
					sequence_Intent(context, (Intent) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.LANGUAGE:
				if(context == grammarAccess.getLanguageRule()) {
					sequence_Language(context, (Language) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.LOCAL_EXPRESSION:
				if(context == grammarAccess.getLocalExpressionRule()) {
					sequence_LocalExpression(context, (LocalExpression) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.MAPPING:
				if(context == grammarAccess.getMappingRule()) {
					sequence_Mapping(context, (Mapping) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.MODULE:
				if(context == grammarAccess.getImplicitContextMappingRule() ||
				   context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.MODULE_NAME:
				if(context == grammarAccess.getImplicitContextMappingRule() ||
				   context == grammarAccess.getModuleNameRule()) {
					sequence_ModuleName(context, (ModuleName) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.PATH_EXPR:
				if(context == grammarAccess.getPathExprRule() ||
				   context == grammarAccess.getPathExprNodeRule() ||
				   context == grammarAccess.getPathExprNodeAccess().getPathExprHeadAction_1_0()) {
					sequence_PathExprNode(context, (PathExpr) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.PATH_EXPR_TERM:
				if(context == grammarAccess.getPathExprRule() ||
				   context == grammarAccess.getPathExprNodeRule() ||
				   context == grammarAccess.getPathExprNodeAccess().getPathExprHeadAction_1_0() ||
				   context == grammarAccess.getPathExprTermRule()) {
					sequence_PathExprTerm(context, (PathExprTerm) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.SUBCONCEPT_OR_ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (SubconceptOrAttribute) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSubconceptOrAttributeRule()) {
					sequence_Attribute_Subconcept_SubconceptOrAttribute(context, (SubconceptOrAttribute) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSubconceptRule()) {
					sequence_Subconcept(context, (SubconceptOrAttribute) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.SUBROUTINE:
				if(context == grammarAccess.getImplicitContextMappingRule() ||
				   context == grammarAccess.getSubroutineRule()) {
					sequence_Subroutine(context, (Subroutine) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.SUBROUTINE_NAME:
				if(context == grammarAccess.getImplicitContextMappingRule() ||
				   context == grammarAccess.getSubroutineNameRule()) {
					sequence_SubroutineName(context, (SubroutineName) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.USES_ENTITY:
				if(context == grammarAccess.getImplicitContextMappingRule() ||
				   context == grammarAccess.getUsesEntityRule()) {
					sequence_UsesEntity(context, (UsesEntity) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.USES_MODULE:
				if(context == grammarAccess.getImplicitContextMappingRule() ||
				   context == grammarAccess.getUsesModuleRule()) {
					sequence_UsesModule(context, (UsesModule) semanticObject); 
					return; 
				}
				else break;
			case CupidPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getImplicitContextMappingRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     keyword=ID
	 */
	protected void sequence_ActualParamByKeyword(EObject context, ActualParamByKeyword semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CupidPackage.Literals.ACTUAL_PARAM_BY_KEYWORD__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CupidPackage.Literals.ACTUAL_PARAM_BY_KEYWORD__KEYWORD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getActualParamByKeywordAccess().getKeywordIDTerminalRuleCall_2_0(), semanticObject.getKeyword());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((keyword=ID optional?='?'?)? value=Expr)
	 */
	protected void sequence_ActualParam(EObject context, ActualParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=ANNOTATION_ID value=STRING?)
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (mapping=Mapping? (annotation+=Annotation* child+=SubconceptOrAttribute*)?)
	 */
	protected void sequence_AnonymousConceptDef(EObject context, ConceptDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         attrib?='attrib' 
	 *         name=ID 
	 *         cardinality=Cardinality? 
	 *         (essential?='!'? | mustBeNull?='!!') 
	 *         attribMapping=Mapping? 
	 *         annotation+=Annotation*
	 *     )
	 */
	protected void sequence_Attribute(EObject context, SubconceptOrAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             name=ID 
	 *             cardinality=Cardinality? 
	 *             (essential?='!'? | mustBeNull?='!!') 
	 *             (def=NamedConceptDef | def=AnonymousConceptDef | (reference?=':' ref=[ConceptDef|ID]))
	 *         ) | 
	 *         (
	 *             attrib?='attrib' 
	 *             name=ID 
	 *             cardinality=Cardinality? 
	 *             (essential?='!'? | mustBeNull?='!!') 
	 *             attribMapping=Mapping? 
	 *             annotation+=Annotation*
	 *         )
	 *     )
	 */
	protected void sequence_Attribute_Subconcept_SubconceptOrAttribute(EObject context, SubconceptOrAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ancestor?='^'
	 */
	protected void sequence_Axis(EObject context, Axis semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CupidPackage.Literals.AXIS__ANCESTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CupidPackage.Literals.AXIS__ANCESTOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAxisAccess().getAncestorCircumflexAccentKeyword_0(), semanticObject.isAncestor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (subroutineName=Expr (params+=ActualParam params+=ActualParam*)?)
	 */
	protected void sequence_Call(EObject context, Call semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (zeroOrOne?='?' | zeroOrMore?='*' | oneOrMore?='+')
	 */
	protected void sequence_Cardinality(EObject context, Cardinality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (wildcard?='*' | expr=LocalExpression | pathExpr=PathExpr)
	 */
	protected void sequence_Expr(EObject context, Expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (intent=Intent? type=Type name=Expr)
	 */
	protected void sequence_FormalParam(EObject context, FormalParam semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=Expr functionName=Expr (params+=ActualParam params+=ActualParam*)?)
	 */
	protected void sequence_FunctionAssignment(EObject context, FunctionAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {DeclaredEntity}
	 */
	protected void sequence_ImplicitContextMapping(EObject context, DeclaredEntity semanticObject) {
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
	 *     (name=ID uri=STRING conceptDef+=TopConceptDef conceptDef+=NamedConceptDef*)
	 */
	protected void sequence_Language(EObject context, Language semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=ID | literal=Literal)
	 */
	protected void sequence_LocalExpression(EObject context, LocalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (context=PathExpr? mapping=ImplicitContextMapping before=PathExpr? after=PathExpr?)
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
	 *     (name=Expr?)
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (named?='concept' name=ID mapping=Mapping? (annotation+=Annotation* child+=SubconceptOrAttribute*)?)
	 */
	protected void sequence_NamedConceptDef(EObject context, ConceptDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (head=PathExprNode_PathExpr_1_0 tail=[SubconceptOrAttribute|ID])
	 */
	protected void sequence_PathExprNode(EObject context, PathExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CupidPackage.Literals.PATH_EXPR__HEAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CupidPackage.Literals.PATH_EXPR__HEAD));
			if(transientValues.isValueTransient(semanticObject, CupidPackage.Literals.PATH_EXPR__TAIL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CupidPackage.Literals.PATH_EXPR__TAIL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPathExprNodeAccess().getPathExprHeadAction_1_0(), semanticObject.getHead());
		feeder.accept(grammarAccess.getPathExprNodeAccess().getTailSubconceptOrAttributeIDTerminalRuleCall_1_2_0_1(), semanticObject.getTail());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (axis=Axis? ref=[SubconceptOrAttribute|ID])
	 */
	protected void sequence_PathExprTerm(EObject context, PathExprTerm semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         cardinality=Cardinality? 
	 *         (essential?='!'? | mustBeNull?='!!') 
	 *         (def=NamedConceptDef | def=AnonymousConceptDef | (reference?=':' ref=[ConceptDef|ID]))
	 *     )
	 */
	protected void sequence_Subconcept(EObject context, SubconceptOrAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Expr?)
	 */
	protected void sequence_SubroutineName(EObject context, SubroutineName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Expr (params+=FormalParam params+=FormalParam*)?)
	 */
	protected void sequence_Subroutine(EObject context, Subroutine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (top?='top' named?='concept' name=ID mapping=Mapping? (annotation+=Annotation* child+=SubconceptOrAttribute*)?)
	 */
	protected void sequence_TopConceptDef(EObject context, ConceptDef semanticObject) {
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
	 *         (derived?='type' derivedType=Expr)
	 *     )
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=Expr
	 */
	protected void sequence_UsesEntity(EObject context, UsesEntity semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CupidPackage.Literals.USES_ENTITY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CupidPackage.Literals.USES_ENTITY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUsesEntityAccess().getNameExprParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Expr
	 */
	protected void sequence_UsesModule(EObject context, UsesModule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CupidPackage.Literals.USES_MODULE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CupidPackage.Literals.USES_MODULE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUsesModuleAccess().getNameExprParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=Type
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CupidPackage.Literals.VARIABLE_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CupidPackage.Literals.VARIABLE_DECLARATION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
}
