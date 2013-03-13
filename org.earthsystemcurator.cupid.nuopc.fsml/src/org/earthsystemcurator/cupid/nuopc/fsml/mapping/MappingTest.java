package org.earthsystemcurator.cupid.nuopc.fsml.mapping;

import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

@SuppressWarnings("restriction")
public class MappingTest {

	public static String ffile = "C:\\Users\\Rocky\\Documents\\eclipse\\workspace4.2-cplgen\\org.earthsystemcurator.cupid.nuopc.fsml\\instance\\atm.F90";
	public static String mfile = "C:\\Users\\Rocky\\Documents\\eclipse\\workspace4.2-cplgen\\org.earthsystemcurator.cupid.nuopc.fsml\\instance\\Model.xmi";
	
	public void go() {
		
		PhotranVPG vpg = PhotranVPG.getInstance();
		//IFortranAST ast = vpg.parse(ffile);
		IFortranAST ast = vpg.acquireTransientAST(ffile);
		
		
		System.out.println("ast: " + ast);
		System.out.println("ast.getRoot(): " + ast.getRoot());
		System.out.println("pu: " + ast.getRoot().getProgramUnitList().get(0).toString());
		
	}
	
}
