package org.earthsystemmodeling.cupid.template.core;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
import org.earthsystemmodeling.cupid.template.core.ProtexStore.ProtexAPI;
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

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

public class ProtexStore {

	private static ProtexStore instance;
	private static String PROTEX_STORE_KEY = "org.earthsystemmodeling.cupid.protex";
	private IPreferenceStore prefStore;
	
	private Map<Template, ProtexAPI> templateToAPI;
	private Map<String, ProtexAPI> protexAPICache;
	
	public static ProtexStore getInstance() {
		if (instance==null)
			instance=new ProtexStore();
		return instance;
	}
	
	protected ProtexStore() {
		prefStore = Activator.getDefault().getPreferenceStore();
		templateToAPI = new HashMap<Template, ProtexAPI>();
		protexAPICache = new HashMap<String, ProtexAPI>();
	}
	
	public List<String> listAPIs() {
		String apiListString = prefStore.getString(PROTEX_STORE_KEY);
		return Splitter.on("|").splitToList(apiListString);
	}
	
	private void addAPIToList(String apiid) {
		List<String> apis = listAPIs();
		if (!apis.contains(apiid)) {
			List<String> newList = new ArrayList<String>(apis);
			newList.add(apiid);
			String toStore = Joiner.on("|").join(newList);
			prefStore.setValue(PROTEX_STORE_KEY, toStore);
		}	
	}
	
	public void save(ProtexAPI api) {
		StringWriter writer = new StringWriter();
		api.serialize(new StreamResult(writer));	
		prefStore.setValue(getBaseKey(api.getAPIID()), writer.toString());
		addAPIToList(api.getAPIID());
		protexAPICache.remove(api.getAPIID());
	}
	
	public ProtexAPI load(String apiid) {
		String id = getBaseKey(apiid);
		String xml = prefStore.getString(id);		
		if (xml != null) {
			ProtexAPI api = new ProtexAPI(apiid);
			api.deserialize(new InputSource(new StringReader(xml)));
			protexAPICache.put(apiid, api);
			return api;
		}
		else {
			return null;
		}		
	}
	
	private String getBaseKey(String apiid) {
		return "protexapi." + apiid;
	}
	
	public Template[] getTemplatesFromActiveAPIs(String contextTypeId) {
		//for now, collect all templates for all Protex APIs
		templateToAPI.clear();
		List<Template> templateList = new ArrayList<Template>();
		for (String apiid : listAPIs()) {
			ProtexAPI protexAPI;
			if (protexAPICache.containsKey(apiid)) {
				protexAPI = protexAPICache.get(apiid);
			}
			else {
				protexAPI = load(apiid);
			}
			for (Template t: protexAPI.getTemplates(contextTypeId)) {
				templateList.add(t);
				templateToAPI.put(t, protexAPI);
			}
		}
		templateList.sort(new Comparator<Template>() {
			@Override
			public int compare(Template o1, Template o2) {
				return o1.getName().compareTo(o2.getName());
			}		
		});
		return templateList.toArray(new Template[templateList.size()]);
	}
	
	public Subroutine getSubroutineForTemplate(Template t) {
		return templateToAPI.get(t).getSubroutineForTemplate(t);
	}
	
	/* represents a set of API methods parsed through Protex */
	public static class ProtexAPI {
		
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
