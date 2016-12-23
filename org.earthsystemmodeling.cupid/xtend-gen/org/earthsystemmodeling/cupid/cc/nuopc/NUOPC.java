package org.earthsystemmodeling.cupid.cc.nuopc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.earthsystemmodeling.cupid.cc.BootstrapCodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.earthsystemmodeling.cupid.nuopc.ESMFQuery;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNameNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTModuleStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineNameNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineParNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineStmtNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IModuleBodyConstruct;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class NUOPC {
  private static NUOPC instance;
  
  public CodeConcept NUOPCDriver;
  
  public CodeConcept NUOPCComponent;
  
  public CodeConcept SetServices;
  
  public CodeConcept SpecializationMethod;
  
  public CodeConcept ModuleUses;
  
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
    CodeConcept _codeConcept = new CodeConcept("SpecMethod");
    final Procedure1<CodeConcept> _function = (CodeConcept it) -> {
      final Function2<CodeConcept, CodeConceptInstance, Iterable<?>> _function_1 = (CodeConcept me, CodeConceptInstance context) -> {
        Iterable<ASTSubroutineSubprogramNode> _xblockexpression = null;
        {
          final ASTModuleNode module = context.<ASTModuleNode>getSourceRef();
          _xblockexpression = ESMFQuery.findESMFMethods(module);
        }
        return _xblockexpression;
      };
      it.setFindAll(_function_1);
    };
    CodeConcept _doubleArrow = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept, _function);
    this.SpecializationMethod = _doubleArrow;
    CodeConcept _codeConcept_1 = new CodeConcept("SetServices");
    final Procedure1<CodeConcept> _function_1 = (CodeConcept it) -> {
      final Function2<CodeConcept, CodeConceptInstance, Object> _function_2 = (CodeConcept me, CodeConceptInstance context) -> {
        ASTSubroutineSubprogramNode _xblockexpression = null;
        {
          final ASTModuleNode module = context.<ASTModuleNode>getSourceRef();
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
            boolean _equalsIgnoreCase = _text.equalsIgnoreCase("SetServices");
            if (_equalsIgnoreCase) {
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
          _xblockexpression = IterableExtensions.<ASTSubroutineSubprogramNode>findFirst(_findAll, _function_3);
        }
        return _xblockexpression;
      };
      it.setFind(_function_2);
      final Procedure2<Map<String, Object>, Object> _function_3 = (Map<String, Object> map, Object sourceRef) -> {
        final ASTSubroutineSubprogramNode ssn = ((ASTSubroutineSubprogramNode) sourceRef);
        ASTSubroutineStmtNode _subroutineStmt = ssn.getSubroutineStmt();
        ASTSubroutineNameNode _subroutineName = null;
        if (_subroutineStmt!=null) {
          _subroutineName=_subroutineStmt.getSubroutineName();
        }
        Token _subroutineName_1 = _subroutineName.getSubroutineName();
        String _text = _subroutineName_1.getText();
        map.put("subroutineName", _text);
        ASTSubroutineStmtNode _subroutineStmt_1 = ssn.getSubroutineStmt();
        IASTListNode<ASTSubroutineParNode> _subroutinePars = null;
        if (_subroutineStmt_1!=null) {
          _subroutinePars=_subroutineStmt_1.getSubroutinePars();
        }
        ASTSubroutineParNode _get = null;
        if (_subroutinePars!=null) {
          _get=_subroutinePars.get(0);
        }
        Token _variableName = null;
        if (_get!=null) {
          _variableName=_get.getVariableName();
        }
        String _text_1 = _variableName.getText();
        map.put("paramGridComp", _text_1);
      };
      it.setAnnotate(_function_3);
    };
    CodeConcept _doubleArrow_1 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept_1, _function_1);
    this.SetServices = _doubleArrow_1;
    CodeConcept _codeConcept_2 = new CodeConcept("ModuleUses", Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("moduleName")));
    final Procedure1<CodeConcept> _function_2 = (CodeConcept it) -> {
      final Function2<CodeConcept, CodeConceptInstance, Object> _function_3 = (CodeConcept me, CodeConceptInstance parent) -> {
        ASTUseStmtNode _xblockexpression = null;
        {
          final ASTModuleNode moduleNode = parent.<ASTModuleNode>getSourceRef();
          IASTListNode<IModuleBodyConstruct> _moduleBody = moduleNode.getModuleBody();
          Iterable<ASTUseStmtNode> _filter = null;
          if (_moduleBody!=null) {
            _filter=Iterables.<ASTUseStmtNode>filter(_moduleBody, ASTUseStmtNode.class);
          }
          final Function1<ASTUseStmtNode, Boolean> _function_4 = (ASTUseStmtNode usn) -> {
            Token _name = usn.getName();
            String _text = _name.getText();
            String _parameterValueString = me.getParameterValueString("moduleName");
            return Boolean.valueOf(ASTQuery.eic(_text, _parameterValueString));
          };
          _xblockexpression = IterableExtensions.<ASTUseStmtNode>findFirst(_filter, _function_4);
        }
        return _xblockexpression;
      };
      it.setFind(_function_3);
    };
    CodeConcept _doubleArrow_2 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept_2, _function_2);
    this.ModuleUses = _doubleArrow_2;
    CodeConcept _codeConcept_3 = new CodeConcept("NUOPCComponent", Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("genericImport")));
    final Procedure1<CodeConcept> _function_3 = (CodeConcept it) -> {
      it.setMapsTo(ASTModuleNode.class);
      Pair<String, String> _mappedTo = Pair.<String, String>of("moduleName", "ESMF");
      CodeConcept _modulo = this.ModuleUses.operator_modulo(Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo)));
      it.addSubconcept("Uses ESMF", _modulo);
      Pair<String, String> _mappedTo_1 = Pair.<String, String>of("moduleName", "NUOPC");
      CodeConcept _modulo_1 = this.ModuleUses.operator_modulo(Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_1)));
      it.addSubconcept("Uses NUOPC", _modulo_1);
      it.addSubconcept(this.SetServices);
      final Function2<CodeConcept, CodeConceptInstance, Object> _function_4 = (CodeConcept me, CodeConceptInstance parent) -> {
        Object _xblockexpression = null;
        {
          final ASTModuleNode moduleNode = parent.<ASTModuleNode>getSourceRef();
          IASTListNode<IModuleBodyConstruct> _moduleBody = moduleNode.getModuleBody();
          Iterable<ASTUseStmtNode> _filter = null;
          if (_moduleBody!=null) {
            _filter=Iterables.<ASTUseStmtNode>filter(_moduleBody, ASTUseStmtNode.class);
          }
          boolean _exists = false;
          if (_filter!=null) {
            final Function1<ASTUseStmtNode, Boolean> _function_5 = (ASTUseStmtNode it_1) -> {
              Token _name = it_1.getName();
              String _text = _name.getText();
              String _parameterValueString = me.getParameterValueString("genericImport");
              return Boolean.valueOf(ASTQuery.eic(_text, _parameterValueString));
            };
            _exists=IterableExtensions.<ASTUseStmtNode>exists(_filter, _function_5);
          }
          if (_exists) {
            return moduleNode;
          }
          _xblockexpression = null;
        }
        return _xblockexpression;
      };
      it.setFind(_function_4);
      final Procedure2<Map<String, Object>, Object> _function_5 = (Map<String, Object> map, Object sourceRef) -> {
        final ASTModuleNode moduleNode = ((ASTModuleNode) sourceRef);
        ASTModuleStmtNode _moduleStmt = moduleNode.getModuleStmt();
        ASTModuleNameNode _moduleName = _moduleStmt.getModuleName();
        Token _moduleName_1 = _moduleName.getModuleName();
        String _text = _moduleName_1.getText();
        map.put("name", _text);
      };
      it.setAnnotate(_function_5);
    };
    CodeConcept _doubleArrow_3 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_codeConcept_3, _function_3);
    this.NUOPCComponent = _doubleArrow_3;
    Pair<String, String> _mappedTo = Pair.<String, String>of("genericImport", "NUOPC_Driver");
    CodeConcept _newRefinement = this.NUOPCComponent.newRefinement("NUOPCDriver", 
      Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo)));
    final Procedure1<CodeConcept> _function_4 = (CodeConcept it) -> {
      Pair<String, String> _mappedTo_1 = Pair.<String, String>of("moduleName", "NUOPC_Driver");
      CodeConcept _modulo = this.ModuleUses.operator_modulo(Collections.<String, Object>unmodifiableMap(CollectionLiterals.<String, Object>newHashMap(_mappedTo_1)));
      it.addSubconcept("Uses NUOPC_Driver", _modulo);
    };
    CodeConcept _doubleArrow_4 = ObjectExtensions.<CodeConcept>operator_doubleArrow(_newRefinement, _function_4);
    this.NUOPCDriver = _doubleArrow_4;
    BootstrapCodeConcept _bootstrapCodeConcept = new BootstrapCodeConcept(this.NUOPCDriver);
    this.NUOPCDriverFromFile = _bootstrapCodeConcept;
  }
}
