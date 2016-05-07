package org.earthsystemmodeling.cupid.nuopc.v7r.df;

import java.util.Collections;
import java.util.List;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Task {
  private Class<? extends CodeConcept<?, ?>> context;
  
  private CodeConcept<?, ?> binding;
  
  private String text;
  
  private boolean optional;
  
  private List<Task> subTasks;
  
  public Task(final String text, final Class<? extends CodeConcept<?, ?>> context, final boolean optional) {
    this.text = text;
    this.context = context;
    this.optional = optional;
    this.subTasks = Collections.<Task>unmodifiableList(CollectionLiterals.<Task>newArrayList());
  }
  
  public Task(final String text, final Class<? extends CodeConcept<?, ?>> context) {
    this(text, context, false);
  }
  
  public Task subTasks(final List<Task> subTasks) {
    Task _xblockexpression = null;
    {
      this.subTasks = subTasks;
      _xblockexpression = this;
    }
    return _xblockexpression;
  }
  
  @Pure
  public Class<? extends CodeConcept<?, ?>> getContext() {
    return this.context;
  }
  
  public void setContext(final Class<? extends CodeConcept<?, ?>> context) {
    this.context = context;
  }
  
  @Pure
  public CodeConcept<?, ?> getBinding() {
    return this.binding;
  }
  
  public void setBinding(final CodeConcept<?, ?> binding) {
    this.binding = binding;
  }
  
  @Pure
  public String getText() {
    return this.text;
  }
  
  public void setText(final String text) {
    this.text = text;
  }
  
  @Pure
  public boolean isOptional() {
    return this.optional;
  }
  
  public void setOptional(final boolean optional) {
    this.optional = optional;
  }
  
  @Pure
  public List<Task> getSubTasks() {
    return this.subTasks;
  }
  
  public void setSubTasks(final List<Task> subTasks) {
    this.subTasks = subTasks;
  }
}
