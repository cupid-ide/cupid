package org.earthsystemmodeling.cupid.template.core;

import static uk.ac.ed.ph.snuggletex.definitions.Globals.PARA_MODE_ONLY;
import static uk.ac.ed.ph.snuggletex.definitions.TextFlowContext.START_NEW_XHTML_BLOCK;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.ui.internal.tweaklets.AllowGrabFocus;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import uk.ac.ed.ph.snuggletex.InputError;
import uk.ac.ed.ph.snuggletex.SnuggleEngine;
import uk.ac.ed.ph.snuggletex.SnuggleInput;
import uk.ac.ed.ph.snuggletex.SnuggleLogicException;
import uk.ac.ed.ph.snuggletex.SnugglePackage;
import uk.ac.ed.ph.snuggletex.SnuggleSession;
import uk.ac.ed.ph.snuggletex.WebPageOutputOptions;
import uk.ac.ed.ph.snuggletex.definitions.BuiltinCommand;
import uk.ac.ed.ph.snuggletex.definitions.BuiltinEnvironment;
import uk.ac.ed.ph.snuggletex.definitions.CoreErrorCode;
import uk.ac.ed.ph.snuggletex.definitions.CorePackageDefinitions;
import uk.ac.ed.ph.snuggletex.definitions.LaTeXMode;
import uk.ac.ed.ph.snuggletex.definitions.TextFlowContext;
import uk.ac.ed.ph.snuggletex.definitions.W3CConstants;
import uk.ac.ed.ph.snuggletex.dombuilding.CommandHandler;
import uk.ac.ed.ph.snuggletex.dombuilding.EnvironmentHandler;
import uk.ac.ed.ph.snuggletex.dombuilding.ListEnvironmentHandler;
import uk.ac.ed.ph.snuggletex.internal.DOMBuilder;
import uk.ac.ed.ph.snuggletex.internal.FrozenSlice;
import uk.ac.ed.ph.snuggletex.internal.SnuggleParseException;
import uk.ac.ed.ph.snuggletex.tokens.ArgumentContainerToken;
import uk.ac.ed.ph.snuggletex.tokens.CommandToken;
import uk.ac.ed.ph.snuggletex.tokens.EnvironmentToken;
import uk.ac.ed.ph.snuggletex.tokens.ErrorToken;
import uk.ac.ed.ph.snuggletex.tokens.FlowToken;
import uk.ac.ed.ph.snuggletex.tokens.SimpleToken;
import uk.ac.ed.ph.snuggletex.tokens.Token;
import uk.ac.ed.ph.snuggletex.tokens.TokenType;

public class SnuggleEngineTester {

	static final String filepath = "/home/rocky/eclipse/cupiddev-v0-2/git/esmf/esmf/src/addon/NUOPC/doc/NUOPC_Base_fapi.tex";

	static final String latex = " Add a namespace to {\\tt state}. Namespaces are implemented via nested \n" + 
			"     states. This creates a nested state inside of {\\tt state}. The nested state\n" + 
			"     is returned as {\\tt nestedState}. If provided, {\\tt nestedStateName} will \n" + 
			"     be used to name the newly created nested state. The default name of the \n" + 
			"     nested state is equal to {\\tt namespace}.\n" + 
			"  \n" + 
			"     The arguments are:\n" + 
			"     \\begin{description}\n" + 
			"     \\item[state]\n" + 
			"       The {\\tt ESMF\\_State} object to which the namespace is added.\n" + 
			"     \\item[namespace]\n" + 
			"       The namespace string.\n" + 
			"     \\item[{[nestedStateName]}]\n" + 
			"       Name of the nested state. Defaults to {\\tt namespace}.\n" + 
			"     \\item[{[nestedState]}]\n" + 
			"       Optional return of the newly created nested state.\n" + 
			"     \\item[{[rc]}]\n" + 
			"       Return code; equals {\\tt ESMF\\_SUCCESS} if there are no errors.\n" + 
			"     \\end{description}";
	
	public static void main(String[] args) {
		
		CommandHandler ch = new CommandHandler() {
			@Override
			public void handleCommand(DOMBuilder builder, Element parentElement, CommandToken token)
					throws SnuggleParseException {
				System.out.println("token = " + token);
			}
		};
		
		
		SnugglePackage corePackage = CorePackageDefinitions.getPackage();
		BuiltinCommand bic = corePackage.addComplexCommandSameArgMode("<description item>", false, 1, PARA_MODE_ONLY, new DescriptionEnvironmentHandler(), START_NEW_XHTML_BLOCK);
		DescriptionEnvironmentHandler.CMD_DESC_ITEM = bic;
		corePackage.addCommand(bic);
		corePackage.addEnvironment("description", PARA_MODE_ONLY, null, null, new DescriptionEnvironmentHandler(), START_NEW_XHTML_BLOCK);
		
	    BuiltinCommand CMD_ITEM = corePackage.addComplexCommand("item", true, 1, PARA_MODE_ONLY, new LaTeXMode[] {LaTeXMode.PARAGRAPH}, ch, null);
	    corePackage.addCommand(CMD_ITEM);
	    	    		
	    //("item", PARA_MODE_ONLY, new ListEnvironmentHandler(), null);
		/*			
		sp.addComplexCommand("bigskip", true, 1, 
				EnumSet.allOf(LaTeXMode.class), 
				new LaTeXMode[] {LaTeXMode.PARAGRAPH, LaTeXMode.MATH, LaTeXMode.LR,  LaTeXMode.VERBATIM},
				ch,
				TextFlowContext.START_NEW_XHTML_BLOCK);
		*/
        //sp.addEnvironment("description", PARA_MODE_ONLY, null, null, new DescriptionEnvironmentHandler(), START_NEW_XHTML_BLOCK);
        
		
		SnuggleEngine engine = new SnuggleEngine();
		//engine.addPackage(sp);
		
		SnuggleSession session = engine.createSession();
		
		try {
			//session.parseInput(new SnuggleInput(new File(filepath)));
			session.parseInput(new SnuggleInput(latex));
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		
		for (InputError e : session.getErrors()) {
			System.out.println("Error: " + e);
		}
		
		String xml = session.buildXMLString();
		System.out.println(xml);
		
		//NodeList nodeList = session.buildDOMSubtree();
		//System.out.println("nodeList size = " + nodeList.getLength());
		
		//WebPageOutputOptions wpoo = new WebPageOutputOptions();
		//wpoo.setIncludingStyleElement(false);
		
		
		
		
	}
	
	//based on uk.ac.ed.ph.snuggletex.dombuilding.ListEnvironmentHandler
	public static class DescriptionEnvironmentHandler implements EnvironmentHandler, CommandHandler {
	    
		static BuiltinCommand CMD_DESC_ITEM = null;
		/**
	     * Builds the actual List environment
	     */
	    public void handleEnvironment(DOMBuilder builder, Element parentElement, EnvironmentToken token)
	            throws SnuggleParseException {
	        
	    	String listElementName = null;
	    	//this call required since "description" is not a built-in list type
	    	fixListEnvironmentContent(token);
	        /*
	        BuiltinEnvironment environment = token.getEnvironment();
	        if (environment==CorePackageDefinitions.ENV_ITEMIZE) {
	            listElementName = "ul";
	        }
	        else if (environment==CorePackageDefinitions.ENV_ENUMERATE) {
	            listElementName = "ol";
	        }
	        else {
	            throw new SnuggleLogicException("No logic to handle list environment " + environment.getTeXName());
	        }
	        */
	        listElementName = "ul";
	        Element listElement = builder.appendXHTMLElement(parentElement, listElementName);
	        for (FlowToken contentToken : token.getContent()) {
	            if (contentToken.isCommand(getDescItemCommand())) {
	                builder.handleToken(listElement, contentToken);
	            }
	            else if (contentToken.getType()==TokenType.ERROR) {
	                /* We'll append errors immediately *after* the list environment */
	                builder.handleToken(parentElement, contentToken);
	            }
	            else {
	                /* List environments should only contain list items. This should have
	                 * been sorted at token fixing so we've got a logic fault if we get here!
	                 */
	                throw new SnuggleLogicException("List environments can only contain list items - this should have been handled earlier");
	            }
	        }
	    }
	    
	   static Pattern ITEM_PATTERN = Pattern.compile("\\[(\\w+)\\](.*)", Pattern.DOTALL);
	    
	    /**
	     * Builds list items.
	     */
	    public void handleCommand(DOMBuilder builder, Element parentElement, CommandToken itemToken)
	            throws SnuggleParseException {
	    	if (itemToken.isCommand(getDescItemCommand())) {
	            /* Right, this is one of the special LIST_ITEM tokens, creating during the fixing
	             * stage when they are allowed.
	             * 
	             * Make sure we're building a list */
	            if (builder.isParentElement(parentElement, W3CConstants.XHTML_NAMESPACE, "ul", "ol")) {
	                Element listItem = builder.appendXHTMLElement(parentElement, "li");
	                builder.handleTokens(listItem, itemToken.getArguments()[0], true);
	                Node firstNode = listItem.getFirstChild();
	                if (firstNode.getNodeType()==Node.TEXT_NODE) {
	                	System.out.println(firstNode.getTextContent());
	                	Matcher m = ITEM_PATTERN.matcher(firstNode.getTextContent());
	                	if (m.find()) {
	                		firstNode.setTextContent("BOLD"+m.group(1)+"BOLD");
	                		//builder.appendXHTMLTextElement(listItem, "b", m.group(1), true);
	                		//listItem.setTextContent(m.group(2));
	                	}
	                }
	            }
	            else {
	                /* List items should only appear inside list environments. But since they
	                 * can't be specified by clients, this must be a logic fault!
	                 */
	                throw new SnuggleLogicException("List item outside environment - this should not have occurred");
	            }
	        }
	        else if (itemToken.isCommand(CorePackageDefinitions.CMD_ITEM)) {
	            /* This is a standard LaTeX \item. This would have been substituted if it was used
	             * in a legal position so we must conclude that it cannot be used here.
	             */
	            builder.appendOrThrowError(parentElement, itemToken, CoreErrorCode.TDEL00);
	        }

	    }
	    
	    private BuiltinCommand getDescItemCommand() {
	    	return CMD_DESC_ITEM;
	    }
	    
	    //unfortunately, copied from uk.ac.ed.ph.snuggletex.internal.TokenFixer
	    private void fixListEnvironmentContent(EnvironmentToken environmentToken)
	            throws SnuggleParseException {
	        List<FlowToken> contents = environmentToken.getContent().getContents();
	        List<FlowToken> itemBuilder = new ArrayList<FlowToken>();
	        List<FlowToken> resultBuilder = new ArrayList<FlowToken>();
	        
	        /* Go through contents, building up item groups */
	        FlowToken token;
	        boolean foundItem = false;
	        for (int i=0, size=contents.size(); i<size; i++) {
	            token = contents.get(i);
	            if (token.isCommand(CorePackageDefinitions.CMD_ITEM)) {
	                /* Old-style \item. Stop building up content (if appropriate) and replace with
	                 * new LIST_ITEM command */
	                if (foundItem) {
	                    CommandToken itemBefore = buildGroupedCommandToken(environmentToken, getDescItemCommand(), itemBuilder);
	                    resultBuilder.add(itemBefore);
	                }
	                foundItem = true;
	                continue;
	            }
	            else if (!foundItem) {
	                /* Found stuff before first \item. The only thing we allow is whitespace text */
	                if (token.getType()==TokenType.TEXT_MODE_TEXT && token.getSlice().isWhitespace()
	                        || token.getType()==TokenType.NEW_PARAGRAPH) {
	                    /* This is whitespace, so we'll just ignore this token */
	                }
	                else {
	                    /* Error: (non-trivial) content before first \item */
	                    resultBuilder.add(createError(token, CoreErrorCode.TFEL00));
	                }
	            }
	            else {
	            	/* Add to current item */
	                itemBuilder.add(token);	                
	            }
	        }
	        /* At end, finish off last item */
	        if (foundItem) {
	            resultBuilder.add(buildGroupedCommandToken(environmentToken, getDescItemCommand(), itemBuilder));
	        }
	        
	        /* Replace content */
	        contents.clear();
	        contents.addAll(resultBuilder);
	    }
	    
	    private CommandToken buildGroupedCommandToken(final Token parentToken,
	            final BuiltinCommand command, final List<? extends FlowToken> itemBuilder) {
	        ArgumentContainerToken contentToken;
	        if (itemBuilder.isEmpty()) {
	            contentToken = ArgumentContainerToken.createEmptyContainer(parentToken, parentToken.getLatexMode());
	        }
	        else {
	            contentToken = ArgumentContainerToken.createFromContiguousTokens(parentToken, itemBuilder.get(0).getLatexMode(), itemBuilder);
	        }
	        CommandToken result = new CommandToken(contentToken.getSlice(), contentToken.getLatexMode(),
	                command,
	                null, /* No optional argument */
	                new ArgumentContainerToken[] { contentToken } /* Single argument containing content */
	        );
	        itemBuilder.clear();
	        return result;
	    }
	    
	    private ErrorToken createError(final FlowToken token, final CoreErrorCode errorCode,
	            final Object... arguments) throws SnuggleParseException {
	        FrozenSlice slice = token.getSlice();
	        InputError error = new InputError(errorCode, slice, arguments);
	        //sessionContext.registerError(error);
	        return new ErrorToken(error, token.getLatexMode());
	    }
	    
	}

	
}
