package org.earthsystemmodeling.cupid.nuopc_v7;

import java.util.List
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex
import org.eclipse.photran.internal.core.parser.IASTNode
import org.eclipse.ltk.core.refactoring.TextFileChange
import alice.tuprolog.MalformedGoalException
import org.earthsystemmodeling.cupid.core.CupidActivator
import org.eclipse.photran.core.IFortranAST

public abstract class CodeConcept<P extends CodeConcept<?,?>, A extends IASTNode> {
	
	var protected P _parent
	var protected long _id  
	var protected CodeDBIndex _codeDB
	var protected A _astRef
	
	new(P parent) {
		_parent = parent
		_codeDB = parent?._codeDB
	}
	
	def long parentID() {
		if (_parent?._id > 0) _parent._id
		else _parent?.parentID()
	}
	
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
	
	def abstract IFortranAST forward()
	
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
