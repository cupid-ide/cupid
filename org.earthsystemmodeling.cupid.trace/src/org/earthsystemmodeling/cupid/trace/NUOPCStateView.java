package org.earthsystemmodeling.cupid.trace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.tracecompass.statesystem.core.ITmfStateSystem;
import org.eclipse.tracecompass.statesystem.core.exceptions.AttributeNotFoundException;
import org.eclipse.tracecompass.statesystem.core.exceptions.StateSystemDisposedException;
import org.eclipse.tracecompass.statesystem.core.interval.ITmfStateInterval;
import org.eclipse.tracecompass.tmf.core.signal.TmfTraceSelectedSignal;
import org.eclipse.tracecompass.tmf.core.trace.ITmfTrace;
import org.eclipse.tracecompass.tmf.core.trace.TmfTraceManager;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.AbstractTmfTreeViewer;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeColumnDataProvider;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.ITmfTreeViewerEntry;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.TmfTreeColumnData;
import org.eclipse.tracecompass.tmf.ui.viewers.tree.TmfTreeViewerEntry;
import org.eclipse.tracecompass.tmf.ui.views.TmfView;


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

        //fillToolBar() ;

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

		public NUOPCStateTreeViewer(Composite parent) {
			super(parent, true);
			setLabelProvider(new NUOPCFieldTreeLabelProvider());
	        getTreeViewer().setAutoExpandLevel(2);
		}

		@Override
		protected ITmfTreeColumnDataProvider getColumnDataProvider() {
			 return new ITmfTreeColumnDataProvider() {

		            @Override
		            public List<TmfTreeColumnData> getColumnData() {
		                List<TmfTreeColumnData> columns = new ArrayList<>();
		                TmfTreeColumnData column = new TmfTreeColumnData("Field");
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
		                columns.add(new TmfTreeColumnData("Min (PET)"));
		                columns.add(new TmfTreeColumnData("Max (PET)"));
		                columns.add(new TmfTreeColumnData("Avg (PET)"));
		                
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
	        module.schedule();
            if (!module.waitForInitialization()) {
                return null;
            }
	        
            NUOPCFieldEntry rootEntry = new NUOPCFieldEntry();
            
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
            	String compName = "UNKNOWN";
            	String esmfid = null;
            	
            	int quarkId;
				try {
					quarkId = stateSystem.getQuarkRelative(quarkComp, "attribute", "ESMFID$NUOPC$Instance");
					if (fullState.get(quarkId).getStateValue().isNull()) {
						continue;
					}
					esmfid = fullState.get(quarkId).getStateValue().toString();
				} catch (AttributeNotFoundException e) {
					continue;
				}
            	
            	int quarkName = stateSystem.optQuarkRelative(quarkComp, "attribute", "CompName$NUOPC$Instance");
            	if (quarkName != ITmfStateSystem.INVALID_ATTRIBUTE) {
            		if (fullState.get(quarkName).getStateValue().isNull()) {
            			compName = null;
            		}
            		else {
            			compName = fullState.get(quarkName).getStateValue().toString();
            		}
            	}
            	
            	NUOPCFieldEntry compEntry = new NUOPCFieldEntry(NUOPCFieldEntryType.COMPONENT, esmfid, compName);
             	addStatesToComp(quarkComp, compEntry, fullState);
            	
            	parent.addChild(compEntry);
            }
		}
		
		private void addStatesToComp(int quarkRoot, NUOPCFieldEntry parent, List<ITmfStateInterval> fullState) {
    	
	    	//add the states
	    	int quarkStateRoot = stateSystem.optQuarkRelative(quarkRoot, "state");
	    	if (quarkStateRoot != ITmfStateSystem.INVALID_ATTRIBUTE) {
	    		
	    		for (int quarkState : stateSystem.getSubAttributes(quarkStateRoot, false)) {
	    			String stateName = "UNKNOWN";
	    			String stateEsmfId = null;
	    			
	    			int quarkStateId;
					try {
						quarkStateId = stateSystem.getQuarkRelative(quarkState, "attribute", "ESMFID$NUOPC$Instance");
						if (fullState.get(quarkStateId).getStateValue().isNull()) {
							continue;
						}
						stateEsmfId = fullState.get(quarkStateId).getStateValue().toString();
					} catch (AttributeNotFoundException e) {
						//e.printStackTrace();
						//stateEsmfId = "UNKNOWN";
						continue;
					}
	            		            	
	            	int quarkStateName = stateSystem.optQuarkRelative(quarkState, "attribute", "name$NUOPC$Instance");
	            	if (quarkStateName != ITmfStateSystem.INVALID_ATTRIBUTE) {
	            		stateName = fullState.get(quarkStateName).getStateValue().toString();
	            	}
	            	
	            	NUOPCFieldEntry stateEntry = new NUOPCFieldEntry(NUOPCFieldEntryType.STATE, stateEsmfId, stateName);
	            	
	            	addFieldsToState(quarkState, stateEntry, fullState);
	            	
	            	parent.addChild(stateEntry);
	    		}
	    	}
		}
		
		
		private void addFieldsToState(int quarkRoot, NUOPCFieldEntry parent, List<ITmfStateInterval> fullState) {
	    	
	    	int quarkFieldRoot = stateSystem.optQuarkRelative(quarkRoot, "field");
	    	if (quarkFieldRoot != ITmfStateSystem.INVALID_ATTRIBUTE) {
	    		
	    		for (int quarkField : stateSystem.getSubAttributes(quarkFieldRoot, false)) {
	    			String fieldName = "UNKNOWN";
	    			String fieldEsmfId = null;
	    			
	    			int quarkFieldId;
					try {
						quarkFieldId = stateSystem.getQuarkRelative(quarkField, "attribute", "ESMFID$NUOPC$Instance");
						if (fullState.get(quarkFieldId).getStateValue().isNull()) {
							continue;
						}
						fieldEsmfId = fullState.get(quarkFieldId).getStateValue().toString();
					} catch (AttributeNotFoundException e) {
						//e.printStackTrace();
						fieldEsmfId = "UNKNOWN";
						//continue;
					}
	            		            	
	            	int quarkFieldName = stateSystem.optQuarkRelative(quarkField, "attribute", "StandardName$CF$Extended");
	            	if (quarkFieldName != ITmfStateSystem.INVALID_ATTRIBUTE) {
	            		fieldName = fullState.get(quarkFieldName).getStateValue().toString();
	            	}
	            	
	            	NUOPCFieldEntry fieldEntry = new NUOPCFieldEntry(NUOPCFieldEntryType.FIELD, fieldEsmfId, fieldName);
	            	
	            	int quarkFieldStat = stateSystem.optQuarkRelative(quarkField, "stats", "petMinVal$NUOPC$Instance");
	            	if (quarkFieldStat != ITmfStateSystem.INVALID_ATTRIBUTE) {
	            		double petMinVal = fullState.get(quarkFieldStat).getStateValue().unboxDouble();
	            		fieldEntry.setAttribute("petMinVal", petMinVal);
	            	}
	            	
	            	quarkFieldStat = stateSystem.optQuarkRelative(quarkField, "stats", "petMaxVal$NUOPC$Instance");
	            	if (quarkFieldStat != ITmfStateSystem.INVALID_ATTRIBUTE) {
	            		double petMaxVal = fullState.get(quarkFieldStat).getStateValue().unboxDouble();
	            		fieldEntry.setAttribute("petMaxVal", petMaxVal);
	            	}
	            	
	            	parent.addChild(fieldEntry);
	    		}
	    	}
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
	            	   		return fe.getType().kind() + " (id=" + fe.getESMFID() + ")";
	            	   	}
	            	}
	            	else if (columnIndex == 1 && fe.getType() == NUOPCFieldEntryType.FIELD) {
	            		return fe.getAttribute("petMinVal");
	            	}
	            	else if (columnIndex == 2 && fe.getType() == NUOPCFieldEntryType.FIELD) {
	            		return fe.getAttribute("petMaxVal");
	            	}
	            }
	            return super.getColumnText(element, columnIndex);
	        }

	        @Override
	        public Color getBackground(Object element, int columnIndex) {
	            //if (element instanceof StateEntry) {
	            //    if (((StateEntry) element).isModified()) {
	            //        return Display.getCurrent().getSystemColor(SWT.COLOR_YELLOW);
	            //    }
	            //}
	            return super.getBackground(element, columnIndex);
	        }
	    }
		
	}
	
	protected enum NUOPCFieldEntryType {
		COMPONENT,
		STATE,
		FIELD;
		
		public String kind() {
			if (this==COMPONENT) return "Component";
			else if (this==STATE) return "State";
			else if (this==FIELD) return "Field";
			else return "UNKNOWN";
		}
	}
	
	protected class NUOPCFieldEntry extends TmfTreeViewerEntry {
		
		private NUOPCFieldEntryType type;
		private String esmfid;
		private Map<String, Object> attributes;
		
		public NUOPCFieldEntryType getType() {
			return type;
		}

		public void setType(NUOPCFieldEntryType type) {
			this.type = type;
		}

		public String getESMFID() {
			return esmfid;
		}

		public void setESMFID(String esmfid) {
			this.esmfid = esmfid;
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
		
		public NUOPCFieldEntry(NUOPCFieldEntryType type, String esmfid, String name) {
			super(name);
			this.type = type;
			this.esmfid = esmfid;
			attributes = new HashMap<>();
		}
			
		public NUOPCFieldEntry() {
			this(null, null, null);
		}
	}

}
