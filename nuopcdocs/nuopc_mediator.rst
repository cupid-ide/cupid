.. _mediator_top:

Appendix: The Generic NUOPC Mediator
====================================


.. _mediator_setservices:

SetServices
-----------

All NUOPC components must define a ``SetServices`` method.  The SetServices method is used 
to define which generic component is being extended (i.e., Driver, Model, Mediator, or Connector), 
to register entry points, and to register specialization methods.


.. _mediator_initseq:

Initialization Sequence
-----------------------

The generic ``NUOPC_Mediator`` executes the following initialization
sequence in the order shown.  There are multiple versions of the
Initialize Phase Definition (IPD) so that new phases can be added
while still retaining backward compatibility.  For this reason,
each initialization phase listed in the table has several labels
associated with it.  



====================================================  ============================================  ========= ========
Phase Label                                           Description                                   Provider  Required
====================================================  ============================================  ========= ========
IPDv00p0, IPDv01p0, IPDv02p0, IPDv03p0, IPDv04p0      :ref:`mediator_phase_setipdversion`              User      No

IPDv00p1, IPDv01p1, IPDv02p1, IPDv03p1, IPDv04p1      :ref:`mediator_phase_advertisefields`            User      Yes
                                                            
IPDv01p2, IPDv02p2, IPDv03p2, IPDv04p2                *Unspecified by NUOPC*  

IPDv00p2, IPDv01p3, IPDv02p3, IPDv03p3, IPDv04p3      :ref:`mediator_phase_realizefieldsproviding`     User      Yes [#f1]_

IPDv03p4, IPDv04p4                                    :ref:`mediator_phase_modifydecomp`               User      No

IPDv03p5, IPDv04p5                                    :ref:`mediator_phase_realizefieldsaccepting`     User      Yes [#f1]_

IPDv00p3, IPDv01p4, IPDv02p4, IPDv03p6, IPDv04p6      :ref:`mediator_phase_verifyimports`              NUOPC     Yes                                                     

IPDv00p4, IPDv01p5, IPDv02p5, IPDv03p7, IPDv04p7      :ref:`mediator_phase_initexport`                 NUOPC     Yes
                                                      
====================================================  ============================================  ========= ========

.. [#f1] 
    Note that there are two phases dedicated to realizing fields, the first
    for models that are providing their own geometric object (e.g., grid)
    and the second for models that are accepting a geometric object. Only
    one of these phases needs to be implemented. In most cases your component
    will provide its own geometric object.


.. _mediator_phase_setipdversion:

Set Initialize Phase Definition Version
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
**IPDv00p0, IPDv01p0, IPDv02p0, IPDv03p0, IPDv04p0** 

*(Optional, User Provided)*

During this optional phase, the component can set the Initialize Phase
Definition version that is uses.  This is done by filtering the
component's internal phase map by calling ``NUOPC_CompFilterPhaseMap``
and passing in the first part of the phase label string, e.g., 
``"IPDv02p"`` for version 2.


.. _mediator_phase_advertisefields:

Advertise fields in import and export states
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
**IPDv00p1, IPDv01p1, IPDv02p1, IPDv03p1, IPDv04p1** 

*(Required, User Provided)*

Advertise fields in import/export states using ``NUOPC_Advertise``.  This method requires 
a Standard Name for the field, and the Standard Name must appear in the NUOPC Field Dictionary 
or a runtime error is generated. 

``NUOPC_Advertise`` accepts a ``TransferOfferGeomObject`` argument which may be one of:

    * "will provide" (default) - The field will provide its own geom object 
      (Grid/Mesh/XGrid/LocStream)
    * "can provide" - The field can provide its own geom object, but only 
      if the connected field in the other component will not provide it
    * "cannot provide" - The field cannot provide its own geom object. 
      It must accept a geom object from a connected field.

Memory is not allocated for advertised Fields, but attributes are set on the field 
which can be used in later phases, especially for determining if another component 
can provide and/or consume the advertised field.

.. _mediator_phase_realizefieldsproviding:

Realize fields *providing* a geom object
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
**IPDv00p2, IPDv01p3, IPDv02p3, IPDv03p3, IPDv04p3**

*(Required, User Provided)*

Realize connected import and export fields that have their ``TransferActionGeomObject``
attribute set to "provide", i.e., that will provide their own geometric object
(e.g., grid or mesh).  ("provide" is the default value of ``TransferActionGeomObject``.) 

The method ``NUOPC_Realize`` is used to realize a field. Only previously 
advertised fields can be realized and the field's name is used to search the 
state for the previously advertised field.



.. _mediator_phase_modifydecomp:

Modify decomposition of accepted geom object
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
**IPDv03p4, IPDv04p4**

*(Optional, User Provided)*

Optionally modify the decomposition and distribution information of any accepted 
geometric object (e.g., grid or mesh) by replacing the ``DistGrid``. This can be accomplished 
by retrieving the ``Grid`` (and its ``DistGrid``) from the ``Field``, creating a new ``DistGrid`` with 
modified decomposition, creating a new ``Grid`` on that ``DistGrid``, and then using ``ESMF_FieldEmptySet`` 
to replace the existing ``Grid`` with the new one.

This phase is useful when accepting a grid from another component, but when
the processor (PET) counts differ between components.  In this case, a new distribution
needs to be set based on the current processor count.


.. _mediator_phase_realizefieldsaccepting:

Realize fields *accepting* a geom object
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
**IPDv03p5, IPDv04p5**

*(Required, User Provided)*

Realize connected import and export fields that have their ``TransferActionGeomObject`` 
attribute set to "accept", i.e., that will accept a geom object from a connected 
field in another component. 

If the generic ``NUOPC_Connector`` is used, at this point the full geom object (e.g., grid or mesh) 
has already been set in the field and only a call to ``ESMF_FieldEmptyComplete`` 
is required to allocate memory for the field. 

The method ``NUOPC_Realize`` is used to realize a field. Only previously 
advertised fields can be realized and the field's name is used to search the 
state for the previously advertised field.



.. _mediator_phase_verifyimports:

Verify import fields connected and set clock
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
**IPDv00p3, IPDv01p4, IPDv02p4, IPDv03p6, IPDv04p6**

*(Required, NUOPC Provided)*

If the model's internal clock has not been set, set as a copy of the parent clock. 
Verify all import fields are connected and set error code if not.


.. _mediator_phase_initexport:

Initialize export fields
^^^^^^^^^^^^^^^^^^^^^^^^
**IPDv00p4, IPDv01p5, IPDv02p5, IPDv03p7, IPDv04p7**

*(Required, NUOPC Provided)*

Call the :ref:`mediator_specialization_datainitialize` specialization method if it exists, which initializes all export fields. 
Set the timestamp in export fields to the internal clock's time.


Initialization Specialization Points
------------------------------------

The following specialization points are used during the ``NUOPC_Mediator``
initialization sequence.


.. _mediator_specialization_datainitialize:

DataInitialize
^^^^^^^^^^^^^^
**Called from:  IPDv00p4, IPDv01p5, IPDv02p5, IPDv03p7, IPDv04p7**

*(Optional, User Provided)*

The specialization method should initialize field data in the export state. 
Fields in the export state will be timestamped automatically by the calling phase, 
so there is no need to do it here.


.. _mediator_phase_run:

Run Sequence
------------

The generic ``NUOPC_Mediator`` component has a single run phase with the following behavior:

#. Call the :ref:`mediator_specialization_setrunclock` specialization method to check and set the internal clock against the incoming clock. 
   If no specialization exists, the default method will check that internal clock and incoming clock agree 
   on current time and that the time step of the incoming clock is a multiple of the internal clock time step. 
   Under these conditions set the internal stop time to one time step interval of the incoming clock. 
   Otherwise exit with error, flagging an incompatibility.
  
#. Call the :ref:`mediator_specialization_checkimport` specialization method to check import fields. If no specialization exists, 
   the default method verifies that all import fields are at the current time of the internal clock.
  
#. Time stepping loop: starting at current time, running to stop time of the internal clock:

    #. Timestamp the fields in the export state according to the current time of the internal clock.

    #. Call the :ref:`mediator_specialization_advance` specialization routine.

    #. Advance the current time of the internal clock according to the time step of the internal clock.

#. Call the :ref:`mediator_specialization_timestampexport` specialization method to set the timestamp on export fields. 
   If no specialization exists, then export field timestamps are left unchanged from the
   timestamping that occurs during the timestepping loop above.



Run Specialization Points
-------------------------

.. _mediator_specialization_setrunclock:

SetRunClock
^^^^^^^^^^^
**Called from: default run phase**

*(Required, NUOPC Provided)*

A specialization method to check and set the internal clock against the incoming clock. 
This method is called by the default run phase.  

If not overridden, the default method will check that the internal clock and incoming clock agree 
on the current time and that the time step of the incoming clock is a multiple of the internal 
clock time step. Under these conditions set the internal stop time to one time step interval
of the incoming clock. Otherwise exit with error, flagging an incompatibility.


.. _mediator_specialization_checkimport:

CheckImport
^^^^^^^^^^^
**Called from: default run phase**

*(Required, NUOPC Provided)*

A specialization method to verify import fields before advancing in time. If not overridden, 
the default method verifies that all import fields are at the current time of the internal clock.


.. _mediator_specialization_advance:

Advance
^^^^^^^
**Called from: default run phase**

*(Required, User Provided)*

A specialization method that advances the mediator forward in time by one timestep of the internal clock. 
This method will be called iteratively by the default run phase until reaching the 
stop time on the internal clock.


.. _mediator_specialization_timestampexport:

TimestampExport
^^^^^^^^^^^^^^^
**Called from: default run phase**

*(Required, NUOPC Provided)*

A specialization method to set the timestamp on export fields after the model has advanced. 
If not overridden, the there is no default implementation, so the timestamp of fields in the 
export state remains unchanged.



.. _mediator_phase_finalize:

Finalize Sequence
-----------------

The generic ``NUOPC_Mediator`` component has a single finalize phase.  This phase calls
into the :ref:`mediator_specialization_finalize` specialization method if it exists. 


Finalize Specialization Points
------------------------------

.. _mediator_specialization_finalize:

Finalize
^^^^^^^^
**Called from: default finalize phase**

*(Optional, User Provided)*

An optional specialization method for custom finalization code and deallocations
of user data structures.
   
