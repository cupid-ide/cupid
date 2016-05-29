package org.earthsystemmodeling.cupid.views;

import java.util.List;
import java.util.Map.Entry;
import java.util.ArrayList;

import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.AddComponentToDriver;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.DesignFragment;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.Task;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class NUOPCDesignFragmentContentProvider implements IStructuredContentProvider, ITreeContentProvider {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] getChildren(Object parentElement) {
		
		if (parentElement instanceof DFTopNode) {
			DFTopNode topNode = (DFTopNode) parentElement;
			DesignFragment df = topNode.df;
			return new Object[] {
						new GoalNode(topNode, df), 
						new BindingsNode(topNode, df), 
						new TasksNode(topNode, df)};
		}
		else if (parentElement instanceof BindingsNode) {
			BindingsNode bn = (BindingsNode) parentElement;
			DesignFragment df = bn.df;
			List<BindingNode> bindingList = new ArrayList<BindingNode>();
			for (String bindingName : df.getBindings()) {
				bindingList.add(new BindingNode(bn, df, bindingName));
			}
			return bindingList.toArray();
		}
		else if (parentElement instanceof TasksNode) {
			TasksNode tn = (TasksNode) parentElement;
			DesignFragment df = tn.df;
			TaskContextNode[] tasks = new TaskContextNode[df.getTasks().size()];
			for (int i=0; i<df.getTasks().size(); i++) {
				tasks[i] = new TaskContextNode(tn, df, df.getTasks().get(i));
			}
			return tasks;
		}
		else if (parentElement instanceof TaskContextNode) {
			TaskContextNode tcn = (TaskContextNode) parentElement;
			List<DFNode> taskList = new ArrayList<DFNode>();
			TaskNode toAdd = new TaskNode(tcn, tcn.df, tcn.task);
			taskList.add(toAdd); // the task itself
			//add any subtasks
			for (Task st : (List<Task<?>>) tcn.task.getSubTasks()) {
				taskList.add(new TaskContextNode(tcn, tcn.df, st));
			}
			return taskList.toArray();
			
		}
		
		return null;
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element) != null;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return new Object[] {
				new DFTopNode(null, new AddComponentToDriver())
				//new TransferGridBetweenComponents()
			};
	}
	
	public static abstract class DFNode {
		public DesignFragment df;
		public DFNode parent;
		public DFNode(DFNode parent, DesignFragment df) {
			this.parent = parent;
			this.df = df;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof DFNode) {
				DFNode otherNode = (DFNode) obj;
				return otherNode.parent == this.parent && otherNode.df == this.df;
			}
			return false;
		}
	}
	
	public static class DFTopNode extends DFNode {
		public TasksNode tasksNode;
		public DFTopNode(DFNode parent, DesignFragment df) {
			super(parent, df);
		}
		@Override
		public boolean equals(Object obj) {
			return obj == this;
		}	
	}
	
	public static class GoalNode extends DFNode {	
		public GoalNode(DFNode parent, DesignFragment df) {
			super(parent, df);
		}
		@Override
		public boolean equals(Object obj) {
			return super.equals(obj) &&
					(obj instanceof GoalNode);
		}
	}
	
	public static class BindingsNode extends DFNode {
		public BindingsNode(DFNode parent, DesignFragment df) {
			super(parent, df);
		}
		@Override
		public boolean equals(Object obj) {
			return super.equals(obj) &&
					(obj instanceof BindingsNode);
		}
	}
	
	public static class BindingNode extends DFNode {
		public String name;
		public BindingNode(DFNode parent, DesignFragment df, String name) {
			super(parent, df);
			this.name = name;
		}
		@Override
		public boolean equals(Object obj) {
			return super.equals(obj) &&
					(obj instanceof BindingNode) &&
					((BindingNode) obj).name.equals(name);
		}
	}
	
	public static class TasksNode extends DFNode {
		public TasksNode(DFTopNode parent, DesignFragment df) {
			super(parent, df);
			parent.tasksNode = this;
		}
		@Override
		public boolean equals(Object obj) {
			return super.equals(obj) &&
					(obj instanceof TasksNode);
		}
	}
	
	public static class TaskNode extends DFNode {
		public Task task;
		public TaskNode(DFNode parent, DesignFragment df, Task task) {
			super(parent, df);
			this.task = task;
		}
		@Override
		public boolean equals(Object obj) {
			return super.equals(obj) &&
					(obj instanceof TaskNode) &&
					((TaskNode) obj).task == task;
		}
	}
	
	public static class TaskContextNode extends DFNode {
		public Task task;
		public TaskContextNode(DFNode parent, DesignFragment df, Task task) {
			super(parent, df);
			this.task = task;
		}
		@Override
		public boolean equals(Object obj) {
			return super.equals(obj) &&
					(obj instanceof TaskContextNode) &&
					((TaskContextNode) obj).task == task;
		}
	}

}