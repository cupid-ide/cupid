package org.earthsystemmodeling.cupid.nuopc.v7bs50;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.EntryPointCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.NUOPCComponent;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.SetServicesCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.SpecializationMethodCodeConcept;
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
public class NUOPCModel extends NUOPCComponent {
  @Label(label = "Initialize Phase Definition (v00)")
  public static class IPDv00 extends CodeConcept<NUOPCModel, ASTNode> {
    @Child
    public NUOPCModel.IPDv00p1 ipdv00p1;
    
    @Child
    public NUOPCModel.IPDv00p2 ipdv00p2;
    
    @Child
    public NUOPCModel.IPDv00p3 ipdv00p3;
    
    @Child
    public NUOPCModel.IPDv00p4 ipdv00p4;
    
    public IPDv00(final NUOPCModel parent) {
      super(parent);
    }
    
    @Override
    public NUOPCModel.IPDv00 reverse() {
      NUOPCModel.IPDv00 _xblockexpression = null;
      {
        NUOPCModel.IPDv00p1 _iPDv00p1 = new NUOPCModel.IPDv00p1(this);
        CodeConcept<NUOPCModel.IPDv00, ASTSubroutineSubprogramNode> _reverse = _iPDv00p1.reverse();
        this.ipdv00p1 = ((NUOPCModel.IPDv00p1) _reverse);
        NUOPCModel.IPDv00p2 _iPDv00p2 = new NUOPCModel.IPDv00p2(this);
        CodeConcept<NUOPCModel.IPDv00, ASTSubroutineSubprogramNode> _reverse_1 = _iPDv00p2.reverse();
        this.ipdv00p2 = ((NUOPCModel.IPDv00p2) _reverse_1);
        NUOPCModel.IPDv00p3 _iPDv00p3 = new NUOPCModel.IPDv00p3(this);
        CodeConcept<NUOPCModel.IPDv00, ASTNode> _reverse_2 = _iPDv00p3.reverse();
        this.ipdv00p3 = ((NUOPCModel.IPDv00p3) _reverse_2);
        NUOPCModel.IPDv00p4 _iPDv00p4 = new NUOPCModel.IPDv00p4(this);
        CodeConcept<NUOPCModel.IPDv00, ASTNode> _reverse_3 = _iPDv00p4.reverse();
        this.ipdv00p4 = ((NUOPCModel.IPDv00p4) _reverse_3);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "IPDv00p1 - Advertise", type = "subroutine")
  public static class IPDv00p1 extends EntryPointCodeConcept<NUOPCModel.IPDv00> {
    public IPDv00p1(final NUOPCModel.IPDv00 parent) {
      super(parent, "IPDv00p1");
      this.subroutineName = "AdvertiseFields";
      this.methodType = "ESMF_METHOD_INITIALIZE";
    }
    
    @Override
    public EntryPointCodeConcept<NUOPCModel.IPDv00> reverseChildren() {
      return this;
    }
    
    @Override
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent;
    }
    
    @Override
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent.setServices;
    }
  }
  
  @Label(label = "IPDv00p2 - Realize", type = "subroutine")
  public static class IPDv00p2 extends EntryPointCodeConcept<NUOPCModel.IPDv00> {
    public IPDv00p2(final NUOPCModel.IPDv00 parent) {
      super(parent, "IPDv00p2");
      this.subroutineName = "RealizeFields";
      this.methodType = "ESMF_METHOD_INITIALIZE";
    }
    
    @Override
    public EntryPointCodeConcept<NUOPCModel.IPDv00> reverseChildren() {
      return this;
    }
    
    @Override
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent;
    }
    
    @Override
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent.setServices;
    }
  }
  
  @Label(label = "IPDv00p3 - Set Clock / Verify Connected", type = "subroutine-inherited")
  public static class IPDv00p3 extends CodeConcept<NUOPCModel.IPDv00, ASTNode> {
    public IPDv00p3(final NUOPCModel.IPDv00 parent) {
      super(parent);
    }
  }
  
  @Label(label = "IPDv00p4 - Data Initialize", type = "subroutine-inherited")
  public static class IPDv00p4 extends CodeConcept<NUOPCModel.IPDv00, ASTNode> {
    public IPDv00p4(final NUOPCModel.IPDv00 parent) {
      super(parent);
    }
  }
  
  @Label(label = "Initialize")
  public static class Initialization extends CodeConcept<NUOPCModel, ASTNode> {
    @Child
    public NUOPCModel.InitP1 initP1;
    
    @Child
    public NUOPCModel.InitP2 initP2;
    
    @Child(min = 0)
    public NUOPCModel.SetClock setClock;
    
    @Child(min = 0)
    public NUOPCModel.DataInitialize dataInitialize;
    
    public Initialization(final NUOPCModel parent) {
      super(parent);
    }
    
    @Override
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
        NUOPCModel.SetClock _setClock = new NUOPCModel.SetClock(this);
        SpecializationMethodCodeConcept<NUOPCModel.Initialization> _reverse_2 = _setClock.reverse();
        this.setClock = ((NUOPCModel.SetClock) _reverse_2);
        NUOPCModel.DataInitialize _dataInitialize = new NUOPCModel.DataInitialize(this);
        SpecializationMethodCodeConcept<NUOPCModel.Initialization> _reverse_3 = _dataInitialize.reverse();
        this.dataInitialize = ((NUOPCModel.DataInitialize) _reverse_3);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Initialize Phase 1", type = "subroutine")
  public static class InitP1 extends EntryPointCodeConcept<NUOPCModel.Initialization> {
    @Child(min = 0, max = (-1))
    public List<NUOPCModel.InitP1_AdvertiseField> advertiseFields;
    
    public InitP1(final NUOPCModel.Initialization parent) {
      super(parent, "IPDv00p1");
      this.subroutineName = "InitializeP1";
      this.methodType = "ESMF_METHOD_INITIALIZE";
    }
    
    @Override
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
    
    @Override
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent;
    }
    
    @Override
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent.setServices;
    }
    
    @Override
    public IFortranAST forward() {
      IFortranAST _xblockexpression = null;
      {
        IFortranAST ast = super.forward();
        NUOPCModel.InitP1_AdvertiseField _initP1_AdvertiseField = new NUOPCModel.InitP1_AdvertiseField(this);
        IFortranAST _forward = _initP1_AdvertiseField.forward();
        ast = _forward;
        _xblockexpression = ast;
      }
      return _xblockexpression;
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
    
    @Override
    public String name() {
      return ((this.state + " / ") + this.standardName);
    }
    
    @Override
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
    
    @Override
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
    @Child(min = 0, max = (-1))
    public List<NUOPCModel.InitP2_RealizeField> realizeFields;
    
    public InitP2(final NUOPCModel.Initialization parent) {
      super(parent, "IPDv00p2");
      this.subroutineName = "InitializeP2";
      this.methodType = "ESMF_METHOD_INITIALIZE";
    }
    
    @Override
    public EntryPointCodeConcept<NUOPCModel.Initialization> reverseChildren() {
      NUOPCModel.InitP2 _xblockexpression = null;
      {
        NUOPCModel.InitP2_RealizeField _initP2_RealizeField = new NUOPCModel.InitP2_RealizeField(this);
        List _reverseMultiple = _initP2_RealizeField.reverseMultiple();
        this.realizeFields = _reverseMultiple;
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    @Override
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent;
    }
    
    @Override
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent.setServices;
    }
  }
  
  @Label(label = "Realize Field", type = "call")
  public static class InitP2_RealizeField extends CodeConcept<NUOPCModel.InitP2, ASTCallStmtNode> {
    public String state;
    
    public String field;
    
    public InitP2_RealizeField(final NUOPCModel.InitP2 parent) {
      super(parent);
      this.state = this._parent.paramImport;
      this.field = "field";
    }
    
    @Override
    public String name() {
      return ((this.state + " / ") + this.field);
    }
    
    @Override
    public List reverseMultiple() {
      try {
        ArrayList<NUOPCModel.InitP2_RealizeField> _xblockexpression = null;
        {
          ArrayList<NUOPCModel.InitP2_RealizeField> retList = CollectionLiterals.<NUOPCModel.InitP2_RealizeField>newArrayList();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("call_(_cid, ");
          long _parentID = this.parentID();
          _builder.append(_parentID, "");
          _builder.append(", \'NUOPC_StateRealizeField\'),");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t\t");
          _builder.append("callArgWithType(_, _cid, 1, _, _, _stateExpr),");
          _builder.newLine();
          _builder.append("\t\t\t\t\t\t");
          _builder.append("callArgWithType(_, _cid, 2, _, _, _fieldExpr).");
          ResultSet rs = this.execQuery(_builder);
          while (rs.next()) {
            {
              NUOPCModel.InitP2_RealizeField relField = new NUOPCModel.InitP2_RealizeField(this._parent);
              long _long = rs.getLong("_cid");
              relField._id = _long;
              String _string = rs.getString("_stateExpr");
              relField.state = _string;
              String _string_1 = rs.getString("_fieldExpr");
              relField.field = _string_1;
              retList.add(relField);
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
    
    @Override
    public IFortranAST forward() {
      IFortranAST _xblockexpression = null;
      {
        IFortranAST ast = this.getAST();
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("call NUOPC_StateRealizeField(");
        CharSequence _paramch = this.paramch(this.state);
        _builder.append(_paramch, "");
        _builder.append(", field=");
        CharSequence _paramch_1 = this.paramch(this.field);
        _builder.append(_paramch_1, "");
        _builder.append(", rc=");
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
  
  @Label(label = "SetClock", type = "subroutine")
  public static class SetClock extends SpecializationMethodCodeConcept<NUOPCModel.Initialization> {
    public SetClock(final NUOPCModel.Initialization parent) {
      super(parent, "NUOPC_Model", "label_SetClock");
      this.subroutineName = "SetClock";
      this.specLabel = "model_label_SetClock";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName, "");
      _builder.append("(");
      _builder.append(this.paramGridComp, "");
      _builder.append(", ");
      _builder.append(this.paramRC, "");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("type(ESMF_GridComp)  :: ");
      _builder.append(this.paramGridComp, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("integer, intent(out) :: ");
      _builder.append(this.paramRC, "    ");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! local variables");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("type(ESMF_Clock)              :: clock");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("type(ESMF_TimeInterval)       :: stabilityTimeStep");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rc = ESMF_SUCCESS");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! query the Component for its clock, importState and exportState");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call ESMF_GridCompGet(gcomp, clock=clock, rc=rc)");
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
      _builder.append("      ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! initialize internal clock");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! here: parent Clock and stability timeStep determine actual model timeStep");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call ESMF_TimeIntervalSet(stabilityTimeStep, m=");
      CharSequence _paramint = this.paramint(5);
      _builder.append(_paramint, "    ");
      _builder.append(", rc=rc)");
      _builder.newLineIfNotEmpty();
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
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call NUOPC_CompSetClock(gcomp, clock, stabilityTimeStep, rc=rc)");
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
      _builder.append("end subroutine");
      _builder.newLine();
      return _builder.toString();
    }
    
    @Override
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent;
    }
    
    @Override
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent.setServices;
    }
    
    @Override
    public NUOPCComponent.GenericImport genericUse() {
      return this._parent._parent.importNUOPCGeneric;
    }
  }
  
  @Label(label = "DataInitialize", type = "subroutine")
  public static class DataInitialize extends SpecializationMethodCodeConcept<NUOPCModel.Initialization> {
    public DataInitialize(final NUOPCModel.Initialization parent) {
      super(parent, "NUOPC_Model", "label_DataInitialize");
      this.subroutineName = "DataInitialize";
      this.specLabel = "model_label_DataInitialize";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName, "");
      _builder.append("(");
      _builder.append(this.paramGridComp, "");
      _builder.append(", ");
      _builder.append(this.paramRC, "");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("type(ESMF_GridComp)  :: ");
      _builder.append(this.paramGridComp, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("integer, intent(out) :: ");
      _builder.append(this.paramRC, "    ");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rc = ESMF_SUCCESS");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! initialize export fields");
      _builder.newLine();
      _builder.newLine();
      _builder.append("end subroutine");
      _builder.newLine();
      return _builder.toString();
    }
    
    @Override
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent;
    }
    
    @Override
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent.setServices;
    }
    
    @Override
    public NUOPCComponent.GenericImport genericUse() {
      return this._parent._parent.importNUOPCGeneric;
    }
  }
  
  @Label(label = "Run")
  public static class Run extends CodeConcept<NUOPCModel, ASTNode> {
    @Child(min = 0)
    public NUOPCModel.SetRunClock setRunClock;
    
    @Child(min = 0)
    public NUOPCModel.CheckImport checkImport;
    
    @Child
    public NUOPCModel.ModelAdvance modelAdvance;
    
    public Run(final NUOPCModel parent) {
      super(parent);
    }
    
    @Override
    public NUOPCModel.Run reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCModel.Run reverseChildren() {
      NUOPCModel.Run _xblockexpression = null;
      {
        NUOPCModel.ModelAdvance _modelAdvance = new NUOPCModel.ModelAdvance(this);
        SpecializationMethodCodeConcept<NUOPCModel.Run> _reverse = _modelAdvance.reverse();
        this.modelAdvance = ((NUOPCModel.ModelAdvance) _reverse);
        NUOPCModel.SetRunClock _setRunClock = new NUOPCModel.SetRunClock(this);
        SpecializationMethodCodeConcept<NUOPCModel.Run> _reverse_1 = _setRunClock.reverse();
        this.setRunClock = ((NUOPCModel.SetRunClock) _reverse_1);
        NUOPCModel.CheckImport _checkImport = new NUOPCModel.CheckImport(this);
        SpecializationMethodCodeConcept<NUOPCModel.Run> _reverse_2 = _checkImport.reverse();
        this.checkImport = ((NUOPCModel.CheckImport) _reverse_2);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "ModelAdvance", type = "subroutine")
  public static class ModelAdvance extends SpecializationMethodCodeConcept<NUOPCModel.Run> {
    public ModelAdvance(final NUOPCModel.Run parent) {
      super(parent, "NUOPC_Model", "label_Advance");
      this.subroutineName = "ModelAdvance";
      this.specLabel = "model_label_Advance";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName, "");
      _builder.append("(");
      _builder.append(this.paramGridComp, "");
      _builder.append(", ");
      _builder.append(this.paramRC, "");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("type(ESMF_GridComp)  :: ");
      _builder.append(this.paramGridComp, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("integer, intent(out) :: ");
      _builder.append(this.paramRC, "    ");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("     ");
      _builder.append("! local variables");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("type(ESMF_Clock)              :: clock");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("type(ESMF_State)              :: importState, exportState");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("type(ESMF_Time)               :: currTime");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("type(ESMF_TimeInterval)       :: timeStep");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rc = ESMF_SUCCESS");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! query the Component for its clock, importState and exportState");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call ESMF_GridCompGet(");
      _builder.append(this.paramGridComp, "    ");
      _builder.append(", clock=clock, importState=importState, &");
      _builder.newLineIfNotEmpty();
      _builder.append("        ");
      _builder.append("exportState=exportState, rc=");
      _builder.append(this.paramRC, "        ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=");
      _builder.append(this.paramRC, "    ");
      _builder.append(", msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLineIfNotEmpty();
      _builder.append("        ");
      _builder.append("line=__LINE__, &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("file=__FILE__)) &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("return  ! bail out");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! advance the model: currTime -> currTime + timeStep");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call NUOPC_ClockPrintCurrTime(clock, &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("\"------>Advancing ");
      _builder.append(this._parent._parent.modelName, "        ");
      _builder.append(" from: \", rc=");
      _builder.append(this.paramRC, "        ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("line=__LINE__, &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("file=__FILE__)) &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("return  ! bail out");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call ESMF_ClockGet(clock, currTime=currTime, timeStep=timeStep, rc=");
      _builder.append(this.paramRC, "    ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=");
      _builder.append(this.paramRC, "    ");
      _builder.append(", msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLineIfNotEmpty();
      _builder.append("        ");
      _builder.append("line=__LINE__, &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("file=__FILE__)) &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("return  ! bail out");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call NUOPC_TimePrint(currTime + timeStep, &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("\"--------------------------------> to: \", rc=");
      _builder.append(this.paramRC, "        ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("line=__LINE__, &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("file=__FILE__)) &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("return  ! bail out");
      _builder.newLine();
      _builder.newLine();
      _builder.append("end subroutine");
      _builder.newLine();
      return _builder.toString();
    }
    
    @Override
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent;
    }
    
    @Override
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent.setServices;
    }
    
    @Override
    public NUOPCComponent.GenericImport genericUse() {
      return this._parent._parent.importNUOPCGeneric;
    }
  }
  
  @Label(label = "SetRunClock", type = "subroutine")
  public static class SetRunClock extends SpecializationMethodCodeConcept<NUOPCModel.Run> {
    public SetRunClock(final NUOPCModel.Run parent) {
      super(parent, "NUOPC_Model", "label_SetRunClock");
      this.subroutineName = "SetRunClock";
      this.specLabel = "model_label_SetRunClock";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName, "");
      _builder.append("(");
      _builder.append(this.paramGridComp, "");
      _builder.append(", ");
      _builder.append(this.paramRC, "");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("type(ESMF_GridComp)  :: ");
      _builder.append(this.paramGridComp, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("integer, intent(out) :: ");
      _builder.append(this.paramRC, "    ");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! local variables");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("type(ESMF_Clock)              :: clock");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rc = ESMF_SUCCESS");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! query the component for its clock");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call ESMF_GridCompGet(gcomp, clock=clock, rc=");
      _builder.append(this.paramRC, "    ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
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
      _builder.append("      ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! set the component\'s clock ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call NUOPC_CompSetClock(gcomp, externalClock=clock, rc=");
      _builder.append(this.paramRC, "    ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
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
      _builder.append("end subroutine");
      _builder.newLine();
      return _builder.toString();
    }
    
    @Override
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent;
    }
    
    @Override
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent.setServices;
    }
    
    @Override
    public NUOPCComponent.GenericImport genericUse() {
      return this._parent._parent.importNUOPCGeneric;
    }
  }
  
  @Label(label = "CheckImport", type = "subroutine")
  public static class CheckImport extends SpecializationMethodCodeConcept<NUOPCModel.Run> {
    public CheckImport(final NUOPCModel.Run parent) {
      super(parent, "NUOPC_Model", "label_CheckImport");
      this.subroutineName = "CheckImport";
      this.specLabel = "model_label_CheckImport";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName, "");
      _builder.append("(");
      _builder.append(this.paramGridComp, "");
      _builder.append(", ");
      _builder.append(this.paramRC, "");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("type(ESMF_GridComp)  :: ");
      _builder.append(this.paramGridComp, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("integer, intent(out) :: ");
      _builder.append(this.paramRC, "    ");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rc = ESMF_SUCCESS");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! check fields in import state");
      _builder.newLine();
      _builder.newLine();
      _builder.append("end subroutine");
      _builder.newLine();
      return _builder.toString();
    }
    
    @Override
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent;
    }
    
    @Override
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent.setServices;
    }
    
    @Override
    public NUOPCComponent.GenericImport genericUse() {
      return this._parent._parent.importNUOPCGeneric;
    }
  }
  
  @Label(label = "Finalize")
  public static class Finalize extends CodeConcept<NUOPCModel, ASTNode> {
    @Child(min = 0)
    public NUOPCModel.FinalizeP1 finalizeP1;
    
    public Finalize(final NUOPCModel parent) {
      super(parent);
    }
    
    @Override
    public NUOPCModel.Finalize reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCModel.Finalize reverseChildren() {
      NUOPCModel.Finalize _xblockexpression = null;
      {
        NUOPCModel.FinalizeP1 _finalizeP1 = new NUOPCModel.FinalizeP1(this);
        CodeConcept<NUOPCModel.Finalize, ASTSubroutineSubprogramNode> _reverse = _finalizeP1.reverse();
        this.finalizeP1 = ((NUOPCModel.FinalizeP1) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Finalize Phase 1", type = "subroutine")
  public static class FinalizeP1 extends EntryPointCodeConcept<NUOPCModel.Finalize> {
    public FinalizeP1(final NUOPCModel.Finalize parent) {
      super(parent, "FinalizePhase1");
      this.methodType = "ESMF_METHOD_FINALIZE";
      this.subroutineName = "Finalize";
    }
    
    @Override
    public EntryPointCodeConcept<NUOPCModel.Finalize> reverseChildren() {
      return this;
    }
    
    @Override
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent;
    }
    
    @Override
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent.setServices;
    }
  }
  
  public String modelName;
  
  public String filename;
  
  public String path;
  
  @Child
  public SetServicesCodeConcept<NUOPCModel> setServices;
  
  @Child
  public NUOPCModel.IPDv00 ipdv00;
  
  @Child
  public NUOPCModel.Initialization initialization;
  
  @Child
  public NUOPCModel.Run run;
  
  @Child
  public NUOPCModel.Finalize finalize;
  
  public NUOPCModel(final CodeDBIndex codeDB) {
    super(null);
    this._codeDB = codeDB;
  }
  
  @Override
  public String prefix() {
    return "model";
  }
  
  @Override
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
          NUOPCComponent.GenericImport _genericImport = new NUOPCComponent.GenericImport(this, _long_1);
          NUOPCComponent.GenericImport _reverse = _genericImport.reverse();
          this.importNUOPCGeneric = _reverse;
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
            BasicCodeConcept _newBasicCodeConcept = BasicCodeConcept.newBasicCodeConcept(this, _long_2);
            this.importESMF = _newBasicCodeConcept;
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
            BasicCodeConcept _newBasicCodeConcept_1 = BasicCodeConcept.newBasicCodeConcept(this, _long_3);
            this.importNUOPC = _newBasicCodeConcept_1;
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
      NUOPCModel.IPDv00 _iPDv00 = new NUOPCModel.IPDv00(this);
      NUOPCModel.IPDv00 _reverse_1 = _iPDv00.reverse();
      this.ipdv00 = _reverse_1;
      NUOPCModel.Initialization _initialization = new NUOPCModel.Initialization(this);
      NUOPCModel.Initialization _reverse_2 = _initialization.reverse();
      this.initialization = _reverse_2;
      NUOPCModel.Run _run = new NUOPCModel.Run(this);
      NUOPCModel.Run _reverse_3 = _run.reverse();
      this.run = _reverse_3;
      NUOPCModel.Finalize _finalize = new NUOPCModel.Finalize(this);
      NUOPCModel.Finalize _reverse_4 = _finalize.reverse();
      this.finalize = _reverse_4;
      _xblockexpression = this;
    }
    return _xblockexpression;
  }
  
  @Override
  public String name() {
    return (((this.modelName + " (") + this.filename) + ")");
  }
}
