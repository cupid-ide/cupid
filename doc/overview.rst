Overview
========
`Cupid <https://www.earthsystemcog.org/projects/cupid/>`_ is a plugin for the 
`Eclipse Integrated Development Environment (IDE) <https://www.eclipse.org/>`_ 
and provides developers with assistance in writing code compliant with the `National Unified 
Operational Prediction Capability (NUOPC) software Layer <https://earthsystemcog.org/projects/nuopc/>`_. 

.. note:: 
   
   The name *Cupid* is not an acronym.  It originates from a Ph.D. project aimed
   at generating couplers for Earth System Models.  Cupid, in classical mythology,
   is the god of desire and attraction.  Since this software is designed to build
   couplers for "bringing models together," the name Cupid seemed appropriate.

**What is NUOPC?**

NUOPC is a consortium of Navy, NOAA, and Air Force modelers and their research partners. It aims to advance the weather prediction modeling systems used by meteorologists, mission planners, and decision makers. NUOPC partners are working toward a common model architecture - a standard way of building models - in order to make it easier to collaboratively build modeling systems.  To this end, they have developed a NUOPC Layer that defines conventions and templates for using the `Earth System Modeling Framework (ESMF) <https://earthsystemcog.org/projects/esmf/>`_. **Cupid version 0.2 is compatible with ESMF version 7.0.**

.. note:: 
    The following resources are a good starting point for learning about the NUOPC Layer.
    
    * The NUOPC home page:  https://www.earthsystemcog.org/projects/nuopc
    
    * The NUOPC reference manual and how to guide: https://www.earthsystemcog.org/projects/nuopc/refmans

**What is Eclipse?**

Eclipse is a graphical user interface for writing software and Cupid acts as a *framework-aware*
code editing environment.  This means that the requirements of writing NUOPC-compliant code
are built into the tool so that it can automatically generate code fragments and indicate places
in the code with potential errors before the code is compiled.  To accomplish this, Cupid
relies heavily on Fortran static analysis capabilities provided by `Photran <http://www.eclipse.org/photran/>`_, 
the Eclipse plugin that provides Fortran language tooling.

**Target Audience**

Cupid is intended for model developers who have prior experience with model development, 
but are new to developing with NUOPC and have a need to work with existing NUOPC-compliant software
or write code to make a Fortran-based model code NUOPC compliant.  Specifically, Cupid can
help write a NUOPC "cap" for a model, i.e., the interface layer that translates a model's
init/run/finalize methods and data types so that they can be understood by NUOPC and used in
a coupled system with other NUOPC components.

Cupid is also aimed at developers interested in exploring the benefits of using the Eclipse IDE 
for improving development productivity.

**Key Features**

  * A **reverse engineering engine** that reads existing NUOPC cap code and presents relevant initialize,
    run, finalize phases and specialization points in an outline view.  The outline is synchronized
    automatically as the code changes.  The tool indicates code-level compliance issues that may
    result in runtime errors.  (The compliance checking is limited to code errors than can be
    determined by static analysis.)
  
  * A **code generation engine** that outputs NUOPC-compliant code fragments (i.e., initialization phases
    and specialization points). The generated code can often be used as is, although further customization 
    of the generated code is suported. The generated code is inserted into the user's existing code at the 
    appropriate places, keeping the existing code structure intact.  The code generation feature helps the 
    developer understand what framework code is required and where it should be located. 
  


    
    

   
