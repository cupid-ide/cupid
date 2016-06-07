package org.earthsystemmodeling.cupid.nuopc.v7r.df;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.DesignFragment;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Task<C extends CodeConcept<?, ?>> {
  protected DesignFragment designFragment;
  
  protected String text;
  
  protected boolean optional;
  
  protected List<Task<?>> subTasks;
  
  protected Function0<C> bindingFunc;
  
  public Task(final String text, final Function0<C> bindingFunc, final boolean optional) {
    this.text = text;
    this.bindingFunc = bindingFunc;
    this.optional = optional;
    this.subTasks = Collections.<Task<?>>unmodifiableList(CollectionLiterals.<Task<?>>newArrayList());
  }
  
  public Task(final String text, final Function0<C> bindingFunc) {
    this(text, bindingFunc, false);
  }
  
  public Task<C> subTasks(final List<Task<?>> subTasks) {
    Task<C> _xblockexpression = null;
    {
      this.subTasks = subTasks;
      _xblockexpression = this;
    }
    return _xblockexpression;
  }
  
  public List<Task<?>> getSubTasks() {
    return this.subTasks;
  }
  
  public C boundTo() {
    C _xtrycatchfinallyexpression = null;
    try {
      _xtrycatchfinallyexpression = this.bindingFunc.apply();
    } catch (final Throwable _t) {
      if (_t instanceof NullPointerException) {
        final NullPointerException npe = (NullPointerException)_t;
        return null;
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  public String getText() {
    String _xblockexpression = null;
    {
      final StringBuilder sb = new StringBuilder(this.text);
      _xblockexpression = sb.toString();
    }
    return _xblockexpression;
  }
  
  public Class<? extends CodeConcept<?, ?>> getBindingType() {
    Class<? extends CodeConcept<?, ?>> _xblockexpression = null;
    {
      Class<? extends Function0> _class = this.bindingFunc.getClass();
      Method[] _methods = _class.getMethods();
      final Function1<Method, Boolean> _function = new Function1<Method, Boolean>() {
        @Override
        public Boolean apply(final Method m) {
          String _name = m.getName();
          return Boolean.valueOf(_name.equals("apply"));
        }
      };
      final Method method = IterableExtensions.<Method>findFirst(((Iterable<Method>)Conversions.doWrapArray(_methods)), _function);
      final Type returnType = method.getGenericReturnType();
      _xblockexpression = ((Class<? extends CodeConcept<?, ?>>) returnType);
    }
    return _xblockexpression;
  }
  
  public static void replaceAll(final StringBuilder builder, final String from, final String to) {
    int index = builder.indexOf(from);
    while ((index != (-1))) {
      {
        int _length = from.length();
        int _plus = (index + _length);
        builder.replace(index, _plus, to);
        int _index = index;
        int _length_1 = to.length();
        index = (_index + _length_1);
        int _indexOf = builder.indexOf(from, index);
        index = _indexOf;
      }
    }
  }
  
  @Pure
  public DesignFragment getDesignFragment() {
    return this.designFragment;
  }
  
  public void setDesignFragment(final DesignFragment designFragment) {
    this.designFragment = designFragment;
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
  
  public void setSubTasks(final List<Task<?>> subTasks) {
    this.subTasks = subTasks;
  }
  
  @Pure
  public Function0<C> getBindingFunc() {
    return this.bindingFunc;
  }
  
  public void setBindingFunc(final Function0<C> bindingFunc) {
    this.bindingFunc = bindingFunc;
  }
}
