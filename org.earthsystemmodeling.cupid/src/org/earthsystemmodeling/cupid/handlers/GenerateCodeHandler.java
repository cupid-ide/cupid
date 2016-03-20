package org.earthsystemmodeling.cupid.handlers;

import org.earthsystemmodeling.cupid.NUOPC.Application;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
			
			Application app = null;
			
			if (item instanceof IFile) {
				IFile file = (IFile) item;
				URI fileURI = URI.createFileURI(file.getLocation().toString());
			
				ResourceSet resSet = new ResourceSetImpl();
				Resource res = resSet.getResource(fileURI, true);
				app = (Application) res.getContents().get(0);	
			}
			else if (item instanceof Application) {
				app = (Application) item;
			}
			
			IProject project = null;
			TreePath path = ((ITreeSelection) sel).getPaths()[0];
			for (int i = 0; i < path.getSegmentCount(); i++) {
				if (path.getSegment(i) instanceof IProject) {
					project = (IProject) path.getSegment(i);
					break;
				}
			}
				
			if (app != null && project != null) {
				Job generateCodeJob = new GenerateCodeJob("Generate Code", app, project, true);
				generateCodeJob.schedule();
			}
				
			
			
		}
		
		return null;
	}

}
