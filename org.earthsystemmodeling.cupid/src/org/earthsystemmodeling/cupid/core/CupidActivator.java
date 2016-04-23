package org.earthsystemmodeling.cupid.core;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import org.earthsystemmodeling.cupid.preferences.CupidPreferencePage;
import org.earthsystemmodeling.cupid.views.NUOPCView;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.photran.internal.ui.editor.FortranEditor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IPartService;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


@SuppressWarnings("restriction")
public class CupidActivator extends AbstractUIPlugin {

	private static CupidActivator instance;
	public static String PLUGIN_ID;
	
	private IPartListener2 editorListener;
	
	public CupidActivator() {
		
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);		
		instance = this;
		
		instance.setDebugging(true);  //comment out before release
		
		addEditorListener();
			
	}	
	
	public static CupidActivator getDefault() {
		return instance;
	}
	
	public static void debug(String msg, Throwable e) {
		if (getDefault().isDebugging()) {
			log(Status.INFO, msg, e);
		}
	}
	
	public static void debug(String msg) {
		if (getDefault().isDebugging()) {
			log(Status.INFO, msg);
		}
	}
	
	public static void log(String msg) {
		log(msg, null);
	}
	
	public static void log(String msg, Throwable e) {
		log(Status.INFO, msg, e);
	}
	
	public static void log(int severity, String msg) {
		log(severity, msg, null);
	}
	
	public static void log(int severity, String msg, Throwable e) {
		if (getDefault()==null) return;
		
		if (PLUGIN_ID == null) {
			PLUGIN_ID = getDefault().getBundle().getSymbolicName();
		}		
		getDefault().getLog().log(new Status(severity, PLUGIN_ID, Status.OK, msg, e));
	}
	
	
	public static ImageDescriptor getImageDescriptor(String file) {  
		URL url = FileLocator.find(getDefault().getBundle(), new Path(file), null);
	    ImageDescriptor image = ImageDescriptor.createFromURL(url);
	    return image;
	}
	
	public static URL getFileURL(String relative) {
		URL url = FileLocator.find(getDefault().getBundle(), new Path(relative), null);
		if (url != null) {
			try {
				return FileLocator.toFileURL(url);
			} catch (IOException e) {
				return null;
			}
		}
		return null;
	}
	
	public static InputStream getInputStream(String path) {
		try {
			return FileLocator.openStream(
				   getDefault().getBundle(), new Path(path), false);
		} catch (IOException e) {
			log("Error opening input stream: " + path, e);
		}
		return null;
	}
	
	private void addEditorListener() {
		
		editorListener = new IPartListener2() {

        	//private IEditorPart previousEditor = null;
        	
        	@Override
			public void partActivated(IWorkbenchPartReference partRef) {
				
        		IPreferenceStore store = CupidActivator.getDefault().getPreferenceStore();
        		boolean doCheck = store.getBoolean(CupidPreferencePage.CUPID_CHECK_FILES_ON_OPEN);
        		if (!doCheck) return;
        		
        		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
        		IViewPart view = page.findView(NUOPCView.ID);
        		if (view != null) return;
        		
        		if (partRef instanceof IEditorReference) {
					IEditorReference eref = (IEditorReference) partRef;
					IEditorPart editor = eref.getEditor(false);
					if (editor != null && editor instanceof FortranEditor) {
						
						//simple check to see if NUOPC code is present
						IEditorInput editorInput = editor.getEditorInput();
						if (editorInput instanceof FileEditorInput) {
							IFile fileInput = ((FileEditorInput) editorInput).getFile();
							try {
								InputStream fileIS = fileInput.getContents();
								BufferedReader in = new BufferedReader(new InputStreamReader(fileIS));
								String line = null;
								while((line = in.readLine()) != null) {
								    if (line.contains("NUOPC_Model") || line.contains("NUOPC_Driver") || line.contains("NUOPC_Mediator")) {								    	
								    	boolean open = 
								    			MessageDialog.openQuestion(null, 
								    							"Open NUOPC Outline?", 
								    							"The file you are opening appears to contain NUOPC code.  Would you like to open the NUOPC Outline view?\n\nThis option can be turned off in the Cupid preferences (select Window -> Preferences from the menu).");
							
								    	if (open) { 
								    		page.showView(NUOPCView.ID);
								    	}
								    	fileIS.close();
								    	return;
								    }
								}
								fileIS.close();
							} catch (CoreException | IOException e) {
								CupidActivator.debug("Error reading file to check for NUOPC code", e);
								return;
							}
						}
						
						
						
					}				
				}
			}

			@Override
			public void partBroughtToTop(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partClosed(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partDeactivated(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partOpened(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partHidden(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partVisible(IWorkbenchPartReference partRef) {
			}

			@Override
			public void partInputChanged(IWorkbenchPartReference partRef) {
			}
        	
        };
        
        IPartService service = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getPartService();
        service.addPartListener(editorListener);
		
		
	}


}
