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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ANNOTATION_ID", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'declaredEntity'", "'language '", "'{'", "'}'", "'='", "'<'", "'>'", "':'", "'module'", "'('", "')'", "'moduleName'", "'usesModule'", "'usesEntity'", "'subroutine'", "','", "'precision'", "'subroutineName'", "'call'", "'actualParamByKeyword'", "'declaration'", "'#'", "'/'", "'concept'", "'top'", "'!'", "'attrib'", "'*'", "'+'", "'in'", "'out'", "'inout'", "'integer'", "'character'", "'logical'", "'real'", "'double'", "'type'", "'?'", "'^'"
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
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
    public static final int T__50=50;
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


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:704:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:705:1: ( ruleVariableDeclaration EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:706:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1441);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration1448); 

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:713:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:717:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:718:1: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:718:1: ( ( rule__VariableDeclaration__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:719:1: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:720:1: ( rule__VariableDeclaration__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:720:2: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration1474);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleDeclaredEntity"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:732:1: entryRuleDeclaredEntity : ruleDeclaredEntity EOF ;
    public final void entryRuleDeclaredEntity() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:733:1: ( ruleDeclaredEntity EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:734:1: ruleDeclaredEntity EOF
            {
             before(grammarAccess.getDeclaredEntityRule()); 
            pushFollow(FOLLOW_ruleDeclaredEntity_in_entryRuleDeclaredEntity1501);
            ruleDeclaredEntity();

            state._fsp--;

             after(grammarAccess.getDeclaredEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredEntity1508); 

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
    // $ANTLR end "entryRuleDeclaredEntity"


    // $ANTLR start "ruleDeclaredEntity"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:741:1: ruleDeclaredEntity : ( 'declaredEntity' ) ;
    public final void ruleDeclaredEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:745:2: ( ( 'declaredEntity' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:746:1: ( 'declaredEntity' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:746:1: ( 'declaredEntity' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:747:1: 'declaredEntity'
            {
             before(grammarAccess.getDeclaredEntityAccess().getDeclaredEntityKeyword()); 
            match(input,12,FOLLOW_12_in_ruleDeclaredEntity1535); 
             after(grammarAccess.getDeclaredEntityAccess().getDeclaredEntityKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeclaredEntity"


    // $ANTLR start "entryRuleLocalExpression"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:762:1: entryRuleLocalExpression : ruleLocalExpression EOF ;
    public final void entryRuleLocalExpression() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:763:1: ( ruleLocalExpression EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:764:1: ruleLocalExpression EOF
            {
             before(grammarAccess.getLocalExpressionRule()); 
            pushFollow(FOLLOW_ruleLocalExpression_in_entryRuleLocalExpression1563);
            ruleLocalExpression();

            state._fsp--;

             after(grammarAccess.getLocalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalExpression1570); 

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
    // $ANTLR end "entryRuleLocalExpression"


    // $ANTLR start "ruleLocalExpression"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:771:1: ruleLocalExpression : ( ( rule__LocalExpression__Alternatives ) ) ;
    public final void ruleLocalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:775:2: ( ( ( rule__LocalExpression__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:776:1: ( ( rule__LocalExpression__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:776:1: ( ( rule__LocalExpression__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:777:1: ( rule__LocalExpression__Alternatives )
            {
             before(grammarAccess.getLocalExpressionAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:778:1: ( rule__LocalExpression__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:778:2: rule__LocalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__LocalExpression__Alternatives_in_ruleLocalExpression1596);
            rule__LocalExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLocalExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalExpression"


    // $ANTLR start "entryRuleExpr"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:790:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:791:1: ( ruleExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:792:1: ruleExpr EOF
            {
             before(grammarAccess.getExprRule()); 
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr1623);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr1630); 

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
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:799:1: ruleExpr : ( ( rule__Expr__Alternatives ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:803:2: ( ( ( rule__Expr__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:804:1: ( ( rule__Expr__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:804:1: ( ( rule__Expr__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:805:1: ( rule__Expr__Alternatives )
            {
             before(grammarAccess.getExprAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:806:1: ( rule__Expr__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:806:2: rule__Expr__Alternatives
            {
            pushFollow(FOLLOW_rule__Expr__Alternatives_in_ruleExpr1656);
            rule__Expr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleLiteral"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:818:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:819:1: ( ruleLiteral EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:820:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1683);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1690); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:827:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:831:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:832:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:832:1: ( ( rule__Literal__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:833:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:834:1: ( rule__Literal__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:834:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1716);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:846:1: entryRulePathExpr : rulePathExpr EOF ;
    public final void entryRulePathExpr() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:847:1: ( rulePathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:848:1: rulePathExpr EOF
            {
             before(grammarAccess.getPathExprRule()); 
            pushFollow(FOLLOW_rulePathExpr_in_entryRulePathExpr1743);
            rulePathExpr();

            state._fsp--;

             after(grammarAccess.getPathExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExpr1750); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:855:1: rulePathExpr : ( ( rule__PathExpr__Group__0 ) ) ;
    public final void rulePathExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:859:2: ( ( ( rule__PathExpr__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:860:1: ( ( rule__PathExpr__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:860:1: ( ( rule__PathExpr__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:861:1: ( rule__PathExpr__Group__0 )
            {
             before(grammarAccess.getPathExprAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:862:1: ( rule__PathExpr__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:862:2: rule__PathExpr__Group__0
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__0_in_rulePathExpr1776);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:874:1: entryRulePathExprNode : rulePathExprNode EOF ;
    public final void entryRulePathExprNode() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:875:1: ( rulePathExprNode EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:876:1: rulePathExprNode EOF
            {
             before(grammarAccess.getPathExprNodeRule()); 
            pushFollow(FOLLOW_rulePathExprNode_in_entryRulePathExprNode1803);
            rulePathExprNode();

            state._fsp--;

             after(grammarAccess.getPathExprNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExprNode1810); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:883:1: rulePathExprNode : ( ( rule__PathExprNode__Group__0 ) ) ;
    public final void rulePathExprNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:887:2: ( ( ( rule__PathExprNode__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:888:1: ( ( rule__PathExprNode__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:888:1: ( ( rule__PathExprNode__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:889:1: ( rule__PathExprNode__Group__0 )
            {
             before(grammarAccess.getPathExprNodeAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:890:1: ( rule__PathExprNode__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:890:2: rule__PathExprNode__Group__0
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group__0_in_rulePathExprNode1836);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:902:1: entryRulePathExprTerm : rulePathExprTerm EOF ;
    public final void entryRulePathExprTerm() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:903:1: ( rulePathExprTerm EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:904:1: rulePathExprTerm EOF
            {
             before(grammarAccess.getPathExprTermRule()); 
            pushFollow(FOLLOW_rulePathExprTerm_in_entryRulePathExprTerm1863);
            rulePathExprTerm();

            state._fsp--;

             after(grammarAccess.getPathExprTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExprTerm1870); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:911:1: rulePathExprTerm : ( ( rule__PathExprTerm__Group__0 ) ) ;
    public final void rulePathExprTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:915:2: ( ( ( rule__PathExprTerm__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:916:1: ( ( rule__PathExprTerm__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:916:1: ( ( rule__PathExprTerm__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:917:1: ( rule__PathExprTerm__Group__0 )
            {
             before(grammarAccess.getPathExprTermAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:918:1: ( rule__PathExprTerm__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:918:2: rule__PathExprTerm__Group__0
            {
            pushFollow(FOLLOW_rule__PathExprTerm__Group__0_in_rulePathExprTerm1896);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:930:1: entryRuleAxis : ruleAxis EOF ;
    public final void entryRuleAxis() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:931:1: ( ruleAxis EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:932:1: ruleAxis EOF
            {
             before(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_ruleAxis_in_entryRuleAxis1923);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getAxisRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAxis1930); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:939:1: ruleAxis : ( ( rule__Axis__AncestorAssignment ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:943:2: ( ( ( rule__Axis__AncestorAssignment ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:944:1: ( ( rule__Axis__AncestorAssignment ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:944:1: ( ( rule__Axis__AncestorAssignment ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:945:1: ( rule__Axis__AncestorAssignment )
            {
             before(grammarAccess.getAxisAccess().getAncestorAssignment()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:946:1: ( rule__Axis__AncestorAssignment )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:946:2: rule__Axis__AncestorAssignment
            {
            pushFollow(FOLLOW_rule__Axis__AncestorAssignment_in_ruleAxis1956);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:958:1: rule__SubconceptOrAttribute__Alternatives : ( ( ruleSubconcept ) | ( ruleAttribute ) );
    public final void rule__SubconceptOrAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:962:1: ( ( ruleSubconcept ) | ( ruleAttribute ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==38) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:963:1: ( ruleSubconcept )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:963:1: ( ruleSubconcept )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:964:1: ruleSubconcept
                    {
                     before(grammarAccess.getSubconceptOrAttributeAccess().getSubconceptParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSubconcept_in_rule__SubconceptOrAttribute__Alternatives1992);
                    ruleSubconcept();

                    state._fsp--;

                     after(grammarAccess.getSubconceptOrAttributeAccess().getSubconceptParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:969:6: ( ruleAttribute )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:969:6: ( ruleAttribute )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:970:1: ruleAttribute
                    {
                     before(grammarAccess.getSubconceptOrAttributeAccess().getAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__SubconceptOrAttribute__Alternatives2009);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:980:1: rule__Subconcept__Alternatives_3 : ( ( ( rule__Subconcept__Group_3_0__0 ) ) | ( ( rule__Subconcept__DefAssignment_3_1 ) ) | ( ( rule__Subconcept__Group_3_2__0 ) ) );
    public final void rule__Subconcept__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:984:1: ( ( ( rule__Subconcept__Group_3_0__0 ) ) | ( ( rule__Subconcept__DefAssignment_3_1 ) ) | ( ( rule__Subconcept__Group_3_2__0 ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    alt2=3;
                }
                else if ( (LA2_1==35) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==EOF||LA2_0==RULE_ID||(LA2_0>=14 && LA2_0<=15)||LA2_0==17||LA2_0==38) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:985:1: ( ( rule__Subconcept__Group_3_0__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:985:1: ( ( rule__Subconcept__Group_3_0__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:986:1: ( rule__Subconcept__Group_3_0__0 )
                    {
                     before(grammarAccess.getSubconceptAccess().getGroup_3_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:987:1: ( rule__Subconcept__Group_3_0__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:987:2: rule__Subconcept__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Subconcept__Group_3_0__0_in_rule__Subconcept__Alternatives_32041);
                    rule__Subconcept__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubconceptAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:991:6: ( ( rule__Subconcept__DefAssignment_3_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:991:6: ( ( rule__Subconcept__DefAssignment_3_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:992:1: ( rule__Subconcept__DefAssignment_3_1 )
                    {
                     before(grammarAccess.getSubconceptAccess().getDefAssignment_3_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:993:1: ( rule__Subconcept__DefAssignment_3_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:993:2: rule__Subconcept__DefAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Subconcept__DefAssignment_3_1_in_rule__Subconcept__Alternatives_32059);
                    rule__Subconcept__DefAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubconceptAccess().getDefAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:997:6: ( ( rule__Subconcept__Group_3_2__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:997:6: ( ( rule__Subconcept__Group_3_2__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:998:1: ( rule__Subconcept__Group_3_2__0 )
                    {
                     before(grammarAccess.getSubconceptAccess().getGroup_3_2()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:999:1: ( rule__Subconcept__Group_3_2__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:999:2: rule__Subconcept__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Subconcept__Group_3_2__0_in_rule__Subconcept__Alternatives_32077);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1008:1: rule__Cardinality__Alternatives : ( ( ( rule__Cardinality__ZeroOrMoreAssignment_0 ) ) | ( ( rule__Cardinality__OneOrMoreAssignment_1 ) ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1012:1: ( ( ( rule__Cardinality__ZeroOrMoreAssignment_0 ) ) | ( ( rule__Cardinality__OneOrMoreAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==39) ) {
                alt3=1;
            }
            else if ( (LA3_0==40) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1013:1: ( ( rule__Cardinality__ZeroOrMoreAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1013:1: ( ( rule__Cardinality__ZeroOrMoreAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1014:1: ( rule__Cardinality__ZeroOrMoreAssignment_0 )
                    {
                     before(grammarAccess.getCardinalityAccess().getZeroOrMoreAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1015:1: ( rule__Cardinality__ZeroOrMoreAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1015:2: rule__Cardinality__ZeroOrMoreAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Cardinality__ZeroOrMoreAssignment_0_in_rule__Cardinality__Alternatives2110);
                    rule__Cardinality__ZeroOrMoreAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardinalityAccess().getZeroOrMoreAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1019:6: ( ( rule__Cardinality__OneOrMoreAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1019:6: ( ( rule__Cardinality__OneOrMoreAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1020:1: ( rule__Cardinality__OneOrMoreAssignment_1 )
                    {
                     before(grammarAccess.getCardinalityAccess().getOneOrMoreAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1021:1: ( rule__Cardinality__OneOrMoreAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1021:2: rule__Cardinality__OneOrMoreAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Cardinality__OneOrMoreAssignment_1_in_rule__Cardinality__Alternatives2128);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1030:1: rule__ImplicitContextMapping__Alternatives : ( ( ruleModule ) | ( ruleModuleName ) | ( ruleUsesModule ) | ( ruleUsesEntity ) | ( ruleCall ) | ( ruleSubroutine ) | ( ruleSubroutineName ) | ( ruleActualParamByKeyword ) | ( ruleVariableDeclaration ) | ( ( rule__ImplicitContextMapping__Group_9__0 ) ) );
    public final void rule__ImplicitContextMapping__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1034:1: ( ( ruleModule ) | ( ruleModuleName ) | ( ruleUsesModule ) | ( ruleUsesEntity ) | ( ruleCall ) | ( ruleSubroutine ) | ( ruleSubroutineName ) | ( ruleActualParamByKeyword ) | ( ruleVariableDeclaration ) | ( ( rule__ImplicitContextMapping__Group_9__0 ) ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            case 25:
                {
                alt4=4;
                }
                break;
            case 30:
                {
                alt4=5;
                }
                break;
            case 26:
                {
                alt4=6;
                }
                break;
            case 29:
                {
                alt4=7;
                }
                break;
            case 31:
                {
                alt4=8;
                }
                break;
            case 32:
                {
                alt4=9;
                }
                break;
            case 12:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1035:1: ( ruleModule )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1035:1: ( ruleModule )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1036:1: ruleModule
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getModuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleModule_in_rule__ImplicitContextMapping__Alternatives2161);
                    ruleModule();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getModuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1041:6: ( ruleModuleName )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1041:6: ( ruleModuleName )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1042:1: ruleModuleName
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getModuleNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleModuleName_in_rule__ImplicitContextMapping__Alternatives2178);
                    ruleModuleName();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getModuleNameParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1047:6: ( ruleUsesModule )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1047:6: ( ruleUsesModule )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1048:1: ruleUsesModule
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getUsesModuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleUsesModule_in_rule__ImplicitContextMapping__Alternatives2195);
                    ruleUsesModule();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getUsesModuleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1053:6: ( ruleUsesEntity )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1053:6: ( ruleUsesEntity )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1054:1: ruleUsesEntity
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getUsesEntityParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleUsesEntity_in_rule__ImplicitContextMapping__Alternatives2212);
                    ruleUsesEntity();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getUsesEntityParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1059:6: ( ruleCall )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1059:6: ( ruleCall )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1060:1: ruleCall
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCall_in_rule__ImplicitContextMapping__Alternatives2229);
                    ruleCall();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1065:6: ( ruleSubroutine )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1065:6: ( ruleSubroutine )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1066:1: ruleSubroutine
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getSubroutineParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleSubroutine_in_rule__ImplicitContextMapping__Alternatives2246);
                    ruleSubroutine();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getSubroutineParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1071:6: ( ruleSubroutineName )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1071:6: ( ruleSubroutineName )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1072:1: ruleSubroutineName
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getSubroutineNameParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleSubroutineName_in_rule__ImplicitContextMapping__Alternatives2263);
                    ruleSubroutineName();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getSubroutineNameParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1077:6: ( ruleActualParamByKeyword )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1077:6: ( ruleActualParamByKeyword )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1078:1: ruleActualParamByKeyword
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getActualParamByKeywordParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleActualParamByKeyword_in_rule__ImplicitContextMapping__Alternatives2280);
                    ruleActualParamByKeyword();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getActualParamByKeywordParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1083:6: ( ruleVariableDeclaration )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1083:6: ( ruleVariableDeclaration )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1084:1: ruleVariableDeclaration
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getVariableDeclarationParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__ImplicitContextMapping__Alternatives2297);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getVariableDeclarationParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1089:6: ( ( rule__ImplicitContextMapping__Group_9__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1089:6: ( ( rule__ImplicitContextMapping__Group_9__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1090:1: ( rule__ImplicitContextMapping__Group_9__0 )
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getGroup_9()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1091:1: ( rule__ImplicitContextMapping__Group_9__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1091:2: rule__ImplicitContextMapping__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__ImplicitContextMapping__Group_9__0_in_rule__ImplicitContextMapping__Alternatives2314);
                    rule__ImplicitContextMapping__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getImplicitContextMappingAccess().getGroup_9()); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1100:1: rule__Intent__Alternatives : ( ( ( rule__Intent__InAssignment_0 ) ) | ( ( rule__Intent__OutAssignment_1 ) ) | ( ( rule__Intent__InoutAssignment_2 ) ) );
    public final void rule__Intent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1104:1: ( ( ( rule__Intent__InAssignment_0 ) ) | ( ( rule__Intent__OutAssignment_1 ) ) | ( ( rule__Intent__InoutAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt5=1;
                }
                break;
            case 42:
                {
                alt5=2;
                }
                break;
            case 43:
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
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1105:1: ( ( rule__Intent__InAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1105:1: ( ( rule__Intent__InAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1106:1: ( rule__Intent__InAssignment_0 )
                    {
                     before(grammarAccess.getIntentAccess().getInAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1107:1: ( rule__Intent__InAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1107:2: rule__Intent__InAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Intent__InAssignment_0_in_rule__Intent__Alternatives2347);
                    rule__Intent__InAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntentAccess().getInAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1111:6: ( ( rule__Intent__OutAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1111:6: ( ( rule__Intent__OutAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1112:1: ( rule__Intent__OutAssignment_1 )
                    {
                     before(grammarAccess.getIntentAccess().getOutAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1113:1: ( rule__Intent__OutAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1113:2: rule__Intent__OutAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Intent__OutAssignment_1_in_rule__Intent__Alternatives2365);
                    rule__Intent__OutAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntentAccess().getOutAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1117:6: ( ( rule__Intent__InoutAssignment_2 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1117:6: ( ( rule__Intent__InoutAssignment_2 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1118:1: ( rule__Intent__InoutAssignment_2 )
                    {
                     before(grammarAccess.getIntentAccess().getInoutAssignment_2()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1119:1: ( rule__Intent__InoutAssignment_2 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1119:2: rule__Intent__InoutAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Intent__InoutAssignment_2_in_rule__Intent__Alternatives2383);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1128:1: rule__Type__Alternatives : ( ( ( rule__Type__IntegerAssignment_0 ) ) | ( ( rule__Type__CharacterAssignment_1 ) ) | ( ( rule__Type__LogicalAssignment_2 ) ) | ( ( rule__Type__RealAssignment_3 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1132:1: ( ( ( rule__Type__IntegerAssignment_0 ) ) | ( ( rule__Type__CharacterAssignment_1 ) ) | ( ( rule__Type__LogicalAssignment_2 ) ) | ( ( rule__Type__RealAssignment_3 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt6=1;
                }
                break;
            case 45:
                {
                alt6=2;
                }
                break;
            case 46:
                {
                alt6=3;
                }
                break;
            case 47:
                {
                alt6=4;
                }
                break;
            case 48:
                {
                alt6=5;
                }
                break;
            case 49:
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
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1133:1: ( ( rule__Type__IntegerAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1133:1: ( ( rule__Type__IntegerAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1134:1: ( rule__Type__IntegerAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getIntegerAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1135:1: ( rule__Type__IntegerAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1135:2: rule__Type__IntegerAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__IntegerAssignment_0_in_rule__Type__Alternatives2416);
                    rule__Type__IntegerAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getIntegerAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1139:6: ( ( rule__Type__CharacterAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1139:6: ( ( rule__Type__CharacterAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1140:1: ( rule__Type__CharacterAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getCharacterAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1141:1: ( rule__Type__CharacterAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1141:2: rule__Type__CharacterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__CharacterAssignment_1_in_rule__Type__Alternatives2434);
                    rule__Type__CharacterAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getCharacterAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1145:6: ( ( rule__Type__LogicalAssignment_2 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1145:6: ( ( rule__Type__LogicalAssignment_2 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1146:1: ( rule__Type__LogicalAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getLogicalAssignment_2()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1147:1: ( rule__Type__LogicalAssignment_2 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1147:2: rule__Type__LogicalAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Type__LogicalAssignment_2_in_rule__Type__Alternatives2452);
                    rule__Type__LogicalAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getLogicalAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1151:6: ( ( rule__Type__RealAssignment_3 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1151:6: ( ( rule__Type__RealAssignment_3 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1152:1: ( rule__Type__RealAssignment_3 )
                    {
                     before(grammarAccess.getTypeAccess().getRealAssignment_3()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1153:1: ( rule__Type__RealAssignment_3 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1153:2: rule__Type__RealAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Type__RealAssignment_3_in_rule__Type__Alternatives2470);
                    rule__Type__RealAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getRealAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1157:6: ( ( rule__Type__Group_4__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1157:6: ( ( rule__Type__Group_4__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1158:1: ( rule__Type__Group_4__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_4()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1159:1: ( rule__Type__Group_4__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1159:2: rule__Type__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_4__0_in_rule__Type__Alternatives2488);
                    rule__Type__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1163:6: ( ( rule__Type__Group_5__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1163:6: ( ( rule__Type__Group_5__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1164:1: ( rule__Type__Group_5__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_5()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1165:1: ( rule__Type__Group_5__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1165:2: rule__Type__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_5__0_in_rule__Type__Alternatives2506);
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


    // $ANTLR start "rule__LocalExpression__Alternatives"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1174:1: rule__LocalExpression__Alternatives : ( ( ( rule__LocalExpression__IdAssignment_0 ) ) | ( ( rule__LocalExpression__LiteralAssignment_1 ) ) );
    public final void rule__LocalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1178:1: ( ( ( rule__LocalExpression__IdAssignment_0 ) ) | ( ( rule__LocalExpression__LiteralAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_STRING)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1179:1: ( ( rule__LocalExpression__IdAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1179:1: ( ( rule__LocalExpression__IdAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1180:1: ( rule__LocalExpression__IdAssignment_0 )
                    {
                     before(grammarAccess.getLocalExpressionAccess().getIdAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1181:1: ( rule__LocalExpression__IdAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1181:2: rule__LocalExpression__IdAssignment_0
                    {
                    pushFollow(FOLLOW_rule__LocalExpression__IdAssignment_0_in_rule__LocalExpression__Alternatives2539);
                    rule__LocalExpression__IdAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLocalExpressionAccess().getIdAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1185:6: ( ( rule__LocalExpression__LiteralAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1185:6: ( ( rule__LocalExpression__LiteralAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1186:1: ( rule__LocalExpression__LiteralAssignment_1 )
                    {
                     before(grammarAccess.getLocalExpressionAccess().getLiteralAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1187:1: ( rule__LocalExpression__LiteralAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1187:2: rule__LocalExpression__LiteralAssignment_1
                    {
                    pushFollow(FOLLOW_rule__LocalExpression__LiteralAssignment_1_in_rule__LocalExpression__Alternatives2557);
                    rule__LocalExpression__LiteralAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLocalExpressionAccess().getLiteralAssignment_1()); 

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
    // $ANTLR end "rule__LocalExpression__Alternatives"


    // $ANTLR start "rule__Expr__Alternatives"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1196:1: rule__Expr__Alternatives : ( ( ( rule__Expr__WildcardAssignment_0 ) ) | ( ( rule__Expr__ExprAssignment_1 ) ) | ( ( rule__Expr__PathExprAssignment_2 ) ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1200:1: ( ( ( rule__Expr__WildcardAssignment_0 ) ) | ( ( rule__Expr__ExprAssignment_1 ) ) | ( ( rule__Expr__PathExprAssignment_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 33:
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
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1201:1: ( ( rule__Expr__WildcardAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1201:1: ( ( rule__Expr__WildcardAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1202:1: ( rule__Expr__WildcardAssignment_0 )
                    {
                     before(grammarAccess.getExprAccess().getWildcardAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1203:1: ( rule__Expr__WildcardAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1203:2: rule__Expr__WildcardAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expr__WildcardAssignment_0_in_rule__Expr__Alternatives2590);
                    rule__Expr__WildcardAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprAccess().getWildcardAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1207:6: ( ( rule__Expr__ExprAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1207:6: ( ( rule__Expr__ExprAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1208:1: ( rule__Expr__ExprAssignment_1 )
                    {
                     before(grammarAccess.getExprAccess().getExprAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1209:1: ( rule__Expr__ExprAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1209:2: rule__Expr__ExprAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expr__ExprAssignment_1_in_rule__Expr__Alternatives2608);
                    rule__Expr__ExprAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprAccess().getExprAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1213:6: ( ( rule__Expr__PathExprAssignment_2 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1213:6: ( ( rule__Expr__PathExprAssignment_2 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1214:1: ( rule__Expr__PathExprAssignment_2 )
                    {
                     before(grammarAccess.getExprAccess().getPathExprAssignment_2()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1215:1: ( rule__Expr__PathExprAssignment_2 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1215:2: rule__Expr__PathExprAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Expr__PathExprAssignment_2_in_rule__Expr__Alternatives2626);
                    rule__Expr__PathExprAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getExprAccess().getPathExprAssignment_2()); 

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
    // $ANTLR end "rule__Expr__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1224:1: rule__Literal__Alternatives : ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) | ( RULE_STRING ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1228:1: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) | ( RULE_STRING ) )
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
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1229:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1229:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1230:1: ( ( RULE_INT ) ) ( ( RULE_INT )* )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1230:1: ( ( RULE_INT ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1231:1: ( RULE_INT )
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1232:1: ( RULE_INT )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1232:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__Alternatives2662); 

                    }

                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 

                    }

                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1235:1: ( ( RULE_INT )* )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1236:1: ( RULE_INT )*
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1237:1: ( RULE_INT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_INT) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1237:3: RULE_INT
                    	    {
                    	    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__Alternatives2675); 

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
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1242:6: ( RULE_STRING )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1242:6: ( RULE_STRING )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1243:1: RULE_STRING
                    {
                     before(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Literal__Alternatives2696); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1255:1: rule__Language__Group__0 : rule__Language__Group__0__Impl rule__Language__Group__1 ;
    public final void rule__Language__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1259:1: ( rule__Language__Group__0__Impl rule__Language__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1260:2: rule__Language__Group__0__Impl rule__Language__Group__1
            {
            pushFollow(FOLLOW_rule__Language__Group__0__Impl_in_rule__Language__Group__02726);
            rule__Language__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__1_in_rule__Language__Group__02729);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1267:1: rule__Language__Group__0__Impl : ( 'language ' ) ;
    public final void rule__Language__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1271:1: ( ( 'language ' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1272:1: ( 'language ' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1272:1: ( 'language ' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1273:1: 'language '
            {
             before(grammarAccess.getLanguageAccess().getLanguageKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Language__Group__0__Impl2757); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1286:1: rule__Language__Group__1 : rule__Language__Group__1__Impl rule__Language__Group__2 ;
    public final void rule__Language__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1290:1: ( rule__Language__Group__1__Impl rule__Language__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1291:2: rule__Language__Group__1__Impl rule__Language__Group__2
            {
            pushFollow(FOLLOW_rule__Language__Group__1__Impl_in_rule__Language__Group__12788);
            rule__Language__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__2_in_rule__Language__Group__12791);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1298:1: rule__Language__Group__1__Impl : ( ( rule__Language__NameAssignment_1 ) ) ;
    public final void rule__Language__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1302:1: ( ( ( rule__Language__NameAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1303:1: ( ( rule__Language__NameAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1303:1: ( ( rule__Language__NameAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1304:1: ( rule__Language__NameAssignment_1 )
            {
             before(grammarAccess.getLanguageAccess().getNameAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1305:1: ( rule__Language__NameAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1305:2: rule__Language__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Language__NameAssignment_1_in_rule__Language__Group__1__Impl2818);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1315:1: rule__Language__Group__2 : rule__Language__Group__2__Impl rule__Language__Group__3 ;
    public final void rule__Language__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1319:1: ( rule__Language__Group__2__Impl rule__Language__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1320:2: rule__Language__Group__2__Impl rule__Language__Group__3
            {
            pushFollow(FOLLOW_rule__Language__Group__2__Impl_in_rule__Language__Group__22848);
            rule__Language__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__3_in_rule__Language__Group__22851);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1327:1: rule__Language__Group__2__Impl : ( ( rule__Language__UriAssignment_2 ) ) ;
    public final void rule__Language__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1331:1: ( ( ( rule__Language__UriAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1332:1: ( ( rule__Language__UriAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1332:1: ( ( rule__Language__UriAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1333:1: ( rule__Language__UriAssignment_2 )
            {
             before(grammarAccess.getLanguageAccess().getUriAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1334:1: ( rule__Language__UriAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1334:2: rule__Language__UriAssignment_2
            {
            pushFollow(FOLLOW_rule__Language__UriAssignment_2_in_rule__Language__Group__2__Impl2878);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1344:1: rule__Language__Group__3 : rule__Language__Group__3__Impl rule__Language__Group__4 ;
    public final void rule__Language__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1348:1: ( rule__Language__Group__3__Impl rule__Language__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1349:2: rule__Language__Group__3__Impl rule__Language__Group__4
            {
            pushFollow(FOLLOW_rule__Language__Group__3__Impl_in_rule__Language__Group__32908);
            rule__Language__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__4_in_rule__Language__Group__32911);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1356:1: rule__Language__Group__3__Impl : ( '{' ) ;
    public final void rule__Language__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1360:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1361:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1361:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1362:1: '{'
            {
             before(grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_14_in_rule__Language__Group__3__Impl2939); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1375:1: rule__Language__Group__4 : rule__Language__Group__4__Impl rule__Language__Group__5 ;
    public final void rule__Language__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1379:1: ( rule__Language__Group__4__Impl rule__Language__Group__5 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1380:2: rule__Language__Group__4__Impl rule__Language__Group__5
            {
            pushFollow(FOLLOW_rule__Language__Group__4__Impl_in_rule__Language__Group__42970);
            rule__Language__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__5_in_rule__Language__Group__42973);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1387:1: rule__Language__Group__4__Impl : ( ( rule__Language__ConceptDefAssignment_4 ) ) ;
    public final void rule__Language__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1391:1: ( ( ( rule__Language__ConceptDefAssignment_4 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1392:1: ( ( rule__Language__ConceptDefAssignment_4 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1392:1: ( ( rule__Language__ConceptDefAssignment_4 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1393:1: ( rule__Language__ConceptDefAssignment_4 )
            {
             before(grammarAccess.getLanguageAccess().getConceptDefAssignment_4()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1394:1: ( rule__Language__ConceptDefAssignment_4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1394:2: rule__Language__ConceptDefAssignment_4
            {
            pushFollow(FOLLOW_rule__Language__ConceptDefAssignment_4_in_rule__Language__Group__4__Impl3000);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1404:1: rule__Language__Group__5 : rule__Language__Group__5__Impl rule__Language__Group__6 ;
    public final void rule__Language__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1408:1: ( rule__Language__Group__5__Impl rule__Language__Group__6 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1409:2: rule__Language__Group__5__Impl rule__Language__Group__6
            {
            pushFollow(FOLLOW_rule__Language__Group__5__Impl_in_rule__Language__Group__53030);
            rule__Language__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__6_in_rule__Language__Group__53033);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1416:1: rule__Language__Group__5__Impl : ( ( rule__Language__ConceptDefAssignment_5 )* ) ;
    public final void rule__Language__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1420:1: ( ( ( rule__Language__ConceptDefAssignment_5 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1421:1: ( ( rule__Language__ConceptDefAssignment_5 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1421:1: ( ( rule__Language__ConceptDefAssignment_5 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1422:1: ( rule__Language__ConceptDefAssignment_5 )*
            {
             before(grammarAccess.getLanguageAccess().getConceptDefAssignment_5()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1423:1: ( rule__Language__ConceptDefAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1423:2: rule__Language__ConceptDefAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Language__ConceptDefAssignment_5_in_rule__Language__Group__5__Impl3060);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1433:1: rule__Language__Group__6 : rule__Language__Group__6__Impl ;
    public final void rule__Language__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1437:1: ( rule__Language__Group__6__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1438:2: rule__Language__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Language__Group__6__Impl_in_rule__Language__Group__63091);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1444:1: rule__Language__Group__6__Impl : ( '}' ) ;
    public final void rule__Language__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1448:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1449:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1449:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1450:1: '}'
            {
             before(grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_15_in_rule__Language__Group__6__Impl3119); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1477:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1481:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1482:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03164);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03167);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1489:1: rule__Annotation__Group__0__Impl : ( ( rule__Annotation__KeyAssignment_0 ) ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1493:1: ( ( ( rule__Annotation__KeyAssignment_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1494:1: ( ( rule__Annotation__KeyAssignment_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1494:1: ( ( rule__Annotation__KeyAssignment_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1495:1: ( rule__Annotation__KeyAssignment_0 )
            {
             before(grammarAccess.getAnnotationAccess().getKeyAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1496:1: ( rule__Annotation__KeyAssignment_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1496:2: rule__Annotation__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__Annotation__KeyAssignment_0_in_rule__Annotation__Group__0__Impl3194);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1506:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1510:1: ( rule__Annotation__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1511:2: rule__Annotation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13224);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1517:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__Group_1__0 )? ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1521:1: ( ( ( rule__Annotation__Group_1__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1522:1: ( ( rule__Annotation__Group_1__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1522:1: ( ( rule__Annotation__Group_1__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1523:1: ( rule__Annotation__Group_1__0 )?
            {
             before(grammarAccess.getAnnotationAccess().getGroup_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1524:1: ( rule__Annotation__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1524:2: rule__Annotation__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_1__0_in_rule__Annotation__Group__1__Impl3251);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1538:1: rule__Annotation__Group_1__0 : rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1 ;
    public final void rule__Annotation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1542:1: ( rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1543:2: rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_1__0__Impl_in_rule__Annotation__Group_1__03286);
            rule__Annotation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group_1__1_in_rule__Annotation__Group_1__03289);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1550:1: rule__Annotation__Group_1__0__Impl : ( '=' ) ;
    public final void rule__Annotation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1554:1: ( ( '=' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1555:1: ( '=' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1555:1: ( '=' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1556:1: '='
            {
             before(grammarAccess.getAnnotationAccess().getEqualsSignKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Annotation__Group_1__0__Impl3317); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1569:1: rule__Annotation__Group_1__1 : rule__Annotation__Group_1__1__Impl ;
    public final void rule__Annotation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1573:1: ( rule__Annotation__Group_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1574:2: rule__Annotation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_1__1__Impl_in_rule__Annotation__Group_1__13348);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1580:1: rule__Annotation__Group_1__1__Impl : ( ( rule__Annotation__ValueAssignment_1_1 ) ) ;
    public final void rule__Annotation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1584:1: ( ( ( rule__Annotation__ValueAssignment_1_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1585:1: ( ( rule__Annotation__ValueAssignment_1_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1585:1: ( ( rule__Annotation__ValueAssignment_1_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1586:1: ( rule__Annotation__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAnnotationAccess().getValueAssignment_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1587:1: ( rule__Annotation__ValueAssignment_1_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1587:2: rule__Annotation__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Annotation__ValueAssignment_1_1_in_rule__Annotation__Group_1__1__Impl3375);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1601:1: rule__AnonymousConceptDef__Group__0 : rule__AnonymousConceptDef__Group__0__Impl rule__AnonymousConceptDef__Group__1 ;
    public final void rule__AnonymousConceptDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1605:1: ( rule__AnonymousConceptDef__Group__0__Impl rule__AnonymousConceptDef__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1606:2: rule__AnonymousConceptDef__Group__0__Impl rule__AnonymousConceptDef__Group__1
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group__0__Impl_in_rule__AnonymousConceptDef__Group__03409);
            rule__AnonymousConceptDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group__1_in_rule__AnonymousConceptDef__Group__03412);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1613:1: rule__AnonymousConceptDef__Group__0__Impl : ( () ) ;
    public final void rule__AnonymousConceptDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1617:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1618:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1618:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1619:1: ()
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getConceptDefAction_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1620:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1622:1: 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1632:1: rule__AnonymousConceptDef__Group__1 : rule__AnonymousConceptDef__Group__1__Impl rule__AnonymousConceptDef__Group__2 ;
    public final void rule__AnonymousConceptDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1636:1: ( rule__AnonymousConceptDef__Group__1__Impl rule__AnonymousConceptDef__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1637:2: rule__AnonymousConceptDef__Group__1__Impl rule__AnonymousConceptDef__Group__2
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group__1__Impl_in_rule__AnonymousConceptDef__Group__13470);
            rule__AnonymousConceptDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group__2_in_rule__AnonymousConceptDef__Group__13473);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1644:1: rule__AnonymousConceptDef__Group__1__Impl : ( ( rule__AnonymousConceptDef__Group_1__0 )? ) ;
    public final void rule__AnonymousConceptDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1648:1: ( ( ( rule__AnonymousConceptDef__Group_1__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1649:1: ( ( rule__AnonymousConceptDef__Group_1__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1649:1: ( ( rule__AnonymousConceptDef__Group_1__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1650:1: ( rule__AnonymousConceptDef__Group_1__0 )?
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getGroup_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1651:1: ( rule__AnonymousConceptDef__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1651:2: rule__AnonymousConceptDef__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__0_in_rule__AnonymousConceptDef__Group__1__Impl3500);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1661:1: rule__AnonymousConceptDef__Group__2 : rule__AnonymousConceptDef__Group__2__Impl ;
    public final void rule__AnonymousConceptDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1665:1: ( rule__AnonymousConceptDef__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1666:2: rule__AnonymousConceptDef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group__2__Impl_in_rule__AnonymousConceptDef__Group__23531);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1672:1: rule__AnonymousConceptDef__Group__2__Impl : ( ( rule__AnonymousConceptDef__Group_2__0 )? ) ;
    public final void rule__AnonymousConceptDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1676:1: ( ( ( rule__AnonymousConceptDef__Group_2__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1677:1: ( ( rule__AnonymousConceptDef__Group_2__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1677:1: ( ( rule__AnonymousConceptDef__Group_2__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1678:1: ( rule__AnonymousConceptDef__Group_2__0 )?
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1679:1: ( rule__AnonymousConceptDef__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1679:2: rule__AnonymousConceptDef__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__0_in_rule__AnonymousConceptDef__Group__2__Impl3558);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1695:1: rule__AnonymousConceptDef__Group_1__0 : rule__AnonymousConceptDef__Group_1__0__Impl rule__AnonymousConceptDef__Group_1__1 ;
    public final void rule__AnonymousConceptDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1699:1: ( rule__AnonymousConceptDef__Group_1__0__Impl rule__AnonymousConceptDef__Group_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1700:2: rule__AnonymousConceptDef__Group_1__0__Impl rule__AnonymousConceptDef__Group_1__1
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__0__Impl_in_rule__AnonymousConceptDef__Group_1__03595);
            rule__AnonymousConceptDef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__1_in_rule__AnonymousConceptDef__Group_1__03598);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1707:1: rule__AnonymousConceptDef__Group_1__0__Impl : ( '<' ) ;
    public final void rule__AnonymousConceptDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1711:1: ( ( '<' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1712:1: ( '<' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1712:1: ( '<' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1713:1: '<'
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getLessThanSignKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__AnonymousConceptDef__Group_1__0__Impl3626); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1726:1: rule__AnonymousConceptDef__Group_1__1 : rule__AnonymousConceptDef__Group_1__1__Impl rule__AnonymousConceptDef__Group_1__2 ;
    public final void rule__AnonymousConceptDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1730:1: ( rule__AnonymousConceptDef__Group_1__1__Impl rule__AnonymousConceptDef__Group_1__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1731:2: rule__AnonymousConceptDef__Group_1__1__Impl rule__AnonymousConceptDef__Group_1__2
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__1__Impl_in_rule__AnonymousConceptDef__Group_1__13657);
            rule__AnonymousConceptDef__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__2_in_rule__AnonymousConceptDef__Group_1__13660);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1738:1: rule__AnonymousConceptDef__Group_1__1__Impl : ( ( rule__AnonymousConceptDef__MappingAssignment_1_1 ) ) ;
    public final void rule__AnonymousConceptDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1742:1: ( ( ( rule__AnonymousConceptDef__MappingAssignment_1_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1743:1: ( ( rule__AnonymousConceptDef__MappingAssignment_1_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1743:1: ( ( rule__AnonymousConceptDef__MappingAssignment_1_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1744:1: ( rule__AnonymousConceptDef__MappingAssignment_1_1 )
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getMappingAssignment_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1745:1: ( rule__AnonymousConceptDef__MappingAssignment_1_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1745:2: rule__AnonymousConceptDef__MappingAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__MappingAssignment_1_1_in_rule__AnonymousConceptDef__Group_1__1__Impl3687);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1755:1: rule__AnonymousConceptDef__Group_1__2 : rule__AnonymousConceptDef__Group_1__2__Impl ;
    public final void rule__AnonymousConceptDef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1759:1: ( rule__AnonymousConceptDef__Group_1__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1760:2: rule__AnonymousConceptDef__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__2__Impl_in_rule__AnonymousConceptDef__Group_1__23717);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1766:1: rule__AnonymousConceptDef__Group_1__2__Impl : ( '>' ) ;
    public final void rule__AnonymousConceptDef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1770:1: ( ( '>' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1771:1: ( '>' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1771:1: ( '>' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1772:1: '>'
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getGreaterThanSignKeyword_1_2()); 
            match(input,18,FOLLOW_18_in_rule__AnonymousConceptDef__Group_1__2__Impl3745); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1791:1: rule__AnonymousConceptDef__Group_2__0 : rule__AnonymousConceptDef__Group_2__0__Impl rule__AnonymousConceptDef__Group_2__1 ;
    public final void rule__AnonymousConceptDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1795:1: ( rule__AnonymousConceptDef__Group_2__0__Impl rule__AnonymousConceptDef__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1796:2: rule__AnonymousConceptDef__Group_2__0__Impl rule__AnonymousConceptDef__Group_2__1
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__0__Impl_in_rule__AnonymousConceptDef__Group_2__03782);
            rule__AnonymousConceptDef__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__1_in_rule__AnonymousConceptDef__Group_2__03785);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1803:1: rule__AnonymousConceptDef__Group_2__0__Impl : ( '{' ) ;
    public final void rule__AnonymousConceptDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1807:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1808:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1808:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1809:1: '{'
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,14,FOLLOW_14_in_rule__AnonymousConceptDef__Group_2__0__Impl3813); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1822:1: rule__AnonymousConceptDef__Group_2__1 : rule__AnonymousConceptDef__Group_2__1__Impl rule__AnonymousConceptDef__Group_2__2 ;
    public final void rule__AnonymousConceptDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1826:1: ( rule__AnonymousConceptDef__Group_2__1__Impl rule__AnonymousConceptDef__Group_2__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1827:2: rule__AnonymousConceptDef__Group_2__1__Impl rule__AnonymousConceptDef__Group_2__2
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__1__Impl_in_rule__AnonymousConceptDef__Group_2__13844);
            rule__AnonymousConceptDef__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__2_in_rule__AnonymousConceptDef__Group_2__13847);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1834:1: rule__AnonymousConceptDef__Group_2__1__Impl : ( ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )* ) ;
    public final void rule__AnonymousConceptDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1838:1: ( ( ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1839:1: ( ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1839:1: ( ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1840:1: ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )*
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getAnnotationAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1841:1: ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ANNOTATION_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1841:2: rule__AnonymousConceptDef__AnnotationAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__AnonymousConceptDef__AnnotationAssignment_2_1_in_rule__AnonymousConceptDef__Group_2__1__Impl3874);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1851:1: rule__AnonymousConceptDef__Group_2__2 : rule__AnonymousConceptDef__Group_2__2__Impl rule__AnonymousConceptDef__Group_2__3 ;
    public final void rule__AnonymousConceptDef__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1855:1: ( rule__AnonymousConceptDef__Group_2__2__Impl rule__AnonymousConceptDef__Group_2__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1856:2: rule__AnonymousConceptDef__Group_2__2__Impl rule__AnonymousConceptDef__Group_2__3
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__2__Impl_in_rule__AnonymousConceptDef__Group_2__23905);
            rule__AnonymousConceptDef__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__3_in_rule__AnonymousConceptDef__Group_2__23908);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1863:1: rule__AnonymousConceptDef__Group_2__2__Impl : ( ( rule__AnonymousConceptDef__ChildAssignment_2_2 )* ) ;
    public final void rule__AnonymousConceptDef__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1867:1: ( ( ( rule__AnonymousConceptDef__ChildAssignment_2_2 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1868:1: ( ( rule__AnonymousConceptDef__ChildAssignment_2_2 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1868:1: ( ( rule__AnonymousConceptDef__ChildAssignment_2_2 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1869:1: ( rule__AnonymousConceptDef__ChildAssignment_2_2 )*
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getChildAssignment_2_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1870:1: ( rule__AnonymousConceptDef__ChildAssignment_2_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==38) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1870:2: rule__AnonymousConceptDef__ChildAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__AnonymousConceptDef__ChildAssignment_2_2_in_rule__AnonymousConceptDef__Group_2__2__Impl3935);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1880:1: rule__AnonymousConceptDef__Group_2__3 : rule__AnonymousConceptDef__Group_2__3__Impl ;
    public final void rule__AnonymousConceptDef__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1884:1: ( rule__AnonymousConceptDef__Group_2__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1885:2: rule__AnonymousConceptDef__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__3__Impl_in_rule__AnonymousConceptDef__Group_2__33966);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1891:1: rule__AnonymousConceptDef__Group_2__3__Impl : ( '}' ) ;
    public final void rule__AnonymousConceptDef__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1895:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1896:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1896:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1897:1: '}'
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,15,FOLLOW_15_in_rule__AnonymousConceptDef__Group_2__3__Impl3994); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1918:1: rule__NamedConceptDef__Group__0 : rule__NamedConceptDef__Group__0__Impl rule__NamedConceptDef__Group__1 ;
    public final void rule__NamedConceptDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1922:1: ( rule__NamedConceptDef__Group__0__Impl rule__NamedConceptDef__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1923:2: rule__NamedConceptDef__Group__0__Impl rule__NamedConceptDef__Group__1
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group__0__Impl_in_rule__NamedConceptDef__Group__04033);
            rule__NamedConceptDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group__1_in_rule__NamedConceptDef__Group__04036);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1930:1: rule__NamedConceptDef__Group__0__Impl : ( ( rule__NamedConceptDef__NamedAssignment_0 ) ) ;
    public final void rule__NamedConceptDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1934:1: ( ( ( rule__NamedConceptDef__NamedAssignment_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1935:1: ( ( rule__NamedConceptDef__NamedAssignment_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1935:1: ( ( rule__NamedConceptDef__NamedAssignment_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1936:1: ( rule__NamedConceptDef__NamedAssignment_0 )
            {
             before(grammarAccess.getNamedConceptDefAccess().getNamedAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1937:1: ( rule__NamedConceptDef__NamedAssignment_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1937:2: rule__NamedConceptDef__NamedAssignment_0
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__NamedAssignment_0_in_rule__NamedConceptDef__Group__0__Impl4063);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1947:1: rule__NamedConceptDef__Group__1 : rule__NamedConceptDef__Group__1__Impl rule__NamedConceptDef__Group__2 ;
    public final void rule__NamedConceptDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1951:1: ( rule__NamedConceptDef__Group__1__Impl rule__NamedConceptDef__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1952:2: rule__NamedConceptDef__Group__1__Impl rule__NamedConceptDef__Group__2
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group__1__Impl_in_rule__NamedConceptDef__Group__14093);
            rule__NamedConceptDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group__2_in_rule__NamedConceptDef__Group__14096);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1959:1: rule__NamedConceptDef__Group__1__Impl : ( ( rule__NamedConceptDef__NameAssignment_1 ) ) ;
    public final void rule__NamedConceptDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1963:1: ( ( ( rule__NamedConceptDef__NameAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1964:1: ( ( rule__NamedConceptDef__NameAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1964:1: ( ( rule__NamedConceptDef__NameAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1965:1: ( rule__NamedConceptDef__NameAssignment_1 )
            {
             before(grammarAccess.getNamedConceptDefAccess().getNameAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1966:1: ( rule__NamedConceptDef__NameAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1966:2: rule__NamedConceptDef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__NameAssignment_1_in_rule__NamedConceptDef__Group__1__Impl4123);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1976:1: rule__NamedConceptDef__Group__2 : rule__NamedConceptDef__Group__2__Impl rule__NamedConceptDef__Group__3 ;
    public final void rule__NamedConceptDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1980:1: ( rule__NamedConceptDef__Group__2__Impl rule__NamedConceptDef__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1981:2: rule__NamedConceptDef__Group__2__Impl rule__NamedConceptDef__Group__3
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group__2__Impl_in_rule__NamedConceptDef__Group__24153);
            rule__NamedConceptDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group__3_in_rule__NamedConceptDef__Group__24156);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1988:1: rule__NamedConceptDef__Group__2__Impl : ( ( rule__NamedConceptDef__Group_2__0 )? ) ;
    public final void rule__NamedConceptDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1992:1: ( ( ( rule__NamedConceptDef__Group_2__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1993:1: ( ( rule__NamedConceptDef__Group_2__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1993:1: ( ( rule__NamedConceptDef__Group_2__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1994:1: ( rule__NamedConceptDef__Group_2__0 )?
            {
             before(grammarAccess.getNamedConceptDefAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1995:1: ( rule__NamedConceptDef__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1995:2: rule__NamedConceptDef__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__0_in_rule__NamedConceptDef__Group__2__Impl4183);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2005:1: rule__NamedConceptDef__Group__3 : rule__NamedConceptDef__Group__3__Impl ;
    public final void rule__NamedConceptDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2009:1: ( rule__NamedConceptDef__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2010:2: rule__NamedConceptDef__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group__3__Impl_in_rule__NamedConceptDef__Group__34214);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2016:1: rule__NamedConceptDef__Group__3__Impl : ( ( rule__NamedConceptDef__Group_3__0 )? ) ;
    public final void rule__NamedConceptDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2020:1: ( ( ( rule__NamedConceptDef__Group_3__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2021:1: ( ( rule__NamedConceptDef__Group_3__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2021:1: ( ( rule__NamedConceptDef__Group_3__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2022:1: ( rule__NamedConceptDef__Group_3__0 )?
            {
             before(grammarAccess.getNamedConceptDefAccess().getGroup_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2023:1: ( rule__NamedConceptDef__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==14) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2023:2: rule__NamedConceptDef__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__0_in_rule__NamedConceptDef__Group__3__Impl4241);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2041:1: rule__NamedConceptDef__Group_2__0 : rule__NamedConceptDef__Group_2__0__Impl rule__NamedConceptDef__Group_2__1 ;
    public final void rule__NamedConceptDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2045:1: ( rule__NamedConceptDef__Group_2__0__Impl rule__NamedConceptDef__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2046:2: rule__NamedConceptDef__Group_2__0__Impl rule__NamedConceptDef__Group_2__1
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__0__Impl_in_rule__NamedConceptDef__Group_2__04280);
            rule__NamedConceptDef__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__1_in_rule__NamedConceptDef__Group_2__04283);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2053:1: rule__NamedConceptDef__Group_2__0__Impl : ( '<' ) ;
    public final void rule__NamedConceptDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2057:1: ( ( '<' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2058:1: ( '<' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2058:1: ( '<' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2059:1: '<'
            {
             before(grammarAccess.getNamedConceptDefAccess().getLessThanSignKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__NamedConceptDef__Group_2__0__Impl4311); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2072:1: rule__NamedConceptDef__Group_2__1 : rule__NamedConceptDef__Group_2__1__Impl rule__NamedConceptDef__Group_2__2 ;
    public final void rule__NamedConceptDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2076:1: ( rule__NamedConceptDef__Group_2__1__Impl rule__NamedConceptDef__Group_2__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2077:2: rule__NamedConceptDef__Group_2__1__Impl rule__NamedConceptDef__Group_2__2
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__1__Impl_in_rule__NamedConceptDef__Group_2__14342);
            rule__NamedConceptDef__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__2_in_rule__NamedConceptDef__Group_2__14345);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2084:1: rule__NamedConceptDef__Group_2__1__Impl : ( ( rule__NamedConceptDef__MappingAssignment_2_1 ) ) ;
    public final void rule__NamedConceptDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2088:1: ( ( ( rule__NamedConceptDef__MappingAssignment_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2089:1: ( ( rule__NamedConceptDef__MappingAssignment_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2089:1: ( ( rule__NamedConceptDef__MappingAssignment_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2090:1: ( rule__NamedConceptDef__MappingAssignment_2_1 )
            {
             before(grammarAccess.getNamedConceptDefAccess().getMappingAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2091:1: ( rule__NamedConceptDef__MappingAssignment_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2091:2: rule__NamedConceptDef__MappingAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__MappingAssignment_2_1_in_rule__NamedConceptDef__Group_2__1__Impl4372);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2101:1: rule__NamedConceptDef__Group_2__2 : rule__NamedConceptDef__Group_2__2__Impl ;
    public final void rule__NamedConceptDef__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2105:1: ( rule__NamedConceptDef__Group_2__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2106:2: rule__NamedConceptDef__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__2__Impl_in_rule__NamedConceptDef__Group_2__24402);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2112:1: rule__NamedConceptDef__Group_2__2__Impl : ( '>' ) ;
    public final void rule__NamedConceptDef__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2116:1: ( ( '>' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2117:1: ( '>' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2117:1: ( '>' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2118:1: '>'
            {
             before(grammarAccess.getNamedConceptDefAccess().getGreaterThanSignKeyword_2_2()); 
            match(input,18,FOLLOW_18_in_rule__NamedConceptDef__Group_2__2__Impl4430); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2137:1: rule__NamedConceptDef__Group_3__0 : rule__NamedConceptDef__Group_3__0__Impl rule__NamedConceptDef__Group_3__1 ;
    public final void rule__NamedConceptDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2141:1: ( rule__NamedConceptDef__Group_3__0__Impl rule__NamedConceptDef__Group_3__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2142:2: rule__NamedConceptDef__Group_3__0__Impl rule__NamedConceptDef__Group_3__1
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__0__Impl_in_rule__NamedConceptDef__Group_3__04467);
            rule__NamedConceptDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__1_in_rule__NamedConceptDef__Group_3__04470);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2149:1: rule__NamedConceptDef__Group_3__0__Impl : ( '{' ) ;
    public final void rule__NamedConceptDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2153:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2154:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2154:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2155:1: '{'
            {
             before(grammarAccess.getNamedConceptDefAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,14,FOLLOW_14_in_rule__NamedConceptDef__Group_3__0__Impl4498); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2168:1: rule__NamedConceptDef__Group_3__1 : rule__NamedConceptDef__Group_3__1__Impl rule__NamedConceptDef__Group_3__2 ;
    public final void rule__NamedConceptDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2172:1: ( rule__NamedConceptDef__Group_3__1__Impl rule__NamedConceptDef__Group_3__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2173:2: rule__NamedConceptDef__Group_3__1__Impl rule__NamedConceptDef__Group_3__2
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__1__Impl_in_rule__NamedConceptDef__Group_3__14529);
            rule__NamedConceptDef__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__2_in_rule__NamedConceptDef__Group_3__14532);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2180:1: rule__NamedConceptDef__Group_3__1__Impl : ( ( rule__NamedConceptDef__AnnotationAssignment_3_1 )* ) ;
    public final void rule__NamedConceptDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2184:1: ( ( ( rule__NamedConceptDef__AnnotationAssignment_3_1 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2185:1: ( ( rule__NamedConceptDef__AnnotationAssignment_3_1 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2185:1: ( ( rule__NamedConceptDef__AnnotationAssignment_3_1 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2186:1: ( rule__NamedConceptDef__AnnotationAssignment_3_1 )*
            {
             before(grammarAccess.getNamedConceptDefAccess().getAnnotationAssignment_3_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2187:1: ( rule__NamedConceptDef__AnnotationAssignment_3_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ANNOTATION_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2187:2: rule__NamedConceptDef__AnnotationAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__NamedConceptDef__AnnotationAssignment_3_1_in_rule__NamedConceptDef__Group_3__1__Impl4559);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2197:1: rule__NamedConceptDef__Group_3__2 : rule__NamedConceptDef__Group_3__2__Impl rule__NamedConceptDef__Group_3__3 ;
    public final void rule__NamedConceptDef__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2201:1: ( rule__NamedConceptDef__Group_3__2__Impl rule__NamedConceptDef__Group_3__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2202:2: rule__NamedConceptDef__Group_3__2__Impl rule__NamedConceptDef__Group_3__3
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__2__Impl_in_rule__NamedConceptDef__Group_3__24590);
            rule__NamedConceptDef__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__3_in_rule__NamedConceptDef__Group_3__24593);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2209:1: rule__NamedConceptDef__Group_3__2__Impl : ( ( rule__NamedConceptDef__ChildAssignment_3_2 )* ) ;
    public final void rule__NamedConceptDef__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2213:1: ( ( ( rule__NamedConceptDef__ChildAssignment_3_2 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2214:1: ( ( rule__NamedConceptDef__ChildAssignment_3_2 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2214:1: ( ( rule__NamedConceptDef__ChildAssignment_3_2 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2215:1: ( rule__NamedConceptDef__ChildAssignment_3_2 )*
            {
             before(grammarAccess.getNamedConceptDefAccess().getChildAssignment_3_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2216:1: ( rule__NamedConceptDef__ChildAssignment_3_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2216:2: rule__NamedConceptDef__ChildAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__NamedConceptDef__ChildAssignment_3_2_in_rule__NamedConceptDef__Group_3__2__Impl4620);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2226:1: rule__NamedConceptDef__Group_3__3 : rule__NamedConceptDef__Group_3__3__Impl ;
    public final void rule__NamedConceptDef__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2230:1: ( rule__NamedConceptDef__Group_3__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2231:2: rule__NamedConceptDef__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__3__Impl_in_rule__NamedConceptDef__Group_3__34651);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2237:1: rule__NamedConceptDef__Group_3__3__Impl : ( '}' ) ;
    public final void rule__NamedConceptDef__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2241:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2242:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2242:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2243:1: '}'
            {
             before(grammarAccess.getNamedConceptDefAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,15,FOLLOW_15_in_rule__NamedConceptDef__Group_3__3__Impl4679); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2264:1: rule__TopConceptDef__Group__0 : rule__TopConceptDef__Group__0__Impl rule__TopConceptDef__Group__1 ;
    public final void rule__TopConceptDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2268:1: ( rule__TopConceptDef__Group__0__Impl rule__TopConceptDef__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2269:2: rule__TopConceptDef__Group__0__Impl rule__TopConceptDef__Group__1
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group__0__Impl_in_rule__TopConceptDef__Group__04718);
            rule__TopConceptDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group__1_in_rule__TopConceptDef__Group__04721);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2276:1: rule__TopConceptDef__Group__0__Impl : ( ( rule__TopConceptDef__TopAssignment_0 ) ) ;
    public final void rule__TopConceptDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2280:1: ( ( ( rule__TopConceptDef__TopAssignment_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2281:1: ( ( rule__TopConceptDef__TopAssignment_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2281:1: ( ( rule__TopConceptDef__TopAssignment_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2282:1: ( rule__TopConceptDef__TopAssignment_0 )
            {
             before(grammarAccess.getTopConceptDefAccess().getTopAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2283:1: ( rule__TopConceptDef__TopAssignment_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2283:2: rule__TopConceptDef__TopAssignment_0
            {
            pushFollow(FOLLOW_rule__TopConceptDef__TopAssignment_0_in_rule__TopConceptDef__Group__0__Impl4748);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2293:1: rule__TopConceptDef__Group__1 : rule__TopConceptDef__Group__1__Impl rule__TopConceptDef__Group__2 ;
    public final void rule__TopConceptDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2297:1: ( rule__TopConceptDef__Group__1__Impl rule__TopConceptDef__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2298:2: rule__TopConceptDef__Group__1__Impl rule__TopConceptDef__Group__2
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group__1__Impl_in_rule__TopConceptDef__Group__14778);
            rule__TopConceptDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group__2_in_rule__TopConceptDef__Group__14781);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2305:1: rule__TopConceptDef__Group__1__Impl : ( ( rule__TopConceptDef__NamedAssignment_1 ) ) ;
    public final void rule__TopConceptDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2309:1: ( ( ( rule__TopConceptDef__NamedAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2310:1: ( ( rule__TopConceptDef__NamedAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2310:1: ( ( rule__TopConceptDef__NamedAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2311:1: ( rule__TopConceptDef__NamedAssignment_1 )
            {
             before(grammarAccess.getTopConceptDefAccess().getNamedAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2312:1: ( rule__TopConceptDef__NamedAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2312:2: rule__TopConceptDef__NamedAssignment_1
            {
            pushFollow(FOLLOW_rule__TopConceptDef__NamedAssignment_1_in_rule__TopConceptDef__Group__1__Impl4808);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2322:1: rule__TopConceptDef__Group__2 : rule__TopConceptDef__Group__2__Impl rule__TopConceptDef__Group__3 ;
    public final void rule__TopConceptDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2326:1: ( rule__TopConceptDef__Group__2__Impl rule__TopConceptDef__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2327:2: rule__TopConceptDef__Group__2__Impl rule__TopConceptDef__Group__3
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group__2__Impl_in_rule__TopConceptDef__Group__24838);
            rule__TopConceptDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group__3_in_rule__TopConceptDef__Group__24841);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2334:1: rule__TopConceptDef__Group__2__Impl : ( ( rule__TopConceptDef__NameAssignment_2 ) ) ;
    public final void rule__TopConceptDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2338:1: ( ( ( rule__TopConceptDef__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2339:1: ( ( rule__TopConceptDef__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2339:1: ( ( rule__TopConceptDef__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2340:1: ( rule__TopConceptDef__NameAssignment_2 )
            {
             before(grammarAccess.getTopConceptDefAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2341:1: ( rule__TopConceptDef__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2341:2: rule__TopConceptDef__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TopConceptDef__NameAssignment_2_in_rule__TopConceptDef__Group__2__Impl4868);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2351:1: rule__TopConceptDef__Group__3 : rule__TopConceptDef__Group__3__Impl rule__TopConceptDef__Group__4 ;
    public final void rule__TopConceptDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2355:1: ( rule__TopConceptDef__Group__3__Impl rule__TopConceptDef__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2356:2: rule__TopConceptDef__Group__3__Impl rule__TopConceptDef__Group__4
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group__3__Impl_in_rule__TopConceptDef__Group__34898);
            rule__TopConceptDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group__4_in_rule__TopConceptDef__Group__34901);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2363:1: rule__TopConceptDef__Group__3__Impl : ( ( rule__TopConceptDef__Group_3__0 )? ) ;
    public final void rule__TopConceptDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2367:1: ( ( ( rule__TopConceptDef__Group_3__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2368:1: ( ( rule__TopConceptDef__Group_3__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2368:1: ( ( rule__TopConceptDef__Group_3__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2369:1: ( rule__TopConceptDef__Group_3__0 )?
            {
             before(grammarAccess.getTopConceptDefAccess().getGroup_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2370:1: ( rule__TopConceptDef__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2370:2: rule__TopConceptDef__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TopConceptDef__Group_3__0_in_rule__TopConceptDef__Group__3__Impl4928);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2380:1: rule__TopConceptDef__Group__4 : rule__TopConceptDef__Group__4__Impl ;
    public final void rule__TopConceptDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2384:1: ( rule__TopConceptDef__Group__4__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2385:2: rule__TopConceptDef__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group__4__Impl_in_rule__TopConceptDef__Group__44959);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2391:1: rule__TopConceptDef__Group__4__Impl : ( ( rule__TopConceptDef__Group_4__0 )? ) ;
    public final void rule__TopConceptDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2395:1: ( ( ( rule__TopConceptDef__Group_4__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2396:1: ( ( rule__TopConceptDef__Group_4__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2396:1: ( ( rule__TopConceptDef__Group_4__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2397:1: ( rule__TopConceptDef__Group_4__0 )?
            {
             before(grammarAccess.getTopConceptDefAccess().getGroup_4()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2398:1: ( rule__TopConceptDef__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==14) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2398:2: rule__TopConceptDef__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TopConceptDef__Group_4__0_in_rule__TopConceptDef__Group__4__Impl4986);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2418:1: rule__TopConceptDef__Group_3__0 : rule__TopConceptDef__Group_3__0__Impl rule__TopConceptDef__Group_3__1 ;
    public final void rule__TopConceptDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2422:1: ( rule__TopConceptDef__Group_3__0__Impl rule__TopConceptDef__Group_3__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2423:2: rule__TopConceptDef__Group_3__0__Impl rule__TopConceptDef__Group_3__1
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_3__0__Impl_in_rule__TopConceptDef__Group_3__05027);
            rule__TopConceptDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group_3__1_in_rule__TopConceptDef__Group_3__05030);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2430:1: rule__TopConceptDef__Group_3__0__Impl : ( '<' ) ;
    public final void rule__TopConceptDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2434:1: ( ( '<' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2435:1: ( '<' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2435:1: ( '<' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2436:1: '<'
            {
             before(grammarAccess.getTopConceptDefAccess().getLessThanSignKeyword_3_0()); 
            match(input,17,FOLLOW_17_in_rule__TopConceptDef__Group_3__0__Impl5058); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2449:1: rule__TopConceptDef__Group_3__1 : rule__TopConceptDef__Group_3__1__Impl rule__TopConceptDef__Group_3__2 ;
    public final void rule__TopConceptDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2453:1: ( rule__TopConceptDef__Group_3__1__Impl rule__TopConceptDef__Group_3__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2454:2: rule__TopConceptDef__Group_3__1__Impl rule__TopConceptDef__Group_3__2
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_3__1__Impl_in_rule__TopConceptDef__Group_3__15089);
            rule__TopConceptDef__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group_3__2_in_rule__TopConceptDef__Group_3__15092);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2461:1: rule__TopConceptDef__Group_3__1__Impl : ( ( rule__TopConceptDef__MappingAssignment_3_1 ) ) ;
    public final void rule__TopConceptDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2465:1: ( ( ( rule__TopConceptDef__MappingAssignment_3_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2466:1: ( ( rule__TopConceptDef__MappingAssignment_3_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2466:1: ( ( rule__TopConceptDef__MappingAssignment_3_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2467:1: ( rule__TopConceptDef__MappingAssignment_3_1 )
            {
             before(grammarAccess.getTopConceptDefAccess().getMappingAssignment_3_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2468:1: ( rule__TopConceptDef__MappingAssignment_3_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2468:2: rule__TopConceptDef__MappingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TopConceptDef__MappingAssignment_3_1_in_rule__TopConceptDef__Group_3__1__Impl5119);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2478:1: rule__TopConceptDef__Group_3__2 : rule__TopConceptDef__Group_3__2__Impl ;
    public final void rule__TopConceptDef__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2482:1: ( rule__TopConceptDef__Group_3__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2483:2: rule__TopConceptDef__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_3__2__Impl_in_rule__TopConceptDef__Group_3__25149);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2489:1: rule__TopConceptDef__Group_3__2__Impl : ( '>' ) ;
    public final void rule__TopConceptDef__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2493:1: ( ( '>' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2494:1: ( '>' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2494:1: ( '>' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2495:1: '>'
            {
             before(grammarAccess.getTopConceptDefAccess().getGreaterThanSignKeyword_3_2()); 
            match(input,18,FOLLOW_18_in_rule__TopConceptDef__Group_3__2__Impl5177); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2514:1: rule__TopConceptDef__Group_4__0 : rule__TopConceptDef__Group_4__0__Impl rule__TopConceptDef__Group_4__1 ;
    public final void rule__TopConceptDef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2518:1: ( rule__TopConceptDef__Group_4__0__Impl rule__TopConceptDef__Group_4__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2519:2: rule__TopConceptDef__Group_4__0__Impl rule__TopConceptDef__Group_4__1
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__0__Impl_in_rule__TopConceptDef__Group_4__05214);
            rule__TopConceptDef__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__1_in_rule__TopConceptDef__Group_4__05217);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2526:1: rule__TopConceptDef__Group_4__0__Impl : ( '{' ) ;
    public final void rule__TopConceptDef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2530:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2531:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2531:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2532:1: '{'
            {
             before(grammarAccess.getTopConceptDefAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,14,FOLLOW_14_in_rule__TopConceptDef__Group_4__0__Impl5245); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2545:1: rule__TopConceptDef__Group_4__1 : rule__TopConceptDef__Group_4__1__Impl rule__TopConceptDef__Group_4__2 ;
    public final void rule__TopConceptDef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2549:1: ( rule__TopConceptDef__Group_4__1__Impl rule__TopConceptDef__Group_4__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2550:2: rule__TopConceptDef__Group_4__1__Impl rule__TopConceptDef__Group_4__2
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__1__Impl_in_rule__TopConceptDef__Group_4__15276);
            rule__TopConceptDef__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__2_in_rule__TopConceptDef__Group_4__15279);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2557:1: rule__TopConceptDef__Group_4__1__Impl : ( ( rule__TopConceptDef__AnnotationAssignment_4_1 )* ) ;
    public final void rule__TopConceptDef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2561:1: ( ( ( rule__TopConceptDef__AnnotationAssignment_4_1 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2562:1: ( ( rule__TopConceptDef__AnnotationAssignment_4_1 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2562:1: ( ( rule__TopConceptDef__AnnotationAssignment_4_1 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2563:1: ( rule__TopConceptDef__AnnotationAssignment_4_1 )*
            {
             before(grammarAccess.getTopConceptDefAccess().getAnnotationAssignment_4_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2564:1: ( rule__TopConceptDef__AnnotationAssignment_4_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ANNOTATION_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2564:2: rule__TopConceptDef__AnnotationAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__TopConceptDef__AnnotationAssignment_4_1_in_rule__TopConceptDef__Group_4__1__Impl5306);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2574:1: rule__TopConceptDef__Group_4__2 : rule__TopConceptDef__Group_4__2__Impl rule__TopConceptDef__Group_4__3 ;
    public final void rule__TopConceptDef__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2578:1: ( rule__TopConceptDef__Group_4__2__Impl rule__TopConceptDef__Group_4__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2579:2: rule__TopConceptDef__Group_4__2__Impl rule__TopConceptDef__Group_4__3
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__2__Impl_in_rule__TopConceptDef__Group_4__25337);
            rule__TopConceptDef__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__3_in_rule__TopConceptDef__Group_4__25340);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2586:1: rule__TopConceptDef__Group_4__2__Impl : ( ( rule__TopConceptDef__ChildAssignment_4_2 )* ) ;
    public final void rule__TopConceptDef__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2590:1: ( ( ( rule__TopConceptDef__ChildAssignment_4_2 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2591:1: ( ( rule__TopConceptDef__ChildAssignment_4_2 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2591:1: ( ( rule__TopConceptDef__ChildAssignment_4_2 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2592:1: ( rule__TopConceptDef__ChildAssignment_4_2 )*
            {
             before(grammarAccess.getTopConceptDefAccess().getChildAssignment_4_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2593:1: ( rule__TopConceptDef__ChildAssignment_4_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==38) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2593:2: rule__TopConceptDef__ChildAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_rule__TopConceptDef__ChildAssignment_4_2_in_rule__TopConceptDef__Group_4__2__Impl5367);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2603:1: rule__TopConceptDef__Group_4__3 : rule__TopConceptDef__Group_4__3__Impl ;
    public final void rule__TopConceptDef__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2607:1: ( rule__TopConceptDef__Group_4__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2608:2: rule__TopConceptDef__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__3__Impl_in_rule__TopConceptDef__Group_4__35398);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2614:1: rule__TopConceptDef__Group_4__3__Impl : ( '}' ) ;
    public final void rule__TopConceptDef__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2618:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2619:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2619:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2620:1: '}'
            {
             before(grammarAccess.getTopConceptDefAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,15,FOLLOW_15_in_rule__TopConceptDef__Group_4__3__Impl5426); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2641:1: rule__Subconcept__Group__0 : rule__Subconcept__Group__0__Impl rule__Subconcept__Group__1 ;
    public final void rule__Subconcept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2645:1: ( rule__Subconcept__Group__0__Impl rule__Subconcept__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2646:2: rule__Subconcept__Group__0__Impl rule__Subconcept__Group__1
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__0__Impl_in_rule__Subconcept__Group__05465);
            rule__Subconcept__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group__1_in_rule__Subconcept__Group__05468);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2653:1: rule__Subconcept__Group__0__Impl : ( ( rule__Subconcept__NameAssignment_0 ) ) ;
    public final void rule__Subconcept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2657:1: ( ( ( rule__Subconcept__NameAssignment_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2658:1: ( ( rule__Subconcept__NameAssignment_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2658:1: ( ( rule__Subconcept__NameAssignment_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2659:1: ( rule__Subconcept__NameAssignment_0 )
            {
             before(grammarAccess.getSubconceptAccess().getNameAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2660:1: ( rule__Subconcept__NameAssignment_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2660:2: rule__Subconcept__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Subconcept__NameAssignment_0_in_rule__Subconcept__Group__0__Impl5495);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2670:1: rule__Subconcept__Group__1 : rule__Subconcept__Group__1__Impl rule__Subconcept__Group__2 ;
    public final void rule__Subconcept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2674:1: ( rule__Subconcept__Group__1__Impl rule__Subconcept__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2675:2: rule__Subconcept__Group__1__Impl rule__Subconcept__Group__2
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__1__Impl_in_rule__Subconcept__Group__15525);
            rule__Subconcept__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group__2_in_rule__Subconcept__Group__15528);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2682:1: rule__Subconcept__Group__1__Impl : ( ( rule__Subconcept__CardinalityAssignment_1 )? ) ;
    public final void rule__Subconcept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2686:1: ( ( ( rule__Subconcept__CardinalityAssignment_1 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2687:1: ( ( rule__Subconcept__CardinalityAssignment_1 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2687:1: ( ( rule__Subconcept__CardinalityAssignment_1 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2688:1: ( rule__Subconcept__CardinalityAssignment_1 )?
            {
             before(grammarAccess.getSubconceptAccess().getCardinalityAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2689:1: ( rule__Subconcept__CardinalityAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=39 && LA25_0<=40)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2689:2: rule__Subconcept__CardinalityAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Subconcept__CardinalityAssignment_1_in_rule__Subconcept__Group__1__Impl5555);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2699:1: rule__Subconcept__Group__2 : rule__Subconcept__Group__2__Impl rule__Subconcept__Group__3 ;
    public final void rule__Subconcept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2703:1: ( rule__Subconcept__Group__2__Impl rule__Subconcept__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2704:2: rule__Subconcept__Group__2__Impl rule__Subconcept__Group__3
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__2__Impl_in_rule__Subconcept__Group__25586);
            rule__Subconcept__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group__3_in_rule__Subconcept__Group__25589);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2711:1: rule__Subconcept__Group__2__Impl : ( ( rule__Subconcept__EssentialAssignment_2 )? ) ;
    public final void rule__Subconcept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2715:1: ( ( ( rule__Subconcept__EssentialAssignment_2 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2716:1: ( ( rule__Subconcept__EssentialAssignment_2 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2716:1: ( ( rule__Subconcept__EssentialAssignment_2 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2717:1: ( rule__Subconcept__EssentialAssignment_2 )?
            {
             before(grammarAccess.getSubconceptAccess().getEssentialAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2718:1: ( rule__Subconcept__EssentialAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2718:2: rule__Subconcept__EssentialAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Subconcept__EssentialAssignment_2_in_rule__Subconcept__Group__2__Impl5616);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2728:1: rule__Subconcept__Group__3 : rule__Subconcept__Group__3__Impl ;
    public final void rule__Subconcept__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2732:1: ( rule__Subconcept__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2733:2: rule__Subconcept__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__3__Impl_in_rule__Subconcept__Group__35647);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2739:1: rule__Subconcept__Group__3__Impl : ( ( rule__Subconcept__Alternatives_3 ) ) ;
    public final void rule__Subconcept__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2743:1: ( ( ( rule__Subconcept__Alternatives_3 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2744:1: ( ( rule__Subconcept__Alternatives_3 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2744:1: ( ( rule__Subconcept__Alternatives_3 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2745:1: ( rule__Subconcept__Alternatives_3 )
            {
             before(grammarAccess.getSubconceptAccess().getAlternatives_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2746:1: ( rule__Subconcept__Alternatives_3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2746:2: rule__Subconcept__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Subconcept__Alternatives_3_in_rule__Subconcept__Group__3__Impl5674);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2764:1: rule__Subconcept__Group_3_0__0 : rule__Subconcept__Group_3_0__0__Impl rule__Subconcept__Group_3_0__1 ;
    public final void rule__Subconcept__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2768:1: ( rule__Subconcept__Group_3_0__0__Impl rule__Subconcept__Group_3_0__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2769:2: rule__Subconcept__Group_3_0__0__Impl rule__Subconcept__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_3_0__0__Impl_in_rule__Subconcept__Group_3_0__05712);
            rule__Subconcept__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group_3_0__1_in_rule__Subconcept__Group_3_0__05715);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2776:1: rule__Subconcept__Group_3_0__0__Impl : ( ':' ) ;
    public final void rule__Subconcept__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2780:1: ( ( ':' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2781:1: ( ':' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2781:1: ( ':' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2782:1: ':'
            {
             before(grammarAccess.getSubconceptAccess().getColonKeyword_3_0_0()); 
            match(input,19,FOLLOW_19_in_rule__Subconcept__Group_3_0__0__Impl5743); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2795:1: rule__Subconcept__Group_3_0__1 : rule__Subconcept__Group_3_0__1__Impl ;
    public final void rule__Subconcept__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2799:1: ( rule__Subconcept__Group_3_0__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2800:2: rule__Subconcept__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_3_0__1__Impl_in_rule__Subconcept__Group_3_0__15774);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2806:1: rule__Subconcept__Group_3_0__1__Impl : ( ( rule__Subconcept__DefAssignment_3_0_1 ) ) ;
    public final void rule__Subconcept__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2810:1: ( ( ( rule__Subconcept__DefAssignment_3_0_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2811:1: ( ( rule__Subconcept__DefAssignment_3_0_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2811:1: ( ( rule__Subconcept__DefAssignment_3_0_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2812:1: ( rule__Subconcept__DefAssignment_3_0_1 )
            {
             before(grammarAccess.getSubconceptAccess().getDefAssignment_3_0_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2813:1: ( rule__Subconcept__DefAssignment_3_0_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2813:2: rule__Subconcept__DefAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__Subconcept__DefAssignment_3_0_1_in_rule__Subconcept__Group_3_0__1__Impl5801);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2827:1: rule__Subconcept__Group_3_2__0 : rule__Subconcept__Group_3_2__0__Impl rule__Subconcept__Group_3_2__1 ;
    public final void rule__Subconcept__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2831:1: ( rule__Subconcept__Group_3_2__0__Impl rule__Subconcept__Group_3_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2832:2: rule__Subconcept__Group_3_2__0__Impl rule__Subconcept__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_3_2__0__Impl_in_rule__Subconcept__Group_3_2__05835);
            rule__Subconcept__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group_3_2__1_in_rule__Subconcept__Group_3_2__05838);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2839:1: rule__Subconcept__Group_3_2__0__Impl : ( ( rule__Subconcept__ReferenceAssignment_3_2_0 ) ) ;
    public final void rule__Subconcept__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2843:1: ( ( ( rule__Subconcept__ReferenceAssignment_3_2_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2844:1: ( ( rule__Subconcept__ReferenceAssignment_3_2_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2844:1: ( ( rule__Subconcept__ReferenceAssignment_3_2_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2845:1: ( rule__Subconcept__ReferenceAssignment_3_2_0 )
            {
             before(grammarAccess.getSubconceptAccess().getReferenceAssignment_3_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2846:1: ( rule__Subconcept__ReferenceAssignment_3_2_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2846:2: rule__Subconcept__ReferenceAssignment_3_2_0
            {
            pushFollow(FOLLOW_rule__Subconcept__ReferenceAssignment_3_2_0_in_rule__Subconcept__Group_3_2__0__Impl5865);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2856:1: rule__Subconcept__Group_3_2__1 : rule__Subconcept__Group_3_2__1__Impl ;
    public final void rule__Subconcept__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2860:1: ( rule__Subconcept__Group_3_2__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2861:2: rule__Subconcept__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_3_2__1__Impl_in_rule__Subconcept__Group_3_2__15895);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2867:1: rule__Subconcept__Group_3_2__1__Impl : ( ( rule__Subconcept__RefAssignment_3_2_1 ) ) ;
    public final void rule__Subconcept__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2871:1: ( ( ( rule__Subconcept__RefAssignment_3_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2872:1: ( ( rule__Subconcept__RefAssignment_3_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2872:1: ( ( rule__Subconcept__RefAssignment_3_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2873:1: ( rule__Subconcept__RefAssignment_3_2_1 )
            {
             before(grammarAccess.getSubconceptAccess().getRefAssignment_3_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2874:1: ( rule__Subconcept__RefAssignment_3_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2874:2: rule__Subconcept__RefAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Subconcept__RefAssignment_3_2_1_in_rule__Subconcept__Group_3_2__1__Impl5922);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2888:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2892:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2893:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05956);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05959);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2900:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__AttribAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2904:1: ( ( ( rule__Attribute__AttribAssignment_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2905:1: ( ( rule__Attribute__AttribAssignment_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2905:1: ( ( rule__Attribute__AttribAssignment_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2906:1: ( rule__Attribute__AttribAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getAttribAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2907:1: ( rule__Attribute__AttribAssignment_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2907:2: rule__Attribute__AttribAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__AttribAssignment_0_in_rule__Attribute__Group__0__Impl5986);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2917:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2921:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2922:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__16016);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__16019);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2929:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2933:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2934:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2934:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2935:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2936:1: ( rule__Attribute__NameAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2936:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl6046);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2946:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2950:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2951:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__26076);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__26079);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2958:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__CardinalityAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2962:1: ( ( ( rule__Attribute__CardinalityAssignment_2 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2963:1: ( ( rule__Attribute__CardinalityAssignment_2 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2963:1: ( ( rule__Attribute__CardinalityAssignment_2 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2964:1: ( rule__Attribute__CardinalityAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getCardinalityAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2965:1: ( rule__Attribute__CardinalityAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=39 && LA27_0<=40)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2965:2: rule__Attribute__CardinalityAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Attribute__CardinalityAssignment_2_in_rule__Attribute__Group__2__Impl6106);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2975:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2979:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2980:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__36137);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__36140);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2987:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__EssentialAssignment_3 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2991:1: ( ( ( rule__Attribute__EssentialAssignment_3 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2992:1: ( ( rule__Attribute__EssentialAssignment_3 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2992:1: ( ( rule__Attribute__EssentialAssignment_3 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2993:1: ( rule__Attribute__EssentialAssignment_3 )?
            {
             before(grammarAccess.getAttributeAccess().getEssentialAssignment_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2994:1: ( rule__Attribute__EssentialAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2994:2: rule__Attribute__EssentialAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Attribute__EssentialAssignment_3_in_rule__Attribute__Group__3__Impl6167);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3004:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3008:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3009:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__46198);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__46201);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3016:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Group_4__0 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3020:1: ( ( ( rule__Attribute__Group_4__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3021:1: ( ( rule__Attribute__Group_4__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3021:1: ( ( rule__Attribute__Group_4__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3022:1: ( rule__Attribute__Group_4__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_4()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3023:1: ( rule__Attribute__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3023:2: rule__Attribute__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl6228);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3033:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3037:1: ( rule__Attribute__Group__5__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3038:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__56259);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3044:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3048:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3049:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3049:1: ( ( rule__Attribute__Group_5__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3050:1: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3051:1: ( rule__Attribute__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==14) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3051:2: rule__Attribute__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_5__0_in_rule__Attribute__Group__5__Impl6286);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3073:1: rule__Attribute__Group_4__0 : rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 ;
    public final void rule__Attribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3077:1: ( rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3078:2: rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__06329);
            rule__Attribute__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__06332);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3085:1: rule__Attribute__Group_4__0__Impl : ( '<' ) ;
    public final void rule__Attribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3089:1: ( ( '<' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3090:1: ( '<' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3090:1: ( '<' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3091:1: '<'
            {
             before(grammarAccess.getAttributeAccess().getLessThanSignKeyword_4_0()); 
            match(input,17,FOLLOW_17_in_rule__Attribute__Group_4__0__Impl6360); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3104:1: rule__Attribute__Group_4__1 : rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 ;
    public final void rule__Attribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3108:1: ( rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3109:2: rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__16391);
            rule__Attribute__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_4__2_in_rule__Attribute__Group_4__16394);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3116:1: rule__Attribute__Group_4__1__Impl : ( ( rule__Attribute__AttribMappingAssignment_4_1 ) ) ;
    public final void rule__Attribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3120:1: ( ( ( rule__Attribute__AttribMappingAssignment_4_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3121:1: ( ( rule__Attribute__AttribMappingAssignment_4_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3121:1: ( ( rule__Attribute__AttribMappingAssignment_4_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3122:1: ( rule__Attribute__AttribMappingAssignment_4_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttribMappingAssignment_4_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3123:1: ( rule__Attribute__AttribMappingAssignment_4_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3123:2: rule__Attribute__AttribMappingAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Attribute__AttribMappingAssignment_4_1_in_rule__Attribute__Group_4__1__Impl6421);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3133:1: rule__Attribute__Group_4__2 : rule__Attribute__Group_4__2__Impl ;
    public final void rule__Attribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3137:1: ( rule__Attribute__Group_4__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3138:2: rule__Attribute__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__2__Impl_in_rule__Attribute__Group_4__26451);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3144:1: rule__Attribute__Group_4__2__Impl : ( '>' ) ;
    public final void rule__Attribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3148:1: ( ( '>' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3149:1: ( '>' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3149:1: ( '>' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3150:1: '>'
            {
             before(grammarAccess.getAttributeAccess().getGreaterThanSignKeyword_4_2()); 
            match(input,18,FOLLOW_18_in_rule__Attribute__Group_4__2__Impl6479); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3169:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3173:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3174:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5__0__Impl_in_rule__Attribute__Group_5__06516);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_5__1_in_rule__Attribute__Group_5__06519);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3181:1: rule__Attribute__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3185:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3186:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3186:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3187:1: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,14,FOLLOW_14_in_rule__Attribute__Group_5__0__Impl6547); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3200:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3204:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3205:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5__1__Impl_in_rule__Attribute__Group_5__16578);
            rule__Attribute__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_5__2_in_rule__Attribute__Group_5__16581);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3212:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__AnnotationAssignment_5_1 )* ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3216:1: ( ( ( rule__Attribute__AnnotationAssignment_5_1 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3217:1: ( ( rule__Attribute__AnnotationAssignment_5_1 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3217:1: ( ( rule__Attribute__AnnotationAssignment_5_1 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3218:1: ( rule__Attribute__AnnotationAssignment_5_1 )*
            {
             before(grammarAccess.getAttributeAccess().getAnnotationAssignment_5_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3219:1: ( rule__Attribute__AnnotationAssignment_5_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ANNOTATION_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3219:2: rule__Attribute__AnnotationAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Attribute__AnnotationAssignment_5_1_in_rule__Attribute__Group_5__1__Impl6608);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3229:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3233:1: ( rule__Attribute__Group_5__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3234:2: rule__Attribute__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5__2__Impl_in_rule__Attribute__Group_5__26639);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3240:1: rule__Attribute__Group_5__2__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3244:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3245:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3245:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3246:1: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,15,FOLLOW_15_in_rule__Attribute__Group_5__2__Impl6667); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3265:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3269:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3270:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__06704);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__06707);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3277:1: rule__Mapping__Group__0__Impl : ( ( rule__Mapping__ContextAssignment_0 )? ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3281:1: ( ( ( rule__Mapping__ContextAssignment_0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3282:1: ( ( rule__Mapping__ContextAssignment_0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3282:1: ( ( rule__Mapping__ContextAssignment_0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3283:1: ( rule__Mapping__ContextAssignment_0 )?
            {
             before(grammarAccess.getMappingAccess().getContextAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3284:1: ( rule__Mapping__ContextAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==33) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3284:2: rule__Mapping__ContextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Mapping__ContextAssignment_0_in_rule__Mapping__Group__0__Impl6734);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3294:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3298:1: ( rule__Mapping__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3299:2: rule__Mapping__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__16765);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3305:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__MappingAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3309:1: ( ( ( rule__Mapping__MappingAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3310:1: ( ( rule__Mapping__MappingAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3310:1: ( ( rule__Mapping__MappingAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3311:1: ( rule__Mapping__MappingAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getMappingAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3312:1: ( rule__Mapping__MappingAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3312:2: rule__Mapping__MappingAssignment_1
            {
            pushFollow(FOLLOW_rule__Mapping__MappingAssignment_1_in_rule__Mapping__Group__1__Impl6792);
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


    // $ANTLR start "rule__ImplicitContextMapping__Group_9__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3326:1: rule__ImplicitContextMapping__Group_9__0 : rule__ImplicitContextMapping__Group_9__0__Impl rule__ImplicitContextMapping__Group_9__1 ;
    public final void rule__ImplicitContextMapping__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3330:1: ( rule__ImplicitContextMapping__Group_9__0__Impl rule__ImplicitContextMapping__Group_9__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3331:2: rule__ImplicitContextMapping__Group_9__0__Impl rule__ImplicitContextMapping__Group_9__1
            {
            pushFollow(FOLLOW_rule__ImplicitContextMapping__Group_9__0__Impl_in_rule__ImplicitContextMapping__Group_9__06826);
            rule__ImplicitContextMapping__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImplicitContextMapping__Group_9__1_in_rule__ImplicitContextMapping__Group_9__06829);
            rule__ImplicitContextMapping__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicitContextMapping__Group_9__0"


    // $ANTLR start "rule__ImplicitContextMapping__Group_9__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3338:1: rule__ImplicitContextMapping__Group_9__0__Impl : ( () ) ;
    public final void rule__ImplicitContextMapping__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3342:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3343:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3343:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3344:1: ()
            {
             before(grammarAccess.getImplicitContextMappingAccess().getDeclaredEntityAction_9_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3345:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3347:1: 
            {
            }

             after(grammarAccess.getImplicitContextMappingAccess().getDeclaredEntityAction_9_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicitContextMapping__Group_9__0__Impl"


    // $ANTLR start "rule__ImplicitContextMapping__Group_9__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3357:1: rule__ImplicitContextMapping__Group_9__1 : rule__ImplicitContextMapping__Group_9__1__Impl ;
    public final void rule__ImplicitContextMapping__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3361:1: ( rule__ImplicitContextMapping__Group_9__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3362:2: rule__ImplicitContextMapping__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__ImplicitContextMapping__Group_9__1__Impl_in_rule__ImplicitContextMapping__Group_9__16887);
            rule__ImplicitContextMapping__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicitContextMapping__Group_9__1"


    // $ANTLR start "rule__ImplicitContextMapping__Group_9__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3368:1: rule__ImplicitContextMapping__Group_9__1__Impl : ( ruleDeclaredEntity ) ;
    public final void rule__ImplicitContextMapping__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3372:1: ( ( ruleDeclaredEntity ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3373:1: ( ruleDeclaredEntity )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3373:1: ( ruleDeclaredEntity )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3374:1: ruleDeclaredEntity
            {
             before(grammarAccess.getImplicitContextMappingAccess().getDeclaredEntityParserRuleCall_9_1()); 
            pushFollow(FOLLOW_ruleDeclaredEntity_in_rule__ImplicitContextMapping__Group_9__1__Impl6914);
            ruleDeclaredEntity();

            state._fsp--;

             after(grammarAccess.getImplicitContextMappingAccess().getDeclaredEntityParserRuleCall_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImplicitContextMapping__Group_9__1__Impl"


    // $ANTLR start "rule__Module__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3389:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3393:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3394:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__06947);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__06950);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3401:1: rule__Module__Group__0__Impl : ( () ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3405:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3406:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3406:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3407:1: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3408:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3410:1: 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3420:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3424:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3425:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__17008);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__17011);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3432:1: rule__Module__Group__1__Impl : ( 'module' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3436:1: ( ( 'module' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3437:1: ( 'module' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3437:1: ( 'module' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3438:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Module__Group__1__Impl7039); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3451:1: rule__Module__Group__2 : rule__Module__Group__2__Impl ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3455:1: ( rule__Module__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3456:2: rule__Module__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__27070);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3462:1: rule__Module__Group__2__Impl : ( ( rule__Module__Group_2__0 )? ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3466:1: ( ( ( rule__Module__Group_2__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3467:1: ( ( rule__Module__Group_2__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3467:1: ( ( rule__Module__Group_2__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3468:1: ( rule__Module__Group_2__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3469:1: ( rule__Module__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==21) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3469:2: rule__Module__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_2__0_in_rule__Module__Group__2__Impl7097);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3485:1: rule__Module__Group_2__0 : rule__Module__Group_2__0__Impl rule__Module__Group_2__1 ;
    public final void rule__Module__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3489:1: ( rule__Module__Group_2__0__Impl rule__Module__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3490:2: rule__Module__Group_2__0__Impl rule__Module__Group_2__1
            {
            pushFollow(FOLLOW_rule__Module__Group_2__0__Impl_in_rule__Module__Group_2__07134);
            rule__Module__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2__1_in_rule__Module__Group_2__07137);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3497:1: rule__Module__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Module__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3501:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3502:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3502:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3503:1: '('
            {
             before(grammarAccess.getModuleAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Module__Group_2__0__Impl7165); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3516:1: rule__Module__Group_2__1 : rule__Module__Group_2__1__Impl rule__Module__Group_2__2 ;
    public final void rule__Module__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3520:1: ( rule__Module__Group_2__1__Impl rule__Module__Group_2__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3521:2: rule__Module__Group_2__1__Impl rule__Module__Group_2__2
            {
            pushFollow(FOLLOW_rule__Module__Group_2__1__Impl_in_rule__Module__Group_2__17196);
            rule__Module__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2__2_in_rule__Module__Group_2__17199);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3528:1: rule__Module__Group_2__1__Impl : ( ( rule__Module__NameAssignment_2_1 ) ) ;
    public final void rule__Module__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3532:1: ( ( ( rule__Module__NameAssignment_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3533:1: ( ( rule__Module__NameAssignment_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3533:1: ( ( rule__Module__NameAssignment_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3534:1: ( rule__Module__NameAssignment_2_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3535:1: ( rule__Module__NameAssignment_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3535:2: rule__Module__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_2_1_in_rule__Module__Group_2__1__Impl7226);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3545:1: rule__Module__Group_2__2 : rule__Module__Group_2__2__Impl ;
    public final void rule__Module__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3549:1: ( rule__Module__Group_2__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3550:2: rule__Module__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_2__2__Impl_in_rule__Module__Group_2__27256);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3556:1: rule__Module__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Module__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3560:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3561:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3561:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3562:1: ')'
            {
             before(grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_2()); 
            match(input,22,FOLLOW_22_in_rule__Module__Group_2__2__Impl7284); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3581:1: rule__ModuleName__Group__0 : rule__ModuleName__Group__0__Impl rule__ModuleName__Group__1 ;
    public final void rule__ModuleName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3585:1: ( rule__ModuleName__Group__0__Impl rule__ModuleName__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3586:2: rule__ModuleName__Group__0__Impl rule__ModuleName__Group__1
            {
            pushFollow(FOLLOW_rule__ModuleName__Group__0__Impl_in_rule__ModuleName__Group__07321);
            rule__ModuleName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleName__Group__1_in_rule__ModuleName__Group__07324);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3593:1: rule__ModuleName__Group__0__Impl : ( () ) ;
    public final void rule__ModuleName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3597:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3598:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3598:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3599:1: ()
            {
             before(grammarAccess.getModuleNameAccess().getModuleNameAction_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3600:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3602:1: 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3612:1: rule__ModuleName__Group__1 : rule__ModuleName__Group__1__Impl ;
    public final void rule__ModuleName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3616:1: ( rule__ModuleName__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3617:2: rule__ModuleName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ModuleName__Group__1__Impl_in_rule__ModuleName__Group__17382);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3623:1: rule__ModuleName__Group__1__Impl : ( 'moduleName' ) ;
    public final void rule__ModuleName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3627:1: ( ( 'moduleName' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3628:1: ( 'moduleName' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3628:1: ( 'moduleName' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3629:1: 'moduleName'
            {
             before(grammarAccess.getModuleNameAccess().getModuleNameKeyword_1()); 
            match(input,23,FOLLOW_23_in_rule__ModuleName__Group__1__Impl7410); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3646:1: rule__UsesModule__Group__0 : rule__UsesModule__Group__0__Impl rule__UsesModule__Group__1 ;
    public final void rule__UsesModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3650:1: ( rule__UsesModule__Group__0__Impl rule__UsesModule__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3651:2: rule__UsesModule__Group__0__Impl rule__UsesModule__Group__1
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__0__Impl_in_rule__UsesModule__Group__07445);
            rule__UsesModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesModule__Group__1_in_rule__UsesModule__Group__07448);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3658:1: rule__UsesModule__Group__0__Impl : ( 'usesModule' ) ;
    public final void rule__UsesModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3662:1: ( ( 'usesModule' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3663:1: ( 'usesModule' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3663:1: ( 'usesModule' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3664:1: 'usesModule'
            {
             before(grammarAccess.getUsesModuleAccess().getUsesModuleKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__UsesModule__Group__0__Impl7476); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3677:1: rule__UsesModule__Group__1 : rule__UsesModule__Group__1__Impl rule__UsesModule__Group__2 ;
    public final void rule__UsesModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3681:1: ( rule__UsesModule__Group__1__Impl rule__UsesModule__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3682:2: rule__UsesModule__Group__1__Impl rule__UsesModule__Group__2
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__1__Impl_in_rule__UsesModule__Group__17507);
            rule__UsesModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesModule__Group__2_in_rule__UsesModule__Group__17510);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3689:1: rule__UsesModule__Group__1__Impl : ( '(' ) ;
    public final void rule__UsesModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3693:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3694:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3694:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3695:1: '('
            {
             before(grammarAccess.getUsesModuleAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__UsesModule__Group__1__Impl7538); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3708:1: rule__UsesModule__Group__2 : rule__UsesModule__Group__2__Impl rule__UsesModule__Group__3 ;
    public final void rule__UsesModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3712:1: ( rule__UsesModule__Group__2__Impl rule__UsesModule__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3713:2: rule__UsesModule__Group__2__Impl rule__UsesModule__Group__3
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__2__Impl_in_rule__UsesModule__Group__27569);
            rule__UsesModule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesModule__Group__3_in_rule__UsesModule__Group__27572);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3720:1: rule__UsesModule__Group__2__Impl : ( ( rule__UsesModule__NameAssignment_2 ) ) ;
    public final void rule__UsesModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3724:1: ( ( ( rule__UsesModule__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3725:1: ( ( rule__UsesModule__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3725:1: ( ( rule__UsesModule__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3726:1: ( rule__UsesModule__NameAssignment_2 )
            {
             before(grammarAccess.getUsesModuleAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3727:1: ( rule__UsesModule__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3727:2: rule__UsesModule__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UsesModule__NameAssignment_2_in_rule__UsesModule__Group__2__Impl7599);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3737:1: rule__UsesModule__Group__3 : rule__UsesModule__Group__3__Impl ;
    public final void rule__UsesModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3741:1: ( rule__UsesModule__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3742:2: rule__UsesModule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__3__Impl_in_rule__UsesModule__Group__37629);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3748:1: rule__UsesModule__Group__3__Impl : ( ')' ) ;
    public final void rule__UsesModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3752:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3753:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3753:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3754:1: ')'
            {
             before(grammarAccess.getUsesModuleAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__UsesModule__Group__3__Impl7657); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3775:1: rule__UsesEntity__Group__0 : rule__UsesEntity__Group__0__Impl rule__UsesEntity__Group__1 ;
    public final void rule__UsesEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3779:1: ( rule__UsesEntity__Group__0__Impl rule__UsesEntity__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3780:2: rule__UsesEntity__Group__0__Impl rule__UsesEntity__Group__1
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__0__Impl_in_rule__UsesEntity__Group__07696);
            rule__UsesEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesEntity__Group__1_in_rule__UsesEntity__Group__07699);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3787:1: rule__UsesEntity__Group__0__Impl : ( 'usesEntity' ) ;
    public final void rule__UsesEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3791:1: ( ( 'usesEntity' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3792:1: ( 'usesEntity' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3792:1: ( 'usesEntity' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3793:1: 'usesEntity'
            {
             before(grammarAccess.getUsesEntityAccess().getUsesEntityKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__UsesEntity__Group__0__Impl7727); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3806:1: rule__UsesEntity__Group__1 : rule__UsesEntity__Group__1__Impl rule__UsesEntity__Group__2 ;
    public final void rule__UsesEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3810:1: ( rule__UsesEntity__Group__1__Impl rule__UsesEntity__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3811:2: rule__UsesEntity__Group__1__Impl rule__UsesEntity__Group__2
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__1__Impl_in_rule__UsesEntity__Group__17758);
            rule__UsesEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesEntity__Group__2_in_rule__UsesEntity__Group__17761);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3818:1: rule__UsesEntity__Group__1__Impl : ( '(' ) ;
    public final void rule__UsesEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3822:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3823:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3823:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3824:1: '('
            {
             before(grammarAccess.getUsesEntityAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__UsesEntity__Group__1__Impl7789); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3837:1: rule__UsesEntity__Group__2 : rule__UsesEntity__Group__2__Impl rule__UsesEntity__Group__3 ;
    public final void rule__UsesEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3841:1: ( rule__UsesEntity__Group__2__Impl rule__UsesEntity__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3842:2: rule__UsesEntity__Group__2__Impl rule__UsesEntity__Group__3
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__2__Impl_in_rule__UsesEntity__Group__27820);
            rule__UsesEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesEntity__Group__3_in_rule__UsesEntity__Group__27823);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3849:1: rule__UsesEntity__Group__2__Impl : ( ( rule__UsesEntity__NameAssignment_2 ) ) ;
    public final void rule__UsesEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3853:1: ( ( ( rule__UsesEntity__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3854:1: ( ( rule__UsesEntity__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3854:1: ( ( rule__UsesEntity__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3855:1: ( rule__UsesEntity__NameAssignment_2 )
            {
             before(grammarAccess.getUsesEntityAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3856:1: ( rule__UsesEntity__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3856:2: rule__UsesEntity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UsesEntity__NameAssignment_2_in_rule__UsesEntity__Group__2__Impl7850);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3866:1: rule__UsesEntity__Group__3 : rule__UsesEntity__Group__3__Impl ;
    public final void rule__UsesEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3870:1: ( rule__UsesEntity__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3871:2: rule__UsesEntity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__3__Impl_in_rule__UsesEntity__Group__37880);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3877:1: rule__UsesEntity__Group__3__Impl : ( ')' ) ;
    public final void rule__UsesEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3881:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3882:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3882:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3883:1: ')'
            {
             before(grammarAccess.getUsesEntityAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__UsesEntity__Group__3__Impl7908); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3904:1: rule__Subroutine__Group__0 : rule__Subroutine__Group__0__Impl rule__Subroutine__Group__1 ;
    public final void rule__Subroutine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3908:1: ( rule__Subroutine__Group__0__Impl rule__Subroutine__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3909:2: rule__Subroutine__Group__0__Impl rule__Subroutine__Group__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__0__Impl_in_rule__Subroutine__Group__07947);
            rule__Subroutine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__1_in_rule__Subroutine__Group__07950);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3916:1: rule__Subroutine__Group__0__Impl : ( 'subroutine' ) ;
    public final void rule__Subroutine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3920:1: ( ( 'subroutine' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3921:1: ( 'subroutine' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3921:1: ( 'subroutine' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3922:1: 'subroutine'
            {
             before(grammarAccess.getSubroutineAccess().getSubroutineKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Subroutine__Group__0__Impl7978); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3935:1: rule__Subroutine__Group__1 : rule__Subroutine__Group__1__Impl rule__Subroutine__Group__2 ;
    public final void rule__Subroutine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3939:1: ( rule__Subroutine__Group__1__Impl rule__Subroutine__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3940:2: rule__Subroutine__Group__1__Impl rule__Subroutine__Group__2
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__1__Impl_in_rule__Subroutine__Group__18009);
            rule__Subroutine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__2_in_rule__Subroutine__Group__18012);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3947:1: rule__Subroutine__Group__1__Impl : ( '(' ) ;
    public final void rule__Subroutine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3951:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3952:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3952:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3953:1: '('
            {
             before(grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Subroutine__Group__1__Impl8040); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3966:1: rule__Subroutine__Group__2 : rule__Subroutine__Group__2__Impl rule__Subroutine__Group__3 ;
    public final void rule__Subroutine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3970:1: ( rule__Subroutine__Group__2__Impl rule__Subroutine__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3971:2: rule__Subroutine__Group__2__Impl rule__Subroutine__Group__3
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__2__Impl_in_rule__Subroutine__Group__28071);
            rule__Subroutine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__3_in_rule__Subroutine__Group__28074);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3978:1: rule__Subroutine__Group__2__Impl : ( ( rule__Subroutine__NameAssignment_2 ) ) ;
    public final void rule__Subroutine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3982:1: ( ( ( rule__Subroutine__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3983:1: ( ( rule__Subroutine__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3983:1: ( ( rule__Subroutine__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3984:1: ( rule__Subroutine__NameAssignment_2 )
            {
             before(grammarAccess.getSubroutineAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3985:1: ( rule__Subroutine__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3985:2: rule__Subroutine__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Subroutine__NameAssignment_2_in_rule__Subroutine__Group__2__Impl8101);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3995:1: rule__Subroutine__Group__3 : rule__Subroutine__Group__3__Impl rule__Subroutine__Group__4 ;
    public final void rule__Subroutine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3999:1: ( rule__Subroutine__Group__3__Impl rule__Subroutine__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4000:2: rule__Subroutine__Group__3__Impl rule__Subroutine__Group__4
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__3__Impl_in_rule__Subroutine__Group__38131);
            rule__Subroutine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__4_in_rule__Subroutine__Group__38134);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4007:1: rule__Subroutine__Group__3__Impl : ( ( rule__Subroutine__Group_3__0 )? ) ;
    public final void rule__Subroutine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4011:1: ( ( ( rule__Subroutine__Group_3__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4012:1: ( ( rule__Subroutine__Group_3__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4012:1: ( ( rule__Subroutine__Group_3__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4013:1: ( rule__Subroutine__Group_3__0 )?
            {
             before(grammarAccess.getSubroutineAccess().getGroup_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4014:1: ( rule__Subroutine__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4014:2: rule__Subroutine__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Subroutine__Group_3__0_in_rule__Subroutine__Group__3__Impl8161);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4024:1: rule__Subroutine__Group__4 : rule__Subroutine__Group__4__Impl ;
    public final void rule__Subroutine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4028:1: ( rule__Subroutine__Group__4__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4029:2: rule__Subroutine__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__4__Impl_in_rule__Subroutine__Group__48192);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4035:1: rule__Subroutine__Group__4__Impl : ( ')' ) ;
    public final void rule__Subroutine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4039:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4040:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4040:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4041:1: ')'
            {
             before(grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__Subroutine__Group__4__Impl8220); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4064:1: rule__Subroutine__Group_3__0 : rule__Subroutine__Group_3__0__Impl rule__Subroutine__Group_3__1 ;
    public final void rule__Subroutine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4068:1: ( rule__Subroutine__Group_3__0__Impl rule__Subroutine__Group_3__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4069:2: rule__Subroutine__Group_3__0__Impl rule__Subroutine__Group_3__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3__0__Impl_in_rule__Subroutine__Group_3__08261);
            rule__Subroutine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group_3__1_in_rule__Subroutine__Group_3__08264);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4076:1: rule__Subroutine__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Subroutine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4080:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4081:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4081:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4082:1: '('
            {
             before(grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Subroutine__Group_3__0__Impl8292); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4095:1: rule__Subroutine__Group_3__1 : rule__Subroutine__Group_3__1__Impl rule__Subroutine__Group_3__2 ;
    public final void rule__Subroutine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4099:1: ( rule__Subroutine__Group_3__1__Impl rule__Subroutine__Group_3__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4100:2: rule__Subroutine__Group_3__1__Impl rule__Subroutine__Group_3__2
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3__1__Impl_in_rule__Subroutine__Group_3__18323);
            rule__Subroutine__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group_3__2_in_rule__Subroutine__Group_3__18326);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4107:1: rule__Subroutine__Group_3__1__Impl : ( ( rule__Subroutine__Group_3_1__0 )? ) ;
    public final void rule__Subroutine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4111:1: ( ( ( rule__Subroutine__Group_3_1__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4112:1: ( ( rule__Subroutine__Group_3_1__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4112:1: ( ( rule__Subroutine__Group_3_1__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4113:1: ( rule__Subroutine__Group_3_1__0 )?
            {
             before(grammarAccess.getSubroutineAccess().getGroup_3_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4114:1: ( rule__Subroutine__Group_3_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=41 && LA35_0<=49)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4114:2: rule__Subroutine__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Subroutine__Group_3_1__0_in_rule__Subroutine__Group_3__1__Impl8353);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4124:1: rule__Subroutine__Group_3__2 : rule__Subroutine__Group_3__2__Impl ;
    public final void rule__Subroutine__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4128:1: ( rule__Subroutine__Group_3__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4129:2: rule__Subroutine__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3__2__Impl_in_rule__Subroutine__Group_3__28384);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4135:1: rule__Subroutine__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Subroutine__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4139:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4140:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4140:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4141:1: ')'
            {
             before(grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_3_2()); 
            match(input,22,FOLLOW_22_in_rule__Subroutine__Group_3__2__Impl8412); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4160:1: rule__Subroutine__Group_3_1__0 : rule__Subroutine__Group_3_1__0__Impl rule__Subroutine__Group_3_1__1 ;
    public final void rule__Subroutine__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4164:1: ( rule__Subroutine__Group_3_1__0__Impl rule__Subroutine__Group_3_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4165:2: rule__Subroutine__Group_3_1__0__Impl rule__Subroutine__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3_1__0__Impl_in_rule__Subroutine__Group_3_1__08449);
            rule__Subroutine__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group_3_1__1_in_rule__Subroutine__Group_3_1__08452);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4172:1: rule__Subroutine__Group_3_1__0__Impl : ( ( rule__Subroutine__ParamsAssignment_3_1_0 ) ) ;
    public final void rule__Subroutine__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4176:1: ( ( ( rule__Subroutine__ParamsAssignment_3_1_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4177:1: ( ( rule__Subroutine__ParamsAssignment_3_1_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4177:1: ( ( rule__Subroutine__ParamsAssignment_3_1_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4178:1: ( rule__Subroutine__ParamsAssignment_3_1_0 )
            {
             before(grammarAccess.getSubroutineAccess().getParamsAssignment_3_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4179:1: ( rule__Subroutine__ParamsAssignment_3_1_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4179:2: rule__Subroutine__ParamsAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Subroutine__ParamsAssignment_3_1_0_in_rule__Subroutine__Group_3_1__0__Impl8479);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4189:1: rule__Subroutine__Group_3_1__1 : rule__Subroutine__Group_3_1__1__Impl ;
    public final void rule__Subroutine__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4193:1: ( rule__Subroutine__Group_3_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4194:2: rule__Subroutine__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3_1__1__Impl_in_rule__Subroutine__Group_3_1__18509);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4200:1: rule__Subroutine__Group_3_1__1__Impl : ( ( rule__Subroutine__Group_3_1_1__0 )* ) ;
    public final void rule__Subroutine__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4204:1: ( ( ( rule__Subroutine__Group_3_1_1__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4205:1: ( ( rule__Subroutine__Group_3_1_1__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4205:1: ( ( rule__Subroutine__Group_3_1_1__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4206:1: ( rule__Subroutine__Group_3_1_1__0 )*
            {
             before(grammarAccess.getSubroutineAccess().getGroup_3_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4207:1: ( rule__Subroutine__Group_3_1_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==27) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4207:2: rule__Subroutine__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Subroutine__Group_3_1_1__0_in_rule__Subroutine__Group_3_1__1__Impl8536);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4221:1: rule__Subroutine__Group_3_1_1__0 : rule__Subroutine__Group_3_1_1__0__Impl rule__Subroutine__Group_3_1_1__1 ;
    public final void rule__Subroutine__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4225:1: ( rule__Subroutine__Group_3_1_1__0__Impl rule__Subroutine__Group_3_1_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4226:2: rule__Subroutine__Group_3_1_1__0__Impl rule__Subroutine__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3_1_1__0__Impl_in_rule__Subroutine__Group_3_1_1__08571);
            rule__Subroutine__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group_3_1_1__1_in_rule__Subroutine__Group_3_1_1__08574);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4233:1: rule__Subroutine__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Subroutine__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4237:1: ( ( ',' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4238:1: ( ',' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4238:1: ( ',' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4239:1: ','
            {
             before(grammarAccess.getSubroutineAccess().getCommaKeyword_3_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__Subroutine__Group_3_1_1__0__Impl8602); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4252:1: rule__Subroutine__Group_3_1_1__1 : rule__Subroutine__Group_3_1_1__1__Impl ;
    public final void rule__Subroutine__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4256:1: ( rule__Subroutine__Group_3_1_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4257:2: rule__Subroutine__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3_1_1__1__Impl_in_rule__Subroutine__Group_3_1_1__18633);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4263:1: rule__Subroutine__Group_3_1_1__1__Impl : ( ( rule__Subroutine__ParamsAssignment_3_1_1_1 ) ) ;
    public final void rule__Subroutine__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4267:1: ( ( ( rule__Subroutine__ParamsAssignment_3_1_1_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4268:1: ( ( rule__Subroutine__ParamsAssignment_3_1_1_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4268:1: ( ( rule__Subroutine__ParamsAssignment_3_1_1_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4269:1: ( rule__Subroutine__ParamsAssignment_3_1_1_1 )
            {
             before(grammarAccess.getSubroutineAccess().getParamsAssignment_3_1_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4270:1: ( rule__Subroutine__ParamsAssignment_3_1_1_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4270:2: rule__Subroutine__ParamsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Subroutine__ParamsAssignment_3_1_1_1_in_rule__Subroutine__Group_3_1_1__1__Impl8660);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4284:1: rule__FormalParam__Group__0 : rule__FormalParam__Group__0__Impl rule__FormalParam__Group__1 ;
    public final void rule__FormalParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4288:1: ( rule__FormalParam__Group__0__Impl rule__FormalParam__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4289:2: rule__FormalParam__Group__0__Impl rule__FormalParam__Group__1
            {
            pushFollow(FOLLOW_rule__FormalParam__Group__0__Impl_in_rule__FormalParam__Group__08694);
            rule__FormalParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormalParam__Group__1_in_rule__FormalParam__Group__08697);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4296:1: rule__FormalParam__Group__0__Impl : ( ( rule__FormalParam__IntentAssignment_0 )? ) ;
    public final void rule__FormalParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4300:1: ( ( ( rule__FormalParam__IntentAssignment_0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4301:1: ( ( rule__FormalParam__IntentAssignment_0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4301:1: ( ( rule__FormalParam__IntentAssignment_0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4302:1: ( rule__FormalParam__IntentAssignment_0 )?
            {
             before(grammarAccess.getFormalParamAccess().getIntentAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4303:1: ( rule__FormalParam__IntentAssignment_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=41 && LA37_0<=43)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4303:2: rule__FormalParam__IntentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FormalParam__IntentAssignment_0_in_rule__FormalParam__Group__0__Impl8724);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4313:1: rule__FormalParam__Group__1 : rule__FormalParam__Group__1__Impl rule__FormalParam__Group__2 ;
    public final void rule__FormalParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4317:1: ( rule__FormalParam__Group__1__Impl rule__FormalParam__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4318:2: rule__FormalParam__Group__1__Impl rule__FormalParam__Group__2
            {
            pushFollow(FOLLOW_rule__FormalParam__Group__1__Impl_in_rule__FormalParam__Group__18755);
            rule__FormalParam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormalParam__Group__2_in_rule__FormalParam__Group__18758);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4325:1: rule__FormalParam__Group__1__Impl : ( ( rule__FormalParam__TypeAssignment_1 ) ) ;
    public final void rule__FormalParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4329:1: ( ( ( rule__FormalParam__TypeAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4330:1: ( ( rule__FormalParam__TypeAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4330:1: ( ( rule__FormalParam__TypeAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4331:1: ( rule__FormalParam__TypeAssignment_1 )
            {
             before(grammarAccess.getFormalParamAccess().getTypeAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4332:1: ( rule__FormalParam__TypeAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4332:2: rule__FormalParam__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__FormalParam__TypeAssignment_1_in_rule__FormalParam__Group__1__Impl8785);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4342:1: rule__FormalParam__Group__2 : rule__FormalParam__Group__2__Impl ;
    public final void rule__FormalParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4346:1: ( rule__FormalParam__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4347:2: rule__FormalParam__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FormalParam__Group__2__Impl_in_rule__FormalParam__Group__28815);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4353:1: rule__FormalParam__Group__2__Impl : ( ( rule__FormalParam__NameAssignment_2 ) ) ;
    public final void rule__FormalParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4357:1: ( ( ( rule__FormalParam__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4358:1: ( ( rule__FormalParam__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4358:1: ( ( rule__FormalParam__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4359:1: ( rule__FormalParam__NameAssignment_2 )
            {
             before(grammarAccess.getFormalParamAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4360:1: ( rule__FormalParam__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4360:2: rule__FormalParam__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__FormalParam__NameAssignment_2_in_rule__FormalParam__Group__2__Impl8842);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4376:1: rule__Type__Group_4__0 : rule__Type__Group_4__0__Impl rule__Type__Group_4__1 ;
    public final void rule__Type__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4380:1: ( rule__Type__Group_4__0__Impl rule__Type__Group_4__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4381:2: rule__Type__Group_4__0__Impl rule__Type__Group_4__1
            {
            pushFollow(FOLLOW_rule__Type__Group_4__0__Impl_in_rule__Type__Group_4__08878);
            rule__Type__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_4__1_in_rule__Type__Group_4__08881);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4388:1: rule__Type__Group_4__0__Impl : ( ( rule__Type__DoubleAssignment_4_0 ) ) ;
    public final void rule__Type__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4392:1: ( ( ( rule__Type__DoubleAssignment_4_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4393:1: ( ( rule__Type__DoubleAssignment_4_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4393:1: ( ( rule__Type__DoubleAssignment_4_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4394:1: ( rule__Type__DoubleAssignment_4_0 )
            {
             before(grammarAccess.getTypeAccess().getDoubleAssignment_4_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4395:1: ( rule__Type__DoubleAssignment_4_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4395:2: rule__Type__DoubleAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Type__DoubleAssignment_4_0_in_rule__Type__Group_4__0__Impl8908);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4405:1: rule__Type__Group_4__1 : rule__Type__Group_4__1__Impl ;
    public final void rule__Type__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4409:1: ( rule__Type__Group_4__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4410:2: rule__Type__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_4__1__Impl_in_rule__Type__Group_4__18938);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4416:1: rule__Type__Group_4__1__Impl : ( ( 'precision' )? ) ;
    public final void rule__Type__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4420:1: ( ( ( 'precision' )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4421:1: ( ( 'precision' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4421:1: ( ( 'precision' )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4422:1: ( 'precision' )?
            {
             before(grammarAccess.getTypeAccess().getPrecisionKeyword_4_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4423:1: ( 'precision' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==28) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4424:2: 'precision'
                    {
                    match(input,28,FOLLOW_28_in_rule__Type__Group_4__1__Impl8967); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4439:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4443:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4444:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_rule__Type__Group_5__0__Impl_in_rule__Type__Group_5__09004);
            rule__Type__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_5__1_in_rule__Type__Group_5__09007);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4451:1: rule__Type__Group_5__0__Impl : ( ( rule__Type__DerivedAssignment_5_0 ) ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4455:1: ( ( ( rule__Type__DerivedAssignment_5_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4456:1: ( ( rule__Type__DerivedAssignment_5_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4456:1: ( ( rule__Type__DerivedAssignment_5_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4457:1: ( rule__Type__DerivedAssignment_5_0 )
            {
             before(grammarAccess.getTypeAccess().getDerivedAssignment_5_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4458:1: ( rule__Type__DerivedAssignment_5_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4458:2: rule__Type__DerivedAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Type__DerivedAssignment_5_0_in_rule__Type__Group_5__0__Impl9034);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4468:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4472:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4473:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
            {
            pushFollow(FOLLOW_rule__Type__Group_5__1__Impl_in_rule__Type__Group_5__19064);
            rule__Type__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_5__2_in_rule__Type__Group_5__19067);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4480:1: rule__Type__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4484:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4485:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4485:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4486:1: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,21,FOLLOW_21_in_rule__Type__Group_5__1__Impl9095); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4499:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl rule__Type__Group_5__3 ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4503:1: ( rule__Type__Group_5__2__Impl rule__Type__Group_5__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4504:2: rule__Type__Group_5__2__Impl rule__Type__Group_5__3
            {
            pushFollow(FOLLOW_rule__Type__Group_5__2__Impl_in_rule__Type__Group_5__29126);
            rule__Type__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_5__3_in_rule__Type__Group_5__29129);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4511:1: rule__Type__Group_5__2__Impl : ( ( rule__Type__DerivedTypeAssignment_5_2 ) ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4515:1: ( ( ( rule__Type__DerivedTypeAssignment_5_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4516:1: ( ( rule__Type__DerivedTypeAssignment_5_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4516:1: ( ( rule__Type__DerivedTypeAssignment_5_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4517:1: ( rule__Type__DerivedTypeAssignment_5_2 )
            {
             before(grammarAccess.getTypeAccess().getDerivedTypeAssignment_5_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4518:1: ( rule__Type__DerivedTypeAssignment_5_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4518:2: rule__Type__DerivedTypeAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Type__DerivedTypeAssignment_5_2_in_rule__Type__Group_5__2__Impl9156);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4528:1: rule__Type__Group_5__3 : rule__Type__Group_5__3__Impl ;
    public final void rule__Type__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4532:1: ( rule__Type__Group_5__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4533:2: rule__Type__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_5__3__Impl_in_rule__Type__Group_5__39186);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4539:1: rule__Type__Group_5__3__Impl : ( ')' ) ;
    public final void rule__Type__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4543:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4544:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4544:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4545:1: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_5_3()); 
            match(input,22,FOLLOW_22_in_rule__Type__Group_5__3__Impl9214); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4566:1: rule__SubroutineName__Group__0 : rule__SubroutineName__Group__0__Impl rule__SubroutineName__Group__1 ;
    public final void rule__SubroutineName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4570:1: ( rule__SubroutineName__Group__0__Impl rule__SubroutineName__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4571:2: rule__SubroutineName__Group__0__Impl rule__SubroutineName__Group__1
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group__0__Impl_in_rule__SubroutineName__Group__09253);
            rule__SubroutineName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubroutineName__Group__1_in_rule__SubroutineName__Group__09256);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4578:1: rule__SubroutineName__Group__0__Impl : ( 'subroutineName' ) ;
    public final void rule__SubroutineName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4582:1: ( ( 'subroutineName' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4583:1: ( 'subroutineName' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4583:1: ( 'subroutineName' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4584:1: 'subroutineName'
            {
             before(grammarAccess.getSubroutineNameAccess().getSubroutineNameKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__SubroutineName__Group__0__Impl9284); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4597:1: rule__SubroutineName__Group__1 : rule__SubroutineName__Group__1__Impl rule__SubroutineName__Group__2 ;
    public final void rule__SubroutineName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4601:1: ( rule__SubroutineName__Group__1__Impl rule__SubroutineName__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4602:2: rule__SubroutineName__Group__1__Impl rule__SubroutineName__Group__2
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group__1__Impl_in_rule__SubroutineName__Group__19315);
            rule__SubroutineName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubroutineName__Group__2_in_rule__SubroutineName__Group__19318);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4609:1: rule__SubroutineName__Group__1__Impl : ( () ) ;
    public final void rule__SubroutineName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4613:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4614:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4614:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4615:1: ()
            {
             before(grammarAccess.getSubroutineNameAccess().getSubroutineNameAction_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4616:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4618:1: 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4628:1: rule__SubroutineName__Group__2 : rule__SubroutineName__Group__2__Impl ;
    public final void rule__SubroutineName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4632:1: ( rule__SubroutineName__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4633:2: rule__SubroutineName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group__2__Impl_in_rule__SubroutineName__Group__29376);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4639:1: rule__SubroutineName__Group__2__Impl : ( ( rule__SubroutineName__Group_2__0 )? ) ;
    public final void rule__SubroutineName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4643:1: ( ( ( rule__SubroutineName__Group_2__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4644:1: ( ( rule__SubroutineName__Group_2__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4644:1: ( ( rule__SubroutineName__Group_2__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4645:1: ( rule__SubroutineName__Group_2__0 )?
            {
             before(grammarAccess.getSubroutineNameAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4646:1: ( rule__SubroutineName__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==21) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4646:2: rule__SubroutineName__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SubroutineName__Group_2__0_in_rule__SubroutineName__Group__2__Impl9403);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4662:1: rule__SubroutineName__Group_2__0 : rule__SubroutineName__Group_2__0__Impl rule__SubroutineName__Group_2__1 ;
    public final void rule__SubroutineName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4666:1: ( rule__SubroutineName__Group_2__0__Impl rule__SubroutineName__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4667:2: rule__SubroutineName__Group_2__0__Impl rule__SubroutineName__Group_2__1
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group_2__0__Impl_in_rule__SubroutineName__Group_2__09440);
            rule__SubroutineName__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubroutineName__Group_2__1_in_rule__SubroutineName__Group_2__09443);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4674:1: rule__SubroutineName__Group_2__0__Impl : ( '(' ) ;
    public final void rule__SubroutineName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4678:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4679:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4679:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4680:1: '('
            {
             before(grammarAccess.getSubroutineNameAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__SubroutineName__Group_2__0__Impl9471); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4693:1: rule__SubroutineName__Group_2__1 : rule__SubroutineName__Group_2__1__Impl rule__SubroutineName__Group_2__2 ;
    public final void rule__SubroutineName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4697:1: ( rule__SubroutineName__Group_2__1__Impl rule__SubroutineName__Group_2__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4698:2: rule__SubroutineName__Group_2__1__Impl rule__SubroutineName__Group_2__2
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group_2__1__Impl_in_rule__SubroutineName__Group_2__19502);
            rule__SubroutineName__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubroutineName__Group_2__2_in_rule__SubroutineName__Group_2__19505);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4705:1: rule__SubroutineName__Group_2__1__Impl : ( ( rule__SubroutineName__NameAssignment_2_1 ) ) ;
    public final void rule__SubroutineName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4709:1: ( ( ( rule__SubroutineName__NameAssignment_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4710:1: ( ( rule__SubroutineName__NameAssignment_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4710:1: ( ( rule__SubroutineName__NameAssignment_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4711:1: ( rule__SubroutineName__NameAssignment_2_1 )
            {
             before(grammarAccess.getSubroutineNameAccess().getNameAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4712:1: ( rule__SubroutineName__NameAssignment_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4712:2: rule__SubroutineName__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SubroutineName__NameAssignment_2_1_in_rule__SubroutineName__Group_2__1__Impl9532);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4722:1: rule__SubroutineName__Group_2__2 : rule__SubroutineName__Group_2__2__Impl ;
    public final void rule__SubroutineName__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4726:1: ( rule__SubroutineName__Group_2__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4727:2: rule__SubroutineName__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group_2__2__Impl_in_rule__SubroutineName__Group_2__29562);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4733:1: rule__SubroutineName__Group_2__2__Impl : ( ')' ) ;
    public final void rule__SubroutineName__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4737:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4738:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4738:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4739:1: ')'
            {
             before(grammarAccess.getSubroutineNameAccess().getRightParenthesisKeyword_2_2()); 
            match(input,22,FOLLOW_22_in_rule__SubroutineName__Group_2__2__Impl9590); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4758:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4762:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4763:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__09627);
            rule__Call__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__09630);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4770:1: rule__Call__Group__0__Impl : ( 'call' ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4774:1: ( ( 'call' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4775:1: ( 'call' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4775:1: ( 'call' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4776:1: 'call'
            {
             before(grammarAccess.getCallAccess().getCallKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Call__Group__0__Impl9658); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4789:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4793:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4794:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__19689);
            rule__Call__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__2_in_rule__Call__Group__19692);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4801:1: rule__Call__Group__1__Impl : ( '(' ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4805:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4806:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4806:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4807:1: '('
            {
             before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__Call__Group__1__Impl9720); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4820:1: rule__Call__Group__2 : rule__Call__Group__2__Impl rule__Call__Group__3 ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4824:1: ( rule__Call__Group__2__Impl rule__Call__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4825:2: rule__Call__Group__2__Impl rule__Call__Group__3
            {
            pushFollow(FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__29751);
            rule__Call__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__3_in_rule__Call__Group__29754);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4832:1: rule__Call__Group__2__Impl : ( ( rule__Call__SubroutineNameAssignment_2 ) ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4836:1: ( ( ( rule__Call__SubroutineNameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4837:1: ( ( rule__Call__SubroutineNameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4837:1: ( ( rule__Call__SubroutineNameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4838:1: ( rule__Call__SubroutineNameAssignment_2 )
            {
             before(grammarAccess.getCallAccess().getSubroutineNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4839:1: ( rule__Call__SubroutineNameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4839:2: rule__Call__SubroutineNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Call__SubroutineNameAssignment_2_in_rule__Call__Group__2__Impl9781);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4849:1: rule__Call__Group__3 : rule__Call__Group__3__Impl rule__Call__Group__4 ;
    public final void rule__Call__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4853:1: ( rule__Call__Group__3__Impl rule__Call__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4854:2: rule__Call__Group__3__Impl rule__Call__Group__4
            {
            pushFollow(FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__39811);
            rule__Call__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__4_in_rule__Call__Group__39814);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4861:1: rule__Call__Group__3__Impl : ( ( rule__Call__Group_3__0 )? ) ;
    public final void rule__Call__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4865:1: ( ( ( rule__Call__Group_3__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4866:1: ( ( rule__Call__Group_3__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4866:1: ( ( rule__Call__Group_3__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4867:1: ( rule__Call__Group_3__0 )?
            {
             before(grammarAccess.getCallAccess().getGroup_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4868:1: ( rule__Call__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==21) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4868:2: rule__Call__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl9841);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4878:1: rule__Call__Group__4 : rule__Call__Group__4__Impl ;
    public final void rule__Call__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4882:1: ( rule__Call__Group__4__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4883:2: rule__Call__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__49872);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4889:1: rule__Call__Group__4__Impl : ( ')' ) ;
    public final void rule__Call__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4893:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4894:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4894:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4895:1: ')'
            {
             before(grammarAccess.getCallAccess().getRightParenthesisKeyword_4()); 
            match(input,22,FOLLOW_22_in_rule__Call__Group__4__Impl9900); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4918:1: rule__Call__Group_3__0 : rule__Call__Group_3__0__Impl rule__Call__Group_3__1 ;
    public final void rule__Call__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4922:1: ( rule__Call__Group_3__0__Impl rule__Call__Group_3__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4923:2: rule__Call__Group_3__0__Impl rule__Call__Group_3__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__09941);
            rule__Call__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__09944);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4930:1: rule__Call__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Call__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4934:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4935:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4935:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4936:1: '('
            {
             before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,21,FOLLOW_21_in_rule__Call__Group_3__0__Impl9972); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4949:1: rule__Call__Group_3__1 : rule__Call__Group_3__1__Impl rule__Call__Group_3__2 ;
    public final void rule__Call__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4953:1: ( rule__Call__Group_3__1__Impl rule__Call__Group_3__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4954:2: rule__Call__Group_3__1__Impl rule__Call__Group_3__2
            {
            pushFollow(FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__110003);
            rule__Call__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3__2_in_rule__Call__Group_3__110006);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4961:1: rule__Call__Group_3__1__Impl : ( ( rule__Call__Group_3_1__0 )? ) ;
    public final void rule__Call__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4965:1: ( ( ( rule__Call__Group_3_1__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4966:1: ( ( rule__Call__Group_3_1__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4966:1: ( ( rule__Call__Group_3_1__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4967:1: ( rule__Call__Group_3_1__0 )?
            {
             before(grammarAccess.getCallAccess().getGroup_3_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4968:1: ( rule__Call__Group_3_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_INT && LA41_0<=RULE_ID)||LA41_0==33||LA41_0==39) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4968:2: rule__Call__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Call__Group_3_1__0_in_rule__Call__Group_3__1__Impl10033);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4978:1: rule__Call__Group_3__2 : rule__Call__Group_3__2__Impl ;
    public final void rule__Call__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4982:1: ( rule__Call__Group_3__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4983:2: rule__Call__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3__2__Impl_in_rule__Call__Group_3__210064);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4989:1: rule__Call__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Call__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4993:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4994:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4994:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4995:1: ')'
            {
             before(grammarAccess.getCallAccess().getRightParenthesisKeyword_3_2()); 
            match(input,22,FOLLOW_22_in_rule__Call__Group_3__2__Impl10092); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5014:1: rule__Call__Group_3_1__0 : rule__Call__Group_3_1__0__Impl rule__Call__Group_3_1__1 ;
    public final void rule__Call__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5018:1: ( rule__Call__Group_3_1__0__Impl rule__Call__Group_3_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5019:2: rule__Call__Group_3_1__0__Impl rule__Call__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1__0__Impl_in_rule__Call__Group_3_1__010129);
            rule__Call__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3_1__1_in_rule__Call__Group_3_1__010132);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5026:1: rule__Call__Group_3_1__0__Impl : ( ( rule__Call__ParamsAssignment_3_1_0 ) ) ;
    public final void rule__Call__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5030:1: ( ( ( rule__Call__ParamsAssignment_3_1_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5031:1: ( ( rule__Call__ParamsAssignment_3_1_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5031:1: ( ( rule__Call__ParamsAssignment_3_1_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5032:1: ( rule__Call__ParamsAssignment_3_1_0 )
            {
             before(grammarAccess.getCallAccess().getParamsAssignment_3_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5033:1: ( rule__Call__ParamsAssignment_3_1_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5033:2: rule__Call__ParamsAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Call__ParamsAssignment_3_1_0_in_rule__Call__Group_3_1__0__Impl10159);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5043:1: rule__Call__Group_3_1__1 : rule__Call__Group_3_1__1__Impl ;
    public final void rule__Call__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5047:1: ( rule__Call__Group_3_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5048:2: rule__Call__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1__1__Impl_in_rule__Call__Group_3_1__110189);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5054:1: rule__Call__Group_3_1__1__Impl : ( ( rule__Call__Group_3_1_1__0 )* ) ;
    public final void rule__Call__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5058:1: ( ( ( rule__Call__Group_3_1_1__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5059:1: ( ( rule__Call__Group_3_1_1__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5059:1: ( ( rule__Call__Group_3_1_1__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5060:1: ( rule__Call__Group_3_1_1__0 )*
            {
             before(grammarAccess.getCallAccess().getGroup_3_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5061:1: ( rule__Call__Group_3_1_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==27) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5061:2: rule__Call__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Call__Group_3_1_1__0_in_rule__Call__Group_3_1__1__Impl10216);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5075:1: rule__Call__Group_3_1_1__0 : rule__Call__Group_3_1_1__0__Impl rule__Call__Group_3_1_1__1 ;
    public final void rule__Call__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5079:1: ( rule__Call__Group_3_1_1__0__Impl rule__Call__Group_3_1_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5080:2: rule__Call__Group_3_1_1__0__Impl rule__Call__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1_1__0__Impl_in_rule__Call__Group_3_1_1__010251);
            rule__Call__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3_1_1__1_in_rule__Call__Group_3_1_1__010254);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5087:1: rule__Call__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Call__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5091:1: ( ( ',' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5092:1: ( ',' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5092:1: ( ',' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5093:1: ','
            {
             before(grammarAccess.getCallAccess().getCommaKeyword_3_1_1_0()); 
            match(input,27,FOLLOW_27_in_rule__Call__Group_3_1_1__0__Impl10282); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5106:1: rule__Call__Group_3_1_1__1 : rule__Call__Group_3_1_1__1__Impl ;
    public final void rule__Call__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5110:1: ( rule__Call__Group_3_1_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5111:2: rule__Call__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1_1__1__Impl_in_rule__Call__Group_3_1_1__110313);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5117:1: rule__Call__Group_3_1_1__1__Impl : ( ( rule__Call__ParamsAssignment_3_1_1_1 ) ) ;
    public final void rule__Call__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5121:1: ( ( ( rule__Call__ParamsAssignment_3_1_1_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5122:1: ( ( rule__Call__ParamsAssignment_3_1_1_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5122:1: ( ( rule__Call__ParamsAssignment_3_1_1_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5123:1: ( rule__Call__ParamsAssignment_3_1_1_1 )
            {
             before(grammarAccess.getCallAccess().getParamsAssignment_3_1_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5124:1: ( rule__Call__ParamsAssignment_3_1_1_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5124:2: rule__Call__ParamsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Call__ParamsAssignment_3_1_1_1_in_rule__Call__Group_3_1_1__1__Impl10340);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5138:1: rule__ActualParam__Group__0 : rule__ActualParam__Group__0__Impl rule__ActualParam__Group__1 ;
    public final void rule__ActualParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5142:1: ( rule__ActualParam__Group__0__Impl rule__ActualParam__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5143:2: rule__ActualParam__Group__0__Impl rule__ActualParam__Group__1
            {
            pushFollow(FOLLOW_rule__ActualParam__Group__0__Impl_in_rule__ActualParam__Group__010374);
            rule__ActualParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParam__Group__1_in_rule__ActualParam__Group__010377);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5150:1: rule__ActualParam__Group__0__Impl : ( ( rule__ActualParam__Group_0__0 )? ) ;
    public final void rule__ActualParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5154:1: ( ( ( rule__ActualParam__Group_0__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5155:1: ( ( rule__ActualParam__Group_0__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5155:1: ( ( rule__ActualParam__Group_0__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5156:1: ( rule__ActualParam__Group_0__0 )?
            {
             before(grammarAccess.getActualParamAccess().getGroup_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5157:1: ( rule__ActualParam__Group_0__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==16||LA43_1==50) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5157:2: rule__ActualParam__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ActualParam__Group_0__0_in_rule__ActualParam__Group__0__Impl10404);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5167:1: rule__ActualParam__Group__1 : rule__ActualParam__Group__1__Impl ;
    public final void rule__ActualParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5171:1: ( rule__ActualParam__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5172:2: rule__ActualParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActualParam__Group__1__Impl_in_rule__ActualParam__Group__110435);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5178:1: rule__ActualParam__Group__1__Impl : ( ( rule__ActualParam__ValueAssignment_1 ) ) ;
    public final void rule__ActualParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5182:1: ( ( ( rule__ActualParam__ValueAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5183:1: ( ( rule__ActualParam__ValueAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5183:1: ( ( rule__ActualParam__ValueAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5184:1: ( rule__ActualParam__ValueAssignment_1 )
            {
             before(grammarAccess.getActualParamAccess().getValueAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5185:1: ( rule__ActualParam__ValueAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5185:2: rule__ActualParam__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__ActualParam__ValueAssignment_1_in_rule__ActualParam__Group__1__Impl10462);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5199:1: rule__ActualParam__Group_0__0 : rule__ActualParam__Group_0__0__Impl rule__ActualParam__Group_0__1 ;
    public final void rule__ActualParam__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5203:1: ( rule__ActualParam__Group_0__0__Impl rule__ActualParam__Group_0__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5204:2: rule__ActualParam__Group_0__0__Impl rule__ActualParam__Group_0__1
            {
            pushFollow(FOLLOW_rule__ActualParam__Group_0__0__Impl_in_rule__ActualParam__Group_0__010496);
            rule__ActualParam__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParam__Group_0__1_in_rule__ActualParam__Group_0__010499);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5211:1: rule__ActualParam__Group_0__0__Impl : ( ( rule__ActualParam__KeywordAssignment_0_0 ) ) ;
    public final void rule__ActualParam__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5215:1: ( ( ( rule__ActualParam__KeywordAssignment_0_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5216:1: ( ( rule__ActualParam__KeywordAssignment_0_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5216:1: ( ( rule__ActualParam__KeywordAssignment_0_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5217:1: ( rule__ActualParam__KeywordAssignment_0_0 )
            {
             before(grammarAccess.getActualParamAccess().getKeywordAssignment_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5218:1: ( rule__ActualParam__KeywordAssignment_0_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5218:2: rule__ActualParam__KeywordAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ActualParam__KeywordAssignment_0_0_in_rule__ActualParam__Group_0__0__Impl10526);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5228:1: rule__ActualParam__Group_0__1 : rule__ActualParam__Group_0__1__Impl rule__ActualParam__Group_0__2 ;
    public final void rule__ActualParam__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5232:1: ( rule__ActualParam__Group_0__1__Impl rule__ActualParam__Group_0__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5233:2: rule__ActualParam__Group_0__1__Impl rule__ActualParam__Group_0__2
            {
            pushFollow(FOLLOW_rule__ActualParam__Group_0__1__Impl_in_rule__ActualParam__Group_0__110556);
            rule__ActualParam__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParam__Group_0__2_in_rule__ActualParam__Group_0__110559);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5240:1: rule__ActualParam__Group_0__1__Impl : ( ( rule__ActualParam__OptionalAssignment_0_1 )? ) ;
    public final void rule__ActualParam__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5244:1: ( ( ( rule__ActualParam__OptionalAssignment_0_1 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5245:1: ( ( rule__ActualParam__OptionalAssignment_0_1 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5245:1: ( ( rule__ActualParam__OptionalAssignment_0_1 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5246:1: ( rule__ActualParam__OptionalAssignment_0_1 )?
            {
             before(grammarAccess.getActualParamAccess().getOptionalAssignment_0_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5247:1: ( rule__ActualParam__OptionalAssignment_0_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==50) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5247:2: rule__ActualParam__OptionalAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__ActualParam__OptionalAssignment_0_1_in_rule__ActualParam__Group_0__1__Impl10586);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5257:1: rule__ActualParam__Group_0__2 : rule__ActualParam__Group_0__2__Impl ;
    public final void rule__ActualParam__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5261:1: ( rule__ActualParam__Group_0__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5262:2: rule__ActualParam__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ActualParam__Group_0__2__Impl_in_rule__ActualParam__Group_0__210617);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5268:1: rule__ActualParam__Group_0__2__Impl : ( '=' ) ;
    public final void rule__ActualParam__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5272:1: ( ( '=' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5273:1: ( '=' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5273:1: ( '=' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5274:1: '='
            {
             before(grammarAccess.getActualParamAccess().getEqualsSignKeyword_0_2()); 
            match(input,16,FOLLOW_16_in_rule__ActualParam__Group_0__2__Impl10645); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5293:1: rule__ActualParamByKeyword__Group__0 : rule__ActualParamByKeyword__Group__0__Impl rule__ActualParamByKeyword__Group__1 ;
    public final void rule__ActualParamByKeyword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5297:1: ( rule__ActualParamByKeyword__Group__0__Impl rule__ActualParamByKeyword__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5298:2: rule__ActualParamByKeyword__Group__0__Impl rule__ActualParamByKeyword__Group__1
            {
            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__0__Impl_in_rule__ActualParamByKeyword__Group__010682);
            rule__ActualParamByKeyword__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__1_in_rule__ActualParamByKeyword__Group__010685);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5305:1: rule__ActualParamByKeyword__Group__0__Impl : ( 'actualParamByKeyword' ) ;
    public final void rule__ActualParamByKeyword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5309:1: ( ( 'actualParamByKeyword' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5310:1: ( 'actualParamByKeyword' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5310:1: ( 'actualParamByKeyword' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5311:1: 'actualParamByKeyword'
            {
             before(grammarAccess.getActualParamByKeywordAccess().getActualParamByKeywordKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__ActualParamByKeyword__Group__0__Impl10713); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5324:1: rule__ActualParamByKeyword__Group__1 : rule__ActualParamByKeyword__Group__1__Impl rule__ActualParamByKeyword__Group__2 ;
    public final void rule__ActualParamByKeyword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5328:1: ( rule__ActualParamByKeyword__Group__1__Impl rule__ActualParamByKeyword__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5329:2: rule__ActualParamByKeyword__Group__1__Impl rule__ActualParamByKeyword__Group__2
            {
            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__1__Impl_in_rule__ActualParamByKeyword__Group__110744);
            rule__ActualParamByKeyword__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__2_in_rule__ActualParamByKeyword__Group__110747);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5336:1: rule__ActualParamByKeyword__Group__1__Impl : ( '(' ) ;
    public final void rule__ActualParamByKeyword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5340:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5341:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5341:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5342:1: '('
            {
             before(grammarAccess.getActualParamByKeywordAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__ActualParamByKeyword__Group__1__Impl10775); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5355:1: rule__ActualParamByKeyword__Group__2 : rule__ActualParamByKeyword__Group__2__Impl rule__ActualParamByKeyword__Group__3 ;
    public final void rule__ActualParamByKeyword__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5359:1: ( rule__ActualParamByKeyword__Group__2__Impl rule__ActualParamByKeyword__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5360:2: rule__ActualParamByKeyword__Group__2__Impl rule__ActualParamByKeyword__Group__3
            {
            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__2__Impl_in_rule__ActualParamByKeyword__Group__210806);
            rule__ActualParamByKeyword__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__3_in_rule__ActualParamByKeyword__Group__210809);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5367:1: rule__ActualParamByKeyword__Group__2__Impl : ( ( rule__ActualParamByKeyword__KeywordAssignment_2 ) ) ;
    public final void rule__ActualParamByKeyword__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5371:1: ( ( ( rule__ActualParamByKeyword__KeywordAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5372:1: ( ( rule__ActualParamByKeyword__KeywordAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5372:1: ( ( rule__ActualParamByKeyword__KeywordAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5373:1: ( rule__ActualParamByKeyword__KeywordAssignment_2 )
            {
             before(grammarAccess.getActualParamByKeywordAccess().getKeywordAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5374:1: ( rule__ActualParamByKeyword__KeywordAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5374:2: rule__ActualParamByKeyword__KeywordAssignment_2
            {
            pushFollow(FOLLOW_rule__ActualParamByKeyword__KeywordAssignment_2_in_rule__ActualParamByKeyword__Group__2__Impl10836);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5384:1: rule__ActualParamByKeyword__Group__3 : rule__ActualParamByKeyword__Group__3__Impl ;
    public final void rule__ActualParamByKeyword__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5388:1: ( rule__ActualParamByKeyword__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5389:2: rule__ActualParamByKeyword__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__3__Impl_in_rule__ActualParamByKeyword__Group__310866);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5395:1: rule__ActualParamByKeyword__Group__3__Impl : ( ')' ) ;
    public final void rule__ActualParamByKeyword__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5399:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5400:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5400:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5401:1: ')'
            {
             before(grammarAccess.getActualParamByKeywordAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__ActualParamByKeyword__Group__3__Impl10894); 
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


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5422:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5426:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5427:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__010933);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__010936);
            rule__VariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5434:1: rule__VariableDeclaration__Group__0__Impl : ( 'declaration' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5438:1: ( ( 'declaration' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5439:1: ( 'declaration' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5439:1: ( 'declaration' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5440:1: 'declaration'
            {
             before(grammarAccess.getVariableDeclarationAccess().getDeclarationKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__VariableDeclaration__Group__0__Impl10964); 
             after(grammarAccess.getVariableDeclarationAccess().getDeclarationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5453:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5457:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5458:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__110995);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__110998);
            rule__VariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5465:1: rule__VariableDeclaration__Group__1__Impl : ( '(' ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5469:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5470:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5470:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5471:1: '('
            {
             before(grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_1()); 
            match(input,21,FOLLOW_21_in_rule__VariableDeclaration__Group__1__Impl11026); 
             after(grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5484:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5488:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5489:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__211057);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__211060);
            rule__VariableDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5496:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5500:1: ( ( ( rule__VariableDeclaration__TypeAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5501:1: ( ( rule__VariableDeclaration__TypeAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5501:1: ( ( rule__VariableDeclaration__TypeAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5502:1: ( rule__VariableDeclaration__TypeAssignment_2 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5503:1: ( rule__VariableDeclaration__TypeAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5503:2: rule__VariableDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__TypeAssignment_2_in_rule__VariableDeclaration__Group__2__Impl11087);
            rule__VariableDeclaration__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5513:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5517:1: ( rule__VariableDeclaration__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5518:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__311117);
            rule__VariableDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5524:1: rule__VariableDeclaration__Group__3__Impl : ( ')' ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5528:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5529:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5529:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5530:1: ')'
            {
             before(grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3()); 
            match(input,22,FOLLOW_22_in_rule__VariableDeclaration__Group__3__Impl11145); 
             after(grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PathExpr__Group__0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5551:1: rule__PathExpr__Group__0 : rule__PathExpr__Group__0__Impl rule__PathExpr__Group__1 ;
    public final void rule__PathExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5555:1: ( rule__PathExpr__Group__0__Impl rule__PathExpr__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5556:2: rule__PathExpr__Group__0__Impl rule__PathExpr__Group__1
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__0__Impl_in_rule__PathExpr__Group__011184);
            rule__PathExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExpr__Group__1_in_rule__PathExpr__Group__011187);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5563:1: rule__PathExpr__Group__0__Impl : ( '#' ) ;
    public final void rule__PathExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5567:1: ( ( '#' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5568:1: ( '#' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5568:1: ( '#' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5569:1: '#'
            {
             before(grammarAccess.getPathExprAccess().getNumberSignKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__PathExpr__Group__0__Impl11215); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5582:1: rule__PathExpr__Group__1 : rule__PathExpr__Group__1__Impl ;
    public final void rule__PathExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5586:1: ( rule__PathExpr__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5587:2: rule__PathExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__1__Impl_in_rule__PathExpr__Group__111246);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5593:1: rule__PathExpr__Group__1__Impl : ( rulePathExprNode ) ;
    public final void rule__PathExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5597:1: ( ( rulePathExprNode ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5598:1: ( rulePathExprNode )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5598:1: ( rulePathExprNode )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5599:1: rulePathExprNode
            {
             before(grammarAccess.getPathExprAccess().getPathExprNodeParserRuleCall_1()); 
            pushFollow(FOLLOW_rulePathExprNode_in_rule__PathExpr__Group__1__Impl11273);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5614:1: rule__PathExprNode__Group__0 : rule__PathExprNode__Group__0__Impl rule__PathExprNode__Group__1 ;
    public final void rule__PathExprNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5618:1: ( rule__PathExprNode__Group__0__Impl rule__PathExprNode__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5619:2: rule__PathExprNode__Group__0__Impl rule__PathExprNode__Group__1
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group__0__Impl_in_rule__PathExprNode__Group__011306);
            rule__PathExprNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExprNode__Group__1_in_rule__PathExprNode__Group__011309);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5626:1: rule__PathExprNode__Group__0__Impl : ( rulePathExprTerm ) ;
    public final void rule__PathExprNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5630:1: ( ( rulePathExprTerm ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5631:1: ( rulePathExprTerm )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5631:1: ( rulePathExprTerm )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5632:1: rulePathExprTerm
            {
             before(grammarAccess.getPathExprNodeAccess().getPathExprTermParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePathExprTerm_in_rule__PathExprNode__Group__0__Impl11336);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5643:1: rule__PathExprNode__Group__1 : rule__PathExprNode__Group__1__Impl ;
    public final void rule__PathExprNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5647:1: ( rule__PathExprNode__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5648:2: rule__PathExprNode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group__1__Impl_in_rule__PathExprNode__Group__111365);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5654:1: rule__PathExprNode__Group__1__Impl : ( ( rule__PathExprNode__Group_1__0 )* ) ;
    public final void rule__PathExprNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5658:1: ( ( ( rule__PathExprNode__Group_1__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5659:1: ( ( rule__PathExprNode__Group_1__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5659:1: ( ( rule__PathExprNode__Group_1__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5660:1: ( rule__PathExprNode__Group_1__0 )*
            {
             before(grammarAccess.getPathExprNodeAccess().getGroup_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5661:1: ( rule__PathExprNode__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==34) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5661:2: rule__PathExprNode__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PathExprNode__Group_1__0_in_rule__PathExprNode__Group__1__Impl11392);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5675:1: rule__PathExprNode__Group_1__0 : rule__PathExprNode__Group_1__0__Impl rule__PathExprNode__Group_1__1 ;
    public final void rule__PathExprNode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5679:1: ( rule__PathExprNode__Group_1__0__Impl rule__PathExprNode__Group_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5680:2: rule__PathExprNode__Group_1__0__Impl rule__PathExprNode__Group_1__1
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group_1__0__Impl_in_rule__PathExprNode__Group_1__011427);
            rule__PathExprNode__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExprNode__Group_1__1_in_rule__PathExprNode__Group_1__011430);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5687:1: rule__PathExprNode__Group_1__0__Impl : ( () ) ;
    public final void rule__PathExprNode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5691:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5692:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5692:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5693:1: ()
            {
             before(grammarAccess.getPathExprNodeAccess().getPathExprHeadAction_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5694:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5696:1: 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5706:1: rule__PathExprNode__Group_1__1 : rule__PathExprNode__Group_1__1__Impl rule__PathExprNode__Group_1__2 ;
    public final void rule__PathExprNode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5710:1: ( rule__PathExprNode__Group_1__1__Impl rule__PathExprNode__Group_1__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5711:2: rule__PathExprNode__Group_1__1__Impl rule__PathExprNode__Group_1__2
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group_1__1__Impl_in_rule__PathExprNode__Group_1__111488);
            rule__PathExprNode__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExprNode__Group_1__2_in_rule__PathExprNode__Group_1__111491);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5718:1: rule__PathExprNode__Group_1__1__Impl : ( '/' ) ;
    public final void rule__PathExprNode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5722:1: ( ( '/' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5723:1: ( '/' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5723:1: ( '/' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5724:1: '/'
            {
             before(grammarAccess.getPathExprNodeAccess().getSolidusKeyword_1_1()); 
            match(input,34,FOLLOW_34_in_rule__PathExprNode__Group_1__1__Impl11519); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5737:1: rule__PathExprNode__Group_1__2 : rule__PathExprNode__Group_1__2__Impl ;
    public final void rule__PathExprNode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5741:1: ( rule__PathExprNode__Group_1__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5742:2: rule__PathExprNode__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group_1__2__Impl_in_rule__PathExprNode__Group_1__211550);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5748:1: rule__PathExprNode__Group_1__2__Impl : ( ( rule__PathExprNode__TailAssignment_1_2 ) ) ;
    public final void rule__PathExprNode__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5752:1: ( ( ( rule__PathExprNode__TailAssignment_1_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5753:1: ( ( rule__PathExprNode__TailAssignment_1_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5753:1: ( ( rule__PathExprNode__TailAssignment_1_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5754:1: ( rule__PathExprNode__TailAssignment_1_2 )
            {
             before(grammarAccess.getPathExprNodeAccess().getTailAssignment_1_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5755:1: ( rule__PathExprNode__TailAssignment_1_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5755:2: rule__PathExprNode__TailAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PathExprNode__TailAssignment_1_2_in_rule__PathExprNode__Group_1__2__Impl11577);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5771:1: rule__PathExprTerm__Group__0 : rule__PathExprTerm__Group__0__Impl rule__PathExprTerm__Group__1 ;
    public final void rule__PathExprTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5775:1: ( rule__PathExprTerm__Group__0__Impl rule__PathExprTerm__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5776:2: rule__PathExprTerm__Group__0__Impl rule__PathExprTerm__Group__1
            {
            pushFollow(FOLLOW_rule__PathExprTerm__Group__0__Impl_in_rule__PathExprTerm__Group__011613);
            rule__PathExprTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExprTerm__Group__1_in_rule__PathExprTerm__Group__011616);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5783:1: rule__PathExprTerm__Group__0__Impl : ( () ) ;
    public final void rule__PathExprTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5787:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5788:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5788:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5789:1: ()
            {
             before(grammarAccess.getPathExprTermAccess().getPathExprTermAction_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5790:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5792:1: 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5802:1: rule__PathExprTerm__Group__1 : rule__PathExprTerm__Group__1__Impl rule__PathExprTerm__Group__2 ;
    public final void rule__PathExprTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5806:1: ( rule__PathExprTerm__Group__1__Impl rule__PathExprTerm__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5807:2: rule__PathExprTerm__Group__1__Impl rule__PathExprTerm__Group__2
            {
            pushFollow(FOLLOW_rule__PathExprTerm__Group__1__Impl_in_rule__PathExprTerm__Group__111674);
            rule__PathExprTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExprTerm__Group__2_in_rule__PathExprTerm__Group__111677);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5814:1: rule__PathExprTerm__Group__1__Impl : ( ( rule__PathExprTerm__AxisAssignment_1 )? ) ;
    public final void rule__PathExprTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5818:1: ( ( ( rule__PathExprTerm__AxisAssignment_1 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5819:1: ( ( rule__PathExprTerm__AxisAssignment_1 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5819:1: ( ( rule__PathExprTerm__AxisAssignment_1 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5820:1: ( rule__PathExprTerm__AxisAssignment_1 )?
            {
             before(grammarAccess.getPathExprTermAccess().getAxisAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5821:1: ( rule__PathExprTerm__AxisAssignment_1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==51) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5821:2: rule__PathExprTerm__AxisAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PathExprTerm__AxisAssignment_1_in_rule__PathExprTerm__Group__1__Impl11704);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5831:1: rule__PathExprTerm__Group__2 : rule__PathExprTerm__Group__2__Impl ;
    public final void rule__PathExprTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5835:1: ( rule__PathExprTerm__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5836:2: rule__PathExprTerm__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PathExprTerm__Group__2__Impl_in_rule__PathExprTerm__Group__211735);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5842:1: rule__PathExprTerm__Group__2__Impl : ( ( rule__PathExprTerm__RefAssignment_2 ) ) ;
    public final void rule__PathExprTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5846:1: ( ( ( rule__PathExprTerm__RefAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5847:1: ( ( rule__PathExprTerm__RefAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5847:1: ( ( rule__PathExprTerm__RefAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5848:1: ( rule__PathExprTerm__RefAssignment_2 )
            {
             before(grammarAccess.getPathExprTermAccess().getRefAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5849:1: ( rule__PathExprTerm__RefAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5849:2: rule__PathExprTerm__RefAssignment_2
            {
            pushFollow(FOLLOW_rule__PathExprTerm__RefAssignment_2_in_rule__PathExprTerm__Group__2__Impl11762);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5866:1: rule__Language__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Language__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5870:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5871:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5871:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5872:1: RULE_ID
            {
             before(grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Language__NameAssignment_111803); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5881:1: rule__Language__UriAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Language__UriAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5885:1: ( ( RULE_STRING ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5886:1: ( RULE_STRING )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5886:1: ( RULE_STRING )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5887:1: RULE_STRING
            {
             before(grammarAccess.getLanguageAccess().getUriSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Language__UriAssignment_211834); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5896:1: rule__Language__ConceptDefAssignment_4 : ( ruleTopConceptDef ) ;
    public final void rule__Language__ConceptDefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5900:1: ( ( ruleTopConceptDef ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5901:1: ( ruleTopConceptDef )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5901:1: ( ruleTopConceptDef )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5902:1: ruleTopConceptDef
            {
             before(grammarAccess.getLanguageAccess().getConceptDefTopConceptDefParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTopConceptDef_in_rule__Language__ConceptDefAssignment_411865);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5911:1: rule__Language__ConceptDefAssignment_5 : ( ruleNamedConceptDef ) ;
    public final void rule__Language__ConceptDefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5915:1: ( ( ruleNamedConceptDef ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5916:1: ( ruleNamedConceptDef )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5916:1: ( ruleNamedConceptDef )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5917:1: ruleNamedConceptDef
            {
             before(grammarAccess.getLanguageAccess().getConceptDefNamedConceptDefParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleNamedConceptDef_in_rule__Language__ConceptDefAssignment_511896);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5926:1: rule__Annotation__KeyAssignment_0 : ( RULE_ANNOTATION_ID ) ;
    public final void rule__Annotation__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5930:1: ( ( RULE_ANNOTATION_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5931:1: ( RULE_ANNOTATION_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5931:1: ( RULE_ANNOTATION_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5932:1: RULE_ANNOTATION_ID
            {
             before(grammarAccess.getAnnotationAccess().getKeyANNOTATION_IDTerminalRuleCall_0_0()); 
            match(input,RULE_ANNOTATION_ID,FOLLOW_RULE_ANNOTATION_ID_in_rule__Annotation__KeyAssignment_011927); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5941:1: rule__Annotation__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5945:1: ( ( RULE_STRING ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5946:1: ( RULE_STRING )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5946:1: ( RULE_STRING )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5947:1: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_1_111958); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5956:1: rule__AnonymousConceptDef__MappingAssignment_1_1 : ( ruleMapping ) ;
    public final void rule__AnonymousConceptDef__MappingAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5960:1: ( ( ruleMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5961:1: ( ruleMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5961:1: ( ruleMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5962:1: ruleMapping
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getMappingMappingParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__AnonymousConceptDef__MappingAssignment_1_111989);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5971:1: rule__AnonymousConceptDef__AnnotationAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__AnonymousConceptDef__AnnotationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5975:1: ( ( ruleAnnotation ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5976:1: ( ruleAnnotation )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5976:1: ( ruleAnnotation )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5977:1: ruleAnnotation
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getAnnotationAnnotationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__AnonymousConceptDef__AnnotationAssignment_2_112020);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5986:1: rule__AnonymousConceptDef__ChildAssignment_2_2 : ( ruleSubconceptOrAttribute ) ;
    public final void rule__AnonymousConceptDef__ChildAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5990:1: ( ( ruleSubconceptOrAttribute ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5991:1: ( ruleSubconceptOrAttribute )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5991:1: ( ruleSubconceptOrAttribute )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5992:1: ruleSubconceptOrAttribute
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_rule__AnonymousConceptDef__ChildAssignment_2_212051);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6001:1: rule__NamedConceptDef__NamedAssignment_0 : ( ( 'concept' ) ) ;
    public final void rule__NamedConceptDef__NamedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6005:1: ( ( ( 'concept' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6006:1: ( ( 'concept' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6006:1: ( ( 'concept' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6007:1: ( 'concept' )
            {
             before(grammarAccess.getNamedConceptDefAccess().getNamedConceptKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6008:1: ( 'concept' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6009:1: 'concept'
            {
             before(grammarAccess.getNamedConceptDefAccess().getNamedConceptKeyword_0_0()); 
            match(input,35,FOLLOW_35_in_rule__NamedConceptDef__NamedAssignment_012087); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6024:1: rule__NamedConceptDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NamedConceptDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6028:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6029:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6029:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6030:1: RULE_ID
            {
             before(grammarAccess.getNamedConceptDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamedConceptDef__NameAssignment_112126); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6039:1: rule__NamedConceptDef__MappingAssignment_2_1 : ( ruleMapping ) ;
    public final void rule__NamedConceptDef__MappingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6043:1: ( ( ruleMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6044:1: ( ruleMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6044:1: ( ruleMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6045:1: ruleMapping
            {
             before(grammarAccess.getNamedConceptDefAccess().getMappingMappingParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__NamedConceptDef__MappingAssignment_2_112157);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6054:1: rule__NamedConceptDef__AnnotationAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__NamedConceptDef__AnnotationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6058:1: ( ( ruleAnnotation ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6059:1: ( ruleAnnotation )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6059:1: ( ruleAnnotation )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6060:1: ruleAnnotation
            {
             before(grammarAccess.getNamedConceptDefAccess().getAnnotationAnnotationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__NamedConceptDef__AnnotationAssignment_3_112188);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6069:1: rule__NamedConceptDef__ChildAssignment_3_2 : ( ruleSubconceptOrAttribute ) ;
    public final void rule__NamedConceptDef__ChildAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6073:1: ( ( ruleSubconceptOrAttribute ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6074:1: ( ruleSubconceptOrAttribute )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6074:1: ( ruleSubconceptOrAttribute )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6075:1: ruleSubconceptOrAttribute
            {
             before(grammarAccess.getNamedConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_rule__NamedConceptDef__ChildAssignment_3_212219);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6084:1: rule__TopConceptDef__TopAssignment_0 : ( ( 'top' ) ) ;
    public final void rule__TopConceptDef__TopAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6088:1: ( ( ( 'top' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6089:1: ( ( 'top' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6089:1: ( ( 'top' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6090:1: ( 'top' )
            {
             before(grammarAccess.getTopConceptDefAccess().getTopTopKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6091:1: ( 'top' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6092:1: 'top'
            {
             before(grammarAccess.getTopConceptDefAccess().getTopTopKeyword_0_0()); 
            match(input,36,FOLLOW_36_in_rule__TopConceptDef__TopAssignment_012255); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6107:1: rule__TopConceptDef__NamedAssignment_1 : ( ( 'concept' ) ) ;
    public final void rule__TopConceptDef__NamedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6111:1: ( ( ( 'concept' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6112:1: ( ( 'concept' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6112:1: ( ( 'concept' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6113:1: ( 'concept' )
            {
             before(grammarAccess.getTopConceptDefAccess().getNamedConceptKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6114:1: ( 'concept' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6115:1: 'concept'
            {
             before(grammarAccess.getTopConceptDefAccess().getNamedConceptKeyword_1_0()); 
            match(input,35,FOLLOW_35_in_rule__TopConceptDef__NamedAssignment_112299); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6130:1: rule__TopConceptDef__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TopConceptDef__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6134:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6135:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6135:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6136:1: RULE_ID
            {
             before(grammarAccess.getTopConceptDefAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TopConceptDef__NameAssignment_212338); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6145:1: rule__TopConceptDef__MappingAssignment_3_1 : ( ruleMapping ) ;
    public final void rule__TopConceptDef__MappingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6149:1: ( ( ruleMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6150:1: ( ruleMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6150:1: ( ruleMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6151:1: ruleMapping
            {
             before(grammarAccess.getTopConceptDefAccess().getMappingMappingParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__TopConceptDef__MappingAssignment_3_112369);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6160:1: rule__TopConceptDef__AnnotationAssignment_4_1 : ( ruleAnnotation ) ;
    public final void rule__TopConceptDef__AnnotationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6164:1: ( ( ruleAnnotation ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6165:1: ( ruleAnnotation )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6165:1: ( ruleAnnotation )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6166:1: ruleAnnotation
            {
             before(grammarAccess.getTopConceptDefAccess().getAnnotationAnnotationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__TopConceptDef__AnnotationAssignment_4_112400);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6175:1: rule__TopConceptDef__ChildAssignment_4_2 : ( ruleSubconceptOrAttribute ) ;
    public final void rule__TopConceptDef__ChildAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6179:1: ( ( ruleSubconceptOrAttribute ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6180:1: ( ruleSubconceptOrAttribute )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6180:1: ( ruleSubconceptOrAttribute )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6181:1: ruleSubconceptOrAttribute
            {
             before(grammarAccess.getTopConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_rule__TopConceptDef__ChildAssignment_4_212431);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6190:1: rule__Subconcept__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Subconcept__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6194:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6195:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6195:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6196:1: RULE_ID
            {
             before(grammarAccess.getSubconceptAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Subconcept__NameAssignment_012462); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6205:1: rule__Subconcept__CardinalityAssignment_1 : ( ruleCardinality ) ;
    public final void rule__Subconcept__CardinalityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6209:1: ( ( ruleCardinality ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6210:1: ( ruleCardinality )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6210:1: ( ruleCardinality )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6211:1: ruleCardinality
            {
             before(grammarAccess.getSubconceptAccess().getCardinalityCardinalityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Subconcept__CardinalityAssignment_112493);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6220:1: rule__Subconcept__EssentialAssignment_2 : ( ( '!' ) ) ;
    public final void rule__Subconcept__EssentialAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6224:1: ( ( ( '!' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6225:1: ( ( '!' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6225:1: ( ( '!' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6226:1: ( '!' )
            {
             before(grammarAccess.getSubconceptAccess().getEssentialExclamationMarkKeyword_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6227:1: ( '!' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6228:1: '!'
            {
             before(grammarAccess.getSubconceptAccess().getEssentialExclamationMarkKeyword_2_0()); 
            match(input,37,FOLLOW_37_in_rule__Subconcept__EssentialAssignment_212529); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6243:1: rule__Subconcept__DefAssignment_3_0_1 : ( ruleNamedConceptDef ) ;
    public final void rule__Subconcept__DefAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6247:1: ( ( ruleNamedConceptDef ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6248:1: ( ruleNamedConceptDef )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6248:1: ( ruleNamedConceptDef )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6249:1: ruleNamedConceptDef
            {
             before(grammarAccess.getSubconceptAccess().getDefNamedConceptDefParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleNamedConceptDef_in_rule__Subconcept__DefAssignment_3_0_112568);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6258:1: rule__Subconcept__DefAssignment_3_1 : ( ruleAnonymousConceptDef ) ;
    public final void rule__Subconcept__DefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6262:1: ( ( ruleAnonymousConceptDef ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6263:1: ( ruleAnonymousConceptDef )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6263:1: ( ruleAnonymousConceptDef )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6264:1: ruleAnonymousConceptDef
            {
             before(grammarAccess.getSubconceptAccess().getDefAnonymousConceptDefParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAnonymousConceptDef_in_rule__Subconcept__DefAssignment_3_112599);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6273:1: rule__Subconcept__ReferenceAssignment_3_2_0 : ( ( ':' ) ) ;
    public final void rule__Subconcept__ReferenceAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6277:1: ( ( ( ':' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6278:1: ( ( ':' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6278:1: ( ( ':' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6279:1: ( ':' )
            {
             before(grammarAccess.getSubconceptAccess().getReferenceColonKeyword_3_2_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6280:1: ( ':' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6281:1: ':'
            {
             before(grammarAccess.getSubconceptAccess().getReferenceColonKeyword_3_2_0_0()); 
            match(input,19,FOLLOW_19_in_rule__Subconcept__ReferenceAssignment_3_2_012635); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6296:1: rule__Subconcept__RefAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Subconcept__RefAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6300:1: ( ( ( RULE_ID ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6301:1: ( ( RULE_ID ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6301:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6302:1: ( RULE_ID )
            {
             before(grammarAccess.getSubconceptAccess().getRefConceptDefCrossReference_3_2_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6303:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6304:1: RULE_ID
            {
             before(grammarAccess.getSubconceptAccess().getRefConceptDefIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Subconcept__RefAssignment_3_2_112678); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6315:1: rule__Attribute__AttribAssignment_0 : ( ( 'attrib' ) ) ;
    public final void rule__Attribute__AttribAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6319:1: ( ( ( 'attrib' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6320:1: ( ( 'attrib' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6320:1: ( ( 'attrib' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6321:1: ( 'attrib' )
            {
             before(grammarAccess.getAttributeAccess().getAttribAttribKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6322:1: ( 'attrib' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6323:1: 'attrib'
            {
             before(grammarAccess.getAttributeAccess().getAttribAttribKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__Attribute__AttribAssignment_012718); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6338:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6342:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6343:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6343:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6344:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_112757); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6353:1: rule__Attribute__CardinalityAssignment_2 : ( ruleCardinality ) ;
    public final void rule__Attribute__CardinalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6357:1: ( ( ruleCardinality ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6358:1: ( ruleCardinality )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6358:1: ( ruleCardinality )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6359:1: ruleCardinality
            {
             before(grammarAccess.getAttributeAccess().getCardinalityCardinalityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Attribute__CardinalityAssignment_212788);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6368:1: rule__Attribute__EssentialAssignment_3 : ( ( '!' ) ) ;
    public final void rule__Attribute__EssentialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6372:1: ( ( ( '!' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6373:1: ( ( '!' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6373:1: ( ( '!' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6374:1: ( '!' )
            {
             before(grammarAccess.getAttributeAccess().getEssentialExclamationMarkKeyword_3_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6375:1: ( '!' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6376:1: '!'
            {
             before(grammarAccess.getAttributeAccess().getEssentialExclamationMarkKeyword_3_0()); 
            match(input,37,FOLLOW_37_in_rule__Attribute__EssentialAssignment_312824); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6391:1: rule__Attribute__AttribMappingAssignment_4_1 : ( ruleMapping ) ;
    public final void rule__Attribute__AttribMappingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6395:1: ( ( ruleMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6396:1: ( ruleMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6396:1: ( ruleMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6397:1: ruleMapping
            {
             before(grammarAccess.getAttributeAccess().getAttribMappingMappingParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__Attribute__AttribMappingAssignment_4_112863);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6406:1: rule__Attribute__AnnotationAssignment_5_1 : ( ruleAnnotation ) ;
    public final void rule__Attribute__AnnotationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6410:1: ( ( ruleAnnotation ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6411:1: ( ruleAnnotation )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6411:1: ( ruleAnnotation )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6412:1: ruleAnnotation
            {
             before(grammarAccess.getAttributeAccess().getAnnotationAnnotationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Attribute__AnnotationAssignment_5_112894);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6421:1: rule__Cardinality__ZeroOrMoreAssignment_0 : ( ( '*' ) ) ;
    public final void rule__Cardinality__ZeroOrMoreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6425:1: ( ( ( '*' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6426:1: ( ( '*' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6426:1: ( ( '*' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6427:1: ( '*' )
            {
             before(grammarAccess.getCardinalityAccess().getZeroOrMoreAsteriskKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6428:1: ( '*' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6429:1: '*'
            {
             before(grammarAccess.getCardinalityAccess().getZeroOrMoreAsteriskKeyword_0_0()); 
            match(input,39,FOLLOW_39_in_rule__Cardinality__ZeroOrMoreAssignment_012930); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6444:1: rule__Cardinality__OneOrMoreAssignment_1 : ( ( '+' ) ) ;
    public final void rule__Cardinality__OneOrMoreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6448:1: ( ( ( '+' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6449:1: ( ( '+' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6449:1: ( ( '+' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6450:1: ( '+' )
            {
             before(grammarAccess.getCardinalityAccess().getOneOrMorePlusSignKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6451:1: ( '+' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6452:1: '+'
            {
             before(grammarAccess.getCardinalityAccess().getOneOrMorePlusSignKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__Cardinality__OneOrMoreAssignment_112974); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6467:1: rule__Mapping__ContextAssignment_0 : ( rulePathExpr ) ;
    public final void rule__Mapping__ContextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6471:1: ( ( rulePathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6472:1: ( rulePathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6472:1: ( rulePathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6473:1: rulePathExpr
            {
             before(grammarAccess.getMappingAccess().getContextPathExprParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePathExpr_in_rule__Mapping__ContextAssignment_013013);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6482:1: rule__Mapping__MappingAssignment_1 : ( ruleImplicitContextMapping ) ;
    public final void rule__Mapping__MappingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6486:1: ( ( ruleImplicitContextMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6487:1: ( ruleImplicitContextMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6487:1: ( ruleImplicitContextMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6488:1: ruleImplicitContextMapping
            {
             before(grammarAccess.getMappingAccess().getMappingImplicitContextMappingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_rule__Mapping__MappingAssignment_113044);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6497:1: rule__Module__NameAssignment_2_1 : ( ruleExpr ) ;
    public final void rule__Module__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6501:1: ( ( ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6502:1: ( ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6502:1: ( ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6503:1: ruleExpr
            {
             before(grammarAccess.getModuleAccess().getNameExprParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Module__NameAssignment_2_113075);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getNameExprParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6512:1: rule__UsesModule__NameAssignment_2 : ( ruleExpr ) ;
    public final void rule__UsesModule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6516:1: ( ( ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6517:1: ( ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6517:1: ( ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6518:1: ruleExpr
            {
             before(grammarAccess.getUsesModuleAccess().getNameExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__UsesModule__NameAssignment_213106);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getUsesModuleAccess().getNameExprParserRuleCall_2_0()); 

            }


            }

        }
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6527:1: rule__UsesEntity__NameAssignment_2 : ( ruleExpr ) ;
    public final void rule__UsesEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6531:1: ( ( ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6532:1: ( ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6532:1: ( ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6533:1: ruleExpr
            {
             before(grammarAccess.getUsesEntityAccess().getNameExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__UsesEntity__NameAssignment_213137);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getUsesEntityAccess().getNameExprParserRuleCall_2_0()); 

            }


            }

        }
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6542:1: rule__Subroutine__NameAssignment_2 : ( ruleExpr ) ;
    public final void rule__Subroutine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6546:1: ( ( ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6547:1: ( ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6547:1: ( ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6548:1: ruleExpr
            {
             before(grammarAccess.getSubroutineAccess().getNameExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Subroutine__NameAssignment_213168);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getSubroutineAccess().getNameExprParserRuleCall_2_0()); 

            }


            }

        }
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6557:1: rule__Subroutine__ParamsAssignment_3_1_0 : ( ruleFormalParam ) ;
    public final void rule__Subroutine__ParamsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6561:1: ( ( ruleFormalParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6562:1: ( ruleFormalParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6562:1: ( ruleFormalParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6563:1: ruleFormalParam
            {
             before(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleFormalParam_in_rule__Subroutine__ParamsAssignment_3_1_013199);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6572:1: rule__Subroutine__ParamsAssignment_3_1_1_1 : ( ruleFormalParam ) ;
    public final void rule__Subroutine__ParamsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6576:1: ( ( ruleFormalParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6577:1: ( ruleFormalParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6577:1: ( ruleFormalParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6578:1: ruleFormalParam
            {
             before(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_ruleFormalParam_in_rule__Subroutine__ParamsAssignment_3_1_1_113230);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6587:1: rule__FormalParam__IntentAssignment_0 : ( ruleIntent ) ;
    public final void rule__FormalParam__IntentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6591:1: ( ( ruleIntent ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6592:1: ( ruleIntent )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6592:1: ( ruleIntent )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6593:1: ruleIntent
            {
             before(grammarAccess.getFormalParamAccess().getIntentIntentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIntent_in_rule__FormalParam__IntentAssignment_013261);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6602:1: rule__FormalParam__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__FormalParam__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6606:1: ( ( ruleType ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6607:1: ( ruleType )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6607:1: ( ruleType )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6608:1: ruleType
            {
             before(grammarAccess.getFormalParamAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__FormalParam__TypeAssignment_113292);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6617:1: rule__FormalParam__NameAssignment_2 : ( ruleExpr ) ;
    public final void rule__FormalParam__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6621:1: ( ( ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6622:1: ( ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6622:1: ( ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6623:1: ruleExpr
            {
             before(grammarAccess.getFormalParamAccess().getNameExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__FormalParam__NameAssignment_213323);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getFormalParamAccess().getNameExprParserRuleCall_2_0()); 

            }


            }

        }
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6632:1: rule__Intent__InAssignment_0 : ( ( 'in' ) ) ;
    public final void rule__Intent__InAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6636:1: ( ( ( 'in' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6637:1: ( ( 'in' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6637:1: ( ( 'in' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6638:1: ( 'in' )
            {
             before(grammarAccess.getIntentAccess().getInInKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6639:1: ( 'in' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6640:1: 'in'
            {
             before(grammarAccess.getIntentAccess().getInInKeyword_0_0()); 
            match(input,41,FOLLOW_41_in_rule__Intent__InAssignment_013359); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6655:1: rule__Intent__OutAssignment_1 : ( ( 'out' ) ) ;
    public final void rule__Intent__OutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6659:1: ( ( ( 'out' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6660:1: ( ( 'out' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6660:1: ( ( 'out' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6661:1: ( 'out' )
            {
             before(grammarAccess.getIntentAccess().getOutOutKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6662:1: ( 'out' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6663:1: 'out'
            {
             before(grammarAccess.getIntentAccess().getOutOutKeyword_1_0()); 
            match(input,42,FOLLOW_42_in_rule__Intent__OutAssignment_113403); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6678:1: rule__Intent__InoutAssignment_2 : ( ( 'inout' ) ) ;
    public final void rule__Intent__InoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6682:1: ( ( ( 'inout' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6683:1: ( ( 'inout' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6683:1: ( ( 'inout' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6684:1: ( 'inout' )
            {
             before(grammarAccess.getIntentAccess().getInoutInoutKeyword_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6685:1: ( 'inout' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6686:1: 'inout'
            {
             before(grammarAccess.getIntentAccess().getInoutInoutKeyword_2_0()); 
            match(input,43,FOLLOW_43_in_rule__Intent__InoutAssignment_213447); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6701:1: rule__Type__IntegerAssignment_0 : ( ( 'integer' ) ) ;
    public final void rule__Type__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6705:1: ( ( ( 'integer' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6706:1: ( ( 'integer' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6706:1: ( ( 'integer' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6707:1: ( 'integer' )
            {
             before(grammarAccess.getTypeAccess().getIntegerIntegerKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6708:1: ( 'integer' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6709:1: 'integer'
            {
             before(grammarAccess.getTypeAccess().getIntegerIntegerKeyword_0_0()); 
            match(input,44,FOLLOW_44_in_rule__Type__IntegerAssignment_013491); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6724:1: rule__Type__CharacterAssignment_1 : ( ( 'character' ) ) ;
    public final void rule__Type__CharacterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6728:1: ( ( ( 'character' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6729:1: ( ( 'character' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6729:1: ( ( 'character' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6730:1: ( 'character' )
            {
             before(grammarAccess.getTypeAccess().getCharacterCharacterKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6731:1: ( 'character' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6732:1: 'character'
            {
             before(grammarAccess.getTypeAccess().getCharacterCharacterKeyword_1_0()); 
            match(input,45,FOLLOW_45_in_rule__Type__CharacterAssignment_113535); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6747:1: rule__Type__LogicalAssignment_2 : ( ( 'logical' ) ) ;
    public final void rule__Type__LogicalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6751:1: ( ( ( 'logical' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6752:1: ( ( 'logical' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6752:1: ( ( 'logical' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6753:1: ( 'logical' )
            {
             before(grammarAccess.getTypeAccess().getLogicalLogicalKeyword_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6754:1: ( 'logical' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6755:1: 'logical'
            {
             before(grammarAccess.getTypeAccess().getLogicalLogicalKeyword_2_0()); 
            match(input,46,FOLLOW_46_in_rule__Type__LogicalAssignment_213579); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6770:1: rule__Type__RealAssignment_3 : ( ( 'real' ) ) ;
    public final void rule__Type__RealAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6774:1: ( ( ( 'real' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6775:1: ( ( 'real' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6775:1: ( ( 'real' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6776:1: ( 'real' )
            {
             before(grammarAccess.getTypeAccess().getRealRealKeyword_3_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6777:1: ( 'real' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6778:1: 'real'
            {
             before(grammarAccess.getTypeAccess().getRealRealKeyword_3_0()); 
            match(input,47,FOLLOW_47_in_rule__Type__RealAssignment_313623); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6793:1: rule__Type__DoubleAssignment_4_0 : ( ( 'double' ) ) ;
    public final void rule__Type__DoubleAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6797:1: ( ( ( 'double' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6798:1: ( ( 'double' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6798:1: ( ( 'double' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6799:1: ( 'double' )
            {
             before(grammarAccess.getTypeAccess().getDoubleDoubleKeyword_4_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6800:1: ( 'double' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6801:1: 'double'
            {
             before(grammarAccess.getTypeAccess().getDoubleDoubleKeyword_4_0_0()); 
            match(input,48,FOLLOW_48_in_rule__Type__DoubleAssignment_4_013667); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6816:1: rule__Type__DerivedAssignment_5_0 : ( ( 'type' ) ) ;
    public final void rule__Type__DerivedAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6820:1: ( ( ( 'type' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6821:1: ( ( 'type' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6821:1: ( ( 'type' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6822:1: ( 'type' )
            {
             before(grammarAccess.getTypeAccess().getDerivedTypeKeyword_5_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6823:1: ( 'type' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6824:1: 'type'
            {
             before(grammarAccess.getTypeAccess().getDerivedTypeKeyword_5_0_0()); 
            match(input,49,FOLLOW_49_in_rule__Type__DerivedAssignment_5_013711); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6839:1: rule__Type__DerivedTypeAssignment_5_2 : ( ruleExpr ) ;
    public final void rule__Type__DerivedTypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6843:1: ( ( ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6844:1: ( ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6844:1: ( ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6845:1: ruleExpr
            {
             before(grammarAccess.getTypeAccess().getDerivedTypeExprParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Type__DerivedTypeAssignment_5_213750);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getDerivedTypeExprParserRuleCall_5_2_0()); 

            }


            }

        }
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6854:1: rule__SubroutineName__NameAssignment_2_1 : ( ruleExpr ) ;
    public final void rule__SubroutineName__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6858:1: ( ( ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6859:1: ( ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6859:1: ( ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6860:1: ruleExpr
            {
             before(grammarAccess.getSubroutineNameAccess().getNameExprParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__SubroutineName__NameAssignment_2_113781);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getSubroutineNameAccess().getNameExprParserRuleCall_2_1_0()); 

            }


            }

        }
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6869:1: rule__Call__SubroutineNameAssignment_2 : ( ruleExpr ) ;
    public final void rule__Call__SubroutineNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6873:1: ( ( ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6874:1: ( ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6874:1: ( ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6875:1: ruleExpr
            {
             before(grammarAccess.getCallAccess().getSubroutineNameExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__Call__SubroutineNameAssignment_213812);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getCallAccess().getSubroutineNameExprParserRuleCall_2_0()); 

            }


            }

        }
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6884:1: rule__Call__ParamsAssignment_3_1_0 : ( ruleActualParam ) ;
    public final void rule__Call__ParamsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6888:1: ( ( ruleActualParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6889:1: ( ruleActualParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6889:1: ( ruleActualParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6890:1: ruleActualParam
            {
             before(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_013843);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6899:1: rule__Call__ParamsAssignment_3_1_1_1 : ( ruleActualParam ) ;
    public final void rule__Call__ParamsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6903:1: ( ( ruleActualParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6904:1: ( ruleActualParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6904:1: ( ruleActualParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6905:1: ruleActualParam
            {
             before(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_1_113874);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6914:1: rule__ActualParam__KeywordAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__ActualParam__KeywordAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6918:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6919:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6919:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6920:1: RULE_ID
            {
             before(grammarAccess.getActualParamAccess().getKeywordIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActualParam__KeywordAssignment_0_013905); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6929:1: rule__ActualParam__OptionalAssignment_0_1 : ( ( '?' ) ) ;
    public final void rule__ActualParam__OptionalAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6933:1: ( ( ( '?' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6934:1: ( ( '?' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6934:1: ( ( '?' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6935:1: ( '?' )
            {
             before(grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6936:1: ( '?' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6937:1: '?'
            {
             before(grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0()); 
            match(input,50,FOLLOW_50_in_rule__ActualParam__OptionalAssignment_0_113941); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6952:1: rule__ActualParam__ValueAssignment_1 : ( ruleExpr ) ;
    public final void rule__ActualParam__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6956:1: ( ( ruleExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6957:1: ( ruleExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6957:1: ( ruleExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6958:1: ruleExpr
            {
             before(grammarAccess.getActualParamAccess().getValueExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpr_in_rule__ActualParam__ValueAssignment_113980);
            ruleExpr();

            state._fsp--;

             after(grammarAccess.getActualParamAccess().getValueExprParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6967:1: rule__ActualParamByKeyword__KeywordAssignment_2 : ( RULE_ID ) ;
    public final void rule__ActualParamByKeyword__KeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6971:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6972:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6972:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6973:1: RULE_ID
            {
             before(grammarAccess.getActualParamByKeywordAccess().getKeywordIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActualParamByKeyword__KeywordAssignment_214011); 
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


    // $ANTLR start "rule__VariableDeclaration__TypeAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6982:1: rule__VariableDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6986:1: ( ( ruleType ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6987:1: ( ruleType )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6987:1: ( ruleType )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6988:1: ruleType
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_214042);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__TypeAssignment_2"


    // $ANTLR start "rule__LocalExpression__IdAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6997:1: rule__LocalExpression__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__LocalExpression__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7001:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7002:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7002:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7003:1: RULE_ID
            {
             before(grammarAccess.getLocalExpressionAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LocalExpression__IdAssignment_014073); 
             after(grammarAccess.getLocalExpressionAccess().getIdIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalExpression__IdAssignment_0"


    // $ANTLR start "rule__LocalExpression__LiteralAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7012:1: rule__LocalExpression__LiteralAssignment_1 : ( ruleLiteral ) ;
    public final void rule__LocalExpression__LiteralAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7016:1: ( ( ruleLiteral ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7017:1: ( ruleLiteral )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7017:1: ( ruleLiteral )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7018:1: ruleLiteral
            {
             before(grammarAccess.getLocalExpressionAccess().getLiteralLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__LocalExpression__LiteralAssignment_114104);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLocalExpressionAccess().getLiteralLiteralParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalExpression__LiteralAssignment_1"


    // $ANTLR start "rule__Expr__WildcardAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7027:1: rule__Expr__WildcardAssignment_0 : ( ( '*' ) ) ;
    public final void rule__Expr__WildcardAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7031:1: ( ( ( '*' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7032:1: ( ( '*' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7032:1: ( ( '*' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7033:1: ( '*' )
            {
             before(grammarAccess.getExprAccess().getWildcardAsteriskKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7034:1: ( '*' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7035:1: '*'
            {
             before(grammarAccess.getExprAccess().getWildcardAsteriskKeyword_0_0()); 
            match(input,39,FOLLOW_39_in_rule__Expr__WildcardAssignment_014140); 
             after(grammarAccess.getExprAccess().getWildcardAsteriskKeyword_0_0()); 

            }

             after(grammarAccess.getExprAccess().getWildcardAsteriskKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__WildcardAssignment_0"


    // $ANTLR start "rule__Expr__ExprAssignment_1"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7050:1: rule__Expr__ExprAssignment_1 : ( ruleLocalExpression ) ;
    public final void rule__Expr__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7054:1: ( ( ruleLocalExpression ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7055:1: ( ruleLocalExpression )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7055:1: ( ruleLocalExpression )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7056:1: ruleLocalExpression
            {
             before(grammarAccess.getExprAccess().getExprLocalExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLocalExpression_in_rule__Expr__ExprAssignment_114179);
            ruleLocalExpression();

            state._fsp--;

             after(grammarAccess.getExprAccess().getExprLocalExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__ExprAssignment_1"


    // $ANTLR start "rule__Expr__PathExprAssignment_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7065:1: rule__Expr__PathExprAssignment_2 : ( rulePathExpr ) ;
    public final void rule__Expr__PathExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7069:1: ( ( rulePathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7070:1: ( rulePathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7070:1: ( rulePathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7071:1: rulePathExpr
            {
             before(grammarAccess.getExprAccess().getPathExprPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePathExpr_in_rule__Expr__PathExprAssignment_214210);
            rulePathExpr();

            state._fsp--;

             after(grammarAccess.getExprAccess().getPathExprPathExprParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__PathExprAssignment_2"


    // $ANTLR start "rule__PathExprNode__TailAssignment_1_2"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7080:1: rule__PathExprNode__TailAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__PathExprNode__TailAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7084:1: ( ( ( RULE_ID ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7085:1: ( ( RULE_ID ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7085:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7086:1: ( RULE_ID )
            {
             before(grammarAccess.getPathExprNodeAccess().getTailSubconceptOrAttributeCrossReference_1_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7087:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7088:1: RULE_ID
            {
             before(grammarAccess.getPathExprNodeAccess().getTailSubconceptOrAttributeIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathExprNode__TailAssignment_1_214245); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7099:1: rule__PathExprTerm__AxisAssignment_1 : ( ruleAxis ) ;
    public final void rule__PathExprTerm__AxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7103:1: ( ( ruleAxis ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7104:1: ( ruleAxis )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7104:1: ( ruleAxis )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7105:1: ruleAxis
            {
             before(grammarAccess.getPathExprTermAccess().getAxisAxisParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAxis_in_rule__PathExprTerm__AxisAssignment_114280);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7114:1: rule__PathExprTerm__RefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PathExprTerm__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7118:1: ( ( ( RULE_ID ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7119:1: ( ( RULE_ID ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7119:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7120:1: ( RULE_ID )
            {
             before(grammarAccess.getPathExprTermAccess().getRefSubconceptOrAttributeCrossReference_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7121:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7122:1: RULE_ID
            {
             before(grammarAccess.getPathExprTermAccess().getRefSubconceptOrAttributeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathExprTerm__RefAssignment_214315); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7133:1: rule__Axis__AncestorAssignment : ( ( '^' ) ) ;
    public final void rule__Axis__AncestorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7137:1: ( ( ( '^' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7138:1: ( ( '^' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7138:1: ( ( '^' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7139:1: ( '^' )
            {
             before(grammarAccess.getAxisAccess().getAncestorCircumflexAccentKeyword_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7140:1: ( '^' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7141:1: '^'
            {
             before(grammarAccess.getAxisAccess().getAncestorCircumflexAccentKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__Axis__AncestorAssignment14355); 
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
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0_in_ruleVariableDeclaration1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredEntity_in_entryRuleDeclaredEntity1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredEntity1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleDeclaredEntity1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalExpression_in_entryRuleLocalExpression1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalExpression1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalExpression__Alternatives_in_ruleLocalExpression1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Alternatives_in_ruleExpr1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_entryRulePathExpr1743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExpr1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__0_in_rulePathExpr1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExprNode_in_entryRulePathExprNode1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExprNode1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group__0_in_rulePathExprNode1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExprTerm_in_entryRulePathExprTerm1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExprTerm1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__0_in_rulePathExprTerm1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxis_in_entryRuleAxis1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAxis1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Axis__AncestorAssignment_in_ruleAxis1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconcept_in_rule__SubconceptOrAttribute__Alternatives1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__SubconceptOrAttribute__Alternatives2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_0__0_in_rule__Subconcept__Alternatives_32041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__DefAssignment_3_1_in_rule__Subconcept__Alternatives_32059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_2__0_in_rule__Subconcept__Alternatives_32077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__ZeroOrMoreAssignment_0_in_rule__Cardinality__Alternatives2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__OneOrMoreAssignment_1_in_rule__Cardinality__Alternatives2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__ImplicitContextMapping__Alternatives2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleName_in_rule__ImplicitContextMapping__Alternatives2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesModule_in_rule__ImplicitContextMapping__Alternatives2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesEntity_in_rule__ImplicitContextMapping__Alternatives2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__ImplicitContextMapping__Alternatives2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_rule__ImplicitContextMapping__Alternatives2246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutineName_in_rule__ImplicitContextMapping__Alternatives2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParamByKeyword_in_rule__ImplicitContextMapping__Alternatives2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__ImplicitContextMapping__Alternatives2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImplicitContextMapping__Group_9__0_in_rule__ImplicitContextMapping__Alternatives2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__InAssignment_0_in_rule__Intent__Alternatives2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__OutAssignment_1_in_rule__Intent__Alternatives2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__InoutAssignment_2_in_rule__Intent__Alternatives2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__IntegerAssignment_0_in_rule__Type__Alternatives2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__CharacterAssignment_1_in_rule__Type__Alternatives2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__LogicalAssignment_2_in_rule__Type__Alternatives2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__RealAssignment_3_in_rule__Type__Alternatives2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__0_in_rule__Type__Alternatives2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__0_in_rule__Type__Alternatives2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalExpression__IdAssignment_0_in_rule__LocalExpression__Alternatives2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocalExpression__LiteralAssignment_1_in_rule__LocalExpression__Alternatives2557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__WildcardAssignment_0_in_rule__Expr__Alternatives2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExprAssignment_1_in_rule__Expr__Alternatives2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__PathExprAssignment_2_in_rule__Expr__Alternatives2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__Alternatives2662 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__Alternatives2675 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__Alternatives2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__0__Impl_in_rule__Language__Group__02726 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Language__Group__1_in_rule__Language__Group__02729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Language__Group__0__Impl2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__1__Impl_in_rule__Language__Group__12788 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Language__Group__2_in_rule__Language__Group__12791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__NameAssignment_1_in_rule__Language__Group__1__Impl2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__2__Impl_in_rule__Language__Group__22848 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Language__Group__3_in_rule__Language__Group__22851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__UriAssignment_2_in_rule__Language__Group__2__Impl2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__3__Impl_in_rule__Language__Group__32908 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Language__Group__4_in_rule__Language__Group__32911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Language__Group__3__Impl2939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__4__Impl_in_rule__Language__Group__42970 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_rule__Language__Group__5_in_rule__Language__Group__42973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__ConceptDefAssignment_4_in_rule__Language__Group__4__Impl3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__5__Impl_in_rule__Language__Group__53030 = new BitSet(new long[]{0x0000000800008000L});
    public static final BitSet FOLLOW_rule__Language__Group__6_in_rule__Language__Group__53033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__ConceptDefAssignment_5_in_rule__Language__Group__5__Impl3060 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Language__Group__6__Impl_in_rule__Language__Group__63091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Language__Group__6__Impl3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03164 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__KeyAssignment_0_in_rule__Annotation__Group__0__Impl3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__0_in_rule__Annotation__Group__1__Impl3251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__0__Impl_in_rule__Annotation__Group_1__03286 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__1_in_rule__Annotation__Group_1__03289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Annotation__Group_1__0__Impl3317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__1__Impl_in_rule__Annotation__Group_1__13348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValueAssignment_1_1_in_rule__Annotation__Group_1__1__Impl3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group__0__Impl_in_rule__AnonymousConceptDef__Group__03409 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group__1_in_rule__AnonymousConceptDef__Group__03412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group__1__Impl_in_rule__AnonymousConceptDef__Group__13470 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group__2_in_rule__AnonymousConceptDef__Group__13473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__0_in_rule__AnonymousConceptDef__Group__1__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group__2__Impl_in_rule__AnonymousConceptDef__Group__23531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__0_in_rule__AnonymousConceptDef__Group__2__Impl3558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__0__Impl_in_rule__AnonymousConceptDef__Group_1__03595 = new BitSet(new long[]{0x00000003E7901000L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__1_in_rule__AnonymousConceptDef__Group_1__03598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AnonymousConceptDef__Group_1__0__Impl3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__1__Impl_in_rule__AnonymousConceptDef__Group_1__13657 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__2_in_rule__AnonymousConceptDef__Group_1__13660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__MappingAssignment_1_1_in_rule__AnonymousConceptDef__Group_1__1__Impl3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__2__Impl_in_rule__AnonymousConceptDef__Group_1__23717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__AnonymousConceptDef__Group_1__2__Impl3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__0__Impl_in_rule__AnonymousConceptDef__Group_2__03782 = new BitSet(new long[]{0x00000040000080C0L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__1_in_rule__AnonymousConceptDef__Group_2__03785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AnonymousConceptDef__Group_2__0__Impl3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__1__Impl_in_rule__AnonymousConceptDef__Group_2__13844 = new BitSet(new long[]{0x00000040000080C0L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__2_in_rule__AnonymousConceptDef__Group_2__13847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__AnnotationAssignment_2_1_in_rule__AnonymousConceptDef__Group_2__1__Impl3874 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__2__Impl_in_rule__AnonymousConceptDef__Group_2__23905 = new BitSet(new long[]{0x00000040000080C0L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__3_in_rule__AnonymousConceptDef__Group_2__23908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__ChildAssignment_2_2_in_rule__AnonymousConceptDef__Group_2__2__Impl3935 = new BitSet(new long[]{0x0000004000000042L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__3__Impl_in_rule__AnonymousConceptDef__Group_2__33966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__AnonymousConceptDef__Group_2__3__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__0__Impl_in_rule__NamedConceptDef__Group__04033 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__1_in_rule__NamedConceptDef__Group__04036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__NamedAssignment_0_in_rule__NamedConceptDef__Group__0__Impl4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__1__Impl_in_rule__NamedConceptDef__Group__14093 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__2_in_rule__NamedConceptDef__Group__14096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__NameAssignment_1_in_rule__NamedConceptDef__Group__1__Impl4123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__2__Impl_in_rule__NamedConceptDef__Group__24153 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__3_in_rule__NamedConceptDef__Group__24156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__0_in_rule__NamedConceptDef__Group__2__Impl4183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__3__Impl_in_rule__NamedConceptDef__Group__34214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__0_in_rule__NamedConceptDef__Group__3__Impl4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__0__Impl_in_rule__NamedConceptDef__Group_2__04280 = new BitSet(new long[]{0x00000003E7901000L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__1_in_rule__NamedConceptDef__Group_2__04283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NamedConceptDef__Group_2__0__Impl4311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__1__Impl_in_rule__NamedConceptDef__Group_2__14342 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__2_in_rule__NamedConceptDef__Group_2__14345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__MappingAssignment_2_1_in_rule__NamedConceptDef__Group_2__1__Impl4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__2__Impl_in_rule__NamedConceptDef__Group_2__24402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__NamedConceptDef__Group_2__2__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__0__Impl_in_rule__NamedConceptDef__Group_3__04467 = new BitSet(new long[]{0x00000040000080C0L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__1_in_rule__NamedConceptDef__Group_3__04470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NamedConceptDef__Group_3__0__Impl4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__1__Impl_in_rule__NamedConceptDef__Group_3__14529 = new BitSet(new long[]{0x00000040000080C0L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__2_in_rule__NamedConceptDef__Group_3__14532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__AnnotationAssignment_3_1_in_rule__NamedConceptDef__Group_3__1__Impl4559 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__2__Impl_in_rule__NamedConceptDef__Group_3__24590 = new BitSet(new long[]{0x00000040000080C0L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__3_in_rule__NamedConceptDef__Group_3__24593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__ChildAssignment_3_2_in_rule__NamedConceptDef__Group_3__2__Impl4620 = new BitSet(new long[]{0x0000004000000042L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__3__Impl_in_rule__NamedConceptDef__Group_3__34651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NamedConceptDef__Group_3__3__Impl4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__0__Impl_in_rule__TopConceptDef__Group__04718 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__1_in_rule__TopConceptDef__Group__04721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__TopAssignment_0_in_rule__TopConceptDef__Group__0__Impl4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__1__Impl_in_rule__TopConceptDef__Group__14778 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__2_in_rule__TopConceptDef__Group__14781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__NamedAssignment_1_in_rule__TopConceptDef__Group__1__Impl4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__2__Impl_in_rule__TopConceptDef__Group__24838 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__3_in_rule__TopConceptDef__Group__24841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__NameAssignment_2_in_rule__TopConceptDef__Group__2__Impl4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__3__Impl_in_rule__TopConceptDef__Group__34898 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__4_in_rule__TopConceptDef__Group__34901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__0_in_rule__TopConceptDef__Group__3__Impl4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__4__Impl_in_rule__TopConceptDef__Group__44959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__0_in_rule__TopConceptDef__Group__4__Impl4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__0__Impl_in_rule__TopConceptDef__Group_3__05027 = new BitSet(new long[]{0x00000003E7901000L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__1_in_rule__TopConceptDef__Group_3__05030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TopConceptDef__Group_3__0__Impl5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__1__Impl_in_rule__TopConceptDef__Group_3__15089 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__2_in_rule__TopConceptDef__Group_3__15092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__MappingAssignment_3_1_in_rule__TopConceptDef__Group_3__1__Impl5119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__2__Impl_in_rule__TopConceptDef__Group_3__25149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__TopConceptDef__Group_3__2__Impl5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__0__Impl_in_rule__TopConceptDef__Group_4__05214 = new BitSet(new long[]{0x00000040000080C0L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__1_in_rule__TopConceptDef__Group_4__05217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TopConceptDef__Group_4__0__Impl5245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__1__Impl_in_rule__TopConceptDef__Group_4__15276 = new BitSet(new long[]{0x00000040000080C0L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__2_in_rule__TopConceptDef__Group_4__15279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__AnnotationAssignment_4_1_in_rule__TopConceptDef__Group_4__1__Impl5306 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__2__Impl_in_rule__TopConceptDef__Group_4__25337 = new BitSet(new long[]{0x00000040000080C0L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__3_in_rule__TopConceptDef__Group_4__25340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__ChildAssignment_4_2_in_rule__TopConceptDef__Group_4__2__Impl5367 = new BitSet(new long[]{0x0000004000000042L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__3__Impl_in_rule__TopConceptDef__Group_4__35398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TopConceptDef__Group_4__3__Impl5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__0__Impl_in_rule__Subconcept__Group__05465 = new BitSet(new long[]{0x000001A0000A4000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__1_in_rule__Subconcept__Group__05468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__NameAssignment_0_in_rule__Subconcept__Group__0__Impl5495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__1__Impl_in_rule__Subconcept__Group__15525 = new BitSet(new long[]{0x000001A0000A4000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__2_in_rule__Subconcept__Group__15528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__CardinalityAssignment_1_in_rule__Subconcept__Group__1__Impl5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__2__Impl_in_rule__Subconcept__Group__25586 = new BitSet(new long[]{0x000001A0000A4000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__3_in_rule__Subconcept__Group__25589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__EssentialAssignment_2_in_rule__Subconcept__Group__2__Impl5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__3__Impl_in_rule__Subconcept__Group__35647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Alternatives_3_in_rule__Subconcept__Group__3__Impl5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_0__0__Impl_in_rule__Subconcept__Group_3_0__05712 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_0__1_in_rule__Subconcept__Group_3_0__05715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Subconcept__Group_3_0__0__Impl5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_0__1__Impl_in_rule__Subconcept__Group_3_0__15774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__DefAssignment_3_0_1_in_rule__Subconcept__Group_3_0__1__Impl5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_2__0__Impl_in_rule__Subconcept__Group_3_2__05835 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_2__1_in_rule__Subconcept__Group_3_2__05838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__ReferenceAssignment_3_2_0_in_rule__Subconcept__Group_3_2__0__Impl5865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_2__1__Impl_in_rule__Subconcept__Group_3_2__15895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__RefAssignment_3_2_1_in_rule__Subconcept__Group_3_2__1__Impl5922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05956 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttribAssignment_0_in_rule__Attribute__Group__0__Impl5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__16016 = new BitSet(new long[]{0x000001A000024000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__16019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl6046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__26076 = new BitSet(new long[]{0x000001A000024000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__26079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__CardinalityAssignment_2_in_rule__Attribute__Group__2__Impl6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__36137 = new BitSet(new long[]{0x000001A000024000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__36140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__EssentialAssignment_3_in_rule__Attribute__Group__3__Impl6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__46198 = new BitSet(new long[]{0x000001A000024000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__46201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__56259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__0_in_rule__Attribute__Group__5__Impl6286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__06329 = new BitSet(new long[]{0x00000003E7901000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__06332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Attribute__Group_4__0__Impl6360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__16391 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__2_in_rule__Attribute__Group_4__16394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttribMappingAssignment_4_1_in_rule__Attribute__Group_4__1__Impl6421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__2__Impl_in_rule__Attribute__Group_4__26451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Attribute__Group_4__2__Impl6479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__0__Impl_in_rule__Attribute__Group_5__06516 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__1_in_rule__Attribute__Group_5__06519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Attribute__Group_5__0__Impl6547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__1__Impl_in_rule__Attribute__Group_5__16578 = new BitSet(new long[]{0x0000000000008080L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__2_in_rule__Attribute__Group_5__16581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AnnotationAssignment_5_1_in_rule__Attribute__Group_5__1__Impl6608 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__2__Impl_in_rule__Attribute__Group_5__26639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Attribute__Group_5__2__Impl6667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__06704 = new BitSet(new long[]{0x00000003E7901000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__06707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__ContextAssignment_0_in_rule__Mapping__Group__0__Impl6734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__16765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__MappingAssignment_1_in_rule__Mapping__Group__1__Impl6792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImplicitContextMapping__Group_9__0__Impl_in_rule__ImplicitContextMapping__Group_9__06826 = new BitSet(new long[]{0x00000003E7901000L});
    public static final BitSet FOLLOW_rule__ImplicitContextMapping__Group_9__1_in_rule__ImplicitContextMapping__Group_9__06829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImplicitContextMapping__Group_9__1__Impl_in_rule__ImplicitContextMapping__Group_9__16887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredEntity_in_rule__ImplicitContextMapping__Group_9__1__Impl6914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__06947 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__06950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__17008 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__17011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Module__Group__1__Impl7039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__27070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__0_in_rule__Module__Group__2__Impl7097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__0__Impl_in_rule__Module__Group_2__07134 = new BitSet(new long[]{0x0000008200000070L});
    public static final BitSet FOLLOW_rule__Module__Group_2__1_in_rule__Module__Group_2__07137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Module__Group_2__0__Impl7165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__1__Impl_in_rule__Module__Group_2__17196 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Module__Group_2__2_in_rule__Module__Group_2__17199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_2_1_in_rule__Module__Group_2__1__Impl7226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__2__Impl_in_rule__Module__Group_2__27256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Module__Group_2__2__Impl7284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleName__Group__0__Impl_in_rule__ModuleName__Group__07321 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__ModuleName__Group__1_in_rule__ModuleName__Group__07324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleName__Group__1__Impl_in_rule__ModuleName__Group__17382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ModuleName__Group__1__Impl7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__0__Impl_in_rule__UsesModule__Group__07445 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__1_in_rule__UsesModule__Group__07448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UsesModule__Group__0__Impl7476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__1__Impl_in_rule__UsesModule__Group__17507 = new BitSet(new long[]{0x0000008200000070L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__2_in_rule__UsesModule__Group__17510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UsesModule__Group__1__Impl7538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__2__Impl_in_rule__UsesModule__Group__27569 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__3_in_rule__UsesModule__Group__27572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__NameAssignment_2_in_rule__UsesModule__Group__2__Impl7599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__3__Impl_in_rule__UsesModule__Group__37629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UsesModule__Group__3__Impl7657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__0__Impl_in_rule__UsesEntity__Group__07696 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__1_in_rule__UsesEntity__Group__07699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__UsesEntity__Group__0__Impl7727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__1__Impl_in_rule__UsesEntity__Group__17758 = new BitSet(new long[]{0x0000008200000070L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__2_in_rule__UsesEntity__Group__17761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UsesEntity__Group__1__Impl7789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__2__Impl_in_rule__UsesEntity__Group__27820 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__3_in_rule__UsesEntity__Group__27823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__NameAssignment_2_in_rule__UsesEntity__Group__2__Impl7850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__3__Impl_in_rule__UsesEntity__Group__37880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UsesEntity__Group__3__Impl7908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__0__Impl_in_rule__Subroutine__Group__07947 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__1_in_rule__Subroutine__Group__07950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Subroutine__Group__0__Impl7978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__1__Impl_in_rule__Subroutine__Group__18009 = new BitSet(new long[]{0x0000008200000070L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__2_in_rule__Subroutine__Group__18012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Subroutine__Group__1__Impl8040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__2__Impl_in_rule__Subroutine__Group__28071 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__3_in_rule__Subroutine__Group__28074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__NameAssignment_2_in_rule__Subroutine__Group__2__Impl8101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__3__Impl_in_rule__Subroutine__Group__38131 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__4_in_rule__Subroutine__Group__38134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__0_in_rule__Subroutine__Group__3__Impl8161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__4__Impl_in_rule__Subroutine__Group__48192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Subroutine__Group__4__Impl8220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__0__Impl_in_rule__Subroutine__Group_3__08261 = new BitSet(new long[]{0x0003FE0000400000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__1_in_rule__Subroutine__Group_3__08264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Subroutine__Group_3__0__Impl8292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__1__Impl_in_rule__Subroutine__Group_3__18323 = new BitSet(new long[]{0x0003FE0000400000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__2_in_rule__Subroutine__Group_3__18326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1__0_in_rule__Subroutine__Group_3__1__Impl8353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__2__Impl_in_rule__Subroutine__Group_3__28384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Subroutine__Group_3__2__Impl8412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1__0__Impl_in_rule__Subroutine__Group_3_1__08449 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1__1_in_rule__Subroutine__Group_3_1__08452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__ParamsAssignment_3_1_0_in_rule__Subroutine__Group_3_1__0__Impl8479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1__1__Impl_in_rule__Subroutine__Group_3_1__18509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1_1__0_in_rule__Subroutine__Group_3_1__1__Impl8536 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1_1__0__Impl_in_rule__Subroutine__Group_3_1_1__08571 = new BitSet(new long[]{0x0003FE0000000000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1_1__1_in_rule__Subroutine__Group_3_1_1__08574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Subroutine__Group_3_1_1__0__Impl8602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1_1__1__Impl_in_rule__Subroutine__Group_3_1_1__18633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__ParamsAssignment_3_1_1_1_in_rule__Subroutine__Group_3_1_1__1__Impl8660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__0__Impl_in_rule__FormalParam__Group__08694 = new BitSet(new long[]{0x0003FE0000000000L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__1_in_rule__FormalParam__Group__08697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__IntentAssignment_0_in_rule__FormalParam__Group__0__Impl8724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__1__Impl_in_rule__FormalParam__Group__18755 = new BitSet(new long[]{0x0000008200000070L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__2_in_rule__FormalParam__Group__18758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__TypeAssignment_1_in_rule__FormalParam__Group__1__Impl8785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__2__Impl_in_rule__FormalParam__Group__28815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__NameAssignment_2_in_rule__FormalParam__Group__2__Impl8842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__0__Impl_in_rule__Type__Group_4__08878 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Type__Group_4__1_in_rule__Type__Group_4__08881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DoubleAssignment_4_0_in_rule__Type__Group_4__0__Impl8908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__1__Impl_in_rule__Type__Group_4__18938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Type__Group_4__1__Impl8967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__0__Impl_in_rule__Type__Group_5__09004 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Type__Group_5__1_in_rule__Type__Group_5__09007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DerivedAssignment_5_0_in_rule__Type__Group_5__0__Impl9034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__1__Impl_in_rule__Type__Group_5__19064 = new BitSet(new long[]{0x0000008200000070L});
    public static final BitSet FOLLOW_rule__Type__Group_5__2_in_rule__Type__Group_5__19067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Type__Group_5__1__Impl9095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__2__Impl_in_rule__Type__Group_5__29126 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Type__Group_5__3_in_rule__Type__Group_5__29129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DerivedTypeAssignment_5_2_in_rule__Type__Group_5__2__Impl9156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__3__Impl_in_rule__Type__Group_5__39186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Type__Group_5__3__Impl9214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__0__Impl_in_rule__SubroutineName__Group__09253 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__1_in_rule__SubroutineName__Group__09256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SubroutineName__Group__0__Impl9284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__1__Impl_in_rule__SubroutineName__Group__19315 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__2_in_rule__SubroutineName__Group__19318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__2__Impl_in_rule__SubroutineName__Group__29376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__0_in_rule__SubroutineName__Group__2__Impl9403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__0__Impl_in_rule__SubroutineName__Group_2__09440 = new BitSet(new long[]{0x0000008200000070L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__1_in_rule__SubroutineName__Group_2__09443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SubroutineName__Group_2__0__Impl9471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__1__Impl_in_rule__SubroutineName__Group_2__19502 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__2_in_rule__SubroutineName__Group_2__19505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__NameAssignment_2_1_in_rule__SubroutineName__Group_2__1__Impl9532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__2__Impl_in_rule__SubroutineName__Group_2__29562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__SubroutineName__Group_2__2__Impl9590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__09627 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__09630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Call__Group__0__Impl9658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__19689 = new BitSet(new long[]{0x0000008200000070L});
    public static final BitSet FOLLOW_rule__Call__Group__2_in_rule__Call__Group__19692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Call__Group__1__Impl9720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__29751 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Call__Group__3_in_rule__Call__Group__29754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__SubroutineNameAssignment_2_in_rule__Call__Group__2__Impl9781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__39811 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Call__Group__4_in_rule__Call__Group__39814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl9841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__49872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Call__Group__4__Impl9900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__09941 = new BitSet(new long[]{0x0000008200400070L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__09944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Call__Group_3__0__Impl9972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__110003 = new BitSet(new long[]{0x0000008200400070L});
    public static final BitSet FOLLOW_rule__Call__Group_3__2_in_rule__Call__Group_3__110006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__0_in_rule__Call__Group_3__1__Impl10033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__2__Impl_in_rule__Call__Group_3__210064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Call__Group_3__2__Impl10092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__0__Impl_in_rule__Call__Group_3_1__010129 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__1_in_rule__Call__Group_3_1__010132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParamsAssignment_3_1_0_in_rule__Call__Group_3_1__0__Impl10159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__1__Impl_in_rule__Call__Group_3_1__110189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__0_in_rule__Call__Group_3_1__1__Impl10216 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__0__Impl_in_rule__Call__Group_3_1_1__010251 = new BitSet(new long[]{0x0000008200000070L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__1_in_rule__Call__Group_3_1_1__010254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Call__Group_3_1_1__0__Impl10282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__1__Impl_in_rule__Call__Group_3_1_1__110313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParamsAssignment_3_1_1_1_in_rule__Call__Group_3_1_1__1__Impl10340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__0__Impl_in_rule__ActualParam__Group__010374 = new BitSet(new long[]{0x0000008200000070L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__1_in_rule__ActualParam__Group__010377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__0_in_rule__ActualParam__Group__0__Impl10404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__1__Impl_in_rule__ActualParam__Group__110435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__ValueAssignment_1_in_rule__ActualParam__Group__1__Impl10462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__0__Impl_in_rule__ActualParam__Group_0__010496 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__1_in_rule__ActualParam__Group_0__010499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__KeywordAssignment_0_0_in_rule__ActualParam__Group_0__0__Impl10526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__1__Impl_in_rule__ActualParam__Group_0__110556 = new BitSet(new long[]{0x0004000000010000L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__2_in_rule__ActualParam__Group_0__110559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__OptionalAssignment_0_1_in_rule__ActualParam__Group_0__1__Impl10586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__2__Impl_in_rule__ActualParam__Group_0__210617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ActualParam__Group_0__2__Impl10645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__0__Impl_in_rule__ActualParamByKeyword__Group__010682 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__1_in_rule__ActualParamByKeyword__Group__010685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ActualParamByKeyword__Group__0__Impl10713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__1__Impl_in_rule__ActualParamByKeyword__Group__110744 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__2_in_rule__ActualParamByKeyword__Group__110747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ActualParamByKeyword__Group__1__Impl10775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__2__Impl_in_rule__ActualParamByKeyword__Group__210806 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__3_in_rule__ActualParamByKeyword__Group__210809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__KeywordAssignment_2_in_rule__ActualParamByKeyword__Group__2__Impl10836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__3__Impl_in_rule__ActualParamByKeyword__Group__310866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ActualParamByKeyword__Group__3__Impl10894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__010933 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__010936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__VariableDeclaration__Group__0__Impl10964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__110995 = new BitSet(new long[]{0x0003FE0000000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__110998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VariableDeclaration__Group__1__Impl11026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__211057 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__211060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__TypeAssignment_2_in_rule__VariableDeclaration__Group__2__Impl11087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__311117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VariableDeclaration__Group__3__Impl11145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__0__Impl_in_rule__PathExpr__Group__011184 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__1_in_rule__PathExpr__Group__011187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PathExpr__Group__0__Impl11215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__1__Impl_in_rule__PathExpr__Group__111246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExprNode_in_rule__PathExpr__Group__1__Impl11273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group__0__Impl_in_rule__PathExprNode__Group__011306 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group__1_in_rule__PathExprNode__Group__011309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExprTerm_in_rule__PathExprNode__Group__0__Impl11336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group__1__Impl_in_rule__PathExprNode__Group__111365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__0_in_rule__PathExprNode__Group__1__Impl11392 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__0__Impl_in_rule__PathExprNode__Group_1__011427 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__1_in_rule__PathExprNode__Group_1__011430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__1__Impl_in_rule__PathExprNode__Group_1__111488 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__2_in_rule__PathExprNode__Group_1__111491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PathExprNode__Group_1__1__Impl11519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__2__Impl_in_rule__PathExprNode__Group_1__211550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__TailAssignment_1_2_in_rule__PathExprNode__Group_1__2__Impl11577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__0__Impl_in_rule__PathExprTerm__Group__011613 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__1_in_rule__PathExprTerm__Group__011616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__1__Impl_in_rule__PathExprTerm__Group__111674 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__2_in_rule__PathExprTerm__Group__111677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__AxisAssignment_1_in_rule__PathExprTerm__Group__1__Impl11704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__2__Impl_in_rule__PathExprTerm__Group__211735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__RefAssignment_2_in_rule__PathExprTerm__Group__2__Impl11762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Language__NameAssignment_111803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Language__UriAssignment_211834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopConceptDef_in_rule__Language__ConceptDefAssignment_411865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedConceptDef_in_rule__Language__ConceptDefAssignment_511896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANNOTATION_ID_in_rule__Annotation__KeyAssignment_011927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_1_111958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__AnonymousConceptDef__MappingAssignment_1_111989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__AnonymousConceptDef__AnnotationAssignment_2_112020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_rule__AnonymousConceptDef__ChildAssignment_2_212051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__NamedConceptDef__NamedAssignment_012087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamedConceptDef__NameAssignment_112126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__NamedConceptDef__MappingAssignment_2_112157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__NamedConceptDef__AnnotationAssignment_3_112188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_rule__NamedConceptDef__ChildAssignment_3_212219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TopConceptDef__TopAssignment_012255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TopConceptDef__NamedAssignment_112299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TopConceptDef__NameAssignment_212338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__TopConceptDef__MappingAssignment_3_112369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__TopConceptDef__AnnotationAssignment_4_112400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_rule__TopConceptDef__ChildAssignment_4_212431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Subconcept__NameAssignment_012462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Subconcept__CardinalityAssignment_112493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Subconcept__EssentialAssignment_212529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedConceptDef_in_rule__Subconcept__DefAssignment_3_0_112568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnonymousConceptDef_in_rule__Subconcept__DefAssignment_3_112599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Subconcept__ReferenceAssignment_3_2_012635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Subconcept__RefAssignment_3_2_112678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Attribute__AttribAssignment_012718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_112757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Attribute__CardinalityAssignment_212788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Attribute__EssentialAssignment_312824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__Attribute__AttribMappingAssignment_4_112863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Attribute__AnnotationAssignment_5_112894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Cardinality__ZeroOrMoreAssignment_012930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Cardinality__OneOrMoreAssignment_112974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_rule__Mapping__ContextAssignment_013013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_rule__Mapping__MappingAssignment_113044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Module__NameAssignment_2_113075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__UsesModule__NameAssignment_213106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__UsesEntity__NameAssignment_213137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Subroutine__NameAssignment_213168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalParam_in_rule__Subroutine__ParamsAssignment_3_1_013199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalParam_in_rule__Subroutine__ParamsAssignment_3_1_1_113230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_rule__FormalParam__IntentAssignment_013261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__FormalParam__TypeAssignment_113292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__FormalParam__NameAssignment_213323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Intent__InAssignment_013359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Intent__OutAssignment_113403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Intent__InoutAssignment_213447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Type__IntegerAssignment_013491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Type__CharacterAssignment_113535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Type__LogicalAssignment_213579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Type__RealAssignment_313623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Type__DoubleAssignment_4_013667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Type__DerivedAssignment_5_013711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Type__DerivedTypeAssignment_5_213750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__SubroutineName__NameAssignment_2_113781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Call__SubroutineNameAssignment_213812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_013843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_1_113874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActualParam__KeywordAssignment_0_013905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__ActualParam__OptionalAssignment_0_113941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ActualParam__ValueAssignment_113980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActualParamByKeyword__KeywordAssignment_214011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_214042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LocalExpression__IdAssignment_014073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__LocalExpression__LiteralAssignment_114104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Expr__WildcardAssignment_014140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalExpression_in_rule__Expr__ExprAssignment_114179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_rule__Expr__PathExprAssignment_214210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathExprNode__TailAssignment_1_214245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxis_in_rule__PathExprTerm__AxisAssignment_114280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathExprTerm__RefAssignment_214315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Axis__AncestorAssignment14355 = new BitSet(new long[]{0x0000000000000002L});

}