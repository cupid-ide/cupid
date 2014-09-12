package alice.tuprolog.clausestore;

import java.util.AbstractMap;
import java.util.List;

import org.hypergraphdb.HGHandle;
import org.hypergraphdb.HyperGraph;
import org.hypergraphdb.atom.HGAtomRef;
import org.hypergraphdb.util.HGUtils;

import alice.tuprolog.Prolog;
import alice.tuprolog.Struct;
import alice.tuprolog.Term;
import alice.tuprolog.Var;
import alice.tuprolog.lib.InvalidObjectIdException;
import alice.tuprolog.lib.JavaLibrary;

public class HGAtomTerm extends Term
{
	private static final long serialVersionUID = -1;
	
	private HyperGraph graph;
	private HGAtomRef ref;
	
	public HGAtomTerm(HGAtomRef ref, HyperGraph graph)
	{
		this.ref = ref;
		this.graph = graph;
	}
	
	public HGAtomTerm(HGHandle handle, HyperGraph graph)
	{
		this.ref = new HGAtomRef(handle, HGAtomRef.Mode.symbolic);
		this.graph = graph;
	}
	
	public String toString()
	{
		return "hgatom('" + graph.getPersistentHandle(getHandle()) + "')";
	}	
	
	public HGHandle getHandle()
	{
		return ref.getReferent();
	}
	
	public Object deref()
	{
		return graph.get(ref.getReferent());
	}
	
	@Override
	public boolean isEqual(Prolog mediator, Term t)
	{
		t = t.getTerm();
		if (t instanceof HGAtomTerm)
			return getHandle().equals(((HGAtomTerm)t).getHandle());
		else if (t instanceof Struct)
		{
			JavaLibrary jl = (JavaLibrary)
				mediator.getLibraryManager().getLibrary("alice.tuprolog.lib.JavaLibrary");
			Struct s = (Struct)t;
			if (!s.isGround()) // until we start storing prolog term in HGDB, only ground Struct can be handled
				return false;
			Object other = null;
			try
			{
				other = jl.getRegisteredDynamicObject((Struct)t);
				if (other == null)
					other = jl.getRegisteredObject((Struct)t);
				if (other instanceof HGHandle)
					return ((HGHandle)other).equals(this.ref.getReferent());
				Object x = deref();
				if (other != null)				
					return HGUtils.eq(other, x);
				else if (x instanceof String)
					return x.equals(alice.util.Tools.removeApices(s.toString()));
				else
					return false;
			}
			catch (InvalidObjectIdException ex)
			{
				return false;
			}			
		}
		else if (t instanceof alice.tuprolog.Number)
		{
			Object x = deref();
			if (x instanceof java.lang.Number)
				return ((java.lang.Number)x).doubleValue() == ((alice.tuprolog.Number)t).doubleValue();
			else 
				return false;
		}
		return false;
	}
	
	@Override
	public boolean unify(Prolog mediator, List varsUnifiedArg1, List varsUnifiedArg2, Term t)
	{
		t = t.getTerm();
		if (t instanceof Var)
			return t.unify(mediator, varsUnifiedArg1, varsUnifiedArg2, this);
		else
			return isEqual(mediator, t);
	}
	
	@Override
	public Term copy(AbstractMap map, int idExecCtx)
	{
		return this;
	}

	@Override
	public Term copy(AbstractMap map, AbstractMap substMap)
	{
		return this;
	}


	@Override
	public long resolveTerm(long count)
	{
		return count;
	}
	
	@Override
	public void free()
	{
	}

	@Override
	public Term getTerm()
	{
		return this;
	}

	@Override
	public boolean isAtom()
	{
		return false;
	}

	@Override
	public boolean isAtomic()
	{
		return true;
	}

	@Override
	public boolean isCompound()
	{
		return false;
	}

	@Override
	public boolean isEmptyList()
	{
		return false;
	}

	@Override
	public boolean isGreater(Prolog mediator, Term t)
	{
		return false;
	}

	@Override
	public boolean isGround()
	{
		return true;
	}

	@Override
	public boolean isList()
	{
		return false;
	}

	@Override
	public boolean isNumber()
	{
		throw new UnsupportedOperationException("This method is deprecated.");		
	}

	@Override
	public boolean isStruct()
	{
		throw new UnsupportedOperationException("This method is deprecated.");
	}

	@Override
	public boolean isVar()
	{
		throw new UnsupportedOperationException("This method is deprecated.");
	}
}