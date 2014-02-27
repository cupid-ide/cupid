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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'language '", "'{'", "'}'", "'attrib'", "'!'", "':'", "'<'", "'>'", "'['", "','", "']'", "'='", "'top'", "'concept'", "'*'", "'+'", "'module'", "'('", "')'", "'moduleName'", "'usesModule'", "'usesEntity'", "'subroutine'", "'in'", "'out'", "'inout'", "'integer'", "'character'", "'logical'", "'real'", "'double'", "'precision'", "'type'", "'subroutineName'", "'call'", "'?'", "'#'", "'/'", "'..'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

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
        	return "Language";	
       	}
       	
       	@Override
       	protected CupidLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLanguage"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:67:1: entryRuleLanguage returns [EObject current=null] : iv_ruleLanguage= ruleLanguage EOF ;
    public final EObject entryRuleLanguage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguage = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:68:2: (iv_ruleLanguage= ruleLanguage EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:69:2: iv_ruleLanguage= ruleLanguage EOF
            {
             newCompositeNode(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage75);
            iv_ruleLanguage=ruleLanguage();

            state._fsp--;

             current =iv_ruleLanguage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage85); 

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
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:76:1: ruleLanguage returns [EObject current=null] : (otherlv_0= 'language ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_conceptDef_4_0= ruleConceptDef ) )+ otherlv_5= '}' ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_uri_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_conceptDef_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:79:28: ( (otherlv_0= 'language ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_conceptDef_4_0= ruleConceptDef ) )+ otherlv_5= '}' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:80:1: (otherlv_0= 'language ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_conceptDef_4_0= ruleConceptDef ) )+ otherlv_5= '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:80:1: (otherlv_0= 'language ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_conceptDef_4_0= ruleConceptDef ) )+ otherlv_5= '}' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:80:3: otherlv_0= 'language ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_conceptDef_4_0= ruleConceptDef ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleLanguage122); 

                	newLeafNode(otherlv_0, grammarAccess.getLanguageAccess().getLanguageKeyword_0());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLanguage139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLanguageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:102:2: ( (lv_uri_2_0= RULE_STRING ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:103:1: (lv_uri_2_0= RULE_STRING )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:103:1: (lv_uri_2_0= RULE_STRING )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:104:3: lv_uri_2_0= RULE_STRING
            {
            lv_uri_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLanguage161); 

            			newLeafNode(lv_uri_2_0, grammarAccess.getLanguageAccess().getUriSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLanguageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"uri",
                    		lv_uri_2_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleLanguage178); 

                	newLeafNode(otherlv_3, grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:124:1: ( (lv_conceptDef_4_0= ruleConceptDef ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=23 && LA1_0<=24)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:125:1: (lv_conceptDef_4_0= ruleConceptDef )
            	    {
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:125:1: (lv_conceptDef_4_0= ruleConceptDef )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:126:3: lv_conceptDef_4_0= ruleConceptDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLanguageAccess().getConceptDefConceptDefParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConceptDef_in_ruleLanguage199);
            	    lv_conceptDef_4_0=ruleConceptDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLanguageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conceptDef",
            	            		lv_conceptDef_4_0, 
            	            		"ConceptDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleLanguage212); 

                	newLeafNode(otherlv_5, grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleSubconcept"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:154:1: entryRuleSubconcept returns [EObject current=null] : iv_ruleSubconcept= ruleSubconcept EOF ;
    public final EObject entryRuleSubconcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubconcept = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:155:2: (iv_ruleSubconcept= ruleSubconcept EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:156:2: iv_ruleSubconcept= ruleSubconcept EOF
            {
             newCompositeNode(grammarAccess.getSubconceptRule()); 
            pushFollow(FOLLOW_ruleSubconcept_in_entryRuleSubconcept248);
            iv_ruleSubconcept=ruleSubconcept();

            state._fsp--;

             current =iv_ruleSubconcept; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubconcept258); 

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
    // $ANTLR end "entryRuleSubconcept"


    // $ANTLR start "ruleSubconcept"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:163:1: ruleSubconcept returns [EObject current=null] : ( ( (lv_attrib_0_0= 'attrib' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_essential_3_0= '!' ) )? ( ( ( (lv_ref_4_0= ':' ) ) ( (otherlv_5= RULE_ID ) ) ) | ( (otherlv_6= '<' ( (lv_mapping_7_0= ruleMapping ) ) otherlv_8= '>' )? (otherlv_9= '[' ( (lv_annotation_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotation_12_0= ruleAnnotation ) ) )* otherlv_13= ']' )? ( (lv_body_14_0= ruleConceptDefBody ) )? ) ) ) ;
    public final EObject ruleSubconcept() throws RecognitionException {
        EObject current = null;

        Token lv_attrib_0_0=null;
        Token lv_name_1_0=null;
        Token lv_essential_3_0=null;
        Token lv_ref_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_cardinality_2_0 = null;

        EObject lv_mapping_7_0 = null;

        EObject lv_annotation_10_0 = null;

        EObject lv_annotation_12_0 = null;

        EObject lv_body_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:166:28: ( ( ( (lv_attrib_0_0= 'attrib' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_essential_3_0= '!' ) )? ( ( ( (lv_ref_4_0= ':' ) ) ( (otherlv_5= RULE_ID ) ) ) | ( (otherlv_6= '<' ( (lv_mapping_7_0= ruleMapping ) ) otherlv_8= '>' )? (otherlv_9= '[' ( (lv_annotation_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotation_12_0= ruleAnnotation ) ) )* otherlv_13= ']' )? ( (lv_body_14_0= ruleConceptDefBody ) )? ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:167:1: ( ( (lv_attrib_0_0= 'attrib' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_essential_3_0= '!' ) )? ( ( ( (lv_ref_4_0= ':' ) ) ( (otherlv_5= RULE_ID ) ) ) | ( (otherlv_6= '<' ( (lv_mapping_7_0= ruleMapping ) ) otherlv_8= '>' )? (otherlv_9= '[' ( (lv_annotation_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotation_12_0= ruleAnnotation ) ) )* otherlv_13= ']' )? ( (lv_body_14_0= ruleConceptDefBody ) )? ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:167:1: ( ( (lv_attrib_0_0= 'attrib' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_essential_3_0= '!' ) )? ( ( ( (lv_ref_4_0= ':' ) ) ( (otherlv_5= RULE_ID ) ) ) | ( (otherlv_6= '<' ( (lv_mapping_7_0= ruleMapping ) ) otherlv_8= '>' )? (otherlv_9= '[' ( (lv_annotation_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotation_12_0= ruleAnnotation ) ) )* otherlv_13= ']' )? ( (lv_body_14_0= ruleConceptDefBody ) )? ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:167:2: ( (lv_attrib_0_0= 'attrib' ) )? ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_essential_3_0= '!' ) )? ( ( ( (lv_ref_4_0= ':' ) ) ( (otherlv_5= RULE_ID ) ) ) | ( (otherlv_6= '<' ( (lv_mapping_7_0= ruleMapping ) ) otherlv_8= '>' )? (otherlv_9= '[' ( (lv_annotation_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotation_12_0= ruleAnnotation ) ) )* otherlv_13= ']' )? ( (lv_body_14_0= ruleConceptDefBody ) )? ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:167:2: ( (lv_attrib_0_0= 'attrib' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:168:1: (lv_attrib_0_0= 'attrib' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:168:1: (lv_attrib_0_0= 'attrib' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:169:3: lv_attrib_0_0= 'attrib'
                    {
                    lv_attrib_0_0=(Token)match(input,14,FOLLOW_14_in_ruleSubconcept301); 

                            newLeafNode(lv_attrib_0_0, grammarAccess.getSubconceptAccess().getAttribAttribKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubconceptRule());
                    	        }
                           		setWithLastConsumed(current, "attrib", true, "attrib");
                    	    

                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:182:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:183:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:183:1: (lv_name_1_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:184:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubconcept332); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSubconceptAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubconceptRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:200:2: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=25 && LA3_0<=26)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:201:1: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:201:1: (lv_cardinality_2_0= ruleCardinality )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:202:3: lv_cardinality_2_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubconceptAccess().getCardinalityCardinalityParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleSubconcept358);
                    lv_cardinality_2_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubconceptRule());
                    	        }
                           		set(
                           			current, 
                           			"cardinality",
                            		lv_cardinality_2_0, 
                            		"Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:218:3: ( (lv_essential_3_0= '!' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:219:1: (lv_essential_3_0= '!' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:219:1: (lv_essential_3_0= '!' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:220:3: lv_essential_3_0= '!'
                    {
                    lv_essential_3_0=(Token)match(input,15,FOLLOW_15_in_ruleSubconcept377); 

                            newLeafNode(lv_essential_3_0, grammarAccess.getSubconceptAccess().getEssentialExclamationMarkKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubconceptRule());
                    	        }
                           		setWithLastConsumed(current, "essential", true, "!");
                    	    

                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:233:3: ( ( ( (lv_ref_4_0= ':' ) ) ( (otherlv_5= RULE_ID ) ) ) | ( (otherlv_6= '<' ( (lv_mapping_7_0= ruleMapping ) ) otherlv_8= '>' )? (otherlv_9= '[' ( (lv_annotation_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotation_12_0= ruleAnnotation ) ) )* otherlv_13= ']' )? ( (lv_body_14_0= ruleConceptDefBody ) )? ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==EOF||(LA9_0>=12 && LA9_0<=13)||LA9_0==17||(LA9_0>=19 && LA9_0<=20)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:233:4: ( ( (lv_ref_4_0= ':' ) ) ( (otherlv_5= RULE_ID ) ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:233:4: ( ( (lv_ref_4_0= ':' ) ) ( (otherlv_5= RULE_ID ) ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:233:5: ( (lv_ref_4_0= ':' ) ) ( (otherlv_5= RULE_ID ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:233:5: ( (lv_ref_4_0= ':' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:234:1: (lv_ref_4_0= ':' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:234:1: (lv_ref_4_0= ':' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:235:3: lv_ref_4_0= ':'
                    {
                    lv_ref_4_0=(Token)match(input,16,FOLLOW_16_in_ruleSubconcept411); 

                            newLeafNode(lv_ref_4_0, grammarAccess.getSubconceptAccess().getRefColonKeyword_4_0_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubconceptRule());
                    	        }
                           		setWithLastConsumed(current, "ref", true, ":");
                    	    

                    }


                    }

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:248:2: ( (otherlv_5= RULE_ID ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:249:1: (otherlv_5= RULE_ID )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:249:1: (otherlv_5= RULE_ID )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:250:3: otherlv_5= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubconceptRule());
                    	        }
                            
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubconcept444); 

                    		newLeafNode(otherlv_5, grammarAccess.getSubconceptAccess().getConceptDefConceptDefCrossReference_4_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:262:6: ( (otherlv_6= '<' ( (lv_mapping_7_0= ruleMapping ) ) otherlv_8= '>' )? (otherlv_9= '[' ( (lv_annotation_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotation_12_0= ruleAnnotation ) ) )* otherlv_13= ']' )? ( (lv_body_14_0= ruleConceptDefBody ) )? )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:262:6: ( (otherlv_6= '<' ( (lv_mapping_7_0= ruleMapping ) ) otherlv_8= '>' )? (otherlv_9= '[' ( (lv_annotation_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotation_12_0= ruleAnnotation ) ) )* otherlv_13= ']' )? ( (lv_body_14_0= ruleConceptDefBody ) )? )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:262:7: (otherlv_6= '<' ( (lv_mapping_7_0= ruleMapping ) ) otherlv_8= '>' )? (otherlv_9= '[' ( (lv_annotation_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotation_12_0= ruleAnnotation ) ) )* otherlv_13= ']' )? ( (lv_body_14_0= ruleConceptDefBody ) )?
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:262:7: (otherlv_6= '<' ( (lv_mapping_7_0= ruleMapping ) ) otherlv_8= '>' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==17) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:262:9: otherlv_6= '<' ( (lv_mapping_7_0= ruleMapping ) ) otherlv_8= '>'
                            {
                            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleSubconcept465); 

                                	newLeafNode(otherlv_6, grammarAccess.getSubconceptAccess().getLessThanSignKeyword_4_1_0_0());
                                
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:266:1: ( (lv_mapping_7_0= ruleMapping ) )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:267:1: (lv_mapping_7_0= ruleMapping )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:267:1: (lv_mapping_7_0= ruleMapping )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:268:3: lv_mapping_7_0= ruleMapping
                            {
                             
                            	        newCompositeNode(grammarAccess.getSubconceptAccess().getMappingMappingParserRuleCall_4_1_0_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleMapping_in_ruleSubconcept486);
                            lv_mapping_7_0=ruleMapping();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSubconceptRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"mapping",
                                    		lv_mapping_7_0, 
                                    		"Mapping");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleSubconcept498); 

                                	newLeafNode(otherlv_8, grammarAccess.getSubconceptAccess().getGreaterThanSignKeyword_4_1_0_2());
                                

                            }
                            break;

                    }

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:288:3: (otherlv_9= '[' ( (lv_annotation_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotation_12_0= ruleAnnotation ) ) )* otherlv_13= ']' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==19) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:288:5: otherlv_9= '[' ( (lv_annotation_10_0= ruleAnnotation ) ) (otherlv_11= ',' ( (lv_annotation_12_0= ruleAnnotation ) ) )* otherlv_13= ']'
                            {
                            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleSubconcept513); 

                                	newLeafNode(otherlv_9, grammarAccess.getSubconceptAccess().getLeftSquareBracketKeyword_4_1_1_0());
                                
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:292:1: ( (lv_annotation_10_0= ruleAnnotation ) )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:293:1: (lv_annotation_10_0= ruleAnnotation )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:293:1: (lv_annotation_10_0= ruleAnnotation )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:294:3: lv_annotation_10_0= ruleAnnotation
                            {
                             
                            	        newCompositeNode(grammarAccess.getSubconceptAccess().getAnnotationAnnotationParserRuleCall_4_1_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAnnotation_in_ruleSubconcept534);
                            lv_annotation_10_0=ruleAnnotation();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSubconceptRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"annotation",
                                    		lv_annotation_10_0, 
                                    		"Annotation");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:310:2: (otherlv_11= ',' ( (lv_annotation_12_0= ruleAnnotation ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==20) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:310:4: otherlv_11= ',' ( (lv_annotation_12_0= ruleAnnotation ) )
                            	    {
                            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleSubconcept547); 

                            	        	newLeafNode(otherlv_11, grammarAccess.getSubconceptAccess().getCommaKeyword_4_1_1_2_0());
                            	        
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:314:1: ( (lv_annotation_12_0= ruleAnnotation ) )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:315:1: (lv_annotation_12_0= ruleAnnotation )
                            	    {
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:315:1: (lv_annotation_12_0= ruleAnnotation )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:316:3: lv_annotation_12_0= ruleAnnotation
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSubconceptAccess().getAnnotationAnnotationParserRuleCall_4_1_1_2_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleSubconcept568);
                            	    lv_annotation_12_0=ruleAnnotation();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getSubconceptRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"annotation",
                            	            		lv_annotation_12_0, 
                            	            		"Annotation");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);

                            otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleSubconcept582); 

                                	newLeafNode(otherlv_13, grammarAccess.getSubconceptAccess().getRightSquareBracketKeyword_4_1_1_3());
                                

                            }
                            break;

                    }

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:336:3: ( (lv_body_14_0= ruleConceptDefBody ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==12) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:337:1: (lv_body_14_0= ruleConceptDefBody )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:337:1: (lv_body_14_0= ruleConceptDefBody )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:338:3: lv_body_14_0= ruleConceptDefBody
                            {
                             
                            	        newCompositeNode(grammarAccess.getSubconceptAccess().getBodyConceptDefBodyParserRuleCall_4_1_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleConceptDefBody_in_ruleSubconcept605);
                            lv_body_14_0=ruleConceptDefBody();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSubconceptRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"body",
                                    		lv_body_14_0, 
                                    		"ConceptDefBody");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleSubconcept"


    // $ANTLR start "entryRuleAnnotation"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:362:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:363:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:364:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation644);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation654); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:371:1: ruleAnnotation returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:374:28: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:375:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:375:1: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:375:2: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:375:2: ( (lv_key_0_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:376:1: (lv_key_0_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:376:1: (lv_key_0_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:377:3: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotation696); 

            			newLeafNode(lv_key_0_0, grammarAccess.getAnnotationAccess().getKeyIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAnnotation713); 

                	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getEqualsSignKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:397:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:398:1: (lv_value_2_0= RULE_STRING )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:398:1: (lv_value_2_0= RULE_STRING )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:399:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnnotation730); 

            			newLeafNode(lv_value_2_0, grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleConceptDef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:423:1: entryRuleConceptDef returns [EObject current=null] : iv_ruleConceptDef= ruleConceptDef EOF ;
    public final EObject entryRuleConceptDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptDef = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:424:2: (iv_ruleConceptDef= ruleConceptDef EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:425:2: iv_ruleConceptDef= ruleConceptDef EOF
            {
             newCompositeNode(grammarAccess.getConceptDefRule()); 
            pushFollow(FOLLOW_ruleConceptDef_in_entryRuleConceptDef771);
            iv_ruleConceptDef=ruleConceptDef();

            state._fsp--;

             current =iv_ruleConceptDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConceptDef781); 

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
    // $ANTLR end "entryRuleConceptDef"


    // $ANTLR start "ruleConceptDef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:432:1: ruleConceptDef returns [EObject current=null] : ( ( (lv_top_0_0= 'top' ) )? otherlv_1= 'concept' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? (otherlv_6= '[' ( (lv_annotation_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotation_9_0= ruleAnnotation ) ) )* otherlv_10= ']' )? ( (lv_body_11_0= ruleConceptDefBody ) )? ) ;
    public final EObject ruleConceptDef() throws RecognitionException {
        EObject current = null;

        Token lv_top_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_mapping_4_0 = null;

        EObject lv_annotation_7_0 = null;

        EObject lv_annotation_9_0 = null;

        EObject lv_body_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:435:28: ( ( ( (lv_top_0_0= 'top' ) )? otherlv_1= 'concept' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? (otherlv_6= '[' ( (lv_annotation_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotation_9_0= ruleAnnotation ) ) )* otherlv_10= ']' )? ( (lv_body_11_0= ruleConceptDefBody ) )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:436:1: ( ( (lv_top_0_0= 'top' ) )? otherlv_1= 'concept' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? (otherlv_6= '[' ( (lv_annotation_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotation_9_0= ruleAnnotation ) ) )* otherlv_10= ']' )? ( (lv_body_11_0= ruleConceptDefBody ) )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:436:1: ( ( (lv_top_0_0= 'top' ) )? otherlv_1= 'concept' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? (otherlv_6= '[' ( (lv_annotation_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotation_9_0= ruleAnnotation ) ) )* otherlv_10= ']' )? ( (lv_body_11_0= ruleConceptDefBody ) )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:436:2: ( (lv_top_0_0= 'top' ) )? otherlv_1= 'concept' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? (otherlv_6= '[' ( (lv_annotation_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotation_9_0= ruleAnnotation ) ) )* otherlv_10= ']' )? ( (lv_body_11_0= ruleConceptDefBody ) )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:436:2: ( (lv_top_0_0= 'top' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:437:1: (lv_top_0_0= 'top' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:437:1: (lv_top_0_0= 'top' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:438:3: lv_top_0_0= 'top'
                    {
                    lv_top_0_0=(Token)match(input,23,FOLLOW_23_in_ruleConceptDef824); 

                            newLeafNode(lv_top_0_0, grammarAccess.getConceptDefAccess().getTopTopKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConceptDefRule());
                    	        }
                           		setWithLastConsumed(current, "top", true, "top");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleConceptDef850); 

                	newLeafNode(otherlv_1, grammarAccess.getConceptDefAccess().getConceptKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:455:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:456:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:456:1: (lv_name_2_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:457:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConceptDef867); 

            			newLeafNode(lv_name_2_0, grammarAccess.getConceptDefAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConceptDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:473:2: (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:473:4: otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleConceptDef885); 

                        	newLeafNode(otherlv_3, grammarAccess.getConceptDefAccess().getLessThanSignKeyword_3_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:477:1: ( (lv_mapping_4_0= ruleMapping ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:478:1: (lv_mapping_4_0= ruleMapping )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:478:1: (lv_mapping_4_0= ruleMapping )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:479:3: lv_mapping_4_0= ruleMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getConceptDefAccess().getMappingMappingParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapping_in_ruleConceptDef906);
                    lv_mapping_4_0=ruleMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConceptDefRule());
                    	        }
                           		set(
                           			current, 
                           			"mapping",
                            		lv_mapping_4_0, 
                            		"Mapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleConceptDef918); 

                        	newLeafNode(otherlv_5, grammarAccess.getConceptDefAccess().getGreaterThanSignKeyword_3_2());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:499:3: (otherlv_6= '[' ( (lv_annotation_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotation_9_0= ruleAnnotation ) ) )* otherlv_10= ']' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:499:5: otherlv_6= '[' ( (lv_annotation_7_0= ruleAnnotation ) ) (otherlv_8= ',' ( (lv_annotation_9_0= ruleAnnotation ) ) )* otherlv_10= ']'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleConceptDef933); 

                        	newLeafNode(otherlv_6, grammarAccess.getConceptDefAccess().getLeftSquareBracketKeyword_4_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:503:1: ( (lv_annotation_7_0= ruleAnnotation ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:504:1: (lv_annotation_7_0= ruleAnnotation )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:504:1: (lv_annotation_7_0= ruleAnnotation )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:505:3: lv_annotation_7_0= ruleAnnotation
                    {
                     
                    	        newCompositeNode(grammarAccess.getConceptDefAccess().getAnnotationAnnotationParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleConceptDef954);
                    lv_annotation_7_0=ruleAnnotation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConceptDefRule());
                    	        }
                           		add(
                           			current, 
                           			"annotation",
                            		lv_annotation_7_0, 
                            		"Annotation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:521:2: (otherlv_8= ',' ( (lv_annotation_9_0= ruleAnnotation ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==20) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:521:4: otherlv_8= ',' ( (lv_annotation_9_0= ruleAnnotation ) )
                    	    {
                    	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleConceptDef967); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getConceptDefAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:525:1: ( (lv_annotation_9_0= ruleAnnotation ) )
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:526:1: (lv_annotation_9_0= ruleAnnotation )
                    	    {
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:526:1: (lv_annotation_9_0= ruleAnnotation )
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:527:3: lv_annotation_9_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConceptDefAccess().getAnnotationAnnotationParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleConceptDef988);
                    	    lv_annotation_9_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConceptDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotation",
                    	            		lv_annotation_9_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleConceptDef1002); 

                        	newLeafNode(otherlv_10, grammarAccess.getConceptDefAccess().getRightSquareBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:547:3: ( (lv_body_11_0= ruleConceptDefBody ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:548:1: (lv_body_11_0= ruleConceptDefBody )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:548:1: (lv_body_11_0= ruleConceptDefBody )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:549:3: lv_body_11_0= ruleConceptDefBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getConceptDefAccess().getBodyConceptDefBodyParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConceptDefBody_in_ruleConceptDef1025);
                    lv_body_11_0=ruleConceptDefBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConceptDefRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_11_0, 
                            		"ConceptDefBody");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleConceptDef"


    // $ANTLR start "entryRuleConceptDefBody"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:573:1: entryRuleConceptDefBody returns [EObject current=null] : iv_ruleConceptDefBody= ruleConceptDefBody EOF ;
    public final EObject entryRuleConceptDefBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptDefBody = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:574:2: (iv_ruleConceptDefBody= ruleConceptDefBody EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:575:2: iv_ruleConceptDefBody= ruleConceptDefBody EOF
            {
             newCompositeNode(grammarAccess.getConceptDefBodyRule()); 
            pushFollow(FOLLOW_ruleConceptDefBody_in_entryRuleConceptDefBody1062);
            iv_ruleConceptDefBody=ruleConceptDefBody();

            state._fsp--;

             current =iv_ruleConceptDefBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConceptDefBody1072); 

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
    // $ANTLR end "entryRuleConceptDefBody"


    // $ANTLR start "ruleConceptDefBody"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:582:1: ruleConceptDefBody returns [EObject current=null] : (otherlv_0= '{' ( (lv_subconcept_1_0= ruleSubconcept ) ) (otherlv_2= ',' ( (lv_subconcept_3_0= ruleSubconcept ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleConceptDefBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_subconcept_1_0 = null;

        EObject lv_subconcept_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:585:28: ( (otherlv_0= '{' ( (lv_subconcept_1_0= ruleSubconcept ) ) (otherlv_2= ',' ( (lv_subconcept_3_0= ruleSubconcept ) ) )* otherlv_4= '}' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:586:1: (otherlv_0= '{' ( (lv_subconcept_1_0= ruleSubconcept ) ) (otherlv_2= ',' ( (lv_subconcept_3_0= ruleSubconcept ) ) )* otherlv_4= '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:586:1: (otherlv_0= '{' ( (lv_subconcept_1_0= ruleSubconcept ) ) (otherlv_2= ',' ( (lv_subconcept_3_0= ruleSubconcept ) ) )* otherlv_4= '}' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:586:3: otherlv_0= '{' ( (lv_subconcept_1_0= ruleSubconcept ) ) (otherlv_2= ',' ( (lv_subconcept_3_0= ruleSubconcept ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleConceptDefBody1109); 

                	newLeafNode(otherlv_0, grammarAccess.getConceptDefBodyAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:590:1: ( (lv_subconcept_1_0= ruleSubconcept ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:591:1: (lv_subconcept_1_0= ruleSubconcept )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:591:1: (lv_subconcept_1_0= ruleSubconcept )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:592:3: lv_subconcept_1_0= ruleSubconcept
            {
             
            	        newCompositeNode(grammarAccess.getConceptDefBodyAccess().getSubconceptSubconceptParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSubconcept_in_ruleConceptDefBody1130);
            lv_subconcept_1_0=ruleSubconcept();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConceptDefBodyRule());
            	        }
                   		add(
                   			current, 
                   			"subconcept",
                    		lv_subconcept_1_0, 
                    		"Subconcept");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:608:2: (otherlv_2= ',' ( (lv_subconcept_3_0= ruleSubconcept ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:608:4: otherlv_2= ',' ( (lv_subconcept_3_0= ruleSubconcept ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleConceptDefBody1143); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConceptDefBodyAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:612:1: ( (lv_subconcept_3_0= ruleSubconcept ) )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:613:1: (lv_subconcept_3_0= ruleSubconcept )
            	    {
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:613:1: (lv_subconcept_3_0= ruleSubconcept )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:614:3: lv_subconcept_3_0= ruleSubconcept
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConceptDefBodyAccess().getSubconceptSubconceptParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSubconcept_in_ruleConceptDefBody1164);
            	    lv_subconcept_3_0=ruleSubconcept();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConceptDefBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subconcept",
            	            		lv_subconcept_3_0, 
            	            		"Subconcept");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleConceptDefBody1178); 

                	newLeafNode(otherlv_4, grammarAccess.getConceptDefBodyAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleConceptDefBody"


    // $ANTLR start "entryRuleCardinality"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:642:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:643:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:644:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality1214);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality1224); 

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:651:1: ruleCardinality returns [EObject current=null] : ( ( (lv_zeroOrMore_0_0= '*' ) ) | ( (lv_oneOrMore_1_0= '+' ) ) ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token lv_zeroOrMore_0_0=null;
        Token lv_oneOrMore_1_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:654:28: ( ( ( (lv_zeroOrMore_0_0= '*' ) ) | ( (lv_oneOrMore_1_0= '+' ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:655:1: ( ( (lv_zeroOrMore_0_0= '*' ) ) | ( (lv_oneOrMore_1_0= '+' ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:655:1: ( ( (lv_zeroOrMore_0_0= '*' ) ) | ( (lv_oneOrMore_1_0= '+' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            else if ( (LA16_0==26) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:655:2: ( (lv_zeroOrMore_0_0= '*' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:655:2: ( (lv_zeroOrMore_0_0= '*' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:656:1: (lv_zeroOrMore_0_0= '*' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:656:1: (lv_zeroOrMore_0_0= '*' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:657:3: lv_zeroOrMore_0_0= '*'
                    {
                    lv_zeroOrMore_0_0=(Token)match(input,25,FOLLOW_25_in_ruleCardinality1267); 

                            newLeafNode(lv_zeroOrMore_0_0, grammarAccess.getCardinalityAccess().getZeroOrMoreAsteriskKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCardinalityRule());
                    	        }
                           		setWithLastConsumed(current, "zeroOrMore", true, "*");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:671:6: ( (lv_oneOrMore_1_0= '+' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:671:6: ( (lv_oneOrMore_1_0= '+' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:672:1: (lv_oneOrMore_1_0= '+' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:672:1: (lv_oneOrMore_1_0= '+' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:673:3: lv_oneOrMore_1_0= '+'
                    {
                    lv_oneOrMore_1_0=(Token)match(input,26,FOLLOW_26_in_ruleCardinality1304); 

                            newLeafNode(lv_oneOrMore_1_0, grammarAccess.getCardinalityAccess().getOneOrMorePlusSignKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCardinalityRule());
                    	        }
                           		setWithLastConsumed(current, "oneOrMore", true, "+");
                    	    

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleMapping"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:694:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:695:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:696:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping1353);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping1363); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:703:1: ruleMapping returns [EObject current=null] : ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        EObject lv_context_0_0 = null;

        EObject lv_mapping_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:706:28: ( ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:707:1: ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:707:1: ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:707:2: ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:707:2: ( (lv_context_0_0= rulePathExpr ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==47) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:708:1: (lv_context_0_0= rulePathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:708:1: (lv_context_0_0= rulePathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:709:3: lv_context_0_0= rulePathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getMappingAccess().getContextPathExprParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePathExpr_in_ruleMapping1409);
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:725:3: ( (lv_mapping_1_0= ruleImplicitContextMapping ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:726:1: (lv_mapping_1_0= ruleImplicitContextMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:726:1: (lv_mapping_1_0= ruleImplicitContextMapping )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:727:3: lv_mapping_1_0= ruleImplicitContextMapping
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getMappingImplicitContextMappingParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_ruleMapping1431);
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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:751:1: entryRuleImplicitContextMapping returns [EObject current=null] : iv_ruleImplicitContextMapping= ruleImplicitContextMapping EOF ;
    public final EObject entryRuleImplicitContextMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitContextMapping = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:752:2: (iv_ruleImplicitContextMapping= ruleImplicitContextMapping EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:753:2: iv_ruleImplicitContextMapping= ruleImplicitContextMapping EOF
            {
             newCompositeNode(grammarAccess.getImplicitContextMappingRule()); 
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_entryRuleImplicitContextMapping1467);
            iv_ruleImplicitContextMapping=ruleImplicitContextMapping();

            state._fsp--;

             current =iv_ruleImplicitContextMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitContextMapping1477); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:760:1: ruleImplicitContextMapping returns [EObject current=null] : (this_Module_0= ruleModule | this_ModuleName_1= ruleModuleName | this_UsesModule_2= ruleUsesModule | this_UsesEntity_3= ruleUsesEntity | this_Call_4= ruleCall | this_Subroutine_5= ruleSubroutine | this_SubroutineName_6= ruleSubroutineName ) ;
    public final EObject ruleImplicitContextMapping() throws RecognitionException {
        EObject current = null;

        EObject this_Module_0 = null;

        EObject this_ModuleName_1 = null;

        EObject this_UsesModule_2 = null;

        EObject this_UsesEntity_3 = null;

        EObject this_Call_4 = null;

        EObject this_Subroutine_5 = null;

        EObject this_SubroutineName_6 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:763:28: ( (this_Module_0= ruleModule | this_ModuleName_1= ruleModuleName | this_UsesModule_2= ruleUsesModule | this_UsesEntity_3= ruleUsesEntity | this_Call_4= ruleCall | this_Subroutine_5= ruleSubroutine | this_SubroutineName_6= ruleSubroutineName ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:764:1: (this_Module_0= ruleModule | this_ModuleName_1= ruleModuleName | this_UsesModule_2= ruleUsesModule | this_UsesEntity_3= ruleUsesEntity | this_Call_4= ruleCall | this_Subroutine_5= ruleSubroutine | this_SubroutineName_6= ruleSubroutineName )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:764:1: (this_Module_0= ruleModule | this_ModuleName_1= ruleModuleName | this_UsesModule_2= ruleUsesModule | this_UsesEntity_3= ruleUsesEntity | this_Call_4= ruleCall | this_Subroutine_5= ruleSubroutine | this_SubroutineName_6= ruleSubroutineName )
            int alt18=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt18=1;
                }
                break;
            case 30:
                {
                alt18=2;
                }
                break;
            case 31:
                {
                alt18=3;
                }
                break;
            case 32:
                {
                alt18=4;
                }
                break;
            case 45:
                {
                alt18=5;
                }
                break;
            case 33:
                {
                alt18=6;
                }
                break;
            case 44:
                {
                alt18=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:765:5: this_Module_0= ruleModule
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getModuleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleModule_in_ruleImplicitContextMapping1524);
                    this_Module_0=ruleModule();

                    state._fsp--;

                     
                            current = this_Module_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:775:5: this_ModuleName_1= ruleModuleName
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getModuleNameParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleModuleName_in_ruleImplicitContextMapping1551);
                    this_ModuleName_1=ruleModuleName();

                    state._fsp--;

                     
                            current = this_ModuleName_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:785:5: this_UsesModule_2= ruleUsesModule
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getUsesModuleParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUsesModule_in_ruleImplicitContextMapping1578);
                    this_UsesModule_2=ruleUsesModule();

                    state._fsp--;

                     
                            current = this_UsesModule_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:795:5: this_UsesEntity_3= ruleUsesEntity
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getUsesEntityParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleUsesEntity_in_ruleImplicitContextMapping1605);
                    this_UsesEntity_3=ruleUsesEntity();

                    state._fsp--;

                     
                            current = this_UsesEntity_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:805:5: this_Call_4= ruleCall
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleImplicitContextMapping1632);
                    this_Call_4=ruleCall();

                    state._fsp--;

                     
                            current = this_Call_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:815:5: this_Subroutine_5= ruleSubroutine
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getSubroutineParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSubroutine_in_ruleImplicitContextMapping1659);
                    this_Subroutine_5=ruleSubroutine();

                    state._fsp--;

                     
                            current = this_Subroutine_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:825:5: this_SubroutineName_6= ruleSubroutineName
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getSubroutineNameParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleSubroutineName_in_ruleImplicitContextMapping1686);
                    this_SubroutineName_6=ruleSubroutineName();

                    state._fsp--;

                     
                            current = this_SubroutineName_6; 
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
    // $ANTLR end "ruleImplicitContextMapping"


    // $ANTLR start "entryRuleModule"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:841:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:842:2: (iv_ruleModule= ruleModule EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:843:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule1721);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule1731); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:850:1: ruleModule returns [EObject current=null] : ( () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:853:28: ( ( () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:854:1: ( () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:854:1: ( () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:854:2: () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:854:2: ()
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:855:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModuleAccess().getModuleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleModule1777); 

                	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:864:1: (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:864:3: otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleModule1790); 

                        	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:868:1: ( (lv_name_3_0= ruleIDOrPathExpr ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:869:1: (lv_name_3_0= ruleIDOrPathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:869:1: (lv_name_3_0= ruleIDOrPathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:870:3: lv_name_3_0= ruleIDOrPathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getNameIDOrPathExprParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleModule1811);
                    lv_name_3_0=ruleIDOrPathExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModuleRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"IDOrPathExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleModule1823); 

                        	newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleModuleName"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:898:1: entryRuleModuleName returns [EObject current=null] : iv_ruleModuleName= ruleModuleName EOF ;
    public final EObject entryRuleModuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleName = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:899:2: (iv_ruleModuleName= ruleModuleName EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:900:2: iv_ruleModuleName= ruleModuleName EOF
            {
             newCompositeNode(grammarAccess.getModuleNameRule()); 
            pushFollow(FOLLOW_ruleModuleName_in_entryRuleModuleName1861);
            iv_ruleModuleName=ruleModuleName();

            state._fsp--;

             current =iv_ruleModuleName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleName1871); 

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
    // $ANTLR end "entryRuleModuleName"


    // $ANTLR start "ruleModuleName"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:907:1: ruleModuleName returns [EObject current=null] : ( () otherlv_1= 'moduleName' ) ;
    public final EObject ruleModuleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:910:28: ( ( () otherlv_1= 'moduleName' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:911:1: ( () otherlv_1= 'moduleName' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:911:1: ( () otherlv_1= 'moduleName' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:911:2: () otherlv_1= 'moduleName'
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:911:2: ()
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:912:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModuleNameAccess().getModuleNameAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleModuleName1917); 

                	newLeafNode(otherlv_1, grammarAccess.getModuleNameAccess().getModuleNameKeyword_1());
                

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
    // $ANTLR end "ruleModuleName"


    // $ANTLR start "entryRuleUsesModule"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:929:1: entryRuleUsesModule returns [EObject current=null] : iv_ruleUsesModule= ruleUsesModule EOF ;
    public final EObject entryRuleUsesModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsesModule = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:930:2: (iv_ruleUsesModule= ruleUsesModule EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:931:2: iv_ruleUsesModule= ruleUsesModule EOF
            {
             newCompositeNode(grammarAccess.getUsesModuleRule()); 
            pushFollow(FOLLOW_ruleUsesModule_in_entryRuleUsesModule1953);
            iv_ruleUsesModule=ruleUsesModule();

            state._fsp--;

             current =iv_ruleUsesModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsesModule1963); 

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
    // $ANTLR end "entryRuleUsesModule"


    // $ANTLR start "ruleUsesModule"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:938:1: ruleUsesModule returns [EObject current=null] : (otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleUsesModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:941:28: ( (otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:942:1: (otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:942:1: (otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:942:3: otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleUsesModule2000); 

                	newLeafNode(otherlv_0, grammarAccess.getUsesModuleAccess().getUsesModuleKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleUsesModule2012); 

                	newLeafNode(otherlv_1, grammarAccess.getUsesModuleAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:950:1: ( (lv_name_2_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:951:1: (lv_name_2_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:951:1: (lv_name_2_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:952:3: lv_name_2_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getUsesModuleAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleUsesModule2033);
            lv_name_2_0=ruleIDOrPathExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUsesModuleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"IDOrPathExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleUsesModule2045); 

                	newLeafNode(otherlv_3, grammarAccess.getUsesModuleAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleUsesModule"


    // $ANTLR start "entryRuleUsesEntity"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:980:1: entryRuleUsesEntity returns [EObject current=null] : iv_ruleUsesEntity= ruleUsesEntity EOF ;
    public final EObject entryRuleUsesEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsesEntity = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:981:2: (iv_ruleUsesEntity= ruleUsesEntity EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:982:2: iv_ruleUsesEntity= ruleUsesEntity EOF
            {
             newCompositeNode(grammarAccess.getUsesEntityRule()); 
            pushFollow(FOLLOW_ruleUsesEntity_in_entryRuleUsesEntity2081);
            iv_ruleUsesEntity=ruleUsesEntity();

            state._fsp--;

             current =iv_ruleUsesEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsesEntity2091); 

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
    // $ANTLR end "entryRuleUsesEntity"


    // $ANTLR start "ruleUsesEntity"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:989:1: ruleUsesEntity returns [EObject current=null] : (otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleUsesEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:992:28: ( (otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:993:1: (otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:993:1: (otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:993:3: otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleUsesEntity2128); 

                	newLeafNode(otherlv_0, grammarAccess.getUsesEntityAccess().getUsesEntityKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleUsesEntity2140); 

                	newLeafNode(otherlv_1, grammarAccess.getUsesEntityAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1001:1: ( (lv_name_2_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1002:1: (lv_name_2_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1002:1: (lv_name_2_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1003:3: lv_name_2_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getUsesEntityAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleUsesEntity2161);
            lv_name_2_0=ruleIDOrPathExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getUsesEntityRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"IDOrPathExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleUsesEntity2173); 

                	newLeafNode(otherlv_3, grammarAccess.getUsesEntityAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleUsesEntity"


    // $ANTLR start "entryRuleSubroutine"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1031:1: entryRuleSubroutine returns [EObject current=null] : iv_ruleSubroutine= ruleSubroutine EOF ;
    public final EObject entryRuleSubroutine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubroutine = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1032:2: (iv_ruleSubroutine= ruleSubroutine EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1033:2: iv_ruleSubroutine= ruleSubroutine EOF
            {
             newCompositeNode(grammarAccess.getSubroutineRule()); 
            pushFollow(FOLLOW_ruleSubroutine_in_entryRuleSubroutine2209);
            iv_ruleSubroutine=ruleSubroutine();

            state._fsp--;

             current =iv_ruleSubroutine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutine2219); 

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
    // $ANTLR end "entryRuleSubroutine"


    // $ANTLR start "ruleSubroutine"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1040:1: ruleSubroutine returns [EObject current=null] : (otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) ;
    public final EObject ruleSubroutine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_name_2_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1043:28: ( (otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1044:1: (otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1044:1: (otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1044:3: otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleSubroutine2256); 

                	newLeafNode(otherlv_0, grammarAccess.getSubroutineAccess().getSubroutineKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleSubroutine2268); 

                	newLeafNode(otherlv_1, grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1052:1: ( (lv_name_2_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1053:1: (lv_name_2_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1053:1: (lv_name_2_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1054:3: lv_name_2_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getSubroutineAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleSubroutine2289);
            lv_name_2_0=ruleIDOrPathExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSubroutineRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"IDOrPathExpr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1070:2: (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1070:4: otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleSubroutine2302); 

                        	newLeafNode(otherlv_3, grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1074:1: ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=34 && LA21_0<=41)||LA21_0==43) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1074:2: ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )*
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1074:2: ( (lv_params_4_0= ruleFormalParam ) )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1075:1: (lv_params_4_0= ruleFormalParam )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1075:1: (lv_params_4_0= ruleFormalParam )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1076:3: lv_params_4_0= ruleFormalParam
                            {
                             
                            	        newCompositeNode(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFormalParam_in_ruleSubroutine2324);
                            lv_params_4_0=ruleFormalParam();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getSubroutineRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"params",
                                    		lv_params_4_0, 
                                    		"FormalParam");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1092:2: (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( (LA20_0==20) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1092:4: otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) )
                            	    {
                            	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleSubroutine2337); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getSubroutineAccess().getCommaKeyword_3_1_1_0());
                            	        
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1096:1: ( (lv_params_6_0= ruleFormalParam ) )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1097:1: (lv_params_6_0= ruleFormalParam )
                            	    {
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1097:1: (lv_params_6_0= ruleFormalParam )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1098:3: lv_params_6_0= ruleFormalParam
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleFormalParam_in_ruleSubroutine2358);
                            	    lv_params_6_0=ruleFormalParam();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getSubroutineRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"params",
                            	            		lv_params_6_0, 
                            	            		"FormalParam");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleSubroutine2374); 

                        	newLeafNode(otherlv_7, grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleSubroutine2388); 

                	newLeafNode(otherlv_8, grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleSubroutine"


    // $ANTLR start "entryRuleFormalParam"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1130:1: entryRuleFormalParam returns [EObject current=null] : iv_ruleFormalParam= ruleFormalParam EOF ;
    public final EObject entryRuleFormalParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalParam = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1131:2: (iv_ruleFormalParam= ruleFormalParam EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1132:2: iv_ruleFormalParam= ruleFormalParam EOF
            {
             newCompositeNode(grammarAccess.getFormalParamRule()); 
            pushFollow(FOLLOW_ruleFormalParam_in_entryRuleFormalParam2424);
            iv_ruleFormalParam=ruleFormalParam();

            state._fsp--;

             current =iv_ruleFormalParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalParam2434); 

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
    // $ANTLR end "entryRuleFormalParam"


    // $ANTLR start "ruleFormalParam"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1139:1: ruleFormalParam returns [EObject current=null] : ( ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIDOrPathExpr ) ) ) ;
    public final EObject ruleFormalParam() throws RecognitionException {
        EObject current = null;

        EObject lv_intent_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1142:28: ( ( ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIDOrPathExpr ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1143:1: ( ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIDOrPathExpr ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1143:1: ( ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIDOrPathExpr ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1143:2: ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIDOrPathExpr ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1143:2: ( (lv_intent_0_0= ruleIntent ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=34 && LA23_0<=36)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1144:1: (lv_intent_0_0= ruleIntent )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1144:1: (lv_intent_0_0= ruleIntent )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1145:3: lv_intent_0_0= ruleIntent
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormalParamAccess().getIntentIntentParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntent_in_ruleFormalParam2480);
                    lv_intent_0_0=ruleIntent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFormalParamRule());
                    	        }
                           		set(
                           			current, 
                           			"intent",
                            		lv_intent_0_0, 
                            		"Intent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1161:3: ( (lv_type_1_0= ruleType ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1162:1: (lv_type_1_0= ruleType )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1162:1: (lv_type_1_0= ruleType )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1163:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getFormalParamAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFormalParam2502);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormalParamRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1179:2: ( (lv_name_2_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1180:1: (lv_name_2_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1180:1: (lv_name_2_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1181:3: lv_name_2_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getFormalParamAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleFormalParam2523);
            lv_name_2_0=ruleIDOrPathExpr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormalParamRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
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
    // $ANTLR end "ruleFormalParam"


    // $ANTLR start "entryRuleIntent"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1205:1: entryRuleIntent returns [EObject current=null] : iv_ruleIntent= ruleIntent EOF ;
    public final EObject entryRuleIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntent = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1206:2: (iv_ruleIntent= ruleIntent EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1207:2: iv_ruleIntent= ruleIntent EOF
            {
             newCompositeNode(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_ruleIntent_in_entryRuleIntent2559);
            iv_ruleIntent=ruleIntent();

            state._fsp--;

             current =iv_ruleIntent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntent2569); 

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
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1214:1: ruleIntent returns [EObject current=null] : ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) | ( (lv_inout_2_0= 'inout' ) ) ) ;
    public final EObject ruleIntent() throws RecognitionException {
        EObject current = null;

        Token lv_in_0_0=null;
        Token lv_out_1_0=null;
        Token lv_inout_2_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1217:28: ( ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) | ( (lv_inout_2_0= 'inout' ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1218:1: ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) | ( (lv_inout_2_0= 'inout' ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1218:1: ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) | ( (lv_inout_2_0= 'inout' ) ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt24=1;
                }
                break;
            case 35:
                {
                alt24=2;
                }
                break;
            case 36:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1218:2: ( (lv_in_0_0= 'in' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1218:2: ( (lv_in_0_0= 'in' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1219:1: (lv_in_0_0= 'in' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1219:1: (lv_in_0_0= 'in' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1220:3: lv_in_0_0= 'in'
                    {
                    lv_in_0_0=(Token)match(input,34,FOLLOW_34_in_ruleIntent2612); 

                            newLeafNode(lv_in_0_0, grammarAccess.getIntentAccess().getInInKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentRule());
                    	        }
                           		setWithLastConsumed(current, "in", true, "in");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1234:6: ( (lv_out_1_0= 'out' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1234:6: ( (lv_out_1_0= 'out' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1235:1: (lv_out_1_0= 'out' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1235:1: (lv_out_1_0= 'out' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1236:3: lv_out_1_0= 'out'
                    {
                    lv_out_1_0=(Token)match(input,35,FOLLOW_35_in_ruleIntent2649); 

                            newLeafNode(lv_out_1_0, grammarAccess.getIntentAccess().getOutOutKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentRule());
                    	        }
                           		setWithLastConsumed(current, "out", true, "out");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1250:6: ( (lv_inout_2_0= 'inout' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1250:6: ( (lv_inout_2_0= 'inout' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1251:1: (lv_inout_2_0= 'inout' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1251:1: (lv_inout_2_0= 'inout' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1252:3: lv_inout_2_0= 'inout'
                    {
                    lv_inout_2_0=(Token)match(input,36,FOLLOW_36_in_ruleIntent2686); 

                            newLeafNode(lv_inout_2_0, grammarAccess.getIntentAccess().getInoutInoutKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentRule());
                    	        }
                           		setWithLastConsumed(current, "inout", true, "inout");
                    	    

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
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleType"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1273:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1274:2: (iv_ruleType= ruleType EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1275:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2735);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2745); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1282:1: ruleType returns [EObject current=null] : ( ( (lv_integer_0_0= 'integer' ) ) | ( (lv_character_1_0= 'character' ) ) | ( (lv_logical_2_0= 'logical' ) ) | ( (lv_real_3_0= 'real' ) ) | ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? ) | ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_integer_0_0=null;
        Token lv_character_1_0=null;
        Token lv_logical_2_0=null;
        Token lv_real_3_0=null;
        Token lv_double_4_0=null;
        Token otherlv_5=null;
        Token lv_derived_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_derivedType_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1285:28: ( ( ( (lv_integer_0_0= 'integer' ) ) | ( (lv_character_1_0= 'character' ) ) | ( (lv_logical_2_0= 'logical' ) ) | ( (lv_real_3_0= 'real' ) ) | ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? ) | ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1286:1: ( ( (lv_integer_0_0= 'integer' ) ) | ( (lv_character_1_0= 'character' ) ) | ( (lv_logical_2_0= 'logical' ) ) | ( (lv_real_3_0= 'real' ) ) | ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? ) | ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1286:1: ( ( (lv_integer_0_0= 'integer' ) ) | ( (lv_character_1_0= 'character' ) ) | ( (lv_logical_2_0= 'logical' ) ) | ( (lv_real_3_0= 'real' ) ) | ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? ) | ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' ) )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt26=1;
                }
                break;
            case 38:
                {
                alt26=2;
                }
                break;
            case 39:
                {
                alt26=3;
                }
                break;
            case 40:
                {
                alt26=4;
                }
                break;
            case 41:
                {
                alt26=5;
                }
                break;
            case 43:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1286:2: ( (lv_integer_0_0= 'integer' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1286:2: ( (lv_integer_0_0= 'integer' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1287:1: (lv_integer_0_0= 'integer' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1287:1: (lv_integer_0_0= 'integer' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1288:3: lv_integer_0_0= 'integer'
                    {
                    lv_integer_0_0=(Token)match(input,37,FOLLOW_37_in_ruleType2788); 

                            newLeafNode(lv_integer_0_0, grammarAccess.getTypeAccess().getIntegerIntegerKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "integer", true, "integer");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1302:6: ( (lv_character_1_0= 'character' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1302:6: ( (lv_character_1_0= 'character' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1303:1: (lv_character_1_0= 'character' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1303:1: (lv_character_1_0= 'character' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1304:3: lv_character_1_0= 'character'
                    {
                    lv_character_1_0=(Token)match(input,38,FOLLOW_38_in_ruleType2825); 

                            newLeafNode(lv_character_1_0, grammarAccess.getTypeAccess().getCharacterCharacterKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "character", true, "character");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1318:6: ( (lv_logical_2_0= 'logical' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1318:6: ( (lv_logical_2_0= 'logical' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1319:1: (lv_logical_2_0= 'logical' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1319:1: (lv_logical_2_0= 'logical' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1320:3: lv_logical_2_0= 'logical'
                    {
                    lv_logical_2_0=(Token)match(input,39,FOLLOW_39_in_ruleType2862); 

                            newLeafNode(lv_logical_2_0, grammarAccess.getTypeAccess().getLogicalLogicalKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "logical", true, "logical");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1334:6: ( (lv_real_3_0= 'real' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1334:6: ( (lv_real_3_0= 'real' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1335:1: (lv_real_3_0= 'real' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1335:1: (lv_real_3_0= 'real' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1336:3: lv_real_3_0= 'real'
                    {
                    lv_real_3_0=(Token)match(input,40,FOLLOW_40_in_ruleType2899); 

                            newLeafNode(lv_real_3_0, grammarAccess.getTypeAccess().getRealRealKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "real", true, "real");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1350:6: ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1350:6: ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1350:7: ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )?
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1350:7: ( (lv_double_4_0= 'double' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1351:1: (lv_double_4_0= 'double' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1351:1: (lv_double_4_0= 'double' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1352:3: lv_double_4_0= 'double'
                    {
                    lv_double_4_0=(Token)match(input,41,FOLLOW_41_in_ruleType2937); 

                            newLeafNode(lv_double_4_0, grammarAccess.getTypeAccess().getDoubleDoubleKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "double", true, "double");
                    	    

                    }


                    }

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1365:2: (otherlv_5= 'precision' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==42) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1365:4: otherlv_5= 'precision'
                            {
                            otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleType2963); 

                                	newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getPrecisionKeyword_4_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1370:6: ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1370:6: ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1370:7: ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')'
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1370:7: ( (lv_derived_6_0= 'type' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1371:1: (lv_derived_6_0= 'type' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1371:1: (lv_derived_6_0= 'type' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1372:3: lv_derived_6_0= 'type'
                    {
                    lv_derived_6_0=(Token)match(input,43,FOLLOW_43_in_ruleType2991); 

                            newLeafNode(lv_derived_6_0, grammarAccess.getTypeAccess().getDerivedTypeKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "derived", true, "type");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,28,FOLLOW_28_in_ruleType3016); 

                        	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1389:1: ( (lv_derivedType_8_0= ruleIDOrPathExpr ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1390:1: (lv_derivedType_8_0= ruleIDOrPathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1390:1: (lv_derivedType_8_0= ruleIDOrPathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1391:3: lv_derivedType_8_0= ruleIDOrPathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getDerivedTypeIDOrPathExprParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleType3037);
                    lv_derivedType_8_0=ruleIDOrPathExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"derivedType",
                            		lv_derivedType_8_0, 
                            		"IDOrPathExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleType3049); 

                        	newLeafNode(otherlv_9, grammarAccess.getTypeAccess().getRightParenthesisKeyword_5_3());
                        

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSubroutineName"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1419:1: entryRuleSubroutineName returns [EObject current=null] : iv_ruleSubroutineName= ruleSubroutineName EOF ;
    public final EObject entryRuleSubroutineName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubroutineName = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1420:2: (iv_ruleSubroutineName= ruleSubroutineName EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1421:2: iv_ruleSubroutineName= ruleSubroutineName EOF
            {
             newCompositeNode(grammarAccess.getSubroutineNameRule()); 
            pushFollow(FOLLOW_ruleSubroutineName_in_entryRuleSubroutineName3086);
            iv_ruleSubroutineName=ruleSubroutineName();

            state._fsp--;

             current =iv_ruleSubroutineName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutineName3096); 

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
    // $ANTLR end "entryRuleSubroutineName"


    // $ANTLR start "ruleSubroutineName"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1428:1: ruleSubroutineName returns [EObject current=null] : (otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleSubroutineName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1431:28: ( (otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1432:1: (otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1432:1: (otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1432:3: otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleSubroutineName3133); 

                	newLeafNode(otherlv_0, grammarAccess.getSubroutineNameAccess().getSubroutineNameKeyword_0());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1436:1: ()
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1437:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubroutineNameAccess().getSubroutineNameAction_1(),
                        current);
                

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1442:2: (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1442:4: otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleSubroutineName3155); 

                        	newLeafNode(otherlv_2, grammarAccess.getSubroutineNameAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1446:1: ( (lv_name_3_0= ruleIDOrPathExpr ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1447:1: (lv_name_3_0= ruleIDOrPathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1447:1: (lv_name_3_0= ruleIDOrPathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1448:3: lv_name_3_0= ruleIDOrPathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubroutineNameAccess().getNameIDOrPathExprParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleSubroutineName3176);
                    lv_name_3_0=ruleIDOrPathExpr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubroutineNameRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"IDOrPathExpr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleSubroutineName3188); 

                        	newLeafNode(otherlv_4, grammarAccess.getSubroutineNameAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

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
    // $ANTLR end "ruleSubroutineName"


    // $ANTLR start "entryRuleCall"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1476:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1477:2: (iv_ruleCall= ruleCall EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1478:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall3226);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall3236); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1485:1: ruleCall returns [EObject current=null] : (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) ;
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
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1488:28: ( (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1489:1: (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1489:1: (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1489:3: otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleCall3273); 

                	newLeafNode(otherlv_0, grammarAccess.getCallAccess().getCallKeyword_0());
                
            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleCall3285); 

                	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1497:1: ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1498:1: (lv_subroutineName_2_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1498:1: (lv_subroutineName_2_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1499:3: lv_subroutineName_2_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getSubroutineNameIDOrPathExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleCall3306);
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1515:2: (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1515:4: otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleCall3319); 

                        	newLeafNode(otherlv_3, grammarAccess.getCallAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1519:1: ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_ID||LA29_0==25||LA29_0==47) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1519:2: ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )*
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1519:2: ( (lv_params_4_0= ruleActualParam ) )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1520:1: (lv_params_4_0= ruleActualParam )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1520:1: (lv_params_4_0= ruleActualParam )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1521:3: lv_params_4_0= ruleActualParam
                            {
                             
                            	        newCompositeNode(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleActualParam_in_ruleCall3341);
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

                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1537:2: (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==20) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1537:4: otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) )
                            	    {
                            	    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleCall3354); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getCallAccess().getCommaKeyword_3_1_1_0());
                            	        
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1541:1: ( (lv_params_6_0= ruleActualParam ) )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1542:1: (lv_params_6_0= ruleActualParam )
                            	    {
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1542:1: (lv_params_6_0= ruleActualParam )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1543:3: lv_params_6_0= ruleActualParam
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleActualParam_in_ruleCall3375);
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
                            	    break loop28;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleCall3391); 

                        	newLeafNode(otherlv_7, grammarAccess.getCallAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleCall3405); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1575:1: entryRuleActualParam returns [EObject current=null] : iv_ruleActualParam= ruleActualParam EOF ;
    public final EObject entryRuleActualParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualParam = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1576:2: (iv_ruleActualParam= ruleActualParam EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1577:2: iv_ruleActualParam= ruleActualParam EOF
            {
             newCompositeNode(grammarAccess.getActualParamRule()); 
            pushFollow(FOLLOW_ruleActualParam_in_entryRuleActualParam3441);
            iv_ruleActualParam=ruleActualParam();

            state._fsp--;

             current =iv_ruleActualParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualParam3451); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1584:1: ruleActualParam returns [EObject current=null] : ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) ) ) ;
    public final EObject ruleActualParam() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1587:28: ( ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1588:1: ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1588:1: ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1588:2: ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1588:2: ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==22||LA32_1==46) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1588:3: ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '='
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1588:3: ( (lv_keyword_0_0= RULE_ID ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1589:1: (lv_keyword_0_0= RULE_ID )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1589:1: (lv_keyword_0_0= RULE_ID )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1590:3: lv_keyword_0_0= RULE_ID
                    {
                    lv_keyword_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActualParam3494); 

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

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1606:2: ( (lv_optional_1_0= '?' ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==46) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1607:1: (lv_optional_1_0= '?' )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1607:1: (lv_optional_1_0= '?' )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1608:3: lv_optional_1_0= '?'
                            {
                            lv_optional_1_0=(Token)match(input,46,FOLLOW_46_in_ruleActualParam3517); 

                                    newLeafNode(lv_optional_1_0, grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActualParamRule());
                            	        }
                                   		setWithLastConsumed(current, "optional", true, "?");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleActualParam3543); 

                        	newLeafNode(otherlv_2, grammarAccess.getActualParamAccess().getEqualsSignKeyword_0_2());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1625:3: ( (lv_value_3_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1626:1: (lv_value_3_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1626:1: (lv_value_3_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1627:3: lv_value_3_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getActualParamAccess().getValueIDOrPathExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleActualParam3566);
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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1651:1: entryRuleIDOrWildcard returns [EObject current=null] : iv_ruleIDOrWildcard= ruleIDOrWildcard EOF ;
    public final EObject entryRuleIDOrWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDOrWildcard = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1652:2: (iv_ruleIDOrWildcard= ruleIDOrWildcard EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1653:2: iv_ruleIDOrWildcard= ruleIDOrWildcard EOF
            {
             newCompositeNode(grammarAccess.getIDOrWildcardRule()); 
            pushFollow(FOLLOW_ruleIDOrWildcard_in_entryRuleIDOrWildcard3602);
            iv_ruleIDOrWildcard=ruleIDOrWildcard();

            state._fsp--;

             current =iv_ruleIDOrWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrWildcard3612); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1660:1: ruleIDOrWildcard returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_wildcard_1_0= '*' ) ) ) ;
    public final EObject ruleIDOrWildcard() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_wildcard_1_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1663:28: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_wildcard_1_0= '*' ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1664:1: ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_wildcard_1_0= '*' ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1664:1: ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_wildcard_1_0= '*' ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            else if ( (LA33_0==25) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1664:2: ( (lv_id_0_0= RULE_ID ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1664:2: ( (lv_id_0_0= RULE_ID ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1665:1: (lv_id_0_0= RULE_ID )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1665:1: (lv_id_0_0= RULE_ID )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1666:3: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDOrWildcard3654); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1683:6: ( (lv_wildcard_1_0= '*' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1683:6: ( (lv_wildcard_1_0= '*' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1684:1: (lv_wildcard_1_0= '*' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1684:1: (lv_wildcard_1_0= '*' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1685:3: lv_wildcard_1_0= '*'
                    {
                    lv_wildcard_1_0=(Token)match(input,25,FOLLOW_25_in_ruleIDOrWildcard3683); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1706:1: entryRuleIDOrPathExpr returns [EObject current=null] : iv_ruleIDOrPathExpr= ruleIDOrPathExpr EOF ;
    public final EObject entryRuleIDOrPathExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDOrPathExpr = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1707:2: (iv_ruleIDOrPathExpr= ruleIDOrPathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1708:2: iv_ruleIDOrPathExpr= ruleIDOrPathExpr EOF
            {
             newCompositeNode(grammarAccess.getIDOrPathExprRule()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_entryRuleIDOrPathExpr3732);
            iv_ruleIDOrPathExpr=ruleIDOrPathExpr();

            state._fsp--;

             current =iv_ruleIDOrPathExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrPathExpr3742); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1715:1: ruleIDOrPathExpr returns [EObject current=null] : (this_IDOrWildcard_0= ruleIDOrWildcard | this_PathExpr_1= rulePathExpr ) ;
    public final EObject ruleIDOrPathExpr() throws RecognitionException {
        EObject current = null;

        EObject this_IDOrWildcard_0 = null;

        EObject this_PathExpr_1 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1718:28: ( (this_IDOrWildcard_0= ruleIDOrWildcard | this_PathExpr_1= rulePathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1719:1: (this_IDOrWildcard_0= ruleIDOrWildcard | this_PathExpr_1= rulePathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1719:1: (this_IDOrWildcard_0= ruleIDOrWildcard | this_PathExpr_1= rulePathExpr )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||LA34_0==25) ) {
                alt34=1;
            }
            else if ( (LA34_0==47) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1720:5: this_IDOrWildcard_0= ruleIDOrWildcard
                    {
                     
                            newCompositeNode(grammarAccess.getIDOrPathExprAccess().getIDOrWildcardParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIDOrWildcard_in_ruleIDOrPathExpr3789);
                    this_IDOrWildcard_0=ruleIDOrWildcard();

                    state._fsp--;

                     
                            current = this_IDOrWildcard_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1730:5: this_PathExpr_1= rulePathExpr
                    {
                     
                            newCompositeNode(grammarAccess.getIDOrPathExprAccess().getPathExprParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePathExpr_in_ruleIDOrPathExpr3816);
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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1746:1: entryRulePathExpr returns [EObject current=null] : iv_rulePathExpr= rulePathExpr EOF ;
    public final EObject entryRulePathExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExpr = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1747:2: (iv_rulePathExpr= rulePathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1748:2: iv_rulePathExpr= rulePathExpr EOF
            {
             newCompositeNode(grammarAccess.getPathExprRule()); 
            pushFollow(FOLLOW_rulePathExpr_in_entryRulePathExpr3851);
            iv_rulePathExpr=rulePathExpr();

            state._fsp--;

             current =iv_rulePathExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExpr3861); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1755:1: rulePathExpr returns [EObject current=null] : (otherlv_0= '#' ( (lv_segments_1_0= rulePathSegment ) ) (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )* ) ;
    public final EObject rulePathExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_segments_1_0 = null;

        AntlrDatatypeRuleToken lv_segments_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1758:28: ( (otherlv_0= '#' ( (lv_segments_1_0= rulePathSegment ) ) (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )* ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1759:1: (otherlv_0= '#' ( (lv_segments_1_0= rulePathSegment ) ) (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )* )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1759:1: (otherlv_0= '#' ( (lv_segments_1_0= rulePathSegment ) ) (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )* )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1759:3: otherlv_0= '#' ( (lv_segments_1_0= rulePathSegment ) ) (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )*
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_rulePathExpr3898); 

                	newLeafNode(otherlv_0, grammarAccess.getPathExprAccess().getNumberSignKeyword_0());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1763:1: ( (lv_segments_1_0= rulePathSegment ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1764:1: (lv_segments_1_0= rulePathSegment )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1764:1: (lv_segments_1_0= rulePathSegment )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1765:3: lv_segments_1_0= rulePathSegment
            {
             
            	        newCompositeNode(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePathSegment_in_rulePathExpr3919);
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1781:2: (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==48) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1781:4: otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) )
            	    {
            	    otherlv_2=(Token)match(input,48,FOLLOW_48_in_rulePathExpr3932); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPathExprAccess().getSolidusKeyword_2_0());
            	        
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1785:1: ( (lv_segments_3_0= rulePathSegment ) )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1786:1: (lv_segments_3_0= rulePathSegment )
            	    {
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1786:1: (lv_segments_3_0= rulePathSegment )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1787:3: lv_segments_3_0= rulePathSegment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePathSegment_in_rulePathExpr3953);
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
            	    break loop35;
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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1811:1: entryRulePathSegment returns [String current=null] : iv_rulePathSegment= rulePathSegment EOF ;
    public final String entryRulePathSegment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePathSegment = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1812:2: (iv_rulePathSegment= rulePathSegment EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1813:2: iv_rulePathSegment= rulePathSegment EOF
            {
             newCompositeNode(grammarAccess.getPathSegmentRule()); 
            pushFollow(FOLLOW_rulePathSegment_in_entryRulePathSegment3992);
            iv_rulePathSegment=rulePathSegment();

            state._fsp--;

             current =iv_rulePathSegment.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathSegment4003); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1820:1: rulePathSegment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '..' | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken rulePathSegment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1823:28: ( (kw= '..' | this_ID_1= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1824:1: (kw= '..' | this_ID_1= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1824:1: (kw= '..' | this_ID_1= RULE_ID )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==49) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1825:2: kw= '..'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_rulePathSegment4041); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPathSegmentAccess().getFullStopFullStopKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1831:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathSegment4062); 

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


 

    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleLanguage122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLanguage139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLanguage161 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLanguage178 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_ruleConceptDef_in_ruleLanguage199 = new BitSet(new long[]{0x0000000001802000L});
    public static final BitSet FOLLOW_13_in_ruleLanguage212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconcept_in_entryRuleSubconcept248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubconcept258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSubconcept301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubconcept332 = new BitSet(new long[]{0x00000000060B9002L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleSubconcept358 = new BitSet(new long[]{0x00000000000B9002L});
    public static final BitSet FOLLOW_15_in_ruleSubconcept377 = new BitSet(new long[]{0x00000000000B1002L});
    public static final BitSet FOLLOW_16_in_ruleSubconcept411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubconcept444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSubconcept465 = new BitSet(new long[]{0x0000B003C8000000L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleSubconcept486 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSubconcept498 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_19_in_ruleSubconcept513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleSubconcept534 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleSubconcept547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleSubconcept568 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleSubconcept582 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleConceptDefBody_in_ruleSubconcept605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotation696 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAnnotation713 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotation730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConceptDef_in_entryRuleConceptDef771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConceptDef781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleConceptDef824 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleConceptDef850 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConceptDef867 = new BitSet(new long[]{0x00000000000A1002L});
    public static final BitSet FOLLOW_17_in_ruleConceptDef885 = new BitSet(new long[]{0x0000B003C8000000L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleConceptDef906 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConceptDef918 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_19_in_ruleConceptDef933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleConceptDef954 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleConceptDef967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleConceptDef988 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleConceptDef1002 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleConceptDefBody_in_ruleConceptDef1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConceptDefBody_in_entryRuleConceptDefBody1062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConceptDefBody1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleConceptDefBody1109 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleSubconcept_in_ruleConceptDefBody1130 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_20_in_ruleConceptDefBody1143 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleSubconcept_in_ruleConceptDefBody1164 = new BitSet(new long[]{0x0000000000102000L});
    public static final BitSet FOLLOW_13_in_ruleConceptDefBody1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality1214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCardinality1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCardinality1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping1353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_ruleMapping1409 = new BitSet(new long[]{0x0000B003C8000000L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_ruleMapping1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_entryRuleImplicitContextMapping1467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitContextMapping1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleImplicitContextMapping1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleName_in_ruleImplicitContextMapping1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesModule_in_ruleImplicitContextMapping1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesEntity_in_ruleImplicitContextMapping1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleImplicitContextMapping1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_ruleImplicitContextMapping1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutineName_in_ruleImplicitContextMapping1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule1721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleModule1777 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleModule1790 = new BitSet(new long[]{0x0000800002000010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleModule1811 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleModule1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleName_in_entryRuleModuleName1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleName1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleModuleName1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesModule_in_entryRuleUsesModule1953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsesModule1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleUsesModule2000 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleUsesModule2012 = new BitSet(new long[]{0x0000800002000010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleUsesModule2033 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleUsesModule2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesEntity_in_entryRuleUsesEntity2081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsesEntity2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleUsesEntity2128 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleUsesEntity2140 = new BitSet(new long[]{0x0000800002000010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleUsesEntity2161 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleUsesEntity2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_entryRuleSubroutine2209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutine2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSubroutine2256 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSubroutine2268 = new BitSet(new long[]{0x0000800002000010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleSubroutine2289 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleSubroutine2302 = new BitSet(new long[]{0x00000BFC20000000L});
    public static final BitSet FOLLOW_ruleFormalParam_in_ruleSubroutine2324 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_20_in_ruleSubroutine2337 = new BitSet(new long[]{0x00000BFC00000000L});
    public static final BitSet FOLLOW_ruleFormalParam_in_ruleSubroutine2358 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_29_in_ruleSubroutine2374 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSubroutine2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalParam_in_entryRuleFormalParam2424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalParam2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_ruleFormalParam2480 = new BitSet(new long[]{0x00000BFC00000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleFormalParam2502 = new BitSet(new long[]{0x0000800002000010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleFormalParam2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_entryRuleIntent2559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntent2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleIntent2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleIntent2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleIntent2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleType2788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleType2825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleType2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleType2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleType2937 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleType2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleType2991 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleType3016 = new BitSet(new long[]{0x0000800002000010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleType3037 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleType3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutineName_in_entryRuleSubroutineName3086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutineName3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSubroutineName3133 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_28_in_ruleSubroutineName3155 = new BitSet(new long[]{0x0000800002000010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleSubroutineName3176 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSubroutineName3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall3226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall3236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCall3273 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCall3285 = new BitSet(new long[]{0x0000800002000010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleCall3306 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_ruleCall3319 = new BitSet(new long[]{0x0000800022000010L});
    public static final BitSet FOLLOW_ruleActualParam_in_ruleCall3341 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_20_in_ruleCall3354 = new BitSet(new long[]{0x0000800002000010L});
    public static final BitSet FOLLOW_ruleActualParam_in_ruleCall3375 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_29_in_ruleCall3391 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCall3405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_entryRuleActualParam3441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualParam3451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActualParam3494 = new BitSet(new long[]{0x0000400000400000L});
    public static final BitSet FOLLOW_46_in_ruleActualParam3517 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActualParam3543 = new BitSet(new long[]{0x0000800002000010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleActualParam3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrWildcard_in_entryRuleIDOrWildcard3602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrWildcard3612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDOrWildcard3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleIDOrWildcard3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_entryRuleIDOrPathExpr3732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrPathExpr3742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrWildcard_in_ruleIDOrPathExpr3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_ruleIDOrPathExpr3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_entryRulePathExpr3851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExpr3861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rulePathExpr3898 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_rulePathSegment_in_rulePathExpr3919 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_rulePathExpr3932 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_rulePathSegment_in_rulePathExpr3953 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rulePathSegment_in_entryRulePathSegment3992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathSegment4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rulePathSegment4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathSegment4062 = new BitSet(new long[]{0x0000000000000002L});

}