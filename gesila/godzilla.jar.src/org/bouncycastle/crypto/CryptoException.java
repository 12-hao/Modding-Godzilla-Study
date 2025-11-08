package org.bouncycastle.crypto;

public class CryptoException extends Exception {
  private Throwable cause;
  
  public CryptoException() {}
  
  public CryptoException(String paramString) {
    super(paramString);
  }
  
  public CryptoException(String paramString, Throwable paramThrowable) {
    super(paramString);
    this.cause = paramThrowable;
  }
  
  public Throwable getCause() {
    return this.cause;
  }
}


/* Location:              /Users/h12/Documents/网安工具/gesila/godzilla.jar!/org/bouncycastle/crypto/CryptoException.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */