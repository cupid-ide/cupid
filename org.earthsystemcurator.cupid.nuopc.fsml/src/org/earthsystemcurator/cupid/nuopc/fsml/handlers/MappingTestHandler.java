package org.earthsystemcurator.cupid.nuopc.fsml.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;

import org.earthsystemcurator.cupid.nuopc.fsml.mapping.ModelToModuleMapping;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.earthsystemcurator.cupid.nuopc.fsml.qvt.NUOPCInputResource;
import org.earthsystemcurator.cupid.nuopc.fsml.qvt.NUOPCOutputResource;
import org.earthsystemcurator.cupid.nuopc.fsml.qvt.Transformation;
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
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jqvt.runtime.PlainJQVTEngine;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.reindenter.Reindenter;
import org.eclipse.photran.internal.core.reindenter.Reindenter.Strategy;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Our sample handler extends AbstractHandler, an IHandler base class.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
@SuppressWarnings("restriction")
public class MappingTestHandler extends AbstractHandler {

	//public static String ffile = "C:\\Users\\Rocky\\Documents\\git\\cupid\\org.earthsystemcurator.cupid.nuopc.fsml\\instance\\atm.F90";
	//public static String mfile = "C:\\Users\\Rocky\\Documents\\git\\cupid\\org.earthsystemcurator.cupid.nuopc.fsml\\instance\\Model.xmi";
	
	public static String mfile = "C:\\Users\\Rocky\\Documents\\eclipse\\runtime-nuopc\\nuopc\\Model.xmi";
	
	//public static String mfile = "file:///C:\\Users\\Rocky\\Documents\\eclipse\\runtime-nuopc\\nuopc\\Model.xmi";
	
	/**
	 * The constructor.
	 */
	public MappingTestHandler() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

		IResource res = extractSelection(window.getActivePage().getSelection());

		if (res == null) {
			System.out.println("res is null\n\n");
			return null;
		}
		
		if (! (res instanceof IFile)) {
			System.out.println("res is not file\n\n");
			return null;			
		}

		final IFile f = (IFile) res;

		final PhotranVPG vpg = PhotranVPG.getInstance();
		final IFortranAST ast = vpg.acquireTransientAST((IFile) res);
		
		
		final PlainJQVTEngine engine = new PlainJQVTEngine();
				
		Transformation transformation = new Transformation() {
		
			@Override
			public <T> T create(Class<T> c) {				
				return engine.createInstanceRef(c);
			}
			
		};
				
		NUOPCInputResource ir = new NUOPCInputResource(ast);
		
		ResourceSet resourceSet = new ResourceSetImpl();

        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
            Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

        @SuppressWarnings("unused")
        NUOPCPackage pack = NUOPCPackage.eINSTANCE;
                
        URI fileURI = URI.createFileURI(new File(mfile).getAbsolutePath());            
        
        Resource resource = resourceSet.getResource(fileURI, true);
						
		NUOPCOutputResource or = new NUOPCOutputResource(resource);	
		
		//ASTModuleNode n;
		//n.getModuleBody().get(0)
		
		try {
			engine.execute(transformation, ir, or);
		} catch (Throwable e) {
			e.printStackTrace();
		} 
		
		return null;
		
	}
	
	/**
	 * the command has been executed, so extract extract the needed information
	 * from the application context.
	 */
	public Object execute2(ExecutionEvent event) throws ExecutionException {

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
                
        URI fileURI = URI.createFileURI(new File(mfile).getAbsolutePath());            
        
        Resource resource = resourceSet.getResource(fileURI, true);
        
        Model m = (Model) resource.getEObject("/");
        System.out.println("Model = " + m);
        
        ModelToModuleMapping map = new ModelToModuleMapping(m, (ASTModuleNode) ast.getRoot().getProgramUnitList().get(0), ast);
        //ModelToModuleMapping map = new ModelToModuleMapping(m, null);
        //System.out.println("Forward: " + map.forward().);
        
       // ASTExecutableProgramNode epn = new ASTExecutableProgramNode();
       // epn.setProgramUnitList(new ASTListNode<IProgramUnit>());
       // epn.getProgramUnitList().add(map.forward());
        map.forward();
        //ast.getRoot().getProgramUnitList().get(0).replaceWith(map.forward());
        
        
        //System.out.println("ast: " + ast.getRoot().toString());
        
        
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
