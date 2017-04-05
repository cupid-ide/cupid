package org.earthsystemmodeling.cupid.cc.types

import org.eclipse.photran.internal.core.parser.IASTNode

abstract class MTPType<T extends IASTNode> {
	
	def MTPType<T> match(T node)

}