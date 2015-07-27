package org.earthsystemmodeling.cupid.core;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;


public class CupidActivator extends AbstractUIPlugin {

	private static CupidActivator instance;
	private static String PLUGIN_ID;
	
	public CupidActivator() {
		
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);		
		instance = this;
		
		instance.setDebugging(true);  //comment out before release
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
		try {
			return FileLocator.toFileURL(url);
		} catch (IOException e) {
			return null;
		}
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


}
