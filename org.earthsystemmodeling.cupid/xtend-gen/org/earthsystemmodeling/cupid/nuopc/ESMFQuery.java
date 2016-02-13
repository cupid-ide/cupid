package org.earthsystemmodeling.cupid.nuopc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
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
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ESMFQuery {
  public static ASTSubroutineSubprogramNode findESMFSetServices(final ASTModuleNode node) {
    Iterable<ASTSubroutineSubprogramNode> _findESMFMethods = ESMFQuery.findESMFMethods(node);
    return ESMFQuery.findESMFSetServices(_findESMFMethods);
  }
  
  public static ASTSubroutineSubprogramNode findESMFSetServices(final Iterable<ASTSubroutineSubprogramNode> nodes) {
    final Function1<ASTSubroutineSubprogramNode, Boolean> _function = new Function1<ASTSubroutineSubprogramNode, Boolean>() {
      @Override
      public Boolean apply(final ASTSubroutineSubprogramNode it) {
        boolean _or = false;
        String _name = it.getName();
        boolean _eic = ASTQuery.eic(_name, "SetServices");
        if (_eic) {
          _or = true;
        } else {
          IASTListNode<IBodyConstruct> _body = it.getBody();
          Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
          final Function1<ASTCallStmtNode, Boolean> _function = new Function1<ASTCallStmtNode, Boolean>() {
            @Override
            public Boolean apply(final ASTCallStmtNode it) {
              Token _subroutineName = it.getSubroutineName();
              String _text = _subroutineName.getText();
              return Boolean.valueOf(ASTQuery.eic(_text, "NUOPC_CompDerive"));
            }
          };
          boolean _exists = IterableExtensions.<ASTCallStmtNode>exists(_filter, _function);
          _or = _exists;
        }
        return Boolean.valueOf(_or);
      }
    };
    return IterableExtensions.<ASTSubroutineSubprogramNode>findFirst(nodes, _function);
  }
  
  public static Iterable<ASTSubroutineSubprogramNode> findESMFMethods(final ASTModuleNode node) {
    IASTListNode<? extends IASTNode> _body = node.getBody();
    Iterable<ASTSubroutineSubprogramNode> _filter = Iterables.<ASTSubroutineSubprogramNode>filter(_body, ASTSubroutineSubprogramNode.class);
    final Function1<ASTSubroutineSubprogramNode, Boolean> _function = new Function1<ASTSubroutineSubprogramNode, Boolean>() {
      @Override
      public Boolean apply(final ASTSubroutineSubprogramNode it) {
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
          boolean _xifexpression = false;
          boolean _and_1 = false;
          ASTSubroutineStmtNode _subroutineStmt_1 = it.getSubroutineStmt();
          IASTListNode<ASTSubroutineParNode> _subroutinePars_1 = _subroutineStmt_1.getSubroutinePars();
          ASTSubroutineParNode _get = null;
          if (_subroutinePars_1!=null) {
            _get=_subroutinePars_1.get(0);
          }
          boolean _notEquals = (!Objects.equal(_get, null));
          if (!_notEquals) {
            _and_1 = false;
          } else {
            ASTSubroutineStmtNode _subroutineStmt_2 = it.getSubroutineStmt();
            IASTListNode<ASTSubroutineParNode> _subroutinePars_2 = _subroutineStmt_2.getSubroutinePars();
            ASTSubroutineParNode _get_1 = null;
            if (_subroutinePars_2!=null) {
              _get_1=_subroutinePars_2.get(0);
            }
            Token _variableName = null;
            if (_get_1!=null) {
              _variableName=_get_1.getVariableName();
            }
            List<Definition> _resolveBinding = _variableName.resolveBinding();
            int _size_1 = _resolveBinding.size();
            boolean _equals_1 = (_size_1 == 0);
            _and_1 = _equals_1;
          }
          if (_and_1) {
            boolean _xblockexpression = false;
            {
              System.out.println("Cannot resolve binding for variable");
              ASTSubroutineStmtNode _subroutineStmt_3 = it.getSubroutineStmt();
              IASTListNode<ASTSubroutineParNode> _subroutinePars_3 = _subroutineStmt_3.getSubroutinePars();
              ASTSubroutineParNode _get_2 = null;
              if (_subroutinePars_3!=null) {
                _get_2=_subroutinePars_3.get(0);
              }
              Token _variableName_1 = null;
              if (_get_2!=null) {
                _variableName_1=_get_2.getVariableName();
              }
              Token vn = _variableName_1;
              List<Definition> lst = vn.resolveBinding();
              _xblockexpression = false;
            }
            _xifexpression = _xblockexpression;
          } else {
            boolean _xblockexpression_1 = false;
            {
              ASTSubroutineStmtNode _subroutineStmt_3 = it.getSubroutineStmt();
              IASTListNode<ASTSubroutineParNode> _subroutinePars_3 = _subroutineStmt_3.getSubroutinePars();
              ASTSubroutineParNode _get_2 = null;
              if (_subroutinePars_3!=null) {
                _get_2=_subroutinePars_3.get(0);
              }
              Token _variableName_1 = null;
              if (_get_2!=null) {
                _variableName_1=_get_2.getVariableName();
              }
              List<Definition> _resolveBinding_1 = _variableName_1.resolveBinding();
              Definition par1 = _resolveBinding_1.get(0);
              boolean _xifexpression_1 = false;
              Type _type = null;
              if (par1!=null) {
                _type=par1.getType();
              }
              String _string = _type.toString();
              boolean _eic = ASTQuery.eic(_string, "type(esmf_gridcomp)");
              if (_eic) {
                boolean _xblockexpression_2 = false;
                {
                  ASTSubroutineStmtNode _subroutineStmt_4 = it.getSubroutineStmt();
                  IASTListNode<ASTSubroutineParNode> _subroutinePars_4 = _subroutineStmt_4.getSubroutinePars();
                  ASTSubroutineParNode _get_3 = null;
                  if (_subroutinePars_4!=null) {
                    _get_3=_subroutinePars_4.get(1);
                  }
                  Token _variableName_2 = null;
                  if (_get_3!=null) {
                    _variableName_2=_get_3.getVariableName();
                  }
                  List<Definition> _resolveBinding_2 = _variableName_2.resolveBinding();
                  Definition par2 = _resolveBinding_2.get(0);
                  boolean _and_2 = false;
                  boolean _and_3 = false;
                  Type _type_1 = par2.getType();
                  String _string_1 = _type_1.toString();
                  boolean _eic_1 = ASTQuery.eic(_string_1, "integer");
                  if (!_eic_1) {
                    _and_3 = false;
                  } else {
                    boolean _isIntentIn = par2.isIntentIn();
                    boolean _not = (!_isIntentIn);
                    _and_3 = _not;
                  }
                  if (!_and_3) {
                    _and_2 = false;
                  } else {
                    boolean _isIntentOut = par2.isIntentOut();
                    _and_2 = _isIntentOut;
                  }
                  _xblockexpression_2 = _and_2;
                }
                _xifexpression_1 = _xblockexpression_2;
              }
              _xblockexpression_1 = _xifexpression_1;
            }
            _xifexpression = _xblockexpression_1;
          }
          _and = _xifexpression;
        }
        return Boolean.valueOf(_and);
      }
    };
    return IterableExtensions.<ASTSubroutineSubprogramNode>filter(_filter, _function);
  }
  
  /**
   * esmf_entrypoint(_id, _parentid, _name, _param_gridcomp, _param_import, _param_export, _param_clock, _param_rc) :-
   * subroutine(_id, _parentid, _name),
   * param(_pid1, _id, 1, _param_gridcomp, 'type(esmf_gridcomp)', _, _),
   * param(_pid2, _id, 2, _param_import,   'type(esmf_state)',    _, _),
   * param(_pid3, _id, 3, _param_export,   'type(esmf_state)',    _, _),
   * param(_pid4, _id, 4, _param_clock,    'type(esmf_clock)',    _, _),
   * param(_pid5, _id, 5, _param_rc,       'integer',             false, true).
   */
  public static Iterable<ASTSubroutineSubprogramNode> findESMFEntryPoints(final ASTModuleNode node) {
    IASTListNode<? extends IASTNode> _body = node.getBody();
    Iterable<ASTSubroutineSubprogramNode> _filter = Iterables.<ASTSubroutineSubprogramNode>filter(_body, ASTSubroutineSubprogramNode.class);
    final Function1<ASTSubroutineSubprogramNode, Boolean> _function = new Function1<ASTSubroutineSubprogramNode, Boolean>() {
      @Override
      public Boolean apply(final ASTSubroutineSubprogramNode it) {
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
          boolean _xifexpression = false;
          boolean _and_1 = false;
          ASTSubroutineStmtNode _subroutineStmt_1 = it.getSubroutineStmt();
          IASTListNode<ASTSubroutineParNode> _subroutinePars_1 = _subroutineStmt_1.getSubroutinePars();
          ASTSubroutineParNode _get = null;
          if (_subroutinePars_1!=null) {
            _get=_subroutinePars_1.get(0);
          }
          boolean _notEquals = (!Objects.equal(_get, null));
          if (!_notEquals) {
            _and_1 = false;
          } else {
            ASTSubroutineStmtNode _subroutineStmt_2 = it.getSubroutineStmt();
            IASTListNode<ASTSubroutineParNode> _subroutinePars_2 = _subroutineStmt_2.getSubroutinePars();
            ASTSubroutineParNode _get_1 = null;
            if (_subroutinePars_2!=null) {
              _get_1=_subroutinePars_2.get(0);
            }
            Token _variableName = null;
            if (_get_1!=null) {
              _variableName=_get_1.getVariableName();
            }
            List<Definition> _resolveBinding = _variableName.resolveBinding();
            int _size_1 = _resolveBinding.size();
            boolean _equals_1 = (_size_1 == 0);
            _and_1 = _equals_1;
          }
          if (_and_1) {
            boolean _xblockexpression = false;
            {
              System.out.println("Cannot resolve binding for variable");
              _xblockexpression = false;
            }
            _xifexpression = _xblockexpression;
          } else {
            boolean _xblockexpression_1 = false;
            {
              ASTSubroutineStmtNode _subroutineStmt_3 = it.getSubroutineStmt();
              IASTListNode<ASTSubroutineParNode> _subroutinePars_3 = _subroutineStmt_3.getSubroutinePars();
              ASTSubroutineParNode _get_2 = null;
              if (_subroutinePars_3!=null) {
                _get_2=_subroutinePars_3.get(0);
              }
              Token _variableName_1 = null;
              if (_get_2!=null) {
                _variableName_1=_get_2.getVariableName();
              }
              List<Definition> _resolveBinding_1 = _variableName_1.resolveBinding();
              Definition par1 = _resolveBinding_1.get(0);
              boolean _xifexpression_1 = false;
              Type _type = null;
              if (par1!=null) {
                _type=par1.getType();
              }
              String _string = _type.toString();
              boolean _eic = ASTQuery.eic(_string, "type(esmf_gridcomp)");
              if (_eic) {
                boolean _xblockexpression_2 = false;
                {
                  ASTSubroutineStmtNode _subroutineStmt_4 = it.getSubroutineStmt();
                  IASTListNode<ASTSubroutineParNode> _subroutinePars_4 = _subroutineStmt_4.getSubroutinePars();
                  ASTSubroutineParNode _get_3 = null;
                  if (_subroutinePars_4!=null) {
                    _get_3=_subroutinePars_4.get(1);
                  }
                  Token _variableName_2 = null;
                  if (_get_3!=null) {
                    _variableName_2=_get_3.getVariableName();
                  }
                  List<Definition> _resolveBinding_2 = _variableName_2.resolveBinding();
                  Definition par2 = _resolveBinding_2.get(0);
                  boolean _xifexpression_2 = false;
                  Type _type_1 = par2.getType();
                  String _string_1 = _type_1.toString();
                  boolean _eic_1 = ASTQuery.eic(_string_1, "type(esmf_state)");
                  if (_eic_1) {
                    boolean _xblockexpression_3 = false;
                    {
                      ASTSubroutineStmtNode _subroutineStmt_5 = it.getSubroutineStmt();
                      IASTListNode<ASTSubroutineParNode> _subroutinePars_5 = _subroutineStmt_5.getSubroutinePars();
                      ASTSubroutineParNode _get_4 = null;
                      if (_subroutinePars_5!=null) {
                        _get_4=_subroutinePars_5.get(2);
                      }
                      Token _variableName_3 = null;
                      if (_get_4!=null) {
                        _variableName_3=_get_4.getVariableName();
                      }
                      List<Definition> _resolveBinding_3 = _variableName_3.resolveBinding();
                      Definition par3 = _resolveBinding_3.get(0);
                      boolean _xifexpression_3 = false;
                      Type _type_2 = par3.getType();
                      String _string_2 = _type_2.toString();
                      boolean _eic_2 = ASTQuery.eic(_string_2, "type(esmf_state)");
                      if (_eic_2) {
                        boolean _xblockexpression_4 = false;
                        {
                          ASTSubroutineStmtNode _subroutineStmt_6 = it.getSubroutineStmt();
                          IASTListNode<ASTSubroutineParNode> _subroutinePars_6 = _subroutineStmt_6.getSubroutinePars();
                          ASTSubroutineParNode _get_5 = null;
                          if (_subroutinePars_6!=null) {
                            _get_5=_subroutinePars_6.get(3);
                          }
                          Token _variableName_4 = null;
                          if (_get_5!=null) {
                            _variableName_4=_get_5.getVariableName();
                          }
                          List<Definition> _resolveBinding_4 = _variableName_4.resolveBinding();
                          Definition par4 = _resolveBinding_4.get(0);
                          boolean _xifexpression_4 = false;
                          Type _type_3 = par4.getType();
                          String _string_3 = _type_3.toString();
                          boolean _eic_3 = ASTQuery.eic(_string_3, "type(esmf_clock)");
                          if (_eic_3) {
                            boolean _xblockexpression_5 = false;
                            {
                              ASTSubroutineStmtNode _subroutineStmt_7 = it.getSubroutineStmt();
                              IASTListNode<ASTSubroutineParNode> _subroutinePars_7 = _subroutineStmt_7.getSubroutinePars();
                              ASTSubroutineParNode _get_6 = null;
                              if (_subroutinePars_7!=null) {
                                _get_6=_subroutinePars_7.get(4);
                              }
                              Token _variableName_5 = null;
                              if (_get_6!=null) {
                                _variableName_5=_get_6.getVariableName();
                              }
                              List<Definition> _resolveBinding_5 = _variableName_5.resolveBinding();
                              Definition par5 = _resolveBinding_5.get(0);
                              boolean _and_2 = false;
                              boolean _and_3 = false;
                              Type _type_4 = par5.getType();
                              String _string_4 = _type_4.toString();
                              boolean _eic_4 = ASTQuery.eic(_string_4, "integer");
                              if (!_eic_4) {
                                _and_3 = false;
                              } else {
                                boolean _isIntentIn = par5.isIntentIn();
                                boolean _not = (!_isIntentIn);
                                _and_3 = _not;
                              }
                              if (!_and_3) {
                                _and_2 = false;
                              } else {
                                boolean _isIntentOut = par5.isIntentOut();
                                _and_2 = _isIntentOut;
                              }
                              _xblockexpression_5 = _and_2;
                            }
                            _xifexpression_4 = _xblockexpression_5;
                          }
                          _xblockexpression_4 = _xifexpression_4;
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
          _and = _xifexpression;
        }
        return Boolean.valueOf(_and);
      }
    };
    return IterableExtensions.<ASTSubroutineSubprogramNode>filter(_filter, _function);
  }
}
