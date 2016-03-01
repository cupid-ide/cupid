package org.earthsystemmodeling.cupid.annotation

import java.lang.annotation.Retention

@Retention(RUNTIME)
annotation Label {
	val String label
	@Deprecated
	val String type = ""
	val int sort=999999
}