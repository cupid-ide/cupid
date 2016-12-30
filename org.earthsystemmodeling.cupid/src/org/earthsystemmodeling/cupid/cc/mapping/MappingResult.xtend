package org.earthsystemmodeling.cupid.cc.mapping

import java.util.Map

class MappingResult {
    
    Map<String,Object> results = newLinkedHashMap
    
    new(Object match) {
        results.put("match", match)
    }
    
    def get(String name) {
        results.get(name)    
    }
    
    def match() {
        results.get("match")
    }
    
}
