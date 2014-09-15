package org.earthsystemmodeling.cupid.codedb;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import alice.tuprolog.ClauseInfo;
import alice.tuprolog.InvalidTermException;
import alice.tuprolog.InvalidTheoryException;
import alice.tuprolog.MalformedGoalException;
import alice.tuprolog.NoMoreSolutionException;
import alice.tuprolog.NoSolutionException;
import alice.tuprolog.Prolog;
import alice.tuprolog.SolveInfo;
import alice.tuprolog.Struct;
import alice.tuprolog.Term;
import alice.tuprolog.Theory;
import alice.tuprolog.Var;

public class CodeDBTuPrologTest {

	public static void main(String[] args) throws InvalidTheoryException, MalformedGoalException, NoSolutionException, NoMoreSolutionException, IOException, InvalidTermException {
		
		//System.out.print("Press any key to go: ");
		//InputStreamReader readIn = new InputStreamReader(System.in);
		//readIn.read();
		
		Prolog prolog = new Prolog();
		
		//StringBuilder theoryBuilder = new StringBuilder();
		//theoryBuilder.append("module(modA).\n");
		//theoryBuilder.append("module(modB).\n");
		//Theory theory = new Theory(theoryBuilder.toString());		
		
		ArrayList<Struct> clauseList = new ArrayList<Struct>();
		
		for (int modi = 0; modi < 100; modi++) {
			
			//add the module
			//Term modt = new Struct("mod" + modi);
			Term modt = Term.createTerm("'mod" + modi + "'");
			Struct mods = new Struct("module", modt);
			clauseList.add(mods);
		
			for (int subi = 0; subi < 50; subi++) {
				
				//add the subroutines
				Term subt = new Struct("subroutine_mod"+modi+"_"+subi);
				Struct subs = new Struct("subroutine", modt, subt);
				clauseList.add(subs);
			
				//args
				for (int argi = 0; argi < 5; argi++) {
					Term argt = new Struct("arg_mod"+modi+"_sub"+subi+"_"+argi);
					Struct argst = new Struct("arg", subt, argt);
					clauseList.add(argst);
				}
				
				//calls
				if (subi % 10 == 0) {
					for (int argi = 0; argi < 1; argi++) {
						Struct calls = new Struct("call", subt, Term.createTerm("NUOPC_DeriveComp"));
						clauseList.add(calls);
					}
				}
				
			}
		}
		
		System.out.println("Size of clause list = " + clauseList.size());
		
		//Struct s1 = new Struct("module", new Struct("modA"));
		//Struct s2 = new Struct("module", new Struct("modB"));
		//Struct s3 = new Struct("module", new Struct("modC"));
		
		//ArrayList<Term> clauseList = new ArrayList<Term>();
		//clauseList.add(s1);
		//clauseList.add(s2);
		//clauseList.add(s3);
		
		//Struct structList = new Struct(clauseList.toArray(new Term[]{}));
		
		Theory theory = new Theory(new Struct(new Struct("startme"), new Struct()));
		//System.out.println("Struct to add: " + ss);
		
		prolog.setTheory(theory);
		
		//for (Struct s : clauseList) {
		//	Struct ss = new Struct(s, new Struct());
		//	//System.out.println("Struct to add: " + ss);
		//	theory.append(new Theory(ss));
		//}
		
		long startSetTheory = System.currentTimeMillis();
		//prolog.setTheory(theory);
		
		//List<Struct> buffer = new ArrayList<Struct>(100);
		
		Struct lastS = null;
		
		int i = 0;
		for (Struct s : clauseList) {
		
			lastS = new Struct(s, new Struct());
			//buffer approach
			theory.append(new Theory(lastS));
			
			if (i % 6000 == 0 || i == clauseList.size()-1) {
				prolog.addTheory(theory);
				theory = new Theory(new Struct(new Struct("startme"), new Struct()));
			}
			
			i++;
		}
		long stopSetTheory = System.currentTimeMillis();
		
		//Term subt = new Struct("subroutine_mod1_1");
		//Term argt = new Struct("arg_mod1_sub1_1");
		//Struct argst = new Struct("arg", subt, argt);
		//ClauseInfo ci = prolog.getTheoryManager().retract(lastS);
		//System.out.println("Retract clause info: " + ci);
		
		//add rules
		prolog.addTheory(new Theory("nuopc_module(M) :- module(M), subroutine(M, S), call(S, NUOPC_CompDerive)."));
		
		
		String query = "nuopc_module(M).";
		
		long startSolve = System.currentTimeMillis();
		SolveInfo sol = prolog.solve(query);
		long stopSolve = System.currentTimeMillis();
		
		//Term termM = sol.getVarValue("M");
		//Term termA = sol.getVarValue("A");
		
		System.out.println("First soln: " + sol);
		
		
		int numSolutions = 1;
		while (prolog.hasOpenAlternatives()) {
			sol = prolog.solveNext();
			numSolutions++;
			//termM = sol.getVarValue("M");
			//termS = sol.getVarValue("S");
			//System.out.println("M = " + termM + ", S = " + termS);
		} 
		
		System.out.println("Total num solutions = " + numSolutions);
		System.out.println("Theory time (ms) = " + (stopSetTheory - startSetTheory));
		System.out.println("Solve time (ms) = " + (stopSolve - startSolve));		
		
	}

}
