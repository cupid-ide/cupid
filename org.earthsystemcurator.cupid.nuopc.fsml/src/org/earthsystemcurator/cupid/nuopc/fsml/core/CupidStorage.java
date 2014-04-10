package org.earthsystemcurator.cupid.nuopc.fsml.core;

import java.util.HashMap;
import java.util.Map;

import org.earthsystemcurator.FSM;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.ui.IMarkerResolution;

public class CupidStorage {

	public static final CupidStorage INSTANCE = new CupidStorage();
	
	protected Map<IProject, Map<IMarker, IMarkerResolution>> markerFixes = new HashMap<IProject, Map<IMarker, IMarkerResolution>>();
	protected Map<IProject, FSM<?>> fsms = new HashMap<IProject, FSM<?>>();
	
	
	public Map<IMarker, IMarkerResolution> getMarkerFixes(IProject project) {
		if (!markerFixes.containsKey(project)) {
			markerFixes.put(project, new HashMap<IMarker, IMarkerResolution>());
		}
		return markerFixes.get(project);
	}
	
	public void setFSM(IProject project, FSM<?> fsm) {
		fsms.put(project, fsm);
	}
	
	public FSM<?> getFSM(IProject project) {
		return fsms.get(project);
	}
}
