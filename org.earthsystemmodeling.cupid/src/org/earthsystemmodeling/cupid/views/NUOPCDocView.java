package org.earthsystemmodeling.cupid.views;

import java.net.URL;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.preferences.CupidPreferencePage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
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
	 *  Location on file system of stylesheet.
	 */
	private static String stylePath = null;
	
	
	/**
	 * The constructor.
	 */
	public NUOPCDocView() {
		
	}
	
	public static String getStylesheetPath() {
		if (stylePath == null) {
			URL styleURL = CupidActivator.getFileURL("nuopcdocs/styles.css");
			CupidActivator.debug("Stylesheet URL: " + styleURL);
			stylePath = "";
			if (styleURL != null) {
				stylePath = styleURL.toExternalForm();
			}
		}
		return stylePath;
	}
	
	
	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		
		try {
			browser = new Browser(parent, SWT.NONE);
			//TODO: the code below was supposed to prevent right-clicking the
			//browser and clicking reload, but it doesn't
			/*
			browser.addListener(SWT.MouseDown, new Listener() {
				@Override
				public void handleEvent(Event event) {
					if (event.button==3) {
						event.doit = false;
					}				
				}				
			});
			*/
		}
		catch (SWTError se) {
			CupidActivator.log("Error creating NUOPC Doc viewer.  Trying alternative method.", se);
			browser = null;
			label = new Label(parent, SWT.NONE);
			MessageDialog.openWarning(Display.getDefault().getActiveShell(), 
					"Recommend installing libwebgtk", 
					"The NUOPC Doc viewer relies on an IDE-based browser.  Please install the prerequisite software libwebkitgtk-1.0-0.  The software is in most Linux package manager, e.g., on Ubuntu use:\n\n$ sudo apt-get install libwebkitgtk-1.0-0\n\nPlease restart Eclipse after the installation.");
		}
		//setDoc("Select an element in the NUOPC View to see relevant documentation.");	
		//initialize
		String initURL = CupidActivator.getDefault().getPreferenceStore().getString(CupidPreferencePage.CUPID_REFDOC_URL);
		setURL(initURL);
		
	}
	
	public void setDoc(String text) {
		if (browser != null) {
//			String docText = "<html><head><link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\" /></head><body bgcolor=\"#FFFFE0\" style=\"margin-top:2pt;overflow:auto;font-size:13px;font-family:Helvetica;\">" + text + "</body></html>";
			String docText = "<html><head><link rel=\"stylesheet\" type=\"text/css\" href=\"" + getStylesheetPath() + "\" /></head><body>" + text + "</body></html>";
			browser.setText(docText);
		}
		else {
			label.setText(text);
		}
	}
	
	
	public void setURL(String url) {
		if (browser != null) {
			browser.setUrl(url);
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