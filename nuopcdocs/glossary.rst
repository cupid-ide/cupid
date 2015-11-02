Glossary
=======================

.. glossary::
   :sorted:
   
   Earth System Modeling Framework
   ESMF
        A high-performance modeling framework that provides data structures, 
        interfaces, and operations suited for building coupled models from a 
        set of components.  
        `ESMF Home page <https://www.earthsystemcog.org/projects/esmf/>`_.
        

   generic component
        In the NUOPC Layer, a generic component is an implementation of an
        ESMF component with certain pre-defined behaviors that each fulfill a
        certain purpose.  There are four generic components in the NUOPC
        Layer:  Model, Mediator, Driver, and Connector.  In some cases, a
        generic component can be used as is, and in other cases, the
        generic component must be specialized (customized) for a particular
        application.

   initialization sequence
        The sequence of events that all NUOPC components execute during
        the first part of a NUOPC application run.  This sequence of
        events is prescribed by the :term:`Initialize Phase Definition` (IPD).
        
   Initialize Phase Definition
   IPD
        Prescribes the order of execution of the initialization phases
        for NUOPC components, and assigns specific meaning to each phase.
        Each IPD has a version number and higher numbered versions are
        backward compatible with all previous versions.
   
   
   National Unified Operational Prediction Capability
   NUOPC
        An inter-agency agreement and technical specification among 
        Navy, NOAA, and Air Force modelers and their research partners
        that defines a common model architecture and interoperability
        rules to make it easier to collaboratively build modeling
        systems.
        `NUOPC Home Page <https://www.earthsystemcog.org/projects/nuopc/>`_.

   
   NUOPC Layer
        An implementation of the :term:`NUOPC` specification using
        built on top of the :term:`Earth System Modeling Framework` (ESMF).
        It is included with the ESMF software distribution.
   
   NUOPC Layer compliant
        A description of a component that adheres to the set of technical
        rules defined by the NUOPC Layer.  The technical rules guarantee
        that components can interact in a NUOPC-based coupled system.
        `Technical Criteria for NUOPC Layer Compliance <https://www.earthsystemcog.org/projects/nuopc/esmf2nuopc>`_.

   NUOPC Model
        One of the four generic components included in the NUOPC Layer.
        The Model component wraps an existing model codebase (e.g.,
        atmosphere, ocean, or ice model) so that it can be plugged
        into a NUOPC Driver.
   
   NUOPC Model cap
   Cap
	    A Fortran module containing code that specializes the generic NUOPC Model component for a particular model. The cap sits "on top of" a model code, calling into the model and exposing an interface to other NUOPC components.

   specialization
        In NUOPC, the process of customizing a generic component by implementing
        specific subroutines associated with pre-defined specialization points.
        Behaviors not implemented via specialization are inherited from the
        generic component.
        
   specialization point
        A pre-defined place within a generic component where a custom implementation
        can be registered.  Each specialization point is identified by a label
        provided by the generic component.  
   
