package org.earthsystemmodeling.cupid.nuopc.v7bs50;

import java.sql.ResultSet;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.Name;
import org.earthsystemmodeling.cupid.annotation.Prop;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Label(label = "NUOPC Driver", type = "module")
@SuppressWarnings("all")
public abstract class NUOPCComponent extends CodeConcept<CodeConcept<?, ?>, ASTModuleNode> {
  @Label(label = "Generic Import", type = "uses")
  public static class GenericImport extends CodeConcept<NUOPCComponent, ASTUseStmtNode> {
    @Name
    public String genericComp;
    
    @Prop
    @Label(label = "routineSetServices")
    public String routineSetServices;
    
    public GenericImport(final NUOPCComponent parent, final long id) {
      super(parent);
      this._id = id;
    }
    
    @Override
    public NUOPCComponent.GenericImport reverse() {
      try {
        NUOPCComponent.GenericImport _xblockexpression = null;
        {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("uses(");
          _builder.append(this._id, "");
          _builder.append(", _mid, _genericComp),");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t\t");
          _builder.append("(usesEntity(_, ");
          _builder.append(this._id, "\t\t\t\t\t\t");
          _builder.append(", \'SetServices\', _newName, _) ; true).");
          ResultSet rs = this.execQuery(_builder);
          NUOPCComponent.GenericImport _xifexpression = null;
          boolean _next = rs.next();
          if (_next) {
            NUOPCComponent.GenericImport _xblockexpression_1 = null;
            {
              String _string = rs.getString("_genericComp");
              this.genericComp = _string;
              String _string_1 = rs.getString("_newName");
              this.routineSetServices = _string_1;
              rs.close();
              _xblockexpression_1 = this;
            }
            _xifexpression = _xblockexpression_1;
          } else {
            Object _xblockexpression_2 = null;
            {
              rs.close();
              _xblockexpression_2 = null;
            }
            _xifexpression = ((NUOPCComponent.GenericImport)_xblockexpression_2);
          }
          _xblockexpression = _xifexpression;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "ESMF Import", type = "uses", sort = 1)
  @Child(forward = false)
  public BasicCodeConcept importESMF;
  
  @Label(label = "NUOPC Import", type = "uses", sort = 2)
  @Child(forward = false)
  public BasicCodeConcept importNUOPC;
  
  @Label(label = "Generic Import", type = "uses", sort = 3)
  @Child
  public NUOPCComponent.GenericImport importNUOPCGeneric;
  
  public NUOPCComponent(final CodeConcept<?, ?> parent) {
    super(parent);
  }
  
  public abstract String prefix();
}
