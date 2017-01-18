package org.earthsystemmodeling.cupid.cc.nuopc;

import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.function.Consumer;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.mapping.MappingResultSet;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.nuopc.ESMFQuery;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCTest;
import org.earthsystemmodeling.cupid.test.TestHelpers;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTExecutableProgramNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.BeforeClass;

@SuppressWarnings("all")
public class MappingTypeTest {
  private static MappingType ESMFMethodMT;
  
  @BeforeClass
  public static void setUp() {
    Pair<String, Class<ASTModuleNode>> _mappedTo = Pair.<String, Class<ASTModuleNode>>of("context", ASTModuleNode.class);
    Pair<String, Class<ASTSubroutineSubprogramNode>> _mappedTo_1 = Pair.<String, Class<ASTSubroutineSubprogramNode>>of("match", ASTSubroutineSubprogramNode.class);
    MappingType _mappingType = new MappingType("ESMFMethodMT", 
      Collections.<String, Class<?>>unmodifiableMap(CollectionLiterals.<String, Class<?>>newHashMap(_mappedTo, _mappedTo_1)));
    final Procedure1<MappingType> _function = (MappingType it) -> {
      final Procedure1<MappingTypeBinding> _function_1 = (MappingTypeBinding bind) -> {
        final ASTModuleNode module = bind.<ASTModuleNode>context();
        Iterable<ASTSubroutineSubprogramNode> _findESMFMethods = ESMFQuery.findESMFMethods(module);
        final Consumer<ASTSubroutineSubprogramNode> _function_2 = (ASTSubroutineSubprogramNode m) -> {
          bind.addResult(m);
        };
        _findESMFMethods.forEach(_function_2);
      };
      it.setFind(_function_1);
    };
    MappingType _doubleArrow = ObjectExtensions.<MappingType>operator_doubleArrow(_mappingType, _function);
    MappingTypeTest.ESMFMethodMT = _doubleArrow;
  }
  
  public void MappingTypeTest() {
    try {
      final IProject p = TestHelpers.createFortranProjectFromFolder((("target/" + NUOPCTest.NUOPC_TAG) + "/AtmOcnProto"), (NUOPCTest.NUOPC_TAG + "_AtmOcnProto"));
      final IFile f = p.getFile("esm.F90");
      PhotranVPG _instance = PhotranVPG.getInstance();
      final IFortranAST ast = _instance.acquireTransientAST(f);
      ASTExecutableProgramNode _root = ast.getRoot();
      IASTListNode<IProgramUnit> _programUnitList = null;
      if (_root!=null) {
        _programUnitList=_root.getProgramUnitList();
      }
      Iterable<ASTModuleNode> _filter = null;
      if (_programUnitList!=null) {
        _filter=Iterables.<ASTModuleNode>filter(_programUnitList, ASTModuleNode.class);
      }
      final ASTModuleNode module = IterableExtensions.<ASTModuleNode>head(_filter);
      final CodeConcept concept = new CodeConcept("MyConcept");
      final MappingTypeBinding binding = new MappingTypeBinding(MappingTypeTest.ESMFMethodMT, concept) {
        @Override
        public ASTModuleNode context() {
          return module;
        }
      };
      final CodeConceptInstance instance = concept.newInstance(null);
      MappingResultSet _resultSet = binding.getResultSet();
      Assert.assertEquals(Integer.valueOf(3), _resultSet);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
