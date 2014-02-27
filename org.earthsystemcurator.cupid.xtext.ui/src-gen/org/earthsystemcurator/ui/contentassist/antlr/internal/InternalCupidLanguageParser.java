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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'..'", "'language '", "'{'", "'}'", "'<'", "'>'", "'['", "']'", "','", "'='", "'concept'", "'module'", "'('", "')'", "'moduleName'", "'usesModule'", "'usesEntity'", "'subroutine'", "'precision'", "'subroutineName'", "'call'", "'#'", "'/'", "'attrib'", "'!'", "':'", "'top'", "'*'", "'+'", "'in'", "'out'", "'inout'", "'integer'", "'character'", "'logical'", "'real'", "'double'", "'type'", "'?'"
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




    // $ANTLR start "entryRuleLanguage"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:60:1: entryRuleLanguage : ruleLanguage EOF ;
    public final void entryRuleLanguage() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:61:1: ( ruleLanguage EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:62:1: ruleLanguage EOF
            {
             before(grammarAccess.getLanguageRule()); 
            pushFollow(FOLLOW_ruleLanguage_in_entryRuleLanguage61);
            ruleLanguage();

            state._fsp--;

             after(grammarAccess.getLanguageRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLanguage68); 

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
    // $ANTLR end "entryRuleLanguage"


    // $ANTLR start "ruleLanguage"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:69:1: ruleLanguage : ( ( rule__Language__Group__0 ) ) ;
    public final void ruleLanguage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:73:2: ( ( ( rule__Language__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:74:1: ( ( rule__Language__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:74:1: ( ( rule__Language__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:75:1: ( rule__Language__Group__0 )
            {
             before(grammarAccess.getLanguageAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:76:1: ( rule__Language__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:76:2: rule__Language__Group__0
            {
            pushFollow(FOLLOW_rule__Language__Group__0_in_ruleLanguage94);
            rule__Language__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getGroup()); 

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
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "entryRuleSubconcept"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:88:1: entryRuleSubconcept : ruleSubconcept EOF ;
    public final void entryRuleSubconcept() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:89:1: ( ruleSubconcept EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:90:1: ruleSubconcept EOF
            {
             before(grammarAccess.getSubconceptRule()); 
            pushFollow(FOLLOW_ruleSubconcept_in_entryRuleSubconcept121);
            ruleSubconcept();

            state._fsp--;

             after(grammarAccess.getSubconceptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubconcept128); 

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
    // $ANTLR end "entryRuleSubconcept"


    // $ANTLR start "ruleSubconcept"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:97:1: ruleSubconcept : ( ( rule__Subconcept__Group__0 ) ) ;
    public final void ruleSubconcept() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:101:2: ( ( ( rule__Subconcept__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:102:1: ( ( rule__Subconcept__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:102:1: ( ( rule__Subconcept__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:103:1: ( rule__Subconcept__Group__0 )
            {
             before(grammarAccess.getSubconceptAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:104:1: ( rule__Subconcept__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:104:2: rule__Subconcept__Group__0
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__0_in_ruleSubconcept154);
            rule__Subconcept__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubconceptAccess().getGroup()); 

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
    // $ANTLR end "ruleSubconcept"


    // $ANTLR start "entryRuleAnnotation"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:116:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:117:1: ( ruleAnnotation EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:118:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation181);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation188); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:125:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:129:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:130:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:130:1: ( ( rule__Annotation__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:131:1: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:132:1: ( rule__Annotation__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:132:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation214);
            rule__Annotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleConceptDef"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:144:1: entryRuleConceptDef : ruleConceptDef EOF ;
    public final void entryRuleConceptDef() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:145:1: ( ruleConceptDef EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:146:1: ruleConceptDef EOF
            {
             before(grammarAccess.getConceptDefRule()); 
            pushFollow(FOLLOW_ruleConceptDef_in_entryRuleConceptDef241);
            ruleConceptDef();

            state._fsp--;

             after(grammarAccess.getConceptDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConceptDef248); 

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
    // $ANTLR end "entryRuleConceptDef"


    // $ANTLR start "ruleConceptDef"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:153:1: ruleConceptDef : ( ( rule__ConceptDef__Group__0 ) ) ;
    public final void ruleConceptDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:157:2: ( ( ( rule__ConceptDef__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:158:1: ( ( rule__ConceptDef__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:158:1: ( ( rule__ConceptDef__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:159:1: ( rule__ConceptDef__Group__0 )
            {
             before(grammarAccess.getConceptDefAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:160:1: ( rule__ConceptDef__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:160:2: rule__ConceptDef__Group__0
            {
            pushFollow(FOLLOW_rule__ConceptDef__Group__0_in_ruleConceptDef274);
            rule__ConceptDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConceptDefAccess().getGroup()); 

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
    // $ANTLR end "ruleConceptDef"


    // $ANTLR start "entryRuleConceptDefBody"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:172:1: entryRuleConceptDefBody : ruleConceptDefBody EOF ;
    public final void entryRuleConceptDefBody() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:173:1: ( ruleConceptDefBody EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:174:1: ruleConceptDefBody EOF
            {
             before(grammarAccess.getConceptDefBodyRule()); 
            pushFollow(FOLLOW_ruleConceptDefBody_in_entryRuleConceptDefBody301);
            ruleConceptDefBody();

            state._fsp--;

             after(grammarAccess.getConceptDefBodyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConceptDefBody308); 

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
    // $ANTLR end "entryRuleConceptDefBody"


    // $ANTLR start "ruleConceptDefBody"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:181:1: ruleConceptDefBody : ( ( rule__ConceptDefBody__Group__0 ) ) ;
    public final void ruleConceptDefBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:185:2: ( ( ( rule__ConceptDefBody__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:186:1: ( ( rule__ConceptDefBody__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:186:1: ( ( rule__ConceptDefBody__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:187:1: ( rule__ConceptDefBody__Group__0 )
            {
             before(grammarAccess.getConceptDefBodyAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:188:1: ( rule__ConceptDefBody__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:188:2: rule__ConceptDefBody__Group__0
            {
            pushFollow(FOLLOW_rule__ConceptDefBody__Group__0_in_ruleConceptDefBody334);
            rule__ConceptDefBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConceptDefBodyAccess().getGroup()); 

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
    // $ANTLR end "ruleConceptDefBody"


    // $ANTLR start "entryRuleCardinality"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:200:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:201:1: ( ruleCardinality EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:202:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality361);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality368); 

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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:209:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:213:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:214:1: ( ( rule__Cardinality__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:214:1: ( ( rule__Cardinality__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:215:1: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:216:1: ( rule__Cardinality__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:216:2: rule__Cardinality__Alternatives
            {
            pushFollow(FOLLOW_rule__Cardinality__Alternatives_in_ruleCardinality394);
            rule__Cardinality__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleMapping"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:228:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:229:1: ( ruleMapping EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:230:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping421);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping428); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:237:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:241:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:242:1: ( ( rule__Mapping__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:242:1: ( ( rule__Mapping__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:243:1: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:244:1: ( rule__Mapping__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:244:2: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0_in_ruleMapping454);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:256:1: entryRuleImplicitContextMapping : ruleImplicitContextMapping EOF ;
    public final void entryRuleImplicitContextMapping() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:257:1: ( ruleImplicitContextMapping EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:258:1: ruleImplicitContextMapping EOF
            {
             before(grammarAccess.getImplicitContextMappingRule()); 
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_entryRuleImplicitContextMapping481);
            ruleImplicitContextMapping();

            state._fsp--;

             after(grammarAccess.getImplicitContextMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitContextMapping488); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:265:1: ruleImplicitContextMapping : ( ( rule__ImplicitContextMapping__Alternatives ) ) ;
    public final void ruleImplicitContextMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:269:2: ( ( ( rule__ImplicitContextMapping__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:270:1: ( ( rule__ImplicitContextMapping__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:270:1: ( ( rule__ImplicitContextMapping__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:271:1: ( rule__ImplicitContextMapping__Alternatives )
            {
             before(grammarAccess.getImplicitContextMappingAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:272:1: ( rule__ImplicitContextMapping__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:272:2: rule__ImplicitContextMapping__Alternatives
            {
            pushFollow(FOLLOW_rule__ImplicitContextMapping__Alternatives_in_ruleImplicitContextMapping514);
            rule__ImplicitContextMapping__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImplicitContextMappingAccess().getAlternatives()); 

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


    // $ANTLR start "entryRuleModule"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:284:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:285:1: ( ruleModule EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:286:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule541);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule548); 

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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:293:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:297:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:298:1: ( ( rule__Module__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:298:1: ( ( rule__Module__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:299:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:300:1: ( rule__Module__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:300:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule574);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleModuleName"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:312:1: entryRuleModuleName : ruleModuleName EOF ;
    public final void entryRuleModuleName() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:313:1: ( ruleModuleName EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:314:1: ruleModuleName EOF
            {
             before(grammarAccess.getModuleNameRule()); 
            pushFollow(FOLLOW_ruleModuleName_in_entryRuleModuleName601);
            ruleModuleName();

            state._fsp--;

             after(grammarAccess.getModuleNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleName608); 

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
    // $ANTLR end "entryRuleModuleName"


    // $ANTLR start "ruleModuleName"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:321:1: ruleModuleName : ( ( rule__ModuleName__Group__0 ) ) ;
    public final void ruleModuleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:325:2: ( ( ( rule__ModuleName__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:326:1: ( ( rule__ModuleName__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:326:1: ( ( rule__ModuleName__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:327:1: ( rule__ModuleName__Group__0 )
            {
             before(grammarAccess.getModuleNameAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:328:1: ( rule__ModuleName__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:328:2: rule__ModuleName__Group__0
            {
            pushFollow(FOLLOW_rule__ModuleName__Group__0_in_ruleModuleName634);
            rule__ModuleName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleNameAccess().getGroup()); 

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
    // $ANTLR end "ruleModuleName"


    // $ANTLR start "entryRuleUsesModule"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:340:1: entryRuleUsesModule : ruleUsesModule EOF ;
    public final void entryRuleUsesModule() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:341:1: ( ruleUsesModule EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:342:1: ruleUsesModule EOF
            {
             before(grammarAccess.getUsesModuleRule()); 
            pushFollow(FOLLOW_ruleUsesModule_in_entryRuleUsesModule661);
            ruleUsesModule();

            state._fsp--;

             after(grammarAccess.getUsesModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsesModule668); 

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
    // $ANTLR end "entryRuleUsesModule"


    // $ANTLR start "ruleUsesModule"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:349:1: ruleUsesModule : ( ( rule__UsesModule__Group__0 ) ) ;
    public final void ruleUsesModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:353:2: ( ( ( rule__UsesModule__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:354:1: ( ( rule__UsesModule__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:354:1: ( ( rule__UsesModule__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:355:1: ( rule__UsesModule__Group__0 )
            {
             before(grammarAccess.getUsesModuleAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:356:1: ( rule__UsesModule__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:356:2: rule__UsesModule__Group__0
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__0_in_ruleUsesModule694);
            rule__UsesModule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsesModuleAccess().getGroup()); 

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
    // $ANTLR end "ruleUsesModule"


    // $ANTLR start "entryRuleUsesEntity"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:368:1: entryRuleUsesEntity : ruleUsesEntity EOF ;
    public final void entryRuleUsesEntity() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:369:1: ( ruleUsesEntity EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:370:1: ruleUsesEntity EOF
            {
             before(grammarAccess.getUsesEntityRule()); 
            pushFollow(FOLLOW_ruleUsesEntity_in_entryRuleUsesEntity721);
            ruleUsesEntity();

            state._fsp--;

             after(grammarAccess.getUsesEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsesEntity728); 

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
    // $ANTLR end "entryRuleUsesEntity"


    // $ANTLR start "ruleUsesEntity"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:377:1: ruleUsesEntity : ( ( rule__UsesEntity__Group__0 ) ) ;
    public final void ruleUsesEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:381:2: ( ( ( rule__UsesEntity__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:382:1: ( ( rule__UsesEntity__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:382:1: ( ( rule__UsesEntity__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:383:1: ( rule__UsesEntity__Group__0 )
            {
             before(grammarAccess.getUsesEntityAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:384:1: ( rule__UsesEntity__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:384:2: rule__UsesEntity__Group__0
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__0_in_ruleUsesEntity754);
            rule__UsesEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUsesEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleUsesEntity"


    // $ANTLR start "entryRuleSubroutine"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:396:1: entryRuleSubroutine : ruleSubroutine EOF ;
    public final void entryRuleSubroutine() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:397:1: ( ruleSubroutine EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:398:1: ruleSubroutine EOF
            {
             before(grammarAccess.getSubroutineRule()); 
            pushFollow(FOLLOW_ruleSubroutine_in_entryRuleSubroutine781);
            ruleSubroutine();

            state._fsp--;

             after(grammarAccess.getSubroutineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutine788); 

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
    // $ANTLR end "entryRuleSubroutine"


    // $ANTLR start "ruleSubroutine"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:405:1: ruleSubroutine : ( ( rule__Subroutine__Group__0 ) ) ;
    public final void ruleSubroutine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:409:2: ( ( ( rule__Subroutine__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:410:1: ( ( rule__Subroutine__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:410:1: ( ( rule__Subroutine__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:411:1: ( rule__Subroutine__Group__0 )
            {
             before(grammarAccess.getSubroutineAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:412:1: ( rule__Subroutine__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:412:2: rule__Subroutine__Group__0
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__0_in_ruleSubroutine814);
            rule__Subroutine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubroutineAccess().getGroup()); 

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
    // $ANTLR end "ruleSubroutine"


    // $ANTLR start "entryRuleFormalParam"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:424:1: entryRuleFormalParam : ruleFormalParam EOF ;
    public final void entryRuleFormalParam() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:425:1: ( ruleFormalParam EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:426:1: ruleFormalParam EOF
            {
             before(grammarAccess.getFormalParamRule()); 
            pushFollow(FOLLOW_ruleFormalParam_in_entryRuleFormalParam841);
            ruleFormalParam();

            state._fsp--;

             after(grammarAccess.getFormalParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalParam848); 

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
    // $ANTLR end "entryRuleFormalParam"


    // $ANTLR start "ruleFormalParam"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:433:1: ruleFormalParam : ( ( rule__FormalParam__Group__0 ) ) ;
    public final void ruleFormalParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:437:2: ( ( ( rule__FormalParam__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:438:1: ( ( rule__FormalParam__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:438:1: ( ( rule__FormalParam__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:439:1: ( rule__FormalParam__Group__0 )
            {
             before(grammarAccess.getFormalParamAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:440:1: ( rule__FormalParam__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:440:2: rule__FormalParam__Group__0
            {
            pushFollow(FOLLOW_rule__FormalParam__Group__0_in_ruleFormalParam874);
            rule__FormalParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormalParamAccess().getGroup()); 

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
    // $ANTLR end "ruleFormalParam"


    // $ANTLR start "entryRuleIntent"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:452:1: entryRuleIntent : ruleIntent EOF ;
    public final void entryRuleIntent() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:453:1: ( ruleIntent EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:454:1: ruleIntent EOF
            {
             before(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_ruleIntent_in_entryRuleIntent901);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntent908); 

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
    // $ANTLR end "entryRuleIntent"


    // $ANTLR start "ruleIntent"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:461:1: ruleIntent : ( ( rule__Intent__Alternatives ) ) ;
    public final void ruleIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:465:2: ( ( ( rule__Intent__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:466:1: ( ( rule__Intent__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:466:1: ( ( rule__Intent__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:467:1: ( rule__Intent__Alternatives )
            {
             before(grammarAccess.getIntentAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:468:1: ( rule__Intent__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:468:2: rule__Intent__Alternatives
            {
            pushFollow(FOLLOW_rule__Intent__Alternatives_in_ruleIntent934);
            rule__Intent__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntentAccess().getAlternatives()); 

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
    // $ANTLR end "ruleIntent"


    // $ANTLR start "entryRuleType"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:480:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:481:1: ( ruleType EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:482:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType961);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType968); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:489:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:493:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:494:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:494:1: ( ( rule__Type__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:495:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:496:1: ( rule__Type__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:496:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType994);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleSubroutineName"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:508:1: entryRuleSubroutineName : ruleSubroutineName EOF ;
    public final void entryRuleSubroutineName() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:509:1: ( ruleSubroutineName EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:510:1: ruleSubroutineName EOF
            {
             before(grammarAccess.getSubroutineNameRule()); 
            pushFollow(FOLLOW_ruleSubroutineName_in_entryRuleSubroutineName1021);
            ruleSubroutineName();

            state._fsp--;

             after(grammarAccess.getSubroutineNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutineName1028); 

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
    // $ANTLR end "entryRuleSubroutineName"


    // $ANTLR start "ruleSubroutineName"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:517:1: ruleSubroutineName : ( ( rule__SubroutineName__Group__0 ) ) ;
    public final void ruleSubroutineName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:521:2: ( ( ( rule__SubroutineName__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:522:1: ( ( rule__SubroutineName__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:522:1: ( ( rule__SubroutineName__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:523:1: ( rule__SubroutineName__Group__0 )
            {
             before(grammarAccess.getSubroutineNameAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:524:1: ( rule__SubroutineName__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:524:2: rule__SubroutineName__Group__0
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group__0_in_ruleSubroutineName1054);
            rule__SubroutineName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubroutineNameAccess().getGroup()); 

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
    // $ANTLR end "ruleSubroutineName"


    // $ANTLR start "entryRuleCall"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:536:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:537:1: ( ruleCall EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:538:1: ruleCall EOF
            {
             before(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall1081);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall1088); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:545:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:549:2: ( ( ( rule__Call__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:550:1: ( ( rule__Call__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:550:1: ( ( rule__Call__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:551:1: ( rule__Call__Group__0 )
            {
             before(grammarAccess.getCallAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:552:1: ( rule__Call__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:552:2: rule__Call__Group__0
            {
            pushFollow(FOLLOW_rule__Call__Group__0_in_ruleCall1114);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:564:1: entryRuleActualParam : ruleActualParam EOF ;
    public final void entryRuleActualParam() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:565:1: ( ruleActualParam EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:566:1: ruleActualParam EOF
            {
             before(grammarAccess.getActualParamRule()); 
            pushFollow(FOLLOW_ruleActualParam_in_entryRuleActualParam1141);
            ruleActualParam();

            state._fsp--;

             after(grammarAccess.getActualParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualParam1148); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:573:1: ruleActualParam : ( ( rule__ActualParam__Group__0 ) ) ;
    public final void ruleActualParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:577:2: ( ( ( rule__ActualParam__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:578:1: ( ( rule__ActualParam__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:578:1: ( ( rule__ActualParam__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:579:1: ( rule__ActualParam__Group__0 )
            {
             before(grammarAccess.getActualParamAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:580:1: ( rule__ActualParam__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:580:2: rule__ActualParam__Group__0
            {
            pushFollow(FOLLOW_rule__ActualParam__Group__0_in_ruleActualParam1174);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:592:1: entryRuleIDOrWildcard : ruleIDOrWildcard EOF ;
    public final void entryRuleIDOrWildcard() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:593:1: ( ruleIDOrWildcard EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:594:1: ruleIDOrWildcard EOF
            {
             before(grammarAccess.getIDOrWildcardRule()); 
            pushFollow(FOLLOW_ruleIDOrWildcard_in_entryRuleIDOrWildcard1201);
            ruleIDOrWildcard();

            state._fsp--;

             after(grammarAccess.getIDOrWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrWildcard1208); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:601:1: ruleIDOrWildcard : ( ( rule__IDOrWildcard__Alternatives ) ) ;
    public final void ruleIDOrWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:605:2: ( ( ( rule__IDOrWildcard__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:606:1: ( ( rule__IDOrWildcard__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:606:1: ( ( rule__IDOrWildcard__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:607:1: ( rule__IDOrWildcard__Alternatives )
            {
             before(grammarAccess.getIDOrWildcardAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:608:1: ( rule__IDOrWildcard__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:608:2: rule__IDOrWildcard__Alternatives
            {
            pushFollow(FOLLOW_rule__IDOrWildcard__Alternatives_in_ruleIDOrWildcard1234);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:620:1: entryRuleIDOrPathExpr : ruleIDOrPathExpr EOF ;
    public final void entryRuleIDOrPathExpr() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:621:1: ( ruleIDOrPathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:622:1: ruleIDOrPathExpr EOF
            {
             before(grammarAccess.getIDOrPathExprRule()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_entryRuleIDOrPathExpr1261);
            ruleIDOrPathExpr();

            state._fsp--;

             after(grammarAccess.getIDOrPathExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrPathExpr1268); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:629:1: ruleIDOrPathExpr : ( ( rule__IDOrPathExpr__Alternatives ) ) ;
    public final void ruleIDOrPathExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:633:2: ( ( ( rule__IDOrPathExpr__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:634:1: ( ( rule__IDOrPathExpr__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:634:1: ( ( rule__IDOrPathExpr__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:635:1: ( rule__IDOrPathExpr__Alternatives )
            {
             before(grammarAccess.getIDOrPathExprAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:636:1: ( rule__IDOrPathExpr__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:636:2: rule__IDOrPathExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__IDOrPathExpr__Alternatives_in_ruleIDOrPathExpr1294);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:648:1: entryRulePathExpr : rulePathExpr EOF ;
    public final void entryRulePathExpr() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:649:1: ( rulePathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:650:1: rulePathExpr EOF
            {
             before(grammarAccess.getPathExprRule()); 
            pushFollow(FOLLOW_rulePathExpr_in_entryRulePathExpr1321);
            rulePathExpr();

            state._fsp--;

             after(grammarAccess.getPathExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExpr1328); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:657:1: rulePathExpr : ( ( rule__PathExpr__Group__0 ) ) ;
    public final void rulePathExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:661:2: ( ( ( rule__PathExpr__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:662:1: ( ( rule__PathExpr__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:662:1: ( ( rule__PathExpr__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:663:1: ( rule__PathExpr__Group__0 )
            {
             before(grammarAccess.getPathExprAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:664:1: ( rule__PathExpr__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:664:2: rule__PathExpr__Group__0
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__0_in_rulePathExpr1354);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:676:1: entryRulePathSegment : rulePathSegment EOF ;
    public final void entryRulePathSegment() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:677:1: ( rulePathSegment EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:678:1: rulePathSegment EOF
            {
             before(grammarAccess.getPathSegmentRule()); 
            pushFollow(FOLLOW_rulePathSegment_in_entryRulePathSegment1381);
            rulePathSegment();

            state._fsp--;

             after(grammarAccess.getPathSegmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathSegment1388); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:685:1: rulePathSegment : ( ( rule__PathSegment__Alternatives ) ) ;
    public final void rulePathSegment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:689:2: ( ( ( rule__PathSegment__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:690:1: ( ( rule__PathSegment__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:690:1: ( ( rule__PathSegment__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:691:1: ( rule__PathSegment__Alternatives )
            {
             before(grammarAccess.getPathSegmentAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:692:1: ( rule__PathSegment__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:692:2: rule__PathSegment__Alternatives
            {
            pushFollow(FOLLOW_rule__PathSegment__Alternatives_in_rulePathSegment1414);
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


    // $ANTLR start "rule__Subconcept__Alternatives_4"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:704:1: rule__Subconcept__Alternatives_4 : ( ( ( rule__Subconcept__Group_4_0__0 ) ) | ( ( rule__Subconcept__Group_4_1__0 ) ) );
    public final void rule__Subconcept__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:708:1: ( ( ( rule__Subconcept__Group_4_0__0 ) ) | ( ( rule__Subconcept__Group_4_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==36) ) {
                alt1=1;
            }
            else if ( (LA1_0==EOF||(LA1_0>=13 && LA1_0<=15)||LA1_0==17||LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:709:1: ( ( rule__Subconcept__Group_4_0__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:709:1: ( ( rule__Subconcept__Group_4_0__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:710:1: ( rule__Subconcept__Group_4_0__0 )
                    {
                     before(grammarAccess.getSubconceptAccess().getGroup_4_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:711:1: ( rule__Subconcept__Group_4_0__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:711:2: rule__Subconcept__Group_4_0__0
                    {
                    pushFollow(FOLLOW_rule__Subconcept__Group_4_0__0_in_rule__Subconcept__Alternatives_41450);
                    rule__Subconcept__Group_4_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubconceptAccess().getGroup_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:715:6: ( ( rule__Subconcept__Group_4_1__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:715:6: ( ( rule__Subconcept__Group_4_1__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:716:1: ( rule__Subconcept__Group_4_1__0 )
                    {
                     before(grammarAccess.getSubconceptAccess().getGroup_4_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:717:1: ( rule__Subconcept__Group_4_1__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:717:2: rule__Subconcept__Group_4_1__0
                    {
                    pushFollow(FOLLOW_rule__Subconcept__Group_4_1__0_in_rule__Subconcept__Alternatives_41468);
                    rule__Subconcept__Group_4_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubconceptAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__Subconcept__Alternatives_4"


    // $ANTLR start "rule__Cardinality__Alternatives"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:726:1: rule__Cardinality__Alternatives : ( ( ( rule__Cardinality__ZeroOrMoreAssignment_0 ) ) | ( ( rule__Cardinality__OneOrMoreAssignment_1 ) ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:730:1: ( ( ( rule__Cardinality__ZeroOrMoreAssignment_0 ) ) | ( ( rule__Cardinality__OneOrMoreAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==38) ) {
                alt2=1;
            }
            else if ( (LA2_0==39) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:731:1: ( ( rule__Cardinality__ZeroOrMoreAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:731:1: ( ( rule__Cardinality__ZeroOrMoreAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:732:1: ( rule__Cardinality__ZeroOrMoreAssignment_0 )
                    {
                     before(grammarAccess.getCardinalityAccess().getZeroOrMoreAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:733:1: ( rule__Cardinality__ZeroOrMoreAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:733:2: rule__Cardinality__ZeroOrMoreAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Cardinality__ZeroOrMoreAssignment_0_in_rule__Cardinality__Alternatives1501);
                    rule__Cardinality__ZeroOrMoreAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardinalityAccess().getZeroOrMoreAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:737:6: ( ( rule__Cardinality__OneOrMoreAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:737:6: ( ( rule__Cardinality__OneOrMoreAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:738:1: ( rule__Cardinality__OneOrMoreAssignment_1 )
                    {
                     before(grammarAccess.getCardinalityAccess().getOneOrMoreAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:739:1: ( rule__Cardinality__OneOrMoreAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:739:2: rule__Cardinality__OneOrMoreAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Cardinality__OneOrMoreAssignment_1_in_rule__Cardinality__Alternatives1519);
                    rule__Cardinality__OneOrMoreAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardinalityAccess().getOneOrMoreAssignment_1()); 

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
    // $ANTLR end "rule__Cardinality__Alternatives"


    // $ANTLR start "rule__ImplicitContextMapping__Alternatives"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:748:1: rule__ImplicitContextMapping__Alternatives : ( ( ruleModule ) | ( ruleModuleName ) | ( ruleUsesModule ) | ( ruleUsesEntity ) | ( ruleCall ) | ( ruleSubroutine ) | ( ruleSubroutineName ) );
    public final void rule__ImplicitContextMapping__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:752:1: ( ( ruleModule ) | ( ruleModuleName ) | ( ruleUsesModule ) | ( ruleUsesEntity ) | ( ruleCall ) | ( ruleSubroutine ) | ( ruleSubroutineName ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 25:
                {
                alt3=2;
                }
                break;
            case 26:
                {
                alt3=3;
                }
                break;
            case 27:
                {
                alt3=4;
                }
                break;
            case 31:
                {
                alt3=5;
                }
                break;
            case 28:
                {
                alt3=6;
                }
                break;
            case 30:
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:753:1: ( ruleModule )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:753:1: ( ruleModule )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:754:1: ruleModule
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getModuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleModule_in_rule__ImplicitContextMapping__Alternatives1552);
                    ruleModule();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getModuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:759:6: ( ruleModuleName )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:759:6: ( ruleModuleName )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:760:1: ruleModuleName
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getModuleNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleModuleName_in_rule__ImplicitContextMapping__Alternatives1569);
                    ruleModuleName();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getModuleNameParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:765:6: ( ruleUsesModule )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:765:6: ( ruleUsesModule )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:766:1: ruleUsesModule
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getUsesModuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleUsesModule_in_rule__ImplicitContextMapping__Alternatives1586);
                    ruleUsesModule();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getUsesModuleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:771:6: ( ruleUsesEntity )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:771:6: ( ruleUsesEntity )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:772:1: ruleUsesEntity
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getUsesEntityParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleUsesEntity_in_rule__ImplicitContextMapping__Alternatives1603);
                    ruleUsesEntity();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getUsesEntityParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:777:6: ( ruleCall )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:777:6: ( ruleCall )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:778:1: ruleCall
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCall_in_rule__ImplicitContextMapping__Alternatives1620);
                    ruleCall();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:783:6: ( ruleSubroutine )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:783:6: ( ruleSubroutine )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:784:1: ruleSubroutine
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getSubroutineParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleSubroutine_in_rule__ImplicitContextMapping__Alternatives1637);
                    ruleSubroutine();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getSubroutineParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:789:6: ( ruleSubroutineName )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:789:6: ( ruleSubroutineName )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:790:1: ruleSubroutineName
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getSubroutineNameParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleSubroutineName_in_rule__ImplicitContextMapping__Alternatives1654);
                    ruleSubroutineName();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getSubroutineNameParserRuleCall_6()); 

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
    // $ANTLR end "rule__ImplicitContextMapping__Alternatives"


    // $ANTLR start "rule__Intent__Alternatives"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:800:1: rule__Intent__Alternatives : ( ( ( rule__Intent__InAssignment_0 ) ) | ( ( rule__Intent__OutAssignment_1 ) ) | ( ( rule__Intent__InoutAssignment_2 ) ) );
    public final void rule__Intent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:804:1: ( ( ( rule__Intent__InAssignment_0 ) ) | ( ( rule__Intent__OutAssignment_1 ) ) | ( ( rule__Intent__InoutAssignment_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt4=1;
                }
                break;
            case 41:
                {
                alt4=2;
                }
                break;
            case 42:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:805:1: ( ( rule__Intent__InAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:805:1: ( ( rule__Intent__InAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:806:1: ( rule__Intent__InAssignment_0 )
                    {
                     before(grammarAccess.getIntentAccess().getInAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:807:1: ( rule__Intent__InAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:807:2: rule__Intent__InAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Intent__InAssignment_0_in_rule__Intent__Alternatives1686);
                    rule__Intent__InAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntentAccess().getInAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:811:6: ( ( rule__Intent__OutAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:811:6: ( ( rule__Intent__OutAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:812:1: ( rule__Intent__OutAssignment_1 )
                    {
                     before(grammarAccess.getIntentAccess().getOutAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:813:1: ( rule__Intent__OutAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:813:2: rule__Intent__OutAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Intent__OutAssignment_1_in_rule__Intent__Alternatives1704);
                    rule__Intent__OutAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntentAccess().getOutAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:817:6: ( ( rule__Intent__InoutAssignment_2 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:817:6: ( ( rule__Intent__InoutAssignment_2 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:818:1: ( rule__Intent__InoutAssignment_2 )
                    {
                     before(grammarAccess.getIntentAccess().getInoutAssignment_2()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:819:1: ( rule__Intent__InoutAssignment_2 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:819:2: rule__Intent__InoutAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Intent__InoutAssignment_2_in_rule__Intent__Alternatives1722);
                    rule__Intent__InoutAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntentAccess().getInoutAssignment_2()); 

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
    // $ANTLR end "rule__Intent__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:828:1: rule__Type__Alternatives : ( ( ( rule__Type__IntegerAssignment_0 ) ) | ( ( rule__Type__CharacterAssignment_1 ) ) | ( ( rule__Type__LogicalAssignment_2 ) ) | ( ( rule__Type__RealAssignment_3 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:832:1: ( ( ( rule__Type__IntegerAssignment_0 ) ) | ( ( rule__Type__CharacterAssignment_1 ) ) | ( ( rule__Type__LogicalAssignment_2 ) ) | ( ( rule__Type__RealAssignment_3 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt5=1;
                }
                break;
            case 44:
                {
                alt5=2;
                }
                break;
            case 45:
                {
                alt5=3;
                }
                break;
            case 46:
                {
                alt5=4;
                }
                break;
            case 47:
                {
                alt5=5;
                }
                break;
            case 48:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:833:1: ( ( rule__Type__IntegerAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:833:1: ( ( rule__Type__IntegerAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:834:1: ( rule__Type__IntegerAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getIntegerAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:835:1: ( rule__Type__IntegerAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:835:2: rule__Type__IntegerAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__IntegerAssignment_0_in_rule__Type__Alternatives1755);
                    rule__Type__IntegerAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getIntegerAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:839:6: ( ( rule__Type__CharacterAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:839:6: ( ( rule__Type__CharacterAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:840:1: ( rule__Type__CharacterAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getCharacterAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:841:1: ( rule__Type__CharacterAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:841:2: rule__Type__CharacterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__CharacterAssignment_1_in_rule__Type__Alternatives1773);
                    rule__Type__CharacterAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getCharacterAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:845:6: ( ( rule__Type__LogicalAssignment_2 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:845:6: ( ( rule__Type__LogicalAssignment_2 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:846:1: ( rule__Type__LogicalAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getLogicalAssignment_2()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:847:1: ( rule__Type__LogicalAssignment_2 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:847:2: rule__Type__LogicalAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Type__LogicalAssignment_2_in_rule__Type__Alternatives1791);
                    rule__Type__LogicalAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getLogicalAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:851:6: ( ( rule__Type__RealAssignment_3 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:851:6: ( ( rule__Type__RealAssignment_3 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:852:1: ( rule__Type__RealAssignment_3 )
                    {
                     before(grammarAccess.getTypeAccess().getRealAssignment_3()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:853:1: ( rule__Type__RealAssignment_3 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:853:2: rule__Type__RealAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Type__RealAssignment_3_in_rule__Type__Alternatives1809);
                    rule__Type__RealAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getRealAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:857:6: ( ( rule__Type__Group_4__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:857:6: ( ( rule__Type__Group_4__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:858:1: ( rule__Type__Group_4__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_4()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:859:1: ( rule__Type__Group_4__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:859:2: rule__Type__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_4__0_in_rule__Type__Alternatives1827);
                    rule__Type__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:863:6: ( ( rule__Type__Group_5__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:863:6: ( ( rule__Type__Group_5__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:864:1: ( rule__Type__Group_5__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_5()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:865:1: ( rule__Type__Group_5__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:865:2: rule__Type__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_5__0_in_rule__Type__Alternatives1845);
                    rule__Type__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__IDOrWildcard__Alternatives"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:874:1: rule__IDOrWildcard__Alternatives : ( ( ( rule__IDOrWildcard__IdAssignment_0 ) ) | ( ( rule__IDOrWildcard__WildcardAssignment_1 ) ) );
    public final void rule__IDOrWildcard__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:878:1: ( ( ( rule__IDOrWildcard__IdAssignment_0 ) ) | ( ( rule__IDOrWildcard__WildcardAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==38) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:879:1: ( ( rule__IDOrWildcard__IdAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:879:1: ( ( rule__IDOrWildcard__IdAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:880:1: ( rule__IDOrWildcard__IdAssignment_0 )
                    {
                     before(grammarAccess.getIDOrWildcardAccess().getIdAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:881:1: ( rule__IDOrWildcard__IdAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:881:2: rule__IDOrWildcard__IdAssignment_0
                    {
                    pushFollow(FOLLOW_rule__IDOrWildcard__IdAssignment_0_in_rule__IDOrWildcard__Alternatives1878);
                    rule__IDOrWildcard__IdAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIDOrWildcardAccess().getIdAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:885:6: ( ( rule__IDOrWildcard__WildcardAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:885:6: ( ( rule__IDOrWildcard__WildcardAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:886:1: ( rule__IDOrWildcard__WildcardAssignment_1 )
                    {
                     before(grammarAccess.getIDOrWildcardAccess().getWildcardAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:887:1: ( rule__IDOrWildcard__WildcardAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:887:2: rule__IDOrWildcard__WildcardAssignment_1
                    {
                    pushFollow(FOLLOW_rule__IDOrWildcard__WildcardAssignment_1_in_rule__IDOrWildcard__Alternatives1896);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:896:1: rule__IDOrPathExpr__Alternatives : ( ( ruleIDOrWildcard ) | ( rulePathExpr ) );
    public final void rule__IDOrPathExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:900:1: ( ( ruleIDOrWildcard ) | ( rulePathExpr ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID||LA7_0==38) ) {
                alt7=1;
            }
            else if ( (LA7_0==32) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:901:1: ( ruleIDOrWildcard )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:901:1: ( ruleIDOrWildcard )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:902:1: ruleIDOrWildcard
                    {
                     before(grammarAccess.getIDOrPathExprAccess().getIDOrWildcardParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIDOrWildcard_in_rule__IDOrPathExpr__Alternatives1929);
                    ruleIDOrWildcard();

                    state._fsp--;

                     after(grammarAccess.getIDOrPathExprAccess().getIDOrWildcardParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:907:6: ( rulePathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:907:6: ( rulePathExpr )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:908:1: rulePathExpr
                    {
                     before(grammarAccess.getIDOrPathExprAccess().getPathExprParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePathExpr_in_rule__IDOrPathExpr__Alternatives1946);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:918:1: rule__PathSegment__Alternatives : ( ( '..' ) | ( RULE_ID ) );
    public final void rule__PathSegment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:922:1: ( ( '..' ) | ( RULE_ID ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==11) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:923:1: ( '..' )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:923:1: ( '..' )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:924:1: '..'
                    {
                     before(grammarAccess.getPathSegmentAccess().getFullStopFullStopKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__PathSegment__Alternatives1979); 
                     after(grammarAccess.getPathSegmentAccess().getFullStopFullStopKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:931:6: ( RULE_ID )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:931:6: ( RULE_ID )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:932:1: RULE_ID
                    {
                     before(grammarAccess.getPathSegmentAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathSegment__Alternatives1998); 
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


    // $ANTLR start "rule__Language__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:944:1: rule__Language__Group__0 : rule__Language__Group__0__Impl rule__Language__Group__1 ;
    public final void rule__Language__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:948:1: ( rule__Language__Group__0__Impl rule__Language__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:949:2: rule__Language__Group__0__Impl rule__Language__Group__1
            {
            pushFollow(FOLLOW_rule__Language__Group__0__Impl_in_rule__Language__Group__02028);
            rule__Language__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__1_in_rule__Language__Group__02031);
            rule__Language__Group__1();

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
    // $ANTLR end "rule__Language__Group__0"


    // $ANTLR start "rule__Language__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:956:1: rule__Language__Group__0__Impl : ( 'language ' ) ;
    public final void rule__Language__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:960:1: ( ( 'language ' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:961:1: ( 'language ' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:961:1: ( 'language ' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:962:1: 'language '
            {
             before(grammarAccess.getLanguageAccess().getLanguageKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Language__Group__0__Impl2059); 
             after(grammarAccess.getLanguageAccess().getLanguageKeyword_0()); 

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
    // $ANTLR end "rule__Language__Group__0__Impl"


    // $ANTLR start "rule__Language__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:975:1: rule__Language__Group__1 : rule__Language__Group__1__Impl rule__Language__Group__2 ;
    public final void rule__Language__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:979:1: ( rule__Language__Group__1__Impl rule__Language__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:980:2: rule__Language__Group__1__Impl rule__Language__Group__2
            {
            pushFollow(FOLLOW_rule__Language__Group__1__Impl_in_rule__Language__Group__12090);
            rule__Language__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__2_in_rule__Language__Group__12093);
            rule__Language__Group__2();

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
    // $ANTLR end "rule__Language__Group__1"


    // $ANTLR start "rule__Language__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:987:1: rule__Language__Group__1__Impl : ( ( rule__Language__NameAssignment_1 ) ) ;
    public final void rule__Language__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:991:1: ( ( ( rule__Language__NameAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:992:1: ( ( rule__Language__NameAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:992:1: ( ( rule__Language__NameAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:993:1: ( rule__Language__NameAssignment_1 )
            {
             before(grammarAccess.getLanguageAccess().getNameAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:994:1: ( rule__Language__NameAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:994:2: rule__Language__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Language__NameAssignment_1_in_rule__Language__Group__1__Impl2120);
            rule__Language__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Language__Group__1__Impl"


    // $ANTLR start "rule__Language__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1004:1: rule__Language__Group__2 : rule__Language__Group__2__Impl rule__Language__Group__3 ;
    public final void rule__Language__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1008:1: ( rule__Language__Group__2__Impl rule__Language__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1009:2: rule__Language__Group__2__Impl rule__Language__Group__3
            {
            pushFollow(FOLLOW_rule__Language__Group__2__Impl_in_rule__Language__Group__22150);
            rule__Language__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__3_in_rule__Language__Group__22153);
            rule__Language__Group__3();

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
    // $ANTLR end "rule__Language__Group__2"


    // $ANTLR start "rule__Language__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1016:1: rule__Language__Group__2__Impl : ( ( rule__Language__UriAssignment_2 ) ) ;
    public final void rule__Language__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1020:1: ( ( ( rule__Language__UriAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1021:1: ( ( rule__Language__UriAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1021:1: ( ( rule__Language__UriAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1022:1: ( rule__Language__UriAssignment_2 )
            {
             before(grammarAccess.getLanguageAccess().getUriAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1023:1: ( rule__Language__UriAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1023:2: rule__Language__UriAssignment_2
            {
            pushFollow(FOLLOW_rule__Language__UriAssignment_2_in_rule__Language__Group__2__Impl2180);
            rule__Language__UriAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getUriAssignment_2()); 

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
    // $ANTLR end "rule__Language__Group__2__Impl"


    // $ANTLR start "rule__Language__Group__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1033:1: rule__Language__Group__3 : rule__Language__Group__3__Impl rule__Language__Group__4 ;
    public final void rule__Language__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1037:1: ( rule__Language__Group__3__Impl rule__Language__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1038:2: rule__Language__Group__3__Impl rule__Language__Group__4
            {
            pushFollow(FOLLOW_rule__Language__Group__3__Impl_in_rule__Language__Group__32210);
            rule__Language__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__4_in_rule__Language__Group__32213);
            rule__Language__Group__4();

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
    // $ANTLR end "rule__Language__Group__3"


    // $ANTLR start "rule__Language__Group__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1045:1: rule__Language__Group__3__Impl : ( '{' ) ;
    public final void rule__Language__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1049:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1050:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1050:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1051:1: '{'
            {
             before(grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Language__Group__3__Impl2241); 
             after(grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Language__Group__3__Impl"


    // $ANTLR start "rule__Language__Group__4"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1064:1: rule__Language__Group__4 : rule__Language__Group__4__Impl rule__Language__Group__5 ;
    public final void rule__Language__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1068:1: ( rule__Language__Group__4__Impl rule__Language__Group__5 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1069:2: rule__Language__Group__4__Impl rule__Language__Group__5
            {
            pushFollow(FOLLOW_rule__Language__Group__4__Impl_in_rule__Language__Group__42272);
            rule__Language__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__5_in_rule__Language__Group__42275);
            rule__Language__Group__5();

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
    // $ANTLR end "rule__Language__Group__4"


    // $ANTLR start "rule__Language__Group__4__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1076:1: rule__Language__Group__4__Impl : ( ( ( rule__Language__ConceptDefAssignment_4 ) ) ( ( rule__Language__ConceptDefAssignment_4 )* ) ) ;
    public final void rule__Language__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1080:1: ( ( ( ( rule__Language__ConceptDefAssignment_4 ) ) ( ( rule__Language__ConceptDefAssignment_4 )* ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1081:1: ( ( ( rule__Language__ConceptDefAssignment_4 ) ) ( ( rule__Language__ConceptDefAssignment_4 )* ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1081:1: ( ( ( rule__Language__ConceptDefAssignment_4 ) ) ( ( rule__Language__ConceptDefAssignment_4 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1082:1: ( ( rule__Language__ConceptDefAssignment_4 ) ) ( ( rule__Language__ConceptDefAssignment_4 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1082:1: ( ( rule__Language__ConceptDefAssignment_4 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1083:1: ( rule__Language__ConceptDefAssignment_4 )
            {
             before(grammarAccess.getLanguageAccess().getConceptDefAssignment_4()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1084:1: ( rule__Language__ConceptDefAssignment_4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1084:2: rule__Language__ConceptDefAssignment_4
            {
            pushFollow(FOLLOW_rule__Language__ConceptDefAssignment_4_in_rule__Language__Group__4__Impl2304);
            rule__Language__ConceptDefAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getConceptDefAssignment_4()); 

            }

            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1087:1: ( ( rule__Language__ConceptDefAssignment_4 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1088:1: ( rule__Language__ConceptDefAssignment_4 )*
            {
             before(grammarAccess.getLanguageAccess().getConceptDefAssignment_4()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1089:1: ( rule__Language__ConceptDefAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21||LA9_0==37) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1089:2: rule__Language__ConceptDefAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Language__ConceptDefAssignment_4_in_rule__Language__Group__4__Impl2316);
            	    rule__Language__ConceptDefAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getLanguageAccess().getConceptDefAssignment_4()); 

            }


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
    // $ANTLR end "rule__Language__Group__4__Impl"


    // $ANTLR start "rule__Language__Group__5"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1100:1: rule__Language__Group__5 : rule__Language__Group__5__Impl ;
    public final void rule__Language__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1104:1: ( rule__Language__Group__5__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1105:2: rule__Language__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Language__Group__5__Impl_in_rule__Language__Group__52349);
            rule__Language__Group__5__Impl();

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
    // $ANTLR end "rule__Language__Group__5"


    // $ANTLR start "rule__Language__Group__5__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1111:1: rule__Language__Group__5__Impl : ( '}' ) ;
    public final void rule__Language__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1115:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1116:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1116:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1117:1: '}'
            {
             before(grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_14_in_rule__Language__Group__5__Impl2377); 
             after(grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Language__Group__5__Impl"


    // $ANTLR start "rule__Subconcept__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1142:1: rule__Subconcept__Group__0 : rule__Subconcept__Group__0__Impl rule__Subconcept__Group__1 ;
    public final void rule__Subconcept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1146:1: ( rule__Subconcept__Group__0__Impl rule__Subconcept__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1147:2: rule__Subconcept__Group__0__Impl rule__Subconcept__Group__1
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__0__Impl_in_rule__Subconcept__Group__02420);
            rule__Subconcept__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group__1_in_rule__Subconcept__Group__02423);
            rule__Subconcept__Group__1();

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
    // $ANTLR end "rule__Subconcept__Group__0"


    // $ANTLR start "rule__Subconcept__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1154:1: rule__Subconcept__Group__0__Impl : ( ( rule__Subconcept__AttribAssignment_0 )? ) ;
    public final void rule__Subconcept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1158:1: ( ( ( rule__Subconcept__AttribAssignment_0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1159:1: ( ( rule__Subconcept__AttribAssignment_0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1159:1: ( ( rule__Subconcept__AttribAssignment_0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1160:1: ( rule__Subconcept__AttribAssignment_0 )?
            {
             before(grammarAccess.getSubconceptAccess().getAttribAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1161:1: ( rule__Subconcept__AttribAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1161:2: rule__Subconcept__AttribAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Subconcept__AttribAssignment_0_in_rule__Subconcept__Group__0__Impl2450);
                    rule__Subconcept__AttribAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubconceptAccess().getAttribAssignment_0()); 

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
    // $ANTLR end "rule__Subconcept__Group__0__Impl"


    // $ANTLR start "rule__Subconcept__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1171:1: rule__Subconcept__Group__1 : rule__Subconcept__Group__1__Impl rule__Subconcept__Group__2 ;
    public final void rule__Subconcept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1175:1: ( rule__Subconcept__Group__1__Impl rule__Subconcept__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1176:2: rule__Subconcept__Group__1__Impl rule__Subconcept__Group__2
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__1__Impl_in_rule__Subconcept__Group__12481);
            rule__Subconcept__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group__2_in_rule__Subconcept__Group__12484);
            rule__Subconcept__Group__2();

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
    // $ANTLR end "rule__Subconcept__Group__1"


    // $ANTLR start "rule__Subconcept__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1183:1: rule__Subconcept__Group__1__Impl : ( ( rule__Subconcept__NameAssignment_1 ) ) ;
    public final void rule__Subconcept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1187:1: ( ( ( rule__Subconcept__NameAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1188:1: ( ( rule__Subconcept__NameAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1188:1: ( ( rule__Subconcept__NameAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1189:1: ( rule__Subconcept__NameAssignment_1 )
            {
             before(grammarAccess.getSubconceptAccess().getNameAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1190:1: ( rule__Subconcept__NameAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1190:2: rule__Subconcept__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Subconcept__NameAssignment_1_in_rule__Subconcept__Group__1__Impl2511);
            rule__Subconcept__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubconceptAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Subconcept__Group__1__Impl"


    // $ANTLR start "rule__Subconcept__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1200:1: rule__Subconcept__Group__2 : rule__Subconcept__Group__2__Impl rule__Subconcept__Group__3 ;
    public final void rule__Subconcept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1204:1: ( rule__Subconcept__Group__2__Impl rule__Subconcept__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1205:2: rule__Subconcept__Group__2__Impl rule__Subconcept__Group__3
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__2__Impl_in_rule__Subconcept__Group__22541);
            rule__Subconcept__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group__3_in_rule__Subconcept__Group__22544);
            rule__Subconcept__Group__3();

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
    // $ANTLR end "rule__Subconcept__Group__2"


    // $ANTLR start "rule__Subconcept__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1212:1: rule__Subconcept__Group__2__Impl : ( ( rule__Subconcept__CardinalityAssignment_2 )? ) ;
    public final void rule__Subconcept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1216:1: ( ( ( rule__Subconcept__CardinalityAssignment_2 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1217:1: ( ( rule__Subconcept__CardinalityAssignment_2 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1217:1: ( ( rule__Subconcept__CardinalityAssignment_2 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1218:1: ( rule__Subconcept__CardinalityAssignment_2 )?
            {
             before(grammarAccess.getSubconceptAccess().getCardinalityAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1219:1: ( rule__Subconcept__CardinalityAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=38 && LA11_0<=39)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1219:2: rule__Subconcept__CardinalityAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Subconcept__CardinalityAssignment_2_in_rule__Subconcept__Group__2__Impl2571);
                    rule__Subconcept__CardinalityAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubconceptAccess().getCardinalityAssignment_2()); 

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
    // $ANTLR end "rule__Subconcept__Group__2__Impl"


    // $ANTLR start "rule__Subconcept__Group__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1229:1: rule__Subconcept__Group__3 : rule__Subconcept__Group__3__Impl rule__Subconcept__Group__4 ;
    public final void rule__Subconcept__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1233:1: ( rule__Subconcept__Group__3__Impl rule__Subconcept__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1234:2: rule__Subconcept__Group__3__Impl rule__Subconcept__Group__4
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__3__Impl_in_rule__Subconcept__Group__32602);
            rule__Subconcept__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group__4_in_rule__Subconcept__Group__32605);
            rule__Subconcept__Group__4();

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
    // $ANTLR end "rule__Subconcept__Group__3"


    // $ANTLR start "rule__Subconcept__Group__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1241:1: rule__Subconcept__Group__3__Impl : ( ( rule__Subconcept__EssentialAssignment_3 )? ) ;
    public final void rule__Subconcept__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1245:1: ( ( ( rule__Subconcept__EssentialAssignment_3 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1246:1: ( ( rule__Subconcept__EssentialAssignment_3 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1246:1: ( ( rule__Subconcept__EssentialAssignment_3 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1247:1: ( rule__Subconcept__EssentialAssignment_3 )?
            {
             before(grammarAccess.getSubconceptAccess().getEssentialAssignment_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1248:1: ( rule__Subconcept__EssentialAssignment_3 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1248:2: rule__Subconcept__EssentialAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Subconcept__EssentialAssignment_3_in_rule__Subconcept__Group__3__Impl2632);
                    rule__Subconcept__EssentialAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubconceptAccess().getEssentialAssignment_3()); 

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
    // $ANTLR end "rule__Subconcept__Group__3__Impl"


    // $ANTLR start "rule__Subconcept__Group__4"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1258:1: rule__Subconcept__Group__4 : rule__Subconcept__Group__4__Impl ;
    public final void rule__Subconcept__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1262:1: ( rule__Subconcept__Group__4__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1263:2: rule__Subconcept__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__4__Impl_in_rule__Subconcept__Group__42663);
            rule__Subconcept__Group__4__Impl();

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
    // $ANTLR end "rule__Subconcept__Group__4"


    // $ANTLR start "rule__Subconcept__Group__4__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1269:1: rule__Subconcept__Group__4__Impl : ( ( rule__Subconcept__Alternatives_4 ) ) ;
    public final void rule__Subconcept__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1273:1: ( ( ( rule__Subconcept__Alternatives_4 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1274:1: ( ( rule__Subconcept__Alternatives_4 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1274:1: ( ( rule__Subconcept__Alternatives_4 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1275:1: ( rule__Subconcept__Alternatives_4 )
            {
             before(grammarAccess.getSubconceptAccess().getAlternatives_4()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1276:1: ( rule__Subconcept__Alternatives_4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1276:2: rule__Subconcept__Alternatives_4
            {
            pushFollow(FOLLOW_rule__Subconcept__Alternatives_4_in_rule__Subconcept__Group__4__Impl2690);
            rule__Subconcept__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getSubconceptAccess().getAlternatives_4()); 

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
    // $ANTLR end "rule__Subconcept__Group__4__Impl"


    // $ANTLR start "rule__Subconcept__Group_4_0__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1296:1: rule__Subconcept__Group_4_0__0 : rule__Subconcept__Group_4_0__0__Impl rule__Subconcept__Group_4_0__1 ;
    public final void rule__Subconcept__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1300:1: ( rule__Subconcept__Group_4_0__0__Impl rule__Subconcept__Group_4_0__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1301:2: rule__Subconcept__Group_4_0__0__Impl rule__Subconcept__Group_4_0__1
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_4_0__0__Impl_in_rule__Subconcept__Group_4_0__02730);
            rule__Subconcept__Group_4_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group_4_0__1_in_rule__Subconcept__Group_4_0__02733);
            rule__Subconcept__Group_4_0__1();

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
    // $ANTLR end "rule__Subconcept__Group_4_0__0"


    // $ANTLR start "rule__Subconcept__Group_4_0__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1308:1: rule__Subconcept__Group_4_0__0__Impl : ( ( rule__Subconcept__RefAssignment_4_0_0 ) ) ;
    public final void rule__Subconcept__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1312:1: ( ( ( rule__Subconcept__RefAssignment_4_0_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1313:1: ( ( rule__Subconcept__RefAssignment_4_0_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1313:1: ( ( rule__Subconcept__RefAssignment_4_0_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1314:1: ( rule__Subconcept__RefAssignment_4_0_0 )
            {
             before(grammarAccess.getSubconceptAccess().getRefAssignment_4_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1315:1: ( rule__Subconcept__RefAssignment_4_0_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1315:2: rule__Subconcept__RefAssignment_4_0_0
            {
            pushFollow(FOLLOW_rule__Subconcept__RefAssignment_4_0_0_in_rule__Subconcept__Group_4_0__0__Impl2760);
            rule__Subconcept__RefAssignment_4_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSubconceptAccess().getRefAssignment_4_0_0()); 

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
    // $ANTLR end "rule__Subconcept__Group_4_0__0__Impl"


    // $ANTLR start "rule__Subconcept__Group_4_0__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1325:1: rule__Subconcept__Group_4_0__1 : rule__Subconcept__Group_4_0__1__Impl ;
    public final void rule__Subconcept__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1329:1: ( rule__Subconcept__Group_4_0__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1330:2: rule__Subconcept__Group_4_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_4_0__1__Impl_in_rule__Subconcept__Group_4_0__12790);
            rule__Subconcept__Group_4_0__1__Impl();

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
    // $ANTLR end "rule__Subconcept__Group_4_0__1"


    // $ANTLR start "rule__Subconcept__Group_4_0__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1336:1: rule__Subconcept__Group_4_0__1__Impl : ( ( rule__Subconcept__ConceptDefAssignment_4_0_1 ) ) ;
    public final void rule__Subconcept__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1340:1: ( ( ( rule__Subconcept__ConceptDefAssignment_4_0_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1341:1: ( ( rule__Subconcept__ConceptDefAssignment_4_0_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1341:1: ( ( rule__Subconcept__ConceptDefAssignment_4_0_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1342:1: ( rule__Subconcept__ConceptDefAssignment_4_0_1 )
            {
             before(grammarAccess.getSubconceptAccess().getConceptDefAssignment_4_0_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1343:1: ( rule__Subconcept__ConceptDefAssignment_4_0_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1343:2: rule__Subconcept__ConceptDefAssignment_4_0_1
            {
            pushFollow(FOLLOW_rule__Subconcept__ConceptDefAssignment_4_0_1_in_rule__Subconcept__Group_4_0__1__Impl2817);
            rule__Subconcept__ConceptDefAssignment_4_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSubconceptAccess().getConceptDefAssignment_4_0_1()); 

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
    // $ANTLR end "rule__Subconcept__Group_4_0__1__Impl"


    // $ANTLR start "rule__Subconcept__Group_4_1__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1357:1: rule__Subconcept__Group_4_1__0 : rule__Subconcept__Group_4_1__0__Impl rule__Subconcept__Group_4_1__1 ;
    public final void rule__Subconcept__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1361:1: ( rule__Subconcept__Group_4_1__0__Impl rule__Subconcept__Group_4_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1362:2: rule__Subconcept__Group_4_1__0__Impl rule__Subconcept__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_4_1__0__Impl_in_rule__Subconcept__Group_4_1__02851);
            rule__Subconcept__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group_4_1__1_in_rule__Subconcept__Group_4_1__02854);
            rule__Subconcept__Group_4_1__1();

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
    // $ANTLR end "rule__Subconcept__Group_4_1__0"


    // $ANTLR start "rule__Subconcept__Group_4_1__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1369:1: rule__Subconcept__Group_4_1__0__Impl : ( ( rule__Subconcept__Group_4_1_0__0 )? ) ;
    public final void rule__Subconcept__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1373:1: ( ( ( rule__Subconcept__Group_4_1_0__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1374:1: ( ( rule__Subconcept__Group_4_1_0__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1374:1: ( ( rule__Subconcept__Group_4_1_0__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1375:1: ( rule__Subconcept__Group_4_1_0__0 )?
            {
             before(grammarAccess.getSubconceptAccess().getGroup_4_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1376:1: ( rule__Subconcept__Group_4_1_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1376:2: rule__Subconcept__Group_4_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Subconcept__Group_4_1_0__0_in_rule__Subconcept__Group_4_1__0__Impl2881);
                    rule__Subconcept__Group_4_1_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubconceptAccess().getGroup_4_1_0()); 

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
    // $ANTLR end "rule__Subconcept__Group_4_1__0__Impl"


    // $ANTLR start "rule__Subconcept__Group_4_1__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1386:1: rule__Subconcept__Group_4_1__1 : rule__Subconcept__Group_4_1__1__Impl rule__Subconcept__Group_4_1__2 ;
    public final void rule__Subconcept__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1390:1: ( rule__Subconcept__Group_4_1__1__Impl rule__Subconcept__Group_4_1__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1391:2: rule__Subconcept__Group_4_1__1__Impl rule__Subconcept__Group_4_1__2
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_4_1__1__Impl_in_rule__Subconcept__Group_4_1__12912);
            rule__Subconcept__Group_4_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group_4_1__2_in_rule__Subconcept__Group_4_1__12915);
            rule__Subconcept__Group_4_1__2();

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
    // $ANTLR end "rule__Subconcept__Group_4_1__1"


    // $ANTLR start "rule__Subconcept__Group_4_1__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1398:1: rule__Subconcept__Group_4_1__1__Impl : ( ( rule__Subconcept__Group_4_1_1__0 )? ) ;
    public final void rule__Subconcept__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1402:1: ( ( ( rule__Subconcept__Group_4_1_1__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1403:1: ( ( rule__Subconcept__Group_4_1_1__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1403:1: ( ( rule__Subconcept__Group_4_1_1__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1404:1: ( rule__Subconcept__Group_4_1_1__0 )?
            {
             before(grammarAccess.getSubconceptAccess().getGroup_4_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1405:1: ( rule__Subconcept__Group_4_1_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1405:2: rule__Subconcept__Group_4_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Subconcept__Group_4_1_1__0_in_rule__Subconcept__Group_4_1__1__Impl2942);
                    rule__Subconcept__Group_4_1_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubconceptAccess().getGroup_4_1_1()); 

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
    // $ANTLR end "rule__Subconcept__Group_4_1__1__Impl"


    // $ANTLR start "rule__Subconcept__Group_4_1__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1415:1: rule__Subconcept__Group_4_1__2 : rule__Subconcept__Group_4_1__2__Impl ;
    public final void rule__Subconcept__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1419:1: ( rule__Subconcept__Group_4_1__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1420:2: rule__Subconcept__Group_4_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_4_1__2__Impl_in_rule__Subconcept__Group_4_1__22973);
            rule__Subconcept__Group_4_1__2__Impl();

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
    // $ANTLR end "rule__Subconcept__Group_4_1__2"


    // $ANTLR start "rule__Subconcept__Group_4_1__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1426:1: rule__Subconcept__Group_4_1__2__Impl : ( ( rule__Subconcept__BodyAssignment_4_1_2 )? ) ;
    public final void rule__Subconcept__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1430:1: ( ( ( rule__Subconcept__BodyAssignment_4_1_2 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1431:1: ( ( rule__Subconcept__BodyAssignment_4_1_2 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1431:1: ( ( rule__Subconcept__BodyAssignment_4_1_2 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1432:1: ( rule__Subconcept__BodyAssignment_4_1_2 )?
            {
             before(grammarAccess.getSubconceptAccess().getBodyAssignment_4_1_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1433:1: ( rule__Subconcept__BodyAssignment_4_1_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1433:2: rule__Subconcept__BodyAssignment_4_1_2
                    {
                    pushFollow(FOLLOW_rule__Subconcept__BodyAssignment_4_1_2_in_rule__Subconcept__Group_4_1__2__Impl3000);
                    rule__Subconcept__BodyAssignment_4_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubconceptAccess().getBodyAssignment_4_1_2()); 

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
    // $ANTLR end "rule__Subconcept__Group_4_1__2__Impl"


    // $ANTLR start "rule__Subconcept__Group_4_1_0__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1449:1: rule__Subconcept__Group_4_1_0__0 : rule__Subconcept__Group_4_1_0__0__Impl rule__Subconcept__Group_4_1_0__1 ;
    public final void rule__Subconcept__Group_4_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1453:1: ( rule__Subconcept__Group_4_1_0__0__Impl rule__Subconcept__Group_4_1_0__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1454:2: rule__Subconcept__Group_4_1_0__0__Impl rule__Subconcept__Group_4_1_0__1
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_4_1_0__0__Impl_in_rule__Subconcept__Group_4_1_0__03037);
            rule__Subconcept__Group_4_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group_4_1_0__1_in_rule__Subconcept__Group_4_1_0__03040);
            rule__Subconcept__Group_4_1_0__1();

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
    // $ANTLR end "rule__Subconcept__Group_4_1_0__0"


    // $ANTLR start "rule__Subconcept__Group_4_1_0__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1461:1: rule__Subconcept__Group_4_1_0__0__Impl : ( '<' ) ;
    public final void rule__Subconcept__Group_4_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1465:1: ( ( '<' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1466:1: ( '<' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1466:1: ( '<' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1467:1: '<'
            {
             before(grammarAccess.getSubconceptAccess().getLessThanSignKeyword_4_1_0_0()); 
            match(input,15,FOLLOW_15_in_rule__Subconcept__Group_4_1_0__0__Impl3068); 
             after(grammarAccess.getSubconceptAccess().getLessThanSignKeyword_4_1_0_0()); 

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
    // $ANTLR end "rule__Subconcept__Group_4_1_0__0__Impl"


    // $ANTLR start "rule__Subconcept__Group_4_1_0__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1480:1: rule__Subconcept__Group_4_1_0__1 : rule__Subconcept__Group_4_1_0__1__Impl rule__Subconcept__Group_4_1_0__2 ;
    public final void rule__Subconcept__Group_4_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1484:1: ( rule__Subconcept__Group_4_1_0__1__Impl rule__Subconcept__Group_4_1_0__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1485:2: rule__Subconcept__Group_4_1_0__1__Impl rule__Subconcept__Group_4_1_0__2
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_4_1_0__1__Impl_in_rule__Subconcept__Group_4_1_0__13099);
            rule__Subconcept__Group_4_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group_4_1_0__2_in_rule__Subconcept__Group_4_1_0__13102);
            rule__Subconcept__Group_4_1_0__2();

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
    // $ANTLR end "rule__Subconcept__Group_4_1_0__1"


    // $ANTLR start "rule__Subconcept__Group_4_1_0__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1492:1: rule__Subconcept__Group_4_1_0__1__Impl : ( ( rule__Subconcept__MappingAssignment_4_1_0_1 ) ) ;
    public final void rule__Subconcept__Group_4_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1496:1: ( ( ( rule__Subconcept__MappingAssignment_4_1_0_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1497:1: ( ( rule__Subconcept__MappingAssignment_4_1_0_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1497:1: ( ( rule__Subconcept__MappingAssignment_4_1_0_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1498:1: ( rule__Subconcept__MappingAssignment_4_1_0_1 )
            {
             before(grammarAccess.getSubconceptAccess().getMappingAssignment_4_1_0_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1499:1: ( rule__Subconcept__MappingAssignment_4_1_0_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1499:2: rule__Subconcept__MappingAssignment_4_1_0_1
            {
            pushFollow(FOLLOW_rule__Subconcept__MappingAssignment_4_1_0_1_in_rule__Subconcept__Group_4_1_0__1__Impl3129);
            rule__Subconcept__MappingAssignment_4_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSubconceptAccess().getMappingAssignment_4_1_0_1()); 

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
    // $ANTLR end "rule__Subconcept__Group_4_1_0__1__Impl"


    // $ANTLR start "rule__Subconcept__Group_4_1_0__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1509:1: rule__Subconcept__Group_4_1_0__2 : rule__Subconcept__Group_4_1_0__2__Impl ;
    public final void rule__Subconcept__Group_4_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1513:1: ( rule__Subconcept__Group_4_1_0__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1514:2: rule__Subconcept__Group_4_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_4_1_0__2__Impl_in_rule__Subconcept__Group_4_1_0__23159);
            rule__Subconcept__Group_4_1_0__2__Impl();

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
    // $ANTLR end "rule__Subconcept__Group_4_1_0__2"


    // $ANTLR start "rule__Subconcept__Group_4_1_0__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1520:1: rule__Subconcept__Group_4_1_0__2__Impl : ( '>' ) ;
    public final void rule__Subconcept__Group_4_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1524:1: ( ( '>' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1525:1: ( '>' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1525:1: ( '>' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1526:1: '>'
            {
             before(grammarAccess.getSubconceptAccess().getGreaterThanSignKeyword_4_1_0_2()); 
            match(input,16,FOLLOW_16_in_rule__Subconcept__Group_4_1_0__2__Impl3187); 
             after(grammarAccess.getSubconceptAccess().getGreaterThanSignKeyword_4_1_0_2()); 

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
    // $ANTLR end "rule__Subconcept__Group_4_1_0__2__Impl"


    // $ANTLR start "rule__Subconcept__Group_4_1_1__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1545:1: rule__Subconcept__Group_4_1_1__0 : rule__Subconcept__Group_4_1_1__0__Impl rule__Subconcept__Group_4_1_1__1 ;
    public final void rule__Subconcept__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1549:1: ( rule__Subconcept__Group_4_1_1__0__Impl rule__Subconcept__Group_4_1_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1550:2: rule__Subconcept__Group_4_1_1__0__Impl rule__Subconcept__Group_4_1_1__1
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_4_1_1__0__Impl_in_rule__Subconcept__Group_4_1_1__03224);
            rule__Subconcept__Group_4_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group_4_1_1__1_in_rule__Subconcept__Group_4_1_1__03227);
            rule__Subconcept__Group_4_1_1__1();

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
    // $ANTLR end "rule__Subconcept__Group_4_1_1__0"


    // $ANTLR start "rule__Subconcept__Group_4_1_1__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1557:1: rule__Subconcept__Group_4_1_1__0__Impl : ( '[' ) ;
    public final void rule__Subconcept__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1561:1: ( ( '[' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1562:1: ( '[' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1562:1: ( '[' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1563:1: '['
            {
             before(grammarAccess.getSubconceptAccess().getLeftSquareBracketKeyword_4_1_1_0()); 
            match(input,17,FOLLOW_17_in_rule__Subconcept__Group_4_1_1__0__Impl3255); 
             after(grammarAccess.getSubconceptAccess().getLeftSquareBracketKeyword_4_1_1_0()); 

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
    // $ANTLR end "rule__Subconcept__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__Subconcept__Group_4_1_1__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1576:1: rule__Subconcept__Group_4_1_1__1 : rule__Subconcept__Group_4_1_1__1__Impl rule__Subconcept__Group_4_1_1__2 ;
    public final void rule__Subconcept__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1580:1: ( rule__Subconcept__Group_4_1_1__1__Impl rule__Subconcept__Group_4_1_1__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1581:2: rule__Subconcept__Group_4_1_1__1__Impl rule__Subconcept__Group_4_1_1__2
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_4_1_1__1__Impl_in_rule__Subconcept__Group_4_1_1__13286);
            rule__Subconcept__Group_4_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group_4_1_1__2_in_rule__Subconcept__Group_4_1_1__13289);
            rule__Subconcept__Group_4_1_1__2();

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
    // $ANTLR end "rule__Subconcept__Group_4_1_1__1"


    // $ANTLR start "rule__Subconcept__Group_4_1_1__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1588:1: rule__Subconcept__Group_4_1_1__1__Impl : ( ( rule__Subconcept__AnnotationAssignment_4_1_1_1 ) ) ;
    public final void rule__Subconcept__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1592:1: ( ( ( rule__Subconcept__AnnotationAssignment_4_1_1_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1593:1: ( ( rule__Subconcept__AnnotationAssignment_4_1_1_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1593:1: ( ( rule__Subconcept__AnnotationAssignment_4_1_1_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1594:1: ( rule__Subconcept__AnnotationAssignment_4_1_1_1 )
            {
             before(grammarAccess.getSubconceptAccess().getAnnotationAssignment_4_1_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1595:1: ( rule__Subconcept__AnnotationAssignment_4_1_1_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1595:2: rule__Subconcept__AnnotationAssignment_4_1_1_1
            {
            pushFollow(FOLLOW_rule__Subconcept__AnnotationAssignment_4_1_1_1_in_rule__Subconcept__Group_4_1_1__1__Impl3316);
            rule__Subconcept__AnnotationAssignment_4_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSubconceptAccess().getAnnotationAssignment_4_1_1_1()); 

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
    // $ANTLR end "rule__Subconcept__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__Subconcept__Group_4_1_1__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1605:1: rule__Subconcept__Group_4_1_1__2 : rule__Subconcept__Group_4_1_1__2__Impl rule__Subconcept__Group_4_1_1__3 ;
    public final void rule__Subconcept__Group_4_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1609:1: ( rule__Subconcept__Group_4_1_1__2__Impl rule__Subconcept__Group_4_1_1__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1610:2: rule__Subconcept__Group_4_1_1__2__Impl rule__Subconcept__Group_4_1_1__3
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_4_1_1__2__Impl_in_rule__Subconcept__Group_4_1_1__23346);
            rule__Subconcept__Group_4_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group_4_1_1__3_in_rule__Subconcept__Group_4_1_1__23349);
            rule__Subconcept__Group_4_1_1__3();

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
    // $ANTLR end "rule__Subconcept__Group_4_1_1__2"


    // $ANTLR start "rule__Subconcept__Group_4_1_1__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1617:1: rule__Subconcept__Group_4_1_1__2__Impl : ( ( rule__Subconcept__Group_4_1_1_2__0 )* ) ;
    public final void rule__Subconcept__Group_4_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1621:1: ( ( ( rule__Subconcept__Group_4_1_1_2__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1622:1: ( ( rule__Subconcept__Group_4_1_1_2__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1622:1: ( ( rule__Subconcept__Group_4_1_1_2__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1623:1: ( rule__Subconcept__Group_4_1_1_2__0 )*
            {
             before(grammarAccess.getSubconceptAccess().getGroup_4_1_1_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1624:1: ( rule__Subconcept__Group_4_1_1_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==19) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1624:2: rule__Subconcept__Group_4_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Subconcept__Group_4_1_1_2__0_in_rule__Subconcept__Group_4_1_1__2__Impl3376);
            	    rule__Subconcept__Group_4_1_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSubconceptAccess().getGroup_4_1_1_2()); 

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
    // $ANTLR end "rule__Subconcept__Group_4_1_1__2__Impl"


    // $ANTLR start "rule__Subconcept__Group_4_1_1__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1634:1: rule__Subconcept__Group_4_1_1__3 : rule__Subconcept__Group_4_1_1__3__Impl ;
    public final void rule__Subconcept__Group_4_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1638:1: ( rule__Subconcept__Group_4_1_1__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1639:2: rule__Subconcept__Group_4_1_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_4_1_1__3__Impl_in_rule__Subconcept__Group_4_1_1__33407);
            rule__Subconcept__Group_4_1_1__3__Impl();

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
    // $ANTLR end "rule__Subconcept__Group_4_1_1__3"


    // $ANTLR start "rule__Subconcept__Group_4_1_1__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1645:1: rule__Subconcept__Group_4_1_1__3__Impl : ( ']' ) ;
    public final void rule__Subconcept__Group_4_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1649:1: ( ( ']' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1650:1: ( ']' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1650:1: ( ']' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1651:1: ']'
            {
             before(grammarAccess.getSubconceptAccess().getRightSquareBracketKeyword_4_1_1_3()); 
            match(input,18,FOLLOW_18_in_rule__Subconcept__Group_4_1_1__3__Impl3435); 
             after(grammarAccess.getSubconceptAccess().getRightSquareBracketKeyword_4_1_1_3()); 

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
    // $ANTLR end "rule__Subconcept__Group_4_1_1__3__Impl"


    // $ANTLR start "rule__Subconcept__Group_4_1_1_2__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1672:1: rule__Subconcept__Group_4_1_1_2__0 : rule__Subconcept__Group_4_1_1_2__0__Impl rule__Subconcept__Group_4_1_1_2__1 ;
    public final void rule__Subconcept__Group_4_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1676:1: ( rule__Subconcept__Group_4_1_1_2__0__Impl rule__Subconcept__Group_4_1_1_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1677:2: rule__Subconcept__Group_4_1_1_2__0__Impl rule__Subconcept__Group_4_1_1_2__1
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_4_1_1_2__0__Impl_in_rule__Subconcept__Group_4_1_1_2__03474);
            rule__Subconcept__Group_4_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group_4_1_1_2__1_in_rule__Subconcept__Group_4_1_1_2__03477);
            rule__Subconcept__Group_4_1_1_2__1();

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
    // $ANTLR end "rule__Subconcept__Group_4_1_1_2__0"


    // $ANTLR start "rule__Subconcept__Group_4_1_1_2__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1684:1: rule__Subconcept__Group_4_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__Subconcept__Group_4_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1688:1: ( ( ',' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1689:1: ( ',' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1689:1: ( ',' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1690:1: ','
            {
             before(grammarAccess.getSubconceptAccess().getCommaKeyword_4_1_1_2_0()); 
            match(input,19,FOLLOW_19_in_rule__Subconcept__Group_4_1_1_2__0__Impl3505); 
             after(grammarAccess.getSubconceptAccess().getCommaKeyword_4_1_1_2_0()); 

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
    // $ANTLR end "rule__Subconcept__Group_4_1_1_2__0__Impl"


    // $ANTLR start "rule__Subconcept__Group_4_1_1_2__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1703:1: rule__Subconcept__Group_4_1_1_2__1 : rule__Subconcept__Group_4_1_1_2__1__Impl ;
    public final void rule__Subconcept__Group_4_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1707:1: ( rule__Subconcept__Group_4_1_1_2__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1708:2: rule__Subconcept__Group_4_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_4_1_1_2__1__Impl_in_rule__Subconcept__Group_4_1_1_2__13536);
            rule__Subconcept__Group_4_1_1_2__1__Impl();

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
    // $ANTLR end "rule__Subconcept__Group_4_1_1_2__1"


    // $ANTLR start "rule__Subconcept__Group_4_1_1_2__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1714:1: rule__Subconcept__Group_4_1_1_2__1__Impl : ( ( rule__Subconcept__AnnotationAssignment_4_1_1_2_1 ) ) ;
    public final void rule__Subconcept__Group_4_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1718:1: ( ( ( rule__Subconcept__AnnotationAssignment_4_1_1_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1719:1: ( ( rule__Subconcept__AnnotationAssignment_4_1_1_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1719:1: ( ( rule__Subconcept__AnnotationAssignment_4_1_1_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1720:1: ( rule__Subconcept__AnnotationAssignment_4_1_1_2_1 )
            {
             before(grammarAccess.getSubconceptAccess().getAnnotationAssignment_4_1_1_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1721:1: ( rule__Subconcept__AnnotationAssignment_4_1_1_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1721:2: rule__Subconcept__AnnotationAssignment_4_1_1_2_1
            {
            pushFollow(FOLLOW_rule__Subconcept__AnnotationAssignment_4_1_1_2_1_in_rule__Subconcept__Group_4_1_1_2__1__Impl3563);
            rule__Subconcept__AnnotationAssignment_4_1_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSubconceptAccess().getAnnotationAssignment_4_1_1_2_1()); 

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
    // $ANTLR end "rule__Subconcept__Group_4_1_1_2__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1735:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1739:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1740:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03597);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03600);
            rule__Annotation__Group__1();

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
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1747:1: rule__Annotation__Group__0__Impl : ( ( rule__Annotation__KeyAssignment_0 ) ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1751:1: ( ( ( rule__Annotation__KeyAssignment_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1752:1: ( ( rule__Annotation__KeyAssignment_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1752:1: ( ( rule__Annotation__KeyAssignment_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1753:1: ( rule__Annotation__KeyAssignment_0 )
            {
             before(grammarAccess.getAnnotationAccess().getKeyAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1754:1: ( rule__Annotation__KeyAssignment_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1754:2: rule__Annotation__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__Annotation__KeyAssignment_0_in_rule__Annotation__Group__0__Impl3627);
            rule__Annotation__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getKeyAssignment_0()); 

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
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1764:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1768:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1769:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13657);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__13660);
            rule__Annotation__Group__2();

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
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1776:1: rule__Annotation__Group__1__Impl : ( '=' ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1780:1: ( ( '=' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1781:1: ( '=' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1781:1: ( '=' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1782:1: '='
            {
             before(grammarAccess.getAnnotationAccess().getEqualsSignKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Annotation__Group__1__Impl3688); 
             after(grammarAccess.getAnnotationAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1795:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1799:1: ( rule__Annotation__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1800:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__23719);
            rule__Annotation__Group__2__Impl();

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
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1806:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__ValueAssignment_2 ) ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1810:1: ( ( ( rule__Annotation__ValueAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1811:1: ( ( rule__Annotation__ValueAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1811:1: ( ( rule__Annotation__ValueAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1812:1: ( rule__Annotation__ValueAssignment_2 )
            {
             before(grammarAccess.getAnnotationAccess().getValueAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1813:1: ( rule__Annotation__ValueAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1813:2: rule__Annotation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Annotation__ValueAssignment_2_in_rule__Annotation__Group__2__Impl3746);
            rule__Annotation__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__ConceptDef__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1829:1: rule__ConceptDef__Group__0 : rule__ConceptDef__Group__0__Impl rule__ConceptDef__Group__1 ;
    public final void rule__ConceptDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1833:1: ( rule__ConceptDef__Group__0__Impl rule__ConceptDef__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1834:2: rule__ConceptDef__Group__0__Impl rule__ConceptDef__Group__1
            {
            pushFollow(FOLLOW_rule__ConceptDef__Group__0__Impl_in_rule__ConceptDef__Group__03782);
            rule__ConceptDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConceptDef__Group__1_in_rule__ConceptDef__Group__03785);
            rule__ConceptDef__Group__1();

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
    // $ANTLR end "rule__ConceptDef__Group__0"


    // $ANTLR start "rule__ConceptDef__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1841:1: rule__ConceptDef__Group__0__Impl : ( ( rule__ConceptDef__TopAssignment_0 )? ) ;
    public final void rule__ConceptDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1845:1: ( ( ( rule__ConceptDef__TopAssignment_0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1846:1: ( ( rule__ConceptDef__TopAssignment_0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1846:1: ( ( rule__ConceptDef__TopAssignment_0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1847:1: ( rule__ConceptDef__TopAssignment_0 )?
            {
             before(grammarAccess.getConceptDefAccess().getTopAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1848:1: ( rule__ConceptDef__TopAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1848:2: rule__ConceptDef__TopAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ConceptDef__TopAssignment_0_in_rule__ConceptDef__Group__0__Impl3812);
                    rule__ConceptDef__TopAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConceptDefAccess().getTopAssignment_0()); 

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
    // $ANTLR end "rule__ConceptDef__Group__0__Impl"


    // $ANTLR start "rule__ConceptDef__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1858:1: rule__ConceptDef__Group__1 : rule__ConceptDef__Group__1__Impl rule__ConceptDef__Group__2 ;
    public final void rule__ConceptDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1862:1: ( rule__ConceptDef__Group__1__Impl rule__ConceptDef__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1863:2: rule__ConceptDef__Group__1__Impl rule__ConceptDef__Group__2
            {
            pushFollow(FOLLOW_rule__ConceptDef__Group__1__Impl_in_rule__ConceptDef__Group__13843);
            rule__ConceptDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConceptDef__Group__2_in_rule__ConceptDef__Group__13846);
            rule__ConceptDef__Group__2();

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
    // $ANTLR end "rule__ConceptDef__Group__1"


    // $ANTLR start "rule__ConceptDef__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1870:1: rule__ConceptDef__Group__1__Impl : ( 'concept' ) ;
    public final void rule__ConceptDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1874:1: ( ( 'concept' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1875:1: ( 'concept' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1875:1: ( 'concept' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1876:1: 'concept'
            {
             before(grammarAccess.getConceptDefAccess().getConceptKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ConceptDef__Group__1__Impl3874); 
             after(grammarAccess.getConceptDefAccess().getConceptKeyword_1()); 

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
    // $ANTLR end "rule__ConceptDef__Group__1__Impl"


    // $ANTLR start "rule__ConceptDef__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1889:1: rule__ConceptDef__Group__2 : rule__ConceptDef__Group__2__Impl rule__ConceptDef__Group__3 ;
    public final void rule__ConceptDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1893:1: ( rule__ConceptDef__Group__2__Impl rule__ConceptDef__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1894:2: rule__ConceptDef__Group__2__Impl rule__ConceptDef__Group__3
            {
            pushFollow(FOLLOW_rule__ConceptDef__Group__2__Impl_in_rule__ConceptDef__Group__23905);
            rule__ConceptDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConceptDef__Group__3_in_rule__ConceptDef__Group__23908);
            rule__ConceptDef__Group__3();

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
    // $ANTLR end "rule__ConceptDef__Group__2"


    // $ANTLR start "rule__ConceptDef__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1901:1: rule__ConceptDef__Group__2__Impl : ( ( rule__ConceptDef__NameAssignment_2 ) ) ;
    public final void rule__ConceptDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1905:1: ( ( ( rule__ConceptDef__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1906:1: ( ( rule__ConceptDef__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1906:1: ( ( rule__ConceptDef__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1907:1: ( rule__ConceptDef__NameAssignment_2 )
            {
             before(grammarAccess.getConceptDefAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1908:1: ( rule__ConceptDef__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1908:2: rule__ConceptDef__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__ConceptDef__NameAssignment_2_in_rule__ConceptDef__Group__2__Impl3935);
            rule__ConceptDef__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConceptDefAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__ConceptDef__Group__2__Impl"


    // $ANTLR start "rule__ConceptDef__Group__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1918:1: rule__ConceptDef__Group__3 : rule__ConceptDef__Group__3__Impl rule__ConceptDef__Group__4 ;
    public final void rule__ConceptDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1922:1: ( rule__ConceptDef__Group__3__Impl rule__ConceptDef__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1923:2: rule__ConceptDef__Group__3__Impl rule__ConceptDef__Group__4
            {
            pushFollow(FOLLOW_rule__ConceptDef__Group__3__Impl_in_rule__ConceptDef__Group__33965);
            rule__ConceptDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConceptDef__Group__4_in_rule__ConceptDef__Group__33968);
            rule__ConceptDef__Group__4();

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
    // $ANTLR end "rule__ConceptDef__Group__3"


    // $ANTLR start "rule__ConceptDef__Group__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1930:1: rule__ConceptDef__Group__3__Impl : ( ( rule__ConceptDef__Group_3__0 )? ) ;
    public final void rule__ConceptDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1934:1: ( ( ( rule__ConceptDef__Group_3__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1935:1: ( ( rule__ConceptDef__Group_3__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1935:1: ( ( rule__ConceptDef__Group_3__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1936:1: ( rule__ConceptDef__Group_3__0 )?
            {
             before(grammarAccess.getConceptDefAccess().getGroup_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1937:1: ( rule__ConceptDef__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1937:2: rule__ConceptDef__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ConceptDef__Group_3__0_in_rule__ConceptDef__Group__3__Impl3995);
                    rule__ConceptDef__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConceptDefAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ConceptDef__Group__3__Impl"


    // $ANTLR start "rule__ConceptDef__Group__4"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1947:1: rule__ConceptDef__Group__4 : rule__ConceptDef__Group__4__Impl rule__ConceptDef__Group__5 ;
    public final void rule__ConceptDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1951:1: ( rule__ConceptDef__Group__4__Impl rule__ConceptDef__Group__5 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1952:2: rule__ConceptDef__Group__4__Impl rule__ConceptDef__Group__5
            {
            pushFollow(FOLLOW_rule__ConceptDef__Group__4__Impl_in_rule__ConceptDef__Group__44026);
            rule__ConceptDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConceptDef__Group__5_in_rule__ConceptDef__Group__44029);
            rule__ConceptDef__Group__5();

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
    // $ANTLR end "rule__ConceptDef__Group__4"


    // $ANTLR start "rule__ConceptDef__Group__4__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1959:1: rule__ConceptDef__Group__4__Impl : ( ( rule__ConceptDef__Group_4__0 )? ) ;
    public final void rule__ConceptDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1963:1: ( ( ( rule__ConceptDef__Group_4__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1964:1: ( ( rule__ConceptDef__Group_4__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1964:1: ( ( rule__ConceptDef__Group_4__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1965:1: ( rule__ConceptDef__Group_4__0 )?
            {
             before(grammarAccess.getConceptDefAccess().getGroup_4()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1966:1: ( rule__ConceptDef__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1966:2: rule__ConceptDef__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__ConceptDef__Group_4__0_in_rule__ConceptDef__Group__4__Impl4056);
                    rule__ConceptDef__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConceptDefAccess().getGroup_4()); 

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
    // $ANTLR end "rule__ConceptDef__Group__4__Impl"


    // $ANTLR start "rule__ConceptDef__Group__5"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1976:1: rule__ConceptDef__Group__5 : rule__ConceptDef__Group__5__Impl ;
    public final void rule__ConceptDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1980:1: ( rule__ConceptDef__Group__5__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1981:2: rule__ConceptDef__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__ConceptDef__Group__5__Impl_in_rule__ConceptDef__Group__54087);
            rule__ConceptDef__Group__5__Impl();

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
    // $ANTLR end "rule__ConceptDef__Group__5"


    // $ANTLR start "rule__ConceptDef__Group__5__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1987:1: rule__ConceptDef__Group__5__Impl : ( ( rule__ConceptDef__BodyAssignment_5 )? ) ;
    public final void rule__ConceptDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1991:1: ( ( ( rule__ConceptDef__BodyAssignment_5 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1992:1: ( ( rule__ConceptDef__BodyAssignment_5 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1992:1: ( ( rule__ConceptDef__BodyAssignment_5 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1993:1: ( rule__ConceptDef__BodyAssignment_5 )?
            {
             before(grammarAccess.getConceptDefAccess().getBodyAssignment_5()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1994:1: ( rule__ConceptDef__BodyAssignment_5 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==13) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1994:2: rule__ConceptDef__BodyAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ConceptDef__BodyAssignment_5_in_rule__ConceptDef__Group__5__Impl4114);
                    rule__ConceptDef__BodyAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConceptDefAccess().getBodyAssignment_5()); 

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
    // $ANTLR end "rule__ConceptDef__Group__5__Impl"


    // $ANTLR start "rule__ConceptDef__Group_3__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2016:1: rule__ConceptDef__Group_3__0 : rule__ConceptDef__Group_3__0__Impl rule__ConceptDef__Group_3__1 ;
    public final void rule__ConceptDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2020:1: ( rule__ConceptDef__Group_3__0__Impl rule__ConceptDef__Group_3__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2021:2: rule__ConceptDef__Group_3__0__Impl rule__ConceptDef__Group_3__1
            {
            pushFollow(FOLLOW_rule__ConceptDef__Group_3__0__Impl_in_rule__ConceptDef__Group_3__04157);
            rule__ConceptDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConceptDef__Group_3__1_in_rule__ConceptDef__Group_3__04160);
            rule__ConceptDef__Group_3__1();

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
    // $ANTLR end "rule__ConceptDef__Group_3__0"


    // $ANTLR start "rule__ConceptDef__Group_3__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2028:1: rule__ConceptDef__Group_3__0__Impl : ( '<' ) ;
    public final void rule__ConceptDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2032:1: ( ( '<' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2033:1: ( '<' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2033:1: ( '<' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2034:1: '<'
            {
             before(grammarAccess.getConceptDefAccess().getLessThanSignKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__ConceptDef__Group_3__0__Impl4188); 
             after(grammarAccess.getConceptDefAccess().getLessThanSignKeyword_3_0()); 

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
    // $ANTLR end "rule__ConceptDef__Group_3__0__Impl"


    // $ANTLR start "rule__ConceptDef__Group_3__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2047:1: rule__ConceptDef__Group_3__1 : rule__ConceptDef__Group_3__1__Impl rule__ConceptDef__Group_3__2 ;
    public final void rule__ConceptDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2051:1: ( rule__ConceptDef__Group_3__1__Impl rule__ConceptDef__Group_3__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2052:2: rule__ConceptDef__Group_3__1__Impl rule__ConceptDef__Group_3__2
            {
            pushFollow(FOLLOW_rule__ConceptDef__Group_3__1__Impl_in_rule__ConceptDef__Group_3__14219);
            rule__ConceptDef__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConceptDef__Group_3__2_in_rule__ConceptDef__Group_3__14222);
            rule__ConceptDef__Group_3__2();

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
    // $ANTLR end "rule__ConceptDef__Group_3__1"


    // $ANTLR start "rule__ConceptDef__Group_3__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2059:1: rule__ConceptDef__Group_3__1__Impl : ( ( rule__ConceptDef__MappingAssignment_3_1 ) ) ;
    public final void rule__ConceptDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2063:1: ( ( ( rule__ConceptDef__MappingAssignment_3_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2064:1: ( ( rule__ConceptDef__MappingAssignment_3_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2064:1: ( ( rule__ConceptDef__MappingAssignment_3_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2065:1: ( rule__ConceptDef__MappingAssignment_3_1 )
            {
             before(grammarAccess.getConceptDefAccess().getMappingAssignment_3_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2066:1: ( rule__ConceptDef__MappingAssignment_3_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2066:2: rule__ConceptDef__MappingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ConceptDef__MappingAssignment_3_1_in_rule__ConceptDef__Group_3__1__Impl4249);
            rule__ConceptDef__MappingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getConceptDefAccess().getMappingAssignment_3_1()); 

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
    // $ANTLR end "rule__ConceptDef__Group_3__1__Impl"


    // $ANTLR start "rule__ConceptDef__Group_3__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2076:1: rule__ConceptDef__Group_3__2 : rule__ConceptDef__Group_3__2__Impl ;
    public final void rule__ConceptDef__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2080:1: ( rule__ConceptDef__Group_3__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2081:2: rule__ConceptDef__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ConceptDef__Group_3__2__Impl_in_rule__ConceptDef__Group_3__24279);
            rule__ConceptDef__Group_3__2__Impl();

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
    // $ANTLR end "rule__ConceptDef__Group_3__2"


    // $ANTLR start "rule__ConceptDef__Group_3__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2087:1: rule__ConceptDef__Group_3__2__Impl : ( '>' ) ;
    public final void rule__ConceptDef__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2091:1: ( ( '>' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2092:1: ( '>' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2092:1: ( '>' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2093:1: '>'
            {
             before(grammarAccess.getConceptDefAccess().getGreaterThanSignKeyword_3_2()); 
            match(input,16,FOLLOW_16_in_rule__ConceptDef__Group_3__2__Impl4307); 
             after(grammarAccess.getConceptDefAccess().getGreaterThanSignKeyword_3_2()); 

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
    // $ANTLR end "rule__ConceptDef__Group_3__2__Impl"


    // $ANTLR start "rule__ConceptDef__Group_4__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2112:1: rule__ConceptDef__Group_4__0 : rule__ConceptDef__Group_4__0__Impl rule__ConceptDef__Group_4__1 ;
    public final void rule__ConceptDef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2116:1: ( rule__ConceptDef__Group_4__0__Impl rule__ConceptDef__Group_4__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2117:2: rule__ConceptDef__Group_4__0__Impl rule__ConceptDef__Group_4__1
            {
            pushFollow(FOLLOW_rule__ConceptDef__Group_4__0__Impl_in_rule__ConceptDef__Group_4__04344);
            rule__ConceptDef__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConceptDef__Group_4__1_in_rule__ConceptDef__Group_4__04347);
            rule__ConceptDef__Group_4__1();

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
    // $ANTLR end "rule__ConceptDef__Group_4__0"


    // $ANTLR start "rule__ConceptDef__Group_4__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2124:1: rule__ConceptDef__Group_4__0__Impl : ( '[' ) ;
    public final void rule__ConceptDef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2128:1: ( ( '[' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2129:1: ( '[' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2129:1: ( '[' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2130:1: '['
            {
             before(grammarAccess.getConceptDefAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,17,FOLLOW_17_in_rule__ConceptDef__Group_4__0__Impl4375); 
             after(grammarAccess.getConceptDefAccess().getLeftSquareBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__ConceptDef__Group_4__0__Impl"


    // $ANTLR start "rule__ConceptDef__Group_4__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2143:1: rule__ConceptDef__Group_4__1 : rule__ConceptDef__Group_4__1__Impl rule__ConceptDef__Group_4__2 ;
    public final void rule__ConceptDef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2147:1: ( rule__ConceptDef__Group_4__1__Impl rule__ConceptDef__Group_4__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2148:2: rule__ConceptDef__Group_4__1__Impl rule__ConceptDef__Group_4__2
            {
            pushFollow(FOLLOW_rule__ConceptDef__Group_4__1__Impl_in_rule__ConceptDef__Group_4__14406);
            rule__ConceptDef__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConceptDef__Group_4__2_in_rule__ConceptDef__Group_4__14409);
            rule__ConceptDef__Group_4__2();

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
    // $ANTLR end "rule__ConceptDef__Group_4__1"


    // $ANTLR start "rule__ConceptDef__Group_4__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2155:1: rule__ConceptDef__Group_4__1__Impl : ( ( rule__ConceptDef__AnnotationAssignment_4_1 ) ) ;
    public final void rule__ConceptDef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2159:1: ( ( ( rule__ConceptDef__AnnotationAssignment_4_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2160:1: ( ( rule__ConceptDef__AnnotationAssignment_4_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2160:1: ( ( rule__ConceptDef__AnnotationAssignment_4_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2161:1: ( rule__ConceptDef__AnnotationAssignment_4_1 )
            {
             before(grammarAccess.getConceptDefAccess().getAnnotationAssignment_4_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2162:1: ( rule__ConceptDef__AnnotationAssignment_4_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2162:2: rule__ConceptDef__AnnotationAssignment_4_1
            {
            pushFollow(FOLLOW_rule__ConceptDef__AnnotationAssignment_4_1_in_rule__ConceptDef__Group_4__1__Impl4436);
            rule__ConceptDef__AnnotationAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConceptDefAccess().getAnnotationAssignment_4_1()); 

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
    // $ANTLR end "rule__ConceptDef__Group_4__1__Impl"


    // $ANTLR start "rule__ConceptDef__Group_4__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2172:1: rule__ConceptDef__Group_4__2 : rule__ConceptDef__Group_4__2__Impl rule__ConceptDef__Group_4__3 ;
    public final void rule__ConceptDef__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2176:1: ( rule__ConceptDef__Group_4__2__Impl rule__ConceptDef__Group_4__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2177:2: rule__ConceptDef__Group_4__2__Impl rule__ConceptDef__Group_4__3
            {
            pushFollow(FOLLOW_rule__ConceptDef__Group_4__2__Impl_in_rule__ConceptDef__Group_4__24466);
            rule__ConceptDef__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConceptDef__Group_4__3_in_rule__ConceptDef__Group_4__24469);
            rule__ConceptDef__Group_4__3();

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
    // $ANTLR end "rule__ConceptDef__Group_4__2"


    // $ANTLR start "rule__ConceptDef__Group_4__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2184:1: rule__ConceptDef__Group_4__2__Impl : ( ( rule__ConceptDef__Group_4_2__0 )* ) ;
    public final void rule__ConceptDef__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2188:1: ( ( ( rule__ConceptDef__Group_4_2__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2189:1: ( ( rule__ConceptDef__Group_4_2__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2189:1: ( ( rule__ConceptDef__Group_4_2__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2190:1: ( rule__ConceptDef__Group_4_2__0 )*
            {
             before(grammarAccess.getConceptDefAccess().getGroup_4_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2191:1: ( rule__ConceptDef__Group_4_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2191:2: rule__ConceptDef__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ConceptDef__Group_4_2__0_in_rule__ConceptDef__Group_4__2__Impl4496);
            	    rule__ConceptDef__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getConceptDefAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__ConceptDef__Group_4__2__Impl"


    // $ANTLR start "rule__ConceptDef__Group_4__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2201:1: rule__ConceptDef__Group_4__3 : rule__ConceptDef__Group_4__3__Impl ;
    public final void rule__ConceptDef__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2205:1: ( rule__ConceptDef__Group_4__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2206:2: rule__ConceptDef__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__ConceptDef__Group_4__3__Impl_in_rule__ConceptDef__Group_4__34527);
            rule__ConceptDef__Group_4__3__Impl();

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
    // $ANTLR end "rule__ConceptDef__Group_4__3"


    // $ANTLR start "rule__ConceptDef__Group_4__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2212:1: rule__ConceptDef__Group_4__3__Impl : ( ']' ) ;
    public final void rule__ConceptDef__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2216:1: ( ( ']' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2217:1: ( ']' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2217:1: ( ']' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2218:1: ']'
            {
             before(grammarAccess.getConceptDefAccess().getRightSquareBracketKeyword_4_3()); 
            match(input,18,FOLLOW_18_in_rule__ConceptDef__Group_4__3__Impl4555); 
             after(grammarAccess.getConceptDefAccess().getRightSquareBracketKeyword_4_3()); 

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
    // $ANTLR end "rule__ConceptDef__Group_4__3__Impl"


    // $ANTLR start "rule__ConceptDef__Group_4_2__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2239:1: rule__ConceptDef__Group_4_2__0 : rule__ConceptDef__Group_4_2__0__Impl rule__ConceptDef__Group_4_2__1 ;
    public final void rule__ConceptDef__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2243:1: ( rule__ConceptDef__Group_4_2__0__Impl rule__ConceptDef__Group_4_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2244:2: rule__ConceptDef__Group_4_2__0__Impl rule__ConceptDef__Group_4_2__1
            {
            pushFollow(FOLLOW_rule__ConceptDef__Group_4_2__0__Impl_in_rule__ConceptDef__Group_4_2__04594);
            rule__ConceptDef__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConceptDef__Group_4_2__1_in_rule__ConceptDef__Group_4_2__04597);
            rule__ConceptDef__Group_4_2__1();

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
    // $ANTLR end "rule__ConceptDef__Group_4_2__0"


    // $ANTLR start "rule__ConceptDef__Group_4_2__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2251:1: rule__ConceptDef__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__ConceptDef__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2255:1: ( ( ',' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2256:1: ( ',' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2256:1: ( ',' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2257:1: ','
            {
             before(grammarAccess.getConceptDefAccess().getCommaKeyword_4_2_0()); 
            match(input,19,FOLLOW_19_in_rule__ConceptDef__Group_4_2__0__Impl4625); 
             after(grammarAccess.getConceptDefAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__ConceptDef__Group_4_2__0__Impl"


    // $ANTLR start "rule__ConceptDef__Group_4_2__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2270:1: rule__ConceptDef__Group_4_2__1 : rule__ConceptDef__Group_4_2__1__Impl ;
    public final void rule__ConceptDef__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2274:1: ( rule__ConceptDef__Group_4_2__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2275:2: rule__ConceptDef__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ConceptDef__Group_4_2__1__Impl_in_rule__ConceptDef__Group_4_2__14656);
            rule__ConceptDef__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__ConceptDef__Group_4_2__1"


    // $ANTLR start "rule__ConceptDef__Group_4_2__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2281:1: rule__ConceptDef__Group_4_2__1__Impl : ( ( rule__ConceptDef__AnnotationAssignment_4_2_1 ) ) ;
    public final void rule__ConceptDef__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2285:1: ( ( ( rule__ConceptDef__AnnotationAssignment_4_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2286:1: ( ( rule__ConceptDef__AnnotationAssignment_4_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2286:1: ( ( rule__ConceptDef__AnnotationAssignment_4_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2287:1: ( rule__ConceptDef__AnnotationAssignment_4_2_1 )
            {
             before(grammarAccess.getConceptDefAccess().getAnnotationAssignment_4_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2288:1: ( rule__ConceptDef__AnnotationAssignment_4_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2288:2: rule__ConceptDef__AnnotationAssignment_4_2_1
            {
            pushFollow(FOLLOW_rule__ConceptDef__AnnotationAssignment_4_2_1_in_rule__ConceptDef__Group_4_2__1__Impl4683);
            rule__ConceptDef__AnnotationAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConceptDefAccess().getAnnotationAssignment_4_2_1()); 

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
    // $ANTLR end "rule__ConceptDef__Group_4_2__1__Impl"


    // $ANTLR start "rule__ConceptDefBody__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2302:1: rule__ConceptDefBody__Group__0 : rule__ConceptDefBody__Group__0__Impl rule__ConceptDefBody__Group__1 ;
    public final void rule__ConceptDefBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2306:1: ( rule__ConceptDefBody__Group__0__Impl rule__ConceptDefBody__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2307:2: rule__ConceptDefBody__Group__0__Impl rule__ConceptDefBody__Group__1
            {
            pushFollow(FOLLOW_rule__ConceptDefBody__Group__0__Impl_in_rule__ConceptDefBody__Group__04717);
            rule__ConceptDefBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConceptDefBody__Group__1_in_rule__ConceptDefBody__Group__04720);
            rule__ConceptDefBody__Group__1();

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
    // $ANTLR end "rule__ConceptDefBody__Group__0"


    // $ANTLR start "rule__ConceptDefBody__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2314:1: rule__ConceptDefBody__Group__0__Impl : ( '{' ) ;
    public final void rule__ConceptDefBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2318:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2319:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2319:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2320:1: '{'
            {
             before(grammarAccess.getConceptDefBodyAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__ConceptDefBody__Group__0__Impl4748); 
             after(grammarAccess.getConceptDefBodyAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__ConceptDefBody__Group__0__Impl"


    // $ANTLR start "rule__ConceptDefBody__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2333:1: rule__ConceptDefBody__Group__1 : rule__ConceptDefBody__Group__1__Impl rule__ConceptDefBody__Group__2 ;
    public final void rule__ConceptDefBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2337:1: ( rule__ConceptDefBody__Group__1__Impl rule__ConceptDefBody__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2338:2: rule__ConceptDefBody__Group__1__Impl rule__ConceptDefBody__Group__2
            {
            pushFollow(FOLLOW_rule__ConceptDefBody__Group__1__Impl_in_rule__ConceptDefBody__Group__14779);
            rule__ConceptDefBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConceptDefBody__Group__2_in_rule__ConceptDefBody__Group__14782);
            rule__ConceptDefBody__Group__2();

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
    // $ANTLR end "rule__ConceptDefBody__Group__1"


    // $ANTLR start "rule__ConceptDefBody__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2345:1: rule__ConceptDefBody__Group__1__Impl : ( ( rule__ConceptDefBody__SubconceptAssignment_1 ) ) ;
    public final void rule__ConceptDefBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2349:1: ( ( ( rule__ConceptDefBody__SubconceptAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2350:1: ( ( rule__ConceptDefBody__SubconceptAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2350:1: ( ( rule__ConceptDefBody__SubconceptAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2351:1: ( rule__ConceptDefBody__SubconceptAssignment_1 )
            {
             before(grammarAccess.getConceptDefBodyAccess().getSubconceptAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2352:1: ( rule__ConceptDefBody__SubconceptAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2352:2: rule__ConceptDefBody__SubconceptAssignment_1
            {
            pushFollow(FOLLOW_rule__ConceptDefBody__SubconceptAssignment_1_in_rule__ConceptDefBody__Group__1__Impl4809);
            rule__ConceptDefBody__SubconceptAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConceptDefBodyAccess().getSubconceptAssignment_1()); 

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
    // $ANTLR end "rule__ConceptDefBody__Group__1__Impl"


    // $ANTLR start "rule__ConceptDefBody__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2362:1: rule__ConceptDefBody__Group__2 : rule__ConceptDefBody__Group__2__Impl rule__ConceptDefBody__Group__3 ;
    public final void rule__ConceptDefBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2366:1: ( rule__ConceptDefBody__Group__2__Impl rule__ConceptDefBody__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2367:2: rule__ConceptDefBody__Group__2__Impl rule__ConceptDefBody__Group__3
            {
            pushFollow(FOLLOW_rule__ConceptDefBody__Group__2__Impl_in_rule__ConceptDefBody__Group__24839);
            rule__ConceptDefBody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConceptDefBody__Group__3_in_rule__ConceptDefBody__Group__24842);
            rule__ConceptDefBody__Group__3();

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
    // $ANTLR end "rule__ConceptDefBody__Group__2"


    // $ANTLR start "rule__ConceptDefBody__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2374:1: rule__ConceptDefBody__Group__2__Impl : ( ( rule__ConceptDefBody__Group_2__0 )* ) ;
    public final void rule__ConceptDefBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2378:1: ( ( ( rule__ConceptDefBody__Group_2__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2379:1: ( ( rule__ConceptDefBody__Group_2__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2379:1: ( ( rule__ConceptDefBody__Group_2__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2380:1: ( rule__ConceptDefBody__Group_2__0 )*
            {
             before(grammarAccess.getConceptDefBodyAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2381:1: ( rule__ConceptDefBody__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==19) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2381:2: rule__ConceptDefBody__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ConceptDefBody__Group_2__0_in_rule__ConceptDefBody__Group__2__Impl4869);
            	    rule__ConceptDefBody__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getConceptDefBodyAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ConceptDefBody__Group__2__Impl"


    // $ANTLR start "rule__ConceptDefBody__Group__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2391:1: rule__ConceptDefBody__Group__3 : rule__ConceptDefBody__Group__3__Impl ;
    public final void rule__ConceptDefBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2395:1: ( rule__ConceptDefBody__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2396:2: rule__ConceptDefBody__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ConceptDefBody__Group__3__Impl_in_rule__ConceptDefBody__Group__34900);
            rule__ConceptDefBody__Group__3__Impl();

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
    // $ANTLR end "rule__ConceptDefBody__Group__3"


    // $ANTLR start "rule__ConceptDefBody__Group__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2402:1: rule__ConceptDefBody__Group__3__Impl : ( '}' ) ;
    public final void rule__ConceptDefBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2406:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2407:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2407:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2408:1: '}'
            {
             before(grammarAccess.getConceptDefBodyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__ConceptDefBody__Group__3__Impl4928); 
             after(grammarAccess.getConceptDefBodyAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ConceptDefBody__Group__3__Impl"


    // $ANTLR start "rule__ConceptDefBody__Group_2__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2429:1: rule__ConceptDefBody__Group_2__0 : rule__ConceptDefBody__Group_2__0__Impl rule__ConceptDefBody__Group_2__1 ;
    public final void rule__ConceptDefBody__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2433:1: ( rule__ConceptDefBody__Group_2__0__Impl rule__ConceptDefBody__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2434:2: rule__ConceptDefBody__Group_2__0__Impl rule__ConceptDefBody__Group_2__1
            {
            pushFollow(FOLLOW_rule__ConceptDefBody__Group_2__0__Impl_in_rule__ConceptDefBody__Group_2__04967);
            rule__ConceptDefBody__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConceptDefBody__Group_2__1_in_rule__ConceptDefBody__Group_2__04970);
            rule__ConceptDefBody__Group_2__1();

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
    // $ANTLR end "rule__ConceptDefBody__Group_2__0"


    // $ANTLR start "rule__ConceptDefBody__Group_2__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2441:1: rule__ConceptDefBody__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ConceptDefBody__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2445:1: ( ( ',' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2446:1: ( ',' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2446:1: ( ',' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2447:1: ','
            {
             before(grammarAccess.getConceptDefBodyAccess().getCommaKeyword_2_0()); 
            match(input,19,FOLLOW_19_in_rule__ConceptDefBody__Group_2__0__Impl4998); 
             after(grammarAccess.getConceptDefBodyAccess().getCommaKeyword_2_0()); 

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
    // $ANTLR end "rule__ConceptDefBody__Group_2__0__Impl"


    // $ANTLR start "rule__ConceptDefBody__Group_2__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2460:1: rule__ConceptDefBody__Group_2__1 : rule__ConceptDefBody__Group_2__1__Impl ;
    public final void rule__ConceptDefBody__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2464:1: ( rule__ConceptDefBody__Group_2__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2465:2: rule__ConceptDefBody__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ConceptDefBody__Group_2__1__Impl_in_rule__ConceptDefBody__Group_2__15029);
            rule__ConceptDefBody__Group_2__1__Impl();

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
    // $ANTLR end "rule__ConceptDefBody__Group_2__1"


    // $ANTLR start "rule__ConceptDefBody__Group_2__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2471:1: rule__ConceptDefBody__Group_2__1__Impl : ( ( rule__ConceptDefBody__SubconceptAssignment_2_1 ) ) ;
    public final void rule__ConceptDefBody__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2475:1: ( ( ( rule__ConceptDefBody__SubconceptAssignment_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2476:1: ( ( rule__ConceptDefBody__SubconceptAssignment_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2476:1: ( ( rule__ConceptDefBody__SubconceptAssignment_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2477:1: ( rule__ConceptDefBody__SubconceptAssignment_2_1 )
            {
             before(grammarAccess.getConceptDefBodyAccess().getSubconceptAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2478:1: ( rule__ConceptDefBody__SubconceptAssignment_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2478:2: rule__ConceptDefBody__SubconceptAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ConceptDefBody__SubconceptAssignment_2_1_in_rule__ConceptDefBody__Group_2__1__Impl5056);
            rule__ConceptDefBody__SubconceptAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getConceptDefBodyAccess().getSubconceptAssignment_2_1()); 

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
    // $ANTLR end "rule__ConceptDefBody__Group_2__1__Impl"


    // $ANTLR start "rule__Mapping__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2492:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2496:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2497:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__05090);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__05093);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2504:1: rule__Mapping__Group__0__Impl : ( ( rule__Mapping__ContextAssignment_0 )? ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2508:1: ( ( ( rule__Mapping__ContextAssignment_0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2509:1: ( ( rule__Mapping__ContextAssignment_0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2509:1: ( ( rule__Mapping__ContextAssignment_0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2510:1: ( rule__Mapping__ContextAssignment_0 )?
            {
             before(grammarAccess.getMappingAccess().getContextAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2511:1: ( rule__Mapping__ContextAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2511:2: rule__Mapping__ContextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Mapping__ContextAssignment_0_in_rule__Mapping__Group__0__Impl5120);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2521:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2525:1: ( rule__Mapping__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2526:2: rule__Mapping__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__15151);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2532:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__MappingAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2536:1: ( ( ( rule__Mapping__MappingAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2537:1: ( ( rule__Mapping__MappingAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2537:1: ( ( rule__Mapping__MappingAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2538:1: ( rule__Mapping__MappingAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getMappingAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2539:1: ( rule__Mapping__MappingAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2539:2: rule__Mapping__MappingAssignment_1
            {
            pushFollow(FOLLOW_rule__Mapping__MappingAssignment_1_in_rule__Mapping__Group__1__Impl5178);
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


    // $ANTLR start "rule__Module__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2553:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2557:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2558:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__05212);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__05215);
            rule__Module__Group__1();

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
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2565:1: rule__Module__Group__0__Impl : ( () ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2569:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2570:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2570:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2571:1: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2572:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2574:1: 
            {
            }

             after(grammarAccess.getModuleAccess().getModuleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2584:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2588:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2589:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__15273);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__15276);
            rule__Module__Group__2();

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
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2596:1: rule__Module__Group__1__Impl : ( 'module' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2600:1: ( ( 'module' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2601:1: ( 'module' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2601:1: ( 'module' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2602:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Module__Group__1__Impl5304); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_1()); 

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
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2615:1: rule__Module__Group__2 : rule__Module__Group__2__Impl ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2619:1: ( rule__Module__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2620:2: rule__Module__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__25335);
            rule__Module__Group__2__Impl();

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
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2626:1: rule__Module__Group__2__Impl : ( ( rule__Module__Group_2__0 )? ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2630:1: ( ( ( rule__Module__Group_2__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2631:1: ( ( rule__Module__Group_2__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2631:1: ( ( rule__Module__Group_2__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2632:1: ( rule__Module__Group_2__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2633:1: ( rule__Module__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2633:2: rule__Module__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_2__0_in_rule__Module__Group__2__Impl5362);
                    rule__Module__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group_2__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2649:1: rule__Module__Group_2__0 : rule__Module__Group_2__0__Impl rule__Module__Group_2__1 ;
    public final void rule__Module__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2653:1: ( rule__Module__Group_2__0__Impl rule__Module__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2654:2: rule__Module__Group_2__0__Impl rule__Module__Group_2__1
            {
            pushFollow(FOLLOW_rule__Module__Group_2__0__Impl_in_rule__Module__Group_2__05399);
            rule__Module__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2__1_in_rule__Module__Group_2__05402);
            rule__Module__Group_2__1();

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
    // $ANTLR end "rule__Module__Group_2__0"


    // $ANTLR start "rule__Module__Group_2__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2661:1: rule__Module__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Module__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2665:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2666:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2666:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2667:1: '('
            {
             before(grammarAccess.getModuleAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__Module__Group_2__0__Impl5430); 
             after(grammarAccess.getModuleAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__Module__Group_2__0__Impl"


    // $ANTLR start "rule__Module__Group_2__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2680:1: rule__Module__Group_2__1 : rule__Module__Group_2__1__Impl rule__Module__Group_2__2 ;
    public final void rule__Module__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2684:1: ( rule__Module__Group_2__1__Impl rule__Module__Group_2__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2685:2: rule__Module__Group_2__1__Impl rule__Module__Group_2__2
            {
            pushFollow(FOLLOW_rule__Module__Group_2__1__Impl_in_rule__Module__Group_2__15461);
            rule__Module__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2__2_in_rule__Module__Group_2__15464);
            rule__Module__Group_2__2();

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
    // $ANTLR end "rule__Module__Group_2__1"


    // $ANTLR start "rule__Module__Group_2__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2692:1: rule__Module__Group_2__1__Impl : ( ( rule__Module__NameAssignment_2_1 ) ) ;
    public final void rule__Module__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2696:1: ( ( ( rule__Module__NameAssignment_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2697:1: ( ( rule__Module__NameAssignment_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2697:1: ( ( rule__Module__NameAssignment_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2698:1: ( rule__Module__NameAssignment_2_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2699:1: ( rule__Module__NameAssignment_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2699:2: rule__Module__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_2_1_in_rule__Module__Group_2__1__Impl5491);
            rule__Module__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_2_1()); 

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
    // $ANTLR end "rule__Module__Group_2__1__Impl"


    // $ANTLR start "rule__Module__Group_2__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2709:1: rule__Module__Group_2__2 : rule__Module__Group_2__2__Impl ;
    public final void rule__Module__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2713:1: ( rule__Module__Group_2__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2714:2: rule__Module__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_2__2__Impl_in_rule__Module__Group_2__25521);
            rule__Module__Group_2__2__Impl();

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
    // $ANTLR end "rule__Module__Group_2__2"


    // $ANTLR start "rule__Module__Group_2__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2720:1: rule__Module__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Module__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2724:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2725:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2725:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2726:1: ')'
            {
             before(grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_2()); 
            match(input,24,FOLLOW_24_in_rule__Module__Group_2__2__Impl5549); 
             after(grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__Module__Group_2__2__Impl"


    // $ANTLR start "rule__ModuleName__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2745:1: rule__ModuleName__Group__0 : rule__ModuleName__Group__0__Impl rule__ModuleName__Group__1 ;
    public final void rule__ModuleName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2749:1: ( rule__ModuleName__Group__0__Impl rule__ModuleName__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2750:2: rule__ModuleName__Group__0__Impl rule__ModuleName__Group__1
            {
            pushFollow(FOLLOW_rule__ModuleName__Group__0__Impl_in_rule__ModuleName__Group__05586);
            rule__ModuleName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleName__Group__1_in_rule__ModuleName__Group__05589);
            rule__ModuleName__Group__1();

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
    // $ANTLR end "rule__ModuleName__Group__0"


    // $ANTLR start "rule__ModuleName__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2757:1: rule__ModuleName__Group__0__Impl : ( () ) ;
    public final void rule__ModuleName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2761:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2762:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2762:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2763:1: ()
            {
             before(grammarAccess.getModuleNameAccess().getModuleNameAction_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2764:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2766:1: 
            {
            }

             after(grammarAccess.getModuleNameAccess().getModuleNameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleName__Group__0__Impl"


    // $ANTLR start "rule__ModuleName__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2776:1: rule__ModuleName__Group__1 : rule__ModuleName__Group__1__Impl ;
    public final void rule__ModuleName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2780:1: ( rule__ModuleName__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2781:2: rule__ModuleName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ModuleName__Group__1__Impl_in_rule__ModuleName__Group__15647);
            rule__ModuleName__Group__1__Impl();

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
    // $ANTLR end "rule__ModuleName__Group__1"


    // $ANTLR start "rule__ModuleName__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2787:1: rule__ModuleName__Group__1__Impl : ( 'moduleName' ) ;
    public final void rule__ModuleName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2791:1: ( ( 'moduleName' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2792:1: ( 'moduleName' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2792:1: ( 'moduleName' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2793:1: 'moduleName'
            {
             before(grammarAccess.getModuleNameAccess().getModuleNameKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__ModuleName__Group__1__Impl5675); 
             after(grammarAccess.getModuleNameAccess().getModuleNameKeyword_1()); 

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
    // $ANTLR end "rule__ModuleName__Group__1__Impl"


    // $ANTLR start "rule__UsesModule__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2810:1: rule__UsesModule__Group__0 : rule__UsesModule__Group__0__Impl rule__UsesModule__Group__1 ;
    public final void rule__UsesModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2814:1: ( rule__UsesModule__Group__0__Impl rule__UsesModule__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2815:2: rule__UsesModule__Group__0__Impl rule__UsesModule__Group__1
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__0__Impl_in_rule__UsesModule__Group__05710);
            rule__UsesModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesModule__Group__1_in_rule__UsesModule__Group__05713);
            rule__UsesModule__Group__1();

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
    // $ANTLR end "rule__UsesModule__Group__0"


    // $ANTLR start "rule__UsesModule__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2822:1: rule__UsesModule__Group__0__Impl : ( 'usesModule' ) ;
    public final void rule__UsesModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2826:1: ( ( 'usesModule' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2827:1: ( 'usesModule' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2827:1: ( 'usesModule' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2828:1: 'usesModule'
            {
             before(grammarAccess.getUsesModuleAccess().getUsesModuleKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__UsesModule__Group__0__Impl5741); 
             after(grammarAccess.getUsesModuleAccess().getUsesModuleKeyword_0()); 

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
    // $ANTLR end "rule__UsesModule__Group__0__Impl"


    // $ANTLR start "rule__UsesModule__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2841:1: rule__UsesModule__Group__1 : rule__UsesModule__Group__1__Impl rule__UsesModule__Group__2 ;
    public final void rule__UsesModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2845:1: ( rule__UsesModule__Group__1__Impl rule__UsesModule__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2846:2: rule__UsesModule__Group__1__Impl rule__UsesModule__Group__2
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__1__Impl_in_rule__UsesModule__Group__15772);
            rule__UsesModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesModule__Group__2_in_rule__UsesModule__Group__15775);
            rule__UsesModule__Group__2();

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
    // $ANTLR end "rule__UsesModule__Group__1"


    // $ANTLR start "rule__UsesModule__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2853:1: rule__UsesModule__Group__1__Impl : ( '(' ) ;
    public final void rule__UsesModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2857:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2858:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2858:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2859:1: '('
            {
             before(grammarAccess.getUsesModuleAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__UsesModule__Group__1__Impl5803); 
             after(grammarAccess.getUsesModuleAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__UsesModule__Group__1__Impl"


    // $ANTLR start "rule__UsesModule__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2872:1: rule__UsesModule__Group__2 : rule__UsesModule__Group__2__Impl rule__UsesModule__Group__3 ;
    public final void rule__UsesModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2876:1: ( rule__UsesModule__Group__2__Impl rule__UsesModule__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2877:2: rule__UsesModule__Group__2__Impl rule__UsesModule__Group__3
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__2__Impl_in_rule__UsesModule__Group__25834);
            rule__UsesModule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesModule__Group__3_in_rule__UsesModule__Group__25837);
            rule__UsesModule__Group__3();

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
    // $ANTLR end "rule__UsesModule__Group__2"


    // $ANTLR start "rule__UsesModule__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2884:1: rule__UsesModule__Group__2__Impl : ( ( rule__UsesModule__NameAssignment_2 ) ) ;
    public final void rule__UsesModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2888:1: ( ( ( rule__UsesModule__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2889:1: ( ( rule__UsesModule__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2889:1: ( ( rule__UsesModule__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2890:1: ( rule__UsesModule__NameAssignment_2 )
            {
             before(grammarAccess.getUsesModuleAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2891:1: ( rule__UsesModule__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2891:2: rule__UsesModule__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UsesModule__NameAssignment_2_in_rule__UsesModule__Group__2__Impl5864);
            rule__UsesModule__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUsesModuleAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__UsesModule__Group__2__Impl"


    // $ANTLR start "rule__UsesModule__Group__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2901:1: rule__UsesModule__Group__3 : rule__UsesModule__Group__3__Impl ;
    public final void rule__UsesModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2905:1: ( rule__UsesModule__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2906:2: rule__UsesModule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__3__Impl_in_rule__UsesModule__Group__35894);
            rule__UsesModule__Group__3__Impl();

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
    // $ANTLR end "rule__UsesModule__Group__3"


    // $ANTLR start "rule__UsesModule__Group__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2912:1: rule__UsesModule__Group__3__Impl : ( ')' ) ;
    public final void rule__UsesModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2916:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2917:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2917:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2918:1: ')'
            {
             before(grammarAccess.getUsesModuleAccess().getRightParenthesisKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__UsesModule__Group__3__Impl5922); 
             after(grammarAccess.getUsesModuleAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__UsesModule__Group__3__Impl"


    // $ANTLR start "rule__UsesEntity__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2939:1: rule__UsesEntity__Group__0 : rule__UsesEntity__Group__0__Impl rule__UsesEntity__Group__1 ;
    public final void rule__UsesEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2943:1: ( rule__UsesEntity__Group__0__Impl rule__UsesEntity__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2944:2: rule__UsesEntity__Group__0__Impl rule__UsesEntity__Group__1
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__0__Impl_in_rule__UsesEntity__Group__05961);
            rule__UsesEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesEntity__Group__1_in_rule__UsesEntity__Group__05964);
            rule__UsesEntity__Group__1();

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
    // $ANTLR end "rule__UsesEntity__Group__0"


    // $ANTLR start "rule__UsesEntity__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2951:1: rule__UsesEntity__Group__0__Impl : ( 'usesEntity' ) ;
    public final void rule__UsesEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2955:1: ( ( 'usesEntity' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2956:1: ( 'usesEntity' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2956:1: ( 'usesEntity' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2957:1: 'usesEntity'
            {
             before(grammarAccess.getUsesEntityAccess().getUsesEntityKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__UsesEntity__Group__0__Impl5992); 
             after(grammarAccess.getUsesEntityAccess().getUsesEntityKeyword_0()); 

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
    // $ANTLR end "rule__UsesEntity__Group__0__Impl"


    // $ANTLR start "rule__UsesEntity__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2970:1: rule__UsesEntity__Group__1 : rule__UsesEntity__Group__1__Impl rule__UsesEntity__Group__2 ;
    public final void rule__UsesEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2974:1: ( rule__UsesEntity__Group__1__Impl rule__UsesEntity__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2975:2: rule__UsesEntity__Group__1__Impl rule__UsesEntity__Group__2
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__1__Impl_in_rule__UsesEntity__Group__16023);
            rule__UsesEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesEntity__Group__2_in_rule__UsesEntity__Group__16026);
            rule__UsesEntity__Group__2();

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
    // $ANTLR end "rule__UsesEntity__Group__1"


    // $ANTLR start "rule__UsesEntity__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2982:1: rule__UsesEntity__Group__1__Impl : ( '(' ) ;
    public final void rule__UsesEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2986:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2987:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2987:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2988:1: '('
            {
             before(grammarAccess.getUsesEntityAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__UsesEntity__Group__1__Impl6054); 
             after(grammarAccess.getUsesEntityAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__UsesEntity__Group__1__Impl"


    // $ANTLR start "rule__UsesEntity__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3001:1: rule__UsesEntity__Group__2 : rule__UsesEntity__Group__2__Impl rule__UsesEntity__Group__3 ;
    public final void rule__UsesEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3005:1: ( rule__UsesEntity__Group__2__Impl rule__UsesEntity__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3006:2: rule__UsesEntity__Group__2__Impl rule__UsesEntity__Group__3
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__2__Impl_in_rule__UsesEntity__Group__26085);
            rule__UsesEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesEntity__Group__3_in_rule__UsesEntity__Group__26088);
            rule__UsesEntity__Group__3();

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
    // $ANTLR end "rule__UsesEntity__Group__2"


    // $ANTLR start "rule__UsesEntity__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3013:1: rule__UsesEntity__Group__2__Impl : ( ( rule__UsesEntity__NameAssignment_2 ) ) ;
    public final void rule__UsesEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3017:1: ( ( ( rule__UsesEntity__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3018:1: ( ( rule__UsesEntity__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3018:1: ( ( rule__UsesEntity__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3019:1: ( rule__UsesEntity__NameAssignment_2 )
            {
             before(grammarAccess.getUsesEntityAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3020:1: ( rule__UsesEntity__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3020:2: rule__UsesEntity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UsesEntity__NameAssignment_2_in_rule__UsesEntity__Group__2__Impl6115);
            rule__UsesEntity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUsesEntityAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__UsesEntity__Group__2__Impl"


    // $ANTLR start "rule__UsesEntity__Group__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3030:1: rule__UsesEntity__Group__3 : rule__UsesEntity__Group__3__Impl ;
    public final void rule__UsesEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3034:1: ( rule__UsesEntity__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3035:2: rule__UsesEntity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__3__Impl_in_rule__UsesEntity__Group__36145);
            rule__UsesEntity__Group__3__Impl();

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
    // $ANTLR end "rule__UsesEntity__Group__3"


    // $ANTLR start "rule__UsesEntity__Group__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3041:1: rule__UsesEntity__Group__3__Impl : ( ')' ) ;
    public final void rule__UsesEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3045:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3046:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3046:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3047:1: ')'
            {
             before(grammarAccess.getUsesEntityAccess().getRightParenthesisKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__UsesEntity__Group__3__Impl6173); 
             after(grammarAccess.getUsesEntityAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__UsesEntity__Group__3__Impl"


    // $ANTLR start "rule__Subroutine__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3068:1: rule__Subroutine__Group__0 : rule__Subroutine__Group__0__Impl rule__Subroutine__Group__1 ;
    public final void rule__Subroutine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3072:1: ( rule__Subroutine__Group__0__Impl rule__Subroutine__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3073:2: rule__Subroutine__Group__0__Impl rule__Subroutine__Group__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__0__Impl_in_rule__Subroutine__Group__06212);
            rule__Subroutine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__1_in_rule__Subroutine__Group__06215);
            rule__Subroutine__Group__1();

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
    // $ANTLR end "rule__Subroutine__Group__0"


    // $ANTLR start "rule__Subroutine__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3080:1: rule__Subroutine__Group__0__Impl : ( 'subroutine' ) ;
    public final void rule__Subroutine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3084:1: ( ( 'subroutine' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3085:1: ( 'subroutine' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3085:1: ( 'subroutine' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3086:1: 'subroutine'
            {
             before(grammarAccess.getSubroutineAccess().getSubroutineKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Subroutine__Group__0__Impl6243); 
             after(grammarAccess.getSubroutineAccess().getSubroutineKeyword_0()); 

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
    // $ANTLR end "rule__Subroutine__Group__0__Impl"


    // $ANTLR start "rule__Subroutine__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3099:1: rule__Subroutine__Group__1 : rule__Subroutine__Group__1__Impl rule__Subroutine__Group__2 ;
    public final void rule__Subroutine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3103:1: ( rule__Subroutine__Group__1__Impl rule__Subroutine__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3104:2: rule__Subroutine__Group__1__Impl rule__Subroutine__Group__2
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__1__Impl_in_rule__Subroutine__Group__16274);
            rule__Subroutine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__2_in_rule__Subroutine__Group__16277);
            rule__Subroutine__Group__2();

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
    // $ANTLR end "rule__Subroutine__Group__1"


    // $ANTLR start "rule__Subroutine__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3111:1: rule__Subroutine__Group__1__Impl : ( '(' ) ;
    public final void rule__Subroutine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3115:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3116:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3116:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3117:1: '('
            {
             before(grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Subroutine__Group__1__Impl6305); 
             after(grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__Subroutine__Group__1__Impl"


    // $ANTLR start "rule__Subroutine__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3130:1: rule__Subroutine__Group__2 : rule__Subroutine__Group__2__Impl rule__Subroutine__Group__3 ;
    public final void rule__Subroutine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3134:1: ( rule__Subroutine__Group__2__Impl rule__Subroutine__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3135:2: rule__Subroutine__Group__2__Impl rule__Subroutine__Group__3
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__2__Impl_in_rule__Subroutine__Group__26336);
            rule__Subroutine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__3_in_rule__Subroutine__Group__26339);
            rule__Subroutine__Group__3();

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
    // $ANTLR end "rule__Subroutine__Group__2"


    // $ANTLR start "rule__Subroutine__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3142:1: rule__Subroutine__Group__2__Impl : ( ( rule__Subroutine__NameAssignment_2 ) ) ;
    public final void rule__Subroutine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3146:1: ( ( ( rule__Subroutine__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3147:1: ( ( rule__Subroutine__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3147:1: ( ( rule__Subroutine__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3148:1: ( rule__Subroutine__NameAssignment_2 )
            {
             before(grammarAccess.getSubroutineAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3149:1: ( rule__Subroutine__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3149:2: rule__Subroutine__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Subroutine__NameAssignment_2_in_rule__Subroutine__Group__2__Impl6366);
            rule__Subroutine__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubroutineAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Subroutine__Group__2__Impl"


    // $ANTLR start "rule__Subroutine__Group__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3159:1: rule__Subroutine__Group__3 : rule__Subroutine__Group__3__Impl rule__Subroutine__Group__4 ;
    public final void rule__Subroutine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3163:1: ( rule__Subroutine__Group__3__Impl rule__Subroutine__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3164:2: rule__Subroutine__Group__3__Impl rule__Subroutine__Group__4
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__3__Impl_in_rule__Subroutine__Group__36396);
            rule__Subroutine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__4_in_rule__Subroutine__Group__36399);
            rule__Subroutine__Group__4();

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
    // $ANTLR end "rule__Subroutine__Group__3"


    // $ANTLR start "rule__Subroutine__Group__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3171:1: rule__Subroutine__Group__3__Impl : ( ( rule__Subroutine__Group_3__0 )? ) ;
    public final void rule__Subroutine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3175:1: ( ( ( rule__Subroutine__Group_3__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3176:1: ( ( rule__Subroutine__Group_3__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3176:1: ( ( rule__Subroutine__Group_3__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3177:1: ( rule__Subroutine__Group_3__0 )?
            {
             before(grammarAccess.getSubroutineAccess().getGroup_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3178:1: ( rule__Subroutine__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3178:2: rule__Subroutine__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Subroutine__Group_3__0_in_rule__Subroutine__Group__3__Impl6426);
                    rule__Subroutine__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubroutineAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Subroutine__Group__3__Impl"


    // $ANTLR start "rule__Subroutine__Group__4"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3188:1: rule__Subroutine__Group__4 : rule__Subroutine__Group__4__Impl ;
    public final void rule__Subroutine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3192:1: ( rule__Subroutine__Group__4__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3193:2: rule__Subroutine__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__4__Impl_in_rule__Subroutine__Group__46457);
            rule__Subroutine__Group__4__Impl();

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
    // $ANTLR end "rule__Subroutine__Group__4"


    // $ANTLR start "rule__Subroutine__Group__4__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3199:1: rule__Subroutine__Group__4__Impl : ( ')' ) ;
    public final void rule__Subroutine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3203:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3204:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3204:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3205:1: ')'
            {
             before(grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Subroutine__Group__4__Impl6485); 
             after(grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Subroutine__Group__4__Impl"


    // $ANTLR start "rule__Subroutine__Group_3__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3228:1: rule__Subroutine__Group_3__0 : rule__Subroutine__Group_3__0__Impl rule__Subroutine__Group_3__1 ;
    public final void rule__Subroutine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3232:1: ( rule__Subroutine__Group_3__0__Impl rule__Subroutine__Group_3__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3233:2: rule__Subroutine__Group_3__0__Impl rule__Subroutine__Group_3__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3__0__Impl_in_rule__Subroutine__Group_3__06526);
            rule__Subroutine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group_3__1_in_rule__Subroutine__Group_3__06529);
            rule__Subroutine__Group_3__1();

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
    // $ANTLR end "rule__Subroutine__Group_3__0"


    // $ANTLR start "rule__Subroutine__Group_3__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3240:1: rule__Subroutine__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Subroutine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3244:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3245:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3245:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3246:1: '('
            {
             before(grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__Subroutine__Group_3__0__Impl6557); 
             after(grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__Subroutine__Group_3__0__Impl"


    // $ANTLR start "rule__Subroutine__Group_3__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3259:1: rule__Subroutine__Group_3__1 : rule__Subroutine__Group_3__1__Impl rule__Subroutine__Group_3__2 ;
    public final void rule__Subroutine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3263:1: ( rule__Subroutine__Group_3__1__Impl rule__Subroutine__Group_3__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3264:2: rule__Subroutine__Group_3__1__Impl rule__Subroutine__Group_3__2
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3__1__Impl_in_rule__Subroutine__Group_3__16588);
            rule__Subroutine__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group_3__2_in_rule__Subroutine__Group_3__16591);
            rule__Subroutine__Group_3__2();

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
    // $ANTLR end "rule__Subroutine__Group_3__1"


    // $ANTLR start "rule__Subroutine__Group_3__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3271:1: rule__Subroutine__Group_3__1__Impl : ( ( rule__Subroutine__Group_3_1__0 )? ) ;
    public final void rule__Subroutine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3275:1: ( ( ( rule__Subroutine__Group_3_1__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3276:1: ( ( rule__Subroutine__Group_3_1__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3276:1: ( ( rule__Subroutine__Group_3_1__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3277:1: ( rule__Subroutine__Group_3_1__0 )?
            {
             before(grammarAccess.getSubroutineAccess().getGroup_3_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3278:1: ( rule__Subroutine__Group_3_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=40 && LA26_0<=48)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3278:2: rule__Subroutine__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Subroutine__Group_3_1__0_in_rule__Subroutine__Group_3__1__Impl6618);
                    rule__Subroutine__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubroutineAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__Subroutine__Group_3__1__Impl"


    // $ANTLR start "rule__Subroutine__Group_3__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3288:1: rule__Subroutine__Group_3__2 : rule__Subroutine__Group_3__2__Impl ;
    public final void rule__Subroutine__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3292:1: ( rule__Subroutine__Group_3__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3293:2: rule__Subroutine__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3__2__Impl_in_rule__Subroutine__Group_3__26649);
            rule__Subroutine__Group_3__2__Impl();

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
    // $ANTLR end "rule__Subroutine__Group_3__2"


    // $ANTLR start "rule__Subroutine__Group_3__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3299:1: rule__Subroutine__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Subroutine__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3303:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3304:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3304:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3305:1: ')'
            {
             before(grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_3_2()); 
            match(input,24,FOLLOW_24_in_rule__Subroutine__Group_3__2__Impl6677); 
             after(grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_3_2()); 

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
    // $ANTLR end "rule__Subroutine__Group_3__2__Impl"


    // $ANTLR start "rule__Subroutine__Group_3_1__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3324:1: rule__Subroutine__Group_3_1__0 : rule__Subroutine__Group_3_1__0__Impl rule__Subroutine__Group_3_1__1 ;
    public final void rule__Subroutine__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3328:1: ( rule__Subroutine__Group_3_1__0__Impl rule__Subroutine__Group_3_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3329:2: rule__Subroutine__Group_3_1__0__Impl rule__Subroutine__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3_1__0__Impl_in_rule__Subroutine__Group_3_1__06714);
            rule__Subroutine__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group_3_1__1_in_rule__Subroutine__Group_3_1__06717);
            rule__Subroutine__Group_3_1__1();

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
    // $ANTLR end "rule__Subroutine__Group_3_1__0"


    // $ANTLR start "rule__Subroutine__Group_3_1__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3336:1: rule__Subroutine__Group_3_1__0__Impl : ( ( rule__Subroutine__ParamsAssignment_3_1_0 ) ) ;
    public final void rule__Subroutine__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3340:1: ( ( ( rule__Subroutine__ParamsAssignment_3_1_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3341:1: ( ( rule__Subroutine__ParamsAssignment_3_1_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3341:1: ( ( rule__Subroutine__ParamsAssignment_3_1_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3342:1: ( rule__Subroutine__ParamsAssignment_3_1_0 )
            {
             before(grammarAccess.getSubroutineAccess().getParamsAssignment_3_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3343:1: ( rule__Subroutine__ParamsAssignment_3_1_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3343:2: rule__Subroutine__ParamsAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Subroutine__ParamsAssignment_3_1_0_in_rule__Subroutine__Group_3_1__0__Impl6744);
            rule__Subroutine__ParamsAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSubroutineAccess().getParamsAssignment_3_1_0()); 

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
    // $ANTLR end "rule__Subroutine__Group_3_1__0__Impl"


    // $ANTLR start "rule__Subroutine__Group_3_1__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3353:1: rule__Subroutine__Group_3_1__1 : rule__Subroutine__Group_3_1__1__Impl ;
    public final void rule__Subroutine__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3357:1: ( rule__Subroutine__Group_3_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3358:2: rule__Subroutine__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3_1__1__Impl_in_rule__Subroutine__Group_3_1__16774);
            rule__Subroutine__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Subroutine__Group_3_1__1"


    // $ANTLR start "rule__Subroutine__Group_3_1__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3364:1: rule__Subroutine__Group_3_1__1__Impl : ( ( rule__Subroutine__Group_3_1_1__0 )* ) ;
    public final void rule__Subroutine__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3368:1: ( ( ( rule__Subroutine__Group_3_1_1__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3369:1: ( ( rule__Subroutine__Group_3_1_1__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3369:1: ( ( rule__Subroutine__Group_3_1_1__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3370:1: ( rule__Subroutine__Group_3_1_1__0 )*
            {
             before(grammarAccess.getSubroutineAccess().getGroup_3_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3371:1: ( rule__Subroutine__Group_3_1_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==19) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3371:2: rule__Subroutine__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Subroutine__Group_3_1_1__0_in_rule__Subroutine__Group_3_1__1__Impl6801);
            	    rule__Subroutine__Group_3_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getSubroutineAccess().getGroup_3_1_1()); 

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
    // $ANTLR end "rule__Subroutine__Group_3_1__1__Impl"


    // $ANTLR start "rule__Subroutine__Group_3_1_1__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3385:1: rule__Subroutine__Group_3_1_1__0 : rule__Subroutine__Group_3_1_1__0__Impl rule__Subroutine__Group_3_1_1__1 ;
    public final void rule__Subroutine__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3389:1: ( rule__Subroutine__Group_3_1_1__0__Impl rule__Subroutine__Group_3_1_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3390:2: rule__Subroutine__Group_3_1_1__0__Impl rule__Subroutine__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3_1_1__0__Impl_in_rule__Subroutine__Group_3_1_1__06836);
            rule__Subroutine__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group_3_1_1__1_in_rule__Subroutine__Group_3_1_1__06839);
            rule__Subroutine__Group_3_1_1__1();

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
    // $ANTLR end "rule__Subroutine__Group_3_1_1__0"


    // $ANTLR start "rule__Subroutine__Group_3_1_1__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3397:1: rule__Subroutine__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Subroutine__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3401:1: ( ( ',' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3402:1: ( ',' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3402:1: ( ',' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3403:1: ','
            {
             before(grammarAccess.getSubroutineAccess().getCommaKeyword_3_1_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Subroutine__Group_3_1_1__0__Impl6867); 
             after(grammarAccess.getSubroutineAccess().getCommaKeyword_3_1_1_0()); 

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
    // $ANTLR end "rule__Subroutine__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__Subroutine__Group_3_1_1__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3416:1: rule__Subroutine__Group_3_1_1__1 : rule__Subroutine__Group_3_1_1__1__Impl ;
    public final void rule__Subroutine__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3420:1: ( rule__Subroutine__Group_3_1_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3421:2: rule__Subroutine__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3_1_1__1__Impl_in_rule__Subroutine__Group_3_1_1__16898);
            rule__Subroutine__Group_3_1_1__1__Impl();

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
    // $ANTLR end "rule__Subroutine__Group_3_1_1__1"


    // $ANTLR start "rule__Subroutine__Group_3_1_1__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3427:1: rule__Subroutine__Group_3_1_1__1__Impl : ( ( rule__Subroutine__ParamsAssignment_3_1_1_1 ) ) ;
    public final void rule__Subroutine__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3431:1: ( ( ( rule__Subroutine__ParamsAssignment_3_1_1_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3432:1: ( ( rule__Subroutine__ParamsAssignment_3_1_1_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3432:1: ( ( rule__Subroutine__ParamsAssignment_3_1_1_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3433:1: ( rule__Subroutine__ParamsAssignment_3_1_1_1 )
            {
             before(grammarAccess.getSubroutineAccess().getParamsAssignment_3_1_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3434:1: ( rule__Subroutine__ParamsAssignment_3_1_1_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3434:2: rule__Subroutine__ParamsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Subroutine__ParamsAssignment_3_1_1_1_in_rule__Subroutine__Group_3_1_1__1__Impl6925);
            rule__Subroutine__ParamsAssignment_3_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSubroutineAccess().getParamsAssignment_3_1_1_1()); 

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
    // $ANTLR end "rule__Subroutine__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__FormalParam__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3448:1: rule__FormalParam__Group__0 : rule__FormalParam__Group__0__Impl rule__FormalParam__Group__1 ;
    public final void rule__FormalParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3452:1: ( rule__FormalParam__Group__0__Impl rule__FormalParam__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3453:2: rule__FormalParam__Group__0__Impl rule__FormalParam__Group__1
            {
            pushFollow(FOLLOW_rule__FormalParam__Group__0__Impl_in_rule__FormalParam__Group__06959);
            rule__FormalParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormalParam__Group__1_in_rule__FormalParam__Group__06962);
            rule__FormalParam__Group__1();

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
    // $ANTLR end "rule__FormalParam__Group__0"


    // $ANTLR start "rule__FormalParam__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3460:1: rule__FormalParam__Group__0__Impl : ( ( rule__FormalParam__IntentAssignment_0 )? ) ;
    public final void rule__FormalParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3464:1: ( ( ( rule__FormalParam__IntentAssignment_0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3465:1: ( ( rule__FormalParam__IntentAssignment_0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3465:1: ( ( rule__FormalParam__IntentAssignment_0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3466:1: ( rule__FormalParam__IntentAssignment_0 )?
            {
             before(grammarAccess.getFormalParamAccess().getIntentAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3467:1: ( rule__FormalParam__IntentAssignment_0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=40 && LA28_0<=42)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3467:2: rule__FormalParam__IntentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FormalParam__IntentAssignment_0_in_rule__FormalParam__Group__0__Impl6989);
                    rule__FormalParam__IntentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFormalParamAccess().getIntentAssignment_0()); 

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
    // $ANTLR end "rule__FormalParam__Group__0__Impl"


    // $ANTLR start "rule__FormalParam__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3477:1: rule__FormalParam__Group__1 : rule__FormalParam__Group__1__Impl rule__FormalParam__Group__2 ;
    public final void rule__FormalParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3481:1: ( rule__FormalParam__Group__1__Impl rule__FormalParam__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3482:2: rule__FormalParam__Group__1__Impl rule__FormalParam__Group__2
            {
            pushFollow(FOLLOW_rule__FormalParam__Group__1__Impl_in_rule__FormalParam__Group__17020);
            rule__FormalParam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormalParam__Group__2_in_rule__FormalParam__Group__17023);
            rule__FormalParam__Group__2();

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
    // $ANTLR end "rule__FormalParam__Group__1"


    // $ANTLR start "rule__FormalParam__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3489:1: rule__FormalParam__Group__1__Impl : ( ( rule__FormalParam__TypeAssignment_1 ) ) ;
    public final void rule__FormalParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3493:1: ( ( ( rule__FormalParam__TypeAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3494:1: ( ( rule__FormalParam__TypeAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3494:1: ( ( rule__FormalParam__TypeAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3495:1: ( rule__FormalParam__TypeAssignment_1 )
            {
             before(grammarAccess.getFormalParamAccess().getTypeAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3496:1: ( rule__FormalParam__TypeAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3496:2: rule__FormalParam__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__FormalParam__TypeAssignment_1_in_rule__FormalParam__Group__1__Impl7050);
            rule__FormalParam__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormalParamAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__FormalParam__Group__1__Impl"


    // $ANTLR start "rule__FormalParam__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3506:1: rule__FormalParam__Group__2 : rule__FormalParam__Group__2__Impl ;
    public final void rule__FormalParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3510:1: ( rule__FormalParam__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3511:2: rule__FormalParam__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FormalParam__Group__2__Impl_in_rule__FormalParam__Group__27080);
            rule__FormalParam__Group__2__Impl();

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
    // $ANTLR end "rule__FormalParam__Group__2"


    // $ANTLR start "rule__FormalParam__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3517:1: rule__FormalParam__Group__2__Impl : ( ( rule__FormalParam__NameAssignment_2 ) ) ;
    public final void rule__FormalParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3521:1: ( ( ( rule__FormalParam__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3522:1: ( ( rule__FormalParam__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3522:1: ( ( rule__FormalParam__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3523:1: ( rule__FormalParam__NameAssignment_2 )
            {
             before(grammarAccess.getFormalParamAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3524:1: ( rule__FormalParam__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3524:2: rule__FormalParam__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__FormalParam__NameAssignment_2_in_rule__FormalParam__Group__2__Impl7107);
            rule__FormalParam__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormalParamAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__FormalParam__Group__2__Impl"


    // $ANTLR start "rule__Type__Group_4__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3540:1: rule__Type__Group_4__0 : rule__Type__Group_4__0__Impl rule__Type__Group_4__1 ;
    public final void rule__Type__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3544:1: ( rule__Type__Group_4__0__Impl rule__Type__Group_4__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3545:2: rule__Type__Group_4__0__Impl rule__Type__Group_4__1
            {
            pushFollow(FOLLOW_rule__Type__Group_4__0__Impl_in_rule__Type__Group_4__07143);
            rule__Type__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_4__1_in_rule__Type__Group_4__07146);
            rule__Type__Group_4__1();

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
    // $ANTLR end "rule__Type__Group_4__0"


    // $ANTLR start "rule__Type__Group_4__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3552:1: rule__Type__Group_4__0__Impl : ( ( rule__Type__DoubleAssignment_4_0 ) ) ;
    public final void rule__Type__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3556:1: ( ( ( rule__Type__DoubleAssignment_4_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3557:1: ( ( rule__Type__DoubleAssignment_4_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3557:1: ( ( rule__Type__DoubleAssignment_4_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3558:1: ( rule__Type__DoubleAssignment_4_0 )
            {
             before(grammarAccess.getTypeAccess().getDoubleAssignment_4_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3559:1: ( rule__Type__DoubleAssignment_4_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3559:2: rule__Type__DoubleAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Type__DoubleAssignment_4_0_in_rule__Type__Group_4__0__Impl7173);
            rule__Type__DoubleAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getDoubleAssignment_4_0()); 

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
    // $ANTLR end "rule__Type__Group_4__0__Impl"


    // $ANTLR start "rule__Type__Group_4__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3569:1: rule__Type__Group_4__1 : rule__Type__Group_4__1__Impl ;
    public final void rule__Type__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3573:1: ( rule__Type__Group_4__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3574:2: rule__Type__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_4__1__Impl_in_rule__Type__Group_4__17203);
            rule__Type__Group_4__1__Impl();

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
    // $ANTLR end "rule__Type__Group_4__1"


    // $ANTLR start "rule__Type__Group_4__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3580:1: rule__Type__Group_4__1__Impl : ( ( 'precision' )? ) ;
    public final void rule__Type__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3584:1: ( ( ( 'precision' )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3585:1: ( ( 'precision' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3585:1: ( ( 'precision' )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3586:1: ( 'precision' )?
            {
             before(grammarAccess.getTypeAccess().getPrecisionKeyword_4_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3587:1: ( 'precision' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3588:2: 'precision'
                    {
                    match(input,29,FOLLOW_29_in_rule__Type__Group_4__1__Impl7232); 

                    }
                    break;

            }

             after(grammarAccess.getTypeAccess().getPrecisionKeyword_4_1()); 

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
    // $ANTLR end "rule__Type__Group_4__1__Impl"


    // $ANTLR start "rule__Type__Group_5__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3603:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3607:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3608:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_rule__Type__Group_5__0__Impl_in_rule__Type__Group_5__07269);
            rule__Type__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_5__1_in_rule__Type__Group_5__07272);
            rule__Type__Group_5__1();

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
    // $ANTLR end "rule__Type__Group_5__0"


    // $ANTLR start "rule__Type__Group_5__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3615:1: rule__Type__Group_5__0__Impl : ( ( rule__Type__DerivedAssignment_5_0 ) ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3619:1: ( ( ( rule__Type__DerivedAssignment_5_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3620:1: ( ( rule__Type__DerivedAssignment_5_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3620:1: ( ( rule__Type__DerivedAssignment_5_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3621:1: ( rule__Type__DerivedAssignment_5_0 )
            {
             before(grammarAccess.getTypeAccess().getDerivedAssignment_5_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3622:1: ( rule__Type__DerivedAssignment_5_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3622:2: rule__Type__DerivedAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Type__DerivedAssignment_5_0_in_rule__Type__Group_5__0__Impl7299);
            rule__Type__DerivedAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getDerivedAssignment_5_0()); 

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
    // $ANTLR end "rule__Type__Group_5__0__Impl"


    // $ANTLR start "rule__Type__Group_5__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3632:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3636:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3637:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
            {
            pushFollow(FOLLOW_rule__Type__Group_5__1__Impl_in_rule__Type__Group_5__17329);
            rule__Type__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_5__2_in_rule__Type__Group_5__17332);
            rule__Type__Group_5__2();

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
    // $ANTLR end "rule__Type__Group_5__1"


    // $ANTLR start "rule__Type__Group_5__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3644:1: rule__Type__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3648:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3649:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3649:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3650:1: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,23,FOLLOW_23_in_rule__Type__Group_5__1__Impl7360); 
             after(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_5_1()); 

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
    // $ANTLR end "rule__Type__Group_5__1__Impl"


    // $ANTLR start "rule__Type__Group_5__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3663:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl rule__Type__Group_5__3 ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3667:1: ( rule__Type__Group_5__2__Impl rule__Type__Group_5__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3668:2: rule__Type__Group_5__2__Impl rule__Type__Group_5__3
            {
            pushFollow(FOLLOW_rule__Type__Group_5__2__Impl_in_rule__Type__Group_5__27391);
            rule__Type__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_5__3_in_rule__Type__Group_5__27394);
            rule__Type__Group_5__3();

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
    // $ANTLR end "rule__Type__Group_5__2"


    // $ANTLR start "rule__Type__Group_5__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3675:1: rule__Type__Group_5__2__Impl : ( ( rule__Type__DerivedTypeAssignment_5_2 ) ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3679:1: ( ( ( rule__Type__DerivedTypeAssignment_5_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3680:1: ( ( rule__Type__DerivedTypeAssignment_5_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3680:1: ( ( rule__Type__DerivedTypeAssignment_5_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3681:1: ( rule__Type__DerivedTypeAssignment_5_2 )
            {
             before(grammarAccess.getTypeAccess().getDerivedTypeAssignment_5_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3682:1: ( rule__Type__DerivedTypeAssignment_5_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3682:2: rule__Type__DerivedTypeAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Type__DerivedTypeAssignment_5_2_in_rule__Type__Group_5__2__Impl7421);
            rule__Type__DerivedTypeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getDerivedTypeAssignment_5_2()); 

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
    // $ANTLR end "rule__Type__Group_5__2__Impl"


    // $ANTLR start "rule__Type__Group_5__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3692:1: rule__Type__Group_5__3 : rule__Type__Group_5__3__Impl ;
    public final void rule__Type__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3696:1: ( rule__Type__Group_5__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3697:2: rule__Type__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_5__3__Impl_in_rule__Type__Group_5__37451);
            rule__Type__Group_5__3__Impl();

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
    // $ANTLR end "rule__Type__Group_5__3"


    // $ANTLR start "rule__Type__Group_5__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3703:1: rule__Type__Group_5__3__Impl : ( ')' ) ;
    public final void rule__Type__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3707:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3708:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3708:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3709:1: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_5_3()); 
            match(input,24,FOLLOW_24_in_rule__Type__Group_5__3__Impl7479); 
             after(grammarAccess.getTypeAccess().getRightParenthesisKeyword_5_3()); 

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
    // $ANTLR end "rule__Type__Group_5__3__Impl"


    // $ANTLR start "rule__SubroutineName__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3730:1: rule__SubroutineName__Group__0 : rule__SubroutineName__Group__0__Impl rule__SubroutineName__Group__1 ;
    public final void rule__SubroutineName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3734:1: ( rule__SubroutineName__Group__0__Impl rule__SubroutineName__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3735:2: rule__SubroutineName__Group__0__Impl rule__SubroutineName__Group__1
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group__0__Impl_in_rule__SubroutineName__Group__07518);
            rule__SubroutineName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubroutineName__Group__1_in_rule__SubroutineName__Group__07521);
            rule__SubroutineName__Group__1();

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
    // $ANTLR end "rule__SubroutineName__Group__0"


    // $ANTLR start "rule__SubroutineName__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3742:1: rule__SubroutineName__Group__0__Impl : ( 'subroutineName' ) ;
    public final void rule__SubroutineName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3746:1: ( ( 'subroutineName' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3747:1: ( 'subroutineName' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3747:1: ( 'subroutineName' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3748:1: 'subroutineName'
            {
             before(grammarAccess.getSubroutineNameAccess().getSubroutineNameKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__SubroutineName__Group__0__Impl7549); 
             after(grammarAccess.getSubroutineNameAccess().getSubroutineNameKeyword_0()); 

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
    // $ANTLR end "rule__SubroutineName__Group__0__Impl"


    // $ANTLR start "rule__SubroutineName__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3761:1: rule__SubroutineName__Group__1 : rule__SubroutineName__Group__1__Impl rule__SubroutineName__Group__2 ;
    public final void rule__SubroutineName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3765:1: ( rule__SubroutineName__Group__1__Impl rule__SubroutineName__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3766:2: rule__SubroutineName__Group__1__Impl rule__SubroutineName__Group__2
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group__1__Impl_in_rule__SubroutineName__Group__17580);
            rule__SubroutineName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubroutineName__Group__2_in_rule__SubroutineName__Group__17583);
            rule__SubroutineName__Group__2();

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
    // $ANTLR end "rule__SubroutineName__Group__1"


    // $ANTLR start "rule__SubroutineName__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3773:1: rule__SubroutineName__Group__1__Impl : ( () ) ;
    public final void rule__SubroutineName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3777:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3778:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3778:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3779:1: ()
            {
             before(grammarAccess.getSubroutineNameAccess().getSubroutineNameAction_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3780:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3782:1: 
            {
            }

             after(grammarAccess.getSubroutineNameAccess().getSubroutineNameAction_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubroutineName__Group__1__Impl"


    // $ANTLR start "rule__SubroutineName__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3792:1: rule__SubroutineName__Group__2 : rule__SubroutineName__Group__2__Impl ;
    public final void rule__SubroutineName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3796:1: ( rule__SubroutineName__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3797:2: rule__SubroutineName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group__2__Impl_in_rule__SubroutineName__Group__27641);
            rule__SubroutineName__Group__2__Impl();

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
    // $ANTLR end "rule__SubroutineName__Group__2"


    // $ANTLR start "rule__SubroutineName__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3803:1: rule__SubroutineName__Group__2__Impl : ( ( rule__SubroutineName__Group_2__0 )? ) ;
    public final void rule__SubroutineName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3807:1: ( ( ( rule__SubroutineName__Group_2__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3808:1: ( ( rule__SubroutineName__Group_2__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3808:1: ( ( rule__SubroutineName__Group_2__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3809:1: ( rule__SubroutineName__Group_2__0 )?
            {
             before(grammarAccess.getSubroutineNameAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3810:1: ( rule__SubroutineName__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3810:2: rule__SubroutineName__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SubroutineName__Group_2__0_in_rule__SubroutineName__Group__2__Impl7668);
                    rule__SubroutineName__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubroutineNameAccess().getGroup_2()); 

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
    // $ANTLR end "rule__SubroutineName__Group__2__Impl"


    // $ANTLR start "rule__SubroutineName__Group_2__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3826:1: rule__SubroutineName__Group_2__0 : rule__SubroutineName__Group_2__0__Impl rule__SubroutineName__Group_2__1 ;
    public final void rule__SubroutineName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3830:1: ( rule__SubroutineName__Group_2__0__Impl rule__SubroutineName__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3831:2: rule__SubroutineName__Group_2__0__Impl rule__SubroutineName__Group_2__1
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group_2__0__Impl_in_rule__SubroutineName__Group_2__07705);
            rule__SubroutineName__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubroutineName__Group_2__1_in_rule__SubroutineName__Group_2__07708);
            rule__SubroutineName__Group_2__1();

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
    // $ANTLR end "rule__SubroutineName__Group_2__0"


    // $ANTLR start "rule__SubroutineName__Group_2__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3838:1: rule__SubroutineName__Group_2__0__Impl : ( '(' ) ;
    public final void rule__SubroutineName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3842:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3843:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3843:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3844:1: '('
            {
             before(grammarAccess.getSubroutineNameAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,23,FOLLOW_23_in_rule__SubroutineName__Group_2__0__Impl7736); 
             after(grammarAccess.getSubroutineNameAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__SubroutineName__Group_2__0__Impl"


    // $ANTLR start "rule__SubroutineName__Group_2__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3857:1: rule__SubroutineName__Group_2__1 : rule__SubroutineName__Group_2__1__Impl rule__SubroutineName__Group_2__2 ;
    public final void rule__SubroutineName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3861:1: ( rule__SubroutineName__Group_2__1__Impl rule__SubroutineName__Group_2__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3862:2: rule__SubroutineName__Group_2__1__Impl rule__SubroutineName__Group_2__2
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group_2__1__Impl_in_rule__SubroutineName__Group_2__17767);
            rule__SubroutineName__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubroutineName__Group_2__2_in_rule__SubroutineName__Group_2__17770);
            rule__SubroutineName__Group_2__2();

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
    // $ANTLR end "rule__SubroutineName__Group_2__1"


    // $ANTLR start "rule__SubroutineName__Group_2__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3869:1: rule__SubroutineName__Group_2__1__Impl : ( ( rule__SubroutineName__NameAssignment_2_1 ) ) ;
    public final void rule__SubroutineName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3873:1: ( ( ( rule__SubroutineName__NameAssignment_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3874:1: ( ( rule__SubroutineName__NameAssignment_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3874:1: ( ( rule__SubroutineName__NameAssignment_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3875:1: ( rule__SubroutineName__NameAssignment_2_1 )
            {
             before(grammarAccess.getSubroutineNameAccess().getNameAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3876:1: ( rule__SubroutineName__NameAssignment_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3876:2: rule__SubroutineName__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SubroutineName__NameAssignment_2_1_in_rule__SubroutineName__Group_2__1__Impl7797);
            rule__SubroutineName__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSubroutineNameAccess().getNameAssignment_2_1()); 

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
    // $ANTLR end "rule__SubroutineName__Group_2__1__Impl"


    // $ANTLR start "rule__SubroutineName__Group_2__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3886:1: rule__SubroutineName__Group_2__2 : rule__SubroutineName__Group_2__2__Impl ;
    public final void rule__SubroutineName__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3890:1: ( rule__SubroutineName__Group_2__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3891:2: rule__SubroutineName__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group_2__2__Impl_in_rule__SubroutineName__Group_2__27827);
            rule__SubroutineName__Group_2__2__Impl();

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
    // $ANTLR end "rule__SubroutineName__Group_2__2"


    // $ANTLR start "rule__SubroutineName__Group_2__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3897:1: rule__SubroutineName__Group_2__2__Impl : ( ')' ) ;
    public final void rule__SubroutineName__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3901:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3902:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3902:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3903:1: ')'
            {
             before(grammarAccess.getSubroutineNameAccess().getRightParenthesisKeyword_2_2()); 
            match(input,24,FOLLOW_24_in_rule__SubroutineName__Group_2__2__Impl7855); 
             after(grammarAccess.getSubroutineNameAccess().getRightParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__SubroutineName__Group_2__2__Impl"


    // $ANTLR start "rule__Call__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3922:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3926:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3927:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__07892);
            rule__Call__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__07895);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3934:1: rule__Call__Group__0__Impl : ( 'call' ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3938:1: ( ( 'call' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3939:1: ( 'call' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3939:1: ( 'call' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3940:1: 'call'
            {
             before(grammarAccess.getCallAccess().getCallKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Call__Group__0__Impl7923); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3953:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3957:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3958:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__17954);
            rule__Call__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__2_in_rule__Call__Group__17957);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3965:1: rule__Call__Group__1__Impl : ( '(' ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3969:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3970:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3970:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3971:1: '('
            {
             before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__Call__Group__1__Impl7985); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3984:1: rule__Call__Group__2 : rule__Call__Group__2__Impl rule__Call__Group__3 ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3988:1: ( rule__Call__Group__2__Impl rule__Call__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3989:2: rule__Call__Group__2__Impl rule__Call__Group__3
            {
            pushFollow(FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__28016);
            rule__Call__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__3_in_rule__Call__Group__28019);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3996:1: rule__Call__Group__2__Impl : ( ( rule__Call__SubroutineNameAssignment_2 ) ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4000:1: ( ( ( rule__Call__SubroutineNameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4001:1: ( ( rule__Call__SubroutineNameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4001:1: ( ( rule__Call__SubroutineNameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4002:1: ( rule__Call__SubroutineNameAssignment_2 )
            {
             before(grammarAccess.getCallAccess().getSubroutineNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4003:1: ( rule__Call__SubroutineNameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4003:2: rule__Call__SubroutineNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Call__SubroutineNameAssignment_2_in_rule__Call__Group__2__Impl8046);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4013:1: rule__Call__Group__3 : rule__Call__Group__3__Impl rule__Call__Group__4 ;
    public final void rule__Call__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4017:1: ( rule__Call__Group__3__Impl rule__Call__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4018:2: rule__Call__Group__3__Impl rule__Call__Group__4
            {
            pushFollow(FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__38076);
            rule__Call__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__4_in_rule__Call__Group__38079);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4025:1: rule__Call__Group__3__Impl : ( ( rule__Call__Group_3__0 )? ) ;
    public final void rule__Call__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4029:1: ( ( ( rule__Call__Group_3__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4030:1: ( ( rule__Call__Group_3__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4030:1: ( ( rule__Call__Group_3__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4031:1: ( rule__Call__Group_3__0 )?
            {
             before(grammarAccess.getCallAccess().getGroup_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4032:1: ( rule__Call__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==23) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4032:2: rule__Call__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl8106);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4042:1: rule__Call__Group__4 : rule__Call__Group__4__Impl ;
    public final void rule__Call__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4046:1: ( rule__Call__Group__4__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4047:2: rule__Call__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__48137);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4053:1: rule__Call__Group__4__Impl : ( ')' ) ;
    public final void rule__Call__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4057:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4058:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4058:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4059:1: ')'
            {
             before(grammarAccess.getCallAccess().getRightParenthesisKeyword_4()); 
            match(input,24,FOLLOW_24_in_rule__Call__Group__4__Impl8165); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4082:1: rule__Call__Group_3__0 : rule__Call__Group_3__0__Impl rule__Call__Group_3__1 ;
    public final void rule__Call__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4086:1: ( rule__Call__Group_3__0__Impl rule__Call__Group_3__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4087:2: rule__Call__Group_3__0__Impl rule__Call__Group_3__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__08206);
            rule__Call__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__08209);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4094:1: rule__Call__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Call__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4098:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4099:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4099:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4100:1: '('
            {
             before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,23,FOLLOW_23_in_rule__Call__Group_3__0__Impl8237); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4113:1: rule__Call__Group_3__1 : rule__Call__Group_3__1__Impl rule__Call__Group_3__2 ;
    public final void rule__Call__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4117:1: ( rule__Call__Group_3__1__Impl rule__Call__Group_3__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4118:2: rule__Call__Group_3__1__Impl rule__Call__Group_3__2
            {
            pushFollow(FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__18268);
            rule__Call__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3__2_in_rule__Call__Group_3__18271);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4125:1: rule__Call__Group_3__1__Impl : ( ( rule__Call__Group_3_1__0 )? ) ;
    public final void rule__Call__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4129:1: ( ( ( rule__Call__Group_3_1__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4130:1: ( ( rule__Call__Group_3_1__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4130:1: ( ( rule__Call__Group_3_1__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4131:1: ( rule__Call__Group_3_1__0 )?
            {
             before(grammarAccess.getCallAccess().getGroup_3_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4132:1: ( rule__Call__Group_3_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||LA32_0==32||LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4132:2: rule__Call__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Call__Group_3_1__0_in_rule__Call__Group_3__1__Impl8298);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4142:1: rule__Call__Group_3__2 : rule__Call__Group_3__2__Impl ;
    public final void rule__Call__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4146:1: ( rule__Call__Group_3__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4147:2: rule__Call__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3__2__Impl_in_rule__Call__Group_3__28329);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4153:1: rule__Call__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Call__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4157:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4158:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4158:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4159:1: ')'
            {
             before(grammarAccess.getCallAccess().getRightParenthesisKeyword_3_2()); 
            match(input,24,FOLLOW_24_in_rule__Call__Group_3__2__Impl8357); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4178:1: rule__Call__Group_3_1__0 : rule__Call__Group_3_1__0__Impl rule__Call__Group_3_1__1 ;
    public final void rule__Call__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4182:1: ( rule__Call__Group_3_1__0__Impl rule__Call__Group_3_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4183:2: rule__Call__Group_3_1__0__Impl rule__Call__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1__0__Impl_in_rule__Call__Group_3_1__08394);
            rule__Call__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3_1__1_in_rule__Call__Group_3_1__08397);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4190:1: rule__Call__Group_3_1__0__Impl : ( ( rule__Call__ParamsAssignment_3_1_0 ) ) ;
    public final void rule__Call__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4194:1: ( ( ( rule__Call__ParamsAssignment_3_1_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4195:1: ( ( rule__Call__ParamsAssignment_3_1_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4195:1: ( ( rule__Call__ParamsAssignment_3_1_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4196:1: ( rule__Call__ParamsAssignment_3_1_0 )
            {
             before(grammarAccess.getCallAccess().getParamsAssignment_3_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4197:1: ( rule__Call__ParamsAssignment_3_1_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4197:2: rule__Call__ParamsAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Call__ParamsAssignment_3_1_0_in_rule__Call__Group_3_1__0__Impl8424);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4207:1: rule__Call__Group_3_1__1 : rule__Call__Group_3_1__1__Impl ;
    public final void rule__Call__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4211:1: ( rule__Call__Group_3_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4212:2: rule__Call__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1__1__Impl_in_rule__Call__Group_3_1__18454);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4218:1: rule__Call__Group_3_1__1__Impl : ( ( rule__Call__Group_3_1_1__0 )* ) ;
    public final void rule__Call__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4222:1: ( ( ( rule__Call__Group_3_1_1__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4223:1: ( ( rule__Call__Group_3_1_1__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4223:1: ( ( rule__Call__Group_3_1_1__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4224:1: ( rule__Call__Group_3_1_1__0 )*
            {
             before(grammarAccess.getCallAccess().getGroup_3_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4225:1: ( rule__Call__Group_3_1_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==19) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4225:2: rule__Call__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Call__Group_3_1_1__0_in_rule__Call__Group_3_1__1__Impl8481);
            	    rule__Call__Group_3_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4239:1: rule__Call__Group_3_1_1__0 : rule__Call__Group_3_1_1__0__Impl rule__Call__Group_3_1_1__1 ;
    public final void rule__Call__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4243:1: ( rule__Call__Group_3_1_1__0__Impl rule__Call__Group_3_1_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4244:2: rule__Call__Group_3_1_1__0__Impl rule__Call__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1_1__0__Impl_in_rule__Call__Group_3_1_1__08516);
            rule__Call__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3_1_1__1_in_rule__Call__Group_3_1_1__08519);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4251:1: rule__Call__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Call__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4255:1: ( ( ',' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4256:1: ( ',' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4256:1: ( ',' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4257:1: ','
            {
             before(grammarAccess.getCallAccess().getCommaKeyword_3_1_1_0()); 
            match(input,19,FOLLOW_19_in_rule__Call__Group_3_1_1__0__Impl8547); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4270:1: rule__Call__Group_3_1_1__1 : rule__Call__Group_3_1_1__1__Impl ;
    public final void rule__Call__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4274:1: ( rule__Call__Group_3_1_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4275:2: rule__Call__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1_1__1__Impl_in_rule__Call__Group_3_1_1__18578);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4281:1: rule__Call__Group_3_1_1__1__Impl : ( ( rule__Call__ParamsAssignment_3_1_1_1 ) ) ;
    public final void rule__Call__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4285:1: ( ( ( rule__Call__ParamsAssignment_3_1_1_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4286:1: ( ( rule__Call__ParamsAssignment_3_1_1_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4286:1: ( ( rule__Call__ParamsAssignment_3_1_1_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4287:1: ( rule__Call__ParamsAssignment_3_1_1_1 )
            {
             before(grammarAccess.getCallAccess().getParamsAssignment_3_1_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4288:1: ( rule__Call__ParamsAssignment_3_1_1_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4288:2: rule__Call__ParamsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Call__ParamsAssignment_3_1_1_1_in_rule__Call__Group_3_1_1__1__Impl8605);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4302:1: rule__ActualParam__Group__0 : rule__ActualParam__Group__0__Impl rule__ActualParam__Group__1 ;
    public final void rule__ActualParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4306:1: ( rule__ActualParam__Group__0__Impl rule__ActualParam__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4307:2: rule__ActualParam__Group__0__Impl rule__ActualParam__Group__1
            {
            pushFollow(FOLLOW_rule__ActualParam__Group__0__Impl_in_rule__ActualParam__Group__08639);
            rule__ActualParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParam__Group__1_in_rule__ActualParam__Group__08642);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4314:1: rule__ActualParam__Group__0__Impl : ( ( rule__ActualParam__Group_0__0 )? ) ;
    public final void rule__ActualParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4318:1: ( ( ( rule__ActualParam__Group_0__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4319:1: ( ( rule__ActualParam__Group_0__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4319:1: ( ( rule__ActualParam__Group_0__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4320:1: ( rule__ActualParam__Group_0__0 )?
            {
             before(grammarAccess.getActualParamAccess().getGroup_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4321:1: ( rule__ActualParam__Group_0__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==20||LA34_1==49) ) {
                    alt34=1;
                }
            }
            switch (alt34) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4321:2: rule__ActualParam__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ActualParam__Group_0__0_in_rule__ActualParam__Group__0__Impl8669);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4331:1: rule__ActualParam__Group__1 : rule__ActualParam__Group__1__Impl ;
    public final void rule__ActualParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4335:1: ( rule__ActualParam__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4336:2: rule__ActualParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActualParam__Group__1__Impl_in_rule__ActualParam__Group__18700);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4342:1: rule__ActualParam__Group__1__Impl : ( ( rule__ActualParam__ValueAssignment_1 ) ) ;
    public final void rule__ActualParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4346:1: ( ( ( rule__ActualParam__ValueAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4347:1: ( ( rule__ActualParam__ValueAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4347:1: ( ( rule__ActualParam__ValueAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4348:1: ( rule__ActualParam__ValueAssignment_1 )
            {
             before(grammarAccess.getActualParamAccess().getValueAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4349:1: ( rule__ActualParam__ValueAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4349:2: rule__ActualParam__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__ActualParam__ValueAssignment_1_in_rule__ActualParam__Group__1__Impl8727);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4363:1: rule__ActualParam__Group_0__0 : rule__ActualParam__Group_0__0__Impl rule__ActualParam__Group_0__1 ;
    public final void rule__ActualParam__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4367:1: ( rule__ActualParam__Group_0__0__Impl rule__ActualParam__Group_0__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4368:2: rule__ActualParam__Group_0__0__Impl rule__ActualParam__Group_0__1
            {
            pushFollow(FOLLOW_rule__ActualParam__Group_0__0__Impl_in_rule__ActualParam__Group_0__08761);
            rule__ActualParam__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParam__Group_0__1_in_rule__ActualParam__Group_0__08764);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4375:1: rule__ActualParam__Group_0__0__Impl : ( ( rule__ActualParam__KeywordAssignment_0_0 ) ) ;
    public final void rule__ActualParam__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4379:1: ( ( ( rule__ActualParam__KeywordAssignment_0_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4380:1: ( ( rule__ActualParam__KeywordAssignment_0_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4380:1: ( ( rule__ActualParam__KeywordAssignment_0_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4381:1: ( rule__ActualParam__KeywordAssignment_0_0 )
            {
             before(grammarAccess.getActualParamAccess().getKeywordAssignment_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4382:1: ( rule__ActualParam__KeywordAssignment_0_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4382:2: rule__ActualParam__KeywordAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ActualParam__KeywordAssignment_0_0_in_rule__ActualParam__Group_0__0__Impl8791);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4392:1: rule__ActualParam__Group_0__1 : rule__ActualParam__Group_0__1__Impl rule__ActualParam__Group_0__2 ;
    public final void rule__ActualParam__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4396:1: ( rule__ActualParam__Group_0__1__Impl rule__ActualParam__Group_0__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4397:2: rule__ActualParam__Group_0__1__Impl rule__ActualParam__Group_0__2
            {
            pushFollow(FOLLOW_rule__ActualParam__Group_0__1__Impl_in_rule__ActualParam__Group_0__18821);
            rule__ActualParam__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParam__Group_0__2_in_rule__ActualParam__Group_0__18824);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4404:1: rule__ActualParam__Group_0__1__Impl : ( ( rule__ActualParam__OptionalAssignment_0_1 )? ) ;
    public final void rule__ActualParam__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4408:1: ( ( ( rule__ActualParam__OptionalAssignment_0_1 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4409:1: ( ( rule__ActualParam__OptionalAssignment_0_1 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4409:1: ( ( rule__ActualParam__OptionalAssignment_0_1 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4410:1: ( rule__ActualParam__OptionalAssignment_0_1 )?
            {
             before(grammarAccess.getActualParamAccess().getOptionalAssignment_0_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4411:1: ( rule__ActualParam__OptionalAssignment_0_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==49) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4411:2: rule__ActualParam__OptionalAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__ActualParam__OptionalAssignment_0_1_in_rule__ActualParam__Group_0__1__Impl8851);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4421:1: rule__ActualParam__Group_0__2 : rule__ActualParam__Group_0__2__Impl ;
    public final void rule__ActualParam__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4425:1: ( rule__ActualParam__Group_0__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4426:2: rule__ActualParam__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ActualParam__Group_0__2__Impl_in_rule__ActualParam__Group_0__28882);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4432:1: rule__ActualParam__Group_0__2__Impl : ( '=' ) ;
    public final void rule__ActualParam__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4436:1: ( ( '=' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4437:1: ( '=' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4437:1: ( '=' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4438:1: '='
            {
             before(grammarAccess.getActualParamAccess().getEqualsSignKeyword_0_2()); 
            match(input,20,FOLLOW_20_in_rule__ActualParam__Group_0__2__Impl8910); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4457:1: rule__PathExpr__Group__0 : rule__PathExpr__Group__0__Impl rule__PathExpr__Group__1 ;
    public final void rule__PathExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4461:1: ( rule__PathExpr__Group__0__Impl rule__PathExpr__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4462:2: rule__PathExpr__Group__0__Impl rule__PathExpr__Group__1
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__0__Impl_in_rule__PathExpr__Group__08947);
            rule__PathExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExpr__Group__1_in_rule__PathExpr__Group__08950);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4469:1: rule__PathExpr__Group__0__Impl : ( '#' ) ;
    public final void rule__PathExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4473:1: ( ( '#' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4474:1: ( '#' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4474:1: ( '#' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4475:1: '#'
            {
             before(grammarAccess.getPathExprAccess().getNumberSignKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__PathExpr__Group__0__Impl8978); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4488:1: rule__PathExpr__Group__1 : rule__PathExpr__Group__1__Impl rule__PathExpr__Group__2 ;
    public final void rule__PathExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4492:1: ( rule__PathExpr__Group__1__Impl rule__PathExpr__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4493:2: rule__PathExpr__Group__1__Impl rule__PathExpr__Group__2
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__1__Impl_in_rule__PathExpr__Group__19009);
            rule__PathExpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExpr__Group__2_in_rule__PathExpr__Group__19012);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4500:1: rule__PathExpr__Group__1__Impl : ( ( rule__PathExpr__SegmentsAssignment_1 ) ) ;
    public final void rule__PathExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4504:1: ( ( ( rule__PathExpr__SegmentsAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4505:1: ( ( rule__PathExpr__SegmentsAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4505:1: ( ( rule__PathExpr__SegmentsAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4506:1: ( rule__PathExpr__SegmentsAssignment_1 )
            {
             before(grammarAccess.getPathExprAccess().getSegmentsAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4507:1: ( rule__PathExpr__SegmentsAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4507:2: rule__PathExpr__SegmentsAssignment_1
            {
            pushFollow(FOLLOW_rule__PathExpr__SegmentsAssignment_1_in_rule__PathExpr__Group__1__Impl9039);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4517:1: rule__PathExpr__Group__2 : rule__PathExpr__Group__2__Impl ;
    public final void rule__PathExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4521:1: ( rule__PathExpr__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4522:2: rule__PathExpr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__2__Impl_in_rule__PathExpr__Group__29069);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4528:1: rule__PathExpr__Group__2__Impl : ( ( rule__PathExpr__Group_2__0 )* ) ;
    public final void rule__PathExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4532:1: ( ( ( rule__PathExpr__Group_2__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4533:1: ( ( rule__PathExpr__Group_2__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4533:1: ( ( rule__PathExpr__Group_2__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4534:1: ( rule__PathExpr__Group_2__0 )*
            {
             before(grammarAccess.getPathExprAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4535:1: ( rule__PathExpr__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==33) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4535:2: rule__PathExpr__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__PathExpr__Group_2__0_in_rule__PathExpr__Group__2__Impl9096);
            	    rule__PathExpr__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4551:1: rule__PathExpr__Group_2__0 : rule__PathExpr__Group_2__0__Impl rule__PathExpr__Group_2__1 ;
    public final void rule__PathExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4555:1: ( rule__PathExpr__Group_2__0__Impl rule__PathExpr__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4556:2: rule__PathExpr__Group_2__0__Impl rule__PathExpr__Group_2__1
            {
            pushFollow(FOLLOW_rule__PathExpr__Group_2__0__Impl_in_rule__PathExpr__Group_2__09133);
            rule__PathExpr__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExpr__Group_2__1_in_rule__PathExpr__Group_2__09136);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4563:1: rule__PathExpr__Group_2__0__Impl : ( '/' ) ;
    public final void rule__PathExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4567:1: ( ( '/' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4568:1: ( '/' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4568:1: ( '/' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4569:1: '/'
            {
             before(grammarAccess.getPathExprAccess().getSolidusKeyword_2_0()); 
            match(input,33,FOLLOW_33_in_rule__PathExpr__Group_2__0__Impl9164); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4582:1: rule__PathExpr__Group_2__1 : rule__PathExpr__Group_2__1__Impl ;
    public final void rule__PathExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4586:1: ( rule__PathExpr__Group_2__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4587:2: rule__PathExpr__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__PathExpr__Group_2__1__Impl_in_rule__PathExpr__Group_2__19195);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4593:1: rule__PathExpr__Group_2__1__Impl : ( ( rule__PathExpr__SegmentsAssignment_2_1 ) ) ;
    public final void rule__PathExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4597:1: ( ( ( rule__PathExpr__SegmentsAssignment_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4598:1: ( ( rule__PathExpr__SegmentsAssignment_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4598:1: ( ( rule__PathExpr__SegmentsAssignment_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4599:1: ( rule__PathExpr__SegmentsAssignment_2_1 )
            {
             before(grammarAccess.getPathExprAccess().getSegmentsAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4600:1: ( rule__PathExpr__SegmentsAssignment_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4600:2: rule__PathExpr__SegmentsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__PathExpr__SegmentsAssignment_2_1_in_rule__PathExpr__Group_2__1__Impl9222);
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


    // $ANTLR start "rule__Language__NameAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4615:1: rule__Language__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Language__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4619:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4620:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4620:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4621:1: RULE_ID
            {
             before(grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Language__NameAssignment_19261); 
             after(grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Language__NameAssignment_1"


    // $ANTLR start "rule__Language__UriAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4630:1: rule__Language__UriAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Language__UriAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4634:1: ( ( RULE_STRING ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4635:1: ( RULE_STRING )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4635:1: ( RULE_STRING )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4636:1: RULE_STRING
            {
             before(grammarAccess.getLanguageAccess().getUriSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Language__UriAssignment_29292); 
             after(grammarAccess.getLanguageAccess().getUriSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Language__UriAssignment_2"


    // $ANTLR start "rule__Language__ConceptDefAssignment_4"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4645:1: rule__Language__ConceptDefAssignment_4 : ( ruleConceptDef ) ;
    public final void rule__Language__ConceptDefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4649:1: ( ( ruleConceptDef ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4650:1: ( ruleConceptDef )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4650:1: ( ruleConceptDef )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4651:1: ruleConceptDef
            {
             before(grammarAccess.getLanguageAccess().getConceptDefConceptDefParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleConceptDef_in_rule__Language__ConceptDefAssignment_49323);
            ruleConceptDef();

            state._fsp--;

             after(grammarAccess.getLanguageAccess().getConceptDefConceptDefParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Language__ConceptDefAssignment_4"


    // $ANTLR start "rule__Subconcept__AttribAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4660:1: rule__Subconcept__AttribAssignment_0 : ( ( 'attrib' ) ) ;
    public final void rule__Subconcept__AttribAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4664:1: ( ( ( 'attrib' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4665:1: ( ( 'attrib' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4665:1: ( ( 'attrib' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4666:1: ( 'attrib' )
            {
             before(grammarAccess.getSubconceptAccess().getAttribAttribKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4667:1: ( 'attrib' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4668:1: 'attrib'
            {
             before(grammarAccess.getSubconceptAccess().getAttribAttribKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__Subconcept__AttribAssignment_09359); 
             after(grammarAccess.getSubconceptAccess().getAttribAttribKeyword_0_0()); 

            }

             after(grammarAccess.getSubconceptAccess().getAttribAttribKeyword_0_0()); 

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
    // $ANTLR end "rule__Subconcept__AttribAssignment_0"


    // $ANTLR start "rule__Subconcept__NameAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4683:1: rule__Subconcept__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Subconcept__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4687:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4688:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4688:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4689:1: RULE_ID
            {
             before(grammarAccess.getSubconceptAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Subconcept__NameAssignment_19398); 
             after(grammarAccess.getSubconceptAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Subconcept__NameAssignment_1"


    // $ANTLR start "rule__Subconcept__CardinalityAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4698:1: rule__Subconcept__CardinalityAssignment_2 : ( ruleCardinality ) ;
    public final void rule__Subconcept__CardinalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4702:1: ( ( ruleCardinality ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4703:1: ( ruleCardinality )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4703:1: ( ruleCardinality )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4704:1: ruleCardinality
            {
             before(grammarAccess.getSubconceptAccess().getCardinalityCardinalityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Subconcept__CardinalityAssignment_29429);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getSubconceptAccess().getCardinalityCardinalityParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Subconcept__CardinalityAssignment_2"


    // $ANTLR start "rule__Subconcept__EssentialAssignment_3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4713:1: rule__Subconcept__EssentialAssignment_3 : ( ( '!' ) ) ;
    public final void rule__Subconcept__EssentialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4717:1: ( ( ( '!' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4718:1: ( ( '!' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4718:1: ( ( '!' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4719:1: ( '!' )
            {
             before(grammarAccess.getSubconceptAccess().getEssentialExclamationMarkKeyword_3_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4720:1: ( '!' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4721:1: '!'
            {
             before(grammarAccess.getSubconceptAccess().getEssentialExclamationMarkKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__Subconcept__EssentialAssignment_39465); 
             after(grammarAccess.getSubconceptAccess().getEssentialExclamationMarkKeyword_3_0()); 

            }

             after(grammarAccess.getSubconceptAccess().getEssentialExclamationMarkKeyword_3_0()); 

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
    // $ANTLR end "rule__Subconcept__EssentialAssignment_3"


    // $ANTLR start "rule__Subconcept__RefAssignment_4_0_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4736:1: rule__Subconcept__RefAssignment_4_0_0 : ( ( ':' ) ) ;
    public final void rule__Subconcept__RefAssignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4740:1: ( ( ( ':' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4741:1: ( ( ':' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4741:1: ( ( ':' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4742:1: ( ':' )
            {
             before(grammarAccess.getSubconceptAccess().getRefColonKeyword_4_0_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4743:1: ( ':' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4744:1: ':'
            {
             before(grammarAccess.getSubconceptAccess().getRefColonKeyword_4_0_0_0()); 
            match(input,36,FOLLOW_36_in_rule__Subconcept__RefAssignment_4_0_09509); 
             after(grammarAccess.getSubconceptAccess().getRefColonKeyword_4_0_0_0()); 

            }

             after(grammarAccess.getSubconceptAccess().getRefColonKeyword_4_0_0_0()); 

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
    // $ANTLR end "rule__Subconcept__RefAssignment_4_0_0"


    // $ANTLR start "rule__Subconcept__ConceptDefAssignment_4_0_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4759:1: rule__Subconcept__ConceptDefAssignment_4_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Subconcept__ConceptDefAssignment_4_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4763:1: ( ( ( RULE_ID ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4764:1: ( ( RULE_ID ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4764:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4765:1: ( RULE_ID )
            {
             before(grammarAccess.getSubconceptAccess().getConceptDefConceptDefCrossReference_4_0_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4766:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4767:1: RULE_ID
            {
             before(grammarAccess.getSubconceptAccess().getConceptDefConceptDefIDTerminalRuleCall_4_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Subconcept__ConceptDefAssignment_4_0_19552); 
             after(grammarAccess.getSubconceptAccess().getConceptDefConceptDefIDTerminalRuleCall_4_0_1_0_1()); 

            }

             after(grammarAccess.getSubconceptAccess().getConceptDefConceptDefCrossReference_4_0_1_0()); 

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
    // $ANTLR end "rule__Subconcept__ConceptDefAssignment_4_0_1"


    // $ANTLR start "rule__Subconcept__MappingAssignment_4_1_0_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4778:1: rule__Subconcept__MappingAssignment_4_1_0_1 : ( ruleMapping ) ;
    public final void rule__Subconcept__MappingAssignment_4_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4782:1: ( ( ruleMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4783:1: ( ruleMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4783:1: ( ruleMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4784:1: ruleMapping
            {
             before(grammarAccess.getSubconceptAccess().getMappingMappingParserRuleCall_4_1_0_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__Subconcept__MappingAssignment_4_1_0_19587);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getSubconceptAccess().getMappingMappingParserRuleCall_4_1_0_1_0()); 

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
    // $ANTLR end "rule__Subconcept__MappingAssignment_4_1_0_1"


    // $ANTLR start "rule__Subconcept__AnnotationAssignment_4_1_1_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4793:1: rule__Subconcept__AnnotationAssignment_4_1_1_1 : ( ruleAnnotation ) ;
    public final void rule__Subconcept__AnnotationAssignment_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4797:1: ( ( ruleAnnotation ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4798:1: ( ruleAnnotation )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4798:1: ( ruleAnnotation )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4799:1: ruleAnnotation
            {
             before(grammarAccess.getSubconceptAccess().getAnnotationAnnotationParserRuleCall_4_1_1_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Subconcept__AnnotationAssignment_4_1_1_19618);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getSubconceptAccess().getAnnotationAnnotationParserRuleCall_4_1_1_1_0()); 

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
    // $ANTLR end "rule__Subconcept__AnnotationAssignment_4_1_1_1"


    // $ANTLR start "rule__Subconcept__AnnotationAssignment_4_1_1_2_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4808:1: rule__Subconcept__AnnotationAssignment_4_1_1_2_1 : ( ruleAnnotation ) ;
    public final void rule__Subconcept__AnnotationAssignment_4_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4812:1: ( ( ruleAnnotation ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4813:1: ( ruleAnnotation )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4813:1: ( ruleAnnotation )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4814:1: ruleAnnotation
            {
             before(grammarAccess.getSubconceptAccess().getAnnotationAnnotationParserRuleCall_4_1_1_2_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Subconcept__AnnotationAssignment_4_1_1_2_19649);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getSubconceptAccess().getAnnotationAnnotationParserRuleCall_4_1_1_2_1_0()); 

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
    // $ANTLR end "rule__Subconcept__AnnotationAssignment_4_1_1_2_1"


    // $ANTLR start "rule__Subconcept__BodyAssignment_4_1_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4823:1: rule__Subconcept__BodyAssignment_4_1_2 : ( ruleConceptDefBody ) ;
    public final void rule__Subconcept__BodyAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4827:1: ( ( ruleConceptDefBody ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4828:1: ( ruleConceptDefBody )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4828:1: ( ruleConceptDefBody )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4829:1: ruleConceptDefBody
            {
             before(grammarAccess.getSubconceptAccess().getBodyConceptDefBodyParserRuleCall_4_1_2_0()); 
            pushFollow(FOLLOW_ruleConceptDefBody_in_rule__Subconcept__BodyAssignment_4_1_29680);
            ruleConceptDefBody();

            state._fsp--;

             after(grammarAccess.getSubconceptAccess().getBodyConceptDefBodyParserRuleCall_4_1_2_0()); 

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
    // $ANTLR end "rule__Subconcept__BodyAssignment_4_1_2"


    // $ANTLR start "rule__Annotation__KeyAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4838:1: rule__Annotation__KeyAssignment_0 : ( RULE_ID ) ;
    public final void rule__Annotation__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4842:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4843:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4843:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4844:1: RULE_ID
            {
             before(grammarAccess.getAnnotationAccess().getKeyIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Annotation__KeyAssignment_09711); 
             after(grammarAccess.getAnnotationAccess().getKeyIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Annotation__KeyAssignment_0"


    // $ANTLR start "rule__Annotation__ValueAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4853:1: rule__Annotation__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4857:1: ( ( RULE_STRING ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4858:1: ( RULE_STRING )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4858:1: ( RULE_STRING )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4859:1: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_29742); 
             after(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Annotation__ValueAssignment_2"


    // $ANTLR start "rule__ConceptDef__TopAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4868:1: rule__ConceptDef__TopAssignment_0 : ( ( 'top' ) ) ;
    public final void rule__ConceptDef__TopAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4872:1: ( ( ( 'top' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4873:1: ( ( 'top' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4873:1: ( ( 'top' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4874:1: ( 'top' )
            {
             before(grammarAccess.getConceptDefAccess().getTopTopKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4875:1: ( 'top' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4876:1: 'top'
            {
             before(grammarAccess.getConceptDefAccess().getTopTopKeyword_0_0()); 
            match(input,37,FOLLOW_37_in_rule__ConceptDef__TopAssignment_09778); 
             after(grammarAccess.getConceptDefAccess().getTopTopKeyword_0_0()); 

            }

             after(grammarAccess.getConceptDefAccess().getTopTopKeyword_0_0()); 

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
    // $ANTLR end "rule__ConceptDef__TopAssignment_0"


    // $ANTLR start "rule__ConceptDef__NameAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4891:1: rule__ConceptDef__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ConceptDef__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4895:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4896:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4896:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4897:1: RULE_ID
            {
             before(grammarAccess.getConceptDefAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConceptDef__NameAssignment_29817); 
             after(grammarAccess.getConceptDefAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ConceptDef__NameAssignment_2"


    // $ANTLR start "rule__ConceptDef__MappingAssignment_3_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4906:1: rule__ConceptDef__MappingAssignment_3_1 : ( ruleMapping ) ;
    public final void rule__ConceptDef__MappingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4910:1: ( ( ruleMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4911:1: ( ruleMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4911:1: ( ruleMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4912:1: ruleMapping
            {
             before(grammarAccess.getConceptDefAccess().getMappingMappingParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__ConceptDef__MappingAssignment_3_19848);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getConceptDefAccess().getMappingMappingParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ConceptDef__MappingAssignment_3_1"


    // $ANTLR start "rule__ConceptDef__AnnotationAssignment_4_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4921:1: rule__ConceptDef__AnnotationAssignment_4_1 : ( ruleAnnotation ) ;
    public final void rule__ConceptDef__AnnotationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4925:1: ( ( ruleAnnotation ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4926:1: ( ruleAnnotation )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4926:1: ( ruleAnnotation )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4927:1: ruleAnnotation
            {
             before(grammarAccess.getConceptDefAccess().getAnnotationAnnotationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__ConceptDef__AnnotationAssignment_4_19879);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getConceptDefAccess().getAnnotationAnnotationParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__ConceptDef__AnnotationAssignment_4_1"


    // $ANTLR start "rule__ConceptDef__AnnotationAssignment_4_2_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4936:1: rule__ConceptDef__AnnotationAssignment_4_2_1 : ( ruleAnnotation ) ;
    public final void rule__ConceptDef__AnnotationAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4940:1: ( ( ruleAnnotation ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4941:1: ( ruleAnnotation )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4941:1: ( ruleAnnotation )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4942:1: ruleAnnotation
            {
             before(grammarAccess.getConceptDefAccess().getAnnotationAnnotationParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__ConceptDef__AnnotationAssignment_4_2_19910);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getConceptDefAccess().getAnnotationAnnotationParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__ConceptDef__AnnotationAssignment_4_2_1"


    // $ANTLR start "rule__ConceptDef__BodyAssignment_5"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4951:1: rule__ConceptDef__BodyAssignment_5 : ( ruleConceptDefBody ) ;
    public final void rule__ConceptDef__BodyAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4955:1: ( ( ruleConceptDefBody ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4956:1: ( ruleConceptDefBody )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4956:1: ( ruleConceptDefBody )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4957:1: ruleConceptDefBody
            {
             before(grammarAccess.getConceptDefAccess().getBodyConceptDefBodyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleConceptDefBody_in_rule__ConceptDef__BodyAssignment_59941);
            ruleConceptDefBody();

            state._fsp--;

             after(grammarAccess.getConceptDefAccess().getBodyConceptDefBodyParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ConceptDef__BodyAssignment_5"


    // $ANTLR start "rule__ConceptDefBody__SubconceptAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4966:1: rule__ConceptDefBody__SubconceptAssignment_1 : ( ruleSubconcept ) ;
    public final void rule__ConceptDefBody__SubconceptAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4970:1: ( ( ruleSubconcept ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4971:1: ( ruleSubconcept )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4971:1: ( ruleSubconcept )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4972:1: ruleSubconcept
            {
             before(grammarAccess.getConceptDefBodyAccess().getSubconceptSubconceptParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSubconcept_in_rule__ConceptDefBody__SubconceptAssignment_19972);
            ruleSubconcept();

            state._fsp--;

             after(grammarAccess.getConceptDefBodyAccess().getSubconceptSubconceptParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConceptDefBody__SubconceptAssignment_1"


    // $ANTLR start "rule__ConceptDefBody__SubconceptAssignment_2_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4981:1: rule__ConceptDefBody__SubconceptAssignment_2_1 : ( ruleSubconcept ) ;
    public final void rule__ConceptDefBody__SubconceptAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4985:1: ( ( ruleSubconcept ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4986:1: ( ruleSubconcept )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4986:1: ( ruleSubconcept )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4987:1: ruleSubconcept
            {
             before(grammarAccess.getConceptDefBodyAccess().getSubconceptSubconceptParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSubconcept_in_rule__ConceptDefBody__SubconceptAssignment_2_110003);
            ruleSubconcept();

            state._fsp--;

             after(grammarAccess.getConceptDefBodyAccess().getSubconceptSubconceptParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__ConceptDefBody__SubconceptAssignment_2_1"


    // $ANTLR start "rule__Cardinality__ZeroOrMoreAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4996:1: rule__Cardinality__ZeroOrMoreAssignment_0 : ( ( '*' ) ) ;
    public final void rule__Cardinality__ZeroOrMoreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5000:1: ( ( ( '*' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5001:1: ( ( '*' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5001:1: ( ( '*' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5002:1: ( '*' )
            {
             before(grammarAccess.getCardinalityAccess().getZeroOrMoreAsteriskKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5003:1: ( '*' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5004:1: '*'
            {
             before(grammarAccess.getCardinalityAccess().getZeroOrMoreAsteriskKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__Cardinality__ZeroOrMoreAssignment_010039); 
             after(grammarAccess.getCardinalityAccess().getZeroOrMoreAsteriskKeyword_0_0()); 

            }

             after(grammarAccess.getCardinalityAccess().getZeroOrMoreAsteriskKeyword_0_0()); 

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
    // $ANTLR end "rule__Cardinality__ZeroOrMoreAssignment_0"


    // $ANTLR start "rule__Cardinality__OneOrMoreAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5019:1: rule__Cardinality__OneOrMoreAssignment_1 : ( ( '+' ) ) ;
    public final void rule__Cardinality__OneOrMoreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5023:1: ( ( ( '+' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5024:1: ( ( '+' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5024:1: ( ( '+' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5025:1: ( '+' )
            {
             before(grammarAccess.getCardinalityAccess().getOneOrMorePlusSignKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5026:1: ( '+' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5027:1: '+'
            {
             before(grammarAccess.getCardinalityAccess().getOneOrMorePlusSignKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__Cardinality__OneOrMoreAssignment_110083); 
             after(grammarAccess.getCardinalityAccess().getOneOrMorePlusSignKeyword_1_0()); 

            }

             after(grammarAccess.getCardinalityAccess().getOneOrMorePlusSignKeyword_1_0()); 

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
    // $ANTLR end "rule__Cardinality__OneOrMoreAssignment_1"


    // $ANTLR start "rule__Mapping__ContextAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5042:1: rule__Mapping__ContextAssignment_0 : ( rulePathExpr ) ;
    public final void rule__Mapping__ContextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5046:1: ( ( rulePathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5047:1: ( rulePathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5047:1: ( rulePathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5048:1: rulePathExpr
            {
             before(grammarAccess.getMappingAccess().getContextPathExprParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePathExpr_in_rule__Mapping__ContextAssignment_010122);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5057:1: rule__Mapping__MappingAssignment_1 : ( ruleImplicitContextMapping ) ;
    public final void rule__Mapping__MappingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5061:1: ( ( ruleImplicitContextMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5062:1: ( ruleImplicitContextMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5062:1: ( ruleImplicitContextMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5063:1: ruleImplicitContextMapping
            {
             before(grammarAccess.getMappingAccess().getMappingImplicitContextMappingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_rule__Mapping__MappingAssignment_110153);
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


    // $ANTLR start "rule__Module__NameAssignment_2_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5072:1: rule__Module__NameAssignment_2_1 : ( ruleIDOrPathExpr ) ;
    public final void rule__Module__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5076:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5077:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5077:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5078:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getModuleAccess().getNameIDOrPathExprParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__Module__NameAssignment_2_110184);
            ruleIDOrPathExpr();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getNameIDOrPathExprParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Module__NameAssignment_2_1"


    // $ANTLR start "rule__UsesModule__NameAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5087:1: rule__UsesModule__NameAssignment_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__UsesModule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5091:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5092:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5092:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5093:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getUsesModuleAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__UsesModule__NameAssignment_210215);
            ruleIDOrPathExpr();

            state._fsp--;

             after(grammarAccess.getUsesModuleAccess().getNameIDOrPathExprParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__UsesModule__NameAssignment_2"


    // $ANTLR start "rule__UsesEntity__NameAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5102:1: rule__UsesEntity__NameAssignment_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__UsesEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5106:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5107:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5107:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5108:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getUsesEntityAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__UsesEntity__NameAssignment_210246);
            ruleIDOrPathExpr();

            state._fsp--;

             after(grammarAccess.getUsesEntityAccess().getNameIDOrPathExprParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__UsesEntity__NameAssignment_2"


    // $ANTLR start "rule__Subroutine__NameAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5117:1: rule__Subroutine__NameAssignment_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__Subroutine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5121:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5122:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5122:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5123:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getSubroutineAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__Subroutine__NameAssignment_210277);
            ruleIDOrPathExpr();

            state._fsp--;

             after(grammarAccess.getSubroutineAccess().getNameIDOrPathExprParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Subroutine__NameAssignment_2"


    // $ANTLR start "rule__Subroutine__ParamsAssignment_3_1_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5132:1: rule__Subroutine__ParamsAssignment_3_1_0 : ( ruleFormalParam ) ;
    public final void rule__Subroutine__ParamsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5136:1: ( ( ruleFormalParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5137:1: ( ruleFormalParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5137:1: ( ruleFormalParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5138:1: ruleFormalParam
            {
             before(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleFormalParam_in_rule__Subroutine__ParamsAssignment_3_1_010308);
            ruleFormalParam();

            state._fsp--;

             after(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_0_0()); 

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
    // $ANTLR end "rule__Subroutine__ParamsAssignment_3_1_0"


    // $ANTLR start "rule__Subroutine__ParamsAssignment_3_1_1_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5147:1: rule__Subroutine__ParamsAssignment_3_1_1_1 : ( ruleFormalParam ) ;
    public final void rule__Subroutine__ParamsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5151:1: ( ( ruleFormalParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5152:1: ( ruleFormalParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5152:1: ( ruleFormalParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5153:1: ruleFormalParam
            {
             before(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_ruleFormalParam_in_rule__Subroutine__ParamsAssignment_3_1_1_110339);
            ruleFormalParam();

            state._fsp--;

             after(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_1_1_0()); 

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
    // $ANTLR end "rule__Subroutine__ParamsAssignment_3_1_1_1"


    // $ANTLR start "rule__FormalParam__IntentAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5162:1: rule__FormalParam__IntentAssignment_0 : ( ruleIntent ) ;
    public final void rule__FormalParam__IntentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5166:1: ( ( ruleIntent ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5167:1: ( ruleIntent )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5167:1: ( ruleIntent )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5168:1: ruleIntent
            {
             before(grammarAccess.getFormalParamAccess().getIntentIntentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIntent_in_rule__FormalParam__IntentAssignment_010370);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getFormalParamAccess().getIntentIntentParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FormalParam__IntentAssignment_0"


    // $ANTLR start "rule__FormalParam__TypeAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5177:1: rule__FormalParam__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__FormalParam__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5181:1: ( ( ruleType ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5182:1: ( ruleType )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5182:1: ( ruleType )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5183:1: ruleType
            {
             before(grammarAccess.getFormalParamAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__FormalParam__TypeAssignment_110401);
            ruleType();

            state._fsp--;

             after(grammarAccess.getFormalParamAccess().getTypeTypeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FormalParam__TypeAssignment_1"


    // $ANTLR start "rule__FormalParam__NameAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5192:1: rule__FormalParam__NameAssignment_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__FormalParam__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5196:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5197:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5197:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5198:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getFormalParamAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__FormalParam__NameAssignment_210432);
            ruleIDOrPathExpr();

            state._fsp--;

             after(grammarAccess.getFormalParamAccess().getNameIDOrPathExprParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FormalParam__NameAssignment_2"


    // $ANTLR start "rule__Intent__InAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5207:1: rule__Intent__InAssignment_0 : ( ( 'in' ) ) ;
    public final void rule__Intent__InAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5211:1: ( ( ( 'in' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5212:1: ( ( 'in' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5212:1: ( ( 'in' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5213:1: ( 'in' )
            {
             before(grammarAccess.getIntentAccess().getInInKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5214:1: ( 'in' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5215:1: 'in'
            {
             before(grammarAccess.getIntentAccess().getInInKeyword_0_0()); 
            match(input,40,FOLLOW_40_in_rule__Intent__InAssignment_010468); 
             after(grammarAccess.getIntentAccess().getInInKeyword_0_0()); 

            }

             after(grammarAccess.getIntentAccess().getInInKeyword_0_0()); 

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
    // $ANTLR end "rule__Intent__InAssignment_0"


    // $ANTLR start "rule__Intent__OutAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5230:1: rule__Intent__OutAssignment_1 : ( ( 'out' ) ) ;
    public final void rule__Intent__OutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5234:1: ( ( ( 'out' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5235:1: ( ( 'out' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5235:1: ( ( 'out' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5236:1: ( 'out' )
            {
             before(grammarAccess.getIntentAccess().getOutOutKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5237:1: ( 'out' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5238:1: 'out'
            {
             before(grammarAccess.getIntentAccess().getOutOutKeyword_1_0()); 
            match(input,41,FOLLOW_41_in_rule__Intent__OutAssignment_110512); 
             after(grammarAccess.getIntentAccess().getOutOutKeyword_1_0()); 

            }

             after(grammarAccess.getIntentAccess().getOutOutKeyword_1_0()); 

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
    // $ANTLR end "rule__Intent__OutAssignment_1"


    // $ANTLR start "rule__Intent__InoutAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5253:1: rule__Intent__InoutAssignment_2 : ( ( 'inout' ) ) ;
    public final void rule__Intent__InoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5257:1: ( ( ( 'inout' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5258:1: ( ( 'inout' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5258:1: ( ( 'inout' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5259:1: ( 'inout' )
            {
             before(grammarAccess.getIntentAccess().getInoutInoutKeyword_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5260:1: ( 'inout' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5261:1: 'inout'
            {
             before(grammarAccess.getIntentAccess().getInoutInoutKeyword_2_0()); 
            match(input,42,FOLLOW_42_in_rule__Intent__InoutAssignment_210556); 
             after(grammarAccess.getIntentAccess().getInoutInoutKeyword_2_0()); 

            }

             after(grammarAccess.getIntentAccess().getInoutInoutKeyword_2_0()); 

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
    // $ANTLR end "rule__Intent__InoutAssignment_2"


    // $ANTLR start "rule__Type__IntegerAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5276:1: rule__Type__IntegerAssignment_0 : ( ( 'integer' ) ) ;
    public final void rule__Type__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5280:1: ( ( ( 'integer' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5281:1: ( ( 'integer' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5281:1: ( ( 'integer' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5282:1: ( 'integer' )
            {
             before(grammarAccess.getTypeAccess().getIntegerIntegerKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5283:1: ( 'integer' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5284:1: 'integer'
            {
             before(grammarAccess.getTypeAccess().getIntegerIntegerKeyword_0_0()); 
            match(input,43,FOLLOW_43_in_rule__Type__IntegerAssignment_010600); 
             after(grammarAccess.getTypeAccess().getIntegerIntegerKeyword_0_0()); 

            }

             after(grammarAccess.getTypeAccess().getIntegerIntegerKeyword_0_0()); 

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
    // $ANTLR end "rule__Type__IntegerAssignment_0"


    // $ANTLR start "rule__Type__CharacterAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5299:1: rule__Type__CharacterAssignment_1 : ( ( 'character' ) ) ;
    public final void rule__Type__CharacterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5303:1: ( ( ( 'character' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5304:1: ( ( 'character' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5304:1: ( ( 'character' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5305:1: ( 'character' )
            {
             before(grammarAccess.getTypeAccess().getCharacterCharacterKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5306:1: ( 'character' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5307:1: 'character'
            {
             before(grammarAccess.getTypeAccess().getCharacterCharacterKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__Type__CharacterAssignment_110644); 
             after(grammarAccess.getTypeAccess().getCharacterCharacterKeyword_1_0()); 

            }

             after(grammarAccess.getTypeAccess().getCharacterCharacterKeyword_1_0()); 

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
    // $ANTLR end "rule__Type__CharacterAssignment_1"


    // $ANTLR start "rule__Type__LogicalAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5322:1: rule__Type__LogicalAssignment_2 : ( ( 'logical' ) ) ;
    public final void rule__Type__LogicalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5326:1: ( ( ( 'logical' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5327:1: ( ( 'logical' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5327:1: ( ( 'logical' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5328:1: ( 'logical' )
            {
             before(grammarAccess.getTypeAccess().getLogicalLogicalKeyword_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5329:1: ( 'logical' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5330:1: 'logical'
            {
             before(grammarAccess.getTypeAccess().getLogicalLogicalKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__Type__LogicalAssignment_210688); 
             after(grammarAccess.getTypeAccess().getLogicalLogicalKeyword_2_0()); 

            }

             after(grammarAccess.getTypeAccess().getLogicalLogicalKeyword_2_0()); 

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
    // $ANTLR end "rule__Type__LogicalAssignment_2"


    // $ANTLR start "rule__Type__RealAssignment_3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5345:1: rule__Type__RealAssignment_3 : ( ( 'real' ) ) ;
    public final void rule__Type__RealAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5349:1: ( ( ( 'real' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5350:1: ( ( 'real' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5350:1: ( ( 'real' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5351:1: ( 'real' )
            {
             before(grammarAccess.getTypeAccess().getRealRealKeyword_3_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5352:1: ( 'real' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5353:1: 'real'
            {
             before(grammarAccess.getTypeAccess().getRealRealKeyword_3_0()); 
            match(input,46,FOLLOW_46_in_rule__Type__RealAssignment_310732); 
             after(grammarAccess.getTypeAccess().getRealRealKeyword_3_0()); 

            }

             after(grammarAccess.getTypeAccess().getRealRealKeyword_3_0()); 

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
    // $ANTLR end "rule__Type__RealAssignment_3"


    // $ANTLR start "rule__Type__DoubleAssignment_4_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5368:1: rule__Type__DoubleAssignment_4_0 : ( ( 'double' ) ) ;
    public final void rule__Type__DoubleAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5372:1: ( ( ( 'double' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5373:1: ( ( 'double' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5373:1: ( ( 'double' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5374:1: ( 'double' )
            {
             before(grammarAccess.getTypeAccess().getDoubleDoubleKeyword_4_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5375:1: ( 'double' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5376:1: 'double'
            {
             before(grammarAccess.getTypeAccess().getDoubleDoubleKeyword_4_0_0()); 
            match(input,47,FOLLOW_47_in_rule__Type__DoubleAssignment_4_010776); 
             after(grammarAccess.getTypeAccess().getDoubleDoubleKeyword_4_0_0()); 

            }

             after(grammarAccess.getTypeAccess().getDoubleDoubleKeyword_4_0_0()); 

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
    // $ANTLR end "rule__Type__DoubleAssignment_4_0"


    // $ANTLR start "rule__Type__DerivedAssignment_5_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5391:1: rule__Type__DerivedAssignment_5_0 : ( ( 'type' ) ) ;
    public final void rule__Type__DerivedAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5395:1: ( ( ( 'type' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5396:1: ( ( 'type' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5396:1: ( ( 'type' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5397:1: ( 'type' )
            {
             before(grammarAccess.getTypeAccess().getDerivedTypeKeyword_5_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5398:1: ( 'type' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5399:1: 'type'
            {
             before(grammarAccess.getTypeAccess().getDerivedTypeKeyword_5_0_0()); 
            match(input,48,FOLLOW_48_in_rule__Type__DerivedAssignment_5_010820); 
             after(grammarAccess.getTypeAccess().getDerivedTypeKeyword_5_0_0()); 

            }

             after(grammarAccess.getTypeAccess().getDerivedTypeKeyword_5_0_0()); 

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
    // $ANTLR end "rule__Type__DerivedAssignment_5_0"


    // $ANTLR start "rule__Type__DerivedTypeAssignment_5_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5414:1: rule__Type__DerivedTypeAssignment_5_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__Type__DerivedTypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5418:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5419:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5419:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5420:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getTypeAccess().getDerivedTypeIDOrPathExprParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__Type__DerivedTypeAssignment_5_210859);
            ruleIDOrPathExpr();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getDerivedTypeIDOrPathExprParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Type__DerivedTypeAssignment_5_2"


    // $ANTLR start "rule__SubroutineName__NameAssignment_2_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5429:1: rule__SubroutineName__NameAssignment_2_1 : ( ruleIDOrPathExpr ) ;
    public final void rule__SubroutineName__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5433:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5434:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5434:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5435:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getSubroutineNameAccess().getNameIDOrPathExprParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__SubroutineName__NameAssignment_2_110890);
            ruleIDOrPathExpr();

            state._fsp--;

             after(grammarAccess.getSubroutineNameAccess().getNameIDOrPathExprParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__SubroutineName__NameAssignment_2_1"


    // $ANTLR start "rule__Call__SubroutineNameAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5444:1: rule__Call__SubroutineNameAssignment_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__Call__SubroutineNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5448:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5449:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5449:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5450:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getCallAccess().getSubroutineNameIDOrPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__Call__SubroutineNameAssignment_210921);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5459:1: rule__Call__ParamsAssignment_3_1_0 : ( ruleActualParam ) ;
    public final void rule__Call__ParamsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5463:1: ( ( ruleActualParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5464:1: ( ruleActualParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5464:1: ( ruleActualParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5465:1: ruleActualParam
            {
             before(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_010952);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5474:1: rule__Call__ParamsAssignment_3_1_1_1 : ( ruleActualParam ) ;
    public final void rule__Call__ParamsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5478:1: ( ( ruleActualParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5479:1: ( ruleActualParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5479:1: ( ruleActualParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5480:1: ruleActualParam
            {
             before(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_1_110983);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5489:1: rule__ActualParam__KeywordAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__ActualParam__KeywordAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5493:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5494:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5494:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5495:1: RULE_ID
            {
             before(grammarAccess.getActualParamAccess().getKeywordIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActualParam__KeywordAssignment_0_011014); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5504:1: rule__ActualParam__OptionalAssignment_0_1 : ( ( '?' ) ) ;
    public final void rule__ActualParam__OptionalAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5508:1: ( ( ( '?' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5509:1: ( ( '?' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5509:1: ( ( '?' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5510:1: ( '?' )
            {
             before(grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5511:1: ( '?' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5512:1: '?'
            {
             before(grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0()); 
            match(input,49,FOLLOW_49_in_rule__ActualParam__OptionalAssignment_0_111050); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5527:1: rule__ActualParam__ValueAssignment_1 : ( ruleIDOrPathExpr ) ;
    public final void rule__ActualParam__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5531:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5532:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5532:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5533:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getActualParamAccess().getValueIDOrPathExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__ActualParam__ValueAssignment_111089);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5542:1: rule__IDOrWildcard__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__IDOrWildcard__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5546:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5547:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5547:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5548:1: RULE_ID
            {
             before(grammarAccess.getIDOrWildcardAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IDOrWildcard__IdAssignment_011120); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5557:1: rule__IDOrWildcard__WildcardAssignment_1 : ( ( '*' ) ) ;
    public final void rule__IDOrWildcard__WildcardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5561:1: ( ( ( '*' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5562:1: ( ( '*' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5562:1: ( ( '*' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5563:1: ( '*' )
            {
             before(grammarAccess.getIDOrWildcardAccess().getWildcardAsteriskKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5564:1: ( '*' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5565:1: '*'
            {
             before(grammarAccess.getIDOrWildcardAccess().getWildcardAsteriskKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__IDOrWildcard__WildcardAssignment_111156); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5580:1: rule__PathExpr__SegmentsAssignment_1 : ( rulePathSegment ) ;
    public final void rule__PathExpr__SegmentsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5584:1: ( ( rulePathSegment ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5585:1: ( rulePathSegment )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5585:1: ( rulePathSegment )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5586:1: rulePathSegment
            {
             before(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePathSegment_in_rule__PathExpr__SegmentsAssignment_111195);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5595:1: rule__PathExpr__SegmentsAssignment_2_1 : ( rulePathSegment ) ;
    public final void rule__PathExpr__SegmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5599:1: ( ( rulePathSegment ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5600:1: ( rulePathSegment )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5600:1: ( rulePathSegment )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5601:1: rulePathSegment
            {
             before(grammarAccess.getPathExprAccess().getSegmentsPathSegmentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_rulePathSegment_in_rule__PathExpr__SegmentsAssignment_2_111226);
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


 

    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__0_in_ruleLanguage94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconcept_in_entryRuleSubconcept121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubconcept128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__0_in_ruleSubconcept154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConceptDef_in_entryRuleConceptDef241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConceptDef248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group__0_in_ruleConceptDef274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConceptDefBody_in_entryRuleConceptDefBody301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConceptDefBody308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDefBody__Group__0_in_ruleConceptDefBody334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Alternatives_in_ruleCardinality394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0_in_ruleMapping454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_entryRuleImplicitContextMapping481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitContextMapping488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImplicitContextMapping__Alternatives_in_ruleImplicitContextMapping514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleName_in_entryRuleModuleName601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleName608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleName__Group__0_in_ruleModuleName634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesModule_in_entryRuleUsesModule661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsesModule668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__0_in_ruleUsesModule694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesEntity_in_entryRuleUsesEntity721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsesEntity728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__0_in_ruleUsesEntity754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_entryRuleSubroutine781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutine788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__0_in_ruleSubroutine814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalParam_in_entryRuleFormalParam841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalParam848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__0_in_ruleFormalParam874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_entryRuleIntent901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntent908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__Alternatives_in_ruleIntent934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutineName_in_entryRuleSubroutineName1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutineName1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__0_in_ruleSubroutineName1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0_in_ruleCall1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_entryRuleActualParam1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualParam1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__0_in_ruleActualParam1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrWildcard_in_entryRuleIDOrWildcard1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrWildcard1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrWildcard__Alternatives_in_ruleIDOrWildcard1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_entryRuleIDOrPathExpr1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrPathExpr1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrPathExpr__Alternatives_in_ruleIDOrPathExpr1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_entryRulePathExpr1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExpr1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__0_in_rulePathExpr1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegment_in_entryRulePathSegment1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathSegment1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathSegment__Alternatives_in_rulePathSegment1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_0__0_in_rule__Subconcept__Alternatives_41450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1__0_in_rule__Subconcept__Alternatives_41468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__ZeroOrMoreAssignment_0_in_rule__Cardinality__Alternatives1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__OneOrMoreAssignment_1_in_rule__Cardinality__Alternatives1519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__ImplicitContextMapping__Alternatives1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleName_in_rule__ImplicitContextMapping__Alternatives1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesModule_in_rule__ImplicitContextMapping__Alternatives1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesEntity_in_rule__ImplicitContextMapping__Alternatives1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__ImplicitContextMapping__Alternatives1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_rule__ImplicitContextMapping__Alternatives1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutineName_in_rule__ImplicitContextMapping__Alternatives1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__InAssignment_0_in_rule__Intent__Alternatives1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__OutAssignment_1_in_rule__Intent__Alternatives1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__InoutAssignment_2_in_rule__Intent__Alternatives1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__IntegerAssignment_0_in_rule__Type__Alternatives1755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__CharacterAssignment_1_in_rule__Type__Alternatives1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__LogicalAssignment_2_in_rule__Type__Alternatives1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__RealAssignment_3_in_rule__Type__Alternatives1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__0_in_rule__Type__Alternatives1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__0_in_rule__Type__Alternatives1845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrWildcard__IdAssignment_0_in_rule__IDOrWildcard__Alternatives1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrWildcard__WildcardAssignment_1_in_rule__IDOrWildcard__Alternatives1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrWildcard_in_rule__IDOrPathExpr__Alternatives1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_rule__IDOrPathExpr__Alternatives1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PathSegment__Alternatives1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathSegment__Alternatives1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__0__Impl_in_rule__Language__Group__02028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Language__Group__1_in_rule__Language__Group__02031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Language__Group__0__Impl2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__1__Impl_in_rule__Language__Group__12090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Language__Group__2_in_rule__Language__Group__12093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__NameAssignment_1_in_rule__Language__Group__1__Impl2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__2__Impl_in_rule__Language__Group__22150 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Language__Group__3_in_rule__Language__Group__22153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__UriAssignment_2_in_rule__Language__Group__2__Impl2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__3__Impl_in_rule__Language__Group__32210 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_rule__Language__Group__4_in_rule__Language__Group__32213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Language__Group__3__Impl2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__4__Impl_in_rule__Language__Group__42272 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Language__Group__5_in_rule__Language__Group__42275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__ConceptDefAssignment_4_in_rule__Language__Group__4__Impl2304 = new BitSet(new long[]{0x0000002000200002L});
    public static final BitSet FOLLOW_rule__Language__ConceptDefAssignment_4_in_rule__Language__Group__4__Impl2316 = new BitSet(new long[]{0x0000002000200002L});
    public static final BitSet FOLLOW_rule__Language__Group__5__Impl_in_rule__Language__Group__52349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Language__Group__5__Impl2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__0__Impl_in_rule__Subconcept__Group__02420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__1_in_rule__Subconcept__Group__02423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__AttribAssignment_0_in_rule__Subconcept__Group__0__Impl2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__1__Impl_in_rule__Subconcept__Group__12481 = new BitSet(new long[]{0x000000D80002A000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__2_in_rule__Subconcept__Group__12484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__NameAssignment_1_in_rule__Subconcept__Group__1__Impl2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__2__Impl_in_rule__Subconcept__Group__22541 = new BitSet(new long[]{0x000000D80002A000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__3_in_rule__Subconcept__Group__22544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__CardinalityAssignment_2_in_rule__Subconcept__Group__2__Impl2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__3__Impl_in_rule__Subconcept__Group__32602 = new BitSet(new long[]{0x000000D80002A000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__4_in_rule__Subconcept__Group__32605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__EssentialAssignment_3_in_rule__Subconcept__Group__3__Impl2632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__4__Impl_in_rule__Subconcept__Group__42663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Alternatives_4_in_rule__Subconcept__Group__4__Impl2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_0__0__Impl_in_rule__Subconcept__Group_4_0__02730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_0__1_in_rule__Subconcept__Group_4_0__02733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__RefAssignment_4_0_0_in_rule__Subconcept__Group_4_0__0__Impl2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_0__1__Impl_in_rule__Subconcept__Group_4_0__12790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__ConceptDefAssignment_4_0_1_in_rule__Subconcept__Group_4_0__1__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1__0__Impl_in_rule__Subconcept__Group_4_1__02851 = new BitSet(new long[]{0x000000D80002A000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1__1_in_rule__Subconcept__Group_4_1__02854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_0__0_in_rule__Subconcept__Group_4_1__0__Impl2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1__1__Impl_in_rule__Subconcept__Group_4_1__12912 = new BitSet(new long[]{0x000000D80002A000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1__2_in_rule__Subconcept__Group_4_1__12915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_1__0_in_rule__Subconcept__Group_4_1__1__Impl2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1__2__Impl_in_rule__Subconcept__Group_4_1__22973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__BodyAssignment_4_1_2_in_rule__Subconcept__Group_4_1__2__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_0__0__Impl_in_rule__Subconcept__Group_4_1_0__03037 = new BitSet(new long[]{0x00000001DE400000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_0__1_in_rule__Subconcept__Group_4_1_0__03040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Subconcept__Group_4_1_0__0__Impl3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_0__1__Impl_in_rule__Subconcept__Group_4_1_0__13099 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_0__2_in_rule__Subconcept__Group_4_1_0__13102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__MappingAssignment_4_1_0_1_in_rule__Subconcept__Group_4_1_0__1__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_0__2__Impl_in_rule__Subconcept__Group_4_1_0__23159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Subconcept__Group_4_1_0__2__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_1__0__Impl_in_rule__Subconcept__Group_4_1_1__03224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_1__1_in_rule__Subconcept__Group_4_1_1__03227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Subconcept__Group_4_1_1__0__Impl3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_1__1__Impl_in_rule__Subconcept__Group_4_1_1__13286 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_1__2_in_rule__Subconcept__Group_4_1_1__13289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__AnnotationAssignment_4_1_1_1_in_rule__Subconcept__Group_4_1_1__1__Impl3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_1__2__Impl_in_rule__Subconcept__Group_4_1_1__23346 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_1__3_in_rule__Subconcept__Group_4_1_1__23349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_1_2__0_in_rule__Subconcept__Group_4_1_1__2__Impl3376 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_1__3__Impl_in_rule__Subconcept__Group_4_1_1__33407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Subconcept__Group_4_1_1__3__Impl3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_1_2__0__Impl_in_rule__Subconcept__Group_4_1_1_2__03474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_1_2__1_in_rule__Subconcept__Group_4_1_1_2__03477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Subconcept__Group_4_1_1_2__0__Impl3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_4_1_1_2__1__Impl_in_rule__Subconcept__Group_4_1_1_2__13536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__AnnotationAssignment_4_1_1_2_1_in_rule__Subconcept__Group_4_1_1_2__1__Impl3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03597 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__KeyAssignment_0_in_rule__Annotation__Group__0__Impl3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13657 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__13660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Annotation__Group__1__Impl3688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__23719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValueAssignment_2_in_rule__Annotation__Group__2__Impl3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group__0__Impl_in_rule__ConceptDef__Group__03782 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group__1_in_rule__ConceptDef__Group__03785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__TopAssignment_0_in_rule__ConceptDef__Group__0__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group__1__Impl_in_rule__ConceptDef__Group__13843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group__2_in_rule__ConceptDef__Group__13846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ConceptDef__Group__1__Impl3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group__2__Impl_in_rule__ConceptDef__Group__23905 = new BitSet(new long[]{0x000000000002A000L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group__3_in_rule__ConceptDef__Group__23908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__NameAssignment_2_in_rule__ConceptDef__Group__2__Impl3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group__3__Impl_in_rule__ConceptDef__Group__33965 = new BitSet(new long[]{0x000000000002A000L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group__4_in_rule__ConceptDef__Group__33968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_3__0_in_rule__ConceptDef__Group__3__Impl3995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group__4__Impl_in_rule__ConceptDef__Group__44026 = new BitSet(new long[]{0x000000000002A000L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group__5_in_rule__ConceptDef__Group__44029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_4__0_in_rule__ConceptDef__Group__4__Impl4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group__5__Impl_in_rule__ConceptDef__Group__54087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__BodyAssignment_5_in_rule__ConceptDef__Group__5__Impl4114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_3__0__Impl_in_rule__ConceptDef__Group_3__04157 = new BitSet(new long[]{0x00000001DE400000L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_3__1_in_rule__ConceptDef__Group_3__04160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ConceptDef__Group_3__0__Impl4188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_3__1__Impl_in_rule__ConceptDef__Group_3__14219 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_3__2_in_rule__ConceptDef__Group_3__14222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__MappingAssignment_3_1_in_rule__ConceptDef__Group_3__1__Impl4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_3__2__Impl_in_rule__ConceptDef__Group_3__24279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ConceptDef__Group_3__2__Impl4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_4__0__Impl_in_rule__ConceptDef__Group_4__04344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_4__1_in_rule__ConceptDef__Group_4__04347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ConceptDef__Group_4__0__Impl4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_4__1__Impl_in_rule__ConceptDef__Group_4__14406 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_4__2_in_rule__ConceptDef__Group_4__14409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__AnnotationAssignment_4_1_in_rule__ConceptDef__Group_4__1__Impl4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_4__2__Impl_in_rule__ConceptDef__Group_4__24466 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_4__3_in_rule__ConceptDef__Group_4__24469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_4_2__0_in_rule__ConceptDef__Group_4__2__Impl4496 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_4__3__Impl_in_rule__ConceptDef__Group_4__34527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ConceptDef__Group_4__3__Impl4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_4_2__0__Impl_in_rule__ConceptDef__Group_4_2__04594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_4_2__1_in_rule__ConceptDef__Group_4_2__04597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ConceptDef__Group_4_2__0__Impl4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__Group_4_2__1__Impl_in_rule__ConceptDef__Group_4_2__14656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDef__AnnotationAssignment_4_2_1_in_rule__ConceptDef__Group_4_2__1__Impl4683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDefBody__Group__0__Impl_in_rule__ConceptDefBody__Group__04717 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__ConceptDefBody__Group__1_in_rule__ConceptDefBody__Group__04720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ConceptDefBody__Group__0__Impl4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDefBody__Group__1__Impl_in_rule__ConceptDefBody__Group__14779 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_rule__ConceptDefBody__Group__2_in_rule__ConceptDefBody__Group__14782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDefBody__SubconceptAssignment_1_in_rule__ConceptDefBody__Group__1__Impl4809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDefBody__Group__2__Impl_in_rule__ConceptDefBody__Group__24839 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_rule__ConceptDefBody__Group__3_in_rule__ConceptDefBody__Group__24842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDefBody__Group_2__0_in_rule__ConceptDefBody__Group__2__Impl4869 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__ConceptDefBody__Group__3__Impl_in_rule__ConceptDefBody__Group__34900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ConceptDefBody__Group__3__Impl4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDefBody__Group_2__0__Impl_in_rule__ConceptDefBody__Group_2__04967 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rule__ConceptDefBody__Group_2__1_in_rule__ConceptDefBody__Group_2__04970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ConceptDefBody__Group_2__0__Impl4998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDefBody__Group_2__1__Impl_in_rule__ConceptDefBody__Group_2__15029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConceptDefBody__SubconceptAssignment_2_1_in_rule__ConceptDefBody__Group_2__1__Impl5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__05090 = new BitSet(new long[]{0x00000001DE400000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__05093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__ContextAssignment_0_in_rule__Mapping__Group__0__Impl5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__15151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__MappingAssignment_1_in_rule__Mapping__Group__1__Impl5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__05212 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__05215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__15273 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__15276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Module__Group__1__Impl5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__25335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__0_in_rule__Module__Group__2__Impl5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__0__Impl_in_rule__Module__Group_2__05399 = new BitSet(new long[]{0x0000004100000010L});
    public static final BitSet FOLLOW_rule__Module__Group_2__1_in_rule__Module__Group_2__05402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Module__Group_2__0__Impl5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__1__Impl_in_rule__Module__Group_2__15461 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Module__Group_2__2_in_rule__Module__Group_2__15464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_2_1_in_rule__Module__Group_2__1__Impl5491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__2__Impl_in_rule__Module__Group_2__25521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Module__Group_2__2__Impl5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleName__Group__0__Impl_in_rule__ModuleName__Group__05586 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__ModuleName__Group__1_in_rule__ModuleName__Group__05589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleName__Group__1__Impl_in_rule__ModuleName__Group__15647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ModuleName__Group__1__Impl5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__0__Impl_in_rule__UsesModule__Group__05710 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__1_in_rule__UsesModule__Group__05713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__UsesModule__Group__0__Impl5741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__1__Impl_in_rule__UsesModule__Group__15772 = new BitSet(new long[]{0x0000004100000010L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__2_in_rule__UsesModule__Group__15775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UsesModule__Group__1__Impl5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__2__Impl_in_rule__UsesModule__Group__25834 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__3_in_rule__UsesModule__Group__25837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__NameAssignment_2_in_rule__UsesModule__Group__2__Impl5864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__3__Impl_in_rule__UsesModule__Group__35894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UsesModule__Group__3__Impl5922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__0__Impl_in_rule__UsesEntity__Group__05961 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__1_in_rule__UsesEntity__Group__05964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__UsesEntity__Group__0__Impl5992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__1__Impl_in_rule__UsesEntity__Group__16023 = new BitSet(new long[]{0x0000004100000010L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__2_in_rule__UsesEntity__Group__16026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UsesEntity__Group__1__Impl6054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__2__Impl_in_rule__UsesEntity__Group__26085 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__3_in_rule__UsesEntity__Group__26088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__NameAssignment_2_in_rule__UsesEntity__Group__2__Impl6115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__3__Impl_in_rule__UsesEntity__Group__36145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UsesEntity__Group__3__Impl6173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__0__Impl_in_rule__Subroutine__Group__06212 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__1_in_rule__Subroutine__Group__06215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Subroutine__Group__0__Impl6243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__1__Impl_in_rule__Subroutine__Group__16274 = new BitSet(new long[]{0x0000004100000010L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__2_in_rule__Subroutine__Group__16277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Subroutine__Group__1__Impl6305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__2__Impl_in_rule__Subroutine__Group__26336 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__3_in_rule__Subroutine__Group__26339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__NameAssignment_2_in_rule__Subroutine__Group__2__Impl6366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__3__Impl_in_rule__Subroutine__Group__36396 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__4_in_rule__Subroutine__Group__36399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__0_in_rule__Subroutine__Group__3__Impl6426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__4__Impl_in_rule__Subroutine__Group__46457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Subroutine__Group__4__Impl6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__0__Impl_in_rule__Subroutine__Group_3__06526 = new BitSet(new long[]{0x0001FF0001000000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__1_in_rule__Subroutine__Group_3__06529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Subroutine__Group_3__0__Impl6557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__1__Impl_in_rule__Subroutine__Group_3__16588 = new BitSet(new long[]{0x0001FF0001000000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__2_in_rule__Subroutine__Group_3__16591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1__0_in_rule__Subroutine__Group_3__1__Impl6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__2__Impl_in_rule__Subroutine__Group_3__26649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Subroutine__Group_3__2__Impl6677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1__0__Impl_in_rule__Subroutine__Group_3_1__06714 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1__1_in_rule__Subroutine__Group_3_1__06717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__ParamsAssignment_3_1_0_in_rule__Subroutine__Group_3_1__0__Impl6744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1__1__Impl_in_rule__Subroutine__Group_3_1__16774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1_1__0_in_rule__Subroutine__Group_3_1__1__Impl6801 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1_1__0__Impl_in_rule__Subroutine__Group_3_1_1__06836 = new BitSet(new long[]{0x0001FF0000000000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1_1__1_in_rule__Subroutine__Group_3_1_1__06839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Subroutine__Group_3_1_1__0__Impl6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1_1__1__Impl_in_rule__Subroutine__Group_3_1_1__16898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__ParamsAssignment_3_1_1_1_in_rule__Subroutine__Group_3_1_1__1__Impl6925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__0__Impl_in_rule__FormalParam__Group__06959 = new BitSet(new long[]{0x0001FF0000000000L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__1_in_rule__FormalParam__Group__06962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__IntentAssignment_0_in_rule__FormalParam__Group__0__Impl6989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__1__Impl_in_rule__FormalParam__Group__17020 = new BitSet(new long[]{0x0000004100000010L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__2_in_rule__FormalParam__Group__17023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__TypeAssignment_1_in_rule__FormalParam__Group__1__Impl7050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__2__Impl_in_rule__FormalParam__Group__27080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__NameAssignment_2_in_rule__FormalParam__Group__2__Impl7107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__0__Impl_in_rule__Type__Group_4__07143 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Type__Group_4__1_in_rule__Type__Group_4__07146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DoubleAssignment_4_0_in_rule__Type__Group_4__0__Impl7173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__1__Impl_in_rule__Type__Group_4__17203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Type__Group_4__1__Impl7232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__0__Impl_in_rule__Type__Group_5__07269 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Type__Group_5__1_in_rule__Type__Group_5__07272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DerivedAssignment_5_0_in_rule__Type__Group_5__0__Impl7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__1__Impl_in_rule__Type__Group_5__17329 = new BitSet(new long[]{0x0000004100000010L});
    public static final BitSet FOLLOW_rule__Type__Group_5__2_in_rule__Type__Group_5__17332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Type__Group_5__1__Impl7360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__2__Impl_in_rule__Type__Group_5__27391 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Type__Group_5__3_in_rule__Type__Group_5__27394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DerivedTypeAssignment_5_2_in_rule__Type__Group_5__2__Impl7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__3__Impl_in_rule__Type__Group_5__37451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Type__Group_5__3__Impl7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__0__Impl_in_rule__SubroutineName__Group__07518 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__1_in_rule__SubroutineName__Group__07521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SubroutineName__Group__0__Impl7549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__1__Impl_in_rule__SubroutineName__Group__17580 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__2_in_rule__SubroutineName__Group__17583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__2__Impl_in_rule__SubroutineName__Group__27641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__0_in_rule__SubroutineName__Group__2__Impl7668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__0__Impl_in_rule__SubroutineName__Group_2__07705 = new BitSet(new long[]{0x0000004100000010L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__1_in_rule__SubroutineName__Group_2__07708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SubroutineName__Group_2__0__Impl7736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__1__Impl_in_rule__SubroutineName__Group_2__17767 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__2_in_rule__SubroutineName__Group_2__17770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__NameAssignment_2_1_in_rule__SubroutineName__Group_2__1__Impl7797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__2__Impl_in_rule__SubroutineName__Group_2__27827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__SubroutineName__Group_2__2__Impl7855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__07892 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__07895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Call__Group__0__Impl7923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__17954 = new BitSet(new long[]{0x0000004100000010L});
    public static final BitSet FOLLOW_rule__Call__Group__2_in_rule__Call__Group__17957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Call__Group__1__Impl7985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__28016 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Call__Group__3_in_rule__Call__Group__28019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__SubroutineNameAssignment_2_in_rule__Call__Group__2__Impl8046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__38076 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_rule__Call__Group__4_in_rule__Call__Group__38079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl8106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__48137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Call__Group__4__Impl8165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__08206 = new BitSet(new long[]{0x0000004101000010L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__08209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Call__Group_3__0__Impl8237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__18268 = new BitSet(new long[]{0x0000004101000010L});
    public static final BitSet FOLLOW_rule__Call__Group_3__2_in_rule__Call__Group_3__18271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__0_in_rule__Call__Group_3__1__Impl8298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__2__Impl_in_rule__Call__Group_3__28329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Call__Group_3__2__Impl8357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__0__Impl_in_rule__Call__Group_3_1__08394 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__1_in_rule__Call__Group_3_1__08397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParamsAssignment_3_1_0_in_rule__Call__Group_3_1__0__Impl8424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__1__Impl_in_rule__Call__Group_3_1__18454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__0_in_rule__Call__Group_3_1__1__Impl8481 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__0__Impl_in_rule__Call__Group_3_1_1__08516 = new BitSet(new long[]{0x0000004100000010L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__1_in_rule__Call__Group_3_1_1__08519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Call__Group_3_1_1__0__Impl8547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__1__Impl_in_rule__Call__Group_3_1_1__18578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParamsAssignment_3_1_1_1_in_rule__Call__Group_3_1_1__1__Impl8605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__0__Impl_in_rule__ActualParam__Group__08639 = new BitSet(new long[]{0x0000004100000010L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__1_in_rule__ActualParam__Group__08642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__0_in_rule__ActualParam__Group__0__Impl8669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__1__Impl_in_rule__ActualParam__Group__18700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__ValueAssignment_1_in_rule__ActualParam__Group__1__Impl8727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__0__Impl_in_rule__ActualParam__Group_0__08761 = new BitSet(new long[]{0x0002000000100000L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__1_in_rule__ActualParam__Group_0__08764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__KeywordAssignment_0_0_in_rule__ActualParam__Group_0__0__Impl8791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__1__Impl_in_rule__ActualParam__Group_0__18821 = new BitSet(new long[]{0x0002000000100000L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__2_in_rule__ActualParam__Group_0__18824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__OptionalAssignment_0_1_in_rule__ActualParam__Group_0__1__Impl8851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__2__Impl_in_rule__ActualParam__Group_0__28882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ActualParam__Group_0__2__Impl8910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__0__Impl_in_rule__PathExpr__Group__08947 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__1_in_rule__PathExpr__Group__08950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PathExpr__Group__0__Impl8978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__1__Impl_in_rule__PathExpr__Group__19009 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__2_in_rule__PathExpr__Group__19012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__SegmentsAssignment_1_in_rule__PathExpr__Group__1__Impl9039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__2__Impl_in_rule__PathExpr__Group__29069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group_2__0_in_rule__PathExpr__Group__2__Impl9096 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group_2__0__Impl_in_rule__PathExpr__Group_2__09133 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_rule__PathExpr__Group_2__1_in_rule__PathExpr__Group_2__09136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PathExpr__Group_2__0__Impl9164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group_2__1__Impl_in_rule__PathExpr__Group_2__19195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__SegmentsAssignment_2_1_in_rule__PathExpr__Group_2__1__Impl9222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Language__NameAssignment_19261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Language__UriAssignment_29292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConceptDef_in_rule__Language__ConceptDefAssignment_49323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Subconcept__AttribAssignment_09359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Subconcept__NameAssignment_19398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Subconcept__CardinalityAssignment_29429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Subconcept__EssentialAssignment_39465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Subconcept__RefAssignment_4_0_09509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Subconcept__ConceptDefAssignment_4_0_19552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__Subconcept__MappingAssignment_4_1_0_19587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Subconcept__AnnotationAssignment_4_1_1_19618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Subconcept__AnnotationAssignment_4_1_1_2_19649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConceptDefBody_in_rule__Subconcept__BodyAssignment_4_1_29680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Annotation__KeyAssignment_09711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_29742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ConceptDef__TopAssignment_09778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConceptDef__NameAssignment_29817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__ConceptDef__MappingAssignment_3_19848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__ConceptDef__AnnotationAssignment_4_19879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__ConceptDef__AnnotationAssignment_4_2_19910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConceptDefBody_in_rule__ConceptDef__BodyAssignment_59941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconcept_in_rule__ConceptDefBody__SubconceptAssignment_19972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconcept_in_rule__ConceptDefBody__SubconceptAssignment_2_110003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Cardinality__ZeroOrMoreAssignment_010039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Cardinality__OneOrMoreAssignment_110083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_rule__Mapping__ContextAssignment_010122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_rule__Mapping__MappingAssignment_110153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__Module__NameAssignment_2_110184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__UsesModule__NameAssignment_210215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__UsesEntity__NameAssignment_210246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__Subroutine__NameAssignment_210277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalParam_in_rule__Subroutine__ParamsAssignment_3_1_010308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalParam_in_rule__Subroutine__ParamsAssignment_3_1_1_110339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_rule__FormalParam__IntentAssignment_010370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__FormalParam__TypeAssignment_110401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__FormalParam__NameAssignment_210432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Intent__InAssignment_010468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Intent__OutAssignment_110512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Intent__InoutAssignment_210556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Type__IntegerAssignment_010600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Type__CharacterAssignment_110644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Type__LogicalAssignment_210688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Type__RealAssignment_310732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Type__DoubleAssignment_4_010776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Type__DerivedAssignment_5_010820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__Type__DerivedTypeAssignment_5_210859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__SubroutineName__NameAssignment_2_110890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__Call__SubroutineNameAssignment_210921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_010952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_1_110983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActualParam__KeywordAssignment_0_011014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ActualParam__OptionalAssignment_0_111050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__ActualParam__ValueAssignment_111089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IDOrWildcard__IdAssignment_011120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__IDOrWildcard__WildcardAssignment_111156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegment_in_rule__PathExpr__SegmentsAssignment_111195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathSegment_in_rule__PathExpr__SegmentsAssignment_2_111226 = new BitSet(new long[]{0x0000000000000002L});

}