package org.earthsystemmodeling.cupid.nuopc.v7bs59;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.annotation.Prop;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.earthsystemmodeling.cupid.nuopc.ESMFQuery;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCComponent;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.SetServicesCodeConcept;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTIfStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public abstract class SpecializationMethodCodeConcept<P extends CodeConcept<?, ?>> extends CodeConcept<P, ASTSubroutineSubprogramNode> {
  public String subroutineName = "SpecializationMethod";
  
  public String specLabel = "label_SpecializationLabel";
  
  @Label(label = "Phase Label")
  @Prop
  public String specPhaseLabel;
  
  @Label(label = "Registration")
  @MappingType("call")
  @Child
  public BasicCodeConcept<ASTCallStmtNode> registration;
  
  public String paramGridComp = "driver";
  
  public String paramRC = "rc";
  
  private String labelComponent;
  
  private String labelName;
  
  public SpecializationMethodCodeConcept(final P parent, final String labelComponent, final String labelName) {
    super(parent);
    this.labelComponent = labelComponent;
    this.labelName = labelName;
  }
  
  @Override
  public String name() {
    String _xifexpression = null;
    boolean _notEquals = (!Objects.equal(this.specPhaseLabel, null));
    if (_notEquals) {
      _xifexpression = (((this.subroutineName + " (") + this.specPhaseLabel) + ")");
    } else {
      _xifexpression = this.subroutineName;
    }
    return _xifexpression;
  }
  
  @Override
  public CodeConcept<?, ?> reverse() {
    CodeConcept<P, ASTSubroutineSubprogramNode> _xblockexpression = null;
    {
      final List lst = this.reverseMultiple();
      CodeConcept<P, ASTSubroutineSubprogramNode> _xifexpression = null;
      int _size = 0;
      if (lst!=null) {
        _size=lst.size();
      }
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        Object _get = null;
        if (lst!=null) {
          _get=lst.get(0);
        }
        _xifexpression = ((CodeConcept<P, ASTSubroutineSubprogramNode>) _get);
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  @Override
  public List reverseMultiple() {
    ArrayList<SpecializationMethodCodeConcept<P>> _xblockexpression = null;
    {
      CodeConcept<?, ASTModuleNode> _module = this.module();
      ASTModuleNode _aSTRef = null;
      if (_module!=null) {
        _aSTRef=_module.getASTRef();
      }
      final ASTModuleNode moduleNode = _aSTRef;
      boolean _equals = Objects.equal(moduleNode, null);
      if (_equals) {
        return null;
      }
      SetServicesCodeConcept<?> _setServices = this.setServices();
      ASTSubroutineSubprogramNode _aSTRef_1 = null;
      if (_setServices!=null) {
        _aSTRef_1=_setServices.getASTRef();
      }
      final ASTSubroutineSubprogramNode setServicesNode = _aSTRef_1;
      boolean _equals_1 = Objects.equal(setServicesNode, null);
      if (_equals_1) {
        return null;
      }
      final Iterable<ASTSubroutineSubprogramNode> esmfMethods = ESMFQuery.findESMFMethods(moduleNode);
      final ArrayList<SpecializationMethodCodeConcept<P>> resultList = CollectionLiterals.<SpecializationMethodCodeConcept<P>>newArrayList();
      final String pGridComp = setServicesNode.getSubroutineStmt().getSubroutinePars().get(0).getVariableName().getText();
      final String pRC = setServicesNode.getSubroutineStmt().getSubroutinePars().get(1).getVariableName().getText();
      final Function1<ASTSubroutineSubprogramNode, Boolean> _function = (ASTSubroutineSubprogramNode it) -> {
        return Boolean.valueOf((!Objects.equal(it, setServicesNode)));
      };
      final Consumer<ASTSubroutineSubprogramNode> _function_1 = (ASTSubroutineSubprogramNode m) -> {
        final Function1<ASTCallStmtNode, Boolean> _function_2 = (ASTCallStmtNode it) -> {
          boolean _and = false;
          boolean _and_1 = false;
          boolean _eic = ASTQuery.eic(it.getSubroutineName(), "NUOPC_CompSpecialize");
          if (!_eic) {
            _and_1 = false;
          } else {
            String _litArgExprByKeyword = ASTQuery.litArgExprByKeyword(it, "specRoutine");
            boolean _eic_1 = false;
            if (_litArgExprByKeyword!=null) {
              _eic_1=ASTQuery.eic(_litArgExprByKeyword, m.getSubroutineStmt().getSubroutineName().getSubroutineName());
            }
            _and_1 = _eic_1;
          }
          if (!_and_1) {
            _and = false;
          } else {
            String _litArgExprByKeyword_1 = ASTQuery.litArgExprByKeyword(it, "specLabel");
            boolean _eic_2 = false;
            if (_litArgExprByKeyword_1!=null) {
              _eic_2=ASTQuery.eic(_litArgExprByKeyword_1, ASTQuery.localName(moduleNode, this.labelComponent, this.labelName));
            }
            _and = _eic_2;
          }
          return Boolean.valueOf(_and);
        };
        final Consumer<ASTCallStmtNode> _function_3 = (ASTCallStmtNode c) -> {
          CodeConcept<P, ASTSubroutineSubprogramNode> _newInstance = this.newInstance();
          SpecializationMethodCodeConcept<P> smcc = ((SpecializationMethodCodeConcept<P>) _newInstance);
          final Procedure1<SpecializationMethodCodeConcept<P>> _function_4 = (SpecializationMethodCodeConcept<P> it) -> {
            it.subroutineName = m.getSubroutineStmt().getSubroutineName().getSubroutineName().getText();
            it.specLabel = ASTQuery.litArgExprByKeyword(c, "specLabel");
            it.specPhaseLabel = ASTQuery.litArgExprByKeyword(c, "specPhaseLabel");
            it.paramGridComp = pGridComp;
            it.paramRC = pRC;
            BasicCodeConcept<ASTCallStmtNode> _basicCodeConcept = new BasicCodeConcept<ASTCallStmtNode>(this, c);
            it.registration = _basicCodeConcept;
            it.setASTRef(m);
          };
          ObjectExtensions.<SpecializationMethodCodeConcept<P>>operator_doubleArrow(smcc, _function_4);
          smcc = smcc.reverseChildren();
          boolean _notEquals = (!Objects.equal(smcc, null));
          if (_notEquals) {
            resultList.add(smcc);
          }
        };
        IterableExtensions.<ASTCallStmtNode>filter(Iterables.<ASTCallStmtNode>filter(setServicesNode.getBody(), ASTCallStmtNode.class), _function_2).forEach(_function_3);
      };
      IterableExtensions.<ASTSubroutineSubprogramNode>filter(esmfMethods, _function).forEach(_function_1);
      _xblockexpression = resultList;
    }
    return _xblockexpression;
  }
  
  public SpecializationMethodCodeConcept<P> reverseChildren() {
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
    _builder.append(this.paramRC);
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
    _builder.append("end subroutine");
    _builder.newLine();
    return _builder.toString();
  }
  
  public abstract CodeConcept<?, ASTModuleNode> module();
  
  public abstract SetServicesCodeConcept<?> setServices();
  
  public abstract NUOPCComponent.GenericImport genericUse();
  
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
        ASTUseStmtNode _aSTRef = this.genericUse().getASTRef();
        ASTUseStmtNode usesNUOPCDriver = ((ASTUseStmtNode) _aSTRef);
        String tempCode = usesNUOPCDriver.toString().trim();
        String _tempCode = tempCode;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(", &");
        _builder.newLine();
        _builder.append("\t\t");
        {
          boolean _equals_1 = this.specLabel.equals(this.labelName);
          boolean _not = (!_equals_1);
          if (_not) {
            _builder.append(this.specLabel, "\t\t");
            _builder.append(" => ");
          }
        }
        _builder.append(this.labelName, "\t\t");
        tempCode = (_tempCode + _builder);
        IBodyConstruct _parseLiteralStatement = CodeExtraction.<IBodyConstruct>parseLiteralStatement(tempCode);
        ASTUseStmtNode tempNode = ((ASTUseStmtNode) _parseLiteralStatement);
        try {
          usesNUOPCDriver.replaceWith(tempNode);
        } catch (final Throwable _t) {
          if (_t instanceof IllegalStateException) {
            final IllegalStateException e = (IllegalStateException)_t;
            e.printStackTrace();
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        this.genericUse().setASTRef(tempNode);
        ASTSubroutineSubprogramNode setServicesNode = this.setServices().getASTRef();
        boolean _notEquals = (!Objects.equal(setServicesNode, null));
        if (_notEquals) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.newLine();
          _builder_1.append("call NUOPC_CompSpecialize(");
          _builder_1.append(this.setServices().paramGridComp);
          _builder_1.append(", specLabel=");
          _builder_1.append(this.specLabel);
          _builder_1.append(", &");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t");
          _builder_1.append("specRoutine=");
          _builder_1.append(this.subroutineName, "\t");
          _builder_1.append(", rc=");
          _builder_1.append(this.setServices().paramRC, "\t");
          _builder_1.append(")");
          _builder_1.newLineIfNotEmpty();
          code = _builder_1.toString();
          IBodyConstruct _parseLiteralStatement_1 = CodeExtraction.<IBodyConstruct>parseLiteralStatement(code);
          ASTCallStmtNode regCall = ((ASTCallStmtNode) _parseLiteralStatement_1);
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
          IBodyConstruct _parseLiteralStatement_2 = CodeExtraction.<IBodyConstruct>parseLiteralStatement(code);
          ASTIfStmtNode ifNode = ((ASTIfStmtNode) _parseLiteralStatement_2);
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
