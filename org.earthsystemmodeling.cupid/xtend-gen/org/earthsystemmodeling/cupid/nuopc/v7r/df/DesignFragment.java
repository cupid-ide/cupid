package org.earthsystemmodeling.cupid.nuopc.v7r.df;

import com.google.common.base.Objects;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.Binding;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.Task;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public abstract class DesignFragment {
  protected String name;
  
  protected String goal;
  
  protected String description;
  
  protected List<Task> tasks;
  
  public DesignFragment(final String name, final String goal, final String description) {
    this.name = name;
    this.goal = goal;
    this.description = description;
  }
  
  public void setTasks(final List<Task> tasks) {
    this.setParent(tasks);
  }
  
  private void setParent(final List<Task> tasks) {
    final Consumer<Task> _function = (Task t) -> {
      t.designFragment = this;
      this.setParent(t.subTasks);
    };
    tasks.forEach(_function);
    this.tasks = tasks;
  }
  
  public void setBinding(final String name, final CodeConcept<?, ?> concept) {
    try {
      Class<? extends DesignFragment> _class = this.getClass();
      Field[] _fields = _class.getFields();
      final Function1<Field, Boolean> _function = (Field f) -> {
        return Boolean.valueOf(((!Objects.equal(f.<Binding>getAnnotation(Binding.class), null)) && 
          f.getName().equals(name)));
      };
      final Field localField = IterableExtensions.<Field>findFirst(((Iterable<Field>)Conversions.doWrapArray(_fields)), _function);
      localField.set(this, concept);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void removeBinding(final String name) {
    this.setBinding(name, null);
  }
  
  public CodeConcept<?, ?> getBinding(final String name) {
    try {
      CodeConcept<?, ?> _xblockexpression = null;
      {
        Class<? extends DesignFragment> _class = this.getClass();
        Field[] _fields = _class.getFields();
        final Function1<Field, Boolean> _function = (Field f) -> {
          return Boolean.valueOf(((!Objects.equal(f.<Binding>getAnnotation(Binding.class), null)) && 
            f.getName().equals(name)));
        };
        final Field localField = IterableExtensions.<Field>findFirst(((Iterable<Field>)Conversions.doWrapArray(_fields)), _function);
        Object _get = localField.get(this);
        _xblockexpression = ((CodeConcept<?, ?>) _get);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Class<? extends CodeConcept<?, ?>> getBindingType(final String name) {
    Class<? extends CodeConcept<?, ?>> _xblockexpression = null;
    {
      Class<? extends DesignFragment> _class = this.getClass();
      Field[] _fields = _class.getFields();
      final Function1<Field, Boolean> _function = (Field f) -> {
        return Boolean.valueOf(((!Objects.equal(f.<Binding>getAnnotation(Binding.class), null)) && 
          f.getName().equals(name)));
      };
      final Field localField = IterableExtensions.<Field>findFirst(((Iterable<Field>)Conversions.doWrapArray(_fields)), _function);
      Class<?> _type = localField.getType();
      _xblockexpression = ((Class<? extends CodeConcept<?, ?>>) _type);
    }
    return _xblockexpression;
  }
  
  public List<String> getBindings() {
    ArrayList<String> _xblockexpression = null;
    {
      final ArrayList<String> listToReturn = CollectionLiterals.<String>newArrayList();
      Class<? extends DesignFragment> _class = this.getClass();
      Field[] _fields = _class.getFields();
      final Function1<Field, Boolean> _function = (Field f) -> {
        Binding _annotation = f.<Binding>getAnnotation(Binding.class);
        return Boolean.valueOf((!Objects.equal(_annotation, null)));
      };
      Iterable<Field> _filter = IterableExtensions.<Field>filter(((Iterable<Field>)Conversions.doWrapArray(_fields)), _function);
      final Consumer<Field> _function_1 = (Field f) -> {
        String _name = f.getName();
        listToReturn.add(_name);
      };
      _filter.forEach(_function_1);
      _xblockexpression = listToReturn;
    }
    return _xblockexpression;
  }
  
  @Pure
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  @Pure
  public String getGoal() {
    return this.goal;
  }
  
  public void setGoal(final String goal) {
    this.goal = goal;
  }
  
  @Pure
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(final String description) {
    this.description = description;
  }
  
  @Pure
  public List<Task> getTasks() {
    return this.tasks;
  }
}
