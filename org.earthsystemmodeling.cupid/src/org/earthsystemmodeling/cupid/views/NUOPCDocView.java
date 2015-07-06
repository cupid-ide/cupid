package org.earthsystemmodeling.cupid.views;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.part.ViewPart;

public class NUOPCDocView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "org.earthsystemmodeling.cupid.views.NUOPCDocView";

	private Browser browser;
	private Label label;
	
	
	/**
	 * The constructor.
	 */
	public NUOPCDocView() {
	}
	
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		
		try {
			browser = new Browser(parent, SWT.NONE);
		}
		catch (SWTError se) {
			CupidActivator.log(Status.WARNING, 	"Error creating NUOPC viewer.  Trying alternative method.");
			browser = null;
			label = new Label(parent, SWT.NONE);
		}
		setDoc("Select an element in the NUOPC View to see relevant documentation.");			
		
	}
	
	public void setDoc(String text) {
		if (browser != null) {
			String docText = "<html><body bgcolor=\"#FFFFE0\" style=\"margin-top:2pt;overflow:auto;font-size:13px;font-family:Helvetica;\">" + text + "</body></html>";
			browser.setText(docText);
		}
		else {
			label.setText(text);
		}
	}

	
	@Override
	public void setFocus() {
		if (browser != null) {
			browser.setFocus();
		}
		else {
			label.setFocus();
		
		}
	}
}