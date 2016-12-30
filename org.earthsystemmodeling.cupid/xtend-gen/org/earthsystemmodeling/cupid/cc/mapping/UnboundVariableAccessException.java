package org.earthsystemmodeling.cupid.cc.mapping;

import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeException;

@SuppressWarnings("all")
public class UnboundVariableAccessException extends MappingTypeException {
  public UnboundVariableAccessException(final String varName) {
    super(("Cannot access unbound variable: " + varName));
  }
}
