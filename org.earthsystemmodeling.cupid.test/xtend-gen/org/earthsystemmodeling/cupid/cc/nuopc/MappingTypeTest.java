package org.earthsystemmodeling.cupid.cc.nuopc;

import com.google.common.collect.Iterables;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;
import org.earthsystemmodeling.cupid.cc.mapping.MappingTypeBinding;
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCTest;
import org.earthsystemmodeling.cupid.test.TestHelpers;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.ASTExecutableProgramNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.IASTListNode;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.BeforeClass;

@SuppressWarnings("all")
public class MappingTypeTest {
  private static MappingType ESMFMethodMT;
  
  @BeforeClass
  public static void setUp() {
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
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
