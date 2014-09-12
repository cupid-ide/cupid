package alice.tuprologx.runtime.corba;

public final class SolveInfo implements org.omg.CORBA.portable.IDLEntity
{
  public boolean success = false;
  public String solution = null;
  public boolean halt = false;
  public int haltCode = (int)0;

  public SolveInfo ()
  {
  } // ctor

  public SolveInfo (boolean _success, String _solution, boolean _halt, int _haltCode)
  {
    success = _success;
    solution = _solution;
    halt = _halt;
    haltCode = _haltCode;
  } // ctor

} // class SolveInfo
