package alice.tuprolog.clausestore;

import org.hypergraphdb.HGHandle;
import org.hypergraphdb.HGLink;
import org.hypergraphdb.HGSearchResult;
import org.hypergraphdb.HyperGraph;

import alice.tuprolog.ClauseInfo;
import alice.tuprolog.ClauseStore;
import alice.tuprolog.Prolog;
import alice.tuprolog.Struct;
import alice.tuprolog.Term;

public class HyperGraphClauseStore implements ClauseStore
{
	private Prolog engine;
	private HyperGraph graph;
	private String predicateName;
	private int arity;
	private HGSearchResult<?> rs = null;
	
	public HyperGraphClauseStore(Prolog engine, 
								 HyperGraph graph, 
								 String predicateName, 
								 int arity, 
								 HGSearchResult<?> rs)
	{
		this.engine = engine;
		this.predicateName = predicateName;
		this.arity = arity;
		this.graph = graph;
		this.rs = rs;		
	}	
	
	public void close() 
	{  
		try { rs.close(); }
		catch (Throwable t) { t.printStackTrace(System.err); }
	}
	
	public Prolog getProlog()
	{
		return engine;
	}
	
	public HyperGraph getGraph()
	{
		return graph;
	}
	
	public String getPredicateName()
	{
		return predicateName;
	}
	
	public int getArity()
	{
		return arity;
	}
	
	public ClauseInfo fetch()
	{
		if (!rs.hasNext())
			return null;
		else
		{
			Object curr = rs.next();
			// A bit of an ad hoc decision: if the arity is > 1, we expect the atom
			// to be a link we use it as the predicate
			// and create a Struct with its target set as arguments. Otherwise, we
			// use the atom itself (be it a link or not) as the sole argument value
			// of the predicate Struct.
			if (arity > 1)
			{
				HGLink l = (HGLink)
					(curr instanceof HGHandle ? graph.get((HGHandle)curr) : curr);
				return new HGAtomClauseInfo(this, l);
			}
			else
			{ 
				return new FactClauseInfo(new Struct(predicateName, toTerm((HGHandle)curr)));
			}
		}
	}

	public boolean hasCompatibleClause()
	{
		return rs.hasNext();
	}

	public boolean haveAlternatives()
	{
		return rs.hasNext();
	}
	
	public Term toTerm(HGHandle h)
	{
		return new HGAtomTerm(h, graph);
	}
}