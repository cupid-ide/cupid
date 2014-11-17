package org.earthsystemmodeling.cupid.nuopc_v7;

import com.google.common.base.Objects;
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
import org.earthsystemmodeling.cupid.nuopc_v7.SetServicesCodeConcept;
import org.earthsystemmodeling.cupid.nuopc_v7.SpecializationMethodCodeConcept;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@Label(label = "NUOPC Driver", type = "module")
@SuppressWarnings("all")
public class NUOPCDriver extends CodeConcept<CodeConcept<?, ?>, ASTModuleNode> {
  @Label(label = "Initialize")
  public static class Initialization extends CodeConcept<NUOPCDriver, ASTNode> {
    @Child
    public NUOPCDriver.SetModelServices setModelServices;
    
    @Child
    public NUOPCDriver.SetModelCount setModelCount;
    
    @Child(min = 0)
    public NUOPCDriver.SetModelPetLists setModelPetLists;
    
    @Child(min = 0)
    public NUOPCDriver.SetRunSequence setRunSequence;
    
    @Child(min = 0)
    public NUOPCDriver.ModifyInitializePhaseMap modifyInitializePhaseMap;
    
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
        SpecializationMethodCodeConcept<NUOPCDriver.Initialization> _reverse = _setModelServices.reverse();
        this.setModelServices = ((NUOPCDriver.SetModelServices) _reverse);
        NUOPCDriver.SetModelCount _setModelCount = new NUOPCDriver.SetModelCount(this);
        SpecializationMethodCodeConcept<NUOPCDriver.Initialization> _reverse_1 = _setModelCount.reverse();
        this.setModelCount = ((NUOPCDriver.SetModelCount) _reverse_1);
        NUOPCDriver.SetModelPetLists _setModelPetLists = new NUOPCDriver.SetModelPetLists(this);
        SpecializationMethodCodeConcept<NUOPCDriver.Initialization> _reverse_2 = _setModelPetLists.reverse();
        this.setModelPetLists = ((NUOPCDriver.SetModelPetLists) _reverse_2);
        NUOPCDriver.SetRunSequence _setRunSequence = new NUOPCDriver.SetRunSequence(this);
        SpecializationMethodCodeConcept<NUOPCDriver.Initialization> _reverse_3 = _setRunSequence.reverse();
        this.setRunSequence = ((NUOPCDriver.SetRunSequence) _reverse_3);
        NUOPCDriver.ModifyInitializePhaseMap _modifyInitializePhaseMap = new NUOPCDriver.ModifyInitializePhaseMap(this);
        SpecializationMethodCodeConcept<NUOPCDriver.Initialization> _reverse_4 = _modifyInitializePhaseMap.reverse();
        this.modifyInitializePhaseMap = ((NUOPCDriver.ModifyInitializePhaseMap) _reverse_4);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    public IFortranAST forward() {
      throw new UnsupportedOperationException("TODO: auto-generated method stub");
    }
  }
  
  @Label(label = "SetModelCount", type = "subroutine")
  public static class SetModelCount extends SpecializationMethodCodeConcept<NUOPCDriver.Initialization> {
    public SetModelCount(final NUOPCDriver.Initialization parent) {
      super(parent, "NUOPC_Driver", "label_SetModelCount");
      this.subroutineName = "SetModelCount";
      this.specLabel = "driver_label_SetModelCount";
      this.paramGridComp = "driver";
      this.paramRC = "rc";
    }
    
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
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
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! set the modelCount ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call NUOPC_DriverSet(driver, modelCount=1, rc=rc)");
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
    
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent;
    }
    
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent.setServices;
    }
    
    public BasicCodeConcept genericUse() {
      return this._parent._parent.importNUOPCDriver;
    }
  }
  
  @Label(label = "SetModelServices", type = "subroutine")
  public static class SetModelServices extends SpecializationMethodCodeConcept<NUOPCDriver.Initialization> {
    @Child(max = (-1))
    public List<NUOPCDriver.SetModelServices_AddComp> addComps;
    
    @Label(label = "SetClock", type = "call")
    @Child
    public BasicCodeConcept setClock;
    
    public SetModelServices(final NUOPCDriver.Initialization parent) {
      super(parent, "NUOPC_Driver", "label_SetModelServices");
      this.subroutineName = "SetModelServices";
      this.specLabel = "driver_label_SetModelServices";
    }
    
    public SpecializationMethodCodeConcept<NUOPCDriver.Initialization> reverse() {
      try {
        NUOPCDriver.SetModelServices _xifexpression = null;
        SpecializationMethodCodeConcept<NUOPCDriver.Initialization> _reverse = super.reverse();
        boolean _equals = Objects.equal(this, _reverse);
        if (_equals) {
          NUOPCDriver.SetModelServices _xblockexpression = null;
          {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("call_(_cid, ");
            _builder.append(this._id, "");
            _builder.append(", \'ESMF_GridCompSet\'),");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t\t\t");
            _builder.append("callArgWithType(_, _cid, _, \'clock\', _, _clockExpr).");
            ResultSet rs = this.execQuery(_builder);
            boolean _next = rs.next();
            if (_next) {
              long _long = rs.getLong("_cid");
              BasicCodeConcept _newBasicCodeConcept = BasicCodeConcept.newBasicCodeConcept(this, _long);
              this.setClock = _newBasicCodeConcept;
            }
            _xblockexpression = this;
          }
          _xifexpression = _xblockexpression;
        } else {
          _xifexpression = null;
        }
        return _xifexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    public SpecializationMethodCodeConcept<NUOPCDriver.Initialization> reverseChildren() {
      NUOPCDriver.SetModelServices _xblockexpression = null;
      {
        NUOPCDriver.SetModelServices_AddComp _setModelServices_AddComp = new NUOPCDriver.SetModelServices_AddComp(this);
        List _reverseMultiple = _setModelServices_AddComp.reverseMultiple();
        this.addComps = ((List<NUOPCDriver.SetModelServices_AddComp>) _reverseMultiple);
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
    
    public BasicCodeConcept genericUse() {
      return this._parent._parent.importNUOPCDriver;
    }
    
    public IFortranAST forward() {
      IFortranAST _xblockexpression = null;
      {
        final IFortranAST ast = super.forward();
        final ASTSubroutineSubprogramNode ssn = this.getASTRef();
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("type(ESMF_Time)            :: startTime");
        _builder.newLine();
        _builder.append("type(ESMF_Time)            :: stopTime");
        _builder.newLine();
        _builder.append("type(ESMF_TimeInterval)    :: timeStep");
        _builder.newLine();
        _builder.append("type(ESMF_Clock)           :: internalClock");
        _builder.newLine();
        _builder.newLine();
        String code = _builder.toString();
        final IASTListNode<IBodyConstruct> typeNodes = CodeExtraction.parseLiteralStatementSequence(code);
        final ASTTypeDeclarationStmtNode last = ssn.<ASTTypeDeclarationStmtNode>findLast(ASTTypeDeclarationStmtNode.class);
        boolean _notEquals = (!Objects.equal(last, null));
        if (_notEquals) {
          List<IBodyConstruct> _reverse = ListExtensions.<IBodyConstruct>reverse(typeNodes);
          for (final IBodyConstruct typeNode : _reverse) {
            IASTListNode<IBodyConstruct> _body = ssn.getBody();
            _body.insertAfter(last, typeNode);
          }
        } else {
          IASTListNode<IBodyConstruct> _body_1 = ssn.getBody();
          _body_1.addAll(typeNodes);
        }
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("! set the model clock");
        _builder_1.newLine();
        _builder_1.append("call ESMF_TimeIntervalSet(timeStep, m=");
        CharSequence _paramint = this.paramint(15);
        _builder_1.append(_paramint, "");
        _builder_1.append(", rc=");
        _builder_1.append(this.paramRC, "");
        _builder_1.append(") ! 15 minute steps");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("if (ESMF_LogFoundError(rcToCheck=");
        _builder_1.append(this.paramRC, "");
        _builder_1.append(", msg=ESMF_LOGERR_PASSTHRU, &");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("  ");
        _builder_1.append("line=__LINE__, &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("file=__FILE__)) &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("call ESMF_Finalize(endflag=ESMF_END_ABORT)");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("call ESMF_TimeSet(startTime, yy=");
        CharSequence _paramint_1 = this.paramint(2010);
        _builder_1.append(_paramint_1, "");
        _builder_1.append(", mm=");
        CharSequence _paramint_2 = this.paramint(6);
        _builder_1.append(_paramint_2, "");
        _builder_1.append(", dd=");
        CharSequence _paramint_3 = this.paramint(1);
        _builder_1.append(_paramint_3, "");
        _builder_1.append(", h=");
        CharSequence _paramint_4 = this.paramint(0);
        _builder_1.append(_paramint_4, "");
        _builder_1.append(", m=");
        CharSequence _paramint_5 = this.paramint(0);
        _builder_1.append(_paramint_5, "");
        _builder_1.append(", rc=");
        _builder_1.append(this.paramRC, "");
        _builder_1.append(")");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("if (ESMF_LogFoundError(rcToCheck=");
        _builder_1.append(this.paramRC, "");
        _builder_1.append(", msg=ESMF_LOGERR_PASSTHRU, &");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("  ");
        _builder_1.append("line=__LINE__, &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("file=__FILE__)) &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("call ESMF_Finalize(endflag=ESMF_END_ABORT)");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("call ESMF_TimeSet(stopTime, yy=");
        CharSequence _paramint_6 = this.paramint(2010);
        _builder_1.append(_paramint_6, "");
        _builder_1.append(", mm=");
        CharSequence _paramint_7 = this.paramint(6);
        _builder_1.append(_paramint_7, "");
        _builder_1.append(", dd=");
        CharSequence _paramint_8 = this.paramint(1);
        _builder_1.append(_paramint_8, "");
        _builder_1.append(", h=");
        CharSequence _paramint_9 = this.paramint(1);
        _builder_1.append(_paramint_9, "");
        _builder_1.append(", m=");
        CharSequence _paramint_10 = this.paramint(0);
        _builder_1.append(_paramint_10, "");
        _builder_1.append(", rc=");
        _builder_1.append(this.paramRC, "");
        _builder_1.append(")");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("if (ESMF_LogFoundError(rcToCheck=");
        _builder_1.append(this.paramRC, "");
        _builder_1.append(", msg=ESMF_LOGERR_PASSTHRU, &");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("  ");
        _builder_1.append("line=__LINE__, &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("file=__FILE__)) &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("call ESMF_Finalize(endflag=ESMF_END_ABORT)");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("internalClock = ESMF_ClockCreate(name=\"");
        CharSequence _paramch = this.paramch("AppClock");
        _builder_1.append(_paramch, "");
        _builder_1.append("\", &");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("  ");
        _builder_1.append("timeStep=timeStep, startTime=startTime, stopTime=stopTime, rc=");
        _builder_1.append(this.paramRC, "  ");
        _builder_1.append(")");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("line=__LINE__, &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("file=__FILE__)) &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("call ESMF_Finalize(endflag=ESMF_END_ABORT)");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.newLine();
        _builder_1.append("call ESMF_GridCompSet(");
        _builder_1.append(this.paramGridComp, "");
        _builder_1.append(", clock=internalClock, rc=");
        _builder_1.append(this.paramRC, "");
        _builder_1.append(")");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("if (ESMF_LogFoundError(rcToCheck=");
        _builder_1.append(this.paramRC, "");
        _builder_1.append(", msg=ESMF_LOGERR_PASSTHRU, &");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("  ");
        _builder_1.append("line=__LINE__, &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("file=__FILE__)) &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("return  ! bail out");
        _builder_1.newLine();
        code = _builder_1.toString();
        final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
        IASTListNode<IBodyConstruct> _body_2 = ssn.getBody();
        _body_2.addAll(stmts);
        _xblockexpression = ast;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Add Component", type = "call")
  public static class SetModelServices_AddComp extends CodeConcept<NUOPCDriver.SetModelServices, ASTCallStmtNode> {
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
    
    public List reverseMultiple() {
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
      IFortranAST _xblockexpression = null;
      {
        IFortranAST ast = this.getAST();
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("call NUOPC_DriverAddComp(");
        _builder.append(this._parent.paramGridComp, "");
        _builder.append(", \"");
        CharSequence _paramch = this.paramch("ComponentName");
        _builder.append(_paramch, "");
        _builder.append("\", ");
        CharSequence _paramch_1 = this.paramch("CompSetServices");
        _builder.append(_paramch_1, "");
        _builder.append(", comp=child, rc=");
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
        IBodyConstruct _get = stmts.get(0);
        this.setASTRef(((ASTCallStmtNode) _get));
        _xblockexpression = ast;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "SetRunSequence", type = "subroutine")
  public static class SetRunSequence extends SpecializationMethodCodeConcept<NUOPCDriver.Initialization> {
    public SetRunSequence(final NUOPCDriver.Initialization parent) {
      super(parent, "NUOPC_Driver", "label_SetRunSequence");
      this.subroutineName = "SetRunSequence";
      this.specLabel = "driver_label_SetRunSequence";
    }
    
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent;
    }
    
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent.setServices;
    }
    
    public BasicCodeConcept genericUse() {
      return this._parent._parent.importNUOPCDriver;
    }
  }
  
  @Label(label = "ModifyInitializePhaseMap", type = "subroutine")
  public static class ModifyInitializePhaseMap extends SpecializationMethodCodeConcept<NUOPCDriver.Initialization> {
    public ModifyInitializePhaseMap(final NUOPCDriver.Initialization parent) {
      super(parent, "NUOPC_Driver", "label_ModifyInitializePhaseMap");
      this.subroutineName = "ModifyInitializePhaseMap";
      this.specLabel = "driver_label_ModifyInitializePhaseMap";
    }
    
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent;
    }
    
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent.setServices;
    }
    
    public BasicCodeConcept genericUse() {
      return this._parent._parent.importNUOPCDriver;
    }
  }
  
  @Label(label = "SetModelPetLists", type = "subroutine")
  public static class SetModelPetLists extends SpecializationMethodCodeConcept<NUOPCDriver.Initialization> {
    public SetModelPetLists(final NUOPCDriver.Initialization parent) {
      super(parent, "NUOPC_Driver", "label_SetModelPetLists");
      this.subroutineName = "SetModelPetLists";
      this.specLabel = "driver_label_SetModelPetLists";
    }
    
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent;
    }
    
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent.setServices;
    }
    
    public BasicCodeConcept genericUse() {
      return this._parent._parent.importNUOPCDriver;
    }
    
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
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! local variables");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("integer                       :: localrc");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("integer                       :: petCount, i");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("integer, allocatable          :: petList(:)");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rc = ESMF_SUCCESS");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! get the petCount");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call ESMF_GridCompGet(");
      _builder.append(this.paramGridComp, "    ");
      _builder.append(", petCount=petCount, rc=localrc)");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=localrc, msg=ESMF_LOGERR_PASSTHRU, &");
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
      _builder.append("! example of setting petList for a component");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("allocate(petList(petCount/2-1))");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("do i=1, petCount/2-1");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("petList(i) = i-1 ! PET labeling goes from 0 to petCount-1");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("enddo");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call NUOPC_DriverSetModel(");
      _builder.append(this.paramGridComp, "    ");
      _builder.append(", compIndex=1, petList=petList, rc=localrc)");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=localrc, msg=ESMF_LOGERR_PASSTHRU, &");
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
      _builder.append("deallocate(petList)");
      _builder.newLine();
      _builder.append("      ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! repeat as necessary for each component");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("end subroutine");
      _builder.newLine();
      _builder.newLine();
      return _builder.toString();
    }
  }
  
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
  @Child
  public BasicCodeConcept importNUOPCDriver;
  
  @Child
  public SetServicesCodeConcept<NUOPCDriver> setServices;
  
  @Child
  public NUOPCDriver.Initialization initialization;
  
  public NUOPCDriver(final CodeDBIndex codeDB) {
    super(null);
    this._codeDB = codeDB;
  }
  
  public IFortranAST forward() {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
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
    return ((CodeConcept<CodeConcept<?, ?>, ASTModuleNode>)_xblockexpression);
  }
  
  public NUOPCDriver reverseChildren() {
    NUOPCDriver _xblockexpression = null;
    {
      SetServicesCodeConcept<NUOPCDriver> _setServicesCodeConcept = new SetServicesCodeConcept<NUOPCDriver>(this);
      SetServicesCodeConcept<NUOPCDriver> _reverse = _setServicesCodeConcept.reverse();
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
  
  public String name() {
    return (((this.driverName + " (") + this.filename) + ")");
  }
}
