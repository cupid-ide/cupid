package org.earthsystemmodeling.cupid.views;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;

import org.earthsystemmodeling.FSM;
import org.earthsystemmodeling.cupid.codedb.CodeDBIndex;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc_v7.Child;
import org.earthsystemmodeling.cupid.nuopc_v7.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc_v7.Label;
import org.earthsystemmodeling.cupid.nuopc_v7.NUOPCDriver;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

import alice.tuprolog.InvalidTheoryException;
import alice.tuprolog.event.WarningEvent;
import alice.tuprolog.event.WarningListener;

@SuppressWarnings("restriction")
class NUOPCViewContentProvider2 implements IStructuredContentProvider, ITreeContentProvider {
	
	private IFile input;
	private CodeDBIndex codeDB = CodeDBIndex.getInstance();
	private WarningListener warningListener;
	
	public NUOPCViewContentProvider2() {
		
		codeDB.openConnection();
		codeDB.rebuildDatabase();
		codeDB.clearTheory();
		try {
			//TODO: add these somewhere else
			codeDB.addTheory("nuopc_model(_mid, _name, _uid) :- module(_mid, _name), uses(_uid, _mid, 'NUOPC_Model').");
			codeDB.addTheory("esmf_setservices(_id, _parentid, _name) :- subroutine(_id, _parentid, _name),"
					+ "param(_pid1, _id, 1, _pname1, 'type(esmf_gridcomp)', _, _),"
					+ "param(_pid2, _id, 2, _pname2, 'integer', false, true).");
		} catch (InvalidTheoryException e) {
			CupidActivator.log("Invalid theory", e);
		}
		
		warningListener = new WarningListener() {
			@Override
			public void onWarning(WarningEvent e) {
				CupidActivator.log(Status.WARNING, "Prolog warning: " + e.getMsg());
			}
		};
		
		codeDB.getProlog().addWarningListener(warningListener);
		
	}
	
	
	
	public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		
		if (newInput != null) {
			input = (IFile) newInput;
			
			//test CodeDB approach
			long startRebuild = System.currentTimeMillis();
			codeDB.truncateDatabase();
			long endRebuild = System.currentTimeMillis();
			
			String filename = PhotranVPG.getFilenameForIFile(input);
			long startParse = System.currentTimeMillis();
			//IFortranAST ast = PhotranVPG.getInstance().parse(filename);
			PhotranVPG.getInstance().releaseAST(filename);
			IFortranAST ast = PhotranVPG.getInstance().acquireTransientAST(filename);
			long endParse = System.currentTimeMillis();
			
			long startIndex = System.currentTimeMillis();
			if (ast != null) {
				codeDB.indexAST(ast);
			}
			long endIndex = System.currentTimeMillis();
			
			CupidActivator.log(IStatus.INFO, "Rebuild DB time: " + (endRebuild-startRebuild));
			CupidActivator.log(IStatus.INFO, "Parse time: " + (endParse-startParse));
			CupidActivator.log(IStatus.INFO, "Index DB time: " + (endIndex-startIndex));
			
			//attempt a query
			/*
			String query = "";
			try {
				
				//String query = "module(_mid, _modname), uses(_uid, _mid, _usedMod), (_usedMod='NUOPC_Model'; _usedMod='NUOPC_DriverAtmOcn').";
				//String query = "param(_id, _pid, _idx, _name, _type, _intentIn, _intentOut).";
				//String query = "esmf_method(_id, _parentid, _name).";
								
				query = "call_(_id, _modid, 'NUOPC_CompDerive'),"
						+ "callArg(_arg1, _id, 1, _expr1),"
						+ "callArg(_arg2, _id, 2, _expr2),"
						+ "callArg(_arg3, _id, 3, _expr3).";
			
				//query = "call_(_id, _modid, 'NUOPC_CompDerive'),"
				//		+ "findall(_expr, callArg(_x,_id,_y,_expr), _args).";
				
				//query = "findall(_expr, callArg(_x,_id,_y,_expr), _args).";
				
				//List<Struct> results = codeDB.query(query);
				//for (Struct t : results) {
				//	System.out.println("Result: " + t);
				//}
				ResultSet rs = codeDB.query2(query);
				
				while (rs.next()) {
					System.out.println("Result: " + rs.getLong("_id"));
				}
				
			} catch (MalformedGoalException e) {
				System.out.println("BAD QUERY: " + query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			
			//NUOPCDriver driver = new NUOPCDriver(codeDB).reverse();
			//System.out.println("Reverse engineer driver:\n" + driver);
			//NUOPCDriverAtmOcn driverAtmOcn = new NUOPCDriverAtmOcn();
			
			//boolean matches = driverAtmOcn.match(codeDB);
			//System.out.println("matches driverAtmOcn = " + matches);
			
		}
	}
		
	public void dispose() {
		if (warningListener != null && codeDB != null) {
			codeDB.getProlog().removeWarningListener(warningListener);
		}
	}
	
	public Object[] getElements(Object parent) {	
		NUOPCDriver driver = new NUOPCDriver(codeDB).reverse();
		if (driver != null) {
			return new Object[] {driver};
		}
		else {
			return new Object[0];
		}
			
	}
	
	public Object getParent(Object child) {
		return null;
	}
	
	public Object [] getChildren(Object p) {
		ArrayList children = new ArrayList();
		CodeConcept<?,?,?> cc = (CodeConcept<?,?,?>) p;
		Class<?> clazz = cc.getClass();
		for (Field field : clazz.getFields()) {
			if (field.getAnnotation(Child.class) != null) {
				try {
					Object childVal = field.get(cc);
					children.add(childVal);
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		
		return children.toArray();
	}
		
	public boolean hasChildren(Object p) {
		return getChildren(p).length > 0;
	}
	
	
	
}