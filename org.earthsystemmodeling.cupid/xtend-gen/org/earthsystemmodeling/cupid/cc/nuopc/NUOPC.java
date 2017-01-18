package org.earthsystemmodeling.cupid.cc.nuopc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.cc.BootstrapCodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptTemplate;
import org.earthsystemmodeling.cupid.cc.fortran.FortranMappingTypes;
import org.earthsystemmodeling.cupid.cc.mapping.MappingResult;
import org.earthsystemmodeling.cupid.cc.mapping.MappingResultSet;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.earthsystemmodeling.cupid.nuopc.ESMFQuery;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineArgNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineNameNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IExpr;
import org.eclipse.photran.internal.core.parser.IModuleBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class NUOPC {
  private static NUOPC instance;
  
  /**
   * mapping types
   */
  public MappingType SetServicesMT;
  
  public MappingType ESMFMethodMT;
  
  public MappingType SpecializationMethodMT;
  
  /**
   * concepts
   */
  public CodeConceptTemplate NUOPCComponent;
  
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
  
  protected NUOPC() {
    FortranMappingTypes.getInstance();
    Pair<String, Class<ASTModuleNode>> _mappedTo = Pair.<String, Class<ASTModuleNode>>of("context", ASTModuleNode.class);
    Pair<String, Class<ASTSubroutineSubprogramNode>> _mappedTo_1 = Pair.<String, Class<ASTSubroutineSubprogramNode>>of("match", ASTSubroutineSubprogramNode.class);
    MappingType _mappingType = new MappingType("ESMFMethodMT", 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo, _mappedTo_1)));
    final Procedure1<MappingType> _function = (MappingType it) -> {
      final Procedure1<MappingTypeBinding> _function_1 = (MappingTypeBinding bind) -> {
        final ASTModuleNode module = bind.<ASTModuleNode>context();
        Iterable<ASTSubroutineSubprogramNode> _findESMFMethods = ESMFQuery.findESMFMethods(module);
        final Consumer<ASTSubroutineSubprogramNode> _function_2 = (ASTSubroutineSubprogramNode m) -> {
          bind.addResult(m);
        };
        _findESMFMethods.forEach(_function_2);
      };
      it.setFind(_function_1);
      final Procedure1<MappingTypeBinding> _function_2 = (MappingTypeBinding b) -> {
        final ASTModuleNode module = b.<ASTModuleNode>context();
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("subroutine ");
        Object _value = b.<Object>getValue("name");
        _builder.append(_value, "");
        _builder.append("(");
        Object _value_1 = b.<Object>getValue("gcomp");
        _builder.append(_value_1, "");
        _builder.append(", ");
        Object _value_2 = b.<Object>getValue("import");
        _builder.append(_value_2, "");
        _builder.append(", ");
        Object _value_3 = b.<Object>getValue("export");
        _builder.append(_value_3, "");
        _builder.append(", ");
        Object _value_4 = b.<Object>getValue("clock");
        _builder.append(_value_4, "");
        _builder.append(", ");
        Object _value_5 = b.<Object>getValue("rc");
        _builder.append(_value_5, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("type(ESMF_GridComp)  :: ");
        Object _value_6 = b.<Object>getValue("gcomp");
        _builder.append(_value_6, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("type(ESMF_State)     :: ");
        Object _value_7 = b.<Object>getValue("import");
        _builder.append(_value_7, "\t");
        _builder.append(", ");
        Object _value_8 = b.<Object>getValue("export");
        _builder.append(_value_8, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("type(ESMF_Clock)     :: ");
        Object _value_9 = b.<Object>getValue("clock");
        _builder.append(_value_9, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("integer, intent(out) :: ");
        Object _value_10 = b.<Object>getValue("rc");
        _builder.append(_value_10, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("rc = ESMF_SUCCESS");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("end subroutine");
        _builder.newLine();
        final String code = _builder.toString();
        ASTSubroutineSubprogramNode ssn = CodeExtraction.<ASTSubroutineSubprogramNode>parseLiteralProgramUnit(code);
        IASTListNode<IModuleBodyConstruct> _moduleBody = module.getModuleBody();
        _moduleBody.add(ssn);
      };
      it.setForwardAdd(_function_2);
    };
    MappingType _doubleArrow = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType, _function);
    this.ESMFMethodMT = _doubleArrow;
    Pair<String, Class<ASTSubroutineSubprogramNode>> _mappedTo_2 = Pair.<String, Class<ASTSubroutineSubprogramNode>>of("SetServices", ASTSubroutineSubprogramNode.class);
    Pair<String, Class<String>> _mappedTo_3 = Pair.<String, Class<String>>of("labelComponent", String.class);
    Pair<String, Class<String>> _mappedTo_4 = Pair.<String, Class<String>>of("labelName", String.class);
    MappingType _refine = this.ESMFMethodMT.refine(
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_2, _mappedTo_3, _mappedTo_4)));
    final Procedure1<MappingType> _function_1 = (MappingType it) -> {
      final Procedure1<MappingTypeBinding> _function_2 = (MappingTypeBinding bind) -> {
        final ASTModuleNode module = bind.<ASTModuleNode>context();
        final ASTSubroutineSubprogramNode setServicesNode = bind.<ASTSubroutineSubprogramNode>getValue("SetServices");
        MappingResultSet _resultSet = bind.getResultSet();
        final Function1<ASTSubroutineSubprogramNode, Boolean> _function_3 = (ASTSubroutineSubprogramNode m) -> {
          return Boolean.valueOf(Objects.equal(m, setServicesNode));
        };
        _resultSet.<ASTSubroutineSubprogramNode>removeMatchIf(_function_3);
        MappingResultSet _resultSet_1 = bind.getResultSet();
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
                String _value = bind.<String>getValue("labelComponent");
                String _value_1 = bind.<String>getValue("labelName");
                String _localName = ASTQuery.localName(module, _value, _value_1);
                _eic_2=ASTQuery.eic(_litArgExprByKeyword_1, _localName);
              }
              _and = _eic_2;
            }
            return Boolean.valueOf(_and);
          };
          return Boolean.valueOf(IterableExtensions.<ASTCallStmtNode>exists(_filter, _function_5));
        };
        _resultSet_1.<ASTSubroutineSubprogramNode>retainMatchIf(_function_4);
      };
      it.setFind(_function_2);
    };
    MappingType _doubleArrow_1 = ObjectExtensions.<MappingType>operator_doubleArrow(_refine, _function_1);
    this.SpecializationMethodMT = _doubleArrow_1;
    Pair<String, Class<String>> _mappedTo_5 = Pair.<String, Class<String>>of("compLabel", String.class);
    Pair<String, Class<String>> _mappedTo_6 = Pair.<String, Class<String>>of("srcCompLabel", String.class);
    Pair<String, Class<String>> _mappedTo_7 = Pair.<String, Class<String>>of("dstCompLabel", String.class);
    MappingType _refine_1 = FortranMappingTypes.CallInSubroutineMT.refine(
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_5, _mappedTo_6, _mappedTo_7)));
    final Procedure1<MappingType> _function_2 = (MappingType it) -> {
      final Procedure1<MappingTypeBinding> _function_3 = (MappingTypeBinding bind) -> {
        MappingResultSet _resultSet = bind.getResultSet();
        List<MappingResult> _results = _resultSet.getResults();
        final Consumer<MappingResult> _function_4 = (MappingResult r) -> {
          Object _match = r.match();
          final ASTCallStmtNode callStmt = ((ASTCallStmtNode) _match);
          IASTListNode<ASTSubroutineArgNode> _argList = callStmt.getArgList();
          ASTSubroutineArgNode _get = _argList.get(1);
          Token _name = _get.getName();
          boolean _eic = false;
          if (_name!=null) {
            _eic=ASTQuery.eic(_name, "srcCompLabel");
          }
          if (_eic) {
            IASTListNode<ASTSubroutineArgNode> _argList_1 = callStmt.getArgList();
            ASTSubroutineArgNode _get_1 = _argList_1.get(1);
            IExpr _expr = _get_1.getExpr();
            String _literal = ASTQuery.literal(_expr);
            r.put("srcCompLabel", _literal);
            IASTListNode<ASTSubroutineArgNode> _argList_2 = callStmt.getArgList();
            ASTSubroutineArgNode _get_2 = _argList_2.get(2);
            IExpr _expr_1 = _get_2.getExpr();
            String _literal_1 = ASTQuery.literal(_expr_1);
            r.put("dstCompLabel", _literal_1);
          } else {
            IASTListNode<ASTSubroutineArgNode> _argList_3 = callStmt.getArgList();
            ASTSubroutineArgNode _get_3 = _argList_3.get(1);
            IExpr _expr_2 = _get_3.getExpr();
            String _literal_2 = ASTQuery.literal(_expr_2);
            r.put("compLabel", _literal_2);
          }
        };
        _results.forEach(_function_4);
      };
      it.setFind(_function_3);
    };
    final MappingType AddComponentToDriverMT = ObjectExtensions.<MappingType>operator_doubleArrow(_refine_1, _function_2);
    MappingType _mappingType_1 = new MappingType("SetServicesMT", ASTModuleNode.class, ASTSubroutineSubprogramNode.class);
    final Procedure1<MappingType> _function_3 = (MappingType it) -> {
      final Procedure1<MappingTypeBinding> _function_4 = (MappingTypeBinding me) -> {
        final ASTModuleNode module = me.<ASTModuleNode>context();
        IASTListNode<IModuleBodyConstruct> _moduleBody = module.getModuleBody();
        Set<ASTSubroutineSubprogramNode> _findAll = null;
        if (_moduleBody!=null) {
          _findAll=_moduleBody.<ASTSubroutineSubprogramNode>findAll(ASTSubroutineSubprogramNode.class);
        }
        final Function1<ASTSubroutineSubprogramNode, Boolean> _function_5 = (ASTSubroutineSubprogramNode it_1) -> {
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
            final Function1<ASTCallStmtNode, Boolean> _function_6 = (ASTCallStmtNode it_2) -> {
              Token _subroutineName_2 = it_2.getSubroutineName();
              String _text_1 = _subroutineName_2.getText();
              return Boolean.valueOf(_text_1.equalsIgnoreCase("NUOPC_CompDerive"));
            };
            boolean _exists = IterableExtensions.<ASTCallStmtNode>exists(_findAll_1, _function_6);
            _or = _exists;
          }
          return Boolean.valueOf(_or);
        };
        final ASTSubroutineSubprogramNode ssn = IterableExtensions.<ASTSubroutineSubprogramNode>findFirst(_findAll, _function_5);
        boolean _notEquals = (!Objects.equal(ssn, null));
        if (_notEquals) {
          me.addResult(ssn);
        }
      };
      it.setFind(_function_4);
    };
    MappingType _doubleArrow_2 = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType_1, _function_3);
    this.SetServicesMT = _doubleArrow_2;
    CodeConceptTemplate _codeConceptTemplate = new CodeConceptTemplate("NUOPCComponent", Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("genericImport")));
    final Procedure1<CodeConceptTemplate> _function_4 = (CodeConceptTemplate it) -> {
      it.addAnnotation("name");
      Pair<String, String> _mappedTo_8 = Pair.<String, String>of("uses", "$genericImport");
      Pair<String, String> _mappedTo_9 = Pair.<String, String>of("name", "@name");
      it.setMappingType(FortranMappingTypes.ModuleThatUsesMT, Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_8, _mappedTo_9)));
      Pair<String, String> _mappedTo_10 = Pair.<String, String>of("uses", "ESMF");
      Pair<String, String> _mappedTo_11 = Pair.<String, String>of("uses", "NUOPC");
      Pair<String, String> _mappedTo_12 = Pair.<String, String>of("uses", "$genericImport");
      it.addSubconcepts(
        Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList("UsesESMF", FortranMappingTypes.ModuleUseStmtMT, Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_10)))), 
        Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList("UsesNUOPC", FortranMappingTypes.ModuleUseStmtMT, Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_11)))), 
        Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList("UsesGeneric", FortranMappingTypes.ModuleUseStmtMT, Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_12)))), 
        Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList("SetServices", this.SetServicesMT)));
    };
    CodeConceptTemplate _doubleArrow_3 = ObjectExtensions.<CodeConceptTemplate>operator_doubleArrow(_codeConceptTemplate, _function_4);
    this.NUOPCComponent = _doubleArrow_3;
    CodeConcept _codeConcept = new CodeConcept("AddComponent");
    final Procedure1<CodeConcept> _function_5 = (CodeConcept it) -> {
      it.addAnnotations(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("compLabel", "srcCompLabel", "dstCompLabel")));
      Pair<String, String> _mappedTo_8 = Pair.<String, String>of("calls", "NUOPC_DriverAddComp");
      Pair<String, String> _mappedTo_9 = Pair.<String, String>of("compLabel", "@compLabel");
      Pair<String, String> _mappedTo_10 = Pair.<String, String>of("srcCompLabel", "@srcCompLabel");
      Pair<String, String> _mappedTo_11 = Pair.<String, String>of("dstCompLabel", "@dstCompLabel");
      it.setMappingType(AddComponentToDriverMT, 
        Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_8, _mappedTo_9, _mappedTo_10, _mappedTo_11)));
    };
    final CodeConcept SetModelServices_AddComponent = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept, _function_5);
    Pair<String, String> _mappedTo_8 = Pair.<String, String>of("genericImport", "NUOPC_Driver");
    CodeConcept _instantiate = this.NUOPCComponent.instantiate("NUOPCDriver", Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_8)));
    final Procedure1<CodeConcept> _function_6 = (CodeConcept it) -> {
      Pair<String, String> _mappedTo_9 = Pair.<String, String>of("SetServices", "../SetServices");
      Pair<String, String> _mappedTo_10 = Pair.<String, String>of("labelComponent", "NUOPC_Driver");
      Pair<String, String> _mappedTo_11 = Pair.<String, String>of("labelName", "label_SetModelServices");
      it.addSubconcepts(
        Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList("SetModelServices", this.SpecializationMethodMT, Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_9, _mappedTo_10, _mappedTo_11)), Collections.<List<Object>>unmodifiableList(CollectionLiterals.<List<Object>>newArrayList(Collections.<Object>unmodifiableList(CollectionLiterals.<Object>newArrayList(SetModelServices_AddComponent, Integer.valueOf(1), Integer.valueOf((-1)))))))));
    };
    CodeConcept _doubleArrow_4 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_instantiate, _function_6);
    this.NUOPCDriver = _doubleArrow_4;
    BootstrapCodeConcept _bootstrapCodeConcept = new BootstrapCodeConcept(this.NUOPCDriver);
    this.NUOPCDriverFromFile = _bootstrapCodeConcept;
  }
}
