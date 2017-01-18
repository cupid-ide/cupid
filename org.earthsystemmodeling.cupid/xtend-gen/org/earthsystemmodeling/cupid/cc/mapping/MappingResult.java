package org.earthsystemmodeling.cupid.cc.mapping;

import java.util.Map;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class MappingResult {
  @Accessors(AccessorType.PUBLIC_GETTER)
  private Map<String, Object> values = CollectionLiterals.<String, Object>newLinkedHashMap();
  
  public MappingResult(final Object match) {
    this.values.put("match", match);
  }
  
  public Object get(final String name) {
    return this.values.get(name);
  }
  
  public Object put(final String name, final Object value) {
    return this.values.put(name, value);
  }
  
  public Object match() {
    return this.values.get("match");
  }
  
  @Pure
  public Map<String, Object> getValues() {
    return this.values;
  }
}
