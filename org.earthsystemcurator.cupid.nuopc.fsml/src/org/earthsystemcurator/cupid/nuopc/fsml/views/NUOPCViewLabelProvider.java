package org.earthsystemcurator.cupid.nuopc.fsml.views;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.earthsystemcurator.cupid.nuopc.fsml.util.Regex;
import org.earthsystemcurator.cupid.nuopc.fsml.views.NUOPCViewContentProvider.NUOPCModelElem;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

class NUOPCViewLabelProvider extends StyledCellLabelProvider { //implements ITableLabelProvider {

	@Override
	public void update(final ViewerCell cell) {
	
		NUOPCModelElem me = (NUOPCModelElem) cell.getElement();
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
	    if (cell.getColumnIndex() == 0) {
			if (me.eref != null && me.nameLabel == null) {
				if (me.eref.getLowerBound() == 1 && me.eref.getUpperBound() == 1) {
					text.append("[1] ", StyledString.COUNTER_STYLER);
				}
				else {
					text.append("[" + me.eref.getLowerBound() + ".." + (me.eref.getUpperBound() < 0 ? "*" : me.eref.getUpperBound()) + "] ", StyledString.COUNTER_STYLER);
				}
			}
			
			
			//if (me.nameLabel != null) {
			//	text.append(me.typeLabel + " (" + me.nameLabel + ")");
			//}
			//else {
				text.append(me.typeLabel);
				/*
				cell.getControl().addMouseListener(new MouseAdapter() {
	
					@Override
					public void mouseDoubleClick(MouseEvent e) {
						System.out.println("You double clicked: " + e.data);
					}
					
					
				});
				*/
			//}
			
			//cell.getControl().		
			//cell.setText(text.toString());
			cell.setImage(getObjectImage(me));
			
	    }
	    else {
	    	if (me.nameLabel != null) {
	    		text.append(me.nameLabel);
	    	}
	    	cell.setImage(getValidationImage(me));
	    }
	    
	    cell.setText(text.toString());
	    cell.setStyleRanges(text.getStyleRanges());
	    
		//cell.getControl().addM
		//cell.getControl().setCursor(new Cursor(cell.getControl().getDisplay(), SWT.CURSOR));		
		
		//cell.getControl().
		
		super.update(cell);
	}
	
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
	
	public Image getObjectImage(Object obj) {
		String imageKey = null;
		if (obj instanceof NUOPCModelElem) {
			NUOPCModelElem me = (NUOPCModelElem) obj;
			
			if (me.eref != null) {			
				imageKey = Regex.getFromAnnotation(me.eref.getEType(), "icon");
				
				if (imageKey == null) {
					String mappingType = Regex.getMappingTypeFromAnnotation(me.eref);
					if (mappingType != null) {
						if (mappingType.equalsIgnoreCase("module")) {
							imageKey = "module.gif";
						}
						else if (mappingType.equalsIgnoreCase("subroutine")) {
							imageKey = "subroutine.gif";
						}
						else if (mappingType.equalsIgnoreCase("call")) {
							imageKey = "call.gif";
						}
					}
				}
			}			
		}
		if (imageKey != null) {		
			return getImageFromName(imageKey);			
		}
		return null;
	}
	
	public Image getValidationImage(Object obj) {
		String imageKey = null;
		if (obj instanceof NUOPCModelElem) {
			NUOPCModelElem me = (NUOPCModelElem) obj;
			
			if (me.elem != null) {
				//imageKey = Regex.getFromAnnotation(me.elem.eClass(), "icon");
				Diagnostic diagnostic = Diagnostician.INSTANCE.validate(me.elem);
			    if (diagnostic.getSeverity() == Diagnostic.OK) {
			       	//imageKey = "tick.png";
			    }
			    else {
			    	imageKey = "error.gif";
			    }
			}
			else if (me.eref != null) {			
				//imageKey = Regex.getFromAnnotation(me.eref.getEType(), "iconAdd");
				if (me.eref.getLowerBound() > 0) {
					imageKey = "quickfix_error.gif";
				}
				else {
					imageKey = "quickfix_error.gif";
				}
			}			
		}
		if (imageKey != null) {		
			return getImageFromName(imageKey);			
		}
		return null;
		//else {
		//	return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		//}
	}
	
	//public Object getImage(String key) throws IOException {
     // URL url = new URL(getBaseURL() + "icons/" + key + extensionFor(key));
     // ImageDescriptor.createFromURL(url).
      //InputStream inputStream = url.openStream(); 
      //inputStream.close();
     // return url;
   // }
	
	private static Image getImageFromName(String file) {
	    Bundle bundle = FrameworkUtil.getBundle(NUOPCViewLabelProvider.class);
	    URL url = FileLocator.find(bundle, new Path("icons/" + file), null);
	    ImageDescriptor image = ImageDescriptor.createFromURL(url);
	    return image.createImage();
	  } 

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