package org.earthsystemmodeling.cupid.nuopc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTAcValueNode;
import org.eclipse.photran.internal.core.parser.ASTArrayConstructorNode;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTOnlyNode;
import org.eclipse.photran.internal.core.parser.ASTRenameNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineArgNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IExpr;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class ASTQuery {
  public static ASTSubroutineArgNode findArgNodeByKeyword(final ASTCallStmtNode node, final String keyword) {
    return ASTQuery.findArgNodeByKeyword(node.getArgList(), keyword);
  }
  
  public static ASTSubroutineArgNode findArgNodeByKeyword(final IASTListNode<ASTSubroutineArgNode> nodes, final String keyword) {
    final Function1<ASTSubroutineArgNode, Boolean> _function = (ASTSubroutineArgNode it) -> {
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
    };
    return IterableExtensions.<ASTSubroutineArgNode>findFirst(nodes, _function);
  }
  
  public static <E extends IExpr> E argExprByKeyword(final ASTCallStmtNode node, final String keyword) {
    ASTSubroutineArgNode _findArgNodeByKeyword = ASTQuery.findArgNodeByKeyword(node, keyword);
    IExpr _expr = null;
    if (_findArgNodeByKeyword!=null) {
      _expr=_findArgNodeByKeyword.getExpr();
    }
    return ((E) _expr);
  }
  
  public static <E extends IExpr> E argExprByIdx(final ASTCallStmtNode node, final int idx) {
    IASTListNode<ASTSubroutineArgNode> _argList = node.getArgList();
    ASTSubroutineArgNode _get = null;
    if (_argList!=null) {
      _get=_argList.get(idx);
    }
    IExpr _expr = null;
    if (_get!=null) {
      _expr=_get.getExpr();
    }
    return ((E) _expr);
  }
  
  public static <E extends IExpr> E argExprByKeywordElseIdx(final ASTCallStmtNode node, final String keyword, final int idx) {
    E _xblockexpression = null;
    {
      final IExpr ret = ASTQuery.<IExpr>argExprByKeyword(node, keyword);
      E _xifexpression = null;
      boolean _notEquals = (!Objects.equal(ret, null));
      if (_notEquals) {
        _xifexpression = ((E) ret);
      } else {
        _xifexpression = ASTQuery.<E>argExprByIdx(node, idx);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static List<IExpr> arrayExprs(final IExpr e) {
    List<IExpr> _xifexpression = null;
    if ((e instanceof ASTArrayConstructorNode)) {
      List<IExpr> _xblockexpression = null;
      {
        final ASTArrayConstructorNode acn = ((ASTArrayConstructorNode) e);
        final Function1<ASTAcValueNode, IExpr> _function = (ASTAcValueNode n) -> {
          return n.getExpr();
        };
        _xblockexpression = ListExtensions.<ASTAcValueNode, IExpr>map(acn.getAcValueList(), _function);
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = CollectionLiterals.<IExpr>newArrayList();
    }
    return _xifexpression;
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
    IExpr _argExprByIdx = ASTQuery.<IExpr>argExprByIdx(node, idx);
    String _literal = null;
    if (_argExprByIdx!=null) {
      _literal=ASTQuery.literal(_argExprByIdx);
    }
    return _literal;
  }
  
  public static String litArgExprByKeywordElseIdx(final ASTCallStmtNode node, final String keyword, final int idx) {
    String _xblockexpression = null;
    {
      final String ret = ASTQuery.litArgExprByKeyword(node, keyword);
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(ret, null));
      if (_notEquals) {
        _xifexpression = ret;
      } else {
        _xifexpression = ASTQuery.litArgExprByIdx(node, idx);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public static String localName(final ASTModuleNode moduleNode, final String usedModule, final String usedEntity) {
    String _xblockexpression = null;
    {
      final Function1<ASTUseStmtNode, Boolean> _function = (ASTUseStmtNode it) -> {
        return Boolean.valueOf(ASTQuery.eic(it.getName(), usedModule));
      };
      ASTUseStmtNode node = IterableExtensions.<ASTUseStmtNode>findFirst(Iterables.<ASTUseStmtNode>filter(moduleNode.getBody(), ASTUseStmtNode.class), _function);
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(node, null));
      if (_notEquals) {
        String _elvis = null;
        String _elvis_1 = null;
        IASTListNode<ASTRenameNode> _renameList = node.getRenameList();
        ASTRenameNode _findFirst = null;
        if (_renameList!=null) {
          final Function1<ASTRenameNode, Boolean> _function_1 = (ASTRenameNode it) -> {
            return Boolean.valueOf(ASTQuery.eic(it.getName(), usedEntity));
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
            final Function1<ASTOnlyNode, Boolean> _function_2 = (ASTOnlyNode it) -> {
              return Boolean.valueOf(ASTQuery.eic(it.getName(), usedEntity));
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
    boolean _equalsIgnoreCase = false;
    if (a!=null) {
      _equalsIgnoreCase=a.equalsIgnoreCase(b);
    }
    return _equalsIgnoreCase;
  }
  
  /**
   * def static eic(Token t, Object o) {
   * if (o instanceof String) {
   * eic(t, o as String)
   * }
   * else if (o instanceof Token) {
   * eic(t, o as Token)
   * }
   * else {
   * eic(t, o.toString)
   * }
   * }
   */
  public static boolean eic(final Token t, final String s) {
    return ASTQuery.eic(s, t.getText());
  }
  
  public static boolean eic(final String s, final Token t) {
    return ASTQuery.eic(s, t.getText());
  }
  
  public static boolean eic(final Token a, final Token b) {
    return ASTQuery.eic(a.getText(), b.getText());
  }
  
  public static String literal(final IExpr expr) {
    return expr.toString().trim();
  }
}
