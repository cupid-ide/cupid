package org.earthsystemmodeling.cupid.cc

import org.eclipse.core.resources.IFile

class FileRootCodeConcept extends RootCodeConcept<IFile> {
    
    new(String name) {
        this(name, null)
    }    
    
    new(String name, FileRootCodeConcept refines) {
        super(name, refines)
    }
    
    override reverseFromSource(IFile source) {
        throw new UnsupportedOperationException("TODO: auto-generated method stub")
    }
    
}
