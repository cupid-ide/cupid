package org.earthsystemmodeling.cupid.nuopc.v7bs59;

import com.google.common.base.Objects;
import java.sql.ResultSet;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.annotation.Name;
import org.earthsystemmodeling.cupid.annotation.Prop;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTOnlyNode;
import org.eclipse.photran.internal.core.parser.ASTRenameNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@Label(label = "NUOPC Driver")
@MappingType("module")
@SuppressWarnings("all")
public abstract class NUOPCComponent extends CodeConcept<CodeConcept<?, ?>, ASTModuleNode> {
  @Label(label = "Generic Import")
  @MappingType("uses")
  public static class GenericImport extends CodeConcept<NUOPCComponent, ASTUseStmtNode> {
    @Name
    public String genericComp;
    
    @Prop
    @Label(label = "routineSetServices")
    public String routineSetServices;
    
    public GenericImport(final NUOPCComponent parent, final long id) {
      super(parent);
      this._id = id;
    }
    
    public GenericImport(final NUOPCComponent parent, final ASTUseStmtNode astRef) {
      super(parent);
      this._astRef = astRef;
    }
    
    @Override
    public NUOPCComponent.GenericImport reverse() {
      NUOPCComponent.GenericImport _xblockexpression = null;
      {
        ASTUseStmtNode _aSTRef = this.getASTRef();
        Token _name = null;
        if (_aSTRef!=null) {
          _name=_aSTRef.getName();
        }
        String _text = _name.getText();
        this.genericComp = _text;
        ASTUseStmtNode _aSTRef_1 = this.getASTRef();
        IASTListNode<ASTOnlyNode> _onlyList = null;
        if (_aSTRef_1!=null) {
          _onlyList=_aSTRef_1.getOnlyList();
        }
        ASTOnlyNode _findFirst = null;
        if (_onlyList!=null) {
          final Function1<ASTOnlyNode, Boolean> _function = new Function1<ASTOnlyNode, Boolean>() {
            @Override
            public Boolean apply(final ASTOnlyNode it) {
              Token _name = it.getName();
              String _text = _name.getText();
              return Boolean.valueOf(_text.equalsIgnoreCase("SetServices"));
            }
          };
          _findFirst=IterableExtensions.<ASTOnlyNode>findFirst(_onlyList, _function);
        }
        ASTOnlyNode on = _findFirst;
        boolean _notEquals = (!Objects.equal(on, null));
        if (_notEquals) {
          String _xifexpression = null;
          boolean _isRenamed = on.isRenamed();
          if (_isRenamed) {
            Token _newName = on.getNewName();
            _xifexpression = _newName.getText();
          } else {
            Token _name_1 = on.getName();
            _xifexpression = _name_1.getText();
          }
          this.routineSetServices = _xifexpression;
        } else {
          ASTUseStmtNode _aSTRef_2 = this.getASTRef();
          IASTListNode<ASTRenameNode> _renameList = null;
          if (_aSTRef_2!=null) {
            _renameList=_aSTRef_2.getRenameList();
          }
          ASTRenameNode _findFirst_1 = null;
          if (_renameList!=null) {
            final Function1<ASTRenameNode, Boolean> _function_1 = new Function1<ASTRenameNode, Boolean>() {
              @Override
              public Boolean apply(final ASTRenameNode it) {
                Token _name = it.getName();
                String _text = _name.getText();
                return Boolean.valueOf(_text.equalsIgnoreCase("SetServices"));
              }
            };
            _findFirst_1=IterableExtensions.<ASTRenameNode>findFirst(_renameList, _function_1);
          }
          ASTRenameNode rn = _findFirst_1;
          boolean _notEquals_1 = (!Objects.equal(rn, null));
          if (_notEquals_1) {
            Token _newName_1 = rn.getNewName();
            String _text_1 = _newName_1.getText();
            this.routineSetServices = _text_1;
          }
        }
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    public NUOPCComponent.GenericImport reverseOLD() {
      try {
        NUOPCComponent.GenericImport _xblockexpression = null;
        {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("uses(");
          _builder.append(this._id, "");
          _builder.append(", _mid, _genericComp),");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t\t");
          _builder.append("(usesEntity(_, ");
          _builder.append(this._id, "\t\t\t\t\t\t");
          _builder.append(", \'SetServices\', _newName, _) ; true).");
          ResultSet rs = this.execQuery(_builder);
          NUOPCComponent.GenericImport _xifexpression = null;
          boolean _next = rs.next();
          if (_next) {
            NUOPCComponent.GenericImport _xblockexpression_1 = null;
            {
              String _string = rs.getString("_genericComp");
              this.genericComp = _string;
              String _string_1 = rs.getString("_newName");
              this.routineSetServices = _string_1;
              rs.close();
              _xblockexpression_1 = this;
            }
            _xifexpression = _xblockexpression_1;
          } else {
            Object _xblockexpression_2 = null;
            {
              rs.close();
              _xblockexpression_2 = null;
            }
            _xifexpression = ((NUOPCComponent.GenericImport)_xblockexpression_2);
          }
          _xblockexpression = _xifexpression;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "ESMF Import", sort = 1)
  @Child(forward = false)
  @MappingType("uses")
  public BasicCodeConcept<ASTUseStmtNode> importESMF;
  
  @Label(label = "NUOPC Import", sort = 2)
  @Child(forward = false)
  @MappingType("uses")
  public BasicCodeConcept<ASTUseStmtNode> importNUOPC;
  
  @Label(label = "Generic Import", sort = 3)
  @Child
  @MappingType("uses")
  public NUOPCComponent.GenericImport importNUOPCGeneric;
  
  public NUOPCComponent(final CodeConcept<?, ?> parent) {
    super(parent);
  }
  
  public abstract String prefix();
}
