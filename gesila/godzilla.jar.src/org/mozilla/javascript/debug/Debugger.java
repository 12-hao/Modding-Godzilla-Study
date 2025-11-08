package org.mozilla.javascript.debug;

import org.mozilla.javascript.Context;

public interface Debugger {
  void handleCompilationDone(Context paramContext, DebuggableScript paramDebuggableScript, String paramString);
  
  DebugFrame getFrame(Context paramContext, DebuggableScript paramDebuggableScript);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/mozilla/javascript/debug/Debugger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */