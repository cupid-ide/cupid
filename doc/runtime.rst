Runtime Analysis of NUOPC Applications
======================================

This section describes Cupid's features for analyzing a NUOPC application
run.  The analysis is performed after a run is completed by examining the 
ESMF log files output from a NUOPC application.  These files are usually
named `PETXXX.ESMF_LogFile` where XXX is the PET number.


Perform a Run of a NUOPC Application
------------------------------------

In order for the analysis entries to be put into the ESMF log files, you
must first set the following environment variable:

.. code-block:: bash
		
	$ export ESMF_RUNTIME_COMPLIANCECHECK=ON:JSON=ON
	
Then, execute the NUOPC application in the way you normally do. After the
run you should notice specialized "JSON" messages in the `PETXXX.ESMF_LogFile`
files.

Create a Tracing Project in Eclipse
-----------------------------------

Import the ESMF Log Files
-------------------------

Support Analyses
----------------




