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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ANNOTATION_ID", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'language '", "'{'", "'}'", "'='", "'<'", "'>'", "':'", "'module'", "'('", "')'", "'moduleName'", "'usesModule'", "'usesEntity'", "'subroutine'", "','", "'precision'", "'subroutineName'", "'call'", "'actualParamByKeyword'", "'declaration'", "'#'", "'/'", "'concept'", "'top'", "'!'", "'attrib'", "'*'", "'+'", "'in'", "'out'", "'inout'", "'integer'", "'character'", "'logical'", "'real'", "'double'", "'type'", "'?'", "'^'"
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


    // $ANTLR start "entryRuleIDOrWildcard"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:732:1: entryRuleIDOrWildcard : ruleIDOrWildcard EOF ;
    public final void entryRuleIDOrWildcard() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:733:1: ( ruleIDOrWildcard EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:734:1: ruleIDOrWildcard EOF
            {
             before(grammarAccess.getIDOrWildcardRule()); 
            pushFollow(FOLLOW_ruleIDOrWildcard_in_entryRuleIDOrWildcard1501);
            ruleIDOrWildcard();

            state._fsp--;

             after(grammarAccess.getIDOrWildcardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrWildcard1508); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:741:1: ruleIDOrWildcard : ( ( rule__IDOrWildcard__Alternatives ) ) ;
    public final void ruleIDOrWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:745:2: ( ( ( rule__IDOrWildcard__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:746:1: ( ( rule__IDOrWildcard__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:746:1: ( ( rule__IDOrWildcard__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:747:1: ( rule__IDOrWildcard__Alternatives )
            {
             before(grammarAccess.getIDOrWildcardAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:748:1: ( rule__IDOrWildcard__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:748:2: rule__IDOrWildcard__Alternatives
            {
            pushFollow(FOLLOW_rule__IDOrWildcard__Alternatives_in_ruleIDOrWildcard1534);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:760:1: entryRuleIDOrPathExpr : ruleIDOrPathExpr EOF ;
    public final void entryRuleIDOrPathExpr() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:761:1: ( ruleIDOrPathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:762:1: ruleIDOrPathExpr EOF
            {
             before(grammarAccess.getIDOrPathExprRule()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_entryRuleIDOrPathExpr1561);
            ruleIDOrPathExpr();

            state._fsp--;

             after(grammarAccess.getIDOrPathExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIDOrPathExpr1568); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:769:1: ruleIDOrPathExpr : ( ( rule__IDOrPathExpr__Alternatives ) ) ;
    public final void ruleIDOrPathExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:773:2: ( ( ( rule__IDOrPathExpr__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:774:1: ( ( rule__IDOrPathExpr__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:774:1: ( ( rule__IDOrPathExpr__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:775:1: ( rule__IDOrPathExpr__Alternatives )
            {
             before(grammarAccess.getIDOrPathExprAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:776:1: ( rule__IDOrPathExpr__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:776:2: rule__IDOrPathExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__IDOrPathExpr__Alternatives_in_ruleIDOrPathExpr1594);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:788:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:789:1: ( ruleLiteral EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:790:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1621);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1628); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:797:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:801:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:802:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:802:1: ( ( rule__Literal__Alternatives ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:803:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:804:1: ( rule__Literal__Alternatives )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:804:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1654);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:816:1: entryRulePathExpr : rulePathExpr EOF ;
    public final void entryRulePathExpr() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:817:1: ( rulePathExpr EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:818:1: rulePathExpr EOF
            {
             before(grammarAccess.getPathExprRule()); 
            pushFollow(FOLLOW_rulePathExpr_in_entryRulePathExpr1681);
            rulePathExpr();

            state._fsp--;

             after(grammarAccess.getPathExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExpr1688); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:825:1: rulePathExpr : ( ( rule__PathExpr__Group__0 ) ) ;
    public final void rulePathExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:829:2: ( ( ( rule__PathExpr__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:830:1: ( ( rule__PathExpr__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:830:1: ( ( rule__PathExpr__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:831:1: ( rule__PathExpr__Group__0 )
            {
             before(grammarAccess.getPathExprAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:832:1: ( rule__PathExpr__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:832:2: rule__PathExpr__Group__0
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__0_in_rulePathExpr1714);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:844:1: entryRulePathExprNode : rulePathExprNode EOF ;
    public final void entryRulePathExprNode() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:845:1: ( rulePathExprNode EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:846:1: rulePathExprNode EOF
            {
             before(grammarAccess.getPathExprNodeRule()); 
            pushFollow(FOLLOW_rulePathExprNode_in_entryRulePathExprNode1741);
            rulePathExprNode();

            state._fsp--;

             after(grammarAccess.getPathExprNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExprNode1748); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:853:1: rulePathExprNode : ( ( rule__PathExprNode__Group__0 ) ) ;
    public final void rulePathExprNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:857:2: ( ( ( rule__PathExprNode__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:858:1: ( ( rule__PathExprNode__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:858:1: ( ( rule__PathExprNode__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:859:1: ( rule__PathExprNode__Group__0 )
            {
             before(grammarAccess.getPathExprNodeAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:860:1: ( rule__PathExprNode__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:860:2: rule__PathExprNode__Group__0
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group__0_in_rulePathExprNode1774);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:872:1: entryRulePathExprTerm : rulePathExprTerm EOF ;
    public final void entryRulePathExprTerm() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:873:1: ( rulePathExprTerm EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:874:1: rulePathExprTerm EOF
            {
             before(grammarAccess.getPathExprTermRule()); 
            pushFollow(FOLLOW_rulePathExprTerm_in_entryRulePathExprTerm1801);
            rulePathExprTerm();

            state._fsp--;

             after(grammarAccess.getPathExprTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathExprTerm1808); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:881:1: rulePathExprTerm : ( ( rule__PathExprTerm__Group__0 ) ) ;
    public final void rulePathExprTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:885:2: ( ( ( rule__PathExprTerm__Group__0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:886:1: ( ( rule__PathExprTerm__Group__0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:886:1: ( ( rule__PathExprTerm__Group__0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:887:1: ( rule__PathExprTerm__Group__0 )
            {
             before(grammarAccess.getPathExprTermAccess().getGroup()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:888:1: ( rule__PathExprTerm__Group__0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:888:2: rule__PathExprTerm__Group__0
            {
            pushFollow(FOLLOW_rule__PathExprTerm__Group__0_in_rulePathExprTerm1834);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:900:1: entryRuleAxis : ruleAxis EOF ;
    public final void entryRuleAxis() throws RecognitionException {
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:901:1: ( ruleAxis EOF )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:902:1: ruleAxis EOF
            {
             before(grammarAccess.getAxisRule()); 
            pushFollow(FOLLOW_ruleAxis_in_entryRuleAxis1861);
            ruleAxis();

            state._fsp--;

             after(grammarAccess.getAxisRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAxis1868); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:909:1: ruleAxis : ( ( rule__Axis__AncestorAssignment ) ) ;
    public final void ruleAxis() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:913:2: ( ( ( rule__Axis__AncestorAssignment ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:914:1: ( ( rule__Axis__AncestorAssignment ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:914:1: ( ( rule__Axis__AncestorAssignment ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:915:1: ( rule__Axis__AncestorAssignment )
            {
             before(grammarAccess.getAxisAccess().getAncestorAssignment()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:916:1: ( rule__Axis__AncestorAssignment )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:916:2: rule__Axis__AncestorAssignment
            {
            pushFollow(FOLLOW_rule__Axis__AncestorAssignment_in_ruleAxis1894);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:928:1: rule__SubconceptOrAttribute__Alternatives : ( ( ruleSubconcept ) | ( ruleAttribute ) );
    public final void rule__SubconceptOrAttribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:932:1: ( ( ruleSubconcept ) | ( ruleAttribute ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==37) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:933:1: ( ruleSubconcept )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:933:1: ( ruleSubconcept )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:934:1: ruleSubconcept
                    {
                     before(grammarAccess.getSubconceptOrAttributeAccess().getSubconceptParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSubconcept_in_rule__SubconceptOrAttribute__Alternatives1930);
                    ruleSubconcept();

                    state._fsp--;

                     after(grammarAccess.getSubconceptOrAttributeAccess().getSubconceptParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:939:6: ( ruleAttribute )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:939:6: ( ruleAttribute )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:940:1: ruleAttribute
                    {
                     before(grammarAccess.getSubconceptOrAttributeAccess().getAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttribute_in_rule__SubconceptOrAttribute__Alternatives1947);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:950:1: rule__Subconcept__Alternatives_3 : ( ( ( rule__Subconcept__Group_3_0__0 ) ) | ( ( rule__Subconcept__DefAssignment_3_1 ) ) | ( ( rule__Subconcept__Group_3_2__0 ) ) );
    public final void rule__Subconcept__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:954:1: ( ( ( rule__Subconcept__Group_3_0__0 ) ) | ( ( rule__Subconcept__DefAssignment_3_1 ) ) | ( ( rule__Subconcept__Group_3_2__0 ) ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==34) ) {
                    alt2=1;
                }
                else if ( (LA2_1==RULE_ID) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==EOF||LA2_0==RULE_ID||(LA2_0>=13 && LA2_0<=14)||LA2_0==16||LA2_0==37) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:955:1: ( ( rule__Subconcept__Group_3_0__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:955:1: ( ( rule__Subconcept__Group_3_0__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:956:1: ( rule__Subconcept__Group_3_0__0 )
                    {
                     before(grammarAccess.getSubconceptAccess().getGroup_3_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:957:1: ( rule__Subconcept__Group_3_0__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:957:2: rule__Subconcept__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Subconcept__Group_3_0__0_in_rule__Subconcept__Alternatives_31979);
                    rule__Subconcept__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubconceptAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:961:6: ( ( rule__Subconcept__DefAssignment_3_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:961:6: ( ( rule__Subconcept__DefAssignment_3_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:962:1: ( rule__Subconcept__DefAssignment_3_1 )
                    {
                     before(grammarAccess.getSubconceptAccess().getDefAssignment_3_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:963:1: ( rule__Subconcept__DefAssignment_3_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:963:2: rule__Subconcept__DefAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Subconcept__DefAssignment_3_1_in_rule__Subconcept__Alternatives_31997);
                    rule__Subconcept__DefAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubconceptAccess().getDefAssignment_3_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:967:6: ( ( rule__Subconcept__Group_3_2__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:967:6: ( ( rule__Subconcept__Group_3_2__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:968:1: ( rule__Subconcept__Group_3_2__0 )
                    {
                     before(grammarAccess.getSubconceptAccess().getGroup_3_2()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:969:1: ( rule__Subconcept__Group_3_2__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:969:2: rule__Subconcept__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Subconcept__Group_3_2__0_in_rule__Subconcept__Alternatives_32015);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:978:1: rule__Cardinality__Alternatives : ( ( ( rule__Cardinality__ZeroOrMoreAssignment_0 ) ) | ( ( rule__Cardinality__OneOrMoreAssignment_1 ) ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:982:1: ( ( ( rule__Cardinality__ZeroOrMoreAssignment_0 ) ) | ( ( rule__Cardinality__OneOrMoreAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==38) ) {
                alt3=1;
            }
            else if ( (LA3_0==39) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:983:1: ( ( rule__Cardinality__ZeroOrMoreAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:983:1: ( ( rule__Cardinality__ZeroOrMoreAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:984:1: ( rule__Cardinality__ZeroOrMoreAssignment_0 )
                    {
                     before(grammarAccess.getCardinalityAccess().getZeroOrMoreAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:985:1: ( rule__Cardinality__ZeroOrMoreAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:985:2: rule__Cardinality__ZeroOrMoreAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Cardinality__ZeroOrMoreAssignment_0_in_rule__Cardinality__Alternatives2048);
                    rule__Cardinality__ZeroOrMoreAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCardinalityAccess().getZeroOrMoreAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:989:6: ( ( rule__Cardinality__OneOrMoreAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:989:6: ( ( rule__Cardinality__OneOrMoreAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:990:1: ( rule__Cardinality__OneOrMoreAssignment_1 )
                    {
                     before(grammarAccess.getCardinalityAccess().getOneOrMoreAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:991:1: ( rule__Cardinality__OneOrMoreAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:991:2: rule__Cardinality__OneOrMoreAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Cardinality__OneOrMoreAssignment_1_in_rule__Cardinality__Alternatives2066);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1000:1: rule__ImplicitContextMapping__Alternatives : ( ( ruleModule ) | ( ruleModuleName ) | ( ruleUsesModule ) | ( ruleUsesEntity ) | ( ruleCall ) | ( ruleSubroutine ) | ( ruleSubroutineName ) | ( ruleActualParamByKeyword ) | ( ruleVariableDeclaration ) );
    public final void rule__ImplicitContextMapping__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1004:1: ( ( ruleModule ) | ( ruleModuleName ) | ( ruleUsesModule ) | ( ruleUsesEntity ) | ( ruleCall ) | ( ruleSubroutine ) | ( ruleSubroutineName ) | ( ruleActualParamByKeyword ) | ( ruleVariableDeclaration ) )
            int alt4=9;
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
            case 31:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1005:1: ( ruleModule )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1005:1: ( ruleModule )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1006:1: ruleModule
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getModuleParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleModule_in_rule__ImplicitContextMapping__Alternatives2099);
                    ruleModule();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getModuleParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1011:6: ( ruleModuleName )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1011:6: ( ruleModuleName )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1012:1: ruleModuleName
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getModuleNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleModuleName_in_rule__ImplicitContextMapping__Alternatives2116);
                    ruleModuleName();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getModuleNameParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1017:6: ( ruleUsesModule )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1017:6: ( ruleUsesModule )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1018:1: ruleUsesModule
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getUsesModuleParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleUsesModule_in_rule__ImplicitContextMapping__Alternatives2133);
                    ruleUsesModule();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getUsesModuleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1023:6: ( ruleUsesEntity )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1023:6: ( ruleUsesEntity )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1024:1: ruleUsesEntity
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getUsesEntityParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleUsesEntity_in_rule__ImplicitContextMapping__Alternatives2150);
                    ruleUsesEntity();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getUsesEntityParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1029:6: ( ruleCall )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1029:6: ( ruleCall )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1030:1: ruleCall
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleCall_in_rule__ImplicitContextMapping__Alternatives2167);
                    ruleCall();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getCallParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1035:6: ( ruleSubroutine )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1035:6: ( ruleSubroutine )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1036:1: ruleSubroutine
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getSubroutineParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleSubroutine_in_rule__ImplicitContextMapping__Alternatives2184);
                    ruleSubroutine();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getSubroutineParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1041:6: ( ruleSubroutineName )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1041:6: ( ruleSubroutineName )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1042:1: ruleSubroutineName
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getSubroutineNameParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleSubroutineName_in_rule__ImplicitContextMapping__Alternatives2201);
                    ruleSubroutineName();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getSubroutineNameParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1047:6: ( ruleActualParamByKeyword )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1047:6: ( ruleActualParamByKeyword )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1048:1: ruleActualParamByKeyword
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getActualParamByKeywordParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleActualParamByKeyword_in_rule__ImplicitContextMapping__Alternatives2218);
                    ruleActualParamByKeyword();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getActualParamByKeywordParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1053:6: ( ruleVariableDeclaration )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1053:6: ( ruleVariableDeclaration )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1054:1: ruleVariableDeclaration
                    {
                     before(grammarAccess.getImplicitContextMappingAccess().getVariableDeclarationParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_rule__ImplicitContextMapping__Alternatives2235);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getImplicitContextMappingAccess().getVariableDeclarationParserRuleCall_8()); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1064:1: rule__Intent__Alternatives : ( ( ( rule__Intent__InAssignment_0 ) ) | ( ( rule__Intent__OutAssignment_1 ) ) | ( ( rule__Intent__InoutAssignment_2 ) ) );
    public final void rule__Intent__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1068:1: ( ( ( rule__Intent__InAssignment_0 ) ) | ( ( rule__Intent__OutAssignment_1 ) ) | ( ( rule__Intent__InoutAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt5=1;
                }
                break;
            case 41:
                {
                alt5=2;
                }
                break;
            case 42:
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
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1069:1: ( ( rule__Intent__InAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1069:1: ( ( rule__Intent__InAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1070:1: ( rule__Intent__InAssignment_0 )
                    {
                     before(grammarAccess.getIntentAccess().getInAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1071:1: ( rule__Intent__InAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1071:2: rule__Intent__InAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Intent__InAssignment_0_in_rule__Intent__Alternatives2267);
                    rule__Intent__InAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntentAccess().getInAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1075:6: ( ( rule__Intent__OutAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1075:6: ( ( rule__Intent__OutAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1076:1: ( rule__Intent__OutAssignment_1 )
                    {
                     before(grammarAccess.getIntentAccess().getOutAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1077:1: ( rule__Intent__OutAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1077:2: rule__Intent__OutAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Intent__OutAssignment_1_in_rule__Intent__Alternatives2285);
                    rule__Intent__OutAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getIntentAccess().getOutAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1081:6: ( ( rule__Intent__InoutAssignment_2 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1081:6: ( ( rule__Intent__InoutAssignment_2 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1082:1: ( rule__Intent__InoutAssignment_2 )
                    {
                     before(grammarAccess.getIntentAccess().getInoutAssignment_2()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1083:1: ( rule__Intent__InoutAssignment_2 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1083:2: rule__Intent__InoutAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Intent__InoutAssignment_2_in_rule__Intent__Alternatives2303);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1092:1: rule__Type__Alternatives : ( ( ( rule__Type__IntegerAssignment_0 ) ) | ( ( rule__Type__CharacterAssignment_1 ) ) | ( ( rule__Type__LogicalAssignment_2 ) ) | ( ( rule__Type__RealAssignment_3 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1096:1: ( ( ( rule__Type__IntegerAssignment_0 ) ) | ( ( rule__Type__CharacterAssignment_1 ) ) | ( ( rule__Type__LogicalAssignment_2 ) ) | ( ( rule__Type__RealAssignment_3 ) ) | ( ( rule__Type__Group_4__0 ) ) | ( ( rule__Type__Group_5__0 ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt6=1;
                }
                break;
            case 44:
                {
                alt6=2;
                }
                break;
            case 45:
                {
                alt6=3;
                }
                break;
            case 46:
                {
                alt6=4;
                }
                break;
            case 47:
                {
                alt6=5;
                }
                break;
            case 48:
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
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1097:1: ( ( rule__Type__IntegerAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1097:1: ( ( rule__Type__IntegerAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1098:1: ( rule__Type__IntegerAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getIntegerAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1099:1: ( rule__Type__IntegerAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1099:2: rule__Type__IntegerAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Type__IntegerAssignment_0_in_rule__Type__Alternatives2336);
                    rule__Type__IntegerAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getIntegerAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1103:6: ( ( rule__Type__CharacterAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1103:6: ( ( rule__Type__CharacterAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1104:1: ( rule__Type__CharacterAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getCharacterAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1105:1: ( rule__Type__CharacterAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1105:2: rule__Type__CharacterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Type__CharacterAssignment_1_in_rule__Type__Alternatives2354);
                    rule__Type__CharacterAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getCharacterAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1109:6: ( ( rule__Type__LogicalAssignment_2 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1109:6: ( ( rule__Type__LogicalAssignment_2 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1110:1: ( rule__Type__LogicalAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getLogicalAssignment_2()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1111:1: ( rule__Type__LogicalAssignment_2 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1111:2: rule__Type__LogicalAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Type__LogicalAssignment_2_in_rule__Type__Alternatives2372);
                    rule__Type__LogicalAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getLogicalAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1115:6: ( ( rule__Type__RealAssignment_3 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1115:6: ( ( rule__Type__RealAssignment_3 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1116:1: ( rule__Type__RealAssignment_3 )
                    {
                     before(grammarAccess.getTypeAccess().getRealAssignment_3()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1117:1: ( rule__Type__RealAssignment_3 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1117:2: rule__Type__RealAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Type__RealAssignment_3_in_rule__Type__Alternatives2390);
                    rule__Type__RealAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getRealAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1121:6: ( ( rule__Type__Group_4__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1121:6: ( ( rule__Type__Group_4__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1122:1: ( rule__Type__Group_4__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_4()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1123:1: ( rule__Type__Group_4__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1123:2: rule__Type__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_4__0_in_rule__Type__Alternatives2408);
                    rule__Type__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1127:6: ( ( rule__Type__Group_5__0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1127:6: ( ( rule__Type__Group_5__0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1128:1: ( rule__Type__Group_5__0 )
                    {
                     before(grammarAccess.getTypeAccess().getGroup_5()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1129:1: ( rule__Type__Group_5__0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1129:2: rule__Type__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Type__Group_5__0_in_rule__Type__Alternatives2426);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1138:1: rule__IDOrWildcard__Alternatives : ( ( ( rule__IDOrWildcard__IdAssignment_0 ) ) | ( ( rule__IDOrWildcard__WildcardAssignment_1 ) ) );
    public final void rule__IDOrWildcard__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1142:1: ( ( ( rule__IDOrWildcard__IdAssignment_0 ) ) | ( ( rule__IDOrWildcard__WildcardAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==38) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1143:1: ( ( rule__IDOrWildcard__IdAssignment_0 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1143:1: ( ( rule__IDOrWildcard__IdAssignment_0 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1144:1: ( rule__IDOrWildcard__IdAssignment_0 )
                    {
                     before(grammarAccess.getIDOrWildcardAccess().getIdAssignment_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1145:1: ( rule__IDOrWildcard__IdAssignment_0 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1145:2: rule__IDOrWildcard__IdAssignment_0
                    {
                    pushFollow(FOLLOW_rule__IDOrWildcard__IdAssignment_0_in_rule__IDOrWildcard__Alternatives2459);
                    rule__IDOrWildcard__IdAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getIDOrWildcardAccess().getIdAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1149:6: ( ( rule__IDOrWildcard__WildcardAssignment_1 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1149:6: ( ( rule__IDOrWildcard__WildcardAssignment_1 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1150:1: ( rule__IDOrWildcard__WildcardAssignment_1 )
                    {
                     before(grammarAccess.getIDOrWildcardAccess().getWildcardAssignment_1()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1151:1: ( rule__IDOrWildcard__WildcardAssignment_1 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1151:2: rule__IDOrWildcard__WildcardAssignment_1
                    {
                    pushFollow(FOLLOW_rule__IDOrWildcard__WildcardAssignment_1_in_rule__IDOrWildcard__Alternatives2477);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1160:1: rule__IDOrPathExpr__Alternatives : ( ( ruleIDOrWildcard ) | ( rulePathExpr ) | ( ( rule__IDOrPathExpr__LiteralAssignment_2 ) ) );
    public final void rule__IDOrPathExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1164:1: ( ( ruleIDOrWildcard ) | ( rulePathExpr ) | ( ( rule__IDOrPathExpr__LiteralAssignment_2 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 38:
                {
                alt8=1;
                }
                break;
            case 32:
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
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1165:1: ( ruleIDOrWildcard )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1165:1: ( ruleIDOrWildcard )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1166:1: ruleIDOrWildcard
                    {
                     before(grammarAccess.getIDOrPathExprAccess().getIDOrWildcardParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIDOrWildcard_in_rule__IDOrPathExpr__Alternatives2510);
                    ruleIDOrWildcard();

                    state._fsp--;

                     after(grammarAccess.getIDOrPathExprAccess().getIDOrWildcardParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1171:6: ( rulePathExpr )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1171:6: ( rulePathExpr )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1172:1: rulePathExpr
                    {
                     before(grammarAccess.getIDOrPathExprAccess().getPathExprParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePathExpr_in_rule__IDOrPathExpr__Alternatives2527);
                    rulePathExpr();

                    state._fsp--;

                     after(grammarAccess.getIDOrPathExprAccess().getPathExprParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1177:6: ( ( rule__IDOrPathExpr__LiteralAssignment_2 ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1177:6: ( ( rule__IDOrPathExpr__LiteralAssignment_2 ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1178:1: ( rule__IDOrPathExpr__LiteralAssignment_2 )
                    {
                     before(grammarAccess.getIDOrPathExprAccess().getLiteralAssignment_2()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1179:1: ( rule__IDOrPathExpr__LiteralAssignment_2 )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1179:2: rule__IDOrPathExpr__LiteralAssignment_2
                    {
                    pushFollow(FOLLOW_rule__IDOrPathExpr__LiteralAssignment_2_in_rule__IDOrPathExpr__Alternatives2544);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1188:1: rule__Literal__Alternatives : ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) | ( RULE_STRING ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1192:1: ( ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) ) | ( RULE_STRING ) )
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
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1193:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1193:1: ( ( ( RULE_INT ) ) ( ( RULE_INT )* ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1194:1: ( ( RULE_INT ) ) ( ( RULE_INT )* )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1194:1: ( ( RULE_INT ) )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1195:1: ( RULE_INT )
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1196:1: ( RULE_INT )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1196:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__Alternatives2580); 

                    }

                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 

                    }

                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1199:1: ( ( RULE_INT )* )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1200:1: ( RULE_INT )*
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_0()); 
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1201:1: ( RULE_INT )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_INT) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1201:3: RULE_INT
                    	    {
                    	    match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__Alternatives2593); 

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
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1206:6: ( RULE_STRING )
                    {
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1206:6: ( RULE_STRING )
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1207:1: RULE_STRING
                    {
                     before(grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Literal__Alternatives2614); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1219:1: rule__Language__Group__0 : rule__Language__Group__0__Impl rule__Language__Group__1 ;
    public final void rule__Language__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1223:1: ( rule__Language__Group__0__Impl rule__Language__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1224:2: rule__Language__Group__0__Impl rule__Language__Group__1
            {
            pushFollow(FOLLOW_rule__Language__Group__0__Impl_in_rule__Language__Group__02644);
            rule__Language__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__1_in_rule__Language__Group__02647);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1231:1: rule__Language__Group__0__Impl : ( 'language ' ) ;
    public final void rule__Language__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1235:1: ( ( 'language ' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1236:1: ( 'language ' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1236:1: ( 'language ' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1237:1: 'language '
            {
             before(grammarAccess.getLanguageAccess().getLanguageKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Language__Group__0__Impl2675); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1250:1: rule__Language__Group__1 : rule__Language__Group__1__Impl rule__Language__Group__2 ;
    public final void rule__Language__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1254:1: ( rule__Language__Group__1__Impl rule__Language__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1255:2: rule__Language__Group__1__Impl rule__Language__Group__2
            {
            pushFollow(FOLLOW_rule__Language__Group__1__Impl_in_rule__Language__Group__12706);
            rule__Language__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__2_in_rule__Language__Group__12709);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1262:1: rule__Language__Group__1__Impl : ( ( rule__Language__NameAssignment_1 ) ) ;
    public final void rule__Language__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1266:1: ( ( ( rule__Language__NameAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1267:1: ( ( rule__Language__NameAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1267:1: ( ( rule__Language__NameAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1268:1: ( rule__Language__NameAssignment_1 )
            {
             before(grammarAccess.getLanguageAccess().getNameAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1269:1: ( rule__Language__NameAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1269:2: rule__Language__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Language__NameAssignment_1_in_rule__Language__Group__1__Impl2736);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1279:1: rule__Language__Group__2 : rule__Language__Group__2__Impl rule__Language__Group__3 ;
    public final void rule__Language__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1283:1: ( rule__Language__Group__2__Impl rule__Language__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1284:2: rule__Language__Group__2__Impl rule__Language__Group__3
            {
            pushFollow(FOLLOW_rule__Language__Group__2__Impl_in_rule__Language__Group__22766);
            rule__Language__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__3_in_rule__Language__Group__22769);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1291:1: rule__Language__Group__2__Impl : ( ( rule__Language__UriAssignment_2 ) ) ;
    public final void rule__Language__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1295:1: ( ( ( rule__Language__UriAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1296:1: ( ( rule__Language__UriAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1296:1: ( ( rule__Language__UriAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1297:1: ( rule__Language__UriAssignment_2 )
            {
             before(grammarAccess.getLanguageAccess().getUriAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1298:1: ( rule__Language__UriAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1298:2: rule__Language__UriAssignment_2
            {
            pushFollow(FOLLOW_rule__Language__UriAssignment_2_in_rule__Language__Group__2__Impl2796);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1308:1: rule__Language__Group__3 : rule__Language__Group__3__Impl rule__Language__Group__4 ;
    public final void rule__Language__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1312:1: ( rule__Language__Group__3__Impl rule__Language__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1313:2: rule__Language__Group__3__Impl rule__Language__Group__4
            {
            pushFollow(FOLLOW_rule__Language__Group__3__Impl_in_rule__Language__Group__32826);
            rule__Language__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__4_in_rule__Language__Group__32829);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1320:1: rule__Language__Group__3__Impl : ( '{' ) ;
    public final void rule__Language__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1324:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1325:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1325:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1326:1: '{'
            {
             before(grammarAccess.getLanguageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Language__Group__3__Impl2857); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1339:1: rule__Language__Group__4 : rule__Language__Group__4__Impl rule__Language__Group__5 ;
    public final void rule__Language__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1343:1: ( rule__Language__Group__4__Impl rule__Language__Group__5 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1344:2: rule__Language__Group__4__Impl rule__Language__Group__5
            {
            pushFollow(FOLLOW_rule__Language__Group__4__Impl_in_rule__Language__Group__42888);
            rule__Language__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__5_in_rule__Language__Group__42891);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1351:1: rule__Language__Group__4__Impl : ( ( rule__Language__ConceptDefAssignment_4 ) ) ;
    public final void rule__Language__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1355:1: ( ( ( rule__Language__ConceptDefAssignment_4 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1356:1: ( ( rule__Language__ConceptDefAssignment_4 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1356:1: ( ( rule__Language__ConceptDefAssignment_4 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1357:1: ( rule__Language__ConceptDefAssignment_4 )
            {
             before(grammarAccess.getLanguageAccess().getConceptDefAssignment_4()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1358:1: ( rule__Language__ConceptDefAssignment_4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1358:2: rule__Language__ConceptDefAssignment_4
            {
            pushFollow(FOLLOW_rule__Language__ConceptDefAssignment_4_in_rule__Language__Group__4__Impl2918);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1368:1: rule__Language__Group__5 : rule__Language__Group__5__Impl rule__Language__Group__6 ;
    public final void rule__Language__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1372:1: ( rule__Language__Group__5__Impl rule__Language__Group__6 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1373:2: rule__Language__Group__5__Impl rule__Language__Group__6
            {
            pushFollow(FOLLOW_rule__Language__Group__5__Impl_in_rule__Language__Group__52948);
            rule__Language__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Language__Group__6_in_rule__Language__Group__52951);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1380:1: rule__Language__Group__5__Impl : ( ( rule__Language__ConceptDefAssignment_5 )* ) ;
    public final void rule__Language__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1384:1: ( ( ( rule__Language__ConceptDefAssignment_5 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1385:1: ( ( rule__Language__ConceptDefAssignment_5 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1385:1: ( ( rule__Language__ConceptDefAssignment_5 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1386:1: ( rule__Language__ConceptDefAssignment_5 )*
            {
             before(grammarAccess.getLanguageAccess().getConceptDefAssignment_5()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1387:1: ( rule__Language__ConceptDefAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1387:2: rule__Language__ConceptDefAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Language__ConceptDefAssignment_5_in_rule__Language__Group__5__Impl2978);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1397:1: rule__Language__Group__6 : rule__Language__Group__6__Impl ;
    public final void rule__Language__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1401:1: ( rule__Language__Group__6__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1402:2: rule__Language__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Language__Group__6__Impl_in_rule__Language__Group__63009);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1408:1: rule__Language__Group__6__Impl : ( '}' ) ;
    public final void rule__Language__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1412:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1413:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1413:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1414:1: '}'
            {
             before(grammarAccess.getLanguageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_14_in_rule__Language__Group__6__Impl3037); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1441:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1445:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1446:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03082);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03085);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1453:1: rule__Annotation__Group__0__Impl : ( ( rule__Annotation__KeyAssignment_0 ) ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1457:1: ( ( ( rule__Annotation__KeyAssignment_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1458:1: ( ( rule__Annotation__KeyAssignment_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1458:1: ( ( rule__Annotation__KeyAssignment_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1459:1: ( rule__Annotation__KeyAssignment_0 )
            {
             before(grammarAccess.getAnnotationAccess().getKeyAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1460:1: ( rule__Annotation__KeyAssignment_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1460:2: rule__Annotation__KeyAssignment_0
            {
            pushFollow(FOLLOW_rule__Annotation__KeyAssignment_0_in_rule__Annotation__Group__0__Impl3112);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1470:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1474:1: ( rule__Annotation__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1475:2: rule__Annotation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13142);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1481:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__Group_1__0 )? ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1485:1: ( ( ( rule__Annotation__Group_1__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1486:1: ( ( rule__Annotation__Group_1__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1486:1: ( ( rule__Annotation__Group_1__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1487:1: ( rule__Annotation__Group_1__0 )?
            {
             before(grammarAccess.getAnnotationAccess().getGroup_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1488:1: ( rule__Annotation__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1488:2: rule__Annotation__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Annotation__Group_1__0_in_rule__Annotation__Group__1__Impl3169);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1502:1: rule__Annotation__Group_1__0 : rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1 ;
    public final void rule__Annotation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1506:1: ( rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1507:2: rule__Annotation__Group_1__0__Impl rule__Annotation__Group_1__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group_1__0__Impl_in_rule__Annotation__Group_1__03204);
            rule__Annotation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group_1__1_in_rule__Annotation__Group_1__03207);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1514:1: rule__Annotation__Group_1__0__Impl : ( '=' ) ;
    public final void rule__Annotation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1518:1: ( ( '=' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1519:1: ( '=' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1519:1: ( '=' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1520:1: '='
            {
             before(grammarAccess.getAnnotationAccess().getEqualsSignKeyword_1_0()); 
            match(input,15,FOLLOW_15_in_rule__Annotation__Group_1__0__Impl3235); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1533:1: rule__Annotation__Group_1__1 : rule__Annotation__Group_1__1__Impl ;
    public final void rule__Annotation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1537:1: ( rule__Annotation__Group_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1538:2: rule__Annotation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group_1__1__Impl_in_rule__Annotation__Group_1__13266);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1544:1: rule__Annotation__Group_1__1__Impl : ( ( rule__Annotation__ValueAssignment_1_1 ) ) ;
    public final void rule__Annotation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1548:1: ( ( ( rule__Annotation__ValueAssignment_1_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1549:1: ( ( rule__Annotation__ValueAssignment_1_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1549:1: ( ( rule__Annotation__ValueAssignment_1_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1550:1: ( rule__Annotation__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAnnotationAccess().getValueAssignment_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1551:1: ( rule__Annotation__ValueAssignment_1_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1551:2: rule__Annotation__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Annotation__ValueAssignment_1_1_in_rule__Annotation__Group_1__1__Impl3293);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1565:1: rule__AnonymousConceptDef__Group__0 : rule__AnonymousConceptDef__Group__0__Impl rule__AnonymousConceptDef__Group__1 ;
    public final void rule__AnonymousConceptDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1569:1: ( rule__AnonymousConceptDef__Group__0__Impl rule__AnonymousConceptDef__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1570:2: rule__AnonymousConceptDef__Group__0__Impl rule__AnonymousConceptDef__Group__1
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group__0__Impl_in_rule__AnonymousConceptDef__Group__03327);
            rule__AnonymousConceptDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group__1_in_rule__AnonymousConceptDef__Group__03330);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1577:1: rule__AnonymousConceptDef__Group__0__Impl : ( () ) ;
    public final void rule__AnonymousConceptDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1581:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1582:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1582:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1583:1: ()
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getConceptDefAction_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1584:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1586:1: 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1596:1: rule__AnonymousConceptDef__Group__1 : rule__AnonymousConceptDef__Group__1__Impl rule__AnonymousConceptDef__Group__2 ;
    public final void rule__AnonymousConceptDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1600:1: ( rule__AnonymousConceptDef__Group__1__Impl rule__AnonymousConceptDef__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1601:2: rule__AnonymousConceptDef__Group__1__Impl rule__AnonymousConceptDef__Group__2
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group__1__Impl_in_rule__AnonymousConceptDef__Group__13388);
            rule__AnonymousConceptDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group__2_in_rule__AnonymousConceptDef__Group__13391);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1608:1: rule__AnonymousConceptDef__Group__1__Impl : ( ( rule__AnonymousConceptDef__Group_1__0 )? ) ;
    public final void rule__AnonymousConceptDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1612:1: ( ( ( rule__AnonymousConceptDef__Group_1__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1613:1: ( ( rule__AnonymousConceptDef__Group_1__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1613:1: ( ( rule__AnonymousConceptDef__Group_1__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1614:1: ( rule__AnonymousConceptDef__Group_1__0 )?
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getGroup_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1615:1: ( rule__AnonymousConceptDef__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1615:2: rule__AnonymousConceptDef__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__0_in_rule__AnonymousConceptDef__Group__1__Impl3418);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1625:1: rule__AnonymousConceptDef__Group__2 : rule__AnonymousConceptDef__Group__2__Impl ;
    public final void rule__AnonymousConceptDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1629:1: ( rule__AnonymousConceptDef__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1630:2: rule__AnonymousConceptDef__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group__2__Impl_in_rule__AnonymousConceptDef__Group__23449);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1636:1: rule__AnonymousConceptDef__Group__2__Impl : ( ( rule__AnonymousConceptDef__Group_2__0 )? ) ;
    public final void rule__AnonymousConceptDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1640:1: ( ( ( rule__AnonymousConceptDef__Group_2__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1641:1: ( ( rule__AnonymousConceptDef__Group_2__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1641:1: ( ( rule__AnonymousConceptDef__Group_2__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1642:1: ( rule__AnonymousConceptDef__Group_2__0 )?
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1643:1: ( rule__AnonymousConceptDef__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1643:2: rule__AnonymousConceptDef__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__0_in_rule__AnonymousConceptDef__Group__2__Impl3476);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1659:1: rule__AnonymousConceptDef__Group_1__0 : rule__AnonymousConceptDef__Group_1__0__Impl rule__AnonymousConceptDef__Group_1__1 ;
    public final void rule__AnonymousConceptDef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1663:1: ( rule__AnonymousConceptDef__Group_1__0__Impl rule__AnonymousConceptDef__Group_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1664:2: rule__AnonymousConceptDef__Group_1__0__Impl rule__AnonymousConceptDef__Group_1__1
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__0__Impl_in_rule__AnonymousConceptDef__Group_1__03513);
            rule__AnonymousConceptDef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__1_in_rule__AnonymousConceptDef__Group_1__03516);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1671:1: rule__AnonymousConceptDef__Group_1__0__Impl : ( '<' ) ;
    public final void rule__AnonymousConceptDef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1675:1: ( ( '<' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1676:1: ( '<' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1676:1: ( '<' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1677:1: '<'
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getLessThanSignKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__AnonymousConceptDef__Group_1__0__Impl3544); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1690:1: rule__AnonymousConceptDef__Group_1__1 : rule__AnonymousConceptDef__Group_1__1__Impl rule__AnonymousConceptDef__Group_1__2 ;
    public final void rule__AnonymousConceptDef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1694:1: ( rule__AnonymousConceptDef__Group_1__1__Impl rule__AnonymousConceptDef__Group_1__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1695:2: rule__AnonymousConceptDef__Group_1__1__Impl rule__AnonymousConceptDef__Group_1__2
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__1__Impl_in_rule__AnonymousConceptDef__Group_1__13575);
            rule__AnonymousConceptDef__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__2_in_rule__AnonymousConceptDef__Group_1__13578);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1702:1: rule__AnonymousConceptDef__Group_1__1__Impl : ( ( rule__AnonymousConceptDef__MappingAssignment_1_1 ) ) ;
    public final void rule__AnonymousConceptDef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1706:1: ( ( ( rule__AnonymousConceptDef__MappingAssignment_1_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1707:1: ( ( rule__AnonymousConceptDef__MappingAssignment_1_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1707:1: ( ( rule__AnonymousConceptDef__MappingAssignment_1_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1708:1: ( rule__AnonymousConceptDef__MappingAssignment_1_1 )
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getMappingAssignment_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1709:1: ( rule__AnonymousConceptDef__MappingAssignment_1_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1709:2: rule__AnonymousConceptDef__MappingAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__MappingAssignment_1_1_in_rule__AnonymousConceptDef__Group_1__1__Impl3605);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1719:1: rule__AnonymousConceptDef__Group_1__2 : rule__AnonymousConceptDef__Group_1__2__Impl ;
    public final void rule__AnonymousConceptDef__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1723:1: ( rule__AnonymousConceptDef__Group_1__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1724:2: rule__AnonymousConceptDef__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_1__2__Impl_in_rule__AnonymousConceptDef__Group_1__23635);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1730:1: rule__AnonymousConceptDef__Group_1__2__Impl : ( '>' ) ;
    public final void rule__AnonymousConceptDef__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1734:1: ( ( '>' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1735:1: ( '>' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1735:1: ( '>' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1736:1: '>'
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getGreaterThanSignKeyword_1_2()); 
            match(input,17,FOLLOW_17_in_rule__AnonymousConceptDef__Group_1__2__Impl3663); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1755:1: rule__AnonymousConceptDef__Group_2__0 : rule__AnonymousConceptDef__Group_2__0__Impl rule__AnonymousConceptDef__Group_2__1 ;
    public final void rule__AnonymousConceptDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1759:1: ( rule__AnonymousConceptDef__Group_2__0__Impl rule__AnonymousConceptDef__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1760:2: rule__AnonymousConceptDef__Group_2__0__Impl rule__AnonymousConceptDef__Group_2__1
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__0__Impl_in_rule__AnonymousConceptDef__Group_2__03700);
            rule__AnonymousConceptDef__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__1_in_rule__AnonymousConceptDef__Group_2__03703);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1767:1: rule__AnonymousConceptDef__Group_2__0__Impl : ( '{' ) ;
    public final void rule__AnonymousConceptDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1771:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1772:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1772:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1773:1: '{'
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,13,FOLLOW_13_in_rule__AnonymousConceptDef__Group_2__0__Impl3731); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1786:1: rule__AnonymousConceptDef__Group_2__1 : rule__AnonymousConceptDef__Group_2__1__Impl rule__AnonymousConceptDef__Group_2__2 ;
    public final void rule__AnonymousConceptDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1790:1: ( rule__AnonymousConceptDef__Group_2__1__Impl rule__AnonymousConceptDef__Group_2__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1791:2: rule__AnonymousConceptDef__Group_2__1__Impl rule__AnonymousConceptDef__Group_2__2
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__1__Impl_in_rule__AnonymousConceptDef__Group_2__13762);
            rule__AnonymousConceptDef__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__2_in_rule__AnonymousConceptDef__Group_2__13765);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1798:1: rule__AnonymousConceptDef__Group_2__1__Impl : ( ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )* ) ;
    public final void rule__AnonymousConceptDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1802:1: ( ( ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1803:1: ( ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1803:1: ( ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1804:1: ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )*
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getAnnotationAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1805:1: ( rule__AnonymousConceptDef__AnnotationAssignment_2_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ANNOTATION_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1805:2: rule__AnonymousConceptDef__AnnotationAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__AnonymousConceptDef__AnnotationAssignment_2_1_in_rule__AnonymousConceptDef__Group_2__1__Impl3792);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1815:1: rule__AnonymousConceptDef__Group_2__2 : rule__AnonymousConceptDef__Group_2__2__Impl rule__AnonymousConceptDef__Group_2__3 ;
    public final void rule__AnonymousConceptDef__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1819:1: ( rule__AnonymousConceptDef__Group_2__2__Impl rule__AnonymousConceptDef__Group_2__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1820:2: rule__AnonymousConceptDef__Group_2__2__Impl rule__AnonymousConceptDef__Group_2__3
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__2__Impl_in_rule__AnonymousConceptDef__Group_2__23823);
            rule__AnonymousConceptDef__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__3_in_rule__AnonymousConceptDef__Group_2__23826);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1827:1: rule__AnonymousConceptDef__Group_2__2__Impl : ( ( rule__AnonymousConceptDef__ChildAssignment_2_2 )* ) ;
    public final void rule__AnonymousConceptDef__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1831:1: ( ( ( rule__AnonymousConceptDef__ChildAssignment_2_2 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1832:1: ( ( rule__AnonymousConceptDef__ChildAssignment_2_2 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1832:1: ( ( rule__AnonymousConceptDef__ChildAssignment_2_2 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1833:1: ( rule__AnonymousConceptDef__ChildAssignment_2_2 )*
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getChildAssignment_2_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1834:1: ( rule__AnonymousConceptDef__ChildAssignment_2_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==37) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1834:2: rule__AnonymousConceptDef__ChildAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_rule__AnonymousConceptDef__ChildAssignment_2_2_in_rule__AnonymousConceptDef__Group_2__2__Impl3853);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1844:1: rule__AnonymousConceptDef__Group_2__3 : rule__AnonymousConceptDef__Group_2__3__Impl ;
    public final void rule__AnonymousConceptDef__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1848:1: ( rule__AnonymousConceptDef__Group_2__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1849:2: rule__AnonymousConceptDef__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__AnonymousConceptDef__Group_2__3__Impl_in_rule__AnonymousConceptDef__Group_2__33884);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1855:1: rule__AnonymousConceptDef__Group_2__3__Impl : ( '}' ) ;
    public final void rule__AnonymousConceptDef__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1859:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1860:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1860:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1861:1: '}'
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,14,FOLLOW_14_in_rule__AnonymousConceptDef__Group_2__3__Impl3912); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1882:1: rule__NamedConceptDef__Group__0 : rule__NamedConceptDef__Group__0__Impl rule__NamedConceptDef__Group__1 ;
    public final void rule__NamedConceptDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1886:1: ( rule__NamedConceptDef__Group__0__Impl rule__NamedConceptDef__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1887:2: rule__NamedConceptDef__Group__0__Impl rule__NamedConceptDef__Group__1
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group__0__Impl_in_rule__NamedConceptDef__Group__03951);
            rule__NamedConceptDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group__1_in_rule__NamedConceptDef__Group__03954);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1894:1: rule__NamedConceptDef__Group__0__Impl : ( ( rule__NamedConceptDef__NamedAssignment_0 ) ) ;
    public final void rule__NamedConceptDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1898:1: ( ( ( rule__NamedConceptDef__NamedAssignment_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1899:1: ( ( rule__NamedConceptDef__NamedAssignment_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1899:1: ( ( rule__NamedConceptDef__NamedAssignment_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1900:1: ( rule__NamedConceptDef__NamedAssignment_0 )
            {
             before(grammarAccess.getNamedConceptDefAccess().getNamedAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1901:1: ( rule__NamedConceptDef__NamedAssignment_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1901:2: rule__NamedConceptDef__NamedAssignment_0
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__NamedAssignment_0_in_rule__NamedConceptDef__Group__0__Impl3981);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1911:1: rule__NamedConceptDef__Group__1 : rule__NamedConceptDef__Group__1__Impl rule__NamedConceptDef__Group__2 ;
    public final void rule__NamedConceptDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1915:1: ( rule__NamedConceptDef__Group__1__Impl rule__NamedConceptDef__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1916:2: rule__NamedConceptDef__Group__1__Impl rule__NamedConceptDef__Group__2
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group__1__Impl_in_rule__NamedConceptDef__Group__14011);
            rule__NamedConceptDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group__2_in_rule__NamedConceptDef__Group__14014);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1923:1: rule__NamedConceptDef__Group__1__Impl : ( ( rule__NamedConceptDef__NameAssignment_1 ) ) ;
    public final void rule__NamedConceptDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1927:1: ( ( ( rule__NamedConceptDef__NameAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1928:1: ( ( rule__NamedConceptDef__NameAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1928:1: ( ( rule__NamedConceptDef__NameAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1929:1: ( rule__NamedConceptDef__NameAssignment_1 )
            {
             before(grammarAccess.getNamedConceptDefAccess().getNameAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1930:1: ( rule__NamedConceptDef__NameAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1930:2: rule__NamedConceptDef__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__NameAssignment_1_in_rule__NamedConceptDef__Group__1__Impl4041);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1940:1: rule__NamedConceptDef__Group__2 : rule__NamedConceptDef__Group__2__Impl rule__NamedConceptDef__Group__3 ;
    public final void rule__NamedConceptDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1944:1: ( rule__NamedConceptDef__Group__2__Impl rule__NamedConceptDef__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1945:2: rule__NamedConceptDef__Group__2__Impl rule__NamedConceptDef__Group__3
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group__2__Impl_in_rule__NamedConceptDef__Group__24071);
            rule__NamedConceptDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group__3_in_rule__NamedConceptDef__Group__24074);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1952:1: rule__NamedConceptDef__Group__2__Impl : ( ( rule__NamedConceptDef__Group_2__0 )? ) ;
    public final void rule__NamedConceptDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1956:1: ( ( ( rule__NamedConceptDef__Group_2__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1957:1: ( ( rule__NamedConceptDef__Group_2__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1957:1: ( ( rule__NamedConceptDef__Group_2__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1958:1: ( rule__NamedConceptDef__Group_2__0 )?
            {
             before(grammarAccess.getNamedConceptDefAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1959:1: ( rule__NamedConceptDef__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1959:2: rule__NamedConceptDef__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__0_in_rule__NamedConceptDef__Group__2__Impl4101);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1969:1: rule__NamedConceptDef__Group__3 : rule__NamedConceptDef__Group__3__Impl ;
    public final void rule__NamedConceptDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1973:1: ( rule__NamedConceptDef__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1974:2: rule__NamedConceptDef__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group__3__Impl_in_rule__NamedConceptDef__Group__34132);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1980:1: rule__NamedConceptDef__Group__3__Impl : ( ( rule__NamedConceptDef__Group_3__0 )? ) ;
    public final void rule__NamedConceptDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1984:1: ( ( ( rule__NamedConceptDef__Group_3__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1985:1: ( ( rule__NamedConceptDef__Group_3__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1985:1: ( ( rule__NamedConceptDef__Group_3__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1986:1: ( rule__NamedConceptDef__Group_3__0 )?
            {
             before(grammarAccess.getNamedConceptDefAccess().getGroup_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1987:1: ( rule__NamedConceptDef__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==13) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:1987:2: rule__NamedConceptDef__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__0_in_rule__NamedConceptDef__Group__3__Impl4159);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2005:1: rule__NamedConceptDef__Group_2__0 : rule__NamedConceptDef__Group_2__0__Impl rule__NamedConceptDef__Group_2__1 ;
    public final void rule__NamedConceptDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2009:1: ( rule__NamedConceptDef__Group_2__0__Impl rule__NamedConceptDef__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2010:2: rule__NamedConceptDef__Group_2__0__Impl rule__NamedConceptDef__Group_2__1
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__0__Impl_in_rule__NamedConceptDef__Group_2__04198);
            rule__NamedConceptDef__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__1_in_rule__NamedConceptDef__Group_2__04201);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2017:1: rule__NamedConceptDef__Group_2__0__Impl : ( '<' ) ;
    public final void rule__NamedConceptDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2021:1: ( ( '<' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2022:1: ( '<' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2022:1: ( '<' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2023:1: '<'
            {
             before(grammarAccess.getNamedConceptDefAccess().getLessThanSignKeyword_2_0()); 
            match(input,16,FOLLOW_16_in_rule__NamedConceptDef__Group_2__0__Impl4229); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2036:1: rule__NamedConceptDef__Group_2__1 : rule__NamedConceptDef__Group_2__1__Impl rule__NamedConceptDef__Group_2__2 ;
    public final void rule__NamedConceptDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2040:1: ( rule__NamedConceptDef__Group_2__1__Impl rule__NamedConceptDef__Group_2__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2041:2: rule__NamedConceptDef__Group_2__1__Impl rule__NamedConceptDef__Group_2__2
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__1__Impl_in_rule__NamedConceptDef__Group_2__14260);
            rule__NamedConceptDef__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__2_in_rule__NamedConceptDef__Group_2__14263);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2048:1: rule__NamedConceptDef__Group_2__1__Impl : ( ( rule__NamedConceptDef__MappingAssignment_2_1 ) ) ;
    public final void rule__NamedConceptDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2052:1: ( ( ( rule__NamedConceptDef__MappingAssignment_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2053:1: ( ( rule__NamedConceptDef__MappingAssignment_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2053:1: ( ( rule__NamedConceptDef__MappingAssignment_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2054:1: ( rule__NamedConceptDef__MappingAssignment_2_1 )
            {
             before(grammarAccess.getNamedConceptDefAccess().getMappingAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2055:1: ( rule__NamedConceptDef__MappingAssignment_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2055:2: rule__NamedConceptDef__MappingAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__MappingAssignment_2_1_in_rule__NamedConceptDef__Group_2__1__Impl4290);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2065:1: rule__NamedConceptDef__Group_2__2 : rule__NamedConceptDef__Group_2__2__Impl ;
    public final void rule__NamedConceptDef__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2069:1: ( rule__NamedConceptDef__Group_2__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2070:2: rule__NamedConceptDef__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_2__2__Impl_in_rule__NamedConceptDef__Group_2__24320);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2076:1: rule__NamedConceptDef__Group_2__2__Impl : ( '>' ) ;
    public final void rule__NamedConceptDef__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2080:1: ( ( '>' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2081:1: ( '>' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2081:1: ( '>' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2082:1: '>'
            {
             before(grammarAccess.getNamedConceptDefAccess().getGreaterThanSignKeyword_2_2()); 
            match(input,17,FOLLOW_17_in_rule__NamedConceptDef__Group_2__2__Impl4348); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2101:1: rule__NamedConceptDef__Group_3__0 : rule__NamedConceptDef__Group_3__0__Impl rule__NamedConceptDef__Group_3__1 ;
    public final void rule__NamedConceptDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2105:1: ( rule__NamedConceptDef__Group_3__0__Impl rule__NamedConceptDef__Group_3__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2106:2: rule__NamedConceptDef__Group_3__0__Impl rule__NamedConceptDef__Group_3__1
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__0__Impl_in_rule__NamedConceptDef__Group_3__04385);
            rule__NamedConceptDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__1_in_rule__NamedConceptDef__Group_3__04388);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2113:1: rule__NamedConceptDef__Group_3__0__Impl : ( '{' ) ;
    public final void rule__NamedConceptDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2117:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2118:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2118:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2119:1: '{'
            {
             before(grammarAccess.getNamedConceptDefAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,13,FOLLOW_13_in_rule__NamedConceptDef__Group_3__0__Impl4416); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2132:1: rule__NamedConceptDef__Group_3__1 : rule__NamedConceptDef__Group_3__1__Impl rule__NamedConceptDef__Group_3__2 ;
    public final void rule__NamedConceptDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2136:1: ( rule__NamedConceptDef__Group_3__1__Impl rule__NamedConceptDef__Group_3__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2137:2: rule__NamedConceptDef__Group_3__1__Impl rule__NamedConceptDef__Group_3__2
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__1__Impl_in_rule__NamedConceptDef__Group_3__14447);
            rule__NamedConceptDef__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__2_in_rule__NamedConceptDef__Group_3__14450);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2144:1: rule__NamedConceptDef__Group_3__1__Impl : ( ( rule__NamedConceptDef__AnnotationAssignment_3_1 )* ) ;
    public final void rule__NamedConceptDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2148:1: ( ( ( rule__NamedConceptDef__AnnotationAssignment_3_1 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2149:1: ( ( rule__NamedConceptDef__AnnotationAssignment_3_1 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2149:1: ( ( rule__NamedConceptDef__AnnotationAssignment_3_1 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2150:1: ( rule__NamedConceptDef__AnnotationAssignment_3_1 )*
            {
             before(grammarAccess.getNamedConceptDefAccess().getAnnotationAssignment_3_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2151:1: ( rule__NamedConceptDef__AnnotationAssignment_3_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ANNOTATION_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2151:2: rule__NamedConceptDef__AnnotationAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__NamedConceptDef__AnnotationAssignment_3_1_in_rule__NamedConceptDef__Group_3__1__Impl4477);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2161:1: rule__NamedConceptDef__Group_3__2 : rule__NamedConceptDef__Group_3__2__Impl rule__NamedConceptDef__Group_3__3 ;
    public final void rule__NamedConceptDef__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2165:1: ( rule__NamedConceptDef__Group_3__2__Impl rule__NamedConceptDef__Group_3__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2166:2: rule__NamedConceptDef__Group_3__2__Impl rule__NamedConceptDef__Group_3__3
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__2__Impl_in_rule__NamedConceptDef__Group_3__24508);
            rule__NamedConceptDef__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__3_in_rule__NamedConceptDef__Group_3__24511);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2173:1: rule__NamedConceptDef__Group_3__2__Impl : ( ( rule__NamedConceptDef__ChildAssignment_3_2 )* ) ;
    public final void rule__NamedConceptDef__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2177:1: ( ( ( rule__NamedConceptDef__ChildAssignment_3_2 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2178:1: ( ( rule__NamedConceptDef__ChildAssignment_3_2 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2178:1: ( ( rule__NamedConceptDef__ChildAssignment_3_2 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2179:1: ( rule__NamedConceptDef__ChildAssignment_3_2 )*
            {
             before(grammarAccess.getNamedConceptDefAccess().getChildAssignment_3_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2180:1: ( rule__NamedConceptDef__ChildAssignment_3_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2180:2: rule__NamedConceptDef__ChildAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_rule__NamedConceptDef__ChildAssignment_3_2_in_rule__NamedConceptDef__Group_3__2__Impl4538);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2190:1: rule__NamedConceptDef__Group_3__3 : rule__NamedConceptDef__Group_3__3__Impl ;
    public final void rule__NamedConceptDef__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2194:1: ( rule__NamedConceptDef__Group_3__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2195:2: rule__NamedConceptDef__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__NamedConceptDef__Group_3__3__Impl_in_rule__NamedConceptDef__Group_3__34569);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2201:1: rule__NamedConceptDef__Group_3__3__Impl : ( '}' ) ;
    public final void rule__NamedConceptDef__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2205:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2206:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2206:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2207:1: '}'
            {
             before(grammarAccess.getNamedConceptDefAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,14,FOLLOW_14_in_rule__NamedConceptDef__Group_3__3__Impl4597); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2228:1: rule__TopConceptDef__Group__0 : rule__TopConceptDef__Group__0__Impl rule__TopConceptDef__Group__1 ;
    public final void rule__TopConceptDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2232:1: ( rule__TopConceptDef__Group__0__Impl rule__TopConceptDef__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2233:2: rule__TopConceptDef__Group__0__Impl rule__TopConceptDef__Group__1
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group__0__Impl_in_rule__TopConceptDef__Group__04636);
            rule__TopConceptDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group__1_in_rule__TopConceptDef__Group__04639);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2240:1: rule__TopConceptDef__Group__0__Impl : ( ( rule__TopConceptDef__TopAssignment_0 ) ) ;
    public final void rule__TopConceptDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2244:1: ( ( ( rule__TopConceptDef__TopAssignment_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2245:1: ( ( rule__TopConceptDef__TopAssignment_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2245:1: ( ( rule__TopConceptDef__TopAssignment_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2246:1: ( rule__TopConceptDef__TopAssignment_0 )
            {
             before(grammarAccess.getTopConceptDefAccess().getTopAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2247:1: ( rule__TopConceptDef__TopAssignment_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2247:2: rule__TopConceptDef__TopAssignment_0
            {
            pushFollow(FOLLOW_rule__TopConceptDef__TopAssignment_0_in_rule__TopConceptDef__Group__0__Impl4666);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2257:1: rule__TopConceptDef__Group__1 : rule__TopConceptDef__Group__1__Impl rule__TopConceptDef__Group__2 ;
    public final void rule__TopConceptDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2261:1: ( rule__TopConceptDef__Group__1__Impl rule__TopConceptDef__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2262:2: rule__TopConceptDef__Group__1__Impl rule__TopConceptDef__Group__2
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group__1__Impl_in_rule__TopConceptDef__Group__14696);
            rule__TopConceptDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group__2_in_rule__TopConceptDef__Group__14699);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2269:1: rule__TopConceptDef__Group__1__Impl : ( ( rule__TopConceptDef__NamedAssignment_1 ) ) ;
    public final void rule__TopConceptDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2273:1: ( ( ( rule__TopConceptDef__NamedAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2274:1: ( ( rule__TopConceptDef__NamedAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2274:1: ( ( rule__TopConceptDef__NamedAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2275:1: ( rule__TopConceptDef__NamedAssignment_1 )
            {
             before(grammarAccess.getTopConceptDefAccess().getNamedAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2276:1: ( rule__TopConceptDef__NamedAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2276:2: rule__TopConceptDef__NamedAssignment_1
            {
            pushFollow(FOLLOW_rule__TopConceptDef__NamedAssignment_1_in_rule__TopConceptDef__Group__1__Impl4726);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2286:1: rule__TopConceptDef__Group__2 : rule__TopConceptDef__Group__2__Impl rule__TopConceptDef__Group__3 ;
    public final void rule__TopConceptDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2290:1: ( rule__TopConceptDef__Group__2__Impl rule__TopConceptDef__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2291:2: rule__TopConceptDef__Group__2__Impl rule__TopConceptDef__Group__3
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group__2__Impl_in_rule__TopConceptDef__Group__24756);
            rule__TopConceptDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group__3_in_rule__TopConceptDef__Group__24759);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2298:1: rule__TopConceptDef__Group__2__Impl : ( ( rule__TopConceptDef__NameAssignment_2 ) ) ;
    public final void rule__TopConceptDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2302:1: ( ( ( rule__TopConceptDef__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2303:1: ( ( rule__TopConceptDef__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2303:1: ( ( rule__TopConceptDef__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2304:1: ( rule__TopConceptDef__NameAssignment_2 )
            {
             before(grammarAccess.getTopConceptDefAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2305:1: ( rule__TopConceptDef__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2305:2: rule__TopConceptDef__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__TopConceptDef__NameAssignment_2_in_rule__TopConceptDef__Group__2__Impl4786);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2315:1: rule__TopConceptDef__Group__3 : rule__TopConceptDef__Group__3__Impl rule__TopConceptDef__Group__4 ;
    public final void rule__TopConceptDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2319:1: ( rule__TopConceptDef__Group__3__Impl rule__TopConceptDef__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2320:2: rule__TopConceptDef__Group__3__Impl rule__TopConceptDef__Group__4
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group__3__Impl_in_rule__TopConceptDef__Group__34816);
            rule__TopConceptDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group__4_in_rule__TopConceptDef__Group__34819);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2327:1: rule__TopConceptDef__Group__3__Impl : ( ( rule__TopConceptDef__Group_3__0 )? ) ;
    public final void rule__TopConceptDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2331:1: ( ( ( rule__TopConceptDef__Group_3__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2332:1: ( ( rule__TopConceptDef__Group_3__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2332:1: ( ( rule__TopConceptDef__Group_3__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2333:1: ( rule__TopConceptDef__Group_3__0 )?
            {
             before(grammarAccess.getTopConceptDefAccess().getGroup_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2334:1: ( rule__TopConceptDef__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==16) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2334:2: rule__TopConceptDef__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__TopConceptDef__Group_3__0_in_rule__TopConceptDef__Group__3__Impl4846);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2344:1: rule__TopConceptDef__Group__4 : rule__TopConceptDef__Group__4__Impl ;
    public final void rule__TopConceptDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2348:1: ( rule__TopConceptDef__Group__4__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2349:2: rule__TopConceptDef__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group__4__Impl_in_rule__TopConceptDef__Group__44877);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2355:1: rule__TopConceptDef__Group__4__Impl : ( ( rule__TopConceptDef__Group_4__0 )? ) ;
    public final void rule__TopConceptDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2359:1: ( ( ( rule__TopConceptDef__Group_4__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2360:1: ( ( rule__TopConceptDef__Group_4__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2360:1: ( ( rule__TopConceptDef__Group_4__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2361:1: ( rule__TopConceptDef__Group_4__0 )?
            {
             before(grammarAccess.getTopConceptDefAccess().getGroup_4()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2362:1: ( rule__TopConceptDef__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2362:2: rule__TopConceptDef__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__TopConceptDef__Group_4__0_in_rule__TopConceptDef__Group__4__Impl4904);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2382:1: rule__TopConceptDef__Group_3__0 : rule__TopConceptDef__Group_3__0__Impl rule__TopConceptDef__Group_3__1 ;
    public final void rule__TopConceptDef__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2386:1: ( rule__TopConceptDef__Group_3__0__Impl rule__TopConceptDef__Group_3__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2387:2: rule__TopConceptDef__Group_3__0__Impl rule__TopConceptDef__Group_3__1
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_3__0__Impl_in_rule__TopConceptDef__Group_3__04945);
            rule__TopConceptDef__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group_3__1_in_rule__TopConceptDef__Group_3__04948);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2394:1: rule__TopConceptDef__Group_3__0__Impl : ( '<' ) ;
    public final void rule__TopConceptDef__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2398:1: ( ( '<' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2399:1: ( '<' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2399:1: ( '<' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2400:1: '<'
            {
             before(grammarAccess.getTopConceptDefAccess().getLessThanSignKeyword_3_0()); 
            match(input,16,FOLLOW_16_in_rule__TopConceptDef__Group_3__0__Impl4976); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2413:1: rule__TopConceptDef__Group_3__1 : rule__TopConceptDef__Group_3__1__Impl rule__TopConceptDef__Group_3__2 ;
    public final void rule__TopConceptDef__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2417:1: ( rule__TopConceptDef__Group_3__1__Impl rule__TopConceptDef__Group_3__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2418:2: rule__TopConceptDef__Group_3__1__Impl rule__TopConceptDef__Group_3__2
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_3__1__Impl_in_rule__TopConceptDef__Group_3__15007);
            rule__TopConceptDef__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group_3__2_in_rule__TopConceptDef__Group_3__15010);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2425:1: rule__TopConceptDef__Group_3__1__Impl : ( ( rule__TopConceptDef__MappingAssignment_3_1 ) ) ;
    public final void rule__TopConceptDef__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2429:1: ( ( ( rule__TopConceptDef__MappingAssignment_3_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2430:1: ( ( rule__TopConceptDef__MappingAssignment_3_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2430:1: ( ( rule__TopConceptDef__MappingAssignment_3_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2431:1: ( rule__TopConceptDef__MappingAssignment_3_1 )
            {
             before(grammarAccess.getTopConceptDefAccess().getMappingAssignment_3_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2432:1: ( rule__TopConceptDef__MappingAssignment_3_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2432:2: rule__TopConceptDef__MappingAssignment_3_1
            {
            pushFollow(FOLLOW_rule__TopConceptDef__MappingAssignment_3_1_in_rule__TopConceptDef__Group_3__1__Impl5037);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2442:1: rule__TopConceptDef__Group_3__2 : rule__TopConceptDef__Group_3__2__Impl ;
    public final void rule__TopConceptDef__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2446:1: ( rule__TopConceptDef__Group_3__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2447:2: rule__TopConceptDef__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_3__2__Impl_in_rule__TopConceptDef__Group_3__25067);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2453:1: rule__TopConceptDef__Group_3__2__Impl : ( '>' ) ;
    public final void rule__TopConceptDef__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2457:1: ( ( '>' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2458:1: ( '>' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2458:1: ( '>' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2459:1: '>'
            {
             before(grammarAccess.getTopConceptDefAccess().getGreaterThanSignKeyword_3_2()); 
            match(input,17,FOLLOW_17_in_rule__TopConceptDef__Group_3__2__Impl5095); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2478:1: rule__TopConceptDef__Group_4__0 : rule__TopConceptDef__Group_4__0__Impl rule__TopConceptDef__Group_4__1 ;
    public final void rule__TopConceptDef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2482:1: ( rule__TopConceptDef__Group_4__0__Impl rule__TopConceptDef__Group_4__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2483:2: rule__TopConceptDef__Group_4__0__Impl rule__TopConceptDef__Group_4__1
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__0__Impl_in_rule__TopConceptDef__Group_4__05132);
            rule__TopConceptDef__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__1_in_rule__TopConceptDef__Group_4__05135);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2490:1: rule__TopConceptDef__Group_4__0__Impl : ( '{' ) ;
    public final void rule__TopConceptDef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2494:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2495:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2495:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2496:1: '{'
            {
             before(grammarAccess.getTopConceptDefAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,13,FOLLOW_13_in_rule__TopConceptDef__Group_4__0__Impl5163); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2509:1: rule__TopConceptDef__Group_4__1 : rule__TopConceptDef__Group_4__1__Impl rule__TopConceptDef__Group_4__2 ;
    public final void rule__TopConceptDef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2513:1: ( rule__TopConceptDef__Group_4__1__Impl rule__TopConceptDef__Group_4__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2514:2: rule__TopConceptDef__Group_4__1__Impl rule__TopConceptDef__Group_4__2
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__1__Impl_in_rule__TopConceptDef__Group_4__15194);
            rule__TopConceptDef__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__2_in_rule__TopConceptDef__Group_4__15197);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2521:1: rule__TopConceptDef__Group_4__1__Impl : ( ( rule__TopConceptDef__AnnotationAssignment_4_1 )* ) ;
    public final void rule__TopConceptDef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2525:1: ( ( ( rule__TopConceptDef__AnnotationAssignment_4_1 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2526:1: ( ( rule__TopConceptDef__AnnotationAssignment_4_1 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2526:1: ( ( rule__TopConceptDef__AnnotationAssignment_4_1 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2527:1: ( rule__TopConceptDef__AnnotationAssignment_4_1 )*
            {
             before(grammarAccess.getTopConceptDefAccess().getAnnotationAssignment_4_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2528:1: ( rule__TopConceptDef__AnnotationAssignment_4_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ANNOTATION_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2528:2: rule__TopConceptDef__AnnotationAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__TopConceptDef__AnnotationAssignment_4_1_in_rule__TopConceptDef__Group_4__1__Impl5224);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2538:1: rule__TopConceptDef__Group_4__2 : rule__TopConceptDef__Group_4__2__Impl rule__TopConceptDef__Group_4__3 ;
    public final void rule__TopConceptDef__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2542:1: ( rule__TopConceptDef__Group_4__2__Impl rule__TopConceptDef__Group_4__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2543:2: rule__TopConceptDef__Group_4__2__Impl rule__TopConceptDef__Group_4__3
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__2__Impl_in_rule__TopConceptDef__Group_4__25255);
            rule__TopConceptDef__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__3_in_rule__TopConceptDef__Group_4__25258);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2550:1: rule__TopConceptDef__Group_4__2__Impl : ( ( rule__TopConceptDef__ChildAssignment_4_2 )* ) ;
    public final void rule__TopConceptDef__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2554:1: ( ( ( rule__TopConceptDef__ChildAssignment_4_2 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2555:1: ( ( rule__TopConceptDef__ChildAssignment_4_2 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2555:1: ( ( rule__TopConceptDef__ChildAssignment_4_2 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2556:1: ( rule__TopConceptDef__ChildAssignment_4_2 )*
            {
             before(grammarAccess.getTopConceptDefAccess().getChildAssignment_4_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2557:1: ( rule__TopConceptDef__ChildAssignment_4_2 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==37) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2557:2: rule__TopConceptDef__ChildAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_rule__TopConceptDef__ChildAssignment_4_2_in_rule__TopConceptDef__Group_4__2__Impl5285);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2567:1: rule__TopConceptDef__Group_4__3 : rule__TopConceptDef__Group_4__3__Impl ;
    public final void rule__TopConceptDef__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2571:1: ( rule__TopConceptDef__Group_4__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2572:2: rule__TopConceptDef__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__TopConceptDef__Group_4__3__Impl_in_rule__TopConceptDef__Group_4__35316);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2578:1: rule__TopConceptDef__Group_4__3__Impl : ( '}' ) ;
    public final void rule__TopConceptDef__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2582:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2583:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2583:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2584:1: '}'
            {
             before(grammarAccess.getTopConceptDefAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,14,FOLLOW_14_in_rule__TopConceptDef__Group_4__3__Impl5344); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2605:1: rule__Subconcept__Group__0 : rule__Subconcept__Group__0__Impl rule__Subconcept__Group__1 ;
    public final void rule__Subconcept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2609:1: ( rule__Subconcept__Group__0__Impl rule__Subconcept__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2610:2: rule__Subconcept__Group__0__Impl rule__Subconcept__Group__1
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__0__Impl_in_rule__Subconcept__Group__05383);
            rule__Subconcept__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group__1_in_rule__Subconcept__Group__05386);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2617:1: rule__Subconcept__Group__0__Impl : ( ( rule__Subconcept__NameAssignment_0 ) ) ;
    public final void rule__Subconcept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2621:1: ( ( ( rule__Subconcept__NameAssignment_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2622:1: ( ( rule__Subconcept__NameAssignment_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2622:1: ( ( rule__Subconcept__NameAssignment_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2623:1: ( rule__Subconcept__NameAssignment_0 )
            {
             before(grammarAccess.getSubconceptAccess().getNameAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2624:1: ( rule__Subconcept__NameAssignment_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2624:2: rule__Subconcept__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Subconcept__NameAssignment_0_in_rule__Subconcept__Group__0__Impl5413);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2634:1: rule__Subconcept__Group__1 : rule__Subconcept__Group__1__Impl rule__Subconcept__Group__2 ;
    public final void rule__Subconcept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2638:1: ( rule__Subconcept__Group__1__Impl rule__Subconcept__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2639:2: rule__Subconcept__Group__1__Impl rule__Subconcept__Group__2
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__1__Impl_in_rule__Subconcept__Group__15443);
            rule__Subconcept__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group__2_in_rule__Subconcept__Group__15446);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2646:1: rule__Subconcept__Group__1__Impl : ( ( rule__Subconcept__CardinalityAssignment_1 )? ) ;
    public final void rule__Subconcept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2650:1: ( ( ( rule__Subconcept__CardinalityAssignment_1 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2651:1: ( ( rule__Subconcept__CardinalityAssignment_1 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2651:1: ( ( rule__Subconcept__CardinalityAssignment_1 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2652:1: ( rule__Subconcept__CardinalityAssignment_1 )?
            {
             before(grammarAccess.getSubconceptAccess().getCardinalityAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2653:1: ( rule__Subconcept__CardinalityAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=38 && LA25_0<=39)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2653:2: rule__Subconcept__CardinalityAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Subconcept__CardinalityAssignment_1_in_rule__Subconcept__Group__1__Impl5473);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2663:1: rule__Subconcept__Group__2 : rule__Subconcept__Group__2__Impl rule__Subconcept__Group__3 ;
    public final void rule__Subconcept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2667:1: ( rule__Subconcept__Group__2__Impl rule__Subconcept__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2668:2: rule__Subconcept__Group__2__Impl rule__Subconcept__Group__3
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__2__Impl_in_rule__Subconcept__Group__25504);
            rule__Subconcept__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group__3_in_rule__Subconcept__Group__25507);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2675:1: rule__Subconcept__Group__2__Impl : ( ( rule__Subconcept__EssentialAssignment_2 )? ) ;
    public final void rule__Subconcept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2679:1: ( ( ( rule__Subconcept__EssentialAssignment_2 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2680:1: ( ( rule__Subconcept__EssentialAssignment_2 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2680:1: ( ( rule__Subconcept__EssentialAssignment_2 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2681:1: ( rule__Subconcept__EssentialAssignment_2 )?
            {
             before(grammarAccess.getSubconceptAccess().getEssentialAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2682:1: ( rule__Subconcept__EssentialAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2682:2: rule__Subconcept__EssentialAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Subconcept__EssentialAssignment_2_in_rule__Subconcept__Group__2__Impl5534);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2692:1: rule__Subconcept__Group__3 : rule__Subconcept__Group__3__Impl ;
    public final void rule__Subconcept__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2696:1: ( rule__Subconcept__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2697:2: rule__Subconcept__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Subconcept__Group__3__Impl_in_rule__Subconcept__Group__35565);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2703:1: rule__Subconcept__Group__3__Impl : ( ( rule__Subconcept__Alternatives_3 ) ) ;
    public final void rule__Subconcept__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2707:1: ( ( ( rule__Subconcept__Alternatives_3 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2708:1: ( ( rule__Subconcept__Alternatives_3 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2708:1: ( ( rule__Subconcept__Alternatives_3 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2709:1: ( rule__Subconcept__Alternatives_3 )
            {
             before(grammarAccess.getSubconceptAccess().getAlternatives_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2710:1: ( rule__Subconcept__Alternatives_3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2710:2: rule__Subconcept__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Subconcept__Alternatives_3_in_rule__Subconcept__Group__3__Impl5592);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2728:1: rule__Subconcept__Group_3_0__0 : rule__Subconcept__Group_3_0__0__Impl rule__Subconcept__Group_3_0__1 ;
    public final void rule__Subconcept__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2732:1: ( rule__Subconcept__Group_3_0__0__Impl rule__Subconcept__Group_3_0__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2733:2: rule__Subconcept__Group_3_0__0__Impl rule__Subconcept__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_3_0__0__Impl_in_rule__Subconcept__Group_3_0__05630);
            rule__Subconcept__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group_3_0__1_in_rule__Subconcept__Group_3_0__05633);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2740:1: rule__Subconcept__Group_3_0__0__Impl : ( ':' ) ;
    public final void rule__Subconcept__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2744:1: ( ( ':' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2745:1: ( ':' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2745:1: ( ':' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2746:1: ':'
            {
             before(grammarAccess.getSubconceptAccess().getColonKeyword_3_0_0()); 
            match(input,18,FOLLOW_18_in_rule__Subconcept__Group_3_0__0__Impl5661); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2759:1: rule__Subconcept__Group_3_0__1 : rule__Subconcept__Group_3_0__1__Impl ;
    public final void rule__Subconcept__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2763:1: ( rule__Subconcept__Group_3_0__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2764:2: rule__Subconcept__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_3_0__1__Impl_in_rule__Subconcept__Group_3_0__15692);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2770:1: rule__Subconcept__Group_3_0__1__Impl : ( ( rule__Subconcept__DefAssignment_3_0_1 ) ) ;
    public final void rule__Subconcept__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2774:1: ( ( ( rule__Subconcept__DefAssignment_3_0_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2775:1: ( ( rule__Subconcept__DefAssignment_3_0_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2775:1: ( ( rule__Subconcept__DefAssignment_3_0_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2776:1: ( rule__Subconcept__DefAssignment_3_0_1 )
            {
             before(grammarAccess.getSubconceptAccess().getDefAssignment_3_0_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2777:1: ( rule__Subconcept__DefAssignment_3_0_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2777:2: rule__Subconcept__DefAssignment_3_0_1
            {
            pushFollow(FOLLOW_rule__Subconcept__DefAssignment_3_0_1_in_rule__Subconcept__Group_3_0__1__Impl5719);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2791:1: rule__Subconcept__Group_3_2__0 : rule__Subconcept__Group_3_2__0__Impl rule__Subconcept__Group_3_2__1 ;
    public final void rule__Subconcept__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2795:1: ( rule__Subconcept__Group_3_2__0__Impl rule__Subconcept__Group_3_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2796:2: rule__Subconcept__Group_3_2__0__Impl rule__Subconcept__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_3_2__0__Impl_in_rule__Subconcept__Group_3_2__05753);
            rule__Subconcept__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subconcept__Group_3_2__1_in_rule__Subconcept__Group_3_2__05756);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2803:1: rule__Subconcept__Group_3_2__0__Impl : ( ( rule__Subconcept__ReferenceAssignment_3_2_0 ) ) ;
    public final void rule__Subconcept__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2807:1: ( ( ( rule__Subconcept__ReferenceAssignment_3_2_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2808:1: ( ( rule__Subconcept__ReferenceAssignment_3_2_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2808:1: ( ( rule__Subconcept__ReferenceAssignment_3_2_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2809:1: ( rule__Subconcept__ReferenceAssignment_3_2_0 )
            {
             before(grammarAccess.getSubconceptAccess().getReferenceAssignment_3_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2810:1: ( rule__Subconcept__ReferenceAssignment_3_2_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2810:2: rule__Subconcept__ReferenceAssignment_3_2_0
            {
            pushFollow(FOLLOW_rule__Subconcept__ReferenceAssignment_3_2_0_in_rule__Subconcept__Group_3_2__0__Impl5783);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2820:1: rule__Subconcept__Group_3_2__1 : rule__Subconcept__Group_3_2__1__Impl ;
    public final void rule__Subconcept__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2824:1: ( rule__Subconcept__Group_3_2__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2825:2: rule__Subconcept__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Subconcept__Group_3_2__1__Impl_in_rule__Subconcept__Group_3_2__15813);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2831:1: rule__Subconcept__Group_3_2__1__Impl : ( ( rule__Subconcept__RefAssignment_3_2_1 ) ) ;
    public final void rule__Subconcept__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2835:1: ( ( ( rule__Subconcept__RefAssignment_3_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2836:1: ( ( rule__Subconcept__RefAssignment_3_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2836:1: ( ( rule__Subconcept__RefAssignment_3_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2837:1: ( rule__Subconcept__RefAssignment_3_2_1 )
            {
             before(grammarAccess.getSubconceptAccess().getRefAssignment_3_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2838:1: ( rule__Subconcept__RefAssignment_3_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2838:2: rule__Subconcept__RefAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Subconcept__RefAssignment_3_2_1_in_rule__Subconcept__Group_3_2__1__Impl5840);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2852:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2856:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2857:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05874);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05877);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2864:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__AttribAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2868:1: ( ( ( rule__Attribute__AttribAssignment_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2869:1: ( ( rule__Attribute__AttribAssignment_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2869:1: ( ( rule__Attribute__AttribAssignment_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2870:1: ( rule__Attribute__AttribAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getAttribAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2871:1: ( rule__Attribute__AttribAssignment_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2871:2: rule__Attribute__AttribAssignment_0
            {
            pushFollow(FOLLOW_rule__Attribute__AttribAssignment_0_in_rule__Attribute__Group__0__Impl5904);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2881:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2885:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2886:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15934);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15937);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2893:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2897:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2898:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2898:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2899:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2900:1: ( rule__Attribute__NameAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2900:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl5964);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2910:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2914:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2915:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25994);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__25997);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2922:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__CardinalityAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2926:1: ( ( ( rule__Attribute__CardinalityAssignment_2 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2927:1: ( ( rule__Attribute__CardinalityAssignment_2 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2927:1: ( ( rule__Attribute__CardinalityAssignment_2 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2928:1: ( rule__Attribute__CardinalityAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getCardinalityAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2929:1: ( rule__Attribute__CardinalityAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=38 && LA27_0<=39)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2929:2: rule__Attribute__CardinalityAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Attribute__CardinalityAssignment_2_in_rule__Attribute__Group__2__Impl6024);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2939:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2943:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2944:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__36055);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__36058);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2951:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__EssentialAssignment_3 )? ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2955:1: ( ( ( rule__Attribute__EssentialAssignment_3 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2956:1: ( ( rule__Attribute__EssentialAssignment_3 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2956:1: ( ( rule__Attribute__EssentialAssignment_3 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2957:1: ( rule__Attribute__EssentialAssignment_3 )?
            {
             before(grammarAccess.getAttributeAccess().getEssentialAssignment_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2958:1: ( rule__Attribute__EssentialAssignment_3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==36) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2958:2: rule__Attribute__EssentialAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Attribute__EssentialAssignment_3_in_rule__Attribute__Group__3__Impl6085);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2968:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2972:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2973:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__46116);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__46119);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2980:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__Group_4__0 )? ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2984:1: ( ( ( rule__Attribute__Group_4__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2985:1: ( ( rule__Attribute__Group_4__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2985:1: ( ( rule__Attribute__Group_4__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2986:1: ( rule__Attribute__Group_4__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_4()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2987:1: ( rule__Attribute__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==16) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2987:2: rule__Attribute__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl6146);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:2997:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3001:1: ( rule__Attribute__Group__5__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3002:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__56177);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3008:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3012:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3013:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3013:1: ( ( rule__Attribute__Group_5__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3014:1: ( rule__Attribute__Group_5__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_5()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3015:1: ( rule__Attribute__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3015:2: rule__Attribute__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_5__0_in_rule__Attribute__Group__5__Impl6204);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3037:1: rule__Attribute__Group_4__0 : rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 ;
    public final void rule__Attribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3041:1: ( rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3042:2: rule__Attribute__Group_4__0__Impl rule__Attribute__Group_4__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__06247);
            rule__Attribute__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__06250);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3049:1: rule__Attribute__Group_4__0__Impl : ( '<' ) ;
    public final void rule__Attribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3053:1: ( ( '<' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3054:1: ( '<' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3054:1: ( '<' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3055:1: '<'
            {
             before(grammarAccess.getAttributeAccess().getLessThanSignKeyword_4_0()); 
            match(input,16,FOLLOW_16_in_rule__Attribute__Group_4__0__Impl6278); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3068:1: rule__Attribute__Group_4__1 : rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 ;
    public final void rule__Attribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3072:1: ( rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3073:2: rule__Attribute__Group_4__1__Impl rule__Attribute__Group_4__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__16309);
            rule__Attribute__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_4__2_in_rule__Attribute__Group_4__16312);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3080:1: rule__Attribute__Group_4__1__Impl : ( ( rule__Attribute__AttribMappingAssignment_4_1 ) ) ;
    public final void rule__Attribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3084:1: ( ( ( rule__Attribute__AttribMappingAssignment_4_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3085:1: ( ( rule__Attribute__AttribMappingAssignment_4_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3085:1: ( ( rule__Attribute__AttribMappingAssignment_4_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3086:1: ( rule__Attribute__AttribMappingAssignment_4_1 )
            {
             before(grammarAccess.getAttributeAccess().getAttribMappingAssignment_4_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3087:1: ( rule__Attribute__AttribMappingAssignment_4_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3087:2: rule__Attribute__AttribMappingAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Attribute__AttribMappingAssignment_4_1_in_rule__Attribute__Group_4__1__Impl6339);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3097:1: rule__Attribute__Group_4__2 : rule__Attribute__Group_4__2__Impl ;
    public final void rule__Attribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3101:1: ( rule__Attribute__Group_4__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3102:2: rule__Attribute__Group_4__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_4__2__Impl_in_rule__Attribute__Group_4__26369);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3108:1: rule__Attribute__Group_4__2__Impl : ( '>' ) ;
    public final void rule__Attribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3112:1: ( ( '>' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3113:1: ( '>' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3113:1: ( '>' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3114:1: '>'
            {
             before(grammarAccess.getAttributeAccess().getGreaterThanSignKeyword_4_2()); 
            match(input,17,FOLLOW_17_in_rule__Attribute__Group_4__2__Impl6397); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3133:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3137:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3138:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5__0__Impl_in_rule__Attribute__Group_5__06434);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_5__1_in_rule__Attribute__Group_5__06437);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3145:1: rule__Attribute__Group_5__0__Impl : ( '{' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3149:1: ( ( '{' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3150:1: ( '{' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3150:1: ( '{' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3151:1: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,13,FOLLOW_13_in_rule__Attribute__Group_5__0__Impl6465); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3164:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3168:1: ( rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3169:2: rule__Attribute__Group_5__1__Impl rule__Attribute__Group_5__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5__1__Impl_in_rule__Attribute__Group_5__16496);
            rule__Attribute__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_5__2_in_rule__Attribute__Group_5__16499);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3176:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__AnnotationAssignment_5_1 )* ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3180:1: ( ( ( rule__Attribute__AnnotationAssignment_5_1 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3181:1: ( ( rule__Attribute__AnnotationAssignment_5_1 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3181:1: ( ( rule__Attribute__AnnotationAssignment_5_1 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3182:1: ( rule__Attribute__AnnotationAssignment_5_1 )*
            {
             before(grammarAccess.getAttributeAccess().getAnnotationAssignment_5_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3183:1: ( rule__Attribute__AnnotationAssignment_5_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ANNOTATION_ID) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3183:2: rule__Attribute__AnnotationAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__Attribute__AnnotationAssignment_5_1_in_rule__Attribute__Group_5__1__Impl6526);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3193:1: rule__Attribute__Group_5__2 : rule__Attribute__Group_5__2__Impl ;
    public final void rule__Attribute__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3197:1: ( rule__Attribute__Group_5__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3198:2: rule__Attribute__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_5__2__Impl_in_rule__Attribute__Group_5__26557);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3204:1: rule__Attribute__Group_5__2__Impl : ( '}' ) ;
    public final void rule__Attribute__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3208:1: ( ( '}' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3209:1: ( '}' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3209:1: ( '}' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3210:1: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5_2()); 
            match(input,14,FOLLOW_14_in_rule__Attribute__Group_5__2__Impl6585); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3229:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3233:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3234:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__06622);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__06625);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3241:1: rule__Mapping__Group__0__Impl : ( ( rule__Mapping__ContextAssignment_0 )? ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3245:1: ( ( ( rule__Mapping__ContextAssignment_0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3246:1: ( ( rule__Mapping__ContextAssignment_0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3246:1: ( ( rule__Mapping__ContextAssignment_0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3247:1: ( rule__Mapping__ContextAssignment_0 )?
            {
             before(grammarAccess.getMappingAccess().getContextAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3248:1: ( rule__Mapping__ContextAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3248:2: rule__Mapping__ContextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Mapping__ContextAssignment_0_in_rule__Mapping__Group__0__Impl6652);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3258:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3262:1: ( rule__Mapping__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3263:2: rule__Mapping__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__16683);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3269:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__MappingAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3273:1: ( ( ( rule__Mapping__MappingAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3274:1: ( ( rule__Mapping__MappingAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3274:1: ( ( rule__Mapping__MappingAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3275:1: ( rule__Mapping__MappingAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getMappingAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3276:1: ( rule__Mapping__MappingAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3276:2: rule__Mapping__MappingAssignment_1
            {
            pushFollow(FOLLOW_rule__Mapping__MappingAssignment_1_in_rule__Mapping__Group__1__Impl6710);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3290:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3294:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3295:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__06744);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__06747);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3302:1: rule__Module__Group__0__Impl : ( () ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3306:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3307:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3307:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3308:1: ()
            {
             before(grammarAccess.getModuleAccess().getModuleAction_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3309:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3311:1: 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3321:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3325:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3326:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__16805);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__16808);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3333:1: rule__Module__Group__1__Impl : ( 'module' ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3337:1: ( ( 'module' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3338:1: ( 'module' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3338:1: ( 'module' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3339:1: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Module__Group__1__Impl6836); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3352:1: rule__Module__Group__2 : rule__Module__Group__2__Impl ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3356:1: ( rule__Module__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3357:2: rule__Module__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__26867);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3363:1: rule__Module__Group__2__Impl : ( ( rule__Module__Group_2__0 )? ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3367:1: ( ( ( rule__Module__Group_2__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3368:1: ( ( rule__Module__Group_2__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3368:1: ( ( rule__Module__Group_2__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3369:1: ( rule__Module__Group_2__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3370:1: ( rule__Module__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==20) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3370:2: rule__Module__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_2__0_in_rule__Module__Group__2__Impl6894);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3386:1: rule__Module__Group_2__0 : rule__Module__Group_2__0__Impl rule__Module__Group_2__1 ;
    public final void rule__Module__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3390:1: ( rule__Module__Group_2__0__Impl rule__Module__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3391:2: rule__Module__Group_2__0__Impl rule__Module__Group_2__1
            {
            pushFollow(FOLLOW_rule__Module__Group_2__0__Impl_in_rule__Module__Group_2__06931);
            rule__Module__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2__1_in_rule__Module__Group_2__06934);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3398:1: rule__Module__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Module__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3402:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3403:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3403:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3404:1: '('
            {
             before(grammarAccess.getModuleAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__Module__Group_2__0__Impl6962); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3417:1: rule__Module__Group_2__1 : rule__Module__Group_2__1__Impl rule__Module__Group_2__2 ;
    public final void rule__Module__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3421:1: ( rule__Module__Group_2__1__Impl rule__Module__Group_2__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3422:2: rule__Module__Group_2__1__Impl rule__Module__Group_2__2
            {
            pushFollow(FOLLOW_rule__Module__Group_2__1__Impl_in_rule__Module__Group_2__16993);
            rule__Module__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2__2_in_rule__Module__Group_2__16996);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3429:1: rule__Module__Group_2__1__Impl : ( ( rule__Module__NameAssignment_2_1 ) ) ;
    public final void rule__Module__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3433:1: ( ( ( rule__Module__NameAssignment_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3434:1: ( ( rule__Module__NameAssignment_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3434:1: ( ( rule__Module__NameAssignment_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3435:1: ( rule__Module__NameAssignment_2_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3436:1: ( rule__Module__NameAssignment_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3436:2: rule__Module__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_2_1_in_rule__Module__Group_2__1__Impl7023);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3446:1: rule__Module__Group_2__2 : rule__Module__Group_2__2__Impl ;
    public final void rule__Module__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3450:1: ( rule__Module__Group_2__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3451:2: rule__Module__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_2__2__Impl_in_rule__Module__Group_2__27053);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3457:1: rule__Module__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Module__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3461:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3462:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3462:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3463:1: ')'
            {
             before(grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_2()); 
            match(input,21,FOLLOW_21_in_rule__Module__Group_2__2__Impl7081); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3482:1: rule__ModuleName__Group__0 : rule__ModuleName__Group__0__Impl rule__ModuleName__Group__1 ;
    public final void rule__ModuleName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3486:1: ( rule__ModuleName__Group__0__Impl rule__ModuleName__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3487:2: rule__ModuleName__Group__0__Impl rule__ModuleName__Group__1
            {
            pushFollow(FOLLOW_rule__ModuleName__Group__0__Impl_in_rule__ModuleName__Group__07118);
            rule__ModuleName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleName__Group__1_in_rule__ModuleName__Group__07121);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3494:1: rule__ModuleName__Group__0__Impl : ( () ) ;
    public final void rule__ModuleName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3498:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3499:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3499:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3500:1: ()
            {
             before(grammarAccess.getModuleNameAccess().getModuleNameAction_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3501:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3503:1: 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3513:1: rule__ModuleName__Group__1 : rule__ModuleName__Group__1__Impl ;
    public final void rule__ModuleName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3517:1: ( rule__ModuleName__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3518:2: rule__ModuleName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ModuleName__Group__1__Impl_in_rule__ModuleName__Group__17179);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3524:1: rule__ModuleName__Group__1__Impl : ( 'moduleName' ) ;
    public final void rule__ModuleName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3528:1: ( ( 'moduleName' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3529:1: ( 'moduleName' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3529:1: ( 'moduleName' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3530:1: 'moduleName'
            {
             before(grammarAccess.getModuleNameAccess().getModuleNameKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__ModuleName__Group__1__Impl7207); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3547:1: rule__UsesModule__Group__0 : rule__UsesModule__Group__0__Impl rule__UsesModule__Group__1 ;
    public final void rule__UsesModule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3551:1: ( rule__UsesModule__Group__0__Impl rule__UsesModule__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3552:2: rule__UsesModule__Group__0__Impl rule__UsesModule__Group__1
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__0__Impl_in_rule__UsesModule__Group__07242);
            rule__UsesModule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesModule__Group__1_in_rule__UsesModule__Group__07245);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3559:1: rule__UsesModule__Group__0__Impl : ( 'usesModule' ) ;
    public final void rule__UsesModule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3563:1: ( ( 'usesModule' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3564:1: ( 'usesModule' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3564:1: ( 'usesModule' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3565:1: 'usesModule'
            {
             before(grammarAccess.getUsesModuleAccess().getUsesModuleKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__UsesModule__Group__0__Impl7273); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3578:1: rule__UsesModule__Group__1 : rule__UsesModule__Group__1__Impl rule__UsesModule__Group__2 ;
    public final void rule__UsesModule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3582:1: ( rule__UsesModule__Group__1__Impl rule__UsesModule__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3583:2: rule__UsesModule__Group__1__Impl rule__UsesModule__Group__2
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__1__Impl_in_rule__UsesModule__Group__17304);
            rule__UsesModule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesModule__Group__2_in_rule__UsesModule__Group__17307);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3590:1: rule__UsesModule__Group__1__Impl : ( '(' ) ;
    public final void rule__UsesModule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3594:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3595:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3595:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3596:1: '('
            {
             before(grammarAccess.getUsesModuleAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__UsesModule__Group__1__Impl7335); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3609:1: rule__UsesModule__Group__2 : rule__UsesModule__Group__2__Impl rule__UsesModule__Group__3 ;
    public final void rule__UsesModule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3613:1: ( rule__UsesModule__Group__2__Impl rule__UsesModule__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3614:2: rule__UsesModule__Group__2__Impl rule__UsesModule__Group__3
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__2__Impl_in_rule__UsesModule__Group__27366);
            rule__UsesModule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesModule__Group__3_in_rule__UsesModule__Group__27369);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3621:1: rule__UsesModule__Group__2__Impl : ( ( rule__UsesModule__NameAssignment_2 ) ) ;
    public final void rule__UsesModule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3625:1: ( ( ( rule__UsesModule__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3626:1: ( ( rule__UsesModule__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3626:1: ( ( rule__UsesModule__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3627:1: ( rule__UsesModule__NameAssignment_2 )
            {
             before(grammarAccess.getUsesModuleAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3628:1: ( rule__UsesModule__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3628:2: rule__UsesModule__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UsesModule__NameAssignment_2_in_rule__UsesModule__Group__2__Impl7396);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3638:1: rule__UsesModule__Group__3 : rule__UsesModule__Group__3__Impl ;
    public final void rule__UsesModule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3642:1: ( rule__UsesModule__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3643:2: rule__UsesModule__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UsesModule__Group__3__Impl_in_rule__UsesModule__Group__37426);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3649:1: rule__UsesModule__Group__3__Impl : ( ')' ) ;
    public final void rule__UsesModule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3653:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3654:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3654:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3655:1: ')'
            {
             before(grammarAccess.getUsesModuleAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__UsesModule__Group__3__Impl7454); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3676:1: rule__UsesEntity__Group__0 : rule__UsesEntity__Group__0__Impl rule__UsesEntity__Group__1 ;
    public final void rule__UsesEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3680:1: ( rule__UsesEntity__Group__0__Impl rule__UsesEntity__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3681:2: rule__UsesEntity__Group__0__Impl rule__UsesEntity__Group__1
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__0__Impl_in_rule__UsesEntity__Group__07493);
            rule__UsesEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesEntity__Group__1_in_rule__UsesEntity__Group__07496);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3688:1: rule__UsesEntity__Group__0__Impl : ( 'usesEntity' ) ;
    public final void rule__UsesEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3692:1: ( ( 'usesEntity' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3693:1: ( 'usesEntity' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3693:1: ( 'usesEntity' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3694:1: 'usesEntity'
            {
             before(grammarAccess.getUsesEntityAccess().getUsesEntityKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__UsesEntity__Group__0__Impl7524); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3707:1: rule__UsesEntity__Group__1 : rule__UsesEntity__Group__1__Impl rule__UsesEntity__Group__2 ;
    public final void rule__UsesEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3711:1: ( rule__UsesEntity__Group__1__Impl rule__UsesEntity__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3712:2: rule__UsesEntity__Group__1__Impl rule__UsesEntity__Group__2
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__1__Impl_in_rule__UsesEntity__Group__17555);
            rule__UsesEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesEntity__Group__2_in_rule__UsesEntity__Group__17558);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3719:1: rule__UsesEntity__Group__1__Impl : ( '(' ) ;
    public final void rule__UsesEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3723:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3724:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3724:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3725:1: '('
            {
             before(grammarAccess.getUsesEntityAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__UsesEntity__Group__1__Impl7586); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3738:1: rule__UsesEntity__Group__2 : rule__UsesEntity__Group__2__Impl rule__UsesEntity__Group__3 ;
    public final void rule__UsesEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3742:1: ( rule__UsesEntity__Group__2__Impl rule__UsesEntity__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3743:2: rule__UsesEntity__Group__2__Impl rule__UsesEntity__Group__3
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__2__Impl_in_rule__UsesEntity__Group__27617);
            rule__UsesEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UsesEntity__Group__3_in_rule__UsesEntity__Group__27620);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3750:1: rule__UsesEntity__Group__2__Impl : ( ( rule__UsesEntity__NameAssignment_2 ) ) ;
    public final void rule__UsesEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3754:1: ( ( ( rule__UsesEntity__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3755:1: ( ( rule__UsesEntity__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3755:1: ( ( rule__UsesEntity__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3756:1: ( rule__UsesEntity__NameAssignment_2 )
            {
             before(grammarAccess.getUsesEntityAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3757:1: ( rule__UsesEntity__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3757:2: rule__UsesEntity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__UsesEntity__NameAssignment_2_in_rule__UsesEntity__Group__2__Impl7647);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3767:1: rule__UsesEntity__Group__3 : rule__UsesEntity__Group__3__Impl ;
    public final void rule__UsesEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3771:1: ( rule__UsesEntity__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3772:2: rule__UsesEntity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UsesEntity__Group__3__Impl_in_rule__UsesEntity__Group__37677);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3778:1: rule__UsesEntity__Group__3__Impl : ( ')' ) ;
    public final void rule__UsesEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3782:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3783:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3783:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3784:1: ')'
            {
             before(grammarAccess.getUsesEntityAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__UsesEntity__Group__3__Impl7705); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3805:1: rule__Subroutine__Group__0 : rule__Subroutine__Group__0__Impl rule__Subroutine__Group__1 ;
    public final void rule__Subroutine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3809:1: ( rule__Subroutine__Group__0__Impl rule__Subroutine__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3810:2: rule__Subroutine__Group__0__Impl rule__Subroutine__Group__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__0__Impl_in_rule__Subroutine__Group__07744);
            rule__Subroutine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__1_in_rule__Subroutine__Group__07747);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3817:1: rule__Subroutine__Group__0__Impl : ( 'subroutine' ) ;
    public final void rule__Subroutine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3821:1: ( ( 'subroutine' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3822:1: ( 'subroutine' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3822:1: ( 'subroutine' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3823:1: 'subroutine'
            {
             before(grammarAccess.getSubroutineAccess().getSubroutineKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Subroutine__Group__0__Impl7775); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3836:1: rule__Subroutine__Group__1 : rule__Subroutine__Group__1__Impl rule__Subroutine__Group__2 ;
    public final void rule__Subroutine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3840:1: ( rule__Subroutine__Group__1__Impl rule__Subroutine__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3841:2: rule__Subroutine__Group__1__Impl rule__Subroutine__Group__2
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__1__Impl_in_rule__Subroutine__Group__17806);
            rule__Subroutine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__2_in_rule__Subroutine__Group__17809);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3848:1: rule__Subroutine__Group__1__Impl : ( '(' ) ;
    public final void rule__Subroutine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3852:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3853:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3853:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3854:1: '('
            {
             before(grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Subroutine__Group__1__Impl7837); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3867:1: rule__Subroutine__Group__2 : rule__Subroutine__Group__2__Impl rule__Subroutine__Group__3 ;
    public final void rule__Subroutine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3871:1: ( rule__Subroutine__Group__2__Impl rule__Subroutine__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3872:2: rule__Subroutine__Group__2__Impl rule__Subroutine__Group__3
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__2__Impl_in_rule__Subroutine__Group__27868);
            rule__Subroutine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__3_in_rule__Subroutine__Group__27871);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3879:1: rule__Subroutine__Group__2__Impl : ( ( rule__Subroutine__NameAssignment_2 ) ) ;
    public final void rule__Subroutine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3883:1: ( ( ( rule__Subroutine__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3884:1: ( ( rule__Subroutine__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3884:1: ( ( rule__Subroutine__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3885:1: ( rule__Subroutine__NameAssignment_2 )
            {
             before(grammarAccess.getSubroutineAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3886:1: ( rule__Subroutine__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3886:2: rule__Subroutine__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Subroutine__NameAssignment_2_in_rule__Subroutine__Group__2__Impl7898);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3896:1: rule__Subroutine__Group__3 : rule__Subroutine__Group__3__Impl rule__Subroutine__Group__4 ;
    public final void rule__Subroutine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3900:1: ( rule__Subroutine__Group__3__Impl rule__Subroutine__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3901:2: rule__Subroutine__Group__3__Impl rule__Subroutine__Group__4
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__3__Impl_in_rule__Subroutine__Group__37928);
            rule__Subroutine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group__4_in_rule__Subroutine__Group__37931);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3908:1: rule__Subroutine__Group__3__Impl : ( ( rule__Subroutine__Group_3__0 )? ) ;
    public final void rule__Subroutine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3912:1: ( ( ( rule__Subroutine__Group_3__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3913:1: ( ( rule__Subroutine__Group_3__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3913:1: ( ( rule__Subroutine__Group_3__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3914:1: ( rule__Subroutine__Group_3__0 )?
            {
             before(grammarAccess.getSubroutineAccess().getGroup_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3915:1: ( rule__Subroutine__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==20) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3915:2: rule__Subroutine__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Subroutine__Group_3__0_in_rule__Subroutine__Group__3__Impl7958);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3925:1: rule__Subroutine__Group__4 : rule__Subroutine__Group__4__Impl ;
    public final void rule__Subroutine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3929:1: ( rule__Subroutine__Group__4__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3930:2: rule__Subroutine__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group__4__Impl_in_rule__Subroutine__Group__47989);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3936:1: rule__Subroutine__Group__4__Impl : ( ')' ) ;
    public final void rule__Subroutine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3940:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3941:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3941:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3942:1: ')'
            {
             before(grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Subroutine__Group__4__Impl8017); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3965:1: rule__Subroutine__Group_3__0 : rule__Subroutine__Group_3__0__Impl rule__Subroutine__Group_3__1 ;
    public final void rule__Subroutine__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3969:1: ( rule__Subroutine__Group_3__0__Impl rule__Subroutine__Group_3__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3970:2: rule__Subroutine__Group_3__0__Impl rule__Subroutine__Group_3__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3__0__Impl_in_rule__Subroutine__Group_3__08058);
            rule__Subroutine__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group_3__1_in_rule__Subroutine__Group_3__08061);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3977:1: rule__Subroutine__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Subroutine__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3981:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3982:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3982:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3983:1: '('
            {
             before(grammarAccess.getSubroutineAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__Subroutine__Group_3__0__Impl8089); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:3996:1: rule__Subroutine__Group_3__1 : rule__Subroutine__Group_3__1__Impl rule__Subroutine__Group_3__2 ;
    public final void rule__Subroutine__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4000:1: ( rule__Subroutine__Group_3__1__Impl rule__Subroutine__Group_3__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4001:2: rule__Subroutine__Group_3__1__Impl rule__Subroutine__Group_3__2
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3__1__Impl_in_rule__Subroutine__Group_3__18120);
            rule__Subroutine__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group_3__2_in_rule__Subroutine__Group_3__18123);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4008:1: rule__Subroutine__Group_3__1__Impl : ( ( rule__Subroutine__Group_3_1__0 )? ) ;
    public final void rule__Subroutine__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4012:1: ( ( ( rule__Subroutine__Group_3_1__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4013:1: ( ( rule__Subroutine__Group_3_1__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4013:1: ( ( rule__Subroutine__Group_3_1__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4014:1: ( rule__Subroutine__Group_3_1__0 )?
            {
             before(grammarAccess.getSubroutineAccess().getGroup_3_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4015:1: ( rule__Subroutine__Group_3_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=40 && LA35_0<=48)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4015:2: rule__Subroutine__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Subroutine__Group_3_1__0_in_rule__Subroutine__Group_3__1__Impl8150);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4025:1: rule__Subroutine__Group_3__2 : rule__Subroutine__Group_3__2__Impl ;
    public final void rule__Subroutine__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4029:1: ( rule__Subroutine__Group_3__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4030:2: rule__Subroutine__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3__2__Impl_in_rule__Subroutine__Group_3__28181);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4036:1: rule__Subroutine__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Subroutine__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4040:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4041:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4041:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4042:1: ')'
            {
             before(grammarAccess.getSubroutineAccess().getRightParenthesisKeyword_3_2()); 
            match(input,21,FOLLOW_21_in_rule__Subroutine__Group_3__2__Impl8209); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4061:1: rule__Subroutine__Group_3_1__0 : rule__Subroutine__Group_3_1__0__Impl rule__Subroutine__Group_3_1__1 ;
    public final void rule__Subroutine__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4065:1: ( rule__Subroutine__Group_3_1__0__Impl rule__Subroutine__Group_3_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4066:2: rule__Subroutine__Group_3_1__0__Impl rule__Subroutine__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3_1__0__Impl_in_rule__Subroutine__Group_3_1__08246);
            rule__Subroutine__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group_3_1__1_in_rule__Subroutine__Group_3_1__08249);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4073:1: rule__Subroutine__Group_3_1__0__Impl : ( ( rule__Subroutine__ParamsAssignment_3_1_0 ) ) ;
    public final void rule__Subroutine__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4077:1: ( ( ( rule__Subroutine__ParamsAssignment_3_1_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4078:1: ( ( rule__Subroutine__ParamsAssignment_3_1_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4078:1: ( ( rule__Subroutine__ParamsAssignment_3_1_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4079:1: ( rule__Subroutine__ParamsAssignment_3_1_0 )
            {
             before(grammarAccess.getSubroutineAccess().getParamsAssignment_3_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4080:1: ( rule__Subroutine__ParamsAssignment_3_1_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4080:2: rule__Subroutine__ParamsAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Subroutine__ParamsAssignment_3_1_0_in_rule__Subroutine__Group_3_1__0__Impl8276);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4090:1: rule__Subroutine__Group_3_1__1 : rule__Subroutine__Group_3_1__1__Impl ;
    public final void rule__Subroutine__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4094:1: ( rule__Subroutine__Group_3_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4095:2: rule__Subroutine__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3_1__1__Impl_in_rule__Subroutine__Group_3_1__18306);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4101:1: rule__Subroutine__Group_3_1__1__Impl : ( ( rule__Subroutine__Group_3_1_1__0 )* ) ;
    public final void rule__Subroutine__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4105:1: ( ( ( rule__Subroutine__Group_3_1_1__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4106:1: ( ( rule__Subroutine__Group_3_1_1__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4106:1: ( ( rule__Subroutine__Group_3_1_1__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4107:1: ( rule__Subroutine__Group_3_1_1__0 )*
            {
             before(grammarAccess.getSubroutineAccess().getGroup_3_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4108:1: ( rule__Subroutine__Group_3_1_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==26) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4108:2: rule__Subroutine__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Subroutine__Group_3_1_1__0_in_rule__Subroutine__Group_3_1__1__Impl8333);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4122:1: rule__Subroutine__Group_3_1_1__0 : rule__Subroutine__Group_3_1_1__0__Impl rule__Subroutine__Group_3_1_1__1 ;
    public final void rule__Subroutine__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4126:1: ( rule__Subroutine__Group_3_1_1__0__Impl rule__Subroutine__Group_3_1_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4127:2: rule__Subroutine__Group_3_1_1__0__Impl rule__Subroutine__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3_1_1__0__Impl_in_rule__Subroutine__Group_3_1_1__08368);
            rule__Subroutine__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Subroutine__Group_3_1_1__1_in_rule__Subroutine__Group_3_1_1__08371);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4134:1: rule__Subroutine__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Subroutine__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4138:1: ( ( ',' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4139:1: ( ',' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4139:1: ( ',' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4140:1: ','
            {
             before(grammarAccess.getSubroutineAccess().getCommaKeyword_3_1_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Subroutine__Group_3_1_1__0__Impl8399); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4153:1: rule__Subroutine__Group_3_1_1__1 : rule__Subroutine__Group_3_1_1__1__Impl ;
    public final void rule__Subroutine__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4157:1: ( rule__Subroutine__Group_3_1_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4158:2: rule__Subroutine__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Subroutine__Group_3_1_1__1__Impl_in_rule__Subroutine__Group_3_1_1__18430);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4164:1: rule__Subroutine__Group_3_1_1__1__Impl : ( ( rule__Subroutine__ParamsAssignment_3_1_1_1 ) ) ;
    public final void rule__Subroutine__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4168:1: ( ( ( rule__Subroutine__ParamsAssignment_3_1_1_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4169:1: ( ( rule__Subroutine__ParamsAssignment_3_1_1_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4169:1: ( ( rule__Subroutine__ParamsAssignment_3_1_1_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4170:1: ( rule__Subroutine__ParamsAssignment_3_1_1_1 )
            {
             before(grammarAccess.getSubroutineAccess().getParamsAssignment_3_1_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4171:1: ( rule__Subroutine__ParamsAssignment_3_1_1_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4171:2: rule__Subroutine__ParamsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Subroutine__ParamsAssignment_3_1_1_1_in_rule__Subroutine__Group_3_1_1__1__Impl8457);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4185:1: rule__FormalParam__Group__0 : rule__FormalParam__Group__0__Impl rule__FormalParam__Group__1 ;
    public final void rule__FormalParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4189:1: ( rule__FormalParam__Group__0__Impl rule__FormalParam__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4190:2: rule__FormalParam__Group__0__Impl rule__FormalParam__Group__1
            {
            pushFollow(FOLLOW_rule__FormalParam__Group__0__Impl_in_rule__FormalParam__Group__08491);
            rule__FormalParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormalParam__Group__1_in_rule__FormalParam__Group__08494);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4197:1: rule__FormalParam__Group__0__Impl : ( ( rule__FormalParam__IntentAssignment_0 )? ) ;
    public final void rule__FormalParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4201:1: ( ( ( rule__FormalParam__IntentAssignment_0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4202:1: ( ( rule__FormalParam__IntentAssignment_0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4202:1: ( ( rule__FormalParam__IntentAssignment_0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4203:1: ( rule__FormalParam__IntentAssignment_0 )?
            {
             before(grammarAccess.getFormalParamAccess().getIntentAssignment_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4204:1: ( rule__FormalParam__IntentAssignment_0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=40 && LA37_0<=42)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4204:2: rule__FormalParam__IntentAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FormalParam__IntentAssignment_0_in_rule__FormalParam__Group__0__Impl8521);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4214:1: rule__FormalParam__Group__1 : rule__FormalParam__Group__1__Impl rule__FormalParam__Group__2 ;
    public final void rule__FormalParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4218:1: ( rule__FormalParam__Group__1__Impl rule__FormalParam__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4219:2: rule__FormalParam__Group__1__Impl rule__FormalParam__Group__2
            {
            pushFollow(FOLLOW_rule__FormalParam__Group__1__Impl_in_rule__FormalParam__Group__18552);
            rule__FormalParam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormalParam__Group__2_in_rule__FormalParam__Group__18555);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4226:1: rule__FormalParam__Group__1__Impl : ( ( rule__FormalParam__TypeAssignment_1 ) ) ;
    public final void rule__FormalParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4230:1: ( ( ( rule__FormalParam__TypeAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4231:1: ( ( rule__FormalParam__TypeAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4231:1: ( ( rule__FormalParam__TypeAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4232:1: ( rule__FormalParam__TypeAssignment_1 )
            {
             before(grammarAccess.getFormalParamAccess().getTypeAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4233:1: ( rule__FormalParam__TypeAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4233:2: rule__FormalParam__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__FormalParam__TypeAssignment_1_in_rule__FormalParam__Group__1__Impl8582);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4243:1: rule__FormalParam__Group__2 : rule__FormalParam__Group__2__Impl ;
    public final void rule__FormalParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4247:1: ( rule__FormalParam__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4248:2: rule__FormalParam__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FormalParam__Group__2__Impl_in_rule__FormalParam__Group__28612);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4254:1: rule__FormalParam__Group__2__Impl : ( ( rule__FormalParam__NameAssignment_2 ) ) ;
    public final void rule__FormalParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4258:1: ( ( ( rule__FormalParam__NameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4259:1: ( ( rule__FormalParam__NameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4259:1: ( ( rule__FormalParam__NameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4260:1: ( rule__FormalParam__NameAssignment_2 )
            {
             before(grammarAccess.getFormalParamAccess().getNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4261:1: ( rule__FormalParam__NameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4261:2: rule__FormalParam__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__FormalParam__NameAssignment_2_in_rule__FormalParam__Group__2__Impl8639);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4277:1: rule__Type__Group_4__0 : rule__Type__Group_4__0__Impl rule__Type__Group_4__1 ;
    public final void rule__Type__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4281:1: ( rule__Type__Group_4__0__Impl rule__Type__Group_4__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4282:2: rule__Type__Group_4__0__Impl rule__Type__Group_4__1
            {
            pushFollow(FOLLOW_rule__Type__Group_4__0__Impl_in_rule__Type__Group_4__08675);
            rule__Type__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_4__1_in_rule__Type__Group_4__08678);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4289:1: rule__Type__Group_4__0__Impl : ( ( rule__Type__DoubleAssignment_4_0 ) ) ;
    public final void rule__Type__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4293:1: ( ( ( rule__Type__DoubleAssignment_4_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4294:1: ( ( rule__Type__DoubleAssignment_4_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4294:1: ( ( rule__Type__DoubleAssignment_4_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4295:1: ( rule__Type__DoubleAssignment_4_0 )
            {
             before(grammarAccess.getTypeAccess().getDoubleAssignment_4_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4296:1: ( rule__Type__DoubleAssignment_4_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4296:2: rule__Type__DoubleAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Type__DoubleAssignment_4_0_in_rule__Type__Group_4__0__Impl8705);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4306:1: rule__Type__Group_4__1 : rule__Type__Group_4__1__Impl ;
    public final void rule__Type__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4310:1: ( rule__Type__Group_4__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4311:2: rule__Type__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_4__1__Impl_in_rule__Type__Group_4__18735);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4317:1: rule__Type__Group_4__1__Impl : ( ( 'precision' )? ) ;
    public final void rule__Type__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4321:1: ( ( ( 'precision' )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4322:1: ( ( 'precision' )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4322:1: ( ( 'precision' )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4323:1: ( 'precision' )?
            {
             before(grammarAccess.getTypeAccess().getPrecisionKeyword_4_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4324:1: ( 'precision' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==27) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4325:2: 'precision'
                    {
                    match(input,27,FOLLOW_27_in_rule__Type__Group_4__1__Impl8764); 

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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4340:1: rule__Type__Group_5__0 : rule__Type__Group_5__0__Impl rule__Type__Group_5__1 ;
    public final void rule__Type__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4344:1: ( rule__Type__Group_5__0__Impl rule__Type__Group_5__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4345:2: rule__Type__Group_5__0__Impl rule__Type__Group_5__1
            {
            pushFollow(FOLLOW_rule__Type__Group_5__0__Impl_in_rule__Type__Group_5__08801);
            rule__Type__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_5__1_in_rule__Type__Group_5__08804);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4352:1: rule__Type__Group_5__0__Impl : ( ( rule__Type__DerivedAssignment_5_0 ) ) ;
    public final void rule__Type__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4356:1: ( ( ( rule__Type__DerivedAssignment_5_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4357:1: ( ( rule__Type__DerivedAssignment_5_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4357:1: ( ( rule__Type__DerivedAssignment_5_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4358:1: ( rule__Type__DerivedAssignment_5_0 )
            {
             before(grammarAccess.getTypeAccess().getDerivedAssignment_5_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4359:1: ( rule__Type__DerivedAssignment_5_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4359:2: rule__Type__DerivedAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Type__DerivedAssignment_5_0_in_rule__Type__Group_5__0__Impl8831);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4369:1: rule__Type__Group_5__1 : rule__Type__Group_5__1__Impl rule__Type__Group_5__2 ;
    public final void rule__Type__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4373:1: ( rule__Type__Group_5__1__Impl rule__Type__Group_5__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4374:2: rule__Type__Group_5__1__Impl rule__Type__Group_5__2
            {
            pushFollow(FOLLOW_rule__Type__Group_5__1__Impl_in_rule__Type__Group_5__18861);
            rule__Type__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_5__2_in_rule__Type__Group_5__18864);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4381:1: rule__Type__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Type__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4385:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4386:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4386:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4387:1: '('
            {
             before(grammarAccess.getTypeAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,20,FOLLOW_20_in_rule__Type__Group_5__1__Impl8892); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4400:1: rule__Type__Group_5__2 : rule__Type__Group_5__2__Impl rule__Type__Group_5__3 ;
    public final void rule__Type__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4404:1: ( rule__Type__Group_5__2__Impl rule__Type__Group_5__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4405:2: rule__Type__Group_5__2__Impl rule__Type__Group_5__3
            {
            pushFollow(FOLLOW_rule__Type__Group_5__2__Impl_in_rule__Type__Group_5__28923);
            rule__Type__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Type__Group_5__3_in_rule__Type__Group_5__28926);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4412:1: rule__Type__Group_5__2__Impl : ( ( rule__Type__DerivedTypeAssignment_5_2 ) ) ;
    public final void rule__Type__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4416:1: ( ( ( rule__Type__DerivedTypeAssignment_5_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4417:1: ( ( rule__Type__DerivedTypeAssignment_5_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4417:1: ( ( rule__Type__DerivedTypeAssignment_5_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4418:1: ( rule__Type__DerivedTypeAssignment_5_2 )
            {
             before(grammarAccess.getTypeAccess().getDerivedTypeAssignment_5_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4419:1: ( rule__Type__DerivedTypeAssignment_5_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4419:2: rule__Type__DerivedTypeAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Type__DerivedTypeAssignment_5_2_in_rule__Type__Group_5__2__Impl8953);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4429:1: rule__Type__Group_5__3 : rule__Type__Group_5__3__Impl ;
    public final void rule__Type__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4433:1: ( rule__Type__Group_5__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4434:2: rule__Type__Group_5__3__Impl
            {
            pushFollow(FOLLOW_rule__Type__Group_5__3__Impl_in_rule__Type__Group_5__38983);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4440:1: rule__Type__Group_5__3__Impl : ( ')' ) ;
    public final void rule__Type__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4444:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4445:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4445:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4446:1: ')'
            {
             before(grammarAccess.getTypeAccess().getRightParenthesisKeyword_5_3()); 
            match(input,21,FOLLOW_21_in_rule__Type__Group_5__3__Impl9011); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4467:1: rule__SubroutineName__Group__0 : rule__SubroutineName__Group__0__Impl rule__SubroutineName__Group__1 ;
    public final void rule__SubroutineName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4471:1: ( rule__SubroutineName__Group__0__Impl rule__SubroutineName__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4472:2: rule__SubroutineName__Group__0__Impl rule__SubroutineName__Group__1
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group__0__Impl_in_rule__SubroutineName__Group__09050);
            rule__SubroutineName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubroutineName__Group__1_in_rule__SubroutineName__Group__09053);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4479:1: rule__SubroutineName__Group__0__Impl : ( 'subroutineName' ) ;
    public final void rule__SubroutineName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4483:1: ( ( 'subroutineName' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4484:1: ( 'subroutineName' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4484:1: ( 'subroutineName' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4485:1: 'subroutineName'
            {
             before(grammarAccess.getSubroutineNameAccess().getSubroutineNameKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__SubroutineName__Group__0__Impl9081); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4498:1: rule__SubroutineName__Group__1 : rule__SubroutineName__Group__1__Impl rule__SubroutineName__Group__2 ;
    public final void rule__SubroutineName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4502:1: ( rule__SubroutineName__Group__1__Impl rule__SubroutineName__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4503:2: rule__SubroutineName__Group__1__Impl rule__SubroutineName__Group__2
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group__1__Impl_in_rule__SubroutineName__Group__19112);
            rule__SubroutineName__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubroutineName__Group__2_in_rule__SubroutineName__Group__19115);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4510:1: rule__SubroutineName__Group__1__Impl : ( () ) ;
    public final void rule__SubroutineName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4514:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4515:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4515:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4516:1: ()
            {
             before(grammarAccess.getSubroutineNameAccess().getSubroutineNameAction_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4517:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4519:1: 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4529:1: rule__SubroutineName__Group__2 : rule__SubroutineName__Group__2__Impl ;
    public final void rule__SubroutineName__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4533:1: ( rule__SubroutineName__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4534:2: rule__SubroutineName__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group__2__Impl_in_rule__SubroutineName__Group__29173);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4540:1: rule__SubroutineName__Group__2__Impl : ( ( rule__SubroutineName__Group_2__0 )? ) ;
    public final void rule__SubroutineName__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4544:1: ( ( ( rule__SubroutineName__Group_2__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4545:1: ( ( rule__SubroutineName__Group_2__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4545:1: ( ( rule__SubroutineName__Group_2__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4546:1: ( rule__SubroutineName__Group_2__0 )?
            {
             before(grammarAccess.getSubroutineNameAccess().getGroup_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4547:1: ( rule__SubroutineName__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==20) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4547:2: rule__SubroutineName__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__SubroutineName__Group_2__0_in_rule__SubroutineName__Group__2__Impl9200);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4563:1: rule__SubroutineName__Group_2__0 : rule__SubroutineName__Group_2__0__Impl rule__SubroutineName__Group_2__1 ;
    public final void rule__SubroutineName__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4567:1: ( rule__SubroutineName__Group_2__0__Impl rule__SubroutineName__Group_2__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4568:2: rule__SubroutineName__Group_2__0__Impl rule__SubroutineName__Group_2__1
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group_2__0__Impl_in_rule__SubroutineName__Group_2__09237);
            rule__SubroutineName__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubroutineName__Group_2__1_in_rule__SubroutineName__Group_2__09240);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4575:1: rule__SubroutineName__Group_2__0__Impl : ( '(' ) ;
    public final void rule__SubroutineName__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4579:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4580:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4580:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4581:1: '('
            {
             before(grammarAccess.getSubroutineNameAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,20,FOLLOW_20_in_rule__SubroutineName__Group_2__0__Impl9268); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4594:1: rule__SubroutineName__Group_2__1 : rule__SubroutineName__Group_2__1__Impl rule__SubroutineName__Group_2__2 ;
    public final void rule__SubroutineName__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4598:1: ( rule__SubroutineName__Group_2__1__Impl rule__SubroutineName__Group_2__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4599:2: rule__SubroutineName__Group_2__1__Impl rule__SubroutineName__Group_2__2
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group_2__1__Impl_in_rule__SubroutineName__Group_2__19299);
            rule__SubroutineName__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SubroutineName__Group_2__2_in_rule__SubroutineName__Group_2__19302);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4606:1: rule__SubroutineName__Group_2__1__Impl : ( ( rule__SubroutineName__NameAssignment_2_1 ) ) ;
    public final void rule__SubroutineName__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4610:1: ( ( ( rule__SubroutineName__NameAssignment_2_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4611:1: ( ( rule__SubroutineName__NameAssignment_2_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4611:1: ( ( rule__SubroutineName__NameAssignment_2_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4612:1: ( rule__SubroutineName__NameAssignment_2_1 )
            {
             before(grammarAccess.getSubroutineNameAccess().getNameAssignment_2_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4613:1: ( rule__SubroutineName__NameAssignment_2_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4613:2: rule__SubroutineName__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SubroutineName__NameAssignment_2_1_in_rule__SubroutineName__Group_2__1__Impl9329);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4623:1: rule__SubroutineName__Group_2__2 : rule__SubroutineName__Group_2__2__Impl ;
    public final void rule__SubroutineName__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4627:1: ( rule__SubroutineName__Group_2__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4628:2: rule__SubroutineName__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__SubroutineName__Group_2__2__Impl_in_rule__SubroutineName__Group_2__29359);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4634:1: rule__SubroutineName__Group_2__2__Impl : ( ')' ) ;
    public final void rule__SubroutineName__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4638:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4639:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4639:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4640:1: ')'
            {
             before(grammarAccess.getSubroutineNameAccess().getRightParenthesisKeyword_2_2()); 
            match(input,21,FOLLOW_21_in_rule__SubroutineName__Group_2__2__Impl9387); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4659:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4663:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4664:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__09424);
            rule__Call__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__1_in_rule__Call__Group__09427);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4671:1: rule__Call__Group__0__Impl : ( 'call' ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4675:1: ( ( 'call' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4676:1: ( 'call' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4676:1: ( 'call' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4677:1: 'call'
            {
             before(grammarAccess.getCallAccess().getCallKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Call__Group__0__Impl9455); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4690:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4694:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4695:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__19486);
            rule__Call__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__2_in_rule__Call__Group__19489);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4702:1: rule__Call__Group__1__Impl : ( '(' ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4706:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4707:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4707:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4708:1: '('
            {
             before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__Call__Group__1__Impl9517); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4721:1: rule__Call__Group__2 : rule__Call__Group__2__Impl rule__Call__Group__3 ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4725:1: ( rule__Call__Group__2__Impl rule__Call__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4726:2: rule__Call__Group__2__Impl rule__Call__Group__3
            {
            pushFollow(FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__29548);
            rule__Call__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__3_in_rule__Call__Group__29551);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4733:1: rule__Call__Group__2__Impl : ( ( rule__Call__SubroutineNameAssignment_2 ) ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4737:1: ( ( ( rule__Call__SubroutineNameAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4738:1: ( ( rule__Call__SubroutineNameAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4738:1: ( ( rule__Call__SubroutineNameAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4739:1: ( rule__Call__SubroutineNameAssignment_2 )
            {
             before(grammarAccess.getCallAccess().getSubroutineNameAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4740:1: ( rule__Call__SubroutineNameAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4740:2: rule__Call__SubroutineNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Call__SubroutineNameAssignment_2_in_rule__Call__Group__2__Impl9578);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4750:1: rule__Call__Group__3 : rule__Call__Group__3__Impl rule__Call__Group__4 ;
    public final void rule__Call__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4754:1: ( rule__Call__Group__3__Impl rule__Call__Group__4 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4755:2: rule__Call__Group__3__Impl rule__Call__Group__4
            {
            pushFollow(FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__39608);
            rule__Call__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group__4_in_rule__Call__Group__39611);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4762:1: rule__Call__Group__3__Impl : ( ( rule__Call__Group_3__0 )? ) ;
    public final void rule__Call__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4766:1: ( ( ( rule__Call__Group_3__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4767:1: ( ( rule__Call__Group_3__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4767:1: ( ( rule__Call__Group_3__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4768:1: ( rule__Call__Group_3__0 )?
            {
             before(grammarAccess.getCallAccess().getGroup_3()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4769:1: ( rule__Call__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==20) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4769:2: rule__Call__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl9638);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4779:1: rule__Call__Group__4 : rule__Call__Group__4__Impl ;
    public final void rule__Call__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4783:1: ( rule__Call__Group__4__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4784:2: rule__Call__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__49669);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4790:1: rule__Call__Group__4__Impl : ( ')' ) ;
    public final void rule__Call__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4794:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4795:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4795:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4796:1: ')'
            {
             before(grammarAccess.getCallAccess().getRightParenthesisKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Call__Group__4__Impl9697); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4819:1: rule__Call__Group_3__0 : rule__Call__Group_3__0__Impl rule__Call__Group_3__1 ;
    public final void rule__Call__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4823:1: ( rule__Call__Group_3__0__Impl rule__Call__Group_3__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4824:2: rule__Call__Group_3__0__Impl rule__Call__Group_3__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__09738);
            rule__Call__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__09741);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4831:1: rule__Call__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Call__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4835:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4836:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4836:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4837:1: '('
            {
             before(grammarAccess.getCallAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__Call__Group_3__0__Impl9769); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4850:1: rule__Call__Group_3__1 : rule__Call__Group_3__1__Impl rule__Call__Group_3__2 ;
    public final void rule__Call__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4854:1: ( rule__Call__Group_3__1__Impl rule__Call__Group_3__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4855:2: rule__Call__Group_3__1__Impl rule__Call__Group_3__2
            {
            pushFollow(FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__19800);
            rule__Call__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3__2_in_rule__Call__Group_3__19803);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4862:1: rule__Call__Group_3__1__Impl : ( ( rule__Call__Group_3_1__0 )? ) ;
    public final void rule__Call__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4866:1: ( ( ( rule__Call__Group_3_1__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4867:1: ( ( rule__Call__Group_3_1__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4867:1: ( ( rule__Call__Group_3_1__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4868:1: ( rule__Call__Group_3_1__0 )?
            {
             before(grammarAccess.getCallAccess().getGroup_3_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4869:1: ( rule__Call__Group_3_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_INT && LA41_0<=RULE_ID)||LA41_0==32||LA41_0==38) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4869:2: rule__Call__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Call__Group_3_1__0_in_rule__Call__Group_3__1__Impl9830);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4879:1: rule__Call__Group_3__2 : rule__Call__Group_3__2__Impl ;
    public final void rule__Call__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4883:1: ( rule__Call__Group_3__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4884:2: rule__Call__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3__2__Impl_in_rule__Call__Group_3__29861);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4890:1: rule__Call__Group_3__2__Impl : ( ')' ) ;
    public final void rule__Call__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4894:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4895:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4895:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4896:1: ')'
            {
             before(grammarAccess.getCallAccess().getRightParenthesisKeyword_3_2()); 
            match(input,21,FOLLOW_21_in_rule__Call__Group_3__2__Impl9889); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4915:1: rule__Call__Group_3_1__0 : rule__Call__Group_3_1__0__Impl rule__Call__Group_3_1__1 ;
    public final void rule__Call__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4919:1: ( rule__Call__Group_3_1__0__Impl rule__Call__Group_3_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4920:2: rule__Call__Group_3_1__0__Impl rule__Call__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1__0__Impl_in_rule__Call__Group_3_1__09926);
            rule__Call__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3_1__1_in_rule__Call__Group_3_1__09929);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4927:1: rule__Call__Group_3_1__0__Impl : ( ( rule__Call__ParamsAssignment_3_1_0 ) ) ;
    public final void rule__Call__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4931:1: ( ( ( rule__Call__ParamsAssignment_3_1_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4932:1: ( ( rule__Call__ParamsAssignment_3_1_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4932:1: ( ( rule__Call__ParamsAssignment_3_1_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4933:1: ( rule__Call__ParamsAssignment_3_1_0 )
            {
             before(grammarAccess.getCallAccess().getParamsAssignment_3_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4934:1: ( rule__Call__ParamsAssignment_3_1_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4934:2: rule__Call__ParamsAssignment_3_1_0
            {
            pushFollow(FOLLOW_rule__Call__ParamsAssignment_3_1_0_in_rule__Call__Group_3_1__0__Impl9956);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4944:1: rule__Call__Group_3_1__1 : rule__Call__Group_3_1__1__Impl ;
    public final void rule__Call__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4948:1: ( rule__Call__Group_3_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4949:2: rule__Call__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1__1__Impl_in_rule__Call__Group_3_1__19986);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4955:1: rule__Call__Group_3_1__1__Impl : ( ( rule__Call__Group_3_1_1__0 )* ) ;
    public final void rule__Call__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4959:1: ( ( ( rule__Call__Group_3_1_1__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4960:1: ( ( rule__Call__Group_3_1_1__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4960:1: ( ( rule__Call__Group_3_1_1__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4961:1: ( rule__Call__Group_3_1_1__0 )*
            {
             before(grammarAccess.getCallAccess().getGroup_3_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4962:1: ( rule__Call__Group_3_1_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==26) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4962:2: rule__Call__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Call__Group_3_1_1__0_in_rule__Call__Group_3_1__1__Impl10013);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4976:1: rule__Call__Group_3_1_1__0 : rule__Call__Group_3_1_1__0__Impl rule__Call__Group_3_1_1__1 ;
    public final void rule__Call__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4980:1: ( rule__Call__Group_3_1_1__0__Impl rule__Call__Group_3_1_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4981:2: rule__Call__Group_3_1_1__0__Impl rule__Call__Group_3_1_1__1
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1_1__0__Impl_in_rule__Call__Group_3_1_1__010048);
            rule__Call__Group_3_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Call__Group_3_1_1__1_in_rule__Call__Group_3_1_1__010051);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4988:1: rule__Call__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__Call__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4992:1: ( ( ',' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4993:1: ( ',' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4993:1: ( ',' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:4994:1: ','
            {
             before(grammarAccess.getCallAccess().getCommaKeyword_3_1_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Call__Group_3_1_1__0__Impl10079); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5007:1: rule__Call__Group_3_1_1__1 : rule__Call__Group_3_1_1__1__Impl ;
    public final void rule__Call__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5011:1: ( rule__Call__Group_3_1_1__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5012:2: rule__Call__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Call__Group_3_1_1__1__Impl_in_rule__Call__Group_3_1_1__110110);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5018:1: rule__Call__Group_3_1_1__1__Impl : ( ( rule__Call__ParamsAssignment_3_1_1_1 ) ) ;
    public final void rule__Call__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5022:1: ( ( ( rule__Call__ParamsAssignment_3_1_1_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5023:1: ( ( rule__Call__ParamsAssignment_3_1_1_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5023:1: ( ( rule__Call__ParamsAssignment_3_1_1_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5024:1: ( rule__Call__ParamsAssignment_3_1_1_1 )
            {
             before(grammarAccess.getCallAccess().getParamsAssignment_3_1_1_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5025:1: ( rule__Call__ParamsAssignment_3_1_1_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5025:2: rule__Call__ParamsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_rule__Call__ParamsAssignment_3_1_1_1_in_rule__Call__Group_3_1_1__1__Impl10137);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5039:1: rule__ActualParam__Group__0 : rule__ActualParam__Group__0__Impl rule__ActualParam__Group__1 ;
    public final void rule__ActualParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5043:1: ( rule__ActualParam__Group__0__Impl rule__ActualParam__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5044:2: rule__ActualParam__Group__0__Impl rule__ActualParam__Group__1
            {
            pushFollow(FOLLOW_rule__ActualParam__Group__0__Impl_in_rule__ActualParam__Group__010171);
            rule__ActualParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParam__Group__1_in_rule__ActualParam__Group__010174);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5051:1: rule__ActualParam__Group__0__Impl : ( ( rule__ActualParam__Group_0__0 )? ) ;
    public final void rule__ActualParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5055:1: ( ( ( rule__ActualParam__Group_0__0 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5056:1: ( ( rule__ActualParam__Group_0__0 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5056:1: ( ( rule__ActualParam__Group_0__0 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5057:1: ( rule__ActualParam__Group_0__0 )?
            {
             before(grammarAccess.getActualParamAccess().getGroup_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5058:1: ( rule__ActualParam__Group_0__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==15||LA43_1==49) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5058:2: rule__ActualParam__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ActualParam__Group_0__0_in_rule__ActualParam__Group__0__Impl10201);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5068:1: rule__ActualParam__Group__1 : rule__ActualParam__Group__1__Impl ;
    public final void rule__ActualParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5072:1: ( rule__ActualParam__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5073:2: rule__ActualParam__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ActualParam__Group__1__Impl_in_rule__ActualParam__Group__110232);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5079:1: rule__ActualParam__Group__1__Impl : ( ( rule__ActualParam__ValueAssignment_1 ) ) ;
    public final void rule__ActualParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5083:1: ( ( ( rule__ActualParam__ValueAssignment_1 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5084:1: ( ( rule__ActualParam__ValueAssignment_1 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5084:1: ( ( rule__ActualParam__ValueAssignment_1 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5085:1: ( rule__ActualParam__ValueAssignment_1 )
            {
             before(grammarAccess.getActualParamAccess().getValueAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5086:1: ( rule__ActualParam__ValueAssignment_1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5086:2: rule__ActualParam__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__ActualParam__ValueAssignment_1_in_rule__ActualParam__Group__1__Impl10259);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5100:1: rule__ActualParam__Group_0__0 : rule__ActualParam__Group_0__0__Impl rule__ActualParam__Group_0__1 ;
    public final void rule__ActualParam__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5104:1: ( rule__ActualParam__Group_0__0__Impl rule__ActualParam__Group_0__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5105:2: rule__ActualParam__Group_0__0__Impl rule__ActualParam__Group_0__1
            {
            pushFollow(FOLLOW_rule__ActualParam__Group_0__0__Impl_in_rule__ActualParam__Group_0__010293);
            rule__ActualParam__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParam__Group_0__1_in_rule__ActualParam__Group_0__010296);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5112:1: rule__ActualParam__Group_0__0__Impl : ( ( rule__ActualParam__KeywordAssignment_0_0 ) ) ;
    public final void rule__ActualParam__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5116:1: ( ( ( rule__ActualParam__KeywordAssignment_0_0 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5117:1: ( ( rule__ActualParam__KeywordAssignment_0_0 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5117:1: ( ( rule__ActualParam__KeywordAssignment_0_0 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5118:1: ( rule__ActualParam__KeywordAssignment_0_0 )
            {
             before(grammarAccess.getActualParamAccess().getKeywordAssignment_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5119:1: ( rule__ActualParam__KeywordAssignment_0_0 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5119:2: rule__ActualParam__KeywordAssignment_0_0
            {
            pushFollow(FOLLOW_rule__ActualParam__KeywordAssignment_0_0_in_rule__ActualParam__Group_0__0__Impl10323);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5129:1: rule__ActualParam__Group_0__1 : rule__ActualParam__Group_0__1__Impl rule__ActualParam__Group_0__2 ;
    public final void rule__ActualParam__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5133:1: ( rule__ActualParam__Group_0__1__Impl rule__ActualParam__Group_0__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5134:2: rule__ActualParam__Group_0__1__Impl rule__ActualParam__Group_0__2
            {
            pushFollow(FOLLOW_rule__ActualParam__Group_0__1__Impl_in_rule__ActualParam__Group_0__110353);
            rule__ActualParam__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParam__Group_0__2_in_rule__ActualParam__Group_0__110356);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5141:1: rule__ActualParam__Group_0__1__Impl : ( ( rule__ActualParam__OptionalAssignment_0_1 )? ) ;
    public final void rule__ActualParam__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5145:1: ( ( ( rule__ActualParam__OptionalAssignment_0_1 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5146:1: ( ( rule__ActualParam__OptionalAssignment_0_1 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5146:1: ( ( rule__ActualParam__OptionalAssignment_0_1 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5147:1: ( rule__ActualParam__OptionalAssignment_0_1 )?
            {
             before(grammarAccess.getActualParamAccess().getOptionalAssignment_0_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5148:1: ( rule__ActualParam__OptionalAssignment_0_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5148:2: rule__ActualParam__OptionalAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__ActualParam__OptionalAssignment_0_1_in_rule__ActualParam__Group_0__1__Impl10383);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5158:1: rule__ActualParam__Group_0__2 : rule__ActualParam__Group_0__2__Impl ;
    public final void rule__ActualParam__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5162:1: ( rule__ActualParam__Group_0__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5163:2: rule__ActualParam__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__ActualParam__Group_0__2__Impl_in_rule__ActualParam__Group_0__210414);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5169:1: rule__ActualParam__Group_0__2__Impl : ( '=' ) ;
    public final void rule__ActualParam__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5173:1: ( ( '=' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5174:1: ( '=' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5174:1: ( '=' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5175:1: '='
            {
             before(grammarAccess.getActualParamAccess().getEqualsSignKeyword_0_2()); 
            match(input,15,FOLLOW_15_in_rule__ActualParam__Group_0__2__Impl10442); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5194:1: rule__ActualParamByKeyword__Group__0 : rule__ActualParamByKeyword__Group__0__Impl rule__ActualParamByKeyword__Group__1 ;
    public final void rule__ActualParamByKeyword__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5198:1: ( rule__ActualParamByKeyword__Group__0__Impl rule__ActualParamByKeyword__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5199:2: rule__ActualParamByKeyword__Group__0__Impl rule__ActualParamByKeyword__Group__1
            {
            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__0__Impl_in_rule__ActualParamByKeyword__Group__010479);
            rule__ActualParamByKeyword__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__1_in_rule__ActualParamByKeyword__Group__010482);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5206:1: rule__ActualParamByKeyword__Group__0__Impl : ( 'actualParamByKeyword' ) ;
    public final void rule__ActualParamByKeyword__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5210:1: ( ( 'actualParamByKeyword' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5211:1: ( 'actualParamByKeyword' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5211:1: ( 'actualParamByKeyword' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5212:1: 'actualParamByKeyword'
            {
             before(grammarAccess.getActualParamByKeywordAccess().getActualParamByKeywordKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ActualParamByKeyword__Group__0__Impl10510); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5225:1: rule__ActualParamByKeyword__Group__1 : rule__ActualParamByKeyword__Group__1__Impl rule__ActualParamByKeyword__Group__2 ;
    public final void rule__ActualParamByKeyword__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5229:1: ( rule__ActualParamByKeyword__Group__1__Impl rule__ActualParamByKeyword__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5230:2: rule__ActualParamByKeyword__Group__1__Impl rule__ActualParamByKeyword__Group__2
            {
            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__1__Impl_in_rule__ActualParamByKeyword__Group__110541);
            rule__ActualParamByKeyword__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__2_in_rule__ActualParamByKeyword__Group__110544);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5237:1: rule__ActualParamByKeyword__Group__1__Impl : ( '(' ) ;
    public final void rule__ActualParamByKeyword__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5241:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5242:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5242:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5243:1: '('
            {
             before(grammarAccess.getActualParamByKeywordAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__ActualParamByKeyword__Group__1__Impl10572); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5256:1: rule__ActualParamByKeyword__Group__2 : rule__ActualParamByKeyword__Group__2__Impl rule__ActualParamByKeyword__Group__3 ;
    public final void rule__ActualParamByKeyword__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5260:1: ( rule__ActualParamByKeyword__Group__2__Impl rule__ActualParamByKeyword__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5261:2: rule__ActualParamByKeyword__Group__2__Impl rule__ActualParamByKeyword__Group__3
            {
            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__2__Impl_in_rule__ActualParamByKeyword__Group__210603);
            rule__ActualParamByKeyword__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__3_in_rule__ActualParamByKeyword__Group__210606);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5268:1: rule__ActualParamByKeyword__Group__2__Impl : ( ( rule__ActualParamByKeyword__KeywordAssignment_2 ) ) ;
    public final void rule__ActualParamByKeyword__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5272:1: ( ( ( rule__ActualParamByKeyword__KeywordAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5273:1: ( ( rule__ActualParamByKeyword__KeywordAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5273:1: ( ( rule__ActualParamByKeyword__KeywordAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5274:1: ( rule__ActualParamByKeyword__KeywordAssignment_2 )
            {
             before(grammarAccess.getActualParamByKeywordAccess().getKeywordAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5275:1: ( rule__ActualParamByKeyword__KeywordAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5275:2: rule__ActualParamByKeyword__KeywordAssignment_2
            {
            pushFollow(FOLLOW_rule__ActualParamByKeyword__KeywordAssignment_2_in_rule__ActualParamByKeyword__Group__2__Impl10633);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5285:1: rule__ActualParamByKeyword__Group__3 : rule__ActualParamByKeyword__Group__3__Impl ;
    public final void rule__ActualParamByKeyword__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5289:1: ( rule__ActualParamByKeyword__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5290:2: rule__ActualParamByKeyword__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ActualParamByKeyword__Group__3__Impl_in_rule__ActualParamByKeyword__Group__310663);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5296:1: rule__ActualParamByKeyword__Group__3__Impl : ( ')' ) ;
    public final void rule__ActualParamByKeyword__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5300:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5301:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5301:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5302:1: ')'
            {
             before(grammarAccess.getActualParamByKeywordAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__ActualParamByKeyword__Group__3__Impl10691); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5323:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5327:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5328:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__010730);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__010733);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5335:1: rule__VariableDeclaration__Group__0__Impl : ( 'declaration' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5339:1: ( ( 'declaration' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5340:1: ( 'declaration' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5340:1: ( 'declaration' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5341:1: 'declaration'
            {
             before(grammarAccess.getVariableDeclarationAccess().getDeclarationKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__VariableDeclaration__Group__0__Impl10761); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5354:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5358:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5359:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__110792);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__110795);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5366:1: rule__VariableDeclaration__Group__1__Impl : ( '(' ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5370:1: ( ( '(' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5371:1: ( '(' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5371:1: ( '(' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5372:1: '('
            {
             before(grammarAccess.getVariableDeclarationAccess().getLeftParenthesisKeyword_1()); 
            match(input,20,FOLLOW_20_in_rule__VariableDeclaration__Group__1__Impl10823); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5385:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5389:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5390:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__210854);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__210857);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5397:1: rule__VariableDeclaration__Group__2__Impl : ( ( rule__VariableDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5401:1: ( ( ( rule__VariableDeclaration__TypeAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5402:1: ( ( rule__VariableDeclaration__TypeAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5402:1: ( ( rule__VariableDeclaration__TypeAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5403:1: ( rule__VariableDeclaration__TypeAssignment_2 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5404:1: ( rule__VariableDeclaration__TypeAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5404:2: rule__VariableDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__TypeAssignment_2_in_rule__VariableDeclaration__Group__2__Impl10884);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5414:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5418:1: ( rule__VariableDeclaration__Group__3__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5419:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__310914);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5425:1: rule__VariableDeclaration__Group__3__Impl : ( ')' ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5429:1: ( ( ')' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5430:1: ( ')' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5430:1: ( ')' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5431:1: ')'
            {
             before(grammarAccess.getVariableDeclarationAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__VariableDeclaration__Group__3__Impl10942); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5452:1: rule__PathExpr__Group__0 : rule__PathExpr__Group__0__Impl rule__PathExpr__Group__1 ;
    public final void rule__PathExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5456:1: ( rule__PathExpr__Group__0__Impl rule__PathExpr__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5457:2: rule__PathExpr__Group__0__Impl rule__PathExpr__Group__1
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__0__Impl_in_rule__PathExpr__Group__010981);
            rule__PathExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExpr__Group__1_in_rule__PathExpr__Group__010984);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5464:1: rule__PathExpr__Group__0__Impl : ( '#' ) ;
    public final void rule__PathExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5468:1: ( ( '#' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5469:1: ( '#' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5469:1: ( '#' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5470:1: '#'
            {
             before(grammarAccess.getPathExprAccess().getNumberSignKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__PathExpr__Group__0__Impl11012); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5483:1: rule__PathExpr__Group__1 : rule__PathExpr__Group__1__Impl ;
    public final void rule__PathExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5487:1: ( rule__PathExpr__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5488:2: rule__PathExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PathExpr__Group__1__Impl_in_rule__PathExpr__Group__111043);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5494:1: rule__PathExpr__Group__1__Impl : ( rulePathExprNode ) ;
    public final void rule__PathExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5498:1: ( ( rulePathExprNode ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5499:1: ( rulePathExprNode )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5499:1: ( rulePathExprNode )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5500:1: rulePathExprNode
            {
             before(grammarAccess.getPathExprAccess().getPathExprNodeParserRuleCall_1()); 
            pushFollow(FOLLOW_rulePathExprNode_in_rule__PathExpr__Group__1__Impl11070);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5515:1: rule__PathExprNode__Group__0 : rule__PathExprNode__Group__0__Impl rule__PathExprNode__Group__1 ;
    public final void rule__PathExprNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5519:1: ( rule__PathExprNode__Group__0__Impl rule__PathExprNode__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5520:2: rule__PathExprNode__Group__0__Impl rule__PathExprNode__Group__1
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group__0__Impl_in_rule__PathExprNode__Group__011103);
            rule__PathExprNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExprNode__Group__1_in_rule__PathExprNode__Group__011106);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5527:1: rule__PathExprNode__Group__0__Impl : ( rulePathExprTerm ) ;
    public final void rule__PathExprNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5531:1: ( ( rulePathExprTerm ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5532:1: ( rulePathExprTerm )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5532:1: ( rulePathExprTerm )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5533:1: rulePathExprTerm
            {
             before(grammarAccess.getPathExprNodeAccess().getPathExprTermParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePathExprTerm_in_rule__PathExprNode__Group__0__Impl11133);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5544:1: rule__PathExprNode__Group__1 : rule__PathExprNode__Group__1__Impl ;
    public final void rule__PathExprNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5548:1: ( rule__PathExprNode__Group__1__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5549:2: rule__PathExprNode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group__1__Impl_in_rule__PathExprNode__Group__111162);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5555:1: rule__PathExprNode__Group__1__Impl : ( ( rule__PathExprNode__Group_1__0 )* ) ;
    public final void rule__PathExprNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5559:1: ( ( ( rule__PathExprNode__Group_1__0 )* ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5560:1: ( ( rule__PathExprNode__Group_1__0 )* )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5560:1: ( ( rule__PathExprNode__Group_1__0 )* )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5561:1: ( rule__PathExprNode__Group_1__0 )*
            {
             before(grammarAccess.getPathExprNodeAccess().getGroup_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5562:1: ( rule__PathExprNode__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==33) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5562:2: rule__PathExprNode__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PathExprNode__Group_1__0_in_rule__PathExprNode__Group__1__Impl11189);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5576:1: rule__PathExprNode__Group_1__0 : rule__PathExprNode__Group_1__0__Impl rule__PathExprNode__Group_1__1 ;
    public final void rule__PathExprNode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5580:1: ( rule__PathExprNode__Group_1__0__Impl rule__PathExprNode__Group_1__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5581:2: rule__PathExprNode__Group_1__0__Impl rule__PathExprNode__Group_1__1
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group_1__0__Impl_in_rule__PathExprNode__Group_1__011224);
            rule__PathExprNode__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExprNode__Group_1__1_in_rule__PathExprNode__Group_1__011227);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5588:1: rule__PathExprNode__Group_1__0__Impl : ( () ) ;
    public final void rule__PathExprNode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5592:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5593:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5593:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5594:1: ()
            {
             before(grammarAccess.getPathExprNodeAccess().getPathExprHeadAction_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5595:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5597:1: 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5607:1: rule__PathExprNode__Group_1__1 : rule__PathExprNode__Group_1__1__Impl rule__PathExprNode__Group_1__2 ;
    public final void rule__PathExprNode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5611:1: ( rule__PathExprNode__Group_1__1__Impl rule__PathExprNode__Group_1__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5612:2: rule__PathExprNode__Group_1__1__Impl rule__PathExprNode__Group_1__2
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group_1__1__Impl_in_rule__PathExprNode__Group_1__111285);
            rule__PathExprNode__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExprNode__Group_1__2_in_rule__PathExprNode__Group_1__111288);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5619:1: rule__PathExprNode__Group_1__1__Impl : ( '/' ) ;
    public final void rule__PathExprNode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5623:1: ( ( '/' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5624:1: ( '/' )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5624:1: ( '/' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5625:1: '/'
            {
             before(grammarAccess.getPathExprNodeAccess().getSolidusKeyword_1_1()); 
            match(input,33,FOLLOW_33_in_rule__PathExprNode__Group_1__1__Impl11316); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5638:1: rule__PathExprNode__Group_1__2 : rule__PathExprNode__Group_1__2__Impl ;
    public final void rule__PathExprNode__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5642:1: ( rule__PathExprNode__Group_1__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5643:2: rule__PathExprNode__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PathExprNode__Group_1__2__Impl_in_rule__PathExprNode__Group_1__211347);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5649:1: rule__PathExprNode__Group_1__2__Impl : ( ( rule__PathExprNode__TailAssignment_1_2 ) ) ;
    public final void rule__PathExprNode__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5653:1: ( ( ( rule__PathExprNode__TailAssignment_1_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5654:1: ( ( rule__PathExprNode__TailAssignment_1_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5654:1: ( ( rule__PathExprNode__TailAssignment_1_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5655:1: ( rule__PathExprNode__TailAssignment_1_2 )
            {
             before(grammarAccess.getPathExprNodeAccess().getTailAssignment_1_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5656:1: ( rule__PathExprNode__TailAssignment_1_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5656:2: rule__PathExprNode__TailAssignment_1_2
            {
            pushFollow(FOLLOW_rule__PathExprNode__TailAssignment_1_2_in_rule__PathExprNode__Group_1__2__Impl11374);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5672:1: rule__PathExprTerm__Group__0 : rule__PathExprTerm__Group__0__Impl rule__PathExprTerm__Group__1 ;
    public final void rule__PathExprTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5676:1: ( rule__PathExprTerm__Group__0__Impl rule__PathExprTerm__Group__1 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5677:2: rule__PathExprTerm__Group__0__Impl rule__PathExprTerm__Group__1
            {
            pushFollow(FOLLOW_rule__PathExprTerm__Group__0__Impl_in_rule__PathExprTerm__Group__011410);
            rule__PathExprTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExprTerm__Group__1_in_rule__PathExprTerm__Group__011413);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5684:1: rule__PathExprTerm__Group__0__Impl : ( () ) ;
    public final void rule__PathExprTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5688:1: ( ( () ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5689:1: ( () )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5689:1: ( () )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5690:1: ()
            {
             before(grammarAccess.getPathExprTermAccess().getPathExprTermAction_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5691:1: ()
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5693:1: 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5703:1: rule__PathExprTerm__Group__1 : rule__PathExprTerm__Group__1__Impl rule__PathExprTerm__Group__2 ;
    public final void rule__PathExprTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5707:1: ( rule__PathExprTerm__Group__1__Impl rule__PathExprTerm__Group__2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5708:2: rule__PathExprTerm__Group__1__Impl rule__PathExprTerm__Group__2
            {
            pushFollow(FOLLOW_rule__PathExprTerm__Group__1__Impl_in_rule__PathExprTerm__Group__111471);
            rule__PathExprTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PathExprTerm__Group__2_in_rule__PathExprTerm__Group__111474);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5715:1: rule__PathExprTerm__Group__1__Impl : ( ( rule__PathExprTerm__AxisAssignment_1 )? ) ;
    public final void rule__PathExprTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5719:1: ( ( ( rule__PathExprTerm__AxisAssignment_1 )? ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5720:1: ( ( rule__PathExprTerm__AxisAssignment_1 )? )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5720:1: ( ( rule__PathExprTerm__AxisAssignment_1 )? )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5721:1: ( rule__PathExprTerm__AxisAssignment_1 )?
            {
             before(grammarAccess.getPathExprTermAccess().getAxisAssignment_1()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5722:1: ( rule__PathExprTerm__AxisAssignment_1 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5722:2: rule__PathExprTerm__AxisAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PathExprTerm__AxisAssignment_1_in_rule__PathExprTerm__Group__1__Impl11501);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5732:1: rule__PathExprTerm__Group__2 : rule__PathExprTerm__Group__2__Impl ;
    public final void rule__PathExprTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5736:1: ( rule__PathExprTerm__Group__2__Impl )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5737:2: rule__PathExprTerm__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PathExprTerm__Group__2__Impl_in_rule__PathExprTerm__Group__211532);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5743:1: rule__PathExprTerm__Group__2__Impl : ( ( rule__PathExprTerm__RefAssignment_2 ) ) ;
    public final void rule__PathExprTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5747:1: ( ( ( rule__PathExprTerm__RefAssignment_2 ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5748:1: ( ( rule__PathExprTerm__RefAssignment_2 ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5748:1: ( ( rule__PathExprTerm__RefAssignment_2 ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5749:1: ( rule__PathExprTerm__RefAssignment_2 )
            {
             before(grammarAccess.getPathExprTermAccess().getRefAssignment_2()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5750:1: ( rule__PathExprTerm__RefAssignment_2 )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5750:2: rule__PathExprTerm__RefAssignment_2
            {
            pushFollow(FOLLOW_rule__PathExprTerm__RefAssignment_2_in_rule__PathExprTerm__Group__2__Impl11559);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5767:1: rule__Language__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Language__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5771:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5772:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5772:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5773:1: RULE_ID
            {
             before(grammarAccess.getLanguageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Language__NameAssignment_111600); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5782:1: rule__Language__UriAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Language__UriAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5786:1: ( ( RULE_STRING ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5787:1: ( RULE_STRING )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5787:1: ( RULE_STRING )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5788:1: RULE_STRING
            {
             before(grammarAccess.getLanguageAccess().getUriSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Language__UriAssignment_211631); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5797:1: rule__Language__ConceptDefAssignment_4 : ( ruleTopConceptDef ) ;
    public final void rule__Language__ConceptDefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5801:1: ( ( ruleTopConceptDef ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5802:1: ( ruleTopConceptDef )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5802:1: ( ruleTopConceptDef )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5803:1: ruleTopConceptDef
            {
             before(grammarAccess.getLanguageAccess().getConceptDefTopConceptDefParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTopConceptDef_in_rule__Language__ConceptDefAssignment_411662);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5812:1: rule__Language__ConceptDefAssignment_5 : ( ruleNamedConceptDef ) ;
    public final void rule__Language__ConceptDefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5816:1: ( ( ruleNamedConceptDef ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5817:1: ( ruleNamedConceptDef )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5817:1: ( ruleNamedConceptDef )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5818:1: ruleNamedConceptDef
            {
             before(grammarAccess.getLanguageAccess().getConceptDefNamedConceptDefParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleNamedConceptDef_in_rule__Language__ConceptDefAssignment_511693);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5827:1: rule__Annotation__KeyAssignment_0 : ( RULE_ANNOTATION_ID ) ;
    public final void rule__Annotation__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5831:1: ( ( RULE_ANNOTATION_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5832:1: ( RULE_ANNOTATION_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5832:1: ( RULE_ANNOTATION_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5833:1: RULE_ANNOTATION_ID
            {
             before(grammarAccess.getAnnotationAccess().getKeyANNOTATION_IDTerminalRuleCall_0_0()); 
            match(input,RULE_ANNOTATION_ID,FOLLOW_RULE_ANNOTATION_ID_in_rule__Annotation__KeyAssignment_011724); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5842:1: rule__Annotation__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5846:1: ( ( RULE_STRING ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5847:1: ( RULE_STRING )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5847:1: ( RULE_STRING )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5848:1: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_1_111755); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5857:1: rule__AnonymousConceptDef__MappingAssignment_1_1 : ( ruleMapping ) ;
    public final void rule__AnonymousConceptDef__MappingAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5861:1: ( ( ruleMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5862:1: ( ruleMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5862:1: ( ruleMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5863:1: ruleMapping
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getMappingMappingParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__AnonymousConceptDef__MappingAssignment_1_111786);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5872:1: rule__AnonymousConceptDef__AnnotationAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__AnonymousConceptDef__AnnotationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5876:1: ( ( ruleAnnotation ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5877:1: ( ruleAnnotation )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5877:1: ( ruleAnnotation )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5878:1: ruleAnnotation
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getAnnotationAnnotationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__AnonymousConceptDef__AnnotationAssignment_2_111817);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5887:1: rule__AnonymousConceptDef__ChildAssignment_2_2 : ( ruleSubconceptOrAttribute ) ;
    public final void rule__AnonymousConceptDef__ChildAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5891:1: ( ( ruleSubconceptOrAttribute ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5892:1: ( ruleSubconceptOrAttribute )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5892:1: ( ruleSubconceptOrAttribute )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5893:1: ruleSubconceptOrAttribute
            {
             before(grammarAccess.getAnonymousConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_rule__AnonymousConceptDef__ChildAssignment_2_211848);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5902:1: rule__NamedConceptDef__NamedAssignment_0 : ( ( 'concept' ) ) ;
    public final void rule__NamedConceptDef__NamedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5906:1: ( ( ( 'concept' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5907:1: ( ( 'concept' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5907:1: ( ( 'concept' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5908:1: ( 'concept' )
            {
             before(grammarAccess.getNamedConceptDefAccess().getNamedConceptKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5909:1: ( 'concept' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5910:1: 'concept'
            {
             before(grammarAccess.getNamedConceptDefAccess().getNamedConceptKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__NamedConceptDef__NamedAssignment_011884); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5925:1: rule__NamedConceptDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NamedConceptDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5929:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5930:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5930:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5931:1: RULE_ID
            {
             before(grammarAccess.getNamedConceptDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NamedConceptDef__NameAssignment_111923); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5940:1: rule__NamedConceptDef__MappingAssignment_2_1 : ( ruleMapping ) ;
    public final void rule__NamedConceptDef__MappingAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5944:1: ( ( ruleMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5945:1: ( ruleMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5945:1: ( ruleMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5946:1: ruleMapping
            {
             before(grammarAccess.getNamedConceptDefAccess().getMappingMappingParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__NamedConceptDef__MappingAssignment_2_111954);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5955:1: rule__NamedConceptDef__AnnotationAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__NamedConceptDef__AnnotationAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5959:1: ( ( ruleAnnotation ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5960:1: ( ruleAnnotation )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5960:1: ( ruleAnnotation )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5961:1: ruleAnnotation
            {
             before(grammarAccess.getNamedConceptDefAccess().getAnnotationAnnotationParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__NamedConceptDef__AnnotationAssignment_3_111985);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5970:1: rule__NamedConceptDef__ChildAssignment_3_2 : ( ruleSubconceptOrAttribute ) ;
    public final void rule__NamedConceptDef__ChildAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5974:1: ( ( ruleSubconceptOrAttribute ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5975:1: ( ruleSubconceptOrAttribute )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5975:1: ( ruleSubconceptOrAttribute )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5976:1: ruleSubconceptOrAttribute
            {
             before(grammarAccess.getNamedConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_rule__NamedConceptDef__ChildAssignment_3_212016);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5985:1: rule__TopConceptDef__TopAssignment_0 : ( ( 'top' ) ) ;
    public final void rule__TopConceptDef__TopAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5989:1: ( ( ( 'top' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5990:1: ( ( 'top' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5990:1: ( ( 'top' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5991:1: ( 'top' )
            {
             before(grammarAccess.getTopConceptDefAccess().getTopTopKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5992:1: ( 'top' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:5993:1: 'top'
            {
             before(grammarAccess.getTopConceptDefAccess().getTopTopKeyword_0_0()); 
            match(input,35,FOLLOW_35_in_rule__TopConceptDef__TopAssignment_012052); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6008:1: rule__TopConceptDef__NamedAssignment_1 : ( ( 'concept' ) ) ;
    public final void rule__TopConceptDef__NamedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6012:1: ( ( ( 'concept' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6013:1: ( ( 'concept' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6013:1: ( ( 'concept' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6014:1: ( 'concept' )
            {
             before(grammarAccess.getTopConceptDefAccess().getNamedConceptKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6015:1: ( 'concept' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6016:1: 'concept'
            {
             before(grammarAccess.getTopConceptDefAccess().getNamedConceptKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__TopConceptDef__NamedAssignment_112096); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6031:1: rule__TopConceptDef__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TopConceptDef__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6035:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6036:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6036:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6037:1: RULE_ID
            {
             before(grammarAccess.getTopConceptDefAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TopConceptDef__NameAssignment_212135); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6046:1: rule__TopConceptDef__MappingAssignment_3_1 : ( ruleMapping ) ;
    public final void rule__TopConceptDef__MappingAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6050:1: ( ( ruleMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6051:1: ( ruleMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6051:1: ( ruleMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6052:1: ruleMapping
            {
             before(grammarAccess.getTopConceptDefAccess().getMappingMappingParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__TopConceptDef__MappingAssignment_3_112166);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6061:1: rule__TopConceptDef__AnnotationAssignment_4_1 : ( ruleAnnotation ) ;
    public final void rule__TopConceptDef__AnnotationAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6065:1: ( ( ruleAnnotation ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6066:1: ( ruleAnnotation )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6066:1: ( ruleAnnotation )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6067:1: ruleAnnotation
            {
             before(grammarAccess.getTopConceptDefAccess().getAnnotationAnnotationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__TopConceptDef__AnnotationAssignment_4_112197);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6076:1: rule__TopConceptDef__ChildAssignment_4_2 : ( ruleSubconceptOrAttribute ) ;
    public final void rule__TopConceptDef__ChildAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6080:1: ( ( ruleSubconceptOrAttribute ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6081:1: ( ruleSubconceptOrAttribute )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6081:1: ( ruleSubconceptOrAttribute )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6082:1: ruleSubconceptOrAttribute
            {
             before(grammarAccess.getTopConceptDefAccess().getChildSubconceptOrAttributeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_ruleSubconceptOrAttribute_in_rule__TopConceptDef__ChildAssignment_4_212228);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6091:1: rule__Subconcept__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Subconcept__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6095:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6096:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6096:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6097:1: RULE_ID
            {
             before(grammarAccess.getSubconceptAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Subconcept__NameAssignment_012259); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6106:1: rule__Subconcept__CardinalityAssignment_1 : ( ruleCardinality ) ;
    public final void rule__Subconcept__CardinalityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6110:1: ( ( ruleCardinality ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6111:1: ( ruleCardinality )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6111:1: ( ruleCardinality )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6112:1: ruleCardinality
            {
             before(grammarAccess.getSubconceptAccess().getCardinalityCardinalityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Subconcept__CardinalityAssignment_112290);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6121:1: rule__Subconcept__EssentialAssignment_2 : ( ( '!' ) ) ;
    public final void rule__Subconcept__EssentialAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6125:1: ( ( ( '!' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6126:1: ( ( '!' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6126:1: ( ( '!' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6127:1: ( '!' )
            {
             before(grammarAccess.getSubconceptAccess().getEssentialExclamationMarkKeyword_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6128:1: ( '!' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6129:1: '!'
            {
             before(grammarAccess.getSubconceptAccess().getEssentialExclamationMarkKeyword_2_0()); 
            match(input,36,FOLLOW_36_in_rule__Subconcept__EssentialAssignment_212326); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6144:1: rule__Subconcept__DefAssignment_3_0_1 : ( ruleNamedConceptDef ) ;
    public final void rule__Subconcept__DefAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6148:1: ( ( ruleNamedConceptDef ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6149:1: ( ruleNamedConceptDef )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6149:1: ( ruleNamedConceptDef )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6150:1: ruleNamedConceptDef
            {
             before(grammarAccess.getSubconceptAccess().getDefNamedConceptDefParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_ruleNamedConceptDef_in_rule__Subconcept__DefAssignment_3_0_112365);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6159:1: rule__Subconcept__DefAssignment_3_1 : ( ruleAnonymousConceptDef ) ;
    public final void rule__Subconcept__DefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6163:1: ( ( ruleAnonymousConceptDef ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6164:1: ( ruleAnonymousConceptDef )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6164:1: ( ruleAnonymousConceptDef )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6165:1: ruleAnonymousConceptDef
            {
             before(grammarAccess.getSubconceptAccess().getDefAnonymousConceptDefParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleAnonymousConceptDef_in_rule__Subconcept__DefAssignment_3_112396);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6174:1: rule__Subconcept__ReferenceAssignment_3_2_0 : ( ( ':' ) ) ;
    public final void rule__Subconcept__ReferenceAssignment_3_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6178:1: ( ( ( ':' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6179:1: ( ( ':' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6179:1: ( ( ':' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6180:1: ( ':' )
            {
             before(grammarAccess.getSubconceptAccess().getReferenceColonKeyword_3_2_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6181:1: ( ':' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6182:1: ':'
            {
             before(grammarAccess.getSubconceptAccess().getReferenceColonKeyword_3_2_0_0()); 
            match(input,18,FOLLOW_18_in_rule__Subconcept__ReferenceAssignment_3_2_012432); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6197:1: rule__Subconcept__RefAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Subconcept__RefAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6201:1: ( ( ( RULE_ID ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6202:1: ( ( RULE_ID ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6202:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6203:1: ( RULE_ID )
            {
             before(grammarAccess.getSubconceptAccess().getRefConceptDefCrossReference_3_2_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6204:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6205:1: RULE_ID
            {
             before(grammarAccess.getSubconceptAccess().getRefConceptDefIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Subconcept__RefAssignment_3_2_112475); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6216:1: rule__Attribute__AttribAssignment_0 : ( ( 'attrib' ) ) ;
    public final void rule__Attribute__AttribAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6220:1: ( ( ( 'attrib' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6221:1: ( ( 'attrib' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6221:1: ( ( 'attrib' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6222:1: ( 'attrib' )
            {
             before(grammarAccess.getAttributeAccess().getAttribAttribKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6223:1: ( 'attrib' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6224:1: 'attrib'
            {
             before(grammarAccess.getAttributeAccess().getAttribAttribKeyword_0_0()); 
            match(input,37,FOLLOW_37_in_rule__Attribute__AttribAssignment_012515); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6239:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6243:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6244:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6244:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6245:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_112554); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6254:1: rule__Attribute__CardinalityAssignment_2 : ( ruleCardinality ) ;
    public final void rule__Attribute__CardinalityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6258:1: ( ( ruleCardinality ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6259:1: ( ruleCardinality )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6259:1: ( ruleCardinality )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6260:1: ruleCardinality
            {
             before(grammarAccess.getAttributeAccess().getCardinalityCardinalityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCardinality_in_rule__Attribute__CardinalityAssignment_212585);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6269:1: rule__Attribute__EssentialAssignment_3 : ( ( '!' ) ) ;
    public final void rule__Attribute__EssentialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6273:1: ( ( ( '!' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6274:1: ( ( '!' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6274:1: ( ( '!' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6275:1: ( '!' )
            {
             before(grammarAccess.getAttributeAccess().getEssentialExclamationMarkKeyword_3_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6276:1: ( '!' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6277:1: '!'
            {
             before(grammarAccess.getAttributeAccess().getEssentialExclamationMarkKeyword_3_0()); 
            match(input,36,FOLLOW_36_in_rule__Attribute__EssentialAssignment_312621); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6292:1: rule__Attribute__AttribMappingAssignment_4_1 : ( ruleMapping ) ;
    public final void rule__Attribute__AttribMappingAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6296:1: ( ( ruleMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6297:1: ( ruleMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6297:1: ( ruleMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6298:1: ruleMapping
            {
             before(grammarAccess.getAttributeAccess().getAttribMappingMappingParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleMapping_in_rule__Attribute__AttribMappingAssignment_4_112660);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6307:1: rule__Attribute__AnnotationAssignment_5_1 : ( ruleAnnotation ) ;
    public final void rule__Attribute__AnnotationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6311:1: ( ( ruleAnnotation ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6312:1: ( ruleAnnotation )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6312:1: ( ruleAnnotation )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6313:1: ruleAnnotation
            {
             before(grammarAccess.getAttributeAccess().getAnnotationAnnotationParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Attribute__AnnotationAssignment_5_112691);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6322:1: rule__Cardinality__ZeroOrMoreAssignment_0 : ( ( '*' ) ) ;
    public final void rule__Cardinality__ZeroOrMoreAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6326:1: ( ( ( '*' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6327:1: ( ( '*' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6327:1: ( ( '*' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6328:1: ( '*' )
            {
             before(grammarAccess.getCardinalityAccess().getZeroOrMoreAsteriskKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6329:1: ( '*' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6330:1: '*'
            {
             before(grammarAccess.getCardinalityAccess().getZeroOrMoreAsteriskKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__Cardinality__ZeroOrMoreAssignment_012727); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6345:1: rule__Cardinality__OneOrMoreAssignment_1 : ( ( '+' ) ) ;
    public final void rule__Cardinality__OneOrMoreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6349:1: ( ( ( '+' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6350:1: ( ( '+' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6350:1: ( ( '+' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6351:1: ( '+' )
            {
             before(grammarAccess.getCardinalityAccess().getOneOrMorePlusSignKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6352:1: ( '+' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6353:1: '+'
            {
             before(grammarAccess.getCardinalityAccess().getOneOrMorePlusSignKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__Cardinality__OneOrMoreAssignment_112771); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6368:1: rule__Mapping__ContextAssignment_0 : ( rulePathExpr ) ;
    public final void rule__Mapping__ContextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6372:1: ( ( rulePathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6373:1: ( rulePathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6373:1: ( rulePathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6374:1: rulePathExpr
            {
             before(grammarAccess.getMappingAccess().getContextPathExprParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePathExpr_in_rule__Mapping__ContextAssignment_012810);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6383:1: rule__Mapping__MappingAssignment_1 : ( ruleImplicitContextMapping ) ;
    public final void rule__Mapping__MappingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6387:1: ( ( ruleImplicitContextMapping ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6388:1: ( ruleImplicitContextMapping )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6388:1: ( ruleImplicitContextMapping )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6389:1: ruleImplicitContextMapping
            {
             before(grammarAccess.getMappingAccess().getMappingImplicitContextMappingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleImplicitContextMapping_in_rule__Mapping__MappingAssignment_112841);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6398:1: rule__Module__NameAssignment_2_1 : ( ruleIDOrPathExpr ) ;
    public final void rule__Module__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6402:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6403:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6403:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6404:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getModuleAccess().getNameIDOrPathExprParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__Module__NameAssignment_2_112872);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6413:1: rule__UsesModule__NameAssignment_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__UsesModule__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6417:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6418:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6418:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6419:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getUsesModuleAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__UsesModule__NameAssignment_212903);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6428:1: rule__UsesEntity__NameAssignment_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__UsesEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6432:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6433:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6433:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6434:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getUsesEntityAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__UsesEntity__NameAssignment_212934);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6443:1: rule__Subroutine__NameAssignment_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__Subroutine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6447:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6448:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6448:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6449:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getSubroutineAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__Subroutine__NameAssignment_212965);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6458:1: rule__Subroutine__ParamsAssignment_3_1_0 : ( ruleFormalParam ) ;
    public final void rule__Subroutine__ParamsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6462:1: ( ( ruleFormalParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6463:1: ( ruleFormalParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6463:1: ( ruleFormalParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6464:1: ruleFormalParam
            {
             before(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleFormalParam_in_rule__Subroutine__ParamsAssignment_3_1_012996);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6473:1: rule__Subroutine__ParamsAssignment_3_1_1_1 : ( ruleFormalParam ) ;
    public final void rule__Subroutine__ParamsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6477:1: ( ( ruleFormalParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6478:1: ( ruleFormalParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6478:1: ( ruleFormalParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6479:1: ruleFormalParam
            {
             before(grammarAccess.getSubroutineAccess().getParamsFormalParamParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_ruleFormalParam_in_rule__Subroutine__ParamsAssignment_3_1_1_113027);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6488:1: rule__FormalParam__IntentAssignment_0 : ( ruleIntent ) ;
    public final void rule__FormalParam__IntentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6492:1: ( ( ruleIntent ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6493:1: ( ruleIntent )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6493:1: ( ruleIntent )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6494:1: ruleIntent
            {
             before(grammarAccess.getFormalParamAccess().getIntentIntentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIntent_in_rule__FormalParam__IntentAssignment_013058);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6503:1: rule__FormalParam__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__FormalParam__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6507:1: ( ( ruleType ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6508:1: ( ruleType )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6508:1: ( ruleType )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6509:1: ruleType
            {
             before(grammarAccess.getFormalParamAccess().getTypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__FormalParam__TypeAssignment_113089);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6518:1: rule__FormalParam__NameAssignment_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__FormalParam__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6522:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6523:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6523:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6524:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getFormalParamAccess().getNameIDOrPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__FormalParam__NameAssignment_213120);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6533:1: rule__Intent__InAssignment_0 : ( ( 'in' ) ) ;
    public final void rule__Intent__InAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6537:1: ( ( ( 'in' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6538:1: ( ( 'in' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6538:1: ( ( 'in' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6539:1: ( 'in' )
            {
             before(grammarAccess.getIntentAccess().getInInKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6540:1: ( 'in' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6541:1: 'in'
            {
             before(grammarAccess.getIntentAccess().getInInKeyword_0_0()); 
            match(input,40,FOLLOW_40_in_rule__Intent__InAssignment_013156); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6556:1: rule__Intent__OutAssignment_1 : ( ( 'out' ) ) ;
    public final void rule__Intent__OutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6560:1: ( ( ( 'out' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6561:1: ( ( 'out' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6561:1: ( ( 'out' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6562:1: ( 'out' )
            {
             before(grammarAccess.getIntentAccess().getOutOutKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6563:1: ( 'out' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6564:1: 'out'
            {
             before(grammarAccess.getIntentAccess().getOutOutKeyword_1_0()); 
            match(input,41,FOLLOW_41_in_rule__Intent__OutAssignment_113200); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6579:1: rule__Intent__InoutAssignment_2 : ( ( 'inout' ) ) ;
    public final void rule__Intent__InoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6583:1: ( ( ( 'inout' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6584:1: ( ( 'inout' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6584:1: ( ( 'inout' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6585:1: ( 'inout' )
            {
             before(grammarAccess.getIntentAccess().getInoutInoutKeyword_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6586:1: ( 'inout' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6587:1: 'inout'
            {
             before(grammarAccess.getIntentAccess().getInoutInoutKeyword_2_0()); 
            match(input,42,FOLLOW_42_in_rule__Intent__InoutAssignment_213244); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6602:1: rule__Type__IntegerAssignment_0 : ( ( 'integer' ) ) ;
    public final void rule__Type__IntegerAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6606:1: ( ( ( 'integer' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6607:1: ( ( 'integer' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6607:1: ( ( 'integer' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6608:1: ( 'integer' )
            {
             before(grammarAccess.getTypeAccess().getIntegerIntegerKeyword_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6609:1: ( 'integer' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6610:1: 'integer'
            {
             before(grammarAccess.getTypeAccess().getIntegerIntegerKeyword_0_0()); 
            match(input,43,FOLLOW_43_in_rule__Type__IntegerAssignment_013288); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6625:1: rule__Type__CharacterAssignment_1 : ( ( 'character' ) ) ;
    public final void rule__Type__CharacterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6629:1: ( ( ( 'character' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6630:1: ( ( 'character' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6630:1: ( ( 'character' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6631:1: ( 'character' )
            {
             before(grammarAccess.getTypeAccess().getCharacterCharacterKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6632:1: ( 'character' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6633:1: 'character'
            {
             before(grammarAccess.getTypeAccess().getCharacterCharacterKeyword_1_0()); 
            match(input,44,FOLLOW_44_in_rule__Type__CharacterAssignment_113332); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6648:1: rule__Type__LogicalAssignment_2 : ( ( 'logical' ) ) ;
    public final void rule__Type__LogicalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6652:1: ( ( ( 'logical' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6653:1: ( ( 'logical' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6653:1: ( ( 'logical' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6654:1: ( 'logical' )
            {
             before(grammarAccess.getTypeAccess().getLogicalLogicalKeyword_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6655:1: ( 'logical' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6656:1: 'logical'
            {
             before(grammarAccess.getTypeAccess().getLogicalLogicalKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__Type__LogicalAssignment_213376); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6671:1: rule__Type__RealAssignment_3 : ( ( 'real' ) ) ;
    public final void rule__Type__RealAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6675:1: ( ( ( 'real' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6676:1: ( ( 'real' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6676:1: ( ( 'real' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6677:1: ( 'real' )
            {
             before(grammarAccess.getTypeAccess().getRealRealKeyword_3_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6678:1: ( 'real' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6679:1: 'real'
            {
             before(grammarAccess.getTypeAccess().getRealRealKeyword_3_0()); 
            match(input,46,FOLLOW_46_in_rule__Type__RealAssignment_313420); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6694:1: rule__Type__DoubleAssignment_4_0 : ( ( 'double' ) ) ;
    public final void rule__Type__DoubleAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6698:1: ( ( ( 'double' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6699:1: ( ( 'double' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6699:1: ( ( 'double' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6700:1: ( 'double' )
            {
             before(grammarAccess.getTypeAccess().getDoubleDoubleKeyword_4_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6701:1: ( 'double' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6702:1: 'double'
            {
             before(grammarAccess.getTypeAccess().getDoubleDoubleKeyword_4_0_0()); 
            match(input,47,FOLLOW_47_in_rule__Type__DoubleAssignment_4_013464); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6717:1: rule__Type__DerivedAssignment_5_0 : ( ( 'type' ) ) ;
    public final void rule__Type__DerivedAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6721:1: ( ( ( 'type' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6722:1: ( ( 'type' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6722:1: ( ( 'type' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6723:1: ( 'type' )
            {
             before(grammarAccess.getTypeAccess().getDerivedTypeKeyword_5_0_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6724:1: ( 'type' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6725:1: 'type'
            {
             before(grammarAccess.getTypeAccess().getDerivedTypeKeyword_5_0_0()); 
            match(input,48,FOLLOW_48_in_rule__Type__DerivedAssignment_5_013508); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6740:1: rule__Type__DerivedTypeAssignment_5_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__Type__DerivedTypeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6744:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6745:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6745:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6746:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getTypeAccess().getDerivedTypeIDOrPathExprParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__Type__DerivedTypeAssignment_5_213547);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6755:1: rule__SubroutineName__NameAssignment_2_1 : ( ruleIDOrPathExpr ) ;
    public final void rule__SubroutineName__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6759:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6760:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6760:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6761:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getSubroutineNameAccess().getNameIDOrPathExprParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__SubroutineName__NameAssignment_2_113578);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6770:1: rule__Call__SubroutineNameAssignment_2 : ( ruleIDOrPathExpr ) ;
    public final void rule__Call__SubroutineNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6774:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6775:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6775:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6776:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getCallAccess().getSubroutineNameIDOrPathExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__Call__SubroutineNameAssignment_213609);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6785:1: rule__Call__ParamsAssignment_3_1_0 : ( ruleActualParam ) ;
    public final void rule__Call__ParamsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6789:1: ( ( ruleActualParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6790:1: ( ruleActualParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6790:1: ( ruleActualParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6791:1: ruleActualParam
            {
             before(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_0_0()); 
            pushFollow(FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_013640);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6800:1: rule__Call__ParamsAssignment_3_1_1_1 : ( ruleActualParam ) ;
    public final void rule__Call__ParamsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6804:1: ( ( ruleActualParam ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6805:1: ( ruleActualParam )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6805:1: ( ruleActualParam )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6806:1: ruleActualParam
            {
             before(grammarAccess.getCallAccess().getParamsActualParamParserRuleCall_3_1_1_1_0()); 
            pushFollow(FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_1_113671);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6815:1: rule__ActualParam__KeywordAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__ActualParam__KeywordAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6819:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6820:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6820:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6821:1: RULE_ID
            {
             before(grammarAccess.getActualParamAccess().getKeywordIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActualParam__KeywordAssignment_0_013702); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6830:1: rule__ActualParam__OptionalAssignment_0_1 : ( ( '?' ) ) ;
    public final void rule__ActualParam__OptionalAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6834:1: ( ( ( '?' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6835:1: ( ( '?' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6835:1: ( ( '?' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6836:1: ( '?' )
            {
             before(grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6837:1: ( '?' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6838:1: '?'
            {
             before(grammarAccess.getActualParamAccess().getOptionalQuestionMarkKeyword_0_1_0()); 
            match(input,49,FOLLOW_49_in_rule__ActualParam__OptionalAssignment_0_113738); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6853:1: rule__ActualParam__ValueAssignment_1 : ( ruleIDOrPathExpr ) ;
    public final void rule__ActualParam__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6857:1: ( ( ruleIDOrPathExpr ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6858:1: ( ruleIDOrPathExpr )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6858:1: ( ruleIDOrPathExpr )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6859:1: ruleIDOrPathExpr
            {
             before(grammarAccess.getActualParamAccess().getValueIDOrPathExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleIDOrPathExpr_in_rule__ActualParam__ValueAssignment_113777);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6868:1: rule__ActualParamByKeyword__KeywordAssignment_2 : ( RULE_ID ) ;
    public final void rule__ActualParamByKeyword__KeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6872:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6873:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6873:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6874:1: RULE_ID
            {
             before(grammarAccess.getActualParamByKeywordAccess().getKeywordIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActualParamByKeyword__KeywordAssignment_213808); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6883:1: rule__VariableDeclaration__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__VariableDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6887:1: ( ( ruleType ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6888:1: ( ruleType )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6888:1: ( ruleType )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6889:1: ruleType
            {
             before(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_213839);
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


    // $ANTLR start "rule__IDOrWildcard__IdAssignment_0"
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6898:1: rule__IDOrWildcard__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__IDOrWildcard__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6902:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6903:1: ( RULE_ID )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6903:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6904:1: RULE_ID
            {
             before(grammarAccess.getIDOrWildcardAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IDOrWildcard__IdAssignment_013870); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6913:1: rule__IDOrWildcard__WildcardAssignment_1 : ( ( '*' ) ) ;
    public final void rule__IDOrWildcard__WildcardAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6917:1: ( ( ( '*' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6918:1: ( ( '*' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6918:1: ( ( '*' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6919:1: ( '*' )
            {
             before(grammarAccess.getIDOrWildcardAccess().getWildcardAsteriskKeyword_1_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6920:1: ( '*' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6921:1: '*'
            {
             before(grammarAccess.getIDOrWildcardAccess().getWildcardAsteriskKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__IDOrWildcard__WildcardAssignment_113906); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6936:1: rule__IDOrPathExpr__LiteralAssignment_2 : ( ruleLiteral ) ;
    public final void rule__IDOrPathExpr__LiteralAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6940:1: ( ( ruleLiteral ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6941:1: ( ruleLiteral )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6941:1: ( ruleLiteral )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6942:1: ruleLiteral
            {
             before(grammarAccess.getIDOrPathExprAccess().getLiteralLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__IDOrPathExpr__LiteralAssignment_213945);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6951:1: rule__PathExprNode__TailAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__PathExprNode__TailAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6955:1: ( ( ( RULE_ID ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6956:1: ( ( RULE_ID ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6956:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6957:1: ( RULE_ID )
            {
             before(grammarAccess.getPathExprNodeAccess().getTailSubconceptOrAttributeCrossReference_1_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6958:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6959:1: RULE_ID
            {
             before(grammarAccess.getPathExprNodeAccess().getTailSubconceptOrAttributeIDTerminalRuleCall_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathExprNode__TailAssignment_1_213980); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6970:1: rule__PathExprTerm__AxisAssignment_1 : ( ruleAxis ) ;
    public final void rule__PathExprTerm__AxisAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6974:1: ( ( ruleAxis ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6975:1: ( ruleAxis )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6975:1: ( ruleAxis )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6976:1: ruleAxis
            {
             before(grammarAccess.getPathExprTermAccess().getAxisAxisParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAxis_in_rule__PathExprTerm__AxisAssignment_114015);
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6985:1: rule__PathExprTerm__RefAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__PathExprTerm__RefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6989:1: ( ( ( RULE_ID ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6990:1: ( ( RULE_ID ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6990:1: ( ( RULE_ID ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6991:1: ( RULE_ID )
            {
             before(grammarAccess.getPathExprTermAccess().getRefSubconceptOrAttributeCrossReference_2_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6992:1: ( RULE_ID )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:6993:1: RULE_ID
            {
             before(grammarAccess.getPathExprTermAccess().getRefSubconceptOrAttributeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PathExprTerm__RefAssignment_214050); 
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
    // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7004:1: rule__Axis__AncestorAssignment : ( ( '^' ) ) ;
    public final void rule__Axis__AncestorAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7008:1: ( ( ( '^' ) ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7009:1: ( ( '^' ) )
            {
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7009:1: ( ( '^' ) )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7010:1: ( '^' )
            {
             before(grammarAccess.getAxisAccess().getAncestorCircumflexAccentKeyword_0()); 
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7011:1: ( '^' )
            // ../org.earthsystemcurator.cupid.xtext.ui/src-gen/org/earthsystemcurator/ui/contentassist/antlr/internal/InternalCupidLanguage.g:7012:1: '^'
            {
             before(grammarAccess.getAxisAccess().getAncestorCircumflexAccentKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__Axis__AncestorAssignment14090); 
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
    public static final BitSet FOLLOW_ruleIDOrWildcard_in_entryRuleIDOrWildcard1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrWildcard1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrWildcard__Alternatives_in_ruleIDOrWildcard1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_entryRuleIDOrPathExpr1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIDOrPathExpr1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrPathExpr__Alternatives_in_ruleIDOrPathExpr1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_entryRulePathExpr1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExpr1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__0_in_rulePathExpr1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExprNode_in_entryRulePathExprNode1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExprNode1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group__0_in_rulePathExprNode1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExprTerm_in_entryRulePathExprTerm1801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathExprTerm1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__0_in_rulePathExprTerm1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxis_in_entryRuleAxis1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAxis1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Axis__AncestorAssignment_in_ruleAxis1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconcept_in_rule__SubconceptOrAttribute__Alternatives1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__SubconceptOrAttribute__Alternatives1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_0__0_in_rule__Subconcept__Alternatives_31979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__DefAssignment_3_1_in_rule__Subconcept__Alternatives_31997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_2__0_in_rule__Subconcept__Alternatives_32015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__ZeroOrMoreAssignment_0_in_rule__Cardinality__Alternatives2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Cardinality__OneOrMoreAssignment_1_in_rule__Cardinality__Alternatives2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_in_rule__ImplicitContextMapping__Alternatives2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleName_in_rule__ImplicitContextMapping__Alternatives2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesModule_in_rule__ImplicitContextMapping__Alternatives2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUsesEntity_in_rule__ImplicitContextMapping__Alternatives2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_rule__ImplicitContextMapping__Alternatives2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutine_in_rule__ImplicitContextMapping__Alternatives2184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubroutineName_in_rule__ImplicitContextMapping__Alternatives2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParamByKeyword_in_rule__ImplicitContextMapping__Alternatives2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_rule__ImplicitContextMapping__Alternatives2235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__InAssignment_0_in_rule__Intent__Alternatives2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__OutAssignment_1_in_rule__Intent__Alternatives2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intent__InoutAssignment_2_in_rule__Intent__Alternatives2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__IntegerAssignment_0_in_rule__Type__Alternatives2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__CharacterAssignment_1_in_rule__Type__Alternatives2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__LogicalAssignment_2_in_rule__Type__Alternatives2372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__RealAssignment_3_in_rule__Type__Alternatives2390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__0_in_rule__Type__Alternatives2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__0_in_rule__Type__Alternatives2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrWildcard__IdAssignment_0_in_rule__IDOrWildcard__Alternatives2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrWildcard__WildcardAssignment_1_in_rule__IDOrWildcard__Alternatives2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrWildcard_in_rule__IDOrPathExpr__Alternatives2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_rule__IDOrPathExpr__Alternatives2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IDOrPathExpr__LiteralAssignment_2_in_rule__IDOrPathExpr__Alternatives2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__Alternatives2580 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__Alternatives2593 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__Alternatives2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__0__Impl_in_rule__Language__Group__02644 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Language__Group__1_in_rule__Language__Group__02647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Language__Group__0__Impl2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__1__Impl_in_rule__Language__Group__12706 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Language__Group__2_in_rule__Language__Group__12709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__NameAssignment_1_in_rule__Language__Group__1__Impl2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__2__Impl_in_rule__Language__Group__22766 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Language__Group__3_in_rule__Language__Group__22769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__UriAssignment_2_in_rule__Language__Group__2__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__3__Impl_in_rule__Language__Group__32826 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Language__Group__4_in_rule__Language__Group__32829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Language__Group__3__Impl2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__4__Impl_in_rule__Language__Group__42888 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_rule__Language__Group__5_in_rule__Language__Group__42891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__ConceptDefAssignment_4_in_rule__Language__Group__4__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__Group__5__Impl_in_rule__Language__Group__52948 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_rule__Language__Group__6_in_rule__Language__Group__52951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Language__ConceptDefAssignment_5_in_rule__Language__Group__5__Impl2978 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Language__Group__6__Impl_in_rule__Language__Group__63009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Language__Group__6__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03082 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__KeyAssignment_0_in_rule__Annotation__Group__0__Impl3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__0_in_rule__Annotation__Group__1__Impl3169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__0__Impl_in_rule__Annotation__Group_1__03204 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__1_in_rule__Annotation__Group_1__03207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Annotation__Group_1__0__Impl3235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group_1__1__Impl_in_rule__Annotation__Group_1__13266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValueAssignment_1_1_in_rule__Annotation__Group_1__1__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group__0__Impl_in_rule__AnonymousConceptDef__Group__03327 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group__1_in_rule__AnonymousConceptDef__Group__03330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group__1__Impl_in_rule__AnonymousConceptDef__Group__13388 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group__2_in_rule__AnonymousConceptDef__Group__13391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__0_in_rule__AnonymousConceptDef__Group__1__Impl3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group__2__Impl_in_rule__AnonymousConceptDef__Group__23449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__0_in_rule__AnonymousConceptDef__Group__2__Impl3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__0__Impl_in_rule__AnonymousConceptDef__Group_1__03513 = new BitSet(new long[]{0x00000001F3C80000L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__1_in_rule__AnonymousConceptDef__Group_1__03516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__AnonymousConceptDef__Group_1__0__Impl3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__1__Impl_in_rule__AnonymousConceptDef__Group_1__13575 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__2_in_rule__AnonymousConceptDef__Group_1__13578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__MappingAssignment_1_1_in_rule__AnonymousConceptDef__Group_1__1__Impl3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_1__2__Impl_in_rule__AnonymousConceptDef__Group_1__23635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__AnonymousConceptDef__Group_1__2__Impl3663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__0__Impl_in_rule__AnonymousConceptDef__Group_2__03700 = new BitSet(new long[]{0x00000020000040C0L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__1_in_rule__AnonymousConceptDef__Group_2__03703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__AnonymousConceptDef__Group_2__0__Impl3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__1__Impl_in_rule__AnonymousConceptDef__Group_2__13762 = new BitSet(new long[]{0x00000020000040C0L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__2_in_rule__AnonymousConceptDef__Group_2__13765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__AnnotationAssignment_2_1_in_rule__AnonymousConceptDef__Group_2__1__Impl3792 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__2__Impl_in_rule__AnonymousConceptDef__Group_2__23823 = new BitSet(new long[]{0x00000020000040C0L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__3_in_rule__AnonymousConceptDef__Group_2__23826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__ChildAssignment_2_2_in_rule__AnonymousConceptDef__Group_2__2__Impl3853 = new BitSet(new long[]{0x0000002000000042L});
    public static final BitSet FOLLOW_rule__AnonymousConceptDef__Group_2__3__Impl_in_rule__AnonymousConceptDef__Group_2__33884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__AnonymousConceptDef__Group_2__3__Impl3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__0__Impl_in_rule__NamedConceptDef__Group__03951 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__1_in_rule__NamedConceptDef__Group__03954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__NamedAssignment_0_in_rule__NamedConceptDef__Group__0__Impl3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__1__Impl_in_rule__NamedConceptDef__Group__14011 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__2_in_rule__NamedConceptDef__Group__14014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__NameAssignment_1_in_rule__NamedConceptDef__Group__1__Impl4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__2__Impl_in_rule__NamedConceptDef__Group__24071 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__3_in_rule__NamedConceptDef__Group__24074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__0_in_rule__NamedConceptDef__Group__2__Impl4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group__3__Impl_in_rule__NamedConceptDef__Group__34132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__0_in_rule__NamedConceptDef__Group__3__Impl4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__0__Impl_in_rule__NamedConceptDef__Group_2__04198 = new BitSet(new long[]{0x00000001F3C80000L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__1_in_rule__NamedConceptDef__Group_2__04201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NamedConceptDef__Group_2__0__Impl4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__1__Impl_in_rule__NamedConceptDef__Group_2__14260 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__2_in_rule__NamedConceptDef__Group_2__14263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__MappingAssignment_2_1_in_rule__NamedConceptDef__Group_2__1__Impl4290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_2__2__Impl_in_rule__NamedConceptDef__Group_2__24320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NamedConceptDef__Group_2__2__Impl4348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__0__Impl_in_rule__NamedConceptDef__Group_3__04385 = new BitSet(new long[]{0x00000020000040C0L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__1_in_rule__NamedConceptDef__Group_3__04388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NamedConceptDef__Group_3__0__Impl4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__1__Impl_in_rule__NamedConceptDef__Group_3__14447 = new BitSet(new long[]{0x00000020000040C0L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__2_in_rule__NamedConceptDef__Group_3__14450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__AnnotationAssignment_3_1_in_rule__NamedConceptDef__Group_3__1__Impl4477 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__2__Impl_in_rule__NamedConceptDef__Group_3__24508 = new BitSet(new long[]{0x00000020000040C0L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__3_in_rule__NamedConceptDef__Group_3__24511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__ChildAssignment_3_2_in_rule__NamedConceptDef__Group_3__2__Impl4538 = new BitSet(new long[]{0x0000002000000042L});
    public static final BitSet FOLLOW_rule__NamedConceptDef__Group_3__3__Impl_in_rule__NamedConceptDef__Group_3__34569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NamedConceptDef__Group_3__3__Impl4597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__0__Impl_in_rule__TopConceptDef__Group__04636 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__1_in_rule__TopConceptDef__Group__04639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__TopAssignment_0_in_rule__TopConceptDef__Group__0__Impl4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__1__Impl_in_rule__TopConceptDef__Group__14696 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__2_in_rule__TopConceptDef__Group__14699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__NamedAssignment_1_in_rule__TopConceptDef__Group__1__Impl4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__2__Impl_in_rule__TopConceptDef__Group__24756 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__3_in_rule__TopConceptDef__Group__24759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__NameAssignment_2_in_rule__TopConceptDef__Group__2__Impl4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__3__Impl_in_rule__TopConceptDef__Group__34816 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__4_in_rule__TopConceptDef__Group__34819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__0_in_rule__TopConceptDef__Group__3__Impl4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group__4__Impl_in_rule__TopConceptDef__Group__44877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__0_in_rule__TopConceptDef__Group__4__Impl4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__0__Impl_in_rule__TopConceptDef__Group_3__04945 = new BitSet(new long[]{0x00000001F3C80000L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__1_in_rule__TopConceptDef__Group_3__04948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__TopConceptDef__Group_3__0__Impl4976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__1__Impl_in_rule__TopConceptDef__Group_3__15007 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__2_in_rule__TopConceptDef__Group_3__15010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__MappingAssignment_3_1_in_rule__TopConceptDef__Group_3__1__Impl5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_3__2__Impl_in_rule__TopConceptDef__Group_3__25067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__TopConceptDef__Group_3__2__Impl5095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__0__Impl_in_rule__TopConceptDef__Group_4__05132 = new BitSet(new long[]{0x00000020000040C0L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__1_in_rule__TopConceptDef__Group_4__05135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__TopConceptDef__Group_4__0__Impl5163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__1__Impl_in_rule__TopConceptDef__Group_4__15194 = new BitSet(new long[]{0x00000020000040C0L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__2_in_rule__TopConceptDef__Group_4__15197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__AnnotationAssignment_4_1_in_rule__TopConceptDef__Group_4__1__Impl5224 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__2__Impl_in_rule__TopConceptDef__Group_4__25255 = new BitSet(new long[]{0x00000020000040C0L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__3_in_rule__TopConceptDef__Group_4__25258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TopConceptDef__ChildAssignment_4_2_in_rule__TopConceptDef__Group_4__2__Impl5285 = new BitSet(new long[]{0x0000002000000042L});
    public static final BitSet FOLLOW_rule__TopConceptDef__Group_4__3__Impl_in_rule__TopConceptDef__Group_4__35316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TopConceptDef__Group_4__3__Impl5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__0__Impl_in_rule__Subconcept__Group__05383 = new BitSet(new long[]{0x000000D000052000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__1_in_rule__Subconcept__Group__05386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__NameAssignment_0_in_rule__Subconcept__Group__0__Impl5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__1__Impl_in_rule__Subconcept__Group__15443 = new BitSet(new long[]{0x000000D000052000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__2_in_rule__Subconcept__Group__15446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__CardinalityAssignment_1_in_rule__Subconcept__Group__1__Impl5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__2__Impl_in_rule__Subconcept__Group__25504 = new BitSet(new long[]{0x000000D000052000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__3_in_rule__Subconcept__Group__25507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__EssentialAssignment_2_in_rule__Subconcept__Group__2__Impl5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group__3__Impl_in_rule__Subconcept__Group__35565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Alternatives_3_in_rule__Subconcept__Group__3__Impl5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_0__0__Impl_in_rule__Subconcept__Group_3_0__05630 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_0__1_in_rule__Subconcept__Group_3_0__05633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Subconcept__Group_3_0__0__Impl5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_0__1__Impl_in_rule__Subconcept__Group_3_0__15692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__DefAssignment_3_0_1_in_rule__Subconcept__Group_3_0__1__Impl5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_2__0__Impl_in_rule__Subconcept__Group_3_2__05753 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_2__1_in_rule__Subconcept__Group_3_2__05756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__ReferenceAssignment_3_2_0_in_rule__Subconcept__Group_3_2__0__Impl5783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__Group_3_2__1__Impl_in_rule__Subconcept__Group_3_2__15813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subconcept__RefAssignment_3_2_1_in_rule__Subconcept__Group_3_2__1__Impl5840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05874 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttribAssignment_0_in_rule__Attribute__Group__0__Impl5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15934 = new BitSet(new long[]{0x000000D000012000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25994 = new BitSet(new long[]{0x000000D000012000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__25997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__CardinalityAssignment_2_in_rule__Attribute__Group__2__Impl6024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__36055 = new BitSet(new long[]{0x000000D000012000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__36058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__EssentialAssignment_3_in_rule__Attribute__Group__3__Impl6085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__46116 = new BitSet(new long[]{0x000000D000012000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__46119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__0_in_rule__Attribute__Group__4__Impl6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__56177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__0_in_rule__Attribute__Group__5__Impl6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__0__Impl_in_rule__Attribute__Group_4__06247 = new BitSet(new long[]{0x00000001F3C80000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__1_in_rule__Attribute__Group_4__06250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Attribute__Group_4__0__Impl6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__1__Impl_in_rule__Attribute__Group_4__16309 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__2_in_rule__Attribute__Group_4__16312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AttribMappingAssignment_4_1_in_rule__Attribute__Group_4__1__Impl6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_4__2__Impl_in_rule__Attribute__Group_4__26369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Attribute__Group_4__2__Impl6397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__0__Impl_in_rule__Attribute__Group_5__06434 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__1_in_rule__Attribute__Group_5__06437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Attribute__Group_5__0__Impl6465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__1__Impl_in_rule__Attribute__Group_5__16496 = new BitSet(new long[]{0x0000000000004080L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__2_in_rule__Attribute__Group_5__16499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__AnnotationAssignment_5_1_in_rule__Attribute__Group_5__1__Impl6526 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_rule__Attribute__Group_5__2__Impl_in_rule__Attribute__Group_5__26557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Attribute__Group_5__2__Impl6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__0__Impl_in_rule__Mapping__Group__06622 = new BitSet(new long[]{0x00000001F3C80000L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1_in_rule__Mapping__Group__06625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__ContextAssignment_0_in_rule__Mapping__Group__0__Impl6652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__Group__1__Impl_in_rule__Mapping__Group__16683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mapping__MappingAssignment_1_in_rule__Mapping__Group__1__Impl6710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__06744 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__06747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__16805 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__16808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Module__Group__1__Impl6836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__26867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__0_in_rule__Module__Group__2__Impl6894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__0__Impl_in_rule__Module__Group_2__06931 = new BitSet(new long[]{0x0000004100000070L});
    public static final BitSet FOLLOW_rule__Module__Group_2__1_in_rule__Module__Group_2__06934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Module__Group_2__0__Impl6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__1__Impl_in_rule__Module__Group_2__16993 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Module__Group_2__2_in_rule__Module__Group_2__16996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_2_1_in_rule__Module__Group_2__1__Impl7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__2__Impl_in_rule__Module__Group_2__27053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Module__Group_2__2__Impl7081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleName__Group__0__Impl_in_rule__ModuleName__Group__07118 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__ModuleName__Group__1_in_rule__ModuleName__Group__07121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleName__Group__1__Impl_in_rule__ModuleName__Group__17179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ModuleName__Group__1__Impl7207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__0__Impl_in_rule__UsesModule__Group__07242 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__1_in_rule__UsesModule__Group__07245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UsesModule__Group__0__Impl7273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__1__Impl_in_rule__UsesModule__Group__17304 = new BitSet(new long[]{0x0000004100000070L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__2_in_rule__UsesModule__Group__17307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UsesModule__Group__1__Impl7335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__2__Impl_in_rule__UsesModule__Group__27366 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__3_in_rule__UsesModule__Group__27369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__NameAssignment_2_in_rule__UsesModule__Group__2__Impl7396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesModule__Group__3__Impl_in_rule__UsesModule__Group__37426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UsesModule__Group__3__Impl7454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__0__Impl_in_rule__UsesEntity__Group__07493 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__1_in_rule__UsesEntity__Group__07496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__UsesEntity__Group__0__Impl7524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__1__Impl_in_rule__UsesEntity__Group__17555 = new BitSet(new long[]{0x0000004100000070L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__2_in_rule__UsesEntity__Group__17558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__UsesEntity__Group__1__Impl7586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__2__Impl_in_rule__UsesEntity__Group__27617 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__3_in_rule__UsesEntity__Group__27620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__NameAssignment_2_in_rule__UsesEntity__Group__2__Impl7647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UsesEntity__Group__3__Impl_in_rule__UsesEntity__Group__37677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__UsesEntity__Group__3__Impl7705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__0__Impl_in_rule__Subroutine__Group__07744 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__1_in_rule__Subroutine__Group__07747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Subroutine__Group__0__Impl7775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__1__Impl_in_rule__Subroutine__Group__17806 = new BitSet(new long[]{0x0000004100000070L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__2_in_rule__Subroutine__Group__17809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Subroutine__Group__1__Impl7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__2__Impl_in_rule__Subroutine__Group__27868 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__3_in_rule__Subroutine__Group__27871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__NameAssignment_2_in_rule__Subroutine__Group__2__Impl7898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__3__Impl_in_rule__Subroutine__Group__37928 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__4_in_rule__Subroutine__Group__37931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__0_in_rule__Subroutine__Group__3__Impl7958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group__4__Impl_in_rule__Subroutine__Group__47989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Subroutine__Group__4__Impl8017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__0__Impl_in_rule__Subroutine__Group_3__08058 = new BitSet(new long[]{0x0001FF0000200000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__1_in_rule__Subroutine__Group_3__08061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Subroutine__Group_3__0__Impl8089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__1__Impl_in_rule__Subroutine__Group_3__18120 = new BitSet(new long[]{0x0001FF0000200000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__2_in_rule__Subroutine__Group_3__18123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1__0_in_rule__Subroutine__Group_3__1__Impl8150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3__2__Impl_in_rule__Subroutine__Group_3__28181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Subroutine__Group_3__2__Impl8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1__0__Impl_in_rule__Subroutine__Group_3_1__08246 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1__1_in_rule__Subroutine__Group_3_1__08249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__ParamsAssignment_3_1_0_in_rule__Subroutine__Group_3_1__0__Impl8276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1__1__Impl_in_rule__Subroutine__Group_3_1__18306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1_1__0_in_rule__Subroutine__Group_3_1__1__Impl8333 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1_1__0__Impl_in_rule__Subroutine__Group_3_1_1__08368 = new BitSet(new long[]{0x0001FF0000000000L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1_1__1_in_rule__Subroutine__Group_3_1_1__08371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Subroutine__Group_3_1_1__0__Impl8399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__Group_3_1_1__1__Impl_in_rule__Subroutine__Group_3_1_1__18430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Subroutine__ParamsAssignment_3_1_1_1_in_rule__Subroutine__Group_3_1_1__1__Impl8457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__0__Impl_in_rule__FormalParam__Group__08491 = new BitSet(new long[]{0x0001FF0000000000L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__1_in_rule__FormalParam__Group__08494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__IntentAssignment_0_in_rule__FormalParam__Group__0__Impl8521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__1__Impl_in_rule__FormalParam__Group__18552 = new BitSet(new long[]{0x0000004100000070L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__2_in_rule__FormalParam__Group__18555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__TypeAssignment_1_in_rule__FormalParam__Group__1__Impl8582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__Group__2__Impl_in_rule__FormalParam__Group__28612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParam__NameAssignment_2_in_rule__FormalParam__Group__2__Impl8639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__0__Impl_in_rule__Type__Group_4__08675 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Type__Group_4__1_in_rule__Type__Group_4__08678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DoubleAssignment_4_0_in_rule__Type__Group_4__0__Impl8705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_4__1__Impl_in_rule__Type__Group_4__18735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Type__Group_4__1__Impl8764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__0__Impl_in_rule__Type__Group_5__08801 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Type__Group_5__1_in_rule__Type__Group_5__08804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DerivedAssignment_5_0_in_rule__Type__Group_5__0__Impl8831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__1__Impl_in_rule__Type__Group_5__18861 = new BitSet(new long[]{0x0000004100000070L});
    public static final BitSet FOLLOW_rule__Type__Group_5__2_in_rule__Type__Group_5__18864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Type__Group_5__1__Impl8892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__2__Impl_in_rule__Type__Group_5__28923 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Type__Group_5__3_in_rule__Type__Group_5__28926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__DerivedTypeAssignment_5_2_in_rule__Type__Group_5__2__Impl8953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Group_5__3__Impl_in_rule__Type__Group_5__38983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Type__Group_5__3__Impl9011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__0__Impl_in_rule__SubroutineName__Group__09050 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__1_in_rule__SubroutineName__Group__09053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SubroutineName__Group__0__Impl9081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__1__Impl_in_rule__SubroutineName__Group__19112 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__2_in_rule__SubroutineName__Group__19115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group__2__Impl_in_rule__SubroutineName__Group__29173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__0_in_rule__SubroutineName__Group__2__Impl9200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__0__Impl_in_rule__SubroutineName__Group_2__09237 = new BitSet(new long[]{0x0000004100000070L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__1_in_rule__SubroutineName__Group_2__09240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__SubroutineName__Group_2__0__Impl9268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__1__Impl_in_rule__SubroutineName__Group_2__19299 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__2_in_rule__SubroutineName__Group_2__19302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__NameAssignment_2_1_in_rule__SubroutineName__Group_2__1__Impl9329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubroutineName__Group_2__2__Impl_in_rule__SubroutineName__Group_2__29359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SubroutineName__Group_2__2__Impl9387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__0__Impl_in_rule__Call__Group__09424 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Call__Group__1_in_rule__Call__Group__09427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Call__Group__0__Impl9455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__1__Impl_in_rule__Call__Group__19486 = new BitSet(new long[]{0x0000004100000070L});
    public static final BitSet FOLLOW_rule__Call__Group__2_in_rule__Call__Group__19489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Call__Group__1__Impl9517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__2__Impl_in_rule__Call__Group__29548 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Call__Group__3_in_rule__Call__Group__29551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__SubroutineNameAssignment_2_in_rule__Call__Group__2__Impl9578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__3__Impl_in_rule__Call__Group__39608 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__Call__Group__4_in_rule__Call__Group__39611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0_in_rule__Call__Group__3__Impl9638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group__4__Impl_in_rule__Call__Group__49669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Call__Group__4__Impl9697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__0__Impl_in_rule__Call__Group_3__09738 = new BitSet(new long[]{0x0000004100200070L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1_in_rule__Call__Group_3__09741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Call__Group_3__0__Impl9769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__1__Impl_in_rule__Call__Group_3__19800 = new BitSet(new long[]{0x0000004100200070L});
    public static final BitSet FOLLOW_rule__Call__Group_3__2_in_rule__Call__Group_3__19803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__0_in_rule__Call__Group_3__1__Impl9830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3__2__Impl_in_rule__Call__Group_3__29861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Call__Group_3__2__Impl9889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__0__Impl_in_rule__Call__Group_3_1__09926 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__1_in_rule__Call__Group_3_1__09929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParamsAssignment_3_1_0_in_rule__Call__Group_3_1__0__Impl9956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1__1__Impl_in_rule__Call__Group_3_1__19986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__0_in_rule__Call__Group_3_1__1__Impl10013 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__0__Impl_in_rule__Call__Group_3_1_1__010048 = new BitSet(new long[]{0x0000004100000070L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__1_in_rule__Call__Group_3_1_1__010051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Call__Group_3_1_1__0__Impl10079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__Group_3_1_1__1__Impl_in_rule__Call__Group_3_1_1__110110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call__ParamsAssignment_3_1_1_1_in_rule__Call__Group_3_1_1__1__Impl10137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__0__Impl_in_rule__ActualParam__Group__010171 = new BitSet(new long[]{0x0000004100000070L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__1_in_rule__ActualParam__Group__010174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__0_in_rule__ActualParam__Group__0__Impl10201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group__1__Impl_in_rule__ActualParam__Group__110232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__ValueAssignment_1_in_rule__ActualParam__Group__1__Impl10259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__0__Impl_in_rule__ActualParam__Group_0__010293 = new BitSet(new long[]{0x0002000000008000L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__1_in_rule__ActualParam__Group_0__010296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__KeywordAssignment_0_0_in_rule__ActualParam__Group_0__0__Impl10323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__1__Impl_in_rule__ActualParam__Group_0__110353 = new BitSet(new long[]{0x0002000000008000L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__2_in_rule__ActualParam__Group_0__110356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__OptionalAssignment_0_1_in_rule__ActualParam__Group_0__1__Impl10383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParam__Group_0__2__Impl_in_rule__ActualParam__Group_0__210414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ActualParam__Group_0__2__Impl10442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__0__Impl_in_rule__ActualParamByKeyword__Group__010479 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__1_in_rule__ActualParamByKeyword__Group__010482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ActualParamByKeyword__Group__0__Impl10510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__1__Impl_in_rule__ActualParamByKeyword__Group__110541 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__2_in_rule__ActualParamByKeyword__Group__110544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ActualParamByKeyword__Group__1__Impl10572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__2__Impl_in_rule__ActualParamByKeyword__Group__210603 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__3_in_rule__ActualParamByKeyword__Group__210606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__KeywordAssignment_2_in_rule__ActualParamByKeyword__Group__2__Impl10633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActualParamByKeyword__Group__3__Impl_in_rule__ActualParamByKeyword__Group__310663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__ActualParamByKeyword__Group__3__Impl10691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__0__Impl_in_rule__VariableDeclaration__Group__010730 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1_in_rule__VariableDeclaration__Group__010733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VariableDeclaration__Group__0__Impl10761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__1__Impl_in_rule__VariableDeclaration__Group__110792 = new BitSet(new long[]{0x0001FF0000000000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2_in_rule__VariableDeclaration__Group__110795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VariableDeclaration__Group__1__Impl10823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__2__Impl_in_rule__VariableDeclaration__Group__210854 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3_in_rule__VariableDeclaration__Group__210857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__TypeAssignment_2_in_rule__VariableDeclaration__Group__2__Impl10884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariableDeclaration__Group__3__Impl_in_rule__VariableDeclaration__Group__310914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VariableDeclaration__Group__3__Impl10942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__0__Impl_in_rule__PathExpr__Group__010981 = new BitSet(new long[]{0x0004000000000040L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__1_in_rule__PathExpr__Group__010984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PathExpr__Group__0__Impl11012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExpr__Group__1__Impl_in_rule__PathExpr__Group__111043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExprNode_in_rule__PathExpr__Group__1__Impl11070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group__0__Impl_in_rule__PathExprNode__Group__011103 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group__1_in_rule__PathExprNode__Group__011106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExprTerm_in_rule__PathExprNode__Group__0__Impl11133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group__1__Impl_in_rule__PathExprNode__Group__111162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__0_in_rule__PathExprNode__Group__1__Impl11189 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__0__Impl_in_rule__PathExprNode__Group_1__011224 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__1_in_rule__PathExprNode__Group_1__011227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__1__Impl_in_rule__PathExprNode__Group_1__111285 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__2_in_rule__PathExprNode__Group_1__111288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PathExprNode__Group_1__1__Impl11316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__Group_1__2__Impl_in_rule__PathExprNode__Group_1__211347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprNode__TailAssignment_1_2_in_rule__PathExprNode__Group_1__2__Impl11374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__0__Impl_in_rule__PathExprTerm__Group__011410 = new BitSet(new long[]{0x0004000000000040L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__1_in_rule__PathExprTerm__Group__011413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__1__Impl_in_rule__PathExprTerm__Group__111471 = new BitSet(new long[]{0x0004000000000040L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__2_in_rule__PathExprTerm__Group__111474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__AxisAssignment_1_in_rule__PathExprTerm__Group__1__Impl11501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__Group__2__Impl_in_rule__PathExprTerm__Group__211532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PathExprTerm__RefAssignment_2_in_rule__PathExprTerm__Group__2__Impl11559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Language__NameAssignment_111600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Language__UriAssignment_211631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopConceptDef_in_rule__Language__ConceptDefAssignment_411662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedConceptDef_in_rule__Language__ConceptDefAssignment_511693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANNOTATION_ID_in_rule__Annotation__KeyAssignment_011724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_1_111755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__AnonymousConceptDef__MappingAssignment_1_111786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__AnonymousConceptDef__AnnotationAssignment_2_111817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_rule__AnonymousConceptDef__ChildAssignment_2_211848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__NamedConceptDef__NamedAssignment_011884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NamedConceptDef__NameAssignment_111923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__NamedConceptDef__MappingAssignment_2_111954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__NamedConceptDef__AnnotationAssignment_3_111985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_rule__NamedConceptDef__ChildAssignment_3_212016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TopConceptDef__TopAssignment_012052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TopConceptDef__NamedAssignment_112096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TopConceptDef__NameAssignment_212135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__TopConceptDef__MappingAssignment_3_112166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__TopConceptDef__AnnotationAssignment_4_112197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubconceptOrAttribute_in_rule__TopConceptDef__ChildAssignment_4_212228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Subconcept__NameAssignment_012259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Subconcept__CardinalityAssignment_112290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Subconcept__EssentialAssignment_212326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedConceptDef_in_rule__Subconcept__DefAssignment_3_0_112365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnonymousConceptDef_in_rule__Subconcept__DefAssignment_3_112396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Subconcept__ReferenceAssignment_3_2_012432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Subconcept__RefAssignment_3_2_112475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Attribute__AttribAssignment_012515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_112554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCardinality_in_rule__Attribute__CardinalityAssignment_212585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Attribute__EssentialAssignment_312621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_rule__Attribute__AttribMappingAssignment_4_112660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Attribute__AnnotationAssignment_5_112691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Cardinality__ZeroOrMoreAssignment_012727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Cardinality__OneOrMoreAssignment_112771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathExpr_in_rule__Mapping__ContextAssignment_012810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicitContextMapping_in_rule__Mapping__MappingAssignment_112841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__Module__NameAssignment_2_112872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__UsesModule__NameAssignment_212903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__UsesEntity__NameAssignment_212934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__Subroutine__NameAssignment_212965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalParam_in_rule__Subroutine__ParamsAssignment_3_1_012996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalParam_in_rule__Subroutine__ParamsAssignment_3_1_1_113027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntent_in_rule__FormalParam__IntentAssignment_013058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__FormalParam__TypeAssignment_113089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__FormalParam__NameAssignment_213120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Intent__InAssignment_013156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Intent__OutAssignment_113200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Intent__InoutAssignment_213244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Type__IntegerAssignment_013288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Type__CharacterAssignment_113332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Type__LogicalAssignment_213376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Type__RealAssignment_313420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Type__DoubleAssignment_4_013464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Type__DerivedAssignment_5_013508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__Type__DerivedTypeAssignment_5_213547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__SubroutineName__NameAssignment_2_113578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__Call__SubroutineNameAssignment_213609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_013640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActualParam_in_rule__Call__ParamsAssignment_3_1_1_113671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActualParam__KeywordAssignment_0_013702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ActualParam__OptionalAssignment_0_113738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIDOrPathExpr_in_rule__ActualParam__ValueAssignment_113777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActualParamByKeyword__KeywordAssignment_213808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__VariableDeclaration__TypeAssignment_213839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IDOrWildcard__IdAssignment_013870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__IDOrWildcard__WildcardAssignment_113906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__IDOrPathExpr__LiteralAssignment_213945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathExprNode__TailAssignment_1_213980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAxis_in_rule__PathExprTerm__AxisAssignment_114015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PathExprTerm__RefAssignment_214050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Axis__AncestorAssignment14090 = new BitSet(new long[]{0x0000000000000002L});

}