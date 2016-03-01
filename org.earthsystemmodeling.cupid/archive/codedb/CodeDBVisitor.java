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
import org.eclipse.core.resources.IFile;
import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTAcValueNode;
import org.eclipse.photran.internal.core.parser.ASTArrayConstructorNode;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTDblConstNode;
import org.eclipse.photran.internal.core.parser.ASTExecutableProgramNode;
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
			String insertSQL = "INSERT INTO tokenRef (id, filename, _offset, length, type) VALUES (?,?,?,?,?);";
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
			addTokenRefStmt.setInt(3, token.getStreamOffset());
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
	public void visitASTExecutableProgramNode(ASTExecutableProgramNode node) {
		Token t = node.findFirstToken();
		if (t != null) {
			IFile file = t.getLogicalFile();  
			String filename = file.getName();
			String path = file.getFullPath().toPortableString();
			long id = addFact("compilationUnit", filename, path);
			traverseChildren(node, id);
		}
	}
	
	@Override
	public void visitASTModuleNode(ASTModuleNode node) {
		long id = addFact("module", parentID(), node.getModuleStmt().getModuleName().getModuleName().getText());
		addTokenRef(id, node.getModuleStmt().getModuleName().getModuleName(), "module");
		traverseChildren(node, id);
	}
	
	@Override
	public void visitASTUseStmtNode(ASTUseStmtNode node) {
		node.getName().getTokenRef();
		long id = addFact("uses", parentID(), node.getName().getText());
		addTokenRef(id, node.getName(), "uses");
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
	
	//cache this for below
	ASTSubroutineSubprogramNode currentASTSubroutineSubprogramNode;
	
	@Override
	public void visitASTSubroutineSubprogramNode(ASTSubroutineSubprogramNode node) {
		currentASTSubroutineSubprogramNode = node;
		
		long id = addFact("subroutine", parentID(), node.getSubroutineStmt().getSubroutineName().getSubroutineName().getText());
		addTokenRef(id, node.getSubroutineStmt().getSubroutineName().getSubroutineName(), "subroutine");
		indexParam = 0;
		traverseChildren(node, id);
		
		currentASTSubroutineSubprogramNode = null;
	}
	
	int indexParam;
	
	@Override
	public void visitASTSubroutineParNode(ASTSubroutineParNode node) {
		
		indexParam++;
		String type = "UNKNOWN";
		boolean intentIn = false;
		boolean intentOut = false;
		final String varName = node.getVariableName().getText();
		
		//TODO: this assumes we allow Photran to index the AST
		List<Definition> defs = node.getVariableName().resolveBinding();
		if (defs.size() > 0) {
			Definition def = defs.get(0);
			type = def.getType().toString();
			intentIn = def.isIntentIn();
			intentOut = def.isIntentOut();
		}
		else {
			
			/*
			List<PhotranTokenRef> bindings = node.getVariableName().manuallyResolveBinding();
			for (PhotranTokenRef tokenRef : bindings) {
				Token t = tokenRef.findToken();
				System.out.println("token = " + t);
			}
			*/
			
			/*
			//find it manually
			currentASTSubroutineSubprogramNode.accept(new ASTVisitor() {
				@Override
				public void visitASTTypeDeclarationStmtNode(
						ASTTypeDeclarationStmtNode node) {
					for (ASTEntityDeclNode entityDecl : node.getEntityDeclList()) {
						if (entityDecl.getObjectName().getObjectName().getText().equals(varName)) {
							
							String typeName = node.getTypeSpec().getTypeName().getText();
						}
					}
				}
			});
			*/
		}
		
		
		long id = addFact("param", parentID(), indexParam, varName, type, intentIn, intentOut);
	}
	
	@Override
	public void visitASTCallStmtNode(ASTCallStmtNode node) {
		long id = addFact("call_", parentID(), node.getSubroutineName().getText());
		addTokenRef(id, node.getSubroutineName(), "call_");
		currentArgIndex = 0;
		traverseChildren(node, id);
	}
	
	@Override
	public void visitASTSubroutineArgNode(ASTSubroutineArgNode node) {	
		long id = reserveID();
		childExprId = -1;
		traverseChildren(node, id);
	
		currentArgIndex++;
		String keyword = null;
		if (node.getName() != null) {
			keyword = node.getName().getText();
		}
		id = addFactWithID("callArg", id, parentID(), currentArgIndex, keyword, childExprId);
				
	}
	
	
	@Override
	public void visitASTVarOrFnRefNode(ASTVarOrFnRefNode node) {	
		
		String type = null;
		List<Definition> defs = node.getName().getName().resolveBinding();
		if (defs.size() > 0) {
			Definition def = defs.get(0);
			type = def.getType().toString();
		}
		
		childExprId = addFact("ident", parentID(), type, node.getName().getName().getText());
	}
	
	
	@Override
	public void visitASTStringConstNode(ASTStringConstNode node) {
		childExprId = addFact("const", parentID(), "character", node.getStringConst().getText());
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
		
		currentAcValueIndex = 0;
		traverseChildren(node, childExprId);
	}
	
	int currentAcValueIndex = 0;
	
	@Override
	public void visitASTAcValueNode(ASTAcValueNode node) {
		currentAcValueIndex++;
		String expr = "";
		if (node.getExpr() != null) expr = node.getExpr().toString();
		addFact("arrayConstructorVal", parentID(), currentAcValueIndex, expr);
	}
	
	
	
	
}
