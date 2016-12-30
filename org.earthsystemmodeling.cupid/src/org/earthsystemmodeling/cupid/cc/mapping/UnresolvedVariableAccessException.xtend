package org.earthsystemmodeling.cupid.cc.mapping

import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeException

class UnresolvedVariableAccessException extends MappingTypeException {
    
    new(String varName) {
        super("Cannot access unresolved variable: " + varName)
    }
    
}