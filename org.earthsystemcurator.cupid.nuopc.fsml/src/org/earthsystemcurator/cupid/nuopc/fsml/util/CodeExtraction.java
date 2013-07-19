package org.earthsystemcurator.cupid.nuopc.fsml.util;

import java.io.StringReader;

import org.eclipse.photran.internal.core.FortranAST;
import org.eclipse.photran.internal.core.analysis.loops.ASTProperLoopConstructNode;
import org.eclipse.photran.internal.core.analysis.loops.LoopReplacer;
import org.eclipse.photran.internal.core.lexer.ASTLexerFactory;
import org.eclipse.photran.internal.core.lexer.IAccumulatingLexer;
import org.eclipse.photran.internal.core.parser.ASTAssignmentStmtNode;
import org.eclipse.photran.internal.core.parser.ASTContainsStmtNode;
import org.eclipse.photran.internal.core.parser.ASTMainProgramNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IExpr;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.photran.internal.core.parser.Parser;

/**
 * This class contains utility methods copied from
 * org.eclipse.photran.internal.core.refactoring.infrastructure.FortranResourceRefactoring
 * 
 * This was done because the referenced class does not expose these utility methods publicly.
 * I also made a philosophical decision that we are not doing "refactoring" since we are actually
 * changing the behavior of the code.  So, we should not extend the photran refactoring classes.
 * 
 * @author Rocky
 *
 */

@SuppressWarnings("restriction")
public class CodeExtraction {

    /**
     * Parses the given Fortran statement.
     * <p>
     * Internally, <code>string</code> is embedded into the following program
     * <pre>
     * program p
     *   (string is placed here)
     * end program
     * </pre>
     * which is parsed and its body extracted and returned,
     * so <code>string</code> must "make sense" (syntactically) in this context.
     * No semantic analysis is done; it is only necessary that the
     * program be syntactically correct.
     */
    public static IBodyConstruct parseLiteralStatement(String string)
    {
        return parseLiteralStatementSequence(string).get(0);
    }

    /**
     * Parses the given Fortran statement, or returns <code>null</code> if the
     * statement cannot be parsed.
     *
     * @see #parseLiteralStatement(String)
     */
	public static IBodyConstruct parseLiteralStatementNoFail(String string)
    {
        try
        {
            return parseLiteralStatement(string);
        }
        catch (Throwable e)
        {
            return null;
        }
    }

    /**
     * Parses the given Fortran expression.
     * <p>
     * Internally, <code>string</code> is embedded into the following program
     * <pre>
     * program p
     *   x = (string is placed here)
     * end program
     * </pre>
     * which is parsed and the resulting expression extracted and returned,
     * so <code>string</code> must "make sense" (syntactically) in this context.
     * No semantic analysis is done; it is only necessary that the
     * program be syntactically correct.
     */
	public static IExpr parseLiteralExpression(String string)
    {
        return ((ASTAssignmentStmtNode)parseLiteralStatement("x = " + string)).getRhs(); //$NON-NLS-1$
    }
    
    /**
     * Parses the given list of Fortran statements.
     * <p>
     * @see parseLiteralStatement
     */
	public static IASTListNode<IBodyConstruct> parseLiteralStatementSequence(String string)
    {
        string = "program p\n" + string + "\nend program"; //$NON-NLS-1$ //$NON-NLS-2$
        return ((ASTMainProgramNode)parseLiteralProgramUnit(string)).getBody();
    }

    /**
     * Parses the given DO-loop as a {@link ASTProperLoopConstructNode}.
     * <p>
     * @see parseLiteralStatement
     */
	public static ASTProperLoopConstructNode parseLiteralDoLoop(String string)
    {
        string = "program p\n" + string + "\nend program"; //$NON-NLS-1$ //$NON-NLS-2$
        ASTMainProgramNode prog = (ASTMainProgramNode)parseLiteralProgramUnit(string);
        LoopReplacer.replaceAllLoopsIn(prog);
        return (ASTProperLoopConstructNode)prog.getBody().get(0);
    }

    /** @return a CONTAINS statement */
	public static ASTContainsStmtNode createContainsStmt()
    {
        String string = "program p\ncontains\nsubroutine s\nend subroutine\nend program"; //$NON-NLS-1$
        return ((ASTMainProgramNode)parseLiteralProgramUnit(string)).getContainsStmt();
    }

    /**
     * Parses the given Fortran program unit.
     * <p>
     * No semantic analysis is done; it is only necessary that the
     * program unit be syntactically correct.
     */
 	public static IProgramUnit parseLiteralProgramUnit(String string)
    {
        try
        {
            IAccumulatingLexer lexer = new ASTLexerFactory().createLexer(
                new StringReader(string), null, "(none)"); //$NON-NLS-1$
            Parser parser = new Parser();

            FortranAST ast = new FortranAST(null, parser.parse(lexer), lexer.getTokenList());
            return ast.getRoot().getProgramUnitList().get(0);
        }
        catch (Exception e)
        {
            throw new Error(e);
        }
    }
	
}
