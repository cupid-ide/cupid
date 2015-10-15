package org.earthsystemmodeling.cupid.nuopc;

import alice.tuprolog.MalformedGoalException;
import com.google.common.base.Objects;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.earthsystemmodeling.cupid.annotation.Child;
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
  
  private List<Field> childFields;
  
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
  
  /**
   * def CodeConcept<?,?> nearestAncestor(Class<?> c) {
   * var CodeConcept<?,?> cur = _parent;
   * while (cur != null) {
   * if (c.isInstance(cur)) return cur;
   * }
   * null;
   * }
   */
  protected List<Field> getChildFields() {
    List<Field> _xblockexpression = null;
    {
      boolean _equals = Objects.equal(this.childFields, null);
      if (_equals) {
        ArrayList<Field> _arrayList = new ArrayList<Field>();
        this.childFields = _arrayList;
        Class<? extends CodeConcept> _class = this.getClass();
        Field[] _fields = _class.getFields();
        for (final Field f : _fields) {
          Child _annotation = f.<Child>getAnnotation(Child.class);
          boolean _notEquals = (!Objects.equal(_annotation, null));
          if (_notEquals) {
            this.childFields.add(f);
          }
        }
      }
      _xblockexpression = this.childFields;
    }
    return _xblockexpression;
  }
  
  /**
   * Validate this code concept.  Default behavior is to make sure all
   * children that are required (min>0) are present and to validate
   * recursively.
   */
  public boolean validate() {
    boolean _xblockexpression = false;
    {
      List<Field> _childFields = this.getChildFields();
      for (final Field f : _childFields) {
        boolean _validate = this.validate(f);
        boolean _not = (!_validate);
        if (_not) {
          return false;
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
  
  protected boolean validate(final List<CodeConcept<?, ?>> codeConcepts) {
    boolean _xblockexpression = false;
    {
      for (final CodeConcept<?, ?> cc : codeConcepts) {
        boolean _validate = cc.validate();
        boolean _not = (!_validate);
        if (_not) {
          return false;
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
  
  protected boolean validate(final Field f) {
    try {
      boolean _xblockexpression = false;
      {
        final Child childAnn = f.<Child>getAnnotation(Child.class);
        boolean _xifexpression = false;
        Class<?> _type = f.getType();
        boolean _equals = Objects.equal(_type, List.class);
        if (_equals) {
          Object _get = f.get(this);
          List<CodeConcept<?, ?>> lst = ((List<CodeConcept<?, ?>>) _get);
          boolean _and = false;
          boolean _equals_1 = Objects.equal(lst, null);
          if (!_equals_1) {
            _and = false;
          } else {
            int _min = childAnn.min();
            boolean _greaterThan = (_min > 0);
            _and = _greaterThan;
          }
          if (_and) {
            return false;
          } else {
            boolean _and_1 = false;
            boolean _notEquals = (!Objects.equal(lst, null));
            if (!_notEquals) {
              _and_1 = false;
            } else {
              int _size = lst.size();
              int _min_1 = childAnn.min();
              boolean _lessThan = (_size < _min_1);
              _and_1 = _lessThan;
            }
            if (_and_1) {
              return false;
            } else {
              return this.validate(lst);
            }
          }
        } else {
          boolean _xblockexpression_1 = false;
          {
            Object _get_1 = f.get(this);
            CodeConcept<?, ?> obj = ((CodeConcept<?, ?>) _get_1);
            boolean _xifexpression_1 = false;
            boolean _and_2 = false;
            boolean _equals_2 = Objects.equal(obj, null);
            if (!_equals_2) {
              _and_2 = false;
            } else {
              int _min_2 = childAnn.min();
              boolean _greaterThan_1 = (_min_2 > 0);
              _and_2 = _greaterThan_1;
            }
            if (_and_2) {
              return false;
            } else {
              boolean _xifexpression_2 = false;
              boolean _notEquals_1 = (!Objects.equal(obj, null));
              if (_notEquals_1) {
                return obj.validate();
              } else {
                _xifexpression_2 = true;
              }
              _xifexpression_1 = _xifexpression_2;
            }
            _xblockexpression_1 = _xifexpression_1;
          }
          _xifexpression = _xblockexpression_1;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
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
