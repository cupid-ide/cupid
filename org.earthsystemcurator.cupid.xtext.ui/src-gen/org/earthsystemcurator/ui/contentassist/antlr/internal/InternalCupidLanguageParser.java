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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCupidLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'..'", "'call'", "'('", "')'", "','", "'='", "'#'", "'/'", "'?'", "'*'"
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
    public String getGrammarFileName() { return "../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g"; }


     
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




    // $ANTLR start "entryRuleMappings"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:60:1: entryRuleMappings : ruleMappings EOF ;
    public final void entryRuleMappings() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:61:1: ( ruleMappings EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:62:1: ruleMappings EOF
            {
             before(grammarAccess.getMappingsRule()); 
            pushFollow(FOLLOW_ruleMappings_in_entryRuleMappings61);
            ruleMappings();

            state._fsp--;

             after(grammarAccess.getMappingsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMappings68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMappings"


    // $ANTLR start "ruleMappings"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:69:1: ruleMappings : ( ( rule__Mappings__MappingsAssignment )* ) ;
    public final void ruleMappings() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:73:2: ( ( ( rule__Mappings__MappingsAssignment )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:74:1: ( ( rule__Mappings__MappingsAssignment )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:74:1: ( ( rule__Mappings__MappingsAssignment )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:75:1: ( rule__Mappings__MappingsAssignment )*
            {
             before(grammarAccess.getMappingsAccess().getMappingsAssignment()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:76:1: ( rule__Mappings__MappingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:76:2: rule__Mappings__MappingsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Mappings__MappingsAssignment_in_ruleMappings94);
            	    rule__Mappings__MappingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMappingsAccess().getMappingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMappings"


    // $ANTLR start "entryRuleMapping"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:88:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:89:1: ( ruleMapping EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:90:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping122);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:97:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:101:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:102:1: ( ( rule__Mapping__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:102:1: ( ( rule__Mapping__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:103:1: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:104:1: ( rule__Mapping__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:104:2: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0_in_ruleMapping155);
            rule__Mapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleImplicitContextMapping"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:116:1: entryRuleImplicitContextMapping : ruleImplicitContextMapping EOF ;
    public final void entryRuleImplicitContextMapping() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:117:1: ( ruleImplicitContextMapping EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:118:1: ruleImplicitContextMapping EOF
            {
             before(grammarAccess.getImplicitContextMappingRule()); 
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_entryRuleImplicitContextMapping182);
            ruleImplicitContextMapping();

            state._fsp--;

             after(grammarAccess.getImplicitContextMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitContextMapping189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImplicitContextMapping"


    // $ANTLR start "ruleImplicitContextMapping"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:125:1: ruleImplicitContextMapping : ( ruleCall ) ;
    public final void ruleImplicitContextMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:129:2: ( ( ruleCall ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:130:1: ( ruleCall )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:130:1: ( ruleCall )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:131:1: ruleCall
            {
             before(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall()); 
            pushFollow(FOLLOW_ruleCall_in_ruleImplicitContextMapping215);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImplicitContextMapping"


    // $ANTLR start "entryRuleCall"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:144:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:145:1: ( ruleCall EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:146:1: ruleCall EOF
            {
             before(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall241);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:153:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:157:2: ( ( ( rule__Call__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:158:1: ( ( rule__Call__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:158:1: ( ( rule__Call__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:159:1: ( rule__Call__Group__0 )
            {
             before(grammarAccess.getCallAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:160:1: ( rule__Call__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:160:2: rule__Call__Group__0
            {
            pushFollow(FOLLOW_rule__Call__Group__0_in_ruleCall274);
            rule__Call__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleActualParam"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:172:1: entryRuleActualParam : ruleActualParam EOF ;
    public final void entryRuleActualParam() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:173:1: ( ruleActualParam EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:174:1: ruleActualParam EOF
            {
             before(grammarAccess.getActualParamRule()); 
            pushFollow(FOLLOW_ruleActualParam_in_entryRuleActualParam301);
            ruleActualParam();

            state._fsp--;

             after(grammarAccess.getActualParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualParam308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActualParam"


    // $ANTLR start "ruleActualParam"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:181:1: ruleActualParam : ( ( rule__ActualParam__Group__0 ) ) ;
    public final void ruleActualParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:185:2: ( ( ( rule__ActualParam__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:186:1: ( ( rule__ActualParam__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:186:1: ( ( rule__ActualParam__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:187:1: ( rule__ActualParam__Group__0 )
            {
             before(grammarAccess.getActualParamAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:188:1: ( rule__ActualParam__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:188:2: rule__ActualParam__Group__0
            {
            pushFollow(FOLLOW_rule__ActualParam__Group__0_in_ruleActualParam334);
            rule__ActualParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActualParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActualParam"


    // $ANTLR start "entryRuleIDOrWildcard"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:200:1: entryRuleIDOrWildcard : ruleIDOrWildcard EOF ;
    public final void entryRuleIDOrWildcard() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:201:1: ( ruleIDOrWildcard EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:202:1: ruleIDOrWildcard EOF
            {
             before(grammarAccess.getIDOrWildcardRule()); 
            pushFollow(FOLLOW_ruleIDOrWildcard_in_entryRuleIDOrWildcard361);
            ruleIDOrWildcard();

            state._fsp--;

             after(grammarAccess.getIDOrWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrWildcard368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIDOrWildcard"


    // $ANTLR start "ruleIDOrWildcard"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:209:1: ruleIDOrWildcard : ( ( rule__IDOrWildcard__Alternatives ) ) ;
    public final void ruleIDOrWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:213:2: ( ( ( rule__IDOrWildcard__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:214:1: ( ( rule__IDOrWildcard__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:214:1: ( ( rule__IDOrWildcard__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:215:1: ( rule__IDOrWildcard__Alternatives )
            {
             before(grammarAccess.getIDOrWildcardAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:216:1: ( rule__IDOrWildcard__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:216:2: rule__IDOrWildcard__Alternatives
            {
            pushFollow(FOLLOW_rule__IDOrWildcard__Alternatives_in_ruleIDOrWildcard394);
            rule__IDOrWildcard__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIDOrWildcardAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIDOrWildcard"


    // $ANTLR start "entryRuleIDOrPathExpr"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:228:1: entryRuleIDOrPathExpr : ruleIDOrPathExpr EOF ;
    public final void entryRuleIDOrPathExpr() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:229:1: ( ruleIDOrPathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:230:1: ruleIDOrPathExpr EOF
            {
             before(grammarAccess.getIDOrPathExprRule()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_entryRuleIDOrPathExpr421);
            ruleIDOrPathExpr();

            state._fsp--;

             after(grammarAccess.getIDOrPathExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrPathExpr428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIDOrPathExpr"


    // $ANTLR start "ruleIDOrPathExpr"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:237:1: ruleIDOrPathExpr : ( ( rule__IDOrPathExpr__Alternatives ) ) ;
    public final void ruleIDOrPathExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:241:2: ( ( ( rule__IDOrPathExpr__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:242:1: ( ( rule__IDOrPathExpr__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:242:1: ( ( rule__IDOrPathExpr__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:243:1: ( rule__IDOrPathExpr__Alternatives )
            {
             before(grammarAccess.getIDOrPathExprAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:244:1: ( rule__IDOrPathExpr__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:244:2: rule__IDOrPathExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__IDOrPathExpr__Alternatives_in_ruleIDOrPathExpr454);
            rule__IDOrPathExpr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIDOrPathExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIDOrPathExpr"


    // $ANTLR start "entryRulePathExpr"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:256:1: entryRulePathExpr : rulePathExpr EOF ;
    public final void entryRulePathExpr() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:257:1: ( rulePathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:258:1: rulePathExpr EOF
            {
             before(grammarAccess.getPathExprRule()); 
            pushFollow(FOLLOW_rulePathExpr_in_entryRulePathExpr481);
            rulePathExpr();

            state._fsp--;

             after(grammarAccess.getPathExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExpr488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePathExpr"


    // $ANTLR start "rulePathExpr"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:265:1: rulePathExpr : ( ( rule__PathExpr__Group__0 ) ) ;
    public final void rulePathExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:269:2: ( ( ( rule__PathExpr__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:270:1: ( ( rule__PathExpr__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:270:1: ( ( rule__PathExpr__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:271:1: ( rule__PathExpr__Group__0 )
            {
             before(grammarAccess.getPathExprAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:272:1: ( rule__PathExpr__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:272:2: rule__PathExpr__Group__0
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__0_in_rulePathExpr514);
            rule__PathExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathExpr"


    // $ANTLR start "entryRulePathSegment"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:284:1: entryRulePathSegment : rulePathSegment EOF ;
    public final void entryRulePathSegment() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:285:1: ( rulePathSegment EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:286:1: rulePathSegment EOF
            {
             before(grammarAccess.getPathSegmentRule()); 
            pushFollow(FOLLOW_rulePathSegment_in_entryRulePathSegment541);
            rulePathSegment();

            state._fsp--;

             after(grammarAccess.getPathSegmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathSegment548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePathSegment"


    // $ANTLR start "rulePathSegment"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:293:1: rulePathSegment : ( ( rule__PathSegment__Alternatives ) ) ;
    public final void rulePathSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:297:2: ( ( ( rule__PathSegment__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:298:1: ( ( rule__PathSegment__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:298:1: ( ( rule__PathSegment__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:299:1: ( rule__PathSegment__Alternatives )
            {
             before(grammarAccess.getPathSegmentAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:300:1: ( rule__PathSegment__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:300:2: rule__PathSegment__Alternatives
            {
            pushFollow(FOLLOW_rule__PathSegment__Alternatives_in_rulePathSegment574);
            rule__PathSegment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPathSegmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathSegment"


    // $ANTLR start "rule__IDOrWildcard__Alternatives"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:312:1: rule__IDOrWildcard__Alternatives : ( ( ( rule__IDOrWildcard__IdAssignment_0 ) ) | ( ( rule__IDOrWildcard__WildcardAssignment_1 ) ) );
    public final void rule__IDOrWildcard__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:316:1: ( ( ( rule__IDOrWildcard__IdAssignment_0 ) ) | ( ( rule__IDOrWildcard__WildcardAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==20) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:317:1: ( ( rule__IDOrWildcard__IdAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:317:1: ( ( rule__IDOrWildcard__IdAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:318:1: ( rule__IDOrWildcard__IdAssignment_0 )
                    {
                     before(grammarAccess.getIDOrWildcardAccess().getIdAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:319:1: ( rule__IDOrWildcard__IdAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:319:2: rule__IDOrWildcard__IdAssignment_0
                    {
                    pushFollow(FOLLOW_rule__IDOrWildcard__IdAssignment_0_in_rule__IDOrWildcard__Alternatives610);
                    rule__IDOrWildcard__IdAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIDOrWildcardAccess().getIdAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:323:6: ( ( rule__IDOrWildcard__WildcardAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:323:6: ( ( rule__IDOrWildcard__WildcardAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:324:1: ( rule__IDOrWildcard__WildcardAssignment_1 )
                    {
                     before(grammarAccess.getIDOrWildcardAccess().getWildcardAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:325:1: ( rule__IDOrWildcard__WildcardAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:325:2: rule__IDOrWildcard__WildcardAssignment_1
                    {
                    pushFollow(FOLLOW_rule__IDOrWildcard__WildcardAssignment_1_in_rule__IDOrWildcard__Alternatives628);
                    rule__IDOrWildcard__WildcardAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getIDOrWildcardAccess().getWildcardAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDOrWildcard__Alternatives"


    // $ANTLR start "rule__IDOrPathExpr__Alternatives"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:334:1: rule__IDOrPathExpr__Alternatives : ( ( ruleIDOrWildcard ) | ( rulePathExpr ) );
    public final void rule__IDOrPathExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:338:1: ( ( ruleIDOrWildcard ) | ( rulePathExpr ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||LA3_0==20) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:339:1: ( ruleIDOrWildcard )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:339:1: ( ruleIDOrWildcard )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:340:1: ruleIDOrWildcard
                    {
                     before(grammarAccess.getIDOrPathExprAccess().getIDOrWildcardParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIDOrWildcard_in_rule__IDOrPathExpr__Alternatives661);
                    ruleIDOrWildcard();

                    state._fsp--;

                     after(grammarAccess.getIDOrPathExprAccess().getIDOrWildcardParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:345:6: ( rulePathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:345:6: ( rulePathExpr )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:346:1: rulePathExpr
                    {
                     before(grammarAccess.getIDOrPathExprAccess().getPathExprParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePathExpr_in_rule__IDOrPathExpr__Alternatives678);
                    rulePathExpr();

                    state._fsp--;

                     after(grammarAccess.getIDOrPathExprAccess().getPathExprParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDOrPathExpr__Alternatives"


    // $ANTLR start "rule__PathSegment__Alternatives"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:356:1: rule__PathSegment__Alternatives : ( ( '..' ) | ( RULE_ID ) );
    public final void rule__PathSegment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:360:1: ( ( '..' ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:361:1: ( '..' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:361:1: ( '..' )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:362:1: '..'
                    {
                     before(grammarAccess.getPathSegmentAccess().getFullStopFullStopKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__PathSegment__Alternatives711); 
                     after(grammarAccess.getPathSegmentAccess().getFullStopFullStopKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:369:6: ( RULE_ID )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:369:6: ( RULE_ID )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:370:1: RULE_ID
                    {
                     before(grammarAccess.getPathSegmentAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathSegment__Alternatives730); 
                     after(grammarAccess.getPathSegmentAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathSegment__Alternatives"


    // $ANTLR start "rule__Mapping__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:382:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:386:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:387:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__0760);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__0763);
            rule__Mapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0"


    // $ANTLR start "rule__Mapping__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:394:1: rule__Mapping__Group__0__Impl : ( ( rule__Mapping__ContextAssignment_0 )? ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:398:1: ( ( ( rule__Mapping__ContextAssignment_0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:399:1: ( ( rule__Mapping__ContextAssignment_0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:399:1: ( ( rule__Mapping__ContextAssignment_0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:400:1: ( rule__Mapping__ContextAssignment_0 )?
            {
             before(grammarAccess.getMappingAccess().getContextAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:401:1: ( rule__Mapping__ContextAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:401:2: rule__Mapping__ContextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Mapping__ContextAssignment_0_in_rule__Mapping__Group__0__Impl790);
                    rule__Mapping__ContextAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingAccess().getContextAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0__Impl"


    // $ANTLR start "rule__Mapping__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:411:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:415:1: ( rule__Mapping__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:416:2: rule__Mapping__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__1821);
            rule__Mapping__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1"


    // $ANTLR start "rule__Mapping__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:422:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__MappingAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:426:1: ( ( ( rule__Mapping__MappingAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:427:1: ( ( rule__Mapping__MappingAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:427:1: ( ( rule__Mapping__MappingAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:428:1: ( rule__Mapping__MappingAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getMappingAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:429:1: ( rule__Mapping__MappingAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:429:2: rule__Mapping__MappingAssignment_1
            {
            pushFollow(FOLLOW_rule__Mapping__MappingAssignment_1_in_rule__Mapping__Group__1__Impl848);
            rule__Mapping__MappingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getMappingAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1__Impl"


    // $ANTLR start "rule__Call__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:443:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:447:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:448:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__0882);
            rule__Call__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__0885);
            rule__Call__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__0"


    // $ANTLR start "rule__Call__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:455:1: rule__Call__Group__0__Impl : ( 'call' ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:459:1: ( ( 'call' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:460:1: ( 'call' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:460:1: ( 'call' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:461:1: 'call'
            {
             before(grammarAccess.getCallAccess().getCallKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Call__Group__0__Impl913); 
             after(grammarAccess.getCallAccess().getCallKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__0__Impl"


    // $ANTLR start "rule__Call__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:474:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:478:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:479:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__1944);
            rule__Call__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__2_in_rule__Call__Group__1947);
            rule__Call__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__1"


    // $ANTLR start "rule__Call__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:486:1: rule__Call__Group__1__Impl : ( '(' ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:490:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:491:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:491:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:492:1: '('
            {
             before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,13,FOLLOW_13_in_rule__Call__Group__1__Impl975); 
             after(grammarAccess.getCallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__1__Impl"


    // $ANTLR start "rule__Call__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:505:1: rule__Call__Group__2 : rule__Call__Group__2__Impl rule__Call__Group__3 ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:509:1: ( rule__Call__Group__2__Impl rule__Call__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:510:2: rule__Call__Group__2__Impl rule__Call__Group__3
            {
            pushFollow(FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__21006);
            rule__Call__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__3_in_rule__Call__Group__21009);
            rule__Call__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__2"


    // $ANTLR start "rule__Call__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:517:1: rule__Call__Group__2__Impl : ( ( rule__Call__SubroutineNameAssignment_2 ) ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:521:1: ( ( ( rule__Call__SubroutineNameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:522:1: ( ( rule__Call__SubroutineNameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:522:1: ( ( rule__Call__SubroutineNameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:523:1: ( rule__Call__SubroutineNameAssignment_2 )
            {
             before(grammarAccess.getCallAccess().getSubroutineNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:524:1: ( rule__Call__SubroutineNameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:524:2: rule__Call__SubroutineNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Call__SubroutineNameAssignment_2_in_rule__Call__Group__2__Impl1036);
            rule__Call__SubroutineNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getSubroutineNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__2__Impl"


    // $ANTLR start "rule__Call__Group__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:534:1: rule__Call__Group__3 : rule__Call__Group__3__Impl rule__Call__Group__4 ;
    public final void rule__Call__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:538:1: ( rule__Call__Group__3__Impl rule__Call__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:539:2: rule__Call__Group__3__Impl rule__Call__Group__4
            {
            pushFollow(FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__31066);
            rule__Call__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__4_in_rule__Call__Group__31069);
            rule__Call__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__3"


    // $ANTLR start "rule__Call__Group__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:546:1: rule__Call__Group__3__Impl : ( ( rule__Call__Group_3__0 )? ) ;
    public final void rule__Call__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:550:1: ( ( ( rule__Call__Group_3__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:551:1: ( ( rule__Call__Group_3__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:551:1: ( ( rule__Call__Group_3__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:552:1: ( rule__Call__Group_3__0 )?
            {
             before(grammarAccess.getCallAccess().getGroup_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:553:1: ( rule__Call__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:553:2: rule__Call__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl1096);
                    rule__Call__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCallAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__3__Impl"


    // $ANTLR start "rule__Call__Group__4"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:563:1: rule__Call__Group__4 : rule__Call__Group__4__Impl ;
    public final void rule__Call__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:567:1: ( rule__Call__Group__4__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:568:2: rule__Call__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__41127);
            rule__Call__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__4"


    // $ANTLR start "rule__Call__Group__4__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:574:1: rule__Call__Group__4__Impl : ( ')' ) ;
    public final void rule__Call__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:578:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:579:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:579:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:580:1: ')'
            {
             before(grammarAccess.getCallAccess().getRightParenthesisKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Call__Group__4__Impl1155); 
             after(grammarAccess.getCallAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__4__Impl"


    // $ANTLR start "rule__Call__Group_3__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:603:1: rule__Call__Group_3__0 : rule__Call__Group_3__0__Impl rule__Call__Group_3__1 ;
    public final void rule__Call__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:607:1: ( rule__Call__Group_3__0__Impl rule__Call__Group_3__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:608:2: rule__Call__Group_3__0__Impl rule__Call__Group_3__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__01196);
            rule__Call__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__01199);
            rule__Call__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3__0"


    // $ANTLR start "rule__Call__Group_3__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:615:1: rule__Call__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Call__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:619:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:620:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:620:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:621:1: '('
            {
             before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__Call__Group_3__0__Impl1227); 
             after(grammarAccess.getCallAccess().getLeftParenthesisKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3__0__Impl"


    // $ANTLR start "rule__Call__Group_3__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:634:1: rule__Call__Group_3__1 : rule__Call__Group_3__1__Impl rule__Call__Group_3__2 ;
    public final void rule__Call__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:638:1: ( rule__Call__Group_3__1__Impl rule__Call__Group_3__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:639:2: rule__Call__Group_3__1__Impl rule__Call__Group_3__2
            {
            pushFollow(FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__11258);
            rule__Call__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3__2_in_rule__Call__Group_3__11261);
            rule__Call__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3__1"


    // $ANTLR start "rule__Call__Group_3__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:646:1: rule__Call__Group_3__1__Impl : ( ( rule__Call__Group_3_1__0 )? ) ;
    public final void rule__Call__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:650:1: ( ( ( rule__Call__Group_3_1__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:651:1: ( ( rule__Call__Group_3_1__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:651:1: ( ( rule__Call__Group_3_1__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:652:1: ( rule__Call__Group_3_1__0 )?
            {
             before(grammarAccess.getCallAccess().getGroup_3_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:653:1: ( rule__Call__Group_3_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||LA7_0==17||LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:653:2: rule__Call__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Call__Group_3_1__0_in_rule__Call__Group_3__1__Impl1288);
                    rule__Call__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCallAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3__1__Impl"


    // $ANTLR start "rule__Call__Group_3__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:663:1: rule__Call__Group_3__2 : rule__Call__Group_3__2__Impl ;
    public final void rule__Call__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:667:1: ( rule__Call__Group_3__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:668:2: rule__Call__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3__2__Impl_in_rule__Call__Group_3__21319);
            rule__Call__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3__2"


    // $ANTLR start "rule__Call__Group_3__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:674:1: rule__Call__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Call__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:678:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:679:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:679:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:680:1: ')'
            {
             before(grammarAccess.getCallAccess().getRightParenthesisKeyword_3_2()); 
            match(input,14,FOLLOW_14_in_rule__Call__Group_3__2__Impl1347); 
             after(grammarAccess.getCallAccess().getRightParenthesisKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3__2__Impl"


    // $ANTLR start "rule__Call__Group_3_1__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:699:1: rule__Call__Group_3_1__0 : rule__Call__Group_3_1__0__Impl rule__Call__Group_3_1__1 ;
    public final void rule__Call__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:703:1: ( rule__Call__Group_3_1__0__Impl rule__Call__Group_3_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:704:2: rule__Call__Group_3_1__0__Impl rule__Call__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1__0__Impl_in_rule__Call__Group_3_1__01384);
            rule__Call__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3_1__1_in_rule__Call__Group_3_1__01387);
            rule__Call__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3_1__0"


    // $ANTLR start "rule__Call__Group_3_1__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:711:1: rule__Call__Group_3_1__0__Impl : ( ( rule__Call__ParamsAssignment_3_1_0 ) ) ;
    public final void rule__Call__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:715:1: ( ( ( rule__Call__ParamsAssignment_3_1_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:716:1: ( ( rule__Call__ParamsAssignment_3_1_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:716:1: ( ( rule__Call__ParamsAssignment_3_1_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:717:1: ( rule__Call__ParamsAssignment_3_1_0 )
            {
             before(grammarAccess.getCallAccess().getParamsAssignment_3_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:718:1: ( rule__Call__ParamsAssignment_3_1_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:718:2: rule__Call__ParamsAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Call__ParamsAssignment_3_1_0_in_rule__Call__Group_3_1__0__Impl1414);
            rule__Call__ParamsAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getParamsAssignment_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3_1__0__Impl"


    // $ANTLR start "rule__Call__Group_3_1__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:728:1: rule__Call__Group_3_1__1 : rule__Call__Group_3_1__1__Impl ;
    public final void rule__Call__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:732:1: ( rule__Call__Group_3_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:733:2: rule__Call__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1__1__Impl_in_rule__Call__Group_3_1__11444);
            rule__Call__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3_1__1"


    // $ANTLR start "rule__Call__Group_3_1__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:739:1: rule__Call__Group_3_1__1__Impl : ( ( rule__Call__Group_3_1_1__0 )* ) ;
    public final void rule__Call__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:743:1: ( ( ( rule__Call__Group_3_1_1__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:744:1: ( ( rule__Call__Group_3_1_1__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:744:1: ( ( rule__Call__Group_3_1_1__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:745:1: ( rule__Call__Group_3_1_1__0 )*
            {
             before(grammarAccess.getCallAccess().getGroup_3_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:746:1: ( rule__Call__Group_3_1_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:746:2: rule__Call__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Call__Group_3_1_1__0_in_rule__Call__Group_3_1__1__Impl1471);
            	    rule__Call__Group_3_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCallAccess().getGroup_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3_1__1__Impl"


    // $ANTLR start "rule__Call__Group_3_1_1__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:760:1: rule__Call__Group_3_1_1__0 : rule__Call__Group_3_1_1__0__Impl rule__Call__Group_3_1_1__1 ;
    public final void rule__Call__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:764:1: ( rule__Call__Group_3_1_1__0__Impl rule__Call__Group_3_1_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:765:2: rule__Call__Group_3_1_1__0__Impl rule__Call__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1_1__0__Impl_in_rule__Call__Group_3_1_1__01506);
            rule__Call__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3_1_1__1_in_rule__Call__Group_3_1_1__01509);
            rule__Call__Group_3_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3_1_1__0"


    // $ANTLR start "rule__Call__Group_3_1_1__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:772:1: rule__Call__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Call__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:776:1: ( ( ',' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:777:1: ( ',' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:777:1: ( ',' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:778:1: ','
            {
             before(grammarAccess.getCallAccess().getCommaKeyword_3_1_1_0()); 
            match(input,15,FOLLOW_15_in_rule__Call__Group_3_1_1__0__Impl1537); 
             after(grammarAccess.getCallAccess().getCommaKeyword_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__Call__Group_3_1_1__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:791:1: rule__Call__Group_3_1_1__1 : rule__Call__Group_3_1_1__1__Impl ;
    public final void rule__Call__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:795:1: ( rule__Call__Group_3_1_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:796:2: rule__Call__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1_1__1__Impl_in_rule__Call__Group_3_1_1__11568);
            rule__Call__Group_3_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3_1_1__1"


    // $ANTLR start "rule__Call__Group_3_1_1__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:802:1: rule__Call__Group_3_1_1__1__Impl : ( ( rule__Call__ParamsAssignment_3_1_1_1 ) ) ;
    public final void rule__Call__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:806:1: ( ( ( rule__Call__ParamsAssignment_3_1_1_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:807:1: ( ( rule__Call__ParamsAssignment_3_1_1_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:807:1: ( ( rule__Call__ParamsAssignment_3_1_1_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:808:1: ( rule__Call__ParamsAssignment_3_1_1_1 )
            {
             before(grammarAccess.getCallAccess().getParamsAssignment_3_1_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:809:1: ( rule__Call__ParamsAssignment_3_1_1_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:809:2: rule__Call__ParamsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Call__ParamsAssignment_3_1_1_1_in_rule__Call__Group_3_1_1__1__Impl1595);
            rule__Call__ParamsAssignment_3_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCallAccess().getParamsAssignment_3_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__ActualParam__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:823:1: rule__ActualParam__Group__0 : rule__ActualParam__Group__0__Impl rule__ActualParam__Group__1 ;
    public final void rule__ActualParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:827:1: ( rule__ActualParam__Group__0__Impl rule__ActualParam__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:828:2: rule__ActualParam__Group__0__Impl rule__ActualParam__Group__1
            {
            pushFollow(FOLLOW_rule__ActualParam__Group__0__Impl_in_rule__ActualParam__Group__01629);
            rule__ActualParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParam__Group__1_in_rule__ActualParam__Group__01632);
            rule__ActualParam__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualParam__Group__0"


    // $ANTLR start "rule__ActualParam__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:835:1: rule__ActualParam__Group__0__Impl : ( ( rule__ActualParam__Group_0__0 )? ) ;
    public final void rule__ActualParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:839:1: ( ( ( rule__ActualParam__Group_0__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:840:1: ( ( rule__ActualParam__Group_0__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:840:1: ( ( rule__ActualParam__Group_0__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:841:1: ( rule__ActualParam__Group_0__0 )?
            {
             before(grammarAccess.getActualParamAccess().getGroup_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:842:1: ( rule__ActualParam__Group_0__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==16||LA9_1==19) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:842:2: rule__ActualParam__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ActualParam__Group_0__0_in_rule__ActualParam__Group__0__Impl1659);
                    rule__ActualParam__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActualParamAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualParam__Group__0__Impl"


    // $ANTLR start "rule__ActualParam__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:852:1: rule__ActualParam__Group__1 : rule__ActualParam__Group__1__Impl ;
    public final void rule__ActualParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:856:1: ( rule__ActualParam__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:857:2: rule__ActualParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActualParam__Group__1__Impl_in_rule__ActualParam__Group__11690);
            rule__ActualParam__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualParam__Group__1"


    // $ANTLR start "rule__ActualParam__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:863:1: rule__ActualParam__Group__1__Impl : ( ( rule__ActualParam__ValueAssignment_1 ) ) ;
    public final void rule__ActualParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:867:1: ( ( ( rule__ActualParam__ValueAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:868:1: ( ( rule__ActualParam__ValueAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:868:1: ( ( rule__ActualParam__ValueAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:869:1: ( rule__ActualParam__ValueAssignment_1 )
            {
             before(grammarAccess.getActualParamAccess().getValueAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:870:1: ( rule__ActualParam__ValueAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:870:2: rule__ActualParam__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__ActualParam__ValueAssignment_1_in_rule__ActualParam__Group__1__Impl1717);
            rule__ActualParam__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActualParamAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualParam__Group__1__Impl"


    // $ANTLR start "rule__ActualParam__Group_0__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:884:1: rule__ActualParam__Group_0__0 : rule__ActualParam__Group_0__0__Impl rule__ActualParam__Group_0__1 ;
    public final void rule__ActualParam__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:888:1: ( rule__ActualParam__Group_0__0__Impl rule__ActualParam__Group_0__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:889:2: rule__ActualParam__Group_0__0__Impl rule__ActualParam__Group_0__1
            {
            pushFollow(FOLLOW_rule__ActualParam__Group_0__0__Impl_in_rule__ActualParam__Group_0__01751);
            rule__ActualParam__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParam__Group_0__1_in_rule__ActualParam__Group_0__01754);
            rule__ActualParam__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualParam__Group_0__0"


    // $ANTLR start "rule__ActualParam__Group_0__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:896:1: rule__ActualParam__Group_0__0__Impl : ( ( rule__ActualParam__KeywordAssignment_0_0 ) ) ;
    public final void rule__ActualParam__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:900:1: ( ( ( rule__ActualParam__KeywordAssignment_0_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:901:1: ( ( rule__ActualParam__KeywordAssignment_0_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:901:1: ( ( rule__ActualParam__KeywordAssignment_0_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:902:1: ( rule__ActualParam__KeywordAssignment_0_0 )
            {
             before(grammarAccess.getActualParamAccess().getKeywordAssignment_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:903:1: ( rule__ActualParam__KeywordAssignment_0_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:903:2: rule__ActualParam__KeywordAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ActualParam__KeywordAssignment_0_0_in_rule__ActualParam__Group_0__0__Impl1781);
            rule__ActualParam__KeywordAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getActualParamAccess().getKeywordAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualParam__Group_0__0__Impl"


    // $ANTLR start "rule__ActualParam__Group_0__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:913:1: rule__ActualParam__Group_0__1 : rule__ActualParam__Group_0__1__Impl rule__ActualParam__Group_0__2 ;
    public final void rule__ActualParam__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:917:1: ( rule__ActualParam__Group_0__1__Impl rule__ActualParam__Group_0__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:918:2: rule__ActualParam__Group_0__1__Impl rule__ActualParam__Group_0__2
            {
            pushFollow(FOLLOW_rule__ActualParam__Group_0__1__Impl_in_rule__ActualParam__Group_0__11811);
            rule__ActualParam__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParam__Group_0__2_in_rule__ActualParam__Group_0__11814);
            rule__ActualParam__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualParam__Group_0__1"


    // $ANTLR start "rule__ActualParam__Group_0__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:925:1: rule__ActualParam__Group_0__1__Impl : ( ( rule__ActualParam__OptionalAssignment_0_1 )? ) ;
    public final void rule__ActualParam__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:929:1: ( ( ( rule__ActualParam__OptionalAssignment_0_1 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:930:1: ( ( rule__ActualParam__OptionalAssignment_0_1 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:930:1: ( ( rule__ActualParam__OptionalAssignment_0_1 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:931:1: ( rule__ActualParam__OptionalAssignment_0_1 )?
            {
             before(grammarAccess.getActualParamAccess().getOptionalAssignment_0_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:932:1: ( rule__ActualParam__OptionalAssignment_0_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:932:2: rule__ActualParam__OptionalAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__ActualParam__OptionalAssignment_0_1_in_rule__ActualParam__Group_0__1__Impl1841);
                    rule__ActualParam__OptionalAssignment_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActualParamAccess().getOptionalAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualParam__Group_0__1__Impl"


    // $ANTLR start "rule__ActualParam__Group_0__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:942:1: rule__ActualParam__Group_0__2 : rule__ActualParam__Group_0__2__Impl ;
    public final void rule__ActualParam__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:946:1: ( rule__ActualParam__Group_0__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:947:2: rule__ActualParam__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ActualParam__Group_0__2__Impl_in_rule__ActualParam__Group_0__21872);
            rule__ActualParam__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualParam__Group_0__2"


    // $ANTLR start "rule__ActualParam__Group_0__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:953:1: rule__ActualParam__Group_0__2__Impl : ( '=' ) ;
    public final void rule__ActualParam__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:957:1: ( ( '=' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:958:1: ( '=' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:958:1: ( '=' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:959:1: '='
            {
             before(grammarAccess.getActualParamAccess().getEqualsSignKeyword_0_2()); 
            match(input,16,FOLLOW_16_in_rule__ActualParam__Group_0__2__Impl1900); 
             after(grammarAccess.getActualParamAccess().getEqualsSignKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualParam__Group_0__2__Impl"


    // $ANTLR start "rule__PathExpr__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:978:1: rule__PathExpr__Group__0 : rule__PathExpr__Group__0__Impl rule__PathExpr__Group__1 ;
    public final void rule__PathExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:982:1: ( rule__PathExpr__Group__0__Impl rule__PathExpr__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:983:2: rule__PathExpr__Group__0__Impl rule__PathExpr__Group__1
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__0__Impl_in_rule__PathExpr__Group__01937);
            rule__PathExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExpr__Group__1_in_rule__PathExpr__Group__01940);
            rule__PathExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpr__Group__0"


    // $ANTLR start "rule__PathExpr__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:990:1: rule__PathExpr__Group__0__Impl : ( '#' ) ;
    public final void rule__PathExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:994:1: ( ( '#' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:995:1: ( '#' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:995:1: ( '#' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:996:1: '#'
            {
             before(grammarAccess.getPathExprAccess().getNumberSignKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__PathExpr__Group__0__Impl1968); 
             after(grammarAccess.getPathExprAccess().getNumberSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpr__Group__0__Impl"


    // $ANTLR start "rule__PathExpr__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1009:1: rule__PathExpr__Group__1 : rule__PathExpr__Group__1__Impl rule__PathExpr__Group__2 ;
    public final void rule__PathExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1013:1: ( rule__PathExpr__Group__1__Impl rule__PathExpr__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1014:2: rule__PathExpr__Group__1__Impl rule__PathExpr__Group__2
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__1__Impl_in_rule__PathExpr__Group__11999);
            rule__PathExpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExpr__Group__2_in_rule__PathExpr__Group__12002);
            rule__PathExpr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpr__Group__1"


    // $ANTLR start "rule__PathExpr__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1021:1: rule__PathExpr__Group__1__Impl : ( ( rule__PathExpr__SegmentsAssignment_1 ) ) ;
    public final void rule__PathExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1025:1: ( ( ( rule__PathExpr__SegmentsAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1026:1: ( ( rule__PathExpr__SegmentsAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1026:1: ( ( rule__PathExpr__SegmentsAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1027:1: ( rule__PathExpr__SegmentsAssignment_1 )
            {
             before(grammarAccess.getPathExprAccess().getSegmentsAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1028:1: ( rule__PathExpr__SegmentsAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1028:2: rule__PathExpr__SegmentsAssignment_1
            {
            pushFollow(FOLLOW_rule__PathExpr__SegmentsAssignment_1_in_rule__PathExpr__Group__1__Impl2029);
            rule__PathExpr__SegmentsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPathExprAccess().getSegmentsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpr__Group__1__Impl"


    // $ANTLR start "rule__PathExpr__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1038:1: rule__PathExpr__Group__2 : rule__PathExpr__Group__2__Impl ;
    public final void rule__PathExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1042:1: ( rule__PathExpr__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1043:2: rule__PathExpr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__2__Impl_in_rule__PathExpr__Group__22059);
            rule__PathExpr__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpr__Group__2"


    // $ANTLR start "rule__PathExpr__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1049:1: rule__PathExpr__Group__2__Impl : ( ( rule__PathExpr__Group_2__0 )* ) ;
    public final void rule__PathExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1053:1: ( ( ( rule__PathExpr__Group_2__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1054:1: ( ( rule__PathExpr__Group_2__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1054:1: ( ( rule__PathExpr__Group_2__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1055:1: ( rule__PathExpr__Group_2__0 )*
            {
             before(grammarAccess.getPathExprAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1056:1: ( rule__PathExpr__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1056:2: rule__PathExpr__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__PathExpr__Group_2__0_in_rule__PathExpr__Group__2__Impl2086);
            	    rule__PathExpr__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPathExprAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpr__Group__2__Impl"


    // $ANTLR start "rule__PathExpr__Group_2__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1072:1: rule__PathExpr__Group_2__0 : rule__PathExpr__Group_2__0__Impl rule__PathExpr__Group_2__1 ;
    public final void rule__PathExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1076:1: ( rule__PathExpr__Group_2__0__Impl rule__PathExpr__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1077:2: rule__PathExpr__Group_2__0__Impl rule__PathExpr__Group_2__1
            {
            pushFollow(FOLLOW_rule__PathExpr__Group_2__0__Impl_in_rule__PathExpr__Group_2__02123);
            rule__PathExpr__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExpr__Group_2__1_in_rule__PathExpr__Group_2__02126);
            rule__PathExpr__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpr__Group_2__0"


    // $ANTLR start "rule__PathExpr__Group_2__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1084:1: rule__PathExpr__Group_2__0__Impl : ( '/' ) ;
    public final void rule__PathExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1088:1: ( ( '/' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1089:1: ( '/' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1089:1: ( '/' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1090:1: '/'
            {
             before(grammarAccess.getPathExprAccess().getSolidusKeyword_2_0()); 
            match(input,18,FOLLOW_18_in_rule__PathExpr__Group_2__0__Impl2154); 
             after(grammarAccess.getPathExprAccess().getSolidusKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpr__Group_2__0__Impl"


    // $ANTLR start "rule__PathExpr__Group_2__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1103:1: rule__PathExpr__Group_2__1 : rule__PathExpr__Group_2__1__Impl ;
    public final void rule__PathExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1107:1: ( rule__PathExpr__Group_2__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1108:2: rule__PathExpr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PathExpr__Group_2__1__Impl_in_rule__PathExpr__Group_2__12185);
            rule__PathExpr__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpr__Group_2__1"


    // $ANTLR start "rule__PathExpr__Group_2__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1114:1: rule__PathExpr__Group_2__1__Impl : ( ( rule__PathExpr__SegmentsAssignment_2_1 ) ) ;
    public final void rule__PathExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1118:1: ( ( ( rule__PathExpr__SegmentsAssignment_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1119:1: ( ( rule__PathExpr__SegmentsAssignment_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1119:1: ( ( rule__PathExpr__SegmentsAssignment_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1120:1: ( rule__PathExpr__SegmentsAssignment_2_1 )
            {
             before(grammarAccess.getPathExprAccess().getSegmentsAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1121:1: ( rule__PathExpr__SegmentsAssignment_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1121:2: rule__PathExpr__SegmentsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PathExpr__SegmentsAssignment_2_1_in_rule__PathExpr__Group_2__1__Impl2212);
            rule__PathExpr__SegmentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPathExprAccess().getSegmentsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpr__Group_2__1__Impl"


    // $ANTLR start "rule__Mappings__MappingsAssignment"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1136:1: rule__Mappings__MappingsAssignment : ( ruleMapping ) ;
    public final void rule__Mappings__MappingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1140:1: ( ( ruleMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1141:1: ( ruleMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1141:1: ( ruleMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1142:1: ruleMapping
            {
             before(grammarAccess.getMappingsAccess().getMappingsMappingParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__Mappings__MappingsAssignment2251);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingsAccess().getMappingsMappingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mappings__MappingsAssignment"


    // $ANTLR start "rule__Mapping__ContextAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1151:1: rule__Mapping__ContextAssignment_0 : ( rulePathExpr ) ;
    public final void rule__Mapping__ContextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1155:1: ( ( rulePathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1156:1: ( rulePathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1156:1: ( rulePathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1157:1: rulePathExpr
            {
             before(grammarAccess.getMappingAccess().getContextPathExprParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePathExpr_in_rule__Mapping__ContextAssignment_02282);
            rulePathExpr();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getContextPathExprParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__ContextAssignment_0"


    // $ANTLR start "rule__Mapping__MappingAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1166:1: rule__Mapping__MappingAssignment_1 : ( ruleImplicitContextMapping ) ;
    public final void rule__Mapping__MappingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1170:1: ( ( ruleImplicitContextMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1171:1: ( ruleImplicitContextMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1171:1: ( ruleImplicitContextMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1172:1: ruleImplicitContextMapping
            {
             before(grammarAccess.getMappingAccess().getMappingImplicitContextMappingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_rule__Mapping__MappingAssignment_12313);
            ruleImplicitContextMapping();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getMappingImplicitContextMappingParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__MappingAssignment_1"


    // $ANTLR start "rule__Call__SubroutineNameAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1181:1: rule__Call__SubroutineNameAssignment_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__Call__SubroutineNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1185:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1186:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1186:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1187:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getCallAccess().getSubroutineNameIDOrPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__Call__SubroutineNameAssignment_22344);
            ruleIDOrPathExpr();

            state._fsp--;

             after(grammarAccess.getCallAccess().getSubroutineNameIDOrPathExprParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__SubroutineNameAssignment_2"


    // $ANTLR start "rule__Call__ParamsAssignment_3_1_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1196:1: rule__Call__ParamsAssignment_3_1_0 : ( ruleActualParam ) ;
    public final void rule__Call__ParamsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1200:1: ( ( ruleActualParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1201:1: ( ruleActualParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1201:1: ( ruleActualParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1202:1: ruleActualParam
            {
             before(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_02375);
            ruleActualParam();

            state._fsp--;

             after(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__ParamsAssignment_3_1_0"


    // $ANTLR start "rule__Call__ParamsAssignment_3_1_1_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1211:1: rule__Call__ParamsAssignment_3_1_1_1 : ( ruleActualParam ) ;
    public final void rule__Call__ParamsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1215:1: ( ( ruleActualParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1216:1: ( ruleActualParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1216:1: ( ruleActualParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1217:1: ruleActualParam
            {
             before(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_1_12406);
            ruleActualParam();

            state._fsp--;

             after(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__ParamsAssignment_3_1_1_1"


    // $ANTLR start "rule__ActualParam__KeywordAssignment_0_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1226:1: rule__ActualParam__KeywordAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__ActualParam__KeywordAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1230:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1231:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1231:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1232:1: RULE_ID
            {
             before(grammarAccess.getActualParamAccess().getKeywordIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActualParam__KeywordAssignment_0_02437); 
             after(grammarAccess.getActualParamAccess().getKeywordIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualParam__KeywordAssignment_0_0"


    // $ANTLR start "rule__ActualParam__OptionalAssignment_0_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1241:1: rule__ActualParam__OptionalAssignment_0_1 : ( ( '?' ) ) ;
    public final void rule__ActualParam__OptionalAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1245:1: ( ( ( '?' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1246:1: ( ( '?' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1246:1: ( ( '?' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1247:1: ( '?' )
            {
             before(grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1248:1: ( '?' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1249:1: '?'
            {
             before(grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0()); 
            match(input,19,FOLLOW_19_in_rule__ActualParam__OptionalAssignment_0_12473); 
             after(grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0()); 

            }

             after(grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualParam__OptionalAssignment_0_1"


    // $ANTLR start "rule__ActualParam__ValueAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1264:1: rule__ActualParam__ValueAssignment_1 : ( ruleIDOrPathExpr ) ;
    public final void rule__ActualParam__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1268:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1269:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1269:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1270:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getActualParamAccess().getValueIDOrPathExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__ActualParam__ValueAssignment_12512);
            ruleIDOrPathExpr();

            state._fsp--;

             after(grammarAccess.getActualParamAccess().getValueIDOrPathExprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActualParam__ValueAssignment_1"


    // $ANTLR start "rule__IDOrWildcard__IdAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1279:1: rule__IDOrWildcard__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__IDOrWildcard__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1283:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1284:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1284:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1285:1: RULE_ID
            {
             before(grammarAccess.getIDOrWildcardAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IDOrWildcard__IdAssignment_02543); 
             after(grammarAccess.getIDOrWildcardAccess().getIdIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDOrWildcard__IdAssignment_0"


    // $ANTLR start "rule__IDOrWildcard__WildcardAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1294:1: rule__IDOrWildcard__WildcardAssignment_1 : ( ( '*' ) ) ;
    public final void rule__IDOrWildcard__WildcardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1298:1: ( ( ( '*' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1299:1: ( ( '*' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1299:1: ( ( '*' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1300:1: ( '*' )
            {
             before(grammarAccess.getIDOrWildcardAccess().getWildcardAsteriskKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1301:1: ( '*' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1302:1: '*'
            {
             before(grammarAccess.getIDOrWildcardAccess().getWildcardAsteriskKeyword_1_0()); 
            match(input,20,FOLLOW_20_in_rule__IDOrWildcard__WildcardAssignment_12579); 
             after(grammarAccess.getIDOrWildcardAccess().getWildcardAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getIDOrWildcardAccess().getWildcardAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDOrWildcard__WildcardAssignment_1"


    // $ANTLR start "rule__PathExpr__SegmentsAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1317:1: rule__PathExpr__SegmentsAssignment_1 : ( rulePathSegment ) ;
    public final void rule__PathExpr__SegmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1321:1: ( ( rulePathSegment ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1322:1: ( rulePathSegment )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1322:1: ( rulePathSegment )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1323:1: rulePathSegment
            {
             before(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePathSegment_in_rule__PathExpr__SegmentsAssignment_12618);
            rulePathSegment();

            state._fsp--;

             after(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpr__SegmentsAssignment_1"


    // $ANTLR start "rule__PathExpr__SegmentsAssignment_2_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1332:1: rule__PathExpr__SegmentsAssignment_2_1 : ( rulePathSegment ) ;
    public final void rule__PathExpr__SegmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1336:1: ( ( rulePathSegment ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1337:1: ( rulePathSegment )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1337:1: ( rulePathSegment )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1338:1: rulePathSegment
            {
             before(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePathSegment_in_rule__PathExpr__SegmentsAssignment_2_12649);
            rulePathSegment();

            state._fsp--;

             after(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExpr__SegmentsAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMappings_in_entryRuleMappings61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMappings68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mappings__MappingsAssignment_in_ruleMappings94 = new BitSet(new long[]{0x0000000000021002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0_in_ruleMapping155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_entryRuleImplicitContextMapping182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitContextMapping189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleImplicitContextMapping215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0_in_ruleCall274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_entryRuleActualParam301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualParam308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__0_in_ruleActualParam334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrWildcard_in_entryRuleIDOrWildcard361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrWildcard368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrWildcard__Alternatives_in_ruleIDOrWildcard394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_entryRuleIDOrPathExpr421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrPathExpr428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrPathExpr__Alternatives_in_ruleIDOrPathExpr454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_entryRulePathExpr481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExpr488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__0_in_rulePathExpr514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegment_in_entryRulePathSegment541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathSegment548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__Alternatives_in_rulePathSegment574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrWildcard__IdAssignment_0_in_rule__IDOrWildcard__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrWildcard__WildcardAssignment_1_in_rule__IDOrWildcard__Alternatives628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrWildcard_in_rule__IDOrPathExpr__Alternatives661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_rule__IDOrPathExpr__Alternatives678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PathSegment__Alternatives711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathSegment__Alternatives730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__0760 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__0763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__ContextAssignment_0_in_rule__Mapping__Group__0__Impl790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__MappingAssignment_1_in_rule__Mapping__Group__1__Impl848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__0882 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__0885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Call__Group__0__Impl913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__1944 = new BitSet(new long[]{0x0000000000120010L});
    public static final BitSet FOLLOW_rule__Call__Group__2_in_rule__Call__Group__1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Call__Group__1__Impl975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__21006 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Call__Group__3_in_rule__Call__Group__21009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__SubroutineNameAssignment_2_in_rule__Call__Group__2__Impl1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__31066 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Call__Group__4_in_rule__Call__Group__31069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl1096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__41127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Call__Group__4__Impl1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__01196 = new BitSet(new long[]{0x0000000000124010L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__01199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Call__Group_3__0__Impl1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__11258 = new BitSet(new long[]{0x0000000000124010L});
    public static final BitSet FOLLOW_rule__Call__Group_3__2_in_rule__Call__Group_3__11261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__0_in_rule__Call__Group_3__1__Impl1288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__2__Impl_in_rule__Call__Group_3__21319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Call__Group_3__2__Impl1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__0__Impl_in_rule__Call__Group_3_1__01384 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__1_in_rule__Call__Group_3_1__01387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParamsAssignment_3_1_0_in_rule__Call__Group_3_1__0__Impl1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__1__Impl_in_rule__Call__Group_3_1__11444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__0_in_rule__Call__Group_3_1__1__Impl1471 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__0__Impl_in_rule__Call__Group_3_1_1__01506 = new BitSet(new long[]{0x0000000000120010L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__1_in_rule__Call__Group_3_1_1__01509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Call__Group_3_1_1__0__Impl1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__1__Impl_in_rule__Call__Group_3_1_1__11568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParamsAssignment_3_1_1_1_in_rule__Call__Group_3_1_1__1__Impl1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__0__Impl_in_rule__ActualParam__Group__01629 = new BitSet(new long[]{0x0000000000120010L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__1_in_rule__ActualParam__Group__01632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__0_in_rule__ActualParam__Group__0__Impl1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__1__Impl_in_rule__ActualParam__Group__11690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__ValueAssignment_1_in_rule__ActualParam__Group__1__Impl1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__0__Impl_in_rule__ActualParam__Group_0__01751 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__1_in_rule__ActualParam__Group_0__01754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__KeywordAssignment_0_0_in_rule__ActualParam__Group_0__0__Impl1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__1__Impl_in_rule__ActualParam__Group_0__11811 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__2_in_rule__ActualParam__Group_0__11814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__OptionalAssignment_0_1_in_rule__ActualParam__Group_0__1__Impl1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__2__Impl_in_rule__ActualParam__Group_0__21872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ActualParam__Group_0__2__Impl1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__0__Impl_in_rule__PathExpr__Group__01937 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__1_in_rule__PathExpr__Group__01940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PathExpr__Group__0__Impl1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__1__Impl_in_rule__PathExpr__Group__11999 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__2_in_rule__PathExpr__Group__12002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__SegmentsAssignment_1_in_rule__PathExpr__Group__1__Impl2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__2__Impl_in_rule__PathExpr__Group__22059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group_2__0_in_rule__PathExpr__Group__2__Impl2086 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group_2__0__Impl_in_rule__PathExpr__Group_2__02123 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__PathExpr__Group_2__1_in_rule__PathExpr__Group_2__02126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PathExpr__Group_2__0__Impl2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group_2__1__Impl_in_rule__PathExpr__Group_2__12185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__SegmentsAssignment_2_1_in_rule__PathExpr__Group_2__1__Impl2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__Mappings__MappingsAssignment2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_rule__Mapping__ContextAssignment_02282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_rule__Mapping__MappingAssignment_12313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__Call__SubroutineNameAssignment_22344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_02375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_1_12406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActualParam__KeywordAssignment_0_02437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ActualParam__OptionalAssignment_0_12473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__ActualParam__ValueAssignment_12512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IDOrWildcard__IdAssignment_02543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__IDOrWildcard__WildcardAssignment_12579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegment_in_rule__PathExpr__SegmentsAssignment_12618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegment_in_rule__PathExpr__SegmentsAssignment_2_12649 = new BitSet(new long[]{0x0000000000000002L});

}