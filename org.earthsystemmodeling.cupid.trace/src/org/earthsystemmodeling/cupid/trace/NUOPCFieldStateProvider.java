package org.earthsystemmodeling.cupid.trace;

import org.eclipse.tracecompass.statesystem.core.ITmfStateSystemBuilder;
import org.eclipse.tracecompass.statesystem.core.exceptions.AttributeNotFoundException;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateValueTypeException;
import org.eclipse.tracecompass.statesystem.core.exceptions.TimeRangeException;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.statesystem.core.statevalue.TmfStateValue;
import org.eclipse.tracecompass.tmf.core.event.ITmfEvent;
import org.eclipse.tracecompass.tmf.core.statesystem.AbstractTmfStateProvider;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;


public class NUOPCFieldStateProvider extends AbstractTmfStateProvider {

    /** State value representing the idle state */
    public static ITmfStateValue IDLE = TmfStateValue.newValueInt(0);

    /** State value representing the running state */
    public static ITmfStateValue RUNNING = TmfStateValue.newValueInt(1);

    public NUOPCFieldStateProvider(NUOPCTrace trace) {
        super(trace, "Example"); 
    }

    @Override
    public int getVersion() {
        /*
         * If the version of an existing file doesn't match the version supplied
         * in the provider, a rebuild of the history will be forced.
         */
        return 1;
    }

    @Override
    public NUOPCFieldStateProvider getNewInstance() {
        return new NUOPCFieldStateProvider((NUOPCTrace) getTrace());
    }

    @Override
    protected void eventHandle(ITmfEvent event) {
    
    	final long ts = event.getTimestamp().getValue();
        /*
        try {

        	
            if (event.getType().getName().equals("metadata_field")) {
                ITmfStateSystemBuilder ss = getStateSystemBuilder();
                int quark = ss.getQuarkAbsoluteAndAdd("CPUs", String.valueOf(event.getCPU()), "Status");
                ITmfStateValue value;
                if (nextTid > 0) {
                    value = RUNNING;
                } else {
                    value = IDLE;
                }
                ss.modifyAttribute(ts, value, quark);
            }

        } catch (TimeRangeException e) {
            throw new IllegalStateException(e);
        } catch (AttributeNotFoundException e) {
            throw new IllegalStateException(e);
        } catch (StateValueTypeException e) {
            e.printStackTrace();
        }
		*/
    	
    }

}