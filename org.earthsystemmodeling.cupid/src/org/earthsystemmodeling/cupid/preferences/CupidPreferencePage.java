package org.earthsystemmodeling.cupid.preferences;


import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.eclipse.jface.preference.*;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.eclipse.ui.IWorkbench;

public class CupidPreferencePage
	extends FieldEditorPreferencePage
	implements IWorkbenchPreferencePage {
	
	public static final String CUPID_AWS_ACCESS_KEY = "CUPID_AWS_ACCESS_KEY";
	public static final String CUPID_AWS_SECRET_KEY = "CUPID_AWS_SECRET_KEY";
	//public static final String CUPID_LANGUAGE_URI = "CUPID_LANGUAGE_URI";
	//public static final String CUPID_LANGUAGE_RELOAD = "CUPID_LANGUAGE_RELOAD";
	//public static final String CUPID_CODEDB_LOCATION = "CUPID_CODEDB_LOCATION";
	//public static final String CUPID_REFDOC_USEINTERNAL = "CUPID_REFDOC_USEINTERNAL";
	public static final String CUPID_REFDOC_URL = "CUPID_REFDOC_URL";
	public static final String CUPID_CHECK_FILES_ON_OPEN = "CUPID_CHECK_FILES_ON_OPEN";
	


	public CupidPreferencePage() {
		super(GRID);
		setPreferenceStore(CupidActivator.getDefault().getPreferenceStore());
		//setDescription("Cupid preferences");
	}
	
	public void createFieldEditors() {	
		//addField(new StringFieldEditor(CUPID_CODEDB_LOCATION, "Location of internal code database", getFieldEditorParent()));
		//addField(new StringFieldEditor(CUPID_LANGUAGE_URI, "Language definition URI", getFieldEditorParent()));
		//addField(new BooleanFieldEditor(CUPID_LANGUAGE_RELOAD, "Reload language every time (debugging)", getFieldEditorParent()));	

		//addField(new PasswordStringFieldEditor(CUPID_AWS_ACCESS_KEY, "Amazon AWS Access Key:", getFieldEditorParent()));
		//addField(new PasswordStringFieldEditor(CUPID_AWS_SECRET_KEY, "Amazon AWS Secret Key:", getFieldEditorParent()));
	
		//addField(new BooleanFieldEditor(CUPID_REFDOC_USEINTERNAL, "Use internal reference docs", getFieldEditorParent()));
		addField(new StringFieldEditor(CUPID_REFDOC_URL, "Base URL of reference documentation", getFieldEditorParent()));
	
		addField(new BooleanFieldEditor(CUPID_CHECK_FILES_ON_OPEN , "Check files when opened to see if they contain NUOPC code and prompt user to open outline?", getFieldEditorParent()));
		
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