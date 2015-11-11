.. _driver_top:

Appendix: The Generic NUOPC Driver
==================================


.. _driver_setservices:

SetServices
-----------

All NUOPC components must define a ``SetServices`` method.  The SetServices method is used 
to define which generic component is being extended (i.e., Driver, Model, Mediator, or Connector), 
to register entry points, and to register specialization methods.


.. _driver_phase_init:

Initialization Sequence
-----------------------

The generic ``NUOPC_Driver`` component has a single initialize phase with the following behavior:

#. If the internal clock is not yet set, set the default internal clock to be a copy of the 
   incoming clock, but only if the incoming clock is valid.

#. Call the required specialization :ref:`driver_specialization_setmodelservices` which 
   adds all child Model, Mediator, and Connector components to the Driver. 
   
#. Call the optional specialization :ref:`driver_specialization_setrunsequence` to modify the 
   default run sequence. The default run sequence established is:

   #.  Run Connectors from Driver -> Models/Mediators
   #.  Run Connectors between Models/Mediators
   #.  Run Models/Mediators
   #.  Run Connectors from Models/Mediators -> Driver
   
#. Execute Initialize phase=0 for all Model, Mediator, and Connector components. This is the 
   method where each component is required to initialize its InitializePhaseMap attribute.
    
#. Call the optional specialization :ref:`driver_specialization_modifyinitphasemap` to analyze
   and modify the InitializePhaseMap attribute of child components before the Driver uses it.

#. Drive the initialize sequence for the child components.


Initialization Specialization Points
------------------------------------

The following specialization points are used during the ``NUOPC_Driver`` initialization 
sequence.


.. _driver_specialization_setmodelservices:

SetModelServices
^^^^^^^^^^^^^^^^
**Called from: default initialize phase**

*(Required, User Provided)*

A specialization method to add Model, Mediator, and Connector child components to the 
Driver. The method ``NUOPC_DriverAddComp()`` is used to add child Components. 

This method may also optionally replace the default clock. 


.. _driver_specialization_setrunsequence:

SetRunSequence
^^^^^^^^^^^^^^
**Called from: default initialize phase**

*(Required, NUOPC Provided)*

A specialization method to replace the default run sequence. If not specialized, 
the default run sequence established by the Driver is:

#.  Run Connectors from Driver -> Models/Mediators
#.  Run Connectors between Models/Mediators
#.  Run Models/Mediators
#.  Run Connectors from Models/Mediators -> Driver

The method ``NUOPC_DriverNewRunSequence()`` is used to add a new run sequence 
with a specified number of slots. New run sequence elements are added using 
``NUOPC_DriverAddRunElement()``.


.. _driver_specialization_modifyinitphasemap:

ModifyInitializePhaseMap
^^^^^^^^^^^^^^^^^^^^^^^^
**Called from: default initialize phase**

*(Optional, User Provided)*

A specialization in which the Driver can analyze and modify the InitializePhaseMap 
attribute of its child components.





.. _driver_phase_run:

Run Sequence
------------

The generic ``NUOPC_Driver`` component has a single run phase with the following behavior:

#.  Call the :ref:`driver_specialization_setrunclock` specialization. If not overridden the 
    default behavior is: 
    If the incoming clock is valid, set the internal stop time to one time step interval on 
    the incoming clock. Otherwise, leave the internal clock stop time unchanged.
    
#.  Drive the time stepping loop, from current time to stop time, incrementing by time step. 
    For each step iteration, call child components according to the run sequence.



Run Specialization Points
-------------------------

.. _driver_specialization_setrunclock:

SetRunClock
^^^^^^^^^^^
**Called from: default run phase**

*(Required, NUOPC Provided)*

A specialization method to check and set the internal clock against the incoming clock. If 
not overridden, the default method will check that the internal clock and incoming clock 
agree on current time and that the time step of the incoming clock is a multiple of the 
internal clock time step. Under these conditions set the internal stop time to one time 
step interval of the incoming clock. Otherwise exit with error, flagging an incompatibility.  



.. _driver_phase_finalize:

Finalize Sequence
-----------------

The generic ``NUOPC_Driver`` component has a single finalize phase.  This phase calls
into the :ref:`driver_specialization_finalize` specialization method if it exists. 


Finalize Specialization Points
------------------------------

.. _driver_specialization_finalize:

Finalize
^^^^^^^^
**Called from: default finalize phase**

*(Optional, User Provided)*

An optional specialization method for custom finalization code and deallocations
of user data structures.
   
