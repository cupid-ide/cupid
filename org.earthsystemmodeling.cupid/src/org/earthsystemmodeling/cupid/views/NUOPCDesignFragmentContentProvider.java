package org.earthsystemmodeling.cupid.views;

import java.util.List;
import java.lang.reflect.Field;
import java.util.ArrayList;

import org.earthsystemmodeling.cupid.nuopc.v7r.df.AddComponentToDriver;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.Binding;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.DesignFragment;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.Task;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.TransferGridBetweenComponents;
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
		
		if (parentElement instanceof DesignFragment) {
			DesignFragment df = (DesignFragment) parentElement;
			return new Object[] {
						new GoalNode(df), 
						new BindingsNode(df), 
						new TasksNode(df)};
		}
		else if (parentElement instanceof BindingsNode) {
			DesignFragment df = ((BindingsNode) parentElement).df;
			List<BindingNode> bindingList = new ArrayList<BindingNode>();
			for (Field f : df.getClass().getDeclaredFields()) {
				if (f.getAnnotation(Binding.class) != null) {
					bindingList.add(new BindingNode(df, f));
				}
			}
			return bindingList.toArray();
		}
		else if (parentElement instanceof TasksNode) {
			DesignFragment df = ((TasksNode) parentElement).df;
			TaskContextNode[] tasks = new TaskContextNode[df.tasks().size()];
			for (int i=0; i<df.tasks().size(); i++) {
				tasks[i] = new TaskContextNode(df, df.tasks().get(i));
			}
			return tasks;
		}
		else if (parentElement instanceof TaskContextNode) {
			TaskContextNode tcn = (TaskContextNode) parentElement;
			List<DFNode> taskList = new ArrayList<DFNode>();
			taskList.add(new TaskNode(tcn.df, tcn.task)); // the task itself

			//add any subtasks
			for (Task st : tcn.task.getSubTasks()) {
				taskList.add(new TaskContextNode(tcn.df, st));
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
		/*
		if (element instanceof DesignFragment ||
			element instanceof TasksNode ||
			element instanceof TaskContextNode) {
			return true;
		}
		return false;
		*/
		return getChildren(element) != null;
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return new Object[] {
				new AddComponentToDriver(),
				new TransferGridBetweenComponents()
			};
	}
	
	public static class DFNode {
		public DesignFragment df;
	}
	
	public static class GoalNode extends DFNode {	
		public GoalNode(DesignFragment df) {
			this.df = df;
		}
	}
	
	public static class BindingsNode extends DFNode {
		public BindingsNode(DesignFragment df) {
			this.df = df;
		}
	}
	
	public static class BindingNode extends DFNode {
		public Field field;
		public BindingNode(DesignFragment df, Field field) {
			this.df = df;
			this.field = field;
		}
	}
	
	public static class TasksNode extends DFNode {
		public TasksNode(DesignFragment df) {
			this.df = df;
		}
	}
	
	public static class TaskNode extends DFNode {
		public Task task;
		public TaskNode(DesignFragment df, Task task) {
			this.df = df;
			this.task = task;
		}
	}
	
	public static class TaskContextNode extends DFNode {
		public Task task;
		public TaskContextNode(DesignFragment df, Task task) {
			this.df = df;
			this.task = task;
		}
	}

}