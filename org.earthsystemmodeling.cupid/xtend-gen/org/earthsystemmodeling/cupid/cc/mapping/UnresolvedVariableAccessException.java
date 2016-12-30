package org.earthsystemmodeling.cupid.cc.mapping;

import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeException;

@SuppressWarnings("all")
public class UnresolvedVariableAccessException extends MappingTypeException {
  public UnresolvedVariableAccessException(final String varName) {
    super(("Cannot access unresolved variable: " + varName));
  }
}
