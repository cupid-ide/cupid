package org.earthsystemmodeling.cupid.handlers;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import org.eclipse.compare.internal.DocLineComparator;
import org.eclipse.compare.rangedifferencer.RangeDifference;
import org.eclipse.compare.rangedifferencer.RangeDifferencer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.text.Document;
import org.eclipse.ltk.core.refactoring.TextFileChange;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;

@SuppressWarnings("restriction")
public class RewriteASTRunnable implements IRunnableWithProgress {
	
	IFortranAST ast;
	IWorkbenchWindow window;
	
	public RewriteASTRunnable(IFortranAST ast, IWorkbenchWindow window) {
		this.ast = ast;
		this.window = window;
	}
	
	public void run(IProgressMonitor monitor) {
	
		if (ast == null) {
			System.out.println("Null AST");
			return;
		}
		
		IFile f = ast.getFile();
		if (!f.exists()) {
			System.out.println("File does not exist: " + f.exists());
			return;
		}
    			
        try {
			
        	String fileContentsBefore = inputStreamToString(f.getContents(false));
        	int charsInFile = fileContentsBefore.length();
        	
        	String replaceString = ast.getRoot().toString().trim();

        	if (!replaceString.equals(fileContentsBefore)) {
        		
        		TextFileChange changeThisFile = new TextFileChange("Cupid code generation: " + f.getFullPath().toOSString(), f);
	            changeThisFile.initializeValidationData(monitor);	            
        	   	changeThisFile.setEdit(new ReplaceEdit(0, charsInFile, replaceString));
        	   	changeThisFile.perform(monitor);
			
        	   	//String fileContentsAfter = inputStreamToString(f.getContents(true));
				//System.out.println("Processed file: " + f.getName()); // + " : " + charsInFile + " ==> " + replaceString.length());
			
				//IRangeComparator left = new TokenComparator(fileContentsBefore); 
		        //IRangeComparator right = new TokenComparator(fileContentsAfter);
				
        	   	//TODO: make the marker stuff optional
				DocLineComparator left = new DocLineComparator(new Document(fileContentsBefore), null, true);
				DocLineComparator right = new DocLineComparator(new Document(replaceString), null, true);
				
		        RangeDifference[] diffs = RangeDifferencer.findDifferences(left, right);
		        
		        IMarker firstMarker = null;
		        for (RangeDifference rd : diffs) {
		        	
		        	int start = right.getTokenStart(rd.rightStart());
		        	int end = right.getTokenStart(rd.rightEnd()) + right.getTokenLength(rd.rightEnd());
		        	//System.out.println("Range diff: " + rd.toString() + " : " + replaceString.substring(start, end));		        	        	
		        	
		        	int oldStart = left.getTokenStart(rd.leftStart());
		        	int oldEnd = left.getTokenStart(rd.leftEnd()) + left.getTokenLength(rd.leftEnd());
		        	//System.out.println("\n*********Range diff: " + rd.toString());
		        	//System.out.println("BEFORE:\n" + fileContentsBefore.substring(oldStart, oldEnd));
		        	//System.out.println("\nAFTER:\n" + replaceString.substring(start, end));
		        	
		        	if (end-start > 2) {
		        		IMarker marker = f.createMarker("org.earthsystemmodeling.cupid.cupidmarker");
		        		marker.setAttribute(IMarker.CHAR_START, start);
		        		marker.setAttribute(IMarker.CHAR_END, end);
		        		marker.setAttribute(IMarker.MESSAGE, "Cupid generated code");
		        		marker.setAttribute(IMarker.LOCATION, "Lines " + rd.rightStart() + " to " + rd.rightEnd());
		        		if (firstMarker == null) firstMarker = marker;
		        	}
		        }
        	
		        //open editor on last marker generated
		        if (firstMarker != null && window != null) {
					IWorkbenchPage page = window.getActivePage();
					try {
						IDE.openEditor(page, firstMarker, false);
						//marker.delete();
					} catch (PartInitException e) {
						e.printStackTrace();						
					}
				}
		        
        	}
		} catch (CoreException e) {
			e.printStackTrace();						
		}
    	
	}
	
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

	
}