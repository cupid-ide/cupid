package org.earthsystemmodeling.cupid.cc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.cc.CCIStatus;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptException;
import org.earthsystemmodeling.cupid.cc.SingleCodeSubconcept;
import org.earthsystemmodeling.cupid.cc.mapping.IllegalVariableAssignment;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.earthsystemmodeling.cupid.cc.types.MTPType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class CodeConceptInstance {
  @Accessors
  private CodeConcept type;
  
  @Accessors
  private CodeConceptInstance parent;
  
  @Accessors
  private CCIStatus status;
  
  @Accessors
  private MTPType<?> match;
  
  @Accessors
  private Map<String, MTPType<?>> annotations = CollectionLiterals.<String, MTPType<?>>newLinkedHashMap();
  
  private List<CodeConceptInstance> children = CollectionLiterals.<CodeConceptInstance>newLinkedList();
  
  protected CodeConceptInstance(final CodeConcept type, final CodeConceptInstance parent) {
    this(type, parent, null);
  }
  
  protected CodeConceptInstance(final CodeConcept type, final CodeConceptInstance parent, final Object match) {
    this.type = type;
    this.parent = parent;
    this.setMatch(match);
    boolean _notEquals = (!Objects.equal(parent, null));
    if (_notEquals) {
      parent.addChild(this);
    }
  }
  
  public void setStatus(final CCIStatus status, final boolean recursive) {
    this.status = status;
    if (recursive) {
      final Consumer<CodeConceptInstance> _function = (CodeConceptInstance c) -> {
        c.setStatus(status, recursive);
      };
      this.children.forEach(_function);
    }
  }
  
  public Object setMatch(final Object match) {
    try {
      Object _xblockexpression = null;
      {
        boolean _notEquals = (!Objects.equal(match, null));
        if (_notEquals) {
          MappingType _mappingType = null;
          if (this.type!=null) {
            _mappingType=this.type.getMappingType();
          }
          boolean _notEquals_1 = (!Objects.equal(_mappingType, null));
          if (_notEquals_1) {
            boolean _isInstance = this.type.getMappingType().matchType().isInstance(match);
            boolean _not = (!_isInstance);
            if (_not) {
              String _name = this.type.getName();
              String _plus = ("Match for concept " + _name);
              String _plus_1 = (_plus + " must be of type ");
              String _simpleName = this.type.getMappingType().matchType().getSimpleName();
              String _plus_2 = (_plus_1 + _simpleName);
              String _plus_3 = (_plus_2 + " (given type ");
              String _simpleName_1 = match.getClass().getSimpleName();
              String _plus_4 = (_plus_3 + _simpleName_1);
              String _plus_5 = (_plus_4 + ").");
              throw new CodeConceptException(_plus_5);
            }
          }
        }
        _xblockexpression = this.setMatch(match);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public <T extends MTPType<?>> T nearestAncestorWithMatch(final Class<T> typeToFind) {
    T _xblockexpression = null;
    {
      MappingType _mappingType = this.type.getMappingType();
      Class<?> _matchType = null;
      if (_mappingType!=null) {
        _matchType=_mappingType.matchType();
      }
      boolean _equals = Objects.equal(_matchType, typeToFind);
      if (_equals) {
        boolean _notEquals = (!Objects.equal(this.match, null));
        if (_notEquals) {
          return ((T) this.match);
        }
      }
      T _xifexpression = null;
      boolean _notEquals_1 = (!Objects.equal(this.parent, null));
      if (_notEquals_1) {
        _xifexpression = this.parent.<T>nearestAncestorWithMatch(typeToFind);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public CodeConceptInstance addChild(final CodeConceptInstance child) {
    return this.addChild(child, CCIStatus.RECONCILED);
  }
  
  public CodeConceptInstance addChild(final CodeConceptInstance child, final CCIStatus status) {
    try {
      CodeConceptInstance _xblockexpression = null;
      {
        final Function1<SingleCodeSubconcept, Boolean> _function = (SingleCodeSubconcept s) -> {
          CodeConcept _concept = s.getConcept();
          return Boolean.valueOf(Objects.equal(_concept, child.type));
        };
        final SingleCodeSubconcept subconcept = IterableExtensions.<SingleCodeSubconcept>findFirst(Iterables.<SingleCodeSubconcept>filter(this.type.getSubconcepts(), SingleCodeSubconcept.class), _function);
        boolean _equals = Objects.equal(subconcept, null);
        if (_equals) {
          throw new CodeConceptException(((("Code concept " + this.type.name) + " does not contain subconcept ") + child.type.name));
        }
        child.setStatus(status, true);
        boolean _contains = this.children.contains(child);
        boolean _not = (!_contains);
        if (_not) {
          this.children.add(child);
        }
        _xblockexpression = child;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CodeConceptInstance addChildWithDefaults(final CodeConcept type, final boolean recursive) {
    CodeConceptInstance _xblockexpression = null;
    {
      final CodeConceptInstance instance = type.newInstanceWithDefaults(this, recursive);
      _xblockexpression = this.addChild(instance, CCIStatus.ADDED);
    }
    return _xblockexpression;
  }
  
  public boolean removeChild(final CodeConceptInstance child) {
    try {
      boolean _xblockexpression = false;
      {
        boolean _contains = this.children.contains(child);
        boolean _not = (!_contains);
        if (_not) {
          throw new CodeConceptException(("Attempt to remove child not in list: " + child));
        }
        _xblockexpression = this.children.remove(child);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public List<CodeConceptInstance> getChildren() {
    return this.children;
  }
  
  public Iterable<CodeConceptInstance> getChildren(final CodeConcept ofType) {
    final Function1<CodeConceptInstance, Boolean> _function = (CodeConceptInstance c) -> {
      return Boolean.valueOf(Objects.equal(c.type, ofType));
    };
    return IterableExtensions.<CodeConceptInstance>filter(this.children, _function);
  }
  
  public CodeConceptInstance getChild(final String conceptName) {
    final Function1<CodeConceptInstance, Boolean> _function = (CodeConceptInstance c) -> {
      return Boolean.valueOf(Objects.equal(c.type.name, conceptName));
    };
    return IterableExtensions.<CodeConceptInstance>findFirst(this.children, _function);
  }
  
  public MTPType<?> put(final String annotationKey, final MTPType<?> annotationValue) {
    try {
      MTPType<?> _xblockexpression = null;
      {
        boolean _hasAnnotation = this.type.hasAnnotation(annotationKey);
        boolean _not = (!_hasAnnotation);
        if (_not) {
          throw new CodeConceptException(((("Concept " + this.type.name) + " does not have annotation named ") + annotationKey));
        } else {
          if (((!Objects.equal(annotationValue, null)) && (!this.type.getAnnotationType(annotationKey).isInstance(annotationValue)))) {
            Class<?> _annotationType = this.type.getAnnotationType(annotationKey);
            Class<? extends MTPType> _class = annotationValue.getClass();
            throw new IllegalVariableAssignment(annotationKey, _annotationType, _class);
          }
        }
        _xblockexpression = this.annotations.put(annotationKey, annotationValue);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public MTPType<?> get(final String annotationKey) {
    try {
      MTPType<?> _xblockexpression = null;
      {
        boolean _hasAnnotation = this.type.hasAnnotation(annotationKey);
        boolean _not = (!_hasAnnotation);
        if (_not) {
          throw new CodeConceptException(((("Concept " + this.type.name) + " does not have annotation named ") + annotationKey));
        }
        _xblockexpression = this.annotations.get(annotationKey);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public MTPType<?> getAnnotationRecursive(final String annotationKey) {
    try {
      MTPType<?> _xifexpression = null;
      boolean _containsKey = this.annotations.containsKey(annotationKey);
      if (_containsKey) {
        _xifexpression = this.annotations.get(annotationKey);
      } else {
        MTPType<?> _xifexpression_1 = null;
        boolean _notEquals = (!Objects.equal(this.parent, null));
        if (_notEquals) {
          _xifexpression_1 = this.parent.getAnnotationRecursive(annotationKey);
        } else {
          throw new CodeConceptException(("No annotation in instance tree named " + annotationKey));
        }
        _xifexpression = _xifexpression_1;
      }
      return _xifexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CodeConceptInstance of: ");
    String _name = this.type.getName();
    _builder.append(_name);
    _builder.append("  (Status = ");
    _builder.append(this.status);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Annotations: ");
    {
      Set<Map.Entry<String, MTPType<?>>> _entrySet = this.getAnnotations().entrySet();
      for(final Map.Entry<String, MTPType<?>> a : _entrySet) {
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("- ");
        String _key = a.getKey();
        _builder.append(_key, "    ");
        _builder.append(" = ");
        MTPType<?> _value = a.getValue();
        _builder.append(_value, "    ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("Children: ");
    {
      for(final CodeConceptInstance c : this.children) {
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("- ");
        String _string = c.toString();
        _builder.append(_string, "    ");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  @Pure
  public CodeConcept getType() {
    return this.type;
  }
  
  public void setType(final CodeConcept type) {
    this.type = type;
  }
  
  @Pure
  public CodeConceptInstance getParent() {
    return this.parent;
  }
  
  public void setParent(final CodeConceptInstance parent) {
    this.parent = parent;
  }
  
  @Pure
  public CCIStatus getStatus() {
    return this.status;
  }
  
  public void setStatus(final CCIStatus status) {
    this.status = status;
  }
  
  @Pure
  public MTPType<?> getMatch() {
    return this.match;
  }
  
  public void setMatch(final MTPType<?> match) {
    this.match = match;
  }
  
  @Pure
  public Map<String, MTPType<?>> getAnnotations() {
    return this.annotations;
  }
  
  public void setAnnotations(final Map<String, MTPType<?>> annotations) {
    this.annotations = annotations;
  }
}
