Overview
========

`Cupid <https://www.earthsystemcog.org/projects/cupid/>`_ is a plugin for the 
`Eclipse Integrated Development Environment (IDE) <https://www.eclipse.org/>`_ 
and provides developers with assistance in writing code compliant with the `National Unified 
Operational Prediction Capability (NUOPC) software Layer <https://earthsystemcog.org/projects/nuopc/>`_.  
Eclipse is a graphical user interface for writing software and Cupid acts as a *framework-aware*
code editing environment.  This means that the requirements of writing NUOPC-compliant code
are built into the tool so that it can automatically generate code fragments and indicate places
in the code with potential errors before the code is compiled.  To accomplish this, Cupid
relies heavily on Fortran static analysis capabilities provided by `Photran <http://www.eclipse.org/photran/>`_, 
the Eclipse plugin that provides Fortran language tooling.

Cupid is intended for model developers who have prior experience with model development, 
but are new to developing with NUOPC and have a need to work with existing NUOPC-compliant software
or write code to make a Fortran-based model code NUOPC compliant.  Specifically, Cupid can
help write a NUOPC "cap" for a model, i.e., the interface layer that translates a model's
init/run/finalize methods and data types so that they can be understood by NUOPC and used in
a coupled system with other NUOPC components.

Cupid is also aimed at developers interested in exploring the benefits of using the Eclipse IDE 
for improving development productivity.

The key features of Cupid include:

  * A **reverse engineering function** that reads existing NUOPC cap code and presents relevant initialize,
    run, finalize phases and specialization points in an outline view.  The outline is synchronized
    automatically as the code changes.  The tool indicates code-level compliance issues that may
    result in runtime errors.  (The compliance checking is limited to code errors than can be
    determined by static analysis.)
  
  * A **code generation function** that outputs NUOPC-compliant code fragments (i.e., initialization phases
    and specialization points). The generated code can often be used as is, although further customization 
    of the generated code is suported. The generated code is inserted into the user's existing code at the 
    appropriate places, keeping the existing code structure intact.  The code generation feature helps the 
    developer understand what framework code is required and where it should be located. 
  

.. seealso:: **Additional Resource about NUOPC**

    This manual is not the primary guide to the NUOPC software layer itself.  The
    following resources are a good starting point for learning about NUOPC.
    
    * The NUOPC home page:  https://www.earthsystemcog.org/projects/nuopc
    
    * The NUOPC reference manual and how to guide: https://www.earthsystemcog.org/projects/nuopc/refmans
    
    

   