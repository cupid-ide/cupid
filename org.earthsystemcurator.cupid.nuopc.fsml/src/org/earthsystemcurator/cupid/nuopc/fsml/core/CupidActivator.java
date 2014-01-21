package org.earthsystemcurator.cupid.nuopc.fsml.core;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


public class CupidActivator extends AbstractUIPlugin {

	private static CupidActivator instance;
	
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
}
