package org.earthsystemmodeling.cupid.cc.nuopc;

import com.google.common.base.Objects;
import org.earthsystemmodeling.cupid.cc.CodeConcept;
import org.earthsystemmodeling.cupid.cc.fortran.FortranMappingTypes;
import org.earthsystemmodeling.cupid.cc.mapping.MappingType;

@SuppressWarnings("all")
public class NUOPC {
  private static NUOPC instance;
  
  /**
   * mapping types
   */
  public MappingType SetServicesMT;
  
  public MappingType ESMFMethodMT;
  
  public MappingType SpecializationMethodMT;
  
  /**
   * refines ESMFMethodMT
   */
  public MappingType AddComponentToDriverMT;
  
  /**
   * refines CallInSubroutineMT
   */
  public MappingType NUOPCEntryPointMT;
  
  public MappingType AdvertiseFieldsMT;
  
  /**
   * concepts
   */
  public CodeConcept NUOPCComponent;
  
  public CodeConcept NUOPCModel;
  
  public CodeConcept NUOPCModelRoot;
  
  public CodeConcept NUOPCDriver;
  
  public CodeConcept NUOPCDriverRoot;
  
  public CodeConcept SetServices;
  
  public CodeConcept SetModelServices;
  
  public CodeConcept SetModelServices$AddComponent;
  
  public CodeConcept ESMFEntryPoint;
  
  public static NUOPC getInstance() {
    NUOPC _xblockexpression = null;
    {
      boolean _equals = Objects.equal(NUOPC.instance, null);
      if (_equals) {
        NUOPC _nUOPC = new NUOPC();
        NUOPC.instance = _nUOPC;
      }
      _xblockexpression = NUOPC.instance;
    }
    return _xblockexpression;
  }
  
  protected NUOPC() {
    FortranMappingTypes.getInstance();
  }
}
