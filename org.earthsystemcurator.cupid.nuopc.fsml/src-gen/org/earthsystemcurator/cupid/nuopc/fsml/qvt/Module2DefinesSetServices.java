package org.earthsystemcurator.cupid.nuopc.fsml.qvt;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.qvt.Transformation;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineNameNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;

public class Module2DefinesSetServices {
  private Transformation trafo;
  
  private int hash;
  
  public Module2DefinesSetServices(final ASTModuleNode srcModule) {
    this.srcModule=srcModule;
  }
  
  public int hashCode() {
    if (hash != 0) return hash;
    final int prime = 31;
    int result = 1;
    result = prime * result + srcModule.hashCode();
    return hash = result;
  }
  
  public boolean equals(final Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Module2DefinesSetServices)) return false;
    Module2DefinesSetServices other = (Module2DefinesSetServices) obj;
    if (srcModule != null ? !srcModule.equals(other.srcModule) :  other.srcModule == null) return false;
    return true;
  }
  
  public ASTSubroutineNameNode sn;
  
  public Token snToken;
  
  public String snText;
  
  public ASTSubroutineSubprogramNode mb;
  
  public final ASTModuleNode srcModule;
  
  public ModelDefinesSetServices tgtDSS;
  
  public ASTSubroutineStmtNode ss;
  
  public boolean evaluateClause12() {
    boolean _equalsIgnoreCase = this.snText.equalsIgnoreCase("SetServices");
    return _equalsIgnoreCase;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // moduleBody = mb : ASTSubroutineSubprogramNode {..}
    boolean result = false;
    for (org.eclipse.photran.internal.core.parser.IModuleBodyConstruct __mb : srcModule.getModuleBody()) {
    if (!(__mb instanceof ASTSubroutineSubprogramNode)) continue;
    mb = (ASTSubroutineSubprogramNode)__mb;
    // subroutineStmt = ss : ASTSubroutineStmtNode {..}
    if (mb.getSubroutineStmt() == null) continue;
    ss =  mb.getSubroutineStmt();
    // subroutineName = sn : ASTSubroutineNameNode {..}
    if (ss.getSubroutineName() == null) continue;
    sn =  ss.getSubroutineName();
    // subroutineName = snToken : Token {..}
    if (sn.getSubroutineName() == null) continue;
    snToken =  sn.getSubroutineName();
    // text = snText : String {..}
    if (snToken.getText() == null) continue;
    snText =  snToken.getText();
    // snText.equalsIgnoreCase("SetServices")
    if (!evaluateClause12()) continue;
    // tgtDSS : ModelDefinesSetServices {..}
    if (tgtDSS==null) tgtDSS = transformation.create(ModelDefinesSetServices.class);
    result=true;
    }
    return result;
  }
}
