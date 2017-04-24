package org.earthsystemmodeling.cupid.trace;

import org.eclipse.tracecompass.tmf.ctf.core.trace.CtfTmfTrace;

public class NUOPCCtfTrace extends CtfTmfTrace {

	private double traceVersion = -1.0;
	
	public double getTraceVersion() {
		if (traceVersion > 0.0) {
			return traceVersion;
		}
		else {
			String esmfTraceVersion = getEnvironment().get("esmf_trace_version");
			esmfTraceVersion = esmfTraceVersion.replaceAll("\"", "");
			try {
				traceVersion = Double.valueOf(esmfTraceVersion);
			} catch (NumberFormatException nfe) {
				traceVersion = 0.1;
			}
		}
		return traceVersion;
	}
	
}
