package org.earthsystemmodeling.cupid.wizards;

import java.net.URL;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.jdom.Document;
import org.jdom.Element;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class CupidProjectWizardPageSelectArch extends WizardPage {
	
	private static Bundle MY_BUNDLE = FrameworkUtil.getBundle(CupidProjectWizardPageSelectArch.class);

	private Map<String, String> wizardData;
	private int selectedIndex = 0;
	private Element selectedElem = null;
	private Document configXML;
	
	public CupidProjectWizardPageSelectArch(Document configXML, Map<String, String> wizardData) {
		super("NUOPC Project Wizard Page 2");
		setTitle("Create NUOPC Project");
		setDescription("Please select an option");
		this.wizardData = wizardData;
		this.configXML = configXML;
	}

	private Label archImage;
	private Label archDesc;
	private Label couplingImage;
	private Label couplingDesc;
	
	
	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		
		@SuppressWarnings("unchecked")
		final List<Element> scenarioList = configXML.getRootElement().getChildren("scenario");
		selectedElem = scenarioList.get(0);  //default
				
		
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
		configLabel.setText("Starting configuration: ");
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).applyTo(configLabel);
			
		
		Combo configCombo = new Combo (container, SWT.READ_ONLY);
		GridDataFactory.fillDefaults().align(SWT.LEFT, SWT.FILL).span(2,1).applyTo(configCombo);
		for (Element s :  scenarioList) {
			configCombo.add(s.getChildTextNormalize("shortdesc"));
		}
		
		configCombo.setText(scenarioList.get(0).getChildTextNormalize("shortdesc"));
		
		configCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectedIndex = ((Combo)e.widget).getSelectionIndex();
				selectedElem = scenarioList.get(selectedIndex);
				
				archDesc.setText(selectedElem.getChild("architecture").getChildTextNormalize("desc"));
				couplingDesc.setText(selectedElem.getChild("coupling").getChildTextNormalize("desc"));
				
				URL url;
				ImageDescriptor id;
				if (selectedElem.getChild("architecture").getChildTextNormalize("image") != null) {
					url = FileLocator.find(MY_BUNDLE, new Path(selectedElem.getChild("architecture").getChildTextNormalize("image")), null);
					id = ImageDescriptor.createFromURL(url);
					archImage.setImage(id.createImage());
				}
				else {
					archImage.setImage(null);
				}
					
				if (selectedElem.getChild("coupling").getChildTextNormalize("image") != null) {
					url = FileLocator.find(MY_BUNDLE, new Path(selectedElem.getChild("coupling").getChildTextNormalize("image")), null);
					id = ImageDescriptor.createFromURL(url);
					couplingImage.setImage(id.createImage());
				}
				else {
					couplingImage.setImage(null);
				}
				
			
				archImage.getParent().layout();
				couplingImage.getParent().layout();
				
				dialogChanged();
			}
		});
			
		
		
		Group groupArch = new Group(container, SWT.NORMAL);
		groupArch.setText("Model Architecture");
		CupidProjectWizard.updateFont(groupArch, SWT.BOLD);
		GridDataFactory.fillDefaults().span(2,1).hint(SWT.DEFAULT, 375).applyTo(groupArch);
		GridLayoutFactory.fillDefaults().margins(5,5).applyTo(groupArch);
				
		Group groupCpl = new Group(container, SWT.NORMAL);
		groupCpl.setText("Coupling Behavior");
		CupidProjectWizard.updateFont(groupCpl, SWT.BOLD);
		GridLayoutFactory.fillDefaults().margins(5,5).applyTo(groupCpl);
		GridDataFactory.fillDefaults().applyTo(groupCpl);
			
		archDesc = new Label(groupArch, SWT.WRAP);
	    archDesc.setText(selectedElem.getChild("architecture").getChildTextNormalize("desc"));  
	    GridDataFactory.fillDefaults().hint(350, SWT.DEFAULT).applyTo(archDesc);
	
		archImage = new Label(groupArch, SWT.NONE);
        
		URL url;
		ImageDescriptor id;
		if (selectedElem.getChild("architecture").getChildTextNormalize("image") != null) {
			url = FileLocator.find(MY_BUNDLE, new Path(selectedElem.getChild("architecture").getChildTextNormalize("image")), null);
			id = ImageDescriptor.createFromURL(url);
			archImage.setImage(id.createImage());
			GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(SWT.DEFAULT, SWT.DEFAULT).applyTo(archImage);
		}
		
	    couplingDesc = new Label(groupCpl, SWT.WRAP);
	    couplingDesc.setText(selectedElem.getChild("coupling").getChildTextNormalize("desc"));    
	    GridDataFactory.fillDefaults().hint(650, SWT.DEFAULT).grab(true, false).applyTo(couplingDesc);
	    
	    couplingImage = new Label(groupCpl, SWT.NONE);
	    
	    if (selectedElem.getChild("coupling").getChildTextNormalize("image") != null) {
	    	url = FileLocator.find(MY_BUNDLE, new Path(selectedElem.getChild("coupling").getChildTextNormalize("image")), null);
	    	id = ImageDescriptor.createFromURL(url);
	    	couplingImage.setImage(id.createImage());   
	    	GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(SWT.DEFAULT, SWT.DEFAULT).applyTo(couplingImage);
	    }
	    
		setControl(container);
		dialogChanged();
		
	}
	
	
	private void dialogChanged() {		
		wizardData.put("scenarioid", selectedElem.getAttributeValue("id"));
		wizardData.put("templateDir", selectedElem.getChildTextNormalize("templatedir"));
		//wizardData.put("remoteDir", selectedElem.getChildTextNormalize("remotedir"));

		if (getNextPage().getControl() != null) {
			Text prjName = (Text) ((Composite) (((Composite) getNextPage().getControl()).getChildren()[0])).getChildren()[1];
			prjName.setText(selectedElem.getAttributeValue("id"));
		}
		else {
			((WizardNewProjectCreationPage) getNextPage()).setInitialProjectName(selectedElem.getAttributeValue("id"));
		}

		updateStatus(null);
	}
		
	
	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
	
}