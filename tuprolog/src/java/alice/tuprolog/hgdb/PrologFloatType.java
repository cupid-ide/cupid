package alice.tuprolog.hgdb;

import org.hypergraphdb.HGHandle;
import org.hypergraphdb.HGPersistentHandle;
import org.hypergraphdb.IncidenceSetRef;
import org.hypergraphdb.LazyRef;
import org.hypergraphdb.handle.UUIDHandleFactory;
import org.hypergraphdb.type.HGAtomType;
import org.hypergraphdb.type.HGAtomTypeBase;

public class PrologFloatType extends HGAtomTypeBase
{
	public static final HGPersistentHandle HANDLE = 
		UUIDHandleFactory.I.makeHandle("26a27f2f-bafa-4fb9-861f-68a37e5c0275");
	
	public Object make(HGPersistentHandle handle,
			LazyRef<HGHandle[]> targetSet, IncidenceSetRef incidenceSet)
	{
		HGAtomType type = graph.getTypeSystem().getAtomType(Float.class);
		return new alice.tuprolog.Float((Float)type.make(handle, null, null));
	}

	public void release(HGPersistentHandle handle)
	{
		HGAtomType type = graph.getTypeSystem().getAtomType(Float.class);
		type.release(handle);
	}

	public HGPersistentHandle store(Object instance)
	{
		HGAtomType type = graph.getTypeSystem().getAtomType(Float.class);
		return type.store(((alice.tuprolog.Float)instance).floatValue());
	}		
}
