package alice.tuprologx.runtime.corba;

public interface PrologOperations
{
  void clearTheory ();
  String getTheory ();
  void setTheory (String theory);
  alice.tuprologx.runtime.corba.SolveInfo solve (String g);
  boolean hasOpenAlternatives ();
  alice.tuprologx.runtime.corba.SolveInfo solveNext ();
  void solveHalt ();
  void solveEnd ();
  void loadLibrary (String className);
  void unloadLibrary (String className);
} // interface PrologOperations
