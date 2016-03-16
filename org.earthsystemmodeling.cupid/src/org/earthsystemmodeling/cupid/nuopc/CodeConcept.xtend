package org.earthsystemmodeling.cupid.nuopc;

import java.lang.reflect.Constructor
import java.lang.reflect.Field
import java.lang.reflect.ParameterizedType
import java.util.ArrayList
import java.util.List
import java.util.regex.Pattern
import org.apache.commons.io.IOUtils
import org.earthsystemmodeling.cupid.annotation.Child
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.ltk.core.refactoring.Change
import org.eclipse.ltk.core.refactoring.TextFileChange
import org.eclipse.photran.core.IFortranAST
import org.eclipse.photran.internal.core.parser.IASTNode
import org.eclipse.photran.internal.core.reindenter.Reindenter
import org.eclipse.photran.internal.core.reindenter.Reindenter.Strategy
import org.eclipse.photran.internal.core.vpg.PhotranVPG
import org.eclipse.text.edits.ReplaceEdit
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.core.runtime.IProgressMonitor

public abstract class CodeConcept<P extends CodeConcept<?,?>, A extends IASTNode> {
	
	var public P _parent
	var protected A _astRef
	var protected IResource _context
	var protected IFortranAST _ast
	
	var private List<Field> childFields;
	
	var protected Constructor<?> instanceConstructor;
	
	@Accessors(PUBLIC_GETTER)
	var protected List<MarkerLoc> paramMarkers;
	
	new(P parent) {
		this(parent, null)
	}
	
	new(P parent, IResource context) {
		_context = context
		_parent = parent
		paramMarkers = newArrayList()
	}
		
	def void setOrAddChild(CodeConcept<?,?> child) {		
		//find field of matching type and assign child to it
		var childField = getChildFields.findFirst[it.type.isInstance(child)]
		if (childField != null) {
			childField.set(this, child)
		}
		else {
			childField = getChildFields.findFirst[
				it.type == List &&
				{
					val ptype = it.genericType as ParameterizedType
					val clazz = ptype.actualTypeArguments.get(0) as Class<?>
					if (clazz==child.class) true
					else false
				}
			]
			if (childField != null) {
				val lst = childField.get(this) as List;
				if (lst != null) {
					lst.add(child);
				}
				else {
					throw new CodeGenerationException("Cannot add child to null list")
				}
			}
			else {
				throw new CodeGenerationException("Error finding child field")
			}
		}
	}
	
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
		else null
	}
	
		
	def setASTRef(A astRef) {
		_astRef = astRef
	}
	
	def <T extends CodeConcept<?,?>> T findNearestAncestor(Class<? extends IASTNode> classToFind) {
		if (classToFind.isInstance(_astRef)) this as T
		else _parent?.findNearestAncestor(classToFind) 
	}
	
	def getAST() {
		if (_ast != null)
			_ast
		else if (_context != null && _context instanceof IFile) {
			PhotranVPG.instance.releaseAST(_context as IFile) //force re-parse
			_ast = PhotranVPG.instance.acquireTransientAST(_context as IFile)
			_ast
		}
		else null
	}
		
	def <T extends CodeConcept<?,?>> T reverse() {this as T}
	def List<CodeConcept<P,A>> reverseMultiple() {newArrayList(reverse)}
	
		
	def <T extends CodeConcept<?,?>> T forward() throws CodeGenerationException {
		//default behavior is to forward all children
		//with forward annotation set to true
		
		for (Field field : getChildFields) {
			
			//deal with lists
			if (List.isAssignableFrom(field.type)) {
				var theList = field.get(this) as List<CodeConcept<?,?>>
				if (theList != null) {
					for (var i=0; i<theList.size(); i++) {
						theList.set(i, theList.get(i).forward)
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
					field.set(this, childConcept.forward)
				}
			}
		}		
		this as T
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
	
	def void forward(IProgressMonitor pm) {
		forward
		generateChange.perform(pm)
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
	
	
	def paramch(String defaultVal) {
		if (defaultVal.startsWith("'") && defaultVal.endsWith("'")) {
			return ''''CUPIDPARAM$CHAR$«defaultVal.subSequence(1, defaultVal.length-1)+"$'"»'''
		}
		else if (defaultVal.startsWith("\"") && defaultVal.endsWith("\"")) {
			return '''"CUPIDPARAM$CHAR$«defaultVal.subSequence(1, defaultVal.length-1)»$"'''
		}
		else {
		'''CUPIDPARAM$CHAR$«defaultVal»$'''
		}
	}
	
	def paramint(int defaultVal) {
		'''CUPIDPARAM$INT$«defaultVal»$'''
	}
	
	def paramint(String defaultVal) {
		'''CUPIDPARAM$INT$«defaultVal»$'''
	}
		
	
}
