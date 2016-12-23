package org.earthsystemmodeling.cupid.cc;

import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class ASTNodeCodeConcept<N extends IASTNode, O extends IASTNode> /* implements org.earthsystemmodeling.cupid.cc.nuopc.CodeConcept  */{
  @Accessors
  protected Function1<? super N, ? extends O> find;
  
  @Accessors
  protected Function1<? super N, ? extends Iterable<O>> findAll;
  
  @Accessors
  protected /* Procedure2<? super O, ? super org.earthsystemmodeling.cupid.cc.nuopc.CodeConceptInstance> */Object populate;
  
  public ASTNodeCodeConcept(final String name) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method super(String) is undefined"
      + "\nThe method erse((Object, Object)=>boolean) is undefined"
      + "\nThe method or field tokenRef is undefined for the type Object"
      + "\norg.earthsystemmodeling.cupid.cc.nuopc.CodeConceptInstance cannot be resolved."
      + "\nThe method or field children is undefined"
      + "\nThe method or field child is undefined for the type Object"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nThe field ASTNodeCodeConcept.populate refers to the missing type CodeConceptInstance"
      + "\nThere is no context to infer the closure\'s argument types from. Consider typing the arguments or put the closures into a typed context."
      + "\nfindToken cannot be resolved"
      + "\nfindNearestAncestor cannot be resolved"
      + "\nforEach cannot be resolved"
      + "\nreverse cannot be resolved"
      + "\napply cannot be resolved"
      + "\n! cannot be resolved");
  }
  
  @Pure
  public Function1<? super N, ? extends O> getFind() {
    return this.find;
  }
  
  public void setFind(final Function1<? super N, ? extends O> find) {
    this.find = find;
  }
  
  @Pure
  public Function1<? super N, ? extends Iterable<O>> getFindAll() {
    return this.findAll;
  }
  
  public void setFindAll(final Function1<? super N, ? extends Iterable<O>> findAll) {
    this.findAll = findAll;
  }
  
  @Pure
  public /* Procedure2<? super O, ? super CodeConceptInstance> */Object getPopulate() {
    return this.populate;
  }
  
  public void setPopulate(final /* Procedure2<? super O, ? super CodeConceptInstance> */Object populate) {
    this.populate = populate;
  }
}
