package org.earthsystemmodeling.cupid.nuopc.v7r;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.io.IOUtils;
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
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
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
import org.eclipse.photran.internal.core.lexer.Token;
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
  @Label(label = "Doxygen Template")
  public static class DoxygenTemplate extends CodeConcept<NUOPCModel, ASTModuleNode> {
    public DoxygenTemplate(final NUOPCModel parent) {
      super(parent);
      parent.setOrAddChild(this);
    }
    
    @Override
    public <T extends CodeConcept<?, ?>> T reverse() throws ReverseEngineerException {
      T _xblockexpression = null;
      {
        final ASTModuleNode moduleNode = this._parent.getASTRef();
        T _xifexpression = null;
        Token _findFirstToken = null;
        if (moduleNode!=null) {
          _findFirstToken=moduleNode.findFirstToken();
        }
        String _whiteBefore = null;
        if (_findFirstToken!=null) {
          _whiteBefore=_findFirstToken.getWhiteBefore();
        }
        boolean _contains = _whiteBefore.contains("!>");
        if (_contains) {
          _xifexpression = ((T) this);
        } else {
          _xifexpression = null;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    }
    
    @Override
    public <T extends CodeConcept<?, ?>> T forward() throws CodeGenerationException {
      try {
        T _xblockexpression = null;
        {
          final ASTModuleNode moduleNode = this._parent.getASTRef();
          boolean _equals = Objects.equal(moduleNode, null);
          if (_equals) {
            return ((T) this);
          }
          Token _findFirstToken = null;
          if (moduleNode!=null) {
            _findFirstToken=moduleNode.findFirstToken();
          }
          String _whiteBefore = null;
          if (_findFirstToken!=null) {
            _whiteBefore=_findFirstToken.getWhiteBefore();
          }
          final String whiteBefore = _whiteBefore;
          String newWhite = "";
          boolean _notEquals = (!Objects.equal(whiteBefore, null));
          if (_notEquals) {
            newWhite = whiteBefore;
          }
          final InputStream is = CupidActivator.getInputStream("templates/doxygen/capdoc.template");
          final String doctemplate = IOUtils.toString(is, StandardCharsets.UTF_8);
          String _newWhite = newWhite;
          newWhite = (_newWhite + doctemplate);
          Token _findFirstToken_1 = moduleNode.findFirstToken();
          if (_findFirstToken_1!=null) {
            _findFirstToken_1.setWhiteBefore(newWhite);
          }
          _xblockexpression = ((T) this);
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
  }
  
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
    public static class IPDv04p1 extends EntryPointCodeConcept<NUOPCModel.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCBaseModel.AdvertiseField> advertiseFields;
      
      public IPDv04p1(final NUOPCModel.IPD parent) {
        super(parent);
        this.phaseLabel = this.getPhaseLabel();
        this.subroutineName = "AdvertiseFields";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        parent.setOrAddChild(this);
        this.advertiseFields = CollectionLiterals.<NUOPCBaseModel.AdvertiseField>newArrayList();
      }
      
      public void forward(final Model high) {
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
        this.phaseLabel = this.getPhaseLabel();
        this.subroutineName = "RealizeFieldsProvidingGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        parent.setOrAddChild(this);
        this.realizeFields = CollectionLiterals.<NUOPCBaseModel.RealizeField>newArrayList();
        this.grids = CollectionLiterals.<String>newArrayList();
      }
      
      public void forward(final Model high) {
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
    public static class IPDv04p5 extends EntryPointCodeConcept<NUOPCModel.IPD> {
      @Child(min = 0, max = (-1))
      public List<NUOPCBaseModel.RealizeField> realizeFields;
      
      public IPDv04p5(final NUOPCModel.IPD parent) {
        super(parent);
        this.phaseLabel = this.getPhaseLabel();
        this.subroutineName = "RealizeFieldsAcceptingGrid";
        this.methodType = "ESMF_METHOD_INITIALIZE";
        parent.setOrAddChild(this);
        this.realizeFields = CollectionLiterals.<NUOPCBaseModel.RealizeField>newArrayList();
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
          CodeConcept<?, ?> _reverse = new NUOPCModel.IPD.IPDv04p0(this).reverse();
          this.ipdv00p0 = ((NUOPCModel.IPD.IPDv04p0) _reverse);
          CodeConcept<?, ?> _reverse_1 = new NUOPCModel.IPD.IPDv04p1(this).reverse();
          this.ipdv00p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse_1);
          CodeConcept<?, ?> _reverse_2 = new NUOPCModel.IPD.IPDv04p3(this).reverse();
          this.ipdv00p2 = ((NUOPCModel.IPD.IPDv04p3) _reverse_2);
          CodeConcept<?, ?> _reverse_3 = new NUOPCModel.IPD.IPDv04p6(this).<CodeConcept<?, ?>>reverse();
          this.ipdv00p3 = ((NUOPCModel.IPD.IPDv04p6) _reverse_3);
          CodeConcept<?, ?> _reverse_4 = new NUOPCModel.IPD.IPDv04p7(this).<CodeConcept<?, ?>>reverse();
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
          CodeConcept<?, ?> _reverse = new NUOPCModel.IPD.IPDv04p0(this).reverse();
          this.ipdv01p0 = ((NUOPCModel.IPD.IPDv04p0) _reverse);
          CodeConcept<?, ?> _reverse_1 = new NUOPCModel.IPD.IPDv04p1(this).reverse();
          this.ipdv01p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse_1);
          CodeConcept<?, ?> _reverse_2 = new NUOPCModel.IPD.IPDv04p2(this).<CodeConcept<?, ?>>reverse();
          this.ipdv01p2 = ((NUOPCModel.IPD.IPDv04p2) _reverse_2);
          CodeConcept<?, ?> _reverse_3 = new NUOPCModel.IPD.IPDv04p3(this).reverse();
          this.ipdv01p3 = ((NUOPCModel.IPD.IPDv04p3) _reverse_3);
          CodeConcept<?, ?> _reverse_4 = new NUOPCModel.IPD.IPDv04p6(this).<CodeConcept<?, ?>>reverse();
          this.ipdv01p4 = ((NUOPCModel.IPD.IPDv04p6) _reverse_4);
          CodeConcept<?, ?> _reverse_5 = new NUOPCModel.IPD.IPDv04p7(this).<CodeConcept<?, ?>>reverse();
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
          CodeConcept<?, ?> _reverse = new NUOPCModel.IPD.IPDv04p0(this).reverse();
          this.ipdv02p0 = ((NUOPCModel.IPD.IPDv04p0) _reverse);
          CodeConcept<?, ?> _reverse_1 = new NUOPCModel.IPD.IPDv04p1(this).reverse();
          this.ipdv02p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse_1);
          CodeConcept<?, ?> _reverse_2 = new NUOPCModel.IPD.IPDv04p2(this).<CodeConcept<?, ?>>reverse();
          this.ipdv02p2 = ((NUOPCModel.IPD.IPDv04p2) _reverse_2);
          CodeConcept<?, ?> _reverse_3 = new NUOPCModel.IPD.IPDv04p3(this).reverse();
          this.ipdv02p3 = ((NUOPCModel.IPD.IPDv04p3) _reverse_3);
          CodeConcept<?, ?> _reverse_4 = new NUOPCModel.IPD.IPDv04p6(this).<CodeConcept<?, ?>>reverse();
          this.ipdv02p4 = ((NUOPCModel.IPD.IPDv04p6) _reverse_4);
          CodeConcept<?, ?> _reverse_5 = new NUOPCModel.IPD.IPDv04p7(this).<CodeConcept<?, ?>>reverse();
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
          CodeConcept<?, ?> _reverse = new NUOPCModel.IPD.IPDv04p0(this).reverse();
          this.ipdv03p0 = ((NUOPCModel.IPD.IPDv04p0) _reverse);
          CodeConcept<?, ?> _reverse_1 = new NUOPCModel.IPD.IPDv04p1(this).reverse();
          this.ipdv03p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse_1);
          CodeConcept<?, ?> _reverse_2 = new NUOPCModel.IPD.IPDv04p2(this).<CodeConcept<?, ?>>reverse();
          this.ipdv03p2 = ((NUOPCModel.IPD.IPDv04p2) _reverse_2);
          CodeConcept<?, ?> _reverse_3 = new NUOPCModel.IPD.IPDv04p3(this).reverse();
          this.ipdv03p3 = ((NUOPCModel.IPD.IPDv04p3) _reverse_3);
          CodeConcept<?, ?> _reverse_4 = new NUOPCModel.IPD.IPDv04p4(this).reverse();
          this.ipdv03p4 = ((NUOPCModel.IPD.IPDv04p4) _reverse_4);
          CodeConcept<?, ?> _reverse_5 = new NUOPCModel.IPD.IPDv04p5(this).reverse();
          this.ipdv03p5 = ((NUOPCModel.IPD.IPDv04p5) _reverse_5);
          CodeConcept<?, ?> _reverse_6 = new NUOPCModel.IPD.IPDv04p6(this).<CodeConcept<?, ?>>reverse();
          this.ipdv03p6 = ((NUOPCModel.IPD.IPDv04p6) _reverse_6);
          CodeConcept<?, ?> _reverse_7 = new NUOPCModel.IPD.IPDv04p7(this).<CodeConcept<?, ?>>reverse();
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
          CodeConcept<?, ?> _reverse = new NUOPCModel.IPD.IPDv04p0(this).reverse();
          this.ipdv04p0 = ((NUOPCModel.IPD.IPDv04p0) _reverse);
          CodeConcept<?, ?> _reverse_1 = new NUOPCModel.IPD.IPDv04p1(this).reverse();
          this.ipdv04p1 = ((NUOPCModel.IPD.IPDv04p1) _reverse_1);
          CodeConcept<?, ?> _reverse_2 = new NUOPCModel.IPD.IPDv04p2(this).<CodeConcept<?, ?>>reverse();
          this.ipdv04p2 = ((NUOPCModel.IPD.IPDv04p2) _reverse_2);
          CodeConcept<?, ?> _reverse_3 = new NUOPCModel.IPD.IPDv04p3(this).reverse();
          this.ipdv04p3 = ((NUOPCModel.IPD.IPDv04p3) _reverse_3);
          CodeConcept<?, ?> _reverse_4 = new NUOPCModel.IPD.IPDv04p4(this).reverse();
          this.ipdv04p4 = ((NUOPCModel.IPD.IPDv04p4) _reverse_4);
          CodeConcept<?, ?> _reverse_5 = new NUOPCModel.IPD.IPDv04p5(this).reverse();
          this.ipdv04p5 = ((NUOPCModel.IPD.IPDv04p5) _reverse_5);
          CodeConcept<?, ?> _reverse_6 = new NUOPCModel.IPD.IPDv04p6(this).<CodeConcept<?, ?>>reverse();
          this.ipdv04p6 = ((NUOPCModel.IPD.IPDv04p6) _reverse_6);
          CodeConcept<?, ?> _reverse_7 = new NUOPCModel.IPD.IPDv04p7(this).<CodeConcept<?, ?>>reverse();
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
    
    @Child(min = 0)
    public List<GridCodeConcept.CreateUniformGrid> createUniformGrid;
    
    public Initialization(final NUOPCModel parent) {
      super(parent);
      parent.setOrAddChild(this);
      this.createUniformGrid = CollectionLiterals.<GridCodeConcept.CreateUniformGrid>newArrayList();
    }
    
    @Override
    public NUOPCModel.Initialization reverse() {
      return this.reverseChildren();
    }
    
    public NUOPCModel.Initialization reverseChildren() {
      NUOPCModel.Initialization _xblockexpression = null;
      {
        this.initPhases = new NUOPCModel.InitPhases(this).reverse();
        this.initSpecs = new NUOPCModel.InitSpecializations(this).reverse();
        _xblockexpression = this;
      }
      return _xblockexpression;
    }
    
    public void forward(final Model high) {
      new NUOPCModel.InitSpecializations(this);
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
  public static class DataInitialize extends SpecializationMethodCodeConcept<NUOPCModel.InitSpecializations> {
    private List<String> exportFieldsToInit;
    
    public DataInitialize(final NUOPCModel.InitSpecializations parent) {
      super(parent, "NUOPC_Model", "label_DataInitialize");
      this.exportFieldsToInit = CollectionLiterals.<String>newArrayList();
      this.subroutineName = "DataInitialize";
      this.specLabel = "model_label_DataInitialize";
      this.paramGridComp = "gcomp";
      this.paramRC = "rc";
    }
    
    public void forward(final Model high) {
      final Consumer<Field> _function = (Field f) -> {
        this.exportFieldsToInit.add(f.getName());
      };
      high.getExportFields().forEach(_function);
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
        NUOPCModel.RunPhases _reverse = new NUOPCModel.RunPhases(this).reverse();
        this.runPhases = ((NUOPCModel.RunPhases) _reverse);
        CodeConcept<?, ?> _reverse_1 = new NUOPCModel.RunSpecializations(this).reverse();
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
      this.setRunClock = CollectionLiterals.<NUOPCModel.SetRunClock>newArrayList();
      this.checkImport = CollectionLiterals.<NUOPCModel.CheckImport>newArrayList();
      this.modelAdvance = CollectionLiterals.<NUOPCModel.ModelAdvance>newArrayList();
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
    
    public void forward(final Model high) {
      final Consumer<Advance> _function = (Advance a) -> {
        final NUOPCModel.ModelAdvance adv = new NUOPCModel.ModelAdvance(this);
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(a.getPhaseLabel());
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
          String _phaseLabel = a.getPhaseLabel();
          String _plus = ("\"" + _phaseLabel);
          String _plus_1 = (_plus + "\"");
          adv.specPhaseLabel = _plus_1;
        }
      };
      high.getAdvance().forEach(_function);
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
      _builder.append(this.module().name, "      ");
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
  
  @Child(min = 0)
  public NUOPCModel.DoxygenTemplate doc;
  
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
      new NUOPCModel.DoxygenTemplate(model);
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
    this.name = high.getName();
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
    try {
      NUOPCModel _xblockexpression = null;
      {
        this.doc = new NUOPCModel.DoxygenTemplate(this).<NUOPCModel.DoxygenTemplate>reverse();
        SetServicesCodeConcept<NUOPCModel> _reverse = new NUOPCModel.SetServices(this).reverse();
        this.setServices = ((NUOPCModel.SetServices) _reverse);
        this.initialization = new NUOPCModel.Initialization(this).reverse();
        this.run = new NUOPCModel.Run(this).reverse();
        this.finalize = new NUOPCModel.Finalize(this).reverse();
        _xblockexpression = this;
      }
      return _xblockexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Override
  public NUOPCModel forward() {
    NUOPCComponent _forward = super.forward();
    return ((NUOPCModel) _forward);
  }
}
