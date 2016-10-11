package org.earthsystemmodeling.cupid.nuopc.v7bs59;

import com.google.common.base.Objects;
import java.util.Set;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.annotation.Name;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCComponent;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTAccessStmtNode;
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
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IModuleBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Label(label = "SetServices")
@MappingType("subroutine")
@SuppressWarnings("all")
public class SetServicesCodeConcept<P extends NUOPCComponent> extends CodeConcept<P, ASTSubroutineSubprogramNode> {
  @Name
  public String subroutineName = "SetServices";
  
  public String paramGridComp = "gcomp";
  
  public String paramRC = "rc";
  
  @Label(label = "NUOPC_CompDerive")
  @MappingType("call")
  @Child
  public BasicCodeConcept<ASTCallStmtNode> callsCompDeriveID;
  
  public SetServicesCodeConcept(final P parent) {
    super(parent);
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
  
  @Override
  public CodeConcept<?, ?> forward() {
    SetServicesCodeConcept<P> _xblockexpression = null;
    {
      String routineSetServices = this._parent.importNUOPCGeneric.routineSetServices;
      boolean _equals = Objects.equal(routineSetServices, null);
      if (_equals) {
        String _prefix = this._parent.prefix();
        String _plus = (_prefix + "_SetServices");
        routineSetServices = _plus;
        ASTUseStmtNode _aSTRef = this._parent.importNUOPCGeneric.getASTRef();
        final ASTUseStmtNode genericUse = ((ASTUseStmtNode) _aSTRef);
        String _string = genericUse.toString();
        String tempCode = _string.trim();
        String _tempCode = tempCode;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(", &");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append(routineSetServices, "\t\t\t\t\t\t");
        _builder.append(" => SetServices");
        tempCode = (_tempCode + _builder);
        IBodyConstruct _parseLiteralStatement = CodeExtraction.parseLiteralStatement(tempCode);
        ASTUseStmtNode tempNode = ((ASTUseStmtNode) _parseLiteralStatement);
        genericUse.replaceWith(tempNode);
      }
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.newLine();
      _builder_1.append("subroutine SetServices(");
      _builder_1.append(this.paramGridComp, "");
      _builder_1.append(", ");
      _builder_1.append(this.paramRC, "");
      _builder_1.append(")");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("    ");
      _builder_1.append("type(ESMF_GridComp)  :: ");
      _builder_1.append(this.paramGridComp, "    ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("    ");
      _builder_1.append("integer, intent(out) :: ");
      _builder_1.append(this.paramRC, "    ");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("    ");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("rc = ESMF_SUCCESS");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("! NUOPC_Driver registers the generic methods");
      _builder_1.newLine();
      _builder_1.append("    ");
      _builder_1.append("call NUOPC_CompDerive(");
      _builder_1.append(this.paramGridComp, "    ");
      _builder_1.append(", ");
      _builder_1.append(routineSetServices, "    ");
      _builder_1.append(", rc=");
      _builder_1.append(this.paramRC, "    ");
      _builder_1.append(")");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("    ");
      _builder_1.append("if (ESMF_LogFoundError(rcToCheck=");
      _builder_1.append(this.paramRC, "    ");
      _builder_1.append(", msg=ESMF_LOGERR_PASSTHRU, &");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("      ");
      _builder_1.append("line=__LINE__, &");
      _builder_1.newLine();
      _builder_1.append("      ");
      _builder_1.append("file=__FILE__)) &");
      _builder_1.newLine();
      _builder_1.append("      ");
      _builder_1.append("return  ! bail out");
      _builder_1.newLine();
      _builder_1.append("      ");
      _builder_1.newLine();
      _builder_1.append("end subroutine");
      _builder_1.newLine();
      String code = _builder_1.toString();
      ASTModuleNode mn = this._parent.getASTRef();
      ASTSubroutineSubprogramNode ssn = CodeExtraction.<ASTSubroutineSubprogramNode>parseLiteralProgramUnit(code);
      IASTListNode<IModuleBodyConstruct> _moduleBody = mn.getModuleBody();
      _moduleBody.add(ssn);
      this.setASTRef(ssn);
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.newLine();
      _builder_2.append("public SetServices");
      _builder_2.newLine();
      code = _builder_2.toString();
      IBodyConstruct _parseLiteralStatement_1 = CodeExtraction.parseLiteralStatement(code);
      ASTAccessStmtNode tempNode_1 = ((ASTAccessStmtNode) _parseLiteralStatement_1);
      IASTListNode<IModuleBodyConstruct> _moduleBody_1 = mn.getModuleBody();
      ASTContainsStmtNode csn = _moduleBody_1.<ASTContainsStmtNode>findLast(ASTContainsStmtNode.class);
      boolean _notEquals = (!Objects.equal(csn, null));
      if (_notEquals) {
        IASTListNode<IModuleBodyConstruct> _moduleBody_2 = mn.getModuleBody();
        _moduleBody_2.insertBefore(csn, tempNode_1);
      } else {
        IASTListNode<IModuleBodyConstruct> _moduleBody_3 = mn.getModuleBody();
        ASTImplicitStmtNode isn = _moduleBody_3.<ASTImplicitStmtNode>findLast(ASTImplicitStmtNode.class);
        boolean _notEquals_1 = (!Objects.equal(isn, null));
        if (_notEquals_1) {
          IASTListNode<IModuleBodyConstruct> _moduleBody_4 = mn.getModuleBody();
          _moduleBody_4.insertAfter(isn, tempNode_1);
        } else {
          IASTListNode<IModuleBodyConstruct> _moduleBody_5 = mn.getModuleBody();
          _moduleBody_5.add(tempNode_1);
        }
      }
      _xblockexpression = this.reverse();
    }
    return _xblockexpression;
  }
}
