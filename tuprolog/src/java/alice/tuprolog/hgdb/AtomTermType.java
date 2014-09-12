package alice.tuprolog.hgdb;

import org.hypergraphdb.HGHandle;
import org.hypergraphdb.HGPersistentHandle;
import org.hypergraphdb.IncidenceSetRef;
import org.hypergraphdb.LazyRef;
import org.hypergraphdb.atom.HGAtomRef;
import org.hypergraphdb.handle.UUIDHandleFactory;
import org.hypergraphdb.type.HGAtomType;
import org.hypergraphdb.type.HGAtomTypeBase;

import alice.tuprolog.clausestore.HGAtomTerm;

public class AtomTermType extends HGAtomTypeBase
{
	public static final HGPersistentHandle HANDLE = 
		UUIDHandleFactory.I.makeHandle("6dfa1b96-df2d-4c53-bcd6-0f4eb9146a46");
	
	public Object make(HGPersistentHandle handle,
					   LazyRef<HGHandle[]> targetSet, 
					   IncidenceSetRef incidenceSet)
	{
		HGAtomType type = graph.getTypeSystem().getAtomType(HGAtomRef.class);		
		return new HGAtomTerm((HGAtomRef)type.make(handle, targetSet, incidenceSet), graph);
	}

	public void release(HGPersistentHandle handle)
	{
		HGAtomType type = graph.getTypeSystem().getAtomType(HGAtomRef.class);
		type.release(handle);
	}

	public HGPersistentHandle store(Object instance)
	{
		HGAtomType type = graph.getTypeSystem().getAtomType(HGAtomRef.class);
		return type.store(instance);
	}
}