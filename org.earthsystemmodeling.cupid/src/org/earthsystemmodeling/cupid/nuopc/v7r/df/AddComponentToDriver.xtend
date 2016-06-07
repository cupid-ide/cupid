package org.earthsystemmodeling.cupid.nuopc.v7r.df

import java.lang.annotation.Retention
import java.util.List
import org.earthsystemmodeling.cupid.nuopc.CodeConcept
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCDriver
import org.earthsystemmodeling.cupid.nuopc.v7r.NUOPCModel
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.xbase.lib.Functions.Function0

@Accessors
abstract class DesignFragment {
	
	protected String name
	protected String goal
	protected String description
	//protected Map<String, Class<? extends CodeConcept<?,?>>> bindingTypes
	//protected Map<String, CodeConcept<?,?>> bindings
	protected List<Task> tasks
	
	new(String name, String goal, String description) {
		this.name = name
		this.goal = goal
		this.description = description
		//this.bindingTypes = newHashMap
		//this.bindings = newHashMap
	}
	
	def setTasks(List<Task> tasks) {
		setParent(tasks)
	}
	
	private def void setParent(List<Task> tasks) {
		tasks.forEach[t|
			t.designFragment = this
			setParent(t.subTasks)
		]
		this.tasks = tasks
	}
	
	def setBinding(String name, CodeConcept<?,?> concept) {
		val localField = this.class.fields.findFirst[f|
			f.getAnnotation(Binding) != null &&
			f.getName().equals(name)
		]
		localField.set(this, concept)
	}
	
	def removeBinding(String name) {
		setBinding(name, null)
	}
	
	def CodeConcept<?,?> getBinding(String name) {
		val localField = this.class.fields.findFirst[f|
			f.getAnnotation(Binding) != null &&
			f.getName().equals(name)
		]
		localField.get(this) as CodeConcept<?,?>
	}
	
	def Class<? extends CodeConcept<?,?>> getBindingType(String name) {
		val localField = this.class.fields.findFirst[f|
			f.getAnnotation(Binding) != null &&
			f.getName().equals(name)
		]
		localField.type as Class<? extends CodeConcept<?,?>>
	}
	
	def List<String> getBindings() {
		val listToReturn = newArrayList
		class.fields.filter[f|
			f.getAnnotation(Binding) != null
		].forEach[f|
			listToReturn.add(f.name)
		]
		listToReturn
	}
	
}

@Accessors
class Task<C extends CodeConcept<?,?>> {
	
	protected DesignFragment designFragment
	protected String text
	protected boolean optional
	protected List<Task<?>> subTasks
	protected Function0<C> bindingFunc
	
	new(String text, Function0<C> bindingFunc, boolean optional) {
		this.text = text
		this.bindingFunc = bindingFunc
		this.optional = optional
		subTasks = #[]
	}
	
	new(String text, Function0<C> bindingFunc) {
		this(text, bindingFunc, false)
	}
	
	def Task<C> subTasks(List<Task<?>> subTasks) {
		this.subTasks = subTasks
		this
	}
	 
	def List<Task<?>> getSubTasks() {
		subTasks
	}
	
	def boundTo() {
		try {
			bindingFunc.apply
		}
		catch (NullPointerException npe) {
			return null;
		}
	}
	
	def getText() {
		val StringBuilder sb = new StringBuilder(text)
		//designFragment.bindings.forEach[name, binding|
		//	if (binding != null) {
		//		if (sb.indexOf("{"+name+"}") != -1) {
		//			replaceAll(sb, "{"+name+"}", binding.name)
		//		}
		//	}
		//]
		sb.toString
	}
	
	def getBindingType() {
		val method = bindingFunc.class.methods.findFirst[m|m.name.equals("apply")]
		val returnType = method.genericReturnType
		returnType as Class<? extends CodeConcept<?,?>>
	}
	
	def static replaceAll(StringBuilder builder, String from, String to) {
	    var index = builder.indexOf(from);
	    while (index != -1) {
	        builder.replace(index, index + from.length(), to);
	        index += to.length(); // Move to the end of the replacement
	        index = builder.indexOf(from, index);
	    }
	}
	
}

@Accessors
class AddComponentToDriver extends DesignFragment {
	
	@Binding
	public NUOPCDriver Driver
	
	@Binding
	public NUOPCModel Model
		
	new() {
		super("Add Model to a Driver", 
			  "Add a Model component to the list of child components in a Driver",
				'''
				Use this goal to add a child Model to a Driver so that 
				it can be executed during the Driver's a run sequence.
				'''
		)
		setTasks(#[	
			new Task(
				"Import {Model} SetServices subroutine (only) into {Driver}",
				[Driver]
			).subTasks(#[
				new Task(
					"Add call to NUOPC_DriverAddComp passing in the Model SetServices subroutine", 
					[Driver.initialization.initSpecs.setModelServices]
				).subTasks(#[
					new Task(
						"",
						[Driver.initialization.initSpecs.setModelServices.addComps.findFirst[
							it.compLabel.equals("\"" + Model.name + "\"")							
						]]
					)
				]),
				new Task(
					"Add run sequence element with call to NUOPC_DriverAddRunElement",
					[Driver.initialization.initSpecs.setRunSequence],
					true
				)/*,
				new Task(
					"Test the run sequence element...",
					[Driver.initialization.initSpecs.setRunSequence.runElements.findFirst[e|
						e.compLabel.equals(Model.name)
					]]
				)*/
			])
		])
	}
	
}

@Retention(RUNTIME)
annotation Binding {
}

/*
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
*/


