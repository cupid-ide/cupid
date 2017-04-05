package org.earthsystemmodeling.cupid.cc.mapping;

import java.util.Map;
import org.earthsystemmodeling.cupid.cc.types.MTPType;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class MappingResult {
  @Accessors(AccessorType.PUBLIC_GETTER)
  private Map<String, MTPType<?>> values = CollectionLiterals.<String, MTPType<?>>newLinkedHashMap();
  
  public MappingResult() {
  }
  
  public MappingResult(final MTPType<?> match) {
    this.values.put("match", match);
  }
  
  public MTPType<?> get(final String name) {
    return this.values.get(name);
  }
  
  public MTPType<?> put(final String name, final MTPType<?> value) {
    return this.values.put(name, value);
  }
  
  public MTPType<?> match() {
    return this.values.get("match");
  }
  
  @Pure
  public Map<String, MTPType<?>> getValues() {
    return this.values;
  }
}
