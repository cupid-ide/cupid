package org.earthsystemmodeling.cupid.handlers;

import java.util.regex.Pattern;

import org.earthsystemmodeling.cupid.NUOPC.Component;
import org.earthsystemmodeling.cupid.NUOPC.Driver;
import org.earthsystemmodeling.cupid.NUOPC.Field;
import org.earthsystemmodeling.cupid.NUOPC.Model;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCFactory;
import org.earthsystemmodeling.cupid.NUOPC.UniformGrid;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;

public class GenerateNUOPCComponent extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		ISelectionService selService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection sel = selService.getSelection();
	
		if (sel instanceof ITreeSelection) {
			
			final Object item = ((ITreeSelection) sel).getFirstElement();
			final IContainer container = (IContainer) item;
			
			final NUOPCFactory factory = NUOPCFactory.eINSTANCE;
			//final Application app = factory.createApplication();
			Component comp = null;
			
			String prompt = null;
			String initVal = null;
			
			String compType = event.getParameter("org.earthsystemmodeling.cupid.generateNUOPCComp.componentType");
			if (compType.equals("driver")) {
				Driver driver = factory.createDriver();
				comp = driver;
				prompt = "Please enter a name for the NUOPC Driver component.";
				initVal = "Driver";
			}
			else if (compType.equals("model")) {
				Model model = factory.createModel();
				comp = model;
				
				UniformGrid grid = factory.createUniformGrid();
				grid.setName("ModelGrid");
				grid.getMinIndex().add(1);
				grid.getMinIndex().add(1);
				grid.getMaxIndex().add(100);
				grid.getMaxIndex().add(100);
				grid.getMinCornerCoord().add(1.0);
				grid.getMinCornerCoord().add(1.0);
				grid.getMaxCornerCoord().add(100.0);
				grid.getMaxCornerCoord().add(100.0);
				
				model.getGrids().add(grid);
				
				Field iField = factory.createField();
				iField.setName("ImportField");
				iField.setStandardName("ImportField");
				iField.setGrid(grid);
				
				Field eField = factory.createField();
				eField.setName("ExportField");
				eField.setStandardName("ExportField");
				eField.setGrid(grid);
				
				model.getImportFields().add(iField);
				model.getExportFields().add(eField);
				
				prompt = "Please enter a name for the NUOPC Model component.";
				initVal = "Model";
			}
			else if (compType.equals("mediator")) {
				comp = factory.createMediator();
				prompt = "Please enter a name for the NUOPC Mediator component.";
				initVal = "Mediator";
			}
			else {
				throw new ExecutionException("Requested unexpected component type to generate: " + compType);
			}
			
			String nameFromUser = promptForName(prompt, initVal);
			if (nameFromUser == null) {
				return null;
			}
			
			comp.setName(nameFromUser);
			//app.getChildren().add(comp);
					
			Job generateCodeJob = new GenerateNUOPCComponentJob("Generate NUOPC Component", comp, container, true);
			generateCodeJob.schedule();
			
		}
		
		return null;
	}
	
	private String promptForName(String prompt, String initVal) {
		InputDialog inputDialog = new InputDialog(null, 
				"Component Name", 
				prompt, 
				initVal,
				new IInputValidator() {							
			
			@Override
			public String isValid(String newText) {
				if (newText.length() == 0) {
					return "Please provide a name";
				}
				else if (!Pattern.matches("\\w+", newText)) {
					return "The component name should not contain any spaces or special characters";
				}
				else {
					return null;
				}
			}
		});
		int status = inputDialog.open();
		if (status == InputDialog.OK) {
			return inputDialog.getValue();
		}
		else {
			return null;
		}
	}
	
	

}
