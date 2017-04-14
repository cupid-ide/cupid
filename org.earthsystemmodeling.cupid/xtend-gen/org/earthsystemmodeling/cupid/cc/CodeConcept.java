package org.earthsystemmodeling.cupid.cc;

import com.google.common.base.Objects;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.cc.CodeConceptException;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.CodeSubconcept;
import org.earthsystemmodeling.cupid.cc.SingleCodeSubconcept;
import org.earthsystemmodeling.cupid.cc.mapping.CodeConceptInstanceReference;
import org.earthsystemmodeling.cupid.cc.mapping.LiteralMTVBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeParameter;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeParameterBinding;
import org.earthsystemmodeling.cupid.cc.types.MTPType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class CodeConcept {
  @Accessors
  protected String name = null;
  
  @Accessors
  protected CodeConcept extends_ = null;
  
  protected List<CodeSubconcept> subconcepts = CollectionLiterals.<CodeSubconcept>newLinkedList();
  
  private MappingTypeBinding binding;
  
  private Map<String, Class<?>> annotations = CollectionLiterals.<String, Class<?>>newLinkedHashMap();
  
  private Map<String, MTPType<?>> annotationDefaults = CollectionLiterals.<String, MTPType<?>>newLinkedHashMap();
  
  public CodeConcept(final String name) {
    this(name, null);
  }
  
  public CodeConcept(final String name, final MappingType mappingType) {
    this(name, mappingType, null);
  }
  
  public CodeConcept(final String name, final MappingType mappingType, final Map<String, Object> parameters) {
    this.name = name;
    boolean _notEquals = (!Objects.equal(mappingType, null));
    if (_notEquals) {
      this.setMappingType(mappingType, parameters);
    }
  }
  
  public CodeConcept extend(final String name) {
    CodeConcept _xblockexpression = null;
    {
      final CodeConcept concept = new CodeConcept(name);
      concept.extends_ = this;
      MappingTypeBinding _mappingTypeBinding = new MappingTypeBinding(this.binding, concept);
      concept.binding = _mappingTypeBinding;
      _xblockexpression = concept;
    }
    return _xblockexpression;
  }
  
  public void addAnnotation(final String name, final Class<?> type) {
    try {
      if ((this.annotations.containsKey(name) && (!Objects.equal(this.annotations.get(name), type)))) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Cannot add annotation \"");
        _builder.append(name);
        _builder.append("\" of type ");
        String _simpleName = type.getSimpleName();
        _builder.append(_simpleName);
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("    \t\t\t");
        _builder.append("to concept ");
        String _name = this.getName();
        _builder.append(_name, "    \t\t\t");
        _builder.append(" because it already has the same annotation with a ");
        _builder.newLineIfNotEmpty();
        _builder.append("    \t\t\t");
        _builder.append("different type: ");
        Class<?> _get = this.annotations.get(name);
        _builder.append(_get, "    \t\t\t");
        throw new CodeConceptException(_builder.toString());
      }
      this.annotations.put(name, type);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void addAnnotations(final String... name) {
    final Consumer<String> _function = (String n) -> {
      this.addAnnotation(n, String.class);
    };
    ((List<String>)Conversions.doWrapArray(name)).forEach(_function);
  }
  
  public void addAnnotations(final List<String> names) {
    final Consumer<String> _function = (String n) -> {
      this.addAnnotations(n);
    };
    names.forEach(_function);
  }
  
  public void addAnnotationDefault(final String name, final MTPType<?> value) {
    try {
      Class<?> _annotationType = this.getAnnotationType(name);
      boolean _isInstance = false;
      if (_annotationType!=null) {
        _isInstance=_annotationType.isInstance(value);
      }
      if (_isInstance) {
        this.annotationDefaults.put(name, value);
      } else {
        Class<?> _annotationType_1 = this.getAnnotationType(name);
        boolean _notEquals = (!Objects.equal(_annotationType_1, null));
        if (_notEquals) {
          throw new CodeConceptException("Type mismatch adding annotation default");
        } else {
          throw new CodeConceptException(("Cannot add default for undeclared annotation: " + name));
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void addAnnotationDefaults(final Map<String, MTPType<?>> defaults) {
    this.annotationDefaults.putAll(defaults);
  }
  
  public void addAnnotationsWithDefaults(final Map<String, MTPType<?>> defaults) {
    final BiConsumer<String, MTPType<?>> _function = (String k, MTPType<?> v) -> {
      this.addAnnotations(k);
      this.addAnnotationDefault(k, v);
    };
    defaults.forEach(_function);
  }
  
  public Map<String, Class<?>> getAnnotations() {
    LinkedHashMap<String, Class<?>> _xblockexpression = null;
    {
      final LinkedHashMap<String, Class<?>> retMap = CollectionLiterals.<String, Class<?>>newLinkedHashMap();
      boolean _notEquals = (!Objects.equal(this.extends_, null));
      if (_notEquals) {
        retMap.putAll(this.extends_.getAnnotations());
      }
      retMap.putAll(this.annotations);
      _xblockexpression = retMap;
    }
    return _xblockexpression;
  }
  
  public boolean hasAnnotation(final String name) {
    return (this.annotations.containsKey(name) || ((!Objects.equal(this.extends_, null)) && this.extends_.hasAnnotation(name)));
  }
  
  public Class<?> getAnnotationType(final String name) {
    Class<?> _xifexpression = null;
    boolean _containsKey = this.annotations.containsKey(name);
    if (_containsKey) {
      _xifexpression = this.annotations.get(name);
    } else {
      Class<?> _xifexpression_1 = null;
      boolean _notEquals = (!Objects.equal(this.extends_, null));
      if (_notEquals) {
        _xifexpression_1 = this.extends_.getAnnotationType(name);
      } else {
        _xifexpression_1 = null;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public Map<String, MTPType<?>> getAnnotationDefaults() {
    LinkedHashMap<String, MTPType<?>> _xblockexpression = null;
    {
      final LinkedHashMap<String, MTPType<?>> retMap = CollectionLiterals.<String, MTPType<?>>newLinkedHashMap();
      boolean _notEquals = (!Objects.equal(this.extends_, null));
      if (_notEquals) {
        retMap.putAll(this.extends_.getAnnotationDefaults());
      }
      retMap.putAll(this.annotationDefaults);
      _xblockexpression = retMap;
    }
    return _xblockexpression;
  }
  
  public Object getAnnotationDefault(final String name) {
    Object _xifexpression = null;
    boolean _containsKey = this.annotationDefaults.containsKey(name);
    if (_containsKey) {
      _xifexpression = this.annotationDefaults.get(name);
    } else {
      Object _xifexpression_1 = null;
      boolean _notEquals = (!Objects.equal(this.extends_, null));
      if (_notEquals) {
        _xifexpression_1 = this.extends_.getAnnotationDefault(name);
      } else {
        _xifexpression_1 = null;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public void setMappingType(final MappingType mappingType) {
    this.setMappingType(mappingType, null);
  }
  
  public void setMappingType(final MappingType mappingType, final Map<String, Object> parameters) {
    try {
      boolean _notEquals = (!Objects.equal(this.extends_, null));
      if (_notEquals) {
        throw new CodeConceptException("Cannot set mapping type for concept extension");
      }
      MappingTypeBinding _mappingTypeBinding = new MappingTypeBinding(mappingType, this);
      this.binding = _mappingTypeBinding;
      boolean _notEquals_1 = (!Objects.equal(parameters, null));
      if (_notEquals_1) {
        Set<Map.Entry<String, Object>> _entrySet = parameters.entrySet();
        for (final Map.Entry<String, Object> p : _entrySet) {
          this.binding.putBinding(p.getKey(), this.getVariableBindingForParameter(p.getKey(), p.getValue()));
        }
      }
      if ((mappingType.hasParameter("context") && this.binding.unbound("context"))) {
        final MappingTypeParameter mtv = mappingType.getParameter("context");
        CodeConceptInstanceReference _codeConceptInstanceReference = new CodeConceptInstanceReference(mtv, null);
        this.binding.putBinding("context", _codeConceptInstanceReference);
      }
      if ((mappingType.hasParameter("match") && this.binding.unbound("match"))) {
        final MappingTypeParameter mtv_1 = mappingType.getParameter("match");
        CodeConceptInstanceReference _codeConceptInstanceReference_1 = new CodeConceptInstanceReference(mtv_1, null);
        this.binding.putBinding("match", _codeConceptInstanceReference_1);
      }
      final Consumer<MappingTypeParameter> _function = (MappingTypeParameter v) -> {
        this.addAnnotation(v.getName(), v.getType());
        String _name = v.getName();
        String _plus = ("@" + _name);
        CodeConceptInstanceReference _codeConceptInstanceReference_2 = new CodeConceptInstanceReference(v, _plus);
        this.binding.putBinding(v.getName(), _codeConceptInstanceReference_2);
      };
      this.binding.unbound().forEach(_function);
      boolean _fullyBound = this.binding.fullyBound();
      boolean _not = (!_fullyBound);
      if (_not) {
        String _name = mappingType.getName();
        String _plus = ("Missing parameters to mapping type " + _name);
        String _plus_1 = (_plus + ": ");
        String _join = IterableExtensions.join(this.binding.unbound(), ", ");
        String _plus_2 = (_plus_1 + _join);
        throw new CodeConceptException(_plus_2);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected MappingTypeParameterBinding getVariableBindingForParameter(final String paramName, final Object paramValue) {
    MappingTypeParameterBinding _xifexpression = null;
    boolean _isDynamicReference = CodeConcept.isDynamicReference(paramValue);
    if (_isDynamicReference) {
      CodeConceptInstanceReference _xblockexpression = null;
      {
        final MappingTypeParameter mtv = this.getMappingType().getParameter(paramName);
        _xblockexpression = new CodeConceptInstanceReference(mtv, ((String) paramValue));
      }
      _xifexpression = _xblockexpression;
    } else {
      _xifexpression = new LiteralMTVBinding(((MTPType<?>) paramValue));
    }
    return _xifexpression;
  }
  
  public MappingTypeBinding getBinding() {
    return this.binding;
  }
  
  protected void setBinding(final MappingTypeBinding binding) {
    this.binding = binding;
  }
  
  public MappingType getMappingType() {
    MappingTypeBinding _binding = this.getBinding();
    MappingType _mappingType = null;
    if (_binding!=null) {
      _mappingType=_binding.getMappingType();
    }
    return _mappingType;
  }
  
  public CodeConceptInstance newInstance(final CodeConceptInstance parent) {
    return this.newInstance(parent, null);
  }
  
  public CodeConceptInstance newInstance(final CodeConceptInstance parent, final Object match) {
    return new CodeConceptInstance(this, parent, match);
  }
  
  public CodeConceptInstance newInstanceWithDefaults(final CodeConceptInstance parent, final boolean recursive) {
    CodeConceptInstance _xblockexpression = null;
    {
      final CodeConceptInstance instance = this.newInstance(parent);
      final BiConsumer<String, MTPType<?>> _function = (String k, MTPType<?> v) -> {
        instance.put(k, v);
      };
      this.getAnnotationDefaults().forEach(_function);
      if (recursive) {
        final Consumer<CodeSubconcept> _function_1 = (CodeSubconcept sc) -> {
          final SingleCodeSubconcept ssc = ((SingleCodeSubconcept) sc);
          boolean _isIncludeByDefault = ssc.isIncludeByDefault();
          if (_isIncludeByDefault) {
            ssc.getConcept().newInstanceWithDefaults(instance, recursive);
          }
        };
        this.getSubconcepts().forEach(_function_1);
      }
      _xblockexpression = instance;
    }
    return _xblockexpression;
  }
  
  public List<CodeSubconcept> getSubconcepts() {
    List<CodeSubconcept> _xifexpression = null;
    boolean _equals = Objects.equal(this.extends_, null);
    if (_equals) {
      _xifexpression = this.subconcepts;
    } else {
      LinkedList<CodeSubconcept> _xblockexpression = null;
      {
        final LinkedList<CodeSubconcept> toRet = CollectionLiterals.<CodeSubconcept>newLinkedList();
        toRet.addAll(this.extends_.getSubconcepts());
        toRet.addAll(this.subconcepts);
        _xblockexpression = toRet;
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public CodeSubconcept getSubconcept(final String name) {
    final Function1<CodeSubconcept, Boolean> _function = (CodeSubconcept sc) -> {
      return Boolean.valueOf(sc.getName().equals(name));
    };
    return IterableExtensions.<CodeSubconcept>findFirst(this.getSubconcepts(), _function);
  }
  
  public CodeConcept getChildConcept(final String name) {
    CodeSubconcept _subconcept = this.getSubconcept(name);
    return ((SingleCodeSubconcept) _subconcept).getConcept();
  }
  
  public void addSubconcept(final String name, final CodeConcept type, final boolean essential, final int min, final int max, final boolean includeByDefault) {
    SingleCodeSubconcept _singleCodeSubconcept = new SingleCodeSubconcept(this, type, essential, min, max, includeByDefault);
    this.subconcepts.add(_singleCodeSubconcept);
  }
  
  public CodeConcept addSubconcept(final String name, final MappingType mappingType) {
    return this.addSubconcept(name, mappingType, false, null);
  }
  
  public CodeConcept addSubconcept(final String name, final MappingType mappingType, final Map<String, Object> parameters) {
    return this.addSubconcept(name, mappingType, false, parameters);
  }
  
  public CodeConcept addSubconcept(final String name, final MappingType mappingType, final boolean essential, final Map<String, Object> parameters) {
    return this.addSubconcept(name, mappingType, essential, 1, 1, parameters, essential);
  }
  
  public CodeConcept addSubconcept(final String name, final MappingType mappingType, final boolean essential, final int min, final int max, final Map<String, Object> parameters, final boolean includeByDefault) {
    CodeConcept _xblockexpression = null;
    {
      final CodeConcept concept = new CodeConcept(name, mappingType, parameters);
      this.addSubconcept(name, concept, essential, min, max, includeByDefault);
      _xblockexpression = concept;
    }
    return _xblockexpression;
  }
  
  public void addSubconcepts(final List<Object> toAdd) {
    try {
      int _size = toAdd.size();
      boolean _greaterEqualsThan = (_size >= 1);
      if (_greaterEqualsThan) {
        Object _get = toAdd.get(0);
        if ((_get instanceof List)) {
          final Consumer<Object> _function = (Object s) -> {
            this.addSubconcepts(((List<Object>) s));
          };
          toAdd.forEach(_function);
        } else {
          if (((toAdd.size() >= 2) && (toAdd.size() <= 5))) {
            Object _get_1 = toAdd.get(0);
            if ((_get_1 instanceof CodeConcept)) {
              Object _get_2 = toAdd.get(0);
              final CodeConcept concept = ((CodeConcept) _get_2);
              Object _get_3 = toAdd.get(1);
              final Integer min = ((Integer) _get_3);
              Object _get_4 = toAdd.get(2);
              final Integer max = ((Integer) _get_4);
              List<Object> _xifexpression = null;
              int _size_1 = toAdd.size();
              boolean _equals = (_size_1 == 4);
              if (_equals) {
                Object _get_5 = toAdd.get(3);
                _xifexpression = ((List<Object>) _get_5);
              } else {
                _xifexpression = null;
              }
              final List<Object> subList = _xifexpression;
              this.addSubconcept(concept.name, concept, false, (min).intValue(), (max).intValue(), false);
              boolean _notEquals = (!Objects.equal(subList, null));
              if (_notEquals) {
                concept.addSubconcepts(subList);
              }
            } else {
              Object _get_6 = toAdd.get(0);
              final String name = ((String) _get_6);
              Object _get_7 = toAdd.get(1);
              final MappingType mappingType = ((MappingType) _get_7);
              Map<String, Object> _xifexpression_1 = null;
              int _size_2 = toAdd.size();
              boolean _greaterEqualsThan_1 = (_size_2 >= 3);
              if (_greaterEqualsThan_1) {
                Object _get_8 = toAdd.get(2);
                _xifexpression_1 = ((Map<String, Object>) _get_8);
              } else {
                _xifexpression_1 = null;
              }
              final Map<String, Object> params = _xifexpression_1;
              List<Object> _xifexpression_2 = null;
              int _size_3 = toAdd.size();
              boolean _equals_1 = (_size_3 == 4);
              if (_equals_1) {
                Object _get_9 = toAdd.get(3);
                _xifexpression_2 = ((List<Object>) _get_9);
              } else {
                _xifexpression_2 = null;
              }
              final List<Object> subList_1 = _xifexpression_2;
              Integer _xifexpression_3 = null;
              int _size_4 = toAdd.size();
              boolean _equals_2 = (_size_4 == 5);
              if (_equals_2) {
                Object _get_10 = toAdd.get(3);
                _xifexpression_3 = ((Integer) _get_10);
              } else {
                _xifexpression_3 = Integer.valueOf(1);
              }
              final Integer min_1 = _xifexpression_3;
              Integer _xifexpression_4 = null;
              int _size_5 = toAdd.size();
              boolean _equals_3 = (_size_5 == 5);
              if (_equals_3) {
                Object _get_11 = toAdd.get(4);
                _xifexpression_4 = ((Integer) _get_11);
              } else {
                _xifexpression_4 = Integer.valueOf(1);
              }
              final Integer max_1 = _xifexpression_4;
              final CodeConcept subconcept = this.addSubconcept(name, mappingType, false, (min_1).intValue(), (max_1).intValue(), params, false);
              boolean _notEquals_1 = (!Objects.equal(subList_1, null));
              if (_notEquals_1) {
                subconcept.addSubconcepts(subList_1);
              }
            }
          } else {
            throw new CodeConceptException("Subconcept parameter list must be size 2 to 5.");
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void addSubconcepts(final List<Object>... toAdd) {
    this.addSubconcepts(CollectionLiterals.<Object>newLinkedList(toAdd));
  }
  
  public static boolean isStaticReference(final Object obj) {
    return ((obj instanceof String) && ((String) obj).startsWith("$"));
  }
  
  public static boolean isDynamicReference(final Object obj) {
    return ((obj instanceof String) && (((String) obj).startsWith("../") || ((String) obj).startsWith("@")));
  }
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CodeConcept: ");
    String _name = this.getName();
    _builder.append(_name);
    {
      boolean _notEquals = (!Objects.equal(this.extends_, null));
      if (_notEquals) {
        _builder.append(" refines ");
        String _name_1 = this.extends_.getName();
        _builder.append(_name_1);
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("Subconcepts: ");
    {
      List<CodeSubconcept> _subconcepts = this.getSubconcepts();
      for(final CodeSubconcept s : _subconcepts) {
        _builder.newLineIfNotEmpty();
        _builder.append("- ");
        _builder.append(s);
      }
    }
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  @Pure
  public CodeConcept getExtends_() {
    return this.extends_;
  }
  
  public void setExtends_(final CodeConcept extends_) {
    this.extends_ = extends_;
  }
}
