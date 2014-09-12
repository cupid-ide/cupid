package alice.tuprolog;

import java.util.LinkedList;
import java.util.List;

public class ClauseStoreManager implements ClauseStoreFactory
{
	private List<ClauseStoreFactory> factories = new LinkedList<ClauseStoreFactory>();
	
	public List<ClauseStoreFactory> getFactories()
	{
		return factories;
	}
	
	public ClauseStore buildClause(Prolog prolog, Term goal, List<?> varList)
	{
		for (ClauseStoreFactory factory : factories)
		{
			ClauseStore result = factory.buildClause(prolog, goal, varList);
			if (result != null)
				return result;
		}
		return DefaultClauseStore.build(prolog, goal, varList, prolog.getTheoryManager().find(goal));
	}
}