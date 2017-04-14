package org.earthsystemmodeling.cupid.nuopc.v7r;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.NUOPC.Field;
import org.earthsystemmodeling.cupid.NUOPC.Grid;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.earthsystemmodeling.cupid.nuopc.ESMFCodeTemplates;
import org.earthsystemmodeling.cupid.nuopc.v7r.EntryPointCodeConcept;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class NUOPCBaseModel {
  @Label(label = "Advertise Field")
  @MappingType("call")
  public static class AdvertiseField extends CodeConcept<EntryPointCodeConcept<?>, ASTCallStmtNode> {
    public String state;
    
    public String standardName;
    
    public String name;
    
    public AdvertiseField(final EntryPointCodeConcept<?> parent) {
      super(parent);
      parent.setOrAddChild(this);
      this.state = this._parent.paramImport;
      this.standardName = "\"StandardName\"";
      this.name = null;
    }
    
    @Override
    public String name() {
      return ((this.state + " / ") + this.standardName);
    }
    
    @Override
    public List reverseMultiple() {
      ArrayList<NUOPCBaseModel.AdvertiseField> _xblockexpression = null;
      {
        final ArrayList<NUOPCBaseModel.AdvertiseField> retList = CollectionLiterals.<NUOPCBaseModel.AdvertiseField>newArrayList();
        final Function1<ASTCallStmtNode, Boolean> _function = (ASTCallStmtNode c) -> {
          return Boolean.valueOf(ASTQuery.eic(c.getSubroutineName(), "NUOPC_Advertise"));
        };
        final Consumer<ASTCallStmtNode> _function_1 = (ASTCallStmtNode it) -> {
          NUOPCBaseModel.AdvertiseField advField = new NUOPCBaseModel.AdvertiseField(this._parent);
          advField.state = ASTQuery.litArgExprByIdx(it, 0);
          advField.standardName = ASTQuery.litArgExprByIdx(it, 1);
          advField.name = ASTQuery.litArgExprByKeyword(it, "name");
          advField.setASTRef(it);
          retList.add(advField);
        };
        IterableExtensions.<ASTCallStmtNode>filter(Iterables.<ASTCallStmtNode>filter(this._parent.getASTRef().getBody(), ASTCallStmtNode.class), _function).forEach(_function_1);
        _xblockexpression = retList;
      }
      return _xblockexpression;
    }
    
    @Override
    public CodeConcept<?, ?> forward() {
      NUOPCBaseModel.AdvertiseField _xblockexpression = null;
      {
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("call NUOPC_Advertise(");
        CharSequence _paramch = this.paramch(this.state);
        _builder.append(_paramch);
        _builder.append(", StandardName=");
        CharSequence _paramch_1 = this.paramch(this.standardName);
        _builder.append(_paramch_1);
        {
          boolean _notEquals = (!Objects.equal(this.name, null));
          if (_notEquals) {
            _builder.append(", name=");
            CharSequence _paramch_2 = this.paramch(this.name);
            _builder.append(_paramch_2);
          }
        }
        _builder.append(", rc=");
        _builder.append(this._parent.paramRC);
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this._parent.paramRC);
        _builder.append(_ESMFErrorCheck);
        _builder.newLineIfNotEmpty();
        String code = _builder.toString();
        final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
        final ASTSubroutineSubprogramNode ssn = this._parent.getASTRef();
        ssn.getBody().addAll(stmts);
        IBodyConstruct _get = stmts.get(0);
        this.setASTRef(((ASTCallStmtNode) _get));
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Realize Field")
  @MappingType("call")
  public static class RealizeField extends CodeConcept<EntryPointCodeConcept<?>, ASTCallStmtNode> {
    public String state;
    
    public String field;
    
    public String grid;
    
    public String fieldName;
    
    public RealizeField(final EntryPointCodeConcept<?> parent) {
      super(parent);
      parent.setOrAddChild(this);
      this.state = this._parent.paramImport;
      this.field = "field";
      this.grid = "grid";
      this.fieldName = "\"field_name\"";
    }
    
    @Override
    public String name() {
      return ((this.state + " / ") + this.fieldName);
    }
    
    @Override
    public List reverseMultiple() {
      ArrayList<NUOPCBaseModel.RealizeField> _xblockexpression = null;
      {
        final ArrayList<NUOPCBaseModel.RealizeField> retList = CollectionLiterals.<NUOPCBaseModel.RealizeField>newArrayList();
        final Function1<ASTCallStmtNode, Boolean> _function = (ASTCallStmtNode c) -> {
          return Boolean.valueOf(ASTQuery.eic(c.getSubroutineName(), "NUOPC_Realize"));
        };
        final Consumer<ASTCallStmtNode> _function_1 = (ASTCallStmtNode it) -> {
          NUOPCBaseModel.RealizeField relField = new NUOPCBaseModel.RealizeField(this._parent);
          relField.state = ASTQuery.litArgExprByIdx(it, 0);
          relField.field = ASTQuery.litArgExprByIdx(it, 1);
          relField.setASTRef(it);
          retList.add(relField);
        };
        IterableExtensions.<ASTCallStmtNode>filter(Iterables.<ASTCallStmtNode>filter(this._parent.getASTRef().getBody(), ASTCallStmtNode.class), _function).forEach(_function_1);
        _xblockexpression = retList;
      }
      return _xblockexpression;
    }
    
    @Override
    public CodeConcept<?, ?> forward() {
      try {
        CodeConcept<?, ?> _xblockexpression = null;
        {
          if ((((Objects.equal(this.field, null) || Objects.equal(this.fieldName, null)) || Objects.equal(this.grid, null)) || Objects.equal(this.state, null))) {
            throw new CodeGenerationException("Missing parameters required to generate Realize Field.");
          }
          final ASTSubroutineSubprogramNode ssn = this._parent.getASTRef();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("type(ESMF_Field) :: ");
          _builder.append(this.field);
          CodeConcept.addTypeDeclaration(_builder.toString(), ssn, true);
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.newLine();
          _builder_1.append("! field ");
          _builder_1.append(this.fieldName);
          _builder_1.newLineIfNotEmpty();
          _builder_1.append(this.field);
          _builder_1.append(" = ESMF_FieldCreate(name=");
          _builder_1.append(this.fieldName);
          _builder_1.append(", grid=");
          _builder_1.append(this.grid);
          _builder_1.append(", &");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("  ");
          _builder_1.append("typekind=ESMF_TYPEKIND_R8, rc=");
          _builder_1.append(this._parent.paramRC, "  ");
          _builder_1.append(")");
          _builder_1.newLineIfNotEmpty();
          CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this._parent.paramRC);
          _builder_1.append(_ESMFErrorCheck);
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t");
          _builder_1.newLine();
          _builder_1.append("call NUOPC_Realize(");
          CharSequence _paramch = this.paramch(this.state);
          _builder_1.append(_paramch);
          _builder_1.append(", field=");
          CharSequence _paramch_1 = this.paramch(this.field);
          _builder_1.append(_paramch_1);
          _builder_1.append(", rc=");
          _builder_1.append(this._parent.paramRC);
          _builder_1.append(")");
          _builder_1.newLineIfNotEmpty();
          CharSequence _ESMFErrorCheck_1 = ESMFCodeTemplates.ESMFErrorCheck(this._parent.paramRC);
          _builder_1.append(_ESMFErrorCheck_1);
          _builder_1.newLineIfNotEmpty();
          String code = _builder_1.toString();
          final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
          ssn.getBody().addAll(stmts);
          _xblockexpression = super.<CodeConcept<?, ?>>forward();
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    public String forward(final Field high, final String state) {
      try {
        String _xblockexpression = null;
        {
          Grid _grid = high.getGrid();
          boolean _equals = Objects.equal(_grid, null);
          if (_equals) {
            throw new CodeGenerationException("Field must have associated grid");
          }
          String _name = high.getName();
          String _plus = ("\"" + _name);
          String _plus_1 = (_plus + "\"");
          this.fieldName = _plus_1;
          this.field = high.getName();
          this.grid = high.getGrid().getName();
          _xblockexpression = this.state = state;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
}
