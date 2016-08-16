Runtime Analysis of NUOPC Applications
======================================

This section describes Cupid's features for analyzing a NUOPC application
run.  The analysis is performed after a run is completed by examining the 
ESMF log files output from a NUOPC application.  These files are usually
named `PETXXX.ESMF_LogFile` where XXX is the PET number.


Perform a Run of a NUOPC Application
------------------------------------

First, make sure you compile your application with **ESMF version 7.1 beta
snapshot** or later.

In order for the analysis entries to be put into the ESMF log files, you
must set the following environment variable before the run:

.. code-block:: bash
		
	$ export ESMF_RUNTIME_COMPLIANCECHECK=ON:JSON=ON
	
Then, execute the NUOPC application in the way you normally do. After the
run you should notice specialized "JSON" messages in the `PETXXX.ESMF_LogFile`
files.

Transfer one or more of the `PETXXX.ESMF_LogFile` files to your local machine
where Eclipse is installed.  The log files are analyzed one at a time, so in many
cases you do not need the log file of every PET.

Create Tracing Project and Import ESMF Log Files
------------------------------------------------

In Eclipse, create a new Tracing Project from the menu:  Select File->New->Project...
In the folder "Tracing" choose "Tracing Project" and click Next.  Give the project
a name and then click Finish.

The new tracing project will appear in the Project Explorer to the left, including
an `Experiments` folder and a `Traces` folder.  Right-click (CTRL-click on Mac) on the
`Traces` folder and select Import...  Assuming you have transferred the log files locally,
select the root directory containing the log files and then check off the log files
you wish to import.  Then click Finish.

.. figure:: images/trace_import.png
   :scale: 85 % 
   
   Import ESMF log files into the trace project.

The imported log files will appear in the `Traces` folder of your project.  Double-click
to open a log file in the viewer.  This will list all of the log events and allow you
to search/filter at the top.


Supported Analyses
------------------

Currently, the two supported analyses are the NUOPC Call Stack and the NUOPC State 
Explorer.  The views should show up in the Fortran perspective.  If not, from the
menu select Window->Show View->Other... and open the NUOPC folder.  Then you can
select the views to open.

The NUOPC Call Stack view shows visually when each ESMF method is entered and exited
and also includes a "prologue" and "epilogue" before and after each method. 

The NUOPC State Explorer shows in a tree view the state of many objects of the
NUOPC application including information about Components, States, and Fields.
Typically, during a debug session you'll want to know the state of the system 
before and after each ESMF method.  Therefore, it is recommended that you stack
the NUOPC Call Stack view on top of the NUOPC State Explorer view, as shown below.
When you click on a particular point in the Call Stack, the State Explorer will
synchronize its state to that time.

.. figure:: images/trace_workbench.png
   :scale: 95%
   
   The ESMF log viewer, NUOPC Call Stack view, and NUOPC State Explorer views.


