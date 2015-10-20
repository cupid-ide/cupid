.. highlight:: fortran

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


Prerequisites
-------------

Acquire a recent version ESMF (which also includes NUOPC). ::

	$ git archive --remote=git://git.code.sf.net/p/esmf/esmf --format=tar --prefix=esmf/ ESMF_7_0_0_beta_snapshot_57 | tar xf - 

Compile and install ESMF.  Full installation details can be found in the `ESMF
User Guide <http://www.earthsystemmodeling.org/esmf_releases/public/last/ESMF_usrdoc/node6.html#SECTION00064000000000000000>`_.  An example of the basic procedure 
for one particular system is outlined below. 

.. code-block:: bash
	
	# set environment variables for build	
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

	



Install Sphinx
--------------

Install Sphinx, either from a distribution package or from
`PyPI <https://pypi.python.org/pypi/Sphinx>`_ with ::

   $ pip install Sphinx

Here is some source code in Fortran, also see :ref:`another_section`.	

.. code-block:: fortran
   :caption: This is the caption
   :name: codeblockone

   subroutine myFortranSub(paramA, paramB)
     integer :: paramA
     real    :: paramB
    
    paramA = paramB
   end subroutine

That is the end and this is a :term:`environment` in the glossary.


.. _another_section:

Another section
---------------

This is antoher section


The glossary
------------

.. glossary::

   cap
      A structure where information about all documents under the root is
      saved, and used for cross-referencing.  The environment is pickled
      after the parsing stage, so that successive runs only need to read
      and parse new and changed documents.

   
