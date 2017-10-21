Overview
========
`Cupid <https://www.earthsystemcog.org/projects/cupid/>`_ is a plugin for the 
`Eclipse Integrated Development Environment (IDE) <https://www.eclipse.org/>`_ 
and provides development tools for building and analyzing applications based on the 
`National Unified Operational Prediction Capability (NUOPC) software Layer <https://earthsystemcog.org/projects/nuopc/>`_.
The main features include analysis of traces for debugging and profiling coupled systems, 
and generation of NUOPC-compliant code. 

Key Features
------------

Cupid is as a *framework-aware* development environment with a set of tools specific to ESMF and NUOPC.
The key features include: 

  * Tools to **profile and debug NUOPC applications** through trace analysis and visualization.
    ESMF has a built-in tracing capability that automatically instruments model components to collect
    timing, memory, and component metadata. Once a trace has been generated, it can be imported into
    Cupid for analysis of component execution times, timing of user-defined regions, load balancing,
    and basic memory usage. 

  * A **reverse engineering engine** that reads existing NUOPC cap code and presents relevant initialize,
    run, finalize phases and specialization points in an outline view.  The outline is synchronized
    automatically as the code changes.  The tool indicates code-level compliance issues that may
    result in runtime errors.  (The compliance checking is limited to code errors than can be
    determined by static analysis.)
  
  * A **code generation engine** that outputs NUOPC-compliant code fragments (i.e., initialization phases
    and specialization points). The generated code can often be used as is, although further customization 
    of the generated code is supported. The generated code is inserted into the user's existing code at the 
    appropriate places, keeping the existing code structure intact.  The code generation feature helps the 
    developer understand what framework code is required and where it should be located. 
  


What is NUOPC?
--------------

NUOPC is a consortium of Navy, NOAA, and Air Force modelers and their research partners. 
It aims to advance the weather prediction modeling systems used by meteorologists, mission planners, 
and decision makers. NUOPC partners are working toward a common model architecture - 
a standard way of building models - in order to make it easier to collaboratively build 
modeling systems.  To this end, they have developed a NUOPC Layer that defines conventions and 
templates for using the `Earth System Modeling Framework (ESMF) <https://earthsystemcog.org/projects/esmf/>`_. 

.. note:: 
    The following resources are a good starting point for learning about the NUOPC Layer.
    
    * The NUOPC home page:  https://www.earthsystemcog.org/projects/nuopc
    
    * The NUOPC reference manual and how to guide: https://www.earthsystemcog.org/projects/nuopc/refmans

What is Eclipse?
----------------

Eclipse is a graphical user interface or integrated development environment (IDE) used in 
computer programming for writing software. It contains a base workspace and an extensible 
plugin system for customizing the environment. Eclipse supports development in a variety of
programming languages through the use of plugins. Many of these are found in the 
`Eclipse Marketplace <https://marketplace.eclipse.org/>`_, a kind of "app store" for Eclipse.





    
    

   
