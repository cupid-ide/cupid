package org.earthsystemcurator.cupid.nuopc.fsml.wizards;

import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Properties;

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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.jdom.Document;
import org.jdom.Element;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class CupidProjectWizardPageSelectArch extends WizardPage {
	
	private Map<String, String> wizardData;
	private int selectedIndex = 0;
	private Element selectedElem = null;
	private Document configXML;
	
	/*
	final String[][] buttonData = new String[][] {
			{"NUOPC - Single Model with Driver",   // configuration name
				"images/relationship_single.png",   // architecture image
				"images/coupling_single.png",   // coupling image
				"A single Model component is called by a Driver in regular intervals.",  // archicture description
				"There is no coupling in this configuration.", //coupling description
				"SingleModelProto", //template directory
				null,  //remote directory
				},  
			{"NUOPC - Coupled Atmosphere-Ocean with Driver", 
				"images/relationship_simple.png",
				"images/coupling_explicit.png",
				"Atmosphere and Ocean Models exchange data through generic Connectors.",
				"Simple explicit coupling requires that Atmosphere and Ocean fields are exchanged in both directions at the beginning of each coupling interval.",
				"AtmOcnProto",
				null},
			{"NUOPC - Coupled Atmosphere-Ocean with Mediator and Driver", 
				"images/relationship_simpleMediator.png",
				"images/coupling_simpleMediator.png",
				"Atmosphere and Ocean Models couple through a Mediator component.",
				"Connector components transfer Atmosphere and Ocean fields to the Mediator at the beginning of each coupling interval. The Mediator processes this input and Connectors transfer the Mediator output back to the model components. The model components then integrate forward for one coupling interval before the same process is repeated.",
				"AtmOcnMedProto",
				null},
			{"ModelE - Basic Configuration (EM20 rundeck) -- COMING SOON",   // configuration name
				null,   // architecture image
				null,   // coupling image
				"This training project is currently not available...",  // archicture description
				"", //coupling description
				"ModelEExample",
				"/home/sgeadmin/modelE"
				},  
	};
	*/
	
	public CupidProjectWizardPageSelectArch(Document configXML, Map<String, String> wizardData) {
		super("Cupid Creation Wizard Page 2");
		setTitle("Create Cupid Training Project");
		setDescription("Please select a training scenario");
		this.wizardData = wizardData;
		this.configXML = configXML;
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
		configLabel.setText("Training scenario: ");
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
		GridDataFactory.fillDefaults().span(2,1).applyTo(groupArch);
		GridLayoutFactory.fillDefaults().margins(5,5).applyTo(groupArch);
				
		Group groupCpl = new Group(container, SWT.NORMAL);
		groupCpl.setText("Coupling Behavior");
		CupidProjectWizard.updateFont(groupCpl, SWT.BOLD);
		GridLayoutFactory.fillDefaults().margins(5,5).applyTo(groupCpl);
		GridDataFactory.fillDefaults().applyTo(groupCpl);
			
		archDesc = new Label(groupArch, SWT.WRAP);
	    archDesc.setText(selectedElem.getChild("architecture").getChildTextNormalize("desc"));  
	    GridDataFactory.fillDefaults().hint(350, SWT.DEFAULT).applyTo(archDesc);
	
		archImage = new Label(groupArch, SWT.NULL);
        
		URL url = FileLocator.find(MY_BUNDLE, new Path(selectedElem.getChild("architecture").getChildTextNormalize("image")), null);
	    ImageDescriptor id = ImageDescriptor.createFromURL(url);
	    archImage.setImage(id.createImage());
	    GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(SWT.DEFAULT, 300).applyTo(archImage);
	    
	    couplingDesc = new Label(groupCpl, SWT.WRAP);
	    couplingDesc.setText(selectedElem.getChild("coupling").getChildTextNormalize("desc"));    
	    GridDataFactory.fillDefaults().hint(650, SWT.DEFAULT).grab(true, false).applyTo(couplingDesc);
	    
	    couplingImage = new Label(groupCpl, SWT.NONE);
	    url = FileLocator.find(MY_BUNDLE, new Path(selectedElem.getChild("coupling").getChildTextNormalize("image")), null);
	    id = ImageDescriptor.createFromURL(url);
	    couplingImage.setImage(id.createImage());
			    
	    GridDataFactory.fillDefaults().align(SWT.CENTER, SWT.CENTER).hint(SWT.DEFAULT, 300).applyTo(couplingImage);
	    
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