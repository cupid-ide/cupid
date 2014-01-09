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
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class CupidProjectWizardPageSelectArch extends WizardPage {
	
	final String[][] buttonData = new String[][] {
			{"NUOPC - Single Model with Driver",   // configuration name
				"images/relationship_single.png",   // architecture image
				"images/coupling_single.png",   // coupling image
				"A single Model component is called by a Driver in regular intervals.",  // archicture description
				"There is no coupling in this configuration." //coupling description
				},  
			{"NUOPC - Coupled Atmosphere-Ocean with Driver", 
				"images/relationship_simple.png",
				"images/coupling_explicit.png",
				"Atmosphere and Ocean Models exchange data through generic Connectors.",
				"Simple explicit coupling requires that Atmosphere and Ocean fields are exchanged in both directions at the beginning of each coupling interval."},
			{"NUOPC - Coupled Atmosphere-Ocean with Mediator and Driver", 
				"images/relationship_simpleMediator.png",
				"images/coupling_simpleMediator.png",
				"Atmosphere and Ocean Models couple through a Mediator component.",
				"Connector components transfer Atmosphere and Ocean fields to the Mediator at the beginning of each coupling interval. The Mediator processes this input and Connectors transfer the Mediator output back to the model components. The model components then integrate forward for one coupling interval before the same process is repeated."},
			{"ModelE - Basic Configuration (EM20 rundeck) -- COMING SOON",   // configuration name
				null,   // architecture image
				null,   // coupling image
				"This training project is currently not available...",  // archicture description
				"" //coupling description
				},  
	};
	
	public CupidProjectWizardPageSelectArch() {
		super("Cupid Creation Wizard Page 2");
		setTitle("Create Cupid Training Project");
		setDescription("Please select a training project");
	}

	private Label archImage;
	private Label archDesc;
	private Label couplingImage;
	private Label couplingDesc;
	
		
	private static Bundle MY_BUNDLE = FrameworkUtil.getBundle(CupidProjectWizardPageSelectArch.class);
	
	
	
	
	
	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		
		final Composite container = new Composite(parent, SWT.NULL);
		GridLayoutFactory.fillDefaults().numColumns(3).applyTo(container);
		
		/*
		Label desc = new Label(container, SWT.WRAP);
		desc.setText("The basic configurations listed here demonstrate the control "
				+ "and data flows in a NUOPC application. The models themselves are stubs, "
				+ "not performing any useful scientific calculations.");
		CupidProjectWizard.updateFont(desc, SWT.ITALIC);
		GridDataFactory.fillDefaults().span(3, 1).grab(true, false).hint(400,SWT.DEFAULT).applyTo(desc);
		*/
		
		Label configLabel = new Label(container, SWT.NULL);
		configLabel.setText("Basic Configurations: ");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(configLabel);
			
		
		Combo configCombo = new Combo (container, SWT.READ_ONLY);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).span(2,1).applyTo(configCombo);
		for (int i = 0; i < buttonData.length; i++) {
			configCombo.add(buttonData[i][0]);
			//configCombo.
		}
		configCombo.setText(buttonData[0][0]);
		configCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int idx = ((Combo)e.widget).getSelectionIndex();
				
				archDesc.setText(buttonData[idx][3]);
				couplingDesc.setText(buttonData[idx][4]);
				
				URL url;
				ImageDescriptor id;
				if (buttonData[idx][1] != null) {
					url = FileLocator.find(MY_BUNDLE, new Path(buttonData[idx][1]), null);
					id = ImageDescriptor.createFromURL(url);
					archImage.setImage(id.createImage());
				}
				else {
					archImage.setImage(null);
				}
					
				if (buttonData[idx][2] != null) {
					url = FileLocator.find(MY_BUNDLE, new Path(buttonData[idx][2]), null);
					id = ImageDescriptor.createFromURL(url);
					couplingImage.setImage(id.createImage());
				}
				else {
					couplingImage.setImage(null);
				}
								
				archImage.getParent().layout();
				couplingImage.getParent().layout();
				
				//WizardNewProjectCreationPage p = (WizardNewProjectCreationPage) getNextPage();
				//p.setInitialProjectName(buttonData[idx][0]);
				
			}
		});
			
		
		
		Group groupArch = new Group(container, SWT.NORMAL);
		groupArch.setText("Model Architecture");
		CupidProjectWizard.updateFont(groupArch, SWT.BOLD);
		GridDataFactory.fillDefaults().span(2,1).applyTo(groupArch);
		GridLayoutFactory.fillDefaults().margins(5,5).applyTo(groupArch);
				
		Group groupCpl = new Group(container, SWT.NORMAL);
		groupCpl.setText("Coupling Behavior");
		CupidProjectWizard.updateFont(groupCpl, SWT.BOLD);
		GridLayoutFactory.fillDefaults().margins(5,5).applyTo(groupCpl);
		GridDataFactory.fillDefaults().applyTo(groupCpl);
			
		archDesc = new Label(groupArch, SWT.WRAP);
	    archDesc.setText(buttonData[0][3]);  
	    GridDataFactory.fillDefaults().hint(350, SWT.DEFAULT).applyTo(archDesc);
	
		archImage = new Label(groupArch, SWT.NULL);
        
		URL url = FileLocator.find(MY_BUNDLE, new Path(buttonData[0][1]), null);
	    ImageDescriptor id = ImageDescriptor.createFromURL(url);
	    archImage.setImage(id.createImage());
	    GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(SWT.DEFAULT, 300).applyTo(archImage);
	    
	    couplingDesc = new Label(groupCpl, SWT.WRAP);
	    couplingDesc.setText(buttonData[0][4]);    
	    GridDataFactory.fillDefaults().hint(650, SWT.DEFAULT).grab(true, false).applyTo(couplingDesc);
	    
	    couplingImage = new Label(groupCpl, SWT.NONE);
	    url = FileLocator.find(MY_BUNDLE, new Path(buttonData[0][2]), null);
	    id = ImageDescriptor.createFromURL(url);
	    couplingImage.setImage(id.createImage());
			    
	    GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(SWT.DEFAULT, 300).applyTo(couplingImage);
	    
		setControl(container);
		
	}
	
	/*
	@Override
	public IWizardPage getNextPage() {
		// TODO Auto-generated method stub
		return new NUOPCProjectWizardPage3();
	}
	*/
	
	
	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	/*
	private void handleBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Select new file container");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				containerText.setText(((Path) result[0]).toString());
			}
		}
	}
	*/
	
	/**
	 * Ensures that both text fields are set.
	 */
	/*
	private void dialogChanged() {
		IResource container = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new Path(getContainerName()));
		String fileName = getFileName();

		if (getContainerName().length() == 0) {
			updateStatus("File container must be specified");
			return;
		}
		if (container == null
				|| (container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("File container must exist");
			return;
		}
		if (!container.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}
		if (fileName.length() == 0) {
			updateStatus("File name must be specified");
			return;
		}
		if (fileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("File name must be valid");
			return;
		}
		int dotLoc = fileName.lastIndexOf('.');
		if (dotLoc != -1) {
			String ext = fileName.substring(dotLoc + 1);
			if (ext.equalsIgnoreCase("mpe") == false) {
				updateStatus("File extension must be \"mpe\"");
				return;
			}
		}
		updateStatus(null);
	}
	*/
	/*
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getContainerName() {
		return containerText.getText();
	}

	public String getFileName() {
		return fileText.getText();
	}
	*/
}