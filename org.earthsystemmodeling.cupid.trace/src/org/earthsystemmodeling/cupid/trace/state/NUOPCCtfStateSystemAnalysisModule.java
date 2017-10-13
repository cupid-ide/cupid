package org.earthsystemmodeling.cupid.trace.state;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.earthsystemmodeling.cupid.trace.ESMFId;
import org.earthsystemmodeling.cupid.trace.ESMFPhaseId;
import org.earthsystemmodeling.cupid.trace.callstack.NUOPCCallStackView;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystem;
import org.eclipse.tracecompass.statesystem.core.exceptions.AttributeNotFoundException;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateSystemDisposedException;
import org.eclipse.tracecompass.statesystem.core.exceptions.TimeRangeException;
import org.eclipse.tracecompass.statesystem.core.interval.ITmfStateInterval;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.tmf.core.analysis.IAnalysisOutput;
import org.eclipse.tracecompass.tmf.core.statesystem.ITmfStateProvider;
import org.eclipse.tracecompass.tmf.core.statesystem.TmfStateSystemAnalysisModule;
import org.eclipse.tracecompass.tmf.ctf.core.trace.CtfTmfTrace;
import org.eclipse.tracecompass.tmf.ui.analysis.TmfAnalysisViewOutput;
import org.eclipse.tracecompass.tmf.ui.views.callstack.CallStackEntry;
import org.eclipse.tracecompass.tmf.ui.views.callstack.CallStackEvent;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheStats;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;

public class NUOPCCtfStateSystemAnalysisModule extends TmfStateSystemAnalysisModule {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCCtfStateSystemAnalysisModule";
	
	@Override
	protected ITmfStateProvider createStateProvider() {
		return new NUOPCCtfStateProvider((CtfTmfTrace) getTrace());
	}
	
	@Override
	protected StateSystemBackendType getBackendType() {
		return StateSystemBackendType.FULL;
	}
	
	@Override
	public String getName() {
		return "CTF NUOPC State System Analysis";
	}
		
	private static final long TIMEOUT = 20*1000;
	
		
	public String queryComponentName(long vmid, long baseid) {
		//CacheStats stats = cacheComponentName.stats();	
		return queryComponentName(new ESMFId(vmid, baseid));	
	}
	
	public String queryComponentName(ESMFId id) {
		return cacheComponentName.getUnchecked(id).orElse(null);
	}
	
	public String queryComponentKind(long vmid, long baseid) {
		return cacheComponentKind.getUnchecked(new ESMFId(vmid, baseid)).orElse(null);
	}
	
	public String queryComponentPhaseLabel(long vmid, long baseid, long method, long phase) {
		//CacheStats stats = cacheComponentPhaseLabel.stats();
		return queryComponentPhaseLabel(new ESMFPhaseId(vmid, baseid, method, phase));
	}
	
	public String queryComponentPhaseLabel(ESMFPhaseId id) {
		return cacheComponentPhaseLabel.getUnchecked(id).orElse(null);		
	}
		
	private final LoadingCache<ESMFId, Optional<String>> cacheComponentName = CacheBuilder.newBuilder()
			.maximumSize(1000)
			//.recordStats()
			.build(new CacheLoader<ESMFId, Optional<String>>() {
				@Override
				public Optional<String> load(ESMFId id) {
					ITmfStateSystem ss = getStateSystem();
					if (!ss.waitUntilBuilt(TIMEOUT)) {
						/* ignore */
					}
					long endts = ss.getCurrentEndTime();
					String idStr = id.vmid + "-" + id.baseid;
					try {
						int quark = ss.getQuarkAbsolute("component", idStr, "name");
						List<ITmfStateInterval> state = ss.queryFullState(endts);
						ITmfStateValue value = state.get(quark).getStateValue();
				        return Optional.ofNullable(value.unboxStr());
					} catch (AttributeNotFoundException e) {
						return Optional.empty();
					} catch (StateSystemDisposedException e) {
						return Optional.empty();
					}
				}
			});
	
	
	private final LoadingCache<ESMFId, Optional<String>> cacheComponentKind = CacheBuilder.newBuilder()
			.maximumSize(1000)
			//.recordStats()
			.build(new CacheLoader<ESMFId, Optional<String>>() {
				@Override
				public Optional<String> load(ESMFId id) {
					ITmfStateSystem ss = getStateSystem();
					if (!ss.waitUntilBuilt(TIMEOUT)) {
						/* ignore */
					}
					long endts = ss.getCurrentEndTime();
					String idStr = id.vmid + "-" + id.baseid;
					try {
						int quark = ss.getQuarkAbsolute("component", idStr, "kind");
						List<ITmfStateInterval> state = ss.queryFullState(endts);
						ITmfStateValue value = state.get(quark).getStateValue();
				        return Optional.ofNullable(value.unboxStr());
					} catch (AttributeNotFoundException e) {
						return Optional.empty();
					} catch (StateSystemDisposedException e) {
						return Optional.empty();
					}
				}
			});
	
	
	private final LoadingCache<ESMFPhaseId, Optional<String>> cacheComponentPhaseLabel = CacheBuilder.newBuilder()
			.maximumSize(1000)
			//.recordStats()
			.build(new CacheLoader<ESMFPhaseId, Optional<String>>() {
				@Override
				public Optional<String> load(ESMFPhaseId id) {
					ITmfStateSystem ss = getStateSystem();
					if (!ss.waitUntilBuilt(TIMEOUT)) {
						/* ignore */
					}
					long endts = ss.getCurrentEndTime();
					String idStr = id.vmid + "-" + id.baseid;
					
					String map = null;
					if (id.method == 0) map = "IPM";
					else if (id.method == 1) map = "RPM";
					else if (id.method == 2) map = "FPM";
					else return Optional.empty();
										
					try {
						int quark = ss.getQuarkAbsolute("component", idStr, map, String.valueOf(id.phase));
						List<ITmfStateInterval> state = ss.queryFullState(endts);
						ITmfStateValue value = state.get(quark).getStateValue();
				        return Optional.ofNullable(value.unboxStr());
					} catch (AttributeNotFoundException e) {
						String method = "";
						if (id.method == 0) method = "Init";
						else if (id.method == 1) method = "Run";
						else if (id.method == 2) method = "Final";
						return Optional.of(method + " #" + id.phase);
					} catch (StateSystemDisposedException e) {
						return Optional.empty();
					}
				}
			});
	
	
	/*
	public String queryComponentName(long vmid, long baseid) {	
		
		ITmfStateSystem ss = getStateSystem();
		if (!ss.waitUntilBuilt(TIMEOUT)) {
			//System.out.println("not built");
		}
		
		long endts = ss.getCurrentEndTime();
		String id = vmid + "-" + baseid;
		try {
			int quark = ss.getQuarkAbsolute("component", id, "name");
			List<ITmfStateInterval> state = ss.queryFullState(endts);
			ITmfStateValue value = state.get(quark).getStateValue();
	        return value.unboxStr();
		} catch (AttributeNotFoundException e) {
			return null;
		} catch (StateSystemDisposedException e) {
			return null;
		}
	}
	*/
	
	
	/*
	public String queryComponentKind(long vmid, long baseid) {	
		
		ITmfStateSystem ss = getStateSystem();
		if (!ss.waitUntilBuilt(TIMEOUT)) {
			// ignore 
		}
		
		long endts = ss.getCurrentEndTime();
		String id = vmid + "-" + baseid;
		try {
			int quark = ss.getQuarkAbsolute("component", id, "kind");
			List<ITmfStateInterval> state = ss.queryFullState(endts);
			ITmfStateValue value = state.get(quark).getStateValue();
	        return value.unboxStr();
		} catch (AttributeNotFoundException e) {
			return null;
		} catch (StateSystemDisposedException e) {
			return null;
		}
	}
	*/
	
	/*
	public String queryComponentPhaseLabel(long vmid, long baseid, long method, long phase) {	
		
		ITmfStateSystem ss = getStateSystem();
		if (!ss.waitUntilBuilt(TIMEOUT)) {
			//System.out.println("not built");
		}
		
		long endts = ss.getCurrentEndTime();		
		
		String id = vmid + "-" + baseid;
		String map = null;
		
		if (method == 0) map = "IPM";
		else if (method == 1) map = "RPM";
		else if (method == 2) map = "FPM";
		else return null;
		
		try {
			int quark = ss.getQuarkAbsolute("component", id, map, String.valueOf(phase));
			List<ITmfStateInterval> state = ss.queryFullState(endts);
			ITmfStateValue value = state.get(quark).getStateValue();
	        return value.unboxStr();
		} catch (AttributeNotFoundException e) {
			return null;
		} catch (StateSystemDisposedException e) {
			return null;
		}
	}
	*/
	
	/*
	public String queryActiveComponent(long ts, int pet, int stackLevel) {	
		
		ITmfStateSystem ss = getStateSystem();
		if (!ss.waitUntilBuilt(TIMEOUT)) {
			
		}
				
		try {
			int quark = ss.getQuarkAbsolute("active", "component", 
					String.valueOf(pet), String.valueOf(stackLevel));
			ITmfStateInterval val = ss.querySingleState(ts, quark);
			return val.getStateValue().unboxStr();			
		} catch (AttributeNotFoundException e) {
			return null;
		} catch (StateSystemDisposedException e) {
			return null;
		}
	}
	*/
	
	@Override
    public Iterable<IAnalysisOutput> getOutputs() {
		return ImmutableList.of(new TmfAnalysisViewOutput(NUOPCMemUsageView.ID));  		
    }
}
