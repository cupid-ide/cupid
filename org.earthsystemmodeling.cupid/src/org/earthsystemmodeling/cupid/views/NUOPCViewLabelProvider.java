package org.earthsystemmodeling.cupid.views;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.earthsystemmodeling.cupid.annotation.Doc;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.Name;
import org.earthsystemmodeling.cupid.annotation.Prop;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.ReverseEngineerException;
import org.earthsystemmodeling.cupid.preferences.CupidPreferencePage;
import org.earthsystemmodeling.cupid.views.NUOPCViewContentProvider.CodeConceptProxy;
import org.eclipse.cdt.internal.ui.viewsupport.AsyncTreeWorkInProgressNode;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.jdom.input.DOMBuilder;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

class NUOPCViewLabelProvider extends StyledCellLabelProvider { //implements ITableLabelProvider {

	private org.jdom.Document docXML;
	private static final String NUOPC_DOC_FILE = null; //"nuopcdocs/nuopc_v7bs59.xml"
	private static final String NUOPC_REFDOC_BASEURL = "nuopcdocs/html/indexcupid.html";
	
	public NUOPCViewLabelProvider() {
		loadDocXML();
	}
	
	private void loadDocXML() {
		
		if (NUOPC_DOC_FILE == null) return;
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			InputStream is = CupidActivator.getInputStream(NUOPC_DOC_FILE);
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
			CupidActivator.log("Error loading NUOPC doc XML", e);
		}
	}
	
	public static String getNUOPCDoc(CodeConceptProxy ccp) {
		
		//first see if there is a Doc annotation
		Doc docAnn = ccp.clazz.getAnnotation(Doc.class);
		if (docAnn != null) {
			
			String baseURL = "";
			boolean useInternal = false; //CupidActivator.getDefault().getPreferenceStore().getBoolean(CupidPreferencePage.CUPID_REFDOC_USEINTERNAL);
			if (useInternal) {
				URL internalURL = CupidActivator.getFileURL(NUOPC_REFDOC_BASEURL);
				if (internalURL != null) {
					baseURL = internalURL.toExternalForm();
				}
				else {
					CupidActivator.log(Status.ERROR, "Internal base URL of NUOPC docs does not exist: " + NUOPC_REFDOC_BASEURL);
					return null;
				}
			}
			else {
				baseURL = CupidActivator.getDefault().getPreferenceStore().getString(CupidPreferencePage.CUPID_REFDOC_URL);
				if (baseURL == null || baseURL.length()==0) {
					baseURL = CupidActivator.getDefault().getPreferenceStore().getDefaultString(CupidPreferencePage.CUPID_REFDOC_URL);  
				}
			}

			//CupidActivator.debug("ref doc URL = " + baseURL+docAnn.urlfrag());
			return baseURL + docAnn.urlfrag();
		}
		
		return null;
		
		/*
		if (docXML == null || CupidActivator.getDefault().isDebugging()) {
			loadDocXML(); //reload every time when debugging
		}
		final String className = ccp.clazz.getCanonicalName();
		StringBuffer buf = new StringBuffer();
		//TODO: introduce cacheing for below
		if (docXML != null) {
			@SuppressWarnings("unchecked")
			List<Element> xmlElems = docXML.getRootElement().getChildren("doc");
			for (Element xmlElem : xmlElems) {
				String[] classlist = xmlElem.getAttributeValue("class").split(" ");
				for (int i=0; i<classlist.length; i++) {
					if (classlist[i].equals(className)) {
						if (xmlElem.getAttributeValue("url") != null) {
							buf.append(xmlElem.getAttributeValue("url"));
						}
						else {
							XMLOutputter outputter = new XMLOutputter();
							buf.append(outputter.outputString(xmlElem.getContent()));
						}
					}
				}
			}			
		}
		if (buf.length() > 0) {
			return buf.toString();
		}
		else {
			return null;
		}
		*/
	}
	
	@Override
	public String getToolTipText(Object element) {
		
		if (!(element instanceof CodeConceptProxy)) {
			return null;
		}
		
		CodeConceptProxy ccp = (CodeConceptProxy) element;
		//final String className = ccp.clazz.getCanonicalName();
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
					if (propVal != null) {
						buf.append("<div class=\"content\"><div class=\"main\">");
						Label labAnn = field.getAnnotation(Label.class);
						if (labAnn != null) {
							buf.append("<b>" + labAnn.label() + ": </b>");
						}
						else {
							buf.append("<b>" + field.getName() + ": </b>");
						}
						buf.append(propVal + "</div></div>");
					}
				}
			}
		}
		
		String doc = getNUOPCDoc(ccp);
		if (doc != null  && !doc.startsWith("http") && !doc.startsWith("file:")) {
			buf.append(doc);
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
	
	//TODO: this is inefficient, could introduce cacheing, etc.
	/*
	private boolean existsInvalidDescendant(CodeConceptProxy ccp) {
		Object[] children = contentProvider.getChildren(ccp);
		for (Object child : children) {
			CodeConceptProxy c = (CodeConceptProxy) child;
			if (c.codeConcept==null && c.min>0) {
				return true;
			}
			else if (c.codeConcept==null) {  //in this case, the concept is not required
				return false;
			}
			else if (existsInvalidDescendant(c)) {
				return true;
			}
		}
		return false;
	}
	*/
	
	/*
	private boolean hasOptionalAscendant(ViewerCell cell) {
		
		ViewerCell parentElem = cell.getNeighbor(ViewerCell.ABOVE, false);
		if (parentElem != null) {
			CodeConceptProxy parentCCP = (CodeConceptProxy) parentElem.getElement();
			if (parentCCP.min==0) {
				return true;
			}
			else {
				return hasOptionalAscendant(parentElem);
			}
		}
		else {
			return false;
		}
				
	}
	*/
	
	//boolean grayState = false;
	
	
	
	@Override
	public void update(final ViewerCell cell) {
	
		Object element = cell.getElement();
		
		if (element instanceof ReverseEngineerException) {
	    	if (cell.getColumnIndex()==0) {
	    		cell.setText("The current file in the editor\ncould not be reverse engineered.\nPlease re-save the file\nand it will be parsed again.");
	    		super.update(cell);
	    	}
	    	return;
	    }
	    
	    if (element instanceof String) {
	    	if (cell.getColumnIndex()==0) {
	    		cell.setText(element.toString());
	    		super.update(cell);
	    	}
	    	return;
	    }
	    
	    if (element instanceof AsyncTreeWorkInProgressNode) {
	    	if (cell.getColumnIndex()==0) {
	    		cell.setText("Working...");
	    		super.update(cell);
	    	}
	    	return;
	    }
		
		
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
    			//TODO: the styles below are not being applied since Mars release
    			if (proxy.min==0) {
    				text.append(proxy.label, grayStyler);
    				cell.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY));  
    			}
    			else {
    				text.append(proxy.label, redStyler);
    				cell.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
    			}
    			icon = getFortranImageDescriptor(proxy.type, SWT.IMAGE_GRAY);
    		}
    		else if (!proxy.codeConcept.validate(new ArrayList<String>())) {
    			text.append(proxy.label, redStyler);
				cell.setForeground(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
				icon = getFortranImageDescriptor(proxy.type);				
    		}
    		else {  //present and valid   			
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
	
	/*
	@Override
	protected void measure(Event event, Object element) {
		// TODO Auto-generated method stub
		super.measure(event, element);
		event.height = 15;
	}
	*/
			
	/*
	private String stripQuotes(String s) {
		if (s.startsWith("'") && s.endsWith("'")) {
			return s.substring(1, s.length()-1);
		}
		return s;
	}
	*/
	
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
		iconMap.put("subroutine-inherited", "subroutine.gif");
		iconMap.put("module", "module.gif");
		iconMap.put("uses", "import.png");
		iconMap.put("call", "runtoline.gif");
		
		Map<String,String> bottomOverlayMap = new HashMap<String,String>();
		bottomOverlayMap.put("subroutine-inherited", "over_co.gif");
		
		imageKey = iconMap.get(type);
		bottomOverlayKey = bottomOverlayMap.get(type);
				
		if (imageKey != null) {		
			return getImageDescriptor(imageKey, topOverlayKey, bottomOverlayKey, SWT_PROPS);			
		}
		
		return null;
				
	}
	
	
	private static Bundle MY_BUNDLE = FrameworkUtil.getBundle(NUOPCViewLabelProvider.class);
	
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