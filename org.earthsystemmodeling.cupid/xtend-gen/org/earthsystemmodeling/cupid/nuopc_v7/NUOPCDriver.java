package org.earthsystemmodeling.cupid.nuopc_v7;

import com.google.common.base.Objects;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.Name;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc_v7.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc_v7.CodeConcept;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IModuleBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Label(label = "NUOPC Driver", type = "module")
@SuppressWarnings("all")
public class NUOPCDriver extends CodeConcept<NUOPCDriver, NUOPCDriver, ASTModuleNode> {
  @Label(label = "SetServices", type = "subroutine")
  public static class SetServices extends CodeConcept<NUOPCDriver.SetServices, NUOPCDriver, ASTSubroutineSubprogramNode> {
    @Name
    public String subroutineName;
    
    private long callsCompDeriveID = (-1);
    
    public SetServices(final NUOPCDriver parent) {
      super(parent);
    }
    
    public NUOPCDriver.SetServices reverse() {
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
            this.callsCompDeriveID = _long_1;
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
      return ((NUOPCDriver.SetServices)_xblockexpression);
    }
    
    public IFortranAST forward() {
      throw new UnsupportedOperationException("TODO: auto-generated method stub");
    }
    
    public String toString() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("SetServices: (id=");
      _builder.append(this._id, "");
      _builder.append(", callsCompDeriveID=");
      _builder.append(this.callsCompDeriveID, "");
      _builder.append(")");
      return _builder.toString();
    }
  }
  
  @Label(label = "Initialize Specialization Points")
  public static class Initialization extends CodeConcept<NUOPCDriver.Initialization, NUOPCDriver, ASTNode> {
    @Child
    public NUOPCDriver.SetModelServices setModelServices;
    
    @Child(min = 1)
    public NUOPCDriver.SetModelCount setModelCount;
    
    @Child
    public NUOPCDriver.SetRunSequence setRunSequence;
    
    public Initialization(final NUOPCDriver parent) {
      super(parent);
    }
    
    public NUOPCDriver.Initialization reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCDriver.Initialization reverseChildren() {
      NUOPCDriver.Initialization _xblockexpression = null;
      {
        NUOPCDriver.SetModelServices _setModelServices = new NUOPCDriver.SetModelServices(this);
        NUOPCDriver.SetModelServices _reverse = _setModelServices.reverse();
        this.setModelServices = _reverse;
        NUOPCDriver.SetModelCount _setModelCount = new NUOPCDriver.SetModelCount(this);
        NUOPCDriver.SetModelCount _reverse_1 = _setModelCount.reverse();
        this.setModelCount = _reverse_1;
        NUOPCDriver.SetRunSequence _setRunSequence = new NUOPCDriver.SetRunSequence(this);
        NUOPCDriver.SetRunSequence _reverse_2 = _setRunSequence.reverse();
        this.setRunSequence = _reverse_2;
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    public IFortranAST forward() {
      throw new UnsupportedOperationException("TODO: auto-generated method stub");
    }
  }
  
  @Label(label = "SetModelCount", type = "subroutine")
  public static class SetModelCount extends CodeConcept<NUOPCDriver.SetModelCount, NUOPCDriver.Initialization, ASTSubroutineStmtNode> {
    @Name
    public String subroutineName = "SetModelCount";
    
    public String specLabel = "driver_label_SetModelCount";
    
    @Label(label = "Registration", type = "call")
    @Child
    public BasicCodeConcept registration;
    
    public String paramGridComp = "driver";
    
    public String paramRC = "rc";
    
    public SetModelCount(final NUOPCDriver.Initialization parent) {
      super(parent);
    }
    
    public NUOPCDriver.SetModelCount reverse() {
      try {
        NUOPCDriver.SetModelCount _xblockexpression = null;
        {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("esmf_regspec(_sid, ");
          long _parentID = this.parentID();
          _builder.append(_parentID, "");
          _builder.append(", _name, \'NUOPC_Driver\', _specLabelExpr, \'label_SetModelCount\', _regid).");
          ResultSet rs = this.execQuery(_builder);
          NUOPCDriver.SetModelCount _xifexpression = null;
          boolean _next = rs.next();
          if (_next) {
            NUOPCDriver.SetModelCount _xblockexpression_1 = null;
            {
              long _long = rs.getLong("_sid");
              this._id = _long;
              String _string = rs.getString("_name");
              this.subroutineName = _string;
              String _string_1 = rs.getString("_specLabelExpr");
              this.specLabel = _string_1;
              long _long_1 = rs.getLong("_regid");
              BasicCodeConcept _newBasicCodeConcept = BasicCodeConcept.newBasicCodeConcept(this, _long_1);
              this.registration = _newBasicCodeConcept;
              rs.close();
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("esmf_specmethod(");
              _builder_1.append(this._id, "");
              _builder_1.append(", ");
              long _parentID_1 = this.parentID();
              _builder_1.append(_parentID_1, "");
              _builder_1.append(", _, _param_gridcomp, _param_rc).");
              ResultSet _execQuery = this.execQuery(_builder_1);
              rs = _execQuery;
              boolean _next_1 = rs.next();
              if (_next_1) {
                String _string_2 = rs.getString("_param_gridcomp");
                this.paramGridComp = _string_2;
                String _string_3 = rs.getString("_param_rc");
                this.paramRC = _string_3;
                rs.close();
              }
              _xblockexpression_1 = this;
            }
            _xifexpression = _xblockexpression_1;
          } else {
            Object _xblockexpression_2 = null;
            {
              rs.close();
              _xblockexpression_2 = null;
            }
            _xifexpression = ((NUOPCDriver.SetModelCount)_xblockexpression_2);
          }
          _xblockexpression = _xifexpression;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    public IFortranAST forward() {
      IFortranAST _xblockexpression = null;
      {
        final IFortranAST ast = this.getAST();
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("subroutine SetModelCount(driver, rc)");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("type(ESMF_GridComp)  :: driver");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("integer, intent(out) :: rc");
        _builder.newLine();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("rc = ESMF_SUCCESS");
        _builder.newLine();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("! set the modelCount ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("call NUOPC_DriverSet(driver, modelCount=XXX, rc=rc)");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("line=__LINE__, &");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("file=__FILE__)) &");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("return  ! bail out");
        _builder.newLine();
        _builder.newLine();
        _builder.append("  ");
        _builder.append("end subroutine");
        _builder.newLine();
        String code = _builder.toString();
        ASTModuleNode mn = this._parent._parent.getASTRef();
        ASTSubroutineSubprogramNode ssn = CodeExtraction.<ASTSubroutineSubprogramNode>parseLiteralProgramUnit(code);
        IASTListNode<IModuleBodyConstruct> _moduleBody = mn.getModuleBody();
        _moduleBody.add(ssn);
        IASTNode _aSTRef = this._parent._parent.importNUOPCDriver.getASTRef();
        ASTUseStmtNode usesNUOPCDriver = ((ASTUseStmtNode) _aSTRef);
        String _string = usesNUOPCDriver.toString();
        String tempCode = _string.trim();
        String _tempCode = tempCode;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(", &");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        {
          boolean _equals = this.specLabel.equals("label_SetModelCount");
          boolean _not = (!_equals);
          if (_not) {
            _builder_1.append(this.specLabel, "\t\t\t");
            _builder_1.append(" => ");
          }
        }
        _builder_1.append("label_SetModelCount");
        tempCode = (_tempCode + _builder_1);
        IBodyConstruct _parseLiteralStatement = CodeExtraction.parseLiteralStatement(tempCode);
        ASTUseStmtNode tempNode = ((ASTUseStmtNode) _parseLiteralStatement);
        usesNUOPCDriver.replaceWith(tempNode);
        NUOPCDriver.SetServices _setServices = this._parent._parent.setServices;
        ASTSubroutineSubprogramNode _aSTRef_1 = null;
        if (_setServices!=null) {
          _aSTRef_1=_setServices.getASTRef();
        }
        ASTSubroutineSubprogramNode setServices = _aSTRef_1;
        boolean _notEquals = (!Objects.equal(setServices, null));
        if (_notEquals) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.newLine();
          _builder_2.append("call NUOPC_CompSpecialize(");
          _builder_2.append(this.paramGridComp, "");
          _builder_2.append(", specLabel=");
          _builder_2.append(this.specLabel, "");
          _builder_2.append(", &");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t");
          _builder_2.append("specRoutine=");
          _builder_2.append(this.subroutineName, "\t");
          _builder_2.append(", rc=");
          _builder_2.append(this.paramRC, "\t");
          _builder_2.append(")");
          _builder_2.newLineIfNotEmpty();
          code = _builder_2.toString();
          IBodyConstruct _parseLiteralStatement_1 = CodeExtraction.parseLiteralStatement(code);
          ASTCallStmtNode regCall = ((ASTCallStmtNode) _parseLiteralStatement_1);
          IASTListNode<IBodyConstruct> _body = setServices.getBody();
          _body.add(regCall);
        }
        _xblockexpression = ast;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "SetModelServices", type = "subroutine")
  public static class SetModelServices extends CodeConcept<NUOPCDriver.SetModelServices, NUOPCDriver.Initialization, ASTSubroutineStmtNode> {
    @Name
    public String subroutineName;
    
    @Child
    public List<NUOPCDriver.SetModelServices_AddComp> addComps;
    
    public SetModelServices(final NUOPCDriver.Initialization parent) {
      super(parent);
    }
    
    public NUOPCDriver.SetModelServices reverse() {
      try {
        NUOPCDriver.SetModelServices _xblockexpression = null;
        {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("esmf_regspec(_sid, ");
          long _parentID = this.parentID();
          _builder.append(_parentID, "");
          _builder.append(", _name, \'NUOPC_Driver\', _specLabelExpr, \'label_SetModelServices\', _regid).");
          ResultSet rs = this.execQuery(_builder);
          NUOPCDriver.SetModelServices _xifexpression = null;
          boolean _next = rs.next();
          if (_next) {
            NUOPCDriver.SetModelServices _xblockexpression_1 = null;
            {
              long _long = rs.getLong("_sid");
              this._id = _long;
              String _string = rs.getString("_name");
              this.subroutineName = _string;
              rs.close();
              _xblockexpression_1 = this.reverseChildren();
            }
            _xifexpression = _xblockexpression_1;
          } else {
            Object _xblockexpression_2 = null;
            {
              rs.close();
              _xblockexpression_2 = null;
            }
            _xifexpression = ((NUOPCDriver.SetModelServices)_xblockexpression_2);
          }
          _xblockexpression = _xifexpression;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    public NUOPCDriver.SetModelServices reverseChildren() {
      NUOPCDriver.SetModelServices _xblockexpression = null;
      {
        NUOPCDriver.SetModelServices_AddComp _setModelServices_AddComp = new NUOPCDriver.SetModelServices_AddComp(this);
        List<NUOPCDriver.SetModelServices_AddComp> _reverseMultiple = _setModelServices_AddComp.reverseMultiple();
        this.addComps = _reverseMultiple;
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    public IFortranAST forward() {
      throw new UnsupportedOperationException("TODO: auto-generated method stub");
    }
    
    public String toString() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("SetModelServices: (id=");
      _builder.append(this._id, "");
      _builder.append(", subroutineName=");
      _builder.append(this.subroutineName, "");
      _builder.append(")");
      return _builder.toString();
    }
  }
  
  @Label(label = "Add Component", type = "call")
  public static class SetModelServices_AddComp extends CodeConcept<NUOPCDriver.SetModelServices_AddComp, NUOPCDriver.SetModelServices, ASTCallStmtNode> {
    public String compLabel;
    
    public String srcCompLabel;
    
    public String dstCompLabel;
    
    public String compSetServices;
    
    public SetModelServices_AddComp(final NUOPCDriver.SetModelServices parent) {
      super(parent);
    }
    
    public String name() {
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(this.compLabel, null));
      if (_notEquals) {
        _xifexpression = this.compLabel;
      } else {
        String _xifexpression_1 = null;
        boolean _and = false;
        boolean _notEquals_1 = (!Objects.equal(this.srcCompLabel, null));
        if (!_notEquals_1) {
          _and = false;
        } else {
          boolean _notEquals_2 = (!Objects.equal(this.dstCompLabel, null));
          _and = _notEquals_2;
        }
        if (_and) {
          _xifexpression_1 = ((this.srcCompLabel + " => ") + this.dstCompLabel);
        } else {
          _xifexpression_1 = null;
        }
        _xifexpression = _xifexpression_1;
      }
      return _xifexpression;
    }
    
    public List<NUOPCDriver.SetModelServices_AddComp> reverseMultiple() {
      try {
        ArrayList<NUOPCDriver.SetModelServices_AddComp> _xblockexpression = null;
        {
          ArrayList<NUOPCDriver.SetModelServices_AddComp> retList = CollectionLiterals.<NUOPCDriver.SetModelServices_AddComp>newArrayList();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("call_(_cid, ");
          long _parentID = this.parentID();
          _builder.append(_parentID, "");
          _builder.append(", \'NUOPC_DriverAddComp\'),");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t\t\t");
          _builder.append("callArgWithType(_, _cid, 2, _arg2keyword, _arg2Type, _arg2Expr),");
          _builder.newLine();
          _builder.append("\t\t\t\t\t\t\t");
          _builder.append("callArgWithType(_, _cid, 3, _arg3keyword, _arg3Type, _arg3Expr).");
          ResultSet rs = this.execQuery(_builder);
          while (rs.next()) {
            {
              NUOPCDriver.SetModelServices_AddComp addComp = new NUOPCDriver.SetModelServices_AddComp(this._parent);
              long _long = rs.getLong("_cid");
              addComp._id = _long;
              String arg2keyword = rs.getString("_arg2keyword");
              boolean _equalsIgnoreCase = arg2keyword.equalsIgnoreCase("srcCompLabel");
              if (_equalsIgnoreCase) {
                String _string = rs.getString("_arg2Expr");
                addComp.srcCompLabel = _string;
                String _string_1 = rs.getString("_arg3Expr");
                addComp.dstCompLabel = _string_1;
              } else {
                String _string_2 = rs.getString("_arg2Expr");
                addComp.compLabel = _string_2;
              }
              retList.add(addComp);
            }
          }
          _xblockexpression = retList;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    public IFortranAST forward() {
      throw new UnsupportedOperationException("TODO: auto-generated method stub");
    }
  }
  
  @Label(label = "SetRunSequence", type = "subroutine")
  public static class SetRunSequence extends CodeConcept<NUOPCDriver.SetRunSequence, NUOPCDriver.Initialization, ASTSubroutineStmtNode> {
    @Name
    public String subroutineName;
    
    @Label(label = "Registration", type = "call")
    @Child
    public BasicCodeConcept registration;
    
    public SetRunSequence(final NUOPCDriver.Initialization parent) {
      super(parent);
    }
    
    public NUOPCDriver.SetRunSequence reverse() {
      try {
        NUOPCDriver.SetRunSequence _xblockexpression = null;
        {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("esmf_regspec(_sid, ");
          long _parentID = this.parentID();
          _builder.append(_parentID, "");
          _builder.append(", _name, \'NUOPC_Driver\', _specLabelExpr, \'label_SetRunSequence\', _regid).");
          ResultSet rs = this.execQuery(_builder);
          NUOPCDriver.SetRunSequence _xifexpression = null;
          boolean _next = rs.next();
          if (_next) {
            NUOPCDriver.SetRunSequence _xblockexpression_1 = null;
            {
              long _long = rs.getLong("_sid");
              this._id = _long;
              String _string = rs.getString("_name");
              this.subroutineName = _string;
              long _long_1 = rs.getLong("_regid");
              BasicCodeConcept _newBasicCodeConcept = BasicCodeConcept.newBasicCodeConcept(this, _long_1);
              this.registration = _newBasicCodeConcept;
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
            _xifexpression = ((NUOPCDriver.SetRunSequence)_xblockexpression_2);
          }
          _xblockexpression = _xifexpression;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    public IFortranAST forward() {
      throw new UnsupportedOperationException("TODO: auto-generated method stub");
    }
    
    public String toString() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("SetModelServices: (id=");
      _builder.append(this._id, "");
      _builder.append(", subroutineName=");
      _builder.append(this.subroutineName, "");
      _builder.append(")");
      return _builder.toString();
    }
  }
  
  @Name
  public String driverName;
  
  public String filename;
  
  public String path;
  
  @Label(label = "ESMF Import", type = "uses")
  @Child
  public BasicCodeConcept importESMF;
  
  @Label(label = "NUOPC Import", type = "uses")
  @Child
  public BasicCodeConcept importNUOPC;
  
  @Label(label = "NUOPC Driver Import", type = "uses")
  public BasicCodeConcept importNUOPCDriver;
  
  @Child
  public NUOPCDriver.SetServices setServices;
  
  @Child
  public NUOPCDriver.Initialization initialization;
  
  public NUOPCDriver(final CodeDBIndex codeDB) {
    super(null);
    this._codeDB = codeDB;
  }
  
  public IFortranAST forward() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public NUOPCDriver reverse() {
    Object _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module(_moduleID, _compUnitID, _driverName), ");
      _builder.newLine();
      _builder.append("\t\t            ");
      _builder.append("compilationUnit(_compUnitID, _filename, _path),");
      _builder.newLine();
      _builder.append("   \t\t\t\t\t");
      _builder.append("uses(_uid, _mid, \'NUOPC_Driver\').");
      ResultSet rs = this.execQuery(_builder);
      try {
        boolean _next = rs.next();
        if (_next) {
          long _long = rs.getLong("_moduleID");
          this._id = _long;
          String _string = rs.getString("_driverName");
          this.driverName = _string;
          String _string_1 = rs.getString("_filename");
          this.filename = _string_1;
          String _string_2 = rs.getString("_path");
          this.path = _string_2;
          long _long_1 = rs.getLong("_uid");
          BasicCodeConcept _newBasicCodeConcept = BasicCodeConcept.newBasicCodeConcept(this, _long_1);
          this.importNUOPCDriver = _newBasicCodeConcept;
          rs.close();
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("uses(_uid, ");
          _builder_1.append(this._id, "");
          _builder_1.append(", \'ESMF\').");
          ResultSet _execQuery = this.execQuery(_builder_1);
          rs = _execQuery;
          boolean _next_1 = rs.next();
          if (_next_1) {
            long _long_2 = rs.getLong("_uid");
            BasicCodeConcept _newBasicCodeConcept_1 = BasicCodeConcept.newBasicCodeConcept(this, _long_2);
            this.importESMF = _newBasicCodeConcept_1;
          }
          rs.close();
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("uses(_uid, ");
          _builder_2.append(this._id, "");
          _builder_2.append(", \'NUOPC\').");
          ResultSet _execQuery_1 = this.execQuery(_builder_2);
          rs = _execQuery_1;
          boolean _next_2 = rs.next();
          if (_next_2) {
            long _long_3 = rs.getLong("_uid");
            BasicCodeConcept _newBasicCodeConcept_2 = BasicCodeConcept.newBasicCodeConcept(this, _long_3);
            this.importNUOPC = _newBasicCodeConcept_2;
          }
          rs.close();
          return this.reverseChildren();
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
    return ((NUOPCDriver)_xblockexpression);
  }
  
  public NUOPCDriver reverseChildren() {
    NUOPCDriver _xblockexpression = null;
    {
      NUOPCDriver.SetServices _setServices = new NUOPCDriver.SetServices(this);
      NUOPCDriver.SetServices _reverse = _setServices.reverse();
      this.setServices = _reverse;
      NUOPCDriver.Initialization _initialization = new NUOPCDriver.Initialization(this);
      NUOPCDriver.Initialization _reverse_1 = _initialization.reverse();
      this.initialization = _reverse_1;
      _xblockexpression = this;
    }
    return _xblockexpression;
  }
  
  public String toString() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("NUOPCDriver2: (id = ");
    _builder.append(this._id, "");
    _builder.append(", driverName = ");
    _builder.append(this.driverName, "");
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("importESMF: ");
    _builder.append(this.importESMF, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("importNUOPC: ");
    _builder.append(this.importNUOPC, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("importNUOPCDriver: ");
    _builder.append(this.importNUOPCDriver, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("setServices: ");
    _builder.append(this.setServices, "\t");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
}
