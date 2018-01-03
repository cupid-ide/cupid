package org.earthsystemmodeling.cupid.trace.state;

import java.util.Optional;

import org.earthsystemmodeling.cupid.trace.ESMFId;
import org.earthsystemmodeling.cupid.trace.ESMFPhaseId;
import org.earthsystemmodeling.cupid.trace.ESMFRegionId;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystem;
import org.eclipse.tracecompass.statesystem.core.exceptions.AttributeNotFoundException;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateSystemDisposedException;
import org.eclipse.tracecompass.statesystem.core.interval.ITmfStateInterval;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.tmf.core.statesystem.ITmfStateProvider;
import org.eclipse.tracecompass.tmf.core.statesystem.TmfStateSystemAnalysisModule;
import org.eclipse.tracecompass.tmf.ctf.core.trace.CtfTmfTrace;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

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
	
	@Override
	public IStatus schedule() {		
		return super.schedule();
	}
	
		
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
		
	public String queryRegionName(ESMFRegionId id) {
		//CacheStats stats = cacheRegionName.stats();
		return cacheRegionName.getUnchecked(id).orElse(null);
	}
	
	private final LoadingCache<ESMFRegionId, Optional<String>> cacheRegionName = CacheBuilder.newBuilder()
			.maximumSize(10000)
			//.recordStats()
			.build(new CacheLoader<ESMFRegionId, Optional<String>>() {
				@Override
				public Optional<String> load(ESMFRegionId id) {
					ITmfStateSystem ss = getStateSystem();
					if (!ss.waitUntilBuilt(TIMEOUT)) {
						/* ignore */
					}
					long endts = ss.getCurrentEndTime();
					try {
						int quark = ss.getQuarkAbsolute("regions", 
								String.valueOf(id.pet), String.valueOf(id.regionid));
						ITmfStateInterval interval = ss.querySingleState(endts, quark);
						ITmfStateValue value = interval.getStateValue();
						//List<ITmfStateInterval> state = ss.queryFullState(endts);
						//ITmfStateValue value = state.get(quark).getStateValue();
				        return Optional.ofNullable(value.unboxStr());
					} catch (AttributeNotFoundException e) {
						return Optional.empty();
					} catch (StateSystemDisposedException e) {
						return Optional.empty();
					}
				}
			});
	
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
						ITmfStateInterval interval = ss.querySingleState(endts, quark);
						ITmfStateValue value = interval.getStateValue();
						//List<ITmfStateInterval> state = ss.queryFullState(endts);
						//ITmfStateValue value = state.get(quark).getStateValue();
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
						ITmfStateInterval interval = ss.querySingleState(endts, quark);
						ITmfStateValue value = interval.getStateValue();
						//List<ITmfStateInterval> state = ss.queryFullState(endts);
						//ITmfStateValue value = state.get(quark).getStateValue();
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
						ITmfStateInterval interval = ss.querySingleState(endts, quark);
						ITmfStateValue value = interval.getStateValue();
						//List<ITmfStateInterval> state = ss.queryFullState(endts);
						//ITmfStateValue value = state.get(quark).getStateValue();
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
	
	
	
}
