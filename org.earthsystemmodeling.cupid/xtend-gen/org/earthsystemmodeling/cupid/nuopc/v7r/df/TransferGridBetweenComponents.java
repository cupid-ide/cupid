package org.earthsystemmodeling.cupid.nuopc.v7r.df;

import java.util.Collections;
import java.util.List;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCMediator;
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
public class TransferGridBetweenComponents extends DesignFragment {
  @Binding
  private NUOPCModel source;
  
  @Binding
  private NUOPCMediator destination;
  
  @Override
  public String name() {
    return "Transfer Grid";
  }
  
  @Override
  public String goal() {
    return "Transfer the grid from a Model to a Mediator";
  }
  
  @Override
  public String description() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Use this goal to set up an automated transfer of the grid between ");
    _builder.newLine();
    _builder.append("a Model and a Mediator.");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  public List<Task> tasks() {
    Task _task = new Task(
      "(subtasks)", 
      NUOPCModel.class);
    Task _task_1 = new Task(
      "Filter initialization phases to use IPDv03 or higher", 
      NUOPCModel.IPD.IPDv04p0.class);
    Task _task_2 = new Task(
      "In the Advertise initialization phase, set the TransferOfferGeom to \'can provide\'", 
      NUOPCModel.IPD.IPDv04p1.class);
    Task _subTasks = _task.subTasks(
      Collections.<Task>unmodifiableList(CollectionLiterals.<Task>newArrayList(_task_1, _task_2)));
    Task _task_3 = new Task(
      "(subtasks)", 
      NUOPCMediator.class);
    Task _task_4 = new Task(
      "Filter initialization phases to use IPDv03 or higher", 
      NUOPCMediator.IPD.IPDv04p0.class);
    Task _task_5 = new Task(
      "In the Advertise initialization phase, set the TransferOfferGeom to \'cannot provide\'", 
      NUOPCMediator.IPD.IPDv04p1.class);
    Task _subTasks_1 = _task_3.subTasks(
      Collections.<Task>unmodifiableList(CollectionLiterals.<Task>newArrayList(_task_4, _task_5)));
    return Collections.<Task>unmodifiableList(CollectionLiterals.<Task>newArrayList(_subTasks, _subTasks_1));
  }
  
  @Pure
  public NUOPCModel getSource() {
    return this.source;
  }
  
  public void setSource(final NUOPCModel source) {
    this.source = source;
  }
  
  @Pure
  public NUOPCMediator getDestination() {
    return this.destination;
  }
  
  public void setDestination(final NUOPCMediator destination) {
    this.destination = destination;
  }
}
