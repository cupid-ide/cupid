The Big Idea
============

This section should help you understand fundamental aspects
of NUOPC design so that you can write the code necessary to
make your model NUOPC-compliant and able to interoperate in
NUOPC coupled applications.

NUOPC Model Cap
---------------

The NUOPC Model "cap" is the interface to your model when its used
in NUOPC-based systems.
**The term "cap" is used because it is
a small software layer that sits on top of your model, making 
calls into it.**  Typically, your model code will not make calls
back into the cap.  (Sometimes we say just "cap" or "NUOPC cap" 
because it's quicker than saying "NUOPC Model cap.")

Specializing Generic Components
-------------------------------

A key design idea behind NUOPC is that a lot of code (and therefore
behavior) is provided for you.  This code is provided in a set of
four generic components included with the NUOPC library.  
In this document, we focus primarily on 
the NUOPC Model component as that is the component that wraps
a typical model codebase, such as an atmosphere, ocean, ice, or
land surface model.

NUOPC components cannot be 100% generic, or you would not
need to write any code yourself!  The generic NUOPC Model implements
most of the initialization and run behavior for you, but you
have to supply some key parts of the implementation that are specific
to your model.  **The process of supplying your custom code that completes
the generic NUOPC Model component is called "specialization."**  In other
words, you are specializing the generic component to work for your
particular model.  Any parts of the code that you do not specialize are 
*inherited* from the generic component into your cap.  (Behind the
scenes, function pointers and callbacks are used to call into both
the generic behaviors plus any specialization code you provide.)

How Much Code Changes?
----------------------

**A common questions is:  How much of my model code do I need to change?**

Depending on how your code is already
structured, there are often little or no changes required to your 
model's internals.  The cap primarily acts as a separate software 
layer, and your model otherwise operates in its usual way.  

**The addition of NUOPC code to your model does not
mean that it will always be run as a NUOPC component.**  In all cases
we have worked with so far, existing models retain their native
modes of operation, and the NUOPC mode becomes an option, typically
set at compile time.

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
by your model at key parts during execution.  Whereas previously your 
model might have only received input data  from file, or from a 
hardwired connection to another model component, 
now input data will be able to come in from another NUOPC-compliant model.  
Likewise, the other NUOPC-compliant models will be able to accept data output from your model.
In other words, once your have a validated NUOPC cap (you only need to
write it once), you have an interoperable component that can be used in
systems with other NUOPC components.  (Of course, only
certain configurations of components make scientific sense.)

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
These tools will be discussed in the Testing section.

.. note:: **Four types of NUOPC Components**
    
    This documentation focuses primarily on the **Model** NUOPC Component.
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
            
    
   
