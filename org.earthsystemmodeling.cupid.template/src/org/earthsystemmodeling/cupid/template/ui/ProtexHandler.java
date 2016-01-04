package org.earthsystemmodeling.cupid.template.ui;

import java.lang.reflect.InvocationTargetException;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.template.core.ProtexASTVisitor;
import org.earthsystemmodeling.cupid.template.core.ProtexStore;
import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.cdt.core.model.ICElementVisitor;
import org.eclipse.cdt.core.model.ITranslationUnit;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

@SuppressWarnings("restriction")
public class ProtexHandler extends AbstractHandler {

	private int fileCount = 0;
	
	private void incrementCount() {
		fileCount++;
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ISelectionService selService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection sel = selService.getSelection();
	

		if (sel instanceof ITreeSelection) {
			final Object item = ((ITreeSelection) sel).getFirstElement();
			
			if (item instanceof ICElement) {

				IRunnableWithProgress toRun = new IRunnableWithProgress() {

					@Override
					public void run(final IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
						
						ICElement celem = (ICElement) item;					
						fileCount = 0;
						
						try {
							celem.accept(new ICElementVisitor() {
								@Override
								public boolean visit(ICElement element) throws CoreException {
									if (element instanceof ITranslationUnit) {
										IFile file = ((ITranslationUnit) element).getFile();
										if (file.getFileExtension().equalsIgnoreCase("F90")) {
											incrementCount();
										}
									}									
									return true;
								}
							});
						} catch (CoreException e) {
							CupidActivator.log("Error retrieving resource for Protex parsing", e);
						}
						
						monitor.beginTask("Parsing Protex", fileCount);  
						
						PhotranVPG.getInstance().releaseAllASTs();
						ProtexStore.getInstance().clear();
						
						
						try {
							celem.accept(new ICElementVisitor() {

								@Override
								public boolean visit(ICElement element) throws CoreException {
									
									if (monitor.isCanceled()) {
										return false;
									}
									
									if (element instanceof ITranslationUnit) {
										IFile file = ((ITranslationUnit) element).getFile();
										if (file.getFileExtension().equalsIgnoreCase("F90")) {
											monitor.subTask(file.getName());
											IFortranAST ast = PhotranVPG.getInstance().acquirePermanentAST(file);
											if (ast == null) {
												CupidActivator.debug("Error retrieving AST for " + file.getFullPath());
											}
											else {
												//System.out.print(".");
												ast.accept(new ProtexASTVisitor(ProtexStore.getInstance()));
												PhotranVPG.getInstance().releaseAST(file);
											}	
											monitor.worked(1);
										}
									}
									
									return true;
								}

							});
						} catch (CoreException e) {
							CupidActivator.log("Error retrieving resource for Protex parsing", e);
						}
						
						monitor.done();
						
					}
					
				};
				
				
				try {
					PlatformUI.getWorkbench().getProgressService().run(true, true, toRun);
				} catch (InvocationTargetException | InterruptedException e1) {
					CupidActivator.log("Exception running Protex parsing", e1);
				}
				

			}
			
		}

		ProtexStore store = ProtexStore.getInstance();
		store.save();
		store.clear();
		store.load();
		
		return null;
	}



}
