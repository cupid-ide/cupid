package org.earthsystemmodeling.cupid.nuopc;

import alice.tuprolog.MalformedGoalException;
import com.google.common.base.Objects;
import java.sql.ResultSet;
import java.util.List;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public abstract class CodeConcept<P extends CodeConcept<?, ?>, A extends IASTNode> {
  public P _parent;
  
  public long _id;
  
  public CodeDBIndex _codeDB;
  
  public A _astRef;
  
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
    A _xifexpression = null;
    boolean _notEquals = (!Objects.equal(this._astRef, null));
    if (_notEquals) {
      _xifexpression = this._astRef;
    } else {
      _xifexpression = this._codeDB.<A>findASTNode(this._id);
    }
    return _xifexpression;
  }
  
  public A setASTRef(final A astRef) {
    return this._astRef = astRef;
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
  
  public CodeConcept<P, A> reverse() {
    return this;
  }
  
  public List<CodeConcept<P, A>> reverseMultiple() {
    CodeConcept<P, A> _reverse = this.reverse();
    return CollectionLiterals.<CodeConcept<P, A>>newArrayList(_reverse);
  }
  
  public IFortranAST forward() throws CodeGenerationException {
    return null;
  }
  
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
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    Class<? extends CodeConcept> _class = this.getClass();
    String _simpleName = _class.getSimpleName();
    _builder.append(_simpleName, "");
    _builder.append(" : ");
    _builder.append(this._id, "");
    return _builder.toString();
  }
  
  public CharSequence paramch(final String defaultVal) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CUPIDPARAM$CHAR$");
    _builder.append(defaultVal, "");
    _builder.append("$");
    return _builder;
  }
  
  public CharSequence paramint(final int defaultVal) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CUPIDPARAM$INT$");
    _builder.append(defaultVal, "");
    _builder.append("$");
    return _builder;
  }
}
