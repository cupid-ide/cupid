package org.earthsystemmodeling.cupid.cc.fortran;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.cc.CodeConceptTemplate;
import org.earthsystemmodeling.cupid.cc.mapping.MappingResult;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
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
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IModuleBodyConstruct;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class FortranMappingTypes {
  private static FortranMappingTypes instance;
  
  public static MappingType CallInSubroutineMT;
  
  public static MappingType ModuleThatUsesMT;
  
  public static MappingType ModuleUseStmtMT;
  
  public static MappingType ModuleMT;
  
  public static CodeConceptTemplate TopLevelCodeConcept;
  
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
    CodeConceptTemplate _codeConceptTemplate = new CodeConceptTemplate("TopLevelCodeConcept", Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList()));
    FortranMappingTypes.TopLevelCodeConcept = _codeConceptTemplate;
    Pair<String, Class<ASTModuleNode>> _mappedTo = Pair.<String, Class<ASTModuleNode>>of("context", ASTModuleNode.class);
    Pair<String, Class<String>> _mappedTo_1 = Pair.<String, Class<String>>of("uses", String.class);
    Pair<String, Class<ASTUseStmtNode>> _mappedTo_2 = Pair.<String, Class<ASTUseStmtNode>>of("match", ASTUseStmtNode.class);
    MappingType _mappingType = new MappingType("ModuleUseStmtMT", 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2)));
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
          Object _value = bind.<Object>getValue("uses");
          return Boolean.valueOf(ASTQuery.eic(_text, ((String) _value)));
        };
        final ASTUseStmtNode useStmtNode = IterableExtensions.<ASTUseStmtNode>findFirst(_filter, _function_2);
        boolean _notEquals = (!Objects.equal(useStmtNode, null));
        if (_notEquals) {
          bind.addResult(useStmtNode);
        }
      };
      it.setFind(_function_1);
    };
    MappingType _doubleArrow = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType, _function);
    FortranMappingTypes.ModuleUseStmtMT = _doubleArrow;
    Pair<String, Class<IFortranAST>> _mappedTo_3 = Pair.<String, Class<IFortranAST>>of("context", IFortranAST.class);
    Pair<String, Class<String>> _mappedTo_4 = Pair.<String, Class<String>>of("name", String.class);
    Pair<String, Class<ASTModuleNode>> _mappedTo_5 = Pair.<String, Class<ASTModuleNode>>of("match", ASTModuleNode.class);
    MappingType _mappingType_1 = new MappingType("ModuleMT", 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_3, _mappedTo_4, _mappedTo_5)));
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
        final String name = bind.getValueString("name");
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("module ");
        _builder.append(name, "");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("use ESMF");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("use NUOPC");
        _builder.newLine();
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
        final String code = _builder.toString();
        ASTModuleNode moduleNode = CodeExtraction.<ASTModuleNode>parseLiteralProgramUnit(code);
        ASTListNode<IProgramUnit> pul = new ASTListNode<IProgramUnit>();
        pul.add(moduleNode);
        ASTExecutableProgramNode _root = ast.getRoot();
        _root.setProgramUnitList(pul);
      };
      it.setForwardAdd(_function_3);
    };
    MappingType _doubleArrow_1 = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType_1, _function_1);
    FortranMappingTypes.ModuleMT = _doubleArrow_1;
    Pair<String, Class<ASTModuleNode>> _mappedTo_6 = Pair.<String, Class<ASTModuleNode>>of("context", ASTModuleNode.class);
    Pair<String, Class<String>> _mappedTo_7 = Pair.<String, Class<String>>of("uses", String.class);
    Pair<String, Class<ASTModuleNode>> _mappedTo_8 = Pair.<String, Class<ASTModuleNode>>of("match", ASTModuleNode.class);
    Pair<String, Class<String>> _mappedTo_9 = Pair.<String, Class<String>>of("name", String.class);
    MappingType _mappingType_2 = new MappingType("ModuleThatUsesMT", 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_6, _mappedTo_7, _mappedTo_8, _mappedTo_9)));
    final Procedure1<MappingType> _function_2 = (MappingType it) -> {
      final Procedure1<MappingTypeBinding> _function_3 = (MappingTypeBinding bind) -> {
        final ASTModuleNode moduleNode = bind.<ASTModuleNode>context();
        IASTListNode<IModuleBodyConstruct> _moduleBody = moduleNode.getModuleBody();
        Iterable<ASTUseStmtNode> _filter = null;
        if (_moduleBody!=null) {
          _filter=Iterables.<ASTUseStmtNode>filter(_moduleBody, ASTUseStmtNode.class);
        }
        boolean _exists = false;
        if (_filter!=null) {
          final Function1<ASTUseStmtNode, Boolean> _function_4 = (ASTUseStmtNode it_1) -> {
            Token _name = it_1.getName();
            String _valueString = bind.getValueString("uses");
            return Boolean.valueOf(ASTQuery.eic(_name, _valueString));
          };
          _exists=IterableExtensions.<ASTUseStmtNode>exists(_filter, _function_4);
        }
        if (_exists) {
          final MappingResult r = bind.addResult(moduleNode);
          ASTModuleStmtNode _moduleStmt = moduleNode.getModuleStmt();
          ASTModuleNameNode _moduleName = _moduleStmt.getModuleName();
          Token _moduleName_1 = _moduleName.getModuleName();
          String _text = _moduleName_1.getText();
          r.put("name", _text);
        }
      };
      it.setFind(_function_3);
      final Procedure1<MappingTypeBinding> _function_4 = (MappingTypeBinding bind) -> {
      };
      it.setForwardAdd(_function_4);
    };
    MappingType _doubleArrow_2 = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType_2, _function_2);
    FortranMappingTypes.ModuleThatUsesMT = _doubleArrow_2;
    Pair<String, Class<ASTSubroutineSubprogramNode>> _mappedTo_10 = Pair.<String, Class<ASTSubroutineSubprogramNode>>of("context", ASTSubroutineSubprogramNode.class);
    Pair<String, Class<String>> _mappedTo_11 = Pair.<String, Class<String>>of("calls", String.class);
    Pair<String, Class<ASTCallStmtNode>> _mappedTo_12 = Pair.<String, Class<ASTCallStmtNode>>of("match", ASTCallStmtNode.class);
    MappingType _mappingType_3 = new MappingType("CallInSubroutineMT", 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_10, _mappedTo_11, _mappedTo_12)));
    final Procedure1<MappingType> _function_3 = (MappingType it) -> {
      final Procedure1<MappingTypeBinding> _function_4 = (MappingTypeBinding bind) -> {
        final ASTSubroutineSubprogramNode subr = bind.<ASTSubroutineSubprogramNode>context();
        IASTListNode<IBodyConstruct> _body = subr.getBody();
        Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
        final Function1<ASTCallStmtNode, Boolean> _function_5 = (ASTCallStmtNode it_1) -> {
          Token _subroutineName = it_1.getSubroutineName();
          String _valueString = bind.getValueString("calls");
          return Boolean.valueOf(ASTQuery.eic(_subroutineName, _valueString));
        };
        Iterable<ASTCallStmtNode> _filter_1 = IterableExtensions.<ASTCallStmtNode>filter(_filter, _function_5);
        final Consumer<ASTCallStmtNode> _function_6 = (ASTCallStmtNode c) -> {
          bind.addResult(c);
        };
        _filter_1.forEach(_function_6);
      };
      it.setFind(_function_4);
    };
    MappingType _doubleArrow_3 = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType_3, _function_3);
    FortranMappingTypes.CallInSubroutineMT = _doubleArrow_3;
  }
}
