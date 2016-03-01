package org.earthsystemmodeling.cupid.annotation

import java.lang.annotation.Retention

@Retention(RUNTIME)
annotation Child {
	val Class<?> astRef = Void
	val int min = 1
	val int max = 1
	val boolean forward = false
}