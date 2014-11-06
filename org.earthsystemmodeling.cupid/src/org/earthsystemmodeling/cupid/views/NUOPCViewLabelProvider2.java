package org.earthsystemmodeling.cupid.views;

import java.lang.reflect.Field;
import java.net.URL;

import org.earthsystemmodeling.FSM;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc_v7.Child;
import org.earthsystemmodeling.cupid.nuopc_v7.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc_v7.Label;
import org.earthsystemmodeling.cupid.nuopc_v7.Name;
import org.earthsystemmodeling.cupid.views.NUOPCViewContentProvider.NUOPCModelElem;
import org.earthsystemmodeling.psyche.Call;
import org.earthsystemmodeling.psyche.ImplicitContextMapping;
import org.earthsystemmodeling.psyche.Mapping;
import org.earthsystemmodeling.psyche.Module;
import org.earthsystemmodeling.psyche.SubconceptOrAttribute;
import org.earthsystemmodeling.psyche.Subroutine;
import org.earthsystemmodeling.psyche.UsesEntity;
import org.earthsystemmodeling.psyche.UsesModule;
import org.earthsystemmodeling.psyche.VariableDeclaration;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

class NUOPCViewLabelProvider2 extends StyledCellLabelProvider { //implements ITableLabelProvider {

	private NUOPCViewContentProvider2 contentProvider;
	
	public NUOPCViewLabelProvider2(NUOPCViewContentProvider2 contentProvider) {
		this.contentProvider = contentProvider;
	}
	
	@Override
	public String getToolTipText(Object element) {
		return "tooltip";
	}
	
	/*
	@Override
	public Image getToolTipImage(Object object) {
		NUOPCModelElem me = (NUOPCModelElem) object;
		return getFortranImageDescriptor(me.eref, me.elem, null).createImage();
	}
	*/
	
	@Override
	public void update(final ViewerCell cell) {
	
		CodeConcept<?,?,?> element = (CodeConcept<?,?,?>) cell.getElement();
	    StyledString text = new StyledString();	
	    	    
	    /*
	    StyledString.Styler styler = new StyledString.Styler() {			
			@Override
			public void applyStyles(TextStyle textStyle) {
				// TODO Auto-generated method stub
				if (textStyle instanceof StyleRange) {
					StyleRange sr = (StyleRange) textStyle;
					sr.fontStyle = SWT.BOLD;
					sr.borderStyle = SWT.BORDER_DOT;
					sr.underline = true;
				}
				
			}						
		};
		*/
		
	    Class<?> clazz = element.getClass();
	    
	    if (cell.getColumnIndex() == 0) {
	    	
	    	//see if there is a name annotation
	    	String label = clazz.getSimpleName();
	    	Label lbl = clazz.getAnnotation(Label.class);
    		if (lbl != null) {
				try {
					label = lbl.value();
				} catch (IllegalArgumentException e) {
					//ignore
				}
			}
			
			text.append(label);
			
			
			/*
			cell.getControl().addMouseListener(new MouseAdapter() {
				@Override
				public void mouseDoubleClick(MouseEvent e) {
					System.out.println("You double clicked: " + e.data);
				}
			});
			*/
		
			ImageDescriptor id = getFortranImageDescriptor();
			if (id != null) {
				cell.setImage(id.createImage());
			}
			
	    }
	    else {
	    	
	    	String name = null;
	    	
	    	for (Field field : clazz.getFields()) {
				if (field.getAnnotation(Name.class) != null) {
					try {
						name = (String) field.get(element);
						break; //assume one name for now
					} catch (IllegalArgumentException | IllegalAccessException e) {
						//ignore
					}
				}
			}
	    	
	    	if (name != null) {
	    		text.append(name);
	    	}
	    	else {
	    		text.append(element.toString());
	    	}
	    	//cell.setImage(getFortranImage(me));
	    }
	    
	    cell.setText(text.toString());
	    cell.setStyleRanges(text.getStyleRanges());
	    
	    //if (me.validationMessage != null || (me.elem==null && !me.subconcept.isAttrib() && FSM.isRequired(me.subconcept))) {
	    //	cell.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
	    //}
	    
		//cell.getControl().setCursor(new Cursor(cell.getControl().getDisplay(), SWT.CURSOR));		
		
		super.update(cell);
	}
	
	/*
	public String getText(Object obj) {
		if (obj instanceof NUOPCModelElem) {
			NUOPCModelElem me = (NUOPCModelElem) obj;
			
			String card = "";
			if (me.eref != null) {
				if (me.eref.getLowerBound() == 1 && me.eref.getUpperBound() == 1) {
					card = "[1] ";
				}
				else {
					card = "[" + me.eref.getLowerBound() + ".." + (me.eref.getUpperBound() < 0 ? "*" : me.eref.getUpperBound()) + "] ";
				}
			}
			
			if (me.nameLabel != null) {
				return me.typeLabel + " (" + me.nameLabel + ")";
			}
			else {
				return card + me.typeLabel;
			}
		}
		else {
			return "UNKNOWN";
		}
	}
	*/
	
	public static ImageDescriptor getFortranImageDescriptor() {
		String imageKey = null;
		String bottomOverlayKey = null;
		String topOverlayKey = null;
		int SWT_PROPS = 0;

		imageKey = "subroutine.gif";
		
		/*
		if (mapping instanceof Subroutine) {
			imageKey = "subroutine.gif";
		}
		else if (mapping instanceof Module) {
			imageKey = "module.gif";
		}
		else if (mapping instanceof Call) {
			//imageKey = "subroutine.gif";
			//topOverlayKey = "caller_overlay.gif";
			imageKey = "callarrow.gif";
		}
		//else if (mapping instanceof Uses) {
		//	imageKey = "import_obj.gif";
		//}
		else if (mapping instanceof UsesModule) {
			imageKey = "import.png";
		}
		else if (mapping instanceof UsesEntity) {
			imageKey = "import_obj.gif";
		}
		else if (mapping instanceof VariableDeclaration) {
			imageKey = "localvariable.gif";
		}
		*/
		
		/*
		if (soa.getCardinality()!= null && soa.getCardinality().isOneOrMore()) {
			bottomOverlayKey = "question_overlay.gif";						
		}
		else {
			bottomOverlayKey = "add_overlay.gif";
		}
		*/
			
		if (imageKey != null) {		
			return getImageDescriptor(imageKey, topOverlayKey, bottomOverlayKey, SWT_PROPS);			
		}
		else {
			return null;
		}
		
	}
	
	
	private static Bundle MY_BUNDLE = FrameworkUtil.getBundle(NUOPCViewLabelProvider2.class);
	
	private static ImageDescriptor getImageDescriptor(String file, String topOverlay, String bottomOverlay, int SWT_PROPS) {
	    //URL url = FileLocator.find(MY_BUNDLE, new Path("icons/" + file), null);
	    //ImageDescriptor image = ImageDescriptor.createFromURL(url);
	    ImageDescriptor image = CupidActivator.getImageDescriptor("icons/" + file);
		if (SWT_PROPS > 0) {
	    	image = ImageDescriptor.createWithFlags(image, SWT_PROPS);
	    }
	    
	    ImageDescriptor overlayArray[] = new ImageDescriptor[5];
	    
	    if (topOverlay != null) {
	    	URL overlayURL = FileLocator.find(MY_BUNDLE, new Path("icons/" + topOverlay), null);
	    	overlayArray[0] = ImageDescriptor.createFromURL(overlayURL);
	    }
	    
	    if (bottomOverlay != null) {
	    	URL overlayURL = FileLocator.find(MY_BUNDLE, new Path("icons/" + bottomOverlay), null);
	    	overlayArray[3] = ImageDescriptor.createFromURL(overlayURL);	    	
	    }
	    
	    if (topOverlay != null || bottomOverlay != null) {
	    	DecorationOverlayIcon decorationOverlayIcon = 
	    			new DecorationOverlayIcon(image.createImage(), overlayArray);
	    	//return decorationOverlayIcon.createImage();
	    	return decorationOverlayIcon;
	    }
	    else {
	    	//return image.createImage();
	    	return image;
	    }
	  } 

	/*
	private static Image decorateImage(Image image) {
		ImageDescriptor image = ImageDescriptor.createFromURL(url);
		
		DecorationOverlayIcon decorationOverlayIcon = new DecorationOverlayIcon(image,
			      SImageRegistry.getImageDescriptor(SImageConstants.primary_key), IDecoration.TOP_LEFT);
			    return decorationOverlayIcon.createImage();	
	}
	*/
	
	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		//System.out.println("isLabelProperty: " + element + " : " + property);
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}

	/*
	public Image getColumnImage(Object element, int columnIndex) {
		//System.out.println("getColumnImage: " + columnIndex + " : " + element);
		if (columnIndex == 0) {
			return getImage(element);
		}
		else {
			return null;
		}
	}

	public String getColumnText(Object element, int columnIndex) {
		//System.out.println("getColumnText: " + columnIndex + " : " + element);
		if (columnIndex == 0) {
			return getText(element);
		}
		else {
			if (element instanceof NUOPCModelElem) {
				if (((NUOPCModelElem) element).eref != null) {
					return Regex.getDocFromAnnotation(((NUOPCModelElem) element).eref.getEType());
				}
			}
		}
		return null;
	}
	*/
	
}