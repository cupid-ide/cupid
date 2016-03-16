package org.earthsystemmodeling.cupid.handlers;

import org.earthsystemmodeling.cupid.NUOPC.Application;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

public class GenerateCodeHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelectionService selService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection sel = selService.getSelection();
	
		if (sel instanceof ITreeSelection) {
			final Object item = ((ITreeSelection) sel).getFirstElement();
			
			if (item instanceof Application) {

				Application app = (Application) item;
				//IFile file = (IFile) item;
				//URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
				
				//ResourceSet resSet = new ResourceSetImpl();
				//Resource res = resSet.getResource(fileURI, false);
				//NUOPCApplication app = (NUOPCApplication) res.getContents().get(0);
				
				IProject project = null;
				TreePath path = ((ITreeSelection) sel).getPaths()[0];
				for (int i = 0; i < path.getSegmentCount(); i++) {
					if (path.getSegment(i) instanceof IProject) {
						project = (IProject) path.getSegment(i);
						break;
					}
				}
				
				Job generateCodeJob = new GenerateCodeJob("Generate Code", app, project, true);
				generateCodeJob.schedule();
				
			}
			
		}
		
		return null;
	}

}
