package org.earthsystemmodeling.cupid.cc.fortran;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.cc.mapping.MappingResultSet;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IModuleBodyConstruct;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class FortranMappingTypes {
  private static FortranMappingTypes instance;
  
  public static MappingType CallInSubroutineMT;
  
  public static MappingType ModuleThatUsesMT;
  
  public static MappingType ModuleUseStmtMT;
  
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
    Pair<String, Class<ASTModuleNode>> _mappedTo = Pair.<String, Class<ASTModuleNode>>of("context", ASTModuleNode.class);
    Pair<String, Class<String>> _mappedTo_1 = Pair.<String, Class<String>>of("uses", String.class);
    Pair<String, Class<ASTUseStmtNode>> _mappedTo_2 = Pair.<String, Class<ASTUseStmtNode>>of("match", ASTUseStmtNode.class);
    MappingType _mappingType = new MappingType("ModuleUseStmtMT", 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2)));
    final Procedure1<MappingType> _function = (MappingType it) -> {
      final Procedure2<MappingTypeBinding, MappingResultSet> _function_1 = (MappingTypeBinding me, MappingResultSet result) -> {
        final ASTModuleNode moduleNode = me.<ASTModuleNode>context();
        IASTListNode<IModuleBodyConstruct> _moduleBody = moduleNode.getModuleBody();
        Iterable<ASTUseStmtNode> _filter = null;
        if (_moduleBody!=null) {
          _filter=Iterables.<ASTUseStmtNode>filter(_moduleBody, ASTUseStmtNode.class);
        }
        final Function1<ASTUseStmtNode, Boolean> _function_2 = (ASTUseStmtNode usn) -> {
          Token _name = usn.getName();
          String _text = _name.getText();
          Object _value = me.<Object>getValue("uses");
          return Boolean.valueOf(ASTQuery.eic(_text, ((String) _value)));
        };
        final ASTUseStmtNode useStmtNode = IterableExtensions.<ASTUseStmtNode>findFirst(_filter, _function_2);
        boolean _notEquals = (!Objects.equal(useStmtNode, null));
        if (_notEquals) {
          result.addMatch(useStmtNode);
        }
      };
      it.setFind(_function_1);
    };
    MappingType _doubleArrow = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType, _function);
    FortranMappingTypes.ModuleUseStmtMT = _doubleArrow;
    Pair<String, Class<ASTModuleNode>> _mappedTo_3 = Pair.<String, Class<ASTModuleNode>>of("context", ASTModuleNode.class);
    Pair<String, Class<String>> _mappedTo_4 = Pair.<String, Class<String>>of("uses", String.class);
    Pair<String, Class<ASTModuleNode>> _mappedTo_5 = Pair.<String, Class<ASTModuleNode>>of("match", ASTModuleNode.class);
    Pair<String, Class<String>> _mappedTo_6 = Pair.<String, Class<String>>of("name", String.class);
    MappingType _mappingType_1 = new MappingType("ModuleThatUsesMT", 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_3, _mappedTo_4, _mappedTo_5, _mappedTo_6)));
    final Procedure1<MappingType> _function_1 = (MappingType it) -> {
      final Procedure2<MappingTypeBinding, MappingResultSet> _function_2 = (MappingTypeBinding me, MappingResultSet result) -> {
        final ASTModuleNode moduleNode = me.<ASTModuleNode>context();
        IASTListNode<IModuleBodyConstruct> _moduleBody = moduleNode.getModuleBody();
        Iterable<ASTUseStmtNode> _filter = null;
        if (_moduleBody!=null) {
          _filter=Iterables.<ASTUseStmtNode>filter(_moduleBody, ASTUseStmtNode.class);
        }
        boolean _exists = false;
        if (_filter!=null) {
          final Function1<ASTUseStmtNode, Boolean> _function_3 = (ASTUseStmtNode it_1) -> {
            Token _name = it_1.getName();
            String _valueString = me.getValueString("uses");
            return Boolean.valueOf(ASTQuery.eic(_name, _valueString));
          };
          _exists=IterableExtensions.<ASTUseStmtNode>exists(_filter, _function_3);
        }
        if (_exists) {
          result.addMatch(moduleNode);
        }
      };
      it.setFind(_function_2);
    };
    MappingType _doubleArrow_1 = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType_1, _function_1);
    FortranMappingTypes.ModuleThatUsesMT = _doubleArrow_1;
    Pair<String, Class<ASTSubroutineSubprogramNode>> _mappedTo_7 = Pair.<String, Class<ASTSubroutineSubprogramNode>>of("context", ASTSubroutineSubprogramNode.class);
    Pair<String, Class<String>> _mappedTo_8 = Pair.<String, Class<String>>of("calls", String.class);
    Pair<String, Class<ASTCallStmtNode>> _mappedTo_9 = Pair.<String, Class<ASTCallStmtNode>>of("match", ASTCallStmtNode.class);
    MappingType _mappingType_2 = new MappingType("CallInSubroutineMT", 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_7, _mappedTo_8, _mappedTo_9)));
    final Procedure1<MappingType> _function_2 = (MappingType it) -> {
      final Procedure2<MappingTypeBinding, MappingResultSet> _function_3 = (MappingTypeBinding me, MappingResultSet result) -> {
        Object _context = me.<Object>context();
        final ASTSubroutineSubprogramNode subr = ((ASTSubroutineSubprogramNode) _context);
        IASTListNode<IBodyConstruct> _body = subr.getBody();
        Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
        final Function1<ASTCallStmtNode, Boolean> _function_4 = (ASTCallStmtNode it_1) -> {
          Token _subroutineName = it_1.getSubroutineName();
          String _valueString = me.getValueString("calls");
          return Boolean.valueOf(ASTQuery.eic(_subroutineName, _valueString));
        };
        Iterable<ASTCallStmtNode> _filter_1 = IterableExtensions.<ASTCallStmtNode>filter(_filter, _function_4);
        final Consumer<ASTCallStmtNode> _function_5 = (ASTCallStmtNode c) -> {
          result.addMatch(c);
        };
        _filter_1.forEach(_function_5);
      };
      it.setFind(_function_3);
    };
    MappingType _doubleArrow_2 = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType_2, _function_2);
    FortranMappingTypes.CallInSubroutineMT = _doubleArrow_2;
  }
}
