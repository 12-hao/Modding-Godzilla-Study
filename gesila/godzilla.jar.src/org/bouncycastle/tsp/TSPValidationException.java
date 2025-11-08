package org.bouncycastle.tsp;

public class TSPValidationException extends TSPException {
  private int failureCode = -1;
  
  public TSPValidationException(String paramString) {
    super(paramString);
  }
  
  public TSPValidationException(String paramString, int paramInt) {
    super(paramString);
    this.failureCode = paramInt;
  }
  
  public int getFailureCode() {
    return this.failureCode;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/tsp/TSPValidationException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */