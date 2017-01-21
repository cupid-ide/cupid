package org.earthsystemmodeling.cupid.cc

import org.eclipse.core.resources.IFile
import org.eclipse.photran.internal.core.vpg.PhotranVPG
import org.eclipse.photran.internal.core.parser.ASTModuleNode
import org.earthsystemmodeling.cupid.cc.mapping.MappingType
import org.earthsystemmodeling.cupid.cc.mapping.MappingResult
import java.util.List
import org.eclipse.photran.core.IFortranAST

class CodeConceptManager {
	
	static CodeConceptManager instance
	
	protected new() {
		
	}
	
	static def getInstance() {
		if (instance == null) {
			instance = new CodeConceptManager
		}
		instance
	}
	
	
	/*
	 *  Reverse engineering methods
	 */
	
	def CodeConceptInstance reverse(CodeConcept concept, IFile file) {
		val ast = PhotranVPG.instance.acquireTransientAST(file)
        if (ast==null) throw new Exception("NULL AST")
        
        //val moduleNode = ast.root?.programUnitList?.filter(ASTModuleNode).head
        
                
        val rootMappingType = new MappingType("MappingRoot", IFortranAST, IFortranAST)
        val rootConcept = new CodeConcept("ConceptRoot", rootMappingType) => [
            addSubconcept(concept.name, concept, true, 1, 1, false)
        ]
        val cci = rootConcept.newInstance(null, ast)
        reverse(concept, cci)
        
        //val instance = concept.newInstance(null)
        //instance.put("ast", ast);
        
        
        //reverseChildren(instance)
        
	}
	
	/**
	 * Reverse engineer a new instance of concept within the parent context by
	 * executing the mapping to find matches. Then, recursively reverse engineer 
	 * children of the new instance.  If an instance cannot be matched, null
	 * is returned and the parent is unaffected.
	 * 
	 * @param concept the concept to reverse engineer
	 * @param parent the context in which to reverse engineer
	 * @return if a match is found, returns a new instance of concept, else returns null
	 */
	def CodeConceptInstance reverse(CodeConcept concept, CodeConceptInstance parent) {
		if (concept.binding != null) {
            var instance = concept.binding.find(parent)
            if (instance != null) {
                try {
                	reverseChildren(instance) 
                }
                catch (EssentialConstraintViolation ecv) {
                	parent.removeChild(instance)
                	return null
                }
                return instance
            }
            else {
            	null
            }
        }
        else {
        	throw new UnsupportedOperationException  
        }
	}
	
	/**
	 * Reverse engineer the children of an instance.  The instance should be connected to
	 * its parent context already. If an essential constraint fails on the child, null is 
	 * returned. Otherwise, the instance is returned with all reverse engineered children.
	 * 
	 * @param instance the instance to reverse engineer fully
	 * @return the fully reversed instance, or null in the case of an essential constraint violation
	 */
	def protected CodeConceptInstance reverseChildren(CodeConceptInstance instance) {
        try {
            for (sc : instance.type.getSubconcepts) {               
                reverseChild(sc, instance)
            }
        }
        catch(EssentialConstraintViolation ecv) {
            return null
        }                    
        instance
    }
    
    /**
     * Reverse engineers the given subconcept (child) of parent. If a match is found,
     * then the new child instances are added to parent.
     * 
     * @param codeSubconcept the subconcept to reverse engineer in the parent context
     * @param parent an instance that can have codeSubconcept as a child
     * @return the parent instance with matched children added
     * @throws EssentialConstraintViolation if an essential constraint is not met, 
     *         such as missing a required child
     */
    protected def reverseChild(CodeSubconcept codeSubconcept, CodeConceptInstance parent) {       
        val subconcept = codeSubconcept as SingleCodeSubconcept  //TODO: assume this for now
        if (subconcept.max == 0 || subconcept.max == 1) {
            val cci = reverse(subconcept.concept, parent)
            if (subconcept.essential) {
                if (cci == null && subconcept.min > 0) {
                    throw new EssentialConstraintViolation("Missing essential subconcept")
                }
                else if (cci != null && subconcept.max == 0) {
                    throw new EssentialConstraintViolation("Prohibited subconcept present")
                }
            }          
        }
        else {
            val ccis = reverseAll(subconcept.concept, parent)
            if (subconcept.essential && (ccis.size < subconcept.min || ccis.size > subconcept.max)) {
                throw new EssentialConstraintViolation("Must be at between " + subconcept.min + " and " + subconcept.max + " instances of " + subconcept.concept.name)
            }        
        }
        parent
    }
     
    /**
     * Reverse engineers (potentially) multiple instance of concept within the parent context.
     * 
     * @param concept the concept to reverse engineer multiple instances
     * @param parent the parent context
     * @return a list of instances of type concept that match
     * 
     */
    def protected List<CodeConceptInstance> reverseAll(CodeConcept concept, CodeConceptInstance parent) {
        val retList = newLinkedList
        if (concept.getBinding != null) {
            val instances = concept.binding.findAll(parent)
            instances.forEach[i|
            	val cci = reverseChildren(i)
            	if (cci != null) {
                	retList.add(cci)
            	}
            	else {
            		parent.removeChild(i)
            	}
            ]
        }
        else {
        	throw new UnsupportedOperationException  
        }
        retList
    }
      
	
	/*
	 *  Forward engineering methods
	 */
	
	def void forward(CodeConceptInstance instance, IFile file) {
		if (instance.status == CCIStatus.ADDED) {
			forwardAdd(instance)
		}
		for (c : instance.children) {
			forward(c, file)
		}
	}
	
	def void forwardAdd(CodeConceptInstance instance) {
		val concept = instance.type
		concept.getBinding.forwardAdd(instance)
	}
	
	def void forwardDelete(CodeConceptInstance parent, CodeConceptInstance child) {
		
	}
	
	def void forwardModify(CodeConceptInstance instance) {
		
	}
	
	
}