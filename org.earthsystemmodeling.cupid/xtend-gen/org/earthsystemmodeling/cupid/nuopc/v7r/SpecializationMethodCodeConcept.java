package org.earthsystemmodeling.cupid.nuopc.v7r;

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
import org.earthsystemmodeling.cupid.nuopc.ESMFCodeTemplates;
import org.earthsystemmodeling.cupid.nuopc.ESMFQuery;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCComponent;
import org.earthsystemmodeling.cupid.nuopc.v7r.SetServicesCodeConcept;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTIfStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineNameNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineParNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IModuleBodyConstruct;
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
    parent.setOrAddChild(this);
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
      ASTSubroutineStmtNode _subroutineStmt = setServicesNode.getSubroutineStmt();
      IASTListNode<ASTSubroutineParNode> _subroutinePars = _subroutineStmt.getSubroutinePars();
      ASTSubroutineParNode _get = _subroutinePars.get(0);
      Token _variableName = _get.getVariableName();
      final String pGridComp = _variableName.getText();
      ASTSubroutineStmtNode _subroutineStmt_1 = setServicesNode.getSubroutineStmt();
      IASTListNode<ASTSubroutineParNode> _subroutinePars_1 = _subroutineStmt_1.getSubroutinePars();
      ASTSubroutineParNode _get_1 = _subroutinePars_1.get(1);
      Token _variableName_1 = _get_1.getVariableName();
      final String pRC = _variableName_1.getText();
      final Function1<ASTSubroutineSubprogramNode, Boolean> _function = new Function1<ASTSubroutineSubprogramNode, Boolean>() {
        @Override
        public Boolean apply(final ASTSubroutineSubprogramNode it) {
          return Boolean.valueOf((!Objects.equal(it, setServicesNode)));
        }
      };
      Iterable<ASTSubroutineSubprogramNode> _filter = IterableExtensions.<ASTSubroutineSubprogramNode>filter(esmfMethods, _function);
      final Consumer<ASTSubroutineSubprogramNode> _function_1 = new Consumer<ASTSubroutineSubprogramNode>() {
        @Override
        public void accept(final ASTSubroutineSubprogramNode m) {
          IASTListNode<IBodyConstruct> _body = setServicesNode.getBody();
          Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
          final Function1<ASTCallStmtNode, Boolean> _function = new Function1<ASTCallStmtNode, Boolean>() {
            @Override
            public Boolean apply(final ASTCallStmtNode it) {
              boolean _and = false;
              boolean _and_1 = false;
              Token _subroutineName = it.getSubroutineName();
              boolean _eic = ASTQuery.eic(_subroutineName, "NUOPC_CompSpecialize");
              if (!_eic) {
                _and_1 = false;
              } else {
                String _litArgExprByKeyword = ASTQuery.litArgExprByKeyword(it, "specRoutine");
                boolean _eic_1 = false;
                if (_litArgExprByKeyword!=null) {
                  ASTSubroutineStmtNode _subroutineStmt = m.getSubroutineStmt();
                  ASTSubroutineNameNode _subroutineName_1 = _subroutineStmt.getSubroutineName();
                  Token _subroutineName_2 = _subroutineName_1.getSubroutineName();
                  _eic_1=ASTQuery.eic(_litArgExprByKeyword, _subroutineName_2);
                }
                _and_1 = _eic_1;
              }
              if (!_and_1) {
                _and = false;
              } else {
                String _litArgExprByKeyword_1 = ASTQuery.litArgExprByKeyword(it, "specLabel");
                boolean _eic_2 = false;
                if (_litArgExprByKeyword_1!=null) {
                  String _localName = ASTQuery.localName(moduleNode, SpecializationMethodCodeConcept.this.labelComponent, SpecializationMethodCodeConcept.this.labelName);
                  _eic_2=ASTQuery.eic(_litArgExprByKeyword_1, _localName);
                }
                _and = _eic_2;
              }
              return Boolean.valueOf(_and);
            }
          };
          Iterable<ASTCallStmtNode> _filter_1 = IterableExtensions.<ASTCallStmtNode>filter(_filter, _function);
          final Consumer<ASTCallStmtNode> _function_1 = new Consumer<ASTCallStmtNode>() {
            @Override
            public void accept(final ASTCallStmtNode c) {
              CodeConcept<P, ASTSubroutineSubprogramNode> _newInstance = SpecializationMethodCodeConcept.this.newInstance();
              SpecializationMethodCodeConcept<P> smcc = ((SpecializationMethodCodeConcept<P>) _newInstance);
              final Procedure1<SpecializationMethodCodeConcept<P>> _function = new Procedure1<SpecializationMethodCodeConcept<P>>() {
                @Override
                public void apply(final SpecializationMethodCodeConcept<P> it) {
                  ASTSubroutineStmtNode _subroutineStmt = m.getSubroutineStmt();
                  ASTSubroutineNameNode _subroutineName = _subroutineStmt.getSubroutineName();
                  Token _subroutineName_1 = _subroutineName.getSubroutineName();
                  String _text = _subroutineName_1.getText();
                  it.subroutineName = _text;
                  String _litArgExprByKeyword = ASTQuery.litArgExprByKeyword(c, "specLabel");
                  it.specLabel = _litArgExprByKeyword;
                  String _litArgExprByKeyword_1 = ASTQuery.litArgExprByKeyword(c, "specPhaseLabel");
                  it.specPhaseLabel = _litArgExprByKeyword_1;
                  it.paramGridComp = pGridComp;
                  it.paramRC = pRC;
                  BasicCodeConcept<ASTCallStmtNode> _basicCodeConcept = new BasicCodeConcept<ASTCallStmtNode>(SpecializationMethodCodeConcept.this, c);
                  it.registration = _basicCodeConcept;
                  it.setASTRef(m);
                }
              };
              ObjectExtensions.<SpecializationMethodCodeConcept<P>>operator_doubleArrow(smcc, _function);
              SpecializationMethodCodeConcept<P> _reverseChildren = smcc.reverseChildren();
              smcc = _reverseChildren;
              boolean _notEquals = (!Objects.equal(smcc, null));
              if (_notEquals) {
                resultList.add(smcc);
              }
            }
          };
          _filter_1.forEach(_function_1);
        }
      };
      _filter.forEach(_function_1);
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
        CodeConcept<?, ASTModuleNode> _module = this.module();
        ASTModuleNode mn = _module.getASTRef();
        ASTSubroutineSubprogramNode ssn = CodeExtraction.<ASTSubroutineSubprogramNode>parseLiteralProgramUnit(code);
        IASTListNode<IModuleBodyConstruct> _moduleBody = mn.getModuleBody();
        _moduleBody.add(ssn);
        this.setASTRef(ssn);
        NUOPCComponent.GenericImport _genericUse = this.genericUse();
        ASTUseStmtNode _aSTRef = _genericUse.getASTRef();
        ASTUseStmtNode usn = CodeConcept.ensureImport(_aSTRef, this.labelName, this.specLabel);
        NUOPCComponent.GenericImport _genericUse_1 = this.genericUse();
        _genericUse_1.setASTRef(usn);
        SetServicesCodeConcept<?> _setServices_1 = this.setServices();
        ASTSubroutineSubprogramNode setServicesNode = _setServices_1.getASTRef();
        boolean _notEquals = (!Objects.equal(setServicesNode, null));
        if (_notEquals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.newLine();
          _builder.append("call NUOPC_CompSpecialize(");
          SetServicesCodeConcept<?> _setServices_2 = this.setServices();
          _builder.append(_setServices_2.paramGridComp, "");
          _builder.append(", specLabel=");
          _builder.append(this.specLabel, "");
          _builder.append(", &");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("specRoutine=");
          _builder.append(this.subroutineName, "\t");
          _builder.append(", rc=");
          SetServicesCodeConcept<?> _setServices_3 = this.setServices();
          _builder.append(_setServices_3.paramRC, "\t");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
          code = _builder.toString();
          IBodyConstruct _parseLiteralStatement = CodeExtraction.parseLiteralStatement(code);
          ASTCallStmtNode regCall = ((ASTCallStmtNode) _parseLiteralStatement);
          IASTListNode<IBodyConstruct> _body = setServicesNode.getBody();
          _body.add(regCall);
          BasicCodeConcept<ASTCallStmtNode> _basicCodeConcept = new BasicCodeConcept<ASTCallStmtNode>(this, regCall);
          this.registration = _basicCodeConcept;
          StringConcatenation _builder_1 = new StringConcatenation();
          CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this.paramRC);
          _builder_1.append(_ESMFErrorCheck, "");
          code = _builder_1.toString();
          IBodyConstruct _parseLiteralStatement_1 = CodeExtraction.parseLiteralStatement(code);
          ASTIfStmtNode ifNode = ((ASTIfStmtNode) _parseLiteralStatement_1);
          IASTListNode<IBodyConstruct> _body_1 = setServicesNode.getBody();
          _body_1.add(ifNode);
        }
        _xblockexpression = super.<CodeConcept<?, ?>>forward();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
