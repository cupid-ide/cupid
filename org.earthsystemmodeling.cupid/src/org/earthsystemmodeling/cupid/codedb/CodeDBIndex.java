package org.earthsystemmodeling.cupid.codedb;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTArrayConstructorNode;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTDblConstNode;
import org.eclipse.photran.internal.core.parser.ASTExecutableProgramNode;
import org.eclipse.photran.internal.core.parser.ASTIntConstNode;
import org.eclipse.photran.internal.core.parser.ASTMainProgramNode;
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
import org.eclipse.photran.internal.core.parser.IActionStmt;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IExecutableConstruct;
import org.eclipse.photran.internal.core.parser.IModuleSubprogram;
import org.eclipse.photran.internal.core.parser.IProgramUnit;

import com.google.common.collect.Multimap;

import alice.tuprolog.InvalidTermException;
import alice.tuprolog.InvalidTheoryException;
import alice.tuprolog.Prolog;
import alice.tuprolog.Struct;
import alice.tuprolog.Term;
import alice.tuprolog.Theory;
import alice.tuprolog.lib.InvalidObjectIdException;
import alice.tuprolog.lib.JavaLibrary;


@SuppressWarnings("restriction")
public class CodeDBIndex {
	
	/*
	 :- dynamic( atom_counter/2 ).

	   counters( Name, Number ) :-
	   atom_counter( Name, LastNumber ),
	   retract( atom_counter( Name, LastNumber ) ),
	   Number is LastNumber + 1,
	   assertz( atom_counter( Name, Number ) ),
	   !.

	   counters( Name, 0 ) :-
	   assertz( atom_counter( Name, 0 ) ),
	   !.
	*/

	ArrayList<Struct> clauseList = new ArrayList<Struct>(1024);
	Map<Struct, Object> toRegister = new HashMap<Struct, Object>();
	
	int factID = -1;  //increments each time
	
	public void indexASTs(Set<IFortranAST> asts) {			
		for (IFortranAST ast : asts) {
			ast.accept(new CodeDBIndexVisitor(ast));
			
			//control flow analysis
			//ControlFlowAnalysis cfa = ControlFlowAnalysis.analyze(ast.getFile().getName(), ast.getRoot());
			//Multimap<IASTNode, IASTNode> flowMap = cfa.getFlowMap();
			//System.out.println(flowMap.size());
		}
	}
	
	private Struct toRegister(Term prefixId, String id, Object obj) {
		String prefix = ((Struct) prefixId).getName();
		return toRegister(prefix + "__" + id, obj);
	}
	
	private Struct toRegister(String id, Object obj) {
		Struct s = new Struct("java_obj_" + id);
		toRegister.put(s, obj);
		return s;
	}
	
	public Prolog getProlog() {
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
						//System.out.println("clause (-1): " + clauseList.get(e.line - 1));
						//System.out.println("clause: " + clauseList.get(e.line));
						//System.out.println("clause (+1): " + clauseList.get(e.line + 1));
						
						//System.out.println("Theory=========================");
						//Iterator<? extends Term> iter = theory.iterator(prolog);
						//int c = 0;
						//while(iter.hasNext()) {
						//	System.out.println(iter.next() + ".");
						//	c++;
						//}
						//System.out.println("End Theory=====================: " + e.clause);
					}
					theory = new Theory(new Struct(new Struct("startme", Term.TRUE), new Struct()));
				}
				
				i++;
			}
		
		} catch (InvalidTheoryException e) {
			e.printStackTrace();
		}
		
		//prolog.getTheoryManager().
		return prolog;
		
	}
	
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
	
	class CodeDBIndexVisitor extends ASTVisitor {
		
		int compilationUnitID = -1;
		
		IFortranAST ast;
		
		CodeDBIndexVisitor(IFortranAST ast) {
			this.ast = ast;
			//contextStack = new Stack<Entry<IASTNode, Term>>();
			parentStack = new Stack<Integer>();
			
			//add compilation unit fact
			compilationUnitID = addFact("compilationUnit", createStringTerm(ast.getFile().getFullPath().toString()));
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
			terms[0] = Term.createTerm(String.valueOf(id));
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
					terms[idx] = Term.createTerm(in.get(idx).toString());
				}
				return new Struct(terms);
			}
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
			Term termName = createStringTerm(node.getProgramStmt().getProgramName().getProgramName().getText());
			
			listSubprogramIDs = new ArrayList<Integer>();
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
		 * subroutine(#id, #parent, name, [#stmt_1, #stmt_2...])
		 */
		@Override
		public void visitASTSubroutineSubprogramNode(ASTSubroutineSubprogramNode node) {
			
			Term termName = createStringTerm(node.getSubroutineStmt().getSubroutineName().getSubroutineName().getText());
			
			int id = reserveID();
			
			currentParamIndex = 0;
			listExec = new ArrayList<Integer>();
			traverseChildren(node, id);
			
			addFact("subroutine", id, parentID(), termName, toList(listExec));
			listSubprogramIDs.add(id);
		}
		
		List<Integer> listExec = new ArrayList<Integer>();
		
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
			
			//definitions may be added redundantly currently
			
			Term termFile = createStringTerm(def.getTokenRef().getFilename());
			Term termOffset = createIntTerm(def.getTokenRef().getOffset());
			Term termLength = createIntTerm(def.getTokenRef().getLength());
			Struct structRef  = new Struct("ref", termFile, termOffset, termLength);
			
			Term termType = createStringTerm(def.getType().toString());
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
			/*
			List<Definition> defs = node.getVariableName().resolveBinding();
			int defId = -1;
			
			if (defs.size() > 0) {
				Definition def = defs.get(0);
				defId = addDefinition(def);
			}
			*/
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
		return Term.createTerm(String.valueOf(i));
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
			return Term.createTerm("INVALID_TERM_EXCEPTION");
		}
	}
	
	
}
