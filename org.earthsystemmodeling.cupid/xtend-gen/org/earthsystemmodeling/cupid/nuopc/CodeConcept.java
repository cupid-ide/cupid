package org.earthsystemmodeling.cupid.nuopc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.earthsystemmodeling.cupid.nuopc.ReverseEngineerException;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.compare.internal.DocLineComparator;
import org.eclipse.compare.rangedifferencer.RangeDifference;
import org.eclipse.compare.rangedifferencer.RangeDifferencer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.text.Document;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTEntityDeclNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTObjectNameNode;
import org.eclipse.photran.internal.core.parser.ASTOnlyNode;
import org.eclipse.photran.internal.core.parser.ASTRenameNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IDeclarationConstruct;
import org.eclipse.photran.internal.core.parser.ISpecificationPartConstruct;
import org.eclipse.photran.internal.core.reindenter.Reindenter;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.photran.internal.core.vpg.eclipse.VPGSchedulingRule;
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
  /**
   * static class ReleaseASTJob extends Job {
   * 
   * val IFile file
   * 
   * new(IFile file) {
   * super("Release Fortran AST")
   * //setRule(MultiRule.combine(VPGSchedulingRule.getInstance(),
   * //        ResourcesPlugin.getWorkspace().getRoot()))
   * setRule(VPGSchedulingRule.getInstance())
   * this.file = file
   * }
   * 
   * override protected run(IProgressMonitor monitor) {
   * PhotranVPG.instance.releaseAST(file)
   * return Status.OK_STATUS
   * }
   * 
   * }
   */
  public static class ForceReindexJob extends WorkspaceJob {
    private final IFile file;
    
    public ForceReindexJob(final IFile file) {
      super("Reindex Fortran AST");
      this.setRule(VPGSchedulingRule.getInstance());
      this.file = file;
    }
    
    @Override
    public IStatus runInWorkspace(final IProgressMonitor monitor) {
      final String filename = PhotranVPG.getFilenameForIFile(this.file);
      PhotranVPG.getInstance().forceRecomputationOfEdgesAndAnnotations(filename);
      return Status.OK_STATUS;
    }
  }
  
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
    this.paramMarkers = CollectionLiterals.<CodeConcept.MarkerLoc>newArrayList();
  }
  
  public IResource getContext() {
    boolean _notEquals = (!Objects.equal(this._context, null));
    if (_notEquals) {
      return this._context;
    } else {
      boolean _notEquals_1 = (!Objects.equal(this._parent, null));
      if (_notEquals_1) {
        return this._parent.getContext();
      } else {
        return null;
      }
    }
  }
  
  public void setOrAddChild(final CodeConcept<?, ?> child) {
    this.setOrAddChild(child, true);
  }
  
  public void setOrAddChild(final CodeConcept<?, ?> child, final boolean failIfMissing) {
    try {
      final Function1<Field, Boolean> _function = (Field it) -> {
        return Boolean.valueOf(it.getType().isInstance(child));
      };
      Field childField = IterableExtensions.<Field>findFirst(this.getChildFields(), _function);
      boolean _notEquals = (!Objects.equal(childField, null));
      if (_notEquals) {
        childField.set(this, child);
      } else {
        final Function1<Field, Boolean> _function_1 = (Field it) -> {
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
              Type _get = ptype.getActualTypeArguments()[0];
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
        };
        childField = IterableExtensions.<Field>findFirst(this.getChildFields(), _function_1);
        boolean _notEquals_1 = (!Objects.equal(childField, null));
        if (_notEquals_1) {
          Object _get = childField.get(this);
          final List lst = ((List) _get);
          boolean _notEquals_2 = (!Objects.equal(lst, null));
          if (_notEquals_2) {
            boolean _contains = lst.contains(child);
            boolean _not = (!_contains);
            if (_not) {
              lst.add(child);
            }
          } else {
            throw new CodeGenerationException("Cannot add child to null list");
          }
        } else {
          if (failIfMissing) {
            throw new CodeGenerationException("Error finding child field");
          }
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
        Field[] _fields = this.getClass().getFields();
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
      boolean _notEquals = (!Objects.equal(codeConcepts, null));
      if (_notEquals) {
        for (final CodeConcept<?, ?> cc : codeConcepts) {
          boolean _validate = cc.validate(errors);
          boolean _not = (!_validate);
          if (_not) {
            return false;
          }
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
          if ((Objects.equal(lst, null) && (childAnn.min() > 0))) {
            String _name = f.getName();
            String _plus = ("Min cardinality not satisfied for field " + _name);
            errors.add(_plus);
            return false;
          } else {
            if (((!Objects.equal(lst, null)) && (lst.size() < childAnn.min()))) {
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
            if ((Objects.equal(obj, null) && (childAnn.min() > 0))) {
              String _name_2 = f.getName();
              String _plus_2 = ("Min cardinality not satisfied for field " + _name_2);
              errors.add(_plus_2);
              return false;
            } else {
              boolean _xifexpression_2 = false;
              boolean _notEquals = (!Objects.equal(obj, null));
              if (_notEquals) {
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
  
  public Object getASTOLD() {
    return null;
  }
  
  public IFortranAST getAST() {
    IFortranAST _xifexpression = null;
    boolean _notEquals = (!Objects.equal(this._ast, null));
    if (_notEquals) {
      _xifexpression = this._ast;
    } else {
      IFortranAST _xifexpression_1 = null;
      if (((!Objects.equal(this._context, null)) && (this._context instanceof IFile))) {
        IFortranAST _xblockexpression = null;
        {
          this._ast = PhotranVPG.getInstance().acquireTransientAST(((IFile) this._context));
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
  
  public <T extends CodeConcept<?, ?>> T reverse() throws ReverseEngineerException {
    return ((T) this);
  }
  
  public List<CodeConcept<P, A>> reverseMultiple() {
    try {
      return CollectionLiterals.<CodeConcept<P, A>>newArrayList(this.<CodeConcept<P, A>>reverse());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public <T extends CodeConcept<?, ?>> T forward() throws CodeGenerationException {
    try {
      T _xblockexpression = null;
      {
        List<Field> _childFields = this.getChildFields();
        for (final Field field : _childFields) {
          boolean _isAssignableFrom = List.class.isAssignableFrom(field.getType());
          if (_isAssignableFrom) {
            Object _get = field.get(this);
            List<CodeConcept<?, ?>> theList = ((List<CodeConcept<?, ?>>) _get);
            boolean _notEquals = (!Objects.equal(theList, null));
            if (_notEquals) {
              for (int i = 0; (i < theList.size()); i++) {
                theList.set(i, theList.get(i).<CodeConcept<?, ?>>forward());
              }
            }
          } else {
            Object _get_1 = field.get(this);
            CodeConcept<?, ?> childConcept = ((CodeConcept<?, ?>) _get_1);
            if ((Objects.equal(childConcept, null) && field.<Child>getAnnotation(Child.class).forward())) {
              final Function1<Constructor<?>, Boolean> _function = (Constructor<?> it) -> {
                int _length = it.getParameterTypes().length;
                return Boolean.valueOf((_length == 1));
              };
              Constructor<?> con = IterableExtensions.<Constructor<?>>findFirst(((Iterable<Constructor<?>>)Conversions.doWrapArray(field.getType().getConstructors())), _function);
              boolean _notEquals_1 = (!Objects.equal(con, null));
              if (_notEquals_1) {
                Object _newInstance = con.newInstance(this);
                childConcept = ((CodeConcept<?, ?>) _newInstance);
              } else {
                String _name = field.getName();
                String _plus = ("Could not find constructor for field " + _name);
                String _plus_1 = (_plus + " with class ");
                String _name_1 = field.getType().getName();
                String _plus_2 = (_plus_1 + _name_1);
                throw new CodeGenerationException(_plus_2);
              }
            }
            boolean _notEquals_2 = (!Objects.equal(childConcept, null));
            if (_notEquals_2) {
              field.set(this, childConcept.<CodeConcept<?, ?>>forward());
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
  
  /**
   * def Change generateChange() {
   * 
   * if (_context == null) {
   * return _parent.generateChange
   * }
   * else if (_context instanceof IFile) {
   * 
   * Reindenter.reindent(getAST.root, getAST, Strategy.REINDENT_EACH_LINE);
   * 
   * val fileContentsBefore = IOUtils.toString(_context.getContents(false))
   * val fileContentsAfter = replaceParameters(getAST.root.toString)
   * val charsInFile = fileContentsBefore.length
   * 
   * //PhotranVPG.instance.commitChangesFromInMemoryASTs(
   * //			new NullProgressMonitor(), 0, _context as IFile)
   * 
   * //_ast = null  //force recompute of ast
   * //PhotranVPG.instance.releaseAST(_context as IFile)
   * 
   * val astJob = new ReleaseASTJob(_context as IFile)
   * astJob.schedule
   * astJob.join
   * 
   * if (!fileContentsAfter.equals(fileContentsBefore)) {
   * val textFileChange = new TextFileChange("Cupid code generation: " + _context.getFullPath().toOSString(), _context)
   * textFileChange.setEdit(new ReplaceEdit(0, charsInFile, fileContentsAfter));
   * return textFileChange
   * }
   * }
   * 
   * }
   */
  public void applyChanges(final IProgressMonitor monitor) {
    try {
      if ((Objects.equal(this._context, null) || (!(this._context instanceof IFile)))) {
        this._parent.applyChanges(monitor);
        return;
      }
      final IFile file = ((IFile) this._context);
      final IFortranAST ast = this.getAST();
      Reindenter.reindent(ast.getRoot(), ast, Reindenter.Strategy.REINDENT_EACH_LINE);
      final String fileContentsBefore = IOUtils.toString(file.getContents(false));
      final String fileContentsAfter = this.replaceParameters(ast.getRoot().toString());
      byte[] _bytes = fileContentsAfter.getBytes();
      ByteArrayInputStream _byteArrayInputStream = new ByteArrayInputStream(_bytes);
      file.setContents(_byteArrayInputStream, true, true, monitor);
      final CodeConcept.ForceReindexJob reindexJob = new CodeConcept.ForceReindexJob(file);
      reindexJob.schedule();
      final boolean completed = reindexJob.join(2000, monitor);
      if ((!completed)) {
        CupidActivator.debug("Reindex job failed to join in 2 seconds.");
      }
      Document _document = new Document(fileContentsBefore);
      final DocLineComparator left = new DocLineComparator(_document, null, true);
      Document _document_1 = new Document(fileContentsAfter);
      final DocLineComparator right = new DocLineComparator(_document_1, null, true);
      final RangeDifference[] diffs = RangeDifferencer.findDifferences(left, right);
      file.deleteMarkers("org.earthsystemmodeling.cupid.cupidmarker", false, IResource.DEPTH_ZERO);
      file.deleteMarkers("org.earthsystemmodeling.cupid.cupidparam", false, IResource.DEPTH_ZERO);
      final Consumer<RangeDifference> _function = (RangeDifference rd) -> {
        try {
          final int start = right.getTokenStart(rd.rightStart());
          int _tokenStart = right.getTokenStart(rd.rightEnd());
          int _tokenLength = right.getTokenLength(rd.rightEnd());
          final int end = (_tokenStart + _tokenLength);
          if (((end - start) > 2)) {
            final IMarker marker = file.createMarker("org.earthsystemmodeling.cupid.cupidmarker");
            marker.setAttribute(IMarker.CHAR_START, start);
            marker.setAttribute(IMarker.CHAR_END, end);
            marker.setAttribute(IMarker.MESSAGE, "Cupid generated code");
            int _rightStart = rd.rightStart();
            String _plus = ("Lines " + Integer.valueOf(_rightStart));
            String _plus_1 = (_plus + " to ");
            int _rightEnd = rd.rightEnd();
            String _plus_2 = (_plus_1 + Integer.valueOf(_rightEnd));
            marker.setAttribute(IMarker.LOCATION, _plus_2);
          }
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      ((List<RangeDifference>)Conversions.doWrapArray(diffs)).forEach(_function);
      final Consumer<CodeConcept.MarkerLoc> _function_1 = (CodeConcept.MarkerLoc ml) -> {
        try {
          final IMarker marker = file.createMarker("org.earthsystemmodeling.cupid.cupidparam");
          marker.setAttribute(IMarker.CHAR_START, ml.start);
          marker.setAttribute(IMarker.CHAR_END, ml.end);
          marker.setAttribute(IMarker.MESSAGE, "Generated parameter");
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      this.paramMarkers.forEach(_function_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * def void forward(IProgressMonitor pm) {
   * forward
   * generateChange.perform(pm)
   * 
   * //val f = (generateChange as TextFileChange).file
   * //val fn = PhotranVPG.getFilenameForIFile(f)
   * //PhotranVPG.instance.forceRecomputationOfEdgesAndAnnotations(fn)
   * 
   * }
   */
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
          int _length = matcher.group(2).length();
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
        final Function1<Constructor<?>, Boolean> _function = (Constructor<?> it) -> {
          int _length = it.getParameterTypes().length;
          return Boolean.valueOf((_length == 1));
        };
        this.instanceConstructor = IterableExtensions.<Constructor<?>>findFirst(((Iterable<Constructor<?>>)Conversions.doWrapArray(this.getClass().getConstructors())), _function);
      }
      boolean _equals_1 = Objects.equal(this.instanceConstructor, null);
      if (_equals_1) {
        String _name = this.getClass().getName();
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
    if ((defaultVal.startsWith("\'") && defaultVal.endsWith("\'"))) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\'CUPIDPARAM$CHAR$");
      int _length = defaultVal.length();
      int _minus = (_length - 1);
      CharSequence _subSequence = defaultVal.subSequence(1, _minus);
      String _plus = (_subSequence + "$\'");
      _builder.append(_plus);
      return _builder.toString();
    } else {
      CharSequence _xifexpression_1 = null;
      if ((defaultVal.startsWith("\"") && defaultVal.endsWith("\""))) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("\"CUPIDPARAM$CHAR$");
        int _length_1 = defaultVal.length();
        int _minus_1 = (_length_1 - 1);
        CharSequence _subSequence_1 = defaultVal.subSequence(1, _minus_1);
        _builder_1.append(_subSequence_1);
        _builder_1.append("$\"");
        return _builder_1.toString();
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("CUPIDPARAM$CHAR$");
        _builder_2.append(defaultVal);
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
    _builder.append(defaultVal);
    _builder.append("$");
    return _builder;
  }
  
  public CharSequence paramint(final String defaultVal) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CUPIDPARAM$INT$");
    _builder.append(defaultVal);
    _builder.append("$");
    return _builder;
  }
  
  public static int[] toIntArray(final List<Integer> intList) {
    int[] _xblockexpression = null;
    {
      final int[] toRet = new int[intList.size()];
      for (int i = 0; (i < intList.size()); i++) {
        toRet[i] = (intList.get(i)).intValue();
      }
      _xblockexpression = toRet;
    }
    return _xblockexpression;
  }
  
  public static double[] toDoubleArray(final List<Double> dblList) {
    double[] _xblockexpression = null;
    {
      double[] toRet = new double[dblList.size()];
      for (int i = 0; (i < dblList.size()); i++) {
        toRet[i] = (dblList.get(i)).doubleValue();
      }
      _xblockexpression = toRet;
    }
    return _xblockexpression;
  }
  
  public static void addTypeDeclaration(final String code, final ASTSubroutineSubprogramNode ssn, final boolean ignoreIfDeclared) {
    try {
      IBodyConstruct _parseLiteralStatement = CodeExtraction.<IBodyConstruct>parseLiteralStatement(code);
      final ASTTypeDeclarationStmtNode tds = ((ASTTypeDeclarationStmtNode) _parseLiteralStatement);
      final String varName = tds.getEntityDeclList().get(0).getObjectName().getObjectName().getText();
      final Function1<ASTTypeDeclarationStmtNode, Boolean> _function = (ASTTypeDeclarationStmtNode t) -> {
        IASTListNode<ASTEntityDeclNode> _entityDeclList = t.getEntityDeclList();
        boolean _exists = false;
        if (_entityDeclList!=null) {
          final Function1<ASTEntityDeclNode, Boolean> _function_1 = (ASTEntityDeclNode e) -> {
            ASTObjectNameNode _objectName = e.getObjectName();
            Token _objectName_1 = null;
            if (_objectName!=null) {
              _objectName_1=_objectName.getObjectName();
            }
            boolean _eic = false;
            if (_objectName_1!=null) {
              _eic=ASTQuery.eic(_objectName_1, varName);
            }
            return Boolean.valueOf(_eic);
          };
          _exists=IterableExtensions.<ASTEntityDeclNode>exists(_entityDeclList, _function_1);
        }
        return Boolean.valueOf(_exists);
      };
      final ASTTypeDeclarationStmtNode existing = IterableExtensions.<ASTTypeDeclarationStmtNode>findFirst(Iterables.<ASTTypeDeclarationStmtNode>filter(ssn.getBody(), ASTTypeDeclarationStmtNode.class), _function);
      boolean _notEquals = (!Objects.equal(existing, null));
      if (_notEquals) {
        if (ignoreIfDeclared) {
          return;
        } else {
          throw new CodeGenerationException(("Tried to declare same entity multiple times: " + code));
        }
      }
      final IDeclarationConstruct last = ssn.getBody().<IDeclarationConstruct>findLast(IDeclarationConstruct.class);
      boolean _notEquals_1 = (!Objects.equal(last, null));
      if (_notEquals_1) {
        IASTListNode<IBodyConstruct> _body = ssn.getBody();
        ((IASTListNode<IBodyConstruct>) _body).insertAfter(last, tds);
      } else {
        ssn.getBody().add(0, tds);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static ASTUseStmtNode ensureImport(final ASTUseStmtNode usn, final String entityName, final String localName) {
    boolean _or = false;
    boolean _or_1 = false;
    Set<ASTRenameNode> _findAll = usn.<ASTRenameNode>findAll(ASTRenameNode.class);
    boolean _exists = false;
    if (_findAll!=null) {
      final Function1<ASTRenameNode, Boolean> _function = (ASTRenameNode rn) -> {
        return Boolean.valueOf((ASTQuery.eic(rn.getName(), entityName) && 
          ASTQuery.eic(rn.getNewName(), localName)));
      };
      _exists=IterableExtensions.<ASTRenameNode>exists(_findAll, _function);
    }
    if (_exists) {
      _or_1 = true;
    } else {
      Set<ASTOnlyNode> _findAll_1 = usn.<ASTOnlyNode>findAll(ASTOnlyNode.class);
      boolean _exists_1 = false;
      if (_findAll_1!=null) {
        final Function1<ASTOnlyNode, Boolean> _function_1 = (ASTOnlyNode on) -> {
          return Boolean.valueOf((ASTQuery.eic(on.getName(), entityName) && 
            ASTQuery.eic(on.getNewName(), localName)));
        };
        _exists_1=IterableExtensions.<ASTOnlyNode>exists(_findAll_1, _function_1);
      }
      _or_1 = _exists_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      _or = (IterableExtensions.isNullOrEmpty(usn.<ASTRenameNode>findAll(ASTRenameNode.class)) && 
        IterableExtensions.isNullOrEmpty(usn.<ASTOnlyNode>findAll(ASTOnlyNode.class)));
    }
    final boolean exists = _or;
    if ((!exists)) {
      String _trim = usn.toString().trim();
      String _plus = (_trim + ", &\n");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(localName);
      _builder.append(" => ");
      _builder.append(entityName);
      final String code = (_plus + _builder);
      IBodyConstruct _parseLiteralStatement = CodeExtraction.<IBodyConstruct>parseLiteralStatement(code);
      final ASTUseStmtNode newNode = ((ASTUseStmtNode) _parseLiteralStatement);
      usn.replaceWith(newNode);
      return newNode;
    } else {
      return usn;
    }
  }
  
  public static ASTUseStmtNode ensureImport(final ASTModuleNode amn, final String moduleName) {
    return CodeConcept.ensureImport(amn, moduleName, null, null, false);
  }
  
  public static ASTUseStmtNode ensureImport(final ASTModuleNode amn, final String moduleName, final String entityName, final String localName, final boolean useOnly) {
    try {
      final Function1<ASTUseStmtNode, Boolean> _function = (ASTUseStmtNode usn) -> {
        return Boolean.valueOf(ASTQuery.eic(usn.getName(), moduleName));
      };
      ASTUseStmtNode usn = IterableExtensions.<ASTUseStmtNode>findFirst(Iterables.<ASTUseStmtNode>filter(amn.getBody().getChildren(), ASTUseStmtNode.class), _function);
      boolean _notEquals = (!Objects.equal(usn, null));
      if (_notEquals) {
        return CodeConcept.ensureImport(usn, entityName, localName);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("use ");
        _builder.append(moduleName);
        {
          if (((!Objects.equal(localName, null)) && (!Objects.equal(entityName, null)))) {
            _builder.append(", ");
            {
              if (useOnly) {
                _builder.append("only: ");
              }
            }
            _builder.append(localName);
            _builder.append(" => ");
            _builder.append(entityName);
          }
        }
        final String code = _builder.toString();
        IBodyConstruct _parseLiteralStatement = CodeExtraction.<IBodyConstruct>parseLiteralStatement(code);
        usn = ((ASTUseStmtNode) _parseLiteralStatement);
        final ASTUseStmtNode last = amn.getBody().<ASTUseStmtNode>findLast(ASTUseStmtNode.class);
        boolean _notEquals_1 = (!Objects.equal(last, null));
        if (_notEquals_1) {
          IASTListNode<? extends IASTNode> _body = amn.getBody();
          ((IASTListNode<IBodyConstruct>) _body).insertAfter(last, usn);
        } else {
          final ISpecificationPartConstruct lastSpec = amn.getBody().<ISpecificationPartConstruct>findLast(ISpecificationPartConstruct.class);
          boolean _notEquals_2 = (!Objects.equal(lastSpec, null));
          if (_notEquals_2) {
            IASTListNode<? extends IASTNode> _body_1 = amn.getBody();
            ((IASTListNode<IBodyConstruct>) _body_1).insertAfter(lastSpec, usn);
          } else {
            throw new CodeGenerationException("Unable to insert use statement");
          }
        }
        return usn;
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Pure
  public List<CodeConcept.MarkerLoc> getParamMarkers() {
    return this.paramMarkers;
  }
}
