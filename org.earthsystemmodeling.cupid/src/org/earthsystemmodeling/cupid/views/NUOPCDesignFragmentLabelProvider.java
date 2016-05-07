package org.earthsystemmodeling.cupid.views;

import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.DesignFragment;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.BindingNode;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.BindingsNode;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.GoalNode;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.TaskContextNode;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.TaskNode;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.TasksNode;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.graphics.Image;

public class NUOPCDesignFragmentLabelProvider extends StyledCellLabelProvider {

	static Image ICON_SCRIPT = CupidActivator.getImageDescriptor("icons/script_gear.png").createImage();
	static Image ICON_BULB = CupidActivator.getImageDescriptor("icons/lightbulb.gif").createImage();
	
	@Override
	public void update(final ViewerCell cell) {
	
		if (cell.getColumnIndex() == 0) {
			
			if (cell.getElement() instanceof DesignFragment) {
				DesignFragment df = (DesignFragment) cell.getElement();
				cell.setText(df.name());
				cell.setImage(ICON_SCRIPT);
			}
			else if (cell.getElement() instanceof GoalNode) {
				GoalNode gn = (GoalNode) cell.getElement();
				cell.setText("Goal: " + gn.df.goal());
				cell.setImage(ICON_BULB);
			}
			else if (cell.getElement() instanceof BindingsNode) {
				cell.setText("Bindings");
			}
			else if (cell.getElement() instanceof BindingNode) {
				BindingNode bn = (BindingNode) cell.getElement();
				cell.setText(getLabel(bn.field.getType()) + ": (unbound)");
				cell.setImage(getMappingImage(bn.field.getType()));
			}
			else if (cell.getElement() instanceof TasksNode) {
				//TasksNode tn = (TasksNode) cell.getElement();
				cell.setText("Tasks");
			}
			else if (cell.getElement() instanceof TaskContextNode) {
				TaskContextNode tn = (TaskContextNode) cell.getElement();
				cell.setText(getLabel(tn.task.getContext()));
				cell.setImage(getMappingImage(tn.task.getContext()));
			}
			else if (cell.getElement() instanceof TaskNode) {
				TaskNode tn = (TaskNode) cell.getElement();
				if (tn.task.isOptional()) {
					cell.setText("(optional) " + tn.task.getText());
				}
				else {
					cell.setText(tn.task.getText());
				}
			}
		}
		
	}
	
	@Override
	public String getToolTipText(Object element) {
		if (element instanceof DesignFragment) {
			return ((DesignFragment) element).description();
		}
		else if (element instanceof GoalNode) {
			return ((GoalNode) element).df.description();
		}
		else {
			return null;
		}
	}
	
	private String getLabel(Class<?> c) {
		Label lbl = c.getAnnotation(Label.class);
		if (lbl != null && lbl.label() != null) {
			return lbl.label();
		}
		else {
			return c.getSimpleName();
		}
	}
	
	private Image getMappingImage(Class<?> c) {
		MappingType mappingType = c.getAnnotation(MappingType.class);
		if (mappingType != null) {
			return NUOPCViewLabelProvider.getFortranImageDescriptor(
					mappingType.value()).createImage();
		}
		return null;
	}
	
}
