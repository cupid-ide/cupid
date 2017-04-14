/**
 * 
 */
package org.earthsystemmodeling.cupid.trace;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


/**
 * @author rocky
 *
 */
public class MoveFiles {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		String root = "/home/rocky/tmp/theia/traceout";
		String dest = "/home/rocky/tmp/theia/traceout/reorg";
		
		File curDir = new File(root);
		File destDir = new File(dest);
		
		for (File petDir : curDir.listFiles()) {
			if (petDir.getName().startsWith("PET")) {
				System.out.println(petDir.getName());
				String petNo = petDir.getName().substring(3);
				File streamFile = new File(petDir, "esmf_stream_0");
				if (petNo.length() > 0 && streamFile.exists() && Integer.valueOf(petNo) < 100) {
					System.out.println("Copy file: " + streamFile.getPath());
					File destFile = new File(destDir, "esmf_stream_" + petNo);
					System.out.println("Dest file: " + destFile.getPath());
					FileUtils.copyFile(streamFile, destFile);
				}
			}
		}

		
	}

}
