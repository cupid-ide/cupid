package org.earthsystemmodeling.cupid.nuopc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.earthsystemmodeling.cupid.nuopc.CodeConcept;
import org.eclipse.core.resources.IFile;

public class NUOPCFrameworkDB {

	private static NUOPCFrameworkDB instance;
	
	private HashMap<IFile, Long> fileToTimestamp;
	private HashMap<IFile, CodeConcept<?,?>> fileToConcept;
	private ArrayList<IFile> markToKeep;
	
	protected NUOPCFrameworkDB() {
		fileToTimestamp = new HashMap<IFile, Long>();
		fileToConcept = new HashMap<IFile, CodeConcept<?,?>>();
		markToKeep = new ArrayList<IFile>();
	}
	
	public static NUOPCFrameworkDB getInstance() {
		if (instance == null) {
			instance = new NUOPCFrameworkDB();
		}
		return instance;
	}
	
	public void store(IFile file, CodeConcept<?,?> concept) {
		fileToTimestamp.put(file, file.getModificationStamp());
		fileToConcept.put(file, concept);
	}
	
	public CodeConcept<?,?> retrieve(IFile file) {
		return fileToConcept.get(file);
	}
	
	public <C extends CodeConcept<?,?>> List<C> retrieveAll(Class<? extends CodeConcept> type) {
		ArrayList<C> toReturn = new ArrayList<C>();
		for (CodeConcept c : fileToConcept.values()) {
			if (type.isInstance(c)) {
				toReturn.add((C) c);
			}
		}
		return toReturn;
	}
	
	public Set<Entry<IFile, CodeConcept<?, ?>>> retrieveAll() {
		return fileToConcept.entrySet();
	}
	
	public boolean isOutOfDate(IFile file) {
		if (!fileToTimestamp.containsKey(file)) {
			return true;
		}
		else if (file.getModificationStamp() > fileToTimestamp.get(file).longValue()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void clearMarksToKeep() {
		markToKeep.clear();
	}
	
	public void removeUnmarked() {
		ArrayList<IFile> files = new ArrayList<IFile>();
		files.addAll(fileToTimestamp.keySet());
		
		for (IFile f : files) {
			if (!markToKeep.contains(f)) {
				fileToTimestamp.remove(f);
				fileToConcept.remove(f);
			}
		}
	}
	
	public void clear() {
		fileToTimestamp.clear();
		fileToConcept.clear();
	}
	
	public void markToKeep(IFile file) {
		markToKeep.add(file);
	}
	
		
}
