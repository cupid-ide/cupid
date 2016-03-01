package org.earthsystemmodeling.cupid.codedb;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import org.apache.commons.io.IOUtils;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.preferences.CupidPreferencePage;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTArrayConstructorNode;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTDblConstNode;
import org.eclipse.photran.internal.core.parser.ASTEntityDeclNode;
import org.eclipse.photran.internal.core.parser.ASTFunctionSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTIntConstNode;
import org.eclipse.photran.internal.core.parser.ASTMainProgramNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTOnlyNode;
import org.eclipse.photran.internal.core.parser.ASTRealConstNode;
import org.eclipse.photran.internal.core.parser.ASTRenameNode;
import org.eclipse.photran.internal.core.parser.ASTStringConstNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineArgNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineParNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode;
import org.eclipse.photran.internal.core.parser.ASTTypeSpecNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.ASTVarOrFnRefNode;
import org.eclipse.photran.internal.core.parser.ASTVisitor;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.vpg.PhotranTokenRef;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

import alice.tuprolog.InvalidTermException;
import alice.tuprolog.InvalidTheoryException;
import alice.tuprolog.MalformedGoalException;
import alice.tuprolog.NoMoreSolutionException;
import alice.tuprolog.NoSolutionException;
import alice.tuprolog.Prolog;
import alice.tuprolog.SolveInfo;
import alice.tuprolog.Struct;
import alice.tuprolog.Term;
import alice.tuprolog.Theory;
import alice.tuprolog.clausestore.H2ClauseStoreFactory;
import alice.tuprolog.lib.InvalidObjectIdException;
import alice.tuprolog.lib.JavaLibrary;


@SuppressWarnings("restriction")
public class CodeDBIndex {

	private static CodeDBIndex instance = null;

	public static CodeDBIndex getInstance() {
		if (instance == null) {
			instance = new CodeDBIndex();
		}
		return instance;
	}

	private Connection conn = null;
	private Prolog prolog = null;
	private PreparedStatement findTokenRefStmt = null;

	public CodeDBIndex() {
		/*
		 * a caveat of having one prolog instance is that you cannot solve
		 * multiple goals at the same time, e.g., such as iterating through
		 * an inner resultset for every row in an outer resultset
		 */
		prolog = new Prolog();
		addDefaultTheory();
	}

	public void addDefaultTheory() {
		try {
			InputStream inputStream = CupidActivator.getInputStream("sql/default.pl");
			String theory = IOUtils.toString(inputStream);
			addTheory(theory);
		} catch (InvalidTheoryException | IOException e) {
			CupidActivator.log("Error loading default theory into CodeDB", e);
		}			
	}

	public void openConnection() throws SQLException {
		String dbloc = CupidActivator.getDefault().getPreferenceStore().getString(CupidPreferencePage.CUPID_CODEDB_LOCATION);

		if (dbloc.length() < 1) {
			dbloc = CupidActivator.getDefault().getPreferenceStore().getDefaultString(CupidPreferencePage.CUPID_CODEDB_LOCATION);  
		}

		String connString = "jdbc:h2:" + dbloc + ";LOG=0;CACHE_SIZE=65536;LOCK_MODE=0;UNDO_LOG=0";
		openConnection(connString);
	}


	public void openConnection(String connString) throws SQLException {

		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			CupidActivator.log("H2 database driver class used by code indexer not found.", e);
			throw new RuntimeException(e);
		}

		CupidActivator.log("Code DB connection string: " + connString);
		conn = DriverManager.getConnection(connString);

		getProlog().getEngineManager().getClauseStoreManager().getFactories()
		.add(new H2ClauseStoreFactory(conn, "PROLOG"));
	}


	public void truncateDatabase() {
		executeSQL("sql/truncate_db.sql");
	}

	public void rebuildDatabase() {
		executeSQL("sql/build_db.sql");
	}

	protected void executeSQL(String path) {

		String sql = null;
		try {
			InputStream inputStream = FileLocator.openStream(
					CupidActivator.getDefault().getBundle(), new Path(path), false);
			sql = IOUtils.toString(inputStream);
		} catch (IOException e) {
			CupidActivator.log("Error accessing SQL file", e);
			return;
		}

		try {
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
		}
		catch (SQLException e) {
			CupidActivator.log("Error in SQL file.", e);
		}

	}

	public boolean isConnected() {
		try {
			return (conn !=null && !conn.isClosed());
		} catch (SQLException e) {
			return false;
		}
	}

	public void closeConnection() {
		try {
			if (!conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			CupidActivator.log("Exception closing code index db.", e);
		}

		if (prolog != null) {
			prolog = null;
		}
	}


	ArrayList<Struct> clauseList = new ArrayList<Struct>(1024);
	Map<Struct, Object> toRegister = new HashMap<Struct, Object>();

	int factID = -1;  //increments each time

	public void indexASTs(Set<IFortranAST> asts) {			
		//clauseList.clear();
		for (IFortranAST ast : asts) {
			indexAST(ast);

			//control flow analysis
			//ControlFlowAnalysis cfa = ControlFlowAnalysis.analyze(ast.getFile().getName(), ast.getRoot());
			//Multimap<IASTNode, IASTNode> flowMap = cfa.getFlowMap();
			//System.out.println(flowMap.size());
		}
	}

	public void indexAST(IFortranAST ast) {
		assert ast != null;
		ast.accept(new CodeDBVisitor(conn));
	}

	public <N extends IASTNode> N findASTNode(Struct s) {
		alice.tuprolog.Long id = (alice.tuprolog.Long) s.getTerm(0);
		return findASTNode(id.longValue());
	}

	public PreparedStatement prepareStatement(String query) {
		try {
			return conn.prepareStatement(query);
		} catch (SQLException e) {
			CupidActivator.log("Error preparing SQL statement: " + query);
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public <N extends IASTNode> N findASTNode(long id) {

		if (findTokenRefStmt == null) {
			try {
				findTokenRefStmt = conn.prepareStatement("SELECT filename, _offset, length, type FROM tokenRef WHERE id=?;");
			} catch (SQLException e) {
				CupidActivator.log("Error preparing SQL statement for finding token refs", e);
				return null;
			}
		}

		try {
			findTokenRefStmt.setLong(1, id);
			ResultSet rs = findTokenRefStmt.executeQuery();
			if (rs.next()) {
				String filename = rs.getString("filename");
				int offset = rs.getInt("_offset");
				int length = rs.getInt("length");
				String type = rs.getString("type");

				PhotranTokenRef tokenRef = new PhotranTokenRef(filename, offset, length);
				Token token = tokenRef.findToken();

				Class<? extends IASTNode> astClass = typeToClass(type);
				if (astClass != null) {
					return (N) token.findNearestAncestor(astClass);
				}
				else {
					return (N) token;
				}		
			}
			rs.close();
		} catch (SQLException e) {
			CupidActivator.log("Error retrieving token ref", e);
		}

		return null;

	}

	public IFortranAST findAST(long id) {
		IASTNode node = findASTNode(id);
		Token t = node.findFirstToken();
		if (t != null) {
			return PhotranVPG.getInstance().acquireTransientAST(t.getLogicalFile());
		}
		else {
			return null;
		}
	}

	protected Map<String, Class<? extends IASTNode>> typeToClassMap = null;

	protected Class<? extends IASTNode> typeToClass(String type) {
		if (typeToClassMap==null) {
			typeToClassMap = new HashMap<String, Class<? extends IASTNode>>();
			typeToClassMap.put("module", ASTModuleNode.class);
			typeToClassMap.put("uses", ASTUseStmtNode.class);
			typeToClassMap.put("subroutine", ASTSubroutineSubprogramNode.class);
			typeToClassMap.put("call_", ASTCallStmtNode.class);
		}
		return typeToClassMap.get(type);
	}

	public ResultSet query2(String query) throws MalformedGoalException {
		if (getProlog() != null) {
			return new PrologResultSet(getProlog(), query);
		}
		else {
			return null;
		}
	}

	public List<Struct> query(String query) throws MalformedGoalException {

		ArrayList<Struct> sols = new ArrayList<Struct>();
		SolveInfo solveInfo = getProlog().solve(query);

		while (true) {
			try {
				sols.add((Struct) solveInfo.getSolution());
				solveInfo = getProlog().solveNext();
			} catch (NoMoreSolutionException e) {
				break;
			} catch (NoSolutionException e) {
				break;
			}
			//set a hard limit for now
			if (sols.size() > 10000) break;
		}

		return sols;
	}

	public Prolog getProlog() {
		return prolog;
	}

	public void clearTheory() {
		getProlog().clearTheory();
	}

	public void addTheory(String theory) throws InvalidTheoryException {
		getProlog().addTheory(new Theory(theory));
	}

	/*
	public Prolog getPrologX() {
		Prolog prolog = new Prolog();

		//java object binding
		JavaLibrary lib = (JavaLibrary) prolog.getLibrary("alice.tuprolog.lib.JavaLibrary");
		for (Entry<Struct, Object> e : toRegister.entrySet()) {
			try {
				lib.register(e.getKey(), e.getValue());
			} catch (InvalidObjectIdException e1) {
				e1.printStackTrace();
			}
		}

		Theory theory;
		try {
			theory = new Theory(new Struct(new Struct("startme", Term.TRUE), new Struct()));

			int i = 0;
			for (Struct s : clauseList) {

				//buffer 5000 at a time for speed
				theory.append(new Theory(new Struct(s, new Struct())));

				if (i % 5000 == 0 || i == clauseList.size()-1) {
					try { 
						prolog.addTheory(theory);
					}
					catch (InvalidTheoryException e) {
						e.printStackTrace();
					}
					theory = new Theory(new Struct(new Struct("startme", Term.TRUE), new Struct()));
				}

				i++;
			}

		} catch (InvalidTheoryException e) {
			e.printStackTrace();
		}

		return prolog;

	}
	 */

	/*
	public void printClauseList() {
		System.out.println("CodeDBIndex clause list:");
		int i = 0;
		for (Struct s : clauseList) {
			System.out.println(s + ".");
			i++;
			if (i > 1000) break;
		}
		System.out.println("Number of clauses: " + clauseList.size());
	}

	public void clear() {
		clauseList.clear();
	}

	public int size() {
		return clauseList.size();
	}
	 */

	class CodeDBIndexVisitor extends ASTVisitor {

		int compilationUnitID = -1;

		IFortranAST ast;

		CodeDBIndexVisitor(IFortranAST ast) {
			this.ast = ast;
			//contextStack = new Stack<Entry<IASTNode, Term>>();
			parentStack = new Stack<Integer>();

			//add compilation unit fact
			compilationUnitID = addFact("compilationUnit", createStringTerm(ast.getFile().getFullPath().toString()));
			parentStack.push(compilationUnitID);
		}

		//Stack<Entry<IASTNode, Term>> contextStack;
		Stack<Integer> parentStack;


		protected void traverseChildren(IASTNode node, int id) {
			parentStack.push(id);
			traverseChildren(node);
			parentStack.pop();
		}

		protected int addFact(String predicate, int id, Term...termArgs) {
			Term[] terms = new Term[termArgs.length + 1];
			try {
				terms[0] = Term.createTerm(String.valueOf(id));
			} catch (InvalidTermException e) {
				throw new RuntimeException(e);
			}
			System.arraycopy(termArgs, 0, terms, 1, termArgs.length);

			Struct fact = new Struct(predicate, terms);
			clauseList.add(fact);
			return id;
		}

		protected int addFact(String predicate, Term... termArgs) {		
			factID++;  //increment global id generator
			addFact(predicate, factID, termArgs);			
			return factID;
		}

		protected int reserveID() {
			factID++;
			return factID;
		}

		protected Term parentID() {
			return createIntTerm(parentStack.peek());
		}

		private Struct toList(List<Integer> in) {
			if (in.size() == 0) {
				return new Struct(new Term[]{});  //empty list
			} 
			else {
				Term[] terms = new Term[in.size()];
				for (int idx = 0; idx < in.size(); idx++) {
					try {
						terms[idx] = Term.createTerm(in.get(idx).toString());
					} catch (InvalidTermException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return new Struct(terms);
			}
		}

		private Struct toListTerm(List<Term> in) {
			return new Struct(in.toArray(new Term[]{}));
		}

		/*
		private boolean checkContext(Class<?> c) {
			if (contextStack.size() == 0) return false;
			else return c.isInstance(contextStack.peek().getKey());
		}

		private Term contextId() {
			return contextId(0);
		}


		private Term contextId(int depth) {
			if (contextStack.size() == 0) return null;
			else return contextStack.get(contextStack.size() - 1 - depth).getValue();
		}

		protected void traverseChildren(IASTNode node, Term id) {
			contextStack.push(new AbstractMap.SimpleEntry<IASTNode, Term>(node, id));
			traverseChildren(node);
			contextStack.pop();
		}


		private Struct offset(Token t) {
			return new Struct("fileOffset", 
					createStringTerm(t.getLogicalFile().getFullPath().toString()),
					Term.createTerm(String.valueOf(t.getFileOffset())), 
					Term.createTerm(String.valueOf(t.getLength())));
		}
		 */

		/**
		 * module(#id, #compilationUnit, name, [#subprogram_1, ...])
		 */
		@Override
		public void visitASTModuleNode(ASTModuleNode node) {

			Term termName = createStringTerm(node.getModuleStmt().getModuleName().getModuleName().getText());

			listSubprogramIDs = new ArrayList<Integer>();
			int id = reserveID();
			traverseChildren(node, id);

			addFact("module", id, createIntTerm(compilationUnitID), termName, toList(listSubprogramIDs) );
		}

		/**
		 * mainProgram(#id, #compilationUnitID, name, [#subprogram_1, ...])
		 */
		public void visitASTMainProgramNode(ASTMainProgramNode node) {

			Term termName;

			if (node.getProgramStmt() != null) {
				termName= createStringTerm(node.getProgramStmt().getProgramName().getProgramName().getText());
			}
			else {
				termName = createStringTerm("Anonymous");
			}

			listSubprogramIDs = new ArrayList<Integer>();
			listExec = new ArrayList<Integer>();
			int id = reserveID();

			traverseChildren(node, id);

			addFact("mainProgram", id, createIntTerm(compilationUnitID), termName, toList(listSubprogramIDs) );
		};


		/**
		 * uses(#id, #parent, moduleName)
		 */
		@Override
		public void visitASTUseStmtNode(ASTUseStmtNode node) {						
			Term termName = createStringTerm(node.getName().getText());
			int id = reserveID();									

			listEntity = new ArrayList<Integer>();
			traverseChildren(node, id);			

			addFact("uses", id, parentID(), termName, toList(listEntity));
		}

		List<Integer> listEntity = new ArrayList<Integer>();

		/**
		 * usesEntity(#id, #parent, entity, entity rename, only?)
		 */
		@Override
		public void visitASTOnlyNode(ASTOnlyNode node) {
			//TODO: deal with generic spec
			if (node.getGenericSpec() == null) {
				Term termName = createStringTerm(node.getName().getText());
				Term termNewName;
				if (node.getNewName() != null) {
					termNewName = createStringTerm(node.getNewName().getText());
				}
				else {
					termNewName = createStringTerm(node.getName().getText());
				}
				//last term is true if it's an "only" use
				int id = addFact("usesEntity", parentID(), termName, termNewName, Term.TRUE);
				listEntity.add(id);
			}
		}


		/**
		 * usesEntity(#id, #parent, entity, entity rename, only?)
		 */
		@Override
		public void visitASTRenameNode(ASTRenameNode node) {
			Term termName = createStringTerm(node.getName().getText());
			Term termNewName = createStringTerm(node.getNewName().getText());

			//last term is true if it's an "only" use
			int id = addFact("usesEntity", parentID(), termName, termNewName, Term.TRUE);
			listEntity.add(id);
		}


		int currentParamIndex = 0;
		List<Integer> listSubprogramIDs = new ArrayList<Integer>();

		/**
		 * subroutine(#id, #parent, name, [#stmt_1, ...])
		 */
		@Override
		public void visitASTSubroutineSubprogramNode(ASTSubroutineSubprogramNode node) {

			Term termName = createStringTerm(node.getSubroutineStmt().getSubroutineName().getSubroutineName());

			int id = reserveID();

			currentParamIndex = 0;
			listExec = new ArrayList<Integer>();
			//listDecl = new ArrayList<Integer>();
			traverseChildren(node, id);

			addFact("subroutine", id, parentID(), termName, toList(listExec));
			listSubprogramIDs.add(id);
		}

		/**
		 * function(#id, #parent,  name, [#stmt_1, ...])
		 */
		public void visitASTFunctionSubprogramNode(ASTFunctionSubprogramNode node) {

			Term termName = createStringTerm(node.getFunctionStmt().getFunctionName().getFunctionName());
			int id = reserveID();


			//TODO: handle params
			listExec = new ArrayList<Integer>();
			traverseChildren(node, id);

			addFact("function", id, parentID(), termName, toList(listExec));
			listSubprogramIDs.add(id);

		};

		List<Integer> listExec;
		//List<Integer> listDecl;
		List<Term> listEntityDecl;

		/**
		 * decl(#id, #parent, 'type', ['entity_1', ...])
		 */
		@Override
		public void visitASTTypeDeclarationStmtNode(ASTTypeDeclarationStmtNode node) {
			//node.getAttrSpecSeq().get(0).getAttrSpec().
			//node.getEntityDeclList().get(0).g
			Term termType = createStringTerm(toTypeName(node.getTypeSpec()));
			listEntityDecl = new ArrayList<Term>();
			traverseChildren(node);
			addFact("decl", parentID(), termType, toListTerm(listEntityDecl));
		}

		private String toTypeName(ASTTypeSpecNode node) {
			if (node.isCharacter()) return "character";
			else if (node.isComplex()) return "complex";
			else if (node.isDblComplex()) return "doublecomplex";
			else if (node.isDerivedType()) return "type(" + node.getTypeName().getText() + ")";
			else if (node.isDblComplex()) return "double";
			else if (node.isInteger()) return "integer";
			else if (node.isLogical()) return "logical";
			else if (node.isReal()) return "real";
			else return "UNKNOWN";
		}

		@Override
		public void visitASTEntityDeclNode(ASTEntityDeclNode node) {
			listEntityDecl.add(createStringTerm(node.getObjectName().getObjectName()));
		}

		/*
		 * exec(#id, #parent, stmt)
		 */
		/*
		@Override
		public void visitIExecutableConstruct(IExecutableConstruct node) {
			int id = addFact(node.getClass().getSimpleName().replaceFirst("AST", "").toLowerCase(), createIntTerm(parentStack.peek()), createStringTerm(node.toString()));
			listExec.add(id);
		}

		@Override
		public void visitIActionStmt(IActionStmt node) {
			try {
				int id = addFact(node.getClass().getSimpleName().replaceFirst("AST", "").toLowerCase(), createIntTerm(parentStack.peek()), createStringTerm(node.toString()));
				listExec.add(id);
			}
			catch (EmptyStackException e) {
				//ignore
			}
		}
		 */

		/**
		 * def(#id, ref(file, offset, length),  type, intentIn?, intentOut?)
		 */
		protected int addDefinition(Definition def) {

			//definitions may be added redundantly currently, could cache them and look up
			Term termFile = createStringTerm(def.getTokenRef().getFilename());
			Term termOffset = createIntTerm(def.getTokenRef().getOffset());
			Term termLength = createIntTerm(def.getTokenRef().getLength());
			Struct structRef  = new Struct("ref", termFile, termOffset, termLength);

			Term termType = createStringTerm(def.getType().toString());
			/*
			def.getType().processUsing(new TypeProcessor<Term>() {
				@Override
				public Term ifFunctionType(String name,
						FunctionType functionType) {
					functionType.f
				}
			});
			 */

			Term termIntentIn = def.isIntentIn() ? Term.TRUE : Term.FALSE;
			Term termIntentOut = def.isIntentOut() ? Term.TRUE : Term.FALSE;

			return addFact("def", structRef, termType, termIntentIn, termIntentOut);

		}

		protected int addDefinition(Token t) {
			List<Definition> defs = t.resolveBinding();
			if (defs.size() > 0) {
				return addDefinition(defs.get(0));
			}
			else {
				return -1;
			}
		}

		/**
		 * subroutineParam(#id, #parent, idx, name, #def)
		 */		
		@Override
		public void visitASTSubroutineParNode(ASTSubroutineParNode node) {

			int defId = addDefinition(node.getVariableName());

			Term termName = createStringTerm(node.getVariableName().getText());
			Term termIdx = createIntTerm(currentParamIndex);

			int id = addFact("subroutineParam", 
					parentID(),
					termIdx, 
					termName, 
					createIntTerm(defId));

			//assumes visitor is in order
			currentParamIndex++;

		}


		/**
		 * call(#id, #parent, subroutine name)
		 */
		@Override
		public void visitASTCallStmtNode(ASTCallStmtNode node) {

			Term termName = createStringTerm(node.getSubroutineName().getText());

			int id = reserveID();

			currentArgIndex = 0;
			traverseChildren(node, id);

			addFact("call", id, parentID(), termName);
			listExec.add(id);

		}

		int currentArgIndex = 0;
		int childExprId = -1;

		/**
		 * callArg(#id, #parent, idx, #expr)
		 */
		@Override
		public void visitASTSubroutineArgNode(ASTSubroutineArgNode node) {

			int id = reserveID();

			childExprId = -1;
			traverseChildren(node, id);

			Term termIdx = createIntTerm(currentArgIndex);
			Term termExpr = createIntTerm(childExprId);

			addFact("callArg", id, parentID(), termIdx, termExpr);
			currentArgIndex++;

		}

		/**
		 * 
		 * varRef(#id, #parent, name, #def)
		 */
		@Override
		public void visitASTVarOrFnRefNode(ASTVarOrFnRefNode node) {	
			int defId = addDefinition(node.getName().getName());
			Term termName = createStringTerm(node.getName().getName());
			childExprId = addFact("varRef", parentID(), termName, createIntTerm(defId));
		}

		/**
		 * const(#id, #parent, 'string', value)
		 * type is one of: 'string', 'double', 'integer', 'real', etc. 
		 */
		@Override
		public void visitASTStringConstNode(ASTStringConstNode node) {
			Term termVal = createStringTerm(node.getStringConst());
			Term termType = createStringTerm("string");
			childExprId = addFact("const", parentID(), termType, termVal);
		}

		@Override
		public void visitASTIntConstNode(ASTIntConstNode node) {
			Term termVal = createStringTerm(node.getIntConst());
			Term termType = createStringTerm("integer");
			childExprId = addFact("const", parentID(), termType, termVal);
		}

		@Override
		public void visitASTRealConstNode(ASTRealConstNode node) {
			Term termVal = createStringTerm(node.getRealConst());
			Term termType = createStringTerm("real");
			childExprId = addFact("const", parentID(), termType, termVal);
		}

		@Override
		public void visitASTDblConstNode(ASTDblConstNode node) {
			Term termVal = createStringTerm(node.getDblConst());
			Term termType = createStringTerm("double");
			childExprId = addFact("const", parentID(), termType, termVal);
		}

		@Override
		public void visitASTArrayConstructorNode(ASTArrayConstructorNode node) {
			Term termVal = createStringTerm(node.toString());  //TODO: fixme
			Term termType = createStringTerm("array");
			childExprId = addFact("arrayConstructor", parentID(), termType, termVal);
		}



	}


	private static Term createIntTerm(int i) {
		try {
			return Term.createTerm(String.valueOf(i));
		} catch (InvalidTermException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	private static Term createStringTerm(Token t) {
		return createStringTerm(t.getText());
	}

	private static Term createStringTerm(String s) {
		s = s.replaceAll("'", "''");
		s = s.replaceAll("\n", "\\n");

		try {
			if (s.contains("'")) {
				return Term.createTerm("\"" + s + "\"");
			}
			else {
				return Term.createTerm("'" + s + "'");
			}
		}
		catch (InvalidTermException e) {
			return null;
		}
	}


}
