package org.earthsystemmodeling.cupid.nuopc.v7bs59;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Doc;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.annotation.Prop;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.nuopc.ASTQuery;
import org.earthsystemmodeling.cupid.nuopc.BasicCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.earthsystemmodeling.cupid.nuopc.ESMFCodeTemplates;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.EntryPointCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.InternalEntryPointCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCComponent;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCModel;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.SetServicesCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7bs59.SpecializationMethodCodeConcept;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.core.resources.IResource;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTExecutableProgramNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNameNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTModuleStmtNode;
import org.eclipse.photran.internal.core.parser.ASTNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineArgNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTTypeDeclarationStmtNode;
import org.eclipse.photran.internal.core.parser.ASTUseStmtNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IBodyConstruct;
import org.eclipse.photran.internal.core.parser.IExpr;
import org.eclipse.photran.internal.core.parser.IModuleBodyConstruct;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@Label(label = "NUOPC Driver")
@MappingType("module")
@Doc(urlfrag = "#driver-top")
@SuppressWarnings("all")
public class NUOPCDriver extends NUOPCComponent {
  @Label(label = "SetServices")
  @MappingType("subroutine")
  @Doc(urlfrag = "#driver-setservices")
  public static class SetServices extends SetServicesCodeConcept<NUOPCDriver> {
    public SetServices(final NUOPCDriver parent) {
      super(parent);
    }
  }
  
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
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse = _iPDv04p1.reverse();
        this.ipdv00p1 = ((NUOPCDriver.IPD.IPDv04p1) _reverse);
        NUOPCDriver.IPD.IPDv04p3 _iPDv04p3 = new NUOPCDriver.IPD.IPDv04p3(this);
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse_1 = _iPDv04p3.reverse();
        this.ipdv00p2 = ((NUOPCDriver.IPD.IPDv04p3) _reverse_1);
        NUOPCDriver.IPD.IPDv04p6 _iPDv04p6 = new NUOPCDriver.IPD.IPDv04p6(this);
        CodeConcept<NUOPCDriver.IPD, ASTNode> _reverse_2 = _iPDv04p6.reverse();
        this.ipdv00p3 = ((NUOPCDriver.IPD.IPDv04p6) _reverse_2);
        NUOPCDriver.IPD.IPDv04p7 _iPDv04p7 = new NUOPCDriver.IPD.IPDv04p7(this);
        CodeConcept<NUOPCDriver.IPD, ASTNode> _reverse_3 = _iPDv04p7.reverse();
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
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse = _iPDv04p1.reverse();
        this.ipdv01p1 = ((NUOPCDriver.IPD.IPDv04p1) _reverse);
        NUOPCDriver.IPD.IPDv04p2 _iPDv04p2 = new NUOPCDriver.IPD.IPDv04p2(this);
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse_1 = _iPDv04p2.reverse();
        this.ipdv01p2 = ((NUOPCDriver.IPD.IPDv04p2) _reverse_1);
        NUOPCDriver.IPD.IPDv04p3 _iPDv04p3 = new NUOPCDriver.IPD.IPDv04p3(this);
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse_2 = _iPDv04p3.reverse();
        this.ipdv01p3 = ((NUOPCDriver.IPD.IPDv04p3) _reverse_2);
        NUOPCDriver.IPD.IPDv04p6 _iPDv04p6 = new NUOPCDriver.IPD.IPDv04p6(this);
        CodeConcept<NUOPCDriver.IPD, ASTNode> _reverse_3 = _iPDv04p6.reverse();
        this.ipdv01p4 = ((NUOPCDriver.IPD.IPDv04p6) _reverse_3);
        NUOPCDriver.IPD.IPDv04p7 _iPDv04p7 = new NUOPCDriver.IPD.IPDv04p7(this);
        CodeConcept<NUOPCDriver.IPD, ASTNode> _reverse_4 = _iPDv04p7.reverse();
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
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse = _iPDv04p1.reverse();
        this.ipdv02p1 = ((NUOPCDriver.IPD.IPDv04p1) _reverse);
        NUOPCDriver.IPD.IPDv04p2 _iPDv04p2 = new NUOPCDriver.IPD.IPDv04p2(this);
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse_1 = _iPDv04p2.reverse();
        this.ipdv02p2 = ((NUOPCDriver.IPD.IPDv04p2) _reverse_1);
        NUOPCDriver.IPD.IPDv04p3 _iPDv04p3 = new NUOPCDriver.IPD.IPDv04p3(this);
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse_2 = _iPDv04p3.reverse();
        this.ipdv02p3 = ((NUOPCDriver.IPD.IPDv04p3) _reverse_2);
        NUOPCDriver.IPD.IPDv04p6 _iPDv04p6 = new NUOPCDriver.IPD.IPDv04p6(this);
        CodeConcept<NUOPCDriver.IPD, ASTNode> _reverse_3 = _iPDv04p6.reverse();
        this.ipdv02p4 = ((NUOPCDriver.IPD.IPDv04p6) _reverse_3);
        NUOPCDriver.IPD.IPDv04p7 _iPDv04p7 = new NUOPCDriver.IPD.IPDv04p7(this);
        CodeConcept<NUOPCDriver.IPD, ASTNode> _reverse_4 = _iPDv04p7.reverse();
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
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse = _iPDv04p1.reverse();
        this.ipdv03p1 = ((NUOPCDriver.IPD.IPDv04p1) _reverse);
        NUOPCDriver.IPD.IPDv04p2 _iPDv04p2 = new NUOPCDriver.IPD.IPDv04p2(this);
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse_1 = _iPDv04p2.reverse();
        this.ipdv03p2 = ((NUOPCDriver.IPD.IPDv04p2) _reverse_1);
        NUOPCDriver.IPD.IPDv04p3 _iPDv04p3 = new NUOPCDriver.IPD.IPDv04p3(this);
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse_2 = _iPDv04p3.reverse();
        this.ipdv03p3 = ((NUOPCDriver.IPD.IPDv04p3) _reverse_2);
        NUOPCDriver.IPD.IPDv04p4 _iPDv04p4 = new NUOPCDriver.IPD.IPDv04p4(this);
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse_3 = _iPDv04p4.reverse();
        this.ipdv03p4 = ((NUOPCDriver.IPD.IPDv04p4) _reverse_3);
        NUOPCDriver.IPD.IPDv04p5 _iPDv04p5 = new NUOPCDriver.IPD.IPDv04p5(this);
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse_4 = _iPDv04p5.reverse();
        this.ipdv03p5 = ((NUOPCDriver.IPD.IPDv04p5) _reverse_4);
        NUOPCDriver.IPD.IPDv04p6 _iPDv04p6 = new NUOPCDriver.IPD.IPDv04p6(this);
        CodeConcept<NUOPCDriver.IPD, ASTNode> _reverse_5 = _iPDv04p6.reverse();
        this.ipdv03p6 = ((NUOPCDriver.IPD.IPDv04p6) _reverse_5);
        NUOPCDriver.IPD.IPDv04p7 _iPDv04p7 = new NUOPCDriver.IPD.IPDv04p7(this);
        CodeConcept<NUOPCDriver.IPD, ASTNode> _reverse_6 = _iPDv04p7.reverse();
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
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse = _iPDv04p1.reverse();
        this.ipdv04p1 = ((NUOPCDriver.IPD.IPDv04p1) _reverse);
        NUOPCDriver.IPD.IPDv04p2 _iPDv04p2 = new NUOPCDriver.IPD.IPDv04p2(this);
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse_1 = _iPDv04p2.reverse();
        this.ipdv04p2 = ((NUOPCDriver.IPD.IPDv04p2) _reverse_1);
        NUOPCDriver.IPD.IPDv04p3 _iPDv04p3 = new NUOPCDriver.IPD.IPDv04p3(this);
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse_2 = _iPDv04p3.reverse();
        this.ipdv04p3 = ((NUOPCDriver.IPD.IPDv04p3) _reverse_2);
        NUOPCDriver.IPD.IPDv04p4 _iPDv04p4 = new NUOPCDriver.IPD.IPDv04p4(this);
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse_3 = _iPDv04p4.reverse();
        this.ipdv04p4 = ((NUOPCDriver.IPD.IPDv04p4) _reverse_3);
        NUOPCDriver.IPD.IPDv04p5 _iPDv04p5 = new NUOPCDriver.IPD.IPDv04p5(this);
        CodeConcept<NUOPCDriver.IPD, ASTSubroutineSubprogramNode> _reverse_4 = _iPDv04p5.reverse();
        this.ipdv04p5 = ((NUOPCDriver.IPD.IPDv04p5) _reverse_4);
        NUOPCDriver.IPD.IPDv04p6 _iPDv04p6 = new NUOPCDriver.IPD.IPDv04p6(this);
        CodeConcept<NUOPCDriver.IPD, ASTNode> _reverse_5 = _iPDv04p6.reverse();
        this.ipdv04p6 = ((NUOPCDriver.IPD.IPDv04p6) _reverse_5);
        NUOPCDriver.IPD.IPDv04p7 _iPDv04p7 = new NUOPCDriver.IPD.IPDv04p7(this);
        CodeConcept<NUOPCDriver.IPD, ASTNode> _reverse_6 = _iPDv04p7.reverse();
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
    public CodeConcept<NUOPCDriver.Initialization, ASTNode> reverse() {
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
    @Doc(urlfrag = "#driver-phase-init")
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
    public CodeConcept<NUOPCDriver.Initialization, ASTNode> reverse() {
      NUOPCDriver.InitPhases _xblockexpression = null;
      {
        NUOPCDriver.InitPhases.InitP1 _initP1 = new NUOPCDriver.InitPhases.InitP1(this);
        CodeConcept<NUOPCDriver.InitPhases, ASTNode> _reverse = _initP1.reverse();
        this.initP1 = ((NUOPCDriver.InitPhases.InitP1) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Initialize")
  public static class Initialization extends CodeConcept<NUOPCDriver, ASTNode> {
    @Child(forward = true)
    public NUOPCDriver.InitPhases initPhases;
    
    @Child
    public NUOPCDriver.InternalInitPhases internalInitPhases;
    
    @Child(forward = true)
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
        CodeConcept<NUOPCDriver.Initialization, ASTNode> _reverse = _initPhases.reverse();
        this.initPhases = ((NUOPCDriver.InitPhases) _reverse);
        NUOPCDriver.InternalInitPhases _internalInitPhases = new NUOPCDriver.InternalInitPhases(this);
        CodeConcept<NUOPCDriver.Initialization, ASTNode> _reverse_1 = _internalInitPhases.reverse();
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
        CodeConcept<NUOPCDriver.InitSpecializations, ASTSubroutineSubprogramNode> _reverse = _setModelServices.reverse();
        this.setModelServices = ((NUOPCDriver.SetModelServices) _reverse);
        NUOPCDriver.SetRunSequence _setRunSequence = new NUOPCDriver.SetRunSequence(this);
        CodeConcept<NUOPCDriver.InitSpecializations, ASTSubroutineSubprogramNode> _reverse_1 = _setRunSequence.reverse();
        this.setRunSequence = ((NUOPCDriver.SetRunSequence) _reverse_1);
        NUOPCDriver.ModifyInitializePhaseMap _modifyInitializePhaseMap = new NUOPCDriver.ModifyInitializePhaseMap(this);
        CodeConcept<NUOPCDriver.InitSpecializations, ASTSubroutineSubprogramNode> _reverse_2 = _modifyInitializePhaseMap.reverse();
        this.modifyInitializePhaseMap = ((NUOPCDriver.ModifyInitializePhaseMap) _reverse_2);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "SetModelServices")
  @MappingType("subroutine")
  @Doc(urlfrag = "#driver-specialization-setmodelservices")
  public static class SetModelServices extends SpecializationMethodCodeConcept<NUOPCDriver.InitSpecializations> {
    @Child(min = 0, max = (-1))
    public List<NUOPCDriver.SetModelServices_AddComp> addComps;
    
    @Label(label = "SetClock")
    @MappingType("call")
    @Child(min = 0)
    public BasicCodeConcept<ASTCallStmtNode> setClock;
    
    public SetModelServices(final NUOPCDriver.InitSpecializations parent) {
      super(parent, "NUOPC_Driver", "label_SetModelServices");
      this.subroutineName = "SetModelServices";
      this.specLabel = "driver_label_SetModelServices";
      parent.setModelServices = this;
      ArrayList<NUOPCDriver.SetModelServices_AddComp> _newArrayList = CollectionLiterals.<NUOPCDriver.SetModelServices_AddComp>newArrayList();
      this.addComps = _newArrayList;
    }
    
    @Override
    public CodeConcept<NUOPCDriver.InitSpecializations, ASTSubroutineSubprogramNode> reverse() {
      NUOPCDriver.SetModelServices _xblockexpression = null;
      {
        CodeConcept<NUOPCDriver.InitSpecializations, ASTSubroutineSubprogramNode> _reverse = super.reverse();
        NUOPCDriver.SetModelServices ret = ((NUOPCDriver.SetModelServices) _reverse);
        NUOPCDriver.SetModelServices _xifexpression = null;
        boolean _notEquals = (!Objects.equal(ret, null));
        if (_notEquals) {
          NUOPCDriver.SetModelServices _xblockexpression_1 = null;
          {
            ASTSubroutineSubprogramNode _aSTRef = ret.getASTRef();
            IASTListNode<IBodyConstruct> _body = _aSTRef.getBody();
            Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
            final Function1<ASTCallStmtNode, Boolean> _function = new Function1<ASTCallStmtNode, Boolean>() {
              @Override
              public Boolean apply(final ASTCallStmtNode it) {
                boolean _and = false;
                Token _subroutineName = it.getSubroutineName();
                boolean _eic = ASTQuery.eic(_subroutineName, "ESMF_GridCompSet");
                if (!_eic) {
                  _and = false;
                } else {
                  IASTListNode<ASTSubroutineArgNode> _argList = it.getArgList();
                  boolean _exists = false;
                  if (_argList!=null) {
                    final Function1<ASTSubroutineArgNode, Boolean> _function = new Function1<ASTSubroutineArgNode, Boolean>() {
                      @Override
                      public Boolean apply(final ASTSubroutineArgNode it) {
                        Token _name = it.getName();
                        boolean _eic = false;
                        if (_name!=null) {
                          _eic=ASTQuery.eic(_name, "clock");
                        }
                        return Boolean.valueOf(_eic);
                      }
                    };
                    _exists=IterableExtensions.<ASTSubroutineArgNode>exists(_argList, _function);
                  }
                  _and = _exists;
                }
                return Boolean.valueOf(_and);
              }
            };
            final ASTCallStmtNode setClockCall = IterableExtensions.<ASTCallStmtNode>findFirst(_filter, _function);
            boolean _notEquals_1 = (!Objects.equal(setClockCall, null));
            if (_notEquals_1) {
              BasicCodeConcept<ASTCallStmtNode> _basicCodeConcept = new BasicCodeConcept<ASTCallStmtNode>(ret, setClockCall);
              ret.setClock = _basicCodeConcept;
            }
            _xblockexpression_1 = ret;
          }
          _xifexpression = _xblockexpression_1;
        } else {
          _xifexpression = null;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
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
      parent.addComps.add(this);
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
      ArrayList<NUOPCDriver.SetModelServices_AddComp> _xblockexpression = null;
      {
        final ArrayList<NUOPCDriver.SetModelServices_AddComp> retList = CollectionLiterals.<NUOPCDriver.SetModelServices_AddComp>newArrayList();
        ASTSubroutineSubprogramNode _aSTRef = this._parent.getASTRef();
        IASTListNode<IBodyConstruct> _body = _aSTRef.getBody();
        Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
        final Function1<ASTCallStmtNode, Boolean> _function = new Function1<ASTCallStmtNode, Boolean>() {
          @Override
          public Boolean apply(final ASTCallStmtNode it) {
            Token _subroutineName = it.getSubroutineName();
            return Boolean.valueOf(ASTQuery.eic(_subroutineName, "NUOPC_DriverAddComp"));
          }
        };
        Iterable<ASTCallStmtNode> _filter_1 = IterableExtensions.<ASTCallStmtNode>filter(_filter, _function);
        final Procedure1<ASTCallStmtNode> _function_1 = new Procedure1<ASTCallStmtNode>() {
          @Override
          public void apply(final ASTCallStmtNode c) {
            CodeConcept<NUOPCDriver.SetModelServices, ASTCallStmtNode> _newInstance = SetModelServices_AddComp.this.newInstance();
            NUOPCDriver.SetModelServices_AddComp smsac = ((NUOPCDriver.SetModelServices_AddComp) _newInstance);
            IASTListNode<ASTSubroutineArgNode> _argList = c.getArgList();
            ASTSubroutineArgNode _get = _argList.get(1);
            Token _name = _get.getName();
            boolean _eic = false;
            if (_name!=null) {
              _eic=ASTQuery.eic(_name, "srcCompLabel");
            }
            if (_eic) {
              IASTListNode<ASTSubroutineArgNode> _argList_1 = c.getArgList();
              ASTSubroutineArgNode _get_1 = _argList_1.get(1);
              IExpr _expr = _get_1.getExpr();
              String _literal = ASTQuery.literal(_expr);
              smsac.srcCompLabel = _literal;
              IASTListNode<ASTSubroutineArgNode> _argList_2 = c.getArgList();
              ASTSubroutineArgNode _get_2 = _argList_2.get(2);
              IExpr _expr_1 = _get_2.getExpr();
              String _literal_1 = ASTQuery.literal(_expr_1);
              smsac.dstCompLabel = _literal_1;
              IASTListNode<ASTSubroutineArgNode> _argList_3 = c.getArgList();
              ASTSubroutineArgNode _get_3 = _argList_3.get(3);
              IExpr _expr_2 = _get_3.getExpr();
              String _literal_2 = ASTQuery.literal(_expr_2);
              smsac.compSetServices = _literal_2;
            } else {
              IASTListNode<ASTSubroutineArgNode> _argList_4 = c.getArgList();
              ASTSubroutineArgNode _get_4 = _argList_4.get(1);
              IExpr _expr_3 = _get_4.getExpr();
              String _literal_3 = ASTQuery.literal(_expr_3);
              smsac.compLabel = _literal_3;
              IASTListNode<ASTSubroutineArgNode> _argList_5 = c.getArgList();
              ASTSubroutineArgNode _get_5 = _argList_5.get(2);
              IExpr _expr_4 = _get_5.getExpr();
              String _literal_4 = ASTQuery.literal(_expr_4);
              smsac.compSetServices = _literal_4;
            }
            retList.add(smsac);
          }
        };
        IterableExtensions.<ASTCallStmtNode>forEach(_filter_1, _function_1);
        _xblockexpression = retList;
      }
      return _xblockexpression;
    }
    
    /**
     * override List reverseMultiple() {
     * var retList = newArrayList()
     * 
     * var rs = '''call_(_cid, «parentID», 'NUOPC_DriverAddComp'),
     * callArgWithType(_, _cid, 2, _arg2keyword, _arg2Type, _arg2Expr),
     * callArgWithType(_, _cid, 3, _arg3keyword, _arg3Type, _arg3Expr).'''
     * .execQuery
     * 
     * while (rs.next) {
     * var addComp = new SetModelServices_AddComp(_parent)
     * addComp._id = rs.getLong("_cid")
     * 
     * var String arg2keyword = rs.getString("_arg2keyword")
     * if (arg2keyword.equalsIgnoreCase("srcCompLabel")) {
     * addComp.srcCompLabel = rs.getString("_arg2Expr")
     * addComp.dstCompLabel = rs.getString("_arg3Expr")
     * }
     * else {
     * addComp.compLabel = rs.getString("_arg2Expr")
     * addComp.compSetServices = rs.getString("_arg3Expr")
     * }
     * 
     * //addComp.compSetServices = rs.getString("_compSS")
     * retList.add(addComp)
     * }
     * 
     * 
     * retList
     * }
     */
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
        _builder.append("!call NUOPC_DriverAddComp(");
        _builder.append(this._parent.paramGridComp, "");
        _builder.append(", srcCompLabel=\"");
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
    
    @Override
    public CodeConcept<NUOPCDriver.SetModelServices, ASTCallStmtNode> fward() {
      try {
        NUOPCDriver.SetModelServices_AddComp _xblockexpression = null;
        {
          ASTSubroutineSubprogramNode ssn = this._parent.getASTRef();
          CodeConcept<?, ASTModuleNode> _module = this._parent.module();
          ASTModuleNode amn = _module.getASTRef();
          String code = null;
          boolean _and = false;
          boolean _notEquals = (!Objects.equal(this.compLabel, null));
          if (!_notEquals) {
            _and = false;
          } else {
            boolean _notEquals_1 = (!Objects.equal(this.compSetServices, null));
            _and = _notEquals_1;
          }
          if (_and) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.newLine();
            _builder.append("call NUOPC_DriverAddComp(");
            _builder.append(this._parent.paramGridComp, "");
            _builder.append(", compLabel=");
            CharSequence _paramch = this.paramch(this.compLabel);
            _builder.append(_paramch, "");
            _builder.append(", & ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("compSetServicesRoutine=");
            CharSequence _paramch_1 = this.paramch(this.compSetServices);
            _builder.append(_paramch_1, "\t");
            _builder.append(", rc=");
            _builder.append(this._parent.paramRC, "\t");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this._parent.paramRC);
            _builder.append(_ESMFErrorCheck, "");
            _builder.newLineIfNotEmpty();
            code = _builder.toString();
          } else {
            boolean _and_1 = false;
            boolean _and_2 = false;
            boolean _notEquals_2 = (!Objects.equal(this.srcCompLabel, null));
            if (!_notEquals_2) {
              _and_2 = false;
            } else {
              boolean _notEquals_3 = (!Objects.equal(this.dstCompLabel, null));
              _and_2 = _notEquals_3;
            }
            if (!_and_2) {
              _and_1 = false;
            } else {
              boolean _notEquals_4 = (!Objects.equal(this.compSetServices, null));
              _and_1 = _notEquals_4;
            }
            if (_and_1) {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.newLine();
              _builder_1.append("call NUOPC_DriverAddComp(");
              _builder_1.append(this._parent.paramGridComp, "");
              _builder_1.append(", srcCompLabel=");
              CharSequence _paramch_2 = this.paramch(this.srcCompLabel);
              _builder_1.append(_paramch_2, "");
              _builder_1.append(", & ");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("\t");
              _builder_1.append("dstCompLabel=");
              CharSequence _paramch_3 = this.paramch(this.dstCompLabel);
              _builder_1.append(_paramch_3, "\t");
              _builder_1.append(", compSetServicesRoutine=");
              CharSequence _paramch_4 = this.paramch(this.compSetServices);
              _builder_1.append(_paramch_4, "\t");
              _builder_1.append(", rc=");
              _builder_1.append(this._parent.paramRC, "\t");
              _builder_1.append(")");
              _builder_1.newLineIfNotEmpty();
              CharSequence _ESMFErrorCheck_1 = ESMFCodeTemplates.ESMFErrorCheck(this._parent.paramRC);
              _builder_1.append(_ESMFErrorCheck_1, "");
              _builder_1.newLineIfNotEmpty();
              code = _builder_1.toString();
            } else {
              throw new CodeGenerationException("Missing required parameters to generate NUOPC_DriverAddComp");
            }
          }
          final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
          IASTListNode<IBodyConstruct> _body = ssn.getBody();
          _body.addAll(stmts);
          IBodyConstruct _get = stmts.get(0);
          this.setASTRef(((ASTCallStmtNode) _get));
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "SetRunSequence")
  @MappingType("subroutine")
  @Doc(urlfrag = "#driver-specialization-setrunsequence")
  public static class SetRunSequence extends SpecializationMethodCodeConcept<NUOPCDriver.InitSpecializations> {
    @Label(label = "New Run Sequence")
    @MappingType("call")
    @Child(min = 0)
    public BasicCodeConcept<ASTCallStmtNode> newRunSequence;
    
    @Child(min = 0, max = (-1))
    public List<NUOPCDriver.SetRunSequence_AddRunElement> runElements;
    
    public SetRunSequence(final NUOPCDriver.InitSpecializations parent) {
      super(parent, "NUOPC_Driver", "label_SetRunSequence");
      this.subroutineName = "SetRunSequence";
      this.specLabel = "driver_label_SetRunSequence";
      parent.setRunSequence = this;
      ArrayList<NUOPCDriver.SetRunSequence_AddRunElement> _newArrayList = CollectionLiterals.<NUOPCDriver.SetRunSequence_AddRunElement>newArrayList();
      this.runElements = _newArrayList;
    }
    
    @Override
    public CodeConcept<NUOPCDriver.InitSpecializations, ASTSubroutineSubprogramNode> reverse() {
      NUOPCDriver.SetRunSequence _xblockexpression = null;
      {
        CodeConcept<NUOPCDriver.InitSpecializations, ASTSubroutineSubprogramNode> _reverse = super.reverse();
        NUOPCDriver.SetRunSequence ret = ((NUOPCDriver.SetRunSequence) _reverse);
        NUOPCDriver.SetRunSequence _xifexpression = null;
        boolean _notEquals = (!Objects.equal(ret, null));
        if (_notEquals) {
          NUOPCDriver.SetRunSequence _xblockexpression_1 = null;
          {
            ASTSubroutineSubprogramNode _aSTRef = ret.getASTRef();
            IASTListNode<IBodyConstruct> _body = _aSTRef.getBody();
            Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
            final Function1<ASTCallStmtNode, Boolean> _function = new Function1<ASTCallStmtNode, Boolean>() {
              @Override
              public Boolean apply(final ASTCallStmtNode it) {
                Token _subroutineName = it.getSubroutineName();
                return Boolean.valueOf(ASTQuery.eic(_subroutineName, "NUOPC_DriverNewRunSequence"));
              }
            };
            final ASTCallStmtNode newRunSequence = IterableExtensions.<ASTCallStmtNode>findFirst(_filter, _function);
            boolean _notEquals_1 = (!Objects.equal(newRunSequence, null));
            if (_notEquals_1) {
              BasicCodeConcept<ASTCallStmtNode> _basicCodeConcept = new BasicCodeConcept<ASTCallStmtNode>(ret, newRunSequence);
              ret.newRunSequence = _basicCodeConcept;
            }
            NUOPCDriver.SetRunSequence_AddRunElement _setRunSequence_AddRunElement = new NUOPCDriver.SetRunSequence_AddRunElement(ret);
            List _reverseMultiple = _setRunSequence_AddRunElement.reverseMultiple();
            ret.runElements = ((List<NUOPCDriver.SetRunSequence_AddRunElement>) _reverseMultiple);
            _xblockexpression_1 = ret;
          }
          _xifexpression = _xblockexpression_1;
        } else {
          _xifexpression = null;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
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
    
    public String phaseLabel;
    
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
      parent.runElements.add(this);
    }
    
    @Override
    public List reverseMultiple() {
      ArrayList<NUOPCDriver.SetRunSequence_AddRunElement> _xblockexpression = null;
      {
        final ArrayList<NUOPCDriver.SetRunSequence_AddRunElement> retList = CollectionLiterals.<NUOPCDriver.SetRunSequence_AddRunElement>newArrayList();
        ASTSubroutineSubprogramNode _aSTRef = this._parent.getASTRef();
        IASTListNode<IBodyConstruct> _body = _aSTRef.getBody();
        Iterable<ASTCallStmtNode> _filter = Iterables.<ASTCallStmtNode>filter(_body, ASTCallStmtNode.class);
        final Function1<ASTCallStmtNode, Boolean> _function = new Function1<ASTCallStmtNode, Boolean>() {
          @Override
          public Boolean apply(final ASTCallStmtNode it) {
            Token _subroutineName = it.getSubroutineName();
            return Boolean.valueOf(ASTQuery.eic(_subroutineName, "NUOPC_DriverAddRunElement"));
          }
        };
        Iterable<ASTCallStmtNode> _filter_1 = IterableExtensions.<ASTCallStmtNode>filter(_filter, _function);
        final Procedure1<ASTCallStmtNode> _function_1 = new Procedure1<ASTCallStmtNode>() {
          @Override
          public void apply(final ASTCallStmtNode c) {
            CodeConcept<NUOPCDriver.SetRunSequence, ASTCallStmtNode> _newInstance = SetRunSequence_AddRunElement.this.newInstance();
            NUOPCDriver.SetRunSequence_AddRunElement srsare = ((NUOPCDriver.SetRunSequence_AddRunElement) _newInstance);
            IASTListNode<ASTSubroutineArgNode> _argList = c.getArgList();
            ASTSubroutineArgNode _get = _argList.get(2);
            Token _name = _get.getName();
            boolean _eic = false;
            if (_name!=null) {
              _eic=ASTQuery.eic(_name, "srcCompLabel");
            }
            if (_eic) {
              IASTListNode<ASTSubroutineArgNode> _argList_1 = c.getArgList();
              ASTSubroutineArgNode _get_1 = _argList_1.get(2);
              IExpr _expr = _get_1.getExpr();
              String _literal = ASTQuery.literal(_expr);
              srsare.srcCompLabel = _literal;
              IASTListNode<ASTSubroutineArgNode> _argList_2 = c.getArgList();
              ASTSubroutineArgNode _get_2 = _argList_2.get(3);
              IExpr _expr_1 = _get_2.getExpr();
              String _literal_1 = ASTQuery.literal(_expr_1);
              srsare.dstCompLabel = _literal_1;
              IASTListNode<ASTSubroutineArgNode> _argList_3 = c.getArgList();
              ASTSubroutineArgNode _get_3 = _argList_3.get(1);
              IExpr _expr_2 = _get_3.getExpr();
              String _literal_2 = ASTQuery.literal(_expr_2);
              srsare.slot = _literal_2;
            } else {
              IASTListNode<ASTSubroutineArgNode> _argList_4 = c.getArgList();
              ASTSubroutineArgNode _get_4 = _argList_4.get(2);
              Token _name_1 = _get_4.getName();
              boolean _eic_1 = false;
              if (_name_1!=null) {
                _eic_1=ASTQuery.eic(_name_1, "compLabel");
              }
              if (_eic_1) {
                IASTListNode<ASTSubroutineArgNode> _argList_5 = c.getArgList();
                ASTSubroutineArgNode _get_5 = _argList_5.get(2);
                IExpr _expr_3 = _get_5.getExpr();
                String _literal_3 = ASTQuery.literal(_expr_3);
                srsare.compLabel = _literal_3;
                IASTListNode<ASTSubroutineArgNode> _argList_6 = c.getArgList();
                ASTSubroutineArgNode _get_6 = _argList_6.get(1);
                IExpr _expr_4 = _get_6.getExpr();
                String _literal_4 = ASTQuery.literal(_expr_4);
                srsare.slot = _literal_4;
                String _litArgExprByKeyword = ASTQuery.litArgExprByKeyword(c, "phaseLabel");
                srsare.phaseLabel = _litArgExprByKeyword;
              } else {
                IASTListNode<ASTSubroutineArgNode> _argList_7 = c.getArgList();
                ASTSubroutineArgNode _get_7 = _argList_7.get(2);
                Token _name_2 = _get_7.getName();
                boolean _eic_2 = false;
                if (_name_2!=null) {
                  _eic_2=ASTQuery.eic(_name_2, "linkSlot");
                }
                if (_eic_2) {
                  IASTListNode<ASTSubroutineArgNode> _argList_8 = c.getArgList();
                  ASTSubroutineArgNode _get_8 = _argList_8.get(1);
                  IExpr _expr_5 = _get_8.getExpr();
                  String _literal_5 = ASTQuery.literal(_expr_5);
                  srsare.slot = _literal_5;
                  IASTListNode<ASTSubroutineArgNode> _argList_9 = c.getArgList();
                  ASTSubroutineArgNode _get_9 = _argList_9.get(2);
                  IExpr _expr_6 = _get_9.getExpr();
                  String _literal_6 = ASTQuery.literal(_expr_6);
                  srsare.linkSlot = _literal_6;
                }
              }
            }
            retList.add(srsare);
          }
        };
        IterableExtensions.<ASTCallStmtNode>forEach(_filter_1, _function_1);
        _xblockexpression = retList;
      }
      return _xblockexpression;
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
    
    @Override
    public NUOPCDriver.SetRunSequence_AddRunElement fward() {
      try {
        NUOPCDriver.SetRunSequence_AddRunElement _xblockexpression = null;
        {
          String code = null;
          boolean _notEquals = (!Objects.equal(this.compLabel, null));
          if (_notEquals) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.newLine();
            _builder.append("! add a run sequence element for a Model, Mediator, or Driver       ");
            _builder.newLine();
            _builder.append("call NUOPC_DriverAddRunElement(");
            _builder.append(this._parent.paramGridComp, "");
            _builder.append(", slot=");
            CharSequence _paramint = this.paramint(this.slot);
            _builder.append(_paramint, "");
            _builder.append(", &");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("compLabel=");
            CharSequence _paramch = this.paramch(this.compLabel);
            _builder.append(_paramch, "    ");
            _builder.append(", ");
            {
              boolean _notEquals_1 = (!Objects.equal(this.phaseLabel, null));
              if (_notEquals_1) {
                _builder.append("phaseLabel=");
                CharSequence _paramch_1 = this.paramch(this.phaseLabel);
                _builder.append(_paramch_1, "    ");
                _builder.append(",");
              }
            }
            _builder.append(" rc=");
            _builder.append(this._parent.paramRC, "    ");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this._parent.paramRC);
            _builder.append(_ESMFErrorCheck, "");
            _builder.newLineIfNotEmpty();
            code = _builder.toString();
          } else {
            boolean _and = false;
            boolean _notEquals_2 = (!Objects.equal(this.srcCompLabel, null));
            if (!_notEquals_2) {
              _and = false;
            } else {
              boolean _notEquals_3 = (!Objects.equal(this.dstCompLabel, null));
              _and = _notEquals_3;
            }
            if (_and) {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.newLine();
              _builder_1.append("! add a run sequence element for a Connector   ");
              _builder_1.newLine();
              _builder_1.append("call NUOPC_DriverAddRunElement(");
              _builder_1.append(this._parent.paramGridComp, "");
              _builder_1.append(", slot=");
              CharSequence _paramint_1 = this.paramint(this.slot);
              _builder_1.append(_paramint_1, "");
              _builder_1.append(", &");
              _builder_1.newLineIfNotEmpty();
              _builder_1.append("    ");
              _builder_1.append("srcCompLabel=");
              CharSequence _paramch_2 = this.paramch(this.srcCompLabel);
              _builder_1.append(_paramch_2, "    ");
              _builder_1.append(", dstCompLabel=");
              CharSequence _paramch_3 = this.paramch(this.dstCompLabel);
              _builder_1.append(_paramch_3, "    ");
              _builder_1.append(", rc=");
              _builder_1.append(this._parent.paramRC, "    ");
              _builder_1.append(")");
              _builder_1.newLineIfNotEmpty();
              CharSequence _ESMFErrorCheck_1 = ESMFCodeTemplates.ESMFErrorCheck(this._parent.paramRC);
              _builder_1.append(_ESMFErrorCheck_1, "");
              _builder_1.newLineIfNotEmpty();
              code = _builder_1.toString();
            } else {
              boolean _and_1 = false;
              boolean _notEquals_4 = (!Objects.equal(this.slot, null));
              if (!_notEquals_4) {
                _and_1 = false;
              } else {
                boolean _notEquals_5 = (!Objects.equal(this.linkSlot, null));
                _and_1 = _notEquals_5;
              }
              if (_and_1) {
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.newLine();
                _builder_2.append("! add a run sequence element to link between slots    ");
                _builder_2.newLine();
                _builder_2.append("call NUOPC_DriverAddRunElement(");
                _builder_2.append(this._parent.paramGridComp, "");
                _builder_2.append(", slot=");
                CharSequence _paramint_2 = this.paramint(this.slot);
                _builder_2.append(_paramint_2, "");
                _builder_2.append(", linkSlot=");
                CharSequence _paramint_3 = this.paramint(this.linkSlot);
                _builder_2.append(_paramint_3, "");
                _builder_2.append(", rc=");
                _builder_2.append(this._parent.paramRC, "");
                _builder_2.append(")");
                _builder_2.newLineIfNotEmpty();
                CharSequence _ESMFErrorCheck_2 = ESMFCodeTemplates.ESMFErrorCheck(this._parent.paramRC);
                _builder_2.append(_ESMFErrorCheck_2, "");
                _builder_2.newLineIfNotEmpty();
                code = _builder_2.toString();
              } else {
                throw new CodeGenerationException("Missing required parameters to generate run sequence element");
              }
            }
          }
          final IASTListNode<IBodyConstruct> stmts = CodeExtraction.parseLiteralStatementSequence(code);
          final ASTSubroutineSubprogramNode ssn = this._parent.getASTRef();
          IASTListNode<IBodyConstruct> _body = ssn.getBody();
          _body.addAll(stmts);
          IBodyConstruct _get = stmts.get(0);
          this.setASTRef(((ASTCallStmtNode) _get));
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "ModifyInitializePhaseMap")
  @MappingType("subroutine")
  @Doc(urlfrag = "#driver-specialization-modifyinitphasemap")
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
        CodeConcept<NUOPCDriver.Run, ASTNode> _reverse_1 = _runSpecializations.reverse();
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
        CodeConcept<NUOPCDriver.RunPhases, ASTNode> _reverse = _runPhase1.reverse();
        this.p1 = ((NUOPCDriver.RunPhase1) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Run Phase 1")
  @MappingType("subroutine-inherited")
  @Doc(urlfrag = "#driver-phase-run")
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
    public CodeConcept<NUOPCDriver.Run, ASTNode> reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCDriver.RunSpecializations reverseChildren() {
      NUOPCDriver.RunSpecializations _xblockexpression = null;
      {
        NUOPCDriver.SetRunClock _setRunClock = new NUOPCDriver.SetRunClock(this);
        CodeConcept<NUOPCDriver.RunSpecializations, ASTSubroutineSubprogramNode> _reverse = _setRunClock.reverse();
        this.setRunClock = ((NUOPCDriver.SetRunClock) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "SetRunClock")
  @MappingType("subroutine")
  @Doc(urlfrag = "#driver-specialization-setrunclock")
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
        CodeConcept<NUOPCDriver.FinalizePhases, ASTNode> _reverse = _finalizePhase1.reverse();
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
    public CodeConcept<NUOPCDriver.Finalize, ASTNode> reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCDriver.FinalizeSpecializations reverseChildren() {
      NUOPCDriver.FinalizeSpecializations _xblockexpression = null;
      {
        NUOPCDriver.FinalizeDriver _finalizeDriver = new NUOPCDriver.FinalizeDriver(this);
        CodeConcept<NUOPCDriver.FinalizeSpecializations, ASTSubroutineSubprogramNode> _reverse = _finalizeDriver.reverse();
        this.finalize = ((NUOPCDriver.FinalizeDriver) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Finalize Phase 1")
  @MappingType("subroutine-inherited")
  @Doc(urlfrag = "#driver-phase-finalize")
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
        CodeConcept<NUOPCDriver.Finalize, ASTNode> _reverse_1 = _finalizeSpecializations.reverse();
        this.finalSpecs = ((NUOPCDriver.FinalizeSpecializations) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "FinalizeDriver")
  @MappingType("subroutine")
  @Doc(urlfrag = "#driver-specialization-finalize")
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
  
  public String driverName = "driver";
  
  public String filename;
  
  public String path;
  
  @Child(forward = true)
  public NUOPCDriver.SetServices setServices;
  
  @Child(forward = true)
  public NUOPCDriver.Initialization initialization;
  
  @Child(forward = true)
  public NUOPCDriver.Run run;
  
  @Child(forward = true)
  public NUOPCDriver.Finalize finalize;
  
  public NUOPCDriver(final CodeDBIndex codeDB) {
    super(null);
    this._codeDB = null;
  }
  
  public NUOPCDriver(final IResource context) {
    super(null);
    this._context = context;
    this._codeDB = null;
  }
  
  @Override
  public String prefix() {
    return "driver";
  }
  
  @Override
  public NUOPCDriver reverse() {
    NUOPCDriver _xblockexpression = null;
    {
      IFortranAST ast = this.getAST();
      ASTExecutableProgramNode _root = ast.getRoot();
      IASTListNode<IProgramUnit> _programUnitList = null;
      if (_root!=null) {
        _programUnitList=_root.getProgramUnitList();
      }
      Iterable<ASTModuleNode> _filter = null;
      if (_programUnitList!=null) {
        _filter=Iterables.<ASTModuleNode>filter(_programUnitList, ASTModuleNode.class);
      }
      final Function1<ASTModuleNode, Boolean> _function = new Function1<ASTModuleNode, Boolean>() {
        @Override
        public Boolean apply(final ASTModuleNode it) {
          IASTListNode<IModuleBodyConstruct> _moduleBody = it.getModuleBody();
          Iterable<ASTUseStmtNode> _filter = null;
          if (_moduleBody!=null) {
            _filter=Iterables.<ASTUseStmtNode>filter(_moduleBody, ASTUseStmtNode.class);
          }
          final Function1<ASTUseStmtNode, Boolean> _function = new Function1<ASTUseStmtNode, Boolean>() {
            @Override
            public Boolean apply(final ASTUseStmtNode it) {
              Token _name = it.getName();
              String _text = _name.getText();
              return Boolean.valueOf(ASTQuery.eic(_text, "NUOPC_Driver"));
            }
          };
          return Boolean.valueOf(IterableExtensions.<ASTUseStmtNode>exists(_filter, _function));
        }
      };
      ASTModuleNode _findFirst = IterableExtensions.<ASTModuleNode>findFirst(_filter, _function);
      this._astRef = _findFirst;
      NUOPCDriver _xifexpression = null;
      boolean _notEquals = (!Objects.equal(this._astRef, null));
      if (_notEquals) {
        NUOPCDriver _xblockexpression_1 = null;
        {
          ASTModuleStmtNode _moduleStmt = this._astRef.getModuleStmt();
          ASTModuleNameNode _moduleName = _moduleStmt.getModuleName();
          Token _moduleName_1 = _moduleName.getModuleName();
          String _text = _moduleName_1.getText();
          this.driverName = _text;
          IASTListNode<IModuleBodyConstruct> _moduleBody = this._astRef.getModuleBody();
          Iterable<ASTUseStmtNode> _filter_1 = Iterables.<ASTUseStmtNode>filter(_moduleBody, ASTUseStmtNode.class);
          final Procedure1<ASTUseStmtNode> _function_1 = new Procedure1<ASTUseStmtNode>() {
            @Override
            public void apply(final ASTUseStmtNode it) {
              Token _name = it.getName();
              String _text = _name.getText();
              boolean _eic = ASTQuery.eic(_text, "ESMF");
              if (_eic) {
                BasicCodeConcept<ASTUseStmtNode> _basicCodeConcept = new BasicCodeConcept<ASTUseStmtNode>(NUOPCDriver.this, it);
                NUOPCDriver.this.importESMF = _basicCodeConcept;
              } else {
                Token _name_1 = it.getName();
                String _text_1 = _name_1.getText();
                boolean _eic_1 = ASTQuery.eic(_text_1, "NUOPC");
                if (_eic_1) {
                  BasicCodeConcept<ASTUseStmtNode> _basicCodeConcept_1 = new BasicCodeConcept<ASTUseStmtNode>(NUOPCDriver.this, it);
                  NUOPCDriver.this.importNUOPC = _basicCodeConcept_1;
                } else {
                  Token _name_2 = it.getName();
                  String _text_2 = _name_2.getText();
                  boolean _eic_2 = ASTQuery.eic(_text_2, "NUOPC_Driver");
                  if (_eic_2) {
                    NUOPCComponent.GenericImport _genericImport = new NUOPCComponent.GenericImport(NUOPCDriver.this, it);
                    NUOPCComponent.GenericImport _reverse = _genericImport.reverse();
                    NUOPCDriver.this.importNUOPCGeneric = _reverse;
                  }
                }
              }
            }
          };
          IterableExtensions.<ASTUseStmtNode>forEach(_filter_1, _function_1);
          _xblockexpression_1 = this.reverseChildren();
        }
        _xifexpression = _xblockexpression_1;
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * def reverseOLD() {
   * 
   * var rs = '''module(_moduleID, _compUnitID, _driverName),
   * compilationUnit(_compUnitID, _filename, _path),
   * uses(_uid, _moduleID, 'NUOPC_Driver').'''.execQuery
   * 
   * 
   * try {
   * if (rs.next) {
   * _id = rs.getLong("_moduleID")
   * driverName = rs.getString("_driverName")
   * filename = rs.getString("_filename")
   * path = rs.getString("_path")
   * importNUOPCGeneric = new GenericImport(this, rs.getLong("_uid")).reverse
   * rs.close
   * 
   * rs = '''uses(_uid, «_id», 'ESMF').'''.execQuery
   * if (rs.next) importESMF = newBasicCodeConcept(this, rs.getLong("_uid"))
   * rs.close
   * 
   * rs = '''uses(_uid, «_id», 'NUOPC').'''.execQuery
   * if (rs.next) importNUOPC = newBasicCodeConcept(this, rs.getLong("_uid"))
   * rs.close
   * 
   * return reverseChildren
   * }
   * }
   * catch (SQLException e) {
   * log("SQL error", e);
   * }
   * 
   * null
   * }
   */
  public NUOPCDriver reverseChildren() {
    NUOPCDriver _xblockexpression = null;
    {
      NUOPCDriver.SetServices _setServices = new NUOPCDriver.SetServices(this);
      SetServicesCodeConcept<NUOPCDriver> _reverse = _setServices.reverse();
      this.setServices = ((NUOPCDriver.SetServices) _reverse);
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
  public NUOPCDriver fward() {
    try {
      NUOPCDriver _xblockexpression = null;
      {
        ASTModuleNode _aSTRef = this.getASTRef();
        boolean _equals = Objects.equal(_aSTRef, null);
        if (_equals) {
          boolean _equals_1 = Objects.equal(this.driverName, null);
          if (_equals_1) {
            throw new CodeGenerationException("No driver name specified");
          }
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("module ");
          _builder.append(this.driverName, "");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("use ESMF");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("use NUOPC");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("use NUOPC_Driver, only: &");
          _builder.newLine();
          _builder.append("\t\t");
          _builder.append("driver_SetServices => SetServices");
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
          String code = _builder.toString();
          ASTModuleNode moduleNode = CodeExtraction.<ASTModuleNode>parseLiteralProgramUnit(code);
          this.setASTRef(moduleNode);
          IASTListNode<IModuleBodyConstruct> _moduleBody = moduleNode.getModuleBody();
          Iterable<ASTUseStmtNode> _filter = Iterables.<ASTUseStmtNode>filter(_moduleBody, ASTUseStmtNode.class);
          final Procedure1<ASTUseStmtNode> _function = new Procedure1<ASTUseStmtNode>() {
            @Override
            public void apply(final ASTUseStmtNode it) {
              Token _name = it.getName();
              String _text = _name.getText();
              boolean _eic = ASTQuery.eic(_text, "ESMF");
              if (_eic) {
                BasicCodeConcept<ASTUseStmtNode> _basicCodeConcept = new BasicCodeConcept<ASTUseStmtNode>(NUOPCDriver.this, it);
                NUOPCDriver.this.importESMF = _basicCodeConcept;
              } else {
                Token _name_1 = it.getName();
                String _text_1 = _name_1.getText();
                boolean _eic_1 = ASTQuery.eic(_text_1, "NUOPC");
                if (_eic_1) {
                  BasicCodeConcept<ASTUseStmtNode> _basicCodeConcept_1 = new BasicCodeConcept<ASTUseStmtNode>(NUOPCDriver.this, it);
                  NUOPCDriver.this.importNUOPC = _basicCodeConcept_1;
                } else {
                  Token _name_2 = it.getName();
                  String _text_2 = _name_2.getText();
                  boolean _eic_2 = ASTQuery.eic(_text_2, "NUOPC_Driver");
                  if (_eic_2) {
                    NUOPCComponent.GenericImport _genericImport = new NUOPCComponent.GenericImport(NUOPCDriver.this, it);
                    NUOPCComponent.GenericImport _reverse = _genericImport.reverse();
                    NUOPCDriver.this.importNUOPCGeneric = _reverse;
                  }
                }
              }
            }
          };
          IterableExtensions.<ASTUseStmtNode>forEach(_filter, _function);
        }
        CodeConcept<CodeConcept<?, ?>, ASTModuleNode> _fward = super.fward();
        _xblockexpression = ((NUOPCDriver) _fward);
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public String name() {
    return (((this.driverName + " (") + this.filename) + ")");
  }
}
