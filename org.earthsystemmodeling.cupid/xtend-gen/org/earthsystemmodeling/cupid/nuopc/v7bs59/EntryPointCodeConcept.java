package org.earthsystemmodeling.cupid.nuopc.v7bs59;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.annotation.Name;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.earthsystemmodeling.cupid.nuopc.ESMFQuery;
import org.earthsystemmodeling.cupid.nuopc.ReverseEngineerException;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.SetServicesCodeConcept;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTIfStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public abstract class EntryPointCodeConcept<P extends CodeConcept<?, ?>> extends CodeConcept<P, ASTSubroutineSubprogramNode> {
  @Name
  public String subroutineName = "NUOPCEntryPoint";
  
  @Label(label = "Registration")
  @MappingType("call")
  @Child
  public BasicCodeConcept<ASTCallStmtNode> registration;
  
  public String paramGridComp = "gcomp";
  
  public String paramRC = "rc";
  
  public String paramImport = "importState";
  
  public String paramExport = "exportState";
  
  public String paramClock = "clock";
  
  public String methodType = "ESMF_METHOD_INITIALIZE";
  
  public String phaseLabel;
  
  public EntryPointCodeConcept(final P parent, final String phaseLabel) {
    super(parent);
    this.phaseLabel = phaseLabel;
  }
  
  /**
   * subclasses using this must explicitly set the phaseLabel
   */
  public EntryPointCodeConcept(final P parent) {
    this(parent, null);
  }
  
  @Override
  public CodeConcept<?, ?> reverse() {
    try {
      EntryPointCodeConcept<P> _xblockexpression = null;
      {
        SetServicesCodeConcept<?> _setServices = this.setServices();
        ASTSubroutineSubprogramNode _aSTRef = null;
        if (_setServices!=null) {
          _aSTRef=_setServices.getASTRef();
        }
        final ASTSubroutineSubprogramNode setServicesNode = _aSTRef;
        boolean _equals = Objects.equal(setServicesNode, null);
        if (_equals) {
          throw new ReverseEngineerException("No SetServices method found");
        }
        final Function1<ASTCallStmtNode, Boolean> _function = (ASTCallStmtNode it) -> {
          return Boolean.valueOf((ASTQuery.eic(it.getSubroutineName().getText(), "NUOPC_CompSetEntryPoint") && 
            ASTQuery.litArgExprByKeyword(it, "phaseLabelList").toLowerCase().contains(this.phaseLabel.toLowerCase())));
        };
        final ASTCallStmtNode registrationCall = IterableExtensions.<ASTCallStmtNode>findFirst(Iterables.<ASTCallStmtNode>filter(setServicesNode.getBody(), ASTCallStmtNode.class), _function);
        boolean _equals_1 = Objects.equal(registrationCall, null);
        if (_equals_1) {
          return null;
        }
        final Function1<ASTSubroutineSubprogramNode, Boolean> _function_1 = (ASTSubroutineSubprogramNode it) -> {
          return Boolean.valueOf(ASTQuery.eic(it.getSubroutineStmt().getSubroutineName().getSubroutineName(), ASTQuery.litArgExprByKeyword(registrationCall, "userRoutine")));
        };
        final ASTSubroutineSubprogramNode epSubroutine = IterableExtensions.<ASTSubroutineSubprogramNode>findFirst(ESMFQuery.findESMFEntryPoints(this.module().getASTRef()), _function_1);
        boolean _equals_2 = Objects.equal(epSubroutine, null);
        if (_equals_2) {
          return null;
        }
        this.setASTRef(epSubroutine);
        this.subroutineName = epSubroutine.getSubroutineStmt().getSubroutineName().getSubroutineName().getText();
        BasicCodeConcept<ASTCallStmtNode> _basicCodeConcept = new BasicCodeConcept<ASTCallStmtNode>(this, registrationCall);
        this.registration = _basicCodeConcept;
        this.paramGridComp = epSubroutine.getSubroutineStmt().getSubroutinePars().get(0).getVariableName().getText();
        this.paramImport = epSubroutine.getSubroutineStmt().getSubroutinePars().get(1).getVariableName().getText();
        this.paramExport = epSubroutine.getSubroutineStmt().getSubroutinePars().get(2).getVariableName().getText();
        this.paramClock = epSubroutine.getSubroutineStmt().getSubroutinePars().get(3).getVariableName().getText();
        this.paramRC = epSubroutine.getSubroutineStmt().getSubroutinePars().get(4).getVariableName().getText();
        _xblockexpression = this.reverseChildren();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * def reverseOLD() {
   * 
   * var rs = '''esmf_reg_entrypoint(_epId, «module()._id», _epName, '"«phaseLabel»"', _regid).'''.execQuery
   * 
   * if (rs.next) {
   * _id = rs.getLong("_epId")
   * subroutineName = rs.getString("_epName")
   * registration = newBasicCodeConcept(this, rs.getLong("_regid"))
   * rs.close
   * 
   * rs = '''esmf_entrypoint(_sid, «parentID», _name, _param_gridcomp, _param_import, _param_export, _param_clock, _param_rc).'''.execQuery
   * if (rs.next) {
   * paramGridComp = rs.getString("_param_gridcomp")
   * paramImport = rs.getString("_param_import")
   * paramExport = rs.getString("_param_export")
   * paramClock = rs.getString("_param_clock")
   * }
   * rs.close
   * 
   * reverseChildren
   * }
   * else {
   * rs.close
   * null
   * }
   * }
   */
  public EntryPointCodeConcept<P> reverseChildren() {
    return this;
  }
  
  /**
   * override
   */
  public String subroutineTemplate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("subroutine ");
    _builder.append(this.subroutineName);
    _builder.append("(");
    _builder.append(this.paramGridComp);
    _builder.append(", ");
    _builder.append(this.paramImport);
    _builder.append(", ");
    _builder.append(this.paramExport);
    _builder.append(", ");
    _builder.append(this.paramClock);
    _builder.append(", ");
    _builder.append(this.paramRC);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("type(ESMF_GridComp)  :: ");
    _builder.append(this.paramGridComp, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("type(ESMF_State)     :: ");
    _builder.append(this.paramImport, "    ");
    _builder.append(", ");
    _builder.append(this.paramExport, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("type(ESMF_Clock)     :: ");
    _builder.append(this.paramClock, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("integer, intent(out) :: ");
    _builder.append(this.paramRC, "    ");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("rc = ESMF_SUCCESS");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("end subroutine");
    _builder.newLine();
    return _builder.toString();
  }
  
  public abstract CodeConcept<?, ASTModuleNode> module();
  
  public abstract SetServicesCodeConcept<?> setServices();
  
  @Override
  public CodeConcept<?, ?> forward() {
    try {
      CodeConcept<?, ?> _xblockexpression = null;
      {
        SetServicesCodeConcept<?> _setServices = this.setServices();
        boolean _equals = Objects.equal(_setServices, null);
        if (_equals) {
          throw new CodeGenerationException("A SetServices subroutine must exist first.");
        }
        String code = this.subroutineTemplate();
        ASTModuleNode mn = this.module().getASTRef();
        ASTSubroutineSubprogramNode ssn = CodeExtraction.<ASTSubroutineSubprogramNode>parseLiteralProgramUnit(code);
        mn.getModuleBody().add(ssn);
        this.setASTRef(ssn);
        ASTSubroutineSubprogramNode setServicesNode = this.setServices().getASTRef();
        boolean _notEquals = (!Objects.equal(setServicesNode, null));
        if (_notEquals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.newLine();
          _builder.append("call NUOPC_CompSetEntryPoint(");
          _builder.append(this.setServices().paramGridComp);
          _builder.append(", ");
          _builder.append(this.methodType);
          _builder.append(", &");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          {
            boolean _notEquals_1 = (!Objects.equal(this.phaseLabel, null));
            if (_notEquals_1) {
              _builder.append("phaseLabelList=(/\"");
              _builder.append(this.phaseLabel, "\t");
              _builder.append("\"/),");
            }
          }
          _builder.append(" userRoutine=");
          _builder.append(this.subroutineName, "\t");
          _builder.append(", rc=");
          _builder.append(this.setServices().paramRC, "\t");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
          code = _builder.toString();
          IBodyConstruct _parseLiteralStatement = CodeExtraction.<IBodyConstruct>parseLiteralStatement(code);
          ASTCallStmtNode regCall = ((ASTCallStmtNode) _parseLiteralStatement);
          setServicesNode.getBody().add(regCall);
          BasicCodeConcept<ASTCallStmtNode> _basicCodeConcept = new BasicCodeConcept<ASTCallStmtNode>(this, regCall);
          this.registration = _basicCodeConcept;
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("if (ESMF_LogFoundError(rcToCheck=");
          _builder_1.append(this.paramRC);
          _builder_1.append(", msg=ESMF_LOGERR_PASSTHRU, &");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("            ");
          _builder_1.append("line=__LINE__, &");
          _builder_1.newLine();
          _builder_1.append("            ");
          _builder_1.append("file=__FILE__)) &");
          _builder_1.newLine();
          _builder_1.append("            ");
          _builder_1.append("return  ! bail out");
          _builder_1.newLine();
          code = _builder_1.toString();
          IBodyConstruct _parseLiteralStatement_1 = CodeExtraction.<IBodyConstruct>parseLiteralStatement(code);
          ASTIfStmtNode ifNode = ((ASTIfStmtNode) _parseLiteralStatement_1);
          setServicesNode.getBody().add(ifNode);
        }
        _xblockexpression = super.<CodeConcept<?, ?>>forward();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
