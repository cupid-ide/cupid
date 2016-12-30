package org.earthsystemmodeling.cupid.cc.mapping;

import com.google.common.base.Objects;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeVariableBinding;
import org.earthsystemmodeling.cupid.cc.mapping.UnboundVariableAccessException;
import org.earthsystemmodeling.cupid.cc.mapping.UnresolvedVariableAccessException;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class MappingTypeVariable<T extends Object> {
  @Accessors
  protected String name;
  
  @Accessors
  protected Class<T> type;
  
  protected MappingTypeVariableBinding<T> binding;
  
  public MappingTypeVariable(final String name, final Class<T> type) {
    this.name = name;
    this.type = type;
  }
  
  public boolean isBound() {
    return (!Objects.equal(this.binding, null));
  }
  
  public boolean isResolved() {
    return (this.isBound() && this.binding.isResolved());
  }
  
  public void bind(final MappingTypeVariableBinding<T> binding) {
    this.binding = binding;
    binding.setBoundTo(this);
  }
  
  public T resolve() throws UnboundVariableAccessException, UnresolvedVariableAccessException {
    T _xblockexpression = null;
    {
      boolean _isBound = this.isBound();
      boolean _not = (!_isBound);
      if (_not) {
        throw new UnboundVariableAccessException(this.name);
      }
      boolean _isResolved = this.isResolved();
      boolean _not_1 = (!_isResolved);
      if (_not_1) {
        throw new UnresolvedVariableAccessException(this.name);
      }
      _xblockexpression = this.binding.resolve();
    }
    return _xblockexpression;
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  @Pure
  public Class<T> getType() {
    return this.type;
  }
  
  public void setType(final Class<T> type) {
    this.type = type;
  }
}
