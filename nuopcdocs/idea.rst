.. _bigidea:

The Big Idea
============

This section should help you understand key aspects of the NUOPC Layer
design that are critical for writing the code to make your model 
NUOPC Layer compliant.  The NUOPC Layer includes four kinds of
generic components, each with a different purpose in a
coupled application.  One kind of generic component is the 
:term:`NUOPC Model`,  a component that wraps a model
code (such as an atmosphere, ocean, or ice model) such that it
exposes the set of interfaces defined by the NUOPC specification.
You will work primarily with the NUOPC Model generic component
in order to make your model NUOPC Layer compliant.

.. note:: **Four Kinds of NUOPC Components**
    
    This documentation focuses primarily on the NUOPC **Model** Component.
    However, you should be aware that there are four kinds of generic 
    components implemented in the NUOPC Layer:
    
        Model
            Wraps a model code, such as an atmosphere, ocean, or ice model
            
        Connector
            Handles standard data transformations (e.g., redistribution
            or regridding) between two components in a single direction 
                        
        Mediator
            Contains custom coupling code (e.g., flux calculations, averaging)
            between Models; unlike the Connector, a Mediator can handle
            data from multiple Models with data flowing in multiple ways
            
        Driver
            Coordinates execution of Models, Mediators, and Connectors  
          


Specializing Generic Components
-------------------------------

.. sidebar:: Technical Note on Inheritance in NUOPC

    Those familiar with object-oriented programming will recognize
    the ideas of specialization and inheritance.  Since the NUOPC Layer
    is written mostly in Fortran 90, which has limited support for
    object-oriented programming, your specialization code is
    provided in Fortran subroutines which are registered with
    NUOPC using function pointers.  NUOPC makes callbacks into
    your code when required to execute the specialization code.
    
A key design idea behind NUOPC is that a lot of code (and therefore
behavior) is provided for you.  This code is provided via the
four generic components included with the NUOPC library, plus 
some additional utility routines.
The :term:`NUOPC Model` generic component 
implements most of the initialization and run behavior for you, but you
have to supply some key parts of the implementation that are specific
to your model.  **The process of supplying your custom code that completes
the generic NUOPC Model component is called specialization.**  In other
words, you are specializing the generic component to work for your
particular model.  Any parts of the code that you do not specialize are 
*inherited* from the generic component.  


NUOPC Model Cap
---------------

A :term:`NUOPC Model cap` is a Fortran module that contains your code
that specializes the generic NUOPC Model component for your
particular model.  The NUOPC Model cap serves as the interface
to your model when it's used in NUOPC-based systems. 
**The term "cap" is used because it is
a small software layer that sits on top of your model, making 
calls into it.**  Typically, your model code will not make calls
back into the cap.  Sometimes we say just "cap" or "NUOPC cap" 
because it's quicker than saying "NUOPC Model cap."


How Much of My Code Do I Need to Change?
----------------------------------------

The amount of code that your need to change depends on how your
model is structured and the degree to which it is already an
independent component.  The NUOPC cap itself does not usually require
changes to your model's internals.  Instead, the cap primarily 
acts as a separate software layer, and your model otherwise 
operates in its usual way. 

However, as detailed in the :ref:`preparemodel` section,
if your model is currently embedded as a subsystem in a larger
application and cannot be built independently, you must first take
steps to modularize the code and remove dependencies to other
models before beginning the NUOPC implementation.

**The creation of a NUOPC cap does not mean that your 
model must always be run as a NUOPC component.**  Existing models can
retain their native modes of operation, and running your model in 
NUOPC mode becomes a configuration option.

The NUOPC cap becomes a new locus of control for your model when 
your model is run in NUOPC mode. In other words, it will make calls into your
model code to initialize your model and step it forward in time.
One result of this is that the very top level main program of 
your model may not be used at all when your model is run in 
NUOPC mode.  This is because all models participating in a coupled
NUOPC application will be controlled by a separate generic component:
the NUOPC Driver.  

Putting control into a separate driver enables synchronization
of all models participating in a coupled application, allows NUOPC
to control when each model component runs (and for how long), and allows
NUOPC to intercept and inject variables produced and required
by your model at key parts during execution.  Once you have a working 
NUOPC cap (you only need to implement it once), you have an interoperable 
component that can be used in systems with other NUOPC components.  

How Do I Know it Works?
-----------------------

Validating your NUOPC cap is extremely important.  The idea is to
ensure that your model's current behavior is reproduced 
exactly as before, but this time with control flowing from the cap.  This is
why we encourage you to generate some baseline output by running
your model in its "normal" way before doing any implementation.  
You will validate your cap by ensuring that when it controls your model, 
the same output is reproduced. In most cases the output matches bit-for-bit
so a simple file-based comparison will be sufficient.

We also provide tools to help you check whether your cap is NUOPC-compliant.
**NUOPC Compliance can be evaluated using a combination of two tools, the Component
Explorer and the Compliance Checker, included in the ESMF/NUOPC software distribution.**
More information is provided in the :ref:`runcapwithdriver` and
:ref:`validatecap` sections.


            
    
   
