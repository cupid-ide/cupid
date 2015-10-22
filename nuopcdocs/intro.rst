Overview of Steps to Create a NUOPC-compliant Model
===================================================

NUOPC is a software layer included with ESMF that ensures interoperability
of models in coupled applications.  In most cases, NUOPC interfaces are to
be added to an existing model codebase in order to make the model NUOPC-compliant
and therefore able to participate in NUOPC-based applications.

This documentation will help you understand the steps required to add NUOPC
interfaces to an existing model.  At the highest level, there are several
basic tasks:

	#.  Set up your build environment
	
	#.  Write a customized NUOPC Model "cap"
	
	#.  Test the NUOPC cap

The sections below describe each of these in more detail.


Build Environment
=================

Before writing any code, you need to ensure the prerequisite 
software is available on the target system and take a few steps
to ensure that the added NUOPC code can be built with your model.

Prerequisites
-------------

The primary prerequisite software is the NUOPC library, which is
included with the ESMF distribution.

You can acquire a recent version of ESMF from SourceForge::

	$ git archive --remote=git://git.code.sf.net/p/esmf/esmf --format=tar --prefix=esmf/ ESMF_7_0_0_beta_snapshot_57 | tar xf - 

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

In most cases, you should choose a configuration of your model that is 
simple and stable. Many models have regression test configurations
that can be run quickly and have small output files.  These configurations
are typically low resolution, have short execution times, and sometimes 
have idealized initial conditions.  Some models can also be configured 
with some of the physics options turned off to reduce the total amount 
of computation.  

**Compile your model on the target system and generate baseline output for the 
selected configuration.**   This is typically a small set of history or restart 
files.  We'll use these files later to ensure that your model is reproducing the 
expected output when executed through the NUOPC cap.  In most cases, when
your model is executed through its NUOPC cap, the output should be bit-for-bit
identical with non-NUOPC runs.  (The one caveat to this is that when your
model is used in a coupled system, roundoff error may occur due to slight
differences introduced when grid interpolation is used between models.)



Building a NUOPC Model
=======================

In order for a model to participate in a NUOPC-compliant coupled system, a 
:term:`NUOPC Model cap` must be written for the model.  The NUOPC Model *cap* is 
simply a Fortran module with certain required subroutines.  We call it a 
"cap" because it sits on top of your model code and mediates interactions 
of your model with the coupling infrastructure.  In most cases, there are 
little or no changes required to model internals, so the cap is only used 
in NUOPC-based systems, and the model otherwise operates in its usual way.


Overview of Steps to Build a NUOPC Model Cap
--------------------------------------------

	#.  Decide on a basic configuration of your model to use during development of the NUOPC cap.

	#.  Start with a basic code template of a NUOPC Model cap.  

	#.  Initialize your model from the cap.

	#.  Call your model's update (timestepping) subroutine from the cap.

	#.  Plug your cap into a NUOPC Driver and try to get through a short run of several timesteps.  

	#.  Go back and split up the initialize phases as required by NUOPC.  

	#.  Test the cap in a NUOPC coupled system.  

Each of these steps is described in more detail in the sections below.








Integrating NUOPC Code into Your Model's Codebase
-------------------------------------------------

An important question is where you will put your NUOPC cap source code.
The NUOPC cap code added to a model is minimal and is typically 
contained either in a single source file or a small set of files.  We recommend
including the NUOPC cap code in the *same code repository with the rest of your 
model code* as this helps to ensure the cap evolves with your code and simplifies
the process of acquiring a NUOPC-compliant version of your model.

Including the cap code in your model's codebase does *not* imply that your
model must always be run in NUOPC mode.  Instead, when the cap is complete,
the NUOPC mode can be viewed as a configuration option of your model.

The exact right place to put the cap code is your decision and largely depends 
on your model's directory structure.  


Acquire a NUOPC Model Cap Code Template
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

We recommend starting from a NUOPC Model cap code template.  
There are at least a couple options:

	1.  Use code from one of the `NUOPC Prototype applications <http://sourceforge.net/p/esmfcontrib/svn/HEAD/tree/NUOPC/tags/ESMF_7_0_0_beta_snapshot_52/>`_ or from an existing NUOPC Model cap.
	
	2.  Use the Cupid plugin for Eclipse to generate NUOPC code.


**MORE details about getting the code**


NUOPC Makefile Fragment
^^^^^^^^^^^^^^^^^^^^^^^

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





Initialize Your Model from the Cap
----------------------------------


Call Your Model's Run Subroutine from the Cap
---------------------------------------------


Test with a Simple NUOPC Driver
-------------------------------


Split Up Initialize Phases
--------------------------


Test Cap in a NUOPC Coupled System
----------------------------------



   
