package org.earthsystemmodeling.cupid.nuopc;

import alice.tuprolog.MalformedGoalException
import java.io.ByteArrayInputStream
import java.lang.reflect.Constructor
import java.lang.reflect.Field
import java.util.ArrayList
import java.util.List
import java.util.regex.Pattern
import org.earthsystemmodeling.cupid.annotation.Child
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex
import org.earthsystemmodeling.cupid.core.CupidActivator
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.photran.core.IFortranAST
import org.eclipse.photran.internal.core.parser.IASTNode
import org.eclipse.photran.internal.core.reindenter.Reindenter
import org.eclipse.photran.internal.core.reindenter.Reindenter.Strategy
import org.eclipse.photran.internal.core.vpg.PhotranVPG
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.ltk.core.refactoring.Change
import org.apache.commons.io.IOUtils
import org.eclipse.ltk.core.refactoring.TextFileChange
import org.eclipse.text.edits.ReplaceEdit

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
	
	@Accessors(PUBLIC_GETTER)
	var protected List<MarkerLoc> paramMarkers;
	
	new(P parent) {
		init(parent)
		paramMarkers = newArrayList()
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
		
		for (Field field : getChildFields) {
			
			//deal with lists
			if (List.isAssignableFrom(field.type)) {
				
				//use reflection to get type of CodeConcept stored in the list
				//var pt = field.type.genericSuperclass as ParameterizedType
				//var clazz = pt.actualTypeArguments.get(0) as Class<?>
				//var con = clazz.constructors.findFirst[it.parameterTypes.length==1]
				
				var theList = field.get(this) as List<CodeConcept<?,?>>
				if (theList != null) {
					for (var i=0; i<theList.size(); i++) {
						theList.set(i, theList.get(i).fward)
					}
				}
				
			}
			//deal with single element
			else {
				var CodeConcept<?,?> childConcept = field.get(this) as CodeConcept<?,?>
				if (childConcept == null 
					//annotation determines if a child should be created automatically
					&& field.getAnnotation(Child).forward   
				) {
					//System.out.println("FORWARDING: " + field.name)
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
				if (childConcept != null) {
					field.set(this, childConcept.fward)
				}
			}
		}		
		this
	}
	
	def Change generateChange() {
		
		if (_context == null) {
			return _parent.generateChange
		}
		else if (_context instanceof IFile) {
			
			Reindenter.reindent(getAST.root, getAST, Strategy.REINDENT_EACH_LINE);
			
			val fileContentsBefore = IOUtils.toString(_context.getContents(false))
			val fileContentsAfter = replaceParameters(getAST.root.toString)
			val charsInFile = fileContentsBefore.length
			
			PhotranVPG.instance.commitChangesFromInMemoryASTs(
						new NullProgressMonitor(), 0, _context as IFile)
			_ast = null  //force recompute of ast
			PhotranVPG.instance.releaseAST(_context as IFile)
			
			if (!fileContentsAfter.equals(fileContentsBefore)) {
				val textFileChange = new TextFileChange("Cupid code generation: " + _context.getFullPath().toOSString(), _context)
	            textFileChange.setEdit(new ReplaceEdit(0, charsInFile, fileContentsAfter));
	            return textFileChange	
			}
		}
		
	}
	
	static String PARAM_REGEX = "CUPIDPARAM\\$(CHAR|INT)\\$([^\\$]*)\\$";
	static Pattern PARAM_PATTERN = Pattern.compile(PARAM_REGEX);
	
	static class MarkerLoc {	
		public int start
		public int end
		
		new(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
	
	def replaceParameters(String content) {
		val matcher = PARAM_PATTERN.matcher(content);
    	val sb = new StringBuffer();
        
        while (matcher.find()) {
        	matcher.appendReplacement(sb, "$2");
        	val endLoc = sb.length();
        	val startLoc = endLoc - matcher.group(2).length();
        	paramMarkers.add(new MarkerLoc(startLoc, endLoc));
        }
        
        matcher.appendTail(sb);
		sb.toString
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
