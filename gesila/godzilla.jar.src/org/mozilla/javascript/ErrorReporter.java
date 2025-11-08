package org.mozilla.javascript;

public interface ErrorReporter {
  void warning(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2);
  
  void error(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2);
  
  EvaluatorException runtimeError(String paramString1, String paramString2, int paramInt1, String paramString3, int paramInt2);
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/mozilla/javascript/ErrorReporter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */