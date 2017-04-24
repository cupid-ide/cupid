package org.earthsystemmodeling.cupid.trace;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.earthsystemmodeling.cupid.trace"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	public static URL getFileURL(String relative) {
		URL url = FileLocator.find(getDefault().getBundle(), new Path(relative), null);
		try {
			return FileLocator.toFileURL(url);
		} catch (IOException e) {
			return null;
		}
	}
	
	public static ImageDescriptor getImageDescriptor(String file) {  
		URL url = FileLocator.find(getDefault().getBundle(), new Path(file), null);
	    ImageDescriptor image = ImageDescriptor.createFromURL(url);
	    return image;
	}
	
	public static void log(int severity, String msg, Throwable e) {
		if (getDefault()==null) return;
		getDefault().getLog().log(new Status(severity, PLUGIN_ID, Status.OK, msg, e));
	}
	
	public static void logInfo(String msg, Throwable e) {
		log(Status.INFO, msg, e);
	}
	
	public static void logInfo(String msg) {
		log(Status.INFO, msg, null);
	}
	
	public static void logWarning(String msg, Throwable e) {
		log(Status.WARNING, msg, e);
	}
	
	public static void logWarning(String msg) {
		log(Status.WARNING, msg, null);
	}

}
