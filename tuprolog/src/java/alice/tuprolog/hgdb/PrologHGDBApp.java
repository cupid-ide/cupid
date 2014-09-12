package alice.tuprolog.hgdb;

import org.hypergraphdb.HGHandle;
import org.hypergraphdb.HyperGraph;
import org.hypergraphdb.app.management.HGApplication;
import org.hypergraphdb.indexing.ByPartIndexer;
import org.hypergraphdb.type.HGAtomType;
import org.hypergraphdb.type.TypeUtils;

import alice.tuprolog.Struct;
import alice.tuprolog.Var;

public class PrologHGDBApp extends HGApplication
{
	private void undefineTypes(HyperGraph graph)
	{
		TypeUtils.deleteInstances(graph, AtomTermType.HANDLE);
		graph.remove(AtomTermType.HANDLE);				
		TypeUtils.deleteInstances(graph, PrologLongType.HANDLE);
		graph.remove(PrologLongType.HANDLE);
		TypeUtils.deleteInstances(graph, PrologIntType.HANDLE);
		graph.remove(PrologIntType.HANDLE);
		TypeUtils.deleteInstances(graph, PrologFloatType.HANDLE);
		graph.remove(PrologFloatType.HANDLE);
		TypeUtils.deleteInstances(graph, PrologDoubleType.HANDLE);
		graph.remove(PrologDoubleType.HANDLE);
		TypeUtils.deleteInstances(graph, VarType.HANDLE);
		graph.remove(VarType.HANDLE);
		TypeUtils.deleteInstances(graph, StructType.HANDLE);
		graph.remove(StructType.HANDLE);		
	}
	
	private void defineTypes(HyperGraph graph)
	{
		HGAtomType t = new StructType();
		t.setHyperGraph(graph);
		graph.getTypeSystem().addPredefinedType(StructType.HANDLE, t, Struct.class);
		t = new VarType();
		t.setHyperGraph(graph);
		graph.getTypeSystem().addPredefinedType(VarType.HANDLE, t, Var.class);
		t = new PrologLongType();
		t.setHyperGraph(graph);
		graph.getTypeSystem().addPredefinedType(PrologLongType.HANDLE, t, alice.tuprolog.Long.class);
		t = new PrologIntType();
		t.setHyperGraph(graph);
		graph.getTypeSystem().addPredefinedType(PrologIntType.HANDLE, t, alice.tuprolog.Int.class);
		t = new PrologFloatType();
		t.setHyperGraph(graph);
		graph.getTypeSystem().addPredefinedType(PrologFloatType.HANDLE, t, alice.tuprolog.Float.class);
		t = new PrologDoubleType();
		t.setHyperGraph(graph);
		graph.getTypeSystem().addPredefinedType(PrologDoubleType.HANDLE, t, alice.tuprolog.Double.class);	
		t = new AtomTermType();
		t.setHyperGraph(graph);
		graph.getTypeSystem().addPredefinedType(AtomTermType.HANDLE, t, alice.tuprolog.clausestore.HGAtomTerm.class);			
	}
	
	private void registerIndices(HyperGraph graph)
	{
		HGHandle structType = graph.getTypeSystem().getTypeHandle(Struct.class);
		graph.getIndexManager().register(new ByPartIndexer(structType, "name"));
		graph.getIndexManager().register(new ByPartIndexer(structType, "predicateIndicator"));
	}

	private void unregisterIndices(HyperGraph graph)
	{
		HGHandle structType = graph.getTypeSystem().getTypeHandle(Struct.class);
		graph.getIndexManager().unregister(new ByPartIndexer(structType, "name"));
		graph.getIndexManager().unregister(new ByPartIndexer(structType, "predicateIndicator"));
	}
	
	public void install(HyperGraph graph)
	{
		defineTypes(graph);
		registerIndices(graph);
	}

	public void reset(HyperGraph graph)
	{
		uninstall(graph);
		install(graph);
	}

	public void uninstall(HyperGraph graph)	
	{
		unregisterIndices(graph);
		undefineTypes(graph);
	}

	public void update(HyperGraph graph)
	{
		// TODO Auto-generated method stub
	}
	
	public void extrADummyMethod() {
	    System.out.println("blabla");
	}
	
	public PrologHGDBApp()
	{
		setName("tuPrologApp");
	}
}