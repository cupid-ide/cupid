package org.earthsystemmodeling.cupid.template.ui;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.template.core.ProtexStore;
import org.earthsystemmodeling.cupid.template.core.ProtexStore.ProtexAPI;
import org.eclipse.cdt.internal.ui.text.CCompositeReconcilingStrategy;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.internal.text.html.BrowserInformationControl;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DefaultInformationControl;
import org.eclipse.jface.text.IInformationControl;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.ContextInformation;
import org.eclipse.jface.text.contentassist.ContextInformationValidator;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposalExtension5;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateBuffer;
import org.eclipse.jface.text.templates.TemplateCompletionProcessor;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateContextType;
import org.eclipse.jface.text.templates.TemplateException;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplatePersistenceData;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.photran.internal.ui.FortranTemplateManager;
import org.eclipse.photran.internal.ui.editor.FortranEditor;
import org.eclipse.photran.internal.ui.editor.FortranEditor.FortranSourceViewerConfiguration;
import org.eclipse.photran.internal.ui.editor.FortranStmtPartitionScanner;
import org.eclipse.photran.internal.ui.editor.FortranTemplateCompletionProcessor;
import org.eclipse.photran.internal.ui.editor.FortranTemplateContext;
import org.eclipse.photran.internal.ui.editor.IFortranSourceViewerConfigurationFactory;
import org.eclipse.photran.internal.ui.editor_vpg.FortranVPGReconcilingStrategy;
import org.eclipse.photran.internal.ui.editor_vpg.contentassist.FortranCompletionProcessor;
import org.eclipse.photran.internal.ui.editor_vpg.folding.FortranFoldingProvider;
import org.eclipse.photran.internal.ui.editor_vpg.hover.FortranDeclarationHover;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;



@SuppressWarnings({ "restriction" })
public class FortranSourceViewerConfigurationFactory implements
IFortranSourceViewerConfigurationFactory {

	public FortranSourceViewerConfigurationFactory() {
		CupidActivator.debug("Instantiating FortranSourceViewerConfigurationFactory");		
	}

	/*
	@Override
	public SourceViewerConfiguration create(FortranEditor editor) {
		
		return new FortranSourceViewerConfiguration(editor) {

			@Override 
			public IContentAssistant getContentAssistant(ISourceViewer sourceViewer)
			{
				CupidActivator.debug("FortranSourceViewerConfiguration.getContentAssist");
				
				ContentAssistant assistant = new ContentAssistant();
				FortranTemplateCompletionProcessor templateProcessor = new FortranTemplateCompletionProcessor();
				for (String partitionType : FortranStmtPartitionScanner.PARTITION_TYPES)
					assistant.setContentAssistProcessor(templateProcessor, partitionType);
				assistant.enableAutoActivation(false); //assistant.setAutoActivationDelay(500);
				assistant.setProposalPopupOrientation(IContentAssistant.CONTEXT_INFO_BELOW);
				assistant.setContextInformationPopupBackground(WHITE);
				assistant.setProposalSelectorBackground(WHITE);
				return assistant;
			}

		};
	}
	*/
	
	//COPIED FROM org.eclipse.photran.internal.ui.editor_vpg.FortranVPGSourceViewerConfigurationFactory
	public SourceViewerConfiguration create(final FortranEditor editor)
    {
        new FortranFoldingProvider().setup(editor);
        
        return new FortranSourceViewerConfiguration(editor)
        {
            private final FortranCompletionProcessor fortranCompletionProcessor = new FortranCompletionProcessor();
            
            @Override protected CCompositeReconcilingStrategy createReconcilingStrategy(ISourceViewer sourceViewer)
            {
                return new FortranVPGReconcilingStrategy(sourceViewer, editor, getConfiguredDocumentPartitioning(sourceViewer));
            }

            @Override public IContentAssistant getContentAssistant(ISourceViewer sourceViewer)
            {
            	CupidActivator.debug("FortranSourceViewerConfiguration.getContentAssist");
               
            	/*
            	IContentAssistant result = fortranCompletionProcessor.setup((FortranEditor)editor);
                if (result == null) {
                	result = super.getContentAssistant(sourceViewer);
                }
                if (result != null && result instanceof ContentAssistant) {
                	ContentAssistant assistant = (ContentAssistant) result;
                //	for (String partitionType : FortranStmtPartitionScanner.PARTITION_TYPES) {
                //		IContentAssistProcessor processor = assistant.getContentAssistProcessor(partitionType);
                //      if (processor instanceof TemplateCompletionProcessor) {
                //       	assistant.setContentAssistProcessor(new ForwardingTemplateCompletionProcessor((TemplateCompletionProcessor) processor), partitionType);                       	
                //       }
                // 	 }
                                	
                }
                return result;       
                */
            	
            	
            	ContentAssistant assistant = new ContentAssistant();
                ProtexTemplateCompletionProcessor templateProcessor = new ProtexTemplateCompletionProcessor();
                for (String partitionType : FortranStmtPartitionScanner.PARTITION_TYPES)
                    assistant.setContentAssistProcessor(templateProcessor, partitionType);
                assistant.enableAutoActivation(false); 
                assistant.setProposalPopupOrientation(IContentAssistant.CONTEXT_INFO_BELOW);
                assistant.setContextInformationPopupBackground(WHITE);
                assistant.setProposalSelectorBackground(WHITE);        
                assistant.setInformationControlCreator(new IInformationControlCreator() {				
					@Override
					public IInformationControl createInformationControl(Shell parent) {
						IInformationControl d;
						if (BrowserInformationControl.isAvailable(parent)) {
							d = new BrowserInformationControl(parent, JFaceResources.DIALOG_FONT, true);
						}
						else {
							d = new DefaultInformationControl(parent, true);
						}
						
						d.setBackgroundColor(Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
						d.setForegroundColor(Display.getCurrent().getSystemColor(SWT.COLOR_BLACK));
						return d;
					}
				});
               
                return assistant;
            	
            	
                 
            }

            @Override public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType)
            {
                return new FortranDeclarationHover(sourceViewer, (FortranEditor)editor);
            	/*
            	return new ITextHover() {

					@Override
					public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
						return "THIS is a lot of hover info!  THIS is a lot of hover info!  THIS is a lot of hover info!  THIS is a lot of hover info! THIS is a lot of hover info!";
					}

					@Override
					public IRegion getHoverRegion(ITextViewer textViewer, int offset) {
						return new Region(offset, 5);
					}
            		
            	};
            	*/
            }
            
            
        };
    }
	
	public static class ProtexTemplateCompletionProcessor extends TemplateCompletionProcessor {

		public ProtexTemplateCompletionProcessor() { }
		
		@Override
		protected Template[] getTemplates(String contextTypeId) {		
			return ProtexStore.getInstance().getTemplatesFromActiveAPIs(contextTypeId);
		}

		@Override
		protected TemplateContextType getContextType(ITextViewer viewer, IRegion region) {
		     return FortranTemplateManager.getInstance().getContextTypeRegistry()
		               .getContextType(FortranTemplateContext.ID);
		}

		static Image icon = CupidActivator.getImageDescriptor("icons/subroutine.gif").createImage();
		@Override
		protected Image getImage(Template template) {
			return icon;
		}
		
		@Override
		protected ICompletionProposal createProposal(Template template, TemplateContext context, IRegion region,
				int relevance) {
			CupidActivator.debug("creating proposals...");
			return new ProtexTemplateProposal(template, context, region, icon, relevance);
		}
		
		/*
		@Override
		public IContextInformation[] computeContextInformation(ITextViewer viewer, int documentOffset) {
			// TODO Auto-generated method stub
			//return super.computeContextInformation(viewer, documentOffset);
			CupidActivator.debug("computing context info...");
			IContextInformation ci = new ContextInformation("display string 1", "context info 1");
			IContextInformation ci2 = new ContextInformation("display string 2", "context info 2");
			IContextInformation ci3 = new ContextInformation("display string 3", "context info 3");
			return new IContextInformation[] {ci, ci2, ci3};
		}
		
		@Override
		public IContextInformationValidator getContextInformationValidator() {
			CupidActivator.debug("getContextInformationValidator");
			return new ContextInformationValidator(this);
		}
		
		@Override
		public char[] getContextInformationAutoActivationCharacters() {
			CupidActivator.debug("getContextInfoAutoActvationChars()");
			return new char[] {'O'};
		}
		*/
		
	}
	/*
	public static class ForwardingTemplateCompletionProcessor implements IContentAssistProcessor {

		private TemplateCompletionProcessor delegate;
		
		public ForwardingTemplateCompletionProcessor(TemplateCompletionProcessor delegate) {
			this.delegate = delegate;
		}
		
		@Override
		public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
			ICompletionProposal proposals[] = delegate.computeCompletionProposals(viewer, offset);
			ArrayList<ICompletionProposal> result = new ArrayList<ICompletionProposal>();
			for (ICompletionProposal p : proposals) {
				result.add(p);
			}
			CompletionProposal cp = new CompletionProposal("FUN PROPOSAL", 10, 10, 2, null, "DISPLAY FUN PROPOSAL", null, "HERE IS the additional info right here");
			//CompletionProposal cp = new CompletionProposal("FUN PROPOSAL", 20, 10, 2);		
			
			result.add(cp);
			return result.toArray( new ICompletionProposal[0] );
		}

		@Override
		public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
			return delegate.computeContextInformation(viewer, offset);		
		}

		@Override
		public char[] getCompletionProposalAutoActivationCharacters() {
			return delegate.getCompletionProposalAutoActivationCharacters();
		}

		@Override
		public char[] getContextInformationAutoActivationCharacters() {
			return delegate.getContextInformationAutoActivationCharacters();
		}

		@Override
		public String getErrorMessage() {
			return delegate.getErrorMessage();
		}

		@Override
		public IContextInformationValidator getContextInformationValidator() {
			return delegate.getContextInformationValidator();
		}

		
		
		
	}
	*/
	
	public static class ProtexTemplateProposal extends TemplateProposal implements ICompletionProposalExtension5 {

		public ProtexTemplateProposal(Template template, TemplateContext context, IRegion region, Image image) {
			super(template, context, region, image);
		}
		
		public ProtexTemplateProposal(Template template, TemplateContext context, IRegion region, Image image, int relevance) {
			super(template, context, region, image, relevance);
		}

		@Override
		public Object getAdditionalProposalInfo(IProgressMonitor monitor) {
			return ProtexStore.getInstance().getSubroutineForTemplate(getTemplate()).longDesc;
		}
		
		
		
	}
	
	/*
	public static class ForwardingContentAssistant implements IContentAssistant {

		private IContentAssistant delegate;
		
		public ForwardingContentAssistant(IContentAssistant delegate) {
			this.delegate = delegate;
		}
		
		@Override
		public void install(ITextViewer textViewer) {
			delegate.install(textViewer);
		}

		@Override
		public void uninstall() {
			delegate.uninstall();
		}

		@Override
		public String showPossibleCompletions() {
			return delegate.showPossibleCompletions();
		}

		@Override
		public String showContextInformation() {
			return delegate.showContextInformation();
		}

		@Override
		public IContentAssistProcessor getContentAssistProcessor(String contentType) {
			return delegate.getContentAssistProcessor(contentType);
		}
		
	}
	*/

}
