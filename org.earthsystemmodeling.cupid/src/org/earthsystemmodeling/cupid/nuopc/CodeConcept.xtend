package org.earthsystemmodeling.cupid.nuopc;

import alice.tuprolog.MalformedGoalException
import java.lang.reflect.Field
import java.util.ArrayList
import java.util.List
import org.earthsystemmodeling.cupid.annotation.Child
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex
import org.earthsystemmodeling.cupid.core.CupidActivator
import org.eclipse.photran.core.IFortranAST
import org.eclipse.photran.internal.core.parser.IASTNode

public abstract class CodeConcept<P extends CodeConcept<?,?>, A extends IASTNode> {
	
	var public P _parent
	var public long _id  
	var public CodeDBIndex _codeDB
	var public A _astRef
	
	var private List<Field> childFields;
	
	new(P parent) {
		init(parent)
	}
	
	def init(P parent) {
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
	
	def protected List<Field> getChildFields() {
		if (childFields == null) {
			childFields = new ArrayList<Field>();		
			for (Field f : this.class.fields) {
				if (f.getAnnotation(Child) != null) {
					childFields.add(f)
				}
			}
		}
		childFields
	}
	
	/**
	 * Validate this code concept.  Default behavior is to make sure all
	 * children that are required (min>0) are present and to validate
	 * recursively.
	 */
	def boolean validate(List<String> errors) {	
		for (Field f : getChildFields) {
			if (!validate(f, errors)) return false			
		}
		true
	}
	
	def protected boolean validate(List<CodeConcept<?,?>> codeConcepts, List<String> errors) {
		for (CodeConcept<?,?> cc : codeConcepts) {
			if (!cc.validate(errors)) return false;
		}
		true
	}
	
	def protected boolean validate(Field f, List<String> errors) {
		val childAnn = f.getAnnotation(Child)
		if (f.type == List) {
			var lst = f.get(this) as List<CodeConcept<?,?>>
			if (lst == null && childAnn.min>0) {
				errors.add("Min cardinality not satisfied for field " + f.name);
				return false;
			}
			else if (lst !=null && lst.size < childAnn.min) {
				errors.add("Min cardinality not satisfied for field " + f.name);
				return false;
			}
			else {
				return validate(lst, errors)	
			}
		}
		else {
			var obj = f.get(this) as CodeConcept<?,?>
			if (obj==null && childAnn.min>0) {
				errors.add("Min cardinality not satisfied for field " + f.name);
				return false;
			}
			else if (obj!=null) {
				return obj.validate(errors)
			}
			else {
				true
			}
		}
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
