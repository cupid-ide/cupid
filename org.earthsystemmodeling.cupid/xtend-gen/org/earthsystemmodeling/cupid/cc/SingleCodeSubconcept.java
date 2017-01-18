package org.earthsystemmodeling.cupid.cc;

import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeSubconcept;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class SingleCodeSubconcept extends CodeSubconcept {
  @Accessors(AccessorType.PUBLIC_GETTER)
  private CodeConcept concept;
  
  @Accessors
  private boolean includeByDefault;
  
  public SingleCodeSubconcept(final CodeConcept parent, final CodeConcept concept) {
    this(parent, concept, false, 1, 1, false);
  }
  
  public SingleCodeSubconcept(final CodeConcept parent, final CodeConcept concept, final boolean essential, final int min, final int max, final boolean includeByDefault) {
    super(parent, concept.name, essential, min, max);
    this.concept = concept;
    this.includeByDefault = includeByDefault;
  }
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t\t");
    _builder.append("- [");
    int _min = this.getMin();
    _builder.append(_min, "\t\t");
    _builder.append("-");
    int _max = this.getMax();
    _builder.append(_max, "\t\t");
    _builder.append("] (includeByDefault = ");
    _builder.append(this.includeByDefault, "\t\t");
    _builder.append(") ");
    _builder.append(this.concept, "\t\t");
    return _builder.toString();
  }
  
  @Pure
  public CodeConcept getConcept() {
    return this.concept;
  }
  
  @Pure
  public boolean isIncludeByDefault() {
    return this.includeByDefault;
  }
  
  public void setIncludeByDefault(final boolean includeByDefault) {
    this.includeByDefault = includeByDefault;
  }
}
