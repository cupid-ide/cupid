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
  
  public SingleCodeSubconcept(final CodeConcept parent, final CodeConcept concept) {
    this(parent, concept, false, 1, 1);
  }
  
  public SingleCodeSubconcept(final CodeConcept parent, final CodeConcept concept, final boolean essential, final int min, final int max) {
    super(parent, concept.name, essential, min, max);
    this.concept = concept;
  }
  
  /**
   * override reverse(CodeConceptInstance parent) {
   * if (max == 0 || max == 1) {
   * val cci = concept.reverse(parent)
   * if (essential) {
   * if (cci == null && min > 0) {
   * throw new EssentialConstraintViolation("Missing essential subconcept")
   * }
   * else if (cci != null && max == 0) {
   * throw new EssentialConstraintViolation("Prohibited subconcept present")
   * }
   * }
   * }
   * else {
   * val ccis = concept.reverseAll(parent)
   * if (essential && (ccis.size < min || ccis.size > max)) {
   * throw new EssentialConstraintViolation("Must be at between " + min + " and " + max + " instances of " + concept.name)
   * }
   * }
   * }
   */
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
    _builder.append("] ");
    _builder.append(this.concept, "\t\t");
    return _builder.toString();
  }
  
  @Pure
  public CodeConcept getConcept() {
    return this.concept;
  }
}
