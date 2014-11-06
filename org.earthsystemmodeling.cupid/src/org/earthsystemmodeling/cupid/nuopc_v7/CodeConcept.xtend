package org.earthsystemmodeling.cupid.nuopc_v7;

import java.util.List
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex
import org.eclipse.photran.internal.core.parser.IASTNode
import org.eclipse.ltk.core.refactoring.TextFileChange
import alice.tuprolog.MalformedGoalException
import org.earthsystemmodeling.cupid.core.CupidActivator

public abstract class CodeConcept<S extends CodeConcept, P extends CodeConcept, A extends IASTNode> {
	
	var protected A _ref
	var protected P _parent
	var protected long _id  //from code DB
	var protected CodeDBIndex _codeDB
	
	new(P parent, CodeDBIndex codeDB) {
		_codeDB = codeDB
		_parent = parent
	}
	
	def long parentID() {
		if (_parent?._id > 0) _parent._id
		else _parent?.parentID()
	}
	
	def abstract S reverse()
	def List<S> reverseMultiple() {newArrayList(reverse)}
	
	def abstract TextFileChange forward()

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
	
}
