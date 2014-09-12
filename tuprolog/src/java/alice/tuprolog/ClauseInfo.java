/*
 * tuProlog - Copyright (C) 2001-2002  aliCE team at deis.unibo.it
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package alice.tuprolog;
import java.util.*;

/**
 * This class mantains information about a clause creation
 * (clause copy, final time T after renaming, validity stillValid Flag).
 * These information are necessary to the Theory Manager
 * to use the clause in a consistent way
 *
 */
public interface ClauseInfo 
{	
	
	//usata da Find
	/**
	 * building a valid clause with a time stamp = original time stamp + NumVar in clause
	 */
/*	ClauseInfo(Struct clause_, String lib) 
	{
		clause = clause_;
		head = extractHead(clause);
		body = extractBody(clause.getArg(1));
		libName = lib;
	} */
	
	String getLibName();
	Struct getClause();
	Struct getHead();
	SubGoalTree getBody();  
	Struct getHeadCopy();
	SubGoalTree getBodyCopy();
	void performCopy(int idExecCtx);
}