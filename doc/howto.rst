How To
======

Verify that Cupid is Installed
------------------------------

To verify that Cupid is installed, view the Eclipse Installation Details by selecting
**Help -> Installation Details** from the Eclipse menu.  You should see Cupid in the list
of installed software.

.. image:: images/install_details.png
    :scale: 70%


Import NUOPC Code
-----------------



Reverse Engineer a NUOPC Cap
----------------------------

Cupid's reverse engineering function is capable of analyzing the source 
code of a NUOPC component to create a representation at a higher level
of abstraction.  The reverse engineering analysis is limited to only the 
NUOPC cap of a component, which is typically a single Fortran module.
The analysis does not descend into the model code itself.
Once the higher level representation is obtained, Cupid
is able to provide NUOPC-aware capabilities, such as basic validation
of correct API usage and in-place code generation--i.e., weaving new code
into the correct places of an existing source file.

The reverse engineering analysis phase happens automatically as a background
process when a file is opened that contains code for a NUOPC component.  A basic
check is done to determine if the file is likely to be a NUOPC component. The
check is to see that if the file contains Fortran code and if so that it
imports (uses) one of the generic NUOPC modules (``NUOPC_Model``, 
``NUOPC_Mediator``, or ``NUOPC_Driver``). 

Show the NUOPC View
^^^^^^^^^^^^^^^^^^^

The results of the reverse engineered code can be seen in outline form 
in the NUOPC View.  

.. figure:: images/nuopc_view.png
   :scale: 70 %
 
   The NUOPC View (to the right of the source code) shows an outline
   of a reverse engineered NUOPC component.

The NUOPC View is set up to show whenever the Fortran perspective is selected.
The current perspective is shown in the upper right-hand corner of Eclipse.
There is also an Open Perspective button which can be used to select the
Fortran perspective if it is not already shown.

.. figure:: images/perspectives.png
   
   The NUOPC View is set to appear automatically from the Fortran perspective
   (circled in blue).  Click the Open Perspective button (circled in green)
   to open a new perspective.
   
There are other ways to show the NUOPC View:

  * If the NUOPC View is not visible and you open a file with NUOPC
    code, a dialog will ask you if you would like to open the
    NUOPC View.  This behavior can be turned off in the Cupid
    preferences (select **Window -> Preferences** from the menu and
    select Cupid in the list on the left).
    
  * The main toolbar contains a Show NUOPC View button, circled in
    green below
  
    .. image:: images/nuopc_toolbar.png
  
  * The NUOPC View can be accessed from the 
    **Window -> Show View -> Other** menu
        
The NUOPC View will automatically synchronize with the editor that
has the focus.  It will also refresh whenever you save the file
active in the editor.  (The file will be re-analyzed in the background.)  
If a file does not contain a NUOPC component, the NUOPC View will be blank.

Elements in the NUOPC View outline
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

The outline shown in the NUOPC View in a tree where each element
represents something in the source code, such as a SetServices subroutine,
a NUOPC initialization subroutine, a specialization point subroutine,
imports of NUOPC generic modules, or calls into the NUOPC API. Many
of the elements have small icons: a blue circle with an M maps to a
Fortran module, a green circle maps to subroutine, and a yellow arrow 
pointing to the right represents a subroutine or function call. If
a green circle has a small upward triangle in the corner, it indicates
that the subroutine is not in the current module, but is inherited
from a NUOPC generic component.  Grayed out items do not map to any
source code element, but represent subroutines or API calls that
can be generated.  Red items indicate that there is a validation
problem rooted at that element.  Some elements indicate a cardinality
such as [1..n], which indicates that one or more elements of that type
can exist, or [0..1], which indicates the element is optional.  

The outline is divided into several major sections:

  * module imports (only specific ones are shown)
  * SetServices
  * initialization phases and specialization points
  * run phases and specialization points
  * finalize phases and specialization points


.. figure:: images/nuopc_view_errors.png
   
   The NUOPC View showing an outline of a NUOPC Model cap.

The NUOPC View is linked to the source code in the active editor.
To navigate to the source code related to the element, double-click
the element.  The relevant code segment will be brought into
focus.  If the element maps to a subroutine definition, the name of 
the subroutine will be highlighted.  If the element maps to an API
call, the call will be highlighted.  If an element represents an
inherited subroutine (a green circle with small triangle), then
it does not appear in the current file, so no code will be highlighted
when double-clicking the element.

.. figure:: images/nuopc_view_nav.png
   
   Double-clicking on an element in the NUOPC View outline brings
   the relevant code segment into focus in the editor.
   
   
Validation Errors in the NUOPC View
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

Elements in red in the NUOPC View indicate a validation error.
Currently, the validations performed are to check for
missing subroutines and API calls required by NUOPC, e.g., a missing initialization
phase or a missing specialization point.  The `NUOPC Reference Manual`_
details, for each type of component, which subroutines are required
and which are optional.  Red elements do not indicate a Fortran
compilation issue, but indicate that NUOPC expects the
element to be present and a runtime error will occur without it.
The figure below indicates that the *Advance* specialization point
could not be found during the reverse engineering procedure. Within
NUOPC, *specialization points* are user-provided subroutines that are
called by NUOPC.  Notice also that parent elements are red 
all the way to the root of the tree.  Therefore, if the root of the
tree is red, it indicates a validation issue somewhere below.

To address the issue of the missing Advance element, a new subroutine
needs to be added to the code and that subroutine registered in the
``SetServices`` subroutine.  When this is done, the reverse
engineering engine will pick up this code and the red elements
will disappear.  The section :ref:`generate-code` explains how
to use Cupid to generate skeleton code for missing elements.

.. figure:: images/nuopc_view_error_zoom.png
   
   The Advance element is red because it could not be found by
   the reverse engineering engine.


.. note:: 

   Cupid's reverse engineering and validation engineer are based on
   static source code analysis.  The engine depends on an internal program database
   (Virtual Program Graph or VPG) provided by the Photran plugin for Eclipse. 
   If a source file does not contain correct Fortran code, the internal
   parser will fail and the reverse engineering analysis will not
   be executed at all, resulting in a blank NUOPC View outline.
   
   There are limitations to static analysis giving rise to false negatives--i.e.,
   reporting a validation issue when in fact the NUOPC component will behave
   correctly.  For example, in some cases the reverse engineering engine 
   expects NUOPC API calls to appear
   within a given subroutine, say SetServices.  In reality, the required API
   call may appear in a different subroutine called by SetServices or even
   several levels down in the call tree. Cupid does not currently perform a 
   full control flow analysis to find NUOPC calls because it is an expensive
   operation.  And, even control flow analysis is limited due to conditional
   logic in the code that depends on the state of the program at runtime.
   
   Cupid, therefore, is fundamentally limited by the realities of
   static analysis.  However, most NUOPC caps have a very similar structure
   with a fair amount of boilerplate code, so we expect that most codes
   will be correctly reverse engineered.   
   
 
 
 


.. _generate-code:

Generate NUOPC-compliant Code
-----------------------------




Generate Skeleton Code for a Complete NUOPC Coupled Application
---------------------------------------------------------------

A good way to learn about how NUOPC coupling infrastructure works
is to build a skeleton application containing all of the "plumbing"
but with no real science code to keep it small.

Create a new NUOPC project using the NUOPC Project wizard.  Select
**File -> New -> Project...** from the menu.  Select the NUOPC Project
option under the NUOPC folder and click Next.

.. image:: images/new_project.png
    :scale: 70%

On the next screen, select a starting configuration for the skeleton
NUOPC application.  Ideally, you should find a configuration that 
looks something like the actual coupled application you are building.  
But, the selected configuration is a starting point -- you will be able to 
modify the architecture, e.g., by adding new components or rearranging
the connections between components.

.. image:: images/new_project_p1.png
    :scale: 70%

On the final screen of the wizard, type in a project name and click
Finish.  The new project will be created.  Initially, the project will
contain a .nuopc file and a .aird file.  The .nuopc file is a configuration
file describing the coupled system.  The .aird file is a representation
file that shows a graphical representation of the coupled system.  

.. image:: images/new_project_explorer.png
    :scale: 70%

However, before exploring or modifying these files, let's generate all the NUOPC 
code for the system as it stands. Right click on the .nuopc file and select 
**NUOPC -> Generate NUOPC code** from the context menu.  The code for the NUOPC
skeleton application will be generated based on the contents of the .nuopc file.
This includes:

  * A NUOPC "cap" for each Model and Mediator component
  * A NUOPC Driver
  * A top-level main program
  * A makefile

.. image:: images/gen_code_explorer.png
    :scale: 70%

Build the Skeleton Application Locally
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

The generated code can now be built using make and the generated Makefile.
To build on the same system that Eclipse is running (this is the easiest
way), first `ensure that ESMF v7 is installed <http://www.earthsystemmodeling.org/esmf_releases/non_public/ESMF_7_0_0/ESMF_usrdoc/node9.html>`_.

The environment variable ESMFMKFILE needs to be set to the location of the
esmf.mk file in the ESMF installation directory.  It is in the same
directory with the ESMF library file(s).  (More info on the esmf.mk file is
available in the `ESMF User Guide <http://www.earthsystemmodeling.org/esmf_releases/non_public/ESMF_7_0_0/ESMF_usrdoc/node7.html>`_.)

To set the ESMFMKFILE environment variable in Eclipse, right click on the 
project folder in the Project Explorer and select **Properties** from the context
menu.  Select **Fortran Build -> Environment** in the list on the left and add
a new environment variable.  Set the name to ESMFMKFILE and the value to the
location of the esmf.mk file on your system.  Click OK when done.

.. image:: images/env_properties.png
    :scale: 70%

To build from within Eclipse, find the Make Target view on the right side and
double click the "all" target.  If the Make Target view is not shown, you can
bring it up by selecting **Window -> Show View -> Make Target** from the menu.

.. image:: images/make_target_view.png
    :scale: 70%
    
The output from the build will be shown in the Console view at the bottom. The
last file built will be the executable and it is typically named the same as the
project itself.
    
.. image:: images/console_view.png
    :scale: 70%

Set up a Parallel Application run and  Execute Locally
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

To execute the application on the same system on which Eclipse is running (again,
this is the easiest way), set up a Parallel Application run configuration by 
selecting **Run -> Run Configurations...** from the menu.  The configuration
will be dependent on the MPI distribution on your local machine, but you should
use the same MPI distribution that was used to compile ESMF.  On the Application
tab, you need to select the location of the executable that was generated.  
    
.. image:: images/parallel_run_config.png
    :scale: 70%

After configuring the parallel run, click Run and you will see output from the
run in Console.  ESMF log files will also be generated, one per process.  These
are named PETX.ESMF_LogFile.  If you do not see the log files immediately after
the run, right click on the project folder and select **Refresh** from the
context menu.
    
.. image:: images/console_run.png
    :scale: 70%
 


.. _NUOPC Reference Manual: http://www.earthsystemmodeling.org/esmf_releases/non_public/ESMF_7_0_0/NUOPC_refdoc/
    