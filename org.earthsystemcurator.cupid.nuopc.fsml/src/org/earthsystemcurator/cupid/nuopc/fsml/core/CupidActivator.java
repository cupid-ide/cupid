package org.earthsystemcurator.cupid.nuopc.fsml.core;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
		
		//add default NUOPC metamodel to registry
		URI ecoreURI = URI.createURI("platform:/plugin/org.earthsystemcurator.cupid.nuopc.fsml/cupidmodel/nuopc.ecore");
		ResourceSet rs = new ResourceSetImpl();
		Resource ecoreResource = rs.getResource(ecoreURI, true);
		EPackage ecorePackage = (EPackage) ecoreResource.getContents().get(0);
		EPackage.Registry.INSTANCE.put("http://www.earthsystemcurator.org/nuopcgen", ecorePackage); 		
		
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
