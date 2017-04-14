package org.earthsystemmodeling.cupid.cc.mapping;

import com.google.common.base.Objects;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeParameterBinding;
import org.earthsystemmodeling.cupid.cc.mapping.UnresolvedVariableAccessException;
import org.earthsystemmodeling.cupid.cc.types.MTPType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class ReferenceMTVBinding extends MappingTypeParameterBinding {
  protected MTPType<?> value;
  
  @Accessors
  private String reference;
  
  public ReferenceMTVBinding(final MappingTypeBinding binding, final String reference) {
    this.setBinding(binding);
    String _trim = null;
    if (reference!=null) {
      _trim=reference.trim();
    }
    this.reference = _trim;
  }
  
  @Override
  public MTPType<?> getValue() {
    try {
      MTPType<?> _xblockexpression = null;
      {
        boolean _equals = Objects.equal(this.value, null);
        if (_equals) {
          String _name = this.getBoundTo().getName();
          throw new UnresolvedVariableAccessException(_name);
        }
        _xblockexpression = this.value;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Pure
  public String getReference() {
    return this.reference;
  }
  
  public void setReference(final String reference) {
    this.reference = reference;
  }
}
