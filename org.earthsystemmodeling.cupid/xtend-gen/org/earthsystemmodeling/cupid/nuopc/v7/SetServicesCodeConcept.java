package org.earthsystemmodeling.cupid.nuopc.v7;

import com.google.common.base.Objects;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.Name;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7.NUOPCComponent;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTAccessStmtNode;
import org.eclipse.photran.internal.core.parser.ASTContainsStmtNode;
import org.eclipse.photran.internal.core.parser.ASTImplicitStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IModuleBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Label(label = "SetServices", type = "subroutine")
@SuppressWarnings("all")
public class SetServicesCodeConcept<P extends NUOPCComponent> extends CodeConcept<P, ASTSubroutineSubprogramNode> {
  @Name
  public String subroutineName = "SetServices";
  
  public String paramGridComp = "gcomp";
  
  public String paramRC = "rc";
  
  @Label(label = "NUOPC_CompDerive", type = "call")
  @Child
  public BasicCodeConcept callsCompDeriveID;
  
  public SetServicesCodeConcept(final P parent) {
    super(parent);
  }
  
  @Override
  public SetServicesCodeConcept<P> reverse() {
    Object _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("esmf_setservices(_sid, ");
      long _parentID = this.parentID();
      _builder.append(_parentID, "");
      _builder.append(", _sname, _param_gcomp, _param_rc), ");
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
          String _string_1 = rs.getString("_param_gcomp");
          this.paramGridComp = _string_1;
          String _string_2 = rs.getString("_param_rc");
          this.paramRC = _string_2;
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
  
  @Override
  public IFortranAST forward() {
    IFortranAST _xblockexpression = null;
    {
      final IFortranAST ast = this.getAST();
      String routineSetServices = this._parent.importNUOPCGeneric.routineSetServices;
      boolean _equals = Objects.equal(routineSetServices, null);
      if (_equals) {
        String _prefix = this._parent.prefix();
        String _plus = (_prefix + "_SetServices");
        routineSetServices = _plus;
        ASTUseStmtNode _aSTRef = this._parent.importNUOPCGeneric.getASTRef();
        final ASTUseStmtNode genericUse = ((ASTUseStmtNode) _aSTRef);
        String _string = genericUse.toString();
        String tempCode = _string.trim();
        String _tempCode = tempCode;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(", &");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append(routineSetServices, "\t\t\t\t\t\t");
        _builder.append(" => SetServices");
        tempCode = (_tempCode + _builder);
        IBodyConstruct _parseLiteralStatement = CodeExtraction.parseLiteralStatement(tempCode);
        ASTUseStmtNode tempNode = ((ASTUseStmtNode) _parseLiteralStatement);
        genericUse.replaceWith(tempNode);
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.newLine();
      _builder_1.append("subroutine SetServices(");
      _builder_1.append(this.paramGridComp, "");
      _builder_1.append(", ");
      _builder_1.append(this.paramRC, "");
      _builder_1.append(")");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("    ");
      _builder_1.append("type(ESMF_GridComp)  :: ");
      _builder_1.append(this.paramGridComp, "    ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("    ");
      _builder_1.append("integer, intent(out) :: ");
      _builder_1.append(this.paramRC, "    ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("    ");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("rc = ESMF_SUCCESS");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("! NUOPC_Driver registers the generic methods");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("call NUOPC_CompDerive(");
      _builder_1.append(this.paramGridComp, "    ");
      _builder_1.append(", ");
      _builder_1.append(routineSetServices, "    ");
      _builder_1.append(", rc=");
      _builder_1.append(this.paramRC, "    ");
      _builder_1.append(")");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("    ");
      _builder_1.append("if (ESMF_LogFoundError(rcToCheck=");
      _builder_1.append(this.paramRC, "    ");
      _builder_1.append(", msg=ESMF_LOGERR_PASSTHRU, &");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("      ");
      _builder_1.append("line=__LINE__, &");
      _builder_1.newLine();
      _builder_1.append("      ");
      _builder_1.append("file=__FILE__)) &");
      _builder_1.newLine();
      _builder_1.append("      ");
      _builder_1.append("return  ! bail out");
      _builder_1.newLine();
      _builder_1.append("      ");
      _builder_1.newLine();
      _builder_1.append("end subroutine");
      _builder_1.newLine();
      String code = _builder_1.toString();
      ASTModuleNode mn = this._parent.getASTRef();
      ASTSubroutineSubprogramNode ssn = CodeExtraction.<ASTSubroutineSubprogramNode>parseLiteralProgramUnit(code);
      IASTListNode<IModuleBodyConstruct> _moduleBody = mn.getModuleBody();
      _moduleBody.add(ssn);
      this.setASTRef(ssn);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.newLine();
      _builder_2.append("public SetServices");
      _builder_2.newLine();
      code = _builder_2.toString();
      IBodyConstruct _parseLiteralStatement_1 = CodeExtraction.parseLiteralStatement(code);
      ASTAccessStmtNode tempNode_1 = ((ASTAccessStmtNode) _parseLiteralStatement_1);
      IASTListNode<IModuleBodyConstruct> _moduleBody_1 = mn.getModuleBody();
      ASTContainsStmtNode csn = _moduleBody_1.<ASTContainsStmtNode>findLast(ASTContainsStmtNode.class);
      boolean _notEquals = (!Objects.equal(csn, null));
      if (_notEquals) {
        IASTListNode<IModuleBodyConstruct> _moduleBody_2 = mn.getModuleBody();
        _moduleBody_2.insertBefore(csn, tempNode_1);
      } else {
        IASTListNode<IModuleBodyConstruct> _moduleBody_3 = mn.getModuleBody();
        ASTImplicitStmtNode isn = _moduleBody_3.<ASTImplicitStmtNode>findLast(ASTImplicitStmtNode.class);
        boolean _notEquals_1 = (!Objects.equal(isn, null));
        if (_notEquals_1) {
          IASTListNode<IModuleBodyConstruct> _moduleBody_4 = mn.getModuleBody();
          _moduleBody_4.insertAfter(isn, tempNode_1);
        } else {
          IASTListNode<IModuleBodyConstruct> _moduleBody_5 = mn.getModuleBody();
          _moduleBody_5.add(tempNode_1);
        }
      }
      _xblockexpression = ast;
    }
    return _xblockexpression;
  }
}
