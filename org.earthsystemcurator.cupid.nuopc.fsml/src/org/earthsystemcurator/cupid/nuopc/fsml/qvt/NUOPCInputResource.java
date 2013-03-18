package org.earthsystemcurator.cupid.nuopc.fsml.qvt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jqvt.runtime.PlainJQVTEngine;
import org.eclipse.photran.core.IFortranAST;
import org.eclipse.photran.internal.core.parser.IASTNode;

public class NUOPCInputResource implements PlainJQVTEngine.InputResource {

	private String uri;
	private Resource resource;
	private IFortranAST ast;
	
	public NUOPCInputResource(String uri) {
		this.uri = uri;	
	}
	
	public NUOPCInputResource(IFortranAST ast) {
		this.ast = ast;
	}
	
	private Map<String, List> mapInstancesList = new HashMap<String, List>();
	
	@Override
	public <T> List<T> getInstancesFor(Class<T> clazz) {
		if (uri != null) return getInstancesForXMI(clazz);
		else return getInstancesForAST(clazz);
	}
	
	public <T> List<T> getInstancesForAST(Class<T> clazz) {		
		System.out.println("input.getInstancesForAST(): " + clazz.getName());
		ArrayList lst = new ArrayList();
		lst.addAll(ast.getRoot().findAll((Class<? extends IASTNode>) clazz));		
		return (List<T>) lst;
	}
	
	public <T> List<T> getInstancesForXMI(Class<T> clazz) {
		System.out.println("input.getInstancesForXMI(): " + clazz.getName());
		String key = clazz.getName();
		List cached = mapInstancesList.get(key);
		if (cached != null)
			return (List<T>) cached;
		cached = new ArrayList<T>();
		for (Iterator<?> it = resource.getAllContents(); it.hasNext();) {
			Object curr = it.next();
			if (clazz.isInstance(curr))
				cached.add(curr);
		}
		mapInstancesList.put(key, cached);
		return (List<T>) cached;
	}

	@Override
	public void load() {
		System.out.println("input.load()");
		
		if (uri != null) {
			ResourceSet resourceSet = new ResourceSetImpl();
	
	        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
	            Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
	
	        @SuppressWarnings("unused")
	        NUOPCPackage pack = NUOPCPackage.eINSTANCE;
	         
	        resource = resourceSet.getResource(URI.createURI(uri), true);
		}
        		
	}
	
}