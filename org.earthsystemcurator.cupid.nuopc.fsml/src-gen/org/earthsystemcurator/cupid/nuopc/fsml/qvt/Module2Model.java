package org.earthsystemcurator.cupid.nuopc.fsml.qvt;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.Model;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.qvt.Module2DefinesSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.qvt.Transformation;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTModuleNameNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTModuleStmtNode;

public class Module2Model {
  private Transformation trafo;
  
  private int hash;
  
  public Module2Model(final ASTModuleNode srcModule) {
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
    if (!(obj instanceof Module2Model)) return false;
    Module2Model other = (Module2Model) obj;
    if (srcModule != null ? !srcModule.equals(other.srcModule) :  other.srcModule == null) return false;
    return true;
  }
  
  public String varName;
  
  public Token modNameToken;
  
  public ASTModuleStmtNode ms;
  
  public final ASTModuleNode srcModule;
  
  public ModelDefinesSetServices dss;
  
  public Model tgtModel;
  
  public String modNameText;
  
  public ASTModuleNameNode modName;
  
  public boolean evaluateClause10() {
    boolean _Module2DefinesSetServices = false;
    Module2DefinesSetServices _Module2DefinesSetServices_tuple;
    if (this.srcModule != null && 
        (_Module2DefinesSetServices_tuple = trafo.relation_Module2DefinesSetServices(this.srcModule)) != null)
    {
      dss =  _Module2DefinesSetServices_tuple.tgtDSS;
      _Module2DefinesSetServices = true;
    }
    return _Module2DefinesSetServices;
  }
  
  public boolean execute(final Transformation transformation) {
    this.trafo = transformation;
    // moduleStmt = ms : ASTModuleStmtNode {..}
    if (srcModule.getModuleStmt() == null) return false;
    ms =  srcModule.getModuleStmt();
    // moduleName = modName : ASTModuleNameNode {..}
    if (ms.getModuleName() == null) return false;
    modName =  ms.getModuleName();
    // moduleName = modNameToken : Token {..}
    if (modName.getModuleName() == null) return false;
    modNameToken =  modName.getModuleName();
    // text = modNameText : String {..}
    if (modNameToken.getText() == null) return false;
    modNameText =  modNameToken.getText();
    // Module2DefinesSetServices(srcModule, dss)
    if (!evaluateClause10()) return false;
    // tgtModel : Model {..}
    tgtModel = transformation.create(Model.class);
    // name = modNameText
    tgtModel.setName(modNameText);
    // definesSetServices = dss : ModelDefinesSetServices {..}
    tgtModel.setDefinesSetServices(dss);
    return true;
  }
}
