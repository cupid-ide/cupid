package alice.tuprologx.runtime.corba;


public final class SolveInfoHolder implements org.omg.CORBA.portable.Streamable
{
  public alice.tuprologx.runtime.corba.SolveInfo value = null;

  public SolveInfoHolder ()
  {
  }

  public SolveInfoHolder (alice.tuprologx.runtime.corba.SolveInfo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = alice.tuprologx.runtime.corba.SolveInfoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    alice.tuprologx.runtime.corba.SolveInfoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return alice.tuprologx.runtime.corba.SolveInfoHelper.type ();
  }

}
