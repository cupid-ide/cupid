package org.earthsystemmodeling.cupid.handlers;

import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.nuopc.CodeGenerationException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.photran.core.IFortranAST;

public class GenerateCodeJob extends Job {

	public GenerateCodeJob(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	//NUOPCApplication app;
	
	//public GenerateCodeJob(String name) {
	//this.app = app;
	//

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		
		/*
		for (NUOPCComponent comp : app.getChildren()) {
			if (comp instanceof NUOPCDriver) {
				org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCDriver d = 
						new org.earthsystemmodeling.cupid.nuopc.v7bs59.NUOPCDriver(null);
				d.driverName = comp.getName();
				try {
					IFortranAST ast = d.forward();
				} catch (CodeGenerationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		*/
		
		return Status.OK_STATUS;
		
	}

}
