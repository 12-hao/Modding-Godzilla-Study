package org.bouncycastle.util.test;

public interface TestResult {
  boolean isSuccessful();
  
  Throwable getException();
  
  String toString();
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/util/test/TestResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */