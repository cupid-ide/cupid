package alice.tuprolog.clausestore;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import alice.tuprolog.ClauseStore;
import alice.tuprolog.ClauseStoreFactory;
import alice.tuprolog.Prolog;
import alice.tuprolog.Struct;
import alice.tuprolog.Term;

public class H2ClauseStoreFactory implements ClauseStoreFactory
{
	
	private Connection conn;
	private String schema;
	private Map<String, Boolean> coversPredicateMap;   //e.g.,   "tableName/arity" --> true/false 
	//private Map<String, H2ClauseStore> cache;
	
	public H2ClauseStoreFactory(Connection conn, String schema) {
		this.conn = conn;
		this.schema = schema;
		this.coversPredicateMap = new HashMap<String, Boolean>();
		//this.cache = new HashMap<String, H2ClauseStore>();		
	}
	
	public ClauseStore buildClause(Prolog prolog, Term goal, List<?> varList)
	{
		
		if (goal instanceof Struct)
		{
			Struct s = (Struct)goal;

			//cannot cache because goal may be different
			/*
		    H2ClauseStore store;
			store = cache.get(s.getName());
			if (store != null) {
				store.reset();
				return store;
			}
			else if (coversPredicate(s.getName(), s.getArity())) 
			{				
				store = new H2ClauseStore(prolog, conn, s);
				cache.put(s.getName(), store);
				return store;
			}
			*/
			if (coversPredicate(s.getName(), s.getArity())) 
			{				
				return new H2ClauseStore(prolog, conn, s);			
			}
		}
		return null;
	}
	
	protected boolean coversPredicate(String predicate, int arity) {
		String predicateKey = predicateKey(predicate, arity);
		if (coversPredicateMap.containsKey(predicateKey)) {
			return coversPredicateMap.get(predicateKey);
		}
		else {
			
			//assume no
			coversPredicateMap.put(predicateKey, false);
			
			//check metadata
			ResultSet rs;
			try {
				//String[] TABLE_AND_VIEW_TYPES = {"TABLE","VIEW"};
				rs = conn.getMetaData().getTables(null, schema.toUpperCase(), predicate.toUpperCase(), null);
				if (rs.next()) {
					rs.close();
					
					rs = conn.getMetaData().getColumns(null, schema.toUpperCase(), predicate.toUpperCase(), null);
					
					//List<String> columnNames = new ArrayList<String>();
					int colCount;
					for (colCount = 0; rs.next(); colCount++) {
						//columnNames.add(rs.getString(4));
					}
					
					if (colCount == arity) {
						coversPredicateMap.put(predicateKey, true);
					}
					rs.close();

				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return coversPredicateMap.get(predicateKey);
		}
	}
	
	protected String predicateKey(String predicate, int arity) {
		return predicate + "/" + arity;
	}
	
	
}