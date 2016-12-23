package org.earthsystemmodeling.cupid.cli;

import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.earthsystemmodeling.cupid.NUOPC.Advance;
import org.earthsystemmodeling.cupid.NUOPC.Application;
import org.earthsystemmodeling.cupid.NUOPC.BaseModel;
import org.earthsystemmodeling.cupid.NUOPC.Component;
import org.earthsystemmodeling.cupid.NUOPC.Driver;
import org.earthsystemmodeling.cupid.NUOPC.Model;
import org.earthsystemmodeling.cupid.NUOPC.NUOPCFactory;
import org.earthsystemmodeling.cupid.handlers.GenerateNUOPCApplicationJob;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import com.esotericsoftware.yamlbeans.YamlReader;

public class CupidCLI implements IApplication {

	private Application app;
	private static NUOPCFactory factory;
	private Map<String, Component> compMap;
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		System.out.println("Hello world from Cupid CLI!");
		Thread.sleep(250);
		
		String[] args = (String[]) context.getArguments().get("application.args");
		if (args.length == 0) {
			System.out.println("First argument should be coupling configuration file.");
			return IApplication.EXIT_OK;
		}
		
		compMap = new HashMap<String, Component>();
		
		factory = NUOPCFactory.eINSTANCE;
		app = factory.createApplication();
		app.setName("MyApp");
		
		String inputFilename = args[0];
		System.out.println("Parsing file: " + inputFilename);
		
		YamlReader reader = new YamlReader(new FileReader(inputFilename));
		
		List<Map> config = (List<Map>) reader.read();
		config.forEach((m) -> {
	    	
			if (m.containsKey("driver")) {
	    		System.out.println("Found driver: " + m);
	    		handleDriver((Map<String, Object>) m.get("driver"));
	    	}
	    	else if (m.containsKey("model")) {
	    		System.out.println("Found model: " + m);
	    		handleBaseModel("model", (Map<String, Object>) m.get("model"));
	    	}
	    	else if (m.containsKey("mediator")) {
	    		System.out.println("Found mediator: " + m);
	    		handleBaseModel("mediator", (Map<String, Object>) m.get("mediator"));
	    	}
			
	    });
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject proj = root.getProject("CupidCLI");
		if (!proj.exists()) {
			proj.create(new NullProgressMonitor());
		}
		proj.open(new NullProgressMonitor());
				
		Job job = new GenerateNUOPCApplicationJob("Generate NUOPC app", app, proj, false);
		job.schedule();
		job.join();
		
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
		
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		System.out.println("Goodbye world from Cupid CLI!");
	}

	private void handleDriver(Map<String, Object> yaml) {
		Driver d = factory.createDriver();
		d.setName((String) yaml.get("name"));
		compMap.put(d.getName(), d);
		app.getChildren().add(d);
		
		//handle children
		List<String> children = (List<String>) yaml.get("children");
		children.forEach((c) -> {
			d.getChildren().add(compMap.get(c));
		});
	}
	
	private void handleBaseModel(String type, Map<String, Object> yaml) {
		final BaseModel m;
		if (type.equals("model")) {
			m = factory.createModel();
		}
		else if (type.equals("mediator")) {
			m = factory.createMediator();
		}
		else {
			return;
		}
		
		m.setName((String) yaml.get("name"));
		compMap.put(m.getName(), m);
		app.getChildren().add(m);
		
		//handle advance
		if (yaml.containsKey("advance")) {
			List<String> advList = (List<String>) yaml.get("advance");
			advList.forEach((s) -> {
				Advance adv = factory.createAdvance();
				adv.setPhaseLabel(s);
				m.getAdvance().add(adv);
			});
		}
		else {
			//default advance method
			m.getAdvance().add(factory.createAdvance());
		}
	}
	
}
