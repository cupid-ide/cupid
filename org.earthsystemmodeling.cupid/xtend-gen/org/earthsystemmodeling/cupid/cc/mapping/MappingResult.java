package org.earthsystemmodeling.cupid.cc.mapping;

import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class MappingResult {
  private Map<String, Object> results = CollectionLiterals.<String, Object>newLinkedHashMap();
  
  public MappingResult(final Object match) {
    this.results.put("match", match);
  }
  
  public Object get(final String name) {
    return this.results.get(name);
  }
  
  public Object put(final String name, final Object value) {
    return this.results.put(name, value);
  }
  
  public Object match() {
    return this.results.get("match");
  }
}
