package org.earthsystemmodeling.cupid.template.core;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.template.Activator;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.templates.Template;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ProtexStore {

	private static ProtexStore instance;
	private List<Subroutine> subroutines;
	private Map<Template,Subroutine> templateToSubroutine;
	private List<Template> templates;
	
	public static ProtexStore getInstance() {
		if (instance==null)
			instance=new ProtexStore();
		return instance;
	}
	
	protected ProtexStore() {
		subroutines = new ArrayList<Subroutine>();
		templateToSubroutine = new HashMap<Template,Subroutine>();
		templates = new ArrayList<Template>();
	}
	
	public void addSubroutine(Subroutine toAdd) {
		subroutines.add(toAdd);
	}
	
	public void clear() {
		subroutines.clear();
		templateToSubroutine.clear();
		templates.clear();
	}
	
	public void save() {
		StringWriter writer = new StringWriter();
		serialize(new StreamResult(writer));
		//System.out.println(writer.toString());
		IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
		prefStore.setValue("org.earthsystemmodeling.cupid.protex", writer.toString());
	}
	
	public void load() {
		IPreferenceStore prefStore = Activator.getDefault().getPreferenceStore();
		String xml = prefStore.getString("org.earthsystemmodeling.cupid.protex");
		deserialize(new InputSource(new StringReader(xml)));
	}
	
	private void serialize(StreamResult result) {
		
		try {
			DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
			DocumentBuilder builder= factory.newDocumentBuilder();
			Document document= builder.newDocument();

			Node root= document.createElement("protex");
			document.appendChild(root);

			for (Subroutine s : subroutines) {
				
				Node node = document.createElement("subroutine");
				root.appendChild(node);
				NamedNodeMap attributes= node.getAttributes();
				
				Attr name = document.createAttribute("name");
				name.setValue(s.name);
				attributes.setNamedItem(name);
				
				Attr iface = document.createAttribute("iface");
				iface.setValue(s.iface);
				attributes.setNamedItem(iface);
				
				Attr shortDesc = document.createAttribute("shortDesc");
				shortDesc.setValue(s.shortDesc);
				attributes.setNamedItem(shortDesc);
				
				Attr paramText = document.createAttribute("paramText");
				paramText.setValue(s.paramText);
				attributes.setNamedItem(paramText);
				
				Attr longDesc = document.createAttribute("longDesc");
				longDesc.setValue(s.longDesc);
				attributes.setNamedItem(longDesc);
				
				for (Parameter p : s.params) {
					Node paramNode = document.createElement("param");
					node.appendChild(paramNode);
					NamedNodeMap pattributes= paramNode.getAttributes();
					
					Attr pname = document.createAttribute("name");
					pname.setValue(p.name);
					pattributes.setNamedItem(pname);
					
					Attr ptype = document.createAttribute("type");
					ptype.setValue(p.type);
					pattributes.setNamedItem(ptype);
					
					//TODO: rest of parameter info
				}
				
			}
			
			//if (template != null) {
			//	Text pattern= document.createTextNode(validateXML(template.getPattern()));
			//	node.appendChild(pattern);
			
			Transformer transformer=TransformerFactory.newInstance().newTransformer();
			transformer.setOutputProperty(OutputKeys.METHOD, "xml"); //$NON-NLS-1$
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8"); //$NON-NLS-1$
			DOMSource source = new DOMSource(document);

			transformer.transform(source, result);

		} catch (ParserConfigurationException | TransformerConfigurationException | TransformerFactoryConfigurationError e) {
			CupidActivator.log("Error configuring parser or transformed", e);
		} catch (TransformerException e) {
			CupidActivator.log("Error serializing Protex", e);
		} 
		
	}
	
	private void deserialize(InputSource source) {
		
		try {
			
			DocumentBuilderFactory factory= DocumentBuilderFactory.newInstance();
			DocumentBuilder parser= factory.newDocumentBuilder();
			parser.setErrorHandler(new DefaultHandler());
			Document document= parser.parse(source);

			NodeList elements= document.getElementsByTagName("subroutine");

			int count= elements.getLength();
			for (int i= 0; i != count; i++) {
				Node node= elements.item(i);
				NamedNodeMap attributes= node.getAttributes();

				if (attributes == null)
					continue;

				Subroutine s = new Subroutine();
				s.name = getNamedString(attributes, "name");
				s.iface = getNamedString(attributes, "iface");
				s.shortDesc = getNamedString(attributes, "shortDesc");
				s.longDesc = getNamedString(attributes, "longDesc");
				s.paramText = getNamedString(attributes, "paramText");
				
				NodeList children = node.getChildNodes();
				for (int j= 0; j != children.getLength(); j++) {
					Node child = children.item(j);
					if (child.getNodeName().equals("param")) {
						NamedNodeMap pattributes= child.getAttributes();
						Parameter p = new Parameter();
						p.name = getNamedString(pattributes, "name");
						p.type = getNamedString(pattributes, "type");
						//TODO: rest of parameter info
						s.addParameter(p);
					}
				}
				
				addSubroutine(s);		
				
			}
	
		} catch (ParserConfigurationException e) {
			CupidActivator.log("Error instantiating XML parser", e);
		} catch (IOException | SAXException e) {
			CupidActivator.log("Error parsing Protex XML", e);
		} 
	
	}
	
	private String getNamedString(NamedNodeMap attributes, String name) {
		if (attributes.getNamedItem(name) != null) {
			return attributes.getNamedItem(name).getNodeValue();
		}
		return null;
	}
	
	protected void makeTemplates(String contextTypeId) {
		for (Subroutine s : subroutines) {
			Template t = new Template(s.iface, s.shortDesc, contextTypeId, s.iface+"(...)", true);
			templates.add(t);
			templateToSubroutine.put(t, s);
		}
		templates.sort(new Comparator<Template>() {
			@Override
			public int compare(Template o1, Template o2) {
				return o1.getName().compareTo(o2.getName());
			}		
		});
	}
	
	public Template[] getTemplates(String contextTypeId) {
		if (templates.size()==0) {
			makeTemplates(contextTypeId);
		}
		return templates.toArray(new Template[templates.size()]);
	}
	
	public String getAdditionalInfo(Template t) {
		Subroutine s = templateToSubroutine.get(t);
		if (s != null) {
			return s.paramText.replaceAll("\n", "<br/>\n") + "<br/><br/>" + s.longDesc;
		}
		return null;
	}
	
	
	public static class Subroutine {
		public String name;
		public String iface;
		public String shortDesc;
		public String longDesc;
		public String paramText;
		public List<Parameter> params;
		
		public String toString() {
			String name = this.name==null ? "NULL" : this.name;
			String iface = this.iface==null ? "NULL" : this.iface;
			String shortDesc = this.shortDesc==null ? "NULL" : this.shortDesc;
			//String longDesc = this.longDesc==null ? "NULL" : this.longDesc;		
			
			String s = "Subroutine: name=" + name + ", iface=" + iface + ", shortDesc=" + shortDesc;
			for (Parameter p : params) {
				s += "\n\t==>" + p.toString();
			}
			return s;
		}
		
		public void addParameter(Parameter p) {
			if (params == null) params = new ArrayList<Parameter>();
			params.add(p);
		}
	}
	
	public static class Parameter {
		public String name;
		public String type;
		public boolean optional;
		public boolean intentIn;
		public boolean intentOut;
		public String toString() {
			return "Param: name="+name+", type="+type+", optional="+optional+", intentIn="+intentIn+", intentOut="+intentOut;
		}
	}
	
}
