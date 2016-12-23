package org.earthsystemmodeling.cupid.cc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.eclipse.core.resources.IFile;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTExecutableProgramNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
        final CodeConceptInstance cci = this.type.newInstance(moduleNode);
        _xblockexpression = this.type.reverse(cci);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
