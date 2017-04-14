package org.earthsystemmodeling.cupid.cc;

import com.google.common.base.Objects;
import java.util.List;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.CodeSubconcept;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class CodeSubconceptInstance {
  @Accessors
  private CodeSubconcept type;
  
  @Accessors
  private CodeConceptInstance parent;
  
  private List<CodeConceptInstance> instances = CollectionLiterals.<CodeConceptInstance>newLinkedList();
  
  public CodeSubconceptInstance(final CodeSubconcept type, final CodeConceptInstance parent) {
    this(type, parent, null);
  }
  
  public CodeSubconceptInstance(final CodeSubconcept type, final CodeConceptInstance parent, final CodeConceptInstance instance) {
    this.type = type;
    this.parent = parent;
    boolean _notEquals = (!Objects.equal(instance, null));
    if (_notEquals) {
      this.instances.add(instance);
    }
  }
  
  public CodeConceptInstance getInstance() {
    CodeConceptInstance _xifexpression = null;
    int _size = this.instances.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      _xifexpression = this.instances.get(0);
    }
    return _xifexpression;
  }
  
  public List<CodeConceptInstance> getInstances() {
    return this.instances;
  }
  
  public boolean addInstance(final CodeConceptInstance instance) {
    return this.instances.add(instance);
  }
  
  @Override
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CodeSubconceptInstance: ");
    String _name = this.type.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    {
      for(final CodeConceptInstance ci : this.instances) {
        _builder.append("- ");
        String _string = ci.toString();
        _builder.append(_string);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  @Pure
  public CodeSubconcept getType() {
    return this.type;
  }
  
  public void setType(final CodeSubconcept type) {
    this.type = type;
  }
  
  @Pure
  public CodeConceptInstance getParent() {
    return this.parent;
  }
  
  public void setParent(final CodeConceptInstance parent) {
    this.parent = parent;
  }
}
