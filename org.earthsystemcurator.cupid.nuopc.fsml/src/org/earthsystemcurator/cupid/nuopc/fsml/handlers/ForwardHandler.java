package org.earthsystemcurator.cupid.nuopc.fsml.handlers;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Map;

import org.earthsystemcurator.cupid.nuopc.fsml.builder.NUOPCNature;
import org.earthsystemcurator.cupid.nuopc.fsml.core.FSM;
import org.earthsystemcurator.cupid.nuopc.fsml.core.ForwardEngineer;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.eclipse.cdt.core.model.ITranslationUnit;
import org.eclipse.compare.internal.DocLineComparator;
import org.eclipse.compare.rangedifferencer.RangeDifference;
import org.eclipse.compare.rangedifferencer.RangeDifferencer;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
@SuppressWarnings("restriction")
public class ForwardHandler extends AbstractHandler {
	
	public static String assertedFile = "C:\\Users\\Rocky\\Documents\\eclipse\\runtime-nuopc\\example\\Asserted.nuopc";
	
	/**
	 * The constructor.
	 */
	public ForwardHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IProject selectedProject = null;
		ISelection sel = HandlerUtil.getCurrentSelection(event);
		
		if (sel instanceof ITreeSelection) {
			Object item = ((ITreeSelection) sel).getFirstElement();
			if (item instanceof IProject) {
				selectedProject = (IProject) item;				
			}
			else if (item instanceof ITranslationUnit) {
				selectedProject = ((ITranslationUnit) item).getResource().getProject();
			}			
		}
		
		if (selectedProject == null) {
			IEditorPart editor = HandlerUtil.getActiveEditor(event);
			IEditorInput input = editor.getEditorInput();
			if (input instanceof IFileEditorInput) {
				selectedProject = ((IFileEditorInput) input).getFile().getProject();
			}
		}
		
		if (selectedProject == null) {
			System.out.println("Current editor input: " + sel);
			return null;
		}
		
	
		
		NUOPCNature nature = null;	
		try {
			nature = (NUOPCNature) selectedProject.getNature(NUOPCNature.NATURE_ID);			
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (nature == null) return null;
		
		//final NUOPCApplication revApp = nature.reversedModel;
		//final Map<Object, Object> revMap = nature.reversedMappings;;
		//final NUOPCApplication forApp = nature.forwardModel;
		final FSM rev = nature.fsm;
		final FSM forward = nature.fsmForward;
		
		final IProject selProject = selectedProject;
		
		if (rev == null || forward == null) return null;
			
        IRunnableWithProgress operation = new IRunnableWithProgress() {
			
        	public void run(IProgressMonitor monitor) {
				
        		//IWorkspace workspace = ResourcesPlugin.getWorkspace();
        		//IWorkspaceRoot root = workspace.getRoot();
        		//IProject project  = root.getProject("AtmOcnLndProto");
        		
        		//IFolder folder = project.getFolder("Folder1");
        		//IFile file = project.getFile("hello.txt");
        		
        		//if (!project.exists()) project.create(null);
        		//if (!project.isOpen()) project.open(null);
        		//if (!folder.exists()) 
        		//   folder.create(IResource.NONE, true, null);
        		//if (!file.exists()) {
        		//    byte[] bytes = "File contents".getBytes();
        		//    InputStream source = new ByteArrayInputStream(bytes);
        		//    try {
        		//		file.create(source, IResource.NONE, null);
        		//	} catch (CoreException e) {				
        		//		e.printStackTrace();
        		//	}
        		//}
        
        		/*
        		NUOPCApplication forApp2 = forApp;
        		if (forApp2 == null) {
        			//use file for now
        		
	        		//ResourceSet resourceSet1 = new ResourceSetImpl();
	        		ResourceSet resourceSet2 = new ResourceSetImpl();
	        		//String xmi1 = ReverseHandler.reverseFile;
	        		//String xmi2 = ForwardHandler.assertedFile;
	        		String xmi2 = selProject.getFile("asserted.nuopc").getFullPath().toOSString();
	        		//Resource reversed = load(xmi1, resourceSet1);
	        		Resource asserted = load(xmi2, resourceSet2);
	        		forApp2 = (NUOPCApplication) asserted.getContents().get(0);
	        		System.out.println("Loaded asserted model from file...");
        		}
        		*/
        		
        		//final PhotranVPG vpg = PhotranVPG.getInstance();
        	    //final ReverseEngineer re = new ReverseEngineer();
        	    //NUOPCApplication reversed1 = re.reverse(selectedProject, vpg);
        		
        		ForwardEngineer fe = new ForwardEngineer();
        		fe.setContainer(selProject);
        		
        		//fe.forward(revApp, forApp2, revMap);
        		fe.forward(rev, forward);
        		
        		
        		//fe.forward(reversed1,
        		//		   (NUOPCApplication) asserted.getContents().get(0),
        		//		   re.getMappings());
        		
        		
        		//TODO: see about doing this on an individual file basis
        		//TODO: deal with project files "out of sync" with file system
	            //remove duplicates
        		for (Object entry : new HashSet<Object>(rev.getMappings().values())) {
	        		if (entry instanceof IFortranAST) {
		            	
	        			IFortranAST ast = (IFortranAST) entry;
	        			IFile f = ast.getFile();
	        			if (!f.exists()) {
	        				System.out.println("Warning - File does not exist: " + f.exists());
	        				continue;
	        			}
	        			
			            try {
							
			            	String fileContentsBefore = inputStreamToString(f.getContents(true));
			            	int charsInFile = fileContentsBefore.length();
			            	
			            	String replaceString = ast.getRoot().toString().trim();
			
			            	if (!replaceString.equals(fileContentsBefore)) {
			            		
			            		TextFileChange changeThisFile = new TextFileChange("Cupid code generation: " + f.getFullPath().toOSString(), f);
					            changeThisFile.initializeValidationData(monitor);	            
			            	   	changeThisFile.setEdit(new ReplaceEdit(0, charsInFile, replaceString));
			            	   	changeThisFile.perform(monitor);
							
			            	   	//String fileContentsAfter = inputStreamToString(f.getContents(true));
								System.out.println("Processed file: " + f.getName() + " : " + charsInFile + " ==> " + replaceString.length());
							
								//IRangeComparator left = new TokenComparator(fileContentsBefore); 
						        //IRangeComparator right = new TokenComparator(fileContentsAfter);
								
								DocLineComparator left = new DocLineComparator(new Document(fileContentsBefore), null, true);
								DocLineComparator right = new DocLineComparator(new Document(replaceString), null, true);
								
						        RangeDifference[] diffs = RangeDifferencer.findDifferences(left, right);
						        
						        for (RangeDifference rd : diffs) {
						        	
						        	int start = right.getTokenStart(rd.rightStart());
						        	int end = right.getTokenStart(rd.rightEnd()) + right.getTokenLength(rd.rightEnd());
						        	System.out.println("Range diff: " + rd.toString() + " : " + replaceString.substring(start, end));
						        	
						        	if (end-start > 2) {
						        		IMarker marker = f.createMarker("org.earthsystemcurator.cupid.nuopc.fsml.cupidmarker");
						        		marker.setAttribute(IMarker.CHAR_START, start);
						        		marker.setAttribute(IMarker.CHAR_END, end);
						        		marker.setAttribute(IMarker.MESSAGE, "Cupid generated code");
						        		marker.setAttribute(IMarker.LOCATION, "Lines " + rd.rightStart() + " to " + rd.rightEnd());
						        	}
						        }
			            	
			            	}
						} catch (CoreException e) {
							e.printStackTrace();						
						}
	        		}
	            }
	            
	            //vpg.ensureVPGIsUpToDate(monitor);
	            
        	}
        };
        
        try {
			PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		
//	
//        
//		//vpg.commitChangesFromInMemoryASTs(null, 1, f);       

		
		
		//MessageDialog.openInformation(
		//		window.getShell(),
		//		"Nuopc Model",
		//		"Hello, this is the MappingTestHandler");

		return null;
	}

	private Resource load(String absolutePath, ResourceSet resourceSet) {
		URI uri = URI.createFileURI(absolutePath);

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("nuopc", new XMIResourceFactoryImpl());

		// Resource will be loaded within the resource set		
		return resourceSet.getResource(uri, true);
	}
	
	/*
	private int countCharsIn(IFile file) throws CoreException, IOException
	{
	    int size = 0;
	    //InputStreamReader isr = new InputStreamReader(file.getContents(true), file.getCharset());
	    //FileReader f;	    
	    
	    Reader in = new BufferedReader(new InputStreamReader(file.getContents(true), file.getCharset()));
	    while (in.read() > -1)
	        size++;
	    in.close();
	    return size;
	}
	*/
	
	public static String inputStreamToString(final InputStream is) {
		int bufferSize = 1024;
		final char[] buffer = new char[bufferSize];
		final StringBuilder out = new StringBuilder();
		try {
			final Reader in = new InputStreamReader(is);
			try {
				for (;;) {
					int rsz = in.read(buffer, 0, buffer.length);
					if (rsz < 0)
						break;
					out.append(buffer, 0, rsz);
				}
			}
			finally {
				in.close();
			}
		}
		catch (UnsupportedEncodingException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		return out.toString();
	}

	IResource extractSelection(ISelection sel) {

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
}
