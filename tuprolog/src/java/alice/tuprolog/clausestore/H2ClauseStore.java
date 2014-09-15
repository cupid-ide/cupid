package alice.tuprolog.clausestore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import alice.tuprolog.ClauseInfo;
import alice.tuprolog.ClauseStore;
import alice.tuprolog.InvalidTermException;
import alice.tuprolog.Prolog;
import alice.tuprolog.Struct;
import alice.tuprolog.Term;
import alice.tuprolog.Var;
import alice.tuprolog.clausestore.FactClauseInfo;


public class H2ClauseStore implements ClauseStore
{

	private Struct goal;
	private String predicate;
	private Prolog engine;
	private ResultSet resultSet = null;
	private int resultSetColCount = 0;
	private Struct nextResult = null;
	
	
	public H2ClauseStore(Prolog engine, Connection conn, Struct goal) {
		
		this.engine = engine;
		this.goal = goal;
		this.predicate = goal.getName();

		//could optimize here by adding condition to WHERE clause
		/*
		for (int i = 0; i < goal.getArity(); i++) {
			Term t = goal.getTerm(i);
			
			if (t instanceof Var) {
				Var v = (Var) t;
				System.out.println("v = " + v + " isBound? : " + v.isBound());
			}
			else {
				System.out.println("t = " + t + " isGround? : " + t.isGround());
			}
			
		}
		*/
		
		try {
			PreparedStatement stmt = 
					conn.prepareStatement("SELECT * FROM " + predicate + ";", 
							ResultSet.TYPE_SCROLL_INSENSITIVE, 
							ResultSet.CONCUR_READ_ONLY);
			resultSet = stmt.executeQuery();
			resultSetColCount = resultSet.getMetaData().getColumnCount();
			fetchInternal();
		} catch (SQLException e) {
			e.printStackTrace();
			resultSet = null;
		}
		
	}
	
	public void reset() {
		if (resultSet != null) {
			try {
				resultSet.beforeFirst();
				fetchInternal();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void close() { 	
		/*
		try {
			if (resultSet != null && !resultSet.isClosed()) {
				resultSet.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		*/	
	}
	
	private void fetchInternal() {
		
		try {
		
			nextResult: while (resultSet.next()) {
			
				Term[] terms = new Term[resultSetColCount];
				for (int i = 1; i <= resultSetColCount; i++) {
					terms[i-1] = Term.createTerm(resultSet.getString(i));
					
					Term toUnify = goal.getTerm(i-1);
					
					List v1 = new ArrayList();
					List v2 = new ArrayList();
					
					boolean unified = toUnify.unify(engine, v1, v2, terms[i-1]);
					Var.free(v1);
					Var.free(v2);
					
					if (!unified) {
						continue nextResult;
					}
				}
				
				//everything unified
				nextResult = new Struct(predicate, terms);
				return;
				
			}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InvalidTermException e) {
			e.printStackTrace();
		}
		
		
		nextResult = null;
		
	}
	
	public ClauseInfo fetch()
	{	
		
		if (nextResult != null) {
			FactClauseInfo result = new FactClauseInfo(nextResult);
			fetchInternal();  //prepare for next
			return result;
		}
		
		return null;
		
	}

	public boolean hasCompatibleClause()
	{
		return nextResult != null;
	}

	public boolean haveAlternatives()
	{
		return nextResult != null;
	}
}
