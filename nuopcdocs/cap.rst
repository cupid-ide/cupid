.. _atmexample:

An Example 
==========

In this section we'll look at code for an example NUOPC Model cap.
The example shows basic structure of a NUOPC Model cap for a fictitious 
atmosphere model called ATM. It is slightly simpler than a "real" cap, 
but has enough detail to show the basic coding structures you'll need to write.
Each section of the example cap code will be broken down and described separately.  
You can also download the full :download:`atm.F90 <include/atm.F90>` file,
which contains the entire example cap.


Module Imports
--------------

The required NUOPC subroutines in the cap are grouped into a Fortran module, here called ATM.  
All NUOPC Model caps will import the ``ESMF``, ``NUOPC``, and
``NUOPC_Model`` modules and it is often a good idea to rename some of the
imported entities to avoid name clashes (as is the case with ``SetServices`` and
``label_Advance`` in the example).  Also note that the module exposes only a 
single public entry point (subroutine) called ``SetServices``.  This should be
true for all NUOPC Model caps.

.. literalinclude:: include/atm.F90
    :language: fortran
    :lines: 1-23


SetServices
-----------
..  f:subr:`NUOPC_CompDerive() <~NUOPC_Comp/NUOPC_GridCompDerive>` 

Every NUOPC Component must include a ``SetServices`` subroutine similar to the one
shown below.  All NUOPC ``SetServices`` routines have the same parameter list
and should do several things:

    * indicate the generic component being specialized,
    * register entry points for execution phases, and
    * register any specialization points.

In the example code, the call to ``NUOPC_CompDerive`` on line 8 indicates that 
this component derives from (and specializes) the generic ``NUOPC_Model``
component.  (In other words, this is a ``NUOPC_Model`` component customized 
for a specific model.)

The calls to ``NUOPC_CompSetEntryPoint``  on lines 15-16 and and 21-22 register 
subroutines that are implemented in the cap.  These are initialization phases
that are not provided by the generic NUOPC Model.
The ``phaseLabelList`` parameter lists a NUOPC-defined label from the Initialize Phase
Definition (or IPD -- more on that later).  NUOPC defines explicitly what happens in each phase of model
initialization and these labels uniquely define each phase.  For example, on line
16, ``"IPDv00p1"`` stands for "Initialize Phase Definition version 00 phase 1". The
value for the parameter ``userRoutine`` is the name of the subroutine that should
be executed for the phase (e.g., ``InitializeP1`` on line 16).   This subroutine
appears later on in the cap.  Note that the actual name of the registered subroutine
is entirely up to you, although a particular signature (parameter list) is required.
(More on that below.)

At this point, don't worry too much about what happens during each phase, just
know that some phases are not provided by NUOPC and so must be written
by you.  In the example code:

  * phase IPDv00p1 maps to subroutine ``InitializeP1``, and
  * phase IPDv00p2 maps to subroutine ``InitializeP2``.

.. literalinclude:: include/atm.F90
    :language: fortran
    :lines: 26-61
    :linenos:
 
In addition to providing subroutines for entire phases, sometimes *part* of
a phase can be specialized.  The call to ``NUOPC_CompSpecialize`` on lines 29-30 shows how
to register a subroutine for a particular "specialization point." In this
case the name of the specialization point is held in the variable
``model_label_Advance`` and the subroutine providing the implementation is 
``ModelAdvance``.

The Advance specialization point is called by NUOPC whenever it needs
your model to take a single timestep forward.  Basically, this means
you'll need to add a call inside the specialization subroutine to your
model's timestepping subroutine.  

Checking Return Codes
---------------------

Essentially all ESMF and NUOPC methods have an optional integer
return code parameter.  You are highly encouraged to call
``ESMF_LogFoundError`` after every ESMF/NUOPC call in order to 
check the return code and record any errors in the log files
that ESMF generates during the run.  Including the ``line`` and
``file`` parameters will help to located where errors occur in the code.
These parameter values are typically filled in by the pre-processor.
(See the ``#define``\ s at the top of the module.)


Initialize Phase - Advertise Fields
-----------------------------------

Here we see the implementation of the ``InitializeP1`` subroutine, which
you should recall was registered for the initialize phase with label IPDv00p1.  
Later, we'll see a more detailed look at the full list of initialization phases,
how they are ordered, and what happens during each phase.
For now you should notice a few things:

    * All phase subroutines are standard ESMF methods with the same
      parameter list:
      
        * ``model`` - a reference to the component itself (``ESMF_GridComp``)
        * ``importState`` - a container (``ESMF_State``) for input fields
        * ``exportState`` - a container (``ESMF_State``) for output fields
        * ``clock`` - keeps track of model time (``ESMF_Clock``)
        * ``rc`` - an ``integer`` return code
        
    * If the subroutine succeeds, it should return ``ESMF_SUCCESS`` in 
      the return code.  Otherwise it should return ``ESMF_FAILURE``.
      
.. literalinclude:: include/atm.F90
    :language: fortran
    :lines: 65-103
    :linenos:
   
The purpose of this phase is for your model to **advertise its import and
export fields**.  This means that your model announces which model variables
it is capable of exporting (e.g., an ocean might export sea surface temperature)
and which model variables it requires (e.g., an atmosphere might require
sea surface temperature as a boundary condition).  The reason there is an
explicit **advertise** phase is because NUOPC dynamically matches fields among
all the models participating in a coupled simulation during runtime. So, we
need to collect the list of possible input and output fields from all the
models during their initialization.


As shown in lines 15-16, to advertise a field you call
``NUOPC_StateAdvertiseField`` with the following parameters:

    * either the ``importState`` or ``exportState`` object
    * the standard name of the field, based on the 
      `CF conventions <http://cfconventions.org/standard-names.html>`_
    * a short name for the field, which can be used to
      retrieve it later from its ``ESMF_State``
    * a return code


The example code above advertises one import field with the standard
name ``"sea_surface_temperature"``, and two export fields with standard
names ``"air_pressure_at_sea_level"`` and ``"surface_net_downward_shortwave_flux"``.

.. note:: **Advertising a Field does NOT allocate memory**

    Note that NUOPC does not allocate memory for fields during the
    advertise phase or when ``NUOPC_StateAdvertiseField`` is called.
    Instead, this is simply a way for models to communicate the
    standard names of fields.  During a later phase, only those fields that
    are *connected* (e.g., a field exported from one model that is
    imported by another) need to have memory allocated.  
    
    Also, since ESMF
    will accept pointers to pre-allocated memory, it is usually not
    necessary to change how memory is allocated for your model's variables.


Initialize Phase - Realize Fields
---------------------------------

.. sidebar::  Model Grids

    Describing your model's grid (physical discretization) in the 
    ESMF representation is  one of the most important parts of creating 
    a NUOPC cap.  ESMF supports different grid structures, including
    2D and 3D logically rectangular grids, unstructured meshes, and 
    location streams (for observational datasets).  
    
    These geometric types are described in detail in the ESMF Reference
    Manual:
    
        * `Grid <http://www.earthsystemmodeling.org/esmf_releases/public/last/ESMF_refdoc/node5.html#SECTION05080000000000000000>`_
        * `Mesh <http://www.earthsystemmodeling.org/esmf_releases/public/last/ESMF_refdoc/node5.html#SECTION050100000000000000000>`_
        * `LocStream <http://www.earthsystemmodeling.org/esmf_releases/public/last/ESMF_refdoc/node5.html#SECTION05090000000000000000>`_
    

The following code fragment shows the ``InitializeP2`` subroutine, which
was registered for phase IPDv00p2.   During this phase, fields that
were previously advertised should now be **realized**.  Realizing a field
means that an ``ESMF_Field`` object is created and it is added to the appropriate
``ESMF_State``, either import or export.

In order to create an ``ESMF_Field``, you'll first need to create one of the
ESMF geometric types, ``ESMF_Grid``, ``ESMF_Mesh``, or ``ESMF_LocStream``.
For 2D and 3D logically rectangular grids (such as a lat-lon grid), the
typical choice is ``ESMF_Grid``.

For the sake a simplicity, a 10x100 Cartesian grid is created on lines
15-16 using the NUOPC auxiliary function ``NUOPC_GridCreateSimpleXY``.  
This object is assigned to ``gridIn``.  

Lines 25-26 show how to create an ``ESMF_Field`` by passing in the field
short name (should be the same as advertised), the grid, and the
data type of the field to ``ESMF_FieldCreate``.

Finally, the field is put into the state by calling ``NUOPC_StateRealizeField``
as on line 31.  The example code realizes three fields in total, one
import and two export, and all three share the same grid.

.. literalinclude:: include/atm.F90
    :language: fortran
    :lines: 107-170
    :linenos:
    :emphasize-lines: 31,45,58


Model Advance Specialization
----------------------------

Recall that the subroutine ``ModelAdvance`` (shown below) has been 
registered to the specialization point with the label 
``model_label_Advance`` in the ``SetServices`` subroutine. This
specialization point subroutine is called within the generic ``NUOPC_Model``
run phase in order to request that your model take a timestep
forward.  The code to do this is model depedent, so it does not appear 
in the subroutine below.  

**Each NUOPC component maintains its own clock** (an ``ESMF_Clock`` object).  
The clock is used here
to indicate the current model time and the timestep size. When the 
subroutine finishes, your model should be moved ahead in time
from the current time by one timestep.  NUOPC will automatically
advance the clock for you, so there is no explicit call to do that here.

Since there is no actual model for us to advance in this example,
the code below simply prints the current time and stop time (current time + timestep) 
to standard out.

With respect to specialization point subroutines in general, note that:

    * All specialization point subroutines rely on the ESMF attachable
      methods capability, and therefore all share the same parameter
      list:
      
        * a pointer to the component (``ESMF_GridComp``)
        * an ``integer`` return code
    
    * Because the import/export states and the clock do not come in through
      the parameter list, they must be accessed via a call to ``NUOPC_ModelGet``
      as shown on lines 12-13.

.. literalinclude:: include/atm.F90
    :language: fortran
    :lines: 174-215
    :linenos:
    
    
  


   
