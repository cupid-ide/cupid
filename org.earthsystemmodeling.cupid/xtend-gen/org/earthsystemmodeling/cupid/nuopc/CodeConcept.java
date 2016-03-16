package org.earthsystemmodeling.cupid.nuopc;

import com.google.common.base.Objects;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.earthsystemmodeling.cupid.nuopc.ReverseEngineerException;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTExecutableProgramNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IDeclarationConstruct;
import org.eclipse.photran.internal.core.reindenter.Reindenter;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class CodeConcept<P extends CodeConcept<?, ?>, A extends IASTNode> {
  public static class MarkerLoc {
    public int start;
    
    public int end;
    
    public MarkerLoc(final int start, final int end) {
      this.start = start;
      this.end = end;
    }
  }
  
  public P _parent;
  
  protected A _astRef;
  
  protected IResource _context;
  
  protected IFortranAST _ast;
  
  private List<Field> childFields;
  
  protected Constructor<?> instanceConstructor;
  
  @Accessors(AccessorType.PUBLIC_GETTER)
  protected List<CodeConcept.MarkerLoc> paramMarkers;
  
  public CodeConcept(final P parent) {
    this(parent, null);
  }
  
  public CodeConcept(final P parent, final IResource context) {
    this._context = context;
    this._parent = parent;
    ArrayList<CodeConcept.MarkerLoc> _newArrayList = CollectionLiterals.<CodeConcept.MarkerLoc>newArrayList();
    this.paramMarkers = _newArrayList;
  }
  
  public void setOrAddChild(final CodeConcept<?, ?> child) {
    try {
      List<Field> _childFields = this.getChildFields();
      final Function1<Field, Boolean> _function = new Function1<Field, Boolean>() {
        @Override
        public Boolean apply(final Field it) {
          Class<?> _type = it.getType();
          return Boolean.valueOf(_type.isInstance(child));
        }
      };
      Field childField = IterableExtensions.<Field>findFirst(_childFields, _function);
      boolean _notEquals = (!Objects.equal(childField, null));
      if (_notEquals) {
        childField.set(this, child);
      } else {
        List<Field> _childFields_1 = this.getChildFields();
        final Function1<Field, Boolean> _function_1 = new Function1<Field, Boolean>() {
          @Override
          public Boolean apply(final Field it) {
            boolean _and = false;
            Class<?> _type = it.getType();
            boolean _equals = Objects.equal(_type, List.class);
            if (!_equals) {
              _and = false;
            } else {
              boolean _xblockexpression = false;
              {
                Type _genericType = it.getGenericType();
                final ParameterizedType ptype = ((ParameterizedType) _genericType);
                Type[] _actualTypeArguments = ptype.getActualTypeArguments();
                Type _get = _actualTypeArguments[0];
                final Class<?> clazz = ((Class<?>) _get);
                boolean _xifexpression = false;
                Class<? extends CodeConcept> _class = child.getClass();
                boolean _equals_1 = Objects.equal(clazz, _class);
                if (_equals_1) {
                  _xifexpression = true;
                } else {
                  _xifexpression = false;
                }
                _xblockexpression = _xifexpression;
              }
              _and = _xblockexpression;
            }
            return Boolean.valueOf(_and);
          }
        };
        Field _findFirst = IterableExtensions.<Field>findFirst(_childFields_1, _function_1);
        childField = _findFirst;
        boolean _notEquals_1 = (!Objects.equal(childField, null));
        if (_notEquals_1) {
          Object _get = childField.get(this);
          final List lst = ((List) _get);
          boolean _notEquals_2 = (!Objects.equal(lst, null));
          if (_notEquals_2) {
            lst.add(child);
          } else {
            throw new CodeGenerationException("Cannot add child to null list");
          }
        } else {
          throw new CodeGenerationException("Error finding child field");
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
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
      _xifexpression = null;
    }
    return _xifexpression;
  }
  
  public A setASTRef(final A astRef) {
    return this._astRef = astRef;
  }
  
  public <T extends CodeConcept<?, ?>> T findNearestAncestor(final Class<? extends IASTNode> classToFind) {
    T _xifexpression = null;
    boolean _isInstance = classToFind.isInstance(this._astRef);
    if (_isInstance) {
      _xifexpression = ((T) this);
    } else {
      T _findNearestAncestor = null;
      if (this._parent!=null) {
        _findNearestAncestor=this._parent.<T>findNearestAncestor(classToFind);
      }
      _xifexpression = _findNearestAncestor;
    }
    return _xifexpression;
  }
  
  public IFortranAST getAST() {
    IFortranAST _xifexpression = null;
    boolean _notEquals = (!Objects.equal(this._ast, null));
    if (_notEquals) {
      _xifexpression = this._ast;
    } else {
      IFortranAST _xifexpression_1 = null;
      boolean _and = false;
      boolean _notEquals_1 = (!Objects.equal(this._context, null));
      if (!_notEquals_1) {
        _and = false;
      } else {
        _and = (this._context instanceof IFile);
      }
      if (_and) {
        IFortranAST _xblockexpression = null;
        {
          PhotranVPG _instance = PhotranVPG.getInstance();
          _instance.releaseAST(((IFile) this._context));
          PhotranVPG _instance_1 = PhotranVPG.getInstance();
          IFortranAST _acquireTransientAST = _instance_1.acquireTransientAST(((IFile) this._context));
          this._ast = _acquireTransientAST;
          _xblockexpression = this._ast;
        }
        _xifexpression_1 = _xblockexpression;
      } else {
        _xifexpression_1 = null;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public <T extends CodeConcept<?, ?>> T reverse() {
    return ((T) this);
  }
  
  public List<CodeConcept<P, A>> reverseMultiple() {
    CodeConcept<P, A> _reverse = this.<CodeConcept<P, A>>reverse();
    return CollectionLiterals.<CodeConcept<P, A>>newArrayList(_reverse);
  }
  
  public <T extends CodeConcept<?, ?>> T forward() throws CodeGenerationException {
    try {
      T _xblockexpression = null;
      {
        List<Field> _childFields = this.getChildFields();
        for (final Field field : _childFields) {
          Class<?> _type = field.getType();
          boolean _isAssignableFrom = List.class.isAssignableFrom(_type);
          if (_isAssignableFrom) {
            Object _get = field.get(this);
            List<CodeConcept<?, ?>> theList = ((List<CodeConcept<?, ?>>) _get);
            boolean _notEquals = (!Objects.equal(theList, null));
            if (_notEquals) {
              for (int i = 0; (i < theList.size()); i++) {
                CodeConcept<?, ?> _get_1 = theList.get(i);
                CodeConcept<?, ?> _forward = _get_1.<CodeConcept<?, ?>>forward();
                theList.set(i, _forward);
              }
            }
          } else {
            Object _get_1 = field.get(this);
            CodeConcept<?, ?> childConcept = ((CodeConcept<?, ?>) _get_1);
            boolean _and = false;
            boolean _equals = Objects.equal(childConcept, null);
            if (!_equals) {
              _and = false;
            } else {
              Child _annotation = field.<Child>getAnnotation(Child.class);
              boolean _forward = _annotation.forward();
              _and = _forward;
            }
            if (_and) {
              Class<?> _type_1 = field.getType();
              Constructor<?>[] _constructors = _type_1.getConstructors();
              final Function1<Constructor<?>, Boolean> _function = new Function1<Constructor<?>, Boolean>() {
                @Override
                public Boolean apply(final Constructor<?> it) {
                  Class<?>[] _parameterTypes = it.getParameterTypes();
                  int _length = _parameterTypes.length;
                  return Boolean.valueOf((_length == 1));
                }
              };
              Constructor<?> con = IterableExtensions.<Constructor<?>>findFirst(((Iterable<Constructor<?>>)Conversions.doWrapArray(_constructors)), _function);
              boolean _notEquals_1 = (!Objects.equal(con, null));
              if (_notEquals_1) {
                Object _newInstance = con.newInstance(this);
                childConcept = ((CodeConcept<?, ?>) _newInstance);
              } else {
                String _name = field.getName();
                String _plus = ("Could not find constructor for field " + _name);
                String _plus_1 = (_plus + " with class ");
                Class<?> _type_2 = field.getType();
                String _name_1 = _type_2.getName();
                String _plus_2 = (_plus_1 + _name_1);
                throw new CodeGenerationException(_plus_2);
              }
            }
            boolean _notEquals_2 = (!Objects.equal(childConcept, null));
            if (_notEquals_2) {
              CodeConcept<?, ?> _forward_1 = childConcept.<CodeConcept<?, ?>>forward();
              field.set(this, _forward_1);
            }
          }
        }
        _xblockexpression = ((T) this);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Change generateChange() {
    try {
      boolean _equals = Objects.equal(this._context, null);
      if (_equals) {
        return this._parent.generateChange();
      } else {
        if ((this._context instanceof IFile)) {
          IFortranAST _aST = this.getAST();
          ASTExecutableProgramNode _root = _aST.getRoot();
          IFortranAST _aST_1 = this.getAST();
          Reindenter.reindent(_root, _aST_1, Reindenter.Strategy.REINDENT_EACH_LINE);
          InputStream _contents = ((IFile)this._context).getContents(false);
          final String fileContentsBefore = IOUtils.toString(_contents);
          IFortranAST _aST_2 = this.getAST();
          ASTExecutableProgramNode _root_1 = _aST_2.getRoot();
          String _string = _root_1.toString();
          final String fileContentsAfter = this.replaceParameters(_string);
          final int charsInFile = fileContentsBefore.length();
          PhotranVPG _instance = PhotranVPG.getInstance();
          NullProgressMonitor _nullProgressMonitor = new NullProgressMonitor();
          _instance.commitChangesFromInMemoryASTs(_nullProgressMonitor, 0, ((IFile) this._context));
          this._ast = null;
          PhotranVPG _instance_1 = PhotranVPG.getInstance();
          _instance_1.releaseAST(((IFile) this._context));
          boolean _equals_1 = fileContentsAfter.equals(fileContentsBefore);
          boolean _not = (!_equals_1);
          if (_not) {
            IPath _fullPath = ((IFile)this._context).getFullPath();
            String _oSString = _fullPath.toOSString();
            String _plus = ("Cupid code generation: " + _oSString);
            final TextFileChange textFileChange = new TextFileChange(_plus, ((IFile)this._context));
            ReplaceEdit _replaceEdit = new ReplaceEdit(0, charsInFile, fileContentsAfter);
            textFileChange.setEdit(_replaceEdit);
            return textFileChange;
          }
        }
      }
      return null;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void forward(final IProgressMonitor pm) {
    try {
      this.<CodeConcept<?, ?>>forward();
      Change _generateChange = this.generateChange();
      _generateChange.perform(pm);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private static String PARAM_REGEX = "CUPIDPARAM\\$(CHAR|INT)\\$([^\\$]*)\\$";
  
  private static Pattern PARAM_PATTERN = Pattern.compile(CodeConcept.PARAM_REGEX);
  
  public String replaceParameters(final String content) {
    String _xblockexpression = null;
    {
      final Matcher matcher = CodeConcept.PARAM_PATTERN.matcher(content);
      final StringBuffer sb = new StringBuffer();
      while (matcher.find()) {
        {
          matcher.appendReplacement(sb, "$2");
          final int endLoc = sb.length();
          String _group = matcher.group(2);
          int _length = _group.length();
          final int startLoc = (endLoc - _length);
          CodeConcept.MarkerLoc _markerLoc = new CodeConcept.MarkerLoc(startLoc, endLoc);
          this.paramMarkers.add(_markerLoc);
        }
      }
      matcher.appendTail(sb);
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
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
  
  public CharSequence paramch(final String defaultVal) {
    CharSequence _xifexpression = null;
    boolean _and = false;
    boolean _startsWith = defaultVal.startsWith("\'");
    if (!_startsWith) {
      _and = false;
    } else {
      boolean _endsWith = defaultVal.endsWith("\'");
      _and = _endsWith;
    }
    if (_and) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\'CUPIDPARAM$CHAR$");
      int _length = defaultVal.length();
      int _minus = (_length - 1);
      CharSequence _subSequence = defaultVal.subSequence(1, _minus);
      String _plus = (_subSequence + "$\'");
      _builder.append(_plus, "");
      return _builder.toString();
    } else {
      CharSequence _xifexpression_1 = null;
      boolean _and_1 = false;
      boolean _startsWith_1 = defaultVal.startsWith("\"");
      if (!_startsWith_1) {
        _and_1 = false;
      } else {
        boolean _endsWith_1 = defaultVal.endsWith("\"");
        _and_1 = _endsWith_1;
      }
      if (_and_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\"CUPIDPARAM$CHAR$");
        int _length_1 = defaultVal.length();
        int _minus_1 = (_length_1 - 1);
        CharSequence _subSequence_1 = defaultVal.subSequence(1, _minus_1);
        _builder_1.append(_subSequence_1, "");
        _builder_1.append("$\"");
        return _builder_1.toString();
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("CUPIDPARAM$CHAR$");
        _builder_2.append(defaultVal, "");
        _builder_2.append("$");
        _xifexpression_1 = _builder_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence paramint(final int defaultVal) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CUPIDPARAM$INT$");
    _builder.append(defaultVal, "");
    _builder.append("$");
    return _builder;
  }
  
  public CharSequence paramint(final String defaultVal) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CUPIDPARAM$INT$");
    _builder.append(defaultVal, "");
    _builder.append("$");
    return _builder;
  }
  
  public static void addTypeDeclaration(final String code, final ASTSubroutineSubprogramNode ssn) {
    IBodyConstruct _parseLiteralStatement = CodeExtraction.parseLiteralStatement(code);
    final ASTTypeDeclarationStmtNode tds = ((ASTTypeDeclarationStmtNode) _parseLiteralStatement);
    IASTListNode<IBodyConstruct> _body = ssn.getBody();
    final IDeclarationConstruct last = _body.<IDeclarationConstruct>findLast(IDeclarationConstruct.class);
    boolean _notEquals = (!Objects.equal(last, null));
    if (_notEquals) {
      IASTListNode<IBodyConstruct> _body_1 = ssn.getBody();
      ((IASTListNode<IBodyConstruct>) _body_1).insertAfter(last, tds);
    } else {
      IASTListNode<IBodyConstruct> _body_2 = ssn.getBody();
      _body_2.add(0, tds);
    }
  }
  
  @Pure
  public List<CodeConcept.MarkerLoc> getParamMarkers() {
    return this.paramMarkers;
  }
}
