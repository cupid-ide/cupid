package org.earthsystemmodeling.cupid.nuopc.v7r;

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
import org.earthsystemmodeling.cupid.nuopc.v7r.SetServicesCodeConcept;
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
  
  public String phaseNumber;
  
  public EntryPointCodeConcept(final P parent, final String phaseLabel) {
    super(parent);
    this.phaseLabel = phaseLabel;
  }
  
  /**
   * subclasses using this must explicitly set the phaseLabel or phaseNumber
   */
  public EntryPointCodeConcept(final P parent) {
    this(parent, null);
  }
  
  @Override
  public CodeConcept<?, ?> reverse() {
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
        return null;
      }
      ASTCallStmtNode regCall = null;
      boolean _notEquals = (!Objects.equal(this.phaseNumber, null));
      if (_notEquals) {
        final Function1<ASTCallStmtNode, Boolean> _function = (ASTCallStmtNode it) -> {
          boolean _and = false;
          boolean _eic = ASTQuery.eic(it.getSubroutineName().getText(), "ESMF_GridCompSetEntryPoint");
          if (!_eic) {
            _and = false;
          } else {
            String _litArgExprByKeyword = ASTQuery.litArgExprByKeyword(it, "phase");
            boolean _eic_1 = false;
            if (_litArgExprByKeyword!=null) {
              _eic_1=ASTQuery.eic(_litArgExprByKeyword, this.phaseNumber);
            }
            _and = _eic_1;
          }
          return Boolean.valueOf(_and);
        };
        regCall = IterableExtensions.<ASTCallStmtNode>findFirst(Iterables.<ASTCallStmtNode>filter(setServicesNode.getBody(), ASTCallStmtNode.class), _function);
      } else {
        final Function1<ASTCallStmtNode, Boolean> _function_1 = (ASTCallStmtNode it) -> {
          boolean _and = false;
          boolean _eic = ASTQuery.eic(it.getSubroutineName().getText(), "NUOPC_CompSetEntryPoint");
          if (!_eic) {
            _and = false;
          } else {
            boolean _or = false;
            String _litArgExprByKeyword = ASTQuery.litArgExprByKeyword(it, "phaseLabelList");
            String _lowerCase = null;
            if (_litArgExprByKeyword!=null) {
              _lowerCase=_litArgExprByKeyword.toLowerCase();
            }
            boolean _contains = false;
            if (_lowerCase!=null) {
              _contains=_lowerCase.contains(this.phaseLabel.toLowerCase());
            }
            if (_contains) {
              _or = true;
            } else {
              String _litArgExprByIdx = ASTQuery.litArgExprByIdx(it, 2);
              String _lowerCase_1 = null;
              if (_litArgExprByIdx!=null) {
                _lowerCase_1=_litArgExprByIdx.toLowerCase();
              }
              boolean _contains_1 = false;
              if (_lowerCase_1!=null) {
                _contains_1=_lowerCase_1.contains(this.phaseLabel.toLowerCase());
              }
              _or = _contains_1;
            }
            _and = _or;
          }
          return Boolean.valueOf(_and);
        };
        regCall = IterableExtensions.<ASTCallStmtNode>findFirst(Iterables.<ASTCallStmtNode>filter(setServicesNode.getBody(), ASTCallStmtNode.class), _function_1);
      }
      boolean _equals_1 = Objects.equal(regCall, null);
      if (_equals_1) {
        return null;
      }
      final ASTCallStmtNode registrationCall = regCall;
      final Function1<ASTSubroutineSubprogramNode, Boolean> _function_2 = (ASTSubroutineSubprogramNode it) -> {
        return Boolean.valueOf(ASTQuery.eic(it.getSubroutineStmt().getSubroutineName().getSubroutineName(), ASTQuery.litArgExprByKeyword(registrationCall, "userRoutine")));
      };
      final ASTSubroutineSubprogramNode epSubroutine = IterableExtensions.<ASTSubroutineSubprogramNode>findFirst(ESMFQuery.findESMFEntryPoints(this.module().getASTRef()), _function_2);
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
  }
  
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
          boolean _notEquals_1 = (!Objects.equal(this.phaseNumber, null));
          if (_notEquals_1) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.newLine();
            _builder.append("call ESMF_GridCompSetEntryPoint(");
            _builder.append(this.setServices().paramGridComp);
            _builder.append(", ");
            _builder.append(this.methodType);
            _builder.append(", &");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("userRoutine=");
            _builder.append(this.subroutineName, "\t");
            _builder.append(", phase=");
            _builder.append(this.phaseNumber, "\t");
            _builder.append(", rc=");
            _builder.append(this.setServices().paramRC, "\t");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            code = _builder.toString();
          } else {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.newLine();
            _builder_1.append("call NUOPC_CompSetEntryPoint(");
            _builder_1.append(this.setServices().paramGridComp);
            _builder_1.append(", ");
            _builder_1.append(this.methodType);
            _builder_1.append(", &");
            _builder_1.newLineIfNotEmpty();
            _builder_1.append("\t");
            {
              boolean _notEquals_2 = (!Objects.equal(this.phaseLabel, null));
              if (_notEquals_2) {
                _builder_1.append("phaseLabelList=(/\"");
                _builder_1.append(this.phaseLabel, "\t");
                _builder_1.append("\"/),");
              }
            }
            _builder_1.append(" userRoutine=");
            _builder_1.append(this.subroutineName, "\t");
            _builder_1.append(", rc=");
            _builder_1.append(this.setServices().paramRC, "\t");
            _builder_1.append(")");
            _builder_1.newLineIfNotEmpty();
            code = _builder_1.toString();
          }
          IBodyConstruct _parseLiteralStatement = CodeExtraction.<IBodyConstruct>parseLiteralStatement(code);
          ASTCallStmtNode regCall = ((ASTCallStmtNode) _parseLiteralStatement);
          setServicesNode.getBody().add(regCall);
          BasicCodeConcept<ASTCallStmtNode> _basicCodeConcept = new BasicCodeConcept<ASTCallStmtNode>(this, regCall);
          this.registration = _basicCodeConcept;
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("if (ESMF_LogFoundError(rcToCheck=");
          _builder_2.append(this.paramRC);
          _builder_2.append(", msg=ESMF_LOGERR_PASSTHRU, &");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("            ");
          _builder_2.append("line=__LINE__, &");
          _builder_2.newLine();
          _builder_2.append("            ");
          _builder_2.append("file=__FILE__)) &");
          _builder_2.newLine();
          _builder_2.append("            ");
          _builder_2.append("return  ! bail out");
          _builder_2.newLine();
          code = _builder_2.toString();
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
