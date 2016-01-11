package org.earthsystemmodeling.cupid.template.core;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.transform.stream.StreamResult;

import org.earthsystemmodeling.cupid.template.Activator;
import org.earthsystemmodeling.cupid.template.core.ProtexAPI.Subroutine;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.templates.Template;
import org.xml.sax.InputSource;

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
		if (apiListString.length() > 0) {
			return Splitter.on("|").splitToList(apiListString);
		}
		else {
			return new ArrayList<String>();
		}
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
	
	public void removeAPI(String apiid) {
		List<String> apis = listAPIs();
		if (apis.contains(apiid)) {
			List<String> newList = new ArrayList<String>(apis);
			newList.remove(apiid);
			String toStore = Joiner.on("|").join(newList);
			prefStore.setValue(PROTEX_STORE_KEY, toStore);
		}
		prefStore.setValue(getBaseKey(apiid), "");
	}
	
	public void activateAPI(String apiid) {
		String key = getBaseKey(apiid) + ".active";
		prefStore.setValue(key, true);
	}
	
	public void deactivateAPI(String apiid) {
		String key = getBaseKey(apiid) + ".active";
		prefStore.setValue(key, false);
	}
	
	public boolean isActiveAPI(String apiid) {
		return prefStore.getBoolean(getBaseKey(apiid)+".active");
	}
	
	public void save(ProtexAPI api) {
		StringWriter writer = new StringWriter();
		api.serialize(new StreamResult(writer));	
		prefStore.setValue(getBaseKey(api.getAPIID()), writer.toString());
		addAPIToList(api.getAPIID());
		String activeKey = getBaseKey(api.getAPIID()) + ".active";
		prefStore.setDefault(activeKey, true);
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
			if (isActiveAPI(apiid)) {
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
	
		
	
	
}
