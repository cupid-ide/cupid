package org.earthsystemcurator.cupid.nuopc.fsml.wizards;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.earthsystemcurator.cupid.nuopc.fsml.builder.NUOPCNature;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.MultiPartInitException;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.IDE;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;
import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.STRawGroupDir;

public class NUOPCProjectWizard extends Wizard implements INewWizard {

	private static Bundle MY_BUNDLE = FrameworkUtil.getBundle(NUOPCProjectWizard.class);
	
	private WizardNewProjectCreationPage newProjectPage;
	private NUOPCProjectWizardPageSelectArch selectArchPage;
	private NUOPCProjectWizardPageSingleModelProto singleModelProtoPage;
	

	/**
	 * Constructor for NUOPCProjectWizard.
	 */
	public NUOPCProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("Create NUOPC Project");
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
								
		selectArchPage = new NUOPCProjectWizardPageSelectArch();
		addPage(selectArchPage);
		
		newProjectPage = new WizardNewProjectCreationPage("Create NUOPC Project");
		newProjectPage.setTitle("Create NUOPC Project");
		newProjectPage.setDescription("Create a project for developing a NUOPC application.");
		newProjectPage.setInitialProjectName("NUOPCProject");
		addPage(newProjectPage);
		
		singleModelProtoPage = new NUOPCProjectWizardPageSingleModelProto();
		addPage(singleModelProtoPage);
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
					doFinish(projectHandle, monitor, singleModelProtoPage);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		
		try {
			//this.getShell().getDisplay().`
			getContainer().run(false, false, op);
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
	 */
	private void doFinish(IProject projectHandle, IProgressMonitor monitor, IWizardPage page) throws CoreException {
		
		//create project
		projectHandle.create(monitor);
		monitor.worked(1);
		projectHandle.open(monitor);
		monitor.worked(1);
		
		//add the NUOPC nature
		IProjectDescription desc = projectHandle.getDescription();
	    String[] prevNatures = desc.getNatureIds();
	    String[] newNatures = new String[prevNatures.length + 1];
	    System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
	    newNatures[prevNatures.length] = NUOPCNature.NATURE_ID;
	    desc.setNatureIds(newNatures);
	    projectHandle.setDescription(desc, monitor);
		
		
		String templateDir = "templates/" + page.getClass().getSimpleName().replaceFirst("NUOPCProjectWizardPage", "");
		
		URL bundleURL = FileLocator.find(MY_BUNDLE, new Path(templateDir), null);
		URL fileURL = null;
		try {
			fileURL = FileLocator.toFileURL(bundleURL);
		} catch (IOException e2) {
			e2.printStackTrace();
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
				String contents;
				String filename;
				if (f.getName().endsWith(".st")) {
					
					ST templateST = new ST(sb.toString());
					templateST.add("p", page);
					contents = templateST.render();
					
					//get filename
					String methodName = "get" + f.getName().substring(0, 1).toUpperCase() + f.getName().substring(1, f.getName().indexOf(".")) + "Name";
					
					try {						
						Method m = page.getClass().getMethod(methodName, (Class<?>[]) null);
						filename = (String) m.invoke(page, (Object[]) null);
						filename += f.getName().substring(f.getName().indexOf("."), f.getName().lastIndexOf(".")); // get extension, not including last .st					
					} catch (NoSuchMethodException e) {
						// use template filename without the final .st
						filename = f.getName().substring(0, f.getName().lastIndexOf("."));					
					}
					
				}
				else {
					contents = sb.toString();
					filename = f.getName();
				}
				
				IFile projectFile = projectHandle.getFile(filename);
				InputStream stream = openContentStream(contents);
				projectFile.create(stream, true, monitor);
				filesToOpen.add(projectFile);
				stream.close();
				monitor.worked(1);
					
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		
		}
		
		if (filesToOpen.size() > 0) {
			monitor.setTaskName("Opening files for editing...");
			getShell().getDisplay().asyncExec(new Runnable() {
				public void run() {
					IWorkbenchPage page =
						PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
					try {
						//filesToOpen.toArray(new IFile[] {});
						IDE.openEditors(page, filesToOpen.toArray(new IFile[] {}));
					} catch (MultiPartInitException e) {}
				}
			});
		}	
		
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
		//this.selection = selection;
	}
	
	public static void updateFont(Control c, int style) {
		FontData fontData = c.getFont().getFontData()[0];
		Font font = new Font(Display.getDefault(), new FontData(fontData.getName(), fontData.getHeight(), style));
		c.setFont(font);
	}
	
}