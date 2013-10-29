package org.earthsystemcurator.cupid.nuopc.fsml.handlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.earthsystemcurator.cupid.nuopc.fsml.builder.NUOPCNature;
import org.earthsystemcurator.cupid.nuopc.fsml.core.FSM;
import org.earthsystemcurator.cupid.nuopc.fsml.core.ReverseEngineer;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.earthsystemcurator.cupid.nuopc.fsml.views.NUOPCView;
import org.eclipse.cdt.core.model.ITranslationUnit;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.quickassist.IQuickAssistAssistant;
import org.eclipse.jface.text.quickassist.QuickAssistAssistant;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.analysis.binding.ScopingNode;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
@SuppressWarnings("restriction")
public class ReverseHandler extends AbstractHandler {
	
	public static String reverseFile = "C:\\Users\\Rocky\\Documents\\eclipse\\runtime-nuopc\\example\\Reverse.nuopc";
	
	/**
	 * The constructor.
	 */
	public ReverseHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		//IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		IProject selectedProject = null;
		ISelection sel = HandlerUtil.getCurrentSelection(event);
		
		if (sel instanceof ITreeSelection) {
			Object item = ((ITreeSelection) sel).getFirstElement();
			if (item instanceof IProject) {
				selectedProject = (IProject) item;
				//ystem.out.println("Selected project: " + ((IProject) item).getName());
			}
			else if (item instanceof ITranslationUnit) {
				selectedProject = ((ITranslationUnit) item).getResource().getProject();
			}			
		}
		
		if (selectedProject == null) {
			IEditorPart editor = HandlerUtil.getActiveEditor(event);
			
			//TODO: look into sourceviewerconfiguration instead of this
//			if (editor instanceof FortranEditor) {
//				FortranEditor fortranEditor = (FortranEditor) editor;
//				ISourceViewer sourceViewer = fortranEditor.getSourceViewerx();
//				IQuickAssistAssistant qaa = new QuickAssistAssistant() {
//					@Override
//					public boolean canFix(Annotation annotation) {
//						System.out.println("canFix: " + annotation.getText());
//						return super.canFix(annotation);
//					}
//				};
//				qaa.install(sourceViewer);
//			}
			
			IEditorInput input = editor.getEditorInput();
			if (input instanceof IFileEditorInput) {
				selectedProject = ((IFileEditorInput) input).getFile().getProject();
			}
			//return null;
		}
		
		if (selectedProject == null) {
			System.out.println("Current editor input: " + sel);
			return null;
		}
		
		ResourceSet resourceSet = new ResourceSetImpl();

        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
            Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

        NUOPCPackage pack = NUOPCPackage.eINSTANCE;            
        
        PhotranVPG vpg = PhotranVPG.getInstance();
        //ReverseEngineer re = new ReverseEngineer();
        //NUOPCModel m = re.reverse(ast);
        
        FSM<NUOPCPackage> fsm = ReverseEngineer.reverseEngineer(pack, pack.getNUOPCApplication(), selectedProject, vpg); 
        
        //NUOPCApplication a = ReverseEngineer.reverseEngineer(pack, pack.getNUOPCApplication(), selectedProject, vpg);        
         //use project nature to store local data
 
        try {
			NUOPCNature nature = (NUOPCNature) selectedProject.getNature(NUOPCNature.NATURE_ID);
			//nature.setReverseEngineeredModel(a);
			//nature.setReverseEngineer(re);
			if (nature != null) {
				//nature.reversedModel = a;
				//nature.reversedMappings = re.getMappings();
				nature.fsm = fsm;
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //update the view here for now
        IViewReference viewRef = 
        		PlatformUI.getWorkbench().getActiveWorkbenchWindow().
        						getActivePage().findViewReference(NUOPCView.ID, null); 
        if (viewRef != null) {
        	NUOPCView view = (NUOPCView) viewRef.getPart(true);
        	if (view != null) {
        		view.updateView(selectedProject);
        	}
        }
        
        //create markers for validation failures
        for (Diagnostic d : fsm.getDiagnostics()) {
        	Object problemElem = d.getData().get(0);
        	Object refObject = fsm.getReference(problemElem);
        	ScopingNode scope = null;
        	if (refObject instanceof ScopingNode) {
        		scope = (ScopingNode) refObject;				        	
        	}
        	else if (refObject instanceof IFortranAST) {
        		IFortranAST ast = (IFortranAST) refObject;
        		scope = (ScopingNode) ast.getRoot().getProgramUnitList().get(0);
        	}
        	
        	if (scope != null) {
	        	try {
	    			Token t = scope.getRepresentativeToken().findToken();
	        		
	    			//Token firstToken = scope.findFirstToken();
					//Token lastToken = scope.findLastToken();
					
					//int startOffset = firstToken.getFileOffset();
		            //startOffset -= firstToken.getWhiteBefore().length();
	
		            //int endOffset = lastToken.getFileOffset()+lastToken.getLength();
					int startOffset = t.getFileOffset();
					int endOffset = startOffset + t.getLength();
	    			
	    			IMarker marker = t.getPhysicalFile().getIFile().createMarker("org.earthsystemcurator.cupid.nuopc.fsml.cupiderror");
	    			marker.setAttribute(IMarker.CHAR_START, startOffset);
	                marker.setAttribute(IMarker.CHAR_END, endOffset);
	                marker.setAttribute(IMarker.MESSAGE, d.getMessage());
	                marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
	                
	                
	    		} catch (CoreException e) {
					e.printStackTrace();
				}
        	}
        	
        }
        
        
        if (fsm == null) return null;
        
        
        //save to file for debugging purposes
        IFile revFile = selectedProject.getFile("reverse.nuopc");
        URI fileURI = URI.createFileURI(revFile.getFullPath().toOSString());            
        Resource resource = resourceSet.createResource(fileURI); 
               
        resource.getContents().clear();
        resource.getContents().add(fsm.getRoot());
        try {
			resource.save(null);
		} catch (IOException e1) {
			System.out.println("Error saving model file: ");
			e1.printStackTrace();
		}
     
        //TODO: do I need to do this?
        vpg.releaseAllASTs();

		return null;
	}

	/*
	private int countCharsIn(IFile file) throws CoreException, IOException
	{
	    int size = 0;
	    Reader in = new BufferedReader(new InputStreamReader(file.getContents(true), file.getCharset()));
	    while (in.read() > -1)
	        size++;
	    in.close();
	    return size;
	}
	*/
	
	/*
	protected IResource extractSelection(ISelection sel) {

		System.out.println("sel = " + sel);

		if (!(sel instanceof IStructuredSelection))
			return null;
		IStructuredSelection ss = (IStructuredSelection) sel;
		Object element = ss.getFirstElement();
		if (element instanceof IResource)
			return (IResource) element;
		if (!(element instanceof IAdaptable))
			return null;
		IAdaptable adaptable = (IAdaptable)element;
		Object adapter = adaptable.getAdapter(IResource.class);
		return (IResource) adapter;
	}
	*/
	
}
