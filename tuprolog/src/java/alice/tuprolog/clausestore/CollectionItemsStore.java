package alice.tuprolog.clausestore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import alice.tuprolog.ClauseInfo;
import alice.tuprolog.ClauseStore;
import alice.tuprolog.Prolog;
import alice.tuprolog.Struct;
import alice.tuprolog.Term;
import alice.tuprolog.Var;
import alice.tuprolog.lib.JavaLibrary;

public class CollectionItemsStore implements ClauseStore
{
	private Struct collection;
	private List varList;
	private Term item;
	private Iterator iter;
	private Term current;
	private JavaLibrary lib;
	private Prolog engine;
	
	void nextCompatible()
	{
		current = null;
		while (current == null && iter.hasNext())
		{
			current = lib.registerDynamic(iter.next());
			List v1 = new ArrayList();
			List v2 = new ArrayList();
			if (!item.unify(engine, v1, v2, current))				
				current = null;
			Var.free(v1);
			Var.free(v2);
		}
	}
	
	public CollectionItemsStore(Prolog engine, Collection C, Term item, List varList, JavaLibrary lib)
	{
		iter = C.iterator();
		this.lib = lib;
		this.item = item;
		this.varList = varList;
		this.collection = lib.registerDynamic(C);
		this.engine = engine;		
		nextCompatible();
	}
	
	public void close() { /* nothing to do here */ }
	
	public ClauseInfo fetch()
	{
		if (current == null)
			return null;
		Var.free(varList);
		CollectionItemClause result = new CollectionItemClause(new Struct(
				"collection_item", new Term[] {collection, current} ));
		nextCompatible();
		return result;
	}

	public boolean hasCompatibleClause()
	{
		return current != null;
	}

	public boolean haveAlternatives()
	{
		return current != null;
	}
}