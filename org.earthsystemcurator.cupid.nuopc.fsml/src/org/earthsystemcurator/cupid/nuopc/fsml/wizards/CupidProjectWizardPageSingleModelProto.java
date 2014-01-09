package org.earthsystemcurator.cupid.nuopc.fsml.wizards;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ptp.internal.rdt.sync.ui.SynchronizeParticipantRegistry;
import org.eclipse.ptp.rdt.sync.ui.ISynchronizeParticipant;
import org.eclipse.ptp.rdt.sync.ui.ISynchronizeParticipantDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class CupidProjectWizardPageSingleModelProto extends WizardPage {
	
	private Text driverNameText;
	private Text driverTimestepText;
	private Text driverRunLengthText;
	private Text modelNameText;
	private Text minXText;
	private Text maxXText;
	private Text minYText;
	private Text maxYText;
	private Text cellsXText;
	private Text cellsYText;
	private List exportedFieldsList;
	private List importedFieldsList;
	
	private Map<String, String> wizardData;
	
	//private static final String templateDir = "templates/SingleModelProto";
	
	public CupidProjectWizardPageSingleModelProto() {
		super("NUOPC Creation Wizard Page 3");
		setTitle("Create Cupid Training Project");
		setDescription("Configure training application: NUOPC - Single Model with Driver");
		wizardData = new HashMap<String,String>();
	}

	public void createControl(Composite parent) {
		
		final Composite container = new Composite(parent, SWT.NULL);
		GridLayoutFactory.fillDefaults().margins(10,10).applyTo(container);
		
		/* Integer VerifyListener */
		VerifyListener intVerifyListener = new VerifyListener() {
			@Override
			public void verifyText(VerifyEvent e) {
				
				Text text = (Text) e.getSource();

	            final String oldS = text.getText();
	            String newS = oldS.substring(0, e.start) + e.text + oldS.substring(e.end);

	            if (newS.length() > 0) {
		            try {
		                Integer.parseInt(newS);
		            }
		            catch(NumberFormatException ex) {
		                e.doit = false;
		            }
	            }
	            
			}
		};
		
		ModifyListener pageListener = new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
			
		};
		
		
		VerifyListener nameListener = new VerifyListener() {

			@Override
			public void verifyText(VerifyEvent e) {
				//System.out.println(e.text);
				String text = ((Text) e.widget).getText() + e.text;
				if (text.matches("[A-Za-z][A-Za-z0-9_]*")) {
					e.doit = true;
				}
				else {
					e.doit = false;
				}
			}
			
		};
		
		
		/* DRIVER PROPERTIES */
		
		Group groupDriver = new Group(container, SWT.NULL);
		groupDriver.setText("Driver properties");
		CupidProjectWizard.updateFont(groupDriver, SWT.BOLD);
		//GridDataFactory.fillDefaults().span(2,1).applyTo(groupArch);
		GridLayoutFactory.fillDefaults().numColumns(2).margins(10, 10).applyTo(groupDriver);
		
		Label driverNameLabel = new Label(groupDriver, SWT.NULL);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(driverNameLabel);
		driverNameLabel.setText("Driver name:");
	
		driverNameText = new Text(groupDriver, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).hint(250, SWT.DEFAULT).applyTo(driverNameText);
		driverNameText.setText("driver");
		driverNameText.addModifyListener(pageListener);
		driverNameText.addVerifyListener(nameListener);
	
		Label driverTimestepLabel = new Label(groupDriver, SWT.NULL);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(driverTimestepLabel);
		driverTimestepLabel.setText("Timestep length (seconds):");
	
		driverTimestepText = new Text(groupDriver, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).hint(250, SWT.DEFAULT).applyTo(driverTimestepText);
		driverTimestepText.setText("30");
		driverTimestepText.addVerifyListener(intVerifyListener);
		driverTimestepText.addModifyListener(pageListener);
		
		Label driverRunLengthLabel = new Label(groupDriver, SWT.NULL);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(driverRunLengthLabel);
		driverRunLengthLabel.setText("Total number of timesteps:");
	
		driverRunLengthText = new Text(groupDriver, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).hint(250, SWT.DEFAULT).applyTo(driverRunLengthText);
		driverRunLengthText.setText("5");
		driverRunLengthText.addVerifyListener(intVerifyListener);
		driverRunLengthText.addModifyListener(pageListener);
		
		
		/* MODEL PROPERTIES */
		Group groupModel = new Group(container, SWT.NULL);
		groupModel.setText("Model properties");
		CupidProjectWizard.updateFont(groupModel, SWT.BOLD);
		GridLayoutFactory.fillDefaults().numColumns(4).margins(10, 10).applyTo(groupModel);
		
		Label modelNameLabel = new Label(groupModel, SWT.NULL);
		modelNameLabel.setText("Model name:");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(modelNameLabel);

		modelNameText = new Text(groupModel, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).hint(250, SWT.DEFAULT).span(3,1).applyTo(modelNameText);
		modelNameText.setText("model");
		modelNameText.addModifyListener(pageListener);
		modelNameText.addVerifyListener(nameListener);
		
		/* NUMERICAL GRID */
		Label gridLabel = new Label(groupModel, SWT.NULL);
		gridLabel.setText("Numerical grid:");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(gridLabel);
		
		Label gridTypeLabel = new Label(groupModel, SWT.NULL);
		gridTypeLabel.setText("Uniform 2D Cartesian");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).span(3,1).applyTo(gridTypeLabel);
		CupidProjectWizard.updateFont(gridTypeLabel, SWT.ITALIC);
		

		Label minXLabel = new Label(groupModel, SWT.NULL);
		minXLabel.setText("Min X coordinate:");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(minXLabel);
		
		minXText = new Text(groupModel, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).hint(50, SWT.DEFAULT).applyTo(minXText);
		minXText.setText("0");
		minXText.addVerifyListener(intVerifyListener);
		minXText.addModifyListener(pageListener);
		
		Label maxXLabel = new Label(groupModel, SWT.NULL);
		maxXLabel.setText("Max X coordinate:");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(maxXLabel);
		
		maxXText = new Text(groupModel, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).hint(50, SWT.DEFAULT).applyTo(maxXText);
		maxXText.setText("100");
		maxXText.addVerifyListener(intVerifyListener);
		maxXText.addModifyListener(pageListener);
		
		Label minYLabel = new Label(groupModel, SWT.NULL);
		minYLabel.setText("Min Y coordinate:");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(minYLabel);
		
		minYText = new Text(groupModel, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).hint(50, SWT.DEFAULT).applyTo(minYText);
		minYText.setText("0");
		minYText.addVerifyListener(intVerifyListener);
		minYText.addModifyListener(pageListener);
		
		Label maxYLabel = new Label(groupModel, SWT.NULL);
		maxYLabel.setText("Max Y coordinate:");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(maxYLabel);
		
		maxYText = new Text(groupModel, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).hint(50, SWT.DEFAULT).applyTo(maxYText);
		maxYText.setText("100");
		maxYText.addVerifyListener(intVerifyListener);
		maxYText.addModifyListener(pageListener);
		
		Label cellsXLabel = new Label(groupModel, SWT.NULL);
		cellsXLabel.setText("Cells in X direction:");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(cellsXLabel);
		
		cellsXText = new Text(groupModel, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).hint(50, SWT.DEFAULT).applyTo(cellsXText);
		cellsXText.setText("100");
		cellsXText.addVerifyListener(intVerifyListener);
		cellsXText.addModifyListener(pageListener);
		
		Label cellsYLabel = new Label(groupModel, SWT.NULL);
		cellsYLabel.setText("Cells in Y direction:");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(cellsYLabel);
		
		cellsYText = new Text(groupModel, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).hint(50, SWT.DEFAULT).applyTo(cellsYText);
		cellsYText.setText("100");
		cellsYText.addVerifyListener(intVerifyListener);
		cellsYText.addModifyListener(pageListener);
		
		
		
		/* IMPORTED FIELDS */
		/*
		Label importedFieldsLabel = new Label(groupModel, SWT.NULL);
		importedFieldsLabel.setText("Imported fields:");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).span(1,2).applyTo(importedFieldsLabel);
		
		importedFieldsList = new List (groupModel, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).span(2,2).hint(250, SWT.DEFAULT).applyTo(importedFieldsList);
		
		final Button addImportedFieldButton = new Button(groupModel, SWT.PUSH);
		addImportedFieldButton.setText("Add");
				
		final Button removeImportedFieldButton = new Button(groupModel, SWT.PUSH);
		removeImportedFieldButton.setText("Remove");
		*/
		
		/* EXPORTED FIELDS */
		/*
		Label exportedFieldsLabel = new Label(groupModel, SWT.NULL);
		exportedFieldsLabel.setText("Exported fields:");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).span(1,2).applyTo(exportedFieldsLabel);
		
		exportedFieldsList = new List (groupModel, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).span(2,2).hint(250, SWT.DEFAULT).applyTo(exportedFieldsList);
		
		final Button addExportedFieldButton = new Button(groupModel, SWT.PUSH);
		addExportedFieldButton.setText("Add");
				
		final Button removeExportedFieldButton = new Button(groupModel, SWT.PUSH);
		removeExportedFieldButton.setText("Remove");
		
		
		final IInputValidator fieldNameValidator = new IInputValidator() {
			@Override
			public String isValid(String newText) {
				if (!newText.matches("[A-Za-z][A-Za-z0-9_]*")) {
					return "Field name invalid.  The field name must start with a letter and can only contain letters, numbers, and underscores.";
				}
				return null;
			}
		};
		
		Listener buttonListener = new Listener() {
			public void handleEvent(Event event) {
				if (event.widget == addImportedFieldButton) {

					InputDialog dlg = new InputDialog(
							event.display.getActiveShell(),
							"Imported field name", 
							"Enter the name of the imported field.", 
							"imported_field_name", 
							fieldNameValidator);
					
					if (dlg.open() == Window.OK) {
						java.util.List<String> items = Arrays.asList(importedFieldsList.getItems());
						if (!items.contains(dlg.getValue())) {
							importedFieldsList.add(dlg.getValue());
						}
					}

					
				}
				else if (event.widget == addExportedFieldButton) {

					InputDialog dlg = new InputDialog(
							event.display.getActiveShell(),
							"Exported field name", 
							"Enter the name of the exported field.", 
							"exported_field_name", 
							fieldNameValidator);
					
					if (dlg.open() == Window.OK) {
						java.util.List<String> items = Arrays.asList(exportedFieldsList.getItems());
						if (!items.contains(dlg.getValue())) {
							exportedFieldsList.add(dlg.getValue());
						}
					}

					
				}
				else if (event.widget == removeImportedFieldButton) {
					importedFieldsList.remove(importedFieldsList.getSelectionIndices());
				}
				else if (event.widget == removeExportedFieldButton) {
					exportedFieldsList.remove(exportedFieldsList.getSelectionIndices());
				}
				
				dialogChanged();
				
			}
		};

		addImportedFieldButton.addListener(SWT.Selection, buttonListener);
		removeImportedFieldButton.addListener(SWT.Selection, buttonListener);
		addExportedFieldButton.addListener(SWT.Selection, buttonListener);
		removeExportedFieldButton.addListener(SWT.Selection, buttonListener);
		*/
		
		setControl(container);
		
		dialogChanged();
		
	}
	
	private boolean checkEmpty(Text t) {
		return t.getText().length() == 0;
	}
	
	private void dialogChanged() {
		
		wizardData.put("modelName", modelNameText.getText());
		
		if (checkEmpty(driverNameText)) {
			updateStatus("Driver name required");
		}
		else if (checkEmpty(driverTimestepText)) {
			updateStatus("Driver timestep length required");
		}
		else if (checkEmpty(driverRunLengthText)) {
				updateStatus("Driver number of timesteps required");
		}
		else if (checkEmpty(modelNameText)) {
			updateStatus("Model name required");
		}
		else if (checkEmpty(minXText)) {
			updateStatus("Minumum X coordinate required");
		}
		else if (checkEmpty(maxXText)) {
			updateStatus("Maximum X coordinate required");
		}
		else if (checkEmpty(minYText)) {
			updateStatus("Minumum Y coordinate required");
		}
		else if (checkEmpty(maxYText)) {
			updateStatus("Maximum Y coordinate required");
		}
		else if (checkEmpty(cellsXText)) {
			updateStatus("Number of cells in X direction required");
		}
		else if (checkEmpty(cellsYText)) {
			updateStatus("Number of cells in Y direction required");
		}
		//else if (importedFieldsList.getItemCount() == 0 && exportedFieldsList.getItemCount() == 0) {
		//	updateStatus("You must define at least one import or export field for the model");
		//}
		else {
			updateStatus(null);
		}
	}
	
	
	
	
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
	public Map<String,String> getWizardData() {
		return wizardData;
	}
	
	public String getModelName() {
		return modelNameText.getText();
		//return modelName;
	}
	
	public String getDriverName() {
		return driverNameText.getText();
	}
	
	public String getDriverTimestep() {
		return driverTimestepText.getText();
	}
	
	public String getDriverRunLength() {
		return driverRunLengthText.getText();
	}
	
	public String getMinX() {
		return minXText.getText();
	}
	
	public String getMaxX() {
		return maxXText.getText();
	}
	
	public String getMinY() {
		return minYText.getText();
	}
	
	public String getMaxY() {
		return maxYText.getText();
	}
	
	public String getCellsX() {
		return cellsXText.getText();
	}
	
	public String getCellsY() {
		return cellsYText.getText();
	}
	
	public String[] getImportedFields() {
		return importedFieldsList.getItems();
	}
	
	public String[] getExportedFields() {
		return exportedFieldsList.getItems();
	}
	
}