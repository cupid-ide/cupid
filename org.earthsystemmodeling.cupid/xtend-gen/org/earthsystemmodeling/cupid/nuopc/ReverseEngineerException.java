package org.earthsystemmodeling.cupid.nuopc;

@SuppressWarnings("all")
public class ReverseEngineerException extends Exception {
  public ReverseEngineerException(final String message) {
    super(message);
  }
  
  public ReverseEngineerException(final String message, final Throwable cause) {
    super(message, cause);
  }
}
