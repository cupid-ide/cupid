package alice.tuprolog.clausestore;

import java.util.List;

import alice.tuprolog.ClauseStore;
import alice.tuprolog.ClauseStoreFactory;
import alice.tuprolog.Prolog;
import alice.tuprolog.Struct;
import alice.tuprolog.Term;
import alice.tuprolog.lib.JavaLibrary;

public class JavaCollectionStoreFactory implements ClauseStoreFactory
{
	public ClauseStore buildClause(Prolog prolog, Term goal, List<?> varList)
	{
		if (goal instanceof Struct)
		{
			Struct s = (Struct)goal;
			if (s.getName().equals("collection_item") && s.getArity() == 2)
			{
				try
				{
					JavaLibrary jl = (JavaLibrary)prolog.getLibraryManager().getLibrary("alice.tuprolog.lib.JavaLibrary");
					Term collectionTerm = s.getArg(0).getTerm();
					Object obj = jl.getRegisteredDynamicObject((Struct)collectionTerm);
					if (obj instanceof java.util.Collection)
						return new CollectionItemsStore(prolog, 
													    (java.util.Collection<?>)obj, 
													    s.getArg(1), 
													    varList, 
													    jl);				
				}
				catch (Exception ex) { throw new RuntimeException(ex); }
			}
		}
		return null;
	}
}
