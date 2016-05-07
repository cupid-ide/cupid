package org.earthsystemmodeling.cupid.nuopc.v7r.df;

import java.util.Collections;
import java.util.List;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCDriver;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.Binding;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.DesignFragment;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.Task;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class AddComponentToDriver extends DesignFragment {
  @Binding
  private NUOPCDriver driver;
  
  @Binding
  private NUOPCModel model;
  
  @Override
  public String name() {
    return "Add component to Driver";
  }
  
  @Override
  public String goal() {
    return "Add a child Model to a Driver";
  }
  
  @Override
  public String description() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Use this goal to add a child Model to a Driver so that ");
    _builder.newLine();
    _builder.append("it can be executed during the Driver\'s a run sequence.");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public List<Task> tasks() {
    Task _task = new Task(
      "Import Model SetServices subroutine (only) into the Driver", 
      NUOPCDriver.class);
    Task _task_1 = new Task(
      "Add call to NUOPC_DriverAddComp passing in the Model SetServices subroutine", 
      NUOPCDriver.SetModelServices.class);
    Task _task_2 = new Task(
      "Add run sequence element with call to\nNUOPC_DriverAddRunElement", 
      NUOPCDriver.SetRunSequence.class, 
      true);
    Task _subTasks = _task.subTasks(
      Collections.<Task>unmodifiableList(CollectionLiterals.<Task>newArrayList(_task_1, _task_2)));
    return Collections.<Task>unmodifiableList(CollectionLiterals.<Task>newArrayList(_subTasks));
  }
  
  @Pure
  public NUOPCDriver getDriver() {
    return this.driver;
  }
  
  public void setDriver(final NUOPCDriver driver) {
    this.driver = driver;
  }
  
  @Pure
  public NUOPCModel getModel() {
    return this.model;
  }
  
  public void setModel(final NUOPCModel model) {
    this.model = model;
  }
}
