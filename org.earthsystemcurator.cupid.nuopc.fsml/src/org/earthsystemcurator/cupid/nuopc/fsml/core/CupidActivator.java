package org.earthsystemcurator.cupid.nuopc.fsml.core;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


public class CupidActivator extends AbstractUIPlugin {

	private static CupidActivator instance;
	private static String PLUGIN_ID;
	
	public CupidActivator() {
		
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);		
		instance = this;
	}
	
	public static CupidActivator getDefault() {
		return instance;
	}
	
	public static void log(String msg) {
		log(msg, null);
	}
	
	public static void log(String msg, Exception e) {
		if (getDefault()==null) return;
		
		if (PLUGIN_ID == null) {
			PLUGIN_ID = getDefault().getBundle().getSymbolicName();
		}		
		getDefault().getLog().log(new Status(Status.INFO, PLUGIN_ID, Status.OK, msg, e));
	}
}
