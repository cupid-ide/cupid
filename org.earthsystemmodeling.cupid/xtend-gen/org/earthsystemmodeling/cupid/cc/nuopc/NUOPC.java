package org.earthsystemmodeling.cupid.cc.nuopc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.CodeConceptTemplate;
import org.earthsystemmodeling.cupid.cc.fortran.FortranMappingTypes;
import org.earthsystemmodeling.cupid.cc.mapping.MappingResult;
import org.earthsystemmodeling.cupid.cc.mapping.MappingResultSet;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.earthsystemmodeling.cupid.nuopc.ESMFCodeTemplates;
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
  public CodeConcept NUOPCComponent;
  
  public CodeConcept NUOPCDriver;
  
  public CodeConcept SetServices;
  
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
    Pair<String, Class<String>> _mappedTo = Pair.<String, Class<String>>of("name", String.class);
    Pair<String, Class<String>> _mappedTo_1 = Pair.<String, Class<String>>of("gcomp", String.class);
    Pair<String, Class<String>> _mappedTo_2 = Pair.<String, Class<String>>of("rc", String.class);
    MappingType _mappingType = new MappingType("ESMFMethodMT", ASTModuleNode.class, ASTSubroutineSubprogramNode.class, 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2)));
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
        _builder.append("subroutine {name}({gcomp}, {rc})");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("type(ESMF_GridComp)  :: {gcomp}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("integer, intent(out) :: {rc}");
        _builder.newLine();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("rc = ESMF_SUCCESS");
        _builder.newLine();
        _builder.newLine();
        _builder.append("end subroutine");
        _builder.newLine();
        final String code = b.fill(_builder.toString());
        ASTSubroutineSubprogramNode ssn = CodeExtraction.<ASTSubroutineSubprogramNode>parseLiteralProgramUnit(code);
        IASTListNode<IModuleBodyConstruct> _moduleBody = module.getModuleBody();
        _moduleBody.add(ssn);
        b.setMatch(ssn);
      };
      it.setForwardAdd(_function_2);
    };
    MappingType _doubleArrow = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType, _function);
    this.ESMFMethodMT = _doubleArrow;
    Pair<String, Class<CodeConceptInstance>> _mappedTo_3 = Pair.<String, Class<CodeConceptInstance>>of("SetServices", CodeConceptInstance.class);
    Pair<String, Class<String>> _mappedTo_4 = Pair.<String, Class<String>>of("specLabel", String.class);
    Pair<String, Class<String>> _mappedTo_5 = Pair.<String, Class<String>>of("specPhaseLabel", String.class);
    Pair<String, Class<String>> _mappedTo_6 = Pair.<String, Class<String>>of("labelComponent", String.class);
    Pair<String, Class<String>> _mappedTo_7 = Pair.<String, Class<String>>of("labelName", String.class);
    MappingType _refine = this.ESMFMethodMT.refine(
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_3, _mappedTo_4, _mappedTo_5, _mappedTo_6, _mappedTo_7)));
    final Procedure1<MappingType> _function_1 = (MappingType it) -> {
      final Procedure1<MappingTypeBinding> _function_2 = (MappingTypeBinding bind) -> {
        final ASTModuleNode module = bind.<ASTModuleNode>context();
        Object _value = bind.<Object>getValue("SetServices");
        Object _match = ((CodeConceptInstance) _value).getMatch();
        final ASTSubroutineSubprogramNode setServicesNode = ((ASTSubroutineSubprogramNode) _match);
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
                String _value_1 = bind.<String>getValue("labelComponent");
                String _value_2 = bind.<String>getValue("labelName");
                String _localName = ASTQuery.localName(module, _value_1, _value_2);
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
      final Procedure1<MappingTypeBinding> _function_3 = (MappingTypeBinding bind) -> {
        final ASTModuleNode moduleNode = bind.<ASTModuleNode>context();
        final CodeConceptInstance setServices = bind.<CodeConceptInstance>getValue("SetServices");
        final Object gcomp = setServices.get("gcomp");
        final Object rc = setServices.get("rc");
        final String name = bind.getValueString("name");
        final String labelComponent = bind.getValueString("labelComponent");
        final String labelName = bind.getValueString("labelName");
        final String specLabel = bind.getValueString("specLabel");
        final String specPhaseLabel = bind.getValueString("specPhaseLabel");
        FortranMappingTypes.ensureImport(moduleNode, labelComponent, labelName, specLabel, true);
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("call NUOPC_CompSpecialize(");
        _builder.append(gcomp, "");
        _builder.append(", specLabel=");
        _builder.append(specLabel, "");
        _builder.append(", &");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        {
          boolean _notEquals = (!Objects.equal(specPhaseLabel, null));
          if (_notEquals) {
            _builder.append("specPhaseLabel=");
            _builder.append(specPhaseLabel, "\t");
            _builder.append(", ");
          }
        }
        _builder.append("specRoutine=");
        _builder.append(name, "\t");
        _builder.append(", rc=");
        _builder.append(rc, "\t");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        final String code = _builder.toString();
        ASTCallStmtNode regCall = CodeExtraction.<ASTCallStmtNode>parseLiteralStatement(code);
        Object _match = setServices.getMatch();
        IASTListNode<IBodyConstruct> _body = ((ASTSubroutineSubprogramNode) _match).getBody();
        _body.add(regCall);
      };
      it.setForwardAdd(_function_3);
    };
    MappingType _doubleArrow_1 = ObjectExtensions.<MappingType>operator_doubleArrow(_refine, _function_1);
    this.SpecializationMethodMT = _doubleArrow_1;
    Pair<String, Class<String>> _mappedTo_8 = Pair.<String, Class<String>>of("compLabel", String.class);
    Pair<String, Class<String>> _mappedTo_9 = Pair.<String, Class<String>>of("srcCompLabel", String.class);
    Pair<String, Class<String>> _mappedTo_10 = Pair.<String, Class<String>>of("dstCompLabel", String.class);
    MappingType _refine_1 = FortranMappingTypes.CallInSubroutineMT.refine(
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_8, _mappedTo_9, _mappedTo_10)));
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
      final Procedure1<MappingTypeBinding> _function_4 = (MappingTypeBinding bind) -> {
        final String gcomp = bind.getValueString("gcomp");
        final String rc = bind.getValueString("rc");
        final String slot = bind.getValueString("slot");
        final String compLabel = bind.getValueString("compLabel");
        final String phaseLabel = bind.getValueString("phaseLabel");
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("call NUOPC_DriverAddRunElement(");
        _builder.append(gcomp, "");
        _builder.append(", slot=");
        _builder.append(slot, "");
        _builder.append(", &");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("compLabel=");
        _builder.append(compLabel, "    ");
        _builder.append(", ");
        {
          boolean _notEquals = (!Objects.equal(phaseLabel, null));
          if (_notEquals) {
            _builder.append("phaseLabel=");
            _builder.append(phaseLabel, "    ");
            _builder.append(",");
          }
        }
        _builder.append(" rc=");
        _builder.append(rc, "    ");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        final String code = _builder.toString();
        final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
        final ASTSubroutineSubprogramNode ssn = bind.<ASTSubroutineSubprogramNode>context();
        IASTListNode<IBodyConstruct> _body = ssn.getBody();
        _body.addAll(stmts);
      };
      it.setForwardAdd(_function_4);
    };
    final MappingType AddComponentToDriverMT = ObjectExtensions.<MappingType>operator_doubleArrow(_refine_1, _function_2);
    Pair<String, Class<String>> _mappedTo_11 = Pair.<String, Class<String>>of("rc", String.class);
    Pair<String, Class<String>> _mappedTo_12 = Pair.<String, Class<String>>of("gcomp", String.class);
    Pair<String, Class<String>> _mappedTo_13 = Pair.<String, Class<String>>of("routineSetServices", String.class);
    MappingType _mappingType_1 = new MappingType("SetServicesMT", ASTModuleNode.class, ASTSubroutineSubprogramNode.class, 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_11, _mappedTo_12, _mappedTo_13)));
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
      final Procedure1<MappingTypeBinding> _function_5 = (MappingTypeBinding bind) -> {
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("subroutine SetServices({gcomp}, {rc})");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("type(ESMF_GridComp)  :: {gcomp}");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("integer, intent(out) :: {rc}");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("rc = ESMF_SUCCESS");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("! NUOPC_Driver registers the generic methods");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("call NUOPC_CompDerive({gcomp}, {routineSetServices}, rc={rc})");
        _builder.newLine();
        _builder.append("    ");
        String _valueString = bind.getValueString("rc");
        CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(_valueString);
        _builder.append(_ESMFErrorCheck, "    ");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("end subroutine");
        _builder.newLine();
        final String code = bind.fill(_builder.toString());
        final ASTSubroutineSubprogramNode ssn = CodeExtraction.<ASTSubroutineSubprogramNode>parseLiteralProgramUnit(code);
        final ASTModuleNode moduleNode = bind.<ASTModuleNode>context();
        IASTListNode<IModuleBodyConstruct> _moduleBody = moduleNode.getModuleBody();
        _moduleBody.add(ssn);
        bind.setMatch(ssn);
      };
      it.setForwardAdd(_function_5);
    };
    MappingType _doubleArrow_2 = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType_1, _function_3);
    this.SetServicesMT = _doubleArrow_2;
    CodeConceptTemplate _codeConceptTemplate = new CodeConceptTemplate("SetServices", Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList()));
    final Procedure1<CodeConceptTemplate> _function_4 = (CodeConceptTemplate it) -> {
      Pair<String, String> _mappedTo_14 = Pair.<String, String>of("rc", "rc");
      Pair<String, String> _mappedTo_15 = Pair.<String, String>of("gcomp", "gcomp");
      Pair<String, String> _mappedTo_16 = Pair.<String, String>of("routineSetServices", "fixme");
      it.addAnnotationsWithDefaults(Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_14, _mappedTo_15, _mappedTo_16)));
      Pair<String, String> _mappedTo_17 = Pair.<String, String>of("rc", "@rc");
      Pair<String, String> _mappedTo_18 = Pair.<String, String>of("gcomp", "@gcomp");
      Pair<String, String> _mappedTo_19 = Pair.<String, String>of("routineSetServices", "@routineSetServices");
      it.setMappingType(this.SetServicesMT, Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_17, _mappedTo_18, _mappedTo_19)));
    };
    CodeConceptTemplate _doubleArrow_3 = ObjectExtensions.<CodeConceptTemplate>operator_doubleArrow(_codeConceptTemplate, _function_4);
    this.SetServices = _doubleArrow_3;
    CodeConcept _codeConcept = new CodeConcept("NUOPCComponent");
    final Procedure1<CodeConcept> _function_5 = (CodeConcept it) -> {
      it.addAnnotation("name");
      Pair<String, String> _mappedTo_14 = Pair.<String, String>of("name", "@name");
      it.setMappingType(FortranMappingTypes.ModuleMT, Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_14)));
      Pair<String, String> _mappedTo_15 = Pair.<String, String>of("uses", "ESMF");
      it.addSubconcept("UsesESMF", FortranMappingTypes.ModuleUseStmtMT, false, 1, 1, Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_15)), true);
      Pair<String, String> _mappedTo_16 = Pair.<String, String>of("uses", "NUOPC");
      it.addSubconcept("UsesNUOPC", FortranMappingTypes.ModuleUseStmtMT, false, 1, 1, Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_16)), true);
      it.addSubconcept("SetServices", this.SetServices, false, 1, 1, true);
    };
    CodeConcept _doubleArrow_4 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept, _function_5);
    this.NUOPCComponent = _doubleArrow_4;
    CodeConcept _codeConcept_1 = new CodeConcept("AddComponent");
    final Procedure1<CodeConcept> _function_6 = (CodeConcept it) -> {
      it.addAnnotations(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("compLabel", "srcCompLabel", "dstCompLabel")));
      Pair<String, String> _mappedTo_14 = Pair.<String, String>of("calls", "NUOPC_DriverAddComp");
      Pair<String, String> _mappedTo_15 = Pair.<String, String>of("compLabel", "@compLabel");
      Pair<String, String> _mappedTo_16 = Pair.<String, String>of("srcCompLabel", "@srcCompLabel");
      Pair<String, String> _mappedTo_17 = Pair.<String, String>of("dstCompLabel", "@dstCompLabel");
      it.setMappingType(AddComponentToDriverMT, 
        Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_14, _mappedTo_15, _mappedTo_16, _mappedTo_17)));
    };
    final CodeConcept SetModelServices_AddComponent = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept_1, _function_6);
    CodeConcept _codeConcept_2 = new CodeConcept("SetModelServices");
    final Procedure1<CodeConcept> _function_7 = (CodeConcept it) -> {
      Pair<String, String> _mappedTo_14 = Pair.<String, String>of("SetServices", "../SetServices");
      Pair<String, String> _mappedTo_15 = Pair.<String, String>of("labelComponent", "NUOPC_Driver");
      Pair<String, String> _mappedTo_16 = Pair.<String, String>of("labelName", "label_SetModelServices");
      Pair<String, String> _mappedTo_17 = Pair.<String, String>of("specLabel", "driver_label_SetModelServices");
      Pair<String, String> _mappedTo_18 = Pair.<String, String>of("specPhaseLabel", null);
      Pair<String, String> _mappedTo_19 = Pair.<String, String>of("name", "SetModelServices");
      Pair<String, String> _mappedTo_20 = Pair.<String, String>of("gcomp", "gcomp");
      Pair<String, String> _mappedTo_21 = Pair.<String, String>of("rc", "rc");
      it.setMappingType(this.SpecializationMethodMT, 
        Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_14, _mappedTo_15, _mappedTo_16, _mappedTo_17, _mappedTo_18, _mappedTo_19, _mappedTo_20, _mappedTo_21)));
    };
    final CodeConcept SetModelServices = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept_2, _function_7);
    CodeConcept _extend = this.NUOPCComponent.extend("NUOPCDriver");
    final Procedure1<CodeConcept> _function_8 = (CodeConcept it) -> {
      Pair<String, String> _mappedTo_14 = Pair.<String, String>of("uses", "NUOPC_Driver");
      Pair<String, String> _mappedTo_15 = Pair.<String, String>of("entity", "SetServices");
      Pair<String, String> _mappedTo_16 = Pair.<String, String>of("localName", "driverSS");
      it.addSubconcept("UsesGeneric", FortranMappingTypes.ModuleUseEntityMT, true, 1, 1, Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_14, _mappedTo_15, _mappedTo_16)), true);
      it.addSubconcept("SetModelServices", SetModelServices, false, 1, 1, true);
    };
    CodeConcept _doubleArrow_5 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_extend, _function_8);
    this.NUOPCDriver = _doubleArrow_5;
  }
}
