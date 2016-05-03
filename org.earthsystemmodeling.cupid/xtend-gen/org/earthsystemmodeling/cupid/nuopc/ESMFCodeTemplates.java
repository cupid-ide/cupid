package org.earthsystemmodeling.cupid.nuopc;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ESMFCodeTemplates {
  public static CharSequence ESMFErrorCheck(final String rcToCheck) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (ESMF_LogFoundError(rcToCheck=");
    _builder.append(rcToCheck, "");
    _builder.append(", msg=ESMF_LOGERR_PASSTHRU, &");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("line=__LINE__, &");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("file=__FILE__)) &");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return  ! bail out");
    _builder.newLine();
    return _builder;
  }
}
