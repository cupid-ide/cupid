package org.earthsystemmodeling.cupid.nuopc.v7bs59;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.annotation.Name;
import org.earthsystemmodeling.cupid.annotation.Prop;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.core.resources.IResource;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTExecutableProgramNode;
import org.eclipse.photran.internal.core.parser.ASTListNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNameNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTModuleStmtNode;
import org.eclipse.photran.internal.core.parser.ASTOnlyNode;
import org.eclipse.photran.internal.core.parser.ASTRenameNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IModuleBodyConstruct;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
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
          final Function1<ASTOnlyNode, Boolean> _function = (ASTOnlyNode it) -> {
            Token _name_1 = it.getName();
            String _text_1 = _name_1.getText();
            return Boolean.valueOf(_text_1.equalsIgnoreCase("SetServices"));
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
            final Function1<ASTRenameNode, Boolean> _function_1 = (ASTRenameNode it) -> {
              Token _name_2 = it.getName();
              String _text_1 = _name_2.getText();
              return Boolean.valueOf(_text_1.equalsIgnoreCase("SetServices"));
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
  }
  
  protected String genericImport;
  
  public String name;
  
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
  
  public NUOPCComponent(final CodeConcept<?, ?> parent, final String genericImport) {
    this(parent, null, genericImport);
  }
  
  public NUOPCComponent(final CodeConcept<?, ?> parent, final IResource context, final String genericImport) {
    super(parent, context);
    try {
      this.genericImport = genericImport;
      boolean _equals = Objects.equal(genericImport, null);
      if (_equals) {
        throw new CodeGenerationException("Name of generic import of component cannot be null");
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public abstract String prefix();
  
  @Override
  public String name() {
    String _name = null;
    if (this._context!=null) {
      _name=this._context.getName();
    }
    String _plus = ((this.name + " (") + _name);
    return (_plus + ")");
  }
  
  @Override
  public CodeConcept<?, ?> reverse() {
    NUOPCComponent _xblockexpression = null;
    {
      IFortranAST ast = this.getAST();
      ASTExecutableProgramNode _root = ast.getRoot();
      IASTListNode<IProgramUnit> _programUnitList = null;
      if (_root!=null) {
        _programUnitList=_root.getProgramUnitList();
      }
      Iterable<ASTModuleNode> _filter = null;
      if (_programUnitList!=null) {
        _filter=Iterables.<ASTModuleNode>filter(_programUnitList, ASTModuleNode.class);
      }
      ASTModuleNode _findFirst = null;
      if (_filter!=null) {
        final Function1<ASTModuleNode, Boolean> _function = (ASTModuleNode it) -> {
          IASTListNode<IModuleBodyConstruct> _moduleBody = it.getModuleBody();
          Iterable<ASTUseStmtNode> _filter_1 = null;
          if (_moduleBody!=null) {
            _filter_1=Iterables.<ASTUseStmtNode>filter(_moduleBody, ASTUseStmtNode.class);
          }
          boolean _exists = false;
          if (_filter_1!=null) {
            final Function1<ASTUseStmtNode, Boolean> _function_1 = (ASTUseStmtNode it_1) -> {
              Token _name = it_1.getName();
              String _text = _name.getText();
              return Boolean.valueOf(ASTQuery.eic(_text, this.genericImport));
            };
            _exists=IterableExtensions.<ASTUseStmtNode>exists(_filter_1, _function_1);
          }
          return Boolean.valueOf(_exists);
        };
        _findFirst=IterableExtensions.<ASTModuleNode>findFirst(_filter, _function);
      }
      this._astRef = _findFirst;
      NUOPCComponent _xifexpression = null;
      boolean _notEquals = (!Objects.equal(this._astRef, null));
      if (_notEquals) {
        NUOPCComponent _xblockexpression_1 = null;
        {
          ASTModuleStmtNode _moduleStmt = this._astRef.getModuleStmt();
          ASTModuleNameNode _moduleName = _moduleStmt.getModuleName();
          Token _moduleName_1 = _moduleName.getModuleName();
          String _text = _moduleName_1.getText();
          this.name = _text;
          IASTListNode<IModuleBodyConstruct> _moduleBody = this._astRef.getModuleBody();
          Iterable<ASTUseStmtNode> _filter_1 = Iterables.<ASTUseStmtNode>filter(_moduleBody, ASTUseStmtNode.class);
          final Consumer<ASTUseStmtNode> _function_1 = (ASTUseStmtNode it) -> {
            Token _name = it.getName();
            String _text_1 = _name.getText();
            boolean _eic = ASTQuery.eic(_text_1, "ESMF");
            if (_eic) {
              BasicCodeConcept<ASTUseStmtNode> _basicCodeConcept = new BasicCodeConcept<ASTUseStmtNode>(this, it);
              this.importESMF = _basicCodeConcept;
            } else {
              Token _name_1 = it.getName();
              String _text_2 = _name_1.getText();
              boolean _eic_1 = ASTQuery.eic(_text_2, "NUOPC");
              if (_eic_1) {
                BasicCodeConcept<ASTUseStmtNode> _basicCodeConcept_1 = new BasicCodeConcept<ASTUseStmtNode>(this, it);
                this.importNUOPC = _basicCodeConcept_1;
              } else {
                Token _name_2 = it.getName();
                String _text_3 = _name_2.getText();
                boolean _eic_2 = ASTQuery.eic(_text_3, this.genericImport);
                if (_eic_2) {
                  NUOPCComponent.GenericImport _genericImport = new NUOPCComponent.GenericImport(this, it);
                  NUOPCComponent.GenericImport _reverse = _genericImport.reverse();
                  this.importNUOPCGeneric = _reverse;
                }
              }
            }
          };
          _filter_1.forEach(_function_1);
          _xblockexpression_1 = this.<NUOPCComponent>reverseChildren();
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public <T extends NUOPCComponent> T reverseChildren() {
    return ((T) this);
  }
  
  @Override
  public NUOPCComponent forward() {
    try {
      NUOPCComponent _xblockexpression = null;
      {
        boolean _equals = Objects.equal(this.name, null);
        if (_equals) {
          throw new CodeGenerationException("No component name specified");
        }
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("module ");
        _builder.append(this.name, "");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("use ESMF");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("use NUOPC");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("use ");
        _builder.append(this.genericImport, "\t");
        _builder.append(", only: &");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        String _prefix = this.prefix();
        _builder.append(_prefix, "\t\t");
        _builder.append("_SetServices => SetServices");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("implicit none");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("contains");
        _builder.newLine();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("end module");
        _builder.newLine();
        String code = _builder.toString();
        ASTModuleNode moduleNode = CodeExtraction.<ASTModuleNode>parseLiteralProgramUnit(code);
        this.setASTRef(moduleNode);
        ASTListNode<IProgramUnit> pul = new ASTListNode<IProgramUnit>();
        pul.add(moduleNode);
        IFortranAST _aST = this.getAST();
        ASTExecutableProgramNode _root = _aST.getRoot();
        _root.setProgramUnitList(pul);
        IASTListNode<IModuleBodyConstruct> _moduleBody = moduleNode.getModuleBody();
        Iterable<ASTUseStmtNode> _filter = Iterables.<ASTUseStmtNode>filter(_moduleBody, ASTUseStmtNode.class);
        final Consumer<ASTUseStmtNode> _function = (ASTUseStmtNode it) -> {
          Token _name = it.getName();
          String _text = _name.getText();
          boolean _eic = ASTQuery.eic(_text, "ESMF");
          if (_eic) {
            BasicCodeConcept<ASTUseStmtNode> _basicCodeConcept = new BasicCodeConcept<ASTUseStmtNode>(this, it);
            this.importESMF = _basicCodeConcept;
          } else {
            Token _name_1 = it.getName();
            String _text_1 = _name_1.getText();
            boolean _eic_1 = ASTQuery.eic(_text_1, "NUOPC");
            if (_eic_1) {
              BasicCodeConcept<ASTUseStmtNode> _basicCodeConcept_1 = new BasicCodeConcept<ASTUseStmtNode>(this, it);
              this.importNUOPC = _basicCodeConcept_1;
            } else {
              Token _name_2 = it.getName();
              String _text_2 = _name_2.getText();
              boolean _eic_2 = ASTQuery.eic(_text_2, this.genericImport);
              if (_eic_2) {
                NUOPCComponent.GenericImport _genericImport = new NUOPCComponent.GenericImport(this, it);
                NUOPCComponent.GenericImport _reverse = _genericImport.reverse();
                this.importNUOPCGeneric = _reverse;
              }
            }
          }
        };
        _filter.forEach(_function);
        _xblockexpression = super.<NUOPCComponent>forward();
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
