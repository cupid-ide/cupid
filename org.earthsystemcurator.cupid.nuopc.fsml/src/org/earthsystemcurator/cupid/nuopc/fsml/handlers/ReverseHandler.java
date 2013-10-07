package org.earthsystemcurator.cupid.nuopc.fsml.handlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.earthsystemcurator.cupid.nuopc.fsml.builder.NUOPCNature;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.earthsystemcurator.cupid.nuopc.fsml.re.ReverseEngineer;
import org.earthsystemcurator.cupid.nuopc.fsml.views.NUOPCView;
import org.eclipse.cdt.core.model.ITranslationUnit;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.text.ITextSelection;
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

        @SuppressWarnings("unused")
        NUOPCPackage pack = NUOPCPackage.eINSTANCE;
                
        
        PhotranVPG vpg = PhotranVPG.getInstance();
        ReverseEngineer re = new ReverseEngineer();
        //NUOPCModel m = re.reverse(ast);
        NUOPCApplication a = re.reverse(selectedProject, vpg);        
        
        //use project nature to store local data
        try {
			NUOPCNature nature = (NUOPCNature) selectedProject.getNature(NUOPCNature.NATURE_ID);
			//nature.setReverseEngineeredModel(a);
			//nature.setReverseEngineer(re);
			if (nature != null) {
				nature.reversedModel = a;
				nature.reversedMappings = re.getMappings();
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
        
        
        if (a == null) return null;
        
      
        IFile revFile = selectedProject.getFile("reverse.nuopc");
        /*
        if (!revFile.exists()) {
        	try {
				revFile.create(new ByteArrayInputStream("".getBytes()), IResource.NONE, null);
			} catch (CoreException e) {				
				e.printStackTrace();
				return null;
			}
        }
        */
        URI fileURI = URI.createFileURI(revFile.getFullPath().toOSString());            
        Resource resource = resourceSet.createResource(fileURI); 
               
        resource.getContents().clear();
        resource.getContents().add(a);
        try {
			resource.save(null);
		} catch (IOException e1) {
			System.out.println("Error saving model file: ");
			e1.printStackTrace();
		}
        
        
        
        //ModelToModuleMapping map = new ModelToModuleMapping(m, null);
        //System.out.println("Forward: " + map.forward().);
        
       // ASTExecutableProgramNode epn = new ASTExecutableProgramNode();
       // epn.setProgramUnitList(new ASTListNode<IProgramUnit>());
       // epn.getProgramUnitList().add(map.forward());
        //map.forward();
        //ast.getRoot().getProgramUnitList().get(0).replaceWith(map.forward());
        
        
        //System.out.println("ast: " + ast.getRoot().toString());
        
        /*
        IRunnableWithProgress operation = new IRunnableWithProgress() {
			
        	public void run(IProgressMonitor monitor) {
				vpg.commitChangesFromInMemoryASTs(monitor, 1, f);
								
	            TextFileChange changeThisFile = new TextFileChange("text change" + f.getFullPath().toOSString(), f);
	            changeThisFile.initializeValidationData(monitor);	            
	            try {
					changeThisFile.setEdit(new ReplaceEdit(0, countCharsIn(f), ast.getRoot().toString()));
					changeThisFile.perform(monitor);			
				} catch (CoreException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
	        
		        
		
        	}
        };
        
        try {
			PlatformUI.getWorkbench().getProgressService().run(true, true, operation);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
	
        
		//vpg.commitChangesFromInMemoryASTs(null, 1, f);
        vpg.releaseAllASTs();

		
		
		//MessageDialog.openInformation(
		//		window.getShell(),
		//		"Nuopc Model",
		//		"Hello, this is the MappingTestHandler");

		return null;
	}

	private int countCharsIn(IFile file) throws CoreException, IOException
	{
	    int size = 0;
	    Reader in = new BufferedReader(new InputStreamReader(file.getContents(true), file.getCharset()));
	    while (in.read() > -1)
	        size++;
	    in.close();
	    return size;
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
