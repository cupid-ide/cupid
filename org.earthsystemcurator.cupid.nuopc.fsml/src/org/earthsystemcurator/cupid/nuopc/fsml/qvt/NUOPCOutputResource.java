package org.earthsystemcurator.cupid.nuopc.fsml.qvt;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jqvt.runtime.PlainJQVTEngine;

public class NUOPCOutputResource implements PlainJQVTEngine.OutputResource {

	//private String uri;
	private Resource resource;
	final List<Object> createdElements = new ArrayList<Object>();
	
	public NUOPCOutputResource(String uri) {
		//this.uri = uri;	
		
		ResourceSet rset = new ResourceSetImpl();
		
		resource = rset.createResource(URI.createURI(uri));
	}
	
	public NUOPCOutputResource(Resource resource) {
		this.resource = resource;
	}

	@Override
	public <T> T createInstancesRef(Class<T> clazz) {
		System.out.println("output.createInstancesRef: " + clazz.getName());
	
		T result;
		
		try {			
			Method m = NUOPCFactory.eINSTANCE.getClass().getMethod("create" + clazz.getSimpleName());
			result = (T) m.invoke(NUOPCFactory.eINSTANCE);
			createdElements.add((EObject) result);
		}
		catch (Throwable e) {
			throw new RuntimeException("Error as trying to create instance of " + clazz, e);
		}		
		
		System.out.println("output.createInstancesRef returning: " + result);
		
		return result;
		
		/*
		try {
			String packageName = clazz.getPackage().getName();
			String className = packageName.substring(packageName.lastIndexOf('.') + 1) + "Factory";
			className = className.substring(0, 1).toUpperCase() + className.substring(1);
			
			System.out.println("Getting class: " + packageName + "." + className);
			Class<?> factory = Class.forName("org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCFactory", true, clazz.getClassLoader());
			
			
			Field f = factory.getField("eINSTANCE");
			Object eINSTANCE = f.get(null);
			Method m = factory.getMethod("create" + clazz.getSimpleName());
			T result = (T) m.invoke(eINSTANCE);
			//createdElements.add((EObject) result);
			return result;
		} catch (Throwable e) {
			throw new RuntimeException("Error as trying to create instance of " + clazz, e);
		}
		*/
		
	}

	@Override
	public void finish() {
		System.out.println("output.finish()");
		
		resource.getContents().clear();
		
		for (Object eObject : createdElements) {
			if (((EObject) eObject).eContainer() == null) {
				resource.getContents().add((EObject) eObject);				
			}
		}
		
		try {
			resource.save(null);
		} catch (IOException e) {
			throw new RuntimeException("Error saving resource: ", e);
		}
	}			
	
}