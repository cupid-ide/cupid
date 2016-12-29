package org.earthsystemmodeling.cupid.cc.nuopc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.Set;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.cc.BootstrapCodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.MappingResultSet;
import org.earthsystemmodeling.cupid.cc.MappingType;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.earthsystemmodeling.cupid.nuopc.ESMFQuery;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineNameNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineStmtNode;
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
public class NUOPC {
  private static NUOPC instance;
  
  /**
   * mapping types
   */
  public MappingType ModuleThatUsesMT;
  
  public MappingType ModuleUseStmtMT;
  
  public MappingType SetServicesMT;
  
  public MappingType ESMFMethodMT;
  
  public MappingType SpecializationMethodMT;
  
  /**
   * concepts
   */
  public CodeConcept NUOPCComponent;
  
  public CodeConcept NUOPCDriver;
  
  public BootstrapCodeConcept NUOPCDriverFromFile;
  
  public static NUOPC getInstance() {
    NUOPC _xblockexpression = null;
    {
      boolean _equals = Objects.equal(NUOPC.instance, null);
      if (_equals) {
        NUOPC _nUOPC = new NUOPC();
        NUOPC.instance = _nUOPC;
      }
      _xblockexpression = NUOPC.instance;
    }
    return _xblockexpression;
  }
  
  public NUOPC() {
    Pair<String, Class<ASTModuleNode>> _mappedTo = Pair.<String, Class<ASTModuleNode>>of("module", ASTModuleNode.class);
    Pair<String, Class<ASTSubroutineSubprogramNode>> _mappedTo_1 = Pair.<String, Class<ASTSubroutineSubprogramNode>>of("match", ASTSubroutineSubprogramNode.class);
    MappingType _mappingType = new MappingType(
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo)), 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_1)));
    final Procedure1<MappingType> _function = (MappingType it) -> {
      final Procedure2<MappingType, MappingResultSet> _function_1 = (MappingType me, MappingResultSet result) -> {
        final ASTModuleNode module = me.<ASTModuleNode>get("module");
        Iterable<ASTSubroutineSubprogramNode> _findESMFMethods = ESMFQuery.findESMFMethods(module);
        final Consumer<ASTSubroutineSubprogramNode> _function_2 = (ASTSubroutineSubprogramNode m) -> {
          result.addMatch(m);
        };
        _findESMFMethods.forEach(_function_2);
      };
      it.setFind(_function_1);
    };
    MappingType _doubleArrow = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType, _function);
    this.ESMFMethodMT = _doubleArrow;
    Pair<String, Class<ASTSubroutineSubprogramNode>> _mappedTo_2 = Pair.<String, Class<ASTSubroutineSubprogramNode>>of("setServices", ASTSubroutineSubprogramNode.class);
    Pair<String, Class<String>> _mappedTo_3 = Pair.<String, Class<String>>of("labelComponent", String.class);
    Pair<String, Class<String>> _mappedTo_4 = Pair.<String, Class<String>>of("labelName", String.class);
    MappingType _refine = this.ESMFMethodMT.refine(
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_2, _mappedTo_3, _mappedTo_4)));
    final Procedure1<MappingType> _function_1 = (MappingType it) -> {
      final Procedure2<MappingType, MappingResultSet> _function_2 = (MappingType me, MappingResultSet result) -> {
        final ASTModuleNode module = me.<ASTModuleNode>get("module");
        final ASTSubroutineSubprogramNode setServicesNode = me.<ASTSubroutineSubprogramNode>get("setServices");
        final Function1<ASTSubroutineSubprogramNode, Boolean> _function_3 = (ASTSubroutineSubprogramNode m) -> {
          return Boolean.valueOf(Objects.equal(m, setServicesNode));
        };
        result.<ASTSubroutineSubprogramNode>removeMatchIf(_function_3);
        final Function1<ASTSubroutineSubprogramNode, Boolean> _function_4 = (ASTSubroutineSubprogramNode m) -> {
          IASTListNode<IBodyConstruct> _body = setServicesNode.getBody();
          Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
          final Function1<ASTCallStmtNode, Boolean> _function_5 = (ASTCallStmtNode it_1) -> {
            boolean _and = false;
            boolean _and_1 = false;
            Token _subroutineName = it_1.getSubroutineName();
            boolean _eic = ASTQuery.eic(_subroutineName, "NUOPC_CompSpecialize");
            if (!_eic) {
              _and_1 = false;
            } else {
              String _litArgExprByKeyword = ASTQuery.litArgExprByKeyword(it_1, "specRoutine");
              boolean _eic_1 = false;
              if (_litArgExprByKeyword!=null) {
                ASTSubroutineStmtNode _subroutineStmt = m.getSubroutineStmt();
                ASTSubroutineNameNode _subroutineName_1 = _subroutineStmt.getSubroutineName();
                Token _subroutineName_2 = _subroutineName_1.getSubroutineName();
                _eic_1=ASTQuery.eic(_litArgExprByKeyword, _subroutineName_2);
              }
              _and_1 = _eic_1;
            }
            if (!_and_1) {
              _and = false;
            } else {
              String _litArgExprByKeyword_1 = ASTQuery.litArgExprByKeyword(it_1, "specLabel");
              boolean _eic_2 = false;
              if (_litArgExprByKeyword_1!=null) {
                String _get = me.<String>get("labelComponent");
                String _get_1 = me.<String>get("labelName");
                String _localName = ASTQuery.localName(module, _get, _get_1);
                _eic_2=ASTQuery.eic(_litArgExprByKeyword_1, _localName);
              }
              _and = _eic_2;
            }
            return Boolean.valueOf(_and);
          };
          return Boolean.valueOf(IterableExtensions.<ASTCallStmtNode>exists(_filter, _function_5));
        };
        result.<ASTSubroutineSubprogramNode>retainMatchIf(_function_4);
      };
      it.setFind(_function_2);
    };
    MappingType _doubleArrow_1 = ObjectExtensions.<MappingType>operator_doubleArrow(_refine, _function_1);
    this.SpecializationMethodMT = _doubleArrow_1;
    MappingType _mappingType_1 = new MappingType(ASTModuleNode.class, ASTSubroutineSubprogramNode.class);
    final Procedure1<MappingType> _function_2 = (MappingType it) -> {
      final Procedure2<MappingType, MappingResultSet> _function_3 = (MappingType me, MappingResultSet results) -> {
        final ASTModuleNode module = me.<ASTModuleNode>context();
        IASTListNode<IModuleBodyConstruct> _moduleBody = module.getModuleBody();
        Set<ASTSubroutineSubprogramNode> _findAll = null;
        if (_moduleBody!=null) {
          _findAll=_moduleBody.<ASTSubroutineSubprogramNode>findAll(ASTSubroutineSubprogramNode.class);
        }
        final Function1<ASTSubroutineSubprogramNode, Boolean> _function_4 = (ASTSubroutineSubprogramNode it_1) -> {
          boolean _or = false;
          ASTSubroutineStmtNode _subroutineStmt = it_1.getSubroutineStmt();
          ASTSubroutineNameNode _subroutineName = null;
          if (_subroutineStmt!=null) {
            _subroutineName=_subroutineStmt.getSubroutineName();
          }
          Token _subroutineName_1 = _subroutineName.getSubroutineName();
          String _text = _subroutineName_1.getText();
          boolean _eic = ASTQuery.eic(_text, "SetServices");
          if (_eic) {
            _or = true;
          } else {
            IASTListNode<IBodyConstruct> _body = it_1.getBody();
            Set<ASTCallStmtNode> _findAll_1 = _body.<ASTCallStmtNode>findAll(ASTCallStmtNode.class);
            final Function1<ASTCallStmtNode, Boolean> _function_5 = (ASTCallStmtNode it_2) -> {
              Token _subroutineName_2 = it_2.getSubroutineName();
              String _text_1 = _subroutineName_2.getText();
              return Boolean.valueOf(_text_1.equalsIgnoreCase("NUOPC_CompDerive"));
            };
            boolean _exists = IterableExtensions.<ASTCallStmtNode>exists(_findAll_1, _function_5);
            _or = _exists;
          }
          return Boolean.valueOf(_or);
        };
        IterableExtensions.<ASTSubroutineSubprogramNode>findFirst(_findAll, _function_4);
      };
      it.setFind(_function_3);
    };
    MappingType _doubleArrow_2 = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType_1, _function_2);
    this.SetServicesMT = _doubleArrow_2;
    Pair<String, Class<ASTModuleNode>> _mappedTo_5 = Pair.<String, Class<ASTModuleNode>>of("context", ASTModuleNode.class);
    Pair<String, Class<String>> _mappedTo_6 = Pair.<String, Class<String>>of("uses", String.class);
    Pair<String, Class<ASTUseStmtNode>> _mappedTo_7 = Pair.<String, Class<ASTUseStmtNode>>of("match", ASTUseStmtNode.class);
    MappingType _mappingType_2 = new MappingType(
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_5, _mappedTo_6)), 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_7)));
    final Procedure1<MappingType> _function_3 = (MappingType it) -> {
      final Procedure2<MappingType, MappingResultSet> _function_4 = (MappingType me, MappingResultSet result) -> {
        final ASTModuleNode moduleNode = me.<ASTModuleNode>context();
        IASTListNode<IModuleBodyConstruct> _moduleBody = moduleNode.getModuleBody();
        Iterable<ASTUseStmtNode> _filter = null;
        if (_moduleBody!=null) {
          _filter=Iterables.<ASTUseStmtNode>filter(_moduleBody, ASTUseStmtNode.class);
        }
        final Function1<ASTUseStmtNode, Boolean> _function_5 = (ASTUseStmtNode usn) -> {
          Token _name = usn.getName();
          String _text = _name.getText();
          Object _get = me.<Object>get("uses");
          return Boolean.valueOf(ASTQuery.eic(_text, ((String) _get)));
        };
        IterableExtensions.<ASTUseStmtNode>findFirst(_filter, _function_5);
      };
      it.setFind(_function_4);
    };
    MappingType _doubleArrow_3 = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType_2, _function_3);
    this.ModuleUseStmtMT = _doubleArrow_3;
    Pair<String, Class<ASTModuleNode>> _mappedTo_8 = Pair.<String, Class<ASTModuleNode>>of("context", ASTModuleNode.class);
    Pair<String, Class<String>> _mappedTo_9 = Pair.<String, Class<String>>of("uses", String.class);
    Pair<String, Class<ASTModuleNode>> _mappedTo_10 = Pair.<String, Class<ASTModuleNode>>of("match", ASTModuleNode.class);
    MappingType _mappingType_3 = new MappingType(
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_8, _mappedTo_9)), 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_10)));
    final Procedure1<MappingType> _function_4 = (MappingType it) -> {
      final Procedure2<MappingType, MappingResultSet> _function_5 = (MappingType me, MappingResultSet result) -> {
        final ASTModuleNode moduleNode = me.<ASTModuleNode>context();
        IASTListNode<IModuleBodyConstruct> _moduleBody = moduleNode.getModuleBody();
        Iterable<ASTUseStmtNode> _filter = null;
        if (_moduleBody!=null) {
          _filter=Iterables.<ASTUseStmtNode>filter(_moduleBody, ASTUseStmtNode.class);
        }
        boolean _exists = false;
        if (_filter!=null) {
          final Function1<ASTUseStmtNode, Boolean> _function_6 = (ASTUseStmtNode it_1) -> {
            Token _name = it_1.getName();
            Object _get = me.<Object>get("uses");
            return Boolean.valueOf(ASTQuery.eic(_name, ((String) _get)));
          };
          _exists=IterableExtensions.<ASTUseStmtNode>exists(_filter, _function_6);
        }
        if (_exists) {
          result.addMatch(moduleNode);
        }
      };
      it.setFind(_function_5);
    };
    MappingType _doubleArrow_4 = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType_3, _function_4);
    this.ModuleThatUsesMT = _doubleArrow_4;
    CodeConcept _codeConcept = new CodeConcept("NUOPCComponent", Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("genericImport")));
    final Procedure1<CodeConcept> _function_5 = (CodeConcept it) -> {
      Pair<String, String> _mappedTo_11 = Pair.<String, String>of("uses", "$genericImport");
      MappingType _withParams = this.ModuleThatUsesMT.withParams(Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_11)));
      it.setMappingType(_withParams);
      Pair<String, String> _mappedTo_12 = Pair.<String, String>of("uses", "ESMF");
      MappingType _withParams_1 = this.ModuleUseStmtMT.withParams(Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_12)));
      it.addSubconcept("UsesESMF", _withParams_1);
      Pair<String, String> _mappedTo_13 = Pair.<String, String>of("uses", "NUOPC");
      MappingType _withParams_2 = this.ModuleUseStmtMT.withParams(Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_13)));
      it.addSubconcept("UsesNUOPC", _withParams_2);
      Pair<String, String> _mappedTo_14 = Pair.<String, String>of("uses", "$genericImport");
      MappingType _withParams_3 = this.ModuleUseStmtMT.withParams(Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_14)));
      it.addSubconcept("UsesGeneric", _withParams_3);
      it.addSubconcept("SetServices", this.SetServicesMT);
    };
    CodeConcept _doubleArrow_5 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept, _function_5);
    this.NUOPCComponent = _doubleArrow_5;
    Pair<String, String> _mappedTo_11 = Pair.<String, String>of("genericImport", "NUOPC_Driver");
    CodeConcept _refine_1 = this.NUOPCComponent.refine("NUOPCDriver", Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_11)));
    final Procedure1<CodeConcept> _function_6 = (CodeConcept it) -> {
      Pair<String, String> _mappedTo_12 = Pair.<String, String>of("SetServices", "../SetServices");
      Pair<String, String> _mappedTo_13 = Pair.<String, String>of("labelComponent", "NUOPC_Driver");
      Pair<String, String> _mappedTo_14 = Pair.<String, String>of("labelName", "label_SetModelServices");
      MappingType _withParams = this.SpecializationMethodMT.withParams(
        Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_12, _mappedTo_13, _mappedTo_14)));
      it.addSubconcept("SetModelServices", _withParams);
    };
    CodeConcept _doubleArrow_6 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_refine_1, _function_6);
    this.NUOPCDriver = _doubleArrow_6;
    BootstrapCodeConcept _bootstrapCodeConcept = new BootstrapCodeConcept(this.NUOPCDriver);
    this.NUOPCDriverFromFile = _bootstrapCodeConcept;
  }
}
