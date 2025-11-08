package org.bouncycastle.cert.ocsp;

public class OCSPException extends Exception {
  private Throwable cause;
  
  public OCSPException(String paramString) {
    super(paramString);
  }
  
  public OCSPException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/cert/ocsp/OCSPException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */