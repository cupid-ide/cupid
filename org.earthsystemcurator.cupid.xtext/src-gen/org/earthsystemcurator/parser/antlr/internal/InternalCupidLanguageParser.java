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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_ANNOTATION_ID", "RULE_INT", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'language '", "'{'", "'}'", "'='", "'<'", "'>'", "'concept'", "'top'", "'!'", "':'", "'attrib'", "'*'", "'+'", "'module'", "'('", "')'", "'moduleName'", "'usesModule'", "'usesEntity'", "'subroutine'", "','", "'in'", "'out'", "'inout'", "'integer'", "'character'", "'logical'", "'real'", "'double'", "'precision'", "'type'", "'subroutineName'", "'call'", "'?'", "'actualParamByKeyword'", "'declaration'", "'#'", "'/'", "'^'"
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
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int RULE_ANNOTATION_ID=6;
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
    public static final int RULE_ML_COMMENT=9;
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
    public static final int RULE_WS=10;

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:76:1: ruleLanguage returns [EObject current=null] : (otherlv_0= 'language ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_conceptDef_4_0= ruleTopConceptDef ) ) ( (lv_conceptDef_5_0= ruleNamedConceptDef ) )* otherlv_6= '}' ) ;
    public final EObject ruleLanguage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_uri_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_conceptDef_4_0 = null;

        EObject lv_conceptDef_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:79:28: ( (otherlv_0= 'language ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_conceptDef_4_0= ruleTopConceptDef ) ) ( (lv_conceptDef_5_0= ruleNamedConceptDef ) )* otherlv_6= '}' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:80:1: (otherlv_0= 'language ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_conceptDef_4_0= ruleTopConceptDef ) ) ( (lv_conceptDef_5_0= ruleNamedConceptDef ) )* otherlv_6= '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:80:1: (otherlv_0= 'language ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_conceptDef_4_0= ruleTopConceptDef ) ) ( (lv_conceptDef_5_0= ruleNamedConceptDef ) )* otherlv_6= '}' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:80:3: otherlv_0= 'language ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_uri_2_0= RULE_STRING ) ) otherlv_3= '{' ( (lv_conceptDef_4_0= ruleTopConceptDef ) ) ( (lv_conceptDef_5_0= ruleNamedConceptDef ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleLanguage122); 

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

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleLanguage178); 

                	newLeafNode(otherlv_3, grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:124:1: ( (lv_conceptDef_4_0= ruleTopConceptDef ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:125:1: (lv_conceptDef_4_0= ruleTopConceptDef )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:125:1: (lv_conceptDef_4_0= ruleTopConceptDef )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:126:3: lv_conceptDef_4_0= ruleTopConceptDef
            {
             
            	        newCompositeNode(grammarAccess.getLanguageAccess().getConceptDefTopConceptDefParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTopConceptDef_in_ruleLanguage199);
            lv_conceptDef_4_0=ruleTopConceptDef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLanguageRule());
            	        }
                   		add(
                   			current, 
                   			"conceptDef",
                    		lv_conceptDef_4_0, 
                    		"TopConceptDef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:142:2: ( (lv_conceptDef_5_0= ruleNamedConceptDef ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:143:1: (lv_conceptDef_5_0= ruleNamedConceptDef )
            	    {
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:143:1: (lv_conceptDef_5_0= ruleNamedConceptDef )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:144:3: lv_conceptDef_5_0= ruleNamedConceptDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLanguageAccess().getConceptDefNamedConceptDefParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNamedConceptDef_in_ruleLanguage220);
            	    lv_conceptDef_5_0=ruleNamedConceptDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLanguageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conceptDef",
            	            		lv_conceptDef_5_0, 
            	            		"NamedConceptDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleLanguage233); 

                	newLeafNode(otherlv_6, grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleAnnotation"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:172:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:173:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:174:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation269);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation279); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:181:1: ruleAnnotation returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ANNOTATION_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:184:28: ( ( ( (lv_key_0_0= RULE_ANNOTATION_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:185:1: ( ( (lv_key_0_0= RULE_ANNOTATION_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:185:1: ( ( (lv_key_0_0= RULE_ANNOTATION_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:185:2: ( (lv_key_0_0= RULE_ANNOTATION_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:185:2: ( (lv_key_0_0= RULE_ANNOTATION_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:186:1: (lv_key_0_0= RULE_ANNOTATION_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:186:1: (lv_key_0_0= RULE_ANNOTATION_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:187:3: lv_key_0_0= RULE_ANNOTATION_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ANNOTATION_ID,FOLLOW_RULE_ANNOTATION_ID_in_ruleAnnotation321); 

            			newLeafNode(lv_key_0_0, grammarAccess.getAnnotationAccess().getKeyANNOTATION_IDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnnotationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"key",
                    		lv_key_0_0, 
                    		"ANNOTATION_ID");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:203:2: (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:203:4: otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleAnnotation339); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getEqualsSignKeyword_1_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:207:1: ( (lv_value_2_0= RULE_STRING ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:208:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:208:1: (lv_value_2_0= RULE_STRING )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:209:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAnnotation356); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
                    		

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleAnonymousConceptDef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:233:1: entryRuleAnonymousConceptDef returns [EObject current=null] : iv_ruleAnonymousConceptDef= ruleAnonymousConceptDef EOF ;
    public final EObject entryRuleAnonymousConceptDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousConceptDef = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:234:2: (iv_ruleAnonymousConceptDef= ruleAnonymousConceptDef EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:235:2: iv_ruleAnonymousConceptDef= ruleAnonymousConceptDef EOF
            {
             newCompositeNode(grammarAccess.getAnonymousConceptDefRule()); 
            pushFollow(FOLLOW_ruleAnonymousConceptDef_in_entryRuleAnonymousConceptDef399);
            iv_ruleAnonymousConceptDef=ruleAnonymousConceptDef();

            state._fsp--;

             current =iv_ruleAnonymousConceptDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnonymousConceptDef409); 

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
    // $ANTLR end "entryRuleAnonymousConceptDef"


    // $ANTLR start "ruleAnonymousConceptDef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:242:1: ruleAnonymousConceptDef returns [EObject current=null] : ( () (otherlv_1= '<' ( (lv_mapping_2_0= ruleMapping ) ) otherlv_3= '>' )? (otherlv_4= '{' ( (lv_annotation_5_0= ruleAnnotation ) )* ( (lv_child_6_0= ruleSubconceptOrAttribute ) )* otherlv_7= '}' )? ) ;
    public final EObject ruleAnonymousConceptDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_mapping_2_0 = null;

        EObject lv_annotation_5_0 = null;

        EObject lv_child_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:245:28: ( ( () (otherlv_1= '<' ( (lv_mapping_2_0= ruleMapping ) ) otherlv_3= '>' )? (otherlv_4= '{' ( (lv_annotation_5_0= ruleAnnotation ) )* ( (lv_child_6_0= ruleSubconceptOrAttribute ) )* otherlv_7= '}' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:246:1: ( () (otherlv_1= '<' ( (lv_mapping_2_0= ruleMapping ) ) otherlv_3= '>' )? (otherlv_4= '{' ( (lv_annotation_5_0= ruleAnnotation ) )* ( (lv_child_6_0= ruleSubconceptOrAttribute ) )* otherlv_7= '}' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:246:1: ( () (otherlv_1= '<' ( (lv_mapping_2_0= ruleMapping ) ) otherlv_3= '>' )? (otherlv_4= '{' ( (lv_annotation_5_0= ruleAnnotation ) )* ( (lv_child_6_0= ruleSubconceptOrAttribute ) )* otherlv_7= '}' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:246:2: () (otherlv_1= '<' ( (lv_mapping_2_0= ruleMapping ) ) otherlv_3= '>' )? (otherlv_4= '{' ( (lv_annotation_5_0= ruleAnnotation ) )* ( (lv_child_6_0= ruleSubconceptOrAttribute ) )* otherlv_7= '}' )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:246:2: ()
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:247:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAnonymousConceptDefAccess().getConceptDefAction_0(),
                        current);
                

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:252:2: (otherlv_1= '<' ( (lv_mapping_2_0= ruleMapping ) ) otherlv_3= '>' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:252:4: otherlv_1= '<' ( (lv_mapping_2_0= ruleMapping ) ) otherlv_3= '>'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleAnonymousConceptDef456); 

                        	newLeafNode(otherlv_1, grammarAccess.getAnonymousConceptDefAccess().getLessThanSignKeyword_1_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:256:1: ( (lv_mapping_2_0= ruleMapping ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:257:1: (lv_mapping_2_0= ruleMapping )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:257:1: (lv_mapping_2_0= ruleMapping )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:258:3: lv_mapping_2_0= ruleMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnonymousConceptDefAccess().getMappingMappingParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapping_in_ruleAnonymousConceptDef477);
                    lv_mapping_2_0=ruleMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnonymousConceptDefRule());
                    	        }
                           		set(
                           			current, 
                           			"mapping",
                            		lv_mapping_2_0, 
                            		"Mapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleAnonymousConceptDef489); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnonymousConceptDefAccess().getGreaterThanSignKeyword_1_2());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:278:3: (otherlv_4= '{' ( (lv_annotation_5_0= ruleAnnotation ) )* ( (lv_child_6_0= ruleSubconceptOrAttribute ) )* otherlv_7= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:278:5: otherlv_4= '{' ( (lv_annotation_5_0= ruleAnnotation ) )* ( (lv_child_6_0= ruleSubconceptOrAttribute ) )* otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAnonymousConceptDef504); 

                        	newLeafNode(otherlv_4, grammarAccess.getAnonymousConceptDefAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:282:1: ( (lv_annotation_5_0= ruleAnnotation ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ANNOTATION_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:283:1: (lv_annotation_5_0= ruleAnnotation )
                    	    {
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:283:1: (lv_annotation_5_0= ruleAnnotation )
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:284:3: lv_annotation_5_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnonymousConceptDefAccess().getAnnotationAnnotationParserRuleCall_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnonymousConceptDef525);
                    	    lv_annotation_5_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnonymousConceptDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotation",
                    	            		lv_annotation_5_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:300:3: ( (lv_child_6_0= ruleSubconceptOrAttribute ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID||LA5_0==22) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:301:1: (lv_child_6_0= ruleSubconceptOrAttribute )
                    	    {
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:301:1: (lv_child_6_0= ruleSubconceptOrAttribute )
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:302:3: lv_child_6_0= ruleSubconceptOrAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAnonymousConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_ruleAnonymousConceptDef547);
                    	    lv_child_6_0=ruleSubconceptOrAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAnonymousConceptDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"child",
                    	            		lv_child_6_0, 
                    	            		"SubconceptOrAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleAnonymousConceptDef560); 

                        	newLeafNode(otherlv_7, grammarAccess.getAnonymousConceptDefAccess().getRightCurlyBracketKeyword_2_3());
                        

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
    // $ANTLR end "ruleAnonymousConceptDef"


    // $ANTLR start "entryRuleNamedConceptDef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:330:1: entryRuleNamedConceptDef returns [EObject current=null] : iv_ruleNamedConceptDef= ruleNamedConceptDef EOF ;
    public final EObject entryRuleNamedConceptDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedConceptDef = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:331:2: (iv_ruleNamedConceptDef= ruleNamedConceptDef EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:332:2: iv_ruleNamedConceptDef= ruleNamedConceptDef EOF
            {
             newCompositeNode(grammarAccess.getNamedConceptDefRule()); 
            pushFollow(FOLLOW_ruleNamedConceptDef_in_entryRuleNamedConceptDef598);
            iv_ruleNamedConceptDef=ruleNamedConceptDef();

            state._fsp--;

             current =iv_ruleNamedConceptDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedConceptDef608); 

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
    // $ANTLR end "entryRuleNamedConceptDef"


    // $ANTLR start "ruleNamedConceptDef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:339:1: ruleNamedConceptDef returns [EObject current=null] : ( ( (lv_named_0_0= 'concept' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_mapping_3_0= ruleMapping ) ) otherlv_4= '>' )? (otherlv_5= '{' ( (lv_annotation_6_0= ruleAnnotation ) )* ( (lv_child_7_0= ruleSubconceptOrAttribute ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleNamedConceptDef() throws RecognitionException {
        EObject current = null;

        Token lv_named_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_mapping_3_0 = null;

        EObject lv_annotation_6_0 = null;

        EObject lv_child_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:342:28: ( ( ( (lv_named_0_0= 'concept' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_mapping_3_0= ruleMapping ) ) otherlv_4= '>' )? (otherlv_5= '{' ( (lv_annotation_6_0= ruleAnnotation ) )* ( (lv_child_7_0= ruleSubconceptOrAttribute ) )* otherlv_8= '}' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:343:1: ( ( (lv_named_0_0= 'concept' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_mapping_3_0= ruleMapping ) ) otherlv_4= '>' )? (otherlv_5= '{' ( (lv_annotation_6_0= ruleAnnotation ) )* ( (lv_child_7_0= ruleSubconceptOrAttribute ) )* otherlv_8= '}' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:343:1: ( ( (lv_named_0_0= 'concept' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_mapping_3_0= ruleMapping ) ) otherlv_4= '>' )? (otherlv_5= '{' ( (lv_annotation_6_0= ruleAnnotation ) )* ( (lv_child_7_0= ruleSubconceptOrAttribute ) )* otherlv_8= '}' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:343:2: ( (lv_named_0_0= 'concept' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '<' ( (lv_mapping_3_0= ruleMapping ) ) otherlv_4= '>' )? (otherlv_5= '{' ( (lv_annotation_6_0= ruleAnnotation ) )* ( (lv_child_7_0= ruleSubconceptOrAttribute ) )* otherlv_8= '}' )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:343:2: ( (lv_named_0_0= 'concept' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:344:1: (lv_named_0_0= 'concept' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:344:1: (lv_named_0_0= 'concept' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:345:3: lv_named_0_0= 'concept'
            {
            lv_named_0_0=(Token)match(input,18,FOLLOW_18_in_ruleNamedConceptDef651); 

                    newLeafNode(lv_named_0_0, grammarAccess.getNamedConceptDefAccess().getNamedConceptKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedConceptDefRule());
            	        }
                   		setWithLastConsumed(current, "named", true, "concept");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:358:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:359:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:359:1: (lv_name_1_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:360:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedConceptDef681); 

            			newLeafNode(lv_name_1_0, grammarAccess.getNamedConceptDefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedConceptDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:376:2: (otherlv_2= '<' ( (lv_mapping_3_0= ruleMapping ) ) otherlv_4= '>' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:376:4: otherlv_2= '<' ( (lv_mapping_3_0= ruleMapping ) ) otherlv_4= '>'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleNamedConceptDef699); 

                        	newLeafNode(otherlv_2, grammarAccess.getNamedConceptDefAccess().getLessThanSignKeyword_2_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:380:1: ( (lv_mapping_3_0= ruleMapping ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:381:1: (lv_mapping_3_0= ruleMapping )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:381:1: (lv_mapping_3_0= ruleMapping )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:382:3: lv_mapping_3_0= ruleMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getNamedConceptDefAccess().getMappingMappingParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapping_in_ruleNamedConceptDef720);
                    lv_mapping_3_0=ruleMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNamedConceptDefRule());
                    	        }
                           		set(
                           			current, 
                           			"mapping",
                            		lv_mapping_3_0, 
                            		"Mapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleNamedConceptDef732); 

                        	newLeafNode(otherlv_4, grammarAccess.getNamedConceptDefAccess().getGreaterThanSignKeyword_2_2());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:402:3: (otherlv_5= '{' ( (lv_annotation_6_0= ruleAnnotation ) )* ( (lv_child_7_0= ruleSubconceptOrAttribute ) )* otherlv_8= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:402:5: otherlv_5= '{' ( (lv_annotation_6_0= ruleAnnotation ) )* ( (lv_child_7_0= ruleSubconceptOrAttribute ) )* otherlv_8= '}'
                    {
                    otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleNamedConceptDef747); 

                        	newLeafNode(otherlv_5, grammarAccess.getNamedConceptDefAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:406:1: ( (lv_annotation_6_0= ruleAnnotation ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ANNOTATION_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:407:1: (lv_annotation_6_0= ruleAnnotation )
                    	    {
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:407:1: (lv_annotation_6_0= ruleAnnotation )
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:408:3: lv_annotation_6_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNamedConceptDefAccess().getAnnotationAnnotationParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleNamedConceptDef768);
                    	    lv_annotation_6_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNamedConceptDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotation",
                    	            		lv_annotation_6_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:424:3: ( (lv_child_7_0= ruleSubconceptOrAttribute ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:425:1: (lv_child_7_0= ruleSubconceptOrAttribute )
                    	    {
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:425:1: (lv_child_7_0= ruleSubconceptOrAttribute )
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:426:3: lv_child_7_0= ruleSubconceptOrAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getNamedConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_ruleNamedConceptDef790);
                    	    lv_child_7_0=ruleSubconceptOrAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getNamedConceptDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"child",
                    	            		lv_child_7_0, 
                    	            		"SubconceptOrAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleNamedConceptDef803); 

                        	newLeafNode(otherlv_8, grammarAccess.getNamedConceptDefAccess().getRightCurlyBracketKeyword_3_3());
                        

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
    // $ANTLR end "ruleNamedConceptDef"


    // $ANTLR start "entryRuleTopConceptDef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:454:1: entryRuleTopConceptDef returns [EObject current=null] : iv_ruleTopConceptDef= ruleTopConceptDef EOF ;
    public final EObject entryRuleTopConceptDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopConceptDef = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:455:2: (iv_ruleTopConceptDef= ruleTopConceptDef EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:456:2: iv_ruleTopConceptDef= ruleTopConceptDef EOF
            {
             newCompositeNode(grammarAccess.getTopConceptDefRule()); 
            pushFollow(FOLLOW_ruleTopConceptDef_in_entryRuleTopConceptDef841);
            iv_ruleTopConceptDef=ruleTopConceptDef();

            state._fsp--;

             current =iv_ruleTopConceptDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopConceptDef851); 

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
    // $ANTLR end "entryRuleTopConceptDef"


    // $ANTLR start "ruleTopConceptDef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:463:1: ruleTopConceptDef returns [EObject current=null] : ( ( (lv_top_0_0= 'top' ) ) ( (lv_named_1_0= 'concept' ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? (otherlv_6= '{' ( (lv_annotation_7_0= ruleAnnotation ) )* ( (lv_child_8_0= ruleSubconceptOrAttribute ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleTopConceptDef() throws RecognitionException {
        EObject current = null;

        Token lv_top_0_0=null;
        Token lv_named_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_mapping_4_0 = null;

        EObject lv_annotation_7_0 = null;

        EObject lv_child_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:466:28: ( ( ( (lv_top_0_0= 'top' ) ) ( (lv_named_1_0= 'concept' ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? (otherlv_6= '{' ( (lv_annotation_7_0= ruleAnnotation ) )* ( (lv_child_8_0= ruleSubconceptOrAttribute ) )* otherlv_9= '}' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:467:1: ( ( (lv_top_0_0= 'top' ) ) ( (lv_named_1_0= 'concept' ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? (otherlv_6= '{' ( (lv_annotation_7_0= ruleAnnotation ) )* ( (lv_child_8_0= ruleSubconceptOrAttribute ) )* otherlv_9= '}' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:467:1: ( ( (lv_top_0_0= 'top' ) ) ( (lv_named_1_0= 'concept' ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? (otherlv_6= '{' ( (lv_annotation_7_0= ruleAnnotation ) )* ( (lv_child_8_0= ruleSubconceptOrAttribute ) )* otherlv_9= '}' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:467:2: ( (lv_top_0_0= 'top' ) ) ( (lv_named_1_0= 'concept' ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? (otherlv_6= '{' ( (lv_annotation_7_0= ruleAnnotation ) )* ( (lv_child_8_0= ruleSubconceptOrAttribute ) )* otherlv_9= '}' )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:467:2: ( (lv_top_0_0= 'top' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:468:1: (lv_top_0_0= 'top' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:468:1: (lv_top_0_0= 'top' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:469:3: lv_top_0_0= 'top'
            {
            lv_top_0_0=(Token)match(input,19,FOLLOW_19_in_ruleTopConceptDef894); 

                    newLeafNode(lv_top_0_0, grammarAccess.getTopConceptDefAccess().getTopTopKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTopConceptDefRule());
            	        }
                   		setWithLastConsumed(current, "top", true, "top");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:482:2: ( (lv_named_1_0= 'concept' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:483:1: (lv_named_1_0= 'concept' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:483:1: (lv_named_1_0= 'concept' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:484:3: lv_named_1_0= 'concept'
            {
            lv_named_1_0=(Token)match(input,18,FOLLOW_18_in_ruleTopConceptDef925); 

                    newLeafNode(lv_named_1_0, grammarAccess.getTopConceptDefAccess().getNamedConceptKeyword_1_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTopConceptDefRule());
            	        }
                   		setWithLastConsumed(current, "named", true, "concept");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:497:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:498:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:498:1: (lv_name_2_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:499:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTopConceptDef955); 

            			newLeafNode(lv_name_2_0, grammarAccess.getTopConceptDefAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTopConceptDefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:515:2: (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:515:4: otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleTopConceptDef973); 

                        	newLeafNode(otherlv_3, grammarAccess.getTopConceptDefAccess().getLessThanSignKeyword_3_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:519:1: ( (lv_mapping_4_0= ruleMapping ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:520:1: (lv_mapping_4_0= ruleMapping )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:520:1: (lv_mapping_4_0= ruleMapping )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:521:3: lv_mapping_4_0= ruleMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getTopConceptDefAccess().getMappingMappingParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapping_in_ruleTopConceptDef994);
                    lv_mapping_4_0=ruleMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTopConceptDefRule());
                    	        }
                           		set(
                           			current, 
                           			"mapping",
                            		lv_mapping_4_0, 
                            		"Mapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleTopConceptDef1006); 

                        	newLeafNode(otherlv_5, grammarAccess.getTopConceptDefAccess().getGreaterThanSignKeyword_3_2());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:541:3: (otherlv_6= '{' ( (lv_annotation_7_0= ruleAnnotation ) )* ( (lv_child_8_0= ruleSubconceptOrAttribute ) )* otherlv_9= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:541:5: otherlv_6= '{' ( (lv_annotation_7_0= ruleAnnotation ) )* ( (lv_child_8_0= ruleSubconceptOrAttribute ) )* otherlv_9= '}'
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleTopConceptDef1021); 

                        	newLeafNode(otherlv_6, grammarAccess.getTopConceptDefAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:545:1: ( (lv_annotation_7_0= ruleAnnotation ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==RULE_ANNOTATION_ID) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:546:1: (lv_annotation_7_0= ruleAnnotation )
                    	    {
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:546:1: (lv_annotation_7_0= ruleAnnotation )
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:547:3: lv_annotation_7_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTopConceptDefAccess().getAnnotationAnnotationParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleTopConceptDef1042);
                    	    lv_annotation_7_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTopConceptDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotation",
                    	            		lv_annotation_7_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:563:3: ( (lv_child_8_0= ruleSubconceptOrAttribute ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID||LA13_0==22) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:564:1: (lv_child_8_0= ruleSubconceptOrAttribute )
                    	    {
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:564:1: (lv_child_8_0= ruleSubconceptOrAttribute )
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:565:3: lv_child_8_0= ruleSubconceptOrAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTopConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_ruleTopConceptDef1064);
                    	    lv_child_8_0=ruleSubconceptOrAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTopConceptDefRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"child",
                    	            		lv_child_8_0, 
                    	            		"SubconceptOrAttribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleTopConceptDef1077); 

                        	newLeafNode(otherlv_9, grammarAccess.getTopConceptDefAccess().getRightCurlyBracketKeyword_4_3());
                        

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
    // $ANTLR end "ruleTopConceptDef"


    // $ANTLR start "entryRuleSubconceptOrAttribute"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:593:1: entryRuleSubconceptOrAttribute returns [EObject current=null] : iv_ruleSubconceptOrAttribute= ruleSubconceptOrAttribute EOF ;
    public final EObject entryRuleSubconceptOrAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubconceptOrAttribute = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:594:2: (iv_ruleSubconceptOrAttribute= ruleSubconceptOrAttribute EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:595:2: iv_ruleSubconceptOrAttribute= ruleSubconceptOrAttribute EOF
            {
             newCompositeNode(grammarAccess.getSubconceptOrAttributeRule()); 
            pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_entryRuleSubconceptOrAttribute1115);
            iv_ruleSubconceptOrAttribute=ruleSubconceptOrAttribute();

            state._fsp--;

             current =iv_ruleSubconceptOrAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubconceptOrAttribute1125); 

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
    // $ANTLR end "entryRuleSubconceptOrAttribute"


    // $ANTLR start "ruleSubconceptOrAttribute"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:602:1: ruleSubconceptOrAttribute returns [EObject current=null] : (this_Subconcept_0= ruleSubconcept | this_Attribute_1= ruleAttribute ) ;
    public final EObject ruleSubconceptOrAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_Subconcept_0 = null;

        EObject this_Attribute_1 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:605:28: ( (this_Subconcept_0= ruleSubconcept | this_Attribute_1= ruleAttribute ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:606:1: (this_Subconcept_0= ruleSubconcept | this_Attribute_1= ruleAttribute )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:606:1: (this_Subconcept_0= ruleSubconcept | this_Attribute_1= ruleAttribute )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==22) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:607:5: this_Subconcept_0= ruleSubconcept
                    {
                     
                            newCompositeNode(grammarAccess.getSubconceptOrAttributeAccess().getSubconceptParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSubconcept_in_ruleSubconceptOrAttribute1172);
                    this_Subconcept_0=ruleSubconcept();

                    state._fsp--;

                     
                            current = this_Subconcept_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:617:5: this_Attribute_1= ruleAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getSubconceptOrAttributeAccess().getAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAttribute_in_ruleSubconceptOrAttribute1199);
                    this_Attribute_1=ruleAttribute();

                    state._fsp--;

                     
                            current = this_Attribute_1; 
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
    // $ANTLR end "ruleSubconceptOrAttribute"


    // $ANTLR start "entryRuleSubconcept"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:633:1: entryRuleSubconcept returns [EObject current=null] : iv_ruleSubconcept= ruleSubconcept EOF ;
    public final EObject entryRuleSubconcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubconcept = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:634:2: (iv_ruleSubconcept= ruleSubconcept EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:635:2: iv_ruleSubconcept= ruleSubconcept EOF
            {
             newCompositeNode(grammarAccess.getSubconceptRule()); 
            pushFollow(FOLLOW_ruleSubconcept_in_entryRuleSubconcept1234);
            iv_ruleSubconcept=ruleSubconcept();

            state._fsp--;

             current =iv_ruleSubconcept; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubconcept1244); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:642:1: ruleSubconcept returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( (lv_essential_2_0= '!' ) )? ( (otherlv_3= ':' ( (lv_def_4_0= ruleNamedConceptDef ) ) ) | ( (lv_def_5_0= ruleAnonymousConceptDef ) ) | ( ( (lv_reference_6_0= ':' ) ) ( (otherlv_7= RULE_ID ) ) ) ) ) ;
    public final EObject ruleSubconcept() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_essential_2_0=null;
        Token otherlv_3=null;
        Token lv_reference_6_0=null;
        Token otherlv_7=null;
        EObject lv_cardinality_1_0 = null;

        EObject lv_def_4_0 = null;

        EObject lv_def_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:645:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( (lv_essential_2_0= '!' ) )? ( (otherlv_3= ':' ( (lv_def_4_0= ruleNamedConceptDef ) ) ) | ( (lv_def_5_0= ruleAnonymousConceptDef ) ) | ( ( (lv_reference_6_0= ':' ) ) ( (otherlv_7= RULE_ID ) ) ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:646:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( (lv_essential_2_0= '!' ) )? ( (otherlv_3= ':' ( (lv_def_4_0= ruleNamedConceptDef ) ) ) | ( (lv_def_5_0= ruleAnonymousConceptDef ) ) | ( ( (lv_reference_6_0= ':' ) ) ( (otherlv_7= RULE_ID ) ) ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:646:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( (lv_essential_2_0= '!' ) )? ( (otherlv_3= ':' ( (lv_def_4_0= ruleNamedConceptDef ) ) ) | ( (lv_def_5_0= ruleAnonymousConceptDef ) ) | ( ( (lv_reference_6_0= ':' ) ) ( (otherlv_7= RULE_ID ) ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:646:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( (lv_essential_2_0= '!' ) )? ( (otherlv_3= ':' ( (lv_def_4_0= ruleNamedConceptDef ) ) ) | ( (lv_def_5_0= ruleAnonymousConceptDef ) ) | ( ( (lv_reference_6_0= ':' ) ) ( (otherlv_7= RULE_ID ) ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:646:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:647:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:647:1: (lv_name_0_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:648:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubconcept1286); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSubconceptAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSubconceptRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:664:2: ( (lv_cardinality_1_0= ruleCardinality ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=23 && LA16_0<=24)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:665:1: (lv_cardinality_1_0= ruleCardinality )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:665:1: (lv_cardinality_1_0= ruleCardinality )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:666:3: lv_cardinality_1_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubconceptAccess().getCardinalityCardinalityParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleSubconcept1312);
                    lv_cardinality_1_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubconceptRule());
                    	        }
                           		set(
                           			current, 
                           			"cardinality",
                            		lv_cardinality_1_0, 
                            		"Cardinality");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:682:3: ( (lv_essential_2_0= '!' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:683:1: (lv_essential_2_0= '!' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:683:1: (lv_essential_2_0= '!' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:684:3: lv_essential_2_0= '!'
                    {
                    lv_essential_2_0=(Token)match(input,20,FOLLOW_20_in_ruleSubconcept1331); 

                            newLeafNode(lv_essential_2_0, grammarAccess.getSubconceptAccess().getEssentialExclamationMarkKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubconceptRule());
                    	        }
                           		setWithLastConsumed(current, "essential", true, "!");
                    	    

                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:697:3: ( (otherlv_3= ':' ( (lv_def_4_0= ruleNamedConceptDef ) ) ) | ( (lv_def_5_0= ruleAnonymousConceptDef ) ) | ( ( (lv_reference_6_0= ':' ) ) ( (otherlv_7= RULE_ID ) ) ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==RULE_ID) ) {
                    alt18=3;
                }
                else if ( (LA18_1==18) ) {
                    alt18=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==EOF||LA18_0==RULE_ID||(LA18_0>=13 && LA18_0<=14)||LA18_0==16||LA18_0==22) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:697:4: (otherlv_3= ':' ( (lv_def_4_0= ruleNamedConceptDef ) ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:697:4: (otherlv_3= ':' ( (lv_def_4_0= ruleNamedConceptDef ) ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:697:6: otherlv_3= ':' ( (lv_def_4_0= ruleNamedConceptDef ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleSubconcept1359); 

                        	newLeafNode(otherlv_3, grammarAccess.getSubconceptAccess().getColonKeyword_3_0_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:701:1: ( (lv_def_4_0= ruleNamedConceptDef ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:702:1: (lv_def_4_0= ruleNamedConceptDef )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:702:1: (lv_def_4_0= ruleNamedConceptDef )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:703:3: lv_def_4_0= ruleNamedConceptDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubconceptAccess().getDefNamedConceptDefParserRuleCall_3_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNamedConceptDef_in_ruleSubconcept1380);
                    lv_def_4_0=ruleNamedConceptDef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubconceptRule());
                    	        }
                           		set(
                           			current, 
                           			"def",
                            		lv_def_4_0, 
                            		"NamedConceptDef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:720:6: ( (lv_def_5_0= ruleAnonymousConceptDef ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:720:6: ( (lv_def_5_0= ruleAnonymousConceptDef ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:721:1: (lv_def_5_0= ruleAnonymousConceptDef )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:721:1: (lv_def_5_0= ruleAnonymousConceptDef )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:722:3: lv_def_5_0= ruleAnonymousConceptDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubconceptAccess().getDefAnonymousConceptDefParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAnonymousConceptDef_in_ruleSubconcept1408);
                    lv_def_5_0=ruleAnonymousConceptDef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSubconceptRule());
                    	        }
                           		set(
                           			current, 
                           			"def",
                            		lv_def_5_0, 
                            		"AnonymousConceptDef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:739:6: ( ( (lv_reference_6_0= ':' ) ) ( (otherlv_7= RULE_ID ) ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:739:6: ( ( (lv_reference_6_0= ':' ) ) ( (otherlv_7= RULE_ID ) ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:739:7: ( (lv_reference_6_0= ':' ) ) ( (otherlv_7= RULE_ID ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:739:7: ( (lv_reference_6_0= ':' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:740:1: (lv_reference_6_0= ':' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:740:1: (lv_reference_6_0= ':' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:741:3: lv_reference_6_0= ':'
                    {
                    lv_reference_6_0=(Token)match(input,21,FOLLOW_21_in_ruleSubconcept1433); 

                            newLeafNode(lv_reference_6_0, grammarAccess.getSubconceptAccess().getReferenceColonKeyword_3_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubconceptRule());
                    	        }
                           		setWithLastConsumed(current, "reference", true, ":");
                    	    

                    }


                    }

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:754:2: ( (otherlv_7= RULE_ID ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:755:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:755:1: (otherlv_7= RULE_ID )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:756:3: otherlv_7= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSubconceptRule());
                    	        }
                            
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubconcept1466); 

                    		newLeafNode(otherlv_7, grammarAccess.getSubconceptAccess().getRefConceptDefCrossReference_3_2_1_0()); 
                    	

                    }


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


    // $ANTLR start "entryRuleAttribute"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:775:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:776:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:777:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1504);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1514); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:784:1: ruleAttribute returns [EObject current=null] : ( ( (lv_attrib_0_0= 'attrib' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_essential_3_0= '!' ) )? (otherlv_4= '<' ( (lv_attribMapping_5_0= ruleMapping ) ) otherlv_6= '>' )? (otherlv_7= '{' ( (lv_annotation_8_0= ruleAnnotation ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_attrib_0_0=null;
        Token lv_name_1_0=null;
        Token lv_essential_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_cardinality_2_0 = null;

        EObject lv_attribMapping_5_0 = null;

        EObject lv_annotation_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:787:28: ( ( ( (lv_attrib_0_0= 'attrib' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_essential_3_0= '!' ) )? (otherlv_4= '<' ( (lv_attribMapping_5_0= ruleMapping ) ) otherlv_6= '>' )? (otherlv_7= '{' ( (lv_annotation_8_0= ruleAnnotation ) )* otherlv_9= '}' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:788:1: ( ( (lv_attrib_0_0= 'attrib' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_essential_3_0= '!' ) )? (otherlv_4= '<' ( (lv_attribMapping_5_0= ruleMapping ) ) otherlv_6= '>' )? (otherlv_7= '{' ( (lv_annotation_8_0= ruleAnnotation ) )* otherlv_9= '}' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:788:1: ( ( (lv_attrib_0_0= 'attrib' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_essential_3_0= '!' ) )? (otherlv_4= '<' ( (lv_attribMapping_5_0= ruleMapping ) ) otherlv_6= '>' )? (otherlv_7= '{' ( (lv_annotation_8_0= ruleAnnotation ) )* otherlv_9= '}' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:788:2: ( (lv_attrib_0_0= 'attrib' ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_cardinality_2_0= ruleCardinality ) )? ( (lv_essential_3_0= '!' ) )? (otherlv_4= '<' ( (lv_attribMapping_5_0= ruleMapping ) ) otherlv_6= '>' )? (otherlv_7= '{' ( (lv_annotation_8_0= ruleAnnotation ) )* otherlv_9= '}' )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:788:2: ( (lv_attrib_0_0= 'attrib' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:789:1: (lv_attrib_0_0= 'attrib' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:789:1: (lv_attrib_0_0= 'attrib' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:790:3: lv_attrib_0_0= 'attrib'
            {
            lv_attrib_0_0=(Token)match(input,22,FOLLOW_22_in_ruleAttribute1557); 

                    newLeafNode(lv_attrib_0_0, grammarAccess.getAttributeAccess().getAttribAttribKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(current, "attrib", true, "attrib");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:803:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:804:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:804:1: (lv_name_1_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:805:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute1587); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:821:2: ( (lv_cardinality_2_0= ruleCardinality ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=23 && LA19_0<=24)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:822:1: (lv_cardinality_2_0= ruleCardinality )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:822:1: (lv_cardinality_2_0= ruleCardinality )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:823:3: lv_cardinality_2_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getCardinalityCardinalityParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleAttribute1613);
                    lv_cardinality_2_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:839:3: ( (lv_essential_3_0= '!' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:840:1: (lv_essential_3_0= '!' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:840:1: (lv_essential_3_0= '!' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:841:3: lv_essential_3_0= '!'
                    {
                    lv_essential_3_0=(Token)match(input,20,FOLLOW_20_in_ruleAttribute1632); 

                            newLeafNode(lv_essential_3_0, grammarAccess.getAttributeAccess().getEssentialExclamationMarkKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "essential", true, "!");
                    	    

                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:854:3: (otherlv_4= '<' ( (lv_attribMapping_5_0= ruleMapping ) ) otherlv_6= '>' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:854:5: otherlv_4= '<' ( (lv_attribMapping_5_0= ruleMapping ) ) otherlv_6= '>'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleAttribute1659); 

                        	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getLessThanSignKeyword_4_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:858:1: ( (lv_attribMapping_5_0= ruleMapping ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:859:1: (lv_attribMapping_5_0= ruleMapping )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:859:1: (lv_attribMapping_5_0= ruleMapping )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:860:3: lv_attribMapping_5_0= ruleMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getAttribMappingMappingParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapping_in_ruleAttribute1680);
                    lv_attribMapping_5_0=ruleMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"attribMapping",
                            		lv_attribMapping_5_0, 
                            		"Mapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleAttribute1692); 

                        	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getGreaterThanSignKeyword_4_2());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:880:3: (otherlv_7= '{' ( (lv_annotation_8_0= ruleAnnotation ) )* otherlv_9= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==13) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:880:5: otherlv_7= '{' ( (lv_annotation_8_0= ruleAnnotation ) )* otherlv_9= '}'
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleAttribute1707); 

                        	newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:884:1: ( (lv_annotation_8_0= ruleAnnotation ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==RULE_ANNOTATION_ID) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:885:1: (lv_annotation_8_0= ruleAnnotation )
                    	    {
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:885:1: (lv_annotation_8_0= ruleAnnotation )
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:886:3: lv_annotation_8_0= ruleAnnotation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAttributeAccess().getAnnotationAnnotationParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAttribute1728);
                    	    lv_annotation_8_0=ruleAnnotation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"annotation",
                    	            		lv_annotation_8_0, 
                    	            		"Annotation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleAttribute1741); 

                        	newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2());
                        

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleCardinality"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:914:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:915:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:916:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality1779);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality1789); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:923:1: ruleCardinality returns [EObject current=null] : ( ( (lv_zeroOrMore_0_0= '*' ) ) | ( (lv_oneOrMore_1_0= '+' ) ) ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token lv_zeroOrMore_0_0=null;
        Token lv_oneOrMore_1_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:926:28: ( ( ( (lv_zeroOrMore_0_0= '*' ) ) | ( (lv_oneOrMore_1_0= '+' ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:927:1: ( ( (lv_zeroOrMore_0_0= '*' ) ) | ( (lv_oneOrMore_1_0= '+' ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:927:1: ( ( (lv_zeroOrMore_0_0= '*' ) ) | ( (lv_oneOrMore_1_0= '+' ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            else if ( (LA24_0==24) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:927:2: ( (lv_zeroOrMore_0_0= '*' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:927:2: ( (lv_zeroOrMore_0_0= '*' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:928:1: (lv_zeroOrMore_0_0= '*' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:928:1: (lv_zeroOrMore_0_0= '*' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:929:3: lv_zeroOrMore_0_0= '*'
                    {
                    lv_zeroOrMore_0_0=(Token)match(input,23,FOLLOW_23_in_ruleCardinality1832); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:943:6: ( (lv_oneOrMore_1_0= '+' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:943:6: ( (lv_oneOrMore_1_0= '+' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:944:1: (lv_oneOrMore_1_0= '+' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:944:1: (lv_oneOrMore_1_0= '+' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:945:3: lv_oneOrMore_1_0= '+'
                    {
                    lv_oneOrMore_1_0=(Token)match(input,24,FOLLOW_24_in_ruleCardinality1869); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:966:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:967:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:968:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping1918);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping1928); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:975:1: ruleMapping returns [EObject current=null] : ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        EObject lv_context_0_0 = null;

        EObject lv_mapping_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:978:28: ( ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:979:1: ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:979:1: ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:979:2: ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:979:2: ( (lv_context_0_0= rulePathExpr ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==48) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:980:1: (lv_context_0_0= rulePathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:980:1: (lv_context_0_0= rulePathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:981:3: lv_context_0_0= rulePathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getMappingAccess().getContextPathExprParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePathExpr_in_ruleMapping1974);
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:997:3: ( (lv_mapping_1_0= ruleImplicitContextMapping ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:998:1: (lv_mapping_1_0= ruleImplicitContextMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:998:1: (lv_mapping_1_0= ruleImplicitContextMapping )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:999:3: lv_mapping_1_0= ruleImplicitContextMapping
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getMappingImplicitContextMappingParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_ruleMapping1996);
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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1023:1: entryRuleImplicitContextMapping returns [EObject current=null] : iv_ruleImplicitContextMapping= ruleImplicitContextMapping EOF ;
    public final EObject entryRuleImplicitContextMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitContextMapping = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1024:2: (iv_ruleImplicitContextMapping= ruleImplicitContextMapping EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1025:2: iv_ruleImplicitContextMapping= ruleImplicitContextMapping EOF
            {
             newCompositeNode(grammarAccess.getImplicitContextMappingRule()); 
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_entryRuleImplicitContextMapping2032);
            iv_ruleImplicitContextMapping=ruleImplicitContextMapping();

            state._fsp--;

             current =iv_ruleImplicitContextMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitContextMapping2042); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1032:1: ruleImplicitContextMapping returns [EObject current=null] : (this_Module_0= ruleModule | this_ModuleName_1= ruleModuleName | this_UsesModule_2= ruleUsesModule | this_UsesEntity_3= ruleUsesEntity | this_Call_4= ruleCall | this_Subroutine_5= ruleSubroutine | this_SubroutineName_6= ruleSubroutineName | this_ActualParamByKeyword_7= ruleActualParamByKeyword | this_VariableDeclaration_8= ruleVariableDeclaration ) ;
    public final EObject ruleImplicitContextMapping() throws RecognitionException {
        EObject current = null;

        EObject this_Module_0 = null;

        EObject this_ModuleName_1 = null;

        EObject this_UsesModule_2 = null;

        EObject this_UsesEntity_3 = null;

        EObject this_Call_4 = null;

        EObject this_Subroutine_5 = null;

        EObject this_SubroutineName_6 = null;

        EObject this_ActualParamByKeyword_7 = null;

        EObject this_VariableDeclaration_8 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1035:28: ( (this_Module_0= ruleModule | this_ModuleName_1= ruleModuleName | this_UsesModule_2= ruleUsesModule | this_UsesEntity_3= ruleUsesEntity | this_Call_4= ruleCall | this_Subroutine_5= ruleSubroutine | this_SubroutineName_6= ruleSubroutineName | this_ActualParamByKeyword_7= ruleActualParamByKeyword | this_VariableDeclaration_8= ruleVariableDeclaration ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1036:1: (this_Module_0= ruleModule | this_ModuleName_1= ruleModuleName | this_UsesModule_2= ruleUsesModule | this_UsesEntity_3= ruleUsesEntity | this_Call_4= ruleCall | this_Subroutine_5= ruleSubroutine | this_SubroutineName_6= ruleSubroutineName | this_ActualParamByKeyword_7= ruleActualParamByKeyword | this_VariableDeclaration_8= ruleVariableDeclaration )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1036:1: (this_Module_0= ruleModule | this_ModuleName_1= ruleModuleName | this_UsesModule_2= ruleUsesModule | this_UsesEntity_3= ruleUsesEntity | this_Call_4= ruleCall | this_Subroutine_5= ruleSubroutine | this_SubroutineName_6= ruleSubroutineName | this_ActualParamByKeyword_7= ruleActualParamByKeyword | this_VariableDeclaration_8= ruleVariableDeclaration )
            int alt26=9;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt26=1;
                }
                break;
            case 28:
                {
                alt26=2;
                }
                break;
            case 29:
                {
                alt26=3;
                }
                break;
            case 30:
                {
                alt26=4;
                }
                break;
            case 44:
                {
                alt26=5;
                }
                break;
            case 31:
                {
                alt26=6;
                }
                break;
            case 43:
                {
                alt26=7;
                }
                break;
            case 46:
                {
                alt26=8;
                }
                break;
            case 47:
                {
                alt26=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1037:5: this_Module_0= ruleModule
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getModuleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleModule_in_ruleImplicitContextMapping2089);
                    this_Module_0=ruleModule();

                    state._fsp--;

                     
                            current = this_Module_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1047:5: this_ModuleName_1= ruleModuleName
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getModuleNameParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleModuleName_in_ruleImplicitContextMapping2116);
                    this_ModuleName_1=ruleModuleName();

                    state._fsp--;

                     
                            current = this_ModuleName_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1057:5: this_UsesModule_2= ruleUsesModule
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getUsesModuleParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUsesModule_in_ruleImplicitContextMapping2143);
                    this_UsesModule_2=ruleUsesModule();

                    state._fsp--;

                     
                            current = this_UsesModule_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1067:5: this_UsesEntity_3= ruleUsesEntity
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getUsesEntityParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleUsesEntity_in_ruleImplicitContextMapping2170);
                    this_UsesEntity_3=ruleUsesEntity();

                    state._fsp--;

                     
                            current = this_UsesEntity_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1077:5: this_Call_4= ruleCall
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleImplicitContextMapping2197);
                    this_Call_4=ruleCall();

                    state._fsp--;

                     
                            current = this_Call_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1087:5: this_Subroutine_5= ruleSubroutine
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getSubroutineParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSubroutine_in_ruleImplicitContextMapping2224);
                    this_Subroutine_5=ruleSubroutine();

                    state._fsp--;

                     
                            current = this_Subroutine_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1097:5: this_SubroutineName_6= ruleSubroutineName
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getSubroutineNameParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleSubroutineName_in_ruleImplicitContextMapping2251);
                    this_SubroutineName_6=ruleSubroutineName();

                    state._fsp--;

                     
                            current = this_SubroutineName_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1107:5: this_ActualParamByKeyword_7= ruleActualParamByKeyword
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getActualParamByKeywordParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleActualParamByKeyword_in_ruleImplicitContextMapping2278);
                    this_ActualParamByKeyword_7=ruleActualParamByKeyword();

                    state._fsp--;

                     
                            current = this_ActualParamByKeyword_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1117:5: this_VariableDeclaration_8= ruleVariableDeclaration
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getVariableDeclarationParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleImplicitContextMapping2305);
                    this_VariableDeclaration_8=ruleVariableDeclaration();

                    state._fsp--;

                     
                            current = this_VariableDeclaration_8; 
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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1133:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1134:2: (iv_ruleModule= ruleModule EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1135:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule2340);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule2350); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1142:1: ruleModule returns [EObject current=null] : ( () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1145:28: ( ( () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1146:1: ( () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1146:1: ( () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1146:2: () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1146:2: ()
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1147:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModuleAccess().getModuleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleModule2396); 

                	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1156:1: (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1156:3: otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleModule2409); 

                        	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1160:1: ( (lv_name_3_0= ruleIDOrPathExpr ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1161:1: (lv_name_3_0= ruleIDOrPathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1161:1: (lv_name_3_0= ruleIDOrPathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1162:3: lv_name_3_0= ruleIDOrPathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getNameIDOrPathExprParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleModule2430);
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

                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleModule2442); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1190:1: entryRuleModuleName returns [EObject current=null] : iv_ruleModuleName= ruleModuleName EOF ;
    public final EObject entryRuleModuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleName = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1191:2: (iv_ruleModuleName= ruleModuleName EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1192:2: iv_ruleModuleName= ruleModuleName EOF
            {
             newCompositeNode(grammarAccess.getModuleNameRule()); 
            pushFollow(FOLLOW_ruleModuleName_in_entryRuleModuleName2480);
            iv_ruleModuleName=ruleModuleName();

            state._fsp--;

             current =iv_ruleModuleName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleName2490); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1199:1: ruleModuleName returns [EObject current=null] : ( () otherlv_1= 'moduleName' ) ;
    public final EObject ruleModuleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1202:28: ( ( () otherlv_1= 'moduleName' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1203:1: ( () otherlv_1= 'moduleName' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1203:1: ( () otherlv_1= 'moduleName' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1203:2: () otherlv_1= 'moduleName'
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1203:2: ()
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1204:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModuleNameAccess().getModuleNameAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleModuleName2536); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1221:1: entryRuleUsesModule returns [EObject current=null] : iv_ruleUsesModule= ruleUsesModule EOF ;
    public final EObject entryRuleUsesModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsesModule = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1222:2: (iv_ruleUsesModule= ruleUsesModule EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1223:2: iv_ruleUsesModule= ruleUsesModule EOF
            {
             newCompositeNode(grammarAccess.getUsesModuleRule()); 
            pushFollow(FOLLOW_ruleUsesModule_in_entryRuleUsesModule2572);
            iv_ruleUsesModule=ruleUsesModule();

            state._fsp--;

             current =iv_ruleUsesModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsesModule2582); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1230:1: ruleUsesModule returns [EObject current=null] : (otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleUsesModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1233:28: ( (otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1234:1: (otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1234:1: (otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1234:3: otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleUsesModule2619); 

                	newLeafNode(otherlv_0, grammarAccess.getUsesModuleAccess().getUsesModuleKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleUsesModule2631); 

                	newLeafNode(otherlv_1, grammarAccess.getUsesModuleAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1242:1: ( (lv_name_2_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1243:1: (lv_name_2_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1243:1: (lv_name_2_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1244:3: lv_name_2_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getUsesModuleAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleUsesModule2652);
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

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleUsesModule2664); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1272:1: entryRuleUsesEntity returns [EObject current=null] : iv_ruleUsesEntity= ruleUsesEntity EOF ;
    public final EObject entryRuleUsesEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsesEntity = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1273:2: (iv_ruleUsesEntity= ruleUsesEntity EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1274:2: iv_ruleUsesEntity= ruleUsesEntity EOF
            {
             newCompositeNode(grammarAccess.getUsesEntityRule()); 
            pushFollow(FOLLOW_ruleUsesEntity_in_entryRuleUsesEntity2700);
            iv_ruleUsesEntity=ruleUsesEntity();

            state._fsp--;

             current =iv_ruleUsesEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsesEntity2710); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1281:1: ruleUsesEntity returns [EObject current=null] : (otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleUsesEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1284:28: ( (otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1285:1: (otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1285:1: (otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1285:3: otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleUsesEntity2747); 

                	newLeafNode(otherlv_0, grammarAccess.getUsesEntityAccess().getUsesEntityKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleUsesEntity2759); 

                	newLeafNode(otherlv_1, grammarAccess.getUsesEntityAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1293:1: ( (lv_name_2_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1294:1: (lv_name_2_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1294:1: (lv_name_2_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1295:3: lv_name_2_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getUsesEntityAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleUsesEntity2780);
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

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleUsesEntity2792); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1323:1: entryRuleSubroutine returns [EObject current=null] : iv_ruleSubroutine= ruleSubroutine EOF ;
    public final EObject entryRuleSubroutine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubroutine = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1324:2: (iv_ruleSubroutine= ruleSubroutine EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1325:2: iv_ruleSubroutine= ruleSubroutine EOF
            {
             newCompositeNode(grammarAccess.getSubroutineRule()); 
            pushFollow(FOLLOW_ruleSubroutine_in_entryRuleSubroutine2828);
            iv_ruleSubroutine=ruleSubroutine();

            state._fsp--;

             current =iv_ruleSubroutine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutine2838); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1332:1: ruleSubroutine returns [EObject current=null] : (otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) ;
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
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1335:28: ( (otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1336:1: (otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1336:1: (otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1336:3: otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleSubroutine2875); 

                	newLeafNode(otherlv_0, grammarAccess.getSubroutineAccess().getSubroutineKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleSubroutine2887); 

                	newLeafNode(otherlv_1, grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1344:1: ( (lv_name_2_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1345:1: (lv_name_2_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1345:1: (lv_name_2_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1346:3: lv_name_2_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getSubroutineAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleSubroutine2908);
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1362:2: (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1362:4: otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleSubroutine2921); 

                        	newLeafNode(otherlv_3, grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1366:1: ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( ((LA29_0>=33 && LA29_0<=40)||LA29_0==42) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1366:2: ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )*
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1366:2: ( (lv_params_4_0= ruleFormalParam ) )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1367:1: (lv_params_4_0= ruleFormalParam )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1367:1: (lv_params_4_0= ruleFormalParam )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1368:3: lv_params_4_0= ruleFormalParam
                            {
                             
                            	        newCompositeNode(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFormalParam_in_ruleSubroutine2943);
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

                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1384:2: (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )*
                            loop28:
                            do {
                                int alt28=2;
                                int LA28_0 = input.LA(1);

                                if ( (LA28_0==32) ) {
                                    alt28=1;
                                }


                                switch (alt28) {
                            	case 1 :
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1384:4: otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) )
                            	    {
                            	    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleSubroutine2956); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getSubroutineAccess().getCommaKeyword_3_1_1_0());
                            	        
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1388:1: ( (lv_params_6_0= ruleFormalParam ) )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1389:1: (lv_params_6_0= ruleFormalParam )
                            	    {
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1389:1: (lv_params_6_0= ruleFormalParam )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1390:3: lv_params_6_0= ruleFormalParam
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleFormalParam_in_ruleSubroutine2977);
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
                            	    break loop28;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleSubroutine2993); 

                        	newLeafNode(otherlv_7, grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleSubroutine3007); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1422:1: entryRuleFormalParam returns [EObject current=null] : iv_ruleFormalParam= ruleFormalParam EOF ;
    public final EObject entryRuleFormalParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalParam = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1423:2: (iv_ruleFormalParam= ruleFormalParam EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1424:2: iv_ruleFormalParam= ruleFormalParam EOF
            {
             newCompositeNode(grammarAccess.getFormalParamRule()); 
            pushFollow(FOLLOW_ruleFormalParam_in_entryRuleFormalParam3043);
            iv_ruleFormalParam=ruleFormalParam();

            state._fsp--;

             current =iv_ruleFormalParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalParam3053); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1431:1: ruleFormalParam returns [EObject current=null] : ( ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIDOrPathExpr ) ) ) ;
    public final EObject ruleFormalParam() throws RecognitionException {
        EObject current = null;

        EObject lv_intent_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1434:28: ( ( ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIDOrPathExpr ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1435:1: ( ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIDOrPathExpr ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1435:1: ( ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIDOrPathExpr ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1435:2: ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIDOrPathExpr ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1435:2: ( (lv_intent_0_0= ruleIntent ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=33 && LA31_0<=35)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1436:1: (lv_intent_0_0= ruleIntent )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1436:1: (lv_intent_0_0= ruleIntent )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1437:3: lv_intent_0_0= ruleIntent
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormalParamAccess().getIntentIntentParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntent_in_ruleFormalParam3099);
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1453:3: ( (lv_type_1_0= ruleType ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1454:1: (lv_type_1_0= ruleType )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1454:1: (lv_type_1_0= ruleType )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1455:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getFormalParamAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFormalParam3121);
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1471:2: ( (lv_name_2_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1472:1: (lv_name_2_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1472:1: (lv_name_2_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1473:3: lv_name_2_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getFormalParamAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleFormalParam3142);
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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1497:1: entryRuleIntent returns [EObject current=null] : iv_ruleIntent= ruleIntent EOF ;
    public final EObject entryRuleIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntent = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1498:2: (iv_ruleIntent= ruleIntent EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1499:2: iv_ruleIntent= ruleIntent EOF
            {
             newCompositeNode(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_ruleIntent_in_entryRuleIntent3178);
            iv_ruleIntent=ruleIntent();

            state._fsp--;

             current =iv_ruleIntent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntent3188); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1506:1: ruleIntent returns [EObject current=null] : ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) | ( (lv_inout_2_0= 'inout' ) ) ) ;
    public final EObject ruleIntent() throws RecognitionException {
        EObject current = null;

        Token lv_in_0_0=null;
        Token lv_out_1_0=null;
        Token lv_inout_2_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1509:28: ( ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) | ( (lv_inout_2_0= 'inout' ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1510:1: ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) | ( (lv_inout_2_0= 'inout' ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1510:1: ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) | ( (lv_inout_2_0= 'inout' ) ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt32=1;
                }
                break;
            case 34:
                {
                alt32=2;
                }
                break;
            case 35:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1510:2: ( (lv_in_0_0= 'in' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1510:2: ( (lv_in_0_0= 'in' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1511:1: (lv_in_0_0= 'in' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1511:1: (lv_in_0_0= 'in' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1512:3: lv_in_0_0= 'in'
                    {
                    lv_in_0_0=(Token)match(input,33,FOLLOW_33_in_ruleIntent3231); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1526:6: ( (lv_out_1_0= 'out' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1526:6: ( (lv_out_1_0= 'out' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1527:1: (lv_out_1_0= 'out' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1527:1: (lv_out_1_0= 'out' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1528:3: lv_out_1_0= 'out'
                    {
                    lv_out_1_0=(Token)match(input,34,FOLLOW_34_in_ruleIntent3268); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1542:6: ( (lv_inout_2_0= 'inout' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1542:6: ( (lv_inout_2_0= 'inout' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1543:1: (lv_inout_2_0= 'inout' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1543:1: (lv_inout_2_0= 'inout' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1544:3: lv_inout_2_0= 'inout'
                    {
                    lv_inout_2_0=(Token)match(input,35,FOLLOW_35_in_ruleIntent3305); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1565:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1566:2: (iv_ruleType= ruleType EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1567:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType3354);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType3364); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1574:1: ruleType returns [EObject current=null] : ( ( (lv_integer_0_0= 'integer' ) ) | ( (lv_character_1_0= 'character' ) ) | ( (lv_logical_2_0= 'logical' ) ) | ( (lv_real_3_0= 'real' ) ) | ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? ) | ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' ) ) ;
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
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1577:28: ( ( ( (lv_integer_0_0= 'integer' ) ) | ( (lv_character_1_0= 'character' ) ) | ( (lv_logical_2_0= 'logical' ) ) | ( (lv_real_3_0= 'real' ) ) | ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? ) | ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1578:1: ( ( (lv_integer_0_0= 'integer' ) ) | ( (lv_character_1_0= 'character' ) ) | ( (lv_logical_2_0= 'logical' ) ) | ( (lv_real_3_0= 'real' ) ) | ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? ) | ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1578:1: ( ( (lv_integer_0_0= 'integer' ) ) | ( (lv_character_1_0= 'character' ) ) | ( (lv_logical_2_0= 'logical' ) ) | ( (lv_real_3_0= 'real' ) ) | ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? ) | ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' ) )
            int alt34=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt34=1;
                }
                break;
            case 37:
                {
                alt34=2;
                }
                break;
            case 38:
                {
                alt34=3;
                }
                break;
            case 39:
                {
                alt34=4;
                }
                break;
            case 40:
                {
                alt34=5;
                }
                break;
            case 42:
                {
                alt34=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1578:2: ( (lv_integer_0_0= 'integer' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1578:2: ( (lv_integer_0_0= 'integer' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1579:1: (lv_integer_0_0= 'integer' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1579:1: (lv_integer_0_0= 'integer' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1580:3: lv_integer_0_0= 'integer'
                    {
                    lv_integer_0_0=(Token)match(input,36,FOLLOW_36_in_ruleType3407); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1594:6: ( (lv_character_1_0= 'character' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1594:6: ( (lv_character_1_0= 'character' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1595:1: (lv_character_1_0= 'character' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1595:1: (lv_character_1_0= 'character' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1596:3: lv_character_1_0= 'character'
                    {
                    lv_character_1_0=(Token)match(input,37,FOLLOW_37_in_ruleType3444); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1610:6: ( (lv_logical_2_0= 'logical' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1610:6: ( (lv_logical_2_0= 'logical' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1611:1: (lv_logical_2_0= 'logical' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1611:1: (lv_logical_2_0= 'logical' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1612:3: lv_logical_2_0= 'logical'
                    {
                    lv_logical_2_0=(Token)match(input,38,FOLLOW_38_in_ruleType3481); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1626:6: ( (lv_real_3_0= 'real' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1626:6: ( (lv_real_3_0= 'real' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1627:1: (lv_real_3_0= 'real' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1627:1: (lv_real_3_0= 'real' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1628:3: lv_real_3_0= 'real'
                    {
                    lv_real_3_0=(Token)match(input,39,FOLLOW_39_in_ruleType3518); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1642:6: ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1642:6: ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1642:7: ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )?
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1642:7: ( (lv_double_4_0= 'double' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1643:1: (lv_double_4_0= 'double' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1643:1: (lv_double_4_0= 'double' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1644:3: lv_double_4_0= 'double'
                    {
                    lv_double_4_0=(Token)match(input,40,FOLLOW_40_in_ruleType3556); 

                            newLeafNode(lv_double_4_0, grammarAccess.getTypeAccess().getDoubleDoubleKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "double", true, "double");
                    	    

                    }


                    }

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1657:2: (otherlv_5= 'precision' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==41) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1657:4: otherlv_5= 'precision'
                            {
                            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleType3582); 

                                	newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getPrecisionKeyword_4_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1662:6: ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1662:6: ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1662:7: ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')'
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1662:7: ( (lv_derived_6_0= 'type' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1663:1: (lv_derived_6_0= 'type' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1663:1: (lv_derived_6_0= 'type' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1664:3: lv_derived_6_0= 'type'
                    {
                    lv_derived_6_0=(Token)match(input,42,FOLLOW_42_in_ruleType3610); 

                            newLeafNode(lv_derived_6_0, grammarAccess.getTypeAccess().getDerivedTypeKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "derived", true, "type");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_26_in_ruleType3635); 

                        	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1681:1: ( (lv_derivedType_8_0= ruleIDOrPathExpr ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1682:1: (lv_derivedType_8_0= ruleIDOrPathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1682:1: (lv_derivedType_8_0= ruleIDOrPathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1683:3: lv_derivedType_8_0= ruleIDOrPathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getDerivedTypeIDOrPathExprParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleType3656);
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

                    otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleType3668); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1711:1: entryRuleSubroutineName returns [EObject current=null] : iv_ruleSubroutineName= ruleSubroutineName EOF ;
    public final EObject entryRuleSubroutineName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubroutineName = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1712:2: (iv_ruleSubroutineName= ruleSubroutineName EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1713:2: iv_ruleSubroutineName= ruleSubroutineName EOF
            {
             newCompositeNode(grammarAccess.getSubroutineNameRule()); 
            pushFollow(FOLLOW_ruleSubroutineName_in_entryRuleSubroutineName3705);
            iv_ruleSubroutineName=ruleSubroutineName();

            state._fsp--;

             current =iv_ruleSubroutineName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutineName3715); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1720:1: ruleSubroutineName returns [EObject current=null] : (otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleSubroutineName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1723:28: ( (otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1724:1: (otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1724:1: (otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1724:3: otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleSubroutineName3752); 

                	newLeafNode(otherlv_0, grammarAccess.getSubroutineNameAccess().getSubroutineNameKeyword_0());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1728:1: ()
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1729:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubroutineNameAccess().getSubroutineNameAction_1(),
                        current);
                

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1734:2: (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1734:4: otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleSubroutineName3774); 

                        	newLeafNode(otherlv_2, grammarAccess.getSubroutineNameAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1738:1: ( (lv_name_3_0= ruleIDOrPathExpr ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1739:1: (lv_name_3_0= ruleIDOrPathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1739:1: (lv_name_3_0= ruleIDOrPathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1740:3: lv_name_3_0= ruleIDOrPathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubroutineNameAccess().getNameIDOrPathExprParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleSubroutineName3795);
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

                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleSubroutineName3807); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1768:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1769:2: (iv_ruleCall= ruleCall EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1770:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall3845);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall3855); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1777:1: ruleCall returns [EObject current=null] : (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) ;
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
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1780:28: ( (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1781:1: (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1781:1: (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1781:3: otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleCall3892); 

                	newLeafNode(otherlv_0, grammarAccess.getCallAccess().getCallKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleCall3904); 

                	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1789:1: ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1790:1: (lv_subroutineName_2_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1790:1: (lv_subroutineName_2_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1791:3: lv_subroutineName_2_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getSubroutineNameIDOrPathExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleCall3925);
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1807:2: (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1807:4: otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleCall3938); 

                        	newLeafNode(otherlv_3, grammarAccess.getCallAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1811:1: ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_STRING)||LA37_0==RULE_INT||LA37_0==23||LA37_0==48) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1811:2: ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )*
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1811:2: ( (lv_params_4_0= ruleActualParam ) )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1812:1: (lv_params_4_0= ruleActualParam )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1812:1: (lv_params_4_0= ruleActualParam )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1813:3: lv_params_4_0= ruleActualParam
                            {
                             
                            	        newCompositeNode(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleActualParam_in_ruleCall3960);
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

                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1829:2: (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==32) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1829:4: otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) )
                            	    {
                            	    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleCall3973); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getCallAccess().getCommaKeyword_3_1_1_0());
                            	        
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1833:1: ( (lv_params_6_0= ruleActualParam ) )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1834:1: (lv_params_6_0= ruleActualParam )
                            	    {
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1834:1: (lv_params_6_0= ruleActualParam )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1835:3: lv_params_6_0= ruleActualParam
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleActualParam_in_ruleCall3994);
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
                            	    break loop36;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleCall4010); 

                        	newLeafNode(otherlv_7, grammarAccess.getCallAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleCall4024); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1867:1: entryRuleActualParam returns [EObject current=null] : iv_ruleActualParam= ruleActualParam EOF ;
    public final EObject entryRuleActualParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualParam = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1868:2: (iv_ruleActualParam= ruleActualParam EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1869:2: iv_ruleActualParam= ruleActualParam EOF
            {
             newCompositeNode(grammarAccess.getActualParamRule()); 
            pushFollow(FOLLOW_ruleActualParam_in_entryRuleActualParam4060);
            iv_ruleActualParam=ruleActualParam();

            state._fsp--;

             current =iv_ruleActualParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualParam4070); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1876:1: ruleActualParam returns [EObject current=null] : ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) ) ) ;
    public final EObject ruleActualParam() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1879:28: ( ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1880:1: ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1880:1: ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1880:2: ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1880:2: ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==15||LA40_1==45) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1880:3: ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '='
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1880:3: ( (lv_keyword_0_0= RULE_ID ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1881:1: (lv_keyword_0_0= RULE_ID )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1881:1: (lv_keyword_0_0= RULE_ID )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1882:3: lv_keyword_0_0= RULE_ID
                    {
                    lv_keyword_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActualParam4113); 

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

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1898:2: ( (lv_optional_1_0= '?' ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==45) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1899:1: (lv_optional_1_0= '?' )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1899:1: (lv_optional_1_0= '?' )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1900:3: lv_optional_1_0= '?'
                            {
                            lv_optional_1_0=(Token)match(input,45,FOLLOW_45_in_ruleActualParam4136); 

                                    newLeafNode(lv_optional_1_0, grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActualParamRule());
                            	        }
                                   		setWithLastConsumed(current, "optional", true, "?");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleActualParam4162); 

                        	newLeafNode(otherlv_2, grammarAccess.getActualParamAccess().getEqualsSignKeyword_0_2());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1917:3: ( (lv_value_3_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1918:1: (lv_value_3_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1918:1: (lv_value_3_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1919:3: lv_value_3_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getActualParamAccess().getValueIDOrPathExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleActualParam4185);
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


    // $ANTLR start "entryRuleActualParamByKeyword"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1943:1: entryRuleActualParamByKeyword returns [EObject current=null] : iv_ruleActualParamByKeyword= ruleActualParamByKeyword EOF ;
    public final EObject entryRuleActualParamByKeyword() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualParamByKeyword = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1944:2: (iv_ruleActualParamByKeyword= ruleActualParamByKeyword EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1945:2: iv_ruleActualParamByKeyword= ruleActualParamByKeyword EOF
            {
             newCompositeNode(grammarAccess.getActualParamByKeywordRule()); 
            pushFollow(FOLLOW_ruleActualParamByKeyword_in_entryRuleActualParamByKeyword4221);
            iv_ruleActualParamByKeyword=ruleActualParamByKeyword();

            state._fsp--;

             current =iv_ruleActualParamByKeyword; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualParamByKeyword4231); 

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
    // $ANTLR end "entryRuleActualParamByKeyword"


    // $ANTLR start "ruleActualParamByKeyword"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1952:1: ruleActualParamByKeyword returns [EObject current=null] : (otherlv_0= 'actualParamByKeyword' otherlv_1= '(' ( (lv_keyword_2_0= RULE_ID ) ) otherlv_3= ')' ) ;
    public final EObject ruleActualParamByKeyword() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_keyword_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1955:28: ( (otherlv_0= 'actualParamByKeyword' otherlv_1= '(' ( (lv_keyword_2_0= RULE_ID ) ) otherlv_3= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1956:1: (otherlv_0= 'actualParamByKeyword' otherlv_1= '(' ( (lv_keyword_2_0= RULE_ID ) ) otherlv_3= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1956:1: (otherlv_0= 'actualParamByKeyword' otherlv_1= '(' ( (lv_keyword_2_0= RULE_ID ) ) otherlv_3= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1956:3: otherlv_0= 'actualParamByKeyword' otherlv_1= '(' ( (lv_keyword_2_0= RULE_ID ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleActualParamByKeyword4268); 

                	newLeafNode(otherlv_0, grammarAccess.getActualParamByKeywordAccess().getActualParamByKeywordKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleActualParamByKeyword4280); 

                	newLeafNode(otherlv_1, grammarAccess.getActualParamByKeywordAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1964:1: ( (lv_keyword_2_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1965:1: (lv_keyword_2_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1965:1: (lv_keyword_2_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1966:3: lv_keyword_2_0= RULE_ID
            {
            lv_keyword_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActualParamByKeyword4297); 

            			newLeafNode(lv_keyword_2_0, grammarAccess.getActualParamByKeywordAccess().getKeywordIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActualParamByKeywordRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"keyword",
                    		lv_keyword_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleActualParamByKeyword4314); 

                	newLeafNode(otherlv_3, grammarAccess.getActualParamByKeywordAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleActualParamByKeyword"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1994:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1995:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1996:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4350);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration4360); 

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2003:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'declaration' otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2006:28: ( (otherlv_0= 'declaration' otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2007:1: (otherlv_0= 'declaration' otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2007:1: (otherlv_0= 'declaration' otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2007:3: otherlv_0= 'declaration' otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleVariableDeclaration4397); 

                	newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getDeclarationKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleVariableDeclaration4409); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2015:1: ( (lv_type_2_0= ruleType ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2016:1: (lv_type_2_0= ruleType )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2016:1: (lv_type_2_0= ruleType )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2017:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVariableDeclaration4430);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleVariableDeclaration4442); 

                	newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleIDOrWildcard"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2045:1: entryRuleIDOrWildcard returns [EObject current=null] : iv_ruleIDOrWildcard= ruleIDOrWildcard EOF ;
    public final EObject entryRuleIDOrWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDOrWildcard = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2046:2: (iv_ruleIDOrWildcard= ruleIDOrWildcard EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2047:2: iv_ruleIDOrWildcard= ruleIDOrWildcard EOF
            {
             newCompositeNode(grammarAccess.getIDOrWildcardRule()); 
            pushFollow(FOLLOW_ruleIDOrWildcard_in_entryRuleIDOrWildcard4478);
            iv_ruleIDOrWildcard=ruleIDOrWildcard();

            state._fsp--;

             current =iv_ruleIDOrWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrWildcard4488); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2054:1: ruleIDOrWildcard returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_wildcard_1_0= '*' ) ) ) ;
    public final EObject ruleIDOrWildcard() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_wildcard_1_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2057:28: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_wildcard_1_0= '*' ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2058:1: ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_wildcard_1_0= '*' ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2058:1: ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_wildcard_1_0= '*' ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                alt41=1;
            }
            else if ( (LA41_0==23) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2058:2: ( (lv_id_0_0= RULE_ID ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2058:2: ( (lv_id_0_0= RULE_ID ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2059:1: (lv_id_0_0= RULE_ID )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2059:1: (lv_id_0_0= RULE_ID )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2060:3: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDOrWildcard4530); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2077:6: ( (lv_wildcard_1_0= '*' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2077:6: ( (lv_wildcard_1_0= '*' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2078:1: (lv_wildcard_1_0= '*' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2078:1: (lv_wildcard_1_0= '*' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2079:3: lv_wildcard_1_0= '*'
                    {
                    lv_wildcard_1_0=(Token)match(input,23,FOLLOW_23_in_ruleIDOrWildcard4559); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2100:1: entryRuleIDOrPathExpr returns [EObject current=null] : iv_ruleIDOrPathExpr= ruleIDOrPathExpr EOF ;
    public final EObject entryRuleIDOrPathExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDOrPathExpr = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2101:2: (iv_ruleIDOrPathExpr= ruleIDOrPathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2102:2: iv_ruleIDOrPathExpr= ruleIDOrPathExpr EOF
            {
             newCompositeNode(grammarAccess.getIDOrPathExprRule()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_entryRuleIDOrPathExpr4608);
            iv_ruleIDOrPathExpr=ruleIDOrPathExpr();

            state._fsp--;

             current =iv_ruleIDOrPathExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrPathExpr4618); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2109:1: ruleIDOrPathExpr returns [EObject current=null] : (this_IDOrWildcard_0= ruleIDOrWildcard | this_PathExpr_1= rulePathExpr | ( (lv_literal_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleIDOrPathExpr() throws RecognitionException {
        EObject current = null;

        EObject this_IDOrWildcard_0 = null;

        EObject this_PathExpr_1 = null;

        AntlrDatatypeRuleToken lv_literal_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2112:28: ( (this_IDOrWildcard_0= ruleIDOrWildcard | this_PathExpr_1= rulePathExpr | ( (lv_literal_2_0= ruleLiteral ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2113:1: (this_IDOrWildcard_0= ruleIDOrWildcard | this_PathExpr_1= rulePathExpr | ( (lv_literal_2_0= ruleLiteral ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2113:1: (this_IDOrWildcard_0= ruleIDOrWildcard | this_PathExpr_1= rulePathExpr | ( (lv_literal_2_0= ruleLiteral ) ) )
            int alt42=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 23:
                {
                alt42=1;
                }
                break;
            case 48:
                {
                alt42=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2114:5: this_IDOrWildcard_0= ruleIDOrWildcard
                    {
                     
                            newCompositeNode(grammarAccess.getIDOrPathExprAccess().getIDOrWildcardParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIDOrWildcard_in_ruleIDOrPathExpr4665);
                    this_IDOrWildcard_0=ruleIDOrWildcard();

                    state._fsp--;

                     
                            current = this_IDOrWildcard_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2124:5: this_PathExpr_1= rulePathExpr
                    {
                     
                            newCompositeNode(grammarAccess.getIDOrPathExprAccess().getPathExprParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePathExpr_in_ruleIDOrPathExpr4692);
                    this_PathExpr_1=rulePathExpr();

                    state._fsp--;

                     
                            current = this_PathExpr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2133:6: ( (lv_literal_2_0= ruleLiteral ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2133:6: ( (lv_literal_2_0= ruleLiteral ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2134:1: (lv_literal_2_0= ruleLiteral )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2134:1: (lv_literal_2_0= ruleLiteral )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2135:3: lv_literal_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getIDOrPathExprAccess().getLiteralLiteralParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleIDOrPathExpr4718);
                    lv_literal_2_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIDOrPathExprRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_2_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleIDOrPathExpr"


    // $ANTLR start "entryRuleLiteral"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2159:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2160:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2161:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral4755);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral4766); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2168:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_INT_0= RULE_INT )+ | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2171:28: ( ( (this_INT_0= RULE_INT )+ | this_STRING_1= RULE_STRING ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2172:1: ( (this_INT_0= RULE_INT )+ | this_STRING_1= RULE_STRING )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2172:1: ( (this_INT_0= RULE_INT )+ | this_STRING_1= RULE_STRING )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_INT) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_STRING) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2172:2: (this_INT_0= RULE_INT )+
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2172:2: (this_INT_0= RULE_INT )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_INT) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2172:7: this_INT_0= RULE_INT
                    	    {
                    	    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteral4807); 

                    	    		current.merge(this_INT_0);
                    	        
                    	     
                    	        newLeafNode(this_INT_0, grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt43 >= 1 ) break loop43;
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2180:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral4835); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRulePathExpr"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2195:1: entryRulePathExpr returns [EObject current=null] : iv_rulePathExpr= rulePathExpr EOF ;
    public final EObject entryRulePathExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExpr = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2196:2: (iv_rulePathExpr= rulePathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2197:2: iv_rulePathExpr= rulePathExpr EOF
            {
             newCompositeNode(grammarAccess.getPathExprRule()); 
            pushFollow(FOLLOW_rulePathExpr_in_entryRulePathExpr4880);
            iv_rulePathExpr=rulePathExpr();

            state._fsp--;

             current =iv_rulePathExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExpr4890); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2204:1: rulePathExpr returns [EObject current=null] : (otherlv_0= '#' this_PathExprNode_1= rulePathExprNode ) ;
    public final EObject rulePathExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_PathExprNode_1 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2207:28: ( (otherlv_0= '#' this_PathExprNode_1= rulePathExprNode ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2208:1: (otherlv_0= '#' this_PathExprNode_1= rulePathExprNode )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2208:1: (otherlv_0= '#' this_PathExprNode_1= rulePathExprNode )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2208:3: otherlv_0= '#' this_PathExprNode_1= rulePathExprNode
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_rulePathExpr4927); 

                	newLeafNode(otherlv_0, grammarAccess.getPathExprAccess().getNumberSignKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getPathExprAccess().getPathExprNodeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_rulePathExprNode_in_rulePathExpr4949);
            this_PathExprNode_1=rulePathExprNode();

            state._fsp--;

             
                    current = this_PathExprNode_1; 
                    afterParserOrEnumRuleCall();
                

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


    // $ANTLR start "entryRulePathExprNode"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2229:1: entryRulePathExprNode returns [EObject current=null] : iv_rulePathExprNode= rulePathExprNode EOF ;
    public final EObject entryRulePathExprNode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExprNode = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2230:2: (iv_rulePathExprNode= rulePathExprNode EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2231:2: iv_rulePathExprNode= rulePathExprNode EOF
            {
             newCompositeNode(grammarAccess.getPathExprNodeRule()); 
            pushFollow(FOLLOW_rulePathExprNode_in_entryRulePathExprNode4984);
            iv_rulePathExprNode=rulePathExprNode();

            state._fsp--;

             current =iv_rulePathExprNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExprNode4994); 

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
    // $ANTLR end "entryRulePathExprNode"


    // $ANTLR start "rulePathExprNode"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2238:1: rulePathExprNode returns [EObject current=null] : (this_PathExprTerm_0= rulePathExprTerm ( () otherlv_2= '/' ( (otherlv_3= RULE_ID ) ) )* ) ;
    public final EObject rulePathExprNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_PathExprTerm_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2241:28: ( (this_PathExprTerm_0= rulePathExprTerm ( () otherlv_2= '/' ( (otherlv_3= RULE_ID ) ) )* ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2242:1: (this_PathExprTerm_0= rulePathExprTerm ( () otherlv_2= '/' ( (otherlv_3= RULE_ID ) ) )* )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2242:1: (this_PathExprTerm_0= rulePathExprTerm ( () otherlv_2= '/' ( (otherlv_3= RULE_ID ) ) )* )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2243:5: this_PathExprTerm_0= rulePathExprTerm ( () otherlv_2= '/' ( (otherlv_3= RULE_ID ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getPathExprNodeAccess().getPathExprTermParserRuleCall_0()); 
                
            pushFollow(FOLLOW_rulePathExprTerm_in_rulePathExprNode5041);
            this_PathExprTerm_0=rulePathExprTerm();

            state._fsp--;

             
                    current = this_PathExprTerm_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2251:1: ( () otherlv_2= '/' ( (otherlv_3= RULE_ID ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==49) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2251:2: () otherlv_2= '/' ( (otherlv_3= RULE_ID ) )
            	    {
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2251:2: ()
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2252:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getPathExprNodeAccess().getPathExprHeadAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,49,FOLLOW_49_in_rulePathExprNode5062); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPathExprNodeAccess().getSolidusKeyword_1_1());
            	        
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2261:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2262:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2262:1: (otherlv_3= RULE_ID )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2263:3: otherlv_3= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPathExprNodeRule());
            	    	        }
            	            
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathExprNode5082); 

            	    		newLeafNode(otherlv_3, grammarAccess.getPathExprNodeAccess().getTailSubconceptOrAttributeCrossReference_1_2_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // $ANTLR end "rulePathExprNode"


    // $ANTLR start "entryRulePathExprTerm"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2282:1: entryRulePathExprTerm returns [EObject current=null] : iv_rulePathExprTerm= rulePathExprTerm EOF ;
    public final EObject entryRulePathExprTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExprTerm = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2283:2: (iv_rulePathExprTerm= rulePathExprTerm EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2284:2: iv_rulePathExprTerm= rulePathExprTerm EOF
            {
             newCompositeNode(grammarAccess.getPathExprTermRule()); 
            pushFollow(FOLLOW_rulePathExprTerm_in_entryRulePathExprTerm5120);
            iv_rulePathExprTerm=rulePathExprTerm();

            state._fsp--;

             current =iv_rulePathExprTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExprTerm5130); 

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
    // $ANTLR end "entryRulePathExprTerm"


    // $ANTLR start "rulePathExprTerm"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2291:1: rulePathExprTerm returns [EObject current=null] : ( () ( (lv_axis_1_0= ruleAxis ) )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject rulePathExprTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_axis_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2294:28: ( ( () ( (lv_axis_1_0= ruleAxis ) )? ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2295:1: ( () ( (lv_axis_1_0= ruleAxis ) )? ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2295:1: ( () ( (lv_axis_1_0= ruleAxis ) )? ( (otherlv_2= RULE_ID ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2295:2: () ( (lv_axis_1_0= ruleAxis ) )? ( (otherlv_2= RULE_ID ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2295:2: ()
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2296:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPathExprTermAccess().getPathExprTermAction_0(),
                        current);
                

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2301:2: ( (lv_axis_1_0= ruleAxis ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2302:1: (lv_axis_1_0= ruleAxis )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2302:1: (lv_axis_1_0= ruleAxis )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2303:3: lv_axis_1_0= ruleAxis
                    {
                     
                    	        newCompositeNode(grammarAccess.getPathExprTermAccess().getAxisAxisParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAxis_in_rulePathExprTerm5185);
                    lv_axis_1_0=ruleAxis();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPathExprTermRule());
                    	        }
                           		set(
                           			current, 
                           			"axis",
                            		lv_axis_1_0, 
                            		"Axis");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2319:3: ( (otherlv_2= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2320:1: (otherlv_2= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2320:1: (otherlv_2= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2321:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPathExprTermRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathExprTerm5206); 

            		newLeafNode(otherlv_2, grammarAccess.getPathExprTermAccess().getRefSubconceptOrAttributeCrossReference_2_0()); 
            	

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
    // $ANTLR end "rulePathExprTerm"


    // $ANTLR start "entryRuleAxis"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2340:1: entryRuleAxis returns [EObject current=null] : iv_ruleAxis= ruleAxis EOF ;
    public final EObject entryRuleAxis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxis = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2341:2: (iv_ruleAxis= ruleAxis EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2342:2: iv_ruleAxis= ruleAxis EOF
            {
             newCompositeNode(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_ruleAxis_in_entryRuleAxis5242);
            iv_ruleAxis=ruleAxis();

            state._fsp--;

             current =iv_ruleAxis; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAxis5252); 

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
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2349:1: ruleAxis returns [EObject current=null] : ( (lv_ancestor_0_0= '^' ) ) ;
    public final EObject ruleAxis() throws RecognitionException {
        EObject current = null;

        Token lv_ancestor_0_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2352:28: ( ( (lv_ancestor_0_0= '^' ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2353:1: ( (lv_ancestor_0_0= '^' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2353:1: ( (lv_ancestor_0_0= '^' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2354:1: (lv_ancestor_0_0= '^' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2354:1: (lv_ancestor_0_0= '^' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:2355:3: lv_ancestor_0_0= '^'
            {
            lv_ancestor_0_0=(Token)match(input,50,FOLLOW_50_in_ruleAxis5294); 

                    newLeafNode(lv_ancestor_0_0, grammarAccess.getAxisAccess().getAncestorCircumflexAccentKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAxisRule());
            	        }
                   		setWithLastConsumed(current, "ancestor", true, "^");
            	    

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
    // $ANTLR end "ruleAxis"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleLanguage122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLanguage139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLanguage161 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLanguage178 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleTopConceptDef_in_ruleLanguage199 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_ruleNamedConceptDef_in_ruleLanguage220 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_14_in_ruleLanguage233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANNOTATION_ID_in_ruleAnnotation321 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleAnnotation339 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotation356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnonymousConceptDef_in_entryRuleAnonymousConceptDef399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnonymousConceptDef409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAnonymousConceptDef456 = new BitSet(new long[]{0x0001D800F2000000L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleAnonymousConceptDef477 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAnonymousConceptDef489 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleAnonymousConceptDef504 = new BitSet(new long[]{0x0000000000404050L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnonymousConceptDef525 = new BitSet(new long[]{0x0000000000404050L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_ruleAnonymousConceptDef547 = new BitSet(new long[]{0x0000000000404010L});
    public static final BitSet FOLLOW_14_in_ruleAnonymousConceptDef560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedConceptDef_in_entryRuleNamedConceptDef598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedConceptDef608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleNamedConceptDef651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedConceptDef681 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_16_in_ruleNamedConceptDef699 = new BitSet(new long[]{0x0001D800F2000000L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleNamedConceptDef720 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNamedConceptDef732 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleNamedConceptDef747 = new BitSet(new long[]{0x0000000000404050L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleNamedConceptDef768 = new BitSet(new long[]{0x0000000000404050L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_ruleNamedConceptDef790 = new BitSet(new long[]{0x0000000000404010L});
    public static final BitSet FOLLOW_14_in_ruleNamedConceptDef803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopConceptDef_in_entryRuleTopConceptDef841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopConceptDef851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTopConceptDef894 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTopConceptDef925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTopConceptDef955 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_16_in_ruleTopConceptDef973 = new BitSet(new long[]{0x0001D800F2000000L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleTopConceptDef994 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTopConceptDef1006 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleTopConceptDef1021 = new BitSet(new long[]{0x0000000000404050L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleTopConceptDef1042 = new BitSet(new long[]{0x0000000000404050L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_ruleTopConceptDef1064 = new BitSet(new long[]{0x0000000000404010L});
    public static final BitSet FOLLOW_14_in_ruleTopConceptDef1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_entryRuleSubconceptOrAttribute1115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubconceptOrAttribute1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconcept_in_ruleSubconceptOrAttribute1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleSubconceptOrAttribute1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconcept_in_entryRuleSubconcept1234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubconcept1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubconcept1286 = new BitSet(new long[]{0x0000000001B12000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleSubconcept1312 = new BitSet(new long[]{0x0000000000312000L});
    public static final BitSet FOLLOW_20_in_ruleSubconcept1331 = new BitSet(new long[]{0x0000000000212000L});
    public static final BitSet FOLLOW_21_in_ruleSubconcept1359 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleNamedConceptDef_in_ruleSubconcept1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnonymousConceptDef_in_ruleSubconcept1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSubconcept1433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubconcept1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAttribute1557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute1587 = new BitSet(new long[]{0x0000000001912002L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleAttribute1613 = new BitSet(new long[]{0x0000000000112002L});
    public static final BitSet FOLLOW_20_in_ruleAttribute1632 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_16_in_ruleAttribute1659 = new BitSet(new long[]{0x0001D800F2000000L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleAttribute1680 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttribute1692 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleAttribute1707 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAttribute1728 = new BitSet(new long[]{0x0000000000004040L});
    public static final BitSet FOLLOW_14_in_ruleAttribute1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality1779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCardinality1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCardinality1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping1918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_ruleMapping1974 = new BitSet(new long[]{0x0001D800F2000000L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_ruleMapping1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_entryRuleImplicitContextMapping2032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitContextMapping2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleImplicitContextMapping2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleName_in_ruleImplicitContextMapping2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesModule_in_ruleImplicitContextMapping2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesEntity_in_ruleImplicitContextMapping2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleImplicitContextMapping2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_ruleImplicitContextMapping2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutineName_in_ruleImplicitContextMapping2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParamByKeyword_in_ruleImplicitContextMapping2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleImplicitContextMapping2305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule2340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleModule2396 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleModule2409 = new BitSet(new long[]{0x00010000008000B0L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleModule2430 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleModule2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleName_in_entryRuleModuleName2480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleName2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleModuleName2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesModule_in_entryRuleUsesModule2572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsesModule2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleUsesModule2619 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleUsesModule2631 = new BitSet(new long[]{0x00010000008000B0L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleUsesModule2652 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleUsesModule2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesEntity_in_entryRuleUsesEntity2700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsesEntity2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleUsesEntity2747 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleUsesEntity2759 = new BitSet(new long[]{0x00010000008000B0L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleUsesEntity2780 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleUsesEntity2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_entryRuleSubroutine2828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutine2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleSubroutine2875 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSubroutine2887 = new BitSet(new long[]{0x00010000008000B0L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleSubroutine2908 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleSubroutine2921 = new BitSet(new long[]{0x000005FE08000000L});
    public static final BitSet FOLLOW_ruleFormalParam_in_ruleSubroutine2943 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_32_in_ruleSubroutine2956 = new BitSet(new long[]{0x000005FE00000000L});
    public static final BitSet FOLLOW_ruleFormalParam_in_ruleSubroutine2977 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_27_in_ruleSubroutine2993 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSubroutine3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalParam_in_entryRuleFormalParam3043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalParam3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_ruleFormalParam3099 = new BitSet(new long[]{0x000005FE00000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleFormalParam3121 = new BitSet(new long[]{0x00010000008000B0L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleFormalParam3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_entryRuleIntent3178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntent3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleIntent3231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleIntent3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleIntent3305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType3354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleType3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleType3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleType3481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleType3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleType3556 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_ruleType3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleType3610 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleType3635 = new BitSet(new long[]{0x00010000008000B0L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleType3656 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleType3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutineName_in_entryRuleSubroutineName3705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutineName3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSubroutineName3752 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleSubroutineName3774 = new BitSet(new long[]{0x00010000008000B0L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleSubroutineName3795 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSubroutineName3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall3845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall3855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCall3892 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCall3904 = new BitSet(new long[]{0x00010000008000B0L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleCall3925 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleCall3938 = new BitSet(new long[]{0x00010000088000B0L});
    public static final BitSet FOLLOW_ruleActualParam_in_ruleCall3960 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_32_in_ruleCall3973 = new BitSet(new long[]{0x00010000008000B0L});
    public static final BitSet FOLLOW_ruleActualParam_in_ruleCall3994 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_27_in_ruleCall4010 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCall4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_entryRuleActualParam4060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualParam4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActualParam4113 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_45_in_ruleActualParam4136 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleActualParam4162 = new BitSet(new long[]{0x00010000008000B0L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleActualParam4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParamByKeyword_in_entryRuleActualParamByKeyword4221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualParamByKeyword4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleActualParamByKeyword4268 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleActualParamByKeyword4280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActualParamByKeyword4297 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleActualParamByKeyword4314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration4350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVariableDeclaration4397 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleVariableDeclaration4409 = new BitSet(new long[]{0x000005FE00000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration4430 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleVariableDeclaration4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrWildcard_in_entryRuleIDOrWildcard4478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrWildcard4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDOrWildcard4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleIDOrWildcard4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_entryRuleIDOrPathExpr4608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrPathExpr4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrWildcard_in_ruleIDOrPathExpr4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_ruleIDOrPathExpr4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleIDOrPathExpr4718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral4755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral4766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteral4807 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_entryRulePathExpr4880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExpr4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rulePathExpr4927 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_rulePathExprNode_in_rulePathExpr4949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExprNode_in_entryRulePathExprNode4984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExprNode4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExprTerm_in_rulePathExprNode5041 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_rulePathExprNode5062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathExprNode5082 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_rulePathExprTerm_in_entryRulePathExprTerm5120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExprTerm5130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxis_in_rulePathExprTerm5185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathExprTerm5206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxis_in_entryRuleAxis5242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAxis5252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAxis5294 = new BitSet(new long[]{0x0000000000000002L});

}