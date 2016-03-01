package org.earthsystemmodeling.cupid.codedb;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.photran.internal.core.parser.ASTModuleNode;
import org.eclipse.photran.internal.core.parser.ASTNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineParNode;
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode;

@SuppressWarnings("restriction")
public class VPGQuery {

	/*
	public static Module Module() {
		return new Module();
	}
	
	public static Subroutine Subroutine() {
		return new Subroutine();
	}
	
		
	static class Module {
		
		List<String> usesModules = new ArrayList<String>();
		List<Subroutine> containsSubroutine = new ArrayList<Subroutine>();
		
		public Module uses(String usesModule) {
			usesModules.add(usesModule);
			return this;
		}
		
		public Module contains(Subroutine subroutine) {
			containsSubroutine.add(subroutine);
			return this;
		}
		
		public ASTModuleNode findFirst() {
			return null;
		}
		
		public List<ASTModuleNode> findAll() {
			return null;
		}
		
	}
	
	static class Subroutine {
		
		String name;
		
		public Subroutine named(String name) {
			this.name = name;
			return this;
		}
		
	}
	*/
	
	public static Query Query(Class<? extends ASTNode> returnType) {
		return new Query(returnType);
	}
	
	static class Query {
		
		List<Restriction> restrictions = new ArrayList<Restriction>();
		
		public Query(Class<? extends ASTNode> returnType) {
			
		}
		
		public Query add(Restriction r) {
			return this;
		}
		
	}
	
	public static Contains Contains(Class<? extends ASTNode> type) {
		return new Contains(type);
	}
	
	public static Or Or(Restriction... r) {
		return new Or(r);
	}
	
		
	public static Parameter Parameter() {
		return new Parameter();
	}
	
	static class Restriction {
		
		public Restriction propertyEQ(String key, String value) {
			return this;
		}
		
		public Restriction named(String name) {
			return this;
		}
		
		public Restriction add(Restriction r) {
			return this;
		}
		
	}
	
	static class Contains extends Restriction {
		
		public Contains(Class<? extends ASTNode> type) {
			
		}
		
	}
	
	static class Uses extends Restriction {
		
	}
	
	static class Parameter extends Restriction {
		
	}
	
	static class And extends Restriction {
		
	}
	
	static class Or extends Restriction {
		
		public Or(Restriction... r) {
			
		}
		
	}
	
	static final Class<ASTModuleNode> MODULE = ASTModuleNode.class;
	static final Class<ASTSubroutineSubprogramNode> SUBROUTINE = ASTSubroutineSubprogramNode.class;
	static final Class<ASTSubroutineParNode> SPARAM = ASTSubroutineParNode.class;
	
	static final String NAME = "NAME";
	
	static void test() {
		//Module().uses("NUOPC_Driver")
		//	.contains(Subroutine().named("Blag")).findAll();
		
		/*
		 * CREATE OR REPLACE VIEW esmf_setservices AS
SELECT s.id, s.parent_id as mod_id, s.name, p1.name as param_gcomp, p2.name as param_rc
FROM subroutine s
INNER JOIN param p1 ON p1.parent_id = s.id 
	and p1.index = 1
	and p1.type = 'type(esmf_gridcomp)'
INNER JOIN param p2 ON p2.parent_id = s.id 
	and p2.index = 2
	and p2.type = 'integer'
	and p2.intentIn = 0
	and p2.intentOut = 1
WHERE s.name = 'SetServices' 
	OR EXISTS 
		(SELECT * from call_ c WHERE c.parent_id = s.id and c.name='NUOPC_CompDerive');
		 */
		
		Query(MODULE)
			.add( Contains(SUBROUTINE).propertyEQ(NAME, "SetServices") )
			.add( Or(Contains(SUBROUTINE).propertyEQ(NAME, "Fish")));
	
	}
	
}
