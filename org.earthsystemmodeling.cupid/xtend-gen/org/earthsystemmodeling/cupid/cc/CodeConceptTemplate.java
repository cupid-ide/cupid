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
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeParameterBinding;
import org.earthsystemmodeling.cupid.cc.mapping.TemplateParameterReference;
import org.earthsystemmodeling.cupid.cc.types.MTPType;
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
  
  public CodeConcept instantiate(final Map<String, MTPType<?>> parameterValues) {
    return this.instantiate(null, parameterValues);
  }
  
  public CodeConcept instantiate(final String name, final Map<String, MTPType<?>> parameterValues) {
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
        MappingType _mappingType = this.getBinding().getMappingType();
        final MappingTypeBinding binding = new MappingTypeBinding(_mappingType, concept);
        Set<Map.Entry<String, MappingTypeParameterBinding>> _entrySet = this.getBinding().getBindings().entrySet();
        for (final Map.Entry<String, MappingTypeParameterBinding> e : _entrySet) {
          MappingTypeParameterBinding _value = e.getValue();
          if ((_value instanceof TemplateParameterReference)) {
            MappingTypeParameterBinding _value_1 = e.getValue();
            final String refVar = ((TemplateParameterReference) _value_1).getReference().substring(1);
            boolean _containsKey = parameterValues.containsKey(refVar);
            if (_containsKey) {
              String _key = e.getKey();
              MTPType<?> _get = parameterValues.get(refVar);
              LiteralMTVBinding _literalMTVBinding = new LiteralMTVBinding(_get);
              binding.putBinding(_key, _literalMTVBinding);
            } else {
              String _key_1 = e.getKey();
              String _plus = ("Cannot instantiate template due to missing parameter value: " + _key_1);
              throw new CodeConceptException(_plus);
            }
          } else {
            binding.putBinding(e.getKey(), e.getValue().clone(binding));
          }
        }
        concept.setBinding(binding);
        final BiConsumer<String, Class<?>> _function = (String k, Class<?> v) -> {
          concept.addAnnotation(k, v);
        };
        this.getAnnotations().forEach(_function);
        final BiConsumer<String, MTPType<?>> _function_1 = (String k, MTPType<?> v) -> {
          concept.addAnnotationDefault(k, v);
        };
        this.getAnnotationDefaults().forEach(_function_1);
        List<CodeSubconcept> _subconcepts = this.getSubconcepts();
        for (final CodeSubconcept sc : _subconcepts) {
          {
            final SingleCodeSubconcept singleSubconcept = ((SingleCodeSubconcept) sc);
            CodeConcept _concept = singleSubconcept.getConcept();
            final CodeConcept instantiatedConcept = ((CodeConceptTemplate) _concept).instantiate(parameterValues);
            concept.addSubconcept(singleSubconcept.getName(), instantiatedConcept, sc.isEssential(), sc.getMin(), sc.getMax(), singleSubconcept.isIncludeByDefault());
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
  public MappingTypeParameterBinding getVariableBindingForParameter(final String paramName, final Object paramValue) {
    MappingTypeParameterBinding _xifexpression = null;
    boolean _isStaticReference = CodeConcept.isStaticReference(paramValue);
    if (_isStaticReference) {
      _xifexpression = new TemplateParameterReference(((String) paramValue));
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
