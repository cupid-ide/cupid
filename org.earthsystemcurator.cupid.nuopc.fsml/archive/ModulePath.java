package org.earthsystemcurator.cupid.nuopc.fsml.util;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class ModulePath {

	
	//FortranModulePaths=\\AtmOcnProto\n\\AtmOcnProto\\ESMF\\src\\Superstructure\\ESMFMod\\src\n\\AtmOcnProto\n\\AtmOcnProto\\ESMF\\src\\Infrastructure\\Base\\src\n\\AtmOcnProto\\ESMF\\src\\Infrastructure\\ArraySpec\\src\n\\AtmOcnProto\\ESMF\\src\\Infrastructure\\ArrayBundle\\src\n\\AtmOcnProto\\ESMF\\src\\Infrastructure\\Array\\src\n\\AtmOcnProto\\ESMF\\src\\addon\\NUOPC\\src\n\\AtmOcnProto\\ESMF\\src\n\\AtmOcnProto\\ESMF\n

	public static void main(String[] args) {
		
		String fn = "C:\\Users\\Rocky\\Documents\\eclipse\\runtime-nuopc\\AtmOcnProto";
		File f = new File(fn);
		List<String> dirs = new ArrayList<String>();
		moduleList(f, "\\\\AtmOcnProto", dirs);
		
		//System.out.println(dirs);
		String out = "";
		for (String s : dirs) {
			out += s + "\\n";
		}
		System.out.println(out);
		
	}
	
	public static void moduleList(File f, String base, List<String> dirs) {			
		
		File[] files = f.listFiles(new FileFilter() {

			@Override
			public boolean accept(File arg0) {
				return arg0.isDirectory();
			}
			
		});
		for (File file : files) {
			if (file.getName().equals("src") || file.getName().equals("interface")) {
				dirs.add(base + "\\\\" + file.getName());
			}
			moduleList(file, base + "\\\\" + file.getName(), dirs);
		}
			
	}
	
}
