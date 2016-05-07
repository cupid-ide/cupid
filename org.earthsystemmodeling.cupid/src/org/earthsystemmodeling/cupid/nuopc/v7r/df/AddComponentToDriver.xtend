package org.earthsystemmodeling.cupid.nuopc.v7r.df

import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCDriver
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCBaseModel
import org.eclipse.xtend.lib.annotations.Accessors
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import java.util.List
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCMediator
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel
import java.lang.annotation.Retention

@Accessors
abstract class DesignFragment {
	def String name()
	def String goal()
	def String description()
	def List<Task> tasks()
}

@Accessors
class AddComponentToDriver extends DesignFragment {
	
	@Binding
	var NUOPCDriver driver
	
	@Binding
	var NUOPCModel model
	
	override name() {"Add component to Driver"}
	
	override goal() {"Add a child Model to a Driver"}
	
	override description() {
		'''
		Use this goal to add a child Model to a Driver so that 
		it can be executed during the Driver's a run sequence.
		'''
	}
	
	override tasks() {
		#[	
			new Task(
				"Import Model SetServices subroutine (only) into the Driver",
				NUOPCDriver
			).subTasks(#[
				new Task(
					"Add call to NUOPC_DriverAddComp passing in the Model SetServices subroutine", 
					NUOPCDriver.SetModelServices
				),
				new Task(
					"Add run sequence element with call to\nNUOPC_DriverAddRunElement",
					NUOPCDriver.SetRunSequence,
					true
				)
			])
		]	
	}
}

@Accessors
class TransferGridBetweenComponents extends DesignFragment {
	
	@Binding
	var NUOPCModel source
	
	@Binding
	var NUOPCMediator destination
	
	override name() {"Transfer Grid"}
	
	override goal() {"Transfer the grid from a Model to a Mediator"}
	
	override description() {
		'''
		Use this goal to set up an automated transfer of the grid between 
		a Model and a Mediator.
        '''
	}
	
	override tasks() {
		#[	
			new Task(
				"(subtasks)",
				NUOPCModel
			).subTasks(#[
				new Task(
					"Filter initialization phases to use IPDv03 or higher", 
					NUOPCModel.IPD.IPDv04p0
				),
				new Task(
					"In the Advertise initialization phase, set the TransferOfferGeom to 'can provide'",
					NUOPCModel.IPD.IPDv04p1
				)
			]),
			new Task(
				"(subtasks)",
				NUOPCMediator
			).subTasks(#[
				new Task(
					"Filter initialization phases to use IPDv03 or higher", 
					NUOPCMediator.IPD.IPDv04p0
				),
				new Task(
					"In the Advertise initialization phase, set the TransferOfferGeom to 'cannot provide'",
					NUOPCMediator.IPD.IPDv04p1
				)			
			])
		]	
	}
}


@Accessors
class Task {
	var Class<? extends CodeConcept<?,?>> context
	var CodeConcept<?,?> binding
	var String text
	var boolean optional
	var List<Task> subTasks
	
	new(String text, Class<? extends CodeConcept<?,?>> context, boolean optional) {
		this.text = text
		this.context = context
		this.optional = optional
		subTasks = #[]
	}
	
	new(String text, Class<? extends CodeConcept<?,?>> context) {
		this(text, context, false)
	}
	
	def Task subTasks(List<Task> subTasks) {
		this.subTasks = subTasks
		this
	}
}


@Retention(RUNTIME)
annotation Binding {}