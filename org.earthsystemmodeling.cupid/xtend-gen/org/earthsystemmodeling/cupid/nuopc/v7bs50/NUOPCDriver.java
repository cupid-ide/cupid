package org.earthsystemmodeling.cupid.nuopc.v7bs50;

import com.google.common.base.Objects;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.annotation.Prop;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.NUOPCComponent;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.SetServicesCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.SpecializationMethodCodeConcept;
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

@Label(label = "NUOPC Driver")
@MappingType("module")
@SuppressWarnings("all")
public class NUOPCDriver extends NUOPCComponent {
  @Label(label = "Initialize")
  public static class Initialization extends CodeConcept<NUOPCDriver, ASTNode> {
    @Child
    public NUOPCDriver.SetModelServices setModelServices;
    
    @Child(min = 0)
    public NUOPCDriver.SetRunSequence setRunSequence;
    
    public Initialization(final NUOPCDriver parent) {
      super(parent);
    }
    
    @Override
    public NUOPCDriver.Initialization reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCDriver.Initialization reverseChildren() {
      NUOPCDriver.Initialization _xblockexpression = null;
      {
        NUOPCDriver.SetModelServices _setModelServices = new NUOPCDriver.SetModelServices(this);
        SpecializationMethodCodeConcept<NUOPCDriver.Initialization> _reverse = _setModelServices.reverse();
        this.setModelServices = ((NUOPCDriver.SetModelServices) _reverse);
        NUOPCDriver.SetRunSequence _setRunSequence = new NUOPCDriver.SetRunSequence(this);
        SpecializationMethodCodeConcept<NUOPCDriver.Initialization> _reverse_1 = _setRunSequence.reverse();
        this.setRunSequence = ((NUOPCDriver.SetRunSequence) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  /**
   * @Label(label="SetModelCount", type="subroutine")
   * public static class SetModelCount extends SpecializationMethodCodeConcept<Initialization> {
   * 
   * new(Initialization parent) {
   * super(parent, "NUOPC_Driver", "label_SetModelCount")
   * 
   * //defaults
   * subroutineName = "SetModelCount"
   * specLabel = "driver_label_SetModelCount"
   * paramGridComp = "driver"
   * paramRC = "rc"
   * }
   * 
   * override subroutineTemplate() {
   * '''
   * 
   * subroutine «subroutineName»(«paramGridComp», «paramRC»)
   * type(ESMF_GridComp)  :: «paramGridComp»
   * integer, intent(out) :: «paramRC»
   * 
   * rc = ESMF_SUCCESS
   * 
   * ! set the modelCount
   * call NUOPC_DriverSet(driver, modelCount=1, rc=rc)
   * if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
   * line=__LINE__, &
   * file=__FILE__)) &
   * return  ! bail out
   * 
   * end subroutine
   * '''
   * }
   * 
   * override module() {
   * _parent._parent
   * }
   * 
   * override setServices() {
   * _parent._parent.setServices
   * }
   * 
   * override genericUse() {
   * _parent._parent.importNUOPCGeneric
   * }
   * 
   * }
   */
  @Label(label = "SetModelServices")
  @MappingType("subroutine")
  public static class SetModelServices extends SpecializationMethodCodeConcept<NUOPCDriver.Initialization> {
    @Child(max = (-1))
    public List<NUOPCDriver.SetModelServices_AddComp> addComps;
    
    @Label(label = "SetClock")
    @MappingType("call")
    @Child
    public BasicCodeConcept setClock;
    
    public SetModelServices(final NUOPCDriver.Initialization parent) {
      super(parent, "NUOPC_Driver", "label_SetModelServices");
      this.subroutineName = "SetModelServices";
      this.specLabel = "driver_label_SetModelServices";
    }
    
    @Override
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
    
    @Override
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
    
    @Override
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
        _builder_1.newLine();
        _builder_1.append("! call into SetServices for all Model, Mediator, and Connector components");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.newLine();
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
  
  @Label(label = "Add Component")
  @MappingType("call")
  public static class SetModelServices_AddComp extends CodeConcept<NUOPCDriver.SetModelServices, ASTCallStmtNode> {
    public String compLabel;
    
    public String srcCompLabel;
    
    public String dstCompLabel;
    
    @Prop
    @Label(label = "Set Services")
    public String compSetServices;
    
    public SetModelServices_AddComp(final NUOPCDriver.SetModelServices parent) {
      super(parent);
    }
    
    @Override
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
    
    @Override
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
                String _string_3 = rs.getString("_arg3Expr");
                addComp.compSetServices = _string_3;
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
    
    @Override
    public IFortranAST forward() {
      IFortranAST _xblockexpression = null;
      {
        IFortranAST ast = this.getAST();
        ASTSubroutineSubprogramNode ssn = this._parent.getASTRef();
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("type(ESMF_GridComp)            :: child");
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
        _builder_1.newLine();
        _builder_1.append("call NUOPC_DriverAddComp(");
        _builder_1.append(this._parent.paramGridComp, "");
        _builder_1.append(", \"");
        CharSequence _paramch = this.paramch("ComponentName");
        _builder_1.append(_paramch, "");
        _builder_1.append("\", ");
        CharSequence _paramch_1 = this.paramch("CompSetServices");
        _builder_1.append(_paramch_1, "");
        _builder_1.append(", comp=child, rc=");
        _builder_1.append(this._parent.paramRC, "");
        _builder_1.append(")");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("if (ESMF_LogFoundError(rcToCheck=");
        _builder_1.append(this._parent.paramRC, "");
        _builder_1.append(", msg=ESMF_LOGERR_PASSTHRU, &");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("    ");
        _builder_1.append("line=__LINE__, &");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("file=__FILE__)) &");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("return  ! bail out");
        _builder_1.newLine();
        code = _builder_1.toString();
        final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
        IASTListNode<IBodyConstruct> _body_2 = ssn.getBody();
        _body_2.addAll(stmts);
        IBodyConstruct _get = stmts.get(0);
        this.setASTRef(((ASTCallStmtNode) _get));
        _xblockexpression = ast;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "SetRunSequence")
  @MappingType("subroutine")
  public static class SetRunSequence extends SpecializationMethodCodeConcept<NUOPCDriver.Initialization> {
    @Label(label = "New Run Sequence")
    @MappingType("call")
    @Child(forward = false)
    public BasicCodeConcept newRunSequence;
    
    @Child(max = (-1))
    public List<NUOPCDriver.SetRunSequence_AddRunElement> runElements;
    
    public SetRunSequence(final NUOPCDriver.Initialization parent) {
      super(parent, "NUOPC_Driver", "label_SetRunSequence");
      this.subroutineName = "SetRunSequence";
      this.specLabel = "driver_label_SetRunSequence";
    }
    
    @Override
    public SpecializationMethodCodeConcept<NUOPCDriver.Initialization> reverse() {
      try {
        NUOPCDriver.SetRunSequence _xifexpression = null;
        SpecializationMethodCodeConcept<NUOPCDriver.Initialization> _reverse = super.reverse();
        boolean _equals = Objects.equal(this, _reverse);
        if (_equals) {
          NUOPCDriver.SetRunSequence _xblockexpression = null;
          {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("call_(_cid, ");
            _builder.append(this._id, "");
            _builder.append(", \'NUOPC_DriverNewRunSequence\'),");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t\t\t");
            _builder.append("callArgWithType(_, _cid, _, \'slotCount\', _, _slotExpr).");
            ResultSet rs = this.execQuery(_builder);
            boolean _next = rs.next();
            if (_next) {
              long _long = rs.getLong("_cid");
              BasicCodeConcept _newBasicCodeConcept = BasicCodeConcept.newBasicCodeConcept(this, _long);
              this.newRunSequence = _newBasicCodeConcept;
            }
            NUOPCDriver.SetRunSequence_AddRunElement _setRunSequence_AddRunElement = new NUOPCDriver.SetRunSequence_AddRunElement(this);
            List _reverseMultiple = _setRunSequence_AddRunElement.reverseMultiple();
            this.runElements = ((List<NUOPCDriver.SetRunSequence_AddRunElement>) _reverseMultiple);
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
      _builder.append("! Replace the default RunSequence with a customized one");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call NUOPC_DriverNewRunSequence(");
      _builder.append(this.paramGridComp, "    ");
      _builder.append(", slotCount=");
      CharSequence _paramint = this.paramint(1);
      _builder.append(_paramint, "    ");
      _builder.append(", rc=");
      _builder.append(this.paramRC, "    ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=");
      _builder.append(this.paramRC, "    ");
      _builder.append(", msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLineIfNotEmpty();
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
  
  @Label(label = "Add Run Element")
  @MappingType("call")
  public static class SetRunSequence_AddRunElement extends CodeConcept<NUOPCDriver.SetRunSequence, ASTCallStmtNode> {
    @Label(label = "slot")
    @Prop
    public String slot;
    
    public String compLabel;
    
    public String srcCompLabel;
    
    public String dstCompLabel;
    
    @Override
    public String name() {
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(this.compLabel, null));
      if (_notEquals) {
        _xifexpression = (((this.compLabel + "(slot=") + this.slot) + ")");
      } else {
        _xifexpression = (((((this.srcCompLabel + " => ") + this.dstCompLabel) + "(slot=") + this.slot) + ")");
      }
      return _xifexpression;
    }
    
    public SetRunSequence_AddRunElement(final NUOPCDriver.SetRunSequence parent) {
      super(parent);
    }
    
    @Override
    public List reverseMultiple() {
      try {
        ArrayList<NUOPCDriver.SetRunSequence_AddRunElement> _xblockexpression = null;
        {
          ArrayList<NUOPCDriver.SetRunSequence_AddRunElement> retList = CollectionLiterals.<NUOPCDriver.SetRunSequence_AddRunElement>newArrayList();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("call_(_cid, ");
          long _parentID = this.parentID();
          _builder.append(_parentID, "");
          _builder.append(", \'NUOPC_DriverAddRunElement\').");
          ResultSet rs = this.execQuery(_builder);
          while (rs.next()) {
            {
              NUOPCDriver.SetRunSequence_AddRunElement addComp = new NUOPCDriver.SetRunSequence_AddRunElement(this._parent);
              long _long = rs.getLong("_cid");
              addComp._id = _long;
              retList.add(addComp);
            }
          }
          rs.close();
          for (final NUOPCDriver.SetRunSequence_AddRunElement addComp : retList) {
            {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("callArgWithType(_, ");
              _builder_1.append(addComp._id, "");
              _builder_1.append(", _, \'srcCompLabel\', _, _srcCompExpr),");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("\t\t\t\t\t\t\t ");
              _builder_1.append("callArgWithType(_, ");
              _builder_1.append(addComp._id, "\t\t\t\t\t\t\t ");
              _builder_1.append(", _, \'dstCompLabel\', _, _dstCompExpr),");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("\t\t\t\t\t\t\t ");
              _builder_1.append("callArgWithType(_, ");
              _builder_1.append(addComp._id, "\t\t\t\t\t\t\t ");
              _builder_1.append(", _, \'slot\', _, _slotExpr).");
              ResultSet _execQuery = this.execQuery(_builder_1);
              rs = _execQuery;
              boolean _next = rs.next();
              if (_next) {
                String _string = rs.getString("_srcCompExpr");
                addComp.srcCompLabel = _string;
                String _string_1 = rs.getString("_dstCompExpr");
                addComp.dstCompLabel = _string_1;
                String _string_2 = rs.getString("_slotExpr");
                addComp.slot = _string_2;
                rs.close();
              } else {
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("callArgWithType(_, ");
                _builder_2.append(addComp._id, "");
                _builder_2.append(", _, \'compLabel\', _, _compExpr),");
                _builder_2.newLineIfNotEmpty();
                _builder_2.append("\t\t\t\t\t\t\t ");
                _builder_2.append("callArgWithType(_, ");
                _builder_2.append(addComp._id, "\t\t\t\t\t\t\t ");
                _builder_2.append(", _, \'slot\', _, _slotExpr).");
                ResultSet _execQuery_1 = this.execQuery(_builder_2);
                rs = _execQuery_1;
                boolean _next_1 = rs.next();
                if (_next_1) {
                  String _string_3 = rs.getString("_compExpr");
                  addComp.compLabel = _string_3;
                  String _string_4 = rs.getString("_slotExpr");
                  addComp.slot = _string_4;
                }
                rs.close();
              }
            }
          }
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
        _builder.append("! add a run sequence element for a Model, Mediator, or Driver       ");
        _builder.newLine();
        _builder.append("call NUOPC_DriverAddRunElement(");
        _builder.append(this._parent.paramGridComp, "");
        _builder.append(", slot=");
        CharSequence _paramint = this.paramint(1);
        _builder.append(_paramint, "");
        _builder.append(", &");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("compLabel=\"");
        CharSequence _paramch = this.paramch("compLabel");
        _builder.append(_paramch, "    ");
        _builder.append("\", rc=");
        _builder.append(this._parent.paramRC, "    ");
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
        _builder.newLine();
        _builder.append("! add a run sequence element for a Connector   ");
        _builder.newLine();
        _builder.append("call NUOPC_DriverAddRunElement(");
        _builder.append(this._parent.paramGridComp, "");
        _builder.append(", slot=");
        CharSequence _paramint_1 = this.paramint(1);
        _builder.append(_paramint_1, "");
        _builder.append(", &");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("srcCompLabel=\"");
        CharSequence _paramch_1 = this.paramch("srcComp");
        _builder.append(_paramch_1, "    ");
        _builder.append("\", dstCompLabel=\"");
        CharSequence _paramch_2 = this.paramch("dstComp");
        _builder.append(_paramch_2, "    ");
        _builder.append("\", rc=");
        _builder.append(this._parent.paramRC, "    ");
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
  
  @Label(label = "ModifyInitializePhaseMap")
  @MappingType("subroutine")
  public static class ModifyInitializePhaseMap extends SpecializationMethodCodeConcept<NUOPCDriver.Initialization> {
    public ModifyInitializePhaseMap(final NUOPCDriver.Initialization parent) {
      super(parent, "NUOPC_Driver", "label_ModifyInitializePhaseMap");
      this.subroutineName = "ModifyInitializePhaseMap";
      this.specLabel = "driver_label_ModifyInitializePhaseMap";
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
  
  public String driverName;
  
  public String filename;
  
  public String path;
  
  @Child
  public SetServicesCodeConcept<NUOPCDriver> setServices;
  
  @Child
  public NUOPCDriver.Initialization initialization;
  
  public NUOPCDriver(final CodeDBIndex codeDB) {
    super(null);
    this._codeDB = codeDB;
  }
  
  @Override
  public String prefix() {
    return "driver";
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
  
  @Override
  public String name() {
    return (((this.driverName + " (") + this.filename) + ")");
  }
}
