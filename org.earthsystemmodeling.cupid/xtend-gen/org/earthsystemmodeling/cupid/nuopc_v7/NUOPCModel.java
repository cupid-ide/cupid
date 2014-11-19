package org.earthsystemmodeling.cupid.nuopc_v7;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc_v7.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc_v7.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc_v7.EntryPointCodeConcept;
import org.earthsystemmodeling.cupid.nuopc_v7.SetServicesCodeConcept;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Label(label = "NUOPC Model", type = "module")
@SuppressWarnings("all")
public class NUOPCModel extends CodeConcept<CodeConcept<?, ?>, ASTModuleNode> {
  @Label(label = "Initialize")
  public static class Initialization extends CodeConcept<NUOPCModel, ASTNode> {
    @Child
    public NUOPCModel.InitP1 initP1;
    
    @Child
    public NUOPCModel.InitP2 initP2;
    
    public Initialization(final NUOPCModel parent) {
      super(parent);
    }
    
    public NUOPCModel.Initialization reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCModel.Initialization reverseChildren() {
      NUOPCModel.Initialization _xblockexpression = null;
      {
        NUOPCModel.InitP1 _initP1 = new NUOPCModel.InitP1(this);
        CodeConcept<NUOPCModel.Initialization, ASTSubroutineSubprogramNode> _reverse = _initP1.reverse();
        this.initP1 = ((NUOPCModel.InitP1) _reverse);
        NUOPCModel.InitP2 _initP2 = new NUOPCModel.InitP2(this);
        CodeConcept<NUOPCModel.Initialization, ASTSubroutineSubprogramNode> _reverse_1 = _initP2.reverse();
        this.initP2 = ((NUOPCModel.InitP2) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Initialize Phase 1", type = "subroutine")
  public static class InitP1 extends EntryPointCodeConcept<NUOPCModel.Initialization> {
    @Child(max = (-1))
    public List<NUOPCModel.InitP1_AdvertiseField> advertiseFields;
    
    public InitP1(final NUOPCModel.Initialization parent) {
      super(parent, "IPDv00p1");
    }
    
    public EntryPointCodeConcept<NUOPCModel.Initialization> reverseChildren() {
      NUOPCModel.InitP1 _xblockexpression = null;
      {
        NUOPCModel.InitP1_AdvertiseField _initP1_AdvertiseField = new NUOPCModel.InitP1_AdvertiseField(this);
        List _reverseMultiple = _initP1_AdvertiseField.reverseMultiple();
        this.advertiseFields = _reverseMultiple;
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent;
    }
    
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent.setServices;
    }
  }
  
  @Label(label = "Advertise Field", type = "call")
  public static class InitP1_AdvertiseField extends CodeConcept<NUOPCModel.InitP1, ASTCallStmtNode> {
    public String state;
    
    public String standardName;
    
    public InitP1_AdvertiseField(final NUOPCModel.InitP1 parent) {
      super(parent);
      this.state = this._parent.paramImport;
      this.standardName = "StandardName";
    }
    
    public String name() {
      return ((this.state + " / ") + this.standardName);
    }
    
    public List reverseMultiple() {
      try {
        ArrayList<NUOPCModel.InitP1_AdvertiseField> _xblockexpression = null;
        {
          ArrayList<NUOPCModel.InitP1_AdvertiseField> retList = CollectionLiterals.<NUOPCModel.InitP1_AdvertiseField>newArrayList();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("call_(_cid, ");
          long _parentID = this.parentID();
          _builder.append(_parentID, "");
          _builder.append(", \'NUOPC_StateAdvertiseField\'),");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t\t");
          _builder.append("callArgWithType(_, _cid, 1, _, _, _stateExpr),");
          _builder.newLine();
          _builder.append("\t\t\t\t\t\t");
          _builder.append("callArgWithType(_, _cid, 2, _, _, _standardNameExpr).");
          ResultSet rs = this.execQuery(_builder);
          while (rs.next()) {
            {
              NUOPCModel.InitP1_AdvertiseField advField = new NUOPCModel.InitP1_AdvertiseField(this._parent);
              long _long = rs.getLong("_cid");
              advField._id = _long;
              String _string = rs.getString("_stateExpr");
              advField.state = _string;
              String _string_1 = rs.getString("_standardNameExpr");
              advField.standardName = _string_1;
              retList.add(advField);
            }
          }
          rs.close();
          _xblockexpression = retList;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    public IFortranAST forward() {
      IFortranAST _xblockexpression = null;
      {
        IFortranAST ast = this.getAST();
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("call NUOPC_StateAdvertiseField(");
        CharSequence _paramch = this.paramch(this.state);
        _builder.append(_paramch, "");
        _builder.append(", \'");
        CharSequence _paramch_1 = this.paramch(this.standardName);
        _builder.append(_paramch_1, "");
        _builder.append("\', rc=");
        _builder.append(this._parent.paramRC, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("if (ESMF_LogFoundError(rcToCheck=");
        _builder.append(this._parent.paramRC, "");
        _builder.append(", msg=ESMF_LOGERR_PASSTHRU, &");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("line=__LINE__, &");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("file=__FILE__)) &");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("return  ! bail out");
        _builder.newLine();
        String code = _builder.toString();
        final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
        ASTSubroutineSubprogramNode ssn = this._parent.getASTRef();
        IASTListNode<IBodyConstruct> _body = ssn.getBody();
        _body.addAll(stmts);
        _xblockexpression = ast;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Initialize Phase 2", type = "subroutine")
  public static class InitP2 extends EntryPointCodeConcept<NUOPCModel.Initialization> {
    public InitP2(final NUOPCModel.Initialization parent) {
      super(parent, "IPDv00p2");
    }
    
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent;
    }
    
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent.setServices;
    }
  }
  
  public String modelName;
  
  public String filename;
  
  public String path;
  
  @Label(label = "ESMF Import", type = "uses")
  @Child
  public BasicCodeConcept importESMF;
  
  @Label(label = "NUOPC Import", type = "uses")
  @Child
  public BasicCodeConcept importNUOPC;
  
  @Label(label = "NUOPC Model Import", type = "uses")
  @Child
  public BasicCodeConcept importNUOPCModel;
  
  @Child
  public SetServicesCodeConcept<NUOPCModel> setServices;
  
  @Child
  public NUOPCModel.Initialization initialization;
  
  public NUOPCModel(final CodeDBIndex codeDB) {
    super(null);
    this._codeDB = codeDB;
  }
  
  public CodeConcept<CodeConcept<?, ?>, ASTModuleNode> reverse() {
    Object _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module(_moduleID, _compUnitID, _driverName), ");
      _builder.newLine();
      _builder.append("\t\t            ");
      _builder.append("compilationUnit(_compUnitID, _filename, _path),");
      _builder.newLine();
      _builder.append("   \t\t\t\t\t");
      _builder.append("uses(_uid, _mid, \'NUOPC_Model\').");
      ResultSet rs = this.execQuery(_builder);
      try {
        boolean _next = rs.next();
        if (_next) {
          long _long = rs.getLong("_moduleID");
          this._id = _long;
          String _string = rs.getString("_driverName");
          this.modelName = _string;
          String _string_1 = rs.getString("_filename");
          this.filename = _string_1;
          String _string_2 = rs.getString("_path");
          this.path = _string_2;
          long _long_1 = rs.getLong("_uid");
          BasicCodeConcept _newBasicCodeConcept = BasicCodeConcept.newBasicCodeConcept(this, _long_1);
          this.importNUOPCModel = _newBasicCodeConcept;
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
    return ((CodeConcept<CodeConcept<?, ?>, ASTModuleNode>)_xblockexpression);
  }
  
  public NUOPCModel reverseChildren() {
    NUOPCModel _xblockexpression = null;
    {
      SetServicesCodeConcept<NUOPCModel> _setServicesCodeConcept = new SetServicesCodeConcept<NUOPCModel>(this);
      SetServicesCodeConcept<NUOPCModel> _reverse = _setServicesCodeConcept.reverse();
      this.setServices = _reverse;
      NUOPCModel.Initialization _initialization = new NUOPCModel.Initialization(this);
      NUOPCModel.Initialization _reverse_1 = _initialization.reverse();
      this.initialization = _reverse_1;
      _xblockexpression = this;
    }
    return _xblockexpression;
  }
  
  public String name() {
    return (((this.modelName + " (") + this.filename) + ")");
  }
}
