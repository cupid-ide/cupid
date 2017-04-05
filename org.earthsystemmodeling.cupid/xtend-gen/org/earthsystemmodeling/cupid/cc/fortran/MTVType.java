package org.earthsystemmodeling.cupid.cc.fortran;

@SuppressWarnings("all")
public interface MTVType<T extends Object> {
  public abstract String match(final T toCheck);
}
