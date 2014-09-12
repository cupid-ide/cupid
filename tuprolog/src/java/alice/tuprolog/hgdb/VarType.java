package alice.tuprolog.hgdb;

import org.hypergraphdb.HGHandle;
import org.hypergraphdb.HGPersistentHandle;
import org.hypergraphdb.IncidenceSetRef;
import org.hypergraphdb.LazyRef;
import org.hypergraphdb.handle.UUIDHandleFactory;
import org.hypergraphdb.type.HGAtomType;
import org.hypergraphdb.type.HGAtomTypeBase;

import alice.tuprolog.InvalidTermException;
import alice.tuprolog.Var;

public class VarType extends HGAtomTypeBase
{
	public static final HGPersistentHandle HANDLE = 
		UUIDHandleFactory.I.makeHandle("2d79f94c-7dd5-404c-a796-c52b39dc74fa");
	
	public Object make(HGPersistentHandle handle,
					   LazyRef<HGHandle[]> targetSet, 
					   IncidenceSetRef incidenceSet)
	{
		HGAtomType stringType = graph.getTypeSystem().getAtomType(String.class);		
		try { return new Var((String)stringType.make(handle, null, null)); }
		catch (InvalidTermException ex) { throw new RuntimeException(ex); }
	}

	public void release(HGPersistentHandle handle)
	{
		HGAtomType stringType = graph.getTypeSystem().getAtomType(String.class);
		stringType.release(handle);
	}

	public HGPersistentHandle store(Object instance)
	{
		HGAtomType stringType = graph.getTypeSystem().getAtomType(String.class);
		Var var = (Var)instance;
		return stringType.store(var.getName());
	}
}