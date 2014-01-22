package org.earthsystemcurator.cupid.nuopc.fsml.wizards;

import org.earthsystemcurator.cupid.nuopc.fsml.core.CupidActivator;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.ptp.rdt.sync.core.services.ISynchronizeService;
import org.eclipse.ptp.rdt.sync.ui.AbstractSynchronizeParticipant;
import org.eclipse.ptp.rdt.sync.ui.ISynchronizeParticipantDescriptor;
import org.eclipse.ptp.remote.core.IRemoteConnection;
import org.eclipse.swt.widgets.Composite;

@SuppressWarnings("restriction")
public class CupidGitParticipant extends AbstractSynchronizeParticipant {

	private IRemoteConnection conn;
	private String location;
	
	public CupidGitParticipant(ISynchronizeParticipantDescriptor descriptor, IRemoteConnection conn, String location) {
		super(descriptor);
		this.conn = conn;
		this.location = location;
		CupidActivator.log("Exiting CupidGitParticipant constructor");
	}
	
	@Override
	public ISynchronizeService getProvider(IProject project) {
		ISynchronizeService service = super.getProvider(project);
		service.setLocation(location);
		service.setRemoteConnection(conn);
		return service;
	}

	@Override
	public String getSyncConfigName() {
		return conn.getName();
	}

	@Override
	public void createConfigurationArea(Composite parent, IRunnableContext context) {		
		//will not be called since we are
		//not configuring from the UI
	}

	@Override
	public String getErrorMessage() {
		return null;
	}	

	@Override
	public boolean isConfigComplete() {
		return true;
	}

	@Override
	public void setProjectName(String projectName) {
		
	}

}
