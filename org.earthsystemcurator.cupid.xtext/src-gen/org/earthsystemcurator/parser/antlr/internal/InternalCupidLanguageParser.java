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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'top'", "'concept'", "'<'", "'>'", "'!'", "'{'", "','", "'}'", "':'", "'*'", "'+'", "'module'", "'('", "')'", "'usesModule'", "'usesEntity'", "'subroutine'", "'in'", "'out'", "'inout'", "'integer'", "'character'", "'logical'", "'real'", "'double'", "'precision'", "'type'", "'subroutineName'", "'call'", "'?'", "'='", "'#'", "'/'", "'..'"
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
    public static final int RULE_INT=5;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:76:1: ruleMappings returns [EObject current=null] : ( ( (lv_mappings_0_0= ruleMapping ) )* ( (lv_concepts_1_0= ruleConceptDef ) )* ) ;
    public final EObject ruleMappings() throws RecognitionException {
        EObject current = null;

        EObject lv_mappings_0_0 = null;

        EObject lv_concepts_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:79:28: ( ( ( (lv_mappings_0_0= ruleMapping ) )* ( (lv_concepts_1_0= ruleConceptDef ) )* ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:80:1: ( ( (lv_mappings_0_0= ruleMapping ) )* ( (lv_concepts_1_0= ruleConceptDef ) )* )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:80:1: ( ( (lv_mappings_0_0= ruleMapping ) )* ( (lv_concepts_1_0= ruleConceptDef ) )* )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:80:2: ( (lv_mappings_0_0= ruleMapping ) )* ( (lv_concepts_1_0= ruleConceptDef ) )*
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:80:2: ( (lv_mappings_0_0= ruleMapping ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22||(LA1_0>=25 && LA1_0<=27)||(LA1_0>=38 && LA1_0<=39)||LA1_0==42) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:81:1: (lv_mappings_0_0= ruleMapping )
            	    {
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:81:1: (lv_mappings_0_0= ruleMapping )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:82:3: lv_mappings_0_0= ruleMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingsAccess().getMappingsMappingParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMapping_in_ruleMappings131);
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:98:3: ( (lv_concepts_1_0= ruleConceptDef ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=11 && LA2_0<=12)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:99:1: (lv_concepts_1_0= ruleConceptDef )
            	    {
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:99:1: (lv_concepts_1_0= ruleConceptDef )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:100:3: lv_concepts_1_0= ruleConceptDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMappingsAccess().getConceptsConceptDefParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConceptDef_in_ruleMappings153);
            	    lv_concepts_1_0=ruleConceptDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMappingsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"concepts",
            	            		lv_concepts_1_0, 
            	            		"ConceptDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleMappings"


    // $ANTLR start "entryRuleConceptDefOrRef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:124:1: entryRuleConceptDefOrRef returns [EObject current=null] : iv_ruleConceptDefOrRef= ruleConceptDefOrRef EOF ;
    public final EObject entryRuleConceptDefOrRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptDefOrRef = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:125:2: (iv_ruleConceptDefOrRef= ruleConceptDefOrRef EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:126:2: iv_ruleConceptDefOrRef= ruleConceptDefOrRef EOF
            {
             newCompositeNode(grammarAccess.getConceptDefOrRefRule()); 
            pushFollow(FOLLOW_ruleConceptDefOrRef_in_entryRuleConceptDefOrRef190);
            iv_ruleConceptDefOrRef=ruleConceptDefOrRef();

            state._fsp--;

             current =iv_ruleConceptDefOrRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConceptDefOrRef200); 

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
    // $ANTLR end "entryRuleConceptDefOrRef"


    // $ANTLR start "ruleConceptDefOrRef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:133:1: ruleConceptDefOrRef returns [EObject current=null] : (this_AnonymousConcept_0= ruleAnonymousConcept | this_ConceptRef_1= ruleConceptRef ) ;
    public final EObject ruleConceptDefOrRef() throws RecognitionException {
        EObject current = null;

        EObject this_AnonymousConcept_0 = null;

        EObject this_ConceptRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:136:28: ( (this_AnonymousConcept_0= ruleAnonymousConcept | this_ConceptRef_1= ruleConceptRef ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:137:1: (this_AnonymousConcept_0= ruleAnonymousConcept | this_ConceptRef_1= ruleConceptRef )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:137:1: (this_AnonymousConcept_0= ruleAnonymousConcept | this_ConceptRef_1= ruleConceptRef )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 20:
                    {
                    switch ( input.LA(3) ) {
                    case 15:
                        {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4==19) ) {
                            alt3=2;
                        }
                        else if ( (LA3_4==EOF||LA3_4==13||(LA3_4>=16 && LA3_4<=18)) ) {
                            alt3=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case 13:
                    case 16:
                    case 17:
                    case 18:
                        {
                        alt3=1;
                        }
                        break;
                    case 19:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 21:
                    {
                    switch ( input.LA(3) ) {
                    case 15:
                        {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4==19) ) {
                            alt3=2;
                        }
                        else if ( (LA3_4==EOF||LA3_4==13||(LA3_4>=16 && LA3_4<=18)) ) {
                            alt3=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 3, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case 13:
                    case 16:
                    case 17:
                    case 18:
                        {
                        alt3=1;
                        }
                        break;
                    case 19:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 15:
                    {
                    int LA3_4 = input.LA(3);

                    if ( (LA3_4==19) ) {
                        alt3=2;
                    }
                    else if ( (LA3_4==EOF||LA3_4==13||(LA3_4>=16 && LA3_4<=18)) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case 19:
                    {
                    alt3=2;
                    }
                    break;
                case EOF:
                case 13:
                case 16:
                case 17:
                case 18:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:138:5: this_AnonymousConcept_0= ruleAnonymousConcept
                    {
                     
                            newCompositeNode(grammarAccess.getConceptDefOrRefAccess().getAnonymousConceptParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAnonymousConcept_in_ruleConceptDefOrRef247);
                    this_AnonymousConcept_0=ruleAnonymousConcept();

                    state._fsp--;

                     
                            current = this_AnonymousConcept_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:148:5: this_ConceptRef_1= ruleConceptRef
                    {
                     
                            newCompositeNode(grammarAccess.getConceptDefOrRefAccess().getConceptRefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConceptRef_in_ruleConceptDefOrRef274);
                    this_ConceptRef_1=ruleConceptRef();

                    state._fsp--;

                     
                            current = this_ConceptRef_1; 
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
    // $ANTLR end "ruleConceptDefOrRef"


    // $ANTLR start "entryRuleConceptDef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:164:1: entryRuleConceptDef returns [EObject current=null] : iv_ruleConceptDef= ruleConceptDef EOF ;
    public final EObject entryRuleConceptDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptDef = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:165:2: (iv_ruleConceptDef= ruleConceptDef EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:166:2: iv_ruleConceptDef= ruleConceptDef EOF
            {
             newCompositeNode(grammarAccess.getConceptDefRule()); 
            pushFollow(FOLLOW_ruleConceptDef_in_entryRuleConceptDef309);
            iv_ruleConceptDef=ruleConceptDef();

            state._fsp--;

             current =iv_ruleConceptDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConceptDef319); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:173:1: ruleConceptDef returns [EObject current=null] : ( ( (lv_top_0_0= 'top' ) )? otherlv_1= 'concept' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? ( (lv_body_6_0= ruleConceptDefBody ) )? ) ;
    public final EObject ruleConceptDef() throws RecognitionException {
        EObject current = null;

        Token lv_top_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_mapping_4_0 = null;

        EObject lv_body_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:176:28: ( ( ( (lv_top_0_0= 'top' ) )? otherlv_1= 'concept' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? ( (lv_body_6_0= ruleConceptDefBody ) )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:177:1: ( ( (lv_top_0_0= 'top' ) )? otherlv_1= 'concept' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? ( (lv_body_6_0= ruleConceptDefBody ) )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:177:1: ( ( (lv_top_0_0= 'top' ) )? otherlv_1= 'concept' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? ( (lv_body_6_0= ruleConceptDefBody ) )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:177:2: ( (lv_top_0_0= 'top' ) )? otherlv_1= 'concept' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? ( (lv_body_6_0= ruleConceptDefBody ) )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:177:2: ( (lv_top_0_0= 'top' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:178:1: (lv_top_0_0= 'top' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:178:1: (lv_top_0_0= 'top' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:179:3: lv_top_0_0= 'top'
                    {
                    lv_top_0_0=(Token)match(input,11,FOLLOW_11_in_ruleConceptDef362); 

                            newLeafNode(lv_top_0_0, grammarAccess.getConceptDefAccess().getTopTopKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConceptDefRule());
                    	        }
                           		setWithLastConsumed(current, "top", true, "top");
                    	    

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleConceptDef388); 

                	newLeafNode(otherlv_1, grammarAccess.getConceptDefAccess().getConceptKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:196:1: ( (lv_name_2_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:197:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:197:1: (lv_name_2_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:198:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConceptDef405); 

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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:214:2: (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:214:4: otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleConceptDef423); 

                        	newLeafNode(otherlv_3, grammarAccess.getConceptDefAccess().getLessThanSignKeyword_3_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:218:1: ( (lv_mapping_4_0= ruleMapping ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:219:1: (lv_mapping_4_0= ruleMapping )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:219:1: (lv_mapping_4_0= ruleMapping )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:220:3: lv_mapping_4_0= ruleMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getConceptDefAccess().getMappingMappingParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapping_in_ruleConceptDef444);
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

                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleConceptDef456); 

                        	newLeafNode(otherlv_5, grammarAccess.getConceptDefAccess().getGreaterThanSignKeyword_3_2());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:240:3: ( (lv_body_6_0= ruleConceptDefBody ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:241:1: (lv_body_6_0= ruleConceptDefBody )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:241:1: (lv_body_6_0= ruleConceptDefBody )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:242:3: lv_body_6_0= ruleConceptDefBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getConceptDefAccess().getBodyConceptDefBodyParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConceptDefBody_in_ruleConceptDef479);
                    lv_body_6_0=ruleConceptDefBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConceptDefRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_6_0, 
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


    // $ANTLR start "entryRuleAnonymousConcept"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:266:1: entryRuleAnonymousConcept returns [EObject current=null] : iv_ruleAnonymousConcept= ruleAnonymousConcept EOF ;
    public final EObject entryRuleAnonymousConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnonymousConcept = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:267:2: (iv_ruleAnonymousConcept= ruleAnonymousConcept EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:268:2: iv_ruleAnonymousConcept= ruleAnonymousConcept EOF
            {
             newCompositeNode(grammarAccess.getAnonymousConceptRule()); 
            pushFollow(FOLLOW_ruleAnonymousConcept_in_entryRuleAnonymousConcept516);
            iv_ruleAnonymousConcept=ruleAnonymousConcept();

            state._fsp--;

             current =iv_ruleAnonymousConcept; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnonymousConcept526); 

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
    // $ANTLR end "entryRuleAnonymousConcept"


    // $ANTLR start "ruleAnonymousConcept"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:275:1: ruleAnonymousConcept returns [EObject current=null] : ( ( (lv_localName_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( (lv_required_2_0= '!' ) )? (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? ( (lv_body_6_0= ruleConceptDefBody ) )? ) ;
    public final EObject ruleAnonymousConcept() throws RecognitionException {
        EObject current = null;

        Token lv_localName_0_0=null;
        Token lv_required_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_cardinality_1_0 = null;

        EObject lv_mapping_4_0 = null;

        EObject lv_body_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:278:28: ( ( ( (lv_localName_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( (lv_required_2_0= '!' ) )? (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? ( (lv_body_6_0= ruleConceptDefBody ) )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:279:1: ( ( (lv_localName_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( (lv_required_2_0= '!' ) )? (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? ( (lv_body_6_0= ruleConceptDefBody ) )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:279:1: ( ( (lv_localName_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( (lv_required_2_0= '!' ) )? (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? ( (lv_body_6_0= ruleConceptDefBody ) )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:279:2: ( (lv_localName_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( (lv_required_2_0= '!' ) )? (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )? ( (lv_body_6_0= ruleConceptDefBody ) )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:279:2: ( (lv_localName_0_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:280:1: (lv_localName_0_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:280:1: (lv_localName_0_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:281:3: lv_localName_0_0= RULE_ID
            {
            lv_localName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnonymousConcept568); 

            			newLeafNode(lv_localName_0_0, grammarAccess.getAnonymousConceptAccess().getLocalNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAnonymousConceptRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"localName",
                    		lv_localName_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:297:2: ( (lv_cardinality_1_0= ruleCardinality ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:298:1: (lv_cardinality_1_0= ruleCardinality )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:298:1: (lv_cardinality_1_0= ruleCardinality )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:299:3: lv_cardinality_1_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnonymousConceptAccess().getCardinalityCardinalityParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleAnonymousConcept594);
                    lv_cardinality_1_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnonymousConceptRule());
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:315:3: ( (lv_required_2_0= '!' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:316:1: (lv_required_2_0= '!' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:316:1: (lv_required_2_0= '!' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:317:3: lv_required_2_0= '!'
                    {
                    lv_required_2_0=(Token)match(input,15,FOLLOW_15_in_ruleAnonymousConcept613); 

                            newLeafNode(lv_required_2_0, grammarAccess.getAnonymousConceptAccess().getRequiredExclamationMarkKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAnonymousConceptRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "!");
                    	    

                    }


                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:330:3: (otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==13) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:330:5: otherlv_3= '<' ( (lv_mapping_4_0= ruleMapping ) ) otherlv_5= '>'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleAnonymousConcept640); 

                        	newLeafNode(otherlv_3, grammarAccess.getAnonymousConceptAccess().getLessThanSignKeyword_3_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:334:1: ( (lv_mapping_4_0= ruleMapping ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:335:1: (lv_mapping_4_0= ruleMapping )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:335:1: (lv_mapping_4_0= ruleMapping )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:336:3: lv_mapping_4_0= ruleMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnonymousConceptAccess().getMappingMappingParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMapping_in_ruleAnonymousConcept661);
                    lv_mapping_4_0=ruleMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnonymousConceptRule());
                    	        }
                           		set(
                           			current, 
                           			"mapping",
                            		lv_mapping_4_0, 
                            		"Mapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleAnonymousConcept673); 

                        	newLeafNode(otherlv_5, grammarAccess.getAnonymousConceptAccess().getGreaterThanSignKeyword_3_2());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:356:3: ( (lv_body_6_0= ruleConceptDefBody ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:357:1: (lv_body_6_0= ruleConceptDefBody )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:357:1: (lv_body_6_0= ruleConceptDefBody )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:358:3: lv_body_6_0= ruleConceptDefBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getAnonymousConceptAccess().getBodyConceptDefBodyParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConceptDefBody_in_ruleAnonymousConcept696);
                    lv_body_6_0=ruleConceptDefBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAnonymousConceptRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_6_0, 
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
    // $ANTLR end "ruleAnonymousConcept"


    // $ANTLR start "entryRuleConceptDefBody"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:382:1: entryRuleConceptDefBody returns [EObject current=null] : iv_ruleConceptDefBody= ruleConceptDefBody EOF ;
    public final EObject entryRuleConceptDefBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptDefBody = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:383:2: (iv_ruleConceptDefBody= ruleConceptDefBody EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:384:2: iv_ruleConceptDefBody= ruleConceptDefBody EOF
            {
             newCompositeNode(grammarAccess.getConceptDefBodyRule()); 
            pushFollow(FOLLOW_ruleConceptDefBody_in_entryRuleConceptDefBody733);
            iv_ruleConceptDefBody=ruleConceptDefBody();

            state._fsp--;

             current =iv_ruleConceptDefBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConceptDefBody743); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:391:1: ruleConceptDefBody returns [EObject current=null] : (otherlv_0= '{' ( (lv_subconcept_1_0= ruleConceptDefOrRef ) ) (otherlv_2= ',' ( (lv_subconcept_3_0= ruleConceptDefOrRef ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleConceptDefBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_subconcept_1_0 = null;

        EObject lv_subconcept_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:394:28: ( (otherlv_0= '{' ( (lv_subconcept_1_0= ruleConceptDefOrRef ) ) (otherlv_2= ',' ( (lv_subconcept_3_0= ruleConceptDefOrRef ) ) )* otherlv_4= '}' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:395:1: (otherlv_0= '{' ( (lv_subconcept_1_0= ruleConceptDefOrRef ) ) (otherlv_2= ',' ( (lv_subconcept_3_0= ruleConceptDefOrRef ) ) )* otherlv_4= '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:395:1: (otherlv_0= '{' ( (lv_subconcept_1_0= ruleConceptDefOrRef ) ) (otherlv_2= ',' ( (lv_subconcept_3_0= ruleConceptDefOrRef ) ) )* otherlv_4= '}' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:395:3: otherlv_0= '{' ( (lv_subconcept_1_0= ruleConceptDefOrRef ) ) (otherlv_2= ',' ( (lv_subconcept_3_0= ruleConceptDefOrRef ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleConceptDefBody780); 

                	newLeafNode(otherlv_0, grammarAccess.getConceptDefBodyAccess().getLeftCurlyBracketKeyword_0());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:399:1: ( (lv_subconcept_1_0= ruleConceptDefOrRef ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:400:1: (lv_subconcept_1_0= ruleConceptDefOrRef )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:400:1: (lv_subconcept_1_0= ruleConceptDefOrRef )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:401:3: lv_subconcept_1_0= ruleConceptDefOrRef
            {
             
            	        newCompositeNode(grammarAccess.getConceptDefBodyAccess().getSubconceptConceptDefOrRefParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleConceptDefOrRef_in_ruleConceptDefBody801);
            lv_subconcept_1_0=ruleConceptDefOrRef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConceptDefBodyRule());
            	        }
                   		add(
                   			current, 
                   			"subconcept",
                    		lv_subconcept_1_0, 
                    		"ConceptDefOrRef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:417:2: (otherlv_2= ',' ( (lv_subconcept_3_0= ruleConceptDefOrRef ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:417:4: otherlv_2= ',' ( (lv_subconcept_3_0= ruleConceptDefOrRef ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleConceptDefBody814); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConceptDefBodyAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:421:1: ( (lv_subconcept_3_0= ruleConceptDefOrRef ) )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:422:1: (lv_subconcept_3_0= ruleConceptDefOrRef )
            	    {
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:422:1: (lv_subconcept_3_0= ruleConceptDefOrRef )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:423:3: lv_subconcept_3_0= ruleConceptDefOrRef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConceptDefBodyAccess().getSubconceptConceptDefOrRefParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConceptDefOrRef_in_ruleConceptDefBody835);
            	    lv_subconcept_3_0=ruleConceptDefOrRef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConceptDefBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"subconcept",
            	            		lv_subconcept_3_0, 
            	            		"ConceptDefOrRef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleConceptDefBody849); 

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


    // $ANTLR start "entryRuleConceptRef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:451:1: entryRuleConceptRef returns [EObject current=null] : iv_ruleConceptRef= ruleConceptRef EOF ;
    public final EObject entryRuleConceptRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptRef = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:452:2: (iv_ruleConceptRef= ruleConceptRef EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:453:2: iv_ruleConceptRef= ruleConceptRef EOF
            {
             newCompositeNode(grammarAccess.getConceptRefRule()); 
            pushFollow(FOLLOW_ruleConceptRef_in_entryRuleConceptRef885);
            iv_ruleConceptRef=ruleConceptRef();

            state._fsp--;

             current =iv_ruleConceptRef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConceptRef895); 

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
    // $ANTLR end "entryRuleConceptRef"


    // $ANTLR start "ruleConceptRef"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:460:1: ruleConceptRef returns [EObject current=null] : ( ( (lv_localName_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( (lv_required_2_0= '!' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleConceptRef() throws RecognitionException {
        EObject current = null;

        Token lv_localName_0_0=null;
        Token lv_required_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_cardinality_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:463:28: ( ( ( (lv_localName_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( (lv_required_2_0= '!' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:464:1: ( ( (lv_localName_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( (lv_required_2_0= '!' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:464:1: ( ( (lv_localName_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( (lv_required_2_0= '!' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:464:2: ( (lv_localName_0_0= RULE_ID ) ) ( (lv_cardinality_1_0= ruleCardinality ) )? ( (lv_required_2_0= '!' ) )? otherlv_3= ':' ( (otherlv_4= RULE_ID ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:464:2: ( (lv_localName_0_0= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:465:1: (lv_localName_0_0= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:465:1: (lv_localName_0_0= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:466:3: lv_localName_0_0= RULE_ID
            {
            lv_localName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConceptRef937); 

            			newLeafNode(lv_localName_0_0, grammarAccess.getConceptRefAccess().getLocalNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConceptRefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"localName",
                    		lv_localName_0_0, 
                    		"ID");
            	    

            }


            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:482:2: ( (lv_cardinality_1_0= ruleCardinality ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=20 && LA12_0<=21)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:483:1: (lv_cardinality_1_0= ruleCardinality )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:483:1: (lv_cardinality_1_0= ruleCardinality )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:484:3: lv_cardinality_1_0= ruleCardinality
                    {
                     
                    	        newCompositeNode(grammarAccess.getConceptRefAccess().getCardinalityCardinalityParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCardinality_in_ruleConceptRef963);
                    lv_cardinality_1_0=ruleCardinality();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConceptRefRule());
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:500:3: ( (lv_required_2_0= '!' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:501:1: (lv_required_2_0= '!' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:501:1: (lv_required_2_0= '!' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:502:3: lv_required_2_0= '!'
                    {
                    lv_required_2_0=(Token)match(input,15,FOLLOW_15_in_ruleConceptRef982); 

                            newLeafNode(lv_required_2_0, grammarAccess.getConceptRefAccess().getRequiredExclamationMarkKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConceptRefRule());
                    	        }
                           		setWithLastConsumed(current, "required", true, "!");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleConceptRef1008); 

                	newLeafNode(otherlv_3, grammarAccess.getConceptRefAccess().getColonKeyword_3());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:519:1: ( (otherlv_4= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:520:1: (otherlv_4= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:520:1: (otherlv_4= RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:521:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getConceptRefRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConceptRef1028); 

            		newLeafNode(otherlv_4, grammarAccess.getConceptRefAccess().getNameConceptDefCrossReference_4_0()); 
            	

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
    // $ANTLR end "ruleConceptRef"


    // $ANTLR start "entryRuleCardinality"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:540:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:541:2: (iv_ruleCardinality= ruleCardinality EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:542:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality1064);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality1074); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:549:1: ruleCardinality returns [EObject current=null] : ( ( (lv_zeroOrMore_0_0= '*' ) ) | ( (lv_oneOrMore_1_0= '+' ) ) ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token lv_zeroOrMore_0_0=null;
        Token lv_oneOrMore_1_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:552:28: ( ( ( (lv_zeroOrMore_0_0= '*' ) ) | ( (lv_oneOrMore_1_0= '+' ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:553:1: ( ( (lv_zeroOrMore_0_0= '*' ) ) | ( (lv_oneOrMore_1_0= '+' ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:553:1: ( ( (lv_zeroOrMore_0_0= '*' ) ) | ( (lv_oneOrMore_1_0= '+' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            else if ( (LA14_0==21) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:553:2: ( (lv_zeroOrMore_0_0= '*' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:553:2: ( (lv_zeroOrMore_0_0= '*' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:554:1: (lv_zeroOrMore_0_0= '*' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:554:1: (lv_zeroOrMore_0_0= '*' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:555:3: lv_zeroOrMore_0_0= '*'
                    {
                    lv_zeroOrMore_0_0=(Token)match(input,20,FOLLOW_20_in_ruleCardinality1117); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:569:6: ( (lv_oneOrMore_1_0= '+' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:569:6: ( (lv_oneOrMore_1_0= '+' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:570:1: (lv_oneOrMore_1_0= '+' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:570:1: (lv_oneOrMore_1_0= '+' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:571:3: lv_oneOrMore_1_0= '+'
                    {
                    lv_oneOrMore_1_0=(Token)match(input,21,FOLLOW_21_in_ruleCardinality1154); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:592:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:593:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:594:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping1203);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping1213); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:601:1: ruleMapping returns [EObject current=null] : ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        EObject lv_context_0_0 = null;

        EObject lv_mapping_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:604:28: ( ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:605:1: ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:605:1: ( ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:605:2: ( (lv_context_0_0= rulePathExpr ) )? ( (lv_mapping_1_0= ruleImplicitContextMapping ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:605:2: ( (lv_context_0_0= rulePathExpr ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==42) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:606:1: (lv_context_0_0= rulePathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:606:1: (lv_context_0_0= rulePathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:607:3: lv_context_0_0= rulePathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getMappingAccess().getContextPathExprParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePathExpr_in_ruleMapping1259);
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:623:3: ( (lv_mapping_1_0= ruleImplicitContextMapping ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:624:1: (lv_mapping_1_0= ruleImplicitContextMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:624:1: (lv_mapping_1_0= ruleImplicitContextMapping )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:625:3: lv_mapping_1_0= ruleImplicitContextMapping
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getMappingImplicitContextMappingParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_ruleMapping1281);
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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:649:1: entryRuleImplicitContextMapping returns [EObject current=null] : iv_ruleImplicitContextMapping= ruleImplicitContextMapping EOF ;
    public final EObject entryRuleImplicitContextMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicitContextMapping = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:650:2: (iv_ruleImplicitContextMapping= ruleImplicitContextMapping EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:651:2: iv_ruleImplicitContextMapping= ruleImplicitContextMapping EOF
            {
             newCompositeNode(grammarAccess.getImplicitContextMappingRule()); 
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_entryRuleImplicitContextMapping1317);
            iv_ruleImplicitContextMapping=ruleImplicitContextMapping();

            state._fsp--;

             current =iv_ruleImplicitContextMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitContextMapping1327); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:658:1: ruleImplicitContextMapping returns [EObject current=null] : (this_Module_0= ruleModule | this_UsesModule_1= ruleUsesModule | this_UsesEntity_2= ruleUsesEntity | this_Call_3= ruleCall | this_Subroutine_4= ruleSubroutine | this_SubroutineName_5= ruleSubroutineName ) ;
    public final EObject ruleImplicitContextMapping() throws RecognitionException {
        EObject current = null;

        EObject this_Module_0 = null;

        EObject this_UsesModule_1 = null;

        EObject this_UsesEntity_2 = null;

        EObject this_Call_3 = null;

        EObject this_Subroutine_4 = null;

        EObject this_SubroutineName_5 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:661:28: ( (this_Module_0= ruleModule | this_UsesModule_1= ruleUsesModule | this_UsesEntity_2= ruleUsesEntity | this_Call_3= ruleCall | this_Subroutine_4= ruleSubroutine | this_SubroutineName_5= ruleSubroutineName ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:662:1: (this_Module_0= ruleModule | this_UsesModule_1= ruleUsesModule | this_UsesEntity_2= ruleUsesEntity | this_Call_3= ruleCall | this_Subroutine_4= ruleSubroutine | this_SubroutineName_5= ruleSubroutineName )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:662:1: (this_Module_0= ruleModule | this_UsesModule_1= ruleUsesModule | this_UsesEntity_2= ruleUsesEntity | this_Call_3= ruleCall | this_Subroutine_4= ruleSubroutine | this_SubroutineName_5= ruleSubroutineName )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt16=1;
                }
                break;
            case 25:
                {
                alt16=2;
                }
                break;
            case 26:
                {
                alt16=3;
                }
                break;
            case 39:
                {
                alt16=4;
                }
                break;
            case 27:
                {
                alt16=5;
                }
                break;
            case 38:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:663:5: this_Module_0= ruleModule
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getModuleParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleModule_in_ruleImplicitContextMapping1374);
                    this_Module_0=ruleModule();

                    state._fsp--;

                     
                            current = this_Module_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:673:5: this_UsesModule_1= ruleUsesModule
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getUsesModuleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleUsesModule_in_ruleImplicitContextMapping1401);
                    this_UsesModule_1=ruleUsesModule();

                    state._fsp--;

                     
                            current = this_UsesModule_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:683:5: this_UsesEntity_2= ruleUsesEntity
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getUsesEntityParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleUsesEntity_in_ruleImplicitContextMapping1428);
                    this_UsesEntity_2=ruleUsesEntity();

                    state._fsp--;

                     
                            current = this_UsesEntity_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:693:5: this_Call_3= ruleCall
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleImplicitContextMapping1455);
                    this_Call_3=ruleCall();

                    state._fsp--;

                     
                            current = this_Call_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:703:5: this_Subroutine_4= ruleSubroutine
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getSubroutineParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleSubroutine_in_ruleImplicitContextMapping1482);
                    this_Subroutine_4=ruleSubroutine();

                    state._fsp--;

                     
                            current = this_Subroutine_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:713:5: this_SubroutineName_5= ruleSubroutineName
                    {
                     
                            newCompositeNode(grammarAccess.getImplicitContextMappingAccess().getSubroutineNameParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleSubroutineName_in_ruleImplicitContextMapping1509);
                    this_SubroutineName_5=ruleSubroutineName();

                    state._fsp--;

                     
                            current = this_SubroutineName_5; 
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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:729:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:730:2: (iv_ruleModule= ruleModule EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:731:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule1544);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule1554); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:738:1: ruleModule returns [EObject current=null] : ( () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:741:28: ( ( () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:742:1: ( () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:742:1: ( () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:742:2: () otherlv_1= 'module' (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )?
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:742:2: ()
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:743:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModuleAccess().getModuleAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleModule1600); 

                	newLeafNode(otherlv_1, grammarAccess.getModuleAccess().getModuleKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:752:1: (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:752:3: otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleModule1613); 

                        	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:756:1: ( (lv_name_3_0= ruleIDOrPathExpr ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:757:1: (lv_name_3_0= ruleIDOrPathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:757:1: (lv_name_3_0= ruleIDOrPathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:758:3: lv_name_3_0= ruleIDOrPathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getModuleAccess().getNameIDOrPathExprParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleModule1634);
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

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleModule1646); 

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


    // $ANTLR start "entryRuleUsesModule"
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:786:1: entryRuleUsesModule returns [EObject current=null] : iv_ruleUsesModule= ruleUsesModule EOF ;
    public final EObject entryRuleUsesModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsesModule = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:787:2: (iv_ruleUsesModule= ruleUsesModule EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:788:2: iv_ruleUsesModule= ruleUsesModule EOF
            {
             newCompositeNode(grammarAccess.getUsesModuleRule()); 
            pushFollow(FOLLOW_ruleUsesModule_in_entryRuleUsesModule1684);
            iv_ruleUsesModule=ruleUsesModule();

            state._fsp--;

             current =iv_ruleUsesModule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsesModule1694); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:795:1: ruleUsesModule returns [EObject current=null] : (otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleUsesModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:798:28: ( (otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:799:1: (otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:799:1: (otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:799:3: otherlv_0= 'usesModule' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleUsesModule1731); 

                	newLeafNode(otherlv_0, grammarAccess.getUsesModuleAccess().getUsesModuleKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleUsesModule1743); 

                	newLeafNode(otherlv_1, grammarAccess.getUsesModuleAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:807:1: ( (lv_name_2_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:808:1: (lv_name_2_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:808:1: (lv_name_2_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:809:3: lv_name_2_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getUsesModuleAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleUsesModule1764);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleUsesModule1776); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:837:1: entryRuleUsesEntity returns [EObject current=null] : iv_ruleUsesEntity= ruleUsesEntity EOF ;
    public final EObject entryRuleUsesEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUsesEntity = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:838:2: (iv_ruleUsesEntity= ruleUsesEntity EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:839:2: iv_ruleUsesEntity= ruleUsesEntity EOF
            {
             newCompositeNode(grammarAccess.getUsesEntityRule()); 
            pushFollow(FOLLOW_ruleUsesEntity_in_entryRuleUsesEntity1812);
            iv_ruleUsesEntity=ruleUsesEntity();

            state._fsp--;

             current =iv_ruleUsesEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsesEntity1822); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:846:1: ruleUsesEntity returns [EObject current=null] : (otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' ) ;
    public final EObject ruleUsesEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:849:28: ( (otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:850:1: (otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:850:1: (otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:850:3: otherlv_0= 'usesEntity' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleUsesEntity1859); 

                	newLeafNode(otherlv_0, grammarAccess.getUsesEntityAccess().getUsesEntityKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleUsesEntity1871); 

                	newLeafNode(otherlv_1, grammarAccess.getUsesEntityAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:858:1: ( (lv_name_2_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:859:1: (lv_name_2_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:859:1: (lv_name_2_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:860:3: lv_name_2_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getUsesEntityAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleUsesEntity1892);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleUsesEntity1904); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:888:1: entryRuleSubroutine returns [EObject current=null] : iv_ruleSubroutine= ruleSubroutine EOF ;
    public final EObject entryRuleSubroutine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubroutine = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:889:2: (iv_ruleSubroutine= ruleSubroutine EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:890:2: iv_ruleSubroutine= ruleSubroutine EOF
            {
             newCompositeNode(grammarAccess.getSubroutineRule()); 
            pushFollow(FOLLOW_ruleSubroutine_in_entryRuleSubroutine1940);
            iv_ruleSubroutine=ruleSubroutine();

            state._fsp--;

             current =iv_ruleSubroutine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutine1950); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:897:1: ruleSubroutine returns [EObject current=null] : (otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) ;
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
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:900:28: ( (otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:901:1: (otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:901:1: (otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:901:3: otherlv_0= 'subroutine' otherlv_1= '(' ( (lv_name_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleSubroutine1987); 

                	newLeafNode(otherlv_0, grammarAccess.getSubroutineAccess().getSubroutineKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleSubroutine1999); 

                	newLeafNode(otherlv_1, grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:909:1: ( (lv_name_2_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:910:1: (lv_name_2_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:910:1: (lv_name_2_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:911:3: lv_name_2_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getSubroutineAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleSubroutine2020);
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:927:2: (otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:927:4: otherlv_3= '(' ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleSubroutine2033); 

                        	newLeafNode(otherlv_3, grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:931:1: ( ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )* )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=28 && LA19_0<=35)||LA19_0==37) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:931:2: ( (lv_params_4_0= ruleFormalParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )*
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:931:2: ( (lv_params_4_0= ruleFormalParam ) )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:932:1: (lv_params_4_0= ruleFormalParam )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:932:1: (lv_params_4_0= ruleFormalParam )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:933:3: lv_params_4_0= ruleFormalParam
                            {
                             
                            	        newCompositeNode(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFormalParam_in_ruleSubroutine2055);
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

                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:949:2: (otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) ) )*
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==17) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:949:4: otherlv_5= ',' ( (lv_params_6_0= ruleFormalParam ) )
                            	    {
                            	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSubroutine2068); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getSubroutineAccess().getCommaKeyword_3_1_1_0());
                            	        
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:953:1: ( (lv_params_6_0= ruleFormalParam ) )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:954:1: (lv_params_6_0= ruleFormalParam )
                            	    {
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:954:1: (lv_params_6_0= ruleFormalParam )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:955:3: lv_params_6_0= ruleFormalParam
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleFormalParam_in_ruleSubroutine2089);
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
                            	    break loop18;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleSubroutine2105); 

                        	newLeafNode(otherlv_7, grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleSubroutine2119); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:987:1: entryRuleFormalParam returns [EObject current=null] : iv_ruleFormalParam= ruleFormalParam EOF ;
    public final EObject entryRuleFormalParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalParam = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:988:2: (iv_ruleFormalParam= ruleFormalParam EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:989:2: iv_ruleFormalParam= ruleFormalParam EOF
            {
             newCompositeNode(grammarAccess.getFormalParamRule()); 
            pushFollow(FOLLOW_ruleFormalParam_in_entryRuleFormalParam2155);
            iv_ruleFormalParam=ruleFormalParam();

            state._fsp--;

             current =iv_ruleFormalParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalParam2165); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:996:1: ruleFormalParam returns [EObject current=null] : ( ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIDOrPathExpr ) ) ) ;
    public final EObject ruleFormalParam() throws RecognitionException {
        EObject current = null;

        EObject lv_intent_0_0 = null;

        EObject lv_type_1_0 = null;

        EObject lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:999:28: ( ( ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIDOrPathExpr ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1000:1: ( ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIDOrPathExpr ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1000:1: ( ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIDOrPathExpr ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1000:2: ( (lv_intent_0_0= ruleIntent ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIDOrPathExpr ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1000:2: ( (lv_intent_0_0= ruleIntent ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=28 && LA21_0<=30)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1001:1: (lv_intent_0_0= ruleIntent )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1001:1: (lv_intent_0_0= ruleIntent )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1002:3: lv_intent_0_0= ruleIntent
                    {
                     
                    	        newCompositeNode(grammarAccess.getFormalParamAccess().getIntentIntentParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntent_in_ruleFormalParam2211);
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1018:3: ( (lv_type_1_0= ruleType ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1019:1: (lv_type_1_0= ruleType )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1019:1: (lv_type_1_0= ruleType )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1020:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getFormalParamAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFormalParam2233);
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1036:2: ( (lv_name_2_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1037:1: (lv_name_2_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1037:1: (lv_name_2_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1038:3: lv_name_2_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getFormalParamAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleFormalParam2254);
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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1062:1: entryRuleIntent returns [EObject current=null] : iv_ruleIntent= ruleIntent EOF ;
    public final EObject entryRuleIntent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntent = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1063:2: (iv_ruleIntent= ruleIntent EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1064:2: iv_ruleIntent= ruleIntent EOF
            {
             newCompositeNode(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_ruleIntent_in_entryRuleIntent2290);
            iv_ruleIntent=ruleIntent();

            state._fsp--;

             current =iv_ruleIntent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntent2300); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1071:1: ruleIntent returns [EObject current=null] : ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) | ( (lv_inout_2_0= 'inout' ) ) ) ;
    public final EObject ruleIntent() throws RecognitionException {
        EObject current = null;

        Token lv_in_0_0=null;
        Token lv_out_1_0=null;
        Token lv_inout_2_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1074:28: ( ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) | ( (lv_inout_2_0= 'inout' ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1075:1: ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) | ( (lv_inout_2_0= 'inout' ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1075:1: ( ( (lv_in_0_0= 'in' ) ) | ( (lv_out_1_0= 'out' ) ) | ( (lv_inout_2_0= 'inout' ) ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt22=1;
                }
                break;
            case 29:
                {
                alt22=2;
                }
                break;
            case 30:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1075:2: ( (lv_in_0_0= 'in' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1075:2: ( (lv_in_0_0= 'in' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1076:1: (lv_in_0_0= 'in' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1076:1: (lv_in_0_0= 'in' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1077:3: lv_in_0_0= 'in'
                    {
                    lv_in_0_0=(Token)match(input,28,FOLLOW_28_in_ruleIntent2343); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1091:6: ( (lv_out_1_0= 'out' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1091:6: ( (lv_out_1_0= 'out' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1092:1: (lv_out_1_0= 'out' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1092:1: (lv_out_1_0= 'out' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1093:3: lv_out_1_0= 'out'
                    {
                    lv_out_1_0=(Token)match(input,29,FOLLOW_29_in_ruleIntent2380); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1107:6: ( (lv_inout_2_0= 'inout' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1107:6: ( (lv_inout_2_0= 'inout' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1108:1: (lv_inout_2_0= 'inout' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1108:1: (lv_inout_2_0= 'inout' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1109:3: lv_inout_2_0= 'inout'
                    {
                    lv_inout_2_0=(Token)match(input,30,FOLLOW_30_in_ruleIntent2417); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1130:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1131:2: (iv_ruleType= ruleType EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1132:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2466);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2476); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1139:1: ruleType returns [EObject current=null] : ( ( (lv_integer_0_0= 'integer' ) ) | ( (lv_character_1_0= 'character' ) ) | ( (lv_logical_2_0= 'logical' ) ) | ( (lv_real_3_0= 'real' ) ) | ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? ) | ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' ) ) ;
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
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1142:28: ( ( ( (lv_integer_0_0= 'integer' ) ) | ( (lv_character_1_0= 'character' ) ) | ( (lv_logical_2_0= 'logical' ) ) | ( (lv_real_3_0= 'real' ) ) | ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? ) | ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1143:1: ( ( (lv_integer_0_0= 'integer' ) ) | ( (lv_character_1_0= 'character' ) ) | ( (lv_logical_2_0= 'logical' ) ) | ( (lv_real_3_0= 'real' ) ) | ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? ) | ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1143:1: ( ( (lv_integer_0_0= 'integer' ) ) | ( (lv_character_1_0= 'character' ) ) | ( (lv_logical_2_0= 'logical' ) ) | ( (lv_real_3_0= 'real' ) ) | ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? ) | ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' ) )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt24=1;
                }
                break;
            case 32:
                {
                alt24=2;
                }
                break;
            case 33:
                {
                alt24=3;
                }
                break;
            case 34:
                {
                alt24=4;
                }
                break;
            case 35:
                {
                alt24=5;
                }
                break;
            case 37:
                {
                alt24=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1143:2: ( (lv_integer_0_0= 'integer' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1143:2: ( (lv_integer_0_0= 'integer' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1144:1: (lv_integer_0_0= 'integer' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1144:1: (lv_integer_0_0= 'integer' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1145:3: lv_integer_0_0= 'integer'
                    {
                    lv_integer_0_0=(Token)match(input,31,FOLLOW_31_in_ruleType2519); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1159:6: ( (lv_character_1_0= 'character' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1159:6: ( (lv_character_1_0= 'character' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1160:1: (lv_character_1_0= 'character' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1160:1: (lv_character_1_0= 'character' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1161:3: lv_character_1_0= 'character'
                    {
                    lv_character_1_0=(Token)match(input,32,FOLLOW_32_in_ruleType2556); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1175:6: ( (lv_logical_2_0= 'logical' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1175:6: ( (lv_logical_2_0= 'logical' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1176:1: (lv_logical_2_0= 'logical' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1176:1: (lv_logical_2_0= 'logical' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1177:3: lv_logical_2_0= 'logical'
                    {
                    lv_logical_2_0=(Token)match(input,33,FOLLOW_33_in_ruleType2593); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1191:6: ( (lv_real_3_0= 'real' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1191:6: ( (lv_real_3_0= 'real' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1192:1: (lv_real_3_0= 'real' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1192:1: (lv_real_3_0= 'real' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1193:3: lv_real_3_0= 'real'
                    {
                    lv_real_3_0=(Token)match(input,34,FOLLOW_34_in_ruleType2630); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1207:6: ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1207:6: ( ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )? )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1207:7: ( (lv_double_4_0= 'double' ) ) (otherlv_5= 'precision' )?
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1207:7: ( (lv_double_4_0= 'double' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1208:1: (lv_double_4_0= 'double' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1208:1: (lv_double_4_0= 'double' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1209:3: lv_double_4_0= 'double'
                    {
                    lv_double_4_0=(Token)match(input,35,FOLLOW_35_in_ruleType2668); 

                            newLeafNode(lv_double_4_0, grammarAccess.getTypeAccess().getDoubleDoubleKeyword_4_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "double", true, "double");
                    	    

                    }


                    }

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1222:2: (otherlv_5= 'precision' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==36) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1222:4: otherlv_5= 'precision'
                            {
                            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleType2694); 

                                	newLeafNode(otherlv_5, grammarAccess.getTypeAccess().getPrecisionKeyword_4_1());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1227:6: ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1227:6: ( ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1227:7: ( (lv_derived_6_0= 'type' ) ) otherlv_7= '(' ( (lv_derivedType_8_0= ruleIDOrPathExpr ) ) otherlv_9= ')'
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1227:7: ( (lv_derived_6_0= 'type' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1228:1: (lv_derived_6_0= 'type' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1228:1: (lv_derived_6_0= 'type' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1229:3: lv_derived_6_0= 'type'
                    {
                    lv_derived_6_0=(Token)match(input,37,FOLLOW_37_in_ruleType2722); 

                            newLeafNode(lv_derived_6_0, grammarAccess.getTypeAccess().getDerivedTypeKeyword_5_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeRule());
                    	        }
                           		setWithLastConsumed(current, "derived", true, "type");
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleType2747); 

                        	newLeafNode(otherlv_7, grammarAccess.getTypeAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1246:1: ( (lv_derivedType_8_0= ruleIDOrPathExpr ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1247:1: (lv_derivedType_8_0= ruleIDOrPathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1247:1: (lv_derivedType_8_0= ruleIDOrPathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1248:3: lv_derivedType_8_0= ruleIDOrPathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getDerivedTypeIDOrPathExprParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleType2768);
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

                    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleType2780); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1276:1: entryRuleSubroutineName returns [EObject current=null] : iv_ruleSubroutineName= ruleSubroutineName EOF ;
    public final EObject entryRuleSubroutineName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubroutineName = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1277:2: (iv_ruleSubroutineName= ruleSubroutineName EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1278:2: iv_ruleSubroutineName= ruleSubroutineName EOF
            {
             newCompositeNode(grammarAccess.getSubroutineNameRule()); 
            pushFollow(FOLLOW_ruleSubroutineName_in_entryRuleSubroutineName2817);
            iv_ruleSubroutineName=ruleSubroutineName();

            state._fsp--;

             current =iv_ruleSubroutineName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutineName2827); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1285:1: ruleSubroutineName returns [EObject current=null] : (otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleSubroutineName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1288:28: ( (otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1289:1: (otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1289:1: (otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )? )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1289:3: otherlv_0= 'subroutineName' () (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleSubroutineName2864); 

                	newLeafNode(otherlv_0, grammarAccess.getSubroutineNameAccess().getSubroutineNameKeyword_0());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1293:1: ()
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1294:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubroutineNameAccess().getSubroutineNameAction_1(),
                        current);
                

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1299:2: (otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1299:4: otherlv_2= '(' ( (lv_name_3_0= ruleIDOrPathExpr ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleSubroutineName2886); 

                        	newLeafNode(otherlv_2, grammarAccess.getSubroutineNameAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1303:1: ( (lv_name_3_0= ruleIDOrPathExpr ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1304:1: (lv_name_3_0= ruleIDOrPathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1304:1: (lv_name_3_0= ruleIDOrPathExpr )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1305:3: lv_name_3_0= ruleIDOrPathExpr
                    {
                     
                    	        newCompositeNode(grammarAccess.getSubroutineNameAccess().getNameIDOrPathExprParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleSubroutineName2907);
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

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleSubroutineName2919); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1333:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1334:2: (iv_ruleCall= ruleCall EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1335:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall2957);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall2967); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1342:1: ruleCall returns [EObject current=null] : (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) ;
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
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1345:28: ( (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1346:1: (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1346:1: (otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')' )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1346:3: otherlv_0= 'call' otherlv_1= '(' ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) ) (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleCall3004); 

                	newLeafNode(otherlv_0, grammarAccess.getCallAccess().getCallKeyword_0());
                
            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleCall3016); 

                	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getLeftParenthesisKeyword_1());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1354:1: ( (lv_subroutineName_2_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1355:1: (lv_subroutineName_2_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1355:1: (lv_subroutineName_2_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1356:3: lv_subroutineName_2_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getSubroutineNameIDOrPathExprParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleCall3037);
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1372:2: (otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1372:4: otherlv_3= '(' ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )? otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleCall3050); 

                        	newLeafNode(otherlv_3, grammarAccess.getCallAccess().getLeftParenthesisKeyword_3_0());
                        
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1376:1: ( ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )* )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_ID||LA27_0==20||LA27_0==42) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1376:2: ( (lv_params_4_0= ruleActualParam ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )*
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1376:2: ( (lv_params_4_0= ruleActualParam ) )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1377:1: (lv_params_4_0= ruleActualParam )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1377:1: (lv_params_4_0= ruleActualParam )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1378:3: lv_params_4_0= ruleActualParam
                            {
                             
                            	        newCompositeNode(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleActualParam_in_ruleCall3072);
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

                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1394:2: (otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) ) )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==17) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1394:4: otherlv_5= ',' ( (lv_params_6_0= ruleActualParam ) )
                            	    {
                            	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleCall3085); 

                            	        	newLeafNode(otherlv_5, grammarAccess.getCallAccess().getCommaKeyword_3_1_1_0());
                            	        
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1398:1: ( (lv_params_6_0= ruleActualParam ) )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1399:1: (lv_params_6_0= ruleActualParam )
                            	    {
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1399:1: (lv_params_6_0= ruleActualParam )
                            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1400:3: lv_params_6_0= ruleActualParam
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleActualParam_in_ruleCall3106);
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
                            	    break loop26;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleCall3122); 

                        	newLeafNode(otherlv_7, grammarAccess.getCallAccess().getRightParenthesisKeyword_3_2());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleCall3136); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1432:1: entryRuleActualParam returns [EObject current=null] : iv_ruleActualParam= ruleActualParam EOF ;
    public final EObject entryRuleActualParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActualParam = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1433:2: (iv_ruleActualParam= ruleActualParam EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1434:2: iv_ruleActualParam= ruleActualParam EOF
            {
             newCompositeNode(grammarAccess.getActualParamRule()); 
            pushFollow(FOLLOW_ruleActualParam_in_entryRuleActualParam3172);
            iv_ruleActualParam=ruleActualParam();

            state._fsp--;

             current =iv_ruleActualParam; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualParam3182); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1441:1: ruleActualParam returns [EObject current=null] : ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) ) ) ;
    public final EObject ruleActualParam() throws RecognitionException {
        EObject current = null;

        Token lv_keyword_0_0=null;
        Token lv_optional_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1444:28: ( ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1445:1: ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1445:1: ( ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1445:2: ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )? ( (lv_value_3_0= ruleIDOrPathExpr ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1445:2: ( ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '=' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                int LA30_1 = input.LA(2);

                if ( ((LA30_1>=40 && LA30_1<=41)) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1445:3: ( (lv_keyword_0_0= RULE_ID ) ) ( (lv_optional_1_0= '?' ) )? otherlv_2= '='
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1445:3: ( (lv_keyword_0_0= RULE_ID ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1446:1: (lv_keyword_0_0= RULE_ID )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1446:1: (lv_keyword_0_0= RULE_ID )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1447:3: lv_keyword_0_0= RULE_ID
                    {
                    lv_keyword_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActualParam3225); 

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

                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1463:2: ( (lv_optional_1_0= '?' ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==40) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1464:1: (lv_optional_1_0= '?' )
                            {
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1464:1: (lv_optional_1_0= '?' )
                            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1465:3: lv_optional_1_0= '?'
                            {
                            lv_optional_1_0=(Token)match(input,40,FOLLOW_40_in_ruleActualParam3248); 

                                    newLeafNode(lv_optional_1_0, grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getActualParamRule());
                            	        }
                                   		setWithLastConsumed(current, "optional", true, "?");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleActualParam3274); 

                        	newLeafNode(otherlv_2, grammarAccess.getActualParamAccess().getEqualsSignKeyword_0_2());
                        

                    }
                    break;

            }

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1482:3: ( (lv_value_3_0= ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1483:1: (lv_value_3_0= ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1483:1: (lv_value_3_0= ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1484:3: lv_value_3_0= ruleIDOrPathExpr
            {
             
            	        newCompositeNode(grammarAccess.getActualParamAccess().getValueIDOrPathExprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_ruleActualParam3297);
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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1508:1: entryRuleIDOrWildcard returns [EObject current=null] : iv_ruleIDOrWildcard= ruleIDOrWildcard EOF ;
    public final EObject entryRuleIDOrWildcard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDOrWildcard = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1509:2: (iv_ruleIDOrWildcard= ruleIDOrWildcard EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1510:2: iv_ruleIDOrWildcard= ruleIDOrWildcard EOF
            {
             newCompositeNode(grammarAccess.getIDOrWildcardRule()); 
            pushFollow(FOLLOW_ruleIDOrWildcard_in_entryRuleIDOrWildcard3333);
            iv_ruleIDOrWildcard=ruleIDOrWildcard();

            state._fsp--;

             current =iv_ruleIDOrWildcard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrWildcard3343); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1517:1: ruleIDOrWildcard returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_wildcard_1_0= '*' ) ) ) ;
    public final EObject ruleIDOrWildcard() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token lv_wildcard_1_0=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1520:28: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_wildcard_1_0= '*' ) ) ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1521:1: ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_wildcard_1_0= '*' ) ) )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1521:1: ( ( (lv_id_0_0= RULE_ID ) ) | ( (lv_wildcard_1_0= '*' ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            else if ( (LA31_0==20) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1521:2: ( (lv_id_0_0= RULE_ID ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1521:2: ( (lv_id_0_0= RULE_ID ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1522:1: (lv_id_0_0= RULE_ID )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1522:1: (lv_id_0_0= RULE_ID )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1523:3: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIDOrWildcard3385); 

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
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1540:6: ( (lv_wildcard_1_0= '*' ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1540:6: ( (lv_wildcard_1_0= '*' ) )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1541:1: (lv_wildcard_1_0= '*' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1541:1: (lv_wildcard_1_0= '*' )
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1542:3: lv_wildcard_1_0= '*'
                    {
                    lv_wildcard_1_0=(Token)match(input,20,FOLLOW_20_in_ruleIDOrWildcard3414); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1563:1: entryRuleIDOrPathExpr returns [EObject current=null] : iv_ruleIDOrPathExpr= ruleIDOrPathExpr EOF ;
    public final EObject entryRuleIDOrPathExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDOrPathExpr = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1564:2: (iv_ruleIDOrPathExpr= ruleIDOrPathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1565:2: iv_ruleIDOrPathExpr= ruleIDOrPathExpr EOF
            {
             newCompositeNode(grammarAccess.getIDOrPathExprRule()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_entryRuleIDOrPathExpr3463);
            iv_ruleIDOrPathExpr=ruleIDOrPathExpr();

            state._fsp--;

             current =iv_ruleIDOrPathExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrPathExpr3473); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1572:1: ruleIDOrPathExpr returns [EObject current=null] : (this_IDOrWildcard_0= ruleIDOrWildcard | this_PathExpr_1= rulePathExpr ) ;
    public final EObject ruleIDOrPathExpr() throws RecognitionException {
        EObject current = null;

        EObject this_IDOrWildcard_0 = null;

        EObject this_PathExpr_1 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1575:28: ( (this_IDOrWildcard_0= ruleIDOrWildcard | this_PathExpr_1= rulePathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1576:1: (this_IDOrWildcard_0= ruleIDOrWildcard | this_PathExpr_1= rulePathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1576:1: (this_IDOrWildcard_0= ruleIDOrWildcard | this_PathExpr_1= rulePathExpr )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||LA32_0==20) ) {
                alt32=1;
            }
            else if ( (LA32_0==42) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1577:5: this_IDOrWildcard_0= ruleIDOrWildcard
                    {
                     
                            newCompositeNode(grammarAccess.getIDOrPathExprAccess().getIDOrWildcardParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIDOrWildcard_in_ruleIDOrPathExpr3520);
                    this_IDOrWildcard_0=ruleIDOrWildcard();

                    state._fsp--;

                     
                            current = this_IDOrWildcard_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1587:5: this_PathExpr_1= rulePathExpr
                    {
                     
                            newCompositeNode(grammarAccess.getIDOrPathExprAccess().getPathExprParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePathExpr_in_ruleIDOrPathExpr3547);
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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1603:1: entryRulePathExpr returns [EObject current=null] : iv_rulePathExpr= rulePathExpr EOF ;
    public final EObject entryRulePathExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathExpr = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1604:2: (iv_rulePathExpr= rulePathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1605:2: iv_rulePathExpr= rulePathExpr EOF
            {
             newCompositeNode(grammarAccess.getPathExprRule()); 
            pushFollow(FOLLOW_rulePathExpr_in_entryRulePathExpr3582);
            iv_rulePathExpr=rulePathExpr();

            state._fsp--;

             current =iv_rulePathExpr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExpr3592); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1612:1: rulePathExpr returns [EObject current=null] : (otherlv_0= '#' ( (lv_segments_1_0= rulePathSegment ) ) (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )* ) ;
    public final EObject rulePathExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_segments_1_0 = null;

        AntlrDatatypeRuleToken lv_segments_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1615:28: ( (otherlv_0= '#' ( (lv_segments_1_0= rulePathSegment ) ) (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )* ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1616:1: (otherlv_0= '#' ( (lv_segments_1_0= rulePathSegment ) ) (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )* )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1616:1: (otherlv_0= '#' ( (lv_segments_1_0= rulePathSegment ) ) (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )* )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1616:3: otherlv_0= '#' ( (lv_segments_1_0= rulePathSegment ) ) (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )*
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_rulePathExpr3629); 

                	newLeafNode(otherlv_0, grammarAccess.getPathExprAccess().getNumberSignKeyword_0());
                
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1620:1: ( (lv_segments_1_0= rulePathSegment ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1621:1: (lv_segments_1_0= rulePathSegment )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1621:1: (lv_segments_1_0= rulePathSegment )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1622:3: lv_segments_1_0= rulePathSegment
            {
             
            	        newCompositeNode(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePathSegment_in_rulePathExpr3650);
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

            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1638:2: (otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==43) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1638:4: otherlv_2= '/' ( (lv_segments_3_0= rulePathSegment ) )
            	    {
            	    otherlv_2=(Token)match(input,43,FOLLOW_43_in_rulePathExpr3663); 

            	        	newLeafNode(otherlv_2, grammarAccess.getPathExprAccess().getSolidusKeyword_2_0());
            	        
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1642:1: ( (lv_segments_3_0= rulePathSegment ) )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1643:1: (lv_segments_3_0= rulePathSegment )
            	    {
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1643:1: (lv_segments_3_0= rulePathSegment )
            	    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1644:3: lv_segments_3_0= rulePathSegment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePathSegment_in_rulePathExpr3684);
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
            	    break loop33;
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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1668:1: entryRulePathSegment returns [String current=null] : iv_rulePathSegment= rulePathSegment EOF ;
    public final String entryRulePathSegment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePathSegment = null;


        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1669:2: (iv_rulePathSegment= rulePathSegment EOF )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1670:2: iv_rulePathSegment= rulePathSegment EOF
            {
             newCompositeNode(grammarAccess.getPathSegmentRule()); 
            pushFollow(FOLLOW_rulePathSegment_in_entryRulePathSegment3723);
            iv_rulePathSegment=rulePathSegment();

            state._fsp--;

             current =iv_rulePathSegment.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathSegment3734); 

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
    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1677:1: rulePathSegment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '..' | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken rulePathSegment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1680:28: ( (kw= '..' | this_ID_1= RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1681:1: (kw= '..' | this_ID_1= RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1681:1: (kw= '..' | this_ID_1= RULE_ID )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_ID) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1682:2: kw= '..'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_rulePathSegment3772); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPathSegmentAccess().getFullStopFullStopKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext/src-gen/org/earthsystemcurator/parser/antlr/internal/InternalCupidLanguage.g:1688:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathSegment3793); 

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
    public static final BitSet FOLLOW_ruleMapping_in_ruleMappings131 = new BitSet(new long[]{0x000004C00E401802L});
    public static final BitSet FOLLOW_ruleConceptDef_in_ruleMappings153 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleConceptDefOrRef_in_entryRuleConceptDefOrRef190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConceptDefOrRef200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnonymousConcept_in_ruleConceptDefOrRef247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConceptRef_in_ruleConceptDefOrRef274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConceptDef_in_entryRuleConceptDef309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConceptDef319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleConceptDef362 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleConceptDef388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConceptDef405 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_13_in_ruleConceptDef423 = new BitSet(new long[]{0x000004C00E405800L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleConceptDef444 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConceptDef456 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleConceptDefBody_in_ruleConceptDef479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnonymousConcept_in_entryRuleAnonymousConcept516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnonymousConcept526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnonymousConcept568 = new BitSet(new long[]{0x000000000031A002L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleAnonymousConcept594 = new BitSet(new long[]{0x000000000001A002L});
    public static final BitSet FOLLOW_15_in_ruleAnonymousConcept613 = new BitSet(new long[]{0x0000000000012002L});
    public static final BitSet FOLLOW_13_in_ruleAnonymousConcept640 = new BitSet(new long[]{0x000004C00E405800L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleAnonymousConcept661 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAnonymousConcept673 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleConceptDefBody_in_ruleAnonymousConcept696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConceptDefBody_in_entryRuleConceptDefBody733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConceptDefBody743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleConceptDefBody780 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConceptDefOrRef_in_ruleConceptDefBody801 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleConceptDefBody814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleConceptDefOrRef_in_ruleConceptDefBody835 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleConceptDefBody849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConceptRef_in_entryRuleConceptRef885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConceptRef895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConceptRef937 = new BitSet(new long[]{0x0000000000388000L});
    public static final BitSet FOLLOW_ruleCardinality_in_ruleConceptRef963 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_15_in_ruleConceptRef982 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConceptRef1008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConceptRef1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality1064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCardinality1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCardinality1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_ruleMapping1259 = new BitSet(new long[]{0x000004C00E401800L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_ruleMapping1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_entryRuleImplicitContextMapping1317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitContextMapping1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_ruleImplicitContextMapping1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesModule_in_ruleImplicitContextMapping1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesEntity_in_ruleImplicitContextMapping1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleImplicitContextMapping1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_ruleImplicitContextMapping1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutineName_in_ruleImplicitContextMapping1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule1544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleModule1600 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleModule1613 = new BitSet(new long[]{0x0000040000100010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleModule1634 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleModule1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesModule_in_entryRuleUsesModule1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsesModule1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleUsesModule1731 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUsesModule1743 = new BitSet(new long[]{0x0000040000100010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleUsesModule1764 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleUsesModule1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesEntity_in_entryRuleUsesEntity1812 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsesEntity1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleUsesEntity1859 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUsesEntity1871 = new BitSet(new long[]{0x0000040000100010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleUsesEntity1892 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleUsesEntity1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_entryRuleSubroutine1940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutine1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleSubroutine1987 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSubroutine1999 = new BitSet(new long[]{0x0000040000100010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleSubroutine2020 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleSubroutine2033 = new BitSet(new long[]{0x0000002FF1000000L});
    public static final BitSet FOLLOW_ruleFormalParam_in_ruleSubroutine2055 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_17_in_ruleSubroutine2068 = new BitSet(new long[]{0x0000002FF0000000L});
    public static final BitSet FOLLOW_ruleFormalParam_in_ruleSubroutine2089 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_24_in_ruleSubroutine2105 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSubroutine2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalParam_in_entryRuleFormalParam2155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalParam2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_ruleFormalParam2211 = new BitSet(new long[]{0x0000002FF0000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleFormalParam2233 = new BitSet(new long[]{0x0000040000100010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleFormalParam2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_entryRuleIntent2290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntent2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleIntent2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleIntent2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleIntent2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleType2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleType2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleType2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleType2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleType2668 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleType2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleType2722 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleType2747 = new BitSet(new long[]{0x0000040000100010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleType2768 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleType2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutineName_in_entryRuleSubroutineName2817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutineName2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleSubroutineName2864 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleSubroutineName2886 = new BitSet(new long[]{0x0000040000100010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleSubroutineName2907 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSubroutineName2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall2957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCall3004 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCall3016 = new BitSet(new long[]{0x0000040000100010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleCall3037 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleCall3050 = new BitSet(new long[]{0x0000040001100010L});
    public static final BitSet FOLLOW_ruleActualParam_in_ruleCall3072 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_17_in_ruleCall3085 = new BitSet(new long[]{0x0000040000100010L});
    public static final BitSet FOLLOW_ruleActualParam_in_ruleCall3106 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_24_in_ruleCall3122 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCall3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_entryRuleActualParam3172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualParam3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActualParam3225 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_40_in_ruleActualParam3248 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleActualParam3274 = new BitSet(new long[]{0x0000040000100010L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_ruleActualParam3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrWildcard_in_entryRuleIDOrWildcard3333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrWildcard3343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIDOrWildcard3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleIDOrWildcard3414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_entryRuleIDOrPathExpr3463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrPathExpr3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrWildcard_in_ruleIDOrPathExpr3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_ruleIDOrPathExpr3547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_entryRulePathExpr3582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExpr3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePathExpr3629 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rulePathSegment_in_rulePathExpr3650 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_rulePathExpr3663 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_rulePathSegment_in_rulePathExpr3684 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rulePathSegment_in_entryRulePathSegment3723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathSegment3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePathSegment3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathSegment3793 = new BitSet(new long[]{0x0000000000000002L});

}