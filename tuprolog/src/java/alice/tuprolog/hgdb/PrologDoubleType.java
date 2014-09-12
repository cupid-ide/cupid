package alice.tuprolog.hgdb;

import org.hypergraphdb.HGHandle;
import org.hypergraphdb.HGPersistentHandle;
import org.hypergraphdb.IncidenceSetRef;
import org.hypergraphdb.LazyRef;
import org.hypergraphdb.handle.UUIDHandleFactory;
import org.hypergraphdb.type.HGAtomType;
import org.hypergraphdb.type.HGAtomTypeBase;

public class PrologDoubleType extends HGAtomTypeBase
{
	public static final HGPersistentHandle HANDLE = 
		UUIDHandleFactory.I.makeHandle("33d5df23-8c90-4e70-ab4b-163c62947017");
	
	public Object make(HGPersistentHandle handle,
			LazyRef<HGHandle[]> targetSet, IncidenceSetRef incidenceSet)
	{
		HGAtomType type = graph.getTypeSystem().getAtomType(Double.class);
		return new alice.tuprolog.Double((Double)type.make(handle, null, null));
	}

	public void release(HGPersistentHandle handle)
	{
		HGAtomType type = graph.getTypeSystem().getAtomType(Double.class);
		type.release(handle);
	}

	public HGPersistentHandle store(Object instance)
	{
		HGAtomType type = graph.getTypeSystem().getAtomType(Double.class);
		return type.store(((alice.tuprolog.Double)instance).doubleValue());
	}
}
