package org.earthsystemmodeling.cupid.cc.nuopc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
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
   * refines ESMFMethodMT
   */
  public MappingType AddComponentToDriverMT;
  
  /**
   * refines CallInSubroutineMT
   */
  public MappingType NUOPCEntryPointMT;
  
  public MappingType AdvertiseFieldsMT;
  
  /**
   * concepts
   */
  public CodeConcept NUOPCComponent;
  
  public CodeConcept NUOPCModel;
  
  public CodeConcept NUOPCModelRoot;
  
  public CodeConcept NUOPCDriver;
  
  public CodeConcept NUOPCDriverRoot;
  
  public CodeConcept SetServices;
  
  public CodeConcept SetModelServices;
  
  public CodeConcept SetModelServices$AddComponent;
  
  public CodeConcept ESMFEntryPoint;
  
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
    Pair<String, Class<ASTSubroutineSubprogramNode>> _mappedTo_3 = Pair.<String, Class<ASTSubroutineSubprogramNode>>of("SetServices", ASTSubroutineSubprogramNode.class);
    Pair<String, Class<ASTCallStmtNode>> _mappedTo_4 = Pair.<String, Class<ASTCallStmtNode>>of("Reg", ASTCallStmtNode.class);
    Pair<String, Class<String>> _mappedTo_5 = Pair.<String, Class<String>>of("name", String.class);
    Pair<String, Class<String>> _mappedTo_6 = Pair.<String, Class<String>>of("phaseNumber", String.class);
    Pair<String, Class<String>> _mappedTo_7 = Pair.<String, Class<String>>of("phaseLabel", String.class);
    Pair<String, Class<String>> _mappedTo_8 = Pair.<String, Class<String>>of("methodType", String.class);
    MappingType _mappingType_1 = new MappingType("NUOPCEntryPointMT", ASTModuleNode.class, ASTSubroutineSubprogramNode.class, 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_3, _mappedTo_4, _mappedTo_5, _mappedTo_6, _mappedTo_7, _mappedTo_8)));
    final Procedure1<MappingType> _function_1 = (MappingType it) -> {
      final Procedure1<MappingTypeBinding> _function_2 = (MappingTypeBinding bind) -> {
        final ASTModuleNode module = bind.<ASTModuleNode>context();
        final ASTSubroutineSubprogramNode setServices = bind.<ASTSubroutineSubprogramNode>getValue("SetServices");
        IASTListNode<IBodyConstruct> _body = setServices.getBody();
        Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
        final Consumer<ASTCallStmtNode> _function_3 = (ASTCallStmtNode call) -> {
          bind.reset();
          if ((((ASTQuery.eic(call.getSubroutineName().getText(), "ESMF_GridCompSetEntryPoint") && 
            bind.bindExpr("phaseNumber", ASTQuery.<IExpr>argExprByKeyword(call, "phase"))) || 
            ((ASTQuery.eic(call.getSubroutineName().getText(), "NUOPC_CompSetEntryPoint") && 
              bind.bindExprContains("phaseLabel", ASTQuery.<IExpr>argExprByKeyword(call, "phaseLabelList"))) || 
              bind.bindExprContains("phaseLabel", ASTQuery.<IExpr>argExprByIdx(call, 2)))) && bind.<ASTCallStmtNode>bind("Reg", call))) {
            Iterable<ASTSubroutineSubprogramNode> _findESMFEntryPoints = ESMFQuery.findESMFEntryPoints(module);
            final Function1<ASTSubroutineSubprogramNode, Boolean> _function_4 = (ASTSubroutineSubprogramNode sub) -> {
              return Boolean.valueOf((bind.bindToken("name", sub.getSubroutineStmt().getSubroutineName().getSubroutineName()) && 
                ASTQuery.eic(sub.getSubroutineStmt().getSubroutineName().getSubroutineName(), ASTQuery.litArgExprByKeyword(call, "userRoutine"))));
            };
            final ASTSubroutineSubprogramNode epSub = IterableExtensions.<ASTSubroutineSubprogramNode>findFirst(_findESMFEntryPoints, _function_4);
            boolean _notEquals = (!Objects.equal(epSub, null));
            if (_notEquals) {
              bind.addResult(epSub);
            }
          }
        };
        _filter.forEach(_function_3);
      };
      it.setFind(_function_2);
      it.addTemplate("body", "");
      final Procedure1<MappingTypeBinding> _function_3 = (MappingTypeBinding bind) -> {
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("subroutine <name>(gcomp, importState, exportState, clock, rc)");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("type(ESMF_GridComp)  :: gcomp");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("type(ESMF_State)     :: importState, exportState");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("type(ESMF_Clock)     :: clock");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("integer, intent(out) :: rc");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("rc = ESMF_SUCCESS");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("<body()>");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("end subroutine");
        _builder.newLine();
        final ASTSubroutineSubprogramNode ssn = bind.<ASTSubroutineSubprogramNode>parseProgramUnit(_builder.toString());
        final ASTModuleNode module = bind.<ASTModuleNode>context();
        IASTListNode<IModuleBodyConstruct> _moduleBody = module.getModuleBody();
        _moduleBody.add(ssn);
        bind.setMatch(ssn);
        final ASTSubroutineSubprogramNode setServices = bind.<ASTSubroutineSubprogramNode>getValue("SetServices");
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.newLine();
        _builder_1.append("<if(phaseNumber)>");
        _builder_1.newLine();
        _builder_1.append("call ESMF_GridCompSetEntryPoint(gcomp, <methodType>, &");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t\t\t");
        _builder_1.append("userRoutine=<name>, phase=<phaseNumber>, rc=rc)");
        _builder_1.newLine();
        _builder_1.append("<else>");
        _builder_1.newLine();
        _builder_1.append("call NUOPC_CompSetEntryPoint(gcomp, <methodType>, &");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("<if(phaseLabel)>phaseLabelList=(/\"<phaseLabel>\"/),<endif> userRoutine=<name>, rc=rc)");
        _builder_1.newLine();
        _builder_1.append("<endif>");
        _builder_1.newLine();
        _builder_1.append("<ESMFErrorCheck(\"rc\")>");
        _builder_1.newLine();
        final IASTListNode<IBodyConstruct> regCall = bind.parseStatementSeq(_builder_1.toString());
        IASTListNode<IBodyConstruct> _body = setServices.getBody();
        _body.addAll(regCall);
        IBodyConstruct _get = regCall.get(0);
        bind.<IBodyConstruct>setValue("Reg", _get);
      };
      it.setForwardAdd(_function_3);
    };
    MappingType _doubleArrow_1 = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType_1, _function_1);
    this.NUOPCEntryPointMT = _doubleArrow_1;
    Pair<String, String> _mappedTo_9 = Pair.<String, String>of("methodType", "ESMF_METHOD_INITIALIZE");
    MappingType _refine = this.NUOPCEntryPointMT.refine(Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap()), Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_9)));
    final Procedure1<MappingType> _function_2 = (MappingType it) -> {
      it.addTemplate("body", "! HERE IS THE BODY");
    };
    MappingType _doubleArrow_2 = ObjectExtensions.<MappingType>operator_doubleArrow(_refine, _function_2);
    this.AdvertiseFieldsMT = _doubleArrow_2;
    this.componentDefs();
    this.driverDefs();
    this.modelDefs();
  }
  
  protected CodeConcept componentDefs() {
    CodeConcept _xblockexpression = null;
    {
      Pair<String, Class<ASTSubroutineSubprogramNode>> _mappedTo = Pair.<String, Class<ASTSubroutineSubprogramNode>>of("SetServices", ASTSubroutineSubprogramNode.class);
      Pair<String, Class<String>> _mappedTo_1 = Pair.<String, Class<String>>of("specLabel", String.class);
      Pair<String, Class<String>> _mappedTo_2 = Pair.<String, Class<String>>of("specPhaseLabel", String.class);
      Pair<String, Class<String>> _mappedTo_3 = Pair.<String, Class<String>>of("labelComponent", String.class);
      Pair<String, Class<String>> _mappedTo_4 = Pair.<String, Class<String>>of("labelName", String.class);
      MappingType _refine = this.ESMFMethodMT.refine(
        Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2, _mappedTo_3, _mappedTo_4)));
      final Procedure1<MappingType> _function = (MappingType it) -> {
        final Procedure1<MappingTypeBinding> _function_1 = (MappingTypeBinding bind) -> {
          final ASTModuleNode module = bind.<ASTModuleNode>context();
          final ASTSubroutineSubprogramNode setServicesNode = bind.<ASTSubroutineSubprogramNode>getValue("SetServices");
          MappingResultSet _resultSet = bind.getResultSet();
          final Function1<ASTSubroutineSubprogramNode, Boolean> _function_2 = (ASTSubroutineSubprogramNode m) -> {
            return Boolean.valueOf(Objects.equal(m, setServicesNode));
          };
          _resultSet.<ASTSubroutineSubprogramNode>removeMatchIf(_function_2);
          MappingResultSet _resultSet_1 = bind.getResultSet();
          final Function1<ASTSubroutineSubprogramNode, Boolean> _function_3 = (ASTSubroutineSubprogramNode m) -> {
            IASTListNode<IBodyConstruct> _body = setServicesNode.getBody();
            Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
            final Function1<ASTCallStmtNode, Boolean> _function_4 = (ASTCallStmtNode it_1) -> {
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
            return Boolean.valueOf(IterableExtensions.<ASTCallStmtNode>exists(_filter, _function_4));
          };
          _resultSet_1.<ASTSubroutineSubprogramNode>retainMatchIf(_function_3);
        };
        it.setFind(_function_1);
        final Procedure1<MappingTypeBinding> _function_2 = (MappingTypeBinding bind) -> {
          final ASTModuleNode moduleNode = bind.<ASTModuleNode>context();
          final ASTSubroutineSubprogramNode setServices = bind.<ASTSubroutineSubprogramNode>getValue("SetServices");
          final String labelComponent = bind.getValueString("labelComponent");
          final String labelName = bind.getValueString("labelName");
          final String specLabel = bind.getValueString("specLabel");
          final String specPhaseLabel = bind.getValueString("specPhaseLabel");
          FortranMappingTypes.ensureImport(moduleNode, labelComponent, labelName, specLabel, true);
          StringConcatenation _builder = new StringConcatenation();
          _builder.newLine();
          _builder.append("call NUOPC_CompSpecialize({gcomp}, specLabel={specLabel}, &");
          _builder.newLine();
          _builder.append("\t");
          {
            boolean _notEquals = (!Objects.equal(specPhaseLabel, null));
            if (_notEquals) {
              _builder.append("specPhaseLabel={specPhaseLabel}, ");
            }
          }
          _builder.append("specRoutine={name}, rc={rc})");
          _builder.newLineIfNotEmpty();
          String _valueString = bind.getValueString("rc");
          CharSequence _ESMFErrorCheck = NUOPC.ESMFErrorCheck(_valueString);
          _builder.append(_ESMFErrorCheck, "");
          _builder.newLineIfNotEmpty();
          final String code = bind.fill(_builder.toString());
          ASTCallStmtNode regCall = CodeExtraction.<ASTCallStmtNode>parseLiteralStatement(code);
          IASTListNode<IBodyConstruct> _body = setServices.getBody();
          _body.add(regCall);
        };
        it.setForwardAdd(_function_2);
      };
      MappingType _doubleArrow = ObjectExtensions.<MappingType>operator_doubleArrow(_refine, _function);
      this.SpecializationMethodMT = _doubleArrow;
      Pair<String, Class<String>> _mappedTo_5 = Pair.<String, Class<String>>of("rc", String.class);
      Pair<String, Class<String>> _mappedTo_6 = Pair.<String, Class<String>>of("gcomp", String.class);
      Pair<String, Class<CodeConceptInstance>> _mappedTo_7 = Pair.<String, Class<CodeConceptInstance>>of("genericUse", CodeConceptInstance.class);
      MappingType _mappingType = new MappingType("SetServicesMT", ASTModuleNode.class, ASTSubroutineSubprogramNode.class, 
        Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo_5, _mappedTo_6, _mappedTo_7)));
      final Procedure1<MappingType> _function_1 = (MappingType it) -> {
        final Procedure1<MappingTypeBinding> _function_2 = (MappingTypeBinding me) -> {
          final ASTModuleNode module = me.<ASTModuleNode>context();
          IASTListNode<IModuleBodyConstruct> _moduleBody = module.getModuleBody();
          Set<ASTSubroutineSubprogramNode> _findAll = null;
          if (_moduleBody!=null) {
            _findAll=_moduleBody.<ASTSubroutineSubprogramNode>findAll(ASTSubroutineSubprogramNode.class);
          }
          final Function1<ASTSubroutineSubprogramNode, Boolean> _function_3 = (ASTSubroutineSubprogramNode it_1) -> {
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
              final Function1<ASTCallStmtNode, Boolean> _function_4 = (ASTCallStmtNode it_2) -> {
                Token _subroutineName_2 = it_2.getSubroutineName();
                String _text_1 = _subroutineName_2.getText();
                return Boolean.valueOf(_text_1.equalsIgnoreCase("NUOPC_CompDerive"));
              };
              boolean _exists = IterableExtensions.<ASTCallStmtNode>exists(_findAll_1, _function_4);
              _or = _exists;
            }
            return Boolean.valueOf(_or);
          };
          final ASTSubroutineSubprogramNode ssn = IterableExtensions.<ASTSubroutineSubprogramNode>findFirst(_findAll, _function_3);
          boolean _notEquals = (!Objects.equal(ssn, null));
          if (_notEquals) {
            me.addResult(ssn);
          }
        };
        it.setFind(_function_2);
        final Procedure1<MappingTypeBinding> _function_3 = (MappingTypeBinding bind) -> {
          final CodeConceptInstance genericUse = bind.<CodeConceptInstance>getValue("genericUse");
          Object _get = genericUse.get("genericSS");
          final String routineSS = ((String) _get);
          StringConcatenation _builder = new StringConcatenation();
          _builder.newLine();
          _builder.append("subroutine SetServices(<gcomp>, <rc>)");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("type(ESMF_GridComp)  :: <gcomp>");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("integer, intent(out) :: <rc>");
          _builder.newLine();
          _builder.append("    ");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("rc = ESMF_SUCCESS");
          _builder.newLine();
          _builder.append("    ");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("! Register the generic methods");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("call NUOPC_CompDerive(<gcomp>, ");
          _builder.append(routineSS, "    ");
          _builder.append(", rc=<rc>)");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("<ESMFErrorCheck(rc)>");
          _builder.newLine();
          _builder.append("    ");
          _builder.newLine();
          _builder.append("end subroutine");
          _builder.newLine();
          final ASTSubroutineSubprogramNode ssn = bind.<ASTSubroutineSubprogramNode>parseProgramUnit(_builder.toString());
          final ASTModuleNode moduleNode = bind.<ASTModuleNode>context();
          IASTListNode<IModuleBodyConstruct> _moduleBody = moduleNode.getModuleBody();
          _moduleBody.add(ssn);
          bind.setMatch(ssn);
        };
        it.setForwardAdd(_function_3);
      };
      MappingType _doubleArrow_1 = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType, _function_1);
      this.SetServicesMT = _doubleArrow_1;
      CodeConcept _codeConcept = new CodeConcept("SetServices");
      final Procedure1<CodeConcept> _function_2 = (CodeConcept it) -> {
        Pair<String, String> _mappedTo_8 = Pair.<String, String>of("rc", "rc");
        Pair<String, String> _mappedTo_9 = Pair.<String, String>of("gcomp", "gcomp");
        it.addAnnotationsWithDefaults(Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_8, _mappedTo_9)));
        Pair<String, String> _mappedTo_10 = Pair.<String, String>of("rc", "@rc");
        Pair<String, String> _mappedTo_11 = Pair.<String, String>of("gcomp", "@gcomp");
        Pair<String, String> _mappedTo_12 = Pair.<String, String>of("genericUse", "../UsesGeneric");
        it.setMappingType(this.SetServicesMT, Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_10, _mappedTo_11, _mappedTo_12)));
      };
      CodeConcept _doubleArrow_2 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept, _function_2);
      this.SetServices = _doubleArrow_2;
      CodeConcept _codeConcept_1 = new CodeConcept("EntryPoint");
      final Procedure1<CodeConcept> _function_3 = (CodeConcept it) -> {
        Pair<String, String> _mappedTo_8 = Pair.<String, String>of("name", "EntryPoint");
        Pair<String, String> _mappedTo_9 = Pair.<String, String>of("methodType", "ESMF_METHOD_INITIALIZE");
        it.addAnnotationsWithDefaults(Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_8, _mappedTo_9)));
        it.addAnnotations("phaseNumber", "phaseLabel");
        it.addAnnotation("Reg", ASTCallStmtNode.class);
        Pair<String, String> _mappedTo_10 = Pair.<String, String>of("SetServices", "../SetServices*");
        Pair<String, String> _mappedTo_11 = Pair.<String, String>of("Reg", "@Reg");
        Pair<String, String> _mappedTo_12 = Pair.<String, String>of("name", "@name");
        Pair<String, String> _mappedTo_13 = Pair.<String, String>of("methodType", "@methodType");
        Pair<String, String> _mappedTo_14 = Pair.<String, String>of("phaseNumber", "@phaseNumber");
        Pair<String, String> _mappedTo_15 = Pair.<String, String>of("phaseLabel", "@phaseLabel");
        it.setMappingType(this.NUOPCEntryPointMT, 
          Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_10, _mappedTo_11, _mappedTo_12, _mappedTo_13, _mappedTo_14, _mappedTo_15)));
      };
      CodeConcept _doubleArrow_3 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept_1, _function_3);
      this.ESMFEntryPoint = _doubleArrow_3;
      CodeConcept _codeConcept_2 = new CodeConcept("NUOPCComponent");
      final Procedure1<CodeConcept> _function_4 = (CodeConcept it) -> {
        it.addAnnotations("name");
        Pair<String, String> _mappedTo_8 = Pair.<String, String>of("name", "@name");
        it.setMappingType(FortranMappingTypes.ModuleMT, Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_8)));
        Pair<String, String> _mappedTo_9 = Pair.<String, String>of("uses", "ESMF");
        it.addSubconcept("UsesESMF", FortranMappingTypes.ModuleUseStmtMT, false, 1, 1, Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_9)), true);
        Pair<String, String> _mappedTo_10 = Pair.<String, String>of("uses", "NUOPC");
        it.addSubconcept("UsesNUOPC", FortranMappingTypes.ModuleUseStmtMT, false, 1, 1, Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_10)), true);
        it.addSubconcept("SetServices", this.SetServices, false, 1, 1, true);
        it.addSubconcept("ESMFEntryPoint", this.ESMFEntryPoint, false, 0, (-1), true);
      };
      CodeConcept _doubleArrow_4 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept_2, _function_4);
      _xblockexpression = this.NUOPCComponent = _doubleArrow_4;
    }
    return _xblockexpression;
  }
  
  protected CodeConcept modelDefs() {
    CodeConcept _xblockexpression = null;
    {
      CodeConcept _extend = this.NUOPCComponent.extend("NUOPCModel");
      final Procedure1<CodeConcept> _function = (CodeConcept it) -> {
        Pair<String, String> _mappedTo = Pair.<String, String>of("uses", "NUOPC_Model");
        Pair<String, String> _mappedTo_1 = Pair.<String, String>of("entity", "SetServices");
        Pair<String, String> _mappedTo_2 = Pair.<String, String>of("localName", "@genericSS");
        CodeConcept _addSubconcept = it.addSubconcept("UsesGeneric", FortranMappingTypes.ModuleUseEntityMT, true, 1, 1, 
          Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2)), true);
        final Procedure1<CodeConcept> _function_1 = (CodeConcept it_1) -> {
          Pair<String, String> _mappedTo_3 = Pair.<String, String>of("genericSS", "modelSS");
          it_1.addAnnotationsWithDefaults(Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_3)));
        };
        ObjectExtensions.<CodeConcept>operator_doubleArrow(_addSubconcept, _function_1);
        Pair<String, String> _mappedTo_3 = Pair.<String, String>of("SetServices", "../SetServices*");
        Pair<String, String> _mappedTo_4 = Pair.<String, String>of("phaseLabel", "IPDv01p1");
        CodeConcept _addSubconcept_1 = it.addSubconcept("InitializeAdvertise", this.AdvertiseFieldsMT, false, 1, 1, 
          Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_3, _mappedTo_4)), true);
        final Procedure1<CodeConcept> _function_2 = (CodeConcept it_1) -> {
          Pair<String, String> _mappedTo_5 = Pair.<String, String>of("name", "InitializeAdvertise");
          it_1.addAnnotationsWithDefaults(Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_5)));
        };
        ObjectExtensions.<CodeConcept>operator_doubleArrow(_addSubconcept_1, _function_2);
        Pair<String, String> _mappedTo_5 = Pair.<String, String>of("SetServices", "../SetServices*");
        Pair<String, String> _mappedTo_6 = Pair.<String, String>of("methodType", "ESMF_METHOD_INITIALIZE");
        Pair<String, String> _mappedTo_7 = Pair.<String, String>of("phaseLabel", "IPDv01p2");
        CodeConcept _addSubconcept_2 = it.addSubconcept("InitializeRealize", this.NUOPCEntryPointMT, false, 1, 1, 
          Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_5, _mappedTo_6, _mappedTo_7)), true);
        final Procedure1<CodeConcept> _function_3 = (CodeConcept it_1) -> {
          Pair<String, String> _mappedTo_8 = Pair.<String, String>of("name", "InitializeRealize");
          it_1.addAnnotationsWithDefaults(Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_8)));
        };
        ObjectExtensions.<CodeConcept>operator_doubleArrow(_addSubconcept_2, _function_3);
      };
      CodeConcept _doubleArrow = ObjectExtensions.<CodeConcept>operator_doubleArrow(_extend, _function);
      this.NUOPCModel = _doubleArrow;
      CodeConcept _codeConcept = new CodeConcept("NUOPCModelRoot", FortranMappingTypes.FortranAstMT);
      final Procedure1<CodeConcept> _function_1 = (CodeConcept it) -> {
        it.addSubconcept("NUOPCModel", this.NUOPCModel, true, 1, 1, true);
      };
      CodeConcept _doubleArrow_1 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept, _function_1);
      _xblockexpression = this.NUOPCModelRoot = _doubleArrow_1;
    }
    return _xblockexpression;
  }
  
  protected CodeConcept driverDefs() {
    CodeConcept _xblockexpression = null;
    {
      Pair<String, Class<String>> _mappedTo = Pair.<String, Class<String>>of("gcomp", String.class);
      Pair<String, Class<String>> _mappedTo_1 = Pair.<String, Class<String>>of("rc", String.class);
      Pair<String, Class<String>> _mappedTo_2 = Pair.<String, Class<String>>of("slot", String.class);
      Pair<String, Class<String>> _mappedTo_3 = Pair.<String, Class<String>>of("linkSlot", String.class);
      Pair<String, Class<String>> _mappedTo_4 = Pair.<String, Class<String>>of("compLabel", String.class);
      Pair<String, Class<String>> _mappedTo_5 = Pair.<String, Class<String>>of("phaseLabel", String.class);
      Pair<String, Class<String>> _mappedTo_6 = Pair.<String, Class<String>>of("srcCompLabel", String.class);
      Pair<String, Class<String>> _mappedTo_7 = Pair.<String, Class<String>>of("dstCompLabel", String.class);
      Pair<String, String> _mappedTo_8 = Pair.<String, String>of("calls", "NUOPC_DriverAddRunElement");
      MappingType _refine = FortranMappingTypes.CallInSubroutineMT.refine(
        Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2, _mappedTo_3, _mappedTo_4, _mappedTo_5, _mappedTo_6, _mappedTo_7)), 
        Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_8)));
      final Procedure1<MappingType> _function = (MappingType it) -> {
        final Procedure1<MappingTypeBinding> _function_1 = (MappingTypeBinding bind) -> {
          MappingResultSet _resultSet = bind.getResultSet();
          List<MappingResult> _results = _resultSet.getResults();
          final Consumer<MappingResult> _function_2 = (MappingResult r) -> {
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
          _results.forEach(_function_2);
        };
        it.setFind(_function_1);
        final Procedure1<MappingTypeBinding> _function_2 = (MappingTypeBinding bind) -> {
          StringConcatenation _builder = new StringConcatenation();
          _builder.newLine();
          _builder.append("<if(compLabel)>");
          _builder.newLine();
          _builder.append("call NUOPC_DriverAddRunElement(<gcomp>, slot=<slot>, &");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("compLabel=<compLabel>, <if(phaseLabel)>phaseLabel=<phaseLabel>,<endif> rc=<rc>)");
          _builder.newLine();
          _builder.append("<elseif (srcCompLabel && dstCompLabel)>");
          _builder.newLine();
          _builder.append("call NUOPC_DriverAddRunElement(<gcomp>, slot=<slot>, &");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("srcCompLabel=<srcCompLabel>, dstCompLabel=<dstCompLabel>, rc=<rc>)");
          _builder.newLine();
          _builder.append("<elseif (slot && linkSlot)>");
          _builder.newLine();
          _builder.append("! add a run sequence element to link between slots    ");
          _builder.newLine();
          _builder.append("call NUOPC_DriverAddRunElement(<gcomp>, slot=<slot>, linkSlot=<linkSlot>, rc=<rc>)");
          _builder.newLine();
          _builder.append("<else>");
          _builder.newLine();
          _builder.append("! CODE GENERATION ERROR: incomplete information to generate call to NUOPC_DriverAddRunElement\t");
          _builder.newLine();
          _builder.append("<endif>");
          _builder.newLine();
          _builder.append("<ESMFErrorCheck(rc)>");
          _builder.newLine();
          final IASTListNode<IBodyConstruct> stmts = bind.parseStatementSeq(_builder.toString());
          final ASTSubroutineSubprogramNode ssn = bind.<ASTSubroutineSubprogramNode>context();
          IASTListNode<IBodyConstruct> _body = ssn.getBody();
          _body.addAll(stmts);
        };
        it.setForwardAdd(_function_2);
      };
      MappingType _doubleArrow = ObjectExtensions.<MappingType>operator_doubleArrow(_refine, _function);
      this.AddComponentToDriverMT = _doubleArrow;
      CodeConcept _codeConcept = new CodeConcept("SetModelServices");
      final Procedure1<CodeConcept> _function_1 = (CodeConcept it) -> {
        Pair<String, String> _mappedTo_9 = Pair.<String, String>of("gcomp", "gcomp");
        Pair<String, String> _mappedTo_10 = Pair.<String, String>of("rc", "rc");
        Pair<String, String> _mappedTo_11 = Pair.<String, String>of("name", "SetModelServices");
        Pair<String, String> _mappedTo_12 = Pair.<String, String>of("specLabel", "driver_label_SetModelServices");
        it.addAnnotationsWithDefaults(
          Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_9, _mappedTo_10, _mappedTo_11, _mappedTo_12)));
        Pair<String, String> _mappedTo_13 = Pair.<String, String>of("SetServices", "../SetServices*");
        Pair<String, String> _mappedTo_14 = Pair.<String, String>of("labelComponent", "NUOPC_Driver");
        Pair<String, String> _mappedTo_15 = Pair.<String, String>of("labelName", "label_SetModelServices");
        it.setMappingType(this.SpecializationMethodMT, 
          Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_13, _mappedTo_14, _mappedTo_15)));
        Pair<String, String> _mappedTo_16 = Pair.<String, String>of("gcomp", "../@gcomp");
        Pair<String, String> _mappedTo_17 = Pair.<String, String>of("rc", "../@rc");
        CodeConcept _addSubconcept = it.addSubconcept("AddComponent", this.AddComponentToDriverMT, false, 1, (-1), 
          Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_16, _mappedTo_17)), true);
        final Procedure1<CodeConcept> _function_2 = (CodeConcept it_1) -> {
          Pair<String, String> _mappedTo_18 = Pair.<String, String>of("compLabel", "\"COMP\"");
          Pair<String, String> _mappedTo_19 = Pair.<String, String>of("srcCompLabel", "\"SRC\"");
          Pair<String, String> _mappedTo_20 = Pair.<String, String>of("dstCompLabel", "\"DST\"");
          Pair<String, String> _mappedTo_21 = Pair.<String, String>of("phaseLabel", "FIXME");
          Pair<String, String> _mappedTo_22 = Pair.<String, String>of("slot", "1");
          Pair<String, String> _mappedTo_23 = Pair.<String, String>of("linkSlot", "2");
          it_1.addAnnotationsWithDefaults(
            Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_18, _mappedTo_19, _mappedTo_20, _mappedTo_21, _mappedTo_22, _mappedTo_23)));
        };
        CodeConcept _doubleArrow_1 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_addSubconcept, _function_2);
        this.SetModelServices$AddComponent = _doubleArrow_1;
      };
      CodeConcept _doubleArrow_1 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept, _function_1);
      this.SetModelServices = _doubleArrow_1;
      CodeConcept _extend = this.NUOPCComponent.extend("NUOPCDriver");
      final Procedure1<CodeConcept> _function_2 = (CodeConcept it) -> {
        Pair<String, String> _mappedTo_9 = Pair.<String, String>of("uses", "NUOPC_Driver");
        Pair<String, String> _mappedTo_10 = Pair.<String, String>of("entity", "SetServices");
        Pair<String, String> _mappedTo_11 = Pair.<String, String>of("localName", "@genericSS");
        CodeConcept _addSubconcept = it.addSubconcept("UsesGeneric", FortranMappingTypes.ModuleUseEntityMT, true, 1, 1, 
          Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_9, _mappedTo_10, _mappedTo_11)), true);
        final Procedure1<CodeConcept> _function_3 = (CodeConcept it_1) -> {
          Pair<String, String> _mappedTo_12 = Pair.<String, String>of("genericSS", "driverSS");
          it_1.addAnnotationsWithDefaults(Collections.<String, String>unmodifiableMap(CollectionLiterals.<String, String>newHashMap(_mappedTo_12)));
        };
        ObjectExtensions.<CodeConcept>operator_doubleArrow(_addSubconcept, _function_3);
        it.addSubconcept("SetModelServices", this.SetModelServices, false, 1, 1, true);
      };
      CodeConcept _doubleArrow_2 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_extend, _function_2);
      this.NUOPCDriver = _doubleArrow_2;
      CodeConcept _codeConcept_1 = new CodeConcept("NUOPCDriverRoot", FortranMappingTypes.FortranAstMT);
      final Procedure1<CodeConcept> _function_3 = (CodeConcept it) -> {
        it.addSubconcept("NUOPCDriver", this.NUOPCDriver, true, 1, 1, true);
      };
      CodeConcept _doubleArrow_3 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept_1, _function_3);
      _xblockexpression = this.NUOPCDriverRoot = _doubleArrow_3;
    }
    return _xblockexpression;
  }
  
  public static CharSequence ESMFErrorCheck(final String rcToCheck) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (ESMF_LogFoundError(rcToCheck=");
    _builder.append(rcToCheck, "");
    _builder.append(", msg=ESMF_LOGERR_PASSTHRU, &");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("line=__LINE__, &");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("file=__FILE__)) &");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return  ! bail out");
    _builder.newLine();
    return _builder;
  }
}
