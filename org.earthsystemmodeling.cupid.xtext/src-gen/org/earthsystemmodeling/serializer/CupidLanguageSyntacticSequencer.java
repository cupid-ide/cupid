package org.earthsystemmodeling.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.earthsystemmodeling.services.CupidLanguageGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CupidLanguageSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CupidLanguageGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AnonymousConceptDef___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_3__q;
	protected AbstractElementAlias match_Attribute___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q;
	protected AbstractElementAlias match_Call___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_FunctionAssignment___LeftParenthesisKeyword_5_0_RightParenthesisKeyword_5_2__q;
	protected AbstractElementAlias match_NamedConceptDef___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_3__q;
	protected AbstractElementAlias match_Subroutine___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_TopConceptDef___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_3__q;
	protected AbstractElementAlias match_Type_PrecisionKeyword_4_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CupidLanguageGrammarAccess) access;
		match_AnonymousConceptDef___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAnonymousConceptDefAccess().getLeftCurlyBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getAnonymousConceptDefAccess().getRightCurlyBracketKeyword_2_3()));
		match_Attribute___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2()));
		match_Call___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCallAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getCallAccess().getRightParenthesisKeyword_3_2()));
		match_FunctionAssignment___LeftParenthesisKeyword_5_0_RightParenthesisKeyword_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFunctionAssignmentAccess().getLeftParenthesisKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getFunctionAssignmentAccess().getRightParenthesisKeyword_5_2()));
		match_NamedConceptDef___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNamedConceptDefAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getNamedConceptDefAccess().getRightCurlyBracketKeyword_3_3()));
		match_Subroutine___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_3_2()));
		match_TopConceptDef___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTopConceptDefAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getTopConceptDefAccess().getRightCurlyBracketKeyword_4_3()));
		match_Type_PrecisionKeyword_4_1_q = new TokenAlias(false, true, grammarAccess.getTypeAccess().getPrecisionKeyword_4_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getDeclaredEntityRule())
			return getDeclaredEntityToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * DeclaredEntity:
	 * 	'declaredEntity';
	 */
	protected String getDeclaredEntityToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "declaredEntity";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AnonymousConceptDef___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_3__q.equals(syntax))
				emit_AnonymousConceptDef___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Attribute___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q.equals(syntax))
				emit_Attribute___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_Call___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionAssignment___LeftParenthesisKeyword_5_0_RightParenthesisKeyword_5_2__q.equals(syntax))
				emit_FunctionAssignment___LeftParenthesisKeyword_5_0_RightParenthesisKeyword_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NamedConceptDef___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_3__q.equals(syntax))
				emit_NamedConceptDef___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Subroutine___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_Subroutine___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TopConceptDef___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_3__q.equals(syntax))
				emit_TopConceptDef___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Type_PrecisionKeyword_4_1_q.equals(syntax))
				emit_Type_PrecisionKeyword_4_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_AnonymousConceptDef___LeftCurlyBracketKeyword_2_0_RightCurlyBracketKeyword_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_Attribute___LeftCurlyBracketKeyword_5_0_RightCurlyBracketKeyword_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_Call___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_FunctionAssignment___LeftParenthesisKeyword_5_0_RightParenthesisKeyword_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_NamedConceptDef___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_Subroutine___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}')?
	 */
	protected void emit_TopConceptDef___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'precision'?
	 */
	protected void emit_Type_PrecisionKeyword_4_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
