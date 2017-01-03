package org.earthsystemmodeling.cupid.cc;

import com.google.common.base.Objects;
import java.util.List;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.CodeSubconcept;
import org.earthsystemmodeling.cupid.cc.EssentialConstraintViolation;
import org.eclipse.xtend.lib.annotations.AccessorType;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Exceptions;
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
  
  @Override
  public void reverse(final CodeConceptInstance parent) {
    try {
      if (((this.getMax() == 0) || (this.getMax() == 1))) {
        final CodeConceptInstance cci = this.concept.reverse(parent);
        boolean _isEssential = this.isEssential();
        if (_isEssential) {
          if ((Objects.equal(cci, null) && (this.getMin() > 0))) {
            throw new EssentialConstraintViolation("Missing essential subconcept");
          } else {
            if (((!Objects.equal(cci, null)) && (this.getMax() == 0))) {
              throw new EssentialConstraintViolation("Prohibited subconcept present");
            }
          }
        }
      } else {
        final List<CodeConceptInstance> ccis = this.concept.reverseAll(parent);
        if ((this.isEssential() && ((ccis.size() < this.getMin()) || (ccis.size() > this.getMax())))) {
          int _min = this.getMin();
          String _plus = ("Must be at between " + Integer.valueOf(_min));
          String _plus_1 = (_plus + " and ");
          int _max = this.getMax();
          String _plus_2 = (_plus_1 + Integer.valueOf(_max));
          String _plus_3 = (_plus_2 + " instances of ");
          String _plus_4 = (_plus_3 + this.concept.name);
          throw new EssentialConstraintViolation(_plus_4);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Pure
  public CodeConcept getConcept() {
    return this.concept;
  }
}
