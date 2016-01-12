package org.earthsystemmodeling.cupid.template.core;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.template.core.ProtexAPI.Parameter;
import org.earthsystemmodeling.cupid.template.core.ProtexAPI.Subroutine;
import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.parser.ASTSubroutineParNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTVisitor;

import uk.ac.ed.ph.snuggletex.SnuggleEngine;
import uk.ac.ed.ph.snuggletex.SnuggleInput;
import uk.ac.ed.ph.snuggletex.SnuggleSession;
import uk.ac.ed.ph.snuggletex.WebPageOutputOptions;

@SuppressWarnings("restriction")
public class ProtexASTVisitor extends ASTVisitor {
	
	private ProtexAPI protexAPI;
	private SnuggleEngine snuggleEngine;
	private WebPageOutputOptions webPageOutputOptions;
	
	public ProtexASTVisitor(ProtexAPI protexAPI) {
		this.protexAPI = protexAPI;
		snuggleEngine = new SnuggleEngine();		
		webPageOutputOptions = new WebPageOutputOptions();
		webPageOutputOptions.setIncludingStyleElement(false);
	}
	
	private String latexToHTML(String latex) {
		SnuggleSession session = snuggleEngine.createSession();
		try {
			session.parseInput(new SnuggleInput(latex));
			ByteArrayOutputStream output = new ByteArrayOutputStream();
			session.writeWebPage(webPageOutputOptions, output);
			return output.toString();
		} catch (IOException e) {
			CupidActivator.debug("Exception converting Protex latex to HTML", e);
		}		
		return latex;  //failed to convert		
	}
	

	
	static Pattern PATTERN_IROUTINE = Pattern.compile("!\\s*IROUTINE:\\s*(\\w*)\\s*-\\s*(.*)\\n");
	static Pattern PATTERN_STATUS = Pattern.compile("!\\s*STATUS:(.*)!\\s*DESCRIPTION:", Pattern.DOTALL);
	static Pattern PATTERN_DESCRIPTION = Pattern.compile("!\\s*DESCRIPTION:(.*)!\\s*EOP", Pattern.DOTALL);
	//static Pattern PATTERN_ARGUMENTS = Pattern.compile("!\\s*ARGUMENTS:(.*)!\\s*(!\\s*!DESCRIPTION)", Pattern.DOTALL);
	
	@Override
	public void visitASTSubroutineSubprogramNode(ASTSubroutineSubprogramNode node) {

		Subroutine sub = new Subroutine();
		sub.name = node.getSubroutineStmt().getSubroutineName().getSubroutineName().getText();
		
		String whiteBefore = node.getSubroutineStmt().findFirstToken().getWhiteBefore();
		
		if (!whiteBefore.contains("!BOP")) {  //check for public interface
			return;
		}
		
		//System.out.println("white before = |" + whiteBefore + "|");
		Matcher m = PATTERN_IROUTINE.matcher(whiteBefore);
		if (m.find()) {
			sub.iface = m.group(1);
			sub.shortDesc = m.group(2);		
		}
		else {
			return;  //do not proceed
		}
		
		if (node.getSubroutineStmt().getSubroutinePars() != null) {
			sub.params = new ArrayList<Parameter>();
			for (ASTSubroutineParNode pn : node.getSubroutineStmt().getSubroutinePars()) {
				Parameter p = new Parameter();
				p.name = pn.getVariableName().getText();
				List<Definition> defs = pn.getVariableName().resolveBinding();
				if (defs.size() > 0) {
					Definition def = defs.get(0);
					p.type = def.getType().toString();
					p.intentIn = def.isIntentIn();
					p.intentOut = def.isIntentOut();
					p.optional = def.isOptional();
				}
				sub.params.add(p);				
			}
		}
				
		String body = node.getBody().toString();
		//System.out.println("body=|\n"+body+"\n|\n");
		//m = PATTERN_ARGUMENTS.matcher(body);
		//if (m.find()) {
		//	sub.paramText = m.group(1);
		//}
		int startIdx = body.indexOf("!ARGUMENTS:");
		if (startIdx >= 0) {
			int endIdx = body.indexOf("!STATUS:");
			if (endIdx == -1) {
				endIdx = body.indexOf("!DESCRIPTION:");
			}
			if (endIdx == -1) {
				endIdx = body.indexOf("!EOP");
			}
			if (endIdx >= 0) {
				String paramText = body.substring(startIdx+12, endIdx);
				paramText = paramText.replaceAll("\\n\\s*!", "\n");
				paramText = paramText.replaceAll(".*KeywordEnforcer.*\n", "");  //remove entire line
				sub.paramText = paramText;
			}
		}
		//System.out.println("paramText=\n|"+sub.paramText+"|");
		
		m = PATTERN_STATUS.matcher(body);
		if (m.find()) {
			String status = m.group(1).replaceAll("\\n\\s*!", "\n");
			sub.status = latexToHTML(status);
		}
		
		m = PATTERN_DESCRIPTION.matcher(body);
		if (m.find()) {
			String longDesc = m.group(1).replaceAll("\\n\\s*!", "\n");
			sub.longDesc = latexToHTML(longDesc);
			//System.out.println("longDesc = \n|" + sub.longDesc + "|");
		}
		
		protexAPI.addSubroutine(sub);
	}
	
	
}
