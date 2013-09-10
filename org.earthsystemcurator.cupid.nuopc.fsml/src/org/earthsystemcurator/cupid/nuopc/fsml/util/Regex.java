package org.earthsystemcurator.cupid.nuopc.fsml.util;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

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
