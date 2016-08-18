package org.earthsystemmodeling.cupid.nuopc.v7r;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.NUOPC.Advance;
import org.earthsystemmodeling.cupid.NUOPC.ESMF_STAGGERLOC;
import org.earthsystemmodeling.cupid.NUOPC.Field;
import org.earthsystemmodeling.cupid.NUOPC.Grid;
import org.earthsystemmodeling.cupid.NUOPC.IPDVersion;
import org.earthsystemmodeling.cupid.NUOPC.Model;
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

@Label(label = "NUOPC Model")
@MappingType("module")
@Doc(urlfrag = "node4.html#SECTION00043000000000000000")
@SuppressWarnings("all")
public class NUOPCModel extends NUOPCComponent {
  @Label(label = "SetServices")
  @MappingType("subroutine")
  public static class SetServices extends SetServicesCodeConcept<NUOPCModel> {
    public SetServices(final NUOPCModel parent) {
      super(parent);
      parent.setOrAddChild(this);
    }
  }
  
  @Label(label = "Initialize Phase Definition")
  public static abstract class IPD extends CodeConcept<NUOPCModel.InitPhases, ASTNode> {
    @Label(label = "IPDv04p0 - Filter Initialization Phases")
    @MappingType("subroutine")
    public static class IPDv04p0 extends EntryPointCodeConcept<NUOPCModel.IPD> {
      public String ipdversion;
      
      public IPDv04p0(final NUOPCModel.IPD parent) {
        super(parent);
        parent.setOrAddChild(this);
        this.subroutineName = "InitializeP0";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        this.phaseNumber = "0";
        String _switchResult = null;
        final NUOPCModel.IPD _parent = this._parent;
        boolean _matched = false;
        if (_parent instanceof NUOPCModel.IPDv00) {
          _matched=true;
          _switchResult = "\"IPDv00\"";
        }
        if (!_matched) {
          if (_parent instanceof NUOPCModel.IPDv01) {
            _matched=true;
            _switchResult = "\"IPDv01\"";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCModel.IPDv02) {
            _matched=true;
            _switchResult = "\"IPDv02\"";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCModel.IPDv03) {
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
        final NUOPCModel.IPD _parent = this._parent;
        boolean _matched = false;
        if (_parent instanceof NUOPCModel.IPDv00) {
          _matched=true;
          _switchResult = "IPDv00p0";
        }
        if (!_matched) {
          if (_parent instanceof NUOPCModel.IPDv01) {
            _matched=true;
            _switchResult = "IPDv01p0";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCModel.IPDv02) {
            _matched=true;
            _switchResult = "IPDv02p0";
          }
        }
        if (!_matched) {
          if (_parent instanceof NUOPCModel.IPDv03) {
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
    public static class IPDv04p1 extends EntryPointCodeConcept<NUOPCModel.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCBaseModel.AdvertiseField> advertiseFields;
      
      public IPDv04p1(final NUOPCModel.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
        this.subroutineName = "AdvertiseFields";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        parent.setOrAddChild(this);
        ArrayList<NUOPCBaseModel.AdvertiseField> _newArrayList = CollectionLiterals.<NUOPCBaseModel.AdvertiseField>newArrayList();
        this.advertiseFields = _newArrayList;
      }
      
      public void forward(final Model high) {
        EList<Field> _importFields = high.getImportFields();
        for (final Field f : _importFields) {
          {
            final NUOPCBaseModel.AdvertiseField af = new NUOPCBaseModel.AdvertiseField(this);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("\"");
            String _standardName = f.getStandardName();
            _builder.append(_standardName, "");
            _builder.append("\"");
            af.standardName = _builder.toString();
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("\"");
            String _name = f.getName();
            _builder_1.append(_name, "");
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
            _builder.append(_standardName, "");
            _builder.append("\"");
            af.standardName = _builder.toString();
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("\"");
            String _name = f_1.getName();
            _builder_1.append(_name, "");
            _builder_1.append("\"");
            af.name = _builder_1.toString();
            af.state = this.paramExport;
          }
        }
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
          NUOPCBaseModel.AdvertiseField _advertiseField = new NUOPCBaseModel.AdvertiseField(this);
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
      public List<NUOPCBaseModel.RealizeField> realizeFields;
      
      @Accessors
      private List<String> grids;
      
      public IPDv04p3(final NUOPCModel.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
        this.subroutineName = "RealizeFieldsProvidingGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        parent.setOrAddChild(this);
        ArrayList<NUOPCBaseModel.RealizeField> _newArrayList = CollectionLiterals.<NUOPCBaseModel.RealizeField>newArrayList();
        this.realizeFields = _newArrayList;
        ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList();
        this.grids = _newArrayList_1;
      }
      
      public void forward(final Model high) {
        EList<Field> _importFields = high.getImportFields();
        for (final Field f : _importFields) {
          NUOPCBaseModel.RealizeField _realizeField = new NUOPCBaseModel.RealizeField(this);
          _realizeField.forward(f, this.paramImport);
        }
        EList<Field> _exportFields = high.getExportFields();
        for (final Field f_1 : _exportFields) {
          NUOPCBaseModel.RealizeField _realizeField_1 = new NUOPCBaseModel.RealizeField(this);
          _realizeField_1.forward(f_1, this.paramExport);
        }
        EList<Grid> _grids = high.getGrids();
        for (final Grid g : _grids) {
          String _name = g.getName();
          this.grids.add(_name);
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
          NUOPCBaseModel.RealizeField _realizeField = new NUOPCBaseModel.RealizeField(this);
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
    public static class IPDv04p4 extends EntryPointCodeConcept<NUOPCModel.IPD> {
      public IPDv04p4(final NUOPCModel.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
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
    public static class IPDv04p5 extends EntryPointCodeConcept<NUOPCModel.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCBaseModel.RealizeField> realizeFields;
      
      public IPDv04p5(final NUOPCModel.IPD parent) {
        super(parent);
        String _phaseLabel = this.getPhaseLabel();
        this.phaseLabel = _phaseLabel;
        this.subroutineName = "RealizeFieldsAcceptingGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        parent.setOrAddChild(this);
        ArrayList<NUOPCBaseModel.RealizeField> _newArrayList = CollectionLiterals.<NUOPCBaseModel.RealizeField>newArrayList();
        this.realizeFields = _newArrayList;
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
          NUOPCBaseModel.RealizeField _realizeField = new NUOPCBaseModel.RealizeField(this);
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
    
    public IPD(final NUOPCModel.InitPhases parent) {
      super(parent);
      parent.setOrAddChild(this);
    }
  }
  
  @Label(label = "Initialize Phase Definition (v00)")
  public static class IPDv00 extends NUOPCModel.IPD {
    @Child(min = 0)
    @Label(label = "IPDv00p0 - Filter Initialization Phases")
    public NUOPCModel.IPD.IPDv04p0 ipdv00p0;
    
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
          NUOPCModel.IPD.IPDv04p0 _iPDv04p0 = new NUOPCModel.IPD.IPDv04p0(this);
          CodeConcept<?, ?> _reverse = _iPDv04p0.reverse();
          this.ipdv00p0 = ((NUOPCModel.IPD.IPDv04p0) _reverse);
          NUOPCModel.IPD.IPDv04p1 _iPDv04p1 = new NUOPCModel.IPD.IPDv04p1(this);
          CodeConcept<?, ?> _reverse_1 = _iPDv04p1.reverse();
          this.ipdv00p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse_1);
          NUOPCModel.IPD.IPDv04p3 _iPDv04p3 = new NUOPCModel.IPD.IPDv04p3(this);
          CodeConcept<?, ?> _reverse_2 = _iPDv04p3.reverse();
          this.ipdv00p2 = ((NUOPCModel.IPD.IPDv04p3) _reverse_2);
          NUOPCModel.IPD.IPDv04p6 _iPDv04p6 = new NUOPCModel.IPD.IPDv04p6(this);
          CodeConcept<?, ?> _reverse_3 = _iPDv04p6.<CodeConcept<?, ?>>reverse();
          this.ipdv00p3 = ((NUOPCModel.IPD.IPDv04p6) _reverse_3);
          NUOPCModel.IPD.IPDv04p7 _iPDv04p7 = new NUOPCModel.IPD.IPDv04p7(this);
          CodeConcept<?, ?> _reverse_4 = _iPDv04p7.<CodeConcept<?, ?>>reverse();
          this.ipdv00p4 = ((NUOPCModel.IPD.IPDv04p7) _reverse_4);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "Initialize Phase Definition (v01)")
  public static class IPDv01 extends NUOPCModel.IPD {
    @Child(min = 0)
    @Label(label = "IPDv01p0 - Filter Initialization Phases")
    public NUOPCModel.IPD.IPDv04p0 ipdv01p0;
    
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
          NUOPCModel.IPD.IPDv04p0 _iPDv04p0 = new NUOPCModel.IPD.IPDv04p0(this);
          CodeConcept<?, ?> _reverse = _iPDv04p0.reverse();
          this.ipdv01p0 = ((NUOPCModel.IPD.IPDv04p0) _reverse);
          NUOPCModel.IPD.IPDv04p1 _iPDv04p1 = new NUOPCModel.IPD.IPDv04p1(this);
          CodeConcept<?, ?> _reverse_1 = _iPDv04p1.reverse();
          this.ipdv01p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse_1);
          NUOPCModel.IPD.IPDv04p2 _iPDv04p2 = new NUOPCModel.IPD.IPDv04p2(this);
          CodeConcept<?, ?> _reverse_2 = _iPDv04p2.<CodeConcept<?, ?>>reverse();
          this.ipdv01p2 = ((NUOPCModel.IPD.IPDv04p2) _reverse_2);
          NUOPCModel.IPD.IPDv04p3 _iPDv04p3 = new NUOPCModel.IPD.IPDv04p3(this);
          CodeConcept<?, ?> _reverse_3 = _iPDv04p3.reverse();
          this.ipdv01p3 = ((NUOPCModel.IPD.IPDv04p3) _reverse_3);
          NUOPCModel.IPD.IPDv04p6 _iPDv04p6 = new NUOPCModel.IPD.IPDv04p6(this);
          CodeConcept<?, ?> _reverse_4 = _iPDv04p6.<CodeConcept<?, ?>>reverse();
          this.ipdv01p4 = ((NUOPCModel.IPD.IPDv04p6) _reverse_4);
          NUOPCModel.IPD.IPDv04p7 _iPDv04p7 = new NUOPCModel.IPD.IPDv04p7(this);
          CodeConcept<?, ?> _reverse_5 = _iPDv04p7.<CodeConcept<?, ?>>reverse();
          this.ipdv01p5 = ((NUOPCModel.IPD.IPDv04p7) _reverse_5);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "Initialize Phase Definition (v02)")
  public static class IPDv02 extends NUOPCModel.IPD {
    public IPDv02(final NUOPCModel.InitPhases parent) {
      super(parent);
    }
    
    @Child(min = 0)
    @Label(label = "IPDv02p0 - Filter Initialization Phases")
    public NUOPCModel.IPD.IPDv04p0 ipdv02p0;
    
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
          NUOPCModel.IPD.IPDv04p0 _iPDv04p0 = new NUOPCModel.IPD.IPDv04p0(this);
          CodeConcept<?, ?> _reverse = _iPDv04p0.reverse();
          this.ipdv02p0 = ((NUOPCModel.IPD.IPDv04p0) _reverse);
          NUOPCModel.IPD.IPDv04p1 _iPDv04p1 = new NUOPCModel.IPD.IPDv04p1(this);
          CodeConcept<?, ?> _reverse_1 = _iPDv04p1.reverse();
          this.ipdv02p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse_1);
          NUOPCModel.IPD.IPDv04p2 _iPDv04p2 = new NUOPCModel.IPD.IPDv04p2(this);
          CodeConcept<?, ?> _reverse_2 = _iPDv04p2.<CodeConcept<?, ?>>reverse();
          this.ipdv02p2 = ((NUOPCModel.IPD.IPDv04p2) _reverse_2);
          NUOPCModel.IPD.IPDv04p3 _iPDv04p3 = new NUOPCModel.IPD.IPDv04p3(this);
          CodeConcept<?, ?> _reverse_3 = _iPDv04p3.reverse();
          this.ipdv02p3 = ((NUOPCModel.IPD.IPDv04p3) _reverse_3);
          NUOPCModel.IPD.IPDv04p6 _iPDv04p6 = new NUOPCModel.IPD.IPDv04p6(this);
          CodeConcept<?, ?> _reverse_4 = _iPDv04p6.<CodeConcept<?, ?>>reverse();
          this.ipdv02p4 = ((NUOPCModel.IPD.IPDv04p6) _reverse_4);
          NUOPCModel.IPD.IPDv04p7 _iPDv04p7 = new NUOPCModel.IPD.IPDv04p7(this);
          CodeConcept<?, ?> _reverse_5 = _iPDv04p7.<CodeConcept<?, ?>>reverse();
          this.ipdv02p5 = ((NUOPCModel.IPD.IPDv04p7) _reverse_5);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
  @Label(label = "Initialize Phase Definition (v03)")
  public static class IPDv03 extends NUOPCModel.IPD {
    public IPDv03(final NUOPCModel.InitPhases parent) {
      super(parent);
    }
    
    @Child(min = 0)
    @Label(label = "IPDv03p0 - Filter Initialization Phases")
    public NUOPCModel.IPD.IPDv04p0 ipdv03p0;
    
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
          NUOPCModel.IPD.IPDv04p0 _iPDv04p0 = new NUOPCModel.IPD.IPDv04p0(this);
          CodeConcept<?, ?> _reverse = _iPDv04p0.reverse();
          this.ipdv03p0 = ((NUOPCModel.IPD.IPDv04p0) _reverse);
          NUOPCModel.IPD.IPDv04p1 _iPDv04p1 = new NUOPCModel.IPD.IPDv04p1(this);
          CodeConcept<?, ?> _reverse_1 = _iPDv04p1.reverse();
          this.ipdv03p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse_1);
          NUOPCModel.IPD.IPDv04p2 _iPDv04p2 = new NUOPCModel.IPD.IPDv04p2(this);
          CodeConcept<?, ?> _reverse_2 = _iPDv04p2.<CodeConcept<?, ?>>reverse();
          this.ipdv03p2 = ((NUOPCModel.IPD.IPDv04p2) _reverse_2);
          NUOPCModel.IPD.IPDv04p3 _iPDv04p3 = new NUOPCModel.IPD.IPDv04p3(this);
          CodeConcept<?, ?> _reverse_3 = _iPDv04p3.reverse();
          this.ipdv03p3 = ((NUOPCModel.IPD.IPDv04p3) _reverse_3);
          NUOPCModel.IPD.IPDv04p4 _iPDv04p4 = new NUOPCModel.IPD.IPDv04p4(this);
          CodeConcept<?, ?> _reverse_4 = _iPDv04p4.reverse();
          this.ipdv03p4 = ((NUOPCModel.IPD.IPDv04p4) _reverse_4);
          NUOPCModel.IPD.IPDv04p5 _iPDv04p5 = new NUOPCModel.IPD.IPDv04p5(this);
          CodeConcept<?, ?> _reverse_5 = _iPDv04p5.reverse();
          this.ipdv03p5 = ((NUOPCModel.IPD.IPDv04p5) _reverse_5);
          NUOPCModel.IPD.IPDv04p6 _iPDv04p6 = new NUOPCModel.IPD.IPDv04p6(this);
          CodeConcept<?, ?> _reverse_6 = _iPDv04p6.<CodeConcept<?, ?>>reverse();
          this.ipdv03p6 = ((NUOPCModel.IPD.IPDv04p6) _reverse_6);
          NUOPCModel.IPD.IPDv04p7 _iPDv04p7 = new NUOPCModel.IPD.IPDv04p7(this);
          CodeConcept<?, ?> _reverse_7 = _iPDv04p7.<CodeConcept<?, ?>>reverse();
          this.ipdv03p7 = ((NUOPCModel.IPD.IPDv04p7) _reverse_7);
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
  public static class IPDv04 extends NUOPCModel.IPD {
    public IPDv04(final NUOPCModel.InitPhases parent) {
      super(parent);
    }
    
    @Child(min = 0)
    public NUOPCModel.IPD.IPDv04p0 ipdv04p0;
    
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
          NUOPCModel.IPD.IPDv04p0 _iPDv04p0 = new NUOPCModel.IPD.IPDv04p0(this);
          CodeConcept<?, ?> _reverse = _iPDv04p0.reverse();
          this.ipdv04p0 = ((NUOPCModel.IPD.IPDv04p0) _reverse);
          NUOPCModel.IPD.IPDv04p1 _iPDv04p1 = new NUOPCModel.IPD.IPDv04p1(this);
          CodeConcept<?, ?> _reverse_1 = _iPDv04p1.reverse();
          this.ipdv04p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse_1);
          NUOPCModel.IPD.IPDv04p2 _iPDv04p2 = new NUOPCModel.IPD.IPDv04p2(this);
          CodeConcept<?, ?> _reverse_2 = _iPDv04p2.<CodeConcept<?, ?>>reverse();
          this.ipdv04p2 = ((NUOPCModel.IPD.IPDv04p2) _reverse_2);
          NUOPCModel.IPD.IPDv04p3 _iPDv04p3 = new NUOPCModel.IPD.IPDv04p3(this);
          CodeConcept<?, ?> _reverse_3 = _iPDv04p3.reverse();
          this.ipdv04p3 = ((NUOPCModel.IPD.IPDv04p3) _reverse_3);
          NUOPCModel.IPD.IPDv04p4 _iPDv04p4 = new NUOPCModel.IPD.IPDv04p4(this);
          CodeConcept<?, ?> _reverse_4 = _iPDv04p4.reverse();
          this.ipdv04p4 = ((NUOPCModel.IPD.IPDv04p4) _reverse_4);
          NUOPCModel.IPD.IPDv04p5 _iPDv04p5 = new NUOPCModel.IPD.IPDv04p5(this);
          CodeConcept<?, ?> _reverse_5 = _iPDv04p5.reverse();
          this.ipdv04p5 = ((NUOPCModel.IPD.IPDv04p5) _reverse_5);
          NUOPCModel.IPD.IPDv04p6 _iPDv04p6 = new NUOPCModel.IPD.IPDv04p6(this);
          CodeConcept<?, ?> _reverse_6 = _iPDv04p6.<CodeConcept<?, ?>>reverse();
          this.ipdv04p6 = ((NUOPCModel.IPD.IPDv04p6) _reverse_6);
          NUOPCModel.IPD.IPDv04p7 _iPDv04p7 = new NUOPCModel.IPD.IPDv04p7(this);
          CodeConcept<?, ?> _reverse_7 = _iPDv04p7.<CodeConcept<?, ?>>reverse();
          this.ipdv04p7 = ((NUOPCModel.IPD.IPDv04p7) _reverse_7);
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
      parent.setOrAddChild(this);
    }
    
    @Override
    public NUOPCModel.InitPhases reverse() {
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
    
    @Child(min = 0)
    public List<GridCodeConcept.CreateUniformGrid> createUniformGrid;
    
    public Initialization(final NUOPCModel parent) {
      super(parent);
      parent.setOrAddChild(this);
      ArrayList<GridCodeConcept.CreateUniformGrid> _newArrayList = CollectionLiterals.<GridCodeConcept.CreateUniformGrid>newArrayList();
      this.createUniformGrid = _newArrayList;
    }
    
    @Override
    public NUOPCModel.Initialization reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCModel.Initialization reverseChildren() {
      NUOPCModel.Initialization _xblockexpression = null;
      {
        NUOPCModel.InitPhases _initPhases = new NUOPCModel.InitPhases(this);
        NUOPCModel.InitPhases _reverse = _initPhases.reverse();
        this.initPhases = _reverse;
        NUOPCModel.InitSpecializations _initSpecializations = new NUOPCModel.InitSpecializations(this);
        NUOPCModel.InitSpecializations _reverse_1 = _initSpecializations.reverse();
        this.initSpecs = _reverse_1;
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    public void forward(final Model high) {
      new NUOPCModel.InitSpecializations(this);
      EList<Grid> _grids = high.getGrids();
      Iterable<UniformGrid> _filter = Iterables.<UniformGrid>filter(_grids, UniformGrid.class);
      final Consumer<UniformGrid> _function = (UniformGrid g) -> {
        final GridCodeConcept.CreateUniformGrid cug = new GridCodeConcept.CreateUniformGrid(this);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("\"");
        String _name = g.getName();
        _builder.append(_name, "");
        _builder.append("\"");
        cug.setName(_builder.toString());
        EList<Integer> _minIndex = g.getMinIndex();
        int[] _intArray = CodeConcept.toIntArray(_minIndex);
        cug.setMinIndex(_intArray);
        EList<Integer> _maxIndex = g.getMaxIndex();
        int[] _intArray_1 = CodeConcept.toIntArray(_maxIndex);
        cug.setMaxIndex(_intArray_1);
        EList<Double> _minCornerCoord = g.getMinCornerCoord();
        double[] _doubleArray = CodeConcept.toDoubleArray(_minCornerCoord);
        cug.setMinCornerCoord(_doubleArray);
        EList<Double> _maxCornerCoord = g.getMaxCornerCoord();
        double[] _doubleArray_1 = CodeConcept.toDoubleArray(_maxCornerCoord);
        cug.setMaxCornerCoord(_doubleArray_1);
        EList<ESMF_STAGGERLOC> _staggerLocToFillCoords = g.getStaggerLocToFillCoords();
        final Consumer<ESMF_STAGGERLOC> _function_1 = (ESMF_STAGGERLOC l) -> {
          List<String> _staggerLocs = cug.getStaggerLocs();
          String _literal = l.getLiteral();
          _staggerLocs.add(_literal);
        };
        _staggerLocToFillCoords.forEach(_function_1);
      };
      _filter.forEach(_function);
      NUOPCModel.IPD _switchResult = null;
      IPDVersion _iPDVersion = high.getIPDVersion();
      if (_iPDVersion != null) {
        switch (_iPDVersion) {
          case IP_DV00:
            _switchResult = new NUOPCModel.IPDv00(this.initPhases);
            break;
          case IP_DV01:
            _switchResult = new NUOPCModel.IPDv01(this.initPhases);
            break;
          case IP_DV02:
            _switchResult = new NUOPCModel.IPDv02(this.initPhases);
            break;
          case IP_DV03:
            _switchResult = new NUOPCModel.IPDv03(this.initPhases);
            break;
          default:
            _switchResult = new NUOPCModel.IPDv04(this.initPhases);
            break;
        }
      } else {
        _switchResult = new NUOPCModel.IPDv04(this.initPhases);
      }
      final NUOPCModel.IPD ipd = _switchResult;
      new NUOPCModel.IPD.IPDv04p0(ipd);
      if (((high.getImportFields().size() > 0) || (high.getExportFields().size() > 0))) {
        final NUOPCModel.IPD.IPDv04p1 ipdv04p1 = new NUOPCModel.IPD.IPDv04p1(ipd);
        ipdv04p1.forward(high);
        final NUOPCModel.IPD.IPDv04p3 ipdv04p3 = new NUOPCModel.IPD.IPDv04p3(ipd);
        ipdv04p3.forward(high);
      }
      if (((Objects.equal(high.getIPDVersion(), IPDVersion.IP_DV02) || 
        Objects.equal(high.getIPDVersion(), IPDVersion.IP_DV03)) || 
        Objects.equal(high.getIPDVersion(), IPDVersion.IP_DV04))) {
        final NUOPCModel.DataInitialize dataInit = new NUOPCModel.DataInitialize(this.initSpecs);
        dataInit.forward(high);
      }
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
      parent.setOrAddChild(this);
    }
    
    @Override
    public NUOPCModel.InitSpecializations reverse() {
      NUOPCModel.InitSpecializations _xblockexpression = null;
      {
        NUOPCModel.SetClock _setClock = new NUOPCModel.SetClock(this);
        CodeConcept<?, ?> _reverse = _setClock.reverse();
        this.setClock = ((NUOPCModel.SetClock) _reverse);
        NUOPCModel.DataInitialize _dataInitialize = new NUOPCModel.DataInitialize(this);
        CodeConcept<?, ?> _reverse_1 = _dataInitialize.reverse();
        this.dataInitialize = ((NUOPCModel.DataInitialize) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
  }
  
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
    private List<String> exportFieldsToInit;
    
    public DataInitialize(final NUOPCModel.InitSpecializations parent) {
      super(parent, "NUOPC_Model", "label_DataInitialize");
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList();
      this.exportFieldsToInit = _newArrayList;
      this.subroutineName = "DataInitialize";
      this.specLabel = "model_label_DataInitialize";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    public void forward(final Model high) {
      EList<Field> _exportFields = high.getExportFields();
      final Consumer<Field> _function = (Field f) -> {
        String _name = f.getName();
        this.exportFieldsToInit.add(_name);
      };
      _exportFields.forEach(_function);
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
      _builder.append("\t");
      _builder.append("type(ESMF_State) :: exportState");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("type(ESMF_Field) :: field");
      _builder.newLine();
      _builder.append("\t");
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
      _builder.append("call NUOPC_ModelGet(");
      _builder.append(this.paramGridComp, "    ");
      _builder.append(", exportState=exportState, & ");
      _builder.newLineIfNotEmpty();
      _builder.append("        ");
      _builder.append("rc=");
      _builder.append(this.paramRC, "        ");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      CharSequence _ESMFErrorCheck = ESMFCodeTemplates.ESMFErrorCheck(this.paramRC);
      _builder.append(_ESMFErrorCheck, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! initialize export fields here and mark as updated");
      _builder.newLine();
      {
        boolean _hasElements = false;
        for(final String f : this.exportFieldsToInit) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate("\n", "    ");
          }
          _builder.append("    ");
          _builder.append("call ESMF_StateGet(exportState, field=field, itemName=\"");
          _builder.append(f, "    ");
          _builder.append("\", rc=");
          _builder.append(this.paramRC, "    ");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          CharSequence _ESMFErrorCheck_1 = ESMFCodeTemplates.ESMFErrorCheck(this.paramRC);
          _builder.append(_ESMFErrorCheck_1, "    ");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("call NUOPC_SetAttribute(field, name=\"Updated\", & ");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("    ");
          _builder.append("value=\"true\", rc=");
          _builder.append(this.paramRC, "        ");
          _builder.append(")");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          CharSequence _ESMFErrorCheck_2 = ESMFCodeTemplates.ESMFErrorCheck(this.paramRC);
          _builder.append(_ESMFErrorCheck_2, "    ");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("! when all export fields are initialized, mark as complete");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("call NUOPC_CompAttributeSet(");
      _builder.append(this.paramGridComp, "    ");
      _builder.append(", name=\"InitializeDataComplete\", &");
      _builder.newLineIfNotEmpty();
      _builder.append("    \t");
      _builder.append("value=\"true\", rc=");
      _builder.append(this.paramRC, "    \t");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      CharSequence _ESMFErrorCheck_3 = ESMFCodeTemplates.ESMFErrorCheck(this.paramRC);
      _builder.append(_ESMFErrorCheck_3, "    ");
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
  
  @Label(label = "Run")
  public static class Run extends CodeConcept<NUOPCModel, ASTNode> {
    @Child
    public NUOPCModel.RunPhases runPhases;
    
    @Child
    public NUOPCModel.RunSpecializations runSpecs;
    
    public Run(final NUOPCModel parent) {
      super(parent);
      parent.setOrAddChild(this);
    }
    
    @Override
    public NUOPCModel.Run reverse() {
      NUOPCModel.Run _xblockexpression = null;
      {
        NUOPCModel.RunPhases _runPhases = new NUOPCModel.RunPhases(this);
        NUOPCModel.RunPhases _reverse = _runPhases.reverse();
        this.runPhases = ((NUOPCModel.RunPhases) _reverse);
        NUOPCModel.RunSpecializations _runSpecializations = new NUOPCModel.RunSpecializations(this);
        CodeConcept<?, ?> _reverse_1 = _runSpecializations.reverse();
        this.runSpecs = ((NUOPCModel.RunSpecializations) _reverse_1);
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    public void forward(final Model high) {
      this.runSpecs.forward(high);
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
      parent.setOrAddChild(this);
      ArrayList<NUOPCModel.SetRunClock> _newArrayList = CollectionLiterals.<NUOPCModel.SetRunClock>newArrayList();
      this.setRunClock = _newArrayList;
      ArrayList<NUOPCModel.CheckImport> _newArrayList_1 = CollectionLiterals.<NUOPCModel.CheckImport>newArrayList();
      this.checkImport = _newArrayList_1;
      ArrayList<NUOPCModel.ModelAdvance> _newArrayList_2 = CollectionLiterals.<NUOPCModel.ModelAdvance>newArrayList();
      this.modelAdvance = _newArrayList_2;
    }
    
    @Override
    public CodeConcept<?, ?> reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCModel.RunSpecializations reverseChildren() {
      NUOPCModel.RunSpecializations _xblockexpression = null;
      {
        NUOPCModel.ModelAdvance _modelAdvance = new NUOPCModel.ModelAdvance(this);
        List _reverseMultiple = _modelAdvance.reverseMultiple();
        this.modelAdvance = _reverseMultiple;
        NUOPCModel.SetRunClock _setRunClock = new NUOPCModel.SetRunClock(this);
        List _reverseMultiple_1 = _setRunClock.reverseMultiple();
        this.setRunClock = _reverseMultiple_1;
        NUOPCModel.CheckImport _checkImport = new NUOPCModel.CheckImport(this);
        List _reverseMultiple_2 = _checkImport.reverseMultiple();
        this.checkImport = _reverseMultiple_2;
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    public void forward(final Model high) {
      EList<Advance> _advance = high.getAdvance();
      final Consumer<Advance> _function = (Advance a) -> {
        final NUOPCModel.ModelAdvance adv = new NUOPCModel.ModelAdvance(this);
        String _phaseLabel = a.getPhaseLabel();
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_phaseLabel);
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
          String _phaseLabel_1 = a.getPhaseLabel();
          String _plus = ("\"" + _phaseLabel_1);
          String _plus_1 = (_plus + "\"");
          adv.specPhaseLabel = _plus_1;
        }
      };
      _advance.forEach(_function);
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
          NUOPCModel.RunPhase1 _runPhase1 = new NUOPCModel.RunPhase1(this);
          CodeConcept<?, ?> _reverse = _runPhase1.<CodeConcept<?, ?>>reverse();
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
      parent.setOrAddChild(this);
      this.subroutineName = "ModelAdvance";
      List<NUOPCModel.ModelAdvance> _modelAdvance = parent.modelAdvance;
      int _size = 0;
      if (_modelAdvance!=null) {
        _size=_modelAdvance.size();
      }
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        String _subroutineName = this.subroutineName;
        int _size_1 = parent.modelAdvance.size();
        this.subroutineName = (_subroutineName + Integer.valueOf(_size_1));
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
      _builder.append("call NUOPC_ModelGet(");
      _builder.append(this.paramGridComp, "    ");
      _builder.append(", modelClock=clock, importState=importState, &");
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
      _builder.append("! advance the model: currTime -> currTime + timeStep");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("call ESMF_ClockPrint(clock, options=\"currTime\", &");
      _builder.newLine();
      _builder.append("      ");
      _builder.append("preString=\"------>Advancing ");
      NUOPCComponent _module = this.module();
      _builder.append(_module.name, "      ");
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
    public NUOPCComponent module() {
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
      List<NUOPCModel.SetRunClock> _setRunClock = parent.setRunClock;
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
      List<NUOPCModel.CheckImport> _checkImport = parent.checkImport;
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
      try {
        NUOPCModel.FinalizePhases _xblockexpression = null;
        {
          NUOPCModel.FinalizePhase1 _finalizePhase1 = new NUOPCModel.FinalizePhase1(this);
          CodeConcept<?, ?> _reverse = _finalizePhase1.<CodeConcept<?, ?>>reverse();
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
        NUOPCModel.FinalizeModel _finalizeModel = new NUOPCModel.FinalizeModel(this);
        CodeConcept<?, ?> _reverse = _finalizeModel.reverse();
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
        CodeConcept<?, ?> _reverse_1 = _finalizeSpecializations.reverse();
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
  
  public static NUOPCModel newModel(final IResource context, final Model high) {
    NUOPCModel _xblockexpression = null;
    {
      final NUOPCModel m = NUOPCModel.newBasicModel(context);
      m.forward(high);
      _xblockexpression = m;
    }
    return _xblockexpression;
  }
  
  public static NUOPCModel newBasicModel(final IResource context) {
    NUOPCModel _xblockexpression = null;
    {
      final NUOPCModel model = new NUOPCModel(context);
      new NUOPCModel.SetServices(model);
      new NUOPCModel.Initialization(model);
      new NUOPCModel.InitPhases(model.initialization);
      new NUOPCModel.InitSpecializations(model.initialization);
      new NUOPCModel.Run(model);
      new NUOPCModel.RunPhases(model.run);
      new NUOPCModel.RunSpecializations(model.run);
      new NUOPCModel.Finalize(model);
      new NUOPCModel.FinalizePhases(model.finalize);
      new NUOPCModel.FinalizeSpecializations(model.finalize);
      _xblockexpression = model;
    }
    return _xblockexpression;
  }
  
  public void forward(final Model high) {
    String _name = high.getName();
    this.name = _name;
    this.setServices.forward(high);
    this.initialization.forward(high);
    this.run.forward(high);
  }
  
  @Override
  public String prefix() {
    return "model";
  }
  
  @Override
  public NUOPCModel reverse() throws ReverseEngineerException {
    CodeConcept<?, ?> _reverse = super.reverse();
    return ((NUOPCModel) _reverse);
  }
  
  @Override
  public NUOPCComponent reverseChildren() {
    NUOPCModel _xblockexpression = null;
    {
      NUOPCModel.SetServices _setServices = new NUOPCModel.SetServices(this);
      SetServicesCodeConcept<NUOPCModel> _reverse = _setServices.reverse();
      this.setServices = ((NUOPCModel.SetServices) _reverse);
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
  public NUOPCModel forward() {
    NUOPCComponent _forward = super.forward();
    return ((NUOPCModel) _forward);
  }
}
