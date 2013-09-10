package org.earthsystemcurator.cupid.nuopc.fsml.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.Map.Entry;

import org.earthsystemcurator.cupid.nuopc.fsml.fe.ForwardEngineer;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCApplication;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCModel;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.earthsystemcurator.cupid.nuopc.fsml.re.ReverseEngineer;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
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

		System.out.println("Executing forward engineer...");
		
		//IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		
		//ResourceSet resourceSet1 = new ResourceSetImpl();
		ResourceSet resourceSet2 = new ResourceSetImpl();
		//String xmi1 = ReverseHandler.reverseFile;
		String xmi2 = ForwardHandler.assertedFile;
		//Resource reversed = load(xmi1, resourceSet1);
		Resource asserted = load(xmi2, resourceSet2);
		
		final PhotranVPG vpg = PhotranVPG.getInstance();
	    ReverseEngineer re = new ReverseEngineer();
	    NUOPCApplication reversed = re.reverse(vpg);
		
		ForwardEngineer fe = new ForwardEngineer();
		fe.forward(reversed, 
				   (NUOPCApplication) asserted.getContents().get(0),
				   re.getMappings());
		
		final Map<IFile, IFortranAST> fileMap = re.getFileToASTMapping();
		
//		IResource res = extractSelection(window.getActivePage().getSelection());
//
//		if (res == null) {
//			System.out.println("res is null\n\n");
//			return null;
//		}
//
//		if (! (res instanceof IFile)) {
//			System.out.println("res is not file\n\n");
//			return null;			
//		}
//
//		final IFile f = (IFile) res;
//
//		final PhotranVPG vpg = PhotranVPG.getInstance();
//		final IFortranAST ast = vpg.acquireTransientAST((IFile) res);
//		
//		System.out.println("error: " + vpg.describeWhyCannotProcessFile(f));
//		
//
//
//		ResourceSet resourceSet = new ResourceSetImpl();
//
//        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
//            Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
//
//        @SuppressWarnings("unused")
//        NUOPCPackage pack = NUOPCPackage.eINSTANCE;
//                
//        URI fileURI = URI.createFileURI(new File(assertedFile).getAbsolutePath());            
//        
//        Resource resource = resourceSet.getResource(fileURI, true);
//        
//        NUOPCModel m = (NUOPCModel) resource.getEObject("/");
//        System.out.println("Model = " + m);
        
        //ModelToModuleMapping map = 
        //		new ModelToModuleMapping(m, (ASTModuleNode) ast.getRoot().getProgramUnitList().get(0), ast);
        //map.forward();
        
        //Model m = map.reverse();
        //resource.getContents().clear();
        //resource.getContents().add(m);
        //try {
		//	resource.save(null);
		//} catch (IOException e1) {
		//	System.out.println("Error saving model file: ");
		//	e1.printStackTrace();
		//}
        
        //ModelToModuleMapping map = new ModelToModuleMapping(m, null);
        //System.out.println("Forward: " + map.forward().);
        
       // ASTExecutableProgramNode epn = new ASTExecutableProgramNode();
       // epn.setProgramUnitList(new ASTListNode<IProgramUnit>());
       // epn.getProgramUnitList().add(map.forward());
        //map.forward();
        //ast.getRoot().getProgramUnitList().get(0).replaceWith(map.forward());
        
        
        //System.out.println("ast: " + ast.getRoot().toString());
        
        
        IRunnableWithProgress operation = new IRunnableWithProgress() {
			
        	public void run(IProgressMonitor monitor) {
				//vpg.commitChangesFromInMemoryASTs(monitor, 1, f);
        		//vpg.
				
        		//TODO: see about doing this on an individual file basis
	            for (Entry<IFile, IFortranAST> entry : fileMap.entrySet()) {
	        		IFile f = entry.getKey();
	            	TextFileChange changeThisFile = new TextFileChange("text change " + f.getFullPath().toOSString(), f);
		            changeThisFile.initializeValidationData(monitor);	            
		            try {
						changeThisFile.setEdit(new ReplaceEdit(0, countCharsIn(f), entry.getValue().getRoot().toString()));
						changeThisFile.perform(monitor);			
					} catch (CoreException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
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
