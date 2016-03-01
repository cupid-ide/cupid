package org.earthsystemmodeling.cupid.trace;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.tracecompass.tmf.core.event.TmfEventType;

public class NUOPCEventType extends TmfEventType {

	private ArrayList<String> fieldNames = new ArrayList<String>();
	
	public NUOPCEventType() {
		fieldNames = new ArrayList<String>();
		fieldNames.add("type"); 
		fieldNames.add("pet");
		fieldNames.add("data");
	}
	
	@Override
	public String getName() {
		return "NUOPCEventType";
	}
	
	@Override
	public Collection<String> getFieldNames() {
		return fieldNames;
	}
	
	
	
	
}
