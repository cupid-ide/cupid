package alice.tuprolog.hgdb;

import org.hypergraphdb.HGHandle;
import org.hypergraphdb.HGPersistentHandle;
import org.hypergraphdb.IncidenceSetRef;
import org.hypergraphdb.LazyRef;
import org.hypergraphdb.handle.UUIDHandleFactory;
import org.hypergraphdb.type.HGAtomType;
import org.hypergraphdb.type.HGAtomTypeBase;

public class PrologIntType extends HGAtomTypeBase
{
	public static final HGPersistentHandle HANDLE = 
		UUIDHandleFactory.I.makeHandle("8a4214b4-ae99-4a45-909e-3acffb176207");
	
	public Object make(HGPersistentHandle handle,
			LazyRef<HGHandle[]> targetSet, IncidenceSetRef incidenceSet)
	{
		HGAtomType type = graph.getTypeSystem().getAtomType(Integer.class);
		return new alice.tuprolog.Int((Integer)type.make(handle, null, null));
	}

	public void release(HGPersistentHandle handle)
	{
		HGAtomType type = graph.getTypeSystem().getAtomType(Integer.class);
		type.release(handle);
	}

	public HGPersistentHandle store(Object instance)
	{
		HGAtomType type = graph.getTypeSystem().getAtomType(Integer.class);
		return type.store(((alice.tuprolog.Int)instance).intValue());
	}	
}