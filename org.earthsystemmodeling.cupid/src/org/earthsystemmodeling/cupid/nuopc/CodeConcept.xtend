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
import org.eclipse.photran.internal.core.vpg.PhotranTokenRef
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Constructor
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IFile
import org.eclipse.photran.internal.core.vpg.PhotranVPG
import java.io.ByteArrayInputStream
import org.earthsystemmodeling.cupid.codedb.PrologResultSet
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.photran.internal.core.reindenter.Reindenter
import org.eclipse.photran.internal.core.reindenter.Reindenter.Strategy
import org.earthsystemmodeling.cupid.handlers.RewriteASTRunnable

public abstract class CodeConcept<P extends CodeConcept<?,?>, A extends IASTNode> {
	
	var public P _parent
	var public long _id = -1
	var protected CodeDBIndex _codeDB
	var protected A _astRef
	//var protected Class<A> _astClass
	var protected IResource _context
	var protected IFortranAST _ast
	
	var private List<Field> childFields;
	
	var protected Constructor<?> instanceConstructor;
	
	new(P parent) {
		init(parent)
		
		//use reflection to get class instance from generic type
		//var parameterizedType = getClass().getGenericSuperclass() as ParameterizedType
		//_astClass = parameterizedType.actualTypeArguments.get(1) as Class<A>
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
		else if (_codeDB != null && _id >= 0) {
			_codeDB.findASTNode(_id);
		}
		else {
			null
		}
	}
	
	def setASTRef(A astRef) {
		_astRef = astRef
	}
	
	def getAST() {
		if (_ast != null)
			_ast
		else if (_context != null && _context instanceof IFile) {
			_ast = PhotranVPG.instance.acquireTransientAST(_context as IFile)
			_ast
		}
		else if (_id > 0)
			_codeDB.findAST(_id)
		else
			_codeDB.findAST(parentID)
	}
		
	def CodeConcept<P,A> reverse() {this}
	def List<CodeConcept<P,A>> reverseMultiple() {newArrayList(reverse)}
	
	def IFortranAST forward() throws CodeGenerationException {
		null
	}
	
	//temporarily in place to change return type
	def CodeConcept<P,A> fward() throws CodeGenerationException {
		//default behavior is to forward all children
		//with forward annotation set to true
		
		for (Field field : getChildFields.filter[
			it.getAnnotation(Child).forward
			&& !List.isAssignableFrom(it.type)  //exclude list types for now
		]) {
			var CodeConcept<?,?> childConcept = field.get(this) as CodeConcept<?,?>
			if (childConcept == null) {
				System.out.println("FORWARDING: " + field.name)
				//create new instance
				var con = field.type.constructors.findFirst[it.parameterTypes.length==1]
				if (con != null) {
					childConcept = con.newInstance(this) as CodeConcept<?,?>
				}
				else {
        			throw new CodeGenerationException("Could not find constructor for field " 
        					+ field.name + " with class " + field.type.name);
        		}
			}
			field.set(this, childConcept.fward)
		}		
		this
	}
	
	def commit() {
		if (_context != null) {
			if (_ast == null) {
				//if ast does not exist yet, then write out the code
				//and the ast will be acquired for the reindenter
				writeToFile(_astRef.toString)
			}
			
			Reindenter.reindent(getAST.root, getAST, Strategy.REINDENT_EACH_LINE);  //reindent entire file
			//writeToFile(_astRef.toString)  
			var rewriter = new RewriteASTRunnable(getAST);
			rewriter.run(new NullProgressMonitor());
			
			//PhotranVPG.instance.commitChangesFromInMemoryASTs(
			//			new NullProgressMonitor(), 0, _context as IFile)
			_ast = null
			PhotranVPG.instance.releaseAST(_context as IFile)
			
		}
		else if (_parent != null) {
			_parent.commit
		}
		else {
			throw new CodeGenerationException("Cannot commit change because no file provided")
		}
	}
	
	def writeToFile(String content) {
		var file = _context as IFile
		var is = new ByteArrayInputStream(content.bytes)
		if (!file.exists) {
			file.create(is, true, null)
		}
		else {
			file.setContents(is, true, false, null)
		}
		is.close
	}
	
	def newInstance() {
		if (instanceConstructor == null)
			instanceConstructor = this.class.constructors.findFirst[parameterTypes.length==1]
		if (instanceConstructor == null) throw new ReverseEngineerException("Cannot find constructor for class: " + this.class.name)
		return instanceConstructor.newInstance(_parent) as CodeConcept<P,A>
	}
	
	def String name() {null}
	
	def execQuery(CharSequence query) {
		if (_codeDB != null) {
			try {
				var rs = _codeDB.query2(query.toString)
				return rs
			} catch (MalformedGoalException e) {
				CupidActivator.log("Bad query", e)
			}
		}
		else null
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
	
	def paramint(String defaultVal) {
		'''CUPIDPARAM$INT$«defaultVal»$'''
	}
		
	
}
