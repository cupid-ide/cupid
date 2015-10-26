Build Environment
=================

Before writing any code, you need to ensure the prerequisite 
software is available on the target system and take a few steps
to ensure that the NUOPC code you write can be compiled with your model.

Prerequisites
-------------

The primary prerequisite software is the NUOPC library, which is
included with the ESMF distribution, and your model, including
any of its dependencies.

You can acquire a recent version of ESMF from SourceForge::

 $ git archive --remote=git://git.code.sf.net/p/esmf/esmf --format=tar --prefix=esmf/ ESMF_7_0_0_beta_snapshot_58| tar xf - 

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



   
