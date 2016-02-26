package org.earthsystemmodeling.cupid.nuopc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTOnlyNode;
import org.eclipse.photran.internal.core.parser.ASTRenameNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineArgNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IExpr;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ASTQuery {
  public static ASTSubroutineArgNode findArgNodeByKeyword(final ASTCallStmtNode node, final String keyword) {
    IASTListNode<ASTSubroutineArgNode> _argList = node.getArgList();
    return ASTQuery.findArgNodeByKeyword(_argList, keyword);
  }
  
  public static ASTSubroutineArgNode findArgNodeByKeyword(final IASTListNode<ASTSubroutineArgNode> nodes, final String keyword) {
    final Function1<ASTSubroutineArgNode, Boolean> _function = new Function1<ASTSubroutineArgNode, Boolean>() {
      @Override
      public Boolean apply(final ASTSubroutineArgNode it) {
        Token _name = it.getName();
        String _text = null;
        if (_name!=null) {
          _text=_name.getText();
        }
        boolean _eic = false;
        if (_text!=null) {
          _eic=ASTQuery.eic(_text, keyword);
        }
        return Boolean.valueOf(_eic);
      }
    };
    return IterableExtensions.<ASTSubroutineArgNode>findFirst(nodes, _function);
  }
  
  public static String litArgExprByKeyword(final ASTCallStmtNode node, final String keyword) {
    ASTSubroutineArgNode _findArgNodeByKeyword = ASTQuery.findArgNodeByKeyword(node, keyword);
    IExpr _expr = null;
    if (_findArgNodeByKeyword!=null) {
      _expr=_findArgNodeByKeyword.getExpr();
    }
    String _literal = null;
    if (_expr!=null) {
      _literal=ASTQuery.literal(_expr);
    }
    return _literal;
  }
  
  public static String litArgExprByKeyword(final IASTListNode<ASTSubroutineArgNode> nodes, final String keyword) {
    ASTSubroutineArgNode _findArgNodeByKeyword = ASTQuery.findArgNodeByKeyword(nodes, keyword);
    IExpr _expr = null;
    if (_findArgNodeByKeyword!=null) {
      _expr=_findArgNodeByKeyword.getExpr();
    }
    String _literal = null;
    if (_expr!=null) {
      _literal=ASTQuery.literal(_expr);
    }
    return _literal;
  }
  
  public static String litArgExprByIdx(final ASTCallStmtNode node, final int idx) {
    IASTListNode<ASTSubroutineArgNode> _argList = node.getArgList();
    ASTSubroutineArgNode _get = null;
    if (_argList!=null) {
      _get=_argList.get(idx);
    }
    IExpr _expr = null;
    if (_get!=null) {
      _expr=_get.getExpr();
    }
    String _literal = null;
    if (_expr!=null) {
      _literal=ASTQuery.literal(_expr);
    }
    return _literal;
  }
  
  public static String localName(final ASTModuleNode moduleNode, final String usedModule, final String usedEntity) {
    String _xblockexpression = null;
    {
      IASTListNode<? extends IASTNode> _body = moduleNode.getBody();
      Iterable<ASTUseStmtNode> _filter = Iterables.<ASTUseStmtNode>filter(_body, ASTUseStmtNode.class);
      final Function1<ASTUseStmtNode, Boolean> _function = new Function1<ASTUseStmtNode, Boolean>() {
        @Override
        public Boolean apply(final ASTUseStmtNode it) {
          Token _name = it.getName();
          return Boolean.valueOf(ASTQuery.eic(_name, usedModule));
        }
      };
      ASTUseStmtNode node = IterableExtensions.<ASTUseStmtNode>findFirst(_filter, _function);
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(node, null));
      if (_notEquals) {
        String _elvis = null;
        String _elvis_1 = null;
        IASTListNode<ASTRenameNode> _renameList = node.getRenameList();
        ASTRenameNode _findFirst = null;
        if (_renameList!=null) {
          final Function1<ASTRenameNode, Boolean> _function_1 = new Function1<ASTRenameNode, Boolean>() {
            @Override
            public Boolean apply(final ASTRenameNode it) {
              Token _name = it.getName();
              return Boolean.valueOf(ASTQuery.eic(_name, usedEntity));
            }
          };
          _findFirst=IterableExtensions.<ASTRenameNode>findFirst(_renameList, _function_1);
        }
        Token _newName = null;
        if (_findFirst!=null) {
          _newName=_findFirst.getNewName();
        }
        String _text = null;
        if (_newName!=null) {
          _text=_newName.getText();
        }
        if (_text != null) {
          _elvis_1 = _text;
        } else {
          IASTListNode<ASTOnlyNode> _onlyList = node.getOnlyList();
          ASTOnlyNode _findFirst_1 = null;
          if (_onlyList!=null) {
            final Function1<ASTOnlyNode, Boolean> _function_2 = new Function1<ASTOnlyNode, Boolean>() {
              @Override
              public Boolean apply(final ASTOnlyNode it) {
                Token _name = it.getName();
                return Boolean.valueOf(ASTQuery.eic(_name, usedEntity));
              }
            };
            _findFirst_1=IterableExtensions.<ASTOnlyNode>findFirst(_onlyList, _function_2);
          }
          Token _newName_1 = null;
          if (_findFirst_1!=null) {
            _newName_1=_findFirst_1.getNewName();
          }
          String _text_1 = null;
          if (_newName_1!=null) {
            _text_1=_newName_1.getText();
          }
          _elvis_1 = _text_1;
        }
        if (_elvis_1 != null) {
          _elvis = _elvis_1;
        } else {
          _elvis = usedEntity;
        }
        _xifexpression = _elvis;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static boolean eic(final String a, final String b) {
    return a.equalsIgnoreCase(b);
  }
  
  public static boolean eic(final Token t, final String s) {
    String _text = t.getText();
    return ASTQuery.eic(s, _text);
  }
  
  public static boolean eic(final String s, final Token t) {
    String _text = t.getText();
    return ASTQuery.eic(s, _text);
  }
  
  public static boolean eic(final Token a, final Token b) {
    String _text = a.getText();
    String _text_1 = b.getText();
    return ASTQuery.eic(_text, _text_1);
  }
  
  public static String literal(final IExpr expr) {
    String _string = expr.toString();
    return _string.trim();
  }
}
