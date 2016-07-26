package org.earthsystemmodeling.cupid.nuopc.v7r;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.earthsystemmodeling.cupid.nuopc.ESMFQuery;
import org.earthsystemmodeling.cupid.nuopc.v7r.EntryPointCodeConcept;
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
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IModuleBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public abstract class InternalEntryPointCodeConcept<P extends CodeConcept<?, ?>> extends EntryPointCodeConcept<P> {
  public InternalEntryPointCodeConcept(final P parent, final String phaseLabel) {
    super(parent, phaseLabel);
  }
  
  /**
   * subclasses using this must explicitly set the phaseLabel
   */
  public InternalEntryPointCodeConcept(final P parent) {
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
      IASTListNode<IBodyConstruct> _body = setServicesNode.getBody();
      Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
      final Function1<ASTCallStmtNode, Boolean> _function = (ASTCallStmtNode it) -> {
        return Boolean.valueOf((ASTQuery.eic(it.getSubroutineName().getText(), "NUOPC_CompSetInternalEntryPoint") && 
          ASTQuery.litArgExprByKeyword(it, "phaseLabelList").toLowerCase().contains(this.phaseLabel.toLowerCase())));
      };
      final ASTCallStmtNode registrationCall = IterableExtensions.<ASTCallStmtNode>findFirst(_filter, _function);
      boolean _equals_1 = Objects.equal(registrationCall, null);
      if (_equals_1) {
        return null;
      }
      CodeConcept<?, ASTModuleNode> _module = this.module();
      ASTModuleNode _aSTRef_1 = _module.getASTRef();
      Iterable<ASTSubroutineSubprogramNode> _findESMFEntryPoints = ESMFQuery.findESMFEntryPoints(_aSTRef_1);
      final Function1<ASTSubroutineSubprogramNode, Boolean> _function_1 = (ASTSubroutineSubprogramNode it) -> {
        ASTSubroutineStmtNode _subroutineStmt = it.getSubroutineStmt();
        ASTSubroutineNameNode _subroutineName = _subroutineStmt.getSubroutineName();
        Token _subroutineName_1 = _subroutineName.getSubroutineName();
        String _litArgExprByKeyword = ASTQuery.litArgExprByKeyword(registrationCall, "userRoutine");
        return Boolean.valueOf(ASTQuery.eic(_subroutineName_1, _litArgExprByKeyword));
      };
      final ASTSubroutineSubprogramNode epSubroutine = IterableExtensions.<ASTSubroutineSubprogramNode>findFirst(_findESMFEntryPoints, _function_1);
      boolean _equals_2 = Objects.equal(epSubroutine, null);
      if (_equals_2) {
        return null;
      }
      this.setASTRef(epSubroutine);
      ASTSubroutineStmtNode _subroutineStmt = epSubroutine.getSubroutineStmt();
      ASTSubroutineNameNode _subroutineName = _subroutineStmt.getSubroutineName();
      Token _subroutineName_1 = _subroutineName.getSubroutineName();
      String _text = _subroutineName_1.getText();
      this.subroutineName = _text;
      BasicCodeConcept<ASTCallStmtNode> _basicCodeConcept = new BasicCodeConcept<ASTCallStmtNode>(this, registrationCall);
      this.registration = _basicCodeConcept;
      ASTSubroutineStmtNode _subroutineStmt_1 = epSubroutine.getSubroutineStmt();
      IASTListNode<ASTSubroutineParNode> _subroutinePars = _subroutineStmt_1.getSubroutinePars();
      ASTSubroutineParNode _get = _subroutinePars.get(0);
      Token _variableName = _get.getVariableName();
      String _text_1 = _variableName.getText();
      this.paramGridComp = _text_1;
      ASTSubroutineStmtNode _subroutineStmt_2 = epSubroutine.getSubroutineStmt();
      IASTListNode<ASTSubroutineParNode> _subroutinePars_1 = _subroutineStmt_2.getSubroutinePars();
      ASTSubroutineParNode _get_1 = _subroutinePars_1.get(1);
      Token _variableName_1 = _get_1.getVariableName();
      String _text_2 = _variableName_1.getText();
      this.paramImport = _text_2;
      ASTSubroutineStmtNode _subroutineStmt_3 = epSubroutine.getSubroutineStmt();
      IASTListNode<ASTSubroutineParNode> _subroutinePars_2 = _subroutineStmt_3.getSubroutinePars();
      ASTSubroutineParNode _get_2 = _subroutinePars_2.get(2);
      Token _variableName_2 = _get_2.getVariableName();
      String _text_3 = _variableName_2.getText();
      this.paramExport = _text_3;
      ASTSubroutineStmtNode _subroutineStmt_4 = epSubroutine.getSubroutineStmt();
      IASTListNode<ASTSubroutineParNode> _subroutinePars_3 = _subroutineStmt_4.getSubroutinePars();
      ASTSubroutineParNode _get_3 = _subroutinePars_3.get(3);
      Token _variableName_3 = _get_3.getVariableName();
      String _text_4 = _variableName_3.getText();
      this.paramClock = _text_4;
      ASTSubroutineStmtNode _subroutineStmt_5 = epSubroutine.getSubroutineStmt();
      IASTListNode<ASTSubroutineParNode> _subroutinePars_4 = _subroutineStmt_5.getSubroutinePars();
      ASTSubroutineParNode _get_4 = _subroutinePars_4.get(4);
      Token _variableName_4 = _get_4.getVariableName();
      String _text_5 = _variableName_4.getText();
      this.paramRC = _text_5;
      _xblockexpression = this.reverseChildren();
    }
    return _xblockexpression;
  }
  
  /**
   * override reverse() {
   * 
   * var rs = '''esmf_reg_intentrypoint(_epId, «module()._id», _epName, '"«phaseLabel»"', _regid).'''.execQuery
   * 
   * if (rs != null && rs.next) {
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
   * rs?.close
   * null
   * }
   * }
   */
  @Override
  public CodeConcept<?, ?> forward() {
    try {
      InternalEntryPointCodeConcept<P> _xblockexpression = null;
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
        SetServicesCodeConcept<?> _setServices_1 = this.setServices();
        ASTSubroutineSubprogramNode setServicesNode = _setServices_1.getASTRef();
        boolean _notEquals = (!Objects.equal(setServicesNode, null));
        if (_notEquals) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.newLine();
          _builder.append("call NUOPC_CompSetInternalEntryPoint(");
          SetServicesCodeConcept<?> _setServices_2 = this.setServices();
          _builder.append(_setServices_2.paramGridComp, "");
          _builder.append(", ");
          _builder.append(this.methodType, "");
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
          _builder_1.append("if (ESMF_LogFoundError(rcToCheck=");
          _builder_1.append(this.paramRC, "");
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
          IBodyConstruct _parseLiteralStatement_1 = CodeExtraction.parseLiteralStatement(code);
          ASTIfStmtNode ifNode = ((ASTIfStmtNode) _parseLiteralStatement_1);
          IASTListNode<IBodyConstruct> _body_1 = setServicesNode.getBody();
          _body_1.add(ifNode);
        }
        _xblockexpression = this;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
