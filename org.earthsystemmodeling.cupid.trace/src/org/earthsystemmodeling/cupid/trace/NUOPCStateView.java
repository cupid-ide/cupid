package org.earthsystemmodeling.cupid.trace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystem;
import org.eclipse.tracecompass.statesystem.core.exceptions.AttributeNotFoundException;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateSystemDisposedException;
import org.eclipse.tracecompass.statesystem.core.interval.ITmfStateInterval;
import org.eclipse.tracecompass.statesystem.core.statevalue.ITmfStateValue;
import org.eclipse.tracecompass.tmf.core.signal.TmfTraceSelectedSignal;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceManager;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.AbstractTmfTreeViewer;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeColumnDataProvider;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeViewerEntry;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.TmfTreeColumnData;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.TmfTreeViewerEntry;
import org.eclipse.tracecompass.tmf.ui.views.TmfView;
import org.eclipse.ui.IActionBars;


public class NUOPCStateView extends TmfView {

	public static final String ID = "org.earthsystemmodeling.cupid.trace.NUOPCStateView";

	private NUOPCStateTreeViewer viewer;
	private ITmfStateSystem stateSystem;
	
	public NUOPCStateView() {
		super(ID);
	}
		 
	@Override
	public void createPartControl(Composite parent) {
		viewer = new NUOPCStateTreeViewer(parent);

       
        ITmfTrace trace = TmfTraceManager.getInstance().getActiveTrace();
        if (trace != null) {
           viewer.traceSelected(new TmfTraceSelectedSignal(this, trace));
        }
	}
	
	@Override
	public void setFocus() {
	}
	
	@Override
    public void dispose() {
        super.dispose();
        if (viewer != null) {
            viewer.dispose();
        }
    }
	
	
	
	public class NUOPCStateTreeViewer extends AbstractTmfTreeViewer {

		private Map<NUOPCFieldEntryType, Boolean> filterMap;
		
		public NUOPCStateTreeViewer(Composite parent) {
			super(parent, true);
			setLabelProvider(new NUOPCFieldTreeLabelProvider());
	        getTreeViewer().setAutoExpandLevel(2);
	        filterMap = new HashMap<>();
	        
	        IActionBars bars = getViewSite().getActionBars();
	        //IToolBarManager toolbarManager = bars.getToolBarManager();
	        	        
	        IMenuManager menuManager = bars.getMenuManager();
	        menuManager.add(new FilterAction(NUOPCFieldEntryType.COMPONENT_ATTRIBUTE_ROOT, "Component Attributes"));
	        menuManager.add(new FilterAction(NUOPCFieldEntryType.STATE, "State"));
	        menuManager.add(new FilterAction(NUOPCFieldEntryType.STATE_ATTRIBUTE_ROOT, "State Attributes"));
	        menuManager.add(new FilterAction(NUOPCFieldEntryType.FIELD, "Field"));
	        menuManager.add(new FilterAction(NUOPCFieldEntryType.FIELD_ATTRIBUTE_ROOT, "Field Attributes"));
	        menuManager.add(new FilterAction(NUOPCFieldEntryType.FIELD_STATISTIC_ROOT, "Field Statistics"));
	        	        
		}
		
		private class FilterAction extends Action {
			//private String label;
			private NUOPCFieldEntryType type;
			
			public FilterAction(NUOPCFieldEntryType type, String label) {
				this.type = type;
				setText("Include " + label);
				setChecked(true);
			}
			@Override
			public int getStyle() {
				return Action.AS_CHECK_BOX;
			}
			@Override
			public void run() {
				filterMap.put(type, isChecked());
				getTreeViewer().setInput(null);				
			}
		}
		

		@Override
		protected ITmfTreeColumnDataProvider getColumnDataProvider() {
			 return new ITmfTreeColumnDataProvider() {

		            @Override
		            public List<TmfTreeColumnData> getColumnData() {
		                List<TmfTreeColumnData> columns = new ArrayList<>();
		                TmfTreeColumnData column = new TmfTreeColumnData("Object");
		                column.setWidth(250);
		                columns.add(column);
		                /*
		                column.setComparator(new ViewerComparator() {
		                    @Override
		                    public int compare(Viewer viewer, Object e1, Object e2) {
		                        TmfTreeViewerEntry n1 = (TmfTreeViewerEntry) e1;
		                        TmfTreeViewerEntry n2 = (TmfTreeViewerEntry) e2;

		                        return n1.getName().compareTo(n2.getName());
		                    }		                 
		                });
		                */
		                columns.add(new TmfTreeColumnData("Value"));
		               // columns.add(new TmfTreeColumnData("Start Time"));
		               // columns.add(new TmfTreeColumnData("Stop Time"));
		               		                
		                return columns;
		            }

		        };
		}
		

		@Override
		protected ITmfTreeViewerEntry updateElements(long start, long end, boolean isSelection) {
			
	        ITmfTrace trace = getTrace();
	        if (trace == null) {
	        	return null;
	        }
	        
	        NUOPCStateSystemAnalysisModule module = (NUOPCStateSystemAnalysisModule) trace.getAnalysisModule(NUOPCStateSystemAnalysisModule.ID);
	        if (module == null) return null;
	        module.schedule();
            if (!module.waitForInitialization()) {
                return null;
            }
	        
            NUOPCFieldEntry rootEntry = (NUOPCFieldEntry) getInput();
            if (rootEntry == null) {
            	rootEntry = new NUOPCFieldEntry();
            }
            
            stateSystem = module.getStateSystem();
            if (stateSystem == null) return null;
	        
            stateSystem.waitUntilBuilt(500);
            if (start < stateSystem.getStartTime() || start > stateSystem.getCurrentEndTime()) return null;
            
            try {
				List<ITmfStateInterval> fullState = stateSystem.queryFullState(start);
				int quarkComponentRoot = stateSystem.optQuarkAbsolute("component");
				if (quarkComponentRoot == ITmfStateSystem.INVALID_ATTRIBUTE) {
					return null;
				}
				addComps(quarkComponentRoot, rootEntry, fullState);
			} catch (StateSystemDisposedException e) {
				e.printStackTrace();
				return null;
			}
	        
			return rootEntry;

		}
		
		
		private void addComps(int quarkRoot, NUOPCFieldEntry parent, List<ITmfStateInterval> fullState) {
			for (int quarkComp : stateSystem.getSubAttributes(quarkRoot, false)) {
            	            	
            	NUOPCFieldEntry compEntry = parent.getOrAddChild(NUOPCFieldEntryType.COMPONENT, quarkComp);
            	int quarkName = stateSystem.optQuarkRelative(quarkComp, "attribute", "CompName$NUOPC$Instance");
            	compEntry.setName(unboxOrNull(fullState, quarkName));
            	
            	//add clock, only current time for now
            	int quarkClock = stateSystem.optQuarkRelative(quarkComp, "clock");
            	if (quarkClock != ITmfStateSystem.INVALID_ATTRIBUTE) {
            		NUOPCFieldEntry clockRoot = compEntry.getOrAddChild(NUOPCFieldEntryType.COMPONENT_CLOCK_ROOT);
            		NUOPCFieldEntry clockCurrTime = clockRoot.getOrAddChild(NUOPCFieldEntryType.GENERAL, quarkClock);
            		clockCurrTime.setName("current");
            		clockCurrTime.setValue(unboxOrNull(fullState, quarkClock));
            	}
            	
            	if (filterMap.getOrDefault(NUOPCFieldEntryType.COMPONENT_ATTRIBUTE_ROOT, true)) {
            		addESMFAttributes(quarkComp, compEntry, NUOPCFieldEntryType.COMPONENT_ATTRIBUTE_ROOT, fullState);
            	}
            	
            	if (filterMap.getOrDefault(NUOPCFieldEntryType.STATE, true)) {
            		NUOPCFieldEntry stateRoot = compEntry.getOrAddChild(NUOPCFieldEntryType.COMPONENT_STATE_ROOT);
            		addStatesToComp(quarkComp, stateRoot, fullState);          	
            	}
            	
            }
		}
		
		private void addESMFAttributes(int quarkParent, NUOPCFieldEntry parent, NUOPCFieldEntryType type, List<ITmfStateInterval> fullState) {
			int quarkAttributes = stateSystem.optQuarkRelative(quarkParent, "attribute");
        	if (quarkAttributes != ITmfStateSystem.INVALID_ATTRIBUTE) {
        		List<Integer> attrList = stateSystem.getSubAttributes(quarkAttributes, false);
        		if (attrList.size() > 0) {
        			NUOPCFieldEntry attrRoot = parent.getOrAddChild(type);
        			attrList.forEach(q -> {
        				String attrName = stateSystem.getAttributeName(q);
        				NUOPCFieldEntry attrEntry = attrRoot.getOrAddChild(NUOPCFieldEntryType.ATTRIBUTE, q);
        				attrEntry.setName(attrName);
        				attrEntry.setValue(unboxOrNull(fullState, q));
        			});
        		}
        	}
		}
		
		private void addESMFStatistics(int quarkParent, NUOPCFieldEntry parent, NUOPCFieldEntryType type, List<ITmfStateInterval> fullState) {
			int quarkAttributes = stateSystem.optQuarkRelative(quarkParent, "stats");
        	if (quarkAttributes != ITmfStateSystem.INVALID_ATTRIBUTE) {
        		List<Integer> attrList = stateSystem.getSubAttributes(quarkAttributes, false);
        		if (attrList.size() > 0) {
        			NUOPCFieldEntry attrRoot = parent.getOrAddChild(type);
        			attrList.forEach(q -> {
        				String attrName = stateSystem.getAttributeName(q);
        				NUOPCFieldEntry attrEntry = attrRoot.getOrAddChild(NUOPCFieldEntryType.STATISTIC, q);
        				
        				//TODO: deal with this more cleanly when there are more stats
        				if (attrName.contains("petMinVal")) {
        					attrName = "PET-local Min Value";
        				}
        				else if (attrName.contains("petMaxVal")) {
        					attrName = "PET-local Max Value";
        				}
        				
        				attrEntry.setName(attrName);
        				attrEntry.setValue(unboxOrNull(fullState, q));
        			});
        		}
        	}
		}
		
		private void addStatesToComp(int quarkRoot, NUOPCFieldEntry parent, List<ITmfStateInterval> fullState) {
    	
	    	//add the states
	    	int quarkStateRoot = stateSystem.optQuarkRelative(quarkRoot, "state");
	    	if (quarkStateRoot != ITmfStateSystem.INVALID_ATTRIBUTE) {
	    		
	    		for (int quarkState : stateSystem.getSubAttributes(quarkStateRoot, false)) {
	    			
	    			NUOPCFieldEntry stateEntry = parent.getOrAddChild(NUOPCFieldEntryType.STATE, quarkState);
	            	
	            	int quarkStateName = stateSystem.optQuarkRelative(quarkState, "attribute", "name$NUOPC$Instance");
	            	stateEntry.setName(unboxOrNull(fullState, quarkStateName));
	            	
	            	if (filterMap.getOrDefault(NUOPCFieldEntryType.STATE_ATTRIBUTE_ROOT, true)) {
	            		addESMFAttributes(quarkState, stateEntry, NUOPCFieldEntryType.STATE_ATTRIBUTE_ROOT, fullState);
	            	}

	            	if (filterMap.getOrDefault(NUOPCFieldEntryType.FIELD, true)) {
	            		NUOPCFieldEntry fieldRoot = stateEntry.getOrAddChild(NUOPCFieldEntryType.STATE_FIELD_ROOT);
	            		addFieldsToState(quarkState, fieldRoot, fullState);
	            	}
	            		            	
	    		}
	    	}
		}
		
		private void addFieldsToState(int quarkRoot, NUOPCFieldEntry parent, List<ITmfStateInterval> fullState) {
	    	
	    	int quarkFieldRoot = stateSystem.optQuarkRelative(quarkRoot, "field");
	    	if (quarkFieldRoot != ITmfStateSystem.INVALID_ATTRIBUTE) {
	    		
	    		for (int quarkField : stateSystem.getSubAttributes(quarkFieldRoot, false)) {
	    			
					//if field marked as replaced, do not show it
					/*
	    			int quarkFieldReplaced = stateSystem.optQuarkRelative(quarkField, "replaced");
					if (quarkFieldReplaced != ITmfStateSystem.INVALID_ATTRIBUTE) {
	            		if (fullState.get(quarkFieldReplaced).getStateValue().toString().equals("true")) {
	            			continue;
	            		}
	            	}
					*/
	    			
					String fieldName = null; 
	            	int quarkFieldName = stateSystem.optQuarkRelative(quarkField, "attribute", "StandardName$CF$Extended");
	            	fieldName = unboxOrNull(fullState, quarkFieldName);
	            	
	            	NUOPCFieldEntry fieldEntry = parent.getOrAddChild(NUOPCFieldEntryType.FIELD, quarkField);
	            	fieldEntry.setName(fieldName);
	            	
	            	if (filterMap.getOrDefault(NUOPCFieldEntryType.FIELD_ATTRIBUTE_ROOT, true)) {
	            		addESMFAttributes(quarkField, fieldEntry, NUOPCFieldEntryType.FIELD_ATTRIBUTE_ROOT, fullState);
	            	}
	            		      
	            	if (filterMap.getOrDefault(NUOPCFieldEntryType.FIELD_STATISTIC_ROOT, true)) {
	            		addESMFStatistics(quarkField, fieldEntry, NUOPCFieldEntryType.FIELD_STATISTIC_ROOT, fullState);
	            	}
	            	
	    		}
	    	}
		}
				
		private String unboxOrNull(List<ITmfStateInterval> fullState, int quark) {
			if (quark != ITmfStateSystem.INVALID_ATTRIBUTE) {
				ITmfStateValue stateVal = fullState.get(quark).getStateValue();
				if (stateVal.isNull()) {
        			return null;
        		}
        		else if (stateVal.getType()==ITmfStateValue.Type.DOUBLE) {
        			return String.valueOf(stateVal.unboxDouble());
        		}
        		else {
        			return stateVal.unboxStr();
        		}
        	}
			return null;
		}
		
		protected class NUOPCFieldTreeLabelProvider extends TreeLabelProvider {

	        @Override
	        public String getColumnText(Object element, int columnIndex) {
	            if (element instanceof NUOPCFieldEntry) {
	            	NUOPCFieldEntry fe = (NUOPCFieldEntry) element;
	            	if (columnIndex == 0) {
	            		if (fe.getName() != null) {
	            	   		return fe.getName(); 
	            	   	}
	            	   	else {
	            	   		return fe.getType().toString();
	            	   	}
	            	}
	            	else if (columnIndex == 1) {
	            		if (fe.getValue() != null) {
	            			return fe.getValue();
	            		}
	            	}
	            }
	            return super.getColumnText(element, columnIndex);
	        }

	        @Override
	        public Color getBackground(Object element, int columnIndex) {
	            return super.getBackground(element, columnIndex);
	        }
	        
	        @Override
	        public Image getColumnImage(Object element, int columnIndex) {
	        	if (columnIndex == 0) {
	        		NUOPCFieldEntry fe = (NUOPCFieldEntry) element;
	        		if (fe.getType().getIcon() != null) {
	        			ImageDescriptor image = Activator.getImageDescriptor("icons/" + fe.getType().getIcon());
	        			return image.createImage();
	        		}
	        	}
	        	return super.getColumnImage(element, columnIndex);
	        }
	    }
		
	}
	
	protected enum NUOPCFieldEntryType {
		
		COMPONENT("Component", "component.png"),
		COMPONENT_ATTRIBUTE_ROOT("Attributes", null),
		COMPONENT_STATE_ROOT("States", null),
		COMPONENT_CLOCK_ROOT("Clock", "clock.png"),
				
		STATE("State", "state.png"),
		STATE_ATTRIBUTE_ROOT("Attributes", null),
		STATE_FIELD_ROOT("Fields", null),
		
		FIELD("Field", "field.png"),
		FIELD_ATTRIBUTE_ROOT("Attributes", null),
		FIELD_STATISTIC_ROOT("Statistics", null),
		
		ATTRIBUTE("Attribute", "attribute.png"),
		STATISTIC("Statistic", null),
		GENERAL("General", null);
		
		String kind;
		String icon;
		
		private NUOPCFieldEntryType(String kind, String icon) {
			this.kind = kind;
			this.icon = icon;
		}
		
		public String getIcon() {
			return icon;
		}
		
		public String toString() {
			return kind;
		}
				
	}
	
	protected static class NUOPCFieldEntry extends TmfTreeViewerEntry {
		
		private NUOPCFieldEntryType type;
		private Map<String, Object> attributes;
		private String value;
		private int quark = -1;
		
		public NUOPCFieldEntryType getType() {
			return type;
		}

		public void setType(NUOPCFieldEntryType type) {
			this.type = type;
		}
		
		

	
		public void nullify() {
			attributes.clear();
			setValue(null);
		}
		
		public String getAttribute(String key) {
			if (attributes.containsKey(key)) {
				return attributes.get(key).toString();
			}
			return null;
		}
		
		public void setAttribute(String key, Object val) {
			attributes.put(key, val);
			
		}
		
		public NUOPCFieldEntry getOrAddChild(NUOPCFieldEntryType type, int quark) {
			for (ITmfTreeViewerEntry child : getChildren()) {
				NUOPCFieldEntry c = (NUOPCFieldEntry) child;
				if (c.getQuark() == quark && c.getType() == type) {
					return c;
				}
			}
			NUOPCFieldEntry c = new NUOPCFieldEntry(type, quark, null);
			addChild(c);
			return c;
		}
		
		public NUOPCFieldEntry getOrAddChild(NUOPCFieldEntryType type) {
			for (ITmfTreeViewerEntry child : getChildren()) {
				NUOPCFieldEntry c = (NUOPCFieldEntry) child;
				if (c.getType() == type) {
					return c;
				}
			}
			NUOPCFieldEntry c = new NUOPCFieldEntry(type, -1, null);
			addChild(c);
			return c;
		}
		
		public NUOPCFieldEntry(NUOPCFieldEntryType type, int quark, String name) {
			super(name);
			this.type = type;
			this.quark = quark;
			attributes = new HashMap<>();
		}
			
		public NUOPCFieldEntry() {
			this(null, -1, null);
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public int getQuark() {
			return quark;
		}

		public void setQuark(int quark) {
			this.quark = quark;
		}
	}

}
