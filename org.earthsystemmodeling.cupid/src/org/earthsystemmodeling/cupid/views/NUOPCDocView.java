package org.earthsystemmodeling.cupid.views;

import java.net.URL;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
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
	private String stylePath;
	
	
	/**
	 * The constructor.
	 */
	public NUOPCDocView() {
		URL styleURL = CupidActivator.getFileURL("nuopcdocs/styles.css");
		stylePath = "";
		if (styleURL != null) {
			stylePath = styleURL.getPath();
		}
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
			CupidActivator.log(Status.WARNING, 	"Error creating NUOPC Doc viewer.  Trying alternative method.");
			browser = null;
			label = new Label(parent, SWT.NONE);
		}
		setDoc("Select an element in the NUOPC View to see relevant documentation.");			
		
	}
	
	public void setDoc(String text) {
		if (browser != null) {
//			String docText = "<html><head><link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\" /></head><body bgcolor=\"#FFFFE0\" style=\"margin-top:2pt;overflow:auto;font-size:13px;font-family:Helvetica;\">" + text + "</body></html>";
			String docText = "<html><head><link rel=\"stylesheet\" type=\"text/css\" href=\"" + stylePath + "\" /></head><body>" + text + "</body></html>";
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