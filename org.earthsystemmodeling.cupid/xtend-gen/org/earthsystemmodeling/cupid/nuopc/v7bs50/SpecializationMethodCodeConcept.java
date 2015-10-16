package org.earthsystemmodeling.cupid.nuopc.v7bs50;

import com.google.common.base.Objects;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.annotation.Name;
import org.earthsystemmodeling.cupid.annotation.Prop;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.NUOPCComponent;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.SetServicesCodeConcept;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTIfStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IModuleBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public abstract class SpecializationMethodCodeConcept<P extends CodeConcept<?, ?>> extends CodeConcept<P, ASTSubroutineSubprogramNode> {
  @Name
  public String subroutineName = "SpecializationMethod";
  
  public String specLabel = "label_SpecializationLabel";
  
  @Label(label = "Phase Label")
  @Prop
  public String specPhaseLabel = "EMPTY";
  
  @Label(label = "Registration")
  @MappingType("call")
  @Child
  public BasicCodeConcept registration;
  
  public String paramGridComp = "driver";
  
  public String paramRC = "rc";
  
  private String labelComponent;
  
  private String labelName;
  
  private static PreparedStatement stmtRegspec = null;
  
  public SpecializationMethodCodeConcept(final P parent, final String labelComponent, final String labelName) {
    super(parent);
    this.labelComponent = labelComponent;
    this.labelName = labelName;
    boolean _equals = Objects.equal(SpecializationMethodCodeConcept.stmtRegspec, null);
    if (_equals) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("SELECT * FROM esmf_regspec ");
      _builder.newLine();
      _builder.append("WHERE mod_id=? AND genericUse=? AND specLabelOrig=?");
      PreparedStatement _prepareStatement = this._codeDB.prepareStatement(_builder.toString());
      SpecializationMethodCodeConcept.stmtRegspec = _prepareStatement;
    }
  }
  
  @Override
  public SpecializationMethodCodeConcept<P> reverse() {
    try {
      SpecializationMethodCodeConcept<P> _xblockexpression = null;
      {
        long _parentID = this.parentID();
        SpecializationMethodCodeConcept.stmtRegspec.setLong(1, _parentID);
        SpecializationMethodCodeConcept.stmtRegspec.setString(2, this.labelComponent);
        SpecializationMethodCodeConcept.stmtRegspec.setString(3, this.labelName);
        ResultSet rs = SpecializationMethodCodeConcept.stmtRegspec.executeQuery();
        SpecializationMethodCodeConcept<P> _xifexpression = null;
        boolean _next = rs.next();
        if (_next) {
          SpecializationMethodCodeConcept<P> _xblockexpression_1 = null;
          {
            long _long = rs.getLong("id");
            this._id = _long;
            String _string = rs.getString("name");
            this.subroutineName = _string;
            String _string_1 = rs.getString("specLabelExpr");
            this.specLabel = _string_1;
            String _string_2 = rs.getString("specPhaseLabel");
            this.specPhaseLabel = _string_2;
            String _string_3 = rs.getString("param_gcomp");
            this.paramGridComp = _string_3;
            String _string_4 = rs.getString("param_rc");
            this.paramRC = _string_4;
            long _long_1 = rs.getLong("reg_id");
            BasicCodeConcept _newBasicCodeConcept = BasicCodeConcept.newBasicCodeConcept(this, _long_1);
            this.registration = _newBasicCodeConcept;
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
          _xifexpression = ((SpecializationMethodCodeConcept<P>)_xblockexpression_2);
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public List reverseMultiple() {
    try {
      ArrayList<SpecializationMethodCodeConcept> _xblockexpression = null;
      {
        ArrayList<SpecializationMethodCodeConcept> retList = CollectionLiterals.<SpecializationMethodCodeConcept>newArrayList();
        long _parentID = this.parentID();
        SpecializationMethodCodeConcept.stmtRegspec.setLong(1, _parentID);
        SpecializationMethodCodeConcept.stmtRegspec.setString(2, this.labelComponent);
        SpecializationMethodCodeConcept.stmtRegspec.setString(3, this.labelName);
        ResultSet rs = SpecializationMethodCodeConcept.stmtRegspec.executeQuery();
        while (rs.next()) {
          {
            Class<? extends SpecializationMethodCodeConcept> _class = this.getClass();
            SpecializationMethodCodeConcept smcc = _class.newInstance();
            smcc.init(this._parent);
            long _long = rs.getLong("id");
            smcc._id = _long;
            String _string = rs.getString("name");
            smcc.subroutineName = _string;
            String _string_1 = rs.getString("specLabelExpr");
            smcc.specLabel = _string_1;
            String _string_2 = rs.getString("specPhaseLabel");
            smcc.specPhaseLabel = _string_2;
            String _string_3 = rs.getString("param_gcomp");
            smcc.paramGridComp = _string_3;
            String _string_4 = rs.getString("param_rc");
            smcc.paramRC = _string_4;
            long _long_1 = rs.getLong("reg_id");
            BasicCodeConcept _newBasicCodeConcept = BasicCodeConcept.newBasicCodeConcept(this, _long_1);
            smcc.registration = _newBasicCodeConcept;
            SpecializationMethodCodeConcept _reverseChildren = smcc.reverseChildren();
            smcc = _reverseChildren;
            boolean _notEquals = (!Objects.equal(smcc, null));
            if (_notEquals) {
              retList.add(smcc);
            }
          }
        }
        rs.close();
        _xblockexpression = retList;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
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
        NUOPCComponent.GenericImport _genericUse = this.genericUse();
        ASTUseStmtNode _aSTRef = _genericUse.getASTRef();
        ASTUseStmtNode usesNUOPCDriver = ((ASTUseStmtNode) _aSTRef);
        String _string = usesNUOPCDriver.toString();
        String tempCode = _string.trim();
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
        IBodyConstruct _parseLiteralStatement = CodeExtraction.parseLiteralStatement(tempCode);
        ASTUseStmtNode tempNode = ((ASTUseStmtNode) _parseLiteralStatement);
        usesNUOPCDriver.replaceWith(tempNode);
        SetServicesCodeConcept<?> _setServices_1 = this.setServices();
        ASTSubroutineSubprogramNode setServicesNode = _setServices_1.getASTRef();
        boolean _notEquals = (!Objects.equal(setServicesNode, null));
        if (_notEquals) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.newLine();
          _builder_1.append("call NUOPC_CompSpecialize(");
          SetServicesCodeConcept<?> _setServices_2 = this.setServices();
          _builder_1.append(_setServices_2.paramGridComp, "");
          _builder_1.append(", specLabel=");
          _builder_1.append(this.specLabel, "");
          _builder_1.append(", &");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t");
          _builder_1.append("specRoutine=");
          _builder_1.append(this.subroutineName, "\t");
          _builder_1.append(", rc=");
          SetServicesCodeConcept<?> _setServices_3 = this.setServices();
          _builder_1.append(_setServices_3.paramRC, "\t");
          _builder_1.append(")");
          _builder_1.newLineIfNotEmpty();
          code = _builder_1.toString();
          IBodyConstruct _parseLiteralStatement_1 = CodeExtraction.parseLiteralStatement(code);
          ASTCallStmtNode regCall = ((ASTCallStmtNode) _parseLiteralStatement_1);
          IASTListNode<IBodyConstruct> _body = setServicesNode.getBody();
          _body.add(regCall);
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("if (ESMF_LogFoundError(rcToCheck=");
          _builder_2.append(this.paramRC, "");
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
          IBodyConstruct _parseLiteralStatement_2 = CodeExtraction.parseLiteralStatement(code);
          ASTIfStmtNode ifNode = ((ASTIfStmtNode) _parseLiteralStatement_2);
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
