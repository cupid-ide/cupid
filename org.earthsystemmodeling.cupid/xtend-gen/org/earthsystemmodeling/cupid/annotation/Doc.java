package org.earthsystemmodeling.cupid.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Doc {
  public String urlfrag();
}
