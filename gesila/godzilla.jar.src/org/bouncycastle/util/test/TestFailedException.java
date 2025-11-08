package org.bouncycastle.util.test;

public class TestFailedException extends RuntimeException {
  private TestResult _result;
  
  public TestFailedException(TestResult paramTestResult) {
    this._result = paramTestResult;
  }
  
  public TestResult getResult() {
    return this._result;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/util/test/TestFailedException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */