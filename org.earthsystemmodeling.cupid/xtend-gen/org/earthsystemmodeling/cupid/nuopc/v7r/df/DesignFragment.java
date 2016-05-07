package org.earthsystemmodeling.cupid.nuopc.v7r.df;

import java.util.List;
import org.earthsystemmodeling.cupid.nuopc.v7r.df.Task;
import org.eclipse.xtend.lib.annotations.Accessors;

@Accessors
@SuppressWarnings("all")
public abstract class DesignFragment {
  public abstract String name();
  
  public abstract String goal();
  
  public abstract String description();
  
  public abstract List<Task> tasks();
}
