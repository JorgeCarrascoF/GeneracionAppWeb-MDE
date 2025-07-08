/*
 * 
 */
package DataWeb.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class DataWebCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected DataWeb.diagram.part.DataWebCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected DataWeb.diagram.part.DataWebCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(DataWeb.diagram.part.Messages.DataWebCreationWizardTitle);
		setDefaultPageImageDescriptor(DataWeb.diagram.part.DataWebDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewDataWebWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new DataWeb.diagram.part.DataWebCreationWizardPage("DiagramModelFile", getSelection(), //$NON-NLS-1$
				"dataweb_diagram"); //$NON-NLS-1$
		diagramModelFilePage.setTitle(DataWeb.diagram.part.Messages.DataWebCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(DataWeb.diagram.part.Messages.DataWebCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new DataWeb.diagram.part.DataWebCreationWizardPage("DomainModelFile", getSelection(), //$NON-NLS-1$
				"dataweb") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".dataweb_diagram".length()); //$NON-NLS-1$
					setFileName(DataWeb.diagram.part.DataWebDiagramEditorUtil.getUniqueFileName(getContainerFullPath(),
							fileName, "dataweb")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage.setTitle(DataWeb.diagram.part.Messages.DataWebCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage
				.setDescription(DataWeb.diagram.part.Messages.DataWebCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = DataWeb.diagram.part.DataWebDiagramEditorUtil.createDiagram(diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						DataWeb.diagram.part.DataWebDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								DataWeb.diagram.part.Messages.DataWebCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						DataWeb.diagram.part.Messages.DataWebCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				DataWeb.diagram.part.DataWebDiagramEditorPlugin.getInstance().logError("Error creating diagram", //$NON-NLS-1$
						e.getTargetException());
			}
			return false;
		}
		return diagram != null;
	}
}
