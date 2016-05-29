package org.earthsystemmodeling.cupid.template;

import org.eclipse.core.runtime.IRegistryChangeEvent;
import org.eclipse.core.runtime.IRegistryChangeListener;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.earthsystemmodeling.cupid.template"; //$NON-NLS-1$

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
		
		/*
		Platform.getExtensionRegistry().addRegistryChangeListener(new IRegistryChangeListener() {

			@Override
			public void registryChanged(IRegistryChangeEvent event) {
				// TODO Auto-generated method stub
				
			});
		
		}
		*/
		
	//	IConfigurationElement[] configs = 
	//			Platform.getExtensionRegistry().getExtensionPoint(FortranEditor.SOURCE_VIEWER_CONFIG_EXTENSION_POINT_ID)
	//			.getConfigurationElements();
				
				
	      //      getConfigurationElementsFor(FortranEditor.SOURCE_VIEWER_CONFIG_EXTENSION_POINT_ID);
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

}
