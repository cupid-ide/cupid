package org.earthsystemmodeling.cupid.nuopc_v7;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.Name;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc_v7.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc_v7.CodeConcept;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Label(label = "SetServices", type = "subroutine")
@SuppressWarnings("all")
public class SetServicesCodeConcept<P extends CodeConcept<?, ?>> extends CodeConcept<P, ASTSubroutineSubprogramNode> {
  @Name
  public String subroutineName;
  
  @Label(label = "NUOPC_CompDerive", type = "call")
  @Child
  public BasicCodeConcept callsCompDeriveID;
  
  public SetServicesCodeConcept(final P parent) {
    super(parent);
  }
  
  public SetServicesCodeConcept<P> reverse() {
    Object _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("esmf_setservices(_sid, ");
      long _parentID = this.parentID();
      _builder.append(_parentID, "");
      _builder.append(", _sname), ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t\t\t");
      _builder.append("( call_(_cid, _sid, \'NUOPC_CompDerive\') ; true).");
      ResultSet rs = this.execQuery(_builder);
      try {
        boolean _next = rs.next();
        if (_next) {
          long _long = rs.getLong("_sid");
          this._id = _long;
          String _string = rs.getString("_sname");
          this.subroutineName = _string;
          long _long_1 = rs.getLong("_cid");
          BasicCodeConcept _newBasicCodeConcept = BasicCodeConcept.newBasicCodeConcept(this, _long_1);
          this.callsCompDeriveID = _newBasicCodeConcept;
          rs.close();
          return this;
        }
      } catch (final Throwable _t) {
        if (_t instanceof SQLException) {
          final SQLException e = (SQLException)_t;
          CupidActivator.log("SQL error", e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = null;
    }
    return ((SetServicesCodeConcept<P>)_xblockexpression);
  }
}
