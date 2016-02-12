package org.earthsystemmodeling.cupid.nuopc;

import alice.tuprolog.MalformedGoalException;
import com.google.common.base.Objects;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.earthsystemmodeling.cupid.nuopc.ReverseEngineerException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public abstract class CodeConcept<P extends CodeConcept<?, ?>, A extends IASTNode> {
  public P _parent;
  
  public long _id = (-1);
  
  protected CodeDBIndex _codeDB;
  
  protected A _astRef;
  
  protected IResource _context;
  
  private List<Field> childFields;
  
  protected Constructor<?> instanceConstructor;
  
  public CodeConcept(final P parent) {
    this.init(parent);
  }
  
  public CodeDBIndex init(final P parent) {
    CodeDBIndex _xblockexpression = null;
    {
      this._parent = parent;
      CodeDBIndex __codeDB = null;
      if (parent!=null) {
        __codeDB=parent._codeDB;
      }
      _xblockexpression = this._codeDB = __codeDB;
    }
    return _xblockexpression;
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
  public boolean validate(final List<String> errors) {
    boolean _xblockexpression = false;
    {
      List<Field> _childFields = this.getChildFields();
      for (final Field f : _childFields) {
        boolean _validate = this.validate(f, errors);
        boolean _not = (!_validate);
        if (_not) {
          return false;
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
  
  protected boolean validate(final List<CodeConcept<?, ?>> codeConcepts, final List<String> errors) {
    boolean _xblockexpression = false;
    {
      for (final CodeConcept<?, ?> cc : codeConcepts) {
        boolean _validate = cc.validate(errors);
        boolean _not = (!_validate);
        if (_not) {
          return false;
        }
      }
      _xblockexpression = true;
    }
    return _xblockexpression;
  }
  
  protected boolean validate(final Field f, final List<String> errors) {
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
            String _name = f.getName();
            String _plus = ("Min cardinality not satisfied for field " + _name);
            errors.add(_plus);
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
              String _name_1 = f.getName();
              String _plus_1 = ("Min cardinality not satisfied for field " + _name_1);
              errors.add(_plus_1);
              return false;
            } else {
              return this.validate(lst, errors);
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
              String _name_2 = f.getName();
              String _plus_2 = ("Min cardinality not satisfied for field " + _name_2);
              errors.add(_plus_2);
              return false;
            } else {
              boolean _xifexpression_2 = false;
              boolean _notEquals_1 = (!Objects.equal(obj, null));
              if (_notEquals_1) {
                return obj.validate(errors);
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
      A _xifexpression_1 = null;
      boolean _and = false;
      boolean _notEquals_1 = (!Objects.equal(this._codeDB, null));
      if (!_notEquals_1) {
        _and = false;
      } else {
        _and = (this._id >= 0);
      }
      if (_and) {
        _xifexpression_1 = this._codeDB.<A>findASTNode(this._id);
      } else {
        _xifexpression_1 = null;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public A setASTRef(final A astRef) {
    return this._astRef = astRef;
  }
  
  public IFortranAST getAST() {
    IFortranAST _xifexpression = null;
    boolean _and = false;
    boolean _notEquals = (!Objects.equal(this._context, null));
    if (!_notEquals) {
      _and = false;
    } else {
      _and = (this._context instanceof IFile);
    }
    if (_and) {
      PhotranVPG _instance = PhotranVPG.getInstance();
      _xifexpression = _instance.acquireTransientAST(((IFile) this._context));
    } else {
      IFortranAST _xifexpression_1 = null;
      if ((this._id > 0)) {
        _xifexpression_1 = this._codeDB.findAST(this._id);
      } else {
        long _parentID = this.parentID();
        _xifexpression_1 = this._codeDB.findAST(_parentID);
      }
      _xifexpression = _xifexpression_1;
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
    try {
      Object _xblockexpression = null;
      {
        List<Field> _childFields = this.getChildFields();
        final Function1<Field, Boolean> _function = new Function1<Field, Boolean>() {
          @Override
          public Boolean apply(final Field it) {
            Child _annotation = it.<Child>getAnnotation(Child.class);
            return Boolean.valueOf(_annotation.forward());
          }
        };
        Iterable<Field> _filter = IterableExtensions.<Field>filter(_childFields, _function);
        for (final Field field : _filter) {
          {
            Object _get = field.get(this);
            CodeConcept<?, ?> childConcept = ((CodeConcept<?, ?>) _get);
            boolean _equals = Objects.equal(childConcept, null);
            if (_equals) {
              Class<? extends Field> _class = field.getClass();
              Constructor<?>[] _constructors = _class.getConstructors();
              final Function1<Constructor<?>, Boolean> _function_1 = new Function1<Constructor<?>, Boolean>() {
                @Override
                public Boolean apply(final Constructor<?> it) {
                  Class<?>[] _parameterTypes = it.getParameterTypes();
                  int _length = _parameterTypes.length;
                  return Boolean.valueOf((_length == 1));
                }
              };
              Constructor<?> con = IterableExtensions.<Constructor<?>>findFirst(((Iterable<Constructor<?>>)Conversions.doWrapArray(_constructors)), _function_1);
              boolean _notEquals = (!Objects.equal(con, null));
              if (_notEquals) {
                Object _newInstance = con.newInstance(this);
                childConcept = ((CodeConcept<?, ?>) _newInstance);
              } else {
                Class<? extends Field> _class_1 = field.getClass();
                String _name = _class_1.getName();
                String _plus = ("Could not find constructor for class " + _name);
                throw new CodeGenerationException(_plus);
              }
            }
            childConcept.forward();
          }
        }
        _xblockexpression = null;
      }
      return ((IFortranAST)_xblockexpression);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CodeConcept<P, A> newInstance() {
    try {
      boolean _equals = Objects.equal(this.instanceConstructor, null);
      if (_equals) {
        Class<? extends CodeConcept> _class = this.getClass();
        Constructor<?>[] _constructors = _class.getConstructors();
        final Function1<Constructor<?>, Boolean> _function = new Function1<Constructor<?>, Boolean>() {
          @Override
          public Boolean apply(final Constructor<?> it) {
            Class<?>[] _parameterTypes = it.getParameterTypes();
            int _length = _parameterTypes.length;
            return Boolean.valueOf((_length == 1));
          }
        };
        Constructor<?> _findFirst = IterableExtensions.<Constructor<?>>findFirst(((Iterable<Constructor<?>>)Conversions.doWrapArray(_constructors)), _function);
        this.instanceConstructor = _findFirst;
      }
      boolean _equals_1 = Objects.equal(this.instanceConstructor, null);
      if (_equals_1) {
        Class<? extends CodeConcept> _class_1 = this.getClass();
        String _name = _class_1.getName();
        String _plus = ("Cannot find constructor for class: " + _name);
        throw new ReverseEngineerException(_plus);
      }
      Object _newInstance = this.instanceConstructor.newInstance(this._parent);
      return ((CodeConcept<P, A>) _newInstance);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String name() {
    return null;
  }
  
  public ResultSet execQuery(final CharSequence query) {
    Object _xifexpression = null;
    boolean _notEquals = (!Objects.equal(this._codeDB, null));
    if (_notEquals) {
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
    } else {
      _xifexpression = null;
    }
    return ((ResultSet)_xifexpression);
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
  
  public void createFile(final String content) {
    try {
      IFile file = ((IFile) this._context);
      byte[] _bytes = content.getBytes();
      ByteArrayInputStream is = new ByteArrayInputStream(_bytes);
      boolean _exists = file.exists();
      boolean _not = (!_exists);
      if (_not) {
        file.create(is, true, null);
      } else {
        file.setContents(is, true, false, null);
      }
      is.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
