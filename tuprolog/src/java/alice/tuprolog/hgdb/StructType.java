package alice.tuprolog.hgdb;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.hypergraphdb.HGHandle;
import org.hypergraphdb.HGPersistentHandle;
import org.hypergraphdb.HGValueLink;
import org.hypergraphdb.IncidenceSetRef;
import org.hypergraphdb.LazyRef;
import org.hypergraphdb.handle.UUIDHandleFactory;
import org.hypergraphdb.type.HGAtomType;
import org.hypergraphdb.type.HGAtomTypeBase;
import org.hypergraphdb.type.HGCompositeType;
import org.hypergraphdb.type.HGProjection;
import org.hypergraphdb.util.HGUtils;
import alice.tuprolog.Struct;
import alice.tuprolog.Term;
import alice.tuprolog.clausestore.HGAtomTerm;

public class StructType extends HGAtomTypeBase implements HGCompositeType
{
	public static final HGPersistentHandle HANDLE = UUIDHandleFactory.I
			.makeHandle("53102b6a-2345-470d-9333-1218ddd6f248");

	private static List<String> DIMENSIONS = Arrays.asList("name",
			"predicateIndicator");

	public Object make(HGPersistentHandle handle,
			LazyRef<HGHandle[]> targetSet, IncidenceSetRef incidenceSet)
	{
		HGAtomType stringType = graph.getTypeSystem().getAtomType(String.class);
		String functor_name = (String) stringType.make(handle, null, null);
		HGHandle[] ts = targetSet == null ? null : targetSet.deref();
		if (ts == null)
			return new Struct(functor_name);
		Term[] terms = new Term[ts.length];
		for (int i = 0; i < ts.length; i++)
		{
			Object x = graph.get(ts[i]);
			if (x instanceof HGValueLink)
			{
				x = ((HGValueLink)x).getValue();
			}
			if (x instanceof Term)
				terms[i] = (Term) x;
			else
				terms[i] = new HGAtomTerm(ts[i], graph);
		}
		return new Struct(functor_name, terms);
	}

	public void release(HGPersistentHandle handle)
	{
		HGAtomType stringType = graph.getTypeSystem().getAtomType(String.class);
		stringType.release(handle);
	}

	public HGPersistentHandle store(Object instance)
	{
		Struct s = (Struct) instance;
		HGAtomType stringType = graph.getTypeSystem().getAtomType(String.class);
		return stringType.store(s.getName());
	}

	public boolean subsumes(Object general, Object specific)
	{
		return HGUtils.eq(general, specific);
	}

	public Iterator<String> getDimensionNames()
	{
		return DIMENSIONS.iterator();
	}

	public HGProjection getProjection(String dimensionName)
	{
		if ("name".equals(dimensionName))
			return new HGProjection()
			{
				public int[] getLayoutPath()
				{
					// TODO Auto-generated method stub
					return null;
				}

				public String getName()
				{
					return "name";
				}

				public HGHandle getType()
				{
					return graph.getTypeSystem().getTypeHandle(String.class);
				}

				public void inject(Object atomValue, Object value)
				{	
					throw new UnsupportedOperationException();
				}

				public Object project(Object x)
				{
					if (x instanceof HGValueLink)
					{
						x = ((HGValueLink)x).getValue();
					}					
					return ((Struct)x).getName();
				}
			};
		else if ("predicateIndicator".equals(dimensionName))
			return new HGProjection()
			{
				public int[] getLayoutPath()
				{
					return null;
				}

				public String getName()
				{
					return "predicateIndicator";
				}

				public HGHandle getType()
				{
					return graph.getTypeSystem().getTypeHandle(String.class);
				}

				public void inject(Object atomValue, Object value)
				{
					throw new UnsupportedOperationException();
				}

				public Object project(Object x)
				{
					if (x instanceof HGValueLink)
					{
						x = ((HGValueLink)x).getValue();
					}					
					return ((Struct)x).getName();
					
				}
			};
		else
			throw new IllegalArgumentException();
	}
}