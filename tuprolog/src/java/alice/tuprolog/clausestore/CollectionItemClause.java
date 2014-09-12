package alice.tuprolog.clausestore;

import alice.tuprolog.ClauseInfo;
import alice.tuprolog.Struct;
import alice.tuprolog.SubGoalTree;

public class CollectionItemClause implements ClauseInfo
{
	private Object x;
	private SubGoalTree body = new SubGoalTree();
	private Struct head;
	
	public CollectionItemClause(Struct head)
	{
	//	this.x = x;
		this.head = head;
	}
	
	public SubGoalTree getBody()
	{
		return body;
	}

	public SubGoalTree getBodyCopy()
	{
		return body;
	}

	public Struct getClause()
	{
		return head;
	}

	public Struct getHead()
	{
		return head;
	}

	public Struct getHeadCopy()
	{
		return head;
	}

	public String getLibName()
	{
		return null;
	}

	public void performCopy(int idExecCtx)
	{
		// nothing to do...
	}
}