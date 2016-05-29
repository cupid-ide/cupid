package org.earthsystemmodeling.cupid.nuopc.v7r.df;

import java.util.Collections;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCDriver;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.Binding;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.DesignFragment;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.Task;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class AddComponentToDriver extends DesignFragment {
  @Binding
  public NUOPCDriver Driver;
  
  @Binding
  public NUOPCModel Model;
  
  public AddComponentToDriver() {
    super("Add Model to a Driver", 
      "Add a Model component to the list of child components\nin a Driver", 
      new Function0<String>() {
        public String apply() {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Use this goal to add a child Model to a Driver so that ");
          _builder.newLine();
          _builder.append("it can be executed during the Driver\'s a run sequence.");
          _builder.newLine();
          return _builder.toString();
        }
      }.apply());
    final Function0<NUOPCDriver> _function = new Function0<NUOPCDriver>() {
      @Override
      public NUOPCDriver apply() {
        return AddComponentToDriver.this.Driver;
      }
    };
    Task<NUOPCDriver> _task = new Task<NUOPCDriver>(
      "Import {Model} SetServices subroutine (only) into {Driver}", _function);
    final Function0<NUOPCDriver.SetModelServices> _function_1 = new Function0<NUOPCDriver.SetModelServices>() {
      @Override
      public NUOPCDriver.SetModelServices apply() {
        return AddComponentToDriver.this.Driver.initialization.initSpecs.setModelServices;
      }
    };
    Task<NUOPCDriver.SetModelServices> _task_1 = new Task<NUOPCDriver.SetModelServices>(
      "Add call to NUOPC_DriverAddComp passing in the Model SetServices subroutine", _function_1);
    final Function0<NUOPCDriver.SetModelServices_AddComp> _function_2 = new Function0<NUOPCDriver.SetModelServices_AddComp>() {
      @Override
      public NUOPCDriver.SetModelServices_AddComp apply() {
        final Function1<NUOPCDriver.SetModelServices_AddComp, Boolean> _function = new Function1<NUOPCDriver.SetModelServices_AddComp, Boolean>() {
          @Override
          public Boolean apply(final NUOPCDriver.SetModelServices_AddComp it) {
            return Boolean.valueOf(it.compLabel.equals((("\"" + AddComponentToDriver.this.Model.name) + "\"")));
          }
        };
        return IterableExtensions.<NUOPCDriver.SetModelServices_AddComp>findFirst(AddComponentToDriver.this.Driver.initialization.initSpecs.setModelServices.addComps, _function);
      }
    };
    Task<NUOPCDriver.SetModelServices_AddComp> _task_2 = new Task<NUOPCDriver.SetModelServices_AddComp>(
      "", _function_2);
    Task<NUOPCDriver.SetModelServices> _subTasks = _task_1.subTasks(
      Collections.<Task<?>>unmodifiableList(CollectionLiterals.<Task<?>>newArrayList(_task_2)));
    final Function0<NUOPCDriver.SetRunSequence> _function_3 = new Function0<NUOPCDriver.SetRunSequence>() {
      @Override
      public NUOPCDriver.SetRunSequence apply() {
        return AddComponentToDriver.this.Driver.initialization.initSpecs.setRunSequence;
      }
    };
    Task<NUOPCDriver.SetRunSequence> _task_3 = new Task<NUOPCDriver.SetRunSequence>(
      "Add run sequence element with call to\nNUOPC_DriverAddRunElement", _function_3);
    final Function0<NUOPCDriver.SetRunSequence_AddRunElement> _function_4 = new Function0<NUOPCDriver.SetRunSequence_AddRunElement>() {
      @Override
      public NUOPCDriver.SetRunSequence_AddRunElement apply() {
        final Function1<NUOPCDriver.SetRunSequence_AddRunElement, Boolean> _function = new Function1<NUOPCDriver.SetRunSequence_AddRunElement, Boolean>() {
          @Override
          public Boolean apply(final NUOPCDriver.SetRunSequence_AddRunElement e) {
            return Boolean.valueOf(e.compLabel.equals(AddComponentToDriver.this.Model.name));
          }
        };
        return IterableExtensions.<NUOPCDriver.SetRunSequence_AddRunElement>findFirst(AddComponentToDriver.this.Driver.initialization.initSpecs.setRunSequence.runElements, _function);
      }
    };
    Task<NUOPCDriver.SetRunSequence_AddRunElement> _task_4 = new Task<NUOPCDriver.SetRunSequence_AddRunElement>(
      "Test the run sequence element...", _function_4);
    Task<NUOPCDriver> _subTasks_1 = _task.subTasks(
      Collections.<Task<?>>unmodifiableList(CollectionLiterals.<Task<?>>newArrayList(_subTasks, _task_3, _task_4)));
    this.setTasks(
      Collections.<Task>unmodifiableList(CollectionLiterals.<Task>newArrayList(_subTasks_1)));
  }
  
  @Pure
  public NUOPCDriver getDriver() {
    return this.Driver;
  }
  
  public void setDriver(final NUOPCDriver Driver) {
    this.Driver = Driver;
  }
  
  @Pure
  public NUOPCModel getModel() {
    return this.Model;
  }
  
  public void setModel(final NUOPCModel Model) {
    this.Model = Model;
  }
}
