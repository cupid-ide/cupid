package org.earthsystemmodeling.cupid.trace.callgraph;

import java.util.List;

import org.earthsystemmodeling.cupid.trace.statistics.GlobalNode;
import org.earthsystemmodeling.cupid.trace.statistics.ThreadNode;
import org.eclipse.tracecompass.tmf.core.model.tree.TmfTreeDataModel;

public class PerPETStatsTreeDataModel extends TmfTreeDataModel {

	private List<ThreadNode> fThreadNodes;
	private GlobalNode fGlobalNode;
	
	public PerPETStatsTreeDataModel(long id, long parentId, String name, List<ThreadNode> threadNodes) {
		super(id, parentId, name);
		fThreadNodes = threadNodes;
	}
	
	public PerPETStatsTreeDataModel(long id, long parentId, String name, GlobalNode globalNode) {
		super(id, parentId, name);
		fGlobalNode = globalNode;
	}

	public List<ThreadNode> getThreadNodes() {
		return fThreadNodes;
	}
	
	public GlobalNode getGlobalNode() {
		return fGlobalNode;
	}


}
