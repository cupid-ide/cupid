package org.earthsystemmodeling.cupid.trace;

import java.nio.ByteBuffer;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.event.TmfEvent;
import org.eclipse.tracecompass.tmf.core.event.TmfEventField;
import org.eclipse.tracecompass.tmf.core.event.TmfEventType;
import org.eclipse.tracecompass.tmf.core.timestamp.TmfTimestamp;
import org.eclipse.tracecompass.tmf.core.trace.ITmfContext;
import org.eclipse.tracecompass.tmf.core.trace.TmfContext;
import org.eclipse.tracecompass.tmf.core.trace.TmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TraceValidationStatus;
import org.eclipse.tracecompass.tmf.core.trace.location.ITmfLocation;
import org.eclipse.tracecompass.tmf.core.trace.location.TmfLocation;
import org.eclipse.tracecompass.tmf.core.trace.location.TmfLongLocation;

public class NUOPCTrace extends TmfTrace {

	private TmfLongLocation fCurLoc;
	
	@Override
	public IStatus validate(IProject project, String path) {
		return new TraceValidationStatus(100, Activator.PLUGIN_ID);
	}

	@Override
	public ITmfLocation getCurrentLocation() {
		return fCurLoc;
	}

	@Override
	public double getLocationRatio(ITmfLocation location) {
		TmfLongLocation loc = (TmfLongLocation) location;
		return loc.getLocationInfo() / 3;
	}

	@Override
	public ITmfContext seekEvent(ITmfLocation location) {
		if (location != null) {
			fCurLoc = (TmfLongLocation) location;
		}
		else {
			fCurLoc = new TmfLongLocation(0);
		}
		return new TmfContext(fCurLoc, fCurLoc.getLocationInfo());
	}

	@Override
	public ITmfContext seekEvent(double ratio) {
		return seekEvent(new TmfLongLocation((long) (ratio*3)));
	}

	@Override
	public ITmfEvent parseEvent(ITmfContext context) {
		//TmfLongLocation loc = (TmfLongLocation) context.getLocation();
		if (context.getRank() <= 150) {
			TmfTimestamp ts = new TmfTimestamp(context.getRank(), 1);
			TmfEventType et = new TmfEventType("MY_EVENT", null);
			TmfEventField ef = new TmfEventField("Field1", context.getRank(), null);
			return new TmfEvent(this, 1, ts, et, ef);
		}
		else {
			return null;
		}
	}

	/*
	public NUOPCTrace() {
		super(getTraceDefinition());
	}
	
	private static CustomTxtTraceDefinition getTraceDefinition() {
		//org.earthsystemmodeling.cupid.trace/src/org/earthsystemmodeling/cupid/trace
		URL defnURL = Activator.getFileURL("src/org/earthsystemmodeling/cupid/trace/esmf_trace_defn.xml");
		CustomTxtTraceDefinition defn = CustomTxtTraceDefinition.loadAll(defnURL.getPath())[0];
		return defn;
	}	
	*/
	
	
	

}
