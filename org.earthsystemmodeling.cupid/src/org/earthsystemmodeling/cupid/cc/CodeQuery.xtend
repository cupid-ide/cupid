package org.earthsystemmodeling.cupid.cc

import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

abstract class CodeQuery {
    
    @Accessors
    Map<String, Class<?>> parameters
    
    new(Map<String, Class<?>> parameters) {
        this.parameters = parameters
    }  
  
    def <T> T getParameter(String name) {
        
    }
       
    abstract def void execute(Map<String,Object> parameterValues)  
    
}