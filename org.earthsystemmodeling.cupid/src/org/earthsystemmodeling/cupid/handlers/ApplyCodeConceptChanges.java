package org.earthsystemmodeling.cupid.handlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.earthsystemmodeling.cupid.core.CupidActivator;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.earthsystemmodeling.cupid.nuopc.CodeConcept.MarkerLoc;
import org.eclipse.compare.internal.DocLineComparator;
import org.eclipse.compare.rangedifferencer.RangeDifference;
import org.eclipse.compare.rangedifferencer.RangeDifferencer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.text.Document;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.RefactoringStatusEntry;
import org.eclipse.ltk.core.refactoring.TextFileChange;

@SuppressWarnings("restriction")
public class ApplyCodeConceptChanges implements IRunnableWithProgress {

	private CodeConcept<?,?> codeConcept;
	private List<IMarker> markers;
	private Change change;
		
	public ApplyCodeConceptChanges(CodeConcept<?,?> codeConcept) {
		this.codeConcept = codeConcept;
		this.markers = new ArrayList<IMarker>();
	}
		
	@Override
	public void run(IProgressMonitor monitor) {
		
		try {
			
			//change = codeConcept.generateChange();
			TextFileChange textFileChange = (TextFileChange) change;  //assumed for now
			IFile file = textFileChange.getFile();
			
			String fileContentsBefore = IOUtils.toString(file.getContents());
			textFileChange.initializeValidationData(monitor);
			RefactoringStatus rs = textFileChange.isValid(monitor);
			if (rs.hasError()) {
				for (RefactoringStatusEntry e : rs.getEntries()) {
					CupidActivator.debug(e.getMessage());
				}
				return;
			}
			textFileChange.perform(monitor);
			String fileContentsAfter = IOUtils.toString(file.getContents());		
								
			DocLineComparator left = new DocLineComparator(new Document(fileContentsBefore), null, true);
			DocLineComparator right = new DocLineComparator(new Document(fileContentsAfter), null, true);
								
		    RangeDifference[] diffs = RangeDifferencer.findDifferences(left, right);
		        
		    file.deleteMarkers("org.earthsystemmodeling.cupid.cupidmarker", false, IResource.DEPTH_ZERO);
		    file.deleteMarkers("org.earthsystemmodeling.cupid.cupidparam", false, IResource.DEPTH_ZERO);
		        
		    for (RangeDifference rd : diffs) {        	
	        	int start = right.getTokenStart(rd.rightStart());
	        	int end = right.getTokenStart(rd.rightEnd()) + right.getTokenLength(rd.rightEnd());

	        	if (end-start > 2) {
	        		IMarker marker = file.createMarker("org.earthsystemmodeling.cupid.cupidmarker");
	        		marker.setAttribute(IMarker.CHAR_START, start);
	        		marker.setAttribute(IMarker.CHAR_END, end);
	        		marker.setAttribute(IMarker.MESSAGE, "Cupid generated code");
	        		marker.setAttribute(IMarker.LOCATION, "Lines " + rd.rightStart() + " to " + rd.rightEnd());
	        		markers.add(marker);
	        	}	
	        }
	        
	        //add param markers
        	for (MarkerLoc ml : codeConcept.getParamMarkers()) {
        		IMarker marker = file.createMarker("org.earthsystemmodeling.cupid.cupidparam");
        		marker.setAttribute(IMarker.CHAR_START, ml.start);
        		marker.setAttribute(IMarker.CHAR_END, ml.end);
        		marker.setAttribute(IMarker.MESSAGE, "Generated parameter");
        	}	
        	
        	//recompute edges in vpg
        	//PhotranVPG.getInstance().forceRecomputationOfEdgesAndAnnotations(PhotranVPG.getFilenameForIFile(file));
        	//PhotranVPG.getInstance().acquireTransientAST(file);
        	
	
		} catch (CoreException | IOException e) {
			CupidActivator.log("Error executing code generation", e);
		}

	}

	public List<IMarker> getMarkers() {
		return this.markers;
	}
	
	public Change getChange() {
		return change;
	}

}
