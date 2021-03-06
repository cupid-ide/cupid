package org.earthsystemmodeling.cupid.cc.mapping

import java.util.List
import org.eclipse.xtext.xbase.lib.Functions.Function1
import org.eclipse.xtend.lib.annotations.Accessors
import org.earthsystemmodeling.cupid.cc.types.MTPType

class MappingResultSet {
    
    @Accessors
    MappingType type
     
    List<MappingResult> results = newLinkedList
   
    new(MappingType type) {
        this.type = type    
    }
    
    def getResults() {
        results
    }
    
    def get(int index) {
        results.get(index)
    }
    
    def first() {
        get(0)
    }
    
    def void addResult(MappingResult result) {
    	results.add(result)
    }
        
    def addMatch(MTPType<?> match) {
        val r = new MappingResult(match)
        results.add(r)
        r
    }
    
    def size() {
        results.size()
    }
    
    def <T> removeMatchIf(Function1<? super T, Boolean> predicate) {
        results.removeIf([r|predicate.apply(r.match as T)])
        this        
    }
    
    def <T> retainMatchIf(Function1<? super T, Boolean> predicate) {
        results.removeIf([r|!predicate.apply(r.match as T)])
        this
    }
    
}
