package org.earthsystemmodeling.cupid.cc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.CodeSubconcept;
import org.earthsystemmodeling.cupid.cc.EssentialConstraintViolation;
import org.earthsystemmodeling.cupid.cc.SingleCodeSubconcept;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.eclipse.core.resources.IFile;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTExecutableProgramNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class CodeConceptManager {
  private static CodeConceptManager instance;
  
  protected CodeConceptManager() {
  }
  
  public static CodeConceptManager getInstance() {
    CodeConceptManager _xblockexpression = null;
    {
      boolean _equals = Objects.equal(CodeConceptManager.instance, null);
      if (_equals) {
        CodeConceptManager _codeConceptManager = new CodeConceptManager();
        CodeConceptManager.instance = _codeConceptManager;
      }
      _xblockexpression = CodeConceptManager.instance;
    }
    return _xblockexpression;
  }
  
  /**
   * Reverse engineering methods
   */
  public CodeConceptInstance reverse(final CodeConcept concept, final IFile file) {
    try {
      CodeConceptInstance _xblockexpression = null;
      {
        PhotranVPG _instance = PhotranVPG.getInstance();
        final IFortranAST ast = _instance.acquireTransientAST(file);
        boolean _equals = Objects.equal(ast, null);
        if (_equals) {
          throw new Exception("NULL AST");
        }
        ASTExecutableProgramNode _root = ast.getRoot();
        IASTListNode<IProgramUnit> _programUnitList = null;
        if (_root!=null) {
          _programUnitList=_root.getProgramUnitList();
        }
        Iterable<ASTModuleNode> _filter = null;
        if (_programUnitList!=null) {
          _filter=Iterables.<ASTModuleNode>filter(_programUnitList, ASTModuleNode.class);
        }
        final ASTModuleNode moduleNode = IterableExtensions.<ASTModuleNode>head(_filter);
        final MappingType rootMappingType = new MappingType("MappingRoot", ASTModuleNode.class, ASTModuleNode.class);
        CodeConcept _codeConcept = new CodeConcept("ConceptRoot", rootMappingType);
        final Procedure1<CodeConcept> _function = (CodeConcept it) -> {
          it.addSubconcept(concept.name, concept, true, 1, 1);
        };
        final CodeConcept rootConcept = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept, _function);
        final CodeConceptInstance cci = rootConcept.newInstance(null, moduleNode);
        _xblockexpression = this.reverse(concept, cci);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
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
  public CodeConceptInstance reverse(final CodeConcept concept, final CodeConceptInstance parent) {
    Object _xifexpression = null;
    boolean _notEquals = (!Objects.equal(concept.binding, null));
    if (_notEquals) {
      Object _xblockexpression = null;
      {
        CodeConceptInstance instance = concept.binding.bind(parent);
        Object _xifexpression_1 = null;
        boolean _notEquals_1 = (!Objects.equal(instance, null));
        if (_notEquals_1) {
          try {
            this.reverseChildren(instance);
          } catch (final Throwable _t) {
            if (_t instanceof EssentialConstraintViolation) {
              final EssentialConstraintViolation ecv = (EssentialConstraintViolation)_t;
              parent.removeChild(instance);
              return null;
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          return instance;
        } else {
          _xifexpression_1 = null;
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    } else {
      throw new UnsupportedOperationException();
    }
    return ((CodeConceptInstance)_xifexpression);
  }
  
  /**
   * Reverse engineer the children of an instance.  The instance should be connected to
   * its parent context already. If an essential constraint fails on the child, null is
   * returned. Otherwise, the instance is returned with all reverse engineered children.
   * 
   * @param instance the instance to reverse engineer fully
   * @return the fully reversed instance, or null in the case of an essential constraint violation
   */
  protected CodeConceptInstance reverseChildren(final CodeConceptInstance instance) {
    CodeConceptInstance _xblockexpression = null;
    {
      try {
        CodeConcept _type = instance.getType();
        List<CodeSubconcept> _subconcepts = _type.getSubconcepts();
        for (final CodeSubconcept sc : _subconcepts) {
          this.reverseChild(sc, instance);
        }
      } catch (final Throwable _t) {
        if (_t instanceof EssentialConstraintViolation) {
          final EssentialConstraintViolation ecv = (EssentialConstraintViolation)_t;
          return null;
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = instance;
    }
    return _xblockexpression;
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
  protected CodeConceptInstance reverseChild(final CodeSubconcept codeSubconcept, final CodeConceptInstance parent) {
    try {
      CodeConceptInstance _xblockexpression = null;
      {
        final SingleCodeSubconcept subconcept = ((SingleCodeSubconcept) codeSubconcept);
        if (((subconcept.getMax() == 0) || (subconcept.getMax() == 1))) {
          CodeConcept _concept = subconcept.getConcept();
          final CodeConceptInstance cci = this.reverse(_concept, parent);
          boolean _isEssential = subconcept.isEssential();
          if (_isEssential) {
            if ((Objects.equal(cci, null) && (subconcept.getMin() > 0))) {
              throw new EssentialConstraintViolation("Missing essential subconcept");
            } else {
              if (((!Objects.equal(cci, null)) && (subconcept.getMax() == 0))) {
                throw new EssentialConstraintViolation("Prohibited subconcept present");
              }
            }
          }
        } else {
          CodeConcept _concept_1 = subconcept.getConcept();
          final List<CodeConceptInstance> ccis = this.reverseAll(_concept_1, parent);
          if ((subconcept.isEssential() && ((ccis.size() < subconcept.getMin()) || (ccis.size() > subconcept.getMax())))) {
            int _min = subconcept.getMin();
            String _plus = ("Must be at between " + Integer.valueOf(_min));
            String _plus_1 = (_plus + " and ");
            int _max = subconcept.getMax();
            String _plus_2 = (_plus_1 + Integer.valueOf(_max));
            String _plus_3 = (_plus_2 + " instances of ");
            CodeConcept _concept_2 = subconcept.getConcept();
            String _plus_4 = (_plus_3 + _concept_2.name);
            throw new EssentialConstraintViolation(_plus_4);
          }
        }
        _xblockexpression = parent;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Reverse engineers (potentially) multiple instance of concept within the parent context.
   * 
   * @param concept the concept to reverse engineer multiple instances
   * @param parent the parent context
   * @return a list of instances of type concept that match
   */
  protected List<CodeConceptInstance> reverseAll(final CodeConcept concept, final CodeConceptInstance parent) {
    LinkedList<CodeConceptInstance> _xblockexpression = null;
    {
      final LinkedList<CodeConceptInstance> retList = CollectionLiterals.<CodeConceptInstance>newLinkedList();
      boolean _notEquals = (!Objects.equal(concept.binding, null));
      if (_notEquals) {
        final List<CodeConceptInstance> instances = concept.binding.bindAll(parent);
        final Consumer<CodeConceptInstance> _function = (CodeConceptInstance i) -> {
          final CodeConceptInstance cci = this.reverseChildren(i);
          boolean _notEquals_1 = (!Objects.equal(cci, null));
          if (_notEquals_1) {
            retList.add(cci);
          } else {
            parent.removeChild(i);
          }
        };
        instances.forEach(_function);
      } else {
        throw new UnsupportedOperationException();
      }
      _xblockexpression = retList;
    }
    return _xblockexpression;
  }
  
  /**
   * Forward engineering methods
   */
  public void forward(final CodeConceptInstance instance, final IFile file) {
  }
  
  public void forwardAdd(final CodeConceptInstance parent, final CodeConceptInstance child) {
  }
  
  public void forwardDelete(final CodeConceptInstance parent, final CodeConceptInstance child) {
  }
  
  public void forwardModify(final CodeConceptInstance instance) {
  }
}
