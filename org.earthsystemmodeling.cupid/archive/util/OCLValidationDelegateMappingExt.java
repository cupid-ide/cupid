package org.earthsystemmodeling.cupid.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.ocl.common.internal.delegate.OCLValidationDelegateMapping;
import org.eclipse.ocl.examples.pivot.delegate.ValidationDelegateExtension;

@SuppressWarnings("restriction")
public class OCLValidationDelegateMappingExt extends OCLValidationDelegateMapping implements ValidationDelegateExtension {

	private ValidationDelegateExtension delegateExt = null;
	
	public OCLValidationDelegateMappingExt() {
		super();
		System.out.println("Instantiated OCLValidationDelegateMappingExt");
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject,
			DiagnosticChain diagnostics, Map<Object, Object> context,
			String constraint, String expression, int severity,
			String source, int code) {
		// TODO Auto-generated method stub
		System.out.println("OCLValidationDelegateMappingExt.validate1");
		
		if (delegateExt == null) {
			org.eclipse.emf.ecore.EValidator.ValidationDelegate delegate = resolveDelegate(context);
			//delegate.getClass().
			Class<?> c = delegate.getClass();
			Class<?> s = c.getSuperclass();
			Class<?> s2[] = s.getInterfaces();
			boolean isi = ValidationDelegateExtension.class.isInstance(delegate);
			
			delegateExt = (ValidationDelegateExtension) resolveDelegate(context);
			if (delegateExt == null) {
				return false;
			}
		}
		return delegateExt.validate(eClass, eObject, diagnostics, context,
				constraint, expression, severity, source, code);
		
	}

	@Override
	public boolean validate(EDataType eDataType,
			Object value,DiagnosticChain diagnostics,
			Map<Object, Object> context, String constraint,
			String expression, int severity, String source, int code) {
		// TODO Auto-generated method stub
		System.out.println("OCLValidationDelegateMappingExt.validate2");
		
		if (delegateExt == null) {
			delegateExt = (ValidationDelegateExtension) resolveDelegate(context);
			if (delegateExt == null) {
				return false;
			}
		}
		
		return delegateExt.validate(eDataType, value, diagnostics, context,
				constraint, expression, severity, source, code);
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject,
			DiagnosticChain diagnostics, Map<Object, Object> context,
			EOperation invariant, String expression, int severity,
			String source, int code) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
