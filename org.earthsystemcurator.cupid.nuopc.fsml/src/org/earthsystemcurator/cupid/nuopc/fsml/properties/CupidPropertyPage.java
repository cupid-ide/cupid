package org.earthsystemcurator.cupid.nuopc.fsml.properties;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.ui.dialogs.ResourceSelectionDialog;

public class CupidPropertyPage extends PropertyPage {

	private static final String PATH_TITLE = "Project:";
	private static final String OWNER_TITLE = "NUOPC Resources:";
	private static final String NUOPC_FILES_PROPERTY = "NUOPC_FILES";
	
	public static QualifiedName NUOPC_FILES_QN = new QualifiedName("", NUOPC_FILES_PROPERTY);

	private static final int TEXT_FIELD_WIDTH = 50;

	private Text ownerText;

	/**
	 * Constructor for SamplePropertyPage.
	 */
	public CupidPropertyPage() {
		super();
	}

	private void addFirstSection(Composite parent) {
		Composite composite = createDefaultComposite(parent);

		//Label for path field
		Label pathLabel = new Label(composite, SWT.NONE);
		pathLabel.setText(PATH_TITLE);

		// Path text field
		Text pathValueText = new Text(composite, SWT.WRAP | SWT.READ_ONLY);
		pathValueText.setText(((IResource) getElement()).getName());
	}

	private void addSeparator(Composite parent) {
		Label separator = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		separator.setLayoutData(gridData);
	}

	private void addSecondSection(Composite parent) {
		Composite composite = createDefaultComposite(parent);

		// Label for owner field
		Label ownerLabel = new Label(composite, SWT.NONE);
		ownerLabel.setText(OWNER_TITLE);

		// Owner text field
		ownerText = new Text(composite, SWT.MULTI | SWT.BORDER | SWT.READ_ONLY | SWT.SCROLL_LINE);
		GridData gd = new GridData();
		gd.widthHint = convertWidthInCharsToPixels(TEXT_FIELD_WIDTH);
		gd.heightHint = 100;
		ownerText.setLayoutData(gd);

		// Populate owner text field
		try {
			String owner =
					((IResource) getElement()).getPersistentProperty(NUOPC_FILES_QN);
			ownerText.setText((owner != null) ? owner : "");
		} catch (CoreException e) {
			ownerText.setText("");
		}

		Button button = new Button(composite, SWT.PUSH);
		button.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseDown(MouseEvent e) {
				// TODO Auto-generated method stub
				Object[] result = open();
				if (result != null) {

					String fileList = "";
					for (Object r : result) {
						if (r instanceof IResource) {
							fileList += ((IResource) r).getProjectRelativePath().toString() + "\n";

						}
					}
					ownerText.setText(fileList);
				}
				else {
					ownerText.setText("");
				}
			}

		});
		button.setText("Select NUOPC resources");
	}

	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		GridData data = new GridData(GridData.FILL);
		data.grabExcessHorizontalSpace = true;
		composite.setLayoutData(data);

		addFirstSection(composite);
		addSeparator(composite);
		addSecondSection(composite);
		return composite;
	}

	private Composite createDefaultComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		composite.setLayout(layout);

		GridData data = new GridData();
		data.verticalAlignment = GridData.FILL;
		data.horizontalAlignment = GridData.FILL;
		composite.setLayoutData(data);

		return composite;
	}

	@Override
	protected void performDefaults() {
		super.performDefaults();
		// Populate the owner text field with the default value
		ownerText.setText("");
	}

	@Override
	public boolean performOk() {
		// store the value in the owner text field
		try {
			((IResource) getElement()).setPersistentProperty(NUOPC_FILES_QN, ownerText.getText());
		} catch (CoreException e) {
			return false;
		}

		return true;
	}

	public Object[] open() {

		ResourceSelectionDialog dialog =
				new ResourceSelectionDialog(getShell(), ((IResource) getElement()), "Select NUOPC files/folders");

		if (dialog.open() == Window.OK) {
			return dialog.getResult();
		}
		return null;
	}

}