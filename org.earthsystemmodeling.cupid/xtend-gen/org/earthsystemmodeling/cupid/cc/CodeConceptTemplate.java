package org.earthsystemmodeling.cupid.cc;

import com.google.common.base.Objects;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptException;
import org.earthsystemmodeling.cupid.cc.CodeSubconcept;
import org.earthsystemmodeling.cupid.cc.SingleCodeSubconcept;
import org.earthsystemmodeling.cupid.cc.mapping.LiteralMTVBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariable;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariableBinding;
import org.earthsystemmodeling.cupid.cc.mapping.TemplateParameterReference;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class CodeConceptTemplate extends CodeConcept {
  @Accessors
  private List<String> parameters;
  
  public CodeConceptTemplate(final String name, final List<String> parameters) {
    super(name);
    this.parameters = parameters;
  }
  
  public CodeConceptTemplate(final String name, final MappingType mappingType, final Map<String, Object> mappingTypeParameters) {
    super(name, mappingType, mappingTypeParameters);
  }
  
  public CodeConcept instantiate(final Map<String, Object> parameterValues) {
    return this.instantiate(null, parameterValues);
  }
  
  public CodeConcept instantiate(final String name, final Map<String, Object> parameterValues) {
    try {
      CodeConcept _xblockexpression = null;
      {
        String _xifexpression = null;
        boolean _equals = Objects.equal(name, null);
        if (_equals) {
          _xifexpression = this.name;
        } else {
          _xifexpression = name;
        }
        final CodeConcept concept = new CodeConcept(new Function0<String>() {
          public String apply() {
            String _xifexpression = null;
            boolean _equals = Objects.equal(name, null);
            if (_equals) {
              _xifexpression = CodeConceptTemplate.this.name;
            } else {
              _xifexpression = name;
            }
            return _xifexpression;
          }
        }.apply());
        MappingTypeBinding _binding = this.getBinding();
        MappingType _mappingType = _binding.getMappingType();
        final MappingTypeBinding binding = new MappingTypeBinding(_mappingType, concept);
        MappingTypeBinding _binding_1 = this.getBinding();
        Map<MappingTypeVariable<?>, MappingTypeVariableBinding<?>> _bindings = _binding_1.getBindings();
        Set<Map.Entry<MappingTypeVariable<?>, MappingTypeVariableBinding<?>>> _entrySet = _bindings.entrySet();
        for (final Map.Entry<MappingTypeVariable<?>, MappingTypeVariableBinding<?>> e : _entrySet) {
          MappingTypeVariableBinding<?> _value = e.getValue();
          if ((_value instanceof TemplateParameterReference<?>)) {
            MappingTypeVariableBinding<?> _value_1 = e.getValue();
            String _reference = ((TemplateParameterReference<?>) _value_1).getReference();
            final String refVar = _reference.substring(1);
            boolean _containsKey = parameterValues.containsKey(refVar);
            if (_containsKey) {
              MappingTypeVariable<?> _key = e.getKey();
              Object _get = parameterValues.get(refVar);
              LiteralMTVBinding<Object> _literalMTVBinding = new LiteralMTVBinding<Object>(_get);
              binding.putBinding(_key, _literalMTVBinding);
            } else {
              MappingTypeVariable<?> _key_1 = e.getKey();
              String _name = _key_1.getName();
              String _plus = ("Cannot instantiate template due to missing parameter value: " + _name);
              throw new CodeConceptException(_plus);
            }
          } else {
            MappingTypeVariable<?> _key_2 = e.getKey();
            MappingTypeVariableBinding<?> _value_2 = e.getValue();
            MappingTypeVariableBinding<?> _clone = _value_2.clone(binding);
            binding.putBinding(_key_2, _clone);
          }
        }
        concept.setBinding(binding);
        Map<String, Class<?>> _annotations = this.getAnnotations();
        final BiConsumer<String, Class<?>> _function = (String k, Class<?> v) -> {
          concept.addAnnotation(k, v);
        };
        _annotations.forEach(_function);
        Map<String, Object> _annotationDefaults = this.getAnnotationDefaults();
        final BiConsumer<String, Object> _function_1 = (String k, Object v) -> {
          concept.addAnnotationDefault(k, v);
        };
        _annotationDefaults.forEach(_function_1);
        List<CodeSubconcept> _subconcepts = this.getSubconcepts();
        for (final CodeSubconcept sc : _subconcepts) {
          {
            final SingleCodeSubconcept singleSubconcept = ((SingleCodeSubconcept) sc);
            CodeConcept _concept = singleSubconcept.getConcept();
            final CodeConcept instantiatedConcept = ((CodeConceptTemplate) _concept).instantiate(parameterValues);
            String _name_1 = singleSubconcept.getName();
            boolean _isEssential = sc.isEssential();
            int _min = sc.getMin();
            int _max = sc.getMax();
            boolean _isIncludeByDefault = singleSubconcept.isIncludeByDefault();
            concept.addSubconcept(_name_1, instantiatedConcept, _isEssential, _min, _max, _isIncludeByDefault);
          }
        }
        _xblockexpression = concept;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public MappingTypeVariableBinding<?> getVariableBindingForParameter(final String paramName, final Object paramValue) {
    MappingTypeVariableBinding<?> _xifexpression = null;
    boolean _isStaticReference = CodeConcept.isStaticReference(paramValue);
    if (_isStaticReference) {
      _xifexpression = new TemplateParameterReference<Object>(((String) paramValue));
    } else {
      _xifexpression = super.getVariableBindingForParameter(paramName, paramValue);
    }
    return _xifexpression;
  }
  
  @Override
  public CodeConcept addSubconcept(final String name, final MappingType mappingType, final boolean essential, final int min, final int max, final Map<String, Object> parameters, final boolean includeByDefault) {
    CodeConceptTemplate _xblockexpression = null;
    {
      final CodeConceptTemplate concept = new CodeConceptTemplate(name, mappingType, parameters);
      this.addSubconcept(name, concept, essential, min, max, includeByDefault);
      _xblockexpression = concept;
    }
    return _xblockexpression;
  }
  
  @Pure
  public List<String> getParameters() {
    return this.parameters;
  }
  
  public void setParameters(final List<String> parameters) {
    this.parameters = parameters;
  }
}
