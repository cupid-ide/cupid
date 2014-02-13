/*
* generated by Xtext
*/
grammar InternalCupidLanguage;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.earthsystemcurator.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.earthsystemcurator.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.earthsystemcurator.services.CupidLanguageGrammarAccess;

}

@parser::members {
 
 	private CupidLanguageGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(CupidLanguageGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleMappings
entryRuleMappings 
:
{ before(grammarAccess.getMappingsRule()); }
	 ruleMappings
{ after(grammarAccess.getMappingsRule()); } 
	 EOF 
;

// Rule Mappings
ruleMappings
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMappingsAccess().getMappingsAssignment()); }
(rule__Mappings__MappingsAssignment)*
{ after(grammarAccess.getMappingsAccess().getMappingsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMapping
entryRuleMapping 
:
{ before(grammarAccess.getMappingRule()); }
	 ruleMapping
{ after(grammarAccess.getMappingRule()); } 
	 EOF 
;

// Rule Mapping
ruleMapping
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMappingAccess().getGroup()); }
(rule__Mapping__Group__0)
{ after(grammarAccess.getMappingAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleImplicitContextMapping
entryRuleImplicitContextMapping 
:
{ before(grammarAccess.getImplicitContextMappingRule()); }
	 ruleImplicitContextMapping
{ after(grammarAccess.getImplicitContextMappingRule()); } 
	 EOF 
;

// Rule ImplicitContextMapping
ruleImplicitContextMapping
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall()); }
	ruleCall
{ after(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleCall
entryRuleCall 
:
{ before(grammarAccess.getCallRule()); }
	 ruleCall
{ after(grammarAccess.getCallRule()); } 
	 EOF 
;

// Rule Call
ruleCall
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getCallAccess().getGroup()); }
(rule__Call__Group__0)
{ after(grammarAccess.getCallAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleActualParam
entryRuleActualParam 
:
{ before(grammarAccess.getActualParamRule()); }
	 ruleActualParam
{ after(grammarAccess.getActualParamRule()); } 
	 EOF 
;

// Rule ActualParam
ruleActualParam
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getActualParamAccess().getGroup()); }
(rule__ActualParam__Group__0)
{ after(grammarAccess.getActualParamAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleIDOrWildcard
entryRuleIDOrWildcard 
:
{ before(grammarAccess.getIDOrWildcardRule()); }
	 ruleIDOrWildcard
{ after(grammarAccess.getIDOrWildcardRule()); } 
	 EOF 
;

// Rule IDOrWildcard
ruleIDOrWildcard
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIDOrWildcardAccess().getAlternatives()); }
(rule__IDOrWildcard__Alternatives)
{ after(grammarAccess.getIDOrWildcardAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleIDOrPathExpr
entryRuleIDOrPathExpr 
:
{ before(grammarAccess.getIDOrPathExprRule()); }
	 ruleIDOrPathExpr
{ after(grammarAccess.getIDOrPathExprRule()); } 
	 EOF 
;

// Rule IDOrPathExpr
ruleIDOrPathExpr
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIDOrPathExprAccess().getAlternatives()); }
(rule__IDOrPathExpr__Alternatives)
{ after(grammarAccess.getIDOrPathExprAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePathExpr
entryRulePathExpr 
:
{ before(grammarAccess.getPathExprRule()); }
	 rulePathExpr
{ after(grammarAccess.getPathExprRule()); } 
	 EOF 
;

// Rule PathExpr
rulePathExpr
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPathExprAccess().getGroup()); }
(rule__PathExpr__Group__0)
{ after(grammarAccess.getPathExprAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePathSegment
entryRulePathSegment 
:
{ before(grammarAccess.getPathSegmentRule()); }
	 rulePathSegment
{ after(grammarAccess.getPathSegmentRule()); } 
	 EOF 
;

// Rule PathSegment
rulePathSegment
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPathSegmentAccess().getAlternatives()); }
(rule__PathSegment__Alternatives)
{ after(grammarAccess.getPathSegmentAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__IDOrWildcard__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIDOrWildcardAccess().getIdAssignment_0()); }
(rule__IDOrWildcard__IdAssignment_0)
{ after(grammarAccess.getIDOrWildcardAccess().getIdAssignment_0()); }
)

    |(
{ before(grammarAccess.getIDOrWildcardAccess().getWildcardAssignment_1()); }
(rule__IDOrWildcard__WildcardAssignment_1)
{ after(grammarAccess.getIDOrWildcardAccess().getWildcardAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IDOrPathExpr__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIDOrPathExprAccess().getIDOrWildcardParserRuleCall_0()); }
	ruleIDOrWildcard
{ after(grammarAccess.getIDOrPathExprAccess().getIDOrWildcardParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getIDOrPathExprAccess().getPathExprParserRuleCall_1()); }
	rulePathExpr
{ after(grammarAccess.getIDOrPathExprAccess().getPathExprParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PathSegment__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathSegmentAccess().getFullStopFullStopKeyword_0()); }

	'..' 

{ after(grammarAccess.getPathSegmentAccess().getFullStopFullStopKeyword_0()); }
)

    |(
{ before(grammarAccess.getPathSegmentAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
{ after(grammarAccess.getPathSegmentAccess().getIDTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Mapping__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mapping__Group__0__Impl
	rule__Mapping__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getContextAssignment_0()); }
(rule__Mapping__ContextAssignment_0)?
{ after(grammarAccess.getMappingAccess().getContextAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Mapping__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Mapping__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getMappingAssignment_1()); }
(rule__Mapping__MappingAssignment_1)
{ after(grammarAccess.getMappingAccess().getMappingAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Call__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Call__Group__0__Impl
	rule__Call__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Call__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCallAccess().getCallKeyword_0()); }

	'call' 

{ after(grammarAccess.getCallAccess().getCallKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Call__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Call__Group__1__Impl
	rule__Call__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Call__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_1()); }

	'(' 

{ after(grammarAccess.getCallAccess().getLeftParenthesisKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Call__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Call__Group__2__Impl
	rule__Call__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Call__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCallAccess().getSubroutineNameAssignment_2()); }
(rule__Call__SubroutineNameAssignment_2)
{ after(grammarAccess.getCallAccess().getSubroutineNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Call__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Call__Group__3__Impl
	rule__Call__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Call__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCallAccess().getGroup_3()); }
(rule__Call__Group_3__0)?
{ after(grammarAccess.getCallAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Call__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Call__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Call__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCallAccess().getRightParenthesisKeyword_4()); }

	')' 

{ after(grammarAccess.getCallAccess().getRightParenthesisKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Call__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Call__Group_3__0__Impl
	rule__Call__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Call__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_3_0()); }

	'(' 

{ after(grammarAccess.getCallAccess().getLeftParenthesisKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Call__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Call__Group_3__1__Impl
	rule__Call__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Call__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCallAccess().getGroup_3_1()); }
(rule__Call__Group_3_1__0)?
{ after(grammarAccess.getCallAccess().getGroup_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Call__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Call__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Call__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCallAccess().getRightParenthesisKeyword_3_2()); }

	')' 

{ after(grammarAccess.getCallAccess().getRightParenthesisKeyword_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Call__Group_3_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Call__Group_3_1__0__Impl
	rule__Call__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Call__Group_3_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCallAccess().getParamsAssignment_3_1_0()); }
(rule__Call__ParamsAssignment_3_1_0)
{ after(grammarAccess.getCallAccess().getParamsAssignment_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Call__Group_3_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Call__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Call__Group_3_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCallAccess().getGroup_3_1_1()); }
(rule__Call__Group_3_1_1__0)*
{ after(grammarAccess.getCallAccess().getGroup_3_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Call__Group_3_1_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Call__Group_3_1_1__0__Impl
	rule__Call__Group_3_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Call__Group_3_1_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCallAccess().getCommaKeyword_3_1_1_0()); }

	',' 

{ after(grammarAccess.getCallAccess().getCommaKeyword_3_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Call__Group_3_1_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Call__Group_3_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Call__Group_3_1_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCallAccess().getParamsAssignment_3_1_1_1()); }
(rule__Call__ParamsAssignment_3_1_1_1)
{ after(grammarAccess.getCallAccess().getParamsAssignment_3_1_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ActualParam__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ActualParam__Group__0__Impl
	rule__ActualParam__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActualParam__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActualParamAccess().getGroup_0()); }
(rule__ActualParam__Group_0__0)?
{ after(grammarAccess.getActualParamAccess().getGroup_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ActualParam__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ActualParam__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActualParam__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActualParamAccess().getValueAssignment_1()); }
(rule__ActualParam__ValueAssignment_1)
{ after(grammarAccess.getActualParamAccess().getValueAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ActualParam__Group_0__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ActualParam__Group_0__0__Impl
	rule__ActualParam__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActualParam__Group_0__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActualParamAccess().getKeywordAssignment_0_0()); }
(rule__ActualParam__KeywordAssignment_0_0)
{ after(grammarAccess.getActualParamAccess().getKeywordAssignment_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ActualParam__Group_0__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ActualParam__Group_0__1__Impl
	rule__ActualParam__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActualParam__Group_0__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActualParamAccess().getOptionalAssignment_0_1()); }
(rule__ActualParam__OptionalAssignment_0_1)?
{ after(grammarAccess.getActualParamAccess().getOptionalAssignment_0_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ActualParam__Group_0__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ActualParam__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActualParam__Group_0__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActualParamAccess().getEqualsSignKeyword_0_2()); }

	'=' 

{ after(grammarAccess.getActualParamAccess().getEqualsSignKeyword_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__PathExpr__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathExpr__Group__0__Impl
	rule__PathExpr__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpr__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExprAccess().getNumberSignKeyword_0()); }

	'#' 

{ after(grammarAccess.getPathExprAccess().getNumberSignKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PathExpr__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathExpr__Group__1__Impl
	rule__PathExpr__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpr__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExprAccess().getSegmentsAssignment_1()); }
(rule__PathExpr__SegmentsAssignment_1)
{ after(grammarAccess.getPathExprAccess().getSegmentsAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PathExpr__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathExpr__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpr__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExprAccess().getGroup_2()); }
(rule__PathExpr__Group_2__0)*
{ after(grammarAccess.getPathExprAccess().getGroup_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__PathExpr__Group_2__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathExpr__Group_2__0__Impl
	rule__PathExpr__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpr__Group_2__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExprAccess().getSolidusKeyword_2_0()); }

	'/' 

{ after(grammarAccess.getPathExprAccess().getSolidusKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__PathExpr__Group_2__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__PathExpr__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpr__Group_2__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExprAccess().getSegmentsAssignment_2_1()); }
(rule__PathExpr__SegmentsAssignment_2_1)
{ after(grammarAccess.getPathExprAccess().getSegmentsAssignment_2_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Mappings__MappingsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingsAccess().getMappingsMappingParserRuleCall_0()); }
	ruleMapping{ after(grammarAccess.getMappingsAccess().getMappingsMappingParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__ContextAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getContextPathExprParserRuleCall_0_0()); }
	rulePathExpr{ after(grammarAccess.getMappingAccess().getContextPathExprParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Mapping__MappingAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMappingAccess().getMappingImplicitContextMappingParserRuleCall_1_0()); }
	ruleImplicitContextMapping{ after(grammarAccess.getMappingAccess().getMappingImplicitContextMappingParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Call__SubroutineNameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCallAccess().getSubroutineNameIDOrPathExprParserRuleCall_2_0()); }
	ruleIDOrPathExpr{ after(grammarAccess.getCallAccess().getSubroutineNameIDOrPathExprParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Call__ParamsAssignment_3_1_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_0_0()); }
	ruleActualParam{ after(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Call__ParamsAssignment_3_1_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_1_1_0()); }
	ruleActualParam{ after(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ActualParam__KeywordAssignment_0_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActualParamAccess().getKeywordIDTerminalRuleCall_0_0_0()); }
	RULE_ID{ after(grammarAccess.getActualParamAccess().getKeywordIDTerminalRuleCall_0_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ActualParam__OptionalAssignment_0_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0()); }
(
{ before(grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0()); }

	'?' 

{ after(grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0()); }
)

{ after(grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ActualParam__ValueAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getActualParamAccess().getValueIDOrPathExprParserRuleCall_1_0()); }
	ruleIDOrPathExpr{ after(grammarAccess.getActualParamAccess().getValueIDOrPathExprParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IDOrWildcard__IdAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIDOrWildcardAccess().getIdIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getIDOrWildcardAccess().getIdIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IDOrWildcard__WildcardAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIDOrWildcardAccess().getWildcardAsteriskKeyword_1_0()); }
(
{ before(grammarAccess.getIDOrWildcardAccess().getWildcardAsteriskKeyword_1_0()); }

	'*' 

{ after(grammarAccess.getIDOrWildcardAccess().getWildcardAsteriskKeyword_1_0()); }
)

{ after(grammarAccess.getIDOrWildcardAccess().getWildcardAsteriskKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpr__SegmentsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_1_0()); }
	rulePathSegment{ after(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PathExpr__SegmentsAssignment_2_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_2_1_0()); }
	rulePathSegment{ after(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_2_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


