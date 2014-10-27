package org.earthsystemmodeling.cupid.codedb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.analysis.dependence.Dependence.Type;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTArrayConstructorNode;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTDblConstNode;
import org.eclipse.photran.internal.core.parser.ASTIntConstNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTOnlyNode;
import org.eclipse.photran.internal.core.parser.ASTRealConstNode;
import org.eclipse.photran.internal.core.parser.ASTRenameNode;
import org.eclipse.photran.internal.core.parser.ASTStringConstNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineArgNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineParNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.ASTVarOrFnRefNode;
import org.eclipse.photran.internal.core.parser.ASTVisitor;
import org.eclipse.photran.internal.core.parser.IASTNode;

@SuppressWarnings("restriction")
public class CodeDBVisitor extends ASTVisitor {

	protected Connection conn;
	protected Map<String, PreparedStatement> stmtCache;
	protected Stack<Long> parentStack;
	
	private int currentArgIndex = 0;
	private long childExprId = -1;
	
	public CodeDBVisitor(Connection conn) {
		this.conn = conn;
		this.stmtCache = new HashMap<String, PreparedStatement>();
		this.parentStack = new Stack<Long>();
	}
	
	private long addFact(String predicate, Object... args) {
		return addFactWithID(predicate, -1, args);
	}
	
	private long addFactWithID(String predicate, long id, Object... args) {
		
		String cacheKey;
		if (id > -1) {
			//id supplied
			cacheKey = predicate + "__with_id";
		}
		else {
			cacheKey = predicate;
		}
		
		PreparedStatement insertStmt = stmtCache.get(cacheKey);
		if (insertStmt == null) {
			String insertSQL;
			if (id > -1) {
				insertSQL = "INSERT INTO " + predicate + " VALUES (?,";  //id provided
			}
			else {
				insertSQL = "INSERT INTO " + predicate + " VALUES (global_fact_id.nextval,";  //next global id
			}
			
			for (int i=0; i<args.length; i++) {
				insertSQL += "?,";
			}
			insertSQL = insertSQL.substring(0, insertSQL.length()-1) + ");";
			try {
				insertStmt = conn.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS);
			} catch (SQLException e) {
				CupidActivator.log("Error creating insert SQL statement code indexer: " + insertSQL, e);
				return id;
			}
			stmtCache.put(cacheKey, insertStmt);
		}
		
		try {
			if (id > -1) {
				insertStmt.setLong(1, id);  //explicit id
				for (int columnIndex = 0; columnIndex < args.length; columnIndex++) {
					insertStmt.setObject(columnIndex+2, args[columnIndex]);
				}
			}
			else {
				for (int columnIndex = 0; columnIndex < args.length; columnIndex++) {
					insertStmt.setObject(columnIndex+1, args[columnIndex]);
				}
			}
			
			insertStmt.execute();
			ResultSet rs = insertStmt.getGeneratedKeys();
		 	if (rs.next()) {
		       id = rs.getInt(1);     
		    }
		 	rs.close();
		} 
		catch (SQLException e) {
			CupidActivator.log("SQL error populating code DB for table: " + predicate, e);
		}
		
		return id;
		
	}
	
	protected long reserveID() {
		PreparedStatement nextIDStmt = stmtCache.get("__next_id__");
		if (nextIDStmt == null) {
			String selectSQL = "SELECT global_fact_id.nextval;";
			try {
				nextIDStmt = conn.prepareStatement(selectSQL);
			} catch (SQLException e) {
				CupidActivator.log("Error creating SQL statement in code indexer: " + selectSQL, e);
				return -1;
			}
			stmtCache.put("__next_id__", nextIDStmt);
		}
		try {
			ResultSet rs = nextIDStmt.executeQuery();
			rs.next();
			long nextID = rs.getLong(1);
			rs.close();
			return nextID;
		} catch (SQLException e) {
			CupidActivator.log("SQL error reserving ID in code indexer", e);
		}
		return -1;
	}
	
	protected void addTokenRef(long id, Token token, String type) {
		PreparedStatement addTokenRefStmt = stmtCache.get("__add_token_ref__");
		if (addTokenRefStmt == null) {
			String insertSQL = "INSERT INTO tokenRef (id, filename, offset, length, type) VALUES (?,?,?,?,?);";
			try {
				addTokenRefStmt = conn.prepareStatement(insertSQL);
			} catch (SQLException e) {
				CupidActivator.log("Error creating SQL statement in code indexer: " + insertSQL, e);
				return;
			}
			stmtCache.put("__add_token_ref__", addTokenRefStmt);
		}
		try {
			addTokenRefStmt.setLong(1, id);
			addTokenRefStmt.setString(2, token.getTokenRef().getFilename());
			addTokenRefStmt.setInt(3, token.getFileOffset());
			addTokenRefStmt.setInt(4, token.getLength());
			addTokenRefStmt.setString(5, type);
			addTokenRefStmt.executeUpdate();
		} catch (SQLException e) {
			CupidActivator.log("SQL error adding token ref", e);
		}
	}
	
	
	protected void traverseChildren(IASTNode node, long id) {
		parentStack.push(id);
		traverseChildren(node);
		parentStack.pop();
	}
	
	protected long parentID() {
		if (parentStack.size() > 0) {
			return parentStack.peek();
		}
		else {
			return -1;
		}
	}
	
	@Override
	public void visitASTModuleNode(ASTModuleNode node) {
		long id = addFact("module", node.getModuleStmt().getModuleName().getModuleName().getText());
		addTokenRef(id, node.getModuleStmt().getModuleName().getModuleName(), "module");
		traverseChildren(node, id);
	}
	
	@Override
	public void visitASTUseStmtNode(ASTUseStmtNode node) {
		node.getName().getTokenRef();
		long id = addFact("uses", parentID(), node.getName().getText());
		traverseChildren(node, id);
	}
	
	@Override
	public void visitASTOnlyNode(ASTOnlyNode node) {
		String newName;
		if (node.getNewName() != null) {
			newName = node.getNewName().getText();
		}
		else {
			newName = node.getName().getText();
		}
		long id = addFact("usesEntity", parentID(), node.getName().getText(), newName, 1);
	}
	
	@Override
	public void visitASTRenameNode(ASTRenameNode node) {
		long id = addFact("usesEntity", parentID(), node.getName().getText(), node.getNewName().getText(), 0);
	}
	
	@Override
	public void visitASTSubroutineSubprogramNode(ASTSubroutineSubprogramNode node) {
		long id = addFact("subroutine", parentID(), node.getSubroutineStmt().getSubroutineName().getSubroutineName().getText());
		indexParam = 0;
		traverseChildren(node, id);
		
	}
	
	int indexParam;
	
	@Override
	public void visitASTSubroutineParNode(ASTSubroutineParNode node) {
		
		indexParam++;
		String type = "UNKNOWN";
		boolean intentIn = false;
		boolean intentOut = false;
		List<Definition> defs = node.getVariableName().resolveBinding();
		if (defs.size() > 0) {
			Definition def = defs.get(0);
			type = def.getType().toString();
			intentIn = def.isIntentIn();
			intentOut = def.isIntentOut();
		}
		
		long id = addFact("param", parentID(), indexParam, node.getVariableName().getText(), type, intentIn, intentOut);
	}
	
	@Override
	public void visitASTCallStmtNode(ASTCallStmtNode node) {
		long id = addFact("call", parentID(), node.getSubroutineName().getText());
		currentArgIndex = 0;
		traverseChildren(node, id);
	}
	
	@Override
	public void visitASTSubroutineArgNode(ASTSubroutineArgNode node) {	
		long id = reserveID();
		childExprId = -1;
		traverseChildren(node, id);
	
		currentArgIndex++;
		id = addFactWithID("callArg", id, parentID(), currentArgIndex, childExprId);
				
	}
	
	
	@Override
	public void visitASTVarOrFnRefNode(ASTVarOrFnRefNode node) {	
		//int defId = addDefinition(node.getName().getName());
		childExprId = addFact("ident", parentID(), node.getName().getName().getText());
	}
	
	/**
	 * const(#id, #parent, 'string', value)
	 * type is one of: 'string', 'double', 'integer', 'real', etc. 
	 */
	@Override
	public void visitASTStringConstNode(ASTStringConstNode node) {
		childExprId = addFact("const", parentID(), "string", node.getStringConst().getText());
	}
	
	@Override
	public void visitASTIntConstNode(ASTIntConstNode node) {
		childExprId = addFact("const", parentID(), "integer", node.getIntConst().getText());
	}
	
	@Override
	public void visitASTRealConstNode(ASTRealConstNode node) {
		childExprId = addFact("const", parentID(), "real", node.getRealConst().getText());
	}
	
	@Override
	public void visitASTDblConstNode(ASTDblConstNode node) {
		childExprId = addFact("const", parentID(), "double", node.getDblConst().getText());
	}
	
	@Override
	public void visitASTArrayConstructorNode(ASTArrayConstructorNode node) {
		String val = node.toString().replaceAll("\n", "\\\\n");
		val = val.substring(0, Math.min(100, val.length()));  //TODO: fixme
		childExprId = addFact("arrayConstructor", parentID(), val);
	}
	
	
	
	
}
