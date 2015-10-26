Overview
===================================================

NUOPC is a software layer included with ESMF that ensures interoperability
of models in coupled applications.  In most cases, NUOPC interfaces are to
be added to an existing model codebase in order to make the model NUOPC-compliant
and therefore able to communicate with other NUOPC components in a coupled system.

This documentation will help you understand the steps required to add a 
:term:`NUOPC Model cap` to an existing model.  The NUOPC Model *cap* is 
simply a Fortran module with certain required subroutines.  We call it a 
"cap" because it sits on top of your model code and mediates interactions 
of your model with the coupling infrastructure.

The tasks covered in this document include:

 #.  Setting up your build environment
 
 #.  Writing the NUOPC Model cap code
 
 #.  Testing the NUOPC Model cap

Additionally, we provide some considerations for making it easier to 
obtain and link against your NUOPC-compliant model in coupled systems.


.. _refman: http://www.earthsystemmodeling.org/esmf_releases/last_built/NUOPC_refdoc/node4.html 
.. _rm: refman_

This is the refman_ I know and rm_ too.

