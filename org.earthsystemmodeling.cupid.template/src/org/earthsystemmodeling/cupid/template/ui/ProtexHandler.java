package org.earthsystemmodeling.cupid.template.ui;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.eclipse.cdt.core.model.ICElement;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

public class ProtexHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		ISelectionService selService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection sel = selService.getSelection();
	
		if (sel instanceof ITreeSelection) {
			final Object item = ((ITreeSelection) sel).getFirstElement();
			
			if (item instanceof ICElement) {

				InputDialog inputDialog = 
						ProtexPreferencePage.getInputDialogForAPIID(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
				inputDialog.open();
				if (inputDialog.getReturnCode()==Window.CANCEL) {
					return null;
				}
				String newid = inputDialog.getValue();
				
				/*
				IRunnableWithProgress toRun = new ParseProtexRunnable(newid, (ICElement) item);
								
				try {
					PlatformUI.getWorkbench().getProgressService().run(true, true, toRun);
				} catch (InvocationTargetException | InterruptedException e1) {
					CupidActivator.log("Exception running Protex parsing", e1);
				}
				*/
				
				Job parseJob = new ParseProtexJob("Parse Protex", newid, (ICElement) item);
				
				/*
				parseJob.addJobChangeListener(new JobChangeAdapter() {

					@Override
					public void done(IJobChangeEvent event) {
						Display.getDefault().asyncExec(new Runnable() {
							public void run() {
							}
						});
					}

				});
				*/
				
				parseJob.schedule();
				
			}
			
		}
		
		return null;
	}


	
	

}
