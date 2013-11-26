package org.earthsystemcurator.cupid.nuopc.fsml.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ESMFLogParser {

	protected final String REGEX_LOG_LINE = "(\\d{8}\\s+\\d{6}\\.\\d{3})\\s+(\\w+)\\s+(\\w+)\\s+(\\w+)\\s+('[^']+')\\s+(\\w+)\\s*((?:\\w+=[^|]+(?:[|]\\s*)?)*)";
	protected final String REGEX_KEY_VALUE = "(\\w+)=([^|]+)";
	
	public final Pattern PATTERN_LOG_LINE = Pattern.compile(REGEX_LOG_LINE);
	public final Pattern PATTERN_KEY_VALUE = Pattern.compile(REGEX_KEY_VALUE);
	
	public void parseLog(File logFile) {
		
		//System.out.println("Parsing file: " + logFile.getAbsolutePath());
		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(logFile));
		
			String line;
			while ((line = br.readLine()) != null) {
				
				//System.out.println("Parsing Line: " + line);
				
				Matcher lineMatch = PATTERN_LOG_LINE.matcher(line);
				if (lineMatch.matches()) {
					//System.out.println("Found match: " + line);
					
					//String petNum = lineMatch.group(3);
					String source = lineMatch.group(4);
					String compName = lineMatch.group(5);
					String event = lineMatch.group(6);
					String keyValGroup = lineMatch.group(7);
					
					Map<String,String> keyVals = null;
					if (keyValGroup != null) {
						keyVals = new HashMap<String,String>();
						Matcher keyValMatch = PATTERN_KEY_VALUE.matcher(keyValGroup);
						while (keyValMatch.find()) {
							String keyVal[] = keyValMatch.group().split("=", 2);
							keyVals.put(keyVal[0].trim(), keyVal[1].trim());
						}
					}
					parsedLine(source, compName, event, keyVals);
				}
			}
			br.close();
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	protected void parsedLine(String source, String compName, String event, Map<String,String> keyVals) {
		//START HERE
		System.out.println("Parsed line: " + source + ", " + compName + ", " + event);
		for (Entry<String,String> e : keyVals.entrySet()) {
			System.out.println("\t" + e.getKey() + " ==> " + e.getValue());
		}
	}
	
	public static void main(String[] args) {
		String testfile = "C:\\Users\\Rocky\\Documents\\eclipse\\workspace-runtime-cupid\\AtmOcnPetListProto\\PET0.ESMF_LogFile";
		ESMFLogParser elp = new ESMFLogParser();
		elp.parseLog(new File(testfile));
		
	}
	
}
