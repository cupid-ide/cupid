package org.earthsystemmodeling.cupid.nuopc_v7

import org.earthsystemmodeling.cupid.nuopc_v7.CodeConcept
import org.eclipse.photran.internal.core.parser.IASTNode
import org.earthsystemmodeling.cupid.annotation.Name
import static org.earthsystemmodeling.cupid.nuopc_v7.BasicCodeConcept.newBasicCodeConcept
import java.sql.SQLException
import static org.earthsystemmodeling.cupid.core.CupidActivator.log
import org.eclipse.photran.internal.core.parser.ASTSubroutineSubprogramNode
import org.earthsystemmodeling.cupid.annotation.Label
import org.earthsystemmodeling.cupid.annotation.Child

@Label(label="SetServices", type="subroutine")
public class SetServicesCodeConcept<P extends CodeConcept<?, ?>> extends CodeConcept<P, ASTSubroutineSubprogramNode> {

	@Name
	var public String subroutineName

	@Label(label="NUOPC_CompDerive", type="call")
	@Child
	var public BasicCodeConcept callsCompDeriveID

	new(P parent) {
		super(parent)
	}

	override SetServicesCodeConcept<P> reverse() {

		var rs = '''esmf_setservices(_sid, «parentID», _sname), 
					( call_(_cid, _sid, 'NUOPC_CompDerive') ; true).'''.execQuery

		try {
			if (rs.next) {
				_id = rs.getLong("_sid")
				subroutineName = rs.getString("_sname")
				callsCompDeriveID = newBasicCodeConcept(this, rs.getLong("_cid"))
				rs.close
				return this
			}
		} catch (SQLException e) {
			log("SQL error", e);
		}

		null

	}

	override forward() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}
