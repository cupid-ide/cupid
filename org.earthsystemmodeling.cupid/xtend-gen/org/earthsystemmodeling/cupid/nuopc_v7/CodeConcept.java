package org.earthsystemmodeling.cupid.nuopc_v7;

import alice.tuprolog.MalformedGoalException;
import java.sql.ResultSet;
import java.util.List;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public abstract class CodeConcept<S extends CodeConcept, P extends CodeConcept, A extends IASTNode> {
  protected P _parent;
  
  protected long _id;
  
  protected CodeDBIndex _codeDB;
  
  public CodeConcept(final P parent) {
    this._parent = parent;
    CodeDBIndex __codeDB = null;
    if (parent!=null) {
      __codeDB=parent._codeDB;
    }
    this._codeDB = __codeDB;
  }
  
  public long parentID() {
    long _xifexpression = (long) 0;
    long __id = 0l;
    if (this._parent!=null) {
      __id=this._parent._id;
    }
    boolean _greaterThan = (__id > 0);
    if (_greaterThan) {
      _xifexpression = this._parent._id;
    } else {
      long _parentID = 0l;
      if (this._parent!=null) {
        _parentID=this._parent.parentID();
      }
      _xifexpression = _parentID;
    }
    return _xifexpression;
  }
  
  public A getASTRef() {
    return this._codeDB.<A>findASTNode(this._id);
  }
  
  public IFortranAST getAST() {
    IFortranAST _xifexpression = null;
    if ((this._id > 0)) {
      _xifexpression = this._codeDB.findAST(this._id);
    } else {
      long _parentID = this.parentID();
      _xifexpression = this._codeDB.findAST(_parentID);
    }
    return _xifexpression;
  }
  
  public S reverse() {
    return ((S) this);
  }
  
  public List<S> reverseMultiple() {
    S _reverse = this.reverse();
    return CollectionLiterals.<S>newArrayList(_reverse);
  }
  
  public abstract IFortranAST forward();
  
  public String name() {
    return null;
  }
  
  public ResultSet execQuery(final CharSequence query) {
    Object _xblockexpression = null;
    {
      try {
        String _string = query.toString();
        ResultSet rs = this._codeDB.query2(_string);
        return rs;
      } catch (final Throwable _t) {
        if (_t instanceof MalformedGoalException) {
          final MalformedGoalException e = (MalformedGoalException)_t;
          CupidActivator.log("Bad query", e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = null;
    }
    return ((ResultSet)_xblockexpression);
  }
  
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    Class<? extends CodeConcept> _class = this.getClass();
    String _simpleName = _class.getSimpleName();
    _builder.append(_simpleName, "");
    _builder.append(" : ");
    _builder.append(this._id, "");
    return _builder.toString();
  }
}
