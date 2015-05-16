package org.earthsystemmodeling.cupid.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Label {
  public String label();
  public String type() default "";
  public int sort() default 999999;
}
