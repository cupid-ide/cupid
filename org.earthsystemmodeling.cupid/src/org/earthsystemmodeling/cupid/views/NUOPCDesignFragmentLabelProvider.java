package org.earthsystemmodeling.cupid.views;

import org.apache.commons.lang.WordUtils;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.DesignFragment;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.Task;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.BindingNode;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.BindingsNode;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.DFTopNode;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.GoalNode;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.TaskContextNode;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.TaskNode;
import org.earthsystemmodeling.cupid.views.NUOPCDesignFragmentContentProvider.TasksNode;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;

public class NUOPCDesignFragmentLabelProvider extends StyledCellLabelProvider {

	static Image ICON_SCRIPT = CupidActivator.getImageDescriptor("icons/script_gear.png").createImage();
	static Image ICON_BULB = CupidActivator.getImageDescriptor("icons/lightbulb.gif").createImage();
	
	@Override
	public void update(final ViewerCell cell) {
	
		if (cell.getColumnIndex() == 0) {
			
			if (cell.getElement() instanceof DFTopNode) {
				DFTopNode topNode = (DFTopNode) cell.getElement();
				DesignFragment df = (DesignFragment) topNode.df;
				cell.setText(df.getName());
				cell.setImage(ICON_SCRIPT);
			}
			else if (cell.getElement() instanceof GoalNode) {
				GoalNode gn = (GoalNode) cell.getElement();
				cell.setText(WordUtils.wrap("Goal: " + gn.df.getGoal(), 70));
				cell.setImage(ICON_BULB);
			}
			else if (cell.getElement() instanceof BindingsNode) {
				cell.setText("Bindings");
			}
			else if (cell.getElement() instanceof BindingNode) {
				BindingNode bn = (BindingNode) cell.getElement();
				//String text = bn.binding.getValue().getSimpleName() + " :: " + bn.binding.getKey() + " = ";
				//CodeConcept<?,?> codeConcept = bn.df.getBindings().get(bn.binding.getKey());
				String text = bn.df.getBindingType(bn.name).getSimpleName() + " :: " + bn.name + " = ";
				CodeConcept<?,?> codeConcept = bn.df.getBinding(bn.name);
				if (codeConcept != null) {
					text += " " + codeConcept.name();
				}
				else {
					text += " (unbound)";
				}
				cell.setText(text);
				int swtprops = 0;
				if (codeConcept == null) {
					swtprops = SWT.IMAGE_GRAY;
				}
				cell.setImage(getMappingImage(bn.df.getBindingType(bn.name), swtprops));
			}
			else if (cell.getElement() instanceof TasksNode) {
				cell.setText("Development Tasks");
			}
			else if (cell.getElement() instanceof TaskContextNode) {
				TaskContextNode tn = (TaskContextNode) cell.getElement();
				String typeName = tn.task.getBindingType().getSimpleName();
				cell.setText(typeName);
				if (tn.task.getBindingType() != null) {
					if (tn.task.boundTo() == null) {
						cell.setImage(getMappingImage(tn.task.getBindingType(), SWT.IMAGE_GRAY));
					}
					else {
						cell.setImage(getMappingImage(tn.task.getBindingType(), 0));
					}
				}
			}
			else if (cell.getElement() instanceof TaskNode) {
				TaskNode tn = (TaskNode) cell.getElement();
				String text = "";
				if (tn.task.isOptional()) {
					text += "(optional) ";
				}
				text += tn.task.getText();
				cell.setText(WordUtils.wrap(text, 70));
				
			}
		}
		
	}
	
	@Override
	public String getToolTipText(Object element) {
		if (element instanceof DesignFragment) {
			return ((DesignFragment) element).getDescription();
		}
		else if (element instanceof GoalNode) {
			return ((GoalNode) element).df.getDescription();
		}
		else if (element instanceof BindingNode) {
			BindingNode bn = (BindingNode) element;
			//CodeConcept<?,?> codeConcept = bn.df.getBindings().get(bn.binding.getKey());
			CodeConcept<?,?> codeConcept = bn.df.getBinding(bn.name);
			if (codeConcept != null) {
				return "Bound to "  + codeConcept.name() + " in " + codeConcept.getContext().getFullPath().toString();
			}
		}
		return null;
		
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
	
	private Image getMappingImage(Class<?> c, int SWT_PROPS) {
		MappingType mappingType = c.getAnnotation(MappingType.class);
		if (mappingType != null) {
			return NUOPCViewLabelProvider.getFortranImageDescriptor(
					mappingType.value(), SWT_PROPS).createImage();
		}
		return null;
	}
	
}
