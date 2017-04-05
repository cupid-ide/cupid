package org.earthsystemmodeling.cupid.cli;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.earthsystemmodeling.cupid.cc.CodeConceptInstance;
import org.earthsystemmodeling.cupid.cc.CodeConceptManager;
import org.earthsystemmodeling.cupid.cc.nuopc.NUOPC;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.reindenter.Reindenter;
import org.eclipse.photran.internal.core.reindenter.Reindenter.Strategy;
import org.eclipse.photran.internal.core.vpg.PhotranVPG;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

public class ConfigParser {

	private IFolder root;
	private IProgressMonitor monitor;
	
	private static NUOPC NUOPCDEF = NUOPC.getInstance();
	private static CodeConceptManager manager = CodeConceptManager.getInstance();
	
	public ConfigParser(IFolder root, IProgressMonitor monitor) {
		this.root = root;
		this.monitor = monitor;
	}
	
	public void generate(File configFile) throws FileNotFoundException, YamlException {
		
		//Map compMap = new HashMap<String, Component>();
		
		//factory = NUOPCFactory.eINSTANCE;
		//app = factory.createApplication();
		//app.setName("MyApp");
		
		YamlReader reader = new YamlReader(new FileReader(configFile));
		
		@SuppressWarnings("unchecked")
		List<Map> config = (List<Map>) reader.read();
		config.forEach((m) -> {
	    	
			if (m.containsKey("driver")) {
				CupidCLI.console("Found driver: " + m);
	    		handleDriver((Map<String, Object>) m.get("driver"));
	    	}
	    	else if (m.containsKey("model")) {
	    		CupidCLI.console("Found model: " + m);
	    		handleBaseModel("model", (Map<String, Object>) m.get("model"));
	    	}
	    	else if (m.containsKey("mediator")) {
	    		CupidCLI.console("Found mediator: " + m);
	    		handleBaseModel("mediator", (Map<String, Object>) m.get("mediator"));
	    	}
			
	    });
		
						
		//Job job = new GenerateNUOPCApplicationJob("Generate NUOPC app", app, proj, false);
		//job.schedule();
		//job.join();
		
		/*
		IFile res = proj.getFile(new Path("Model.F90"));
		res.create(new ByteArrayInputStream(new byte[0]), true, new NullProgressMonitor());
		
		NUOPCModel model = NUOPCModel.newBasicModel(res);  
		model.name = "MyModel";
		model.forward();
		model.applyChanges(new NullProgressMonitor());
		
		File outFile = new File("Model.F90");
		FileUtils.copyInputStreamToFile(res.getContents(), outFile);
		*/

	}

	private void handleDriver(Map<String, Object> yaml) {
		//Driver d = factory.createDriver();
		//d.setName((String) yaml.get("name"));
		//compMap.put(d.getName(), d);
		//app.getChildren().add(d);
		
		//handle children
		List<String> children = (List<String>) yaml.get("children");
		children.forEach((c) -> {
			//d.getChildren().add(compMap.get(c));
		});
	}
	
	@SuppressWarnings("restriction")
	private void handleBaseModel(String type, Map<String, Object> yaml) {
		
		//CupidCLI.console("Found component: " + type);
		CupidCLI.console("Name = " + yaml.get("name"));
		CupidCLI.console("File = " + yaml.get("file"));
		
		String name = (String) yaml.get("name");
		String filename = (String) yaml.get("file");
		
		IFile f = null;
		try {
			f = createBlankFile(root, filename, monitor);
		} catch (CoreException e) {
			CupidCLI.console(e.getMessage());
		}
		IFortranAST ast = PhotranVPG.getInstance().acquireTransientAST(f);
		
		CodeConceptInstance root = NUOPCDEF.NUOPCModelRoot.newInstance(null, ast);
		CodeConceptInstance modelToGenerate = root.addChildWithDefaults(NUOPCDEF.NUOPCModel, true);
		//modelToGenerate.put("name", name);
						
		//System.out.println("MODEL TO GENERATE**********\n"+modelToGenerate.toString()+"\n*************");
							
		manager.forward(modelToGenerate);
		
		Reindenter.reindent(ast.getRoot(), ast, Strategy.REINDENT_EACH_LINE);
		try {
			f.setContents(new ByteArrayInputStream(ast.getRoot().toString().getBytes()), IResource.NONE, monitor);
		} catch (CoreException e) {
			CupidCLI.console(e.getMessage());
		}
		
		//System.out.println("******************\n" + ast.getRoot().toString() + "********************");
		
		
		
	}
	
	static IFile createBlankFile(IContainer container, String filename, IProgressMonitor monitor) throws CoreException {
		IFile f = container.getFile(new Path(filename));
		if (f.exists()) {
			String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			IPath newPath = f.getFullPath().addFileExtension(timestamp);
			CupidCLI.console("Renaming existing file: " + f.getFullPath().toOSString() + " -> " + newPath.toOSString());
			f.move(newPath, IResource.NONE, monitor);
			f.getProject().refreshLocal(IResource.DEPTH_INFINITE, monitor);
		}
		f.create(new ByteArrayInputStream(new byte[0]), true, monitor);
		return f;
	}
	
	
	
}
