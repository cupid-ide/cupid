package org.earthsystemmodeling.cupid.views;

import java.net.URL;

import org.earthsystemmodeling.FSM;
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

class NUOPCViewLabelProvider extends StyledCellLabelProvider { //implements ITableLabelProvider {

	private FSM<?> fsm;
	
	public void setFSM(FSM<?> fsm) {
		this.fsm = fsm;
	}
	
	@Override
	public String getToolTipText(Object element) {
		NUOPCModelElem me = (NUOPCModelElem) element;
		
		String docText = null;
		if (me.subconcept != null) {
			if (me.subconcept.isReference()) {
				docText = fsm.getAnnotationValue(me.subconcept.getRef(), "doc");
			}
			else if (!me.subconcept.isAttrib()) {
				docText = fsm.getAnnotationValue(me.subconcept.getDef(), "doc");
			}
			else if (me.subconcept.isAttrib()) {
				docText = fsm.getAnnotationValue(me.subconcept, "doc");
			}
		}
		else if (me.elem != null) {
			docText = fsm.getAnnotationValue(fsm.getConceptDef(me.elem), "doc");
		}
		
		if (docText == null) docText = "";	
			
		if (me.validationMessage != null) {
			docText = "<b>" + me.validationMessage + "</b><hr/><br/>" + docText;
		}
		
		/*
		if (docText != null || me.validationMessage != null) {		
			ST text = new ST("<doc; wrap=\"\n\", separator=\" \">");				
			if (me.validationMessage != null) {
				text.add("doc", me.validationMessage.split(" "));
			}
			if (me.validationMessage != null && docText != null) {
				text.add("doc", "\n\n------------------------------------------------------------\n\n");
			}
			if (docText != null) {
				text.add("doc", docText.split(" "));				
			}				   
			return text.render(80);
		}
		*/			
		
		if (docText.length() > 0) return docText;
		else return null;
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
	    
		//text.s
		
	    if (cell.getColumnIndex() == 0) {
			
	    	/*
	    	if (me.structuralFeature != null && me.elem == null) {
				if (me.structuralFeature.getLowerBound() == 1 && me.structuralFeature.getUpperBound() == 1) {
					text.append("[1] ", StyledString.COUNTER_STYLER);
				}
				else {
					text.append("[" + me.structuralFeature.getLowerBound() + ".." + (me.structuralFeature.getUpperBound() < 0 ? "*" : me.structuralFeature.getUpperBound()) + "] ", StyledString.COUNTER_STYLER);
				}
			}
			*/
	    	
			
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
			ImageDescriptor id = getFortranImageDescriptor(me.subconcept, me.elem, me.validationMessage);
			if (id != null) {
				cell.setImage(id.createImage());
			}
			
	    }
	    else {
	    	if (me.nameLabel != null) {
	    		text.append(me.nameLabel);
	    	}
	    	//cell.setImage(getFortranImage(me));
	    }
	    
	    cell.setText(text.toString());
	    cell.setStyleRanges(text.getStyleRanges());
	    
	    if (me.validationMessage != null || (me.elem==null && !me.subconcept.isAttrib() && FSM.isRequired(me.subconcept))) {
	    	cell.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
	    }
	    
		//cell.getControl().addM
		//cell.getControl().setCursor(new Cursor(cell.getControl().getDisplay(), SWT.CURSOR));		
		
		//cell.getControl().
		
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
	
	public static ImageDescriptor getFortranImageDescriptor(SubconceptOrAttribute soa, Object elem, String validationMessage) {
		String imageKey = null;
		String bottomOverlayKey = null;
		String topOverlayKey = null;
		int SWT_PROPS = 0;
		
		Mapping explicitContextMapping = null;
		if (soa != null) {
			if (soa.isAttrib()) {
				explicitContextMapping = soa.getAttribMapping();
			}
			else {
				if (soa.isReference()) {
					explicitContextMapping = soa.getRef().getMapping();
				}
				else {
					explicitContextMapping = soa.getDef().getMapping();
				}
			}
		}
		
		ImplicitContextMapping mapping = null;
		if (explicitContextMapping != null) {
			mapping = explicitContextMapping.getMapping();
		}
				
		if (mapping != null) {
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
		}
		//else if (soa != null && !soa.isAttrib()) {
		//	imageKey = "blank.png";
		//}
				
					
		if (soa != null && !soa.isAttrib() && elem == null) {
			
			//gray indicates that it does not yet exist
			SWT_PROPS = SWT.IMAGE_GRAY;
			
			if (soa.getCardinality()!= null && soa.getCardinality().isOneOrMore()) {
				bottomOverlayKey = "question_overlay.gif";						
			}
			else {
				bottomOverlayKey = "add_overlay.gif";
			}
		}
			
			//validation to determine overlay
			if (elem != null && validationMessage != null) {
			//	//TODO: probably don't want to re-validate the entire tree each time
			//	Diagnostic diagnostic = Diagnostician.INSTANCE.validate(elem);
			//	if (diagnostic.getSeverity() != Diagnostic.OK) {
			       	bottomOverlayKey = "error_overlay.gif";
			  //  }
			//	
			}
			//else if (me.eref != null) {			
			//	overlayKey = "question_overlay.gif";
			//	if (me.eref.getLowerBound() > 0) {
			//		//SWT_PROPS = SWT.IMAGE_GRAY;
			//	}
			//	else {
			//		//SWT_PROPS = SWT.IMAGE_GRAY;
			//	}
			//}
			
		//}
		if (imageKey != null) {		
			return getImageDescriptor(imageKey, topOverlayKey, bottomOverlayKey, SWT_PROPS);			
		}
		return null;
	}
		
	/*
	public ImageDescriptor getValidationImageDescriptor(Object obj) {
		String imageKey = null;
		if (obj instanceof NUOPCModelElem) {
			NUOPCModelElem me = (NUOPCModelElem) obj;
			
			if (me.elem != null) {
				//imageKey = Regex.getFromAnnotation(me.elem.eClass(), "icon");
				Diagnostic diagnostic = Diagnostician.INSTANCE.validate(me.elem);
				//diagnostic.
			    if (diagnostic.getSeverity() == Diagnostic.OK) {
			       	//imageKey = "tick.png";
			    }
			    else {
			    	imageKey = "error_overlay.gif";
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
		//if (imageKey != null) {		
		//	return getImageFromName(imageKey);			
		//}
		return imageKey;
		//else {
		//	return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT);
		//}
	}
	*/
	
	//public Object getImage(String key) throws IOException {
     // URL url = new URL(getBaseURL() + "icons/" + key + extensionFor(key));
     // ImageDescriptor.createFromURL(url).
      //InputStream inputStream = url.openStream(); 
      //inputStream.close();
     // return url;
   // }
	
	//private static Image getImage(String file) {
	//	return getImage(file, null, 0);
	//}
	
	private static Bundle MY_BUNDLE = FrameworkUtil.getBundle(NUOPCViewLabelProvider.class);
	
	private static ImageDescriptor getImageDescriptor(String file, String topOverlay, String bottomOverlay, int SWT_PROPS) {
	    URL url = FileLocator.find(MY_BUNDLE, new Path("icons/" + file), null);
	    ImageDescriptor image = ImageDescriptor.createFromURL(url);
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