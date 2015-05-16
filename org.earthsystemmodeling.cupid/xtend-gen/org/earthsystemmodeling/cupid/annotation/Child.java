package org.earthsystemmodeling.cupid.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Child {
  public Class<?> astRef() default Void.class;
  public int min() default 1;
  public int max() default 1;
  public boolean forward() default true;
}
