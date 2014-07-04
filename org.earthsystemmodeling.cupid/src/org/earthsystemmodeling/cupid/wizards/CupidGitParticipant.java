package org.earthsystemmodeling.cupid.wizards;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.ptp.rdt.sync.ui.AbstractSynchronizeParticipant;
import org.eclipse.ptp.rdt.sync.ui.ISynchronizeParticipantDescriptor;
import org.eclipse.remote.core.IRemoteConnection;
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
	public IRemoteConnection getConnection() {
		return conn;
	}

	@Override
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public String getSyncConfigName() {
		// TODO Auto-generated method stub
		return conn.getName();
	}

	@Override
	public boolean isConfigComplete() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void setProjectName(String arg0) {
		// TODO Auto-generated method stub
		
	}
	
//		@Override
//	public ISynchronizeService getProvider(IProject project) {
//		ISynchronizeService service = super.getProvider(project);
//		service.setLocation(location);
//		service.setRemoteConnection(conn);
//		return service;
//	}
	
	@Override
	public void createConfigurationArea(Composite parent, IRunnableContext context) {		
		//will not be called since we are
		//not configuring from the UI
	}

}
