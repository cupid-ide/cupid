Overview of Steps to Create a NUOPC-compliant Model
===================================================

NUOPC is a software layer included with ESMF that ensures interoperability
of models in coupled applications.  In most cases, NUOPC interfaces are to
be added to an existing model codebase in order to make the model NUOPC-compliant
and therefore able to communicate with other NUOPC components in a coupled system.

This documentation will help you understand the steps required to add a 
:term:`NUOPC Model cap` to an existing model.  The NUOPC Model *cap* is 
simply a Fortran module with certain required subroutines.  We call it a 
"cap" because it sits on top of your model code and mediates interactions 
of your model with the coupling infrastructure.

At the highest level, there are several basic tasks:

 #.  Set up your build environment
 
 #.  Write the NUOPC Model cap code
 
 #.  Test the NUOPC Model cap

The sections below describe each of these in more detail.  Additionally,
we provide some considerations for making it easier to obtain and link against
your NUOPC-compliant model in coupled systems.


Build Environment
=================

Before writing any code, you need to ensure the prerequisite 
software is available on the target system and take a few steps
to ensure that the added NUOPC code can be built with your model.

Prerequisites
-------------

The primary prerequisite software is the NUOPC library, which is
included with the ESMF distribution, and your model, including
any of its dependencies.

You can acquire a recent version of ESMF from SourceForge::

 $ git archive --remote=git://git.code.sf.net/p/esmf/esmf --format=tar --prefix=esmf/ ESMF_7_0_0_beta_snapshot_58| tar xf - 

Compile and install ESMF.  Full installation details can be found in the `ESMF
User Guide <http://www.earthsystemmodeling.org/esmf_releases/public/last/ESMF_usrdoc/node6.html#SECTION00064000000000000000>`_.  An example of the basic procedure 
for one particular system is outlined below. 

.. code-block:: bash
 
 # set environment variables for build
 # the actual settings depend on your platform
 # and the compilation options you select
 $ export ESMF_DIR=/path/to/esmf
 $ export ESMF_COMPILER=gfortran
 $ export ESMF_COMM=openmpi
 $ export ESMF_PIO=internal
 $ export ESMF_NETCDF=split
 $ export ESMF_NETCDF_INCLUDE=/usr/include
 $ export ESMF_NETCDF_LIBS="-lnetcdff -lnetcdf"
 $ export ESMF_NETCDF_LIBPATH=/usr/lib
 $ export ESMF_INSTALL_PREFIX=/path/to/install

 # build
 $ cd /path/to/esmf
 $ gmake
 $ gmake check
 $ gmake install


Choose a Configuration of Your Model for Development
----------------------------------------------------

When implementing the NUOPC interfaces for your model, you want to
get into an efficient edit-compile-debug cycle.  This will require
running a configuration of your model that can be used to test the
NUOPC code you will write.

.. sidebar:: Which configuration of my model should I choose for development?

 You should choose a configuration of your model that is 
 simple and stable. Many models have regression test configurations
 that can be run quickly and have small output files.  These configurations
 are typically low resolution, have short execution times, and sometimes 
 have idealized initial conditions.  Some models can also be configured 
 with some of the physics options turned off to reduce the total amount 
 of computation.  More scientifically interesting or higher resolution configurations
 can be used after ensuring that the NUOPC cap is working for the
 basic case.

**Compile your model on the target system and generate baseline output for the 
selected configuration.**   This will typically be a small set of history or restart 
files.  We'll use these files later to ensure that your model is reproducing the 
expected output when executed through the NUOPC cap.  In most cases, when
your model is executed through its NUOPC cap, the output should be bit-for-bit
identical with non-NUOPC runs.  (The one caveat to this is that when your
model is used in a coupled system, roundoff error may occur due to slight
differences introduced when grid interpolation is used between models.)

If your model is already using ESMF, **you will need to
update your build to link against the latest version of ESMF.** We
highly recommend doing this step first, before beginning any NUOPC
development.


Integrating NUOPC Code into Your Model's Codebase
-------------------------------------------------

An important question is where you will put your NUOPC cap source code.
The NUOPC cap code added to a model is minimal and is typically 
contained either in a single source file or a small set of files.  **We recommend
including the NUOPC cap code in the same code repository with the rest of your 
model code as this helps to ensure the cap evolves with your code and simplifies
the process of acquiring a NUOPC-compliant version of your model.**

Including the cap code in your model's codebase does *not* imply that your
model must always be run in NUOPC mode.  Instead, when the cap is complete,
the NUOPC mode can be viewed as a configuration option of your model.

The exact right place to put the cap code is your decision and largely depends 
on your model's directory structure.  

.. note:: **NUOPC Makefile Target Conventions**

 If your model is built using Make, a common convention is to add
 two special targets that build your model and also compile the NUOPC
 code you will write.
 
 | # this target builds your model + the nuopc code
 | $ make nuopc
 |
 | # this target installs your NUOPC-compliant to a particular directory
 | $ make nuopcinstall DESTDIR=/path/to/install


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
    
    This documentation focusses primarily only on the Model component.
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
            
    


Example NUOPC Model Cap
-----------------------
  
The following section shows the basic structure of a NUOPC Model
cap for a fictitious atmosphere model ATM.  Each section of cap code 
will be broken down and described separately.  You can also download 
the full :download:`atm.F90 <include/atm.F90>` file.



Module Imports
^^^^^^^^^^^^^^

The required NUOPC subroutines in the cap are grouped into a Fortran module
called ATM.  All NUOPC Model caps will import the ESMF, NUOPC, and
:f:mod:`NUOPC_Model` modules.  The :f:subr:`~NUOPC_Model/SetServices` and 
:f:var:`~NUOPC_Model/label_Advance` entities are renamed during the import.
Also note that the module exposes only a single public entry point
(subroutine) called SetServices.


.. literalinclude:: include/atm.F90
    :language: fortran
    :lines: 4-23


SetServices
^^^^^^^^^^^

Every NUOPC Component must include a SetServices subroutine like the one
shown below.  The call to :f:subr:`NUOPC_CompDerive() <~NUOPC_Comp/NUOPC_GridCompDerive>` 
indicates that this component derives from (and specializes) the generic NUOPC_Model 
component.  (In other words, this is a NUOPC_Model component customized 
for a specific model.)

The calls to :f:subr:`NUOPC_CompSetEntryPoint() <~NUOPC_Comp/NUOPC_GridCompSetEntryPoint>` register specific 

.. literalinclude:: include/atm.F90
    :language: fortran
    :lines: 26-61
 

   


Coding Goals
--------------------------------------------

The required development tasks to arrive at a NUOPC cap for your model 
can be divided into the following coding goals. While there is no one
right approach, we have found that following the steps in the order
provided helps to simplify the overall process.

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


Testing Your NUOPC Code
=======================



Making Your Code Available
==========================

This sections includes a few considerations for making your
NUOPC-compliant model code available for use by others.


NUOPC Makefile Fragment
-----------------------

The goal of adding a NUOPC cap to your model is so that it can be used
with other NUOPC-compliant models in a coupled system.  From a technical
standpoint, there are several ways that your model code can be included into
the final coupled system binary.  Two common options are to link in your model
statically and to link it in dynamically from a shared library.

In either case, to simplify the process of compiling and linking against 
your model, **your model should provide a makefile fragment that 
defines the following six variables:**

 **ESMF_DEP_FRONT**
  The name of the Fortran module to be used in a USE statement, 
  or (if it ends in ".h") the name of the header file to be used 
  in an #include statement, or (if it ends in ".so") the name of 
  the shared object to be loaded at run-time.
 **ESMF_DEP_INCPATH**
  The include path to find module or header files during compilation. Must be specified as absolute path.
 **ESMF_DEP_CMPL_OBJS**
  Object files that need to be considered as compile dependencies. Must be specified with absolute path.
 **ESMF_DEP_LINK_OBJS**
  Object files that need to be considered as link dependencies. Must be specified with absolute path.
 **ESMF_DEP_SHRD_PATH**
  The path to find shared libraries during link-time (and during run-time unless overridden by LD_LIBRARY_PATH). Must be specified as absolute path.
 **ESMF_DEP_SHRD_LIBS**
  Shared libraries that need to be specified during link-time, and must be available during run-time. Must be specified with absolute path.


An example makefile fragment useful for statically linking against your model looks like this:

.. code-block:: make
 
 #file: abc.mk
 
 ESMF_DEP_FRONT      = ABC
   ESMF_DEP_INCPATH    = <absolute path to associated ABC module file>
   ESMF_DEP_CMPL_OBJS  = <absolute path>/abc.o
   ESMF_DEP_LINK_OBJS  = <absolute path>/abc.o <absolute path>/xyz.o
   ESMF_DEP_SHRD_PATH  = 
   ESMF_DEP_SHRD_LIBS  =


The variables in the makefile fragment expose a set of dependencies that the 
higher-level build system can use to compile and link against your model.  
NUOPC does not place any constraints or special requirements on your model's 
build system.  However, an easy way to generate the makefile fragment is
to modify your model's makefile to include a new target:


.. code-block:: make

   .PRECIOUS: %.o

   %.mk: %.o
      @echo "# ESMF self-describing build dependency makefile fragment" > $@
      @echo >> $@
      @echo "ESMF_DEP_FRONT     = ABC"                          >> $@
      @echo "ESMF_DEP_INCPATH   = `pwd`"                        >> $@
      @echo "ESMF_DEP_CMPL_OBJS = `pwd`/"$<                     >> $@
      @echo "ESMF_DEP_LINK_OBJS = "$(addprefix `pwd`/, $(OBJS)) >> $@
      @echo "ESMF_DEP_SHRD_PATH = "                             >> $@
      @echo "ESMF_DEP_SHRD_LIBS = "                             >> $@

   abc.mk: $(OBJS)

.. seealso ::

 `Standardized Component Dependences <http://www.earthsystemmodeling.org/esmf_releases/last_built/NUOPC_refdoc/node5.html>`_
  This section of the NUOPC Reference Manual contains more details
  on setting up NUOPC makefile fragments.



   
