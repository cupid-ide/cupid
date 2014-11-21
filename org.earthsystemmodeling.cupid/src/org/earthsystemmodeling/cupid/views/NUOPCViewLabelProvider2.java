package org.earthsystemmodeling.cupid.views;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.Name;
import org.earthsystemmodeling.cupid.annotation.Prop;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.views.NUOPCViewContentProvider2.CodeConceptProxy;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.widgets.Display;
import org.jdom.Element;
import org.jdom.input.DOMBuilder;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

class NUOPCViewLabelProvider2 extends StyledCellLabelProvider { //implements ITableLabelProvider {

	private NUOPCViewContentProvider2 contentProvider;
	private org.jdom.Document docXML;
	
	public NUOPCViewLabelProvider2(NUOPCViewContentProvider2 contentProvider) {
		this.contentProvider = contentProvider;
		loadDocXML();
	}
	
	private void loadDocXML() {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			InputStream is = CupidActivator.getInputStream("nuopcdocs/nuopc7.xml");
			if (is == null) {
				return;
			}
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(is);
			is.close();
			
			DOMBuilder domBuilder = new DOMBuilder();
			docXML = domBuilder.build(doc);
		}
		catch (ParserConfigurationException | SAXException | IOException e) {
			CupidActivator.log("Error loading doc XML", e);
		}
	}
	
	@Override
	public String getToolTipText(Object element) {
		
		if (CupidActivator.getDefault().isDebugging()) {
			loadDocXML(); //reload every time when debugging
		}
		
		CodeConceptProxy ccp = (CodeConceptProxy) element;
		final String className = ccp.clazz.getCanonicalName();
		StringBuffer buf = new StringBuffer();
		
		//display any properties first
		if (ccp.codeConcept != null) {
			for (Field field : ccp.clazz.getFields()) {
				Prop propAnn = field.getAnnotation(Prop.class);
				if (propAnn != null) {
					Object propVal = null;
					try {
						propVal = field.get(ccp.codeConcept);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						//ignore
					}
					Label labAnn = field.getAnnotation(Label.class);
					if (labAnn != null) {
						buf.append("<b>" + labAnn.label() + ": </b>");
					}
					else {
						buf.append("<b>" + field.getName() + ": </b>");
					}
					buf.append(propVal + "<br/><br/>");
				}
			}
		}
		
		if (docXML != null) {
			List<Element> xmlElems = docXML.getRootElement().getChildren("doc");
			for (Element xmlElem : xmlElems) {
				if (xmlElem.getAttributeValue("class").equals(className)) {
					buf.append(xmlElem.getTextTrim());
				}
			}			
		}
		
		if (buf.length() > 0) {
			return buf.toString();
		}
		else {
			return null;
		}
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
	
		Object element = cell.getElement();		
	    StyledString text = new StyledString();	
	    	    
	   
	    StyledString.Styler grayStyler = new StyledString.Styler() {			
			@Override
			public void applyStyles(TextStyle textStyle) {
				if (textStyle instanceof StyleRange) {
					StyleRange sr = (StyleRange) textStyle;
					//sr.fontStyle = SWT.NORMAL;
					sr.foreground = Display.getCurrent().getSystemColor(SWT.COLOR_GRAY);
					//sr.font = null;
					//sr.fontStyle
					//sr.borderStyle = SWT.BORDER_DOT;
					//sr.underline = true;
				}
				
			}						
		};
		
		StyledString.Styler redStyler = new StyledString.Styler() {			
			@Override
			public void applyStyles(TextStyle textStyle) {
				if (textStyle instanceof StyleRange) {
					StyleRange sr = (StyleRange) textStyle;
					sr.foreground = Display.getCurrent().getSystemColor(SWT.COLOR_RED);	
				}
			}						
		};
		
	    ImageDescriptor icon = null;
	    	   
    	CodeConceptProxy proxy = (CodeConceptProxy) element;
    	if (cell.getColumnIndex()==0) {
    		if (proxy.codeConcept == null) {
    			if (proxy.min==0) {
    				text.append(proxy.label, grayStyler);
    			}
    			else {
    				text.append(proxy.label, redStyler);
    			}
    			icon = getFortranImageDescriptor(proxy.type, SWT.IMAGE_GRAY);
    		}
    		else {
    			text.append(proxy.label);
    			icon = getFortranImageDescriptor(proxy.type);
    		}
    		if (! (proxy.min==1 && proxy.max==1)) {
    			String maxString = Integer.toString(proxy.max);
    			if (proxy.max == -1) {
    				maxString = "n";
    			}
    			text.append(" [" + proxy.min + ".." + maxString + "]");
    		}
    	}
    	else {
    		
    		String value = null;
    		if (proxy.codeConcept != null) {
	    		//first try name method
    			value = proxy.codeConcept.name();
    			
    			//then look for annotation
    			if (value == null) {
	    			for (Field field : proxy.clazz.getFields()) {
						if (field.getAnnotation(Name.class) != null) {
							try {
								value = (String) field.get(proxy.codeConcept);
								break; //assume one name for now
							} catch (IllegalArgumentException | IllegalAccessException e) {
								//ignore
							}
						}
					}
    			}
    			
    		}
    		
    		if (value == null) {
    			value = "";
    		}
    		
    		text.append(value);
    	}
	    	
	    
	    cell.setText(text.toString());
	    cell.setStyleRanges(text.getStyleRanges());
	    
	    if (icon != null) {
			cell.setImage(icon.createImage());
		}
	    
	    //simple constraint check
	    //if (proxy.codeConcept==null && proxy.min==1) {
	    //	cell.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
	    //}
	    
	    //if (me.validationMessage != null || (me.elem==null && !me.subconcept.isAttrib() && FSM.isRequired(me.subconcept))) {
	    //	cell.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
	    //}
	    
		//cell.getControl().setCursor(new Cursor(cell.getControl().getDisplay(), SWT.CURSOR));		
		
		super.update(cell);
	}
	
	private String stripQuotes(String s) {
		if (s.startsWith("'") && s.endsWith("'")) {
			return s.substring(1, s.length()-1);
		}
		return s;
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
	
	public static ImageDescriptor getFortranImageDescriptor(String type) {
		return getFortranImageDescriptor(type, 0);
	}
	
	public static ImageDescriptor getFortranImageDescriptor(String type, int SWT_PROPS) {
		
		if (type == null) {
			return null;
		}
		
		String imageKey = null;
		String bottomOverlayKey = null;
		String topOverlayKey = null;
				
		Map<String,String> iconMap = new HashMap<String,String>();
		iconMap.put("subroutine", "subroutine.gif");
		iconMap.put("module", "module.gif");
		iconMap.put("uses", "import.png");
		iconMap.put("call", "runtoline.gif");
		
		imageKey = iconMap.get(type);
		
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
		
		return null;
		
		
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
	    	return decorationOverlayIcon;
	    }
	    else {
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