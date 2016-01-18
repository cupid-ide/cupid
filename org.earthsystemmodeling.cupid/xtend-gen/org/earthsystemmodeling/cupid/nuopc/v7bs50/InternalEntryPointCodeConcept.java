package org.earthsystemmodeling.cupid.nuopc.v7bs50;

import com.google.common.base.Objects;
import java.sql.ResultSet;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.EntryPointCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.SetServicesCodeConcept;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTIfStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IModuleBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

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
  public CodeConcept<P, ASTSubroutineSubprogramNode> reverse() {
    try {
      EntryPointCodeConcept<P> _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("esmf_reg_intentrypoint(_epId, ");
        CodeConcept<?, ASTModuleNode> _module = this.module();
        _builder.append(_module._id, "");
        _builder.append(", _epName, \'\"");
        _builder.append(this.phaseLabel, "");
        _builder.append("\"\', _regid).");
        ResultSet rs = this.execQuery(_builder);
        EntryPointCodeConcept<P> _xifexpression = null;
        boolean _next = rs.next();
        if (_next) {
          EntryPointCodeConcept<P> _xblockexpression_1 = null;
          {
            long _long = rs.getLong("_epId");
            this._id = _long;
            String _string = rs.getString("_epName");
            this.subroutineName = _string;
            long _long_1 = rs.getLong("_regid");
            BasicCodeConcept _newBasicCodeConcept = BasicCodeConcept.newBasicCodeConcept(this, _long_1);
            this.registration = _newBasicCodeConcept;
            rs.close();
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("esmf_entrypoint(_sid, ");
            long _parentID = this.parentID();
            _builder_1.append(_parentID, "");
            _builder_1.append(", _name, _param_gridcomp, _param_import, _param_export, _param_clock, _param_rc).");
            ResultSet _execQuery = this.execQuery(_builder_1);
            rs = _execQuery;
            boolean _next_1 = rs.next();
            if (_next_1) {
              String _string_1 = rs.getString("_param_gridcomp");
              this.paramGridComp = _string_1;
              String _string_2 = rs.getString("_param_import");
              this.paramImport = _string_2;
              String _string_3 = rs.getString("_param_export");
              this.paramExport = _string_3;
              String _string_4 = rs.getString("_param_clock");
              this.paramClock = _string_4;
            }
            rs.close();
            _xblockexpression_1 = this.reverseChildren();
          }
          _xifexpression = _xblockexpression_1;
        } else {
          Object _xblockexpression_2 = null;
          {
            rs.close();
            _xblockexpression_2 = null;
          }
          _xifexpression = ((EntryPointCodeConcept<P>)_xblockexpression_2);
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public IFortranAST forward() {
    try {
      IFortranAST _xblockexpression = null;
      {
        SetServicesCodeConcept<?> _setServices = this.setServices();
        boolean _equals = Objects.equal(_setServices, null);
        if (_equals) {
          throw new CodeGenerationException("A SetServices subroutine must exist first.");
        }
        final IFortranAST ast = this.getAST();
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
        _xblockexpression = ast;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
