package org.earthsystemmodeling.cupid.nuopc.v7r;

import com.google.common.base.Objects;
import org.earthsystemmodeling.cupid.annotation.Label;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.photran.internal.core.parser.ASTFunctionSubprogramNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IASTNode;
import org.eclipse.photran.internal.core.parser.IModuleBodyConstruct;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class GridCodeConcept {
  @Accessors
  @Label(label = "Create Uniform Grid")
  public static class CreateUniformGrid extends CodeConcept<CodeConcept<?, ?>, ASTFunctionSubprogramNode> {
    private String name;
    
    private int[] minIndex;
    
    private int[] maxIndex;
    
    private double[] minCornerCoord;
    
    private double[] maxCornerCoord;
    
    public CreateUniformGrid(final CodeConcept<?, ?> parent) {
      super(parent);
      parent.setOrAddChild(this);
    }
    
    @Override
    public GridCodeConcept.CreateUniformGrid reverse() {
      return null;
    }
    
    @Override
    public GridCodeConcept.CreateUniformGrid forward() {
      try {
        GridCodeConcept.CreateUniformGrid _xblockexpression = null;
        {
          final CodeConcept<?, ?> ancestorConcept = this.<CodeConcept<?, ?>>findNearestAncestor(ASTModuleNode.class);
          IASTNode _aSTRef = null;
          if (ancestorConcept!=null) {
            _aSTRef=ancestorConcept.getASTRef();
          }
          final ASTModuleNode moduleNode = ((ASTModuleNode) _aSTRef);
          boolean _equals = Objects.equal(moduleNode, null);
          if (_equals) {
            throw new CodeGenerationException("Cannot generate CreateUniformGrid function without parent node");
          }
          String _stripQuotes = GridCodeConcept.stripQuotes(this.name);
          final String functionName = ("CreateGrid_" + _stripQuotes);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("function ");
          _builder.append(functionName, "");
          _builder.append("(rc)");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("type(ESMF_Grid) :: ");
          _builder.append(functionName, "    ");
          _builder.newLineIfNotEmpty();
          _builder.append("    ");
          _builder.append("integer, intent(out), optional :: rc");
          _builder.newLine();
          _builder.append("    ");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("rc = ESMF_SUCCESS");
          _builder.newLine();
          _builder.append("    ");
          _builder.append(functionName, "    ");
          _builder.append(" = ESMF_GridCreateNoPeriDimUfrm(name=");
          _builder.append(this.name, "    ");
          _builder.append(", &");
          _builder.newLineIfNotEmpty();
          _builder.append("    \t");
          _builder.append("minIndex=");
          CharSequence _litArray = GridCodeConcept.litArray(this.minIndex);
          _builder.append(_litArray, "    \t");
          _builder.append(", &");
          _builder.newLineIfNotEmpty();
          _builder.append("    \t");
          _builder.append("maxIndex=");
          CharSequence _litArray_1 = GridCodeConcept.litArray(this.maxIndex);
          _builder.append(_litArray_1, "    \t");
          _builder.append(", &");
          _builder.newLineIfNotEmpty();
          _builder.append("    \t");
          _builder.append("minCornerCoord=");
          CharSequence _litArrayR8 = GridCodeConcept.litArrayR8(this.minCornerCoord);
          _builder.append(_litArrayR8, "    \t");
          _builder.append(", &");
          _builder.newLineIfNotEmpty();
          _builder.append("    \t");
          _builder.append("maxCornerCoord=");
          CharSequence _litArrayR8_1 = GridCodeConcept.litArrayR8(this.maxCornerCoord);
          _builder.append(_litArrayR8_1, "    \t");
          _builder.append(", &");
          _builder.newLineIfNotEmpty();
          _builder.append("    \t");
          _builder.append("rc=rc)");
          _builder.newLine();
          _builder.append("    ");
          _builder.newLine();
          _builder.append("end function    ");
          _builder.newLine();
          _builder.newLine();
          final String code = _builder.toString();
          IProgramUnit _parseLiteralProgramUnit = CodeExtraction.<IProgramUnit>parseLiteralProgramUnit(code);
          final ASTFunctionSubprogramNode fsn = ((ASTFunctionSubprogramNode) _parseLiteralProgramUnit);
          IASTListNode<IModuleBodyConstruct> _moduleBody = moduleNode.getModuleBody();
          _moduleBody.add(fsn);
          _xblockexpression = this;
        }
        return _xblockexpression;
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }
    
    @Pure
    public String getName() {
      return this.name;
    }
    
    public void setName(final String name) {
      this.name = name;
    }
    
    @Pure
    public int[] getMinIndex() {
      return this.minIndex;
    }
    
    public void setMinIndex(final int[] minIndex) {
      this.minIndex = minIndex;
    }
    
    @Pure
    public int[] getMaxIndex() {
      return this.maxIndex;
    }
    
    public void setMaxIndex(final int[] maxIndex) {
      this.maxIndex = maxIndex;
    }
    
    @Pure
    public double[] getMinCornerCoord() {
      return this.minCornerCoord;
    }
    
    public void setMinCornerCoord(final double[] minCornerCoord) {
      this.minCornerCoord = minCornerCoord;
    }
    
    @Pure
    public double[] getMaxCornerCoord() {
      return this.maxCornerCoord;
    }
    
    public void setMaxCornerCoord(final double[] maxCornerCoord) {
      this.maxCornerCoord = maxCornerCoord;
    }
  }
  
  public static CharSequence litArray(final int[] intArray) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(/");
    {
      boolean _hasElements = false;
      for(final int x : intArray) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append(x, "");
      }
    }
    _builder.append("/)");
    return _builder;
  }
  
  public static CharSequence litArrayR8(final double[] dblArray) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(/");
    {
      boolean _hasElements = false;
      for(final double x : dblArray) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(", ", "");
        }
        _builder.append(x, "");
        _builder.append("_ESMF_KIND_R8");
      }
    }
    _builder.append("/)");
    return _builder;
  }
  
  public static String stripQuotes(final String str) {
    String _replaceAll = str.replaceAll("\"", "");
    return _replaceAll.replaceAll("\'", "");
  }
}
