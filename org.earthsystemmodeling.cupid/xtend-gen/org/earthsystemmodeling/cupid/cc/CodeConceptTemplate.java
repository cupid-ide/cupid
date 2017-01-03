package org.earthsystemmodeling.cupid.cc;

import com.google.common.base.Objects;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptException;
import org.earthsystemmodeling.cupid.cc.mapping.LiteralMTVBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariable;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariableBinding;
import org.earthsystemmodeling.cupid.cc.mapping.TemplateParameterReference;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class CodeConceptTemplate extends CodeConcept {
  @Accessors
  private List<String> parameters;
  
  public CodeConceptTemplate(final String name, final List<String> parameters) {
    super(name);
    this.parameters = parameters;
  }
  
  public CodeConcept instantiate(final String name, final Map<String, Object> parameterValues) {
    try {
      CodeConcept _xblockexpression = null;
      {
        final CodeConcept concept = new CodeConcept(name);
        MappingType _mappingType = this.binding.getMappingType();
        final MappingTypeBinding binding = new MappingTypeBinding(_mappingType);
        Map<MappingTypeVariable<?>, MappingTypeVariableBinding<?>> _bindings = this.binding.getBindings();
        Set<Map.Entry<MappingTypeVariable<?>, MappingTypeVariableBinding<?>>> _entrySet = _bindings.entrySet();
        for (final Map.Entry<MappingTypeVariable<?>, MappingTypeVariableBinding<?>> e : _entrySet) {
          MappingTypeVariableBinding<?> _value = e.getValue();
          if ((_value instanceof TemplateParameterReference<?>)) {
            MappingTypeVariable<?> _key = e.getKey();
            String _name = _key.getName();
            boolean _containsKey = parameterValues.containsKey(_name);
            if (_containsKey) {
              MappingTypeVariable<?> _key_1 = e.getKey();
              MappingTypeVariable<?> _key_2 = e.getKey();
              Object _get = parameterValues.get(_key_2);
              LiteralMTVBinding<Object> _literalMTVBinding = new LiteralMTVBinding<Object>(_get);
              binding.put(_key_1, _literalMTVBinding);
            } else {
              MappingTypeVariable<?> _key_3 = e.getKey();
              String _name_1 = _key_3.getName();
              String _plus = ("Cannot instantiate template due to missing parameter value: " + _name_1);
              throw new CodeConceptException(_plus);
            }
          } else {
            MappingTypeVariable<?> _key_4 = e.getKey();
            MappingTypeVariableBinding<?> _value_1 = e.getValue();
            MappingTypeVariableBinding<?> _clone = _value_1.clone();
            binding.put(_key_4, _clone);
          }
        }
        concept.binding = binding;
        Set<Map.Entry<String, Object>> _entrySet_1 = parameterValues.entrySet();
        for (final Map.Entry<String, Object> e_1 : _entrySet_1) {
          String _key_5 = e_1.getKey();
          MappingTypeVariableBinding<Object> _get_1 = this.binding.<Object>get(_key_5);
          boolean _equals = Objects.equal(_get_1, null);
          if (_equals) {
            String _key_6 = e_1.getKey();
            String _plus_1 = ((("Code concept template " + name) + " does not have parameter: ") + _key_6);
            throw new CodeConceptException(_plus_1);
          }
        }
        _xblockexpression = concept;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Pure
  public List<String> getParameters() {
    return this.parameters;
  }
  
  public void setParameters(final List<String> parameters) {
    this.parameters = parameters;
  }
}
