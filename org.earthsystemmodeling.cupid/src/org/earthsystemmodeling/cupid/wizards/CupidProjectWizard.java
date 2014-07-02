package org.earthsystemmodeling.cupid.wizards;

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

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.preferences.CupidPreferencePage;
import org.eclipse.cdt.core.CCorePlugin;
import org.eclipse.cdt.core.CProjectNature;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.settings.model.ICProjectDescription;
import org.eclipse.cdt.core.settings.model.ICProjectDescriptionManager;
import org.eclipse.cdt.core.settings.model.extension.CConfigurationData;
import org.eclipse.cdt.make.core.IMakeCommonBuildInfo;
import org.eclipse.cdt.make.core.IMakeTarget;
import org.eclipse.cdt.make.core.IMakeTargetManager;
import org.eclipse.cdt.make.core.MakeCorePlugin;
import org.eclipse.cdt.managedbuilder.core.IBuilder;
import org.eclipse.cdt.managedbuilder.core.IToolChain;
import org.eclipse.cdt.managedbuilder.core.ManagedBuildManager;
import org.eclipse.cdt.managedbuilder.internal.core.Configuration;
import org.eclipse.cdt.managedbuilder.internal.core.ManagedProject;
import org.eclipse.cdt.managedbuilder.internal.core.ToolChain;
import org.eclipse.core.commands.operations.OperationStatus;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.photran.internal.core.FProjectNature;
import org.eclipse.ptp.internal.rdt.sync.cdt.ui.wizards.NewRemoteSyncProjectWizardOperation;
import org.eclipse.ptp.internal.rdt.sync.ui.SynchronizeParticipantRegistry;
import org.eclipse.ptp.rdt.sync.core.SyncFlag;
import org.eclipse.ptp.rdt.sync.core.SyncManager;
import org.eclipse.ptp.rdt.sync.ui.ISynchronizeParticipant;
import org.eclipse.ptp.rdt.sync.ui.ISynchronizeParticipantDescriptor;
import org.eclipse.ptp.remotetools.exception.RemoteConnectionException;
//import org.eclipse.remote.core.IRemoteConnection;
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
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.MultiPartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;
import org.jdom.Element;
import org.jdom.filter.ElementFilter;
import org.jdom.input.DOMBuilder;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.stringtemplate.v4.ST;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.cloudwatch.AmazonCloudWatchClient;
import com.amazonaws.services.cloudwatch.model.ComparisonOperator;
import com.amazonaws.services.cloudwatch.model.Dimension;
import com.amazonaws.services.cloudwatch.model.PutMetricAlarmRequest;
import com.amazonaws.services.cloudwatch.model.StandardUnit;
import com.amazonaws.services.cloudwatch.model.Statistic;
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
public class CupidProjectWizard extends Wizard implements INewWizard, IExecutableExtension {

	private static Bundle MY_BUNDLE = FrameworkUtil.getBundle(CupidProjectWizard.class);

	private WizardNewProjectCreationPage newProjectPage;
	private CupidProjectWizardPageSelectArch selectArchPage;
	private CupidProjectWizardPageSingleModelProto singleModelProtoPage;
	private CupidProjectWizardPageCompEnv selectCompEnvPage;
	private Map<String,String> wizardData;
	private org.jdom.Document configXML;
	
	private IConfigurationElement config;
	private Element selectedElem;


	/**
	 * Constructor for CupidProjectWizard.
	 */
	public CupidProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("Create Cupid Training Project");
		wizardData = new HashMap<String, String>();
		parseConfigXML();
	}
	
	private void parseConfigXML() {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			InputStream is = FileLocator.openStream(MY_BUNDLE, new Path("templates/training_configs.xml"), false);
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(is);
			
			DOMBuilder domBuilder = new DOMBuilder();
			configXML = domBuilder.build(doc);
						
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}
	

	@Override
	public boolean canFinish() {
		return getContainer().getCurrentPage() == selectCompEnvPage && selectCompEnvPage.isPageComplete();
	}

	/**
	 * Adding the page to the wizard.
	 */
	@Override
	public void addPages() {

		selectArchPage = new CupidProjectWizardPageSelectArch(configXML, wizardData);
		addPage(selectArchPage);

		
		newProjectPage = new WizardNewProjectCreationPage("Create Cupid Training Project") {
			@Override
			public void createControl(Composite parent) {
				
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
		//addPage(singleModelProtoPage);

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
					e.printStackTrace();
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
			MessageDialog.openError(getShell(), "Error", realException.getMessage() + "\n\n[" + e.getMessage() + "]");
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

		CupidActivator.log("Creating project: " + projectHandle.getName());
		
		monitor.beginTask("Creating Cupid training project", 25);
		monitor.subTask("Creating new project");
		
		final String scenarioid = wizardData.get("scenarioid");
		@SuppressWarnings("unchecked")
		List<Element> elemList = configXML.getRootElement().getContent(new ElementFilter() {
			@Override
			public boolean matches(Object e) {
				return super.matches(e) && ((Element) e).getAttributeValue("id").equals(scenarioid);
			}
		});
		selectedElem = elemList.get(0);

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
			CupidActivator.log("Found toolchain: " + tc.getName());
			if (tc.getId().equals("org.eclipse.ptp.rdt.managedbuild.toolchain.gnu.base")) {
				toolchain = tc;
				CupidActivator.log("Using toolchain: " + toolchain.getName());
			}
		}
		assert toolchain != null;

		Configuration cfg = new Configuration(mProj, (ToolChain) toolchain, "org.earthsystemcurtor.cupid.ec2.config", "Cupid Configuration");

		IBuilder bld = cfg.getEditableBuilder();
		assert bld != null;
		assert bld.isInternalBuilder() == false;

		bld.setManagedBuildOn(false);

		CConfigurationData data = cfg.getConfigurationData();
		assert data != null;
		des.createConfiguration(ManagedBuildManager.CFG_DATA_PROVIDER_ID, data);

		CProjectNature.addCNature(project, new SubProgressMonitor(monitor, 1));
		FProjectNature.addFNature(project, new SubProgressMonitor(monitor, 1));
		//NUOPCNature.addNUOPCNature(project, new SubProgressMonitor(monitor, 1));

		// Persist the project description
		mngr.setProjectDescription(project, des);
		monitor.worked(1);

		
		IRemoteConnection remoteConn = null;
		if (wizardData.get(CupidProjectWizardPageCompEnv.WD_COMP_ENV).equals(CupidProjectWizardPageCompEnv.WD_COMP_ENV__CLOUD)) {
			
			// make the amazon ec2 compute environment
			List<String> ec2hosts;
			try {
				ec2hosts = createEC2Environment(project, new SubProgressMonitor(monitor, 2));
			} catch (IOException e4) {
				throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "Cannot create EC2 environment", e4));
			}
			
			CupidActivator.log("EC2 hostname:" + ec2hosts.get(0));

			// get a remote connection to ec2
			try {
				//assume only a single instance for now
				remoteConn = createRemoteConnection(ec2hosts.get(0), project.getName(), new SubProgressMonitor(monitor, 2));
			} catch (RemoteConnectionException e3) {
				throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "Cannot create remote connection", e3));
			}
			
			CupidActivator.log("Created remote connection");
		
		}
		
		if (wizardData.get(CupidProjectWizardPageCompEnv.WD_COMP_ENV).equals(CupidProjectWizardPageCompEnv.WD_COMP_ENV__REMOTE)) {
			remoteConn = findRemoteConnection(wizardData.get(CupidProjectWizardPageCompEnv.WD_EXIST_CONN), new SubProgressMonitor(monitor, 1));
		}

		if (wizardData.get(CupidProjectWizardPageCompEnv.WD_COMP_ENV).equals(CupidProjectWizardPageCompEnv.WD_COMP_ENV__CLOUD) ||
			wizardData.get(CupidProjectWizardPageCompEnv.WD_COMP_ENV).equals(CupidProjectWizardPageCompEnv.WD_COMP_ENV__REMOTE)	) {
			
			CupidActivator.log("Connecting to the computational environment");
			monitor.subTask("Connecting to the computational environment...");
			boolean connected = false;
			int timeout = 0;
	
			while(!connected && timeout < 20) {
				try {
					monitor.worked(1);
					Thread.sleep(5000);
					CupidActivator.log("Attempting to open connection");
					remoteConn.open(new NullProgressMonitor());
					connected = true;
					CupidActivator.log("Connection open");
				}
				catch (RemoteConnectionException rce) {
					if (rce.getMessage().contains("reject HostKey")) {
						CupidActivator.log("User rejected SSH host key", rce);
						throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "Cannot connect to computational environment due to rejected host key", null));
					}
					//rce.printStackTrace();
					//System.out.println(rce.getCause());
				} 
				catch (InterruptedException e) {
					CupidActivator.log("InterruptedException", e);
					//e.printStackTrace();
				}
			}

			if (!remoteConn.isOpen()) {
				CupidActivator.log("Remote connection not open");
				throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "Timeout connecting to computational environment", null));
			}

			
			//executeCommandOnRemote(remoteConn, new SubProgressMonitor(monitor,1), "echo \"export ESMFMKFILE=/home/sgeadmin/esmf.mk\" >> .profile");
			
			//executeCommandOnRemote(remoteConn, new SubProgressMonitor(monitor,1), 
			//		"echo \"export ESMFMKFILE=/home/sgeadmin/esmf/DEFAULTINSTALLDIR/lib/libO/Linux.gfortran.64.openmpi.default/esmf.mk\" >> /root/.profile");
			
			
			CupidActivator.log("Creating synchronized project");
			monitor.subTask("Creating synchronized project...");
			
			// make synchronized project
			ISynchronizeParticipant syncParticipant = null;
			ISynchronizeParticipantDescriptor syncDescriptor = null;
	
			ISynchronizeParticipantDescriptor[] providers = SynchronizeParticipantRegistry.getDescriptors();
			for (ISynchronizeParticipantDescriptor p : providers) {
				//System.out.println("ISynchronizeParticipantDescriptor ==> " + p.getName() + " : " + p.getId() + " : " + p.getServiceId());
				if (p.getId().equals("org.eclipse.ptp.rdt.sync.git.ui.gitParticipant")) {
					CupidActivator.log("Found sync descriptor: org.eclipse.ptp.rdt.sync.git.ui.gitParticipant");
					syncDescriptor = p;
					//syncParticipant = p.getParticipant();
					//System.out.println("syncParticipant.isConfigComplete(): " + syncParticipant.isConfigComplete());
					//System.out.println("syncParticipant.getErrorMessage(): " + syncParticipant.getErrorMessage());
					//syncParticipant.
					break;
				}
			}

			if (syncDescriptor == null) {
				CupidActivator.log("syncDescriptor is null");
				throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "Git synchronize descriptor not present", null));
			}
	
			String remoteDir = selectedElem.getChildTextNormalize("remotedir");
			if (remoteDir == null || remoteDir.length() < 1) {
				remoteDir = "/home/sgeadmin/" + project.getName();
			}
			syncParticipant = new CupidGitParticipant(syncDescriptor, remoteConn, remoteDir);
			CupidActivator.log("Created CupidGitParticipant");

			//IManagedBuildInfo buildInfo = ManagedBuildManager.getBuildInfo(projectHandle);
			//IConfiguration configs[] = buildInfo.getManagedProject().getConfigurations();
			//for (IConfiguration c : configs) {
			//	System.out.println("\tIConfiguration ==> " + c.getName());
			//}
	
			Set<String> localToolChains = new HashSet<String>();
			Set<String> remoteToolChains = new HashSet<String>();
			
			if (toolchain != null) {
				CupidActivator.log("Adding toolchain: " + toolchain);
				localToolChains.add(toolchain.getName());
				remoteToolChains.add(toolchain.getName());
			}
		
	
			monitor.subTask("Setting up project synchronization...");
	
			CupidActivator.log("Setting up project synchronization");
			NewRemoteSyncProjectWizardOperation.run(project, 
					syncParticipant, 
					null,
					localToolChains,
					remoteToolChains, 
					new SubProgressMonitor(monitor,1));
			
			//force a sync
			CupidActivator.log("Forcing initial synchronization");
			try {
				SyncManager.syncBlocking(null, project, SyncFlag.FORCE, new SubProgressMonitor(monitor, 2));
			}
			catch (CoreException ce) {
				CupidActivator.log(Status.ERROR, "Forcing initial synchronization", ce);
				//should still be able to continue
			}
		
		}

		CupidActivator.log("Adding project files");
		monitor.subTask("Adding project files");
				
		String templateDir = "templates/" + wizardData.get("templateDir");
		
		final List<IFile> filesToOpen = new ArrayList<IFile>();
		
		URL bundleURL = FileLocator.find(MY_BUNDLE, new Path(templateDir), null);
				
		if (bundleURL != null) {
			
			URL fileURL = null;
			try {
				fileURL = FileLocator.toFileURL(bundleURL);
			} catch (IOException e2) {
				throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "Error getting location of file: " + templateDir, e2));
			}

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
			
		}	
		
		monitor.worked(1);
			
		CupidActivator.log("Adding make targets");
		monitor.subTask("Addding make targets");
		
		if (selectedElem.getChild("make") != null) {
			for (Object mt : selectedElem.getChild("make").getChildren("target")) {
				Element makeTarget = (Element) mt;
				String dir = makeTarget.getAttributeValue("dir");
				IContainer folder;
				if (dir != null) {
					folder = project.getFolder(dir);
				}
				else {
					folder = project; //use the root
				}
				addMakeTarget(project, folder, makeTarget.getAttributeValue("name"), makeTarget.getTextNormalize());
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
		
		getShell().getDisplay().asyncExec(new Runnable() {
			public void run() {
				BasicNewProjectResourceWizard.updatePerspective(config);
			}
		});
		
		//BasicNewProjectResourceWizard.updatePerspective(config);

		monitor.done();

	}

	private IRemoteConnection createRemoteConnection(String host, String name, IProgressMonitor monitor) throws RemoteConnectionException, CoreException {

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
			
			//ssh key
			URL keyURL = FileLocator.find(MY_BUNDLE, new Path("ssh/nesiikey.rsa"), null);
			String keyFile = null;
			try {
				keyFile = FileLocator.toFileURL(keyURL).getFile();
				CupidActivator.log("Using SSH key: " + keyFile);
			} catch (IOException e) {
				throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "Cannot find SSH key file", e));
			}
			
			remoteConn = connManager.newConnection("Cupid Environment (" + name + " - " + host + ")");
			remoteConn.setAddress(host);
			remoteConn.setUsername("sgeadmin");
			//remoteConn.setAttribute("org.eclipse.ptp.remotetools.environment.generichost.key-path", "C:\\Users\\Rocky\\Documents\\ssh\\nesiikey.rsa");
			remoteConn.setAttribute("org.eclipse.ptp.remotetools.environment.generichost.key-path", keyFile);
			remoteConn.setAttribute("org.eclipse.ptp.remotetools.environment.generichost.is-passwd-auth", "false");
			remoteConn.setAttribute("org.earthsystemmodeling.cupid.ready", "true");
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


	private List<String> createEC2Environment(IProject project, IProgressMonitor monitor) throws IOException, CoreException {

		monitor.beginTask("Creating Amazon EC2 environment", 10);

		AWSCredentials credentials = null;
		//credentials = new PropertiesCredentials(CupidProjectWizard.class.getResourceAsStream("AwsCredentials.properties"));
		
		IPreferenceStore prefStore = CupidActivator.getDefault().getPreferenceStore();
		String accessKey = prefStore.getString(CupidPreferencePage.CUPID_AWS_ACCESS_KEY);
		String secretKey = prefStore.getString(CupidPreferencePage.CUPID_AWS_SECRET_KEY);
		
		if (accessKey == null || accessKey.length() < 1 || secretKey == null || secretKey.length() < 1) {
			throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "Amazon AWS credentials have not been set up.  To add credentials, cancel the wizard, then select Window-->Preferences-->Cupid Preferences from the Eclipse menu bar. After entering the credentials, restart the wizard.", null));
		}
		credentials = new BasicAWSCredentials(accessKey, secretKey);
		
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
		monitor.subTask("Creating SSH key pair");
		
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
		
		//write key pair
		/*
		monitor.subTask("Writing key pair to local file");
		IFile keyFile = project.getFile(".cupidkey.rsa");
		InputStream stream = openContentStream(privateKey);
		keyFile.create(stream, true, new SubProgressMonitor(monitor, 1));
		*/
		
		monitor.subTask("Starting computational environment...");
		RunInstancesRequest runInstancesRequest = new RunInstancesRequest();

		//get image id from XML
		String amiid = null;
		Element compEnv = selectedElem.getChild("compenv");
		if (compEnv != null) {
			amiid = compEnv.getChildTextNormalize("amiid");
		}
		if (amiid == null || amiid.length() < 1) {
			throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "No machine image identifier found in training scenario configuration XML.", null));
		}
		
	    runInstancesRequest.withImageId(amiid)  //cupid-modele-image
			.withInstanceType("t1.micro")
			.withMinCount(1)
			.withMaxCount(1)
			.withKeyName("nesiikey")
			.withInstanceInitiatedShutdownBehavior(ShutdownBehavior.Terminate)
			.withSecurityGroups("CupidSecurityGroup");
		


		RunInstancesResult runInstancesResult = amazonEC2Client.runInstances(runInstancesRequest);		

		Reservation res = runInstancesResult.getReservation();

		List<String> hostNames = new ArrayList<String>();
		List<Dimension> dimensions = new ArrayList<Dimension>();
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
			
			hostNames.add(i.getPublicDnsName());
			dimensions.add(new Dimension().withName("InstanceId").withValue(i.getInstanceId()));
		}
		
		//add monitoring to terminate idle instances
		AmazonCloudWatchClient cloudWatchClient = new AmazonCloudWatchClient(credentials);
		cloudWatchClient.setEndpoint("monitoring.us-east-1.amazonaws.com");
						
		PutMetricAlarmRequest alarmRequest = new PutMetricAlarmRequest();
		alarmRequest.withNamespace("AWS/EC2")
					.withMetricName("CPUUtilization")
					.withDimensions(dimensions)
					.withPeriod(300)
					.withStatistic(Statistic.Average)
					.withAlarmName("terminate-idle-" + dimensions.get(0).getValue())
					.withComparisonOperator(ComparisonOperator.LessThanThreshold)
					.withThreshold(10.0)
					.withEvaluationPeriods(10)
					.withUnit(StandardUnit.Percent)
					.withAlarmActions("arn:aws:automate:us-east-1:ec2:terminate");
		
		cloudWatchClient.putMetricAlarm(alarmRequest);
		monitor.worked(1);		

		monitor.done();
		return hostNames;

	}

	private void executeCommandOnRemote(IRemoteConnection remoteConn, IProgressMonitor monitor, String... cmd) throws CoreException {
		
		monitor.beginTask("Setting up computational environment", 3);
		IRemoteServices remoteServices = RemoteServices.getRemoteServices("org.eclipse.ptp.remote.RemoteTools", new SubProgressMonitor(monitor,1));

		try {
			IRemoteProcessBuilder rpb = remoteServices.getProcessBuilder(remoteConn, cmd);
			IRemoteProcess rp = rpb.start();
			monitor.worked(1);
			
			while (!rp.isCompleted()) {
				rp.waitFor();
			}
			//monitor.worked(1);

			//OutputStream os = rp.getOutputStream();
			//os.write("ls".getBytes());
			//BufferedWriter bw = new BufferedWriter(os);
			
			System.out.println("Process stdout:");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(rp.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null)
				System.out.println(inputLine);
			in.close();
			
			System.out.println("\nProcess stderr:");
			in = new BufferedReader(new InputStreamReader(rp.getErrorStream()));
			while ((inputLine = in.readLine()) != null)
				System.out.println(inputLine);
			in.close();
			
			//os.close();
			
			rp.destroy();
			
		} catch (InterruptedException | IOException e) {
			throw new CoreException(new OperationStatus(IStatus.ERROR, MY_BUNDLE.getSymbolicName(), 0, "Error executing command on remote environment", e));
		}
		
		monitor.done();
		
	}
	
	private void addMakeTarget(IProject project, IContainer folder, String name, String makeTarget) throws CoreException {
	
		IMakeTargetManager manager = MakeCorePlugin.getDefault().getTargetManager();
		String[] ids = manager.getTargetBuilders(project);	
		
		IMakeTarget target; 
		
		target = manager.createTarget(project, name, ids[0]);
		target.setStopOnError(false);
		target.setRunAllBuilders(false);
		target.setUseDefaultBuildCmd(true);
		target.setBuildAttribute(IMakeCommonBuildInfo.BUILD_COMMAND, "make");
		//target.setBuildAttribute(IMakeTarget.BUILD_LOCATION, "/build/location");
		//target.setBuildAttribute(IMakeTarget.BUILD_ARGUMENTS, "ESMFMKFILE=/home/sgeadmin/esmf/DEFAULTINSTALLDIR/lib/libO/Linux.gfortran.64.openmpi.default/esmf.mk");
		target.setBuildAttribute(IMakeTarget.BUILD_TARGET, makeTarget);
		manager.addTarget(folder, target);	
		
	}
	
	/*
	private void addMakeTargets(IProject project) throws CoreException {

		IMakeTargetManager manager = MakeCorePlugin.getDefault().getTargetManager();
		String[] ids = manager.getTargetBuilders(project);
		
		try {
			IMakeTarget target; 
			
			target = manager.createTarget(project, "mainApp", ids[0]);
			target.setStopOnError(false);
			target.setRunAllBuilders(false);
			target.setUseDefaultBuildCmd(true);
			target.setBuildAttribute(IMakeCommonBuildInfo.BUILD_COMMAND, "make");
			//target.setBuildAttribute(IMakeTarget.BUILD_LOCATION, "/build/location");
			//target.setBuildAttribute(IMakeTarget.BUILD_ARGUMENTS, "ESMFMKFILE=/home/sgeadmin/esmf/DEFAULTINSTALLDIR/lib/libO/Linux.gfortran.64.openmpi.default/esmf.mk");
			target.setBuildAttribute(IMakeTarget.BUILD_TARGET, "mainApp");
			manager.addTarget(project, target);
				
			target = manager.createTarget(project, "clean", ids[0]);
			target.setStopOnError(false);
			target.setRunAllBuilders(false);
			target.setUseDefaultBuildCmd(true);
			target.setBuildAttribute(IMakeCommonBuildInfo.BUILD_COMMAND, "make");
			//target.setBuildAttribute(IMakeTarget.BUILD_LOCATION, "/build/location");
			//target.setBuildAttribute(IMakeTarget.BUILD_ARGUMENTS, "ESMFMKFILE=/home/sgeadmin/esmf/DEFAULTINSTALLDIR/lib/libO/Linux.gfortran.64.openmpi.default/esmf.mk");
			target.setBuildAttribute(IMakeTarget.BUILD_TARGET, "clean");
			manager.addTarget(project, target);
			
			target = manager.createTarget(project, "dust", ids[0]);
			target.setStopOnError(false);
			target.setRunAllBuilders(false);
			target.setUseDefaultBuildCmd(true);
			target.setBuildAttribute(IMakeCommonBuildInfo.BUILD_COMMAND, "make");
			//target.setBuildAttribute(IMakeTarget.BUILD_LOCATION, "/build/location");
			//target.setBuildAttribute(IMakeTarget.BUILD_ARGUMENTS, "ESMFMKFILE=/home/sgeadmin/esmf/DEFAULTINSTALLDIR/lib/libO/Linux.gfortran.64.openmpi.default/esmf.mk");
			target.setBuildAttribute(IMakeTarget.BUILD_TARGET, "dust");
			manager.addTarget(project, target);
		
		
		} catch (CoreException e) {
			throw e;
		}

	}
	*/
	

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

	@Override
	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		this.config = config;		
	}

}