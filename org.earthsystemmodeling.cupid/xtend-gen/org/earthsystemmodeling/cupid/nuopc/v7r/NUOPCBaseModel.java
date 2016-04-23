package org.earthsystemmodeling.cupid.nuopc.v7r;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
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
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

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
        ASTSubroutineSubprogramNode _aSTRef = this._parent.getASTRef();
        IASTListNode<IBodyConstruct> _body = _aSTRef.getBody();
        Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
        final Function1<ASTCallStmtNode, Boolean> _function = new Function1<ASTCallStmtNode, Boolean>() {
          @Override
          public Boolean apply(final ASTCallStmtNode c) {
            Token _subroutineName = c.getSubroutineName();
            return Boolean.valueOf(ASTQuery.eic(_subroutineName, "NUOPC_Advertise"));
          }
        };
        Iterable<ASTCallStmtNode> _filter_1 = IterableExtensions.<ASTCallStmtNode>filter(_filter, _function);
        final Procedure1<ASTCallStmtNode> _function_1 = new Procedure1<ASTCallStmtNode>() {
          @Override
          public void apply(final ASTCallStmtNode it) {
            NUOPCBaseModel.AdvertiseField advField = new NUOPCBaseModel.AdvertiseField(AdvertiseField.this._parent);
            String _litArgExprByIdx = ASTQuery.litArgExprByIdx(it, 0);
            advField.state = _litArgExprByIdx;
            String _litArgExprByIdx_1 = ASTQuery.litArgExprByIdx(it, 1);
            advField.standardName = _litArgExprByIdx_1;
            String _litArgExprByKeyword = ASTQuery.litArgExprByKeyword(it, "name");
            advField.name = _litArgExprByKeyword;
            advField.setASTRef(it);
            retList.add(advField);
          }
        };
        IterableExtensions.<ASTCallStmtNode>forEach(_filter_1, _function_1);
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
        _builder.append(_paramch, "");
        _builder.append(", StandardName=");
        CharSequence _paramch_1 = this.paramch(this.standardName);
        _builder.append(_paramch_1, "");
        {
          boolean _notEquals = (!Objects.equal(this.name, null));
          if (_notEquals) {
            _builder.append(", name=");
            CharSequence _paramch_2 = this.paramch(this.name);
            _builder.append(_paramch_2, "");
          }
        }
        _builder.append(", rc=");
        _builder.append(this._parent.paramRC, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this._parent.paramRC);
        _builder.append(_ESMFErrorCheck, "");
        _builder.newLineIfNotEmpty();
        String code = _builder.toString();
        final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
        final ASTSubroutineSubprogramNode ssn = this._parent.getASTRef();
        IASTListNode<IBodyConstruct> _body = ssn.getBody();
        _body.addAll(stmts);
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
        ASTSubroutineSubprogramNode _aSTRef = this._parent.getASTRef();
        IASTListNode<IBodyConstruct> _body = _aSTRef.getBody();
        Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
        final Function1<ASTCallStmtNode, Boolean> _function = new Function1<ASTCallStmtNode, Boolean>() {
          @Override
          public Boolean apply(final ASTCallStmtNode c) {
            Token _subroutineName = c.getSubroutineName();
            return Boolean.valueOf(ASTQuery.eic(_subroutineName, "NUOPC_Realize"));
          }
        };
        Iterable<ASTCallStmtNode> _filter_1 = IterableExtensions.<ASTCallStmtNode>filter(_filter, _function);
        final Procedure1<ASTCallStmtNode> _function_1 = new Procedure1<ASTCallStmtNode>() {
          @Override
          public void apply(final ASTCallStmtNode it) {
            NUOPCBaseModel.RealizeField relField = new NUOPCBaseModel.RealizeField(RealizeField.this._parent);
            String _litArgExprByIdx = ASTQuery.litArgExprByIdx(it, 0);
            relField.state = _litArgExprByIdx;
            String _litArgExprByIdx_1 = ASTQuery.litArgExprByIdx(it, 1);
            relField.field = _litArgExprByIdx_1;
            relField.setASTRef(it);
            retList.add(relField);
          }
        };
        IterableExtensions.<ASTCallStmtNode>forEach(_filter_1, _function_1);
        _xblockexpression = retList;
      }
      return _xblockexpression;
    }
    
    @Override
    public CodeConcept<?, ?> forward() {
      try {
        CodeConcept<?, ?> _xblockexpression = null;
        {
          boolean _or = false;
          boolean _or_1 = false;
          boolean _or_2 = false;
          boolean _equals = Objects.equal(this.field, null);
          if (_equals) {
            _or_2 = true;
          } else {
            boolean _equals_1 = Objects.equal(this.fieldName, null);
            _or_2 = _equals_1;
          }
          if (_or_2) {
            _or_1 = true;
          } else {
            boolean _equals_2 = Objects.equal(this.grid, null);
            _or_1 = _equals_2;
          }
          if (_or_1) {
            _or = true;
          } else {
            boolean _equals_3 = Objects.equal(this.state, null);
            _or = _equals_3;
          }
          if (_or) {
            throw new CodeGenerationException("Missing parameters required to generate Realize Field.");
          }
          final ASTSubroutineSubprogramNode ssn = this._parent.getASTRef();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("type(ESMF_Field) :: ");
          _builder.append(this.field, "");
          CodeConcept.addTypeDeclaration(_builder.toString(), ssn, true);
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.newLine();
          _builder_1.append("! field ");
          _builder_1.append(this.fieldName, "");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append(this.field, "");
          _builder_1.append(" = ESMF_FieldCreate(name=");
          _builder_1.append(this.fieldName, "");
          _builder_1.append(", grid=");
          _builder_1.append(this.grid, "");
          _builder_1.append(", &");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("  ");
          _builder_1.append("typekind=ESMF_TYPEKIND_R8, rc=");
          _builder_1.append(this._parent.paramRC, "  ");
          _builder_1.append(")");
          _builder_1.newLineIfNotEmpty();
          CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this._parent.paramRC);
          _builder_1.append(_ESMFErrorCheck, "");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t");
          _builder_1.newLine();
          _builder_1.append("call NUOPC_Realize(");
          CharSequence _paramch = this.paramch(this.state);
          _builder_1.append(_paramch, "");
          _builder_1.append(", field=");
          CharSequence _paramch_1 = this.paramch(this.field);
          _builder_1.append(_paramch_1, "");
          _builder_1.append(", rc=");
          _builder_1.append(this._parent.paramRC, "");
          _builder_1.append(")");
          _builder_1.newLineIfNotEmpty();
          CharSequence _ESMFErrorCheck_1 = ESMFCodeTemplates.ESMFErrorCheck(this._parent.paramRC);
          _builder_1.append(_ESMFErrorCheck_1, "");
          _builder_1.newLineIfNotEmpty();
          String code = _builder_1.toString();
          final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
          IASTListNode<IBodyConstruct> _body = ssn.getBody();
          _body.addAll(stmts);
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
          String _name_1 = high.getName();
          this.field = _name_1;
          Grid _grid_1 = high.getGrid();
          String _name_2 = _grid_1.getName();
          this.grid = _name_2;
          _xblockexpression = this.state = state;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
}
