package org.earthsystemcurator.cupid.nuopc.fsml.wizards;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.earthsystemcurator.cupid.nuopc.fsml.builder.NUOPCNature;
import org.eclipse.cdt.core.CCorePlugin;
import org.eclipse.cdt.core.CProjectNature;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.core.settings.model.extension.CConfigurationData;
import org.eclipse.cdt.managedbuilder.core.IBuilder;
import org.eclipse.cdt.managedbuilder.core.IToolChain;
import org.eclipse.cdt.managedbuilder.core.ManagedBuildManager;
import org.eclipse.cdt.managedbuilder.internal.core.Configuration;
import org.eclipse.cdt.managedbuilder.internal.core.ManagedProject;
import org.eclipse.cdt.managedbuilder.internal.core.ToolChain;
import org.eclipse.core.commands.operations.OperationStatus;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.photran.internal.core.FProjectNature;
import org.eclipse.ptp.internal.rdt.sync.cdt.ui.wizards.NewRemoteSyncProjectWizardOperation;
import org.eclipse.ptp.internal.rdt.sync.ui.SynchronizeParticipantRegistry;
import org.eclipse.ptp.rdt.sync.ui.ISynchronizeParticipant;
import org.eclipse.ptp.rdt.sync.ui.ISynchronizeParticipantDescriptor;
import org.eclipse.ptp.remote.core.IRemoteConnection;
import org.eclipse.ptp.remote.core.IRemoteConnectionManager;
import org.eclipse.ptp.remote.core.IRemoteProcess;
import org.eclipse.ptp.remote.core.IRemoteProcessBuilder;
import org.eclipse.ptp.remote.core.IRemoteServices;
import org.eclipse.ptp.remote.core.RemoteServices;
import org.eclipse.ptp.remote.core.exception.RemoteConnectionException;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.MultiPartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.IDE;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.stringtemplate.v4.ST;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.services.ec2.AmazonEC2Client;
import com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressRequest;
import com.amazonaws.services.ec2.model.CreateSecurityGroupRequest;
import com.amazonaws.services.ec2.model.CreateSecurityGroupResult;
import com.amazonaws.services.ec2.model.DescribeInstancesRequest;
import com.amazonaws.services.ec2.model.DescribeInstancesResult;
import com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest;
import com.amazonaws.services.ec2.model.DescribeSecurityGroupsResult;
import com.amazonaws.services.ec2.model.Instance;
import com.amazonaws.services.ec2.model.IpPermission;
import com.amazonaws.services.ec2.model.Reservation;
import com.amazonaws.services.ec2.model.RunInstancesRequest;
import com.amazonaws.services.ec2.model.RunInstancesResult;
import com.amazonaws.services.ec2.model.SecurityGroup;
import com.amazonaws.services.ec2.model.ShutdownBehavior;

//import org.eclipse.ptp.internal.rdt.sync.git.ui.GitParticipant;

@SuppressWarnings("restriction")
public class CupidProjectWizard extends Wizard implements INewWizard {

	private static Bundle MY_BUNDLE = FrameworkUtil.getBundle(CupidProjectWizard.class);

	private WizardNewProjectCreationPage newProjectPage;
	private CupidProjectWizardPageSelectArch selectArchPage;
	private CupidProjectWizardPageSingleModelProto singleModelProtoPage;
	private CupidProjectWizardPageCompEnv selectCompEnvPage;
	private Map<String,String> wizardData;


	/**
	 * Constructor for CupidProjectWizard.
	 */
	public CupidProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("Create Cupid Training Project");
		wizardData = new HashMap<String, String>();
	}

	@Override
	public boolean canFinish() {
		return getContainer().getCurrentPage() == selectCompEnvPage && selectCompEnvPage.isPageComplete();
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {

		selectArchPage = new CupidProjectWizardPageSelectArch(wizardData);
		addPage(selectArchPage);

		
		newProjectPage = new WizardNewProjectCreationPage("Create Cupid Training Project") {
			@Override
			public void createControl(Composite parent) {
				// TODO Auto-generated method stub
				super.createControl(parent);
				Composite control = (Composite) getControl();
				//force to use default location (local file system)
				control.getChildren()[1].setEnabled(false);
				control.getChildren()[1].setVisible(false);			
			}
		};

		newProjectPage.setTitle("Create Cupid Training Project");
		newProjectPage.setDescription("Select a name for the training project");
		newProjectPage.setInitialProjectName("CupidProject");
		addPage(newProjectPage);

		singleModelProtoPage = new CupidProjectWizardPageSingleModelProto(wizardData);
		addPage(singleModelProtoPage);

		selectCompEnvPage = new CupidProjectWizardPageCompEnv(wizardData);
		addPage(selectCompEnvPage);
	
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	@Override
	public boolean performFinish() {

		final IProject projectHandle = newProjectPage.getProjectHandle();

		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(projectHandle, monitor, wizardData);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};

		try {
			PlatformUI.getWorkbench().getProgressService().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}

	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 * @throws InvocationTargetException 
	 */
	private void doFinish(IProject projectHandle, IProgressMonitor monitor, Map<String,String> wizardData) throws CoreException {

		monitor.beginTask("Creating Cupid training project", 20);
		monitor.subTask("Creating new project");

		//make a CDT/Fortran project
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IProjectDescription projectDesc = workspace.newProjectDescription(projectHandle.getName());

		IProject project = CCorePlugin.getDefault().createCDTProject(projectDesc, projectHandle, new SubProgressMonitor(monitor,1));
		assert projectHandle.isOpen();

		ICProjectDescriptionManager mngr = CoreModel.getDefault().getProjectDescriptionManager();
		ICProjectDescription des = mngr.createProjectDescription(project, false);
		ManagedProject mProj = new ManagedProject(des);

		// tool chains
		IToolChain[] tcs = ManagedBuildManager.getRealToolChains();
		IToolChain toolchain = null;
		for (IToolChain tc : tcs) {
			//System.out.println("Toolchain: " + tc.getName() + " : " + tc.getId());
			//Linux GCC  --> cdt.managedbuild.toolchain.gnu.base
			//GCC Fortran  --> photran.managedbuild.toolchain.gnu.fortran.exe.debug
			if (tc.getId().equals("org.eclipse.ptp.rdt.managedbuild.toolchain.gnu.base")) {
				toolchain = tc;
			}
		}

		Configuration cfg = new Configuration(mProj, (ToolChain) toolchain, "org.earthsystemcurtor.cupid.ec2.config", "Cupid Amazon EC2 Configuration");

		IBuilder bld = cfg.getEditableBuilder();
		assert bld != null;
		assert bld.isInternalBuilder() == false;

		bld.setManagedBuildOn(false);

		CConfigurationData data = cfg.getConfigurationData();
		assert data != null;
		des.createConfiguration(ManagedBuildManager.CFG_DATA_PROVIDER_ID, data);

		CProjectNature.addCNature(project, new SubProgressMonitor(monitor, 1));
		FProjectNature.addFNature(project, new SubProgressMonitor(monitor, 1));
		NUOPCNature.addNUOPCNature(project, new SubProgressMonitor(monitor, 1));

		// Persist the project description
		mngr.setProjectDescription(project, des);
		monitor.worked(1);

		
		IRemoteConnection remoteConn = null;
		if (wizardData.get(CupidProjectWizardPageCompEnv.WD_COMP_ENV).equals(CupidProjectWizardPageCompEnv.WD_COMP_ENV__CLOUD)) {
			
			// make the amazon ec2 compute environment
			String ec2host;
			try {
				ec2host = createEC2Environment(new SubProgressMonitor(monitor, 2));
			} catch (IOException e4) {
				throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "Cannot create EC2 environment", e4));
			}

			// get a remote connection to ec2
			try {
				remoteConn = createRemoteConnection(ec2host, new SubProgressMonitor(monitor, 2));
			} catch (RemoteConnectionException e3) {
				throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "Cannot create remote connection", e3));
			}
		
		}
		
		if (wizardData.get(CupidProjectWizardPageCompEnv.WD_COMP_ENV).equals(CupidProjectWizardPageCompEnv.WD_COMP_ENV__REMOTE)) {
			remoteConn = findRemoteConnection(wizardData.get(CupidProjectWizardPageCompEnv.WD_EXIST_CONN), new SubProgressMonitor(monitor, 1));
		}

		if (wizardData.get(CupidProjectWizardPageCompEnv.WD_COMP_ENV).equals(CupidProjectWizardPageCompEnv.WD_COMP_ENV__CLOUD) ||
			wizardData.get(CupidProjectWizardPageCompEnv.WD_COMP_ENV).equals(CupidProjectWizardPageCompEnv.WD_COMP_ENV__REMOTE)	) {
			
			monitor.subTask("Connecting to the computational environment...");
			boolean connected = false;
			int timeout = 0;
	
			while(!connected && timeout < 20) {
				try {
					monitor.worked(1);
					Thread.sleep(5000);
					remoteConn.open(new NullProgressMonitor());
					connected = true;
				}
				catch (RemoteConnectionException rce) {
					//System.out.println(rce.getCause());
				} 
				catch (InterruptedException e) {
					//e.printStackTrace();
				}
			}

			if (!remoteConn.isOpen()) {
				throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "Timeout connecting to computational environment", null));
			}

			/*
			
			IRemoteServices remoteServices = RemoteServices.getRemoteServices("org.eclipse.ptp.remote.RemoteTools", new SubProgressMonitor(monitor,1));
	
			try {
				IRemoteProcessBuilder rpb = remoteServices.getProcessBuilder(remoteConn, "/bin/ls", "-la");
				IRemoteProcess rp = rpb.start();
				while (!rp.isCompleted()) {
					rp.waitFor();
				}
	
				System.out.println("Process stdout:");
				BufferedReader in = new BufferedReader(new InputStreamReader(rp.getInputStream()));
				String inputLine;
				while ((inputLine = in.readLine()) != null)
					System.out.println(inputLine);
				in.close();
	
	
			} catch (IOException | InterruptedException e) {
				throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "Error executing command on remote environment", e));
			}
			*/
			
			// make synchronized project
			ISynchronizeParticipant syncParticipant = null;
			ISynchronizeParticipantDescriptor syncDescriptor = null;
	
			ISynchronizeParticipantDescriptor[] providers = SynchronizeParticipantRegistry.getDescriptors();
			for (ISynchronizeParticipantDescriptor p : providers) {
				//System.out.println("ISynchronizeParticipantDescriptor ==> " + p.getName() + " : " + p.getId() + " : " + p.getServiceId());
				if (p.getId().equals("org.eclipse.ptp.rdt.sync.git.ui.gitParticipant")) {
					syncDescriptor = p;
					//syncParticipant = p.getParticipant();
					//System.out.println("syncParticipant.isConfigComplete(): " + syncParticipant.isConfigComplete());
					//System.out.println("syncParticipant.getErrorMessage(): " + syncParticipant.getErrorMessage());
					//syncParticipant.
					//break;
				}
			}

			if (syncDescriptor == null) {
				throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "Git synchronize descriptor not present", null));
			}

			syncParticipant = new CupidGitParticipant(syncDescriptor, remoteConn, "/home/sgeadmin/SingleModelProto");


			//IManagedBuildInfo buildInfo = ManagedBuildManager.getBuildInfo(projectHandle);
			//IConfiguration configs[] = buildInfo.getManagedProject().getConfigurations();
			//for (IConfiguration c : configs) {
			//	System.out.println("\tIConfiguration ==> " + c.getName());
			//}
	
			Set<String> localToolChains = new HashSet<String>();
			localToolChains.add(toolchain.getName());
	
			Set<String> remoteToolChains = new HashSet<String>();
			remoteToolChains.add(toolchain.getName());
	
			monitor.subTask("Setting up project synchronization");
	
			NewRemoteSyncProjectWizardOperation.run(project, 
					syncParticipant, 
					null,
					localToolChains,
					remoteToolChains, 
					new SubProgressMonitor(monitor,1));
		
		}

		monitor.subTask("Adding project files");
		boolean skipFiles = false;
		if (!skipFiles) {
			//String templateDir = "templates/" + page.getClass().getSimpleName().replaceFirst("CupidProjectWizardPage", "");
			String templateDir = "templates/" + wizardData.get("templateDir");
			
			URL bundleURL = FileLocator.find(MY_BUNDLE, new Path(templateDir), null);
			URL fileURL = null;
			try {
				fileURL = FileLocator.toFileURL(bundleURL);
			} catch (IOException e2) {
				throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "Error getting location of file: " + templateDir, e2));
			}

			final List<IFile> filesToOpen = new ArrayList<IFile>();

			Path templatePath = new Path(fileURL.getPath());
			File templateDirFile = templatePath.toFile();

			for (File f : templateDirFile.listFiles()) {

				try {
					String line;
					StringBuffer sb = new StringBuffer();
					BufferedReader br = new BufferedReader(new FileReader(f));

					while ((line = br.readLine()) != null) {
						sb.append(line + "\n");
					}
					br.close();

					//is this a template?
					String contents = null;
					String filename = null;
					if (f.getName().endsWith(".st")) {

						ST templateST = new ST(sb.toString());
						templateST.add("p", wizardData);
						contents = templateST.render();

						//get filename
						/*
					String methodName = "get" + f.getName().substring(0, 1).toUpperCase() + f.getName().substring(1, f.getName().indexOf(".")) + "Name";

					try {						
						Method m = page.getClass().getMethod(methodName, (Class<?>[]) null);
						filename = (String) m.invoke(page, (Object[]) null);
						filename += f.getName().substring(f.getName().indexOf("."), f.getName().lastIndexOf(".")); // get extension, not including last .st					
					} catch (NoSuchMethodException e) {
						// use template filename without the final .st
						filename = f.getName().substring(0, f.getName().lastIndexOf("."));					
					}
						 */

						String key = f.getName().substring(0, f.getName().indexOf("."));
						//CupidProjectWizardPageSingleModelProto pp = (CupidProjectWizardPageSingleModelProto) page;
						//filename = pp.getWizardData().get(key);
						filename = wizardData.get(key);
						if (filename != null) {
							filename += f.getName().substring(f.getName().indexOf("."), f.getName().lastIndexOf("."));
						}
						else {
							filename = f.getName().substring(0, f.getName().lastIndexOf("."));	
						}

					}
					else {
						contents = sb.toString();
						filename = f.getName();
					}

					IFile projectFile = projectHandle.getFile(filename);
					InputStream stream = openContentStream(contents);
					projectFile.create(stream, true, new SubProgressMonitor(monitor, 1));
					filesToOpen.add(projectFile);
					stream.close();

				} catch (IOException | SecurityException | IllegalArgumentException e) {				
					throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "Error populating project with files: " + templateDir, e));				
				}

			}
			monitor.worked(1);

			monitor.subTask("Opening project files in editor");
			if (filesToOpen.size() > 0) {
				getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						IWorkbenchPage page =
								PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
						try {
							IDE.openEditors(page, filesToOpen.toArray(new IFile[] {}));
						} catch (MultiPartInitException e) {}
					}
				});
			}
			monitor.worked(1);
		}

		monitor.done();

	}

	private IRemoteConnection createRemoteConnection(String host, IProgressMonitor monitor) throws RemoteConnectionException {

		monitor.beginTask("Creating remote connection", 2);

		IRemoteServices remoteServices = RemoteServices.getRemoteServices("org.eclipse.ptp.remote.RemoteTools", monitor);
		monitor.worked(1);

		IRemoteConnectionManager connManager = remoteServices.getConnectionManager();
		IRemoteConnection remoteConn = null;

		//System.out.println("Can create connections? " + remoteServices.canCreateConnections());
		//for (IRemoteConnection rc : connManager.getConnections()) {
		//	System.out.println("\n==> Remote connection:  " + rc.getName() + " : " + rc.getAddress());
		//	for (Entry<String, String> att : rc.getAttributes().entrySet()) {
		//		System.out.println("\t" + att.getKey() + " --> " + att.getValue());
		//	}
		//}

		if (remoteServices.canCreateConnections()) {
			remoteConn = connManager.newConnection("Cupid Environment (Amazon EC2 - " + host + ")");
			remoteConn.setAddress(host);
			remoteConn.setUsername("root");
			remoteConn.setAttribute("org.eclipse.ptp.remotetools.environment.generichost.key-path", "C:\\Users\\Rocky\\Documents\\ssh\\nesiikey.rsa");
			remoteConn.setAttribute("org.eclipse.ptp.remotetools.environment.generichost.is-passwd-auth", "false");
			remoteConn.setAttribute("org.earthsystemcurator.cupid.ready", "true");
		}
		monitor.worked(1);
		monitor.done();
		return remoteConn;
	}
	
	
	private IRemoteConnection findRemoteConnection(String name, IProgressMonitor monitor) {

		monitor.beginTask("Retrieving remote connection", 2);

		IRemoteServices remoteServices = RemoteServices.getRemoteServices("org.eclipse.ptp.remote.RemoteTools", monitor);
		monitor.worked(1);

		IRemoteConnectionManager connManager = remoteServices.getConnectionManager();
		IRemoteConnection remoteConn = connManager.getConnection(name);
		
		monitor.worked(1);
		monitor.done();
		return remoteConn;
	}


	private String createEC2Environment(IProgressMonitor monitor) throws IOException {

		monitor.beginTask("Creating Amazon EC2 environment", 10);

		AWSCredentials credentials = null;
		credentials = new PropertiesCredentials(CupidProjectWizard.class.getResourceAsStream("AwsCredentials.properties"));

		AmazonEC2Client amazonEC2Client = new AmazonEC2Client(credentials);
		amazonEC2Client.setEndpoint("ec2.us-east-1.amazonaws.com");

		//does security group exist?
		monitor.subTask("Verifying EC2 security group");
		DescribeSecurityGroupsRequest dsgreq = new DescribeSecurityGroupsRequest();
		dsgreq.withGroupNames("CupidSecurityGroup");

		boolean createSecurityGroup = true;
		DescribeSecurityGroupsResult dsgres = amazonEC2Client.describeSecurityGroups(dsgreq);
		for (SecurityGroup sg : dsgres.getSecurityGroups()) {
			if (sg.getGroupName().equals("CupidSecurityGroup")) {
				createSecurityGroup = false;
			}
		}

		monitor.worked(1);

		if (createSecurityGroup) {

			monitor.subTask("Adding EC2 security group");

			//does not exist, so create it
			CreateSecurityGroupRequest createSecurityGroupRequest = new CreateSecurityGroupRequest();
			createSecurityGroupRequest.withGroupName("CupidSecurityGroup")
			.withDescription("Cupid Security Group used with Eclipse IDE");
			CreateSecurityGroupResult createSecurityGroupResult = 
					amazonEC2Client.createSecurityGroup(createSecurityGroupRequest);

			IpPermission ipPermission = new IpPermission();
			ipPermission.withIpRanges("0.0.0.0/0")
			.withIpProtocol("tcp")
			.withFromPort(22)
			.withToPort(22);

			AuthorizeSecurityGroupIngressRequest authorizeSecurityGroupIngressRequest =
					new AuthorizeSecurityGroupIngressRequest();

			authorizeSecurityGroupIngressRequest.withGroupName("CupidSecurityGroup")
			.withIpPermissions(ipPermission);
			amazonEC2Client.authorizeSecurityGroupIngress(authorizeSecurityGroupIngressRequest);

		}

		//create key pair
		/*
		DeleteKeyPairRequest deleteKeyPairRequest = new DeleteKeyPairRequest();
		deleteKeyPairRequest.withKeyName("CupidKeyPair");
		amazonEC2Client.deleteKeyPair(deleteKeyPairRequest);

		CreateKeyPairRequest createKeyPairRequest = new CreateKeyPairRequest();
		createKeyPairRequest.withKeyName("CupidKeyPair");
		CreateKeyPairResult createKeyPairResult = amazonEC2Client.createKeyPair(createKeyPairRequest);

		KeyPair keyPair = new KeyPair();
    	keyPair = createKeyPairResult.getKeyPair();
		String privateKey = keyPair.getKeyMaterial();
		 */

		monitor.subTask("Starting computational environment...");
		RunInstancesRequest runInstancesRequest = new RunInstancesRequest();

		runInstancesRequest.withImageId("ami-018bd068")
		.withInstanceType("t1.micro")
		.withMinCount(1)
		.withMaxCount(1)
		.withKeyName("nesiikey")
		.withInstanceInitiatedShutdownBehavior(ShutdownBehavior.Terminate)
		.withSecurityGroups("CupidSecurityGroup");


		RunInstancesResult runInstancesResult = amazonEC2Client.runInstances(runInstancesRequest);		

		Reservation res = runInstancesResult.getReservation();

		List<Instance> instances = res.getInstances();
		for (Instance i : instances) {
			//System.out.println("\tInstance: " + i.getInstanceId() + " : " + i.getState().getName() + " : " + i.getPublicDnsName());
			String curState = "";

			//wait for instance to be in running state
			monitor.subTask("Waiting on computational environment to start up...");
			int count = 0;
			while (!curState.equals("running") && count < 20) {

				try {
					Thread.sleep(5000);
					monitor.worked(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				DescribeInstancesRequest direq = new DescribeInstancesRequest();
				direq.withInstanceIds(i.getInstanceId());
				DescribeInstancesResult dires = amazonEC2Client.describeInstances(direq);
				i = dires.getReservations().get(0).getInstances().get(0);
				curState = i.getState().getName();
				count++;
			}
			//assuming one instance for now
			monitor.done();
			return i.getPublicDnsName();


		}

		monitor.done();
		return null;

	}



	/**
	 * We will initialize file contents with a sample text.
	 */
	private InputStream openContentStream(String contents) {
		return new ByteArrayInputStream(contents.getBytes());
	}



	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {

	}

	public static void updateFont(Control c, int style) {
		FontData fontData = c.getFont().getFontData()[0];
		Font font = new Font(Display.getDefault(), new FontData(fontData.getName(), fontData.getHeight(), style));
		c.setFont(font);
	}

}