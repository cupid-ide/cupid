package org.earthsystemmodeling.cupid.cli;

import java.io.PrintStream;

import org.eclipse.core.runtime.IProgressMonitor;

public class ConsoleProgressMonitor implements IProgressMonitor {

	private PrintStream out;
	
	public ConsoleProgressMonitor(PrintStream out) {
		this.out = out;
	}
	
	@Override
	public void beginTask(String name, int totalWork) {
		out.print(name + ": ");
	}

	@Override
	public void done() {
		out.println(" - complete");
	}

	@Override
	public void internalWorked(double work) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isCanceled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setCanceled(boolean value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTaskName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void subTask(String name) {
		out.print(" " + name);
	}

	@Override
	public void worked(int work) {
		String w = ".";
		for (int i=1; i<work; i++) w+= ".";
		out.print(w);
	}

}
