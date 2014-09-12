package alice.tuprolog.hgdb;

import org.hypergraphdb.HGHandle;
import org.hypergraphdb.HGPersistentHandle;
import org.hypergraphdb.IncidenceSetRef;
import org.hypergraphdb.LazyRef;
import org.hypergraphdb.handle.UUIDHandleFactory;
import org.hypergraphdb.type.HGAtomType;
import org.hypergraphdb.type.HGAtomTypeBase;

public class PrologLongType extends HGAtomTypeBase
{
	public static final HGPersistentHandle HANDLE = 
		UUIDHandleFactory.I.makeHandle("61c26fee-76ec-4a8a-9147-6e4dd3e4fabd");
	
	public Object make(HGPersistentHandle handle,
			LazyRef<HGHandle[]> targetSet, IncidenceSetRef incidenceSet)
	{
		HGAtomType type = graph.getTypeSystem().getAtomType(Long.class);
		return new alice.tuprolog.Long((Long)type.make(handle, null, null));
	}

	public void release(HGPersistentHandle handle)
	{
		HGAtomType type = graph.getTypeSystem().getAtomType(Long.class);
		type.release(handle);
	}

	public HGPersistentHandle store(Object instance)
	{
		HGAtomType type = graph.getTypeSystem().getAtomType(Long.class);
		return type.store(((alice.tuprolog.Long)instance).longValue());
	}	
}