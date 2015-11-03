Overview
========

.. image:: images/NUOPC.jpg
    :scale: 70%

The `National Unified Operational Prediction Capability <http://www.nws.noaa.gov/nuopc/>`_ 
(NUOPC) a strategic initiative to fundamentally advance the nation's computational 
weather prediction systems and improve forecast models used by National Weather Service, 
Air Force and Navy meteorologists, mission planners, and decision makers.  The 
`NUOPC Layer <https://www.earthsystemcog.org/projects/nuopc/>`_ is 
a software layer built on top of the 
`Earth System Modeling Framework <https://www.earthsystemcog.org/projects/esmf/>`_ (ESMF).  
ESMF is a high-performance modeling framework that provides
data structures, interfaces, and operations suited for building coupled models
from a set of components.  **NUOPC refines the capabilities of
ESMF by providing a more precise definition of what it means for a model
to be a component and how components should interact and share data
in a coupled system.**  The NUOPC Layer software is designed to work
with typical high-performance models in the Earth sciences domain, most
of which are written in Fortran and are based on a distributed memory 
model of parallelism (MPI).  

The NUOPC Layer implements a set of :term:`generic component`\ s that 
serve as building blocks that can be assembled together in different ways
to build up a coupled modeling application.  In some cases, a generic
component can be used as is, and in other cases the generic component
must be :term:`specialized <specialization>` (customized) for a particular model or application.
Additionally, the NUOPC Layer defines a set of technical rules for how components
should behave and interact with each other.  These technical rules form the
backbone of component interoperability.  NUOPC defines this effective interoperability
as the ability of a model component to execute without code changes in a driver that 
provides the fields that it requires, and to return with informative messages if its 
input requirements are not met. A component that follows the NUOPC Layer technical 
rules is considered to be NUOPC Layer compliant.

..  note:: **A Note on Terminology**

    For brevity, throughout this document we will often use the
    term "NUOPC" to refer to the "NUOPC Layer software" that is
    the current technical implementation of the NUOPC specification.
    
    Also, the term "NUOPC component" is shorthand for a component
    that is NUOPC Layer compliant and can be used in NUOPC-based
    systems.




Document Roadmap
----------------

**This document is a starting point for model developers
and technical managers who are new to the NUOPC Layer software
and need to understand the steps involved in making an existing
model codebase NUOPC Layer compliant.**  

The document is divided into the following sections:

* The section  :ref:`bigidea` describes important parts of the NUOPC design that
  are critical for anyone planning to write code using the NUOPC API.

* The section :ref:`writecap` describes the development steps involved
  in making your model code NUOPC Layer compliant.  
  
* In :ref:`atmexample`, we walk through the code of a basic example cap, describing each part in detail.

* Finally, there is an :ref:`appendix <appendixgeneric>` included as
  a reference that details the :term:`initialization sequence` and the set
  of available :term:`specialization point`\ s for NUOPC Model components.



Additional NUOPC Resources
--------------------------

This document is not
exhaustive, but should help you navigate the process of creating
a NUOPC component from your model.  As such this document is a companion 
to other NUOPC resources available:

    * `The NUOPC website <https://www.earthsystemcog.org/projects/nuopc>`_
      is the main source of information on NUOPC, including instructions
      for acquiring and using the NUOPC Layer software.
      
    * `The NUOPC Reference Manual <https://www.earthsystemcog.org/projects/nuopc/refmans>`_
      is the primary technical reference for the NUOPC API and includes
      a detailed description of the NUOPC generic components.   
    
    * `The NUOPC Prototype Codes page <https://www.earthsystemcog.org/projects/nuopc/proto_codes>`_
      and `Subversion repository <https://sourceforge.net/p/esmfcontrib/svn/HEAD/tree/NUOPC/tags/ESMF_7_0_0_beta_snapshot_58/>`_
      include a set of prototype applications that use the NUOPC Layer software. These
      applications are architectural skeletons that represent typical
      configurations of NUOPC components and provide numerous examples
      of using the NUOPC API.
             
    * Several `Compliance Testing Tools <https://www.earthsystemcog.org/projects/nuopc/compliance_testing>`_
      are provided to help you test your code to determine if it is NUOPC 
      Layer compliant.
    
    * `Cupid <https://www.earthsystemcog.org/projects/cupid/>`_
      is a plugin for the `Eclipse Integrated Development Environment <https://eclipse.org/>`_
      that automatically generates NUOPC Layer compliant code and checks existing
      source code for compliance.
      
    * A `BAMS <https://www2.ametsoc.org/ams/index.cfm/publications/bulletin-of-the-american-meteorological-society-bams/>`_ 
      article entitled `The Earth System Prediction Suite: 
      Toward a Coordinated U.S. Modeling Capability <http://www.earthsystemcog.org/site_media/projects/esps/paper_1509_esps_final_revised_submitted3.docx>`_ 
      describes NUOPC and how NUOPC Layer compliant components are being used in coupled modeling
      systems across U.S. agencies.
   