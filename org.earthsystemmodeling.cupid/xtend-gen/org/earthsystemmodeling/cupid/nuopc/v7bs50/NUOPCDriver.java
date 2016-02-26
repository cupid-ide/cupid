package org.earthsystemmodeling.cupid.nuopc.v7bs50;

import com.google.common.base.Objects;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.annotation.Prop;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.EntryPointCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.InternalEntryPointCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.NUOPCComponent;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.NUOPCModel;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.SetServicesCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs50.SpecializationMethodCodeConcept;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@Label(label = "NUOPC Driver")
@MappingType("module")
@SuppressWarnings("all")
public class NUOPCDriver extends NUOPCComponent {
  @Label(label = "Initialize Phase Definition")
  public static abstract class IPD extends CodeConcept<NUOPCDriver.InternalInitPhases, ASTNode> {
    @Label(label = "IPDv04p1 - Advertise Fields")
    @MappingType("subroutine")
    public static class IPDv04p1 extends InternalEntryPointCodeConcept<NUOPCDriver.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCModel.IPD.AdvertiseField> advertiseFields;
      
      public IPDv04p1(final NUOPCDriver.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
        this.subroutineName = "AdvertiseFields";
        this.methodType = "ESMF_METHOD_INITIALIZE";
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCDriver.IPD _parent = this._parent;
        boolean _matched = false;
        if (!_matched) {
          if (_parent instanceof NUOPCDriver.IPDv00) {
            _matched=true;
            _switchResult = "IPDv00p1";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCDriver.IPDv01) {
            _matched=true;
            _switchResult = "IPDv01p1";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCDriver.IPDv02) {
            _matched=true;
            _switchResult = "IPDv02p1";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCDriver.IPDv03) {
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
      public EntryPointCodeConcept<NUOPCDriver.IPD> reverseChildren() {
        NUOPCDriver.IPD.IPDv04p1 _xblockexpression = null;
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
    
    @Label(label = "IPDv04p2 - Modify CplList in Connectors")
    @MappingType("subroutine")
    public static class IPDv04p2 extends InternalEntryPointCodeConcept<NUOPCDriver.IPD> {
      public IPDv04p2(final NUOPCDriver.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
        this.subroutineName = "ModifyCplList";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        this.paramGridComp = "driver";
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCDriver.IPD _parent = this._parent;
        boolean _matched = false;
        if (!_matched) {
          if (_parent instanceof NUOPCDriver.IPDv01) {
            _matched=true;
            _switchResult = "IPDv01p2";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCDriver.IPDv02) {
            _matched=true;
            _switchResult = "IPDv02p2";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCDriver.IPDv03) {
            _matched=true;
            _switchResult = "IPDv03p2";
          }
        }
        if (!_matched) {
          _switchResult = "IPDv04p2";
        }
        return _switchResult;
      }
      
      @Override
      public EntryPointCodeConcept<NUOPCDriver.IPD> reverseChildren() {
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
      
      @Override
      public String subroutineTemplate() {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\t\t\t\t");
        _builder.newLine();
        _builder.append("recursive subroutine ");
        _builder.append(this.subroutineName, "");
        _builder.append("(");
        _builder.append(this.paramGridComp, "");
        _builder.append(", ");
        _builder.append(this.paramImport, "");
        _builder.append(", ");
        _builder.append(this.paramExport, "");
        _builder.append(", ");
        _builder.append(this.paramClock, "");
        _builder.append(", ");
        _builder.append(this.paramRC, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("type(ESMF_GridComp)  :: ");
        _builder.append(this.paramGridComp, "    ");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("type(ESMF_State)     :: ");
        _builder.append(this.paramImport, "    ");
        _builder.append(", ");
        _builder.append(this.paramExport, "    ");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("type(ESMF_Clock)     :: ");
        _builder.append(this.paramClock, "    ");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("integer, intent(out) :: ");
        _builder.append(this.paramRC, "    ");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("type(ESMF_CplComp), pointer     :: connectorList(:)");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("integer                         :: i, j, cplListSize");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("character(len=160), allocatable :: cplList(:)");
        _builder.newLine();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("rc = ESMF_SUCCESS");
        _builder.newLine();
        _builder.newLine();
        _builder.append("    ");
        _builder.append("nullify(connectorList)");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("call NUOPC_DriverGetComp(");
        _builder.append(this.paramGridComp, "    ");
        _builder.append(", compList=connectorList, rc=rc)");
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
        _builder.append("     ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("do i=1, size(connectorList)");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("! query the cplList for connector i");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("call NUOPC_CompAttributeGet(connectorList(i), name=\"CplList\", &");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("itemCount=cplListSize, rc=rc)");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("line=__LINE__, &");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("file=__FILE__)) &");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("return  ! bail out");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("if (cplListSize>0) then");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("allocate(cplList(cplListSize))");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("call NUOPC_CompAttributeGet(connectorList(i), name=\"CplList\", &");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("valueList=cplList, rc=rc)");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("line=__LINE__, &");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("file=__FILE__)) &");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("return  ! bail out");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("! go through all of the entries in the cplList");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("do j=1, cplListSize");
        _builder.newLine();
        _builder.append("            \t");
        _builder.append("! example of modifying a cplList entry");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("!if (trim(cplList(j))==\"air_pressure_at_sea_level\") then");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("!    ! switch from default regrid to redist");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("!    cplList(j) = trim(cplList(j))//\":REMAPMETHOD=redist\"");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("!endif");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("enddo");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("! store the modified cplList in CplList attribute of connector i");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("call NUOPC_CompAttributeSet(connectorList(i), &");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("name=\"CplList\", valueList=cplList, rc=rc)");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("line=__LINE__, &");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("file=__FILE__)) &");
        _builder.newLine();
        _builder.append("                ");
        _builder.append("return  ! bail out");
        _builder.newLine();
        _builder.append("            ");
        _builder.append("deallocate(cplList)");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("endif");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("enddo");
        _builder.newLine();
        _builder.append("  ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("deallocate(connectorList)");
        _builder.newLine();
        _builder.newLine();
        _builder.append("end subroutine\t\t\t\t");
        _builder.newLine();
        return _builder.toString();
      }
    }
    
    @Label(label = "IPDv04p3 - Realize Fields Providing Geom Object")
    @MappingType("subroutine")
    public static class IPDv04p3 extends InternalEntryPointCodeConcept<NUOPCDriver.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCModel.IPD.RealizeField> realizeFields;
      
      public IPDv04p3(final NUOPCDriver.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
        this.subroutineName = "RealizeFieldsProvidingGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCDriver.IPD _parent = this._parent;
        boolean _matched = false;
        if (!_matched) {
          if (_parent instanceof NUOPCDriver.IPDv00) {
            _matched=true;
            _switchResult = "IPDv00p2";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCDriver.IPDv01) {
            _matched=true;
            _switchResult = "IPDv01p3";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCDriver.IPDv02) {
            _matched=true;
            _switchResult = "IPDv02p3";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCDriver.IPDv03) {
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
      public EntryPointCodeConcept<NUOPCDriver.IPD> reverseChildren() {
        NUOPCDriver.IPD.IPDv04p3 _xblockexpression = null;
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
    public static class IPDv04p4 extends InternalEntryPointCodeConcept<NUOPCDriver.IPD> {
      public IPDv04p4(final NUOPCDriver.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
        this.subroutineName = "ModifyDistGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCDriver.IPD _parent = this._parent;
        boolean _matched = false;
        if (!_matched) {
          if (_parent instanceof NUOPCDriver.IPDv03) {
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
      public EntryPointCodeConcept<NUOPCDriver.IPD> reverseChildren() {
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
    public static class IPDv04p5 extends InternalEntryPointCodeConcept<NUOPCDriver.IPD> {
      public IPDv04p5(final NUOPCDriver.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
        this.subroutineName = "RealizeFieldsAcceptingGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCDriver.IPD _parent = this._parent;
        boolean _matched = false;
        if (!_matched) {
          if (_parent instanceof NUOPCDriver.IPDv03) {
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
      public EntryPointCodeConcept<NUOPCDriver.IPD> reverseChildren() {
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
    
    @Label(label = "IPDv04p6 - Unspecified by NUOPC")
    @MappingType("subroutine-inherited")
    public static class IPDv04p6 extends CodeConcept<NUOPCDriver.IPD, ASTNode> {
      public IPDv04p6(final NUOPCDriver.IPD parent) {
        super(parent);
      }
    }
    
    @Label(label = "IPDv04p7 - Unspecified by NUOPC")
    @MappingType("subroutine-inherited")
    public static class IPDv04p7 extends CodeConcept<NUOPCDriver.IPD, ASTNode> {
      public IPDv04p7(final NUOPCDriver.IPD parent) {
        super(parent);
      }
    }
    
    public IPD(final NUOPCDriver.InternalInitPhases parent) {
      super(parent);
    }
  }
  
  @Label(label = "Initialize Phase Definition (v00)")
  public static class IPDv00 extends NUOPCDriver.IPD {
    @Child(min = 0)
    @Label(label = "IPDv00p1 - Advertise Fields")
    public NUOPCDriver.IPD.IPDv04p1 ipdv00p1;
    
    @Child(min = 0)
    @Label(label = "IPDv00p2 - Realize Fields")
    public NUOPCDriver.IPD.IPDv04p3 ipdv00p2;
    
    @Child(min = 0)
    @Label(label = "IPDv00p3 - Unspecified by NUOPC")
    public NUOPCDriver.IPD.IPDv04p6 ipdv00p3;
    
    @Child(min = 0)
    @Label(label = "IPDv00p4 - Unspecified by NUOPC")
    public NUOPCDriver.IPD.IPDv04p7 ipdv00p4;
    
    public IPDv00(final NUOPCDriver.InternalInitPhases parent) {
      super(parent);
    }
    
    @Override
    public NUOPCDriver.IPDv00 reverse() {
      NUOPCDriver.IPDv00 _xblockexpression = null;
      {
        NUOPCDriver.IPD.IPDv04p1 _iPDv04p1 = new NUOPCDriver.IPD.IPDv04p1(this);
        CodeConcept<?, ?> _reverse = _iPDv04p1.reverse();
        this.ipdv00p1 = ((NUOPCDriver.IPD.IPDv04p1) _reverse);
        NUOPCDriver.IPD.IPDv04p3 _iPDv04p3 = new NUOPCDriver.IPD.IPDv04p3(this);
        CodeConcept<?, ?> _reverse_1 = _iPDv04p3.reverse();
        this.ipdv00p2 = ((NUOPCDriver.IPD.IPDv04p3) _reverse_1);
        NUOPCDriver.IPD.IPDv04p6 _iPDv04p6 = new NUOPCDriver.IPD.IPDv04p6(this);
        CodeConcept<?, ?> _reverse_2 = _iPDv04p6.<CodeConcept<?, ?>>reverse();
        this.ipdv00p3 = ((NUOPCDriver.IPD.IPDv04p6) _reverse_2);
        NUOPCDriver.IPD.IPDv04p7 _iPDv04p7 = new NUOPCDriver.IPD.IPDv04p7(this);
        CodeConcept<?, ?> _reverse_3 = _iPDv04p7.<CodeConcept<?, ?>>reverse();
        this.ipdv00p4 = ((NUOPCDriver.IPD.IPDv04p7) _reverse_3);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Initialize Phase Definition (v01)")
  public static class IPDv01 extends NUOPCDriver.IPD {
    @Child(min = 0)
    @Label(label = "IPDv01p1 - Advertise Fields")
    public NUOPCDriver.IPD.IPDv04p1 ipdv01p1;
    
    @Child(min = 0)
    @Label(label = "IPDv01p2 - Modify CplList in Connectors")
    public NUOPCDriver.IPD.IPDv04p2 ipdv01p2;
    
    @Child(min = 0)
    @Label(label = "IPDv01p3 - Realize Fields")
    public NUOPCDriver.IPD.IPDv04p3 ipdv01p3;
    
    @Child(min = 0)
    @Label(label = "IPDv01p4 - Unspecified by NUOPC")
    public NUOPCDriver.IPD.IPDv04p6 ipdv01p4;
    
    @Child(min = 0)
    @Label(label = "IPDv01p5 - Unspecified by NUOPC")
    public NUOPCDriver.IPD.IPDv04p7 ipdv01p5;
    
    public IPDv01(final NUOPCDriver.InternalInitPhases parent) {
      super(parent);
    }
    
    @Override
    public NUOPCDriver.IPDv01 reverse() {
      NUOPCDriver.IPDv01 _xblockexpression = null;
      {
        NUOPCDriver.IPD.IPDv04p1 _iPDv04p1 = new NUOPCDriver.IPD.IPDv04p1(this);
        CodeConcept<?, ?> _reverse = _iPDv04p1.reverse();
        this.ipdv01p1 = ((NUOPCDriver.IPD.IPDv04p1) _reverse);
        NUOPCDriver.IPD.IPDv04p2 _iPDv04p2 = new NUOPCDriver.IPD.IPDv04p2(this);
        CodeConcept<?, ?> _reverse_1 = _iPDv04p2.reverse();
        this.ipdv01p2 = ((NUOPCDriver.IPD.IPDv04p2) _reverse_1);
        NUOPCDriver.IPD.IPDv04p3 _iPDv04p3 = new NUOPCDriver.IPD.IPDv04p3(this);
        CodeConcept<?, ?> _reverse_2 = _iPDv04p3.reverse();
        this.ipdv01p3 = ((NUOPCDriver.IPD.IPDv04p3) _reverse_2);
        NUOPCDriver.IPD.IPDv04p6 _iPDv04p6 = new NUOPCDriver.IPD.IPDv04p6(this);
        CodeConcept<?, ?> _reverse_3 = _iPDv04p6.<CodeConcept<?, ?>>reverse();
        this.ipdv01p4 = ((NUOPCDriver.IPD.IPDv04p6) _reverse_3);
        NUOPCDriver.IPD.IPDv04p7 _iPDv04p7 = new NUOPCDriver.IPD.IPDv04p7(this);
        CodeConcept<?, ?> _reverse_4 = _iPDv04p7.<CodeConcept<?, ?>>reverse();
        this.ipdv01p5 = ((NUOPCDriver.IPD.IPDv04p7) _reverse_4);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Initialize Phase Definition (v02)")
  public static class IPDv02 extends NUOPCDriver.IPD {
    public IPDv02(final NUOPCDriver.InternalInitPhases parent) {
      super(parent);
    }
    
    @Child(min = 0)
    @Label(label = "IPDv02p1 - Advertise Fields")
    public NUOPCDriver.IPD.IPDv04p1 ipdv02p1;
    
    @Child(min = 0)
    @Label(label = "IPDv02p2 - Modify CplList in Connectors")
    public NUOPCDriver.IPD.IPDv04p2 ipdv02p2;
    
    @Child(min = 0)
    @Label(label = "IPDv02p3 - Realize Fields Providing Geom Object")
    public NUOPCDriver.IPD.IPDv04p3 ipdv02p3;
    
    @Child(min = 0)
    @Label(label = "IPDv02p4 - Unspecified by NUOPC")
    public NUOPCDriver.IPD.IPDv04p6 ipdv02p4;
    
    @Child(min = 0)
    @Label(label = "IPDv02p5 - Unspecified by NUOPC")
    public NUOPCDriver.IPD.IPDv04p7 ipdv02p5;
    
    @Override
    public NUOPCDriver.IPDv02 reverse() {
      NUOPCDriver.IPDv02 _xblockexpression = null;
      {
        NUOPCDriver.IPD.IPDv04p1 _iPDv04p1 = new NUOPCDriver.IPD.IPDv04p1(this);
        CodeConcept<?, ?> _reverse = _iPDv04p1.reverse();
        this.ipdv02p1 = ((NUOPCDriver.IPD.IPDv04p1) _reverse);
        NUOPCDriver.IPD.IPDv04p2 _iPDv04p2 = new NUOPCDriver.IPD.IPDv04p2(this);
        CodeConcept<?, ?> _reverse_1 = _iPDv04p2.reverse();
        this.ipdv02p2 = ((NUOPCDriver.IPD.IPDv04p2) _reverse_1);
        NUOPCDriver.IPD.IPDv04p3 _iPDv04p3 = new NUOPCDriver.IPD.IPDv04p3(this);
        CodeConcept<?, ?> _reverse_2 = _iPDv04p3.reverse();
        this.ipdv02p3 = ((NUOPCDriver.IPD.IPDv04p3) _reverse_2);
        NUOPCDriver.IPD.IPDv04p6 _iPDv04p6 = new NUOPCDriver.IPD.IPDv04p6(this);
        CodeConcept<?, ?> _reverse_3 = _iPDv04p6.<CodeConcept<?, ?>>reverse();
        this.ipdv02p4 = ((NUOPCDriver.IPD.IPDv04p6) _reverse_3);
        NUOPCDriver.IPD.IPDv04p7 _iPDv04p7 = new NUOPCDriver.IPD.IPDv04p7(this);
        CodeConcept<?, ?> _reverse_4 = _iPDv04p7.<CodeConcept<?, ?>>reverse();
        this.ipdv02p5 = ((NUOPCDriver.IPD.IPDv04p7) _reverse_4);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Initialize Phase Definition (v03)")
  public static class IPDv03 extends NUOPCDriver.IPD {
    public IPDv03(final NUOPCDriver.InternalInitPhases parent) {
      super(parent);
    }
    
    @Child(min = 0)
    @Label(label = "IPDv03p1 - Advertise Fields")
    public NUOPCDriver.IPD.IPDv04p1 ipdv03p1;
    
    @Child(min = 0)
    @Label(label = "IPDv03p2 - Modify CplList in Connectors")
    public NUOPCDriver.IPD.IPDv04p2 ipdv03p2;
    
    @Child(min = 0)
    @Label(label = "IPDv03p3 - Realize Fields Providing Geom Object")
    public NUOPCDriver.IPD.IPDv04p3 ipdv03p3;
    
    @Child(min = 0)
    @Label(label = "IPDv03p4 - Modify Decomposition of Accepted Geom Object")
    public NUOPCDriver.IPD.IPDv04p4 ipdv03p4;
    
    @Child(min = 0)
    @Label(label = "IPDv03p5 - Realize Fields Accepting Geom Object")
    public NUOPCDriver.IPD.IPDv04p5 ipdv03p5;
    
    @Child(min = 0)
    @Label(label = "IPDv03p6 - Unspecified by NUOPC")
    public NUOPCDriver.IPD.IPDv04p6 ipdv03p6;
    
    @Child(min = 0)
    @Label(label = "IPDv03p7 - Unspecified by NUOPC")
    public NUOPCDriver.IPD.IPDv04p7 ipdv03p7;
    
    @Override
    public NUOPCDriver.IPDv03 reverse() {
      NUOPCDriver.IPDv03 _xblockexpression = null;
      {
        NUOPCDriver.IPD.IPDv04p1 _iPDv04p1 = new NUOPCDriver.IPD.IPDv04p1(this);
        CodeConcept<?, ?> _reverse = _iPDv04p1.reverse();
        this.ipdv03p1 = ((NUOPCDriver.IPD.IPDv04p1) _reverse);
        NUOPCDriver.IPD.IPDv04p2 _iPDv04p2 = new NUOPCDriver.IPD.IPDv04p2(this);
        CodeConcept<?, ?> _reverse_1 = _iPDv04p2.reverse();
        this.ipdv03p2 = ((NUOPCDriver.IPD.IPDv04p2) _reverse_1);
        NUOPCDriver.IPD.IPDv04p3 _iPDv04p3 = new NUOPCDriver.IPD.IPDv04p3(this);
        CodeConcept<?, ?> _reverse_2 = _iPDv04p3.reverse();
        this.ipdv03p3 = ((NUOPCDriver.IPD.IPDv04p3) _reverse_2);
        NUOPCDriver.IPD.IPDv04p4 _iPDv04p4 = new NUOPCDriver.IPD.IPDv04p4(this);
        CodeConcept<?, ?> _reverse_3 = _iPDv04p4.reverse();
        this.ipdv03p4 = ((NUOPCDriver.IPD.IPDv04p4) _reverse_3);
        NUOPCDriver.IPD.IPDv04p5 _iPDv04p5 = new NUOPCDriver.IPD.IPDv04p5(this);
        CodeConcept<?, ?> _reverse_4 = _iPDv04p5.reverse();
        this.ipdv03p5 = ((NUOPCDriver.IPD.IPDv04p5) _reverse_4);
        NUOPCDriver.IPD.IPDv04p6 _iPDv04p6 = new NUOPCDriver.IPD.IPDv04p6(this);
        CodeConcept<?, ?> _reverse_5 = _iPDv04p6.<CodeConcept<?, ?>>reverse();
        this.ipdv03p6 = ((NUOPCDriver.IPD.IPDv04p6) _reverse_5);
        NUOPCDriver.IPD.IPDv04p7 _iPDv04p7 = new NUOPCDriver.IPD.IPDv04p7(this);
        CodeConcept<?, ?> _reverse_6 = _iPDv04p7.<CodeConcept<?, ?>>reverse();
        this.ipdv03p7 = ((NUOPCDriver.IPD.IPDv04p7) _reverse_6);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Initialize Phase Definition (v04)")
  public static class IPDv04 extends NUOPCDriver.IPD {
    public IPDv04(final NUOPCDriver.InternalInitPhases parent) {
      super(parent);
    }
    
    @Child(min = 0)
    public NUOPCDriver.IPD.IPDv04p1 ipdv04p1;
    
    @Child(min = 0)
    public NUOPCDriver.IPD.IPDv04p2 ipdv04p2;
    
    @Child(min = 0)
    public NUOPCDriver.IPD.IPDv04p3 ipdv04p3;
    
    @Child(min = 0)
    public NUOPCDriver.IPD.IPDv04p4 ipdv04p4;
    
    @Child(min = 0)
    public NUOPCDriver.IPD.IPDv04p5 ipdv04p5;
    
    @Child(min = 0)
    public NUOPCDriver.IPD.IPDv04p6 ipdv04p6;
    
    @Child(min = 0)
    public NUOPCDriver.IPD.IPDv04p7 ipdv04p7;
    
    @Override
    public NUOPCDriver.IPDv04 reverse() {
      NUOPCDriver.IPDv04 _xblockexpression = null;
      {
        NUOPCDriver.IPD.IPDv04p1 _iPDv04p1 = new NUOPCDriver.IPD.IPDv04p1(this);
        CodeConcept<?, ?> _reverse = _iPDv04p1.reverse();
        this.ipdv04p1 = ((NUOPCDriver.IPD.IPDv04p1) _reverse);
        NUOPCDriver.IPD.IPDv04p2 _iPDv04p2 = new NUOPCDriver.IPD.IPDv04p2(this);
        CodeConcept<?, ?> _reverse_1 = _iPDv04p2.reverse();
        this.ipdv04p2 = ((NUOPCDriver.IPD.IPDv04p2) _reverse_1);
        NUOPCDriver.IPD.IPDv04p3 _iPDv04p3 = new NUOPCDriver.IPD.IPDv04p3(this);
        CodeConcept<?, ?> _reverse_2 = _iPDv04p3.reverse();
        this.ipdv04p3 = ((NUOPCDriver.IPD.IPDv04p3) _reverse_2);
        NUOPCDriver.IPD.IPDv04p4 _iPDv04p4 = new NUOPCDriver.IPD.IPDv04p4(this);
        CodeConcept<?, ?> _reverse_3 = _iPDv04p4.reverse();
        this.ipdv04p4 = ((NUOPCDriver.IPD.IPDv04p4) _reverse_3);
        NUOPCDriver.IPD.IPDv04p5 _iPDv04p5 = new NUOPCDriver.IPD.IPDv04p5(this);
        CodeConcept<?, ?> _reverse_4 = _iPDv04p5.reverse();
        this.ipdv04p5 = ((NUOPCDriver.IPD.IPDv04p5) _reverse_4);
        NUOPCDriver.IPD.IPDv04p6 _iPDv04p6 = new NUOPCDriver.IPD.IPDv04p6(this);
        CodeConcept<?, ?> _reverse_5 = _iPDv04p6.<CodeConcept<?, ?>>reverse();
        this.ipdv04p6 = ((NUOPCDriver.IPD.IPDv04p6) _reverse_5);
        NUOPCDriver.IPD.IPDv04p7 _iPDv04p7 = new NUOPCDriver.IPD.IPDv04p7(this);
        CodeConcept<?, ?> _reverse_6 = _iPDv04p7.<CodeConcept<?, ?>>reverse();
        this.ipdv04p7 = ((NUOPCDriver.IPD.IPDv04p7) _reverse_6);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Internal Phases")
  public static class InternalInitPhases extends CodeConcept<NUOPCDriver.Initialization, ASTNode> {
    @Child
    public NUOPCDriver.IPDv00 ipdv00;
    
    @Child
    public NUOPCDriver.IPDv01 ipdv01;
    
    @Child
    public NUOPCDriver.IPDv02 ipdv02;
    
    @Child
    public NUOPCDriver.IPDv03 ipdv03;
    
    @Child
    public NUOPCDriver.IPDv04 ipdv04;
    
    public InternalInitPhases(final NUOPCDriver.Initialization parent) {
      super(parent);
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      NUOPCDriver.InternalInitPhases _xblockexpression = null;
      {
        NUOPCDriver.IPDv00 _iPDv00 = new NUOPCDriver.IPDv00(this);
        NUOPCDriver.IPDv00 _reverse = _iPDv00.reverse();
        this.ipdv00 = _reverse;
        NUOPCDriver.IPDv01 _iPDv01 = new NUOPCDriver.IPDv01(this);
        NUOPCDriver.IPDv01 _reverse_1 = _iPDv01.reverse();
        this.ipdv01 = _reverse_1;
        NUOPCDriver.IPDv02 _iPDv02 = new NUOPCDriver.IPDv02(this);
        NUOPCDriver.IPDv02 _reverse_2 = _iPDv02.reverse();
        this.ipdv02 = _reverse_2;
        NUOPCDriver.IPDv03 _iPDv03 = new NUOPCDriver.IPDv03(this);
        NUOPCDriver.IPDv03 _reverse_3 = _iPDv03.reverse();
        this.ipdv03 = _reverse_3;
        NUOPCDriver.IPDv04 _iPDv04 = new NUOPCDriver.IPDv04(this);
        NUOPCDriver.IPDv04 _reverse_4 = _iPDv04.reverse();
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
  
  @Label(label = "Phases")
  public static class InitPhases extends CodeConcept<NUOPCDriver.Initialization, ASTNode> {
    @Label(label = "Phase 1")
    @MappingType("subroutine-inherited")
    public static class InitP1 extends CodeConcept<NUOPCDriver.InitPhases, ASTNode> {
      public InitP1(final NUOPCDriver.InitPhases parent) {
        super(parent);
      }
    }
    
    @Child
    public NUOPCDriver.InitPhases.InitP1 initP1;
    
    public InitPhases(final NUOPCDriver.Initialization parent) {
      super(parent);
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      NUOPCDriver.InitPhases _xblockexpression = null;
      {
        NUOPCDriver.InitPhases.InitP1 _initP1 = new NUOPCDriver.InitPhases.InitP1(this);
        CodeConcept<?, ?> _reverse = _initP1.<CodeConcept<?, ?>>reverse();
        this.initP1 = ((NUOPCDriver.InitPhases.InitP1) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Initialize")
  public static class Initialization extends CodeConcept<NUOPCDriver, ASTNode> {
    @Child
    public NUOPCDriver.InitPhases initPhases;
    
    @Child
    public NUOPCDriver.InternalInitPhases internalInitPhases;
    
    @Child
    public NUOPCDriver.InitSpecializations initSpecs;
    
    public Initialization(final NUOPCDriver parent) {
      super(parent);
    }
    
    @Override
    public NUOPCDriver.Initialization reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCDriver.Initialization reverseChildren() {
      NUOPCDriver.Initialization _xblockexpression = null;
      {
        NUOPCDriver.InitPhases _initPhases = new NUOPCDriver.InitPhases(this);
        CodeConcept<?, ?> _reverse = _initPhases.reverse();
        this.initPhases = ((NUOPCDriver.InitPhases) _reverse);
        NUOPCDriver.InternalInitPhases _internalInitPhases = new NUOPCDriver.InternalInitPhases(this);
        CodeConcept<?, ?> _reverse_1 = _internalInitPhases.reverse();
        this.internalInitPhases = ((NUOPCDriver.InternalInitPhases) _reverse_1);
        NUOPCDriver.InitSpecializations _initSpecializations = new NUOPCDriver.InitSpecializations(this);
        NUOPCDriver.InitSpecializations _reverse_2 = _initSpecializations.reverse();
        this.initSpecs = ((NUOPCDriver.InitSpecializations) _reverse_2);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Specializations")
  public static class InitSpecializations extends CodeConcept<NUOPCDriver.Initialization, ASTNode> {
    @Child
    public NUOPCDriver.SetModelServices setModelServices;
    
    @Child(min = 0)
    public NUOPCDriver.SetRunSequence setRunSequence;
    
    @Child(min = 0)
    public NUOPCDriver.ModifyInitializePhaseMap modifyInitializePhaseMap;
    
    public InitSpecializations(final NUOPCDriver.Initialization parent) {
      super(parent);
    }
    
    @Override
    public NUOPCDriver.InitSpecializations reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCDriver.InitSpecializations reverseChildren() {
      NUOPCDriver.InitSpecializations _xblockexpression = null;
      {
        NUOPCDriver.SetModelServices _setModelServices = new NUOPCDriver.SetModelServices(this);
        SpecializationMethodCodeConcept<NUOPCDriver.InitSpecializations> _reverse = _setModelServices.reverse();
        this.setModelServices = ((NUOPCDriver.SetModelServices) _reverse);
        NUOPCDriver.SetRunSequence _setRunSequence = new NUOPCDriver.SetRunSequence(this);
        SpecializationMethodCodeConcept<NUOPCDriver.InitSpecializations> _reverse_1 = _setRunSequence.reverse();
        this.setRunSequence = ((NUOPCDriver.SetRunSequence) _reverse_1);
        NUOPCDriver.ModifyInitializePhaseMap _modifyInitializePhaseMap = new NUOPCDriver.ModifyInitializePhaseMap(this);
        SpecializationMethodCodeConcept<NUOPCDriver.InitSpecializations> _reverse_2 = _modifyInitializePhaseMap.reverse();
        this.modifyInitializePhaseMap = ((NUOPCDriver.ModifyInitializePhaseMap) _reverse_2);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  /**
   * @Label(label="SetModelCount", type="subroutine")
   * public static class SetModelCount extends SpecializationMethodCodeConcept<Initialization> {
   * 
   * new(Initialization parent) {
   * super(parent, "NUOPC_Driver", "label_SetModelCount")
   * 
   * //defaults
   * subroutineName = "SetModelCount"
   * specLabel = "driver_label_SetModelCount"
   * paramGridComp = "driver"
   * paramRC = "rc"
   * }
   * 
   * override subroutineTemplate() {
   * '''
   * 
   * subroutine «subroutineName»(«paramGridComp», «paramRC»)
   * type(ESMF_GridComp)  :: «paramGridComp»
   * integer, intent(out) :: «paramRC»
   * 
   * rc = ESMF_SUCCESS
   * 
   * ! set the modelCount
   * call NUOPC_DriverSet(driver, modelCount=1, rc=rc)
   * if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &
   * line=__LINE__, &
   * file=__FILE__)) &
   * return  ! bail out
   * 
   * end subroutine
   * '''
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
   * override genericUse() {
   * _parent._parent.importNUOPCGeneric
   * }
   * 
   * }
   */
  @Label(label = "SetModelServices")
  @MappingType("subroutine")
  public static class SetModelServices extends SpecializationMethodCodeConcept<NUOPCDriver.InitSpecializations> {
    @Child(max = (-1))
    public List<NUOPCDriver.SetModelServices_AddComp> addComps;
    
    @Label(label = "SetClock")
    @MappingType("call")
    @Child
    public BasicCodeConcept setClock;
    
    public SetModelServices(final NUOPCDriver.InitSpecializations parent) {
      super(parent, "NUOPC_Driver", "label_SetModelServices");
      this.subroutineName = "SetModelServices";
      this.specLabel = "driver_label_SetModelServices";
    }
    
    @Override
    public SpecializationMethodCodeConcept<NUOPCDriver.InitSpecializations> reverse() {
      try {
        NUOPCDriver.SetModelServices _xifexpression = null;
        SpecializationMethodCodeConcept<NUOPCDriver.InitSpecializations> _reverse = super.reverse();
        boolean _equals = Objects.equal(this, _reverse);
        if (_equals) {
          NUOPCDriver.SetModelServices _xblockexpression = null;
          {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("call_(_cid, ");
            _builder.append(this._id, "");
            _builder.append(", \'ESMF_GridCompSet\'),");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t\t\t");
            _builder.append("callArgWithType(_, _cid, _, \'clock\', _, _clockExpr).");
            ResultSet rs = this.execQuery(_builder);
            boolean _next = rs.next();
            if (_next) {
              long _long = rs.getLong("_cid");
              BasicCodeConcept _newBasicCodeConcept = BasicCodeConcept.newBasicCodeConcept(this, _long);
              this.setClock = _newBasicCodeConcept;
            }
            _xblockexpression = this;
          }
          _xifexpression = _xblockexpression;
        } else {
          _xifexpression = null;
        }
        return _xifexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    @Override
    public SpecializationMethodCodeConcept<NUOPCDriver.InitSpecializations> reverseChildren() {
      NUOPCDriver.SetModelServices _xblockexpression = null;
      {
        NUOPCDriver.SetModelServices_AddComp _setModelServices_AddComp = new NUOPCDriver.SetModelServices_AddComp(this);
        List _reverseMultiple = _setModelServices_AddComp.reverseMultiple();
        this.addComps = ((List<NUOPCDriver.SetModelServices_AddComp>) _reverseMultiple);
        _xblockexpression = this;
      }
      return _xblockexpression;
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
    
    @Override
    public IFortranAST forward() {
      IFortranAST _xblockexpression = null;
      {
        final IFortranAST ast = super.forward();
        final ASTSubroutineSubprogramNode ssn = this.getASTRef();
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("type(ESMF_Time)            :: startTime");
        _builder.newLine();
        _builder.append("type(ESMF_Time)            :: stopTime");
        _builder.newLine();
        _builder.append("type(ESMF_TimeInterval)    :: timeStep");
        _builder.newLine();
        _builder.append("type(ESMF_Clock)           :: internalClock");
        _builder.newLine();
        _builder.newLine();
        String code = _builder.toString();
        final IASTListNode<IBodyConstruct> typeNodes = CodeExtraction.parseLiteralStatementSequence(code);
        final ASTTypeDeclarationStmtNode last = ssn.<ASTTypeDeclarationStmtNode>findLast(ASTTypeDeclarationStmtNode.class);
        boolean _notEquals = (!Objects.equal(last, null));
        if (_notEquals) {
          List<IBodyConstruct> _reverse = ListExtensions.<IBodyConstruct>reverse(typeNodes);
          for (final IBodyConstruct typeNode : _reverse) {
            IASTListNode<IBodyConstruct> _body = ssn.getBody();
            _body.insertAfter(last, typeNode);
          }
        } else {
          IASTListNode<IBodyConstruct> _body_1 = ssn.getBody();
          _body_1.addAll(typeNodes);
        }
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.newLine();
        _builder_1.append("! call into SetServices for all Model, Mediator, and Connector components");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("! set the model clock");
        _builder_1.newLine();
        _builder_1.append("call ESMF_TimeIntervalSet(timeStep, m=");
        CharSequence _paramint = this.paramint(15);
        _builder_1.append(_paramint, "");
        _builder_1.append(", rc=");
        _builder_1.append(this.paramRC, "");
        _builder_1.append(") ! 15 minute steps");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("if (ESMF_LogFoundError(rcToCheck=");
        _builder_1.append(this.paramRC, "");
        _builder_1.append(", msg=ESMF_LOGERR_PASSTHRU, &");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("  ");
        _builder_1.append("line=__LINE__, &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("file=__FILE__)) &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("return");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("call ESMF_TimeSet(startTime, yy=");
        CharSequence _paramint_1 = this.paramint(2010);
        _builder_1.append(_paramint_1, "");
        _builder_1.append(", mm=");
        CharSequence _paramint_2 = this.paramint(6);
        _builder_1.append(_paramint_2, "");
        _builder_1.append(", dd=");
        CharSequence _paramint_3 = this.paramint(1);
        _builder_1.append(_paramint_3, "");
        _builder_1.append(", h=");
        CharSequence _paramint_4 = this.paramint(0);
        _builder_1.append(_paramint_4, "");
        _builder_1.append(", m=");
        CharSequence _paramint_5 = this.paramint(0);
        _builder_1.append(_paramint_5, "");
        _builder_1.append(", rc=");
        _builder_1.append(this.paramRC, "");
        _builder_1.append(")");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("if (ESMF_LogFoundError(rcToCheck=");
        _builder_1.append(this.paramRC, "");
        _builder_1.append(", msg=ESMF_LOGERR_PASSTHRU, &");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("  ");
        _builder_1.append("line=__LINE__, &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("file=__FILE__)) &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("return");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("call ESMF_TimeSet(stopTime, yy=");
        CharSequence _paramint_6 = this.paramint(2010);
        _builder_1.append(_paramint_6, "");
        _builder_1.append(", mm=");
        CharSequence _paramint_7 = this.paramint(6);
        _builder_1.append(_paramint_7, "");
        _builder_1.append(", dd=");
        CharSequence _paramint_8 = this.paramint(1);
        _builder_1.append(_paramint_8, "");
        _builder_1.append(", h=");
        CharSequence _paramint_9 = this.paramint(1);
        _builder_1.append(_paramint_9, "");
        _builder_1.append(", m=");
        CharSequence _paramint_10 = this.paramint(0);
        _builder_1.append(_paramint_10, "");
        _builder_1.append(", rc=");
        _builder_1.append(this.paramRC, "");
        _builder_1.append(")");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("if (ESMF_LogFoundError(rcToCheck=");
        _builder_1.append(this.paramRC, "");
        _builder_1.append(", msg=ESMF_LOGERR_PASSTHRU, &");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("  ");
        _builder_1.append("line=__LINE__, &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("file=__FILE__)) &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("return");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("internalClock = ESMF_ClockCreate(name=\"");
        CharSequence _paramch = this.paramch("AppClock");
        _builder_1.append(_paramch, "");
        _builder_1.append("\", &");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("  ");
        _builder_1.append("timeStep=timeStep, startTime=startTime, stopTime=stopTime, rc=");
        _builder_1.append(this.paramRC, "  ");
        _builder_1.append(")");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("line=__LINE__, &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("file=__FILE__)) &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("return");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.newLine();
        _builder_1.append("call ESMF_GridCompSet(");
        _builder_1.append(this.paramGridComp, "");
        _builder_1.append(", clock=internalClock, rc=");
        _builder_1.append(this.paramRC, "");
        _builder_1.append(")");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("if (ESMF_LogFoundError(rcToCheck=");
        _builder_1.append(this.paramRC, "");
        _builder_1.append(", msg=ESMF_LOGERR_PASSTHRU, &");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("  ");
        _builder_1.append("line=__LINE__, &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("file=__FILE__)) &");
        _builder_1.newLine();
        _builder_1.append("  ");
        _builder_1.append("return  ! bail out");
        _builder_1.newLine();
        code = _builder_1.toString();
        final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
        IASTListNode<IBodyConstruct> _body_2 = ssn.getBody();
        _body_2.addAll(stmts);
        _xblockexpression = ast;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "DriverAddComp")
  @MappingType("call")
  public static class SetModelServices_AddComp extends CodeConcept<NUOPCDriver.SetModelServices, ASTCallStmtNode> {
    public String compLabel;
    
    public String srcCompLabel;
    
    public String dstCompLabel;
    
    @Label(label = "Set Services")
    public String compSetServices;
    
    public SetModelServices_AddComp(final NUOPCDriver.SetModelServices parent) {
      super(parent);
    }
    
    @Override
    public String name() {
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(this.compLabel, null));
      if (_notEquals) {
        _xifexpression = this.compLabel;
      } else {
        String _xifexpression_1 = null;
        boolean _and = false;
        boolean _notEquals_1 = (!Objects.equal(this.srcCompLabel, null));
        if (!_notEquals_1) {
          _and = false;
        } else {
          boolean _notEquals_2 = (!Objects.equal(this.dstCompLabel, null));
          _and = _notEquals_2;
        }
        if (_and) {
          _xifexpression_1 = ((this.srcCompLabel + " => ") + this.dstCompLabel);
        } else {
          _xifexpression_1 = null;
        }
        _xifexpression = _xifexpression_1;
      }
      return _xifexpression;
    }
    
    @Override
    public List reverseMultiple() {
      try {
        ArrayList<NUOPCDriver.SetModelServices_AddComp> _xblockexpression = null;
        {
          ArrayList<NUOPCDriver.SetModelServices_AddComp> retList = CollectionLiterals.<NUOPCDriver.SetModelServices_AddComp>newArrayList();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("call_(_cid, ");
          long _parentID = this.parentID();
          _builder.append(_parentID, "");
          _builder.append(", \'NUOPC_DriverAddComp\'),");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t\t\t\t\t");
          _builder.append("callArgWithType(_, _cid, 2, _arg2keyword, _arg2Type, _arg2Expr),");
          _builder.newLine();
          _builder.append("\t\t\t\t\t\t\t");
          _builder.append("callArgWithType(_, _cid, 3, _arg3keyword, _arg3Type, _arg3Expr).");
          ResultSet rs = this.execQuery(_builder);
          while (rs.next()) {
            {
              NUOPCDriver.SetModelServices_AddComp addComp = new NUOPCDriver.SetModelServices_AddComp(this._parent);
              long _long = rs.getLong("_cid");
              addComp._id = _long;
              String arg2keyword = rs.getString("_arg2keyword");
              boolean _equalsIgnoreCase = arg2keyword.equalsIgnoreCase("srcCompLabel");
              if (_equalsIgnoreCase) {
                String _string = rs.getString("_arg2Expr");
                addComp.srcCompLabel = _string;
                String _string_1 = rs.getString("_arg3Expr");
                addComp.dstCompLabel = _string_1;
              } else {
                String _string_2 = rs.getString("_arg2Expr");
                addComp.compLabel = _string_2;
                String _string_3 = rs.getString("_arg3Expr");
                addComp.compSetServices = _string_3;
              }
              retList.add(addComp);
            }
          }
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
        ASTSubroutineSubprogramNode ssn = this._parent.getASTRef();
        ASTModuleNode amn = this._parent._parent._parent._parent.getASTRef();
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("call NUOPC_DriverAddComp(");
        _builder.append(this._parent.paramGridComp, "");
        _builder.append(", \"");
        CharSequence _paramch = this.paramch("ComponentName");
        _builder.append(_paramch, "");
        _builder.append("\", ");
        CharSequence _paramch_1 = this.paramch("CompSetServices");
        _builder.append(_paramch_1, "");
        _builder.append(", rc=");
        _builder.append(this._parent.paramRC, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
        _builder.append("! To add a Connector, use signature below instead   ");
        _builder.newLine();
        _builder.append("!call NUOPC_DriverAddComp(driver, srcCompLabel=\"");
        CharSequence _paramch_2 = this.paramch("SrcComp");
        _builder.append(_paramch_2, "");
        _builder.append("\", dstCompLabel=\"");
        CharSequence _paramch_3 = this.paramch("DstComp");
        _builder.append(_paramch_3, "");
        _builder.append("\", &");
        _builder.newLineIfNotEmpty();
        _builder.append("!    compSetServicesRoutine=");
        CharSequence _paramch_4 = this.paramch("cplSS");
        _builder.append(_paramch_4, "");
        _builder.append(", rc=rc)");
        _builder.newLineIfNotEmpty();
        _builder.newLine();
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
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
        String code = _builder.toString();
        final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
        IASTListNode<IBodyConstruct> _body = ssn.getBody();
        _body.addAll(stmts);
        IBodyConstruct _get = stmts.get(0);
        this.setASTRef(((ASTCallStmtNode) _get));
        _xblockexpression = ast;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "SetRunSequence")
  @MappingType("subroutine")
  public static class SetRunSequence extends SpecializationMethodCodeConcept<NUOPCDriver.InitSpecializations> {
    @Label(label = "New Run Sequence")
    @MappingType("call")
    @Child(forward = false)
    public BasicCodeConcept newRunSequence;
    
    @Child(max = (-1))
    public List<NUOPCDriver.SetRunSequence_AddRunElement> runElements;
    
    public SetRunSequence(final NUOPCDriver.InitSpecializations parent) {
      super(parent, "NUOPC_Driver", "label_SetRunSequence");
      this.subroutineName = "SetRunSequence";
      this.specLabel = "driver_label_SetRunSequence";
    }
    
    @Override
    public SpecializationMethodCodeConcept<NUOPCDriver.InitSpecializations> reverse() {
      try {
        NUOPCDriver.SetRunSequence _xifexpression = null;
        SpecializationMethodCodeConcept<NUOPCDriver.InitSpecializations> _reverse = super.reverse();
        boolean _equals = Objects.equal(this, _reverse);
        if (_equals) {
          NUOPCDriver.SetRunSequence _xblockexpression = null;
          {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("call_(_cid, ");
            _builder.append(this._id, "");
            _builder.append(", \'NUOPC_DriverNewRunSequence\'),");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t\t\t");
            _builder.append("callArgWithType(_, _cid, _, \'slotCount\', _, _slotExpr).");
            ResultSet rs = this.execQuery(_builder);
            boolean _next = rs.next();
            if (_next) {
              long _long = rs.getLong("_cid");
              BasicCodeConcept _newBasicCodeConcept = BasicCodeConcept.newBasicCodeConcept(this, _long);
              this.newRunSequence = _newBasicCodeConcept;
            }
            NUOPCDriver.SetRunSequence_AddRunElement _setRunSequence_AddRunElement = new NUOPCDriver.SetRunSequence_AddRunElement(this);
            List _reverseMultiple = _setRunSequence_AddRunElement.reverseMultiple();
            this.runElements = ((List<NUOPCDriver.SetRunSequence_AddRunElement>) _reverseMultiple);
            _xblockexpression = this;
          }
          _xifexpression = _xblockexpression;
        } else {
          _xifexpression = null;
        }
        return _xifexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
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
      _builder.append("! Replace the default RunSequence with a customized one");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call NUOPC_DriverNewRunSequence(");
      _builder.append(this.paramGridComp, "    ");
      _builder.append(", slotCount=");
      CharSequence _paramint = this.paramint(1);
      _builder.append(_paramint, "    ");
      _builder.append(", rc=");
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
  
  @Label(label = "Add Run Element")
  @MappingType("call")
  public static class SetRunSequence_AddRunElement extends CodeConcept<NUOPCDriver.SetRunSequence, ASTCallStmtNode> {
    @Label(label = "slot")
    @Prop
    public String slot;
    
    @Label(label = "linkSlot")
    @Prop
    public String linkSlot;
    
    public String compLabel;
    
    public String srcCompLabel;
    
    public String dstCompLabel;
    
    @Override
    public String name() {
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(this.compLabel, null));
      if (_notEquals) {
        _xifexpression = (((this.compLabel + "(slot=") + this.slot) + ")");
      } else {
        String _xifexpression_1 = null;
        boolean _notEquals_1 = (!Objects.equal(this.linkSlot, null));
        if (_notEquals_1) {
          _xifexpression_1 = ((("slot " + this.slot) + " => slot ") + this.linkSlot);
        } else {
          _xifexpression_1 = (((((this.srcCompLabel + " => ") + this.dstCompLabel) + "(slot=") + this.slot) + ")");
        }
        _xifexpression = _xifexpression_1;
      }
      return _xifexpression;
    }
    
    public SetRunSequence_AddRunElement(final NUOPCDriver.SetRunSequence parent) {
      super(parent);
    }
    
    @Override
    public List reverseMultiple() {
      try {
        ArrayList<NUOPCDriver.SetRunSequence_AddRunElement> _xblockexpression = null;
        {
          ArrayList<NUOPCDriver.SetRunSequence_AddRunElement> retList = CollectionLiterals.<NUOPCDriver.SetRunSequence_AddRunElement>newArrayList();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("call_(_cid, ");
          long _parentID = this.parentID();
          _builder.append(_parentID, "");
          _builder.append(", \'NUOPC_DriverAddRunElement\').");
          ResultSet rs = this.execQuery(_builder);
          while (rs.next()) {
            {
              NUOPCDriver.SetRunSequence_AddRunElement addComp = new NUOPCDriver.SetRunSequence_AddRunElement(this._parent);
              long _long = rs.getLong("_cid");
              addComp._id = _long;
              retList.add(addComp);
            }
          }
          rs.close();
          for (final NUOPCDriver.SetRunSequence_AddRunElement addComp : retList) {
            {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("callArgWithType(_, ");
              _builder_1.append(addComp._id, "");
              _builder_1.append(", _, \'srcCompLabel\', _, _srcCompExpr),");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("\t\t\t\t\t\t\t ");
              _builder_1.append("callArgWithType(_, ");
              _builder_1.append(addComp._id, "\t\t\t\t\t\t\t ");
              _builder_1.append(", _, \'dstCompLabel\', _, _dstCompExpr),");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("\t\t\t\t\t\t\t ");
              _builder_1.append("callArgWithType(_, ");
              _builder_1.append(addComp._id, "\t\t\t\t\t\t\t ");
              _builder_1.append(", _, \'slot\', _, _slotExpr).");
              ResultSet _execQuery = this.execQuery(_builder_1);
              rs = _execQuery;
              boolean _next = rs.next();
              if (_next) {
                String _string = rs.getString("_srcCompExpr");
                addComp.srcCompLabel = _string;
                String _string_1 = rs.getString("_dstCompExpr");
                addComp.dstCompLabel = _string_1;
                String _string_2 = rs.getString("_slotExpr");
                addComp.slot = _string_2;
                rs.close();
              } else {
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("callArgWithType(_, ");
                _builder_2.append(addComp._id, "");
                _builder_2.append(", _, \'compLabel\', _, _compExpr),");
                _builder_2.newLineIfNotEmpty();
                _builder_2.append("\t\t\t\t\t\t\t ");
                _builder_2.append("callArgWithType(_, ");
                _builder_2.append(addComp._id, "\t\t\t\t\t\t\t ");
                _builder_2.append(", _, \'slot\', _, _slotExpr).");
                ResultSet _execQuery_1 = this.execQuery(_builder_2);
                rs = _execQuery_1;
                boolean _next_1 = rs.next();
                if (_next_1) {
                  String _string_3 = rs.getString("_compExpr");
                  addComp.compLabel = _string_3;
                  String _string_4 = rs.getString("_slotExpr");
                  addComp.slot = _string_4;
                  rs.close();
                } else {
                  StringConcatenation _builder_3 = new StringConcatenation();
                  _builder_3.append("callArgWithType(_, ");
                  _builder_3.append(addComp._id, "");
                  _builder_3.append(", _, \'slot\', _, _slotExpr),");
                  _builder_3.newLineIfNotEmpty();
                  _builder_3.append("\t\t\t\t\t\t\t ");
                  _builder_3.append("callArgWithType(_, ");
                  _builder_3.append(addComp._id, "\t\t\t\t\t\t\t ");
                  _builder_3.append(", _, \'linkSlot\', _, _linkSlotExpr).");
                  ResultSet _execQuery_2 = this.execQuery(_builder_3);
                  rs = _execQuery_2;
                  boolean _next_2 = rs.next();
                  if (_next_2) {
                    String _string_5 = rs.getString("_linkSlotExpr");
                    addComp.linkSlot = _string_5;
                    String _string_6 = rs.getString("_slotExpr");
                    addComp.slot = _string_6;
                    rs.close();
                  }
                }
              }
            }
          }
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
        _builder.append("! add a run sequence element for a Model, Mediator, or Driver       ");
        _builder.newLine();
        _builder.append("call NUOPC_DriverAddRunElement(");
        _builder.append(this._parent.paramGridComp, "");
        _builder.append(", slot=");
        CharSequence _paramint = this.paramint(1);
        _builder.append(_paramint, "");
        _builder.append(", &");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("compLabel=\"");
        CharSequence _paramch = this.paramch("compLabel");
        _builder.append(_paramch, "    ");
        _builder.append("\", phaseLabel=\"");
        CharSequence _paramch_1 = this.paramch("optionalPhaseLabel");
        _builder.append(_paramch_1, "    ");
        _builder.append("\", rc=");
        _builder.append(this._parent.paramRC, "    ");
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
        _builder.newLine();
        _builder.append("! add a run sequence element for a Connector   ");
        _builder.newLine();
        _builder.append("call NUOPC_DriverAddRunElement(");
        _builder.append(this._parent.paramGridComp, "");
        _builder.append(", slot=");
        CharSequence _paramint_1 = this.paramint(1);
        _builder.append(_paramint_1, "");
        _builder.append(", &");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("srcCompLabel=\"");
        CharSequence _paramch_2 = this.paramch("srcComp");
        _builder.append(_paramch_2, "    ");
        _builder.append("\", dstCompLabel=\"");
        CharSequence _paramch_3 = this.paramch("dstComp");
        _builder.append(_paramch_3, "    ");
        _builder.append("\", rc=");
        _builder.append(this._parent.paramRC, "    ");
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
        _builder.newLine();
        _builder.append("! add a run sequence element to link between slots    ");
        _builder.newLine();
        _builder.append("call NUOPC_DriverAddRunElement(");
        _builder.append(this._parent.paramGridComp, "");
        _builder.append(", slot=");
        CharSequence _paramint_2 = this.paramint(1);
        _builder.append(_paramint_2, "");
        _builder.append(", linkSlot=");
        CharSequence _paramint_3 = this.paramint(2);
        _builder.append(_paramint_3, "");
        _builder.append(", rc=");
        _builder.append(this._parent.paramRC, "");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("if (ESMF_LogFoundError(rcToCheck=rc, msg=ESMF_LOGERR_PASSTHRU, &");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("line=__LINE__, &");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("file=__FILE__)) &");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("return  ! bail out");
        _builder.newLine();
        _builder.append("    ");
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
  
  @Label(label = "ModifyInitializePhaseMap")
  @MappingType("subroutine")
  public static class ModifyInitializePhaseMap extends SpecializationMethodCodeConcept<NUOPCDriver.InitSpecializations> {
    public ModifyInitializePhaseMap(final NUOPCDriver.InitSpecializations parent) {
      super(parent, "NUOPC_Driver", "label_ModifyInitializePhaseMap");
      this.subroutineName = "ModifyInitializePhaseMap";
      this.specLabel = "driver_label_ModifyInitializePhaseMap";
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
  public static class Run extends CodeConcept<NUOPCDriver, ASTNode> {
    @Child
    public NUOPCDriver.RunPhases runPhases;
    
    @Child
    public NUOPCDriver.RunSpecializations runSpecs;
    
    public Run(final NUOPCDriver parent) {
      super(parent);
    }
    
    @Override
    public NUOPCDriver.Run reverse() {
      NUOPCDriver.Run _xblockexpression = null;
      {
        NUOPCDriver.RunPhases _runPhases = new NUOPCDriver.RunPhases(this);
        NUOPCDriver.RunPhases _reverse = _runPhases.reverse();
        this.runPhases = ((NUOPCDriver.RunPhases) _reverse);
        NUOPCDriver.RunSpecializations _runSpecializations = new NUOPCDriver.RunSpecializations(this);
        CodeConcept<?, ?> _reverse_1 = _runSpecializations.reverse();
        this.runSpecs = ((NUOPCDriver.RunSpecializations) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Phases")
  public static class RunPhases extends CodeConcept<NUOPCDriver.Run, ASTNode> {
    @Child
    public NUOPCDriver.RunPhase1 p1;
    
    public RunPhases(final NUOPCDriver.Run parent) {
      super(parent);
    }
    
    @Override
    public NUOPCDriver.RunPhases reverse() {
      NUOPCDriver.RunPhases _xblockexpression = null;
      {
        NUOPCDriver.RunPhase1 _runPhase1 = new NUOPCDriver.RunPhase1(this);
        CodeConcept<?, ?> _reverse = _runPhase1.<CodeConcept<?, ?>>reverse();
        this.p1 = ((NUOPCDriver.RunPhase1) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Run Phase 1")
  @MappingType("subroutine-inherited")
  public static class RunPhase1 extends CodeConcept<NUOPCDriver.RunPhases, ASTNode> {
    public RunPhase1(final NUOPCDriver.RunPhases parent) {
      super(parent);
    }
  }
  
  @Label(label = "Specializations")
  public static class RunSpecializations extends CodeConcept<NUOPCDriver.Run, ASTNode> {
    @Child(min = 0)
    public NUOPCDriver.SetRunClock setRunClock;
    
    public RunSpecializations(final NUOPCDriver.Run parent) {
      super(parent);
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCDriver.RunSpecializations reverseChildren() {
      NUOPCDriver.RunSpecializations _xblockexpression = null;
      {
        NUOPCDriver.SetRunClock _setRunClock = new NUOPCDriver.SetRunClock(this);
        SpecializationMethodCodeConcept<NUOPCDriver.RunSpecializations> _reverse = _setRunClock.reverse();
        this.setRunClock = ((NUOPCDriver.SetRunClock) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "SetRunClock")
  @MappingType("subroutine")
  public static class SetRunClock extends SpecializationMethodCodeConcept<NUOPCDriver.RunSpecializations> {
    public SetRunClock(final NUOPCDriver.RunSpecializations parent) {
      super(parent, "NUOPC_Driver", "label_SetRunClock");
      this.subroutineName = "SetRunClock";
      this.specLabel = "driver_label_SetRunClock";
      this.paramGridComp = "driver";
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
      _builder.append("   ");
      _builder.newLine();
      _builder.append("   \t");
      _builder.append("! local variable");
      _builder.newLine();
      _builder.append("   \t");
      _builder.append("type(ESMF_Clock) :: myClock");
      _builder.newLine();
      _builder.append("   \t");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("rc = ESMF_SUCCESS");
      _builder.newLine();
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! check and set clock against an external clock");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call NUOPC_CompCheckSetClock(");
      _builder.append(this.paramGridComp, "    ");
      _builder.append(", ");
      CharSequence _paramch = this.paramch("myClock");
      _builder.append(_paramch, "    ");
      _builder.append(", rc=");
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
      _builder.append("          ");
      _builder.newLine();
      _builder.append("  ");
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
  public static class FinalizePhases extends CodeConcept<NUOPCDriver.Finalize, ASTNode> {
    @Child
    public NUOPCDriver.FinalizePhase1 p1;
    
    public FinalizePhases(final NUOPCDriver.Finalize parent) {
      super(parent);
    }
    
    @Override
    public NUOPCDriver.FinalizePhases reverse() {
      NUOPCDriver.FinalizePhases _xblockexpression = null;
      {
        NUOPCDriver.FinalizePhase1 _finalizePhase1 = new NUOPCDriver.FinalizePhase1(this);
        CodeConcept<?, ?> _reverse = _finalizePhase1.<CodeConcept<?, ?>>reverse();
        this.p1 = ((NUOPCDriver.FinalizePhase1) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Specializations")
  public static class FinalizeSpecializations extends CodeConcept<NUOPCDriver.Finalize, ASTNode> {
    @Child(min = 0)
    public NUOPCDriver.FinalizeDriver finalize;
    
    public FinalizeSpecializations(final NUOPCDriver.Finalize parent) {
      super(parent);
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCDriver.FinalizeSpecializations reverseChildren() {
      NUOPCDriver.FinalizeSpecializations _xblockexpression = null;
      {
        NUOPCDriver.FinalizeDriver _finalizeDriver = new NUOPCDriver.FinalizeDriver(this);
        SpecializationMethodCodeConcept<NUOPCDriver.FinalizeSpecializations> _reverse = _finalizeDriver.reverse();
        this.finalize = ((NUOPCDriver.FinalizeDriver) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Finalize Phase 1")
  @MappingType("subroutine-inherited")
  public static class FinalizePhase1 extends CodeConcept<NUOPCDriver.FinalizePhases, ASTNode> {
    public FinalizePhase1(final NUOPCDriver.FinalizePhases parent) {
      super(parent);
    }
  }
  
  @Label(label = "Finalize")
  public static class Finalize extends CodeConcept<NUOPCDriver, ASTNode> {
    @Child
    public NUOPCDriver.FinalizePhases finalPhases;
    
    @Child
    public NUOPCDriver.FinalizeSpecializations finalSpecs;
    
    public Finalize(final NUOPCDriver parent) {
      super(parent);
    }
    
    @Override
    public NUOPCDriver.Finalize reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCDriver.Finalize reverseChildren() {
      NUOPCDriver.Finalize _xblockexpression = null;
      {
        NUOPCDriver.FinalizePhases _finalizePhases = new NUOPCDriver.FinalizePhases(this);
        NUOPCDriver.FinalizePhases _reverse = _finalizePhases.reverse();
        this.finalPhases = ((NUOPCDriver.FinalizePhases) _reverse);
        NUOPCDriver.FinalizeSpecializations _finalizeSpecializations = new NUOPCDriver.FinalizeSpecializations(this);
        CodeConcept<?, ?> _reverse_1 = _finalizeSpecializations.reverse();
        this.finalSpecs = ((NUOPCDriver.FinalizeSpecializations) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "FinalizeDriver")
  @MappingType("subroutine")
  public static class FinalizeDriver extends SpecializationMethodCodeConcept<NUOPCDriver.FinalizeSpecializations> {
    public FinalizeDriver(final NUOPCDriver.FinalizeSpecializations parent) {
      super(parent, "NUOPC_Driver", "label_Finalize");
      this.subroutineName = "FinalizeDriver";
      this.specLabel = "driver_label_Finalize";
      this.paramGridComp = "driver";
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
      _builder.append("! finalize driver");
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
  
  public String driverName;
  
  public String filename;
  
  public String path;
  
  @Child
  public SetServicesCodeConcept<NUOPCDriver> setServices;
  
  @Child
  public NUOPCDriver.Initialization initialization;
  
  @Child
  public NUOPCDriver.Run run;
  
  @Child
  public NUOPCDriver.Finalize finalize;
  
  public NUOPCDriver(final CodeDBIndex codeDB) {
    super(null);
    this._codeDB = codeDB;
  }
  
  @Override
  public String prefix() {
    return "driver";
  }
  
  @Override
  public CodeConcept<?, ?> reverse() {
    Object _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("module(_moduleID, _compUnitID, _driverName), ");
      _builder.newLine();
      _builder.append("\t\t            ");
      _builder.append("compilationUnit(_compUnitID, _filename, _path),");
      _builder.newLine();
      _builder.append("   \t\t\t\t\t");
      _builder.append("uses(_uid, _mid, \'NUOPC_Driver\').");
      ResultSet rs = this.execQuery(_builder);
      try {
        boolean _next = rs.next();
        if (_next) {
          long _long = rs.getLong("_moduleID");
          this._id = _long;
          String _string = rs.getString("_driverName");
          this.driverName = _string;
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
    return ((CodeConcept<?, ?>)_xblockexpression);
  }
  
  public NUOPCDriver reverseChildren() {
    NUOPCDriver _xblockexpression = null;
    {
      SetServicesCodeConcept<NUOPCDriver> _setServicesCodeConcept = new SetServicesCodeConcept<NUOPCDriver>(this);
      SetServicesCodeConcept<NUOPCDriver> _reverse = _setServicesCodeConcept.reverse();
      this.setServices = _reverse;
      NUOPCDriver.Initialization _initialization = new NUOPCDriver.Initialization(this);
      NUOPCDriver.Initialization _reverse_1 = _initialization.reverse();
      this.initialization = _reverse_1;
      NUOPCDriver.Run _run = new NUOPCDriver.Run(this);
      NUOPCDriver.Run _reverse_2 = _run.reverse();
      this.run = _reverse_2;
      NUOPCDriver.Finalize _finalize = new NUOPCDriver.Finalize(this);
      NUOPCDriver.Finalize _reverse_3 = _finalize.reverse();
      this.finalize = _reverse_3;
      _xblockexpression = this;
    }
    return _xblockexpression;
  }
  
  @Override
  public String name() {
    return (((this.driverName + " (") + this.filename) + ")");
  }
}
