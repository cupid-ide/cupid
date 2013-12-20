package org.earthsystemcurator.cupid.nuopc.fsml.wizards;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class NUOPCProjectWizardPage3 extends WizardPage {
		
	public NUOPCProjectWizardPage3() {
		super("NUOPC Creation Wizard Page 3");
		setTitle("Create NUOPC Project");
		setDescription("Select NUOPC application properties");
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
		
		
		/* DRIVER PROPERTIES */
		
		Group groupDriver = new Group(container, SWT.NULL);
		groupDriver.setText("Driver properties");
		NUOPCProjectWizard.updateFont(groupDriver, SWT.BOLD);
		//GridDataFactory.fillDefaults().span(2,1).applyTo(groupArch);
		GridLayoutFactory.fillDefaults().numColumns(2).margins(10, 10).applyTo(groupDriver);
		
		Label driverNameLabel = new Label(groupDriver, SWT.NULL);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(driverNameLabel);
		driverNameLabel.setText("Driver name:");
	
		Text driverNameText = new Text(groupDriver, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).hint(250, SWT.DEFAULT).applyTo(driverNameText);
		driverNameText.setText("driver");
	
		Label driverTimestepLabel = new Label(groupDriver, SWT.NULL);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(driverTimestepLabel);
		driverTimestepLabel.setText("Timestep length (seconds):");
	
		Text driverTimestepText = new Text(groupDriver, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).hint(250, SWT.DEFAULT).applyTo(driverTimestepText);
		driverTimestepText.setText("30");
		driverTimestepText.addVerifyListener(intVerifyListener);		
		
		Label driverRunLengthLabel = new Label(groupDriver, SWT.NULL);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(driverRunLengthLabel);
		driverRunLengthLabel.setText("Totat number of timesteps:");
	
		Text driverRunLengthText = new Text(groupDriver, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).hint(250, SWT.DEFAULT).applyTo(driverRunLengthText);
		driverRunLengthText.setText("5");
		driverRunLengthText.addVerifyListener(intVerifyListener);		
		
		
		/* MODEL PROPERTIES */
		
		Group groupModel = new Group(container, SWT.NULL);
		groupModel.setText("Model properties");
		NUOPCProjectWizard.updateFont(groupModel, SWT.BOLD);
		//GridDataFactory.fillDefaults().span(2,1).applyTo(groupArch);
		GridLayoutFactory.fillDefaults().numColumns(2).margins(10, 10).applyTo(groupModel);
		
		
		Label modelNameLabel = new Label(groupModel, SWT.NULL);
		modelNameLabel.setText("Model name:");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(modelNameLabel);

		Text modelNameText = new Text(groupModel, SWT.BORDER);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).hint(250, SWT.DEFAULT).applyTo(modelNameText);
		modelNameText.setText("model");
		
		setControl(container);
		
	}
		
}