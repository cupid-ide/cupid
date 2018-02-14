package org.earthsystemmodeling.cupid.cli;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import org.earthsystemmodeling.cupid.util.CodeExtraction;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.FProjectNature;
import org.eclipse.photran.internal.core.lexer.Token;
import org.eclipse.photran.internal.core.parser.ASTCallStmtNode;
import org.eclipse.photran.internal.core.parser.ASTExecutableProgramNode;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;
import org.eclipse.photran.internal.core.parser.IProgramUnit;
import org.eclipse.photran.internal.core.properties.SearchPathProperties;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

import com.google.common.base.Joiner;

@SuppressWarnings("restriction")
public class AutoInstrument implements IApplication {
	
	private static ConsoleProgressMonitor monitor = new ConsoleProgressMonitor(System.out);
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		
		String[] commandArgs = (String[]) context.getArguments().get("application.args");
		console("Starting ESMF AutoInstrumenter");
		if (commandArgs.length < 1) {
			console("No compile command given");
			return IApplication.EXIT_OK;
		}
		
		final String currentDir = System.getProperty("user.dir");
		console("Working directory: " + currentDir);
		
		final IFolder currentFolder = linkToRootDirectory(currentDir, new NullProgressMonitor());
				
		final String compileCmd = Joiner.on(" ").join(commandArgs);
		console("Input command: " + compileCmd);
		
		//determine which file we are compiling
		String sourceFile = null;
		int sourceFileIndex = -1;
		for (int i = 1; i < commandArgs.length; i++) {
			if (!commandArgs[i].startsWith("-")) {
				if (commandArgs[i].trim().endsWith(".F90") || commandArgs[i].trim().endsWith(".f90")) {
					sourceFile = commandArgs[i];
					sourceFileIndex = i;
				}
			}
		}
		
		if (sourceFile != null) {
			console("Found source file: " + sourceFile);
			IFile file = currentFolder.getFile(sourceFile);
			if (file.exists()) {
		
				//modify source file
				PhotranVPG.getInstance().ensureVPGIsUpToDate(new NullProgressMonitor());
				
				IFortranAST ast = PhotranVPG.getInstance().acquirePermanentAST(file);
				//Token firstToken = ast.getRoot().findFirstToken();
				//String whiteBefore = firstToken.getWhiteBefore();
				//whiteBefore = "! AUTO-INSTRUMENT " + System.currentTimeMillis() + "\n" + whiteBefore;
				//firstToken.setWhiteBefore(whiteBefore);
				
				instrument(ast);
				
				String fileContents = PhotranVPG.getInstance().getSourceCodeFromAST(ast);
				
				String newFileName = file.getName().substring(0, file.getName().length() - file.getFileExtension().length() - 1);
				newFileName = newFileName + ".instrumented." + file.getFileExtension();
				IFile newFile = currentFolder.getFile(newFileName);
				newFile.delete(true,  new NullProgressMonitor());
				newFile.create(new ByteArrayInputStream(fileContents.getBytes()), true, new NullProgressMonitor());
				//file.setContents(new ByteArrayInputStream(fileContents.getBytes()), true, false, new NullProgressMonitor());
				
				//PhotranVPG.getInstance().commitChangesFromInMemoryASTs(new NullProgressMonitor(), 1, file);
				PhotranVPG.getInstance().releaseAST(file);
				
				commandArgs[sourceFileIndex] = newFileName;
				console("Modified command: " + Joiner.on(" ").join(commandArgs));
			}
		}
		
			
		final int errorRet = ExecHelper.execute(currentFolder, commandArgs);
		
		System.out.flush();
		System.err.flush();
		
		console("Exit ESMF AutoInstrumenter");
		return IApplication.EXIT_OK;		
	}
	
	private void instrument(IFortranAST ast) {
		
		IProgramUnit pu = ast.getRoot().getProgramUnitList().get(0);
		List<ASTCallStmtNode> callSites = new ArrayList<ASTCallStmtNode>();
		
		if (pu instanceof ASTModuleNode) {
			ASTModuleNode moduleNode = (ASTModuleNode) pu;
			moduleNode.getModuleBody().findAll(ASTSubroutineSubprogramNode.class).forEach(s -> {
				s.getBody().findAll(ASTCallStmtNode.class).forEach(c -> {
					System.out.println("Call: " + c);
					//callSites.add(c);
					
					if (s.getBody().contains(c)) {
						
						String regionName = c.getSubroutineName().getText();
						
						//c.getSubroutineName().
												
						String whiteBefore = c.findFirstToken().getWhiteBefore();
						String whiteAfter = c.findLastToken().getWhiteAfter();
						
						c.findFirstToken().setWhiteBefore("");
						c.findLastToken().setWhiteAfter("");
						
						ASTCallStmtNode traceEnter = CodeExtraction.parseLiteralStatement("call ESMF_TraceRegionEnter(\"" + regionName + "\")\n");
						traceEnter.findFirstToken().setWhiteBefore(whiteBefore);
						s.getBody().insertBefore(c, traceEnter);
						
						ASTCallStmtNode traceExit = CodeExtraction.parseLiteralStatement("call ESMF_TraceRegionExit(\"" + regionName + "\")\n");
						traceExit.findFirstToken().setWhiteAfter(whiteAfter);
						s.getBody().insertAfter(c, traceExit);
					}
					
				});
			});
		}
		
		
		
		
	}
	
	private IFolder linkToRootDirectory(String rootDir, IProgressMonitor monitor) throws CoreException {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		IProject proj = root.getProject("__CupidAutoInstrument");
		if (!proj.exists()) {
			proj.create(monitor);
			proj.open(monitor);
			FProjectNature.addFNature(proj, monitor);
			new SearchPathProperties().setProperty(proj, SearchPathProperties.ENABLE_VPG_PROPERTY_NAME, "true");
		}
		else {
			proj.open(monitor);
		}
						
		IFolder linkToRoot = proj.getFolder("linkToRoot");
		IPath locationToLink = new Path(rootDir);
		IStatus stat = workspace.validateLinkLocation(linkToRoot, locationToLink);
		if (stat.getSeverity() == IStatus.OK || stat.getSeverity() == IStatus.WARNING) {
			linkToRoot.createLink(locationToLink, IResource.REPLACE, monitor);
		} else {
		    console("Error creating link to rootDir: " + stat.getMessage());
		    return null;
		}
				
		proj.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		return linkToRoot;
	}
	

	@Override
	public void stop() {
		console("Force quit Cupid");
	}
	
	
	public static void console(String toWrite) {
		System.out.println(toWrite);
	}
	
}
