package org.earthsystemmodeling.cupid.cc.mapping

import org.eclipse.xtend.lib.annotations.Accessors

class MappingTypeVariable<T> {
    
    @Accessors
    protected String name
    
    @Accessors
    protected Class<T> type
    
    //protected MappingTypeVariableBinding<T> binding
    
    new(String name, Class<T> type) {
        this.name = name
        this.type = type
    }
        
    //def boolean isBound() {
    //    binding != null
    //}
    
    //def boolean isResolved() {
    //    isBound() && binding.isResolved()
    //}
    
    //def void bind(MappingTypeVariableBinding<T> binding) {
    //    this.binding = binding
    //    binding.boundTo = this
    //}
    
    /*
    def T resolve() throws UnboundVariableAccessException, UnresolvedVariableAccessException {
        if (!isBound()) {
            throw new UnboundVariableAccessException(name)
        }
        if (!isResolved()) {
            throw new UnresolvedVariableAccessException(name)
        }
        binding.resolve()
    }
    */
    
}
