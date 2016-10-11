package org.earthsystemmodeling.cupid.nuopc.v7r;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.NUOPC.Advance;
import org.earthsystemmodeling.cupid.NUOPC.BaseModel;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.annotation.Name;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.earthsystemmodeling.cupid.nuopc.ESMFCodeTemplates;
import org.earthsystemmodeling.cupid.nuopc.ReverseEngineerException;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCComponent;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.emf.common.util.EList;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTAcValueNode;
import org.eclipse.photran.internal.core.parser.ASTAccessStmtNode;
import org.eclipse.photran.internal.core.parser.ASTArrayConstructorNode;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTContainsStmtNode;
import org.eclipse.photran.internal.core.parser.ASTImplicitStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineNameNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineParNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IExpr;
import org.eclipse.photran.internal.core.parser.IModuleBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@Label(label = "SetServices")
@MappingType("subroutine")
@SuppressWarnings("all")
public class SetServicesCodeConcept<P extends NUOPCComponent> extends CodeConcept<P, ASTSubroutineSubprogramNode> {
  @Label(label = "Set Entry Point")
  @MappingType("call")
  public static class MethodRegistration extends CodeConcept<SetServicesCodeConcept, ASTCallStmtNode> {
    public String methodType;
    
    public List<String> phaseLabelList;
    
    public String userRoutine;
    
    public boolean internal;
    
    public MethodRegistration(final SetServicesCodeConcept parent) {
      super(parent);
      parent.setOrAddChild(this);
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList();
      this.phaseLabelList = _newArrayList;
      this.methodType = "ESMF_METHOD_INITIALIZE";
      this.phaseLabelList.add("\"phaseLabel\"");
      this.userRoutine = "userRoutine";
      this.internal = false;
    }
    
    @Override
    public String name() {
      String _xifexpression = null;
      int _size = this.phaseLabelList.size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        String _get = this.phaseLabelList.get(0);
        _xifexpression = ((this.userRoutine + " / ") + _get);
      } else {
        _xifexpression = this.userRoutine;
      }
      return _xifexpression;
    }
    
    @Override
    public CodeConcept<?, ?> forward() {
      try {
        SetServicesCodeConcept.MethodRegistration _xblockexpression = null;
        {
          IASTNode _aSTRef = this._parent.getASTRef();
          final ASTSubroutineSubprogramNode setServicesNode = ((ASTSubroutineSubprogramNode) _aSTRef);
          boolean _equals = Objects.equal(setServicesNode, null);
          if (_equals) {
            throw new CodeGenerationException("No SetServices found");
          }
          String _xifexpression = null;
          if (this.internal) {
            _xifexpression = "NUOPC_CompSetInternalEntryPoint";
          } else {
            _xifexpression = "NUOPC_CompSetEntryPoint";
          }
          final String subroutineToCall = _xifexpression;
          StringConcatenation _builder = new StringConcatenation();
          _builder.newLine();
          _builder.append("call ");
          _builder.append(subroutineToCall, "");
          _builder.append("(");
          _builder.append(this._parent.paramGridComp, "");
          _builder.append(", ");
          _builder.append(this.methodType, "");
          _builder.append(", &");
          _builder.newLineIfNotEmpty();
          _builder.append("      ");
          _builder.append("phaseLabelList=(/");
          {
            boolean _hasElements = false;
            for(final String pl : this.phaseLabelList) {
              if (!_hasElements) {
                _hasElements = true;
              } else {
                _builder.appendImmediate(", ", "      ");
              }
              _builder.append(pl, "      ");
            }
          }
          _builder.append("/), &");
          _builder.newLineIfNotEmpty();
          _builder.append("      ");
          _builder.append("userRoutine=");
          _builder.append(this.userRoutine, "      ");
          _builder.append(", rc=");
          _builder.append(this._parent.paramRC, "      ");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
          String code = _builder.toString();
          IBodyConstruct _parseLiteralStatement = CodeExtraction.parseLiteralStatement(code);
          ASTCallStmtNode regCall = ((ASTCallStmtNode) _parseLiteralStatement);
          IASTListNode<IBodyConstruct> _body = setServicesNode.getBody();
          _body.add(regCall);
          this.setASTRef(regCall);
          StringConcatenation _builder_1 = new StringConcatenation();
          CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this._parent.paramRC);
          _builder_1.append(_ESMFErrorCheck, "");
          code = _builder_1.toString();
          IBodyConstruct ifNode = CodeExtraction.parseLiteralStatement(code);
          IASTListNode<IBodyConstruct> _body_1 = setServicesNode.getBody();
          _body_1.add(ifNode);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    @Override
    public List reverseMultiple() {
      try {
        ArrayList<SetServicesCodeConcept.MethodRegistration> _xblockexpression = null;
        {
          IASTNode _aSTRef = this._parent.getASTRef();
          final ASTSubroutineSubprogramNode setServicesNode = ((ASTSubroutineSubprogramNode) _aSTRef);
          boolean _equals = Objects.equal(setServicesNode, null);
          if (_equals) {
            throw new ReverseEngineerException("No SetServices found");
          }
          final ArrayList<SetServicesCodeConcept.MethodRegistration> retList = CollectionLiterals.<SetServicesCodeConcept.MethodRegistration>newArrayList();
          IASTListNode<IBodyConstruct> _body = setServicesNode.getBody();
          Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
          final Function1<ASTCallStmtNode, Boolean> _function = (ASTCallStmtNode it) -> {
            return Boolean.valueOf((ASTQuery.eic(it.getSubroutineName().getText(), "NUOPC_CompSetEntryPoint") || 
              ASTQuery.eic(it.getSubroutineName().getText(), "NUOPC_CompSetInternalEntryPoint")));
          };
          Iterable<ASTCallStmtNode> _filter_1 = IterableExtensions.<ASTCallStmtNode>filter(_filter, _function);
          final Consumer<ASTCallStmtNode> _function_1 = (ASTCallStmtNode c) -> {
            final SetServicesCodeConcept.MethodRegistration mr = new SetServicesCodeConcept.MethodRegistration(this._parent);
            String _litArgExprByIdx = ASTQuery.litArgExprByIdx(c, 1);
            mr.methodType = _litArgExprByIdx;
            final ASTArrayConstructorNode pll = ASTQuery.<ASTArrayConstructorNode>argExprByKeywordElseIdx(c, "phaseLabelList", 2);
            mr.phaseLabelList.clear();
            IASTListNode<ASTAcValueNode> _acValueList = null;
            if (pll!=null) {
              _acValueList=pll.getAcValueList();
            }
            if (_acValueList!=null) {
              final Consumer<ASTAcValueNode> _function_2 = (ASTAcValueNode v) -> {
                IExpr _expr = v.getExpr();
                String _literal = ASTQuery.literal(_expr);
                mr.phaseLabelList.add(_literal);
              };
              _acValueList.forEach(_function_2);
            }
            String _litArgExprByKeywordElseIdx = ASTQuery.litArgExprByKeywordElseIdx(c, "userRoutine", 3);
            mr.userRoutine = _litArgExprByKeywordElseIdx;
            Token _subroutineName = c.getSubroutineName();
            String _text = _subroutineName.getText();
            boolean _eic = ASTQuery.eic(_text, "NUOPC_CompSetInternalEntryPoint");
            if (_eic) {
              mr.internal = true;
            } else {
              mr.internal = false;
            }
            mr.setASTRef(c);
            retList.add(mr);
          };
          _filter_1.forEach(_function_1);
          _xblockexpression = retList;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Name
  public String subroutineName = "SetServices";
  
  public String paramGridComp = "gcomp";
  
  public String paramRC = "rc";
  
  @Label(label = "NUOPC_CompDerive")
  @MappingType("call")
  @Child
  public BasicCodeConcept<ASTCallStmtNode> callsCompDeriveID;
  
  @Child(min = 0, max = (-1), forward = true)
  public List<SetServicesCodeConcept.MethodRegistration> registrations;
  
  public SetServicesCodeConcept(final P parent) {
    super(parent);
    ArrayList<SetServicesCodeConcept.MethodRegistration> _newArrayList = CollectionLiterals.<SetServicesCodeConcept.MethodRegistration>newArrayList();
    this.registrations = _newArrayList;
  }
  
  @Override
  public SetServicesCodeConcept<P> reverse() {
    SetServicesCodeConcept<P> _xblockexpression = null;
    {
      ASTModuleNode _aSTRef = this._parent.getASTRef();
      IASTListNode<IModuleBodyConstruct> _moduleBody = _aSTRef.getModuleBody();
      Set<ASTSubroutineSubprogramNode> _findAll = null;
      if (_moduleBody!=null) {
        _findAll=_moduleBody.<ASTSubroutineSubprogramNode>findAll(ASTSubroutineSubprogramNode.class);
      }
      final Function1<ASTSubroutineSubprogramNode, Boolean> _function = (ASTSubroutineSubprogramNode it) -> {
        boolean _or = false;
        ASTSubroutineStmtNode _subroutineStmt = it.getSubroutineStmt();
        ASTSubroutineNameNode _subroutineName = null;
        if (_subroutineStmt!=null) {
          _subroutineName=_subroutineStmt.getSubroutineName();
        }
        Token _subroutineName_1 = _subroutineName.getSubroutineName();
        String _text = _subroutineName_1.getText();
        boolean _equalsIgnoreCase = _text.equalsIgnoreCase("SetServices");
        if (_equalsIgnoreCase) {
          _or = true;
        } else {
          IASTListNode<IBodyConstruct> _body = it.getBody();
          Set<ASTCallStmtNode> _findAll_1 = _body.<ASTCallStmtNode>findAll(ASTCallStmtNode.class);
          final Function1<ASTCallStmtNode, Boolean> _function_1 = (ASTCallStmtNode it_1) -> {
            Token _subroutineName_2 = it_1.getSubroutineName();
            String _text_1 = _subroutineName_2.getText();
            return Boolean.valueOf(_text_1.equalsIgnoreCase("NUOPC_CompDerive"));
          };
          boolean _exists = IterableExtensions.<ASTCallStmtNode>exists(_findAll_1, _function_1);
          _or = _exists;
        }
        return Boolean.valueOf(_or);
      };
      ASTSubroutineSubprogramNode node = IterableExtensions.<ASTSubroutineSubprogramNode>findFirst(_findAll, _function);
      SetServicesCodeConcept<P> _xifexpression = null;
      boolean _notEquals = (!Objects.equal(node, null));
      if (_notEquals) {
        SetServicesCodeConcept<P> _xblockexpression_1 = null;
        {
          ASTSubroutineStmtNode _subroutineStmt = node.getSubroutineStmt();
          ASTSubroutineNameNode _subroutineName = null;
          if (_subroutineStmt!=null) {
            _subroutineName=_subroutineStmt.getSubroutineName();
          }
          Token _subroutineName_1 = _subroutineName.getSubroutineName();
          String _text = _subroutineName_1.getText();
          this.subroutineName = _text;
          ASTSubroutineStmtNode _subroutineStmt_1 = node.getSubroutineStmt();
          IASTListNode<ASTSubroutineParNode> _subroutinePars = null;
          if (_subroutineStmt_1!=null) {
            _subroutinePars=_subroutineStmt_1.getSubroutinePars();
          }
          ASTSubroutineParNode _get = null;
          if (_subroutinePars!=null) {
            _get=_subroutinePars.get(0);
          }
          Token _variableName = null;
          if (_get!=null) {
            _variableName=_get.getVariableName();
          }
          String _text_1 = _variableName.getText();
          this.paramGridComp = _text_1;
          ASTSubroutineStmtNode _subroutineStmt_2 = node.getSubroutineStmt();
          IASTListNode<ASTSubroutineParNode> _subroutinePars_1 = null;
          if (_subroutineStmt_2!=null) {
            _subroutinePars_1=_subroutineStmt_2.getSubroutinePars();
          }
          ASTSubroutineParNode _get_1 = null;
          if (_subroutinePars_1!=null) {
            _get_1=_subroutinePars_1.get(1);
          }
          Token _variableName_1 = null;
          if (_get_1!=null) {
            _variableName_1=_get_1.getVariableName();
          }
          String _text_2 = _variableName_1.getText();
          this.paramRC = _text_2;
          BasicCodeConcept<ASTCallStmtNode> _xblockexpression_2 = null;
          {
            IASTListNode<IBodyConstruct> _body = node.getBody();
            Set<ASTCallStmtNode> _findAll_1 = _body.<ASTCallStmtNode>findAll(ASTCallStmtNode.class);
            final Function1<ASTCallStmtNode, Boolean> _function_1 = (ASTCallStmtNode it) -> {
              Token _subroutineName_2 = it.getSubroutineName();
              String _text_3 = _subroutineName_2.getText();
              return Boolean.valueOf(_text_3.equalsIgnoreCase("NUOPC_CompDerive"));
            };
            ASTCallStmtNode csn = IterableExtensions.<ASTCallStmtNode>findFirst(_findAll_1, _function_1);
            BasicCodeConcept<ASTCallStmtNode> _xifexpression_1 = null;
            boolean _notEquals_1 = (!Objects.equal(csn, null));
            if (_notEquals_1) {
              _xifexpression_1 = new BasicCodeConcept<ASTCallStmtNode>(this, csn);
            }
            _xblockexpression_2 = _xifexpression_1;
          }
          this.callsCompDeriveID = _xblockexpression_2;
          this.setASTRef(node);
          SetServicesCodeConcept.MethodRegistration _methodRegistration = new SetServicesCodeConcept.MethodRegistration(this);
          List _reverseMultiple = _methodRegistration.reverseMultiple();
          this.registrations = _reverseMultiple;
          _xblockexpression_1 = this;
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public void forward(final BaseModel high) {
    EList<Advance> _advance = high.getAdvance();
    final Consumer<Advance> _function = (Advance a) -> {
      String _phaseLabel = a.getPhaseLabel();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_phaseLabel);
      boolean _not = (!_isNullOrEmpty);
      if (_not) {
        String _prefix = this._parent.prefix();
        String _plus = (_prefix + "_routine_Run");
        this._parent.importNUOPCGeneric.imports.put("routine_Run", _plus);
        final SetServicesCodeConcept.MethodRegistration mr = new SetServicesCodeConcept.MethodRegistration(this);
        mr.internal = false;
        mr.methodType = "ESMF_METHOD_RUN";
        mr.phaseLabelList.clear();
        String _phaseLabel_1 = a.getPhaseLabel();
        String _plus_1 = ("\"" + _phaseLabel_1);
        String _plus_2 = (_plus_1 + "\"");
        mr.phaseLabelList.add(_plus_2);
        String _prefix_1 = this._parent.prefix();
        String _plus_3 = (_prefix_1 + "_routine_Run");
        mr.userRoutine = _plus_3;
      }
    };
    _advance.forEach(_function);
  }
  
  @Override
  public CodeConcept<?, ?> forward() {
    try {
      CodeConcept<?, ?> _xblockexpression = null;
      {
        String routineSetServices = this._parent.importNUOPCGeneric.routineSetServices;
        boolean _equals = Objects.equal(routineSetServices, null);
        if (_equals) {
          String _prefix = this._parent.prefix();
          String _plus = (_prefix + "_SetServices");
          routineSetServices = _plus;
          ASTUseStmtNode _aSTRef = this._parent.importNUOPCGeneric.getASTRef();
          CodeConcept.ensureImport(_aSTRef, "SetServices", routineSetServices);
        }
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("subroutine SetServices(");
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
        _builder.append("rc = ESMF_SUCCESS");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("! NUOPC_Driver registers the generic methods");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("call NUOPC_CompDerive(");
        _builder.append(this.paramGridComp, "    ");
        _builder.append(", ");
        _builder.append(routineSetServices, "    ");
        _builder.append(", rc=");
        _builder.append(this.paramRC, "    ");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this.paramRC);
        _builder.append(_ESMFErrorCheck, "    ");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("end subroutine");
        _builder.newLine();
        String code = _builder.toString();
        ASTModuleNode mn = this._parent.getASTRef();
        ASTSubroutineSubprogramNode ssn = CodeExtraction.<ASTSubroutineSubprogramNode>parseLiteralProgramUnit(code);
        IASTListNode<IModuleBodyConstruct> _moduleBody = mn.getModuleBody();
        _moduleBody.add(ssn);
        this.setASTRef(ssn);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.newLine();
        _builder_1.append("public SetServices");
        _builder_1.newLine();
        code = _builder_1.toString();
        IBodyConstruct _parseLiteralStatement = CodeExtraction.parseLiteralStatement(code);
        ASTAccessStmtNode tempNode = ((ASTAccessStmtNode) _parseLiteralStatement);
        IASTListNode<IModuleBodyConstruct> _moduleBody_1 = mn.getModuleBody();
        ASTContainsStmtNode csn = _moduleBody_1.<ASTContainsStmtNode>findLast(ASTContainsStmtNode.class);
        boolean _notEquals = (!Objects.equal(csn, null));
        if (_notEquals) {
          IASTListNode<IModuleBodyConstruct> _moduleBody_2 = mn.getModuleBody();
          _moduleBody_2.insertBefore(csn, tempNode);
        } else {
          IASTListNode<IModuleBodyConstruct> _moduleBody_3 = mn.getModuleBody();
          ASTImplicitStmtNode isn = _moduleBody_3.<ASTImplicitStmtNode>findLast(ASTImplicitStmtNode.class);
          boolean _notEquals_1 = (!Objects.equal(isn, null));
          if (_notEquals_1) {
            IASTListNode<IModuleBodyConstruct> _moduleBody_4 = mn.getModuleBody();
            _moduleBody_4.insertAfter(isn, tempNode);
          } else {
            IASTListNode<IModuleBodyConstruct> _moduleBody_5 = mn.getModuleBody();
            _moduleBody_5.add(tempNode);
          }
        }
        _xblockexpression = super.<CodeConcept<?, ?>>forward();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
