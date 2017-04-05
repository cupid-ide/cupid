package org.earthsystemmodeling.cupid.cc.types;

import org.eclipse.photran.internal.core.parser.IASTNode;

@SuppressWarnings("all")
public abstract class MTPType<T extends IASTNode> {
  public abstract MTPType<T> match(final T node);
}
