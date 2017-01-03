package org.earthsystemmodeling.cupid.cc.mapping;

import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariableBinding;
import org.earthsystemmodeling.cupid.cc.mapping.ReferenceMTVBinding;

@SuppressWarnings("all")
public class TemplateParameterReference<T extends Object> extends ReferenceMTVBinding<T> {
  public TemplateParameterReference(final String reference) {
    super(reference);
  }
  
  public Object resolve(final CodeConcept concept) {
    return null;
  }
  
  @Override
  public MappingTypeVariableBinding<T> clone() {
    throw new UnsupportedOperationException();
  }
}
