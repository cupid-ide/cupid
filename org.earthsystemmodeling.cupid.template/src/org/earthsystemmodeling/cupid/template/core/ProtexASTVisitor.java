package org.earthsystemmodeling.cupid.template.core;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.template.core.ProtexStore.Parameter;
import org.earthsystemmodeling.cupid.template.core.ProtexStore.Subroutine;
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
	
	private ProtexStore store;
	private SnuggleEngine snuggleEngine;
	private WebPageOutputOptions webPageOutputOptions;
	
	public ProtexASTVisitor(ProtexStore store) {
		this.store = store;
		snuggleEngine = new SnuggleEngine();
		
		webPageOutputOptions = new WebPageOutputOptions();
		webPageOutputOptions.setIncludingStyleElement(true);
				
	/*	
		String latex = "\\begin{itemize}";
		latex += "\\item\\apiStatusCompatibleVersion{5.2.0r}";
		latex += "\\item\\apiStatusModifiedSinceVersion{5.2.0r}";
		latex += "\\begin{description}";
		latex += "\\item[6.1.0] Added argument {\\tt srcTermProcessing}.";
//              Added argument {\tt pipelineDepth}.
//              The new arguments provide access to the tuning parameters
//              affecting the sparse matrix execution.
//\item[7.0.0] Added argument {\tt transposeRoutehandle} to allow a handle to
//           the transposed matrix operation to be returned.\newline
//              Added argument {\tt ignoreUnmatchedIndices} to support sparse 
//                matrices that contain elements with indices that do not have a
//              match within the source or destination Array.
		latex += "\\end{description}";
		latex += "\\end{itemize}";
		
		SnuggleEngine engine = new SnuggleEngine();
		SnuggleSession session = engine.createSession();
		try {
			session.parseInput(new SnuggleInput(latex));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebPageOutputOptions wpoo = new WebPageOutputOptions();
		wpoo.setIncludingStyleElement(false);
		
		System.out.println("WEB PAGE OUTPUT START");
		try {
			session.writeWebPage(wpoo, System.out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("WEB PAGE OUTPUT END");
		*/
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
	static Pattern PATTERN_DESCRIPTION = Pattern.compile("!\\s*DESCRIPTION:(.*)!\\s*EOP", Pattern.DOTALL);
	//static Pattern PATTERN_ARGUMENTS = Pattern.compile("!\\s*ARGUMENTS:(.*)!\\s*(!\\s*!DESCRIPTION)", Pattern.DOTALL);
	
	@Override
	public void visitASTSubroutineSubprogramNode(ASTSubroutineSubprogramNode node) {

		Subroutine sub = new Subroutine();
		sub.name = node.getSubroutineStmt().getSubroutineName().getSubroutineName().getText();
		
		String whiteBefore = node.getSubroutineStmt().findFirstToken().getWhiteBefore();
				
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
		
		//System.out.println("\n"+sub);	
		
		String body = node.getBody().toString();
		//System.out.println("body=|\n"+body+"\n|\n");
		//m = PATTERN_ARGUMENTS.matcher(body);
		//if (m.find()) {
		//	sub.paramText = m.group(1);
		//}
		int startIdx = body.indexOf("!ARGUMENTS:");
		if (startIdx >= 0) {
			int endIdx = body.indexOf("!DESCRIPTION:");
			if (endIdx == -1) {
				endIdx = body.indexOf("!EOP");
			}
			if (endIdx >= 0) {
				String paramText = body.substring(startIdx+12, endIdx);
				sub.paramText = paramText;
			}
		}
		//System.out.println("paramText=\n|"+sub.paramText+"|");
		
		m = PATTERN_DESCRIPTION.matcher(body);
		if (m.find()) {
			String longDesc = m.group(1).replaceAll("\\n\\s*!", "\n");
			sub.longDesc = latexToHTML(longDesc);
			//System.out.println("longDesc = \n|" + sub.longDesc + "|");
		}
		
		store.addSubroutine(sub);
	}
	
	
}
