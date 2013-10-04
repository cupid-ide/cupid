package org.earthsystemcurator.cupid.nuopc.fsml.handlers;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Map.Entry;

import org.earthsystemcurator.cupid.nuopc.fsml.builder.NUOPCNature;
import org.earthsystemcurator.cupid.nuopc.fsml.fe.ForwardEngineer;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.earthsystemcurator.cupid.nuopc.fsml.re.ReverseEngineer;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ltk.core.refactoring.TextFileChange;

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

		final IProject selectedProject;
		ISelection sel = HandlerUtil.getCurrentSelection(event);
		if (sel instanceof ITreeSelection) {
			Object item = ((ITreeSelection) sel).getFirstElement();
			if (item instanceof IProject) {
				selectedProject = (IProject) item;
				//ystem.out.println("Selected project: " + ((IProject) item).getName());
			}
			else {
				return null;
			}			
		}
		else {
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
		
		final NUOPCApplication revApp = nature.reversedModel;
		final Map<EObject, Object> revMap = nature.reversedMappings;;
		final NUOPCApplication forApp = nature.forwardModel;
		
		if (revApp == null || revMap == null || forApp == null) return null;
			
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
        
        		
        		
        		//ResourceSet resourceSet1 = new ResourceSetImpl();
        		//ResourceSet resourceSet2 = new ResourceSetImpl();
        		//String xmi1 = ReverseHandler.reverseFile;
        		//String xmi2 = ForwardHandler.assertedFile;
        		//String xmi2 = selectedProject.getFile("asserted.nuopc").getFullPath().toOSString();
        		//Resource reversed = load(xmi1, resourceSet1);
        		//Resource asserted = load(xmi2, resourceSet2);
        		
        		//final PhotranVPG vpg = PhotranVPG.getInstance();
        	    //final ReverseEngineer re = new ReverseEngineer();
        	    //NUOPCApplication reversed1 = re.reverse(selectedProject, vpg);
        		
        		ForwardEngineer fe = new ForwardEngineer();
        		fe.setContainer(selectedProject);
        		
        		fe.forward(revApp, forApp, revMap);
     		
        		
        		//fe.forward(reversed1,
        		//		   (NUOPCApplication) asserted.getContents().get(0),
        		//		   re.getMappings());
        		
        		
        		//TODO: see about doing this on an individual file basis
        		//TODO: deal with project files "out of sync" with file system
	            for (Entry<EObject, Object> entry : revMap.entrySet()) {
	        		if (entry.getValue() instanceof IFortranAST) {
		            	
	        			IFortranAST ast = (IFortranAST) entry.getValue();
	        			IFile f = ast.getFile();
		            	
	        			TextFileChange changeThisFile = new TextFileChange("text change " + f.getFullPath().toOSString(), f);
			            changeThisFile.initializeValidationData(monitor);	            
			            try {
							int charsInFile = countCharsIn(f);
			            	changeThisFile.setEdit(new ReplaceEdit(0, countCharsIn(f), ast.getRoot().toString()));
							System.out.println("Processing file: " + f.getName() + " : " + charsInFile);
							changeThisFile.perform(monitor);			
						} catch (CoreException e) {
							e.printStackTrace();
						} catch (IOException e) {
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
