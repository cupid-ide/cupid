package alice.tuprolog.hgdb;

import org.hypergraphdb.HGHandle;
import org.hypergraphdb.HyperGraph;
import org.hypergraphdb.HGQuery.hg;
import org.hypergraphdb.query.HGQueryCondition;

import alice.tuprolog.Library;
import alice.tuprolog.Prolog;
import alice.tuprolog.Struct;
import alice.tuprolog.Term;
import alice.tuprolog.Var;
import alice.tuprolog.clausestore.HGAtomTerm;
import alice.tuprolog.clausestore.HyperGraphStoreFactory;
import alice.tuprolog.lib.JavaLibrary;

public class HGPrologLibrary extends Library
{
	private static final long serialVersionUID = -1;

	private HyperGraphStoreFactory clauseFactory = null;

	private JavaLibrary javaLib()
	{
		return (JavaLibrary)getEngine().getLibraryManager().getLibrary(JavaLibrary.class.getName());
	}
	
	private Object termToHGThing(Object x) throws Exception
	{
		if (x instanceof Term)
		{
			x = ((Term)x).getTerm();
			if (x instanceof Struct)
				x = javaLib().getRegisteredDynamicObject((Struct)x);
			else if (x instanceof HGAtomTerm)
				x = ((HGAtomTerm)x).getHandle(); 
		}
		return x;
	}
	
	private HGQueryCondition termToCond(Term condition) throws Exception
	{
		condition = condition.getTerm();
		if (! (condition instanceof Struct))
			throw new IllegalArgumentException("not a functor " + condition);
		Struct s = (Struct)condition;
		String ind = s.getPredicateIndicator();
		if (ind.equals("type/1"))
		{
			Object x = termToHGThing(s.getArg(0));
			if (x instanceof HGHandle)
				return hg.type((HGHandle)x);
			else if (x instanceof Class<?>)
				return hg.type((Class<?>)x);
			else if (x instanceof String)
			{
				try { return hg.type(Class.forName(x.toString())); }
				catch (Throwable t) { }
			}
			throw new IllegalArgumentException("argument of type must be a handle or a class " + condition);
		}
		if (ind.equals("typePlus/1"))
		{
			Object x = termToHGThing(s.getArg(0));
			if (x instanceof HGHandle)
				return hg.typePlus((HGHandle)x);
			else if (x instanceof Class<?>)
				return hg.typePlus((Class<?>)x);
			else if (x instanceof String)
			{
				try { return hg.type(Class.forName(x.toString())); }
				catch (Throwable t) { }
			}			
			throw new IllegalArgumentException("argument of type must be a handle or a class " + condition);
		}
		else if (ind.equals("incident/1"))
		{
			Object x = termToHGThing(s.getArg(0));
			if (x instanceof HGHandle)
				return hg.incident((HGHandle)x);
			else
				throw new IllegalArgumentException("argument of incident must be a handle " + x); 
		}
		else if (ind.equals("target/1"))
		{
			Object x = termToHGThing(s.getArg(0));
			if (x instanceof HGHandle)
				return hg.target((HGHandle)x);
			else
				throw new IllegalArgumentException("argument of incident must be a handle " + x); 
		}
		else if (s.getName().equals("and"))
		{
			HGQueryCondition [] params = new HGQueryCondition[s.getArity()];
			for (int i = 0; i < params.length; i++)
				params[i] = termToCond(s.getArg(i));
			return hg.and(params);
		}
		else if (s.getName().equals("or"))
		{
			HGQueryCondition [] params = new HGQueryCondition[s.getArity()];
			for (int i = 0; i < params.length; i++)
				params[i] = termToCond(s.getArg(i));
			return hg.or(params);
		}
		else if (s.getName().equals("link"))
		{
			HGHandle [] params = new HGHandle[s.getArity()];
			for (int i = 0; i < params.length; i++)
			{
				Object x = termToHGThing(s.getArg(0));
				if (x instanceof HGHandle)				
					params[i] = (HGHandle)x;
				else
					params[i] = clauseFactory.getGraph().getHandle(x);
				if (params[i] == null)
					throw new IllegalArgumentException("argument of link must be a handle " + x);
			}
			return hg.link(params);
		}
		else if (s.getName().equals("orderedLink"))
		{
			HGHandle [] params = new HGHandle[s.getArity()];
			for (int i = 0; i < params.length; i++)
			{
				Object x = termToHGThing(s.getArg(0));
				if (x instanceof HGHandle)				
					params[i] = (HGHandle)x;
				else
					params[i] = clauseFactory.getGraph().getHandle(x);
				if (params[i] == null)
					throw new IllegalArgumentException("argument of link must be a handle " + x);
			}
			return hg.orderedLink(params);
		}		
		else
			throw new IllegalArgumentException("unsupported condition functor:" + s.getName());
	}
	
	public static HGPrologLibrary attach(HyperGraph graph, Prolog prolog) 
	{
		HGPrologLibrary lib = (HGPrologLibrary)prolog.getLibrary("HyperGraphDB");
		if (lib == null)
		{
			lib = new HGPrologLibrary();
			lib.clauseFactory = new HyperGraphStoreFactory(graph);
			try { prolog.getLibraryManager().loadLibrary(lib); }
			catch (Throwable t) { throw new RuntimeException(t); }
			prolog.getEngineManager().getClauseStoreManager().getFactories().add(lib.clauseFactory);
		}
		return lib;
	}
	
	public String getName()
	{
		return "HyperGraphDB";
	}
	
	public HyperGraphStoreFactory getClauseFactory()
	{
		return clauseFactory;
	}
	
	/**
	 * <p>
	 * Bind a Prolog clause (a Struct spec in the form of a name and arity)
	 * to a HyperGraphDB condition.
	 * </p>
	 * 
	 * @param condition
	 * @param clause
	 * @return
	 */
	public boolean hg_bind_2(Term condition, Term clause)
	{
		clause = clause.getTerm();
		if (! (clause instanceof Struct))
			return false;
		condition = condition.getTerm();
		try
		{
			HGQueryCondition c = (HGQueryCondition)javaLib().getRegisteredDynamicObject((Struct)condition);
			clauseFactory.getPredicateMapping().put(((Struct)clause).getPredicateIndicator(), c);
			return true;
		}
		catch (Throwable t)
		{
			return false;
		}
	}
	
	/**
	 * <p>
	 * Remove a clause binding from the HyperGraphDB clause store.
	 * </p>
	 * 
	 * @param clause
	 * @return
	 */
	public boolean hg_unbind_1(Term clause)
	{
		try
		{
			clauseFactory.getPredicateMapping().remove(((Struct)clause).getPredicateIndicator());
			return true;
		}
		catch (Throwable t)
		{
			return false;
		}
	}
		
	public Term hg_clause_condition_1(Term clause)
	{
		Term v = new Var();
		if (hg_clause_condition_2(clause, v))
			return v;
		else
			return Struct.EMPTY_LIST;
	}
	
	public boolean hg_clause_condition_2(Term clause, Term id)
	{
		clause = clause.getTerm();
		if (! (clause instanceof Struct))
			return false;
		Struct s = (Struct)clause;
		HGQueryCondition cond = clauseFactory.getPredicateMapping().get(s.getPredicateIndicator());
		if (cond == null)
			return false;
		else
		{			
			return javaLib().bindObject(id, cond, true);
		}
	}
	
	public Term hg_find_all_1(Term condition)
	{		
		try
		{
			return javaLib().registerDynamic(hg.findAll(clauseFactory.getGraph(), termToCond(condition)));
		}
		catch (Throwable ex)
		{
			throw new RuntimeException("hg_find_all called with a term that does not represent a proper condition: " + ex.toString(), ex);			
		}
	}
	
	public Term hg_count_1(Term clause)
	{
		clause = clause.getTerm();
		if (clause instanceof Struct)
		{
			HGQueryCondition cond = clauseFactory.getPredicateMapping().get(((Struct)clause).getPredicateIndicator());
			if  (cond != null)
				return new alice.tuprolog.Long(hg.count(clauseFactory.getGraph(), cond));
		}
		try
		{
			return new alice.tuprolog.Long(hg.count(clauseFactory.getGraph(), termToCond(clause)));
		}
		catch (Throwable ex)
		{
			throw new RuntimeException("hg_count called with a term that does not represent a proper condition: " + ex.toString());			
		}
	}
	
	/**
	 * Return true if the term is a HyperGraph atom and false otherwise.
	 * 
	 * @param t
	 * @return
	 */
	public boolean hg_atom_1(Term t)
	{
		t = t.getTerm();
		return t instanceof HGAtomTerm;
	}
}