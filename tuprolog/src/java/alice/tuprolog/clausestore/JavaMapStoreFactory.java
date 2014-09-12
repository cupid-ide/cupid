package alice.tuprolog.clausestore;

import java.util.List;

import alice.tuprolog.ClauseStore;
import alice.tuprolog.ClauseStoreFactory;
import alice.tuprolog.Prolog;
import alice.tuprolog.Struct;
import alice.tuprolog.Term;
import alice.tuprolog.lib.JavaLibrary;

public class JavaMapStoreFactory implements ClauseStoreFactory
{
	public ClauseStore buildClause(Prolog prolog, Term goal, List<?> varList)
	{
		if (goal instanceof Struct)
		{
			Struct s = (Struct)goal;
			if (s.getName().equals("map_entry") && s.getArity() == 3)
			{
				try
				{
					JavaLibrary jl = (JavaLibrary)prolog.getLibraryManager().getLibrary("alice.tuprolog.lib.JavaLibrary");
					Term mapTerm = s.getArg(0).getTerm();
					Object obj = jl.getRegisteredDynamicObject((Struct)mapTerm);
					if (obj instanceof java.util.Map)
						return new MapEntriesStore(prolog, (java.util.Map<?,?>)obj, s.getArg(1), s.getArg(2), varList, jl);					
				}
				catch (Exception ex) 
				{ 
					throw new RuntimeException(ex); 
				}				
			}
		}
		return null;
	}
}