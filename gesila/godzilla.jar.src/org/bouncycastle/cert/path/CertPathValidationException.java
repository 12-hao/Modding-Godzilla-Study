package org.bouncycastle.cert.path;

public class CertPathValidationException extends Exception {
  private final Exception cause;
  
  public CertPathValidationException(String paramString) {
    this(paramString, null);
  }
  
  public CertPathValidationException(String paramString, Exception paramException) {
    super(paramString);
    this.cause = paramException;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/cert/path/CertPathValidationException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */