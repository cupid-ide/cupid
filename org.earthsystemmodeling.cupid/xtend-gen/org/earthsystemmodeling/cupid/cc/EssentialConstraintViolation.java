package org.earthsystemmodeling.cupid.cc;

@SuppressWarnings("all")
public class EssentialConstraintViolation extends Exception {
  public EssentialConstraintViolation(final String message) {
    super(message);
  }
}
