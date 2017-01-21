package org.earthsystemmodeling.cupid.cc.mapping;

import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeException;

@SuppressWarnings("all")
public class IllegalVariableAssignment extends MappingTypeException {
  public IllegalVariableAssignment(final String varName, final Class<?> expectedType, final Class<?> actualType) {
    super(((((("Illegal variable assignment for variable: " + varName) + ". Expected type ") + expectedType.getSimpleName()) + " but received type ") + actualType.getSimpleName()));
  }
}
