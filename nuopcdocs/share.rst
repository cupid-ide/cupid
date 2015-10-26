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
