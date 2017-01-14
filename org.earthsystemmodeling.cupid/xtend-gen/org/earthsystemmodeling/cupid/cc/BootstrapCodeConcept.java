package org.earthsystemmodeling.cupid.cc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.eclipse.core.resources.IFile;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTExecutableProgramNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class BootstrapCodeConcept {
  private CodeConcept type;
  
  public BootstrapCodeConcept(final CodeConcept type) {
    this.type = type;
  }
  
  public CodeConceptInstance fromFile(final IFile input) {
    try {
      CodeConceptInstance _xblockexpression = null;
      {
        PhotranVPG _instance = PhotranVPG.getInstance();
        final IFortranAST ast = _instance.acquireTransientAST(input);
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
          it.addSubconcept(this.type.name, this.type, true, 1, 1);
        };
        final CodeConcept rootConcept = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept, _function);
        final CodeConceptInstance cci = rootConcept.newInstance(null, moduleNode);
        this.type.reverse(cci);
        _xblockexpression = cci;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
