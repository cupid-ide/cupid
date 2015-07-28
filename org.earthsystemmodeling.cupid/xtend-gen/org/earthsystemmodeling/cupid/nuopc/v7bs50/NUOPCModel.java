package org.earthsystemmodeling.cupid.nuopc.v7bs50;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.EntryPointCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.NUOPCComponent;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.SetServicesCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.SpecializationMethodCodeConcept;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;

@Label(label = "NUOPC Model")
@MappingType("module")
@SuppressWarnings("all")
public class NUOPCModel extends NUOPCComponent {
  @Label(label = "Initialize Phase Definition")
  public static abstract class IPD extends CodeConcept<NUOPCModel.InitPhases, ASTNode> {
    @Label(label = "IPDv04p1 - Advertise Fields")
    @MappingType("subroutine")
    public static class IPDv04p1 extends EntryPointCodeConcept<NUOPCModel.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCModel.IPD.AdvertiseField> advertiseFields;
      
      public IPDv04p1(final NUOPCModel.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
        this.subroutineName = "AdvertiseFields";
        this.methodType = "ESMF_METHOD_INITIALIZE";
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCModel.IPD _parent = this._parent;
        boolean _matched = false;
        if (!_matched) {
          if (_parent instanceof NUOPCModel.IPDv00) {
            _matched=true;
            _switchResult = "IPDv00p1";
          }
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
          NUOPCModel.IPD.AdvertiseField _advertiseField = new NUOPCModel.IPD.AdvertiseField(this);
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
    public static class IPDv04p2 extends CodeConcept<NUOPCModel.IPD, ASTNode> {
      public IPDv04p2(final NUOPCModel.IPD parent) {
        super(parent);
      }
    }
    
    @Label(label = "IPDv04p3 - Realize Fields Providing Geom Object")
    @MappingType("subroutine")
    public static class IPDv04p3 extends EntryPointCodeConcept<NUOPCModel.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCModel.IPD.RealizeField> realizeFields;
      
      public IPDv04p3(final NUOPCModel.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
        this.subroutineName = "RealizeFieldsProvidingGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCModel.IPD _parent = this._parent;
        boolean _matched = false;
        if (!_matched) {
          if (_parent instanceof NUOPCModel.IPDv00) {
            _matched=true;
            _switchResult = "IPDv00p2";
          }
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
          NUOPCModel.IPD.RealizeField _realizeField = new NUOPCModel.IPD.RealizeField(this);
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
    public static class IPDv04p4 extends EntryPointCodeConcept<NUOPCModel.IPD> {
      public IPDv04p4(final NUOPCModel.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
        this.subroutineName = "ModifyDistGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCModel.IPD _parent = this._parent;
        boolean _matched = false;
        if (!_matched) {
          if (_parent instanceof NUOPCModel.IPDv03) {
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
    public static class IPDv04p5 extends EntryPointCodeConcept<NUOPCModel.IPD> {
      public IPDv04p5(final NUOPCModel.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
        this.subroutineName = "RealizeFieldsAcceptingGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCModel.IPD _parent = this._parent;
        boolean _matched = false;
        if (!_matched) {
          if (_parent instanceof NUOPCModel.IPDv03) {
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
    
    @Label(label = "IPDv04p6 - Verify Connected / Set Clock")
    @MappingType("subroutine-inherited")
    public static class IPDv04p6 extends CodeConcept<NUOPCModel.IPD, ASTNode> {
      public IPDv04p6(final NUOPCModel.IPD parent) {
        super(parent);
      }
    }
    
    @Label(label = "IPDv04p7 - Data Initialize")
    @MappingType("subroutine-inherited")
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
      }
      
      @Override
      public String name() {
        return ((this.state + " / ") + this.standardName);
      }
      
      @Override
      public List reverseMultiple() {
        try {
          ArrayList<NUOPCModel.IPD.AdvertiseField> _xblockexpression = null;
          {
            ArrayList<NUOPCModel.IPD.AdvertiseField> retList = CollectionLiterals.<NUOPCModel.IPD.AdvertiseField>newArrayList();
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("call_(_cid, ");
            long _parentID = this.parentID();
            _builder.append(_parentID, "");
            _builder.append(", \'NUOPC_StateAdvertiseField\'),");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t\t\t");
            _builder.append("callArgWithType(_, _cid, 1, _, _, _stateExpr),");
            _builder.newLine();
            _builder.append("\t\t\t\t\t\t\t");
            _builder.append("callArgWithType(_, _cid, 2, _, _, _standardNameExpr).");
            ResultSet rs = this.execQuery(_builder);
            while (rs.next()) {
              {
                NUOPCModel.IPD.AdvertiseField advField = new NUOPCModel.IPD.AdvertiseField(this._parent);
                long _long = rs.getLong("_cid");
                advField._id = _long;
                String _string = rs.getString("_stateExpr");
                advField.state = _string;
                String _string_1 = rs.getString("_standardNameExpr");
                advField.standardName = _string_1;
                retList.add(advField);
              }
            }
            rs.close();
            _xblockexpression = retList;
          }
          return _xblockexpression;
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      }
      
      @Override
      public IFortranAST forward() {
        IFortranAST _xblockexpression = null;
        {
          IFortranAST ast = this.getAST();
          StringConcatenation _builder = new StringConcatenation();
          _builder.newLine();
          _builder.append("call NUOPC_StateAdvertiseField(");
          CharSequence _paramch = this.paramch(this.state);
          _builder.append(_paramch, "");
          _builder.append(", \'");
          CharSequence _paramch_1 = this.paramch(this.standardName);
          _builder.append(_paramch_1, "");
          _builder.append("\', rc=");
          _builder.append(this._parent.paramRC, "");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
          _builder.append("if (ESMF_LogFoundError(rcToCheck=");
          _builder.append(this._parent.paramRC, "");
          _builder.append(", msg=ESMF_LOGERR_PASSTHRU, &");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("line=__LINE__, &");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("file=__FILE__)) &");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("return  ! bail out");
          _builder.newLine();
          String code = _builder.toString();
          final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
          ASTSubroutineSubprogramNode ssn = this._parent.getASTRef();
          IASTListNode<IBodyConstruct> _body = ssn.getBody();
          _body.addAll(stmts);
          _xblockexpression = ast;
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
      }
      
      @Override
      public String name() {
        return ((this.state + " / ") + this.field);
      }
      
      @Override
      public List reverseMultiple() {
        try {
          ArrayList<NUOPCModel.IPD.RealizeField> _xblockexpression = null;
          {
            ArrayList<NUOPCModel.IPD.RealizeField> retList = CollectionLiterals.<NUOPCModel.IPD.RealizeField>newArrayList();
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("call_(_cid, ");
            long _parentID = this.parentID();
            _builder.append(_parentID, "");
            _builder.append(", \'NUOPC_StateRealizeField\'),");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t\t");
            _builder.append("callArgWithType(_, _cid, 1, _, _, _stateExpr),");
            _builder.newLine();
            _builder.append("\t\t\t\t\t\t");
            _builder.append("callArgWithType(_, _cid, 2, _, _, _fieldExpr).");
            ResultSet rs = this.execQuery(_builder);
            while (rs.next()) {
              {
                NUOPCModel.IPD.RealizeField relField = new NUOPCModel.IPD.RealizeField(this._parent);
                long _long = rs.getLong("_cid");
                relField._id = _long;
                String _string = rs.getString("_stateExpr");
                relField.state = _string;
                String _string_1 = rs.getString("_fieldExpr");
                relField.field = _string_1;
                retList.add(relField);
              }
            }
            rs.close();
            _xblockexpression = retList;
          }
          return _xblockexpression;
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      }
      
      @Override
      public IFortranAST forward() {
        IFortranAST _xblockexpression = null;
        {
          IFortranAST ast = this.getAST();
          StringConcatenation _builder = new StringConcatenation();
          _builder.newLine();
          _builder.append("call NUOPC_StateRealizeField(");
          CharSequence _paramch = this.paramch(this.state);
          _builder.append(_paramch, "");
          _builder.append(", field=");
          CharSequence _paramch_1 = this.paramch(this.field);
          _builder.append(_paramch_1, "");
          _builder.append(", rc=");
          _builder.append(this._parent.paramRC, "");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
          _builder.append("if (ESMF_LogFoundError(rcToCheck=");
          _builder.append(this._parent.paramRC, "");
          _builder.append(", msg=ESMF_LOGERR_PASSTHRU, &");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("line=__LINE__, &");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("file=__FILE__)) &");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("return  ! bail out");
          _builder.newLine();
          String code = _builder.toString();
          final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
          ASTSubroutineSubprogramNode ssn = this._parent.getASTRef();
          IASTListNode<IBodyConstruct> _body = ssn.getBody();
          _body.addAll(stmts);
          _xblockexpression = ast;
        }
        return _xblockexpression;
      }
    }
    
    public IPD(final NUOPCModel.InitPhases parent) {
      super(parent);
    }
  }
  
  @Label(label = "Initialize Phase Definition (v00)")
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
      NUOPCModel.IPDv00 _xblockexpression = null;
      {
        NUOPCModel.IPD.IPDv04p1 _iPDv04p1 = new NUOPCModel.IPD.IPDv04p1(this);
        CodeConcept<NUOPCModel.IPD, ASTSubroutineSubprogramNode> _reverse = _iPDv04p1.reverse();
        this.ipdv00p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse);
        NUOPCModel.IPD.IPDv04p3 _iPDv04p3 = new NUOPCModel.IPD.IPDv04p3(this);
        CodeConcept<NUOPCModel.IPD, ASTSubroutineSubprogramNode> _reverse_1 = _iPDv04p3.reverse();
        this.ipdv00p2 = ((NUOPCModel.IPD.IPDv04p3) _reverse_1);
        NUOPCModel.IPD.IPDv04p6 _iPDv04p6 = new NUOPCModel.IPD.IPDv04p6(this);
        CodeConcept<NUOPCModel.IPD, ASTNode> _reverse_2 = _iPDv04p6.reverse();
        this.ipdv00p3 = ((NUOPCModel.IPD.IPDv04p6) _reverse_2);
        NUOPCModel.IPD.IPDv04p7 _iPDv04p7 = new NUOPCModel.IPD.IPDv04p7(this);
        CodeConcept<NUOPCModel.IPD, ASTNode> _reverse_3 = _iPDv04p7.reverse();
        this.ipdv00p4 = ((NUOPCModel.IPD.IPDv04p7) _reverse_3);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Initialize Phase Definition (v01)")
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
      NUOPCModel.IPDv01 _xblockexpression = null;
      {
        NUOPCModel.IPD.IPDv04p1 _iPDv04p1 = new NUOPCModel.IPD.IPDv04p1(this);
        CodeConcept<NUOPCModel.IPD, ASTSubroutineSubprogramNode> _reverse = _iPDv04p1.reverse();
        this.ipdv01p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse);
        NUOPCModel.IPD.IPDv04p2 _iPDv04p2 = new NUOPCModel.IPD.IPDv04p2(this);
        CodeConcept<NUOPCModel.IPD, ASTNode> _reverse_1 = _iPDv04p2.reverse();
        this.ipdv01p2 = ((NUOPCModel.IPD.IPDv04p2) _reverse_1);
        NUOPCModel.IPD.IPDv04p3 _iPDv04p3 = new NUOPCModel.IPD.IPDv04p3(this);
        CodeConcept<NUOPCModel.IPD, ASTSubroutineSubprogramNode> _reverse_2 = _iPDv04p3.reverse();
        this.ipdv01p3 = ((NUOPCModel.IPD.IPDv04p3) _reverse_2);
        NUOPCModel.IPD.IPDv04p6 _iPDv04p6 = new NUOPCModel.IPD.IPDv04p6(this);
        CodeConcept<NUOPCModel.IPD, ASTNode> _reverse_3 = _iPDv04p6.reverse();
        this.ipdv01p4 = ((NUOPCModel.IPD.IPDv04p6) _reverse_3);
        NUOPCModel.IPD.IPDv04p7 _iPDv04p7 = new NUOPCModel.IPD.IPDv04p7(this);
        CodeConcept<NUOPCModel.IPD, ASTNode> _reverse_4 = _iPDv04p7.reverse();
        this.ipdv01p5 = ((NUOPCModel.IPD.IPDv04p7) _reverse_4);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Initialize Phase Definition (v02)")
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
      NUOPCModel.IPDv02 _xblockexpression = null;
      {
        NUOPCModel.IPD.IPDv04p1 _iPDv04p1 = new NUOPCModel.IPD.IPDv04p1(this);
        CodeConcept<NUOPCModel.IPD, ASTSubroutineSubprogramNode> _reverse = _iPDv04p1.reverse();
        this.ipdv02p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse);
        NUOPCModel.IPD.IPDv04p2 _iPDv04p2 = new NUOPCModel.IPD.IPDv04p2(this);
        CodeConcept<NUOPCModel.IPD, ASTNode> _reverse_1 = _iPDv04p2.reverse();
        this.ipdv02p2 = ((NUOPCModel.IPD.IPDv04p2) _reverse_1);
        NUOPCModel.IPD.IPDv04p3 _iPDv04p3 = new NUOPCModel.IPD.IPDv04p3(this);
        CodeConcept<NUOPCModel.IPD, ASTSubroutineSubprogramNode> _reverse_2 = _iPDv04p3.reverse();
        this.ipdv02p3 = ((NUOPCModel.IPD.IPDv04p3) _reverse_2);
        NUOPCModel.IPD.IPDv04p6 _iPDv04p6 = new NUOPCModel.IPD.IPDv04p6(this);
        CodeConcept<NUOPCModel.IPD, ASTNode> _reverse_3 = _iPDv04p6.reverse();
        this.ipdv02p4 = ((NUOPCModel.IPD.IPDv04p6) _reverse_3);
        NUOPCModel.IPD.IPDv04p7 _iPDv04p7 = new NUOPCModel.IPD.IPDv04p7(this);
        CodeConcept<NUOPCModel.IPD, ASTNode> _reverse_4 = _iPDv04p7.reverse();
        this.ipdv02p5 = ((NUOPCModel.IPD.IPDv04p7) _reverse_4);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Initialize Phase Definition (v03)")
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
      NUOPCModel.IPDv03 _xblockexpression = null;
      {
        NUOPCModel.IPD.IPDv04p1 _iPDv04p1 = new NUOPCModel.IPD.IPDv04p1(this);
        CodeConcept<NUOPCModel.IPD, ASTSubroutineSubprogramNode> _reverse = _iPDv04p1.reverse();
        this.ipdv03p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse);
        NUOPCModel.IPD.IPDv04p2 _iPDv04p2 = new NUOPCModel.IPD.IPDv04p2(this);
        CodeConcept<NUOPCModel.IPD, ASTNode> _reverse_1 = _iPDv04p2.reverse();
        this.ipdv03p2 = ((NUOPCModel.IPD.IPDv04p2) _reverse_1);
        NUOPCModel.IPD.IPDv04p3 _iPDv04p3 = new NUOPCModel.IPD.IPDv04p3(this);
        CodeConcept<NUOPCModel.IPD, ASTSubroutineSubprogramNode> _reverse_2 = _iPDv04p3.reverse();
        this.ipdv03p3 = ((NUOPCModel.IPD.IPDv04p3) _reverse_2);
        NUOPCModel.IPD.IPDv04p4 _iPDv04p4 = new NUOPCModel.IPD.IPDv04p4(this);
        CodeConcept<NUOPCModel.IPD, ASTSubroutineSubprogramNode> _reverse_3 = _iPDv04p4.reverse();
        this.ipdv03p4 = ((NUOPCModel.IPD.IPDv04p4) _reverse_3);
        NUOPCModel.IPD.IPDv04p5 _iPDv04p5 = new NUOPCModel.IPD.IPDv04p5(this);
        CodeConcept<NUOPCModel.IPD, ASTSubroutineSubprogramNode> _reverse_4 = _iPDv04p5.reverse();
        this.ipdv03p5 = ((NUOPCModel.IPD.IPDv04p5) _reverse_4);
        NUOPCModel.IPD.IPDv04p6 _iPDv04p6 = new NUOPCModel.IPD.IPDv04p6(this);
        CodeConcept<NUOPCModel.IPD, ASTNode> _reverse_5 = _iPDv04p6.reverse();
        this.ipdv03p6 = ((NUOPCModel.IPD.IPDv04p6) _reverse_5);
        NUOPCModel.IPD.IPDv04p7 _iPDv04p7 = new NUOPCModel.IPD.IPDv04p7(this);
        CodeConcept<NUOPCModel.IPD, ASTNode> _reverse_6 = _iPDv04p7.reverse();
        this.ipdv03p7 = ((NUOPCModel.IPD.IPDv04p7) _reverse_6);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Initialize Phase Definition (v04)")
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
      NUOPCModel.IPDv04 _xblockexpression = null;
      {
        NUOPCModel.IPD.IPDv04p1 _iPDv04p1 = new NUOPCModel.IPD.IPDv04p1(this);
        CodeConcept<NUOPCModel.IPD, ASTSubroutineSubprogramNode> _reverse = _iPDv04p1.reverse();
        this.ipdv04p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse);
        NUOPCModel.IPD.IPDv04p2 _iPDv04p2 = new NUOPCModel.IPD.IPDv04p2(this);
        CodeConcept<NUOPCModel.IPD, ASTNode> _reverse_1 = _iPDv04p2.reverse();
        this.ipdv04p2 = ((NUOPCModel.IPD.IPDv04p2) _reverse_1);
        NUOPCModel.IPD.IPDv04p3 _iPDv04p3 = new NUOPCModel.IPD.IPDv04p3(this);
        CodeConcept<NUOPCModel.IPD, ASTSubroutineSubprogramNode> _reverse_2 = _iPDv04p3.reverse();
        this.ipdv04p3 = ((NUOPCModel.IPD.IPDv04p3) _reverse_2);
        NUOPCModel.IPD.IPDv04p4 _iPDv04p4 = new NUOPCModel.IPD.IPDv04p4(this);
        CodeConcept<NUOPCModel.IPD, ASTSubroutineSubprogramNode> _reverse_3 = _iPDv04p4.reverse();
        this.ipdv04p4 = ((NUOPCModel.IPD.IPDv04p4) _reverse_3);
        NUOPCModel.IPD.IPDv04p5 _iPDv04p5 = new NUOPCModel.IPD.IPDv04p5(this);
        CodeConcept<NUOPCModel.IPD, ASTSubroutineSubprogramNode> _reverse_4 = _iPDv04p5.reverse();
        this.ipdv04p5 = ((NUOPCModel.IPD.IPDv04p5) _reverse_4);
        NUOPCModel.IPD.IPDv04p6 _iPDv04p6 = new NUOPCModel.IPD.IPDv04p6(this);
        CodeConcept<NUOPCModel.IPD, ASTNode> _reverse_5 = _iPDv04p6.reverse();
        this.ipdv04p6 = ((NUOPCModel.IPD.IPDv04p6) _reverse_5);
        NUOPCModel.IPD.IPDv04p7 _iPDv04p7 = new NUOPCModel.IPD.IPDv04p7(this);
        CodeConcept<NUOPCModel.IPD, ASTNode> _reverse_6 = _iPDv04p7.reverse();
        this.ipdv04p7 = ((NUOPCModel.IPD.IPDv04p7) _reverse_6);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Phases")
  public static class InitPhases extends CodeConcept<NUOPCModel.Initialization, ASTNode> {
    @Child
    public NUOPCModel.IPDv00 ipdv00;
    
    @Child
    public NUOPCModel.IPDv01 ipdv01;
    
    @Child
    public NUOPCModel.IPDv02 ipdv02;
    
    @Child
    public NUOPCModel.IPDv03 ipdv03;
    
    @Child
    public NUOPCModel.IPDv04 ipdv04;
    
    public InitPhases(final NUOPCModel.Initialization parent) {
      super(parent);
    }
    
    @Override
    public CodeConcept<NUOPCModel.Initialization, ASTNode> reverse() {
      NUOPCModel.InitPhases _xblockexpression = null;
      {
        NUOPCModel.IPDv00 _iPDv00 = new NUOPCModel.IPDv00(this);
        NUOPCModel.IPDv00 _reverse = _iPDv00.reverse();
        this.ipdv00 = _reverse;
        NUOPCModel.IPDv01 _iPDv01 = new NUOPCModel.IPDv01(this);
        NUOPCModel.IPDv01 _reverse_1 = _iPDv01.reverse();
        this.ipdv01 = _reverse_1;
        NUOPCModel.IPDv02 _iPDv02 = new NUOPCModel.IPDv02(this);
        NUOPCModel.IPDv02 _reverse_2 = _iPDv02.reverse();
        this.ipdv02 = _reverse_2;
        NUOPCModel.IPDv03 _iPDv03 = new NUOPCModel.IPDv03(this);
        NUOPCModel.IPDv03 _reverse_3 = _iPDv03.reverse();
        this.ipdv03 = _reverse_3;
        NUOPCModel.IPDv04 _iPDv04 = new NUOPCModel.IPDv04(this);
        NUOPCModel.IPDv04 _reverse_4 = _iPDv04.reverse();
        this.ipdv04 = _reverse_4;
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Initialize")
  public static class Initialization extends CodeConcept<NUOPCModel, ASTNode> {
    @Child
    public NUOPCModel.InitPhases initPhases;
    
    @Child
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
        NUOPCModel.InitPhases _initPhases = new NUOPCModel.InitPhases(this);
        CodeConcept<NUOPCModel.Initialization, ASTNode> _reverse = _initPhases.reverse();
        this.initPhases = ((NUOPCModel.InitPhases) _reverse);
        NUOPCModel.InitSpecializations _initSpecializations = new NUOPCModel.InitSpecializations(this);
        CodeConcept<NUOPCModel.Initialization, ASTNode> _reverse_1 = _initSpecializations.reverse();
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
    public CodeConcept<NUOPCModel.Initialization, ASTNode> reverse() {
      NUOPCModel.InitSpecializations _xblockexpression = null;
      {
        NUOPCModel.SetClock _setClock = new NUOPCModel.SetClock(this);
        SpecializationMethodCodeConcept<NUOPCModel.InitSpecializations> _reverse = _setClock.reverse();
        this.setClock = ((NUOPCModel.SetClock) _reverse);
        NUOPCModel.DataInitialize _dataInitialize = new NUOPCModel.DataInitialize(this);
        SpecializationMethodCodeConcept<NUOPCModel.InitSpecializations> _reverse_1 = _dataInitialize.reverse();
        this.dataInitialize = ((NUOPCModel.DataInitialize) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  /**
   * @Label(label="Initialize Phase 1")
   * @MappingType("subroutine")
   * public static class InitP1 extends EntryPointCodeConcept<Initialization> {
   * 
   * @Child(min=0, max=-1)
   * public List<InitP1_AdvertiseField> advertiseFields
   * 
   * new(Initialization parent) {
   * super(parent, "IPDv00p1")
   * subroutineName = "InitializeP1"
   * methodType = "ESMF_METHOD_INITIALIZE"
   * }
   * 
   * override reverseChildren() {
   * advertiseFields = new InitP1_AdvertiseField(this).reverseMultiple
   * this
   * }
   * 
   * override module() {
   * _parent._parent
   * }
   * 
   * override setServices() {
   * _parent._parent.setServices
   * }
   * 
   * // testing forward chaining
   * override forward() {
   * var ast = super.forward
   * ast = new InitP1_AdvertiseField(this).forward
   * ast
   * }
   * 
   * }
   * 
   * @Label(label="Advertise Field")
   * @MappingType("call")
   * public static class InitP1_AdvertiseField extends CodeConcept<InitP1, ASTCallStmtNode> {
   * 
   * public String state
   * public String standardName
   * 
   * new(InitP1 parent) {
   * super(parent)
   * // defaults
   * state = _parent.paramImport
   * standardName = "StandardName"
   * }
   * 
   * override name() {
   * state + " / " + standardName
   * }
   * 
   * override List reverseMultiple() {
   * var retList = newArrayList()
   * 
   * var rs = '''call_(_cid, «parentID», 'NUOPC_StateAdvertiseField'),
   * callArgWithType(_, _cid, 1, _, _, _stateExpr),
   * callArgWithType(_, _cid, 2, _, _, _standardNameExpr).'''.execQuery
   * 
   * while (rs.next) {
   * var advField = new InitP1_AdvertiseField(_parent);
   * advField._id = rs.getLong("_cid")
   * advField.state = rs.getString("_stateExpr")
   * advField.standardName = rs.getString("_standardNameExpr")
   * retList.add(advField)
   * }
   * rs.close
   * 
   * retList
   * }
   * 
   * override forward() {
   * var IFortranAST ast = getAST
   * 
   * var code = '''
   * 
   * call NUOPC_StateAdvertiseField(«paramch(state)», '«paramch(standardName)»', rc=«_parent.paramRC»)
   * if (ESMF_LogFoundError(rcToCheck=«_parent.paramRC», msg=ESMF_LOGERR_PASSTHRU, &
   * line=__LINE__, &
   * file=__FILE__)) &
   * return  ! bail out
   * '''
   * val IASTListNode<IBodyConstruct> stmts = parseLiteralStatementSequence(code)
   * var ASTSubroutineSubprogramNode ssn = _parent.ASTRef
   * 
   * ssn.body.addAll(stmts)
   * // setASTRef(stmts.get(0) as ASTCallStmtNode)
   * ast
   * }
   * 
   * }
   * 
   * @Label(label="Initialize Phase 2")
   * @MappingType("subroutine")
   * public static class InitP2 extends EntryPointCodeConcept<Initialization> {
   * 
   * @Child(min=0, max=-1)
   * public List<InitP2_RealizeField> realizeFields
   * 
   * new(Initialization parent) {
   * super(parent, "IPDv00p2")
   * subroutineName = "InitializeP2"
   * methodType = "ESMF_METHOD_INITIALIZE"
   * }
   * 
   * override reverseChildren() {
   * realizeFields = new InitP2_RealizeField(this).reverseMultiple
   * this
   * }
   * 
   * override module() {
   * _parent._parent
   * }
   * 
   * override setServices() {
   * _parent._parent.setServices
   * }
   * 
   * }
   * 
   * @Label(label="Realize Field")
   * @MappingType("call")
   * public static class InitP2_RealizeField extends CodeConcept<InitP2, ASTCallStmtNode> {
   * 
   * public String state
   * public String field
   * 
   * new(InitP2 parent) {
   * super(parent)
   * // defaults
   * state = _parent.paramImport
   * field = "field"
   * }
   * 
   * override name() {
   * state + " / " + field
   * }
   * 
   * override List reverseMultiple() {
   * var retList = newArrayList()
   * 
   * var rs = '''call_(_cid, «parentID», 'NUOPC_StateRealizeField'),
   * callArgWithType(_, _cid, 1, _, _, _stateExpr),
   * callArgWithType(_, _cid, 2, _, _, _fieldExpr).'''.execQuery
   * 
   * while (rs.next) {
   * var relField = new InitP2_RealizeField(_parent);
   * relField._id = rs.getLong("_cid")
   * relField.state = rs.getString("_stateExpr")
   * relField.field = rs.getString("_fieldExpr")
   * retList.add(relField)
   * }
   * rs.close
   * 
   * retList
   * }
   * 
   * override forward() {
   * var IFortranAST ast = getAST
   * 
   * var code = '''
   * 
   * call NUOPC_StateRealizeField(«paramch(state)», field=«paramch(field)», rc=«_parent.paramRC»)
   * if (ESMF_LogFoundError(rcToCheck=«_parent.paramRC», msg=ESMF_LOGERR_PASSTHRU, &
   * line=__LINE__, &
   * file=__FILE__)) &
   * return  ! bail out
   * '''
   * val IASTListNode<IBodyConstruct> stmts = parseLiteralStatementSequence(code)
   * var ASTSubroutineSubprogramNode ssn = _parent.ASTRef
   * 
   * ssn.body.addAll(stmts)
   * ast
   * }
   * 
   * }
   */
  @Label(label = "SetClock")
  @MappingType("subroutine")
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
        NUOPCModel.RunPhases _runPhases = new NUOPCModel.RunPhases(this);
        NUOPCModel.RunPhases _reverse = _runPhases.reverse();
        this.runPhases = ((NUOPCModel.RunPhases) _reverse);
        NUOPCModel.RunSpecializations _runSpecializations = new NUOPCModel.RunSpecializations(this);
        CodeConcept<NUOPCModel.Run, ASTNode> _reverse_1 = _runSpecializations.reverse();
        this.runSpecs = ((NUOPCModel.RunSpecializations) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Specializations")
  public static class RunSpecializations extends CodeConcept<NUOPCModel.Run, ASTNode> {
    @Child(min = 0)
    public NUOPCModel.SetRunClock setRunClock;
    
    @Child(min = 0)
    public NUOPCModel.CheckImport checkImport;
    
    @Child
    public NUOPCModel.ModelAdvance modelAdvance;
    
    public RunSpecializations(final NUOPCModel.Run parent) {
      super(parent);
    }
    
    @Override
    public CodeConcept<NUOPCModel.Run, ASTNode> reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCModel.RunSpecializations reverseChildren() {
      NUOPCModel.RunSpecializations _xblockexpression = null;
      {
        NUOPCModel.ModelAdvance _modelAdvance = new NUOPCModel.ModelAdvance(this);
        SpecializationMethodCodeConcept<NUOPCModel.RunSpecializations> _reverse = _modelAdvance.reverse();
        this.modelAdvance = ((NUOPCModel.ModelAdvance) _reverse);
        NUOPCModel.SetRunClock _setRunClock = new NUOPCModel.SetRunClock(this);
        SpecializationMethodCodeConcept<NUOPCModel.RunSpecializations> _reverse_1 = _setRunClock.reverse();
        this.setRunClock = ((NUOPCModel.SetRunClock) _reverse_1);
        NUOPCModel.CheckImport _checkImport = new NUOPCModel.CheckImport(this);
        SpecializationMethodCodeConcept<NUOPCModel.RunSpecializations> _reverse_2 = _checkImport.reverse();
        this.checkImport = ((NUOPCModel.CheckImport) _reverse_2);
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
      NUOPCModel.RunPhases _xblockexpression = null;
      {
        NUOPCModel.RunPhase1 _runPhase1 = new NUOPCModel.RunPhase1(this);
        CodeConcept<NUOPCModel.RunPhases, ASTNode> _reverse = _runPhase1.reverse();
        this.p1 = ((NUOPCModel.RunPhase1) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Run Phase 1")
  @MappingType("subroutine-inherited")
  public static class RunPhase1 extends CodeConcept<NUOPCModel.RunPhases, ASTNode> {
    public RunPhase1(final NUOPCModel.RunPhases parent) {
      super(parent);
    }
  }
  
  @Label(label = "Advance")
  @MappingType("subroutine")
  public static class ModelAdvance extends SpecializationMethodCodeConcept<NUOPCModel.RunSpecializations> {
    public ModelAdvance(final NUOPCModel.RunSpecializations parent) {
      super(parent, "NUOPC_Model", "label_Advance");
      this.subroutineName = "ModelAdvance";
      this.specLabel = "model_label_Advance";
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
      _builder.append("! advance the model: currTime -> currTime + timeStep");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call NUOPC_ClockPrintCurrTime(clock, &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("\"------>Advancing ");
      _builder.append(this._parent._parent._parent.modelName, "        ");
      _builder.append(" from: \", rc=");
      _builder.append(this.paramRC, "        ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLine();
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
      _builder.append("call ESMF_ClockGet(clock, currTime=currTime, timeStep=timeStep, rc=");
      _builder.append(this.paramRC, "    ");
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
      _builder.append("call NUOPC_TimePrint(currTime + timeStep, &");
      _builder.newLine();
      _builder.append("        ");
      _builder.append("\"--------------------------------> to: \", rc=");
      _builder.append(this.paramRC, "        ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.append("if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &");
      _builder.newLine();
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
  public static class SetRunClock extends SpecializationMethodCodeConcept<NUOPCModel.RunSpecializations> {
    public SetRunClock(final NUOPCModel.RunSpecializations parent) {
      super(parent, "NUOPC_Model", "label_SetRunClock");
      this.subroutineName = "SetRunClock";
      this.specLabel = "model_label_SetRunClock";
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
  public static class CheckImport extends SpecializationMethodCodeConcept<NUOPCModel.RunSpecializations> {
    public CheckImport(final NUOPCModel.RunSpecializations parent) {
      super(parent, "NUOPC_Model", "label_CheckImport");
      this.subroutineName = "CheckImport";
      this.specLabel = "model_label_CheckImport";
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
  
  @Label(label = "Phases")
  public static class FinalizePhases extends CodeConcept<NUOPCModel.Finalize, ASTNode> {
    @Child
    public NUOPCModel.FinalizePhase1 p1;
    
    public FinalizePhases(final NUOPCModel.Finalize parent) {
      super(parent);
    }
    
    @Override
    public NUOPCModel.FinalizePhases reverse() {
      NUOPCModel.FinalizePhases _xblockexpression = null;
      {
        NUOPCModel.FinalizePhase1 _finalizePhase1 = new NUOPCModel.FinalizePhase1(this);
        CodeConcept<NUOPCModel.FinalizePhases, ASTNode> _reverse = _finalizePhase1.reverse();
        this.p1 = ((NUOPCModel.FinalizePhase1) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
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
    public CodeConcept<NUOPCModel.Finalize, ASTNode> reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCModel.FinalizeSpecializations reverseChildren() {
      NUOPCModel.FinalizeSpecializations _xblockexpression = null;
      {
        NUOPCModel.FinalizeModel _finalizeModel = new NUOPCModel.FinalizeModel(this);
        SpecializationMethodCodeConcept<NUOPCModel.FinalizeSpecializations> _reverse = _finalizeModel.reverse();
        this.finalize = ((NUOPCModel.FinalizeModel) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Finalize Phase 1")
  @MappingType("subroutine-inherited")
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
        NUOPCModel.FinalizePhases _finalizePhases = new NUOPCModel.FinalizePhases(this);
        NUOPCModel.FinalizePhases _reverse = _finalizePhases.reverse();
        this.finalPhases = ((NUOPCModel.FinalizePhases) _reverse);
        NUOPCModel.FinalizeSpecializations _finalizeSpecializations = new NUOPCModel.FinalizeSpecializations(this);
        CodeConcept<NUOPCModel.Finalize, ASTNode> _reverse_1 = _finalizeSpecializations.reverse();
        this.finalSpecs = ((NUOPCModel.FinalizeSpecializations) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "FinalizeModel")
  @MappingType("subroutine")
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
  
  public String modelName;
  
  public String filename;
  
  public String path;
  
  @Child
  public SetServicesCodeConcept<NUOPCModel> setServices;
  
  @Child
  public NUOPCModel.Initialization initialization;
  
  @Child
  public NUOPCModel.Run run;
  
  @Child
  public NUOPCModel.Finalize finalize;
  
  public NUOPCModel(final CodeDBIndex codeDB) {
    super(null);
    this._codeDB = codeDB;
  }
  
  @Override
  public String prefix() {
    return "model";
  }
  
  @Override
  public CodeConcept<CodeConcept<?, ?>, ASTModuleNode> reverse() {
    Object _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module(_moduleID, _compUnitID, _driverName), ");
      _builder.newLine();
      _builder.append("\t\t            ");
      _builder.append("compilationUnit(_compUnitID, _filename, _path),");
      _builder.newLine();
      _builder.append("   \t\t\t\t\t");
      _builder.append("uses(_uid, _mid, \'NUOPC_Model\').");
      ResultSet rs = this.execQuery(_builder);
      try {
        boolean _next = rs.next();
        if (_next) {
          long _long = rs.getLong("_moduleID");
          this._id = _long;
          String _string = rs.getString("_driverName");
          this.modelName = _string;
          String _string_1 = rs.getString("_filename");
          this.filename = _string_1;
          String _string_2 = rs.getString("_path");
          this.path = _string_2;
          long _long_1 = rs.getLong("_uid");
          NUOPCComponent.GenericImport _genericImport = new NUOPCComponent.GenericImport(this, _long_1);
          NUOPCComponent.GenericImport _reverse = _genericImport.reverse();
          this.importNUOPCGeneric = _reverse;
          rs.close();
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("uses(_uid, ");
          _builder_1.append(this._id, "");
          _builder_1.append(", \'ESMF\').");
          ResultSet _execQuery = this.execQuery(_builder_1);
          rs = _execQuery;
          boolean _next_1 = rs.next();
          if (_next_1) {
            long _long_2 = rs.getLong("_uid");
            BasicCodeConcept _newBasicCodeConcept = BasicCodeConcept.newBasicCodeConcept(this, _long_2);
            this.importESMF = _newBasicCodeConcept;
          }
          rs.close();
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("uses(_uid, ");
          _builder_2.append(this._id, "");
          _builder_2.append(", \'NUOPC\').");
          ResultSet _execQuery_1 = this.execQuery(_builder_2);
          rs = _execQuery_1;
          boolean _next_2 = rs.next();
          if (_next_2) {
            long _long_3 = rs.getLong("_uid");
            BasicCodeConcept _newBasicCodeConcept_1 = BasicCodeConcept.newBasicCodeConcept(this, _long_3);
            this.importNUOPC = _newBasicCodeConcept_1;
          }
          rs.close();
          return this.reverseChildren();
        }
      } catch (final Throwable _t) {
        if (_t instanceof SQLException) {
          final SQLException e = (SQLException)_t;
          CupidActivator.log("SQL error", e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = null;
    }
    return ((CodeConcept<CodeConcept<?, ?>, ASTModuleNode>)_xblockexpression);
  }
  
  public NUOPCModel reverseChildren() {
    NUOPCModel _xblockexpression = null;
    {
      SetServicesCodeConcept<NUOPCModel> _setServicesCodeConcept = new SetServicesCodeConcept<NUOPCModel>(this);
      SetServicesCodeConcept<NUOPCModel> _reverse = _setServicesCodeConcept.reverse();
      this.setServices = _reverse;
      NUOPCModel.Initialization _initialization = new NUOPCModel.Initialization(this);
      NUOPCModel.Initialization _reverse_1 = _initialization.reverse();
      this.initialization = _reverse_1;
      NUOPCModel.Run _run = new NUOPCModel.Run(this);
      NUOPCModel.Run _reverse_2 = _run.reverse();
      this.run = _reverse_2;
      NUOPCModel.Finalize _finalize = new NUOPCModel.Finalize(this);
      NUOPCModel.Finalize _reverse_3 = _finalize.reverse();
      this.finalize = _reverse_3;
      _xblockexpression = this;
    }
    return _xblockexpression;
  }
  
  @Override
  public String name() {
    return (((this.modelName + " (") + this.filename) + ")");
  }
}
