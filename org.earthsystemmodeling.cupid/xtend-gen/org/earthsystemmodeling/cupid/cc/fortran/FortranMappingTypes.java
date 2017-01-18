package org.earthsystemmodeling.cupid.cc.fortran;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.Set;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.cc.mapping.MappingResult;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeException;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTExecutableProgramNode;
import org.eclipse.photran.internal.core.parser.ASTListNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNameNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTModuleStmtNode;
import org.eclipse.photran.internal.core.parser.ASTOnlyNode;
import org.eclipse.photran.internal.core.parser.ASTRenameNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IModuleBodyConstruct;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.photran.internal.core.parser.ISpecificationPartConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class FortranMappingTypes {
  private static FortranMappingTypes instance;
  
  public static MappingType CallInSubroutineMT;
  
  public static MappingType ModuleUseStmtMT;
  
  public static MappingType ModuleMT;
  
  public static FortranMappingTypes getInstance() {
    FortranMappingTypes _xblockexpression = null;
    {
      boolean _equals = Objects.equal(FortranMappingTypes.instance, null);
      if (_equals) {
        FortranMappingTypes _fortranMappingTypes = new FortranMappingTypes();
        FortranMappingTypes.instance = _fortranMappingTypes;
      }
      _xblockexpression = FortranMappingTypes.instance;
    }
    return _xblockexpression;
  }
  
  protected FortranMappingTypes() {
    Pair<String, Class<String>> _mappedTo = Pair.<String, Class<String>>of("uses", String.class);
    MappingType _mappingType = new MappingType("ModuleUseStmtMT", ASTModuleNode.class, ASTUseStmtNode.class, 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo)));
    final Procedure1<MappingType> _function = (MappingType it) -> {
      final Procedure1<MappingTypeBinding> _function_1 = (MappingTypeBinding bind) -> {
        final ASTModuleNode moduleNode = bind.<ASTModuleNode>context();
        IASTListNode<IModuleBodyConstruct> _moduleBody = moduleNode.getModuleBody();
        Iterable<ASTUseStmtNode> _filter = null;
        if (_moduleBody!=null) {
          _filter=Iterables.<ASTUseStmtNode>filter(_moduleBody, ASTUseStmtNode.class);
        }
        final Function1<ASTUseStmtNode, Boolean> _function_2 = (ASTUseStmtNode usn) -> {
          Token _name = usn.getName();
          String _text = _name.getText();
          String _valueString = bind.getValueString("uses");
          return Boolean.valueOf(ASTQuery.eic(_text, _valueString));
        };
        final ASTUseStmtNode useStmtNode = IterableExtensions.<ASTUseStmtNode>findFirst(_filter, _function_2);
        boolean _notEquals = (!Objects.equal(useStmtNode, null));
        if (_notEquals) {
          final MappingResult r = bind.addResult(useStmtNode);
          Token _name = useStmtNode.getName();
          String _text = _name.getText();
          r.put("uses", _text);
        }
      };
      it.setFind(_function_1);
      final Procedure1<MappingTypeBinding> _function_2 = (MappingTypeBinding bind) -> {
        final ASTModuleNode moduleNode = bind.<ASTModuleNode>context();
        String _valueString = bind.getValueString("uses");
        final ASTUseStmtNode usn = FortranMappingTypes.ensureImport(moduleNode, _valueString);
        bind.<ASTUseStmtNode>setMatch(usn);
      };
      it.setForwardAdd(_function_2);
    };
    MappingType _doubleArrow = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType, _function);
    FortranMappingTypes.ModuleUseStmtMT = _doubleArrow;
    Pair<String, Class<IFortranAST>> _mappedTo_1 = Pair.<String, Class<IFortranAST>>of("context", IFortranAST.class);
    Pair<String, Class<String>> _mappedTo_2 = Pair.<String, Class<String>>of("name", String.class);
    Pair<String, Class<ASTModuleNode>> _mappedTo_3 = Pair.<String, Class<ASTModuleNode>>of("match", ASTModuleNode.class);
    MappingType _mappingType_1 = new MappingType("ModuleMT", 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_1, _mappedTo_2, _mappedTo_3)));
    final Procedure1<MappingType> _function_1 = (MappingType it) -> {
      final Procedure1<MappingTypeBinding> _function_2 = (MappingTypeBinding bind) -> {
        final IFortranAST ast = bind.<IFortranAST>context();
        ASTExecutableProgramNode _root = null;
        if (ast!=null) {
          _root=ast.getRoot();
        }
        IASTListNode<IProgramUnit> _programUnitList = null;
        if (_root!=null) {
          _programUnitList=_root.getProgramUnitList();
        }
        Iterable<ASTModuleNode> _filter = null;
        if (_programUnitList!=null) {
          _filter=Iterables.<ASTModuleNode>filter(_programUnitList, ASTModuleNode.class);
        }
        ASTModuleNode _head = null;
        if (_filter!=null) {
          _head=IterableExtensions.<ASTModuleNode>head(_filter);
        }
        final ASTModuleNode moduleNode = _head;
        boolean _notEquals = (!Objects.equal(moduleNode, null));
        if (_notEquals) {
          final MappingResult r = bind.addResult(moduleNode);
          ASTModuleStmtNode _moduleStmt = moduleNode.getModuleStmt();
          ASTModuleNameNode _moduleName = _moduleStmt.getModuleName();
          Token _moduleName_1 = _moduleName.getModuleName();
          String _text = _moduleName_1.getText();
          r.put("name", _text);
        }
      };
      it.setFind(_function_2);
      final Procedure1<MappingTypeBinding> _function_3 = (MappingTypeBinding bind) -> {
        final IFortranAST ast = bind.<IFortranAST>context();
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("module {name}");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t\t");
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
        final String code = bind.fill(_builder.toString());
        ASTModuleNode moduleNode = CodeExtraction.<ASTModuleNode>parseLiteralProgramUnit(code);
        ASTListNode<IProgramUnit> pul = new ASTListNode<IProgramUnit>();
        pul.add(moduleNode);
        ASTExecutableProgramNode _root = ast.getRoot();
        _root.setProgramUnitList(pul);
        bind.<ASTModuleNode>setMatch(moduleNode);
      };
      it.setForwardAdd(_function_3);
    };
    MappingType _doubleArrow_1 = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType_1, _function_1);
    FortranMappingTypes.ModuleMT = _doubleArrow_1;
    Pair<String, Class<ASTSubroutineSubprogramNode>> _mappedTo_4 = Pair.<String, Class<ASTSubroutineSubprogramNode>>of("context", ASTSubroutineSubprogramNode.class);
    Pair<String, Class<String>> _mappedTo_5 = Pair.<String, Class<String>>of("calls", String.class);
    Pair<String, Class<ASTCallStmtNode>> _mappedTo_6 = Pair.<String, Class<ASTCallStmtNode>>of("match", ASTCallStmtNode.class);
    MappingType _mappingType_2 = new MappingType("CallInSubroutineMT", 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_4, _mappedTo_5, _mappedTo_6)));
    final Procedure1<MappingType> _function_2 = (MappingType it) -> {
      final Procedure1<MappingTypeBinding> _function_3 = (MappingTypeBinding bind) -> {
        final ASTSubroutineSubprogramNode subr = bind.<ASTSubroutineSubprogramNode>context();
        IASTListNode<IBodyConstruct> _body = subr.getBody();
        Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
        final Function1<ASTCallStmtNode, Boolean> _function_4 = (ASTCallStmtNode it_1) -> {
          Token _subroutineName = it_1.getSubroutineName();
          String _valueString = bind.getValueString("calls");
          return Boolean.valueOf(ASTQuery.eic(_subroutineName, _valueString));
        };
        Iterable<ASTCallStmtNode> _filter_1 = IterableExtensions.<ASTCallStmtNode>filter(_filter, _function_4);
        final Consumer<ASTCallStmtNode> _function_5 = (ASTCallStmtNode c) -> {
          bind.addResult(c);
        };
        _filter_1.forEach(_function_5);
      };
      it.setFind(_function_3);
    };
    MappingType _doubleArrow_2 = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType_2, _function_2);
    FortranMappingTypes.CallInSubroutineMT = _doubleArrow_2;
  }
  
  public static ASTUseStmtNode ensureImport(final ASTUseStmtNode usn, final String entityName, final String localName) {
    boolean _or = false;
    boolean _or_1 = false;
    Set<ASTRenameNode> _findAll = usn.<ASTRenameNode>findAll(ASTRenameNode.class);
    boolean _exists = false;
    if (_findAll!=null) {
      final Function1<ASTRenameNode, Boolean> _function = (ASTRenameNode rn) -> {
        return Boolean.valueOf((ASTQuery.eic(rn.getName(), entityName) && 
          ASTQuery.eic(rn.getNewName(), localName)));
      };
      _exists=IterableExtensions.<ASTRenameNode>exists(_findAll, _function);
    }
    if (_exists) {
      _or_1 = true;
    } else {
      Set<ASTOnlyNode> _findAll_1 = usn.<ASTOnlyNode>findAll(ASTOnlyNode.class);
      boolean _exists_1 = false;
      if (_findAll_1!=null) {
        final Function1<ASTOnlyNode, Boolean> _function_1 = (ASTOnlyNode on) -> {
          return Boolean.valueOf((ASTQuery.eic(on.getName(), entityName) && 
            ASTQuery.eic(on.getNewName(), localName)));
        };
        _exists_1=IterableExtensions.<ASTOnlyNode>exists(_findAll_1, _function_1);
      }
      _or_1 = _exists_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      _or = (IterableExtensions.isNullOrEmpty(usn.<ASTRenameNode>findAll(ASTRenameNode.class)) && 
        IterableExtensions.isNullOrEmpty(usn.<ASTOnlyNode>findAll(ASTOnlyNode.class)));
    }
    final boolean exists = _or;
    if ((!exists)) {
      String _string = usn.toString();
      String _trim = _string.trim();
      String _plus = (_trim + ", &\n");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(localName, "");
      _builder.append(" => ");
      _builder.append(entityName, "");
      final String code = (_plus + _builder);
      IBodyConstruct _parseLiteralStatement = CodeExtraction.parseLiteralStatement(code);
      final ASTUseStmtNode newNode = ((ASTUseStmtNode) _parseLiteralStatement);
      usn.replaceWith(newNode);
      return newNode;
    } else {
      return usn;
    }
  }
  
  public static ASTUseStmtNode ensureImport(final ASTModuleNode amn, final String moduleName) {
    return FortranMappingTypes.ensureImport(amn, moduleName, null, null, false);
  }
  
  public static ASTUseStmtNode ensureImport(final ASTModuleNode amn, final String moduleName, final String entityName, final String localName, final boolean useOnly) {
    try {
      IASTListNode<? extends IASTNode> _body = amn.getBody();
      Iterable<? extends IASTNode> _children = _body.getChildren();
      Iterable<ASTUseStmtNode> _filter = Iterables.<ASTUseStmtNode>filter(_children, ASTUseStmtNode.class);
      final Function1<ASTUseStmtNode, Boolean> _function = (ASTUseStmtNode usn) -> {
        Token _name = usn.getName();
        return Boolean.valueOf(ASTQuery.eic(_name, moduleName));
      };
      ASTUseStmtNode usn = IterableExtensions.<ASTUseStmtNode>findFirst(_filter, _function);
      boolean _notEquals = (!Objects.equal(usn, null));
      if (_notEquals) {
        return FortranMappingTypes.ensureImport(usn, entityName, localName);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("use ");
        _builder.append(moduleName, "");
        {
          if (((!Objects.equal(localName, null)) && (!Objects.equal(entityName, null)))) {
            _builder.append(", ");
            {
              if (useOnly) {
                _builder.append("only: ");
              }
            }
            _builder.append(localName, "");
            _builder.append(" => ");
            _builder.append(entityName, "");
          }
        }
        final String code = _builder.toString();
        IBodyConstruct _parseLiteralStatement = CodeExtraction.parseLiteralStatement(code);
        usn = ((ASTUseStmtNode) _parseLiteralStatement);
        IASTListNode<? extends IASTNode> _body_1 = amn.getBody();
        final ASTUseStmtNode last = _body_1.<ASTUseStmtNode>findLast(ASTUseStmtNode.class);
        boolean _notEquals_1 = (!Objects.equal(last, null));
        if (_notEquals_1) {
          IASTListNode<? extends IASTNode> _body_2 = amn.getBody();
          ((IASTListNode<IBodyConstruct>) _body_2).insertAfter(last, usn);
        } else {
          IASTListNode<? extends IASTNode> _body_3 = amn.getBody();
          final ISpecificationPartConstruct firstSpec = _body_3.<ISpecificationPartConstruct>findFirst(ISpecificationPartConstruct.class);
          boolean _notEquals_2 = (!Objects.equal(firstSpec, null));
          if (_notEquals_2) {
            IASTListNode<? extends IASTNode> _body_4 = amn.getBody();
            ((IASTListNode<IBodyConstruct>) _body_4).insertBefore(firstSpec, usn);
          } else {
            String _string = usn.toString();
            String _plus = ("Unable to insert use statement: " + _string);
            throw new MappingTypeException(_plus);
          }
        }
        return usn;
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
