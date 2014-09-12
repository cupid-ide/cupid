package alice.tuprolog.clausestore;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.hypergraphdb.HGHandle;
import org.hypergraphdb.HGQuery.hg;
import org.hypergraphdb.HGSearchResult;
import org.hypergraphdb.HyperGraph;
import org.hypergraphdb.query.*;

import alice.tuprolog.ClauseStore;
import alice.tuprolog.ClauseStoreFactory;
import alice.tuprolog.Prolog;
import alice.tuprolog.Struct;
import alice.tuprolog.Term;
import alice.tuprolog.lib.JavaLibrary;

public class HyperGraphStoreFactory implements ClauseStoreFactory
{
	private HyperGraph graph;
	private Map<String, HGQueryCondition> map = new HashMap<String, HGQueryCondition>();
	
	private HGHandle getTermHandle(JavaLibrary jl, Term t)
	{
		HGHandle h = null;
		t = t.getTerm();
		if (t instanceof HGAtomTerm)
			h = ((HGAtomTerm)t).getHandle();
		else if (t instanceof Struct)
		{
			Struct s = (Struct)t;
			if (!s.isGround()) return null;
			Object x = null;
			try
			{
				if (s.getName().startsWith(jl.getDynamicObjectIdPrefix()))
					x = jl.getRegisteredDynamicObject(s);
				else
					x = jl.getRegisteredObject(s);
			}
			catch (Throwable ex)
			{
			}
				
			if (x instanceof HGHandle)
				h = (HGHandle)x;
			else if (x != null)
			{
				h = graph.getHandle(x);
				if (h == null)
					throw new RuntimeException("Expected an atom for " + t + " in HyperGraph query.");
			}
		}
		return h;
	}
	
	private HGSearchResult<?> query(HGQueryCondition cond, Prolog prolog, Struct struct)
	{
		HGHandle [] atoms = new HGHandle[struct.getArity()];
		ArrayList<HGQueryCondition> atomConditions = new ArrayList<HGQueryCondition>(struct.getArity());
		JavaLibrary jl = (JavaLibrary)prolog.getLibraryManager().getLibrary("alice.tuprolog.lib.JavaLibrary");		
		for (int i = 0; i < struct.getArity(); i++)
			if ( (atoms[i] = getTermHandle(jl, struct.getArg(i))) == null)
				atoms[i] = graph.getHandleFactory().anyHandle();
			else
				atomConditions.add(hg.incident(atoms[i]));
		if (!atomConditions.isEmpty())
		{
			And and;
			if (cond instanceof And)
				and = (And)cond;
			else
			{
				and = new And(cond);
			}
			for (HGQueryCondition c : atomConditions)
				and.add(c);
			and.add(hg.orderedLink(atoms));
			cond = and;
		}
		return graph.find(cond);
	}
	
	public HyperGraphStoreFactory(HyperGraph graph)
	{
		this.graph = graph;
	}
	
	public HyperGraph getGraph()
	{
		return graph;
	}
	
	public Map<String, HGQueryCondition> getPredicateMapping()
	{
		return map;
	}
	
	public ClauseStore buildClause(Prolog prolog, Term goal, List<?> varList)
	{
		if (! (goal instanceof Struct))
			return null;
		Struct struct = (Struct)goal;
		HGQueryCondition cond = map.get(struct.getPredicateIndicator());
		if (cond != null)
		{
			HGSearchResult<?>  rs = query(cond, prolog, struct);
			if (rs == null || !rs.hasNext())
				return null;
			return new HyperGraphClauseStore(prolog, 
										     graph, 
										     struct.getName(), 
										     struct.getArity(), 
										     rs);
		}
		return null;
	}
}