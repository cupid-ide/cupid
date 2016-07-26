package org.earthsystemmodeling.cupid.nuopc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.earthsystemmodeling.cupid.nuopc.ReverseEngineerException;
import org.eclipse.photran.internal.core.analysis.binding.Definition;
import org.eclipse.photran.internal.core.analysis.types.Type;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineParNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ESMFQuery {
  public static ASTSubroutineSubprogramNode findESMFSetServices(final ASTModuleNode node) {
    Iterable<ASTSubroutineSubprogramNode> _findESMFMethods = ESMFQuery.findESMFMethods(node);
    return ESMFQuery.findESMFSetServices(_findESMFMethods);
  }
  
  public static ASTSubroutineSubprogramNode findESMFSetServices(final Iterable<ASTSubroutineSubprogramNode> nodes) {
    final Function1<ASTSubroutineSubprogramNode, Boolean> _function = (ASTSubroutineSubprogramNode it) -> {
      return Boolean.valueOf((ASTQuery.eic(it.getName(), "SetServices") || 
        IterableExtensions.<ASTCallStmtNode>exists(Iterables.<ASTCallStmtNode>filter(it.getBody(), ASTCallStmtNode.class), 
          ((Function1<ASTCallStmtNode, Boolean>) (ASTCallStmtNode it_1) -> {
            Token _subroutineName = it_1.getSubroutineName();
            String _text = _subroutineName.getText();
            return Boolean.valueOf(ASTQuery.eic(_text, "NUOPC_CompDerive"));
          }))));
    };
    return IterableExtensions.<ASTSubroutineSubprogramNode>findFirst(nodes, _function);
  }
  
  public static Iterable<ASTSubroutineSubprogramNode> findESMFMethods(final ASTModuleNode node) {
    IASTListNode<? extends IASTNode> _body = node.getBody();
    Iterable<ASTSubroutineSubprogramNode> _filter = Iterables.<ASTSubroutineSubprogramNode>filter(_body, ASTSubroutineSubprogramNode.class);
    final Function1<ASTSubroutineSubprogramNode, Boolean> _function = (ASTSubroutineSubprogramNode it) -> {
      boolean _and = false;
      ASTSubroutineStmtNode _subroutineStmt = it.getSubroutineStmt();
      IASTListNode<ASTSubroutineParNode> _subroutinePars = _subroutineStmt.getSubroutinePars();
      int _size = 0;
      if (_subroutinePars!=null) {
        _size=_subroutinePars.size();
      }
      boolean _equals = (_size == 2);
      if (!_equals) {
        _and = false;
      } else {
        boolean _xblockexpression = false;
        {
          ASTSubroutineStmtNode _subroutineStmt_1 = it.getSubroutineStmt();
          IASTListNode<ASTSubroutineParNode> _subroutinePars_1 = _subroutineStmt_1.getSubroutinePars();
          ASTSubroutineParNode _get = null;
          if (_subroutinePars_1!=null) {
            _get=_subroutinePars_1.get(0);
          }
          Token _variableName = null;
          if (_get!=null) {
            _variableName=_get.getVariableName();
          }
          Definition par1 = ESMFQuery.resolveOrDie(_variableName);
          boolean _xifexpression = false;
          Type _type = null;
          if (par1!=null) {
            _type=par1.getType();
          }
          String _string = _type.toString();
          boolean _eic = ASTQuery.eic(_string, "type(esmf_gridcomp)");
          if (_eic) {
            boolean _xblockexpression_1 = false;
            {
              ASTSubroutineStmtNode _subroutineStmt_2 = it.getSubroutineStmt();
              IASTListNode<ASTSubroutineParNode> _subroutinePars_2 = _subroutineStmt_2.getSubroutinePars();
              ASTSubroutineParNode _get_1 = null;
              if (_subroutinePars_2!=null) {
                _get_1=_subroutinePars_2.get(1);
              }
              Token _variableName_1 = null;
              if (_get_1!=null) {
                _variableName_1=_get_1.getVariableName();
              }
              Definition par2 = ESMFQuery.resolveOrDie(_variableName_1);
              _xblockexpression_1 = ((ASTQuery.eic(par2.getType().toString(), "integer") && 
                (!par2.isIntentIn())) && 
                par2.isIntentOut());
            }
            _xifexpression = _xblockexpression_1;
          }
          _xblockexpression = _xifexpression;
        }
        _and = _xblockexpression;
      }
      return Boolean.valueOf(_and);
    };
    return IterableExtensions.<ASTSubroutineSubprogramNode>filter(_filter, _function);
  }
  
  public static Iterable<ASTSubroutineSubprogramNode> findESMFEntryPoints(final ASTModuleNode node) {
    IASTListNode<? extends IASTNode> _body = node.getBody();
    Iterable<ASTSubroutineSubprogramNode> _filter = Iterables.<ASTSubroutineSubprogramNode>filter(_body, ASTSubroutineSubprogramNode.class);
    final Function1<ASTSubroutineSubprogramNode, Boolean> _function = (ASTSubroutineSubprogramNode it) -> {
      boolean _and = false;
      ASTSubroutineStmtNode _subroutineStmt = it.getSubroutineStmt();
      IASTListNode<ASTSubroutineParNode> _subroutinePars = _subroutineStmt.getSubroutinePars();
      int _size = 0;
      if (_subroutinePars!=null) {
        _size=_subroutinePars.size();
      }
      boolean _equals = (_size == 5);
      if (!_equals) {
        _and = false;
      } else {
        boolean _xblockexpression = false;
        {
          ASTSubroutineStmtNode _subroutineStmt_1 = it.getSubroutineStmt();
          IASTListNode<ASTSubroutineParNode> _subroutinePars_1 = _subroutineStmt_1.getSubroutinePars();
          ASTSubroutineParNode _get = null;
          if (_subroutinePars_1!=null) {
            _get=_subroutinePars_1.get(0);
          }
          Token _variableName = null;
          if (_get!=null) {
            _variableName=_get.getVariableName();
          }
          Definition par1 = ESMFQuery.resolveOrDie(_variableName);
          boolean _xifexpression = false;
          Type _type = null;
          if (par1!=null) {
            _type=par1.getType();
          }
          String _string = _type.toString();
          boolean _eic = ASTQuery.eic(_string, "type(esmf_gridcomp)");
          if (_eic) {
            boolean _xblockexpression_1 = false;
            {
              ASTSubroutineStmtNode _subroutineStmt_2 = it.getSubroutineStmt();
              IASTListNode<ASTSubroutineParNode> _subroutinePars_2 = _subroutineStmt_2.getSubroutinePars();
              ASTSubroutineParNode _get_1 = null;
              if (_subroutinePars_2!=null) {
                _get_1=_subroutinePars_2.get(1);
              }
              Token _variableName_1 = null;
              if (_get_1!=null) {
                _variableName_1=_get_1.getVariableName();
              }
              Definition par2 = ESMFQuery.resolveOrDie(_variableName_1);
              boolean _xifexpression_1 = false;
              Type _type_1 = par2.getType();
              String _string_1 = _type_1.toString();
              boolean _eic_1 = ASTQuery.eic(_string_1, "type(esmf_state)");
              if (_eic_1) {
                boolean _xblockexpression_2 = false;
                {
                  ASTSubroutineStmtNode _subroutineStmt_3 = it.getSubroutineStmt();
                  IASTListNode<ASTSubroutineParNode> _subroutinePars_3 = _subroutineStmt_3.getSubroutinePars();
                  ASTSubroutineParNode _get_2 = null;
                  if (_subroutinePars_3!=null) {
                    _get_2=_subroutinePars_3.get(2);
                  }
                  Token _variableName_2 = null;
                  if (_get_2!=null) {
                    _variableName_2=_get_2.getVariableName();
                  }
                  Definition par3 = ESMFQuery.resolveOrDie(_variableName_2);
                  boolean _xifexpression_2 = false;
                  Type _type_2 = par3.getType();
                  String _string_2 = _type_2.toString();
                  boolean _eic_2 = ASTQuery.eic(_string_2, "type(esmf_state)");
                  if (_eic_2) {
                    boolean _xblockexpression_3 = false;
                    {
                      ASTSubroutineStmtNode _subroutineStmt_4 = it.getSubroutineStmt();
                      IASTListNode<ASTSubroutineParNode> _subroutinePars_4 = _subroutineStmt_4.getSubroutinePars();
                      ASTSubroutineParNode _get_3 = null;
                      if (_subroutinePars_4!=null) {
                        _get_3=_subroutinePars_4.get(3);
                      }
                      Token _variableName_3 = null;
                      if (_get_3!=null) {
                        _variableName_3=_get_3.getVariableName();
                      }
                      Definition par4 = ESMFQuery.resolveOrDie(_variableName_3);
                      boolean _xifexpression_3 = false;
                      Type _type_3 = par4.getType();
                      String _string_3 = _type_3.toString();
                      boolean _eic_3 = ASTQuery.eic(_string_3, "type(esmf_clock)");
                      if (_eic_3) {
                        boolean _xblockexpression_4 = false;
                        {
                          ASTSubroutineStmtNode _subroutineStmt_5 = it.getSubroutineStmt();
                          IASTListNode<ASTSubroutineParNode> _subroutinePars_5 = _subroutineStmt_5.getSubroutinePars();
                          ASTSubroutineParNode _get_4 = null;
                          if (_subroutinePars_5!=null) {
                            _get_4=_subroutinePars_5.get(4);
                          }
                          Token _variableName_4 = null;
                          if (_get_4!=null) {
                            _variableName_4=_get_4.getVariableName();
                          }
                          Definition par5 = ESMFQuery.resolveOrDie(_variableName_4);
                          _xblockexpression_4 = ((ASTQuery.eic(par5.getType().toString(), "integer") && 
                            (!par5.isIntentIn())) && 
                            par5.isIntentOut());
                        }
                        _xifexpression_3 = _xblockexpression_4;
                      }
                      _xblockexpression_3 = _xifexpression_3;
                    }
                    _xifexpression_2 = _xblockexpression_3;
                  }
                  _xblockexpression_2 = _xifexpression_2;
                }
                _xifexpression_1 = _xblockexpression_2;
              }
              _xblockexpression_1 = _xifexpression_1;
            }
            _xifexpression = _xblockexpression_1;
          }
          _xblockexpression = _xifexpression;
        }
        _and = _xblockexpression;
      }
      return Boolean.valueOf(_and);
    };
    return IterableExtensions.<ASTSubroutineSubprogramNode>filter(_filter, _function);
  }
  
  public static Definition resolveOrDie(final Token toResolve) {
    try {
      Definition _xblockexpression = null;
      {
        List<Definition> defs = toResolve.resolveBinding();
        Definition _xifexpression = null;
        if ((Objects.equal(defs, null) || (defs.size() == 0))) {
          String _text = toResolve.getText();
          String _plus = ("Cannot resolve binding for token: " + _text);
          throw new ReverseEngineerException(_plus);
        } else {
          Definition _xifexpression_1 = null;
          int _size = defs.size();
          boolean _greaterThan = (_size > 1);
          if (_greaterThan) {
            String _text_1 = toResolve.getText();
            String _plus_1 = ("Ambiguous definition binding for token: " + _text_1);
            throw new ReverseEngineerException(_plus_1);
          } else {
            _xifexpression_1 = defs.get(0);
          }
          _xifexpression = _xifexpression_1;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
