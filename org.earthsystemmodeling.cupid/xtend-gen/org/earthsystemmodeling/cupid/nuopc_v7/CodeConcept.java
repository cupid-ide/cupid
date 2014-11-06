package org.earthsystemmodeling.cupid.nuopc_v7;

import alice.tuprolog.MalformedGoalException;
import java.sql.ResultSet;
import java.util.List;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public abstract class CodeConcept<S extends CodeConcept, P extends CodeConcept, A extends IASTNode> {
  protected A _ref;
  
  protected P _parent;
  
  protected long _id;
  
  protected CodeDBIndex _codeDB;
  
  public CodeConcept(final P parent, final CodeDBIndex codeDB) {
    this._codeDB = codeDB;
    this._parent = parent;
  }
  
  public abstract S reverse();
  
  public List<S> reverseMultiple() {
    S _reverse = this.reverse();
    return CollectionLiterals.<S>newArrayList(_reverse);
  }
  
  public abstract TextFileChange forward();
  
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
