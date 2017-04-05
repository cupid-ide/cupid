package org.earthsystemmodeling.cupid.cc.fortran;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Set;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeException;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTOnlyNode;
import org.eclipse.photran.internal.core.parser.ASTRenameNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.ISpecificationPartConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class FortranMappingTypes {
  private static FortranMappingTypes instance;
  
  public static MappingType FortranAstMT;
  
  public static MappingType CallInSubroutineMT;
  
  public static MappingType ModuleUseStmtMT;
  
  public static MappingType ModuleUseEntityMT;
  
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
    MappingType _mappingType = new MappingType("FortranAstMT", IFortranAST.class, IFortranAST.class);
    FortranMappingTypes.FortranAstMT = _mappingType;
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
      IBodyConstruct _parseLiteralStatement = CodeExtraction.<IBodyConstruct>parseLiteralStatement(code);
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
        IBodyConstruct _parseLiteralStatement = CodeExtraction.<IBodyConstruct>parseLiteralStatement(code);
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
