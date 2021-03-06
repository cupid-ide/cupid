package org.earthsystemmodeling.cupid.nuopc.v7bs59;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
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

@Label(label = "NUOPC Model")
@MappingType("module")
@Doc(urlfrag = "#model-top")
@SuppressWarnings("all")
public class NUOPCModel extends NUOPCComponent {
  @Label(label = "SetServices")
  @MappingType("subroutine")
  @Doc(urlfrag = "#model-setservices")
  public static class SetServices extends SetServicesCodeConcept<NUOPCModel> {
    public SetServices(final NUOPCModel parent) {
      super(parent);
    }
  }
  
  @Label(label = "Initialize Phase Definition")
  public static abstract class IPD extends CodeConcept<NUOPCModel.InitPhases, ASTNode> {
    /**
     * def void setChildPhase(EntryPointCodeConcept<IPD> child) {
     * //find field of matching type and assign child to it
     * val childField = this.class.fields.findFirst[it.type.isInstance(child)]
     * if (childField != null) {
     * childField.set(this, child)
     * }
     * }
     */
    @Label(label = "IPDv04p1 - Advertise Fields")
    @MappingType("subroutine")
    @Doc(urlfrag = "#model-phase-advertisefields")
    public static class IPDv04p1 extends EntryPointCodeConcept<NUOPCModel.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCModel.IPD.AdvertiseField> advertiseFields;
      
      public IPDv04p1(final NUOPCModel.IPD parent) {
        super(parent);
        this.phaseLabel = this.getPhaseLabel();
        this.subroutineName = "AdvertiseFields";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        parent.setOrAddChild(this);
        this.advertiseFields = CollectionLiterals.<NUOPCModel.IPD.AdvertiseField>newArrayList();
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCModel.IPD _parent = this._parent;
        boolean _matched = false;
        if (_parent instanceof NUOPCModel.IPDv00) {
          _matched=true;
          _switchResult = "IPDv00p1";
        }
        if (!_matched) {
          if (_parent instanceof NUOPCModel.IPDv01) {
            _matched=true;
            _switchResult = "IPDv01p1";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCModel.IPDv02) {
            _matched=true;
            _switchResult = "IPDv02p1";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCModel.IPDv03) {
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
      public EntryPointCodeConcept<NUOPCModel.IPD> reverseChildren() {
        NUOPCModel.IPD.IPDv04p1 _xblockexpression = null;
        {
          this.advertiseFields = new NUOPCModel.IPD.AdvertiseField(this).reverseMultiple();
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
    @Doc(urlfrag = "#model-initseq")
    public static class IPDv04p2 extends CodeConcept<NUOPCModel.IPD, ASTNode> {
      public IPDv04p2(final NUOPCModel.IPD parent) {
        super(parent);
      }
    }
    
    @Label(label = "IPDv04p3 - Realize Fields Providing Geom Object")
    @MappingType("subroutine")
    @Doc(urlfrag = "#model-phase-realizefieldsproviding")
    public static class IPDv04p3 extends EntryPointCodeConcept<NUOPCModel.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCModel.IPD.RealizeField> realizeFields;
      
      public IPDv04p3(final NUOPCModel.IPD parent) {
        super(parent);
        this.phaseLabel = this.getPhaseLabel();
        this.subroutineName = "RealizeFieldsProvidingGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        parent.setOrAddChild(this);
        this.realizeFields = CollectionLiterals.<NUOPCModel.IPD.RealizeField>newArrayList();
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCModel.IPD _parent = this._parent;
        boolean _matched = false;
        if (_parent instanceof NUOPCModel.IPDv00) {
          _matched=true;
          _switchResult = "IPDv00p2";
        }
        if (!_matched) {
          if (_parent instanceof NUOPCModel.IPDv01) {
            _matched=true;
            _switchResult = "IPDv01p3";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCModel.IPDv02) {
            _matched=true;
            _switchResult = "IPDv02p3";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCModel.IPDv03) {
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
      public EntryPointCodeConcept<NUOPCModel.IPD> reverseChildren() {
        NUOPCModel.IPD.IPDv04p3 _xblockexpression = null;
        {
          this.realizeFields = new NUOPCModel.IPD.RealizeField(this).reverseMultiple();
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
    @Doc(urlfrag = "#model-phase-modifydecomp")
    public static class IPDv04p4 extends EntryPointCodeConcept<NUOPCModel.IPD> {
      public IPDv04p4(final NUOPCModel.IPD parent) {
        super(parent);
        this.phaseLabel = this.getPhaseLabel();
        this.subroutineName = "ModifyDistGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        parent.setOrAddChild(this);
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCModel.IPD _parent = this._parent;
        boolean _matched = false;
        if (_parent instanceof NUOPCModel.IPDv03) {
          _matched=true;
          _switchResult = "IPDv03p4";
        }
        if (!_matched) {
          _switchResult = "IPDv04p4";
        }
        return _switchResult;
      }
      
      @Override
      public EntryPointCodeConcept<NUOPCModel.IPD> reverseChildren() {
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
    public static class IPDv04p5 extends EntryPointCodeConcept<NUOPCModel.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCModel.IPD.RealizeField> realizeFields;
      
      public IPDv04p5(final NUOPCModel.IPD parent) {
        super(parent);
        this.phaseLabel = this.getPhaseLabel();
        this.subroutineName = "RealizeFieldsAcceptingGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        parent.setOrAddChild(this);
        this.realizeFields = CollectionLiterals.<NUOPCModel.IPD.RealizeField>newArrayList();
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCModel.IPD _parent = this._parent;
        boolean _matched = false;
        if (_parent instanceof NUOPCModel.IPDv03) {
          _matched=true;
          _switchResult = "IPDv03p5";
        }
        if (!_matched) {
          _switchResult = "IPDv04p5";
        }
        return _switchResult;
      }
      
      @Override
      public EntryPointCodeConcept<NUOPCModel.IPD> reverseChildren() {
        NUOPCModel.IPD.IPDv04p5 _xblockexpression = null;
        {
          this.realizeFields = new NUOPCModel.IPD.RealizeField(this).reverseMultiple();
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
    @Doc(urlfrag = "#model-phase-verifyimports")
    public static class IPDv04p6 extends CodeConcept<NUOPCModel.IPD, ASTNode> {
      public IPDv04p6(final NUOPCModel.IPD parent) {
        super(parent);
      }
    }
    
    @Label(label = "IPDv04p7 - Data Initialize")
    @MappingType("subroutine-inherited")
    @Doc(urlfrag = "#model-phase-initexport")
    public static class IPDv04p7 extends CodeConcept<NUOPCModel.IPD, ASTNode> {
      public IPDv04p7(final NUOPCModel.IPD parent) {
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
        ArrayList<NUOPCModel.IPD.AdvertiseField> _xblockexpression = null;
        {
          final ArrayList<NUOPCModel.IPD.AdvertiseField> retList = CollectionLiterals.<NUOPCModel.IPD.AdvertiseField>newArrayList();
          final Function1<ASTCallStmtNode, Boolean> _function = (ASTCallStmtNode c) -> {
            return Boolean.valueOf(ASTQuery.eic(c.getSubroutineName(), "NUOPC_Advertise"));
          };
          final Consumer<ASTCallStmtNode> _function_1 = (ASTCallStmtNode it) -> {
            NUOPCModel.IPD.AdvertiseField advField = new NUOPCModel.IPD.AdvertiseField(this._parent);
            advField.state = ASTQuery.litArgExprByIdx(it, 0);
            advField.standardName = ASTQuery.litArgExprByIdx(it, 1);
            advField.setASTRef(it);
            retList.add(advField);
          };
          IterableExtensions.<ASTCallStmtNode>filter(Iterables.<ASTCallStmtNode>filter(this._parent.getASTRef().getBody(), ASTCallStmtNode.class), _function).forEach(_function_1);
          _xblockexpression = retList;
        }
        return _xblockexpression;
      }
      
      @Override
      public CodeConcept<?, ?> forward() {
        NUOPCModel.IPD.AdvertiseField _xblockexpression = null;
        {
          StringConcatenation _builder = new StringConcatenation();
          _builder.newLine();
          _builder.append("call NUOPC_Advertise(");
          CharSequence _paramch = this.paramch(this.state);
          _builder.append(_paramch);
          _builder.append(", ");
          CharSequence _paramch_1 = this.paramch(this.standardName);
          _builder.append(_paramch_1);
          _builder.append(", rc=");
          _builder.append(this._parent.paramRC);
          _builder.append(")");
          _builder.newLineIfNotEmpty();
          CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this._parent.paramRC);
          _builder.append(_ESMFErrorCheck);
          _builder.newLineIfNotEmpty();
          String code = _builder.toString();
          final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
          final ASTSubroutineSubprogramNode ssn = this._parent.getASTRef();
          ssn.getBody().addAll(stmts);
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
        ArrayList<NUOPCModel.IPD.RealizeField> _xblockexpression = null;
        {
          final ArrayList<NUOPCModel.IPD.RealizeField> retList = CollectionLiterals.<NUOPCModel.IPD.RealizeField>newArrayList();
          final Function1<ASTCallStmtNode, Boolean> _function = (ASTCallStmtNode c) -> {
            return Boolean.valueOf(ASTQuery.eic(c.getSubroutineName(), "NUOPC_Realize"));
          };
          final Consumer<ASTCallStmtNode> _function_1 = (ASTCallStmtNode it) -> {
            NUOPCModel.IPD.RealizeField relField = new NUOPCModel.IPD.RealizeField(this._parent);
            relField.state = ASTQuery.litArgExprByIdx(it, 0);
            relField.field = ASTQuery.litArgExprByIdx(it, 1);
            relField.setASTRef(it);
            retList.add(relField);
          };
          IterableExtensions.<ASTCallStmtNode>filter(Iterables.<ASTCallStmtNode>filter(this._parent.getASTRef().getBody(), ASTCallStmtNode.class), _function).forEach(_function_1);
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
            _builder.append(this.field);
            CodeConcept.addTypeDeclaration(_builder.toString(), ssn, true);
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("\t");
            _builder_1.newLine();
            _builder_1.append("call NUOPC_Realize(");
            CharSequence _paramch = this.paramch(this.state);
            _builder_1.append(_paramch);
            _builder_1.append(", field=");
            CharSequence _paramch_1 = this.paramch(this.field);
            _builder_1.append(_paramch_1);
            _builder_1.append(", rc=");
            _builder_1.append(this._parent.paramRC);
            _builder_1.append(")");
            _builder_1.newLineIfNotEmpty();
            CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this._parent.paramRC);
            _builder_1.append(_ESMFErrorCheck);
            _builder_1.newLineIfNotEmpty();
            String code = _builder_1.toString();
            final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
            ssn.getBody().addAll(stmts);
            _xblockexpression = super.<CodeConcept<?, ?>>forward();
          }
          return _xblockexpression;
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      }
    }
    
    public IPD(final NUOPCModel.InitPhases parent) {
      super(parent);
    }
  }
  
  @Label(label = "Initialize Phase Definition (v00)")
  @Doc(urlfrag = "#model-initseq")
  public static class IPDv00 extends NUOPCModel.IPD {
    @Child(min = 1)
    @Label(label = "IPDv00p1 - Advertise Fields")
    public NUOPCModel.IPD.IPDv04p1 ipdv00p1;
    
    @Child(min = 1)
    @Label(label = "IPDv00p2 - Realize Fields")
    public NUOPCModel.IPD.IPDv04p3 ipdv00p2;
    
    @Child
    @Label(label = "IPDv00p3 - Verify All Connected & Set Clock")
    public NUOPCModel.IPD.IPDv04p6 ipdv00p3;
    
    @Child
    @Label(label = "IPDv00p4 - Initialize Fields")
    public NUOPCModel.IPD.IPDv04p7 ipdv00p4;
    
    public IPDv00(final NUOPCModel.InitPhases parent) {
      super(parent);
    }
    
    @Override
    public NUOPCModel.IPDv00 reverse() {
      try {
        NUOPCModel.IPDv00 _xblockexpression = null;
        {
          CodeConcept<?, ?> _reverse = new NUOPCModel.IPD.IPDv04p1(this).reverse();
          this.ipdv00p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse);
          CodeConcept<?, ?> _reverse_1 = new NUOPCModel.IPD.IPDv04p3(this).reverse();
          this.ipdv00p2 = ((NUOPCModel.IPD.IPDv04p3) _reverse_1);
          CodeConcept<?, ?> _reverse_2 = new NUOPCModel.IPD.IPDv04p6(this).<CodeConcept<?, ?>>reverse();
          this.ipdv00p3 = ((NUOPCModel.IPD.IPDv04p6) _reverse_2);
          CodeConcept<?, ?> _reverse_3 = new NUOPCModel.IPD.IPDv04p7(this).<CodeConcept<?, ?>>reverse();
          this.ipdv00p4 = ((NUOPCModel.IPD.IPDv04p7) _reverse_3);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "Initialize Phase Definition (v01)")
  @Doc(urlfrag = "#model-initseq")
  public static class IPDv01 extends NUOPCModel.IPD {
    @Child(min = 1)
    @Label(label = "IPDv01p1 - Advertise Fields")
    public NUOPCModel.IPD.IPDv04p1 ipdv01p1;
    
    @Child
    @Label(label = "IPDv01p2 - (unspecified by NUOPC)")
    public NUOPCModel.IPD.IPDv04p2 ipdv01p2;
    
    @Child(min = 1)
    @Label(label = "IPDv01p3 - Realize Fields")
    public NUOPCModel.IPD.IPDv04p3 ipdv01p3;
    
    @Child
    @Label(label = "IPDv01p4 - Verify All Connected & Set Clock")
    public NUOPCModel.IPD.IPDv04p6 ipdv01p4;
    
    @Child
    @Label(label = "IPDv01p5 - Initialize Fields")
    public NUOPCModel.IPD.IPDv04p7 ipdv01p5;
    
    public IPDv01(final NUOPCModel.InitPhases parent) {
      super(parent);
    }
    
    @Override
    public NUOPCModel.IPDv01 reverse() {
      try {
        NUOPCModel.IPDv01 _xblockexpression = null;
        {
          CodeConcept<?, ?> _reverse = new NUOPCModel.IPD.IPDv04p1(this).reverse();
          this.ipdv01p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse);
          CodeConcept<?, ?> _reverse_1 = new NUOPCModel.IPD.IPDv04p2(this).<CodeConcept<?, ?>>reverse();
          this.ipdv01p2 = ((NUOPCModel.IPD.IPDv04p2) _reverse_1);
          CodeConcept<?, ?> _reverse_2 = new NUOPCModel.IPD.IPDv04p3(this).reverse();
          this.ipdv01p3 = ((NUOPCModel.IPD.IPDv04p3) _reverse_2);
          CodeConcept<?, ?> _reverse_3 = new NUOPCModel.IPD.IPDv04p6(this).<CodeConcept<?, ?>>reverse();
          this.ipdv01p4 = ((NUOPCModel.IPD.IPDv04p6) _reverse_3);
          CodeConcept<?, ?> _reverse_4 = new NUOPCModel.IPD.IPDv04p7(this).<CodeConcept<?, ?>>reverse();
          this.ipdv01p5 = ((NUOPCModel.IPD.IPDv04p7) _reverse_4);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "Initialize Phase Definition (v02)")
  @Doc(urlfrag = "#model-initseq")
  public static class IPDv02 extends NUOPCModel.IPD {
    public IPDv02(final NUOPCModel.InitPhases parent) {
      super(parent);
    }
    
    @Child(min = 1)
    @Label(label = "IPDv02p1 - Advertise Fields")
    public NUOPCModel.IPD.IPDv04p1 ipdv02p1;
    
    @Child
    @Label(label = "IPDv02p2 - Unspecified by NUOPC")
    public NUOPCModel.IPD.IPDv04p2 ipdv02p2;
    
    @Child(min = 1)
    @Label(label = "IPDv02p3 - Realize Fields Providing Geom Object")
    public NUOPCModel.IPD.IPDv04p3 ipdv02p3;
    
    @Child
    @Label(label = "IPDv02p4 - Verify Connected / Set Clock")
    public NUOPCModel.IPD.IPDv04p6 ipdv02p4;
    
    @Child
    @Label(label = "IPDv02p5 - Data Initialize")
    public NUOPCModel.IPD.IPDv04p7 ipdv02p5;
    
    @Override
    public NUOPCModel.IPDv02 reverse() {
      try {
        NUOPCModel.IPDv02 _xblockexpression = null;
        {
          CodeConcept<?, ?> _reverse = new NUOPCModel.IPD.IPDv04p1(this).reverse();
          this.ipdv02p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse);
          CodeConcept<?, ?> _reverse_1 = new NUOPCModel.IPD.IPDv04p2(this).<CodeConcept<?, ?>>reverse();
          this.ipdv02p2 = ((NUOPCModel.IPD.IPDv04p2) _reverse_1);
          CodeConcept<?, ?> _reverse_2 = new NUOPCModel.IPD.IPDv04p3(this).reverse();
          this.ipdv02p3 = ((NUOPCModel.IPD.IPDv04p3) _reverse_2);
          CodeConcept<?, ?> _reverse_3 = new NUOPCModel.IPD.IPDv04p6(this).<CodeConcept<?, ?>>reverse();
          this.ipdv02p4 = ((NUOPCModel.IPD.IPDv04p6) _reverse_3);
          CodeConcept<?, ?> _reverse_4 = new NUOPCModel.IPD.IPDv04p7(this).<CodeConcept<?, ?>>reverse();
          this.ipdv02p5 = ((NUOPCModel.IPD.IPDv04p7) _reverse_4);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "Initialize Phase Definition (v03)")
  @Doc(urlfrag = "#model-initseq")
  public static class IPDv03 extends NUOPCModel.IPD {
    public IPDv03(final NUOPCModel.InitPhases parent) {
      super(parent);
    }
    
    @Child(min = 1)
    @Label(label = "IPDv03p1 - Advertise Fields")
    public NUOPCModel.IPD.IPDv04p1 ipdv03p1;
    
    @Child
    @Label(label = "IPDv03p2 - Unspecified by NUOPC")
    public NUOPCModel.IPD.IPDv04p2 ipdv03p2;
    
    @Child(min = 1)
    @Label(label = "IPDv03p3 - Realize Fields Providing Geom Object")
    public NUOPCModel.IPD.IPDv04p3 ipdv03p3;
    
    @Child(min = 0)
    @Label(label = "IPDv03p4 - Modify Decomposition of Accepted Geom Object")
    public NUOPCModel.IPD.IPDv04p4 ipdv03p4;
    
    @Child(min = 1)
    @Label(label = "IPDv03p5 - Realize Fields Accepting Geom Object")
    public NUOPCModel.IPD.IPDv04p5 ipdv03p5;
    
    @Child
    @Label(label = "IPDv03p6 - Verify Connected / Set Clock")
    public NUOPCModel.IPD.IPDv04p6 ipdv03p6;
    
    @Child
    @Label(label = "IPDv03p7 - Data Initialize")
    public NUOPCModel.IPD.IPDv04p7 ipdv03p7;
    
    @Override
    public NUOPCModel.IPDv03 reverse() {
      try {
        NUOPCModel.IPDv03 _xblockexpression = null;
        {
          CodeConcept<?, ?> _reverse = new NUOPCModel.IPD.IPDv04p1(this).reverse();
          this.ipdv03p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse);
          CodeConcept<?, ?> _reverse_1 = new NUOPCModel.IPD.IPDv04p2(this).<CodeConcept<?, ?>>reverse();
          this.ipdv03p2 = ((NUOPCModel.IPD.IPDv04p2) _reverse_1);
          CodeConcept<?, ?> _reverse_2 = new NUOPCModel.IPD.IPDv04p3(this).reverse();
          this.ipdv03p3 = ((NUOPCModel.IPD.IPDv04p3) _reverse_2);
          CodeConcept<?, ?> _reverse_3 = new NUOPCModel.IPD.IPDv04p4(this).reverse();
          this.ipdv03p4 = ((NUOPCModel.IPD.IPDv04p4) _reverse_3);
          CodeConcept<?, ?> _reverse_4 = new NUOPCModel.IPD.IPDv04p5(this).reverse();
          this.ipdv03p5 = ((NUOPCModel.IPD.IPDv04p5) _reverse_4);
          CodeConcept<?, ?> _reverse_5 = new NUOPCModel.IPD.IPDv04p6(this).<CodeConcept<?, ?>>reverse();
          this.ipdv03p6 = ((NUOPCModel.IPD.IPDv04p6) _reverse_5);
          CodeConcept<?, ?> _reverse_6 = new NUOPCModel.IPD.IPDv04p7(this).<CodeConcept<?, ?>>reverse();
          this.ipdv03p7 = ((NUOPCModel.IPD.IPDv04p7) _reverse_6);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    @Override
    public boolean validate(final List<String> errors) {
      return (((!Objects.equal(this.ipdv03p1, null)) && this.ipdv03p1.validate(errors)) && (((!Objects.equal(this.ipdv03p3, null)) && this.ipdv03p3.validate(errors)) || ((!Objects.equal(this.ipdv03p5, null)) && this.ipdv03p5.validate(errors))));
    }
  }
  
  @Label(label = "Initialize Phase Definition (v04)")
  @Doc(urlfrag = "#model-initseq")
  public static class IPDv04 extends NUOPCModel.IPD {
    public IPDv04(final NUOPCModel.InitPhases parent) {
      super(parent);
    }
    
    @Child(min = 1)
    public NUOPCModel.IPD.IPDv04p1 ipdv04p1;
    
    @Child
    public NUOPCModel.IPD.IPDv04p2 ipdv04p2;
    
    @Child(min = 1)
    public NUOPCModel.IPD.IPDv04p3 ipdv04p3;
    
    @Child(min = 0)
    public NUOPCModel.IPD.IPDv04p4 ipdv04p4;
    
    @Child(min = 1)
    public NUOPCModel.IPD.IPDv04p5 ipdv04p5;
    
    @Child
    public NUOPCModel.IPD.IPDv04p6 ipdv04p6;
    
    @Child
    public NUOPCModel.IPD.IPDv04p7 ipdv04p7;
    
    @Override
    public NUOPCModel.IPDv04 reverse() {
      try {
        NUOPCModel.IPDv04 _xblockexpression = null;
        {
          CodeConcept<?, ?> _reverse = new NUOPCModel.IPD.IPDv04p1(this).reverse();
          this.ipdv04p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse);
          CodeConcept<?, ?> _reverse_1 = new NUOPCModel.IPD.IPDv04p2(this).<CodeConcept<?, ?>>reverse();
          this.ipdv04p2 = ((NUOPCModel.IPD.IPDv04p2) _reverse_1);
          CodeConcept<?, ?> _reverse_2 = new NUOPCModel.IPD.IPDv04p3(this).reverse();
          this.ipdv04p3 = ((NUOPCModel.IPD.IPDv04p3) _reverse_2);
          CodeConcept<?, ?> _reverse_3 = new NUOPCModel.IPD.IPDv04p4(this).reverse();
          this.ipdv04p4 = ((NUOPCModel.IPD.IPDv04p4) _reverse_3);
          CodeConcept<?, ?> _reverse_4 = new NUOPCModel.IPD.IPDv04p5(this).reverse();
          this.ipdv04p5 = ((NUOPCModel.IPD.IPDv04p5) _reverse_4);
          CodeConcept<?, ?> _reverse_5 = new NUOPCModel.IPD.IPDv04p6(this).<CodeConcept<?, ?>>reverse();
          this.ipdv04p6 = ((NUOPCModel.IPD.IPDv04p6) _reverse_5);
          CodeConcept<?, ?> _reverse_6 = new NUOPCModel.IPD.IPDv04p7(this).<CodeConcept<?, ?>>reverse();
          this.ipdv04p7 = ((NUOPCModel.IPD.IPDv04p7) _reverse_6);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    @Override
    public boolean validate(final List<String> errors) {
      return (((!Objects.equal(this.ipdv04p1, null)) && this.ipdv04p1.validate(errors)) && (((!Objects.equal(this.ipdv04p3, null)) && this.ipdv04p3.validate(errors)) || ((!Objects.equal(this.ipdv04p5, null)) && this.ipdv04p5.validate(errors))));
    }
  }
  
  @Label(label = "Phases")
  public static class InitPhases extends CodeConcept<NUOPCModel.Initialization, ASTNode> {
    @Child(forward = true)
    public NUOPCModel.IPDv00 ipdv00;
    
    @Child(forward = true)
    public NUOPCModel.IPDv01 ipdv01;
    
    @Child(forward = true)
    public NUOPCModel.IPDv02 ipdv02;
    
    @Child(forward = true)
    public NUOPCModel.IPDv03 ipdv03;
    
    @Child(forward = true)
    public NUOPCModel.IPDv04 ipdv04;
    
    public InitPhases(final NUOPCModel.Initialization parent) {
      super(parent);
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      NUOPCModel.InitPhases _xblockexpression = null;
      {
        this.ipdv00 = new NUOPCModel.IPDv00(this).reverse();
        this.ipdv01 = new NUOPCModel.IPDv01(this).reverse();
        this.ipdv02 = new NUOPCModel.IPDv02(this).reverse();
        this.ipdv03 = new NUOPCModel.IPDv03(this).reverse();
        this.ipdv04 = new NUOPCModel.IPDv04(this).reverse();
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    @Override
    public boolean validate(final List<String> errors) {
      return ((((this.ipdv00.validate(errors) || 
        this.ipdv01.validate(errors)) || 
        this.ipdv02.validate(errors)) || 
        this.ipdv03.validate(errors)) || 
        this.ipdv04.validate(errors));
    }
  }
  
  @Label(label = "Initialize")
  public static class Initialization extends CodeConcept<NUOPCModel, ASTNode> {
    @Child(forward = true)
    public NUOPCModel.InitPhases initPhases;
    
    @Child(forward = true)
    public NUOPCModel.InitSpecializations initSpecs;
    
    public Initialization(final NUOPCModel parent) {
      super(parent);
    }
    
    @Override
    public NUOPCModel.Initialization reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCModel.Initialization reverseChildren() {
      NUOPCModel.Initialization _xblockexpression = null;
      {
        CodeConcept<?, ?> _reverse = new NUOPCModel.InitPhases(this).reverse();
        this.initPhases = ((NUOPCModel.InitPhases) _reverse);
        CodeConcept<?, ?> _reverse_1 = new NUOPCModel.InitSpecializations(this).reverse();
        this.initSpecs = ((NUOPCModel.InitSpecializations) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Specializations")
  public static class InitSpecializations extends CodeConcept<NUOPCModel.Initialization, ASTNode> {
    @Child(min = 0)
    public NUOPCModel.SetClock setClock;
    
    @Child(min = 0)
    public NUOPCModel.DataInitialize dataInitialize;
    
    public InitSpecializations(final NUOPCModel.Initialization parent) {
      super(parent);
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      NUOPCModel.InitSpecializations _xblockexpression = null;
      {
        CodeConcept<?, ?> _reverse = new NUOPCModel.SetClock(this).reverse();
        this.setClock = ((NUOPCModel.SetClock) _reverse);
        CodeConcept<?, ?> _reverse_1 = new NUOPCModel.DataInitialize(this).reverse();
        this.dataInitialize = ((NUOPCModel.DataInitialize) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "SetClock")
  @MappingType("subroutine")
  @Doc(urlfrag = "#model-specialization-setclock")
  public static class SetClock extends SpecializationMethodCodeConcept<NUOPCModel.InitSpecializations> {
    public SetClock(final NUOPCModel.InitSpecializations parent) {
      super(parent, "NUOPC_Model", "label_SetClock");
      this.subroutineName = "SetClock";
      this.specLabel = "model_label_SetClock";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName);
      _builder.append("(");
      _builder.append(this.paramGridComp);
      _builder.append(", ");
      _builder.append(this.paramRC);
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
      _builder.append("type(ESMF_TimeInterval)       :: stabilityTimeStep");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rc = ESMF_SUCCESS");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! query the Component for its clock, importState and exportState");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call ESMF_GridCompGet(gcomp, clock=clock, rc=rc)");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLine();
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
      _builder.append("! initialize internal clock");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! here: parent Clock and stability timeStep determine actual model timeStep");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call ESMF_TimeIntervalSet(stabilityTimeStep, m=");
      CharSequence _paramint = this.paramint(5);
      _builder.append(_paramint, "    ");
      _builder.append(", rc=rc)");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("line=__LINE__, &");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("file=__FILE__)) &");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("return  ! bail out");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call NUOPC_CompSetClock(gcomp, clock, stabilityTimeStep, rc=rc)");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLine();
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
  
  @Label(label = "DataInitialize")
  @MappingType("subroutine")
  @Doc(urlfrag = "#model-specialization-datainitialize")
  public static class DataInitialize extends SpecializationMethodCodeConcept<NUOPCModel.InitSpecializations> {
    public DataInitialize(final NUOPCModel.InitSpecializations parent) {
      super(parent, "NUOPC_Model", "label_DataInitialize");
      this.subroutineName = "DataInitialize";
      this.specLabel = "model_label_DataInitialize";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName);
      _builder.append("(");
      _builder.append(this.paramGridComp);
      _builder.append(", ");
      _builder.append(this.paramRC);
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
  public static class Run extends CodeConcept<NUOPCModel, ASTNode> {
    @Child
    public NUOPCModel.RunPhases runPhases;
    
    @Child
    public NUOPCModel.RunSpecializations runSpecs;
    
    public Run(final NUOPCModel parent) {
      super(parent);
    }
    
    @Override
    public NUOPCModel.Run reverse() {
      NUOPCModel.Run _xblockexpression = null;
      {
        NUOPCModel.RunPhases _reverse = new NUOPCModel.RunPhases(this).reverse();
        this.runPhases = ((NUOPCModel.RunPhases) _reverse);
        CodeConcept<?, ?> _reverse_1 = new NUOPCModel.RunSpecializations(this).reverse();
        this.runSpecs = ((NUOPCModel.RunSpecializations) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Specializations")
  public static class RunSpecializations extends CodeConcept<NUOPCModel.Run, ASTNode> {
    @Child(min = 0, max = (-1))
    public List<NUOPCModel.SetRunClock> setRunClock;
    
    @Child(min = 0, max = (-1))
    public List<NUOPCModel.CheckImport> checkImport;
    
    @Child(min = 1, max = (-1))
    public List<NUOPCModel.ModelAdvance> modelAdvance;
    
    public RunSpecializations(final NUOPCModel.Run parent) {
      super(parent);
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCModel.RunSpecializations reverseChildren() {
      NUOPCModel.RunSpecializations _xblockexpression = null;
      {
        this.modelAdvance = new NUOPCModel.ModelAdvance(this).reverseMultiple();
        this.setRunClock = new NUOPCModel.SetRunClock(this).reverseMultiple();
        this.checkImport = new NUOPCModel.CheckImport(this).reverseMultiple();
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Phases")
  public static class RunPhases extends CodeConcept<NUOPCModel.Run, ASTNode> {
    @Child
    public NUOPCModel.RunPhase1 p1;
    
    public RunPhases(final NUOPCModel.Run parent) {
      super(parent);
    }
    
    @Override
    public NUOPCModel.RunPhases reverse() {
      try {
        NUOPCModel.RunPhases _xblockexpression = null;
        {
          CodeConcept<?, ?> _reverse = new NUOPCModel.RunPhase1(this).<CodeConcept<?, ?>>reverse();
          this.p1 = ((NUOPCModel.RunPhase1) _reverse);
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
  @Doc(urlfrag = "#model-phase-run")
  public static class RunPhase1 extends CodeConcept<NUOPCModel.RunPhases, ASTNode> {
    public RunPhase1(final NUOPCModel.RunPhases parent) {
      super(parent);
    }
  }
  
  @Label(label = "Advance")
  @MappingType("subroutine")
  @Doc(urlfrag = "#model-specialization-advance")
  public static class ModelAdvance extends SpecializationMethodCodeConcept<NUOPCModel.RunSpecializations> {
    public ModelAdvance(final NUOPCModel.RunSpecializations parent) {
      super(parent, "NUOPC_Model", "label_Advance");
      this.subroutineName = "ModelAdvance";
      List<NUOPCModel.ModelAdvance> _modelAdvance = parent.modelAdvance;
      int _size = 0;
      if (_modelAdvance!=null) {
        _size=_modelAdvance.size();
      }
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        String _subroutineName = this.subroutineName;
        int _size_1 = parent.modelAdvance.size();
        int _plus = (_size_1 + 1);
        this.subroutineName = (_subroutineName + Integer.valueOf(_plus));
      }
      this.specLabel = "model_label_Advance";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName);
      _builder.append("(");
      _builder.append(this.paramGridComp);
      _builder.append(", ");
      _builder.append(this.paramRC);
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
      _builder.append("! advance the model: currTime -> currTime + timeStep");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
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
  @Doc(urlfrag = "#model-specialization-setrunclock")
  public static class SetRunClock extends SpecializationMethodCodeConcept<NUOPCModel.RunSpecializations> {
    public SetRunClock(final NUOPCModel.RunSpecializations parent) {
      super(parent, "NUOPC_Model", "label_SetRunClock");
      this.subroutineName = "SetRunClock";
      List<NUOPCModel.SetRunClock> _setRunClock = parent.setRunClock;
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
      this.specLabel = "model_label_SetRunClock";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName);
      _builder.append("(");
      _builder.append(this.paramGridComp);
      _builder.append(", ");
      _builder.append(this.paramRC);
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
      _builder.append("if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLine();
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
      _builder.append("if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLine();
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
  @Doc(urlfrag = "#model-specialization-checkimport")
  public static class CheckImport extends SpecializationMethodCodeConcept<NUOPCModel.RunSpecializations> {
    public CheckImport(final NUOPCModel.RunSpecializations parent) {
      super(parent, "NUOPC_Model", "label_CheckImport");
      this.subroutineName = "CheckImport";
      List<NUOPCModel.CheckImport> _checkImport = parent.checkImport;
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
      this.specLabel = "model_label_CheckImport";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName);
      _builder.append("(");
      _builder.append(this.paramGridComp);
      _builder.append(", ");
      _builder.append(this.paramRC);
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
  
  @Label(label = "Phases")
  public static class FinalizePhases extends CodeConcept<NUOPCModel.Finalize, ASTNode> {
    @Child
    public NUOPCModel.FinalizePhase1 p1;
    
    public FinalizePhases(final NUOPCModel.Finalize parent) {
      super(parent);
    }
    
    @Override
    public NUOPCModel.FinalizePhases reverse() {
      try {
        NUOPCModel.FinalizePhases _xblockexpression = null;
        {
          CodeConcept<?, ?> _reverse = new NUOPCModel.FinalizePhase1(this).<CodeConcept<?, ?>>reverse();
          this.p1 = ((NUOPCModel.FinalizePhase1) _reverse);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "Specializations")
  public static class FinalizeSpecializations extends CodeConcept<NUOPCModel.Finalize, ASTNode> {
    @Child(min = 0)
    public NUOPCModel.FinalizeModel finalize;
    
    public FinalizeSpecializations(final NUOPCModel.Finalize parent) {
      super(parent);
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCModel.FinalizeSpecializations reverseChildren() {
      NUOPCModel.FinalizeSpecializations _xblockexpression = null;
      {
        CodeConcept<?, ?> _reverse = new NUOPCModel.FinalizeModel(this).reverse();
        this.finalize = ((NUOPCModel.FinalizeModel) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Finalize Phase 1")
  @MappingType("subroutine-inherited")
  @Doc(urlfrag = "#model-phase-finalize")
  public static class FinalizePhase1 extends CodeConcept<NUOPCModel.FinalizePhases, ASTNode> {
    public FinalizePhase1(final NUOPCModel.FinalizePhases parent) {
      super(parent);
    }
  }
  
  @Label(label = "Finalize")
  public static class Finalize extends CodeConcept<NUOPCModel, ASTNode> {
    @Child
    public NUOPCModel.FinalizePhases finalPhases;
    
    @Child
    public NUOPCModel.FinalizeSpecializations finalSpecs;
    
    public Finalize(final NUOPCModel parent) {
      super(parent);
    }
    
    @Override
    public NUOPCModel.Finalize reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCModel.Finalize reverseChildren() {
      NUOPCModel.Finalize _xblockexpression = null;
      {
        NUOPCModel.FinalizePhases _reverse = new NUOPCModel.FinalizePhases(this).reverse();
        this.finalPhases = ((NUOPCModel.FinalizePhases) _reverse);
        CodeConcept<?, ?> _reverse_1 = new NUOPCModel.FinalizeSpecializations(this).reverse();
        this.finalSpecs = ((NUOPCModel.FinalizeSpecializations) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "FinalizeModel")
  @MappingType("subroutine")
  @Doc(urlfrag = "#model-specialization-finalize")
  public static class FinalizeModel extends SpecializationMethodCodeConcept<NUOPCModel.FinalizeSpecializations> {
    public FinalizeModel(final NUOPCModel.FinalizeSpecializations parent) {
      super(parent, "NUOPC_Model", "label_Finalize");
      this.subroutineName = "FinalizeModel";
      this.specLabel = "model_label_Finalize";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public String subroutineTemplate() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.newLine();
      _builder.append("subroutine ");
      _builder.append(this.subroutineName);
      _builder.append("(");
      _builder.append(this.paramGridComp);
      _builder.append(", ");
      _builder.append(this.paramRC);
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
  public NUOPCModel.SetServices setServices;
  
  @Child(forward = true)
  public NUOPCModel.Initialization initialization;
  
  @Child
  public NUOPCModel.Run run;
  
  @Child
  public NUOPCModel.Finalize finalize;
  
  public NUOPCModel(final IResource context) {
    super(null, context, "NUOPC_Model");
  }
  
  @Override
  public String prefix() {
    return "model";
  }
  
  @Override
  public NUOPCModel reverse() {
    CodeConcept<?, ?> _reverse = super.reverse();
    return ((NUOPCModel) _reverse);
  }
  
  @Override
  public NUOPCComponent reverseChildren() {
    NUOPCModel _xblockexpression = null;
    {
      SetServicesCodeConcept<NUOPCModel> _reverse = new NUOPCModel.SetServices(this).reverse();
      this.setServices = ((NUOPCModel.SetServices) _reverse);
      this.initialization = new NUOPCModel.Initialization(this).reverse();
      this.run = new NUOPCModel.Run(this).reverse();
      this.finalize = new NUOPCModel.Finalize(this).reverse();
      _xblockexpression = this;
    }
    return _xblockexpression;
  }
  
  @Override
  public NUOPCModel forward() {
    NUOPCComponent _forward = super.forward();
    return ((NUOPCModel) _forward);
  }
}
