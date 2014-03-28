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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ANNOTATION_ID", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'language '", "'{'", "'}'", "'='", "'<'", "'>'", "':'", "'module'", "'('", "')'", "'moduleName'", "'usesModule'", "'usesEntity'", "'subroutine'", "','", "'precision'", "'subroutineName'", "'call'", "'actualParamByKeyword'", "'#'", "'/'", "'concept'", "'top'", "'!'", "'attrib'", "'*'", "'+'", "'in'", "'out'", "'inout'", "'integer'", "'character'", "'logical'", "'real'", "'double'", "'type'", "'?'", "'^'"
    };
    public static final int RULE_ID=6;
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
    public static final int RULE_INT=4;
    public static final int RULE_ANNOTATION_ID=7;
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


    // $ANTLR start "entryRuleAnnotation"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:88:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:89:1: ( ruleAnnotation EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:90:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation121);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation128); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:97:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:101:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:102:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:102:1: ( ( rule__Annotation__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:103:1: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:104:1: ( rule__Annotation__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:104:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation154);
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


    // $ANTLR start "entryRuleAnonymousConceptDef"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:116:1: entryRuleAnonymousConceptDef : ruleAnonymousConceptDef EOF ;
    public final void entryRuleAnonymousConceptDef() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:117:1: ( ruleAnonymousConceptDef EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:118:1: ruleAnonymousConceptDef EOF
            {
             before(grammarAccess.getAnonymousConceptDefRule()); 
            pushFollow(FOLLOW_ruleAnonymousConceptDef_in_entryRuleAnonymousConceptDef181);
            ruleAnonymousConceptDef();

            state._fsp--;

             after(grammarAccess.getAnonymousConceptDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnonymousConceptDef188); 

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
    // $ANTLR end "entryRuleAnonymousConceptDef"


    // $ANTLR start "ruleAnonymousConceptDef"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:125:1: ruleAnonymousConceptDef : ( ( rule__AnonymousConceptDef__Group__0 ) ) ;
    public final void ruleAnonymousConceptDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:129:2: ( ( ( rule__AnonymousConceptDef__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:130:1: ( ( rule__AnonymousConceptDef__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:130:1: ( ( rule__AnonymousConceptDef__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:131:1: ( rule__AnonymousConceptDef__Group__0 )
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:132:1: ( rule__AnonymousConceptDef__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:132:2: rule__AnonymousConceptDef__Group__0
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group__0_in_ruleAnonymousConceptDef214);
            rule__AnonymousConceptDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnonymousConceptDefAccess().getGroup()); 

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
    // $ANTLR end "ruleAnonymousConceptDef"


    // $ANTLR start "entryRuleNamedConceptDef"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:144:1: entryRuleNamedConceptDef : ruleNamedConceptDef EOF ;
    public final void entryRuleNamedConceptDef() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:145:1: ( ruleNamedConceptDef EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:146:1: ruleNamedConceptDef EOF
            {
             before(grammarAccess.getNamedConceptDefRule()); 
            pushFollow(FOLLOW_ruleNamedConceptDef_in_entryRuleNamedConceptDef241);
            ruleNamedConceptDef();

            state._fsp--;

             after(grammarAccess.getNamedConceptDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedConceptDef248); 

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
    // $ANTLR end "entryRuleNamedConceptDef"


    // $ANTLR start "ruleNamedConceptDef"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:153:1: ruleNamedConceptDef : ( ( rule__NamedConceptDef__Group__0 ) ) ;
    public final void ruleNamedConceptDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:157:2: ( ( ( rule__NamedConceptDef__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:158:1: ( ( rule__NamedConceptDef__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:158:1: ( ( rule__NamedConceptDef__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:159:1: ( rule__NamedConceptDef__Group__0 )
            {
             before(grammarAccess.getNamedConceptDefAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:160:1: ( rule__NamedConceptDef__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:160:2: rule__NamedConceptDef__Group__0
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group__0_in_ruleNamedConceptDef274);
            rule__NamedConceptDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNamedConceptDefAccess().getGroup()); 

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
    // $ANTLR end "ruleNamedConceptDef"


    // $ANTLR start "entryRuleTopConceptDef"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:172:1: entryRuleTopConceptDef : ruleTopConceptDef EOF ;
    public final void entryRuleTopConceptDef() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:173:1: ( ruleTopConceptDef EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:174:1: ruleTopConceptDef EOF
            {
             before(grammarAccess.getTopConceptDefRule()); 
            pushFollow(FOLLOW_ruleTopConceptDef_in_entryRuleTopConceptDef301);
            ruleTopConceptDef();

            state._fsp--;

             after(grammarAccess.getTopConceptDefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopConceptDef308); 

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
    // $ANTLR end "entryRuleTopConceptDef"


    // $ANTLR start "ruleTopConceptDef"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:181:1: ruleTopConceptDef : ( ( rule__TopConceptDef__Group__0 ) ) ;
    public final void ruleTopConceptDef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:185:2: ( ( ( rule__TopConceptDef__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:186:1: ( ( rule__TopConceptDef__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:186:1: ( ( rule__TopConceptDef__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:187:1: ( rule__TopConceptDef__Group__0 )
            {
             before(grammarAccess.getTopConceptDefAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:188:1: ( rule__TopConceptDef__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:188:2: rule__TopConceptDef__Group__0
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group__0_in_ruleTopConceptDef334);
            rule__TopConceptDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopConceptDefAccess().getGroup()); 

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
    // $ANTLR end "ruleTopConceptDef"


    // $ANTLR start "entryRuleSubconceptOrAttribute"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:200:1: entryRuleSubconceptOrAttribute : ruleSubconceptOrAttribute EOF ;
    public final void entryRuleSubconceptOrAttribute() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:201:1: ( ruleSubconceptOrAttribute EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:202:1: ruleSubconceptOrAttribute EOF
            {
             before(grammarAccess.getSubconceptOrAttributeRule()); 
            pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_entryRuleSubconceptOrAttribute361);
            ruleSubconceptOrAttribute();

            state._fsp--;

             after(grammarAccess.getSubconceptOrAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubconceptOrAttribute368); 

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
    // $ANTLR end "entryRuleSubconceptOrAttribute"


    // $ANTLR start "ruleSubconceptOrAttribute"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:209:1: ruleSubconceptOrAttribute : ( ( rule__SubconceptOrAttribute__Alternatives ) ) ;
    public final void ruleSubconceptOrAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:213:2: ( ( ( rule__SubconceptOrAttribute__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:214:1: ( ( rule__SubconceptOrAttribute__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:214:1: ( ( rule__SubconceptOrAttribute__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:215:1: ( rule__SubconceptOrAttribute__Alternatives )
            {
             before(grammarAccess.getSubconceptOrAttributeAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:216:1: ( rule__SubconceptOrAttribute__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:216:2: rule__SubconceptOrAttribute__Alternatives
            {
            pushFollow(FOLLOW_rule__SubconceptOrAttribute__Alternatives_in_ruleSubconceptOrAttribute394);
            rule__SubconceptOrAttribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubconceptOrAttributeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSubconceptOrAttribute"


    // $ANTLR start "entryRuleSubconcept"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:228:1: entryRuleSubconcept : ruleSubconcept EOF ;
    public final void entryRuleSubconcept() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:229:1: ( ruleSubconcept EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:230:1: ruleSubconcept EOF
            {
             before(grammarAccess.getSubconceptRule()); 
            pushFollow(FOLLOW_ruleSubconcept_in_entryRuleSubconcept421);
            ruleSubconcept();

            state._fsp--;

             after(grammarAccess.getSubconceptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubconcept428); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:237:1: ruleSubconcept : ( ( rule__Subconcept__Group__0 ) ) ;
    public final void ruleSubconcept() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:241:2: ( ( ( rule__Subconcept__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:242:1: ( ( rule__Subconcept__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:242:1: ( ( rule__Subconcept__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:243:1: ( rule__Subconcept__Group__0 )
            {
             before(grammarAccess.getSubconceptAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:244:1: ( rule__Subconcept__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:244:2: rule__Subconcept__Group__0
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__0_in_ruleSubconcept454);
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


    // $ANTLR start "entryRuleAttribute"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:256:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:257:1: ( ruleAttribute EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:258:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute481);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute488); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:265:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:269:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:270:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:270:1: ( ( rule__Attribute__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:271:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:272:1: ( rule__Attribute__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:272:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute514);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleCardinality"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:284:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:285:1: ( ruleCardinality EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:286:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_ruleCardinality_in_entryRuleCardinality541);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCardinality548); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:293:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:297:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:298:1: ( ( rule__Cardinality__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:298:1: ( ( rule__Cardinality__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:299:1: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:300:1: ( rule__Cardinality__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:300:2: rule__Cardinality__Alternatives
            {
            pushFollow(FOLLOW_rule__Cardinality__Alternatives_in_ruleCardinality574);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:312:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:313:1: ( ruleMapping EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:314:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping601);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping608); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:321:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:325:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:326:1: ( ( rule__Mapping__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:326:1: ( ( rule__Mapping__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:327:1: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:328:1: ( rule__Mapping__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:328:2: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0_in_ruleMapping634);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:340:1: entryRuleImplicitContextMapping : ruleImplicitContextMapping EOF ;
    public final void entryRuleImplicitContextMapping() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:341:1: ( ruleImplicitContextMapping EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:342:1: ruleImplicitContextMapping EOF
            {
             before(grammarAccess.getImplicitContextMappingRule()); 
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_entryRuleImplicitContextMapping661);
            ruleImplicitContextMapping();

            state._fsp--;

             after(grammarAccess.getImplicitContextMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicitContextMapping668); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:349:1: ruleImplicitContextMapping : ( ( rule__ImplicitContextMapping__Alternatives ) ) ;
    public final void ruleImplicitContextMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:353:2: ( ( ( rule__ImplicitContextMapping__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:354:1: ( ( rule__ImplicitContextMapping__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:354:1: ( ( rule__ImplicitContextMapping__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:355:1: ( rule__ImplicitContextMapping__Alternatives )
            {
             before(grammarAccess.getImplicitContextMappingAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:356:1: ( rule__ImplicitContextMapping__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:356:2: rule__ImplicitContextMapping__Alternatives
            {
            pushFollow(FOLLOW_rule__ImplicitContextMapping__Alternatives_in_ruleImplicitContextMapping694);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:368:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:369:1: ( ruleModule EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:370:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule721);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule728); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:377:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:381:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:382:1: ( ( rule__Module__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:382:1: ( ( rule__Module__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:383:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:384:1: ( rule__Module__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:384:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule754);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:396:1: entryRuleModuleName : ruleModuleName EOF ;
    public final void entryRuleModuleName() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:397:1: ( ruleModuleName EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:398:1: ruleModuleName EOF
            {
             before(grammarAccess.getModuleNameRule()); 
            pushFollow(FOLLOW_ruleModuleName_in_entryRuleModuleName781);
            ruleModuleName();

            state._fsp--;

             after(grammarAccess.getModuleNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleName788); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:405:1: ruleModuleName : ( ( rule__ModuleName__Group__0 ) ) ;
    public final void ruleModuleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:409:2: ( ( ( rule__ModuleName__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:410:1: ( ( rule__ModuleName__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:410:1: ( ( rule__ModuleName__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:411:1: ( rule__ModuleName__Group__0 )
            {
             before(grammarAccess.getModuleNameAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:412:1: ( rule__ModuleName__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:412:2: rule__ModuleName__Group__0
            {
            pushFollow(FOLLOW_rule__ModuleName__Group__0_in_ruleModuleName814);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:424:1: entryRuleUsesModule : ruleUsesModule EOF ;
    public final void entryRuleUsesModule() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:425:1: ( ruleUsesModule EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:426:1: ruleUsesModule EOF
            {
             before(grammarAccess.getUsesModuleRule()); 
            pushFollow(FOLLOW_ruleUsesModule_in_entryRuleUsesModule841);
            ruleUsesModule();

            state._fsp--;

             after(grammarAccess.getUsesModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsesModule848); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:433:1: ruleUsesModule : ( ( rule__UsesModule__Group__0 ) ) ;
    public final void ruleUsesModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:437:2: ( ( ( rule__UsesModule__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:438:1: ( ( rule__UsesModule__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:438:1: ( ( rule__UsesModule__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:439:1: ( rule__UsesModule__Group__0 )
            {
             before(grammarAccess.getUsesModuleAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:440:1: ( rule__UsesModule__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:440:2: rule__UsesModule__Group__0
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__0_in_ruleUsesModule874);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:452:1: entryRuleUsesEntity : ruleUsesEntity EOF ;
    public final void entryRuleUsesEntity() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:453:1: ( ruleUsesEntity EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:454:1: ruleUsesEntity EOF
            {
             before(grammarAccess.getUsesEntityRule()); 
            pushFollow(FOLLOW_ruleUsesEntity_in_entryRuleUsesEntity901);
            ruleUsesEntity();

            state._fsp--;

             after(grammarAccess.getUsesEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUsesEntity908); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:461:1: ruleUsesEntity : ( ( rule__UsesEntity__Group__0 ) ) ;
    public final void ruleUsesEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:465:2: ( ( ( rule__UsesEntity__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:466:1: ( ( rule__UsesEntity__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:466:1: ( ( rule__UsesEntity__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:467:1: ( rule__UsesEntity__Group__0 )
            {
             before(grammarAccess.getUsesEntityAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:468:1: ( rule__UsesEntity__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:468:2: rule__UsesEntity__Group__0
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__0_in_ruleUsesEntity934);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:480:1: entryRuleSubroutine : ruleSubroutine EOF ;
    public final void entryRuleSubroutine() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:481:1: ( ruleSubroutine EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:482:1: ruleSubroutine EOF
            {
             before(grammarAccess.getSubroutineRule()); 
            pushFollow(FOLLOW_ruleSubroutine_in_entryRuleSubroutine961);
            ruleSubroutine();

            state._fsp--;

             after(grammarAccess.getSubroutineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutine968); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:489:1: ruleSubroutine : ( ( rule__Subroutine__Group__0 ) ) ;
    public final void ruleSubroutine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:493:2: ( ( ( rule__Subroutine__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:494:1: ( ( rule__Subroutine__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:494:1: ( ( rule__Subroutine__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:495:1: ( rule__Subroutine__Group__0 )
            {
             before(grammarAccess.getSubroutineAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:496:1: ( rule__Subroutine__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:496:2: rule__Subroutine__Group__0
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__0_in_ruleSubroutine994);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:508:1: entryRuleFormalParam : ruleFormalParam EOF ;
    public final void entryRuleFormalParam() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:509:1: ( ruleFormalParam EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:510:1: ruleFormalParam EOF
            {
             before(grammarAccess.getFormalParamRule()); 
            pushFollow(FOLLOW_ruleFormalParam_in_entryRuleFormalParam1021);
            ruleFormalParam();

            state._fsp--;

             after(grammarAccess.getFormalParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalParam1028); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:517:1: ruleFormalParam : ( ( rule__FormalParam__Group__0 ) ) ;
    public final void ruleFormalParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:521:2: ( ( ( rule__FormalParam__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:522:1: ( ( rule__FormalParam__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:522:1: ( ( rule__FormalParam__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:523:1: ( rule__FormalParam__Group__0 )
            {
             before(grammarAccess.getFormalParamAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:524:1: ( rule__FormalParam__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:524:2: rule__FormalParam__Group__0
            {
            pushFollow(FOLLOW_rule__FormalParam__Group__0_in_ruleFormalParam1054);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:536:1: entryRuleIntent : ruleIntent EOF ;
    public final void entryRuleIntent() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:537:1: ( ruleIntent EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:538:1: ruleIntent EOF
            {
             before(grammarAccess.getIntentRule()); 
            pushFollow(FOLLOW_ruleIntent_in_entryRuleIntent1081);
            ruleIntent();

            state._fsp--;

             after(grammarAccess.getIntentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntent1088); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:545:1: ruleIntent : ( ( rule__Intent__Alternatives ) ) ;
    public final void ruleIntent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:549:2: ( ( ( rule__Intent__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:550:1: ( ( rule__Intent__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:550:1: ( ( rule__Intent__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:551:1: ( rule__Intent__Alternatives )
            {
             before(grammarAccess.getIntentAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:552:1: ( rule__Intent__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:552:2: rule__Intent__Alternatives
            {
            pushFollow(FOLLOW_rule__Intent__Alternatives_in_ruleIntent1114);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:564:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:565:1: ( ruleType EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:566:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1141);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1148); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:573:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:577:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:578:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:578:1: ( ( rule__Type__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:579:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:580:1: ( rule__Type__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:580:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1174);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:592:1: entryRuleSubroutineName : ruleSubroutineName EOF ;
    public final void entryRuleSubroutineName() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:593:1: ( ruleSubroutineName EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:594:1: ruleSubroutineName EOF
            {
             before(grammarAccess.getSubroutineNameRule()); 
            pushFollow(FOLLOW_ruleSubroutineName_in_entryRuleSubroutineName1201);
            ruleSubroutineName();

            state._fsp--;

             after(grammarAccess.getSubroutineNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubroutineName1208); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:601:1: ruleSubroutineName : ( ( rule__SubroutineName__Group__0 ) ) ;
    public final void ruleSubroutineName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:605:2: ( ( ( rule__SubroutineName__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:606:1: ( ( rule__SubroutineName__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:606:1: ( ( rule__SubroutineName__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:607:1: ( rule__SubroutineName__Group__0 )
            {
             before(grammarAccess.getSubroutineNameAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:608:1: ( rule__SubroutineName__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:608:2: rule__SubroutineName__Group__0
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group__0_in_ruleSubroutineName1234);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:620:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:621:1: ( ruleCall EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:622:1: ruleCall EOF
            {
             before(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall1261);
            ruleCall();

            state._fsp--;

             after(grammarAccess.getCallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall1268); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:629:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:633:2: ( ( ( rule__Call__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:634:1: ( ( rule__Call__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:634:1: ( ( rule__Call__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:635:1: ( rule__Call__Group__0 )
            {
             before(grammarAccess.getCallAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:636:1: ( rule__Call__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:636:2: rule__Call__Group__0
            {
            pushFollow(FOLLOW_rule__Call__Group__0_in_ruleCall1294);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:648:1: entryRuleActualParam : ruleActualParam EOF ;
    public final void entryRuleActualParam() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:649:1: ( ruleActualParam EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:650:1: ruleActualParam EOF
            {
             before(grammarAccess.getActualParamRule()); 
            pushFollow(FOLLOW_ruleActualParam_in_entryRuleActualParam1321);
            ruleActualParam();

            state._fsp--;

             after(grammarAccess.getActualParamRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualParam1328); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:657:1: ruleActualParam : ( ( rule__ActualParam__Group__0 ) ) ;
    public final void ruleActualParam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:661:2: ( ( ( rule__ActualParam__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:662:1: ( ( rule__ActualParam__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:662:1: ( ( rule__ActualParam__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:663:1: ( rule__ActualParam__Group__0 )
            {
             before(grammarAccess.getActualParamAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:664:1: ( rule__ActualParam__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:664:2: rule__ActualParam__Group__0
            {
            pushFollow(FOLLOW_rule__ActualParam__Group__0_in_ruleActualParam1354);
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


    // $ANTLR start "entryRuleActualParamByKeyword"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:676:1: entryRuleActualParamByKeyword : ruleActualParamByKeyword EOF ;
    public final void entryRuleActualParamByKeyword() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:677:1: ( ruleActualParamByKeyword EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:678:1: ruleActualParamByKeyword EOF
            {
             before(grammarAccess.getActualParamByKeywordRule()); 
            pushFollow(FOLLOW_ruleActualParamByKeyword_in_entryRuleActualParamByKeyword1381);
            ruleActualParamByKeyword();

            state._fsp--;

             after(grammarAccess.getActualParamByKeywordRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActualParamByKeyword1388); 

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
    // $ANTLR end "entryRuleActualParamByKeyword"


    // $ANTLR start "ruleActualParamByKeyword"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:685:1: ruleActualParamByKeyword : ( ( rule__ActualParamByKeyword__Group__0 ) ) ;
    public final void ruleActualParamByKeyword() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:689:2: ( ( ( rule__ActualParamByKeyword__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:690:1: ( ( rule__ActualParamByKeyword__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:690:1: ( ( rule__ActualParamByKeyword__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:691:1: ( rule__ActualParamByKeyword__Group__0 )
            {
             before(grammarAccess.getActualParamByKeywordAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:692:1: ( rule__ActualParamByKeyword__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:692:2: rule__ActualParamByKeyword__Group__0
            {
            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__0_in_ruleActualParamByKeyword1414);
            rule__ActualParamByKeyword__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActualParamByKeywordAccess().getGroup()); 

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
    // $ANTLR end "ruleActualParamByKeyword"


    // $ANTLR start "entryRuleIDOrWildcard"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:704:1: entryRuleIDOrWildcard : ruleIDOrWildcard EOF ;
    public final void entryRuleIDOrWildcard() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:705:1: ( ruleIDOrWildcard EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:706:1: ruleIDOrWildcard EOF
            {
             before(grammarAccess.getIDOrWildcardRule()); 
            pushFollow(FOLLOW_ruleIDOrWildcard_in_entryRuleIDOrWildcard1441);
            ruleIDOrWildcard();

            state._fsp--;

             after(grammarAccess.getIDOrWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrWildcard1448); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:713:1: ruleIDOrWildcard : ( ( rule__IDOrWildcard__Alternatives ) ) ;
    public final void ruleIDOrWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:717:2: ( ( ( rule__IDOrWildcard__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:718:1: ( ( rule__IDOrWildcard__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:718:1: ( ( rule__IDOrWildcard__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:719:1: ( rule__IDOrWildcard__Alternatives )
            {
             before(grammarAccess.getIDOrWildcardAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:720:1: ( rule__IDOrWildcard__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:720:2: rule__IDOrWildcard__Alternatives
            {
            pushFollow(FOLLOW_rule__IDOrWildcard__Alternatives_in_ruleIDOrWildcard1474);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:732:1: entryRuleIDOrPathExpr : ruleIDOrPathExpr EOF ;
    public final void entryRuleIDOrPathExpr() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:733:1: ( ruleIDOrPathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:734:1: ruleIDOrPathExpr EOF
            {
             before(grammarAccess.getIDOrPathExprRule()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_entryRuleIDOrPathExpr1501);
            ruleIDOrPathExpr();

            state._fsp--;

             after(grammarAccess.getIDOrPathExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrPathExpr1508); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:741:1: ruleIDOrPathExpr : ( ( rule__IDOrPathExpr__Alternatives ) ) ;
    public final void ruleIDOrPathExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:745:2: ( ( ( rule__IDOrPathExpr__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:746:1: ( ( rule__IDOrPathExpr__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:746:1: ( ( rule__IDOrPathExpr__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:747:1: ( rule__IDOrPathExpr__Alternatives )
            {
             before(grammarAccess.getIDOrPathExprAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:748:1: ( rule__IDOrPathExpr__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:748:2: rule__IDOrPathExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__IDOrPathExpr__Alternatives_in_ruleIDOrPathExpr1534);
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


    // $ANTLR start "entryRuleLiteral"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:760:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:761:1: ( ruleLiteral EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:762:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1561);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1568); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:769:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:773:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:774:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:774:1: ( ( rule__Literal__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:775:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:776:1: ( rule__Literal__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:776:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1594);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRulePathExpr"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:788:1: entryRulePathExpr : rulePathExpr EOF ;
    public final void entryRulePathExpr() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:789:1: ( rulePathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:790:1: rulePathExpr EOF
            {
             before(grammarAccess.getPathExprRule()); 
            pushFollow(FOLLOW_rulePathExpr_in_entryRulePathExpr1621);
            rulePathExpr();

            state._fsp--;

             after(grammarAccess.getPathExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExpr1628); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:797:1: rulePathExpr : ( ( rule__PathExpr__Group__0 ) ) ;
    public final void rulePathExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:801:2: ( ( ( rule__PathExpr__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:802:1: ( ( rule__PathExpr__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:802:1: ( ( rule__PathExpr__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:803:1: ( rule__PathExpr__Group__0 )
            {
             before(grammarAccess.getPathExprAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:804:1: ( rule__PathExpr__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:804:2: rule__PathExpr__Group__0
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__0_in_rulePathExpr1654);
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


    // $ANTLR start "entryRulePathExprNode"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:816:1: entryRulePathExprNode : rulePathExprNode EOF ;
    public final void entryRulePathExprNode() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:817:1: ( rulePathExprNode EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:818:1: rulePathExprNode EOF
            {
             before(grammarAccess.getPathExprNodeRule()); 
            pushFollow(FOLLOW_rulePathExprNode_in_entryRulePathExprNode1681);
            rulePathExprNode();

            state._fsp--;

             after(grammarAccess.getPathExprNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExprNode1688); 

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
    // $ANTLR end "entryRulePathExprNode"


    // $ANTLR start "rulePathExprNode"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:825:1: rulePathExprNode : ( ( rule__PathExprNode__Group__0 ) ) ;
    public final void rulePathExprNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:829:2: ( ( ( rule__PathExprNode__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:830:1: ( ( rule__PathExprNode__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:830:1: ( ( rule__PathExprNode__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:831:1: ( rule__PathExprNode__Group__0 )
            {
             before(grammarAccess.getPathExprNodeAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:832:1: ( rule__PathExprNode__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:832:2: rule__PathExprNode__Group__0
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group__0_in_rulePathExprNode1714);
            rule__PathExprNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathExprNodeAccess().getGroup()); 

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
    // $ANTLR end "rulePathExprNode"


    // $ANTLR start "entryRulePathExprTerm"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:844:1: entryRulePathExprTerm : rulePathExprTerm EOF ;
    public final void entryRulePathExprTerm() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:845:1: ( rulePathExprTerm EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:846:1: rulePathExprTerm EOF
            {
             before(grammarAccess.getPathExprTermRule()); 
            pushFollow(FOLLOW_rulePathExprTerm_in_entryRulePathExprTerm1741);
            rulePathExprTerm();

            state._fsp--;

             after(grammarAccess.getPathExprTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExprTerm1748); 

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
    // $ANTLR end "entryRulePathExprTerm"


    // $ANTLR start "rulePathExprTerm"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:853:1: rulePathExprTerm : ( ( rule__PathExprTerm__Group__0 ) ) ;
    public final void rulePathExprTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:857:2: ( ( ( rule__PathExprTerm__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:858:1: ( ( rule__PathExprTerm__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:858:1: ( ( rule__PathExprTerm__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:859:1: ( rule__PathExprTerm__Group__0 )
            {
             before(grammarAccess.getPathExprTermAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:860:1: ( rule__PathExprTerm__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:860:2: rule__PathExprTerm__Group__0
            {
            pushFollow(FOLLOW_rule__PathExprTerm__Group__0_in_rulePathExprTerm1774);
            rule__PathExprTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathExprTermAccess().getGroup()); 

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
    // $ANTLR end "rulePathExprTerm"


    // $ANTLR start "entryRuleAxis"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:872:1: entryRuleAxis : ruleAxis EOF ;
    public final void entryRuleAxis() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:873:1: ( ruleAxis EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:874:1: ruleAxis EOF
            {
             before(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_ruleAxis_in_entryRuleAxis1801);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getAxisRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAxis1808); 

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
    // $ANTLR end "entryRuleAxis"


    // $ANTLR start "ruleAxis"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:881:1: ruleAxis : ( ( rule__Axis__AncestorAssignment ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:885:2: ( ( ( rule__Axis__AncestorAssignment ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:886:1: ( ( rule__Axis__AncestorAssignment ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:886:1: ( ( rule__Axis__AncestorAssignment ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:887:1: ( rule__Axis__AncestorAssignment )
            {
             before(grammarAccess.getAxisAccess().getAncestorAssignment()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:888:1: ( rule__Axis__AncestorAssignment )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:888:2: rule__Axis__AncestorAssignment
            {
            pushFollow(FOLLOW_rule__Axis__AncestorAssignment_in_ruleAxis1834);
            rule__Axis__AncestorAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAxisAccess().getAncestorAssignment()); 

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
    // $ANTLR end "ruleAxis"


    // $ANTLR start "rule__SubconceptOrAttribute__Alternatives"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:900:1: rule__SubconceptOrAttribute__Alternatives : ( ( ruleSubconcept ) | ( ruleAttribute ) );
    public final void rule__SubconceptOrAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:904:1: ( ( ruleSubconcept ) | ( ruleAttribute ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==36) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:905:1: ( ruleSubconcept )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:905:1: ( ruleSubconcept )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:906:1: ruleSubconcept
                    {
                     before(grammarAccess.getSubconceptOrAttributeAccess().getSubconceptParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSubconcept_in_rule__SubconceptOrAttribute__Alternatives1870);
                    ruleSubconcept();

                    state._fsp--;

                     after(grammarAccess.getSubconceptOrAttributeAccess().getSubconceptParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:911:6: ( ruleAttribute )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:911:6: ( ruleAttribute )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:912:1: ruleAttribute
                    {
                     before(grammarAccess.getSubconceptOrAttributeAccess().getAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__SubconceptOrAttribute__Alternatives1887);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getSubconceptOrAttributeAccess().getAttributeParserRuleCall_1()); 

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
    // $ANTLR end "rule__SubconceptOrAttribute__Alternatives"


    // $ANTLR start "rule__Subconcept__Alternatives_3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:922:1: rule__Subconcept__Alternatives_3 : ( ( ( rule__Subconcept__Group_3_0__0 ) ) | ( ( rule__Subconcept__DefAssignment_3_1 ) ) | ( ( rule__Subconcept__Group_3_2__0 ) ) );
    public final void rule__Subconcept__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:926:1: ( ( ( rule__Subconcept__Group_3_0__0 ) ) | ( ( rule__Subconcept__DefAssignment_3_1 ) ) | ( ( rule__Subconcept__Group_3_2__0 ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=3;
                }
                else if ( (LA2_1==33) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==EOF||LA2_0==RULE_ID||(LA2_0>=13 && LA2_0<=14)||LA2_0==16||LA2_0==36) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:927:1: ( ( rule__Subconcept__Group_3_0__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:927:1: ( ( rule__Subconcept__Group_3_0__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:928:1: ( rule__Subconcept__Group_3_0__0 )
                    {
                     before(grammarAccess.getSubconceptAccess().getGroup_3_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:929:1: ( rule__Subconcept__Group_3_0__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:929:2: rule__Subconcept__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Subconcept__Group_3_0__0_in_rule__Subconcept__Alternatives_31919);
                    rule__Subconcept__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubconceptAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:933:6: ( ( rule__Subconcept__DefAssignment_3_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:933:6: ( ( rule__Subconcept__DefAssignment_3_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:934:1: ( rule__Subconcept__DefAssignment_3_1 )
                    {
                     before(grammarAccess.getSubconceptAccess().getDefAssignment_3_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:935:1: ( rule__Subconcept__DefAssignment_3_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:935:2: rule__Subconcept__DefAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Subconcept__DefAssignment_3_1_in_rule__Subconcept__Alternatives_31937);
                    rule__Subconcept__DefAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubconceptAccess().getDefAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:939:6: ( ( rule__Subconcept__Group_3_2__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:939:6: ( ( rule__Subconcept__Group_3_2__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:940:1: ( rule__Subconcept__Group_3_2__0 )
                    {
                     before(grammarAccess.getSubconceptAccess().getGroup_3_2()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:941:1: ( rule__Subconcept__Group_3_2__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:941:2: rule__Subconcept__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Subconcept__Group_3_2__0_in_rule__Subconcept__Alternatives_31955);
                    rule__Subconcept__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubconceptAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__Subconcept__Alternatives_3"


    // $ANTLR start "rule__Cardinality__Alternatives"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:950:1: rule__Cardinality__Alternatives : ( ( ( rule__Cardinality__ZeroOrMoreAssignment_0 ) ) | ( ( rule__Cardinality__OneOrMoreAssignment_1 ) ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:954:1: ( ( ( rule__Cardinality__ZeroOrMoreAssignment_0 ) ) | ( ( rule__Cardinality__OneOrMoreAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37) ) {
                alt3=1;
            }
            else if ( (LA3_0==38) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:955:1: ( ( rule__Cardinality__ZeroOrMoreAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:955:1: ( ( rule__Cardinality__ZeroOrMoreAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:956:1: ( rule__Cardinality__ZeroOrMoreAssignment_0 )
                    {
                     before(grammarAccess.getCardinalityAccess().getZeroOrMoreAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:957:1: ( rule__Cardinality__ZeroOrMoreAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:957:2: rule__Cardinality__ZeroOrMoreAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Cardinality__ZeroOrMoreAssignment_0_in_rule__Cardinality__Alternatives1988);
                    rule__Cardinality__ZeroOrMoreAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardinalityAccess().getZeroOrMoreAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:961:6: ( ( rule__Cardinality__OneOrMoreAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:961:6: ( ( rule__Cardinality__OneOrMoreAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:962:1: ( rule__Cardinality__OneOrMoreAssignment_1 )
                    {
                     before(grammarAccess.getCardinalityAccess().getOneOrMoreAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:963:1: ( rule__Cardinality__OneOrMoreAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:963:2: rule__Cardinality__OneOrMoreAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Cardinality__OneOrMoreAssignment_1_in_rule__Cardinality__Alternatives2006);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:972:1: rule__ImplicitContextMapping__Alternatives : ( ( ruleModule ) | ( ruleModuleName ) | ( ruleUsesModule ) | ( ruleUsesEntity ) | ( ruleCall ) | ( ruleSubroutine ) | ( ruleSubroutineName ) | ( ruleActualParamByKeyword ) );
    public final void rule__ImplicitContextMapping__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:976:1: ( ( ruleModule ) | ( ruleModuleName ) | ( ruleUsesModule ) | ( ruleUsesEntity ) | ( ruleCall ) | ( ruleSubroutine ) | ( ruleSubroutineName ) | ( ruleActualParamByKeyword ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 22:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 24:
                {
                alt4=4;
                }
                break;
            case 29:
                {
                alt4=5;
                }
                break;
            case 25:
                {
                alt4=6;
                }
                break;
            case 28:
                {
                alt4=7;
                }
                break;
            case 30:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:977:1: ( ruleModule )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:977:1: ( ruleModule )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:978:1: ruleModule
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getModuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleModule_in_rule__ImplicitContextMapping__Alternatives2039);
                    ruleModule();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getModuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:983:6: ( ruleModuleName )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:983:6: ( ruleModuleName )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:984:1: ruleModuleName
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getModuleNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleModuleName_in_rule__ImplicitContextMapping__Alternatives2056);
                    ruleModuleName();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getModuleNameParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:989:6: ( ruleUsesModule )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:989:6: ( ruleUsesModule )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:990:1: ruleUsesModule
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getUsesModuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleUsesModule_in_rule__ImplicitContextMapping__Alternatives2073);
                    ruleUsesModule();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getUsesModuleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:995:6: ( ruleUsesEntity )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:995:6: ( ruleUsesEntity )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:996:1: ruleUsesEntity
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getUsesEntityParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleUsesEntity_in_rule__ImplicitContextMapping__Alternatives2090);
                    ruleUsesEntity();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getUsesEntityParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1001:6: ( ruleCall )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1001:6: ( ruleCall )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1002:1: ruleCall
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCall_in_rule__ImplicitContextMapping__Alternatives2107);
                    ruleCall();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1007:6: ( ruleSubroutine )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1007:6: ( ruleSubroutine )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1008:1: ruleSubroutine
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getSubroutineParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleSubroutine_in_rule__ImplicitContextMapping__Alternatives2124);
                    ruleSubroutine();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getSubroutineParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1013:6: ( ruleSubroutineName )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1013:6: ( ruleSubroutineName )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1014:1: ruleSubroutineName
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getSubroutineNameParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleSubroutineName_in_rule__ImplicitContextMapping__Alternatives2141);
                    ruleSubroutineName();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getSubroutineNameParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1019:6: ( ruleActualParamByKeyword )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1019:6: ( ruleActualParamByKeyword )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1020:1: ruleActualParamByKeyword
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getActualParamByKeywordParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleActualParamByKeyword_in_rule__ImplicitContextMapping__Alternatives2158);
                    ruleActualParamByKeyword();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getActualParamByKeywordParserRuleCall_7()); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1030:1: rule__Intent__Alternatives : ( ( ( rule__Intent__InAssignment_0 ) ) | ( ( rule__Intent__OutAssignment_1 ) ) | ( ( rule__Intent__InoutAssignment_2 ) ) );
    public final void rule__Intent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1034:1: ( ( ( rule__Intent__InAssignment_0 ) ) | ( ( rule__Intent__OutAssignment_1 ) ) | ( ( rule__Intent__InoutAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt5=1;
                }
                break;
            case 40:
                {
                alt5=2;
                }
                break;
            case 41:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1035:1: ( ( rule__Intent__InAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1035:1: ( ( rule__Intent__InAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1036:1: ( rule__Intent__InAssignment_0 )
                    {
                     before(grammarAccess.getIntentAccess().getInAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1037:1: ( rule__Intent__InAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1037:2: rule__Intent__InAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Intent__InAssignment_0_in_rule__Intent__Alternatives2190);
                    rule__Intent__InAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntentAccess().getInAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1041:6: ( ( rule__Intent__OutAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1041:6: ( ( rule__Intent__OutAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1042:1: ( rule__Intent__OutAssignment_1 )
                    {
                     before(grammarAccess.getIntentAccess().getOutAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1043:1: ( rule__Intent__OutAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1043:2: rule__Intent__OutAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Intent__OutAssignment_1_in_rule__Intent__Alternatives2208);
                    rule__Intent__OutAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntentAccess().getOutAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1047:6: ( ( rule__Intent__InoutAssignment_2 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1047:6: ( ( rule__Intent__InoutAssignment_2 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1048:1: ( rule__Intent__InoutAssignment_2 )
                    {
                     before(grammarAccess.getIntentAccess().getInoutAssignment_2()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1049:1: ( rule__Intent__InoutAssignment_2 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1049:2: rule__Intent__InoutAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Intent__InoutAssignment_2_in_rule__Intent__Alternatives2226);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1058:1: rule__Type__Alternatives : ( ( ( rule__Type__IntegerAssignment_0 ) ) | ( ( rule__Type__CharacterAssignment_1 ) ) | ( ( rule__Type__LogicalAssignment_2 ) ) | ( ( rule__Type__RealAssignment_3 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1062:1: ( ( ( rule__Type__IntegerAssignment_0 ) ) | ( ( rule__Type__CharacterAssignment_1 ) ) | ( ( rule__Type__LogicalAssignment_2 ) ) | ( ( rule__Type__RealAssignment_3 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt6=1;
                }
                break;
            case 43:
                {
                alt6=2;
                }
                break;
            case 44:
                {
                alt6=3;
                }
                break;
            case 45:
                {
                alt6=4;
                }
                break;
            case 46:
                {
                alt6=5;
                }
                break;
            case 47:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1063:1: ( ( rule__Type__IntegerAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1063:1: ( ( rule__Type__IntegerAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1064:1: ( rule__Type__IntegerAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getIntegerAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1065:1: ( rule__Type__IntegerAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1065:2: rule__Type__IntegerAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__IntegerAssignment_0_in_rule__Type__Alternatives2259);
                    rule__Type__IntegerAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getIntegerAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1069:6: ( ( rule__Type__CharacterAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1069:6: ( ( rule__Type__CharacterAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1070:1: ( rule__Type__CharacterAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getCharacterAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1071:1: ( rule__Type__CharacterAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1071:2: rule__Type__CharacterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__CharacterAssignment_1_in_rule__Type__Alternatives2277);
                    rule__Type__CharacterAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getCharacterAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1075:6: ( ( rule__Type__LogicalAssignment_2 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1075:6: ( ( rule__Type__LogicalAssignment_2 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1076:1: ( rule__Type__LogicalAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getLogicalAssignment_2()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1077:1: ( rule__Type__LogicalAssignment_2 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1077:2: rule__Type__LogicalAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Type__LogicalAssignment_2_in_rule__Type__Alternatives2295);
                    rule__Type__LogicalAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getLogicalAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1081:6: ( ( rule__Type__RealAssignment_3 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1081:6: ( ( rule__Type__RealAssignment_3 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1082:1: ( rule__Type__RealAssignment_3 )
                    {
                     before(grammarAccess.getTypeAccess().getRealAssignment_3()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1083:1: ( rule__Type__RealAssignment_3 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1083:2: rule__Type__RealAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Type__RealAssignment_3_in_rule__Type__Alternatives2313);
                    rule__Type__RealAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getRealAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1087:6: ( ( rule__Type__Group_4__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1087:6: ( ( rule__Type__Group_4__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1088:1: ( rule__Type__Group_4__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_4()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1089:1: ( rule__Type__Group_4__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1089:2: rule__Type__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_4__0_in_rule__Type__Alternatives2331);
                    rule__Type__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1093:6: ( ( rule__Type__Group_5__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1093:6: ( ( rule__Type__Group_5__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1094:1: ( rule__Type__Group_5__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_5()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1095:1: ( rule__Type__Group_5__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1095:2: rule__Type__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_5__0_in_rule__Type__Alternatives2349);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1104:1: rule__IDOrWildcard__Alternatives : ( ( ( rule__IDOrWildcard__IdAssignment_0 ) ) | ( ( rule__IDOrWildcard__WildcardAssignment_1 ) ) );
    public final void rule__IDOrWildcard__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1108:1: ( ( ( rule__IDOrWildcard__IdAssignment_0 ) ) | ( ( rule__IDOrWildcard__WildcardAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==37) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1109:1: ( ( rule__IDOrWildcard__IdAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1109:1: ( ( rule__IDOrWildcard__IdAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1110:1: ( rule__IDOrWildcard__IdAssignment_0 )
                    {
                     before(grammarAccess.getIDOrWildcardAccess().getIdAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1111:1: ( rule__IDOrWildcard__IdAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1111:2: rule__IDOrWildcard__IdAssignment_0
                    {
                    pushFollow(FOLLOW_rule__IDOrWildcard__IdAssignment_0_in_rule__IDOrWildcard__Alternatives2382);
                    rule__IDOrWildcard__IdAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIDOrWildcardAccess().getIdAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1115:6: ( ( rule__IDOrWildcard__WildcardAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1115:6: ( ( rule__IDOrWildcard__WildcardAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1116:1: ( rule__IDOrWildcard__WildcardAssignment_1 )
                    {
                     before(grammarAccess.getIDOrWildcardAccess().getWildcardAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1117:1: ( rule__IDOrWildcard__WildcardAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1117:2: rule__IDOrWildcard__WildcardAssignment_1
                    {
                    pushFollow(FOLLOW_rule__IDOrWildcard__WildcardAssignment_1_in_rule__IDOrWildcard__Alternatives2400);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1126:1: rule__IDOrPathExpr__Alternatives : ( ( ruleIDOrWildcard ) | ( rulePathExpr ) | ( ( rule__IDOrPathExpr__LiteralAssignment_2 ) ) );
    public final void rule__IDOrPathExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1130:1: ( ( ruleIDOrWildcard ) | ( rulePathExpr ) | ( ( rule__IDOrPathExpr__LiteralAssignment_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 37:
                {
                alt8=1;
                }
                break;
            case 31:
                {
                alt8=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1131:1: ( ruleIDOrWildcard )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1131:1: ( ruleIDOrWildcard )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1132:1: ruleIDOrWildcard
                    {
                     before(grammarAccess.getIDOrPathExprAccess().getIDOrWildcardParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIDOrWildcard_in_rule__IDOrPathExpr__Alternatives2433);
                    ruleIDOrWildcard();

                    state._fsp--;

                     after(grammarAccess.getIDOrPathExprAccess().getIDOrWildcardParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1137:6: ( rulePathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1137:6: ( rulePathExpr )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1138:1: rulePathExpr
                    {
                     before(grammarAccess.getIDOrPathExprAccess().getPathExprParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePathExpr_in_rule__IDOrPathExpr__Alternatives2450);
                    rulePathExpr();

                    state._fsp--;

                     after(grammarAccess.getIDOrPathExprAccess().getPathExprParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1143:6: ( ( rule__IDOrPathExpr__LiteralAssignment_2 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1143:6: ( ( rule__IDOrPathExpr__LiteralAssignment_2 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1144:1: ( rule__IDOrPathExpr__LiteralAssignment_2 )
                    {
                     before(grammarAccess.getIDOrPathExprAccess().getLiteralAssignment_2()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1145:1: ( rule__IDOrPathExpr__LiteralAssignment_2 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1145:2: rule__IDOrPathExpr__LiteralAssignment_2
                    {
                    pushFollow(FOLLOW_rule__IDOrPathExpr__LiteralAssignment_2_in_rule__IDOrPathExpr__Alternatives2467);
                    rule__IDOrPathExpr__LiteralAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getIDOrPathExprAccess().getLiteralAssignment_2()); 

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


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1154:1: rule__Literal__Alternatives : ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) | ( RULE_STRING ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1158:1: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) | ( RULE_STRING ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1159:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1159:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1160:1: ( ( RULE_INT ) ) ( ( RULE_INT )* )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1160:1: ( ( RULE_INT ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1161:1: ( RULE_INT )
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1162:1: ( RULE_INT )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1162:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__Alternatives2503); 

                    }

                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 

                    }

                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1165:1: ( ( RULE_INT )* )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1166:1: ( RULE_INT )*
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1167:1: ( RULE_INT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_INT) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1167:3: RULE_INT
                    	    {
                    	    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__Alternatives2516); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1172:6: ( RULE_STRING )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1172:6: ( RULE_STRING )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1173:1: RULE_STRING
                    {
                     before(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Literal__Alternatives2537); 
                     after(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Language__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1185:1: rule__Language__Group__0 : rule__Language__Group__0__Impl rule__Language__Group__1 ;
    public final void rule__Language__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1189:1: ( rule__Language__Group__0__Impl rule__Language__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1190:2: rule__Language__Group__0__Impl rule__Language__Group__1
            {
            pushFollow(FOLLOW_rule__Language__Group__0__Impl_in_rule__Language__Group__02567);
            rule__Language__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__1_in_rule__Language__Group__02570);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1197:1: rule__Language__Group__0__Impl : ( 'language ' ) ;
    public final void rule__Language__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1201:1: ( ( 'language ' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1202:1: ( 'language ' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1202:1: ( 'language ' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1203:1: 'language '
            {
             before(grammarAccess.getLanguageAccess().getLanguageKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Language__Group__0__Impl2598); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1216:1: rule__Language__Group__1 : rule__Language__Group__1__Impl rule__Language__Group__2 ;
    public final void rule__Language__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1220:1: ( rule__Language__Group__1__Impl rule__Language__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1221:2: rule__Language__Group__1__Impl rule__Language__Group__2
            {
            pushFollow(FOLLOW_rule__Language__Group__1__Impl_in_rule__Language__Group__12629);
            rule__Language__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__2_in_rule__Language__Group__12632);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1228:1: rule__Language__Group__1__Impl : ( ( rule__Language__NameAssignment_1 ) ) ;
    public final void rule__Language__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1232:1: ( ( ( rule__Language__NameAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1233:1: ( ( rule__Language__NameAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1233:1: ( ( rule__Language__NameAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1234:1: ( rule__Language__NameAssignment_1 )
            {
             before(grammarAccess.getLanguageAccess().getNameAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1235:1: ( rule__Language__NameAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1235:2: rule__Language__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Language__NameAssignment_1_in_rule__Language__Group__1__Impl2659);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1245:1: rule__Language__Group__2 : rule__Language__Group__2__Impl rule__Language__Group__3 ;
    public final void rule__Language__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1249:1: ( rule__Language__Group__2__Impl rule__Language__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1250:2: rule__Language__Group__2__Impl rule__Language__Group__3
            {
            pushFollow(FOLLOW_rule__Language__Group__2__Impl_in_rule__Language__Group__22689);
            rule__Language__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__3_in_rule__Language__Group__22692);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1257:1: rule__Language__Group__2__Impl : ( ( rule__Language__UriAssignment_2 ) ) ;
    public final void rule__Language__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1261:1: ( ( ( rule__Language__UriAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1262:1: ( ( rule__Language__UriAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1262:1: ( ( rule__Language__UriAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1263:1: ( rule__Language__UriAssignment_2 )
            {
             before(grammarAccess.getLanguageAccess().getUriAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1264:1: ( rule__Language__UriAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1264:2: rule__Language__UriAssignment_2
            {
            pushFollow(FOLLOW_rule__Language__UriAssignment_2_in_rule__Language__Group__2__Impl2719);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1274:1: rule__Language__Group__3 : rule__Language__Group__3__Impl rule__Language__Group__4 ;
    public final void rule__Language__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1278:1: ( rule__Language__Group__3__Impl rule__Language__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1279:2: rule__Language__Group__3__Impl rule__Language__Group__4
            {
            pushFollow(FOLLOW_rule__Language__Group__3__Impl_in_rule__Language__Group__32749);
            rule__Language__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__4_in_rule__Language__Group__32752);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1286:1: rule__Language__Group__3__Impl : ( '{' ) ;
    public final void rule__Language__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1290:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1291:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1291:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1292:1: '{'
            {
             before(grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Language__Group__3__Impl2780); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1305:1: rule__Language__Group__4 : rule__Language__Group__4__Impl rule__Language__Group__5 ;
    public final void rule__Language__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1309:1: ( rule__Language__Group__4__Impl rule__Language__Group__5 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1310:2: rule__Language__Group__4__Impl rule__Language__Group__5
            {
            pushFollow(FOLLOW_rule__Language__Group__4__Impl_in_rule__Language__Group__42811);
            rule__Language__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__5_in_rule__Language__Group__42814);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1317:1: rule__Language__Group__4__Impl : ( ( rule__Language__ConceptDefAssignment_4 ) ) ;
    public final void rule__Language__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1321:1: ( ( ( rule__Language__ConceptDefAssignment_4 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1322:1: ( ( rule__Language__ConceptDefAssignment_4 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1322:1: ( ( rule__Language__ConceptDefAssignment_4 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1323:1: ( rule__Language__ConceptDefAssignment_4 )
            {
             before(grammarAccess.getLanguageAccess().getConceptDefAssignment_4()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1324:1: ( rule__Language__ConceptDefAssignment_4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1324:2: rule__Language__ConceptDefAssignment_4
            {
            pushFollow(FOLLOW_rule__Language__ConceptDefAssignment_4_in_rule__Language__Group__4__Impl2841);
            rule__Language__ConceptDefAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLanguageAccess().getConceptDefAssignment_4()); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1334:1: rule__Language__Group__5 : rule__Language__Group__5__Impl rule__Language__Group__6 ;
    public final void rule__Language__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1338:1: ( rule__Language__Group__5__Impl rule__Language__Group__6 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1339:2: rule__Language__Group__5__Impl rule__Language__Group__6
            {
            pushFollow(FOLLOW_rule__Language__Group__5__Impl_in_rule__Language__Group__52871);
            rule__Language__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__6_in_rule__Language__Group__52874);
            rule__Language__Group__6();

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1346:1: rule__Language__Group__5__Impl : ( ( rule__Language__ConceptDefAssignment_5 )* ) ;
    public final void rule__Language__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1350:1: ( ( ( rule__Language__ConceptDefAssignment_5 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1351:1: ( ( rule__Language__ConceptDefAssignment_5 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1351:1: ( ( rule__Language__ConceptDefAssignment_5 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1352:1: ( rule__Language__ConceptDefAssignment_5 )*
            {
             before(grammarAccess.getLanguageAccess().getConceptDefAssignment_5()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1353:1: ( rule__Language__ConceptDefAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==33) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1353:2: rule__Language__ConceptDefAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Language__ConceptDefAssignment_5_in_rule__Language__Group__5__Impl2901);
            	    rule__Language__ConceptDefAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getLanguageAccess().getConceptDefAssignment_5()); 

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


    // $ANTLR start "rule__Language__Group__6"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1363:1: rule__Language__Group__6 : rule__Language__Group__6__Impl ;
    public final void rule__Language__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1367:1: ( rule__Language__Group__6__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1368:2: rule__Language__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Language__Group__6__Impl_in_rule__Language__Group__62932);
            rule__Language__Group__6__Impl();

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
    // $ANTLR end "rule__Language__Group__6"


    // $ANTLR start "rule__Language__Group__6__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1374:1: rule__Language__Group__6__Impl : ( '}' ) ;
    public final void rule__Language__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1378:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1379:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1379:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1380:1: '}'
            {
             before(grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Language__Group__6__Impl2960); 
             after(grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Language__Group__6__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1407:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1411:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1412:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03005);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03008);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1419:1: rule__Annotation__Group__0__Impl : ( ( rule__Annotation__KeyAssignment_0 ) ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1423:1: ( ( ( rule__Annotation__KeyAssignment_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1424:1: ( ( rule__Annotation__KeyAssignment_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1424:1: ( ( rule__Annotation__KeyAssignment_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1425:1: ( rule__Annotation__KeyAssignment_0 )
            {
             before(grammarAccess.getAnnotationAccess().getKeyAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1426:1: ( rule__Annotation__KeyAssignment_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1426:2: rule__Annotation__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__Annotation__KeyAssignment_0_in_rule__Annotation__Group__0__Impl3035);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1436:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1440:1: ( rule__Annotation__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1441:2: rule__Annotation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13065);
            rule__Annotation__Group__1__Impl();

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1447:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__Group_1__0 )? ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1451:1: ( ( ( rule__Annotation__Group_1__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1452:1: ( ( rule__Annotation__Group_1__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1452:1: ( ( rule__Annotation__Group_1__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1453:1: ( rule__Annotation__Group_1__0 )?
            {
             before(grammarAccess.getAnnotationAccess().getGroup_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1454:1: ( rule__Annotation__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1454:2: rule__Annotation__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_1__0_in_rule__Annotation__Group__1__Impl3092);
                    rule__Annotation__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationAccess().getGroup_1()); 

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


    // $ANTLR start "rule__Annotation__Group_1__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1468:1: rule__Annotation__Group_1__0 : rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1 ;
    public final void rule__Annotation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1472:1: ( rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1473:2: rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_1__0__Impl_in_rule__Annotation__Group_1__03127);
            rule__Annotation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group_1__1_in_rule__Annotation__Group_1__03130);
            rule__Annotation__Group_1__1();

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
    // $ANTLR end "rule__Annotation__Group_1__0"


    // $ANTLR start "rule__Annotation__Group_1__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1480:1: rule__Annotation__Group_1__0__Impl : ( '=' ) ;
    public final void rule__Annotation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1484:1: ( ( '=' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1485:1: ( '=' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1485:1: ( '=' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1486:1: '='
            {
             before(grammarAccess.getAnnotationAccess().getEqualsSignKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__Annotation__Group_1__0__Impl3158); 
             after(grammarAccess.getAnnotationAccess().getEqualsSignKeyword_1_0()); 

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
    // $ANTLR end "rule__Annotation__Group_1__0__Impl"


    // $ANTLR start "rule__Annotation__Group_1__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1499:1: rule__Annotation__Group_1__1 : rule__Annotation__Group_1__1__Impl ;
    public final void rule__Annotation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1503:1: ( rule__Annotation__Group_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1504:2: rule__Annotation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_1__1__Impl_in_rule__Annotation__Group_1__13189);
            rule__Annotation__Group_1__1__Impl();

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
    // $ANTLR end "rule__Annotation__Group_1__1"


    // $ANTLR start "rule__Annotation__Group_1__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1510:1: rule__Annotation__Group_1__1__Impl : ( ( rule__Annotation__ValueAssignment_1_1 ) ) ;
    public final void rule__Annotation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1514:1: ( ( ( rule__Annotation__ValueAssignment_1_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1515:1: ( ( rule__Annotation__ValueAssignment_1_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1515:1: ( ( rule__Annotation__ValueAssignment_1_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1516:1: ( rule__Annotation__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAnnotationAccess().getValueAssignment_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1517:1: ( rule__Annotation__ValueAssignment_1_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1517:2: rule__Annotation__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Annotation__ValueAssignment_1_1_in_rule__Annotation__Group_1__1__Impl3216);
            rule__Annotation__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__Annotation__Group_1__1__Impl"


    // $ANTLR start "rule__AnonymousConceptDef__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1531:1: rule__AnonymousConceptDef__Group__0 : rule__AnonymousConceptDef__Group__0__Impl rule__AnonymousConceptDef__Group__1 ;
    public final void rule__AnonymousConceptDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1535:1: ( rule__AnonymousConceptDef__Group__0__Impl rule__AnonymousConceptDef__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1536:2: rule__AnonymousConceptDef__Group__0__Impl rule__AnonymousConceptDef__Group__1
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group__0__Impl_in_rule__AnonymousConceptDef__Group__03250);
            rule__AnonymousConceptDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group__1_in_rule__AnonymousConceptDef__Group__03253);
            rule__AnonymousConceptDef__Group__1();

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
    // $ANTLR end "rule__AnonymousConceptDef__Group__0"


    // $ANTLR start "rule__AnonymousConceptDef__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1543:1: rule__AnonymousConceptDef__Group__0__Impl : ( () ) ;
    public final void rule__AnonymousConceptDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1547:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1548:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1548:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1549:1: ()
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getConceptDefAction_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1550:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1552:1: 
            {
            }

             after(grammarAccess.getAnonymousConceptDefAccess().getConceptDefAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnonymousConceptDef__Group__0__Impl"


    // $ANTLR start "rule__AnonymousConceptDef__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1562:1: rule__AnonymousConceptDef__Group__1 : rule__AnonymousConceptDef__Group__1__Impl rule__AnonymousConceptDef__Group__2 ;
    public final void rule__AnonymousConceptDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1566:1: ( rule__AnonymousConceptDef__Group__1__Impl rule__AnonymousConceptDef__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1567:2: rule__AnonymousConceptDef__Group__1__Impl rule__AnonymousConceptDef__Group__2
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group__1__Impl_in_rule__AnonymousConceptDef__Group__13311);
            rule__AnonymousConceptDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group__2_in_rule__AnonymousConceptDef__Group__13314);
            rule__AnonymousConceptDef__Group__2();

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
    // $ANTLR end "rule__AnonymousConceptDef__Group__1"


    // $ANTLR start "rule__AnonymousConceptDef__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1574:1: rule__AnonymousConceptDef__Group__1__Impl : ( ( rule__AnonymousConceptDef__Group_1__0 )? ) ;
    public final void rule__AnonymousConceptDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1578:1: ( ( ( rule__AnonymousConceptDef__Group_1__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1579:1: ( ( rule__AnonymousConceptDef__Group_1__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1579:1: ( ( rule__AnonymousConceptDef__Group_1__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1580:1: ( rule__AnonymousConceptDef__Group_1__0 )?
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getGroup_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1581:1: ( rule__AnonymousConceptDef__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1581:2: rule__AnonymousConceptDef__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__0_in_rule__AnonymousConceptDef__Group__1__Impl3341);
                    rule__AnonymousConceptDef__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnonymousConceptDefAccess().getGroup_1()); 

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
    // $ANTLR end "rule__AnonymousConceptDef__Group__1__Impl"


    // $ANTLR start "rule__AnonymousConceptDef__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1591:1: rule__AnonymousConceptDef__Group__2 : rule__AnonymousConceptDef__Group__2__Impl ;
    public final void rule__AnonymousConceptDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1595:1: ( rule__AnonymousConceptDef__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1596:2: rule__AnonymousConceptDef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group__2__Impl_in_rule__AnonymousConceptDef__Group__23372);
            rule__AnonymousConceptDef__Group__2__Impl();

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
    // $ANTLR end "rule__AnonymousConceptDef__Group__2"


    // $ANTLR start "rule__AnonymousConceptDef__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1602:1: rule__AnonymousConceptDef__Group__2__Impl : ( ( rule__AnonymousConceptDef__Group_2__0 )? ) ;
    public final void rule__AnonymousConceptDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1606:1: ( ( ( rule__AnonymousConceptDef__Group_2__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1607:1: ( ( rule__AnonymousConceptDef__Group_2__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1607:1: ( ( rule__AnonymousConceptDef__Group_2__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1608:1: ( rule__AnonymousConceptDef__Group_2__0 )?
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1609:1: ( rule__AnonymousConceptDef__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1609:2: rule__AnonymousConceptDef__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__0_in_rule__AnonymousConceptDef__Group__2__Impl3399);
                    rule__AnonymousConceptDef__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnonymousConceptDefAccess().getGroup_2()); 

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
    // $ANTLR end "rule__AnonymousConceptDef__Group__2__Impl"


    // $ANTLR start "rule__AnonymousConceptDef__Group_1__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1625:1: rule__AnonymousConceptDef__Group_1__0 : rule__AnonymousConceptDef__Group_1__0__Impl rule__AnonymousConceptDef__Group_1__1 ;
    public final void rule__AnonymousConceptDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1629:1: ( rule__AnonymousConceptDef__Group_1__0__Impl rule__AnonymousConceptDef__Group_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1630:2: rule__AnonymousConceptDef__Group_1__0__Impl rule__AnonymousConceptDef__Group_1__1
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__0__Impl_in_rule__AnonymousConceptDef__Group_1__03436);
            rule__AnonymousConceptDef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__1_in_rule__AnonymousConceptDef__Group_1__03439);
            rule__AnonymousConceptDef__Group_1__1();

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
    // $ANTLR end "rule__AnonymousConceptDef__Group_1__0"


    // $ANTLR start "rule__AnonymousConceptDef__Group_1__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1637:1: rule__AnonymousConceptDef__Group_1__0__Impl : ( '<' ) ;
    public final void rule__AnonymousConceptDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1641:1: ( ( '<' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1642:1: ( '<' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1642:1: ( '<' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1643:1: '<'
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getLessThanSignKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__AnonymousConceptDef__Group_1__0__Impl3467); 
             after(grammarAccess.getAnonymousConceptDefAccess().getLessThanSignKeyword_1_0()); 

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
    // $ANTLR end "rule__AnonymousConceptDef__Group_1__0__Impl"


    // $ANTLR start "rule__AnonymousConceptDef__Group_1__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1656:1: rule__AnonymousConceptDef__Group_1__1 : rule__AnonymousConceptDef__Group_1__1__Impl rule__AnonymousConceptDef__Group_1__2 ;
    public final void rule__AnonymousConceptDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1660:1: ( rule__AnonymousConceptDef__Group_1__1__Impl rule__AnonymousConceptDef__Group_1__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1661:2: rule__AnonymousConceptDef__Group_1__1__Impl rule__AnonymousConceptDef__Group_1__2
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__1__Impl_in_rule__AnonymousConceptDef__Group_1__13498);
            rule__AnonymousConceptDef__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__2_in_rule__AnonymousConceptDef__Group_1__13501);
            rule__AnonymousConceptDef__Group_1__2();

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
    // $ANTLR end "rule__AnonymousConceptDef__Group_1__1"


    // $ANTLR start "rule__AnonymousConceptDef__Group_1__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1668:1: rule__AnonymousConceptDef__Group_1__1__Impl : ( ( rule__AnonymousConceptDef__MappingAssignment_1_1 ) ) ;
    public final void rule__AnonymousConceptDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1672:1: ( ( ( rule__AnonymousConceptDef__MappingAssignment_1_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1673:1: ( ( rule__AnonymousConceptDef__MappingAssignment_1_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1673:1: ( ( rule__AnonymousConceptDef__MappingAssignment_1_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1674:1: ( rule__AnonymousConceptDef__MappingAssignment_1_1 )
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getMappingAssignment_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1675:1: ( rule__AnonymousConceptDef__MappingAssignment_1_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1675:2: rule__AnonymousConceptDef__MappingAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__MappingAssignment_1_1_in_rule__AnonymousConceptDef__Group_1__1__Impl3528);
            rule__AnonymousConceptDef__MappingAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAnonymousConceptDefAccess().getMappingAssignment_1_1()); 

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
    // $ANTLR end "rule__AnonymousConceptDef__Group_1__1__Impl"


    // $ANTLR start "rule__AnonymousConceptDef__Group_1__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1685:1: rule__AnonymousConceptDef__Group_1__2 : rule__AnonymousConceptDef__Group_1__2__Impl ;
    public final void rule__AnonymousConceptDef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1689:1: ( rule__AnonymousConceptDef__Group_1__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1690:2: rule__AnonymousConceptDef__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__2__Impl_in_rule__AnonymousConceptDef__Group_1__23558);
            rule__AnonymousConceptDef__Group_1__2__Impl();

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
    // $ANTLR end "rule__AnonymousConceptDef__Group_1__2"


    // $ANTLR start "rule__AnonymousConceptDef__Group_1__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1696:1: rule__AnonymousConceptDef__Group_1__2__Impl : ( '>' ) ;
    public final void rule__AnonymousConceptDef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1700:1: ( ( '>' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1701:1: ( '>' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1701:1: ( '>' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1702:1: '>'
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getGreaterThanSignKeyword_1_2()); 
            match(input,17,FOLLOW_17_in_rule__AnonymousConceptDef__Group_1__2__Impl3586); 
             after(grammarAccess.getAnonymousConceptDefAccess().getGreaterThanSignKeyword_1_2()); 

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
    // $ANTLR end "rule__AnonymousConceptDef__Group_1__2__Impl"


    // $ANTLR start "rule__AnonymousConceptDef__Group_2__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1721:1: rule__AnonymousConceptDef__Group_2__0 : rule__AnonymousConceptDef__Group_2__0__Impl rule__AnonymousConceptDef__Group_2__1 ;
    public final void rule__AnonymousConceptDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1725:1: ( rule__AnonymousConceptDef__Group_2__0__Impl rule__AnonymousConceptDef__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1726:2: rule__AnonymousConceptDef__Group_2__0__Impl rule__AnonymousConceptDef__Group_2__1
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__0__Impl_in_rule__AnonymousConceptDef__Group_2__03623);
            rule__AnonymousConceptDef__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__1_in_rule__AnonymousConceptDef__Group_2__03626);
            rule__AnonymousConceptDef__Group_2__1();

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
    // $ANTLR end "rule__AnonymousConceptDef__Group_2__0"


    // $ANTLR start "rule__AnonymousConceptDef__Group_2__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1733:1: rule__AnonymousConceptDef__Group_2__0__Impl : ( '{' ) ;
    public final void rule__AnonymousConceptDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1737:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1738:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1738:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1739:1: '{'
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,13,FOLLOW_13_in_rule__AnonymousConceptDef__Group_2__0__Impl3654); 
             after(grammarAccess.getAnonymousConceptDefAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__AnonymousConceptDef__Group_2__0__Impl"


    // $ANTLR start "rule__AnonymousConceptDef__Group_2__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1752:1: rule__AnonymousConceptDef__Group_2__1 : rule__AnonymousConceptDef__Group_2__1__Impl rule__AnonymousConceptDef__Group_2__2 ;
    public final void rule__AnonymousConceptDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1756:1: ( rule__AnonymousConceptDef__Group_2__1__Impl rule__AnonymousConceptDef__Group_2__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1757:2: rule__AnonymousConceptDef__Group_2__1__Impl rule__AnonymousConceptDef__Group_2__2
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__1__Impl_in_rule__AnonymousConceptDef__Group_2__13685);
            rule__AnonymousConceptDef__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__2_in_rule__AnonymousConceptDef__Group_2__13688);
            rule__AnonymousConceptDef__Group_2__2();

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
    // $ANTLR end "rule__AnonymousConceptDef__Group_2__1"


    // $ANTLR start "rule__AnonymousConceptDef__Group_2__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1764:1: rule__AnonymousConceptDef__Group_2__1__Impl : ( ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )* ) ;
    public final void rule__AnonymousConceptDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1768:1: ( ( ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1769:1: ( ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1769:1: ( ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1770:1: ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )*
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getAnnotationAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1771:1: ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ANNOTATION_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1771:2: rule__AnonymousConceptDef__AnnotationAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__AnonymousConceptDef__AnnotationAssignment_2_1_in_rule__AnonymousConceptDef__Group_2__1__Impl3715);
            	    rule__AnonymousConceptDef__AnnotationAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getAnonymousConceptDefAccess().getAnnotationAssignment_2_1()); 

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
    // $ANTLR end "rule__AnonymousConceptDef__Group_2__1__Impl"


    // $ANTLR start "rule__AnonymousConceptDef__Group_2__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1781:1: rule__AnonymousConceptDef__Group_2__2 : rule__AnonymousConceptDef__Group_2__2__Impl rule__AnonymousConceptDef__Group_2__3 ;
    public final void rule__AnonymousConceptDef__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1785:1: ( rule__AnonymousConceptDef__Group_2__2__Impl rule__AnonymousConceptDef__Group_2__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1786:2: rule__AnonymousConceptDef__Group_2__2__Impl rule__AnonymousConceptDef__Group_2__3
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__2__Impl_in_rule__AnonymousConceptDef__Group_2__23746);
            rule__AnonymousConceptDef__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__3_in_rule__AnonymousConceptDef__Group_2__23749);
            rule__AnonymousConceptDef__Group_2__3();

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
    // $ANTLR end "rule__AnonymousConceptDef__Group_2__2"


    // $ANTLR start "rule__AnonymousConceptDef__Group_2__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1793:1: rule__AnonymousConceptDef__Group_2__2__Impl : ( ( rule__AnonymousConceptDef__ChildAssignment_2_2 )* ) ;
    public final void rule__AnonymousConceptDef__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1797:1: ( ( ( rule__AnonymousConceptDef__ChildAssignment_2_2 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1798:1: ( ( rule__AnonymousConceptDef__ChildAssignment_2_2 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1798:1: ( ( rule__AnonymousConceptDef__ChildAssignment_2_2 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1799:1: ( rule__AnonymousConceptDef__ChildAssignment_2_2 )*
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getChildAssignment_2_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1800:1: ( rule__AnonymousConceptDef__ChildAssignment_2_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1800:2: rule__AnonymousConceptDef__ChildAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__AnonymousConceptDef__ChildAssignment_2_2_in_rule__AnonymousConceptDef__Group_2__2__Impl3776);
            	    rule__AnonymousConceptDef__ChildAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAnonymousConceptDefAccess().getChildAssignment_2_2()); 

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
    // $ANTLR end "rule__AnonymousConceptDef__Group_2__2__Impl"


    // $ANTLR start "rule__AnonymousConceptDef__Group_2__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1810:1: rule__AnonymousConceptDef__Group_2__3 : rule__AnonymousConceptDef__Group_2__3__Impl ;
    public final void rule__AnonymousConceptDef__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1814:1: ( rule__AnonymousConceptDef__Group_2__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1815:2: rule__AnonymousConceptDef__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__3__Impl_in_rule__AnonymousConceptDef__Group_2__33807);
            rule__AnonymousConceptDef__Group_2__3__Impl();

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
    // $ANTLR end "rule__AnonymousConceptDef__Group_2__3"


    // $ANTLR start "rule__AnonymousConceptDef__Group_2__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1821:1: rule__AnonymousConceptDef__Group_2__3__Impl : ( '}' ) ;
    public final void rule__AnonymousConceptDef__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1825:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1826:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1826:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1827:1: '}'
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,14,FOLLOW_14_in_rule__AnonymousConceptDef__Group_2__3__Impl3835); 
             after(grammarAccess.getAnonymousConceptDefAccess().getRightCurlyBracketKeyword_2_3()); 

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
    // $ANTLR end "rule__AnonymousConceptDef__Group_2__3__Impl"


    // $ANTLR start "rule__NamedConceptDef__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1848:1: rule__NamedConceptDef__Group__0 : rule__NamedConceptDef__Group__0__Impl rule__NamedConceptDef__Group__1 ;
    public final void rule__NamedConceptDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1852:1: ( rule__NamedConceptDef__Group__0__Impl rule__NamedConceptDef__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1853:2: rule__NamedConceptDef__Group__0__Impl rule__NamedConceptDef__Group__1
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group__0__Impl_in_rule__NamedConceptDef__Group__03874);
            rule__NamedConceptDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group__1_in_rule__NamedConceptDef__Group__03877);
            rule__NamedConceptDef__Group__1();

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
    // $ANTLR end "rule__NamedConceptDef__Group__0"


    // $ANTLR start "rule__NamedConceptDef__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1860:1: rule__NamedConceptDef__Group__0__Impl : ( ( rule__NamedConceptDef__NamedAssignment_0 ) ) ;
    public final void rule__NamedConceptDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1864:1: ( ( ( rule__NamedConceptDef__NamedAssignment_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1865:1: ( ( rule__NamedConceptDef__NamedAssignment_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1865:1: ( ( rule__NamedConceptDef__NamedAssignment_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1866:1: ( rule__NamedConceptDef__NamedAssignment_0 )
            {
             before(grammarAccess.getNamedConceptDefAccess().getNamedAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1867:1: ( rule__NamedConceptDef__NamedAssignment_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1867:2: rule__NamedConceptDef__NamedAssignment_0
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__NamedAssignment_0_in_rule__NamedConceptDef__Group__0__Impl3904);
            rule__NamedConceptDef__NamedAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNamedConceptDefAccess().getNamedAssignment_0()); 

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
    // $ANTLR end "rule__NamedConceptDef__Group__0__Impl"


    // $ANTLR start "rule__NamedConceptDef__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1877:1: rule__NamedConceptDef__Group__1 : rule__NamedConceptDef__Group__1__Impl rule__NamedConceptDef__Group__2 ;
    public final void rule__NamedConceptDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1881:1: ( rule__NamedConceptDef__Group__1__Impl rule__NamedConceptDef__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1882:2: rule__NamedConceptDef__Group__1__Impl rule__NamedConceptDef__Group__2
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group__1__Impl_in_rule__NamedConceptDef__Group__13934);
            rule__NamedConceptDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group__2_in_rule__NamedConceptDef__Group__13937);
            rule__NamedConceptDef__Group__2();

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
    // $ANTLR end "rule__NamedConceptDef__Group__1"


    // $ANTLR start "rule__NamedConceptDef__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1889:1: rule__NamedConceptDef__Group__1__Impl : ( ( rule__NamedConceptDef__NameAssignment_1 ) ) ;
    public final void rule__NamedConceptDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1893:1: ( ( ( rule__NamedConceptDef__NameAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1894:1: ( ( rule__NamedConceptDef__NameAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1894:1: ( ( rule__NamedConceptDef__NameAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1895:1: ( rule__NamedConceptDef__NameAssignment_1 )
            {
             before(grammarAccess.getNamedConceptDefAccess().getNameAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1896:1: ( rule__NamedConceptDef__NameAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1896:2: rule__NamedConceptDef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__NameAssignment_1_in_rule__NamedConceptDef__Group__1__Impl3964);
            rule__NamedConceptDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedConceptDefAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__NamedConceptDef__Group__1__Impl"


    // $ANTLR start "rule__NamedConceptDef__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1906:1: rule__NamedConceptDef__Group__2 : rule__NamedConceptDef__Group__2__Impl rule__NamedConceptDef__Group__3 ;
    public final void rule__NamedConceptDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1910:1: ( rule__NamedConceptDef__Group__2__Impl rule__NamedConceptDef__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1911:2: rule__NamedConceptDef__Group__2__Impl rule__NamedConceptDef__Group__3
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group__2__Impl_in_rule__NamedConceptDef__Group__23994);
            rule__NamedConceptDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group__3_in_rule__NamedConceptDef__Group__23997);
            rule__NamedConceptDef__Group__3();

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
    // $ANTLR end "rule__NamedConceptDef__Group__2"


    // $ANTLR start "rule__NamedConceptDef__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1918:1: rule__NamedConceptDef__Group__2__Impl : ( ( rule__NamedConceptDef__Group_2__0 )? ) ;
    public final void rule__NamedConceptDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1922:1: ( ( ( rule__NamedConceptDef__Group_2__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1923:1: ( ( rule__NamedConceptDef__Group_2__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1923:1: ( ( rule__NamedConceptDef__Group_2__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1924:1: ( rule__NamedConceptDef__Group_2__0 )?
            {
             before(grammarAccess.getNamedConceptDefAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1925:1: ( rule__NamedConceptDef__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1925:2: rule__NamedConceptDef__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__0_in_rule__NamedConceptDef__Group__2__Impl4024);
                    rule__NamedConceptDef__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedConceptDefAccess().getGroup_2()); 

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
    // $ANTLR end "rule__NamedConceptDef__Group__2__Impl"


    // $ANTLR start "rule__NamedConceptDef__Group__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1935:1: rule__NamedConceptDef__Group__3 : rule__NamedConceptDef__Group__3__Impl ;
    public final void rule__NamedConceptDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1939:1: ( rule__NamedConceptDef__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1940:2: rule__NamedConceptDef__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group__3__Impl_in_rule__NamedConceptDef__Group__34055);
            rule__NamedConceptDef__Group__3__Impl();

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
    // $ANTLR end "rule__NamedConceptDef__Group__3"


    // $ANTLR start "rule__NamedConceptDef__Group__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1946:1: rule__NamedConceptDef__Group__3__Impl : ( ( rule__NamedConceptDef__Group_3__0 )? ) ;
    public final void rule__NamedConceptDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1950:1: ( ( ( rule__NamedConceptDef__Group_3__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1951:1: ( ( rule__NamedConceptDef__Group_3__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1951:1: ( ( rule__NamedConceptDef__Group_3__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1952:1: ( rule__NamedConceptDef__Group_3__0 )?
            {
             before(grammarAccess.getNamedConceptDefAccess().getGroup_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1953:1: ( rule__NamedConceptDef__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1953:2: rule__NamedConceptDef__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__0_in_rule__NamedConceptDef__Group__3__Impl4082);
                    rule__NamedConceptDef__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNamedConceptDefAccess().getGroup_3()); 

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
    // $ANTLR end "rule__NamedConceptDef__Group__3__Impl"


    // $ANTLR start "rule__NamedConceptDef__Group_2__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1971:1: rule__NamedConceptDef__Group_2__0 : rule__NamedConceptDef__Group_2__0__Impl rule__NamedConceptDef__Group_2__1 ;
    public final void rule__NamedConceptDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1975:1: ( rule__NamedConceptDef__Group_2__0__Impl rule__NamedConceptDef__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1976:2: rule__NamedConceptDef__Group_2__0__Impl rule__NamedConceptDef__Group_2__1
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__0__Impl_in_rule__NamedConceptDef__Group_2__04121);
            rule__NamedConceptDef__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__1_in_rule__NamedConceptDef__Group_2__04124);
            rule__NamedConceptDef__Group_2__1();

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
    // $ANTLR end "rule__NamedConceptDef__Group_2__0"


    // $ANTLR start "rule__NamedConceptDef__Group_2__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1983:1: rule__NamedConceptDef__Group_2__0__Impl : ( '<' ) ;
    public final void rule__NamedConceptDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1987:1: ( ( '<' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1988:1: ( '<' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1988:1: ( '<' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1989:1: '<'
            {
             before(grammarAccess.getNamedConceptDefAccess().getLessThanSignKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__NamedConceptDef__Group_2__0__Impl4152); 
             after(grammarAccess.getNamedConceptDefAccess().getLessThanSignKeyword_2_0()); 

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
    // $ANTLR end "rule__NamedConceptDef__Group_2__0__Impl"


    // $ANTLR start "rule__NamedConceptDef__Group_2__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2002:1: rule__NamedConceptDef__Group_2__1 : rule__NamedConceptDef__Group_2__1__Impl rule__NamedConceptDef__Group_2__2 ;
    public final void rule__NamedConceptDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2006:1: ( rule__NamedConceptDef__Group_2__1__Impl rule__NamedConceptDef__Group_2__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2007:2: rule__NamedConceptDef__Group_2__1__Impl rule__NamedConceptDef__Group_2__2
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__1__Impl_in_rule__NamedConceptDef__Group_2__14183);
            rule__NamedConceptDef__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__2_in_rule__NamedConceptDef__Group_2__14186);
            rule__NamedConceptDef__Group_2__2();

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
    // $ANTLR end "rule__NamedConceptDef__Group_2__1"


    // $ANTLR start "rule__NamedConceptDef__Group_2__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2014:1: rule__NamedConceptDef__Group_2__1__Impl : ( ( rule__NamedConceptDef__MappingAssignment_2_1 ) ) ;
    public final void rule__NamedConceptDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2018:1: ( ( ( rule__NamedConceptDef__MappingAssignment_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2019:1: ( ( rule__NamedConceptDef__MappingAssignment_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2019:1: ( ( rule__NamedConceptDef__MappingAssignment_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2020:1: ( rule__NamedConceptDef__MappingAssignment_2_1 )
            {
             before(grammarAccess.getNamedConceptDefAccess().getMappingAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2021:1: ( rule__NamedConceptDef__MappingAssignment_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2021:2: rule__NamedConceptDef__MappingAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__MappingAssignment_2_1_in_rule__NamedConceptDef__Group_2__1__Impl4213);
            rule__NamedConceptDef__MappingAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNamedConceptDefAccess().getMappingAssignment_2_1()); 

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
    // $ANTLR end "rule__NamedConceptDef__Group_2__1__Impl"


    // $ANTLR start "rule__NamedConceptDef__Group_2__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2031:1: rule__NamedConceptDef__Group_2__2 : rule__NamedConceptDef__Group_2__2__Impl ;
    public final void rule__NamedConceptDef__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2035:1: ( rule__NamedConceptDef__Group_2__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2036:2: rule__NamedConceptDef__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__2__Impl_in_rule__NamedConceptDef__Group_2__24243);
            rule__NamedConceptDef__Group_2__2__Impl();

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
    // $ANTLR end "rule__NamedConceptDef__Group_2__2"


    // $ANTLR start "rule__NamedConceptDef__Group_2__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2042:1: rule__NamedConceptDef__Group_2__2__Impl : ( '>' ) ;
    public final void rule__NamedConceptDef__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2046:1: ( ( '>' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2047:1: ( '>' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2047:1: ( '>' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2048:1: '>'
            {
             before(grammarAccess.getNamedConceptDefAccess().getGreaterThanSignKeyword_2_2()); 
            match(input,17,FOLLOW_17_in_rule__NamedConceptDef__Group_2__2__Impl4271); 
             after(grammarAccess.getNamedConceptDefAccess().getGreaterThanSignKeyword_2_2()); 

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
    // $ANTLR end "rule__NamedConceptDef__Group_2__2__Impl"


    // $ANTLR start "rule__NamedConceptDef__Group_3__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2067:1: rule__NamedConceptDef__Group_3__0 : rule__NamedConceptDef__Group_3__0__Impl rule__NamedConceptDef__Group_3__1 ;
    public final void rule__NamedConceptDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2071:1: ( rule__NamedConceptDef__Group_3__0__Impl rule__NamedConceptDef__Group_3__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2072:2: rule__NamedConceptDef__Group_3__0__Impl rule__NamedConceptDef__Group_3__1
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__0__Impl_in_rule__NamedConceptDef__Group_3__04308);
            rule__NamedConceptDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__1_in_rule__NamedConceptDef__Group_3__04311);
            rule__NamedConceptDef__Group_3__1();

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
    // $ANTLR end "rule__NamedConceptDef__Group_3__0"


    // $ANTLR start "rule__NamedConceptDef__Group_3__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2079:1: rule__NamedConceptDef__Group_3__0__Impl : ( '{' ) ;
    public final void rule__NamedConceptDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2083:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2084:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2084:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2085:1: '{'
            {
             before(grammarAccess.getNamedConceptDefAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__NamedConceptDef__Group_3__0__Impl4339); 
             after(grammarAccess.getNamedConceptDefAccess().getLeftCurlyBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__NamedConceptDef__Group_3__0__Impl"


    // $ANTLR start "rule__NamedConceptDef__Group_3__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2098:1: rule__NamedConceptDef__Group_3__1 : rule__NamedConceptDef__Group_3__1__Impl rule__NamedConceptDef__Group_3__2 ;
    public final void rule__NamedConceptDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2102:1: ( rule__NamedConceptDef__Group_3__1__Impl rule__NamedConceptDef__Group_3__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2103:2: rule__NamedConceptDef__Group_3__1__Impl rule__NamedConceptDef__Group_3__2
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__1__Impl_in_rule__NamedConceptDef__Group_3__14370);
            rule__NamedConceptDef__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__2_in_rule__NamedConceptDef__Group_3__14373);
            rule__NamedConceptDef__Group_3__2();

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
    // $ANTLR end "rule__NamedConceptDef__Group_3__1"


    // $ANTLR start "rule__NamedConceptDef__Group_3__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2110:1: rule__NamedConceptDef__Group_3__1__Impl : ( ( rule__NamedConceptDef__AnnotationAssignment_3_1 )* ) ;
    public final void rule__NamedConceptDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2114:1: ( ( ( rule__NamedConceptDef__AnnotationAssignment_3_1 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2115:1: ( ( rule__NamedConceptDef__AnnotationAssignment_3_1 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2115:1: ( ( rule__NamedConceptDef__AnnotationAssignment_3_1 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2116:1: ( rule__NamedConceptDef__AnnotationAssignment_3_1 )*
            {
             before(grammarAccess.getNamedConceptDefAccess().getAnnotationAssignment_3_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2117:1: ( rule__NamedConceptDef__AnnotationAssignment_3_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ANNOTATION_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2117:2: rule__NamedConceptDef__AnnotationAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__NamedConceptDef__AnnotationAssignment_3_1_in_rule__NamedConceptDef__Group_3__1__Impl4400);
            	    rule__NamedConceptDef__AnnotationAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getNamedConceptDefAccess().getAnnotationAssignment_3_1()); 

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
    // $ANTLR end "rule__NamedConceptDef__Group_3__1__Impl"


    // $ANTLR start "rule__NamedConceptDef__Group_3__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2127:1: rule__NamedConceptDef__Group_3__2 : rule__NamedConceptDef__Group_3__2__Impl rule__NamedConceptDef__Group_3__3 ;
    public final void rule__NamedConceptDef__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2131:1: ( rule__NamedConceptDef__Group_3__2__Impl rule__NamedConceptDef__Group_3__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2132:2: rule__NamedConceptDef__Group_3__2__Impl rule__NamedConceptDef__Group_3__3
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__2__Impl_in_rule__NamedConceptDef__Group_3__24431);
            rule__NamedConceptDef__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__3_in_rule__NamedConceptDef__Group_3__24434);
            rule__NamedConceptDef__Group_3__3();

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
    // $ANTLR end "rule__NamedConceptDef__Group_3__2"


    // $ANTLR start "rule__NamedConceptDef__Group_3__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2139:1: rule__NamedConceptDef__Group_3__2__Impl : ( ( rule__NamedConceptDef__ChildAssignment_3_2 )* ) ;
    public final void rule__NamedConceptDef__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2143:1: ( ( ( rule__NamedConceptDef__ChildAssignment_3_2 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2144:1: ( ( rule__NamedConceptDef__ChildAssignment_3_2 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2144:1: ( ( rule__NamedConceptDef__ChildAssignment_3_2 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2145:1: ( rule__NamedConceptDef__ChildAssignment_3_2 )*
            {
             before(grammarAccess.getNamedConceptDefAccess().getChildAssignment_3_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2146:1: ( rule__NamedConceptDef__ChildAssignment_3_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==36) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2146:2: rule__NamedConceptDef__ChildAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__NamedConceptDef__ChildAssignment_3_2_in_rule__NamedConceptDef__Group_3__2__Impl4461);
            	    rule__NamedConceptDef__ChildAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getNamedConceptDefAccess().getChildAssignment_3_2()); 

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
    // $ANTLR end "rule__NamedConceptDef__Group_3__2__Impl"


    // $ANTLR start "rule__NamedConceptDef__Group_3__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2156:1: rule__NamedConceptDef__Group_3__3 : rule__NamedConceptDef__Group_3__3__Impl ;
    public final void rule__NamedConceptDef__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2160:1: ( rule__NamedConceptDef__Group_3__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2161:2: rule__NamedConceptDef__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__3__Impl_in_rule__NamedConceptDef__Group_3__34492);
            rule__NamedConceptDef__Group_3__3__Impl();

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
    // $ANTLR end "rule__NamedConceptDef__Group_3__3"


    // $ANTLR start "rule__NamedConceptDef__Group_3__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2167:1: rule__NamedConceptDef__Group_3__3__Impl : ( '}' ) ;
    public final void rule__NamedConceptDef__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2171:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2172:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2172:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2173:1: '}'
            {
             before(grammarAccess.getNamedConceptDefAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,14,FOLLOW_14_in_rule__NamedConceptDef__Group_3__3__Impl4520); 
             after(grammarAccess.getNamedConceptDefAccess().getRightCurlyBracketKeyword_3_3()); 

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
    // $ANTLR end "rule__NamedConceptDef__Group_3__3__Impl"


    // $ANTLR start "rule__TopConceptDef__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2194:1: rule__TopConceptDef__Group__0 : rule__TopConceptDef__Group__0__Impl rule__TopConceptDef__Group__1 ;
    public final void rule__TopConceptDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2198:1: ( rule__TopConceptDef__Group__0__Impl rule__TopConceptDef__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2199:2: rule__TopConceptDef__Group__0__Impl rule__TopConceptDef__Group__1
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group__0__Impl_in_rule__TopConceptDef__Group__04559);
            rule__TopConceptDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group__1_in_rule__TopConceptDef__Group__04562);
            rule__TopConceptDef__Group__1();

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
    // $ANTLR end "rule__TopConceptDef__Group__0"


    // $ANTLR start "rule__TopConceptDef__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2206:1: rule__TopConceptDef__Group__0__Impl : ( ( rule__TopConceptDef__TopAssignment_0 ) ) ;
    public final void rule__TopConceptDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2210:1: ( ( ( rule__TopConceptDef__TopAssignment_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2211:1: ( ( rule__TopConceptDef__TopAssignment_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2211:1: ( ( rule__TopConceptDef__TopAssignment_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2212:1: ( rule__TopConceptDef__TopAssignment_0 )
            {
             before(grammarAccess.getTopConceptDefAccess().getTopAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2213:1: ( rule__TopConceptDef__TopAssignment_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2213:2: rule__TopConceptDef__TopAssignment_0
            {
            pushFollow(FOLLOW_rule__TopConceptDef__TopAssignment_0_in_rule__TopConceptDef__Group__0__Impl4589);
            rule__TopConceptDef__TopAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTopConceptDefAccess().getTopAssignment_0()); 

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
    // $ANTLR end "rule__TopConceptDef__Group__0__Impl"


    // $ANTLR start "rule__TopConceptDef__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2223:1: rule__TopConceptDef__Group__1 : rule__TopConceptDef__Group__1__Impl rule__TopConceptDef__Group__2 ;
    public final void rule__TopConceptDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2227:1: ( rule__TopConceptDef__Group__1__Impl rule__TopConceptDef__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2228:2: rule__TopConceptDef__Group__1__Impl rule__TopConceptDef__Group__2
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group__1__Impl_in_rule__TopConceptDef__Group__14619);
            rule__TopConceptDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group__2_in_rule__TopConceptDef__Group__14622);
            rule__TopConceptDef__Group__2();

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
    // $ANTLR end "rule__TopConceptDef__Group__1"


    // $ANTLR start "rule__TopConceptDef__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2235:1: rule__TopConceptDef__Group__1__Impl : ( ( rule__TopConceptDef__NamedAssignment_1 ) ) ;
    public final void rule__TopConceptDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2239:1: ( ( ( rule__TopConceptDef__NamedAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2240:1: ( ( rule__TopConceptDef__NamedAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2240:1: ( ( rule__TopConceptDef__NamedAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2241:1: ( rule__TopConceptDef__NamedAssignment_1 )
            {
             before(grammarAccess.getTopConceptDefAccess().getNamedAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2242:1: ( rule__TopConceptDef__NamedAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2242:2: rule__TopConceptDef__NamedAssignment_1
            {
            pushFollow(FOLLOW_rule__TopConceptDef__NamedAssignment_1_in_rule__TopConceptDef__Group__1__Impl4649);
            rule__TopConceptDef__NamedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTopConceptDefAccess().getNamedAssignment_1()); 

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
    // $ANTLR end "rule__TopConceptDef__Group__1__Impl"


    // $ANTLR start "rule__TopConceptDef__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2252:1: rule__TopConceptDef__Group__2 : rule__TopConceptDef__Group__2__Impl rule__TopConceptDef__Group__3 ;
    public final void rule__TopConceptDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2256:1: ( rule__TopConceptDef__Group__2__Impl rule__TopConceptDef__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2257:2: rule__TopConceptDef__Group__2__Impl rule__TopConceptDef__Group__3
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group__2__Impl_in_rule__TopConceptDef__Group__24679);
            rule__TopConceptDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group__3_in_rule__TopConceptDef__Group__24682);
            rule__TopConceptDef__Group__3();

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
    // $ANTLR end "rule__TopConceptDef__Group__2"


    // $ANTLR start "rule__TopConceptDef__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2264:1: rule__TopConceptDef__Group__2__Impl : ( ( rule__TopConceptDef__NameAssignment_2 ) ) ;
    public final void rule__TopConceptDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2268:1: ( ( ( rule__TopConceptDef__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2269:1: ( ( rule__TopConceptDef__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2269:1: ( ( rule__TopConceptDef__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2270:1: ( rule__TopConceptDef__NameAssignment_2 )
            {
             before(grammarAccess.getTopConceptDefAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2271:1: ( rule__TopConceptDef__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2271:2: rule__TopConceptDef__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TopConceptDef__NameAssignment_2_in_rule__TopConceptDef__Group__2__Impl4709);
            rule__TopConceptDef__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTopConceptDefAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__TopConceptDef__Group__2__Impl"


    // $ANTLR start "rule__TopConceptDef__Group__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2281:1: rule__TopConceptDef__Group__3 : rule__TopConceptDef__Group__3__Impl rule__TopConceptDef__Group__4 ;
    public final void rule__TopConceptDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2285:1: ( rule__TopConceptDef__Group__3__Impl rule__TopConceptDef__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2286:2: rule__TopConceptDef__Group__3__Impl rule__TopConceptDef__Group__4
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group__3__Impl_in_rule__TopConceptDef__Group__34739);
            rule__TopConceptDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group__4_in_rule__TopConceptDef__Group__34742);
            rule__TopConceptDef__Group__4();

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
    // $ANTLR end "rule__TopConceptDef__Group__3"


    // $ANTLR start "rule__TopConceptDef__Group__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2293:1: rule__TopConceptDef__Group__3__Impl : ( ( rule__TopConceptDef__Group_3__0 )? ) ;
    public final void rule__TopConceptDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2297:1: ( ( ( rule__TopConceptDef__Group_3__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2298:1: ( ( rule__TopConceptDef__Group_3__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2298:1: ( ( rule__TopConceptDef__Group_3__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2299:1: ( rule__TopConceptDef__Group_3__0 )?
            {
             before(grammarAccess.getTopConceptDefAccess().getGroup_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2300:1: ( rule__TopConceptDef__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2300:2: rule__TopConceptDef__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TopConceptDef__Group_3__0_in_rule__TopConceptDef__Group__3__Impl4769);
                    rule__TopConceptDef__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopConceptDefAccess().getGroup_3()); 

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
    // $ANTLR end "rule__TopConceptDef__Group__3__Impl"


    // $ANTLR start "rule__TopConceptDef__Group__4"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2310:1: rule__TopConceptDef__Group__4 : rule__TopConceptDef__Group__4__Impl ;
    public final void rule__TopConceptDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2314:1: ( rule__TopConceptDef__Group__4__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2315:2: rule__TopConceptDef__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group__4__Impl_in_rule__TopConceptDef__Group__44800);
            rule__TopConceptDef__Group__4__Impl();

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
    // $ANTLR end "rule__TopConceptDef__Group__4"


    // $ANTLR start "rule__TopConceptDef__Group__4__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2321:1: rule__TopConceptDef__Group__4__Impl : ( ( rule__TopConceptDef__Group_4__0 )? ) ;
    public final void rule__TopConceptDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2325:1: ( ( ( rule__TopConceptDef__Group_4__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2326:1: ( ( rule__TopConceptDef__Group_4__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2326:1: ( ( rule__TopConceptDef__Group_4__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2327:1: ( rule__TopConceptDef__Group_4__0 )?
            {
             before(grammarAccess.getTopConceptDefAccess().getGroup_4()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2328:1: ( rule__TopConceptDef__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2328:2: rule__TopConceptDef__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TopConceptDef__Group_4__0_in_rule__TopConceptDef__Group__4__Impl4827);
                    rule__TopConceptDef__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTopConceptDefAccess().getGroup_4()); 

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
    // $ANTLR end "rule__TopConceptDef__Group__4__Impl"


    // $ANTLR start "rule__TopConceptDef__Group_3__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2348:1: rule__TopConceptDef__Group_3__0 : rule__TopConceptDef__Group_3__0__Impl rule__TopConceptDef__Group_3__1 ;
    public final void rule__TopConceptDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2352:1: ( rule__TopConceptDef__Group_3__0__Impl rule__TopConceptDef__Group_3__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2353:2: rule__TopConceptDef__Group_3__0__Impl rule__TopConceptDef__Group_3__1
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_3__0__Impl_in_rule__TopConceptDef__Group_3__04868);
            rule__TopConceptDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group_3__1_in_rule__TopConceptDef__Group_3__04871);
            rule__TopConceptDef__Group_3__1();

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
    // $ANTLR end "rule__TopConceptDef__Group_3__0"


    // $ANTLR start "rule__TopConceptDef__Group_3__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2360:1: rule__TopConceptDef__Group_3__0__Impl : ( '<' ) ;
    public final void rule__TopConceptDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2364:1: ( ( '<' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2365:1: ( '<' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2365:1: ( '<' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2366:1: '<'
            {
             before(grammarAccess.getTopConceptDefAccess().getLessThanSignKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__TopConceptDef__Group_3__0__Impl4899); 
             after(grammarAccess.getTopConceptDefAccess().getLessThanSignKeyword_3_0()); 

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
    // $ANTLR end "rule__TopConceptDef__Group_3__0__Impl"


    // $ANTLR start "rule__TopConceptDef__Group_3__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2379:1: rule__TopConceptDef__Group_3__1 : rule__TopConceptDef__Group_3__1__Impl rule__TopConceptDef__Group_3__2 ;
    public final void rule__TopConceptDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2383:1: ( rule__TopConceptDef__Group_3__1__Impl rule__TopConceptDef__Group_3__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2384:2: rule__TopConceptDef__Group_3__1__Impl rule__TopConceptDef__Group_3__2
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_3__1__Impl_in_rule__TopConceptDef__Group_3__14930);
            rule__TopConceptDef__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group_3__2_in_rule__TopConceptDef__Group_3__14933);
            rule__TopConceptDef__Group_3__2();

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
    // $ANTLR end "rule__TopConceptDef__Group_3__1"


    // $ANTLR start "rule__TopConceptDef__Group_3__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2391:1: rule__TopConceptDef__Group_3__1__Impl : ( ( rule__TopConceptDef__MappingAssignment_3_1 ) ) ;
    public final void rule__TopConceptDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2395:1: ( ( ( rule__TopConceptDef__MappingAssignment_3_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2396:1: ( ( rule__TopConceptDef__MappingAssignment_3_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2396:1: ( ( rule__TopConceptDef__MappingAssignment_3_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2397:1: ( rule__TopConceptDef__MappingAssignment_3_1 )
            {
             before(grammarAccess.getTopConceptDefAccess().getMappingAssignment_3_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2398:1: ( rule__TopConceptDef__MappingAssignment_3_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2398:2: rule__TopConceptDef__MappingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TopConceptDef__MappingAssignment_3_1_in_rule__TopConceptDef__Group_3__1__Impl4960);
            rule__TopConceptDef__MappingAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTopConceptDefAccess().getMappingAssignment_3_1()); 

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
    // $ANTLR end "rule__TopConceptDef__Group_3__1__Impl"


    // $ANTLR start "rule__TopConceptDef__Group_3__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2408:1: rule__TopConceptDef__Group_3__2 : rule__TopConceptDef__Group_3__2__Impl ;
    public final void rule__TopConceptDef__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2412:1: ( rule__TopConceptDef__Group_3__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2413:2: rule__TopConceptDef__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_3__2__Impl_in_rule__TopConceptDef__Group_3__24990);
            rule__TopConceptDef__Group_3__2__Impl();

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
    // $ANTLR end "rule__TopConceptDef__Group_3__2"


    // $ANTLR start "rule__TopConceptDef__Group_3__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2419:1: rule__TopConceptDef__Group_3__2__Impl : ( '>' ) ;
    public final void rule__TopConceptDef__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2423:1: ( ( '>' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2424:1: ( '>' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2424:1: ( '>' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2425:1: '>'
            {
             before(grammarAccess.getTopConceptDefAccess().getGreaterThanSignKeyword_3_2()); 
            match(input,17,FOLLOW_17_in_rule__TopConceptDef__Group_3__2__Impl5018); 
             after(grammarAccess.getTopConceptDefAccess().getGreaterThanSignKeyword_3_2()); 

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
    // $ANTLR end "rule__TopConceptDef__Group_3__2__Impl"


    // $ANTLR start "rule__TopConceptDef__Group_4__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2444:1: rule__TopConceptDef__Group_4__0 : rule__TopConceptDef__Group_4__0__Impl rule__TopConceptDef__Group_4__1 ;
    public final void rule__TopConceptDef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2448:1: ( rule__TopConceptDef__Group_4__0__Impl rule__TopConceptDef__Group_4__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2449:2: rule__TopConceptDef__Group_4__0__Impl rule__TopConceptDef__Group_4__1
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__0__Impl_in_rule__TopConceptDef__Group_4__05055);
            rule__TopConceptDef__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__1_in_rule__TopConceptDef__Group_4__05058);
            rule__TopConceptDef__Group_4__1();

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
    // $ANTLR end "rule__TopConceptDef__Group_4__0"


    // $ANTLR start "rule__TopConceptDef__Group_4__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2456:1: rule__TopConceptDef__Group_4__0__Impl : ( '{' ) ;
    public final void rule__TopConceptDef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2460:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2461:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2461:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2462:1: '{'
            {
             before(grammarAccess.getTopConceptDefAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__TopConceptDef__Group_4__0__Impl5086); 
             after(grammarAccess.getTopConceptDefAccess().getLeftCurlyBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__TopConceptDef__Group_4__0__Impl"


    // $ANTLR start "rule__TopConceptDef__Group_4__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2475:1: rule__TopConceptDef__Group_4__1 : rule__TopConceptDef__Group_4__1__Impl rule__TopConceptDef__Group_4__2 ;
    public final void rule__TopConceptDef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2479:1: ( rule__TopConceptDef__Group_4__1__Impl rule__TopConceptDef__Group_4__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2480:2: rule__TopConceptDef__Group_4__1__Impl rule__TopConceptDef__Group_4__2
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__1__Impl_in_rule__TopConceptDef__Group_4__15117);
            rule__TopConceptDef__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__2_in_rule__TopConceptDef__Group_4__15120);
            rule__TopConceptDef__Group_4__2();

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
    // $ANTLR end "rule__TopConceptDef__Group_4__1"


    // $ANTLR start "rule__TopConceptDef__Group_4__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2487:1: rule__TopConceptDef__Group_4__1__Impl : ( ( rule__TopConceptDef__AnnotationAssignment_4_1 )* ) ;
    public final void rule__TopConceptDef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2491:1: ( ( ( rule__TopConceptDef__AnnotationAssignment_4_1 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2492:1: ( ( rule__TopConceptDef__AnnotationAssignment_4_1 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2492:1: ( ( rule__TopConceptDef__AnnotationAssignment_4_1 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2493:1: ( rule__TopConceptDef__AnnotationAssignment_4_1 )*
            {
             before(grammarAccess.getTopConceptDefAccess().getAnnotationAssignment_4_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2494:1: ( rule__TopConceptDef__AnnotationAssignment_4_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ANNOTATION_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2494:2: rule__TopConceptDef__AnnotationAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__TopConceptDef__AnnotationAssignment_4_1_in_rule__TopConceptDef__Group_4__1__Impl5147);
            	    rule__TopConceptDef__AnnotationAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getTopConceptDefAccess().getAnnotationAssignment_4_1()); 

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
    // $ANTLR end "rule__TopConceptDef__Group_4__1__Impl"


    // $ANTLR start "rule__TopConceptDef__Group_4__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2504:1: rule__TopConceptDef__Group_4__2 : rule__TopConceptDef__Group_4__2__Impl rule__TopConceptDef__Group_4__3 ;
    public final void rule__TopConceptDef__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2508:1: ( rule__TopConceptDef__Group_4__2__Impl rule__TopConceptDef__Group_4__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2509:2: rule__TopConceptDef__Group_4__2__Impl rule__TopConceptDef__Group_4__3
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__2__Impl_in_rule__TopConceptDef__Group_4__25178);
            rule__TopConceptDef__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__3_in_rule__TopConceptDef__Group_4__25181);
            rule__TopConceptDef__Group_4__3();

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
    // $ANTLR end "rule__TopConceptDef__Group_4__2"


    // $ANTLR start "rule__TopConceptDef__Group_4__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2516:1: rule__TopConceptDef__Group_4__2__Impl : ( ( rule__TopConceptDef__ChildAssignment_4_2 )* ) ;
    public final void rule__TopConceptDef__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2520:1: ( ( ( rule__TopConceptDef__ChildAssignment_4_2 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2521:1: ( ( rule__TopConceptDef__ChildAssignment_4_2 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2521:1: ( ( rule__TopConceptDef__ChildAssignment_4_2 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2522:1: ( rule__TopConceptDef__ChildAssignment_4_2 )*
            {
             before(grammarAccess.getTopConceptDefAccess().getChildAssignment_4_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2523:1: ( rule__TopConceptDef__ChildAssignment_4_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==36) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2523:2: rule__TopConceptDef__ChildAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_rule__TopConceptDef__ChildAssignment_4_2_in_rule__TopConceptDef__Group_4__2__Impl5208);
            	    rule__TopConceptDef__ChildAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getTopConceptDefAccess().getChildAssignment_4_2()); 

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
    // $ANTLR end "rule__TopConceptDef__Group_4__2__Impl"


    // $ANTLR start "rule__TopConceptDef__Group_4__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2533:1: rule__TopConceptDef__Group_4__3 : rule__TopConceptDef__Group_4__3__Impl ;
    public final void rule__TopConceptDef__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2537:1: ( rule__TopConceptDef__Group_4__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2538:2: rule__TopConceptDef__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__3__Impl_in_rule__TopConceptDef__Group_4__35239);
            rule__TopConceptDef__Group_4__3__Impl();

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
    // $ANTLR end "rule__TopConceptDef__Group_4__3"


    // $ANTLR start "rule__TopConceptDef__Group_4__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2544:1: rule__TopConceptDef__Group_4__3__Impl : ( '}' ) ;
    public final void rule__TopConceptDef__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2548:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2549:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2549:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2550:1: '}'
            {
             before(grammarAccess.getTopConceptDefAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,14,FOLLOW_14_in_rule__TopConceptDef__Group_4__3__Impl5267); 
             after(grammarAccess.getTopConceptDefAccess().getRightCurlyBracketKeyword_4_3()); 

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
    // $ANTLR end "rule__TopConceptDef__Group_4__3__Impl"


    // $ANTLR start "rule__Subconcept__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2571:1: rule__Subconcept__Group__0 : rule__Subconcept__Group__0__Impl rule__Subconcept__Group__1 ;
    public final void rule__Subconcept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2575:1: ( rule__Subconcept__Group__0__Impl rule__Subconcept__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2576:2: rule__Subconcept__Group__0__Impl rule__Subconcept__Group__1
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__0__Impl_in_rule__Subconcept__Group__05306);
            rule__Subconcept__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group__1_in_rule__Subconcept__Group__05309);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2583:1: rule__Subconcept__Group__0__Impl : ( ( rule__Subconcept__NameAssignment_0 ) ) ;
    public final void rule__Subconcept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2587:1: ( ( ( rule__Subconcept__NameAssignment_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2588:1: ( ( rule__Subconcept__NameAssignment_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2588:1: ( ( rule__Subconcept__NameAssignment_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2589:1: ( rule__Subconcept__NameAssignment_0 )
            {
             before(grammarAccess.getSubconceptAccess().getNameAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2590:1: ( rule__Subconcept__NameAssignment_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2590:2: rule__Subconcept__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Subconcept__NameAssignment_0_in_rule__Subconcept__Group__0__Impl5336);
            rule__Subconcept__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSubconceptAccess().getNameAssignment_0()); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2600:1: rule__Subconcept__Group__1 : rule__Subconcept__Group__1__Impl rule__Subconcept__Group__2 ;
    public final void rule__Subconcept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2604:1: ( rule__Subconcept__Group__1__Impl rule__Subconcept__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2605:2: rule__Subconcept__Group__1__Impl rule__Subconcept__Group__2
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__1__Impl_in_rule__Subconcept__Group__15366);
            rule__Subconcept__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group__2_in_rule__Subconcept__Group__15369);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2612:1: rule__Subconcept__Group__1__Impl : ( ( rule__Subconcept__CardinalityAssignment_1 )? ) ;
    public final void rule__Subconcept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2616:1: ( ( ( rule__Subconcept__CardinalityAssignment_1 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2617:1: ( ( rule__Subconcept__CardinalityAssignment_1 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2617:1: ( ( rule__Subconcept__CardinalityAssignment_1 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2618:1: ( rule__Subconcept__CardinalityAssignment_1 )?
            {
             before(grammarAccess.getSubconceptAccess().getCardinalityAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2619:1: ( rule__Subconcept__CardinalityAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=37 && LA25_0<=38)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2619:2: rule__Subconcept__CardinalityAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Subconcept__CardinalityAssignment_1_in_rule__Subconcept__Group__1__Impl5396);
                    rule__Subconcept__CardinalityAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubconceptAccess().getCardinalityAssignment_1()); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2629:1: rule__Subconcept__Group__2 : rule__Subconcept__Group__2__Impl rule__Subconcept__Group__3 ;
    public final void rule__Subconcept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2633:1: ( rule__Subconcept__Group__2__Impl rule__Subconcept__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2634:2: rule__Subconcept__Group__2__Impl rule__Subconcept__Group__3
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__2__Impl_in_rule__Subconcept__Group__25427);
            rule__Subconcept__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group__3_in_rule__Subconcept__Group__25430);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2641:1: rule__Subconcept__Group__2__Impl : ( ( rule__Subconcept__EssentialAssignment_2 )? ) ;
    public final void rule__Subconcept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2645:1: ( ( ( rule__Subconcept__EssentialAssignment_2 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2646:1: ( ( rule__Subconcept__EssentialAssignment_2 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2646:1: ( ( rule__Subconcept__EssentialAssignment_2 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2647:1: ( rule__Subconcept__EssentialAssignment_2 )?
            {
             before(grammarAccess.getSubconceptAccess().getEssentialAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2648:1: ( rule__Subconcept__EssentialAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2648:2: rule__Subconcept__EssentialAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Subconcept__EssentialAssignment_2_in_rule__Subconcept__Group__2__Impl5457);
                    rule__Subconcept__EssentialAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubconceptAccess().getEssentialAssignment_2()); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2658:1: rule__Subconcept__Group__3 : rule__Subconcept__Group__3__Impl ;
    public final void rule__Subconcept__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2662:1: ( rule__Subconcept__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2663:2: rule__Subconcept__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__3__Impl_in_rule__Subconcept__Group__35488);
            rule__Subconcept__Group__3__Impl();

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2669:1: rule__Subconcept__Group__3__Impl : ( ( rule__Subconcept__Alternatives_3 ) ) ;
    public final void rule__Subconcept__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2673:1: ( ( ( rule__Subconcept__Alternatives_3 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2674:1: ( ( rule__Subconcept__Alternatives_3 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2674:1: ( ( rule__Subconcept__Alternatives_3 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2675:1: ( rule__Subconcept__Alternatives_3 )
            {
             before(grammarAccess.getSubconceptAccess().getAlternatives_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2676:1: ( rule__Subconcept__Alternatives_3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2676:2: rule__Subconcept__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Subconcept__Alternatives_3_in_rule__Subconcept__Group__3__Impl5515);
            rule__Subconcept__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getSubconceptAccess().getAlternatives_3()); 

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


    // $ANTLR start "rule__Subconcept__Group_3_0__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2694:1: rule__Subconcept__Group_3_0__0 : rule__Subconcept__Group_3_0__0__Impl rule__Subconcept__Group_3_0__1 ;
    public final void rule__Subconcept__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2698:1: ( rule__Subconcept__Group_3_0__0__Impl rule__Subconcept__Group_3_0__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2699:2: rule__Subconcept__Group_3_0__0__Impl rule__Subconcept__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_3_0__0__Impl_in_rule__Subconcept__Group_3_0__05553);
            rule__Subconcept__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group_3_0__1_in_rule__Subconcept__Group_3_0__05556);
            rule__Subconcept__Group_3_0__1();

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
    // $ANTLR end "rule__Subconcept__Group_3_0__0"


    // $ANTLR start "rule__Subconcept__Group_3_0__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2706:1: rule__Subconcept__Group_3_0__0__Impl : ( ':' ) ;
    public final void rule__Subconcept__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2710:1: ( ( ':' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2711:1: ( ':' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2711:1: ( ':' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2712:1: ':'
            {
             before(grammarAccess.getSubconceptAccess().getColonKeyword_3_0_0()); 
            match(input,18,FOLLOW_18_in_rule__Subconcept__Group_3_0__0__Impl5584); 
             after(grammarAccess.getSubconceptAccess().getColonKeyword_3_0_0()); 

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
    // $ANTLR end "rule__Subconcept__Group_3_0__0__Impl"


    // $ANTLR start "rule__Subconcept__Group_3_0__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2725:1: rule__Subconcept__Group_3_0__1 : rule__Subconcept__Group_3_0__1__Impl ;
    public final void rule__Subconcept__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2729:1: ( rule__Subconcept__Group_3_0__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2730:2: rule__Subconcept__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_3_0__1__Impl_in_rule__Subconcept__Group_3_0__15615);
            rule__Subconcept__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__Subconcept__Group_3_0__1"


    // $ANTLR start "rule__Subconcept__Group_3_0__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2736:1: rule__Subconcept__Group_3_0__1__Impl : ( ( rule__Subconcept__DefAssignment_3_0_1 ) ) ;
    public final void rule__Subconcept__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2740:1: ( ( ( rule__Subconcept__DefAssignment_3_0_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2741:1: ( ( rule__Subconcept__DefAssignment_3_0_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2741:1: ( ( rule__Subconcept__DefAssignment_3_0_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2742:1: ( rule__Subconcept__DefAssignment_3_0_1 )
            {
             before(grammarAccess.getSubconceptAccess().getDefAssignment_3_0_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2743:1: ( rule__Subconcept__DefAssignment_3_0_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2743:2: rule__Subconcept__DefAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__Subconcept__DefAssignment_3_0_1_in_rule__Subconcept__Group_3_0__1__Impl5642);
            rule__Subconcept__DefAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSubconceptAccess().getDefAssignment_3_0_1()); 

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
    // $ANTLR end "rule__Subconcept__Group_3_0__1__Impl"


    // $ANTLR start "rule__Subconcept__Group_3_2__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2757:1: rule__Subconcept__Group_3_2__0 : rule__Subconcept__Group_3_2__0__Impl rule__Subconcept__Group_3_2__1 ;
    public final void rule__Subconcept__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2761:1: ( rule__Subconcept__Group_3_2__0__Impl rule__Subconcept__Group_3_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2762:2: rule__Subconcept__Group_3_2__0__Impl rule__Subconcept__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_3_2__0__Impl_in_rule__Subconcept__Group_3_2__05676);
            rule__Subconcept__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group_3_2__1_in_rule__Subconcept__Group_3_2__05679);
            rule__Subconcept__Group_3_2__1();

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
    // $ANTLR end "rule__Subconcept__Group_3_2__0"


    // $ANTLR start "rule__Subconcept__Group_3_2__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2769:1: rule__Subconcept__Group_3_2__0__Impl : ( ( rule__Subconcept__ReferenceAssignment_3_2_0 ) ) ;
    public final void rule__Subconcept__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2773:1: ( ( ( rule__Subconcept__ReferenceAssignment_3_2_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2774:1: ( ( rule__Subconcept__ReferenceAssignment_3_2_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2774:1: ( ( rule__Subconcept__ReferenceAssignment_3_2_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2775:1: ( rule__Subconcept__ReferenceAssignment_3_2_0 )
            {
             before(grammarAccess.getSubconceptAccess().getReferenceAssignment_3_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2776:1: ( rule__Subconcept__ReferenceAssignment_3_2_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2776:2: rule__Subconcept__ReferenceAssignment_3_2_0
            {
            pushFollow(FOLLOW_rule__Subconcept__ReferenceAssignment_3_2_0_in_rule__Subconcept__Group_3_2__0__Impl5706);
            rule__Subconcept__ReferenceAssignment_3_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSubconceptAccess().getReferenceAssignment_3_2_0()); 

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
    // $ANTLR end "rule__Subconcept__Group_3_2__0__Impl"


    // $ANTLR start "rule__Subconcept__Group_3_2__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2786:1: rule__Subconcept__Group_3_2__1 : rule__Subconcept__Group_3_2__1__Impl ;
    public final void rule__Subconcept__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2790:1: ( rule__Subconcept__Group_3_2__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2791:2: rule__Subconcept__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_3_2__1__Impl_in_rule__Subconcept__Group_3_2__15736);
            rule__Subconcept__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__Subconcept__Group_3_2__1"


    // $ANTLR start "rule__Subconcept__Group_3_2__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2797:1: rule__Subconcept__Group_3_2__1__Impl : ( ( rule__Subconcept__RefAssignment_3_2_1 ) ) ;
    public final void rule__Subconcept__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2801:1: ( ( ( rule__Subconcept__RefAssignment_3_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2802:1: ( ( rule__Subconcept__RefAssignment_3_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2802:1: ( ( rule__Subconcept__RefAssignment_3_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2803:1: ( rule__Subconcept__RefAssignment_3_2_1 )
            {
             before(grammarAccess.getSubconceptAccess().getRefAssignment_3_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2804:1: ( rule__Subconcept__RefAssignment_3_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2804:2: rule__Subconcept__RefAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Subconcept__RefAssignment_3_2_1_in_rule__Subconcept__Group_3_2__1__Impl5763);
            rule__Subconcept__RefAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSubconceptAccess().getRefAssignment_3_2_1()); 

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
    // $ANTLR end "rule__Subconcept__Group_3_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2818:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2822:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2823:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05797);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05800);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2830:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__AttribAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2834:1: ( ( ( rule__Attribute__AttribAssignment_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2835:1: ( ( rule__Attribute__AttribAssignment_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2835:1: ( ( rule__Attribute__AttribAssignment_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2836:1: ( rule__Attribute__AttribAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getAttribAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2837:1: ( rule__Attribute__AttribAssignment_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2837:2: rule__Attribute__AttribAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__AttribAssignment_0_in_rule__Attribute__Group__0__Impl5827);
            rule__Attribute__AttribAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttribAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2847:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2851:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2852:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15857);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15860);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2859:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2863:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2864:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2864:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2865:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2866:1: ( rule__Attribute__NameAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2866:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl5887);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2876:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2880:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2881:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25917);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__25920);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2888:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__CardinalityAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2892:1: ( ( ( rule__Attribute__CardinalityAssignment_2 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2893:1: ( ( rule__Attribute__CardinalityAssignment_2 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2893:1: ( ( rule__Attribute__CardinalityAssignment_2 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2894:1: ( rule__Attribute__CardinalityAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getCardinalityAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2895:1: ( rule__Attribute__CardinalityAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=37 && LA27_0<=38)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2895:2: rule__Attribute__CardinalityAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Attribute__CardinalityAssignment_2_in_rule__Attribute__Group__2__Impl5947);
                    rule__Attribute__CardinalityAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getCardinalityAssignment_2()); 

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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2905:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2909:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2910:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__35978);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__35981);
            rule__Attribute__Group__4();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2917:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__EssentialAssignment_3 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2921:1: ( ( ( rule__Attribute__EssentialAssignment_3 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2922:1: ( ( rule__Attribute__EssentialAssignment_3 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2922:1: ( ( rule__Attribute__EssentialAssignment_3 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2923:1: ( rule__Attribute__EssentialAssignment_3 )?
            {
             before(grammarAccess.getAttributeAccess().getEssentialAssignment_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2924:1: ( rule__Attribute__EssentialAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2924:2: rule__Attribute__EssentialAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Attribute__EssentialAssignment_3_in_rule__Attribute__Group__3__Impl6008);
                    rule__Attribute__EssentialAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getEssentialAssignment_3()); 

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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2934:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2938:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2939:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__46039);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__46042);
            rule__Attribute__Group__5();

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
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2946:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Group_4__0 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2950:1: ( ( ( rule__Attribute__Group_4__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2951:1: ( ( rule__Attribute__Group_4__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2951:1: ( ( rule__Attribute__Group_4__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2952:1: ( rule__Attribute__Group_4__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_4()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2953:1: ( rule__Attribute__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==16) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2953:2: rule__Attribute__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl6069);
                    rule__Attribute__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2963:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2967:1: ( rule__Attribute__Group__5__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2968:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__56100);
            rule__Attribute__Group__5__Impl();

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
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2974:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2978:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2979:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2979:1: ( ( rule__Attribute__Group_5__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2980:1: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2981:1: ( rule__Attribute__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2981:2: rule__Attribute__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_5__0_in_rule__Attribute__Group__5__Impl6127);
                    rule__Attribute__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group_4__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3003:1: rule__Attribute__Group_4__0 : rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 ;
    public final void rule__Attribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3007:1: ( rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3008:2: rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__06170);
            rule__Attribute__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__06173);
            rule__Attribute__Group_4__1();

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
    // $ANTLR end "rule__Attribute__Group_4__0"


    // $ANTLR start "rule__Attribute__Group_4__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3015:1: rule__Attribute__Group_4__0__Impl : ( '<' ) ;
    public final void rule__Attribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3019:1: ( ( '<' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3020:1: ( '<' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3020:1: ( '<' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3021:1: '<'
            {
             before(grammarAccess.getAttributeAccess().getLessThanSignKeyword_4_0()); 
            match(input,16,FOLLOW_16_in_rule__Attribute__Group_4__0__Impl6201); 
             after(grammarAccess.getAttributeAccess().getLessThanSignKeyword_4_0()); 

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
    // $ANTLR end "rule__Attribute__Group_4__0__Impl"


    // $ANTLR start "rule__Attribute__Group_4__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3034:1: rule__Attribute__Group_4__1 : rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 ;
    public final void rule__Attribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3038:1: ( rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3039:2: rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__16232);
            rule__Attribute__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_4__2_in_rule__Attribute__Group_4__16235);
            rule__Attribute__Group_4__2();

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
    // $ANTLR end "rule__Attribute__Group_4__1"


    // $ANTLR start "rule__Attribute__Group_4__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3046:1: rule__Attribute__Group_4__1__Impl : ( ( rule__Attribute__AttribMappingAssignment_4_1 ) ) ;
    public final void rule__Attribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3050:1: ( ( ( rule__Attribute__AttribMappingAssignment_4_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3051:1: ( ( rule__Attribute__AttribMappingAssignment_4_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3051:1: ( ( rule__Attribute__AttribMappingAssignment_4_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3052:1: ( rule__Attribute__AttribMappingAssignment_4_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttribMappingAssignment_4_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3053:1: ( rule__Attribute__AttribMappingAssignment_4_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3053:2: rule__Attribute__AttribMappingAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Attribute__AttribMappingAssignment_4_1_in_rule__Attribute__Group_4__1__Impl6262);
            rule__Attribute__AttribMappingAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAttribMappingAssignment_4_1()); 

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
    // $ANTLR end "rule__Attribute__Group_4__1__Impl"


    // $ANTLR start "rule__Attribute__Group_4__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3063:1: rule__Attribute__Group_4__2 : rule__Attribute__Group_4__2__Impl ;
    public final void rule__Attribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3067:1: ( rule__Attribute__Group_4__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3068:2: rule__Attribute__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__2__Impl_in_rule__Attribute__Group_4__26292);
            rule__Attribute__Group_4__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group_4__2"


    // $ANTLR start "rule__Attribute__Group_4__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3074:1: rule__Attribute__Group_4__2__Impl : ( '>' ) ;
    public final void rule__Attribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3078:1: ( ( '>' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3079:1: ( '>' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3079:1: ( '>' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3080:1: '>'
            {
             before(grammarAccess.getAttributeAccess().getGreaterThanSignKeyword_4_2()); 
            match(input,17,FOLLOW_17_in_rule__Attribute__Group_4__2__Impl6320); 
             after(grammarAccess.getAttributeAccess().getGreaterThanSignKeyword_4_2()); 

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
    // $ANTLR end "rule__Attribute__Group_4__2__Impl"


    // $ANTLR start "rule__Attribute__Group_5__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3099:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3103:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3104:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5__0__Impl_in_rule__Attribute__Group_5__06357);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_5__1_in_rule__Attribute__Group_5__06360);
            rule__Attribute__Group_5__1();

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
    // $ANTLR end "rule__Attribute__Group_5__0"


    // $ANTLR start "rule__Attribute__Group_5__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3111:1: rule__Attribute__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3115:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3116:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3116:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3117:1: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,13,FOLLOW_13_in_rule__Attribute__Group_5__0__Impl6388); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0()); 

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
    // $ANTLR end "rule__Attribute__Group_5__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3130:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3134:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3135:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5__1__Impl_in_rule__Attribute__Group_5__16419);
            rule__Attribute__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_5__2_in_rule__Attribute__Group_5__16422);
            rule__Attribute__Group_5__2();

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
    // $ANTLR end "rule__Attribute__Group_5__1"


    // $ANTLR start "rule__Attribute__Group_5__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3142:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__AnnotationAssignment_5_1 )* ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3146:1: ( ( ( rule__Attribute__AnnotationAssignment_5_1 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3147:1: ( ( rule__Attribute__AnnotationAssignment_5_1 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3147:1: ( ( rule__Attribute__AnnotationAssignment_5_1 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3148:1: ( rule__Attribute__AnnotationAssignment_5_1 )*
            {
             before(grammarAccess.getAttributeAccess().getAnnotationAssignment_5_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3149:1: ( rule__Attribute__AnnotationAssignment_5_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ANNOTATION_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3149:2: rule__Attribute__AnnotationAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Attribute__AnnotationAssignment_5_1_in_rule__Attribute__Group_5__1__Impl6449);
            	    rule__Attribute__AnnotationAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getAttributeAccess().getAnnotationAssignment_5_1()); 

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
    // $ANTLR end "rule__Attribute__Group_5__1__Impl"


    // $ANTLR start "rule__Attribute__Group_5__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3159:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3163:1: ( rule__Attribute__Group_5__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3164:2: rule__Attribute__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5__2__Impl_in_rule__Attribute__Group_5__26480);
            rule__Attribute__Group_5__2__Impl();

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
    // $ANTLR end "rule__Attribute__Group_5__2"


    // $ANTLR start "rule__Attribute__Group_5__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3170:1: rule__Attribute__Group_5__2__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3174:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3175:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3175:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3176:1: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,14,FOLLOW_14_in_rule__Attribute__Group_5__2__Impl6508); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2()); 

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
    // $ANTLR end "rule__Attribute__Group_5__2__Impl"


    // $ANTLR start "rule__Mapping__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3195:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3199:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3200:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__06545);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__06548);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3207:1: rule__Mapping__Group__0__Impl : ( ( rule__Mapping__ContextAssignment_0 )? ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3211:1: ( ( ( rule__Mapping__ContextAssignment_0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3212:1: ( ( rule__Mapping__ContextAssignment_0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3212:1: ( ( rule__Mapping__ContextAssignment_0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3213:1: ( rule__Mapping__ContextAssignment_0 )?
            {
             before(grammarAccess.getMappingAccess().getContextAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3214:1: ( rule__Mapping__ContextAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3214:2: rule__Mapping__ContextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Mapping__ContextAssignment_0_in_rule__Mapping__Group__0__Impl6575);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3224:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3228:1: ( rule__Mapping__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3229:2: rule__Mapping__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__16606);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3235:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__MappingAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3239:1: ( ( ( rule__Mapping__MappingAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3240:1: ( ( rule__Mapping__MappingAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3240:1: ( ( rule__Mapping__MappingAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3241:1: ( rule__Mapping__MappingAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getMappingAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3242:1: ( rule__Mapping__MappingAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3242:2: rule__Mapping__MappingAssignment_1
            {
            pushFollow(FOLLOW_rule__Mapping__MappingAssignment_1_in_rule__Mapping__Group__1__Impl6633);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3256:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3260:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3261:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__06667);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__06670);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3268:1: rule__Module__Group__0__Impl : ( () ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3272:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3273:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3273:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3274:1: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3275:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3277:1: 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3287:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3291:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3292:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__16728);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__16731);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3299:1: rule__Module__Group__1__Impl : ( 'module' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3303:1: ( ( 'module' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3304:1: ( 'module' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3304:1: ( 'module' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3305:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Module__Group__1__Impl6759); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3318:1: rule__Module__Group__2 : rule__Module__Group__2__Impl ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3322:1: ( rule__Module__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3323:2: rule__Module__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__26790);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3329:1: rule__Module__Group__2__Impl : ( ( rule__Module__Group_2__0 )? ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3333:1: ( ( ( rule__Module__Group_2__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3334:1: ( ( rule__Module__Group_2__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3334:1: ( ( rule__Module__Group_2__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3335:1: ( rule__Module__Group_2__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3336:1: ( rule__Module__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==20) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3336:2: rule__Module__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_2__0_in_rule__Module__Group__2__Impl6817);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3352:1: rule__Module__Group_2__0 : rule__Module__Group_2__0__Impl rule__Module__Group_2__1 ;
    public final void rule__Module__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3356:1: ( rule__Module__Group_2__0__Impl rule__Module__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3357:2: rule__Module__Group_2__0__Impl rule__Module__Group_2__1
            {
            pushFollow(FOLLOW_rule__Module__Group_2__0__Impl_in_rule__Module__Group_2__06854);
            rule__Module__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2__1_in_rule__Module__Group_2__06857);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3364:1: rule__Module__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Module__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3368:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3369:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3369:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3370:1: '('
            {
             before(grammarAccess.getModuleAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__Module__Group_2__0__Impl6885); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3383:1: rule__Module__Group_2__1 : rule__Module__Group_2__1__Impl rule__Module__Group_2__2 ;
    public final void rule__Module__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3387:1: ( rule__Module__Group_2__1__Impl rule__Module__Group_2__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3388:2: rule__Module__Group_2__1__Impl rule__Module__Group_2__2
            {
            pushFollow(FOLLOW_rule__Module__Group_2__1__Impl_in_rule__Module__Group_2__16916);
            rule__Module__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2__2_in_rule__Module__Group_2__16919);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3395:1: rule__Module__Group_2__1__Impl : ( ( rule__Module__NameAssignment_2_1 ) ) ;
    public final void rule__Module__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3399:1: ( ( ( rule__Module__NameAssignment_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3400:1: ( ( rule__Module__NameAssignment_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3400:1: ( ( rule__Module__NameAssignment_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3401:1: ( rule__Module__NameAssignment_2_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3402:1: ( rule__Module__NameAssignment_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3402:2: rule__Module__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_2_1_in_rule__Module__Group_2__1__Impl6946);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3412:1: rule__Module__Group_2__2 : rule__Module__Group_2__2__Impl ;
    public final void rule__Module__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3416:1: ( rule__Module__Group_2__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3417:2: rule__Module__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_2__2__Impl_in_rule__Module__Group_2__26976);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3423:1: rule__Module__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Module__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3427:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3428:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3428:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3429:1: ')'
            {
             before(grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_2()); 
            match(input,21,FOLLOW_21_in_rule__Module__Group_2__2__Impl7004); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3448:1: rule__ModuleName__Group__0 : rule__ModuleName__Group__0__Impl rule__ModuleName__Group__1 ;
    public final void rule__ModuleName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3452:1: ( rule__ModuleName__Group__0__Impl rule__ModuleName__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3453:2: rule__ModuleName__Group__0__Impl rule__ModuleName__Group__1
            {
            pushFollow(FOLLOW_rule__ModuleName__Group__0__Impl_in_rule__ModuleName__Group__07041);
            rule__ModuleName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleName__Group__1_in_rule__ModuleName__Group__07044);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3460:1: rule__ModuleName__Group__0__Impl : ( () ) ;
    public final void rule__ModuleName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3464:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3465:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3465:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3466:1: ()
            {
             before(grammarAccess.getModuleNameAccess().getModuleNameAction_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3467:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3469:1: 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3479:1: rule__ModuleName__Group__1 : rule__ModuleName__Group__1__Impl ;
    public final void rule__ModuleName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3483:1: ( rule__ModuleName__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3484:2: rule__ModuleName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ModuleName__Group__1__Impl_in_rule__ModuleName__Group__17102);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3490:1: rule__ModuleName__Group__1__Impl : ( 'moduleName' ) ;
    public final void rule__ModuleName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3494:1: ( ( 'moduleName' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3495:1: ( 'moduleName' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3495:1: ( 'moduleName' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3496:1: 'moduleName'
            {
             before(grammarAccess.getModuleNameAccess().getModuleNameKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ModuleName__Group__1__Impl7130); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3513:1: rule__UsesModule__Group__0 : rule__UsesModule__Group__0__Impl rule__UsesModule__Group__1 ;
    public final void rule__UsesModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3517:1: ( rule__UsesModule__Group__0__Impl rule__UsesModule__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3518:2: rule__UsesModule__Group__0__Impl rule__UsesModule__Group__1
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__0__Impl_in_rule__UsesModule__Group__07165);
            rule__UsesModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesModule__Group__1_in_rule__UsesModule__Group__07168);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3525:1: rule__UsesModule__Group__0__Impl : ( 'usesModule' ) ;
    public final void rule__UsesModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3529:1: ( ( 'usesModule' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3530:1: ( 'usesModule' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3530:1: ( 'usesModule' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3531:1: 'usesModule'
            {
             before(grammarAccess.getUsesModuleAccess().getUsesModuleKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__UsesModule__Group__0__Impl7196); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3544:1: rule__UsesModule__Group__1 : rule__UsesModule__Group__1__Impl rule__UsesModule__Group__2 ;
    public final void rule__UsesModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3548:1: ( rule__UsesModule__Group__1__Impl rule__UsesModule__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3549:2: rule__UsesModule__Group__1__Impl rule__UsesModule__Group__2
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__1__Impl_in_rule__UsesModule__Group__17227);
            rule__UsesModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesModule__Group__2_in_rule__UsesModule__Group__17230);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3556:1: rule__UsesModule__Group__1__Impl : ( '(' ) ;
    public final void rule__UsesModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3560:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3561:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3561:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3562:1: '('
            {
             before(grammarAccess.getUsesModuleAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__UsesModule__Group__1__Impl7258); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3575:1: rule__UsesModule__Group__2 : rule__UsesModule__Group__2__Impl rule__UsesModule__Group__3 ;
    public final void rule__UsesModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3579:1: ( rule__UsesModule__Group__2__Impl rule__UsesModule__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3580:2: rule__UsesModule__Group__2__Impl rule__UsesModule__Group__3
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__2__Impl_in_rule__UsesModule__Group__27289);
            rule__UsesModule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesModule__Group__3_in_rule__UsesModule__Group__27292);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3587:1: rule__UsesModule__Group__2__Impl : ( ( rule__UsesModule__NameAssignment_2 ) ) ;
    public final void rule__UsesModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3591:1: ( ( ( rule__UsesModule__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3592:1: ( ( rule__UsesModule__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3592:1: ( ( rule__UsesModule__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3593:1: ( rule__UsesModule__NameAssignment_2 )
            {
             before(grammarAccess.getUsesModuleAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3594:1: ( rule__UsesModule__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3594:2: rule__UsesModule__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UsesModule__NameAssignment_2_in_rule__UsesModule__Group__2__Impl7319);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3604:1: rule__UsesModule__Group__3 : rule__UsesModule__Group__3__Impl ;
    public final void rule__UsesModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3608:1: ( rule__UsesModule__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3609:2: rule__UsesModule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__3__Impl_in_rule__UsesModule__Group__37349);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3615:1: rule__UsesModule__Group__3__Impl : ( ')' ) ;
    public final void rule__UsesModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3619:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3620:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3620:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3621:1: ')'
            {
             before(grammarAccess.getUsesModuleAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__UsesModule__Group__3__Impl7377); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3642:1: rule__UsesEntity__Group__0 : rule__UsesEntity__Group__0__Impl rule__UsesEntity__Group__1 ;
    public final void rule__UsesEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3646:1: ( rule__UsesEntity__Group__0__Impl rule__UsesEntity__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3647:2: rule__UsesEntity__Group__0__Impl rule__UsesEntity__Group__1
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__0__Impl_in_rule__UsesEntity__Group__07416);
            rule__UsesEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesEntity__Group__1_in_rule__UsesEntity__Group__07419);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3654:1: rule__UsesEntity__Group__0__Impl : ( 'usesEntity' ) ;
    public final void rule__UsesEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3658:1: ( ( 'usesEntity' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3659:1: ( 'usesEntity' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3659:1: ( 'usesEntity' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3660:1: 'usesEntity'
            {
             before(grammarAccess.getUsesEntityAccess().getUsesEntityKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__UsesEntity__Group__0__Impl7447); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3673:1: rule__UsesEntity__Group__1 : rule__UsesEntity__Group__1__Impl rule__UsesEntity__Group__2 ;
    public final void rule__UsesEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3677:1: ( rule__UsesEntity__Group__1__Impl rule__UsesEntity__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3678:2: rule__UsesEntity__Group__1__Impl rule__UsesEntity__Group__2
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__1__Impl_in_rule__UsesEntity__Group__17478);
            rule__UsesEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesEntity__Group__2_in_rule__UsesEntity__Group__17481);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3685:1: rule__UsesEntity__Group__1__Impl : ( '(' ) ;
    public final void rule__UsesEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3689:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3690:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3690:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3691:1: '('
            {
             before(grammarAccess.getUsesEntityAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__UsesEntity__Group__1__Impl7509); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3704:1: rule__UsesEntity__Group__2 : rule__UsesEntity__Group__2__Impl rule__UsesEntity__Group__3 ;
    public final void rule__UsesEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3708:1: ( rule__UsesEntity__Group__2__Impl rule__UsesEntity__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3709:2: rule__UsesEntity__Group__2__Impl rule__UsesEntity__Group__3
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__2__Impl_in_rule__UsesEntity__Group__27540);
            rule__UsesEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesEntity__Group__3_in_rule__UsesEntity__Group__27543);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3716:1: rule__UsesEntity__Group__2__Impl : ( ( rule__UsesEntity__NameAssignment_2 ) ) ;
    public final void rule__UsesEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3720:1: ( ( ( rule__UsesEntity__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3721:1: ( ( rule__UsesEntity__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3721:1: ( ( rule__UsesEntity__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3722:1: ( rule__UsesEntity__NameAssignment_2 )
            {
             before(grammarAccess.getUsesEntityAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3723:1: ( rule__UsesEntity__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3723:2: rule__UsesEntity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UsesEntity__NameAssignment_2_in_rule__UsesEntity__Group__2__Impl7570);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3733:1: rule__UsesEntity__Group__3 : rule__UsesEntity__Group__3__Impl ;
    public final void rule__UsesEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3737:1: ( rule__UsesEntity__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3738:2: rule__UsesEntity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__3__Impl_in_rule__UsesEntity__Group__37600);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3744:1: rule__UsesEntity__Group__3__Impl : ( ')' ) ;
    public final void rule__UsesEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3748:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3749:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3749:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3750:1: ')'
            {
             before(grammarAccess.getUsesEntityAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__UsesEntity__Group__3__Impl7628); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3771:1: rule__Subroutine__Group__0 : rule__Subroutine__Group__0__Impl rule__Subroutine__Group__1 ;
    public final void rule__Subroutine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3775:1: ( rule__Subroutine__Group__0__Impl rule__Subroutine__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3776:2: rule__Subroutine__Group__0__Impl rule__Subroutine__Group__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__0__Impl_in_rule__Subroutine__Group__07667);
            rule__Subroutine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__1_in_rule__Subroutine__Group__07670);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3783:1: rule__Subroutine__Group__0__Impl : ( 'subroutine' ) ;
    public final void rule__Subroutine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3787:1: ( ( 'subroutine' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3788:1: ( 'subroutine' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3788:1: ( 'subroutine' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3789:1: 'subroutine'
            {
             before(grammarAccess.getSubroutineAccess().getSubroutineKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Subroutine__Group__0__Impl7698); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3802:1: rule__Subroutine__Group__1 : rule__Subroutine__Group__1__Impl rule__Subroutine__Group__2 ;
    public final void rule__Subroutine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3806:1: ( rule__Subroutine__Group__1__Impl rule__Subroutine__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3807:2: rule__Subroutine__Group__1__Impl rule__Subroutine__Group__2
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__1__Impl_in_rule__Subroutine__Group__17729);
            rule__Subroutine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__2_in_rule__Subroutine__Group__17732);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3814:1: rule__Subroutine__Group__1__Impl : ( '(' ) ;
    public final void rule__Subroutine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3818:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3819:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3819:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3820:1: '('
            {
             before(grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Subroutine__Group__1__Impl7760); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3833:1: rule__Subroutine__Group__2 : rule__Subroutine__Group__2__Impl rule__Subroutine__Group__3 ;
    public final void rule__Subroutine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3837:1: ( rule__Subroutine__Group__2__Impl rule__Subroutine__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3838:2: rule__Subroutine__Group__2__Impl rule__Subroutine__Group__3
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__2__Impl_in_rule__Subroutine__Group__27791);
            rule__Subroutine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__3_in_rule__Subroutine__Group__27794);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3845:1: rule__Subroutine__Group__2__Impl : ( ( rule__Subroutine__NameAssignment_2 ) ) ;
    public final void rule__Subroutine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3849:1: ( ( ( rule__Subroutine__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3850:1: ( ( rule__Subroutine__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3850:1: ( ( rule__Subroutine__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3851:1: ( rule__Subroutine__NameAssignment_2 )
            {
             before(grammarAccess.getSubroutineAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3852:1: ( rule__Subroutine__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3852:2: rule__Subroutine__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Subroutine__NameAssignment_2_in_rule__Subroutine__Group__2__Impl7821);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3862:1: rule__Subroutine__Group__3 : rule__Subroutine__Group__3__Impl rule__Subroutine__Group__4 ;
    public final void rule__Subroutine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3866:1: ( rule__Subroutine__Group__3__Impl rule__Subroutine__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3867:2: rule__Subroutine__Group__3__Impl rule__Subroutine__Group__4
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__3__Impl_in_rule__Subroutine__Group__37851);
            rule__Subroutine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__4_in_rule__Subroutine__Group__37854);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3874:1: rule__Subroutine__Group__3__Impl : ( ( rule__Subroutine__Group_3__0 )? ) ;
    public final void rule__Subroutine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3878:1: ( ( ( rule__Subroutine__Group_3__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3879:1: ( ( rule__Subroutine__Group_3__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3879:1: ( ( rule__Subroutine__Group_3__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3880:1: ( rule__Subroutine__Group_3__0 )?
            {
             before(grammarAccess.getSubroutineAccess().getGroup_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3881:1: ( rule__Subroutine__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==20) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3881:2: rule__Subroutine__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Subroutine__Group_3__0_in_rule__Subroutine__Group__3__Impl7881);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3891:1: rule__Subroutine__Group__4 : rule__Subroutine__Group__4__Impl ;
    public final void rule__Subroutine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3895:1: ( rule__Subroutine__Group__4__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3896:2: rule__Subroutine__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__4__Impl_in_rule__Subroutine__Group__47912);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3902:1: rule__Subroutine__Group__4__Impl : ( ')' ) ;
    public final void rule__Subroutine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3906:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3907:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3907:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3908:1: ')'
            {
             before(grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Subroutine__Group__4__Impl7940); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3931:1: rule__Subroutine__Group_3__0 : rule__Subroutine__Group_3__0__Impl rule__Subroutine__Group_3__1 ;
    public final void rule__Subroutine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3935:1: ( rule__Subroutine__Group_3__0__Impl rule__Subroutine__Group_3__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3936:2: rule__Subroutine__Group_3__0__Impl rule__Subroutine__Group_3__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3__0__Impl_in_rule__Subroutine__Group_3__07981);
            rule__Subroutine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group_3__1_in_rule__Subroutine__Group_3__07984);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3943:1: rule__Subroutine__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Subroutine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3947:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3948:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3948:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3949:1: '('
            {
             before(grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__Subroutine__Group_3__0__Impl8012); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3962:1: rule__Subroutine__Group_3__1 : rule__Subroutine__Group_3__1__Impl rule__Subroutine__Group_3__2 ;
    public final void rule__Subroutine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3966:1: ( rule__Subroutine__Group_3__1__Impl rule__Subroutine__Group_3__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3967:2: rule__Subroutine__Group_3__1__Impl rule__Subroutine__Group_3__2
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3__1__Impl_in_rule__Subroutine__Group_3__18043);
            rule__Subroutine__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group_3__2_in_rule__Subroutine__Group_3__18046);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3974:1: rule__Subroutine__Group_3__1__Impl : ( ( rule__Subroutine__Group_3_1__0 )? ) ;
    public final void rule__Subroutine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3978:1: ( ( ( rule__Subroutine__Group_3_1__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3979:1: ( ( rule__Subroutine__Group_3_1__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3979:1: ( ( rule__Subroutine__Group_3_1__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3980:1: ( rule__Subroutine__Group_3_1__0 )?
            {
             before(grammarAccess.getSubroutineAccess().getGroup_3_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3981:1: ( rule__Subroutine__Group_3_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=39 && LA35_0<=47)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3981:2: rule__Subroutine__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Subroutine__Group_3_1__0_in_rule__Subroutine__Group_3__1__Impl8073);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3991:1: rule__Subroutine__Group_3__2 : rule__Subroutine__Group_3__2__Impl ;
    public final void rule__Subroutine__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3995:1: ( rule__Subroutine__Group_3__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3996:2: rule__Subroutine__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3__2__Impl_in_rule__Subroutine__Group_3__28104);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4002:1: rule__Subroutine__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Subroutine__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4006:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4007:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4007:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4008:1: ')'
            {
             before(grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_3_2()); 
            match(input,21,FOLLOW_21_in_rule__Subroutine__Group_3__2__Impl8132); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4027:1: rule__Subroutine__Group_3_1__0 : rule__Subroutine__Group_3_1__0__Impl rule__Subroutine__Group_3_1__1 ;
    public final void rule__Subroutine__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4031:1: ( rule__Subroutine__Group_3_1__0__Impl rule__Subroutine__Group_3_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4032:2: rule__Subroutine__Group_3_1__0__Impl rule__Subroutine__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3_1__0__Impl_in_rule__Subroutine__Group_3_1__08169);
            rule__Subroutine__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group_3_1__1_in_rule__Subroutine__Group_3_1__08172);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4039:1: rule__Subroutine__Group_3_1__0__Impl : ( ( rule__Subroutine__ParamsAssignment_3_1_0 ) ) ;
    public final void rule__Subroutine__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4043:1: ( ( ( rule__Subroutine__ParamsAssignment_3_1_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4044:1: ( ( rule__Subroutine__ParamsAssignment_3_1_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4044:1: ( ( rule__Subroutine__ParamsAssignment_3_1_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4045:1: ( rule__Subroutine__ParamsAssignment_3_1_0 )
            {
             before(grammarAccess.getSubroutineAccess().getParamsAssignment_3_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4046:1: ( rule__Subroutine__ParamsAssignment_3_1_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4046:2: rule__Subroutine__ParamsAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Subroutine__ParamsAssignment_3_1_0_in_rule__Subroutine__Group_3_1__0__Impl8199);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4056:1: rule__Subroutine__Group_3_1__1 : rule__Subroutine__Group_3_1__1__Impl ;
    public final void rule__Subroutine__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4060:1: ( rule__Subroutine__Group_3_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4061:2: rule__Subroutine__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3_1__1__Impl_in_rule__Subroutine__Group_3_1__18229);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4067:1: rule__Subroutine__Group_3_1__1__Impl : ( ( rule__Subroutine__Group_3_1_1__0 )* ) ;
    public final void rule__Subroutine__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4071:1: ( ( ( rule__Subroutine__Group_3_1_1__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4072:1: ( ( rule__Subroutine__Group_3_1_1__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4072:1: ( ( rule__Subroutine__Group_3_1_1__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4073:1: ( rule__Subroutine__Group_3_1_1__0 )*
            {
             before(grammarAccess.getSubroutineAccess().getGroup_3_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4074:1: ( rule__Subroutine__Group_3_1_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==26) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4074:2: rule__Subroutine__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Subroutine__Group_3_1_1__0_in_rule__Subroutine__Group_3_1__1__Impl8256);
            	    rule__Subroutine__Group_3_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4088:1: rule__Subroutine__Group_3_1_1__0 : rule__Subroutine__Group_3_1_1__0__Impl rule__Subroutine__Group_3_1_1__1 ;
    public final void rule__Subroutine__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4092:1: ( rule__Subroutine__Group_3_1_1__0__Impl rule__Subroutine__Group_3_1_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4093:2: rule__Subroutine__Group_3_1_1__0__Impl rule__Subroutine__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3_1_1__0__Impl_in_rule__Subroutine__Group_3_1_1__08291);
            rule__Subroutine__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group_3_1_1__1_in_rule__Subroutine__Group_3_1_1__08294);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4100:1: rule__Subroutine__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Subroutine__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4104:1: ( ( ',' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4105:1: ( ',' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4105:1: ( ',' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4106:1: ','
            {
             before(grammarAccess.getSubroutineAccess().getCommaKeyword_3_1_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Subroutine__Group_3_1_1__0__Impl8322); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4119:1: rule__Subroutine__Group_3_1_1__1 : rule__Subroutine__Group_3_1_1__1__Impl ;
    public final void rule__Subroutine__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4123:1: ( rule__Subroutine__Group_3_1_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4124:2: rule__Subroutine__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3_1_1__1__Impl_in_rule__Subroutine__Group_3_1_1__18353);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4130:1: rule__Subroutine__Group_3_1_1__1__Impl : ( ( rule__Subroutine__ParamsAssignment_3_1_1_1 ) ) ;
    public final void rule__Subroutine__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4134:1: ( ( ( rule__Subroutine__ParamsAssignment_3_1_1_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4135:1: ( ( rule__Subroutine__ParamsAssignment_3_1_1_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4135:1: ( ( rule__Subroutine__ParamsAssignment_3_1_1_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4136:1: ( rule__Subroutine__ParamsAssignment_3_1_1_1 )
            {
             before(grammarAccess.getSubroutineAccess().getParamsAssignment_3_1_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4137:1: ( rule__Subroutine__ParamsAssignment_3_1_1_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4137:2: rule__Subroutine__ParamsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Subroutine__ParamsAssignment_3_1_1_1_in_rule__Subroutine__Group_3_1_1__1__Impl8380);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4151:1: rule__FormalParam__Group__0 : rule__FormalParam__Group__0__Impl rule__FormalParam__Group__1 ;
    public final void rule__FormalParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4155:1: ( rule__FormalParam__Group__0__Impl rule__FormalParam__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4156:2: rule__FormalParam__Group__0__Impl rule__FormalParam__Group__1
            {
            pushFollow(FOLLOW_rule__FormalParam__Group__0__Impl_in_rule__FormalParam__Group__08414);
            rule__FormalParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormalParam__Group__1_in_rule__FormalParam__Group__08417);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4163:1: rule__FormalParam__Group__0__Impl : ( ( rule__FormalParam__IntentAssignment_0 )? ) ;
    public final void rule__FormalParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4167:1: ( ( ( rule__FormalParam__IntentAssignment_0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4168:1: ( ( rule__FormalParam__IntentAssignment_0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4168:1: ( ( rule__FormalParam__IntentAssignment_0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4169:1: ( rule__FormalParam__IntentAssignment_0 )?
            {
             before(grammarAccess.getFormalParamAccess().getIntentAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4170:1: ( rule__FormalParam__IntentAssignment_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=39 && LA37_0<=41)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4170:2: rule__FormalParam__IntentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FormalParam__IntentAssignment_0_in_rule__FormalParam__Group__0__Impl8444);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4180:1: rule__FormalParam__Group__1 : rule__FormalParam__Group__1__Impl rule__FormalParam__Group__2 ;
    public final void rule__FormalParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4184:1: ( rule__FormalParam__Group__1__Impl rule__FormalParam__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4185:2: rule__FormalParam__Group__1__Impl rule__FormalParam__Group__2
            {
            pushFollow(FOLLOW_rule__FormalParam__Group__1__Impl_in_rule__FormalParam__Group__18475);
            rule__FormalParam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormalParam__Group__2_in_rule__FormalParam__Group__18478);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4192:1: rule__FormalParam__Group__1__Impl : ( ( rule__FormalParam__TypeAssignment_1 ) ) ;
    public final void rule__FormalParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4196:1: ( ( ( rule__FormalParam__TypeAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4197:1: ( ( rule__FormalParam__TypeAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4197:1: ( ( rule__FormalParam__TypeAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4198:1: ( rule__FormalParam__TypeAssignment_1 )
            {
             before(grammarAccess.getFormalParamAccess().getTypeAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4199:1: ( rule__FormalParam__TypeAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4199:2: rule__FormalParam__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__FormalParam__TypeAssignment_1_in_rule__FormalParam__Group__1__Impl8505);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4209:1: rule__FormalParam__Group__2 : rule__FormalParam__Group__2__Impl ;
    public final void rule__FormalParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4213:1: ( rule__FormalParam__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4214:2: rule__FormalParam__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FormalParam__Group__2__Impl_in_rule__FormalParam__Group__28535);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4220:1: rule__FormalParam__Group__2__Impl : ( ( rule__FormalParam__NameAssignment_2 ) ) ;
    public final void rule__FormalParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4224:1: ( ( ( rule__FormalParam__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4225:1: ( ( rule__FormalParam__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4225:1: ( ( rule__FormalParam__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4226:1: ( rule__FormalParam__NameAssignment_2 )
            {
             before(grammarAccess.getFormalParamAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4227:1: ( rule__FormalParam__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4227:2: rule__FormalParam__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__FormalParam__NameAssignment_2_in_rule__FormalParam__Group__2__Impl8562);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4243:1: rule__Type__Group_4__0 : rule__Type__Group_4__0__Impl rule__Type__Group_4__1 ;
    public final void rule__Type__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4247:1: ( rule__Type__Group_4__0__Impl rule__Type__Group_4__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4248:2: rule__Type__Group_4__0__Impl rule__Type__Group_4__1
            {
            pushFollow(FOLLOW_rule__Type__Group_4__0__Impl_in_rule__Type__Group_4__08598);
            rule__Type__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_4__1_in_rule__Type__Group_4__08601);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4255:1: rule__Type__Group_4__0__Impl : ( ( rule__Type__DoubleAssignment_4_0 ) ) ;
    public final void rule__Type__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4259:1: ( ( ( rule__Type__DoubleAssignment_4_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4260:1: ( ( rule__Type__DoubleAssignment_4_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4260:1: ( ( rule__Type__DoubleAssignment_4_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4261:1: ( rule__Type__DoubleAssignment_4_0 )
            {
             before(grammarAccess.getTypeAccess().getDoubleAssignment_4_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4262:1: ( rule__Type__DoubleAssignment_4_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4262:2: rule__Type__DoubleAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Type__DoubleAssignment_4_0_in_rule__Type__Group_4__0__Impl8628);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4272:1: rule__Type__Group_4__1 : rule__Type__Group_4__1__Impl ;
    public final void rule__Type__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4276:1: ( rule__Type__Group_4__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4277:2: rule__Type__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_4__1__Impl_in_rule__Type__Group_4__18658);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4283:1: rule__Type__Group_4__1__Impl : ( ( 'precision' )? ) ;
    public final void rule__Type__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4287:1: ( ( ( 'precision' )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4288:1: ( ( 'precision' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4288:1: ( ( 'precision' )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4289:1: ( 'precision' )?
            {
             before(grammarAccess.getTypeAccess().getPrecisionKeyword_4_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4290:1: ( 'precision' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==27) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4291:2: 'precision'
                    {
                    match(input,27,FOLLOW_27_in_rule__Type__Group_4__1__Impl8687); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4306:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4310:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4311:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_rule__Type__Group_5__0__Impl_in_rule__Type__Group_5__08724);
            rule__Type__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_5__1_in_rule__Type__Group_5__08727);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4318:1: rule__Type__Group_5__0__Impl : ( ( rule__Type__DerivedAssignment_5_0 ) ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4322:1: ( ( ( rule__Type__DerivedAssignment_5_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4323:1: ( ( rule__Type__DerivedAssignment_5_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4323:1: ( ( rule__Type__DerivedAssignment_5_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4324:1: ( rule__Type__DerivedAssignment_5_0 )
            {
             before(grammarAccess.getTypeAccess().getDerivedAssignment_5_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4325:1: ( rule__Type__DerivedAssignment_5_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4325:2: rule__Type__DerivedAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Type__DerivedAssignment_5_0_in_rule__Type__Group_5__0__Impl8754);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4335:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4339:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4340:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
            {
            pushFollow(FOLLOW_rule__Type__Group_5__1__Impl_in_rule__Type__Group_5__18784);
            rule__Type__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_5__2_in_rule__Type__Group_5__18787);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4347:1: rule__Type__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4351:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4352:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4352:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4353:1: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,20,FOLLOW_20_in_rule__Type__Group_5__1__Impl8815); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4366:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl rule__Type__Group_5__3 ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4370:1: ( rule__Type__Group_5__2__Impl rule__Type__Group_5__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4371:2: rule__Type__Group_5__2__Impl rule__Type__Group_5__3
            {
            pushFollow(FOLLOW_rule__Type__Group_5__2__Impl_in_rule__Type__Group_5__28846);
            rule__Type__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_5__3_in_rule__Type__Group_5__28849);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4378:1: rule__Type__Group_5__2__Impl : ( ( rule__Type__DerivedTypeAssignment_5_2 ) ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4382:1: ( ( ( rule__Type__DerivedTypeAssignment_5_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4383:1: ( ( rule__Type__DerivedTypeAssignment_5_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4383:1: ( ( rule__Type__DerivedTypeAssignment_5_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4384:1: ( rule__Type__DerivedTypeAssignment_5_2 )
            {
             before(grammarAccess.getTypeAccess().getDerivedTypeAssignment_5_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4385:1: ( rule__Type__DerivedTypeAssignment_5_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4385:2: rule__Type__DerivedTypeAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Type__DerivedTypeAssignment_5_2_in_rule__Type__Group_5__2__Impl8876);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4395:1: rule__Type__Group_5__3 : rule__Type__Group_5__3__Impl ;
    public final void rule__Type__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4399:1: ( rule__Type__Group_5__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4400:2: rule__Type__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_5__3__Impl_in_rule__Type__Group_5__38906);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4406:1: rule__Type__Group_5__3__Impl : ( ')' ) ;
    public final void rule__Type__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4410:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4411:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4411:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4412:1: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_5_3()); 
            match(input,21,FOLLOW_21_in_rule__Type__Group_5__3__Impl8934); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4433:1: rule__SubroutineName__Group__0 : rule__SubroutineName__Group__0__Impl rule__SubroutineName__Group__1 ;
    public final void rule__SubroutineName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4437:1: ( rule__SubroutineName__Group__0__Impl rule__SubroutineName__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4438:2: rule__SubroutineName__Group__0__Impl rule__SubroutineName__Group__1
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group__0__Impl_in_rule__SubroutineName__Group__08973);
            rule__SubroutineName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubroutineName__Group__1_in_rule__SubroutineName__Group__08976);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4445:1: rule__SubroutineName__Group__0__Impl : ( 'subroutineName' ) ;
    public final void rule__SubroutineName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4449:1: ( ( 'subroutineName' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4450:1: ( 'subroutineName' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4450:1: ( 'subroutineName' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4451:1: 'subroutineName'
            {
             before(grammarAccess.getSubroutineNameAccess().getSubroutineNameKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__SubroutineName__Group__0__Impl9004); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4464:1: rule__SubroutineName__Group__1 : rule__SubroutineName__Group__1__Impl rule__SubroutineName__Group__2 ;
    public final void rule__SubroutineName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4468:1: ( rule__SubroutineName__Group__1__Impl rule__SubroutineName__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4469:2: rule__SubroutineName__Group__1__Impl rule__SubroutineName__Group__2
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group__1__Impl_in_rule__SubroutineName__Group__19035);
            rule__SubroutineName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubroutineName__Group__2_in_rule__SubroutineName__Group__19038);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4476:1: rule__SubroutineName__Group__1__Impl : ( () ) ;
    public final void rule__SubroutineName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4480:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4481:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4481:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4482:1: ()
            {
             before(grammarAccess.getSubroutineNameAccess().getSubroutineNameAction_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4483:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4485:1: 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4495:1: rule__SubroutineName__Group__2 : rule__SubroutineName__Group__2__Impl ;
    public final void rule__SubroutineName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4499:1: ( rule__SubroutineName__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4500:2: rule__SubroutineName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group__2__Impl_in_rule__SubroutineName__Group__29096);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4506:1: rule__SubroutineName__Group__2__Impl : ( ( rule__SubroutineName__Group_2__0 )? ) ;
    public final void rule__SubroutineName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4510:1: ( ( ( rule__SubroutineName__Group_2__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4511:1: ( ( rule__SubroutineName__Group_2__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4511:1: ( ( rule__SubroutineName__Group_2__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4512:1: ( rule__SubroutineName__Group_2__0 )?
            {
             before(grammarAccess.getSubroutineNameAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4513:1: ( rule__SubroutineName__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==20) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4513:2: rule__SubroutineName__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SubroutineName__Group_2__0_in_rule__SubroutineName__Group__2__Impl9123);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4529:1: rule__SubroutineName__Group_2__0 : rule__SubroutineName__Group_2__0__Impl rule__SubroutineName__Group_2__1 ;
    public final void rule__SubroutineName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4533:1: ( rule__SubroutineName__Group_2__0__Impl rule__SubroutineName__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4534:2: rule__SubroutineName__Group_2__0__Impl rule__SubroutineName__Group_2__1
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group_2__0__Impl_in_rule__SubroutineName__Group_2__09160);
            rule__SubroutineName__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubroutineName__Group_2__1_in_rule__SubroutineName__Group_2__09163);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4541:1: rule__SubroutineName__Group_2__0__Impl : ( '(' ) ;
    public final void rule__SubroutineName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4545:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4546:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4546:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4547:1: '('
            {
             before(grammarAccess.getSubroutineNameAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__SubroutineName__Group_2__0__Impl9191); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4560:1: rule__SubroutineName__Group_2__1 : rule__SubroutineName__Group_2__1__Impl rule__SubroutineName__Group_2__2 ;
    public final void rule__SubroutineName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4564:1: ( rule__SubroutineName__Group_2__1__Impl rule__SubroutineName__Group_2__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4565:2: rule__SubroutineName__Group_2__1__Impl rule__SubroutineName__Group_2__2
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group_2__1__Impl_in_rule__SubroutineName__Group_2__19222);
            rule__SubroutineName__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubroutineName__Group_2__2_in_rule__SubroutineName__Group_2__19225);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4572:1: rule__SubroutineName__Group_2__1__Impl : ( ( rule__SubroutineName__NameAssignment_2_1 ) ) ;
    public final void rule__SubroutineName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4576:1: ( ( ( rule__SubroutineName__NameAssignment_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4577:1: ( ( rule__SubroutineName__NameAssignment_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4577:1: ( ( rule__SubroutineName__NameAssignment_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4578:1: ( rule__SubroutineName__NameAssignment_2_1 )
            {
             before(grammarAccess.getSubroutineNameAccess().getNameAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4579:1: ( rule__SubroutineName__NameAssignment_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4579:2: rule__SubroutineName__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SubroutineName__NameAssignment_2_1_in_rule__SubroutineName__Group_2__1__Impl9252);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4589:1: rule__SubroutineName__Group_2__2 : rule__SubroutineName__Group_2__2__Impl ;
    public final void rule__SubroutineName__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4593:1: ( rule__SubroutineName__Group_2__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4594:2: rule__SubroutineName__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group_2__2__Impl_in_rule__SubroutineName__Group_2__29282);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4600:1: rule__SubroutineName__Group_2__2__Impl : ( ')' ) ;
    public final void rule__SubroutineName__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4604:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4605:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4605:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4606:1: ')'
            {
             before(grammarAccess.getSubroutineNameAccess().getRightParenthesisKeyword_2_2()); 
            match(input,21,FOLLOW_21_in_rule__SubroutineName__Group_2__2__Impl9310); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4625:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4629:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4630:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__09347);
            rule__Call__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__09350);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4637:1: rule__Call__Group__0__Impl : ( 'call' ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4641:1: ( ( 'call' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4642:1: ( 'call' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4642:1: ( 'call' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4643:1: 'call'
            {
             before(grammarAccess.getCallAccess().getCallKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Call__Group__0__Impl9378); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4656:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4660:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4661:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__19409);
            rule__Call__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__2_in_rule__Call__Group__19412);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4668:1: rule__Call__Group__1__Impl : ( '(' ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4672:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4673:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4673:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4674:1: '('
            {
             before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Call__Group__1__Impl9440); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4687:1: rule__Call__Group__2 : rule__Call__Group__2__Impl rule__Call__Group__3 ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4691:1: ( rule__Call__Group__2__Impl rule__Call__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4692:2: rule__Call__Group__2__Impl rule__Call__Group__3
            {
            pushFollow(FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__29471);
            rule__Call__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__3_in_rule__Call__Group__29474);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4699:1: rule__Call__Group__2__Impl : ( ( rule__Call__SubroutineNameAssignment_2 ) ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4703:1: ( ( ( rule__Call__SubroutineNameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4704:1: ( ( rule__Call__SubroutineNameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4704:1: ( ( rule__Call__SubroutineNameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4705:1: ( rule__Call__SubroutineNameAssignment_2 )
            {
             before(grammarAccess.getCallAccess().getSubroutineNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4706:1: ( rule__Call__SubroutineNameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4706:2: rule__Call__SubroutineNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Call__SubroutineNameAssignment_2_in_rule__Call__Group__2__Impl9501);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4716:1: rule__Call__Group__3 : rule__Call__Group__3__Impl rule__Call__Group__4 ;
    public final void rule__Call__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4720:1: ( rule__Call__Group__3__Impl rule__Call__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4721:2: rule__Call__Group__3__Impl rule__Call__Group__4
            {
            pushFollow(FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__39531);
            rule__Call__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__4_in_rule__Call__Group__39534);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4728:1: rule__Call__Group__3__Impl : ( ( rule__Call__Group_3__0 )? ) ;
    public final void rule__Call__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4732:1: ( ( ( rule__Call__Group_3__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4733:1: ( ( rule__Call__Group_3__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4733:1: ( ( rule__Call__Group_3__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4734:1: ( rule__Call__Group_3__0 )?
            {
             before(grammarAccess.getCallAccess().getGroup_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4735:1: ( rule__Call__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==20) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4735:2: rule__Call__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl9561);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4745:1: rule__Call__Group__4 : rule__Call__Group__4__Impl ;
    public final void rule__Call__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4749:1: ( rule__Call__Group__4__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4750:2: rule__Call__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__49592);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4756:1: rule__Call__Group__4__Impl : ( ')' ) ;
    public final void rule__Call__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4760:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4761:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4761:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4762:1: ')'
            {
             before(grammarAccess.getCallAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Call__Group__4__Impl9620); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4785:1: rule__Call__Group_3__0 : rule__Call__Group_3__0__Impl rule__Call__Group_3__1 ;
    public final void rule__Call__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4789:1: ( rule__Call__Group_3__0__Impl rule__Call__Group_3__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4790:2: rule__Call__Group_3__0__Impl rule__Call__Group_3__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__09661);
            rule__Call__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__09664);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4797:1: rule__Call__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Call__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4801:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4802:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4802:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4803:1: '('
            {
             before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__Call__Group_3__0__Impl9692); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4816:1: rule__Call__Group_3__1 : rule__Call__Group_3__1__Impl rule__Call__Group_3__2 ;
    public final void rule__Call__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4820:1: ( rule__Call__Group_3__1__Impl rule__Call__Group_3__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4821:2: rule__Call__Group_3__1__Impl rule__Call__Group_3__2
            {
            pushFollow(FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__19723);
            rule__Call__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3__2_in_rule__Call__Group_3__19726);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4828:1: rule__Call__Group_3__1__Impl : ( ( rule__Call__Group_3_1__0 )? ) ;
    public final void rule__Call__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4832:1: ( ( ( rule__Call__Group_3_1__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4833:1: ( ( rule__Call__Group_3_1__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4833:1: ( ( rule__Call__Group_3_1__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4834:1: ( rule__Call__Group_3_1__0 )?
            {
             before(grammarAccess.getCallAccess().getGroup_3_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4835:1: ( rule__Call__Group_3_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_INT && LA41_0<=RULE_ID)||LA41_0==31||LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4835:2: rule__Call__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Call__Group_3_1__0_in_rule__Call__Group_3__1__Impl9753);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4845:1: rule__Call__Group_3__2 : rule__Call__Group_3__2__Impl ;
    public final void rule__Call__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4849:1: ( rule__Call__Group_3__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4850:2: rule__Call__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3__2__Impl_in_rule__Call__Group_3__29784);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4856:1: rule__Call__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Call__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4860:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4861:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4861:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4862:1: ')'
            {
             before(grammarAccess.getCallAccess().getRightParenthesisKeyword_3_2()); 
            match(input,21,FOLLOW_21_in_rule__Call__Group_3__2__Impl9812); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4881:1: rule__Call__Group_3_1__0 : rule__Call__Group_3_1__0__Impl rule__Call__Group_3_1__1 ;
    public final void rule__Call__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4885:1: ( rule__Call__Group_3_1__0__Impl rule__Call__Group_3_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4886:2: rule__Call__Group_3_1__0__Impl rule__Call__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1__0__Impl_in_rule__Call__Group_3_1__09849);
            rule__Call__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3_1__1_in_rule__Call__Group_3_1__09852);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4893:1: rule__Call__Group_3_1__0__Impl : ( ( rule__Call__ParamsAssignment_3_1_0 ) ) ;
    public final void rule__Call__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4897:1: ( ( ( rule__Call__ParamsAssignment_3_1_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4898:1: ( ( rule__Call__ParamsAssignment_3_1_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4898:1: ( ( rule__Call__ParamsAssignment_3_1_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4899:1: ( rule__Call__ParamsAssignment_3_1_0 )
            {
             before(grammarAccess.getCallAccess().getParamsAssignment_3_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4900:1: ( rule__Call__ParamsAssignment_3_1_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4900:2: rule__Call__ParamsAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Call__ParamsAssignment_3_1_0_in_rule__Call__Group_3_1__0__Impl9879);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4910:1: rule__Call__Group_3_1__1 : rule__Call__Group_3_1__1__Impl ;
    public final void rule__Call__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4914:1: ( rule__Call__Group_3_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4915:2: rule__Call__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1__1__Impl_in_rule__Call__Group_3_1__19909);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4921:1: rule__Call__Group_3_1__1__Impl : ( ( rule__Call__Group_3_1_1__0 )* ) ;
    public final void rule__Call__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4925:1: ( ( ( rule__Call__Group_3_1_1__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4926:1: ( ( rule__Call__Group_3_1_1__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4926:1: ( ( rule__Call__Group_3_1_1__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4927:1: ( rule__Call__Group_3_1_1__0 )*
            {
             before(grammarAccess.getCallAccess().getGroup_3_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4928:1: ( rule__Call__Group_3_1_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==26) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4928:2: rule__Call__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Call__Group_3_1_1__0_in_rule__Call__Group_3_1__1__Impl9936);
            	    rule__Call__Group_3_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4942:1: rule__Call__Group_3_1_1__0 : rule__Call__Group_3_1_1__0__Impl rule__Call__Group_3_1_1__1 ;
    public final void rule__Call__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4946:1: ( rule__Call__Group_3_1_1__0__Impl rule__Call__Group_3_1_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4947:2: rule__Call__Group_3_1_1__0__Impl rule__Call__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1_1__0__Impl_in_rule__Call__Group_3_1_1__09971);
            rule__Call__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3_1_1__1_in_rule__Call__Group_3_1_1__09974);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4954:1: rule__Call__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Call__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4958:1: ( ( ',' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4959:1: ( ',' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4959:1: ( ',' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4960:1: ','
            {
             before(grammarAccess.getCallAccess().getCommaKeyword_3_1_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Call__Group_3_1_1__0__Impl10002); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4973:1: rule__Call__Group_3_1_1__1 : rule__Call__Group_3_1_1__1__Impl ;
    public final void rule__Call__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4977:1: ( rule__Call__Group_3_1_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4978:2: rule__Call__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1_1__1__Impl_in_rule__Call__Group_3_1_1__110033);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4984:1: rule__Call__Group_3_1_1__1__Impl : ( ( rule__Call__ParamsAssignment_3_1_1_1 ) ) ;
    public final void rule__Call__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4988:1: ( ( ( rule__Call__ParamsAssignment_3_1_1_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4989:1: ( ( rule__Call__ParamsAssignment_3_1_1_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4989:1: ( ( rule__Call__ParamsAssignment_3_1_1_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4990:1: ( rule__Call__ParamsAssignment_3_1_1_1 )
            {
             before(grammarAccess.getCallAccess().getParamsAssignment_3_1_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4991:1: ( rule__Call__ParamsAssignment_3_1_1_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4991:2: rule__Call__ParamsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Call__ParamsAssignment_3_1_1_1_in_rule__Call__Group_3_1_1__1__Impl10060);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5005:1: rule__ActualParam__Group__0 : rule__ActualParam__Group__0__Impl rule__ActualParam__Group__1 ;
    public final void rule__ActualParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5009:1: ( rule__ActualParam__Group__0__Impl rule__ActualParam__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5010:2: rule__ActualParam__Group__0__Impl rule__ActualParam__Group__1
            {
            pushFollow(FOLLOW_rule__ActualParam__Group__0__Impl_in_rule__ActualParam__Group__010094);
            rule__ActualParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParam__Group__1_in_rule__ActualParam__Group__010097);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5017:1: rule__ActualParam__Group__0__Impl : ( ( rule__ActualParam__Group_0__0 )? ) ;
    public final void rule__ActualParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5021:1: ( ( ( rule__ActualParam__Group_0__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5022:1: ( ( rule__ActualParam__Group_0__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5022:1: ( ( rule__ActualParam__Group_0__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5023:1: ( rule__ActualParam__Group_0__0 )?
            {
             before(grammarAccess.getActualParamAccess().getGroup_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5024:1: ( rule__ActualParam__Group_0__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==15||LA43_1==48) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5024:2: rule__ActualParam__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ActualParam__Group_0__0_in_rule__ActualParam__Group__0__Impl10124);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5034:1: rule__ActualParam__Group__1 : rule__ActualParam__Group__1__Impl ;
    public final void rule__ActualParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5038:1: ( rule__ActualParam__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5039:2: rule__ActualParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActualParam__Group__1__Impl_in_rule__ActualParam__Group__110155);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5045:1: rule__ActualParam__Group__1__Impl : ( ( rule__ActualParam__ValueAssignment_1 ) ) ;
    public final void rule__ActualParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5049:1: ( ( ( rule__ActualParam__ValueAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5050:1: ( ( rule__ActualParam__ValueAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5050:1: ( ( rule__ActualParam__ValueAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5051:1: ( rule__ActualParam__ValueAssignment_1 )
            {
             before(grammarAccess.getActualParamAccess().getValueAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5052:1: ( rule__ActualParam__ValueAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5052:2: rule__ActualParam__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__ActualParam__ValueAssignment_1_in_rule__ActualParam__Group__1__Impl10182);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5066:1: rule__ActualParam__Group_0__0 : rule__ActualParam__Group_0__0__Impl rule__ActualParam__Group_0__1 ;
    public final void rule__ActualParam__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5070:1: ( rule__ActualParam__Group_0__0__Impl rule__ActualParam__Group_0__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5071:2: rule__ActualParam__Group_0__0__Impl rule__ActualParam__Group_0__1
            {
            pushFollow(FOLLOW_rule__ActualParam__Group_0__0__Impl_in_rule__ActualParam__Group_0__010216);
            rule__ActualParam__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParam__Group_0__1_in_rule__ActualParam__Group_0__010219);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5078:1: rule__ActualParam__Group_0__0__Impl : ( ( rule__ActualParam__KeywordAssignment_0_0 ) ) ;
    public final void rule__ActualParam__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5082:1: ( ( ( rule__ActualParam__KeywordAssignment_0_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5083:1: ( ( rule__ActualParam__KeywordAssignment_0_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5083:1: ( ( rule__ActualParam__KeywordAssignment_0_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5084:1: ( rule__ActualParam__KeywordAssignment_0_0 )
            {
             before(grammarAccess.getActualParamAccess().getKeywordAssignment_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5085:1: ( rule__ActualParam__KeywordAssignment_0_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5085:2: rule__ActualParam__KeywordAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ActualParam__KeywordAssignment_0_0_in_rule__ActualParam__Group_0__0__Impl10246);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5095:1: rule__ActualParam__Group_0__1 : rule__ActualParam__Group_0__1__Impl rule__ActualParam__Group_0__2 ;
    public final void rule__ActualParam__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5099:1: ( rule__ActualParam__Group_0__1__Impl rule__ActualParam__Group_0__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5100:2: rule__ActualParam__Group_0__1__Impl rule__ActualParam__Group_0__2
            {
            pushFollow(FOLLOW_rule__ActualParam__Group_0__1__Impl_in_rule__ActualParam__Group_0__110276);
            rule__ActualParam__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParam__Group_0__2_in_rule__ActualParam__Group_0__110279);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5107:1: rule__ActualParam__Group_0__1__Impl : ( ( rule__ActualParam__OptionalAssignment_0_1 )? ) ;
    public final void rule__ActualParam__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5111:1: ( ( ( rule__ActualParam__OptionalAssignment_0_1 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5112:1: ( ( rule__ActualParam__OptionalAssignment_0_1 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5112:1: ( ( rule__ActualParam__OptionalAssignment_0_1 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5113:1: ( rule__ActualParam__OptionalAssignment_0_1 )?
            {
             before(grammarAccess.getActualParamAccess().getOptionalAssignment_0_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5114:1: ( rule__ActualParam__OptionalAssignment_0_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==48) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5114:2: rule__ActualParam__OptionalAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__ActualParam__OptionalAssignment_0_1_in_rule__ActualParam__Group_0__1__Impl10306);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5124:1: rule__ActualParam__Group_0__2 : rule__ActualParam__Group_0__2__Impl ;
    public final void rule__ActualParam__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5128:1: ( rule__ActualParam__Group_0__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5129:2: rule__ActualParam__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ActualParam__Group_0__2__Impl_in_rule__ActualParam__Group_0__210337);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5135:1: rule__ActualParam__Group_0__2__Impl : ( '=' ) ;
    public final void rule__ActualParam__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5139:1: ( ( '=' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5140:1: ( '=' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5140:1: ( '=' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5141:1: '='
            {
             before(grammarAccess.getActualParamAccess().getEqualsSignKeyword_0_2()); 
            match(input,15,FOLLOW_15_in_rule__ActualParam__Group_0__2__Impl10365); 
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


    // $ANTLR start "rule__ActualParamByKeyword__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5160:1: rule__ActualParamByKeyword__Group__0 : rule__ActualParamByKeyword__Group__0__Impl rule__ActualParamByKeyword__Group__1 ;
    public final void rule__ActualParamByKeyword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5164:1: ( rule__ActualParamByKeyword__Group__0__Impl rule__ActualParamByKeyword__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5165:2: rule__ActualParamByKeyword__Group__0__Impl rule__ActualParamByKeyword__Group__1
            {
            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__0__Impl_in_rule__ActualParamByKeyword__Group__010402);
            rule__ActualParamByKeyword__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__1_in_rule__ActualParamByKeyword__Group__010405);
            rule__ActualParamByKeyword__Group__1();

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
    // $ANTLR end "rule__ActualParamByKeyword__Group__0"


    // $ANTLR start "rule__ActualParamByKeyword__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5172:1: rule__ActualParamByKeyword__Group__0__Impl : ( 'actualParamByKeyword' ) ;
    public final void rule__ActualParamByKeyword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5176:1: ( ( 'actualParamByKeyword' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5177:1: ( 'actualParamByKeyword' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5177:1: ( 'actualParamByKeyword' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5178:1: 'actualParamByKeyword'
            {
             before(grammarAccess.getActualParamByKeywordAccess().getActualParamByKeywordKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ActualParamByKeyword__Group__0__Impl10433); 
             after(grammarAccess.getActualParamByKeywordAccess().getActualParamByKeywordKeyword_0()); 

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
    // $ANTLR end "rule__ActualParamByKeyword__Group__0__Impl"


    // $ANTLR start "rule__ActualParamByKeyword__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5191:1: rule__ActualParamByKeyword__Group__1 : rule__ActualParamByKeyword__Group__1__Impl rule__ActualParamByKeyword__Group__2 ;
    public final void rule__ActualParamByKeyword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5195:1: ( rule__ActualParamByKeyword__Group__1__Impl rule__ActualParamByKeyword__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5196:2: rule__ActualParamByKeyword__Group__1__Impl rule__ActualParamByKeyword__Group__2
            {
            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__1__Impl_in_rule__ActualParamByKeyword__Group__110464);
            rule__ActualParamByKeyword__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__2_in_rule__ActualParamByKeyword__Group__110467);
            rule__ActualParamByKeyword__Group__2();

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
    // $ANTLR end "rule__ActualParamByKeyword__Group__1"


    // $ANTLR start "rule__ActualParamByKeyword__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5203:1: rule__ActualParamByKeyword__Group__1__Impl : ( '(' ) ;
    public final void rule__ActualParamByKeyword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5207:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5208:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5208:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5209:1: '('
            {
             before(grammarAccess.getActualParamByKeywordAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__ActualParamByKeyword__Group__1__Impl10495); 
             after(grammarAccess.getActualParamByKeywordAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__ActualParamByKeyword__Group__1__Impl"


    // $ANTLR start "rule__ActualParamByKeyword__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5222:1: rule__ActualParamByKeyword__Group__2 : rule__ActualParamByKeyword__Group__2__Impl rule__ActualParamByKeyword__Group__3 ;
    public final void rule__ActualParamByKeyword__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5226:1: ( rule__ActualParamByKeyword__Group__2__Impl rule__ActualParamByKeyword__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5227:2: rule__ActualParamByKeyword__Group__2__Impl rule__ActualParamByKeyword__Group__3
            {
            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__2__Impl_in_rule__ActualParamByKeyword__Group__210526);
            rule__ActualParamByKeyword__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__3_in_rule__ActualParamByKeyword__Group__210529);
            rule__ActualParamByKeyword__Group__3();

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
    // $ANTLR end "rule__ActualParamByKeyword__Group__2"


    // $ANTLR start "rule__ActualParamByKeyword__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5234:1: rule__ActualParamByKeyword__Group__2__Impl : ( ( rule__ActualParamByKeyword__KeywordAssignment_2 ) ) ;
    public final void rule__ActualParamByKeyword__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5238:1: ( ( ( rule__ActualParamByKeyword__KeywordAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5239:1: ( ( rule__ActualParamByKeyword__KeywordAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5239:1: ( ( rule__ActualParamByKeyword__KeywordAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5240:1: ( rule__ActualParamByKeyword__KeywordAssignment_2 )
            {
             before(grammarAccess.getActualParamByKeywordAccess().getKeywordAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5241:1: ( rule__ActualParamByKeyword__KeywordAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5241:2: rule__ActualParamByKeyword__KeywordAssignment_2
            {
            pushFollow(FOLLOW_rule__ActualParamByKeyword__KeywordAssignment_2_in_rule__ActualParamByKeyword__Group__2__Impl10556);
            rule__ActualParamByKeyword__KeywordAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActualParamByKeywordAccess().getKeywordAssignment_2()); 

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
    // $ANTLR end "rule__ActualParamByKeyword__Group__2__Impl"


    // $ANTLR start "rule__ActualParamByKeyword__Group__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5251:1: rule__ActualParamByKeyword__Group__3 : rule__ActualParamByKeyword__Group__3__Impl ;
    public final void rule__ActualParamByKeyword__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5255:1: ( rule__ActualParamByKeyword__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5256:2: rule__ActualParamByKeyword__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__3__Impl_in_rule__ActualParamByKeyword__Group__310586);
            rule__ActualParamByKeyword__Group__3__Impl();

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
    // $ANTLR end "rule__ActualParamByKeyword__Group__3"


    // $ANTLR start "rule__ActualParamByKeyword__Group__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5262:1: rule__ActualParamByKeyword__Group__3__Impl : ( ')' ) ;
    public final void rule__ActualParamByKeyword__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5266:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5267:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5267:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5268:1: ')'
            {
             before(grammarAccess.getActualParamByKeywordAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__ActualParamByKeyword__Group__3__Impl10614); 
             after(grammarAccess.getActualParamByKeywordAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__ActualParamByKeyword__Group__3__Impl"


    // $ANTLR start "rule__PathExpr__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5289:1: rule__PathExpr__Group__0 : rule__PathExpr__Group__0__Impl rule__PathExpr__Group__1 ;
    public final void rule__PathExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5293:1: ( rule__PathExpr__Group__0__Impl rule__PathExpr__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5294:2: rule__PathExpr__Group__0__Impl rule__PathExpr__Group__1
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__0__Impl_in_rule__PathExpr__Group__010653);
            rule__PathExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExpr__Group__1_in_rule__PathExpr__Group__010656);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5301:1: rule__PathExpr__Group__0__Impl : ( '#' ) ;
    public final void rule__PathExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5305:1: ( ( '#' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5306:1: ( '#' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5306:1: ( '#' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5307:1: '#'
            {
             before(grammarAccess.getPathExprAccess().getNumberSignKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__PathExpr__Group__0__Impl10684); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5320:1: rule__PathExpr__Group__1 : rule__PathExpr__Group__1__Impl ;
    public final void rule__PathExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5324:1: ( rule__PathExpr__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5325:2: rule__PathExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__1__Impl_in_rule__PathExpr__Group__110715);
            rule__PathExpr__Group__1__Impl();

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5331:1: rule__PathExpr__Group__1__Impl : ( rulePathExprNode ) ;
    public final void rule__PathExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5335:1: ( ( rulePathExprNode ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5336:1: ( rulePathExprNode )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5336:1: ( rulePathExprNode )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5337:1: rulePathExprNode
            {
             before(grammarAccess.getPathExprAccess().getPathExprNodeParserRuleCall_1()); 
            pushFollow(FOLLOW_rulePathExprNode_in_rule__PathExpr__Group__1__Impl10742);
            rulePathExprNode();

            state._fsp--;

             after(grammarAccess.getPathExprAccess().getPathExprNodeParserRuleCall_1()); 

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


    // $ANTLR start "rule__PathExprNode__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5352:1: rule__PathExprNode__Group__0 : rule__PathExprNode__Group__0__Impl rule__PathExprNode__Group__1 ;
    public final void rule__PathExprNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5356:1: ( rule__PathExprNode__Group__0__Impl rule__PathExprNode__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5357:2: rule__PathExprNode__Group__0__Impl rule__PathExprNode__Group__1
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group__0__Impl_in_rule__PathExprNode__Group__010775);
            rule__PathExprNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExprNode__Group__1_in_rule__PathExprNode__Group__010778);
            rule__PathExprNode__Group__1();

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
    // $ANTLR end "rule__PathExprNode__Group__0"


    // $ANTLR start "rule__PathExprNode__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5364:1: rule__PathExprNode__Group__0__Impl : ( rulePathExprTerm ) ;
    public final void rule__PathExprNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5368:1: ( ( rulePathExprTerm ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5369:1: ( rulePathExprTerm )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5369:1: ( rulePathExprTerm )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5370:1: rulePathExprTerm
            {
             before(grammarAccess.getPathExprNodeAccess().getPathExprTermParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePathExprTerm_in_rule__PathExprNode__Group__0__Impl10805);
            rulePathExprTerm();

            state._fsp--;

             after(grammarAccess.getPathExprNodeAccess().getPathExprTermParserRuleCall_0()); 

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
    // $ANTLR end "rule__PathExprNode__Group__0__Impl"


    // $ANTLR start "rule__PathExprNode__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5381:1: rule__PathExprNode__Group__1 : rule__PathExprNode__Group__1__Impl ;
    public final void rule__PathExprNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5385:1: ( rule__PathExprNode__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5386:2: rule__PathExprNode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group__1__Impl_in_rule__PathExprNode__Group__110834);
            rule__PathExprNode__Group__1__Impl();

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
    // $ANTLR end "rule__PathExprNode__Group__1"


    // $ANTLR start "rule__PathExprNode__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5392:1: rule__PathExprNode__Group__1__Impl : ( ( rule__PathExprNode__Group_1__0 )* ) ;
    public final void rule__PathExprNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5396:1: ( ( ( rule__PathExprNode__Group_1__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5397:1: ( ( rule__PathExprNode__Group_1__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5397:1: ( ( rule__PathExprNode__Group_1__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5398:1: ( rule__PathExprNode__Group_1__0 )*
            {
             before(grammarAccess.getPathExprNodeAccess().getGroup_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5399:1: ( rule__PathExprNode__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==32) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5399:2: rule__PathExprNode__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PathExprNode__Group_1__0_in_rule__PathExprNode__Group__1__Impl10861);
            	    rule__PathExprNode__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getPathExprNodeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PathExprNode__Group__1__Impl"


    // $ANTLR start "rule__PathExprNode__Group_1__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5413:1: rule__PathExprNode__Group_1__0 : rule__PathExprNode__Group_1__0__Impl rule__PathExprNode__Group_1__1 ;
    public final void rule__PathExprNode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5417:1: ( rule__PathExprNode__Group_1__0__Impl rule__PathExprNode__Group_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5418:2: rule__PathExprNode__Group_1__0__Impl rule__PathExprNode__Group_1__1
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group_1__0__Impl_in_rule__PathExprNode__Group_1__010896);
            rule__PathExprNode__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExprNode__Group_1__1_in_rule__PathExprNode__Group_1__010899);
            rule__PathExprNode__Group_1__1();

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
    // $ANTLR end "rule__PathExprNode__Group_1__0"


    // $ANTLR start "rule__PathExprNode__Group_1__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5425:1: rule__PathExprNode__Group_1__0__Impl : ( () ) ;
    public final void rule__PathExprNode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5429:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5430:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5430:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5431:1: ()
            {
             before(grammarAccess.getPathExprNodeAccess().getPathExprHeadAction_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5432:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5434:1: 
            {
            }

             after(grammarAccess.getPathExprNodeAccess().getPathExprHeadAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExprNode__Group_1__0__Impl"


    // $ANTLR start "rule__PathExprNode__Group_1__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5444:1: rule__PathExprNode__Group_1__1 : rule__PathExprNode__Group_1__1__Impl rule__PathExprNode__Group_1__2 ;
    public final void rule__PathExprNode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5448:1: ( rule__PathExprNode__Group_1__1__Impl rule__PathExprNode__Group_1__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5449:2: rule__PathExprNode__Group_1__1__Impl rule__PathExprNode__Group_1__2
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group_1__1__Impl_in_rule__PathExprNode__Group_1__110957);
            rule__PathExprNode__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExprNode__Group_1__2_in_rule__PathExprNode__Group_1__110960);
            rule__PathExprNode__Group_1__2();

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
    // $ANTLR end "rule__PathExprNode__Group_1__1"


    // $ANTLR start "rule__PathExprNode__Group_1__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5456:1: rule__PathExprNode__Group_1__1__Impl : ( '/' ) ;
    public final void rule__PathExprNode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5460:1: ( ( '/' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5461:1: ( '/' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5461:1: ( '/' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5462:1: '/'
            {
             before(grammarAccess.getPathExprNodeAccess().getSolidusKeyword_1_1()); 
            match(input,32,FOLLOW_32_in_rule__PathExprNode__Group_1__1__Impl10988); 
             after(grammarAccess.getPathExprNodeAccess().getSolidusKeyword_1_1()); 

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
    // $ANTLR end "rule__PathExprNode__Group_1__1__Impl"


    // $ANTLR start "rule__PathExprNode__Group_1__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5475:1: rule__PathExprNode__Group_1__2 : rule__PathExprNode__Group_1__2__Impl ;
    public final void rule__PathExprNode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5479:1: ( rule__PathExprNode__Group_1__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5480:2: rule__PathExprNode__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group_1__2__Impl_in_rule__PathExprNode__Group_1__211019);
            rule__PathExprNode__Group_1__2__Impl();

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
    // $ANTLR end "rule__PathExprNode__Group_1__2"


    // $ANTLR start "rule__PathExprNode__Group_1__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5486:1: rule__PathExprNode__Group_1__2__Impl : ( ( rule__PathExprNode__TailAssignment_1_2 ) ) ;
    public final void rule__PathExprNode__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5490:1: ( ( ( rule__PathExprNode__TailAssignment_1_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5491:1: ( ( rule__PathExprNode__TailAssignment_1_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5491:1: ( ( rule__PathExprNode__TailAssignment_1_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5492:1: ( rule__PathExprNode__TailAssignment_1_2 )
            {
             before(grammarAccess.getPathExprNodeAccess().getTailAssignment_1_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5493:1: ( rule__PathExprNode__TailAssignment_1_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5493:2: rule__PathExprNode__TailAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PathExprNode__TailAssignment_1_2_in_rule__PathExprNode__Group_1__2__Impl11046);
            rule__PathExprNode__TailAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPathExprNodeAccess().getTailAssignment_1_2()); 

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
    // $ANTLR end "rule__PathExprNode__Group_1__2__Impl"


    // $ANTLR start "rule__PathExprTerm__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5509:1: rule__PathExprTerm__Group__0 : rule__PathExprTerm__Group__0__Impl rule__PathExprTerm__Group__1 ;
    public final void rule__PathExprTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5513:1: ( rule__PathExprTerm__Group__0__Impl rule__PathExprTerm__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5514:2: rule__PathExprTerm__Group__0__Impl rule__PathExprTerm__Group__1
            {
            pushFollow(FOLLOW_rule__PathExprTerm__Group__0__Impl_in_rule__PathExprTerm__Group__011082);
            rule__PathExprTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExprTerm__Group__1_in_rule__PathExprTerm__Group__011085);
            rule__PathExprTerm__Group__1();

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
    // $ANTLR end "rule__PathExprTerm__Group__0"


    // $ANTLR start "rule__PathExprTerm__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5521:1: rule__PathExprTerm__Group__0__Impl : ( () ) ;
    public final void rule__PathExprTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5525:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5526:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5526:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5527:1: ()
            {
             before(grammarAccess.getPathExprTermAccess().getPathExprTermAction_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5528:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5530:1: 
            {
            }

             after(grammarAccess.getPathExprTermAccess().getPathExprTermAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathExprTerm__Group__0__Impl"


    // $ANTLR start "rule__PathExprTerm__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5540:1: rule__PathExprTerm__Group__1 : rule__PathExprTerm__Group__1__Impl rule__PathExprTerm__Group__2 ;
    public final void rule__PathExprTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5544:1: ( rule__PathExprTerm__Group__1__Impl rule__PathExprTerm__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5545:2: rule__PathExprTerm__Group__1__Impl rule__PathExprTerm__Group__2
            {
            pushFollow(FOLLOW_rule__PathExprTerm__Group__1__Impl_in_rule__PathExprTerm__Group__111143);
            rule__PathExprTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExprTerm__Group__2_in_rule__PathExprTerm__Group__111146);
            rule__PathExprTerm__Group__2();

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
    // $ANTLR end "rule__PathExprTerm__Group__1"


    // $ANTLR start "rule__PathExprTerm__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5552:1: rule__PathExprTerm__Group__1__Impl : ( ( rule__PathExprTerm__AxisAssignment_1 )? ) ;
    public final void rule__PathExprTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5556:1: ( ( ( rule__PathExprTerm__AxisAssignment_1 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5557:1: ( ( rule__PathExprTerm__AxisAssignment_1 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5557:1: ( ( rule__PathExprTerm__AxisAssignment_1 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5558:1: ( rule__PathExprTerm__AxisAssignment_1 )?
            {
             before(grammarAccess.getPathExprTermAccess().getAxisAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5559:1: ( rule__PathExprTerm__AxisAssignment_1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==49) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5559:2: rule__PathExprTerm__AxisAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PathExprTerm__AxisAssignment_1_in_rule__PathExprTerm__Group__1__Impl11173);
                    rule__PathExprTerm__AxisAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPathExprTermAccess().getAxisAssignment_1()); 

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
    // $ANTLR end "rule__PathExprTerm__Group__1__Impl"


    // $ANTLR start "rule__PathExprTerm__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5569:1: rule__PathExprTerm__Group__2 : rule__PathExprTerm__Group__2__Impl ;
    public final void rule__PathExprTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5573:1: ( rule__PathExprTerm__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5574:2: rule__PathExprTerm__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PathExprTerm__Group__2__Impl_in_rule__PathExprTerm__Group__211204);
            rule__PathExprTerm__Group__2__Impl();

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
    // $ANTLR end "rule__PathExprTerm__Group__2"


    // $ANTLR start "rule__PathExprTerm__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5580:1: rule__PathExprTerm__Group__2__Impl : ( ( rule__PathExprTerm__RefAssignment_2 ) ) ;
    public final void rule__PathExprTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5584:1: ( ( ( rule__PathExprTerm__RefAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5585:1: ( ( rule__PathExprTerm__RefAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5585:1: ( ( rule__PathExprTerm__RefAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5586:1: ( rule__PathExprTerm__RefAssignment_2 )
            {
             before(grammarAccess.getPathExprTermAccess().getRefAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5587:1: ( rule__PathExprTerm__RefAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5587:2: rule__PathExprTerm__RefAssignment_2
            {
            pushFollow(FOLLOW_rule__PathExprTerm__RefAssignment_2_in_rule__PathExprTerm__Group__2__Impl11231);
            rule__PathExprTerm__RefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPathExprTermAccess().getRefAssignment_2()); 

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
    // $ANTLR end "rule__PathExprTerm__Group__2__Impl"


    // $ANTLR start "rule__Language__NameAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5604:1: rule__Language__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Language__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5608:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5609:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5609:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5610:1: RULE_ID
            {
             before(grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Language__NameAssignment_111272); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5619:1: rule__Language__UriAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Language__UriAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5623:1: ( ( RULE_STRING ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5624:1: ( RULE_STRING )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5624:1: ( RULE_STRING )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5625:1: RULE_STRING
            {
             before(grammarAccess.getLanguageAccess().getUriSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Language__UriAssignment_211303); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5634:1: rule__Language__ConceptDefAssignment_4 : ( ruleTopConceptDef ) ;
    public final void rule__Language__ConceptDefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5638:1: ( ( ruleTopConceptDef ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5639:1: ( ruleTopConceptDef )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5639:1: ( ruleTopConceptDef )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5640:1: ruleTopConceptDef
            {
             before(grammarAccess.getLanguageAccess().getConceptDefTopConceptDefParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTopConceptDef_in_rule__Language__ConceptDefAssignment_411334);
            ruleTopConceptDef();

            state._fsp--;

             after(grammarAccess.getLanguageAccess().getConceptDefTopConceptDefParserRuleCall_4_0()); 

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


    // $ANTLR start "rule__Language__ConceptDefAssignment_5"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5649:1: rule__Language__ConceptDefAssignment_5 : ( ruleNamedConceptDef ) ;
    public final void rule__Language__ConceptDefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5653:1: ( ( ruleNamedConceptDef ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5654:1: ( ruleNamedConceptDef )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5654:1: ( ruleNamedConceptDef )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5655:1: ruleNamedConceptDef
            {
             before(grammarAccess.getLanguageAccess().getConceptDefNamedConceptDefParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleNamedConceptDef_in_rule__Language__ConceptDefAssignment_511365);
            ruleNamedConceptDef();

            state._fsp--;

             after(grammarAccess.getLanguageAccess().getConceptDefNamedConceptDefParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Language__ConceptDefAssignment_5"


    // $ANTLR start "rule__Annotation__KeyAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5664:1: rule__Annotation__KeyAssignment_0 : ( RULE_ANNOTATION_ID ) ;
    public final void rule__Annotation__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5668:1: ( ( RULE_ANNOTATION_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5669:1: ( RULE_ANNOTATION_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5669:1: ( RULE_ANNOTATION_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5670:1: RULE_ANNOTATION_ID
            {
             before(grammarAccess.getAnnotationAccess().getKeyANNOTATION_IDTerminalRuleCall_0_0()); 
            match(input,RULE_ANNOTATION_ID,FOLLOW_RULE_ANNOTATION_ID_in_rule__Annotation__KeyAssignment_011396); 
             after(grammarAccess.getAnnotationAccess().getKeyANNOTATION_IDTerminalRuleCall_0_0()); 

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


    // $ANTLR start "rule__Annotation__ValueAssignment_1_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5679:1: rule__Annotation__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5683:1: ( ( RULE_STRING ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5684:1: ( RULE_STRING )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5684:1: ( RULE_STRING )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5685:1: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_1_111427); 
             after(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Annotation__ValueAssignment_1_1"


    // $ANTLR start "rule__AnonymousConceptDef__MappingAssignment_1_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5694:1: rule__AnonymousConceptDef__MappingAssignment_1_1 : ( ruleMapping ) ;
    public final void rule__AnonymousConceptDef__MappingAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5698:1: ( ( ruleMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5699:1: ( ruleMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5699:1: ( ruleMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5700:1: ruleMapping
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getMappingMappingParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__AnonymousConceptDef__MappingAssignment_1_111458);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getAnonymousConceptDefAccess().getMappingMappingParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__AnonymousConceptDef__MappingAssignment_1_1"


    // $ANTLR start "rule__AnonymousConceptDef__AnnotationAssignment_2_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5709:1: rule__AnonymousConceptDef__AnnotationAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__AnonymousConceptDef__AnnotationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5713:1: ( ( ruleAnnotation ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5714:1: ( ruleAnnotation )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5714:1: ( ruleAnnotation )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5715:1: ruleAnnotation
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getAnnotationAnnotationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__AnonymousConceptDef__AnnotationAssignment_2_111489);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnonymousConceptDefAccess().getAnnotationAnnotationParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__AnonymousConceptDef__AnnotationAssignment_2_1"


    // $ANTLR start "rule__AnonymousConceptDef__ChildAssignment_2_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5724:1: rule__AnonymousConceptDef__ChildAssignment_2_2 : ( ruleSubconceptOrAttribute ) ;
    public final void rule__AnonymousConceptDef__ChildAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5728:1: ( ( ruleSubconceptOrAttribute ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5729:1: ( ruleSubconceptOrAttribute )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5729:1: ( ruleSubconceptOrAttribute )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5730:1: ruleSubconceptOrAttribute
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_rule__AnonymousConceptDef__ChildAssignment_2_211520);
            ruleSubconceptOrAttribute();

            state._fsp--;

             after(grammarAccess.getAnonymousConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__AnonymousConceptDef__ChildAssignment_2_2"


    // $ANTLR start "rule__NamedConceptDef__NamedAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5739:1: rule__NamedConceptDef__NamedAssignment_0 : ( ( 'concept' ) ) ;
    public final void rule__NamedConceptDef__NamedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5743:1: ( ( ( 'concept' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5744:1: ( ( 'concept' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5744:1: ( ( 'concept' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5745:1: ( 'concept' )
            {
             before(grammarAccess.getNamedConceptDefAccess().getNamedConceptKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5746:1: ( 'concept' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5747:1: 'concept'
            {
             before(grammarAccess.getNamedConceptDefAccess().getNamedConceptKeyword_0_0()); 
            match(input,33,FOLLOW_33_in_rule__NamedConceptDef__NamedAssignment_011556); 
             after(grammarAccess.getNamedConceptDefAccess().getNamedConceptKeyword_0_0()); 

            }

             after(grammarAccess.getNamedConceptDefAccess().getNamedConceptKeyword_0_0()); 

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
    // $ANTLR end "rule__NamedConceptDef__NamedAssignment_0"


    // $ANTLR start "rule__NamedConceptDef__NameAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5762:1: rule__NamedConceptDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NamedConceptDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5766:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5767:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5767:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5768:1: RULE_ID
            {
             before(grammarAccess.getNamedConceptDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamedConceptDef__NameAssignment_111595); 
             after(grammarAccess.getNamedConceptDefAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NamedConceptDef__NameAssignment_1"


    // $ANTLR start "rule__NamedConceptDef__MappingAssignment_2_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5777:1: rule__NamedConceptDef__MappingAssignment_2_1 : ( ruleMapping ) ;
    public final void rule__NamedConceptDef__MappingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5781:1: ( ( ruleMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5782:1: ( ruleMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5782:1: ( ruleMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5783:1: ruleMapping
            {
             before(grammarAccess.getNamedConceptDefAccess().getMappingMappingParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__NamedConceptDef__MappingAssignment_2_111626);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getNamedConceptDefAccess().getMappingMappingParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__NamedConceptDef__MappingAssignment_2_1"


    // $ANTLR start "rule__NamedConceptDef__AnnotationAssignment_3_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5792:1: rule__NamedConceptDef__AnnotationAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__NamedConceptDef__AnnotationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5796:1: ( ( ruleAnnotation ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5797:1: ( ruleAnnotation )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5797:1: ( ruleAnnotation )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5798:1: ruleAnnotation
            {
             before(grammarAccess.getNamedConceptDefAccess().getAnnotationAnnotationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__NamedConceptDef__AnnotationAssignment_3_111657);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getNamedConceptDefAccess().getAnnotationAnnotationParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__NamedConceptDef__AnnotationAssignment_3_1"


    // $ANTLR start "rule__NamedConceptDef__ChildAssignment_3_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5807:1: rule__NamedConceptDef__ChildAssignment_3_2 : ( ruleSubconceptOrAttribute ) ;
    public final void rule__NamedConceptDef__ChildAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5811:1: ( ( ruleSubconceptOrAttribute ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5812:1: ( ruleSubconceptOrAttribute )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5812:1: ( ruleSubconceptOrAttribute )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5813:1: ruleSubconceptOrAttribute
            {
             before(grammarAccess.getNamedConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_rule__NamedConceptDef__ChildAssignment_3_211688);
            ruleSubconceptOrAttribute();

            state._fsp--;

             after(grammarAccess.getNamedConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__NamedConceptDef__ChildAssignment_3_2"


    // $ANTLR start "rule__TopConceptDef__TopAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5822:1: rule__TopConceptDef__TopAssignment_0 : ( ( 'top' ) ) ;
    public final void rule__TopConceptDef__TopAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5826:1: ( ( ( 'top' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5827:1: ( ( 'top' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5827:1: ( ( 'top' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5828:1: ( 'top' )
            {
             before(grammarAccess.getTopConceptDefAccess().getTopTopKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5829:1: ( 'top' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5830:1: 'top'
            {
             before(grammarAccess.getTopConceptDefAccess().getTopTopKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__TopConceptDef__TopAssignment_011724); 
             after(grammarAccess.getTopConceptDefAccess().getTopTopKeyword_0_0()); 

            }

             after(grammarAccess.getTopConceptDefAccess().getTopTopKeyword_0_0()); 

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
    // $ANTLR end "rule__TopConceptDef__TopAssignment_0"


    // $ANTLR start "rule__TopConceptDef__NamedAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5845:1: rule__TopConceptDef__NamedAssignment_1 : ( ( 'concept' ) ) ;
    public final void rule__TopConceptDef__NamedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5849:1: ( ( ( 'concept' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5850:1: ( ( 'concept' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5850:1: ( ( 'concept' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5851:1: ( 'concept' )
            {
             before(grammarAccess.getTopConceptDefAccess().getNamedConceptKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5852:1: ( 'concept' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5853:1: 'concept'
            {
             before(grammarAccess.getTopConceptDefAccess().getNamedConceptKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__TopConceptDef__NamedAssignment_111768); 
             after(grammarAccess.getTopConceptDefAccess().getNamedConceptKeyword_1_0()); 

            }

             after(grammarAccess.getTopConceptDefAccess().getNamedConceptKeyword_1_0()); 

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
    // $ANTLR end "rule__TopConceptDef__NamedAssignment_1"


    // $ANTLR start "rule__TopConceptDef__NameAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5868:1: rule__TopConceptDef__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TopConceptDef__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5872:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5873:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5873:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5874:1: RULE_ID
            {
             before(grammarAccess.getTopConceptDefAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TopConceptDef__NameAssignment_211807); 
             after(grammarAccess.getTopConceptDefAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__TopConceptDef__NameAssignment_2"


    // $ANTLR start "rule__TopConceptDef__MappingAssignment_3_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5883:1: rule__TopConceptDef__MappingAssignment_3_1 : ( ruleMapping ) ;
    public final void rule__TopConceptDef__MappingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5887:1: ( ( ruleMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5888:1: ( ruleMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5888:1: ( ruleMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5889:1: ruleMapping
            {
             before(grammarAccess.getTopConceptDefAccess().getMappingMappingParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__TopConceptDef__MappingAssignment_3_111838);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getTopConceptDefAccess().getMappingMappingParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__TopConceptDef__MappingAssignment_3_1"


    // $ANTLR start "rule__TopConceptDef__AnnotationAssignment_4_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5898:1: rule__TopConceptDef__AnnotationAssignment_4_1 : ( ruleAnnotation ) ;
    public final void rule__TopConceptDef__AnnotationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5902:1: ( ( ruleAnnotation ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5903:1: ( ruleAnnotation )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5903:1: ( ruleAnnotation )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5904:1: ruleAnnotation
            {
             before(grammarAccess.getTopConceptDefAccess().getAnnotationAnnotationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__TopConceptDef__AnnotationAssignment_4_111869);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getTopConceptDefAccess().getAnnotationAnnotationParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__TopConceptDef__AnnotationAssignment_4_1"


    // $ANTLR start "rule__TopConceptDef__ChildAssignment_4_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5913:1: rule__TopConceptDef__ChildAssignment_4_2 : ( ruleSubconceptOrAttribute ) ;
    public final void rule__TopConceptDef__ChildAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5917:1: ( ( ruleSubconceptOrAttribute ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5918:1: ( ruleSubconceptOrAttribute )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5918:1: ( ruleSubconceptOrAttribute )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5919:1: ruleSubconceptOrAttribute
            {
             before(grammarAccess.getTopConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_rule__TopConceptDef__ChildAssignment_4_211900);
            ruleSubconceptOrAttribute();

            state._fsp--;

             after(grammarAccess.getTopConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__TopConceptDef__ChildAssignment_4_2"


    // $ANTLR start "rule__Subconcept__NameAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5928:1: rule__Subconcept__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Subconcept__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5932:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5933:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5933:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5934:1: RULE_ID
            {
             before(grammarAccess.getSubconceptAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Subconcept__NameAssignment_011931); 
             after(grammarAccess.getSubconceptAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Subconcept__NameAssignment_0"


    // $ANTLR start "rule__Subconcept__CardinalityAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5943:1: rule__Subconcept__CardinalityAssignment_1 : ( ruleCardinality ) ;
    public final void rule__Subconcept__CardinalityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5947:1: ( ( ruleCardinality ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5948:1: ( ruleCardinality )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5948:1: ( ruleCardinality )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5949:1: ruleCardinality
            {
             before(grammarAccess.getSubconceptAccess().getCardinalityCardinalityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Subconcept__CardinalityAssignment_111962);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getSubconceptAccess().getCardinalityCardinalityParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Subconcept__CardinalityAssignment_1"


    // $ANTLR start "rule__Subconcept__EssentialAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5958:1: rule__Subconcept__EssentialAssignment_2 : ( ( '!' ) ) ;
    public final void rule__Subconcept__EssentialAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5962:1: ( ( ( '!' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5963:1: ( ( '!' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5963:1: ( ( '!' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5964:1: ( '!' )
            {
             before(grammarAccess.getSubconceptAccess().getEssentialExclamationMarkKeyword_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5965:1: ( '!' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5966:1: '!'
            {
             before(grammarAccess.getSubconceptAccess().getEssentialExclamationMarkKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__Subconcept__EssentialAssignment_211998); 
             after(grammarAccess.getSubconceptAccess().getEssentialExclamationMarkKeyword_2_0()); 

            }

             after(grammarAccess.getSubconceptAccess().getEssentialExclamationMarkKeyword_2_0()); 

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
    // $ANTLR end "rule__Subconcept__EssentialAssignment_2"


    // $ANTLR start "rule__Subconcept__DefAssignment_3_0_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5981:1: rule__Subconcept__DefAssignment_3_0_1 : ( ruleNamedConceptDef ) ;
    public final void rule__Subconcept__DefAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5985:1: ( ( ruleNamedConceptDef ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5986:1: ( ruleNamedConceptDef )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5986:1: ( ruleNamedConceptDef )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5987:1: ruleNamedConceptDef
            {
             before(grammarAccess.getSubconceptAccess().getDefNamedConceptDefParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleNamedConceptDef_in_rule__Subconcept__DefAssignment_3_0_112037);
            ruleNamedConceptDef();

            state._fsp--;

             after(grammarAccess.getSubconceptAccess().getDefNamedConceptDefParserRuleCall_3_0_1_0()); 

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
    // $ANTLR end "rule__Subconcept__DefAssignment_3_0_1"


    // $ANTLR start "rule__Subconcept__DefAssignment_3_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5996:1: rule__Subconcept__DefAssignment_3_1 : ( ruleAnonymousConceptDef ) ;
    public final void rule__Subconcept__DefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6000:1: ( ( ruleAnonymousConceptDef ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6001:1: ( ruleAnonymousConceptDef )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6001:1: ( ruleAnonymousConceptDef )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6002:1: ruleAnonymousConceptDef
            {
             before(grammarAccess.getSubconceptAccess().getDefAnonymousConceptDefParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAnonymousConceptDef_in_rule__Subconcept__DefAssignment_3_112068);
            ruleAnonymousConceptDef();

            state._fsp--;

             after(grammarAccess.getSubconceptAccess().getDefAnonymousConceptDefParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Subconcept__DefAssignment_3_1"


    // $ANTLR start "rule__Subconcept__ReferenceAssignment_3_2_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6011:1: rule__Subconcept__ReferenceAssignment_3_2_0 : ( ( ':' ) ) ;
    public final void rule__Subconcept__ReferenceAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6015:1: ( ( ( ':' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6016:1: ( ( ':' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6016:1: ( ( ':' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6017:1: ( ':' )
            {
             before(grammarAccess.getSubconceptAccess().getReferenceColonKeyword_3_2_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6018:1: ( ':' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6019:1: ':'
            {
             before(grammarAccess.getSubconceptAccess().getReferenceColonKeyword_3_2_0_0()); 
            match(input,18,FOLLOW_18_in_rule__Subconcept__ReferenceAssignment_3_2_012104); 
             after(grammarAccess.getSubconceptAccess().getReferenceColonKeyword_3_2_0_0()); 

            }

             after(grammarAccess.getSubconceptAccess().getReferenceColonKeyword_3_2_0_0()); 

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
    // $ANTLR end "rule__Subconcept__ReferenceAssignment_3_2_0"


    // $ANTLR start "rule__Subconcept__RefAssignment_3_2_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6034:1: rule__Subconcept__RefAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Subconcept__RefAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6038:1: ( ( ( RULE_ID ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6039:1: ( ( RULE_ID ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6039:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6040:1: ( RULE_ID )
            {
             before(grammarAccess.getSubconceptAccess().getRefConceptDefCrossReference_3_2_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6041:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6042:1: RULE_ID
            {
             before(grammarAccess.getSubconceptAccess().getRefConceptDefIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Subconcept__RefAssignment_3_2_112147); 
             after(grammarAccess.getSubconceptAccess().getRefConceptDefIDTerminalRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getSubconceptAccess().getRefConceptDefCrossReference_3_2_1_0()); 

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
    // $ANTLR end "rule__Subconcept__RefAssignment_3_2_1"


    // $ANTLR start "rule__Attribute__AttribAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6053:1: rule__Attribute__AttribAssignment_0 : ( ( 'attrib' ) ) ;
    public final void rule__Attribute__AttribAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6057:1: ( ( ( 'attrib' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6058:1: ( ( 'attrib' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6058:1: ( ( 'attrib' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6059:1: ( 'attrib' )
            {
             before(grammarAccess.getAttributeAccess().getAttribAttribKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6060:1: ( 'attrib' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6061:1: 'attrib'
            {
             before(grammarAccess.getAttributeAccess().getAttribAttribKeyword_0_0()); 
            match(input,36,FOLLOW_36_in_rule__Attribute__AttribAssignment_012187); 
             after(grammarAccess.getAttributeAccess().getAttribAttribKeyword_0_0()); 

            }

             after(grammarAccess.getAttributeAccess().getAttribAttribKeyword_0_0()); 

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
    // $ANTLR end "rule__Attribute__AttribAssignment_0"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6076:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6080:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6081:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6081:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6082:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_112226); 
             after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__CardinalityAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6091:1: rule__Attribute__CardinalityAssignment_2 : ( ruleCardinality ) ;
    public final void rule__Attribute__CardinalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6095:1: ( ( ruleCardinality ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6096:1: ( ruleCardinality )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6096:1: ( ruleCardinality )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6097:1: ruleCardinality
            {
             before(grammarAccess.getAttributeAccess().getCardinalityCardinalityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Attribute__CardinalityAssignment_212257);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getCardinalityCardinalityParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Attribute__CardinalityAssignment_2"


    // $ANTLR start "rule__Attribute__EssentialAssignment_3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6106:1: rule__Attribute__EssentialAssignment_3 : ( ( '!' ) ) ;
    public final void rule__Attribute__EssentialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6110:1: ( ( ( '!' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6111:1: ( ( '!' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6111:1: ( ( '!' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6112:1: ( '!' )
            {
             before(grammarAccess.getAttributeAccess().getEssentialExclamationMarkKeyword_3_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6113:1: ( '!' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6114:1: '!'
            {
             before(grammarAccess.getAttributeAccess().getEssentialExclamationMarkKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__Attribute__EssentialAssignment_312293); 
             after(grammarAccess.getAttributeAccess().getEssentialExclamationMarkKeyword_3_0()); 

            }

             after(grammarAccess.getAttributeAccess().getEssentialExclamationMarkKeyword_3_0()); 

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
    // $ANTLR end "rule__Attribute__EssentialAssignment_3"


    // $ANTLR start "rule__Attribute__AttribMappingAssignment_4_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6129:1: rule__Attribute__AttribMappingAssignment_4_1 : ( ruleMapping ) ;
    public final void rule__Attribute__AttribMappingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6133:1: ( ( ruleMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6134:1: ( ruleMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6134:1: ( ruleMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6135:1: ruleMapping
            {
             before(grammarAccess.getAttributeAccess().getAttribMappingMappingParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__Attribute__AttribMappingAssignment_4_112332);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAttribMappingMappingParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Attribute__AttribMappingAssignment_4_1"


    // $ANTLR start "rule__Attribute__AnnotationAssignment_5_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6144:1: rule__Attribute__AnnotationAssignment_5_1 : ( ruleAnnotation ) ;
    public final void rule__Attribute__AnnotationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6148:1: ( ( ruleAnnotation ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6149:1: ( ruleAnnotation )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6149:1: ( ruleAnnotation )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6150:1: ruleAnnotation
            {
             before(grammarAccess.getAttributeAccess().getAnnotationAnnotationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Attribute__AnnotationAssignment_5_112363);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getAnnotationAnnotationParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Attribute__AnnotationAssignment_5_1"


    // $ANTLR start "rule__Cardinality__ZeroOrMoreAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6159:1: rule__Cardinality__ZeroOrMoreAssignment_0 : ( ( '*' ) ) ;
    public final void rule__Cardinality__ZeroOrMoreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6163:1: ( ( ( '*' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6164:1: ( ( '*' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6164:1: ( ( '*' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6165:1: ( '*' )
            {
             before(grammarAccess.getCardinalityAccess().getZeroOrMoreAsteriskKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6166:1: ( '*' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6167:1: '*'
            {
             before(grammarAccess.getCardinalityAccess().getZeroOrMoreAsteriskKeyword_0_0()); 
            match(input,37,FOLLOW_37_in_rule__Cardinality__ZeroOrMoreAssignment_012399); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6182:1: rule__Cardinality__OneOrMoreAssignment_1 : ( ( '+' ) ) ;
    public final void rule__Cardinality__OneOrMoreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6186:1: ( ( ( '+' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6187:1: ( ( '+' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6187:1: ( ( '+' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6188:1: ( '+' )
            {
             before(grammarAccess.getCardinalityAccess().getOneOrMorePlusSignKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6189:1: ( '+' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6190:1: '+'
            {
             before(grammarAccess.getCardinalityAccess().getOneOrMorePlusSignKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__Cardinality__OneOrMoreAssignment_112443); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6205:1: rule__Mapping__ContextAssignment_0 : ( rulePathExpr ) ;
    public final void rule__Mapping__ContextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6209:1: ( ( rulePathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6210:1: ( rulePathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6210:1: ( rulePathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6211:1: rulePathExpr
            {
             before(grammarAccess.getMappingAccess().getContextPathExprParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePathExpr_in_rule__Mapping__ContextAssignment_012482);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6220:1: rule__Mapping__MappingAssignment_1 : ( ruleImplicitContextMapping ) ;
    public final void rule__Mapping__MappingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6224:1: ( ( ruleImplicitContextMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6225:1: ( ruleImplicitContextMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6225:1: ( ruleImplicitContextMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6226:1: ruleImplicitContextMapping
            {
             before(grammarAccess.getMappingAccess().getMappingImplicitContextMappingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_rule__Mapping__MappingAssignment_112513);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6235:1: rule__Module__NameAssignment_2_1 : ( ruleIDOrPathExpr ) ;
    public final void rule__Module__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6239:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6240:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6240:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6241:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getModuleAccess().getNameIDOrPathExprParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__Module__NameAssignment_2_112544);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6250:1: rule__UsesModule__NameAssignment_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__UsesModule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6254:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6255:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6255:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6256:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getUsesModuleAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__UsesModule__NameAssignment_212575);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6265:1: rule__UsesEntity__NameAssignment_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__UsesEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6269:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6270:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6270:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6271:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getUsesEntityAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__UsesEntity__NameAssignment_212606);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6280:1: rule__Subroutine__NameAssignment_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__Subroutine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6284:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6285:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6285:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6286:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getSubroutineAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__Subroutine__NameAssignment_212637);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6295:1: rule__Subroutine__ParamsAssignment_3_1_0 : ( ruleFormalParam ) ;
    public final void rule__Subroutine__ParamsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6299:1: ( ( ruleFormalParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6300:1: ( ruleFormalParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6300:1: ( ruleFormalParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6301:1: ruleFormalParam
            {
             before(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleFormalParam_in_rule__Subroutine__ParamsAssignment_3_1_012668);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6310:1: rule__Subroutine__ParamsAssignment_3_1_1_1 : ( ruleFormalParam ) ;
    public final void rule__Subroutine__ParamsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6314:1: ( ( ruleFormalParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6315:1: ( ruleFormalParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6315:1: ( ruleFormalParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6316:1: ruleFormalParam
            {
             before(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_ruleFormalParam_in_rule__Subroutine__ParamsAssignment_3_1_1_112699);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6325:1: rule__FormalParam__IntentAssignment_0 : ( ruleIntent ) ;
    public final void rule__FormalParam__IntentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6329:1: ( ( ruleIntent ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6330:1: ( ruleIntent )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6330:1: ( ruleIntent )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6331:1: ruleIntent
            {
             before(grammarAccess.getFormalParamAccess().getIntentIntentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIntent_in_rule__FormalParam__IntentAssignment_012730);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6340:1: rule__FormalParam__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__FormalParam__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6344:1: ( ( ruleType ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6345:1: ( ruleType )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6345:1: ( ruleType )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6346:1: ruleType
            {
             before(grammarAccess.getFormalParamAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__FormalParam__TypeAssignment_112761);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6355:1: rule__FormalParam__NameAssignment_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__FormalParam__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6359:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6360:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6360:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6361:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getFormalParamAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__FormalParam__NameAssignment_212792);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6370:1: rule__Intent__InAssignment_0 : ( ( 'in' ) ) ;
    public final void rule__Intent__InAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6374:1: ( ( ( 'in' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6375:1: ( ( 'in' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6375:1: ( ( 'in' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6376:1: ( 'in' )
            {
             before(grammarAccess.getIntentAccess().getInInKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6377:1: ( 'in' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6378:1: 'in'
            {
             before(grammarAccess.getIntentAccess().getInInKeyword_0_0()); 
            match(input,39,FOLLOW_39_in_rule__Intent__InAssignment_012828); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6393:1: rule__Intent__OutAssignment_1 : ( ( 'out' ) ) ;
    public final void rule__Intent__OutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6397:1: ( ( ( 'out' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6398:1: ( ( 'out' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6398:1: ( ( 'out' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6399:1: ( 'out' )
            {
             before(grammarAccess.getIntentAccess().getOutOutKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6400:1: ( 'out' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6401:1: 'out'
            {
             before(grammarAccess.getIntentAccess().getOutOutKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__Intent__OutAssignment_112872); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6416:1: rule__Intent__InoutAssignment_2 : ( ( 'inout' ) ) ;
    public final void rule__Intent__InoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6420:1: ( ( ( 'inout' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6421:1: ( ( 'inout' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6421:1: ( ( 'inout' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6422:1: ( 'inout' )
            {
             before(grammarAccess.getIntentAccess().getInoutInoutKeyword_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6423:1: ( 'inout' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6424:1: 'inout'
            {
             before(grammarAccess.getIntentAccess().getInoutInoutKeyword_2_0()); 
            match(input,41,FOLLOW_41_in_rule__Intent__InoutAssignment_212916); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6439:1: rule__Type__IntegerAssignment_0 : ( ( 'integer' ) ) ;
    public final void rule__Type__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6443:1: ( ( ( 'integer' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6444:1: ( ( 'integer' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6444:1: ( ( 'integer' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6445:1: ( 'integer' )
            {
             before(grammarAccess.getTypeAccess().getIntegerIntegerKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6446:1: ( 'integer' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6447:1: 'integer'
            {
             before(grammarAccess.getTypeAccess().getIntegerIntegerKeyword_0_0()); 
            match(input,42,FOLLOW_42_in_rule__Type__IntegerAssignment_012960); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6462:1: rule__Type__CharacterAssignment_1 : ( ( 'character' ) ) ;
    public final void rule__Type__CharacterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6466:1: ( ( ( 'character' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6467:1: ( ( 'character' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6467:1: ( ( 'character' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6468:1: ( 'character' )
            {
             before(grammarAccess.getTypeAccess().getCharacterCharacterKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6469:1: ( 'character' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6470:1: 'character'
            {
             before(grammarAccess.getTypeAccess().getCharacterCharacterKeyword_1_0()); 
            match(input,43,FOLLOW_43_in_rule__Type__CharacterAssignment_113004); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6485:1: rule__Type__LogicalAssignment_2 : ( ( 'logical' ) ) ;
    public final void rule__Type__LogicalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6489:1: ( ( ( 'logical' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6490:1: ( ( 'logical' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6490:1: ( ( 'logical' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6491:1: ( 'logical' )
            {
             before(grammarAccess.getTypeAccess().getLogicalLogicalKeyword_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6492:1: ( 'logical' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6493:1: 'logical'
            {
             before(grammarAccess.getTypeAccess().getLogicalLogicalKeyword_2_0()); 
            match(input,44,FOLLOW_44_in_rule__Type__LogicalAssignment_213048); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6508:1: rule__Type__RealAssignment_3 : ( ( 'real' ) ) ;
    public final void rule__Type__RealAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6512:1: ( ( ( 'real' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6513:1: ( ( 'real' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6513:1: ( ( 'real' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6514:1: ( 'real' )
            {
             before(grammarAccess.getTypeAccess().getRealRealKeyword_3_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6515:1: ( 'real' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6516:1: 'real'
            {
             before(grammarAccess.getTypeAccess().getRealRealKeyword_3_0()); 
            match(input,45,FOLLOW_45_in_rule__Type__RealAssignment_313092); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6531:1: rule__Type__DoubleAssignment_4_0 : ( ( 'double' ) ) ;
    public final void rule__Type__DoubleAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6535:1: ( ( ( 'double' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6536:1: ( ( 'double' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6536:1: ( ( 'double' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6537:1: ( 'double' )
            {
             before(grammarAccess.getTypeAccess().getDoubleDoubleKeyword_4_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6538:1: ( 'double' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6539:1: 'double'
            {
             before(grammarAccess.getTypeAccess().getDoubleDoubleKeyword_4_0_0()); 
            match(input,46,FOLLOW_46_in_rule__Type__DoubleAssignment_4_013136); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6554:1: rule__Type__DerivedAssignment_5_0 : ( ( 'type' ) ) ;
    public final void rule__Type__DerivedAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6558:1: ( ( ( 'type' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6559:1: ( ( 'type' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6559:1: ( ( 'type' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6560:1: ( 'type' )
            {
             before(grammarAccess.getTypeAccess().getDerivedTypeKeyword_5_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6561:1: ( 'type' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6562:1: 'type'
            {
             before(grammarAccess.getTypeAccess().getDerivedTypeKeyword_5_0_0()); 
            match(input,47,FOLLOW_47_in_rule__Type__DerivedAssignment_5_013180); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6577:1: rule__Type__DerivedTypeAssignment_5_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__Type__DerivedTypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6581:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6582:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6582:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6583:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getTypeAccess().getDerivedTypeIDOrPathExprParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__Type__DerivedTypeAssignment_5_213219);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6592:1: rule__SubroutineName__NameAssignment_2_1 : ( ruleIDOrPathExpr ) ;
    public final void rule__SubroutineName__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6596:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6597:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6597:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6598:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getSubroutineNameAccess().getNameIDOrPathExprParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__SubroutineName__NameAssignment_2_113250);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6607:1: rule__Call__SubroutineNameAssignment_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__Call__SubroutineNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6611:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6612:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6612:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6613:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getCallAccess().getSubroutineNameIDOrPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__Call__SubroutineNameAssignment_213281);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6622:1: rule__Call__ParamsAssignment_3_1_0 : ( ruleActualParam ) ;
    public final void rule__Call__ParamsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6626:1: ( ( ruleActualParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6627:1: ( ruleActualParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6627:1: ( ruleActualParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6628:1: ruleActualParam
            {
             before(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_013312);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6637:1: rule__Call__ParamsAssignment_3_1_1_1 : ( ruleActualParam ) ;
    public final void rule__Call__ParamsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6641:1: ( ( ruleActualParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6642:1: ( ruleActualParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6642:1: ( ruleActualParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6643:1: ruleActualParam
            {
             before(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_1_113343);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6652:1: rule__ActualParam__KeywordAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__ActualParam__KeywordAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6656:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6657:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6657:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6658:1: RULE_ID
            {
             before(grammarAccess.getActualParamAccess().getKeywordIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActualParam__KeywordAssignment_0_013374); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6667:1: rule__ActualParam__OptionalAssignment_0_1 : ( ( '?' ) ) ;
    public final void rule__ActualParam__OptionalAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6671:1: ( ( ( '?' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6672:1: ( ( '?' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6672:1: ( ( '?' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6673:1: ( '?' )
            {
             before(grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6674:1: ( '?' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6675:1: '?'
            {
             before(grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0()); 
            match(input,48,FOLLOW_48_in_rule__ActualParam__OptionalAssignment_0_113410); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6690:1: rule__ActualParam__ValueAssignment_1 : ( ruleIDOrPathExpr ) ;
    public final void rule__ActualParam__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6694:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6695:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6695:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6696:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getActualParamAccess().getValueIDOrPathExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__ActualParam__ValueAssignment_113449);
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


    // $ANTLR start "rule__ActualParamByKeyword__KeywordAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6705:1: rule__ActualParamByKeyword__KeywordAssignment_2 : ( RULE_ID ) ;
    public final void rule__ActualParamByKeyword__KeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6709:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6710:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6710:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6711:1: RULE_ID
            {
             before(grammarAccess.getActualParamByKeywordAccess().getKeywordIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActualParamByKeyword__KeywordAssignment_213480); 
             after(grammarAccess.getActualParamByKeywordAccess().getKeywordIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ActualParamByKeyword__KeywordAssignment_2"


    // $ANTLR start "rule__IDOrWildcard__IdAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6720:1: rule__IDOrWildcard__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__IDOrWildcard__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6724:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6725:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6725:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6726:1: RULE_ID
            {
             before(grammarAccess.getIDOrWildcardAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IDOrWildcard__IdAssignment_013511); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6735:1: rule__IDOrWildcard__WildcardAssignment_1 : ( ( '*' ) ) ;
    public final void rule__IDOrWildcard__WildcardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6739:1: ( ( ( '*' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6740:1: ( ( '*' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6740:1: ( ( '*' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6741:1: ( '*' )
            {
             before(grammarAccess.getIDOrWildcardAccess().getWildcardAsteriskKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6742:1: ( '*' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6743:1: '*'
            {
             before(grammarAccess.getIDOrWildcardAccess().getWildcardAsteriskKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__IDOrWildcard__WildcardAssignment_113547); 
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


    // $ANTLR start "rule__IDOrPathExpr__LiteralAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6758:1: rule__IDOrPathExpr__LiteralAssignment_2 : ( ruleLiteral ) ;
    public final void rule__IDOrPathExpr__LiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6762:1: ( ( ruleLiteral ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6763:1: ( ruleLiteral )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6763:1: ( ruleLiteral )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6764:1: ruleLiteral
            {
             before(grammarAccess.getIDOrPathExprAccess().getLiteralLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__IDOrPathExpr__LiteralAssignment_213586);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getIDOrPathExprAccess().getLiteralLiteralParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__IDOrPathExpr__LiteralAssignment_2"


    // $ANTLR start "rule__PathExprNode__TailAssignment_1_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6773:1: rule__PathExprNode__TailAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__PathExprNode__TailAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6777:1: ( ( ( RULE_ID ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6778:1: ( ( RULE_ID ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6778:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6779:1: ( RULE_ID )
            {
             before(grammarAccess.getPathExprNodeAccess().getTailSubconceptOrAttributeCrossReference_1_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6780:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6781:1: RULE_ID
            {
             before(grammarAccess.getPathExprNodeAccess().getTailSubconceptOrAttributeIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathExprNode__TailAssignment_1_213621); 
             after(grammarAccess.getPathExprNodeAccess().getTailSubconceptOrAttributeIDTerminalRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getPathExprNodeAccess().getTailSubconceptOrAttributeCrossReference_1_2_0()); 

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
    // $ANTLR end "rule__PathExprNode__TailAssignment_1_2"


    // $ANTLR start "rule__PathExprTerm__AxisAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6792:1: rule__PathExprTerm__AxisAssignment_1 : ( ruleAxis ) ;
    public final void rule__PathExprTerm__AxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6796:1: ( ( ruleAxis ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6797:1: ( ruleAxis )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6797:1: ( ruleAxis )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6798:1: ruleAxis
            {
             before(grammarAccess.getPathExprTermAccess().getAxisAxisParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAxis_in_rule__PathExprTerm__AxisAssignment_113656);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getPathExprTermAccess().getAxisAxisParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PathExprTerm__AxisAssignment_1"


    // $ANTLR start "rule__PathExprTerm__RefAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6807:1: rule__PathExprTerm__RefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PathExprTerm__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6811:1: ( ( ( RULE_ID ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6812:1: ( ( RULE_ID ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6812:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6813:1: ( RULE_ID )
            {
             before(grammarAccess.getPathExprTermAccess().getRefSubconceptOrAttributeCrossReference_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6814:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6815:1: RULE_ID
            {
             before(grammarAccess.getPathExprTermAccess().getRefSubconceptOrAttributeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathExprTerm__RefAssignment_213691); 
             after(grammarAccess.getPathExprTermAccess().getRefSubconceptOrAttributeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPathExprTermAccess().getRefSubconceptOrAttributeCrossReference_2_0()); 

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
    // $ANTLR end "rule__PathExprTerm__RefAssignment_2"


    // $ANTLR start "rule__Axis__AncestorAssignment"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6826:1: rule__Axis__AncestorAssignment : ( ( '^' ) ) ;
    public final void rule__Axis__AncestorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6830:1: ( ( ( '^' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6831:1: ( ( '^' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6831:1: ( ( '^' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6832:1: ( '^' )
            {
             before(grammarAccess.getAxisAccess().getAncestorCircumflexAccentKeyword_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6833:1: ( '^' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6834:1: '^'
            {
             before(grammarAccess.getAxisAccess().getAncestorCircumflexAccentKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__Axis__AncestorAssignment13731); 
             after(grammarAccess.getAxisAccess().getAncestorCircumflexAccentKeyword_0()); 

            }

             after(grammarAccess.getAxisAccess().getAncestorCircumflexAccentKeyword_0()); 

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
    // $ANTLR end "rule__Axis__AncestorAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLanguage_in_entryRuleLanguage61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLanguage68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__0_in_ruleLanguage94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnonymousConceptDef_in_entryRuleAnonymousConceptDef181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnonymousConceptDef188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group__0_in_ruleAnonymousConceptDef214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedConceptDef_in_entryRuleNamedConceptDef241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedConceptDef248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__0_in_ruleNamedConceptDef274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopConceptDef_in_entryRuleTopConceptDef301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopConceptDef308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__0_in_ruleTopConceptDef334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_entryRuleSubconceptOrAttribute361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubconceptOrAttribute368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubconceptOrAttribute__Alternatives_in_ruleSubconceptOrAttribute394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconcept_in_entryRuleSubconcept421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubconcept428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__0_in_ruleSubconcept454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_entryRuleCardinality541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCardinality548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__Alternatives_in_ruleCardinality574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0_in_ruleMapping634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_entryRuleImplicitContextMapping661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicitContextMapping668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImplicitContextMapping__Alternatives_in_ruleImplicitContextMapping694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleName_in_entryRuleModuleName781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleName788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleName__Group__0_in_ruleModuleName814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesModule_in_entryRuleUsesModule841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsesModule848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__0_in_ruleUsesModule874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesEntity_in_entryRuleUsesEntity901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUsesEntity908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__0_in_ruleUsesEntity934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_entryRuleSubroutine961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutine968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__0_in_ruleSubroutine994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalParam_in_entryRuleFormalParam1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalParam1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__0_in_ruleFormalParam1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_entryRuleIntent1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntent1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__Alternatives_in_ruleIntent1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutineName_in_entryRuleSubroutineName1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubroutineName1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__0_in_ruleSubroutineName1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0_in_ruleCall1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_entryRuleActualParam1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualParam1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__0_in_ruleActualParam1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParamByKeyword_in_entryRuleActualParamByKeyword1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActualParamByKeyword1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__0_in_ruleActualParamByKeyword1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrWildcard_in_entryRuleIDOrWildcard1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrWildcard1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrWildcard__Alternatives_in_ruleIDOrWildcard1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_entryRuleIDOrPathExpr1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrPathExpr1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrPathExpr__Alternatives_in_ruleIDOrPathExpr1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_entryRulePathExpr1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExpr1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__0_in_rulePathExpr1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExprNode_in_entryRulePathExprNode1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExprNode1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group__0_in_rulePathExprNode1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExprTerm_in_entryRulePathExprTerm1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExprTerm1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__0_in_rulePathExprTerm1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxis_in_entryRuleAxis1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAxis1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Axis__AncestorAssignment_in_ruleAxis1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconcept_in_rule__SubconceptOrAttribute__Alternatives1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__SubconceptOrAttribute__Alternatives1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_0__0_in_rule__Subconcept__Alternatives_31919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__DefAssignment_3_1_in_rule__Subconcept__Alternatives_31937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_2__0_in_rule__Subconcept__Alternatives_31955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__ZeroOrMoreAssignment_0_in_rule__Cardinality__Alternatives1988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__OneOrMoreAssignment_1_in_rule__Cardinality__Alternatives2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__ImplicitContextMapping__Alternatives2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleName_in_rule__ImplicitContextMapping__Alternatives2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesModule_in_rule__ImplicitContextMapping__Alternatives2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesEntity_in_rule__ImplicitContextMapping__Alternatives2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__ImplicitContextMapping__Alternatives2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_rule__ImplicitContextMapping__Alternatives2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutineName_in_rule__ImplicitContextMapping__Alternatives2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParamByKeyword_in_rule__ImplicitContextMapping__Alternatives2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__InAssignment_0_in_rule__Intent__Alternatives2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__OutAssignment_1_in_rule__Intent__Alternatives2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__InoutAssignment_2_in_rule__Intent__Alternatives2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__IntegerAssignment_0_in_rule__Type__Alternatives2259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__CharacterAssignment_1_in_rule__Type__Alternatives2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__LogicalAssignment_2_in_rule__Type__Alternatives2295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__RealAssignment_3_in_rule__Type__Alternatives2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__0_in_rule__Type__Alternatives2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__0_in_rule__Type__Alternatives2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrWildcard__IdAssignment_0_in_rule__IDOrWildcard__Alternatives2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrWildcard__WildcardAssignment_1_in_rule__IDOrWildcard__Alternatives2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrWildcard_in_rule__IDOrPathExpr__Alternatives2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_rule__IDOrPathExpr__Alternatives2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrPathExpr__LiteralAssignment_2_in_rule__IDOrPathExpr__Alternatives2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__Alternatives2503 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__Alternatives2516 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__Alternatives2537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__0__Impl_in_rule__Language__Group__02567 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Language__Group__1_in_rule__Language__Group__02570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Language__Group__0__Impl2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__1__Impl_in_rule__Language__Group__12629 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Language__Group__2_in_rule__Language__Group__12632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__NameAssignment_1_in_rule__Language__Group__1__Impl2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__2__Impl_in_rule__Language__Group__22689 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Language__Group__3_in_rule__Language__Group__22692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__UriAssignment_2_in_rule__Language__Group__2__Impl2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__3__Impl_in_rule__Language__Group__32749 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Language__Group__4_in_rule__Language__Group__32752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Language__Group__3__Impl2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__4__Impl_in_rule__Language__Group__42811 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_rule__Language__Group__5_in_rule__Language__Group__42814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__ConceptDefAssignment_4_in_rule__Language__Group__4__Impl2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__5__Impl_in_rule__Language__Group__52871 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_rule__Language__Group__6_in_rule__Language__Group__52874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__ConceptDefAssignment_5_in_rule__Language__Group__5__Impl2901 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Language__Group__6__Impl_in_rule__Language__Group__62932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Language__Group__6__Impl2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03005 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__KeyAssignment_0_in_rule__Annotation__Group__0__Impl3035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__0_in_rule__Annotation__Group__1__Impl3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__0__Impl_in_rule__Annotation__Group_1__03127 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__1_in_rule__Annotation__Group_1__03130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Annotation__Group_1__0__Impl3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__1__Impl_in_rule__Annotation__Group_1__13189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValueAssignment_1_1_in_rule__Annotation__Group_1__1__Impl3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group__0__Impl_in_rule__AnonymousConceptDef__Group__03250 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group__1_in_rule__AnonymousConceptDef__Group__03253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group__1__Impl_in_rule__AnonymousConceptDef__Group__13311 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group__2_in_rule__AnonymousConceptDef__Group__13314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__0_in_rule__AnonymousConceptDef__Group__1__Impl3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group__2__Impl_in_rule__AnonymousConceptDef__Group__23372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__0_in_rule__AnonymousConceptDef__Group__2__Impl3399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__0__Impl_in_rule__AnonymousConceptDef__Group_1__03436 = new BitSet(new long[]{0x00000000F3C80000L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__1_in_rule__AnonymousConceptDef__Group_1__03439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AnonymousConceptDef__Group_1__0__Impl3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__1__Impl_in_rule__AnonymousConceptDef__Group_1__13498 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__2_in_rule__AnonymousConceptDef__Group_1__13501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__MappingAssignment_1_1_in_rule__AnonymousConceptDef__Group_1__1__Impl3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__2__Impl_in_rule__AnonymousConceptDef__Group_1__23558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AnonymousConceptDef__Group_1__2__Impl3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__0__Impl_in_rule__AnonymousConceptDef__Group_2__03623 = new BitSet(new long[]{0x00000010000040C0L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__1_in_rule__AnonymousConceptDef__Group_2__03626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AnonymousConceptDef__Group_2__0__Impl3654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__1__Impl_in_rule__AnonymousConceptDef__Group_2__13685 = new BitSet(new long[]{0x00000010000040C0L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__2_in_rule__AnonymousConceptDef__Group_2__13688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__AnnotationAssignment_2_1_in_rule__AnonymousConceptDef__Group_2__1__Impl3715 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__2__Impl_in_rule__AnonymousConceptDef__Group_2__23746 = new BitSet(new long[]{0x00000010000040C0L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__3_in_rule__AnonymousConceptDef__Group_2__23749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__ChildAssignment_2_2_in_rule__AnonymousConceptDef__Group_2__2__Impl3776 = new BitSet(new long[]{0x0000001000000042L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__3__Impl_in_rule__AnonymousConceptDef__Group_2__33807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AnonymousConceptDef__Group_2__3__Impl3835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__0__Impl_in_rule__NamedConceptDef__Group__03874 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__1_in_rule__NamedConceptDef__Group__03877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__NamedAssignment_0_in_rule__NamedConceptDef__Group__0__Impl3904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__1__Impl_in_rule__NamedConceptDef__Group__13934 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__2_in_rule__NamedConceptDef__Group__13937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__NameAssignment_1_in_rule__NamedConceptDef__Group__1__Impl3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__2__Impl_in_rule__NamedConceptDef__Group__23994 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__3_in_rule__NamedConceptDef__Group__23997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__0_in_rule__NamedConceptDef__Group__2__Impl4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__3__Impl_in_rule__NamedConceptDef__Group__34055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__0_in_rule__NamedConceptDef__Group__3__Impl4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__0__Impl_in_rule__NamedConceptDef__Group_2__04121 = new BitSet(new long[]{0x00000000F3C80000L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__1_in_rule__NamedConceptDef__Group_2__04124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NamedConceptDef__Group_2__0__Impl4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__1__Impl_in_rule__NamedConceptDef__Group_2__14183 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__2_in_rule__NamedConceptDef__Group_2__14186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__MappingAssignment_2_1_in_rule__NamedConceptDef__Group_2__1__Impl4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__2__Impl_in_rule__NamedConceptDef__Group_2__24243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NamedConceptDef__Group_2__2__Impl4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__0__Impl_in_rule__NamedConceptDef__Group_3__04308 = new BitSet(new long[]{0x00000010000040C0L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__1_in_rule__NamedConceptDef__Group_3__04311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NamedConceptDef__Group_3__0__Impl4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__1__Impl_in_rule__NamedConceptDef__Group_3__14370 = new BitSet(new long[]{0x00000010000040C0L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__2_in_rule__NamedConceptDef__Group_3__14373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__AnnotationAssignment_3_1_in_rule__NamedConceptDef__Group_3__1__Impl4400 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__2__Impl_in_rule__NamedConceptDef__Group_3__24431 = new BitSet(new long[]{0x00000010000040C0L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__3_in_rule__NamedConceptDef__Group_3__24434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__ChildAssignment_3_2_in_rule__NamedConceptDef__Group_3__2__Impl4461 = new BitSet(new long[]{0x0000001000000042L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__3__Impl_in_rule__NamedConceptDef__Group_3__34492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NamedConceptDef__Group_3__3__Impl4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__0__Impl_in_rule__TopConceptDef__Group__04559 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__1_in_rule__TopConceptDef__Group__04562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__TopAssignment_0_in_rule__TopConceptDef__Group__0__Impl4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__1__Impl_in_rule__TopConceptDef__Group__14619 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__2_in_rule__TopConceptDef__Group__14622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__NamedAssignment_1_in_rule__TopConceptDef__Group__1__Impl4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__2__Impl_in_rule__TopConceptDef__Group__24679 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__3_in_rule__TopConceptDef__Group__24682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__NameAssignment_2_in_rule__TopConceptDef__Group__2__Impl4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__3__Impl_in_rule__TopConceptDef__Group__34739 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__4_in_rule__TopConceptDef__Group__34742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__0_in_rule__TopConceptDef__Group__3__Impl4769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__4__Impl_in_rule__TopConceptDef__Group__44800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__0_in_rule__TopConceptDef__Group__4__Impl4827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__0__Impl_in_rule__TopConceptDef__Group_3__04868 = new BitSet(new long[]{0x00000000F3C80000L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__1_in_rule__TopConceptDef__Group_3__04871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TopConceptDef__Group_3__0__Impl4899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__1__Impl_in_rule__TopConceptDef__Group_3__14930 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__2_in_rule__TopConceptDef__Group_3__14933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__MappingAssignment_3_1_in_rule__TopConceptDef__Group_3__1__Impl4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__2__Impl_in_rule__TopConceptDef__Group_3__24990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TopConceptDef__Group_3__2__Impl5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__0__Impl_in_rule__TopConceptDef__Group_4__05055 = new BitSet(new long[]{0x00000010000040C0L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__1_in_rule__TopConceptDef__Group_4__05058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__TopConceptDef__Group_4__0__Impl5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__1__Impl_in_rule__TopConceptDef__Group_4__15117 = new BitSet(new long[]{0x00000010000040C0L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__2_in_rule__TopConceptDef__Group_4__15120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__AnnotationAssignment_4_1_in_rule__TopConceptDef__Group_4__1__Impl5147 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__2__Impl_in_rule__TopConceptDef__Group_4__25178 = new BitSet(new long[]{0x00000010000040C0L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__3_in_rule__TopConceptDef__Group_4__25181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__ChildAssignment_4_2_in_rule__TopConceptDef__Group_4__2__Impl5208 = new BitSet(new long[]{0x0000001000000042L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__3__Impl_in_rule__TopConceptDef__Group_4__35239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TopConceptDef__Group_4__3__Impl5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__0__Impl_in_rule__Subconcept__Group__05306 = new BitSet(new long[]{0x0000006800052000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__1_in_rule__Subconcept__Group__05309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__NameAssignment_0_in_rule__Subconcept__Group__0__Impl5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__1__Impl_in_rule__Subconcept__Group__15366 = new BitSet(new long[]{0x0000006800052000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__2_in_rule__Subconcept__Group__15369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__CardinalityAssignment_1_in_rule__Subconcept__Group__1__Impl5396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__2__Impl_in_rule__Subconcept__Group__25427 = new BitSet(new long[]{0x0000006800052000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__3_in_rule__Subconcept__Group__25430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__EssentialAssignment_2_in_rule__Subconcept__Group__2__Impl5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__3__Impl_in_rule__Subconcept__Group__35488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Alternatives_3_in_rule__Subconcept__Group__3__Impl5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_0__0__Impl_in_rule__Subconcept__Group_3_0__05553 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_0__1_in_rule__Subconcept__Group_3_0__05556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Subconcept__Group_3_0__0__Impl5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_0__1__Impl_in_rule__Subconcept__Group_3_0__15615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__DefAssignment_3_0_1_in_rule__Subconcept__Group_3_0__1__Impl5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_2__0__Impl_in_rule__Subconcept__Group_3_2__05676 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_2__1_in_rule__Subconcept__Group_3_2__05679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__ReferenceAssignment_3_2_0_in_rule__Subconcept__Group_3_2__0__Impl5706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_2__1__Impl_in_rule__Subconcept__Group_3_2__15736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__RefAssignment_3_2_1_in_rule__Subconcept__Group_3_2__1__Impl5763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05797 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttribAssignment_0_in_rule__Attribute__Group__0__Impl5827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15857 = new BitSet(new long[]{0x0000006800012000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25917 = new BitSet(new long[]{0x0000006800012000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__25920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__CardinalityAssignment_2_in_rule__Attribute__Group__2__Impl5947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__35978 = new BitSet(new long[]{0x0000006800012000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__35981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__EssentialAssignment_3_in_rule__Attribute__Group__3__Impl6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__46039 = new BitSet(new long[]{0x0000006800012000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__46042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__56100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__0_in_rule__Attribute__Group__5__Impl6127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__06170 = new BitSet(new long[]{0x00000000F3C80000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__06173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Attribute__Group_4__0__Impl6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__16232 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__2_in_rule__Attribute__Group_4__16235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttribMappingAssignment_4_1_in_rule__Attribute__Group_4__1__Impl6262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__2__Impl_in_rule__Attribute__Group_4__26292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Attribute__Group_4__2__Impl6320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__0__Impl_in_rule__Attribute__Group_5__06357 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__1_in_rule__Attribute__Group_5__06360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Attribute__Group_5__0__Impl6388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__1__Impl_in_rule__Attribute__Group_5__16419 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__2_in_rule__Attribute__Group_5__16422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AnnotationAssignment_5_1_in_rule__Attribute__Group_5__1__Impl6449 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__2__Impl_in_rule__Attribute__Group_5__26480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Attribute__Group_5__2__Impl6508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__06545 = new BitSet(new long[]{0x00000000F3C80000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__06548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__ContextAssignment_0_in_rule__Mapping__Group__0__Impl6575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__16606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__MappingAssignment_1_in_rule__Mapping__Group__1__Impl6633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__06667 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__06670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__16728 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__16731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Module__Group__1__Impl6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__26790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__0_in_rule__Module__Group__2__Impl6817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__0__Impl_in_rule__Module__Group_2__06854 = new BitSet(new long[]{0x0000002080000070L});
    public static final BitSet FOLLOW_rule__Module__Group_2__1_in_rule__Module__Group_2__06857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Module__Group_2__0__Impl6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__1__Impl_in_rule__Module__Group_2__16916 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Module__Group_2__2_in_rule__Module__Group_2__16919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_2_1_in_rule__Module__Group_2__1__Impl6946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__2__Impl_in_rule__Module__Group_2__26976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Module__Group_2__2__Impl7004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleName__Group__0__Impl_in_rule__ModuleName__Group__07041 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ModuleName__Group__1_in_rule__ModuleName__Group__07044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleName__Group__1__Impl_in_rule__ModuleName__Group__17102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ModuleName__Group__1__Impl7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__0__Impl_in_rule__UsesModule__Group__07165 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__1_in_rule__UsesModule__Group__07168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UsesModule__Group__0__Impl7196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__1__Impl_in_rule__UsesModule__Group__17227 = new BitSet(new long[]{0x0000002080000070L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__2_in_rule__UsesModule__Group__17230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UsesModule__Group__1__Impl7258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__2__Impl_in_rule__UsesModule__Group__27289 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__3_in_rule__UsesModule__Group__27292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__NameAssignment_2_in_rule__UsesModule__Group__2__Impl7319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__3__Impl_in_rule__UsesModule__Group__37349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UsesModule__Group__3__Impl7377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__0__Impl_in_rule__UsesEntity__Group__07416 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__1_in_rule__UsesEntity__Group__07419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UsesEntity__Group__0__Impl7447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__1__Impl_in_rule__UsesEntity__Group__17478 = new BitSet(new long[]{0x0000002080000070L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__2_in_rule__UsesEntity__Group__17481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UsesEntity__Group__1__Impl7509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__2__Impl_in_rule__UsesEntity__Group__27540 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__3_in_rule__UsesEntity__Group__27543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__NameAssignment_2_in_rule__UsesEntity__Group__2__Impl7570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__3__Impl_in_rule__UsesEntity__Group__37600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UsesEntity__Group__3__Impl7628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__0__Impl_in_rule__Subroutine__Group__07667 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__1_in_rule__Subroutine__Group__07670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Subroutine__Group__0__Impl7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__1__Impl_in_rule__Subroutine__Group__17729 = new BitSet(new long[]{0x0000002080000070L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__2_in_rule__Subroutine__Group__17732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Subroutine__Group__1__Impl7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__2__Impl_in_rule__Subroutine__Group__27791 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__3_in_rule__Subroutine__Group__27794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__NameAssignment_2_in_rule__Subroutine__Group__2__Impl7821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__3__Impl_in_rule__Subroutine__Group__37851 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__4_in_rule__Subroutine__Group__37854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__0_in_rule__Subroutine__Group__3__Impl7881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__4__Impl_in_rule__Subroutine__Group__47912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Subroutine__Group__4__Impl7940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__0__Impl_in_rule__Subroutine__Group_3__07981 = new BitSet(new long[]{0x0000FF8000200000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__1_in_rule__Subroutine__Group_3__07984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Subroutine__Group_3__0__Impl8012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__1__Impl_in_rule__Subroutine__Group_3__18043 = new BitSet(new long[]{0x0000FF8000200000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__2_in_rule__Subroutine__Group_3__18046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1__0_in_rule__Subroutine__Group_3__1__Impl8073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__2__Impl_in_rule__Subroutine__Group_3__28104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Subroutine__Group_3__2__Impl8132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1__0__Impl_in_rule__Subroutine__Group_3_1__08169 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1__1_in_rule__Subroutine__Group_3_1__08172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__ParamsAssignment_3_1_0_in_rule__Subroutine__Group_3_1__0__Impl8199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1__1__Impl_in_rule__Subroutine__Group_3_1__18229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1_1__0_in_rule__Subroutine__Group_3_1__1__Impl8256 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1_1__0__Impl_in_rule__Subroutine__Group_3_1_1__08291 = new BitSet(new long[]{0x0000FF8000000000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1_1__1_in_rule__Subroutine__Group_3_1_1__08294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Subroutine__Group_3_1_1__0__Impl8322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1_1__1__Impl_in_rule__Subroutine__Group_3_1_1__18353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__ParamsAssignment_3_1_1_1_in_rule__Subroutine__Group_3_1_1__1__Impl8380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__0__Impl_in_rule__FormalParam__Group__08414 = new BitSet(new long[]{0x0000FF8000000000L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__1_in_rule__FormalParam__Group__08417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__IntentAssignment_0_in_rule__FormalParam__Group__0__Impl8444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__1__Impl_in_rule__FormalParam__Group__18475 = new BitSet(new long[]{0x0000002080000070L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__2_in_rule__FormalParam__Group__18478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__TypeAssignment_1_in_rule__FormalParam__Group__1__Impl8505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__2__Impl_in_rule__FormalParam__Group__28535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__NameAssignment_2_in_rule__FormalParam__Group__2__Impl8562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__0__Impl_in_rule__Type__Group_4__08598 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Type__Group_4__1_in_rule__Type__Group_4__08601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DoubleAssignment_4_0_in_rule__Type__Group_4__0__Impl8628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__1__Impl_in_rule__Type__Group_4__18658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Type__Group_4__1__Impl8687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__0__Impl_in_rule__Type__Group_5__08724 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Type__Group_5__1_in_rule__Type__Group_5__08727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DerivedAssignment_5_0_in_rule__Type__Group_5__0__Impl8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__1__Impl_in_rule__Type__Group_5__18784 = new BitSet(new long[]{0x0000002080000070L});
    public static final BitSet FOLLOW_rule__Type__Group_5__2_in_rule__Type__Group_5__18787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Type__Group_5__1__Impl8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__2__Impl_in_rule__Type__Group_5__28846 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Type__Group_5__3_in_rule__Type__Group_5__28849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DerivedTypeAssignment_5_2_in_rule__Type__Group_5__2__Impl8876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__3__Impl_in_rule__Type__Group_5__38906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Type__Group_5__3__Impl8934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__0__Impl_in_rule__SubroutineName__Group__08973 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__1_in_rule__SubroutineName__Group__08976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SubroutineName__Group__0__Impl9004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__1__Impl_in_rule__SubroutineName__Group__19035 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__2_in_rule__SubroutineName__Group__19038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__2__Impl_in_rule__SubroutineName__Group__29096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__0_in_rule__SubroutineName__Group__2__Impl9123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__0__Impl_in_rule__SubroutineName__Group_2__09160 = new BitSet(new long[]{0x0000002080000070L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__1_in_rule__SubroutineName__Group_2__09163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SubroutineName__Group_2__0__Impl9191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__1__Impl_in_rule__SubroutineName__Group_2__19222 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__2_in_rule__SubroutineName__Group_2__19225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__NameAssignment_2_1_in_rule__SubroutineName__Group_2__1__Impl9252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__2__Impl_in_rule__SubroutineName__Group_2__29282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SubroutineName__Group_2__2__Impl9310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__09347 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__09350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Call__Group__0__Impl9378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__19409 = new BitSet(new long[]{0x0000002080000070L});
    public static final BitSet FOLLOW_rule__Call__Group__2_in_rule__Call__Group__19412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Call__Group__1__Impl9440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__29471 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Call__Group__3_in_rule__Call__Group__29474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__SubroutineNameAssignment_2_in_rule__Call__Group__2__Impl9501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__39531 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Call__Group__4_in_rule__Call__Group__39534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl9561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__49592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Call__Group__4__Impl9620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__09661 = new BitSet(new long[]{0x0000002080200070L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__09664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Call__Group_3__0__Impl9692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__19723 = new BitSet(new long[]{0x0000002080200070L});
    public static final BitSet FOLLOW_rule__Call__Group_3__2_in_rule__Call__Group_3__19726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__0_in_rule__Call__Group_3__1__Impl9753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__2__Impl_in_rule__Call__Group_3__29784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Call__Group_3__2__Impl9812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__0__Impl_in_rule__Call__Group_3_1__09849 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__1_in_rule__Call__Group_3_1__09852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParamsAssignment_3_1_0_in_rule__Call__Group_3_1__0__Impl9879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__1__Impl_in_rule__Call__Group_3_1__19909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__0_in_rule__Call__Group_3_1__1__Impl9936 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__0__Impl_in_rule__Call__Group_3_1_1__09971 = new BitSet(new long[]{0x0000002080000070L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__1_in_rule__Call__Group_3_1_1__09974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Call__Group_3_1_1__0__Impl10002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__1__Impl_in_rule__Call__Group_3_1_1__110033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParamsAssignment_3_1_1_1_in_rule__Call__Group_3_1_1__1__Impl10060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__0__Impl_in_rule__ActualParam__Group__010094 = new BitSet(new long[]{0x0000002080000070L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__1_in_rule__ActualParam__Group__010097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__0_in_rule__ActualParam__Group__0__Impl10124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__1__Impl_in_rule__ActualParam__Group__110155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__ValueAssignment_1_in_rule__ActualParam__Group__1__Impl10182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__0__Impl_in_rule__ActualParam__Group_0__010216 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__1_in_rule__ActualParam__Group_0__010219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__KeywordAssignment_0_0_in_rule__ActualParam__Group_0__0__Impl10246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__1__Impl_in_rule__ActualParam__Group_0__110276 = new BitSet(new long[]{0x0001000000008000L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__2_in_rule__ActualParam__Group_0__110279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__OptionalAssignment_0_1_in_rule__ActualParam__Group_0__1__Impl10306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__2__Impl_in_rule__ActualParam__Group_0__210337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ActualParam__Group_0__2__Impl10365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__0__Impl_in_rule__ActualParamByKeyword__Group__010402 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__1_in_rule__ActualParamByKeyword__Group__010405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ActualParamByKeyword__Group__0__Impl10433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__1__Impl_in_rule__ActualParamByKeyword__Group__110464 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__2_in_rule__ActualParamByKeyword__Group__110467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ActualParamByKeyword__Group__1__Impl10495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__2__Impl_in_rule__ActualParamByKeyword__Group__210526 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__3_in_rule__ActualParamByKeyword__Group__210529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__KeywordAssignment_2_in_rule__ActualParamByKeyword__Group__2__Impl10556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__3__Impl_in_rule__ActualParamByKeyword__Group__310586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ActualParamByKeyword__Group__3__Impl10614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__0__Impl_in_rule__PathExpr__Group__010653 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__1_in_rule__PathExpr__Group__010656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PathExpr__Group__0__Impl10684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__1__Impl_in_rule__PathExpr__Group__110715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExprNode_in_rule__PathExpr__Group__1__Impl10742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group__0__Impl_in_rule__PathExprNode__Group__010775 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group__1_in_rule__PathExprNode__Group__010778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExprTerm_in_rule__PathExprNode__Group__0__Impl10805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group__1__Impl_in_rule__PathExprNode__Group__110834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__0_in_rule__PathExprNode__Group__1__Impl10861 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__0__Impl_in_rule__PathExprNode__Group_1__010896 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__1_in_rule__PathExprNode__Group_1__010899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__1__Impl_in_rule__PathExprNode__Group_1__110957 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__2_in_rule__PathExprNode__Group_1__110960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PathExprNode__Group_1__1__Impl10988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__2__Impl_in_rule__PathExprNode__Group_1__211019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__TailAssignment_1_2_in_rule__PathExprNode__Group_1__2__Impl11046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__0__Impl_in_rule__PathExprTerm__Group__011082 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__1_in_rule__PathExprTerm__Group__011085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__1__Impl_in_rule__PathExprTerm__Group__111143 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__2_in_rule__PathExprTerm__Group__111146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__AxisAssignment_1_in_rule__PathExprTerm__Group__1__Impl11173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__2__Impl_in_rule__PathExprTerm__Group__211204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__RefAssignment_2_in_rule__PathExprTerm__Group__2__Impl11231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Language__NameAssignment_111272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Language__UriAssignment_211303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopConceptDef_in_rule__Language__ConceptDefAssignment_411334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedConceptDef_in_rule__Language__ConceptDefAssignment_511365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANNOTATION_ID_in_rule__Annotation__KeyAssignment_011396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_1_111427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__AnonymousConceptDef__MappingAssignment_1_111458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__AnonymousConceptDef__AnnotationAssignment_2_111489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_rule__AnonymousConceptDef__ChildAssignment_2_211520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__NamedConceptDef__NamedAssignment_011556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamedConceptDef__NameAssignment_111595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__NamedConceptDef__MappingAssignment_2_111626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__NamedConceptDef__AnnotationAssignment_3_111657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_rule__NamedConceptDef__ChildAssignment_3_211688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TopConceptDef__TopAssignment_011724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TopConceptDef__NamedAssignment_111768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TopConceptDef__NameAssignment_211807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__TopConceptDef__MappingAssignment_3_111838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__TopConceptDef__AnnotationAssignment_4_111869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_rule__TopConceptDef__ChildAssignment_4_211900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Subconcept__NameAssignment_011931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Subconcept__CardinalityAssignment_111962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Subconcept__EssentialAssignment_211998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedConceptDef_in_rule__Subconcept__DefAssignment_3_0_112037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnonymousConceptDef_in_rule__Subconcept__DefAssignment_3_112068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Subconcept__ReferenceAssignment_3_2_012104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Subconcept__RefAssignment_3_2_112147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Attribute__AttribAssignment_012187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_112226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Attribute__CardinalityAssignment_212257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Attribute__EssentialAssignment_312293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__Attribute__AttribMappingAssignment_4_112332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Attribute__AnnotationAssignment_5_112363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Cardinality__ZeroOrMoreAssignment_012399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Cardinality__OneOrMoreAssignment_112443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_rule__Mapping__ContextAssignment_012482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_rule__Mapping__MappingAssignment_112513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__Module__NameAssignment_2_112544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__UsesModule__NameAssignment_212575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__UsesEntity__NameAssignment_212606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__Subroutine__NameAssignment_212637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalParam_in_rule__Subroutine__ParamsAssignment_3_1_012668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalParam_in_rule__Subroutine__ParamsAssignment_3_1_1_112699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_rule__FormalParam__IntentAssignment_012730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__FormalParam__TypeAssignment_112761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__FormalParam__NameAssignment_212792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Intent__InAssignment_012828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Intent__OutAssignment_112872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Intent__InoutAssignment_212916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Type__IntegerAssignment_012960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Type__CharacterAssignment_113004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Type__LogicalAssignment_213048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Type__RealAssignment_313092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Type__DoubleAssignment_4_013136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Type__DerivedAssignment_5_013180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__Type__DerivedTypeAssignment_5_213219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__SubroutineName__NameAssignment_2_113250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__Call__SubroutineNameAssignment_213281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_013312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_1_113343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActualParam__KeywordAssignment_0_013374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__ActualParam__OptionalAssignment_0_113410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__ActualParam__ValueAssignment_113449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActualParamByKeyword__KeywordAssignment_213480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IDOrWildcard__IdAssignment_013511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__IDOrWildcard__WildcardAssignment_113547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__IDOrPathExpr__LiteralAssignment_213586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathExprNode__TailAssignment_1_213621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxis_in_rule__PathExprTerm__AxisAssignment_113656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathExprTerm__RefAssignment_213691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Axis__AncestorAssignment13731 = new BitSet(new long[]{0x0000000000000002L});

}