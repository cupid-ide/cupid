package org.earthsystemmodeling.cupid.cc.mapping

import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors

class MappingResult {
    
    @Accessors(PUBLIC_GETTER)
    Map<String,Object> values = newLinkedHashMap
    
    new(Object match) {
        values.put("match", match)
    }
    
    def get(String name) {
        values.get(name)    
    }
    
    def put(String name, Object value) {
    	values.put(name, value)
    }
    
    def match() {
        values.get("match")
    }
    
}
