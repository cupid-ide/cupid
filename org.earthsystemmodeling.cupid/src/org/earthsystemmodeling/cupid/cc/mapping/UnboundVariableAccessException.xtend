package org.earthsystemmodeling.cupid.cc.mapping

class UnboundVariableAccessException extends MappingTypeException {
    
    new(String varName) {
        super("Cannot access unbound variable: " + varName)
    }
    
}
