.. _model_top:

Appendix: The Generic NUOPC Model
=================================

This appendix describes technical details of the generic 
``NUOPC_Model`` component and should be used as a reference
for the initialize and run behaviors of the generic ``NUOPC_Model``
as well as a description of the available specialization points.
    
The generic ``NUOPC_Model`` component wraps your model so that it can be
plugged into a ``NUOPC_Driver``.  The generic component is *used* in your code 
to implement a specialized version of the generic component--this is
the NUOPC cap for your model. Your component 
derives from the generic component code by implementing its own public 
``SetServices`` routine that calls into the ``NUOPC_CompDerive`` routine before 
doing anything else, passing it a reference to the generic ``NUOPC_Model`` 
``SetServices``.  It is through this mechanism that your NUOPC cap 
*inherits* functionality that is implemented in the generic component.

In general, **there are three mechanisms through which your code specializes the generic component.** 
The first two methods specialize through call-back mechanisms into subroutines
you implement. The third method specializes by setting the values of parameters 
implemented by the generic component.

    1.  Your code sets entry points for standard component methods not implemented 
        by the generic component by calling ``NUOPC_CompSetEntryPoint`` inside
        your ``SetServices`` routine.  In this
        case you are implementing an entire initialization or run phase.

    2.  Your code implements a specialization subroutine and it is attached to the
        component by calling ``NUOPC_CompDerive`` inside your ``SetServices`` routine.  
        In this case, the generic
        component exposes a set of labels that identify the particular 
        specialization points available.  The purpose of each specialization point
        is documented so you how to implement the specialization point subroutine.
        
    3.  In some cases, the generic component can be specialized by setting a
        particular parameter that affects the generic component's behavior.

.. _model_initseq:

Initialization Sequence
-----------------------

The generic ``NUOPC_Model`` executes the following initialization
sequence in the order shown.  There are multiple versions of the
Initialize Phase Definition (IPD) so that new phases can be added
while still retaining backward compatibility.  For this reason,
each initialization phase listed in the table has several labels
associated with it.  Your NUOPC Model cap should stick with only
one of the IPD versions.  **It is recommended that
you use the latest version (currently IPDv04) as it is the most
flexible and encompasses all earlier versions.**  

You are responsible for implementing in your NUOPC Model cap any 
required phase where the Provider is listed as User.  Clicking
on a phase's description will take you to a detailed description
of the phase.

====================================================  ============================================  ========= ========
Phase Label                                           Description                                   Provider  Required
====================================================  ============================================  ========= ========
IPDv00p0, IPDv01p0, IPDv02p0, IPDv03p0, IPDv04p0      :ref:`model_phase_setipdversion`              User      No

IPDv00p1, IPDv01p1, IPDv02p1, IPDv03p1, IPDv04p1      :ref:`model_phase_advertisefields`            User      Yes
                                                            
IPDv01p2, IPDv02p2, IPDv03p2, IPDv04p2                *Unspecified by NUOPC*  

IPDv00p2, IPDv01p3, IPDv02p3, IPDv03p3, IPDv04p3      :ref:`model_phase_realizefieldsproviding`     User      Yes [#f1]_

IPDv03p4, IPDv04p4                                    :ref:`model_phase_modifydecomp`               User      No

IPDv03p5, IPDv04p5                                    :ref:`model_phase_realizefieldsaccepting`     User      Yes [#f1]_

IPDv00p3, IPDv01p4, IPDv02p4, IPDv03p6, IPDv04p6      :ref:`model_phase_verifyimports`                         NUOPC     Yes                                                     

IPDv00p4, IPDv01p5, IPDv02p5, IPDv03p7, IPDv04p7      :ref:`model_phase_initexport`                 NUOPC     Yes
                                                      
====================================================  ============================================  ========= ========

.. [#f1] 
    Note that there are two phases dedicated to realizing fields, the first
    for models that are providing their own geometric object (e.g., grid)
    and the second for models that are accepting a geometric object. Only
    one of these phases needs to be implemented. In most cases your component
    will provide its own geometric object.


.. _model_phase_setipdversion:

Set Initialize Phase Definition Version
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
**IPDv00p0, IPDv01p0, IPDv02p0, IPDv03p0, IPDv04p0** 

*(Optional, User Provided)*

During this optional phase, the component can set the Initialize Phase
Definition version that is uses.  This is done by filtering the
component's internal phase map by calling ``NUOPC_CompFilterPhaseMap``
and passing in the first part of the phase label string, e.g., 
``"IPDv02p"`` for version 2.


.. _model_phase_advertisefields:

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

.. _model_phase_realizefieldsproviding:

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



.. _model_phase_modifydecomp:

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


.. _model_phase_realizefieldsaccepting:

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



.. _model_phase_verifyimports:

Verify import fields connected and set clock
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
**IPDv00p3, IPDv01p4, IPDv02p4, IPDv03p6, IPDv04p6**

*(Required, NUOPC Provided)*

If the model's internal clock has not been set, set as a copy of the parent clock. 
Call the :ref:`model_specialization_setclock` specialization subroutine (if present). 
Verify all import fields are connected and set error code if not.


.. _model_phase_initexport:

Initialize export fields
^^^^^^^^^^^^^^^^^^^^^^^^
**IPDv00p4, IPDv01p5, IPDv02p5, IPDv03p7, IPDv04p7**

*(Required, NUOPC Provided)*

Call the :ref:`model_specialization_datainitialize` specialization method if it exists, which initializes all export fields. 
Set the timestamp in export fields to the internal clock's time.


Initialization Specialization Points
------------------------------------

The following specialization points are used during the ``NUOPC_Model``
initialization sequence.


.. _model_specialization_setclock:

SetClock
^^^^^^^^
**Called from: IPDv00p3, IPDv01p4, IPDv02p4, IPDv03p6, IPDv04p6**

*(Optional, User Provided)*

The specialization method can change aspects of the internal clock, which 
defaults to a copy of the incoming parent clock. For example, the timeStep 
size may be changed and/or Alarms may be set on the clock. 

The method ``NUOPC_CompSetClock(comp, externalClock, stabilityTimeStep, rc)`` 
can be used to set the internal clock as a copy of externalClock, but with a 
timeStep that is less than or equal to the stabilityTimeStep. At the same 
time ensure that the timeStep of the external clock is a multiple of the 
timeStep of the internal clock. If the stabilityTimeStep argument is not 
provided then the internal clock will simply be set as a copy of the external clock.

.. _model_specialization_datainitialize:

DataInitialize
^^^^^^^^^^^^^^
**Called from:  IPDv00p4, IPDv01p5, IPDv02p5, IPDv03p7, IPDv04p7**

*(Optional, User Provided)*

The specialization method should initialize field data in the export state. 
Fields in the export state will be timestamped automatically by the calling phase, 
so there is no need to do it here.


.. _model_phase_run:

Run Sequence
------------

The generic ``NUOPC_Model`` component has a single run phase.  The purpose of the run phase
is to move the model forward in time from the current time to the stop time on the
internal clock.  Keep in mind that the ``NUOPC_Driver`` sitting above this component
is responsible for setting the stop time of this component's clock.

#. Call the :ref:`model_specialization_setrunclock` specialization method to check and set the internal clock against the incoming clock. 
   If no specialization exists, the default method will check that internal clock and incoming clock agree 
   on current time and that the time step of the incoming clock is a multiple of the internal clock time step. 
   Under these conditions set the internal stop time to one time step interval of the incoming clock. 
   Otherwise exit with error, flagging an incompatibility.
  
#. Call the :ref:`model_specialization_checkimport` specialization method to check import fields. If no specialization exists, 
   the default method verifies that all import fields are at the current time of the internal clock.
  
#. Time stepping loop: starting at current time, running to stop time of the internal clock:

    #. Timestamp the fields in the export state according to the current time of the internal clock.

    #. Call the :ref:`model_specialization_advance` specialization routine.

    #. Advance the current time of the internal clock according to the time step of the internal clock.

#. Call the :ref:`model_specialization_timestampexport` specialization method to set the timestamp on export fields. 
   If no specialization exists, the default method will timestamp all fields in the export state 
   according to the current	time of the internal clock, which now is identical to the 
   stop time of the internal clock.



Run Specialization Points
-------------------------

.. _model_specialization_setrunclock:

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


.. _model_specialization_checkimport:

CheckImport
^^^^^^^^^^^
**Called from: default run phase**

*(Required, NUOPC Provided)*

A specialization method to verify import fields before advancing in time. If not overridden, 
the default method verifies that all import fields are at the current time of the internal clock.


.. _model_specialization_advance:

Advance
^^^^^^^
**Called from: default run phase**

*(Required, User Provided)*

A specialization method that advances the model forward in time by one timestep of the internal clock. 
This method will be called iteratively by the default run phase until reaching the 
stop time on the internal clock.


.. _model_specialization_timestampexport:

TimestampExport
^^^^^^^^^^^^^^^
**Called from: default run phase**

*(Required, NUOPC Provided)*

A specialization method to set the timestamp on export fields after the model has advanced. 
If not overridden, the default method sets the timestamp on all export fields to the stop
time on the internal clock (which is also now the current model time). 




.. _model_phase_finalize:

Finalize Sequence
-----------------

The generic ``NUOPC_Model`` component has a single finalize phase.  This phase calls
into the :ref:`model_specialization_finalize` specialization method if it exists. 


Finalize Specialization Points
------------------------------

.. _model_specialization_finalize:

Finalize
^^^^^^^^
**Called from: default finalize phase**

*(Optional, User Provided)*

An optional specialization method for custom finalization code and deallocations
of user data structures.
   
