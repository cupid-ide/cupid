package org.earthsystemmodeling.cupid.wizards;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.remote.core.IRemoteConnection;
import org.eclipse.remote.core.IRemoteConnectionType;
import org.eclipse.remote.core.IRemoteServicesManager;
import org.eclipse.remote.internal.core.RemoteServicesManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class CupidProjectWizardPageCompEnv extends WizardPage {
	
	private Combo numProcsCombo;
	private Combo compEnvCombo;
	private Combo remoteConnCombo;
	private Label infoLabel;
	
	private Map<String, String> wizardData;
	
	public static final String WD_COMP_ENV = "compEnv";
	public static final String WD_COMP_ENV__CLOUD = "cloud";
	public static final String WD_COMP_ENV__LOCAL = "local";
	public static final String WD_COMP_ENV__REMOTE = "remote";	
	
	public static final String WD_EXIST_CONN= "existingConnectionName";
	
	public CupidProjectWizardPageCompEnv(Map<String,String> wizardData) {
		super("Select Computational Environment");
		setTitle("Create Cupid Training Project");
		setDescription("Configure computational environment");
		this.wizardData = wizardData;
	}

	public void createControl(Composite parent) {
		
		//get existing remote connections
		List<IRemoteConnection> connList = new ArrayList<IRemoteConnection>();
		//IRemoteServices remoteServices = RemoteServices.getRemoteServices("org.eclipse.ptp.remote.RemoteTools", new NullProgressMonitor());
		
		IRemoteServicesManager remoteServicesManager = new RemoteServicesManager();
		IRemoteConnectionType remoteConnType = remoteServicesManager.getConnectionType("org.eclipse.remote.JSch");			
		
		if (remoteConnType != null) {
			//IRemoteConnectionManager connManager = remoteServices.getConnectionManager();
			
			for (IRemoteConnection rc : remoteConnType.getConnections()) {
				//System.out.println("\n==> Remote connection:  " + rc.getName() + " : " + rc.getAddress());
				//for (Entry<String, String> att : rc.getAttributes().entrySet()) {
				//	System.out.println("\t" + att.getKey() + " --> " + att.getValue());
				//}
				if (rc.getAttribute("org.earthsystemmodeling.cupid.ready") != null &&
					rc.getAttribute("org.earthsystemmodeling.cupid.ready").equals("true")) {
					connList.add(rc);
					//remoteConnCombo.add(rc.getName());
				}
			}
		}
		
		
		final Composite container = new Composite(parent, SWT.NULL);
		GridLayoutFactory.fillDefaults().numColumns(2).margins(10,10).applyTo(container);
		
		Label compEnvLabel = new Label(container, SWT.NULL);
		compEnvLabel.setText("Computational environment:");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(compEnvLabel);
			
		compEnvCombo = new Combo (container, SWT.READ_ONLY);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(compEnvCombo);
		compEnvCombo.add("Create a new cloud-based computational environment");
		compEnvCombo.add("Use my local machine");
		if (connList.size() > 0) {
			compEnvCombo.add("Use an existing remote environment");
		}
		compEnvCombo.setText("Create a new cloud-based computational environment");
		compEnvCombo.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		if (connList.size() > 0) {
			Label existEnvLabel = new Label(container, SWT.NULL);
			existEnvLabel.setText("Existing environment:");
			GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(existEnvLabel);
			
			remoteConnCombo = new Combo (container, SWT.READ_ONLY);
			GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(remoteConnCombo);
			for (IRemoteConnection rc : connList) {
				remoteConnCombo.add(rc.getName());
			}
			
			remoteConnCombo.addModifyListener(new ModifyListener() {
				@Override
				public void modifyText(ModifyEvent e) {
					dialogChanged();
				}
			});
		}
		
		infoLabel = new Label(container, SWT.WRAP);
		infoLabel.setText("A cloud-based computational environment will be created for you with all dependencies for your selected training environment.  "
				+ "If prompted, please click 'Yes' to accept the host key when connecting to the computational environment.");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).span(2,1).hint(600, SWT.DEFAULT).applyTo(infoLabel);
		CupidProjectWizard.updateFont(infoLabel, SWT.ITALIC);
		
		
		
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
		
		switch(compEnvCombo.getSelectionIndex()) {
		
		case 0:
			infoLabel.setText("A cloud-based computational environment will be created for you with all dependencies for your selected training environment.  "
					+ "If prompted, please click 'Yes' to accept the host key when connecting to the computational environment.");
			wizardData.put(WD_COMP_ENV, WD_COMP_ENV__CLOUD);
			if (remoteConnCombo != null) {
				remoteConnCombo.setEnabled(false);
			}
			break;
		case 1:
			infoLabel.setText("Use my local machine to compile and execute the training project.  This option requires that the dependencies are already installed.");
			wizardData.put(WD_COMP_ENV, WD_COMP_ENV__LOCAL);
			if (remoteConnCombo != null) {
				remoteConnCombo.setEnabled(false);
			}
			break;
		case 2:
			infoLabel.setText("Use an existing computational environment.  Required dependencies will be verified "
					+ "before setting up the new project.");
			wizardData.put(WD_COMP_ENV, WD_COMP_ENV__REMOTE);
			remoteConnCombo.setEnabled(true);
			break;
		}
		
		if (remoteConnCombo != null && remoteConnCombo.isEnabled()) {
			wizardData.put(WD_EXIST_CONN, remoteConnCombo.getText());
		}
		else {
			wizardData.remove(WD_EXIST_CONN);
		}
		
		compEnvCombo.getParent().redraw();
		/*
		if (compEnvCombo.getSelectionIndex() == 2) {
			updateStatus("Use of existing remote environment is currently not supported.");
		}
		else {
			updateStatus(null);
		}
		*/
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