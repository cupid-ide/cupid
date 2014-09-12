package alice.tuprologx;

import java.util.Arrays;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;

public class TuScriptEngineFactory implements ScriptEngineFactory
{
	public String getEngineName()
	{
		return "tuprolog";
	}

	public String getEngineVersion()
	{
		return "1.0";
	}

	public List<String> getExtensions()
	{		
		return Arrays.asList("pro", "pl");
	}

	public String getLanguageName()
	{
		return "Prolog";
	}
	
	public String getLanguageVersion()
	{
		return "1.0";
	}

	public String getMethodCallSyntax(String obj, String m, String... args)
	{
		StringBuilder sb = new StringBuilder(obj);
		sb.append(" <- ");
		sb.append(m);
		sb.append("(");
		if (args != null) for (int i = 0; i < args.length; i++)
			{ sb.append(args[i]); if (i < args.length - 1) sb.append(","); }
		sb.append(")");
		return sb.toString();
	}
	
	public List<String> getMimeTypes()
	{
		return Arrays.asList();
	}

	public List<String> getNames()
	{
		return Arrays.asList("prolog", "tuprolog", "TuProlog", "Tuprolog");
	}

	public String getOutputStatement(String toDisplay)
	{
		return "write('" + toDisplay + "')";
	}

	public Object getParameter(String key)
	{
		if (key.equals(ScriptEngine.ENGINE))
		{
			return getEngineName();
		} 
		else if (key.equals(ScriptEngine.ENGINE_VERSION))
		{
			return getEngineVersion();
		} 
		else if (key.equals(ScriptEngine.NAME))
		{
			return getEngineName();
		} 
		else if (key.equals(ScriptEngine.LANGUAGE))
		{
			return getLanguageName();
		} 
		else if (key.equals(ScriptEngine.LANGUAGE_VERSION))
		{
			return getLanguageVersion();
		} 
		else if (key.equals("THREADING"))
		{
			return "MULTITHREADED";
		} 
		else
		{
			return null;
		}
	}

	public String getProgram(String... statements)
	{
		StringBuilder buf = new StringBuilder(":-");
		for (int i = 0; i < statements.length; i++)
		{
			buf.append(statements[i]);
			buf.append(",");
		}
		buf.append(".");
		return buf.toString();
	}

	public ScriptEngine getScriptEngine()
	{
		return new TuScriptEngine();
	}
}