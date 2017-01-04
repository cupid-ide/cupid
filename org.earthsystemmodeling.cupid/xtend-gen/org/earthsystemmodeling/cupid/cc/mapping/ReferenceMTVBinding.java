package org.earthsystemmodeling.cupid.cc.mapping;

import com.google.common.base.Objects;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariable;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariableBinding;
import org.earthsystemmodeling.cupid.cc.mapping.UnresolvedVariableAccessException;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class ReferenceMTVBinding<T extends Object> extends MappingTypeVariableBinding<T> {
  protected T value;
  
  @Accessors
  private String reference;
  
  public ReferenceMTVBinding(final MappingTypeBinding binding, final String reference) {
    this.setBinding(binding);
    this.reference = reference;
  }
  
  @Override
  public boolean isResolved() {
    return (!Objects.equal(this.value, null));
  }
  
  @Override
  public T getValue() {
    try {
      T _xblockexpression = null;
      {
        boolean _equals = Objects.equal(this.value, null);
        if (_equals) {
          MappingTypeVariable<T> _boundTo = this.getBoundTo();
          throw new UnresolvedVariableAccessException(_boundTo.name);
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
