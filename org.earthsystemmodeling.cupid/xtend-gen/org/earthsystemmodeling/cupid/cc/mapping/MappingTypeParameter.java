package org.earthsystemmodeling.cupid.cc.mapping;

import org.earthsystemmodeling.cupid.cc.types.MTPType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class MappingTypeParameter {
  @Accessors
  private String name;
  
  @Accessors
  private Class<? extends MTPType<?>> type;
  
  public MappingTypeParameter(final String name, final Class<? extends MTPType<?>> type) {
    this.name = name;
    this.type = type;
  }
  
  @Override
  public String toString() {
    String _simpleName = this.type.getSimpleName();
    String _plus = ((this.name + " (") + _simpleName);
    return (_plus + ")");
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  @Pure
  public Class<? extends MTPType<?>> getType() {
    return this.type;
  }
  
  public void setType(final Class<? extends MTPType<?>> type) {
    this.type = type;
  }
}
