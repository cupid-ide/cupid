package org.earthsystemmodeling.cupid.nuopc.v7bs59;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Doc;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.ESMFCodeTemplates;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.EntryPointCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCComponent;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.SetServicesCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.SpecializationMethodCodeConcept;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.core.resources.IResource;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Label(label = "NUOPC Mediator")
@MappingType("module")
@Doc(urlfrag = "#mediator-top")
@SuppressWarnings("all")
public class NUOPCMediator extends NUOPCComponent {
  @Label(label = "SetServices")
  @MappingType("subroutine")
  @Doc(urlfrag = "#mediator-setservices")
  public static class SetServices extends SetServicesCodeConcept<NUOPCMediator> {
    public SetServices(final NUOPCMediator parent) {
      super(parent);
    }
  }
  
  @Label(label = "Initialize Phase Definition")
  public static abstract class IPD extends CodeConcept<NUOPCMediator.InitPhases, ASTNode> {
    @Label(label = "IPDv04p1 - Advertise Fields")
    @MappingType("subroutine")
    @Doc(urlfrag = "#mediator-phase-advertisefields")
    public static class IPDv04p1 extends EntryPointCodeConcept<NUOPCMediator.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCMediator.IPD.AdvertiseField> advertiseFields;
      
      public IPDv04p1(final NUOPCMediator.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
        this.subroutineName = "AdvertiseFields";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        parent.setOrAddChild(this);
        ArrayList<NUOPCMediator.IPD.AdvertiseField> _newArrayList = CollectionLiterals.<NUOPCMediator.IPD.AdvertiseField>newArrayList();
        this.advertiseFields = _newArrayList;
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCMediator.IPD _parent = this._parent;
        boolean _matched = false;
        if (!_matched) {
          if (_parent instanceof NUOPCMediator.IPDv00) {
            _matched=true;
            _switchResult = "IPDv00p1";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCMediator.IPDv01) {
            _matched=true;
            _switchResult = "IPDv01p1";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCMediator.IPDv02) {
            _matched=true;
            _switchResult = "IPDv02p1";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCMediator.IPDv03) {
            _matched=true;
            _switchResult = "IPDv03p1";
          }
        }
        if (!_matched) {
          _switchResult = "IPDv04p1";
        }
        return _switchResult;
      }
      
      @Override
      public EntryPointCodeConcept<NUOPCMediator.IPD> reverseChildren() {
        NUOPCMediator.IPD.IPDv04p1 _xblockexpression = null;
        {
          NUOPCMediator.IPD.AdvertiseField _advertiseField = new NUOPCMediator.IPD.AdvertiseField(this);
          List _reverseMultiple = _advertiseField.reverseMultiple();
          this.advertiseFields = _reverseMultiple;
          _xblockexpression = this;
        }
        return _xblockexpression;
      }
      
      @Override
      public CodeConcept<?, ASTModuleNode> module() {
        return this._parent._parent._parent._parent;
      }
      
      @Override
      public SetServicesCodeConcept<?> setServices() {
        return this._parent._parent._parent._parent.setServices;
      }
    }
    
    @Label(label = "IPDv04p2 - Unspecified by NUOPC")
    @MappingType("subroutine-inherited")
    @Doc(urlfrag = "#mediator-initseq")
    public static class IPDv04p2 extends CodeConcept<NUOPCMediator.IPD, ASTNode> {
      public IPDv04p2(final NUOPCMediator.IPD parent) {
        super(parent);
      }
    }
    
    @Label(label = "IPDv04p3 - Realize Fields Providing Geom Object")
    @MappingType("subroutine")
    @Doc(urlfrag = "#mediator-phase-realizefieldsproviding")
    public static class IPDv04p3 extends EntryPointCodeConcept<NUOPCMediator.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCMediator.IPD.RealizeField> realizeFields;
      
      public IPDv04p3(final NUOPCMediator.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
        this.subroutineName = "RealizeFieldsProvidingGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        parent.setOrAddChild(this);
        ArrayList<NUOPCMediator.IPD.RealizeField> _newArrayList = CollectionLiterals.<NUOPCMediator.IPD.RealizeField>newArrayList();
        this.realizeFields = _newArrayList;
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCMediator.IPD _parent = this._parent;
        boolean _matched = false;
        if (!_matched) {
          if (_parent instanceof NUOPCMediator.IPDv00) {
            _matched=true;
            _switchResult = "IPDv00p2";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCMediator.IPDv01) {
            _matched=true;
            _switchResult = "IPDv01p3";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCMediator.IPDv02) {
            _matched=true;
            _switchResult = "IPDv02p3";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCMediator.IPDv03) {
            _matched=true;
            _switchResult = "IPDv03p3";
          }
        }
        if (!_matched) {
          _switchResult = "IPDv04p3";
        }
        return _switchResult;
      }
      
      @Override
      public EntryPointCodeConcept<NUOPCMediator.IPD> reverseChildren() {
        NUOPCMediator.IPD.IPDv04p3 _xblockexpression = null;
        {
          NUOPCMediator.IPD.RealizeField _realizeField = new NUOPCMediator.IPD.RealizeField(this);
          List _reverseMultiple = _realizeField.reverseMultiple();
          this.realizeFields = _reverseMultiple;
          _xblockexpression = this;
        }
        return _xblockexpression;
      }
      
      @Override
      public CodeConcept<?, ASTModuleNode> module() {
        return this._parent._parent._parent._parent;
      }
      
      @Override
      public SetServicesCodeConcept<?> setServices() {
        return this._parent._parent._parent._parent.setServices;
      }
    }
    
    @Label(label = "IPDv04p4 - Modify Decomposition of Accepted Geom Object")
    @MappingType("subroutine")
    @Doc(urlfrag = "#mediator-phase-modifydecomp")
    public static class IPDv04p4 extends EntryPointCodeConcept<NUOPCMediator.IPD> {
      public IPDv04p4(final NUOPCMediator.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
        this.subroutineName = "ModifyDistGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        parent.setOrAddChild(this);
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCMediator.IPD _parent = this._parent;
        boolean _matched = false;
        if (!_matched) {
          if (_parent instanceof NUOPCMediator.IPDv03) {
            _matched=true;
            _switchResult = "IPDv03p4";
          }
        }
        if (!_matched) {
          _switchResult = "IPDv04p4";
        }
        return _switchResult;
      }
      
      @Override
      public EntryPointCodeConcept<NUOPCMediator.IPD> reverseChildren() {
        return this;
      }
      
      @Override
      public CodeConcept<?, ASTModuleNode> module() {
        return this._parent._parent._parent._parent;
      }
      
      @Override
      public SetServicesCodeConcept<?> setServices() {
        return this._parent._parent._parent._parent.setServices;
      }
    }
    
    @Label(label = "IPDv04p5 - Realize Fields Accepting Geom Object")
    @MappingType("subroutine")
    @Doc(urlfrag = "#model-phase-realizefieldsaccepting")
    public static class IPDv04p5 extends EntryPointCodeConcept<NUOPCMediator.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCMediator.IPD.RealizeField> realizeFields;
      
      public IPDv04p5(final NUOPCMediator.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
        this.subroutineName = "RealizeFieldsAcceptingGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        ArrayList<NUOPCMediator.IPD.RealizeField> _newArrayList = CollectionLiterals.<NUOPCMediator.IPD.RealizeField>newArrayList();
        this.realizeFields = _newArrayList;
        parent.setOrAddChild(this);
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCMediator.IPD _parent = this._parent;
        boolean _matched = false;
        if (!_matched) {
          if (_parent instanceof NUOPCMediator.IPDv03) {
            _matched=true;
            _switchResult = "IPDv03p5";
          }
        }
        if (!_matched) {
          _switchResult = "IPDv04p5";
        }
        return _switchResult;
      }
      
      @Override
      public EntryPointCodeConcept<NUOPCMediator.IPD> reverseChildren() {
        NUOPCMediator.IPD.IPDv04p5 _xblockexpression = null;
        {
          NUOPCMediator.IPD.RealizeField _realizeField = new NUOPCMediator.IPD.RealizeField(this);
          List _reverseMultiple = _realizeField.reverseMultiple();
          this.realizeFields = _reverseMultiple;
          _xblockexpression = this;
        }
        return _xblockexpression;
      }
      
      @Override
      public CodeConcept<?, ASTModuleNode> module() {
        return this._parent._parent._parent._parent;
      }
      
      @Override
      public SetServicesCodeConcept<?> setServices() {
        return this._parent._parent._parent._parent.setServices;
      }
    }
    
    @Label(label = "IPDv04p6 - Verify Connected / Set Clock")
    @MappingType("subroutine-inherited")
    @Doc(urlfrag = "#mediator-phase-verifyimports")
    public static class IPDv04p6 extends CodeConcept<NUOPCMediator.IPD, ASTNode> {
      public IPDv04p6(final NUOPCMediator.IPD parent) {
        super(parent);
      }
    }
    
    @Label(label = "IPDv04p7 - Data Initialize")
    @MappingType("subroutine-inherited")
    @Doc(urlfrag = "#mediator-phase-initexport")
    public static class IPDv04p7 extends CodeConcept<NUOPCMediator.IPD, ASTNode> {
      public IPDv04p7(final NUOPCMediator.IPD parent) {
        super(parent);
      }
    }
    
    @Label(label = "Advertise Field")
    @MappingType("call")
    public static class AdvertiseField extends CodeConcept<EntryPointCodeConcept<?>, ASTCallStmtNode> {
      public String state;
      
      public String standardName;
      
      public AdvertiseField(final EntryPointCodeConcept<?> parent) {
        super(parent);
        this.state = this._parent.paramImport;
        this.standardName = "StandardName";
        parent.setOrAddChild(this);
      }
      
      @Override
      public String name() {
        return ((this.state + " / ") + this.standardName);
      }
      
      @Override
      public List reverseMultiple() {
        ArrayList<NUOPCMediator.IPD.AdvertiseField> _xblockexpression = null;
        {
          final ArrayList<NUOPCMediator.IPD.AdvertiseField> retList = CollectionLiterals.<NUOPCMediator.IPD.AdvertiseField>newArrayList();
          ASTSubroutineSubprogramNode _aSTRef = this._parent.getASTRef();
          IASTListNode<IBodyConstruct> _body = _aSTRef.getBody();
          Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
          final Function1<ASTCallStmtNode, Boolean> _function = new Function1<ASTCallStmtNode, Boolean>() {
            @Override
            public Boolean apply(final ASTCallStmtNode c) {
              Token _subroutineName = c.getSubroutineName();
              return Boolean.valueOf(ASTQuery.eic(_subroutineName, "NUOPC_Advertise"));
            }
          };
          Iterable<ASTCallStmtNode> _filter_1 = IterableExtensions.<ASTCallStmtNode>filter(_filter, _function);
          final Procedure1<ASTCallStmtNode> _function_1 = new Procedure1<ASTCallStmtNode>() {
            @Override
            public void apply(final ASTCallStmtNode it) {
              NUOPCMediator.IPD.AdvertiseField advField = new NUOPCMediator.IPD.AdvertiseField(AdvertiseField.this._parent);
              String _litArgExprByIdx = ASTQuery.litArgExprByIdx(it, 0);
              advField.state = _litArgExprByIdx;
              String _litArgExprByIdx_1 = ASTQuery.litArgExprByIdx(it, 1);
              advField.standardName = _litArgExprByIdx_1;
              advField.setASTRef(it);
              retList.add(advField);
            }
          };
          IterableExtensions.<ASTCallStmtNode>forEach(_filter_1, _function_1);
          _xblockexpression = retList;
        }
        return _xblockexpression;
      }
      
      @Override
      public CodeConcept<?, ?> forward() {
        NUOPCMediator.IPD.AdvertiseField _xblockexpression = null;
        {
          StringConcatenation _builder = new StringConcatenation();
          _builder.newLine();
          _builder.append("call NUOPC_Advertise(");
          CharSequence _paramch = this.paramch(this.state);
          _builder.append(_paramch, "");
          _builder.append(", ");
          CharSequence _paramch_1 = this.paramch(this.standardName);
          _builder.append(_paramch_1, "");
          _builder.append(", rc=");
          _builder.append(this._parent.paramRC, "");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
          CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this._parent.paramRC);
          _builder.append(_ESMFErrorCheck, "");
          _builder.newLineIfNotEmpty();
          String code = _builder.toString();
          final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
          final ASTSubroutineSubprogramNode ssn = this._parent.getASTRef();
          IASTListNode<IBodyConstruct> _body = ssn.getBody();
          _body.addAll(stmts);
          IBodyConstruct _get = stmts.get(0);
          this.setASTRef(((ASTCallStmtNode) _get));
          _xblockexpression = this;
        }
        return _xblockexpression;
      }
    }
    
    @Label(label = "Realize Field")
    @MappingType("call")
    public static class RealizeField extends CodeConcept<EntryPointCodeConcept<?>, ASTCallStmtNode> {
      public String state;
      
      public String field;
      
      public RealizeField(final EntryPointCodeConcept<?> parent) {
        super(parent);
        this.state = this._parent.paramImport;
        this.field = "field";
        parent.setOrAddChild(this);
      }
      
      @Override
      public String name() {
        return ((this.state + " / ") + this.field);
      }
      
      @Override
      public List reverseMultiple() {
        ArrayList<NUOPCMediator.IPD.RealizeField> _xblockexpression = null;
        {
          final ArrayList<NUOPCMediator.IPD.RealizeField> retList = CollectionLiterals.<NUOPCMediator.IPD.RealizeField>newArrayList();
          ASTSubroutineSubprogramNode _aSTRef = this._parent.getASTRef();
          IASTListNode<IBodyConstruct> _body = _aSTRef.getBody();
          Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
          final Function1<ASTCallStmtNode, Boolean> _function = new Function1<ASTCallStmtNode, Boolean>() {
            @Override
            public Boolean apply(final ASTCallStmtNode c) {
              Token _subroutineName = c.getSubroutineName();
              return Boolean.valueOf(ASTQuery.eic(_subroutineName, "NUOPC_Realize"));
            }
          };
          Iterable<ASTCallStmtNode> _filter_1 = IterableExtensions.<ASTCallStmtNode>filter(_filter, _function);
          final Procedure1<ASTCallStmtNode> _function_1 = new Procedure1<ASTCallStmtNode>() {
            @Override
            public void apply(final ASTCallStmtNode it) {
              NUOPCMediator.IPD.RealizeField relField = new NUOPCMediator.IPD.RealizeField(RealizeField.this._parent);
              String _litArgExprByIdx = ASTQuery.litArgExprByIdx(it, 0);
              relField.state = _litArgExprByIdx;
              String _litArgExprByIdx_1 = ASTQuery.litArgExprByIdx(it, 1);
              relField.field = _litArgExprByIdx_1;
              relField.setASTRef(it);
              retList.add(relField);
            }
          };
          IterableExtensions.<ASTCallStmtNode>forEach(_filter_1, _function_1);
          _xblockexpression = retList;
        }
        return _xblockexpression;
      }
      
      @Override
      public CodeConcept<?, ?> forward() {
        try {
          CodeConcept<?, ?> _xblockexpression = null;
          {
            final ASTSubroutineSubprogramNode ssn = this._parent.getASTRef();
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("type(ESMF_Field) :: ");
            _builder.append(this.field, "");
            CodeConcept.addTypeDeclaration(_builder.toString(), ssn, true);
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("\t");
            _builder_1.newLine();
            _builder_1.append("call NUOPC_Realize(");
            CharSequence _paramch = this.paramch(this.state);
            _builder_1.append(_paramch, "");
            _builder_1.append(", field=");
            CharSequence _paramch_1 = this.paramch(this.field);
            _builder_1.append(_paramch_1, "");
            _builder_1.append(", rc=");
            _builder_1.append(this._parent.paramRC, "");
            _builder_1.append(")");
            _builder_1.newLineIfNotEmpty();
            CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this._parent.paramRC);
            _builder_1.append(_ESMFErrorCheck, "");
            _builder_1.newLineIfNotEmpty();
            String code = _builder_1.toString();
            final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
            IASTListNode<IBodyConstruct> _body = ssn.getBody();
            _body.addAll(stmts);
            _xblockexpression = super.<CodeConcept<?, ?>>forward();
          }
          return _xblockexpression;
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      }
    }
    
    public IPD(final NUOPCMediator.InitPhases parent) {
      super(parent);
    }
  }
  
  @Label(label = "Initialize Phase Definition (v00)")
  @Doc(urlfrag = "#mediator-initseq")
  public static class IPDv00 extends NUOPCMediator.IPD {
    @Child(min = 1)
    @Label(label = "IPDv00p1 - Advertise Fields")
    public NUOPCMediator.IPD.IPDv04p1 ipdv00p1;
    
    @Child(min = 1)
    @Label(label = "IPDv00p2 - Realize Fields")
    public NUOPCMediator.IPD.IPDv04p3 ipdv00p2;
    
    @Child
    @Label(label = "IPDv00p3 - Verify All Connected & Set Clock")
    public NUOPCMediator.IPD.IPDv04p6 ipdv00p3;
    
    @Child
    @Label(label = "IPDv00p4 - Initialize Fields")
    public NUOPCMediator.IPD.IPDv04p7 ipdv00p4;
    
    public IPDv00(final NUOPCMediator.InitPhases parent) {
      super(parent);
    }
    
    @Override
    public NUOPCMediator.IPDv00 reverse() {
      try {
        NUOPCMediator.IPDv00 _xblockexpression = null;
        {
          NUOPCMediator.IPD.IPDv04p1 _iPDv04p1 = new NUOPCMediator.IPD.IPDv04p1(this);
          CodeConcept<?, ?> _reverse = _iPDv04p1.reverse();
          this.ipdv00p1 = ((NUOPCMediator.IPD.IPDv04p1) _reverse);
          NUOPCMediator.IPD.IPDv04p3 _iPDv04p3 = new NUOPCMediator.IPD.IPDv04p3(this);
          CodeConcept<?, ?> _reverse_1 = _iPDv04p3.reverse();
          this.ipdv00p2 = ((NUOPCMediator.IPD.IPDv04p3) _reverse_1);
          NUOPCMediator.IPD.IPDv04p6 _iPDv04p6 = new NUOPCMediator.IPD.IPDv04p6(this);
          CodeConcept<?, ?> _reverse_2 = _iPDv04p6.<CodeConcept<?, ?>>reverse();
          this.ipdv00p3 = ((NUOPCMediator.IPD.IPDv04p6) _reverse_2);
          NUOPCMediator.IPD.IPDv04p7 _iPDv04p7 = new NUOPCMediator.IPD.IPDv04p7(this);
          CodeConcept<?, ?> _reverse_3 = _iPDv04p7.<CodeConcept<?, ?>>reverse();
          this.ipdv00p4 = ((NUOPCMediator.IPD.IPDv04p7) _reverse_3);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "Initialize Phase Definition (v01)")
  @Doc(urlfrag = "#mediator-initseq")
  public static class IPDv01 extends NUOPCMediator.IPD {
    @Child(min = 1)
    @Label(label = "IPDv01p1 - Advertise Fields")
    public NUOPCMediator.IPD.IPDv04p1 ipdv01p1;
    
    @Child
    @Label(label = "IPDv01p2 - (unspecified by NUOPC)")
    public NUOPCMediator.IPD.IPDv04p2 ipdv01p2;
    
    @Child(min = 1)
    @Label(label = "IPDv01p3 - Realize Fields")
    public NUOPCMediator.IPD.IPDv04p3 ipdv01p3;
    
    @Child
    @Label(label = "IPDv01p4 - Verify All Connected & Set Clock")
    public NUOPCMediator.IPD.IPDv04p6 ipdv01p4;
    
    @Child
    @Label(label = "IPDv01p5 - Initialize Fields")
    public NUOPCMediator.IPD.IPDv04p7 ipdv01p5;
    
    public IPDv01(final NUOPCMediator.InitPhases parent) {
      super(parent);
    }
    
    @Override
    public NUOPCMediator.IPDv01 reverse() {
      try {
        NUOPCMediator.IPDv01 _xblockexpression = null;
        {
          NUOPCMediator.IPD.IPDv04p1 _iPDv04p1 = new NUOPCMediator.IPD.IPDv04p1(this);
          CodeConcept<?, ?> _reverse = _iPDv04p1.reverse();
          this.ipdv01p1 = ((NUOPCMediator.IPD.IPDv04p1) _reverse);
          NUOPCMediator.IPD.IPDv04p2 _iPDv04p2 = new NUOPCMediator.IPD.IPDv04p2(this);
          CodeConcept<?, ?> _reverse_1 = _iPDv04p2.<CodeConcept<?, ?>>reverse();
          this.ipdv01p2 = ((NUOPCMediator.IPD.IPDv04p2) _reverse_1);
          NUOPCMediator.IPD.IPDv04p3 _iPDv04p3 = new NUOPCMediator.IPD.IPDv04p3(this);
          CodeConcept<?, ?> _reverse_2 = _iPDv04p3.reverse();
          this.ipdv01p3 = ((NUOPCMediator.IPD.IPDv04p3) _reverse_2);
          NUOPCMediator.IPD.IPDv04p6 _iPDv04p6 = new NUOPCMediator.IPD.IPDv04p6(this);
          CodeConcept<?, ?> _reverse_3 = _iPDv04p6.<CodeConcept<?, ?>>reverse();
          this.ipdv01p4 = ((NUOPCMediator.IPD.IPDv04p6) _reverse_3);
          NUOPCMediator.IPD.IPDv04p7 _iPDv04p7 = new NUOPCMediator.IPD.IPDv04p7(this);
          CodeConcept<?, ?> _reverse_4 = _iPDv04p7.<CodeConcept<?, ?>>reverse();
          this.ipdv01p5 = ((NUOPCMediator.IPD.IPDv04p7) _reverse_4);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "Initialize Phase Definition (v02)")
  @Doc(urlfrag = "#mediator-initseq")
  public static class IPDv02 extends NUOPCMediator.IPD {
    public IPDv02(final NUOPCMediator.InitPhases parent) {
      super(parent);
    }
    
    @Child(min = 1)
    @Label(label = "IPDv02p1 - Advertise Fields")
    public NUOPCMediator.IPD.IPDv04p1 ipdv02p1;
    
    @Child
    @Label(label = "IPDv02p2 - Unspecified by NUOPC")
    public NUOPCMediator.IPD.IPDv04p2 ipdv02p2;
    
    @Child(min = 1)
    @Label(label = "IPDv02p3 - Realize Fields Providing Geom Object")
    public NUOPCMediator.IPD.IPDv04p3 ipdv02p3;
    
    @Child
    @Label(label = "IPDv02p4 - Verify Connected / Set Clock")
    public NUOPCMediator.IPD.IPDv04p6 ipdv02p4;
    
    @Child
    @Label(label = "IPDv02p5 - Data Initialize")
    public NUOPCMediator.IPD.IPDv04p7 ipdv02p5;
    
    @Override
    public NUOPCMediator.IPDv02 reverse() {
      try {
        NUOPCMediator.IPDv02 _xblockexpression = null;
        {
          NUOPCMediator.IPD.IPDv04p1 _iPDv04p1 = new NUOPCMediator.IPD.IPDv04p1(this);
          CodeConcept<?, ?> _reverse = _iPDv04p1.reverse();
          this.ipdv02p1 = ((NUOPCMediator.IPD.IPDv04p1) _reverse);
          NUOPCMediator.IPD.IPDv04p2 _iPDv04p2 = new NUOPCMediator.IPD.IPDv04p2(this);
          CodeConcept<?, ?> _reverse_1 = _iPDv04p2.<CodeConcept<?, ?>>reverse();
          this.ipdv02p2 = ((NUOPCMediator.IPD.IPDv04p2) _reverse_1);
          NUOPCMediator.IPD.IPDv04p3 _iPDv04p3 = new NUOPCMediator.IPD.IPDv04p3(this);
          CodeConcept<?, ?> _reverse_2 = _iPDv04p3.reverse();
          this.ipdv02p3 = ((NUOPCMediator.IPD.IPDv04p3) _reverse_2);
          NUOPCMediator.IPD.IPDv04p6 _iPDv04p6 = new NUOPCMediator.IPD.IPDv04p6(this);
          CodeConcept<?, ?> _reverse_3 = _iPDv04p6.<CodeConcept<?, ?>>reverse();
          this.ipdv02p4 = ((NUOPCMediator.IPD.IPDv04p6) _reverse_3);
          NUOPCMediator.IPD.IPDv04p7 _iPDv04p7 = new NUOPCMediator.IPD.IPDv04p7(this);
          CodeConcept<?, ?> _reverse_4 = _iPDv04p7.<CodeConcept<?, ?>>reverse();
          this.ipdv02p5 = ((NUOPCMediator.IPD.IPDv04p7) _reverse_4);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "Initialize Phase Definition (v03)")
  @Doc(urlfrag = "#mediator-initseq")
  public static class IPDv03 extends NUOPCMediator.IPD {
    public IPDv03(final NUOPCMediator.InitPhases parent) {
      super(parent);
    }
    
    @Child(min = 1)
    @Label(label = "IPDv03p1 - Advertise Fields")
    public NUOPCMediator.IPD.IPDv04p1 ipdv03p1;
    
    @Child
    @Label(label = "IPDv03p2 - Unspecified by NUOPC")
    public NUOPCMediator.IPD.IPDv04p2 ipdv03p2;
    
    @Child(min = 1)
    @Label(label = "IPDv03p3 - Realize Fields Providing Geom Object")
    public NUOPCMediator.IPD.IPDv04p3 ipdv03p3;
    
    @Child(min = 0)
    @Label(label = "IPDv03p4 - Modify Decomposition of Accepted Geom Object")
    public NUOPCMediator.IPD.IPDv04p4 ipdv03p4;
    
    @Child(min = 1)
    @Label(label = "IPDv03p5 - Realize Fields Accepting Geom Object")
    public NUOPCMediator.IPD.IPDv04p5 ipdv03p5;
    
    @Child
    @Label(label = "IPDv03p6 - Verify Connected / Set Clock")
    public NUOPCMediator.IPD.IPDv04p6 ipdv03p6;
    
    @Child
    @Label(label = "IPDv03p7 - Data Initialize")
    public NUOPCMediator.IPD.IPDv04p7 ipdv03p7;
    
    @Override
    public NUOPCMediator.IPDv03 reverse() {
      try {
        NUOPCMediator.IPDv03 _xblockexpression = null;
        {
          NUOPCMediator.IPD.IPDv04p1 _iPDv04p1 = new NUOPCMediator.IPD.IPDv04p1(this);
          CodeConcept<?, ?> _reverse = _iPDv04p1.reverse();
          this.ipdv03p1 = ((NUOPCMediator.IPD.IPDv04p1) _reverse);
          NUOPCMediator.IPD.IPDv04p2 _iPDv04p2 = new NUOPCMediator.IPD.IPDv04p2(this);
          CodeConcept<?, ?> _reverse_1 = _iPDv04p2.<CodeConcept<?, ?>>reverse();
          this.ipdv03p2 = ((NUOPCMediator.IPD.IPDv04p2) _reverse_1);
          NUOPCMediator.IPD.IPDv04p3 _iPDv04p3 = new NUOPCMediator.IPD.IPDv04p3(this);
          CodeConcept<?, ?> _reverse_2 = _iPDv04p3.reverse();
          this.ipdv03p3 = ((NUOPCMediator.IPD.IPDv04p3) _reverse_2);
          NUOPCMediator.IPD.IPDv04p4 _iPDv04p4 = new NUOPCMediator.IPD.IPDv04p4(this);
          CodeConcept<?, ?> _reverse_3 = _iPDv04p4.reverse();
          this.ipdv03p4 = ((NUOPCMediator.IPD.IPDv04p4) _reverse_3);
          NUOPCMediator.IPD.IPDv04p5 _iPDv04p5 = new NUOPCMediator.IPD.IPDv04p5(this);
          CodeConcept<?, ?> _reverse_4 = _iPDv04p5.reverse();
          this.ipdv03p5 = ((NUOPCMediator.IPD.IPDv04p5) _reverse_4);
          NUOPCMediator.IPD.IPDv04p6 _iPDv04p6 = new NUOPCMediator.IPD.IPDv04p6(this);
          CodeConcept<?, ?> _reverse_5 = _iPDv04p6.<CodeConcept<?, ?>>reverse();
          this.ipdv03p6 = ((NUOPCMediator.IPD.IPDv04p6) _reverse_5);
          NUOPCMediator.IPD.IPDv04p7 _iPDv04p7 = new NUOPCMediator.IPD.IPDv04p7(this);
          CodeConcept<?, ?> _reverse_6 = _iPDv04p7.<CodeConcept<?, ?>>reverse();
          this.ipdv03p7 = ((NUOPCMediator.IPD.IPDv04p7) _reverse_6);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    @Override
    public boolean validate(final List<String> errors) {
      boolean _and = false;
      boolean _and_1 = false;
      boolean _notEquals = (!Objects.equal(this.ipdv03p1, null));
      if (!_notEquals) {
        _and_1 = false;
      } else {
        boolean _validate = this.ipdv03p1.validate(errors);
        _and_1 = _validate;
      }
      if (!_and_1) {
        _and = false;
      } else {
        boolean _or = false;
        boolean _and_2 = false;
        boolean _notEquals_1 = (!Objects.equal(this.ipdv03p3, null));
        if (!_notEquals_1) {
          _and_2 = false;
        } else {
          boolean _validate_1 = this.ipdv03p3.validate(errors);
          _and_2 = _validate_1;
        }
        if (_and_2) {
          _or = true;
        } else {
          boolean _and_3 = false;
          boolean _notEquals_2 = (!Objects.equal(this.ipdv03p5, null));
          if (!_notEquals_2) {
            _and_3 = false;
          } else {
            boolean _validate_2 = this.ipdv03p5.validate(errors);
            _and_3 = _validate_2;
          }
          _or = _and_3;
        }
        _and = _or;
      }
      return _and;
    }
  }
  
  @Label(label = "Initialize Phase Definition (v04)")
  @Doc(urlfrag = "#mediator-initseq")
  public static class IPDv04 extends NUOPCMediator.IPD {
    public IPDv04(final NUOPCMediator.InitPhases parent) {
      super(parent);
    }
    
    @Child(min = 1)
    public NUOPCMediator.IPD.IPDv04p1 ipdv04p1;
    
    @Child
    public NUOPCMediator.IPD.IPDv04p2 ipdv04p2;
    
    @Child(min = 1)
    public NUOPCMediator.IPD.IPDv04p3 ipdv04p3;
    
    @Child(min = 0)
    public NUOPCMediator.IPD.IPDv04p4 ipdv04p4;
    
    @Child(min = 1)
    public NUOPCMediator.IPD.IPDv04p5 ipdv04p5;
    
    @Child
    public NUOPCMediator.IPD.IPDv04p6 ipdv04p6;
    
    @Child
    public NUOPCMediator.IPD.IPDv04p7 ipdv04p7;
    
    @Override
    public NUOPCMediator.IPDv04 reverse() {
      try {
        NUOPCMediator.IPDv04 _xblockexpression = null;
        {
          NUOPCMediator.IPD.IPDv04p1 _iPDv04p1 = new NUOPCMediator.IPD.IPDv04p1(this);
          CodeConcept<?, ?> _reverse = _iPDv04p1.reverse();
          this.ipdv04p1 = ((NUOPCMediator.IPD.IPDv04p1) _reverse);
          NUOPCMediator.IPD.IPDv04p2 _iPDv04p2 = new NUOPCMediator.IPD.IPDv04p2(this);
          CodeConcept<?, ?> _reverse_1 = _iPDv04p2.<CodeConcept<?, ?>>reverse();
          this.ipdv04p2 = ((NUOPCMediator.IPD.IPDv04p2) _reverse_1);
          NUOPCMediator.IPD.IPDv04p3 _iPDv04p3 = new NUOPCMediator.IPD.IPDv04p3(this);
          CodeConcept<?, ?> _reverse_2 = _iPDv04p3.reverse();
          this.ipdv04p3 = ((NUOPCMediator.IPD.IPDv04p3) _reverse_2);
          NUOPCMediator.IPD.IPDv04p4 _iPDv04p4 = new NUOPCMediator.IPD.IPDv04p4(this);
          CodeConcept<?, ?> _reverse_3 = _iPDv04p4.reverse();
          this.ipdv04p4 = ((NUOPCMediator.IPD.IPDv04p4) _reverse_3);
          NUOPCMediator.IPD.IPDv04p5 _iPDv04p5 = new NUOPCMediator.IPD.IPDv04p5(this);
          CodeConcept<?, ?> _reverse_4 = _iPDv04p5.reverse();
          this.ipdv04p5 = ((NUOPCMediator.IPD.IPDv04p5) _reverse_4);
          NUOPCMediator.IPD.IPDv04p6 _iPDv04p6 = new NUOPCMediator.IPD.IPDv04p6(this);
          CodeConcept<?, ?> _reverse_5 = _iPDv04p6.<CodeConcept<?, ?>>reverse();
          this.ipdv04p6 = ((NUOPCMediator.IPD.IPDv04p6) _reverse_5);
          NUOPCMediator.IPD.IPDv04p7 _iPDv04p7 = new NUOPCMediator.IPD.IPDv04p7(this);
          CodeConcept<?, ?> _reverse_6 = _iPDv04p7.<CodeConcept<?, ?>>reverse();
          this.ipdv04p7 = ((NUOPCMediator.IPD.IPDv04p7) _reverse_6);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    @Override
    public boolean validate(final List<String> errors) {
      boolean _and = false;
      boolean _and_1 = false;
      boolean _notEquals = (!Objects.equal(this.ipdv04p1, null));
      if (!_notEquals) {
        _and_1 = false;
      } else {
        boolean _validate = this.ipdv04p1.validate(errors);
        _and_1 = _validate;
      }
      if (!_and_1) {
        _and = false;
      } else {
        boolean _or = false;
        boolean _and_2 = false;
        boolean _notEquals_1 = (!Objects.equal(this.ipdv04p3, null));
        if (!_notEquals_1) {
          _and_2 = false;
        } else {
          boolean _validate_1 = this.ipdv04p3.validate(errors);
          _and_2 = _validate_1;
        }
        if (_and_2) {
          _or = true;
        } else {
          boolean _and_3 = false;
          boolean _notEquals_2 = (!Objects.equal(this.ipdv04p5, null));
          if (!_notEquals_2) {
            _and_3 = false;
          } else {
            boolean _validate_2 = this.ipdv04p5.validate(errors);
            _and_3 = _validate_2;
          }
          _or = _and_3;
        }
        _and = _or;
      }
      return _and;
    }
  }
  
  @Label(label = "Phases")
  public static class InitPhases extends CodeConcept<NUOPCMediator.Initialization, ASTNode> {
    @Child
    public NUOPCMediator.IPDv00 ipdv00;
    
    @Child
    public NUOPCMediator.IPDv01 ipdv01;
    
    @Child
    public NUOPCMediator.IPDv02 ipdv02;
    
    @Child
    public NUOPCMediator.IPDv03 ipdv03;
    
    @Child
    public NUOPCMediator.IPDv04 ipdv04;
    
    public InitPhases(final NUOPCMediator.Initialization parent) {
      super(parent);
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      NUOPCMediator.InitPhases _xblockexpression = null;
      {
        NUOPCMediator.IPDv00 _iPDv00 = new NUOPCMediator.IPDv00(this);
        NUOPCMediator.IPDv00 _reverse = _iPDv00.reverse();
        this.ipdv00 = _reverse;
        NUOPCMediator.IPDv01 _iPDv01 = new NUOPCMediator.IPDv01(this);
        NUOPCMediator.IPDv01 _reverse_1 = _iPDv01.reverse();
        this.ipdv01 = _reverse_1;
        NUOPCMediator.IPDv02 _iPDv02 = new NUOPCMediator.IPDv02(this);
        NUOPCMediator.IPDv02 _reverse_2 = _iPDv02.reverse();
        this.ipdv02 = _reverse_2;
        NUOPCMediator.IPDv03 _iPDv03 = new NUOPCMediator.IPDv03(this);
        NUOPCMediator.IPDv03 _reverse_3 = _iPDv03.reverse();
        this.ipdv03 = _reverse_3;
        NUOPCMediator.IPDv04 _iPDv04 = new NUOPCMediator.IPDv04(this);
        NUOPCMediator.IPDv04 _reverse_4 = _iPDv04.reverse();
        this.ipdv04 = _reverse_4;
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    @Override
    public boolean validate(final List<String> errors) {
      boolean _or = false;
      boolean _or_1 = false;
      boolean _or_2 = false;
      boolean _or_3 = false;
      boolean _validate = this.ipdv00.validate(errors);
      if (_validate) {
        _or_3 = true;
      } else {
        boolean _validate_1 = this.ipdv01.validate(errors);
        _or_3 = _validate_1;
      }
      if (_or_3) {
        _or_2 = true;
      } else {
        boolean _validate_2 = this.ipdv02.validate(errors);
        _or_2 = _validate_2;
      }
      if (_or_2) {
        _or_1 = true;
      } else {
        boolean _validate_3 = this.ipdv03.validate(errors);
        _or_1 = _validate_3;
      }
      if (_or_1) {
        _or = true;
      } else {
        boolean _validate_4 = this.ipdv04.validate(errors);
        _or = _validate_4;
      }
      return _or;
    }
  }
  
  @Label(label = "Initialize")
  public static class Initialization extends CodeConcept<NUOPCMediator, ASTNode> {
    @Child
    public NUOPCMediator.InitPhases initPhases;
    
    @Child
    public NUOPCMediator.InitSpecializations initSpecs;
    
    public Initialization(final NUOPCMediator parent) {
      super(parent);
    }
    
    @Override
    public NUOPCMediator.Initialization reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCMediator.Initialization reverseChildren() {
      NUOPCMediator.Initialization _xblockexpression = null;
      {
        NUOPCMediator.InitPhases _initPhases = new NUOPCMediator.InitPhases(this);
        CodeConcept<?, ?> _reverse = _initPhases.reverse();
        this.initPhases = ((NUOPCMediator.InitPhases) _reverse);
        NUOPCMediator.InitSpecializations _initSpecializations = new NUOPCMediator.InitSpecializations(this);
        CodeConcept<?, ?> _reverse_1 = _initSpecializations.reverse();
        this.initSpecs = ((NUOPCMediator.InitSpecializations) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Specializations")
  public static class InitSpecializations extends CodeConcept<NUOPCMediator.Initialization, ASTNode> {
    @Child(min = 0)
    public NUOPCMediator.DataInitialize dataInitialize;
    
    public InitSpecializations(final NUOPCMediator.Initialization parent) {
      super(parent);
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      NUOPCMediator.InitSpecializations _xblockexpression = null;
      {
        NUOPCMediator.DataInitialize _dataInitialize = new NUOPCMediator.DataInitialize(this);
        CodeConcept<?, ?> _reverse = _dataInitialize.reverse();
        this.dataInitialize = ((NUOPCMediator.DataInitialize) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "DataInitialize")
  @MappingType("subroutine")
  @Doc(urlfrag = "#mediator-specialization-datainitialize")
  public static class DataInitialize extends SpecializationMethodCodeConcept<NUOPCMediator.InitSpecializations> {
    public DataInitialize(final NUOPCMediator.InitSpecializations parent) {
      super(parent, "NUOPC_Mediator", "label_DataInitialize");
      this.subroutineName = "DataInitialize";
      this.specLabel = "mediator_label_DataInitialize";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName, "");
      _builder.append("(");
      _builder.append(this.paramGridComp, "");
      _builder.append(", ");
      _builder.append(this.paramRC, "");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("type(ESMF_GridComp)  :: ");
      _builder.append(this.paramGridComp, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("integer, intent(out) :: ");
      _builder.append(this.paramRC, "    ");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rc = ESMF_SUCCESS");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! initialize export fields");
      _builder.newLine();
      _builder.newLine();
      _builder.append("end subroutine");
      _builder.newLine();
      return _builder.toString();
    }
    
    @Override
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent._parent;
    }
    
    @Override
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent._parent.setServices;
    }
    
    @Override
    public NUOPCComponent.GenericImport genericUse() {
      return this._parent._parent._parent.importNUOPCGeneric;
    }
  }
  
  @Label(label = "Run")
  public static class Run extends CodeConcept<NUOPCMediator, ASTNode> {
    @Child
    public NUOPCMediator.RunPhases runPhases;
    
    @Child
    public NUOPCMediator.RunSpecializations runSpecs;
    
    public Run(final NUOPCMediator parent) {
      super(parent);
    }
    
    @Override
    public NUOPCMediator.Run reverse() {
      NUOPCMediator.Run _xblockexpression = null;
      {
        NUOPCMediator.RunPhases _runPhases = new NUOPCMediator.RunPhases(this);
        NUOPCMediator.RunPhases _reverse = _runPhases.reverse();
        this.runPhases = ((NUOPCMediator.RunPhases) _reverse);
        NUOPCMediator.RunSpecializations _runSpecializations = new NUOPCMediator.RunSpecializations(this);
        CodeConcept<?, ?> _reverse_1 = _runSpecializations.reverse();
        this.runSpecs = ((NUOPCMediator.RunSpecializations) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Specializations")
  public static class RunSpecializations extends CodeConcept<NUOPCMediator.Run, ASTNode> {
    @Child(min = 0, max = (-1))
    public List<NUOPCMediator.SetRunClock> setRunClock;
    
    @Child(min = 0, max = (-1))
    public List<NUOPCMediator.CheckImport> checkImport;
    
    @Child(min = 1, max = (-1))
    public List<NUOPCMediator.MediatorAdvance> mediatorAdvance;
    
    @Child(min = 0, max = (-1))
    public List<NUOPCMediator.TimestampExport> timestampExport;
    
    public RunSpecializations(final NUOPCMediator.Run parent) {
      super(parent);
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCMediator.RunSpecializations reverseChildren() {
      NUOPCMediator.RunSpecializations _xblockexpression = null;
      {
        NUOPCMediator.MediatorAdvance _mediatorAdvance = new NUOPCMediator.MediatorAdvance(this);
        List _reverseMultiple = _mediatorAdvance.reverseMultiple();
        this.mediatorAdvance = _reverseMultiple;
        NUOPCMediator.SetRunClock _setRunClock = new NUOPCMediator.SetRunClock(this);
        List _reverseMultiple_1 = _setRunClock.reverseMultiple();
        this.setRunClock = _reverseMultiple_1;
        NUOPCMediator.CheckImport _checkImport = new NUOPCMediator.CheckImport(this);
        List _reverseMultiple_2 = _checkImport.reverseMultiple();
        this.checkImport = _reverseMultiple_2;
        NUOPCMediator.TimestampExport _timestampExport = new NUOPCMediator.TimestampExport(this);
        List _reverseMultiple_3 = _timestampExport.reverseMultiple();
        this.timestampExport = _reverseMultiple_3;
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Phases")
  public static class RunPhases extends CodeConcept<NUOPCMediator.Run, ASTNode> {
    @Child
    public NUOPCMediator.RunPhase1 p1;
    
    public RunPhases(final NUOPCMediator.Run parent) {
      super(parent);
    }
    
    @Override
    public NUOPCMediator.RunPhases reverse() {
      try {
        NUOPCMediator.RunPhases _xblockexpression = null;
        {
          NUOPCMediator.RunPhase1 _runPhase1 = new NUOPCMediator.RunPhase1(this);
          CodeConcept<?, ?> _reverse = _runPhase1.<CodeConcept<?, ?>>reverse();
          this.p1 = ((NUOPCMediator.RunPhase1) _reverse);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "Run Phase 1")
  @MappingType("subroutine-inherited")
  @Doc(urlfrag = "#mediator-phase-run")
  public static class RunPhase1 extends CodeConcept<NUOPCMediator.RunPhases, ASTNode> {
    public RunPhase1(final NUOPCMediator.RunPhases parent) {
      super(parent);
    }
  }
  
  @Label(label = "Advance")
  @MappingType("subroutine")
  @Doc(urlfrag = "#mediator-specialization-advance")
  public static class MediatorAdvance extends SpecializationMethodCodeConcept<NUOPCMediator.RunSpecializations> {
    public MediatorAdvance(final NUOPCMediator.RunSpecializations parent) {
      super(parent, "NUOPC_Mediator", "label_Advance");
      this.subroutineName = "MediatorAdvance";
      List<NUOPCMediator.MediatorAdvance> _mediatorAdvance = parent.mediatorAdvance;
      int _size = 0;
      if (_mediatorAdvance!=null) {
        _size=_mediatorAdvance.size();
      }
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        String _subroutineName = this.subroutineName;
        int _size_1 = parent.mediatorAdvance.size();
        int _plus = (_size_1 + 1);
        this.subroutineName = (_subroutineName + Integer.valueOf(_plus));
      }
      this.specLabel = "mediator_label_Advance";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName, "");
      _builder.append("(");
      _builder.append(this.paramGridComp, "");
      _builder.append(", ");
      _builder.append(this.paramRC, "");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("type(ESMF_GridComp)  :: ");
      _builder.append(this.paramGridComp, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("integer, intent(out) :: ");
      _builder.append(this.paramRC, "    ");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("     ");
      _builder.append("! local variables");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("type(ESMF_Clock)              :: clock");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("type(ESMF_State)              :: importState, exportState");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("type(ESMF_Time)               :: currTime");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("type(ESMF_TimeInterval)       :: timeStep");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rc = ESMF_SUCCESS");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! query the Component for its clock, importState and exportState");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call ESMF_GridCompGet(");
      _builder.append(this.paramGridComp, "    ");
      _builder.append(", clock=clock, importState=importState, &");
      _builder.newLineIfNotEmpty();
      _builder.append("        ");
      _builder.append("exportState=exportState, rc=");
      _builder.append(this.paramRC, "        ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=");
      _builder.append(this.paramRC, "    ");
      _builder.append(", msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLineIfNotEmpty();
      _builder.append("        ");
      _builder.append("line=__LINE__, &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("file=__FILE__)) &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("return  ! bail out");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! advance the mediator: currTime -> currTime + timeStep");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call ESMF_ClockPrint(clock, options=\"currTime\", &");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("preString=\"------>Advancing ");
      _builder.append(this._parent._parent._parent.name, "      ");
      _builder.append(" from: \", rc=");
      _builder.append(this.paramRC, "      ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=");
      _builder.append(this.paramRC, "    ");
      _builder.append(", msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLineIfNotEmpty();
      _builder.append("        ");
      _builder.append("line=__LINE__, &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("file=__FILE__)) &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("return  ! bail out");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call ESMF_ClockPrint(clock, options=\"stopTime\", &");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("preString=\"--------------------------------> to: \", rc=");
      _builder.append(this.paramRC, "      ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=");
      _builder.append(this.paramRC, "    ");
      _builder.append(", msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLineIfNotEmpty();
      _builder.append("        ");
      _builder.append("line=__LINE__, &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("file=__FILE__)) &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("return  ! bail out");
      _builder.newLine();
      _builder.newLine();
      _builder.append("end subroutine");
      _builder.newLine();
      return _builder.toString();
    }
    
    @Override
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent._parent;
    }
    
    @Override
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent._parent.setServices;
    }
    
    @Override
    public NUOPCComponent.GenericImport genericUse() {
      return this._parent._parent._parent.importNUOPCGeneric;
    }
  }
  
  @Label(label = "SetRunClock")
  @MappingType("subroutine")
  @Doc(urlfrag = "#mediator-specialization-setrunclock")
  public static class SetRunClock extends SpecializationMethodCodeConcept<NUOPCMediator.RunSpecializations> {
    public SetRunClock(final NUOPCMediator.RunSpecializations parent) {
      super(parent, "NUOPC_Mediator", "label_SetRunClock");
      this.subroutineName = "SetRunClock";
      List<NUOPCMediator.SetRunClock> _setRunClock = parent.setRunClock;
      int _size = 0;
      if (_setRunClock!=null) {
        _size=_setRunClock.size();
      }
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        String _subroutineName = this.subroutineName;
        int _size_1 = parent.setRunClock.size();
        int _plus = (_size_1 + 1);
        this.subroutineName = (_subroutineName + Integer.valueOf(_plus));
      }
      this.specLabel = "mediator_label_SetRunClock";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName, "");
      _builder.append("(");
      _builder.append(this.paramGridComp, "");
      _builder.append(", ");
      _builder.append(this.paramRC, "");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("type(ESMF_GridComp)  :: ");
      _builder.append(this.paramGridComp, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("integer, intent(out) :: ");
      _builder.append(this.paramRC, "    ");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! local variables");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("type(ESMF_Clock)              :: clock");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rc = ESMF_SUCCESS");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! query the component for its clock");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call ESMF_GridCompGet(gcomp, clock=clock, rc=");
      _builder.append(this.paramRC, "    ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=");
      _builder.append(this.paramRC, "    ");
      _builder.append(", msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLineIfNotEmpty();
      _builder.append("      ");
      _builder.append("line=__LINE__, &");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("file=__FILE__)) &");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("return  ! bail out");
      _builder.newLine();
      _builder.append("      ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! set the component\'s clock ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call NUOPC_CompSetClock(gcomp, externalClock=clock, rc=");
      _builder.append(this.paramRC, "    ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=");
      _builder.append(this.paramRC, "    ");
      _builder.append(", msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLineIfNotEmpty();
      _builder.append("      ");
      _builder.append("line=__LINE__, &");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("file=__FILE__)) &");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("return  ! bail out");
      _builder.newLine();
      _builder.newLine();
      _builder.append("end subroutine");
      _builder.newLine();
      return _builder.toString();
    }
    
    @Override
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent._parent;
    }
    
    @Override
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent._parent.setServices;
    }
    
    @Override
    public NUOPCComponent.GenericImport genericUse() {
      return this._parent._parent._parent.importNUOPCGeneric;
    }
  }
  
  @Label(label = "CheckImport")
  @MappingType("subroutine")
  @Doc(urlfrag = "#mediator-specialization-checkimport")
  public static class CheckImport extends SpecializationMethodCodeConcept<NUOPCMediator.RunSpecializations> {
    public CheckImport(final NUOPCMediator.RunSpecializations parent) {
      super(parent, "NUOPC_Mediator", "label_CheckImport");
      this.subroutineName = "CheckImport";
      List<NUOPCMediator.CheckImport> _checkImport = parent.checkImport;
      int _size = 0;
      if (_checkImport!=null) {
        _size=_checkImport.size();
      }
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        String _subroutineName = this.subroutineName;
        int _size_1 = parent.checkImport.size();
        int _plus = (_size_1 + 1);
        this.subroutineName = (_subroutineName + Integer.valueOf(_plus));
      }
      this.specLabel = "mediator_label_CheckImport";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName, "");
      _builder.append("(");
      _builder.append(this.paramGridComp, "");
      _builder.append(", ");
      _builder.append(this.paramRC, "");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("type(ESMF_GridComp)  :: ");
      _builder.append(this.paramGridComp, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("integer, intent(out) :: ");
      _builder.append(this.paramRC, "    ");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rc = ESMF_SUCCESS");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! check fields in import state");
      _builder.newLine();
      _builder.newLine();
      _builder.append("end subroutine");
      _builder.newLine();
      return _builder.toString();
    }
    
    @Override
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent._parent;
    }
    
    @Override
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent._parent.setServices;
    }
    
    @Override
    public NUOPCComponent.GenericImport genericUse() {
      return this._parent._parent._parent.importNUOPCGeneric;
    }
  }
  
  @Label(label = "TimestampExport")
  @MappingType("subroutine")
  @Doc(urlfrag = "#mediator-specialization-timestampexport")
  public static class TimestampExport extends SpecializationMethodCodeConcept<NUOPCMediator.RunSpecializations> {
    public TimestampExport(final NUOPCMediator.RunSpecializations parent) {
      super(parent, "NUOPC_Mediator", "label_TimestampExport");
      this.subroutineName = "TimestampExport";
      List<NUOPCMediator.TimestampExport> _timestampExport = parent.timestampExport;
      int _size = 0;
      if (_timestampExport!=null) {
        _size=_timestampExport.size();
      }
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        String _subroutineName = this.subroutineName;
        int _size_1 = parent.timestampExport.size();
        int _plus = (_size_1 + 1);
        this.subroutineName = (_subroutineName + Integer.valueOf(_plus));
      }
      this.specLabel = "mediator_label_TimestampExport";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName, "");
      _builder.append("(");
      _builder.append(this.paramGridComp, "");
      _builder.append(", ");
      _builder.append(this.paramRC, "");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("type(ESMF_GridComp)  :: ");
      _builder.append(this.paramGridComp, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("integer, intent(out) :: ");
      _builder.append(this.paramRC, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! local variables");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("type(ESMF_Clock)      :: clock");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("type(ESMF_State)      :: exportState");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rc = ESMF_SUCCESS");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! The default behavior is to timestamp export fields");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! to the current time on the clock");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! query the Component for info");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call ESMF_GridCompGet(");
      _builder.append(this.paramGridComp, "    ");
      _builder.append(", clock=clock, &");
      _builder.newLineIfNotEmpty();
      _builder.append("      ");
      _builder.append("exportState=exportState, rc=");
      _builder.append(this.paramRC, "      ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=");
      _builder.append(this.paramRC, "    ");
      _builder.append(", msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLineIfNotEmpty();
      _builder.append("      ");
      _builder.append("line=__LINE__, &");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("file=__FILE__)) &");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("return  ! bail out");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! update timestamp on export Fields");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call NUOPC_UpdateTimestamp(exportState, clock, rc=");
      _builder.append(this.paramRC, "    ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=");
      _builder.append(this.paramRC, "    ");
      _builder.append(", msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLineIfNotEmpty();
      _builder.append("      ");
      _builder.append("line=__LINE__, &");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("file=__FILE__)) &");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("return  ! bail out");
      _builder.newLine();
      _builder.newLine();
      _builder.append("end subroutine");
      _builder.newLine();
      return _builder.toString();
    }
    
    @Override
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent._parent;
    }
    
    @Override
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent._parent.setServices;
    }
    
    @Override
    public NUOPCComponent.GenericImport genericUse() {
      return this._parent._parent._parent.importNUOPCGeneric;
    }
  }
  
  @Label(label = "Phases")
  public static class FinalizePhases extends CodeConcept<NUOPCMediator.Finalize, ASTNode> {
    @Child
    public NUOPCMediator.FinalizePhase1 p1;
    
    public FinalizePhases(final NUOPCMediator.Finalize parent) {
      super(parent);
    }
    
    @Override
    public NUOPCMediator.FinalizePhases reverse() {
      try {
        NUOPCMediator.FinalizePhases _xblockexpression = null;
        {
          NUOPCMediator.FinalizePhase1 _finalizePhase1 = new NUOPCMediator.FinalizePhase1(this);
          CodeConcept<?, ?> _reverse = _finalizePhase1.<CodeConcept<?, ?>>reverse();
          this.p1 = ((NUOPCMediator.FinalizePhase1) _reverse);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "Specializations")
  public static class FinalizeSpecializations extends CodeConcept<NUOPCMediator.Finalize, ASTNode> {
    @Child(min = 0)
    public NUOPCMediator.FinalizeMediator finalize;
    
    public FinalizeSpecializations(final NUOPCMediator.Finalize parent) {
      super(parent);
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCMediator.FinalizeSpecializations reverseChildren() {
      NUOPCMediator.FinalizeSpecializations _xblockexpression = null;
      {
        NUOPCMediator.FinalizeMediator _finalizeMediator = new NUOPCMediator.FinalizeMediator(this);
        CodeConcept<?, ?> _reverse = _finalizeMediator.reverse();
        this.finalize = ((NUOPCMediator.FinalizeMediator) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Finalize Phase 1")
  @MappingType("subroutine-inherited")
  @Doc(urlfrag = "#mediator-phase-finalize")
  public static class FinalizePhase1 extends CodeConcept<NUOPCMediator.FinalizePhases, ASTNode> {
    public FinalizePhase1(final NUOPCMediator.FinalizePhases parent) {
      super(parent);
    }
  }
  
  @Label(label = "Finalize")
  public static class Finalize extends CodeConcept<NUOPCMediator, ASTNode> {
    @Child
    public NUOPCMediator.FinalizePhases finalPhases;
    
    @Child
    public NUOPCMediator.FinalizeSpecializations finalSpecs;
    
    public Finalize(final NUOPCMediator parent) {
      super(parent);
    }
    
    @Override
    public NUOPCMediator.Finalize reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCMediator.Finalize reverseChildren() {
      NUOPCMediator.Finalize _xblockexpression = null;
      {
        NUOPCMediator.FinalizePhases _finalizePhases = new NUOPCMediator.FinalizePhases(this);
        NUOPCMediator.FinalizePhases _reverse = _finalizePhases.reverse();
        this.finalPhases = ((NUOPCMediator.FinalizePhases) _reverse);
        NUOPCMediator.FinalizeSpecializations _finalizeSpecializations = new NUOPCMediator.FinalizeSpecializations(this);
        CodeConcept<?, ?> _reverse_1 = _finalizeSpecializations.reverse();
        this.finalSpecs = ((NUOPCMediator.FinalizeSpecializations) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "FinalizeMediator")
  @MappingType("subroutine")
  @Doc(urlfrag = "#mediator-specialization-finalize")
  public static class FinalizeMediator extends SpecializationMethodCodeConcept<NUOPCMediator.FinalizeSpecializations> {
    public FinalizeMediator(final NUOPCMediator.FinalizeSpecializations parent) {
      super(parent, "NUOPC_Mediator", "label_Finalize");
      this.subroutineName = "FinalizeMediator";
      this.specLabel = "mediator_label_Finalize";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName, "");
      _builder.append("(");
      _builder.append(this.paramGridComp, "");
      _builder.append(", ");
      _builder.append(this.paramRC, "");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("type(ESMF_GridComp)  :: ");
      _builder.append(this.paramGridComp, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("integer, intent(out) :: ");
      _builder.append(this.paramRC, "    ");
      _builder.newLineIfNotEmpty();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rc = ESMF_SUCCESS");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! finalize model");
      _builder.newLine();
      _builder.newLine();
      _builder.append("end subroutine");
      _builder.newLine();
      return _builder.toString();
    }
    
    @Override
    public CodeConcept<?, ASTModuleNode> module() {
      return this._parent._parent._parent;
    }
    
    @Override
    public SetServicesCodeConcept<?> setServices() {
      return this._parent._parent._parent.setServices;
    }
    
    @Override
    public NUOPCComponent.GenericImport genericUse() {
      return this._parent._parent._parent.importNUOPCGeneric;
    }
  }
  
  @Child(forward = true)
  public NUOPCMediator.SetServices setServices;
  
  @Child(forward = true)
  public NUOPCMediator.Initialization initialization;
  
  @Child(forward = true)
  public NUOPCMediator.Run run;
  
  @Child(forward = true)
  public NUOPCMediator.Finalize finalize;
  
  public NUOPCMediator(final IResource context) {
    super(null, context, "NUOPC_Mediator");
  }
  
  @Override
  public String prefix() {
    return "mediator";
  }
  
  @Override
  public NUOPCMediator reverse() {
    CodeConcept<?, ?> _reverse = super.reverse();
    return ((NUOPCMediator) _reverse);
  }
  
  @Override
  public NUOPCComponent reverseChildren() {
    NUOPCMediator _xblockexpression = null;
    {
      NUOPCMediator.SetServices _setServices = new NUOPCMediator.SetServices(this);
      SetServicesCodeConcept<NUOPCMediator> _reverse = _setServices.reverse();
      this.setServices = ((NUOPCMediator.SetServices) _reverse);
      NUOPCMediator.Initialization _initialization = new NUOPCMediator.Initialization(this);
      NUOPCMediator.Initialization _reverse_1 = _initialization.reverse();
      this.initialization = _reverse_1;
      NUOPCMediator.Run _run = new NUOPCMediator.Run(this);
      NUOPCMediator.Run _reverse_2 = _run.reverse();
      this.run = _reverse_2;
      NUOPCMediator.Finalize _finalize = new NUOPCMediator.Finalize(this);
      NUOPCMediator.Finalize _reverse_3 = _finalize.reverse();
      this.finalize = _reverse_3;
      _xblockexpression = this;
    }
    return _xblockexpression;
  }
  
  @Override
  public NUOPCMediator forward() {
    NUOPCComponent _forward = super.forward();
    return ((NUOPCMediator) _forward);
  }
}
