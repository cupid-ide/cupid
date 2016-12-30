package org.earthsystemmodeling.cupid.cc.mapping

import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeException

class IllegalVariableAssignment extends MappingTypeException {
    
    new(String varName, Class<?> expectedType, Class<?> actualType) {
        super("Illegal variable assignment: Expected type " + expectedType.simpleName + " but received type " + actualType.simpleName)
    }
    
}