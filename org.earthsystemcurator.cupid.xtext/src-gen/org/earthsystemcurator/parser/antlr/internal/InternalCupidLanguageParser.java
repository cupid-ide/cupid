package org.earthsystemcurator.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.earthsystemcurator.services.CupidLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCupidLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'call'", "'('", "','", "')'", "'?'", "'='", "'*'", "'#'", "'/'", "'..'"
    };
    public static final int T__19=19;
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalCupidLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCupidLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCupidLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g"; }



     	private CupidLanguageGrammarAccess grammarAccess;
     	
        public InternalCupidLanguageParser(TokenStream input, CupidLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Mappings";	
       	}
       	
       	@Override
       	protected CupidLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMappings"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:67:1: entryRuleMappings returns [EObject current=null] : iv_ruleMappings= ruleMappings EOF ;
    public final EObject entryRuleMappings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappings = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:68:2: (iv_ruleMappings= ruleMappings EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:69:2: iv_ruleMappings= ruleMappings EOF
            {
             newCompositeNode(grammarAccess.getMappingsRule()); 
            pushFollow(FOLLOW_ruleMappings_in_entryRuleMappings75);
            iv_ruleMappings=ruleMappings();

            state._fsp--;

             current =iv_ruleMappings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappings85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappings"


    // $ANTLR start "ruleMappings"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:76:1: ruleMappings returns [EObject current=null] : ( (lv_mappings_0_0= ruleMapping ) )* ;
    public final EObject ruleMappings() throws RecognitionException {
        EObject current = null;

        EObject lv_mappings_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:79:28: ( ( (lv_mappings_0_0= ruleMapping ) )* )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:80:1: ( (lv_mappings_0_0= ruleMapping ) )*
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:80:1: ( (lv_mappings_0_0= ruleMapping ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:81:1: (lv_mappings_0_0= ruleMapping )
            	    {
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:81:1: (lv_mappings_0_0= ruleMapping )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:82:3: lv_mappings_0_0= ruleMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingsAccess().getMappingsMappingParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMapping_in_ruleMappings130);
            	    lv_mappings_0_0=ruleMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mappings",
            	            		lv_mappings_0_0, 
            	            		"Mapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappings"


    // $ANTLR start "entryRuleMapping"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:106:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:107:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:108:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping166);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:115:1: ruleMapping returns [EObject current=null] : ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        EObject lv_context_0_0 = null;

        EObject lv_mapping_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:118:28: ( ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:119:1: ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:119:1: ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:119:2: ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:119:2: ( (lv_context_0_0= rulePathExpr ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:120:1: (lv_context_0_0= rulePathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:120:1: (lv_context_0_0= rulePathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:121:3: lv_context_0_0= rulePathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getMappingAccess().getContextPathExprParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePathExpr_in_ruleMapping222);
                    lv_context_0_0=rulePathExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMappingRule());
                    	        }
                           		set(
                           			current, 
                           			"context",
                            		lv_context_0_0, 
                            		"PathExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:137:3: ( (lv_mapping_1_0= ruleImplicitContextMapping ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:138:1: (lv_mapping_1_0= ruleImplicitContextMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:138:1: (lv_mapping_1_0= ruleImplicitContextMapping )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:139:3: lv_mapping_1_0= ruleImplicitContextMapping
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getMappingImplicitContextMappingParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_ruleMapping244);
            lv_mapping_1_0=ruleImplicitContextMapping();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMappingRule());
            	        }
                   		set(
                   			current, 
                   			"mapping",
                    		lv_mapping_1_0, 
                    		"ImplicitContextMapping");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleImplicitContextMapping"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:163:1: entryRuleImplicitContextMapping returns [EObject current=null] : iv_ruleImplicitContextMapping= ruleImplicitContextMapping EOF ;
    public final EObject entryRuleImplicitContextMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitContextMapping = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:164:2: (iv_ruleImplicitContextMapping= ruleImplicitContextMapping EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:165:2: iv_ruleImplicitContextMapping= ruleImplicitContextMapping EOF
            {
             newCompositeNode(grammarAccess.getImplicitContextMappingRule()); 
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_entryRuleImplicitContextMapping280);
            iv_ruleImplicitContextMapping=ruleImplicitContextMapping();

            state._fsp--;

             current =iv_ruleImplicitContextMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitContextMapping290); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplicitContextMapping"


    // $ANTLR start "ruleImplicitContextMapping"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:172:1: ruleImplicitContextMapping returns [EObject current=null] : this_Call_0= ruleCall ;
    public final EObject ruleImplicitContextMapping() throws RecognitionException {
        EObject current = null;

        EObject this_Call_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:175:28: (this_Call_0= ruleCall )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:177:5: this_Call_0= ruleCall
            {
             
                    newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleCall_in_ruleImplicitContextMapping336);
            this_Call_0=ruleCall();

            state._fsp--;

             
                    current = this_Call_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplicitContextMapping"


    // $ANTLR start "entryRuleCall"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:193:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:194:2: (iv_ruleCall= ruleCall EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:195:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall370);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall380); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:202:1: ruleCall returns [EObject current=null] : (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_subroutineName_2_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:205:28: ( (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:206:1: (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:206:1: (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:206:3: otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleCall417); 

                	newLeafNode(otherlv_0, grammarAccess.getCallAccess().getCallKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleCall429); 

                	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:214:1: ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:215:1: (lv_subroutineName_2_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:215:1: (lv_subroutineName_2_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:216:3: lv_subroutineName_2_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getSubroutineNameIDOrPathExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleCall450);
            lv_subroutineName_2_0=ruleIDOrPathExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCallRule());
            	        }
                   		set(
                   			current, 
                   			"subroutineName",
                    		lv_subroutineName_2_0, 
                    		"IDOrPathExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:232:2: (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:232:4: otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleCall463); 

                        	newLeafNode(otherlv_3, grammarAccess.getCallAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:236:1: ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID||(LA4_0>=17 && LA4_0<=18)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:236:2: ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )*
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:236:2: ( (lv_params_4_0= ruleActualParam ) )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:237:1: (lv_params_4_0= ruleActualParam )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:237:1: (lv_params_4_0= ruleActualParam )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:238:3: lv_params_4_0= ruleActualParam
                            {
                             
                            	        newCompositeNode(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleActualParam_in_ruleCall485);
                            lv_params_4_0=ruleActualParam();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getCallRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"params",
                                    		lv_params_4_0, 
                                    		"ActualParam");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:254:2: (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==13) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:254:4: otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) )
                            	    {
                            	    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleCall498); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getCallAccess().getCommaKeyword_3_1_1_0());
                            	        
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:258:1: ( (lv_params_6_0= ruleActualParam ) )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:259:1: (lv_params_6_0= ruleActualParam )
                            	    {
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:259:1: (lv_params_6_0= ruleActualParam )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:260:3: lv_params_6_0= ruleActualParam
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleActualParam_in_ruleCall519);
                            	    lv_params_6_0=ruleActualParam();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getCallRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"params",
                            	            		lv_params_6_0, 
                            	            		"ActualParam");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleCall535); 

                        	newLeafNode(otherlv_7, grammarAccess.getCallAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleCall549); 

                	newLeafNode(otherlv_8, grammarAccess.getCallAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleActualParam"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:292:1: entryRuleActualParam returns [EObject current=null] : iv_ruleActualParam= ruleActualParam EOF ;
    public final EObject entryRuleActualParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualParam = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:293:2: (iv_ruleActualParam= ruleActualParam EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:294:2: iv_ruleActualParam= ruleActualParam EOF
            {
             newCompositeNode(grammarAccess.getActualParamRule()); 
            pushFollow(FOLLOW_ruleActualParam_in_entryRuleActualParam585);
            iv_ruleActualParam=ruleActualParam();

            state._fsp--;

             current =iv_ruleActualParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualParam595); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActualParam"


    // $ANTLR start "ruleActualParam"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:301:1: ruleActualParam returns [EObject current=null] : ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) ) ) ;
    public final EObject ruleActualParam() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:304:28: ( ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:305:1: ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:305:1: ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:305:2: ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:305:2: ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>=15 && LA7_1<=16)) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:305:3: ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '='
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:305:3: ( (lv_keyword_0_0= RULE_ID ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:306:1: (lv_keyword_0_0= RULE_ID )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:306:1: (lv_keyword_0_0= RULE_ID )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:307:3: lv_keyword_0_0= RULE_ID
                    {
                    lv_keyword_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActualParam638); 

                    			newLeafNode(lv_keyword_0_0, grammarAccess.getActualParamAccess().getKeywordIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActualParamRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"keyword",
                            		lv_keyword_0_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:323:2: ( (lv_optional_1_0= '?' ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==15) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:324:1: (lv_optional_1_0= '?' )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:324:1: (lv_optional_1_0= '?' )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:325:3: lv_optional_1_0= '?'
                            {
                            lv_optional_1_0=(Token)match(input,15,FOLLOW_15_in_ruleActualParam661); 

                                    newLeafNode(lv_optional_1_0, grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActualParamRule());
                            	        }
                                   		setWithLastConsumed(current, "optional", true, "?");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleActualParam687); 

                        	newLeafNode(otherlv_2, grammarAccess.getActualParamAccess().getEqualsSignKeyword_0_2());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:342:3: ( (lv_value_3_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:343:1: (lv_value_3_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:343:1: (lv_value_3_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:344:3: lv_value_3_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getActualParamAccess().getValueIDOrPathExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleActualParam710);
            lv_value_3_0=ruleIDOrPathExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActualParamRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"IDOrPathExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActualParam"


    // $ANTLR start "entryRuleIDOrWildcard"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:368:1: entryRuleIDOrWildcard returns [EObject current=null] : iv_ruleIDOrWildcard= ruleIDOrWildcard EOF ;
    public final EObject entryRuleIDOrWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDOrWildcard = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:369:2: (iv_ruleIDOrWildcard= ruleIDOrWildcard EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:370:2: iv_ruleIDOrWildcard= ruleIDOrWildcard EOF
            {
             newCompositeNode(grammarAccess.getIDOrWildcardRule()); 
            pushFollow(FOLLOW_ruleIDOrWildcard_in_entryRuleIDOrWildcard746);
            iv_ruleIDOrWildcard=ruleIDOrWildcard();

            state._fsp--;

             current =iv_ruleIDOrWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrWildcard756); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDOrWildcard"


    // $ANTLR start "ruleIDOrWildcard"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:377:1: ruleIDOrWildcard returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_wildcard_1_0= '*' ) ) ) ;
    public final EObject ruleIDOrWildcard() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_wildcard_1_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:380:28: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_wildcard_1_0= '*' ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:381:1: ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_wildcard_1_0= '*' ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:381:1: ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_wildcard_1_0= '*' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:381:2: ( (lv_id_0_0= RULE_ID ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:381:2: ( (lv_id_0_0= RULE_ID ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:382:1: (lv_id_0_0= RULE_ID )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:382:1: (lv_id_0_0= RULE_ID )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:383:3: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDOrWildcard798); 

                    			newLeafNode(lv_id_0_0, grammarAccess.getIDOrWildcardAccess().getIdIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIDOrWildcardRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:400:6: ( (lv_wildcard_1_0= '*' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:400:6: ( (lv_wildcard_1_0= '*' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:401:1: (lv_wildcard_1_0= '*' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:401:1: (lv_wildcard_1_0= '*' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:402:3: lv_wildcard_1_0= '*'
                    {
                    lv_wildcard_1_0=(Token)match(input,17,FOLLOW_17_in_ruleIDOrWildcard827); 

                            newLeafNode(lv_wildcard_1_0, grammarAccess.getIDOrWildcardAccess().getWildcardAsteriskKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIDOrWildcardRule());
                    	        }
                           		setWithLastConsumed(current, "wildcard", true, "*");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDOrWildcard"


    // $ANTLR start "entryRuleIDOrPathExpr"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:423:1: entryRuleIDOrPathExpr returns [EObject current=null] : iv_ruleIDOrPathExpr= ruleIDOrPathExpr EOF ;
    public final EObject entryRuleIDOrPathExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDOrPathExpr = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:424:2: (iv_ruleIDOrPathExpr= ruleIDOrPathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:425:2: iv_ruleIDOrPathExpr= ruleIDOrPathExpr EOF
            {
             newCompositeNode(grammarAccess.getIDOrPathExprRule()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_entryRuleIDOrPathExpr876);
            iv_ruleIDOrPathExpr=ruleIDOrPathExpr();

            state._fsp--;

             current =iv_ruleIDOrPathExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrPathExpr886); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDOrPathExpr"


    // $ANTLR start "ruleIDOrPathExpr"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:432:1: ruleIDOrPathExpr returns [EObject current=null] : (this_IDOrWildcard_0= ruleIDOrWildcard | this_PathExpr_1= rulePathExpr ) ;
    public final EObject ruleIDOrPathExpr() throws RecognitionException {
        EObject current = null;

        EObject this_IDOrWildcard_0 = null;

        EObject this_PathExpr_1 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:435:28: ( (this_IDOrWildcard_0= ruleIDOrWildcard | this_PathExpr_1= rulePathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:436:1: (this_IDOrWildcard_0= ruleIDOrWildcard | this_PathExpr_1= rulePathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:436:1: (this_IDOrWildcard_0= ruleIDOrWildcard | this_PathExpr_1= rulePathExpr )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==17) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:437:5: this_IDOrWildcard_0= ruleIDOrWildcard
                    {
                     
                            newCompositeNode(grammarAccess.getIDOrPathExprAccess().getIDOrWildcardParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIDOrWildcard_in_ruleIDOrPathExpr933);
                    this_IDOrWildcard_0=ruleIDOrWildcard();

                    state._fsp--;

                     
                            current = this_IDOrWildcard_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:447:5: this_PathExpr_1= rulePathExpr
                    {
                     
                            newCompositeNode(grammarAccess.getIDOrPathExprAccess().getPathExprParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePathExpr_in_ruleIDOrPathExpr960);
                    this_PathExpr_1=rulePathExpr();

                    state._fsp--;

                     
                            current = this_PathExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDOrPathExpr"


    // $ANTLR start "entryRulePathExpr"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:463:1: entryRulePathExpr returns [EObject current=null] : iv_rulePathExpr= rulePathExpr EOF ;
    public final EObject entryRulePathExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExpr = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:464:2: (iv_rulePathExpr= rulePathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:465:2: iv_rulePathExpr= rulePathExpr EOF
            {
             newCompositeNode(grammarAccess.getPathExprRule()); 
            pushFollow(FOLLOW_rulePathExpr_in_entryRulePathExpr995);
            iv_rulePathExpr=rulePathExpr();

            state._fsp--;

             current =iv_rulePathExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExpr1005); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathExpr"


    // $ANTLR start "rulePathExpr"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:472:1: rulePathExpr returns [EObject current=null] : (otherlv_0= '#' ( (lv_segments_1_0= rulePathSegment ) ) (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )* ) ;
    public final EObject rulePathExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_segments_1_0 = null;

        AntlrDatatypeRuleToken lv_segments_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:475:28: ( (otherlv_0= '#' ( (lv_segments_1_0= rulePathSegment ) ) (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )* ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:476:1: (otherlv_0= '#' ( (lv_segments_1_0= rulePathSegment ) ) (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )* )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:476:1: (otherlv_0= '#' ( (lv_segments_1_0= rulePathSegment ) ) (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )* )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:476:3: otherlv_0= '#' ( (lv_segments_1_0= rulePathSegment ) ) (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )*
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulePathExpr1042); 

                	newLeafNode(otherlv_0, grammarAccess.getPathExprAccess().getNumberSignKeyword_0());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:480:1: ( (lv_segments_1_0= rulePathSegment ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:481:1: (lv_segments_1_0= rulePathSegment )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:481:1: (lv_segments_1_0= rulePathSegment )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:482:3: lv_segments_1_0= rulePathSegment
            {
             
            	        newCompositeNode(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePathSegment_in_rulePathExpr1063);
            lv_segments_1_0=rulePathSegment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPathExprRule());
            	        }
                   		add(
                   			current, 
                   			"segments",
                    		lv_segments_1_0, 
                    		"PathSegment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:498:2: (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:498:4: otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_rulePathExpr1076); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPathExprAccess().getSolidusKeyword_2_0());
            	        
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:502:1: ( (lv_segments_3_0= rulePathSegment ) )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:503:1: (lv_segments_3_0= rulePathSegment )
            	    {
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:503:1: (lv_segments_3_0= rulePathSegment )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:504:3: lv_segments_3_0= rulePathSegment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePathSegment_in_rulePathExpr1097);
            	    lv_segments_3_0=rulePathSegment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPathExprRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"segments",
            	            		lv_segments_3_0, 
            	            		"PathSegment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathExpr"


    // $ANTLR start "entryRulePathSegment"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:528:1: entryRulePathSegment returns [String current=null] : iv_rulePathSegment= rulePathSegment EOF ;
    public final String entryRulePathSegment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePathSegment = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:529:2: (iv_rulePathSegment= rulePathSegment EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:530:2: iv_rulePathSegment= rulePathSegment EOF
            {
             newCompositeNode(grammarAccess.getPathSegmentRule()); 
            pushFollow(FOLLOW_rulePathSegment_in_entryRulePathSegment1136);
            iv_rulePathSegment=rulePathSegment();

            state._fsp--;

             current =iv_rulePathSegment.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathSegment1147); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePathSegment"


    // $ANTLR start "rulePathSegment"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:537:1: rulePathSegment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '..' | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken rulePathSegment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:540:28: ( (kw= '..' | this_ID_1= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:541:1: (kw= '..' | this_ID_1= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:541:1: (kw= '..' | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:542:2: kw= '..'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_rulePathSegment1185); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPathSegmentAccess().getFullStopFullStopKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:548:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathSegment1206); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getPathSegmentAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePathSegment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMappings_in_entryRuleMappings75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappings85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleMappings130 = new BitSet(new long[]{0x0000000000040802L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_ruleMapping222 = new BitSet(new long[]{0x0000000000040800L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_ruleMapping244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_entryRuleImplicitContextMapping280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitContextMapping290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleImplicitContextMapping336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleCall417 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleCall429 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleCall450 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_12_in_ruleCall463 = new BitSet(new long[]{0x0000000000064010L});
    public static final BitSet FOLLOW_ruleActualParam_in_ruleCall485 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_ruleCall498 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_ruleActualParam_in_ruleCall519 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_14_in_ruleCall535 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCall549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_entryRuleActualParam585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualParam595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActualParam638 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleActualParam661 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleActualParam687 = new BitSet(new long[]{0x0000000000060010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleActualParam710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrWildcard_in_entryRuleIDOrWildcard746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrWildcard756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDOrWildcard798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleIDOrWildcard827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_entryRuleIDOrPathExpr876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrPathExpr886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrWildcard_in_ruleIDOrPathExpr933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_ruleIDOrPathExpr960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_entryRulePathExpr995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExpr1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePathExpr1042 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rulePathSegment_in_rulePathExpr1063 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_rulePathExpr1076 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_rulePathSegment_in_rulePathExpr1097 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rulePathSegment_in_entryRulePathSegment1136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathSegment1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rulePathSegment1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathSegment1206 = new BitSet(new long[]{0x0000000000000002L});

}