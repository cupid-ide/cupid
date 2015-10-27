Writing a NUOPC Model Cap
=========================

Now we can start writing code.  The goal is to implement a 
fully compliant :term:`NUOPC Model cap` that exposes all required
interfaces to your model.  Depending on how your code is already
structured, there are often little or no changes required to your 
model's internals.  The cap primarily acts as a separate software 
layer, and your model otherwise operates in its usual way.  

NUOPC enforces a special initialization sequence, a kind of
"handshake" that all models participate in to establish connections
among the inputs and outputs of models in a coupled system.
Some restructuring of your model code may be required in order to
achieve the required initialize sequencing.

.. note:: **Four types of NUOPC Components**
    
    This documentation focusses primarily on the **Model** NUOPC Component.
    However, you should be aware that there are four types of NUOPC 
    Components, each with its own generic implementation.  The four types
    are:
    
        Model
            Wraps a model code, such as at atmosphere, ocean, or ice model
            
        Connector
            Handles standard data transformations between components such as 
            redistribution and regridding
                        
        Mediator
            Contains custom coupling code (flux calculations, averaging)
            between Models
            
        Driver
            Coordinates execution of Models, Mediators, and Connectors
            
    
An Example NUOPC Model Cap
---------------------------
  
The following section shows the basic structure of a NUOPC Model
cap for a fictitious atmosphere model ATM.  The purpose of this section
is not to describe all aspects of writing a NUOPC cap in detail, but
to give an idea of how a cap looks.  Each section of cap code 
will be broken down and described separately.  You can also download 
the full :download:`atm.F90 <include/atm.F90>` file.


Module Imports
^^^^^^^^^^^^^^

The required NUOPC subroutines in the cap are grouped into a Fortran module
called ATM.  All NUOPC Model caps will import the ``ESMF``, ``NUOPC``, and
``NUOPC_Model`` modules.  The ``SetServices`` and 
``label_Advance`` entities are renamed during the import.
Also note that the module exposes only a single public entry point
(subroutine) called ``SetServices``.

.. literalinclude:: include/atm.F90
    :language: fortran
    :lines: 1-23


SetServices
^^^^^^^^^^^
..  f:subr:`NUOPC_CompDerive() <~NUOPC_Comp/NUOPC_GridCompDerive>` 

Every NUOPC Component must include a ``SetServices`` subroutine like the one
shown below.  The call to ``NUOPC_GridCompDerive`` indicates that this component 
derives from (and specializes) the generic ``NUOPC_Model``
component.  (In other words, this is a ``NUOPC_Model`` component customized 
for a specific model.)

The calls to ``NUOPC_CompSetEntryPoint`` 
on lines 15-16 and and 21-22 register subroutines that must be implemented by you.
The ``phaseLabelList`` parameter lists a NUOPC-defined label from the Initialize Phase
Definition (more on that later).  NUOPC defines explicitly what happens in each phase of model
initialization and these labels uniquely define each phase.  For example, on line
16, ``"IPDv00p1"`` stands for "Initialize Phase Definition version 00 phase 1". The
value for the parameter ``userRoutine`` is the name of the subroutine that should
be executed for the phase (e.g., ``InitializeP1`` on line 16).  

At this point, don't worry too much about what happens during each phase, just
know that some phases are not provided by NUOPC and so must be written
by you.  In the example code:

  * phase IPDv00p1 maps to subroutine ``InitializeP1``, and
  * phase IPDv00p2 maps to subroutine ``InitializeP2``.

.. literalinclude:: include/atm.F90
    :language: fortran
    :lines: 26-61
    :linenos:
 
In addition to providing subroutines for entire phases, sometimes part of
a phase can be "specialized."  In other words, there are some parts of
NUOPC that cannot be implemented generically, so you must provide the 
implementation.  The call to ``NUOPC_CompSpecialize`` on lines 29-30 show how
to register a subroutine for a particular "specialization point." In this
case the name of the specialization point is held in the variable
``model_label_Advance`` and the subroutine providing the implementation is 
``ModelAdvance``.

The Advance specialization point is called by NUOPC whenever it needs
your model to take a single timestep forward.  Basically, this means
you'll need to add a call inside the specialization subroutine to your
model's timestepping subroutine.  More details on that will follow.

Checking Return Codes
^^^^^^^^^^^^^^^^^^^^^

Essentially all ESMF and NUOPC methods have an optional integer
return code parameter.  You are highly encouraged to call
``ESMF_LogFoundError`` after every ESMF/NUOPC call in order to 
check the return code and record any errors in the log files
that ESMF generates during the run.  Include the ``line`` and
``file`` parameters will help to located where errors occur in the code.


Initialize Phase - Advertise Fields
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

The following code fragment shows the ``InitializeP1`` subroutine, which
you should recall was registered for phase IPDv00p1.  A more detailed look
at the IPD phases will appear later.  For now you should notice a few things:

    * All phase subroutines are standard ESMF methods with the same
      parameter list:
      
        * ``model`` - a reference to the component itself (``ESMF_GridComp``)
        * ``importState`` - a container (``ESMF_State``) for input fields
        * ``exportState`` - a container (``ESMF_State``) for output fields
        * ``clock`` - keeps track of model time (``ESMF_Clock``)
        * ``rc`` - an ``integer`` return code
        
    * If the subroutine succeeds, it should return ``ESMF_SUCCESS``.  Otherwise
      it should return ``ESMF_FAILURE``.
      
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
all the models participating in a coupled simulation during runtime. 


As shown in lines 15-16, to advertise a field you call
``NUOPC_StateAdvertiseField`` with the following parameters:

    * either the importState or exportState object
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
    are *connected* (e.g., a field export from one model that is
    import by another) need to have memory allocated.  
    
    Also, since ESMF
    will accept pointers to pre-allocated memory, it is usually not
    necessary to change how memory is allocated for your model's variables.


Initialize Phase - Realize Fields
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

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
^^^^^^^^^^^^^^^^^^^^^^^^^^^^

Recall that the subroutine ``ModelAdvance`` (shown below) has been 
registered to the specialization point with the label 
``model_label_Advance`` in the ``SetServices`` subroutine. This
specialization point subroutine is called within the generic ``NUOPC_Model``
run phase in order to request that your model take a timestep
forward.  The code to do this is model depedent, so it does not appear 
in the subroutine below.  

Each NUOPC component maintains its own clock.  The clock here is used
to indicate the current model time and the timestep size. When the 
subroutine finishes, your model should be moved ahead in time
from the current time by one timestep.  NUOPC will automatically
advance the clock for you, so there is no explicit call to do that here.

Since there is no actual model for us to advance in this example,
the code below simply prints current time and stop time to standard out.

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
    
    
  
The Generic NUOPC Model
-----------------------

To be comfortable writing the NUOPC code necessary to make your model 
NUOPC compliant, you need to: 

    1.  understand what the generic ``NUOPC_Model`` component does, and 
    2.  understand when and how to specialize the generic ``NUOPC_Model`` 
        component for your particular model
    
The generic NUOPC_Model component wraps your model so that it can be
plugged into a NUOPC_Driver.  The generic component is *used* in your code 
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
        by the generic component by calling ``NUOPC_CompSetEntryPoint``.  In this
        case you are implementing an entire initialization or run phase.

    2.  Your code implements a specialization subroutine and it is attached to the
        component by calling ``NUOPC_CompDerive``.  In this case, the generic
        component exposes a set of labels that identify the particular 
        specialization points available.  The purpose of each specialization point
        is documented so you how to implement the specialization point subroutine.
        
    3.  In some cases, the generic component can be specialized by setting a
        particular parameter that affects the generic component's behavior.

Initialization
^^^^^^^^^^^^^^

The generic NUOPC_Model goes through the following initialization
sequence in the order shown.

====================================================  ===========================================  ========= ========
Phase Label                                           Description                                  Provider  Required
====================================================  ===========================================  ========= ========
IPDv00p1, IPDv01p1, IPDv02p1, IPDv03p1, IPDv04p1      Advertise Import and Export Fields           User      Yes
                                                            
IPDv01p2, IPDv02p2, IPDv03p2, IPDv04p2                 *Unspecific by NUOPC*  \

IPDv00p2, IPDv01p3, IPDv02p3, IPDv03p3, IPDv04p3       Realize Fields *providing* a geom object    User      Yes
====================================================  ===========================================  ========= ========



+-------------------------------------+------------------------------------+----------+----------+
| Phase Labels                        | Description                        | Provider | Required |
+-------------------------------------+------------------------------------+----------+----------+
| IPDv00p1, IPDv01p1, IPDv02p1,       | Advertise Import and Export Fields | User     | Yes      |
| IPDv03p1, IPDv04p1                  |                                    |          |          |
+-------------------------------------+------------------------------------+----------+----------+

IPDv00p1, IPDv01p1, IPDv02p1, IPDv03p1, IPDv04p1 - Advertise Fields
"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""
*(Required, Implementor Provided)*

Advertise Fields in import/export States using NUOPC_StateAdvertiseField() 
and/or NUOPC_StateAdvertiseFields() . 

The methods above require a Standard Name for the Field, and that Standard Name
must appear in the NUOPC Field Dictionary or a runtime error is generated. 

NUOPC_StateAdvertiseField() accepts a TransferOfferGeomObject argument which may be one of:

    * "will provide" (default) - The Field will provide its own geom object 
      (Grid/Mesh/XGrid/LocStream)
    * "can provide" - The Field can provide its own geom object, but only 
      if the connected Field in the other Component will not provide it
    * "cannot provide" - The Field cannot provide its own geom object. 
      It must accept a geom object from a connected Field.

Memory is not allocated for advertised Fields, but attributes are set on the Field 
which can be used in later phases, especially for determining if another Component 
can provide and/or consume the advertised Field.





Recommended Approach
--------------------

While there is no one right way to write the NUOPC cap code, we have 
found that following the steps in order helps to simplify the overall process.

 #.  Acquire a basic Fortran code template of a NUOPC Model cap.  

 #.  Call your model's existing initialization procedure from the cap.

 #.  Call your model's update (timestepping) subroutine from the cap.

 #.  Plug your cap into a NUOPC Driver and try to get through a short run of several timesteps.  

 #.  Go back and split up the initialize phases as required by NUOPC.  

 #.  Test the cap in a NUOPC coupled system.  


Acquire a NUOPC Model Cap Code Template
---------------------------------------

We recommend starting from a NUOPC Model cap code template.  
There are at least a couple options:

 1.  Use code from one of the `NUOPC Prototype applications <http://sourceforge.net/p/esmfcontrib/svn/HEAD/tree/NUOPC/tags/ESMF_7_0_0_beta_snapshot_52/>`_ or from an existing NUOPC Model cap.
 
 2.  Use the Cupid plugin for Eclipse to generate NUOPC code.


**MORE details about getting the code**






Initialize Your Model from the Cap
----------------------------------


Call Your Model's Run Subroutine from the Cap
---------------------------------------------


Test with a Simple NUOPC Driver
-------------------------------


Split Up Initialize Phases
--------------------------

   
