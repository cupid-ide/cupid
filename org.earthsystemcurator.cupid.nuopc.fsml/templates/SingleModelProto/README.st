README for single Model NUOPC prototype
---------------------------------------

Dependencies: 
  - ESMF v.6.2.0
  
Build:
  - Set environment variable ESMFMKFILE to point to the esmf.mk of your ESMF
    installation.
  - gmake
  
Execution:
  - Optionally set environment variable ESMF_RUNTIME_COMPLIANCECHECK to ON.
  - mpirun -np X ./esmApp (where X is the total number of PETs)
  
Output:
  - PET*.Log files containing compliance checker output if turned on.
  - The prototype outputs time stepping information to stdout.
  


Code structure:
  - Makefile    - Makefile that is based on the standard esmf.mk mechanism.
  - <p.modelName>.F90   - The MODEL component, specializing generic NUOPC_Model.
  - <p.driverName>.F90  - Driver specializing NUOPC_Driver, driving the single MODEL.
  - mainApp.F90 - Main application cap.
