package org.earthsystemcurator.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.earthsystemcurator.cupidLanguage.ActualParam;
import org.earthsystemcurator.cupidLanguage.Call;
import org.earthsystemcurator.cupidLanguage.CupidLanguagePackage;
import org.earthsystemcurator.cupidLanguage.IDOrWildcard;
import org.earthsystemcurator.cupidLanguage.Mapping;
import org.earthsystemcurator.cupidLanguage.Mappings;
import org.earthsystemcurator.cupidLanguage.PathExpr;
import org.earthsystemcurator.services.CupidLanguageGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

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
			case CupidLanguagePackage.CALL:
				if(context == grammarAccess.getCallRule() ||
				   context == grammarAccess.getImplicitContextMappingRule()) {
					sequence_Call(context, (Call) semanticObject); 
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
			case CupidLanguagePackage.MAPPING:
				if(context == grammarAccess.getMappingRule()) {
					sequence_Mapping(context, (Mapping) semanticObject); 
					return; 
				}
				else break;
			case CupidLanguagePackage.MAPPINGS:
				if(context == grammarAccess.getMappingsRule()) {
					sequence_Mappings(context, (Mappings) semanticObject); 
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
	 *     (subroutineName=IDOrPathExpr (params+=ActualParam params+=ActualParam*)?)
	 */
	protected void sequence_Call(EObject context, Call semanticObject) {
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
	 *     (context=PathExpr? mapping=ImplicitContextMapping)
	 */
	protected void sequence_Mapping(EObject context, Mapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     mappings+=Mapping*
	 */
	protected void sequence_Mappings(EObject context, Mappings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (segments+=PathSegment segments+=PathSegment*)
	 */
	protected void sequence_PathExpr(EObject context, PathExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
