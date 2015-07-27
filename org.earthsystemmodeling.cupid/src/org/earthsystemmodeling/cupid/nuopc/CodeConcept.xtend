package org.earthsystemmodeling.cupid.nuopc;

import java.util.List
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex
import org.eclipse.photran.internal.core.parser.IASTNode
import org.eclipse.ltk.core.refactoring.TextFileChange
import alice.tuprolog.MalformedGoalException
import org.earthsystemmodeling.cupid.core.CupidActivator
import org.eclipse.photran.core.IFortranAST

public abstract class CodeConcept<P extends CodeConcept<?,?>, A extends IASTNode> {
	
	var public P _parent
	var public long _id  
	var public CodeDBIndex _codeDB
	var public A _astRef
	
	new(P parent) {
		_parent = parent
		_codeDB = parent?._codeDB
	}
	
	def long parentID() {
		if (_parent?._id > 0) _parent._id
		else _parent?.parentID()
	}
	
	/*
	def CodeConcept<?,?> nearestAncestor(Class<?> c) {
		var CodeConcept<?,?> cur = _parent;
		while (cur != null) {
			if (c.isInstance(cur)) return cur;
		}
		null;
	}
	* 
	*/
	
	def A getASTRef() {
		if (_astRef != null) {
			_astRef
		}
		else {
			_codeDB.findASTNode(_id);
		}
	}
	
	def setASTRef(A astRef) {
		_astRef = astRef
	}
	
	def getAST() {
		if (_id > 0)
			_codeDB.findAST(_id)
		else
			_codeDB.findAST(parentID)
	}
		
	def CodeConcept<P,A> reverse() {this}
	def List<CodeConcept<P,A>> reverseMultiple() {newArrayList(reverse)}
	
	def IFortranAST forward() throws CodeGenerationException {null}
	
	def String name() {null}
	
	def execQuery(CharSequence query) {
		try {
			var rs = _codeDB.query2(query.toString)
			return rs
		} catch (MalformedGoalException e) {
			CupidActivator.log("Bad query", e)
		}
		null
	}
	
	override toString() {
		'''«this.class.simpleName» : «_id»'''
	}
	
	def paramch(String defaultVal) {
		'''CUPIDPARAM$CHAR$«defaultVal»$'''
	}
	
	def paramint(int defaultVal) {
		'''CUPIDPARAM$INT$«defaultVal»$'''
	}
	
	
	
}
