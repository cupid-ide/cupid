.. _writecap:

Writing and Testing a NUOPC Cap for Your Model
==============================================

While there is no one right way to write the :term:`NUOPC Model cap` code, the following
recommended steps represent an incremental approach to developing the cap.

 #.  :ref:`installesmf`
 #.  :ref:`preparemodel`
 #.  :ref:`chooseconfig`
 #.  :ref:`integratecap`
 #.  :ref:`genmakefrag`
 #.  :ref:`initmodelfromcap`
 #.  :ref:`callrunfromcap`
 #.  :ref:`runcapwithdriver`
 #.  :ref:`splitinit`
 #.  :ref:`validatecap`
 
 
 
.. _installesmf:

Install ESMF and NUOPC on the Target Machine
--------------------------------------------

First, you need to ensure the prerequisite 
software is available on the target system.

The primary prerequisite software is the NUOPC library, which is
included with the ESMF distribution, and your model, including
any of its dependencies.

You can acquire a recent version of ESMF from SourceForge:

.. code-block:: bash

  $ git archive --remote=git://git.code.sf.net/p/esmf/esmf \ 
    --format=tar --prefix=esmf/ ESMF_7_0_0_beta_snapshot_59| tar xf - 


**Compile and install ESMF.**  Full installation details can be found in the `ESMF
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


.. _preparemodel:

Prepare Your Model Code
-----------------------

Before starting a NUOPC cap implementation, your model must already
be modularized such that it can be built by itself and does not
contain hard dependencies to other model components.  For example,
if the model targeted for NUOPC compliance is a subsystem embedded
in a larger application, the model will first need to be extracted
such that it can be built by itself as a library.

The model also needs to be roughly divided into several execution
methods: initialize, run, and finalize.  Each of these methods may
contain several phases.  The run method should allow the model to take
a single timestep, or accept a parameter defining the number of
timesteps or a "run until" time.  


Your NUOPC cap code will be cleanest if your model exposes data 
structures for input and output variables with clear, well-documented
naming conventions. This will simplify the process of hooking up fields
in the NUOPC cap to your model’s data structures.  The NUOPC Field 
Dictionary uses the `Climate and Forecast conventions <http://cfconventions.org/>`_ 
for defining field standard names, but can support field name aliases. 

Finally, the model should not use the global MPI_WORLD_COMM communicator
explicitly, but should accept a communicator at some point during
startup.  A global search and replace can be used to replace
all uses of MPI_WORLD_COMM with a different communicator defined
as a global variable in your model.



.. _chooseconfig:

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
update your build to link against ESMF version 7.0.0 beta snapshot 59 
or later.**  Instructions for checking out this version of ESMF
appear in the section above entitled :ref:`installesmf`.


.. _integratecap:

Integrate a Cap Template into Your Codebase
-------------------------------------------

An important question is where you will put your NUOPC cap source code.
The NUOPC cap code added to a model is minimal and is typically 
contained either in a single source file or a small set of files.  **We recommend
including the NUOPC cap code in the same code repository with the rest of your 
model code as this helps to ensure the cap evolves with your code and simplifies
the process of acquiring a NUOPC-compliant version of your model.** 
The exact right place to put the cap code is your decision and largely depends 
on your model's directory structure.

Including the cap code in your model's codebase does *not* imply that your
model must always be run in NUOPC mode.  Instead, when the cap is complete,
the NUOPC mode can be viewed as a configuration option of your model.

You need not start from scratch.  Instead start with a NUOPC cap template.
To acquire a cap template you can:

    * use the cap template below,
    * copy code from one of the `NUOPC Prototype Applications <https://sourceforge.net/p/esmfcontrib/svn/HEAD/tree/NUOPC/tags/ESMF_7_0_0_beta_snapshot_58/>`_ or
    * use the `Cupid plugin for Eclipse <https://www.earthsystemcog.org/projects/cupid/>`_ 
      to generate code.  Cupid automatically generates NUOPC compliant
      code fragments for specialization points and presents NUOPC API reference
      documentation based on where you are in your NUOPC cap code.
      `Installation instructions <https://www.earthsystemcog.org/projects/cupid/installationmars/eclipse>`_
      are provided on the Cupid website, 
      and for additional support please
      `email the ESMF support list <mailto:esmf_support@list.woc.noaa.gov>`_.
    
Put the initial cap code into your model source tree.  Then, modify
your Makefile or build scripts so that the cap is compiled with the
rest of your model code.  Unless your model is already using ESMF,
you'll need to add ESMF compile and linking flags in order to build
the cap.  **When ESMF is installed, a Makefile fragment named esmf.mk 
is generated that contains variables that can be appended to your compile and
link flags.**  The `ESMF User Guide <http://www.earthsystemmodeling.org/esmf_releases/public/last/ESMF_usrdoc/node7.html>`_ 
explains how to use these variables in your Makefile.
   

.. _genmakefrag:

Modify Your Build to Generate a NUOPC Makefile Fragment
-------------------------------------------------------

The goal of adding a NUOPC cap to your model is so that it can be used
with other NUOPC-compliant models in a coupled system.  From a technical
standpoint, there are several ways that your model code can be included into
a final coupled system binary.  Two common options are to link to your model
statically and to link it in dynamically from a shared library.

In either case, to simplify the process of compiling and linking against 
your model, **your model's build process should produce a Makefile fragment file 
that defines the following six variables:**

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
An easy way to generate the makefile fragment is to modify your model's 
Makefile to include a new target:


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

 `Standardized Component Dependencies <http://www.earthsystemmodeling.org/esmf_releases/last_built/NUOPC_refdoc/node5.html>`_
  This section of the NUOPC Reference Manual contains more details
  on setting up NUOPC makefile fragments.


**Finally, if your build procedure typically produces an executable, it is 
recommended that you add a Makefile target (or similar build option)
that produces a library instead of an executable.**  When used in a NUOPC
system, your model's main program will not be used--instead, a ``NUOPC_Driver``
will be linked to your cap and it will be the locus of control 
(i.e., the main program).


.. note:: **Makefile Target Conventions**

 If your model is built using Make, a common convention is to add
 two special targets that build your model and also compile the NUOPC
 code you will write.
 
 | # this target builds your model and your NUOPC cap
 | $ make nuopc
 |
 | # this target installs your NUOPC-compliant model to a particular directory
 | $ make nuopcinstall DESTDIR=/path/to/install


.. _initmodelfromcap:

Initialize Your Model from the Cap
----------------------------------

The cap template you placed in your source tree is not yet connected
to your model.  You now need to add a call into your model's existing
initialization subroutine(s).  

NUOPC defines a precise initialization sequence--i.e., a series of 
steps that all NUOPC components are expected to take when starting
up.  Some of the steps are optional and some are required.
This initialization sequence is encoded in the :term:`Initialize Phase
Definition` (IPD), which includes several different versions in 
order to allow for extension of the initialization sequence for
future releases of NUOPC and to support backward compatibility.

Instead of tackling the full NUOPC initialization sequence at this point in 
developing your cap, we recommend that you start by adding calls in your cap's 
first initialization phase to your model's existing initialization subroutine(s).  
A good place to do this is within the Advertise Fields initialization phase.
This is the phase where each component "advertises" the fields it 
requires and can potentially provide.  In the cap code below, the Avertise
Field phase appears in lines 68-82.

You will need to add ``use`` statements at the top if your cap to import the relevant
initialization subroutines from your model into the NUOPC cap module.
See the code below for an example of where to add the call to your
model's initialization subroutine(s).

In the next section you will add another call into your model code
before attempting to execute your NUOPC cap.


.. _callrunfromcap:

Call Your Model's Run Subroutine from the Cap
---------------------------------------------

The Advance specialization point provided by the NUOPC Model
generic component is the place where you will call your
model's timestep subroutine.  You should add this call now.
In the example code, the subroutine
registered for the Advance specialization point is shown
in lines 101-146 and an example call to your model's timestep
subroutine is shown on line 143. 

This call should only move the model forward a single timestep, 
not the full run length.  If the
subroutine requires a parameter such as the timestep length or
the time to stop, then these parameters can be retrieved from
the cap's ``ESMF_Clock`` object.

If your model does not have a subroutine that takes a single timestep, 
you will need to create one now.

When you are done, your cap should look something like this:

.. literalinclude:: include/model1.F90
    :language: fortran
    :linenos:


.. _runcapwithdriver:

Run the Cap with a NUOPC Driver
-------------------------------

Now you should test the basic cap you have implemented. First, 
build your model along with the cap code using your model's build 
script or Makefile.  If you followed the procedure in the :ref:`genmakefrag`
section, your build process should have produced a NUOPC Makefile 
fragment file in addition to the compiled object files (or library).

To test the cap, we recommend running it using the `NUOPC 
Component Explorer <https://www.earthsystemcog.org/projects/nuopc/compliance_testing>`_, 
which is a specialized ``NUOPC_Driver`` designed
to execute any ``NUOPC_Model``.  `Complete instructions for
acquiring the Component Explorer and linking it to your NUOPC
cap are available <https://www.earthsystemcog.org/projects/nuopc/compliance_test>`_.

The instructions above also describe how to turn on the `NUOPC
Compliance Checker <https://www.earthsystemcog.org/projects/nuopc/compliance_testing>`_ 
while running the Component Explorer.  The 
Compliance Checker produces additional output in the ESMF log
files that is useful for debugging.  It also produces WARNINGS
in the logs if a compliance issue is identified.  When running with
the basic cap, you should not necessarily expect to have all compliance issues
resolved.  



.. _splitinit:

Split Up the Initialization Phases
----------------------------------

Once the basic cap described above can be executed using the Component Explorer,
you should modify the cap to implement the required initialization sequence
as described in the :ref:`Generic NUOPC Model <initseq>` documentation. This
includes advertising fields with standard names and realizing fields by creating
``ESMF_Field`` objects to wrap your model variables.  As part of this process,
you will need to describe your model's grid structure using the ESMF geometric
classes, e.g., ``ESMF_Grid`` and ``ESMF_Mesh``.


.. _validatecap:

Test and Validate Your Cap
--------------------------

After splitting up the initilization phases, rebuild your model and execute it again using
the Component Explorer with the Compliance Checker turned on.  Ideally, you
should see no compliance WARNINGS in the generated log files.  

**To validate that the NUOPC cap is faithfully reproducing your model's
behavior when run in non-NUOPC mode, you should compare your model's
output when run with the NUOPC cap against a baseline run.**  
This is the best test to ensure that the cap is working correctly.
If the NUOPC cap reproduces your baseline run, you are ready to integrate 
your NUOPC Model cap into a coupled system with other NUOPC components.
