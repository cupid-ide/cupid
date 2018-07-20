package org.earthsystemmodeling.cupid.trace.callstack.ui;

import java.util.Comparator;

import org.earthsystemmodeling.cupid.trace.statistics.ICalledFunction;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.tracecompass.common.core.NonNullUtils;
import org.eclipse.tracecompass.segmentstore.core.ISegment;
import org.eclipse.tracecompass.tmf.core.segment.ISegmentAspect;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceManager;

/**
 * An aspect used to get the function name of a call stack event or to compare
 * the duration of two events
 *
 * @author Sonia Farrah
 */
public final class SymbolAspect implements ISegmentAspect {
    /**
     * A symbol aspect
     */
    public static final ISegmentAspect SYMBOL_ASPECT = new SymbolAspect();

    /**
     * Constructor
     */
    public SymbolAspect() {
    }

    @Override
    public @NonNull String getName() {
        return NonNullUtils.nullToEmptyString(Messages.CallStack_FunctionName);
    }

    @Override
    public @NonNull String getHelpText() {
        return NonNullUtils.nullToEmptyString(Messages.CallStack_FunctionName);
    }

    @Override
    public @Nullable Comparator<?> getComparator() {
        return new Comparator<ISegment>() {
            @Override
            public int compare(@Nullable ISegment o1, @Nullable ISegment o2) {
                if (o1 == null || o2 == null) {
                    throw new IllegalArgumentException();
                }
                return Long.compare(o1.getLength(), o2.getLength());
            }
        };
    }

    @Override
    public @Nullable Object resolve(@NonNull ISegment segment) {
        if (segment instanceof ICalledFunction) {
            ICalledFunction calledFunction = (ICalledFunction) segment;
            // FIXME work around this trace
            ITmfTrace trace = TmfTraceManager.getInstance().getActiveTrace();
            if (trace != null) {
                String symbolText = null;
                Object symbol = calledFunction.getSymbol();
                //TODO after Photon upgrade, need to fix symbol provider for Longs, if needed
                /*
                if (symbol instanceof Long) {
                    Long longAddress = (Long) symbol;
                    Collection<ISymbolProvider> providers = SymbolProviderManager.getInstance().getSymbolProviders(trace);
                    for (ISymbolProvider provider: providers) {
                        //symbolText = provider.getSymbolText(longAddress);
                    	TmfResolvedSymbol resSym = provider.getSymbol(longAddress);
                    	if (resSym != null) {
                            break;
                        }
                    }
                    //if (symbolText == null) {
                    //    return "0x" + Long.toHexString(longAddress); //$NON-NLS-1$
                    //}
                    // take the start time in the query for the symbol name
                    long time = segment.getStart();
                    int pid = calledFunction.getProcessId();
                    if (pid > 0) {
                        for (ISymbolProvider provider: providers) {
                            TmfResolvedSymbol resSym = provider.getSymbol(pid, time, longAddress);
                            return resSym.getSymbolName();
                            //if (text != null) {
                            //    return text;
                            //}
                        }
                    }
                    return symbolText;
                }
                */
                return String.valueOf(symbol);
            }
        }
        return null;
    }
}