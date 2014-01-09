package org.earthsystemcurator.cupid.nuopc.fsml.wizards;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class CupidProjectWizardPageCompEnv extends WizardPage {
	
	private Combo numProcsCombo;
	private Map<String, String> wizardData;
	
	public CupidProjectWizardPageCompEnv() {
		super("Select Computational Environment");
		setTitle("Create Cupid Training Project");
		setDescription("Configure computational environment");
		wizardData = new HashMap<String,String>();
	}

	public void createControl(Composite parent) {
		
		final Composite container = new Composite(parent, SWT.NULL);
		GridLayoutFactory.fillDefaults().numColumns(2).margins(10,10).applyTo(container);
		
		Label infoLabel = new Label(container, SWT.WRAP);
		infoLabel.setText("A cloud-based computational environment will be created for you with all dependencies for your selected training environment.  "
				+ "If prompted, please click 'Yes' to accept the host key when connecting to the computational environment.");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).span(2,1).hint(600, SWT.DEFAULT).applyTo(infoLabel);
		CupidProjectWizard.updateFont(infoLabel, SWT.ITALIC | SWT.BOLD);
		
		Label numProcsLabel = new Label(container, SWT.NULL);
		numProcsLabel.setText("Number of processes:");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(numProcsLabel);
			
		numProcsCombo = new Combo (container, SWT.READ_ONLY);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(numProcsCombo);
		numProcsCombo.add("1");
		numProcsCombo.add("2");
		numProcsCombo.add("4");
		numProcsCombo.add("8");
		numProcsCombo.setText("1");
		numProcsCombo.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		setControl(container);
		dialogChanged();
		
	}
	
		
	private void dialogChanged() {
		/*
		if (!numProcsCombo.getText().equals("1")) {
			updateStatus("Currently only sequential (1 processor) runs are supported.");
		}
		else {
			updateStatus(null);
		}*/
		updateStatus(null);
	}
	
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
	public Map<String,String> getWizardData() {
		return wizardData;
	}
	
	
	
}