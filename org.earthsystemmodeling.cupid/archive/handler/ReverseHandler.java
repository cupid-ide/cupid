package org.earthsystemmodeling.cupid.handlers;

import java.net.MalformedURLException;
import java.net.URL;

import org.earthsystemmodeling.FSM;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.core.CupidStorage;
import org.earthsystemmodeling.cupid.core.ReverseEngineer;
import org.earthsystemmodeling.cupid.preferences.CupidPreferencePage;
import org.earthsystemmodeling.cupid.util.Regex;
import org.earthsystemmodeling.cupid.views.NUOPCView;
import org.earthsystemmodeling.psyche.Language;
import org.eclipse.cdt.core.model.ITranslationUnit;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.analysis.binding.ScopingNode;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.PlatformUI;


@SuppressWarnings("restriction")
public class ReverseHandler extends AbstractHandler {
	
		
	public ReverseHandler() {
	}

	
			
	public Object execute(ExecutionEvent event) throws ExecutionException {

		//event is ignored so that this can be called from Actions without
		//requiring an ExecutionEvent to be generated
		
		//IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		CupidActivator.log("enter ReverseHandler.execute");
		
		
		ISelectionService selService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		
		IProject selectedProject = null;
		ISelection sel = selService.getSelection(); //HandlerUtil.getCurrentSelection(event);
		
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
			
			IEditorPart editor = null;
			
			try {
				editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor(); //HandlerUtil.getActiveEditor(event);
			} catch (NullPointerException npe) {
				//handled below
			}
			
			if (editor != null) {
				IEditorInput input = editor.getEditorInput();
				if (input instanceof IFileEditorInput) {
					selectedProject = ((IFileEditorInput) input).getFile().getProject();
				}
			}
			
		}
		
		if (selectedProject == null) {
			//System.out.println("Current editor input: " + sel);
			CupidActivator.log("Cannot reverse engineer because not project is selected");
			return null;
		}
		
	        
        //PhotranVPG vpg = PhotranVPG.getInstance();
      
       // Language lang = loadLanguageEcore();
              
        final FSM<?> fsm = ReverseEngineer.reverseEngineer(selectedProject); 
        
        CupidStorage.INSTANCE.setFSM(selectedProject, fsm);
        
        //update the view here for now
        IViewReference viewRef = 
        		PlatformUI.getWorkbench().getActiveWorkbenchWindow().
        						getActivePage().findViewReference(NUOPCView.ID, null); 
        if (viewRef != null) {
        	NUOPCView view = (NUOPCView) viewRef.getPart(true);
        	if (view != null) {
        		//view.updateView(selectedProject);
        	}
        }
        
        //create markers for validation failures
        try {
			selectedProject.deleteMarkers("org.earthsystemmodeling.cupid.cupiderror", true, IResource.DEPTH_INFINITE);
		} catch (CoreException ce) {
			CupidActivator.log(Status.ERROR, "Error deleting validation markers", ce);
		}
        
        
        for (Diagnostic d : fsm.getDiagnostics()) {
        	Object problemElem = d.getData().get(0);
        	Object refObject = fsm.getMapsTo((EObject) problemElem); //fsm.getReference(problemElem);
        	Object problemRef = null;
        	if (d.getData().size() > 1) {
        		problemRef = d.getData().get(1);
        	}
        	        
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
	        		
					int startOffset = t.getFileOffset();
					int endOffset = startOffset + t.getLength();
	    			
	    			IMarker marker = t.getPhysicalFile().getIFile().createMarker("org.earthsystemmodeling.cupid.cupiderror");
	    			marker.setAttribute(IMarker.CHAR_START, startOffset);
	                marker.setAttribute(IMarker.CHAR_END, endOffset);
	                marker.setAttribute(IMarker.MESSAGE, getValidationMessage(d));
	                marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
	                
	                //skip quick fixes for now
	                /*
	                if (problemRef != null && problemRef instanceof EReference) {
		                
 	                	final EObject eobj = (EObject) problemElem;
	                	final EReference eref = (EReference) problemRef;
	                	
		                //nature.markerFixes.put(marker, new IMarkerResolution() {
						CupidStorage.INSTANCE.getMarkerFixes(selectedProject).put(marker, new IMarkerResolution() {
	                	
		                	@Override
							public String getLabel() {
								return "Generate " + Regex.getFromAnnotation(eref.getEType(), "label", eref.getName());
							}
	
							@Override
							public void run(IMarker marker) {
								System.out.println("Quick fix: Forward adding: " + eref.getName() + ", " + eobj.toString());
								
								//fsm.forwardAdd(eobj, eref, true);
								
								IFortranAST ast = fsm.getASTForElement(eobj);
								Reindenter.reindent(ast.getRoot(), ast, Strategy.REINDENT_EACH_LINE);
								
								try {
									IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
									//running in UI thread for now so we can set focus to generated code
									PlatformUI.getWorkbench().getProgressService().run(false, true, new RewriteASTRunnable(ast, window));
								} catch (InvocationTargetException e) {
									e.printStackTrace();
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								
							}
	
		                });
	                }
	                */
	                
	    		} catch (CoreException e) {
					e.printStackTrace();
				}
        	}
        	
        }
       
        
               
        //save to file for debugging purposes
 
        /*
        IFile revFile = selectedProject.getFile("reverse.nuopc");       
        URI fileURI = URI.createFileURI(revFile.getLocation().toString());            
        
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource resource = resourceSet.createResource(fileURI); 
               
        resource.getContents().clear();
        resource.getContents().add(fsm.getRoot());
        try {
			resource.save(null);
		} catch (IOException e1) {
			System.out.println("Error saving model file: ");
			e1.printStackTrace();
		}
     	*/
     
        //TODO: do I need to do this?
        PhotranVPG.getInstance().releaseAllASTs();
        
        CupidActivator.log("exit ReverseHandler.execute");

		return null;
	}
	
	//TODO: duplicated functionality, integrate this will the 
	//same function in NUOPCViewContentProvider
	private String getValidationMessage(Diagnostic d) {
		
		if (d.getSource().equals(EObjectValidator.DIAGNOSTIC_SOURCE) && d.getCode() == EObjectValidator.EOBJECT__EVERY_MULTIPCITY_CONFORMS) {
			if (d.getData().size() >= 2) {
				Object o = d.getData().get(1);
				String label = null;
				if (o instanceof EReference) {
					label = Regex.getFromAnnotation(((EReference) o).getEType(), "label", ((EReference) o).getEType().getName());
				}
				else if (o instanceof EAttribute) {
					label = Regex.getFromAnnotation((EAttribute) o, "label", ((EAttribute) o).getName());
				}
				
				if (label != null) {
					return "NUOPC Compliance Error: " + label + " missing";
				}
				
			}
		}
		
		//return "Error: " + d.getMessage();
		return "";
	}

	/*
	public class RewriteASTRunnable implements IRunnableWithProgress {
		
		IFortranAST ast;
		IWorkbenchWindow window;
		
		public RewriteASTRunnable(IFortranAST ast, IWorkbenchWindow window) {
			this.ast = ast;
			this.window = window;
		}
		
    	public void run(IProgressMonitor monitor) {
		
    		if (ast == null) {
    			System.out.println("Null AST");
				return;
    		}
    		
			IFile f = ast.getFile();
			if (!f.exists()) {
				System.out.println("File does not exist: " + f.exists());
				return;
			}
        			
            try {
				
            	String fileContentsBefore = inputStreamToString(f.getContents(false));
            	int charsInFile = fileContentsBefore.length();
            	
            	String replaceString = ast.getRoot().toString().trim();

            	if (!replaceString.equals(fileContentsBefore)) {
            		
            		TextFileChange changeThisFile = new TextFileChange("Cupid code generation: " + f.getFullPath().toOSString(), f);
		            changeThisFile.initializeValidationData(monitor);	            
            	   	changeThisFile.setEdit(new ReplaceEdit(0, charsInFile, replaceString));
            	   	changeThisFile.perform(monitor);
				
            	   	//String fileContentsAfter = inputStreamToString(f.getContents(true));
					System.out.println("Processed file: " + f.getName()); // + " : " + charsInFile + " ==> " + replaceString.length());
				
					//IRangeComparator left = new TokenComparator(fileContentsBefore); 
			        //IRangeComparator right = new TokenComparator(fileContentsAfter);
					
					DocLineComparator left = new DocLineComparator(new Document(fileContentsBefore), null, true);
					DocLineComparator right = new DocLineComparator(new Document(replaceString), null, true);
					
			        RangeDifference[] diffs = RangeDifferencer.findDifferences(left, right);
			        
			        IMarker firstMarker = null;
			        for (RangeDifference rd : diffs) {
			        	
			        	int start = right.getTokenStart(rd.rightStart());
			        	int end = right.getTokenStart(rd.rightEnd()) + right.getTokenLength(rd.rightEnd());
			        	//System.out.println("Range diff: " + rd.toString() + " : " + replaceString.substring(start, end));		        	        	
			        	
			        	int oldStart = left.getTokenStart(rd.leftStart());
			        	int oldEnd = left.getTokenStart(rd.leftEnd()) + left.getTokenLength(rd.leftEnd());
			        	System.out.println("\n*********Range diff: " + rd.toString());
			        	System.out.println("BEFORE:\n" + fileContentsBefore.substring(oldStart, oldEnd));
			        	System.out.println("\nAFTER:\n" + replaceString.substring(start, end));
			        	
			        	if (end-start > 2) {
			        		IMarker marker = f.createMarker("org.earthsystemmodeling.cupid.cupidmarker");
			        		marker.setAttribute(IMarker.CHAR_START, start);
			        		marker.setAttribute(IMarker.CHAR_END, end);
			        		marker.setAttribute(IMarker.MESSAGE, "Cupid generated code");
			        		marker.setAttribute(IMarker.LOCATION, "Lines " + rd.rightStart() + " to " + rd.rightEnd());
			        		if (firstMarker == null) firstMarker = marker;
			        	}
			        }
            	
			        //open editor on last marker generated
			        if (firstMarker != null && window != null) {
						IWorkbenchPage page = window.getActivePage();
						try {
							IDE.openEditor(page, firstMarker, false);
							//marker.delete();
						} catch (PartInitException e) {
							e.printStackTrace();						
						}
					}
			        
            	}
			} catch (CoreException e) {
				e.printStackTrace();						
			}
        	
    	}

		
    }
  	*/
	
	
	
}
