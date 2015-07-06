package org.earthsystemmodeling.cupid.nuopc;

@SuppressWarnings("all")
public class CodeGenerationException extends Exception {
  public CodeGenerationException(final String message) {
    super(message);
  }
  
  public CodeGenerationException(final String message, final Throwable cause) {
    super(message, cause);
  }
}
