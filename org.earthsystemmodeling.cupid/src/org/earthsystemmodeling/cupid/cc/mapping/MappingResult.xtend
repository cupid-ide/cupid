package org.earthsystemmodeling.cupid.cc.mapping

import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import org.earthsystemmodeling.cupid.cc.types.MTPType

class MappingResult {
    
    @Accessors(PUBLIC_GETTER)
    Map<String,MTPType<?>> values = newLinkedHashMap
    //Map<String,Object> values = newLinkedHashMap
    
    new() {
    	
    }
    
    new(MTPType<?> match) {
        values.put("match", match)
    }
    
    def get(String name) {
        values.get(name)    
    }
    
    def put(String name, MTPType<?> value) {
    	values.put(name, value)
    }
    
    def match() {
        values.get("match")
    }
    
}
