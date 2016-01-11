package org.earthsystemmodeling.cupid.template.core;

import java.io.IOException;
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
import org.eclipse.jface.text.templates.Template;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ProtexAPI {

	private String apiid;
	private List<Subroutine> subroutines;
	private Map<Template,Subroutine> templateToSubroutine;
	private List<Template> templates;
	private Template[] templateCache = null;

	public ProtexAPI(String apiid) {
		this.apiid = apiid;
		subroutines = new ArrayList<Subroutine>();
		templateToSubroutine = new HashMap<Template,Subroutine>();
		templates = new ArrayList<Template>();
	}
	
	public String getAPIID() {
		return apiid;
	}
	
	public void addSubroutine(Subroutine toAdd) {
		subroutines.add(toAdd);
	}
	
	public String getAdditionalInfo(Template t) {
		Subroutine s = templateToSubroutine.get(t);
		if (s != null) {
			return "<b>Parameters:</b><br/><br/>" + s.paramText.replaceAll("\n", "<br/>\n") + "<br/><br/>" + s.longDesc;
		}
		return null;
	}
		
	public Subroutine getSubroutineForTemplate(Template t) {
		return templateToSubroutine.get(t);
	}
		
	public Template[] getTemplates(String contextTypeId) {			
		if (templateCache == null) {
			for (Subroutine s : subroutines) {
				Template t = makeTemplate(s, contextTypeId);			
				templates.add(t);
				templateToSubroutine.put(t, s);
			}
			templates.sort(new Comparator<Template>() {
				@Override
				public int compare(Template o1, Template o2) {
					return o1.getName().compareTo(o2.getName());
				}		
			});
			templateCache = new Template[templates.size()];
			templates.toArray(templateCache);
		}
		return templateCache;
	}
	
	
	private Template makeTemplate(Subroutine s, String contextTypeId) {
		StringBuffer pattern = new StringBuffer();
		if (s.iface != null) {
			pattern.append(s.iface);
		}
		else {
			pattern.append(s.name);
		}
		pattern.append("(");
		for (Parameter p : s.params) {
			pattern.append(p.name);
			pattern.append("=${");
			pattern.append(p.name);
			pattern.append("}, ");
		}
		if (s.params.size() > 0) {
			//chop last ","
			pattern.setLength(pattern.length()-2);
		}
		pattern.append(")");
		
		return new Template(s.iface, s.shortDesc, contextTypeId, pattern.toString(), true);
	}
	
	protected void serialize(StreamResult result) {

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
	
	protected void deserialize(InputSource source) {
		
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
