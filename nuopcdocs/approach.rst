Writing a NUOPC Cap for Your Model
==================================

While there is no one right way to write the NUOPC cap code, the following
recommended steps represent an incremental approach to developing the cap.

 #.  :ref:`installesmf`
 #.  :ref:`chooseconfig`
 #.  :ref:`integratecap`
 #.  :ref:`genmakefrag`
 #.  :ref:`initmodelfromcap`
 #.  :ref:`callrunfromcap`
 #.  :ref:`runcapwithdriver`
 #.  :ref:`splitinit`
 
 
 
.. _installesmf:

Install ESMF and NUOPC on the Target Machine
--------------------------------------------

Before writing any code, you need to ensure the prerequisite 
software is available on the target system.

The primary prerequisite software is the NUOPC library, which is
included with the ESMF distribution, and your model, including
any of its dependencies.

You can acquire a recent version of ESMF from SourceForge:

.. code-block:: bash

  $ git archive --remote=git://git.code.sf.net/p/esmf/esmf \ 
    --format=tar --prefix=esmf/ ESMF_7_0_0_beta_snapshot_58| tar xf - 


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
update your build to link against the latest version of ESMF.** We
highly recommend doing this step first, before beginning any NUOPC
development.


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
    * use the `Cupid plugin for Eclipse <https://www.earthsystemcog.org/projects/cupid/>`_ to generate code.
    
Put the initial cap code into your model source tree.  Then, modify
your Makefile or build scripts so that the cap is compiled with the
rest of your model code.  Unless your model is already using ESMF,
you'll need to add ESMF compile and linking flags in order to build
the cap.  **When ESMF is installed, a Makefile fragment named esmf.mk 
is generated that contains variables that can be appended to your compile and
link flags.**  The `ESMF User Guide <http://www.earthsystemmodeling.org/esmf_releases/public/last/ESMF_usrdoc/node7.html>`_ 
explains how to use these variables in your Makefile.
   

.. _genmakefrag:

Modify Your Buid to Generate a NUOPC Makefile Fragment
------------------------------------------------------

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

 `Standardized Component Dependences <http://www.earthsystemmodeling.org/esmf_releases/last_built/NUOPC_refdoc/node5.html>`_
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
 
 | # this target builds your model + the nuopc code
 | $ make nuopc
 |
 | # this target installs your NUOPC-compliant to a particular directory
 | $ make nuopcinstall DESTDIR=/path/to/install


.. _initmodelfromcap:

Initialize Your Model from the Cap
----------------------------------

The cap template you placed in your source tree is in no way connected
to your model.  Instead of tackling the full set of NUOPC initialization
phases up front, we recommend that you start by adding calls in the cap's 
first initialization phase to your existing initialization routine(s).  
A good place to do this is within the Advertise Fields initialization phase.
You will need to add ``use`` statements at the top to import the relevant
initialization subroutines from your model into the NUOPC cap module.


.. _callrunfromcap:

Call Your Model's Run Subroutine from the Cap
---------------------------------------------

Inside the Advance specialization subroutine, add a call to your
model's timestep subroutine.  This call should only move the
model forward a single timestep, not the full run length.  If the
routine requires a parameter such as the timestep length or
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
---------------------------------------

With the basic cap written, you should build your model along
with the cap code using your model's build script or Makefile.  

If your build procedure typically creates
an executable, it should now be changed to produce a 



.. _splitinit:

Split Up the Initialization Phases
----------------------------------


