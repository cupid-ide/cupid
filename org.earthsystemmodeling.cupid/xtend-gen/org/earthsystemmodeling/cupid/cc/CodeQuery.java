package org.earthsystemmodeling.cupid.cc;

import java.util.Map;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class CodeQuery {
  @Accessors
  private Map<String, Class<?>> parameters;
  
  public CodeQuery(final Map<String, Class<?>> parameters) {
    this.parameters = parameters;
  }
  
  public <T extends Object> T getParameter(final String name) {
    return null;
  }
  
  public abstract void execute(final Map<String, Object> parameterValues);
  
  @Pure
  public Map<String, Class<?>> getParameters() {
    return this.parameters;
  }
  
  public void setParameters(final Map<String, Class<?>> parameters) {
    this.parameters = parameters;
  }
}
