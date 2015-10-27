The Generic NUOPC Model
=======================

This section describes in detail how the generic ``NUOPC_Model`` component
works.  It will help you understand:

    1.  what is the generic behavior that I get "for free", and
    2.  when and how to specialize the generic ``NUOPC_Model`` 
        for my particular model.
    
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

Initialization
--------------

The generic ``NUOPC_Model`` executes the following initialization
sequence in the order shown.  There are multiple versions of the
Initialize Phase Definition (IPD) so that new phases can be added
while still retaining backward compatibility.  For this reason,
each initialization phase listed in the table has several labels
associated with it.  Your NUOPC Model cap should stick with only
one of the IPD versions.  **It is recommended that
you use the latest version (currently IPDv04) as it is the most
flexible and ecompasses all earlier versions.**  

You are responsible for implementing in your NUOPC Model cap any 
required phase where the Provider is listed as User.  Clicking
on a phase's description will take you to a detailed description
of the phase.

====================================================  ============================================  ========= ========
Phase Label                                           Description                                   Provider  Required
====================================================  ============================================  ========= ========
IPDv00p1, IPDv01p1, IPDv02p1, IPDv03p1, IPDv04p1      :ref:`advertise_fields`                       User      Yes
                                                            
IPDv01p2, IPDv02p2, IPDv03p2, IPDv04p2                *Unspecific by NUOPC*  

IPDv00p2, IPDv01p3, IPDv02p3, IPDv03p3, IPDv04p3      :ref:`realize_fields_providing`               User      Yes [#f1]_

IPDv03p4, IPDv04p4                                    :ref:`modify_decomp`                          User      No

IPDv03p5, IPDv04p5                                    :ref:`realize_fields_accepting`               User      Yes [#f1]_

IPDv00p3, IPDv01p4, IPDv02p4, IPDv03p6, IPDv04p6      :ref:`verify_imports`                         NUOPC     Yes                                                     

IPDv00p4, IPDv01p5, IPDv02p5, IPDv03p7, IPDv04p7      :ref:`init_export`                            NUOPC     Yes
                                                      
====================================================  ============================================  ========= ========

.. [#f1] 
    Note that there are two phases dedicated to realizing fields, the first
    for models that are providing their own geometric object (e.g., grid)
    and the second for models that are accepting a geometric object. Only
    one of these phases needs to be implemented. In most cases your component
    will provide its own geometric object.


.. _advertise_fields:

Advertise fields in import and export states
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
**IPDv00p1, IPDv01p1, IPDv02p1, IPDv03p1, IPDv04p1** 

*(Required, User Provided)*

Advertise fields in import/export states using ``NUOPC_StateAdvertiseField`` 
and/or ``NUOPC_StateAdvertiseFields``.  These methods require a Standard Name 
for the field, and the Standard Name must appear in the NUOPC Field Dictionary 
or a runtime error is generated. 

``NUOPC_StateAdvertiseField`` accepts a ``TransferOfferGeomObject`` argument which may be one of:

    * "will provide" (default) - The field will provide its own geom object 
      (Grid/Mesh/XGrid/LocStream)
    * "can provide" - The field can provide its own geom object, but only 
      if the connected field in the other component will not provide it
    * "cannot provide" - The field cannot provide its own geom object. 
      It must accept a geom object from a connected field.

Memory is not allocated for advertised Fields, but attributes are set on the field 
which can be used in later phases, especially for determining if another component 
can provide and/or consume the advertised field.

.. _realize_fields_providing:

Realize fields *providing* a geom object
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
**IPDv00p2, IPDv01p3, IPDv02p3, IPDv03p3, IPDv04p3**

*(Required, User Provided)*

Realize connected import and export fields that have their ``TransferActionGeomObject``
attribute set to "provide", i.e., that will provide their own geometric object
(e.g., grid or mesh).  ("provide" is the default value of ``TransferActionGeomObject``.) 

The method ``NUOPC_StateRealizeField`` is used to realize a field. Only previously 
advertised fields can be realized and the field's name is used to search the 
state for the previously advertised field.



.. _modify_decomp:

Modify decomposition of accepted geom object
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^**
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


.. _realize_fields_accepting:

Realize fields *accepting* a geom object
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

.. _verify_imports:

Verify import fields connected and set clock
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^


.. _init_export:

Initialize export fields
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^


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

   
