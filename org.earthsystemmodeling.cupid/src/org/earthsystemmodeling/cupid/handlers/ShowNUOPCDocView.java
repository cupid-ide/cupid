package org.earthsystemmodeling.cupid.handlers;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

public class ShowNUOPCDocView extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("org.earthsystemmodeling.cupid.views.NUOPCDocView");
		} catch (PartInitException e) {
			CupidActivator.log("Error opening NUOPC Doc View from toolbar", e);
		}
		return null;
	}

	

}
