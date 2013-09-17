package org.earthsystemcurator.cupid.nuopc.fsml.util;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Regex {

	public static Map<String, Object> getMappingFromAnnotation(EStructuralFeature sf) {
		EAnnotation ann = sf.getEAnnotation("http://www.earthsystemcog.org/projects/nuopc");
		if (ann != null) {
			return parseMappingExpression(ann.getDetails().get("mapping"));			
		}
		else {
			return null;
		}		
	}
	
	public static boolean getIsEssentialFromAnnotation(EStructuralFeature sf) {
		EAnnotation ann = sf.getEAnnotation("http://www.earthsystemcog.org/projects/nuopc");
		if (ann != null) {
			String anotEssential = ann.getDetails().get("essential");
			return anotEssential != null && anotEssential.trim().equalsIgnoreCase("true");
		}
		return false;
	}
	
	public static Map<String, Object> parseMappingExpression(String mapping) {
		
		//System.out.println("parseMapping: " + mapping);
		if (mapping == null)
			return null;
		
		LinkedHashMap<String, Object> result = new LinkedHashMap<String, Object>();
		
		Pattern p = Pattern.compile("(\\w+)(\\s*:\\s*(#\\w+|\\d+|\"[^\"]*\"))?");	
		Matcher match = p.matcher(mapping);
		
		while (match.find()) {
			
			//System.out.println("Match:");
			//for (int i=0; i<=match.groupCount(); i++) {
			//	System.out.println("\t (" + i + ") " + match.group(i));
			//}
			
			String key = match.group(1);
			String val = match.group(3);
			
			if (val != null) {
				//metavariable
				if (val.startsWith("#")) {
					result.put(key, val);
				}
				//string type
				else if (val.startsWith("\"")) {
					result.put(key, val.substring(1,val.length()-1));
				}
				//integer type
				else {
					result.put(key, Integer.parseInt(val));
				}
			}
			else {
				result.put(key, null);
			}
		}
				
		return result;
	}
	
}
