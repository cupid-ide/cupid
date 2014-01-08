package org.earthsystemcurator.cupid.nuopc.fsml.wizards;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class NUOPCProjectWizardPageCompEnv extends WizardPage {
	
	private Map<String, String> wizardData;
	
	public NUOPCProjectWizardPageCompEnv() {
		super("NUOPC Creation Wizard - Select Computational Environment");
		setTitle("Create NUOPC Project");
		setDescription("Select computational environment");
		wizardData = new HashMap<String,String>();
	}

	public void createControl(Composite parent) {
		
		final Composite container = new Composite(parent, SWT.NULL);
		GridLayoutFactory.fillDefaults().numColumns(2).margins(10,10).applyTo(container);
		
		Label numProcsLabel = new Label(container, SWT.NULL);
		numProcsLabel.setText("Number of processes:");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(numProcsLabel);
			
		Combo numProcsCombo = new Combo (container, SWT.READ_ONLY);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).span(2,1).applyTo(numProcsCombo);
		numProcsCombo.add("1");
		numProcsCombo.add("2");
		numProcsCombo.add("4");
		numProcsCombo.add("8");
		numProcsCombo.setText("1");
		
		setControl(container);
		dialogChanged();
		
	}
	
	private boolean checkEmpty(Text t) {
		return t.getText().length() == 0;
	}
	
	private void dialogChanged() {
		
		
	}
	
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
	public Map<String,String> getWizardData() {
		return wizardData;
	}
	
	
	
}