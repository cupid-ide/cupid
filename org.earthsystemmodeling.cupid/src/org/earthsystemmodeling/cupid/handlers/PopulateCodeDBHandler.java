package org.earthsystemmodeling.cupid.handlers;

import java.util.ArrayList;
import java.util.List;

import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.eclipse.cdt.core.model.ITranslationUnit;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.photran.internal.core.vpg.eclipse.EclipseVPG;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

@SuppressWarnings("restriction")
public class PopulateCodeDBHandler extends AbstractHandler {

	
	protected PhotranVPG vpg = PhotranVPG.getInstance();
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelectionService selService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		
		IProject selectedProject = null;
		ISelection sel = selService.getSelection(); //HandlerUtil.getCurrentSelection(event);
		
		if (sel instanceof ITreeSelection) {
			Object item = ((ITreeSelection) sel).getFirstElement();
			if (item instanceof IProject) {
				selectedProject = (IProject) item;
			}
		}
		
		if (selectedProject == null) {
			CupidActivator.log(IStatus.ERROR, "No project selected to index.");
			return null;
		}
		
		WorkspaceSyncResourceVisitor visitor = new WorkspaceSyncResourceVisitor();
		try {
			selectedProject.accept(visitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		CodeDBIndex.getInstance().clear();
		CodeDBIndex.getInstance().openConnection();  //open, reset & close now for debugging
		CodeDBIndex.getInstance().resetDatabase();
		
		long totalParse = 0;
		long totalIndex = 0;
		for (String f : visitor.getFiles()) {
			//System.out.println(f);
			long startParse = System.currentTimeMillis();
			IFortranAST ast = vpg.parse(f);
			long endParse = System.currentTimeMillis();
			totalParse += (endParse - startParse);
			if (ast != null) {
				long startIndex = System.currentTimeMillis();
				CodeDBIndex.getInstance().indexAST(ast);
				long endIndex = System.currentTimeMillis();
				totalIndex += (endIndex - startIndex);
				CupidActivator.log(IStatus.INFO, "CodeDB Indexed: " + f);
			}
			else {
				CupidActivator.log(IStatus.WARNING, "Could not index file: " + f);
			}
		}
		CupidActivator.log("Total parse time: " + totalParse);
		CupidActivator.log("Total index time: " + totalIndex);
		
		//System.out.println("Number of clauses: " + CodeDBIndex.getInstance().size());
		
		//close for now
		CodeDBIndex.getInstance().closeConnection();
		
		
		return null;
		
	}

	private final class WorkspaceSyncResourceVisitor implements IResourceVisitor
	{
		private final ArrayList<String> files;

		private WorkspaceSyncResourceVisitor()
		{
			this.files = new ArrayList<String>(1024);
		}

		public List<String> getFiles() {
			return files;
		}
		
		public boolean visit(IResource resource)
		{
			if (!resource.isAccessible()) return false;
			
			if (resource instanceof IFile && vpg.shouldProcessFile((IFile)resource))
				files.add(EclipseVPG.getFilenameForIFile((IFile)resource));
			
			return !(resource instanceof IFile);
		}
	}

}
