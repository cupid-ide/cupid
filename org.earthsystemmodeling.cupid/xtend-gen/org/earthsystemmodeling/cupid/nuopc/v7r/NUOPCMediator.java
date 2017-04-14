package org.earthsystemmodeling.cupid.nuopc.v7r;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.NUOPC.Advance;
import org.earthsystemmodeling.cupid.NUOPC.ESMF_STAGGERLOC;
import org.earthsystemmodeling.cupid.NUOPC.Field;
import org.earthsystemmodeling.cupid.NUOPC.Grid;
import org.earthsystemmodeling.cupid.NUOPC.IPDVersion;
import org.earthsystemmodeling.cupid.NUOPC.Mediator;
import org.earthsystemmodeling.cupid.NUOPC.UniformGrid;
import org.earthsystemmodeling.cupid.annotation.Child;
import org.earthsystemmodeling.cupid.annotation.Doc;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.annotation.MappingType;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.ESMFCodeTemplates;
import org.earthsystemmodeling.cupid.nuopc.ReverseEngineerException;
import org.earthsystemmodeling.cupid.nuopc.v7r.EntryPointCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7r.GridCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCBaseModel;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCComponent;
import org.earthsystemmodeling.cupid.nuopc.v7r.SetServicesCodeConcept;
import org.earthsystemmodeling.cupid.nuopc.v7r.SpecializationMethodCodeConcept;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTNode;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@Label(label = "NUOPC Mediator")
@MappingType("module")
@Doc(urlfrag = "node4.html#SECTION00044000000000000000")
@SuppressWarnings("all")
public class NUOPCMediator extends NUOPCComponent {
  @Label(label = "SetServices")
  @MappingType("subroutine")
  public static class SetServices extends SetServicesCodeConcept<NUOPCMediator> {
    public SetServices(final NUOPCMediator parent) {
      super(parent);
      parent.setOrAddChild(this);
    }
  }
  
  @Label(label = "Initialize Phase Definition")
  public static abstract class IPD extends CodeConcept<NUOPCMediator.InitPhases, ASTNode> {
    @Label(label = "IPDv04p0 - Filter Initialization Phases")
    @MappingType("subroutine")
    public static class IPDv04p0 extends EntryPointCodeConcept<NUOPCMediator.IPD> {
      public String ipdversion;
      
      public IPDv04p0(final NUOPCMediator.IPD parent) {
        super(parent);
        parent.setOrAddChild(this);
        this.subroutineName = "InitializeP0";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        this.phaseNumber = "0";
        String _switchResult = null;
        final NUOPCMediator.IPD _parent = this._parent;
        boolean _matched = false;
        if (_parent instanceof NUOPCMediator.IPDv00) {
          _matched=true;
          _switchResult = "\"IPDv00\"";
        }
        if (!_matched) {
          if (_parent instanceof NUOPCMediator.IPDv01) {
            _matched=true;
            _switchResult = "\"IPDv01\"";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCMediator.IPDv02) {
            _matched=true;
            _switchResult = "\"IPDv02\"";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCMediator.IPDv03) {
            _matched=true;
            _switchResult = "\"IPDv03\"";
          }
        }
        if (!_matched) {
          _switchResult = "\"IPDv04\"";
        }
        this.ipdversion = _switchResult;
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCMediator.IPD _parent = this._parent;
        boolean _matched = false;
        if (_parent instanceof NUOPCMediator.IPDv00) {
          _matched=true;
          _switchResult = "IPDv00p0";
        }
        if (!_matched) {
          if (_parent instanceof NUOPCMediator.IPDv01) {
            _matched=true;
            _switchResult = "IPDv01p0";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCMediator.IPDv02) {
            _matched=true;
            _switchResult = "IPDv02p0";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCMediator.IPDv03) {
            _matched=true;
            _switchResult = "IPDv03p0";
          }
        }
        if (!_matched) {
          _switchResult = "IPDv04p0";
        }
        return _switchResult;
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
        _builder.append(this.paramImport);
        _builder.append(", ");
        _builder.append(this.paramExport);
        _builder.append(", ");
        _builder.append(this.paramClock);
        _builder.append(", ");
        _builder.append(this.paramRC);
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
        _builder.append("    ");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("rc = ESMF_SUCCESS");
        _builder.newLine();
        _builder.append("     ");
        _builder.newLine();
        _builder.append("     ");
        _builder.append("! Switch to ");
        _builder.append(this.ipdversion, "     ");
        _builder.append(" by filtering all other phaseMap entries");
        _builder.newLineIfNotEmpty();
        _builder.append("     ");
        _builder.append("call NUOPC_CompFilterPhaseMap(");
        _builder.append(this.paramGridComp, "     ");
        _builder.append(", ");
        _builder.append(this.methodType, "     ");
        _builder.append(", &");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("acceptStringList=(/");
        _builder.append(this.ipdversion, "        ");
        _builder.append("/), rc=");
        _builder.append(this.paramRC, "        ");
        _builder.append(")");
        _builder.newLineIfNotEmpty();
        _builder.append("     ");
        CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this.paramRC);
        _builder.append(_ESMFErrorCheck, "     ");
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("end subroutine");
        _builder.newLine();
        return _builder.toString();
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
    
    @Label(label = "IPDv04p1 - Advertise Fields")
    @MappingType("subroutine")
    public static class IPDv04p1 extends EntryPointCodeConcept<NUOPCMediator.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCBaseModel.AdvertiseField> advertiseFields;
      
      public IPDv04p1(final NUOPCMediator.IPD parent) {
        super(parent);
        this.phaseLabel = this.getPhaseLabel();
        this.subroutineName = "AdvertiseFields";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        parent.setOrAddChild(this);
        this.advertiseFields = CollectionLiterals.<NUOPCBaseModel.AdvertiseField>newArrayList();
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCMediator.IPD _parent = this._parent;
        boolean _matched = false;
        if (_parent instanceof NUOPCMediator.IPDv00) {
          _matched=true;
          _switchResult = "IPDv00p1";
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
          this.advertiseFields = new NUOPCBaseModel.AdvertiseField(this).reverseMultiple();
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
      
      public void forward(final Mediator high) {
        EList<Field> _importFields = high.getImportFields();
        for (final Field f : _importFields) {
          {
            final NUOPCBaseModel.AdvertiseField af = new NUOPCBaseModel.AdvertiseField(this);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("\"");
            String _standardName = f.getStandardName();
            _builder.append(_standardName);
            _builder.append("\"");
            af.standardName = _builder.toString();
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("\"");
            String _name = f.getName();
            _builder_1.append(_name);
            _builder_1.append("\"");
            af.name = _builder_1.toString();
            af.state = this.paramImport;
          }
        }
        EList<Field> _exportFields = high.getExportFields();
        for (final Field f_1 : _exportFields) {
          {
            final NUOPCBaseModel.AdvertiseField af = new NUOPCBaseModel.AdvertiseField(this);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("\"");
            String _standardName = f_1.getStandardName();
            _builder.append(_standardName);
            _builder.append("\"");
            af.standardName = _builder.toString();
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("\"");
            String _name = f_1.getName();
            _builder_1.append(_name);
            _builder_1.append("\"");
            af.name = _builder_1.toString();
            af.state = this.paramExport;
          }
        }
      }
    }
    
    @Label(label = "IPDv04p2 - Unspecified by NUOPC")
    @MappingType("subroutine-inherited")
    public static class IPDv04p2 extends CodeConcept<NUOPCMediator.IPD, ASTNode> {
      public IPDv04p2(final NUOPCMediator.IPD parent) {
        super(parent);
      }
    }
    
    @Label(label = "IPDv04p3 - Realize Fields Providing Geom Object")
    @MappingType("subroutine")
    public static class IPDv04p3 extends EntryPointCodeConcept<NUOPCMediator.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCBaseModel.RealizeField> realizeFields;
      
      @Accessors
      private List<String> grids;
      
      public IPDv04p3(final NUOPCMediator.IPD parent) {
        super(parent);
        this.phaseLabel = this.getPhaseLabel();
        this.subroutineName = "RealizeFieldsProvidingGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        parent.setOrAddChild(this);
        this.realizeFields = CollectionLiterals.<NUOPCBaseModel.RealizeField>newArrayList();
        this.grids = CollectionLiterals.<String>newArrayList();
      }
      
      public void forward(final Mediator high) {
        EList<Field> _importFields = high.getImportFields();
        for (final Field f : _importFields) {
          new NUOPCBaseModel.RealizeField(this).forward(f, this.paramImport);
        }
        EList<Field> _exportFields = high.getExportFields();
        for (final Field f_1 : _exportFields) {
          new NUOPCBaseModel.RealizeField(this).forward(f_1, this.paramExport);
        }
        EList<Grid> _grids = high.getGrids();
        for (final Grid g : _grids) {
          this.grids.add(g.getName());
        }
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
        _builder.append(this.paramImport);
        _builder.append(", ");
        _builder.append(this.paramExport);
        _builder.append(", ");
        _builder.append(this.paramClock);
        _builder.append(", ");
        _builder.append(this.paramRC);
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
        _builder.append("    ");
        _builder.newLine();
        {
          for(final String g : this.grids) {
            _builder.append("    ");
            _builder.append("type(ESMF_Grid) :: ");
            _builder.append(g, "    ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("rc = ESMF_SUCCESS");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
        {
          for(final String g_1 : this.grids) {
            _builder.append("    ");
            _builder.append(g_1, "    ");
            _builder.append(" = CreateGrid_");
            _builder.append(g_1, "    ");
            _builder.append("(rc=");
            _builder.append(this.paramRC, "    ");
            _builder.append(")");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this.paramRC);
            _builder.append(_ESMFErrorCheck, "    ");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("    ");
        _builder.newLine();
        _builder.append("end subroutine");
        _builder.newLine();
        return _builder.toString();
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCMediator.IPD _parent = this._parent;
        boolean _matched = false;
        if (_parent instanceof NUOPCMediator.IPDv00) {
          _matched=true;
          _switchResult = "IPDv00p2";
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
          this.realizeFields = new NUOPCBaseModel.RealizeField(this).reverseMultiple();
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
      
      @Pure
      public List<String> getGrids() {
        return this.grids;
      }
      
      public void setGrids(final List<String> grids) {
        this.grids = grids;
      }
    }
    
    @Label(label = "IPDv04p4 - Modify Decomposition of Accepted Geom Object")
    @MappingType("subroutine")
    public static class IPDv04p4 extends EntryPointCodeConcept<NUOPCMediator.IPD> {
      public IPDv04p4(final NUOPCMediator.IPD parent) {
        super(parent);
        this.phaseLabel = this.getPhaseLabel();
        this.subroutineName = "ModifyDistGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        parent.setOrAddChild(this);
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCMediator.IPD _parent = this._parent;
        boolean _matched = false;
        if (_parent instanceof NUOPCMediator.IPDv03) {
          _matched=true;
          _switchResult = "IPDv03p4";
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
    public static class IPDv04p5 extends EntryPointCodeConcept<NUOPCMediator.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCBaseModel.RealizeField> realizeFields;
      
      public IPDv04p5(final NUOPCMediator.IPD parent) {
        super(parent);
        this.phaseLabel = this.getPhaseLabel();
        this.subroutineName = "RealizeFieldsAcceptingGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        this.realizeFields = CollectionLiterals.<NUOPCBaseModel.RealizeField>newArrayList();
        parent.setOrAddChild(this);
      }
      
      public String getPhaseLabel() {
        String _switchResult = null;
        final NUOPCMediator.IPD _parent = this._parent;
        boolean _matched = false;
        if (_parent instanceof NUOPCMediator.IPDv03) {
          _matched=true;
          _switchResult = "IPDv03p5";
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
          this.realizeFields = new NUOPCBaseModel.RealizeField(this).reverseMultiple();
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
    public static class IPDv04p6 extends CodeConcept<NUOPCMediator.IPD, ASTNode> {
      public IPDv04p6(final NUOPCMediator.IPD parent) {
        super(parent);
      }
    }
    
    @Label(label = "IPDv04p7 - Data Initialize")
    @MappingType("subroutine-inherited")
    public static class IPDv04p7 extends CodeConcept<NUOPCMediator.IPD, ASTNode> {
      public IPDv04p7(final NUOPCMediator.IPD parent) {
        super(parent);
      }
    }
    
    public IPD(final NUOPCMediator.InitPhases parent) {
      super(parent);
      parent.setOrAddChild(this);
    }
  }
  
  @Label(label = "Initialize Phase Definition (v00)")
  public static class IPDv00 extends NUOPCMediator.IPD {
    @Child(min = 0)
    @Label(label = "IPDv00p0 - Filter Initialization Phases")
    public NUOPCMediator.IPD.IPDv04p0 ipdv00p0;
    
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
          CodeConcept<?, ?> _reverse = new NUOPCMediator.IPD.IPDv04p0(this).reverse();
          this.ipdv00p0 = ((NUOPCMediator.IPD.IPDv04p0) _reverse);
          CodeConcept<?, ?> _reverse_1 = new NUOPCMediator.IPD.IPDv04p1(this).reverse();
          this.ipdv00p1 = ((NUOPCMediator.IPD.IPDv04p1) _reverse_1);
          CodeConcept<?, ?> _reverse_2 = new NUOPCMediator.IPD.IPDv04p3(this).reverse();
          this.ipdv00p2 = ((NUOPCMediator.IPD.IPDv04p3) _reverse_2);
          CodeConcept<?, ?> _reverse_3 = new NUOPCMediator.IPD.IPDv04p6(this).<CodeConcept<?, ?>>reverse();
          this.ipdv00p3 = ((NUOPCMediator.IPD.IPDv04p6) _reverse_3);
          CodeConcept<?, ?> _reverse_4 = new NUOPCMediator.IPD.IPDv04p7(this).<CodeConcept<?, ?>>reverse();
          this.ipdv00p4 = ((NUOPCMediator.IPD.IPDv04p7) _reverse_4);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "Initialize Phase Definition (v01)")
  public static class IPDv01 extends NUOPCMediator.IPD {
    @Child(min = 0)
    @Label(label = "IPDv01p0 - Filter Initialization Phases")
    public NUOPCMediator.IPD.IPDv04p0 ipdv01p0;
    
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
          CodeConcept<?, ?> _reverse = new NUOPCMediator.IPD.IPDv04p0(this).reverse();
          this.ipdv01p0 = ((NUOPCMediator.IPD.IPDv04p0) _reverse);
          CodeConcept<?, ?> _reverse_1 = new NUOPCMediator.IPD.IPDv04p1(this).reverse();
          this.ipdv01p1 = ((NUOPCMediator.IPD.IPDv04p1) _reverse_1);
          CodeConcept<?, ?> _reverse_2 = new NUOPCMediator.IPD.IPDv04p2(this).<CodeConcept<?, ?>>reverse();
          this.ipdv01p2 = ((NUOPCMediator.IPD.IPDv04p2) _reverse_2);
          CodeConcept<?, ?> _reverse_3 = new NUOPCMediator.IPD.IPDv04p3(this).reverse();
          this.ipdv01p3 = ((NUOPCMediator.IPD.IPDv04p3) _reverse_3);
          CodeConcept<?, ?> _reverse_4 = new NUOPCMediator.IPD.IPDv04p6(this).<CodeConcept<?, ?>>reverse();
          this.ipdv01p4 = ((NUOPCMediator.IPD.IPDv04p6) _reverse_4);
          CodeConcept<?, ?> _reverse_5 = new NUOPCMediator.IPD.IPDv04p7(this).<CodeConcept<?, ?>>reverse();
          this.ipdv01p5 = ((NUOPCMediator.IPD.IPDv04p7) _reverse_5);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "Initialize Phase Definition (v02)")
  public static class IPDv02 extends NUOPCMediator.IPD {
    public IPDv02(final NUOPCMediator.InitPhases parent) {
      super(parent);
    }
    
    @Child(min = 0)
    @Label(label = "IPDv02p0 - Filter Initialization Phases")
    public NUOPCMediator.IPD.IPDv04p0 ipdv02p0;
    
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
          CodeConcept<?, ?> _reverse = new NUOPCMediator.IPD.IPDv04p0(this).reverse();
          this.ipdv02p0 = ((NUOPCMediator.IPD.IPDv04p0) _reverse);
          CodeConcept<?, ?> _reverse_1 = new NUOPCMediator.IPD.IPDv04p1(this).reverse();
          this.ipdv02p1 = ((NUOPCMediator.IPD.IPDv04p1) _reverse_1);
          CodeConcept<?, ?> _reverse_2 = new NUOPCMediator.IPD.IPDv04p2(this).<CodeConcept<?, ?>>reverse();
          this.ipdv02p2 = ((NUOPCMediator.IPD.IPDv04p2) _reverse_2);
          CodeConcept<?, ?> _reverse_3 = new NUOPCMediator.IPD.IPDv04p3(this).reverse();
          this.ipdv02p3 = ((NUOPCMediator.IPD.IPDv04p3) _reverse_3);
          CodeConcept<?, ?> _reverse_4 = new NUOPCMediator.IPD.IPDv04p6(this).<CodeConcept<?, ?>>reverse();
          this.ipdv02p4 = ((NUOPCMediator.IPD.IPDv04p6) _reverse_4);
          CodeConcept<?, ?> _reverse_5 = new NUOPCMediator.IPD.IPDv04p7(this).<CodeConcept<?, ?>>reverse();
          this.ipdv02p5 = ((NUOPCMediator.IPD.IPDv04p7) _reverse_5);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "Initialize Phase Definition (v03)")
  public static class IPDv03 extends NUOPCMediator.IPD {
    public IPDv03(final NUOPCMediator.InitPhases parent) {
      super(parent);
    }
    
    @Child(min = 0)
    @Label(label = "IPDv03p0 - Filter Initialization Phases")
    public NUOPCMediator.IPD.IPDv04p0 ipdv03p0;
    
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
          CodeConcept<?, ?> _reverse = new NUOPCMediator.IPD.IPDv04p0(this).reverse();
          this.ipdv03p0 = ((NUOPCMediator.IPD.IPDv04p0) _reverse);
          CodeConcept<?, ?> _reverse_1 = new NUOPCMediator.IPD.IPDv04p1(this).reverse();
          this.ipdv03p1 = ((NUOPCMediator.IPD.IPDv04p1) _reverse_1);
          CodeConcept<?, ?> _reverse_2 = new NUOPCMediator.IPD.IPDv04p2(this).<CodeConcept<?, ?>>reverse();
          this.ipdv03p2 = ((NUOPCMediator.IPD.IPDv04p2) _reverse_2);
          CodeConcept<?, ?> _reverse_3 = new NUOPCMediator.IPD.IPDv04p3(this).reverse();
          this.ipdv03p3 = ((NUOPCMediator.IPD.IPDv04p3) _reverse_3);
          CodeConcept<?, ?> _reverse_4 = new NUOPCMediator.IPD.IPDv04p4(this).reverse();
          this.ipdv03p4 = ((NUOPCMediator.IPD.IPDv04p4) _reverse_4);
          CodeConcept<?, ?> _reverse_5 = new NUOPCMediator.IPD.IPDv04p5(this).reverse();
          this.ipdv03p5 = ((NUOPCMediator.IPD.IPDv04p5) _reverse_5);
          CodeConcept<?, ?> _reverse_6 = new NUOPCMediator.IPD.IPDv04p6(this).<CodeConcept<?, ?>>reverse();
          this.ipdv03p6 = ((NUOPCMediator.IPD.IPDv04p6) _reverse_6);
          CodeConcept<?, ?> _reverse_7 = new NUOPCMediator.IPD.IPDv04p7(this).<CodeConcept<?, ?>>reverse();
          this.ipdv03p7 = ((NUOPCMediator.IPD.IPDv04p7) _reverse_7);
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
  public static class IPDv04 extends NUOPCMediator.IPD {
    public IPDv04(final NUOPCMediator.InitPhases parent) {
      super(parent);
    }
    
    @Child(min = 0)
    public NUOPCMediator.IPD.IPDv04p0 ipdv04p0;
    
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
          CodeConcept<?, ?> _reverse = new NUOPCMediator.IPD.IPDv04p0(this).reverse();
          this.ipdv04p0 = ((NUOPCMediator.IPD.IPDv04p0) _reverse);
          CodeConcept<?, ?> _reverse_1 = new NUOPCMediator.IPD.IPDv04p1(this).reverse();
          this.ipdv04p1 = ((NUOPCMediator.IPD.IPDv04p1) _reverse_1);
          CodeConcept<?, ?> _reverse_2 = new NUOPCMediator.IPD.IPDv04p2(this).<CodeConcept<?, ?>>reverse();
          this.ipdv04p2 = ((NUOPCMediator.IPD.IPDv04p2) _reverse_2);
          CodeConcept<?, ?> _reverse_3 = new NUOPCMediator.IPD.IPDv04p3(this).reverse();
          this.ipdv04p3 = ((NUOPCMediator.IPD.IPDv04p3) _reverse_3);
          CodeConcept<?, ?> _reverse_4 = new NUOPCMediator.IPD.IPDv04p4(this).reverse();
          this.ipdv04p4 = ((NUOPCMediator.IPD.IPDv04p4) _reverse_4);
          CodeConcept<?, ?> _reverse_5 = new NUOPCMediator.IPD.IPDv04p5(this).reverse();
          this.ipdv04p5 = ((NUOPCMediator.IPD.IPDv04p5) _reverse_5);
          CodeConcept<?, ?> _reverse_6 = new NUOPCMediator.IPD.IPDv04p6(this).<CodeConcept<?, ?>>reverse();
          this.ipdv04p6 = ((NUOPCMediator.IPD.IPDv04p6) _reverse_6);
          CodeConcept<?, ?> _reverse_7 = new NUOPCMediator.IPD.IPDv04p7(this).<CodeConcept<?, ?>>reverse();
          this.ipdv04p7 = ((NUOPCMediator.IPD.IPDv04p7) _reverse_7);
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
      parent.setOrAddChild(this);
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      NUOPCMediator.InitPhases _xblockexpression = null;
      {
        this.ipdv00 = new NUOPCMediator.IPDv00(this).reverse();
        this.ipdv01 = new NUOPCMediator.IPDv01(this).reverse();
        this.ipdv02 = new NUOPCMediator.IPDv02(this).reverse();
        this.ipdv03 = new NUOPCMediator.IPDv03(this).reverse();
        this.ipdv04 = new NUOPCMediator.IPDv04(this).reverse();
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
  public static class Initialization extends CodeConcept<NUOPCMediator, ASTNode> {
    @Child
    public NUOPCMediator.InitPhases initPhases;
    
    @Child
    public NUOPCMediator.InitSpecializations initSpecs;
    
    @Child(min = 0)
    public List<GridCodeConcept.CreateUniformGrid> createUniformGrid;
    
    public Initialization(final NUOPCMediator parent) {
      super(parent);
      parent.setOrAddChild(this);
      this.createUniformGrid = CollectionLiterals.<GridCodeConcept.CreateUniformGrid>newArrayList();
    }
    
    @Override
    public NUOPCMediator.Initialization reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCMediator.Initialization reverseChildren() {
      NUOPCMediator.Initialization _xblockexpression = null;
      {
        CodeConcept<?, ?> _reverse = new NUOPCMediator.InitPhases(this).reverse();
        this.initPhases = ((NUOPCMediator.InitPhases) _reverse);
        CodeConcept<?, ?> _reverse_1 = new NUOPCMediator.InitSpecializations(this).reverse();
        this.initSpecs = ((NUOPCMediator.InitSpecializations) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    public void forward(final Mediator high) {
      final Consumer<UniformGrid> _function = (UniformGrid g) -> {
        final GridCodeConcept.CreateUniformGrid cug = new GridCodeConcept.CreateUniformGrid(this);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\"");
        String _name = g.getName();
        _builder.append(_name);
        _builder.append("\"");
        cug.setName(_builder.toString());
        cug.setMinIndex(CodeConcept.toIntArray(g.getMinIndex()));
        cug.setMaxIndex(CodeConcept.toIntArray(g.getMaxIndex()));
        cug.setMinCornerCoord(CodeConcept.toDoubleArray(g.getMinCornerCoord()));
        cug.setMaxCornerCoord(CodeConcept.toDoubleArray(g.getMaxCornerCoord()));
        final Consumer<ESMF_STAGGERLOC> _function_1 = (ESMF_STAGGERLOC l) -> {
          cug.getStaggerLocs().add(l.getLiteral());
        };
        g.getStaggerLocToFillCoords().forEach(_function_1);
      };
      Iterables.<UniformGrid>filter(high.getGrids(), UniformGrid.class).forEach(_function);
      NUOPCMediator.IPD _switchResult = null;
      IPDVersion _iPDVersion = high.getIPDVersion();
      if (_iPDVersion != null) {
        switch (_iPDVersion) {
          case IP_DV00:
            _switchResult = new NUOPCMediator.IPDv00(this.initPhases);
            break;
          case IP_DV01:
            _switchResult = new NUOPCMediator.IPDv01(this.initPhases);
            break;
          case IP_DV02:
            _switchResult = new NUOPCMediator.IPDv02(this.initPhases);
            break;
          case IP_DV03:
            _switchResult = new NUOPCMediator.IPDv03(this.initPhases);
            break;
          default:
            _switchResult = new NUOPCMediator.IPDv04(this.initPhases);
            break;
        }
      } else {
        _switchResult = new NUOPCMediator.IPDv04(this.initPhases);
      }
      final NUOPCMediator.IPD ipd = _switchResult;
      new NUOPCMediator.IPD.IPDv04p0(ipd);
      if (((high.getImportFields().size() > 0) || (high.getExportFields().size() > 0))) {
        final NUOPCMediator.IPD.IPDv04p1 ipdv04p1 = new NUOPCMediator.IPD.IPDv04p1(ipd);
        ipdv04p1.forward(high);
        final NUOPCMediator.IPD.IPDv04p3 ipdv04p3 = new NUOPCMediator.IPD.IPDv04p3(ipd);
        ipdv04p3.forward(high);
      }
    }
  }
  
  @Label(label = "Specializations")
  public static class InitSpecializations extends CodeConcept<NUOPCMediator.Initialization, ASTNode> {
    @Child(min = 0)
    public NUOPCMediator.DataInitialize dataInitialize;
    
    public InitSpecializations(final NUOPCMediator.Initialization parent) {
      super(parent);
      parent.setOrAddChild(this);
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      NUOPCMediator.InitSpecializations _xblockexpression = null;
      {
        CodeConcept<?, ?> _reverse = new NUOPCMediator.DataInitialize(this).reverse();
        this.dataInitialize = ((NUOPCMediator.DataInitialize) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "DataInitialize")
  @MappingType("subroutine")
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
  public static class Run extends CodeConcept<NUOPCMediator, ASTNode> {
    @Child
    public NUOPCMediator.RunPhases runPhases;
    
    @Child
    public NUOPCMediator.RunSpecializations runSpecs;
    
    public Run(final NUOPCMediator parent) {
      super(parent);
      parent.setOrAddChild(this);
    }
    
    @Override
    public NUOPCMediator.Run reverse() {
      NUOPCMediator.Run _xblockexpression = null;
      {
        NUOPCMediator.RunPhases _reverse = new NUOPCMediator.RunPhases(this).reverse();
        this.runPhases = ((NUOPCMediator.RunPhases) _reverse);
        CodeConcept<?, ?> _reverse_1 = new NUOPCMediator.RunSpecializations(this).reverse();
        this.runSpecs = ((NUOPCMediator.RunSpecializations) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    public void forward(final Mediator high) {
      this.runSpecs.forward(high);
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
      parent.setOrAddChild(this);
      this.setRunClock = CollectionLiterals.<NUOPCMediator.SetRunClock>newArrayList();
      this.checkImport = CollectionLiterals.<NUOPCMediator.CheckImport>newArrayList();
      this.mediatorAdvance = CollectionLiterals.<NUOPCMediator.MediatorAdvance>newArrayList();
      this.timestampExport = CollectionLiterals.<NUOPCMediator.TimestampExport>newArrayList();
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCMediator.RunSpecializations reverseChildren() {
      NUOPCMediator.RunSpecializations _xblockexpression = null;
      {
        this.mediatorAdvance = new NUOPCMediator.MediatorAdvance(this).reverseMultiple();
        this.setRunClock = new NUOPCMediator.SetRunClock(this).reverseMultiple();
        this.checkImport = new NUOPCMediator.CheckImport(this).reverseMultiple();
        this.timestampExport = new NUOPCMediator.TimestampExport(this).reverseMultiple();
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    public void forward(final Mediator high) {
      final Consumer<Advance> _function = (Advance m) -> {
        final NUOPCMediator.MediatorAdvance adv = new NUOPCMediator.MediatorAdvance(this);
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(m.getPhaseLabel());
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
          String _phaseLabel = m.getPhaseLabel();
          String _plus = ("\"" + _phaseLabel);
          String _plus_1 = (_plus + "\"");
          adv.specPhaseLabel = _plus_1;
        }
      };
      high.getAdvance().forEach(_function);
    }
  }
  
  @Label(label = "Phases")
  public static class RunPhases extends CodeConcept<NUOPCMediator.Run, ASTNode> {
    @Child
    public NUOPCMediator.RunPhase1 p1;
    
    public RunPhases(final NUOPCMediator.Run parent) {
      super(parent);
      parent.setOrAddChild(this);
    }
    
    @Override
    public NUOPCMediator.RunPhases reverse() {
      try {
        NUOPCMediator.RunPhases _xblockexpression = null;
        {
          CodeConcept<?, ?> _reverse = new NUOPCMediator.RunPhase1(this).<CodeConcept<?, ?>>reverse();
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
  public static class RunPhase1 extends CodeConcept<NUOPCMediator.RunPhases, ASTNode> {
    public RunPhase1(final NUOPCMediator.RunPhases parent) {
      super(parent);
    }
  }
  
  @Label(label = "Advance")
  @MappingType("subroutine")
  public static class MediatorAdvance extends SpecializationMethodCodeConcept<NUOPCMediator.RunSpecializations> {
    public MediatorAdvance(final NUOPCMediator.RunSpecializations parent) {
      super(parent, "NUOPC_Mediator", "label_Advance");
      this.subroutineName = "MediatorAdvance";
      List<NUOPCMediator.MediatorAdvance> _mediatorAdvance = parent.mediatorAdvance;
      int _size = 0;
      if (_mediatorAdvance!=null) {
        _size=_mediatorAdvance.size();
      }
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        String _subroutineName = this.subroutineName;
        int _size_1 = parent.mediatorAdvance.size();
        this.subroutineName = (_subroutineName + Integer.valueOf(_size_1));
      }
      this.specLabel = "mediator_label_Advance";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      return super.reverse();
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
      _builder.append("call NUOPC_MediatorGet(");
      _builder.append(this.paramGridComp, "    ");
      _builder.append(", mediatorClock=clock, importState=importState, &");
      _builder.newLineIfNotEmpty();
      _builder.append("      ");
      _builder.append("exportState=exportState, rc=");
      _builder.append(this.paramRC, "      ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this.paramRC);
      _builder.append(_ESMFErrorCheck, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("! advance the mediator");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("call ESMF_ClockPrint(clock, options=\"currTime\", &");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("preString=\"------>Advancing ");
      String _name = this.module().name();
      _builder.append(_name, "      ");
      _builder.append(" from: \", rc=");
      _builder.append(this.paramRC, "      ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      CharSequence _ESMFErrorCheck_1 = ESMFCodeTemplates.ESMFErrorCheck(this.paramRC);
      _builder.append(_ESMFErrorCheck_1, "    ");
      _builder.newLineIfNotEmpty();
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
      CharSequence _ESMFErrorCheck_2 = ESMFCodeTemplates.ESMFErrorCheck(this.paramRC);
      _builder.append(_ESMFErrorCheck_2, "    ");
      _builder.newLineIfNotEmpty();
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
  public static class SetRunClock extends SpecializationMethodCodeConcept<NUOPCMediator.RunSpecializations> {
    public SetRunClock(final NUOPCMediator.RunSpecializations parent) {
      super(parent, "NUOPC_Mediator", "label_SetRunClock");
      this.subroutineName = "SetRunClock";
      List<NUOPCMediator.SetRunClock> _setRunClock = parent.setRunClock;
      int _size = 0;
      if (_setRunClock!=null) {
        _size=_setRunClock.size();
      }
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        String _subroutineName = this.subroutineName;
        int _size_1 = parent.setRunClock.size();
        this.subroutineName = (_subroutineName + Integer.valueOf(_size_1));
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
  public static class CheckImport extends SpecializationMethodCodeConcept<NUOPCMediator.RunSpecializations> {
    public CheckImport(final NUOPCMediator.RunSpecializations parent) {
      super(parent, "NUOPC_Mediator", "label_CheckImport");
      this.subroutineName = "CheckImport";
      List<NUOPCMediator.CheckImport> _checkImport = parent.checkImport;
      int _size = 0;
      if (_checkImport!=null) {
        _size=_checkImport.size();
      }
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        String _subroutineName = this.subroutineName;
        int _size_1 = parent.checkImport.size();
        this.subroutineName = (_subroutineName + Integer.valueOf(_size_1));
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
  
  @Label(label = "TimestampExport")
  @MappingType("subroutine")
  public static class TimestampExport extends SpecializationMethodCodeConcept<NUOPCMediator.RunSpecializations> {
    public TimestampExport(final NUOPCMediator.RunSpecializations parent) {
      super(parent, "NUOPC_Mediator", "label_TimestampExport");
      this.subroutineName = "TimestampExport";
      List<NUOPCMediator.TimestampExport> _timestampExport = parent.timestampExport;
      int _size = 0;
      if (_timestampExport!=null) {
        _size=_timestampExport.size();
      }
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        String _subroutineName = this.subroutineName;
        int _size_1 = parent.timestampExport.size();
        this.subroutineName = (_subroutineName + Integer.valueOf(_size_1));
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
          CodeConcept<?, ?> _reverse = new NUOPCMediator.FinalizePhase1(this).<CodeConcept<?, ?>>reverse();
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
        CodeConcept<?, ?> _reverse = new NUOPCMediator.FinalizeMediator(this).reverse();
        this.finalize = ((NUOPCMediator.FinalizeMediator) _reverse);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "Finalize Phase 1")
  @MappingType("subroutine-inherited")
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
        NUOPCMediator.FinalizePhases _reverse = new NUOPCMediator.FinalizePhases(this).reverse();
        this.finalPhases = ((NUOPCMediator.FinalizePhases) _reverse);
        CodeConcept<?, ?> _reverse_1 = new NUOPCMediator.FinalizeSpecializations(this).reverse();
        this.finalSpecs = ((NUOPCMediator.FinalizeSpecializations) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
  @Label(label = "FinalizeMediator")
  @MappingType("subroutine")
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
  public NUOPCMediator reverse() throws ReverseEngineerException {
    CodeConcept<?, ?> _reverse = super.reverse();
    return ((NUOPCMediator) _reverse);
  }
  
  @Override
  public NUOPCComponent reverseChildren() {
    NUOPCMediator _xblockexpression = null;
    {
      SetServicesCodeConcept<NUOPCMediator> _reverse = new NUOPCMediator.SetServices(this).reverse();
      this.setServices = ((NUOPCMediator.SetServices) _reverse);
      this.initialization = new NUOPCMediator.Initialization(this).reverse();
      this.run = new NUOPCMediator.Run(this).reverse();
      this.finalize = new NUOPCMediator.Finalize(this).reverse();
      _xblockexpression = this;
    }
    return _xblockexpression;
  }
  
  @Override
  public NUOPCMediator forward() {
    NUOPCComponent _forward = super.forward();
    return ((NUOPCMediator) _forward);
  }
  
  public static NUOPCMediator newMediator(final IResource context, final Mediator high) {
    NUOPCMediator _xblockexpression = null;
    {
      final NUOPCMediator m = NUOPCMediator.newBasicMediator(context);
      m.forward(high);
      _xblockexpression = m;
    }
    return _xblockexpression;
  }
  
  public static NUOPCMediator newBasicMediator(final IResource context) {
    NUOPCMediator _xblockexpression = null;
    {
      final NUOPCMediator mediator = new NUOPCMediator(context);
      new NUOPCMediator.SetServices(mediator);
      new NUOPCMediator.Initialization(mediator);
      new NUOPCMediator.InitPhases(mediator.initialization);
      new NUOPCMediator.InitSpecializations(mediator.initialization);
      new NUOPCMediator.Run(mediator);
      new NUOPCMediator.RunPhases(mediator.run);
      new NUOPCMediator.RunSpecializations(mediator.run);
      new NUOPCMediator.Finalize(mediator);
      new NUOPCMediator.FinalizePhases(mediator.finalize);
      new NUOPCMediator.FinalizeSpecializations(mediator.finalize);
      _xblockexpression = mediator;
    }
    return _xblockexpression;
  }
  
  public void forward(final Mediator high) {
    this.name = high.getName();
    this.setServices.forward(high);
    this.initialization.forward(high);
    this.run.forward(high);
  }
}
