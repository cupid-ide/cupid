package org.earthsystemmodeling.cupid.cc.mapping;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class MappingTypeVariable<T extends Object> {
  @Accessors
  protected String name;
  
  @Accessors
  protected Class<T> type;
  
  public MappingTypeVariable(final String name, final Class<T> type) {
    this.name = name;
    this.type = type;
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
