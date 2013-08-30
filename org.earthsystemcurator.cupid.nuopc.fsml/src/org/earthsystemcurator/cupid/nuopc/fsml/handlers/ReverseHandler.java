package org.earthsystemcurator.cupid.nuopc.fsml.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;

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
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.vpg.PhotranTokenRef;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.rephraserengine.core.vpg.VPGEdge;
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

		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		IResource res = extractSelection(window.getActivePage().getSelection());

		if (res == null) {
			System.out.println("res is null\n\n");
			return null;
		}

		//IWorkspace ws = ResourcesPlugin.getWorkspace();
		//IProject p = ws.getRoot().getProject("nuopc");

		//String name = new FileDialog(window.getShell(), SWT.OPEN).open();
		//if (name == null)
		//   return null;

		//IPath location = new Path(name);
		//IFile f = p.getFile(location.lastSegment());

		//IFile f = ws.getRoot().getFile(location);

		if (! (res instanceof IFile)) {
			System.out.println("res is not file\n\n");
			return null;			
		}

		final IFile f = (IFile) res;

		final PhotranVPG vpg = PhotranVPG.getInstance();
				
		final IFortranAST ast = vpg.acquireTransientAST((IFile) res);
		
		System.out.println("error: " + vpg.describeWhyCannotProcessFile(f));
		
		/*
		System.out.println("VGP filenames:");
		for (String fn: vpg.listAllFilenames()) {
			System.out.println("\t" + fn);
		}
		
		System.out.println("VGP filenames:");
		for (String fn: vpg.listAllModules()) {
			System.out.println("\t" + fn);
		}
		
		Iterable<? extends VPGEdge<IFortranAST, Token, PhotranTokenRef>> edges = vpg.getAllEdgesFor("/nuopc/atm.F90");
		System.out.println("edges.hasNext? = " + edges.iterator().hasNext());
		for ( VPGEdge<IFortranAST, Token, PhotranTokenRef> e : edges) {
			try {
				//e.findSource().getTokenRef().followOutgoing(EdgeType.)
				System.out.println("Edge: (" + vpg.describeEdgeType(e.getType()) + ") " + e.findSource() + " ==> " + e.findSink());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		*/
		
//		Set<ASTModuleNode> moduleNodes = ast.getRoot().findAll(ASTModuleNode.class);
//		for (ASTModuleNode mn : moduleNodes) {
//			ModelToModuleMapping map = new ModelToModuleMapping(null, mn);
//			Model m = map.reverse();
//		//	System.out.println("Reversed model: " + m);
//		}
		
		/*
		ast.accept(new GenericASTVisitor() {
				
			@Override
			public void visitASTModuleNode(ASTModuleNode node) {
				map.forward();				
			}
			
		});
		*/

		ResourceSet resourceSet = new ResourceSetImpl();

        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
            Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

        @SuppressWarnings("unused")
        NUOPCPackage pack = NUOPCPackage.eINSTANCE;
                
        URI fileURI = URI.createFileURI(new File(reverseFile).getAbsolutePath());            
        
        Resource resource = resourceSet.getResource(fileURI, true);
        
        //Model m = (Model) resource.getEObject("/");
        //System.out.println("Model = " + m);
        
        
        ReverseEngineer re = new ReverseEngineer();
        NUOPCModel m = re.reverse(ast);
        
        if (m == null) return null;
        
        /*
        ModelToModuleMapping map = 
        		new ModelToModuleMapping(null, (ASTModuleNode) ast.getRoot().getProgramUnitList().get(0), ast);
        Model m = map.reverse();
        */
        
        resource.getContents().clear();
        resource.getContents().add(m);
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
