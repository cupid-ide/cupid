package org.earthsystemmodeling.cupid.handlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.earthsystemmodeling.cupid.core.CupidActivator;
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
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.ui.IWorkbenchWindow;

@SuppressWarnings("restriction")
public class RewriteASTRunnable implements IRunnableWithProgress {
	
	IFortranAST ast;
	IFile file;
	TextFileChange textFileChange;
	String fileContentsBefore;
	String fileContentsAfter;
	List<IMarker> markers;
	
	List<MarkerLoc> paramMarkers;
	
	static String paramRegex = "CUPIDPARAM\\$(CHAR|INT)\\$([^\\$]*)\\$";
	static Pattern paramPattern = Pattern.compile(paramRegex);

	static class MarkerLoc {
		public int start;
		public int end;
		public MarkerLoc(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}
	
	public RewriteASTRunnable(IFortranAST ast) {
		this.ast = ast;
		//this.window = window;
		this.markers = new ArrayList<IMarker>();
		this.paramMarkers = new ArrayList<MarkerLoc>();
		
		file = ast.getFile();
    			
		try {
			
			fileContentsBefore = IOUtils.toString(file.getContents(false));
			int charsInFile = fileContentsBefore.length();
			fileContentsAfter = ast.getRoot().toString().trim();
			
			if (!fileContentsAfter.equals(fileContentsBefore)) {
	    		
				
				Matcher matcher = paramPattern.matcher(fileContentsAfter);
    		        
				StringBuffer sb = new StringBuffer();
		        while (matcher.find()) {
		        	//System.out.println(matcher.group(2));
		        	matcher.appendReplacement(sb, "$2");
		        	int endLoc = sb.length();
		        	int startLoc = endLoc - matcher.group(2).length();
		        	paramMarkers.add(new MarkerLoc(startLoc, endLoc));
		        }
		        matcher.appendTail(sb);
		        
			    fileContentsAfter = sb.toString();
				
				
				textFileChange = new TextFileChange("Cupid code generation: " + file.getFullPath().toOSString(), file);
	            //changeThisFile.initializeValidationData(monitor);	            
	    	   	textFileChange.setEdit(new ReplaceEdit(0, charsInFile, fileContentsAfter));
	    	}
			
		} catch (CoreException e) {
			CupidActivator.log("Error preparing code generation", e);
		} catch (IOException e) {
			CupidActivator.log("Error reading file before code generation: " + file.getFullPath(), e);
		}
  	
	}
	
	public RewriteASTRunnable(TextFileChange tfc, IWorkbenchWindow window) {
		this.textFileChange = tfc;
	}
	
	
	
	public void run(IProgressMonitor monitor) {

		try {
			
        	if (textFileChange != null) {
        		
        		textFileChange.perform(monitor);
						
				//IRangeComparator left = new TokenComparator(fileContentsBefore); 
		        //IRangeComparator right = new TokenComparator(fileContentsAfter);
				
				DocLineComparator left = new DocLineComparator(new Document(fileContentsBefore), null, true);
				DocLineComparator right = new DocLineComparator(new Document(fileContentsAfter), null, true);
								
		        RangeDifference[] diffs = RangeDifferencer.findDifferences(left, right);
		        
		        file.deleteMarkers("org.earthsystemmodeling.cupid.cupidmarker", false, IResource.DEPTH_ZERO);
		        file.deleteMarkers("org.earthsystemmodeling.cupid.cupidparam", false, IResource.DEPTH_ZERO);
		        
		        //IMarker firstMarker = null;
		        for (RangeDifference rd : diffs) {
		        	
		        	int start = right.getTokenStart(rd.rightStart());
		        	int end = right.getTokenStart(rd.rightEnd()) + right.getTokenLength(rd.rightEnd());
		        	//System.out.println("Range diff: " + rd.toString() + " : " + replaceString.substring(start, end));		        	        	
		        	
		        	//int oldStart = left.getTokenStart(rd.leftStart());
		        	//int oldEnd = left.getTokenStart(rd.leftEnd()) + left.getTokenLength(rd.leftEnd());
		        	//System.out.println("\n*********Range diff: " + rd.toString());
		        	//System.out.println("BEFORE:\n" + fileContentsBefore.substring(oldStart, oldEnd));
		        	//System.out.println("\nAFTER:\n" + replaceString.substring(start, end));
		        	
		        	
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
	        	for (MarkerLoc ml : paramMarkers) {
	        		IMarker marker = file.createMarker("org.earthsystemmodeling.cupid.cupidparam");
	        		marker.setAttribute(IMarker.CHAR_START, ml.start);
	        		marker.setAttribute(IMarker.CHAR_END, ml.end);
	        		marker.setAttribute(IMarker.MESSAGE, "Generated parameter");
	        	}		        
		     
        	}
		} catch (CoreException e) {
			CupidActivator.log("Error executing code generation", e);
		}
    	
	}
	
	public List<IMarker> getMarkers() {
		return this.markers;
	}
	
	/*
	public static String inputStreamToString(final InputStream is) {
		int bufferSize = 1024;
		final char[] buffer = new char[bufferSize];
		final StringBuilder out = new StringBuilder();
		try {
			final Reader in = new InputStreamReader(is);
			try {
				for (;;) {
					int rsz = in.read(buffer, 0, buffer.length);
					if (rsz < 0)
						break;
					out.append(buffer, 0, rsz);
				}
			}
			finally {
				in.close();
			}
		}
		catch (UnsupportedEncodingException ex) {
			ex.printStackTrace();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		return out.toString();
	}
	*/
	
}