package org.earthsystemcurator.cupid.nuopc.fsml.qvt;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.earthsystemcurator.cupid.nuopc.fsml.nuopc.ModelDefinesSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.qvt.Module2DefinesSetServices;
import org.earthsystemcurator.cupid.nuopc.fsml.qvt.Module2Model;
import org.eclipse.photran.internal.core.parser.ASTModuleNode;

public abstract class Transformation {
  public boolean Module2Model(final Object srcModule, final Object tgtModel) {
    throw new RuntimeException("should never be called");
  }
  
  public boolean Module2DefinesSetServices(final Object srcModule, final Object tgtDSS) {
    throw new RuntimeException("should never be called");
  }
  
  public HashMap<Module2Model,Module2Model> traces_Module2Model;
  
  public Module2Model top_relation_Module2Model(final ASTModuleNode srcModule) {
    Module2Model result = new Module2Model(srcModule);
    if (traces_Module2Model==null) traces_Module2Model = new java.util.HashMap<Module2Model,Module2Model>();
    if (traces_Module2Model.containsKey(result)) {
    	result = traces_Module2Model.get(result);
    } else {
    	traces_Module2Model.put(result,null);
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_Module2Model.put(result,result);
    	
    	Set<Object> waitingRelList = this.waitingList.get(result);
    	if(waitingRelList != null){
    		for(Object waitingRel : waitingRelList){
    			try{
    				Method m = waitingRel.getClass().getMethod("execute",Transformation.class);
    				m.invoke(waitingRel, this);
    				//System.out.println("Re-execute: " + waitingRel);
    			}
    			catch(Exception exception){
    				exception.printStackTrace();
    			}
    		}
    		this.waitingList.get(result).clear();
    	}
    }
    return result;
  }
  
  public static String[] top_relation_Module2Model_directions = new String[]{"source", "target"};
  
  public HashMap<Module2DefinesSetServices,Module2DefinesSetServices> traces_Module2DefinesSetServices;
  
  public Module2DefinesSetServices push_relation_Module2DefinesSetServices(final ASTModuleNode srcModule, final ModelDefinesSetServices tgtDSS) {
    Module2DefinesSetServices result = new Module2DefinesSetServices(srcModule);
    if (traces_Module2DefinesSetServices==null) traces_Module2DefinesSetServices = new java.util.HashMap<Module2DefinesSetServices,Module2DefinesSetServices>();
    if (traces_Module2DefinesSetServices.containsKey(result)) {
    	result = traces_Module2DefinesSetServices.get(result);
    } else {
    	traces_Module2DefinesSetServices.put(result,null);
    	result.tgtDSS = tgtDSS;
    	this.relStack.push(result);
    	boolean execResult = result.execute(this);
    	this.relStack.pop();
    	if (!execResult) return null;
    	traces_Module2DefinesSetServices.put(result,result);
    	
    	Set<Object> waitingRelList = this.waitingList.get(result);
    	if(waitingRelList != null){
    		for(Object waitingRel : waitingRelList){
    			try{
    				Method m = waitingRel.getClass().getMethod("execute",Transformation.class);
    				m.invoke(waitingRel, this);
    				//System.out.println("Re-execute: " + waitingRel);
    			}
    			catch(Exception exception){
    				exception.printStackTrace();
    			}
    		}
    		this.waitingList.get(result).clear();
    	}
    }
    return result;
  }
  
  public Module2DefinesSetServices relation_Module2DefinesSetServices(final ASTModuleNode srcModule) {
    Module2DefinesSetServices result = new Module2DefinesSetServices(srcModule);
    if (traces_Module2DefinesSetServices==null) traces_Module2DefinesSetServices = new java.util.HashMap<Module2DefinesSetServices,Module2DefinesSetServices>();
    if (traces_Module2DefinesSetServices.containsKey(result)) {
    	result = traces_Module2DefinesSetServices.get(result);
    } else {
    	
    	Set<Object> waiting = this.waitingList.get(result);
    	if(waiting == null)
    		this.waitingList.put(result, (waiting = new java.util.HashSet<Object>()));
    	waiting.addAll(this.relStack);
    	//System.out.println(waiting);
    	return null;
    }
    return result;
  }
  
  public static String[] global_direction = new String[]{"source", "target"};
  
  public String[] topOrder = new String[]{ "Module2Model" };
  
  private List<Method> cachedTopMethods = null;
  
  public List<Method> getTopSortedMethods() {
    if(cachedTopMethods!=null)
    	return cachedTopMethods;
    cachedTopMethods = new java.util.ArrayList<Method>();
    Class clazz = this.getClass();
    for(String it : this.topOrder){
    	if(it.startsWith("["))
    		System.err.println("The following relations are not evaluated due to circles: "+it);
    	for(Method m : clazz.getMethods()){
    		if(("top_relation_" + it).equals(m.getName())){
    			cachedTopMethods.add(m);
    			break;
    		}
    	}
    }
    return cachedTopMethods;
  }
  
  public abstract <T> T create(final Class<T> c);
  
  public Map<Object,Set<Object>> waitingList = new HashMap<Object,Set<Object>>();
  
  public Stack<Object> relStack = new Stack<Object>();
}
