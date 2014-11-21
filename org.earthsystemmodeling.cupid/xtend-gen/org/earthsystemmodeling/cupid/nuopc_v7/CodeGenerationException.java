package org.earthsystemmodeling.cupid.nuopc_v7;

@SuppressWarnings("all")
public class CodeGenerationException extends Exception {
  public CodeGenerationException(final String message) {
    super(message);
  }
  
  public CodeGenerationException(final String message, final Throwable cause) {
    super(message, cause);
  }
}
