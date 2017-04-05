package org.earthsystemmodeling.cupid.cc;

import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptException;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public abstract class CodeSubconcept {
  private CodeConcept parent;
  
  @Accessors
  private String name;
  
  @Accessors
  private boolean essential;
  
  @Accessors
  private int min;
  
  @Accessors
  private int max;
  
  public CodeSubconcept(final CodeConcept parent, final String name, final boolean essential, final int min, final int max) {
    try {
      this.parent = parent;
      this.name = name;
      this.min = min;
      this.max = max;
      this.essential = essential;
      if (((max != (-1)) && (min > max))) {
        throw new CodeConceptException(("Min should be greater than max in subconcept: " + name));
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  @Pure
  public boolean isEssential() {
    return this.essential;
  }
  
  public void setEssential(final boolean essential) {
    this.essential = essential;
  }
  
  @Pure
  public int getMin() {
    return this.min;
  }
  
  public void setMin(final int min) {
    this.min = min;
  }
  
  @Pure
  public int getMax() {
    return this.max;
  }
  
  public void setMax(final int max) {
    this.max = max;
  }
}
