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
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode
import org.eclipse.photran.internal.core.parser.IDeclarationConstruct
import org.eclipse.photran.internal.core.parser.IBodyConstruct
import org.eclipse.photran.internal.core.parser.IASTListNode
import static org.earthsystemmodeling.cupid.util.CodeExtraction.*
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode
import org.eclipse.photran.internal.core.parser.ASTRenameNode
import org.eclipse.photran.internal.core.parser.ISpecificationPartConstruct
import static extension org.earthsystemmodeling.cupid.nuopc.ASTQuery.*
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.photran.internal.core.vpg.eclipse.VPGSchedulingRule
import org.eclipse.photran.internal.ui.actions.VPGWindowActionDelegate
import org.eclipse.photran.internal.core.vpg.eclipse.EclipseVPG
import org.eclipse.core.runtime.jobs.MultiRule
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Status
import org.eclipse.compare.internal.DocLineComparator
import org.eclipse.jface.text.Document
import org.eclipse.compare.rangedifferencer.RangeDifferencer
import org.eclipse.compare.rangedifferencer.RangeDifference
import org.eclipse.core.resources.IMarker
import java.io.ByteArrayInputStream
import org.eclipse.core.resources.WorkspaceJob
import org.eclipse.core.runtime.CoreException
import org.earthsystemmodeling.cupid.core.CupidActivator
import org.eclipse.photran.internal.core.parser.ASTOnlyNode

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
		
	def IResource getContext() {
		if (_context != null) return _context
		else if (_parent != null) return _parent.getContext
		else return null
	}	
		
	def void setOrAddChild(CodeConcept<?,?> child) {
		setOrAddChild(child, true)
	}
		
	def void setOrAddChild(CodeConcept<?,?> child, boolean failIfMissing) {		
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
					if (!lst.contains(child)) {
						lst.add(child);
					}
				}
				else {
					throw new CodeGenerationException("Cannot add child to null list")
				}
			}
			else if (failIfMissing) {
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
		if (codeConcepts != null) {
			for (CodeConcept<?,?> cc : codeConcepts) {
				if (!cc.validate(errors)) return false;
			}
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
	
	def getASTOLD() {
		/*
		if (_ast != null)
			_ast
		else if (_context != null && _context instanceof IFile) {
			PhotranVPG.instance.releaseAST(_context as IFile) //force re-parse
			_ast = PhotranVPG.instance.acquireTransientAST(_context as IFile)
			_ast
		}
		else null
		* 
		*/
	}
	
	def getAST() {
		if (_ast != null) {
			_ast
		}
		else if (_context != null && _context instanceof IFile) {
			//val astJob = new AccessASTJob(_context as IFile)
			//astJob.schedule
			//astJob.join
			//return astJob.ast
			//assume we have lock
			_ast = PhotranVPG.instance.acquireTransientAST(_context as IFile)
			_ast
		}
		else null
	}
	
	/*
	static class AccessASTJob extends Job {
	
		val IFile file
		
		@Accessors(PUBLIC_GETTER)
		var IFortranAST ast
		
		new(IFile file) {
			super("Access Fortran AST")
			//setRule(MultiRule.combine(VPGSchedulingRule.getInstance(),
            //        ResourcesPlugin.getWorkspace().getRoot()))
           	setRule(VPGSchedulingRule.getInstance())
            
	        this.file = file
		}
		
		override protected run(IProgressMonitor monitor) {
			ast = PhotranVPG.instance.acquireTransientAST(file)
			return Status.OK_STATUS
		}
		
	}
	*/
	
	/*
	static class ReleaseASTJob extends Job {
	
		val IFile file
		
		new(IFile file) {
			super("Release Fortran AST")
			//setRule(MultiRule.combine(VPGSchedulingRule.getInstance(),
            //        ResourcesPlugin.getWorkspace().getRoot()))
            setRule(VPGSchedulingRule.getInstance())
            this.file = file
		}
		
		override protected run(IProgressMonitor monitor) {
			PhotranVPG.instance.releaseAST(file)
			return Status.OK_STATUS
		}
		
	}
	*/
	
	
	static class ForceReindexJob extends WorkspaceJob {
	
		val IFile file
		
		new(IFile file) {
			super("Reindex Fortran AST")
			//setRule(MultiRule.combine(VPGSchedulingRule.getInstance(),
            //        ResourcesPlugin.getWorkspace().getRoot()))
            setRule(VPGSchedulingRule.getInstance())
            this.file = file
		}
		
		override runInWorkspace(IProgressMonitor monitor) {
			val filename = PhotranVPG.getFilenameForIFile(file)
			PhotranVPG.instance.forceRecomputationOfEdgesAndAnnotations(filename)
			return Status.OK_STATUS
		}
			
	}
		
	def <T extends CodeConcept<?,?>> T reverse() throws ReverseEngineerException {this as T}
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
	
	/*
	def Change generateChange() {
		
		if (_context == null) {
			return _parent.generateChange
		}
		else if (_context instanceof IFile) {
			
			Reindenter.reindent(getAST.root, getAST, Strategy.REINDENT_EACH_LINE);
			
			val fileContentsBefore = IOUtils.toString(_context.getContents(false))
			val fileContentsAfter = replaceParameters(getAST.root.toString)
			val charsInFile = fileContentsBefore.length
			
			//PhotranVPG.instance.commitChangesFromInMemoryASTs(
			//			new NullProgressMonitor(), 0, _context as IFile)
			
			//_ast = null  //force recompute of ast
			//PhotranVPG.instance.releaseAST(_context as IFile)
			
			val astJob = new ReleaseASTJob(_context as IFile)
			astJob.schedule
			astJob.join
			
			if (!fileContentsAfter.equals(fileContentsBefore)) {
				val textFileChange = new TextFileChange("Cupid code generation: " + _context.getFullPath().toOSString(), _context)
	            textFileChange.setEdit(new ReplaceEdit(0, charsInFile, fileContentsAfter));
	            return textFileChange	
			}
		}
		
	}
	*/
	
	def void applyChanges(IProgressMonitor monitor) {
		
		if (_context == null || !(_context instanceof IFile)) {
			_parent.applyChanges(monitor)
			return
		}
		
		val file = _context as IFile
		val ast = getAST
		
		Reindenter.reindent(ast.root, ast, Strategy.REINDENT_EACH_LINE)
			
		val fileContentsBefore = IOUtils.toString(file.getContents(false))
		val fileContentsAfter = replaceParameters(ast.root.toString)

		//System.out.println(file.modificationStamp + " : " + file.localTimeStamp)
		file.setContents(new ByteArrayInputStream(fileContentsAfter.bytes), true, true, monitor)
		
		//val filename = PhotranVPG.getFilenameForIFile(file)
		//PhotranVPG.instance.forceRecomputationOfEdgesAndAnnotations(filename)
		//PhotranVPG.instance.deleteAllEntriesFor(filename)
		
		//if (!PhotranVPG.instance.isOutOfDate(filename)) {
		//	throw new RuntimeException("File should be out of date!")
		//}
		
		//file.touch(monitor)
		//val filename = PhotranVPG.getFilenameForIFile(file)
		//PhotranVPG.instance.forceRecomputationOfEdgesAndAnnotations(filename)
		//System.out.println(file.modificationStamp + " : " + file.localTimeStamp)
		
		val reindexJob = new ForceReindexJob(file)
		reindexJob.schedule
		val completed = reindexJob.join(2000, monitor)
		if (!completed) {
			CupidActivator.debug("Reindex job failed to join in 2 seconds.")
		}		
		 
		//val charsInFile = fileContentsBefore.length
		//val textFileChange = new TextFileChange("Cupid code generation: " + file.getFullPath().toOSString(), file)
	    //textFileChange.setEdit(new ReplaceEdit(0, charsInFile, fileContentsAfter));
	    //textFileChange.setSaveMode(TextFileChange.FORCE_SAVE)
	       
	    //System.out.println(file.modificationStamp + " : " + file.localTimeStamp)
	    //textFileChange.perform(monitor)
	    //file.refreshLocal(IResource.DEPTH_ZERO, monitor)
		//System.out.println(file.modificationStamp + " : " + file.localTimeStamp)
		
		val left = new DocLineComparator(new Document(fileContentsBefore), null, true);
		val right = new DocLineComparator(new Document(fileContentsAfter), null, true);					
	    val diffs = RangeDifferencer.findDifferences(left, right);
	        
	    file.deleteMarkers("org.earthsystemmodeling.cupid.cupidmarker", false, IResource.DEPTH_ZERO);
	    file.deleteMarkers("org.earthsystemmodeling.cupid.cupidparam", false, IResource.DEPTH_ZERO);
	        
	    diffs.forEach[rd|
        	val start = right.getTokenStart(rd.rightStart());
        	val end = right.getTokenStart(rd.rightEnd()) + right.getTokenLength(rd.rightEnd());
        	if (end-start > 2) {
        		val marker = file.createMarker("org.earthsystemmodeling.cupid.cupidmarker");
        		marker.setAttribute(IMarker.CHAR_START, start);
        		marker.setAttribute(IMarker.CHAR_END, end);
        		marker.setAttribute(IMarker.MESSAGE, "Cupid generated code");
        		marker.setAttribute(IMarker.LOCATION, "Lines " + rd.rightStart() + " to " + rd.rightEnd());
        		//markers.add(marker);
        	}	
        ]
        
         paramMarkers.forEach[ml|
    	 	val marker = file.createMarker("org.earthsystemmodeling.cupid.cupidparam");
    		marker.setAttribute(IMarker.CHAR_START, ml.start);
    		marker.setAttribute(IMarker.CHAR_END, ml.end);
    		marker.setAttribute(IMarker.MESSAGE, "Generated parameter");
    	]
  
		
	}
	
	/*
	def void forward(IProgressMonitor pm) {
		forward
		generateChange.perform(pm)
		
		//val f = (generateChange as TextFileChange).file
		//val fn = PhotranVPG.getFilenameForIFile(f)
		//PhotranVPG.instance.forceRecomputationOfEdgesAndAnnotations(fn)
		
	}
	* 
	*/
	
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
	
	def static toIntArray(List<Integer> intList) {
		val toRet = newIntArrayOfSize(intList.size)
		for (var i=0; i < intList.size; i++) {
			toRet.set(i, intList.get(i))
		}
		toRet
	}
	
	def static toDoubleArray(List<Double> dblList) {
		var toRet = newDoubleArrayOfSize(dblList.size)
		for (var i=0; i < dblList.size; i++) {
			toRet.set(i, dblList.get(i))
		}
		toRet
	}
	
	def static addTypeDeclaration(String code, ASTSubroutineSubprogramNode ssn, boolean ignoreIfDeclared) {
		val ASTTypeDeclarationStmtNode tds = parseLiteralStatement(code) as ASTTypeDeclarationStmtNode
		
		//check if exists
		val varName = tds.entityDeclList.get(0).objectName.objectName.text
		val existing = ssn.body.filter(ASTTypeDeclarationStmtNode).findFirst[t|
			t.entityDeclList?.exists[e|
				e.objectName?.objectName?.eic(varName)
			]
		]
		if (existing != null) {
			if (ignoreIfDeclared) return
			else throw new CodeGenerationException("Tried to declare same entity multiple times: " + code)
		}
		
		val last = ssn.body.findLast(IDeclarationConstruct)
		if (last != null) {
			(ssn.body as IASTListNode<IBodyConstruct>).insertAfter(last, tds)
		}
		else {
			ssn.body.add(0, tds)
		}
	}
	
	def static ASTUseStmtNode ensureImport(ASTUseStmtNode usn, String entityName, String localName) {
		
		val exists = 
			usn.findAll(ASTRenameNode)?.exists[rn|
				rn.name.eic(entityName) &&
				rn.newName.eic(localName)
			] 
			||
			usn.findAll(ASTOnlyNode)?.exists[on|
				on.name.eic(entityName) &&
				on.newName.eic(localName)
			]
			||
			(usn.findAll(ASTRenameNode).nullOrEmpty &&
		     usn.findAll(ASTOnlyNode).nullOrEmpty
			)
			
		if (!exists) {
			//need to add entity to list of imports
			val code = usn.toString.trim + ", &\n" + '''«localName» => «entityName»'''
			val newNode = parseLiteralStatement(code) as ASTUseStmtNode
			usn.replaceWith(newNode)
			return newNode
		}
		else {
			return usn
		}
		
	}
	
	def static ASTUseStmtNode ensureImport(ASTModuleNode amn, String moduleName) {
		ensureImport(amn, moduleName, null, null, false)
	}
	
	def static ASTUseStmtNode ensureImport(ASTModuleNode amn, String moduleName, String entityName, String localName, boolean useOnly) {
		
		//var String code	= null
		var ASTUseStmtNode usn = amn.body.children.filter(ASTUseStmtNode).findFirst[usn|
			usn.name.eic(moduleName)]
			
		if (usn != null) {
			return ensureImport(usn, entityName, localName)
		}
		else {
			val code = '''use «moduleName»«IF localName!=null && entityName!=null», «IF useOnly»only: «ENDIF»«localName» => «entityName»«ENDIF»'''
			usn = parseLiteralStatement(code) as ASTUseStmtNode
			
			val last = amn.body.findLast(ASTUseStmtNode)
			if (last != null) {
				(amn.body as IASTListNode<IBodyConstruct>).insertAfter(last, usn)
			}
			else {
				val lastSpec = amn.body.findLast(ISpecificationPartConstruct)
				if (lastSpec != null) {
					(amn.body as IASTListNode<IBodyConstruct>).insertAfter(lastSpec, usn)
				}
				else {
					throw new CodeGenerationException("Unable to insert use statement")
				}
			}
			return usn
		}
				
		
		
	}
		
	
		
	
}
