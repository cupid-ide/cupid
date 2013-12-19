package org.earthsystemcurator.cupid.nuopc.fsml.wizards;

import java.net.URL;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class NUOPCProjectWizardPage2 extends WizardPage {
	
	public NUOPCProjectWizardPage2() {
		super("NUOPC Creation Wizard Page 2");
		setTitle("Create NUOPC Project");
		setDescription("Select NUOPC project configuration");
	}

	private Text containerText;

	private Text fileText;

	private ISelection selection;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	//public NUOPCProjectWizardPage(ISelection selection) {
	//	//super("wizardPage");
	//	setTitle("Multi-page Editor File");
	//	setDescription("This wizard creates a new file with *.mpe extension that can be opened by a multi-page editor.");
	//	this.selection = selection;
	//}

	private static Bundle MY_BUNDLE = FrameworkUtil.getBundle(NUOPCProjectWizardPage2.class);
	
	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		//layout.verticalSpacing = 9;
		
		Group group = new Group(container, SWT.NORMAL);
		group.setText("Basic configurations");
		group.setLayout(new RowLayout(SWT.VERTICAL));
		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		group.setLayoutData(gd);
		
		
		Button r1 = new Button(group, SWT.RADIO);
		r1.setText("Single Model with Driver");
		
		Button r2 = new Button(group, SWT.RADIO);
		r2.setText("Coupled Atmosphere-Ocean with Driver");
		
		Button r3 = new Button(group, SWT.RADIO);
		r3.setText("Coupled Atmosphere-Ocean with Mediator and Driver");
		
		Group group2 = new Group(container, SWT.NORMAL);
		group2.setText("Preview");
		//group.setLayout(new RowLayout(SWT.VERTICAL));
		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		group2.setLayoutData(gd);
		
		Label previewImage = new Label(group2, SWT.NONE);
        
		URL url = FileLocator.find(MY_BUNDLE, new Path("images/"), null);
	    //ImageDescriptor image = ImageDescriptor.createFromURL(url);previewImage.setImage();
        //Display.getDefault()

		
		/*
		Label label = new Label(group, SWT.NULL);
		label.setText("&Container:");

		containerText = new Text(group, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		containerText.setLayoutData(gd);
		containerText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		Button button = new Button(group, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
		label = new Label(group, SWT.NULL);
		label.setText("&File name:");

		fileText = new Text(group, SWT.BORDER | SWT.SINGLE);
		//gd = new GridData(GridData.FILL_HORIZONTAL);
		gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		fileText.setLayoutData(gd);
		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		*/
		
		//initialize();
		//dialogChanged();
		setControl(container);
		
		
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		if (selection != null && selection.isEmpty() == false
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer)
					container = (IContainer) obj;
				else
					container = ((IResource) obj).getParent();
				containerText.setText(container.getFullPath().toString());
			}
		}
		fileText.setText("new_file.mpe");
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

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

	/**
	 * Ensures that both text fields are set.
	 */

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
}