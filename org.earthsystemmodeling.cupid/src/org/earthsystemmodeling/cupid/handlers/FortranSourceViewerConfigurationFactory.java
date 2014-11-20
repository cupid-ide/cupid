package org.earthsystemmodeling.cupid.handlers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.cdt.internal.ui.text.c.hover.AbstractAnnotationHover;
import org.eclipse.cdt.internal.ui.text.correction.MarkerResolutionProposal;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.quickassist.IQuickAssistAssistant;
import org.eclipse.jface.text.quickassist.IQuickAssistInvocationContext;
import org.eclipse.jface.text.quickassist.IQuickAssistProcessor;
import org.eclipse.jface.text.quickassist.QuickAssistAssistant;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.DefaultAnnotationHover;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModelExtension2;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
import org.eclipse.jface.text.source.TextInvocationContext;
import org.eclipse.photran.internal.ui.editor.FortranEditor;
import org.eclipse.photran.internal.ui.editor.FortranEditor.FortranSourceViewerConfiguration;
import org.eclipse.photran.internal.ui.editor.IFortranSourceViewerConfigurationFactory;
import org.eclipse.ui.IMarkerResolution;
import org.eclipse.ui.texteditor.MarkerAnnotation;


@SuppressWarnings({ "restriction" })
public class FortranSourceViewerConfigurationFactory implements
		IFortranSourceViewerConfigurationFactory {

	public FortranSourceViewerConfigurationFactory() {
		//System.out.println("init FortranSourceViewerConfigurationFactory");
		
	}

	@Override
	public SourceViewerConfiguration create(FortranEditor editor) {
		
				
		return new FortranSourceViewerConfiguration(editor) {
			
			
			
			protected IQuickAssistAssistant quickAssistAssistant;
			
			
			
			@Override
			public IQuickAssistAssistant getQuickAssistAssistant(ISourceViewer sourceViewer) {				
				
				if (quickAssistAssistant == null) {
					quickAssistAssistant = new QuickAssistAssistant();
					quickAssistAssistant.setQuickAssistProcessor(new CupidQuickAssistProcessor());
					quickAssistAssistant.setInformationControlCreator(getInformationControlCreator(sourceViewer));
				}
				return quickAssistAssistant;
			}
					
			@Override
			public IAnnotationHover getAnnotationHover(
					ISourceViewer sourceViewer) {
				//return super.getAnnotationHover(sourceViewer);
				return new DefaultAnnotationHover();
			}
			
			public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType) {
				
				if (contentType != IDocument.DEFAULT_CONTENT_TYPE) return null;
							
				return new AbstractAnnotationHover(true) {
					
					@Override
					public Object getHoverInfo2(final ITextViewer textViewer, IRegion hoverRegion) {
						IAnnotationModel model = ((SourceViewer) textViewer).getAnnotationModel();						

						@SuppressWarnings("rawtypes")
						Iterator iter = 
								((IAnnotationModelExtension2)model).getAnnotationIterator(hoverRegion.getOffset(), 
										hoverRegion.getLength(), true, true);
						//Iterator iter = new JavaAnnotationIterator(parent, false); 

						Annotation annotation = null;
						Position position = null;
						while (iter.hasNext()) {
							Annotation a = (Annotation) iter.next();
							Position p = model.getPosition(a);
							if (a.getType().equals("org.earthsystemmodeling.cupid.cupiderrorannotation")) {
								annotation = a;
								position = p;
								break;
							}
						}

						if (annotation != null) {
							return new AnnotationInfo(annotation, position, textViewer) {
								public ICompletionProposal[] getCompletionProposals() {									
									return getQuickAssistAssistant((ISourceViewer) textViewer).
											getQuickAssistProcessor().
												computeQuickAssistProposals(
														new TextInvocationContext(
																(ISourceViewer) textViewer, 
																position.offset, 
																position.length));
								}
							};
						}
						else {
							return null;
						}
						
					} 
				};
				
			}
			
		};
		
	}
	
	
	public class CupidQuickAssistProcessor implements IQuickAssistProcessor {

		@Override
		public String getErrorMessage() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean canFix(Annotation annotation) {
			//System.out.println("canFix");
			if (annotation.getType().equals("org.earthsystemmodeling.cupid.cupiderrorannotation")) {
				return true;
			}
			return false;
		}

		@Override
		public boolean canAssist(IQuickAssistInvocationContext invocationContext) {
			//System.out.println("canAssist");
			return false;
		}

		@Override
		public ICompletionProposal[] computeQuickAssistProposals(
				IQuickAssistInvocationContext invocationContext) {
			
			final ISourceViewer viewer = invocationContext.getSourceViewer();

			List<ICompletionProposal> proposalList = new ArrayList<ICompletionProposal>();
			
			Iterator<?> iter = viewer.getAnnotationModel().getAnnotationIterator();
			//NUOPCNature nature = null;
			
			while (iter.hasNext()) {
				Annotation annotation = (Annotation) iter.next();				
				if (annotation instanceof MarkerAnnotation) {
					
					IMarker marker = ((MarkerAnnotation) annotation).getMarker();
					/*
					if (nature == null) {
						try {
							nature = (NUOPCNature) marker.getResource().getProject().getNature(NUOPCNature.NATURE_ID);
						} catch (CoreException e) {
							e.printStackTrace();
							break;
						}
					}
					*/
					IMarkerResolution mr = null; //CupidStorage.INSTANCE.getMarkerFixes(marker.getResource().getProject()).get(marker);
					
					//IMarkerResolution mr = nature.markerFixes.get(marker);
					if (mr != null) {
						proposalList.add(new MarkerResolutionProposal(mr, marker));
					}
					
				}
			}

			return proposalList.toArray(new ICompletionProposal[0]);			
						
		}
		
			
	}
	
	/*
	public abstract class QuickFix implements IMarkerResolution {

		protected String label;
		//protected IQuickAssistInvocationContext invocationContext;
		
		QuickFix(String label) {
			this.label = label;
			//this.invocationContext = invocationContext;
		}
		
		public String getLabel() {
			return label;
		}		
		
	}
	*/
	
	/*
	public class CupidQuickFix extends QuickFix {
		
		//CupidQuickFix(String label,
		//		IQuickAssistInvocationContext invocationContext) {
		//	super(label, invocationContext);			
		//}

		@Override
		public void run(IMarker marker) {
			
			try {
				NUOPCNature nature = (NUOPCNature) marker.getResource().getProject().getNature(NUOPCNature.NATURE_ID);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Object o = marker.getAttribute("org.earthsystemmodeling.cupid.cupiderror.diagnostic");
				
			
		}
		
	}
	*/
	

}
