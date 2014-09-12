package alice.tuprologx.runtime.corba;


public final class PrologHolder implements org.omg.CORBA.portable.Streamable
{
  public alice.tuprologx.runtime.corba.Prolog value = null;

  public PrologHolder ()
  {
  }

  public PrologHolder (alice.tuprologx.runtime.corba.Prolog initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = alice.tuprologx.runtime.corba.PrologHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    alice.tuprologx.runtime.corba.PrologHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return alice.tuprologx.runtime.corba.PrologHelper.type ();
  }

}
