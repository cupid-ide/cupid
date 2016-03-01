package org.earthsystemmodeling.cupid.template.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.template.core.ProtexAPI.Subroutine;

import com.google.common.base.Joiner;

public class ProtexParser {

	static Pattern PATTERN_IROUTINE = Pattern.compile("!\\s*IROUTINE:\\s*(\\S*)(?:\\s*-\\s*(.*))?");

	
	//private Stack<ProtexState> state;
	private BufferedReader reader;
	//private String curLine;
	//private Subroutine curRoutine;
	private ProtexAPI api;

	public ProtexParser(InputStream input, ProtexAPI api) {
		reader = new BufferedReader(new InputStreamReader(input));
		this.api = api;
		//state = new Stack<ProtexState>();
	}

	public void parse() throws ProtexParsingException {

		String line;
		try {
			while ((line=reader.readLine()) != null) {

				if (line.contains("!BOP")) {

					List<String> lines = new ArrayList<String>();
					while ((line=reader.readLine()) != null) {
						if (line.contains("!EOP")) {
							break;
						}
						lines.add(line + "\n");
					}
					if (line==null) {
						throw new ProtexParsingException("Malformed Protex: Found BOP without closing EOP");
					}
					handleBOP(lines);

				}

			}
		} catch (IOException e) {
			CupidActivator.log("Error reading file during Protex parsing", e);
		}

	}

	private void handleBOP(List<String> lines) throws ProtexParsingException {

		//ArrayList<String> copy = new ArrayList<String>(lines);

		Subroutine routine = null;
		while (lines.size() > 0) {
			List<String> linesInSection = new ArrayList<String>();
			ProtexKeyword keyword = nextSection(lines, linesInSection);

			if (keyword != null) {
				switch(keyword) {
				case IROUTINE:
					routine = new Subroutine();
					handleIROUTINE(linesInSection, routine);
					break;
				case INTERFACE:
					handleINTERFACE(linesInSection, routine);
				default:
					break;
				}
			}

		}

		api.addSubroutine(routine);

	}

	private void handleIROUTINE(List<String> lines, Subroutine routine) throws ProtexParsingException {

		for (String line : lines) {
			Matcher m = PATTERN_IROUTINE.matcher(line);
			if (m.find()) {
				routine.iface = m.group(1);
				routine.shortDesc = m.group(2);
				return;
			}
		}
		throw new ProtexParsingException("Error parsing IROUTINE: " + Joiner.on("\n").join(lines));
	}
	
	private void handleINTERFACE(List<String> lines, Subroutine routine) {
		
		
		
	}

	private ProtexKeyword nextSection(List<String> lines, List<String> section) 
			throws ProtexParsingException {

		ProtexKeyword keywordToReturn = null;
		//find start of next section (probably line 0, but don't assume it)
		int startSection, stopSection, i;
		outerlines: for (i=0; i < lines.size(); i++) {
			for (ProtexKeyword kw : ProtexKeyword.values()) {
				if (lines.get(i).contains(kw.getKeyword())) {
					keywordToReturn = kw;
					break outerlines;
				}	
			}
		}
		if (keywordToReturn == null) {
			lines.clear();
			return null;  //no section found
		}
		startSection = i;

		outer: for (i = startSection+1; i < lines.size(); i++) {
			for (ProtexKeyword kw : ProtexKeyword.values()) {
				if (lines.get(i).contains(kw.getKeyword())) {
					break outer;
				}
			}
		}
		stopSection = i;

		//remove ignored lines at start, if any
		for (int j=0; j<startSection; j++) {
			lines.remove(0);
		}
		for (int j=startSection; j<stopSection; j++) {
			section.add(lines.get(0));
			lines.remove(0);
		}
		return keywordToReturn;

	}

	public enum ProtexKeyword {
		IROUTINE("!IROUTINE:"),
		INTERFACE("!INTERFACE:"),
		ARGUMENTS("!ARGUMENTS:"),
		RETURN_VALUE("!RETURN VALUE:"),
		DESCRIPTION("!DESCRIPTION:");

		private String keyword;
		private ProtexKeyword(String keyword) {
			this.keyword = keyword;
		}
		public String getKeyword() {
			return this.keyword;
		}
	}

	/*
	public void parseold() throws ProtexParsingException {

		state.push(ProtexState.START);
		while (nextLine() != null) {

			if (curLine.contains("!BOP")) {

				state.push(ProtexState.BOP);
			}
			else if (curLine.contains("!IROUTINE:")) {
				state.push(ProtexState.IROUTINE);
			}
			else if (curLine.contains("!INTERFACE")) {
				state.push(ProtexState.INTERFACE);
			}
			else if (curLine.contains("!EOP")) {
				state.push(ProtexState.EOP);
			}
			handleLine();
		}

	}

	private String nextLine() {
		try {
			curLine = reader.readLine();
			return curLine;
		} catch (IOException e) {
			CupidActivator.log("Error reading file while parsing Protex", e);
			return null;
		}
	}

	private void handleLine() throws ProtexParsingException {
		switch(state.peek()) {
		case IROUTINE:
			//handleIROUTINE();
			return;
		case INTERFACE:
			handleINTERFACE();
			return;
		case EOP:
			handleEOP();
			return;
		case BOP: //fall through
			return;
		default:
			return;
			//consume
		}
	}
	*/
	

	/*
	private void handleINTERFACE() throws ProtexParsingException {



		if (state.pop() != ProtexState.INTERFACE) throw new ProtexParsingException();
	}

	private void handleEOP() throws ProtexParsingException {
		if (state.pop() != ProtexState.EOP) throw new ProtexParsingException();
		if (state.pop() != ProtexState.BOP) throw new ProtexParsingException();
		api.addSubroutine(curRoutine);
		curRoutine = null;
	}


	public enum ProtexState {
		START,
		BOP,
		IROUTINE,
		INTERFACE,
		EOP
	}
	*/

	public class ProtexParsingException extends Exception {

		private static final long serialVersionUID = 1L;

		public ProtexParsingException() {
			super();
		}

		public ProtexParsingException(String msg) {
			super(msg);
		}

	}

}
