/**
 */
package org.earthsystemcurator.cupid.nuopc.fsml.nuopc;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Implements Init P2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getName <em>Name</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getImportParam <em>Import Param</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getExportParam <em>Export Param</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getRealizesImportField <em>Realizes Import Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getRealizesExportField <em>Realizes Export Field</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#isRealizesAtLeastOneField <em>Realizes At Least One Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP2()
 * @model
 * @generated
 */
public interface ModelImplementsInitP2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP2_Name()
	 * @model id="true" required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingX='subroutineName'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Import Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Param</em>' attribute.
	 * @see #setImportParam(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP2_ImportParam()
	 * @model required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingX='formalParam: 2'"
	 * @generated
	 */
	String getImportParam();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getImportParam <em>Import Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Param</em>' attribute.
	 * @see #getImportParam()
	 * @generated
	 */
	void setImportParam(String value);

	/**
	 * Returns the value of the '<em><b>Export Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Export Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export Param</em>' attribute.
	 * @see #setExportParam(String)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP2_ExportParam()
	 * @model required="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mappingX='formalParam: 3'"
	 * @generated
	 */
	String getExportParam();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#getExportParam <em>Export Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export Param</em>' attribute.
	 * @see #getExportParam()
	 * @generated
	 */
	void setExportParam(String value);

	/**
	 * Returns the value of the '<em><b>Realizes Import Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizes Import Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes Import Field</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP2_RealizesImportField()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesImportField#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='call: \"NUOPC_StateRealizeField(#realizedInState, field=#field, rc=#rc)\"'"
	 * @generated
	 */
	EList<RealizesImportField> getRealizesImportField();

	/**
	 * Returns the value of the '<em><b>Realizes Export Field</b></em>' containment reference list.
	 * The list contents are of type {@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField}.
	 * It is bidirectional and its opposite is '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizes Export Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes Export Field</em>' containment reference list.
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP2_RealizesExportField()
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.RealizesExportField#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc mapping='call: \"NUOPC_StateRealizeField(#realizedInState, field=#field, rc=#rc)\"'"
	 * @generated
	 */
	EList<RealizesExportField> getRealizesExportField();

	/**
	 * Returns the value of the '<em><b>Realizes At Least One Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizes At Least One Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes At Least One Field</em>' attribute.
	 * @see #setRealizesAtLeastOneField(boolean)
	 * @see org.earthsystemcurator.cupid.nuopc.fsml.nuopc.NUOPCPackage#getModelImplementsInitP2_RealizesAtLeastOneField()
	 * @model derived="true"
	 *        annotation="http://www.earthsystemcog.org/projects/nuopc essential='true'"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.realizesImportField->size() > 0 or self.realizesExportField->size() > 0'"
	 * @generated
	 */
	boolean isRealizesAtLeastOneField();

	/**
	 * Sets the value of the '{@link org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelImplementsInitP2#isRealizesAtLeastOneField <em>Realizes At Least One Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizes At Least One Field</em>' attribute.
	 * @see #isRealizesAtLeastOneField()
	 * @generated
	 */
	void setRealizesAtLeastOneField(boolean value);

} // ModelImplementsInitP2
