package alice.tuprolog;

import java.util.List;

public interface ClauseStoreFactory
{
	public ClauseStore buildClause(Prolog prolog, Term goal, List<?> varList);
}