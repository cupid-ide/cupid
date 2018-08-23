package org.earthsystemmodeling.cupid.trace;

import java.util.Collection;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.tracecompass.tmf.core.event.aspect.ITmfEventAspect;
import org.eclipse.tracecompass.tmf.core.event.aspect.TmfBaseAspects;
import org.eclipse.tracecompass.tmf.ctf.core.trace.CtfTmfTrace;

import com.google.common.collect.ImmutableList;

public class NUOPCCtfTrace extends CtfTmfTrace {

	//some global constants
	public static final int ANALYSES_VERSION = 5;  //should be bumped each release
	
	private double traceVersion = -1.0;
	
	protected static final @NonNull Collection<@NonNull ITmfEventAspect<?>> NUOPC_CTF_ASPECTS = ImmutableList.of(
            TmfBaseAspects.getTimestampAspect(),
            new PETAspect(),
            TmfBaseAspects.getEventTypeAspect(),
            TmfBaseAspects.getContentsAspect());
	
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
	
	@Override
	public Iterable<ITmfEventAspect<?>> getEventAspects() {
		return NUOPC_CTF_ASPECTS;
	}
	
}
