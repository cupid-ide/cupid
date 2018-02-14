package org.earthsystemmodeling.cupid.cli;

import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.core.resources.IFolder;

import com.google.common.io.CharStreams;

public class ExecHelper {

	public static int execute(IFolder folder, String... cmd) throws InterruptedException, IOException {
		
		ProcessBuilder pb = new ProcessBuilder(cmd);
		//if (envMap != null) {
		//	pb.environment().putAll(envMap);
		//}
		pb.directory(folder.getLocation().toFile());
		
		Process execProc = pb.start();
				
		String stdout = CharStreams.toString(new InputStreamReader(execProc.getInputStream()));
		String stderr = CharStreams.toString(new InputStreamReader(execProc.getErrorStream()));

		execProc.waitFor();
		
		System.out.println(stdout);
		System.err.println(stderr);
		
		/*
		if (execProc.exitValue() != 0) {
			System.out.println("\n\n*****************************************");
			System.out.println("EXECUTION FAILED");
			System.out.println("Working directory: " + folder.getLocation().toFile().getPath());
			System.out.println("******************************************");
			System.out.println("\nSTDOUT:\n****************************\n\n" + stdout);
			System.out.println("\nSTDERR:\n****************************\n\n" + stderr);
			return false;
		}
		*/
		
		return execProc.exitValue();
			
	}
	
	
}
