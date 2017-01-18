package org.earthsystemmodeling.cupid.cli;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

public class ConfigParser {

	private IFolder root;
	
	public ConfigParser(IFolder root) {
		this.root = root;
	}
	
	public void generate(File configFile) throws FileNotFoundException, YamlException {
		
		//Map compMap = new HashMap<String, Component>();
		
		//factory = NUOPCFactory.eINSTANCE;
		//app = factory.createApplication();
		//app.setName("MyApp");
		
		YamlReader reader = new YamlReader(new FileReader(configFile));
		
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
	
	private void handleBaseModel(String type, Map<String, Object> yaml) {
		
		//CupidCLI.console("Found component: " + type);
		CupidCLI.console("Name = " + yaml.get("name"));
		
		/*
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
		*/
	}
	
	
	
}
