package org.earthsystemcurator.cupid.nuopc.fsml.handlers;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Set;

import org.earthsystemcurator.cupid.nuopc.fsml.mapping.ModelToModuleMapping;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTExecutableProgramNode;
import org.eclipse.photran.internal.core.parser.ASTListNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.GenericASTVisitor;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.photran.internal.core.reindenter.Reindenter;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class MappingTestHandler extends AbstractHandler {

	public static String ffile = "C:\\Users\\Rocky\\Documents\\eclipse\\workspace4.2-cplgen\\org.earthsystemcurator.cupid.nuopc.fsml\\instance\\atm.F90";
	public static String mfile = "C:\\Users\\Rocky\\Documents\\eclipse\\workspace4.2-cplgen\\org.earthsystemcurator.cupid.nuopc.fsml\\instance\\Model.xmi";

	/**
	 * The constructor.
	 */
	public MappingTestHandler() {
	}

	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	@SuppressWarnings("restriction")
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
		IFortranAST ast = vpg.acquireTransientAST((IFile) res);
		
		System.out.println("error: " + vpg.describeWhyCannotProcessFile(f));
		
		//final ModelToModuleMapping map = new ModelToModuleMapping(null, null);
		
		Set<ASTModuleNode> moduleNodes = ast.getRoot().findAll(ASTModuleNode.class);
		for (ASTModuleNode mn : moduleNodes) {
			ModelToModuleMapping map = new ModelToModuleMapping(null, mn);
			Model m = map.reverse();
		//	System.out.println("Reversed model: " + m);
		}
		
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
                
        URI fileURI = URI.createFileURI(new File(mfile).getAbsolutePath());            
        
        Resource resource = resourceSet.getResource(fileURI, true);
        
        Model m = (Model) resource.getEObject("/");
        System.out.println("Model = " + m);
        
        //ModelToModuleMapping map = new ModelToModuleMapping(m, (ASTModuleNode) ast.getRoot().getProgramUnitList().get(0));
        ModelToModuleMapping map = new ModelToModuleMapping(m, null);
        //System.out.println("Forward: " + map.forward().);
        
       // ASTExecutableProgramNode epn = new ASTExecutableProgramNode();
       // epn.setProgramUnitList(new ASTListNode<IProgramUnit>());
       // epn.getProgramUnitList().add(map.forward());
        
        ast.getRoot().getProgramUnitList().get(0).replaceWith(map.forward());
        Reindenter.reindent(ast.getRoot(), ast);
        
        System.out.println("ast: " + ast.getRoot().toString());
        
        /*
        IRunnableWithProgress operation = new IRunnableWithProgress() {
			
        	public void run(IProgressMonitor monitor) {
				vpg.commitChangesFromInMemoryASTs(monitor, 1, f);
				
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
        //vpg.releaseAllASTs();

		
		
		//MessageDialog.openInformation(
		//		window.getShell(),
		//		"Nuopc Model",
		//		"Hello, this is the MappingTestHandler");

		return null;
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
