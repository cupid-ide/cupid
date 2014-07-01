package org.earthsystemmodeling.cupid.handlers;

import org.earthsystemmodeling.FSM;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IMarkerResolution;
import org.eclipse.ui.IMarkerResolutionGenerator;

public class CupidMarkerResolutionGenerator implements IMarkerResolutionGenerator {

	protected FSM fsm;
	
	public CupidMarkerResolutionGenerator(FSM fsm) {
		this.fsm = fsm;
	}
	
	@Override
	public IMarkerResolution[] getResolutions(IMarker marker) {
		
		try {
			System.out.println("Marker type: " + marker.getType());
		} catch (CoreException e) {			
			e.printStackTrace();
		}
		
		return new IMarkerResolution[] {new SomeResolution(), new SomeResolution()};
		
		
	}
	
	public class SomeResolution implements IMarkerResolution {

		@Override
		public String getLabel() {
			return "Some Resolution";
		}

		@Override
		public void run(IMarker marker) {
			// TODO Auto-generated method stub
			System.out.println("Running for marker: " + marker.getAttribute(IMarker.MESSAGE, "default"));
		}
		
	}

}
