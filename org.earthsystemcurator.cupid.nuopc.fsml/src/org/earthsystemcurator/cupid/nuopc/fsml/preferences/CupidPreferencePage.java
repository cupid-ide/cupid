package org.earthsystemcurator.cupid.nuopc.fsml.preferences;


import org.earthsystemcurator.cupid.nuopc.fsml.core.CupidActivator;
import org.eclipse.jface.preference.*;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;

public class CupidPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {
	
	public static final String CUPID_AWS_ACCESS_KEY = "CUPID_AWS_ACCESS_KEY";
	public static final String CUPID_AWS_SECRET_KEY = "CUPID_AWS_SECRET_KEY";
	public static final String CUPID_LANGUAGE_URI = "CUPID_LANGUAGE_URI";


	public CupidPreferencePage() {
		super(GRID);
		setPreferenceStore(CupidActivator.getDefault().getPreferenceStore());
		setDescription("Cupid preferences");
	}
	
	public void createFieldEditors() {
		/*
		addField(new DirectoryFieldEditor(PreferenceConstants.P_PATH, 
				"&Directory preference:", getFieldEditorParent()));
		addField(
			new BooleanFieldEditor(
				PreferenceConstants.P_BOOLEAN,
				"&An example of a boolean preference",
				getFieldEditorParent()));

		addField(new RadioGroupFieldEditor(
				PreferenceConstants.P_CHOICE,
			"An example of a multiple-choice preference",
			1,
			new String[][] { { "&Choice 1", "choice1" }, {
				"C&hoice 2", "choice2" }
		}, getFieldEditorParent()));
		*/
		
		
		addField(new PasswordStringFieldEditor(CUPID_AWS_ACCESS_KEY, "Amazon AWS Access Key:", getFieldEditorParent()));
		addField(new PasswordStringFieldEditor(CUPID_AWS_SECRET_KEY, "Amazon AWS Secret Key:", getFieldEditorParent()));
	
		addField(new StringFieldEditor(CUPID_LANGUAGE_URI, "Language definition URI", getFieldEditorParent()){
			@Override
			protected void doLoadDefault() {
				setStringValue("http://defaulturi");
			}
		});
		
	}
	
	class PasswordStringFieldEditor extends StringFieldEditor {
		public PasswordStringFieldEditor(String name, String labelText, Composite parent) {
			super(name, labelText, parent);
		}
		@Override
	    protected void doFillIntoGrid(Composite parent, int numColumns) {
	        super.doFillIntoGrid(parent, numColumns);
	        getTextControl().setEchoChar('*');
	    }
		
		
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}
	
}