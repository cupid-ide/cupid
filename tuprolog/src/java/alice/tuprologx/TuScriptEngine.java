package alice.tuprologx;

import java.io.Reader;


import javax.script.AbstractScriptEngine;
import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

import alice.tuprolog.Prolog;
import alice.tuprolog.Theory;
import alice.tuprolog.event.OutputEvent;
import alice.tuprolog.event.OutputListener;

public class TuScriptEngine extends AbstractScriptEngine
{
	private Prolog prolog = new Prolog();
	
	public TuScriptEngine()
	{
		prolog.addOutputListener(new OutputListener() {
			public void onOutput(OutputEvent e)
			{
				System.out.print(e.getMsg());
			}
		} );
	}
	
	public Bindings createBindings()
	{
		return new SimpleBindings();
	}

	public Object eval(Reader reader, ScriptContext context) throws ScriptException
	{
		StringBuilder sb = new StringBuilder();
		char [] buf = new char[1024];
		try
		{
			for (int read = reader.read(buf); read > -1; read = reader.read(buf))
				sb.append(buf, 0, read);
		}
		catch (Exception ex)
		{
			throw new RuntimeException(ex);
		}
		return eval(sb.toString(), context);
	}

	public Object eval(String script, ScriptContext context) throws ScriptException
	{
		try
		{
			script = script.trim();
			if (script.endsWith("?"))
				return new SolutionNavigator(prolog.solve(script.substring(0, script.length() - 1) + "."), prolog);
			else if (script.endsWith("."))
			{
				Theory t = new Theory(script);
				prolog.addTheory(t);
				return "ok"; 
				//return prolog.solve("assert(" + script.substring(0, script.length()-1) + ").");
			}
			else
				return new Exception("Please end Prolog code with ? (for a query) or . (for an assertion)");
		}
		catch (Exception ex)
		{
			return ex;
		}
	}

	public ScriptEngineFactory getFactory()
	{
		return new TuScriptEngineFactory();
	}	
}